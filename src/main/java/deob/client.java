package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.o")
    public static boolean field471 = true;

    @ObfuscatedName("client.h")
    public static int field718 = 1;

    @ObfuscatedName("client.a")
    public static int field474 = 0;

    @ObfuscatedName("client.n")
    public static boolean field477 = false;

    @ObfuscatedName("client.i")
    public static boolean field478 = false;

    @ObfuscatedName("client.c")
    public static int field712 = 0;

    @ObfuscatedName("client.m")
    public static int field480 = 0;

    @ObfuscatedName("client.g")
    public static boolean field481 = true;

    @ObfuscatedName("client.r")
    public static int field699 = 0;

    @ObfuscatedName("client.s")
    public static long field722 = 1L;

    @ObfuscatedName("client.k")
    public static int field490 = -1;

    @ObfuscatedName("client.w")
    public static class130[] field506 = new class130[4];

    @ObfuscatedName("client.z")
    public static int field558 = -1;

    @ObfuscatedName("client.p")
    public static int field658 = -1;

    @ObfuscatedName("client.v")
    public static boolean field487 = true;

    @ObfuscatedName("client.d")
    public static boolean field585 = false;

    @ObfuscatedName("client.e")
    public static int field737 = 0;

    @ObfuscatedName("client.aw")
    public static int field536 = 0;

    @ObfuscatedName("client.ai")
    public static int field489 = 0;

    @ObfuscatedName("client.ah")
    public static int field492 = 0;

    @ObfuscatedName("client.ad")
    public static int field493 = 0;

    @ObfuscatedName("client.ak")
    public static int field697 = 0;

    @ObfuscatedName("client.ap")
    public static int field523 = 0;

    @ObfuscatedName("client.al")
    public static int field545 = 0;

    @ObfuscatedName("client.am")
    public static int field497 = 0;

    @ObfuscatedName("client.ab")
    public static class127 field483 = new class127(new byte[5000]);

    @ObfuscatedName("client.at")
    public static int field527 = 0;

    @ObfuscatedName("client.aa")
    public static int field500 = 0;

    @ObfuscatedName("client.au")
    public static int field502 = 0;

    @ObfuscatedName("client.bm")
    public static int field469 = 0;

    @ObfuscatedName("client.bh")
    public static int field504 = 0;

    @ObfuscatedName("client.bu")
    public static int field674 = 0;

    @ObfuscatedName("client.bx")
    public static int field505 = 0;

    @ObfuscatedName("client.bv")
    public static int field507 = 0;

    @ObfuscatedName("client.bj")
    public static class25[] field509 = new class25[32768];

    @ObfuscatedName("client.bc")
    public static int field510 = 0;

    @ObfuscatedName("client.bn")
    public static int[] field499 = new int[32768];

    @ObfuscatedName("client.cq")
    public static class116 field591 = new class116(5000);

    @ObfuscatedName("client.cl")
    public static class116 field522 = new class116(5000);

    @ObfuscatedName("client.ce")
    public static class116 field604 = new class116(5000);

    @ObfuscatedName("client.cd")
    public static int field654 = 0;

    @ObfuscatedName("client.cc")
    public static int field479 = 0;

    @ObfuscatedName("client.cr")
    public static int field633 = 0;

    @ObfuscatedName("client.ci")
    public static int field595 = 0;

    @ObfuscatedName("client.cu")
    public static int field519 = 0;

    @ObfuscatedName("client.ca")
    public static int field520 = 0;

    @ObfuscatedName("client.cf")
    public static int field521 = 0;

    @ObfuscatedName("client.co")
    public static int field563 = 0;

    @ObfuscatedName("client.cg")
    public static boolean field528 = false;

    @ObfuscatedName("client.cy")
    public static int field525 = 0;

    @ObfuscatedName("client.ch")
    public static int field482 = 0;

    @ObfuscatedName("client.cm")
    public static int field472 = 1;

    @ObfuscatedName("client.cz")
    public static int field485 = 0;

    @ObfuscatedName("client.cj")
    public static int field529 = 1;

    @ObfuscatedName("client.dp")
    public static int field530 = 0;

    @ObfuscatedName("client.dx")
    public static boolean field532 = false;

    @ObfuscatedName("client.dk")
    public static int[][][] field533 = new int[4][13][13];

    @ObfuscatedName("client.dn")
    public static final int[] field534 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dy")
    public static int field549 = 0;

    @ObfuscatedName("client.di")
    public static int field568 = 2;

    @ObfuscatedName("client.de")
    public static int field733 = 0;

    @ObfuscatedName("client.db")
    public static int field538 = 2;

    @ObfuscatedName("client.dl")
    public static int field539 = 0;

    @ObfuscatedName("client.dw")
    public static int field540 = 1;

    @ObfuscatedName("client.da")
    public static int field541 = 0;

    @ObfuscatedName("client.dh")
    public static int field542 = 0;

    @ObfuscatedName("client.dc")
    public static int field543 = 2;

    @ObfuscatedName("client.dq")
    public static int field559 = 0;

    @ObfuscatedName("client.dm")
    public static int field660 = 1;

    @ObfuscatedName("client.dz")
    public static int field546 = 0;

    @ObfuscatedName("client.du")
    public static int field547 = 0;

    @ObfuscatedName("client.eh")
    public static int field518 = 2301979;

    @ObfuscatedName("client.eg")
    public static int field550 = 5063219;

    @ObfuscatedName("client.eq")
    public static int field551 = 3353893;

    @ObfuscatedName("client.es")
    public static int field552 = 7759444;

    @ObfuscatedName("client.ew")
    public static boolean field553 = false;

    @ObfuscatedName("client.ej")
    public static int field554 = 0;

    @ObfuscatedName("client.fj")
    public static int field723 = 128;

    @ObfuscatedName("client.fw")
    public static int field556 = 0;

    @ObfuscatedName("client.fm")
    public static int field557 = 0;

    @ObfuscatedName("client.fk")
    public static int field653 = 0;

    @ObfuscatedName("client.fl")
    public static int field513 = 0;

    @ObfuscatedName("client.fn")
    public static int field560 = 0;

    @ObfuscatedName("client.ft")
    public static int field555 = 0;

    @ObfuscatedName("client.fg")
    public static boolean field562 = false;

    @ObfuscatedName("client.fx")
    public static int field484 = 0;

    @ObfuscatedName("client.fy")
    public static int field564 = 0;

    @ObfuscatedName("client.fq")
    public static int field565 = 50;

    @ObfuscatedName("client.fb")
    public static int[] field566 = new int[field565];

    @ObfuscatedName("client.fa")
    public static int[] field639 = new int[field565];

    @ObfuscatedName("client.fu")
    public static int[] field594 = new int[field565];

    @ObfuscatedName("client.fv")
    public static int[] field569 = new int[field565];

    @ObfuscatedName("client.fs")
    public static int[] field570 = new int[field565];

    @ObfuscatedName("client.fd")
    public static int[] field571 = new int[field565];

    @ObfuscatedName("client.fz")
    public static int[] field572 = new int[field565];

    @ObfuscatedName("client.ff")
    public static String[] field573 = new String[field565];

    @ObfuscatedName("client.fp")
    public static int[][] field574 = new int[104][104];

    @ObfuscatedName("client.fr")
    public static int field719 = 0;

    @ObfuscatedName("client.gp")
    public static int field576 = -1;

    @ObfuscatedName("client.gf")
    public static int field508 = -1;

    @ObfuscatedName("client.gt")
    public static int field578 = 0;

    @ObfuscatedName("client.gk")
    public static int field717 = 0;

    @ObfuscatedName("client.ga")
    public static int field580 = 0;

    @ObfuscatedName("client.gh")
    public static int field581 = 0;

    @ObfuscatedName("client.gl")
    public static int field582 = 0;

    @ObfuscatedName("client.gj")
    public static int field583 = 0;

    @ObfuscatedName("client.gg")
    public static int field584 = 0;

    @ObfuscatedName("client.gx")
    public static int field708 = 0;

    @ObfuscatedName("client.go")
    public static int field586 = 0;

    @ObfuscatedName("client.ge")
    public static int field587 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field588 = false;

    @ObfuscatedName("client.gd")
    public static int field589 = 0;

    @ObfuscatedName("client.gs")
    public static int field590 = 0;

    @ObfuscatedName("client.gi")
    public static class3[] field592 = new class3[2048];

    @ObfuscatedName("client.gv")
    public static int field701 = 0;

    @ObfuscatedName("client.gb")
    public static int[] field626 = new int[2048];

    @ObfuscatedName("client.gc")
    public static int field646 = 0;

    @ObfuscatedName("client.gn")
    public static int[] field567 = new int[2048];

    @ObfuscatedName("client.gu")
    public static class127[] field597 = new class127[2048];

    @ObfuscatedName("client.ho")
    public static int field598 = -1;

    @ObfuscatedName("client.hp")
    public static int field599 = 0;

    @ObfuscatedName("client.hg")
    public static int field600 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field601 = new int[1000];

    @ObfuscatedName("client.hb")
    public static final int[] field602 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hd")
    public static String[] field603 = new String[8];

    @ObfuscatedName("client.hu")
    public static boolean[] field693 = new boolean[8];

    @ObfuscatedName("client.hy")
    public static int[] field605 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static class177[][][] field606 = new class177[4][104][104];

    @ObfuscatedName("client.hq")
    public static class177 field486 = new class177();

    @ObfuscatedName("client.hs")
    public static class177 field608 = new class177();

    @ObfuscatedName("client.hx")
    public static class177 field609 = new class177();

    @ObfuscatedName("client.hi")
    public static int[] field610 = new int[25];

    @ObfuscatedName("client.ha")
    public static int[] field611 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field612 = new int[25];

    @ObfuscatedName("client.hl")
    public static int field613 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field614 = false;

    @ObfuscatedName("client.hm")
    public static int field535 = 0;

    @ObfuscatedName("client.id")
    public static int[] field616 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field617 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field618 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field619 = new int[500];

    @ObfuscatedName("client.iw")
    public static String[] field620 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field561 = new String[500];

    @ObfuscatedName("client.ii")
    public static int field622 = -1;

    @ObfuscatedName("client.ir")
    public static int field623 = -1;

    @ObfuscatedName("client.io")
    public static int field625 = 0;

    @ObfuscatedName("client.iv")
    public static int field644 = 50;

    @ObfuscatedName("client.ig")
    public static int field627 = 0;

    @ObfuscatedName("client.ik")
    public static String field628 = null;

    @ObfuscatedName("client.is")
    public static boolean field629 = false;

    @ObfuscatedName("client.ij")
    public static int field630 = -1;

    @ObfuscatedName("client.ic")
    public static String field631 = null;

    @ObfuscatedName("client.ip")
    public static String field632 = null;

    @ObfuscatedName("client.it")
    public static int field516 = -1;

    @ObfuscatedName("client.iu")
    public static class175 field634 = new class175(8);

    @ObfuscatedName("client.iq")
    public static int field635 = 0;

    @ObfuscatedName("client.jz")
    public static int field593 = 0;

    @ObfuscatedName("client.jv")
    public static class159 field637 = null;

    @ObfuscatedName("client.jc")
    public static int field488 = 0;

    @ObfuscatedName("client.jb")
    public static int field511 = 0;

    @ObfuscatedName("client.ju")
    public static int field636 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field641 = false;

    @ObfuscatedName("client.jw")
    public static boolean field642 = false;

    @ObfuscatedName("client.jk")
    public static boolean field526 = false;

    @ObfuscatedName("client.js")
    public static class159 field498 = null;

    @ObfuscatedName("client.jm")
    public static class159 field645 = null;

    @ObfuscatedName("client.jj")
    public static int field710 = 0;

    @ObfuscatedName("client.jl")
    public static int field647 = 0;

    @ObfuscatedName("client.jd")
    public static class159 field648 = null;

    @ObfuscatedName("client.jq")
    public static boolean field649 = false;

    @ObfuscatedName("client.je")
    public static int field650 = -1;

    @ObfuscatedName("client.jy")
    public static int field651 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field671 = false;

    @ObfuscatedName("client.jx")
    public static int field579 = -1;

    @ObfuscatedName("client.ji")
    public static int field615 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field655 = false;

    @ObfuscatedName("client.jg")
    public static int field656 = 1;

    @ObfuscatedName("client.kr")
    public static int[] field657 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field537 = 0;

    @ObfuscatedName("client.km")
    public static int[] field503 = new int[32];

    @ObfuscatedName("client.kk")
    public static int field694 = 0;

    @ObfuscatedName("client.kg")
    public static int[] field661 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field662 = 0;

    @ObfuscatedName("client.ko")
    public static int field621 = 0;

    @ObfuscatedName("client.kc")
    public static int field664 = 0;

    @ObfuscatedName("client.ki")
    public static int field665 = 0;

    @ObfuscatedName("client.ky")
    public static int field666 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field667 = new int[2000];

    @ObfuscatedName("client.kl")
    public static String[] field724 = new String[1000];

    @ObfuscatedName("client.kp")
    public static int field669 = 0;

    @ObfuscatedName("client.kb")
    public static class177 field670 = new class177();

    @ObfuscatedName("client.ks")
    public static class177 field705 = new class177();

    @ObfuscatedName("client.kj")
    public static class177 field672 = new class177();

    @ObfuscatedName("client.kd")
    public static class175 field673 = new class175(512);

    @ObfuscatedName("client.kz")
    public static int field696 = 0;

    @ObfuscatedName("client.kh")
    public static int field675 = -2;

    @ObfuscatedName("client.kv")
    public static boolean[] field676 = new boolean[100];

    @ObfuscatedName("client.kw")
    public static boolean[] field677 = new boolean[100];

    @ObfuscatedName("client.ka")
    public static boolean[] field678 = new boolean[100];

    @ObfuscatedName("client.kf")
    public static int[] field679 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field680 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field681 = new int[100];

    @ObfuscatedName("client.lq")
    public static int[] field682 = new int[100];

    @ObfuscatedName("client.lv")
    public static int field643 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field684 = new int[100];

    @ObfuscatedName("client.lo")
    public static String[] field685 = new String[100];

    @ObfuscatedName("client.lf")
    public static String[] field575 = new String[100];

    @ObfuscatedName("client.le")
    public static String[] field687 = new String[100];

    @ObfuscatedName("client.lt")
    public static int field688 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field689 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field501 = 0;

    @ObfuscatedName("client.lj")
    public static int field691 = 0;

    @ObfuscatedName("client.lc")
    public static long[] field692 = new long[100];

    @ObfuscatedName("client.li")
    public static int field638 = 0;

    @ObfuscatedName("client.lk")
    public static int field663 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field695 = new int[128];

    @ObfuscatedName("client.lp")
    public static int[] field686 = new int[128];

    @ObfuscatedName("client.la")
    public static long field659 = -1L;

    @ObfuscatedName("client.lx")
    public static String field698 = null;

    @ObfuscatedName("client.lw")
    public static String field690 = null;

    @ObfuscatedName("client.mt")
    public static int field700 = -1;

    @ObfuscatedName("client.mp")
    public static int field683 = 0;

    @ObfuscatedName("client.mw")
    public static int[] field702 = new int[1000];

    @ObfuscatedName("client.mc")
    public static int[] field703 = new int[1000];

    @ObfuscatedName("client.mu")
    public static class86[] field704 = new class86[1000];

    @ObfuscatedName("client.mf")
    public static int field730 = 0;

    @ObfuscatedName("client.mr")
    public static int field706 = 0;

    @ObfuscatedName("client.mx")
    public static int field707 = 0;

    @ObfuscatedName("client.mj")
    public static int field515 = 255;

    @ObfuscatedName("client.mn")
    public static int field709 = -1;

    @ObfuscatedName("client.mh")
    public static boolean field514 = false;

    @ObfuscatedName("client.mo")
    public static int field711 = 127;

    @ObfuscatedName("client.mg")
    public static int field512 = 127;

    @ObfuscatedName("client.nd")
    public static int field713 = 0;

    @ObfuscatedName("client.nl")
    public static int[] field714 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field715 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field716 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field607 = new int[50];

    @ObfuscatedName("client.ne")
    public static class57[] field596 = new class57[50];

    @ObfuscatedName("client.nn")
    public static boolean field544 = false;

    @ObfuscatedName("client.nb")
    public static boolean[] field720 = new boolean[5];

    @ObfuscatedName("client.ni")
    public static int[] field721 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field496 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field577 = new int[5];

    @ObfuscatedName("client.no")
    public static int[] field517 = new int[5];

    @ObfuscatedName("client.nr")
    public static int field725 = 0;

    @ObfuscatedName("client.nm")
    public static int field726 = 0;

    @ObfuscatedName("client.oa")
    public static class23[] field727 = new class23[400];

    @ObfuscatedName("client.oy")
    public static class173 field531 = new class173();

    @ObfuscatedName("client.oi")
    public static int field729 = 0;

    @ObfuscatedName("client.oh")
    public static class11[] field494 = new class11[400];

    @ObfuscatedName("client.og")
    public static class164 field731 = new class164();

    @ObfuscatedName("client.om")
    public static int field732 = -1;

    @ObfuscatedName("client.ox")
    public static int field476 = -1;

    @ObfuscatedName("client.o(B)V")
    public final void method251() {
    }

    public final void init() {
        if (!this.method1424()) {
            return;
        }
        class167[] var1 = class167.method2434();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2779);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2779)) {
                    case 2:
                        field474 = Integer.parseInt(var4);
                        break;
                    case 3:
                        field712 = Integer.parseInt(var4);
                        break;
                    case 4:
                        Statics.field1320 = var4;
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field29)) {
                        }
                        break;
                    case 6:
                        if (var4.equalsIgnoreCase(class2.field29)) {
                            field477 = true;
                        } else {
                            field477 = false;
                        }
                        break;
                    case 7:
                        Statics.field473 = class133.method1875(Integer.parseInt(var4));
                        break;
                    case 8:
                        field718 = Integer.parseInt(var4);
                        break;
                    case 9:
                        class134[] var5 = class134.method140();
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
                            if (var6 == var9.method2372()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field475 = (class134) var10;
                        if (Statics.field475 == class134.field2090) {
                            Statics.field668 = class186.field2855;
                        } else {
                            Statics.field668 = class186.field2854;
                        }
                }
            }
        }
        method2139();
        Statics.field23 = this.getCodeBase().getHost();
        String var11 = Statics.field473.field2076;
        byte var12 = 0;
        try {
            class82.method885("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class80.method1544((String) null, var14);
        }
        Statics.field470 = this;
        this.method1422(765, 503, 32);
    }

    @ObfuscatedName("cm.u(B)V")
    public static final void method2139() {
        class95.field1580 = false;
        field478 = false;
    }

    @ObfuscatedName("client.a(I)V")
    public final void method388() {
        Statics.field1817 = field474 == 0 ? 43594 : field718 + 40000;
        Statics.field1849 = field474 == 0 ? 443 : field718 + 50000;
        Statics.field1272 = Statics.field1817;
        Statics.field1389 = class162.field2728;
        Statics.field2467 = class162.field2726;
        Statics.field2742 = class162.field2727;
        Statics.field753 = class162.field2731;
        class75.method135();
        class75.method827(Statics.field865);
        Canvas var1 = Statics.field865;
        var1.addMouseListener(class77.field1410);
        var1.addMouseMotionListener(class77.field1410);
        var1.addFocusListener(class77.field1410);
        class78 var2;
        try {
            var2 = new class78();
        } catch (Throwable var4) {
            var2 = null;
        }
        Statics.field1672 = var2;
        if (Statics.field1672 != null) {
            Statics.field1672.method1361(Statics.field865);
        }
        Statics.field220 = new class71(255, class82.field1434, class82.field1444, 500000);
        Statics.field219 = class12.method3195();
        if (field474 != 0) {
            field585 = true;
        }
    }

    @ObfuscatedName("client.q(B)V")
    public final void method254() {
        field699++;
        this.method257();
        class158.method1331();
        class139.method3247();
        method137();
        class75 var1 = class75.field1384;
        synchronized (class75.field1384) {
            class75.field1363++;
            class75.field1380 = class75.field1382;
            class75.field1379 = 0;
            if (class75.field1374 >= 0) {
                while (class75.field1388 != class75.field1374) {
                    int var3 = class75.field1375[class75.field1388];
                    class75.field1388 = class75.field1388 + 1 & 0x7F;
                    if (var3 < 0) {
                        class75.field1372[~var3] = false;
                    } else {
                        if (!class75.field1372[var3] && class75.field1379 < class75.field1378.length - 1) {
                            class75.field1378[++class75.field1379 - 1] = var3;
                        }
                        class75.field1372[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class75.field1372[var2] = false;
                }
                class75.field1374 = class75.field1388;
            }
            class75.field1382 = class75.field1381;
        }
        class77 var5 = class77.field1410;
        synchronized (class77.field1410) {
            class77.field1401 = class77.field1398;
            class77.field1402 = class77.field1399;
            class77.field1406 = class77.field1403;
            class77.field1412 = class77.field1396;
            class77.field1409 = class77.field1405;
            class77.field1408 = class77.field1404;
            class77.field1411 = class77.field1407;
            class77.field1396 = 0;
        }
        if (Statics.field1672 != null) {
            int var7 = Statics.field1672.method1365();
            field669 = var7;
        }
        if (field480 == 0) {
            method150();
            Statics.field252.method1352();
            for (int var8 = 0; var8 < 32; var8++) {
                field1337[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field1331[var9] = 0L;
            }
            Statics.field2724 = 0;
        } else if (field480 == 5) {
            class21.method2213(this);
            method150();
            Statics.field252.method1352();
            for (int var10 = 0; var10 < 32; var10++) {
                field1337[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field1331[var11] = 0L;
            }
            Statics.field2724 = 0;
        } else if (field480 == 10) {
            class21.method2213(this);
        } else if (field480 == 20) {
            class21.method2213(this);
            method800();
        } else if (field480 == 25) {
            method557();
        }
        if (field480 == 30) {
            if (field737 > 1) {
                field737--;
            }
            if (field519 > 0) {
                field519--;
            }
            if (field528) {
                field528 = false;
                Statics.method2137();
            } else {
                for (int var12 = 0; var12 < 100 && method2354(); var12++) {
                }
                if (field480 == 30) {
                    class182.method2355(field591, 188);
                    Object var13 = Statics.field931.field250;
                    synchronized (Statics.field931.field250) {
                        if (!field471) {
                            Statics.field931.field259 = 0;
                        } else if (class77.field1412 != 0 || Statics.field931.field259 >= 40) {
                            field591.method2345(75);
                            field591.method2450(0);
                            int var14 = field591.field2035;
                            int var15 = 0;
                            for (int var16 = 0; var16 < Statics.field931.field259 && field591.field2035 - var14 < 240; var16++) {
                                var15++;
                                int var17 = Statics.field931.field249[var16];
                                if (var17 < 0) {
                                    var17 = 0;
                                } else if (var17 > 502) {
                                    var17 = 502;
                                }
                                int var18 = Statics.field931.field248[var16];
                                if (var18 < 0) {
                                    var18 = 0;
                                } else if (var18 > 764) {
                                    var18 = 764;
                                }
                                int var19 = var17 * 765 + var18;
                                if (Statics.field931.field249[var16] == -1 && Statics.field931.field248[var16] == -1) {
                                    var18 = -1;
                                    var17 = -1;
                                    var19 = 524287;
                                }
                                if (field490 != var18 || field558 != var17) {
                                    int var20 = var18 - field490;
                                    field490 = var18;
                                    int var21 = var17 - field558;
                                    field558 = var17;
                                    if (field658 < 8 && var20 >= -32 && var20 <= 31 && var21 >= -32 && var21 <= 31) {
                                        var20 += 32;
                                        var21 += 32;
                                        field591.method2593((field658 << 12) + (var20 << 6) + var21);
                                        field658 = 0;
                                    } else if (field658 < 8) {
                                        field591.method2452((field658 << 19) + 8388608 + var19);
                                        field658 = 0;
                                    } else {
                                        field591.method2453((field658 << 19) + -1073741824 + var19);
                                        field658 = 0;
                                    }
                                } else if (field658 < 2047) {
                                    field658++;
                                }
                            }
                            field591.method2637(field591.field2035 - var14);
                            if (var15 >= Statics.field931.field259) {
                                Statics.field931.field259 = 0;
                            } else {
                                Statics.field931.field259 -= var15;
                                for (int var22 = 0; var22 < Statics.field931.field259; var22++) {
                                    Statics.field931.field248[var22] = Statics.field931.field248[var15 + var22];
                                    Statics.field931.field249[var22] = Statics.field931.field249[var15 + var22];
                                }
                            }
                        }
                    }
                    if (class77.field1412 == 1 || class77.field1412 == 2) {
                        long var24 = (class77.field1411 - field722 * -1L) / 50L;
                        if (var24 > 4095L) {
                            var24 = 4095L;
                        }
                        field722 = class77.field1411 * -1L;
                        int var26 = class77.field1408;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 502) {
                            var26 = 502;
                        }
                        int var27 = class77.field1409;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 764) {
                            var27 = 764;
                        }
                        int var28 = var26 * 765 + var27;
                        byte var29 = 0;
                        if (class77.field1412 == 2) {
                            var29 = 1;
                        }
                        int var30 = (int) var24;
                        field591.method2345(202);
                        field591.method2453((var29 << 19) + (var30 << 20) + var28);
                    }
                    if (class75.field1379 > 0) {
                        field591.method2345(252);
                        field591.method2593(0);
                        int var31 = field591.field2035;
                        long var32 = class121.method2140();
                        for (int var34 = 0; var34 < class75.field1379; var34++) {
                            long var35 = var32 - field659;
                            if (var35 > 16777215L) {
                                var35 = 16777215L;
                            }
                            field659 = var32;
                            field591.method2500((int) var35);
                            field591.method2487(class75.field1378[var34]);
                        }
                        field591.method2538(field591.field2035 - var31);
                    }
                    if (field555 > 0) {
                        field555--;
                    }
                    if (class75.field1372[96] || class75.field1372[97] || class75.field1372[98] || class75.field1372[99]) {
                        field562 = true;
                    }
                    if (field562 && field555 <= 0) {
                        field555 = 20;
                        field562 = false;
                        field591.method2345(154);
                        field591.method2494(field723);
                        field591.method2593(field556);
                    }
                    if (Statics.field21 && !field487) {
                        field487 = true;
                        field591.method2345(123);
                        field591.method2450(1);
                    }
                    if (!Statics.field21 && field487) {
                        field487 = false;
                        field591.method2345(123);
                        field591.method2450(0);
                    }
                    method2319();
                    if (field480 == 30) {
                        method46();
                        method2();
                        field633++;
                        if (field633 > 750) {
                            Statics.method2137();
                        } else {
                            for (int var37 = -1; var37 < field701; var37++) {
                                int var38;
                                if (var37 == -1) {
                                    var38 = 2047;
                                } else {
                                    var38 = field626[var37];
                                }
                                class3 var39 = field592[var38];
                                if (var39 != null) {
                                    method1376(var39, 1);
                                }
                            }
                            for (int var40 = 0; var40 < field510; var40++) {
                                int var41 = field499[var40];
                                class25 var42 = field509[var41];
                                if (var42 != null) {
                                    method1376(var42, var42.field383.field781);
                                }
                            }
                            for (int var43 = -1; var43 < field701; var43++) {
                                int var44;
                                if (var43 == -1) {
                                    var44 = 2047;
                                } else {
                                    var44 = field626[var43];
                                }
                                class3 var45 = field592[var44];
                                if (var45 != null && var45.field426 > 0) {
                                    var45.field426--;
                                    if (var45.field426 == 0) {
                                        var45.field451 = null;
                                    }
                                }
                            }
                            for (int var46 = 0; var46 < field510; var46++) {
                                int var47 = field499[var46];
                                class25 var48 = field509[var47];
                                if (var48 != null && var48.field426 > 0) {
                                    var48.field426--;
                                    if (var48.field426 == 0) {
                                        var48.field451 = null;
                                    }
                                }
                            }
                            field547++;
                            if (field581 != 0) {
                                field580 += 20;
                                if (field580 >= 400) {
                                    field581 = 0;
                                }
                            }
                            if (Statics.field267 != null) {
                                field582++;
                                if (field582 >= 15) {
                                    method148(Statics.field267);
                                    Statics.field267 = null;
                                }
                            }
                            if (Statics.field1662 != null) {
                                method148(Statics.field1662);
                                field589++;
                                if (class77.field1402 > field708 + 5 || class77.field1402 < field708 - 5 || class77.field1406 > field586 + 5 || class77.field1406 < field586 - 5) {
                                    field588 = true;
                                }
                                if (class77.field1401 == 0) {
                                    if (field588 && field589 >= 5) {
                                        if (Statics.field2027 == Statics.field1662 && field587 != field584) {
                                            class159 var49 = Statics.field1662;
                                            byte var50 = 0;
                                            if (field593 == 1 && var49.field2622 == 206) {
                                                var50 = 1;
                                            }
                                            if (var49.field2699[field587] <= 0) {
                                                var50 = 0;
                                            }
                                            if (class163.method2772(method1677(var49))) {
                                                int var51 = field584;
                                                int var52 = field587;
                                                var49.field2699[var52] = var49.field2699[var51];
                                                var49.field2700[var52] = var49.field2700[var51];
                                                var49.field2699[var51] = -1;
                                                var49.field2700[var51] = 0;
                                            } else if (var50 == 1) {
                                                int var53 = field584;
                                                int var54 = field587;
                                                while (var53 != var54) {
                                                    if (var53 > var54) {
                                                        var49.method3155(var53 - 1, var53);
                                                        var53--;
                                                    } else if (var53 < var54) {
                                                        var49.method3155(var53 + 1, var53);
                                                        var53++;
                                                    }
                                                }
                                            } else {
                                                var49.method3155(field587, field584);
                                            }
                                            field591.method2345(189);
                                            field591.method2494(field584);
                                            field591.method2593(field587);
                                            field591.method2502(Statics.field1662.field2619);
                                            field591.method2535(var50);
                                        }
                                    } else if ((field613 == 1 || method171(field535 - 1)) && field535 > 2) {
                                        method2944();
                                    } else if (field535 > 0) {
                                        method2715(field535 - 1);
                                    }
                                    field582 = 10;
                                    class77.field1412 = 0;
                                    Statics.field1662 = null;
                                }
                            }
                            class159 var55 = Statics.field624;
                            class159 var56 = Statics.field1282;
                            Statics.field624 = null;
                            Statics.field1282 = null;
                            field648 = null;
                            field671 = false;
                            field649 = false;
                            field663 = 0;
                            while (true) {
                                class75 var57 = class75.field1384;
                                boolean var58;
                                synchronized (class75.field1384) {
                                    if (class75.field1382 == class75.field1380) {
                                        var58 = false;
                                    } else {
                                        Statics.field2464 = class75.field1357[class75.field1380];
                                        Statics.field331 = class75.field1376[class75.field1380];
                                        class75.field1380 = class75.field1380 + 1 & 0x7F;
                                        var58 = true;
                                    }
                                }
                                if (!var58 || field663 >= 128) {
                                    method1167(field516, 0, 0, 765, 503, 0, 0);
                                    field656++;
                                    while (true) {
                                        class1 var60;
                                        class159 var61;
                                        class159 var62;
                                        do {
                                            var60 = (class1) field705.method3315();
                                            if (var60 == null) {
                                                while (true) {
                                                    class1 var63;
                                                    class159 var64;
                                                    class159 var65;
                                                    do {
                                                        var63 = (class1) field672.method3315();
                                                        if (var63 == null) {
                                                            while (true) {
                                                                class1 var66;
                                                                class159 var67;
                                                                class159 var68;
                                                                do {
                                                                    var66 = (class1) field670.method3315();
                                                                    if (var66 == null) {
                                                                        if (field498 != null) {
                                                                            method214();
                                                                        }
                                                                        if (class95.field1599 != -1) {
                                                                            int var69 = class95.field1599;
                                                                            int var70 = class95.field1600;
                                                                            field591.method2345(13);
                                                                            field591.method2450(5);
                                                                            field591.method2593(Statics.field401 + var69);
                                                                            field591.method2493(Statics.field1268 + var70);
                                                                            field591.method2487(class75.field1372[82] ? (class75.field1372[81] ? 2 : 1) : 0);
                                                                            class95.field1599 = -1;
                                                                            field578 = class77.field1409;
                                                                            field717 = class77.field1408;
                                                                            field581 = 1;
                                                                            field580 = 0;
                                                                            field730 = var69;
                                                                            field706 = var70;
                                                                        }
                                                                        if (Statics.field1662 == null && field498 == null) {
                                                                            int var71 = class77.field1412;
                                                                            if (field614) {
                                                                                if (var71 != 1) {
                                                                                    int var72 = class77.field1402;
                                                                                    int var73 = class77.field1406;
                                                                                    if (var72 < Statics.field75 - 10 || var72 > Statics.field75 + Statics.field132 + 10 || var73 < Statics.field1996 - 10 || var73 > Statics.field51 + Statics.field1996 + 10) {
                                                                                        field614 = false;
                                                                                        method149(Statics.field75, Statics.field1996, Statics.field132, Statics.field51);
                                                                                    }
                                                                                }
                                                                                if (var71 == 1) {
                                                                                    int var74 = Statics.field75;
                                                                                    int var75 = Statics.field1996;
                                                                                    int var76 = Statics.field132;
                                                                                    int var77 = class77.field1409;
                                                                                    int var78 = class77.field1408;
                                                                                    int var79 = -1;
                                                                                    for (int var80 = 0; var80 < field535; var80++) {
                                                                                        int var81 = (field535 - 1 - var80) * 15 + var75 + 31;
                                                                                        if (var77 > var74 && var77 < var74 + var76 && var78 > var81 - 13 && var78 < var81 + 3) {
                                                                                            var79 = var80;
                                                                                        }
                                                                                    }
                                                                                    if (var79 != -1) {
                                                                                        method2715(var79);
                                                                                    }
                                                                                    field614 = false;
                                                                                    method149(Statics.field75, Statics.field1996, Statics.field132, Statics.field51);
                                                                                }
                                                                            } else {
                                                                                label1101: {
                                                                                    if (var71 == 1 && field535 > 0) {
                                                                                        int var82 = field618[field535 - 1];
                                                                                        if (var82 == 39 || var82 == 40 || var82 == 41 || var82 == 42 || var82 == 43 || var82 == 33 || var82 == 34 || var82 == 35 || var82 == 36 || var82 == 37 || var82 == 38 || var82 == 1005) {
                                                                                            label1108: {
                                                                                                int var83 = field616[field535 - 1];
                                                                                                int var84 = field617[field535 - 1];
                                                                                                class159 var85 = Statics.method2760(var84);
                                                                                                int var86 = method1677(var85);
                                                                                                boolean var87 = (var86 >> 28 & 0x1) != 0;
                                                                                                if (!var87) {
                                                                                                    class163 var10000 = (class163) null;
                                                                                                    if (!class163.method2772(method1677(var85))) {
                                                                                                        break label1108;
                                                                                                    }
                                                                                                }
                                                                                                if (Statics.field1662 != null && !field588 && field613 != 1 && !method171(field535 - 1) && field535 > 0) {
                                                                                                    method2715(field535 - 1);
                                                                                                }
                                                                                                field588 = false;
                                                                                                field589 = 0;
                                                                                                if (Statics.field1662 != null) {
                                                                                                    method148(Statics.field1662);
                                                                                                }
                                                                                                Statics.field1662 = Statics.method2760(var84);
                                                                                                field584 = var83;
                                                                                                field708 = class77.field1409;
                                                                                                field586 = class77.field1408;
                                                                                                method148(Statics.field1662);
                                                                                                break label1101;
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    if (var71 == 1 && (field613 == 1 && field535 > 2 || method171(field535 - 1))) {
                                                                                        var71 = 2;
                                                                                    }
                                                                                    if (var71 == 1 && field535 > 0) {
                                                                                        method2715(field535 - 1);
                                                                                    }
                                                                                    if (var71 == 2 && field535 > 0) {
                                                                                        method2944();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        if (Statics.field624 != var55) {
                                                                            if (var55 != null) {
                                                                                method148(var55);
                                                                            }
                                                                            if (Statics.field624 != null) {
                                                                                method148(Statics.field624);
                                                                            }
                                                                        }
                                                                        if (Statics.field1282 != var56 && field644 == field625) {
                                                                            if (var56 != null) {
                                                                                method148(var56);
                                                                            }
                                                                            if (Statics.field1282 != null) {
                                                                                method148(Statics.field1282);
                                                                            }
                                                                        }
                                                                        if (Statics.field1282 == null) {
                                                                            if (field625 > 0) {
                                                                                field625--;
                                                                            }
                                                                        } else if (field625 < field644) {
                                                                            field625++;
                                                                            if (field644 == field625) {
                                                                                method148(Statics.field1282);
                                                                            }
                                                                        }
                                                                        int var88 = field549 + Statics.field428.field418;
                                                                        int var89 = field733 + Statics.field428.field412;
                                                                        if (Statics.field274 - var88 < -500 || Statics.field274 - var88 > 500 || Statics.field1029 - var89 < -500 || Statics.field1029 - var89 > 500) {
                                                                            Statics.field274 = var88;
                                                                            Statics.field1029 = var89;
                                                                        }
                                                                        if (Statics.field274 != var88) {
                                                                            Statics.field274 += (var88 - Statics.field274) / 16;
                                                                        }
                                                                        if (Statics.field1029 != var89) {
                                                                            Statics.field1029 += (var89 - Statics.field1029) / 16;
                                                                        }
                                                                        if (class77.field1401 == 4 && field636 >= 2) {
                                                                            int var90 = class77.field1406 - field560;
                                                                            field653 = var90 * 2;
                                                                            field560 = var90 == -1 || var90 == 1 ? class77.field1406 : (field560 + class77.field1406) / 2;
                                                                            int var91 = field513 - class77.field1402;
                                                                            field557 = var91 * 2;
                                                                            field513 = var91 == -1 || var91 == 1 ? class77.field1402 : (field513 + class77.field1402) / 2;
                                                                        } else {
                                                                            if (class75.field1372[96]) {
                                                                                field557 += (-24 - field557) / 2;
                                                                            } else if (class75.field1372[97]) {
                                                                                field557 += (24 - field557) / 2;
                                                                            } else {
                                                                                field557 /= 2;
                                                                            }
                                                                            if (class75.field1372[98]) {
                                                                                field653 += (12 - field653) / 2;
                                                                            } else if (class75.field1372[99]) {
                                                                                field653 += (-12 - field653) / 2;
                                                                            } else {
                                                                                field653 /= 2;
                                                                            }
                                                                            field560 = class77.field1406;
                                                                            field513 = class77.field1402;
                                                                        }
                                                                        field556 = field557 / 2 + field556 & 0x7FF;
                                                                        field723 += field653 / 2;
                                                                        if (field723 < 128) {
                                                                            field723 = 128;
                                                                        }
                                                                        if (field723 > 383) {
                                                                            field723 = 383;
                                                                        }
                                                                        int var92 = Statics.field274 >> 7;
                                                                        int var93 = Statics.field1029 >> 7;
                                                                        int var94 = method215(Statics.field274, Statics.field1029, Statics.field1807);
                                                                        int var95 = 0;
                                                                        if (var92 > 3 && var93 > 3 && var92 < 100 && var93 < 100) {
                                                                            for (int var96 = var92 - 4; var96 <= var92 + 4; var96++) {
                                                                                for (int var97 = var93 - 4; var97 <= var93 + 4; var97++) {
                                                                                    int var98 = Statics.field1807;
                                                                                    if (var98 < 3 && (class9.field120[1][var96][var97] & 0x2) == 2) {
                                                                                        var98++;
                                                                                    }
                                                                                    int var99 = var94 - class9.field140[var98][var96][var97];
                                                                                    if (var99 > var95) {
                                                                                        var95 = var99;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        int var100 = var95 * 192;
                                                                        if (var100 > 98048) {
                                                                            var100 = 98048;
                                                                        }
                                                                        if (var100 < 32768) {
                                                                            var100 = 32768;
                                                                        }
                                                                        if (var100 > field484) {
                                                                            field484 += (var100 - field484) / 24;
                                                                        } else if (var100 < field484) {
                                                                            field484 += (var100 - field484) / 80;
                                                                        }
                                                                        if (field544) {
                                                                            method1288();
                                                                        }
                                                                        for (int var101 = 0; var101 < 5; var101++) {
                                                                            int var10002 = field517[var101]++;
                                                                        }
                                                                        int var102 = ++class77.field1397 - 1;
                                                                        int var104 = class75.method1322();
                                                                        if (var102 > 15000 && var104 > 15000) {
                                                                            field519 = 250;
                                                                            class77.method2727(14500);
                                                                            field591.method2345(99);
                                                                        }
                                                                        field541++;
                                                                        if (field541 > 500) {
                                                                            field541 = 0;
                                                                            int var105 = (int) (Math.random() * 8.0D);
                                                                            if ((var105 & 0x1) == 1) {
                                                                                field549 += field568;
                                                                            }
                                                                            if ((var105 & 0x2) == 2) {
                                                                                field733 += field538;
                                                                            }
                                                                            if ((var105 & 0x4) == 4) {
                                                                                field539 += field540;
                                                                            }
                                                                        }
                                                                        if (field549 < -50) {
                                                                            field568 = 2;
                                                                        }
                                                                        if (field549 > 50) {
                                                                            field568 = -2;
                                                                        }
                                                                        if (field733 < -55) {
                                                                            field538 = 2;
                                                                        }
                                                                        if (field733 > 55) {
                                                                            field538 = -2;
                                                                        }
                                                                        if (field539 < -40) {
                                                                            field540 = 1;
                                                                        }
                                                                        if (field539 > 40) {
                                                                            field540 = -1;
                                                                        }
                                                                        field546++;
                                                                        if (field546 > 500) {
                                                                            field546 = 0;
                                                                            int var106 = (int) (Math.random() * 8.0D);
                                                                            if ((var106 & 0x1) == 1) {
                                                                                field542 += field543;
                                                                            }
                                                                            if ((var106 & 0x2) == 2) {
                                                                                field559 += field660;
                                                                            }
                                                                        }
                                                                        if (field542 < -60) {
                                                                            field543 = 2;
                                                                        }
                                                                        if (field542 > 60) {
                                                                            field543 = -2;
                                                                        }
                                                                        if (field559 < -20) {
                                                                            field660 = 1;
                                                                        }
                                                                        if (field559 > 10) {
                                                                            field660 = -1;
                                                                        }
                                                                        for (class28 var107 = (class28) field531.method3293(); var107 != null; var107 = (class28) field531.method3285()) {
                                                                            if ((long) var107.field739 < class121.method2140() / 1000L - 5L) {
                                                                                if (var107.field744 > 0) {
                                                                                    method1647(5, "", var107.field740 + class135.field2110);
                                                                                }
                                                                                if (var107.field744 == 0) {
                                                                                    method1647(5, "", var107.field740 + class135.field2235);
                                                                                }
                                                                                var107.method3346();
                                                                            }
                                                                        }
                                                                        field595++;
                                                                        if (field595 > 50) {
                                                                            field591.method2345(90);
                                                                        }
                                                                        try {
                                                                            if (Statics.field56 != null && field591.field2035 > 0) {
                                                                                Statics.field56.method1385(field591.field2037, 0, field591.field2035);
                                                                                field591.field2035 = 0;
                                                                                field595 = 0;
                                                                                return;
                                                                            }
                                                                        } catch (IOException var109) {
                                                                            Statics.method2137();
                                                                        }
                                                                        return;
                                                                    }
                                                                    var67 = var66.field2;
                                                                    if (var67.field2598 < 0) {
                                                                        break;
                                                                    }
                                                                    var68 = Statics.method2760(var67.field2608);
                                                                } while (var68 == null || var68.field2696 == null || var67.field2598 >= var68.field2696.length || var68.field2696[var67.field2598] != var67);
                                                                class26.method1675(var66);
                                                            }
                                                        }
                                                        var64 = var63.field2;
                                                        if (var64.field2598 < 0) {
                                                            break;
                                                        }
                                                        var65 = Statics.method2760(var64.field2608);
                                                    } while (var65 == null || var65.field2696 == null || var64.field2598 >= var65.field2696.length || var65.field2696[var64.field2598] != var64);
                                                    class26.method1675(var63);
                                                }
                                            }
                                            var61 = var60.field2;
                                            if (var61.field2598 < 0) {
                                                break;
                                            }
                                            var62 = Statics.method2760(var61.field2608);
                                        } while (var62 == null || var62.field2696 == null || var61.field2598 >= var62.field2696.length || var62.field2696[var61.field2598] != var61);
                                        class26.method1675(var60);
                                    }
                                }
                                field686[field663] = Statics.field2464;
                                field695[field663] = Statics.field331;
                                field663++;
                            }
                        }
                    }
                }
            }
        } else if (field480 == 40) {
            method800();
        }
    }

    @ObfuscatedName("client.t(B)V")
    public final void method447() {
        boolean var1;
        label123: {
            try {
                if (class139.field2347 == 2) {
                    if (Statics.field2350 == null) {
                        Statics.field2350 = class140.method2770(Statics.field2346, Statics.field1997, Statics.field365);
                        if (Statics.field2350 == null) {
                            var1 = false;
                            break label123;
                        }
                    }
                    if (Statics.field1796 == null) {
                        Statics.field1796 = new class58(Statics.field2348, Statics.field2343);
                    }
                    if (Statics.field2345.method2784(Statics.field2350, Statics.field2344, Statics.field1796, 22050)) {
                        Statics.field2345.method2785();
                        Statics.field2345.method2782(Statics.field1266);
                        Statics.field2345.method2827(Statics.field2350, Statics.field2729);
                        class139.field2347 = 0;
                        Statics.field2350 = null;
                        Statics.field1796 = null;
                        Statics.field2346 = null;
                        var1 = true;
                        break label123;
                    }
                }
            } catch (Exception var16) {
                var16.printStackTrace();
                Statics.field2345.method2850();
                class139.field2347 = 0;
                Statics.field2350 = null;
                Statics.field1796 = null;
                Statics.field2346 = null;
            }
            var1 = false;
        }
        if (var1 && field514 && Statics.field256 != null) {
            Statics.field256.method1157();
        }
        if (field1341) {
            class75.method2446(Statics.field865);
            Canvas var4 = Statics.field865;
            var4.removeMouseListener(class77.field1410);
            var4.removeMouseMotionListener(class77.field1410);
            var4.removeFocusListener(class77.field1410);
            class77.field1398 = 0;
            if (Statics.field1672 != null) {
                Statics.field1672.method1362(Statics.field865);
            }
            this.method1476();
            class75.method827(Statics.field865);
            Canvas var5 = Statics.field865;
            var5.addMouseListener(class77.field1410);
            var5.addMouseMotionListener(class77.field1410);
            var5.addFocusListener(class77.field1410);
            if (Statics.field1672 != null) {
                Statics.field1672.method1361(Statics.field865);
            }
        }
        if (field480 == 0) {
            class73.method620(class21.field314, class21.field315, (Color) null);
        } else if (field480 == 5) {
            Statics.method28(Statics.field194, Statics.field2342);
        } else if (field480 == 10) {
            Statics.method28(Statics.field194, Statics.field2342);
        } else if (field480 == 20) {
            Statics.method28(Statics.field194, Statics.field2342);
        } else if (field480 == 25) {
            if (field530 == 1) {
                if (field482 > field472) {
                    field472 = field482;
                }
                int var6 = (field472 * 50 - field482 * 50) / field472;
                method204(class135.field2103 + class2.field18 + class2.field30 + var6 + "%" + class2.field19, false);
            } else if (field530 == 2) {
                if (field485 > field529) {
                    field529 = field485;
                }
                int var7 = (field529 * 50 - field485 * 50) / field529 + 50;
                method204(class135.field2103 + class2.field18 + class2.field30 + var7 + "%" + class2.field19, false);
            } else {
                method204(class135.field2103, false);
            }
        } else if (field480 == 30) {
            method1420();
        } else if (field480 == 40) {
            method204(class135.field2104 + class2.field18 + class135.field2105, false);
        }
        if (field480 == 30 && field643 == 0 && !field1339) {
            try {
                Graphics var8 = Statics.field865.getGraphics();
                for (int var9 = 0; var9 < field696; var9++) {
                    if (field677[var9]) {
                        Statics.field1287.method1603(var8, field679[var9], field680[var9], field681[var9], field682[var9]);
                        field677[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field865.repaint();
            }
        } else if (field480 > 0) {
            try {
                Graphics var11 = Statics.field865.getGraphics();
                Statics.field1287.method1602(var11, 0, 0);
                field1339 = false;
                for (int var12 = 0; var12 < field696; var12++) {
                    field677[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field865.repaint();
            }
        }
    }

    @ObfuscatedName("client.n(B)V")
    public final void method256() {
        if (Statics.field931 != null) {
            Statics.field931.field247 = false;
        }
        Statics.field931 = null;
        if (Statics.field56 != null) {
            Statics.field56.method1381();
            Statics.field56 = null;
        }
        if (class75.field1384 != null) {
            class75 var1 = class75.field1384;
            synchronized (class75.field1384) {
                class75.field1384 = null;
            }
        }
        if (class77.field1410 != null) {
            class77 var3 = class77.field1410;
            synchronized (class77.field1410) {
                class77.field1410 = null;
            }
        }
        Statics.field1672 = null;
        if (Statics.field256 != null) {
            Statics.field256.method1158();
        }
        if (Statics.field1820 != null) {
            Statics.field1820.method1158();
        }
        if (Statics.field2538 != null) {
            Statics.field2538.method1381();
        }
        Object var5 = class158.field2585;
        synchronized (class158.field2585) {
            if (class158.field2582 != 0) {
                class158.field2582 = 1;
                try {
                    class158.field2585.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        class82.method1574();
    }

    @ObfuscatedName("y.i(II)V")
    public static void method217(int arg0) {
        if (field480 == arg0) {
            return;
        }
        if (field480 == 0) {
            Statics.field381 = null;
            Statics.field947 = null;
            Statics.field1969 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field504 = 0;
            field674 = 0;
            field505 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field866 != null) {
            Statics.field866.method1381();
            Statics.field866 = null;
        }
        if (field480 == 25) {
            field530 = 0;
            field482 = 0;
            field472 = 1;
            field485 = 0;
            field529 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method38(Statics.field865, Statics.field262, Statics.field376);
        } else if (Statics.field308) {
            Statics.field306 = null;
            Statics.field300 = null;
            Statics.field298 = null;
            Statics.field302 = null;
            Statics.field303 = null;
            Statics.field330 = null;
            Statics.field2340 = null;
            Statics.field2341 = null;
            Statics.field12 = null;
            Statics.field1275 = null;
            Statics.field364 = null;
            Statics.field915 = null;
            Statics.field311 = null;
            Statics.field1525 = null;
            Statics.field2013 = null;
            Statics.field2353 = null;
            Statics.field2719 = null;
            Statics.field181 = null;
            Statics.field2577 = null;
            Statics.field196 = null;
            class139.method102(2);
            class154.method2136(true);
            Statics.field308 = false;
        }
        field480 = arg0;
    }

    @ObfuscatedName("client.c(I)V")
    public void method257() {
        if (field480 != 1000) {
            boolean var1 = class154.method2932();
            if (!var1) {
                this.method320();
            }
        }
    }

    @ObfuscatedName("client.b(I)V")
    public void method320() {
        if (class154.field2549 >= 4) {
            this.method1434("js5crc");
            field480 = 1000;
            return;
        }
        if (class154.field2550 >= 4) {
            if (field480 <= 5) {
                this.method1434("js5io");
                field480 = 1000;
                return;
            }
            field502 = 3000;
            class154.field2550 = 3;
        }
        if (--field502 + 1 > 0) {
            return;
        }
        try {
            if (field500 == 0) {
                Statics.field1240 = Statics.field896.method1491(Statics.field23, Statics.field1272);
                field500++;
            }
            if (field500 == 1) {
                if (Statics.field1240.field1419 == 2) {
                    this.method386(-1);
                    return;
                }
                if (Statics.field1240.field1419 == 1) {
                    field500++;
                }
            }
            if (field500 == 2) {
                Statics.field379 = new class70((Socket) Statics.field1240.field1416, Statics.field896);
                class127 var1 = new class127(5);
                var1.method2450(15);
                var1.method2453(32);
                Statics.field379.method1385(var1.field2037, 0, 5);
                field500++;
                Statics.field283 = class121.method2140();
            }
            if (field500 == 3) {
                if (field480 <= 5 || Statics.field379.method1384() > 0) {
                    int var2 = Statics.field379.method1383();
                    if (var2 != 0) {
                        this.method386(var2);
                        return;
                    }
                    field500++;
                } else if (class121.method2140() - Statics.field283 > 30000L) {
                    this.method386(-2);
                    return;
                }
            }
            if (field500 == 4) {
                class154.method2393(Statics.field379, field480 > 20);
                Statics.field1240 = null;
                Statics.field379 = null;
                field500 = 0;
                field469 = 0;
            }
        } catch (IOException var4) {
            this.method386(-3);
        }
    }

    @ObfuscatedName("client.m(II)V")
    public void method386(int arg0) {
        Statics.field1240 = null;
        Statics.field379 = null;
        field500 = 0;
        if (Statics.field1817 == Statics.field1272) {
            Statics.field1272 = Statics.field1849;
        } else {
            Statics.field1272 = Statics.field1817;
        }
        field469++;
        if (field469 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field480 <= 5) {
                this.method1434("js5connect_full");
                field480 = 1000;
            } else {
                field502 = 3000;
            }
        } else if (field469 >= 2 && arg0 == 6) {
            this.method1434("js5connect_outofdate");
            field480 = 1000;
        } else if (field469 >= 4) {
            if (field480 <= 5) {
                this.method1434("js5connect");
                field480 = 1000;
            } else {
                field502 = 3000;
            }
        }
    }

    @ObfuscatedName("r.g(I)V")
    public static void method150() {
        if (field527 == 0) {
            Statics.field949 = new class95(4, 104, 104, class9.field140);
            for (int var0 = 0; var0 < 4; var0++) {
                field506[var0] = new class130(104, 104);
            }
            Statics.field1031 = new class86(512, 512);
            class21.field315 = class135.field2106;
            class21.field314 = 5;
            field527 = 20;
        } else if (field527 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1776[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1925(var1, 500, 800, 512, 334);
            class21.field315 = class135.field2107;
            class21.field314 = 10;
            field527 = 30;
        } else if (field527 == 30) {
            Statics.field6 = method2882(0, false, true, true);
            Statics.field1463 = method2882(1, false, true, true);
            Statics.field2053 = method2882(2, true, false, true);
            Statics.field263 = method2882(3, false, true, true);
            Statics.field15 = method2882(4, false, true, true);
            Statics.field2077 = method2882(5, true, true, true);
            Statics.field2449 = method2882(6, true, true, false);
            Statics.field2039 = method2882(7, false, true, true);
            Statics.field376 = method2882(8, false, true, true);
            Statics.field2767 = method2882(9, false, true, true);
            Statics.field262 = method2882(10, false, true, true);
            Statics.field1279 = method2882(11, false, true, true);
            Statics.field116 = method2882(12, false, true, true);
            Statics.field491 = method2882(13, true, false, true);
            Statics.field282 = method2882(14, false, true, false);
            Statics.field743 = method2882(15, false, true, true);
            class21.field315 = class135.field2108;
            class21.field314 = 20;
            field527 = 40;
        } else if (field527 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field6.method3137() * 4 / 100;
            int var8 = var7 + Statics.field1463.method3137() * 4 / 100;
            int var9 = var8 + Statics.field2053.method3137() * 2 / 100;
            int var10 = var9 + Statics.field263.method3137() * 2 / 100;
            int var11 = var10 + Statics.field15.method3137() * 6 / 100;
            int var12 = var11 + Statics.field2077.method3137() * 4 / 100;
            int var13 = var12 + Statics.field2449.method3137() * 2 / 100;
            int var14 = var13 + Statics.field2039.method3137() * 60 / 100;
            int var15 = var14 + Statics.field376.method3137() * 2 / 100;
            int var16 = var15 + Statics.field2767.method3137() * 2 / 100;
            int var17 = var16 + Statics.field262.method3137() * 2 / 100;
            int var18 = var17 + Statics.field1279.method3137() * 2 / 100;
            int var19 = var18 + Statics.field116.method3137() * 2 / 100;
            int var20 = var19 + Statics.field491.method3137() * 2 / 100;
            int var21 = var20 + Statics.field282.method3137() * 2 / 100;
            int var22 = var21 + Statics.field743.method3137() * 2 / 100;
            if (var22 == 100) {
                class21.field315 = class135.field2192;
                class21.field314 = 30;
                field527 = 45;
            } else {
                if (var22 != 0) {
                    class21.field315 = class135.field2109 + var22 + "%";
                }
                class21.field314 = 30;
            }
        } else if (field527 == 45) {
            class52.method2062(22050, !field478, 2);
            class142 var23 = new class142();
            var23.method2790(9, 128);
            Statics.field256 = class52.method749(Statics.field896, Statics.field865, 0, 22050);
            Statics.field256.method1155(var23);
            class155 var24 = Statics.field743;
            class155 var25 = Statics.field282;
            class155 var26 = Statics.field15;
            Statics.field2344 = var24;
            Statics.field2343 = var25;
            Statics.field2348 = var26;
            Statics.field2345 = var23;
            Statics.field1820 = class52.method749(Statics.field896, Statics.field865, 1, 2048);
            Statics.field1999 = new class46();
            Statics.field1820.method1155(Statics.field1999);
            Statics.field1314 = new class62(22050, Statics.field277);
            class21.field315 = class135.field2211;
            class21.field314 = 35;
            field527 = 50;
        } else if (field527 == 50) {
            int var27 = 0;
            if (Statics.field2342 == null) {
                class155 var28 = Statics.field376;
                class155 var29 = Statics.field491;
                int var30 = var28.method3074("p11_full");
                int var31 = var28.method3038(var30, "");
                class183 var32;
                if (Statics.method5(var28, var30, var31)) {
                    var32 = class84.method2716(var29.method3027(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field2342 = var32;
            } else {
                var27++;
            }
            if (Statics.field524 == null) {
                class155 var34 = Statics.field376;
                class155 var35 = Statics.field491;
                int var36 = var34.method3074("p12_full");
                int var37 = var34.method3038(var36, "");
                class183 var38;
                if (Statics.method5(var34, var36, var37)) {
                    var38 = class84.method2716(var35.method3027(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field524 = var38;
            } else {
                var27++;
            }
            if (Statics.field194 == null) {
                class155 var40 = Statics.field376;
                class155 var41 = Statics.field491;
                int var42 = var40.method3074("b12_full");
                int var43 = var40.method3038(var42, "");
                class183 var44;
                if (Statics.method5(var40, var42, var43)) {
                    var44 = class84.method2716(var41.method3027(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field194 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field315 = class135.field2112 + var27 * 100 / 3 + "%";
                class21.field314 = 40;
            } else {
                Statics.field1385 = new class152(true);
                class21.field315 = class135.field2113;
                class21.field314 = 40;
                field527 = 60;
            }
        } else if (field527 == 60) {
            class155 var46 = Statics.field262;
            class155 var47 = Statics.field376;
            int var48 = 0;
            if (var46.method3029("title.jpg", "")) {
                var48++;
            }
            if (var47.method3029("logo", "")) {
                var48++;
            }
            if (var47.method3029("titlebox", "")) {
                var48++;
            }
            if (var47.method3029("titlebutton", "")) {
                var48++;
            }
            if (var47.method3029("runes", "")) {
                var48++;
            }
            if (var47.method3029("title_mute", "")) {
                var48++;
            }
            var47.method3029("sl_back", "");
            var47.method3029("sl_flags", "");
            var47.method3029("sl_arrows", "");
            var47.method3029("sl_stars", "");
            var47.method3029("sl_button", "");
            byte var51 = 6;
            if (var48 < var51) {
                class21.field315 = class135.field2114 + var48 * 100 / var51 + "%";
                class21.field314 = 50;
            } else {
                class21.field315 = class135.field2115;
                class21.field314 = 50;
                method217(5);
                field527 = 70;
            }
        } else if (field527 == 70) {
            if (Statics.field2053.method3031()) {
                class155 var53 = Statics.field2053;
                Statics.field948 = var53;
                class33.method209(Statics.field2053);
                class36.method767(Statics.field2053, Statics.field2039);
                class32.method559(Statics.field2053, Statics.field2039, field478);
                class31.method1163(Statics.field2053, Statics.field2039);
                class155 var54 = Statics.field2053;
                class155 var55 = Statics.field2039;
                boolean var56 = field477;
                class183 var57 = Statics.field2342;
                Statics.field998 = var54;
                Statics.field994 = var55;
                Statics.field976 = var56;
                Statics.field998.method3037(10);
                Statics.field980 = var57;
                class34.method1289(Statics.field2053, Statics.field6, Statics.field1463);
                class35.method1315(Statics.field2053, Statics.field2039);
                class38.method247(Statics.field2053);
                class42.method817(Statics.field2053);
                class159.method206(Statics.field263, Statics.field2039, Statics.field376, Statics.field491);
                class155 var58 = Statics.field2053;
                Statics.field1032 = var58;
                class39.method565(Statics.field2053);
                class21.field315 = class135.field2173;
                class21.field314 = 60;
                field527 = 80;
            } else {
                class21.field315 = class135.field2282 + Statics.field2053.method3123() + "%";
                class21.field314 = 60;
            }
        } else if (field527 == 80) {
            int var59 = 0;
            if (Statics.field242 == null) {
                Statics.field242 = class84.method1587(Statics.field376, "compass", "");
            } else {
                var59++;
            }
            if (Statics.field1561 == null) {
                Statics.field1561 = class84.method1587(Statics.field376, "mapedge", "");
            } else {
                var59++;
            }
            if (Statics.field73 == null) {
                Statics.field73 = class84.method2060(Statics.field376, "mapscene", "");
            } else {
                var59++;
            }
            if (Statics.field276 == null) {
                Statics.field276 = class84.method103(Statics.field376, "mapfunction", "");
            } else {
                var59++;
            }
            if (Statics.field945 == null) {
                Statics.field945 = class84.method103(Statics.field376, "hitmarks", "");
            } else {
                var59++;
            }
            if (Statics.field1764 == null) {
                Statics.field1764 = class84.method103(Statics.field376, "headicons_pk", "");
            } else {
                var59++;
            }
            if (Statics.field853 == null) {
                Statics.field853 = class84.method103(Statics.field376, "headicons_prayer", "");
            } else {
                var59++;
            }
            if (Statics.field1344 == null) {
                Statics.field1344 = class84.method103(Statics.field376, "headicons_hint", "");
            } else {
                var59++;
            }
            if (Statics.field752 == null) {
                Statics.field752 = class84.method103(Statics.field376, "mapmarker", "");
            } else {
                var59++;
            }
            if (Statics.field377 == null) {
                Statics.field377 = class84.method103(Statics.field376, "cross", "");
            } else {
                var59++;
            }
            if (Statics.field882 == null) {
                Statics.field882 = class84.method103(Statics.field376, "mapdots", "");
            } else {
                var59++;
            }
            if (Statics.field1044 == null) {
                Statics.field1044 = class84.method2060(Statics.field376, "scrollbar", "");
            } else {
                var59++;
            }
            if (Statics.field2445 == null) {
                Statics.field2445 = class84.method2060(Statics.field376, "mod_icons", "");
            } else {
                var59++;
            }
            if (Statics.field2408 == null) {
                Statics.field2408 = class84.method212(Statics.field376, "mapback", "");
            } else {
                var59++;
            }
            if (var59 < 14) {
                class21.field315 = class135.field2245 + var59 * 100 / 14 + "%";
                class21.field314 = 70;
            } else {
                Statics.field2835 = Statics.field2445;
                Statics.field1561.method1683();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                for (int var64 = 0; var64 < Statics.field276.length; var64++) {
                    Statics.field276[var64].method1701(var60 + var63, var61 + var63, var62 + var63);
                }
                Statics.field73[0].method1781(var60 + var63, var61 + var63, var62 + var63);
                method2218();
                class21.field315 = class135.field2273;
                class21.field314 = 70;
                field527 = 90;
            }
        } else if (field527 == 90) {
            if (Statics.field2767.method3031()) {
                class110 var65 = new class110(Statics.field2767, Statics.field376, 20, 0.8D, field478 ? 64 : 128);
                class104.method2147(var65);
                class104.method2175(0.8D);
                class21.field315 = class135.field2121;
                class21.field314 = 90;
                field527 = 110;
            } else {
                class21.field315 = class135.field2120 + Statics.field2767.method3123() + "%";
                class21.field314 = 90;
            }
        } else if (field527 == 110) {
            Statics.field931 = new class16();
            Statics.field896.method1512(Statics.field931, 10);
            class21.field315 = class135.field2142;
            class21.field314 = 94;
            field527 = 120;
        } else if (field527 == 120) {
            if (Statics.field262.method3029("huffman", "")) {
                class120 var66 = new class120(Statics.field262.method3044("huffman", ""));
                class184.method3127(var66);
                class21.field315 = class135.field2277;
                class21.field314 = 96;
                field527 = 130;
            } else {
                class21.field315 = class135.field2123 + "%";
                class21.field314 = 96;
            }
        } else if (field527 == 130) {
            if (!Statics.field263.method3031()) {
                class21.field315 = class135.field2125 + Statics.field263.method3123() * 4 / 5 + "%";
                class21.field314 = 100;
            } else if (!Statics.field116.method3031()) {
                class21.field315 = class135.field2125 + (80 + Statics.field116.method3123() / 6) + "%";
                class21.field314 = 100;
            } else if (Statics.field491.method3031()) {
                class21.field315 = class135.field2186;
                class21.field314 = 100;
                field527 = 140;
            } else {
                class21.field315 = class135.field2125 + (96 + Statics.field491.method3123() / 20) + "%";
                class21.field314 = 100;
            }
        } else if (field527 == 140) {
            method217(10);
        }
    }

    @ObfuscatedName("ev.x(IZZZI)Ley;")
    public static class155 method2882(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1434 != null) {
            var4 = new class71(arg0, class82.field1434, Statics.field1443[arg0], 1000000);
        }
        return new class155(var4, Statics.field220, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("dj.r(B)V")
    public static void method2218() {
        Statics.field146 = new int[33];
        Statics.field64 = new int[33];
        Statics.field548 = new int[151];
        Statics.field932 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2408.field1487[Statics.field2408.field1489 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field146[var0] = var1;
            Statics.field64[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2408.field1487[Statics.field2408.field1489 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field548[var4 - 5] = var5 - 25;
            Statics.field932[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("az.s(I)V")
    public static final void method800() {
        try {
            if (field504 == 0) {
                if (Statics.field56 != null) {
                    Statics.field56.method1381();
                    Statics.field56 = null;
                }
                Statics.field85 = null;
                field528 = false;
                field674 = 0;
                field504 = 1;
            }
            if (field504 == 1) {
                if (Statics.field85 == null) {
                    Statics.field85 = Statics.field896.method1491(Statics.field23, Statics.field1272);
                }
                if (Statics.field85.field1419 == 2) {
                    throw new IOException();
                }
                if (Statics.field85.field1419 == 1) {
                    Statics.field56 = new class70((Socket) Statics.field85.field1416, Statics.field896);
                    Statics.field85 = null;
                    field504 = 2;
                }
            }
            if (field504 == 2) {
                field591.field2035 = 0;
                field591.method2450(14);
                Statics.field56.method1385(field591.field2037, 0, 1);
                field604.field2035 = 0;
                field504 = 3;
            }
            if (field504 == 3) {
                if (Statics.field256 != null) {
                    Statics.field256.method1156();
                }
                if (Statics.field1820 != null) {
                    Statics.field1820.method1156();
                }
                int var0 = Statics.field56.method1383();
                if (Statics.field256 != null) {
                    Statics.field256.method1156();
                }
                if (Statics.field1820 != null) {
                    Statics.field1820.method1156();
                }
                if (var0 != 0) {
                    method2401(var0);
                    return;
                }
                field604.field2035 = 0;
                field504 = 5;
            }
            if (field504 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field591.field2035 = 0;
                field591.method2450(10);
                field591.method2453(var1[0]);
                field591.method2453(var1[1]);
                field591.method2453(var1[2]);
                field591.method2453(var1[3]);
                field591.method2454(0L);
                field591.method2455(class21.field321);
                field591.method2482(class6.field86, class6.field81);
                field522.field2035 = 0;
                if (field480 == 40) {
                    field522.method2450(18);
                } else {
                    field522.method2450(16);
                }
                field522.method2593(0);
                int var2 = field522.field2035;
                field522.method2453(32);
                field522.method2458(field591.field2037, 0, field591.field2035);
                int var3 = field522.field2035;
                field522.method2455(class21.field313);
                field522.method2450(field478 ? 1 : 0);
                class82.method13(field522);
                class127 var4 = new class127(Statics.field1385.method3012());
                Statics.field1385.method3014(var4);
                field522.method2458(var4.field2037, 0, var4.field2037.length);
                field522.method2453(Statics.field6.field2521);
                field522.method2453(Statics.field1463.field2521);
                field522.method2453(Statics.field2053.field2521);
                field522.method2453(Statics.field263.field2521);
                field522.method2453(Statics.field15.field2521);
                field522.method2453(Statics.field2077.field2521);
                field522.method2453(Statics.field2449.field2521);
                field522.method2453(Statics.field2039.field2521);
                field522.method2453(Statics.field376.field2521);
                field522.method2453(Statics.field2767.field2521);
                field522.method2453(Statics.field262.field2521);
                field522.method2453(Statics.field1279.field2521);
                field522.method2453(Statics.field116.field2521);
                field522.method2453(Statics.field491.field2521);
                field522.method2453(Statics.field282.field2521);
                field522.method2453(Statics.field743.field2521);
                field522.method2461(var1, var3, field522.field2035);
                field522.method2538(field522.field2035 - var2);
                Statics.field56.method1385(field522.field2037, 0, field522.field2035);
                field591.method2326(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field604.method2326(var1);
                field504 = 6;
            }
            if (field504 == 6 && Statics.field56.method1384() > 0) {
                int var6 = Statics.field56.method1383();
                if (var6 == 21 && field480 == 20) {
                    field504 = 7;
                } else if (var6 == 2) {
                    field504 = 9;
                } else if (var6 == 15 && field480 == 40) {
                    method223();
                    return;
                } else if (var6 == 23 && field505 < 1) {
                    field505++;
                    field504 = 0;
                } else {
                    method2401(var6);
                    return;
                }
            }
            if (field504 == 7 && Statics.field56.method1384() > 0) {
                field507 = (Statics.field56.method1383() + 3) * 60;
                field504 = 8;
            }
            if (field504 == 8) {
                field674 = 0;
                class21.method1878(class135.field2127, class135.field2119, field507 / 60 + class135.field2300);
                if (--field507 <= 0) {
                    field504 = 0;
                }
            } else {
                if (field504 == 9 && Statics.field56.method1384() >= 8) {
                    field636 = Statics.field56.method1383();
                    field641 = Statics.field56.method1383() == 1;
                    field598 = Statics.field56.method1383();
                    field598 <<= 0x8;
                    field598 += Statics.field56.method1383();
                    field599 = Statics.field56.method1383();
                    Statics.field56.method1400(field604.field2037, 0, 1);
                    field604.field2035 = 0;
                    field479 = field604.method2348();
                    Statics.field56.method1400(field604.field2037, 0, 2);
                    field604.field2035 = 0;
                    field654 = field604.method2582();
                    if (field599 == 1) {
                        try {
                            client var7 = Statics.field470;
                            JSObject.getWindow(var7).call("zap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            client var9 = Statics.field470;
                            JSObject.getWindow(var9).call("unzap", (Object[]) null);
                        } catch (Throwable var27) {
                        }
                    }
                    field504 = 10;
                }
                if (field504 != 10) {
                    field674++;
                    if (field674 > 2000) {
                        if (field505 < 1) {
                            if (Statics.field1817 == Statics.field1272) {
                                Statics.field1272 = Statics.field1849;
                            } else {
                                Statics.field1272 = Statics.field1817;
                            }
                            field505++;
                            field504 = 0;
                        } else {
                            method2401(-3);
                        }
                    }
                } else if (Statics.field56.method1384() >= field654) {
                    field604.field2035 = 0;
                    Statics.field56.method1400(field604.field2037, 0, field654);
                    field722 = 1L;
                    field658 = -1;
                    Statics.field931.field259 = 0;
                    Statics.field21 = true;
                    field487 = true;
                    field659 = -1L;
                    class182.method1373();
                    field591.field2035 = 0;
                    field604.field2035 = 0;
                    field479 = -1;
                    field520 = -1;
                    field521 = -1;
                    field563 = -1;
                    field633 = 0;
                    field737 = 0;
                    field519 = 0;
                    field536 = 0;
                    field535 = 0;
                    field614 = false;
                    class77.method2727(0);
                    for (int var11 = 0; var11 < 100; var11++) {
                        field687[var11] = null;
                    }
                    field688 = 0;
                    field627 = 0;
                    field629 = false;
                    field713 = 0;
                    field549 = (int) (Math.random() * 100.0D) - 50;
                    field733 = (int) (Math.random() * 110.0D) - 55;
                    field539 = (int) (Math.random() * 80.0D) - 40;
                    field542 = (int) (Math.random() * 120.0D) - 60;
                    field559 = (int) (Math.random() * 30.0D) - 20;
                    field556 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field707 = 0;
                    field700 = -1;
                    field730 = 0;
                    field706 = 0;
                    field701 = 0;
                    field510 = 0;
                    for (int var12 = 0; var12 < 2048; var12++) {
                        field592[var12] = null;
                        field597[var12] = null;
                    }
                    for (int var13 = 0; var13 < 32768; var13++) {
                        field509[var13] = null;
                    }
                    Statics.field428 = field592[2047] = new class3();
                    field608.method3340();
                    field609.method3340();
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                field606[var14][var15][var16] = null;
                            }
                        }
                    }
                    field486 = new class177();
                    field726 = 0;
                    field725 = 0;
                    field729 = 0;
                    for (int var17 = 0; var17 < Statics.field1036; var17++) {
                        class42 var18 = class42.method2199(var17);
                        if (var18 != null && var18.field1045 == 0) {
                            class160.field2717[var17] = 0;
                            class160.field2716[var17] = 0;
                        }
                    }
                    for (int var19 = 0; var19 < field667.length; var19++) {
                        field667[var19] = -1;
                    }
                    if (field516 != -1) {
                        int var20 = field516;
                        if (var20 != -1 && Statics.field2688[var20]) {
                            Statics.field2667.method3093(var20);
                            if (Statics.field2592[var20] != null) {
                                boolean var21 = true;
                                for (int var22 = 0; var22 < Statics.field2592[var20].length; var22++) {
                                    if (Statics.field2592[var20][var22] != null) {
                                        if (Statics.field2592[var20][var22].field2599 == 2) {
                                            var21 = false;
                                        } else {
                                            Statics.field2592[var20][var22] = null;
                                        }
                                    }
                                }
                                if (var21) {
                                    Statics.field2592[var20] = null;
                                }
                                Statics.field2688[var20] = false;
                            }
                        }
                    }
                    for (class4 var23 = (class4) field634.method3298(); var23 != null; var23 = (class4) field634.method3299()) {
                        method173(var23, true);
                    }
                    field516 = -1;
                    field634 = new class175(8);
                    field637 = null;
                    field614 = false;
                    field535 = 0;
                    field731.method3218((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var24 = 0; var24 < 8; var24++) {
                        field603[var24] = null;
                        field693[var24] = false;
                    }
                    class19.method879();
                    field481 = true;
                    for (int var25 = 0; var25 < 100; var25++) {
                        field676[var25] = true;
                    }
                    field698 = null;
                    Statics.field206 = 0;
                    Statics.field1273 = null;
                    Statics.field171 = -1;
                    method2138(false);
                    field479 = -1;
                }
            }
        } catch (IOException var29) {
            if (field505 < 1) {
                if (Statics.field1817 == Statics.field1272) {
                    Statics.field1272 = Statics.field1849;
                } else {
                    Statics.field1272 = Statics.field1817;
                }
                field505++;
                field504 = 0;
            } else {
                method2401(-2);
            }
        }
    }

    @ObfuscatedName("y.l(I)V")
    public static void method223() {
        field591.field2035 = 0;
        field604.field2035 = 0;
        field479 = -1;
        field520 = -1;
        field521 = -1;
        field563 = -1;
        field654 = 0;
        field633 = 0;
        field737 = 0;
        field535 = 0;
        field614 = false;
        field707 = 0;
        field730 = 0;
        for (int var0 = 0; var0 < field592.length; var0++) {
            if (field592[var0] != null) {
                field592[var0].field434 = -1;
            }
        }
        for (int var1 = 0; var1 < field509.length; var1++) {
            if (field509[var1] != null) {
                field509[var1].field434 = -1;
            }
        }
        class19.method879();
        method217(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field676[var2] = true;
        }
    }

    @ObfuscatedName("dl.k(II)V")
    public static void method2401(int arg0) {
        if (arg0 == -3) {
            class21.method1878(class135.field2130, class135.field2131, class135.field2231);
        } else if (arg0 == -2) {
            class21.method1878(class135.field2240, class135.field2134, class135.field2203);
        } else if (arg0 == -1) {
            class21.method1878(class135.field2136, class135.field2137, class135.field2138);
        } else if (arg0 == 3) {
            class21.method1878(class135.field2320, class135.field2135, class135.field2141);
        } else if (arg0 == 4) {
            class21.method1878(class135.field2154, class135.field2143, class135.field2144);
        } else if (arg0 == 5) {
            class21.method1878(class135.field2145, class135.field2146, class135.field2159);
        } else if (arg0 == 6) {
            class21.method1878(class135.field2148, class135.field2238, class135.field2254);
        } else if (arg0 == 7) {
            class21.method1878(class135.field2151, class135.field2152, class135.field2319);
        } else if (arg0 == 8) {
            class21.method1878(class135.field2191, class135.field2155, class135.field2156);
        } else if (arg0 == 9) {
            class21.method1878(class135.field2165, class135.field2158, class135.field2257);
        } else if (arg0 == 10) {
            class21.method1878(class135.field2160, class135.field2140, class135.field2162);
        } else if (arg0 == 11) {
            class21.method1878(class135.field2157, class135.field2315, class135.field2226);
        } else if (arg0 == 12) {
            class21.method1878(class135.field2129, class135.field2167, class135.field2101);
        } else if (arg0 == 13) {
            class21.method1878(class135.field2217, class135.field2168, class135.field2171);
        } else if (arg0 == 14) {
            class21.method1878(class135.field2128, class135.field2239, class135.field2174);
        } else if (arg0 == 16) {
            class21.method1878(class135.field2175, class135.field2189, class135.field2177);
        } else if (arg0 == 17) {
            class21.method1878(class135.field2178, class135.field2179, class135.field2180);
        } else if (arg0 == 18) {
            class21.method1878(class135.field2139, class135.field2182, class135.field2183);
        } else if (arg0 == 19) {
            class21.method1878(class135.field2184, class135.field2185, class135.field2147);
        } else if (arg0 == 20) {
            class21.method1878(class135.field2187, class135.field2117, class135.field2133);
        } else if (arg0 == 22) {
            class21.method1878(class135.field2190, class135.field2287, class135.field2228);
        } else if (arg0 == 23) {
            class21.method1878(class135.field2272, class135.field2194, class135.field2149);
        } else if (arg0 == 24) {
            class21.method1878(class135.field2196, class135.field2195, class135.field2197);
        } else if (arg0 == 25) {
            class21.method1878(class135.field2199, class135.field2200, class135.field2246);
        } else if (arg0 == 26) {
            class21.method1878(class135.field2202, class135.field2126, class135.field2295);
        } else if (arg0 == 27) {
            class21.method1878(class135.field2205, class135.field2206, class135.field2207);
        } else if (arg0 == 31) {
            class21.method1878(class135.field2214, class135.field2215, class135.field2216);
        } else if (arg0 == 32) {
            class21.method1878(class135.field2166, class135.field2218, class135.field2219);
        } else if (arg0 == 37) {
            class21.method1878(class135.field2220, class135.field2221, class135.field2297);
        } else if (arg0 == 38) {
            class21.method1878(class135.field2223, class135.field2224, class135.field2301);
        } else if (arg0 == 55) {
            class21.method1878(class135.field2204, class135.field2227, class135.field2310);
        } else {
            class21.method1878(class135.field2201, class135.field2230, class135.field2193);
        }
        method217(10);
    }

    @ObfuscatedName("bl.w(I)V")
    public static final void method1286() {
        if (Statics.field56 != null) {
            Statics.field56.method1381();
            Statics.field56 = null;
        }
        method58();
        Statics.field949.method1891();
        for (int var0 = 0; var0 < 4; var0++) {
            field506[var0].method2683();
        }
        System.gc();
        class139.method102(2);
        field709 = -1;
        field514 = false;
        class7.method117();
        method217(10);
    }

    @ObfuscatedName("t.z(I)V")
    public static final void method58() {
        class37.field940.method3265();
        class33.field857.method3265();
        class36.field922.method3265();
        class32.field804.method3265();
        class32.field805.method3265();
        class32.field820.method3265();
        class32.field846.method3265();
        class31.field772.method3265();
        class31.field799.method3265();
        class40.method603();
        class34.method877();
        class35.field907.method3265();
        class35.field911.method3265();
        Statics.method45();
        class42.field1037.method3265();
        Statics.method108();
        class159.method2234();
        ((class110) Statics.field1787).method2222();
        class5.field74.method3265();
        Statics.field6.method3040();
        Statics.field1463.method3040();
        Statics.field263.method3040();
        Statics.field15.method3040();
        Statics.field2077.method3040();
        Statics.field2449.method3040();
        Statics.field2039.method3040();
        Statics.field376.method3040();
        Statics.field2767.method3040();
        Statics.field262.method3040();
        Statics.field1279.method3040();
        Statics.field116.method3040();
    }

    @ObfuscatedName("g.v(B)V")
    public static final void method137() {
        if (Statics.field1820 != null) {
            Statics.field1820.method1165();
        }
        if (Statics.field256 != null) {
            Statics.field256.method1165();
        }
    }

    @ObfuscatedName("j.d(I)V")
    public static final void method2() {
        for (int var0 = 0; var0 < field713; var0++) {
            int var10002 = field716[var0]--;
            if (field716[var0] >= -10) {
                class57 var2 = field596[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1265(Statics.field15, field714[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field716[var0] += var2.method1256();
                    field596[var0] = var2;
                }
                if (field716[var0] < 0) {
                    int var9;
                    if (field607[var0] == 0) {
                        var9 = field711;
                    } else {
                        int var3 = (field607[var0] & 0xFF) * 128;
                        int var4 = field607[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field428.field418;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field607[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field428.field412;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field716[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field512 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1259().method1332(Statics.field1314);
                        class45 var11 = class45.method947(var10, 100, var9);
                        var11.method950(field715[var0] - 1);
                        Statics.field1999.method1107(var11);
                    }
                    field716[var0] = -100;
                }
            } else {
                field713--;
                for (int var1 = var0; var1 < field713; var1++) {
                    field714[var1] = field714[var1 + 1];
                    field596[var1] = field596[var1 + 1];
                    field715[var1] = field715[var1 + 1];
                    field716[var1] = field716[var1 + 1];
                    field607[var1] = field607[var1 + 1];
                }
                var0--;
            }
        }
        if (!field514) {
            return;
        }
        boolean var12;
        if (class139.field2347 == 0) {
            var12 = Statics.field2345.method2870();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field515 != 0 && field709 != -1) {
                class139.method8(Statics.field2449, field709, 0, field515, false);
            }
            field514 = false;
        }
    }

    @ObfuscatedName("h.e(Lam;IIII)V")
    public static void method34(class34 arg0, int arg1, int arg2, int arg3) {
        if (field713 >= 50 || field512 == 0 || arg0.field874 == null || arg1 >= arg0.field874.length) {
            return;
        }
        int var4 = arg0.field874[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field714[field713] = var5;
        field715[field713] = var6;
        field716[field713] = 0;
        field596[field713] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field607[field713] = (var8 << 16) + (var9 << 8) + var7;
        field713++;
    }

    @ObfuscatedName("ai.y(IIIB)V")
    public static void method567(int arg0, int arg1, int arg2) {
        if (field711 == 0 || arg1 == 0 || field713 >= 50) {
            return;
        }
        field714[field713] = arg0;
        field715[field713] = arg1;
        field716[field713] = arg2;
        field596[field713] = null;
        field607[field713] = 0;
        field713++;
    }

    @ObfuscatedName("ah.aw(III)V")
    public static void method590(int arg0, int arg1) {
        if (field515 != 0 && arg0 != -1) {
            class139.method8(Statics.field1279, arg0, 0, field515, false);
            field514 = true;
        }
    }

    @ObfuscatedName("dk.ai(B)V")
    public static final void method2319() {
        if (field478 && Statics.field1807 != field525) {
            method179(Statics.field171, Statics.field208, Statics.field1807, Statics.field428.field463[0], Statics.field428.field464[0]);
        } else if (Statics.field1807 != field700) {
            field700 = Statics.field1807;
            method205(Statics.field1807);
        }
    }

    @ObfuscatedName("bl.ah(I)V")
    public static final void method1288() {
        int var0 = Statics.field1324 * 128 + 64;
        int var1 = Statics.field2471 * 128 + 64;
        int var2 = method215(var0, var1, Statics.field1807) - Statics.field378;
        if (Statics.field1635 < var0) {
            Statics.field1635 += Statics.field1290 * (var0 - Statics.field1635) / 1000 + Statics.field1097;
            if (Statics.field1635 > var0) {
                Statics.field1635 = var0;
            }
        }
        if (Statics.field1635 > var0) {
            Statics.field1635 -= Statics.field1290 * (Statics.field1635 - var0) / 1000 + Statics.field1097;
            if (Statics.field1635 < var0) {
                Statics.field1635 = var0;
            }
        }
        if (Statics.field2822 < var2) {
            Statics.field2822 += Statics.field1290 * (var2 - Statics.field2822) / 1000 + Statics.field1097;
            if (Statics.field2822 > var2) {
                Statics.field2822 = var2;
            }
        }
        if (Statics.field2822 > var2) {
            Statics.field2822 -= Statics.field1290 * (Statics.field2822 - var2) / 1000 + Statics.field1097;
            if (Statics.field2822 < var2) {
                Statics.field2822 = var2;
            }
        }
        if (Statics.field2024 < var1) {
            Statics.field2024 += Statics.field1290 * (var1 - Statics.field2024) / 1000 + Statics.field1097;
            if (Statics.field2024 > var1) {
                Statics.field2024 = var1;
            }
        }
        if (Statics.field2024 > var1) {
            Statics.field2024 -= Statics.field1290 * (Statics.field2024 - var1) / 1000 + Statics.field1097;
            if (Statics.field2024 < var1) {
                Statics.field2024 = var1;
            }
        }
        int var3 = Statics.field1048 * 128 + 64;
        int var4 = Statics.field409 * 128 + 64;
        int var5 = method215(var3, var4, Statics.field1807) - Statics.field1305;
        int var6 = var3 - Statics.field1635;
        int var7 = var5 - Statics.field2822;
        int var8 = var4 - Statics.field2024;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field28 < var10) {
            Statics.field28 += Statics.field245 * (var10 - Statics.field28) / 1000 + Statics.field1038;
            if (Statics.field28 > var10) {
                Statics.field28 = var10;
            }
        }
        if (Statics.field28 > var10) {
            Statics.field28 -= Statics.field245 * (Statics.field28 - var10) / 1000 + Statics.field1038;
            if (Statics.field28 < var10) {
                Statics.field28 = var10;
            }
        }
        int var12 = var11 - Statics.field102;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field102 += Statics.field245 * var12 / 1000 + Statics.field1038;
            Statics.field102 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field102 -= Statics.field245 * -var12 / 1000 + Statics.field1038;
            Statics.field102 &= 0x7FF;
        }
        int var13 = var11 - Statics.field102;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field102 = var11;
        }
    }

    @ObfuscatedName("bd.ad(Law;II)V")
    public static final void method1376(class27 arg0, int arg1) {
        if (arg0.field454 > field699) {
            method1564(arg0);
        } else if (arg0.field423 >= field699) {
            if (field699 == arg0.field423 || arg0.field440 == -1 || arg0.field443 != 0 || arg0.field442 + 1 > class34.method612(arg0.field440).field881[arg0.field441]) {
                int var2 = arg0.field423 - arg0.field454;
                int var3 = field699 - arg0.field454;
                int var4 = arg0.field458 * 64 + arg0.field425 * 128;
                int var5 = arg0.field458 * 64 + arg0.field452 * 128;
                int var6 = arg0.field458 * 64 + arg0.field453 * 128;
                int var7 = arg0.field458 * 64 + arg0.field457 * 128;
                arg0.field418 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field412 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field466 = 0;
            if (arg0.field411 == 0) {
                arg0.field459 = 1024;
            }
            if (arg0.field411 == 1) {
                arg0.field459 = 1536;
            }
            if (arg0.field411 == 2) {
                arg0.field459 = 0;
            }
            if (arg0.field411 == 3) {
                arg0.field459 = 512;
            }
            arg0.field413 = arg0.field459;
        } else {
            arg0.field419 = arg0.field416;
            if (arg0.field462 == 0) {
                arg0.field466 = 0;
            } else {
                label234: {
                    if (arg0.field440 != -1 && arg0.field443 == 0) {
                        class34 var8 = class34.method612(arg0.field440);
                        if (arg0.field467 > 0 && var8.field877 == 0) {
                            arg0.field466++;
                            break label234;
                        }
                        if (arg0.field467 <= 0 && var8.field883 == 0) {
                            arg0.field466++;
                            break label234;
                        }
                    }
                    int var9 = arg0.field418;
                    int var10 = arg0.field412;
                    int var11 = arg0.field463[arg0.field462 - 1] * 128 + arg0.field458 * 64;
                    int var12 = arg0.field464[arg0.field462 - 1] * 128 + arg0.field458 * 64;
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        if (var9 < var11) {
                            if (var10 < var12) {
                                arg0.field459 = 1280;
                            } else if (var10 > var12) {
                                arg0.field459 = 1792;
                            } else {
                                arg0.field459 = 1536;
                            }
                        } else if (var9 > var11) {
                            if (var10 < var12) {
                                arg0.field459 = 768;
                            } else if (var10 > var12) {
                                arg0.field459 = 256;
                            } else {
                                arg0.field459 = 512;
                            }
                        } else if (var10 < var12) {
                            arg0.field459 = 1024;
                        } else if (var10 > var12) {
                            arg0.field459 = 0;
                        }
                        int var13 = arg0.field459 - arg0.field413 & 0x7FF;
                        if (var13 > 1024) {
                            var13 -= 2048;
                        }
                        int var14 = arg0.field420;
                        if (var13 >= -256 && var13 <= 256) {
                            var14 = arg0.field439;
                        } else if (var13 >= 256 && var13 < 768) {
                            var14 = arg0.field422;
                        } else if (var13 >= -768 && var13 <= -256) {
                            var14 = arg0.field450;
                        }
                        if (var14 == -1) {
                            var14 = arg0.field439;
                        }
                        arg0.field419 = var14;
                        int var15 = 4;
                        boolean var16 = true;
                        if (arg0 instanceof class25) {
                            var16 = ((class25) arg0).field383.field800;
                        }
                        if (var16) {
                            if (arg0.field459 != arg0.field413 && arg0.field434 == -1 && arg0.field461 != 0) {
                                var15 = 2;
                            }
                            if (arg0.field462 > 2) {
                                var15 = 6;
                            }
                            if (arg0.field462 > 3) {
                                var15 = 8;
                            }
                            if (arg0.field466 > 0 && arg0.field462 > 1) {
                                var15 = 8;
                                arg0.field466--;
                            }
                        } else {
                            if (arg0.field462 > 1) {
                                var15 = 6;
                            }
                            if (arg0.field462 > 2) {
                                var15 = 8;
                            }
                            if (arg0.field466 > 0 && arg0.field462 > 1) {
                                var15 = 8;
                                arg0.field466--;
                            }
                        }
                        if (arg0.field465[arg0.field462 - 1]) {
                            var15 <<= 0x1;
                        }
                        if (var15 >= 8 && arg0.field439 == arg0.field419 && arg0.field456 != -1) {
                            arg0.field419 = arg0.field456;
                        }
                        if (var9 < var11) {
                            arg0.field418 += var15;
                            if (arg0.field418 > var11) {
                                arg0.field418 = var11;
                            }
                        } else if (var9 > var11) {
                            arg0.field418 -= var15;
                            if (arg0.field418 < var11) {
                                arg0.field418 = var11;
                            }
                        }
                        if (var10 < var12) {
                            arg0.field412 += var15;
                            if (arg0.field412 > var12) {
                                arg0.field412 = var12;
                            }
                        } else if (var10 > var12) {
                            arg0.field412 -= var15;
                            if (arg0.field412 < var12) {
                                arg0.field412 = var12;
                            }
                        }
                        if (arg0.field418 == var11 && arg0.field412 == var12) {
                            arg0.field462--;
                            if (arg0.field467 > 0) {
                                arg0.field467--;
                            }
                        }
                    } else {
                        arg0.field418 = var11;
                        arg0.field412 = var12;
                    }
                }
            }
        }
        if (arg0.field418 < 128 || arg0.field412 < 128 || arg0.field418 >= 13184 || arg0.field412 >= 13184) {
            arg0.field440 = -1;
            arg0.field445 = -1;
            arg0.field454 = 0;
            arg0.field423 = 0;
            arg0.field418 = arg0.field463[0] * 128 + arg0.field458 * 64;
            arg0.field412 = arg0.field464[0] * 128 + arg0.field458 * 64;
            arg0.method248();
        }
        if (Statics.field428 == arg0 && (arg0.field418 < 1536 || arg0.field412 < 1536 || arg0.field418 >= 11776 || arg0.field412 >= 11776)) {
            arg0.field440 = -1;
            arg0.field445 = -1;
            arg0.field454 = 0;
            arg0.field423 = 0;
            arg0.field418 = arg0.field463[0] * 128 + arg0.field458 * 64;
            arg0.field412 = arg0.field464[0] * 128 + arg0.field458 * 64;
            arg0.method248();
        }
        method155(arg0);
        method1667(arg0);
    }

    @ObfuscatedName("bf.ak(Law;S)V")
    public static final void method1564(class27 arg0) {
        int var1 = arg0.field454 - field699;
        int var2 = arg0.field458 * 64 + arg0.field425 * 128;
        int var3 = arg0.field458 * 64 + arg0.field452 * 128;
        arg0.field418 += (var2 - arg0.field418) / var1;
        arg0.field412 += (var3 - arg0.field412) / var1;
        arg0.field466 = 0;
        if (arg0.field411 == 0) {
            arg0.field459 = 1024;
        }
        if (arg0.field411 == 1) {
            arg0.field459 = 1536;
        }
        if (arg0.field411 == 2) {
            arg0.field459 = 0;
        }
        if (arg0.field411 == 3) {
            arg0.field459 = 512;
        }
    }

    @ObfuscatedName("s.ap(Law;I)V")
    public static final void method155(class27 arg0) {
        if (arg0.field461 == 0) {
            return;
        }
        if (arg0.field434 != -1 && arg0.field434 < 32768) {
            class25 var1 = field509[arg0.field434];
            if (var1 != null) {
                int var2 = arg0.field418 - var1.field418;
                int var3 = arg0.field412 - var1.field412;
                if (var2 != 0 || var3 != 0) {
                    arg0.field459 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field434 >= 32768) {
            int var4 = arg0.field434 - 32768;
            if (field598 == var4) {
                var4 = 2047;
            }
            class3 var5 = field592[var4];
            if (var5 != null) {
                int var6 = arg0.field418 - var5.field418;
                int var7 = arg0.field412 - var5.field412;
                if (var6 != 0 || var7 != 0) {
                    arg0.field459 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field435 != 0 || arg0.field436 != 0) && (arg0.field462 == 0 || arg0.field466 > 0)) {
            int var8 = arg0.field418 - (arg0.field435 * 64 - Statics.field401 * 64 - Statics.field401 * 64);
            int var9 = arg0.field412 - (arg0.field436 * 64 - Statics.field1268 * 64 - Statics.field1268 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field459 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field435 = 0;
            arg0.field436 = 0;
        }
        int var10 = arg0.field459 - arg0.field413 & 0x7FF;
        if (var10 == 0) {
            arg0.field460 = 0;
            return;
        }
        arg0.field460++;
        if (var10 > 1024) {
            arg0.field413 -= arg0.field461;
            boolean var11 = true;
            if (var10 < arg0.field461 || var10 > 2048 - arg0.field461) {
                arg0.field413 = arg0.field459;
                var11 = false;
            }
            if (arg0.field419 == arg0.field416 && (arg0.field460 > 25 || var11)) {
                if (arg0.field437 == -1) {
                    arg0.field419 = arg0.field439;
                } else {
                    arg0.field419 = arg0.field437;
                }
            }
        } else {
            arg0.field413 += arg0.field461;
            boolean var12 = true;
            if (var10 < arg0.field461 || var10 > 2048 - arg0.field461) {
                arg0.field413 = arg0.field459;
                var12 = false;
            }
            if (arg0.field419 == arg0.field416 && (arg0.field460 > 25 || var12)) {
                if (arg0.field415 == -1) {
                    arg0.field419 = arg0.field439;
                } else {
                    arg0.field419 = arg0.field415;
                }
            }
        }
        arg0.field413 &= 0x7FF;
    }

    @ObfuscatedName("cr.al(Law;I)V")
    public static final void method1667(class27 arg0) {
        arg0.field414 = false;
        if (arg0.field419 != -1) {
            class34 var1 = class34.method612(arg0.field419);
            if (var1 == null || var1.field879 == null) {
                arg0.field419 = -1;
            } else {
                arg0.field421++;
                if (arg0.field438 < var1.field879.length && arg0.field421 > var1.field881[arg0.field438]) {
                    arg0.field421 = 1;
                    arg0.field438++;
                    method34(var1, arg0.field438, arg0.field418, arg0.field412);
                }
                if (arg0.field438 >= var1.field879.length) {
                    arg0.field421 = 0;
                    arg0.field438 = 0;
                    method34(var1, arg0.field438, arg0.field418, arg0.field412);
                }
            }
        }
        if (arg0.field445 != -1 && field699 >= arg0.field448) {
            if (arg0.field446 < 0) {
                arg0.field446 = 0;
            }
            int var2 = class35.method113(arg0.field445).field914;
            if (var2 == -1) {
                arg0.field445 = -1;
            } else {
                class34 var3 = class34.method612(var2);
                if (var3 == null || var3.field879 == null) {
                    arg0.field445 = -1;
                } else {
                    arg0.field447++;
                    if (arg0.field446 < var3.field879.length && arg0.field447 > var3.field881[arg0.field446]) {
                        arg0.field447 = 1;
                        arg0.field446++;
                        method34(var3, arg0.field446, arg0.field418, arg0.field412);
                    }
                    if (arg0.field446 >= var3.field879.length && (arg0.field446 < 0 || arg0.field446 >= var3.field879.length)) {
                        arg0.field445 = -1;
                    }
                }
            }
        }
        if (arg0.field440 != -1 && arg0.field443 <= 1) {
            class34 var4 = class34.method612(arg0.field440);
            if (var4.field877 == 1 && arg0.field467 > 0 && arg0.field454 <= field699 && arg0.field423 < field699) {
                arg0.field443 = 1;
                return;
            }
        }
        if (arg0.field440 != -1 && arg0.field443 == 0) {
            class34 var5 = class34.method612(arg0.field440);
            if (var5 == null || var5.field879 == null) {
                arg0.field440 = -1;
            } else {
                arg0.field442++;
                if (arg0.field441 < var5.field879.length && arg0.field442 > var5.field881[arg0.field441]) {
                    arg0.field442 = 1;
                    arg0.field441++;
                    method34(var5, arg0.field441, arg0.field418, arg0.field412);
                }
                if (arg0.field441 >= var5.field879.length) {
                    arg0.field441 -= var5.field884;
                    arg0.field444++;
                    if (arg0.field444 >= var5.field890) {
                        arg0.field440 = -1;
                    } else if (arg0.field441 >= 0 && arg0.field441 < var5.field879.length) {
                        method34(var5, arg0.field441, arg0.field418, arg0.field412);
                    } else {
                        arg0.field440 = -1;
                    }
                }
                arg0.field414 = var5.field885;
            }
        }
        if (arg0.field443 > 0) {
            arg0.field443--;
        }
    }

    @ObfuscatedName("cr.am(Lo;IIB)V")
    public static void method1666(class3 arg0, int arg1, int arg2) {
        if (arg0.field440 == arg1 && arg1 != -1) {
            int var3 = class34.method612(arg1).field892;
            if (var3 == 1) {
                arg0.field441 = 0;
                arg0.field442 = 0;
                arg0.field443 = arg2;
                arg0.field444 = 0;
            }
            if (var3 == 2) {
                arg0.field444 = 0;
            }
        } else if (arg1 == -1 || arg0.field440 == -1 || class34.method612(arg1).field886 >= class34.method612(arg0.field440).field886) {
            arg0.field440 = arg1;
            arg0.field441 = 0;
            arg0.field442 = 0;
            arg0.field443 = arg2;
            arg0.field444 = 0;
            arg0.field467 = arg0.field462;
        }
    }

    @ObfuscatedName("bj.ab(B)V")
    public static final void method1420() {
        if (!field614) {
            field620[0] = class135.field2096;
            field561[0] = "";
            field618[0] = 1006;
            field535 = 1;
        }
        if (field516 != -1) {
            Statics.method2730(field516);
        }
        for (int var0 = 0; var0 < field696; var0++) {
            if (field676[var0]) {
                field677[var0] = true;
            }
            field678[var0] = field676[var0];
            field676[var0] = false;
        }
        field675 = field699;
        field622 = -1;
        field623 = -1;
        Statics.field2027 = null;
        if (field516 != -1) {
            field696 = 0;
            method2232(field516, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1797();
        Statics.method152();
        if (field614) {
            method100();
        } else if (field622 != -1) {
            method750(field622, field623);
        }
        if (field643 == 3) {
            for (int var1 = 0; var1 < field696; var1++) {
                if (field678[var1]) {
                    class89.method1803(field679[var1], field680[var1], field681[var1], field682[var1], 16711935, 128);
                } else if (field677[var1]) {
                    class89.method1803(field679[var1], field680[var1], field681[var1], field682[var1], 16711680, 128);
                }
            }
        }
        int var2 = Statics.field1807;
        int var3 = Statics.field428.field418;
        int var4 = Statics.field428.field412;
        int var5 = field547;
        for (class7 var6 = (class7) class7.field101.method3338(); var6 != null; var6 = (class7) class7.field101.method3323()) {
            if (var6.field94 != -1 || var6.field98 != null) {
                int var7 = 0;
                if (var3 > var6.field91) {
                    var7 += var3 - var6.field91;
                } else if (var3 < var6.field89) {
                    var7 += var6.field89 - var3;
                }
                if (var4 > var6.field92) {
                    var7 += var4 - var6.field92;
                } else if (var4 < var6.field107) {
                    var7 += var6.field107 - var4;
                }
                if (var7 - 64 > var6.field93 || field512 == 0 || var6.field88 != var2) {
                    if (var6.field95 != null) {
                        Statics.field1999.method1108(var6.field95);
                        var6.field95 = null;
                    }
                    if (var6.field100 != null) {
                        Statics.field1999.method1108(var6.field100);
                        var6.field100 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = field512 * (var6.field93 - var7) / var6.field93;
                    class57 var10000;
                    if (var6.field95 != null) {
                        var6.field95.method1037(var8);
                    } else if (var6.field94 >= 0) {
                        var10000 = (class57) null;
                        class57 var9 = class57.method1265(Statics.field15, var6.field94, 0);
                        if (var9 != null) {
                            class63 var10 = var9.method1259().method1332(Statics.field1314);
                            class45 var11 = class45.method947(var10, 100, var8);
                            var11.method950(-1);
                            Statics.field1999.method1107(var11);
                            var6.field95 = var11;
                        }
                    }
                    if (var6.field100 != null) {
                        var6.field100.method1037(var8);
                        if (!var6.field100.method3350()) {
                            var6.field100 = null;
                        }
                    } else if (var6.field98 != null && (var6.field99 -= var5) <= 0) {
                        int var12 = (int) (Math.random() * (double) var6.field98.length);
                        var10000 = (class57) null;
                        class57 var13 = class57.method1265(Statics.field15, var6.field98[var12], 0);
                        if (var13 != null) {
                            class63 var14 = var13.method1259().method1332(Statics.field1314);
                            class45 var15 = class45.method947(var14, 100, var8);
                            var15.method950(0);
                            Statics.field1999.method1107(var15);
                            var6.field100 = var15;
                            var6.field99 = var6.field96 + (int) (Math.random() * (double) (var6.field90 - var6.field96));
                        }
                    }
                }
            }
        }
        field547 = 0;
    }

    @ObfuscatedName("p.ax(Ljava/lang/String;ZB)V")
    public static final void method204(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field524.method3407(arg0, 250);
        int var6 = Statics.field524.method3440(arg0, 250) * 13;
        class89.method1854(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1810(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field524.method3386(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method149(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1597(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field865.getGraphics();
            Statics.field1287.method1602(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field865.repaint();
        }
    }

    @ObfuscatedName("cw.az(ZI)V")
    public static final void method1877(boolean arg0) {
        if (Statics.field428.field418 >> 7 == field730 && Statics.field428.field412 >> 7 == field706) {
            field730 = 0;
        }
        int var1 = field701;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field428;
                var4 = 33538048;
            } else {
                var3 = field592[field626[var2]];
                var4 = field626[var2] << 14;
            }
            if (var3 != null && var3.method18()) {
                var3.field48 = false;
                if ((field478 && field701 > 50 || field701 > 200) && !arg0 && var3.field419 == var3.field416) {
                    var3.field48 = true;
                }
                int var5 = var3.field418 >> 7;
                int var6 = var3.field412 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field42 == null || field699 < var3.field38 || field699 >= var3.field39) {
                        if ((var3.field418 & 0x7F) == 64 && (var3.field412 & 0x7F) == 64) {
                            if (field719 == field574[var5][var6]) {
                                continue;
                            }
                            field574[var5][var6] = field719;
                        }
                        var3.field47 = method215(var3.field418, var3.field412, Statics.field1807);
                        Statics.field949.method1901(Statics.field1807, var3.field418, var3.field412, var3.field47, 60, var3, var3.field413, var4, var3.field414);
                    } else {
                        var3.field48 = false;
                        var3.field47 = method215(var3.field418, var3.field412, Statics.field1807);
                        Statics.field949.method1902(Statics.field1807, var3.field418, var3.field412, var3.field47, 60, var3, var3.field413, var4, var3.field44, var3.field31, var3.field46, var3.field36);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ep.at(ZB)V")
    public static final void method2721(boolean arg0) {
        for (int var1 = 0; var1 < field510; var1++) {
            class25 var2 = field509[field499[var1]];
            int var3 = (field499[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field383.field791 == arg0 && var2.field383.method629()) {
                int var4 = var2.field418 >> 7;
                int var5 = var2.field412 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field458 == 1 && (var2.field418 & 0x7F) == 64 && (var2.field412 & 0x7F) == 64) {
                        if (field719 == field574[var4][var5]) {
                            continue;
                        }
                        field574[var4][var5] = field719;
                    }
                    if (!var2.field383.field786) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field949.method1901(Statics.field1807, var2.field418, var2.field412, method215(var2.field418 + (var2.field458 * 64 - 64), var2.field412 + (var2.field458 * 64 - 64), Statics.field1807), var2.field458 * 64 - 64 + 60, var2, var2.field413, var3, var2.field414);
                }
            }
        }
    }

    @ObfuscatedName("y.as(I)V")
    public static final void method224() {
        for (class20 var0 = (class20) field609.method3338(); var0 != null; var0 = (class20) field609.method3323()) {
            if (Statics.field1807 != var0.field288 || var0.field286) {
                var0.method3349();
            } else if (field699 >= var0.field287) {
                var0.method174(field547);
                if (var0.field286) {
                    var0.method3349();
                } else {
                    Statics.field949.method1901(var0.field288, var0.field297, var0.field290, var0.field291, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("cp.aj(I)I")
    public static final int method2056() {
        if (Statics.field219.field191) {
            return Statics.field1807;
        }
        int var0 = 3;
        if (Statics.field28 < 310) {
            int var1 = Statics.field1635 >> 7;
            int var2 = Statics.field2024 >> 7;
            int var3 = Statics.field428.field418 >> 7;
            int var4 = Statics.field428.field412 >> 7;
            if ((class9.field120[Statics.field1807][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1807;
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
                    if ((class9.field120[Statics.field1807][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1807;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field120[Statics.field1807][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1807;
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
                    if ((class9.field120[Statics.field1807][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1807;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field120[Statics.field1807][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1807;
                        }
                    }
                }
            }
        }
        if ((class9.field120[Statics.field1807][Statics.field428.field418 >> 7][Statics.field428.field412 >> 7] & 0x4) != 0) {
            var0 = Statics.field1807;
        }
        return var0;
    }

    @ObfuscatedName("s.aa(I)I")
    public static final int method153() {
        if (Statics.field219.field191) {
            return Statics.field1807;
        } else {
            int var0 = method215(Statics.field1635, Statics.field2024, Statics.field1807);
            return var0 - Statics.field2822 >= 800 || (class9.field120[Statics.field1807][Statics.field1635 >> 7][Statics.field2024 >> 7] & 0x4) == 0 ? 3 : Statics.field1807;
        }
    }

    @ObfuscatedName("n.au(III)V")
    public static final void method99(int arg0, int arg1) {
        if (field536 == 2) {
            method1((field493 - Statics.field401 << 7) + field545, (field697 - Statics.field1268 << 7) + field497, field523 * 2);
            if (field576 > -1 && field699 % 20 < 10) {
                Statics.field1344[0].method1775(field576 + arg0 - 12, field508 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ak.ae(IIIII)V")
    public static final void method654(int arg0, int arg1, int arg2, int arg3) {
        field564 = 0;
        for (int var4 = -1; var4 < field701 + field510; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field428;
            } else if (var4 < field701) {
                var5 = field592[field626[var4]];
            } else {
                var5 = field509[field499[var4 - field701]];
            }
            if (var5 != null && var5.method18()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field383;
                    if (var6.field796 != null) {
                        var6 = var6.method637();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field701) {
                    class31 var9 = ((class25) var5).field383;
                    if (var9.field796 != null) {
                        var9 = var9.method637();
                    }
                    if (var9.field794 >= 0 && var9.field794 < Statics.field853.length) {
                        method1545(var5, var5.field455 + 15);
                        if (field576 > -1) {
                            Statics.field853[var9.field794].method1775(field576 + arg0 - 12, field508 + arg1 - 30);
                        }
                    }
                    if (field536 == 1 && field489 == field499[var4 - field701] && field699 % 20 < 10) {
                        method1545(var5, var5.field455 + 15);
                        if (field576 > -1) {
                            Statics.field1344[0].method1775(field576 + arg0 - 12, field508 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field33 != -1 || var8.field35 != -1) {
                        method1545(var5, var5.field455 + 15);
                        if (field576 > -1) {
                            if (var8.field33 != -1) {
                                Statics.field1764[var8.field33].method1775(field576 + arg0 - 12, field508 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field35 != -1) {
                                Statics.field853[var8.field35].method1775(field576 + arg0 - 12, field508 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field536 == 10 && field492 == field626[var4]) {
                        method1545(var5, var5.field455 + 15);
                        if (field576 > -1) {
                            Statics.field1344[1].method1775(field576 + arg0 - 12, field508 + arg1 - var7);
                        }
                    }
                }
                if (var5.field451 != null && (var4 >= field701 || field501 == 0 || field501 == 3 || field501 == 1 && method2718(((class3) var5).field37))) {
                    method1545(var5, var5.field455);
                    if (field576 > -1 && field564 < field565) {
                        field569[field564] = Statics.field194.method3378(var5.field451) / 2;
                        field594[field564] = Statics.field194.field2832;
                        field566[field564] = field576;
                        field639[field564] = field508;
                        field570[field564] = var5.field424;
                        field571[field564] = var5.field427;
                        field572[field564] = var5.field426;
                        field573[field564] = var5.field451;
                        field564++;
                    }
                }
                if (var5.field431 > field699) {
                    method1545(var5, var5.field455 + 15);
                    if (field576 > -1) {
                        int var10 = var5.field432 * 30 / var5.field433;
                        if (var10 > 30) {
                            var10 = 30;
                        } else if (var10 == 0 && var5.field432 > 0) {
                            var10 = 1;
                        }
                        class89.method1854(field576 + arg0 - 15, field508 + arg1 - 3, var10, 5, 65280);
                        class89.method1854(field576 + arg0 - 15 + var10, field508 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field430[var11] > field699) {
                        method1545(var5, var5.field455 / 2);
                        if (field576 > -1) {
                            if (var11 == 1) {
                                field508 -= 20;
                            }
                            if (var11 == 2) {
                                field576 -= 15;
                                field508 -= 10;
                            }
                            if (var11 == 3) {
                                field576 += 15;
                                field508 -= 10;
                            }
                            Statics.field945[var5.field429[var11]].method1775(field576 + arg0 - 12, field508 + arg1 - 12);
                            Statics.field2342.method3427(Integer.toString(var5.field417[var11]), field576 + arg0 - 1, field508 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field564; var12++) {
            int var13 = field566[var12];
            int var14 = field639[var12];
            int var15 = field569[var12];
            int var16 = field594[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field639[var18] - field594[var18] && var14 - var16 < field639[var18] + 2 && var13 - var15 < field569[var18] + field566[var18] && var13 + var15 > field566[var18] - field569[var18] && field639[var18] - field594[var18] < var14) {
                        var14 = field639[var18] - field594[var18];
                        var17 = true;
                    }
                }
            }
            field576 = field566[var12];
            field508 = field639[var12] = var14;
            String var19 = field573[var12];
            if (field635 == 0) {
                int var20 = 16776960;
                if (field570[var12] < 6) {
                    var20 = field689[field570[var12]];
                }
                if (field570[var12] == 6) {
                    var20 = field719 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field570[var12] == 7) {
                    var20 = field719 % 20 < 10 ? 255 : 65535;
                }
                if (field570[var12] == 8) {
                    var20 = field719 % 20 < 10 ? 45056 : 8454016;
                }
                if (field570[var12] == 9) {
                    int var21 = 150 - field572[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field570[var12] == 10) {
                    int var22 = 150 - field572[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field570[var12] == 11) {
                    int var23 = 150 - field572[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field571[var12] == 0) {
                    Statics.field194.method3427(var19, field576 + arg0, field508 + arg1, var20, 0);
                }
                if (field571[var12] == 1) {
                    Statics.field194.method3431(var19, field576 + arg0, field508 + arg1, var20, 0, field719);
                }
                if (field571[var12] == 2) {
                    Statics.field194.method3388(var19, field576 + arg0, field508 + arg1, var20, 0, field719);
                }
                if (field571[var12] == 3) {
                    Statics.field194.method3424(var19, field576 + arg0, field508 + arg1, var20, 0, field719, 150 - field572[var12]);
                }
                if (field571[var12] == 4) {
                    int var24 = (150 - field572[var12]) * (Statics.field194.method3378(var19) + 100) / 150;
                    class89.method1852(field576 + arg0 - 50, arg1, field576 + arg0 + 50, arg1 + arg3);
                    Statics.field194.method3383(var19, field576 + arg0 + 50 - var24, field508 + arg1, var20, 0);
                    class89.method1798(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field571[var12] == 5) {
                    int var25 = 150 - field572[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1852(arg0, field508 + arg1 - Statics.field194.field2832 - 1, arg0 + arg2, field508 + arg1 + 5);
                    Statics.field194.method3427(var19, field576 + arg0, field508 + arg1 + var26, var20, 0);
                    class89.method1798(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field194.method3427(var19, field576 + arg0, field508 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("b.ao(I)V")
    public static final void method131() {
        field590 = 0;
        int var0 = (Statics.field428.field418 >> 7) + Statics.field401;
        int var1 = (Statics.field428.field412 >> 7) + Statics.field1268;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field590 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field590 = 1;
        }
        if (field590 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field590 = 0;
        }
    }

    @ObfuscatedName("bs.af(Law;IB)V")
    public static final void method1545(class27 arg0, int arg1) {
        method1(arg0.field418, arg0.field412, arg1);
    }

    @ObfuscatedName("j.ar(IIIB)V")
    public static final void method1(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field576 = -1;
            field508 = -1;
            return;
        }
        int var3 = method215(arg0, arg1, Statics.field1807) - arg2;
        int var4 = arg0 - Statics.field1635;
        int var5 = var3 - Statics.field2822;
        int var6 = arg1 - Statics.field2024;
        int var7 = class104.field1776[Statics.field28];
        int var8 = class104.field1791[Statics.field28];
        int var9 = class104.field1776[Statics.field102];
        int var10 = class104.field1791[Statics.field102];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field576 = (var11 << 9) / var15 + 256;
            field508 = (var14 << 9) / var15 + 167;
        } else {
            field576 = -1;
            field508 = -1;
        }
    }

    @ObfuscatedName("e.ay(IIII)I")
    public static final int method215(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field120[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field140[var5][var3][var4] + class9.field140[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field140[var5][var3][var4 + 1] + class9.field140[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cm.av(ZI)V")
    public static final void method2138(boolean arg0) {
        field532 = arg0;
        if (!field532) {
            int var1 = (field654 - field604.field2035) / 16;
            Statics.field2033 = new int[var1][4];
            for (int var2 = 0; var2 < var1; var2++) {
                for (int var3 = 0; var3 < 4; var3++) {
                    Statics.field2033[var2][var3] = field604.method2507();
                }
            }
            int var4 = field604.method2490();
            int var5 = field604.method2496();
            int var6 = field604.method2498();
            int var7 = field604.method2451();
            int var8 = field604.method2498();
            Statics.field1992 = new int[var1];
            Statics.field11 = new int[var1];
            Statics.field175 = new int[var1];
            Statics.field2050 = new byte[var1][];
            Statics.field852 = new byte[var1][];
            boolean var9 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var5 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1992[var10] = var13;
                        Statics.field11[var10] = Statics.field2077.method3074("m" + var11 + "_" + var12);
                        Statics.field175[var10] = Statics.field2077.method3074("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method179(var5, var6, var4, var8, var7);
            return;
        }
        int var14 = field604.method2498();
        int var15 = field604.method2490();
        int var16 = field604.method2582();
        field604.method2339();
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var18 = 0; var18 < 13; var18++) {
                for (int var19 = 0; var19 < 13; var19++) {
                    int var20 = field604.method2353(1);
                    if (var20 == 1) {
                        field533[var17][var18][var19] = field604.method2353(26);
                    } else {
                        field533[var17][var18][var19] = -1;
                    }
                }
            }
        }
        field604.method2330();
        int var21 = (field654 - field604.field2035) / 16;
        Statics.field2033 = new int[var21][4];
        for (int var22 = 0; var22 < var21; var22++) {
            for (int var23 = 0; var23 < 4; var23++) {
                Statics.field2033[var22][var23] = field604.method2585();
            }
        }
        int var24 = field604.method2582();
        int var25 = field604.method2451();
        Statics.field1992 = new int[var21];
        Statics.field11 = new int[var21];
        Statics.field175 = new int[var21];
        Statics.field2050 = new byte[var21][];
        Statics.field852 = new byte[var21][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field533[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1992[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1992[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field11[var26] = Statics.field2077.method3074("m" + var35 + "_" + var36);
                            Statics.field175[var26] = Statics.field2077.method3074("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method179(var16, var25, var15, var24, var14);
    }

    @ObfuscatedName("w.ac(IIIIII)V")
    public static final void method179(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field171 == arg0 && Statics.field208 == arg1 && field525 == arg2 || !field478) {
            return;
        }
        Statics.field171 = arg0;
        Statics.field208 = arg1;
        field525 = arg2;
        if (!field478) {
            field525 = 0;
        }
        method217(25);
        method204(class135.field2103, true);
        int var5 = Statics.field401;
        int var6 = Statics.field1268;
        Statics.field401 = (arg0 - 6) * 8;
        Statics.field1268 = (arg1 - 6) * 8;
        int var7 = Statics.field401 - var5;
        int var8 = Statics.field1268 - var6;
        int var9 = Statics.field401;
        int var10 = Statics.field1268;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field509[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field463[var13] -= var7;
                    var12.field464[var13] -= var8;
                }
                var12.field418 -= var7 * 128;
                var12.field412 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field592[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field463[var16] -= var7;
                    var15.field464[var16] -= var8;
                }
                var15.field418 -= var7 * 128;
                var15.field412 -= var8 * 128;
            }
        }
        Statics.field1807 = arg2;
        Statics.field428.method229(arg3, arg4, false);
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
                        field606[var27][var23][var24] = field606[var27][var25][var26];
                    } else {
                        field606[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field486.method3338(); var28 != null; var28 = (class22) field486.method3323()) {
            var28.field344 -= var7;
            var28.field341 -= var8;
            if (var28.field344 < 0 || var28.field341 < 0 || var28.field344 >= 104 || var28.field341 >= 104) {
                var28.method3349();
            }
        }
        if (field730 != 0) {
            field730 -= var7;
            field706 -= var8;
        }
        field713 = 0;
        field544 = false;
        field700 = -1;
        field609.method3340();
        field608.method3340();
    }

    @ObfuscatedName("ab.aq(ZI)V")
    public static final void method769(boolean arg0) {
        method137();
        field595++;
        if (field595 < 50 && !arg0) {
            return;
        }
        field595 = 0;
        if (field528 || Statics.field56 == null) {
            return;
        }
        field591.method2345(90);
        try {
            Statics.field56.method1385(field591.field2037, 0, field591.field2035);
            field591.field2035 = 0;
        } catch (IOException var2) {
            field528 = true;
        }
    }

    @ObfuscatedName("client.ag(I)V")
    public static final void method557() {
        method769(false);
        field482 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field2050.length; var1++) {
            if (Statics.field11[var1] != -1 && Statics.field2050[var1] == null) {
                Statics.field2050[var1] = Statics.field2077.method3027(Statics.field11[var1], 0);
                if (Statics.field2050[var1] == null) {
                    var0 = false;
                    field482++;
                }
            }
            if (Statics.field175[var1] != -1 && Statics.field852[var1] == null) {
                Statics.field852[var1] = Statics.field2077.method3028(Statics.field175[var1], 0, Statics.field2033[var1]);
                if (Statics.field852[var1] == null) {
                    var0 = false;
                    field482++;
                }
            }
        }
        if (!var0) {
            field530 = 1;
            return;
        }
        field485 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field2050.length; var3++) {
            byte[] var4 = Statics.field852[var3];
            if (var4 != null) {
                int var5 = (Statics.field1992[var3] >> 8) * 64 - Statics.field401;
                int var6 = (Statics.field1992[var3] & 0xFF) * 64 - Statics.field1268;
                if (field532) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class127 var9 = new class127(var4);
                int var10 = -1;
                label443: while (true) {
                    int var11 = var9.method2635();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2635();
                            if (var16 == 0) {
                                continue label443;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2464() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method1406(var10);
                                if (var19 != 22 || !field478 || var22.field821 != 0 || var22.field819 == 1 || var22.field825) {
                                    if (!var22.method668()) {
                                        field485++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2635();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2464();
                    }
                }
            }
        }
        if (!var2) {
            field530 = 2;
            return;
        }
        if (field530 != 0) {
            method204(class135.field2103 + class2.field18 + class2.field30 + 100 + "%" + class2.field19, true);
        }
        method137();
        method58();
        method137();
        Statics.field949.method1891();
        method137();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field506[var23].method2683();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field120[var24][var25][var26] = 0;
                }
            }
        }
        method137();
        class9.field121 = 99;
        Statics.field1988 = new byte[4][104][104];
        Statics.field122 = new byte[4][104][104];
        Statics.field123 = new byte[4][104][104];
        Statics.field124 = new byte[4][104][104];
        Statics.field128 = new int[4][105][105];
        Statics.field749 = new byte[4][105][105];
        Statics.field125 = new int[105][105];
        Statics.field2765 = new int[104];
        Statics.field126 = new int[104];
        Statics.field1041 = new int[104];
        Statics.field1995 = new int[104];
        Statics.field127 = new int[104];
        int var27 = Statics.field2050.length;
        class7.method117();
        method769(true);
        if (!field532) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1992[var28] >> 8) * 64 - Statics.field401;
                int var30 = (Statics.field1992[var28] & 0xFF) * 64 - Statics.field1268;
                byte[] var31 = Statics.field2050[var28];
                if (var31 != null) {
                    method137();
                    int var32 = Statics.field171 * 8 - 48;
                    int var33 = Statics.field208 * 8 - 48;
                    class130[] var34 = field506;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2054[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var38 = new class127(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class9.method216(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field1992[var42] >> 8) * 64 - Statics.field401;
                int var44 = (Statics.field1992[var42] & 0xFF) * 64 - Statics.field1268;
                byte[] var45 = Statics.field2050[var42];
                if (var45 == null && Statics.field208 < 800) {
                    method137();
                    class9.method213(var43, var44, 64, 64);
                }
            }
            method769(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field852[var46];
                if (var47 != null) {
                    int var48 = (Statics.field1992[var46] >> 8) * 64 - Statics.field401;
                    int var49 = (Statics.field1992[var46] & 0xFF) * 64 - Statics.field1268;
                    method137();
                    Statics.method1417(var47, var48, var49, Statics.field949, field506);
                }
            }
        }
        if (field532) {
            for (int var50 = 0; var50 < 4; var50++) {
                method137();
                for (int var51 = 0; var51 < 13; var51++) {
                    for (int var52 = 0; var52 < 13; var52++) {
                        boolean var53 = false;
                        int var54 = field533[var50][var51][var52];
                        if (var54 != -1) {
                            int var55 = var54 >> 24 & 0x3;
                            int var56 = var54 >> 1 & 0x3;
                            int var57 = var54 >> 14 & 0x3FF;
                            int var58 = var54 >> 3 & 0x7FF;
                            int var59 = (var57 / 8 << 8) + var58 / 8;
                            for (int var60 = 0; var60 < Statics.field1992.length; var60++) {
                                if (Statics.field1992[var60] == var59 && Statics.field2050[var60] != null) {
                                    class9.method33(Statics.field2050[var60], var50, var51 * 8, var52 * 8, var55, (var57 & 0x7) * 8, (var58 & 0x7) * 8, var56, field506);
                                    var53 = true;
                                    break;
                                }
                            }
                        }
                        if (!var53) {
                            class9.method87(var50, var51 * 8, var52 * 8);
                        }
                    }
                }
            }
            for (int var61 = 0; var61 < 13; var61++) {
                for (int var62 = 0; var62 < 13; var62++) {
                    int var63 = field533[0][var61][var62];
                    if (var63 == -1) {
                        class9.method213(var61 * 8, var62 * 8, 8, 8);
                    }
                }
            }
            method769(true);
            for (int var64 = 0; var64 < 4; var64++) {
                method137();
                for (int var65 = 0; var65 < 13; var65++) {
                    for (int var66 = 0; var66 < 13; var66++) {
                        int var67 = field533[var64][var65][var66];
                        if (var67 != -1) {
                            int var68 = var67 >> 24 & 0x3;
                            int var69 = var67 >> 1 & 0x3;
                            int var70 = var67 >> 14 & 0x3FF;
                            int var71 = var67 >> 3 & 0x7FF;
                            int var72 = (var70 / 8 << 8) + var71 / 8;
                            for (int var73 = 0; var73 < Statics.field1992.length; var73++) {
                                if (Statics.field1992[var73] == var72 && Statics.field852[var73] != null) {
                                    class9.method2233(Statics.field852[var73], var64, var65 * 8, var66 * 8, var68, (var70 & 0x7) * 8, (var71 & 0x7) * 8, var69, Statics.field949, field506);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method769(true);
        method58();
        method137();
        class9.method1580(Statics.field949, field506);
        method769(true);
        int var74 = class9.field121;
        if (var74 > Statics.field1807) {
            var74 = Statics.field1807;
        }
        if (var74 < Statics.field1807 - 1) {
            int var75 = Statics.field1807 - 1;
        }
        if (field478) {
            Statics.field949.method1927(class9.field121);
        } else {
            Statics.field949.method1927(0);
        }
        for (int var76 = 0; var76 < 104; var76++) {
            for (int var77 = 0; var77 < 104; var77++) {
                method2404(var76, var77);
            }
        }
        method137();
        method1411();
        class32.field805.method3265();
        if (Statics.field1186 != null) {
            field591.method2345(86);
            field591.method2453(1057001181);
        }
        if (!field532) {
            int var78 = (Statics.field171 - 6) / 8;
            int var79 = (Statics.field171 + 6) / 8;
            int var80 = (Statics.field208 - 6) / 8;
            int var81 = (Statics.field208 + 6) / 8;
            for (int var82 = var78 - 1; var82 <= var79 + 1; var82++) {
                for (int var83 = var80 - 1; var83 <= var81 + 1; var83++) {
                    if (var82 < var78 || var82 > var79 || var83 < var80 || var83 > var81) {
                        Statics.field2077.method3045("m" + var82 + "_" + var83);
                        Statics.field2077.method3045("l" + var82 + "_" + var83);
                    }
                }
            }
        }
        method217(30);
        method137();
        class9.method36();
        field591.method2345(235);
        Statics.field252.method1352();
        for (int var84 = 0; var84 < 32; var84++) {
            field1337[var84] = 0L;
        }
        for (int var85 = 0; var85 < 32; var85++) {
            field1331[var85] = 0L;
        }
        Statics.field2724 = 0;
    }

    @ObfuscatedName("p.an(IB)V")
    public static final void method205(int arg0) {
        int[] var1 = Statics.field1031.field1479;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field120[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field949.method1924(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field120[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field949.method1924(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1031.method1714();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field120[arg0][var10][var9] & 0x18) == 0) {
                    method132(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field120[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method132(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field683 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field949.method1919(Statics.field1807, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method1406(var14).field815;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field506[Statics.field1807].field2054;
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
                        field704[field683] = Statics.field276[var15];
                        field702[field683] = var16;
                        field703[field683] = var17;
                        field683++;
                    }
                }
            }
        }
        Statics.field1287.method1669();
    }

    @ObfuscatedName("b.by(IIIIII)V")
    public static final void method132(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field949.method1916(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field949.method1920(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1031.field1479;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method1406(var12);
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
                class87 var14 = Statics.field73[var13.field831];
                if (var14 != null) {
                    int var15 = (var13.field817 * 4 - var14.field1489) / 2;
                    int var16 = (var13.field818 * 4 - var14.field1490) / 2;
                    var14.method1782(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field818) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field949.method1918(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field949.method1920(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method1406(var21);
            if (var22.field831 != -1) {
                class87 var23 = Statics.field73[var22.field831];
                if (var23 != null) {
                    int var24 = (var22.field817 * 4 - var23.field1489) / 2;
                    int var25 = (var22.field818 * 4 - var23.field1490) / 2;
                    var23.method1782(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field818) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1031.field1479;
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
        int var29 = Statics.field949.method1919(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method1406(var30);
        if (var31.field831 == -1) {
            return;
        }
        class87 var32 = Statics.field73[var31.field831];
        if (var32 != null) {
            int var33 = (var31.field817 * 4 - var32.field1489) / 2;
            int var34 = (var31.field818 * 4 - var32.field1490) / 2;
            var32.method1782(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field818) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dg.ba(B)Z")
    public static final boolean method2354() {
        if (Statics.field56 == null) {
            return false;
        }
        try {
            int var0 = Statics.field56.method1384();
            if (var0 == 0) {
                return false;
            }
            if (field479 == -1) {
                Statics.field56.method1400(field604.field2037, 0, 1);
                field604.field2035 = 0;
                field479 = field604.method2348();
                field654 = class165.field2747[field479];
                var0--;
            }
            if (field654 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field56.method1400(field604.field2037, 0, 1);
                field654 = field604.field2037[0] & 0xFF;
                var0--;
            }
            if (field654 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field56.method1400(field604.field2037, 0, 2);
                field604.field2035 = 0;
                field654 = field604.method2582();
                var0 -= 2;
            }
            if (var0 < field654) {
                return false;
            }
            field604.field2035 = 0;
            Statics.field56.method1400(field604.field2037, 0, field654);
            field633 = 0;
            field563 = field521;
            field521 = field520;
            field520 = field479;
            if (field479 == 215) {
                int var1 = field604.method2507();
                int var2 = field604.method2464();
                int var3 = field604.method2498();
                class4 var4 = (class4) field634.method3296((long) var1);
                if (var4 != null) {
                    method173(var4, var4.field55 != var3);
                }
                class4 var5 = new class4();
                var5.field55 = var3;
                var5.field53 = var2;
                field634.method3297(var5, (long) var1);
                if (class159.method2219(var3)) {
                    class159[] var6 = Statics.field2592[var3];
                    for (int var7 = 0; var7 < var6.length; var7++) {
                        class159 var8 = var6[var7];
                        if (var8 != null) {
                            var8.field2703 = 0;
                            var8.field2704 = 0;
                        }
                    }
                }
                class26.method10(var3);
                class159 var9 = Statics.method2760(var1);
                if (var9 != null) {
                    method148(var9);
                }
                if (field637 != null) {
                    method148(field637);
                    field637 = null;
                }
                method3222();
                if (field516 != -1) {
                    method114(field516, 1);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 13) {
                field604.field2035 += 28;
                if (field604.method2484()) {
                    class116 var10 = field604;
                    int var11 = field604.field2035 - 28;
                    if (class82.field1441 != null) {
                        try {
                            class82.field1441.method592(0L);
                            class82.field1441.method597(var10.field2037, var11, 24);
                        } catch (Exception var278) {
                        }
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 117) {
                int var13 = field604.method2505();
                String var14 = field604.method2518();
                class159 var15 = Statics.method2760(var13);
                if (!var14.equals(var15.field2644)) {
                    var15.field2644 = var14;
                    method148(var15);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 239) {
                int var16 = field604.method2508();
                int var17 = field604.method2582();
                if (var16 < -70000) {
                    var17 += 32768;
                }
                class159 var18;
                if (var16 >= 0) {
                    var18 = Statics.method2760(var16);
                } else {
                    var18 = null;
                }
                if (var18 != null) {
                    for (int var19 = 0; var19 < var18.field2699.length; var19++) {
                        var18.field2699[var19] = 0;
                        var18.field2700[var19] = 0;
                    }
                }
                class19.method1391(var17);
                int var20 = field604.method2582();
                for (int var21 = 0; var21 < var20; var21++) {
                    int var22 = field604.method2582();
                    int var23 = field604.method2488();
                    if (var23 == 255) {
                        var23 = field604.method2507();
                    }
                    if (var18 != null && var21 < var18.field2699.length) {
                        var18.field2699[var21] = var22;
                        var18.field2700[var21] = var23;
                    }
                    class19.method2216(var17, var21, var22 - 1, var23);
                }
                if (var18 != null) {
                    method148(var18);
                }
                method1674();
                field503[++field694 - 1 & 0x1F] = var17 & 0x7FFF;
                field479 = -1;
                return true;
            }
            if (field479 == 57) {
                method707();
                field479 = -1;
                return true;
            }
            if (field479 == 181) {
                while (field604.field2035 < field654) {
                    boolean var24 = field604.method2464() == 1;
                    String var25 = field604.method2518();
                    String var26 = field604.method2518();
                    int var27 = field604.method2582();
                    int var28 = field604.method2464();
                    int var29 = field604.method2464();
                    boolean var30 = (var29 & 0x2) != 0;
                    boolean var31 = (var29 & 0x1) != 0;
                    if (var27 > 0) {
                        field604.method2518();
                        field604.method2464();
                        field604.method2508();
                    }
                    field604.method2518();
                    for (int var32 = 0; var32 < field725; var32++) {
                        class23 var33 = field727[var32];
                        if (var24) {
                            if (var26.equals(var33.field359)) {
                                var33.field359 = var25;
                                var33.field356 = var26;
                                var25 = null;
                                break;
                            }
                        } else if (var25.equals(var33.field359)) {
                            if (var33.field357 != var27) {
                                boolean var34 = true;
                                for (class28 var35 = (class28) field531.method3293(); var35 != null; var35 = (class28) field531.method3285()) {
                                    if (var35.field740.equals(var25)) {
                                        if (var27 != 0 && var35.field744 == 0) {
                                            var35.method3346();
                                            var34 = false;
                                        } else if (var27 == 0 && var35.field744 != 0) {
                                            var35.method3346();
                                            var34 = false;
                                        }
                                    }
                                }
                                if (var34) {
                                    field531.method3288(new class28(var25, var27));
                                }
                                var33.field357 = var27;
                            }
                            var33.field356 = var26;
                            var33.field366 = var28;
                            var33.field361 = var30;
                            var33.field360 = var31;
                            var25 = null;
                            break;
                        }
                    }
                    if (var25 != null && field725 < 400) {
                        class23 var36 = new class23();
                        field727[field725] = var36;
                        var36.field359 = var25;
                        var36.field356 = var26;
                        var36.field357 = var27;
                        var36.field366 = var28;
                        var36.field361 = var30;
                        var36.field360 = var31;
                        field725++;
                    }
                }
                field726 = 2;
                field664 = field656;
                boolean var37 = false;
                int var38 = field725;
                while (var38 > 0) {
                    boolean var39 = true;
                    var38--;
                    for (int var40 = 0; var40 < var38; var40++) {
                        boolean var41 = false;
                        class23 var42 = field727[var40];
                        class23 var43 = field727[var40 + 1];
                        if (field718 != var42.field357 && field718 == var43.field357) {
                            var41 = true;
                        }
                        if (!var41 && var42.field357 == 0 && var43.field357 != 0) {
                            var41 = true;
                        }
                        if (!var41 && !var42.field361 && var43.field361) {
                            var41 = true;
                        }
                        if (!var41 && !var42.field360 && var43.field360) {
                            var41 = true;
                        }
                        if (var41) {
                            class23 var44 = field727[var40];
                            field727[var40] = field727[var40 + 1];
                            field727[var40 + 1] = var44;
                            var39 = false;
                        }
                    }
                    if (var39) {
                        break;
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 252) {
                int var45 = field604.method2451();
                if (var45 == 65535) {
                    var45 = -1;
                }
                int var46 = field604.method2498();
                if (var46 == 65535) {
                    var46 = -1;
                }
                int var47 = field604.method2585();
                int var48 = field604.method2507();
                for (int var49 = var46; var49 <= var45; var49++) {
                    long var50 = ((long) var48 << 32) + (long) var49;
                    class179 var52 = field673.method3296(var50);
                    if (var52 != null) {
                        var52.method3349();
                    }
                    field673.method3297(new class171(var47), var50);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 178) {
                byte var53 = field604.method2564();
                int var54 = field604.method2498();
                class160.field2717[var54] = var53;
                if (class160.field2716[var54] != var53) {
                    class160.field2716[var54] = var53;
                    method1889(var54);
                }
                field657[++field537 - 1 & 0x1F] = var54;
                field479 = -1;
                return true;
            }
            if (field479 == 177) {
                field544 = true;
                Statics.field1048 = field604.method2464();
                Statics.field409 = field604.method2464();
                Statics.field1305 = field604.method2582();
                Statics.field1038 = field604.method2464();
                Statics.field245 = field604.method2464();
                if (Statics.field245 >= 100) {
                    int var55 = Statics.field1048 * 128 + 64;
                    int var56 = Statics.field409 * 128 + 64;
                    int var57 = method215(var55, var56, Statics.field1807) - Statics.field1305;
                    int var58 = var55 - Statics.field1635;
                    int var59 = var57 - Statics.field2822;
                    int var60 = var56 - Statics.field2024;
                    int var61 = (int) Math.sqrt((double) (var58 * var58 + var60 * var60));
                    Statics.field28 = (int) (Math.atan2((double) var59, (double) var61) * 325.949D) & 0x7FF;
                    Statics.field102 = (int) (Math.atan2((double) var58, (double) var60) * -325.949D) & 0x7FF;
                    if (Statics.field28 < 128) {
                        Statics.field28 = 128;
                    }
                    if (Statics.field28 > 383) {
                        Statics.field28 = 383;
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 180) {
                int var62 = field654 + field604.field2035;
                int var63 = field604.method2582();
                int var64 = field604.method2582();
                if (field516 != var63) {
                    field516 = var63;
                    method43(field516);
                    class26.method10(field516);
                    for (int var65 = 0; var65 < 100; var65++) {
                        field676[var65] = true;
                    }
                }
                while (var64-- > 0) {
                    int var66 = field604.method2508();
                    int var67 = field604.method2582();
                    int var68 = field604.method2464();
                    class4 var69 = (class4) field634.method3296((long) var66);
                    if (var69 != null && var69.field55 != var67) {
                        method173(var69, true);
                        var69 = null;
                    }
                    if (var69 == null) {
                        class4 var70 = new class4();
                        var70.field55 = var67;
                        var70.field53 = var68;
                        field634.method3297(var70, (long) var66);
                        method43(var67);
                        class26.method10(var67);
                        class159 var71 = Statics.method2760(var66);
                        if (var71 != null) {
                            method148(var71);
                        }
                        if (field637 != null) {
                            method148(field637);
                            field637 = null;
                        }
                        method3222();
                        if (field516 != -1) {
                            method114(field516, 1);
                        }
                        var69 = var70;
                    }
                    var69.field54 = true;
                }
                for (class4 var73 = (class4) field634.method3298(); var73 != null; var73 = (class4) field634.method3299()) {
                    if (var73.field54) {
                        var73.field54 = false;
                    } else {
                        method173(var73, true);
                    }
                }
                field673 = new class175(512);
                while (field604.field2035 < var62) {
                    int var74 = field604.method2508();
                    int var75 = field604.method2582();
                    int var76 = field604.method2582();
                    int var77 = field604.method2508();
                    for (int var78 = var75; var78 <= var76; var78++) {
                        long var79 = ((long) var74 << 32) + (long) var78;
                        field673.method3297(new class171(var77), var79);
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 243) {
                method2138(false);
                field479 = -1;
                return true;
            }
            if (field479 == 88) {
                int var81 = field604.method2498();
                field516 = var81;
                if (class159.method2219(var81)) {
                    class159[] var82 = Statics.field2592[var81];
                    for (int var83 = 0; var83 < var82.length; var83++) {
                        class159 var84 = var82[var83];
                        if (var84 != null) {
                            var84.field2703 = 0;
                            var84.field2704 = 0;
                        }
                    }
                }
                class26.method10(field516);
                for (int var85 = 0; var85 < 100; var85++) {
                    field676[var85] = true;
                }
                field479 = -1;
                return true;
            }
            if (field479 == 34) {
                for (int var86 = 0; var86 < Statics.field1036; var86++) {
                    class42 var87 = class42.method2199(var86);
                    if (var87 != null && var87.field1045 == 0) {
                        class160.field2717[var86] = 0;
                        class160.field2716[var86] = 0;
                    }
                }
                method1674();
                field537 += 32;
                field479 = -1;
                return true;
            }
            if (field479 == 145) {
                Statics.field1285 = field604.method2490();
                Statics.field182 = field604.method2488();
                for (int var88 = Statics.field1285; var88 < Statics.field1285 + 8; var88++) {
                    for (int var89 = Statics.field182; var89 < Statics.field182 + 8; var89++) {
                        if (field606[Statics.field1807][var88][var89] != null) {
                            field606[Statics.field1807][var88][var89] = null;
                            method2404(var88, var89);
                        }
                    }
                }
                for (class22 var90 = (class22) field486.method3338(); var90 != null; var90 = (class22) field486.method3323()) {
                    if (var90.field344 >= Statics.field1285 && var90.field344 < Statics.field1285 + 8 && var90.field341 >= Statics.field182 && var90.field341 < Statics.field182 + 8 && Statics.field1807 == var90.field350) {
                        var90.field340 = 0;
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 94) {
                field501 = field604.method2464();
                field691 = field604.method2464();
                field479 = -1;
                return true;
            }
            if (field479 == 208) {
                int var91 = field604.method2505();
                int var92 = field604.method2498();
                int var93 = field604.method2498();
                int var94 = field604.method2582();
                class159 var95 = Statics.method2760(var91);
                if (var95.field2637 != var92 || var95.field2638 != var93 || var95.field2611 != var94) {
                    var95.field2637 = var92;
                    var95.field2638 = var93;
                    var95.field2611 = var94;
                    method148(var95);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 118) {
                field737 = field604.method2496() * 30;
                field666 = field656;
                field479 = -1;
                return true;
            }
            if (field479 == 191) {
                int var96 = field604.method2508();
                int var97 = field604.method2582();
                if (var96 < -70000) {
                    var97 += 32768;
                }
                class159 var98;
                if (var96 >= 0) {
                    var98 = Statics.method2760(var96);
                } else {
                    var98 = null;
                }
                while (field604.field2035 < field654) {
                    int var99 = field604.method2635();
                    int var100 = field604.method2582();
                    int var101 = 0;
                    if (var100 != 0) {
                        var101 = field604.method2464();
                        if (var101 == 255) {
                            var101 = field604.method2508();
                        }
                    }
                    if (var98 != null && var99 >= 0 && var99 < var98.field2699.length) {
                        var98.field2699[var99] = var100;
                        var98.field2700[var99] = var101;
                    }
                    class19.method2216(var97, var99, var100 - 1, var101);
                }
                if (var98 != null) {
                    method148(var98);
                }
                method1674();
                field503[++field694 - 1 & 0x1F] = var97 & 0x7FFF;
                field479 = -1;
                return true;
            }
            if (field479 == 217) {
                method1286();
                field479 = -1;
                return false;
            }
            if (field479 == 28) {
                method2138(true);
                field479 = -1;
                return true;
            }
            if (field479 == 251) {
                int var102 = field604.method2496();
                int var103 = field604.method2505();
                int var104 = var102 >> 10 & 0x1F;
                int var105 = var102 >> 5 & 0x1F;
                int var106 = var102 & 0x1F;
                int var107 = (var106 << 3) + (var104 << 19) + (var105 << 11);
                class159 var108 = Statics.method2760(var103);
                if (var108.field2614 != var107) {
                    var108.field2614 = var107;
                    method148(var108);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 188) {
                int var109 = field604.method2508();
                class159 var110 = Statics.method2760(var109);
                var110.field2679 = 3;
                var110.field2587 = Statics.field428.field43.method3226();
                method148(var110);
                field479 = -1;
                return true;
            }
            if (field479 == 109) {
                method1674();
                field511 = field604.method2467();
                field666 = field656;
                field479 = -1;
                return true;
            }
            if (field479 == 245) {
                Statics.field1285 = field604.method2464();
                Statics.field182 = field604.method2523();
                while (field604.field2035 < field654) {
                    field479 = field604.method2464();
                    method2135();
                }
                field479 = -1;
                return true;
            }
            if (field479 == 97) {
                String var111 = field604.method2518();
                Object[] var112 = new Object[var111.length() + 1];
                for (int var113 = var111.length() - 1; var113 >= 0; var113--) {
                    if (var111.charAt(var113) == 's') {
                        var112[var113 + 1] = field604.method2518();
                    } else {
                        var112[var113 + 1] = Integer.valueOf(field604.method2508());
                    }
                }
                var112[0] = Integer.valueOf(field604.method2508());
                class1 var114 = new class1();
                var114.field10 = var112;
                class26.method1675(var114);
                field479 = -1;
                return true;
            }
            if (field479 == 107) {
                class182.method2141(field604, field654);
                field479 = -1;
                return true;
            }
            if (field479 == 2) {
                int var115 = field604.method2508();
                int var116 = field604.method2617();
                class159 var117 = Statics.method2760(var115);
                if (var117.field2633 != var116 || var116 == -1) {
                    var117.field2633 = var116;
                    var117.field2703 = 0;
                    var117.field2704 = 0;
                    method148(var117);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 221) {
                String var118 = field604.method2518();
                long var119 = field604.method2631();
                long var121 = (long) field604.method2582();
                long var123 = (long) field604.method2643();
                int var125 = field604.method2464();
                long var126 = (var121 << 32) + var123;
                boolean var128 = false;
                for (int var129 = 0; var129 < 100; var129++) {
                    if (field692[var129] == var126) {
                        var128 = true;
                        break;
                    }
                }
                if (var125 <= 1 && method808(var118)) {
                    var128 = true;
                }
                if (!var128 && field590 == 0) {
                    field692[field638] = var126;
                    field638 = (field638 + 1) % 100;
                    class116 var130 = field604;
                    String var134;
                    try {
                        int var131 = var130.method2635();
                        if (var131 > 32767) {
                            var131 = 32767;
                        }
                        byte[] var132 = new byte[var131];
                        var130.field2035 += Statics.field2824.method2384(var130.field2037, var130.field2035, var132, 0, var131);
                        String var133 = class150.method2061(var132, 0, var131);
                        var134 = var133;
                    } catch (Exception var277) {
                        var134 = "Cabbage";
                    }
                    String var137 = class185.method3392(Statics.method1536(var134));
                    if (var125 == 2 || var125 == 3) {
                        method16(9, class2.method1546(1) + var118, var137, class147.method2876(var119));
                    } else if (var125 == 1) {
                        method16(9, class2.method1546(0) + var118, var137, class147.method2876(var119));
                    } else {
                        method16(9, var118, var137, class147.method2876(var119));
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 189) {
                int var138 = field604.method2496();
                int var139 = field604.method2585();
                int var140 = field604.method2582();
                class159 var141 = Statics.method2760(var139);
                var141.field2641 = (var140 << 16) + var138;
                field479 = -1;
                return true;
            }
            if (field479 == 153) {
                int var142 = field604.method2505();
                boolean var143 = field604.method2490() == 1;
                class159 var144 = Statics.method2760(var142);
                if (var144.field2660 != var143) {
                    var144.field2660 = var143;
                    method148(var144);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 240) {
                String var145 = field604.method2518();
                long var146 = (long) field604.method2582();
                long var148 = (long) field604.method2643();
                int var150 = field604.method2464();
                long var151 = (var146 << 32) + var148;
                boolean var153 = false;
                for (int var154 = 0; var154 < 100; var154++) {
                    if (field692[var154] == var151) {
                        var153 = true;
                        break;
                    }
                }
                if (method808(var145)) {
                    var153 = true;
                }
                if (!var153 && field590 == 0) {
                    field692[field638] = var151;
                    field638 = (field638 + 1) % 100;
                    class116 var155 = field604;
                    String var159;
                    try {
                        int var156 = var155.method2635();
                        if (var156 > 32767) {
                            var156 = 32767;
                        }
                        byte[] var157 = new byte[var156];
                        var155.field2035 += Statics.field2824.method2384(var155.field2037, var155.field2035, var157, 0, var156);
                        String var158 = class150.method2061(var157, 0, var156);
                        var159 = var158;
                    } catch (Exception var276) {
                        var159 = "Cabbage";
                    }
                    String var162 = class185.method3392(Statics.method1536(var159));
                    if (var150 == 2 || var150 == 3) {
                        method1647(7, class2.method1546(1) + var145, var162);
                    } else if (var150 == 1) {
                        method1647(7, class2.method1546(0) + var145, var162);
                    } else {
                        method1647(3, var145, var162);
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 196) {
                field707 = field604.method2464();
                field479 = -1;
                return true;
            }
            if (field479 == 35) {
                field536 = field604.method2464();
                if (field536 == 1) {
                    field489 = field604.method2582();
                }
                if (field536 >= 2 && field536 <= 6) {
                    if (field536 == 2) {
                        field545 = 64;
                        field497 = 64;
                    }
                    if (field536 == 3) {
                        field545 = 0;
                        field497 = 64;
                    }
                    if (field536 == 4) {
                        field545 = 128;
                        field497 = 64;
                    }
                    if (field536 == 5) {
                        field545 = 64;
                        field497 = 0;
                    }
                    if (field536 == 6) {
                        field545 = 64;
                        field497 = 128;
                    }
                    field536 = 2;
                    field493 = field604.method2582();
                    field697 = field604.method2582();
                    field523 = field604.method2464();
                }
                if (field536 == 10) {
                    field492 = field604.method2582();
                }
                field479 = -1;
                return true;
            }
            if (field479 == 186) {
                int var163 = field604.method2585();
                Statics.field2554 = Statics.field896.method1492(var163);
                field479 = -1;
                return true;
            }
            if (field479 == 47) {
                if (field516 != -1) {
                    method114(field516, 0);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 142) {
                for (int var164 = 0; var164 < field592.length; var164++) {
                    if (field592[var164] != null) {
                        field592[var164].field440 = -1;
                    }
                }
                for (int var165 = 0; var165 < field509.length; var165++) {
                    if (field509[var165] != null) {
                        field509[var165].field440 = -1;
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 167) {
                int var166 = field604.method2582();
                int var167 = field604.method2464();
                int var168 = field604.method2582();
                method567(var166, var167, var168);
                field479 = -1;
                return true;
            }
            if (field479 == 214) {
                int var169 = field604.method2464();
                int var170 = field604.method2464();
                int var171 = field604.method2464();
                int var172 = field604.method2464();
                field720[var169] = true;
                field721[var169] = var170;
                field496[var169] = var171;
                field577[var169] = var172;
                field517[var169] = 0;
                field479 = -1;
                return true;
            }
            if (field479 == 105) {
                Statics.field182 = field604.method2488();
                Statics.field1285 = field604.method2464();
                field479 = -1;
                return true;
            }
            if (field479 == 130) {
                int var173 = field604.method2451();
                int var174 = field604.method2585();
                class159 var175 = Statics.method2760(var174);
                if (var175 != null && var175.field2599 == 0) {
                    if (var173 > var175.field2669 - var175.field2705) {
                        var173 = var175.field2669 - var175.field2705;
                    }
                    if (var173 < 0) {
                        var173 = 0;
                    }
                    if (var175.field2597 != var173) {
                        var175.field2597 = var173;
                        method148(var175);
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 162) {
                int var176 = field604.method2585();
                int var177 = field604.method2582();
                class159 var178 = Statics.method2760(var176);
                if (var178.field2679 != 2 || var178.field2587 != var177) {
                    var178.field2679 = 2;
                    var178.field2587 = var177;
                    method148(var178);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 204) {
                int var179 = field604.method2582();
                class19.method246(var179);
                field503[++field694 - 1 & 0x1F] = var179 & 0x7FFF;
                field479 = -1;
                return true;
            }
            if (field479 == 123) {
                field544 = false;
                for (int var180 = 0; var180 < 5; var180++) {
                    field720[var180] = false;
                }
                field479 = -1;
                return true;
            }
            if (field479 == 241) {
                String var181 = field604.method2518();
                if (var181.endsWith(":tradereq:")) {
                    String var182 = var181.substring(0, var181.indexOf(":"));
                    boolean var183 = false;
                    if (method808(var182)) {
                        var183 = true;
                    }
                    if (!var183 && field590 == 0) {
                        method1647(4, var182, class135.field2153);
                    }
                } else if (var181.endsWith(":duelreq:")) {
                    String var184 = var181.substring(0, var181.indexOf(":"));
                    boolean var185 = false;
                    if (method808(var184)) {
                        var185 = true;
                    }
                    if (!var185 && field590 == 0) {
                        method1647(8, var184, class135.field2290);
                    }
                } else if (var181.endsWith(":chalreq:")) {
                    String var186 = var181.substring(0, var181.indexOf(":"));
                    boolean var187 = false;
                    if (method808(var186)) {
                        var187 = true;
                    }
                    if (!var187 && field590 == 0) {
                        String var188 = var181.substring(var181.indexOf(":") + 1, var181.length() - 9);
                        method1647(8, var186, var188);
                    }
                } else if (var181.endsWith(":assistreq:")) {
                    String var189 = var181.substring(0, var181.indexOf(":"));
                    boolean var190 = false;
                    if (method808(var189)) {
                        var190 = true;
                    }
                    if (!var190 && field590 == 0) {
                        method1647(10, var189, "");
                    }
                } else if (var181.endsWith(":clan:")) {
                    String var191 = var181.substring(0, var181.indexOf(":clan:"));
                    method1647(11, "", var191);
                } else if (var181.endsWith(":trade:")) {
                    String var192 = var181.substring(0, var181.indexOf(":trade:"));
                    if (field590 == 0) {
                        method1647(12, "", var192);
                    }
                } else if (var181.endsWith(":assist:")) {
                    String var193 = var181.substring(0, var181.indexOf(":assist:"));
                    if (field590 == 0) {
                        method1647(13, "", var193);
                    }
                } else {
                    method1647(0, "", var181);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 62) {
                int var194 = field604.method2582();
                if (var194 == 65535) {
                    var194 = -1;
                }
                if (var194 == -1 && !field514) {
                    Statics.field2345.method2850();
                    class139.field2347 = 1;
                    Statics.field2346 = null;
                } else if (var194 != -1 && field709 != var194 && field515 != 0 && !field514) {
                    class139.method2392(2, Statics.field2449, var194, 0, field515, false);
                }
                field709 = var194;
                field479 = -1;
                return true;
            }
            if (field479 == 3) {
                int var195 = field604.method2501();
                int var196 = field604.method2498();
                if (var196 == 65535) {
                    var196 = -1;
                }
                method590(var196, var195);
                field479 = -1;
                return true;
            }
            if (field479 == 58) {
                int var197 = field604.method2488();
                String var198 = field604.method2518();
                int var199 = field604.method2523();
                if (var197 >= 1 && var197 <= 8) {
                    if (var198.equalsIgnoreCase("null")) {
                        var198 = null;
                    }
                    field603[var197 - 1] = var198;
                    field693[var197 - 1] = var199 == 0;
                }
                field479 = -1;
                return true;
            }
            if (field479 == 202) {
                int var200 = field604.method2507();
                int var201 = field604.method2498();
                class159 var202 = Statics.method2760(var200);
                if (var202.field2679 != 1 || var202.field2587 != var201) {
                    var202.field2679 = 1;
                    var202.field2587 = var201;
                    method148(var202);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 197) {
                String var203 = field604.method2518();
                int var204 = field604.method2582();
                byte var205 = field604.method2449();
                boolean var206 = false;
                if (var205 == -128) {
                    var206 = true;
                }
                if (var206) {
                    if (Statics.field206 == 0) {
                        field479 = -1;
                        return true;
                    }
                    boolean var207 = false;
                    int var208;
                    for (var208 = 0; var208 < Statics.field206 && (!Statics.field1273[var208].field114.equals(var203) || Statics.field1273[var208].field111 != var204); var208++) {
                    }
                    if (var208 < Statics.field206) {
                        while (var208 < Statics.field206 - 1) {
                            Statics.field1273[var208] = Statics.field1273[var208 + 1];
                            var208++;
                        }
                        Statics.field206--;
                        Statics.field1273[Statics.field206] = null;
                    }
                } else {
                    field604.method2518();
                    class8 var209 = new class8();
                    var209.field114 = var203;
                    var209.field109 = class149.method29(var209.field114, Statics.field668);
                    var209.field111 = var204;
                    var209.field110 = var205;
                    int var210;
                    for (var210 = Statics.field206 - 1; var210 >= 0; var210--) {
                        int var211 = Statics.field1273[var210].field109.compareTo(var209.field114);
                        if (var211 == 0) {
                            Statics.field1273[var210].field111 = var204;
                            Statics.field1273[var210].field110 = var205;
                            if (var203.equals(Statics.field428.field37)) {
                                Statics.field139 = var205;
                            }
                            field665 = field656;
                            field479 = -1;
                            return true;
                        }
                        if (var211 < 0) {
                            break;
                        }
                    }
                    if (Statics.field206 >= Statics.field1273.length) {
                        field479 = -1;
                        return true;
                    }
                    for (int var212 = Statics.field206 - 1; var212 > var210; var212--) {
                        Statics.field1273[var212 + 1] = Statics.field1273[var212];
                    }
                    if (Statics.field206 == 0) {
                        Statics.field1273 = new class8[100];
                    }
                    Statics.field1273[var210 + 1] = var209;
                    Statics.field206++;
                    if (var203.equals(Statics.field428.field37)) {
                        Statics.field139 = var205;
                    }
                }
                field665 = field656;
                field479 = -1;
                return true;
            }
            if (field479 == 64) {
                while (field604.field2035 < field654) {
                    int var213 = field604.method2464();
                    boolean var214 = (var213 & 0x1) == 1;
                    String var215 = field604.method2518();
                    String var216 = field604.method2518();
                    field604.method2518();
                    for (int var217 = 0; var217 < field729; var217++) {
                        class11 var218 = field494[var217];
                        if (var214) {
                            if (var216.equals(var218.field186)) {
                                var218.field186 = var215;
                                var218.field180 = var216;
                                var215 = null;
                                break;
                            }
                        } else if (var215.equals(var218.field186)) {
                            var218.field186 = var215;
                            var218.field180 = var216;
                            var215 = null;
                            break;
                        }
                    }
                    if (var215 != null && field729 < 400) {
                        class11 var219 = new class11();
                        field494[field729] = var219;
                        var219.field186 = var215;
                        var219.field180 = var216;
                        field729++;
                    }
                }
                field664 = field656;
                field479 = -1;
                return true;
            }
            if (field479 == 26) {
                int var220 = field604.method2585();
                class159 var221 = Statics.method2760(var220);
                for (int var222 = 0; var222 < var221.field2699.length; var222++) {
                    var221.field2699[var222] = -1;
                    var221.field2699[var222] = 0;
                }
                method148(var221);
                field479 = -1;
                return true;
            }
            if (field479 == 99) {
                field726 = 1;
                field664 = field656;
                field479 = -1;
                return true;
            }
            if (field479 == 86) {
                String var223 = field604.method2518();
                class116 var224 = field604;
                String var228;
                try {
                    int var225 = var224.method2635();
                    if (var225 > 32767) {
                        var225 = 32767;
                    }
                    byte[] var226 = new byte[var225];
                    var224.field2035 += Statics.field2824.method2384(var224.field2037, var224.field2035, var226, 0, var225);
                    String var227 = class150.method2061(var226, 0, var225);
                    var228 = var227;
                } catch (Exception var275) {
                    var228 = "Cabbage";
                }
                String var231 = class185.method3392(Statics.method1536(var228));
                method1647(6, var223, var231);
                field479 = -1;
                return true;
            }
            if (field479 == 80) {
                method1674();
                int var232 = field604.method2585();
                int var233 = field604.method2490();
                int var234 = field604.method2488();
                field612[var234] = var232;
                field610[var234] = var233;
                field611[var234] = 1;
                for (int var235 = 0; var235 < 98; var235++) {
                    if (var232 >= class131.field2061[var235]) {
                        field611[var234] = var235 + 2;
                    }
                }
                field661[++field662 - 1 & 0x1F] = var234;
                field479 = -1;
                return true;
            }
            if (field479 == 83) {
                for (int var236 = 0; var236 < class160.field2716.length; var236++) {
                    if (class160.field2717[var236] != class160.field2716[var236]) {
                        class160.field2716[var236] = class160.field2717[var236];
                        method1889(var236);
                        field657[++field537 - 1 & 0x1F] = var236;
                    }
                }
                field479 = -1;
                return true;
            }
            if (field479 == 59) {
                field544 = true;
                Statics.field1324 = field604.method2464();
                Statics.field2471 = field604.method2464();
                Statics.field378 = field604.method2582();
                Statics.field1097 = field604.method2464();
                Statics.field1290 = field604.method2464();
                if (Statics.field1290 >= 100) {
                    Statics.field1635 = Statics.field1324 * 128 + 64;
                    Statics.field2024 = Statics.field2471 * 128 + 64;
                    Statics.field2822 = method215(Statics.field1635, Statics.field2024, Statics.field1807) - Statics.field378;
                }
                field479 = -1;
                return true;
            }
            if (field479 == 92) {
                int var237 = field604.method2617();
                int var238 = field604.method2617();
                int var239 = field604.method2505();
                class159 var240 = Statics.method2760(var239);
                int var241 = var240.field2594 + var238;
                int var242 = var240.field2683 + var237;
                if (var240.field2593 != var241 || var240.field2603 != var242) {
                    var240.field2593 = var241;
                    var240.field2603 = var242;
                    method148(var240);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 210) {
                int var243 = field604.method2508();
                int var244 = field604.method2508();
                int var245 = field604.method2498();
                if (var245 == 65535) {
                    var245 = -1;
                }
                class159 var246 = Statics.method2760(var243);
                if (var246.field2596) {
                    var246.field2701 = var245;
                    var246.field2702 = var244;
                    class40 var248 = class40.method712(var245);
                    var246.field2637 = var248.field989;
                    var246.field2638 = var248.field990;
                    var246.field2629 = var248.field979;
                    var246.field2635 = var248.field992;
                    var246.field2708 = var248.field993;
                    var246.field2611 = var248.field974;
                    if (var246.field2707 > 0) {
                        var246.field2611 = var246.field2611 * 32 / var246.field2707;
                    }
                    method148(var246);
                } else if (var245 == -1) {
                    var246.field2679 = 0;
                    field479 = -1;
                    return true;
                } else {
                    class40 var247 = class40.method712(var245);
                    var246.field2679 = 4;
                    var246.field2587 = var245;
                    var246.field2637 = var247.field989;
                    var246.field2638 = var247.field990;
                    var246.field2611 = var247.field974 * 100 / var244;
                    method148(var246);
                }
                field479 = -1;
                return true;
            }
            if (field479 == 36) {
                field665 = field656;
                if (field654 == 0) {
                    field698 = null;
                    field690 = null;
                    Statics.field206 = 0;
                    Statics.field1273 = null;
                    field479 = -1;
                    return true;
                }
                field690 = field604.method2518();
                long var249 = field604.method2631();
                field698 = class147.method30(var249);
                Statics.field2460 = field604.method2449();
                int var251 = field604.method2464();
                if (var251 == 255) {
                    field479 = -1;
                    return true;
                }
                Statics.field206 = var251;
                class8[] var252 = new class8[100];
                for (int var253 = 0; var253 < Statics.field206; var253++) {
                    var252[var253] = new class8();
                    var252[var253].field114 = field604.method2518();
                    var252[var253].field109 = class149.method29(var252[var253].field114, Statics.field668);
                    var252[var253].field111 = field604.method2582();
                    var252[var253].field110 = field604.method2449();
                    field604.method2518();
                    if (var252[var253].field114.equals(Statics.field428.field37)) {
                        Statics.field139 = var252[var253].field110;
                    }
                }
                boolean var254 = false;
                int var255 = Statics.field206;
                while (var255 > 0) {
                    boolean var256 = true;
                    var255--;
                    for (int var257 = 0; var257 < var255; var257++) {
                        if (var252[var257].field109.compareTo(var252[var257 + 1].field109) > 0) {
                            class8 var258 = var252[var257];
                            var252[var257] = var252[var257 + 1];
                            var252[var257 + 1] = var258;
                            var256 = false;
                        }
                    }
                    if (var256) {
                        break;
                    }
                }
                Statics.field1273 = var252;
                field479 = -1;
                return true;
            }
            if (field479 == 134) {
                field730 = 0;
                field479 = -1;
                return true;
            }
            if (field479 == 156) {
                method138();
                field479 = -1;
                return true;
            }
            if (field479 == 54) {
                int var259 = field604.method2507();
                int var260 = field604.method2451();
                class160.field2717[var260] = var259;
                if (class160.field2716[var260] != var259) {
                    class160.field2716[var260] = var259;
                    method1889(var260);
                }
                field657[++field537 - 1 & 0x1F] = var260;
                field479 = -1;
                return true;
            }
            if (field479 == 220) {
                int var261 = field604.method2464();
                class138[] var262 = class138.method2737();
                int var263 = 0;
                class138 var265;
                while (true) {
                    if (var263 >= var262.length) {
                        var265 = null;
                        break;
                    }
                    class138 var264 = var262[var263];
                    if (var264.field2339 == var261) {
                        var265 = var264;
                        break;
                    }
                    var263++;
                }
                Statics.field1836 = var265;
                field479 = -1;
                return true;
            }
            if (field479 == 170) {
                int var266 = field604.method2508();
                class4 var267 = (class4) field634.method3296((long) var266);
                if (var267 != null) {
                    method173(var267, true);
                }
                if (field637 != null) {
                    method148(field637);
                    field637 = null;
                }
                field479 = -1;
                return true;
            }
            if (field479 == 55) {
                method1674();
                field488 = field604.method2464();
                field666 = field656;
                field479 = -1;
                return true;
            }
            if (field479 == 163 || field479 == 232 || field479 == 135 || field479 == 69 || field479 == 41 || field479 == 131 || field479 == 249 || field479 == 143 || field479 == 1 || field479 == 152 || field479 == 224) {
                method2135();
                field479 = -1;
                return true;
            }
            if (field479 == 119) {
                int var268 = field604.method2490();
                int var269 = field604.method2464();
                int var270 = field604.method2464();
                Statics.field1807 = var268 >> 1;
                Statics.field428.method229(var270, var269, (var268 & 0x1) == 1);
                field479 = -1;
                return true;
            }
            class80.method1544("" + field479 + class2.field16 + field521 + class2.field16 + field563 + class2.field16 + field654, (Throwable) null);
            method1286();
        } catch (IOException var279) {
            Statics.method2137();
        } catch (Exception var280) {
            String var273 = "" + field479 + class2.field16 + field521 + class2.field16 + field563 + class2.field16 + field654 + class2.field16 + (Statics.field401 + Statics.field428.field463[0]) + class2.field16 + (Statics.field1268 + Statics.field428.field464[0]) + class2.field16;
            for (int var274 = 0; var274 < field654 && var274 < 50; var274++) {
                var273 = var273 + field604.field2037[var274] + class2.field16;
            }
            class80.method1544(var273, var280);
            method1286();
        }
        return true;
    }

    @ObfuscatedName("cm.bb(I)V")
    public static final void method2135() {
        if (field479 == 69) {
            int var0 = field604.method2523();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1285;
            int var2 = (var0 & 0x7) + Statics.field182;
            int var3 = field604.method2582();
            int var4 = field604.method2451();
            int var5 = field604.method2496();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && field598 != var3) {
                class17 var6 = new class17();
                var6.field260 = var4;
                var6.field261 = var5;
                if (field606[Statics.field1807][var1][var2] == null) {
                    field606[Statics.field1807][var1][var2] = new class177();
                }
                field606[Statics.field1807][var1][var2].method3312(var6);
                method2404(var1, var2);
            }
        } else if (field479 == 131) {
            int var7 = field604.method2464();
            int var8 = (var7 >> 4 & 0x7) + Statics.field1285;
            int var9 = (var7 & 0x7) + Statics.field182;
            int var10 = var8 + field604.method2449();
            int var11 = var9 + field604.method2449();
            int var12 = field604.method2467();
            int var13 = field604.method2582();
            int var14 = field604.method2464() * 4;
            int var15 = field604.method2464() * 4;
            int var16 = field604.method2582();
            int var17 = field604.method2582();
            int var18 = field604.method2464();
            int var19 = field604.method2464();
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && var13 != 65535) {
                int var20 = var8 * 128 + 64;
                int var21 = var9 * 128 + 64;
                int var22 = var10 * 128 + 64;
                int var23 = var11 * 128 + 64;
                class10 var24 = new class10(var13, Statics.field1807, var20, var21, method215(var20, var21, Statics.field1807) - var14, field699 + var16, field699 + var17, var18, var19, var12, var15);
                var24.method105(var22, var23, method215(var22, var23, Statics.field1807) - var15, field699 + var16);
                field608.method3312(var24);
            }
        } else if (field479 == 232) {
            int var25 = field604.method2464();
            int var26 = (var25 >> 4 & 0x7) + Statics.field1285;
            int var27 = (var25 & 0x7) + Statics.field182;
            int var28 = field604.method2582();
            int var29 = field604.method2582();
            int var30 = field604.method2582();
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class177 var31 = field606[Statics.field1807][var26][var27];
                if (var31 != null) {
                    for (class17 var32 = (class17) var31.method3338(); var32 != null; var32 = (class17) var31.method3323()) {
                        if ((var28 & 0x7FFF) == var32.field260 && var32.field261 == var29) {
                            var32.field261 = var30;
                            break;
                        }
                    }
                    method2404(var26, var27);
                }
            }
        } else if (field479 == 1) {
            int var33 = field604.method2451();
            int var34 = field604.method2523();
            int var35 = (var34 >> 4 & 0x7) + Statics.field1285;
            int var36 = (var34 & 0x7) + Statics.field182;
            int var37 = field604.method2523();
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = field534[var38];
            if (var35 >= 0 && var36 >= 0 && var35 < 103 && var36 < 103) {
                if (var40 == 0) {
                    class96 var41 = Statics.field949.method1951(Statics.field1807, var35, var36);
                    if (var41 != null) {
                        int var42 = var41.field1634 >> 14 & 0x7FFF;
                        if (var38 == 2) {
                            var41.field1633 = new class14(var42, 2, var39 + 4, Statics.field1807, var35, var36, var33, false, var41.field1633);
                            var41.field1632 = new class14(var42, 2, var39 + 1 & 0x3, Statics.field1807, var35, var36, var33, false, var41.field1632);
                        } else {
                            var41.field1633 = new class14(var42, var38, var39, Statics.field1807, var35, var36, var33, false, var41.field1633);
                        }
                    }
                }
                if (var40 == 1) {
                    class108 var43 = Statics.field949.method1913(Statics.field1807, var35, var36);
                    if (var43 != null) {
                        int var44 = var43.field1816 >> 14 & 0x7FFF;
                        if (var38 == 4 || var38 == 5) {
                            var43.field1814 = new class14(var44, 4, var39, Statics.field1807, var35, var36, var33, false, var43.field1814);
                        } else if (var38 == 6) {
                            var43.field1814 = new class14(var44, 4, var39 + 4, Statics.field1807, var35, var36, var33, false, var43.field1814);
                        } else if (var38 == 7) {
                            var43.field1814 = new class14(var44, 4, (var39 + 2 & 0x3) + 4, Statics.field1807, var35, var36, var33, false, var43.field1814);
                        } else if (var38 == 8) {
                            var43.field1814 = new class14(var44, 4, var39 + 4, Statics.field1807, var35, var36, var33, false, var43.field1814);
                            var43.field1813 = new class14(var44, 4, (var39 + 2 & 0x3) + 4, Statics.field1807, var35, var36, var33, false, var43.field1813);
                        }
                    }
                }
                if (var40 == 2) {
                    class98 var45 = Statics.field949.method1914(Statics.field1807, var35, var36);
                    if (var38 == 11) {
                        var38 = 10;
                    }
                    if (var45 != null) {
                        var45.field1650 = new class14(var45.field1659 >> 14 & 0x7FFF, var38, var39, Statics.field1807, var35, var36, var33, false, var45.field1650);
                    }
                }
                if (var40 == 3) {
                    class107 var46 = Statics.field949.method1915(Statics.field1807, var35, var36);
                    if (var46 != null) {
                        var46.field1798 = new class14(var46.field1800 >> 14 & 0x7FFF, 22, var39, Statics.field1807, var35, var36, var33, false, var46.field1798);
                    }
                }
            }
        } else if (field479 == 249) {
            int var47 = field604.method2496();
            int var48 = field604.method2523();
            int var49 = (var48 >> 4 & 0x7) + Statics.field1285;
            int var50 = (var48 & 0x7) + Statics.field182;
            if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                class177 var51 = field606[Statics.field1807][var49][var50];
                if (var51 != null) {
                    for (class17 var52 = (class17) var51.method3338(); var52 != null; var52 = (class17) var51.method3323()) {
                        if ((var47 & 0x7FFF) == var52.field260) {
                            var52.method3349();
                            break;
                        }
                    }
                    if (var51.method3338() == null) {
                        field606[Statics.field1807][var49][var50] = null;
                    }
                    method2404(var49, var50);
                }
            }
        } else if (field479 == 143) {
            int var53 = field604.method2523();
            int var54 = (var53 >> 4 & 0x7) + Statics.field1285;
            int var55 = (var53 & 0x7) + Statics.field182;
            int var56 = field604.method2582();
            int var57 = field604.method2451();
            if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                class17 var58 = new class17();
                var58.field260 = var56;
                var58.field261 = var57;
                if (field606[Statics.field1807][var54][var55] == null) {
                    field606[Statics.field1807][var54][var55] = new class177();
                }
                field606[Statics.field1807][var54][var55].method3312(var58);
                method2404(var54, var55);
            }
        } else if (field479 == 152) {
            int var59 = field604.method2464();
            int var60 = (var59 >> 4 & 0x7) + Statics.field1285;
            int var61 = (var59 & 0x7) + Statics.field182;
            int var62 = field604.method2488();
            int var63 = var62 >> 2;
            int var64 = var62 & 0x3;
            int var65 = field534[var63];
            if (var60 >= 0 && var61 >= 0 && var60 < 104 && var61 < 104) {
                method157(Statics.field1807, var60, var61, var65, -1, var63, var64, 0, -1);
            }
        } else {
            if (field479 == 135) {
                int var66 = field604.method2490();
                int var67 = var66 >> 2;
                int var68 = var66 & 0x3;
                int var69 = field534[var67];
                int var70 = field604.method2451();
                int var71 = field604.method2488();
                int var72 = (var71 >> 4 & 0x7) + Statics.field1285;
                int var73 = (var71 & 0x7) + Statics.field182;
                int var74 = field604.method2498();
                byte var75 = field604.method2492();
                byte var76 = field604.method2564();
                int var77 = field604.method2451();
                byte var78 = field604.method2449();
                byte var79 = field604.method2492();
                int var80 = field604.method2498();
                class3 var81;
                if (field598 == var77) {
                    var81 = Statics.field428;
                } else {
                    var81 = field592[var77];
                }
                if (var81 != null) {
                    class32 var82 = class32.method1406(var80);
                    int var83;
                    int var84;
                    if (var68 == 1 || var68 == 3) {
                        var83 = var82.field818;
                        var84 = var82.field817;
                    } else {
                        var83 = var82.field817;
                        var84 = var82.field818;
                    }
                    int var85 = (var83 >> 1) + var72;
                    int var86 = (var83 + 1 >> 1) + var72;
                    int var87 = (var84 >> 1) + var73;
                    int var88 = (var84 + 1 >> 1) + var73;
                    int[][] var89 = class9.field140[Statics.field1807];
                    int var90 = var89[var85][var87] + var89[var86][var87] + var89[var85][var88] + var89[var86][var88] >> 2;
                    int var91 = (var72 << 7) + (var83 << 6);
                    int var92 = (var73 << 7) + (var84 << 6);
                    class112 var93 = var82.method664(var67, var68, var89, var91, var90, var92);
                    if (var93 != null) {
                        method157(Statics.field1807, var72, var73, var69, -1, 0, 0, var74 + 1, var70 + 1);
                        var81.field38 = field699 + var74;
                        var81.field39 = field699 + var70;
                        var81.field42 = var93;
                        var81.field40 = var72 * 128 + var83 * 64;
                        var81.field32 = var73 * 128 + var84 * 64;
                        var81.field41 = var90;
                        if (var79 > var78) {
                            byte var94 = var79;
                            var79 = var78;
                            var78 = var94;
                        }
                        if (var75 > var76) {
                            byte var95 = var75;
                            var75 = var76;
                            var76 = var95;
                        }
                        var81.field44 = var72 + var79;
                        var81.field46 = var72 + var78;
                        var81.field31 = var73 + var75;
                        var81.field36 = var73 + var76;
                    }
                }
            }
            if (field479 == 163) {
                int var96 = field604.method2464();
                int var97 = (var96 >> 4 & 0x7) + Statics.field1285;
                int var98 = (var96 & 0x7) + Statics.field182;
                int var99 = field604.method2582();
                int var100 = field604.method2464();
                int var101 = var100 >> 4 & 0xF;
                int var102 = var100 & 0x7;
                int var103 = field604.method2464();
                if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                    int var104 = var101 + 1;
                    if (Statics.field428.field463[0] >= var97 - var104 && Statics.field428.field463[0] <= var97 + var104 && Statics.field428.field464[0] >= var98 - var104 && Statics.field428.field464[0] <= var98 + var104 && field512 != 0 && var102 > 0 && field713 < 50) {
                        field714[field713] = var99;
                        field715[field713] = var102;
                        field716[field713] = var103;
                        field596[field713] = null;
                        field607[field713] = (var97 << 16) + (var98 << 8) + var101;
                        field713++;
                    }
                }
            }
            if (field479 == 41) {
                int var105 = field604.method2464();
                int var106 = (var105 >> 4 & 0x7) + Statics.field1285;
                int var107 = (var105 & 0x7) + Statics.field182;
                int var108 = field604.method2582();
                int var109 = field604.method2464();
                int var110 = field604.method2582();
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    int var111 = var106 * 128 + 64;
                    int var112 = var107 * 128 + 64;
                    class20 var113 = new class20(var108, Statics.field1807, var111, var112, method215(var111, var112, Statics.field1807) - var109, var110, field699);
                    field609.method3312(var113);
                }
            } else if (field479 == 224) {
                int var114 = field604.method2523();
                int var115 = (var114 >> 4 & 0x7) + Statics.field1285;
                int var116 = (var114 & 0x7) + Statics.field182;
                int var117 = field604.method2451();
                int var118 = field604.method2523();
                int var119 = var118 >> 2;
                int var120 = var118 & 0x3;
                int var121 = field534[var119];
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    method157(Statics.field1807, var115, var116, var121, var117, var119, var120, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("l.br(IIIIIIIIII)V")
    public static final void method157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field486.method3338(); var10 != null; var10 = (class22) field486.method3323()) {
            if (var10.field350 == arg0 && var10.field344 == arg1 && var10.field341 == arg2 && var10.field339 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field350 = arg0;
            var9.field339 = arg3;
            var9.field344 = arg1;
            var9.field341 = arg2;
            method2369(var9);
            field486.method3312(var9);
        }
        var9.field345 = arg4;
        var9.field347 = arg5;
        var9.field354 = arg6;
        var9.field349 = arg7;
        var9.field340 = arg8;
    }

    @ObfuscatedName("bk.bz(B)V")
    public static final void method1411() {
        for (class22 var0 = (class22) field486.method3338(); var0 != null; var0 = (class22) field486.method3323()) {
            if (var0.field340 == -1) {
                var0.field349 = 0;
                method2369(var0);
            } else {
                var0.method3349();
            }
        }
    }

    @ObfuscatedName("dt.bl(Lp;I)V")
    public static final void method2369(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field339 == 0) {
            var1 = Statics.field949.method1916(arg0.field350, arg0.field344, arg0.field341);
        }
        if (arg0.field339 == 1) {
            var1 = Statics.field949.method1917(arg0.field350, arg0.field344, arg0.field341);
        }
        if (arg0.field339 == 2) {
            var1 = Statics.field949.method1918(arg0.field350, arg0.field344, arg0.field341);
        }
        if (arg0.field339 == 3) {
            var1 = Statics.field949.method1919(arg0.field350, arg0.field344, arg0.field341);
        }
        if (var1 != 0) {
            int var5 = Statics.field949.method1920(arg0.field350, arg0.field344, arg0.field341, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field342 = var2;
        arg0.field348 = var3;
        arg0.field343 = var4;
    }

    @ObfuscatedName("a.bo(I)V")
    public static final void method46() {
        for (class22 var0 = (class22) field486.method3338(); var0 != null; var0 = (class22) field486.method3323()) {
            if (var0.field340 > 0) {
                var0.field340--;
            }
            if (var0.field340 != 0) {
                if (var0.field349 > 0) {
                    var0.field349--;
                }
                if (var0.field349 == 0 && var0.field344 >= 1 && var0.field341 >= 1 && var0.field344 <= 102 && var0.field341 <= 102 && (var0.field345 < 0 || class9.method2397(var0.field345, var0.field347))) {
                    method11(var0.field350, var0.field339, var0.field344, var0.field341, var0.field345, var0.field354, var0.field347);
                    var0.field349 = -1;
                    if (var0.field345 == var0.field342 && var0.field342 == -1) {
                        var0.method3349();
                    } else if (var0.field345 == var0.field342 && var0.field354 == var0.field343 && var0.field348 == var0.field347) {
                        var0.method3349();
                    }
                }
            } else if (var0.field342 < 0 || class9.method2397(var0.field342, var0.field348)) {
                method11(var0.field350, var0.field339, var0.field344, var0.field341, var0.field342, var0.field343, var0.field348);
                var0.method3349();
            }
        }
    }

    @ObfuscatedName("f.bm(IIIIIIIB)V")
    public static final void method11(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field478 && Statics.field1807 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field949.method1916(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field949.method1917(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field949.method1918(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field949.method1919(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field949.method1920(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field949.method1907(arg0, arg2, arg3);
                class32 var15 = class32.method1406(var12);
                if (var15.field819 != 0) {
                    field506[arg0].method2689(arg2, arg3, var13, var14, var15.field801);
                }
            }
            if (arg1 == 1) {
                Statics.field949.method1908(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field949.method1909(arg0, arg2, arg3);
                class32 var16 = class32.method1406(var12);
                if (var16.field817 + arg2 > 103 || var16.field817 + arg3 > 103 || var16.field818 + arg2 > 103 || var16.field818 + arg3 > 103) {
                    return;
                }
                if (var16.field819 != 0) {
                    field506[arg0].method2690(arg2, arg3, var16.field817, var16.field818, var14, var16.field801);
                }
            }
            if (arg1 == 3) {
                Statics.field949.method1910(arg0, arg2, arg3);
                class32 var17 = class32.method1406(var12);
                if (var17.field819 == 1) {
                    field506[arg0].method2712(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field120[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        Statics.method3159(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field949, field506[arg0]);
    }

    @ObfuscatedName("dl.bh(III)V")
    public static final void method2404(int arg0, int arg1) {
        class177 var2 = field606[Statics.field1807][arg0][arg1];
        if (var2 == null) {
            Statics.field949.method1911(Statics.field1807, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3338(); var6 != null; var6 = (class17) var2.method3323()) {
            class40 var7 = class40.method712(var6.field260);
            long var8 = (long) var7.field995;
            if (var7.field988 == 1) {
                var8 = (long) (var6.field261 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field949.method1911(Statics.field1807, arg0, arg1);
            return;
        }
        var2.method3313(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3338(); var12 != null; var12 = (class17) var2.method3323()) {
            if (var5.field260 != var12.field260) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field260 != var12.field260 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field949.method1996(Statics.field1807, arg0, arg1, method215(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1807), var5, var13, var10, var11);
    }

    @ObfuscatedName("g.bu(I)V")
    public static final void method138() {
        field600 = 0;
        field646 = 0;
        method118();
        method3();
        method154();
        method819();
        for (int var0 = 0; var0 < field600; var0++) {
            int var1 = field601[var0];
            if (field699 != field592[var1].field468) {
                field592[var1] = null;
            }
        }
        if (field654 != field604.field2035) {
            throw new RuntimeException(field604.field2035 + class2.field16 + field654);
        }
        for (int var2 = 0; var2 < field701; var2++) {
            if (field592[field626[var2]] == null) {
                throw new RuntimeException(var2 + class2.field16 + field701);
            }
        }
    }

    @ObfuscatedName("c.bx(B)V")
    public static final void method118() {
        field604.method2339();
        int var0 = field604.method2353(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field604.method2353(2);
        if (var1 == 0) {
            field567[++field646 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field604.method2353(3);
            Statics.field428.method230(var2, false);
            int var3 = field604.method2353(1);
            if (var3 == 1) {
                field567[++field646 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field604.method2353(3);
            Statics.field428.method230(var4, true);
            int var5 = field604.method2353(3);
            Statics.field428.method230(var5, true);
            int var6 = field604.method2353(1);
            if (var6 == 1) {
                field567[++field646 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field604.method2353(1);
            int var8 = field604.method2353(7);
            int var9 = field604.method2353(1);
            if (var9 == 1) {
                field567[++field646 - 1] = 2047;
            }
            Statics.field1807 = field604.method2353(2);
            int var10 = field604.method2353(7);
            Statics.field428.method229(var10, var8, var7 == 1);
        }
    }

    @ObfuscatedName("j.bv(I)V")
    public static final void method3() {
        int var0 = field604.method2353(8);
        if (var0 < field701) {
            for (int var1 = var0; var1 < field701; var1++) {
                field601[++field600 - 1] = field626[var1];
            }
        }
        if (var0 > field701) {
            throw new RuntimeException("");
        }
        field701 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field626[var2];
            class3 var4 = field592[var3];
            int var5 = field604.method2353(1);
            if (var5 == 0) {
                field626[++field701 - 1] = var3;
                var4.field468 = field699;
            } else {
                int var6 = field604.method2353(2);
                if (var6 == 0) {
                    field626[++field701 - 1] = var3;
                    var4.field468 = field699;
                    field567[++field646 - 1] = var3;
                } else if (var6 == 1) {
                    field626[++field701 - 1] = var3;
                    var4.field468 = field699;
                    int var7 = field604.method2353(3);
                    var4.method230(var7, false);
                    int var8 = field604.method2353(1);
                    if (var8 == 1) {
                        field567[++field646 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field626[++field701 - 1] = var3;
                    var4.field468 = field699;
                    int var9 = field604.method2353(3);
                    var4.method230(var9, true);
                    int var10 = field604.method2353(3);
                    var4.method230(var10, true);
                    int var11 = field604.method2353(1);
                    if (var11 == 1) {
                        field567[++field646 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field601[++field600 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("s.bt(I)V")
    public static final void method154() {
        while (true) {
            if (field604.method2331(field654) >= 11) {
                int var0 = field604.method2353(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field592[var0] == null) {
                        field592[var0] = new class3();
                        if (field597[var0] != null) {
                            field592[var0].method25(field597[var0]);
                        }
                        var1 = true;
                    }
                    field626[++field701 - 1] = var0;
                    class3 var2 = field592[var0];
                    var2.field468 = field699;
                    int var3 = field604.method2353(1);
                    int var4 = field604.method2353(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field605[field604.method2353(3)];
                    if (var1) {
                        var2.field459 = var2.field413 = var5;
                    }
                    int var6 = field604.method2353(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field604.method2353(1);
                    if (var7 == 1) {
                        field567[++field646 - 1] = var0;
                    }
                    var2.method229(Statics.field428.field463[0] + var4, Statics.field428.field464[0] + var6, var3 == 1);
                    continue;
                }
            }
            field604.method2330();
            return;
        }
    }

    @ObfuscatedName("at.be(I)V")
    public static final void method819() {
        for (int var0 = 0; var0 < field646; var0++) {
            int var1 = field567[var0];
            class3 var2 = field592[var1];
            int var3 = field604.method2464();
            if ((var3 & 0x8) != 0) {
                var3 += field604.method2464() << 8;
            }
            if ((var3 & 0x10) != 0) {
                int var4 = field604.method2523();
                int var5 = field604.method2490();
                var2.method232(var4, var5, field699);
                var2.field431 = field699 + 300;
                var2.field432 = field604.method2490();
                var2.field433 = field604.method2490();
            }
            if ((var3 & 0x2) != 0) {
                int var6 = field604.method2496();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field604.method2490();
                method1666(var2, var6, var7);
            }
            if ((var3 & 0x1) != 0) {
                var2.field435 = field604.method2498();
                var2.field436 = field604.method2498();
            }
            if ((var3 & 0x400) != 0) {
                var2.field445 = field604.method2496();
                int var8 = field604.method2505();
                var2.field449 = var8 >> 16;
                var2.field448 = (var8 & 0xFFFF) + field699;
                var2.field446 = 0;
                var2.field447 = 0;
                if (var2.field448 > field699) {
                    var2.field446 = -1;
                }
                if (var2.field445 == 65535) {
                    var2.field445 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field451 = field604.method2518();
                if (var2.field451.charAt(0) == '~') {
                    var2.field451 = var2.field451.substring(1);
                    method1647(2, var2.field37, var2.field451);
                } else if (Statics.field428 == var2) {
                    method1647(2, var2.field37, var2.field451);
                }
                var2.field424 = 0;
                var2.field427 = 0;
                var2.field426 = 150;
            }
            if ((var3 & 0x200) != 0) {
                int var9 = field604.method2523();
                int var10 = field604.method2523();
                var2.method232(var9, var10, field699);
                var2.field431 = field699 + 300;
                var2.field432 = field604.method2523();
                var2.field433 = field604.method2488();
            }
            if ((var3 & 0x20) != 0) {
                int var11 = field604.method2488();
                byte[] var12 = new byte[var11];
                class127 var13 = new class127(var12);
                field604.method2475(var12, 0, var11);
                field597[var1] = var13;
                var2.method25(var13);
            }
            if ((var3 & 0x4) != 0) {
                var2.field434 = field604.method2498();
                if (var2.field434 == 65535) {
                    var2.field434 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var14 = field604.method2498();
                int var15 = field604.method2464();
                int var16 = field604.method2523();
                int var17 = field604.field2035;
                if (var2.field37 != null && var2.field43 != null) {
                    boolean var18 = false;
                    if (var15 <= 1 && method808(var2.field37)) {
                        var18 = true;
                    }
                    if (!var18 && field590 == 0) {
                        field483.field2035 = 0;
                        field604.method2591(field483.field2037, 0, var16);
                        field483.field2035 = 0;
                        class127 var19 = field483;
                        String var23;
                        try {
                            int var20 = var19.method2635();
                            if (var20 > 32767) {
                                var20 = 32767;
                            }
                            byte[] var21 = new byte[var20];
                            var19.field2035 += Statics.field2824.method2384(var19.field2037, var19.field2035, var21, 0, var20);
                            String var22 = class150.method2061(var21, 0, var20);
                            var23 = var22;
                        } catch (Exception var27) {
                            var23 = "Cabbage";
                        }
                        String var26 = class185.method3392(Statics.method1536(var23));
                        var2.field451 = var26.trim();
                        var2.field424 = var14 >> 8;
                        var2.field427 = var14 & 0xFF;
                        var2.field426 = 150;
                        if (var15 == 2 || var15 == 3) {
                            method1647(1, class2.method1546(1) + var2.field37, var26);
                        } else if (var15 == 1) {
                            method1647(1, class2.method1546(0) + var2.field37, var26);
                        } else {
                            method1647(2, var2.field37, var26);
                        }
                    }
                }
                field604.field2035 = var16 + var17;
            }
            if ((var3 & 0x100) != 0) {
                var2.field425 = field604.method2488();
                var2.field452 = field604.method2488();
                var2.field453 = field604.method2490();
                var2.field457 = field604.method2490();
                var2.field454 = field604.method2451() + field699;
                var2.field423 = field604.method2582() + field699;
                var2.field411 = field604.method2490();
                var2.field462 = 1;
                var2.field467 = 0;
            }
        }
    }

    @ObfuscatedName("al.bi(B)V")
    public static final void method707() {
        field600 = 0;
        field646 = 0;
        field604.method2339();
        int var0 = field604.method2353(8);
        if (var0 < field510) {
            for (int var1 = var0; var1 < field510; var1++) {
                field601[++field600 - 1] = field499[var1];
            }
        }
        if (var0 > field510) {
            throw new RuntimeException("");
        }
        field510 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field499[var2];
            class25 var4 = field509[var3];
            int var5 = field604.method2353(1);
            if (var5 == 0) {
                field499[++field510 - 1] = var3;
                var4.field468 = field699;
            } else {
                int var6 = field604.method2353(2);
                if (var6 == 0) {
                    field499[++field510 - 1] = var3;
                    var4.field468 = field699;
                    field567[++field646 - 1] = var3;
                } else if (var6 == 1) {
                    field499[++field510 - 1] = var3;
                    var4.field468 = field699;
                    int var7 = field604.method2353(3);
                    var4.method230(var7, false);
                    int var8 = field604.method2353(1);
                    if (var8 == 1) {
                        field567[++field646 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field499[++field510 - 1] = var3;
                    var4.field468 = field699;
                    int var9 = field604.method2353(3);
                    var4.method230(var9, true);
                    int var10 = field604.method2353(3);
                    var4.method230(var10, true);
                    int var11 = field604.method2353(1);
                    if (var11 == 1) {
                        field567[++field646 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field601[++field600 - 1] = var3;
                }
            }
        }
        method2057();
        method81();
        for (int var12 = 0; var12 < field600; var12++) {
            int var13 = field601[var12];
            if (field699 != field509[var13].field468) {
                field509[var13].field383 = null;
                field509[var13] = null;
            }
        }
        if (field654 != field604.field2035) {
            throw new RuntimeException(field604.field2035 + class2.field16 + field654);
        }
        for (int var14 = 0; var14 < field510; var14++) {
            if (field509[field499[var14]] == null) {
                throw new RuntimeException(var14 + class2.field16 + field510);
            }
        }
    }

    @ObfuscatedName("cp.bw(B)V")
    public static final void method2057() {
        while (true) {
            if (field604.method2331(field654) >= 27) {
                int var0 = field604.method2353(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field509[var0] == null) {
                        field509[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field509[var0];
                    field499[++field510 - 1] = var0;
                    var2.field468 = field699;
                    int var3 = field604.method2353(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field604.method2353(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field605[field604.method2353(3)];
                    if (var1) {
                        var2.field459 = var2.field413 = var5;
                    }
                    int var6 = field604.method2353(1);
                    var2.field383 = class31.method318(field604.method2353(14));
                    int var7 = field604.method2353(1);
                    if (var7 == 1) {
                        field567[++field646 - 1] = var0;
                    }
                    var2.field458 = var2.field383.field781;
                    var2.field461 = var2.field383.field795;
                    if (var2.field461 == 0) {
                        var2.field413 = 0;
                    }
                    var2.field439 = var2.field383.field769;
                    var2.field420 = var2.field383.field779;
                    var2.field450 = var2.field383.field780;
                    var2.field422 = var2.field383.field798;
                    var2.field416 = var2.field383.field787;
                    var2.field437 = var2.field383.field776;
                    var2.field415 = var2.field383.field777;
                    var2.method229(Statics.field428.field463[0] + var3, Statics.field428.field464[0] + var4, var6 == 1);
                    continue;
                }
            }
            field604.method2330();
            return;
        }
    }

    @ObfuscatedName("n.bd(I)V")
    public static final void method81() {
        for (int var0 = 0; var0 < field646; var0++) {
            int var1 = field567[var0];
            class25 var2 = field509[var1];
            int var3 = field604.method2464();
            if ((var3 & 0x80) != 0) {
                var2.field383 = class31.method318(field604.method2582());
                var2.field458 = var2.field383.field781;
                var2.field461 = var2.field383.field795;
                var2.field439 = var2.field383.field769;
                var2.field420 = var2.field383.field779;
                var2.field450 = var2.field383.field780;
                var2.field422 = var2.field383.field798;
                var2.field416 = var2.field383.field787;
                var2.field437 = var2.field383.field776;
                var2.field415 = var2.field383.field777;
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field604.method2523();
                int var5 = field604.method2488();
                var2.method232(var4, var5, field699);
                var2.field431 = field699 + 300;
                var2.field432 = field604.method2488();
                var2.field433 = field604.method2488();
            }
            if ((var3 & 0x20) != 0) {
                var2.field434 = field604.method2498();
                if (var2.field434 == 65535) {
                    var2.field434 = -1;
                }
            }
            if ((var3 & 0x40) != 0) {
                int var6 = field604.method2464();
                int var7 = field604.method2523();
                var2.method232(var6, var7, field699);
                var2.field431 = field699 + 300;
                var2.field432 = field604.method2523();
                var2.field433 = field604.method2523();
            }
            if ((var3 & 0x8) != 0) {
                int var8 = field604.method2451();
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = field604.method2523();
                if (var2.field440 == var8 && var8 != -1) {
                    int var10 = class34.method612(var8).field892;
                    if (var10 == 1) {
                        var2.field441 = 0;
                        var2.field442 = 0;
                        var2.field443 = var9;
                        var2.field444 = 0;
                    }
                    if (var10 == 2) {
                        var2.field444 = 0;
                    }
                } else if (var8 == -1 || var2.field440 == -1 || class34.method612(var8).field886 >= class34.method612(var2.field440).field886) {
                    var2.field440 = var8;
                    var2.field441 = 0;
                    var2.field442 = 0;
                    var2.field443 = var9;
                    var2.field444 = 0;
                    var2.field467 = var2.field462;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field451 = field604.method2518();
                var2.field426 = 100;
            }
            if ((var3 & 0x4) != 0) {
                var2.field445 = field604.method2582();
                int var11 = field604.method2507();
                var2.field449 = var11 >> 16;
                var2.field448 = (var11 & 0xFFFF) + field699;
                var2.field446 = 0;
                var2.field447 = 0;
                if (var2.field448 > field699) {
                    var2.field446 = -1;
                }
                if (var2.field445 == 65535) {
                    var2.field445 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field435 = field604.method2451();
                var2.field436 = field604.method2498();
            }
        }
    }

    @ObfuscatedName("am.bp(III)V")
    public static final void method750(int arg0, int arg1) {
        if (field535 < 2 && field627 == 0 && !field629) {
            return;
        }
        String var2;
        if (field627 == 1 && field535 < 2) {
            var2 = class135.field2237 + class135.field2247 + field628 + " " + class2.field20;
        } else if (field629 && field535 < 2) {
            var2 = field631 + class135.field2247 + field632 + " " + class2.field20;
        } else {
            int var3 = field535 - 1;
            String var4;
            if (field561[var3].length() > 0) {
                var4 = field620[var3] + class135.field2247 + field561[var3];
            } else {
                var4 = field620[var3];
            }
            var2 = var4;
        }
        if (field535 > 2) {
            var2 = var2 + class2.method2761(16777215) + " " + '/' + " " + (field535 - 2) + class135.field2241;
        }
        Statics.field194.method3415(var2, arg0 + 4, arg1 + 15, 16777215, 0, field699 / 1000);
    }

    @ObfuscatedName("n.bk(B)V")
    public static final void method100() {
        int var0 = Statics.field75;
        int var1 = Statics.field1996;
        int var2 = Statics.field132;
        int var3 = Statics.field51;
        int var4 = 6116423;
        class89.method1854(var0, var1, var2, var3, var4);
        class89.method1854(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1810(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field194.method3383(class135.field2225, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1402;
        int var6 = class77.field1406;
        for (int var7 = 0; var7 < field535; var7++) {
            int var8 = (field535 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class183 var10 = Statics.field194;
            String var11;
            if (field561[var7].length() > 0) {
                var11 = field620[var7] + class135.field2247 + field561[var7];
            } else {
                var11 = field620[var7];
            }
            var10.method3383(var11, var0 + 3, var8, var9, 0);
        }
        method1597(Statics.field75, Statics.field1996, Statics.field132, Statics.field51);
    }

    @ObfuscatedName("r.bj(IIIII)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field696; var4++) {
            if (field681[var4] + field679[var4] > arg0 && field679[var4] < arg0 + arg2 && field682[var4] + field680[var4] > arg1 && field680[var4] < arg1 + arg3) {
                field676[var4] = true;
            }
        }
    }

    @ObfuscatedName("cd.bc(IIIII)V")
    public static final void method1597(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field696; var4++) {
            if (field681[var4] + field679[var4] > arg0 && field679[var4] < arg0 + arg2 && field682[var4] + field680[var4] > arg1 && field680[var4] < arg1 + arg3) {
                field677[var4] = true;
            }
        }
    }

    @ObfuscatedName("er.bn(B)V")
    public static final void method2944() {
        int var0 = Statics.field194.method3378(class135.field2225);
        for (int var1 = 0; var1 < field535; var1++) {
            class183 var2 = Statics.field194;
            String var3;
            if (field561[var1].length() > 0) {
                var3 = field620[var1] + class135.field2247 + field561[var1];
            } else {
                var3 = field620[var1];
            }
            int var4 = var2.method3378(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field535 * 15 + 21;
        int var6 = class77.field1409 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1408;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field614 = true;
        Statics.field75 = var6;
        Statics.field1996 = var7;
        Statics.field132 = var0;
        Statics.field51 = field535 * 15 + 22;
    }

    @ObfuscatedName("k.bg(II)Z")
    public static final boolean method171(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field618[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ex.bs(IB)V")
    public static final void method2715(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field616[arg0];
        int var2 = field617[arg0];
        int var3 = field618[arg0];
        int var4 = field619[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 58) {
            field591.method2345(244);
            field591.method2494(field630);
            field591.method2503(var2);
            field591.method2494(var1);
            field591.method2503(Statics.field52);
        }
        if (var3 == 10) {
            class25 var5 = field509[var4];
            if (var5 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(33);
                field591.method2493(var4);
            }
        }
        if (var3 == 26) {
            method116();
        }
        if (var3 == 35) {
            field591.method2345(94);
            field591.method2593(var1);
            field591.method2494(var4);
            field591.method2503(var2);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 1005) {
            class159 var6 = Statics.method2760(var2);
            if (var6 == null || var6.field2700[var1] < 100000) {
                field591.method2345(92);
                field591.method2495(var4);
            } else {
                method1647(0, "", var6.field2700[var1] + " x " + class40.method712(var4).field1009);
            }
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 1001) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(65);
            field591.method2495(Statics.field401 + var1);
            field591.method2493(Statics.field1268 + var2);
            field591.method2494(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 57 || var3 == 1007) {
            String var7 = field561[arg0];
            class159 var8 = class159.method1285(var2, var1);
            if (var8 != null) {
                if (var8.field2684 != null) {
                    class1 var9 = new class1();
                    var9.field2 = var8;
                    var9.field5 = var4;
                    var9.field8 = var7;
                    var9.field10 = var8.field2684;
                    class26.method1675(var9);
                }
                boolean var10 = true;
                if (var8.field2622 > 0) {
                    var10 = method1241(var8);
                }
                if (var10 && class163.method2395(method1677(var8), var4 - 1)) {
                    if (var4 == 1) {
                        field591.method2345(35);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 2) {
                        field591.method2345(4);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 3) {
                        field591.method2345(68);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 4) {
                        field591.method2345(215);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 5) {
                        field591.method2345(168);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 6) {
                        field591.method2345(210);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 7) {
                        field591.method2345(206);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 8) {
                        field591.method2345(140);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 9) {
                        field591.method2345(232);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                    if (var4 == 10) {
                        field591.method2345(59);
                        field591.method2453(var2);
                        field591.method2593(var1);
                    }
                }
            }
        }
        if (var3 == 37) {
            field591.method2345(239);
            field591.method2593(var1);
            field591.method2504(var2);
            field591.method2494(var4);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 16) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(151);
            field591.method2493(Statics.field401 + var1);
            field591.method2593(Statics.field103);
            field591.method2593(var4);
            field591.method2503(Statics.field239);
            field591.method2495(Statics.field1268 + var2);
            field591.method2494(Statics.field2732);
        }
        if (var3 == 1) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(182);
            field591.method2493(Statics.field1268 + var2);
            field591.method2453(Statics.field239);
            field591.method2494(Statics.field103);
            field591.method2495(var4 >> 14 & 0x7FFF);
            field591.method2495(Statics.field2732);
            field591.method2494(Statics.field401 + var1);
        }
        if (var3 == 23) {
            Statics.field949.method2047(Statics.field1807, var1, var2);
        }
        if (var3 == 51) {
            class3 var11 = field592[var4];
            if (var11 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(233);
                field591.method2493(var4);
            }
        }
        if (var3 == 17) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(234);
            field591.method2453(Statics.field52);
            field591.method2593(Statics.field1268 + var2);
            field591.method2593(Statics.field401 + var1);
            field591.method2494(var4);
            field591.method2493(field630);
        }
        if (var3 == 3) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(237);
            field591.method2495(Statics.field401 + var1);
            field591.method2493(Statics.field1268 + var2);
            field591.method2495(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 36) {
            field591.method2345(137);
            field591.method2493(var1);
            field591.method2593(var4);
            field591.method2502(var2);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 12) {
            class25 var12 = field509[var4];
            if (var12 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(43);
                field591.method2495(var4);
            }
        }
        if (var3 == 40) {
            field591.method2345(143);
            field591.method2494(var1);
            field591.method2494(var4);
            field591.method2504(var2);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 33) {
            field591.method2345(78);
            field591.method2494(var4);
            field591.method2503(var2);
            field591.method2493(var1);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 1004) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field591.method2345(92);
            field591.method2495(var4);
        }
        if (var3 == 7) {
            class25 var13 = field509[var4];
            if (var13 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(171);
                field591.method2503(Statics.field239);
                field591.method2593(Statics.field103);
                field591.method2495(Statics.field2732);
                field591.method2494(var4);
            }
        }
        if (var3 == 2) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(48);
            field591.method2495(Statics.field1268 + var2);
            field591.method2494(Statics.field401 + var1);
            field591.method2502(Statics.field52);
            field591.method2593(field630);
            field591.method2495(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 50) {
            class3 var14 = field592[var4];
            if (var14 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(93);
                field591.method2494(var4);
            }
        }
        if (var3 == 30 && field637 == null) {
            method1537(var2, var1);
            field637 = class159.method1285(var2, var1);
            method148(field637);
        }
        if (var3 == 43) {
            field591.method2345(29);
            field591.method2503(var2);
            field591.method2593(var4);
            field591.method2493(var1);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 25) {
            class159 var15 = class159.method1285(var2, var1);
            if (var15 != null) {
                if (field629) {
                    class159 var16 = class159.method1285(Statics.field52, field630);
                    if (var16 != null && var16.field2609 != null) {
                        class1 var17 = new class1();
                        var17.field2 = var16;
                        var17.field10 = var16.field2609;
                        class26.method1675(var17);
                    }
                    field629 = false;
                    method148(var16);
                }
                int var18 = class163.method1881(method1677(var15));
                class159 var19 = class159.method1285(var2, var1);
                if (var19 != null && var19.field2675 != null) {
                    class1 var20 = new class1();
                    var20.field2 = var19;
                    var20.field10 = var19.field2675;
                    class26.method1675(var20);
                }
                field629 = true;
                Statics.field52 = var2;
                field630 = var1;
                Statics.field1116 = var18;
                method148(var19);
                field627 = 0;
                field631 = method656(var15);
                if (field631 == null) {
                    field631 = "Null";
                }
                if (var15.field2596) {
                    field632 = var15.field2657 + class2.method2761(16777215);
                } else {
                    field632 = class2.method2761(65280) + var15.field2640 + class2.method2761(16777215);
                }
            }
            return;
        }
        if (var3 == 42) {
            field591.method2345(100);
            field591.method2495(var4);
            field591.method2593(var1);
            field591.method2503(var2);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 14) {
            class3 var21 = field592[var4];
            if (var21 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(50);
                field591.method2453(Statics.field239);
                field591.method2494(Statics.field103);
                field591.method2593(var4);
                field591.method2493(Statics.field2732);
            }
        }
        if (var3 == 22) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(185);
            field591.method2493(Statics.field1268 + var2);
            field591.method2494(var4);
            field591.method2495(Statics.field401 + var1);
        }
        if (var3 == 34) {
            field591.method2345(11);
            field591.method2502(var2);
            field591.method2493(var4);
            field591.method2593(var1);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 47) {
            class3 var22 = field592[var4];
            if (var22 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(243);
                field591.method2593(var4);
            }
        }
        if (var3 == 8) {
            class25 var23 = field509[var4];
            if (var23 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(23);
                field591.method2502(Statics.field52);
                field591.method2494(field630);
                field591.method2495(var4);
            }
        }
        if (var3 == 9) {
            class25 var24 = field509[var4];
            if (var24 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(254);
                field591.method2494(var4);
            }
        }
        if (var3 == 5) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(103);
            field591.method2593(var4 >> 14 & 0x7FFF);
            field591.method2493(Statics.field401 + var1);
            field591.method2495(Statics.field1268 + var2);
        }
        if (var3 == 20) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(176);
            field591.method2495(Statics.field401 + var1);
            field591.method2494(Statics.field1268 + var2);
            field591.method2494(var4);
        }
        if (var3 == 6) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(165);
            field591.method2494(Statics.field401 + var1);
            field591.method2494(Statics.field1268 + var2);
            field591.method2494(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 41) {
            field591.method2345(238);
            field591.method2495(var1);
            field591.method2504(var2);
            field591.method2494(var4);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 29) {
            field591.method2345(255);
            field591.method2453(var2);
            class159 var25 = Statics.method2760(var2);
            if (var25.field2712 != null && var25.field2712[0][0] == 5) {
                int var26 = var25.field2712[0][1];
                if (class160.field2716[var26] != var25.field2695[0]) {
                    class160.field2716[var26] = var25.field2695[0];
                    method1889(var26);
                }
            }
        }
        if (var3 == 18) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(178);
            field591.method2494(Statics.field401 + var1);
            field591.method2495(var4);
            field591.method2494(Statics.field1268 + var2);
        }
        if (var3 == 31) {
            field591.method2345(69);
            field591.method2453(var2);
            field591.method2493(var1);
            field591.method2593(var4);
            field591.method2495(Statics.field2732);
            field591.method2493(Statics.field103);
            field591.method2502(Statics.field239);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 24) {
            class159 var27 = Statics.method2760(var2);
            boolean var28 = true;
            if (var27.field2622 > 0) {
                var28 = method1241(var27);
            }
            if (var28) {
                field591.method2345(255);
                field591.method2453(var2);
            }
        }
        if (var3 == 15) {
            class3 var29 = field592[var4];
            if (var29 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(247);
                field591.method2502(Statics.field52);
                field591.method2495(var4);
                field591.method2494(field630);
            }
        }
        if (var3 == 19) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(184);
            field591.method2493(Statics.field1268 + var2);
            field591.method2593(var4);
            field591.method2593(Statics.field401 + var1);
        }
        if (var3 == 45) {
            class3 var30 = field592[var4];
            if (var30 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(134);
                field591.method2493(var4);
            }
        }
        if (var3 == 44) {
            class3 var31 = field592[var4];
            if (var31 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(186);
                field591.method2495(var4);
            }
        }
        if (var3 == 49) {
            class3 var32 = field592[var4];
            if (var32 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(250);
                field591.method2495(var4);
            }
        }
        if (var3 == 1003) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            class25 var33 = field509[var4];
            if (var33 != null) {
                class31 var34 = var33.field383;
                if (var34.field796 != null) {
                    var34 = var34.method637();
                }
                if (var34 != null) {
                    field591.method2345(47);
                    field591.method2593(var34.field770);
                }
            }
        }
        if (var3 == 4) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(213);
            field591.method2493(Statics.field1268 + var2);
            field591.method2495(Statics.field401 + var1);
            field591.method2493(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 38) {
            if (field629) {
                class159 var35 = class159.method1285(Statics.field52, field630);
                if (var35 != null && var35.field2609 != null) {
                    class1 var36 = new class1();
                    var36.field2 = var35;
                    var36.field10 = var35.field2609;
                    class26.method1675(var36);
                }
                field629 = false;
                method148(var35);
            }
            class159 var37 = Statics.method2760(var2);
            field627 = 1;
            Statics.field2732 = var1;
            Statics.field239 = var2;
            Statics.field103 = var4;
            method148(var37);
            field628 = class2.method2761(16748608) + class40.method712(var4).field1009 + class2.method2761(16777215);
            if (field628 == null) {
                field628 = "null";
            }
            return;
        }
        if (var3 == 11) {
            class25 var38 = field509[var4];
            if (var38 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(56);
                field591.method2495(var4);
            }
        }
        if (var3 == 1002) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field591.method2345(129);
            field591.method2495(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 32) {
            field591.method2345(71);
            field591.method2493(var1);
            field591.method2493(field630);
            field591.method2502(Statics.field52);
            field591.method2504(var2);
            field591.method2495(var4);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 39) {
            field591.method2345(127);
            field591.method2504(var2);
            field591.method2494(var4);
            field591.method2493(var1);
            field582 = 0;
            Statics.field267 = Statics.method2760(var2);
            field583 = var1;
        }
        if (var3 == 28) {
            field591.method2345(255);
            field591.method2453(var2);
            class159 var39 = Statics.method2760(var2);
            if (var39.field2712 != null && var39.field2712[0][0] == 5) {
                int var40 = var39.field2712[0][1];
                class160.field2716[var40] = 1 - class160.field2716[var40];
                method1889(var40);
            }
        }
        if (var3 == 13) {
            class25 var41 = field509[var4];
            if (var41 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(217);
                field591.method2593(var4);
            }
        }
        if (var3 == 48) {
            class3 var42 = field592[var4];
            if (var42 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(53);
                field591.method2593(var4);
            }
        }
        if (var3 == 21) {
            field578 = class77.field1409;
            field717 = class77.field1408;
            field581 = 2;
            field580 = 0;
            field730 = var1;
            field706 = var2;
            field591.method2345(52);
            field591.method2593(Statics.field1268 + var2);
            field591.method2493(Statics.field401 + var1);
            field591.method2495(var4);
        }
        if (var3 == 46) {
            class3 var43 = field592[var4];
            if (var43 != null) {
                field578 = class77.field1409;
                field717 = class77.field1408;
                field581 = 2;
                field580 = 0;
                field730 = var1;
                field706 = var2;
                field591.method2345(55);
                field591.method2494(var4);
            }
        }
        if (field627 != 0) {
            field627 = 0;
            method148(Statics.method2760(Statics.field239));
        }
        if (field629 && field629) {
            class159 var44 = class159.method1285(Statics.field52, field630);
            if (var44 != null && var44.field2609 != null) {
                class1 var45 = new class1();
                var45.field2 = var44;
                var45.field10 = var44.field2609;
                class26.method1675(var45);
            }
            field629 = false;
            method148(var44);
        }
        if (Statics.field267 != null && field582 == 0) {
            method148(Statics.field267);
        }
    }

    @ObfuscatedName("bg.bf(III)V")
    public static void method1537(int arg0, int arg1) {
        field591.method2345(5);
        field591.method2495(arg1);
        field591.method2453(arg0);
    }

    @ObfuscatedName("aj.cq(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method841(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field614 || field535 >= 500) {
            return;
        }
        field620[field535] = arg0;
        field561[field535] = arg1;
        field618[field535] = arg2;
        field619[field535] = arg3;
        field616[field535] = arg4;
        field617[field535] = arg5;
        field535++;
    }

    @ObfuscatedName("fl.cl(I)V")
    public static void method3222() {
        for (int var0 = 0; var0 < field535; var0++) {
            int var1 = field618[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field535 - 1) {
                    for (int var3 = var0; var3 < field535 - 1; var3++) {
                        field620[var3] = field620[var3 + 1];
                        field561[var3] = field561[var3 + 1];
                        field618[var3] = field618[var3 + 1];
                        field619[var3] = field619[var3 + 1];
                        field616[var3] = field616[var3 + 1];
                        field617[var3] = field617[var3 + 1];
                    }
                }
                field535--;
            }
        }
    }

    @ObfuscatedName("v.ce(Lak;IIII)V")
    public static final void method208(class31 arg0, int arg1, int arg2, int arg3) {
        if (field535 >= 400) {
            return;
        }
        if (arg0.field796 != null) {
            arg0 = arg0.method637();
        }
        if (arg0 == null || !arg0.field786) {
            return;
        }
        String var4 = arg0.field778;
        if (arg0.field788 != 0) {
            var4 = var4 + method1239(arg0.field788, Statics.field428.field34) + " " + class2.field30 + class135.field2243 + arg0.field788 + class2.field19;
        }
        if (field627 == 1) {
            method841(class135.field2237, field628 + " " + class2.field20 + " " + class2.method2761(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field629) {
            String[] var5 = arg0.field768;
            if (field526) {
                var5 = method225(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class135.field2232)) {
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
                        method841(var5[var6], class2.method2761(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class135.field2232)) {
                        short var9 = 0;
                        if (arg0.field788 > Statics.field428.field34) {
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
                        method841(var5[var8], class2.method2761(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method841(class135.field2198, class2.method2761(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1116 & 0x2) == 2) {
            method841(field631, field632 + " " + class2.field20 + " " + class2.method2761(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("k.cd(Lo;IIII)V")
    public static final void method166(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field428 == arg0 || field535 >= 400) {
            return;
        }
        String var4;
        if (arg0.field45 == 0) {
            var4 = arg0.field37 + method1239(arg0.field34, Statics.field428.field34) + " " + class2.field30 + class135.field2243 + arg0.field34 + class2.field19;
        } else {
            var4 = arg0.field37 + " " + class2.field30 + class135.field2116 + arg0.field45 + class2.field19;
        }
        if (field627 == 1) {
            method841(class135.field2237, field628 + " " + class2.field20 + " " + class2.method2761(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field629) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field603[var5] != null) {
                    short var6 = 0;
                    if (field603[var5].equalsIgnoreCase(class135.field2232)) {
                        if (arg0.field34 > Statics.field428.field34) {
                            var6 = 2000;
                        }
                        if (Statics.field428.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field428.field49 == arg0.field49) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field693[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field602[var5] + var6;
                    method841(field603[var5], class2.method2761(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1116 & 0x8) == 8) {
            method841(field631, field632 + " " + class2.field20 + " " + class2.method2761(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field535; var9++) {
            if (field618[var9] == 23) {
                field561[var9] = class2.method2761(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("bb.cc(III)Ljava/lang/String;")
    public static final String method1239(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2761(16711680);
        } else if (var2 < -6) {
            return class2.method2761(16723968);
        } else if (var2 < -3) {
            return class2.method2761(16740352);
        } else if (var2 < 0) {
            return class2.method2761(16756736);
        } else if (var2 > 9) {
            return class2.method2761(65280);
        } else if (var2 > 6) {
            return class2.method2761(4259584);
        } else if (var2 > 3) {
            return class2.method2761(8453888);
        } else if (var2 > 0) {
            return class2.method2761(12648192);
        } else {
            return class2.method2761(16776960);
        }
    }

    @ObfuscatedName("dv.cr(IIIIIIIII)V")
    public static final void method2232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class159.method2219(arg0)) {
            Statics.field895 = null;
            method227(Statics.field2592[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field895 != null) {
                method227(Statics.field895, -1412584499, arg1, arg2, arg3, arg4, Statics.field1365, Statics.field745, arg7);
                Statics.field895 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field676[var8] = true;
            }
        } else {
            field676[arg7] = true;
        }
    }

    @ObfuscatedName("y.ci([Lfi;IIIIIIIII)V")
    public static final void method227(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1798(arg2, arg3, arg4, arg5);
        class104.method2152();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2608 == arg1 || arg1 == -1412584499 && field498 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field679[field696] = var10.field2593 + arg6;
                    field680[field696] = var10.field2603 + arg7;
                    field681[field696] = var10.field2707;
                    field682[field696] = var10.field2705;
                    var11 = ++field696 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2651 = var11;
                var10.field2713 = field699;
                if (!var10.field2596 || !method4(var10)) {
                    if (var10.field2622 > 0) {
                        int var12 = var10.field2622;
                        if (var12 == 324) {
                            if (field732 == -1) {
                                field732 = var10.field2621;
                                field476 = var10.field2697;
                            }
                            if (field731.field2736) {
                                var10.field2621 = field732;
                            } else {
                                var10.field2621 = field476;
                            }
                        } else if (var12 == 325) {
                            if (field732 == -1) {
                                field732 = var10.field2621;
                                field476 = var10.field2697;
                            }
                            if (field731.field2736) {
                                var10.field2621 = field476;
                            } else {
                                var10.field2621 = field732;
                            }
                        } else if (var12 == 327) {
                            var10.field2637 = 150;
                            var10.field2638 = (int) (Math.sin((double) field699 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2679 = 5;
                            var10.field2587 = 0;
                        } else if (var12 == 328) {
                            var10.field2637 = 150;
                            var10.field2638 = (int) (Math.sin((double) field699 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2679 = 5;
                            var10.field2587 = 1;
                        }
                    }
                    int var13 = var10.field2593 + arg6;
                    int var14 = var10.field2603 + arg7;
                    int var15 = var10.field2618;
                    if (field498 == var10) {
                        if (arg1 != -1412584499 && !var10.field2662) {
                            Statics.field895 = arg0;
                            Statics.field1365 = arg6;
                            Statics.field745 = arg7;
                            continue;
                        }
                        if (field655 && field649) {
                            int var16 = class77.field1402;
                            int var17 = class77.field1406;
                            int var18 = var16 - field710;
                            int var19 = var17 - field647;
                            if (var18 < field650) {
                                var18 = field650;
                            }
                            if (var10.field2707 + var18 > field650 + field645.field2707) {
                                var18 = field650 + field645.field2707 - var10.field2707;
                            }
                            if (var19 < field651) {
                                var19 = field651;
                            }
                            if (var10.field2705 + var19 > field651 + field645.field2705) {
                                var19 = field651 + field645.field2705 - var10.field2705;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2662) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2599 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2599 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2707 + var13;
                        int var27 = var10.field2705 + var14;
                        if (var26 < var13) {
                            var24 = var26;
                            var26 = var13;
                        }
                        if (var27 < var14) {
                            var25 = var27;
                            var27 = var14;
                        }
                        var26++;
                        var27++;
                        var20 = var24 > arg2 ? var24 : arg2;
                        var21 = var25 > arg3 ? var25 : arg3;
                        var22 = var26 < arg4 ? var26 : arg4;
                        var23 = var27 < arg5 ? var27 : arg5;
                    } else {
                        int var30 = var10.field2707 + var13;
                        int var31 = var10.field2705 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2596 || var20 < var22 && var21 < var23) {
                        if (var10.field2622 != 0) {
                            if (var10.field2622 == 1337) {
                                field622 = var13;
                                field623 = var14;
                                int var32 = var10.field2707;
                                int var33 = var10.field2705;
                                class89.method1798(var13, var14, var13 + var32, var14 + var33);
                                class104.method2152();
                                field719++;
                                method1877(true);
                                method2721(true);
                                method1877(false);
                                method2721(false);
                                for (class10 var34 = (class10) field608.method3338(); var34 != null; var34 = (class10) field608.method3323()) {
                                    if (Statics.field1807 != var34.field148 || field699 > var34.field154) {
                                        var34.method3349();
                                    } else if (field699 >= var34.field153) {
                                        if (var34.field157 > 0) {
                                            class25 var35 = field509[var34.field157 - 1];
                                            if (var35 != null && var35.field418 >= 0 && var35.field418 < 13312 && var35.field412 >= 0 && var35.field412 < 13312) {
                                                var34.method105(var35.field418, var35.field412, method215(var35.field418, var35.field412, var34.field148) - var34.field152, field699);
                                            }
                                        }
                                        if (var34.field157 < 0) {
                                            int var36 = -var34.field157 - 1;
                                            class3 var37;
                                            if (field598 == var36) {
                                                var37 = Statics.field428;
                                            } else {
                                                var37 = field592[var36];
                                            }
                                            if (var37 != null && var37.field418 >= 0 && var37.field418 < 13312 && var37.field412 >= 0 && var37.field412 < 13312) {
                                                var34.method105(var37.field418, var37.field412, method215(var37.field418, var37.field412, var34.field148) - var34.field152, field699);
                                            }
                                        }
                                        var34.method106(field547);
                                        Statics.field949.method1901(Statics.field1807, (int) var34.field159, (int) var34.field160, (int) var34.field161, 60, var34, var34.field165, -1, false);
                                    }
                                }
                                method224();
                                if (!field544) {
                                    int var38 = field723;
                                    if (field484 / 256 > var38) {
                                        var38 = field484 / 256;
                                    }
                                    if (field720[4] && field496[4] + 128 > var38) {
                                        var38 = field496[4] + 128;
                                    }
                                    int var39 = field556 + field539 & 0x7FF;
                                    int var40 = Statics.field274;
                                    int var41 = method215(Statics.field428.field418, Statics.field428.field412, Statics.field1807) - 50;
                                    int var42 = Statics.field1029;
                                    int var43 = var38 * 3 + 600;
                                    int var44 = 2048 - var38 & 0x7FF;
                                    int var45 = 2048 - var39 & 0x7FF;
                                    int var46 = 0;
                                    int var47 = 0;
                                    int var48 = var43;
                                    if (var44 != 0) {
                                        int var49 = class104.field1776[var44];
                                        int var50 = class104.field1791[var44];
                                        int var51 = var47 * var50 - var43 * var49 >> 16;
                                        var48 = var47 * var49 + var43 * var50 >> 16;
                                        var47 = var51;
                                    }
                                    if (var45 != 0) {
                                        int var52 = class104.field1776[var45];
                                        int var53 = class104.field1791[var45];
                                        int var54 = var46 * var53 + var48 * var52 >> 16;
                                        var48 = var48 * var53 - var46 * var52 >> 16;
                                        var46 = var54;
                                    }
                                    Statics.field1635 = var40 - var46;
                                    Statics.field2822 = var41 - var47;
                                    Statics.field2024 = var42 - var48;
                                    Statics.field28 = var38;
                                    Statics.field102 = var39;
                                }
                                int var55;
                                if (field544) {
                                    var55 = method153();
                                } else {
                                    var55 = method2056();
                                }
                                int var56 = Statics.field1635;
                                int var57 = Statics.field2822;
                                int var58 = Statics.field2024;
                                int var59 = Statics.field28;
                                int var60 = Statics.field102;
                                for (int var61 = 0; var61 < 5; var61++) {
                                    if (field720[var61]) {
                                        int var62 = (int) (Math.random() * (double) (field721[var61] * 2 + 1) - (double) field721[var61] + Math.sin((double) field577[var61] / 100.0D * (double) field517[var61]) * (double) field496[var61]);
                                        if (var61 == 0) {
                                            Statics.field1635 += var62;
                                        }
                                        if (var61 == 1) {
                                            Statics.field2822 += var62;
                                        }
                                        if (var61 == 2) {
                                            Statics.field2024 += var62;
                                        }
                                        if (var61 == 3) {
                                            Statics.field102 = Statics.field102 + var62 & 0x7FF;
                                        }
                                        if (var61 == 4) {
                                            Statics.field28 += var62;
                                            if (Statics.field28 < 128) {
                                                Statics.field28 = 128;
                                            }
                                            if (Statics.field28 > 383) {
                                                Statics.field28 = 383;
                                            }
                                        }
                                    }
                                }
                                int var63 = class77.field1402;
                                int var64 = class77.field1406;
                                if (var63 >= var13 && var63 < var13 + var32 && var64 >= var14 && var64 < var14 + var33) {
                                    class112.field1907 = true;
                                    class112.field1910 = 0;
                                    class112.field1908 = class77.field1402 - var13;
                                    class112.field1876 = class77.field1406 - var14;
                                } else {
                                    class112.field1907 = false;
                                    class112.field1910 = 0;
                                }
                                method137();
                                class89.method1854(var13, var14, var32, var33, 0);
                                method137();
                                Statics.field949.method1973(Statics.field1635, Statics.field2822, Statics.field2024, Statics.field28, Statics.field102, var55);
                                method137();
                                Statics.field949.method1989();
                                method654(var13, var14, var32, var33);
                                method99(var13, var14);
                                ((class110) Statics.field1787).method2221(field547);
                                if (field581 == 1) {
                                    Statics.field377[field580 / 100].method1775(field578 - 8, field717 - 8);
                                }
                                if (field581 == 2) {
                                    Statics.field377[field580 / 100 + 4].method1775(field578 - 8, field717 - 8);
                                }
                                method131();
                                if (field585) {
                                    int var65 = var13 + 512 - 5;
                                    int var66 = var14 + 20;
                                    Statics.field524.method3384("Fps:" + field1336, var65, var66, 16776960, -1);
                                    int var219 = var66 + 15;
                                    Runtime var67 = Runtime.getRuntime();
                                    int var68 = (int) ((var67.totalMemory() - var67.freeMemory()) / 1024L);
                                    int var69 = 16776960;
                                    if (var68 > 32768 && field478) {
                                        var69 = 16711680;
                                    }
                                    if (var68 > 65536 && !field478) {
                                        var69 = 16711680;
                                    }
                                    Statics.field524.method3384("Mem:" + var68 + "k", var65, var219, var69, -1);
                                    var66 = var219 + 15;
                                }
                                Statics.field1635 = var56;
                                Statics.field2822 = var57;
                                Statics.field2024 = var58;
                                Statics.field28 = var59;
                                Statics.field102 = var60;
                                if (field481) {
                                    byte var70 = 0;
                                    int var71 = class154.field2536 + class154.field2534 + var70;
                                    if (var71 == 0) {
                                        field481 = false;
                                    }
                                }
                                if (field481) {
                                    class89.method1854(var13, var14, var32, var33, 0);
                                    method204(class135.field2103, false);
                                }
                                if (!field481 && !field614 && var63 >= var13 && var63 < var13 + var32 && var64 >= var14 && var64 < var14 + var33) {
                                    if (field627 == 0 && !field629) {
                                        method841(class135.field2242, "", 23, 0, var63 - var13, var64 - var14);
                                    }
                                    int var73 = -1;
                                    for (int var74 = 0; var74 < class112.field1910; var74++) {
                                        int var75 = class112.field1911[var74];
                                        int var76 = var75 & 0x7F;
                                        int var77 = var75 >> 7 & 0x7F;
                                        int var78 = var75 >> 29 & 0x3;
                                        int var79 = var75 >> 14 & 0x7FFF;
                                        if (var73 != var75) {
                                            var73 = var75;
                                            if (var78 == 2 && Statics.field949.method1920(Statics.field1807, var76, var77, var75) >= 0) {
                                                class32 var80 = class32.method1406(var79);
                                                if (var80.field843 != null) {
                                                    var80 = var80.method660();
                                                }
                                                if (var80 == null) {
                                                    continue;
                                                }
                                                if (field627 == 1) {
                                                    method841(class135.field2237, field628 + " " + class2.field20 + " " + class2.method2761(65535) + var80.field812, 1, var75, var76, var77);
                                                } else if (!field629) {
                                                    String[] var81 = var80.field829;
                                                    if (field526) {
                                                        var81 = method225(var81);
                                                    }
                                                    if (var81 != null) {
                                                        for (int var82 = 4; var82 >= 0; var82--) {
                                                            if (var81[var82] != null) {
                                                                short var83 = 0;
                                                                if (var82 == 0) {
                                                                    var83 = 3;
                                                                }
                                                                if (var82 == 1) {
                                                                    var83 = 4;
                                                                }
                                                                if (var82 == 2) {
                                                                    var83 = 5;
                                                                }
                                                                if (var82 == 3) {
                                                                    var83 = 6;
                                                                }
                                                                if (var82 == 4) {
                                                                    var83 = 1001;
                                                                }
                                                                method841(var81[var82], class2.method2761(65535) + var80.field812, var83, var75, var76, var77);
                                                            }
                                                        }
                                                    }
                                                    method841(class135.field2198, class2.method2761(65535) + var80.field812, 1002, var80.field809 << 14, var76, var77);
                                                } else if ((Statics.field1116 & 0x4) == 4) {
                                                    method841(field631, field632 + " " + class2.field20 + " " + class2.method2761(65535) + var80.field812, 2, var75, var76, var77);
                                                }
                                            }
                                            if (var78 == 1) {
                                                class25 var84 = field509[var79];
                                                if (var84.field383.field781 == 1 && (var84.field418 & 0x7F) == 64 && (var84.field412 & 0x7F) == 64) {
                                                    for (int var85 = 0; var85 < field510; var85++) {
                                                        class25 var86 = field509[field499[var85]];
                                                        if (var86 != null && var84 != var86 && var86.field383.field781 == 1 && var84.field418 == var86.field418 && var84.field412 == var86.field412) {
                                                            method208(var86.field383, field499[var85], var76, var77);
                                                        }
                                                    }
                                                    for (int var87 = 0; var87 < field701; var87++) {
                                                        class3 var88 = field592[field626[var87]];
                                                        if (var88 != null && var84.field418 == var88.field418 && var84.field412 == var88.field412) {
                                                            method166(var88, field626[var87], var76, var77);
                                                        }
                                                    }
                                                }
                                                method208(var84.field383, var79, var76, var77);
                                            }
                                            if (var78 == 0) {
                                                class3 var89 = field592[var79];
                                                if ((var89.field418 & 0x7F) == 64 && (var89.field412 & 0x7F) == 64) {
                                                    for (int var90 = 0; var90 < field510; var90++) {
                                                        class25 var91 = field509[field499[var90]];
                                                        if (var91 != null && var91.field383.field781 == 1 && var89.field418 == var91.field418 && var89.field412 == var91.field412) {
                                                            method208(var91.field383, field499[var90], var76, var77);
                                                        }
                                                    }
                                                    for (int var92 = 0; var92 < field701; var92++) {
                                                        class3 var93 = field592[field626[var92]];
                                                        if (var93 != null && var89 != var93 && var89.field418 == var93.field418 && var89.field412 == var93.field412) {
                                                            method166(var93, field626[var92], var76, var77);
                                                        }
                                                    }
                                                }
                                                method166(var89, var79, var76, var77);
                                            }
                                            if (var78 == 3) {
                                                class177 var94 = field606[Statics.field1807][var76][var77];
                                                if (var94 != null) {
                                                    for (class17 var95 = (class17) var94.method3318(); var95 != null; var95 = (class17) var94.method3320()) {
                                                        class40 var96 = class40.method712(var95.field260);
                                                        if (field627 == 1) {
                                                            method841(class135.field2237, field628 + " " + class2.field20 + " " + class2.method2761(16748608) + var96.field1009, 16, var95.field260, var76, var77);
                                                        } else if (!field629) {
                                                            String[] var97 = var96.field1024;
                                                            if (field526) {
                                                                var97 = method225(var97);
                                                            }
                                                            for (int var98 = 4; var98 >= 0; var98--) {
                                                                if (var97 != null && var97[var98] != null) {
                                                                    byte var99 = 0;
                                                                    if (var98 == 0) {
                                                                        var99 = 18;
                                                                    }
                                                                    if (var98 == 1) {
                                                                        var99 = 19;
                                                                    }
                                                                    if (var98 == 2) {
                                                                        var99 = 20;
                                                                    }
                                                                    if (var98 == 3) {
                                                                        var99 = 21;
                                                                    }
                                                                    if (var98 == 4) {
                                                                        var99 = 22;
                                                                    }
                                                                    method841(var97[var98], class2.method2761(16748608) + var96.field1009, var99, var95.field260, var76, var77);
                                                                } else if (var98 == 2) {
                                                                    method841(class135.field2244, class2.method2761(16748608) + var96.field1009, 20, var95.field260, var76, var77);
                                                                }
                                                            }
                                                            method841(class135.field2198, class2.method2761(16748608) + var96.field1009, 1004, var95.field260, var76, var77);
                                                        } else if ((Statics.field1116 & 0x1) == 1) {
                                                            method841(field631, field632 + " " + class2.field20 + " " + class2.method2761(16748608) + var96.field1009, 17, var95.field260, var76, var77);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class89.method1798(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2622 == 1338) {
                                method1360(var13, var14, var11);
                                class89.method1798(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var100 = class77.field1402;
                        int var101 = class77.field1406;
                        if (!field614 && var100 >= var20 && var101 >= var21 && var100 < var22 && var101 < var23) {
                            int var102 = var100 - var13;
                            int var103 = var101 - var14;
                            if (var10.field2600 == 1) {
                                method841(var10.field2698, "", 24, 0, 0, var10.field2619);
                            }
                            if (var10.field2600 == 2 && !field629) {
                                String var104 = method656(var10);
                                if (var104 != null) {
                                    method841(var104, class2.method2761(65280) + var10.field2640, 25, 0, -1, var10.field2619);
                                }
                            }
                            if (var10.field2600 == 3) {
                                method841(class135.field2283, "", 26, 0, 0, var10.field2619);
                            }
                            if (var10.field2600 == 4) {
                                method841(var10.field2698, "", 28, 0, 0, var10.field2619);
                            }
                            if (var10.field2600 == 5) {
                                method841(var10.field2698, "", 29, 0, 0, var10.field2619);
                            }
                            if (var10.field2600 == 6 && field637 == null) {
                                method841(var10.field2698, "", 30, 0, -1, var10.field2619);
                            }
                            if (var10.field2599 == 2) {
                                int var105 = 0;
                                for (int var106 = 0; var106 < var10.field2705; var106++) {
                                    for (int var107 = 0; var107 < var10.field2707; var107++) {
                                        int var108 = (var10.field2636 + 32) * var107;
                                        int var109 = (var10.field2680 + 32) * var106;
                                        if (var105 < 20) {
                                            var108 += var10.field2652[var105];
                                            var109 += var10.field2653[var105];
                                        }
                                        if (var102 >= var108 && var103 >= var109 && var102 < var108 + 32 && var103 < var109 + 32) {
                                            field587 = var105;
                                            Statics.field2027 = var10;
                                            if (var10.field2699[var105] > 0) {
                                                label1545: {
                                                    class40 var110 = class40.method712(var10.field2699[var105] - 1);
                                                    if (field627 == 1) {
                                                        int var111 = method1677(var10);
                                                        boolean var112 = (var111 >> 30 & 0x1) != 0;
                                                        if (var112) {
                                                            if (Statics.field239 != var10.field2619 || Statics.field2732 != var105) {
                                                                method841(class135.field2237, field628 + " " + class2.field20 + " " + class2.method2761(16748608) + var110.field1009, 31, var110.field981, var105, var10.field2619);
                                                            }
                                                            break label1545;
                                                        }
                                                    }
                                                    if (field629) {
                                                        int var113 = method1677(var10);
                                                        boolean var114 = (var113 >> 30 & 0x1) != 0;
                                                        if (var114) {
                                                            if ((Statics.field1116 & 0x10) == 16) {
                                                                method841(field631, field632 + " " + class2.field20 + " " + class2.method2761(16748608) + var110.field1009, 32, var110.field981, var105, var10.field2619);
                                                            }
                                                            break label1545;
                                                        }
                                                    }
                                                    String[] var115 = var110.field1022;
                                                    if (field526) {
                                                        var115 = method225(var115);
                                                    }
                                                    int var116 = method1677(var10);
                                                    boolean var117 = (var116 >> 30 & 0x1) != 0;
                                                    if (var117) {
                                                        for (int var118 = 4; var118 >= 3; var118--) {
                                                            if (var115 != null && var115[var118] != null) {
                                                                byte var119;
                                                                if (var118 == 3) {
                                                                    var119 = 36;
                                                                } else {
                                                                    var119 = 37;
                                                                }
                                                                method841(var115[var118], class2.method2761(16748608) + var110.field1009, var119, var110.field981, var105, var10.field2619);
                                                            } else if (var118 == 4) {
                                                                method841(class135.field2098, class2.method2761(16748608) + var110.field1009, 37, var110.field981, var105, var10.field2619);
                                                            }
                                                        }
                                                    }
                                                    class163 var10000 = (class163) null;
                                                    if (class163.method3114(method1677(var10))) {
                                                        method841(class135.field2237, class2.method2761(16748608) + var110.field1009, 38, var110.field981, var105, var10.field2619);
                                                    }
                                                    int var120 = method1677(var10);
                                                    boolean var121 = (var120 >> 30 & 0x1) != 0;
                                                    if (var121 && var115 != null) {
                                                        for (int var122 = 2; var122 >= 0; var122--) {
                                                            if (var115[var122] != null) {
                                                                byte var123 = 0;
                                                                if (var122 == 0) {
                                                                    var123 = 33;
                                                                }
                                                                if (var122 == 1) {
                                                                    var123 = 34;
                                                                }
                                                                if (var122 == 2) {
                                                                    var123 = 35;
                                                                }
                                                                method841(var115[var122], class2.method2761(16748608) + var110.field1009, var123, var110.field981, var105, var10.field2619);
                                                            }
                                                        }
                                                    }
                                                    String[] var124 = var10.field2655;
                                                    if (field526) {
                                                        var124 = method225(var124);
                                                    }
                                                    if (var124 != null) {
                                                        for (int var125 = 4; var125 >= 0; var125--) {
                                                            if (var124[var125] != null) {
                                                                byte var126 = 0;
                                                                if (var125 == 0) {
                                                                    var126 = 39;
                                                                }
                                                                if (var125 == 1) {
                                                                    var126 = 40;
                                                                }
                                                                if (var125 == 2) {
                                                                    var126 = 41;
                                                                }
                                                                if (var125 == 3) {
                                                                    var126 = 42;
                                                                }
                                                                if (var125 == 4) {
                                                                    var126 = 43;
                                                                }
                                                                method841(var124[var125], class2.method2761(16748608) + var110.field1009, var126, var110.field981, var105, var10.field2619);
                                                            }
                                                        }
                                                    }
                                                    method841(class135.field2198, class2.method2761(16748608) + var110.field1009, 1005, var110.field981, var105, var10.field2619);
                                                }
                                            }
                                        }
                                        var105++;
                                    }
                                }
                            }
                            if (var10.field2596) {
                                if (!field629) {
                                    for (int var127 = 9; var127 >= 5; var127--) {
                                        String var128;
                                        if (!class163.method2395(method1677(var10), var127) && var10.field2684 == null) {
                                            var128 = null;
                                        } else if (var10.field2632 == null || var10.field2632.length <= var127 || var10.field2632[var127] == null || var10.field2632[var127].trim().length() == 0) {
                                            var128 = null;
                                        } else {
                                            var128 = var10.field2632[var127];
                                        }
                                        if (var128 != null) {
                                            method841(var128, var10.field2657, 1007, var127 + 1, var10.field2598, var10.field2619);
                                        }
                                    }
                                    String var130 = method656(var10);
                                    if (var130 != null) {
                                        method841(var130, var10.field2657, 25, 0, var10.field2598, var10.field2619);
                                    }
                                    for (int var131 = 4; var131 >= 0; var131--) {
                                        String var132;
                                        if (!class163.method2395(method1677(var10), var131) && var10.field2684 == null) {
                                            var132 = null;
                                        } else if (var10.field2632 == null || var10.field2632.length <= var131 || var10.field2632[var131] == null || var10.field2632[var131].trim().length() == 0) {
                                            var132 = null;
                                        } else {
                                            var132 = var10.field2632[var131];
                                        }
                                        if (var132 != null) {
                                            method841(var132, var10.field2657, 57, var131 + 1, var10.field2598, var10.field2619);
                                        }
                                    }
                                    if (class163.method141(method1677(var10))) {
                                        method841(class135.field2102, "", 30, 0, var10.field2598, var10.field2619);
                                    }
                                } else if (class163.method2338(method1677(var10)) && (Statics.field1116 & 0x20) == 32) {
                                    method841(field631, field632 + " " + class2.field20 + " " + var10.field2657, 58, 0, var10.field2598, var10.field2619);
                                }
                            }
                        }
                        if (var10.field2599 == 0) {
                            if (!var10.field2596 && method4(var10) && Statics.field624 != var10) {
                                continue;
                            }
                            if (!var10.field2596) {
                                if (var10.field2597 > var10.field2669 - var10.field2705) {
                                    var10.field2597 = var10.field2669 - var10.field2705;
                                }
                                if (var10.field2597 < 0) {
                                    var10.field2597 = 0;
                                }
                            }
                            method227(arg0, var10.field2619, var20, var21, var22, var23, var13 - var10.field2610, var14 - var10.field2597, var11);
                            if (var10.field2696 != null) {
                                method227(var10.field2696, var10.field2619, var20, var21, var22, var23, var13 - var10.field2610, var14 - var10.field2597, var11);
                            }
                            class4 var134 = (class4) field634.method3296((long) var10.field2619);
                            if (var134 != null) {
                                if (var134.field53 == 0 && class77.field1402 >= var20 && class77.field1406 >= var21 && class77.field1402 < var22 && class77.field1406 < var23 && !field614 && !field642) {
                                    field620[0] = class135.field2096;
                                    field561[0] = "";
                                    field618[0] = 1006;
                                    field535 = 1;
                                }
                                method2232(var134.field55, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class89.method1798(arg2, arg3, arg4, arg5);
                            class104.method2152();
                        }
                        if (field678[var11] || field643 > 1) {
                            if (var10.field2599 == 0 && !var10.field2596 && var10.field2669 > var10.field2705) {
                                int var135 = var10.field2707 + var13;
                                int var136 = var10.field2597;
                                int var137 = var10.field2705;
                                int var138 = var10.field2669;
                                Statics.field1044[0].method1782(var135, var14);
                                Statics.field1044[1].method1782(var135, var14 + var137 - 16);
                                class89.method1854(var135, var14 + 16, 16, var137 - 32, field518);
                                int var139 = (var137 - 32) * var137 / var138;
                                if (var139 < 8) {
                                    var139 = 8;
                                }
                                int var140 = (var137 - 32 - var139) * var136 / (var138 - var137);
                                class89.method1854(var135, var14 + 16 + var140, 16, var139, field550);
                                class89.method1809(var135, var14 + 16 + var140, var139, field552);
                                class89.method1809(var135 + 1, var14 + 16 + var140, var139, field552);
                                class89.method1840(var135, var14 + 16 + var140, 16, field552);
                                class89.method1840(var135, var14 + 17 + var140, 16, field552);
                                class89.method1809(var135 + 15, var14 + 16 + var140, var139, field551);
                                class89.method1809(var135 + 14, var14 + 17 + var140, var139 - 1, field551);
                                class89.method1840(var135, var14 + 15 + var140 + var139, 16, field551);
                                class89.method1840(var135 + 1, var14 + 14 + var140 + var139, 15, field551);
                            }
                            if (var10.field2599 != 1) {
                                if (var10.field2599 == 2) {
                                    int var141 = 0;
                                    for (int var142 = 0; var142 < var10.field2705; var142++) {
                                        for (int var143 = 0; var143 < var10.field2707; var143++) {
                                            int var144 = (var10.field2636 + 32) * var143 + var13;
                                            int var145 = (var10.field2680 + 32) * var142 + var14;
                                            if (var141 < 20) {
                                                var144 += var10.field2652[var141];
                                                var145 += var10.field2653[var141];
                                            }
                                            if (var10.field2699[var141] > 0) {
                                                boolean var146 = false;
                                                boolean var147 = false;
                                                int var148 = var10.field2699[var141] - 1;
                                                if (var144 + 32 > arg2 && var144 < arg4 && var145 + 32 > arg3 && var145 < arg5 || Statics.field1662 == var10 && field584 == var141) {
                                                    class86 var149;
                                                    if (field627 == 1 && Statics.field2732 == var141 && Statics.field239 == var10.field2619) {
                                                        var149 = class40.method180(var148, var10.field2700[var141], 2, 0, false);
                                                    } else {
                                                        var149 = class40.method180(var148, var10.field2700[var141], 1, 3153952, false);
                                                    }
                                                    if (var149 == null) {
                                                        method148(var10);
                                                    } else if (Statics.field1662 == var10 && field584 == var141) {
                                                        int var150 = class77.field1402 - field708;
                                                        int var151 = class77.field1406 - field586;
                                                        if (var150 < 5 && var150 > -5) {
                                                            var150 = 0;
                                                        }
                                                        if (var151 < 5 && var151 > -5) {
                                                            var151 = 0;
                                                        }
                                                        if (field589 < 5) {
                                                            var150 = 0;
                                                            var151 = 0;
                                                        }
                                                        var149.method1741(var144 + var150, var145 + var151, 128);
                                                        if (arg1 != -1) {
                                                            class159 var152 = arg0[arg1 & 0xFFFF];
                                                            if (var145 + var151 < class89.field1496 && var152.field2597 > 0) {
                                                                int var153 = field547 * (class89.field1496 - var145 - var151) / 3;
                                                                if (var153 > field547 * 10) {
                                                                    var153 = field547 * 10;
                                                                }
                                                                if (var153 > var152.field2597) {
                                                                    var153 = var152.field2597;
                                                                }
                                                                var152.field2597 -= var153;
                                                                field586 += var153;
                                                                method148(var152);
                                                            }
                                                            if (var145 + var151 + 32 > class89.field1499 && var152.field2597 < var152.field2669 - var152.field2705) {
                                                                int var154 = field547 * (var145 + var151 + 32 - class89.field1499) / 3;
                                                                if (var154 > field547 * 10) {
                                                                    var154 = field547 * 10;
                                                                }
                                                                if (var154 > var152.field2669 - var152.field2705 - var152.field2597) {
                                                                    var154 = var152.field2669 - var152.field2705 - var152.field2597;
                                                                }
                                                                var152.field2597 += var154;
                                                                field586 -= var154;
                                                                method148(var152);
                                                            }
                                                        }
                                                    } else if (Statics.field267 == var10 && field583 == var141) {
                                                        var149.method1741(var144, var145, 128);
                                                    } else {
                                                        var149.method1775(var144, var145);
                                                    }
                                                }
                                            } else if (var10.field2654 != null && var141 < 20) {
                                                class86 var155 = var10.method3163(var141);
                                                if (var155 != null) {
                                                    var155.method1775(var144, var145);
                                                } else if (class159.field2612) {
                                                    method148(var10);
                                                }
                                            }
                                            var141++;
                                        }
                                    }
                                } else if (var10.field2599 == 3) {
                                    int var156;
                                    if (method1596(var10)) {
                                        var156 = var10.field2615;
                                        if (Statics.field624 == var10 && var10.field2617 != 0) {
                                            var156 = var10.field2617;
                                        }
                                    } else {
                                        var156 = var10.field2614;
                                        if (Statics.field624 == var10 && var10.field2616 != 0) {
                                            var156 = var10.field2616;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2711) {
                                            class89.method1854(var13, var14, var10.field2707, var10.field2705, var156);
                                        } else {
                                            class89.method1810(var13, var14, var10.field2707, var10.field2705, var156);
                                        }
                                    } else if (var10.field2711) {
                                        class89.method1803(var13, var14, var10.field2707, var10.field2705, var156, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1807(var13, var14, var10.field2707, var10.field2705, var156, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2599 == 4) {
                                    class183 var157 = var10.method3157();
                                    if (var157 != null) {
                                        String var158 = var10.field2644;
                                        int var159;
                                        if (method1596(var10)) {
                                            var159 = var10.field2615;
                                            if (Statics.field624 == var10 && var10.field2617 != 0) {
                                                var159 = var10.field2617;
                                            }
                                            if (var10.field2645.length() > 0) {
                                                var158 = var10.field2645;
                                            }
                                        } else {
                                            var159 = var10.field2614;
                                            if (Statics.field624 == var10 && var10.field2616 != 0) {
                                                var159 = var10.field2616;
                                            }
                                        }
                                        if (var10.field2596 && var10.field2701 != -1) {
                                            class40 var160 = class40.method712(var10.field2701);
                                            var158 = var160.field1009;
                                            if (var158 == null) {
                                                var158 = "null";
                                            }
                                            if ((var160.field988 == 1 || var10.field2702 != 1) && var10.field2702 != -1) {
                                                var158 = class2.method2761(16748608) + var158 + class2.field22 + " " + 'x' + method3115(var10.field2702);
                                            }
                                        }
                                        if (field637 == var10) {
                                            class135 var220 = (class135) null;
                                            var158 = class135.field2248;
                                            var159 = var10.field2614;
                                        }
                                        if (!var10.field2596) {
                                            var158 = method1539(var158, var10);
                                        }
                                        var157.method3386(var158, var13, var14, var10.field2707, var10.field2705, var159, var10.field2686 ? 0 : -1, var10.field2647, var10.field2606, var10.field2646);
                                    } else if (class159.field2612) {
                                        method148(var10);
                                    }
                                } else if (var10.field2599 == 5) {
                                    if (var10.field2596) {
                                        class86 var162;
                                        if (var10.field2701 == -1) {
                                            var162 = var10.method3160(false);
                                        } else {
                                            var162 = class40.method180(var10.field2701, var10.field2702, var10.field2625, var10.field2588, false);
                                        }
                                        if (var162 != null) {
                                            int var163 = var162.field1480;
                                            int var164 = var162.field1481;
                                            if (var10.field2624) {
                                                class89.method1852(var13, var14, var10.field2707 + var13, var10.field2705 + var14);
                                                int var165 = (var10.field2707 + (var163 - 1)) / var163;
                                                int var166 = (var10.field2705 + (var164 - 1)) / var164;
                                                for (int var167 = 0; var167 < var165; var167++) {
                                                    for (int var168 = 0; var168 < var166; var168++) {
                                                        if (var10.field2623 != 0) {
                                                            var162.method1757(var163 / 2 + var163 * var167 + var13, var164 / 2 + var164 * var168 + var14, var10.field2623, 4096);
                                                        } else if (var15 == 0) {
                                                            var162.method1775(var163 * var167 + var13, var164 * var168 + var14);
                                                        } else {
                                                            var162.method1741(var163 * var167 + var13, var164 * var168 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1798(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var169 = var10.field2707 * 4096 / var163;
                                                if (var10.field2623 != 0) {
                                                    var162.method1757(var10.field2707 / 2 + var13, var10.field2705 / 2 + var14, var10.field2623, var169);
                                                } else if (var15 != 0) {
                                                    var162.method1700(var13, var14, var10.field2707, var10.field2705, 256 - (var15 & 0xFF));
                                                } else if (var10.field2707 == var163 && var10.field2705 == var164) {
                                                    var162.method1775(var13, var14);
                                                } else {
                                                    var162.method1721(var13, var14, var10.field2707, var10.field2705);
                                                }
                                            }
                                        } else if (class159.field2612) {
                                            method148(var10);
                                        }
                                    } else {
                                        class86 var161 = var10.method3160(method1596(var10));
                                        if (var161 != null) {
                                            var161.method1775(var13, var14);
                                        } else if (class159.field2612) {
                                            method148(var10);
                                        }
                                    }
                                } else if (var10.field2599 == 6) {
                                    boolean var170 = method1596(var10);
                                    int var171;
                                    if (var170) {
                                        var171 = var10.field2634;
                                    } else {
                                        var171 = var10.field2633;
                                    }
                                    class112 var172 = null;
                                    int var173 = 0;
                                    if (var10.field2701 != -1) {
                                        class40 var174 = class40.method712(var10.field2701);
                                        if (var174 != null) {
                                            class40 var175 = var174.method855(var10.field2702);
                                            var172 = var175.method838(1);
                                            if (var172 == null) {
                                                method148(var10);
                                            } else {
                                                var172.method2240();
                                                var173 = var172.field1560 / 2;
                                            }
                                        }
                                    } else if (var10.field2679 == 5) {
                                        if (var10.field2587 == 0) {
                                            var172 = field731.method3224((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var172 = Statics.field428.method19();
                                        }
                                    } else if (var171 == -1) {
                                        var172 = var10.method3178((class34) null, -1, var170, Statics.field428.field43);
                                        if (var172 == null && class159.field2612) {
                                            method148(var10);
                                        }
                                    } else {
                                        class34 var176 = class34.method612(var171);
                                        var172 = var10.method3178(var176, var10.field2703, var170, Statics.field428.field43);
                                        if (var172 == null && class159.field2612) {
                                            method148(var10);
                                        }
                                    }
                                    class104.method2146(var10.field2707 / 2 + var13, var10.field2705 / 2 + var14);
                                    int var177 = var10.field2611 * class104.field1776[var10.field2637] >> 16;
                                    int var178 = var10.field2611 * class104.field1791[var10.field2637] >> 16;
                                    if (var172 != null) {
                                        if (var10.field2596) {
                                            var172.method2240();
                                            if (var10.field2642) {
                                                var172.method2253(0, var10.field2638, var10.field2629, var10.field2637, var10.field2635, var10.field2708 + var173 + var177, var10.field2708 + var178, var10.field2611);
                                            } else {
                                                var172.method2252(0, var10.field2638, var10.field2629, var10.field2637, var10.field2635, var10.field2708 + var173 + var177, var10.field2708 + var178);
                                            }
                                        } else {
                                            var172.method2252(0, var10.field2638, 0, var10.field2637, 0, var177, var178);
                                        }
                                    }
                                    class104.method2145();
                                } else {
                                    if (var10.field2599 == 7) {
                                        class183 var179 = var10.method3157();
                                        if (var179 == null) {
                                            if (class159.field2612) {
                                                method148(var10);
                                            }
                                            continue;
                                        }
                                        int var180 = 0;
                                        for (int var181 = 0; var181 < var10.field2705; var181++) {
                                            for (int var182 = 0; var182 < var10.field2707; var182++) {
                                                if (var10.field2699[var180] > 0) {
                                                    class40 var183 = class40.method712(var10.field2699[var180] - 1);
                                                    String var184;
                                                    if (var183.field988 != 1 && var10.field2700[var180] == 1) {
                                                        var184 = class2.method2761(16748608) + var183.field1009 + class2.field22;
                                                    } else {
                                                        var184 = class2.method2761(16748608) + var183.field1009 + class2.field22 + " " + 'x' + method3115(var10.field2700[var180]);
                                                    }
                                                    int var185 = (var10.field2636 + 115) * var182 + var13;
                                                    int var186 = (var10.field2680 + 12) * var181 + var14;
                                                    if (var10.field2647 == 0) {
                                                        var179.method3383(var184, var185, var186, var10.field2614, var10.field2686 ? 0 : -1);
                                                    } else if (var10.field2647 == 1) {
                                                        var179.method3427(var184, var10.field2707 / 2 + var185, var186, var10.field2614, var10.field2686 ? 0 : -1);
                                                    } else {
                                                        var179.method3384(var184, var10.field2707 + var185 - 1, var186, var10.field2614, var10.field2686 ? 0 : -1);
                                                    }
                                                }
                                                var180++;
                                            }
                                        }
                                    }
                                    if (var10.field2599 == 8 && Statics.field1282 == var10 && field644 == field625) {
                                        int var187 = 0;
                                        int var188 = 0;
                                        class183 var189 = Statics.field524;
                                        String var190 = var10.field2644;
                                        String var191 = method1539(var190, var10);
                                        while (var191.length() > 0) {
                                            int var192 = var191.indexOf(class2.field18);
                                            String var193;
                                            if (var192 == -1) {
                                                var193 = var191;
                                                var191 = "";
                                            } else {
                                                var193 = var191.substring(0, var192);
                                                var191 = var191.substring(var192 + 4);
                                            }
                                            int var194 = var189.method3378(var193);
                                            if (var194 > var187) {
                                                var187 = var194;
                                            }
                                            var188 += var189.field2832 + 1;
                                        }
                                        var187 += 6;
                                        var188 += 7;
                                        int var195 = var10.field2707 + var13 - 5 - var187;
                                        int var196 = var10.field2705 + var14 + 5;
                                        if (var195 < var13 + 5) {
                                            var195 = var13 + 5;
                                        }
                                        if (var187 + var195 > arg4) {
                                            var195 = arg4 - var187;
                                        }
                                        if (var188 + var196 > arg5) {
                                            var196 = arg5 - var188;
                                        }
                                        class89.method1854(var195, var196, var187, var188, 16777120);
                                        class89.method1810(var195, var196, var187, var188, 0);
                                        String var197 = var10.field2644;
                                        int var198 = var189.field2832 + var196 + 2;
                                        String var199 = method1539(var197, var10);
                                        while (var199.length() > 0) {
                                            int var200 = var199.indexOf(class2.field18);
                                            String var201;
                                            if (var200 == -1) {
                                                var201 = var199;
                                                var199 = "";
                                            } else {
                                                var201 = var199.substring(0, var200);
                                                var199 = var199.substring(var200 + 4);
                                            }
                                            var189.method3383(var201, var195 + 3, var198, 0, -1);
                                            var198 += var189.field2832 + 1;
                                        }
                                    }
                                    if (var10.field2599 == 9) {
                                        if (var10.field2620 == 1) {
                                            class89.method1848(var13, var14, var10.field2707 + var13, var10.field2705 + var14, var10.field2614);
                                        } else {
                                            int var202 = var10.field2707 >= 0 ? var10.field2707 : -var10.field2707;
                                            int var203 = var10.field2705 >= 0 ? var10.field2705 : -var10.field2705;
                                            int var204 = var202;
                                            if (var202 < var203) {
                                                var204 = var203;
                                            }
                                            if (var204 != 0) {
                                                int var205 = (var10.field2707 << 16) / var204;
                                                int var206 = (var10.field2705 << 16) / var204;
                                                if (var206 <= var205) {
                                                    var205 = -var205;
                                                } else {
                                                    var206 = -var206;
                                                }
                                                int var207 = var10.field2620 * var206 >> 17;
                                                int var208 = var10.field2620 * var206 + 1 >> 17;
                                                int var209 = var10.field2620 * var205 >> 17;
                                                int var210 = var10.field2620 * var205 + 1 >> 17;
                                                int var211 = var13 + var207;
                                                int var212 = var13 - var208;
                                                int var213 = var10.field2707 + var13 - var208;
                                                int var214 = var10.field2707 + var13 + var207;
                                                int var215 = var14 + var209;
                                                int var216 = var14 - var210;
                                                int var217 = var10.field2705 + var14 - var210;
                                                int var218 = var10.field2705 + var14 + var209;
                                                class104.method2185(var211, var212, var213);
                                                class104.method2197(var215, var216, var217, var211, var212, var213, var10.field2614);
                                                class104.method2185(var211, var213, var214);
                                                class104.method2197(var215, var217, var218, var211, var213, var214, var10.field2614);
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

    @ObfuscatedName("bs.cu(Ljava/lang/String;Lfi;I)Ljava/lang/String;")
    public static String method1539(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method201(method642(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field2554 != null) {
                    var5 = class148.method249(Statics.field2554.field1420);
                    if (Statics.field2554.field1416 != null) {
                        var5 = (String) Statics.field2554.field1416;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ej.ca(II)Ljava/lang/String;")
    public static final String method3115(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field16 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2761(65408) + var1.substring(0, var1.length() - 8) + class135.field2313 + " " + class2.field30 + var1 + class2.field19 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method2761(16777215) + var1.substring(0, var1.length() - 4) + class135.field2250 + " " + class2.field30 + var1 + class2.field19 + class2.field22;
        } else {
            return " " + class2.method2761(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("i.cf(Lfi;IIIIIII)V")
    public static final void method112(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field553) {
            field554 = 32;
        } else {
            field554 = 0;
        }
        field553 = false;
        if (class77.field1401 == 1) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2597 -= 4;
                method148(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2597 += 4;
                method148(arg0);
            } else if (arg5 >= arg1 - field554 && arg5 < field554 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2597 = (arg4 - arg3) * var8 / var9;
                method148(arg0);
                field553 = true;
            }
        }
        if (field669 == 0) {
            return;
        }
        int var10 = arg0.field2707;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2597 += field669 * 45;
            method148(arg0);
        }
    }

    @ObfuscatedName("z.co(IB)Ljava/lang/String;")
    public static final String method201(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("cd.cg(Lfi;I)Z")
    public static final boolean method1596(class159 arg0) {
        if (arg0.field2694 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2694.length; var1++) {
            int var2 = method642(arg0, var1);
            int var3 = arg0.field2695[var1];
            if (arg0.field2694[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2694[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2694[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ak.ct(Lfi;IB)I")
    public static final int method642(class159 arg0, int arg1) {
        if (arg0.field2712 == null || arg1 >= arg0.field2712.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2712[arg1];
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
                    var7 = field610[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field611[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field612[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = Statics.method2760(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method712(var12).field1021 || field477)) {
                        for (int var13 = 0; var13 < var11.field2699.length; var13++) {
                            if (var12 + 1 == var11.field2699[var13]) {
                                var7 += var11.field2700[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2716[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2061[field611[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2716[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field428.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2060[var14]) {
                            var7 += field611[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = Statics.method2760(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method712(var18).field1021 || field477)) {
                        for (int var19 = 0; var19 < var17.field2699.length; var19++) {
                            if (var18 + 1 == var17.field2699[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field488;
                }
                if (var6 == 12) {
                    var7 = field511;
                }
                if (var6 == 13) {
                    int var20 = class160.field2716[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method1486(var22);
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
                    var7 = (Statics.field428.field418 >> 7) + Statics.field401;
                }
                if (var6 == 19) {
                    var7 = (Statics.field428.field412 >> 7) + Statics.field1268;
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

    @ObfuscatedName("an.cw(IIIIIIII)V")
    public static final void method1167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class159.method2219(arg0)) {
            method2875(Statics.field2592[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("eb.ck([Lfi;IIIIIIII)V")
    public static final void method2875(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2596 || var9.field2599 == 0 || var9.field2664 || method1677(var9) != 0 || field645 == var9) && var9.field2608 == arg1 && (!var9.field2596 || !method4(var9))) {
                int var10 = var9.field2593 + arg6;
                int var11 = var9.field2603 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2599 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2599 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2707 + var10;
                    int var19 = var9.field2705 + var11;
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
                    int var22 = var9.field2707 + var10;
                    int var23 = var9.field2705 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field498 == var9) {
                    field671 = true;
                    field579 = var10;
                    field615 = var11;
                }
                if (!var9.field2596 || var12 < var14 && var13 < var15) {
                    if (var9.field2622 == 1337) {
                        method148(var9);
                    } else if (var9.field2622 != 1338) {
                        if (var9.field2599 == 0) {
                            if (!var9.field2596 && method4(var9) && Statics.field624 != var9) {
                                continue;
                            }
                            method2875(arg0, var9.field2619, var12, var13, var14, var15, var10 - var9.field2610, var11 - var9.field2597);
                            if (var9.field2696 != null) {
                                method2875(var9.field2696, var9.field2619, var12, var13, var14, var15, var10 - var9.field2610, var11 - var9.field2597);
                            }
                            class4 var35 = (class4) field634.method3296((long) var9.field2619);
                            if (var35 != null) {
                                method1167(var35.field55, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2596) {
                            boolean var36;
                            if (class77.field1402 >= var12 && class77.field1406 >= var13 && class77.field1402 < var14 && class77.field1406 < var15) {
                                var36 = true;
                            } else {
                                var36 = false;
                            }
                            boolean var37 = false;
                            if (class77.field1401 == 1 && var36) {
                                var37 = true;
                            }
                            boolean var38 = false;
                            if (class77.field1412 == 1 && class77.field1409 >= var12 && class77.field1408 >= var13 && class77.field1409 < var14 && class77.field1408 < var15) {
                                var38 = true;
                            }
                            if (var38) {
                                method143(var9, class77.field1409 - var10, class77.field1408 - var11);
                            }
                            if (field498 != null && field498 != var9 && var36 && class163.method1888(method1677(var9))) {
                                field648 = var9;
                            }
                            if (field645 == var9) {
                                field649 = true;
                                field650 = var10;
                                field651 = var11;
                            }
                            if (var9.field2664) {
                                if (var36 && field669 != 0 && var9.field2685 != null) {
                                    class1 var39 = new class1();
                                    var39.field2 = var9;
                                    var39.field4 = field669;
                                    var39.field10 = var9.field2685;
                                    field670.method3312(var39);
                                }
                                if (field498 != null || Statics.field1662 != null || field614) {
                                    var38 = false;
                                    var37 = false;
                                    var36 = false;
                                }
                                if (!var9.field2607 && var38) {
                                    var9.field2607 = true;
                                    if (var9.field2666 != null) {
                                        class1 var40 = new class1();
                                        var40.field2 = var9;
                                        var40.field3 = class77.field1409 - var10;
                                        var40.field4 = class77.field1408 - var11;
                                        var40.field10 = var9.field2666;
                                        field670.method3312(var40);
                                    }
                                }
                                if (var9.field2607 && var37 && var9.field2693 != null) {
                                    class1 var41 = new class1();
                                    var41.field2 = var9;
                                    var41.field3 = class77.field1402 - var10;
                                    var41.field4 = class77.field1406 - var11;
                                    var41.field10 = var9.field2693;
                                    field670.method3312(var41);
                                }
                                if (var9.field2607 && !var37) {
                                    var9.field2607 = false;
                                    if (var9.field2668 != null) {
                                        class1 var42 = new class1();
                                        var42.field2 = var9;
                                        var42.field3 = class77.field1402 - var10;
                                        var42.field4 = class77.field1406 - var11;
                                        var42.field10 = var9.field2668;
                                        field672.method3312(var42);
                                    }
                                }
                                if (var37 && var9.field2677 != null) {
                                    class1 var43 = new class1();
                                    var43.field2 = var9;
                                    var43.field3 = class77.field1402 - var10;
                                    var43.field4 = class77.field1406 - var11;
                                    var43.field10 = var9.field2677;
                                    field670.method3312(var43);
                                }
                                if (!var9.field2706 && var36) {
                                    var9.field2706 = true;
                                    if (var9.field2670 != null) {
                                        class1 var44 = new class1();
                                        var44.field2 = var9;
                                        var44.field3 = class77.field1402 - var10;
                                        var44.field4 = class77.field1406 - var11;
                                        var44.field10 = var9.field2670;
                                        field670.method3312(var44);
                                    }
                                }
                                if (var9.field2706 && var36 && var9.field2671 != null) {
                                    class1 var45 = new class1();
                                    var45.field2 = var9;
                                    var45.field3 = class77.field1402 - var10;
                                    var45.field4 = class77.field1406 - var11;
                                    var45.field10 = var9.field2671;
                                    field670.method3312(var45);
                                }
                                if (var9.field2706 && !var36) {
                                    var9.field2706 = false;
                                    if (var9.field2672 != null) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field3 = class77.field1402 - var10;
                                        var46.field4 = class77.field1406 - var11;
                                        var46.field10 = var9.field2672;
                                        field672.method3312(var46);
                                    }
                                }
                                if (var9.field2591 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = var9;
                                    var47.field10 = var9.field2591;
                                    field705.method3312(var47);
                                }
                                if (var9.field2710 != null && field537 > var9.field2709) {
                                    if (var9.field2678 == null || field537 - var9.field2709 > 32) {
                                        class1 var52 = new class1();
                                        var52.field2 = var9;
                                        var52.field10 = var9.field2710;
                                        field670.method3312(var52);
                                    } else {
                                        label400: for (int var48 = var9.field2709; var48 < field537; var48++) {
                                            int var49 = field657[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2678.length; var50++) {
                                                if (var9.field2678[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field2 = var9;
                                                    var51.field10 = var9.field2710;
                                                    field670.method3312(var51);
                                                    break label400;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2709 = field537;
                                }
                                if (var9.field2604 != null && field694 > var9.field2658) {
                                    if (var9.field2595 == null || field694 - var9.field2658 > 32) {
                                        class1 var57 = new class1();
                                        var57.field2 = var9;
                                        var57.field10 = var9.field2604;
                                        field670.method3312(var57);
                                    } else {
                                        label380: for (int var53 = var9.field2658; var53 < field694; var53++) {
                                            int var54 = field503[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2595.length; var55++) {
                                                if (var9.field2595[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field2 = var9;
                                                    var56.field10 = var9.field2604;
                                                    field670.method3312(var56);
                                                    break label380;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2658 = field694;
                                }
                                if (var9.field2681 != null && field662 > var9.field2630) {
                                    if (var9.field2682 == null || field662 - var9.field2630 > 32) {
                                        class1 var62 = new class1();
                                        var62.field2 = var9;
                                        var62.field10 = var9.field2681;
                                        field670.method3312(var62);
                                    } else {
                                        label360: for (int var58 = var9.field2630; var58 < field662; var58++) {
                                            int var59 = field661[var58 & 0x1F];
                                            for (int var60 = 0; var60 < var9.field2682.length; var60++) {
                                                if (var9.field2682[var60] == var59) {
                                                    class1 var61 = new class1();
                                                    var61.field2 = var9;
                                                    var61.field10 = var9.field2681;
                                                    field670.method3312(var61);
                                                    break label360;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2630 = field662;
                                }
                                if (field621 > var9.field2676 && var9.field2613 != null) {
                                    class1 var63 = new class1();
                                    var63.field2 = var9;
                                    var63.field10 = var9.field2613;
                                    field670.method3312(var63);
                                }
                                if (field664 > var9.field2676 && var9.field2650 != null) {
                                    class1 var64 = new class1();
                                    var64.field2 = var9;
                                    var64.field10 = var9.field2650;
                                    field670.method3312(var64);
                                }
                                if (field665 > var9.field2676 && var9.field2689 != null) {
                                    class1 var65 = new class1();
                                    var65.field2 = var9;
                                    var65.field10 = var9.field2689;
                                    field670.method3312(var65);
                                }
                                if (field666 > var9.field2676 && var9.field2690 != null) {
                                    class1 var66 = new class1();
                                    var66.field2 = var9;
                                    var66.field10 = var9.field2690;
                                    field670.method3312(var66);
                                }
                                var9.field2676 = field656;
                                if (var9.field2687 != null) {
                                    for (int var67 = 0; var67 < field663; var67++) {
                                        class1 var68 = new class1();
                                        var68.field2 = var9;
                                        var68.field7 = field686[var67];
                                        var68.field1 = field695[var67];
                                        var68.field10 = var9.field2687;
                                        field670.method3312(var68);
                                    }
                                }
                            }
                        }
                        if (!var9.field2596) {
                            if (field498 != null || Statics.field1662 != null || field614) {
                                return;
                            }
                            if ((var9.field2602 >= 0 || var9.field2616 != 0) && class77.field1402 >= var12 && class77.field1406 >= var13 && class77.field1402 < var14 && class77.field1406 < var15) {
                                if (var9.field2602 >= 0) {
                                    Statics.field624 = arg0[var9.field2602];
                                } else {
                                    Statics.field624 = var9;
                                }
                            }
                            if (var9.field2599 == 8 && class77.field1402 >= var12 && class77.field1406 >= var13 && class77.field1402 < var14 && class77.field1406 < var15) {
                                Statics.field1282 = var9;
                            }
                            if (var9.field2669 > var9.field2705) {
                                method112(var9, var9.field2707 + var10, var11, var9.field2705, var9.field2669, class77.field1402, class77.field1406);
                            }
                        }
                    } else if ((field707 == 0 || field707 == 3) && class77.field1412 == 1) {
                        int var24 = class77.field1409 - 25 - var10;
                        int var25 = class77.field1408 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field556 + field542 & 0x7FF;
                            int var27 = class104.field1776[var26];
                            int var28 = class104.field1791[var26];
                            int var29 = (field559 + 256) * var27 >> 8;
                            int var30 = (field559 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field428.field418 + var31 >> 7;
                            int var34 = Statics.field428.field412 - var32 >> 7;
                            field591.method2345(84);
                            field591.method2450(18);
                            field591.method2593(Statics.field401 + var33);
                            field591.method2493(Statics.field1268 + var34);
                            field591.method2487(class75.field1372[82] ? (class75.field1372[81] ? 2 : 1) : 0);
                            field591.method2450(var24);
                            field591.method2450(var25);
                            field591.method2593(field556);
                            field591.method2450(57);
                            field591.method2450(field542);
                            field591.method2450(field559);
                            field591.method2450(89);
                            field591.method2593(Statics.field428.field418);
                            field591.method2593(Statics.field428.field412);
                            field591.method2450(63);
                            field730 = var33;
                            field706 = var34;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("i.cx(IIB)V")
    public static final void method114(int arg0, int arg1) {
        if (class159.method2219(arg0)) {
            method831(Statics.field2592[arg0], arg1);
        }
    }

    @ObfuscatedName("as.cv([Lfi;IB)V")
    public static final void method831(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2599 == 0) {
                    if (var3.field2696 != null) {
                        method831(var3.field2696, arg1);
                    }
                    class4 var4 = (class4) field634.method3296((long) var3.field2619);
                    if (var4 != null) {
                        method114(var4.field55, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2691 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field10 = var3.field2691;
                    class26.method1675(var5);
                }
                if (arg1 == 1 && var3.field2692 != null) {
                    if (var3.field2598 >= 0) {
                        class159 var6 = Statics.method2760(var3.field2619);
                        if (var6 == null || var6.field2696 == null || var3.field2598 >= var6.field2696.length || var6.field2696[var3.field2598] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field10 = var3.field2692;
                    class26.method1675(var7);
                }
            }
        }
    }

    @ObfuscatedName("g.cp(Lfi;III)V")
    public static final void method143(class159 arg0, int arg1, int arg2) {
        if (field498 != null || field614 || arg0 == null) {
            return;
        }
        class159 var3 = arg0;
        int var4 = method1677(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class159 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = Statics.method2760(var3.field2608);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class159 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2659;
        }
        if (var9 == null) {
            return;
        }
        field498 = arg0;
        class159 var11 = arg0;
        int var12 = method1677(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class159 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = Statics.method2760(var11.field2608);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class159 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2659;
        }
        field645 = var17;
        field710 = arg1;
        field647 = arg2;
        Statics.field1040 = 0;
        field655 = false;
        return;
    }

    @ObfuscatedName("e.cs(I)V")
    public static final void method214() {
        method148(field498);
        Statics.field1040++;
        if (field671 && field649) {
            int var0 = class77.field1402;
            int var1 = class77.field1406;
            int var2 = var0 - field710;
            int var3 = var1 - field647;
            if (var2 < field650) {
                var2 = field650;
            }
            if (field498.field2707 + var2 > field650 + field645.field2707) {
                var2 = field650 + field645.field2707 - field498.field2707;
            }
            if (var3 < field651) {
                var3 = field651;
            }
            if (field498.field2705 + var3 > field651 + field645.field2705) {
                var3 = field651 + field645.field2705 - field498.field2705;
            }
            int var4 = var2 - field579;
            int var5 = var3 - field615;
            int var6 = field498.field2648;
            if (Statics.field1040 > field498.field2661 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field655 = true;
            }
            int var7 = field645.field2610 + (var2 - field650);
            int var8 = field645.field2597 + (var3 - field651);
            if (field498.field2673 != null && field655) {
                class1 var9 = new class1();
                var9.field2 = field498;
                var9.field3 = var7;
                var9.field4 = var8;
                var9.field10 = field498.field2673;
                class26.method1675(var9);
            }
            if (class77.field1401 == 0) {
                if (field655) {
                    if (field498.field2674 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field498;
                        var10.field3 = var7;
                        var10.field4 = var8;
                        var10.field14 = field648;
                        var10.field10 = field498.field2674;
                        class26.method1675(var10);
                    }
                    if (field648 != null) {
                        class159 var11 = field498;
                        int var12 = method1677(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class159 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = Statics.method2760(var11.field2608);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field591.method2345(209);
                            field591.method2453(field498.field2619);
                            field591.method2503(field648.field2619);
                            field591.method2494(field648.field2598);
                            field591.method2493(field498.field2598);
                        }
                    }
                } else if ((field613 == 1 || method171(field535 - 1)) && field535 > 2) {
                    method2944();
                } else if (field535 > 0) {
                    method2715(field535 - 1);
                }
                field498 = null;
            }
        } else if (Statics.field1040 > 1) {
            field498 = null;
        }
    }

    @ObfuscatedName("r.cy(Lfi;B)V")
    public static void method148(class159 arg0) {
        if (field675 == arg0.field2713) {
            field676[arg0.field2651] = true;
        }
    }

    @ObfuscatedName("ci.cn(I)V")
    public static void method1674() {
        for (class4 var0 = (class4) field634.method3298(); var0 != null; var0 = (class4) field634.method3299()) {
            int var1 = var0.field55;
            if (class159.method2219(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2592[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2596;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2813;
                    class159 var6 = Statics.method2760(var5);
                    if (var6 != null) {
                        method148(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.cb([Ljava/lang/String;S)[Ljava/lang/String;")
    public static final String[] method225(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("u.ch(II)V")
    public static final void method43(int arg0) {
        if (!class159.method2219(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2592[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2703 = 0;
                var3.field2704 = 0;
            }
        }
    }

    @ObfuscatedName("client.cz([Lfi;IB)V")
    public static final void method515(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2608 == arg1 && (!var3.field2596 || !method4(var3))) {
                if (var3.field2599 == 0) {
                    if (!var3.field2596 && method4(var3) && Statics.field624 != var3) {
                        continue;
                    }
                    method515(arg0, var3.field2619);
                    if (var3.field2696 != null) {
                        method515(var3.field2696, var3.field2619);
                    }
                    class4 var4 = (class4) field634.method3296((long) var3.field2619);
                    if (var4 != null) {
                        Statics.method2730(var4.field55);
                    }
                }
                if (var3.field2599 == 6) {
                    if (var3.field2633 != -1 || var3.field2634 != -1) {
                        boolean var5 = method1596(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2634;
                        } else {
                            var6 = var3.field2633;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method612(var6);
                            var3.field2704 += field547;
                            while (var3.field2704 > var7.field881[var3.field2703]) {
                                var3.field2704 -= var7.field881[var3.field2703];
                                var3.field2703++;
                                if (var3.field2703 >= var7.field879.length) {
                                    var3.field2703 -= var7.field884;
                                    if (var3.field2703 < 0 || var3.field2703 >= var7.field879.length) {
                                        var3.field2703 = 0;
                                    }
                                }
                                method148(var3);
                            }
                        }
                    }
                    if (var3.field2641 != 0 && !var3.field2596) {
                        int var8 = var3.field2641 >> 16;
                        int var9 = var3.field2641 << 16 >> 16;
                        int var10 = field547 * var8;
                        int var11 = field547 * var9;
                        var3.field2637 = var3.field2637 + var10 & 0x7FF;
                        var3.field2638 = var3.field2638 + var11 & 0x7FF;
                        method148(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cx.cj(II)V")
    public static final void method1889(int arg0) {
        method1674();
        for (class7 var1 = (class7) class7.field101.method3338(); var1 != null; var1 = (class7) class7.field101.method3323()) {
            if (var1.field97 != null) {
                var1.method47();
            }
        }
        int var2 = class42.method2199(arg0).field1045;
        if (var2 == 0) {
            return;
        }
        int var3 = class160.field2716[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2175(0.9D);
                ((class110) Statics.field1787).method2220(0.9D);
            }
            if (var3 == 2) {
                class104.method2175(0.8D);
                ((class110) Statics.field1787).method2220(0.8D);
            }
            if (var3 == 3) {
                class104.method2175(0.7D);
                ((class110) Statics.field1787).method2220(0.7D);
            }
            if (var3 == 4) {
                class104.method2175(0.6D);
                ((class110) Statics.field1787).method2220(0.6D);
            }
            class40.field1019.method3265();
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
            if (field515 != var4) {
                if (field515 == 0 && field709 != -1) {
                    class139.method8(Statics.field2449, field709, 0, var4, false);
                    field514 = false;
                } else if (var4 == 0) {
                    Statics.field2345.method2850();
                    class139.field2347 = 1;
                    Statics.field2346 = null;
                    field514 = false;
                } else {
                    class139.method1287(var4);
                }
                field515 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field711 = 127;
            }
            if (var3 == 1) {
                field711 = 96;
            }
            if (var3 == 2) {
                field711 = 64;
            }
            if (var3 == 3) {
                field711 = 32;
            }
            if (var3 == 4) {
                field711 = 0;
            }
        }
        if (var2 == 5) {
            field613 = var3;
        }
        if (var2 == 6) {
            field635 = var3;
        }
        if (var2 == 9) {
            field593 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field512 = 127;
        }
        if (var3 == 1) {
            field512 = 96;
        }
        if (var3 == 2) {
            field512 = 64;
        }
        if (var3 == 3) {
            field512 = 32;
        }
        if (var3 == 4) {
            field512 = 0;
        }
    }

    @ObfuscatedName("c.dp(I)V")
    public static final void method116() {
        field591.method2345(73);
        for (class4 var0 = (class4) field634.method3298(); var0 != null; var0 = (class4) field634.method3299()) {
            if (var0.field53 == 0 || var0.field53 == 3) {
                method173(var0, true);
            }
        }
        if (field637 != null) {
            method148(field637);
            field637 = null;
        }
    }

    @ObfuscatedName("k.dd(Lh;ZI)V")
    public static final void method173(class4 arg0, boolean arg1) {
        int var2 = arg0.field55;
        int var3 = (int) arg0.field2813;
        arg0.method3349();
        if (arg1 && var2 != -1 && Statics.field2688[var2]) {
            Statics.field2667.method3093(var2);
            if (Statics.field2592[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2592[var2].length; var5++) {
                    if (Statics.field2592[var2][var5] != null) {
                        if (Statics.field2592[var2][var5].field2599 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2592[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2592[var2] = null;
                }
                Statics.field2688[var2] = false;
            }
        }
        method886(var2);
        class159 var6 = Statics.method2760(var3);
        if (var6 != null) {
            method148(var6);
        }
        method3222();
        if (field516 != -1) {
            method114(field516, 1);
        }
    }

    @ObfuscatedName("bb.df(Lfi;B)Z")
    public static final boolean method1241(class159 arg0) {
        int var1 = arg0.field2622;
        if (var1 == 205) {
            field519 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field731.method3246(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field731.method3219(var4, var5 == 1);
        }
        if (var1 == 324) {
            field731.method3221(false);
        }
        if (var1 == 325) {
            field731.method3221(true);
        }
        if (var1 == 326) {
            field591.method2345(51);
            field731.method3229(field591);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("be.ds(IIIB)V")
    public static final void method1360(int arg0, int arg1, int arg2) {
        method137();
        class89.method1798(arg0, arg1, Statics.field2408.field1489 + arg0, Statics.field2408.field1490 + arg1);
        if (field707 == 2 || field707 == 5) {
            class89.method1832(arg0 + 25, arg1 + 5, 0, Statics.field548, Statics.field932);
        } else {
            int var3 = field556 + field542 & 0x7FF;
            int var4 = Statics.field428.field418 / 32 + 48;
            int var5 = 464 - Statics.field428.field412 / 32;
            Statics.field1031.method1777(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field559 + 256, Statics.field548, Statics.field932);
            for (int var6 = 0; var6 < field683; var6++) {
                int var7 = field702[var6] * 4 + 2 - Statics.field428.field418 / 32;
                int var8 = field703[var6] * 4 + 2 - Statics.field428.field412 / 32;
                method31(arg0, arg1, var7, var8, field704[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field606[Statics.field1807][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field428.field418 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field428.field412 / 32;
                        method31(arg0, arg1, var12, var13, Statics.field882[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field510; var14++) {
                class25 var15 = field509[field499[var14]];
                if (var15 != null && var15.method18()) {
                    class31 var16 = var15.field383;
                    if (var16 != null && var16.field796 != null) {
                        var16 = var16.method637();
                    }
                    if (var16 != null && var16.field775 && var16.field786) {
                        int var17 = var15.field418 / 32 - Statics.field428.field418 / 32;
                        int var18 = var15.field412 / 32 - Statics.field428.field412 / 32;
                        method31(arg0, arg1, var17, var18, Statics.field882[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field701; var19++) {
                class3 var20 = field592[field626[var19]];
                if (var20 != null && var20.method18()) {
                    int var21 = var20.field418 / 32 - Statics.field428.field418 / 32;
                    int var22 = var20.field412 / 32 - Statics.field428.field412 / 32;
                    boolean var23 = false;
                    if (method2718(var20.field37)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field206; var25++) {
                        if (var20.field37.equals(Statics.field1273[var25].field114)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field428.field49 != 0 && var20.field49 != 0 && Statics.field428.field49 == var20.field49) {
                        var26 = true;
                    }
                    if (var23) {
                        method31(arg0, arg1, var21, var22, Statics.field882[3]);
                    } else if (var26) {
                        method31(arg0, arg1, var21, var22, Statics.field882[4]);
                    } else if (var24) {
                        method31(arg0, arg1, var21, var22, Statics.field882[5]);
                    } else {
                        method31(arg0, arg1, var21, var22, Statics.field882[2]);
                    }
                }
            }
            if (field536 != 0 && field699 % 20 < 10) {
                if (field536 == 1 && field489 >= 0 && field489 < field509.length) {
                    class25 var27 = field509[field489];
                    if (var27 != null) {
                        int var28 = var27.field418 / 32 - Statics.field428.field418 / 32;
                        int var29 = var27.field412 / 32 - Statics.field428.field412 / 32;
                        method67(arg0, arg1, var28, var29, Statics.field752[1]);
                    }
                }
                if (field536 == 2) {
                    int var30 = field493 * 4 - Statics.field401 * 4 + 2 - Statics.field428.field418 / 32;
                    int var31 = field697 * 4 - Statics.field1268 * 4 + 2 - Statics.field428.field412 / 32;
                    method67(arg0, arg1, var30, var31, Statics.field752[1]);
                }
                if (field536 == 10 && field492 >= 0 && field492 < field592.length) {
                    class3 var32 = field592[field492];
                    if (var32 != null) {
                        int var33 = var32.field418 / 32 - Statics.field428.field418 / 32;
                        int var34 = var32.field412 / 32 - Statics.field428.field412 / 32;
                        method67(arg0, arg1, var33, var34, Statics.field752[1]);
                    }
                }
            }
            if (field730 != 0) {
                int var35 = field730 * 4 + 2 - Statics.field428.field418 / 32;
                int var36 = field706 * 4 + 2 - Statics.field428.field412 / 32;
                method31(arg0, arg1, var35, var36, Statics.field752[0]);
            }
            class89.method1854(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field707 < 3) {
            Statics.field242.method1777(arg0, arg1, 33, 33, 25, 25, field556, 256, Statics.field146, Statics.field64);
        } else {
            class89.method1832(arg0, arg1, 0, Statics.field146, Statics.field64);
        }
        if (field678[arg2]) {
            Statics.field2408.method1782(arg0, arg1);
        }
        field677[arg2] = true;
    }

    @ObfuscatedName("n.dj(IIIILcu;I)V")
    public static final void method67(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method31(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field556 + field542 & 0x7FF;
        int var7 = class104.field1776[var6];
        int var8 = class104.field1791[var6];
        int var9 = var7 * 256 / (field559 + 256);
        int var10 = var8 * 256 / (field559 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1561.method1702(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("o.dr(IIIILcu;B)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field556 + field542 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1776[var5];
        int var8 = class104.field1791[var5];
        int var9 = var7 * 256 / (field559 + 256);
        int var10 = var8 * 256 / (field559 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1705(Statics.field2408, arg0 + 94 + var11 - arg4.field1480 / 2 + 4, arg1 + 83 - var12 - arg4.field1481 / 2 - 4);
        } else {
            arg4.method1775(arg0 + 94 + var11 - arg4.field1480 / 2 + 4, arg1 + 83 - var12 - arg4.field1481 / 2 - 4);
        }
    }

    @ObfuscatedName("cr.dv(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1647(int arg0, String arg1, String arg2) {
        method16(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("f.do(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method16(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field684[var4] = field684[var4 - 1];
            field685[var4] = field685[var4 - 1];
            field687[var4] = field687[var4 - 1];
            field575[var4] = field575[var4 - 1];
        }
        field684[0] = arg0;
        field685[0] = arg1;
        field687[0] = arg2;
        field575[0] = arg3;
        field688++;
        field621 = field656;
    }

    @ObfuscatedName("ef.dx(Ljava/lang/String;B)Z")
    public static boolean method2718(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method29(arg0, Statics.field668);
        for (int var2 = 0; var2 < field725; var2++) {
            if (var1.equalsIgnoreCase(class149.method29(field727[var2].field359, Statics.field668))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method29(Statics.field428.field37, Statics.field668))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("az.dk(Ljava/lang/String;I)Z")
    public static boolean method808(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method29(arg0, Statics.field668);
        for (int var2 = 0; var2 < field729; var2++) {
            class11 var3 = field494[var2];
            if (var1.equalsIgnoreCase(class149.method29(var3.field186, Statics.field668))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method29(var3.field180, Statics.field668))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bw.dn(Ljava/lang/String;ZB)V")
    public static final void method1374(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field729 < 100 || field599 == 1) || field729 >= 400) {
            method1647(0, "", class135.field2255);
            return;
        }
        String var2 = class149.method29(arg0, Statics.field668);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field729; var3++) {
            class11 var4 = field494[var3];
            String var5 = class149.method29(var4.field186, Statics.field668);
            if (var5 != null && var5.equals(var2)) {
                method1647(0, "", arg0 + class135.field2256);
                return;
            }
            if (var4.field180 != null) {
                String var6 = class149.method29(var4.field180, Statics.field668);
                if (var6 != null && var6.equals(var2)) {
                    method1647(0, "", arg0 + class135.field2256);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field725; var7++) {
            class23 var8 = field727[var7];
            String var9 = class149.method29(var8.field359, Statics.field668);
            if (var9 != null && var9.equals(var2)) {
                method1647(0, "", class135.field2261 + arg0 + class135.field2262);
                return;
            }
            if (var8.field356 != null) {
                String var10 = class149.method29(var8.field356, Statics.field668);
                if (var10 != null && var10.equals(var2)) {
                    method1647(0, "", class135.field2261 + arg0 + class135.field2262);
                    return;
                }
            }
        }
        if (class149.method29(Statics.field428.field37, Statics.field668).equals(var2)) {
            method1647(0, "", class135.field2258);
        } else {
            field591.method2345(156);
            field591.method2450(class127.method1431(arg0));
            field591.method2455(arg0);
        }
    }

    @ObfuscatedName("t.dg(Ljava/lang/String;II)V")
    public static final void method54(String arg0, int arg1) {
        field591.method2345(166);
        field591.method2450(class127.method1431(arg0) + 1);
        field591.method2486(arg1);
        field591.method2455(arg0);
    }

    @ObfuscatedName("ct.dt(Ljava/lang/String;I)V")
    public static final void method1874(String arg0) {
        if (!arg0.equals("")) {
            field591.method2345(61);
            field591.method2450(class127.method1431(arg0));
            field591.method2455(arg0);
        }
    }

    @ObfuscatedName("p.dy(I)V")
    public static final void method203() {
        field591.method2345(61);
        field591.method2450(0);
    }

    @ObfuscatedName("aa.di(IB)V")
    public static void method886(int arg0) {
        for (class171 var1 = (class171) field673.method3298(); var1 != null; var1 = (class171) field673.method3299()) {
            if ((long) arg0 == (var1.field2813 >> 48 & 0xFFFFL)) {
                var1.method3349();
            }
        }
    }

    @ObfuscatedName("ci.de(Lfi;I)I")
    public static int method1677(class159 arg0) {
        class171 var1 = (class171) field673.method3296(((long) arg0.field2619 << 32) + (long) arg0.field2598);
        return var1 == null ? arg0.field2656 : var1.field2795;
    }

    @ObfuscatedName("j.db(Lfi;I)Z")
    public static boolean method4(class159 arg0) {
        if (field642) {
            if (method1677(arg0) != 0) {
                return false;
            }
            if (arg0.field2599 == 0) {
                return false;
            }
        }
        return arg0.field2660;
    }

    @ObfuscatedName("ak.dl(Lfi;I)Ljava/lang/String;")
    public static String method656(class159 arg0) {
        if (class163.method1881(method1677(arg0)) == 0) {
            return null;
        } else if (arg0.field2663 == null || arg0.field2663.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2663;
        }
    }
}

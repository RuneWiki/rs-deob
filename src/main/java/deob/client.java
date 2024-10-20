package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.g")
    public static boolean field467 = true;

    @ObfuscatedName("client.o")
    public static int field692 = 1;

    @ObfuscatedName("client.h")
    public static int field469 = 0;

    @ObfuscatedName("client.q")
    public static boolean field472 = false;

    @ObfuscatedName("client.l")
    public static boolean field473 = false;

    @ObfuscatedName("client.d")
    public static int field474 = 0;

    @ObfuscatedName("client.n")
    public static int field652 = 0;

    @ObfuscatedName("client.t")
    public static boolean field708 = true;

    @ObfuscatedName("client.w")
    public static class130[] field528 = new class130[4];

    @ObfuscatedName("client.r")
    public static int field477 = 0;

    @ObfuscatedName("client.v")
    public static long field653 = 1L;

    @ObfuscatedName("client.p")
    public static int field475 = -1;

    @ObfuscatedName("client.s")
    public static int field480 = -1;

    @ObfuscatedName("client.m")
    public static int field481 = -1;

    @ObfuscatedName("client.c")
    public static boolean field539 = true;

    @ObfuscatedName("client.i")
    public static boolean field501 = false;

    @ObfuscatedName("client.u")
    public static int field484 = 0;

    @ObfuscatedName("client.at")
    public static int field485 = 0;

    @ObfuscatedName("client.as")
    public static int field541 = 0;

    @ObfuscatedName("client.ax")
    public static int field487 = 0;

    @ObfuscatedName("client.ao")
    public static int field488 = 0;

    @ObfuscatedName("client.aq")
    public static int field489 = 0;

    @ObfuscatedName("client.am")
    public static int field490 = 0;

    @ObfuscatedName("client.al")
    public static int field491 = 0;

    @ObfuscatedName("client.ab")
    public static int field492 = 0;

    @ObfuscatedName("client.aw")
    public static class126 field493 = new class126(new byte[5000]);

    @ObfuscatedName("client.ay")
    public static int field494 = 0;

    @ObfuscatedName("client.ap")
    public static int field495 = 0;

    @ObfuscatedName("client.af")
    public static int field496 = 0;

    @ObfuscatedName("client.bn")
    public static int field500 = 0;

    @ObfuscatedName("client.bo")
    public static int field465 = 0;

    @ObfuscatedName("client.bv")
    public static int field502 = 0;

    @ObfuscatedName("client.bd")
    public static int field503 = 0;

    @ObfuscatedName("client.bt")
    public static int field504 = 0;

    @ObfuscatedName("client.bc")
    public static class25[] field505 = new class25[32768];

    @ObfuscatedName("client.bs")
    public static int field506 = 0;

    @ObfuscatedName("client.by")
    public static int[] field507 = new int[32768];

    @ObfuscatedName("client.cp")
    public static class116 field602 = new class116(5000);

    @ObfuscatedName("client.ch")
    public static class116 field617 = new class116(5000);

    @ObfuscatedName("client.ct")
    public static class116 field498 = new class116(5000);

    @ObfuscatedName("client.cr")
    public static int field512 = 0;

    @ObfuscatedName("client.ca")
    public static int field513 = 0;

    @ObfuscatedName("client.cs")
    public static int field514 = 0;

    @ObfuscatedName("client.cb")
    public static int field533 = 0;

    @ObfuscatedName("client.cv")
    public static int field593 = 0;

    @ObfuscatedName("client.cy")
    public static int field517 = 0;

    @ObfuscatedName("client.cn")
    public static int field597 = 0;

    @ObfuscatedName("client.cz")
    public static int field519 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field520 = false;

    @ObfuscatedName("client.co")
    public static int field521 = 0;

    @ObfuscatedName("client.cu")
    public static int field522 = 0;

    @ObfuscatedName("client.ce")
    public static int field715 = 1;

    @ObfuscatedName("client.ck")
    public static int field674 = 0;

    @ObfuscatedName("client.cw")
    public static int field727 = 1;

    @ObfuscatedName("client.dd")
    public static int field526 = 0;

    @ObfuscatedName("client.dk")
    public static boolean field529 = false;

    @ObfuscatedName("client.dy")
    public static int[][][] field530 = new int[4][13][13];

    @ObfuscatedName("client.dx")
    public static final int[] field531 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.de")
    public static int field532 = 0;

    @ObfuscatedName("client.du")
    public static int field718 = 2;

    @ObfuscatedName("client.dl")
    public static int field534 = 0;

    @ObfuscatedName("client.dm")
    public static int field535 = 2;

    @ObfuscatedName("client.dz")
    public static int field536 = 0;

    @ObfuscatedName("client.dh")
    public static int field516 = 1;

    @ObfuscatedName("client.df")
    public static int field716 = 0;

    @ObfuscatedName("client.dc")
    public static int field675 = 0;

    @ObfuscatedName("client.dv")
    public static int field540 = 2;

    @ObfuscatedName("client.da")
    public static int field730 = 0;

    @ObfuscatedName("client.dq")
    public static int field588 = 1;

    @ObfuscatedName("client.dg")
    public static int field543 = 0;

    @ObfuscatedName("client.dt")
    public static int field621 = 0;

    @ObfuscatedName("client.eq")
    public static int field726 = 2301979;

    @ObfuscatedName("client.ec")
    public static int field547 = 5063219;

    @ObfuscatedName("client.ea")
    public static int field546 = 3353893;

    @ObfuscatedName("client.ez")
    public static int field701 = 7759444;

    @ObfuscatedName("client.ej")
    public static boolean field550 = false;

    @ObfuscatedName("client.eo")
    public static int field607 = 0;

    @ObfuscatedName("client.fo")
    public static int field552 = 128;

    @ObfuscatedName("client.fd")
    public static int field702 = 0;

    @ObfuscatedName("client.fk")
    public static int field544 = 0;

    @ObfuscatedName("client.fz")
    public static int field555 = 0;

    @ObfuscatedName("client.fq")
    public static int field556 = 0;

    @ObfuscatedName("client.fm")
    public static int field557 = 0;

    @ObfuscatedName("client.fy")
    public static int field732 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field559 = false;

    @ObfuscatedName("client.ft")
    public static int field560 = 0;

    @ObfuscatedName("client.fx")
    public static int field561 = 0;

    @ObfuscatedName("client.fl")
    public static int field551 = 50;

    @ObfuscatedName("client.fv")
    public static int[] field563 = new int[field551];

    @ObfuscatedName("client.fs")
    public static int[] field564 = new int[field551];

    @ObfuscatedName("client.fe")
    public static int[] field565 = new int[field551];

    @ObfuscatedName("client.fa")
    public static int[] field672 = new int[field551];

    @ObfuscatedName("client.fj")
    public static int[] field567 = new int[field551];

    @ObfuscatedName("client.fr")
    public static int[] field625 = new int[field551];

    @ObfuscatedName("client.fc")
    public static int[] field569 = new int[field551];

    @ObfuscatedName("client.fi")
    public static String[] field525 = new String[field551];

    @ObfuscatedName("client.fp")
    public static int[][] field571 = new int[104][104];

    @ObfuscatedName("client.ff")
    public static int field636 = 0;

    @ObfuscatedName("client.gm")
    public static int field573 = -1;

    @ObfuscatedName("client.gq")
    public static int field574 = -1;

    @ObfuscatedName("client.gs")
    public static int field661 = 0;

    @ObfuscatedName("client.gf")
    public static int field576 = 0;

    @ObfuscatedName("client.gl")
    public static int field577 = 0;

    @ObfuscatedName("client.ga")
    public static int field578 = 0;

    @ObfuscatedName("client.gi")
    public static int field579 = 0;

    @ObfuscatedName("client.gn")
    public static int field626 = 0;

    @ObfuscatedName("client.gx")
    public static int field581 = 0;

    @ObfuscatedName("client.gb")
    public static int field582 = 0;

    @ObfuscatedName("client.gg")
    public static int field583 = 0;

    @ObfuscatedName("client.gy")
    public static int field584 = 0;

    @ObfuscatedName("client.gu")
    public static boolean field699 = false;

    @ObfuscatedName("client.gd")
    public static int field586 = 0;

    @ObfuscatedName("client.gk")
    public static int field587 = 0;

    @ObfuscatedName("client.gj")
    public static class3[] field511 = new class3[2048];

    @ObfuscatedName("client.gc")
    public static int field589 = 0;

    @ObfuscatedName("client.gz")
    public static int[] field590 = new int[2048];

    @ObfuscatedName("client.gw")
    public static int field591 = 0;

    @ObfuscatedName("client.ge")
    public static int[] field585 = new int[2048];

    @ObfuscatedName("client.gr")
    public static class126[] field600 = new class126[2048];

    @ObfuscatedName("client.hp")
    public static int field723 = -1;

    @ObfuscatedName("client.hj")
    public static int field595 = 0;

    @ObfuscatedName("client.hg")
    public static int field596 = 0;

    @ObfuscatedName("client.hu")
    public static int[] field486 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field598 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hk")
    public static String[] field599 = new String[8];

    @ObfuscatedName("client.hs")
    public static boolean[] field669 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field523 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hi")
    public static class177[][][] field656 = new class177[4][104][104];

    @ObfuscatedName("client.hw")
    public static class177 field603 = new class177();

    @ObfuscatedName("client.hl")
    public static class177 field604 = new class177();

    @ObfuscatedName("client.hr")
    public static class177 field570 = new class177();

    @ObfuscatedName("client.hf")
    public static int[] field710 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field627 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field642 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field537 = 0;

    @ObfuscatedName("client.hm")
    public static boolean field610 = false;

    @ObfuscatedName("client.hx")
    public static int field524 = 0;

    @ObfuscatedName("client.ih")
    public static int[] field612 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field613 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field509 = new int[500];

    @ObfuscatedName("client.ij")
    public static int[] field615 = new int[500];

    @ObfuscatedName("client.if")
    public static String[] field616 = new String[500];

    @ObfuscatedName("client.in")
    public static String[] field510 = new String[500];

    @ObfuscatedName("client.ip")
    public static int field619 = -1;

    @ObfuscatedName("client.iu")
    public static int field592 = -1;

    @ObfuscatedName("client.ic")
    public static int field620 = 0;

    @ObfuscatedName("client.iw")
    public static int field482 = 50;

    @ObfuscatedName("client.ib")
    public static int field622 = 0;

    @ObfuscatedName("client.ia")
    public static String field623 = null;

    @ObfuscatedName("client.io")
    public static boolean field575 = false;

    @ObfuscatedName("client.iz")
    public static int field646 = -1;

    @ObfuscatedName("client.ii")
    public static String field614 = null;

    @ObfuscatedName("client.id")
    public static String field722 = null;

    @ObfuscatedName("client.iq")
    public static int field628 = -1;

    @ObfuscatedName("client.is")
    public static class175 field629 = new class175(8);

    @ObfuscatedName("client.ir")
    public static int field630 = 0;

    @ObfuscatedName("client.jy")
    public static int field631 = 0;

    @ObfuscatedName("client.jl")
    public static class159 field632 = null;

    @ObfuscatedName("client.ju")
    public static int field633 = 0;

    @ObfuscatedName("client.jh")
    public static int field634 = 0;

    @ObfuscatedName("client.ji")
    public static int field635 = 0;

    @ObfuscatedName("client.je")
    public static boolean field553 = false;

    @ObfuscatedName("client.jz")
    public static boolean field637 = false;

    @ObfuscatedName("client.jt")
    public static boolean field638 = false;

    @ObfuscatedName("client.jk")
    public static class159 field639 = null;

    @ObfuscatedName("client.jq")
    public static class159 field640 = null;

    @ObfuscatedName("client.jd")
    public static int field641 = 0;

    @ObfuscatedName("client.jn")
    public static int field696 = 0;

    @ObfuscatedName("client.js")
    public static class159 field643 = null;

    @ObfuscatedName("client.jb")
    public static boolean field729 = false;

    @ObfuscatedName("client.jc")
    public static int field645 = -1;

    @ObfuscatedName("client.jg")
    public static int field542 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field647 = false;

    @ObfuscatedName("client.jw")
    public static int field648 = -1;

    @ObfuscatedName("client.jx")
    public static int field649 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field650 = false;

    @ObfuscatedName("client.jv")
    public static int field651 = 1;

    @ObfuscatedName("client.ke")
    public static int[] field624 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field714 = 0;

    @ObfuscatedName("client.km")
    public static int[] field654 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field655 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field668 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field657 = 0;

    @ObfuscatedName("client.kh")
    public static int field658 = 0;

    @ObfuscatedName("client.kq")
    public static int field659 = 0;

    @ObfuscatedName("client.kk")
    public static int field660 = 0;

    @ObfuscatedName("client.ki")
    public static int field499 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field662 = new int[2000];

    @ObfuscatedName("client.kb")
    public static String[] field663 = new String[1000];

    @ObfuscatedName("client.kg")
    public static int field664 = 0;

    @ObfuscatedName("client.kd")
    public static class177 field665 = new class177();

    @ObfuscatedName("client.kw")
    public static class177 field719 = new class177();

    @ObfuscatedName("client.kf")
    public static class177 field667 = new class177();

    @ObfuscatedName("client.kj")
    public static class175 field518 = new class175(512);

    @ObfuscatedName("client.kl")
    public static int field468 = 0;

    @ObfuscatedName("client.kv")
    public static int field478 = -2;

    @ObfuscatedName("client.kp")
    public static boolean[] field671 = new boolean[100];

    @ObfuscatedName("client.kc")
    public static boolean[] field558 = new boolean[100];

    @ObfuscatedName("client.ku")
    public static boolean[] field673 = new boolean[100];

    @ObfuscatedName("client.ks")
    public static int[] field611 = new int[100];

    @ObfuscatedName("client.lu")
    public static int[] field606 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field676 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field677 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field678 = 0;

    @ObfuscatedName("client.lq")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lx")
    public static String[] field680 = new String[100];

    @ObfuscatedName("client.la")
    public static String[] field681 = new String[100];

    @ObfuscatedName("client.lh")
    public static String[] field682 = new String[100];

    @ObfuscatedName("client.ls")
    public static int field683 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field605 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field685 = 0;

    @ObfuscatedName("client.lv")
    public static int field686 = 0;

    @ObfuscatedName("client.lc")
    public static long[] field687 = new long[100];

    @ObfuscatedName("client.lz")
    public static int field688 = 0;

    @ObfuscatedName("client.ly")
    public static int field689 = 0;

    @ObfuscatedName("client.lk")
    public static int[] field690 = new int[128];

    @ObfuscatedName("client.lw")
    public static int[] field691 = new int[128];

    @ObfuscatedName("client.lp")
    public static long field594 = -1L;

    @ObfuscatedName("client.ln")
    public static String field693 = null;

    @ObfuscatedName("client.ld")
    public static String field694 = null;

    @ObfuscatedName("client.mw")
    public static int field548 = -1;

    @ObfuscatedName("client.mt")
    public static int field695 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field697 = new int[1000];

    @ObfuscatedName("client.mx")
    public static int[] field698 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class86[] field515 = new class86[1000];

    @ObfuscatedName("client.mr")
    public static int field700 = 0;

    @ObfuscatedName("client.mb")
    public static int field666 = 0;

    @ObfuscatedName("client.mc")
    public static int field545 = 0;

    @ObfuscatedName("client.mj")
    public static int field703 = 255;

    @ObfuscatedName("client.mo")
    public static int field704 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field705 = false;

    @ObfuscatedName("client.mk")
    public static int field706 = 127;

    @ObfuscatedName("client.mq")
    public static int field707 = 127;

    @ObfuscatedName("client.nd")
    public static int field549 = 0;

    @ObfuscatedName("client.na")
    public static int[] field709 = new int[50];

    @ObfuscatedName("client.nr")
    public static int[] field580 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field711 = new int[50];

    @ObfuscatedName("client.no")
    public static int[] field712 = new int[50];

    @ObfuscatedName("client.nc")
    public static class57[] field713 = new class57[50];

    @ObfuscatedName("client.nk")
    public static boolean field644 = false;

    @ObfuscatedName("client.nq")
    public static boolean[] field476 = new boolean[5];

    @ObfuscatedName("client.nw")
    public static int[] field566 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field670 = new int[5];

    @ObfuscatedName("client.nb")
    public static int[] field717 = new int[5];

    @ObfuscatedName("client.nu")
    public static int[] field479 = new int[5];

    @ObfuscatedName("client.nh")
    public static int field720 = 0;

    @ObfuscatedName("client.ng")
    public static int field601 = 0;

    @ObfuscatedName("client.og")
    public static class23[] field618 = new class23[400];

    @ObfuscatedName("client.od")
    public static class173 field483 = new class173();

    @ObfuscatedName("client.oz")
    public static int field724 = 0;

    @ObfuscatedName("client.ok")
    public static class11[] field725 = new class11[400];

    @ObfuscatedName("client.oh")
    public static class164 field679 = new class164();

    @ObfuscatedName("client.on")
    public static int field721 = -1;

    @ObfuscatedName("client.ob")
    public static int field728 = -1;

    @ObfuscatedName("client.a(I)V")
    public final void method263() {
    }

    public final void init() {
        if (!this.method1406()) {
            return;
        }
        class167[] var1 = class167.method239();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2775);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2775)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                        }
                        break;
                    case 2:
                        field469 = Integer.parseInt(var4);
                        break;
                    case 3:
                        int var12 = Integer.parseInt(var4);
                        class133[] var13 = class133.method541();
                        int var14 = 0;
                        class133 var16;
                        while (true) {
                            if (var14 >= var13.length) {
                                var16 = null;
                                break;
                            }
                            class133 var15 = var13[var14];
                            if (var15.field2083 == var12) {
                                var16 = var15;
                                break;
                            }
                            var14++;
                        }
                        Statics.field1740 = var16;
                        break;
                    case 4:
                        field474 = Integer.parseInt(var4);
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                            field472 = true;
                        } else {
                            field472 = false;
                        }
                    case 6:
                    default:
                        break;
                    case 7:
                        class134[] var5 = new class134[] { class134.field2091, class134.field2088, class134.field2096, class134.field2090, class134.field2089, class134.field2094 };
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
                            if (var7 == var10.method2341()) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field470 = (class134) var11;
                        if (Statics.field470 == class134.field2091) {
                            Statics.field471 = class186.field2857;
                        } else {
                            Statics.field471 = class186.field2852;
                        }
                        break;
                    case 8:
                        Statics.field2584 = var4;
                        break;
                    case 9:
                        field692 = Integer.parseInt(var4);
                }
            }
        }
        Statics.method145();
        Statics.field1935 = this.getCodeBase().getHost();
        String var17 = Statics.field1740.field2084;
        byte var18 = 0;
        try {
            class82.method2376("oldschool", var17, var18, 16);
        } catch (Exception var20) {
            class80.method1557((String) null, var20);
        }
        Statics.field466 = this;
        this.method1412(765, 503, 33);
    }

    @ObfuscatedName("client.f(I)V")
    public final void method265() {
        Statics.field1244 = field469 == 0 ? 43594 : field692 + 40000;
        Statics.field1807 = field469 == 0 ? 443 : field692 + 50000;
        Statics.field1292 = Statics.field1244;
        Statics.field2748 = class162.field2733;
        Statics.field2747 = class162.field2734;
        Statics.field1511 = class162.field2735;
        Statics.field2750 = class162.field2736;
        class75.method785();
        Canvas var1 = Statics.field194;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class75.field1352);
        var1.addFocusListener(class75.field1352);
        Canvas var2 = Statics.field194;
        var2.addMouseListener(class77.field1373);
        var2.addMouseMotionListener(class77.field1373);
        var2.addFocusListener(class77.field1373);
        class78 var3;
        try {
            var3 = new class78();
        } catch (Throwable var5) {
            var3 = null;
        }
        Statics.field1498 = var3;
        if (Statics.field1498 != null) {
            Statics.field1498.method1332(Statics.field194);
        }
        Statics.field75 = new class71(255, class82.field1417, class82.field1413, 500000);
        Statics.field60 = class12.method1597();
        if (field469 != 0) {
            field501 = true;
        }
    }

    @ObfuscatedName("client.q(I)V")
    public final void method266() {
        field477++;
        this.method400();
        Statics.method1349();
        class139.method1567();
        method2021();
        class75.method789();
        class77 var1 = class77.field1373;
        synchronized (class77.field1373) {
            class77.field1378 = class77.field1375;
            class77.field1379 = class77.field1387;
            class77.field1380 = class77.field1376;
            class77.field1385 = class77.field1377;
            class77.field1386 = class77.field1382;
            class77.field1381 = class77.field1383;
            class77.field1388 = class77.field1390;
            class77.field1377 = 0;
        }
        if (Statics.field1498 != null) {
            int var3 = Statics.field1498.method1334();
            field664 = var3;
        }
        if (field652 == 0) {
            method161();
            class73.method563();
        } else if (field652 == 5) {
            class21.method4(this);
            method161();
            class73.method563();
        } else if (field652 == 10) {
            class21.method4(this);
        } else if (field652 == 20) {
            class21.method4(this);
            method872();
        } else if (field652 == 25) {
            method2339();
        }
        if (field652 == 30) {
            method223();
        } else if (field652 == 40) {
            method872();
        }
    }

    @ObfuscatedName("client.l(B)V")
    public final void method267() {
        boolean var1 = class139.method797();
        if (var1 && field705 && Statics.field210 != null) {
            Statics.field210.method1144();
        }
        if (field1320) {
            Canvas var2 = Statics.field194;
            var2.removeKeyListener(class75.field1352);
            var2.removeFocusListener(class75.field1352);
            class75.field1353 = -1;
            class77.method233(Statics.field194);
            if (Statics.field1498 != null) {
                Statics.field1498.method1337(Statics.field194);
            }
            this.method1419();
            Canvas var3 = Statics.field194;
            var3.setFocusTraversalKeysEnabled(false);
            var3.addKeyListener(class75.field1352);
            var3.addFocusListener(class75.field1352);
            Canvas var4 = Statics.field194;
            var4.addMouseListener(class77.field1373);
            var4.addMouseMotionListener(class77.field1373);
            var4.addFocusListener(class77.field1373);
            if (Statics.field1498 != null) {
                Statics.field1498.method1332(Statics.field194);
            }
        }
        if (field652 == 0) {
            class73.method2327(class21.field303, class21.field317, (Color) null);
        } else if (field652 == 5) {
            class21.method53(Statics.field1840, Statics.field958);
        } else if (field652 == 10) {
            class21.method53(Statics.field1840, Statics.field958);
        } else if (field652 == 20) {
            class21.method53(Statics.field1840, Statics.field958);
        } else if (field652 == 25) {
            if (field526 == 1) {
                if (field522 > field715) {
                    field715 = field522;
                }
                int var5 = (field715 * 50 - field522 * 50) / field715;
                method689(class135.field2104 + class2.field26 + class2.field21 + var5 + "%" + class2.field24, false);
            } else if (field526 == 2) {
                if (field674 > field727) {
                    field727 = field674;
                }
                int var6 = (field727 * 50 - field674 * 50) / field727 + 50;
                method689(class135.field2104 + class2.field26 + class2.field21 + var6 + "%" + class2.field24, false);
            } else {
                method689(class135.field2104, false);
            }
        } else if (field652 == 30) {
            if (!field610) {
                field616[0] = class135.field2311;
                field510[0] = "";
                field509[0] = 1006;
                field524 = 1;
            }
            if (field628 != -1) {
                method2986(field628);
            }
            for (int var7 = 0; var7 < field468; var7++) {
                if (field671[var7]) {
                    field558[var7] = true;
                }
                field673[var7] = field671[var7];
                field671[var7] = false;
            }
            field478 = field477;
            field619 = -1;
            field592 = -1;
            Statics.field1303 = null;
            if (field628 != -1) {
                field468 = 0;
                int var8 = field628;
                if (class159.method804(var8)) {
                    Statics.field2456 = null;
                    Statics.method1403(Statics.field2704[var8], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field2456 != null) {
                        Statics.method1403(Statics.field2456, -1412584499, 0, 0, 765, 503, Statics.field2520, Statics.field2019, -1);
                        Statics.field2456 = null;
                    }
                } else {
                    for (int var9 = 0; var9 < 100; var9++) {
                        field671[var9] = true;
                    }
                }
            }
            class89.method1781();
            method720();
            if (field610) {
                int var10 = Statics.field1306;
                int var11 = Statics.field2579;
                int var12 = Statics.field1259;
                int var13 = Statics.field1100;
                int var14 = 6116423;
                class89.method1807(var10, var11, var12, var13, var14);
                class89.method1807(var10 + 1, var11 + 1, var12 - 2, 16, 0);
                class89.method1784(var10 + 1, var11 + 18, var12 - 2, var13 - 19, 0);
                Statics.field1840.method3373(class135.field2302, var10 + 3, var11 + 14, var14, -1);
                int var15 = class77.field1379;
                int var16 = class77.field1380;
                for (int var17 = 0; var17 < field524; var17++) {
                    int var18 = (field524 - 1 - var17) * 15 + var11 + 31;
                    int var19 = 16777215;
                    if (var15 > var10 && var15 < var10 + var12 && var16 > var18 - 13 && var16 < var18 + 3) {
                        var19 = 16776960;
                    }
                    Statics.field1840.method3373(method542(var17), var10 + 3, var18, var19, 0);
                }
                int var20 = Statics.field1306;
                int var21 = Statics.field2579;
                int var22 = Statics.field1259;
                int var23 = Statics.field1100;
                for (int var24 = 0; var24 < field468; var24++) {
                    if (field676[var24] + field611[var24] > var20 && field611[var24] < var20 + var22 && field677[var24] + field606[var24] > var21 && field606[var24] < var21 + var23) {
                        field558[var24] = true;
                    }
                }
            } else if (field619 != -1) {
                method32(field619, field592);
            }
            if (field678 == 3) {
                for (int var25 = 0; var25 < field468; var25++) {
                    if (field673[var25]) {
                        class89.method1797(field611[var25], field606[var25], field676[var25], field677[var25], 16711935, 128);
                    } else if (field558[var25]) {
                        class89.method1797(field611[var25], field606[var25], field676[var25], field677[var25], 16711680, 128);
                    }
                }
            }
            int var26 = Statics.field263;
            int var27 = Statics.field52.field443;
            int var28 = Statics.field52.field408;
            int var29 = field621;
            for (class7 var30 = (class7) class7.field107.method3314(); var30 != null; var30 = (class7) class7.field107.method3325()) {
                if (var30.field99 != -1 || var30.field103 != null) {
                    int var31 = 0;
                    if (var27 > var30.field108) {
                        var31 += var27 - var30.field108;
                    } else if (var27 < var30.field94) {
                        var31 += var30.field94 - var27;
                    }
                    if (var28 > var30.field100) {
                        var31 += var28 - var30.field100;
                    } else if (var28 < var30.field98) {
                        var31 += var30.field98 - var28;
                    }
                    if (var31 - 64 > var30.field102 || field707 == 0 || var30.field93 != var26) {
                        if (var30.field110 != null) {
                            Statics.field1284.method1080(var30.field110);
                            var30.field110 = null;
                        }
                        if (var30.field105 != null) {
                            Statics.field1284.method1080(var30.field105);
                            var30.field105 = null;
                        }
                    } else {
                        var31 -= 64;
                        if (var31 < 0) {
                            var31 = 0;
                        }
                        int var32 = field707 * (var30.field102 - var31) / var30.field102;
                        class57 var10000;
                        if (var30.field110 != null) {
                            var30.field110.method1005(var32);
                        } else if (var30.field99 >= 0) {
                            var10000 = (class57) null;
                            class57 var33 = class57.method1241(Statics.field1272, var30.field99, 0);
                            if (var33 != null) {
                                class63 var34 = var33.method1240().method1304(Statics.field2048);
                                class45 var35 = class45.method1044(var34, 100, var32);
                                var35.method1001(-1);
                                Statics.field1284.method1084(var35);
                                var30.field110 = var35;
                            }
                        }
                        if (var30.field105 != null) {
                            var30.field105.method1005(var32);
                            if (!var30.field105.method3338()) {
                                var30.field105 = null;
                            }
                        } else if (var30.field103 != null && (var30.field104 -= var29) <= 0) {
                            int var36 = (int) (Math.random() * (double) var30.field103.length);
                            var10000 = (class57) null;
                            class57 var37 = class57.method1241(Statics.field1272, var30.field103[var36], 0);
                            if (var37 != null) {
                                class63 var38 = var37.method1240().method1304(Statics.field2048);
                                class45 var39 = class45.method1044(var38, 100, var32);
                                var39.method1001(0);
                                Statics.field1284.method1084(var39);
                                var30.field105 = var39;
                                var30.field104 = var30.field101 + (int) (Math.random() * (double) (var30.field96 - var30.field101));
                            }
                        }
                    }
                }
            }
            field621 = 0;
        } else if (field652 == 40) {
            method689(class135.field2163 + class2.field26 + class135.field2106, false);
        }
        if (field652 == 30 && field678 == 0 && !field1318) {
            try {
                Graphics var40 = Statics.field194.getGraphics();
                for (int var41 = 0; var41 < field468; var41++) {
                    if (field558[var41]) {
                        Statics.field181.method1601(var40, field611[var41], field606[var41], field676[var41], field677[var41]);
                        field558[var41] = false;
                    }
                }
            } catch (Exception var47) {
                Statics.field194.repaint();
            }
        } else if (field652 > 0) {
            try {
                Graphics var43 = Statics.field194.getGraphics();
                Statics.field181.method1616(var43, 0, 0);
                field1318 = false;
                for (int var44 = 0; var44 < field468; var44++) {
                    field558[var44] = false;
                }
            } catch (Exception var46) {
                Statics.field194.repaint();
            }
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method434() {
        if (Statics.field190 != null) {
            Statics.field190.field258 = false;
        }
        Statics.field190 = null;
        if (Statics.field508 != null) {
            Statics.field508.method1381();
            Statics.field508 = null;
        }
        class75.method206();
        if (class77.field1373 != null) {
            class77 var1 = class77.field1373;
            synchronized (class77.field1373) {
                class77.field1373 = null;
            }
        }
        Statics.field1498 = null;
        if (Statics.field210 != null) {
            Statics.field210.method1135();
        }
        if (Statics.field1421 != null) {
            Statics.field1421.method1135();
        }
        if (Statics.field2559 != null) {
            Statics.field2559.method1381();
        }
        class158.method2697();
        class82.method113();
    }

    @ObfuscatedName("fo.z(II)V")
    public static void method3172(int arg0) {
        if (field652 == arg0) {
            return;
        }
        if (field652 == 0) {
            Statics.field2020 = null;
            Statics.field1995 = null;
            Statics.field1317 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field465 = 0;
            field502 = 0;
            field503 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1508 != null) {
            Statics.field1508.method1381();
            Statics.field1508 = null;
        }
        if (field652 == 25) {
            field526 = 0;
            field522 = 0;
            field715 = 1;
            field674 = 0;
            field727 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Statics.method122(Statics.field194, Statics.field1366, Statics.field1734);
        } else {
            class21.method1665();
        }
        field652 = arg0;
    }

    @ObfuscatedName("client.n(I)V")
    public void method400() {
        if (field652 == 1000) {
            return;
        }
        long var1 = class121.method2221();
        int var3 = (int) (var1 - Statics.field2540);
        Statics.field2540 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class154.field2539 += var3;
        boolean var4;
        if (class154.field2549 == 0 && class154.field2557 == 0 && class154.field2547 == 0 && class154.field2542 == 0) {
            var4 = true;
        } else if (Statics.field2559 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class154.field2539 > 30000) {
                        throw new IOException();
                    }
                    while (class154.field2557 < 20 && class154.field2542 > 0) {
                        class156 var5 = (class156) class154.field2554.method3294();
                        class126 var6 = new class126(4);
                        var6.method2422(1);
                        var6.method2451((int) var5.field2810);
                        Statics.field2559.method1362(var6.field2026, 0, 4);
                        class154.field2543.method3292(var5, var5.field2810);
                        class154.field2542--;
                        class154.field2557++;
                    }
                    while (class154.field2549 < 20 && class154.field2547 > 0) {
                        class156 var7 = (class156) class154.field2558.method3264();
                        class126 var8 = new class126(4);
                        var8.method2422(0);
                        var8.method2451((int) var7.field2810);
                        Statics.field2559.method1362(var8.field2026, 0, 4);
                        var7.method3287();
                        class154.field2560.method3292(var7, var7.field2810);
                        class154.field2547--;
                        class154.field2549++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2559.method1357();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class154.field2539 = 0;
                        byte var11 = 0;
                        if (Statics.field1612 == null) {
                            var11 = 8;
                        } else if (class154.field2552 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class154.field2550.field2027;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2559.method1360(class154.field2550.field2026, class154.field2550.field2027, var12);
                            if (class154.field2555 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class154.field2550.field2026[class154.field2550.field2027 + var13] ^= class154.field2555;
                                }
                            }
                            class154.field2550.field2027 += var12;
                            if (class154.field2550.field2027 < var11) {
                                break;
                            }
                            if (Statics.field1612 == null) {
                                class154.field2550.field2027 = 0;
                                int var14 = class154.field2550.method2436();
                                int var15 = class154.field2550.method2572();
                                int var16 = class154.field2550.method2436();
                                int var17 = class154.field2550.method2439();
                                long var18 = (long) ((var14 << 16) + var15);
                                class156 var20 = (class156) class154.field2543.method3291(var18);
                                Statics.field2741 = true;
                                if (var20 == null) {
                                    var20 = (class156) class154.field2560.method3291(var18);
                                    Statics.field2741 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1612 = var20;
                                Statics.field2551 = new class126(var17 + var21 + Statics.field1612.field2577);
                                Statics.field2551.method2422(var16);
                                Statics.field2551.method2425(var17);
                                class154.field2552 = 8;
                                class154.field2550.field2027 = 0;
                            } else if (class154.field2552 == 0) {
                                if (class154.field2550.field2026[0] == -1) {
                                    class154.field2552 = 1;
                                    class154.field2550.field2027 = 0;
                                } else {
                                    Statics.field1612 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2551.field2026.length - Statics.field1612.field2577;
                            int var23 = 512 - class154.field2552;
                            if (var23 > var22 - Statics.field2551.field2027) {
                                var23 = var22 - Statics.field2551.field2027;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2559.method1360(Statics.field2551.field2026, Statics.field2551.field2027, var23);
                            if (class154.field2555 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2551.field2026[Statics.field2551.field2027 + var24] ^= class154.field2555;
                                }
                            }
                            Statics.field2551.field2027 += var23;
                            class154.field2552 += var23;
                            if (Statics.field2551.field2027 == var22) {
                                if (Statics.field1612.field2810 == 16711935L) {
                                    Statics.field917 = Statics.field2551;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class155 var26 = class154.field2538[var25];
                                        if (var26 != null) {
                                            Statics.field917.field2027 = var25 * 8 + 5;
                                            int var27 = Statics.field917.method2439();
                                            int var28 = Statics.field917.method2439();
                                            var26.method3080(var27, var28);
                                        }
                                    }
                                } else {
                                    class154.field2553.reset();
                                    class154.field2553.update(Statics.field2551.field2026, 0, var22);
                                    int var29 = (int) class154.field2553.getValue();
                                    if (Statics.field1612.field2575 != var29) {
                                        try {
                                            Statics.field2559.method1381();
                                        } catch (Exception var35) {
                                        }
                                        class154.field2544++;
                                        Statics.field2559 = null;
                                        class154.field2555 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class154.field2544 = 0;
                                    class154.field2556 = 0;
                                    Statics.field1612.field2576.method3094((int) (Statics.field1612.field2810 & 0xFFFFL), Statics.field2551.field2026, (Statics.field1612.field2810 & 0xFF0000L) == 16711680L, Statics.field2741);
                                }
                                Statics.field1612.method3341();
                                if (Statics.field2741) {
                                    class154.field2557--;
                                } else {
                                    class154.field2549--;
                                }
                                class154.field2552 = 0;
                                Statics.field1612 = null;
                                Statics.field2551 = null;
                            } else {
                                if (class154.field2552 != 512) {
                                    break;
                                }
                                class154.field2552 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2559.method1381();
                } catch (Exception var34) {
                }
                class154.field2556++;
                Statics.field2559 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method270();
        }
    }

    @ObfuscatedName("client.t(I)V")
    public void method270() {
        if (class154.field2544 >= 4) {
            this.method1414("js5crc");
            field652 = 1000;
            return;
        }
        if (class154.field2556 >= 4) {
            if (field652 <= 5) {
                this.method1414("js5io");
                field652 = 1000;
                return;
            }
            field496 = 3000;
            class154.field2556 = 3;
        }
        if (--field496 + 1 > 0) {
            return;
        }
        try {
            if (field495 == 0) {
                Statics.field377 = Statics.field12.method1467(Statics.field1935, Statics.field1292);
                field495++;
            }
            if (field495 == 1) {
                if (Statics.field377.field1393 == 2) {
                    this.method360(-1);
                    return;
                }
                if (Statics.field377.field1393 == 1) {
                    field495++;
                }
            }
            if (field495 == 2) {
                Statics.field759 = new class70((Socket) Statics.field377.field1397, Statics.field12);
                class126 var1 = new class126(5);
                var1.method2422(15);
                var1.method2425(33);
                Statics.field759.method1362(var1.field2026, 0, 5);
                field495++;
                Statics.field1989 = class121.method2221();
            }
            if (field495 == 3) {
                if (field652 <= 5 || Statics.field759.method1357() > 0) {
                    int var2 = Statics.field759.method1359();
                    if (var2 != 0) {
                        this.method360(var2);
                        return;
                    }
                    field495++;
                } else if (class121.method2221() - Statics.field1989 > 30000L) {
                    this.method360(-2);
                    return;
                }
            }
            if (field495 == 4) {
                class154.method128(Statics.field759, field652 > 20);
                Statics.field377 = null;
                Statics.field759 = null;
                field495 = 0;
                field500 = 0;
            }
        } catch (IOException var4) {
            this.method360(-3);
        }
    }

    @ObfuscatedName("client.w(IB)V")
    public void method360(int arg0) {
        Statics.field377 = null;
        Statics.field759 = null;
        field495 = 0;
        if (Statics.field1292 == Statics.field1244) {
            Statics.field1292 = Statics.field1807;
        } else {
            Statics.field1292 = Statics.field1244;
        }
        field500++;
        if (field500 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field652 <= 5) {
                this.method1414("js5connect_full");
                field652 = 1000;
            } else {
                field496 = 3000;
            }
        } else if (field500 >= 2 && arg0 == 6) {
            this.method1414("js5connect_outofdate");
            field652 = 1000;
        } else if (field500 >= 4) {
            if (field652 <= 5) {
                this.method1414("js5connect");
                field652 = 1000;
            } else {
                field496 = 3000;
            }
        }
    }

    @ObfuscatedName("k.r(B)V")
    public static void method161() {
        if (field494 == 0) {
            Statics.field1423 = new class95(4, 104, 104, class9.field130);
            for (int var0 = 0; var0 < 4; var0++) {
                field528[var0] = new class130(104, 104);
            }
            Statics.field146 = new class86(512, 512);
            class21.field317 = class135.field2107;
            class21.field303 = 5;
            field494 = 20;
        } else if (field494 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1769[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1967(var1, 500, 800, 512, 334);
            class21.field317 = class135.field2151;
            class21.field303 = 10;
            field494 = 30;
        } else if (field494 == 30) {
            Statics.field743 = method2300(0, false, true, true);
            Statics.field568 = method2300(1, false, true, true);
            Statics.field2541 = method2300(2, true, false, true);
            Statics.field953 = method2300(3, false, true, true);
            Statics.field1272 = method2300(4, false, true, true);
            Statics.field609 = method2300(5, true, true, true);
            Statics.field1164 = method2300(6, true, true, false);
            Statics.field562 = method2300(7, false, true, true);
            Statics.field1734 = method2300(8, false, true, true);
            Statics.field291 = method2300(9, false, true, true);
            Statics.field1366 = method2300(10, false, true, true);
            Statics.field962 = method2300(11, false, true, true);
            Statics.field225 = method2300(12, false, true, true);
            Statics.field1920 = method2300(13, true, false, true);
            Statics.field1428 = method2300(14, false, true, false);
            Statics.field54 = method2300(15, false, true, true);
            class21.field317 = class135.field2109;
            class21.field303 = 20;
            field494 = 40;
        } else if (field494 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field743.method3078() * 4 / 100;
            int var8 = var7 + Statics.field568.method3078() * 4 / 100;
            int var9 = var8 + Statics.field2541.method3078() * 2 / 100;
            int var10 = var9 + Statics.field953.method3078() * 2 / 100;
            int var11 = var10 + Statics.field1272.method3078() * 6 / 100;
            int var12 = var11 + Statics.field609.method3078() * 4 / 100;
            int var13 = var12 + Statics.field1164.method3078() * 2 / 100;
            int var14 = var13 + Statics.field562.method3078() * 60 / 100;
            int var15 = var14 + Statics.field1734.method3078() * 2 / 100;
            int var16 = var15 + Statics.field291.method3078() * 2 / 100;
            int var17 = var16 + Statics.field1366.method3078() * 2 / 100;
            int var18 = var17 + Statics.field962.method3078() * 2 / 100;
            int var19 = var18 + Statics.field225.method3078() * 2 / 100;
            int var20 = var19 + Statics.field1920.method3078() * 2 / 100;
            int var21 = var20 + Statics.field1428.method3078() * 2 / 100;
            int var22 = var21 + Statics.field54.method3078() * 2 / 100;
            if (var22 == 100) {
                class21.field317 = class135.field2111;
                class21.field303 = 30;
                field494 = 45;
            } else {
                if (var22 != 0) {
                    class21.field317 = class135.field2110 + var22 + "%";
                }
                class21.field303 = 30;
            }
        } else if (field494 == 45) {
            class52.method2220(22050, !field473, 2);
            class142 var23 = new class142();
            var23.method2812(9, 128);
            Statics.field210 = class52.method800(Statics.field12, Statics.field194, 0, 22050);
            Statics.field210.method1132(var23);
            class155 var24 = Statics.field54;
            class155 var25 = Statics.field1428;
            class155 var26 = Statics.field1272;
            Statics.field2358 = var24;
            Statics.field2351 = var25;
            Statics.field2350 = var26;
            Statics.field2353 = var23;
            Statics.field1421 = class52.method800(Statics.field12, Statics.field194, 1, 2048);
            Statics.field1284 = new class46();
            Statics.field1421.method1132(Statics.field1284);
            Statics.field2048 = new class62(22050, Statics.field1093);
            class21.field317 = class135.field2112;
            class21.field303 = 35;
            field494 = 50;
        } else if (field494 == 50) {
            int var27 = 0;
            if (Statics.field958 == null) {
                class155 var28 = Statics.field1734;
                class155 var29 = Statics.field1920;
                int var30 = var28.method3011("p11_full");
                int var31 = var28.method3012(var30, "");
                class183 var32;
                if (class84.method1355(var28, var30, var31)) {
                    var32 = Statics.method627(var29.method3026(var30, var31));
                } else {
                    var32 = null;
                }
                Statics.field958 = var32;
            } else {
                var27++;
            }
            if (Statics.field335 == null) {
                class155 var34 = Statics.field1734;
                class155 var35 = Statics.field1920;
                int var36 = var34.method3011("p12_full");
                int var37 = var34.method3012(var36, "");
                class183 var38;
                if (class84.method1355(var34, var36, var37)) {
                    var38 = Statics.method627(var35.method3026(var36, var37));
                } else {
                    var38 = null;
                }
                Statics.field335 = var38;
            } else {
                var27++;
            }
            if (Statics.field1840 == null) {
                class155 var40 = Statics.field1734;
                class155 var41 = Statics.field1920;
                int var42 = var40.method3011("b12_full");
                int var43 = var40.method3012(var42, "");
                class183 var44;
                if (class84.method1355(var40, var42, var43)) {
                    var44 = Statics.method627(var41.method3026(var42, var43));
                } else {
                    var44 = null;
                }
                Statics.field1840 = var44;
            } else {
                var27++;
            }
            if (var27 < 3) {
                class21.field317 = class135.field2113 + var27 * 100 / 3 + "%";
                class21.field303 = 40;
            } else {
                Statics.field1801 = new class152(true);
                class21.field317 = class135.field2114;
                class21.field303 = 40;
                field494 = 60;
            }
        } else if (field494 == 60) {
            int var46 = class21.method2962(Statics.field1366, Statics.field1734);
            int var47 = class21.method1391();
            if (var46 < var47) {
                class21.field317 = class135.field2115 + var46 * 100 / var47 + "%";
                class21.field303 = 50;
            } else {
                class21.field317 = class135.field2116;
                class21.field303 = 50;
                method3172(5);
                field494 = 70;
            }
        } else if (field494 == 70) {
            if (Statics.field2541.method3000()) {
                class37.method112(Statics.field2541);
                class155 var48 = Statics.field2541;
                Statics.field853 = var48;
                class155 var49 = Statics.field2541;
                class155 var50 = Statics.field562;
                Statics.field906 = var49;
                Statics.field904 = var50;
                Statics.field905 = Statics.field906.method3006(3);
                class32.method209(Statics.field2541, Statics.field562, field473);
                class155 var51 = Statics.field2541;
                class155 var52 = Statics.field562;
                Statics.field797 = var51;
                Statics.field764 = var52;
                class155 var53 = Statics.field2541;
                class155 var54 = Statics.field562;
                boolean var55 = field472;
                class183 var56 = Statics.field958;
                Statics.field982 = var53;
                Statics.field966 = var54;
                Statics.field2772 = var55;
                Statics.field982.method3006(10);
                Statics.field970 = var56;
                class34.method2030(Statics.field2541, Statics.field743, Statics.field568);
                class155 var57 = Statics.field2541;
                class155 var58 = Statics.field562;
                Statics.field898 = var57;
                Statics.field387 = var58;
                class155 var59 = Statics.field2541;
                Statics.field937 = var59;
                class42.method2624(Statics.field2541);
                class159.method2292(Statics.field953, Statics.field562, Statics.field1734, Statics.field1920);
                class41.method51(Statics.field2541);
                class155 var60 = Statics.field2541;
                Statics.field960 = var60;
                class21.field317 = class135.field2118;
                class21.field303 = 60;
                field494 = 80;
            } else {
                class21.field317 = class135.field2117 + Statics.field2541.method3086() + "%";
                class21.field303 = 60;
            }
        } else if (field494 == 80) {
            int var61 = 0;
            if (Statics.field538 == null) {
                Statics.field538 = class84.method543(Statics.field1734, "compass", "");
            } else {
                var61++;
            }
            if (Statics.field1172 == null) {
                Statics.field1172 = class84.method543(Statics.field1734, "mapedge", "");
            } else {
                var61++;
            }
            if (Statics.field1222 == null) {
                Statics.field1222 = class84.method2354(Statics.field1734, "mapscene", "");
            } else {
                var61++;
            }
            if (Statics.field2086 == null) {
                Statics.field2086 = class84.method1648(Statics.field1734, "mapfunction", "");
            } else {
                var61++;
            }
            if (Statics.field2587 == null) {
                Statics.field2587 = class84.method1648(Statics.field1734, "hitmarks", "");
            } else {
                var61++;
            }
            if (Statics.field1909 == null) {
                Statics.field1909 = class84.method1648(Statics.field1734, "headicons_pk", "");
            } else {
                var61++;
            }
            if (Statics.field1389 == null) {
                Statics.field1389 = class84.method1648(Statics.field1734, "headicons_prayer", "");
            } else {
                var61++;
            }
            if (Statics.field289 == null) {
                Statics.field289 = class84.method1648(Statics.field1734, "headicons_hint", "");
            } else {
                var61++;
            }
            if (Statics.field186 == null) {
                Statics.field186 = class84.method1648(Statics.field1734, "mapmarker", "");
            } else {
                var61++;
            }
            if (Statics.field1808 == null) {
                Statics.field1808 = class84.method1648(Statics.field1734, "cross", "");
            } else {
                var61++;
            }
            if (Statics.field798 == null) {
                Statics.field798 = class84.method1648(Statics.field1734, "mapdots", "");
            } else {
                var61++;
            }
            if (Statics.field386 == null) {
                Statics.field386 = class84.method2354(Statics.field1734, "scrollbar", "");
            } else {
                var61++;
            }
            if (Statics.field273 == null) {
                Statics.field273 = class84.method2354(Statics.field1734, "mod_icons", "");
            } else {
                var61++;
            }
            if (Statics.field121 == null) {
                Statics.field121 = class84.method2377(Statics.field1734, "mapback", "");
            } else {
                var61++;
            }
            if (var61 < 14) {
                class21.field317 = class135.field2165 + var61 * 100 / 14 + "%";
                class21.field303 = 70;
            } else {
                Statics.field2834 = Statics.field273;
                Statics.field1172.method1735();
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 21.0D) - 10;
                int var64 = (int) (Math.random() * 21.0D) - 10;
                int var65 = (int) (Math.random() * 41.0D) - 20;
                for (int var66 = 0; var66 < Statics.field2086.length; var66++) {
                    Statics.field2086[var66].method1669(var62 + var65, var63 + var65, var64 + var65);
                }
                Statics.field1222[0].method1760(var62 + var65, var63 + var65, var64 + var65);
                Statics.field1973 = new int[33];
                Statics.field2061 = new int[33];
                Statics.field2334 = new int[151];
                Statics.field850 = new int[151];
                for (int var67 = 0; var67 < 33; var67++) {
                    int var68 = 999;
                    int var69 = 0;
                    for (int var70 = 0; var70 < 34; var70++) {
                        if (Statics.field121.field1468[Statics.field121.field1462 * var67 + var70] == 0) {
                            if (var68 == 999) {
                                var68 = var70;
                            }
                        } else if (var68 != 999) {
                            var69 = var70;
                            break;
                        }
                    }
                    Statics.field1973[var67] = var68;
                    Statics.field2061[var67] = var69 - var68;
                }
                for (int var71 = 5; var71 < 156; var71++) {
                    int var72 = 999;
                    int var73 = 0;
                    for (int var74 = 25; var74 < 172; var74++) {
                        if (Statics.field121.field1468[Statics.field121.field1462 * var71 + var74] == 0 && var74 > 34 || var71 > 34) {
                            if (var72 == 999) {
                                var72 = var74;
                            }
                        } else if (var72 != 999) {
                            var73 = var74;
                            break;
                        }
                    }
                    Statics.field2334[var71 - 5] = var72 - 25;
                    Statics.field850[var71 - 5] = var73 - var72;
                }
                class21.field317 = class135.field2120;
                class21.field303 = 70;
                field494 = 90;
            }
        } else if (field494 == 90) {
            if (Statics.field291.method3000()) {
                class110 var75 = new class110(Statics.field291, Statics.field1734, 20, 0.8D, field473 ? 64 : 128);
                class104.method2125(var75);
                class104.method2156(0.8D);
                class21.field317 = class135.field2152;
                class21.field303 = 90;
                field494 = 110;
            } else {
                class21.field317 = class135.field2121 + Statics.field291.method3086() + "%";
                class21.field303 = 90;
            }
        } else if (field494 == 110) {
            Statics.field190 = new class16();
            Statics.field12.method1480(Statics.field190, 10);
            class21.field317 = class135.field2123;
            class21.field303 = 94;
            field494 = 120;
        } else if (field494 == 120) {
            if (Statics.field1366.method3014("huffman", "")) {
                class120 var76 = new class120(Statics.field1366.method3013("huffman", ""));
                class184.method216(var76);
                class21.field317 = class135.field2264;
                class21.field303 = 96;
                field494 = 130;
            } else {
                class21.field317 = class135.field2327 + "%";
                class21.field303 = 96;
            }
        } else if (field494 == 130) {
            if (!Statics.field953.method3000()) {
                class21.field317 = class135.field2126 + Statics.field953.method3086() * 4 / 5 + "%";
                class21.field303 = 100;
            } else if (!Statics.field225.method3000()) {
                class21.field317 = class135.field2126 + (80 + Statics.field225.method3086() / 6) + "%";
                class21.field303 = 100;
            } else if (Statics.field1920.method3000()) {
                class21.field317 = class135.field2127;
                class21.field303 = 100;
                field494 = 140;
            } else {
                class21.field317 = class135.field2126 + (96 + Statics.field1920.method3086() / 20) + "%";
                class21.field303 = 100;
            }
        } else if (field494 == 140) {
            method3172(10);
        }
    }

    @ObfuscatedName("dy.x(IZZZI)Lew;")
    public static class155 method2300(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1417 != null) {
            var4 = new class71(arg0, class82.field1417, Statics.field14[arg0], 1000000);
        }
        return new class155(var4, Statics.field75, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("af.v(I)V")
    public static final void method872() {
        try {
            if (field465 == 0) {
                if (Statics.field508 != null) {
                    Statics.field508.method1381();
                    Statics.field508 = null;
                }
                Statics.field2858 = null;
                field520 = false;
                field502 = 0;
                field465 = 1;
            }
            if (field465 == 1) {
                if (Statics.field2858 == null) {
                    Statics.field2858 = Statics.field12.method1467(Statics.field1935, Statics.field1292);
                }
                if (Statics.field2858.field1393 == 2) {
                    throw new IOException();
                }
                if (Statics.field2858.field1393 == 1) {
                    Statics.field508 = new class70((Socket) Statics.field2858.field1397, Statics.field12);
                    Statics.field2858 = null;
                    field465 = 2;
                }
            }
            if (field465 == 2) {
                field602.field2027 = 0;
                field602.method2422(14);
                Statics.field508.method1362(field602.field2026, 0, 1);
                field498.field2027 = 0;
                field465 = 3;
            }
            if (field465 == 3) {
                if (Statics.field210 != null) {
                    Statics.field210.method1134();
                }
                if (Statics.field1421 != null) {
                    Statics.field1421.method1134();
                }
                int var0 = Statics.field508.method1359();
                if (Statics.field210 != null) {
                    Statics.field210.method1134();
                }
                if (Statics.field1421 != null) {
                    Statics.field1421.method1134();
                }
                if (var0 != 0) {
                    method126(var0);
                    return;
                }
                field498.field2027 = 0;
                field465 = 5;
            }
            if (field465 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field602.field2027 = 0;
                field602.method2422(10);
                field602.method2425(var1[0]);
                field602.method2425(var1[1]);
                field602.method2425(var1[2]);
                field602.method2425(var1[3]);
                field602.method2426(0L);
                field602.method2588(class21.field304);
                field602.method2454(class6.field91, class6.field82);
                field617.field2027 = 0;
                if (field652 == 40) {
                    field617.method2422(18);
                } else {
                    field617.method2422(16);
                }
                field617.method2423(0);
                int var2 = field617.field2027;
                field617.method2425(33);
                field617.method2430(field602.field2026, 0, field602.field2027);
                int var3 = field617.field2027;
                field617.method2588(class21.field321);
                field617.method2422(field473 ? 1 : 0);
                class82.method142(field617);
                class126 var4 = new class126(Statics.field1801.method2983());
                Statics.field1801.method2982(var4);
                field617.method2430(var4.field2026, 0, var4.field2026.length);
                field617.method2425(Statics.field743.field2531);
                field617.method2425(Statics.field568.field2531);
                field617.method2425(Statics.field2541.field2531);
                field617.method2425(Statics.field953.field2531);
                field617.method2425(Statics.field1272.field2531);
                field617.method2425(Statics.field609.field2531);
                field617.method2425(Statics.field1164.field2531);
                field617.method2425(Statics.field562.field2531);
                field617.method2425(Statics.field1734.field2531);
                field617.method2425(Statics.field291.field2531);
                field617.method2425(Statics.field1366.field2531);
                field617.method2425(Statics.field962.field2531);
                field617.method2425(Statics.field225.field2531);
                field617.method2425(Statics.field1920.field2531);
                field617.method2425(Statics.field1428.field2531);
                field617.method2425(Statics.field54.field2531);
                field617.method2452(var1, var3, field617.field2027);
                field617.method2432(field617.field2027 - var2);
                Statics.field508.method1362(field617.field2026, 0, field617.field2027);
                field602.method2305(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field498.method2305(var1);
                field465 = 6;
            }
            if (field465 == 6 && Statics.field508.method1357() > 0) {
                int var6 = Statics.field508.method1359();
                if (var6 == 21 && field652 == 20) {
                    field465 = 7;
                } else if (var6 == 2) {
                    field465 = 9;
                } else if (var6 == 15 && field652 == 40) {
                    field602.field2027 = 0;
                    field498.field2027 = 0;
                    field513 = -1;
                    field517 = -1;
                    field597 = -1;
                    field519 = -1;
                    field512 = 0;
                    field514 = 0;
                    field484 = 0;
                    field524 = 0;
                    field610 = false;
                    field545 = 0;
                    field700 = 0;
                    for (int var7 = 0; var7 < field511.length; var7++) {
                        if (field511[var7] != null) {
                            field511[var7].field431 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field505.length; var8++) {
                        if (field505[var8] != null) {
                            field505[var8].field431 = -1;
                        }
                    }
                    class19.method1356();
                    method3172(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field671[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field503 < 1) {
                    field503++;
                    field465 = 0;
                } else {
                    method126(var6);
                    return;
                }
            }
            if (field465 == 7 && Statics.field508.method1357() > 0) {
                field504 = (Statics.field508.method1359() + 3) * 60;
                field465 = 8;
            }
            if (field465 == 8) {
                field502 = 0;
                class21.method2297(class135.field2128, class135.field2129, field504 / 60 + class135.field2161);
                if (--field504 <= 0) {
                    field465 = 0;
                }
            } else {
                if (field465 == 9 && Statics.field508.method1357() >= 8) {
                    field635 = Statics.field508.method1359();
                    field553 = Statics.field508.method1359() == 1;
                    field723 = Statics.field508.method1359();
                    field723 <<= 0x8;
                    field723 += Statics.field508.method1359();
                    field595 = Statics.field508.method1359();
                    Statics.field508.method1360(field498.field2026, 0, 1);
                    field498.field2027 = 0;
                    field513 = field498.method2307();
                    Statics.field508.method1360(field498.field2026, 0, 2);
                    field498.field2027 = 0;
                    field512 = field498.method2572();
                    if (field595 == 1) {
                        try {
                            client var10 = Statics.field466;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var28) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field466;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var27) {
                        }
                    }
                    field465 = 10;
                }
                if (field465 != 10) {
                    field502++;
                    if (field502 > 2000) {
                        if (field503 < 1) {
                            if (Statics.field1292 == Statics.field1244) {
                                Statics.field1292 = Statics.field1807;
                            } else {
                                Statics.field1292 = Statics.field1244;
                            }
                            field503++;
                            field465 = 0;
                        } else {
                            method126(-3);
                        }
                    }
                } else if (Statics.field508.method1357() >= field512) {
                    field498.field2027 = 0;
                    Statics.field508.method1360(field498.field2026, 0, field512);
                    field653 = 1L;
                    field481 = -1;
                    Statics.field190.field256 = 0;
                    Statics.field2730 = true;
                    field539 = true;
                    field594 = -1L;
                    class182.field2823 = new class177();
                    field602.field2027 = 0;
                    field498.field2027 = 0;
                    field513 = -1;
                    field517 = -1;
                    field597 = -1;
                    field519 = -1;
                    field514 = 0;
                    field484 = 0;
                    field593 = 0;
                    field485 = 0;
                    field524 = 0;
                    field610 = false;
                    class77.method2199(0);
                    for (int var14 = 0; var14 < 100; var14++) {
                        field682[var14] = null;
                    }
                    field683 = 0;
                    field622 = 0;
                    field575 = false;
                    field549 = 0;
                    field532 = (int) (Math.random() * 100.0D) - 50;
                    field534 = (int) (Math.random() * 110.0D) - 55;
                    field536 = (int) (Math.random() * 80.0D) - 40;
                    field675 = (int) (Math.random() * 120.0D) - 60;
                    field730 = (int) (Math.random() * 30.0D) - 20;
                    field702 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field545 = 0;
                    field548 = -1;
                    field700 = 0;
                    field666 = 0;
                    field589 = 0;
                    field506 = 0;
                    for (int var15 = 0; var15 < 2048; var15++) {
                        field511[var15] = null;
                        field600[var15] = null;
                    }
                    for (int var16 = 0; var16 < 32768; var16++) {
                        field505[var16] = null;
                    }
                    Statics.field52 = field511[2047] = new class3();
                    field604.method3308();
                    field570.method3308();
                    for (int var17 = 0; var17 < 4; var17++) {
                        for (int var18 = 0; var18 < 104; var18++) {
                            for (int var19 = 0; var19 < 104; var19++) {
                                field656[var17][var18][var19] = null;
                            }
                        }
                    }
                    field603 = new class177();
                    field601 = 0;
                    field720 = 0;
                    field724 = 0;
                    for (int var20 = 0; var20 < Statics.field2739; var20++) {
                        class42 var21 = class42.method2179(var20);
                        if (var21 != null && var21.field1022 == 0) {
                            class160.field2727[var20] = 0;
                            class160.field2726[var20] = 0;
                        }
                    }
                    for (int var22 = 0; var22 < field662.length; var22++) {
                        field662[var22] = -1;
                    }
                    if (field628 != -1) {
                        class159.method169(field628);
                    }
                    for (class4 var23 = (class4) field629.method3294(); var23 != null; var23 = (class4) field629.method3302()) {
                        method219(var23, true);
                    }
                    field628 = -1;
                    field629 = new class175(8);
                    field632 = null;
                    field610 = false;
                    field524 = 0;
                    field679.method3230((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var24 = 0; var24 < 8; var24++) {
                        field599[var24] = null;
                        field669[var24] = false;
                    }
                    class19.method1356();
                    field708 = true;
                    for (int var25 = 0; var25 < 100; var25++) {
                        field671[var25] = true;
                    }
                    field693 = null;
                    Statics.field1017 = 0;
                    Statics.field2367 = null;
                    Statics.field554 = -1;
                    method118(false);
                    field513 = -1;
                }
            }
        } catch (IOException var29) {
            if (field503 < 1) {
                if (Statics.field1292 == Statics.field1244) {
                    Statics.field1292 = Statics.field1807;
                } else {
                    Statics.field1292 = Statics.field1244;
                }
                field503++;
                field465 = 0;
            } else {
                method126(-2);
            }
        }
    }

    @ObfuscatedName("t.y(II)V")
    public static void method126(int arg0) {
        if (arg0 == -3) {
            class21.method2297(class135.field2130, class135.field2132, class135.field2307);
        } else if (arg0 == -2) {
            class21.method2297(class135.field2134, class135.field2195, class135.field2136);
        } else if (arg0 == -1) {
            class21.method2297(class135.field2137, class135.field2138, class135.field2139);
        } else if (arg0 == 3) {
            class21.method2297(class135.field2140, class135.field2100, class135.field2142);
        } else if (arg0 == 4) {
            class21.method2297(class135.field2143, class135.field2144, class135.field2145);
        } else if (arg0 == 5) {
            class21.method2297(class135.field2146, class135.field2147, class135.field2249);
        } else if (arg0 == 6) {
            class21.method2297(class135.field2149, class135.field2203, class135.field2225);
        } else if (arg0 == 7) {
            class21.method2297(class135.field2124, class135.field2164, class135.field2273);
        } else if (arg0 == 8) {
            class21.method2297(class135.field2155, class135.field2156, class135.field2295);
        } else if (arg0 == 9) {
            class21.method2297(class135.field2158, class135.field2159, class135.field2160);
        } else if (arg0 == 10) {
            class21.method2297(class135.field2102, class135.field2157, class135.field2220);
        } else if (arg0 == 11) {
            class21.method2297(class135.field2320, class135.field2122, class135.field2141);
        } else if (arg0 == 12) {
            class21.method2297(class135.field2167, class135.field2168, class135.field2108);
        } else if (arg0 == 13) {
            class21.method2297(class135.field2250, class135.field2306, class135.field2172);
        } else if (arg0 == 14) {
            class21.method2297(class135.field2265, class135.field2119, class135.field2175);
        } else if (arg0 == 16) {
            class21.method2297(class135.field2176, class135.field2103, class135.field2178);
        } else if (arg0 == 17) {
            class21.method2297(class135.field2299, class135.field2125, class135.field2181);
        } else if (arg0 == 18) {
            class21.method2297(class135.field2182, class135.field2183, class135.field2256);
        } else if (arg0 == 19) {
            class21.method2297(class135.field2105, class135.field2325, class135.field2187);
        } else if (arg0 == 20) {
            class21.method2297(class135.field2097, class135.field2189, class135.field2286);
        } else if (arg0 == 22) {
            class21.method2297(class135.field2170, class135.field2162, class135.field2148);
        } else if (arg0 == 23) {
            class21.method2297(class135.field2194, class135.field2292, class135.field2196);
        } else if (arg0 == 24) {
            class21.method2297(class135.field2197, class135.field2244, class135.field2199);
        } else if (arg0 == 25) {
            class21.method2297(class135.field2200, class135.field2253, class135.field2202);
        } else if (arg0 == 26) {
            class21.method2297(class135.field2174, class135.field2204, class135.field2205);
        } else if (arg0 == 27) {
            class21.method2297(class135.field2191, class135.field2207, class135.field2208);
        } else if (arg0 == 31) {
            class21.method2297(class135.field2215, class135.field2216, class135.field2217);
        } else if (arg0 == 32) {
            class21.method2297(class135.field2198, class135.field2219, class135.field2234);
        } else if (arg0 == 37) {
            class21.method2297(class135.field2133, class135.field2235, class135.field2223);
        } else if (arg0 == 38) {
            class21.method2297(class135.field2224, class135.field2188, class135.field2226);
        } else if (arg0 == 55) {
            class21.method2297(class135.field2227, class135.field2228, class135.field2229);
        } else {
            class21.method2297(class135.field2312, class135.field2231, class135.field2193);
        }
        method3172(10);
    }

    @ObfuscatedName("j.k(B)V")
    public static final void method42() {
        if (Statics.field508 != null) {
            Statics.field508.method1381();
            Statics.field508 = null;
        }
        method2197();
        Statics.field1423.method1894();
        for (int var0 = 0; var0 < 4; var0++) {
            field528[var0].method2671();
        }
        System.gc();
        class139.method234(2);
        field704 = -1;
        field705 = false;
        class7.method2361();
        method3172(10);
    }

    @ObfuscatedName("dr.p(B)V")
    public static final void method2197() {
        class37.field923.method3251();
        class33.field860.method3251();
        class36.method744();
        class32.method1647();
        class31.method2302();
        class40.method132();
        class34.method125();
        class35.field883.method3251();
        class35.field882.method3251();
        class38.field936.method3251();
        class42.field1021.method3251();
        class164.field2752.method3251();
        class159.field2684.method3251();
        class159.field2604.method3251();
        class159.field2614.method3251();
        ((class110) Statics.field1766).method2210();
        class5.field72.method3251();
        Statics.field743.method3009();
        Statics.field568.method3009();
        Statics.field953.method3009();
        Statics.field1272.method3009();
        Statics.field609.method3009();
        Statics.field1164.method3009();
        Statics.field562.method3009();
        Statics.field1734.method3009();
        Statics.field291.method3009();
        Statics.field1366.method3009();
        Statics.field962.method3009();
        Statics.field225.method3009();
    }

    @ObfuscatedName("i.s(I)V")
    public static final void method222() {
        if (field593 > 0) {
            method42();
        } else {
            method3172(40);
            Statics.field1508 = Statics.field508;
            Statics.field508 = null;
        }
    }

    @ObfuscatedName("i.m(B)V")
    public static final void method223() {
        if (field484 > 1) {
            field484--;
        }
        if (field593 > 0) {
            field593--;
        }
        if (field520) {
            field520 = false;
            method222();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field508 == null) {
                var1 = false;
            } else {
                label2529: {
                    try {
                        int var2 = Statics.field508.method1357();
                        if (var2 == 0) {
                            var1 = false;
                            break label2529;
                        }
                        if (field513 == -1) {
                            Statics.field508.method1360(field498.field2026, 0, 1);
                            field498.field2027 = 0;
                            field513 = field498.method2307();
                            field512 = class165.field2769[field513];
                            var2--;
                        }
                        if (field512 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2529;
                            }
                            Statics.field508.method1360(field498.field2026, 0, 1);
                            field512 = field498.field2026[0] & 0xFF;
                            var2--;
                        }
                        if (field512 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2529;
                            }
                            Statics.field508.method1360(field498.field2026, 0, 2);
                            field498.field2027 = 0;
                            field512 = field498.method2572();
                            var2 -= 2;
                        }
                        if (var2 < field512) {
                            var1 = false;
                            break label2529;
                        }
                        field498.field2027 = 0;
                        Statics.field508.method1360(field498.field2026, 0, field512);
                        field514 = 0;
                        field519 = field597;
                        field597 = field517;
                        field517 = field513;
                        if (field513 == 217) {
                            class182.method1303(field498, field512);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 120) {
                            int var3 = field498.method2475();
                            class159 var4 = class159.method2352(var3);
                            var4.field2640 = 3;
                            var4.field2641 = Statics.field52.field51.method3215();
                            method2180(var4);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 192) {
                            for (int var5 = 0; var5 < field511.length; var5++) {
                                if (field511[var5] != null) {
                                    field511[var5].field437 = -1;
                                }
                            }
                            for (int var6 = 0; var6 < field505.length; var6++) {
                                if (field505[var6] != null) {
                                    field505[var6].field437 = -1;
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 41) {
                            int var7 = field498.method2469();
                            int var8 = field498.method2572();
                            int var9 = field498.method2439();
                            class159 var10 = class159.method2352(var9);
                            var10.field2663 = (var8 << 16) + var7;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 134) {
                            String var11 = field498.method2444();
                            int var12 = field498.method2572();
                            byte var13 = field498.method2437();
                            boolean var14 = false;
                            if (var13 == -128) {
                                var14 = true;
                            }
                            if (var14) {
                                if (Statics.field1017 == 0) {
                                    field513 = -1;
                                    var1 = true;
                                    break label2529;
                                }
                                boolean var15 = false;
                                int var16;
                                for (var16 = 0; var16 < Statics.field1017 && (!Statics.field2367[var16].field120.equals(var11) || Statics.field2367[var16].field114 != var12); var16++) {
                                }
                                if (var16 < Statics.field1017) {
                                    while (var16 < Statics.field1017 - 1) {
                                        Statics.field2367[var16] = Statics.field2367[var16 + 1];
                                        var16++;
                                    }
                                    Statics.field1017--;
                                    Statics.field2367[Statics.field1017] = null;
                                }
                            } else {
                                field498.method2444();
                                class8 var17 = new class8();
                                var17.field120 = var11;
                                var17.field117 = class149.method1628(var17.field120, Statics.field471);
                                var17.field114 = var12;
                                var17.field115 = var13;
                                int var18;
                                for (var18 = Statics.field1017 - 1; var18 >= 0; var18--) {
                                    int var19 = Statics.field2367[var18].field117.compareTo(var17.field120);
                                    if (var19 == 0) {
                                        Statics.field2367[var18].field114 = var12;
                                        Statics.field2367[var18].field115 = var13;
                                        if (var11.equals(Statics.field52.field32)) {
                                            Statics.field247 = var13;
                                        }
                                        field660 = field651;
                                        field513 = -1;
                                        var1 = true;
                                        break label2529;
                                    }
                                    if (var19 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field1017 >= Statics.field2367.length) {
                                    field513 = -1;
                                    var1 = true;
                                    break label2529;
                                }
                                for (int var20 = Statics.field1017 - 1; var20 > var18; var20--) {
                                    Statics.field2367[var20 + 1] = Statics.field2367[var20];
                                }
                                if (Statics.field1017 == 0) {
                                    Statics.field2367 = new class8[100];
                                }
                                Statics.field2367[var18 + 1] = var17;
                                Statics.field1017++;
                                if (var11.equals(Statics.field52.field32)) {
                                    Statics.field247 = var13;
                                }
                            }
                            field660 = field651;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 182) {
                            Statics.field2480 = field498.method2577();
                            Statics.field2032 = field498.method2545();
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 32) {
                            byte var21 = field498.method2462();
                            int var22 = field498.method2572();
                            class160.field2727[var22] = var21;
                            if (class160.field2726[var22] != var21) {
                                class160.field2726[var22] = var21;
                                method93(var22);
                            }
                            field624[++field714 - 1 & 0x1F] = var22;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 194) {
                            method221();
                            field633 = field498.method2436();
                            field499 = field651;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 127) {
                            String var23 = field498.method2444();
                            long var24 = field498.method2442();
                            long var26 = (long) field498.method2572();
                            long var28 = (long) field498.method2440();
                            int var30 = field498.method2436();
                            long var31 = (var26 << 32) + var28;
                            boolean var33 = false;
                            for (int var34 = 0; var34 < 100; var34++) {
                                if (field687[var34] == var31) {
                                    var33 = true;
                                    break;
                                }
                            }
                            if (var30 <= 1 && method791(var23)) {
                                var33 = true;
                            }
                            if (!var33 && field587 == 0) {
                                field687[field688] = var31;
                                field688 = (field688 + 1) % 100;
                                String var35 = class185.method3423(class148.method802(class184.method3064(field498)));
                                if (var30 == 2 || var30 == 3) {
                                    method2303(9, class2.method1168(1) + var23, var35, class147.method629(var24));
                                } else if (var30 == 1) {
                                    method2303(9, class2.method1168(0) + var23, var35, class147.method629(var24));
                                } else {
                                    method2303(9, var23, var35, class147.method629(var24));
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 0) {
                            field660 = field651;
                            if (field512 == 0) {
                                field693 = null;
                                field694 = null;
                                Statics.field1017 = 0;
                                Statics.field2367 = null;
                                field513 = -1;
                                var1 = true;
                            } else {
                                field694 = field498.method2444();
                                long var36 = field498.method2442();
                                long var38 = var36;
                                String var40;
                                if (var36 <= 0L || var36 >= 6582952005840035281L) {
                                    var40 = null;
                                } else if (var36 % 37L == 0L) {
                                    var40 = null;
                                } else {
                                    int var41 = 0;
                                    for (long var42 = var36; var42 != 0L; var42 /= 37L) {
                                        var41++;
                                    }
                                    StringBuilder var44 = new StringBuilder(var41);
                                    while (var38 != 0L) {
                                        long var45 = var38;
                                        var38 /= 37L;
                                        var44.append(class147.field2460[(int) (var45 - var38 * 37L)]);
                                    }
                                    var40 = var44.reverse().toString();
                                }
                                field693 = var40;
                                Statics.field1913 = field498.method2437();
                                int var47 = field498.method2436();
                                if (var47 == 255) {
                                    field513 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field1017 = var47;
                                    class8[] var48 = new class8[100];
                                    for (int var49 = 0; var49 < Statics.field1017; var49++) {
                                        var48[var49] = new class8();
                                        var48[var49].field120 = field498.method2444();
                                        var48[var49].field117 = class149.method1628(var48[var49].field120, Statics.field471);
                                        var48[var49].field114 = field498.method2572();
                                        var48[var49].field115 = field498.method2437();
                                        field498.method2444();
                                        if (var48[var49].field120.equals(Statics.field52.field32)) {
                                            Statics.field247 = var48[var49].field115;
                                        }
                                    }
                                    boolean var50 = false;
                                    int var51 = Statics.field1017;
                                    while (var51 > 0) {
                                        boolean var52 = true;
                                        var51--;
                                        for (int var53 = 0; var53 < var51; var53++) {
                                            if (var48[var53].field117.compareTo(var48[var53 + 1].field117) > 0) {
                                                class8 var54 = var48[var53];
                                                var48[var53] = var48[var53 + 1];
                                                var48[var53 + 1] = var54;
                                                var52 = false;
                                            }
                                        }
                                        if (var52) {
                                            break;
                                        }
                                    }
                                    Statics.field2367 = var48;
                                    field513 = -1;
                                    var1 = true;
                                }
                            }
                            break label2529;
                        }
                        if (field513 == 162) {
                            field700 = 0;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 101) {
                            method118(false);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 179) {
                            for (int var55 = 0; var55 < class160.field2726.length; var55++) {
                                if (class160.field2727[var55] != class160.field2726[var55]) {
                                    class160.field2726[var55] = class160.field2727[var55];
                                    method93(var55);
                                    field624[++field714 - 1 & 0x1F] = var55;
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 20) {
                            field545 = field498.method2436();
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 232) {
                            if (field628 != -1) {
                                method238(field628, 0);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 195) {
                            field644 = true;
                            Statics.field63 = field498.method2436();
                            Statics.field2328 = field498.method2436();
                            Statics.field123 = field498.method2572();
                            Statics.field1510 = field498.method2436();
                            Statics.field195 = field498.method2436();
                            if (Statics.field195 >= 100) {
                                Statics.field28 = Statics.field63 * 128 + 64;
                                Statics.field2031 = Statics.field2328 * 128 + 64;
                                Statics.field1249 = method121(Statics.field28, Statics.field2031, Statics.field263) - Statics.field123;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 60) {
                            int var56 = field498.method2469();
                            int var57 = field498.method2613();
                            int var58 = field498.method2572();
                            int var59 = field498.method2477();
                            class159 var60 = class159.method2352(var59);
                            if (var60.field2720 != var57 || var60.field2696 != var58 || var60.field2651 != var56) {
                                var60.field2720 = var57;
                                var60.field2696 = var58;
                                var60.field2651 = var56;
                                method2180(var60);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 54) {
                            field644 = false;
                            for (int var61 = 0; var61 < 5; var61++) {
                                field476[var61] = false;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 245) {
                            String var62 = field498.method2444();
                            if (var62.endsWith(":tradereq:")) {
                                String var63 = var62.substring(0, var62.indexOf(":"));
                                boolean var64 = false;
                                if (method791(var63)) {
                                    var64 = true;
                                }
                                if (!var64 && field587 == 0) {
                                    method35(4, var63, class135.field2233);
                                }
                            } else if (var62.endsWith(":duelreq:")) {
                                String var65 = var62.substring(0, var62.indexOf(":"));
                                boolean var66 = false;
                                if (method791(var65)) {
                                    var66 = true;
                                }
                                if (!var66 && field587 == 0) {
                                    method35(8, var65, class135.field2300);
                                }
                            } else if (var62.endsWith(":chalreq:")) {
                                String var67 = var62.substring(0, var62.indexOf(":"));
                                boolean var68 = false;
                                if (method791(var67)) {
                                    var68 = true;
                                }
                                if (!var68 && field587 == 0) {
                                    String var69 = var62.substring(var62.indexOf(":") + 1, var62.length() - 9);
                                    method35(8, var67, var69);
                                }
                            } else if (var62.endsWith(":assistreq:")) {
                                String var70 = var62.substring(0, var62.indexOf(":"));
                                boolean var71 = false;
                                if (method791(var70)) {
                                    var71 = true;
                                }
                                if (!var71 && field587 == 0) {
                                    method35(10, var70, "");
                                }
                            } else if (var62.endsWith(":clan:")) {
                                String var72 = var62.substring(0, var62.indexOf(":clan:"));
                                method35(11, "", var72);
                            } else if (var62.endsWith(":trade:")) {
                                String var73 = var62.substring(0, var62.indexOf(":trade:"));
                                if (field587 == 0) {
                                    method35(12, "", var73);
                                }
                            } else if (var62.endsWith(":assist:")) {
                                String var74 = var62.substring(0, var62.indexOf(":assist:"));
                                if (field587 == 0) {
                                    method35(13, "", var74);
                                }
                            } else {
                                method35(0, "", var62);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 95) {
                            Statics.field2480 = field498.method2460();
                            Statics.field2032 = field498.method2436();
                            while (field498.field2027 < field512) {
                                field513 = field498.method2436();
                                method1258();
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 105) {
                            int var75 = field498.method2475();
                            int var76 = field498.method2467();
                            class159 var77 = class159.method2352(var75);
                            if (var77 != null && var77.field2610 == 0) {
                                if (var76 > var77.field2624 - var77.field2618) {
                                    var76 = var77.field2624 - var77.field2618;
                                }
                                if (var76 < 0) {
                                    var76 = 0;
                                }
                                if (var77.field2622 != var76) {
                                    var77.field2622 = var76;
                                    method2180(var77);
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 203) {
                            int var78 = field512 + field498.field2027;
                            int var79 = field498.method2572();
                            int var80 = field498.method2572();
                            if (field628 != var79) {
                                field628 = var79;
                                method25(field628);
                                class26.method144(field628);
                                for (int var81 = 0; var81 < 100; var81++) {
                                    field671[var81] = true;
                                }
                            }
                            while (var80-- > 0) {
                                int var82 = field498.method2439();
                                int var83 = field498.method2572();
                                int var84 = field498.method2436();
                                class4 var85 = (class4) field629.method3291((long) var82);
                                if (var85 != null && var85.field57 != var83) {
                                    method219(var85, true);
                                    var85 = null;
                                }
                                if (var85 == null) {
                                    var85 = method856(var82, var83, var84);
                                }
                                var85.field58 = true;
                            }
                            for (class4 var86 = (class4) field629.method3294(); var86 != null; var86 = (class4) field629.method3302()) {
                                if (var86.field58) {
                                    var86.field58 = false;
                                } else {
                                    method219(var86, true);
                                }
                            }
                            field518 = new class175(512);
                            while (field498.field2027 < var78) {
                                int var87 = field498.method2439();
                                int var88 = field498.method2572();
                                int var89 = field498.method2572();
                                int var90 = field498.method2439();
                                for (int var91 = var88; var91 <= var89; var91++) {
                                    long var92 = ((long) var87 << 32) + (long) var91;
                                    field518.method3292(new class171(var90), var92);
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 210) {
                            int var94 = field498.method2439();
                            int var95 = field498.method2477();
                            int var96 = field498.method2572();
                            if (var96 == 65535) {
                                var96 = -1;
                            }
                            int var97 = field498.method2613();
                            if (var97 == 65535) {
                                var97 = -1;
                            }
                            for (int var98 = var96; var98 <= var97; var98++) {
                                long var99 = ((long) var95 << 32) + (long) var98;
                                class179 var101 = field518.method3291(var99);
                                if (var101 != null) {
                                    var101.method3341();
                                }
                                field518.method3292(new class171(var94), var99);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 140) {
                            Statics.field1438 = class138.method1345(field498.method2436());
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 44) {
                            String var102 = field498.method2444();
                            long var103 = (long) field498.method2572();
                            long var105 = (long) field498.method2440();
                            int var107 = field498.method2436();
                            long var108 = (var103 << 32) + var105;
                            boolean var110 = false;
                            for (int var111 = 0; var111 < 100; var111++) {
                                if (field687[var111] == var108) {
                                    var110 = true;
                                    break;
                                }
                            }
                            if (method791(var102)) {
                                var110 = true;
                            }
                            if (!var110 && field587 == 0) {
                                field687[field688] = var108;
                                field688 = (field688 + 1) % 100;
                                String var112 = class185.method3423(class148.method802(class184.method3064(field498)));
                                if (var107 == 2 || var107 == 3) {
                                    method35(7, class2.method1168(1) + var102, var112);
                                } else if (var107 == 1) {
                                    method35(7, class2.method1168(0) + var102, var112);
                                } else {
                                    method35(3, var102, var112);
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 6) {
                            method42();
                            field513 = -1;
                            var1 = false;
                            break label2529;
                        }
                        if (field513 == 62) {
                            field685 = field498.method2436();
                            field686 = field498.method2436();
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 26) {
                            method118(true);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 71) {
                            method221();
                            int var113 = field498.method2476();
                            int var114 = field498.method2577();
                            int var115 = field498.method2460();
                            field642[var115] = var113;
                            field710[var115] = var114;
                            field627[var115] = 1;
                            for (int var116 = 0; var116 < 98; var116++) {
                                if (var113 >= class131.field2065[var116]) {
                                    field627[var115] = var116 + 2;
                                }
                            }
                            field668[++field657 - 1 & 0x1F] = var115;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 18) {
                            field498.field2027 += 28;
                            if (field498.method2487()) {
                                class82.method207(field498, field498.field2027 - 28);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 121) {
                            int var117 = field498.method2572();
                            if (var117 == 65535) {
                                var117 = -1;
                            }
                            int var118 = field498.method2476();
                            int var119 = field498.method2476();
                            class159 var120 = class159.method2352(var118);
                            if (var120.field2607) {
                                var120.field2648 = var117;
                                var120.field2705 = var119;
                                class40 var122 = class40.method672(var117);
                                var120.field2720 = var122.field979;
                                var120.field2696 = var122.field980;
                                var120.field2650 = var122.field1010;
                                var120.field2646 = var122.field992;
                                var120.field2647 = var122.field983;
                                var120.field2651 = var122.field978;
                                if (var120.field2617 > 0) {
                                    var120.field2651 = var120.field2651 * 32 / var120.field2617;
                                }
                                method2180(var120);
                            } else {
                                if (var117 == -1) {
                                    var120.field2640 = 0;
                                    field513 = -1;
                                    var1 = true;
                                    break label2529;
                                }
                                class40 var121 = class40.method672(var117);
                                var120.field2640 = 4;
                                var120.field2641 = var117;
                                var120.field2720 = var121.field979;
                                var120.field2696 = var121.field980;
                                var120.field2651 = var121.field978 * 100 / var119;
                                method2180(var120);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 156 || field513 == 157 || field513 == 158 || field513 == 237 || field513 == 110 || field513 == 133 || field513 == 241 || field513 == 155 || field513 == 249 || field513 == 131 || field513 == 76) {
                            method1258();
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 228) {
                            String var123 = field498.method2444();
                            int var124 = field498.method2545();
                            int var125 = field498.method2436();
                            if (var125 >= 1 && var125 <= 8) {
                                if (var123.equalsIgnoreCase("null")) {
                                    var123 = null;
                                }
                                field599[var125 - 1] = var123;
                                field669[var125 - 1] = var124 == 0;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 244) {
                            while (field498.field2027 < field512) {
                                int var126 = field498.method2436();
                                boolean var127 = (var126 & 0x1) == 1;
                                String var128 = field498.method2444();
                                String var129 = field498.method2444();
                                field498.method2444();
                                for (int var130 = 0; var130 < field724; var130++) {
                                    class11 var131 = field725[var130];
                                    if (var127) {
                                        if (var129.equals(var131.field188)) {
                                            var131.field188 = var128;
                                            var131.field182 = var129;
                                            var128 = null;
                                            break;
                                        }
                                    } else if (var128.equals(var131.field188)) {
                                        var131.field188 = var128;
                                        var131.field182 = var129;
                                        var128 = null;
                                        break;
                                    }
                                }
                                if (var128 != null && field724 < 400) {
                                    class11 var132 = new class11();
                                    field725[field724] = var132;
                                    var132.field188 = var128;
                                    var132.field182 = var129;
                                    field724++;
                                }
                            }
                            field659 = field651;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 43) {
                            Statics.method255();
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 137) {
                            int var133 = field498.method2439();
                            class4 var134 = (class4) field629.method3291((long) var133);
                            if (var134 != null) {
                                method219(var134, true);
                            }
                            if (field632 != null) {
                                method2180(field632);
                                field632 = null;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 100) {
                            field601 = 1;
                            field659 = field651;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 119) {
                            int var135 = field498.method2572();
                            int var136 = field498.method2436();
                            int var137 = field498.method2572();
                            if (field706 != 0 && var136 != 0 && field549 < 50) {
                                field709[field549] = var135;
                                field580[field549] = var136;
                                field711[field549] = var137;
                                field713[field549] = null;
                                field712[field549] = 0;
                                field549++;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 70) {
                            int var141 = field498.method2476();
                            int var142 = field498.method2531();
                            int var143 = field498.method2470();
                            class159 var144 = class159.method2352(var141);
                            int var145 = var144.field2615 + var143;
                            int var146 = var144.field2616 + var142;
                            if (var144.field2613 != var145 || var144.field2649 != var146) {
                                var144.field2613 = var145;
                                var144.field2649 = var146;
                                method2180(var144);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 126) {
                            int var147 = field498.method2613();
                            if (var147 == 65535) {
                                var147 = -1;
                            }
                            if (var147 == -1 && !field705) {
                                Statics.field2353.method2744();
                                class139.field2354 = 1;
                                Statics.field2586 = null;
                            } else if (var147 != -1 && field704 != var147 && field703 != 0 && !field705) {
                                class139.method2296(2, Statics.field1164, var147, 0, field703, false);
                            }
                            field704 = var147;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 152) {
                            int var148 = field498.method2471();
                            int var149 = field498.method2467();
                            if (var149 == 65535) {
                                var149 = -1;
                            }
                            if (field703 != 0 && var149 != -1) {
                                class139.method235(Statics.field962, var149, 0, field703, false);
                                field705 = true;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 242) {
                            field484 = field498.method2572() * 30;
                            field499 = field651;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 212) {
                            int var150 = field498.method2613();
                            int var151 = field498.method2439();
                            class159 var152 = class159.method2352(var151);
                            if (var152.field2640 != 1 || var152.field2641 != var150) {
                                var152.field2640 = 1;
                                var152.field2641 = var150;
                                method2180(var152);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 172) {
                            while (field498.field2027 < field512) {
                                boolean var153 = field498.method2436() == 1;
                                String var154 = field498.method2444();
                                String var155 = field498.method2444();
                                int var156 = field498.method2572();
                                int var157 = field498.method2436();
                                int var158 = field498.method2436();
                                boolean var159 = (var158 & 0x2) != 0;
                                boolean var160 = (var158 & 0x1) != 0;
                                if (var156 > 0) {
                                    field498.method2444();
                                    field498.method2436();
                                    field498.method2439();
                                }
                                field498.method2444();
                                for (int var161 = 0; var161 < field720; var161++) {
                                    class23 var162 = field618[var161];
                                    if (var153) {
                                        if (var155.equals(var162.field367)) {
                                            var162.field367 = var154;
                                            var162.field357 = var155;
                                            var154 = null;
                                            break;
                                        }
                                    } else if (var154.equals(var162.field367)) {
                                        if (var162.field361 != var156) {
                                            boolean var163 = true;
                                            for (class28 var164 = (class28) field483.method3281(); var164 != null; var164 = (class28) field483.method3283()) {
                                                if (var164.field733.equals(var154)) {
                                                    if (var156 != 0 && var164.field739 == 0) {
                                                        var164.method3333();
                                                        var163 = false;
                                                    } else if (var156 == 0 && var164.field739 != 0) {
                                                        var164.method3333();
                                                        var163 = false;
                                                    }
                                                }
                                            }
                                            if (var163) {
                                                field483.method3280(new class28(var154, var156));
                                            }
                                            var162.field361 = var156;
                                        }
                                        var162.field357 = var155;
                                        var162.field359 = var157;
                                        var162.field360 = var159;
                                        var162.field356 = var160;
                                        var154 = null;
                                        break;
                                    }
                                }
                                if (var154 != null && field720 < 400) {
                                    class23 var165 = new class23();
                                    field618[field720] = var165;
                                    var165.field367 = var154;
                                    var165.field357 = var155;
                                    var165.field361 = var156;
                                    var165.field359 = var157;
                                    var165.field360 = var159;
                                    var165.field356 = var160;
                                    field720++;
                                }
                            }
                            field601 = 2;
                            field659 = field651;
                            boolean var166 = false;
                            int var167 = field720;
                            while (var167 > 0) {
                                boolean var168 = true;
                                var167--;
                                for (int var169 = 0; var169 < var167; var169++) {
                                    boolean var170 = false;
                                    class23 var171 = field618[var169];
                                    class23 var172 = field618[var169 + 1];
                                    if (field692 != var171.field361 && field692 == var172.field361) {
                                        var170 = true;
                                    }
                                    if (!var170 && var171.field361 == 0 && var172.field361 != 0) {
                                        var170 = true;
                                    }
                                    if (!var170 && !var171.field360 && var172.field360) {
                                        var170 = true;
                                    }
                                    if (!var170 && !var171.field356 && var172.field356) {
                                        var170 = true;
                                    }
                                    if (var170) {
                                        class23 var173 = field618[var169];
                                        field618[var169] = field618[var169 + 1];
                                        field618[var169 + 1] = var173;
                                        var168 = false;
                                    }
                                }
                                if (var168) {
                                    break;
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 4) {
                            method221();
                            field634 = field498.method2531();
                            field499 = field651;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 74) {
                            int var174 = field498.method2469();
                            int var175 = field498.method2476();
                            class159 var176 = class159.method2352(var175);
                            if (var176.field2640 != 2 || var176.field2641 != var174) {
                                var176.field2640 = 2;
                                var176.field2641 = var174;
                                method2180(var176);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 205) {
                            field644 = true;
                            Statics.field1771 = field498.method2436();
                            Statics.field1189 = field498.method2436();
                            Statics.field1610 = field498.method2572();
                            Statics.field1792 = field498.method2436();
                            Statics.field1170 = field498.method2436();
                            if (Statics.field1170 >= 100) {
                                int var177 = Statics.field1771 * 128 + 64;
                                int var178 = Statics.field1189 * 128 + 64;
                                int var179 = method121(var177, var178, Statics.field263) - Statics.field1610;
                                int var180 = var177 - Statics.field28;
                                int var181 = var179 - Statics.field1249;
                                int var182 = var178 - Statics.field2031;
                                int var183 = (int) Math.sqrt((double) (var180 * var180 + var182 * var182));
                                Statics.field384 = (int) (Math.atan2((double) var181, (double) var183) * 325.949D) & 0x7FF;
                                Statics.field1018 = (int) (Math.atan2((double) var180, (double) var182) * -325.949D) & 0x7FF;
                                if (Statics.field384 < 128) {
                                    Statics.field384 = 128;
                                }
                                if (Statics.field384 > 383) {
                                    Statics.field384 = 383;
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 171) {
                            int var184 = field498.method2467();
                            class19.method2178(var184);
                            field654[++field655 - 1 & 0x1F] = var184 & 0x7FFF;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 65) {
                            int var185 = field498.method2476();
                            class159 var186 = class159.method2352(var185);
                            for (int var187 = 0; var187 < var186.field2710.length; var187++) {
                                var186.field2710[var187] = -1;
                                var186.field2710[var187] = 0;
                            }
                            method2180(var186);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 67) {
                            int var188 = field498.method2469();
                            field628 = var188;
                            method25(var188);
                            class26.method144(field628);
                            for (int var189 = 0; var189 < 100; var189++) {
                                field671[var189] = true;
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 1) {
                            method3239();
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 55) {
                            int var190 = field498.method2439();
                            int var191 = field498.method2572();
                            if (var190 < -70000) {
                                var191 += 32768;
                            }
                            class159 var192;
                            if (var190 >= 0) {
                                var192 = class159.method2352(var190);
                            } else {
                                var192 = null;
                            }
                            while (field498.field2027 < field512) {
                                int var193 = field498.method2560();
                                int var194 = field498.method2572();
                                int var195 = 0;
                                if (var194 != 0) {
                                    var195 = field498.method2436();
                                    if (var195 == 255) {
                                        var195 = field498.method2439();
                                    }
                                }
                                if (var192 != null && var193 >= 0 && var193 < var192.field2710.length) {
                                    var192.field2710[var193] = var194;
                                    var192.field2711[var193] = var195;
                                }
                                class19.method259(var191, var193, var194 - 1, var195);
                            }
                            if (var192 != null) {
                                method2180(var192);
                            }
                            method221();
                            field654[++field655 - 1 & 0x1F] = var191 & 0x7FFF;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 53) {
                            int var196 = field498.method2436();
                            int var197 = field498.method2436();
                            int var198 = field498.method2436();
                            int var199 = field498.method2436();
                            field476[var196] = true;
                            field566[var196] = var197;
                            field670[var196] = var198;
                            field717[var196] = var199;
                            field479[var196] = 0;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 56) {
                            int var200 = field498.method2475();
                            String var201 = field498.method2444();
                            class159 var202 = class159.method2352(var200);
                            if (!var201.equals(var202.field2655)) {
                                var202.field2655 = var201;
                                method2180(var202);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 202) {
                            int var203 = field498.method2467();
                            int var204 = field498.method2460();
                            int var205 = field498.method2476();
                            class4 var206 = (class4) field629.method3291((long) var205);
                            if (var206 != null) {
                                method219(var206, var206.field57 != var203);
                            }
                            method856(var205, var203, var204);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 97) {
                            int var207 = field498.method2572();
                            int var208 = field498.method2439();
                            int var209 = var207 >> 10 & 0x1F;
                            int var210 = var207 >> 5 & 0x1F;
                            int var211 = var207 & 0x1F;
                            int var212 = (var211 << 3) + (var209 << 19) + (var210 << 11);
                            class159 var213 = class159.method2352(var208);
                            if (var213.field2692 != var212) {
                                var213.field2692 = var212;
                                method2180(var213);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 214) {
                            field485 = field498.method2436();
                            if (field485 == 1) {
                                field541 = field498.method2572();
                            }
                            if (field485 >= 2 && field485 <= 6) {
                                if (field485 == 2) {
                                    field491 = 64;
                                    field492 = 64;
                                }
                                if (field485 == 3) {
                                    field491 = 0;
                                    field492 = 64;
                                }
                                if (field485 == 4) {
                                    field491 = 128;
                                    field492 = 64;
                                }
                                if (field485 == 5) {
                                    field491 = 64;
                                    field492 = 0;
                                }
                                if (field485 == 6) {
                                    field491 = 64;
                                    field492 = 128;
                                }
                                field485 = 2;
                                field488 = field498.method2572();
                                field489 = field498.method2572();
                                field490 = field498.method2436();
                            }
                            if (field485 == 10) {
                                field487 = field498.method2572();
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 75) {
                            String var214 = field498.method2444();
                            Object[] var215 = new Object[var214.length() + 1];
                            for (int var216 = var214.length() - 1; var216 >= 0; var216--) {
                                if (var214.charAt(var216) == 's') {
                                    var215[var216 + 1] = field498.method2444();
                                } else {
                                    var215[var216 + 1] = Integer.valueOf(field498.method2439());
                                }
                            }
                            var215[0] = Integer.valueOf(field498.method2439());
                            class1 var217 = new class1();
                            var217.field15 = var215;
                            class26.method1(var217);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 218) {
                            int var218 = field498.method2475();
                            boolean var219 = field498.method2577() == 1;
                            class159 var220 = class159.method2352(var218);
                            if (var220.field2620 != var219) {
                                var220.field2620 = var219;
                                method2180(var220);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 173) {
                            int var221 = field498.method2476();
                            Statics.field1786 = Statics.field12.method1466(var221);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 163) {
                            int var222 = field498.method2439();
                            int var223 = field498.method2531();
                            class159 var224 = class159.method2352(var222);
                            if (var224.field2644 != var223 || var223 == -1) {
                                var224.field2644 = var223;
                                var224.field2603 = 0;
                                var224.field2715 = 0;
                                method2180(var224);
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 254) {
                            Statics.field2032 = field498.method2460();
                            Statics.field2480 = field498.method2436();
                            for (int var225 = Statics.field2032; var225 < Statics.field2032 + 8; var225++) {
                                for (int var226 = Statics.field2480; var226 < Statics.field2480 + 8; var226++) {
                                    if (field656[Statics.field263][var225][var226] != null) {
                                        field656[Statics.field263][var225][var226] = null;
                                        method124(var225, var226);
                                    }
                                }
                            }
                            for (class22 var227 = (class22) field603.method3314(); var227 != null; var227 = (class22) field603.method3325()) {
                                if (var227.field339 >= Statics.field2032 && var227.field339 < Statics.field2032 + 8 && var227.field345 >= Statics.field2480 && var227.field345 < Statics.field2480 + 8 && Statics.field263 == var227.field353) {
                                    var227.field355 = 0;
                                }
                            }
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 12) {
                            for (int var228 = 0; var228 < Statics.field2739; var228++) {
                                class42 var229 = class42.method2179(var228);
                                if (var229 != null && var229.field1022 == 0) {
                                    class160.field2727[var228] = 0;
                                    class160.field2726[var228] = 0;
                                }
                            }
                            method221();
                            field714 += 32;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 19) {
                            int var230 = field498.method2577();
                            int var231 = field498.method2545();
                            int var232 = field498.method2545();
                            Statics.field263 = var231 >> 1;
                            Statics.field52.method245(var232, var230, (var231 & 0x1) == 1);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 184) {
                            String var233 = field498.method2444();
                            String var234 = class185.method3423(class148.method802(class184.method3064(field498)));
                            method35(6, var233, var234);
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 243) {
                            int var235 = field498.method2476();
                            int var236 = field498.method2469();
                            class160.field2727[var236] = var235;
                            if (class160.field2726[var236] != var235) {
                                class160.field2726[var236] = var235;
                                method93(var236);
                            }
                            field624[++field714 - 1 & 0x1F] = var236;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        if (field513 == 129) {
                            int var237 = field498.method2439();
                            int var238 = field498.method2572();
                            if (var237 < -70000) {
                                var238 += 32768;
                            }
                            class159 var239;
                            if (var237 >= 0) {
                                var239 = class159.method2352(var237);
                            } else {
                                var239 = null;
                            }
                            if (var239 != null) {
                                for (int var240 = 0; var240 < var239.field2710.length; var240++) {
                                    var239.field2710[var240] = 0;
                                    var239.field2711[var240] = 0;
                                }
                            }
                            class19.method1560(var238);
                            int var241 = field498.method2572();
                            for (int var242 = 0; var242 < var241; var242++) {
                                int var243 = field498.method2545();
                                if (var243 == 255) {
                                    var243 = field498.method2439();
                                }
                                int var244 = field498.method2613();
                                if (var239 != null && var242 < var239.field2710.length) {
                                    var239.field2710[var242] = var244;
                                    var239.field2711[var242] = var243;
                                }
                                class19.method259(var238, var242, var244 - 1, var243);
                            }
                            if (var239 != null) {
                                method2180(var239);
                            }
                            method221();
                            field654[++field655 - 1 & 0x1F] = var238 & 0x7FFF;
                            field513 = -1;
                            var1 = true;
                            break label2529;
                        }
                        class80.method1557("" + field513 + class2.field25 + field597 + class2.field25 + field519 + class2.field25 + field512, (Throwable) null);
                        method42();
                    } catch (IOException var359) {
                        method222();
                    } catch (Exception var360) {
                        String var247 = "" + field513 + class2.field25 + field597 + class2.field25 + field519 + class2.field25 + field512 + class2.field25 + (Statics.field56 + Statics.field52.field460[0]) + class2.field25 + (Statics.field932 + Statics.field52.field461[0]) + class2.field25;
                        for (int var248 = 0; var248 < field512 && var248 < 50; var248++) {
                            var247 = var247 + field498.field2026[var248] + class2.field25;
                        }
                        class80.method1557(var247, var360);
                        method42();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field652 != 30) {
            return;
        }
        class182.method127(field602, 74);
        Object var249 = Statics.field190.field245;
        synchronized (Statics.field190.field245) {
            if (!field467) {
                Statics.field190.field256 = 0;
            } else if (class77.field1385 != 0 || Statics.field190.field256 >= 40) {
                field602.method2306(94);
                field602.method2422(0);
                int var250 = field602.field2027;
                int var251 = 0;
                for (int var252 = 0; var252 < Statics.field190.field256 && field602.field2027 - var250 < 240; var252++) {
                    var251++;
                    int var253 = Statics.field190.field252[var252];
                    if (var253 < 0) {
                        var253 = 0;
                    } else if (var253 > 502) {
                        var253 = 502;
                    }
                    int var254 = Statics.field190.field248[var252];
                    if (var254 < 0) {
                        var254 = 0;
                    } else if (var254 > 764) {
                        var254 = 764;
                    }
                    int var255 = var253 * 765 + var254;
                    if (Statics.field190.field252[var252] == -1 && Statics.field190.field248[var252] == -1) {
                        var254 = -1;
                        var253 = -1;
                        var255 = 524287;
                    }
                    if (field475 != var254 || field480 != var253) {
                        int var256 = var254 - field475;
                        field475 = var254;
                        int var257 = var253 - field480;
                        field480 = var253;
                        if (field481 < 8 && var256 >= -32 && var256 <= 31 && var257 >= -32 && var257 <= 31) {
                            var256 += 32;
                            var257 += 32;
                            field602.method2423((field481 << 12) + (var256 << 6) + var257);
                            field481 = 0;
                        } else if (field481 < 8) {
                            field602.method2451((field481 << 19) + 8388608 + var255);
                            field481 = 0;
                        } else {
                            field602.method2425((field481 << 19) + -1073741824 + var255);
                            field481 = 0;
                        }
                    } else if (field481 < 2047) {
                        field481++;
                    }
                }
                field602.method2461(field602.field2027 - var250);
                if (var251 >= Statics.field190.field256) {
                    Statics.field190.field256 = 0;
                } else {
                    Statics.field190.field256 -= var251;
                    for (int var258 = 0; var258 < Statics.field190.field256; var258++) {
                        Statics.field190.field248[var258] = Statics.field190.field248[var251 + var258];
                        Statics.field190.field252[var258] = Statics.field190.field252[var251 + var258];
                    }
                }
            }
        }
        if (class77.field1385 == 1 || class77.field1385 == 2) {
            long var260 = (class77.field1388 - field653 * -1L) / 50L;
            if (var260 > 4095L) {
                var260 = 4095L;
            }
            field653 = class77.field1388 * -1L;
            int var262 = class77.field1381;
            if (var262 < 0) {
                var262 = 0;
            } else if (var262 > 502) {
                var262 = 502;
            }
            int var263 = class77.field1386;
            if (var263 < 0) {
                var263 = 0;
            } else if (var263 > 764) {
                var263 = 764;
            }
            int var264 = var262 * 765 + var263;
            byte var265 = 0;
            if (class77.field1385 == 2) {
                var265 = 1;
            }
            int var266 = (int) var260;
            field602.method2306(252);
            field602.method2425((var265 << 19) + (var266 << 20) + var264);
        }
        if (class75.field1357 > 0) {
            field602.method2306(32);
            field602.method2423(0);
            int var267 = field602.field2027;
            long var268 = class121.method2221();
            for (int var270 = 0; var270 < class75.field1357; var270++) {
                long var271 = var268 - field594;
                if (var271 > 16777215L) {
                    var271 = 16777215L;
                }
                field594 = var268;
                field602.method2457(class75.field1348[var270]);
                field602.method2451((int) var271);
            }
            field602.method2432(field602.field2027 - var267);
        }
        if (field732 > 0) {
            field732--;
        }
        if (class75.field1343[96] || class75.field1343[97] || class75.field1343[98] || class75.field1343[99]) {
            field559 = true;
        }
        if (field559 && field732 <= 0) {
            field732 = 20;
            field559 = false;
            field602.method2306(147);
            field602.method2464(field702);
            field602.method2464(field552);
        }
        if (Statics.field2730 && !field539) {
            field539 = true;
            field602.method2306(19);
            field602.method2422(1);
        }
        if (!Statics.field2730 && field539) {
            field539 = false;
            field602.method2306(19);
            field602.method2422(0);
        }
        if (field473 && Statics.field263 != field521) {
            method687(Statics.field554, Statics.field404, Statics.field263, Statics.field52.field460[0], Statics.field52.field461[0]);
        } else if (Statics.field263 != field548) {
            field548 = Statics.field263;
            method230(Statics.field263);
        }
        if (field652 != 30) {
            return;
        }
        method12();
        int var10002;
        for (int var273 = 0; var273 < field549; var273++) {
            var10002 = field711[var273]--;
            if (field711[var273] >= -10) {
                class57 var275 = field713[var273];
                if (var275 == null) {
                    class57 var361 = (class57) null;
                    var275 = class57.method1241(Statics.field1272, field709[var273], 0);
                    if (var275 == null) {
                        continue;
                    }
                    field711[var273] += var275.method1243();
                    field713[var273] = var275;
                }
                if (field711[var273] < 0) {
                    int var282;
                    if (field712[var273] == 0) {
                        var282 = field706;
                    } else {
                        int var276 = (field712[var273] & 0xFF) * 128;
                        int var277 = field712[var273] >> 16 & 0xFF;
                        int var278 = var277 * 128 + 64 - Statics.field52.field443;
                        if (var278 < 0) {
                            var278 = -var278;
                        }
                        int var279 = field712[var273] >> 8 & 0xFF;
                        int var280 = var279 * 128 + 64 - Statics.field52.field408;
                        if (var280 < 0) {
                            var280 = -var280;
                        }
                        int var281 = var278 + var280 - 128;
                        if (var281 > var276) {
                            field711[var273] = -100;
                            continue;
                        }
                        if (var281 < 0) {
                            var281 = 0;
                        }
                        var282 = field707 * (var276 - var281) / var276;
                    }
                    if (var282 > 0) {
                        class63 var283 = var275.method1240().method1304(Statics.field2048);
                        class45 var284 = class45.method1044(var283, 100, var282);
                        var284.method1001(field580[var273] - 1);
                        Statics.field1284.method1084(var284);
                    }
                    field711[var273] = -100;
                }
            } else {
                field549--;
                for (int var274 = var273; var274 < field549; var274++) {
                    field709[var274] = field709[var274 + 1];
                    field713[var274] = field713[var274 + 1];
                    field580[var274] = field580[var274 + 1];
                    field711[var274] = field711[var274 + 1];
                    field712[var274] = field712[var274 + 1];
                }
                var273--;
            }
        }
        if (field705) {
            boolean var285;
            if (class139.field2354 == 0) {
                var285 = Statics.field2353.method2818();
            } else {
                var285 = true;
            }
            if (!var285) {
                if (field703 != 0 && field704 != -1) {
                    class139.method235(Statics.field1164, field704, 0, field703, false);
                }
                field705 = false;
            }
        }
        field514++;
        if (field514 > 750) {
            method222();
            return;
        }
        method1323();
        method1354();
        method2019();
        field621++;
        if (field578 != 0) {
            field577 += 20;
            if (field577 >= 400) {
                field578 = 0;
            }
        }
        if (Statics.field279 != null) {
            field579++;
            if (field579 >= 15) {
                method2180(Statics.field279);
                Statics.field279 = null;
            }
        }
        if (Statics.field11 != null) {
            method2180(Statics.field11);
            field586++;
            if (class77.field1379 > field582 + 5 || class77.field1379 < field582 - 5 || class77.field1380 > field583 + 5 || class77.field1380 < field583 - 5) {
                field699 = true;
            }
            if (class77.field1378 == 0) {
                if (field699 && field586 >= 5) {
                    if (Statics.field1303 == Statics.field11 && field584 != field581) {
                        class159 var286 = Statics.field11;
                        byte var287 = 0;
                        if (field631 == 1 && var286.field2612 == 206) {
                            var287 = 1;
                        }
                        if (var286.field2710[field584] <= 0) {
                            var287 = 0;
                        }
                        if (class163.method628(method256(var286))) {
                            int var288 = field581;
                            int var289 = field584;
                            var286.field2710[var289] = var286.field2710[var288];
                            var286.field2711[var289] = var286.field2711[var288];
                            var286.field2710[var288] = -1;
                            var286.field2711[var288] = 0;
                        } else if (var287 == 1) {
                            int var290 = field581;
                            int var291 = field584;
                            while (var290 != var291) {
                                if (var290 > var291) {
                                    var286.method3121(var290 - 1, var290);
                                    var290--;
                                } else if (var290 < var291) {
                                    var286.method3121(var290 + 1, var290);
                                    var290++;
                                }
                            }
                        } else {
                            var286.method3121(field584, field581);
                        }
                        field602.method2306(221);
                        field602.method2425(Statics.field11.field2661);
                        field602.method2465(field581);
                        field602.method2423(field584);
                        field602.method2457(var287);
                    }
                } else if ((field537 == 1 || method565(field524 - 1)) && field524 > 2) {
                    method134();
                } else if (field524 > 0) {
                    method38(field524 - 1);
                }
                field579 = 10;
                class77.field1385 = 0;
                Statics.field11 = null;
            }
        }
        class159 var292 = Statics.field362;
        class159 var293 = Statics.field956;
        Statics.field362 = null;
        Statics.field956 = null;
        field643 = null;
        field647 = false;
        field729 = false;
        for (field689 = 0; class75.method556() && field689 < 128; field689++) {
            field691[field689] = Statics.field1496;
            field690[field689] = Statics.field1248;
        }
        method225(field628, 0, 0, 765, 503, 0, 0);
        field651++;
        while (true) {
            class1 var294;
            class159 var295;
            class159 var296;
            do {
                var294 = (class1) field719.method3312();
                if (var294 == null) {
                    while (true) {
                        class1 var297;
                        class159 var298;
                        class159 var299;
                        do {
                            var297 = (class1) field667.method3312();
                            if (var297 == null) {
                                while (true) {
                                    class1 var300;
                                    class159 var301;
                                    class159 var302;
                                    do {
                                        var300 = (class1) field665.method3312();
                                        if (var300 == null) {
                                            if (field639 != null) {
                                                method2180(field639);
                                                Statics.field33++;
                                                if (field647 && field729) {
                                                    int var303 = class77.field1379;
                                                    int var304 = class77.field1380;
                                                    int var305 = var303 - field641;
                                                    int var306 = var304 - field696;
                                                    if (var305 < field645) {
                                                        var305 = field645;
                                                    }
                                                    if (field639.field2617 + var305 > field645 + field640.field2617) {
                                                        var305 = field645 + field640.field2617 - field639.field2617;
                                                    }
                                                    if (var306 < field542) {
                                                        var306 = field542;
                                                    }
                                                    if (field639.field2618 + var306 > field542 + field640.field2618) {
                                                        var306 = field542 + field640.field2618 - field639.field2618;
                                                    }
                                                    int var307 = var305 - field648;
                                                    int var308 = var306 - field649;
                                                    int var309 = field639.field2671;
                                                    if (Statics.field33 > field639.field2672 && (var307 > var309 || var307 < -var309 || var308 > var309 || var308 < -var309)) {
                                                        field650 = true;
                                                    }
                                                    int var310 = field640.field2621 + (var305 - field645);
                                                    int var311 = field640.field2622 + (var306 - field542);
                                                    if (field639.field2677 != null && field650) {
                                                        class1 var312 = new class1();
                                                        var312.field7 = field639;
                                                        var312.field2 = var310;
                                                        var312.field4 = var311;
                                                        var312.field15 = field639.field2677;
                                                        class26.method1(var312);
                                                    }
                                                    if (class77.field1378 == 0) {
                                                        if (field650) {
                                                            if (field639.field2686 != null) {
                                                                class1 var313 = new class1();
                                                                var313.field7 = field639;
                                                                var313.field2 = var310;
                                                                var313.field4 = var311;
                                                                var313.field8 = field643;
                                                                var313.field15 = field639.field2686;
                                                                class26.method1(var313);
                                                            }
                                                            if (field643 != null) {
                                                                class159 var314 = field639;
                                                                int var315 = method256(var314);
                                                                int var316 = var315 >> 17 & 0x7;
                                                                int var317 = var316;
                                                                class159 var318;
                                                                if (var316 == 0) {
                                                                    var318 = null;
                                                                } else {
                                                                    int var319 = 0;
                                                                    while (true) {
                                                                        if (var319 >= var317) {
                                                                            var318 = var314;
                                                                            break;
                                                                        }
                                                                        var314 = class159.method2352(var314.field2619);
                                                                        if (var314 == null) {
                                                                            var318 = null;
                                                                            break;
                                                                        }
                                                                        var319++;
                                                                    }
                                                                }
                                                                if (var318 != null) {
                                                                    field602.method2306(41);
                                                                    field602.method2474(field643.field2661);
                                                                    field602.method2425(field639.field2661);
                                                                    field602.method2423(field643.field2609);
                                                                    field602.method2423(field639.field2609);
                                                                }
                                                            }
                                                        } else if ((field537 == 1 || method565(field524 - 1)) && field524 > 2) {
                                                            method134();
                                                        } else if (field524 > 0) {
                                                            method38(field524 - 1);
                                                        }
                                                        field639 = null;
                                                    }
                                                } else if (Statics.field33 > 1) {
                                                    field639 = null;
                                                }
                                            }
                                            if (class95.field1563 != -1) {
                                                int var320 = class95.field1563;
                                                int var321 = class95.field1574;
                                                field602.method2306(227);
                                                field602.method2422(5);
                                                field602.method2441(Statics.field56 + var320);
                                                field602.method2465(Statics.field932 + var321);
                                                field602.method2583(class75.field1343[82] ? (class75.field1343[81] ? 2 : 1) : 0);
                                                class95.field1563 = -1;
                                                field661 = class77.field1386;
                                                field576 = class77.field1381;
                                                field578 = 1;
                                                field577 = 0;
                                                field700 = var320;
                                                field666 = var321;
                                            }
                                            method123();
                                            if (Statics.field362 != var292) {
                                                if (var292 != null) {
                                                    method2180(var292);
                                                }
                                                if (Statics.field362 != null) {
                                                    method2180(Statics.field362);
                                                }
                                            }
                                            if (Statics.field956 != var293 && field620 == field482) {
                                                if (var293 != null) {
                                                    method2180(var293);
                                                }
                                                if (Statics.field956 != null) {
                                                    method2180(Statics.field956);
                                                }
                                            }
                                            if (Statics.field956 == null) {
                                                if (field620 > 0) {
                                                    field620--;
                                                }
                                            } else if (field620 < field482) {
                                                field620++;
                                                if (field620 == field482) {
                                                    method2180(Statics.field956);
                                                }
                                            }
                                            int var322 = field532 + Statics.field52.field443;
                                            int var323 = field534 + Statics.field52.field408;
                                            if (Statics.field283 - var322 < -500 || Statics.field283 - var322 > 500 || Statics.field1250 - var323 < -500 || Statics.field1250 - var323 > 500) {
                                                Statics.field283 = var322;
                                                Statics.field1250 = var323;
                                            }
                                            if (Statics.field283 != var322) {
                                                Statics.field283 += (var322 - Statics.field283) / 16;
                                            }
                                            if (Statics.field1250 != var323) {
                                                Statics.field1250 += (var323 - Statics.field1250) / 16;
                                            }
                                            if (class77.field1378 == 4 && field635 >= 2) {
                                                int var324 = class77.field1380 - field557;
                                                field555 = var324 * 2;
                                                field557 = var324 == -1 || var324 == 1 ? class77.field1380 : (field557 + class77.field1380) / 2;
                                                int var325 = field556 - class77.field1379;
                                                field544 = var325 * 2;
                                                field556 = var325 == -1 || var325 == 1 ? class77.field1379 : (field556 + class77.field1379) / 2;
                                            } else {
                                                if (class75.field1343[96]) {
                                                    field544 += (-24 - field544) / 2;
                                                } else if (class75.field1343[97]) {
                                                    field544 += (24 - field544) / 2;
                                                } else {
                                                    field544 /= 2;
                                                }
                                                if (class75.field1343[98]) {
                                                    field555 += (12 - field555) / 2;
                                                } else if (class75.field1343[99]) {
                                                    field555 += (-12 - field555) / 2;
                                                } else {
                                                    field555 /= 2;
                                                }
                                                field557 = class77.field1380;
                                                field556 = class77.field1379;
                                            }
                                            field702 = field544 / 2 + field702 & 0x7FF;
                                            field552 += field555 / 2;
                                            if (field552 < 128) {
                                                field552 = 128;
                                            }
                                            if (field552 > 383) {
                                                field552 = 383;
                                            }
                                            int var326 = Statics.field283 >> 7;
                                            int var327 = Statics.field1250 >> 7;
                                            int var328 = method121(Statics.field283, Statics.field1250, Statics.field263);
                                            int var329 = 0;
                                            if (var326 > 3 && var327 > 3 && var326 < 100 && var327 < 100) {
                                                for (int var330 = var326 - 4; var330 <= var326 + 4; var330++) {
                                                    for (int var331 = var327 - 4; var331 <= var327 + 4; var331++) {
                                                        int var332 = Statics.field263;
                                                        if (var332 < 3 && (class9.field148[1][var330][var331] & 0x2) == 2) {
                                                            var332++;
                                                        }
                                                        int var333 = var328 - class9.field130[var332][var330][var331];
                                                        if (var333 > var329) {
                                                            var329 = var333;
                                                        }
                                                    }
                                                }
                                            }
                                            int var334 = var329 * 192;
                                            if (var334 > 98048) {
                                                var334 = 98048;
                                            }
                                            if (var334 < 32768) {
                                                var334 = 32768;
                                            }
                                            if (var334 > field560) {
                                                field560 += (var334 - field560) / 24;
                                            } else if (var334 < field560) {
                                                field560 += (var334 - field560) / 80;
                                            }
                                            if (field644) {
                                                int var335 = Statics.field63 * 128 + 64;
                                                int var336 = Statics.field2328 * 128 + 64;
                                                int var337 = method121(var335, var336, Statics.field263) - Statics.field123;
                                                if (Statics.field28 < var335) {
                                                    Statics.field28 += Statics.field195 * (var335 - Statics.field28) / 1000 + Statics.field1510;
                                                    if (Statics.field28 > var335) {
                                                        Statics.field28 = var335;
                                                    }
                                                }
                                                if (Statics.field28 > var335) {
                                                    Statics.field28 -= Statics.field195 * (Statics.field28 - var335) / 1000 + Statics.field1510;
                                                    if (Statics.field28 < var335) {
                                                        Statics.field28 = var335;
                                                    }
                                                }
                                                if (Statics.field1249 < var337) {
                                                    Statics.field1249 += Statics.field195 * (var337 - Statics.field1249) / 1000 + Statics.field1510;
                                                    if (Statics.field1249 > var337) {
                                                        Statics.field1249 = var337;
                                                    }
                                                }
                                                if (Statics.field1249 > var337) {
                                                    Statics.field1249 -= Statics.field195 * (Statics.field1249 - var337) / 1000 + Statics.field1510;
                                                    if (Statics.field1249 < var337) {
                                                        Statics.field1249 = var337;
                                                    }
                                                }
                                                if (Statics.field2031 < var336) {
                                                    Statics.field2031 += Statics.field195 * (var336 - Statics.field2031) / 1000 + Statics.field1510;
                                                    if (Statics.field2031 > var336) {
                                                        Statics.field2031 = var336;
                                                    }
                                                }
                                                if (Statics.field2031 > var336) {
                                                    Statics.field2031 -= Statics.field195 * (Statics.field2031 - var336) / 1000 + Statics.field1510;
                                                    if (Statics.field2031 < var336) {
                                                        Statics.field2031 = var336;
                                                    }
                                                }
                                                int var338 = Statics.field1771 * 128 + 64;
                                                int var339 = Statics.field1189 * 128 + 64;
                                                int var340 = method121(var338, var339, Statics.field263) - Statics.field1610;
                                                int var341 = var338 - Statics.field28;
                                                int var342 = var340 - Statics.field1249;
                                                int var343 = var339 - Statics.field2031;
                                                int var344 = (int) Math.sqrt((double) (var341 * var341 + var343 * var343));
                                                int var345 = (int) (Math.atan2((double) var342, (double) var344) * 325.949D) & 0x7FF;
                                                int var346 = (int) (Math.atan2((double) var341, (double) var343) * -325.949D) & 0x7FF;
                                                if (var345 < 128) {
                                                    var345 = 128;
                                                }
                                                if (var345 > 383) {
                                                    var345 = 383;
                                                }
                                                if (Statics.field384 < var345) {
                                                    Statics.field384 += Statics.field1170 * (var345 - Statics.field384) / 1000 + Statics.field1792;
                                                    if (Statics.field384 > var345) {
                                                        Statics.field384 = var345;
                                                    }
                                                }
                                                if (Statics.field384 > var345) {
                                                    Statics.field384 -= Statics.field1170 * (Statics.field384 - var345) / 1000 + Statics.field1792;
                                                    if (Statics.field384 < var345) {
                                                        Statics.field384 = var345;
                                                    }
                                                }
                                                int var347 = var346 - Statics.field1018;
                                                if (var347 > 1024) {
                                                    var347 -= 2048;
                                                }
                                                if (var347 < -1024) {
                                                    var347 += 2048;
                                                }
                                                if (var347 > 0) {
                                                    Statics.field1018 += Statics.field1170 * var347 / 1000 + Statics.field1792;
                                                    Statics.field1018 &= 0x7FF;
                                                }
                                                if (var347 < 0) {
                                                    Statics.field1018 -= Statics.field1170 * -var347 / 1000 + Statics.field1792;
                                                    Statics.field1018 &= 0x7FF;
                                                }
                                                int var348 = var346 - Statics.field1018;
                                                if (var348 > 1024) {
                                                    var348 -= 2048;
                                                }
                                                if (var348 < -1024) {
                                                    var348 += 2048;
                                                }
                                                if (var348 < 0 && var347 > 0 || var348 > 0 && var347 < 0) {
                                                    Statics.field1018 = var346;
                                                }
                                            }
                                            for (int var349 = 0; var349 < 5; var349++) {
                                                var10002 = field479[var349]++;
                                            }
                                            int var350 = ++class77.field1374 - 1;
                                            int var352 = class75.method99();
                                            if (var350 > 15000 && var352 > 15000) {
                                                field593 = 250;
                                                class77.method2199(14500);
                                                field602.method2306(82);
                                            }
                                            field716++;
                                            if (field716 > 500) {
                                                field716 = 0;
                                                int var353 = (int) (Math.random() * 8.0D);
                                                if ((var353 & 0x1) == 1) {
                                                    field532 += field718;
                                                }
                                                if ((var353 & 0x2) == 2) {
                                                    field534 += field535;
                                                }
                                                if ((var353 & 0x4) == 4) {
                                                    field536 += field516;
                                                }
                                            }
                                            if (field532 < -50) {
                                                field718 = 2;
                                            }
                                            if (field532 > 50) {
                                                field718 = -2;
                                            }
                                            if (field534 < -55) {
                                                field535 = 2;
                                            }
                                            if (field534 > 55) {
                                                field535 = -2;
                                            }
                                            if (field536 < -40) {
                                                field516 = 1;
                                            }
                                            if (field536 > 40) {
                                                field516 = -1;
                                            }
                                            field543++;
                                            if (field543 > 500) {
                                                field543 = 0;
                                                int var354 = (int) (Math.random() * 8.0D);
                                                if ((var354 & 0x1) == 1) {
                                                    field675 += field540;
                                                }
                                                if ((var354 & 0x2) == 2) {
                                                    field730 += field588;
                                                }
                                            }
                                            if (field675 < -60) {
                                                field540 = 2;
                                            }
                                            if (field675 > 60) {
                                                field540 = -2;
                                            }
                                            if (field730 < -20) {
                                                field588 = 1;
                                            }
                                            if (field730 > 10) {
                                                field588 = -1;
                                            }
                                            for (class28 var355 = (class28) field483.method3281(); var355 != null; var355 = (class28) field483.method3283()) {
                                                if ((long) var355.field734 < class121.method2221() / 1000L - 5L) {
                                                    if (var355.field739 > 0) {
                                                        method35(5, "", var355.field733 + class135.field2179);
                                                    }
                                                    if (var355.field739 == 0) {
                                                        method35(5, "", var355.field733 + class135.field2236);
                                                    }
                                                    var355.method3333();
                                                }
                                            }
                                            field533++;
                                            if (field533 > 50) {
                                                field602.method2306(131);
                                            }
                                            try {
                                                if (Statics.field508 != null && field602.field2027 > 0) {
                                                    Statics.field508.method1362(field602.field2026, 0, field602.field2027);
                                                    field602.field2027 = 0;
                                                    field533 = 0;
                                                }
                                            } catch (IOException var357) {
                                                method222();
                                            }
                                            return;
                                        }
                                        var301 = var300.field7;
                                        if (var301.field2609 < 0) {
                                            break;
                                        }
                                        var302 = class159.method2352(var301.field2619);
                                    } while (var302 == null || var302.field2694 == null || var301.field2609 >= var302.field2694.length || var302.field2694[var301.field2609] != var301);
                                    class26.method1(var300);
                                }
                            }
                            var298 = var297.field7;
                            if (var298.field2609 < 0) {
                                break;
                            }
                            var299 = class159.method2352(var298.field2619);
                        } while (var299 == null || var299.field2694 == null || var298.field2609 >= var299.field2694.length || var299.field2694[var298.field2609] != var298);
                        class26.method1(var297);
                    }
                }
                var295 = var294.field7;
                if (var295.field2609 < 0) {
                    break;
                }
                var296 = class159.method2352(var295.field2619);
            } while (var296 == null || var296.field2694 == null || var295.field2609 >= var296.field2694.length || var296.field2694[var295.field2609] != var295);
            class26.method1(var294);
        }
    }

    @ObfuscatedName("co.c(B)V")
    public static final void method2021() {
        if (Statics.field1421 != null) {
            Statics.field1421.method1133();
        }
        if (Statics.field210 != null) {
            Statics.field210.method1133();
        }
    }

    @ObfuscatedName("bz.i(Lab;IIII)V")
    public static void method1550(class34 arg0, int arg1, int arg2, int arg3) {
        if (field549 >= 50 || field707 == 0 || arg0.field870 == null || arg1 >= arg0.field870.length) {
            return;
        }
        int var4 = arg0.field870[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field709[field549] = var5;
        field580[field549] = var6;
        field711[field549] = 0;
        field713[field549] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field712[field549] = (var8 << 16) + (var9 << 8) + var7;
        field549++;
    }

    @ObfuscatedName("ek.u(II)V")
    public static void method2698(int arg0) {
        if (arg0 == -1 && !field705) {
            Statics.field2353.method2744();
            class139.field2354 = 1;
            Statics.field2586 = null;
        } else if (arg0 != -1 && field704 != arg0 && field703 != 0 && !field705) {
            class139.method2296(2, Statics.field1164, arg0, 0, field703, false);
        }
        field704 = arg0;
    }

    @ObfuscatedName("co.at(I)V")
    public static final void method2019() {
        for (int var0 = -1; var0 < field589; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field590[var0];
            }
            class3 var2 = field511[var1];
            if (var2 != null && var2.field455 > 0) {
                var2.field455--;
                if (var2.field455 == 0) {
                    var2.field420 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field506; var3++) {
            int var4 = field507[var3];
            class25 var5 = field505[var4];
            if (var5 != null && var5.field455 > 0) {
                var5.field455--;
                if (var5.field455 == 0) {
                    var5.field420 = null;
                }
            }
        }
    }

    @ObfuscatedName("bt.as(B)V")
    public static final void method1323() {
        for (int var0 = -1; var0 < field589; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field590[var0];
            }
            class3 var2 = field511[var1];
            if (var2 != null) {
                method1535(var2, 1);
            }
        }
    }

    @ObfuscatedName("bp.ax(B)V")
    public static final void method1354() {
        for (int var0 = 0; var0 < field506; var0++) {
            int var1 = field507[var0];
            class25 var2 = field505[var1];
            if (var2 != null) {
                method1535(var2, var2.field389.field769);
            }
        }
    }

    @ObfuscatedName("bz.ao(Lat;IS)V")
    public static final void method1535(class27 arg0, int arg1) {
        if (arg0.field451 > field477) {
            method116(arg0);
        } else if (arg0.field452 >= field477) {
            if (field477 == arg0.field452 || arg0.field437 == -1 || arg0.field440 != 0 || arg0.field439 + 1 > class34.method215(arg0.field437).field869[arg0.field438]) {
                int var2 = arg0.field452 - arg0.field451;
                int var3 = field477 - arg0.field451;
                int var4 = arg0.field447 * 128 + arg0.field411 * 64;
                int var5 = arg0.field417 * 128 + arg0.field411 * 64;
                int var6 = arg0.field446 * 128 + arg0.field411 * 64;
                int var7 = arg0.field449 * 128 + arg0.field411 * 64;
                arg0.field443 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field408 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field430 = 0;
            if (arg0.field421 == 0) {
                arg0.field456 = 1024;
            }
            if (arg0.field421 == 1) {
                arg0.field456 = 1536;
            }
            if (arg0.field421 == 2) {
                arg0.field456 = 0;
            }
            if (arg0.field421 == 3) {
                arg0.field456 = 512;
            }
            arg0.field453 = arg0.field456;
        } else {
            method2328(arg0);
        }
        if (arg0.field443 < 128 || arg0.field408 < 128 || arg0.field443 >= 13184 || arg0.field408 >= 13184) {
            arg0.field437 = -1;
            arg0.field414 = -1;
            arg0.field451 = 0;
            arg0.field452 = 0;
            arg0.field443 = arg0.field460[0] * 128 + arg0.field411 * 64;
            arg0.field408 = arg0.field461[0] * 128 + arg0.field411 * 64;
            arg0.method240();
        }
        if (Statics.field52 == arg0 && (arg0.field443 < 1536 || arg0.field408 < 1536 || arg0.field443 >= 11776 || arg0.field408 >= 11776)) {
            arg0.field437 = -1;
            arg0.field414 = -1;
            arg0.field451 = 0;
            arg0.field452 = 0;
            arg0.field443 = arg0.field460[0] * 128 + arg0.field411 * 64;
            arg0.field408 = arg0.field461[0] * 128 + arg0.field411 * 64;
            arg0.method240();
        }
        if (arg0.field458 != 0) {
            if (arg0.field431 != -1 && arg0.field431 < 32768) {
                class25 var8 = field505[arg0.field431];
                if (var8 != null) {
                    int var9 = arg0.field443 - var8.field443;
                    int var10 = arg0.field408 - var8.field408;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field456 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field431 >= 32768) {
                int var11 = arg0.field431 - 32768;
                if (field723 == var11) {
                    var11 = 2047;
                }
                class3 var12 = field511[var11];
                if (var12 != null) {
                    int var13 = arg0.field443 - var12.field443;
                    int var14 = arg0.field408 - var12.field408;
                    if (var13 != 0 || var14 != 0) {
                        arg0.field456 = (int) (Math.atan2((double) var13, (double) var14) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field432 != 0 || arg0.field433 != 0) && (arg0.field459 == 0 || arg0.field430 > 0)) {
                int var15 = arg0.field443 - (arg0.field432 * 64 - Statics.field56 * 64 - Statics.field56 * 64);
                int var16 = arg0.field408 - (arg0.field433 * 64 - Statics.field932 * 64 - Statics.field932 * 64);
                if (var15 != 0 || var16 != 0) {
                    arg0.field456 = (int) (Math.atan2((double) var15, (double) var16) * 325.949D) & 0x7FF;
                }
                arg0.field432 = 0;
                arg0.field433 = 0;
            }
            int var17 = arg0.field456 - arg0.field453 & 0x7FF;
            if (var17 == 0) {
                arg0.field457 = 0;
            } else {
                arg0.field457++;
                if (var17 > 1024) {
                    arg0.field453 -= arg0.field458;
                    boolean var18 = true;
                    if (var17 < arg0.field458 || var17 > 2048 - arg0.field458) {
                        arg0.field453 = arg0.field456;
                        var18 = false;
                    }
                    if (arg0.field448 == arg0.field444 && (arg0.field457 > 25 || var18)) {
                        if (arg0.field434 == -1) {
                            arg0.field448 = arg0.field415;
                        } else {
                            arg0.field448 = arg0.field434;
                        }
                    }
                } else {
                    arg0.field453 += arg0.field458;
                    boolean var19 = true;
                    if (var17 < arg0.field458 || var17 > 2048 - arg0.field458) {
                        arg0.field453 = arg0.field456;
                        var19 = false;
                    }
                    if (arg0.field448 == arg0.field444 && (arg0.field457 > 25 || var19)) {
                        if (arg0.field409 == -1) {
                            arg0.field448 = arg0.field415;
                        } else {
                            arg0.field448 = arg0.field409;
                        }
                    }
                }
                arg0.field453 &= 0x7FF;
            }
        }
        arg0.field410 = false;
        if (arg0.field448 != -1) {
            class34 var21 = class34.method215(arg0.field448);
            if (var21 == null || var21.field867 == null) {
                arg0.field448 = -1;
            } else {
                arg0.field436++;
                if (arg0.field435 < var21.field867.length && arg0.field436 > var21.field869[arg0.field435]) {
                    arg0.field436 = 1;
                    arg0.field435++;
                    method1550(var21, arg0.field435, arg0.field443, arg0.field408);
                }
                if (arg0.field435 >= var21.field867.length) {
                    arg0.field436 = 0;
                    arg0.field435 = 0;
                    method1550(var21, arg0.field435, arg0.field443, arg0.field408);
                }
            }
        }
        if (arg0.field414 != -1 && field477 >= arg0.field445) {
            if (arg0.field416 < 0) {
                arg0.field416 = 0;
            }
            int var22 = class35.method2850(arg0.field414).field887;
            if (var22 == -1) {
                arg0.field414 = -1;
            } else {
                class34 var23 = class34.method215(var22);
                if (var23 == null || var23.field867 == null) {
                    arg0.field414 = -1;
                } else {
                    arg0.field450++;
                    if (arg0.field416 < var23.field867.length && arg0.field450 > var23.field869[arg0.field416]) {
                        arg0.field450 = 1;
                        arg0.field416++;
                        method1550(var23, arg0.field416, arg0.field443, arg0.field408);
                    }
                    if (arg0.field416 >= var23.field867.length && (arg0.field416 < 0 || arg0.field416 >= var23.field867.length)) {
                        arg0.field414 = -1;
                    }
                }
            }
        }
        if (arg0.field437 != -1 && arg0.field440 <= 1) {
            class34 var24 = class34.method215(arg0.field437);
            if (var24.field878 == 1 && arg0.field464 > 0 && arg0.field451 <= field477 && arg0.field452 < field477) {
                arg0.field440 = 1;
                return;
            }
        }
        if (arg0.field437 != -1 && arg0.field440 == 0) {
            class34 var25 = class34.method215(arg0.field437);
            if (var25 == null || var25.field867 == null) {
                arg0.field437 = -1;
            } else {
                arg0.field439++;
                if (arg0.field438 < var25.field867.length && arg0.field439 > var25.field869[arg0.field438]) {
                    arg0.field439 = 1;
                    arg0.field438++;
                    method1550(var25, arg0.field438, arg0.field443, arg0.field408);
                }
                if (arg0.field438 >= var25.field867.length) {
                    arg0.field438 -= var25.field874;
                    arg0.field441++;
                    if (arg0.field441 >= var25.field877) {
                        arg0.field437 = -1;
                    } else if (arg0.field438 >= 0 && arg0.field438 < var25.field867.length) {
                        method1550(var25, arg0.field438, arg0.field443, arg0.field408);
                    } else {
                        arg0.field437 = -1;
                    }
                }
                arg0.field410 = var25.field879;
            }
        }
        if (arg0.field440 > 0) {
            arg0.field440--;
        }
    }

    @ObfuscatedName("z.aq(Lat;I)V")
    public static final void method116(class27 arg0) {
        int var1 = arg0.field451 - field477;
        int var2 = arg0.field447 * 128 + arg0.field411 * 64;
        int var3 = arg0.field417 * 128 + arg0.field411 * 64;
        arg0.field443 += (var2 - arg0.field443) / var1;
        arg0.field408 += (var3 - arg0.field408) / var1;
        arg0.field430 = 0;
        if (arg0.field421 == 0) {
            arg0.field456 = 1024;
        }
        if (arg0.field421 == 1) {
            arg0.field456 = 1536;
        }
        if (arg0.field421 == 2) {
            arg0.field456 = 0;
        }
        if (arg0.field421 == 3) {
            arg0.field456 = 512;
        }
    }

    @ObfuscatedName("ds.am(Lat;I)V")
    public static final void method2328(class27 arg0) {
        arg0.field448 = arg0.field444;
        if (arg0.field459 == 0) {
            arg0.field430 = 0;
            return;
        }
        if (arg0.field437 != -1 && arg0.field440 == 0) {
            class34 var1 = class34.method215(arg0.field437);
            if (arg0.field464 > 0 && var1.field878 == 0) {
                arg0.field430++;
                return;
            }
            if (arg0.field464 <= 0 && var1.field865 == 0) {
                arg0.field430++;
                return;
            }
        }
        int var2 = arg0.field443;
        int var3 = arg0.field408;
        int var4 = arg0.field460[arg0.field459 - 1] * 128 + arg0.field411 * 64;
        int var5 = arg0.field461[arg0.field459 - 1] * 128 + arg0.field411 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field443 = var4;
            arg0.field408 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field456 = 1280;
            } else if (var3 > var5) {
                arg0.field456 = 1792;
            } else {
                arg0.field456 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field456 = 768;
            } else if (var3 > var5) {
                arg0.field456 = 256;
            } else {
                arg0.field456 = 512;
            }
        } else if (var3 < var5) {
            arg0.field456 = 1024;
        } else if (var3 > var5) {
            arg0.field456 = 0;
        }
        int var6 = arg0.field456 - arg0.field453 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field413;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field415;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field418;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field422;
        }
        if (var7 == -1) {
            var7 = arg0.field415;
        }
        arg0.field448 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field389.field772;
        }
        if (var9) {
            if (arg0.field456 != arg0.field453 && arg0.field431 == -1 && arg0.field458 != 0) {
                var8 = 2;
            }
            if (arg0.field459 > 2) {
                var8 = 6;
            }
            if (arg0.field459 > 3) {
                var8 = 8;
            }
            if (arg0.field430 > 0 && arg0.field459 > 1) {
                var8 = 8;
                arg0.field430--;
            }
        } else {
            if (arg0.field459 > 1) {
                var8 = 6;
            }
            if (arg0.field459 > 2) {
                var8 = 8;
            }
            if (arg0.field430 > 0 && arg0.field459 > 1) {
                var8 = 8;
                arg0.field430--;
            }
        }
        if (arg0.field462[arg0.field459 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field448 == arg0.field415 && arg0.field419 != -1) {
            arg0.field448 = arg0.field419;
        }
        if (var2 < var4) {
            arg0.field443 += var8;
            if (arg0.field443 > var4) {
                arg0.field443 = var4;
            }
        } else if (var2 > var4) {
            arg0.field443 -= var8;
            if (arg0.field443 < var4) {
                arg0.field443 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field408 += var8;
            if (arg0.field408 > var5) {
                arg0.field408 = var5;
            }
        } else if (var3 > var5) {
            arg0.field408 -= var8;
            if (arg0.field408 < var5) {
                arg0.field408 = var5;
            }
        }
        if (arg0.field443 == var4 && arg0.field408 == var5) {
            arg0.field459--;
            if (arg0.field464 > 0) {
                arg0.field464--;
            }
        }
    }

    @ObfuscatedName("at.al(Lg;IIB)V")
    public static void method261(class3 arg0, int arg1, int arg2) {
        if (arg0.field437 == arg1 && arg1 != -1) {
            int var3 = class34.method215(arg1).field880;
            if (var3 == 1) {
                arg0.field438 = 0;
                arg0.field439 = 0;
                arg0.field440 = arg2;
                arg0.field441 = 0;
            }
            if (var3 == 2) {
                arg0.field441 = 0;
            }
        } else if (arg1 == -1 || arg0.field437 == -1 || class34.method215(arg1).field873 >= class34.method215(arg0.field437).field873) {
            arg0.field437 = arg1;
            arg0.field438 = 0;
            arg0.field439 = 0;
            arg0.field440 = arg2;
            arg0.field441 = 0;
            arg0.field464 = arg0.field459;
        }
    }

    @ObfuscatedName("al.ab(Ljava/lang/String;ZI)V")
    public static final void method689(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field335.method3400(arg0, 250);
        int var6 = Statics.field335.method3372(arg0, 250) * 13;
        class89.method1807(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1784(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field335.method3430(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2177(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field194.getGraphics();
                Statics.field181.method1616(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field194.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field468; var13++) {
            if (field676[var13] + field611[var13] > var9 && field611[var13] < var9 + var11 && field677[var13] + field606[var13] > var10 && field606[var13] < var10 + var12) {
                field558[var13] = true;
            }
        }
    }

    @ObfuscatedName("u.aw(ZB)V")
    public static final void method232(boolean arg0) {
        if (Statics.field52.field443 >> 7 == field700 && Statics.field52.field408 >> 7 == field666) {
            field700 = 0;
        }
        int var1 = field589;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field52;
                var4 = 33538048;
            } else {
                var3 = field511[field590[var2]];
                var4 = field590[var2] << 14;
            }
            if (var3 != null && var3.method16()) {
                var3.field38 = false;
                if ((field473 && field589 > 50 || field589 > 200) && !arg0 && var3.field448 == var3.field444) {
                    var3.field38 = true;
                }
                int var5 = var3.field443 >> 7;
                int var6 = var3.field408 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field43 == null || field477 < var3.field42 || field477 >= var3.field40) {
                        if ((var3.field443 & 0x7F) == 64 && (var3.field408 & 0x7F) == 64) {
                            if (field636 == field571[var5][var6]) {
                                continue;
                            }
                            field571[var5][var6] = field636;
                        }
                        var3.field37 = method121(var3.field443, var3.field408, Statics.field263);
                        Statics.field1423.method1850(Statics.field263, var3.field443, var3.field408, var3.field37, 60, var3, var3.field453, var4, var3.field410);
                    } else {
                        var3.field38 = false;
                        var3.field37 = method121(var3.field443, var3.field408, Statics.field263);
                        Statics.field1423.method1960(Statics.field263, var3.field443, var3.field408, var3.field37, 60, var3, var3.field453, var4, var3.field44, var3.field39, var3.field46, var3.field47);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.ah(ZI)V")
    public static final void method52(boolean arg0) {
        for (int var1 = 0; var1 < field506; var1++) {
            class25 var2 = field505[field507[var1]];
            int var3 = (field507[var1] << 14) + 536870912;
            if (var2 != null && var2.method16() && var2.field389.field788 == arg0 && var2.field389.method614()) {
                int var4 = var2.field443 >> 7;
                int var5 = var2.field408 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field411 == 1 && (var2.field443 & 0x7F) == 64 && (var2.field408 & 0x7F) == 64) {
                        if (field636 == field571[var4][var5]) {
                            continue;
                        }
                        field571[var4][var5] = field636;
                    }
                    if (!var2.field389.field796) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1423.method1850(Statics.field263, var2.field443, var2.field408, method121(var2.field443 + (var2.field411 * 64 - 64), var2.field408 + (var2.field411 * 64 - 64), Statics.field263), var2.field411 * 64 - 64 + 60, var2, var2.field453, var3, var2.field410);
                }
            }
        }
    }

    @ObfuscatedName("a.aa(I)V")
    public static final void method33() {
        for (class10 var0 = (class10) field604.method3314(); var0 != null; var0 = (class10) field604.method3325()) {
            if (Statics.field263 != var0.field152 || field477 > var0.field158) {
                var0.method3341();
            } else if (field477 >= var0.field171) {
                if (var0.field151 > 0) {
                    class25 var1 = field505[var0.field151 - 1];
                    if (var1 != null && var1.field443 >= 0 && var1.field443 < 13312 && var1.field408 >= 0 && var1.field408 < 13312) {
                        var0.method97(var1.field443, var1.field408, method121(var1.field443, var1.field408, var0.field152) - var0.field156, field477);
                    }
                }
                if (var0.field151 < 0) {
                    int var2 = -var0.field151 - 1;
                    class3 var3;
                    if (field723 == var2) {
                        var3 = Statics.field52;
                    } else {
                        var3 = field511[var2];
                    }
                    if (var3 != null && var3.field443 >= 0 && var3.field443 < 13312 && var3.field408 >= 0 && var3.field408 < 13312) {
                        var0.method97(var3.field443, var3.field408, method121(var3.field443, var3.field408, var0.field152) - var0.field156, field477);
                    }
                }
                var0.method95(field621);
                Statics.field1423.method1850(Statics.field263, (int) var0.field172, (int) var0.field164, (int) var0.field165, 60, var0, var0.field168, -1, false);
            }
        }
    }

    @ObfuscatedName("ch.ay(I)V")
    public static final void method1565() {
        for (class20 var0 = (class20) field570.method3314(); var0 != null; var0 = (class20) field570.method3325()) {
            if (Statics.field263 != var0.field282 || var0.field290) {
                var0.method3341();
            } else if (field477 >= var0.field281) {
                var0.method162(field621);
                if (var0.field290) {
                    var0.method3341();
                } else {
                    Statics.field1423.method1850(var0.field282, var0.field284, var0.field301, var0.field286, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("n.ak(I)I")
    public static final int method117() {
        if (Statics.field60.field193) {
            return Statics.field263;
        }
        int var0 = 3;
        if (Statics.field384 < 310) {
            int var1 = Statics.field28 >> 7;
            int var2 = Statics.field2031 >> 7;
            int var3 = Statics.field52.field443 >> 7;
            int var4 = Statics.field52.field408 >> 7;
            if ((class9.field148[Statics.field263][var1][var2] & 0x4) != 0) {
                var0 = Statics.field263;
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
                    if ((class9.field148[Statics.field263][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field263;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field148[Statics.field263][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field263;
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
                    if ((class9.field148[Statics.field263][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field263;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field148[Statics.field263][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field263;
                        }
                    }
                }
            }
        }
        if ((class9.field148[Statics.field263][Statics.field52.field443 >> 7][Statics.field52.field408 >> 7] & 0x4) != 0) {
            var0 = Statics.field263;
        }
        return var0;
    }

    @ObfuscatedName("g.az(IIB)V")
    public static final void method20(int arg0, int arg1) {
        if (field485 == 2) {
            method2301((field488 - Statics.field56 << 7) + field491, (field489 - Statics.field932 << 7) + field492, field490 * 2);
            if (field573 > -1 && field477 % 20 < 10) {
                Statics.field289[0].method1677(field573 + arg0 - 12, field574 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cr.ap(IIIII)V")
    public static final void method1594(int arg0, int arg1, int arg2, int arg3) {
        field561 = 0;
        for (int var4 = -1; var4 < field589 + field506; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field52;
            } else if (var4 < field589) {
                var5 = field511[field590[var4]];
            } else {
                var5 = field505[field507[var4 - field589]];
            }
            if (var5 != null && var5.method16()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field389;
                    if (var6.field793 != null) {
                        var6 = var6.method630();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field589) {
                    class31 var9 = ((class25) var5).field389;
                    if (var9.field793 != null) {
                        var9 = var9.method630();
                    }
                    if (var9.field795 >= 0 && var9.field795 < Statics.field1389.length) {
                        method26(var5, var5.field412 + 15);
                        if (field573 > -1) {
                            Statics.field1389[var9.field795].method1677(field573 + arg0 - 12, field574 + arg1 - 30);
                        }
                    }
                    if (field485 == 1 && field541 == field507[var4 - field589] && field477 % 20 < 10) {
                        method26(var5, var5.field412 + 15);
                        if (field573 > -1) {
                            Statics.field289[0].method1677(field573 + arg0 - 12, field574 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field45 != -1 || var8.field34 != -1) {
                        method26(var5, var5.field412 + 15);
                        if (field573 > -1) {
                            if (var8.field45 != -1) {
                                Statics.field1909[var8.field45].method1677(field573 + arg0 - 12, field574 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field34 != -1) {
                                Statics.field1389[var8.field34].method1677(field573 + arg0 - 12, field574 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field485 == 10 && field487 == field590[var4]) {
                        method26(var5, var5.field412 + 15);
                        if (field573 > -1) {
                            Statics.field289[1].method1677(field573 + arg0 - 12, field574 + arg1 - var7);
                        }
                    }
                }
                if (var5.field420 != null && (var4 >= field589 || field685 == 0 || field685 == 3 || field685 == 1 && method544(((class3) var5).field32))) {
                    method26(var5, var5.field412);
                    if (field573 > -1 && field561 < field551) {
                        field672[field561] = Statics.field1840.method3370(var5.field420) / 2;
                        field565[field561] = Statics.field1840.field2832;
                        field563[field561] = field573;
                        field564[field561] = field574;
                        field567[field561] = var5.field463;
                        field625[field561] = var5.field423;
                        field569[field561] = var5.field455;
                        field525[field561] = var5.field420;
                        field561++;
                    }
                }
                if (var5.field428 > field477) {
                    method26(var5, var5.field412 + 15);
                    if (field573 > -1) {
                        int var10 = var5.field429 * 30 / var5.field407;
                        if (var10 > 30) {
                            var10 = 30;
                        } else if (var10 == 0 && var5.field429 > 0) {
                            var10 = 1;
                        }
                        class89.method1807(field573 + arg0 - 15, field574 + arg1 - 3, var10, 5, 65280);
                        class89.method1807(field573 + arg0 - 15 + var10, field574 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field426[var11] > field477) {
                        method26(var5, var5.field412 / 2);
                        if (field573 > -1) {
                            if (var11 == 1) {
                                field574 -= 20;
                            }
                            if (var11 == 2) {
                                field573 -= 15;
                                field574 -= 10;
                            }
                            if (var11 == 3) {
                                field573 += 15;
                                field574 -= 10;
                            }
                            Statics.field2587[var5.field442[var11]].method1677(field573 + arg0 - 12, field574 + arg1 - 12);
                            Statics.field958.method3375(Integer.toString(var5.field425[var11]), field573 + arg0 - 1, field574 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field561; var12++) {
            int var13 = field563[var12];
            int var14 = field564[var12];
            int var15 = field672[var12];
            int var16 = field565[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field564[var18] - field565[var18] && var14 - var16 < field564[var18] + 2 && var13 - var15 < field672[var18] + field563[var18] && var13 + var15 > field563[var18] - field672[var18] && field564[var18] - field565[var18] < var14) {
                        var14 = field564[var18] - field565[var18];
                        var17 = true;
                    }
                }
            }
            field573 = field563[var12];
            field574 = field564[var12] = var14;
            String var19 = field525[var12];
            if (field630 == 0) {
                int var20 = 16776960;
                if (field567[var12] < 6) {
                    var20 = field605[field567[var12]];
                }
                if (field567[var12] == 6) {
                    var20 = field636 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field567[var12] == 7) {
                    var20 = field636 % 20 < 10 ? 255 : 65535;
                }
                if (field567[var12] == 8) {
                    var20 = field636 % 20 < 10 ? 45056 : 8454016;
                }
                if (field567[var12] == 9) {
                    int var21 = 150 - field569[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field567[var12] == 10) {
                    int var22 = 150 - field569[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field567[var12] == 11) {
                    int var23 = 150 - field569[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field625[var12] == 0) {
                    Statics.field1840.method3375(var19, field573 + arg0, field574 + arg1, var20, 0);
                }
                if (field625[var12] == 1) {
                    Statics.field1840.method3377(var19, field573 + arg0, field574 + arg1, var20, 0, field636);
                }
                if (field625[var12] == 2) {
                    Statics.field1840.method3413(var19, field573 + arg0, field574 + arg1, var20, 0, field636);
                }
                if (field625[var12] == 3) {
                    Statics.field1840.method3379(var19, field573 + arg0, field574 + arg1, var20, 0, field636, 150 - field569[var12]);
                }
                if (field625[var12] == 4) {
                    int var24 = (150 - field569[var12]) * (Statics.field1840.method3370(var19) + 100) / 150;
                    class89.method1771(field573 + arg0 - 50, arg1, field573 + arg0 + 50, arg1 + arg3);
                    Statics.field1840.method3373(var19, field573 + arg0 + 50 - var24, field574 + arg1, var20, 0);
                    class89.method1793(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field625[var12] == 5) {
                    int var25 = 150 - field569[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1771(arg0, field574 + arg1 - Statics.field1840.field2832 - 1, arg0 + arg2, field574 + arg1 + 5);
                    Statics.field1840.method3375(var19, field573 + arg0, field574 + arg1 + var26, var20, 0);
                    class89.method1793(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1840.method3375(var19, field573 + arg0, field574 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("by.af(IIIII)V")
    public static final void method1524(int arg0, int arg1, int arg2, int arg3) {
        if (field578 == 1) {
            Statics.field1808[field577 / 100].method1677(field661 - 8, field576 - 8);
        }
        if (field578 == 2) {
            Statics.field1808[field577 / 100 + 4].method1677(field661 - 8, field576 - 8);
        }
        field587 = 0;
        int var4 = (Statics.field52.field443 >> 7) + Statics.field56;
        int var5 = (Statics.field52.field408 >> 7) + Statics.field932;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field587 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field587 = 1;
        }
        if (field587 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field587 = 0;
        }
        if (!field501) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field335.method3366("Fps:" + field1314, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field473) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field473) {
            var10 = 16711680;
        }
        Statics.field335.method3366("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("a.au(Lat;II)V")
    public static final void method26(class27 arg0, int arg1) {
        method2301(arg0.field443, arg0.field408, arg1);
    }

    @ObfuscatedName("dy.an(IIII)V")
    public static final void method2301(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field573 = -1;
            field574 = -1;
            return;
        }
        int var3 = method121(arg0, arg1, Statics.field263) - arg2;
        int var4 = arg0 - Statics.field28;
        int var5 = var3 - Statics.field1249;
        int var6 = arg1 - Statics.field2031;
        int var7 = class104.field1769[Statics.field384];
        int var8 = class104.field1750[Statics.field384];
        int var9 = class104.field1769[Statics.field1018];
        int var10 = class104.field1750[Statics.field1018];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field573 = (var11 << 9) / var15 + 256;
            field574 = (var14 << 9) / var15 + 167;
        } else {
            field573 = -1;
            field574 = -1;
        }
    }

    @ObfuscatedName("t.av(IIII)I")
    public static final int method121(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field148[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field130[var5][var3][var4] + class9.field130[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field130[var5][var3][var4 + 1] + class9.field130[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("eo.ac(IIIIIII)V")
    public static final void method3069(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1769[var6];
            int var12 = class104.field1750[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1769[var7];
            int var15 = class104.field1750[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field28 = arg0 - var8;
        Statics.field1249 = arg1 - var9;
        Statics.field2031 = arg2 - var10;
        Statics.field384 = arg3;
        Statics.field1018 = arg4;
    }

    @ObfuscatedName("n.ae(ZB)V")
    public static final void method118(boolean arg0) {
        field529 = arg0;
        if (!field529) {
            int var1 = field498.method2467();
            int var2 = field498.method2572();
            int var3 = field498.method2469();
            int var4 = field498.method2577();
            int var5 = (field512 - field498.field2027) / 16;
            Statics.field264 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var7 = 0; var7 < 4; var7++) {
                    Statics.field264[var6][var7] = field498.method2477();
                }
            }
            int var8 = field498.method2572();
            Statics.field184 = new int[var5];
            Statics.field527 = new int[var5];
            Statics.field385 = new int[var5];
            Statics.field351 = new byte[var5][];
            Statics.field134 = new byte[var5][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field184[var10] = var13;
                        Statics.field527[var10] = Statics.field609.method3011("m" + var11 + "_" + var12);
                        Statics.field385[var10] = Statics.field609.method3011("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method687(var1, var8, var4, var3, var2);
            return;
        }
        int var14 = field498.method2613();
        field498.method2315();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field498.method2309(1);
                    if (var18 == 1) {
                        field530[var15][var16][var17] = field498.method2309(26);
                    } else {
                        field530[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field498.method2310();
        int var19 = (field512 - field498.field2027) / 16;
        Statics.field264 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field264[var20][var21] = field498.method2439();
            }
        }
        int var22 = field498.method2467();
        int var23 = field498.method2572();
        int var24 = field498.method2467();
        int var25 = field498.method2460();
        Statics.field184 = new int[var19];
        Statics.field527 = new int[var19];
        Statics.field385 = new int[var19];
        Statics.field351 = new byte[var19][];
        Statics.field134 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field530[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field184[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field184[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field527[var26] = Statics.field609.method3011("m" + var35 + "_" + var36);
                            Statics.field385[var26] = Statics.field609.method3011("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method687(var24, var22, var25, var23, var14);
    }

    @ObfuscatedName("al.ai(IIIIIB)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field554 == arg0 && Statics.field404 == arg1 && field521 == arg2 || !field473) {
            return;
        }
        Statics.field554 = arg0;
        Statics.field404 = arg1;
        field521 = arg2;
        if (!field473) {
            field521 = 0;
        }
        method3172(25);
        method689(class135.field2104, true);
        int var5 = Statics.field56;
        int var6 = Statics.field932;
        Statics.field56 = (arg0 - 6) * 8;
        Statics.field932 = (arg1 - 6) * 8;
        int var7 = Statics.field56 - var5;
        int var8 = Statics.field932 - var6;
        int var9 = Statics.field56;
        int var10 = Statics.field932;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field505[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field460[var13] -= var7;
                    var12.field461[var13] -= var8;
                }
                var12.field443 -= var7 * 128;
                var12.field408 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field511[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field460[var16] -= var7;
                    var15.field461[var16] -= var8;
                }
                var15.field443 -= var7 * 128;
                var15.field408 -= var8 * 128;
            }
        }
        Statics.field263 = arg2;
        Statics.field52.method245(arg3, arg4, false);
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
                        field656[var27][var23][var24] = field656[var27][var25][var26];
                    } else {
                        field656[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field603.method3314(); var28 != null; var28 = (class22) field603.method3325()) {
            var28.field339 -= var7;
            var28.field345 -= var8;
            if (var28.field339 < 0 || var28.field345 < 0 || var28.field339 >= 104 || var28.field345 >= 104) {
                var28.method3341();
            }
        }
        if (field700 != 0) {
            field700 -= var7;
            field666 -= var8;
        }
        field549 = 0;
        field644 = false;
        field548 = -1;
        field570.method3308();
        field604.method3308();
    }

    @ObfuscatedName("bs.ag(ZI)V")
    public static final void method1463(boolean arg0) {
        method2021();
        field533++;
        if (field533 < 50 && !arg0) {
            return;
        }
        field533 = 0;
        if (field520 || Statics.field508 == null) {
            return;
        }
        field602.method2306(131);
        try {
            Statics.field508.method1362(field602.field2026, 0, field602.field2027);
            field602.field2027 = 0;
        } catch (IOException var2) {
            field520 = true;
        }
    }

    @ObfuscatedName("dw.aj(I)V")
    public static final void method2339() {
        method1463(false);
        field522 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field351.length; var1++) {
            if (Statics.field527[var1] != -1 && Statics.field351[var1] == null) {
                Statics.field351[var1] = Statics.field609.method3026(Statics.field527[var1], 0);
                if (Statics.field351[var1] == null) {
                    var0 = false;
                    field522++;
                }
            }
            if (Statics.field385[var1] != -1 && Statics.field134[var1] == null) {
                Statics.field134[var1] = Statics.field609.method2997(Statics.field385[var1], 0, Statics.field264[var1]);
                if (Statics.field134[var1] == null) {
                    var0 = false;
                    field522++;
                }
            }
        }
        if (!var0) {
            field526 = 1;
            return;
        }
        field674 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field351.length; var3++) {
            byte[] var4 = Statics.field134[var3];
            if (var4 != null) {
                int var5 = (Statics.field184[var3] >> 8) * 64 - Statics.field56;
                int var6 = (Statics.field184[var3] & 0xFF) * 64 - Statics.field932;
                if (field529) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method34(var4, var5, var6);
            }
        }
        if (!var2) {
            field526 = 2;
            return;
        }
        if (field526 != 0) {
            method689(class135.field2104 + class2.field26 + class2.field21 + 100 + "%" + class2.field24, true);
        }
        method2021();
        method2197();
        method2021();
        Statics.field1423.method1894();
        method2021();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field528[var7].method2671();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field148[var8][var9][var10] = 0;
                }
            }
        }
        method2021();
        class9.field129 = 99;
        Statics.field128 = new byte[4][104][104];
        Statics.field131 = new byte[4][104][104];
        Statics.field132 = new byte[4][104][104];
        Statics.field1015 = new byte[4][104][104];
        Statics.field1921 = new int[4][105][105];
        Statics.field133 = new byte[4][105][105];
        Statics.field2461 = new int[105][105];
        Statics.field2004 = new int[104];
        Statics.field127 = new int[104];
        Statics.field1214 = new int[104];
        Statics.field135 = new int[104];
        Statics.field2409 = new int[104];
        int var11 = Statics.field351.length;
        class7.method2361();
        method1463(true);
        if (!field529) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field184[var12] >> 8) * 64 - Statics.field56;
                int var14 = (Statics.field184[var12] & 0xFF) * 64 - Statics.field932;
                byte[] var15 = Statics.field351[var12];
                if (var15 != null) {
                    method2021();
                    class9.method2020(var15, var13, var14, Statics.field554 * 8 - 48, Statics.field404 * 8 - 48, field528);
                }
            }
            for (int var16 = 0; var16 < var11; var16++) {
                int var17 = (Statics.field184[var16] >> 8) * 64 - Statics.field56;
                int var18 = (Statics.field184[var16] & 0xFF) * 64 - Statics.field932;
                byte[] var19 = Statics.field351[var16];
                if (var19 == null && Statics.field404 < 800) {
                    method2021();
                    class9.method690(var17, var18, 64, 64);
                }
            }
            method1463(true);
            for (int var20 = 0; var20 < var11; var20++) {
                byte[] var21 = Statics.field134[var20];
                if (var21 != null) {
                    int var22 = (Statics.field184[var20] >> 8) * 64 - Statics.field56;
                    int var23 = (Statics.field184[var20] & 0xFF) * 64 - Statics.field932;
                    method2021();
                    class9.method853(var21, var22, var23, Statics.field1423, field528);
                }
            }
        }
        if (field529) {
            for (int var24 = 0; var24 < 4; var24++) {
                method2021();
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        boolean var27 = false;
                        int var28 = field530[var24][var25][var26];
                        if (var28 != -1) {
                            int var29 = var28 >> 24 & 0x3;
                            int var30 = var28 >> 1 & 0x3;
                            int var31 = var28 >> 14 & 0x3FF;
                            int var32 = var28 >> 3 & 0x7FF;
                            int var33 = (var31 / 8 << 8) + var32 / 8;
                            for (int var34 = 0; var34 < Statics.field184.length; var34++) {
                                if (Statics.field184[var34] == var33 && Statics.field351[var34] != null) {
                                    Statics.method1512(Statics.field351[var34], var24, var25 * 8, var26 * 8, var29, (var31 & 0x7) * 8, (var32 & 0x7) * 8, var30, field528);
                                    var27 = true;
                                    break;
                                }
                            }
                        }
                        if (!var27) {
                            int var35 = var24;
                            int var36 = var25 * 8;
                            int var37 = var26 * 8;
                            for (int var38 = 0; var38 < 8; var38++) {
                                for (int var39 = 0; var39 < 8; var39++) {
                                    class9.field130[var35][var36 + var38][var37 + var39] = 0;
                                }
                            }
                            if (var36 > 0) {
                                for (int var40 = 1; var40 < 8; var40++) {
                                    class9.field130[var35][var36][var37 + var40] = class9.field130[var35][var36 - 1][var37 + var40];
                                }
                            }
                            if (var37 > 0) {
                                for (int var41 = 1; var41 < 8; var41++) {
                                    class9.field130[var35][var36 + var41][var37] = class9.field130[var35][var36 + var41][var37 - 1];
                                }
                            }
                            if (var36 > 0 && class9.field130[var35][var36 - 1][var37] != 0) {
                                class9.field130[var35][var36][var37] = class9.field130[var35][var36 - 1][var37];
                            } else if (var37 > 0 && class9.field130[var35][var36][var37 - 1] != 0) {
                                class9.field130[var35][var36][var37] = class9.field130[var35][var36][var37 - 1];
                            } else if (var36 > 0 && var37 > 0 && class9.field130[var35][var36 - 1][var37 - 1] != 0) {
                                class9.field130[var35][var36][var37] = class9.field130[var35][var36 - 1][var37 - 1];
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < 13; var42++) {
                for (int var43 = 0; var43 < 13; var43++) {
                    int var44 = field530[0][var42][var43];
                    if (var44 == -1) {
                        class9.method690(var42 * 8, var43 * 8, 8, 8);
                    }
                }
            }
            method1463(true);
            for (int var45 = 0; var45 < 4; var45++) {
                method2021();
                for (int var46 = 0; var46 < 13; var46++) {
                    label904: for (int var47 = 0; var47 < 13; var47++) {
                        int var48 = field530[var45][var46][var47];
                        if (var48 != -1) {
                            int var49 = var48 >> 24 & 0x3;
                            int var50 = var48 >> 1 & 0x3;
                            int var51 = var48 >> 14 & 0x3FF;
                            int var52 = var48 >> 3 & 0x7FF;
                            int var53 = (var51 / 8 << 8) + var52 / 8;
                            for (int var54 = 0; var54 < Statics.field184.length; var54++) {
                                if (Statics.field184[var54] == var53 && Statics.field134[var54] != null) {
                                    byte[] var55 = Statics.field134[var54];
                                    int var56 = var46 * 8;
                                    int var57 = var47 * 8;
                                    int var58 = (var51 & 0x7) * 8;
                                    int var59 = (var52 & 0x7) * 8;
                                    class95 var60 = Statics.field1423;
                                    class130[] var61 = field528;
                                    class126 var62 = new class126(var55);
                                    int var63 = -1;
                                    while (true) {
                                        int var64 = var62.method2560();
                                        if (var64 == 0) {
                                            continue label904;
                                        }
                                        var63 += var64;
                                        int var65 = 0;
                                        while (true) {
                                            int var66 = var62.method2560();
                                            if (var66 == 0) {
                                                break;
                                            }
                                            var65 += var66 - 1;
                                            int var67 = var65 & 0x3F;
                                            int var68 = var65 >> 6 & 0x3F;
                                            int var69 = var65 >> 12;
                                            int var70 = var62.method2436();
                                            int var71 = var70 >> 2;
                                            int var72 = var70 & 0x3;
                                            if (var49 == var69 && var68 >= var58 && var68 < var58 + 8 && var67 >= var59 && var67 < var59 + 8) {
                                                class32 var73 = class32.method48(var63);
                                                int var74 = var56 + class161.method260(var68 & 0x7, var67 & 0x7, var50, var73.field809, var73.field817, var72);
                                                int var75 = var57 + class161.method3101(var68 & 0x7, var67 & 0x7, var50, var73.field809, var73.field817, var72);
                                                if (var74 > 0 && var75 > 0 && var74 < 103 && var75 < 103) {
                                                    int var76 = var45;
                                                    if ((class9.field148[1][var74][var75] & 0x2) == 2) {
                                                        var76 = var45 - 1;
                                                    }
                                                    class130 var77 = null;
                                                    if (var76 >= 0) {
                                                        var77 = var61[var76];
                                                    }
                                                    class9.method798(var45, var74, var75, var63, var50 + var72 & 0x3, var71, var60, var77);
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
        method1463(true);
        method2197();
        method2021();
        class95 var78 = Statics.field1423;
        class130[] var79 = field528;
        for (int var80 = 0; var80 < 4; var80++) {
            for (int var81 = 0; var81 < 104; var81++) {
                for (int var82 = 0; var82 < 104; var82++) {
                    if ((class9.field148[var80][var81][var82] & 0x1) == 1) {
                        int var83 = var80;
                        if ((class9.field148[1][var81][var82] & 0x2) == 2) {
                            var83 = var80 - 1;
                        }
                        if (var83 >= 0) {
                            var79[var83].method2665(var81, var82);
                        }
                    }
                }
            }
        }
        class9.field142 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field142 < -8) {
            class9.field142 = -8;
        }
        if (class9.field142 > 8) {
            class9.field142 = 8;
        }
        class9.field137 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field137 < -16) {
            class9.field137 = -16;
        }
        if (class9.field137 > 16) {
            class9.field137 = 16;
        }
        for (int var84 = 0; var84 < 4; var84++) {
            byte[][] var85 = Statics.field133[var84];
            int var86 = (int) Math.sqrt(5100.0D);
            int var87 = var86 * 768 >> 8;
            for (int var88 = 1; var88 < 103; var88++) {
                for (int var89 = 1; var89 < 103; var89++) {
                    int var90 = class9.field130[var84][var89 + 1][var88] - class9.field130[var84][var89 - 1][var88];
                    int var91 = class9.field130[var84][var89][var88 + 1] - class9.field130[var84][var89][var88 - 1];
                    int var92 = (int) Math.sqrt((double) (var91 * var91 + var90 * var90 + 65536));
                    int var93 = (var90 << 8) / var92;
                    int var94 = 65536 / var92;
                    int var95 = (var91 << 8) / var92;
                    int var96 = (var95 * -50 + var93 * -50 + var94 * -10) / var87 + 96;
                    int var97 = (var85[var89][var88] >> 1) + (var85[var89][var88 + 1] >> 3) + (var85[var89][var88 - 1] >> 2) + (var85[var89 - 1][var88] >> 2) + (var85[var89 + 1][var88] >> 3);
                    Statics.field2461[var89][var88] = var96 - var97;
                }
            }
            for (int var98 = 0; var98 < 104; var98++) {
                Statics.field2004[var98] = 0;
                Statics.field127[var98] = 0;
                Statics.field1214[var98] = 0;
                Statics.field135[var98] = 0;
                Statics.field2409[var98] = 0;
            }
            for (int var99 = -5; var99 < 109; var99++) {
                for (int var100 = 0; var100 < 104; var100++) {
                    int var101 = var99 + 5;
                    int var10002;
                    if (var101 >= 0 && var101 < 104) {
                        int var102 = Statics.field128[var84][var101][var100] & 0xFF;
                        if (var102 > 0) {
                            int var103 = var102 - 1;
                            class33 var104 = (class33) class33.field860.method3248((long) var103);
                            class33 var105;
                            if (var104 == null) {
                                byte[] var106 = Statics.field853.method3026(1, var103);
                                class33 var107 = new class33();
                                if (var106 != null) {
                                    var107.method675(new class126(var106), var103);
                                }
                                var107.method678();
                                class33.field860.method3252(var107, (long) var103);
                                var105 = var107;
                            } else {
                                var105 = var104;
                            }
                            Statics.field2004[var100] += var105.field855;
                            Statics.field127[var100] += var105.field856;
                            Statics.field1214[var100] += var105.field857;
                            Statics.field135[var100] += var105.field858;
                            var10002 = Statics.field2409[var100]++;
                        }
                    }
                    int var109 = var99 - 5;
                    if (var109 >= 0 && var109 < 104) {
                        int var110 = Statics.field128[var84][var109][var100] & 0xFF;
                        if (var110 > 0) {
                            int var111 = var110 - 1;
                            class33 var112 = (class33) class33.field860.method3248((long) var111);
                            class33 var113;
                            if (var112 == null) {
                                byte[] var114 = Statics.field853.method3026(1, var111);
                                class33 var115 = new class33();
                                if (var114 != null) {
                                    var115.method675(new class126(var114), var111);
                                }
                                var115.method678();
                                class33.field860.method3252(var115, (long) var111);
                                var113 = var115;
                            } else {
                                var113 = var112;
                            }
                            Statics.field2004[var100] -= var113.field855;
                            Statics.field127[var100] -= var113.field856;
                            Statics.field1214[var100] -= var113.field857;
                            Statics.field135[var100] -= var113.field858;
                            var10002 = Statics.field2409[var100]--;
                        }
                    }
                }
                if (var99 >= 1 && var99 < 103) {
                    int var117 = 0;
                    int var118 = 0;
                    int var119 = 0;
                    int var120 = 0;
                    int var121 = 0;
                    for (int var122 = -5; var122 < 109; var122++) {
                        int var123 = var122 + 5;
                        if (var123 >= 0 && var123 < 104) {
                            var117 += Statics.field2004[var123];
                            var118 += Statics.field127[var123];
                            var119 += Statics.field1214[var123];
                            var120 += Statics.field135[var123];
                            var121 += Statics.field2409[var123];
                        }
                        int var124 = var122 - 5;
                        if (var124 >= 0 && var124 < 104) {
                            var117 -= Statics.field2004[var124];
                            var118 -= Statics.field127[var124];
                            var119 -= Statics.field1214[var124];
                            var120 -= Statics.field135[var124];
                            var121 -= Statics.field2409[var124];
                        }
                        if (var122 >= 1 && var122 < 103 && (!field473 || (class9.field148[0][var99][var122] & 0x2) != 0 || (class9.field148[var84][var99][var122] & 0x10) == 0 && class9.method2113(var84, var99, var122) == field521)) {
                            if (var84 < class9.field129) {
                                class9.field129 = var84;
                            }
                            int var125 = Statics.field128[var84][var99][var122] & 0xFF;
                            int var126 = Statics.field131[var84][var99][var122] & 0xFF;
                            if (var125 > 0 || var126 > 0) {
                                int var127 = class9.field130[var84][var99][var122];
                                int var128 = class9.field130[var84][var99 + 1][var122];
                                int var129 = class9.field130[var84][var99 + 1][var122 + 1];
                                int var130 = class9.field130[var84][var99][var122 + 1];
                                int var131 = Statics.field2461[var99][var122];
                                int var132 = Statics.field2461[var99 + 1][var122];
                                int var133 = Statics.field2461[var99 + 1][var122 + 1];
                                int var134 = Statics.field2461[var99][var122 + 1];
                                int var135 = -1;
                                int var136 = -1;
                                if (var125 > 0) {
                                    int var137 = var117 * 256 / var120;
                                    int var138 = var118 / var121;
                                    int var139 = var119 / var121;
                                    var135 = class9.method2717(var137, var138, var139);
                                    int var140 = class9.field142 + var137 & 0xFF;
                                    int var141 = class9.field137 + var139;
                                    if (var141 < 0) {
                                        var141 = 0;
                                    } else if (var141 > 255) {
                                        var141 = 255;
                                    }
                                    var136 = class9.method2717(var140, var138, var141);
                                }
                                if (var84 > 0) {
                                    boolean var142 = true;
                                    if (var125 == 0 && Statics.field132[var84][var99][var122] != 0) {
                                        var142 = false;
                                    }
                                    if (var126 > 0) {
                                        int var143 = var126 - 1;
                                        class37 var144 = (class37) class37.field923.method3248((long) var143);
                                        class37 var145;
                                        if (var144 == null) {
                                            byte[] var146 = Statics.field922.method3026(4, var143);
                                            class37 var147 = new class37();
                                            if (var146 != null) {
                                                var147.method780(new class126(var146), var143);
                                            }
                                            var147.method778();
                                            class37.field923.method3252(var147, (long) var143);
                                            var145 = var147;
                                        } else {
                                            var145 = var144;
                                        }
                                        if (!var145.field926) {
                                            var142 = false;
                                        }
                                    }
                                    if (var142 && var127 == var128 && var127 == var129 && var127 == var130) {
                                        Statics.field1921[var84][var99][var122] |= 0x924;
                                    }
                                }
                                int var148 = 0;
                                if (var136 != -1) {
                                    var148 = class104.field1748[class9.method864(var136, 96)];
                                }
                                if (var126 == 0) {
                                    var78.method1844(var84, var99, var122, 0, 0, -1, var127, var128, var129, var130, class9.method864(var135, var131), class9.method864(var135, var132), class9.method864(var135, var133), class9.method864(var135, var134), 0, 0, 0, 0, var148, 0);
                                } else {
                                    int var149 = Statics.field132[var84][var99][var122] + 1;
                                    byte var150 = Statics.field1015[var84][var99][var122];
                                    int var151 = var126 - 1;
                                    class37 var152 = (class37) class37.field923.method3248((long) var151);
                                    class37 var153;
                                    if (var152 == null) {
                                        byte[] var154 = Statics.field922.method3026(4, var151);
                                        class37 var155 = new class37();
                                        if (var154 != null) {
                                            var155.method780(new class126(var154), var151);
                                        }
                                        var155.method778();
                                        class37.field923.method3252(var155, (long) var151);
                                        var153 = var155;
                                    } else {
                                        var153 = var152;
                                    }
                                    int var157 = var153.field931;
                                    int var158;
                                    int var159;
                                    if (var157 >= 0) {
                                        var158 = Statics.field1766.method2182(var157);
                                        var159 = -1;
                                    } else if (var153.field920 == 16711935) {
                                        var159 = -2;
                                        var157 = -1;
                                        var158 = -2;
                                    } else {
                                        var159 = class9.method2717(var153.field925, var153.field933, var153.field919);
                                        int var160 = class9.field142 + var153.field925 & 0xFF;
                                        int var161 = class9.field137 + var153.field919;
                                        if (var161 < 0) {
                                            var161 = 0;
                                        } else if (var161 > 255) {
                                            var161 = 255;
                                        }
                                        var158 = class9.method2717(var160, var153.field933, var161);
                                    }
                                    int var162 = 0;
                                    if (var158 != -2) {
                                        var162 = class104.field1748[class9.method94(var158, 96)];
                                    }
                                    if (var153.field924 != -1) {
                                        int var163 = class9.field142 + var153.field927 & 0xFF;
                                        int var164 = class9.field137 + var153.field929;
                                        if (var164 < 0) {
                                            var164 = 0;
                                        } else if (var164 > 255) {
                                            var164 = 255;
                                        }
                                        int var165 = class9.method2717(var163, var153.field928, var164);
                                        var162 = class104.field1748[class9.method94(var165, 96)];
                                    }
                                    var78.method1844(var84, var99, var122, var149, var150, var157, var127, var128, var129, var130, class9.method864(var135, var131), class9.method864(var135, var132), class9.method864(var135, var133), class9.method864(var135, var134), class9.method94(var159, var131), class9.method94(var159, var132), class9.method94(var159, var133), class9.method94(var159, var134), var148, var162);
                                }
                            }
                        }
                    }
                }
            }
            for (int var166 = 1; var166 < 103; var166++) {
                for (int var167 = 1; var167 < 103; var167++) {
                    var78.method1905(var84, var167, var166, class9.method2113(var84, var167, var166));
                }
            }
            Statics.field128[var84] = (byte[][]) null;
            Statics.field131[var84] = (byte[][]) null;
            Statics.field132[var84] = (byte[][]) null;
            Statics.field1015[var84] = (byte[][]) null;
            Statics.field133[var84] = (byte[][]) null;
        }
        var78.method1973(-50, -10, -50);
        for (int var168 = 0; var168 < 104; var168++) {
            for (int var169 = 0; var169 < 104; var169++) {
                if ((class9.field148[1][var168][var169] & 0x2) == 2) {
                    var78.method1842(var168, var169);
                }
            }
        }
        int var170 = 1;
        int var171 = 2;
        int var172 = 4;
        for (int var173 = 0; var173 < 4; var173++) {
            if (var173 > 0) {
                var170 <<= 0x3;
                var171 <<= 0x3;
                var172 <<= 0x3;
            }
            for (int var174 = 0; var174 <= var173; var174++) {
                for (int var175 = 0; var175 <= 104; var175++) {
                    for (int var176 = 0; var176 <= 104; var176++) {
                        if ((Statics.field1921[var174][var176][var175] & var170) != 0) {
                            int var177 = var175;
                            int var178 = var175;
                            int var179 = var174;
                            int var180 = var174;
                            while (var177 > 0 && (Statics.field1921[var174][var176][var177 - 1] & var170) != 0) {
                                var177--;
                            }
                            while (var178 < 104 && (Statics.field1921[var174][var176][var178 + 1] & var170) != 0) {
                                var178++;
                            }
                            label637: while (var179 > 0) {
                                for (int var181 = var177; var181 <= var178; var181++) {
                                    if ((Statics.field1921[var179 - 1][var176][var181] & var170) == 0) {
                                        break label637;
                                    }
                                }
                                var179--;
                            }
                            label626: while (var180 < var173) {
                                for (int var182 = var177; var182 <= var178; var182++) {
                                    if ((Statics.field1921[var180 + 1][var176][var182] & var170) == 0) {
                                        break label626;
                                    }
                                }
                                var180++;
                            }
                            int var183 = (var180 + 1 - var179) * (var178 - var177 + 1);
                            if (var183 >= 8) {
                                short var184 = 240;
                                int var185 = class9.field130[var180][var176][var177] - var184;
                                int var186 = class9.field130[var179][var176][var177];
                                class95.method1957(var173, 1, var176 * 128, var176 * 128, var177 * 128, var178 * 128 + 128, var185, var186);
                                for (int var187 = var179; var187 <= var180; var187++) {
                                    for (int var188 = var177; var188 <= var178; var188++) {
                                        Statics.field1921[var187][var176][var188] &= ~var170;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1921[var174][var176][var175] & var171) != 0) {
                            int var189 = var176;
                            int var190 = var176;
                            int var191 = var174;
                            int var192 = var174;
                            while (var189 > 0 && (Statics.field1921[var174][var189 - 1][var175] & var171) != 0) {
                                var189--;
                            }
                            while (var190 < 104 && (Statics.field1921[var174][var190 + 1][var175] & var171) != 0) {
                                var190++;
                            }
                            label690: while (var191 > 0) {
                                for (int var193 = var189; var193 <= var190; var193++) {
                                    if ((Statics.field1921[var191 - 1][var193][var175] & var171) == 0) {
                                        break label690;
                                    }
                                }
                                var191--;
                            }
                            label679: while (var192 < var173) {
                                for (int var194 = var189; var194 <= var190; var194++) {
                                    if ((Statics.field1921[var192 + 1][var194][var175] & var171) == 0) {
                                        break label679;
                                    }
                                }
                                var192++;
                            }
                            int var195 = (var192 + 1 - var191) * (var190 - var189 + 1);
                            if (var195 >= 8) {
                                short var196 = 240;
                                int var197 = class9.field130[var192][var189][var175] - var196;
                                int var198 = class9.field130[var191][var189][var175];
                                class95.method1957(var173, 2, var189 * 128, var190 * 128 + 128, var175 * 128, var175 * 128, var197, var198);
                                for (int var199 = var191; var199 <= var192; var199++) {
                                    for (int var200 = var189; var200 <= var190; var200++) {
                                        Statics.field1921[var199][var200][var175] &= ~var171;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1921[var174][var176][var175] & var172) != 0) {
                            int var201 = var176;
                            int var202 = var176;
                            int var203 = var175;
                            int var204 = var175;
                            while (var203 > 0 && (Statics.field1921[var174][var176][var203 - 1] & var172) != 0) {
                                var203--;
                            }
                            while (var204 < 104 && (Statics.field1921[var174][var176][var204 + 1] & var172) != 0) {
                                var204++;
                            }
                            label743: while (var201 > 0) {
                                for (int var205 = var203; var205 <= var204; var205++) {
                                    if ((Statics.field1921[var174][var201 - 1][var205] & var172) == 0) {
                                        break label743;
                                    }
                                }
                                var201--;
                            }
                            label732: while (var202 < 104) {
                                for (int var206 = var203; var206 <= var204; var206++) {
                                    if ((Statics.field1921[var174][var202 + 1][var206] & var172) == 0) {
                                        break label732;
                                    }
                                }
                                var202++;
                            }
                            if ((var202 - var201 + 1) * (var204 - var203 + 1) >= 4) {
                                int var207 = class9.field130[var174][var201][var203];
                                class95.method1957(var173, 4, var201 * 128, var202 * 128 + 128, var203 * 128, var204 * 128 + 128, var207, var207);
                                for (int var208 = var201; var208 <= var202; var208++) {
                                    for (int var209 = var203; var209 <= var204; var209++) {
                                        Statics.field1921[var174][var208][var209] &= ~var172;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method1463(true);
        int var210 = class9.field129;
        if (var210 > Statics.field263) {
            var210 = Statics.field263;
        }
        if (var210 < Statics.field263 - 1) {
            int var211 = Statics.field263 - 1;
        }
        if (field473) {
            Statics.field1423.method1841(class9.field129);
        } else {
            Statics.field1423.method1841(0);
        }
        for (int var212 = 0; var212 < 104; var212++) {
            for (int var213 = 0; var213 < 104; var213++) {
                method124(var212, var213);
            }
        }
        method2021();
        for (class22 var214 = (class22) field603.method3314(); var214 != null; var214 = (class22) field603.method3325()) {
            if (var214.field355 == -1) {
                var214.field337 = 0;
                method241(var214);
            } else {
                var214.method3341();
            }
        }
        class32.field804.method3251();
        if (Statics.field1264 != null) {
            field602.method2306(189);
            field602.method2425(1057001181);
        }
        if (!field529) {
            int var215 = (Statics.field554 - 6) / 8;
            int var216 = (Statics.field554 + 6) / 8;
            int var217 = (Statics.field404 - 6) / 8;
            int var218 = (Statics.field404 + 6) / 8;
            for (int var219 = var215 - 1; var219 <= var216 + 1; var219++) {
                for (int var220 = var217 - 1; var220 <= var218 + 1; var220++) {
                    if (var219 < var215 || var219 > var216 || var220 < var217 || var220 > var218) {
                        Statics.field609.method3015("m" + var219 + "_" + var220);
                        Statics.field609.method3015("l" + var219 + "_" + var220);
                    }
                }
            }
        }
        method3172(30);
        method2021();
        class9.method1339();
        field602.method2306(120);
        class73.method563();
    }

    @ObfuscatedName("u.ad(II)V")
    public static final void method230(int arg0) {
        int[] var1 = Statics.field146.field1455;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field148[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1423.method1873(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field148[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1423.method1873(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field146.method1668();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field148[arg0][var10][var9] & 0x18) == 0) {
                    method167(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field148[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method167(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field695 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1423.method1868(Statics.field263, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method48(var14).field827;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field528[Statics.field263].field2058;
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
                        field515[field695] = Statics.field2086[var15];
                        field697[field695] = var16;
                        field698[field695] = var17;
                        field695++;
                    }
                }
            }
        }
        Statics.field181.method1659();
    }

    @ObfuscatedName("k.ar(IIIIII)V")
    public static final void method167(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1423.method1865(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1423.method1966(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field146.field1455;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method48(var12);
            if (var13.field801 == -1) {
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
                class87 var14 = Statics.field1222[var13.field801];
                if (var14 != null) {
                    int var15 = (var13.field809 * 4 - var14.field1462) / 2;
                    int var16 = (var13.field817 * 4 - var14.field1464) / 2;
                    var14.method1759(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field817) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1423.method2002(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1423.method1966(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method48(var21);
            if (var22.field801 != -1) {
                class87 var23 = Statics.field1222[var22.field801];
                if (var23 != null) {
                    int var24 = (var22.field809 * 4 - var23.field1462) / 2;
                    int var25 = (var22.field817 * 4 - var23.field1464) / 2;
                    var23.method1759(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field817) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field146.field1455;
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
        int var29 = Statics.field1423.method1868(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method48(var30);
        if (var31.field801 == -1) {
            return;
        }
        class87 var32 = Statics.field1222[var31.field801];
        if (var32 != null) {
            int var33 = (var31.field809 * 4 - var32.field1462) / 2;
            int var34 = (var31.field817 * 4 - var32.field1464) / 2;
            var32.method1759(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field817) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bh.bu(B)V")
    public static final void method1258() {
        if (field513 == 76) {
            int var0 = field498.method2460();
            int var1 = (var0 >> 4 & 0x7) + Statics.field2032;
            int var2 = (var0 & 0x7) + Statics.field2480;
            int var3 = field498.method2572();
            int var4 = field498.method2545();
            int var5 = var4 >> 2;
            int var6 = var4 & 0x3;
            int var7 = field531[var5];
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                method141(Statics.field263, var1, var2, var7, var3, var5, var6, 0, -1);
            }
        } else if (field513 == 131) {
            int var8 = field498.method2577();
            int var9 = (var8 >> 4 & 0x7) + Statics.field2032;
            int var10 = (var8 & 0x7) + Statics.field2480;
            int var11 = field498.method2436();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field531[var12];
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                method141(Statics.field263, var9, var10, var14, -1, var12, var13, 0, -1);
            }
        } else {
            if (field513 == 158) {
                int var15 = field498.method2545();
                int var16 = (var15 >> 4 & 0x7) + Statics.field2032;
                int var17 = (var15 & 0x7) + Statics.field2480;
                int var18 = field498.method2613();
                byte var19 = field498.method2437();
                int var20 = field498.method2613();
                byte var21 = field498.method2437();
                int var22 = field498.method2613();
                byte var23 = field498.method2424();
                int var24 = field498.method2469();
                byte var25 = field498.method2462();
                int var26 = field498.method2577();
                int var27 = var26 >> 2;
                int var28 = var26 & 0x3;
                int var29 = field531[var27];
                class3 var30;
                if (field723 == var24) {
                    var30 = Statics.field52;
                } else {
                    var30 = field511[var24];
                }
                if (var30 != null) {
                    class32 var31 = class32.method48(var22);
                    int var32;
                    int var33;
                    if (var28 == 1 || var28 == 3) {
                        var32 = var31.field817;
                        var33 = var31.field809;
                    } else {
                        var32 = var31.field809;
                        var33 = var31.field817;
                    }
                    int var34 = (var32 >> 1) + var16;
                    int var35 = (var32 + 1 >> 1) + var16;
                    int var36 = (var33 >> 1) + var17;
                    int var37 = (var33 + 1 >> 1) + var17;
                    int[][] var38 = class9.field130[Statics.field263];
                    int var39 = var38[var34][var36] + var38[var35][var36] + var38[var34][var37] + var38[var35][var37] >> 2;
                    int var40 = (var16 << 7) + (var32 << 6);
                    int var41 = (var17 << 7) + (var33 << 6);
                    class112 var42 = var31.method647(var27, var28, var38, var40, var39, var41);
                    if (var42 != null) {
                        method141(Statics.field263, var16, var17, var29, -1, 0, 0, var20 + 1, var18 + 1);
                        var30.field42 = field477 + var20;
                        var30.field40 = field477 + var18;
                        var30.field43 = var42;
                        var30.field41 = var16 * 128 + var32 * 64;
                        var30.field48 = var17 * 128 + var33 * 64;
                        var30.field31 = var39;
                        if (var23 > var21) {
                            byte var43 = var23;
                            var23 = var21;
                            var21 = var43;
                        }
                        if (var25 > var19) {
                            byte var44 = var25;
                            var25 = var19;
                            var19 = var44;
                        }
                        var30.field44 = var16 + var23;
                        var30.field46 = var16 + var21;
                        var30.field39 = var17 + var25;
                        var30.field47 = var17 + var19;
                    }
                }
            }
            if (field513 == 156) {
                int var45 = field498.method2436();
                int var46 = (var45 >> 4 & 0x7) + Statics.field2032;
                int var47 = (var45 & 0x7) + Statics.field2480;
                int var48 = field498.method2572();
                int var49 = field498.method2436();
                int var50 = var49 >> 4 & 0xF;
                int var51 = var49 & 0x7;
                int var52 = field498.method2436();
                if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104) {
                    int var53 = var50 + 1;
                    if (Statics.field52.field460[0] >= var46 - var53 && Statics.field52.field460[0] <= var46 + var53 && Statics.field52.field461[0] >= var47 - var53 && Statics.field52.field461[0] <= var47 + var53 && field707 != 0 && var51 > 0 && field549 < 50) {
                        field709[field549] = var48;
                        field580[field549] = var51;
                        field711[field549] = var52;
                        field713[field549] = null;
                        field712[field549] = (var46 << 16) + (var47 << 8) + var50;
                        field549++;
                    }
                }
            }
            if (field513 == 249) {
                int var54 = field498.method2436();
                int var55 = (var54 >> 4 & 0x7) + Statics.field2032;
                int var56 = (var54 & 0x7) + Statics.field2480;
                int var57 = field498.method2467();
                int var58 = field498.method2545();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field531[var59];
                if (var55 >= 0 && var56 >= 0 && var55 < 103 && var56 < 103) {
                    if (var61 == 0) {
                        class96 var62 = Statics.field1423.method1852(Statics.field263, var55, var56);
                        if (var62 != null) {
                            int var63 = var62.field1607 >> 14 & 0x7FFF;
                            if (var59 == 2) {
                                var62.field1613 = new class14(var63, 2, var60 + 4, Statics.field263, var55, var56, var57, false, var62.field1613);
                                var62.field1606 = new class14(var63, 2, var60 + 1 & 0x3, Statics.field263, var55, var56, var57, false, var62.field1606);
                            } else {
                                var62.field1613 = new class14(var63, var59, var60, Statics.field263, var55, var56, var57, false, var62.field1613);
                            }
                        }
                    }
                    if (var61 == 1) {
                        class108 var64 = Statics.field1423.method1862(Statics.field263, var55, var56);
                        if (var64 != null) {
                            int var65 = var64.field1799 >> 14 & 0x7FFF;
                            if (var59 == 4 || var59 == 5) {
                                var64.field1797 = new class14(var65, 4, var60, Statics.field263, var55, var56, var57, false, var64.field1797);
                            } else if (var59 == 6) {
                                var64.field1797 = new class14(var65, 4, var60 + 4, Statics.field263, var55, var56, var57, false, var64.field1797);
                            } else if (var59 == 7) {
                                var64.field1797 = new class14(var65, 4, (var60 + 2 & 0x3) + 4, Statics.field263, var55, var56, var57, false, var64.field1797);
                            } else if (var59 == 8) {
                                var64.field1797 = new class14(var65, 4, var60 + 4, Statics.field263, var55, var56, var57, false, var64.field1797);
                                var64.field1798 = new class14(var65, 4, (var60 + 2 & 0x3) + 4, Statics.field263, var55, var56, var57, false, var64.field1798);
                            }
                        }
                    }
                    if (var61 == 2) {
                        class98 var66 = Statics.field1423.method1900(Statics.field263, var55, var56);
                        if (var59 == 11) {
                            var59 = 10;
                        }
                        if (var66 != null) {
                            var66.field1629 = new class14(var66.field1637 >> 14 & 0x7FFF, var59, var60, Statics.field263, var55, var56, var57, false, var66.field1629);
                        }
                    }
                    if (var61 == 3) {
                        class107 var67 = Statics.field1423.method1864(Statics.field263, var55, var56);
                        if (var67 != null) {
                            var67.field1789 = new class14(var67.field1783 >> 14 & 0x7FFF, 22, var60, Statics.field263, var55, var56, var57, false, var67.field1789);
                        }
                    }
                }
            } else if (field513 == 110) {
                int var68 = field498.method2436();
                int var69 = (var68 >> 4 & 0x7) + Statics.field2032;
                int var70 = (var68 & 0x7) + Statics.field2480;
                int var71 = field498.method2572();
                int var72 = field498.method2436();
                int var73 = field498.method2572();
                if (var69 >= 0 && var70 >= 0 && var69 < 104 && var70 < 104) {
                    int var74 = var69 * 128 + 64;
                    int var75 = var70 * 128 + 64;
                    class20 var76 = new class20(var71, Statics.field263, var74, var75, method121(var74, var75, Statics.field263) - var72, var73, field477);
                    field570.method3318(var76);
                }
            } else if (field513 == 241) {
                int var77 = field498.method2460();
                int var78 = (var77 >> 4 & 0x7) + Statics.field2032;
                int var79 = (var77 & 0x7) + Statics.field2480;
                int var80 = field498.method2613();
                if (var78 >= 0 && var79 >= 0 && var78 < 104 && var79 < 104) {
                    class177 var81 = field656[Statics.field263][var78][var79];
                    if (var81 != null) {
                        for (class17 var82 = (class17) var81.method3314(); var82 != null; var82 = (class17) var81.method3325()) {
                            if ((var80 & 0x7FFF) == var82.field260) {
                                var82.method3341();
                                break;
                            }
                        }
                        if (var81.method3314() == null) {
                            field656[Statics.field263][var78][var79] = null;
                        }
                        method124(var78, var79);
                    }
                }
            } else if (field513 == 133) {
                int var83 = field498.method2436();
                int var84 = (var83 >> 4 & 0x7) + Statics.field2032;
                int var85 = (var83 & 0x7) + Statics.field2480;
                int var86 = var84 + field498.method2437();
                int var87 = var85 + field498.method2437();
                int var88 = field498.method2531();
                int var89 = field498.method2572();
                int var90 = field498.method2436() * 4;
                int var91 = field498.method2436() * 4;
                int var92 = field498.method2572();
                int var93 = field498.method2572();
                int var94 = field498.method2436();
                int var95 = field498.method2436();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104 && var86 >= 0 && var87 >= 0 && var86 < 104 && var87 < 104 && var89 != 65535) {
                    int var96 = var84 * 128 + 64;
                    int var97 = var85 * 128 + 64;
                    int var98 = var86 * 128 + 64;
                    int var99 = var87 * 128 + 64;
                    class10 var100 = new class10(var89, Statics.field263, var96, var97, method121(var96, var97, Statics.field263) - var90, field477 + var92, field477 + var93, var94, var95, var88, var91);
                    var100.method97(var98, var99, method121(var98, var99, Statics.field263) - var91, field477 + var92);
                    field604.method3318(var100);
                }
            } else if (field513 == 155) {
                int var101 = field498.method2460();
                int var102 = (var101 >> 4 & 0x7) + Statics.field2032;
                int var103 = (var101 & 0x7) + Statics.field2480;
                int var104 = field498.method2572();
                int var105 = field498.method2467();
                if (var102 >= 0 && var103 >= 0 && var102 < 104 && var103 < 104) {
                    class17 var106 = new class17();
                    var106.field260 = var104;
                    var106.field261 = var105;
                    if (field656[Statics.field263][var102][var103] == null) {
                        field656[Statics.field263][var102][var103] = new class177();
                    }
                    field656[Statics.field263][var102][var103].method3318(var106);
                    method124(var102, var103);
                }
            } else if (field513 == 157) {
                int var107 = field498.method2436();
                int var108 = (var107 >> 4 & 0x7) + Statics.field2032;
                int var109 = (var107 & 0x7) + Statics.field2480;
                int var110 = field498.method2572();
                int var111 = field498.method2572();
                int var112 = field498.method2572();
                if (var108 >= 0 && var109 >= 0 && var108 < 104 && var109 < 104) {
                    class177 var113 = field656[Statics.field263][var108][var109];
                    if (var113 != null) {
                        for (class17 var114 = (class17) var113.method3314(); var114 != null; var114 = (class17) var113.method3325()) {
                            if ((var110 & 0x7FFF) == var114.field260 && var114.field261 == var111) {
                                var114.field261 = var112;
                                break;
                            }
                        }
                        method124(var108, var109);
                    }
                }
            } else if (field513 == 237) {
                int var115 = field498.method2572();
                int var116 = field498.method2469();
                int var117 = field498.method2577();
                int var118 = (var117 >> 4 & 0x7) + Statics.field2032;
                int var119 = (var117 & 0x7) + Statics.field2480;
                int var120 = field498.method2613();
                if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104 && field723 != var116) {
                    class17 var121 = new class17();
                    var121.field260 = var120;
                    var121.field261 = var115;
                    if (field656[Statics.field263][var118][var119] == null) {
                        field656[Statics.field263][var118][var119] = new class177();
                    }
                    field656[Statics.field263][var118][var119].method3318(var121);
                    method124(var118, var119);
                }
            }
        }
    }

    @ObfuscatedName("x.bl(IIIIIIIIIS)V")
    public static final void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field603.method3314(); var10 != null; var10 = (class22) field603.method3325()) {
            if (var10.field353 == arg0 && var10.field339 == arg1 && var10.field345 == arg2 && var10.field338 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field353 = arg0;
            var9.field338 = arg3;
            var9.field339 = arg1;
            var9.field345 = arg2;
            method241(var9);
            field603.method3318(var9);
        }
        var9.field344 = arg4;
        var9.field346 = arg5;
        var9.field348 = arg6;
        var9.field337 = arg7;
        var9.field355 = arg8;
    }

    @ObfuscatedName("at.bj(Ls;I)V")
    public static final void method241(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field338 == 0) {
            var1 = Statics.field1423.method1865(arg0.field353, arg0.field339, arg0.field345);
        }
        if (arg0.field338 == 1) {
            var1 = Statics.field1423.method1866(arg0.field353, arg0.field339, arg0.field345);
        }
        if (arg0.field338 == 2) {
            var1 = Statics.field1423.method2002(arg0.field353, arg0.field339, arg0.field345);
        }
        if (arg0.field338 == 3) {
            var1 = Statics.field1423.method1868(arg0.field353, arg0.field339, arg0.field345);
        }
        if (var1 != 0) {
            int var5 = Statics.field1423.method1966(arg0.field353, arg0.field339, arg0.field345, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field341 = var2;
        arg0.field349 = var3;
        arg0.field343 = var4;
    }

    @ObfuscatedName("e.bi(I)V")
    public static final void method12() {
        for (class22 var0 = (class22) field603.method3314(); var0 != null; var0 = (class22) field603.method3325()) {
            if (var0.field355 > 0) {
                var0.field355--;
            }
            if (var0.field355 == 0) {
                if (var0.field341 >= 0) {
                    int var1 = var0.field341;
                    int var2 = var0.field349;
                    class32 var3 = class32.method48(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method632(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method37(var0.field353, var0.field338, var0.field339, var0.field345, var0.field341, var0.field343, var0.field349);
                var0.method3341();
            } else {
                if (var0.field337 > 0) {
                    var0.field337--;
                }
                if (var0.field337 == 0 && var0.field339 >= 1 && var0.field345 >= 1 && var0.field339 <= 102 && var0.field345 <= 102) {
                    if (var0.field344 >= 0) {
                        int var5 = var0.field344;
                        int var6 = var0.field346;
                        class32 var7 = class32.method48(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method632(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method37(var0.field353, var0.field338, var0.field339, var0.field345, var0.field344, var0.field348, var0.field346);
                    var0.field337 = -1;
                    if (var0.field344 == var0.field341 && var0.field341 == -1) {
                        var0.method3341();
                    } else if (var0.field344 == var0.field341 && var0.field348 == var0.field343 && var0.field349 == var0.field346) {
                        var0.method3341();
                    }
                }
            }
        }
    }

    @ObfuscatedName("h.bx(IIIIIIII)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field473 && Statics.field263 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1423.method1865(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1423.method1866(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1423.method2002(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1423.method1868(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1423.method1966(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1423.method1975(arg0, arg2, arg3);
                class32 var15 = class32.method48(var12);
                if (var15.field823 != 0) {
                    field528[arg0].method2667(arg2, arg3, var13, var14, var15.field819);
                }
            }
            if (arg1 == 1) {
                Statics.field1423.method1857(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1423.method1858(arg0, arg2, arg3);
                class32 var16 = class32.method48(var12);
                if (var16.field809 + arg2 > 103 || var16.field809 + arg3 > 103 || var16.field817 + arg2 > 103 || var16.field817 + arg3 > 103) {
                    return;
                }
                if (var16.field823 != 0) {
                    field528[arg0].method2668(arg2, arg3, var16.field809, var16.field817, var14, var16.field819);
                }
            }
            if (arg1 == 3) {
                Statics.field1423.method1963(arg0, arg2, arg3);
                class32 var17 = class32.method48(var12);
                if (var17.field823 == 1) {
                    field528[arg0].method2682(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field148[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        Statics.method170(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field1423, field528[arg0]);
    }

    @ObfuscatedName("t.bh(III)V")
    public static final void method124(int arg0, int arg1) {
        class177 var2 = field656[Statics.field263][arg0][arg1];
        if (var2 == null) {
            Statics.field1423.method1860(Statics.field263, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3314(); var6 != null; var6 = (class17) var2.method3325()) {
            class40 var7 = class40.method672(var6.field260);
            long var8 = (long) var7.field985;
            if (var7.field984 == 1) {
                var8 = (long) (var6.field261 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1423.method1860(Statics.field263, arg0, arg1);
            return;
        }
        var2.method3310(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3314(); var12 != null; var12 = (class17) var2.method3325()) {
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
        Statics.field1423.method1846(Statics.field263, arg0, arg1, method121(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field263), var5, var13, var10, var11);
    }

    @ObfuscatedName("bs.bn(I)V")
    public static final void method1491() {
        while (true) {
            if (field498.method2311(field512) >= 11) {
                int var0 = field498.method2309(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field511[var0] == null) {
                        field511[var0] = new class3();
                        if (field600[var0] != null) {
                            field511[var0].method14(field600[var0]);
                        }
                        var1 = true;
                    }
                    field590[++field589 - 1] = var0;
                    class3 var2 = field511[var0];
                    var2.field454 = field477;
                    int var3 = field498.method2309(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field498.method2309(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field498.method2309(1);
                    int var6 = field523[field498.method2309(3)];
                    if (var1) {
                        var2.field456 = var2.field453 = var6;
                    }
                    int var7 = field498.method2309(1);
                    if (var7 == 1) {
                        field585[++field591 - 1] = var0;
                    }
                    var2.method245(Statics.field52.field460[0] + var3, Statics.field52.field461[0] + var4, var5 == 1);
                    continue;
                }
            }
            field498.method2310();
            return;
        }
    }

    @ObfuscatedName("fw.bo(I)V")
    public static final void method3239() {
        field596 = 0;
        field591 = 0;
        method224();
        method98();
        for (int var0 = 0; var0 < field591; var0++) {
            int var1 = field585[var0];
            class25 var2 = field505[var1];
            int var3 = field498.method2436();
            if ((var3 & 0x8) != 0) {
                int var4 = field498.method2436();
                int var5 = field498.method2436();
                var2.method244(var4, var5, field477);
                var2.field428 = field477 + 300;
                var2.field429 = field498.method2460();
                var2.field407 = field498.method2436();
            }
            if ((var3 & 0x40) != 0) {
                var2.field432 = field498.method2467();
                var2.field433 = field498.method2467();
            }
            if ((var3 & 0x2) != 0) {
                var2.field414 = field498.method2469();
                int var6 = field498.method2475();
                var2.field427 = var6 >> 16;
                var2.field445 = (var6 & 0xFFFF) + field477;
                var2.field416 = 0;
                var2.field450 = 0;
                if (var2.field445 > field477) {
                    var2.field416 = -1;
                }
                if (var2.field414 == 65535) {
                    var2.field414 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field389 = class31.method120(field498.method2572());
                var2.field411 = var2.field389.field769;
                var2.field458 = var2.field389.field792;
                var2.field415 = var2.field389.field763;
                var2.field413 = var2.field389.field776;
                var2.field422 = var2.field389.field791;
                var2.field418 = var2.field389.field778;
                var2.field444 = var2.field389.field774;
                var2.field434 = var2.field389.field773;
                var2.field409 = var2.field389.field765;
            }
            if ((var3 & 0x1) != 0) {
                int var7 = field498.method2577();
                int var8 = field498.method2460();
                var2.method244(var7, var8, field477);
                var2.field428 = field477 + 300;
                var2.field429 = field498.method2577();
                var2.field407 = field498.method2577();
            }
            if ((var3 & 0x4) != 0) {
                var2.field420 = field498.method2444();
                var2.field455 = 100;
            }
            if ((var3 & 0x10) != 0) {
                int var9 = field498.method2467();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field498.method2545();
                if (var2.field437 == var9 && var9 != -1) {
                    int var11 = class34.method215(var9).field880;
                    if (var11 == 1) {
                        var2.field438 = 0;
                        var2.field439 = 0;
                        var2.field440 = var10;
                        var2.field441 = 0;
                    }
                    if (var11 == 2) {
                        var2.field441 = 0;
                    }
                } else if (var9 == -1 || var2.field437 == -1 || class34.method215(var9).field873 >= class34.method215(var2.field437).field873) {
                    var2.field437 = var9;
                    var2.field438 = 0;
                    var2.field439 = 0;
                    var2.field440 = var10;
                    var2.field441 = 0;
                    var2.field464 = var2.field459;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field431 = field498.method2469();
                if (var2.field431 == 65535) {
                    var2.field431 = -1;
                }
            }
        }
        for (int var12 = 0; var12 < field596; var12++) {
            int var13 = field486[var12];
            if (field477 != field505[var13].field454) {
                field505[var13].field389 = null;
                field505[var13] = null;
            }
        }
        if (field512 != field498.field2027) {
            throw new RuntimeException(field498.field2027 + class2.field25 + field512);
        }
        for (int var14 = 0; var14 < field506; var14++) {
            if (field505[field507[var14]] == null) {
                throw new RuntimeException(var14 + class2.field25 + field506);
            }
        }
    }

    @ObfuscatedName("i.bf(B)V")
    public static final void method224() {
        field498.method2315();
        int var0 = field498.method2309(8);
        if (var0 < field506) {
            for (int var1 = var0; var1 < field506; var1++) {
                field486[++field596 - 1] = field507[var1];
            }
        }
        if (var0 > field506) {
            throw new RuntimeException("");
        }
        field506 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field507[var2];
            class25 var4 = field505[var3];
            int var5 = field498.method2309(1);
            if (var5 == 0) {
                field507[++field506 - 1] = var3;
                var4.field454 = field477;
            } else {
                int var6 = field498.method2309(2);
                if (var6 == 0) {
                    field507[++field506 - 1] = var3;
                    var4.field454 = field477;
                    field585[++field591 - 1] = var3;
                } else if (var6 == 1) {
                    field507[++field506 - 1] = var3;
                    var4.field454 = field477;
                    int var7 = field498.method2309(3);
                    var4.method247(var7, false);
                    int var8 = field498.method2309(1);
                    if (var8 == 1) {
                        field585[++field591 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field507[++field506 - 1] = var3;
                    var4.field454 = field477;
                    int var9 = field498.method2309(3);
                    var4.method247(var9, true);
                    int var10 = field498.method2309(3);
                    var4.method247(var10, true);
                    int var11 = field498.method2309(1);
                    if (var11 == 1) {
                        field585[++field591 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field486[++field596 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("d.bv(I)V")
    public static final void method98() {
        while (true) {
            if (field498.method2311(field512) >= 27) {
                int var0 = field498.method2309(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field505[var0] == null) {
                        field505[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field505[var0];
                    field507[++field506 - 1] = var0;
                    var2.field454 = field477;
                    int var3 = field498.method2309(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field498.method2309(1);
                    int var5 = field498.method2309(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field523[field498.method2309(3)];
                    if (var1) {
                        var2.field456 = var2.field453 = var6;
                    }
                    var2.field389 = class31.method120(field498.method2309(14));
                    int var7 = field498.method2309(1);
                    if (var7 == 1) {
                        field585[++field591 - 1] = var0;
                    }
                    var2.field411 = var2.field389.field769;
                    var2.field458 = var2.field389.field792;
                    if (var2.field458 == 0) {
                        var2.field453 = 0;
                    }
                    var2.field415 = var2.field389.field763;
                    var2.field413 = var2.field389.field776;
                    var2.field422 = var2.field389.field791;
                    var2.field418 = var2.field389.field778;
                    var2.field444 = var2.field389.field774;
                    var2.field434 = var2.field389.field773;
                    var2.field409 = var2.field389.field765;
                    var2.method245(Statics.field52.field460[0] + var3, Statics.field52.field461[0] + var5, var4 == 1);
                    continue;
                }
            }
            field498.method2310();
            return;
        }
    }

    @ObfuscatedName("a.bd(III)V")
    public static final void method32(int arg0, int arg1) {
        if (field524 < 2 && field622 == 0 && !field575) {
            return;
        }
        String var2;
        if (field622 == 1 && field524 < 2) {
            var2 = class135.field2238 + class135.field2248 + field623 + " " + class2.field20;
        } else if (field575 && field524 < 2) {
            var2 = field614 + class135.field2248 + field722 + " " + class2.field20;
        } else {
            var2 = method542(field524 - 1);
        }
        if (field524 > 2) {
            var2 = var2 + class2.method1496(16777215) + " " + '/' + " " + (field524 - 2) + class135.field2242;
        }
        Statics.field1840.method3380(var2, arg0 + 4, arg1 + 15, 16777215, 0, field477 / 1000);
    }

    @ObfuscatedName("dd.bt(IIIII)V")
    public static final void method2177(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field468; var4++) {
            if (field676[var4] + field611[var4] > arg0 && field611[var4] < arg0 + arg2 && field677[var4] + field606[var4] > arg1 && field606[var4] < arg1 + arg3) {
                field671[var4] = true;
            }
        }
    }

    @ObfuscatedName("t.be(I)V")
    public static final void method123() {
        if (Statics.field11 != null || field639 != null) {
            return;
        }
        int var12;
        int var13;
        label161: {
            int var0 = class77.field1385;
            if (field610) {
                if (var0 != 1) {
                    int var1 = class77.field1379;
                    int var2 = class77.field1380;
                    if (var1 < Statics.field1306 - 10 || var1 > Statics.field1306 + Statics.field1259 + 10 || var2 < Statics.field2579 - 10 || var2 > Statics.field2579 + Statics.field1100 + 10) {
                        field610 = false;
                        method2177(Statics.field1306, Statics.field2579, Statics.field1259, Statics.field1100);
                    }
                }
                if (var0 == 1) {
                    int var3 = Statics.field1306;
                    int var4 = Statics.field2579;
                    int var5 = Statics.field1259;
                    int var6 = class77.field1386;
                    int var7 = class77.field1381;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field524; var9++) {
                        int var10 = (field524 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method38(var8);
                    }
                    field610 = false;
                    method2177(Statics.field1306, Statics.field2579, Statics.field1259, Statics.field1100);
                }
            } else {
                if (var0 == 1 && field524 > 0) {
                    int var11 = field509[field524 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field612[field524 - 1];
                        var13 = field613[field524 - 1];
                        class159 var14 = class159.method2352(var13);
                        int var15 = method256(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label161;
                        }
                        class163 var10000 = (class163) null;
                        if (class163.method628(method256(var14))) {
                            break label161;
                        }
                    }
                }
                if (var0 == 1 && (field537 == 1 && field524 > 2 || method565(field524 - 1))) {
                    var0 = 2;
                }
                if (var0 == 1 && field524 > 0) {
                    method38(field524 - 1);
                }
                if (var0 == 2 && field524 > 0) {
                    method134();
                }
            }
            return;
        }
        if (Statics.field11 != null && !field699 && field537 != 1 && !method565(field524 - 1) && field524 > 0) {
            method38(field524 - 1);
        }
        field699 = false;
        field586 = 0;
        if (Statics.field11 != null) {
            method2180(Statics.field11);
        }
        Statics.field11 = class159.method2352(var13);
        field581 = var12;
        field582 = class77.field1386;
        field583 = class77.field1381;
        method2180(Statics.field11);
    }

    @ObfuscatedName("r.bq(B)V")
    public static final void method134() {
        int var0 = Statics.field1840.method3370(class135.field2302);
        for (int var1 = 0; var1 < field524; var1++) {
            int var2 = Statics.field1840.method3370(method542(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field524 * 15 + 21;
        int var4 = class77.field1386 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1381;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field610 = true;
        Statics.field1306 = var4;
        Statics.field2579 = var5;
        Statics.field1259 = var0;
        Statics.field1100 = field524 * 15 + 22;
    }

    @ObfuscatedName("ax.ba(II)Z")
    public static final boolean method565(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field509[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("h.bp(IB)V")
    public static final void method38(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field612[arg0];
        int var2 = field613[arg0];
        int var3 = field509[arg0];
        int var4 = field615[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 26) {
            field602.method2306(67);
            for (class4 var5 = (class4) field629.method3294(); var5 != null; var5 = (class4) field629.method3302()) {
                if (var5.field55 == 0 || var5.field55 == 3) {
                    method219(var5, true);
                }
            }
            if (field632 != null) {
                method2180(field632);
                field632 = null;
            }
        }
        if (var3 == 24) {
            class159 var6 = class159.method2352(var2);
            boolean var7 = true;
            if (var6.field2612 > 0) {
                var7 = method2111(var6);
            }
            if (var7) {
                field602.method2306(224);
                field602.method2425(var2);
            }
        }
        if (var3 == 1005) {
            class159 var8 = class159.method2352(var2);
            if (var8 == null || var8.field2711[var1] < 100000) {
                field602.method2306(79);
                field602.method2441(var4);
            } else {
                method35(0, "", var8.field2711[var1] + " x " + class40.method672(var4).field1008);
            }
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 20) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(162);
            field602.method2465(Statics.field932 + var2);
            field602.method2464(Statics.field56 + var1);
            field602.method2465(var4);
        }
        if (var3 == 46) {
            class3 var9 = field511[var4];
            if (var9 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(207);
                field602.method2465(var4);
            }
        }
        if (var3 == 8) {
            class25 var10 = field505[var4];
            if (var10 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(200);
                field602.method2465(var4);
                field602.method2465(field646);
                field602.method2456(Statics.field295);
            }
        }
        if (var3 == 48) {
            class3 var11 = field511[var4];
            if (var11 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(234);
                field602.method2465(var4);
            }
        }
        if (var3 == 4) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(145);
            field602.method2423(var4 >> 14 & 0x7FFF);
            field602.method2441(Statics.field932 + var2);
            field602.method2423(Statics.field56 + var1);
        }
        if (var3 == 30 && field632 == null) {
            method873(var2, var1);
            field632 = class159.method3099(var2, var1);
            method2180(field632);
        }
        if (var3 == 22) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(3);
            field602.method2464(Statics.field932 + var2);
            field602.method2423(var4);
            field602.method2441(Statics.field56 + var1);
        }
        if (var3 == 35) {
            field602.method2306(197);
            field602.method2441(var1);
            field602.method2465(var4);
            field602.method2474(var2);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 23) {
            Statics.field1423.method2008(Statics.field263, var1, var2);
        }
        if (var3 == 11) {
            class25 var12 = field505[var4];
            if (var12 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(81);
                field602.method2441(var4);
            }
        }
        if (var3 == 58) {
            field602.method2306(56);
            field602.method2425(var2);
            field602.method2441(var1);
            field602.method2456(Statics.field295);
            field602.method2441(field646);
        }
        if (var3 == 13) {
            class25 var13 = field505[var4];
            if (var13 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(21);
                field602.method2465(var4);
            }
        }
        if (var3 == 32) {
            field602.method2306(230);
            field602.method2456(Statics.field295);
            field602.method2456(var2);
            field602.method2465(var1);
            field602.method2423(field646);
            field602.method2441(var4);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 39) {
            field602.method2306(161);
            field602.method2441(var1);
            field602.method2465(var4);
            field602.method2473(var2);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            String var14 = field510[arg0];
            class159 var15 = class159.method3099(var2, var1);
            if (var15 != null) {
                if (var15.field2712 != null) {
                    class1 var16 = new class1();
                    var16.field7 = var15;
                    var16.field18 = var4;
                    var16.field9 = var14;
                    var16.field15 = var15.field2712;
                    class26.method1(var16);
                }
                boolean var17 = true;
                if (var15.field2612 > 0) {
                    var17 = method2111(var15);
                }
                if (var17 && class163.method208(method256(var15), var4 - 1)) {
                    if (var4 == 1) {
                        field602.method2306(174);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 2) {
                        field602.method2306(244);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 3) {
                        field602.method2306(6);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 4) {
                        field602.method2306(164);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 5) {
                        field602.method2306(100);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 6) {
                        field602.method2306(39);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 7) {
                        field602.method2306(198);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 8) {
                        field602.method2306(107);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 9) {
                        field602.method2306(104);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                    if (var4 == 10) {
                        field602.method2306(206);
                        field602.method2425(var2);
                        field602.method2423(var1);
                    }
                }
            }
        }
        if (var3 == 40) {
            field602.method2306(26);
            field602.method2465(var4);
            field602.method2465(var1);
            field602.method2456(var2);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 15) {
            class3 var18 = field511[var4];
            if (var18 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(213);
                field602.method2474(Statics.field295);
                field602.method2423(field646);
                field602.method2423(var4);
            }
        }
        if (var3 == 50) {
            class3 var19 = field511[var4];
            if (var19 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(36);
                field602.method2423(var4);
            }
        }
        if (var3 == 5) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(92);
            field602.method2441(Statics.field56 + var1);
            field602.method2464(Statics.field932 + var2);
            field602.method2465(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 37) {
            field602.method2306(223);
            field602.method2464(var1);
            field602.method2423(var4);
            field602.method2456(var2);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 47) {
            class3 var20 = field511[var4];
            if (var20 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(118);
                field602.method2441(var4);
            }
        }
        if (var3 == 16) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(52);
            field602.method2441(Statics.field56 + var1);
            field602.method2464(var4);
            field602.method2464(Statics.field16);
            field602.method2456(Statics.field896);
            field602.method2441(Statics.field116);
            field602.method2423(Statics.field932 + var2);
        }
        if (var3 == 1) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(179);
            field602.method2464(Statics.field116);
            field602.method2425(Statics.field896);
            field602.method2423(var4 >> 14 & 0x7FFF);
            field602.method2423(Statics.field56 + var1);
            field602.method2423(Statics.field932 + var2);
            field602.method2441(Statics.field16);
        }
        if (var3 == 14) {
            class3 var21 = field511[var4];
            if (var21 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(217);
                field602.method2474(Statics.field896);
                field602.method2464(Statics.field116);
                field602.method2464(Statics.field16);
                field602.method2464(var4);
            }
        }
        if (var3 == 25) {
            class159 var22 = class159.method3099(var2, var1);
            if (var22 != null) {
                method2();
                int var25 = method256(var22);
                int var26 = var25 >> 11 & 0x3F;
                method2848(var2, var1, var26);
                field622 = 0;
                int var27 = method256(var22);
                int var28 = var27 >> 11 & 0x3F;
                String var29;
                if (var28 == 0) {
                    var29 = null;
                } else if (var22.field2674 == null || var22.field2674.trim().length() == 0) {
                    var29 = null;
                } else {
                    var29 = var22.field2674;
                }
                field614 = var29;
                if (field614 == null) {
                    field614 = "Null";
                }
                if (var22.field2607) {
                    field722 = var22.field2628 + class2.method1496(16777215);
                } else {
                    field722 = class2.method1496(65280) + var22.field2659 + class2.method1496(16777215);
                }
            }
            return;
        }
        if (var3 == 31) {
            field602.method2306(0);
            field602.method2473(Statics.field896);
            field602.method2423(Statics.field116);
            field602.method2464(var4);
            field602.method2473(var2);
            field602.method2465(Statics.field16);
            field602.method2464(var1);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 17) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(202);
            field602.method2423(field646);
            field602.method2473(Statics.field295);
            field602.method2464(Statics.field56 + var1);
            field602.method2464(Statics.field932 + var2);
            field602.method2423(var4);
        }
        if (var3 == 43) {
            field602.method2306(142);
            field602.method2425(var2);
            field602.method2423(var4);
            field602.method2423(var1);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 2) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(123);
            field602.method2425(Statics.field295);
            field602.method2465(var4 >> 14 & 0x7FFF);
            field602.method2423(field646);
            field602.method2423(Statics.field932 + var2);
            field602.method2423(Statics.field56 + var1);
        }
        if (var3 == 7) {
            class25 var30 = field505[var4];
            if (var30 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(109);
                field602.method2423(var4);
                field602.method2423(Statics.field16);
                field602.method2441(Statics.field116);
                field602.method2474(Statics.field896);
            }
        }
        if (var3 == 19) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(178);
            field602.method2465(Statics.field56 + var1);
            field602.method2441(var4);
            field602.method2465(Statics.field932 + var2);
        }
        if (var3 == 1002) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field602.method2306(166);
            field602.method2441(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 42) {
            field602.method2306(193);
            field602.method2465(var4);
            field602.method2465(var1);
            field602.method2473(var2);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 33) {
            field602.method2306(250);
            field602.method2465(var1);
            field602.method2425(var2);
            field602.method2423(var4);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 44) {
            class3 var31 = field511[var4];
            if (var31 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(37);
                field602.method2441(var4);
            }
        }
        if (var3 == 45) {
            class3 var32 = field511[var4];
            if (var32 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(133);
                field602.method2441(var4);
            }
        }
        if (var3 == 21) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(192);
            field602.method2465(Statics.field56 + var1);
            field602.method2464(var4);
            field602.method2464(Statics.field932 + var2);
        }
        if (var3 == 49) {
            class3 var33 = field511[var4];
            if (var33 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(12);
                field602.method2441(var4);
            }
        }
        if (var3 == 1004) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field602.method2306(79);
            field602.method2441(var4);
        }
        if (var3 == 34) {
            field602.method2306(218);
            field602.method2465(var4);
            field602.method2465(var1);
            field602.method2425(var2);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 29) {
            field602.method2306(224);
            field602.method2425(var2);
            class159 var34 = class159.method2352(var2);
            if (var34.field2695 != null && var34.field2695[0][0] == 5) {
                int var35 = var34.field2695[0][1];
                if (class160.field2726[var35] != var34.field2706[0]) {
                    class160.field2726[var35] = var34.field2706[0];
                    method93(var35);
                }
            }
        }
        if (var3 == 41) {
            field602.method2306(226);
            field602.method2473(var2);
            field602.method2465(var1);
            field602.method2465(var4);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 1003) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            class25 var36 = field505[var4];
            if (var36 != null) {
                class31 var37 = var36.field389;
                if (var37.field793 != null) {
                    var37 = var37.method630();
                }
                if (var37 != null) {
                    field602.method2306(110);
                    field602.method2441(var37.field767);
                }
            }
        }
        if (var3 == 10) {
            class25 var38 = field505[var4];
            if (var38 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(9);
                field602.method2464(var4);
            }
        }
        if (var3 == 28) {
            field602.method2306(224);
            field602.method2425(var2);
            class159 var39 = class159.method2352(var2);
            if (var39.field2695 != null && var39.field2695[0][0] == 5) {
                int var40 = var39.field2695[0][1];
                class160.field2726[var40] = 1 - class160.field2726[var40];
                method93(var40);
            }
        }
        if (var3 == 12) {
            class25 var41 = field505[var4];
            if (var41 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(130);
                field602.method2465(var4);
            }
        }
        if (var3 == 36) {
            field602.method2306(253);
            field602.method2465(var4);
            field602.method2474(var2);
            field602.method2465(var1);
            field579 = 0;
            Statics.field279 = class159.method2352(var2);
            field626 = var1;
        }
        if (var3 == 51) {
            class3 var42 = field511[var4];
            if (var42 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(255);
                field602.method2464(var4);
            }
        }
        if (var3 == 38) {
            method2();
            class159 var43 = class159.method2352(var2);
            field622 = 1;
            Statics.field116 = var1;
            Statics.field896 = var2;
            Statics.field16 = var4;
            method2180(var43);
            field623 = class2.method1496(16748608) + class40.method672(var4).field1008 + class2.method1496(16777215);
            if (field623 == null) {
                field623 = "null";
            }
            return;
        }
        if (var3 == 1001) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(69);
            field602.method2465(Statics.field932 + var2);
            field602.method2465(var4 >> 14 & 0x7FFF);
            field602.method2423(Statics.field56 + var1);
        }
        if (var3 == 6) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(80);
            field602.method2464(Statics.field932 + var2);
            field602.method2464(Statics.field56 + var1);
            field602.method2423(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 9) {
            class25 var44 = field505[var4];
            if (var44 != null) {
                field661 = class77.field1386;
                field576 = class77.field1381;
                field578 = 2;
                field577 = 0;
                field700 = var1;
                field666 = var2;
                field602.method2306(35);
                field602.method2441(var4);
            }
        }
        if (var3 == 18) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(96);
            field602.method2423(Statics.field56 + var1);
            field602.method2441(var4);
            field602.method2441(Statics.field932 + var2);
        }
        if (var3 == 3) {
            field661 = class77.field1386;
            field576 = class77.field1381;
            field578 = 2;
            field577 = 0;
            field700 = var1;
            field666 = var2;
            field602.method2306(93);
            field602.method2441(Statics.field56 + var1);
            field602.method2441(var4 >> 14 & 0x7FFF);
            field602.method2423(Statics.field932 + var2);
        }
        if (field622 != 0) {
            field622 = 0;
            method2180(class159.method2352(Statics.field896));
        }
        if (field575) {
            method2();
        }
        if (Statics.field279 != null && field579 == 0) {
            method2180(Statics.field279);
        }
    }

    @ObfuscatedName("v.bm(ILjava/lang/String;I)V")
    public static void method146(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field589; var3++) {
            class3 var4 = field511[field590[var3]];
            if (var4 != null && var4.field32 != null && var4.field32.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field602.method2306(37);
                    field602.method2441(field590[var3]);
                } else if (arg0 == 4) {
                    field602.method2306(118);
                    field602.method2441(field590[var3]);
                } else if (arg0 == 6) {
                    field602.method2306(12);
                    field602.method2441(field590[var3]);
                } else if (arg0 == 7) {
                    field602.method2306(36);
                    field602.method2423(field590[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method35(0, "", class135.field2237 + arg1);
        }
    }

    @ObfuscatedName("es.bg(IIII)V")
    public static void method2848(int arg0, int arg1, int arg2) {
        class159 var3 = class159.method3099(arg0, arg1);
        if (var3 != null && var3.field2662 != null) {
            class1 var4 = new class1();
            var4.field7 = var3;
            var4.field15 = var3.field2662;
            class26.method1(var4);
        }
        field575 = true;
        Statics.field295 = arg0;
        field646 = arg1;
        Statics.field1242 = arg2;
        method2180(var3);
    }

    @ObfuscatedName("b.bw(B)V")
    public static void method2() {
        if (!field575) {
            return;
        }
        class159 var0 = class159.method3099(Statics.field295, field646);
        if (var0 != null && var0.field2687 != null) {
            class1 var1 = new class1();
            var1.field7 = var0;
            var1.field15 = var0.field2687;
            class26.method1(var1);
        }
        field575 = false;
        method2180(var0);
    }

    @ObfuscatedName("af.bc(III)V")
    public static void method873(int arg0, int arg1) {
        field602.method2306(191);
        field602.method2423(arg1);
        field602.method2456(arg0);
    }

    @ObfuscatedName("ab.bs(I)V")
    public static final void method720() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field524 - 1; var1++) {
                if (field509[var1] < 1000 && field509[var1 + 1] > 1000) {
                    String var2 = field510[var1];
                    field510[var1] = field510[var1 + 1];
                    field510[var1 + 1] = var2;
                    String var3 = field616[var1];
                    field616[var1] = field616[var1 + 1];
                    field616[var1 + 1] = var3;
                    int var4 = field509[var1];
                    field509[var1] = field509[var1 + 1];
                    field509[var1 + 1] = var4;
                    int var5 = field612[var1];
                    field612[var1] = field612[var1 + 1];
                    field612[var1 + 1] = var5;
                    int var6 = field613[var1];
                    field613[var1] = field613[var1 + 1];
                    field613[var1 + 1] = var6;
                    int var7 = field615[var1];
                    field615[var1] = field615[var1 + 1];
                    field615[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("fw.by(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3240(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field610 || field524 >= 500) {
            return;
        }
        field616[field524] = arg0;
        field510[field524] = arg1;
        field509[field524] = arg2;
        field615[field524] = arg3;
        field612[field524] = arg4;
        field613[field524] = arg5;
        field524++;
    }

    @ObfuscatedName("di.bk(B)V")
    public static void method2200() {
        for (int var0 = 0; var0 < field524; var0++) {
            int var1 = field509[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field524 - 1) {
                    for (int var3 = var0; var3 < field524 - 1; var3++) {
                        field616[var3] = field616[var3 + 1];
                        field510[var3] = field510[var3 + 1];
                        field509[var3] = field509[var3 + 1];
                        field615[var3] = field615[var3 + 1];
                        field612[var3] = field612[var3 + 1];
                        field613[var3] = field613[var3 + 1];
                    }
                }
                field524--;
            }
        }
    }

    @ObfuscatedName("client.bz(IB)Ljava/lang/String;")
    public static String method542(int arg0) {
        return field510[arg0].length() > 0 ? field616[arg0] + class135.field2248 + field510[arg0] : field616[arg0];
    }

    @ObfuscatedName("h.bb(IIIII)V")
    public static final void method36(int arg0, int arg1, int arg2, int arg3) {
        if (field622 == 0 && !field575) {
            method3240(class135.field2243, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1900; var5++) {
            int var6 = class112.field1863[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1423.method1966(Statics.field263, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method48(var10);
                    if (var11.field842 != null) {
                        var11 = var11.method641();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field622 == 1) {
                        method3240(class135.field2238, field623 + " " + class2.field20 + " " + class2.method1496(65535) + var11.field811, 1, var6, var7, var8);
                    } else if (!field575) {
                        String[] var12 = var11.field828;
                        if (field638) {
                            var12 = method2026(var12);
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
                                    method3240(var12[var13], class2.method1496(65535) + var11.field811, var14, var6, var7, var8);
                                }
                            }
                        }
                        method3240(class135.field2239, class2.method1496(65535) + var11.field811, 1002, var11.field829 << 14, var7, var8);
                    } else if ((Statics.field1242 & 0x4) == 4) {
                        method3240(field614, field722 + " " + class2.field20 + " " + class2.method1496(65535) + var11.field811, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field505[var10];
                    if (var15.field389.field769 == 1 && (var15.field443 & 0x7F) == 64 && (var15.field408 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field506; var16++) {
                            class25 var17 = field505[field507[var16]];
                            if (var17 != null && var15 != var17 && var17.field389.field769 == 1 && var15.field443 == var17.field443 && var15.field408 == var17.field408) {
                                method746(var17.field389, field507[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field589; var18++) {
                            class3 var19 = field511[field590[var18]];
                            if (var19 != null && var15.field443 == var19.field443 && var15.field408 == var19.field408) {
                                method1490(var19, field590[var18], var7, var8);
                            }
                        }
                    }
                    method746(var15.field389, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field511[var10];
                    if ((var20.field443 & 0x7F) == 64 && (var20.field408 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field506; var21++) {
                            class25 var22 = field505[field507[var21]];
                            if (var22 != null && var22.field389.field769 == 1 && var20.field443 == var22.field443 && var20.field408 == var22.field408) {
                                method746(var22.field389, field507[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field589; var23++) {
                            class3 var24 = field511[field590[var23]];
                            if (var24 != null && var20 != var24 && var20.field443 == var24.field443 && var20.field408 == var24.field408) {
                                method1490(var24, field590[var23], var7, var8);
                            }
                        }
                    }
                    method1490(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field656[Statics.field263][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3307(); var26 != null; var26 = (class17) var25.method3317()) {
                            class40 var27 = class40.method672(var26.field260);
                            if (field622 == 1) {
                                method3240(class135.field2238, field623 + " " + class2.field20 + " " + class2.method1496(16748608) + var27.field1008, 16, var26.field260, var7, var8);
                            } else if (!field575) {
                                String[] var28 = var27.field997;
                                if (field638) {
                                    var28 = method2026(var28);
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
                                        method3240(var28[var29], class2.method1496(16748608) + var27.field1008, var30, var26.field260, var7, var8);
                                    } else if (var29 == 2) {
                                        method3240(class135.field2098, class2.method1496(16748608) + var27.field1008, 20, var26.field260, var7, var8);
                                    }
                                }
                                method3240(class135.field2239, class2.method1496(16748608) + var27.field1008, 1004, var26.field260, var7, var8);
                            } else if ((Statics.field1242 & 0x1) == 1) {
                                method3240(field614, field722 + " " + class2.field20 + " " + class2.method1496(16748608) + var27.field1008, 17, var26.field260, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aw.cp(Laq;IIIB)V")
    public static final void method746(class31 arg0, int arg1, int arg2, int arg3) {
        if (field524 >= 400) {
            return;
        }
        if (arg0.field793 != null) {
            arg0 = arg0.method630();
        }
        if (arg0 == null || !arg0.field796) {
            return;
        }
        String var4 = arg0.field768;
        if (arg0.field775 != 0) {
            int var6 = arg0.field775;
            int var7 = Statics.field52.field35;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method1496(16711680);
            } else if (var8 < -6) {
                var9 = class2.method1496(16723968);
            } else if (var8 < -3) {
                var9 = class2.method1496(16740352);
            } else if (var8 < 0) {
                var9 = class2.method1496(16756736);
            } else if (var8 > 9) {
                var9 = class2.method1496(65280);
            } else if (var8 > 6) {
                var9 = class2.method1496(4259584);
            } else if (var8 > 3) {
                var9 = class2.method1496(8453888);
            } else if (var8 > 0) {
                var9 = class2.method1496(12648192);
            } else {
                var9 = class2.method1496(16776960);
            }
            var4 = var4 + var9 + " " + class2.field21 + class135.field2282 + arg0.field775 + class2.field24;
        }
        if (field622 == 1) {
            method3240(class135.field2238, field623 + " " + class2.field20 + " " + class2.method1496(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field575) {
            String[] var10 = arg0.field786;
            if (field638) {
                var10 = method2026(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class135.field2240)) {
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
                        method3240(var10[var11], class2.method1496(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class135.field2240)) {
                        short var14 = 0;
                        if (arg0.field775 > Statics.field52.field35) {
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
                        method3240(var10[var13], class2.method1496(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method3240(class135.field2239, class2.method1496(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1242 & 0x2) == 2) {
            method3240(field614, field722 + " " + class2.field20 + " " + class2.method1496(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("bs.ch(Lg;IIIB)V")
    public static final void method1490(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field52 == arg0 || field524 >= 400) {
            return;
        }
        String var9;
        if (arg0.field36 == 0) {
            String var4 = arg0.field32;
            int var5 = arg0.field35;
            int var6 = Statics.field52.field35;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method1496(16711680);
            } else if (var7 < -6) {
                var8 = class2.method1496(16723968);
            } else if (var7 < -3) {
                var8 = class2.method1496(16740352);
            } else if (var7 < 0) {
                var8 = class2.method1496(16756736);
            } else if (var7 > 9) {
                var8 = class2.method1496(65280);
            } else if (var7 > 6) {
                var8 = class2.method1496(4259584);
            } else if (var7 > 3) {
                var8 = class2.method1496(8453888);
            } else if (var7 > 0) {
                var8 = class2.method1496(12648192);
            } else {
                var8 = class2.method1496(16776960);
            }
            var9 = var4 + var8 + " " + class2.field21 + class135.field2282 + arg0.field35 + class2.field24;
        } else {
            var9 = arg0.field32 + " " + class2.field21 + class135.field2166 + arg0.field36 + class2.field24;
        }
        if (field622 == 1) {
            method3240(class135.field2238, field623 + " " + class2.field20 + " " + class2.method1496(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field575) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field599[var10] != null) {
                    short var11 = 0;
                    if (field599[var10].equalsIgnoreCase(class135.field2240)) {
                        if (arg0.field35 > Statics.field52.field35) {
                            var11 = 2000;
                        }
                        if (Statics.field52.field49 != 0 && arg0.field49 != 0) {
                            if (Statics.field52.field49 == arg0.field49) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field669[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field598[var10] + var11;
                    method3240(field599[var10], class2.method1496(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1242 & 0x8) == 8) {
            method3240(field614, field722 + " " + class2.field20 + " " + class2.method1496(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field524; var14++) {
            if (field509[var14] == 23) {
                field510[var14] = class2.method1496(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bg.cr(Ljava/lang/String;Lfh;I)Ljava/lang/String;")
    public static String method1388(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method129(arg1, var2 - 1);
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
                if (Statics.field1786 != null) {
                    int var9 = Statics.field1786.field1394;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1786.field1397 != null) {
                        var8 = (String) Statics.field1786.field1397;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("z.ca(II)Ljava/lang/String;")
    public static final String method103(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field25 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1496(65408) + var1.substring(0, var1.length() - 8) + class135.field2150 + " " + class2.field21 + var1 + class2.field24 + class2.field27;
        } else if (var1.length() > 6) {
            return " " + class2.method1496(16777215) + var1.substring(0, var1.length() - 4) + class135.field2251 + " " + class2.field21 + var1 + class2.field24 + class2.field27;
        } else {
            return " " + class2.method1496(16776960) + var1 + class2.field27;
        }
    }

    @ObfuscatedName("at.cs(Lfh;IIIIIIB)V")
    public static final void method251(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field550) {
            field607 = 32;
        } else {
            field607 = 0;
        }
        field550 = false;
        if (class77.field1378 == 1) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2622 -= 4;
                method2180(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2622 += 4;
                method2180(arg0);
            } else if (arg5 >= arg1 - field607 && arg5 < field607 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2622 = (arg4 - arg3) * var8 / var9;
                method2180(arg0);
                field550 = true;
            }
        }
        if (field664 == 0) {
            return;
        }
        int var10 = arg0.field2617;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2622 += field664 * 45;
            method2180(arg0);
        }
    }

    @ObfuscatedName("a.cb(IIIIII)V")
    public static final void method31(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field386[0].method1759(arg0, arg1);
        Statics.field386[1].method1759(arg0, arg1 + arg3 - 16);
        class89.method1807(arg0, arg1 + 16, 16, arg3 - 32, field726);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1807(arg0, arg1 + 16 + var6, 16, var5, field547);
        class89.method1778(arg0, arg1 + 16 + var6, var5, field701);
        class89.method1778(arg0 + 1, arg1 + 16 + var6, var5, field701);
        class89.method1779(arg0, arg1 + 16 + var6, 16, field701);
        class89.method1779(arg0, arg1 + 17 + var6, 16, field701);
        class89.method1778(arg0 + 15, arg1 + 16 + var6, var5, field546);
        class89.method1778(arg0 + 14, arg1 + 17 + var6, var5 - 1, field546);
        class89.method1779(arg0, arg1 + 15 + var6 + var5, 16, field546);
        class89.method1779(arg0 + 1, arg1 + 14 + var6 + var5, 15, field546);
    }

    @ObfuscatedName("o.cv(Lfh;I)Z")
    public static final boolean method24(class159 arg0) {
        if (arg0.field2611 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2611.length; var1++) {
            int var2 = method129(arg0, var1);
            int var3 = arg0.field2706[var1];
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

    @ObfuscatedName("w.cy(Lfh;II)I")
    public static final int method129(class159 arg0, int arg1) {
        if (arg0.field2695 == null || arg1 >= arg0.field2695.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2695[arg1];
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
                    var7 = field710[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field627[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field642[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method2352(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method672(var12).field986 || field472)) {
                        for (int var13 = 0; var13 < var11.field2710.length; var13++) {
                            if (var12 + 1 == var11.field2710[var13]) {
                                var7 += var11.field2711[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2726[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2065[field627[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2726[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field52.field35;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2063[var14]) {
                            var7 += field627[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method2352(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method672(var18).field986 || field472)) {
                        for (int var19 = 0; var19 < var17.field2710.length; var19++) {
                            if (var18 + 1 == var17.field2710[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field633;
                }
                if (var6 == 12) {
                    var7 = field634;
                }
                if (var6 == 13) {
                    int var20 = class160.field2726[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method748(var22);
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
                    var7 = (Statics.field52.field443 >> 7) + Statics.field56;
                }
                if (var6 == 19) {
                    var7 = (Statics.field52.field408 >> 7) + Statics.field932;
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

    @ObfuscatedName("i.cn(IIIIIIII)V")
    public static final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class159.method804(arg0)) {
            method2299(Statics.field2704[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("dy.cz([Lfh;IIIIIIII)V")
    public static final void method2299(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2607 || var9.field2610 == 0 || var9.field2675 || method256(var9) != 0 || field640 == var9) && var9.field2619 == arg1 && (!var9.field2607 || !method1343(var9))) {
                int var10 = var9.field2613 + arg6;
                int var11 = var9.field2649 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2610 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2610 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2617 + var10;
                    int var19 = var9.field2618 + var11;
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
                    int var22 = var9.field2617 + var10;
                    int var23 = var9.field2618 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field639 == var9) {
                    field647 = true;
                    field648 = var10;
                    field649 = var11;
                }
                if (!var9.field2607 || var12 < var14 && var13 < var15) {
                    if (var9.field2612 == 1337) {
                        method2180(var9);
                    } else if (var9.field2612 != 1338) {
                        if (var9.field2610 == 0) {
                            if (!var9.field2607 && method1343(var9) && Statics.field362 != var9) {
                                continue;
                            }
                            method2299(arg0, var9.field2661, var12, var13, var14, var15, var10 - var9.field2621, var11 - var9.field2622);
                            if (var9.field2694 != null) {
                                method2299(var9.field2694, var9.field2661, var12, var13, var14, var15, var10 - var9.field2621, var11 - var9.field2622);
                            }
                            class4 var35 = (class4) field629.method3291((long) var9.field2661);
                            if (var35 != null) {
                                method225(var35.field57, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2607) {
                            boolean var36;
                            if (class77.field1379 >= var12 && class77.field1380 >= var13 && class77.field1379 < var14 && class77.field1380 < var15) {
                                var36 = true;
                            } else {
                                var36 = false;
                            }
                            boolean var37 = false;
                            if (class77.field1378 == 1 && var36) {
                                var37 = true;
                            }
                            boolean var38 = false;
                            if (class77.field1385 == 1 && class77.field1386 >= var12 && class77.field1381 >= var13 && class77.field1386 < var14 && class77.field1381 < var15) {
                                var38 = true;
                            }
                            if (var38) {
                                method13(var9, class77.field1386 - var10, class77.field1381 - var11);
                            }
                            if (field639 != null && field639 != var9 && var36 && class163.method2849(method256(var9))) {
                                field643 = var9;
                            }
                            if (field640 == var9) {
                                field729 = true;
                                field645 = var10;
                                field542 = var11;
                            }
                            if (var9.field2675) {
                                if (var36 && field664 != 0 && var9.field2707 != null) {
                                    class1 var39 = new class1();
                                    var39.field7 = var9;
                                    var39.field4 = field664;
                                    var39.field15 = var9.field2707;
                                    field665.method3318(var39);
                                }
                                if (field639 != null || Statics.field11 != null || field610) {
                                    var38 = false;
                                    var37 = false;
                                    var36 = false;
                                }
                                if (!var9.field2718 && var38) {
                                    var9.field2718 = true;
                                    if (var9.field2713 != null) {
                                        class1 var40 = new class1();
                                        var40.field7 = var9;
                                        var40.field2 = class77.field1386 - var10;
                                        var40.field4 = class77.field1381 - var11;
                                        var40.field15 = var9.field2713;
                                        field665.method3318(var40);
                                    }
                                }
                                if (var9.field2718 && var37 && var9.field2678 != null) {
                                    class1 var41 = new class1();
                                    var41.field7 = var9;
                                    var41.field2 = class77.field1379 - var10;
                                    var41.field4 = class77.field1380 - var11;
                                    var41.field15 = var9.field2678;
                                    field665.method3318(var41);
                                }
                                if (var9.field2718 && !var37) {
                                    var9.field2718 = false;
                                    if (var9.field2679 != null) {
                                        class1 var42 = new class1();
                                        var42.field7 = var9;
                                        var42.field2 = class77.field1379 - var10;
                                        var42.field4 = class77.field1380 - var11;
                                        var42.field15 = var9.field2679;
                                        field667.method3318(var42);
                                    }
                                }
                                if (var37 && var9.field2680 != null) {
                                    class1 var43 = new class1();
                                    var43.field7 = var9;
                                    var43.field2 = class77.field1379 - var10;
                                    var43.field4 = class77.field1380 - var11;
                                    var43.field15 = var9.field2680;
                                    field665.method3318(var43);
                                }
                                if (!var9.field2717 && var36) {
                                    var9.field2717 = true;
                                    if (var9.field2681 != null) {
                                        class1 var44 = new class1();
                                        var44.field7 = var9;
                                        var44.field2 = class77.field1379 - var10;
                                        var44.field4 = class77.field1380 - var11;
                                        var44.field15 = var9.field2681;
                                        field665.method3318(var44);
                                    }
                                }
                                if (var9.field2717 && var36 && var9.field2682 != null) {
                                    class1 var45 = new class1();
                                    var45.field7 = var9;
                                    var45.field2 = class77.field1379 - var10;
                                    var45.field4 = class77.field1380 - var11;
                                    var45.field15 = var9.field2682;
                                    field665.method3318(var45);
                                }
                                if (var9.field2717 && !var36) {
                                    var9.field2717 = false;
                                    if (var9.field2635 != null) {
                                        class1 var46 = new class1();
                                        var46.field7 = var9;
                                        var46.field2 = class77.field1379 - var10;
                                        var46.field4 = class77.field1380 - var11;
                                        var46.field15 = var9.field2635;
                                        field667.method3318(var46);
                                    }
                                }
                                if (var9.field2625 != null) {
                                    class1 var47 = new class1();
                                    var47.field7 = var9;
                                    var47.field15 = var9.field2625;
                                    field719.method3318(var47);
                                }
                                if (var9.field2688 != null && field714 > var9.field2605) {
                                    if (var9.field2689 == null || field714 - var9.field2605 > 32) {
                                        class1 var52 = new class1();
                                        var52.field7 = var9;
                                        var52.field15 = var9.field2688;
                                        field665.method3318(var52);
                                    } else {
                                        label400: for (int var48 = var9.field2605; var48 < field714; var48++) {
                                            int var49 = field624[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2689.length; var50++) {
                                                if (var9.field2689[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field7 = var9;
                                                    var51.field15 = var9.field2688;
                                                    field665.method3318(var51);
                                                    break label400;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2605 = field714;
                                }
                                if (var9.field2698 != null && field655 > var9.field2721) {
                                    if (var9.field2623 == null || field655 - var9.field2721 > 32) {
                                        class1 var57 = new class1();
                                        var57.field7 = var9;
                                        var57.field15 = var9.field2698;
                                        field665.method3318(var57);
                                    } else {
                                        label380: for (int var53 = var9.field2721; var53 < field655; var53++) {
                                            int var54 = field654[var53 & 0x1F];
                                            for (int var55 = 0; var55 < var9.field2623.length; var55++) {
                                                if (var9.field2623[var55] == var54) {
                                                    class1 var56 = new class1();
                                                    var56.field7 = var9;
                                                    var56.field15 = var9.field2698;
                                                    field665.method3318(var56);
                                                    break label380;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2721 = field655;
                                }
                                if (var9.field2668 != null && field657 > var9.field2714) {
                                    if (var9.field2693 == null || field657 - var9.field2714 > 32) {
                                        class1 var62 = new class1();
                                        var62.field7 = var9;
                                        var62.field15 = var9.field2668;
                                        field665.method3318(var62);
                                    } else {
                                        label360: for (int var58 = var9.field2714; var58 < field657; var58++) {
                                            int var59 = field668[var58 & 0x1F];
                                            for (int var60 = 0; var60 < var9.field2693.length; var60++) {
                                                if (var9.field2693[var60] == var59) {
                                                    class1 var61 = new class1();
                                                    var61.field7 = var9;
                                                    var61.field15 = var9.field2668;
                                                    field665.method3318(var61);
                                                    break label360;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2714 = field657;
                                }
                                if (field658 > var9.field2719 && var9.field2683 != null) {
                                    class1 var63 = new class1();
                                    var63.field7 = var9;
                                    var63.field15 = var9.field2683;
                                    field665.method3318(var63);
                                }
                                if (field659 > var9.field2719 && var9.field2699 != null) {
                                    class1 var64 = new class1();
                                    var64.field7 = var9;
                                    var64.field15 = var9.field2699;
                                    field665.method3318(var64);
                                }
                                if (field660 > var9.field2719 && var9.field2700 != null) {
                                    class1 var65 = new class1();
                                    var65.field7 = var9;
                                    var65.field15 = var9.field2700;
                                    field665.method3318(var65);
                                }
                                if (field499 > var9.field2719 && var9.field2690 != null) {
                                    class1 var66 = new class1();
                                    var66.field7 = var9;
                                    var66.field15 = var9.field2690;
                                    field665.method3318(var66);
                                }
                                var9.field2719 = field651;
                                if (var9.field2685 != null) {
                                    for (int var67 = 0; var67 < field689; var67++) {
                                        class1 var68 = new class1();
                                        var68.field7 = var9;
                                        var68.field5 = field691[var67];
                                        var68.field3 = field690[var67];
                                        var68.field15 = var9.field2685;
                                        field665.method3318(var68);
                                    }
                                }
                            }
                        }
                        if (!var9.field2607) {
                            if (field639 != null || Statics.field11 != null || field610) {
                                return;
                            }
                            if ((var9.field2709 >= 0 || var9.field2627 != 0) && class77.field1379 >= var12 && class77.field1380 >= var13 && class77.field1379 < var14 && class77.field1380 < var15) {
                                if (var9.field2709 >= 0) {
                                    Statics.field362 = arg0[var9.field2709];
                                } else {
                                    Statics.field362 = var9;
                                }
                            }
                            if (var9.field2610 == 8 && class77.field1379 >= var12 && class77.field1380 >= var13 && class77.field1379 < var14 && class77.field1380 < var15) {
                                Statics.field956 = var9;
                            }
                            if (var9.field2624 > var9.field2618) {
                                method251(var9, var9.field2617 + var10, var11, var9.field2618, var9.field2624, class77.field1379, class77.field1380);
                            }
                        }
                    } else if ((field545 == 0 || field545 == 3) && class77.field1385 == 1) {
                        int var24 = class77.field1386 - 25 - var10;
                        int var25 = class77.field1381 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field702 + field675 & 0x7FF;
                            int var27 = class104.field1769[var26];
                            int var28 = class104.field1750[var26];
                            int var29 = (field730 + 256) * var27 >> 8;
                            int var30 = (field730 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field52.field443 + var31 >> 7;
                            int var34 = Statics.field52.field408 - var32 >> 7;
                            field602.method2306(228);
                            field602.method2422(18);
                            field602.method2441(Statics.field56 + var33);
                            field602.method2465(Statics.field932 + var34);
                            field602.method2583(class75.field1343[82] ? (class75.field1343[81] ? 2 : 1) : 0);
                            field602.method2422(var24);
                            field602.method2422(var25);
                            field602.method2423(field702);
                            field602.method2422(57);
                            field602.method2422(field675);
                            field602.method2422(field730);
                            field602.method2422(89);
                            field602.method2423(Statics.field52.field443);
                            field602.method2423(Statics.field52.field408);
                            field602.method2422(63);
                            field700 = var33;
                            field666 = var34;
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("u.cx(III)V")
    public static final void method238(int arg0, int arg1) {
        if (class159.method804(arg0)) {
            method204(Statics.field2704[arg0], arg1);
        }
    }

    @ObfuscatedName("p.cl([Lfh;IS)V")
    public static final void method204(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2610 == 0) {
                    if (var3.field2694 != null) {
                        method204(var3.field2694, arg1);
                    }
                    class4 var4 = (class4) field629.method3291((long) var3.field2661);
                    if (var4 != null) {
                        method238(var4.field57, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2702 != null) {
                    class1 var5 = new class1();
                    var5.field7 = var3;
                    var5.field15 = var3.field2702;
                    class26.method1(var5);
                }
                if (arg1 == 1 && var3.field2703 != null) {
                    if (var3.field2609 >= 0) {
                        class159 var6 = class159.method2352(var3.field2661);
                        if (var6 == null || var6.field2694 == null || var3.field2609 >= var6.field2694.length || var6.field2694[var3.field2609] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field7 = var3;
                    var7.field15 = var3.field2703;
                    class26.method1(var7);
                }
            }
        }
    }

    @ObfuscatedName("g.cg(Lfh;III)V")
    public static final void method13(class159 arg0, int arg1, int arg2) {
        if (field639 != null || field610 || arg0 == null || method92(arg0) == null) {
            return;
        }
        field639 = arg0;
        field640 = method92(arg0);
        field641 = arg1;
        field696 = arg2;
        Statics.field33 = 0;
        field650 = false;
    }

    @ObfuscatedName("dd.cj(Lfh;S)V")
    public static void method2180(class159 arg0) {
        if (field478 == arg0.field2724) {
            field671[arg0.field2723] = true;
        }
    }

    @ObfuscatedName("i.cf(I)V")
    public static void method221() {
        for (class4 var0 = (class4) field629.method3294(); var0 != null; var0 = (class4) field629.method3302()) {
            int var1 = var0.field57;
            if (class159.method804(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field2704[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2607;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2810;
                    class159 var6 = class159.method2352(var5);
                    if (var6 != null) {
                        method2180(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cq(Lfh;B)Lfh;")
    public static class159 method92(class159 arg0) {
        class159 var1 = arg0;
        int var2 = method256(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class159 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class159.method2352(var1.field2619);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class159 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2670;
        }
        return var7;
    }

    @ObfuscatedName("cd.cc([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2026(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("o.ci(II)V")
    public static final void method25(int arg0) {
        if (!class159.method804(arg0)) {
            return;
        }
        class159[] var1 = Statics.field2704[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2603 = 0;
                var3.field2715 = 0;
            }
        }
    }

    @ObfuscatedName("ez.co(IB)V")
    public static final void method2986(int arg0) {
        if (class159.method804(arg0)) {
            method210(Statics.field2704[arg0], -1);
        }
    }

    @ObfuscatedName("s.cd([Lfh;IB)V")
    public static final void method210(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2619 == arg1 && (!var3.field2607 || !method1343(var3))) {
                if (var3.field2610 == 0) {
                    if (!var3.field2607 && method1343(var3) && Statics.field362 != var3) {
                        continue;
                    }
                    method210(arg0, var3.field2661);
                    if (var3.field2694 != null) {
                        method210(var3.field2694, var3.field2661);
                    }
                    class4 var4 = (class4) field629.method3291((long) var3.field2661);
                    if (var4 != null) {
                        method2986(var4.field57);
                    }
                }
                if (var3.field2610 == 6) {
                    if (var3.field2644 != -1 || var3.field2645 != -1) {
                        boolean var5 = method24(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2645;
                        } else {
                            var6 = var3.field2644;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method215(var6);
                            var3.field2715 += field621;
                            while (var3.field2715 > var7.field869[var3.field2603]) {
                                var3.field2715 -= var7.field869[var3.field2603];
                                var3.field2603++;
                                if (var3.field2603 >= var7.field867.length) {
                                    var3.field2603 -= var7.field874;
                                    if (var3.field2603 < 0 || var3.field2603 >= var7.field867.length) {
                                        var3.field2603 = 0;
                                    }
                                }
                                method2180(var3);
                            }
                        }
                    }
                    if (var3.field2663 != 0 && !var3.field2607) {
                        int var8 = var3.field2663 >> 16;
                        int var9 = var3.field2663 << 16 >> 16;
                        int var10 = field621 * var8;
                        int var11 = field621 * var9;
                        var3.field2720 = var3.field2720 + var10 & 0x7FF;
                        var3.field2696 = var3.field2696 + var11 & 0x7FF;
                        method2180(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.cm(IS)V")
    public static final void method93(int arg0) {
        method221();
        class7.method50();
        int var1 = class42.method2179(arg0).field1022;
        if (var1 == 0) {
            return;
        }
        int var2 = class160.field2726[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class104.method2156(0.9D);
                ((class110) Statics.field1766).method2208(0.9D);
            }
            if (var2 == 2) {
                class104.method2156(0.8D);
                ((class110) Statics.field1766).method2208(0.8D);
            }
            if (var2 == 3) {
                class104.method2156(0.7D);
                ((class110) Statics.field1766).method2208(0.7D);
            }
            if (var2 == 4) {
                class104.method2156(0.6D);
                ((class110) Statics.field1766).method2208(0.6D);
            }
            class40.field969.method3251();
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
            if (field703 != var3) {
                if (field703 == 0 && field704 != -1) {
                    class139.method235(Statics.field1164, field704, 0, var3, false);
                    field705 = false;
                } else if (var3 == 0) {
                    Statics.field2353.method2744();
                    class139.field2354 = 1;
                    Statics.field2586 = null;
                    field705 = false;
                } else if (class139.field2354 == 0) {
                    Statics.field2353.method2836(var3);
                } else {
                    Statics.field1971 = var3;
                }
                field703 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field706 = 127;
            }
            if (var2 == 1) {
                field706 = 96;
            }
            if (var2 == 2) {
                field706 = 64;
            }
            if (var2 == 3) {
                field706 = 32;
            }
            if (var2 == 4) {
                field706 = 0;
            }
        }
        if (var1 == 5) {
            field537 = var2;
        }
        if (var1 == 6) {
            field630 = var2;
        }
        if (var1 == 9) {
            field631 = var2;
        }
        if (var1 != 10) {
            return;
        }
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

    @ObfuscatedName("ap.cu(IIII)Lo;")
    public static final class4 method856(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field57 = arg1;
        var3.field55 = arg2;
        field629.method3292(var3, (long) arg0);
        method25(arg1);
        class26.method144(arg1);
        class159 var4 = class159.method2352(arg0);
        if (var4 != null) {
            method2180(var4);
        }
        if (field632 != null) {
            method2180(field632);
            field632 = null;
        }
        method2200();
        if (field628 != -1) {
            method238(field628, 1);
        }
        return var3;
    }

    @ObfuscatedName("c.ce(Lo;ZB)V")
    public static final void method219(class4 arg0, boolean arg1) {
        int var2 = arg0.field57;
        int var3 = (int) arg0.field2810;
        arg0.method3341();
        if (arg1 && var2 != -1 && Statics.field2598[var2]) {
            Statics.field2599.method3008(var2);
            if (Statics.field2704[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2704[var2].length; var5++) {
                    if (Statics.field2704[var2][var5] != null) {
                        if (Statics.field2704[var2][var5].field2610 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2704[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2704[var2] = null;
                }
                Statics.field2598[var2] = false;
            }
        }
        method111(var2);
        class159 var6 = class159.method2352(var3);
        if (var6 != null) {
            method2180(var6);
        }
        method2200();
        if (field628 != -1) {
            method238(field628, 1);
        }
    }

    @ObfuscatedName("ce.ck(Lfh;B)Z")
    public static final boolean method2111(class159 arg0) {
        int var1 = arg0.field2612;
        if (var1 == 205) {
            field593 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field679.method3210(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field679.method3225(var4, var5 == 1);
        }
        if (var1 == 324) {
            field679.method3211(false);
        }
        if (var1 == 325) {
            field679.method3211(true);
        }
        if (var1 == 326) {
            field602.method2306(95);
            field679.method3219(field602);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cd.cw(IIII)V")
    public static final void method2023(int arg0, int arg1, int arg2) {
        method2021();
        class89.method1793(arg0, arg1, Statics.field121.field1462 + arg0, Statics.field121.field1464 + arg1);
        if (field545 == 2 || field545 == 5) {
            class89.method1805(arg0 + 25, arg1 + 5, 0, Statics.field2334, Statics.field850);
        } else {
            int var3 = field702 + field675 & 0x7FF;
            int var4 = Statics.field52.field443 / 32 + 48;
            int var5 = 464 - Statics.field52.field408 / 32;
            Statics.field146.method1687(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field730 + 256, Statics.field2334, Statics.field850);
            for (int var6 = 0; var6 < field695; var6++) {
                int var7 = field697[var6] * 4 + 2 - Statics.field52.field443 / 32;
                int var8 = field698[var6] * 4 + 2 - Statics.field52.field408 / 32;
                method149(arg0, arg1, var7, var8, field515[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field656[Statics.field263][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field52.field443 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field52.field408 / 32;
                        method149(arg0, arg1, var12, var13, Statics.field798[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field506; var14++) {
                class25 var15 = field505[field507[var14]];
                if (var15 != null && var15.method16()) {
                    class31 var16 = var15.field389;
                    if (var16 != null && var16.field793 != null) {
                        var16 = var16.method630();
                    }
                    if (var16 != null && var16.field784 && var16.field796) {
                        int var17 = var15.field443 / 32 - Statics.field52.field443 / 32;
                        int var18 = var15.field408 / 32 - Statics.field52.field408 / 32;
                        method149(arg0, arg1, var17, var18, Statics.field798[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field589; var19++) {
                class3 var20 = field511[field590[var19]];
                if (var20 != null && var20.method16()) {
                    int var21 = var20.field443 / 32 - Statics.field52.field443 / 32;
                    int var22 = var20.field408 / 32 - Statics.field52.field408 / 32;
                    boolean var23 = false;
                    if (method544(var20.field32)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    for (int var25 = 0; var25 < Statics.field1017; var25++) {
                        if (var20.field32.equals(Statics.field2367[var25].field120)) {
                            var24 = true;
                            break;
                        }
                    }
                    boolean var26 = false;
                    if (Statics.field52.field49 != 0 && var20.field49 != 0 && Statics.field52.field49 == var20.field49) {
                        var26 = true;
                    }
                    if (var23) {
                        method149(arg0, arg1, var21, var22, Statics.field798[3]);
                    } else if (var26) {
                        method149(arg0, arg1, var21, var22, Statics.field798[4]);
                    } else if (var24) {
                        method149(arg0, arg1, var21, var22, Statics.field798[5]);
                    } else {
                        method149(arg0, arg1, var21, var22, Statics.field798[2]);
                    }
                }
            }
            if (field485 != 0 && field477 % 20 < 10) {
                if (field485 == 1 && field541 >= 0 && field541 < field505.length) {
                    class25 var27 = field505[field541];
                    if (var27 != null) {
                        int var28 = var27.field443 / 32 - Statics.field52.field443 / 32;
                        int var29 = var27.field408 / 32 - Statics.field52.field408 / 32;
                        method212(arg0, arg1, var28, var29, Statics.field186[1]);
                    }
                }
                if (field485 == 2) {
                    int var30 = field488 * 4 - Statics.field56 * 4 + 2 - Statics.field52.field443 / 32;
                    int var31 = field489 * 4 - Statics.field932 * 4 + 2 - Statics.field52.field408 / 32;
                    method212(arg0, arg1, var30, var31, Statics.field186[1]);
                }
                if (field485 == 10 && field487 >= 0 && field487 < field511.length) {
                    class3 var32 = field511[field487];
                    if (var32 != null) {
                        int var33 = var32.field443 / 32 - Statics.field52.field443 / 32;
                        int var34 = var32.field408 / 32 - Statics.field52.field408 / 32;
                        method212(arg0, arg1, var33, var34, Statics.field186[1]);
                    }
                }
            }
            if (field700 != 0) {
                int var35 = field700 * 4 + 2 - Statics.field52.field443 / 32;
                int var36 = field666 * 4 + 2 - Statics.field52.field408 / 32;
                method149(arg0, arg1, var35, var36, Statics.field186[0]);
            }
            class89.method1807(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field545 < 3) {
            Statics.field538.method1687(arg0, arg1, 33, 33, 25, 25, field702, 256, Statics.field1973, Statics.field2061);
        } else {
            class89.method1805(arg0, arg1, 0, Statics.field1973, Statics.field2061);
        }
        if (field673[arg2]) {
            Statics.field121.method1759(arg0, arg1);
        }
        field558[arg2] = true;
    }

    @ObfuscatedName("m.dd(IIIILcv;I)V")
    public static final void method212(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method149(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field702 + field675 & 0x7FF;
        int var7 = class104.field1769[var6];
        int var8 = class104.field1750[var6];
        int var9 = var7 * 256 / (field730 + 256);
        int var10 = var8 * 256 / (field730 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1172.method1688(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("y.dn(IIIILcv;I)V")
    public static final void method149(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field702 + field675 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1769[var5];
        int var8 = class104.field1750[var5];
        int var9 = var7 * 256 / (field730 + 256);
        int var10 = var8 * 256 / (field730 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1691(Statics.field121, arg0 + 94 + var11 - arg4.field1454 / 2 + 4, arg1 + 83 - var12 - arg4.field1457 / 2 - 4);
        } else {
            arg4.method1677(arg0 + 94 + var11 - arg4.field1454 / 2 + 4, arg1 + 83 - var12 - arg4.field1457 / 2 - 4);
        }
    }

    @ObfuscatedName("h.dr(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method35(int arg0, String arg1, String arg2) {
        method2303(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dx.di(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2303(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field497[var4] = field497[var4 - 1];
            field680[var4] = field680[var4 - 1];
            field682[var4] = field682[var4 - 1];
            field681[var4] = field681[var4 - 1];
        }
        field497[0] = arg0;
        field680[0] = arg1;
        field682[0] = arg2;
        field681[0] = arg3;
        field683++;
        field658 = field651;
    }

    @ObfuscatedName("as.do(Ljava/lang/String;I)Z")
    public static boolean method544(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method1628(arg0, Statics.field471);
        for (int var2 = 0; var2 < field720; var2++) {
            if (var1.equalsIgnoreCase(class149.method1628(field618[var2].field367, Statics.field471))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method1628(Statics.field52.field32, Statics.field471))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("aa.dj(Ljava/lang/String;I)Z")
    public static boolean method791(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method1628(arg0, Statics.field471);
        for (int var2 = 0; var2 < field724; var2++) {
            class11 var3 = field725[var2];
            if (var1.equalsIgnoreCase(class149.method1628(var3.field188, Statics.field471))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method1628(var3.field182, Statics.field471))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("r.db(Ljava/lang/String;ZB)V")
    public static final void method136(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field724 < 100 || field595 == 1) || field724 >= 400) {
            method35(0, "", class135.field2201);
            return;
        }
        String var2 = class149.method1628(arg0, Statics.field471);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field724; var3++) {
            class11 var4 = field725[var3];
            String var5 = class149.method1628(var4.field188, Statics.field471);
            if (var5 != null && var5.equals(var2)) {
                method35(0, "", arg0 + class135.field2185);
                return;
            }
            if (var4.field182 != null) {
                String var6 = class149.method1628(var4.field182, Statics.field471);
                if (var6 != null && var6.equals(var2)) {
                    method35(0, "", arg0 + class135.field2185);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field720; var7++) {
            class23 var8 = field618[var7];
            String var9 = class149.method1628(var8.field367, Statics.field471);
            if (var9 != null && var9.equals(var2)) {
                method35(0, "", class135.field2262 + arg0 + class135.field2263);
                return;
            }
            if (var8.field357 != null) {
                String var10 = class149.method1628(var8.field357, Statics.field471);
                if (var10 != null && var10.equals(var2)) {
                    method35(0, "", class135.field2262 + arg0 + class135.field2263);
                    return;
                }
            }
        }
        if (class149.method1628(Statics.field52.field32, Statics.field471).equals(var2)) {
            method35(0, "", class135.field2259);
            return;
        }
        field602.method2306(236);
        class116 var11 = field602;
        int var12 = arg0.length() + 1;
        var11.method2422(var12);
        field602.method2588(arg0);
    }

    @ObfuscatedName("ar.dp(Ljava/lang/String;S)V")
    public static final void method1143(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method1628(arg0, Statics.field471);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field720; var2++) {
            class23 var3 = field618[var2];
            String var4 = var3.field367;
            String var5 = class149.method1628(var4, Statics.field471);
            if (class137.method1265(arg0, var1, var4, var5)) {
                field720--;
                for (int var6 = var2; var6 < field720; var6++) {
                    field618[var6] = field618[var6 + 1];
                }
                field659 = field651;
                field602.method2306(70);
                class116 var7 = field602;
                int var8 = arg0.length() + 1;
                var7.method2422(var8);
                field602.method2588(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("bk.dk(I)V")
    public static final void method1530() {
        field602.method2306(229);
        field602.method2422(0);
    }

    @ObfuscatedName("z.dy(II)V")
    public static void method111(int arg0) {
        for (class171 var1 = (class171) field518.method3294(); var1 != null; var1 = (class171) field518.method3302()) {
            if ((var1.field2810 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3341();
            }
        }
    }

    @ObfuscatedName("at.dx(Lfh;I)I")
    public static int method256(class159 arg0) {
        class171 var1 = (class171) field518.method3291(((long) arg0.field2661 << 32) + (long) arg0.field2609);
        return var1 == null ? arg0.field2667 : var1.field2794;
    }

    @ObfuscatedName("be.ds(Lfh;B)Z")
    public static boolean method1343(class159 arg0) {
        if (field637) {
            if (method256(arg0) != 0) {
                return false;
            }
            if (arg0.field2610 == 0) {
                return false;
            }
        }
        return arg0.field2620;
    }

    @ObfuscatedName("m.dw(Lfh;IB)Ljava/lang/String;")
    public static String method213(class159 arg0, int arg1) {
        if (!class163.method208(method256(arg0), arg1) && arg0.field2712 == null) {
            return null;
        } else if (arg0.field2669 == null || arg0.field2669.length <= arg1 || arg0.field2669[arg1] == null || arg0.field2669[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2669[arg1];
        }
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;

public final class client extends class72 {

    @ObfuscatedName("client.n")
    public static boolean field465 = true;

    @ObfuscatedName("client.j")
    public static int field466 = 1;

    @ObfuscatedName("client.o")
    public static int field467 = 0;

    @ObfuscatedName("client.t")
    public static boolean field470 = false;

    @ObfuscatedName("client.w")
    public static class162[] field526 = new class162[4];

    @ObfuscatedName("client.r")
    public static boolean field471 = false;

    @ObfuscatedName("client.a")
    public static int field499 = 0;

    @ObfuscatedName("client.q")
    public static int field473 = 1;

    @ObfuscatedName("client.d")
    public static int field474 = 0;

    @ObfuscatedName("client.s")
    public static boolean field559 = true;

    @ObfuscatedName("client.m")
    public static int field652 = 0;

    @ObfuscatedName("client.b")
    public static long field477 = 0L;

    @ObfuscatedName("client.f")
    public static int field530 = 0;

    @ObfuscatedName("client.v")
    public static int field479 = 0;

    @ObfuscatedName("client.u")
    public static int field480 = 0;

    @ObfuscatedName("client.k")
    public static boolean field481 = true;

    @ObfuscatedName("client.c")
    public static boolean field482 = false;

    @ObfuscatedName("client.al")
    public static int field584 = 0;

    @ObfuscatedName("client.ai")
    public static int field484 = 0;

    @ObfuscatedName("client.ad")
    public static int field485 = 0;

    @ObfuscatedName("client.aw")
    public static int field541 = 0;

    @ObfuscatedName("client.af")
    public static int field487 = 0;

    @ObfuscatedName("client.an")
    public static int field521 = 0;

    @ObfuscatedName("client.ao")
    public static int field631 = 0;

    @ObfuscatedName("client.ak")
    public static int field490 = 0;

    @ObfuscatedName("client.ah")
    public static int field491 = 0;

    @ObfuscatedName("client.aq")
    public static class126 field492 = new class126(new byte[5000]);

    @ObfuscatedName("client.am")
    public static int field493 = 0;

    @ObfuscatedName("client.ay")
    public static int field494 = 0;

    @ObfuscatedName("client.as")
    public static int field495 = 0;

    @ObfuscatedName("client.bx")
    public static int field623 = 0;

    @ObfuscatedName("client.bl")
    public static int field668 = 0;

    @ObfuscatedName("client.bv")
    public static int field463 = 0;

    @ObfuscatedName("client.ba")
    public static int field501 = 0;

    @ObfuscatedName("client.bp")
    public static int field527 = 0;

    @ObfuscatedName("client.bq")
    public static class24[] field504 = new class24[32768];

    @ObfuscatedName("client.bm")
    public static int field505 = 0;

    @ObfuscatedName("client.bn")
    public static int[] field506 = new int[32768];

    @ObfuscatedName("client.cb")
    public static class115 field634 = new class115(5000);

    @ObfuscatedName("client.cx")
    public static class115 field509 = new class115(5000);

    @ObfuscatedName("client.ck")
    public static class115 field715 = new class115(5000);

    @ObfuscatedName("client.ci")
    public static int field497 = 0;

    @ObfuscatedName("client.cw")
    public static int field529 = 0;

    @ObfuscatedName("client.cf")
    public static int field697 = 0;

    @ObfuscatedName("client.ce")
    public static int field514 = 0;

    @ObfuscatedName("client.cg")
    public static int field696 = 0;

    @ObfuscatedName("client.cl")
    public static int field516 = 0;

    @ObfuscatedName("client.cq")
    public static int field517 = 0;

    @ObfuscatedName("client.cv")
    public static int field674 = 0;

    @ObfuscatedName("client.cn")
    public static boolean field519 = false;

    @ObfuscatedName("client.ch")
    public static int field520 = 0;

    @ObfuscatedName("client.cz")
    public static int field478 = 0;

    @ObfuscatedName("client.ct")
    public static int field534 = 1;

    @ObfuscatedName("client.cy")
    public static int field507 = 0;

    @ObfuscatedName("client.dc")
    public static int field524 = 1;

    @ObfuscatedName("client.dn")
    public static int field632 = 0;

    @ObfuscatedName("client.di")
    public static boolean field688 = false;

    @ObfuscatedName("client.dj")
    public static int[][][] field557 = new int[4][13][13];

    @ObfuscatedName("client.dl")
    public static final int[] field475 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dx")
    public static int field567 = 0;

    @ObfuscatedName("client.dr")
    public static int[][] field531 = new int[104][104];

    @ObfuscatedName("client.dp")
    public static int[][] field532 = new int[104][104];

    @ObfuscatedName("client.da")
    public static int[] field533 = new int[4000];

    @ObfuscatedName("client.dd")
    public static int[] field699 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int field535 = 0;

    @ObfuscatedName("client.dw")
    public static int field536 = 2;

    @ObfuscatedName("client.du")
    public static int field537 = 0;

    @ObfuscatedName("client.df")
    public static int field538 = 2;

    @ObfuscatedName("client.dg")
    public static int field539 = 0;

    @ObfuscatedName("client.dz")
    public static int field540 = 1;

    @ObfuscatedName("client.dt")
    public static int field681 = 0;

    @ObfuscatedName("client.et")
    public static int field542 = 0;

    @ObfuscatedName("client.ev")
    public static int field543 = 2;

    @ObfuscatedName("client.ee")
    public static int field544 = 0;

    @ObfuscatedName("client.ec")
    public static int field605 = 1;

    @ObfuscatedName("client.ea")
    public static int field546 = 0;

    @ObfuscatedName("client.eq")
    public static int field637 = 0;

    @ObfuscatedName("client.ej")
    public static int field549 = 2301979;

    @ObfuscatedName("client.ef")
    public static int field550 = 5063219;

    @ObfuscatedName("client.fg")
    public static int field551 = 3353893;

    @ObfuscatedName("client.fv")
    public static int field706 = 7759444;

    @ObfuscatedName("client.ft")
    public static boolean field553 = false;

    @ObfuscatedName("client.fy")
    public static int field554 = 0;

    @ObfuscatedName("client.fb")
    public static int field555 = 128;

    @ObfuscatedName("client.fw")
    public static int field556 = 0;

    @ObfuscatedName("client.fo")
    public static int field678 = 0;

    @ObfuscatedName("client.fr")
    public static int field558 = 0;

    @ObfuscatedName("client.fl")
    public static int field518 = 0;

    @ObfuscatedName("client.fa")
    public static boolean field560 = false;

    @ObfuscatedName("client.fd")
    public static int field721 = 0;

    @ObfuscatedName("client.fp")
    public static int field562 = 0;

    @ObfuscatedName("client.fs")
    public static int field563 = 50;

    @ObfuscatedName("client.ff")
    public static int[] field722 = new int[field563];

    @ObfuscatedName("client.fi")
    public static int[] field565 = new int[field563];

    @ObfuscatedName("client.fc")
    public static int[] field667 = new int[field563];

    @ObfuscatedName("client.fh")
    public static int[] field732 = new int[field563];

    @ObfuscatedName("client.fe")
    public static int[] field568 = new int[field563];

    @ObfuscatedName("client.fq")
    public static int[] field569 = new int[field563];

    @ObfuscatedName("client.gi")
    public static int[] field586 = new int[field563];

    @ObfuscatedName("client.gv")
    public static String[] field571 = new String[field563];

    @ObfuscatedName("client.gk")
    public static int[][] field483 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field573 = 0;

    @ObfuscatedName("client.gq")
    public static int field704 = -1;

    @ObfuscatedName("client.gp")
    public static int field575 = -1;

    @ObfuscatedName("client.gj")
    public static int field576 = 0;

    @ObfuscatedName("client.gh")
    public static int field577 = 0;

    @ObfuscatedName("client.gs")
    public static int field578 = 0;

    @ObfuscatedName("client.gn")
    public static int field579 = 0;

    @ObfuscatedName("client.ga")
    public static int field682 = 0;

    @ObfuscatedName("client.ge")
    public static int field580 = 0;

    @ObfuscatedName("client.gw")
    public static int field582 = 0;

    @ObfuscatedName("client.gg")
    public static int field583 = 0;

    @ObfuscatedName("client.gr")
    public static int field566 = 0;

    @ObfuscatedName("client.gf")
    public static int field585 = 0;

    @ObfuscatedName("client.gx")
    public static boolean field500 = false;

    @ObfuscatedName("client.gt")
    public static int field489 = 0;

    @ObfuscatedName("client.gd")
    public static int field588 = 0;

    @ObfuscatedName("client.gy")
    public static class3[] field618 = new class3[2048];

    @ObfuscatedName("client.gu")
    public static int field590 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field591 = new int[2048];

    @ObfuscatedName("client.hx")
    public static int field624 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field648 = new int[2048];

    @ObfuscatedName("client.he")
    public static class126[] field594 = new class126[2048];

    @ObfuscatedName("client.hj")
    public static int field595 = -1;

    @ObfuscatedName("client.hi")
    public static int field596 = 0;

    @ObfuscatedName("client.hh")
    public static int field597 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field598 = new int[1000];

    @ObfuscatedName("client.hl")
    public static final int[] field599 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hz")
    public static String[] field689 = new String[8];

    @ObfuscatedName("client.hf")
    public static boolean[] field601 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field602 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static class175[][][] field603 = new class175[4][104][104];

    @ObfuscatedName("client.hu")
    public static class175 field604 = new class175();

    @ObfuscatedName("client.hs")
    public static class175 field719 = new class175();

    @ObfuscatedName("client.ha")
    public static class175 field606 = new class175();

    @ObfuscatedName("client.hv")
    public static int[] field655 = new int[25];

    @ObfuscatedName("client.hw")
    public static int[] field574 = new int[25];

    @ObfuscatedName("client.hc")
    public static int[] field609 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field610 = 0;

    @ObfuscatedName("client.hg")
    public static boolean field693 = false;

    @ObfuscatedName("client.in")
    public static int field612 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field613 = new int[500];

    @ObfuscatedName("client.ie")
    public static int[] field614 = new int[500];

    @ObfuscatedName("client.iw")
    public static int[] field615 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field486 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field677 = new String[500];

    @ObfuscatedName("client.ia")
    public static String[] field502 = new String[500];

    @ObfuscatedName("client.io")
    public static int field619 = -1;

    @ObfuscatedName("client.is")
    public static int field620 = -1;

    @ObfuscatedName("client.ir")
    public static int field621 = 0;

    @ObfuscatedName("client.ih")
    public static int field622 = 50;

    @ObfuscatedName("client.if")
    public static int field545 = 0;

    @ObfuscatedName("client.it")
    public static String field714 = null;

    @ObfuscatedName("client.iy")
    public static boolean field513 = false;

    @ObfuscatedName("client.iq")
    public static int field626 = -1;

    @ObfuscatedName("client.ii")
    public static String field552 = null;

    @ObfuscatedName("client.jk")
    public static String field642 = null;

    @ObfuscatedName("client.ju")
    public static int field629 = -1;

    @ObfuscatedName("client.jo")
    public static class173 field630 = new class173(8);

    @ObfuscatedName("client.je")
    public static int field611 = 0;

    @ObfuscatedName("client.jn")
    public static int field593 = 0;

    @ObfuscatedName("client.jg")
    public static class156 field633 = null;

    @ObfuscatedName("client.jz")
    public static int field511 = 0;

    @ObfuscatedName("client.jq")
    public static int field635 = 0;

    @ObfuscatedName("client.jh")
    public static int field636 = 0;

    @ObfuscatedName("client.jr")
    public static boolean field616 = false;

    @ObfuscatedName("client.ji")
    public static boolean field638 = false;

    @ObfuscatedName("client.jv")
    public static boolean field639 = false;

    @ObfuscatedName("client.jt")
    public static class156 field640 = null;

    @ObfuscatedName("client.jf")
    public static class156 field641 = null;

    @ObfuscatedName("client.ja")
    public static int field645 = 0;

    @ObfuscatedName("client.jb")
    public static int field643 = 0;

    @ObfuscatedName("client.jd")
    public static class156 field644 = null;

    @ObfuscatedName("client.jc")
    public static boolean field522 = false;

    @ObfuscatedName("client.jw")
    public static int field646 = -1;

    @ObfuscatedName("client.jl")
    public static int field647 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field581 = false;

    @ObfuscatedName("client.jy")
    public static int field649 = -1;

    @ObfuscatedName("client.jj")
    public static int field650 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field651 = false;

    @ObfuscatedName("client.kz")
    public static int field708 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field653 = new int[32];

    @ObfuscatedName("client.kl")
    public static int field654 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field589 = new int[32];

    @ObfuscatedName("client.kb")
    public static int field600 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field657 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field625 = 0;

    @ObfuscatedName("client.kn")
    public static int field659 = 0;

    @ObfuscatedName("client.kd")
    public static int field660 = 0;

    @ObfuscatedName("client.ky")
    public static int field661 = 0;

    @ObfuscatedName("client.kq")
    public static int field662 = 0;

    @ObfuscatedName("client.ku")
    public static int[] field663 = new int[2000];

    @ObfuscatedName("client.kg")
    public static String[] field664 = new String[1000];

    @ObfuscatedName("client.kk")
    public static int field665 = 0;

    @ObfuscatedName("client.kv")
    public static class175 field666 = new class175();

    @ObfuscatedName("client.kj")
    public static class175 field488 = new class175();

    @ObfuscatedName("client.km")
    public static class175 field508 = new class175();

    @ObfuscatedName("client.kw")
    public static class173 field669 = new class173(512);

    @ObfuscatedName("client.kt")
    public static int field670 = 0;

    @ObfuscatedName("client.kf")
    public static int field671 = -2;

    @ObfuscatedName("client.lb")
    public static boolean[] field472 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field673 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field656 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field675 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field676 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field547 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.lv")
    public static int field679 = 0;

    @ObfuscatedName("client.lg")
    public static int[] field680 = new int[100];

    @ObfuscatedName("client.lm")
    public static String[] field525 = new String[100];

    @ObfuscatedName("client.ls")
    public static String[] field570 = new String[100];

    @ObfuscatedName("client.ly")
    public static String[] field617 = new String[100];

    @ObfuscatedName("client.lt")
    public static int field561 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field627 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.la")
    public static int field686 = 0;

    @ObfuscatedName("client.lr")
    public static int field687 = 0;

    @ObfuscatedName("client.lw")
    public static long[] field476 = new long[100];

    @ObfuscatedName("client.lo")
    public static int field684 = 0;

    @ObfuscatedName("client.ln")
    public static int field690 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field691 = new int[128];

    @ObfuscatedName("client.lh")
    public static int[] field692 = new int[128];

    @ObfuscatedName("client.lk")
    public static String field702 = null;

    @ObfuscatedName("client.me")
    public static String field694 = null;

    @ObfuscatedName("client.mn")
    public static int field695 = -1;

    @ObfuscatedName("client.mx")
    public static int field672 = 0;

    @ObfuscatedName("client.ms")
    public static int[] field592 = new int[1000];

    @ObfuscatedName("client.mv")
    public static int[] field698 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class85[] field607 = new class85[1000];

    @ObfuscatedName("client.mr")
    public static int field700 = 0;

    @ObfuscatedName("client.mm")
    public static int field701 = 0;

    @ObfuscatedName("client.mk")
    public static int field628 = 0;

    @ObfuscatedName("client.mw")
    public static int field703 = 255;

    @ObfuscatedName("client.my")
    public static int field528 = -1;

    @ObfuscatedName("client.mu")
    public static boolean field705 = false;

    @ObfuscatedName("client.mo")
    public static int field713 = 127;

    @ObfuscatedName("client.md")
    public static int field707 = 127;

    @ObfuscatedName("client.nb")
    public static int field718 = 0;

    @ObfuscatedName("client.nq")
    public static int[] field709 = new int[50];

    @ObfuscatedName("client.nk")
    public static int[] field710 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field711 = new int[50];

    @ObfuscatedName("client.nm")
    public static int[] field712 = new int[50];

    @ObfuscatedName("client.np")
    public static class56[] field512 = new class56[50];

    @ObfuscatedName("client.nw")
    public static boolean field510 = false;

    @ObfuscatedName("client.nx")
    public static boolean[] field572 = new boolean[5];

    @ObfuscatedName("client.nh")
    public static int[] field716 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field717 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field723 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field685 = new int[5];

    @ObfuscatedName("client.os")
    public static int field720 = 0;

    @ObfuscatedName("client.op")
    public static int field468 = 0;

    @ObfuscatedName("client.od")
    public static class22[] field523 = new class22[200];

    @ObfuscatedName("client.ox")
    public static class171 field564 = new class171();

    @ObfuscatedName("client.oc")
    public static int field724 = 0;

    @ObfuscatedName("client.oz")
    public static class11[] field725 = new class11[100];

    @ObfuscatedName("client.om")
    public static class161 field726 = new class161();

    @ObfuscatedName("client.of")
    public static int field727 = -1;

    @ObfuscatedName("client.ov")
    public static int field728 = -1;

    @ObfuscatedName("client.n(B)V")
    public final void method248() {
    }

    public final void init() {
        if (!this.method1418()) {
            return;
        }
        class165[] var1 = new class165[] { class165.field2726, class165.field2720, class165.field2725, class165.field2728, class165.field2729, class165.field2721, class165.field2722, class165.field2724, class165.field2723 };
        class165[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class165 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2727);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2727)) {
                    case 1:
                        Statics.field2298 = var5;
                        break;
                    case 2:
                        int var6 = Integer.parseInt(var5);
                        class131[] var7 = new class131[] { class131.field2041, class131.field2039, class131.field2040, class131.field2044 };
                        class131[] var8 = var7;
                        int var9 = 0;
                        class131 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class131 var10 = var8[var9];
                            if (var10.field2043 == var6) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field2379 = var11;
                        break;
                    case 3:
                        if (var5.equalsIgnoreCase(class2.field17)) {
                            field473 = 1;
                        } else {
                            field473 = 0;
                        }
                        break;
                    case 4:
                        field499 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field467 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field17)) {
                            field470 = true;
                        } else {
                            field470 = false;
                        }
                    case 7:
                    default:
                        break;
                    case 8:
                        field466 = Integer.parseInt(var5);
                        break;
                    case 9:
                        class132[] var12 = new class132[] { class132.field2056, class132.field2050, class132.field2054, class132.field2049, class132.field2046, class132.field2051 };
                        int var14 = Integer.parseInt(var5);
                        class132[] var15 = var12;
                        int var16 = 0;
                        class132 var18;
                        while (true) {
                            if (var16 >= var15.length) {
                                var18 = null;
                                break;
                            }
                            class132 var17 = var15[var16];
                            if (var14 == var17.method2397()) {
                                var18 = var17;
                                break;
                            }
                            var16++;
                        }
                        Statics.field683 = (class132) var18;
                        if (Statics.field683 == class132.field2054) {
                            Statics.field469 = class184.field2805;
                        } else {
                            Statics.field469 = class184.field2800;
                        }
                }
            }
        }
        class94.field1592 = false;
        field471 = false;
        Statics.field2665 = this.getCodeBase().getHost();
        String var19 = Statics.field2379.field2038;
        byte var20 = 0;
        try {
            class81.method1340("oldschool", var19, var20, 16);
        } catch (Exception var22) {
            class79.method126((String) null, var22);
        }
        Statics.field464 = this;
        this.method1416(765, 503, 7);
    }

    @ObfuscatedName("client.i(B)V")
    public final void method250() {
        Statics.field503 = field467 == 0 ? 43594 : field466 + 40000;
        Statics.field178 = field467 == 0 ? 443 : field466 + 50000;
        Statics.field1032 = Statics.field503;
        Statics.field2672 = class159.field2659;
        Statics.field2679 = class159.field2658;
        Statics.field2680 = class159.field2660;
        Statics.field254 = class159.field2661;
        class74.method1411();
        Canvas var1 = Statics.field1013;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class74.field1360);
        var1.addFocusListener(class74.field1360);
        class76.method1269(Statics.field1013);
        class77 var2;
        try {
            var2 = new class77();
        } catch (Throwable var4) {
            var2 = null;
        }
        Statics.field115 = var2;
        if (Statics.field115 != null) {
            Statics.field115.method1345(Statics.field1013);
        }
        Statics.field1253 = new class70(255, class81.field1420, class81.field1421, 500000);
        if (field467 != 0) {
            field482 = true;
        }
    }

    @ObfuscatedName("client.o(I)V")
    public final void method251() {
        field652++;
        this.method540();
        class155.method25();
        try {
            if (class137.field2319 == 1) {
                int var1 = Statics.field2314.method2791();
                if (var1 > 0 && Statics.field2314.method2777()) {
                    int var2 = var1 - Statics.field2315;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2314.method2771(var2);
                } else {
                    Statics.field2314.method2776();
                    Statics.field2314.method2775();
                    if (Statics.field2428 == null) {
                        class137.field2319 = 0;
                    } else {
                        class137.field2319 = 2;
                    }
                    Statics.field1209 = null;
                    Statics.field966 = null;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            Statics.field2314.method2776();
            class137.field2319 = 0;
            Statics.field1209 = null;
            Statics.field966 = null;
            Statics.field2428 = null;
        }
        method790();
        class74.method1343();
        class76.method203();
        if (Statics.field115 != null) {
            int var4 = Statics.field115.method1357();
            field665 = var4;
        }
        if (field474 == 0) {
            method1342();
            class72.method714();
        } else if (field474 == 5) {
            class20.method106(this);
            method1342();
            class72.method714();
        } else if (field474 == 10) {
            class20.method106(this);
        } else if (field474 == 20) {
            class20.method106(this);
            method2057();
        } else if (field474 == 25) {
            method53();
        }
        if (field474 == 30) {
            Statics.method31();
        } else if (field474 == 40) {
            method2057();
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method252() {
        boolean var1 = class137.method2158();
        if (var1 && field705 && Statics.field917 != null) {
            Statics.field917.method1147();
        }
        if (field1313) {
            class74.method202(Statics.field1013);
            class76.method604(Statics.field1013);
            if (Statics.field115 != null) {
                Statics.field115.method1347(Statics.field1013);
            }
            this.method1417();
            Canvas var2 = Statics.field1013;
            var2.setFocusTraversalKeysEnabled(false);
            var2.addKeyListener(class74.field1360);
            var2.addFocusListener(class74.field1360);
            class76.method1269(Statics.field1013);
            if (Statics.field115 != null) {
                Statics.field115.method1345(Statics.field1013);
            }
        }
        if (field474 == 0) {
            int var3 = class20.field310;
            String var4 = class20.field311;
            Color var5 = null;
            try {
                Graphics var6 = Statics.field1013.getGraphics();
                if (Statics.field198 == null) {
                    Statics.field198 = new Font("Helvetica", 1, 13);
                    Statics.field331 = Statics.field1013.getFontMetrics(Statics.field198);
                }
                if (field1311) {
                    field1311 = false;
                    var6.setColor(Color.black);
                    var6.fillRect(0, 0, Statics.field786, Statics.field137);
                }
                if (var5 == null) {
                    var5 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1030 == null) {
                        Statics.field1030 = Statics.field1013.createImage(304, 34);
                    }
                    Graphics var7 = Statics.field1030.getGraphics();
                    var7.setColor(var5);
                    var7.drawRect(0, 0, 303, 33);
                    var7.fillRect(2, 2, var3 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(1, 1, 301, 31);
                    var7.fillRect(var3 * 3 + 2, 2, 300 - var3 * 3, 30);
                    var7.setFont(Statics.field198);
                    var7.setColor(Color.white);
                    var7.drawString(var4, (304 - Statics.field331.stringWidth(var4)) / 2, 22);
                    var6.drawImage(Statics.field1030, Statics.field786 / 2 - 152, Statics.field137 / 2 - 18, (ImageObserver) null);
                } catch (Exception var20) {
                    int var9 = Statics.field786 / 2 - 152;
                    int var10 = Statics.field137 / 2 - 18;
                    var6.setColor(var5);
                    var6.drawRect(var9, var10, 303, 33);
                    var6.fillRect(var9 + 2, var10 + 2, var3 * 3, 30);
                    var6.setColor(Color.black);
                    var6.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var6.fillRect(var3 * 3 + var9 + 2, var10 + 2, 300 - var3 * 3, 30);
                    var6.setFont(Statics.field198);
                    var6.setColor(Color.white);
                    var6.drawString(var4, var9 + (304 - Statics.field331.stringWidth(var4)) / 2, var10 + 22);
                }
            } catch (Exception var21) {
                Statics.field1013.repaint();
            }
        } else if (field474 == 5) {
            class20.method2157(Statics.field2297, Statics.field12);
        } else if (field474 == 10) {
            class20.method2157(Statics.field2297, Statics.field12);
        } else if (field474 == 20) {
            class20.method2157(Statics.field2297, Statics.field12);
        } else if (field474 == 25) {
            if (field632 == 1) {
                if (field478 > field534) {
                    field534 = field478;
                }
                int var12 = (field534 * 50 - field478 * 50) / field534;
                method897(class133.field2065 + class2.field23 + class2.field21 + var12 + "%" + class2.field22, false);
            } else if (field632 == 2) {
                if (field507 > field524) {
                    field524 = field507;
                }
                int var13 = (field524 * 50 - field507 * 50) / field524 + 50;
                method897(class133.field2065 + class2.field23 + class2.field21 + var13 + "%" + class2.field22, false);
            } else {
                method897(class133.field2065, false);
            }
        } else if (field474 == 30) {
            method30();
        } else if (field474 == 40) {
            method897(class133.field2155 + class2.field23 + class133.field2067, false);
        }
        if (field474 == 30 && field679 == 0 && !field1311) {
            try {
                Graphics var14 = Statics.field1013.getGraphics();
                for (int var15 = 0; var15 < field670; var15++) {
                    if (field673[var15]) {
                        Statics.field1187.method1633(var14, field675[var15], field676[var15], field547[var15], field498[var15]);
                        field673[var15] = false;
                    }
                }
            } catch (Exception var23) {
                Statics.field1013.repaint();
            }
        } else if (field474 > 0) {
            try {
                Graphics var17 = Statics.field1013.getGraphics();
                Statics.field1187.method1622(var17, 0, 0);
                field1311 = false;
                for (int var18 = 0; var18 < field670; var18++) {
                    field673[var18] = false;
                }
            } catch (Exception var22) {
                Statics.field1013.repaint();
            }
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method253() {
        if (Statics.field353 != null) {
            Statics.field353.field237 = false;
        }
        Statics.field353 = null;
        if (Statics.field1328 != null) {
            Statics.field1328.method1366();
            Statics.field1328 = null;
        }
        class74.method212();
        class76.method201();
        Statics.field115 = null;
        if (Statics.field917 != null) {
            Statics.field917.method1151();
        }
        if (Statics.field1907 != null) {
            Statics.field1907.method1151();
        }
        if (Statics.field2473 != null) {
            Statics.field2473.method1366();
        }
        Object var1 = class155.field2513;
        synchronized (class155.field2513) {
            if (class155.field2516 != 0) {
                class155.field2516 = 1;
                try {
                    class155.field2513.wait();
                } catch (InterruptedException var4) {
                }
            }
        }
        class81.method2064();
    }

    @ObfuscatedName("ez.t(II)V")
    public static void method3044(int arg0) {
        if (field474 == arg0) {
            return;
        }
        if (field474 == 0) {
            class72.method2353();
        }
        if (arg0 == 20 || arg0 == 40) {
            field668 = 0;
            field463 = 0;
            field501 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field515 != null) {
            Statics.field515.method1366();
            Statics.field515 = null;
        }
        if (field474 == 25) {
            field632 = 0;
            field478 = 0;
            field534 = 1;
            field507 = 0;
            field524 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1013;
            class152 var2 = Statics.field77;
            class152 var3 = Statics.field1037;
            if (!Statics.field324) {
                class88.method1796();
                byte[] var4 = var2.method3028("title.jpg", "");
                Statics.field320 = new class85(var4, var1);
                Statics.field325 = Statics.field320.method1707();
                Statics.field299 = class83.method1597(var3, "logo", "");
                Statics.field1792 = class83.method1597(var3, "titlebox", "");
                Statics.field295 = class83.method1597(var3, "titlebutton", "");
                Statics.field296 = class83.method3136(var3, "runes", "");
                Statics.field2045 = class83.method3136(var3, "title_mute", "");
                Statics.field847 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field847[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field847[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field847[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field847[var8 + 192] = 16777215;
                }
                Statics.field111 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field111[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field111[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field111[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field111[var12 + 192] = 16777215;
                }
                Statics.field1971 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field1971[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field1971[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field1971[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field1971[var16 + 192] = 16777215;
                }
                Statics.field1295 = new int[256];
                Statics.field305 = new int[32768];
                Statics.field1968 = new int[32768];
                class20.method128((class86) null);
                Statics.field2499 = new int[32768];
                Statics.field1296 = new int[32768];
                class20.field312 = 0;
                class20.field316 = "";
                class20.field317 = "";
                class20.field322 = false;
                if (field703 == 0) {
                    class20.field313 = true;
                } else {
                    class20.field313 = false;
                }
                if (class20.field313) {
                    class137.method2717(2);
                } else {
                    class137.method222(2, Statics.field2455, "scape main", "", 255, false);
                }
                class151.method119(false);
                Statics.field324 = true;
                Statics.field320.method1700(0, 0);
                Statics.field325.method1700(382, 0);
                Statics.field299.method1782(382 - Statics.field299.field1468 / 2, 18);
            }
        } else if (Statics.field324) {
            Statics.field1792 = null;
            Statics.field295 = null;
            Statics.field296 = null;
            Statics.field320 = null;
            Statics.field325 = null;
            Statics.field299 = null;
            Statics.field2045 = null;
            Statics.field941 = null;
            Statics.field66 = null;
            Statics.field587 = null;
            Statics.field2309 = null;
            Statics.field2055 = null;
            Statics.field847 = null;
            Statics.field111 = null;
            Statics.field1971 = null;
            Statics.field1295 = null;
            Statics.field305 = null;
            Statics.field1968 = null;
            Statics.field2499 = null;
            Statics.field1296 = null;
            class137.method2717(2);
            class151.method119(true);
            Statics.field324 = false;
        }
        field474 = arg0;
    }

    @ObfuscatedName("client.w(S)V")
    public void method540() {
        if (field474 != 1000) {
            boolean var1 = class151.method2249();
            if (!var1) {
                this.method376();
            }
        }
    }

    @ObfuscatedName("client.r(I)V")
    public void method376() {
        if (class151.field2474 >= 4) {
            this.method1428("js5crc");
            field474 = 1000;
            return;
        }
        if (class151.field2475 >= 4) {
            if (field474 <= 5) {
                this.method1428("js5io");
                field474 = 1000;
                return;
            }
            field495 = 3000;
            class151.field2475 = 3;
        }
        if (--field495 + 1 > 0) {
            return;
        }
        try {
            if (field494 == 0) {
                Statics.field1981 = Statics.field1791.method1505(Statics.field2665, Statics.field1032);
                field494++;
            }
            if (field494 == 1) {
                if (Statics.field1981.field1398 == 2) {
                    this.method412(-1);
                    return;
                }
                if (Statics.field1981.field1398 == 1) {
                    field494++;
                }
            }
            if (field494 == 2) {
                Statics.field1298 = new class69((Socket) Statics.field1981.field1402, Statics.field1791);
                class126 var1 = new class126(5);
                var1.method2472(15);
                var1.method2475(7);
                Statics.field1298.method1371(var1.field2013, 0, 5);
                field494++;
                Statics.field112 = class120.method8();
            }
            if (field494 == 3) {
                if (field474 <= 5 || Statics.field1298.method1369() > 0) {
                    int var2 = Statics.field1298.method1368();
                    if (var2 != 0) {
                        this.method412(var2);
                        return;
                    }
                    field494++;
                } else if (class120.method8() - Statics.field112 > 30000L) {
                    this.method412(-2);
                    return;
                }
            }
            if (field494 == 4) {
                class151.method122(Statics.field1298, field474 > 20);
                Statics.field1981 = null;
                Statics.field1298 = null;
                field494 = 0;
                field623 = 0;
            }
        } catch (IOException var4) {
            this.method412(-3);
        }
    }

    @ObfuscatedName("client.a(II)V")
    public void method412(int arg0) {
        Statics.field1981 = null;
        Statics.field1298 = null;
        field494 = 0;
        if (Statics.field503 == Statics.field1032) {
            Statics.field1032 = Statics.field178;
        } else {
            Statics.field1032 = Statics.field503;
        }
        field623++;
        if (field623 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field474 <= 5) {
                this.method1428("js5connect_full");
                field474 = 1000;
            } else {
                field495 = 3000;
            }
        } else if (field623 >= 2 && arg0 == 6) {
            this.method1428("js5connect_outofdate");
            field474 = 1000;
        } else if (field623 >= 4) {
            if (field474 <= 5) {
                this.method1428("js5connect");
                field474 = 1000;
            } else {
                field495 = 3000;
            }
        }
    }

    @ObfuscatedName("bv.q(I)V")
    public static void method1342() {
        if (field493 == 0) {
            Statics.field1210 = new class94(4, 104, 104, class9.field126);
            for (int var0 = 0; var0 < 4; var0++) {
                field526[var0] = new class162(104, 104);
            }
            Statics.field1441 = new class85(512, 512);
            class20.field311 = class133.field2068;
            class20.field310 = 5;
            field493 = 20;
        } else if (field493 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class103.field1756[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class94.method1908(var1, 500, 800, 512, 334);
            class20.field311 = class133.field2069;
            class20.field310 = 10;
            field493 = 30;
        } else if (field493 == 30) {
            Statics.field64 = method2244(0, false, true, true);
            Statics.field496 = method2244(1, false, true, true);
            Statics.field1825 = method2244(2, true, false, true);
            Statics.field71 = method2244(3, false, true, true);
            Statics.field15 = method2244(4, false, true, true);
            Statics.field1964 = method2244(5, true, true, true);
            Statics.field2455 = method2244(6, true, true, false);
            Statics.field48 = method2244(7, false, true, true);
            Statics.field1037 = method2244(8, false, true, true);
            Statics.field865 = method2244(9, false, true, true);
            Statics.field77 = method2244(10, false, true, true);
            Statics.field2477 = method2244(11, false, true, true);
            Statics.field731 = method2244(12, false, true, true);
            Statics.field658 = method2244(13, true, false, true);
            Statics.field364 = method2244(14, false, true, false);
            Statics.field169 = method2244(15, false, true, true);
            class20.field311 = class133.field2070;
            class20.field310 = 20;
            field493 = 40;
        } else if (field493 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field64.method3102() * 4 / 100;
            int var8 = var7 + Statics.field496.method3102() * 4 / 100;
            int var9 = var8 + Statics.field1825.method3102() * 2 / 100;
            int var10 = var9 + Statics.field71.method3102() * 2 / 100;
            int var11 = var10 + Statics.field15.method3102() * 6 / 100;
            int var12 = var11 + Statics.field1964.method3102() * 4 / 100;
            int var13 = var12 + Statics.field2455.method3102() * 2 / 100;
            int var14 = var13 + Statics.field48.method3102() * 60 / 100;
            int var15 = var14 + Statics.field1037.method3102() * 2 / 100;
            int var16 = var15 + Statics.field865.method3102() * 2 / 100;
            int var17 = var16 + Statics.field77.method3102() * 2 / 100;
            int var18 = var17 + Statics.field2477.method3102() * 2 / 100;
            int var19 = var18 + Statics.field731.method3102() * 2 / 100;
            int var20 = var19 + Statics.field658.method3102() * 2 / 100;
            int var21 = var20 + Statics.field364.method3102() * 2 / 100;
            int var22 = var21 + Statics.field169.method3102() * 2 / 100;
            if (var22 == 100) {
                class20.field311 = class133.field2072;
                class20.field310 = 30;
                field493 = 45;
            } else {
                if (var22 != 0) {
                    class20.field311 = class133.field2106 + var22 + "%";
                }
                class20.field310 = 30;
            }
        } else if (field493 == 45) {
            boolean var23 = !field471;
            Statics.field1989 = 22050;
            Statics.field1970 = var23;
            Statics.field185 = 2;
            class140 var24 = new class140();
            var24.method2778(9, 128);
            Statics.field917 = class51.method2(Statics.field1791, Statics.field1013, 0, 22050);
            Statics.field917.method1144(var24);
            class137.method2429(Statics.field169, Statics.field364, Statics.field15, var24);
            Statics.field1907 = class51.method2(Statics.field1791, Statics.field1013, 1, 2048);
            Statics.field1291 = new class45();
            Statics.field1907.method1144(Statics.field1291);
            Statics.field733 = new class61(22050, Statics.field1989);
            class20.field311 = class133.field2109;
            class20.field310 = 35;
            field493 = 50;
        } else if (field493 == 50) {
            int var25 = 0;
            if (Statics.field12 == null) {
                Statics.field12 = class83.method2712(Statics.field1037, Statics.field658, "p11_full", "");
            } else {
                var25++;
            }
            if (Statics.field285 == null) {
                Statics.field285 = class83.method2712(Statics.field1037, Statics.field658, "p12_full", "");
            } else {
                var25++;
            }
            if (Statics.field2297 == null) {
                Statics.field2297 = class83.method2712(Statics.field1037, Statics.field658, "b12_full", "");
            } else {
                var25++;
            }
            if (var25 < 3) {
                class20.field311 = class133.field2074 + var25 * 100 / 3 + "%";
                class20.field310 = 40;
            } else {
                class20.field311 = class133.field2075;
                class20.field310 = 40;
                field493 = 60;
            }
        } else if (field493 == 60) {
            int var26 = class20.method28(Statics.field77, Statics.field1037);
            byte var27 = 6;
            if (var26 < var27) {
                class20.field311 = class133.field2076 + var26 * 100 / var27 + "%";
                class20.field310 = 50;
            } else {
                class20.field311 = class133.field2077;
                class20.field310 = 50;
                method3044(5);
                field493 = 70;
            }
        } else if (field493 == 70) {
            if (Statics.field1825.method3016()) {
                class36.method13(Statics.field1825);
                class32.method118(Statics.field1825);
                class152 var29 = Statics.field1825;
                class152 var30 = Statics.field48;
                Statics.field1262 = var29;
                Statics.field912 = var30;
                Statics.field904 = Statics.field1262.method3033(3);
                class31.method2225(Statics.field1825, Statics.field48, field471);
                class30.method720(Statics.field1825, Statics.field48);
                class152 var31 = Statics.field1825;
                class152 var32 = Statics.field48;
                boolean var33 = field470;
                class181 var34 = Statics.field12;
                Statics.field988 = var31;
                Statics.field1014 = var32;
                Statics.field969 = var33;
                Statics.field988.method3033(10);
                Statics.field1259 = var34;
                class33.method1502(Statics.field1825, Statics.field64, Statics.field496);
                class152 var35 = Statics.field1825;
                class152 var36 = Statics.field48;
                Statics.field884 = var35;
                Statics.field883 = var36;
                class37.method1688(Statics.field1825);
                class152 var37 = Statics.field1825;
                Statics.field1033 = var37;
                Statics.field1027 = Statics.field1033.method3033(16);
                class152 var38 = Statics.field71;
                class152 var39 = Statics.field48;
                class152 var40 = Statics.field1037;
                class152 var41 = Statics.field658;
                Statics.field2636 = var38;
                Statics.field2524 = var39;
                Statics.field2525 = var40;
                Statics.field2290 = var41;
                Statics.field2536 = new class156[Statics.field2636.method3022()][];
                Statics.field2586 = new boolean[Statics.field2636.method3022()];
                class40.method46(Statics.field1825);
                class38.method725(Statics.field1825);
                class20.field311 = class133.field2079;
                class20.field310 = 60;
                field493 = 80;
            } else {
                class20.field311 = class133.field2078 + Statics.field1825.method3119() + "%";
                class20.field310 = 60;
            }
        } else if (field493 == 80) {
            int var42 = 0;
            if (Statics.field99 == null) {
                Statics.field99 = class83.method2224(Statics.field1037, "compass", "");
            } else {
                var42++;
            }
            if (Statics.field1507 == null) {
                Statics.field1507 = class83.method2224(Statics.field1037, "mapedge", "");
            } else {
                var42++;
            }
            if (Statics.field249 == null) {
                Statics.field249 = class83.method3136(Statics.field1037, "mapscene", "");
            } else {
                var42++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class83.method153(Statics.field1037, "mapfunction", "");
            } else {
                var42++;
            }
            if (Statics.field1533 == null) {
                Statics.field1533 = class83.method153(Statics.field1037, "hitmarks", "");
            } else {
                var42++;
            }
            if (Statics.field255 == null) {
                Statics.field255 = class83.method153(Statics.field1037, "headicons_pk", "");
            } else {
                var42++;
            }
            if (Statics.field286 == null) {
                Statics.field286 = class83.method153(Statics.field1037, "headicons_prayer", "");
            } else {
                var42++;
            }
            if (Statics.field1270 == null) {
                Statics.field1270 = class83.method153(Statics.field1037, "headicons_hint", "");
            } else {
                var42++;
            }
            if (Statics.field392 == null) {
                Statics.field392 = class83.method153(Statics.field1037, "mapmarker", "");
            } else {
                var42++;
            }
            if (Statics.field933 == null) {
                Statics.field933 = class83.method153(Statics.field1037, "cross", "");
            } else {
                var42++;
            }
            if (Statics.field69 == null) {
                Statics.field69 = class83.method153(Statics.field1037, "mapdots", "");
            } else {
                var42++;
            }
            if (Statics.field343 == null) {
                Statics.field343 = class83.method3136(Statics.field1037, "scrollbar", "");
            } else {
                var42++;
            }
            if (Statics.field1390 == null) {
                Statics.field1390 = class83.method3136(Statics.field1037, "mod_icons", "");
            } else {
                var42++;
            }
            if (Statics.field2037 == null) {
                Statics.field2037 = class83.method1597(Statics.field1037, "mapback", "");
            } else {
                var42++;
            }
            if (var42 < 14) {
                class20.field311 = class133.field2080 + var42 * 100 / 14 + "%";
                class20.field310 = 70;
            } else {
                Statics.field2786 = Statics.field1390;
                Statics.field1507.method1694();
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 41.0D) - 20;
                for (int var47 = 0; var47 < Statics.field241.length; var47++) {
                    Statics.field241[var47].method1716(var43 + var46, var44 + var46, var45 + var46);
                }
                Statics.field249[0].method1775(var43 + var46, var44 + var46, var45 + var46);
                Statics.field367 = new int[33];
                Statics.field75 = new int[33];
                Statics.field184 = new int[151];
                Statics.field548 = new int[151];
                for (int var48 = 0; var48 < 33; var48++) {
                    int var49 = 999;
                    int var50 = 0;
                    for (int var51 = 0; var51 < 34; var51++) {
                        if (Statics.field2037.field1470[Statics.field2037.field1468 * var48 + var51] == 0) {
                            if (var49 == 999) {
                                var49 = var51;
                            }
                        } else if (var49 != 999) {
                            var50 = var51;
                            break;
                        }
                    }
                    Statics.field367[var48] = var49;
                    Statics.field75[var48] = var50 - var49;
                }
                for (int var52 = 5; var52 < 156; var52++) {
                    int var53 = 999;
                    int var54 = 0;
                    for (int var55 = 25; var55 < 172; var55++) {
                        if (Statics.field2037.field1470[Statics.field2037.field1468 * var52 + var55] == 0 && var55 > 34 || var52 > 34) {
                            if (var53 == 999) {
                                var53 = var55;
                            }
                        } else if (var53 != 999) {
                            var54 = var55;
                            break;
                        }
                    }
                    Statics.field184[var52 - 5] = var53 - 25;
                    Statics.field548[var52 - 5] = var54 - var53;
                }
                class20.field311 = class133.field2081;
                class20.field310 = 70;
                field493 = 90;
            }
        } else if (field493 == 90) {
            if (Statics.field865.method3016()) {
                class109 var56 = new class109(Statics.field865, Statics.field1037, 20, 0.8D, field471 ? 64 : 128);
                class103.method2174(var56);
                class103.method2214(0.8D);
                class20.field311 = class133.field2083;
                class20.field310 = 90;
                field493 = 110;
            } else {
                class20.field311 = class133.field2063 + Statics.field865.method3119() + "%";
                class20.field310 = 90;
            }
        } else if (field493 == 110) {
            Statics.field353 = new class15();
            Statics.field1791.method1485(Statics.field353, 10);
            class20.field311 = class133.field2084;
            class20.field310 = 94;
            field493 = 120;
        } else if (field493 == 120) {
            if (Statics.field77.method3040("huffman", "")) {
                class119 var57 = new class119(Statics.field77.method3028("huffman", ""));
                class182.method2676(var57);
                class20.field311 = class133.field2133;
                class20.field310 = 96;
                field493 = 130;
            } else {
                class20.field311 = class133.field2275 + "%";
                class20.field310 = 96;
            }
        } else if (field493 == 130) {
            if (!Statics.field71.method3016()) {
                class20.field311 = class133.field2087 + Statics.field71.method3119() * 4 / 5 + "%";
                class20.field310 = 100;
            } else if (!Statics.field731.method3016()) {
                class20.field311 = class133.field2087 + (80 + Statics.field731.method3119() / 6) + "%";
                class20.field310 = 100;
            } else if (Statics.field658.method3016()) {
                class20.field311 = class133.field2088;
                class20.field310 = 100;
                field493 = 140;
            } else {
                class20.field311 = class133.field2087 + (96 + Statics.field658.method3119() / 20) + "%";
                class20.field310 = 100;
            }
        } else if (field493 == 140) {
            method3044(10);
        }
    }

    @ObfuscatedName("dn.z(IZZZS)Leh;")
    public static class152 method2244(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1420 != null) {
            var4 = new class70(arg0, class81.field1420, Statics.field1247[arg0], 1000000);
        }
        return new class152(var4, Statics.field1253, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ca.d(I)V")
    public static final void method2057() {
        try {
            if (field668 == 0) {
                if (Statics.field1328 != null) {
                    Statics.field1328.method1366();
                    Statics.field1328 = null;
                }
                Statics.field1366 = null;
                field519 = false;
                field463 = 0;
                field668 = 1;
            }
            if (field668 == 1) {
                if (Statics.field1366 == null) {
                    Statics.field1366 = Statics.field1791.method1505(Statics.field2665, Statics.field1032);
                }
                if (Statics.field1366.field1398 == 2) {
                    throw new IOException();
                }
                if (Statics.field1366.field1398 == 1) {
                    Statics.field1328 = new class69((Socket) Statics.field1366.field1402, Statics.field1791);
                    Statics.field1366 = null;
                    field668 = 2;
                }
            }
            if (field668 == 2) {
                field634.field2016 = 0;
                field634.method2472(14);
                Statics.field1328.method1371(field634.field2013, 0, 1);
                field715.field2016 = 0;
                field668 = 3;
            }
            if (field668 == 3) {
                if (Statics.field917 != null) {
                    Statics.field917.method1146();
                }
                if (Statics.field1907 != null) {
                    Statics.field1907.method1146();
                }
                int var0 = Statics.field1328.method1368();
                if (Statics.field917 != null) {
                    Statics.field917.method1146();
                }
                if (Statics.field1907 != null) {
                    Statics.field1907.method1146();
                }
                if (var0 != 0) {
                    method2722(var0);
                    return;
                }
                field715.field2016 = 0;
                field668 = 5;
            }
            if (field668 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field634.field2016 = 0;
                field634.method2472(10);
                field634.method2475(var1[0]);
                field634.method2475(var1[1]);
                field634.method2475(var1[2]);
                field634.method2475(var1[3]);
                field634.method2476(0L);
                field634.method2477(class20.field317);
                field634.method2578(class6.field68, class6.field80);
                field509.field2016 = 0;
                if (field474 == 40) {
                    field509.method2472(18);
                } else {
                    field509.method2472(16);
                }
                field509.method2473(0);
                int var2 = field509.field2016;
                field509.method2475(7);
                field509.method2606(field634.field2013, 0, field634.field2016);
                int var3 = field509.field2016;
                field509.method2477(class20.field316);
                field509.method2472(field471 ? 1 : 0);
                class81.method1403(field509);
                field509.method2475(Statics.field64.field2449);
                field509.method2475(Statics.field496.field2449);
                field509.method2475(Statics.field1825.field2449);
                field509.method2475(Statics.field71.field2449);
                field509.method2475(Statics.field15.field2449);
                field509.method2475(Statics.field1964.field2449);
                field509.method2475(Statics.field2455.field2449);
                field509.method2475(Statics.field48.field2449);
                field509.method2475(Statics.field1037.field2449);
                field509.method2475(Statics.field865.field2449);
                field509.method2475(Statics.field77.field2449);
                field509.method2475(Statics.field2477.field2449);
                field509.method2475(Statics.field731.field2449);
                field509.method2475(Statics.field658.field2449);
                field509.method2475(Statics.field364.field2449);
                field509.method2475(Statics.field169.field2449);
                field509.method2501(var1, var3, field509.field2016);
                field509.method2481(field509.field2016 - var2);
                Statics.field1328.method1371(field509.field2013, 0, field509.field2016);
                field634.method2359(var1);
                for (int var4 = 0; var4 < 4; var4++) {
                    var1[var4] += 50;
                }
                field715.method2359(var1);
                field668 = 6;
            }
            if (field668 == 6 && Statics.field1328.method1369() > 0) {
                int var5 = Statics.field1328.method1368();
                if (var5 == 21 && field474 == 20) {
                    field668 = 7;
                } else if (var5 == 2) {
                    field668 = 9;
                } else if (var5 == 15 && field474 == 40) {
                    field634.field2016 = 0;
                    field715.field2016 = 0;
                    field529 = -1;
                    field516 = -1;
                    field517 = -1;
                    field674 = -1;
                    field497 = 0;
                    field697 = 0;
                    field584 = 0;
                    field612 = 0;
                    field693 = false;
                    field628 = 0;
                    field700 = 0;
                    for (int var6 = 0; var6 < field618.length; var6++) {
                        if (field618[var6] != null) {
                            field618[var6].field426 = -1;
                        }
                    }
                    for (int var7 = 0; var7 < field504.length; var7++) {
                        if (field504[var7] != null) {
                            field504[var7].field426 = -1;
                        }
                    }
                    class18.method41();
                    method3044(30);
                    for (int var8 = 0; var8 < 100; var8++) {
                        field472[var8] = true;
                    }
                    return;
                } else if (var5 == 23 && field501 < 1) {
                    field501++;
                    field668 = 0;
                } else {
                    method2722(var5);
                    return;
                }
            }
            if (field668 == 7 && Statics.field1328.method1369() > 0) {
                field527 = (Statics.field1328.method1368() + 3) * 60;
                field668 = 8;
            }
            if (field668 == 8) {
                field463 = 0;
                class20.method811(class133.field2089, class133.field2090, field527 / 60 + class133.field2086);
                if (--field527 <= 0) {
                    field668 = 0;
                }
            } else {
                if (field668 == 9 && Statics.field1328.method1369() >= 8) {
                    field636 = Statics.field1328.method1368();
                    field616 = Statics.field1328.method1368() == 1;
                    field595 = Statics.field1328.method1368();
                    field595 <<= 0x8;
                    field595 += Statics.field1328.method1368();
                    field596 = Statics.field1328.method1368();
                    Statics.field1328.method1370(field715.field2013, 0, 1);
                    field715.field2016 = 0;
                    field529 = field715.method2360();
                    Statics.field1328.method1370(field715.field2013, 0, 2);
                    field715.field2016 = 0;
                    field497 = field715.method2487();
                    if (field596 == 1) {
                        try {
                            class66.method1361(Statics.field464, "zap");
                        } catch (Throwable var32) {
                        }
                    } else {
                        try {
                            class66.method1361(Statics.field464, "unzap");
                        } catch (Throwable var31) {
                        }
                    }
                    field668 = 10;
                }
                if (field668 != 10) {
                    field463++;
                    if (field463 > 2000) {
                        if (field501 < 1) {
                            if (Statics.field503 == Statics.field1032) {
                                Statics.field1032 = Statics.field178;
                            } else {
                                Statics.field1032 = Statics.field503;
                            }
                            field501++;
                            field668 = 0;
                        } else {
                            method2722(-3);
                        }
                    }
                } else if (Statics.field1328.method1369() >= field497) {
                    field715.field2016 = 0;
                    Statics.field1328.method1370(field715.field2013, 0, field497);
                    field477 = 0L;
                    field480 = 0;
                    Statics.field353.field232 = 0;
                    Statics.field945 = true;
                    field481 = true;
                    class180.method1865();
                    field634.field2016 = 0;
                    field715.field2016 = 0;
                    field529 = -1;
                    field516 = -1;
                    field517 = -1;
                    field674 = -1;
                    field697 = 0;
                    field584 = 0;
                    field696 = 0;
                    field484 = 0;
                    field612 = 0;
                    field693 = false;
                    class76.field1375 = 0;
                    for (int var11 = 0; var11 < 100; var11++) {
                        field617[var11] = null;
                    }
                    field561 = 0;
                    field545 = 0;
                    field513 = false;
                    field718 = 0;
                    field535 = (int) (Math.random() * 100.0D) - 50;
                    field537 = (int) (Math.random() * 110.0D) - 55;
                    field539 = (int) (Math.random() * 80.0D) - 40;
                    field542 = (int) (Math.random() * 120.0D) - 60;
                    field544 = (int) (Math.random() * 30.0D) - 20;
                    field556 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field628 = 0;
                    field695 = -1;
                    field700 = 0;
                    field701 = 0;
                    field590 = 0;
                    field505 = 0;
                    for (int var12 = 0; var12 < 2048; var12++) {
                        field618[var12] = null;
                        field594[var12] = null;
                    }
                    for (int var13 = 0; var13 < 32768; var13++) {
                        field504[var13] = null;
                    }
                    Statics.field2611 = field618[2047] = new class3();
                    field719.method3376();
                    field606.method3376();
                    for (int var14 = 0; var14 < 4; var14++) {
                        for (int var15 = 0; var15 < 104; var15++) {
                            for (int var16 = 0; var16 < 104; var16++) {
                                field603[var14][var15][var16] = null;
                            }
                        }
                    }
                    field604 = new class175();
                    field468 = 0;
                    field720 = 0;
                    for (int var17 = 0; var17 < Statics.field1027; var17++) {
                        class41 var18 = (class41) class41.field1028.method3311((long) var17);
                        class41 var19;
                        if (var18 == null) {
                            byte[] var20 = Statics.field1033.method3012(16, var17);
                            class41 var21 = new class41();
                            if (var20 != null) {
                                var21.method890(new class126(var20));
                            }
                            class41.field1028.method3314(var21, (long) var17);
                            var19 = var21;
                        } else {
                            var19 = var18;
                        }
                        if (var19 != null && var19.field1029 == 0) {
                            class157.field2650[var17] = 0;
                            class157.field2656[var17] = 0;
                        }
                    }
                    for (int var23 = 0; var23 < field663.length; var23++) {
                        field663[var23] = -1;
                    }
                    if (field629 != -1) {
                        int var24 = field629;
                        if (var24 != -1 && Statics.field2586[var24]) {
                            Statics.field2636.method3045(var24);
                            if (Statics.field2536[var24] != null) {
                                boolean var25 = true;
                                for (int var26 = 0; var26 < Statics.field2536[var24].length; var26++) {
                                    if (Statics.field2536[var24][var26] != null) {
                                        if (Statics.field2536[var24][var26].field2533 == 2) {
                                            var25 = false;
                                        } else {
                                            Statics.field2536[var24][var26] = null;
                                        }
                                    }
                                }
                                if (var25) {
                                    Statics.field2536[var24] = null;
                                }
                                Statics.field2586[var24] = false;
                            }
                        }
                    }
                    for (class4 var27 = (class4) field630.method3357(); var27 != null; var27 = (class4) field630.method3372()) {
                        method4(var27, true);
                    }
                    field629 = -1;
                    field630 = new class173(8);
                    field633 = null;
                    field693 = false;
                    field612 = 0;
                    field726.method3249((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var28 = 0; var28 < 8; var28++) {
                        field689[var28] = null;
                        field601[var28] = false;
                    }
                    class18.method41();
                    field559 = true;
                    for (int var29 = 0; var29 < 100; var29++) {
                        field472[var29] = true;
                    }
                    field702 = null;
                    Statics.field46 = 0;
                    Statics.field256 = null;
                    Statics.field1787 = -1;
                    method1405(false);
                    field529 = -1;
                }
            }
        } catch (IOException var33) {
            if (field501 < 1) {
                if (Statics.field503 == Statics.field1032) {
                    Statics.field1032 = Statics.field178;
                } else {
                    Statics.field1032 = Statics.field503;
                }
                field501++;
                field668 = 0;
            } else {
                method2722(-2);
            }
        }
    }

    @ObfuscatedName("ea.x(II)V")
    public static void method2722(int arg0) {
        if (arg0 == -3) {
            class20.method811(class133.field2271, class133.field2254, class133.field2094);
        } else if (arg0 == -2) {
            class20.method811(class133.field2058, class133.field2242, class133.field2097);
        } else if (arg0 == -1) {
            class20.method811(class133.field2230, class133.field2099, class133.field2100);
        } else if (arg0 == 3) {
            class20.method811(class133.field2226, class133.field2239, class133.field2103);
        } else if (arg0 == 4) {
            class20.method811(class133.field2104, class133.field2105, class133.field2241);
        } else if (arg0 == 5) {
            class20.method811(class133.field2107, class133.field2108, class133.field2143);
        } else if (arg0 == 6) {
            class20.method811(class133.field2110, class133.field2111, class133.field2112);
        } else if (arg0 == 7) {
            class20.method811(class133.field2113, class133.field2138, class133.field2115);
        } else if (arg0 == 8) {
            class20.method811(class133.field2188, class133.field2129, class133.field2136);
        } else if (arg0 == 9) {
            class20.method811(class133.field2119, class133.field2120, class133.field2121);
        } else if (arg0 == 10) {
            class20.method811(class133.field2200, class133.field2071, class133.field2140);
        } else if (arg0 == 11) {
            class20.method811(class133.field2125, class133.field2126, class133.field2092);
        } else if (arg0 == 12) {
            class20.method811(class133.field2128, class133.field2276, class133.field2130);
        } else if (arg0 == 13) {
            class20.method811(class133.field2131, class133.field2132, class133.field2221);
        } else if (arg0 == 14) {
            class20.method811(class133.field2127, class133.field2135, class133.field2278);
        } else if (arg0 == 16) {
            class20.method811(class133.field2137, class133.field2189, class133.field2139);
        } else if (arg0 == 17) {
            class20.method811(class133.field2283, class133.field2141, class133.field2059);
        } else if (arg0 == 18) {
            class20.method811(class133.field2123, class133.field2144, class133.field2117);
        } else if (arg0 == 19) {
            class20.method811(class133.field2146, class133.field2147, class133.field2148);
        } else if (arg0 == 20) {
            class20.method811(class133.field2174, class133.field2150, class133.field2151);
        } else if (arg0 == 22) {
            class20.method811(class133.field2152, class133.field2153, class133.field2154);
        } else if (arg0 == 23) {
            class20.method811(class133.field2145, class133.field2156, class133.field2157);
        } else if (arg0 == 24) {
            class20.method811(class133.field2158, class133.field2159, class133.field2160);
        } else if (arg0 == 25) {
            class20.method811(class133.field2161, class133.field2162, class133.field2163);
        } else if (arg0 == 26) {
            class20.method811(class133.field2164, class133.field2165, class133.field2066);
        } else if (arg0 == 27) {
            class20.method811(class133.field2167, class133.field2182, class133.field2169);
        } else if (arg0 == 31) {
            class20.method811(class133.field2095, class133.field2177, class133.field2171);
        } else if (arg0 == 32) {
            class20.method811(class133.field2218, class133.field2180, class133.field2181);
        } else if (arg0 == 37) {
            class20.method811(class133.field2202, class133.field2183, class133.field2184);
        } else if (arg0 == 38) {
            class20.method811(class133.field2185, class133.field2186, class133.field2187);
        } else if (arg0 == 55) {
            class20.method811(class133.field2204, class133.field2096, class133.field2190);
        } else {
            class20.method811(class133.field2191, class133.field2192, class133.field2193);
        }
        method3044(10);
    }

    @ObfuscatedName("p.s(I)V")
    public static final void method60() {
        if (Statics.field1328 != null) {
            Statics.field1328.method1366();
            Statics.field1328 = null;
        }
        method3304();
        Statics.field1210.method1873();
        for (int var0 = 0; var0 < 4; var0++) {
            field526[var0].method3282();
        }
        System.gc();
        class137.method2717(2);
        field528 = -1;
        field705 = false;
        for (class7 var1 = (class7) class7.field84.method3382(); var1 != null; var1 = (class7) class7.field84.method3388()) {
            if (var1.field90 != null) {
                Statics.field1291.method1100(var1.field90);
                var1.field90 = null;
            }
            if (var1.field95 != null) {
                Statics.field1291.method1100(var1.field95);
                var1.field95 = null;
            }
        }
        class7.field84.method3376();
        method3044(10);
    }

    @ObfuscatedName("fz.m(I)V")
    public static final void method3304() {
        class36.field921.method3315();
        class32.method151();
        class35.field905.method3315();
        class31.method152();
        class30.field761.method3315();
        class30.field762.method3315();
        class39.method751();
        class33.field861.method3315();
        class33.field864.method3315();
        class34.method608();
        Statics.method3();
        class41.field1028.method3315();
        class161.field2682.method3315();
        class156.method2357();
        ((class109) Statics.field1753).method2257();
        class5.field67.method3315();
        Statics.field64.method3053();
        Statics.field496.method3053();
        Statics.field71.method3053();
        Statics.field15.method3053();
        Statics.field1964.method3053();
        Statics.field2455.method3053();
        Statics.field48.method3053();
        Statics.field1037.method3053();
        Statics.field865.method3053();
        Statics.field77.method3053();
        Statics.field2477.method3053();
        Statics.field731.method3053();
    }

    @ObfuscatedName("t.y(I)V")
    public static final void method96() {
        if (field696 > 0) {
            method60();
        } else {
            method3044(40);
            Statics.field515 = Statics.field1328;
            Statics.field1328 = null;
        }
    }

    @ObfuscatedName("ah.h(B)V")
    public static final void method790() {
        if (Statics.field1907 != null) {
            Statics.field1907.method1145();
        }
        if (Statics.field917 != null) {
            Statics.field917.method1145();
        }
    }

    @ObfuscatedName("aw.f(Lao;IIIB)V")
    public static void method631(class33 arg0, int arg1, int arg2, int arg3) {
        if (field718 >= 50 || field707 == 0 || arg0.field866 == null || arg1 >= arg0.field866.length) {
            return;
        }
        int var4 = arg0.field866[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field709[field718] = var5;
        field710[field718] = var6;
        field711[field718] = 0;
        field512[field718] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field712[field718] = (var8 << 16) + (var9 << 8) + var7;
        field718++;
    }

    @ObfuscatedName("es.v(II)V")
    public static void method3126(int arg0) {
        if (arg0 == -1 && !field705) {
            class137.method12();
        } else if (arg0 != -1 && field528 != arg0 && field703 != 0 && !field705) {
            class137.method2710(2, Statics.field2455, arg0, 0, field703, false);
        }
        field528 = arg0;
    }

    @ObfuscatedName("ax.u(III)V")
    public static void method821(int arg0, int arg1) {
        if (field703 != 0 && arg0 != -1) {
            class137.method2466(Statics.field2477, arg0, 0, field703, false);
            field705 = true;
        }
    }

    @ObfuscatedName("c.c(I)V")
    public static final void method244() {
        for (int var0 = -1; var0 < field590; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field591[var0];
            }
            class3 var2 = field618[var1];
            if (var2 != null && var2.field411 > 0) {
                var2.field411--;
                if (var2.field411 == 0) {
                    var2.field416 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field505; var3++) {
            int var4 = field506[var3];
            class24 var5 = field504[var4];
            if (var5 != null && var5.field411 > 0) {
                var5.field411--;
                if (var5.field411 == 0) {
                    var5.field416 = null;
                }
            }
        }
    }

    @ObfuscatedName("p.al(I)V")
    public static final void method58() {
        int var0 = field535 + Statics.field2611.field441;
        int var1 = field537 + Statics.field2611.field433;
        if (Statics.field1980 - var0 < -500 || Statics.field1980 - var0 > 500 || Statics.field1281 - var1 < -500 || Statics.field1281 - var1 > 500) {
            Statics.field1980 = var0;
            Statics.field1281 = var1;
        }
        if (Statics.field1980 != var0) {
            Statics.field1980 += (var0 - Statics.field1980) / 16;
        }
        if (Statics.field1281 != var1) {
            Statics.field1281 += (var1 - Statics.field1281) / 16;
        }
        if (class74.field1352[96]) {
            field678 += (-24 - field678) / 2;
        } else if (class74.field1352[97]) {
            field678 += (24 - field678) / 2;
        } else {
            field678 /= 2;
        }
        if (class74.field1352[98]) {
            field558 += (12 - field558) / 2;
        } else if (class74.field1352[99]) {
            field558 += (-12 - field558) / 2;
        } else {
            field558 /= 2;
        }
        field556 = field678 / 2 + field556 & 0x7FF;
        field555 += field558 / 2;
        if (field555 < 128) {
            field555 = 128;
        }
        if (field555 > 383) {
            field555 = 383;
        }
        int var2 = Statics.field1980 >> 7;
        int var3 = Statics.field1281 >> 7;
        int var4 = method876(Statics.field1980, Statics.field1281, Statics.field1899);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field1899;
                    if (var8 < 3 && (class9.field125[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class9.field126[var8][var6][var7];
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
        if (var10 > field721) {
            field721 += (var10 - field721) / 24;
        } else if (var10 < field721) {
            field721 += (var10 - field721) / 80;
        }
    }

    @ObfuscatedName("bm.ai(B)V")
    public static final void method1548() {
        for (int var0 = -1; var0 < field590; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field591[var0];
            }
            class3 var2 = field618[var1];
            if (var2 != null) {
                method124(var2, 1);
            }
        }
    }

    @ObfuscatedName("x.ad(Lc;IB)V")
    public static final void method124(class26 arg0, int arg1) {
        if (arg0.field446 > field652) {
            int var2 = arg0.field446 - field652;
            int var3 = arg0.field454 * 64 + arg0.field442 * 128;
            int var4 = arg0.field454 * 64 + arg0.field404 * 128;
            arg0.field441 += (var3 - arg0.field441) / var2;
            arg0.field433 += (var4 - arg0.field433) / var2;
            arg0.field425 = 0;
            if (arg0.field403 == 0) {
                arg0.field451 = 1024;
            }
            if (arg0.field403 == 1) {
                arg0.field451 = 1536;
            }
            if (arg0.field403 == 2) {
                arg0.field451 = 0;
            }
            if (arg0.field403 == 3) {
                arg0.field451 = 512;
            }
        } else if (arg0.field447 >= field652) {
            method2260(arg0);
        } else {
            method197(arg0);
        }
        if (arg0.field441 < 128 || arg0.field433 < 128 || arg0.field441 >= 13184 || arg0.field433 >= 13184) {
            arg0.field432 = -1;
            arg0.field437 = -1;
            arg0.field446 = 0;
            arg0.field447 = 0;
            arg0.field441 = arg0.field405[0] * 128 + arg0.field454 * 64;
            arg0.field433 = arg0.field456[0] * 128 + arg0.field454 * 64;
            arg0.method228();
        }
        if (Statics.field2611 == arg0 && (arg0.field441 < 1536 || arg0.field433 < 1536 || arg0.field441 >= 11776 || arg0.field433 >= 11776)) {
            arg0.field432 = -1;
            arg0.field437 = -1;
            arg0.field446 = 0;
            arg0.field447 = 0;
            arg0.field441 = arg0.field405[0] * 128 + arg0.field454 * 64;
            arg0.field433 = arg0.field456[0] * 128 + arg0.field454 * 64;
            arg0.method228();
        }
        if (arg0.field453 != 0) {
            if (arg0.field426 != -1 && arg0.field426 < 32768) {
                class24 var5 = field504[arg0.field426];
                if (var5 != null) {
                    int var6 = arg0.field441 - var5.field441;
                    int var7 = arg0.field433 - var5.field433;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field451 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field426 >= 32768) {
                int var8 = arg0.field426 - 32768;
                if (field595 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field618[var8];
                if (var9 != null) {
                    int var10 = arg0.field441 - var9.field441;
                    int var11 = arg0.field433 - var9.field433;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field451 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field408 != 0 || arg0.field428 != 0) && (arg0.field450 == 0 || arg0.field425 > 0)) {
                int var12 = arg0.field441 - (arg0.field408 * 64 - Statics.field362 * 64 - Statics.field362 * 64);
                int var13 = arg0.field433 - (arg0.field428 * 64 - Statics.field65 * 64 - Statics.field65 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field451 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field408 = 0;
                arg0.field428 = 0;
            }
            int var14 = arg0.field451 - arg0.field417 & 0x7FF;
            if (var14 == 0) {
                arg0.field452 = 0;
            } else {
                arg0.field452++;
                if (var14 > 1024) {
                    arg0.field417 -= arg0.field453;
                    boolean var15 = true;
                    if (var14 < arg0.field453 || var14 > 2048 - arg0.field453) {
                        arg0.field417 = arg0.field451;
                        var15 = false;
                    }
                    if (arg0.field429 == arg0.field409 && (arg0.field452 > 25 || var15)) {
                        if (arg0.field445 == -1) {
                            arg0.field409 = arg0.field407;
                        } else {
                            arg0.field409 = arg0.field445;
                        }
                    }
                } else {
                    arg0.field417 += arg0.field453;
                    boolean var16 = true;
                    if (var14 < arg0.field453 || var14 > 2048 - arg0.field453) {
                        arg0.field417 = arg0.field451;
                        var16 = false;
                    }
                    if (arg0.field429 == arg0.field409 && (arg0.field452 > 25 || var16)) {
                        if (arg0.field410 == -1) {
                            arg0.field409 = arg0.field407;
                        } else {
                            arg0.field409 = arg0.field410;
                        }
                    }
                }
                arg0.field417 &= 0x7FF;
            }
        }
        arg0.field406 = false;
        if (arg0.field409 != -1) {
            class33 var18 = class33.method224(arg0.field409);
            if (var18 == null || var18.field863 == null) {
                arg0.field409 = -1;
            } else {
                arg0.field431++;
                if (arg0.field430 < var18.field863.length && arg0.field431 > var18.field862[arg0.field430]) {
                    arg0.field431 = 1;
                    arg0.field430++;
                    method631(var18, arg0.field430, arg0.field441, arg0.field433);
                }
                if (arg0.field430 >= var18.field863.length) {
                    arg0.field431 = 0;
                    arg0.field430 = 0;
                    method631(var18, arg0.field430, arg0.field441, arg0.field433);
                }
            }
        }
        if (arg0.field437 != -1 && field652 >= arg0.field440) {
            if (arg0.field459 < 0) {
                arg0.field459 = 0;
            }
            int var19 = class34.method895(arg0.field437).field894;
            if (var19 == -1) {
                arg0.field437 = -1;
            } else {
                class33 var20 = class33.method224(var19);
                if (var20 == null || var20.field863 == null) {
                    arg0.field437 = -1;
                } else {
                    arg0.field439++;
                    if (arg0.field459 < var20.field863.length && arg0.field439 > var20.field862[arg0.field459]) {
                        arg0.field439 = 1;
                        arg0.field459++;
                        method631(var20, arg0.field459, arg0.field441, arg0.field433);
                    }
                    if (arg0.field459 >= var20.field863.length && (arg0.field459 < 0 || arg0.field459 >= var20.field863.length)) {
                        arg0.field437 = -1;
                    }
                }
            }
        }
        if (arg0.field432 != -1 && arg0.field418 <= 1) {
            class33 var21 = class33.method224(arg0.field432);
            if (var21.field870 == 1 && arg0.field415 > 0 && arg0.field446 <= field652 && arg0.field447 < field652) {
                arg0.field418 = 1;
                return;
            }
        }
        if (arg0.field432 != -1 && arg0.field418 == 0) {
            class33 var22 = class33.method224(arg0.field432);
            if (var22 == null || var22.field863 == null) {
                arg0.field432 = -1;
            } else {
                arg0.field434++;
                if (arg0.field435 < var22.field863.length && arg0.field434 > var22.field862[arg0.field435]) {
                    arg0.field434 = 1;
                    arg0.field435++;
                    method631(var22, arg0.field435, arg0.field441, arg0.field433);
                }
                if (arg0.field435 >= var22.field863.length) {
                    arg0.field435 -= var22.field867;
                    arg0.field436++;
                    if (arg0.field436 >= var22.field873) {
                        arg0.field432 = -1;
                    } else if (arg0.field435 >= 0 && arg0.field435 < var22.field863.length) {
                        method631(var22, arg0.field435, arg0.field441, arg0.field433);
                    } else {
                        arg0.field432 = -1;
                    }
                }
                arg0.field406 = var22.field859;
            }
        }
        if (arg0.field418 > 0) {
            arg0.field418--;
        }
    }

    @ObfuscatedName("de.aw(Lc;S)V")
    public static final void method2260(class26 arg0) {
        if (field652 == arg0.field447 || arg0.field432 == -1 || arg0.field418 != 0 || arg0.field434 + 1 > class33.method224(arg0.field432).field862[arg0.field435]) {
            int var1 = arg0.field447 - arg0.field446;
            int var2 = field652 - arg0.field446;
            int var3 = arg0.field454 * 64 + arg0.field442 * 128;
            int var4 = arg0.field454 * 64 + arg0.field404 * 128;
            int var5 = arg0.field454 * 64 + arg0.field443 * 128;
            int var6 = arg0.field458 * 128 + arg0.field454 * 64;
            arg0.field441 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field433 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field425 = 0;
        if (arg0.field403 == 0) {
            arg0.field451 = 1024;
        }
        if (arg0.field403 == 1) {
            arg0.field451 = 1536;
        }
        if (arg0.field403 == 2) {
            arg0.field451 = 0;
        }
        if (arg0.field403 == 3) {
            arg0.field451 = 512;
        }
        arg0.field417 = arg0.field451;
    }

    @ObfuscatedName("h.af(Lc;I)V")
    public static final void method197(class26 arg0) {
        arg0.field409 = arg0.field429;
        if (arg0.field450 == 0) {
            arg0.field425 = 0;
            return;
        }
        if (arg0.field432 != -1 && arg0.field418 == 0) {
            class33 var1 = class33.method224(arg0.field432);
            if (arg0.field415 > 0 && var1.field870 == 0) {
                arg0.field425++;
                return;
            }
            if (arg0.field415 <= 0 && var1.field880 == 0) {
                arg0.field425++;
                return;
            }
        }
        int var2 = arg0.field441;
        int var3 = arg0.field433;
        int var4 = arg0.field405[arg0.field450 - 1] * 128 + arg0.field454 * 64;
        int var5 = arg0.field456[arg0.field450 - 1] * 128 + arg0.field454 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field441 = var4;
            arg0.field433 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field451 = 1280;
            } else if (var3 > var5) {
                arg0.field451 = 1792;
            } else {
                arg0.field451 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field451 = 768;
            } else if (var3 > var5) {
                arg0.field451 = 256;
            } else {
                arg0.field451 = 512;
            }
        } else if (var3 < var5) {
            arg0.field451 = 1024;
        } else if (var3 > var5) {
            arg0.field451 = 0;
        }
        int var6 = arg0.field451 - arg0.field417 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field412;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field407;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field414;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field413;
        }
        if (var7 == -1) {
            var7 = arg0.field407;
        }
        arg0.field409 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field378.field793;
        }
        if (var9) {
            if (arg0.field451 != arg0.field417 && arg0.field426 == -1 && arg0.field453 != 0) {
                var8 = 2;
            }
            if (arg0.field450 > 2) {
                var8 = 6;
            }
            if (arg0.field450 > 3) {
                var8 = 8;
            }
            if (arg0.field425 > 0 && arg0.field450 > 1) {
                var8 = 8;
                arg0.field425--;
            }
        } else {
            if (arg0.field450 > 1) {
                var8 = 6;
            }
            if (arg0.field450 > 2) {
                var8 = 8;
            }
            if (arg0.field425 > 0 && arg0.field450 > 1) {
                var8 = 8;
                arg0.field425--;
            }
        }
        if (arg0.field457[arg0.field450 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field409 == arg0.field407 && arg0.field438 != -1) {
            arg0.field409 = arg0.field438;
        }
        if (var2 < var4) {
            arg0.field441 += var8;
            if (arg0.field441 > var4) {
                arg0.field441 = var4;
            }
        } else if (var2 > var4) {
            arg0.field441 -= var8;
            if (arg0.field441 < var4) {
                arg0.field441 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field433 += var8;
            if (arg0.field433 > var5) {
                arg0.field433 = var5;
            }
        } else if (var3 > var5) {
            arg0.field433 -= var8;
            if (arg0.field433 < var5) {
                arg0.field433 = var5;
            }
        }
        if (arg0.field441 == var4 && arg0.field433 == var5) {
            arg0.field450--;
            if (arg0.field415 > 0) {
                arg0.field415--;
            }
        }
    }

    @ObfuscatedName("l.an(Ln;III)V")
    public static void method57(class3 arg0, int arg1, int arg2) {
        if (arg0.field432 == arg1 && arg1 != -1) {
            int var3 = class33.method224(arg1).field876;
            if (var3 == 1) {
                arg0.field435 = 0;
                arg0.field434 = 0;
                arg0.field418 = arg2;
                arg0.field436 = 0;
            }
            if (var3 == 2) {
                arg0.field436 = 0;
            }
        } else if (arg1 == -1 || arg0.field432 == -1 || class33.method224(arg1).field875 >= class33.method224(arg0.field432).field875) {
            arg0.field432 = arg1;
            arg0.field435 = 0;
            arg0.field434 = 0;
            arg0.field418 = arg2;
            arg0.field436 = 0;
            arg0.field415 = arg0.field450;
        }
    }

    @ObfuscatedName("j.ao(B)V")
    public static final void method30() {
        if (!field693) {
            field677[0] = class133.field2272;
            field502[0] = "";
            field615[0] = 1006;
            field612 = 1;
        }
        if (field629 != -1) {
            method1(field629);
        }
        for (int var0 = 0; var0 < field670; var0++) {
            if (field472[var0]) {
                field673[var0] = true;
            }
            field656[var0] = field472[var0];
            field472[var0] = false;
        }
        field671 = field652;
        field619 = -1;
        field620 = -1;
        Statics.field238 = null;
        if (field629 != -1) {
            field670 = 0;
            method3085(field629, 0, 0, 765, 503, 0, 0, -1);
        }
        class88.method1816();
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field612 - 1; var2++) {
                if (field615[var2] < 1000 && field615[var2 + 1] > 1000) {
                    String var3 = field502[var2];
                    field502[var2] = field502[var2 + 1];
                    field502[var2 + 1] = var3;
                    String var4 = field677[var2];
                    field677[var2] = field677[var2 + 1];
                    field677[var2 + 1] = var4;
                    int var5 = field615[var2];
                    field615[var2] = field615[var2 + 1];
                    field615[var2 + 1] = var5;
                    int var6 = field613[var2];
                    field613[var2] = field613[var2 + 1];
                    field613[var2 + 1] = var6;
                    int var7 = field614[var2];
                    field614[var2] = field614[var2 + 1];
                    field614[var2 + 1] = var7;
                    int var8 = field486[var2];
                    field486[var2] = field486[var2 + 1];
                    field486[var2 + 1] = var8;
                    var1 = false;
                }
            }
        }
        if (field693) {
            method3305();
        } else if (field619 != -1) {
            int var9 = field619;
            int var10 = field620;
            if (field612 >= 2 || field545 != 0 || field513) {
                String var11;
                if (field545 == 1 && field612 < 2) {
                    var11 = class133.field2114 + class133.field2209 + field714 + " " + class2.field20;
                } else if (field513 && field612 < 2) {
                    var11 = field552 + class133.field2209 + field642 + " " + class2.field20;
                } else {
                    int var12 = field612 - 1;
                    String var13;
                    if (field502[var12].length() > 0) {
                        var13 = field677[var12] + class133.field2209 + field502[var12];
                    } else {
                        var13 = field677[var12];
                    }
                    var11 = var13;
                }
                if (field612 > 2) {
                    var11 = var11 + class2.method1398(16777215) + " " + '/' + " " + (field612 - 2) + class133.field2203;
                }
                Statics.field2297.method3478(var11, var9 + 4, var10 + 15, 16777215, 0, field652 / 1000);
            }
        }
        if (field679 == 3) {
            for (int var14 = 0; var14 < field670; var14++) {
                if (field656[var14]) {
                    class88.method1797(field675[var14], field676[var14], field547[var14], field498[var14], 16711935, 128);
                } else if (field673[var14]) {
                    class88.method1797(field675[var14], field676[var14], field547[var14], field498[var14], 16711680, 128);
                }
            }
        }
        class7.method110(Statics.field1899, Statics.field2611.field441, Statics.field2611.field433, field637);
        field637 = 0;
    }

    @ObfuscatedName("ae.ak(Ljava/lang/String;ZI)V")
    public static final void method897(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field285.method3472(arg0, 250);
        int var6 = Statics.field285.method3452(arg0, 250) * 13;
        class88.method1842(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class88.method1800(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field285.method3457(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method159(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method1401(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field1013.getGraphics();
            Statics.field1187.method1622(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field1013.repaint();
        }
    }

    @ObfuscatedName("db.ah(IIIII)V")
    public static final void method2350(int arg0, int arg1, int arg2, int arg3) {
        class88.method1792(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class103.method2166();
        field573++;
        method115(true);
        method111(true);
        method115(false);
        method111(false);
        for (class10 var4 = (class10) field719.method3382(); var4 != null; var4 = (class10) field719.method3388()) {
            if (Statics.field1899 != var4.field145 || field652 > var4.field151) {
                var4.method3415();
            } else if (field652 >= var4.field150) {
                if (var4.field154 > 0) {
                    class24 var5 = field504[var4.field154 - 1];
                    if (var5 != null && var5.field441 >= 0 && var5.field441 < 13312 && var5.field433 >= 0 && var5.field433 < 13312) {
                        var4.method98(var5.field441, var5.field433, method876(var5.field441, var5.field433, var4.field145) - var4.field149, field652);
                    }
                }
                if (var4.field154 < 0) {
                    int var6 = -var4.field154 - 1;
                    class3 var7;
                    if (field595 == var6) {
                        var7 = Statics.field2611;
                    } else {
                        var7 = field618[var6];
                    }
                    if (var7 != null && var7.field441 >= 0 && var7.field441 < 13312 && var7.field433 >= 0 && var7.field433 < 13312) {
                        var4.method98(var7.field441, var7.field433, method876(var7.field441, var7.field433, var4.field145) - var4.field149, field652);
                    }
                }
                var4.method97(field637);
                Statics.field1210.method1884(Statics.field1899, (int) var4.field157, (int) var4.field164, (int) var4.field158, 60, var4, var4.field162, -1, false);
            }
        }
        method572();
        if (!field510) {
            int var8 = field555;
            if (field721 / 256 > var8) {
                var8 = field721 / 256;
            }
            if (field572[4] && field717[4] + 128 > var8) {
                var8 = field717[4] + 128;
            }
            int var9 = field556 + field539 & 0x7FF;
            int var10 = Statics.field1980;
            int var11 = method876(Statics.field2611.field441, Statics.field2611.field433, Statics.field1899) - 50;
            int var12 = Statics.field1281;
            int var13 = var8 * 3 + 600;
            int var14 = 2048 - var8 & 0x7FF;
            int var15 = 2048 - var9 & 0x7FF;
            int var16 = 0;
            int var17 = 0;
            int var18 = var13;
            if (var14 != 0) {
                int var19 = class103.field1756[var14];
                int var20 = class103.field1757[var14];
                int var21 = var17 * var20 - var13 * var19 >> 16;
                var18 = var17 * var19 + var13 * var20 >> 16;
                var17 = var21;
            }
            if (var15 != 0) {
                int var22 = class103.field1756[var15];
                int var23 = class103.field1757[var15];
                int var24 = var16 * var23 + var18 * var22 >> 16;
                var18 = var18 * var23 - var16 * var22 >> 16;
                var16 = var24;
            }
            Statics.field348 = var10 - var16;
            Statics.field359 = var11 - var17;
            Statics.field269 = var12 - var18;
            Statics.field2453 = var8;
            Statics.field1019 = var9;
        }
        int var37;
        if (field510) {
            var37 = method23();
        } else {
            int var25 = 3;
            if (Statics.field2453 < 310) {
                int var26 = Statics.field348 >> 7;
                int var27 = Statics.field269 >> 7;
                int var28 = Statics.field2611.field441 >> 7;
                int var29 = Statics.field2611.field433 >> 7;
                if ((class9.field125[Statics.field1899][var26][var27] & 0x4) != 0) {
                    var25 = Statics.field1899;
                }
                int var30;
                if (var28 > var26) {
                    var30 = var28 - var26;
                } else {
                    var30 = var26 - var28;
                }
                int var31;
                if (var29 > var27) {
                    var31 = var29 - var27;
                } else {
                    var31 = var27 - var29;
                }
                if (var30 > var31) {
                    int var32 = var31 * 65536 / var30;
                    int var33 = 32768;
                    while (var26 != var28) {
                        if (var26 < var28) {
                            var26++;
                        } else if (var26 > var28) {
                            var26--;
                        }
                        if ((class9.field125[Statics.field1899][var26][var27] & 0x4) != 0) {
                            var25 = Statics.field1899;
                        }
                        var33 += var32;
                        if (var33 >= 65536) {
                            var33 -= 65536;
                            if (var27 < var29) {
                                var27++;
                            } else if (var27 > var29) {
                                var27--;
                            }
                            if ((class9.field125[Statics.field1899][var26][var27] & 0x4) != 0) {
                                var25 = Statics.field1899;
                            }
                        }
                    }
                } else {
                    int var34 = var30 * 65536 / var31;
                    int var35 = 32768;
                    while (var27 != var29) {
                        if (var27 < var29) {
                            var27++;
                        } else if (var27 > var29) {
                            var27--;
                        }
                        if ((class9.field125[Statics.field1899][var26][var27] & 0x4) != 0) {
                            var25 = Statics.field1899;
                        }
                        var35 += var34;
                        if (var35 >= 65536) {
                            var35 -= 65536;
                            if (var26 < var28) {
                                var26++;
                            } else if (var26 > var28) {
                                var26--;
                            }
                            if ((class9.field125[Statics.field1899][var26][var27] & 0x4) != 0) {
                                var25 = Statics.field1899;
                            }
                        }
                    }
                }
            }
            if ((class9.field125[Statics.field1899][Statics.field2611.field441 >> 7][Statics.field2611.field433 >> 7] & 0x4) != 0) {
                var25 = Statics.field1899;
            }
            var37 = var25;
        }
        int var38 = Statics.field348;
        int var39 = Statics.field359;
        int var40 = Statics.field269;
        int var41 = Statics.field2453;
        int var42 = Statics.field1019;
        for (int var43 = 0; var43 < 5; var43++) {
            if (field572[var43]) {
                int var44 = (int) (Math.random() * (double) (field716[var43] * 2 + 1) - (double) field716[var43] + Math.sin((double) field723[var43] / 100.0D * (double) field685[var43]) * (double) field717[var43]);
                if (var43 == 0) {
                    Statics.field348 += var44;
                }
                if (var43 == 1) {
                    Statics.field359 += var44;
                }
                if (var43 == 2) {
                    Statics.field269 += var44;
                }
                if (var43 == 3) {
                    Statics.field1019 = Statics.field1019 + var44 & 0x7FF;
                }
                if (var43 == 4) {
                    Statics.field2453 += var44;
                    if (Statics.field2453 < 128) {
                        Statics.field2453 = 128;
                    }
                    if (Statics.field2453 > 383) {
                        Statics.field2453 = 383;
                    }
                }
            }
        }
        int var45 = class76.field1380;
        int var46 = class76.field1384;
        if (var45 >= arg0 && var45 < arg0 + arg2 && var46 >= arg1 && var46 < arg1 + arg3) {
            class111.field1892 = true;
            class111.field1884 = 0;
            class111.field1882 = class76.field1380 - arg0;
            class111.field1873 = class76.field1384 - arg1;
        } else {
            class111.field1892 = false;
            class111.field1884 = 0;
        }
        method790();
        class88.method1842(arg0, arg1, arg2, arg3, 0);
        method790();
        Statics.field1210.method1911(Statics.field348, Statics.field359, Statics.field269, Statics.field2453, Statics.field1019, var37);
        method790();
        Statics.field1210.method1887();
        method2261(arg0, arg1, arg2, arg3);
        method745(arg0, arg1);
        ((class109) Statics.field1753).method2251(field637);
        if (field579 == 1) {
            Statics.field933[field578 / 100].method1702(field576 - 8, field577 - 8);
        }
        if (field579 == 2) {
            Statics.field933[field578 / 100 + 4].method1702(field576 - 8, field577 - 8);
        }
        method105();
        if (field482) {
            int var47 = arg0 + 512 - 5;
            int var48 = arg1 + 20;
            Statics.field285.method3455("Fps:" + field1301, var47, var48, 16776960, -1);
            int var55 = var48 + 15;
            Runtime var49 = Runtime.getRuntime();
            int var50 = (int) ((var49.totalMemory() - var49.freeMemory()) / 1024L);
            int var51 = 16776960;
            if (var50 > 32768 && field471) {
                var51 = 16711680;
            }
            if (var50 > 65536 && !field471) {
                var51 = 16711680;
            }
            Statics.field285.method3455("Mem:" + var50 + "k", var47, var55, var51, -1);
            var48 = var55 + 15;
        }
        Statics.field348 = var38;
        Statics.field359 = var39;
        Statics.field269 = var40;
        Statics.field2453 = var41;
        Statics.field1019 = var42;
        if (field559) {
            byte var52 = 0;
            int var53 = class151.field2463 + class151.field2461 + var52;
            if (var53 == 0) {
                field559 = false;
            }
        }
        if (field559) {
            class88.method1842(arg0, arg1, arg2, arg3, 0);
            method897(class133.field2065, false);
        }
        if (!field559 && !field693 && var45 >= arg0 && var45 < arg0 + arg2 && var46 >= arg1 && var46 < arg1 + arg3) {
            method705(var45, var46, arg0, arg1);
        }
    }

    @ObfuscatedName("q.aq(ZI)V")
    public static final void method115(boolean arg0) {
        if (Statics.field2611.field441 >> 7 == field700 && Statics.field2611.field433 >> 7 == field701) {
            field700 = 0;
        }
        int var1 = field590;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2611;
                var4 = 33538048;
            } else {
                var3 = field618[field591[var2]];
                var4 = field591[var2] << 14;
            }
            if (var3 != null && var3.method18()) {
                var3.field44 = false;
                if ((field471 && field590 > 50 || field590 > 200) && !arg0 && var3.field429 == var3.field409) {
                    var3.field44 = true;
                }
                int var5 = var3.field441 >> 7;
                int var6 = var3.field433 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field27 == null || field652 < var3.field34 || field652 >= var3.field35) {
                        if ((var3.field441 & 0x7F) == 64 && (var3.field433 & 0x7F) == 64) {
                            if (field573 == field483[var5][var6]) {
                                continue;
                            }
                            field483[var5][var6] = field573;
                        }
                        var3.field43 = method876(var3.field441, var3.field433, Statics.field1899);
                        Statics.field1210.method1884(Statics.field1899, var3.field441, var3.field433, var3.field43, 60, var3, var3.field417, var4, var3.field406);
                    } else {
                        var3.field44 = false;
                        var3.field43 = method876(var3.field441, var3.field433, Statics.field1899);
                        Statics.field1210.method1885(Statics.field1899, var3.field441, var3.field433, var3.field43, 60, var3, var3.field417, var4, var3.field40, var3.field45, var3.field42, var3.field38);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.ax(ZI)V")
    public static final void method111(boolean arg0) {
        for (int var1 = 0; var1 < field505; var1++) {
            class24 var2 = field504[field506[var1]];
            int var3 = (field506[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field378.field780 == arg0 && var2.field378.method611()) {
                int var4 = var2.field441 >> 7;
                int var5 = var2.field433 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field454 == 1 && (var2.field441 & 0x7F) == 64 && (var2.field433 & 0x7F) == 64) {
                        if (field573 == field483[var4][var5]) {
                            continue;
                        }
                        field483[var4][var5] = field573;
                    }
                    if (!var2.field378.field792) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1210.method1884(Statics.field1899, var2.field441, var2.field433, method876(var2.field441 + (var2.field454 * 64 - 64), var2.field433 + (var2.field454 * 64 - 64), Statics.field1899), var2.field454 * 64 - 64 + 60, var2, var2.field417, var3, var2.field406);
                }
            }
        }
    }

    @ObfuscatedName("ai.ag(I)V")
    public static final void method572() {
        for (class19 var0 = (class19) field606.method3382(); var0 != null; var0 = (class19) field606.method3388()) {
            if (Statics.field1899 != var0.field282 || var0.field284) {
                var0.method3415();
            } else if (field652 >= var0.field276) {
                var0.method155(field637);
                if (var0.field284) {
                    var0.method3415();
                } else {
                    Statics.field1210.method1884(var0.field282, var0.field278, var0.field279, var0.field281, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("n.am(I)I")
    public static final int method23() {
        int var0 = method876(Statics.field348, Statics.field269, Statics.field1899);
        return var0 - Statics.field359 >= 800 || (class9.field125[Statics.field1899][Statics.field348 >> 7][Statics.field269 >> 7] & 0x4) == 0 ? 3 : Statics.field1899;
    }

    @ObfuscatedName("ao.at(IIB)V")
    public static final void method745(int arg0, int arg1) {
        if (field484 == 2) {
            method836((field487 - Statics.field362 << 7) + field490, (field521 - Statics.field65 << 7) + field491, field631 * 2);
            if (field704 > -1 && field652 % 20 < 10) {
                Statics.field1270[0].method1702(field704 + arg0 - 12, field575 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("de.ae(IIIIS)V")
    public static final void method2261(int arg0, int arg1, int arg2, int arg3) {
        field562 = 0;
        for (int var4 = -1; var4 < field590 + field505; var4++) {
            class26 var5;
            if (var4 == -1) {
                var5 = Statics.field2611;
            } else if (var4 < field590) {
                var5 = field618[field591[var4]];
            } else {
                var5 = field504[field506[var4 - field590]];
            }
            if (var5 != null && var5.method18()) {
                if (var5 instanceof class24) {
                    class30 var6 = ((class24) var5).field378;
                    if (var6.field791 != null) {
                        var6 = var6.method606();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field590) {
                    class30 var10 = ((class24) var5).field378;
                    if (var10.field791 != null) {
                        var10 = var10.method606();
                    }
                    if (var10.field787 >= 0 && var10.field787 < Statics.field286.length) {
                        method123(var5, var5.field427 + 15);
                        if (field704 > -1) {
                            Statics.field286[var10.field787].method1702(field704 + arg0 - 12, field575 + arg1 - 30);
                        }
                    }
                    if (field484 == 1 && field485 == field506[var4 - field590] && field652 % 20 < 10) {
                        int var11 = var5.field427 + 15;
                        method836(var5.field441, var5.field433, var11);
                        if (field704 > -1) {
                            Statics.field1270[0].method1702(field704 + arg0 - 12, field575 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field29 != -1 || var8.field30 != -1) {
                        method123(var5, var5.field427 + 15);
                        if (field704 > -1) {
                            if (var8.field29 != -1) {
                                Statics.field255[var8.field29].method1702(field704 + arg0 - 12, field575 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field30 != -1) {
                                Statics.field286[var8.field30].method1702(field704 + arg0 - 12, field575 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field484 == 10 && field541 == field591[var4]) {
                        int var9 = var5.field427 + 15;
                        method836(var5.field441, var5.field433, var9);
                        if (field704 > -1) {
                            Statics.field1270[1].method1702(field704 + arg0 - 12, field575 + arg1 - var7);
                        }
                    }
                }
                if (var5.field416 != null && (var4 >= field590 || field686 == 0 || field686 == 3 || field686 == 1 && method195(((class3) var5).field36))) {
                    method123(var5, var5.field427);
                    if (field704 > -1 && field562 < field563) {
                        field732[field562] = Statics.field2297.method3497(var5.field416) / 2;
                        field667[field562] = Statics.field2297.field2783;
                        field722[field562] = field704;
                        field565[field562] = field575;
                        field568[field562] = var5.field448;
                        field569[field562] = var5.field419;
                        field586[field562] = var5.field411;
                        field571[field562] = var5.field416;
                        field562++;
                    }
                }
                if (var5.field423 > field652) {
                    method123(var5, var5.field427 + 15);
                    if (field704 > -1) {
                        int var12 = var5.field424 * 30 / var5.field462;
                        if (var12 > 30) {
                            var12 = 30;
                        }
                        class88.method1842(field704 + arg0 - 15, field575 + arg1 - 3, var12, 5, 65280);
                        class88.method1842(field704 + arg0 - 15 + var12, field575 + arg1 - 3, 30 - var12, 5, 16711680);
                    }
                }
                for (int var13 = 0; var13 < 4; var13++) {
                    if (var5.field422[var13] > field652) {
                        int var14 = var5.field427 / 2;
                        method836(var5.field441, var5.field433, var14);
                        if (field704 > -1) {
                            if (var13 == 1) {
                                field575 -= 20;
                            }
                            if (var13 == 2) {
                                field704 -= 15;
                                field575 -= 10;
                            }
                            if (var13 == 3) {
                                field704 += 15;
                                field575 -= 10;
                            }
                            Statics.field1533[var5.field421[var13]].method1702(field704 + arg0 - 12, field575 + arg1 - 12);
                            Statics.field12.method3445(Integer.toString(var5.field420[var13]), field704 + arg0 - 1, field575 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var15 = 0; var15 < field562; var15++) {
            int var16 = field722[var15];
            int var17 = field565[var15];
            int var18 = field732[var15];
            int var19 = field667[var15];
            boolean var20 = true;
            while (var20) {
                var20 = false;
                for (int var21 = 0; var21 < var15; var21++) {
                    if (var17 + 2 > field565[var21] - field667[var21] && var17 - var19 < field565[var21] + 2 && var16 - var18 < field732[var21] + field722[var21] && var16 + var18 > field722[var21] - field732[var21] && field565[var21] - field667[var21] < var17) {
                        var17 = field565[var21] - field667[var21];
                        var20 = true;
                    }
                }
            }
            field704 = field722[var15];
            field575 = field565[var15] = var17;
            String var22 = field571[var15];
            if (field611 == 0) {
                int var23 = 16776960;
                if (field568[var15] < 6) {
                    var23 = field627[field568[var15]];
                }
                if (field568[var15] == 6) {
                    var23 = field573 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field568[var15] == 7) {
                    var23 = field573 % 20 < 10 ? 255 : 65535;
                }
                if (field568[var15] == 8) {
                    var23 = field573 % 20 < 10 ? 45056 : 8454016;
                }
                if (field568[var15] == 9) {
                    int var24 = 150 - field586[var15];
                    if (var24 < 50) {
                        var23 = var24 * 1280 + 16711680;
                    } else if (var24 < 100) {
                        var23 = 16776960 - (var24 - 50) * 327680;
                    } else if (var24 < 150) {
                        var23 = (var24 - 100) * 5 + 65280;
                    }
                }
                if (field568[var15] == 10) {
                    int var25 = 150 - field586[var15];
                    if (var25 < 50) {
                        var23 = var25 * 5 + 16711680;
                    } else if (var25 < 100) {
                        var23 = 16711935 - (var25 - 50) * 327680;
                    } else if (var25 < 150) {
                        var23 = (var25 - 100) * 327680 + 255 - (var25 - 100) * 5;
                    }
                }
                if (field568[var15] == 11) {
                    int var26 = 150 - field586[var15];
                    if (var26 < 50) {
                        var23 = 16777215 - var26 * 327685;
                    } else if (var26 < 100) {
                        var23 = (var26 - 50) * 327685 + 65280;
                    } else if (var26 < 150) {
                        var23 = 16777215 - (var26 - 100) * 327680;
                    }
                }
                if (field569[var15] == 0) {
                    Statics.field2297.method3445(var22, field704 + arg0, field575 + arg1, var23, 0);
                }
                if (field569[var15] == 1) {
                    Statics.field2297.method3458(var22, field704 + arg0, field575 + arg1, var23, 0, field573);
                }
                if (field569[var15] == 2) {
                    Statics.field2297.method3471(var22, field704 + arg0, field575 + arg1, var23, 0, field573);
                }
                if (field569[var15] == 3) {
                    Statics.field2297.method3468(var22, field704 + arg0, field575 + arg1, var23, 0, field573, 150 - field586[var15]);
                }
                if (field569[var15] == 4) {
                    int var27 = (150 - field586[var15]) * (Statics.field2297.method3497(var22) + 100) / 150;
                    class88.method1793(field704 + arg0 - 50, arg1, field704 + arg0 + 50, arg1 + arg3);
                    Statics.field2297.method3510(var22, field704 + arg0 + 50 - var27, field575 + arg1, var23, 0);
                    class88.method1792(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field569[var15] == 5) {
                    int var28 = 150 - field586[var15];
                    int var29 = 0;
                    if (var28 < 25) {
                        var29 = var28 - 25;
                    } else if (var28 > 125) {
                        var29 = var28 - 125;
                    }
                    class88.method1793(arg0, field575 + arg1 - Statics.field2297.field2783 - 1, arg0 + arg2, field575 + arg1 + 5);
                    Statics.field2297.method3445(var22, field704 + arg0, field575 + arg1 + var29, var23, 0);
                    class88.method1792(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field2297.method3445(var22, field704 + arg0, field575 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("w.ay(B)V")
    public static final void method105() {
        field588 = 0;
        int var0 = (Statics.field2611.field441 >> 7) + Statics.field362;
        int var1 = (Statics.field2611.field433 >> 7) + Statics.field65;
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

    @ObfuscatedName("d.as(Lc;II)V")
    public static final void method123(class26 arg0, int arg1) {
        method836(arg0.field441, arg0.field433, arg1);
    }

    @ObfuscatedName("ag.ar(IIII)V")
    public static final void method836(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field704 = -1;
            field575 = -1;
            return;
        }
        int var3 = method876(arg0, arg1, Statics.field1899) - arg2;
        int var4 = arg0 - Statics.field348;
        int var5 = var3 - Statics.field359;
        int var6 = arg1 - Statics.field269;
        int var7 = class103.field1756[Statics.field2453];
        int var8 = class103.field1757[Statics.field2453];
        int var9 = class103.field1756[Statics.field1019];
        int var10 = class103.field1757[Statics.field1019];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field704 = (var11 << 9) / var15 + 256;
            field575 = (var14 << 9) / var15 + 167;
        } else {
            field704 = -1;
            field575 = -1;
        }
    }

    @ObfuscatedName("am.aj(IIII)I")
    public static final int method876(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field125[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field126[var5][var3][var4] + class9.field126[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field126[var5][var3][var4 + 1] + class9.field126[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("by.av(ZI)V")
    public static final void method1405(boolean arg0) {
        field688 = arg0;
        if (!field688) {
            int var1 = field715.method2487();
            int var2 = field715.method2487();
            int var3 = field715.method2508();
            int var4 = (field497 - field715.field2016) / 16;
            Statics.field268 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field268[var5][var6] = field715.method2593();
                }
            }
            int var7 = field715.method2503();
            int var8 = field715.method2487();
            Statics.field1036 = new int[var4];
            Statics.field4 = new int[var4];
            Statics.field887 = new int[var4];
            Statics.field266 = new byte[var4][];
            Statics.field98 = new byte[var4][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var7 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var7 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var7 - 6) / 8; var12 <= (var7 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1036[var10] = var13;
                        Statics.field4[var10] = Statics.field1964.method3021("m" + var11 + "_" + var12);
                        Statics.field887[var10] = Statics.field1964.method3021("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method887(var2, var7, var3, var1, var8);
            return;
        }
        int var14 = field715.method2485();
        field715.method2361();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field715.method2377(1);
                    if (var18 == 1) {
                        field557[var15][var16][var17] = field715.method2377(26);
                    } else {
                        field557[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field715.method2378();
        int var19 = (field497 - field715.field2016) / 16;
        Statics.field268 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field268[var20][var21] = field715.method2527();
            }
        }
        int var22 = field715.method2530();
        int var23 = field715.method2530();
        int var24 = field715.method2530();
        int var25 = field715.method2503();
        Statics.field1036 = new int[var19];
        Statics.field4 = new int[var19];
        Statics.field887 = new int[var19];
        Statics.field266 = new byte[var19][];
        Statics.field98 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field557[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1036[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1036[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field4[var26] = Statics.field1964.method3021("m" + var35 + "_" + var36);
                            Statics.field887[var26] = Statics.field1964.method3021("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method887(var24, var23, var14, var25, var22);
    }

    @ObfuscatedName("at.az(IIIIIB)V")
    public static final void method887(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1787 == arg0 && Statics.field326 == arg1 && field520 == arg2 || !field471) {
            return;
        }
        Statics.field1787 = arg0;
        Statics.field326 = arg1;
        field520 = arg2;
        if (!field471) {
            field520 = 0;
        }
        method3044(25);
        method897(class133.field2065, true);
        int var5 = Statics.field362;
        int var6 = Statics.field65;
        Statics.field362 = (arg0 - 6) * 8;
        Statics.field65 = (arg1 - 6) * 8;
        int var7 = Statics.field362 - var5;
        int var8 = Statics.field65 - var6;
        int var9 = Statics.field362;
        int var10 = Statics.field65;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field504[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field405[var13] -= var7;
                    var12.field456[var13] -= var8;
                }
                var12.field441 -= var7 * 128;
                var12.field433 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field618[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field405[var16] -= var7;
                    var15.field456[var16] -= var8;
                }
                var15.field441 -= var7 * 128;
                var15.field433 -= var8 * 128;
            }
        }
        Statics.field1899 = arg2;
        Statics.field2611.method226(arg3, arg4, false);
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
        for (class21 var28 = (class21) field604.method3382(); var28 != null; var28 = (class21) field604.method3388()) {
            var28.field344 -= var7;
            var28.field334 -= var8;
            if (var28.field344 < 0 || var28.field334 < 0 || var28.field344 >= 104 || var28.field334 >= 104) {
                var28.method3415();
            }
        }
        if (field700 != 0) {
            field700 -= var7;
            field701 -= var8;
        }
        field718 = 0;
        field510 = false;
        field695 = -1;
        field606.method3376();
        field719.method3376();
    }

    @ObfuscatedName("a.aa(ZB)V")
    public static final void method112(boolean arg0) {
        method790();
        field514++;
        if (field514 < 50 && !arg0) {
            return;
        }
        field514 = 0;
        if (field519 || Statics.field1328 == null) {
            return;
        }
        field634.method2358(178);
        try {
            Statics.field1328.method1371(field634.field2013, 0, field634.field2016);
            field634.field2016 = 0;
        } catch (IOException var2) {
            field519 = true;
        }
    }

    @ObfuscatedName("l.au(I)V")
    public static final void method53() {
        method112(false);
        field478 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field266.length; var1++) {
            if (Statics.field4[var1] != -1 && Statics.field266[var1] == null) {
                Statics.field266[var1] = Statics.field1964.method3012(Statics.field4[var1], 0);
                if (Statics.field266[var1] == null) {
                    var0 = false;
                    field478++;
                }
            }
            if (Statics.field887[var1] != -1 && Statics.field98[var1] == null) {
                Statics.field98[var1] = Statics.field1964.method3072(Statics.field887[var1], 0, Statics.field268[var1]);
                if (Statics.field98[var1] == null) {
                    var0 = false;
                    field478++;
                }
            }
        }
        if (!var0) {
            field632 = 1;
            return;
        }
        field507 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field266.length; var3++) {
            byte[] var4 = Statics.field98[var3];
            if (var4 != null) {
                int var5 = (Statics.field1036[var3] >> 8) * 64 - Statics.field362;
                int var6 = (Statics.field1036[var3] & 0xFF) * 64 - Statics.field65;
                if (field688) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method2708(var4, var5, var6);
            }
        }
        if (!var2) {
            field632 = 2;
            return;
        }
        if (field632 != 0) {
            method897(class133.field2065 + class2.field23 + class2.field21 + 100 + "%" + class2.field22, true);
        }
        method790();
        method3304();
        method790();
        Statics.field1210.method1873();
        method790();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field526[var7].method3282();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field125[var8][var9][var10] = 0;
                }
            }
        }
        method790();
        class9.field119 = 99;
        Statics.field121 = new byte[4][104][104];
        Statics.field117 = new byte[4][104][104];
        Statics.field122 = new byte[4][104][104];
        Statics.field363 = new byte[4][104][104];
        Statics.field962 = new int[4][105][105];
        Statics.field123 = new byte[4][105][105];
        Statics.field124 = new int[105][105];
        Statics.field127 = new int[104];
        Statics.field143 = new int[104];
        Statics.field2504 = new int[104];
        Statics.field1219 = new int[104];
        Statics.field139 = new int[104];
        int var11 = Statics.field266.length;
        for (class7 var12 = (class7) class7.field84.method3382(); var12 != null; var12 = (class7) class7.field84.method3388()) {
            if (var12.field90 != null) {
                Statics.field1291.method1100(var12.field90);
                var12.field90 = null;
            }
            if (var12.field95 != null) {
                Statics.field1291.method1100(var12.field95);
                var12.field95 = null;
            }
        }
        class7.field84.method3376();
        method112(true);
        if (!field688) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field1036[var13] >> 8) * 64 - Statics.field362;
                int var15 = (Statics.field1036[var13] & 0xFF) * 64 - Statics.field65;
                byte[] var16 = Statics.field266[var13];
                if (var16 != null) {
                    method790();
                    int var17 = Statics.field1787 * 8 - 48;
                    int var18 = Statics.field326 * 8 - 48;
                    class162[] var19 = field526;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field2686[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class126 var23 = new class126(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class9.method706(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field1036[var27] >> 8) * 64 - Statics.field362;
                int var29 = (Statics.field1036[var27] & 0xFF) * 64 - Statics.field65;
                byte[] var30 = Statics.field266[var27];
                if (var30 == null && Statics.field326 < 800) {
                    method790();
                    class9.method39(var28, var29, 64, 64);
                }
            }
            method112(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field98[var31];
                if (var32 != null) {
                    int var33 = (Statics.field1036[var31] >> 8) * 64 - Statics.field362;
                    int var34 = (Statics.field1036[var31] & 0xFF) * 64 - Statics.field65;
                    method790();
                    class94 var35 = Statics.field1210;
                    class162[] var36 = field526;
                    class126 var37 = new class126(var32);
                    int var38 = -1;
                    while (true) {
                        int var39 = var37.method2628();
                        if (var39 == 0) {
                            break;
                        }
                        var38 += var39;
                        int var40 = 0;
                        while (true) {
                            int var41 = var37.method2628();
                            if (var41 == 0) {
                                break;
                            }
                            var40 += var41 - 1;
                            int var42 = var40 & 0x3F;
                            int var43 = var40 >> 6 & 0x3F;
                            int var44 = var40 >> 12;
                            int var45 = var37.method2485();
                            int var46 = var45 >> 2;
                            int var47 = var45 & 0x3;
                            int var48 = var33 + var43;
                            int var49 = var34 + var42;
                            if (var48 > 0 && var49 > 0 && var48 < 103 && var49 < 103) {
                                int var50 = var44;
                                if ((class9.field125[1][var48][var49] & 0x2) == 2) {
                                    var50 = var44 - 1;
                                }
                                class162 var51 = null;
                                if (var50 >= 0) {
                                    var51 = var36[var50];
                                }
                                class9.method549(var44, var48, var49, var38, var47, var46, var35, var51);
                            }
                        }
                    }
                }
            }
        }
        if (field688) {
            for (int var52 = 0; var52 < 4; var52++) {
                method790();
                for (int var53 = 0; var53 < 13; var53++) {
                    for (int var54 = 0; var54 < 13; var54++) {
                        boolean var55 = false;
                        int var56 = field557[var52][var53][var54];
                        if (var56 != -1) {
                            int var57 = var56 >> 24 & 0x3;
                            int var58 = var56 >> 1 & 0x3;
                            int var59 = var56 >> 14 & 0x3FF;
                            int var60 = var56 >> 3 & 0x7FF;
                            int var61 = (var59 / 8 << 8) + var60 / 8;
                            for (int var62 = 0; var62 < Statics.field1036.length; var62++) {
                                if (Statics.field1036[var62] == var61 && Statics.field266[var62] != null) {
                                    byte[] var63 = Statics.field266[var62];
                                    int var64 = var53 * 8;
                                    int var65 = var54 * 8;
                                    int var66 = (var59 & 0x7) * 8;
                                    int var67 = (var60 & 0x7) * 8;
                                    class162[] var68 = field526;
                                    for (int var69 = 0; var69 < 8; var69++) {
                                        for (int var70 = 0; var70 < 8; var70++) {
                                            if (var64 + var69 > 0 && var64 + var69 < 103 && var65 + var70 > 0 && var65 + var70 < 103) {
                                                var68[var52].field2686[var64 + var69][var65 + var70] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class126 var71 = new class126(var63);
                                    for (int var72 = 0; var72 < 4; var72++) {
                                        for (int var73 = 0; var73 < 64; var73++) {
                                            for (int var74 = 0; var74 < 64; var74++) {
                                                if (var57 == var72 && var73 >= var66 && var73 < var66 + 8 && var74 >= var67 && var74 < var67 + 8) {
                                                    class9.method706(var71, var52, var64 + class158.method1176(var73 & 0x7, var74 & 0x7, var58), var65 + class158.method1223(var73 & 0x7, var74 & 0x7, var58), 0, 0, var58);
                                                } else {
                                                    class9.method706(var71, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var55 = true;
                                    break;
                                }
                            }
                        }
                        if (!var55) {
                            class9.method214(var52, var53 * 8, var54 * 8);
                        }
                    }
                }
            }
            for (int var75 = 0; var75 < 13; var75++) {
                for (int var76 = 0; var76 < 13; var76++) {
                    int var77 = field557[0][var75][var76];
                    if (var77 == -1) {
                        class9.method39(var75 * 8, var76 * 8, 8, 8);
                    }
                }
            }
            method112(true);
            for (int var78 = 0; var78 < 4; var78++) {
                method790();
                for (int var79 = 0; var79 < 13; var79++) {
                    label951: for (int var80 = 0; var80 < 13; var80++) {
                        int var81 = field557[var78][var79][var80];
                        if (var81 != -1) {
                            int var82 = var81 >> 24 & 0x3;
                            int var83 = var81 >> 1 & 0x3;
                            int var84 = var81 >> 14 & 0x3FF;
                            int var85 = var81 >> 3 & 0x7FF;
                            int var86 = (var84 / 8 << 8) + var85 / 8;
                            for (int var87 = 0; var87 < Statics.field1036.length; var87++) {
                                if (Statics.field1036[var87] == var86 && Statics.field98[var87] != null) {
                                    byte[] var88 = Statics.field98[var87];
                                    int var89 = var79 * 8;
                                    int var90 = var80 * 8;
                                    int var91 = (var84 & 0x7) * 8;
                                    int var92 = (var85 & 0x7) * 8;
                                    class94 var93 = Statics.field1210;
                                    class162[] var94 = field526;
                                    class126 var95 = new class126(var88);
                                    int var96 = -1;
                                    while (true) {
                                        int var97 = var95.method2628();
                                        if (var97 == 0) {
                                            continue label951;
                                        }
                                        var96 += var97;
                                        int var98 = 0;
                                        while (true) {
                                            int var99 = var95.method2628();
                                            if (var99 == 0) {
                                                break;
                                            }
                                            var98 += var99 - 1;
                                            int var100 = var98 & 0x3F;
                                            int var101 = var98 >> 6 & 0x3F;
                                            int var102 = var98 >> 12;
                                            int var103 = var95.method2485();
                                            int var104 = var103 >> 2;
                                            int var105 = var103 & 0x3;
                                            if (var82 == var102 && var101 >= var91 && var101 < var91 + 8 && var100 >= var92 && var100 < var92 + 8) {
                                                class31 var106 = class31.method245(var96);
                                                int var107 = var89 + class158.method2245(var101 & 0x7, var100 & 0x7, var83, var106.field812, var106.field813, var105);
                                                int var108 = var90 + class158.method2890(var101 & 0x7, var100 & 0x7, var83, var106.field812, var106.field813, var105);
                                                if (var107 > 0 && var108 > 0 && var107 < 103 && var108 < 103) {
                                                    int var109 = var78;
                                                    if ((class9.field125[1][var107][var108] & 0x2) == 2) {
                                                        var109 = var78 - 1;
                                                    }
                                                    class162 var110 = null;
                                                    if (var109 >= 0) {
                                                        var110 = var94[var109];
                                                    }
                                                    class9.method549(var78, var107, var108, var96, var83 + var105 & 0x3, var104, var93, var110);
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
        method112(true);
        method3304();
        method790();
        class94 var111 = Statics.field1210;
        class162[] var112 = field526;
        for (int var113 = 0; var113 < 4; var113++) {
            for (int var114 = 0; var114 < 104; var114++) {
                for (int var115 = 0; var115 < 104; var115++) {
                    if ((class9.field125[var113][var114][var115] & 0x1) == 1) {
                        int var116 = var113;
                        if ((class9.field125[1][var114][var115] & 0x2) == 2) {
                            var116 = var113 - 1;
                        }
                        if (var116 >= 0) {
                            var112[var116].method3261(var114, var115);
                        }
                    }
                }
            }
        }
        class9.field135 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field135 < -8) {
            class9.field135 = -8;
        }
        if (class9.field135 > 8) {
            class9.field135 = 8;
        }
        class9.field136 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field136 < -16) {
            class9.field136 = -16;
        }
        if (class9.field136 > 16) {
            class9.field136 = 16;
        }
        for (int var117 = 0; var117 < 4; var117++) {
            byte[][] var118 = Statics.field123[var117];
            int var119 = (int) Math.sqrt(5100.0D);
            int var120 = var119 * 768 >> 8;
            for (int var121 = 1; var121 < 103; var121++) {
                for (int var122 = 1; var122 < 103; var122++) {
                    int var123 = class9.field126[var117][var122 + 1][var121] - class9.field126[var117][var122 - 1][var121];
                    int var124 = class9.field126[var117][var122][var121 + 1] - class9.field126[var117][var122][var121 - 1];
                    int var125 = (int) Math.sqrt((double) (var124 * var124 + var123 * var123 + 65536));
                    int var126 = (var123 << 8) / var125;
                    int var127 = 65536 / var125;
                    int var128 = (var124 << 8) / var125;
                    int var129 = (var128 * -50 + var126 * -50 + var127 * -10) / var120 + 96;
                    int var130 = (var118[var122][var121] >> 1) + (var118[var122][var121 + 1] >> 3) + (var118[var122][var121 - 1] >> 2) + (var118[var122 - 1][var121] >> 2) + (var118[var122 + 1][var121] >> 3);
                    Statics.field124[var122][var121] = var129 - var130;
                }
            }
            for (int var131 = 0; var131 < 104; var131++) {
                Statics.field127[var131] = 0;
                Statics.field143[var131] = 0;
                Statics.field2504[var131] = 0;
                Statics.field1219[var131] = 0;
                Statics.field139[var131] = 0;
            }
            for (int var132 = -5; var132 < 109; var132++) {
                for (int var133 = 0; var133 < 104; var133++) {
                    int var134 = var132 + 5;
                    int var10002;
                    if (var134 >= 0 && var134 < 104) {
                        int var135 = Statics.field121[var117][var134][var133] & 0xFF;
                        if (var135 > 0) {
                            int var136 = var135 - 1;
                            class32 var137 = (class32) class32.field848.method3311((long) var136);
                            class32 var138;
                            if (var137 == null) {
                                byte[] var139 = Statics.field851.method3012(1, var136);
                                class32 var140 = new class32();
                                if (var139 != null) {
                                    var140.method689(new class126(var139), var136);
                                }
                                var140.method686();
                                class32.field848.method3314(var140, (long) var136);
                                var138 = var140;
                            } else {
                                var138 = var137;
                            }
                            Statics.field127[var133] += var138.field850;
                            Statics.field143[var133] += var138.field854;
                            Statics.field2504[var133] += var138.field852;
                            Statics.field1219[var133] += var138.field853;
                            var10002 = Statics.field139[var133]++;
                        }
                    }
                    int var142 = var132 - 5;
                    if (var142 >= 0 && var142 < 104) {
                        int var143 = Statics.field121[var117][var142][var133] & 0xFF;
                        if (var143 > 0) {
                            int var144 = var143 - 1;
                            class32 var145 = (class32) class32.field848.method3311((long) var144);
                            class32 var146;
                            if (var145 == null) {
                                byte[] var147 = Statics.field851.method3012(1, var144);
                                class32 var148 = new class32();
                                if (var147 != null) {
                                    var148.method689(new class126(var147), var144);
                                }
                                var148.method686();
                                class32.field848.method3314(var148, (long) var144);
                                var146 = var148;
                            } else {
                                var146 = var145;
                            }
                            Statics.field127[var133] -= var146.field850;
                            Statics.field143[var133] -= var146.field854;
                            Statics.field2504[var133] -= var146.field852;
                            Statics.field1219[var133] -= var146.field853;
                            var10002 = Statics.field139[var133]--;
                        }
                    }
                }
                if (var132 >= 1 && var132 < 103) {
                    int var150 = 0;
                    int var151 = 0;
                    int var152 = 0;
                    int var153 = 0;
                    int var154 = 0;
                    for (int var155 = -5; var155 < 109; var155++) {
                        int var156 = var155 + 5;
                        if (var156 >= 0 && var156 < 104) {
                            var150 += Statics.field127[var156];
                            var151 += Statics.field143[var156];
                            var152 += Statics.field2504[var156];
                            var153 += Statics.field1219[var156];
                            var154 += Statics.field139[var156];
                        }
                        int var157 = var155 - 5;
                        if (var157 >= 0 && var157 < 104) {
                            var150 -= Statics.field127[var157];
                            var151 -= Statics.field143[var157];
                            var152 -= Statics.field2504[var157];
                            var153 -= Statics.field1219[var157];
                            var154 -= Statics.field139[var157];
                        }
                        if (var155 >= 1 && var155 < 103 && (!field471 || (class9.field125[0][var132][var155] & 0x2) != 0 || (class9.field125[var117][var132][var155] & 0x10) == 0 && class9.method2252(var117, var132, var155) == field520)) {
                            if (var117 < class9.field119) {
                                class9.field119 = var117;
                            }
                            int var158 = Statics.field121[var117][var132][var155] & 0xFF;
                            int var159 = Statics.field117[var117][var132][var155] & 0xFF;
                            if (var158 > 0 || var159 > 0) {
                                int var160 = class9.field126[var117][var132][var155];
                                int var161 = class9.field126[var117][var132 + 1][var155];
                                int var162 = class9.field126[var117][var132 + 1][var155 + 1];
                                int var163 = class9.field126[var117][var132][var155 + 1];
                                int var164 = Statics.field124[var132][var155];
                                int var165 = Statics.field124[var132 + 1][var155];
                                int var166 = Statics.field124[var132 + 1][var155 + 1];
                                int var167 = Statics.field124[var132][var155 + 1];
                                int var168 = -1;
                                int var169 = -1;
                                if (var158 > 0) {
                                    int var170 = var150 * 256 / var153;
                                    int var171 = var151 / var154;
                                    int var172 = var152 / var154;
                                    var168 = class9.method1341(var170, var171, var172);
                                    int var173 = class9.field135 + var170 & 0xFF;
                                    int var174 = class9.field136 + var172;
                                    if (var174 < 0) {
                                        var174 = 0;
                                    } else if (var174 > 255) {
                                        var174 = 255;
                                    }
                                    var169 = class9.method1341(var173, var171, var174);
                                }
                                if (var117 > 0) {
                                    boolean var175 = true;
                                    if (var158 == 0 && Statics.field122[var117][var132][var155] != 0) {
                                        var175 = false;
                                    }
                                    if (var159 > 0 && !class36.method1397(var159 - 1).field938) {
                                        var175 = false;
                                    }
                                    if (var175 && var160 == var161 && var160 == var162 && var160 == var163) {
                                        Statics.field962[var117][var132][var155] |= 0x924;
                                    }
                                }
                                int var176 = 0;
                                if (var169 != -1) {
                                    var176 = class103.field1735[class9.method40(var169, 96)];
                                }
                                if (var159 == 0) {
                                    var111.method1878(var117, var132, var155, 0, 0, -1, var160, var161, var162, var163, class9.method40(var168, var164), class9.method40(var168, var165), class9.method40(var168, var166), class9.method40(var168, var167), 0, 0, 0, 0, var176, 0);
                                } else {
                                    int var177 = Statics.field122[var117][var132][var155] + 1;
                                    byte var178 = Statics.field363[var117][var132][var155];
                                    class36 var179 = class36.method1397(var159 - 1);
                                    int var180 = var179.field924;
                                    int var181;
                                    int var182;
                                    if (var180 >= 0) {
                                        var181 = Statics.field1753.method2231(var180);
                                        var182 = -1;
                                    } else if (var179.field923 == 16711935) {
                                        var182 = -2;
                                        var180 = -1;
                                        var181 = -2;
                                    } else {
                                        var182 = class9.method1341(var179.field922, var179.field927, var179.field929);
                                        int var183 = class9.field135 + var179.field922 & 0xFF;
                                        int var184 = class9.field136 + var179.field929;
                                        if (var184 < 0) {
                                            var184 = 0;
                                        } else if (var184 > 255) {
                                            var184 = 255;
                                        }
                                        var181 = class9.method1341(var183, var179.field927, var184);
                                    }
                                    int var185 = 0;
                                    if (var181 != -2) {
                                        var185 = class103.field1735[class9.method835(var181, 96)];
                                    }
                                    if (var179.field926 != -1) {
                                        int var186 = class9.field135 + var179.field930 & 0xFF;
                                        int var187 = class9.field136 + var179.field932;
                                        if (var187 < 0) {
                                            var187 = 0;
                                        } else if (var187 > 255) {
                                            var187 = 255;
                                        }
                                        int var188 = class9.method1341(var186, var179.field931, var187);
                                        var185 = class103.field1735[class9.method835(var188, 96)];
                                    }
                                    var111.method1878(var117, var132, var155, var177, var178, var180, var160, var161, var162, var163, class9.method40(var168, var164), class9.method40(var168, var165), class9.method40(var168, var166), class9.method40(var168, var167), class9.method835(var182, var164), class9.method835(var182, var165), class9.method835(var182, var166), class9.method835(var182, var167), var176, var185);
                                }
                            }
                        }
                    }
                }
            }
            for (int var189 = 1; var189 < 103; var189++) {
                for (int var190 = 1; var190 < 103; var190++) {
                    var111.method1877(var117, var190, var189, class9.method2252(var117, var190, var189));
                }
            }
            Statics.field121[var117] = (byte[][]) null;
            Statics.field117[var117] = (byte[][]) null;
            Statics.field122[var117] = (byte[][]) null;
            Statics.field363[var117] = (byte[][]) null;
            Statics.field123[var117] = (byte[][]) null;
        }
        var111.method1904(-50, -10, -50);
        for (int var191 = 0; var191 < 104; var191++) {
            for (int var192 = 0; var192 < 104; var192++) {
                if ((class9.field125[1][var191][var192] & 0x2) == 2) {
                    var111.method1988(var191, var192);
                }
            }
        }
        int var193 = 1;
        int var194 = 2;
        int var195 = 4;
        for (int var196 = 0; var196 < 4; var196++) {
            if (var196 > 0) {
                var193 <<= 0x3;
                var194 <<= 0x3;
                var195 <<= 0x3;
            }
            for (int var197 = 0; var197 <= var196; var197++) {
                for (int var198 = 0; var198 <= 104; var198++) {
                    for (int var199 = 0; var199 <= 104; var199++) {
                        if ((Statics.field962[var197][var199][var198] & var193) != 0) {
                            int var200 = var198;
                            int var201 = var198;
                            int var202 = var197;
                            int var203 = var197;
                            while (var200 > 0 && (Statics.field962[var197][var199][var200 - 1] & var193) != 0) {
                                var200--;
                            }
                            while (var201 < 104 && (Statics.field962[var197][var199][var201 + 1] & var193) != 0) {
                                var201++;
                            }
                            label684: while (var202 > 0) {
                                for (int var204 = var200; var204 <= var201; var204++) {
                                    if ((Statics.field962[var202 - 1][var199][var204] & var193) == 0) {
                                        break label684;
                                    }
                                }
                                var202--;
                            }
                            label673: while (var203 < var196) {
                                for (int var205 = var200; var205 <= var201; var205++) {
                                    if ((Statics.field962[var203 + 1][var199][var205] & var193) == 0) {
                                        break label673;
                                    }
                                }
                                var203++;
                            }
                            int var206 = (var203 + 1 - var202) * (var201 - var200 + 1);
                            if (var206 >= 8) {
                                short var207 = 240;
                                int var208 = class9.field126[var203][var199][var200] - var207;
                                int var209 = class9.field126[var202][var199][var200];
                                class94.method1876(var196, 1, var199 * 128, var199 * 128, var200 * 128, var201 * 128 + 128, var208, var209);
                                for (int var210 = var202; var210 <= var203; var210++) {
                                    for (int var211 = var200; var211 <= var201; var211++) {
                                        Statics.field962[var210][var199][var211] &= ~var193;
                                    }
                                }
                            }
                        }
                        if ((Statics.field962[var197][var199][var198] & var194) != 0) {
                            int var212 = var199;
                            int var213 = var199;
                            int var214 = var197;
                            int var215 = var197;
                            while (var212 > 0 && (Statics.field962[var197][var212 - 1][var198] & var194) != 0) {
                                var212--;
                            }
                            while (var213 < 104 && (Statics.field962[var197][var213 + 1][var198] & var194) != 0) {
                                var213++;
                            }
                            label737: while (var214 > 0) {
                                for (int var216 = var212; var216 <= var213; var216++) {
                                    if ((Statics.field962[var214 - 1][var216][var198] & var194) == 0) {
                                        break label737;
                                    }
                                }
                                var214--;
                            }
                            label726: while (var215 < var196) {
                                for (int var217 = var212; var217 <= var213; var217++) {
                                    if ((Statics.field962[var215 + 1][var217][var198] & var194) == 0) {
                                        break label726;
                                    }
                                }
                                var215++;
                            }
                            int var218 = (var215 + 1 - var214) * (var213 - var212 + 1);
                            if (var218 >= 8) {
                                short var219 = 240;
                                int var220 = class9.field126[var215][var212][var198] - var219;
                                int var221 = class9.field126[var214][var212][var198];
                                class94.method1876(var196, 2, var212 * 128, var213 * 128 + 128, var198 * 128, var198 * 128, var220, var221);
                                for (int var222 = var214; var222 <= var215; var222++) {
                                    for (int var223 = var212; var223 <= var213; var223++) {
                                        Statics.field962[var222][var223][var198] &= ~var194;
                                    }
                                }
                            }
                        }
                        if ((Statics.field962[var197][var199][var198] & var195) != 0) {
                            int var224 = var199;
                            int var225 = var199;
                            int var226 = var198;
                            int var227 = var198;
                            while (var226 > 0 && (Statics.field962[var197][var199][var226 - 1] & var195) != 0) {
                                var226--;
                            }
                            while (var227 < 104 && (Statics.field962[var197][var199][var227 + 1] & var195) != 0) {
                                var227++;
                            }
                            label790: while (var224 > 0) {
                                for (int var228 = var226; var228 <= var227; var228++) {
                                    if ((Statics.field962[var197][var224 - 1][var228] & var195) == 0) {
                                        break label790;
                                    }
                                }
                                var224--;
                            }
                            label779: while (var225 < 104) {
                                for (int var229 = var226; var229 <= var227; var229++) {
                                    if ((Statics.field962[var197][var225 + 1][var229] & var195) == 0) {
                                        break label779;
                                    }
                                }
                                var225++;
                            }
                            if ((var225 - var224 + 1) * (var227 - var226 + 1) >= 4) {
                                int var230 = class9.field126[var197][var224][var226];
                                class94.method1876(var196, 4, var224 * 128, var225 * 128 + 128, var226 * 128, var227 * 128 + 128, var230, var230);
                                for (int var231 = var224; var231 <= var225; var231++) {
                                    for (int var232 = var226; var232 <= var227; var232++) {
                                        Statics.field962[var197][var231][var232] &= ~var195;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method112(true);
        int var233 = class9.field119;
        if (var233 > Statics.field1899) {
            var233 = Statics.field1899;
        }
        if (var233 < Statics.field1899 - 1) {
            int var234 = Statics.field1899 - 1;
        }
        if (field471) {
            Statics.field1210.method1874(class9.field119);
        } else {
            Statics.field1210.method1874(0);
        }
        for (int var235 = 0; var235 < 104; var235++) {
            for (int var236 = 0; var236 < 104; var236++) {
                method1542(var235, var236);
            }
        }
        method790();
        for (class21 var237 = (class21) field604.method3382(); var237 != null; var237 = (class21) field604.method3388()) {
            if (var237.field342 == -1) {
                var237.field341 = 0;
                method2711(var237);
            } else {
                var237.method3415();
            }
        }
        class31.field800.method3315();
        if (Statics.field942 != null) {
            field634.method2358(115);
            field634.method2475(1057001181);
        }
        if (!field688) {
            int var238 = (Statics.field1787 - 6) / 8;
            int var239 = (Statics.field1787 + 6) / 8;
            int var240 = (Statics.field326 - 6) / 8;
            int var241 = (Statics.field326 + 6) / 8;
            for (int var242 = var238 - 1; var242 <= var239 + 1; var242++) {
                for (int var243 = var240 - 1; var243 <= var241 + 1; var243++) {
                    if (var242 < var238 || var242 > var239 || var243 < var240 || var243 > var241) {
                        Statics.field1964.method3030("m" + var242 + "_" + var243);
                        Statics.field1964.method3030("l" + var242 + "_" + var243);
                    }
                }
            }
        }
        method3044(30);
        method790();
        Statics.field121 = (byte[][][]) null;
        Statics.field117 = (byte[][][]) null;
        Statics.field122 = (byte[][][]) null;
        Statics.field363 = (byte[][][]) null;
        Statics.field962 = (int[][][]) null;
        Statics.field123 = (byte[][][]) null;
        Statics.field124 = (int[][]) null;
        Statics.field127 = null;
        Statics.field143 = null;
        Statics.field2504 = null;
        Statics.field1219 = null;
        Statics.field139 = null;
        field634.method2358(105);
        class72.method714();
    }

    @ObfuscatedName("ea.ac(IIIIII)V")
    public static final void method2719(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1210.method1899(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1210.method1966(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1441.field1454;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method245(var12);
            if (var13.field826 == -1) {
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
                class86 var14 = Statics.field249[var13.field826];
                if (var14 != null) {
                    int var15 = (var13.field812 * 4 - var14.field1468) / 2;
                    int var16 = (var13.field813 * 4 - var14.field1469) / 2;
                    var14.method1782(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field813) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1210.method1901(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1210.method1966(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method245(var21);
            if (var22.field826 != -1) {
                class86 var23 = Statics.field249[var22.field826];
                if (var23 != null) {
                    int var24 = (var22.field812 * 4 - var23.field1468) / 2;
                    int var25 = (var22.field813 * 4 - var23.field1469) / 2;
                    var23.method1782(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field813) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1441.field1454;
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
        int var29 = Statics.field1210.method1902(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method245(var30);
        if (var31.field826 == -1) {
            return;
        }
        class86 var32 = Statics.field249[var31.field826];
        if (var32 != null) {
            int var33 = (var31.field812 * 4 - var32.field1468) / 2;
            int var34 = (var31.field813 * 4 - var32.field1469) / 2;
            var32.method1782(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field813) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("w.ap(IIII)Z")
    public static final boolean method104(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1210.method1966(Statics.field1899, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method245(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field812;
                var9 = var7.field813;
            } else {
                var8 = var7.field813;
                var9 = var7.field812;
            }
            int var10 = var7.field835;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field576 = class76.field1378;
        field577 = class76.field1381;
        field579 = 2;
        field578 = 0;
        return true;
    }

    @ObfuscatedName("bv.ab(IIIIZIIIIIIB)Z")
    public static final boolean method1339(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field531[var11][var12] = 0;
                field532[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field531[arg0][arg1] = 99;
        field532[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field533[var15] = arg0;
        int var36 = var15 + 1;
        field699[var15] = arg1;
        boolean var17 = false;
        int var18 = field533.length;
        int[][] var19 = field526[Statics.field1899].field2686;
        while (var36 != var16) {
            var13 = field533[var16];
            var14 = field699[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field526[Statics.field1899].method3270(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field526[Statics.field1899].method3269(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field526[Statics.field1899].method3268(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field532[var13][var14] + 1;
            if (var13 > 0 && field531[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field533[var36] = var13 - 1;
                field699[var36] = var14;
                var36 = (var36 + 1) % var18;
                field531[var13 - 1][var14] = 2;
                field532[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field531[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field533[var36] = var13 + 1;
                field699[var36] = var14;
                var36 = (var36 + 1) % var18;
                field531[var13 + 1][var14] = 8;
                field532[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field531[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field533[var36] = var13;
                field699[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field531[var13][var14 - 1] = 1;
                field532[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field531[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field533[var36] = var13;
                field699[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field531[var13][var14 + 1] = 4;
                field532[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field531[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field533[var36] = var13 - 1;
                field699[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field531[var13 - 1][var14 - 1] = 3;
                field532[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field531[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field533[var36] = var13 + 1;
                field699[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field531[var13 + 1][var14 - 1] = 9;
                field532[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field531[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field533[var36] = var13 - 1;
                field699[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field531[var13 - 1][var14 + 1] = 6;
                field532[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field531[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field533[var36] = var13 + 1;
                field699[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field531[var13 + 1][var14 + 1] = 12;
                field532[var13 + 1][var14 + 1] = var20;
            }
        }
        field567 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field532[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field532[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field532[var24][var25];
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
            field567 = 1;
        }
        byte var29 = 0;
        field533[var29] = var13;
        int var37 = var29 + 1;
        field699[var29] = var14;
        int var30;
        int var31 = var30 = field531[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field533[var37] = var13;
                field699[var37++] = var14;
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
            var31 = field531[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field533[var37];
            int var34 = field699[var37];
            if (arg10 == 0) {
                field634.method2358(104);
                field634.method2472(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field634.method2358(188);
                field634.method2472(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field634.method2358(56);
                field634.method2472(var32 + var32 + 3);
            }
            field700 = field533[0];
            field701 = field699[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field634.method2472(field533[var37] - var33);
                field634.method2506(field699[var37] - var34);
            }
            field634.method2473(Statics.field362 + var33);
            field634.method2507(class74.field1352[82] ? 1 : 0);
            field634.method2591(Statics.field65 + var34);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("p.bu(S)Z")
    public static final boolean method59() {
        if (Statics.field1328 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1328.method1369();
            if (var0 == 0) {
                return false;
            }
            if (field529 == -1) {
                Statics.field1328.method1370(field715.field2013, 0, 1);
                field715.field2016 = 0;
                field529 = field715.method2360();
                field497 = class163.field2698[field529];
                var0--;
            }
            if (field497 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1328.method1370(field715.field2013, 0, 1);
                field497 = field715.field2013[0] & 0xFF;
                var0--;
            }
            if (field497 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1328.method1370(field715.field2013, 0, 2);
                field715.field2016 = 0;
                field497 = field715.method2487();
                var0 -= 2;
            }
            if (var0 < field497) {
                return false;
            }
            field715.field2016 = 0;
            Statics.field1328.method1370(field715.field2013, 0, field497);
            field697 = 0;
            field674 = field517;
            field517 = field516;
            field516 = field529;
            if (field529 == 58) {
                Statics.field379 = field715.method2508();
                Statics.field53 = field715.method2508();
                while (field715.field2016 < field497) {
                    field529 = field715.method2485();
                    method2727();
                }
                field529 = -1;
                return true;
            }
            if (field529 == 172) {
                field628 = field715.method2485();
                field529 = -1;
                return true;
            }
            if (field529 == 190) {
                while (field715.field2016 < field497) {
                    int var1 = field715.method2485();
                    boolean var2 = (var1 & 0x1) == 1;
                    String var3 = field715.method2470();
                    String var4 = field715.method2470();
                    field715.method2470();
                    for (int var5 = 0; var5 < field724; var5++) {
                        class11 var6 = field725[var5];
                        if (var2) {
                            if (var4.equals(var6.field175)) {
                                var6.field175 = var3;
                                var6.field174 = var4;
                                var3 = null;
                                break;
                            }
                        } else if (var3.equals(var6.field175)) {
                            var6.field175 = var3;
                            var6.field174 = var4;
                            var3 = null;
                            break;
                        }
                    }
                    if (var3 != null && field724 < 100) {
                        class11 var7 = new class11();
                        field725[field724] = var7;
                        var7.field175 = var3;
                        var7.field174 = var4;
                        field724++;
                    }
                }
                field660 = field708;
                field529 = -1;
                return true;
            }
            if (field529 == 147) {
                field510 = false;
                for (int var8 = 0; var8 < 5; var8++) {
                    field572[var8] = false;
                }
                field529 = -1;
                return true;
            }
            if (field529 == 235) {
                while (field715.field2016 < field497) {
                    boolean var9 = field715.method2485() == 1;
                    String var10 = field715.method2470();
                    String var11 = field715.method2470();
                    int var12 = field715.method2487();
                    int var13 = field715.method2485();
                    int var14 = field715.method2485();
                    boolean var15 = (var14 & 0x2) != 0;
                    boolean var16 = (var14 & 0x1) != 0;
                    if (var12 > 0) {
                        field715.method2470();
                        field715.method2485();
                        field715.method2593();
                    }
                    field715.method2470();
                    for (int var17 = 0; var17 < field720; var17++) {
                        class22 var18 = field523[var17];
                        if (var9) {
                            if (var11.equals(var18.field358)) {
                                var18.field358 = var10;
                                var18.field352 = var11;
                                var10 = null;
                                break;
                            }
                        } else if (var10.equals(var18.field358)) {
                            if (var18.field357 != var12) {
                                boolean var19 = true;
                                for (class27 var20 = (class27) field564.method3344(); var20 != null; var20 = (class27) field564.method3341()) {
                                    if (var20.field736.equals(var10)) {
                                        if (var12 != 0 && var20.field737 == 0) {
                                            var20.method3410();
                                            var19 = false;
                                        } else if (var12 == 0 && var20.field737 != 0) {
                                            var20.method3410();
                                            var19 = false;
                                        }
                                    }
                                }
                                if (var19) {
                                    field564.method3342(new class27(var10, var12));
                                }
                                var18.field357 = var12;
                            }
                            var18.field352 = var11;
                            var18.field354 = var13;
                            var18.field355 = var15;
                            var18.field356 = var16;
                            var10 = null;
                            break;
                        }
                    }
                    if (var10 != null && field720 < 200) {
                        class22 var21 = new class22();
                        field523[field720] = var21;
                        var21.field358 = var10;
                        var21.field352 = var11;
                        var21.field357 = var12;
                        var21.field354 = var13;
                        var21.field355 = var15;
                        var21.field356 = var16;
                        field720++;
                    }
                }
                field468 = 2;
                field660 = field708;
                boolean var22 = false;
                int var23 = field720;
                while (var23 > 0) {
                    boolean var24 = true;
                    var23--;
                    for (int var25 = 0; var25 < var23; var25++) {
                        boolean var26 = false;
                        class22 var27 = field523[var25];
                        class22 var28 = field523[var25 + 1];
                        if (field466 != var27.field357 && field466 == var28.field357) {
                            var26 = true;
                        }
                        if (!var26 && var27.field357 == 0 && var28.field357 != 0) {
                            var26 = true;
                        }
                        if (!var26 && !var27.field355 && var28.field355) {
                            var26 = true;
                        }
                        if (!var26 && !var27.field356 && var28.field356) {
                            var26 = true;
                        }
                        if (var26) {
                            class22 var29 = field523[var25];
                            field523[var25] = field523[var25 + 1];
                            field523[var25 + 1] = var29;
                            var24 = false;
                        }
                    }
                    if (var24) {
                        break;
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 144) {
                method1405(false);
                field529 = -1;
                return true;
            }
            if (field529 == 242 || field529 == 79 || field529 == 60 || field529 == 117 || field529 == 149 || field529 == 213 || field529 == 148 || field529 == 63 || field529 == 48 || field529 == 226 || field529 == 129) {
                method2727();
                field529 = -1;
                return true;
            }
            if (field529 == 215) {
                Statics.field379 = field715.method2508();
                Statics.field53 = field715.method2510();
                for (int var30 = Statics.field53; var30 < Statics.field53 + 8; var30++) {
                    for (int var31 = Statics.field379; var31 < Statics.field379 + 8; var31++) {
                        if (field603[Statics.field1899][var30][var31] != null) {
                            field603[Statics.field1899][var30][var31] = null;
                            method1542(var30, var31);
                        }
                    }
                }
                for (class21 var32 = (class21) field604.method3382(); var32 != null; var32 = (class21) field604.method3388()) {
                    if (var32.field344 >= Statics.field53 && var32.field344 < Statics.field53 + 8 && var32.field334 >= Statics.field379 && var32.field334 < Statics.field379 + 8 && Statics.field1899 == var32.field338) {
                        var32.field342 = 0;
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 168) {
                field584 = field715.method2530() * 30;
                field662 = field708;
                field529 = -1;
                return true;
            }
            if (field529 == 177) {
                int var33 = field715.method2593();
                Statics.field937 = Statics.field1791.method1486(var33);
                field529 = -1;
                return true;
            }
            if (field529 == 38) {
                int var34 = field715.method2485();
                class136[] var35 = class136.method2989();
                int var36 = 0;
                class136 var38;
                while (true) {
                    if (var36 >= var35.length) {
                        var38 = null;
                        break;
                    }
                    class136 var37 = var35[var36];
                    if (var37.field2307 == var34) {
                        var38 = var37;
                        break;
                    }
                    var36++;
                }
                Statics.field394 = var38;
                field529 = -1;
                return true;
            }
            if (field529 == 41) {
                int var39 = field715.method2593();
                class4 var40 = (class4) field630.method3354((long) var39);
                if (var40 != null) {
                    method4(var40, true);
                }
                if (field633 != null) {
                    method2745(field633);
                    field633 = null;
                }
                field529 = -1;
                return true;
            }
            if (field529 == 169) {
                field686 = field715.method2485();
                field687 = field715.method2485();
                field529 = -1;
                return true;
            }
            if (field529 == 77) {
                int var41 = field715.method2525();
                int var42 = field715.method2503();
                class156 var43 = class156.method2382(var41);
                if (var43.field2563 != 1 || var43.field2605 != var42) {
                    var43.field2563 = 1;
                    var43.field2605 = var42;
                    method2745(var43);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 105) {
                int var44 = field715.method2485();
                int var45 = field715.method2503();
                int var46 = field715.method2527();
                class4 var47 = (class4) field630.method3354((long) var46);
                if (var47 != null) {
                    method4(var47, var47.field54 != var45);
                }
                method1684(var46, var45, var44);
                field529 = -1;
                return true;
            }
            if (field529 == 178) {
                int var48 = field715.method2593();
                class156 var49 = class156.method2382(var48);
                var49.field2563 = 3;
                var49.field2605 = Statics.field2611.field28.method3237();
                method2745(var49);
                field529 = -1;
                return true;
            }
            if (field529 == 245) {
                for (int var50 = 0; var50 < class157.field2656.length; var50++) {
                    if (class157.field2656[var50] != class157.field2650[var50]) {
                        class157.field2656[var50] = class157.field2650[var50];
                        method2769(var50);
                        field653[++field654 - 1 & 0x1F] = var50;
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 238) {
                int var51 = field715.method2593();
                int var52 = field715.method2487();
                if (var51 < -70000) {
                    var52 += 32768;
                }
                class156 var53;
                if (var51 >= 0) {
                    var53 = class156.method2382(var51);
                } else {
                    var53 = null;
                }
                if (var53 != null) {
                    for (int var54 = 0; var54 < var53.field2561.length; var54++) {
                        var53.field2561[var54] = 0;
                        var53.field2602[var54] = 0;
                    }
                }
                class18.method2348(var52);
                int var55 = field715.method2487();
                for (int var56 = 0; var56 < var55; var56++) {
                    int var57 = field715.method2487();
                    int var58 = field715.method2508();
                    if (var58 == 255) {
                        var58 = field715.method2527();
                    }
                    if (var53 != null && var56 < var53.field2561.length) {
                        var53.field2561[var56] = var57;
                        var53.field2602[var56] = var58;
                    }
                    class18.method36(var52, var56, var57 - 1, var58);
                }
                if (var53 != null) {
                    method2745(var53);
                }
                method10();
                field589[++field600 - 1 & 0x1F] = var52 & 0x7FFF;
                field529 = -1;
                return true;
            }
            if (field529 == 64) {
                field510 = true;
                Statics.field180 = field715.method2485();
                Statics.field102 = field715.method2485();
                Statics.field330 = field715.method2487();
                Statics.field1985 = field715.method2485();
                Statics.field361 = field715.method2485();
                if (Statics.field361 >= 100) {
                    Statics.field348 = Statics.field180 * 128 + 64;
                    Statics.field269 = Statics.field102 * 128 + 64;
                    Statics.field359 = method876(Statics.field348, Statics.field269, Statics.field1899) - Statics.field330;
                }
                field529 = -1;
                return true;
            }
            if (field529 == 219) {
                int var59 = field715.method2530();
                int var60 = field715.method2593();
                class156 var61 = class156.method2382(var60);
                if (var61 != null && var61.field2533 == 0) {
                    if (var59 > var61.field2547 - var61.field2541) {
                        var59 = var61.field2547 - var61.field2541;
                    }
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var61.field2545 != var59) {
                        var61.field2545 = var59;
                        method2745(var61);
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 163) {
                int var62 = field715.method2525();
                int var63 = field715.method2503();
                class157.field2650[var63] = var62;
                if (class157.field2656[var63] != var62) {
                    class157.field2656[var63] = var62;
                    method2769(var63);
                }
                field653[++field654 - 1 & 0x1F] = var63;
                field529 = -1;
                return true;
            }
            if (field529 == 165) {
                field661 = field708;
                if (field497 == 0) {
                    field702 = null;
                    field694 = null;
                    Statics.field46 = 0;
                    Statics.field256 = null;
                    field529 = -1;
                    return true;
                }
                field694 = field715.method2470();
                long var64 = field715.method2567();
                long var66 = var64;
                String var68;
                if (var64 <= 0L || var64 >= 6582952005840035281L) {
                    var68 = null;
                } else if (var64 % 37L == 0L) {
                    var68 = null;
                } else {
                    int var69 = 0;
                    for (long var70 = var64; var70 != 0L; var70 /= 37L) {
                        var69++;
                    }
                    StringBuilder var72 = new StringBuilder(var69);
                    while (var66 != 0L) {
                        long var73 = var66;
                        var66 /= 37L;
                        var72.append(class145.field2419[(int) (var73 - var66 * 37L)]);
                    }
                    var68 = var72.reverse().toString();
                }
                field702 = var68;
                Statics.field242 = field715.method2479();
                int var75 = field715.method2485();
                if (var75 == 255) {
                    field529 = -1;
                    return true;
                }
                Statics.field46 = var75;
                class8[] var76 = new class8[100];
                for (int var77 = 0; var77 < Statics.field46; var77++) {
                    var76[var77] = new class8();
                    var76[var77].field106 = field715.method2470();
                    var76[var77].field116 = class147.method2352(var76[var77].field106, Statics.field469);
                    var76[var77].field108 = field715.method2487();
                    var76[var77].field107 = field715.method2479();
                    field715.method2470();
                    if (var76[var77].field106.equals(Statics.field2611.field36)) {
                        Statics.field1947 = var76[var77].field107;
                    }
                }
                boolean var78 = false;
                int var79 = Statics.field46;
                while (var79 > 0) {
                    boolean var80 = true;
                    var79--;
                    for (int var81 = 0; var81 < var79; var81++) {
                        if (var76[var81].field116.compareTo(var76[var81 + 1].field116) > 0) {
                            class8 var82 = var76[var81];
                            var76[var81] = var76[var81 + 1];
                            var76[var81 + 1] = var82;
                            var80 = false;
                        }
                    }
                    if (var80) {
                        break;
                    }
                }
                Statics.field256 = var76;
                field529 = -1;
                return true;
            }
            if (field529 == 237) {
                int var83 = field715.method2534();
                int var84 = field715.method2526();
                class156 var85 = class156.method2382(var84);
                if (var85.field2585 != var83 || var83 == -1) {
                    var85.field2585 = var83;
                    var85.field2578 = 0;
                    var85.field2614 = 0;
                    method2745(var85);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 116) {
                field700 = 0;
                field529 = -1;
                return true;
            }
            if (field529 == 122) {
                int var86 = field715.method2530();
                byte var87 = field715.method2547();
                class157.field2650[var86] = var87;
                if (class157.field2656[var86] != var87) {
                    class157.field2656[var86] = var87;
                    method2769(var86);
                }
                field653[++field654 - 1 & 0x1F] = var86;
                field529 = -1;
                return true;
            }
            if (field529 == 112) {
                field468 = 1;
                field660 = field708;
                field529 = -1;
                return true;
            }
            if (field529 == 44) {
                String var88 = field715.method2470();
                Object[] var89 = new Object[var88.length() + 1];
                for (int var90 = var88.length() - 1; var90 >= 0; var90--) {
                    if (var88.charAt(var90) == 's') {
                        var89[var90 + 1] = field715.method2470();
                    } else {
                        var89[var90 + 1] = Integer.valueOf(field715.method2593());
                    }
                }
                var89[0] = Integer.valueOf(field715.method2593());
                class1 var91 = new class1();
                var91.field16 = var89;
                class25.method1222(var91);
                field529 = -1;
                return true;
            }
            if (field529 == 171) {
                int var92 = field715.method2592();
                class18.method62(var92);
                field589[++field600 - 1 & 0x1F] = var92 & 0x7FFF;
                field529 = -1;
                return true;
            }
            if (field529 == 76) {
                int var93 = field715.method2485();
                int var94 = field715.method2485();
                int var95 = field715.method2485();
                int var96 = field715.method2485();
                field572[var93] = true;
                field716[var93] = var94;
                field717[var93] = var95;
                field723[var93] = var96;
                field685[var93] = 0;
                field529 = -1;
                return true;
            }
            if (field529 == 248) {
                int var97 = field715.method2593();
                int var98 = field715.method2487();
                if (var97 < -70000) {
                    var98 += 32768;
                }
                class156 var99;
                if (var97 >= 0) {
                    var99 = class156.method2382(var97);
                } else {
                    var99 = null;
                }
                while (field715.field2016 < field497) {
                    int var100 = field715.method2628();
                    int var101 = field715.method2487();
                    int var102 = 0;
                    if (var101 != 0) {
                        var102 = field715.method2485();
                        if (var102 == 255) {
                            var102 = field715.method2593();
                        }
                    }
                    if (var99 != null && var100 >= 0 && var100 < var99.field2561.length) {
                        var99.field2561[var100] = var101;
                        var99.field2602[var100] = var102;
                    }
                    class18.method36(var98, var100, var101 - 1, var102);
                }
                if (var99 != null) {
                    method2745(var99);
                }
                method10();
                field589[++field600 - 1 & 0x1F] = var98 & 0x7FFF;
                field529 = -1;
                return true;
            }
            if (field529 == 182) {
                int var103 = field715.method2592();
                int var104 = field715.method2526();
                int var105 = var103 >> 10 & 0x1F;
                int var106 = var103 >> 5 & 0x1F;
                int var107 = var103 & 0x1F;
                int var108 = (var107 << 3) + (var105 << 19) + (var106 << 11);
                class156 var109 = class156.method2382(var104);
                if (var109.field2548 != var108) {
                    var109.field2548 = var108;
                    method2745(var109);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 0) {
                int var110 = field715.method2593();
                int var111 = field715.method2592();
                class156 var112 = class156.method2382(var110);
                if (var112.field2563 != 2 || var112.field2605 != var111) {
                    var112.field2563 = 2;
                    var112.field2605 = var111;
                    method2745(var112);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 138) {
                field597 = 0;
                field624 = 0;
                method2810();
                while (field715.method2364(field497) >= 27) {
                    int var113 = field715.method2377(15);
                    if (var113 == 32767) {
                        break;
                    }
                    boolean var114 = false;
                    if (field504[var113] == null) {
                        field504[var113] = new class24();
                        var114 = true;
                    }
                    class24 var115 = field504[var113];
                    field506[++field505 - 1] = var113;
                    var115.field449 = field652;
                    int var116 = field715.method2377(5);
                    if (var116 > 15) {
                        var116 -= 32;
                    }
                    int var117 = field715.method2377(1);
                    if (var117 == 1) {
                        field648[++field624 - 1] = var113;
                    }
                    var115.field378 = class30.method763(field715.method2377(14));
                    int var118 = field715.method2377(5);
                    if (var118 > 15) {
                        var118 -= 32;
                    }
                    int var119 = field602[field715.method2377(3)];
                    if (var114) {
                        var115.field451 = var115.field417 = var119;
                    }
                    int var120 = field715.method2377(1);
                    var115.field454 = var115.field378.field765;
                    var115.field453 = var115.field378.field788;
                    if (var115.field453 == 0) {
                        var115.field417 = 0;
                    }
                    var115.field407 = var115.field378.field771;
                    var115.field412 = var115.field378.field796;
                    var115.field413 = var115.field378.field773;
                    var115.field414 = var115.field378.field774;
                    var115.field429 = var115.field378.field766;
                    var115.field445 = var115.field378.field769;
                    var115.field410 = var115.field378.field770;
                    var115.method226(Statics.field2611.field405[0] + var118, Statics.field2611.field456[0] + var116, var120 == 1);
                }
                field715.method2378();
                method211();
                for (int var121 = 0; var121 < field597; var121++) {
                    int var122 = field598[var121];
                    if (field652 != field504[var122].field449) {
                        field504[var122].field378 = null;
                        field504[var122] = null;
                    }
                }
                if (field497 != field715.field2016) {
                    throw new RuntimeException(field715.field2016 + class2.field18 + field497);
                }
                for (int var123 = 0; var123 < field505; var123++) {
                    if (field504[field506[var123]] == null) {
                        throw new RuntimeException(var123 + class2.field18 + field505);
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 240) {
                int var124 = field715.method2508();
                int var125 = field715.method2508();
                String var126 = field715.method2470();
                if (var124 >= 1 && var124 <= 8) {
                    if (var126.equalsIgnoreCase("null")) {
                        var126 = null;
                    }
                    field689[var124 - 1] = var126;
                    field601[var124 - 1] = var125 == 0;
                }
                field529 = -1;
                return true;
            }
            if (field529 == 88) {
                int var127 = field715.method2593();
                int var128 = field715.method2530();
                int var129 = field715.method2592();
                int var130 = field715.method2503();
                class156 var131 = class156.method2382(var127);
                if (var131.field2571 != var129 || var131.field2521 != var128 || var131.field2574 != var130) {
                    var131.field2571 = var129;
                    var131.field2521 = var128;
                    var131.field2574 = var130;
                    method2745(var131);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 93) {
                field715.field2016 += 28;
                if (field715.method2505()) {
                    class115 var132 = field715;
                    int var133 = field715.field2016 - 28;
                    if (class81.field1415 != null) {
                        try {
                            class81.field1415.method576(0L);
                            class81.field1415.method580(var132.field2013, var133, 24);
                        } catch (Exception var307) {
                        }
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 231) {
                int var135 = field715.method2487();
                int var136 = field715.method2485();
                int var137 = field715.method2487();
                if (field713 != 0 && var136 != 0 && field718 < 50) {
                    field709[field718] = var135;
                    field710[field718] = var136;
                    field711[field718] = var137;
                    field512[field718] = null;
                    field712[field718] = 0;
                    field718++;
                }
                field529 = -1;
                return true;
            }
            if (field529 == 236) {
                int var141 = field715.method2503();
                int var142 = field715.method2593();
                int var143 = field715.method2503();
                class156 var144 = class156.method2382(var142);
                var144.field2575 = (var143 << 16) + var141;
                field529 = -1;
                return true;
            }
            if (field529 == 84) {
                String var145 = field715.method2470();
                if (var145.endsWith(":tradereq:")) {
                    String var146 = var145.substring(0, var145.indexOf(":"));
                    boolean var147 = false;
                    if (method877(var146)) {
                        var147 = true;
                    }
                    if (!var147 && field588 == 0) {
                        method1380(4, var146, class133.field2194);
                    }
                } else if (var145.endsWith(":duelreq:")) {
                    String var148 = var145.substring(0, var145.indexOf(":"));
                    boolean var149 = false;
                    if (method877(var148)) {
                        var149 = true;
                    }
                    if (!var149 && field588 == 0) {
                        method1380(8, var148, class133.field2195);
                    }
                } else if (var145.endsWith(":chalreq:")) {
                    String var150 = var145.substring(0, var145.indexOf(":"));
                    boolean var151 = false;
                    if (method877(var150)) {
                        var151 = true;
                    }
                    if (!var151 && field588 == 0) {
                        String var152 = var145.substring(var145.indexOf(":") + 1, var145.length() - 9);
                        method1380(8, var150, var152);
                    }
                } else if (var145.endsWith(":assistreq:")) {
                    String var153 = var145.substring(0, var145.indexOf(":"));
                    boolean var154 = false;
                    if (method877(var153)) {
                        var154 = true;
                    }
                    if (!var154 && field588 == 0) {
                        method1380(10, var153, "");
                    }
                } else if (var145.endsWith(":clan:")) {
                    String var155 = var145.substring(0, var145.indexOf(":clan:"));
                    method1380(11, "", var155);
                } else if (var145.endsWith(":trade:")) {
                    String var156 = var145.substring(0, var145.indexOf(":trade:"));
                    if (field588 == 0) {
                        method1380(12, "", var156);
                    }
                } else if (var145.endsWith(":assist:")) {
                    String var157 = var145.substring(0, var145.indexOf(":assist:"));
                    if (field588 == 0) {
                        method1380(13, "", var157);
                    }
                } else {
                    method1380(0, "", var145);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 45) {
                if (field629 != -1) {
                    method1511(field629, 0);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 22) {
                String var158 = field715.method2470();
                long var159 = field715.method2567();
                long var161 = (long) field715.method2487();
                long var163 = (long) field715.method2489();
                int var165 = field715.method2485();
                long var166 = (var161 << 32) + var163;
                boolean var168 = false;
                for (int var169 = 0; var169 < 100; var169++) {
                    if (field476[var169] == var166) {
                        var168 = true;
                        break;
                    }
                }
                if (var165 <= 1 && method877(var158)) {
                    var168 = true;
                }
                if (!var168 && field588 == 0) {
                    field476[field684] = var166;
                    field684 = (field684 + 1) % 100;
                    String var170 = class183.method3453(class146.method213(class182.method1344(field715)));
                    if (var165 == 2 || var165 == 3) {
                        method2718(9, class2.method548(1) + var158, var170, class145.method552(var159));
                    } else if (var165 == 1) {
                        method2718(9, class2.method548(0) + var158, var170, class145.method552(var159));
                    } else {
                        method2718(9, var158, var170, class145.method552(var159));
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 216) {
                method10();
                field635 = field715.method2488();
                field662 = field708;
                field529 = -1;
                return true;
            }
            if (field529 == 8) {
                for (int var171 = 0; var171 < Statics.field1027; var171++) {
                    class41 var172 = (class41) class41.field1028.method3311((long) var171);
                    class41 var173;
                    if (var172 == null) {
                        byte[] var174 = Statics.field1033.method3012(16, var171);
                        class41 var175 = new class41();
                        if (var174 != null) {
                            var175.method890(new class126(var174));
                        }
                        class41.field1028.method3314(var175, (long) var171);
                        var173 = var175;
                    } else {
                        var173 = var172;
                    }
                    if (var173 != null && var173.field1029 == 0) {
                        class157.field2650[var171] = 0;
                        class157.field2656[var171] = 0;
                    }
                }
                method10();
                field654 += 32;
                field529 = -1;
                return true;
            }
            if (field529 == 66) {
                for (int var177 = 0; var177 < field618.length; var177++) {
                    if (field618[var177] != null) {
                        field618[var177].field432 = -1;
                    }
                }
                for (int var178 = 0; var178 < field504.length; var178++) {
                    if (field504[var178] != null) {
                        field504[var178].field432 = -1;
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 55) {
                int var179 = field715.method2503();
                if (var179 == 65535) {
                    var179 = -1;
                }
                method3126(var179);
                field529 = -1;
                return true;
            }
            if (field529 == 32) {
                int var180 = field715.method2503();
                if (var180 == 65535) {
                    var180 = -1;
                }
                int var181 = field715.method2538();
                method821(var180, var181);
                field529 = -1;
                return true;
            }
            if (field529 == 19) {
                method10();
                field511 = field715.method2485();
                field662 = field708;
                field529 = -1;
                return true;
            }
            if (field529 == 157) {
                field510 = true;
                Statics.field1535 = field715.method2485();
                Statics.field1191 = field715.method2485();
                Statics.field1894 = field715.method2487();
                Statics.field1824 = field715.method2485();
                Statics.field460 = field715.method2485();
                if (Statics.field460 >= 100) {
                    int var182 = Statics.field1535 * 128 + 64;
                    int var183 = Statics.field1191 * 128 + 64;
                    int var184 = method876(var182, var183, Statics.field1899) - Statics.field1894;
                    int var185 = var182 - Statics.field348;
                    int var186 = var184 - Statics.field359;
                    int var187 = var183 - Statics.field269;
                    int var188 = (int) Math.sqrt((double) (var185 * var185 + var187 * var187));
                    Statics.field2453 = (int) (Math.atan2((double) var186, (double) var188) * 325.949D) & 0x7FF;
                    Statics.field1019 = (int) (Math.atan2((double) var185, (double) var187) * -325.949D) & 0x7FF;
                    if (Statics.field2453 < 128) {
                        Statics.field2453 = 128;
                    }
                    if (Statics.field2453 > 383) {
                        Statics.field2453 = 383;
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 225) {
                int var189 = field497 + field715.field2016;
                int var190 = field715.method2487();
                int var191 = field715.method2487();
                if (field629 != var190) {
                    field629 = var190;
                    method209(field629);
                    class25.method682(field629);
                    for (int var192 = 0; var192 < 100; var192++) {
                        field472[var192] = true;
                    }
                }
                while (var191-- > 0) {
                    int var193 = field715.method2593();
                    int var194 = field715.method2487();
                    int var195 = field715.method2485();
                    class4 var196 = (class4) field630.method3354((long) var193);
                    if (var196 != null && var196.field54 != var194) {
                        method4(var196, true);
                        var196 = null;
                    }
                    if (var196 == null) {
                        class4 var197 = new class4();
                        var197.field54 = var194;
                        var197.field49 = var195;
                        field630.method3353(var197, (long) var193);
                        method209(var194);
                        class25.method682(var194);
                        class156 var198 = class156.method2382(var193);
                        if (var198 != null) {
                            method2745(var198);
                        }
                        if (field633 != null) {
                            method2745(field633);
                            field633 = null;
                        }
                        field693 = false;
                        field612 = 0;
                        method159(Statics.field2048, Statics.field130, Statics.field856, Statics.field1508);
                        if (field629 != -1) {
                            method1511(field629, 1);
                        }
                        var196 = var197;
                    }
                    var196.field50 = true;
                }
                for (class4 var200 = (class4) field630.method3357(); var200 != null; var200 = (class4) field630.method3372()) {
                    if (var200.field50) {
                        var200.field50 = false;
                    } else {
                        method4(var200, true);
                    }
                }
                field669 = new class173(512);
                while (field715.field2016 < var189) {
                    int var201 = field715.method2593();
                    int var202 = field715.method2487();
                    int var203 = field715.method2487();
                    int var204 = field715.method2593();
                    for (int var205 = var202; var205 <= var203; var205++) {
                        long var206 = ((long) var201 << 32) + (long) var205;
                        field669.method3353(new class169(var204), var206);
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 73) {
                int var208 = field715.method2527();
                class156 var209 = class156.method2382(var208);
                for (int var210 = 0; var210 < var209.field2561.length; var210++) {
                    var209.field2561[var210] = -1;
                    var209.field2561[var210] = 0;
                }
                method2745(var209);
                field529 = -1;
                return true;
            }
            if (field529 == 253) {
                String var211 = field715.method2470();
                long var212 = (long) field715.method2487();
                long var214 = (long) field715.method2489();
                int var216 = field715.method2485();
                long var217 = (var212 << 32) + var214;
                boolean var219 = false;
                for (int var220 = 0; var220 < 100; var220++) {
                    if (field476[var220] == var217) {
                        var219 = true;
                        break;
                    }
                }
                if (method877(var211)) {
                    var219 = true;
                }
                if (!var219 && field588 == 0) {
                    field476[field684] = var217;
                    field684 = (field684 + 1) % 100;
                    String var221 = class183.method3453(class146.method213(class182.method1344(field715)));
                    if (var216 == 2 || var216 == 3) {
                        method1380(7, class2.method548(1) + var211, var221);
                    } else if (var216 == 1) {
                        method1380(7, class2.method548(0) + var211, var221);
                    } else {
                        method1380(3, var211, var221);
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 106) {
                Statics.field379 = field715.method2510();
                Statics.field53 = field715.method2535();
                field529 = -1;
                return true;
            }
            if (field529 == 130) {
                int var222 = field715.method2487();
                field629 = var222;
                method209(var222);
                class25.method682(field629);
                for (int var223 = 0; var223 < 100; var223++) {
                    field472[var223] = true;
                }
                field529 = -1;
                return true;
            }
            if (field529 == 80) {
                method10();
                int var224 = field715.method2526();
                int var225 = field715.method2510();
                int var226 = field715.method2508();
                field609[var226] = var224;
                field655[var226] = var225;
                field574[var226] = 1;
                for (int var227 = 0; var227 < 98; var227++) {
                    if (var224 >= class129.field2023[var227]) {
                        field574[var226] = var227 + 2;
                    }
                }
                field657[++field625 - 1 & 0x1F] = var226;
                field529 = -1;
                return true;
            }
            if (field529 == 155) {
                field484 = field715.method2485();
                if (field484 == 1) {
                    field485 = field715.method2487();
                }
                if (field484 >= 2 && field484 <= 6) {
                    if (field484 == 2) {
                        field490 = 64;
                        field491 = 64;
                    }
                    if (field484 == 3) {
                        field490 = 0;
                        field491 = 64;
                    }
                    if (field484 == 4) {
                        field490 = 128;
                        field491 = 64;
                    }
                    if (field484 == 5) {
                        field490 = 64;
                        field491 = 0;
                    }
                    if (field484 == 6) {
                        field490 = 64;
                        field491 = 128;
                    }
                    field484 = 2;
                    field487 = field715.method2487();
                    field521 = field715.method2487();
                    field631 = field715.method2485();
                }
                if (field484 == 10) {
                    field541 = field715.method2487();
                }
                field529 = -1;
                return true;
            }
            if (field529 == 25) {
                String var228 = field715.method2470();
                int var229 = field715.method2487();
                byte var230 = field715.method2479();
                boolean var231 = false;
                if (var230 == -128) {
                    var231 = true;
                }
                if (var231) {
                    if (Statics.field46 == 0) {
                        field529 = -1;
                        return true;
                    }
                    boolean var232 = false;
                    int var233;
                    for (var233 = 0; var233 < Statics.field46 && (!Statics.field256[var233].field106.equals(var228) || Statics.field256[var233].field108 != var229); var233++) {
                    }
                    if (var233 < Statics.field46) {
                        while (var233 < Statics.field46 - 1) {
                            Statics.field256[var233] = Statics.field256[var233 + 1];
                            var233++;
                        }
                        Statics.field46--;
                        Statics.field256[Statics.field46] = null;
                    }
                } else {
                    field715.method2470();
                    class8 var234 = new class8();
                    var234.field106 = var228;
                    var234.field116 = class147.method2352(var234.field106, Statics.field469);
                    var234.field108 = var229;
                    var234.field107 = var230;
                    int var235;
                    for (var235 = Statics.field46 - 1; var235 >= 0; var235--) {
                        int var236 = Statics.field256[var235].field116.compareTo(var234.field106);
                        if (var236 == 0) {
                            Statics.field256[var235].field108 = var229;
                            Statics.field256[var235].field107 = var230;
                            if (var228.equals(Statics.field2611.field36)) {
                                Statics.field1947 = var230;
                            }
                            field661 = field708;
                            field529 = -1;
                            return true;
                        }
                        if (var236 < 0) {
                            break;
                        }
                    }
                    if (Statics.field46 >= Statics.field256.length) {
                        field529 = -1;
                        return true;
                    }
                    for (int var237 = Statics.field46 - 1; var237 > var235; var237--) {
                        Statics.field256[var237 + 1] = Statics.field256[var237];
                    }
                    if (Statics.field46 == 0) {
                        Statics.field256 = new class8[100];
                    }
                    Statics.field256[var235 + 1] = var234;
                    Statics.field46++;
                    if (var228.equals(Statics.field2611.field36)) {
                        Statics.field1947 = var230;
                    }
                }
                field661 = field708;
                field529 = -1;
                return true;
            }
            if (field529 == 222) {
                String var238 = field715.method2470();
                String var239 = class183.method3453(class146.method213(class182.method1344(field715)));
                method1380(6, var238, var239);
                field529 = -1;
                return true;
            }
            if (field529 == 246) {
                method1405(true);
                field529 = -1;
                return true;
            }
            if (field529 == 234) {
                field597 = 0;
                field624 = 0;
                field715.method2361();
                int var240 = field715.method2377(1);
                if (var240 != 0) {
                    int var241 = field715.method2377(2);
                    if (var241 == 0) {
                        field648[++field624 - 1] = 2047;
                    } else if (var241 == 1) {
                        int var242 = field715.method2377(3);
                        Statics.field2611.method246(var242, false);
                        int var243 = field715.method2377(1);
                        if (var243 == 1) {
                            field648[++field624 - 1] = 2047;
                        }
                    } else if (var241 == 2) {
                        int var244 = field715.method2377(3);
                        Statics.field2611.method246(var244, true);
                        int var245 = field715.method2377(3);
                        Statics.field2611.method246(var245, true);
                        int var246 = field715.method2377(1);
                        if (var246 == 1) {
                            field648[++field624 - 1] = 2047;
                        }
                    } else if (var241 == 3) {
                        Statics.field1899 = field715.method2377(2);
                        int var247 = field715.method2377(1);
                        if (var247 == 1) {
                            field648[++field624 - 1] = 2047;
                        }
                        int var248 = field715.method2377(1);
                        int var249 = field715.method2377(7);
                        int var250 = field715.method2377(7);
                        Statics.field2611.method226(var249, var250, var248 == 1);
                    }
                }
                int var251 = field715.method2377(8);
                if (var251 < field590) {
                    for (int var252 = var251; var252 < field590; var252++) {
                        field598[++field597 - 1] = field591[var252];
                    }
                }
                if (var251 > field590) {
                    throw new RuntimeException("");
                }
                field590 = 0;
                for (int var253 = 0; var253 < var251; var253++) {
                    int var254 = field591[var253];
                    class3 var255 = field618[var254];
                    int var256 = field715.method2377(1);
                    if (var256 == 0) {
                        field591[++field590 - 1] = var254;
                        var255.field449 = field652;
                    } else {
                        int var257 = field715.method2377(2);
                        if (var257 == 0) {
                            field591[++field590 - 1] = var254;
                            var255.field449 = field652;
                            field648[++field624 - 1] = var254;
                        } else if (var257 == 1) {
                            field591[++field590 - 1] = var254;
                            var255.field449 = field652;
                            int var258 = field715.method2377(3);
                            var255.method246(var258, false);
                            int var259 = field715.method2377(1);
                            if (var259 == 1) {
                                field648[++field624 - 1] = var254;
                            }
                        } else if (var257 == 2) {
                            field591[++field590 - 1] = var254;
                            var255.field449 = field652;
                            int var260 = field715.method2377(3);
                            var255.method246(var260, true);
                            int var261 = field715.method2377(3);
                            var255.method246(var261, true);
                            int var262 = field715.method2377(1);
                            if (var262 == 1) {
                                field648[++field624 - 1] = var254;
                            }
                        } else if (var257 == 3) {
                            field598[++field597 - 1] = var254;
                        }
                    }
                }
                while (field715.method2364(field497) >= 11) {
                    int var263 = field715.method2377(11);
                    if (var263 == 2047) {
                        break;
                    }
                    boolean var264 = false;
                    if (field618[var263] == null) {
                        field618[var263] = new class3();
                        if (field594[var263] != null) {
                            field618[var263].method16(field594[var263]);
                        }
                        var264 = true;
                    }
                    field591[++field590 - 1] = var263;
                    class3 var265 = field618[var263];
                    var265.field449 = field652;
                    int var266 = field715.method2377(1);
                    int var267 = field715.method2377(1);
                    if (var267 == 1) {
                        field648[++field624 - 1] = var263;
                    }
                    int var268 = field602[field715.method2377(3)];
                    if (var264) {
                        var265.field451 = var265.field417 = var268;
                    }
                    int var269 = field715.method2377(5);
                    if (var269 > 15) {
                        var269 -= 32;
                    }
                    int var270 = field715.method2377(5);
                    if (var270 > 15) {
                        var270 -= 32;
                    }
                    var265.method226(Statics.field2611.field405[0] + var270, Statics.field2611.field456[0] + var269, var266 == 1);
                }
                field715.method2378();
                method61();
                for (int var271 = 0; var271 < field597; var271++) {
                    int var272 = field598[var271];
                    if (field652 != field618[var272].field449) {
                        field618[var272] = null;
                    }
                }
                if (field497 != field715.field2016) {
                    throw new RuntimeException(field715.field2016 + class2.field18 + field497);
                }
                for (int var273 = 0; var273 < field590; var273++) {
                    if (field618[field591[var273]] == null) {
                        throw new RuntimeException(var273 + class2.field18 + field590);
                    }
                }
                field529 = -1;
                return true;
            }
            if (field529 == 94) {
                int var274 = field715.method2527();
                int var275 = field715.method2487();
                if (var275 == 65535) {
                    var275 = -1;
                }
                int var276 = field715.method2503();
                if (var276 == 65535) {
                    var276 = -1;
                }
                int var277 = field715.method2525();
                for (int var278 = var276; var278 <= var275; var278++) {
                    long var279 = ((long) var274 << 32) + (long) var278;
                    class177 var281 = field669.method3354(var279);
                    if (var281 != null) {
                        var281.method3415();
                    }
                    field669.method3353(new class169(var277), var279);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 151) {
                class180.method857(field715, field497);
                field529 = -1;
                return true;
            }
            if (field529 == 192) {
                int var282 = field715.method2525();
                String var283 = field715.method2470();
                class156 var284 = class156.method2382(var282);
                if (!var283.equals(var284.field2621)) {
                    var284.field2621 = var283;
                    method2745(var284);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 161) {
                int var285 = field715.method2526();
                int var286 = field715.method2503();
                if (var286 == 65535) {
                    var286 = -1;
                }
                int var287 = field715.method2526();
                class156 var288 = class156.method2382(var285);
                if (var288.field2530) {
                    var288.field2635 = var286;
                    var288.field2638 = var287;
                    class39 var290 = class39.method196(var286);
                    var288.field2571 = var290.field981;
                    var288.field2521 = var290.field982;
                    var288.field2527 = var290.field983;
                    var288.field2569 = var290.field984;
                    var288.field2570 = var290.field985;
                    var288.field2574 = var290.field996;
                    if (var288.field2540 > 0) {
                        var288.field2574 = var288.field2574 * 32 / var288.field2540;
                    }
                    method2745(var288);
                } else if (var286 == -1) {
                    var288.field2563 = 0;
                    field529 = -1;
                    return true;
                } else {
                    class39 var289 = class39.method196(var286);
                    var288.field2563 = 4;
                    var288.field2605 = var286;
                    var288.field2571 = var289.field981;
                    var288.field2521 = var289.field982;
                    var288.field2574 = var289.field996 * 100 / var287;
                    method2745(var288);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 135) {
                int var291 = field715.method2526();
                int var292 = field715.method2534();
                int var293 = field715.method2520();
                class156 var294 = class156.method2382(var291);
                int var295 = var294.field2539 + var292;
                int var296 = var294.field2628 + var293;
                if (var294.field2643 != var295 || var294.field2537 != var296) {
                    var294.field2643 = var295;
                    var294.field2537 = var296;
                    method2745(var294);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 218) {
                int var297 = field715.method2535();
                int var298 = field715.method2485();
                int var299 = field715.method2510();
                Statics.field1899 = var298 >> 1;
                Statics.field2611.method226(var297, var299, (var298 & 0x1) == 1);
                field529 = -1;
                return true;
            }
            if (field529 == 203) {
                boolean var300 = field715.method2535() == 1;
                int var301 = field715.method2526();
                class156 var302 = class156.method2382(var301);
                if (var302.field2543 != var300) {
                    var302.field2543 = var300;
                    method2745(var302);
                }
                field529 = -1;
                return true;
            }
            if (field529 == 62) {
                method60();
                field529 = -1;
                return false;
            }
            class79.method126("" + field529 + class2.field18 + field517 + class2.field18 + field674 + class2.field18 + field497, (Throwable) null);
            method60();
        } catch (IOException var308) {
            method96();
        } catch (Exception var309) {
            String var305 = "" + field529 + class2.field18 + field517 + class2.field18 + field674 + class2.field18 + field497 + class2.field18 + (Statics.field362 + Statics.field2611.field405[0]) + class2.field18 + (Statics.field65 + Statics.field2611.field456[0]) + class2.field18;
            for (int var306 = 0; var306 < field497 && var306 < 50; var306++) {
                var305 = var305 + field715.field2013[var306] + class2.field18;
            }
            class79.method126(var305, var309);
            method60();
        }
        return true;
    }

    @ObfuscatedName("eq.bc(I)V")
    public static final void method2727() {
        if (field529 == 117) {
            int var0 = field715.method2487();
            int var1 = field715.method2535();
            int var2 = (var1 >> 4 & 0x7) + Statics.field53;
            int var3 = (var1 & 0x7) + Statics.field379;
            int var4 = field715.method2503();
            int var5 = field715.method2592();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && field595 != var0) {
                class16 var6 = new class16();
                var6.field250 = var5;
                var6.field243 = var4;
                if (field603[Statics.field1899][var2][var3] == null) {
                    field603[Statics.field1899][var2][var3] = new class175();
                }
                field603[Statics.field1899][var2][var3].method3379(var6);
                method1542(var2, var3);
            }
        } else if (field529 == 226) {
            int var7 = field715.method2510();
            int var8 = var7 >> 2;
            int var9 = var7 & 0x3;
            int var10 = field475[var8];
            int var11 = field715.method2535();
            int var12 = (var11 >> 4 & 0x7) + Statics.field53;
            int var13 = (var11 & 0x7) + Statics.field379;
            if (var12 >= 0 && var13 >= 0 && var12 < 104 && var13 < 104) {
                method109(Statics.field1899, var12, var13, var10, -1, var8, var9, 0, -1);
            }
        } else {
            if (field529 == 60) {
                int var14 = field715.method2487();
                byte var15 = field715.method2547();
                int var16 = field715.method2530();
                byte var17 = field715.method2479();
                int var18 = field715.method2592();
                int var19 = field715.method2503();
                int var20 = field715.method2485();
                int var21 = (var20 >> 4 & 0x7) + Statics.field53;
                int var22 = (var20 & 0x7) + Statics.field379;
                byte var23 = field715.method2539();
                int var24 = field715.method2510();
                int var25 = var24 >> 2;
                int var26 = var24 & 0x3;
                int var27 = field475[var25];
                byte var28 = field715.method2479();
                class3 var29;
                if (field595 == var14) {
                    var29 = Statics.field2611;
                } else {
                    var29 = field618[var14];
                }
                if (var29 != null) {
                    class31 var30 = class31.method245(var18);
                    int var31;
                    int var32;
                    if (var26 == 1 || var26 == 3) {
                        var31 = var30.field813;
                        var32 = var30.field812;
                    } else {
                        var31 = var30.field812;
                        var32 = var30.field813;
                    }
                    int var33 = (var31 >> 1) + var21;
                    int var34 = (var31 + 1 >> 1) + var21;
                    int var35 = (var32 >> 1) + var22;
                    int var36 = (var32 + 1 >> 1) + var22;
                    int[][] var37 = class9.field126[Statics.field1899];
                    int var38 = var37[var33][var35] + var37[var34][var35] + var37[var33][var36] + var37[var34][var36] >> 2;
                    int var39 = (var21 << 7) + (var31 << 6);
                    int var40 = (var22 << 7) + (var32 << 6);
                    class111 var41 = var30.method684(var25, var26, var37, var39, var38, var40);
                    if (var41 != null) {
                        method109(Statics.field1899, var21, var22, var27, -1, 0, 0, var19 + 1, var16 + 1);
                        var29.field34 = field652 + var19;
                        var29.field35 = field652 + var16;
                        var29.field27 = var41;
                        var29.field31 = var21 * 128 + var31 * 64;
                        var29.field39 = var22 * 128 + var32 * 64;
                        var29.field37 = var38;
                        if (var15 > var28) {
                            byte var42 = var15;
                            var15 = var28;
                            var28 = var42;
                        }
                        if (var17 > var23) {
                            byte var43 = var17;
                            var17 = var23;
                            var23 = var43;
                        }
                        var29.field40 = var15 + var21;
                        var29.field42 = var21 + var28;
                        var29.field45 = var17 + var22;
                        var29.field38 = var22 + var23;
                    }
                }
            }
            if (field529 == 148) {
                int var44 = field715.method2510();
                int var45 = (var44 >> 4 & 0x7) + Statics.field53;
                int var46 = (var44 & 0x7) + Statics.field379;
                int var47 = field715.method2592();
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    class175 var48 = field603[Statics.field1899][var45][var46];
                    if (var48 != null) {
                        for (class16 var49 = (class16) var48.method3382(); var49 != null; var49 = (class16) var48.method3388()) {
                            if ((var47 & 0x7FFF) == var49.field250) {
                                var49.method3415();
                                break;
                            }
                        }
                        if (var48.method3382() == null) {
                            field603[Statics.field1899][var45][var46] = null;
                        }
                        method1542(var45, var46);
                    }
                }
            } else if (field529 == 79) {
                int var50 = field715.method2485();
                int var51 = (var50 >> 4 & 0x7) + Statics.field53;
                int var52 = (var50 & 0x7) + Statics.field379;
                int var53 = field715.method2487();
                int var54 = field715.method2487();
                int var55 = field715.method2487();
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    class175 var56 = field603[Statics.field1899][var51][var52];
                    if (var56 != null) {
                        for (class16 var57 = (class16) var56.method3382(); var57 != null; var57 = (class16) var56.method3388()) {
                            if ((var53 & 0x7FFF) == var57.field250 && var57.field243 == var54) {
                                var57.field243 = var55;
                                break;
                            }
                        }
                        method1542(var51, var52);
                    }
                }
            } else {
                if (field529 == 242) {
                    int var58 = field715.method2485();
                    int var59 = (var58 >> 4 & 0x7) + Statics.field53;
                    int var60 = (var58 & 0x7) + Statics.field379;
                    int var61 = field715.method2487();
                    int var62 = field715.method2485();
                    int var63 = var62 >> 4 & 0xF;
                    int var64 = var62 & 0x7;
                    int var65 = field715.method2485();
                    if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                        int var66 = var63 + 1;
                        if (Statics.field2611.field405[0] >= var59 - var66 && Statics.field2611.field405[0] <= var59 + var66 && Statics.field2611.field456[0] >= var60 - var66 && Statics.field2611.field456[0] <= var60 + var66 && field707 != 0 && var64 > 0 && field718 < 50) {
                            field709[field718] = var61;
                            field710[field718] = var64;
                            field711[field718] = var65;
                            field512[field718] = null;
                            field712[field718] = (var59 << 16) + (var60 << 8) + var63;
                            field718++;
                        }
                    }
                }
                if (field529 == 129) {
                    int var67 = field715.method2485();
                    int var68 = (var67 >> 4 & 0x7) + Statics.field53;
                    int var69 = (var67 & 0x7) + Statics.field379;
                    int var70 = field715.method2510();
                    int var71 = var70 >> 2;
                    int var72 = var70 & 0x3;
                    int var73 = field475[var71];
                    int var74 = field715.method2487();
                    if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104) {
                        method109(Statics.field1899, var68, var69, var73, var74, var71, var72, 0, -1);
                    }
                } else if (field529 == 48) {
                    int var75 = field715.method2535();
                    int var76 = var75 >> 2;
                    int var77 = var75 & 0x3;
                    int var78 = field475[var76];
                    int var79 = field715.method2503();
                    int var80 = field715.method2508();
                    int var81 = (var80 >> 4 & 0x7) + Statics.field53;
                    int var82 = (var80 & 0x7) + Statics.field379;
                    if (var81 >= 0 && var82 >= 0 && var81 < 103 && var82 < 103) {
                        if (var78 == 0) {
                            class95 var83 = Statics.field1210.method1895(Statics.field1899, var81, var82);
                            if (var83 != null) {
                                int var84 = var83.field1606 >> 14 & 0x7FFF;
                                if (var76 == 2) {
                                    var83.field1604 = new class13(var84, 2, var77 + 4, Statics.field1899, var81, var82, var79, false, var83.field1604);
                                    var83.field1605 = new class13(var84, 2, var77 + 1 & 0x3, Statics.field1899, var81, var82, var79, false, var83.field1605);
                                } else {
                                    var83.field1604 = new class13(var84, var76, var77, Statics.field1899, var81, var82, var79, false, var83.field1604);
                                }
                            }
                        }
                        if (var78 == 1) {
                            class107 var85 = Statics.field1210.method1896(Statics.field1899, var81, var82);
                            if (var85 != null) {
                                int var86 = var85.field1783 >> 14 & 0x7FFF;
                                if (var76 == 4 || var76 == 5) {
                                    var85.field1784 = new class13(var86, 4, var77, Statics.field1899, var81, var82, var79, false, var85.field1784);
                                } else if (var76 == 6) {
                                    var85.field1784 = new class13(var86, 4, var77 + 4, Statics.field1899, var81, var82, var79, false, var85.field1784);
                                } else if (var76 == 7) {
                                    var85.field1784 = new class13(var86, 4, (var77 + 2 & 0x3) + 4, Statics.field1899, var81, var82, var79, false, var85.field1784);
                                } else if (var76 == 8) {
                                    var85.field1784 = new class13(var86, 4, var77 + 4, Statics.field1899, var81, var82, var79, false, var85.field1784);
                                    var85.field1781 = new class13(var86, 4, (var77 + 2 & 0x3) + 4, Statics.field1899, var81, var82, var79, false, var85.field1781);
                                }
                            }
                        }
                        if (var78 == 2) {
                            class97 var87 = Statics.field1210.method1897(Statics.field1899, var81, var82);
                            if (var76 == 11) {
                                var76 = 10;
                            }
                            if (var87 != null) {
                                var87.field1627 = new class13(var87.field1633 >> 14 & 0x7FFF, var76, var77, Statics.field1899, var81, var82, var79, false, var87.field1627);
                            }
                        }
                        if (var78 == 3) {
                            class106 var88 = Statics.field1210.method1909(Statics.field1899, var81, var82);
                            if (var88 != null) {
                                var88.field1771 = new class13(var88.field1768 >> 14 & 0x7FFF, 22, var77, Statics.field1899, var81, var82, var79, false, var88.field1771);
                            }
                        }
                    }
                } else if (field529 == 63) {
                    int var89 = field715.method2508();
                    int var90 = (var89 >> 4 & 0x7) + Statics.field53;
                    int var91 = (var89 & 0x7) + Statics.field379;
                    int var92 = field715.method2487();
                    int var93 = field715.method2530();
                    if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                        class16 var94 = new class16();
                        var94.field250 = var92;
                        var94.field243 = var93;
                        if (field603[Statics.field1899][var90][var91] == null) {
                            field603[Statics.field1899][var90][var91] = new class175();
                        }
                        field603[Statics.field1899][var90][var91].method3379(var94);
                        method1542(var90, var91);
                    }
                } else if (field529 == 149) {
                    int var95 = field715.method2485();
                    int var96 = (var95 >> 4 & 0x7) + Statics.field53;
                    int var97 = (var95 & 0x7) + Statics.field379;
                    int var98 = field715.method2487();
                    int var99 = field715.method2485();
                    int var100 = field715.method2487();
                    if (var96 >= 0 && var97 >= 0 && var96 < 104 && var97 < 104) {
                        int var101 = var96 * 128 + 64;
                        int var102 = var97 * 128 + 64;
                        class19 var103 = new class19(var98, Statics.field1899, var101, var102, method876(var101, var102, Statics.field1899) - var99, var100, field652);
                        field606.method3379(var103);
                    }
                } else if (field529 == 213) {
                    int var104 = field715.method2485();
                    int var105 = (var104 >> 4 & 0x7) + Statics.field53;
                    int var106 = (var104 & 0x7) + Statics.field379;
                    int var107 = var105 + field715.method2479();
                    int var108 = var106 + field715.method2479();
                    int var109 = field715.method2488();
                    int var110 = field715.method2487();
                    int var111 = field715.method2485() * 4;
                    int var112 = field715.method2485() * 4;
                    int var113 = field715.method2487();
                    int var114 = field715.method2487();
                    int var115 = field715.method2485();
                    int var116 = field715.method2485();
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104 && var110 != 65535) {
                        int var117 = var105 * 128 + 64;
                        int var118 = var106 * 128 + 64;
                        int var119 = var107 * 128 + 64;
                        int var120 = var108 * 128 + 64;
                        class10 var121 = new class10(var110, Statics.field1899, var117, var118, method876(var117, var118, Statics.field1899) - var111, field652 + var113, field652 + var114, var115, var116, var109, var112);
                        var121.method98(var119, var120, method876(var119, var120, Statics.field1899) - var112, field652 + var113);
                        field719.method3379(var121);
                    }
                }
            }
        }
    }

    @ObfuscatedName("r.br(IIIIIIIIII)V")
    public static final void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field604.method3382(); var10 != null; var10 = (class21) field604.method3388()) {
            if (var10.field338 == arg0 && var10.field344 == arg1 && var10.field334 == arg2 && var10.field332 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field338 = arg0;
            var9.field332 = arg3;
            var9.field344 = arg1;
            var9.field334 = arg2;
            method2711(var9);
            field604.method3379(var9);
        }
        var9.field336 = arg4;
        var9.field340 = arg5;
        var9.field333 = arg6;
        var9.field341 = arg7;
        var9.field342 = arg8;
    }

    @ObfuscatedName("ee.bo(Lh;I)V")
    public static final void method2711(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field332 == 0) {
            var1 = Statics.field1210.method1899(arg0.field338, arg0.field344, arg0.field334);
        }
        if (arg0.field332 == 1) {
            var1 = Statics.field1210.method2007(arg0.field338, arg0.field344, arg0.field334);
        }
        if (arg0.field332 == 2) {
            var1 = Statics.field1210.method1901(arg0.field338, arg0.field344, arg0.field334);
        }
        if (arg0.field332 == 3) {
            var1 = Statics.field1210.method1902(arg0.field338, arg0.field344, arg0.field334);
        }
        if (var1 != 0) {
            int var5 = Statics.field1210.method1966(arg0.field338, arg0.field344, arg0.field334, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field335 = var2;
        arg0.field337 = var3;
        arg0.field339 = var4;
    }

    @ObfuscatedName("ba.bb(I)V")
    public static final void method1358() {
        for (class21 var0 = (class21) field604.method3382(); var0 != null; var0 = (class21) field604.method3388()) {
            if (var0.field342 > 0) {
                var0.field342--;
            }
            if (var0.field342 == 0) {
                if (var0.field335 >= 0) {
                    int var1 = var0.field335;
                    int var2 = var0.field337;
                    class31 var3 = class31.method245(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method638(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method129(var0.field338, var0.field332, var0.field344, var0.field334, var0.field335, var0.field339, var0.field337);
                var0.method3415();
            } else {
                if (var0.field341 > 0) {
                    var0.field341--;
                }
                if (var0.field341 == 0 && var0.field344 >= 1 && var0.field334 >= 1 && var0.field344 <= 102 && var0.field334 <= 102) {
                    if (var0.field336 >= 0) {
                        int var5 = var0.field336;
                        int var6 = var0.field340;
                        class31 var7 = class31.method245(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method638(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method129(var0.field338, var0.field332, var0.field344, var0.field334, var0.field336, var0.field333, var0.field340);
                    var0.field341 = -1;
                    if (var0.field336 == var0.field335 && var0.field335 == -1) {
                        var0.method3415();
                    } else if (var0.field336 == var0.field335 && var0.field339 == var0.field333 && var0.field340 == var0.field337) {
                        var0.method3415();
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.bt(IIIIIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field471 && Statics.field1899 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1210.method1899(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1210.method2007(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1210.method1901(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1210.method1902(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1210.method1966(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1210.method1910(arg0, arg2, arg3);
                class31 var15 = class31.method245(var12);
                if (var15.field814 != 0) {
                    field526[arg0].method3264(arg2, arg3, var13, var14, var15.field815);
                }
            }
            if (arg1 == 1) {
                Statics.field1210.method1900(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1210.method1892(arg0, arg2, arg3);
                class31 var16 = class31.method245(var12);
                if (var16.field812 + arg2 > 103 || var16.field812 + arg3 > 103 || var16.field813 + arg2 > 103 || var16.field813 + arg3 > 103) {
                    return;
                }
                if (var16.field814 != 0) {
                    field526[arg0].method3265(arg2, arg3, var16.field812, var16.field813, var14, var16.field815);
                }
            }
            if (arg1 == 3) {
                Statics.field1210.method1932(arg0, arg2, arg3);
                class31 var17 = class31.method245(var12);
                if (var17.field814 == 1) {
                    field526[arg0].method3260(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field125[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class94 var19 = Statics.field1210;
        class162 var20 = field526[arg0];
        class31 var21 = class31.method245(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field813;
            var23 = var21.field812;
        } else {
            var22 = var21.field812;
            var23 = var21.field813;
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
        int[][] var28 = class9.field126[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field830 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field819 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class93 var34;
            if (var21.field820 == -1 && var21.field806 == null) {
                var34 = var21.method684(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1945(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field814 == 1) {
                var20.method3262(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var57;
            if (var21.field820 == -1 && var21.field806 == null) {
                var57 = var21.method684(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            if (var57 != null) {
                var19.method1883(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field814 != 0) {
                var20.method3281(arg2, arg3, var22, var23, var21.field815);
            }
        } else if (arg6 >= 12) {
            class93 var35;
            if (var21.field820 == -1 && var21.field806 == null) {
                var35 = var21.method684(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field814 != 0) {
                var20.method3281(arg2, arg3, var22, var23, var21.field815);
            }
        } else if (arg6 == 0) {
            class93 var36;
            if (var21.field820 == -1 && var21.field806 == null) {
                var36 = var21.method684(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method2055(arg0, arg2, arg3, var29, var36, (class93) null, class9.field129[arg5], 0, var32, var33);
            if (var21.field814 != 0) {
                var20.method3259(arg2, arg3, arg6, arg5, var21.field815);
            }
        } else if (arg6 == 1) {
            class93 var37;
            if (var21.field820 == -1 && var21.field806 == null) {
                var37 = var21.method684(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method2055(arg0, arg2, arg3, var29, var37, (class93) null, class9.field118[arg5], 0, var32, var33);
            if (var21.field814 != 0) {
                var20.method3259(arg2, arg3, arg6, arg5, var21.field815);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class93 var39;
            class93 var40;
            if (var21.field820 == -1 && var21.field806 == null) {
                var39 = var21.method684(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method684(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field820, true, (class93) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method2055(arg0, arg2, arg3, var29, var39, var40, class9.field129[arg5], class9.field129[var38], var32, var33);
            if (var21.field814 != 0) {
                var20.method3259(arg2, arg3, arg6, arg5, var21.field815);
            }
        } else if (arg6 == 3) {
            class93 var41;
            if (var21.field820 == -1 && var21.field806 == null) {
                var41 = var21.method684(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method2055(arg0, arg2, arg3, var29, var41, (class93) null, class9.field118[arg5], 0, var32, var33);
            if (var21.field814 != 0) {
                var20.method3259(arg2, arg3, arg6, arg5, var21.field815);
            }
        } else if (arg6 == 9) {
            class93 var42;
            if (var21.field820 == -1 && var21.field806 == null) {
                var42 = var21.method684(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1883(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field814 != 0) {
                var20.method3281(arg2, arg3, var22, var23, var21.field815);
            }
        } else if (arg6 == 4) {
            class93 var43;
            if (var21.field820 == -1 && var21.field806 == null) {
                var43 = var21.method684(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, var43, (class93) null, class9.field129[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1899(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class31.method245(var45 >> 14 & 0x7FFF).field821;
            }
            class93 var46;
            if (var21.field820 == -1 && var21.field806 == null) {
                var46 = var21.method684(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, var46, (class93) null, class9.field129[arg5], 0, class9.field131[arg5] * var44, class9.field132[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1899(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class31.method245(var48 >> 14 & 0x7FFF).field821 / 2;
            }
            class93 var49;
            if (var21.field820 == -1 && var21.field806 == null) {
                var49 = var21.method684(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, var49, (class93) null, 256, arg5, class9.field133[arg5] * var47, class9.field134[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class93 var51;
            if (var21.field820 == -1 && var21.field806 == null) {
                var51 = var21.method684(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, var51, (class93) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1899(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class31.method245(var53 >> 14 & 0x7FFF).field821 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class93 var55;
            class93 var56;
            if (var21.field820 == -1 && var21.field806 == null) {
                var55 = var21.method684(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method684(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field820, true, (class93) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field820, true, (class93) null);
            }
            var19.method1954(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field133[arg5] * var52, class9.field134[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bq.bw(III)V")
    public static final void method1542(int arg0, int arg1) {
        class175 var2 = field603[Statics.field1899][arg0][arg1];
        if (var2 == null) {
            Statics.field1210.method1950(Statics.field1899, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3382(); var5 != null; var5 = (class16) var2.method3388()) {
            class39 var6 = class39.method196(var5.field250);
            int var7 = var6.field987;
            if (var6.field986 == 1) {
                var7 = (var5.field243 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1210.method1950(Statics.field1899, arg0, arg1);
            return;
        }
        var2.method3384(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3382(); var10 != null; var10 = (class16) var2.method3388()) {
            if (var4.field250 != var10.field250) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field250 != var10.field250 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1210.method2034(Statics.field1899, arg0, arg1, method876(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1899), var4, var11, var8, var9);
    }

    @ObfuscatedName("p.bk(I)V")
    public static final void method61() {
        for (int var0 = 0; var0 < field624; var0++) {
            int var1 = field648[var0];
            class3 var2 = field618[var1];
            int var3 = field715.method2485();
            if ((var3 & 0x40) != 0) {
                var3 += field715.method2485() << 8;
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field715.method2485();
                int var5 = field715.method2510();
                var2.method230(var4, var5, field652);
                var2.field423 = field652 + 300;
                var2.field424 = field715.method2485();
                var2.field462 = field715.method2508();
            }
            if ((var3 & 0x2) != 0) {
                int var6 = field715.method2503();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field715.method2508();
                method57(var2, var6, var7);
            }
            if ((var3 & 0x4) != 0) {
                var2.field416 = field715.method2470();
                if (var2.field416.charAt(0) == '~') {
                    var2.field416 = var2.field416.substring(1);
                    method1380(2, var2.field36, var2.field416);
                } else if (Statics.field2611 == var2) {
                    method1380(2, var2.field36, var2.field416);
                }
                var2.field448 = 0;
                var2.field419 = 0;
                var2.field411 = 150;
            }
            if ((var3 & 0x80) != 0) {
                var2.field426 = field715.method2487();
                if (var2.field426 == 65535) {
                    var2.field426 = -1;
                }
            }
            if ((var3 & 0x400) != 0) {
                var2.field437 = field715.method2592();
                int var8 = field715.method2525();
                var2.field444 = var8 >> 16;
                var2.field440 = (var8 & 0xFFFF) + field652;
                var2.field459 = 0;
                var2.field439 = 0;
                if (var2.field440 > field652) {
                    var2.field459 = -1;
                }
                if (var2.field437 == 65535) {
                    var2.field437 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var9 = field715.method2503();
                int var10 = field715.method2485();
                int var11 = field715.method2535();
                int var12 = field715.field2016;
                if (var2.field36 != null && var2.field28 != null) {
                    boolean var13 = false;
                    if (var10 <= 1 && method877(var2.field36)) {
                        var13 = true;
                    }
                    if (!var13 && field588 == 0) {
                        field492.field2016 = 0;
                        field715.method2528(field492.field2013, 0, var11);
                        field492.field2016 = 0;
                        String var14 = class183.method3453(class146.method213(class182.method1344(field492)));
                        var2.field416 = var14.trim();
                        var2.field448 = var9 >> 8;
                        var2.field419 = var9 & 0xFF;
                        var2.field411 = 150;
                        if (var10 == 2 || var10 == 3) {
                            method1380(1, class2.method548(1) + var2.field36, var14);
                        } else if (var10 == 1) {
                            method1380(1, class2.method548(0) + var2.field36, var14);
                        } else {
                            method1380(2, var2.field36, var14);
                        }
                    }
                }
                field715.field2016 = var11 + var12;
            }
            if ((var3 & 0x20) != 0) {
                var2.field408 = field715.method2530();
                var2.field428 = field715.method2592();
            }
            if ((var3 & 0x200) != 0) {
                int var15 = field715.method2485();
                int var16 = field715.method2508();
                var2.method230(var15, var16, field652);
                var2.field423 = field652 + 300;
                var2.field424 = field715.method2485();
                var2.field462 = field715.method2510();
            }
            if ((var3 & 0x8) != 0) {
                int var17 = field715.method2535();
                byte[] var18 = new byte[var17];
                class126 var19 = new class126(var18);
                field715.method2486(var18, 0, var17);
                field594[var1] = var19;
                var2.method16(var19);
            }
            if ((var3 & 0x100) != 0) {
                var2.field442 = field715.method2485();
                var2.field404 = field715.method2508();
                var2.field443 = field715.method2510();
                var2.field458 = field715.method2485();
                var2.field446 = field715.method2592() + field652;
                var2.field447 = field715.method2487() + field652;
                var2.field403 = field715.method2535();
                var2.field450 = 1;
                var2.field415 = 0;
            }
        }
    }

    @ObfuscatedName("en.bx(B)V")
    public static final void method2810() {
        field715.method2361();
        int var0 = field715.method2377(8);
        if (var0 < field505) {
            for (int var1 = var0; var1 < field505; var1++) {
                field598[++field597 - 1] = field506[var1];
            }
        }
        if (var0 > field505) {
            throw new RuntimeException("");
        }
        field505 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field506[var2];
            class24 var4 = field504[var3];
            int var5 = field715.method2377(1);
            if (var5 == 0) {
                field506[++field505 - 1] = var3;
                var4.field449 = field652;
            } else {
                int var6 = field715.method2377(2);
                if (var6 == 0) {
                    field506[++field505 - 1] = var3;
                    var4.field449 = field652;
                    field648[++field624 - 1] = var3;
                } else if (var6 == 1) {
                    field506[++field505 - 1] = var3;
                    var4.field449 = field652;
                    int var7 = field715.method2377(3);
                    var4.method246(var7, false);
                    int var8 = field715.method2377(1);
                    if (var8 == 1) {
                        field648[++field624 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field506[++field505 - 1] = var3;
                    var4.field449 = field652;
                    int var9 = field715.method2377(3);
                    var4.method246(var9, true);
                    int var10 = field715.method2377(3);
                    var4.method246(var10, true);
                    int var11 = field715.method2377(1);
                    if (var11 == 1) {
                        field648[++field624 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field598[++field597 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("v.bf(I)V")
    public static final void method211() {
        for (int var0 = 0; var0 < field624; var0++) {
            int var1 = field648[var0];
            class24 var2 = field504[var1];
            int var3 = field715.method2485();
            if ((var3 & 0x4) != 0) {
                int var4 = field715.method2530();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field715.method2535();
                if (var2.field432 == var4 && var4 != -1) {
                    int var6 = class33.method224(var4).field876;
                    if (var6 == 1) {
                        var2.field435 = 0;
                        var2.field434 = 0;
                        var2.field418 = var5;
                        var2.field436 = 0;
                    }
                    if (var6 == 2) {
                        var2.field436 = 0;
                    }
                } else if (var4 == -1 || var2.field432 == -1 || class33.method224(var4).field875 >= class33.method224(var2.field432).field875) {
                    var2.field432 = var4;
                    var2.field435 = 0;
                    var2.field434 = 0;
                    var2.field418 = var5;
                    var2.field436 = 0;
                    var2.field415 = var2.field450;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field426 = field715.method2503();
                if (var2.field426 == 65535) {
                    var2.field426 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field437 = field715.method2530();
                int var7 = field715.method2525();
                var2.field444 = var7 >> 16;
                var2.field440 = (var7 & 0xFFFF) + field652;
                var2.field459 = 0;
                var2.field439 = 0;
                if (var2.field440 > field652) {
                    var2.field459 = -1;
                }
                if (var2.field437 == 65535) {
                    var2.field437 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field378 = class30.method763(field715.method2530());
                var2.field454 = var2.field378.field765;
                var2.field453 = var2.field378.field788;
                var2.field407 = var2.field378.field771;
                var2.field412 = var2.field378.field796;
                var2.field413 = var2.field378.field773;
                var2.field414 = var2.field378.field774;
                var2.field429 = var2.field378.field766;
                var2.field445 = var2.field378.field769;
                var2.field410 = var2.field378.field770;
            }
            if ((var3 & 0x1) != 0) {
                int var8 = field715.method2508();
                int var9 = field715.method2510();
                var2.method230(var8, var9, field652);
                var2.field423 = field652 + 300;
                var2.field424 = field715.method2485();
                var2.field462 = field715.method2485();
            }
            if ((var3 & 0x40) != 0) {
                var2.field408 = field715.method2530();
                var2.field428 = field715.method2592();
            }
            if ((var3 & 0x2) != 0) {
                var2.field416 = field715.method2470();
                var2.field411 = 100;
            }
            if ((var3 & 0x10) != 0) {
                int var10 = field715.method2485();
                int var11 = field715.method2535();
                var2.method230(var10, var11, field652);
                var2.field423 = field652 + 300;
                var2.field424 = field715.method2485();
                var2.field462 = field715.method2508();
            }
        }
    }

    @ObfuscatedName("fz.bl(I)V")
    public static final void method3305() {
        int var0 = Statics.field2048;
        int var1 = Statics.field130;
        int var2 = Statics.field856;
        int var3 = Statics.field1508;
        int var4 = 6116423;
        class88.method1842(var0, var1, var2, var3, var4);
        class88.method1842(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class88.method1800(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field2297.method3510(class133.field2064, var0 + 3, var1 + 14, var4, -1);
        int var5 = class76.field1380;
        int var6 = class76.field1384;
        for (int var7 = 0; var7 < field612; var7++) {
            int var8 = (field612 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class181 var10 = Statics.field2297;
            String var11;
            if (field502[var7].length() > 0) {
                var11 = field677[var7] + class133.field2209 + field502[var7];
            } else {
                var11 = field677[var7];
            }
            var10.method3510(var11, var0 + 3, var8, var9, 0);
        }
        method1401(Statics.field2048, Statics.field130, Statics.field856, Statics.field1508);
    }

    @ObfuscatedName("y.bv(IIIIB)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field670; var4++) {
            if (field675[var4] + field547[var4] > arg0 && field675[var4] < arg0 + arg2 && field676[var4] + field498[var4] > arg1 && field676[var4] < arg1 + arg3) {
                field472[var4] = true;
            }
        }
    }

    @ObfuscatedName("by.ba(IIIII)V")
    public static final void method1401(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field670; var4++) {
            if (field675[var4] + field547[var4] > arg0 && field675[var4] < arg0 + arg2 && field676[var4] + field498[var4] > arg1 && field676[var4] < arg1 + arg3) {
                field673[var4] = true;
            }
        }
    }

    @ObfuscatedName("j.bp(B)V")
    public static final void method27() {
        if (Statics.field1245 != null || field640 != null) {
            return;
        }
        int var0 = class76.field1387;
        if (field693) {
            if (var0 != 1) {
                int var1 = class76.field1380;
                int var2 = class76.field1384;
                if (var1 < Statics.field2048 - 10 || var1 > Statics.field856 + Statics.field2048 + 10 || var2 < Statics.field130 - 10 || var2 > Statics.field1508 + Statics.field130 + 10) {
                    field693 = false;
                    method159(Statics.field2048, Statics.field130, Statics.field856, Statics.field1508);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field2048;
                int var4 = Statics.field130;
                int var5 = Statics.field856;
                int var6 = class76.field1378;
                int var7 = class76.field1381;
                int var8 = -1;
                for (int var9 = 0; var9 < field612; var9++) {
                    int var10 = (field612 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method200(var8);
                }
                field693 = false;
                method159(Statics.field2048, Statics.field130, Statics.field856, Statics.field1508);
            }
            return;
        }
        if (var0 == 1 && field612 > 0) {
            int var11 = field615[field612 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                int var12 = field613[field612 - 1];
                int var13 = field614[field612 - 1];
                class156 var14 = class156.method2382(var13);
                if (class160.method3127(method2720(var14)) || class160.method108(method2720(var14))) {
                    field500 = false;
                    field489 = 0;
                    if (Statics.field1245 != null) {
                        method2745(Statics.field1245);
                    }
                    Statics.field1245 = class156.method2382(var13);
                    field582 = var12;
                    field583 = class76.field1378;
                    field566 = class76.field1381;
                    method2745(Statics.field1245);
                    return;
                }
            }
        }
        if (var0 == 1 && (field610 == 1 && field612 > 2 || method2160(field612 - 1))) {
            var0 = 2;
        }
        if (var0 == 1 && field612 > 0) {
            method200(field612 - 1);
        }
        if (var0 == 2 && field612 > 0) {
            method29();
        }
    }

    @ObfuscatedName("j.be(I)V")
    public static final void method29() {
        int var0 = Statics.field2297.method3497(class133.field2064);
        for (int var1 = 0; var1 < field612; var1++) {
            class181 var2 = Statics.field2297;
            String var3;
            if (field502[var1].length() > 0) {
                var3 = field677[var1] + class133.field2209 + field502[var1];
            } else {
                var3 = field677[var1];
            }
            int var4 = var2.method3497(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field612 * 15 + 21;
        int var6 = class76.field1378 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class76.field1381;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field693 = true;
        Statics.field2048 = var6;
        Statics.field130 = var7;
        Statics.field856 = var0;
        Statics.field1508 = field612 * 15 + 22;
    }

    @ObfuscatedName("cz.bs(II)Z")
    public static final boolean method2160(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field615[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("f.bh(II)V")
    public static final void method200(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field613[arg0];
        int var2 = field614[arg0];
        int var3 = field615[arg0];
        int var4 = field486[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 28) {
            field634.method2358(82);
            field634.method2475(var2);
            class156 var5 = class156.method2382(var2);
            if (var5.field2627 != null && var5.field2627[0][0] == 5) {
                int var6 = var5.field2627[0][1];
                class157.field2656[var6] = 1 - class157.field2656[var6];
                method2769(var6);
            }
        }
        if (var3 == 6) {
            method104(var1, var2, var4);
            field634.method2358(81);
            field634.method2540(Statics.field362 + var1);
            field634.method2591(Statics.field65 + var2);
            field634.method2591(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 45) {
            class3 var7 = field618[var4];
            if (var7 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var7.field405[0], var7.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(145);
                field634.method2540(var4);
            }
        }
        if (var3 == 33) {
            field634.method2358(146);
            field634.method2591(var4);
            field634.method2473(var1);
            field634.method2524(var2);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 1 && method104(var1, var2, var4)) {
            field634.method2358(41);
            field634.method2540(Statics.field362 + var1);
            field634.method2591(Statics.field65 + var2);
            field634.method2473(Statics.field370);
            field634.method2475(Statics.field257);
            field634.method2591(var4 >> 14 & 0x7FFF);
            field634.method2540(Statics.field179);
        }
        if (var3 == 24) {
            class156 var8 = class156.method2382(var2);
            boolean var9 = true;
            if (var8.field2609 > 0) {
                var9 = method223(var8);
            }
            if (var9) {
                field634.method2358(82);
                field634.method2475(var2);
            }
        }
        if (var3 == 19) {
            boolean var10 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var10) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(238);
            field634.method2591(Statics.field362 + var1);
            field634.method2540(var4);
            field634.method2473(Statics.field65 + var2);
        }
        if (var3 == 8) {
            class24 var12 = field504[var4];
            if (var12 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var12.field405[0], var12.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(28);
                field634.method2591(field626);
                field634.method2524(Statics.field100);
                field634.method2514(var4);
            }
        }
        if (var3 == 15) {
            class3 var13 = field618[var4];
            if (var13 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var13.field405[0], var13.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(73);
                field634.method2524(Statics.field100);
                field634.method2540(field626);
                field634.method2591(var4);
            }
        }
        if (var3 == 23) {
            Statics.field1210.method1947(Statics.field1899, var1, var2);
        }
        if (var3 == 51) {
            class3 var14 = field618[var4];
            if (var14 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var14.field405[0], var14.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(171);
                field634.method2540(var4);
            }
        }
        if (var3 == 20) {
            boolean var15 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var15) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(192);
            field634.method2591(Statics.field362 + var1);
            field634.method2473(Statics.field65 + var2);
            field634.method2540(var4);
        }
        if (var3 == 2 && method104(var1, var2, var4)) {
            field634.method2358(181);
            field634.method2514(Statics.field65 + var2);
            field634.method2591(Statics.field362 + var1);
            field634.method2522(Statics.field100);
            field634.method2591(field626);
            field634.method2591(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 30 && field633 == null) {
            method1645(var2, var1);
            field633 = class156.method1866(var2, var1);
            method2745(field633);
        }
        if (var3 == 26) {
            field634.method2358(3);
            for (class4 var17 = (class4) field630.method3357(); var17 != null; var17 = (class4) field630.method3372()) {
                if (var17.field49 == 0 || var17.field49 == 3) {
                    method4(var17, true);
                }
            }
            if (field633 != null) {
                method2745(field633);
                field633 = null;
            }
        }
        if (var3 == 31) {
            field634.method2358(148);
            field634.method2591(var4);
            field634.method2473(var1);
            field634.method2514(Statics.field179);
            field634.method2524(var2);
            field634.method2514(Statics.field370);
            field634.method2475(Statics.field257);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 38) {
            if (field513) {
                class156 var18 = class156.method1866(Statics.field100, field626);
                if (var18 != null && var18.field2610 != null) {
                    class1 var19 = new class1();
                    var19.field2 = var18;
                    var19.field16 = var18.field2610;
                    class25.method1222(var19);
                }
                field513 = false;
                method2745(var18);
            }
            class156 var20 = class156.method2382(var2);
            field545 = 1;
            Statics.field179 = var1;
            Statics.field257 = var2;
            Statics.field370 = var4;
            method2745(var20);
            field714 = class2.method1398(16748608) + class39.method196(var4).field975 + class2.method1398(16777215);
            if (field714 == null) {
                field714 = "null";
            }
            return;
        }
        if (var3 == 4) {
            method104(var1, var2, var4);
            field634.method2358(62);
            field634.method2540(var4 >> 14 & 0x7FFF);
            field634.method2540(Statics.field65 + var2);
            field634.method2591(Statics.field362 + var1);
        }
        if (var3 == 57 || var3 == 1007) {
            method160(var4, var2, var1, field502[arg0]);
        }
        if (var3 == 5) {
            method104(var1, var2, var4);
            field634.method2358(179);
            field634.method2591(Statics.field65 + var2);
            field634.method2591(Statics.field362 + var1);
            field634.method2473(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 58) {
            field634.method2358(186);
            field634.method2523(Statics.field100);
            field634.method2540(field626);
            field634.method2514(var1);
            field634.method2523(var2);
        }
        if (var3 == 41) {
            field634.method2358(71);
            field634.method2473(var1);
            field634.method2524(var2);
            field634.method2540(var4);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 25) {
            class156 var21 = class156.method1866(var2, var1);
            if (var21 != null) {
                method884();
                int var22 = class160.method2061(method2720(var21));
                class156 var23 = class156.method1866(var2, var1);
                if (var23 != null && var23.field2648 != null) {
                    class1 var24 = new class1();
                    var24.field2 = var23;
                    var24.field16 = var23.field2648;
                    class25.method1222(var24);
                }
                field513 = true;
                Statics.field100 = var2;
                field626 = var1;
                Statics.field1317 = var22;
                method2745(var23);
                field545 = 0;
                String var25;
                if (class160.method2061(method2720(var21)) == 0) {
                    var25 = null;
                } else if (var21.field2593 == null || var21.field2593.trim().length() == 0) {
                    var25 = null;
                } else {
                    var25 = var21.field2593;
                }
                field552 = var25;
                if (field552 == null) {
                    field552 = "Null";
                }
                if (var21.field2530) {
                    field642 = var21.field2591 + class2.method1398(16777215);
                } else {
                    field642 = class2.method1398(65280) + var21.field2639 + class2.method1398(16777215);
                }
            }
            return;
        }
        if (var3 == 12) {
            class24 var26 = field504[var4];
            if (var26 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var26.field405[0], var26.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(194);
                field634.method2540(var4);
            }
        }
        if (var3 == 37) {
            field634.method2358(229);
            field634.method2514(var1);
            field634.method2473(var4);
            field634.method2522(var2);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 46) {
            class3 var27 = field618[var4];
            if (var27 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var27.field405[0], var27.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(117);
                field634.method2540(var4);
            }
        }
        if (var3 == 44) {
            class3 var28 = field618[var4];
            if (var28 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var28.field405[0], var28.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(75);
                field634.method2540(var4);
            }
        }
        if (var3 == 42) {
            field634.method2358(50);
            field634.method2591(var1);
            field634.method2473(var4);
            field634.method2522(var2);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 1003) {
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            class24 var29 = field504[var4];
            if (var29 != null) {
                class30 var30 = var29.field378;
                if (var30.field791 != null) {
                    var30 = var30.method606();
                }
                if (var30 != null) {
                    field634.method2358(144);
                    field634.method2540(var30.field782);
                }
            }
        }
        if (var3 == 29) {
            field634.method2358(82);
            field634.method2475(var2);
            class156 var31 = class156.method2382(var2);
            if (var31.field2627 != null && var31.field2627[0][0] == 5) {
                int var32 = var31.field2627[0][1];
                if (class157.field2656[var32] != var31.field2629[0]) {
                    class157.field2656[var32] = var31.field2629[0];
                    method2769(var32);
                }
            }
        }
        if (var3 == 35) {
            field634.method2358(59);
            field634.method2514(var4);
            field634.method2524(var2);
            field634.method2514(var1);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 48) {
            class3 var33 = field618[var4];
            if (var33 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var33.field405[0], var33.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(201);
                field634.method2514(var4);
            }
        }
        if (var3 == 11) {
            class24 var34 = field504[var4];
            if (var34 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var34.field405[0], var34.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(22);
                field634.method2591(var4);
            }
        }
        if (var3 == 7) {
            class24 var35 = field504[var4];
            if (var35 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var35.field405[0], var35.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(196);
                field634.method2591(var4);
                field634.method2591(Statics.field370);
                field634.method2591(Statics.field179);
                field634.method2475(Statics.field257);
            }
        }
        if (var3 == 13) {
            class24 var36 = field504[var4];
            if (var36 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var36.field405[0], var36.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(74);
                field634.method2540(var4);
            }
        }
        if (var3 == 16) {
            boolean var37 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var37) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(157);
            field634.method2591(Statics.field370);
            field634.method2473(Statics.field179);
            field634.method2540(var4);
            field634.method2540(Statics.field65 + var2);
            field634.method2473(Statics.field362 + var1);
            field634.method2522(Statics.field257);
        }
        if (var3 == 50) {
            class3 var39 = field618[var4];
            if (var39 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var39.field405[0], var39.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(158);
                field634.method2540(var4);
            }
        }
        if (var3 == 34) {
            field634.method2358(84);
            field634.method2522(var2);
            field634.method2540(var1);
            field634.method2591(var4);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 47) {
            class3 var40 = field618[var4];
            if (var40 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var40.field405[0], var40.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(109);
                field634.method2591(var4);
            }
        }
        if (var3 == 1004) {
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(246);
            field634.method2514(var4);
        }
        if (var3 == 36) {
            field634.method2358(245);
            field634.method2475(var2);
            field634.method2591(var4);
            field634.method2514(var1);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 1005) {
            class156 var41 = class156.method2382(var2);
            if (var41 == null || var41.field2602[var1] < 100000) {
                field634.method2358(246);
                field634.method2514(var4);
            } else {
                method1380(0, "", var41.field2602[var1] + " x " + class39.method196(var4).field975);
            }
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 21) {
            boolean var42 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var42) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(131);
            field634.method2540(Statics.field362 + var1);
            field634.method2473(Statics.field65 + var2);
            field634.method2591(var4);
        }
        if (var3 == 3) {
            method104(var1, var2, var4);
            field634.method2358(212);
            field634.method2591(var4 >> 14 & 0x7FFF);
            field634.method2514(Statics.field65 + var2);
            field634.method2514(Statics.field362 + var1);
        }
        if (var3 == 49) {
            class3 var44 = field618[var4];
            if (var44 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var44.field405[0], var44.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(49);
                field634.method2540(var4);
            }
        }
        if (var3 == 1002) {
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(134);
            field634.method2591(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 17) {
            boolean var45 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var45) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(126);
            field634.method2473(Statics.field65 + var2);
            field634.method2473(Statics.field362 + var1);
            field634.method2475(Statics.field100);
            field634.method2540(var4);
            field634.method2540(field626);
        }
        if (var3 == 14) {
            class3 var47 = field618[var4];
            if (var47 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var47.field405[0], var47.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(226);
                field634.method2473(Statics.field179);
                field634.method2473(var4);
                field634.method2522(Statics.field257);
                field634.method2473(Statics.field370);
            }
        }
        if (var3 == 40) {
            field634.method2358(13);
            field634.method2522(var2);
            field634.method2473(var1);
            field634.method2591(var4);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 39) {
            field634.method2358(242);
            field634.method2514(var4);
            field634.method2540(var1);
            field634.method2523(var2);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 1001) {
            method104(var1, var2, var4);
            field634.method2358(119);
            field634.method2514(var4 >> 14 & 0x7FFF);
            field634.method2473(Statics.field65 + var2);
            field634.method2514(Statics.field362 + var1);
        }
        if (var3 == 10) {
            class24 var48 = field504[var4];
            if (var48 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var48.field405[0], var48.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(122);
                field634.method2540(var4);
            }
        }
        if (var3 == 43) {
            field634.method2358(48);
            field634.method2475(var2);
            field634.method2540(var4);
            field634.method2540(var1);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 32) {
            field634.method2358(213);
            field634.method2475(Statics.field100);
            field634.method2473(field626);
            field634.method2524(var2);
            field634.method2591(var4);
            field634.method2473(var1);
            field682 = 0;
            Statics.field1004 = class156.method2382(var2);
            field580 = var1;
        }
        if (var3 == 9) {
            class24 var49 = field504[var4];
            if (var49 != null) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var49.field405[0], var49.field456[0], false, 0, 0, 1, 1, 0, 2);
                field576 = class76.field1378;
                field577 = class76.field1381;
                field579 = 2;
                field578 = 0;
                field634.method2358(220);
                field634.method2473(var4);
            }
        }
        if (var3 == 22) {
            boolean var50 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var50) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(0);
            field634.method2514(Statics.field65 + var2);
            field634.method2514(Statics.field362 + var1);
            field634.method2591(var4);
        }
        if (var3 == 18) {
            boolean var52 = method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var52) {
                method1339(Statics.field2611.field405[0], Statics.field2611.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field576 = class76.field1378;
            field577 = class76.field1381;
            field579 = 2;
            field578 = 0;
            field634.method2358(132);
            field634.method2591(Statics.field362 + var1);
            field634.method2473(var4);
            field634.method2591(Statics.field65 + var2);
        }
        if (field545 != 0) {
            field545 = 0;
            method2745(class156.method2382(Statics.field257));
        }
        if (field513 && field513) {
            class156 var54 = class156.method1866(Statics.field100, field626);
            if (var54 != null && var54.field2610 != null) {
                class1 var55 = new class1();
                var55.field2 = var54;
                var55.field16 = var54.field2610;
                class25.method1222(var55);
            }
            field513 = false;
            method2745(var54);
        }
        if (Statics.field1004 != null && field682 == 0) {
            method2745(Statics.field1004);
        }
    }

    @ObfuscatedName("at.by(I)V")
    public static void method884() {
        if (!field513) {
            return;
        }
        class156 var0 = class156.method1866(Statics.field100, field626);
        if (var0 != null && var0.field2610 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field16 = var0.field2610;
            class25.method1222(var1);
        }
        field513 = false;
        method2745(var0);
    }

    @ObfuscatedName("ck.bz(IIB)V")
    public static void method1645(int arg0, int arg1) {
        field634.method2358(102);
        field634.method2523(arg0);
        field634.method2591(arg1);
    }

    @ObfuscatedName("y.bj(IIILjava/lang/String;I)V")
    public static void method160(int arg0, int arg1, int arg2, String arg3) {
        class156 var4 = class156.method1866(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2618 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field5 = arg0;
            var5.field9 = arg3;
            var5.field16 = var4.field2618;
            class25.method1222(var5);
        }
        boolean var6 = true;
        if (var4.field2609 > 0) {
            var6 = method223(var4);
        }
        if (!var6 || !class160.method769(method2720(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field634.method2358(88);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 2) {
            field634.method2358(162);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 3) {
            field634.method2358(9);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 4) {
            field634.method2358(83);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 5) {
            field634.method2358(130);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 6) {
            field634.method2358(187);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 7) {
            field634.method2358(12);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 8) {
            field634.method2358(180);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 9) {
            field634.method2358(66);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
        if (arg0 == 10) {
            field634.method2358(35);
            field634.method2475(arg1);
            field634.method2473(arg2);
        }
    }

    @ObfuscatedName("cr.bg(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2065(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field693 || field612 >= 500) {
            return;
        }
        field677[field612] = arg0;
        field502[field612] = arg1;
        field615[field612] = arg2;
        field486[field612] = arg3;
        field613[field612] = arg4;
        field614[field612] = arg5;
        field612++;
    }

    @ObfuscatedName("an.bq(IIIIB)V")
    public static final void method705(int arg0, int arg1, int arg2, int arg3) {
        if (field545 == 0 && !field513) {
            method2065(class133.field2073, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class111.field1884; var5++) {
            int var6 = class111.field1885[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1210.method1966(Statics.field1899, var7, var8, var6) >= 0) {
                    class31 var11 = class31.method245(var10);
                    if (var11.field806 != null) {
                        var11 = var11.method679();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field545 == 1) {
                        method2065(class133.field2114, field714 + " " + class2.field20 + " " + class2.method1398(65535) + var11.field807, 1, var6, var7, var8);
                    } else if (!field513) {
                        String[] var12 = var11.field818;
                        if (field639) {
                            var12 = method3129(var12);
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
                                    method2065(var12[var13], class2.method1398(65535) + var11.field807, var14, var6, var7, var8);
                                }
                            }
                        }
                        method2065(class133.field2178, class2.method1398(65535) + var11.field807, 1002, var11.field804 << 14, var7, var8);
                    } else if ((Statics.field1317 & 0x4) == 4) {
                        method2065(field552, field642 + " " + class2.field20 + " " + class2.method1398(65535) + var11.field807, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class24 var15 = field504[var10];
                    if (var15.field378.field765 == 1 && (var15.field441 & 0x7F) == 64 && (var15.field433 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field505; var16++) {
                            class24 var17 = field504[field506[var16]];
                            if (var17 != null && var15 != var17 && var17.field378.field765 == 1 && var15.field441 == var17.field441 && var15.field433 == var17.field433) {
                                method240(var17.field378, field506[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field590; var18++) {
                            class3 var19 = field618[field591[var18]];
                            if (var19 != null && var15.field441 == var19.field441 && var15.field433 == var19.field433) {
                                method14(var19, field591[var18], var7, var8);
                            }
                        }
                    }
                    method240(var15.field378, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field618[var10];
                    if ((var20.field441 & 0x7F) == 64 && (var20.field433 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field505; var21++) {
                            class24 var22 = field504[field506[var21]];
                            if (var22 != null && var22.field378.field765 == 1 && var20.field441 == var22.field441 && var20.field433 == var22.field433) {
                                method240(var22.field378, field506[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field590; var23++) {
                            class3 var24 = field618[field591[var23]];
                            if (var24 != null && var20 != var24 && var20.field441 == var24.field441 && var20.field433 == var24.field433) {
                                method14(var24, field591[var23], var7, var8);
                            }
                        }
                    }
                    method14(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class175 var25 = field603[Statics.field1899][var7][var8];
                    if (var25 != null) {
                        for (class16 var26 = (class16) var25.method3407(); var26 != null; var26 = (class16) var25.method3385()) {
                            class39 var27 = class39.method196(var26.field250);
                            if (field545 == 1) {
                                method2065(class133.field2114, field714 + " " + class2.field20 + " " + class2.method1398(16748608) + var27.field975, 16, var26.field250, var7, var8);
                            } else if (!field513) {
                                String[] var28 = var27.field991;
                                if (field639) {
                                    var28 = method3129(var28);
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
                                        method2065(var28[var29], class2.method1398(16748608) + var27.field975, var30, var26.field250, var7, var8);
                                    } else if (var29 == 2) {
                                        method2065(class133.field2122, class2.method1398(16748608) + var27.field975, 20, var26.field250, var7, var8);
                                    }
                                }
                                method2065(class133.field2178, class2.method1398(16748608) + var27.field975, 1004, var26.field250, var7, var8);
                            } else if ((Statics.field1317 & 0x1) == 1) {
                                method2065(field552, field642 + " " + class2.field20 + " " + class2.method1398(16748608) + var27.field975, 17, var26.field250, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.bm(Law;IIII)V")
    public static final void method240(class30 arg0, int arg1, int arg2, int arg3) {
        if (field612 >= 400) {
            return;
        }
        if (arg0.field791 != null) {
            arg0 = arg0.method606();
        }
        if (arg0 == null || !arg0.field792) {
            return;
        }
        String var4 = arg0.field764;
        if (arg0.field781 != 0) {
            var4 = var4 + method550(arg0.field781, Statics.field2611.field32) + " " + class2.field21 + class133.field2176 + arg0.field781 + class2.field22;
        }
        if (field545 == 1) {
            method2065(class133.field2114, field714 + " " + class2.field20 + " " + class2.method1398(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field513) {
            String[] var5 = arg0.field779;
            if (field639) {
                var5 = method3129(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class133.field2201)) {
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
                        method2065(var5[var6], class2.method1398(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class133.field2201)) {
                        short var9 = 0;
                        if (arg0.field781 > Statics.field2611.field32) {
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
                        method2065(var5[var8], class2.method1398(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method2065(class133.field2178, class2.method1398(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1317 & 0x2) == 2) {
            method2065(field552, field642 + " " + class2.field20 + " " + class2.method1398(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("e.bn(Ln;IIII)V")
    public static final void method14(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2611 == arg0 || field612 >= 400) {
            return;
        }
        String var4;
        if (arg0.field41 == 0) {
            var4 = arg0.field36 + method550(arg0.field32, Statics.field2611.field32) + " " + class2.field21 + class133.field2176 + arg0.field32 + class2.field22;
        } else {
            var4 = arg0.field36 + " " + class2.field21 + class133.field2093 + arg0.field41 + class2.field22;
        }
        if (field545 == 1) {
            method2065(class133.field2114, field714 + " " + class2.field20 + " " + class2.method1398(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field513) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field689[var5] != null) {
                    short var6 = 0;
                    if (field689[var5].equalsIgnoreCase(class133.field2201)) {
                        if (arg0.field32 > Statics.field2611.field32) {
                            var6 = 2000;
                        }
                        if (Statics.field2611.field33 != 0 && arg0.field33 != 0) {
                            if (Statics.field2611.field33 == arg0.field33) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field601[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field599[var5] + var6;
                    method2065(field689[var5], class2.method1398(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1317 & 0x8) == 8) {
            method2065(field552, field642 + " " + class2.field20 + " " + class2.method1398(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field612; var9++) {
            if (field615[var9] == 23) {
                field502[var9] = class2.method1398(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("al.bi(III)Ljava/lang/String;")
    public static final String method550(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1398(16711680);
        } else if (var2 < -6) {
            return class2.method1398(16723968);
        } else if (var2 < -3) {
            return class2.method1398(16740352);
        } else if (var2 < 0) {
            return class2.method1398(16756736);
        } else if (var2 > 9) {
            return class2.method1398(65280);
        } else if (var2 > 6) {
            return class2.method1398(4259584);
        } else if (var2 > 3) {
            return class2.method1398(8453888);
        } else if (var2 > 0) {
            return class2.method1398(12648192);
        } else {
            return class2.method1398(16776960);
        }
    }

    @ObfuscatedName("ez.bd(IIIIIIIII)V")
    public static final void method3085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class156.method2342(arg0)) {
            Statics.field103 = null;
            method2763(Statics.field2536[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field103 != null) {
                method2763(Statics.field103, -1412584499, arg1, arg2, arg3, arg4, Statics.field2520, Statics.field2479, arg7);
                Statics.field103 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field472[var8] = true;
            }
        } else {
            field472[arg7] = true;
        }
    }

    @ObfuscatedName("ek.cj([Lef;IIIIIIIII)V")
    public static final void method2763(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1792(arg2, arg3, arg4, arg5);
        class103.method2166();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class156 var10 = arg0[var9];
            if (var10 != null && (var10.field2542 == arg1 || arg1 == -1412584499 && field640 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field675[field670] = var10.field2643 + arg6;
                    field676[field670] = var10.field2537 + arg7;
                    field547[field670] = var10.field2540;
                    field498[field670] = var10.field2541;
                    var11 = ++field670 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2646 = var11;
                var10.field2564 = field652;
                if (!var10.field2530 || !method2721(var10)) {
                    if (var10.field2609 > 0) {
                        int var12 = var10.field2609;
                        if (var12 == 324) {
                            if (field727 == -1) {
                                field727 = var10.field2555;
                                field728 = var10.field2579;
                            }
                            if (field726.field2674) {
                                var10.field2555 = field727;
                            } else {
                                var10.field2555 = field728;
                            }
                        } else if (var12 == 325) {
                            if (field727 == -1) {
                                field727 = var10.field2555;
                                field728 = var10.field2579;
                            }
                            if (field726.field2674) {
                                var10.field2555 = field728;
                            } else {
                                var10.field2555 = field727;
                            }
                        } else if (var12 == 327) {
                            var10.field2571 = 150;
                            var10.field2521 = (int) (Math.sin((double) field652 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2563 = 5;
                            var10.field2605 = 0;
                        } else if (var12 == 328) {
                            var10.field2571 = 150;
                            var10.field2521 = (int) (Math.sin((double) field652 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2563 = 5;
                            var10.field2605 = 1;
                        }
                    }
                    int var13 = var10.field2643 + arg6;
                    int var14 = var10.field2537 + arg7;
                    int var15 = var10.field2553;
                    if (field640 == var10) {
                        if (arg1 != -1412584499 && !var10.field2596) {
                            Statics.field103 = arg0;
                            Statics.field2520 = arg6;
                            Statics.field2479 = arg7;
                            continue;
                        }
                        if (field651 && field522) {
                            int var16 = class76.field1380;
                            int var17 = class76.field1384;
                            int var18 = var16 - field645;
                            int var19 = var17 - field643;
                            if (var18 < field646) {
                                var18 = field646;
                            }
                            if (var10.field2540 + var18 > field646 + field641.field2540) {
                                var18 = field646 + field641.field2540 - var10.field2540;
                            }
                            if (var19 < field647) {
                                var19 = field647;
                            }
                            if (var10.field2541 + var19 > field647 + field641.field2541) {
                                var19 = field647 + field641.field2541 - var10.field2541;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2596) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2533 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2533 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2540 + var13;
                        int var27 = var10.field2541 + var14;
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
                        int var30 = var10.field2540 + var13;
                        int var31 = var10.field2541 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2530 || var20 < var22 && var21 < var23) {
                        if (var10.field2609 != 0) {
                            if (var10.field2609 == 1337) {
                                field619 = var13;
                                field620 = var14;
                                method2350(var13, var14, var10.field2540, var10.field2541);
                                class88.method1792(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2609 == 1338) {
                                method546(var13, var14, var11);
                                class88.method1792(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var32 = class76.field1380;
                        int var33 = class76.field1384;
                        if (!field693 && var32 >= var20 && var33 >= var21 && var32 < var22 && var33 < var23) {
                            int var34 = var32 - var13;
                            int var35 = var33 - var14;
                            if (var10.field2632 == 1) {
                                method2065(var10.field2633, "", 24, 0, 0, var10.field2531);
                            }
                            if (var10.field2632 == 2 && !field513) {
                                String var36;
                                if (class160.method2061(method2720(var10)) == 0) {
                                    var36 = null;
                                } else if (var10.field2593 == null || var10.field2593.trim().length() == 0) {
                                    var36 = null;
                                } else {
                                    var36 = var10.field2593;
                                }
                                if (var36 != null) {
                                    method2065(var36, class2.method1398(65280) + var10.field2639, 25, 0, -1, var10.field2531);
                                }
                            }
                            if (var10.field2632 == 3) {
                                method2065(class133.field2208, "", 26, 0, 0, var10.field2531);
                            }
                            if (var10.field2632 == 4) {
                                method2065(var10.field2633, "", 28, 0, 0, var10.field2531);
                            }
                            if (var10.field2632 == 5) {
                                method2065(var10.field2633, "", 29, 0, 0, var10.field2531);
                            }
                            if (var10.field2632 == 6 && field633 == null) {
                                method2065(var10.field2633, "", 30, 0, -1, var10.field2531);
                            }
                            if (var10.field2533 == 2) {
                                int var38 = 0;
                                for (int var39 = 0; var39 < var10.field2541; var39++) {
                                    for (int var40 = 0; var40 < var10.field2540; var40++) {
                                        int var41 = (var10.field2584 + 32) * var40;
                                        int var42 = (var10.field2572 + 32) * var39;
                                        if (var38 < 20) {
                                            var41 += var10.field2522[var38];
                                            var42 += var10.field2587[var38];
                                        }
                                        if (var34 >= var41 && var35 >= var42 && var34 < var41 + 32 && var35 < var42 + 32) {
                                            field585 = var38;
                                            Statics.field238 = var10;
                                            if (var10.field2561[var38] > 0) {
                                                class39 var43 = class39.method196(var10.field2561[var38] - 1);
                                                if (field545 == 1 && class160.method1179(method2720(var10))) {
                                                    if (Statics.field257 != var10.field2531 || Statics.field179 != var38) {
                                                        method2065(class133.field2114, field714 + " " + class2.field20 + " " + class2.method1398(16748608) + var43.field975, 31, var43.field973, var38, var10.field2531);
                                                    }
                                                } else if (!field513 || !class160.method1179(method2720(var10))) {
                                                    String[] var44 = var43.field990;
                                                    if (field639) {
                                                        var44 = method3129(var44);
                                                    }
                                                    if (class160.method1179(method2720(var10))) {
                                                        for (int var45 = 4; var45 >= 3; var45--) {
                                                            if (var44 != null && var44[var45] != null) {
                                                                byte var46;
                                                                if (var45 == 3) {
                                                                    var46 = 36;
                                                                } else {
                                                                    var46 = 37;
                                                                }
                                                                method2065(var44[var45], class2.method1398(16748608) + var43.field975, var46, var43.field973, var38, var10.field2531);
                                                            } else if (var45 == 4) {
                                                                method2065(class133.field2060, class2.method1398(16748608) + var43.field975, 37, var43.field973, var38, var10.field2531);
                                                            }
                                                        }
                                                    }
                                                    if (class160.method2891(method2720(var10))) {
                                                        method2065(class133.field2114, class2.method1398(16748608) + var43.field975, 38, var43.field973, var38, var10.field2531);
                                                    }
                                                    if (class160.method1179(method2720(var10)) && var44 != null) {
                                                        for (int var47 = 2; var47 >= 0; var47--) {
                                                            if (var44[var47] != null) {
                                                                byte var48 = 0;
                                                                if (var47 == 0) {
                                                                    var48 = 33;
                                                                }
                                                                if (var47 == 1) {
                                                                    var48 = 34;
                                                                }
                                                                if (var47 == 2) {
                                                                    var48 = 35;
                                                                }
                                                                method2065(var44[var47], class2.method1398(16748608) + var43.field975, var48, var43.field973, var38, var10.field2531);
                                                            }
                                                        }
                                                    }
                                                    String[] var49 = var10.field2589;
                                                    if (field639) {
                                                        var49 = method3129(var49);
                                                    }
                                                    if (var49 != null) {
                                                        for (int var50 = 4; var50 >= 0; var50--) {
                                                            if (var49[var50] != null) {
                                                                byte var51 = 0;
                                                                if (var50 == 0) {
                                                                    var51 = 39;
                                                                }
                                                                if (var50 == 1) {
                                                                    var51 = 40;
                                                                }
                                                                if (var50 == 2) {
                                                                    var51 = 41;
                                                                }
                                                                if (var50 == 3) {
                                                                    var51 = 42;
                                                                }
                                                                if (var50 == 4) {
                                                                    var51 = 43;
                                                                }
                                                                method2065(var49[var50], class2.method1398(16748608) + var43.field975, var51, var43.field973, var38, var10.field2531);
                                                            }
                                                        }
                                                    }
                                                    method2065(class133.field2178, class2.method1398(16748608) + var43.field975, 1005, var43.field973, var38, var10.field2531);
                                                } else if ((Statics.field1317 & 0x10) == 16) {
                                                    method2065(field552, field642 + " " + class2.field20 + " " + class2.method1398(16748608) + var43.field975, 32, var43.field973, var38, var10.field2531);
                                                }
                                            }
                                        }
                                        var38++;
                                    }
                                }
                            }
                            if (var10.field2530) {
                                if (field513) {
                                    int var52 = method2720(var10);
                                    boolean var53 = (var52 >> 21 & 0x1) != 0;
                                    if (var53 && (Statics.field1317 & 0x20) == 32) {
                                        method2065(field552, field642 + " " + class2.field20 + " " + var10.field2591, 58, 0, var10.field2532, var10.field2531);
                                    }
                                } else {
                                    for (int var54 = 9; var54 >= 5; var54--) {
                                        String var55;
                                        if (!class160.method769(method2720(var10), var54) && var10.field2618 == null) {
                                            var55 = null;
                                        } else if (var10.field2592 == null || var10.field2592.length <= var54 || var10.field2592[var54] == null || var10.field2592[var54].trim().length() == 0) {
                                            var55 = null;
                                        } else {
                                            var55 = var10.field2592[var54];
                                        }
                                        if (var55 != null) {
                                            method2065(var55, var10.field2591, 1007, var54 + 1, var10.field2532, var10.field2531);
                                        }
                                    }
                                    String var57;
                                    if (class160.method2061(method2720(var10)) == 0) {
                                        var57 = null;
                                    } else if (var10.field2593 == null || var10.field2593.trim().length() == 0) {
                                        var57 = null;
                                    } else {
                                        var57 = var10.field2593;
                                    }
                                    if (var57 != null) {
                                        method2065(var57, var10.field2591, 25, 0, var10.field2532, var10.field2531);
                                    }
                                    for (int var59 = 4; var59 >= 0; var59--) {
                                        String var60;
                                        if (!class160.method769(method2720(var10), var59) && var10.field2618 == null) {
                                            var60 = null;
                                        } else if (var10.field2592 == null || var10.field2592.length <= var59 || var10.field2592[var59] == null || var10.field2592[var59].trim().length() == 0) {
                                            var60 = null;
                                        } else {
                                            var60 = var10.field2592[var59];
                                        }
                                        if (var60 != null) {
                                            method2065(var60, var10.field2591, 57, var59 + 1, var10.field2532, var10.field2531);
                                        }
                                    }
                                    int var62 = method2720(var10);
                                    boolean var63 = (var62 & 0x1) != 0;
                                    if (var63) {
                                        method2065(class133.field2235, "", 30, 0, var10.field2532, var10.field2531);
                                    }
                                }
                            }
                        }
                        if (var10.field2533 == 0) {
                            if (!var10.field2530 && method2721(var10) && Statics.field461 != var10) {
                                continue;
                            }
                            if (!var10.field2530) {
                                if (var10.field2545 > var10.field2547 - var10.field2541) {
                                    var10.field2545 = var10.field2547 - var10.field2541;
                                }
                                if (var10.field2545 < 0) {
                                    var10.field2545 = 0;
                                }
                            }
                            method2763(arg0, var10.field2531, var20, var21, var22, var23, var13 - var10.field2544, var14 - var10.field2545, var11);
                            if (var10.field2558 != null) {
                                method2763(var10.field2558, var10.field2531, var20, var21, var22, var23, var13 - var10.field2544, var14 - var10.field2545, var11);
                            }
                            class4 var64 = (class4) field630.method3354((long) var10.field2531);
                            if (var64 != null) {
                                if (var64.field49 == 0 && class76.field1380 >= var20 && class76.field1384 >= var21 && class76.field1380 < var22 && class76.field1384 < var23 && !field693 && !field638) {
                                    field677[0] = class133.field2272;
                                    field502[0] = "";
                                    field615[0] = 1006;
                                    field612 = 1;
                                }
                                method3085(var64.field54, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class88.method1792(arg2, arg3, arg4, arg5);
                            class103.method2166();
                        }
                        if (field656[var11] || field679 > 1) {
                            if (var10.field2533 == 0 && !var10.field2530 && var10.field2547 > var10.field2541) {
                                int var65 = var10.field2540 + var13;
                                int var66 = var10.field2545;
                                int var67 = var10.field2541;
                                int var68 = var10.field2547;
                                Statics.field343[0].method1782(var65, var14);
                                Statics.field343[1].method1782(var65, var14 + var67 - 16);
                                class88.method1842(var65, var14 + 16, 16, var67 - 32, field549);
                                int var69 = (var67 - 32) * var67 / var68;
                                if (var69 < 8) {
                                    var69 = 8;
                                }
                                int var70 = (var67 - 32 - var69) * var66 / (var68 - var67);
                                class88.method1842(var65, var14 + 16 + var70, 16, var69, field550);
                                class88.method1804(var65, var14 + 16 + var70, var69, field706);
                                class88.method1804(var65 + 1, var14 + 16 + var70, var69, field706);
                                class88.method1826(var65, var14 + 16 + var70, 16, field706);
                                class88.method1826(var65, var14 + 17 + var70, 16, field706);
                                class88.method1804(var65 + 15, var14 + 16 + var70, var69, field551);
                                class88.method1804(var65 + 14, var14 + 17 + var70, var69 - 1, field551);
                                class88.method1826(var65, var14 + 15 + var70 + var69, 16, field551);
                                class88.method1826(var65 + 1, var14 + 14 + var70 + var69, 15, field551);
                            }
                            if (var10.field2533 != 1) {
                                if (var10.field2533 == 2) {
                                    int var71 = 0;
                                    for (int var72 = 0; var72 < var10.field2541; var72++) {
                                        for (int var73 = 0; var73 < var10.field2540; var73++) {
                                            int var74 = (var10.field2584 + 32) * var73 + var13;
                                            int var75 = (var10.field2572 + 32) * var72 + var14;
                                            if (var71 < 20) {
                                                var74 += var10.field2522[var71];
                                                var75 += var10.field2587[var71];
                                            }
                                            if (var10.field2561[var71] > 0) {
                                                boolean var76 = false;
                                                boolean var77 = false;
                                                int var78 = var10.field2561[var71] - 1;
                                                if (var74 + 32 > arg2 && var74 < arg4 && var75 + 32 > arg3 && var75 < arg5 || Statics.field1245 == var10 && field582 == var71) {
                                                    class85 var79;
                                                    if (field545 == 1 && Statics.field179 == var71 && Statics.field257 == var10.field2531) {
                                                        var79 = class39.method531(var78, var10.field2602[var71], 2, 0, false);
                                                    } else {
                                                        var79 = class39.method531(var78, var10.field2602[var71], 1, 3153952, false);
                                                    }
                                                    if (var79 == null) {
                                                        method2745(var10);
                                                    } else if (Statics.field1245 == var10 && field582 == var71) {
                                                        int var80 = class76.field1380 - field583;
                                                        int var81 = class76.field1384 - field566;
                                                        if (var80 < 5 && var80 > -5) {
                                                            var80 = 0;
                                                        }
                                                        if (var81 < 5 && var81 > -5) {
                                                            var81 = 0;
                                                        }
                                                        if (field489 < 5) {
                                                            var80 = 0;
                                                            var81 = 0;
                                                        }
                                                        var79.method1760(var74 + var80, var75 + var81, 128);
                                                        if (arg1 != -1) {
                                                            class156 var82 = arg0[arg1 & 0xFFFF];
                                                            if (var75 + var81 < class88.field1478 && var82.field2545 > 0) {
                                                                int var83 = field637 * (class88.field1478 - var75 - var81) / 3;
                                                                if (var83 > field637 * 10) {
                                                                    var83 = field637 * 10;
                                                                }
                                                                if (var83 > var82.field2545) {
                                                                    var83 = var82.field2545;
                                                                }
                                                                var82.field2545 -= var83;
                                                                field566 += var83;
                                                                method2745(var82);
                                                            }
                                                            if (var75 + var81 + 32 > class88.field1479 && var82.field2545 < var82.field2547 - var82.field2541) {
                                                                int var84 = field637 * (var75 + var81 + 32 - class88.field1479) / 3;
                                                                if (var84 > field637 * 10) {
                                                                    var84 = field637 * 10;
                                                                }
                                                                if (var84 > var82.field2547 - var82.field2541 - var82.field2545) {
                                                                    var84 = var82.field2547 - var82.field2541 - var82.field2545;
                                                                }
                                                                var82.field2545 += var84;
                                                                field566 -= var84;
                                                                method2745(var82);
                                                            }
                                                        }
                                                    } else if (Statics.field1004 == var10 && field580 == var71) {
                                                        var79.method1760(var74, var75, 128);
                                                    } else {
                                                        var79.method1702(var74, var75);
                                                    }
                                                }
                                            } else if (var10.field2588 != null && var71 < 20) {
                                                class85 var85 = var10.method3137(var71);
                                                if (var85 != null) {
                                                    var85.method1702(var74, var75);
                                                } else if (class156.field2556) {
                                                    method2745(var10);
                                                }
                                            }
                                            var71++;
                                        }
                                    }
                                } else if (var10.field2533 == 3) {
                                    int var86;
                                    if (method52(var10)) {
                                        var86 = var10.field2549;
                                        if (Statics.field461 == var10 && var10.field2551 != 0) {
                                            var86 = var10.field2551;
                                        }
                                    } else {
                                        var86 = var10.field2548;
                                        if (Statics.field461 == var10 && var10.field2567 != 0) {
                                            var86 = var10.field2567;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2552) {
                                            class88.method1842(var13, var14, var10.field2540, var10.field2541, var86);
                                        } else {
                                            class88.method1800(var13, var14, var10.field2540, var10.field2541, var86);
                                        }
                                    } else if (var10.field2552) {
                                        class88.method1797(var13, var14, var10.field2540, var10.field2541, var86, 256 - (var15 & 0xFF));
                                    } else {
                                        class88.method1799(var13, var14, var10.field2540, var10.field2541, var86, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2533 == 4) {
                                    class181 var87 = var10.method3143();
                                    if (var87 != null) {
                                        String var88 = var10.field2621;
                                        int var89;
                                        if (method52(var10)) {
                                            var89 = var10.field2549;
                                            if (Statics.field461 == var10 && var10.field2551 != 0) {
                                                var89 = var10.field2551;
                                            }
                                            if (var10.field2601.length() > 0) {
                                                var88 = var10.field2601;
                                            }
                                        } else {
                                            var89 = var10.field2548;
                                            if (Statics.field461 == var10 && var10.field2567 != 0) {
                                                var89 = var10.field2567;
                                            }
                                        }
                                        if (var10.field2530 && var10.field2635 != -1) {
                                            class39 var90 = class39.method196(var10.field2635);
                                            var88 = var90.field975;
                                            if (var88 == null) {
                                                var88 = "null";
                                            }
                                            if ((var90.field986 == 1 || var10.field2638 != 1) && var10.field2638 != -1) {
                                                var88 = class2.method1398(16748608) + var88 + class2.field24 + " " + 'x' + method1404(var10.field2638);
                                            }
                                        }
                                        if (field633 == var10) {
                                            class133 var10000 = (class133) null;
                                            var88 = class133.field2207;
                                            var89 = var10.field2548;
                                        }
                                        if (!var10.field2530) {
                                            var88 = method2973(var88, var10);
                                        }
                                        var87.method3457(var88, var13, var14, var10.field2540, var10.field2541, var89, var10.field2583 ? 0 : -1, var10.field2581, var10.field2582, var10.field2580);
                                    } else if (class156.field2556) {
                                        method2745(var10);
                                    }
                                } else if (var10.field2533 == 5) {
                                    if (var10.field2530) {
                                        class85 var92;
                                        if (var10.field2635 == -1) {
                                            var92 = var10.method3158(false);
                                        } else {
                                            var92 = class39.method531(var10.field2635, var10.field2638, var10.field2559, var10.field2560, false);
                                        }
                                        if (var92 != null) {
                                            int var93 = var92.field1461;
                                            int var94 = var92.field1460;
                                            if (var10.field2535) {
                                                class88.method1793(var13, var14, var10.field2540 + var13, var10.field2541 + var14);
                                                int var95 = (var10.field2540 + (var93 - 1)) / var93;
                                                int var96 = (var10.field2541 + (var94 - 1)) / var94;
                                                for (int var97 = 0; var97 < var95; var97++) {
                                                    for (int var98 = 0; var98 < var96; var98++) {
                                                        if (var10.field2557 != 0) {
                                                            var92.method1731(var93 / 2 + var93 * var97 + var13, var94 / 2 + var94 * var98 + var14, var10.field2557, 4096);
                                                        } else if (var15 == 0) {
                                                            var92.method1702(var93 * var97 + var13, var94 * var98 + var14);
                                                        } else {
                                                            var92.method1760(var93 * var97 + var13, var94 * var98 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1792(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var99 = var10.field2540 * 4096 / var93;
                                                if (var10.field2557 != 0) {
                                                    var92.method1731(var10.field2540 / 2 + var13, var10.field2541 / 2 + var14, var10.field2557, var99);
                                                } else if (var15 != 0) {
                                                    var92.method1710(var13, var14, var10.field2540, var10.field2541, 256 - (var15 & 0xFF));
                                                } else if (var10.field2540 == var93 && var10.field2541 == var94) {
                                                    var92.method1702(var13, var14);
                                                } else {
                                                    var92.method1704(var13, var14, var10.field2540, var10.field2541);
                                                }
                                            }
                                        } else if (class156.field2556) {
                                            method2745(var10);
                                        }
                                    } else {
                                        class85 var91 = var10.method3158(method52(var10));
                                        if (var91 != null) {
                                            var91.method1702(var13, var14);
                                        } else if (class156.field2556) {
                                            method2745(var10);
                                        }
                                    }
                                } else if (var10.field2533 == 6) {
                                    boolean var100 = method52(var10);
                                    int var101;
                                    if (var100) {
                                        var101 = var10.field2568;
                                    } else {
                                        var101 = var10.field2585;
                                    }
                                    class111 var102 = null;
                                    int var103 = 0;
                                    if (var10.field2635 != -1) {
                                        class39 var104 = class39.method196(var10.field2635);
                                        if (var104 != null) {
                                            class39 var105 = var104.method844(var10.field2638);
                                            var102 = var105.method855(1);
                                            if (var102 == null) {
                                                method2745(var10);
                                            } else {
                                                var102.method2267();
                                                var103 = var102.field1534 / 2;
                                            }
                                        }
                                    } else if (var10.field2563 == 5) {
                                        if (var10.field2605 == 0) {
                                            var102 = field726.method3235((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var102 = Statics.field2611.method19();
                                        }
                                    } else if (var101 == -1) {
                                        var102 = var10.method3180((class33) null, -1, var100, Statics.field2611.field28);
                                        if (var102 == null && class156.field2556) {
                                            method2745(var10);
                                        }
                                    } else {
                                        class33 var106 = class33.method224(var101);
                                        var102 = var10.method3180(var106, var10.field2578, var100, Statics.field2611.field28);
                                        if (var102 == null && class156.field2556) {
                                            method2745(var10);
                                        }
                                    }
                                    class103.method2211(var10.field2540 / 2 + var13, var10.field2541 / 2 + var14);
                                    int var107 = var10.field2574 * class103.field1756[var10.field2571] >> 16;
                                    int var108 = var10.field2574 * class103.field1757[var10.field2571] >> 16;
                                    if (var102 != null) {
                                        if (var10.field2530) {
                                            var102.method2267();
                                            if (var10.field2576) {
                                                var102.method2280(0, var10.field2521, var10.field2527, var10.field2571, var10.field2569, var10.field2570 + var103 + var107, var10.field2570 + var108, var10.field2574);
                                            } else {
                                                var102.method2279(0, var10.field2521, var10.field2527, var10.field2571, var10.field2569, var10.field2570 + var103 + var107, var10.field2570 + var108);
                                            }
                                        } else {
                                            var102.method2279(0, var10.field2521, 0, var10.field2571, 0, var107, var108);
                                        }
                                    }
                                    class103.method2221();
                                } else {
                                    if (var10.field2533 == 7) {
                                        class181 var109 = var10.method3143();
                                        if (var109 == null) {
                                            if (class156.field2556) {
                                                method2745(var10);
                                            }
                                            continue;
                                        }
                                        int var110 = 0;
                                        for (int var111 = 0; var111 < var10.field2541; var111++) {
                                            for (int var112 = 0; var112 < var10.field2540; var112++) {
                                                if (var10.field2561[var110] > 0) {
                                                    class39 var113 = class39.method196(var10.field2561[var110] - 1);
                                                    String var114;
                                                    if (var113.field986 != 1 && var10.field2602[var110] == 1) {
                                                        var114 = class2.method1398(16748608) + var113.field975 + class2.field24;
                                                    } else {
                                                        var114 = class2.method1398(16748608) + var113.field975 + class2.field24 + " " + 'x' + method1404(var10.field2602[var110]);
                                                    }
                                                    int var115 = (var10.field2584 + 115) * var112 + var13;
                                                    int var116 = (var10.field2572 + 12) * var111 + var14;
                                                    if (var10.field2581 == 0) {
                                                        var109.method3510(var114, var115, var116, var10.field2548, var10.field2583 ? 0 : -1);
                                                    } else if (var10.field2581 == 1) {
                                                        var109.method3445(var114, var10.field2540 / 2 + var115, var116, var10.field2548, var10.field2583 ? 0 : -1);
                                                    } else {
                                                        var109.method3455(var114, var10.field2540 + var115 - 1, var116, var10.field2548, var10.field2583 ? 0 : -1);
                                                    }
                                                }
                                                var110++;
                                            }
                                        }
                                    }
                                    if (var10.field2533 == 8 && Statics.field300 == var10 && field622 == field621) {
                                        int var117 = 0;
                                        int var118 = 0;
                                        class181 var119 = Statics.field285;
                                        String var120 = var10.field2621;
                                        String var121 = method2973(var120, var10);
                                        while (var121.length() > 0) {
                                            int var122 = var121.indexOf(class2.field23);
                                            String var123;
                                            if (var122 == -1) {
                                                var123 = var121;
                                                var121 = "";
                                            } else {
                                                var123 = var121.substring(0, var122);
                                                var121 = var121.substring(var122 + 4);
                                            }
                                            int var124 = var119.method3497(var123);
                                            if (var124 > var117) {
                                                var117 = var124;
                                            }
                                            var118 += var119.field2783 + 1;
                                        }
                                        var117 += 6;
                                        var118 += 7;
                                        int var125 = var10.field2540 + var13 - 5 - var117;
                                        int var126 = var10.field2541 + var14 + 5;
                                        if (var125 < var13 + 5) {
                                            var125 = var13 + 5;
                                        }
                                        if (var117 + var125 > arg4) {
                                            var125 = arg4 - var117;
                                        }
                                        if (var118 + var126 > arg5) {
                                            var126 = arg5 - var118;
                                        }
                                        class88.method1842(var125, var126, var117, var118, 16777120);
                                        class88.method1800(var125, var126, var117, var118, 0);
                                        String var127 = var10.field2621;
                                        int var128 = var119.field2783 + var126 + 2;
                                        String var129 = method2973(var127, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class2.field23);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            var119.method3510(var131, var125 + 3, var128, 0, -1);
                                            var128 += var119.field2783 + 1;
                                        }
                                    }
                                    if (var10.field2533 == 9) {
                                        if (var10.field2534 == 1) {
                                            class88.method1806(var13, var14, var10.field2540 + var13, var10.field2541 + var14, var10.field2548);
                                        } else {
                                            int var132 = var10.field2540 >= 0 ? var10.field2540 : -var10.field2540;
                                            int var133 = var10.field2541 >= 0 ? var10.field2541 : -var10.field2541;
                                            int var134 = var132;
                                            if (var132 < var133) {
                                                var134 = var133;
                                            }
                                            if (var134 != 0) {
                                                int var135 = (var10.field2540 << 16) / var134;
                                                int var136 = (var10.field2541 << 16) / var134;
                                                if (var136 <= var135) {
                                                    var135 = -var135;
                                                } else {
                                                    var136 = -var136;
                                                }
                                                int var137 = var10.field2534 * var136 >> 17;
                                                int var138 = var10.field2534 * var136 + 1 >> 17;
                                                int var139 = var10.field2534 * var135 >> 17;
                                                int var140 = var10.field2534 * var135 + 1 >> 17;
                                                int var141 = var13 + var137;
                                                int var142 = var13 - var138;
                                                int var143 = var10.field2540 + var13 - var138;
                                                int var144 = var10.field2540 + var13 + var137;
                                                int var145 = var14 + var139;
                                                int var146 = var14 - var140;
                                                int var147 = var10.field2541 + var14 - var140;
                                                int var148 = var10.field2541 + var14 + var139;
                                                class103.method2170(var141, var142, var143);
                                                class103.method2199(var145, var146, var147, var141, var142, var143, var10.field2548);
                                                class103.method2170(var141, var143, var144);
                                                class103.method2199(var145, var147, var148, var141, var143, var144, var10.field2548);
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

    @ObfuscatedName("eg.cb(Ljava/lang/String;Lef;I)Ljava/lang/String;")
    public static String method2973(String arg0, class156 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method127(arg1, var2 - 1);
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
                if (Statics.field937 != null) {
                    var8 = class146.method1413(Statics.field937.field1400);
                    if (Statics.field937.field1402 != null) {
                        var8 = (String) Statics.field937.field1402;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("by.cx(IB)Ljava/lang/String;")
    public static final String method1404(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1398(65408) + var1.substring(0, var1.length() - 8) + class133.field2269 + " " + class2.field21 + var1 + class2.field22 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method1398(16777215) + var1.substring(0, var1.length() - 4) + class133.field2212 + " " + class2.field21 + var1 + class2.field22 + class2.field24;
        } else {
            return " " + class2.method1398(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("bc.ck(Lef;IIIIIIB)V")
    public static final void method1221(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field553) {
            field554 = 32;
        } else {
            field554 = 0;
        }
        field553 = false;
        if (class76.field1379 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2545 -= 4;
                method2745(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2545 += 4;
                method2745(arg0);
            } else if (arg5 >= arg1 - field554 && arg5 < field554 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2545 = (arg4 - arg3) * var8 / var9;
                method2745(arg0);
                field553 = true;
            }
        }
        if (field665 == 0) {
            return;
        }
        int var10 = arg0.field2540;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2545 += field665 * 45;
            method2745(arg0);
        }
    }

    @ObfuscatedName("l.ci(Lef;I)Z")
    public static final boolean method52(class156 arg0) {
        if (arg0.field2634 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2634.length; var1++) {
            int var2 = method127(arg0, var1);
            int var3 = arg0.field2629[var1];
            if (arg0.field2634[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2634[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2634[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("s.cw(Lef;II)I")
    public static final int method127(class156 arg0, int arg1) {
        if (arg0.field2627 == null || arg1 >= arg0.field2627.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2627[arg1];
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
                    var7 = field655[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field574[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field609[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class156 var11 = class156.method2382(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method196(var12).field993 || field470)) {
                        for (int var13 = 0; var13 < var11.field2561.length; var13++) {
                            if (var12 + 1 == var11.field2561[var13]) {
                                var7 += var11.field2602[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2656[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2023[field574[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2656[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2611.field32;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2022[var14]) {
                            var7 += field574[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class156 var17 = class156.method2382(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method196(var18).field993 || field470)) {
                        for (int var19 = 0; var19 < var17.field2561.length; var19++) {
                            if (var18 + 1 == var17.field2561[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field511;
                }
                if (var6 == 12) {
                    var7 = field635;
                }
                if (var6 == 13) {
                    int var20 = class157.field2656[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method1589(var22);
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
                    var7 = (Statics.field2611.field441 >> 7) + Statics.field362;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2611.field433 >> 7) + Statics.field65;
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

    @ObfuscatedName("v.cf([Lef;IIIIIIIB)V")
    public static final void method204(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class156 var9 = arg0[var8];
            if (var9 != null && (!var9.field2530 || var9.field2533 == 0 || var9.field2598 || method2720(var9) != 0 || field641 == var9) && var9.field2542 == arg1 && (!var9.field2530 || !method2721(var9))) {
                int var10 = var9.field2643 + arg6;
                int var11 = var9.field2537 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2533 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2533 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2540 + var10;
                    int var19 = var9.field2541 + var11;
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
                    int var22 = var9.field2540 + var10;
                    int var23 = var9.field2541 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field640 == var9) {
                    field581 = true;
                    field649 = var10;
                    field650 = var11;
                }
                if (!var9.field2530 || var12 < var14 && var13 < var15) {
                    if (var9.field2609 == 1337) {
                        method2745(var9);
                    } else if (var9.field2609 == 1338) {
                        Statics.method231(var10, var11);
                    } else {
                        if (var9.field2533 == 0) {
                            if (!var9.field2530 && method2721(var9) && Statics.field461 != var9) {
                                continue;
                            }
                            method204(arg0, var9.field2531, var12, var13, var14, var15, var10 - var9.field2544, var11 - var9.field2545);
                            if (var9.field2558 != null) {
                                method204(var9.field2558, var9.field2531, var12, var13, var14, var15, var10 - var9.field2544, var11 - var9.field2545);
                            }
                            class4 var24 = (class4) field630.method3354((long) var9.field2531);
                            if (var24 != null) {
                                int var25 = var24.field54;
                                if (class156.method2342(var25)) {
                                    method204(Statics.field2536[var25], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2530) {
                            boolean var26;
                            if (class76.field1380 >= var12 && class76.field1384 >= var13 && class76.field1380 < var14 && class76.field1384 < var15) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class76.field1379 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class76.field1387 == 1 && class76.field1378 >= var12 && class76.field1381 >= var13 && class76.field1378 < var14 && class76.field1381 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                int var29 = class76.field1378 - var10;
                                int var30 = class76.field1381 - var11;
                                if (field640 == null && !field693 && var9 != null && Statics.method107(var9) != null) {
                                    field640 = var9;
                                    field641 = Statics.method107(var9);
                                    field645 = var29;
                                    field643 = var30;
                                    Statics.field729 = 0;
                                    field651 = false;
                                }
                            }
                            if (field640 != null && field640 != var9 && var26) {
                                int var31 = method2720(var9);
                                boolean var32 = (var31 >> 20 & 0x1) != 0;
                                if (var32) {
                                    field644 = var9;
                                }
                            }
                            if (field641 == var9) {
                                field522 = true;
                                field646 = var10;
                                field647 = var11;
                            }
                            if (var9.field2598) {
                                if (var26 && field665 != 0 && var9.field2619 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = var9;
                                    var33.field8 = field665;
                                    var33.field16 = var9.field2619;
                                    field666.method3379(var33);
                                }
                                if (field640 != null || Statics.field1245 != null || field693) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var9.field2641 && var28) {
                                    var9.field2641 = true;
                                    if (var9.field2600 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = var9;
                                        var34.field13 = class76.field1378 - var10;
                                        var34.field8 = class76.field1381 - var11;
                                        var34.field16 = var9.field2600;
                                        field666.method3379(var34);
                                    }
                                }
                                if (var9.field2641 && var27 && var9.field2607 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = var9;
                                    var35.field13 = class76.field1380 - var10;
                                    var35.field8 = class76.field1384 - var11;
                                    var35.field16 = var9.field2607;
                                    field666.method3379(var35);
                                }
                                if (var9.field2641 && !var27) {
                                    var9.field2641 = false;
                                    if (var9.field2546 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = var9;
                                        var36.field13 = class76.field1380 - var10;
                                        var36.field8 = class76.field1384 - var11;
                                        var36.field16 = var9.field2546;
                                        field508.method3379(var36);
                                    }
                                }
                                if (var27 && var9.field2603 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = var9;
                                    var37.field13 = class76.field1380 - var10;
                                    var37.field8 = class76.field1384 - var11;
                                    var37.field16 = var9.field2603;
                                    field666.method3379(var37);
                                }
                                if (!var9.field2573 && var26) {
                                    var9.field2573 = true;
                                    if (var9.field2604 != null) {
                                        class1 var38 = new class1();
                                        var38.field2 = var9;
                                        var38.field13 = class76.field1380 - var10;
                                        var38.field8 = class76.field1384 - var11;
                                        var38.field16 = var9.field2604;
                                        field666.method3379(var38);
                                    }
                                }
                                if (var9.field2573 && var26 && var9.field2630 != null) {
                                    class1 var39 = new class1();
                                    var39.field2 = var9;
                                    var39.field13 = class76.field1380 - var10;
                                    var39.field8 = class76.field1384 - var11;
                                    var39.field16 = var9.field2630;
                                    field666.method3379(var39);
                                }
                                if (var9.field2573 && !var26) {
                                    var9.field2573 = false;
                                    if (var9.field2606 != null) {
                                        class1 var40 = new class1();
                                        var40.field2 = var9;
                                        var40.field13 = class76.field1380 - var10;
                                        var40.field8 = class76.field1384 - var11;
                                        var40.field16 = var9.field2606;
                                        field508.method3379(var40);
                                    }
                                }
                                if (var9.field2617 != null) {
                                    class1 var41 = new class1();
                                    var41.field2 = var9;
                                    var41.field16 = var9.field2617;
                                    field488.method3379(var41);
                                }
                                if (var9.field2647 != null && field654 > var9.field2529) {
                                    if (var9.field2642 == null || field654 - var9.field2529 > 32) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field16 = var9.field2647;
                                        field666.method3379(var46);
                                    } else {
                                        label396: for (int var42 = var9.field2529; var42 < field654; var42++) {
                                            int var43 = field653[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2642.length; var44++) {
                                                if (var9.field2642[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field2 = var9;
                                                    var45.field16 = var9.field2647;
                                                    field666.method3379(var45);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2529 = field654;
                                }
                                if (var9.field2613 != null && field600 > var9.field2644) {
                                    if (var9.field2640 == null || field600 - var9.field2644 > 32) {
                                        class1 var51 = new class1();
                                        var51.field2 = var9;
                                        var51.field16 = var9.field2613;
                                        field666.method3379(var51);
                                    } else {
                                        label376: for (int var47 = var9.field2644; var47 < field600; var47++) {
                                            int var48 = field589[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2640.length; var49++) {
                                                if (var9.field2640[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field2 = var9;
                                                    var50.field16 = var9.field2613;
                                                    field666.method3379(var50);
                                                    break label376;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2644 = field600;
                                }
                                if (var9.field2615 != null && field625 > var9.field2645) {
                                    if (var9.field2616 == null || field625 - var9.field2645 > 32) {
                                        class1 var56 = new class1();
                                        var56.field2 = var9;
                                        var56.field16 = var9.field2615;
                                        field666.method3379(var56);
                                    } else {
                                        label356: for (int var52 = var9.field2645; var52 < field625; var52++) {
                                            int var53 = field657[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2616.length; var54++) {
                                                if (var9.field2616[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field2 = var9;
                                                    var55.field16 = var9.field2615;
                                                    field666.method3379(var55);
                                                    break label356;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2645 = field625;
                                }
                                if (field659 > var9.field2523 && var9.field2620 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field16 = var9.field2620;
                                    field666.method3379(var57);
                                }
                                if (field660 > var9.field2523 && var9.field2622 != null) {
                                    class1 var58 = new class1();
                                    var58.field2 = var9;
                                    var58.field16 = var9.field2622;
                                    field666.method3379(var58);
                                }
                                if (field661 > var9.field2523 && var9.field2597 != null) {
                                    class1 var59 = new class1();
                                    var59.field2 = var9;
                                    var59.field16 = var9.field2597;
                                    field666.method3379(var59);
                                }
                                if (field662 > var9.field2523 && var9.field2624 != null) {
                                    class1 var60 = new class1();
                                    var60.field2 = var9;
                                    var60.field16 = var9.field2624;
                                    field666.method3379(var60);
                                }
                                var9.field2523 = field708;
                                if (var9.field2599 != null) {
                                    for (int var61 = 0; var61 < field690; var61++) {
                                        class1 var62 = new class1();
                                        var62.field2 = var9;
                                        var62.field7 = field692[var61];
                                        var62.field11 = field691[var61];
                                        var62.field16 = var9.field2599;
                                        field666.method3379(var62);
                                    }
                                }
                            }
                        }
                        if (!var9.field2530) {
                            if (field640 != null || Statics.field1245 != null || field693) {
                                return;
                            }
                            if ((var9.field2526 >= 0 || var9.field2567 != 0) && class76.field1380 >= var12 && class76.field1384 >= var13 && class76.field1380 < var14 && class76.field1384 < var15) {
                                if (var9.field2526 >= 0) {
                                    Statics.field461 = arg0[var9.field2526];
                                } else {
                                    Statics.field461 = var9;
                                }
                            }
                            if (var9.field2533 == 8 && class76.field1380 >= var12 && class76.field1384 >= var13 && class76.field1380 < var14 && class76.field1384 < var15) {
                                Statics.field300 = var9;
                            }
                            if (var9.field2547 > var9.field2541) {
                                method1221(var9, var9.field2540 + var10, var11, var9.field2541, var9.field2547, class76.field1380, class76.field1384);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.ce(III)V")
    public static final void method1511(int arg0, int arg1) {
        if (class156.method2342(arg0)) {
            method573(Statics.field2536[arg0], arg1);
        }
    }

    @ObfuscatedName("ai.cg([Lef;IB)V")
    public static final void method573(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2533 == 0) {
                    if (var3.field2558 != null) {
                        method573(var3.field2558, arg1);
                    }
                    class4 var4 = (class4) field630.method3354((long) var3.field2531);
                    if (var4 != null) {
                        method1511(var4.field54, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2625 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field16 = var3.field2625;
                    class25.method1222(var5);
                }
                if (arg1 == 1 && var3.field2626 != null) {
                    if (var3.field2532 >= 0) {
                        class156 var6 = class156.method2382(var3.field2531);
                        if (var6 == null || var6.field2558 == null || var3.field2532 >= var6.field2558.length || var6.field2558[var3.field2532] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field16 = var3.field2626;
                    class25.method1222(var7);
                }
            }
        }
    }

    @ObfuscatedName("ei.cl(I)V")
    public static final void method3128() {
        method2745(field640);
        Statics.field729++;
        if (field581 && field522) {
            int var0 = class76.field1380;
            int var1 = class76.field1384;
            int var2 = var0 - field645;
            int var3 = var1 - field643;
            if (var2 < field646) {
                var2 = field646;
            }
            if (field640.field2540 + var2 > field646 + field641.field2540) {
                var2 = field646 + field641.field2540 - field640.field2540;
            }
            if (var3 < field647) {
                var3 = field647;
            }
            if (field640.field2541 + var3 > field647 + field641.field2541) {
                var3 = field647 + field641.field2541 - field640.field2541;
            }
            int var4 = var2 - field649;
            int var5 = var3 - field650;
            int var6 = field640.field2594;
            if (Statics.field729 > field640.field2595 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field651 = true;
            }
            int var7 = field641.field2544 + (var2 - field646);
            int var8 = field641.field2545 + (var3 - field647);
            if (field640.field2538 != null && field651) {
                class1 var9 = new class1();
                var9.field2 = field640;
                var9.field13 = var7;
                var9.field8 = var8;
                var9.field16 = field640.field2538;
                class25.method1222(var9);
            }
            if (class76.field1379 == 0) {
                if (field651) {
                    if (field640.field2608 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field640;
                        var10.field13 = var7;
                        var10.field8 = var8;
                        var10.field6 = field644;
                        var10.field16 = field640.field2608;
                        class25.method1222(var10);
                    }
                    if (field644 != null && method574(field640) != null) {
                        field634.method2358(221);
                        field634.method2524(field644.field2531);
                        field634.method2524(field640.field2531);
                        field634.method2473(field644.field2532);
                        field634.method2540(field640.field2532);
                    }
                } else if ((field610 == 1 || method2160(field612 - 1)) && field612 > 2) {
                    method29();
                } else if (field612 > 0) {
                    method200(field612 - 1);
                }
                field640 = null;
            }
        } else if (Statics.field729 > 1) {
            field640 = null;
        }
    }

    @ObfuscatedName("eu.cq(Lef;I)V")
    public static void method2745(class156 arg0) {
        if (field671 == arg0.field2564) {
            field472[arg0.field2646] = true;
        }
    }

    @ObfuscatedName("e.cv(I)V")
    public static void method10() {
        for (class4 var0 = (class4) field630.method3357(); var0 != null; var0 = (class4) field630.method3372()) {
            int var1 = var0.field54;
            if (class156.method2342(var1)) {
                boolean var2 = true;
                class156[] var3 = Statics.field2536[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2530;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2760;
                    class156 var6 = class156.method2382(var5);
                    if (var6 != null) {
                        method2745(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ei.cc([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method3129(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("v.co(II)V")
    public static final void method209(int arg0) {
        if (!class156.method2342(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2536[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3 != null) {
                var3.field2578 = 0;
                var3.field2614 = 0;
            }
        }
    }

    @ObfuscatedName("g.cs(IB)V")
    public static final void method1(int arg0) {
        if (class156.method2342(arg0)) {
            method1220(Statics.field2536[arg0], -1);
        }
    }

    @ObfuscatedName("bc.ca([Lef;IB)V")
    public static final void method1220(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null && var3.field2542 == arg1 && (!var3.field2530 || !method2721(var3))) {
                if (var3.field2533 == 0) {
                    if (!var3.field2530 && method2721(var3) && Statics.field461 != var3) {
                        continue;
                    }
                    method1220(arg0, var3.field2531);
                    if (var3.field2558 != null) {
                        method1220(var3.field2558, var3.field2531);
                    }
                    class4 var4 = (class4) field630.method3354((long) var3.field2531);
                    if (var4 != null) {
                        method1(var4.field54);
                    }
                }
                if (var3.field2533 == 6) {
                    if (var3.field2585 != -1 || var3.field2568 != -1) {
                        boolean var5 = method52(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2568;
                        } else {
                            var6 = var3.field2585;
                        }
                        if (var6 != -1) {
                            class33 var7 = class33.method224(var6);
                            var3.field2614 += field637;
                            while (var3.field2614 > var7.field862[var3.field2578]) {
                                var3.field2614 -= var7.field862[var3.field2578];
                                var3.field2578++;
                                if (var3.field2578 >= var7.field863.length) {
                                    var3.field2578 -= var7.field867;
                                    if (var3.field2578 < 0 || var3.field2578 >= var7.field863.length) {
                                        var3.field2578 = 0;
                                    }
                                }
                                method2745(var3);
                            }
                        }
                    }
                    if (var3.field2575 != 0 && !var3.field2530) {
                        int var8 = var3.field2575 >> 16;
                        int var9 = var3.field2575 << 16 >> 16;
                        int var10 = field637 * var8;
                        int var11 = field637 * var9;
                        var3.field2571 = var3.field2571 + var10 & 0x7FF;
                        var3.field2521 = var3.field2521 + var11 & 0x7FF;
                        method2745(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ek.cu(II)V")
    public static final void method2769(int arg0) {
        method10();
        class7.method1588();
        class41 var1 = (class41) class41.field1028.method3311((long) arg0);
        class41 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1033.method3012(16, arg0);
            class41 var4 = new class41();
            if (var3 != null) {
                var4.method890(new class126(var3));
            }
            class41.field1028.method3314(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1029;
        if (var5 == 0) {
            return;
        }
        int var6 = class157.field2656[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class103.method2214(0.9D);
                ((class109) Statics.field1753).method2250(0.9D);
            }
            if (var6 == 2) {
                class103.method2214(0.8D);
                ((class109) Statics.field1753).method2250(0.8D);
            }
            if (var6 == 3) {
                class103.method2214(0.7D);
                ((class109) Statics.field1753).method2250(0.7D);
            }
            if (var6 == 4) {
                class103.method2214(0.6D);
                ((class109) Statics.field1753).method2250(0.6D);
            }
            class39.field972.method3315();
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
            if (field703 != var7) {
                if (field703 == 0 && field528 != -1) {
                    class137.method2466(Statics.field2455, field528, 0, var7, false);
                    field705 = false;
                } else if (var7 == 0) {
                    class137.method12();
                    field705 = false;
                } else if (class137.field2319 == 0) {
                    Statics.field2314.method2771(var7);
                } else {
                    Statics.field1345 = var7;
                }
                field703 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field713 = 127;
            }
            if (var6 == 1) {
                field713 = 96;
            }
            if (var6 == 2) {
                field713 = 64;
            }
            if (var6 == 3) {
                field713 = 32;
            }
            if (var6 == 4) {
                field713 = 0;
            }
        }
        if (var5 == 5) {
            field610 = var6;
        }
        if (var5 == 6) {
            field611 = var6;
        }
        if (var5 == 9) {
            field593 = var6;
        }
        if (var5 != 10) {
            return;
        }
        if (var6 == 0) {
            field707 = 127;
        }
        if (var6 == 1) {
            field707 = 96;
        }
        if (var6 == 2) {
            field707 = 64;
        }
        if (var6 == 3) {
            field707 = 32;
        }
        if (var6 == 4) {
            field707 = 0;
        }
    }

    @ObfuscatedName("cw.cp(IIII)Lj;")
    public static final class4 method1684(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field54 = arg1;
        var3.field49 = arg2;
        field630.method3353(var3, (long) arg0);
        method209(arg1);
        class25.method682(arg1);
        class156 var4 = class156.method2382(arg0);
        if (var4 != null) {
            method2745(var4);
        }
        if (field633 != null) {
            method2745(field633);
            field633 = null;
        }
        field693 = false;
        field612 = 0;
        method159(Statics.field2048, Statics.field130, Statics.field856, Statics.field1508);
        if (field629 != -1) {
            method1511(field629, 1);
        }
        return var3;
    }

    @ObfuscatedName("e.cr(Lj;ZI)V")
    public static final void method4(class4 arg0, boolean arg1) {
        int var2 = arg0.field54;
        int var3 = (int) arg0.field2760;
        arg0.method3415();
        if (arg1 && var2 != -1 && Statics.field2586[var2]) {
            Statics.field2636.method3045(var2);
            if (Statics.field2536[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2536[var2].length; var5++) {
                    if (Statics.field2536[var2][var5] != null) {
                        if (Statics.field2536[var2][var5].field2533 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2536[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2536[var2] = null;
                }
                Statics.field2586[var2] = false;
            }
        }
        for (class169 var6 = (class169) field669.method3357(); var6 != null; var6 = (class169) field669.method3372()) {
            if ((var6.field2760 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3415();
            }
        }
        class156 var7 = class156.method2382(var3);
        if (var7 != null) {
            method2745(var7);
        }
        field693 = false;
        field612 = 0;
        method159(Statics.field2048, Statics.field130, Statics.field856, Statics.field1508);
        if (field629 != -1) {
            method1511(field629, 1);
        }
    }

    @ObfuscatedName("k.ch(Lef;I)Z")
    public static final boolean method223(class156 arg0) {
        int var1 = arg0.field2609;
        if (var1 == 205) {
            field696 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field726.method3240(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field726.method3230(var4, var5 == 1);
        }
        if (var1 == 324) {
            field726.method3232(false);
        }
        if (var1 == 325) {
            field726.method3232(true);
        }
        if (var1 == 326) {
            field634.method2358(91);
            field726.method3233(field634);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("client.cm(IIII)V")
    public static final void method546(int arg0, int arg1, int arg2) {
        method790();
        class88.method1792(arg0, arg1, Statics.field2037.field1468 + arg0, Statics.field2037.field1469 + arg1);
        if (field628 == 2 || field628 == 5) {
            class88.method1807(arg0 + 25, arg1 + 5, 0, Statics.field184, Statics.field548);
        } else {
            int var3 = field556 + field542 & 0x7FF;
            int var4 = Statics.field2611.field441 / 32 + 48;
            int var5 = 464 - Statics.field2611.field433 / 32;
            Statics.field1441.method1712(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field544 + 256, Statics.field184, Statics.field548);
            for (int var6 = 0; var6 < field672; var6++) {
                int var7 = field592[var6] * 4 + 2 - Statics.field2611.field441 / 32;
                int var8 = field698[var6] * 4 + 2 - Statics.field2611.field433 / 32;
                method2159(arg0, arg1, var7, var8, field607[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class175 var11 = field603[Statics.field1899][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2611.field441 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2611.field433 / 32;
                        method2159(arg0, arg1, var12, var13, Statics.field69[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field505; var14++) {
                class24 var15 = field504[field506[var14]];
                if (var15 != null && var15.method18()) {
                    class30 var16 = var15.field378;
                    if (var16 != null && var16.field791 != null) {
                        var16 = var16.method606();
                    }
                    if (var16 != null && var16.field760 && var16.field792) {
                        int var17 = var15.field441 / 32 - Statics.field2611.field441 / 32;
                        int var18 = var15.field433 / 32 - Statics.field2611.field433 / 32;
                        method2159(arg0, arg1, var17, var18, Statics.field69[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field590; var19++) {
                class3 var20 = field618[field591[var19]];
                if (var20 != null && var20.method18()) {
                    int var21 = var20.field441 / 32 - Statics.field2611.field441 / 32;
                    int var22 = var20.field433 / 32 - Statics.field2611.field433 / 32;
                    boolean var23 = false;
                    if (method195(var20.field36)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field2611.field33 != 0 && var20.field33 != 0 && Statics.field2611.field33 == var20.field33) {
                        var24 = true;
                    }
                    if (var23) {
                        method2159(arg0, arg1, var21, var22, Statics.field69[3]);
                    } else if (var24) {
                        method2159(arg0, arg1, var21, var22, Statics.field69[4]);
                    } else {
                        method2159(arg0, arg1, var21, var22, Statics.field69[2]);
                    }
                }
            }
            if (field484 != 0 && field652 % 20 < 10) {
                if (field484 == 1 && field485 >= 0 && field485 < field504.length) {
                    class24 var25 = field504[field485];
                    if (var25 != null) {
                        int var26 = var25.field441 / 32 - Statics.field2611.field441 / 32;
                        int var27 = var25.field433 / 32 - Statics.field2611.field433 / 32;
                        method1689(arg0, arg1, var26, var27, Statics.field392[1]);
                    }
                }
                if (field484 == 2) {
                    int var28 = field487 * 4 - Statics.field362 * 4 + 2 - Statics.field2611.field441 / 32;
                    int var29 = field521 * 4 - Statics.field65 * 4 + 2 - Statics.field2611.field433 / 32;
                    method1689(arg0, arg1, var28, var29, Statics.field392[1]);
                }
                if (field484 == 10 && field541 >= 0 && field541 < field618.length) {
                    class3 var30 = field618[field541];
                    if (var30 != null) {
                        int var31 = var30.field441 / 32 - Statics.field2611.field441 / 32;
                        int var32 = var30.field433 / 32 - Statics.field2611.field433 / 32;
                        method1689(arg0, arg1, var31, var32, Statics.field392[1]);
                    }
                }
            }
            if (field700 != 0) {
                int var33 = field700 * 4 + 2 - Statics.field2611.field441 / 32;
                int var34 = field701 * 4 + 2 - Statics.field2611.field433 / 32;
                method2159(arg0, arg1, var33, var34, Statics.field392[0]);
            }
            class88.method1842(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field628 < 3) {
            Statics.field99.method1712(arg0, arg1, 33, 33, 25, 25, field556, 256, Statics.field367, Statics.field75);
        } else {
            class88.method1807(arg0, arg1, 0, Statics.field367, Statics.field75);
        }
        if (field656[arg2]) {
            Statics.field2037.method1782(arg0, arg1);
        }
        field673[arg2] = true;
    }

    @ObfuscatedName("cw.cd(IIIILcf;I)V")
    public static final void method1689(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method2159(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field556 + field542 & 0x7FF;
        int var7 = class103.field1756[var6];
        int var8 = class103.field1757[var6];
        int var9 = var7 * 256 / (field544 + 256);
        int var10 = var8 * 256 / (field544 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1507.method1713(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("cz.cz(IIIILcf;I)V")
    public static final void method2159(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field556 + field542 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class103.field1756[var5];
        int var8 = class103.field1757[var5];
        int var9 = var7 * 256 / (field544 + 256);
        int var10 = var8 * 256 / (field544 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1757(Statics.field2037, arg0 + 94 + var11 - arg4.field1461 / 2 + 4, arg1 + 83 - var12 - arg4.field1460 / 2 - 4);
        } else {
            arg4.method1702(arg0 + 94 + var11 - arg4.field1461 / 2 + 4, arg1 + 83 - var12 - arg4.field1460 / 2 - 4);
        }
    }

    @ObfuscatedName("bh.ct(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1380(int arg0, String arg1, String arg2) {
        method2718(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ea.cy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method2718(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field680[var4] = field680[var4 - 1];
            field525[var4] = field525[var4 - 1];
            field617[var4] = field617[var4 - 1];
            field570[var4] = field570[var4 - 1];
        }
        field680[0] = arg0;
        field525[0] = arg1;
        field617[0] = arg2;
        field570[0] = arg3;
        field561++;
        field659 = field708;
    }

    @ObfuscatedName("b.dc(Ljava/lang/String;B)Z")
    public static boolean method195(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method2352(arg0, Statics.field469);
        for (int var2 = 0; var2 < field720; var2++) {
            if (var1.equalsIgnoreCase(class147.method2352(field523[var2].field358, Statics.field469))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method2352(Statics.field2611.field36, Statics.field469))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("am.dn(Ljava/lang/String;I)Z")
    public static boolean method877(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method2352(arg0, Statics.field469);
        for (int var2 = 0; var2 < field724; var2++) {
            class11 var3 = field725[var2];
            if (var1.equalsIgnoreCase(class147.method2352(var3.field175, Statics.field469))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method2352(var3.field174, Statics.field469))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("l.dm(Ljava/lang/String;ZI)V")
    public static final void method54(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field724 >= 100) {
            method1380(0, "", class133.field2217);
            return;
        }
        String var2 = class147.method2352(arg0, Statics.field469);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field724; var3++) {
            class11 var4 = field725[var3];
            String var5 = class147.method2352(var4.field175, Statics.field469);
            if (var5 != null && var5.equals(var2)) {
                method1380(0, "", arg0 + class133.field2175);
                return;
            }
            if (var4.field174 != null) {
                String var6 = class147.method2352(var4.field174, Statics.field469);
                if (var6 != null && var6.equals(var2)) {
                    method1380(0, "", arg0 + class133.field2175);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field720; var7++) {
            class22 var8 = field523[var7];
            String var9 = class147.method2352(var8.field358, Statics.field469);
            if (var9 != null && var9.equals(var2)) {
                method1380(0, "", class133.field2223 + arg0 + class133.field2224);
                return;
            }
            if (var8.field352 != null) {
                String var10 = class147.method2352(var8.field352, Statics.field469);
                if (var10 != null && var10.equals(var2)) {
                    method1380(0, "", class133.field2223 + arg0 + class133.field2224);
                    return;
                }
            }
        }
        if (class147.method2352(Statics.field2611.field36, Statics.field469).equals(var2)) {
            method1380(0, "", class133.field2170);
        } else {
            field634.method2358(208);
            field634.method2472(class126.method198(arg0));
            field634.method2477(arg0);
        }
    }

    @ObfuscatedName("bm.dq(Ljava/lang/String;I)V")
    public static final void method1543(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method2352(arg0, Statics.field469);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field720; var2++) {
            class22 var3 = field523[var2];
            String var4 = var3.field358;
            String var5 = class147.method2352(var4, Statics.field469);
            if (class135.method2888(arg0, var1, var4, var5)) {
                field720--;
                for (int var6 = var2; var6 < field720; var6++) {
                    field523[var6] = field523[var6 + 1];
                }
                field660 = field708;
                field634.method2358(101);
                field634.method2472(class126.method198(arg0));
                field634.method2477(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cy.dh(Ljava/lang/String;I)V")
    public static final void method2228(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method2352(arg0, Statics.field469);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field724; var2++) {
            class11 var3 = field725[var2];
            String var4 = var3.field175;
            String var5 = class147.method2352(var4, Statics.field469);
            if (class135.method2888(arg0, var1, var4, var5)) {
                field724--;
                for (int var6 = var2; var6 < field724; var6++) {
                    field725[var6] = field725[var6 + 1];
                }
                field660 = field708;
                field634.method2358(68);
                field634.method2472(class126.method198(arg0));
                field634.method2477(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ci.de(Ljava/lang/String;II)V")
    public static final void method1680(String arg0, int arg1) {
        field634.method2358(227);
        field634.method2472(class126.method198(arg0) + 1);
        field634.method2506(arg1);
        field634.method2477(arg0);
    }

    @ObfuscatedName("z.dk(Ljava/lang/String;I)V")
    public static final void method117(String arg0) {
        if (Statics.field256 != null) {
            field634.method2358(110);
            field634.method2472(class126.method198(arg0));
            field634.method2477(arg0);
        }
    }

    @ObfuscatedName("v.dy(Ljava/lang/String;I)V")
    public static final void method210(String arg0) {
        if (!arg0.equals("")) {
            field634.method2358(24);
            field634.method2472(class126.method198(arg0));
            field634.method2477(arg0);
        }
    }

    @ObfuscatedName("aq.db(I)V")
    public static final void method810() {
        field634.method2358(24);
        field634.method2472(0);
    }

    @ObfuscatedName("ea.di(Lef;I)I")
    public static int method2720(class156 arg0) {
        class169 var1 = (class169) field669.method3354(((long) arg0.field2531 << 32) + (long) arg0.field2532);
        return var1 == null ? arg0.field2590 : var1.field2744;
    }

    @ObfuscatedName("ai.dj(Lef;I)Lef;")
    public static class156 method574(class156 arg0) {
        int var1 = class160.method2259(method2720(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class156.method2382(arg0.field2542);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ea.dl(Lef;B)Z")
    public static boolean method2721(class156 arg0) {
        if (field638) {
            if (method2720(arg0) != 0) {
                return false;
            }
            if (arg0.field2533 == 0) {
                return false;
            }
        }
        return arg0.field2543;
    }
}

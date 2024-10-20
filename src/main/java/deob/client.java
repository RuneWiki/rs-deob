package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class72 {

    @ObfuscatedName("client.n")
    public static boolean field690 = true;

    @ObfuscatedName("client.c")
    public static int field557 = 1;

    @ObfuscatedName("client.k")
    public static int field459 = 0;

    @ObfuscatedName("client.u")
    public static boolean field567 = false;

    @ObfuscatedName("client.s")
    public static boolean field617 = false;

    @ObfuscatedName("client.l")
    public static int field463 = 0;

    @ObfuscatedName("client.o")
    public static int field464 = 1;

    @ObfuscatedName("client.p")
    public static int field465 = 0;

    @ObfuscatedName("client.d")
    public static boolean field466 = true;

    @ObfuscatedName("client.m")
    public static int field510 = 0;

    @ObfuscatedName("client.z")
    public static long field688 = 1L;

    @ObfuscatedName("client.i")
    public static int field470 = -1;

    @ObfuscatedName("client.j")
    public static int field471 = -1;

    @ObfuscatedName("client.a")
    public static int field501 = -1;

    @ObfuscatedName("client.g")
    public static boolean field546 = true;

    @ObfuscatedName("client.b")
    public static boolean field474 = false;

    @ObfuscatedName("client.w")
    public static class163[] field519 = new class163[4];

    @ObfuscatedName("client.au")
    public static int field653 = 0;

    @ObfuscatedName("client.az")
    public static int field476 = 0;

    @ObfuscatedName("client.ak")
    public static int field477 = 0;

    @ObfuscatedName("client.ah")
    public static int field568 = 0;

    @ObfuscatedName("client.aa")
    public static int field479 = 0;

    @ObfuscatedName("client.am")
    public static int field480 = 0;

    @ObfuscatedName("client.al")
    public static int field481 = 0;

    @ObfuscatedName("client.ae")
    public static int field529 = 0;

    @ObfuscatedName("client.ab")
    public static int field483 = 0;

    @ObfuscatedName("client.as")
    public static class126 field484 = new class126(new byte[5000]);

    @ObfuscatedName("client.an")
    public static int field485 = 0;

    @ObfuscatedName("client.ax")
    public static int field486 = 0;

    @ObfuscatedName("client.ao")
    public static int field719 = 0;

    @ObfuscatedName("client.bz")
    public static int field489 = 0;

    @ObfuscatedName("client.bt")
    public static int field490 = 0;

    @ObfuscatedName("client.bc")
    public static int field491 = 0;

    @ObfuscatedName("client.bd")
    public static int field492 = 0;

    @ObfuscatedName("client.bj")
    public static int field493 = 0;

    @ObfuscatedName("client.bx")
    public static class24[] field496 = new class24[32768];

    @ObfuscatedName("client.bq")
    public static int field497 = 0;

    @ObfuscatedName("client.ba")
    public static int[] field630 = new int[32768];

    @ObfuscatedName("client.ch")
    public static class115 field500 = new class115(5000);

    @ObfuscatedName("client.cl")
    public static class115 field461 = new class115(5000);

    @ObfuscatedName("client.cr")
    public static class115 field502 = new class115(5000);

    @ObfuscatedName("client.cj")
    public static int field693 = 0;

    @ObfuscatedName("client.cz")
    public static int field504 = 0;

    @ObfuscatedName("client.cc")
    public static int field505 = 0;

    @ObfuscatedName("client.ct")
    public static int field506 = 0;

    @ObfuscatedName("client.ce")
    public static int field711 = 0;

    @ObfuscatedName("client.cu")
    public static int field508 = 0;

    @ObfuscatedName("client.cb")
    public static int field482 = 0;

    @ObfuscatedName("client.cp")
    public static int field547 = 0;

    @ObfuscatedName("client.cm")
    public static boolean field511 = false;

    @ObfuscatedName("client.cy")
    public static int field512 = 0;

    @ObfuscatedName("client.ck")
    public static int field513 = 0;

    @ObfuscatedName("client.cv")
    public static int field498 = 1;

    @ObfuscatedName("client.cg")
    public static int field515 = 0;

    @ObfuscatedName("client.db")
    public static int field516 = 1;

    @ObfuscatedName("client.dg")
    public static int field517 = 0;

    @ObfuscatedName("client.dd")
    public static boolean field495 = false;

    @ObfuscatedName("client.de")
    public static int[][][] field521 = new int[4][13][13];

    @ObfuscatedName("client.dc")
    public static final int[] field522 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field579 = 0;

    @ObfuscatedName("client.du")
    public static int[][] field524 = new int[104][104];

    @ObfuscatedName("client.dk")
    public static int[][] field679 = new int[104][104];

    @ObfuscatedName("client.da")
    public static int[] field614 = new int[4000];

    @ObfuscatedName("client.dv")
    public static int[] field527 = new int[4000];

    @ObfuscatedName("client.dq")
    public static int field528 = 0;

    @ObfuscatedName("client.dm")
    public static int field610 = 2;

    @ObfuscatedName("client.dr")
    public static int field530 = 0;

    @ObfuscatedName("client.do")
    public static int field531 = 2;

    @ObfuscatedName("client.di")
    public static int field514 = 0;

    @ObfuscatedName("client.dw")
    public static int field533 = 1;

    @ObfuscatedName("client.dl")
    public static int field534 = 0;

    @ObfuscatedName("client.ez")
    public static int field535 = 0;

    @ObfuscatedName("client.ec")
    public static int field536 = 2;

    @ObfuscatedName("client.eb")
    public static int field621 = 0;

    @ObfuscatedName("client.es")
    public static int field538 = 1;

    @ObfuscatedName("client.eg")
    public static int field539 = 0;

    @ObfuscatedName("client.ei")
    public static int field540 = 0;

    @ObfuscatedName("client.ee")
    public static int field542 = 2301979;

    @ObfuscatedName("client.ew")
    public static int field689 = 5063219;

    @ObfuscatedName("client.fk")
    public static int field544 = 3353893;

    @ObfuscatedName("client.fc")
    public static int field545 = 7759444;

    @ObfuscatedName("client.fp")
    public static boolean field670 = false;

    @ObfuscatedName("client.ff")
    public static int field594 = 0;

    @ObfuscatedName("client.fr")
    public static int field475 = 128;

    @ObfuscatedName("client.fn")
    public static int field549 = 0;

    @ObfuscatedName("client.fo")
    public static int field550 = 0;

    @ObfuscatedName("client.fl")
    public static int field551 = 0;

    @ObfuscatedName("client.fi")
    public static int field526 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field553 = false;

    @ObfuscatedName("client.fz")
    public static int field554 = 0;

    @ObfuscatedName("client.fx")
    public static int field537 = 0;

    @ObfuscatedName("client.fa")
    public static int field710 = 50;

    @ObfuscatedName("client.fy")
    public static int[] field487 = new int[field710];

    @ObfuscatedName("client.fd")
    public static int[] field558 = new int[field710];

    @ObfuscatedName("client.fs")
    public static int[] field559 = new int[field710];

    @ObfuscatedName("client.fg")
    public static int[] field560 = new int[field710];

    @ObfuscatedName("client.fh")
    public static int[] field556 = new int[field710];

    @ObfuscatedName("client.fb")
    public static int[] field562 = new int[field710];

    @ObfuscatedName("client.gc")
    public static int[] field563 = new int[field710];

    @ObfuscatedName("client.gg")
    public static String[] field668 = new String[field710];

    @ObfuscatedName("client.gy")
    public static int[][] field565 = new int[104][104];

    @ObfuscatedName("client.gj")
    public static int field566 = 0;

    @ObfuscatedName("client.gw")
    public static int field700 = -1;

    @ObfuscatedName("client.ge")
    public static int field468 = -1;

    @ObfuscatedName("client.gd")
    public static int field569 = 0;

    @ObfuscatedName("client.gs")
    public static int field570 = 0;

    @ObfuscatedName("client.gi")
    public static int field571 = 0;

    @ObfuscatedName("client.gx")
    public static int field656 = 0;

    @ObfuscatedName("client.gk")
    public static int field573 = 0;

    @ObfuscatedName("client.gb")
    public static int field574 = 0;

    @ObfuscatedName("client.gu")
    public static int field575 = 0;

    @ObfuscatedName("client.gn")
    public static int field576 = 0;

    @ObfuscatedName("client.gz")
    public static int field637 = 0;

    @ObfuscatedName("client.gv")
    public static int field578 = 0;

    @ObfuscatedName("client.gm")
    public static boolean field631 = false;

    @ObfuscatedName("client.gf")
    public static int field580 = 0;

    @ObfuscatedName("client.gr")
    public static int field581 = 0;

    @ObfuscatedName("client.gh")
    public static class3[] field582 = new class3[2048];

    @ObfuscatedName("client.gt")
    public static int field618 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field584 = new int[2048];

    @ObfuscatedName("client.ho")
    public static int field585 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field543 = new int[2048];

    @ObfuscatedName("client.hn")
    public static class126[] field572 = new class126[2048];

    @ObfuscatedName("client.hp")
    public static int field588 = -1;

    @ObfuscatedName("client.hm")
    public static int field589 = 0;

    @ObfuscatedName("client.hg")
    public static int field590 = 0;

    @ObfuscatedName("client.hc")
    public static int[] field591 = new int[1000];

    @ObfuscatedName("client.hk")
    public static final int[] field561 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hd")
    public static String[] field593 = new String[8];

    @ObfuscatedName("client.ht")
    public static boolean[] field638 = new boolean[8];

    @ObfuscatedName("client.hf")
    public static int[] field604 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hy")
    public static class176[][][] field596 = new class176[4][104][104];

    @ObfuscatedName("client.hq")
    public static class176 field597 = new class176();

    @ObfuscatedName("client.hj")
    public static class176 field598 = new class176();

    @ObfuscatedName("client.hl")
    public static class176 field599 = new class176();

    @ObfuscatedName("client.hu")
    public static int[] field671 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field601 = new int[25];

    @ObfuscatedName("client.hh")
    public static int[] field602 = new int[25];

    @ObfuscatedName("client.hz")
    public static int field669 = 0;

    @ObfuscatedName("client.hr")
    public static boolean field683 = false;

    @ObfuscatedName("client.ih")
    public static int field525 = 0;

    @ObfuscatedName("client.ij")
    public static int[] field606 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field607 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field608 = new int[500];

    @ObfuscatedName("client.id")
    public static int[] field509 = new int[500];

    @ObfuscatedName("client.ie")
    public static String[] field687 = new String[500];

    @ObfuscatedName("client.ib")
    public static String[] field583 = new String[500];

    @ObfuscatedName("client.iw")
    public static int field605 = -1;

    @ObfuscatedName("client.ia")
    public static int field613 = -1;

    @ObfuscatedName("client.iy")
    public static int field478 = 0;

    @ObfuscatedName("client.io")
    public static int field615 = 50;

    @ObfuscatedName("client.iv")
    public static int field616 = 0;

    @ObfuscatedName("client.it")
    public static String field564 = null;

    @ObfuscatedName("client.iu")
    public static boolean field717 = false;

    @ObfuscatedName("client.iq")
    public static int field619 = -1;

    @ObfuscatedName("client.im")
    public static String field620 = null;

    @ObfuscatedName("client.jc")
    public static String field654 = null;

    @ObfuscatedName("client.jy")
    public static int field622 = -1;

    @ObfuscatedName("client.jd")
    public static class174 field623 = new class174(8);

    @ObfuscatedName("client.js")
    public static int field624 = 0;

    @ObfuscatedName("client.jz")
    public static int field625 = 0;

    @ObfuscatedName("client.ji")
    public static class157 field626 = null;

    @ObfuscatedName("client.jm")
    public static int field627 = 0;

    @ObfuscatedName("client.jk")
    public static int field628 = 0;

    @ObfuscatedName("client.jg")
    public static int field629 = 0;

    @ObfuscatedName("client.ja")
    public static boolean field663 = false;

    @ObfuscatedName("client.jq")
    public static boolean field659 = false;

    @ObfuscatedName("client.jr")
    public static boolean field633 = false;

    @ObfuscatedName("client.jp")
    public static class157 field532 = null;

    @ObfuscatedName("client.jv")
    public static class157 field634 = null;

    @ObfuscatedName("client.jx")
    public static int field635 = 0;

    @ObfuscatedName("client.jo")
    public static int field636 = 0;

    @ObfuscatedName("client.jt")
    public static class157 field555 = null;

    @ObfuscatedName("client.jj")
    public static boolean field600 = false;

    @ObfuscatedName("client.je")
    public static int field639 = -1;

    @ObfuscatedName("client.jw")
    public static int field640 = -1;

    @ObfuscatedName("client.jb")
    public static boolean field641 = false;

    @ObfuscatedName("client.jl")
    public static int field642 = -1;

    @ObfuscatedName("client.ju")
    public static int field696 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field644 = false;

    @ObfuscatedName("client.kc")
    public static int field645 = 1;

    @ObfuscatedName("client.kk")
    public static int[] field646 = new int[32];

    @ObfuscatedName("client.kp")
    public static int field647 = 0;

    @ObfuscatedName("client.kj")
    public static int[] field648 = new int[32];

    @ObfuscatedName("client.kx")
    public static int field649 = 0;

    @ObfuscatedName("client.kz")
    public static int[] field650 = new int[32];

    @ObfuscatedName("client.ka")
    public static int field651 = 0;

    @ObfuscatedName("client.kd")
    public static int field652 = 0;

    @ObfuscatedName("client.ki")
    public static int field587 = 0;

    @ObfuscatedName("client.kt")
    public static int field677 = 0;

    @ObfuscatedName("client.kw")
    public static int field655 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field467 = new int[2000];

    @ObfuscatedName("client.km")
    public static String[] field518 = new String[1000];

    @ObfuscatedName("client.ke")
    public static int field658 = 0;

    @ObfuscatedName("client.ku")
    public static class176 field603 = new class176();

    @ObfuscatedName("client.kf")
    public static class176 field660 = new class176();

    @ObfuscatedName("client.kr")
    public static class176 field473 = new class176();

    @ObfuscatedName("client.kh")
    public static class174 field523 = new class174(512);

    @ObfuscatedName("client.kq")
    public static int field520 = 0;

    @ObfuscatedName("client.ko")
    public static int field667 = -2;

    @ObfuscatedName("client.ln")
    public static boolean[] field665 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static boolean[] field666 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field552 = new boolean[100];

    @ObfuscatedName("client.lu")
    public static int[] field723 = new int[100];

    @ObfuscatedName("client.lb")
    public static int[] field705 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field664 = new int[100];

    @ObfuscatedName("client.ls")
    public static int[] field708 = new int[100];

    @ObfuscatedName("client.lq")
    public static int field469 = 0;

    @ObfuscatedName("client.li")
    public static int[] field673 = new int[100];

    @ObfuscatedName("client.lt")
    public static String[] field674 = new String[100];

    @ObfuscatedName("client.ly")
    public static String[] field675 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field676 = new String[100];

    @ObfuscatedName("client.lw")
    public static int field704 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field678 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lr")
    public static int field455 = 0;

    @ObfuscatedName("client.lh")
    public static int field680 = 0;

    @ObfuscatedName("client.lc")
    public static long[] field681 = new long[100];

    @ObfuscatedName("client.le")
    public static int field503 = 0;

    @ObfuscatedName("client.lp")
    public static int field632 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field684 = new int[128];

    @ObfuscatedName("client.lo")
    public static int[] field611 = new int[128];

    @ObfuscatedName("client.lg")
    public static long field686 = -1L;

    @ObfuscatedName("client.mc")
    public static String field462 = null;

    @ObfuscatedName("client.mi")
    public static String field643 = null;

    @ObfuscatedName("client.mb")
    public static int field612 = -1;

    @ObfuscatedName("client.mn")
    public static int field672 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field691 = new int[1000];

    @ObfuscatedName("client.ms")
    public static int[] field692 = new int[1000];

    @ObfuscatedName("client.mz")
    public static class85[] field457 = new class85[1000];

    @ObfuscatedName("client.mo")
    public static int field694 = 0;

    @ObfuscatedName("client.mt")
    public static int field695 = 0;

    @ObfuscatedName("client.mp")
    public static int field456 = 0;

    @ObfuscatedName("client.mf")
    public static int field697 = 255;

    @ObfuscatedName("client.ml")
    public static int field698 = -1;

    @ObfuscatedName("client.mj")
    public static boolean field699 = false;

    @ObfuscatedName("client.mu")
    public static int field472 = 127;

    @ObfuscatedName("client.mm")
    public static int field701 = 127;

    @ObfuscatedName("client.ny")
    public static int field702 = 0;

    @ObfuscatedName("client.nk")
    public static int[] field703 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field595 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field577 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field706 = new int[50];

    @ObfuscatedName("client.nn")
    public static class56[] field707 = new class56[50];

    @ObfuscatedName("client.nq")
    public static boolean field507 = false;

    @ObfuscatedName("client.nc")
    public static boolean[] field709 = new boolean[5];

    @ObfuscatedName("client.nm")
    public static int[] field657 = new int[5];

    @ObfuscatedName("client.ni")
    public static int[] field720 = new int[5];

    @ObfuscatedName("client.om")
    public static int[] field712 = new int[5];

    @ObfuscatedName("client.og")
    public static int[] field713 = new int[5];

    @ObfuscatedName("client.oy")
    public static int field714 = 0;

    @ObfuscatedName("client.op")
    public static int field715 = 0;

    @ObfuscatedName("client.ol")
    public static class22[] field716 = new class22[200];

    @ObfuscatedName("client.os")
    public static class172 field586 = new class172();

    @ObfuscatedName("client.ob")
    public static int field718 = 0;

    @ObfuscatedName("client.ok")
    public static class11[] field609 = new class11[100];

    @ObfuscatedName("client.oa")
    public static class162 field682 = new class162();

    @ObfuscatedName("client.ou")
    public static int field721 = -1;

    @ObfuscatedName("client.on")
    public static int field722 = -1;

    @ObfuscatedName("client.r(I)V")
    public final void method243() {
    }

    public final void init() {
        if (!this.method1445()) {
            return;
        }
        class166[] var1 = new class166[] { class166.field2773, class166.field2780, class166.field2778, class166.field2776, class166.field2781, class166.field2775, class166.field2782, class166.field2777, class166.field2783 };
        class166[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class166 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2774);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2774)) {
                    case 1:
                        field459 = Integer.parseInt(var5);
                        break;
                    case 2:
                        field557 = Integer.parseInt(var5);
                        break;
                    case 3:
                        int var7 = Integer.parseInt(var5);
                        class131[] var8 = new class131[] { class131.field2049, class131.field2048, class131.field2050, class131.field2055 };
                        class131[] var9 = var8;
                        int var10 = 0;
                        class131 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class131 var11 = var9[var10];
                            if (var11.field2054 == var7) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field458 = var12;
                        break;
                    case 4:
                        class132[] var6 = new class132[] { class132.field2062, class132.field2057, class132.field2063, class132.field2058, class132.field2060, class132.field2061 };
                        Statics.field460 = (class132) class112.method203(var6, Integer.parseInt(var5));
                        if (Statics.field460 == class132.field2057) {
                            Statics.field1276 = class185.field2852;
                        } else {
                            Statics.field1276 = class185.field2860;
                        }
                    case 5:
                    default:
                        break;
                    case 6:
                        Statics.field1022 = var5;
                        break;
                    case 7:
                        field463 = Integer.parseInt(var5);
                        break;
                    case 8:
                        if (var5.equalsIgnoreCase(class2.field15)) {
                            field567 = true;
                        } else {
                            field567 = false;
                        }
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field15)) {
                            field464 = 1;
                        } else {
                            field464 = 0;
                        }
                }
            }
        }
        method164();
        Statics.field2302 = this.getCodeBase().getHost();
        String var13 = Statics.field458.field2052;
        byte var14 = 0;
        try {
            class81.method198("oldschool", var13, var14, 16);
        } catch (Exception var16) {
            class79.method811((String) null, var16);
        }
        Statics.field371 = this;
        this.method1455(765, 503, 10);
    }

    @ObfuscatedName("i.e(I)V")
    public static final void method164() {
        class94.field1551 = false;
        field617 = false;
    }

    @ObfuscatedName("client.q(B)V")
    public final void method276() {
        Statics.field1803 = field459 == 0 ? 43594 : field557 + 40000;
        Statics.field494 = field459 == 0 ? 443 : field557 + 50000;
        Statics.field325 = Statics.field1803;
        Statics.field2561 = class160.field2704;
        Statics.field2710 = class160.field2703;
        Statics.field2716 = class160.field2701;
        Statics.field2717 = class160.field2699;
        if (Statics.field1308.toLowerCase().indexOf("microsoft") == -1) {
            class74.field1350[44] = 71;
            class74.field1350[45] = 26;
            class74.field1350[46] = 72;
            class74.field1350[47] = 73;
            class74.field1350[59] = 57;
            class74.field1350[61] = 27;
            class74.field1350[91] = 42;
            class74.field1350[92] = 74;
            class74.field1350[93] = 43;
            class74.field1350[192] = 28;
            class74.field1350[222] = 58;
            class74.field1350[520] = 59;
        } else {
            class74.field1350[186] = 57;
            class74.field1350[187] = 27;
            class74.field1350[188] = 71;
            class74.field1350[189] = 26;
            class74.field1350[190] = 72;
            class74.field1350[191] = 73;
            class74.field1350[192] = 58;
            class74.field1350[219] = 42;
            class74.field1350[220] = 74;
            class74.field1350[221] = 43;
            class74.field1350[222] = 59;
            class74.field1350[223] = 28;
        }
        Canvas var1 = Statics.field223;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class74.field1355);
        var1.addFocusListener(class74.field1355);
        class76.method344(Statics.field223);
        class77 var2;
        try {
            var2 = new class77();
        } catch (Throwable var4) {
            var2 = null;
        }
        Statics.field372 = var2;
        if (Statics.field372 != null) {
            Statics.field372.method1386(Statics.field223);
        }
        Statics.field2047 = new class70(255, class81.field1417, class81.field1418, 500000);
        if (field459 != 0) {
            field474 = true;
        }
    }

    @ObfuscatedName("client.u(I)V")
    public final void method266() {
        field510++;
        this.method503();
        class156.method2450();
        class137.method2879();
        method120();
        class74 var1 = class74.field1355;
        synchronized (class74.field1355) {
            class74.field1334++;
            class74.field1333 = class74.field1348;
            class74.field1319 = 0;
            if (class74.field1341 >= 0) {
                while (class74.field1341 != class74.field1340) {
                    int var3 = class74.field1339[class74.field1340];
                    class74.field1340 = class74.field1340 + 1 & 0x7F;
                    if (var3 < 0) {
                        class74.field1338[~var3] = false;
                    } else {
                        if (!class74.field1338[var3] && class74.field1319 < class74.field1345.length - 1) {
                            class74.field1345[++class74.field1319 - 1] = var3;
                        }
                        class74.field1338[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class74.field1338[var2] = false;
                }
                class74.field1341 = class74.field1340;
            }
            class74.field1348 = class74.field1342;
        }
        class76 var5 = class76.field1379;
        synchronized (class76.field1379) {
            class76.field1369 = class76.field1365;
            class76.field1376 = class76.field1366;
            class76.field1370 = class76.field1367;
            class76.field1375 = class76.field1371;
            class76.field1382 = class76.field1372;
            class76.field1380 = class76.field1373;
            class76.field1378 = class76.field1363;
            class76.field1371 = 0;
        }
        if (Statics.field372 != null) {
            int var7 = Statics.field372.method1388();
            field658 = var7;
        }
        if (field465 == 0) {
            Statics.method1265();
            class72.method1410();
        } else if (field465 == 5) {
            class20.method2058(this);
            Statics.method1265();
            class72.method1410();
        } else if (field465 == 10) {
            class20.method2058(this);
        } else if (field465 == 20) {
            class20.method2058(this);
            method2928();
        } else if (field465 == 25) {
            method2055();
        }
        if (field465 == 30) {
            method123();
        } else if (field465 == 40) {
            method2928();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method247() {
        boolean var1;
        label150: {
            try {
                if (class137.field2322 == 2) {
                    if (Statics.field195 == null) {
                        Statics.field195 = class138.method2699(Statics.field2323, Statics.field2327, Statics.field2325);
                        if (Statics.field195 == null) {
                            var1 = false;
                            break label150;
                        }
                    }
                    if (Statics.field1249 == null) {
                        Statics.field1249 = new class57(Statics.field2320, Statics.field2319);
                    }
                    if (Statics.field2318.method2722(Statics.field195, Statics.field2321, Statics.field1249, 22050)) {
                        Statics.field2318.method2723();
                        Statics.field2318.method2771(Statics.field2326);
                        Statics.field2318.method2768(Statics.field195, Statics.field2328);
                        class137.field2322 = 0;
                        Statics.field195 = null;
                        Statics.field1249 = null;
                        Statics.field2323 = null;
                        var1 = true;
                        break label150;
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
                Statics.field2318.method2726();
                class137.field2322 = 0;
                Statics.field195 = null;
                Statics.field1249 = null;
                Statics.field2323 = null;
            }
            var1 = false;
        }
        if (var1 && field699 && Statics.field370 != null) {
            Statics.field370.method1173();
        }
        if (field1303) {
            Canvas var4 = Statics.field223;
            var4.removeKeyListener(class74.field1355);
            var4.removeFocusListener(class74.field1355);
            class74.field1341 = -1;
            class76.method2232(Statics.field223);
            if (Statics.field372 != null) {
                Statics.field372.method1397(Statics.field223);
            }
            this.method1482();
            Canvas var5 = Statics.field223;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class74.field1355);
            var5.addFocusListener(class74.field1355);
            class76.method344(Statics.field223);
            if (Statics.field372 != null) {
                Statics.field372.method1386(Statics.field223);
            }
        }
        if (field465 == 0) {
            int var6 = class20.field308;
            String var7 = class20.field298;
            Color var8 = null;
            try {
                Graphics var9 = Statics.field223.getGraphics();
                if (Statics.field1184 == null) {
                    Statics.field1184 = new Font("Helvetica", 1, 13);
                    Statics.field241 = Statics.field223.getFontMetrics(Statics.field1184);
                }
                if (field1304) {
                    field1304 = false;
                    var9.setColor(Color.black);
                    var9.fillRect(0, 0, Statics.field886, Statics.field186);
                }
                if (var8 == null) {
                    var8 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1810 == null) {
                        Statics.field1810 = Statics.field223.createImage(304, 34);
                    }
                    Graphics var10 = Statics.field1810.getGraphics();
                    var10.setColor(var8);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, var6 * 3, 30);
                    var10.setColor(Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(var6 * 3 + 2, 2, 300 - var6 * 3, 30);
                    var10.setFont(Statics.field1184);
                    var10.setColor(Color.white);
                    var10.drawString(var7, (304 - Statics.field241.stringWidth(var7)) / 2, 22);
                    var9.drawImage(Statics.field1810, Statics.field886 / 2 - 152, Statics.field186 / 2 - 18, (ImageObserver) null);
                } catch (Exception var23) {
                    int var12 = Statics.field886 / 2 - 152;
                    int var13 = Statics.field186 / 2 - 18;
                    var9.setColor(var8);
                    var9.drawRect(var12, var13, 303, 33);
                    var9.fillRect(var12 + 2, var13 + 2, var6 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(var12 + 1, var13 + 1, 301, 31);
                    var9.fillRect(var6 * 3 + var12 + 2, var13 + 2, 300 - var6 * 3, 30);
                    var9.setFont(Statics.field1184);
                    var9.setColor(Color.white);
                    var9.drawString(var7, var12 + (304 - Statics.field241.stringWidth(var7)) / 2, var13 + 22);
                }
            } catch (Exception var24) {
                Statics.field223.repaint();
            }
        } else if (field465 == 5) {
            class20.method2139(Statics.field78, Statics.field120);
        } else if (field465 == 10) {
            class20.method2139(Statics.field78, Statics.field120);
        } else if (field465 == 20) {
            class20.method2139(Statics.field78, Statics.field120);
        } else if (field465 == 25) {
            if (field517 == 1) {
                if (field513 > field498) {
                    field498 = field513;
                }
                int var15 = (field498 * 50 - field513 * 50) / field498;
                method202(class133.field2073 + class2.field16 + class2.field25 + var15 + "%" + class2.field19, false);
            } else if (field517 == 2) {
                if (field515 > field516) {
                    field516 = field515;
                }
                int var16 = (field516 * 50 - field515 * 50) / field516 + 50;
                method202(class133.field2073 + class2.field16 + class2.field25 + var16 + "%" + class2.field19, false);
            } else {
                method202(class133.field2073, false);
            }
        } else if (field465 == 30) {
            method214();
        } else if (field465 == 40) {
            method202(class133.field2172 + class2.field16 + class133.field2112, false);
        }
        if (field465 == 30 && field469 == 0 && !field1304) {
            try {
                Graphics var17 = Statics.field223.getGraphics();
                for (int var18 = 0; var18 < field520; var18++) {
                    if (field666[var18]) {
                        Statics.field896.method1630(var17, field723[var18], field705[var18], field664[var18], field708[var18]);
                        field666[var18] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field223.repaint();
            }
        } else if (field465 > 0) {
            try {
                Graphics var20 = Statics.field223.getGraphics();
                Statics.field896.method1641(var20, 0, 0);
                field1304 = false;
                for (int var21 = 0; var21 < field520; var21++) {
                    field666[var21] = false;
                }
            } catch (Exception var25) {
                Statics.field223.repaint();
            }
        }
    }

    @ObfuscatedName("client.l(I)V")
    public final void method248() {
        if (Statics.field592 != null) {
            Statics.field592.field252 = false;
        }
        Statics.field592 = null;
        if (Statics.field18 != null) {
            Statics.field18.method1413();
            Statics.field18 = null;
        }
        if (class74.field1355 != null) {
            class74 var1 = class74.field1355;
            synchronized (class74.field1355) {
                class74.field1355 = null;
            }
        }
        if (class76.field1379 != null) {
            class76 var3 = class76.field1379;
            synchronized (class76.field1379) {
                class76.field1379 = null;
            }
        }
        Statics.field372 = null;
        if (Statics.field370 != null) {
            Statics.field370.method1177();
        }
        if (Statics.field221 != null) {
            Statics.field221.method1177();
        }
        class152.method151();
        Statics.method2948();
        class81.method807();
    }

    @ObfuscatedName("cd.o(II)V")
    public static void method2054(int arg0) {
        if (field465 == arg0) {
            return;
        }
        if (field465 == 0) {
            class72.method681();
        }
        if (arg0 == 20 || arg0 == 40) {
            field490 = 0;
            field491 = 0;
            field492 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field499 != null) {
            Statics.field499.method1413();
            Statics.field499 = null;
        }
        if (field465 == 25) {
            field517 = 0;
            field513 = 0;
            field498 = 1;
            field515 = 0;
            field516 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class20.method29(Statics.field223, Statics.field362, Statics.field2383);
        } else if (Statics.field320) {
            Statics.field293 = null;
            Statics.field294 = null;
            Statics.field295 = null;
            Statics.field296 = null;
            Statics.field1807 = null;
            Statics.field731 = null;
            Statics.field194 = null;
            Statics.field742 = null;
            Statics.field852 = null;
            Statics.field2500 = null;
            Statics.field219 = null;
            Statics.field2064 = null;
            Statics.field2329 = null;
            Statics.field1491 = null;
            Statics.field299 = null;
            Statics.field738 = null;
            Statics.field1802 = null;
            Statics.field118 = null;
            Statics.field324 = null;
            Statics.field303 = null;
            class137.field2322 = 1;
            Statics.field2323 = null;
            Statics.field2327 = -1;
            Statics.field2325 = -1;
            Statics.field2326 = 0;
            Statics.field2328 = false;
            Statics.field2332 = 2;
            class152.method1310(true);
            Statics.field320 = false;
        }
        field465 = arg0;
    }

    @ObfuscatedName("client.h(B)V")
    public void method503() {
        if (field465 != 1000) {
            boolean var1 = class152.method2244();
            if (!var1) {
                this.method250();
            }
        }
    }

    @ObfuscatedName("client.p(B)V")
    public void method250() {
        if (class152.field2519 >= 4) {
            this.method1456("js5crc");
            field465 = 1000;
            return;
        }
        if (class152.field2528 >= 4) {
            if (field465 <= 5) {
                this.method1456("js5io");
                field465 = 1000;
                return;
            }
            field719 = 3000;
            class152.field2528 = 3;
        }
        if (--field719 + 1 > 0) {
            return;
        }
        try {
            if (field486 == 0) {
                Statics.field190 = Statics.field960.method1512(Statics.field2302, Statics.field325);
                field486++;
            }
            if (field486 == 1) {
                if (Statics.field190.field1388 == 2) {
                    this.method251(-1);
                    return;
                }
                if (Statics.field190.field1388 == 1) {
                    field486++;
                }
            }
            if (field486 == 2) {
                Statics.field71 = new class69((Socket) Statics.field190.field1385, Statics.field960);
                class126 var1 = new class126(5);
                var1.method2452(15);
                var1.method2455(10);
                Statics.field71.method1416(var1.field2029, 0, 5);
                field486++;
                Statics.field488 = class120.method1383();
            }
            if (field486 == 3) {
                if (field465 <= 5 || Statics.field71.method1414() > 0) {
                    int var2 = Statics.field71.method1412();
                    if (var2 != 0) {
                        this.method251(var2);
                        return;
                    }
                    field486++;
                } else if (class120.method1383() - Statics.field488 > 30000L) {
                    this.method251(-2);
                    return;
                }
            }
            if (field486 == 4) {
                class69 var3 = Statics.field71;
                boolean var4 = field465 > 20;
                if (Statics.field2509 != null) {
                    try {
                        Statics.field2509.method1413();
                    } catch (Exception var14) {
                    }
                    Statics.field2509 = null;
                }
                Statics.field2509 = var3;
                class152.method1310(var4);
                class152.field2521.field2027 = 0;
                Statics.field376 = null;
                Statics.field854 = null;
                class152.field2523 = 0;
                while (true) {
                    class154 var6 = (class154) class152.field2514.method3275();
                    if (var6 == null) {
                        while (true) {
                            class154 var7 = (class154) class152.field2522.method3275();
                            if (var7 == null) {
                                if (class152.field2526 != 0) {
                                    try {
                                        class126 var8 = new class126(4);
                                        var8.method2452(4);
                                        var8.method2452(class152.field2526);
                                        var8.method2642(0);
                                        Statics.field2509.method1416(var8.field2029, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2509.method1413();
                                        } catch (Exception var12) {
                                        }
                                        class152.field2528++;
                                        Statics.field2509 = null;
                                    }
                                }
                                class152.field2510 = 0;
                                Statics.field2515 = class120.method1383();
                                Statics.field190 = null;
                                Statics.field71 = null;
                                field486 = 0;
                                field489 = 0;
                                return;
                            }
                            class152.field2516.method3236(var7);
                            class152.field2517.method3284(var7, var7.field2814);
                            class152.field2518++;
                            class152.field2520--;
                        }
                    }
                    class152.field2512.method3284(var6, var6.field2814);
                    class152.field2513++;
                    class152.field2527--;
                }
            }
        } catch (IOException var15) {
            this.method251(-3);
        }
    }

    @ObfuscatedName("client.d(II)V")
    public void method251(int arg0) {
        Statics.field190 = null;
        Statics.field71 = null;
        field486 = 0;
        if (Statics.field325 == Statics.field1803) {
            Statics.field325 = Statics.field494;
        } else {
            Statics.field325 = Statics.field1803;
        }
        field489++;
        if (field489 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field465 <= 5) {
                this.method1456("js5connect_full");
                field465 = 1000;
            } else {
                field719 = 3000;
            }
        } else if (field489 >= 2 && arg0 == 6) {
            this.method1456("js5connect_outofdate");
            field465 = 1000;
        } else if (field489 >= 4) {
            if (field465 <= 5) {
                this.method1456("js5connect");
                field465 = 1000;
            } else {
                field719 = 3000;
            }
        }
    }

    @ObfuscatedName("bc.z(IZZZB)Leq;")
    public static class153 method1372(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1417 != null) {
            var4 = new class70(arg0, class81.field1417, Statics.field938[arg0], 1000000);
        }
        return new class153(var4, Statics.field2047, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("x.t(B)V")
    public static void method204() {
        Statics.field1368 = new int[33];
        Statics.field541 = new int[33];
        Statics.field1503 = new int[151];
        Statics.field1192 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field2744.field1457[Statics.field2744.field1459 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1368[var0] = var1;
            Statics.field541[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field2744.field1457[Statics.field2744.field1459 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1503[var4 - 5] = var5 - 25;
            Statics.field1192[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("ep.i(I)V")
    public static final void method2928() {
        try {
            if (field490 == 0) {
                if (Statics.field18 != null) {
                    Statics.field18.method1413();
                    Statics.field18 = null;
                }
                Statics.field1652 = null;
                field511 = false;
                field491 = 0;
                field490 = 1;
            }
            if (field490 == 1) {
                if (Statics.field1652 == null) {
                    Statics.field1652 = Statics.field960.method1512(Statics.field2302, Statics.field325);
                }
                if (Statics.field1652.field1388 == 2) {
                    throw new IOException();
                }
                if (Statics.field1652.field1388 == 1) {
                    Statics.field18 = new class69((Socket) Statics.field1652.field1385, Statics.field960);
                    Statics.field1652 = null;
                    field490 = 2;
                }
            }
            if (field490 == 2) {
                field500.field2027 = 0;
                field500.method2452(14);
                Statics.field18.method1416(field500.field2029, 0, 1);
                field502.field2027 = 0;
                field490 = 3;
            }
            if (field490 == 3) {
                if (Statics.field370 != null) {
                    Statics.field370.method1181();
                }
                if (Statics.field221 != null) {
                    Statics.field221.method1181();
                }
                int var0 = Statics.field18.method1412();
                if (Statics.field370 != null) {
                    Statics.field370.method1181();
                }
                if (Statics.field221 != null) {
                    Statics.field221.method1181();
                }
                if (var0 != 0) {
                    method9(var0);
                    return;
                }
                field502.field2027 = 0;
                field490 = 5;
            }
            if (field490 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field500.field2027 = 0;
                field500.method2452(10);
                field500.method2455(var1[0]);
                field500.method2455(var1[1]);
                field500.method2455(var1[2]);
                field500.method2455(var1[3]);
                field500.method2456(0L);
                field500.method2457(class20.field315);
                field500.method2498(class6.field89, class6.field79);
                field461.field2027 = 0;
                if (field465 == 40) {
                    field461.method2452(18);
                } else {
                    field461.method2452(16);
                }
                field461.method2642(0);
                int var2 = field461.field2027;
                field461.method2455(10);
                field461.method2460(field500.field2029, 0, field500.field2027);
                int var3 = field461.field2027;
                field461.method2457(class20.field314);
                field461.method2452(field617 ? 1 : 0);
                class81.method139(field461);
                class126 var4 = new class126(Statics.field1238.method2952());
                Statics.field1238.method2954(var4);
                field461.method2460(var4.field2029, 0, var4.field2029.length);
                field461.method2455(Statics.field1083.field2501);
                field461.method2455(Statics.field92.field2501);
                field461.method2455(Statics.field1979.field2501);
                field461.method2455(Statics.field1245.field2501);
                field461.method2455(Statics.field23.field2501);
                field461.method2455(Statics.field251.field2501);
                field461.method2455(Statics.field348.field2501);
                field461.method2455(Statics.field347.field2501);
                field461.method2455(Statics.field2383.field2501);
                field461.method2455(Statics.field72.field2501);
                field461.method2455(Statics.field362.field2501);
                field461.method2455(Statics.field1999.field2501);
                field461.method2455(Statics.field2000.field2501);
                field461.method2455(Statics.field10.field2501);
                field461.method2455(Statics.field102.field2501);
                field461.method2455(Statics.field170.field2501);
                field461.method2556(var1, var3, field461.field2027);
                field461.method2453(field461.field2027 - var2);
                Statics.field18.method1416(field461.field2029, 0, field461.field2027);
                field500.method2330(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field502.method2330(var1);
                field490 = 6;
            }
            if (field490 == 6 && Statics.field18.method1414() > 0) {
                int var6 = Statics.field18.method1412();
                if (var6 == 21 && field465 == 20) {
                    field490 = 7;
                } else if (var6 == 2) {
                    field490 = 9;
                } else if (var6 == 15 && field465 == 40) {
                    field500.field2027 = 0;
                    field502.field2027 = 0;
                    field504 = -1;
                    field508 = -1;
                    field482 = -1;
                    field547 = -1;
                    field693 = 0;
                    field505 = 0;
                    field653 = 0;
                    field525 = 0;
                    field683 = false;
                    field456 = 0;
                    field694 = 0;
                    for (int var7 = 0; var7 < field582.length; var7++) {
                        if (field582[var7] != null) {
                            field582[var7].field411 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field496.length; var8++) {
                        if (field496[var8] != null) {
                            field496[var8].field411 = -1;
                        }
                    }
                    class18.method161();
                    method2054(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field665[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field492 < 1) {
                    field492++;
                    field490 = 0;
                } else {
                    method9(var6);
                    return;
                }
            }
            if (field490 == 7 && Statics.field18.method1414() > 0) {
                field493 = (Statics.field18.method1412() + 3) * 60;
                field490 = 8;
            }
            if (field490 == 8) {
                field491 = 0;
                class20.method809(class133.field2285, class133.field2161, field493 / 60 + class133.field2099);
                if (--field493 <= 0) {
                    field490 = 0;
                }
            } else {
                if (field490 == 9 && Statics.field18.method1414() >= 8) {
                    field629 = Statics.field18.method1412();
                    field663 = Statics.field18.method1412() == 1;
                    field588 = Statics.field18.method1412();
                    field588 <<= 0x8;
                    field588 += Statics.field18.method1412();
                    field589 = Statics.field18.method1412();
                    Statics.field18.method1415(field502.field2029, 0, 1);
                    field502.field2027 = 0;
                    field504 = field502.method2333();
                    Statics.field18.method1415(field502.field2029, 0, 2);
                    field502.field2027 = 0;
                    field693 = field502.method2468();
                    if (field589 == 1) {
                        try {
                            client var10 = Statics.field371;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field371;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    }
                    field490 = 10;
                }
                if (field490 != 10) {
                    field491++;
                    if (field491 > 2000) {
                        if (field492 < 1) {
                            if (Statics.field325 == Statics.field1803) {
                                Statics.field325 = Statics.field494;
                            } else {
                                Statics.field325 = Statics.field1803;
                            }
                            field492++;
                            field490 = 0;
                        } else {
                            method9(-3);
                        }
                    }
                } else if (Statics.field18.method1414() >= field693) {
                    field502.field2027 = 0;
                    Statics.field18.method1415(field502.field2029, 0, field693);
                    field688 = 1L;
                    field501 = -1;
                    Statics.field592.field243 = 0;
                    Statics.field1401 = true;
                    field546 = true;
                    field686 = -1L;
                    class181.method2818();
                    field500.field2027 = 0;
                    field502.field2027 = 0;
                    field504 = -1;
                    field508 = -1;
                    field482 = -1;
                    field547 = -1;
                    field505 = 0;
                    field653 = 0;
                    field711 = 0;
                    field476 = 0;
                    field525 = 0;
                    field683 = false;
                    class76.field1377 = 0;
                    for (int var14 = 0; var14 < 100; var14++) {
                        field676[var14] = null;
                    }
                    field704 = 0;
                    field616 = 0;
                    field717 = false;
                    field702 = 0;
                    field528 = (int) (Math.random() * 100.0D) - 50;
                    field530 = (int) (Math.random() * 110.0D) - 55;
                    field514 = (int) (Math.random() * 80.0D) - 40;
                    field535 = (int) (Math.random() * 120.0D) - 60;
                    field621 = (int) (Math.random() * 30.0D) - 20;
                    field549 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field456 = 0;
                    field612 = -1;
                    field694 = 0;
                    field695 = 0;
                    field618 = 0;
                    field497 = 0;
                    for (int var15 = 0; var15 < 2048; var15++) {
                        field582[var15] = null;
                        field572[var15] = null;
                    }
                    for (int var16 = 0; var16 < 32768; var16++) {
                        field496[var16] = null;
                    }
                    Statics.field2540 = field582[2047] = new class3();
                    field598.method3288();
                    field599.method3288();
                    for (int var17 = 0; var17 < 4; var17++) {
                        for (int var18 = 0; var18 < 104; var18++) {
                            for (int var19 = 0; var19 < 104; var19++) {
                                field596[var17][var18][var19] = null;
                            }
                        }
                    }
                    field597 = new class176();
                    field715 = 0;
                    field714 = 0;
                    for (int var20 = 0; var20 < Statics.field1020; var20++) {
                        class41 var21 = class41.method199(var20);
                        if (var21 != null && var21.field1021 == 0) {
                            class158.field2692[var20] = 0;
                            class158.field2693[var20] = 0;
                        }
                    }
                    for (int var22 = 0; var22 < field467.length; var22++) {
                        field467[var22] = -1;
                    }
                    if (field622 != -1) {
                        int var23 = field622;
                        if (var23 != -1 && Statics.field2827[var23]) {
                            Statics.field2571.method2999(var23);
                            if (Statics.field2638[var23] != null) {
                                boolean var24 = true;
                                for (int var25 = 0; var25 < Statics.field2638[var23].length; var25++) {
                                    if (Statics.field2638[var23][var25] != null) {
                                        if (Statics.field2638[var23][var25].field2687 == 2) {
                                            var24 = false;
                                        } else {
                                            Statics.field2638[var23][var25] = null;
                                        }
                                    }
                                }
                                if (var24) {
                                    Statics.field2638[var23] = null;
                                }
                                Statics.field2827[var23] = false;
                            }
                        }
                    }
                    for (class4 var26 = (class4) field623.method3275(); var26 != null; var26 = (class4) field623.method3274()) {
                        method89(var26, true);
                    }
                    field622 = -1;
                    field623 = new class174(8);
                    field626 = null;
                    field683 = false;
                    field525 = 0;
                    field682.method3152((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var27 = 0; var27 < 8; var27++) {
                        field593[var27] = null;
                        field638[var27] = false;
                    }
                    class18.method161();
                    field466 = true;
                    for (int var28 = 0; var28 < 100; var28++) {
                        field665[var28] = true;
                    }
                    field462 = null;
                    Statics.field856 = 0;
                    Statics.field107 = null;
                    Statics.field1624 = -1;
                    method119(false);
                    field504 = -1;
                }
            }
        } catch (IOException var32) {
            if (field492 < 1) {
                if (Statics.field325 == Statics.field1803) {
                    Statics.field325 = Statics.field494;
                } else {
                    Statics.field325 = Statics.field1803;
                }
                field492++;
                field490 = 0;
            } else {
                method9(-2);
            }
        }
    }

    @ObfuscatedName("f.j(II)V")
    public static void method9(int arg0) {
        if (arg0 == -3) {
            class20.method809(class133.field2100, class133.field2175, class133.field2291);
        } else if (arg0 == -2) {
            class20.method809(class133.field2103, class133.field2104, class133.field2252);
        } else if (arg0 == -1) {
            class20.method809(class133.field2106, class133.field2107, class133.field2108);
        } else if (arg0 == 3) {
            class20.method809(class133.field2109, class133.field2110, class133.field2111);
        } else if (arg0 == 4) {
            class20.method809(class133.field2274, class133.field2113, class133.field2114);
        } else if (arg0 == 5) {
            class20.method809(class133.field2115, class133.field2150, class133.field2117);
        } else if (arg0 == 6) {
            class20.method809(class133.field2118, class133.field2119, class133.field2120);
        } else if (arg0 == 7) {
            class20.method809(class133.field2121, class133.field2182, class133.field2123);
        } else if (arg0 == 8) {
            class20.method809(class133.field2124, class133.field2066, class133.field2126);
        } else if (arg0 == 9) {
            class20.method809(class133.field2127, class133.field2074, class133.field2101);
        } else if (arg0 == 10) {
            class20.method809(class133.field2130, class133.field2240, class133.field2132);
        } else if (arg0 == 11) {
            class20.method809(class133.field2133, class133.field2134, class133.field2135);
        } else if (arg0 == 12) {
            class20.method809(class133.field2136, class133.field2137, class133.field2138);
        } else if (arg0 == 13) {
            class20.method809(class133.field2139, class133.field2071, class133.field2224);
        } else if (arg0 == 14) {
            class20.method809(class133.field2142, class133.field2143, class133.field2144);
        } else if (arg0 == 16) {
            class20.method809(class133.field2145, class133.field2183, class133.field2147);
        } else if (arg0 == 17) {
            class20.method809(class133.field2097, class133.field2190, class133.field2087);
        } else if (arg0 == 18) {
            class20.method809(class133.field2151, class133.field2116, class133.field2153);
        } else if (arg0 == 19) {
            class20.method809(class133.field2067, class133.field2155, class133.field2193);
        } else if (arg0 == 20) {
            class20.method809(class133.field2185, class133.field2158, class133.field2125);
        } else if (arg0 == 22) {
            class20.method809(class133.field2160, class133.field2154, class133.field2089);
        } else if (arg0 == 23) {
            class20.method809(class133.field2170, class133.field2164, class133.field2165);
        } else if (arg0 == 24) {
            class20.method809(class133.field2128, class133.field2188, class133.field2168);
        } else if (arg0 == 25) {
            class20.method809(class133.field2159, class133.field2208, class133.field2235);
        } else if (arg0 == 26) {
            class20.method809(class133.field2141, class133.field2173, class133.field2174);
        } else if (arg0 == 27) {
            class20.method809(class133.field2191, class133.field2219, class133.field2177);
        } else if (arg0 == 31) {
            class20.method809(class133.field2156, class133.field2131, class133.field2251);
        } else if (arg0 == 32) {
            class20.method809(class133.field2247, class133.field2292, class133.field2189);
        } else if (arg0 == 37) {
            class20.method809(class133.field2157, class133.field2234, class133.field2237);
        } else if (arg0 == 38) {
            class20.method809(class133.field2105, class133.field2194, class133.field2176);
        } else if (arg0 == 55) {
            class20.method809(class133.field2196, class133.field2197, class133.field2198);
        } else {
            class20.method809(class133.field2199, class133.field2200, class133.field2201);
        }
        method2054(10);
    }

    @ObfuscatedName("b.a(I)V")
    public static final void method216() {
        if (Statics.field18 != null) {
            Statics.field18.method1413();
            Statics.field18 = null;
        }
        method832();
        Statics.field220.method1884();
        for (int var0 = 0; var0 < 4; var0++) {
            field519[var0].method3217();
        }
        System.gc();
        class137.field2322 = 1;
        Statics.field2323 = null;
        Statics.field2327 = -1;
        Statics.field2325 = -1;
        Statics.field2326 = 0;
        Statics.field2328 = false;
        Statics.field2332 = 2;
        field698 = -1;
        field699 = false;
        class7.method130();
        method2054(10);
    }

    @ObfuscatedName("aj.g(S)V")
    public static final void method832() {
        class36.method818();
        class32.field848.method3227();
        class35.field906.method3227();
        class31.method2396();
        class30.method2229();
        class39.method1626();
        class33.method132();
        class34.field881.method3227();
        class34.field884.method3227();
        class37.field932.method3227();
        class41.field1023.method3227();
        Statics.method755();
        class157.field2569.method3227();
        class157.field2570.method3227();
        class157.field2690.method3227();
        ((class109) Statics.field1747).method2237();
        class5.field69.method3227();
        Statics.field1083.method2974();
        Statics.field92.method2974();
        Statics.field1245.method2974();
        Statics.field23.method2974();
        Statics.field251.method2974();
        Statics.field348.method2974();
        Statics.field347.method2974();
        Statics.field2383.method2974();
        Statics.field72.method2974();
        Statics.field362.method2974();
        Statics.field1999.method2974();
        Statics.field2000.method2974();
    }

    @ObfuscatedName("d.b(B)V")
    public static final void method123() {
        if (field653 > 1) {
            field653--;
        }
        if (field711 > 0) {
            field711--;
        }
        if (field511) {
            field511 = false;
            if (field711 > 0) {
                method216();
            } else {
                method2054(40);
                Statics.field499 = Statics.field18;
                Statics.field18 = null;
            }
            return;
        }
        for (int var0 = 0; var0 < 100 && method1434(); var0++) {
        }
        if (field465 != 30) {
            return;
        }
        class181.method2817(field500, 94);
        Object var1 = Statics.field592.field247;
        synchronized (Statics.field592.field247) {
            if (!field690) {
                Statics.field592.field243 = 0;
            } else if (class76.field1375 != 0 || Statics.field592.field243 >= 40) {
                field500.method2331(233);
                field500.method2452(0);
                int var2 = field500.field2027;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field592.field243 && field500.field2027 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field592.field246[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field592.field242[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field592.field246[var4] == -1 && Statics.field592.field242[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field470 != var6 || field471 != var5) {
                        int var8 = var6 - field470;
                        field470 = var6;
                        int var9 = var5 - field471;
                        field471 = var5;
                        if (field501 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field500.method2642((field501 << 12) + (var8 << 6) + var9);
                            field501 = 0;
                        } else if (field501 < 8) {
                            field500.method2568((field501 << 19) + 8388608 + var7);
                            field501 = 0;
                        } else {
                            field500.method2455((field501 << 19) + -1073741824 + var7);
                            field501 = 0;
                        }
                    } else if (field501 < 2047) {
                        field501++;
                    }
                }
                field500.method2463(field500.field2027 - var2);
                if (var3 >= Statics.field592.field243) {
                    Statics.field592.field243 = 0;
                } else {
                    Statics.field592.field243 -= var3;
                    for (int var10 = 0; var10 < Statics.field592.field243; var10++) {
                        Statics.field592.field242[var10] = Statics.field592.field242[var3 + var10];
                        Statics.field592.field246[var10] = Statics.field592.field246[var3 + var10];
                    }
                }
            }
        }
        if (class76.field1375 != 0) {
            long var12 = (class76.field1378 - field688 * -1L) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field688 = class76.field1378 * -1L;
            int var14 = class76.field1380;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class76.field1382;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class76.field1375 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field500.method2331(133);
            field500.method2455((var17 << 19) + (var18 << 20) + var16);
        }
        if (class74.field1319 > 0) {
            field500.method2331(215);
            field500.method2642(0);
            int var19 = field500.field2027;
            long var20 = class120.method1383();
            for (int var22 = 0; var22 < class74.field1319; var22++) {
                long var23 = var20 - field686;
                if (var23 > 16777215L) {
                    var23 = 16777215L;
                }
                field686 = var20;
                field500.method2488(class74.field1345[var22]);
                field500.method2501((int) var23);
            }
            field500.method2453(field500.field2027 - var19);
        }
        if (field526 > 0) {
            field526--;
        }
        if (class74.field1338[96] || class74.field1338[97] || class74.field1338[98] || class74.field1338[99]) {
            field553 = true;
        }
        if (field553 && field526 <= 0) {
            field526 = 20;
            field553 = false;
            field500.method2331(130);
            field500.method2642(field475);
            field500.method2493(field549);
        }
        if (Statics.field1401 && !field546) {
            field546 = true;
            field500.method2331(91);
            field500.method2452(1);
        }
        if (!Statics.field1401 && field546) {
            field546 = false;
            field500.method2331(91);
            field500.method2452(0);
        }
        method264();
        if (field465 != 30) {
            return;
        }
        method1625();
        int var10002;
        for (int var25 = 0; var25 < field702; var25++) {
            var10002 = field577[var25]--;
            if (field577[var25] >= -10) {
                class56 var27 = field707[var25];
                if (var27 == null) {
                    class56 var10000 = (class56) null;
                    var27 = class56.method1280(Statics.field23, field703[var25], 0);
                    if (var27 == null) {
                        continue;
                    }
                    field577[var25] += var27.method1282();
                    field707[var25] = var27;
                }
                if (field577[var25] < 0) {
                    int var34;
                    if (field706[var25] == 0) {
                        var34 = field472;
                    } else {
                        int var28 = (field706[var25] & 0xFF) * 128;
                        int var29 = field706[var25] >> 16 & 0xFF;
                        int var30 = var29 * 128 + 64 - Statics.field2540.field410;
                        if (var30 < 0) {
                            var30 = -var30;
                        }
                        int var31 = field706[var25] >> 8 & 0xFF;
                        int var32 = var31 * 128 + 64 - Statics.field2540.field397;
                        if (var32 < 0) {
                            var32 = -var32;
                        }
                        int var33 = var30 + var32 - 128;
                        if (var33 > var28) {
                            field577[var25] = -100;
                            continue;
                        }
                        if (var33 < 0) {
                            var33 = 0;
                        }
                        var34 = field701 * (var28 - var33) / var28;
                    }
                    if (var34 > 0) {
                        class62 var35 = var27.method1281().method1349(Statics.field724);
                        class44 var36 = class44.method1000(var35, 100, var34);
                        var36.method1101(field595[var25] - 1);
                        Statics.field754.method1120(var36);
                    }
                    field577[var25] = -100;
                }
            } else {
                field702--;
                for (int var26 = var25; var26 < field702; var26++) {
                    field703[var26] = field703[var26 + 1];
                    field707[var26] = field707[var26 + 1];
                    field595[var26] = field595[var26 + 1];
                    field577[var26] = field577[var26 + 1];
                    field706[var26] = field706[var26 + 1];
                }
                var25--;
            }
        }
        if (field699) {
            boolean var37;
            if (class137.field2322 == 0) {
                var37 = Statics.field2318.method2793();
            } else {
                var37 = true;
            }
            if (!var37) {
                if (field697 != 0 && field698 != -1) {
                    class137.method799(Statics.field348, field698, 0, field697, false);
                }
                field699 = false;
            }
        }
        field505++;
        if (field505 <= 750) {
            Statics.method1399();
            method219();
            for (int var38 = -1; var38 < field618; var38++) {
                int var39;
                if (var38 == -1) {
                    var39 = 2047;
                } else {
                    var39 = field584[var38];
                }
                class3 var40 = field582[var39];
                if (var40 != null && var40.field398 > 0) {
                    var40.field398--;
                    if (var40.field398 == 0) {
                        var40.field420 = null;
                    }
                }
            }
            for (int var41 = 0; var41 < field497; var41++) {
                int var42 = field630[var41];
                class24 var43 = field496[var42];
                if (var43 != null && var43.field398 > 0) {
                    var43.field398--;
                    if (var43.field398 == 0) {
                        var43.field420 = null;
                    }
                }
            }
            field540++;
            if (field656 != 0) {
                field571 += 20;
                if (field571 >= 400) {
                    field656 = 0;
                }
            }
            if (Statics.field740 != null) {
                field573++;
                if (field573 >= 15) {
                    Statics.method1598(Statics.field740);
                    Statics.field740 = null;
                }
            }
            if (Statics.field28 != null) {
                Statics.method1598(Statics.field28);
                field580++;
                if (class76.field1376 > field576 + 5 || class76.field1376 < field576 - 5 || class76.field1370 > field637 + 5 || class76.field1370 < field637 - 5) {
                    field631 = true;
                }
                if (class76.field1369 == 0) {
                    if (!field631 || field580 < 5) {
                        label834: {
                            label667: {
                                if (field669 != 1) {
                                    int var52 = field525 - 1;
                                    boolean var53;
                                    if (var52 < 0) {
                                        var53 = false;
                                    } else {
                                        int var54 = field608[var52];
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
                                if (field525 > 2) {
                                    method220();
                                    break label834;
                                }
                            }
                            if (field525 > 0) {
                                method884(field525 - 1);
                            }
                        }
                    } else if (Statics.field283 == Statics.field28 && field578 != field575) {
                        class157 var44 = Statics.field28;
                        byte var45 = 0;
                        if (field625 == 1 && var44.field2578 == 206) {
                            var45 = 1;
                        }
                        if (var44.field2649[field578] <= 0) {
                            var45 = 0;
                        }
                        int var46 = Statics.method108(var44);
                        boolean var47 = (var46 >> 29 & 0x1) != 0;
                        if (var47) {
                            int var48 = field575;
                            int var49 = field578;
                            var44.field2649[var49] = var44.field2649[var48];
                            var44.field2630[var49] = var44.field2630[var48];
                            var44.field2649[var48] = -1;
                            var44.field2630[var48] = 0;
                        } else if (var45 == 1) {
                            int var50 = field575;
                            int var51 = field578;
                            while (var50 != var51) {
                                if (var50 > var51) {
                                    var44.method3094(var50 - 1, var50);
                                    var50--;
                                } else if (var50 < var51) {
                                    var44.method3094(var50 + 1, var50);
                                    var50++;
                                }
                            }
                        } else {
                            var44.method3094(field578, field575);
                        }
                        field500.method2331(206);
                        field500.method2502(var45);
                        field500.method2642(field578);
                        field500.method2642(field575);
                        field500.method2455(Statics.field28.field2574);
                    }
                    field573 = 10;
                    class76.field1375 = 0;
                    Statics.field28 = null;
                }
            }
            class157 var55 = Statics.field1746;
            class157 var56 = Statics.field85;
            Statics.field1746 = null;
            Statics.field85 = null;
            field555 = null;
            field641 = false;
            field600 = false;
            for (field632 = 0; class74.method113() && field632 < 128; field632++) {
                field611[field632] = Statics.field124;
                field684[field632] = Statics.field951;
            }
            int var57 = field622;
            if (class157.method2697(var57)) {
                method2925(Statics.field2638[var57], -1, 0, 0, 765, 503, 0, 0);
            }
            field645++;
            while (true) {
                class1 var58;
                class157 var59;
                class157 var60;
                do {
                    var58 = (class1) field660.method3292();
                    if (var58 == null) {
                        while (true) {
                            class1 var61;
                            class157 var62;
                            class157 var63;
                            do {
                                var61 = (class1) field473.method3292();
                                if (var61 == null) {
                                    while (true) {
                                        class1 var64;
                                        class157 var65;
                                        class157 var66;
                                        do {
                                            var64 = (class1) field603.method3292();
                                            if (var64 == null) {
                                                if (field532 != null) {
                                                    method698();
                                                }
                                                if (class94.field1571 != -1) {
                                                    int var67 = class94.field1571;
                                                    int var68 = class94.field1572;
                                                    boolean var69 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var67, var68, true, 0, 0, 0, 0, 0, 0);
                                                    class94.field1571 = -1;
                                                    if (var69) {
                                                        field569 = class76.field1382;
                                                        field570 = class76.field1380;
                                                        field656 = 1;
                                                        field571 = 0;
                                                    }
                                                }
                                                method209();
                                                if (Statics.field1746 != var55) {
                                                    if (var55 != null) {
                                                        Statics.method1598(var55);
                                                    }
                                                    if (Statics.field1746 != null) {
                                                        Statics.method1598(Statics.field1746);
                                                    }
                                                }
                                                if (Statics.field85 != var56 && field615 == field478) {
                                                    if (var56 != null) {
                                                        Statics.method1598(var56);
                                                    }
                                                    if (Statics.field85 != null) {
                                                        Statics.method1598(Statics.field85);
                                                    }
                                                }
                                                if (Statics.field85 == null) {
                                                    if (field478 > 0) {
                                                        field478--;
                                                    }
                                                } else if (field478 < field615) {
                                                    field478++;
                                                    if (field615 == field478) {
                                                        Statics.method1598(Statics.field85);
                                                    }
                                                }
                                                int var70 = field528 + Statics.field2540.field410;
                                                int var71 = field530 + Statics.field2540.field397;
                                                if (Statics.field1988 - var70 < -500 || Statics.field1988 - var70 > 500 || Statics.field259 - var71 < -500 || Statics.field259 - var71 > 500) {
                                                    Statics.field1988 = var70;
                                                    Statics.field259 = var71;
                                                }
                                                if (Statics.field1988 != var70) {
                                                    Statics.field1988 += (var70 - Statics.field1988) / 16;
                                                }
                                                if (Statics.field259 != var71) {
                                                    Statics.field259 += (var71 - Statics.field259) / 16;
                                                }
                                                if (class74.field1338[96]) {
                                                    field550 += (-24 - field550) / 2;
                                                } else if (class74.field1338[97]) {
                                                    field550 += (24 - field550) / 2;
                                                } else {
                                                    field550 /= 2;
                                                }
                                                if (class74.field1338[98]) {
                                                    field551 += (12 - field551) / 2;
                                                } else if (class74.field1338[99]) {
                                                    field551 += (-12 - field551) / 2;
                                                } else {
                                                    field551 /= 2;
                                                }
                                                field549 = field550 / 2 + field549 & 0x7FF;
                                                field475 += field551 / 2;
                                                if (field475 < 128) {
                                                    field475 = 128;
                                                }
                                                if (field475 > 383) {
                                                    field475 = 383;
                                                }
                                                int var72 = Statics.field1988 >> 7;
                                                int var73 = Statics.field259 >> 7;
                                                int var74 = method135(Statics.field1988, Statics.field259, Statics.field188);
                                                int var75 = 0;
                                                if (var72 > 3 && var73 > 3 && var72 < 100 && var73 < 100) {
                                                    for (int var76 = var72 - 4; var76 <= var72 + 4; var76++) {
                                                        for (int var77 = var73 - 4; var77 <= var73 + 4; var77++) {
                                                            int var78 = Statics.field188;
                                                            if (var78 < 3 && (class9.field133[1][var76][var77] & 0x2) == 2) {
                                                                var78++;
                                                            }
                                                            int var79 = var74 - class9.field135[var78][var76][var77];
                                                            if (var79 > var75) {
                                                                var75 = var79;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var80 = var75 * 192;
                                                if (var80 > 98048) {
                                                    var80 = 98048;
                                                }
                                                if (var80 < 32768) {
                                                    var80 = 32768;
                                                }
                                                if (var80 > field554) {
                                                    field554 += (var80 - field554) / 24;
                                                } else if (var80 < field554) {
                                                    field554 += (var80 - field554) / 80;
                                                }
                                                if (field507) {
                                                    method737();
                                                }
                                                for (int var81 = 0; var81 < 5; var81++) {
                                                    var10002 = field713[var81]++;
                                                }
                                                int var82 = class76.method1444();
                                                int var83 = class74.field1334;
                                                if (var82 > 15000 && var83 > 15000) {
                                                    field711 = 250;
                                                    class76.field1377 = 14500;
                                                    field500.method2331(120);
                                                }
                                                field534++;
                                                if (field534 > 500) {
                                                    field534 = 0;
                                                    int var85 = (int) (Math.random() * 8.0D);
                                                    if ((var85 & 0x1) == 1) {
                                                        field528 += field610;
                                                    }
                                                    if ((var85 & 0x2) == 2) {
                                                        field530 += field531;
                                                    }
                                                    if ((var85 & 0x4) == 4) {
                                                        field514 += field533;
                                                    }
                                                }
                                                if (field528 < -50) {
                                                    field610 = 2;
                                                }
                                                if (field528 > 50) {
                                                    field610 = -2;
                                                }
                                                if (field530 < -55) {
                                                    field531 = 2;
                                                }
                                                if (field530 > 55) {
                                                    field531 = -2;
                                                }
                                                if (field514 < -40) {
                                                    field533 = 1;
                                                }
                                                if (field514 > 40) {
                                                    field533 = -1;
                                                }
                                                field539++;
                                                if (field539 > 500) {
                                                    field539 = 0;
                                                    int var86 = (int) (Math.random() * 8.0D);
                                                    if ((var86 & 0x1) == 1) {
                                                        field535 += field536;
                                                    }
                                                    if ((var86 & 0x2) == 2) {
                                                        field621 += field538;
                                                    }
                                                }
                                                if (field535 < -60) {
                                                    field536 = 2;
                                                }
                                                if (field535 > 60) {
                                                    field536 = -2;
                                                }
                                                if (field621 < -20) {
                                                    field538 = 1;
                                                }
                                                if (field621 > 10) {
                                                    field538 = -1;
                                                }
                                                for (class27 var87 = (class27) field586.method3263(); var87 != null; var87 = (class27) field586.method3256()) {
                                                    if ((long) var87.field732 < class120.method1383() / 1000L - 5L) {
                                                        if (var87.field729 > 0) {
                                                            method2367(5, "", var87.field726 + class133.field2192);
                                                        }
                                                        if (var87.field729 == 0) {
                                                            method2367(5, "", var87.field726 + class133.field2205);
                                                        }
                                                        var87.method3319();
                                                    }
                                                }
                                                field506++;
                                                if (field506 > 50) {
                                                    field500.method2331(83);
                                                }
                                                try {
                                                    if (Statics.field18 != null && field500.field2027 > 0) {
                                                        Statics.field18.method1416(field500.field2029, 0, field500.field2027);
                                                        field500.field2027 = 0;
                                                        field506 = 0;
                                                    }
                                                } catch (IOException var89) {
                                                    Statics.method23();
                                                }
                                                return;
                                            }
                                            var65 = var64.field2;
                                            if (var65.field2575 < 0) {
                                                break;
                                            }
                                            var66 = class157.method3077(var65.field2585);
                                        } while (var66 == null || var66.field2682 == null || var65.field2575 >= var66.field2682.length || var66.field2682[var65.field2575] != var65);
                                        Statics.method116(var64);
                                    }
                                }
                                var62 = var61.field2;
                                if (var62.field2575 < 0) {
                                    break;
                                }
                                var63 = class157.method3077(var62.field2585);
                            } while (var63 == null || var63.field2682 == null || var62.field2575 >= var63.field2682.length || var63.field2682[var62.field2575] != var62);
                            Statics.method116(var61);
                        }
                    }
                    var59 = var58.field2;
                    if (var59.field2575 < 0) {
                        break;
                    }
                    var60 = class157.method3077(var59.field2585);
                } while (var60 == null || var60.field2682 == null || var59.field2575 >= var60.field2682.length || var60.field2682[var59.field2575] != var59);
                Statics.method116(var58);
            }
        } else if (field711 > 0) {
            method216();
        } else {
            method2054(40);
            Statics.field499 = Statics.field18;
            Statics.field18 = null;
        }
    }

    @ObfuscatedName("p.w(I)V")
    public static final void method120() {
        if (Statics.field221 != null) {
            Statics.field221.method1175();
        }
        if (Statics.field370 != null) {
            Statics.field370.method1175();
        }
    }

    @ObfuscatedName("dj.y(Lal;IIII)V")
    public static void method2243(class33 arg0, int arg1, int arg2, int arg3) {
        if (field702 >= 50 || field701 == 0 || arg0.field866 == null || arg1 >= arg0.field866.length) {
            return;
        }
        int var4 = arg0.field866[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field703[field702] = var5;
        field595[field702] = var6;
        field577[field702] = 0;
        field707[field702] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field706[field702] = (var8 << 16) + (var9 << 8) + var7;
        field702++;
    }

    @ObfuscatedName("c.au(IIII)V")
    public static void method32(int arg0, int arg1, int arg2) {
        if (field472 == 0 || arg1 == 0 || field702 >= 50) {
            return;
        }
        field703[field702] = arg0;
        field595[field702] = arg1;
        field577[field702] = arg2;
        field707[field702] = null;
        field706[field702] = 0;
        field702++;
    }

    @ObfuscatedName("q.az(II)V")
    public static void method52(int arg0) {
        if (arg0 == -1 && !field699) {
            class137.method51();
        } else if (arg0 != -1 && field698 != arg0 && field697 != 0 && !field699) {
            class137.method35(2, Statics.field348, arg0, 0, field697, false);
        }
        field698 = arg0;
    }

    @ObfuscatedName("client.ak(B)V")
    public static final void method264() {
        if (field617 && Statics.field188 != field512) {
            method128(Statics.field1624, Statics.field253, Statics.field188, Statics.field2540.field448[0], Statics.field2540.field449[0]);
        } else if (Statics.field188 != field612) {
            field612 = Statics.field188;
            int var0 = Statics.field188;
            int[] var1 = Statics.field2436.field1448;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field133[var0][var6][var4] & 0x18) == 0) {
                        Statics.field220.method1917(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field133[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field220.method1917(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field2436.method1735();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field133[var0][var10][var9] & 0x18) == 0) {
                        method1614(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field133[var0 + 1][var10][var9] & 0x8) != 0) {
                        method1614(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field672 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field220.method1912(Statics.field188, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class31.method195(var14).field839;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field519[Statics.field188].field2724;
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
                            field457[field672] = Statics.field1357[var15];
                            field691[field672] = var16;
                            field692[field672] = var17;
                            field672++;
                        }
                    }
                }
            }
            Statics.field896.method1698();
        }
    }

    @ObfuscatedName("dp.ah(Ljava/lang/String;I)V")
    public static final void method2245(String arg0) {
        if (field629 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                Statics.method23();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field474 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field474 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field519[var1].field2724[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field459 == 2) {
                throw new RuntimeException();
            }
        }
        field500.method2331(42);
        field500.method2452(arg0.length() - 1);
        field500.method2457(arg0.substring(2));
    }

    @ObfuscatedName("al.aa(I)V")
    public static final void method737() {
        int var0 = Statics.field1240 * 128 + 64;
        int var1 = Statics.field114 * 128 + 64;
        int var2 = method135(var0, var1, Statics.field188) - Statics.field1352;
        if (Statics.field1921 < var0) {
            Statics.field1921 += Statics.field1971 * (var0 - Statics.field1921) / 1000 + Statics.field207;
            if (Statics.field1921 > var0) {
                Statics.field1921 = var0;
            }
        }
        if (Statics.field1921 > var0) {
            Statics.field1921 -= Statics.field1971 * (Statics.field1921 - var0) / 1000 + Statics.field207;
            if (Statics.field1921 < var0) {
                Statics.field1921 = var0;
            }
        }
        if (Statics.field2437 < var2) {
            Statics.field2437 += Statics.field1971 * (var2 - Statics.field2437) / 1000 + Statics.field207;
            if (Statics.field2437 > var2) {
                Statics.field2437 = var2;
            }
        }
        if (Statics.field2437 > var2) {
            Statics.field2437 -= Statics.field1971 * (Statics.field2437 - var2) / 1000 + Statics.field207;
            if (Statics.field2437 < var2) {
                Statics.field2437 = var2;
            }
        }
        if (Statics.field1495 < var1) {
            Statics.field1495 += Statics.field1971 * (var1 - Statics.field1495) / 1000 + Statics.field207;
            if (Statics.field1495 > var1) {
                Statics.field1495 = var1;
            }
        }
        if (Statics.field1495 > var1) {
            Statics.field1495 -= Statics.field1971 * (Statics.field1495 - var1) / 1000 + Statics.field207;
            if (Statics.field1495 < var1) {
                Statics.field1495 = var1;
            }
        }
        int var3 = Statics.field1504 * 128 + 64;
        int var4 = Statics.field1532 * 128 + 64;
        int var5 = method135(var3, var4, Statics.field188) - Statics.field208;
        int var6 = var3 - Statics.field1921;
        int var7 = var5 - Statics.field2437;
        int var8 = var4 - Statics.field1495;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field363 < var10) {
            Statics.field363 += Statics.field125 * (var10 - Statics.field363) / 1000 + Statics.field737;
            if (Statics.field363 > var10) {
                Statics.field363 = var10;
            }
        }
        if (Statics.field363 > var10) {
            Statics.field363 -= Statics.field125 * (Statics.field363 - var10) / 1000 + Statics.field737;
            if (Statics.field363 < var10) {
                Statics.field363 = var10;
            }
        }
        int var12 = var11 - Statics.field375;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field375 += Statics.field125 * var12 / 1000 + Statics.field737;
            Statics.field375 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field375 -= Statics.field125 * -var12 / 1000 + Statics.field737;
            Statics.field375 &= 0x7FF;
        }
        int var13 = var11 - Statics.field375;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field375 = var11;
        }
    }

    @ObfuscatedName("w.al(I)V")
    public static final void method219() {
        for (int var0 = 0; var0 < field497; var0++) {
            int var1 = field630[var0];
            class24 var2 = field496[var1];
            if (var2 != null) {
                method1429(var2, var2.field379.field763);
            }
        }
    }

    @ObfuscatedName("bg.ae(Ly;II)V")
    public static final void method1429(class26 arg0, int arg1) {
        if (arg0.field439 > field510) {
            int var2 = arg0.field439 - field510;
            int var3 = arg0.field435 * 128 + arg0.field400 * 64;
            int var4 = arg0.field442 * 128 + arg0.field400 * 64;
            arg0.field410 += (var3 - arg0.field410) / var2;
            arg0.field397 += (var4 - arg0.field397) / var2;
            arg0.field450 = 0;
            if (arg0.field441 == 0) {
                arg0.field408 = 1024;
            }
            if (arg0.field441 == 1) {
                arg0.field408 = 1536;
            }
            if (arg0.field441 == 2) {
                arg0.field408 = 0;
            }
            if (arg0.field441 == 3) {
                arg0.field408 = 512;
            }
        } else if (arg0.field440 >= field510) {
            method115(arg0);
        } else {
            method152(arg0);
        }
        if (arg0.field410 < 128 || arg0.field397 < 128 || arg0.field410 >= 13184 || arg0.field397 >= 13184) {
            arg0.field425 = -1;
            arg0.field401 = -1;
            arg0.field439 = 0;
            arg0.field440 = 0;
            arg0.field410 = arg0.field448[0] * 128 + arg0.field400 * 64;
            arg0.field397 = arg0.field449[0] * 128 + arg0.field400 * 64;
            arg0.method232();
        }
        if (Statics.field2540 == arg0 && (arg0.field410 < 1536 || arg0.field397 < 1536 || arg0.field410 >= 11776 || arg0.field397 >= 11776)) {
            arg0.field425 = -1;
            arg0.field401 = -1;
            arg0.field439 = 0;
            arg0.field440 = 0;
            arg0.field410 = arg0.field448[0] * 128 + arg0.field400 * 64;
            arg0.field397 = arg0.field449[0] * 128 + arg0.field400 * 64;
            arg0.method232();
        }
        if (arg0.field430 != 0) {
            if (arg0.field411 != -1 && arg0.field411 < 32768) {
                class24 var5 = field496[arg0.field411];
                if (var5 != null) {
                    int var6 = arg0.field410 - var5.field410;
                    int var7 = arg0.field397 - var5.field397;
                    if (var6 != 0 || var7 != 0) {
                        arg0.field408 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field411 >= 32768) {
                int var8 = arg0.field411 - 32768;
                if (field588 == var8) {
                    var8 = 2047;
                }
                class3 var9 = field582[var8];
                if (var9 != null) {
                    int var10 = arg0.field410 - var9.field410;
                    int var11 = arg0.field397 - var9.field397;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field408 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field419 != 0 || arg0.field402 != 0) && (arg0.field447 == 0 || arg0.field450 > 0)) {
                int var12 = arg0.field410 - (arg0.field419 * 64 - Statics.field911 * 64 - Statics.field911 * 64);
                int var13 = arg0.field397 - (arg0.field402 * 64 - Statics.field1286 * 64 - Statics.field1286 * 64);
                if (var12 != 0 || var13 != 0) {
                    arg0.field408 = (int) (Math.atan2((double) var12, (double) var13) * 325.949D) & 0x7FF;
                }
                arg0.field419 = 0;
                arg0.field402 = 0;
            }
            int var14 = arg0.field408 - arg0.field452 & 0x7FF;
            if (var14 == 0) {
                arg0.field445 = 0;
            } else {
                arg0.field445++;
                if (var14 > 1024) {
                    arg0.field452 -= arg0.field430;
                    boolean var15 = true;
                    if (var14 < arg0.field430 || var14 > 2048 - arg0.field430) {
                        arg0.field452 = arg0.field408;
                        var15 = false;
                    }
                    if (arg0.field437 == arg0.field422 && (arg0.field445 > 25 || var15)) {
                        if (arg0.field396 == -1) {
                            arg0.field422 = arg0.field404;
                        } else {
                            arg0.field422 = arg0.field396;
                        }
                    }
                } else {
                    arg0.field452 += arg0.field430;
                    boolean var16 = true;
                    if (var14 < arg0.field430 || var14 > 2048 - arg0.field430) {
                        arg0.field452 = arg0.field408;
                        var16 = false;
                    }
                    if (arg0.field437 == arg0.field422 && (arg0.field445 > 25 || var16)) {
                        if (arg0.field403 == -1) {
                            arg0.field422 = arg0.field404;
                        } else {
                            arg0.field422 = arg0.field403;
                        }
                    }
                }
                arg0.field452 &= 0x7FF;
            }
        }
        method201(arg0);
    }

    @ObfuscatedName("o.ab(Ly;I)V")
    public static final void method115(class26 arg0) {
        if (field510 == arg0.field440 || arg0.field425 == -1 || arg0.field451 != 0 || arg0.field444 + 1 > class33.method1401(arg0.field425).field864[arg0.field426]) {
            int var1 = arg0.field440 - arg0.field439;
            int var2 = field510 - arg0.field439;
            int var3 = arg0.field435 * 128 + arg0.field400 * 64;
            int var4 = arg0.field442 * 128 + arg0.field400 * 64;
            int var5 = arg0.field436 * 128 + arg0.field400 * 64;
            int var6 = arg0.field438 * 128 + arg0.field400 * 64;
            arg0.field410 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field397 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field450 = 0;
        if (arg0.field441 == 0) {
            arg0.field408 = 1024;
        }
        if (arg0.field441 == 1) {
            arg0.field408 = 1536;
        }
        if (arg0.field441 == 2) {
            arg0.field408 = 0;
        }
        if (arg0.field441 == 3) {
            arg0.field408 = 512;
        }
        arg0.field452 = arg0.field408;
    }

    @ObfuscatedName("i.as(Ly;B)V")
    public static final void method152(class26 arg0) {
        arg0.field422 = arg0.field437;
        if (arg0.field447 == 0) {
            arg0.field450 = 0;
            return;
        }
        if (arg0.field425 != -1 && arg0.field451 == 0) {
            class33 var1 = class33.method1401(arg0.field425);
            if (arg0.field407 > 0 && var1.field872 == 0) {
                arg0.field450++;
                return;
            }
            if (arg0.field407 <= 0 && var1.field873 == 0) {
                arg0.field450++;
                return;
            }
        }
        int var2 = arg0.field410;
        int var3 = arg0.field397;
        int var4 = arg0.field448[arg0.field447 - 1] * 128 + arg0.field400 * 64;
        int var5 = arg0.field449[arg0.field447 - 1] * 128 + arg0.field400 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field410 = var4;
            arg0.field397 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field408 = 1280;
            } else if (var3 > var5) {
                arg0.field408 = 1792;
            } else {
                arg0.field408 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field408 = 768;
            } else if (var3 > var5) {
                arg0.field408 = 256;
            } else {
                arg0.field408 = 512;
            }
        } else if (var3 < var5) {
            arg0.field408 = 1024;
        } else if (var3 > var5) {
            arg0.field408 = 0;
        }
        int var6 = arg0.field408 - arg0.field452 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field405;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field404;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field409;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field406;
        }
        if (var7 == -1) {
            var7 = arg0.field404;
        }
        arg0.field422 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field379.field791;
        }
        if (var9) {
            if (arg0.field452 != arg0.field408 && arg0.field411 == -1 && arg0.field430 != 0) {
                var8 = 2;
            }
            if (arg0.field447 > 2) {
                var8 = 6;
            }
            if (arg0.field447 > 3) {
                var8 = 8;
            }
            if (arg0.field450 > 0 && arg0.field447 > 1) {
                var8 = 8;
                arg0.field450--;
            }
        } else {
            if (arg0.field447 > 1) {
                var8 = 6;
            }
            if (arg0.field447 > 2) {
                var8 = 8;
            }
            if (arg0.field450 > 0 && arg0.field447 > 1) {
                var8 = 8;
                arg0.field450--;
            }
        }
        if (arg0.field433[arg0.field447 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field422 == arg0.field404 && arg0.field427 != -1) {
            arg0.field422 = arg0.field427;
        }
        if (var2 < var4) {
            arg0.field410 += var8;
            if (arg0.field410 > var4) {
                arg0.field410 = var4;
            }
        } else if (var2 > var4) {
            arg0.field410 -= var8;
            if (arg0.field410 < var4) {
                arg0.field410 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field397 += var8;
            if (arg0.field397 > var5) {
                arg0.field397 = var5;
            }
        } else if (var3 > var5) {
            arg0.field397 -= var8;
            if (arg0.field397 < var5) {
                arg0.field397 = var5;
            }
        }
        if (arg0.field410 == var4 && arg0.field397 == var5) {
            arg0.field447--;
            if (arg0.field407 > 0) {
                arg0.field407--;
            }
        }
    }

    @ObfuscatedName("g.ai(Ly;I)V")
    public static final void method201(class26 arg0) {
        arg0.field399 = false;
        if (arg0.field422 != -1) {
            class33 var1 = class33.method1401(arg0.field422);
            if (var1 == null || var1.field861 == null) {
                arg0.field422 = -1;
            } else {
                arg0.field424++;
                if (arg0.field423 < var1.field861.length && arg0.field424 > var1.field864[arg0.field423]) {
                    arg0.field424 = 1;
                    arg0.field423++;
                    method2243(var1, arg0.field423, arg0.field410, arg0.field397);
                }
                if (arg0.field423 >= var1.field861.length) {
                    arg0.field424 = 0;
                    arg0.field423 = 0;
                    method2243(var1, arg0.field423, arg0.field410, arg0.field397);
                }
            }
        }
        if (arg0.field401 != -1 && field510 >= arg0.field421) {
            if (arg0.field431 < 0) {
                arg0.field431 = 0;
            }
            int var2 = class34.method239(arg0.field401).field885;
            if (var2 == -1) {
                arg0.field401 = -1;
            } else {
                class33 var3 = class33.method1401(var2);
                if (var3 == null || var3.field861 == null) {
                    arg0.field401 = -1;
                } else {
                    arg0.field432++;
                    if (arg0.field431 < var3.field861.length && arg0.field432 > var3.field864[arg0.field431]) {
                        arg0.field432 = 1;
                        arg0.field431++;
                        method2243(var3, arg0.field431, arg0.field410, arg0.field397);
                    }
                    if (arg0.field431 >= var3.field861.length && (arg0.field431 < 0 || arg0.field431 >= var3.field861.length)) {
                        arg0.field401 = -1;
                    }
                }
            }
        }
        if (arg0.field425 != -1 && arg0.field451 <= 1) {
            class33 var4 = class33.method1401(arg0.field425);
            if (var4.field872 == 1 && arg0.field407 > 0 && arg0.field439 <= field510 && arg0.field440 < field510) {
                arg0.field451 = 1;
                return;
            }
        }
        if (arg0.field425 != -1 && arg0.field451 == 0) {
            class33 var5 = class33.method1401(arg0.field425);
            if (var5 == null || var5.field861 == null) {
                arg0.field425 = -1;
            } else {
                arg0.field444++;
                if (arg0.field426 < var5.field861.length && arg0.field444 > var5.field864[arg0.field426]) {
                    arg0.field444 = 1;
                    arg0.field426++;
                    method2243(var5, arg0.field426, arg0.field410, arg0.field397);
                }
                if (arg0.field426 >= var5.field861.length) {
                    arg0.field426 -= var5.field865;
                    arg0.field446++;
                    if (arg0.field446 >= var5.field871) {
                        arg0.field425 = -1;
                    } else if (arg0.field426 >= 0 && arg0.field426 < var5.field861.length) {
                        method2243(var5, arg0.field426, arg0.field410, arg0.field397);
                    } else {
                        arg0.field425 = -1;
                    }
                }
                arg0.field399 = var5.field867;
            }
        }
        if (arg0.field451 > 0) {
            arg0.field451--;
        }
    }

    @ObfuscatedName("v.aj(Ln;III)V")
    public static void method1(class3 arg0, int arg1, int arg2) {
        if (arg0.field425 == arg1 && arg1 != -1) {
            int var3 = class33.method1401(arg1).field874;
            if (var3 == 1) {
                arg0.field426 = 0;
                arg0.field444 = 0;
                arg0.field451 = arg2;
                arg0.field446 = 0;
            }
            if (var3 == 2) {
                arg0.field446 = 0;
            }
        } else if (arg1 == -1 || arg0.field425 == -1 || class33.method1401(arg1).field868 >= class33.method1401(arg0.field425).field868) {
            arg0.field425 = arg1;
            arg0.field426 = 0;
            arg0.field444 = 0;
            arg0.field451 = arg2;
            arg0.field446 = 0;
            arg0.field407 = arg0.field447;
        }
    }

    @ObfuscatedName("b.an(B)V")
    public static final void method214() {
        if (!field683) {
            field687[0] = class133.field2280;
            field583[0] = "";
            field608[0] = 1006;
            field525 = 1;
        }
        if (field622 != -1) {
            method1380(field622);
        }
        for (int var0 = 0; var0 < field520; var0++) {
            if (field665[var0]) {
                field666[var0] = true;
            }
            field552[var0] = field665[var0];
            field665[var0] = false;
        }
        field667 = field510;
        field605 = -1;
        field613 = -1;
        Statics.field283 = null;
        if (field622 != -1) {
            field520 = 0;
            method36(field622, 0, 0, 765, 503, 0, 0, -1);
        }
        class88.method1807();
        method26();
        if (field683) {
            int var6 = Statics.field2022;
            int var7 = Statics.field1609;
            int var8 = Statics.field390;
            int var9 = Statics.field955;
            int var10 = 6116423;
            class88.method1816(var6, var7, var8, var9, var10);
            class88.method1816(var6 + 1, var7 + 1, var8 - 2, 16, 0);
            class88.method1818(var6 + 1, var7 + 18, var8 - 2, var9 - 19, 0);
            Statics.field78.method3361(class133.field2210, var6 + 3, var7 + 14, var10, -1);
            int var11 = class76.field1376;
            int var12 = class76.field1370;
            for (int var13 = 0; var13 < field525; var13++) {
                int var14 = (field525 - 1 - var13) * 15 + var7 + 31;
                int var15 = 16777215;
                if (var11 > var6 && var11 < var6 + var8 && var12 > var14 - 13 && var12 < var14 + 3) {
                    var15 = 16776960;
                }
                class182 var16 = Statics.field78;
                String var17;
                if (field583[var13].length() > 0) {
                    var17 = field687[var13] + class133.field2217 + field583[var13];
                } else {
                    var17 = field687[var13];
                }
                var16.method3361(var17, var6 + 3, var14, var15, 0);
            }
            method155(Statics.field2022, Statics.field1609, Statics.field390, Statics.field955);
        } else if (field605 != -1) {
            int var1 = field605;
            int var2 = field613;
            if (field525 >= 2 || field616 != 0 || field717) {
                String var3;
                if (field616 == 1 && field525 < 2) {
                    var3 = class133.field2207 + class133.field2217 + field564 + " " + class2.field20;
                } else if (field717 && field525 < 2) {
                    var3 = field620 + class133.field2217 + field654 + " " + class2.field20;
                } else {
                    int var4 = field525 - 1;
                    String var5;
                    if (field583[var4].length() > 0) {
                        var5 = field687[var4] + class133.field2217 + field583[var4];
                    } else {
                        var5 = field687[var4];
                    }
                    var3 = var5;
                }
                if (field525 > 2) {
                    var3 = var3 + class2.method699(16777215) + " " + '/' + " " + (field525 - 2) + class133.field2075;
                }
                Statics.field78.method3368(var3, var1 + 4, var2 + 15, 16777215, 0, field510 / 1000);
            }
        }
        if (field469 == 3) {
            for (int var18 = 0; var18 < field520; var18++) {
                if (field552[var18]) {
                    class88.method1815(field723[var18], field705[var18], field664[var18], field708[var18], 16711935, 128);
                } else if (field666[var18]) {
                    class88.method1815(field723[var18], field705[var18], field664[var18], field708[var18], 16711680, 128);
                }
            }
        }
        class7.method101(Statics.field188, Statics.field2540.field410, Statics.field2540.field397, field540);
        field540 = 0;
    }

    @ObfuscatedName("g.av(Ljava/lang/String;ZS)V")
    public static final void method202(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field81.method3358(arg0, 250);
        int var6 = Statics.field81.method3393(arg0, 250) * 13;
        class88.method1816(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class88.method1818(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field81.method3364(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method112(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method155(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field223.getGraphics();
            Statics.field896.method1641(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field223.repaint();
        }
    }

    @ObfuscatedName("s.af(IIIIB)V")
    public static final void method96(int arg0, int arg1, int arg2, int arg3) {
        class88.method1858(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class103.method2143();
        field566++;
        method825(true);
        method599(true);
        method825(false);
        method599(false);
        method1309();
        for (class19 var4 = (class19) field599.method3294(); var4 != null; var4 = (class19) field599.method3296()) {
            if (Statics.field188 != var4.field276 || var4.field274) {
                var4.method3320();
            } else if (field510 >= var4.field281) {
                var4.method153(field540);
                if (var4.field274) {
                    var4.method3320();
                } else {
                    Statics.field220.method1895(var4.field276, var4.field277, var4.field278, var4.field279, 60, var4, 0, -1, false);
                }
            }
        }
        if (!field507) {
            int var5 = field475;
            if (field554 / 256 > var5) {
                var5 = field554 / 256;
            }
            if (field709[4] && field720[4] + 128 > var5) {
                var5 = field720[4] + 128;
            }
            int var6 = field549 + field514 & 0x7FF;
            Statics.method2246(Statics.field1988, method135(Statics.field2540.field410, Statics.field2540.field397, Statics.field188) - 50, Statics.field259, var5, var6, var5 * 3 + 600);
        }
        int var19;
        if (field507) {
            var19 = method221();
        } else {
            int var7 = 3;
            if (Statics.field363 < 310) {
                int var8 = Statics.field1921 >> 7;
                int var9 = Statics.field1495 >> 7;
                int var10 = Statics.field2540.field410 >> 7;
                int var11 = Statics.field2540.field397 >> 7;
                if ((class9.field133[Statics.field188][var8][var9] & 0x4) != 0) {
                    var7 = Statics.field188;
                }
                int var12;
                if (var10 > var8) {
                    var12 = var10 - var8;
                } else {
                    var12 = var8 - var10;
                }
                int var13;
                if (var11 > var9) {
                    var13 = var11 - var9;
                } else {
                    var13 = var9 - var11;
                }
                if (var12 > var13) {
                    int var14 = var13 * 65536 / var12;
                    int var15 = 32768;
                    while (var8 != var10) {
                        if (var8 < var10) {
                            var8++;
                        } else if (var8 > var10) {
                            var8--;
                        }
                        if ((class9.field133[Statics.field188][var8][var9] & 0x4) != 0) {
                            var7 = Statics.field188;
                        }
                        var15 += var14;
                        if (var15 >= 65536) {
                            var15 -= 65536;
                            if (var9 < var11) {
                                var9++;
                            } else if (var9 > var11) {
                                var9--;
                            }
                            if ((class9.field133[Statics.field188][var8][var9] & 0x4) != 0) {
                                var7 = Statics.field188;
                            }
                        }
                    }
                } else {
                    int var16 = var12 * 65536 / var13;
                    int var17 = 32768;
                    while (var9 != var11) {
                        if (var9 < var11) {
                            var9++;
                        } else if (var9 > var11) {
                            var9--;
                        }
                        if ((class9.field133[Statics.field188][var8][var9] & 0x4) != 0) {
                            var7 = Statics.field188;
                        }
                        var17 += var16;
                        if (var17 >= 65536) {
                            var17 -= 65536;
                            if (var8 < var10) {
                                var8++;
                            } else if (var8 > var10) {
                                var8--;
                            }
                            if ((class9.field133[Statics.field188][var8][var9] & 0x4) != 0) {
                                var7 = Statics.field188;
                            }
                        }
                    }
                }
            }
            if ((class9.field133[Statics.field188][Statics.field2540.field410 >> 7][Statics.field2540.field397 >> 7] & 0x4) != 0) {
                var7 = Statics.field188;
            }
            var19 = var7;
        }
        int var20 = Statics.field1921;
        int var21 = Statics.field2437;
        int var22 = Statics.field1495;
        int var23 = Statics.field363;
        int var24 = Statics.field375;
        for (int var25 = 0; var25 < 5; var25++) {
            if (field709[var25]) {
                int var26 = (int) (Math.random() * (double) (field657[var25] * 2 + 1) - (double) field657[var25] + Math.sin((double) field712[var25] / 100.0D * (double) field713[var25]) * (double) field720[var25]);
                if (var25 == 0) {
                    Statics.field1921 += var26;
                }
                if (var25 == 1) {
                    Statics.field2437 += var26;
                }
                if (var25 == 2) {
                    Statics.field1495 += var26;
                }
                if (var25 == 3) {
                    Statics.field375 = Statics.field375 + var26 & 0x7FF;
                }
                if (var25 == 4) {
                    Statics.field363 += var26;
                    if (Statics.field363 < 128) {
                        Statics.field363 = 128;
                    }
                    if (Statics.field363 > 383) {
                        Statics.field363 = 383;
                    }
                }
            }
        }
        int var27 = class76.field1376;
        int var28 = class76.field1370;
        if (var27 >= arg0 && var27 < arg0 + arg2 && var28 >= arg1 && var28 < arg1 + arg3) {
            class111.field1897 = true;
            class111.field1870 = 0;
            class111.field1854 = class76.field1376 - arg0;
            class111.field1843 = class76.field1370 - arg1;
        } else {
            class111.field1897 = false;
            class111.field1870 = 0;
        }
        method120();
        class88.method1816(arg0, arg1, arg2, arg3, 0);
        method120();
        Statics.field220.method1933(Statics.field1921, Statics.field2437, Statics.field1495, Statics.field363, Statics.field375, var19);
        method120();
        Statics.field220.method1983();
        field537 = 0;
        for (int var29 = -1; var29 < field618 + field497; var29++) {
            class26 var30;
            if (var29 == -1) {
                var30 = Statics.field2540;
            } else if (var29 < field618) {
                var30 = field582[field584[var29]];
            } else {
                var30 = field496[field630[var29 - field618]];
            }
            if (var30 != null && var30.method24()) {
                if (var30 instanceof class24) {
                    class30 var31 = ((class24) var30).field379;
                    if (var31.field787 != null) {
                        var31 = var31.method607();
                    }
                    if (var31 == null) {
                        continue;
                    }
                }
                if (var29 >= field618) {
                    class30 var34 = ((class24) var30).field379;
                    if (var34.field787 != null) {
                        var34 = var34.method607();
                    }
                    if (var34.field785 >= 0 && var34.field785 < Statics.field1778.length) {
                        method2395(var30, var30.field443 + 15);
                        if (field700 > -1) {
                            Statics.field1778[var34.field785].method1715(field700 + arg0 - 12, field468 + arg1 - 30);
                        }
                    }
                    if (field476 == 1 && field477 == field630[var29 - field618] && field510 % 20 < 10) {
                        method2395(var30, var30.field443 + 15);
                        if (field700 > -1) {
                            Statics.field1381[0].method1715(field700 + arg0 - 12, field468 + arg1 - 28);
                        }
                    }
                } else {
                    int var32 = 30;
                    class3 var33 = (class3) var30;
                    if (var33.field47 != -1 || var33.field32 != -1) {
                        method2395(var30, var30.field443 + 15);
                        if (field700 > -1) {
                            if (var33.field47 != -1) {
                                Statics.field2344[var33.field47].method1715(field700 + arg0 - 12, field468 + arg1 - var32);
                                var32 += 25;
                            }
                            if (var33.field32 != -1) {
                                Statics.field1778[var33.field32].method1715(field700 + arg0 - 12, field468 + arg1 - var32);
                                var32 += 25;
                            }
                        }
                    }
                    if (var29 >= 0 && field476 == 10 && field568 == field584[var29]) {
                        method2395(var30, var30.field443 + 15);
                        if (field700 > -1) {
                            Statics.field1381[1].method1715(field700 + arg0 - 12, field468 + arg1 - var32);
                        }
                    }
                }
                if (var30.field420 != null && (var29 >= field618 || field455 == 0 || field455 == 3 || field455 == 1 && method68(((class3) var30).field33))) {
                    method2395(var30, var30.field443);
                    if (field700 > -1 && field537 < field710) {
                        field560[field537] = Statics.field78.method3356(var30.field420) / 2;
                        field559[field537] = Statics.field78.field2836;
                        field487[field537] = field700;
                        field558[field537] = field468;
                        field556[field537] = var30.field417;
                        field562[field537] = var30.field412;
                        field563[field537] = var30.field398;
                        field668[field537] = var30.field420;
                        field537++;
                    }
                }
                if (var30.field416 > field510) {
                    method2395(var30, var30.field443 + 15);
                    if (field700 > -1) {
                        int var35 = var30.field428 * 30 / var30.field418;
                        if (var35 > 30) {
                            var35 = 30;
                        }
                        class88.method1816(field700 + arg0 - 15, field468 + arg1 - 3, var35, 5, 65280);
                        class88.method1816(field700 + arg0 - 15 + var35, field468 + arg1 - 3, 30 - var35, 5, 16711680);
                    }
                }
                for (int var36 = 0; var36 < 4; var36++) {
                    if (var30.field415[var36] > field510) {
                        method2395(var30, var30.field443 / 2);
                        if (field700 > -1) {
                            if (var36 == 1) {
                                field468 -= 20;
                            }
                            if (var36 == 2) {
                                field700 -= 15;
                                field468 -= 10;
                            }
                            if (var36 == 3) {
                                field700 += 15;
                                field468 -= 10;
                            }
                            Statics.field1188[var30.field414[var36]].method1715(field700 + arg0 - 12, field468 + arg1 - 12);
                            Statics.field120.method3363(Integer.toString(var30.field413[var36]), field700 + arg0 - 1, field468 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var37 = 0; var37 < field537; var37++) {
            int var38 = field487[var37];
            int var39 = field558[var37];
            int var40 = field560[var37];
            int var41 = field559[var37];
            boolean var42 = true;
            while (var42) {
                var42 = false;
                for (int var43 = 0; var43 < var37; var43++) {
                    if (var39 + 2 > field558[var43] - field559[var43] && var39 - var41 < field558[var43] + 2 && var38 - var40 < field560[var43] + field487[var43] && var38 + var40 > field487[var43] - field560[var43] && field558[var43] - field559[var43] < var39) {
                        var39 = field558[var43] - field559[var43];
                        var42 = true;
                    }
                }
            }
            field700 = field487[var37];
            field468 = field558[var37] = var39;
            String var44 = field668[var37];
            if (field624 == 0) {
                int var45 = 16776960;
                if (field556[var37] < 6) {
                    var45 = field678[field556[var37]];
                }
                if (field556[var37] == 6) {
                    var45 = field566 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field556[var37] == 7) {
                    var45 = field566 % 20 < 10 ? 255 : 65535;
                }
                if (field556[var37] == 8) {
                    var45 = field566 % 20 < 10 ? 45056 : 8454016;
                }
                if (field556[var37] == 9) {
                    int var46 = 150 - field563[var37];
                    if (var46 < 50) {
                        var45 = var46 * 1280 + 16711680;
                    } else if (var46 < 100) {
                        var45 = 16776960 - (var46 - 50) * 327680;
                    } else if (var46 < 150) {
                        var45 = (var46 - 100) * 5 + 65280;
                    }
                }
                if (field556[var37] == 10) {
                    int var47 = 150 - field563[var37];
                    if (var47 < 50) {
                        var45 = var47 * 5 + 16711680;
                    } else if (var47 < 100) {
                        var45 = 16711935 - (var47 - 50) * 327680;
                    } else if (var47 < 150) {
                        var45 = (var47 - 100) * 327680 + 255 - (var47 - 100) * 5;
                    }
                }
                if (field556[var37] == 11) {
                    int var48 = 150 - field563[var37];
                    if (var48 < 50) {
                        var45 = 16777215 - var48 * 327685;
                    } else if (var48 < 100) {
                        var45 = (var48 - 50) * 327685 + 65280;
                    } else if (var48 < 150) {
                        var45 = 16777215 - (var48 - 100) * 327680;
                    }
                }
                if (field562[var37] == 0) {
                    Statics.field78.method3363(var44, field700 + arg0, field468 + arg1, var45, 0);
                }
                if (field562[var37] == 1) {
                    Statics.field78.method3365(var44, field700 + arg0, field468 + arg1, var45, 0, field566);
                }
                if (field562[var37] == 2) {
                    Statics.field78.method3366(var44, field700 + arg0, field468 + arg1, var45, 0, field566);
                }
                if (field562[var37] == 3) {
                    Statics.field78.method3367(var44, field700 + arg0, field468 + arg1, var45, 0, field566, 150 - field563[var37]);
                }
                if (field562[var37] == 4) {
                    int var49 = (150 - field563[var37]) * (Statics.field78.method3356(var44) + 100) / 150;
                    class88.method1821(field700 + arg0 - 50, arg1, field700 + arg0 + 50, arg1 + arg3);
                    Statics.field78.method3361(var44, field700 + arg0 + 50 - var49, field468 + arg1, var45, 0);
                    class88.method1858(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field562[var37] == 5) {
                    int var50 = 150 - field563[var37];
                    int var51 = 0;
                    if (var50 < 25) {
                        var51 = var50 - 25;
                    } else if (var50 > 125) {
                        var51 = var50 - 125;
                    }
                    class88.method1821(arg0, field468 + arg1 - Statics.field78.field2836 - 1, arg0 + arg2, field468 + arg1 + 5);
                    Statics.field78.method3363(var44, field700 + arg0, field468 + arg1 + var51, var45, 0);
                    class88.method1858(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field78.method3363(var44, field700 + arg0, field468 + arg1, 16776960, 0);
            }
        }
        method1346(arg0, arg1);
        ((class109) Statics.field1747).method2236(field540);
        method1381(arg0, arg1, arg2, arg3);
        Statics.field1921 = var20;
        Statics.field2437 = var21;
        Statics.field1495 = var22;
        Statics.field363 = var23;
        Statics.field375 = var24;
        if (field466) {
            byte var52 = 0;
            int var53 = class152.field2527 + class152.field2513 + var52;
            if (var53 == 0) {
                field466 = false;
            }
        }
        if (field466) {
            class88.method1816(arg0, arg1, arg2, arg3, 0);
            method202(class133.field2073, false);
        }
        if (!field466 && !field683 && var27 >= arg0 && var27 < arg0 + arg2 && var28 >= arg1 && var28 < arg1 + arg3) {
            method3(var27, var28, arg0, arg1);
        }
    }

    @ObfuscatedName("aj.ax(ZI)V")
    public static final void method825(boolean arg0) {
        if (Statics.field2540.field410 >> 7 == field694 && Statics.field2540.field397 >> 7 == field695) {
            field694 = 0;
        }
        int var1 = field618;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2540;
                var4 = 33538048;
            } else {
                var3 = field582[field584[var2]];
                var4 = field584[var2] << 14;
            }
            if (var3 != null && var3.method24()) {
                var3.field46 = false;
                if ((field617 && field618 > 50 || field618 > 200) && !arg0 && var3.field437 == var3.field422) {
                    var3.field46 = true;
                }
                int var5 = var3.field410 >> 7;
                int var6 = var3.field397 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field40 == null || field510 < var3.field36 || field510 >= var3.field37) {
                        if ((var3.field410 & 0x7F) == 64 && (var3.field397 & 0x7F) == 64) {
                            if (field566 == field565[var5][var6]) {
                                continue;
                            }
                            field565[var5][var6] = field566;
                        }
                        var3.field35 = method135(var3.field410, var3.field397, Statics.field188);
                        Statics.field220.method1895(Statics.field188, var3.field410, var3.field397, var3.field35, 60, var3, var3.field452, var4, var3.field399);
                    } else {
                        var3.field46 = false;
                        var3.field35 = method135(var3.field410, var3.field397, Statics.field188);
                        Statics.field220.method1896(Statics.field188, var3.field410, var3.field397, var3.field35, 60, var3, var3.field452, var4, var3.field42, var3.field43, var3.field44, var3.field41);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ao(ZI)V")
    public static final void method599(boolean arg0) {
        for (int var1 = 0; var1 < field497; var1++) {
            class24 var2 = field496[field630[var1]];
            int var3 = (field630[var1] << 14) + 536870912;
            if (var2 != null && var2.method24() && var2.field379.field782 == arg0 && var2.field379.method608()) {
                int var4 = var2.field410 >> 7;
                int var5 = var2.field397 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field400 == 1 && (var2.field410 & 0x7F) == 64 && (var2.field397 & 0x7F) == 64) {
                        if (field566 == field565[var4][var5]) {
                            continue;
                        }
                        field565[var4][var5] = field566;
                    }
                    if (!var2.field379.field759) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field220.method1895(Statics.field188, var2.field410, var2.field397, method135(var2.field410 + (var2.field400 * 64 - 64), var2.field397 + (var2.field400 * 64 - 64), Statics.field188), var2.field400 * 64 - 64 + 60, var2, var2.field452, var3, var2.field399);
                }
            }
        }
    }

    @ObfuscatedName("bp.aw(I)V")
    public static final void method1309() {
        for (class10 var0 = (class10) field598.method3294(); var0 != null; var0 = (class10) field598.method3296()) {
            if (Statics.field188 != var0.field161 || field510 > var0.field167) {
                var0.method3320();
            } else if (field510 >= var0.field166) {
                if (var0.field174 > 0) {
                    class24 var1 = field496[var0.field174 - 1];
                    if (var1 != null && var1.field410 >= 0 && var1.field410 < 13312 && var1.field397 >= 0 && var1.field397 < 13312) {
                        var0.method93(var1.field410, var1.field397, method135(var1.field410, var1.field397, var0.field161) - var0.field165, field510);
                    }
                }
                if (var0.field174 < 0) {
                    int var2 = -var0.field174 - 1;
                    class3 var3;
                    if (field588 == var2) {
                        var3 = Statics.field2540;
                    } else {
                        var3 = field582[var2];
                    }
                    if (var3 != null && var3.field410 >= 0 && var3.field410 < 13312 && var3.field397 >= 0 && var3.field397 < 13312) {
                        var0.method93(var3.field410, var3.field397, method135(var3.field410, var3.field397, var0.field161) - var0.field165, field510);
                    }
                }
                var0.method94(field540);
                Statics.field220.method1895(Statics.field188, (int) var0.field172, (int) var0.field173, (int) var0.field178, 60, var0, var0.field164, -1, false);
            }
        }
    }

    @ObfuscatedName("w.ap(I)I")
    public static final int method221() {
        int var0 = method135(Statics.field1921, Statics.field1495, Statics.field188);
        return var0 - Statics.field2437 >= 800 || (class9.field133[Statics.field188][Statics.field1921 >> 7][Statics.field1495 >> 7] & 0x4) == 0 ? 3 : Statics.field188;
    }

    @ObfuscatedName("by.ay(IIB)V")
    public static final void method1346(int arg0, int arg1) {
        if (field476 == 2) {
            method3054((field479 - Statics.field911 << 7) + field529, (field480 - Statics.field1286 << 7) + field483, field481 * 2);
            if (field700 > -1 && field510 % 20 < 10) {
                Statics.field1381[0].method1715(field700 + arg0 - 12, field468 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("as.ag(B)V")
    public static final void method793() {
        field581 = 0;
        int var0 = (Statics.field2540.field410 >> 7) + Statics.field911;
        int var1 = (Statics.field2540.field397 >> 7) + Statics.field1286;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field581 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field581 = 1;
        }
        if (field581 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field581 = 0;
        }
    }

    @ObfuscatedName("bc.ar(IIIII)V")
    public static final void method1381(int arg0, int arg1, int arg2, int arg3) {
        if (field656 == 1) {
            Statics.field391[field571 / 100].method1715(field569 - 8, field570 - 8);
        }
        if (field656 == 2) {
            Statics.field391[field571 / 100 + 4].method1715(field569 - 8, field570 - 8);
        }
        method793();
        if (!field474) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field81.method3362("Fps:" + field1298, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field617) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field617) {
            var8 = 16711680;
        }
        Statics.field81.method3362("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("du.aq(Ly;II)V")
    public static final void method2395(class26 arg0, int arg1) {
        method3054(arg0.field410, arg0.field397, arg1);
    }

    @ObfuscatedName("el.ac(IIII)V")
    public static final void method3054(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field700 = -1;
            field468 = -1;
            return;
        }
        int var3 = method135(arg0, arg1, Statics.field188) - arg2;
        int var4 = arg0 - Statics.field1921;
        int var5 = var3 - Statics.field2437;
        int var6 = arg1 - Statics.field1495;
        int var7 = class103.field1765[Statics.field363];
        int var8 = class103.field1771[Statics.field363];
        int var9 = class103.field1765[Statics.field375];
        int var10 = class103.field1771[Statics.field375];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field700 = (var11 << 9) / var15 + 256;
            field468 = (var14 << 9) / var15 + 167;
        } else {
            field700 = -1;
            field468 = -1;
        }
    }

    @ObfuscatedName("z.at(IIII)I")
    public static final int method135(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field133[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field135[var5][var3][var4] + class9.field135[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field135[var5][var3][var4 + 1] + class9.field135[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("h.bh(ZI)V")
    public static final void method119(boolean arg0) {
        field495 = arg0;
        if (!field495) {
            int var1 = field502.method2543();
            int var2 = field502.method2496();
            int var3 = field502.method2496();
            int var4 = field502.method2606();
            int var5 = field502.method2619();
            int var6 = (field693 - field502.field2027) / 16;
            Statics.field285 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field285[var7][var8] = field502.method2507();
                }
            }
            Statics.field548 = new int[var6];
            Statics.field2303 = new int[var6];
            Statics.field273 = new int[var6];
            Statics.field132 = new byte[var6][];
            Statics.field205 = new byte[var6][];
            boolean var9 = false;
            if ((var4 / 8 == 48 || var4 / 8 == 49) && var1 / 8 == 48) {
                var9 = true;
            }
            if (var4 / 8 == 48 && var1 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var4 - 6) / 8; var11 <= (var4 + 6) / 8; var11++) {
                for (int var12 = (var1 - 6) / 8; var12 <= (var1 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field548[var10] = var13;
                        Statics.field2303[var10] = Statics.field251.method2976("m" + var11 + "_" + var12);
                        Statics.field273[var10] = Statics.field251.method2976("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method128(var4, var1, var5, var2, var3);
            return;
        }
        int var14 = field502.method2490();
        int var15 = field502.method2468();
        int var16 = field502.method2468();
        int var17 = field502.method2606();
        int var18 = field502.method2606();
        field502.method2332();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field502.method2334(1);
                    if (var22 == 1) {
                        field521[var19][var20][var21] = field502.method2334(26);
                    } else {
                        field521[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field502.method2339();
        int var23 = (field693 - field502.field2027) / 16;
        Statics.field285 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field285[var24][var25] = field502.method2505();
            }
        }
        Statics.field548 = new int[var23];
        Statics.field2303 = new int[var23];
        Statics.field273 = new int[var23];
        Statics.field132 = new byte[var23][];
        Statics.field205 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field521[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field548[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field548[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field2303[var26] = Statics.field251.method2976("m" + var35 + "_" + var36);
                            Statics.field273[var26] = Statics.field251.method2976("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method128(var16, var17, var14, var18, var15);
    }

    @ObfuscatedName("d.bs(IIIIII)V")
    public static final void method128(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field1624 == arg0 && Statics.field253 == arg1 && field512 == arg2 || !field617) {
            return;
        }
        Statics.field1624 = arg0;
        Statics.field253 = arg1;
        field512 = arg2;
        if (!field617) {
            field512 = 0;
        }
        method2054(25);
        method202(class133.field2073, true);
        int var5 = Statics.field911;
        int var6 = Statics.field1286;
        Statics.field911 = (arg0 - 6) * 8;
        Statics.field1286 = (arg1 - 6) * 8;
        int var7 = Statics.field911 - var5;
        int var8 = Statics.field1286 - var6;
        int var9 = Statics.field911;
        int var10 = Statics.field1286;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field496[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field448[var13] -= var7;
                    var12.field449[var13] -= var8;
                }
                var12.field410 -= var7 * 128;
                var12.field397 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field582[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field448[var16] -= var7;
                    var15.field449[var16] -= var8;
                }
                var15.field410 -= var7 * 128;
                var15.field397 -= var8 * 128;
            }
        }
        Statics.field188 = arg2;
        Statics.field2540.method225(arg3, arg4, false);
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
                        field596[var27][var23][var24] = field596[var27][var25][var26];
                    } else {
                        field596[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class21 var28 = (class21) field597.method3294(); var28 != null; var28 = (class21) field597.method3296()) {
            var28.field329 -= var7;
            var28.field330 -= var8;
            if (var28.field329 < 0 || var28.field330 < 0 || var28.field329 >= 104 || var28.field330 >= 104) {
                var28.method3320();
            }
        }
        if (field694 != 0) {
            field694 -= var7;
            field695 -= var8;
        }
        field702 = 0;
        field507 = false;
        field612 = -1;
        field599.method3288();
        field598.method3288();
    }

    @ObfuscatedName("a.bk(ZI)V")
    public static final void method196(boolean arg0) {
        method120();
        field506++;
        if (field506 < 50 && !arg0) {
            return;
        }
        field506 = 0;
        if (field511 || Statics.field18 == null) {
            return;
        }
        field500.method2331(83);
        try {
            Statics.field18.method1416(field500.field2029, 0, field500.field2027);
            field500.field2027 = 0;
        } catch (IOException var2) {
            field511 = true;
        }
    }

    @ObfuscatedName("cd.be(I)V")
    public static final void method2055() {
        method196(false);
        field513 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field132.length; var1++) {
            if (Statics.field2303[var1] != -1 && Statics.field132[var1] == null) {
                Statics.field132[var1] = Statics.field251.method3020(Statics.field2303[var1], 0);
                if (Statics.field132[var1] == null) {
                    var0 = false;
                    field513++;
                }
            }
            if (Statics.field273[var1] != -1 && Statics.field205[var1] == null) {
                Statics.field205[var1] = Statics.field251.method3012(Statics.field273[var1], 0, Statics.field285[var1]);
                if (Statics.field205[var1] == null) {
                    var0 = false;
                    field513++;
                }
            }
        }
        if (!var0) {
            field517 = 1;
            return;
        }
        field515 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field132.length; var3++) {
            byte[] var4 = Statics.field205[var3];
            if (var4 != null) {
                int var5 = (Statics.field548[var3] >> 8) * 64 - Statics.field911;
                int var6 = (Statics.field548[var3] & 0xFF) * 64 - Statics.field1286;
                if (field495) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method1877(var4, var5, var6);
            }
        }
        if (!var2) {
            field517 = 2;
            return;
        }
        if (field517 != 0) {
            method202(class133.field2073 + class2.field16 + class2.field25 + 100 + "%" + class2.field19, true);
        }
        method120();
        method832();
        method120();
        Statics.field220.method1884();
        method120();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field519[var7].method3217();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field133[var8][var9][var10] = 0;
                }
            }
        }
        method120();
        class9.field148 = 99;
        Statics.field156 = new byte[4][104][104];
        Statics.field136 = new byte[4][104][104];
        Statics.field137 = new byte[4][104][104];
        Statics.field1922 = new byte[4][104][104];
        Statics.field1998 = new int[4][105][105];
        Statics.field146 = new byte[4][105][105];
        Statics.field83 = new int[105][105];
        Statics.field1501 = new int[104];
        Statics.field77 = new int[104];
        Statics.field2034 = new int[104];
        Statics.field736 = new int[104];
        Statics.field1607 = new int[104];
        int var11 = Statics.field132.length;
        class7.method130();
        method196(true);
        if (!field495) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field548[var12] >> 8) * 64 - Statics.field911;
                int var14 = (Statics.field548[var12] & 0xFF) * 64 - Statics.field1286;
                byte[] var15 = Statics.field132[var12];
                if (var15 != null) {
                    method120();
                    int var16 = Statics.field1624 * 8 - 48;
                    int var17 = Statics.field253 * 8 - 48;
                    class163[] var18 = field519;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field2724[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class126 var22 = new class126(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class9.method210(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field548[var26] >> 8) * 64 - Statics.field911;
                int var28 = (Statics.field548[var26] & 0xFF) * 64 - Statics.field1286;
                byte[] var29 = Statics.field132[var26];
                if (var29 == null && Statics.field253 < 800) {
                    method120();
                    class9.method637(var27, var28, 64, 64);
                }
            }
            method196(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field205[var30];
                if (var31 != null) {
                    int var32 = (Statics.field548[var30] >> 8) * 64 - Statics.field911;
                    int var33 = (Statics.field548[var30] & 0xFF) * 64 - Statics.field1286;
                    method120();
                    class9.method1382(var31, var32, var33, Statics.field220, field519);
                }
            }
        }
        if (field495) {
            for (int var34 = 0; var34 < 4; var34++) {
                method120();
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        boolean var37 = false;
                        int var38 = field521[var34][var35][var36];
                        if (var38 != -1) {
                            int var39 = var38 >> 24 & 0x3;
                            int var40 = var38 >> 1 & 0x3;
                            int var41 = var38 >> 14 & 0x3FF;
                            int var42 = var38 >> 3 & 0x7FF;
                            int var43 = (var41 / 8 << 8) + var42 / 8;
                            for (int var44 = 0; var44 < Statics.field548.length; var44++) {
                                if (Statics.field548[var44] == var43 && Statics.field132[var44] != null) {
                                    byte[] var45 = Statics.field132[var44];
                                    int var46 = var35 * 8;
                                    int var47 = var36 * 8;
                                    int var48 = (var41 & 0x7) * 8;
                                    int var49 = (var42 & 0x7) * 8;
                                    class163[] var50 = field519;
                                    for (int var51 = 0; var51 < 8; var51++) {
                                        for (int var52 = 0; var52 < 8; var52++) {
                                            if (var46 + var51 > 0 && var46 + var51 < 103 && var47 + var52 > 0 && var47 + var52 < 103) {
                                                var50[var34].field2724[var46 + var51][var47 + var52] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class126 var53 = new class126(var45);
                                    for (int var54 = 0; var54 < 4; var54++) {
                                        for (int var55 = 0; var55 < 64; var55++) {
                                            for (int var56 = 0; var56 < 64; var56++) {
                                                if (var39 == var54 && var55 >= var48 && var55 < var48 + 8 && var56 >= var49 && var56 < var49 + 8) {
                                                    int var60 = var55 & 0x7;
                                                    int var61 = var56 & 0x7;
                                                    int var63 = var40 & 0x3;
                                                    int var64;
                                                    if (var63 == 0) {
                                                        var64 = var60;
                                                    } else if (var63 == 1) {
                                                        var64 = var61;
                                                    } else if (var63 == 2) {
                                                        var64 = 7 - var60;
                                                    } else {
                                                        var64 = 7 - var61;
                                                    }
                                                    int var67 = var46 + var64;
                                                    int var69 = var55 & 0x7;
                                                    int var70 = var56 & 0x7;
                                                    int var72 = var40 & 0x3;
                                                    int var73;
                                                    if (var72 == 0) {
                                                        var73 = var70;
                                                    } else if (var72 == 1) {
                                                        var73 = 7 - var69;
                                                    } else if (var72 == 2) {
                                                        var73 = 7 - var70;
                                                    } else {
                                                        var73 = var69;
                                                    }
                                                    class9.method210(var53, var34, var67, var47 + var73, 0, 0, var40);
                                                } else {
                                                    class9.method210(var53, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var37 = true;
                                    break;
                                }
                            }
                        }
                        if (!var37) {
                            class9.method2051(var34, var35 * 8, var36 * 8);
                        }
                    }
                }
            }
            for (int var74 = 0; var74 < 13; var74++) {
                for (int var75 = 0; var75 < 13; var75++) {
                    int var76 = field521[0][var74][var75];
                    if (var76 == -1) {
                        class9.method637(var74 * 8, var75 * 8, 8, 8);
                    }
                }
            }
            method196(true);
            for (int var77 = 0; var77 < 4; var77++) {
                method120();
                for (int var78 = 0; var78 < 13; var78++) {
                    label938: for (int var79 = 0; var79 < 13; var79++) {
                        int var80 = field521[var77][var78][var79];
                        if (var80 != -1) {
                            int var81 = var80 >> 24 & 0x3;
                            int var82 = var80 >> 1 & 0x3;
                            int var83 = var80 >> 14 & 0x3FF;
                            int var84 = var80 >> 3 & 0x7FF;
                            int var85 = (var83 / 8 << 8) + var84 / 8;
                            for (int var86 = 0; var86 < Statics.field548.length; var86++) {
                                if (Statics.field548[var86] == var85 && Statics.field205[var86] != null) {
                                    byte[] var87 = Statics.field205[var86];
                                    int var88 = var78 * 8;
                                    int var89 = var79 * 8;
                                    int var90 = (var83 & 0x7) * 8;
                                    int var91 = (var84 & 0x7) * 8;
                                    class94 var92 = Statics.field220;
                                    class163[] var93 = field519;
                                    class126 var94 = new class126(var87);
                                    int var95 = -1;
                                    while (true) {
                                        int var96 = var94.method2479();
                                        if (var96 == 0) {
                                            continue label938;
                                        }
                                        var95 += var96;
                                        int var97 = 0;
                                        while (true) {
                                            int var98 = var94.method2479();
                                            if (var98 == 0) {
                                                break;
                                            }
                                            var97 += var98 - 1;
                                            int var99 = var97 & 0x3F;
                                            int var100 = var97 >> 6 & 0x3F;
                                            int var101 = var97 >> 12;
                                            int var102 = var94.method2466();
                                            int var103 = var102 >> 2;
                                            int var104 = var102 & 0x3;
                                            if (var81 == var101 && var100 >= var90 && var100 < var90 + 8 && var99 >= var91 && var99 < var91 + 8) {
                                                class31 var105 = class31.method195(var95);
                                                int var106 = var88 + class159.method2674(var100 & 0x7, var99 & 0x7, var82, var105.field809, var105.field810, var104);
                                                int var108 = var100 & 0x7;
                                                int var109 = var99 & 0x7;
                                                int var111 = var105.field809;
                                                int var112 = var105.field810;
                                                if ((var104 & 0x1) == 1) {
                                                    int var113 = var111;
                                                    var111 = var112;
                                                    var112 = var113;
                                                }
                                                int var114 = var82 & 0x3;
                                                int var115;
                                                if (var114 == 0) {
                                                    var115 = var109;
                                                } else if (var114 == 1) {
                                                    var115 = 7 - var108 - (var111 - 1);
                                                } else if (var114 == 2) {
                                                    var115 = 7 - var109 - (var112 - 1);
                                                } else {
                                                    var115 = var108;
                                                }
                                                int var116 = var89 + var115;
                                                if (var106 > 0 && var116 > 0 && var106 < 103 && var116 < 103) {
                                                    int var117 = var77;
                                                    if ((class9.field133[1][var106][var116] & 0x2) == 2) {
                                                        var117 = var77 - 1;
                                                    }
                                                    class163 var118 = null;
                                                    if (var117 >= 0) {
                                                        var118 = var93[var117];
                                                    }
                                                    class9.method636(var77, var106, var116, var95, var82 + var104 & 0x3, var103, var92, var118);
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
        method196(true);
        method832();
        method120();
        class94 var119 = Statics.field220;
        class163[] var120 = field519;
        for (int var121 = 0; var121 < 4; var121++) {
            for (int var122 = 0; var122 < 104; var122++) {
                for (int var123 = 0; var123 < 104; var123++) {
                    if ((class9.field133[var121][var122][var123] & 0x1) == 1) {
                        int var124 = var121;
                        if ((class9.field133[1][var122][var123] & 0x2) == 2) {
                            var124 = var121 - 1;
                        }
                        if (var124 >= 0) {
                            var120[var124].method3183(var122, var123);
                        }
                    }
                }
            }
        }
        class9.field152 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field152 < -8) {
            class9.field152 = -8;
        }
        if (class9.field152 > 8) {
            class9.field152 = 8;
        }
        class9.field147 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field147 < -16) {
            class9.field147 = -16;
        }
        if (class9.field147 > 16) {
            class9.field147 = 16;
        }
        for (int var125 = 0; var125 < 4; var125++) {
            byte[][] var126 = Statics.field146[var125];
            int var127 = (int) Math.sqrt(5100.0D);
            int var128 = var127 * 768 >> 8;
            for (int var129 = 1; var129 < 103; var129++) {
                for (int var130 = 1; var130 < 103; var130++) {
                    int var131 = class9.field135[var125][var130 + 1][var129] - class9.field135[var125][var130 - 1][var129];
                    int var132 = class9.field135[var125][var130][var129 + 1] - class9.field135[var125][var130][var129 - 1];
                    int var133 = (int) Math.sqrt((double) (var132 * var132 + var131 * var131 + 65536));
                    int var134 = (var131 << 8) / var133;
                    int var135 = 65536 / var133;
                    int var136 = (var132 << 8) / var133;
                    int var137 = (var136 * -50 + var134 * -50 + var135 * -10) / var128 + 96;
                    int var138 = (var126[var130][var129] >> 1) + (var126[var130][var129 + 1] >> 3) + (var126[var130][var129 - 1] >> 2) + (var126[var130 - 1][var129] >> 2) + (var126[var130 + 1][var129] >> 3);
                    Statics.field83[var130][var129] = var137 - var138;
                }
            }
            for (int var139 = 0; var139 < 104; var139++) {
                Statics.field1501[var139] = 0;
                Statics.field77[var139] = 0;
                Statics.field2034[var139] = 0;
                Statics.field736[var139] = 0;
                Statics.field1607[var139] = 0;
            }
            for (int var140 = -5; var140 < 109; var140++) {
                for (int var141 = 0; var141 < 104; var141++) {
                    int var142 = var140 + 5;
                    int var10002;
                    if (var142 >= 0 && var142 < 104) {
                        int var143 = Statics.field156[var125][var142][var141] & 0xFF;
                        if (var143 > 0) {
                            class32 var144 = class32.method56(var143 - 1);
                            Statics.field1501[var141] += var144.field847;
                            Statics.field77[var141] += var144.field844;
                            Statics.field2034[var141] += var144.field851;
                            Statics.field736[var141] += var144.field849;
                            var10002 = Statics.field1607[var141]++;
                        }
                    }
                    int var145 = var140 - 5;
                    if (var145 >= 0 && var145 < 104) {
                        int var146 = Statics.field156[var125][var145][var141] & 0xFF;
                        if (var146 > 0) {
                            class32 var147 = class32.method56(var146 - 1);
                            Statics.field1501[var141] -= var147.field847;
                            Statics.field77[var141] -= var147.field844;
                            Statics.field2034[var141] -= var147.field851;
                            Statics.field736[var141] -= var147.field849;
                            var10002 = Statics.field1607[var141]--;
                        }
                    }
                }
                if (var140 >= 1 && var140 < 103) {
                    int var148 = 0;
                    int var149 = 0;
                    int var150 = 0;
                    int var151 = 0;
                    int var152 = 0;
                    for (int var153 = -5; var153 < 109; var153++) {
                        int var154 = var153 + 5;
                        if (var154 >= 0 && var154 < 104) {
                            var148 += Statics.field1501[var154];
                            var149 += Statics.field77[var154];
                            var150 += Statics.field2034[var154];
                            var151 += Statics.field736[var154];
                            var152 += Statics.field1607[var154];
                        }
                        int var155 = var153 - 5;
                        if (var155 >= 0 && var155 < 104) {
                            var148 -= Statics.field1501[var155];
                            var149 -= Statics.field77[var155];
                            var150 -= Statics.field2034[var155];
                            var151 -= Statics.field736[var155];
                            var152 -= Statics.field1607[var155];
                        }
                        if (var153 >= 1 && var153 < 103 && (!field617 || (class9.field133[0][var140][var153] & 0x2) != 0 || (class9.field133[var125][var140][var153] & 0x10) == 0 && class9.method1623(var125, var140, var153) == field512)) {
                            if (var125 < class9.field148) {
                                class9.field148 = var125;
                            }
                            int var156 = Statics.field156[var125][var140][var153] & 0xFF;
                            int var157 = Statics.field136[var125][var140][var153] & 0xFF;
                            if (var156 > 0 || var157 > 0) {
                                int var158 = class9.field135[var125][var140][var153];
                                int var159 = class9.field135[var125][var140 + 1][var153];
                                int var160 = class9.field135[var125][var140 + 1][var153 + 1];
                                int var161 = class9.field135[var125][var140][var153 + 1];
                                int var162 = Statics.field83[var140][var153];
                                int var163 = Statics.field83[var140 + 1][var153];
                                int var164 = Statics.field83[var140 + 1][var153 + 1];
                                int var165 = Statics.field83[var140][var153 + 1];
                                int var166 = -1;
                                int var167 = -1;
                                if (var156 > 0) {
                                    int var168 = var148 * 256 / var151;
                                    int var169 = var149 / var152;
                                    int var170 = var150 / var152;
                                    var166 = class9.method1210(var168, var169, var170);
                                    int var171 = class9.field152 + var168 & 0xFF;
                                    int var172 = class9.field147 + var170;
                                    if (var172 < 0) {
                                        var172 = 0;
                                    } else if (var172 > 255) {
                                        var172 = 255;
                                    }
                                    var167 = class9.method1210(var171, var169, var172);
                                }
                                if (var125 > 0) {
                                    boolean var173 = true;
                                    if (var156 == 0 && Statics.field137[var125][var140][var153] != 0) {
                                        var173 = false;
                                    }
                                    if (var157 > 0 && !class36.method2(var157 - 1).field916) {
                                        var173 = false;
                                    }
                                    if (var173 && var158 == var159 && var158 == var160 && var158 == var161) {
                                        Statics.field1998[var125][var140][var153] |= 0x924;
                                    }
                                }
                                int var174 = 0;
                                if (var167 != -1) {
                                    var174 = class103.field1766[class9.method8(var167, 96)];
                                }
                                if (var157 == 0) {
                                    var119.method1892(var125, var140, var153, 0, 0, -1, var158, var159, var160, var161, class9.method8(var166, var162), class9.method8(var166, var163), class9.method8(var166, var164), class9.method8(var166, var165), 0, 0, 0, 0, var174, 0);
                                } else {
                                    int var175 = Statics.field137[var125][var140][var153] + 1;
                                    byte var176 = Statics.field1922[var125][var140][var153];
                                    class36 var177 = class36.method2(var157 - 1);
                                    int var178 = var177.field919;
                                    int var179;
                                    int var180;
                                    if (var178 >= 0) {
                                        var179 = Statics.field1747.method2206(var178);
                                        var180 = -1;
                                    } else if (var177.field924 == 16711935) {
                                        var180 = -2;
                                        var178 = -1;
                                        var179 = -2;
                                    } else {
                                        var180 = class9.method1210(var177.field917, var177.field923, var177.field918);
                                        int var181 = class9.field152 + var177.field917 & 0xFF;
                                        int var182 = class9.field147 + var177.field918;
                                        if (var182 < 0) {
                                            var182 = 0;
                                        } else if (var182 > 255) {
                                            var182 = 255;
                                        }
                                        var179 = class9.method1210(var181, var177.field923, var182);
                                    }
                                    int var183 = 0;
                                    if (var179 != -2) {
                                        var183 = class103.field1766[Statics.method1268(var179, 96)];
                                    }
                                    if (var177.field921 != -1) {
                                        int var184 = class9.field152 + var177.field925 & 0xFF;
                                        int var185 = class9.field147 + var177.field922;
                                        if (var185 < 0) {
                                            var185 = 0;
                                        } else if (var185 > 255) {
                                            var185 = 255;
                                        }
                                        int var186 = class9.method1210(var184, var177.field926, var185);
                                        var183 = class103.field1766[Statics.method1268(var186, 96)];
                                    }
                                    var119.method1892(var125, var140, var153, var175, var176, var178, var158, var159, var160, var161, class9.method8(var166, var162), class9.method8(var166, var163), class9.method8(var166, var164), class9.method8(var166, var165), Statics.method1268(var180, var162), Statics.method1268(var180, var163), Statics.method1268(var180, var164), Statics.method1268(var180, var165), var174, var183);
                                }
                            }
                        }
                    }
                }
            }
            for (int var187 = 1; var187 < 103; var187++) {
                for (int var188 = 1; var188 < 103; var188++) {
                    var119.method1918(var125, var188, var187, class9.method1623(var125, var188, var187));
                }
            }
            Statics.field156[var125] = (byte[][]) null;
            Statics.field136[var125] = (byte[][]) null;
            Statics.field137[var125] = (byte[][]) null;
            Statics.field1922[var125] = (byte[][]) null;
            Statics.field146[var125] = (byte[][]) null;
        }
        var119.method1914(-50, -10, -50);
        for (int var189 = 0; var189 < 104; var189++) {
            for (int var190 = 0; var190 < 104; var190++) {
                if ((class9.field133[1][var189][var190] & 0x2) == 2) {
                    var119.method1883(var189, var190);
                }
            }
        }
        int var191 = 1;
        int var192 = 2;
        int var193 = 4;
        for (int var194 = 0; var194 < 4; var194++) {
            if (var194 > 0) {
                var191 <<= 0x3;
                var192 <<= 0x3;
                var193 <<= 0x3;
            }
            for (int var195 = 0; var195 <= var194; var195++) {
                for (int var196 = 0; var196 <= 104; var196++) {
                    for (int var197 = 0; var197 <= 104; var197++) {
                        if ((Statics.field1998[var195][var197][var196] & var191) != 0) {
                            int var198 = var196;
                            int var199 = var196;
                            int var200 = var195;
                            int var201 = var195;
                            while (var198 > 0 && (Statics.field1998[var195][var197][var198 - 1] & var191) != 0) {
                                var198--;
                            }
                            while (var199 < 104 && (Statics.field1998[var195][var197][var199 + 1] & var191) != 0) {
                                var199++;
                            }
                            label671: while (var200 > 0) {
                                for (int var202 = var198; var202 <= var199; var202++) {
                                    if ((Statics.field1998[var200 - 1][var197][var202] & var191) == 0) {
                                        break label671;
                                    }
                                }
                                var200--;
                            }
                            label660: while (var201 < var194) {
                                for (int var203 = var198; var203 <= var199; var203++) {
                                    if ((Statics.field1998[var201 + 1][var197][var203] & var191) == 0) {
                                        break label660;
                                    }
                                }
                                var201++;
                            }
                            int var204 = (var201 + 1 - var200) * (var199 - var198 + 1);
                            if (var204 >= 8) {
                                short var205 = 240;
                                int var206 = class9.field135[var201][var197][var198] - var205;
                                int var207 = class9.field135[var200][var197][var198];
                                class94.method1887(var194, 1, var197 * 128, var197 * 128, var198 * 128, var199 * 128 + 128, var206, var207);
                                for (int var208 = var200; var208 <= var201; var208++) {
                                    for (int var209 = var198; var209 <= var199; var209++) {
                                        Statics.field1998[var208][var197][var209] &= ~var191;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1998[var195][var197][var196] & var192) != 0) {
                            int var210 = var197;
                            int var211 = var197;
                            int var212 = var195;
                            int var213 = var195;
                            while (var210 > 0 && (Statics.field1998[var195][var210 - 1][var196] & var192) != 0) {
                                var210--;
                            }
                            while (var211 < 104 && (Statics.field1998[var195][var211 + 1][var196] & var192) != 0) {
                                var211++;
                            }
                            label724: while (var212 > 0) {
                                for (int var214 = var210; var214 <= var211; var214++) {
                                    if ((Statics.field1998[var212 - 1][var214][var196] & var192) == 0) {
                                        break label724;
                                    }
                                }
                                var212--;
                            }
                            label713: while (var213 < var194) {
                                for (int var215 = var210; var215 <= var211; var215++) {
                                    if ((Statics.field1998[var213 + 1][var215][var196] & var192) == 0) {
                                        break label713;
                                    }
                                }
                                var213++;
                            }
                            int var216 = (var213 + 1 - var212) * (var211 - var210 + 1);
                            if (var216 >= 8) {
                                short var217 = 240;
                                int var218 = class9.field135[var213][var210][var196] - var217;
                                int var219 = class9.field135[var212][var210][var196];
                                class94.method1887(var194, 2, var210 * 128, var211 * 128 + 128, var196 * 128, var196 * 128, var218, var219);
                                for (int var220 = var212; var220 <= var213; var220++) {
                                    for (int var221 = var210; var221 <= var211; var221++) {
                                        Statics.field1998[var220][var221][var196] &= ~var192;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1998[var195][var197][var196] & var193) != 0) {
                            int var222 = var197;
                            int var223 = var197;
                            int var224 = var196;
                            int var225 = var196;
                            while (var224 > 0 && (Statics.field1998[var195][var197][var224 - 1] & var193) != 0) {
                                var224--;
                            }
                            while (var225 < 104 && (Statics.field1998[var195][var197][var225 + 1] & var193) != 0) {
                                var225++;
                            }
                            label777: while (var222 > 0) {
                                for (int var226 = var224; var226 <= var225; var226++) {
                                    if ((Statics.field1998[var195][var222 - 1][var226] & var193) == 0) {
                                        break label777;
                                    }
                                }
                                var222--;
                            }
                            label766: while (var223 < 104) {
                                for (int var227 = var224; var227 <= var225; var227++) {
                                    if ((Statics.field1998[var195][var223 + 1][var227] & var193) == 0) {
                                        break label766;
                                    }
                                }
                                var223++;
                            }
                            if ((var223 - var222 + 1) * (var225 - var224 + 1) >= 4) {
                                int var228 = class9.field135[var195][var222][var224];
                                class94.method1887(var194, 4, var222 * 128, var223 * 128 + 128, var224 * 128, var225 * 128 + 128, var228, var228);
                                for (int var229 = var222; var229 <= var223; var229++) {
                                    for (int var230 = var224; var230 <= var225; var230++) {
                                        Statics.field1998[var195][var229][var230] &= ~var193;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method196(true);
        int var231 = class9.field148;
        if (var231 > Statics.field188) {
            var231 = Statics.field188;
        }
        if (var231 < Statics.field188 - 1) {
            int var232 = Statics.field188 - 1;
        }
        if (field617) {
            Statics.field220.method1885(class9.field148);
        } else {
            Statics.field220.method1885(0);
        }
        for (int var233 = 0; var233 < 104; var233++) {
            for (int var234 = 0; var234 < 104; var234++) {
                method207(var233, var234);
            }
        }
        method120();
        for (class21 var235 = (class21) field597.method3294(); var235 != null; var235 = (class21) field597.method3296()) {
            if (var235.field338 == -1) {
                var235.field328 = 0;
                method3179(var235);
            } else {
                var235.method3320();
            }
        }
        class31.field822.method3227();
        if (Statics.field201 != null) {
            field500.method2331(39);
            field500.method2455(1057001181);
        }
        if (!field495) {
            int var236 = (Statics.field1624 - 6) / 8;
            int var237 = (Statics.field1624 + 6) / 8;
            int var238 = (Statics.field253 - 6) / 8;
            int var239 = (Statics.field253 + 6) / 8;
            for (int var240 = var236 - 1; var240 <= var237 + 1; var240++) {
                for (int var241 = var238 - 1; var241 <= var239 + 1; var241++) {
                    if (var240 < var236 || var240 > var237 || var241 < var238 || var241 > var239) {
                        Statics.field251.method3022("m" + var240 + "_" + var241);
                        Statics.field251.method3022("l" + var240 + "_" + var241);
                    }
                }
            }
        }
        method2054(30);
        method120();
        class9.method1428();
        field500.method2331(191);
        class72.method1410();
    }

    @ObfuscatedName("cl.bp(IIIIIB)V")
    public static final void method1614(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field220.method1909(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field220.method2044(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2436.field1448;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method195(var12);
            if (var13.field823 == -1) {
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
                class86 var14 = Statics.field735[var13.field823];
                if (var14 != null) {
                    int var15 = (var13.field809 * 4 - var14.field1459) / 2;
                    int var16 = (var13.field810 * 4 - var14.field1458) / 2;
                    var14.method1794(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field810) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field220.method1911(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field220.method2044(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method195(var21);
            if (var22.field823 != -1) {
                class86 var23 = Statics.field735[var22.field823];
                if (var23 != null) {
                    int var24 = (var22.field809 * 4 - var23.field1459) / 2;
                    int var25 = (var22.field810 * 4 - var23.field1458) / 2;
                    var23.method1794(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field810) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2436.field1448;
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
        int var29 = Statics.field220.method1912(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method195(var30);
        if (var31.field823 == -1) {
            return;
        }
        class86 var32 = Statics.field735[var31.field823];
        if (var32 != null) {
            int var33 = (var31.field809 * 4 - var32.field1459) / 2;
            int var34 = (var31.field810 * 4 - var32.field1458) / 2;
            var32.method1794(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field810) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("am.bi(IIII)Z")
    public static final boolean method700(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field220.method2044(Statics.field188, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method195(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field809;
                var9 = var7.field810;
            } else {
                var8 = var7.field810;
                var9 = var7.field809;
            }
            int var10 = var7.field832;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method133(Statics.field2540.field448[0], Statics.field2540.field449[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method133(Statics.field2540.field448[0], Statics.field2540.field449[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field569 = class76.field1382;
        field570 = class76.field1380;
        field656 = 2;
        field571 = 0;
        return true;
    }

    @ObfuscatedName("m.bf(IIIIZIIIIIII)Z")
    public static final boolean method133(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field524[var11][var12] = 0;
                field679[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field524[arg0][arg1] = 99;
        field679[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field614[var15] = arg0;
        int var36 = var15 + 1;
        field527[var15] = arg1;
        boolean var17 = false;
        int var18 = field614.length;
        int[][] var19 = field519[Statics.field188].field2724;
        while (var36 != var16) {
            var13 = field614[var16];
            var14 = field527[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field519[Statics.field188].method3190(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field519[Statics.field188].method3180(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field519[Statics.field188].method3192(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field679[var13][var14] + 1;
            if (var13 > 0 && field524[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field614[var36] = var13 - 1;
                field527[var36] = var14;
                var36 = (var36 + 1) % var18;
                field524[var13 - 1][var14] = 2;
                field679[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field524[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field614[var36] = var13 + 1;
                field527[var36] = var14;
                var36 = (var36 + 1) % var18;
                field524[var13 + 1][var14] = 8;
                field679[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field524[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field614[var36] = var13;
                field527[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field524[var13][var14 - 1] = 1;
                field679[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field524[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field614[var36] = var13;
                field527[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field524[var13][var14 + 1] = 4;
                field679[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field524[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field614[var36] = var13 - 1;
                field527[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field524[var13 - 1][var14 - 1] = 3;
                field679[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field524[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field614[var36] = var13 + 1;
                field527[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field524[var13 + 1][var14 - 1] = 9;
                field679[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field524[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field614[var36] = var13 - 1;
                field527[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field524[var13 - 1][var14 + 1] = 6;
                field679[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field524[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field614[var36] = var13 + 1;
                field527[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field524[var13 + 1][var14 + 1] = 12;
                field679[var13 + 1][var14 + 1] = var20;
            }
        }
        field579 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field679[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field679[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field679[var24][var25];
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
            field579 = 1;
        }
        byte var29 = 0;
        field614[var29] = var13;
        int var37 = var29 + 1;
        field527[var29] = var14;
        int var30;
        int var31 = var30 = field524[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field614[var37] = var13;
                field527[var37++] = var14;
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
            var31 = field524[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field614[var37];
            int var34 = field527[var37];
            if (arg10 == 0) {
                field500.method2331(84);
                field500.method2452(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field500.method2331(55);
                field500.method2452(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field500.method2331(89);
                field500.method2452(var32 + var32 + 3);
            }
            field694 = field614[0];
            field695 = field527[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field500.method2488(field614[var37] - var33);
                field500.method2502(field527[var37] - var34);
            }
            field500.method2454(Statics.field1286 + var34);
            field500.method2488(class74.field1338[82] ? 1 : 0);
            field500.method2454(Statics.field911 + var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("bg.bo(I)Z")
    public static final boolean method1434() {
        if (Statics.field18 == null) {
            return false;
        }
        try {
            int var0 = Statics.field18.method1414();
            if (var0 == 0) {
                return false;
            }
            if (field504 == -1) {
                Statics.field18.method1415(field502.field2029, 0, 1);
                field502.field2027 = 0;
                field504 = field502.method2333();
                field693 = class164.field2769[field504];
                var0--;
            }
            if (field693 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field18.method1415(field502.field2029, 0, 1);
                field693 = field502.field2029[0] & 0xFF;
                var0--;
            }
            if (field693 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field18.method1415(field502.field2029, 0, 2);
                field502.field2027 = 0;
                field693 = field502.method2468();
                var0 -= 2;
            }
            if (var0 < field693) {
                return false;
            }
            field502.field2027 = 0;
            Statics.field18.method1415(field502.field2029, 0, field693);
            field505 = 0;
            field547 = field482;
            field482 = field508;
            field508 = field504;
            if (field504 == 29) {
                field507 = false;
                for (int var1 = 0; var1 < 5; var1++) {
                    field709[var1] = false;
                }
                field504 = -1;
                return true;
            }
            if (field504 == 140) {
                int var2 = field502.method2606();
                if (var2 == 65535) {
                    var2 = -1;
                }
                method52(var2);
                field504 = -1;
                return true;
            }
            if (field504 == 22) {
                int var3 = field502.method2511();
                int var4 = field502.method2543();
                if (var4 == 65535) {
                    var4 = -1;
                }
                if (field697 != 0 && var4 != -1) {
                    class137.method799(Statics.field1999, var4, 0, field697, false);
                    field699 = true;
                }
                field504 = -1;
                return true;
            }
            if (field504 == 127) {
                String var5 = field502.method2462();
                if (var5.endsWith(":tradereq:")) {
                    String var6 = var5.substring(0, var5.indexOf(":"));
                    boolean var7 = false;
                    if (method224(var6)) {
                        var7 = true;
                    }
                    if (!var7 && field581 == 0) {
                        method2367(4, var6, class133.field2202);
                    }
                } else if (var5.endsWith(":duelreq:")) {
                    String var8 = var5.substring(0, var5.indexOf(":"));
                    boolean var9 = false;
                    if (method224(var8)) {
                        var9 = true;
                    }
                    if (!var9 && field581 == 0) {
                        method2367(8, var8, class133.field2203);
                    }
                } else if (var5.endsWith(":chalreq:")) {
                    String var10 = var5.substring(0, var5.indexOf(":"));
                    boolean var11 = false;
                    if (method224(var10)) {
                        var11 = true;
                    }
                    if (!var11 && field581 == 0) {
                        String var12 = var5.substring(var5.indexOf(":") + 1, var5.length() - 9);
                        method2367(8, var10, var12);
                    }
                } else if (var5.endsWith(":assistreq:")) {
                    String var13 = var5.substring(0, var5.indexOf(":"));
                    boolean var14 = false;
                    if (method224(var13)) {
                        var14 = true;
                    }
                    if (!var14 && field581 == 0) {
                        method2367(10, var13, "");
                    }
                } else if (var5.endsWith(":clan:")) {
                    String var15 = var5.substring(0, var5.indexOf(":clan:"));
                    method2367(11, "", var15);
                } else if (var5.endsWith(":trade:")) {
                    String var16 = var5.substring(0, var5.indexOf(":trade:"));
                    if (field581 == 0) {
                        method2367(12, "", var16);
                    }
                } else if (var5.endsWith(":assist:")) {
                    String var17 = var5.substring(0, var5.indexOf(":assist:"));
                    if (field581 == 0) {
                        method2367(13, "", var17);
                    }
                } else {
                    method2367(0, "", var5);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 41) {
                int var18 = field502.method2509();
                int var19 = field502.method2509();
                int var20 = field502.method2500();
                class157 var21 = class157.method3077(var20);
                int var22 = var21.field2581 + var19;
                int var23 = var21.field2572 + var18;
                if (var21.field2676 != var22 || var21.field2580 != var23) {
                    var21.field2676 = var22;
                    var21.field2580 = var23;
                    Statics.method1598(var21);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 34 || field504 == 62 || field504 == 252 || field504 == 142 || field504 == 163 || field504 == 42 || field504 == 214 || field504 == 117 || field504 == 190 || field504 == 179 || field504 == 147) {
                method2815();
                field504 = -1;
                return true;
            }
            if (field504 == 186) {
                int var24 = field502.method2506();
                int var25 = field502.method2606();
                class157 var26 = class157.method3077(var24);
                if (var26.field2597 != 2 || var26.field2683 != var25) {
                    var26.field2597 = 2;
                    var26.field2683 = var25;
                    Statics.method1598(var26);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 9) {
                field590 = 0;
                field585 = 0;
                method136();
                int var27 = field502.method2334(8);
                if (var27 < field618) {
                    for (int var28 = var27; var28 < field618; var28++) {
                        field591[++field590 - 1] = field584[var28];
                    }
                }
                if (var27 > field618) {
                    throw new RuntimeException("");
                }
                field618 = 0;
                for (int var29 = 0; var29 < var27; var29++) {
                    int var30 = field584[var29];
                    class3 var31 = field582[var30];
                    int var32 = field502.method2334(1);
                    if (var32 == 0) {
                        field584[++field618 - 1] = var30;
                        var31.field429 = field510;
                    } else {
                        int var33 = field502.method2334(2);
                        if (var33 == 0) {
                            field584[++field618 - 1] = var30;
                            var31.field429 = field510;
                            field543[++field585 - 1] = var30;
                        } else if (var33 == 1) {
                            field584[++field618 - 1] = var30;
                            var31.field429 = field510;
                            int var34 = field502.method2334(3);
                            var31.method227(var34, false);
                            int var35 = field502.method2334(1);
                            if (var35 == 1) {
                                field543[++field585 - 1] = var30;
                            }
                        } else if (var33 == 2) {
                            field584[++field618 - 1] = var30;
                            var31.field429 = field510;
                            int var36 = field502.method2334(3);
                            var31.method227(var36, true);
                            int var37 = field502.method2334(3);
                            var31.method227(var37, true);
                            int var38 = field502.method2334(1);
                            if (var38 == 1) {
                                field543[++field585 - 1] = var30;
                            }
                        } else if (var33 == 3) {
                            field591[++field590 - 1] = var30;
                        }
                    }
                }
                while (field502.method2341(field693) >= 11) {
                    int var39 = field502.method2334(11);
                    if (var39 == 2047) {
                        break;
                    }
                    boolean var40 = false;
                    if (field582[var39] == null) {
                        field582[var39] = new class3();
                        if (field572[var39] != null) {
                            field582[var39].method12(field572[var39]);
                        }
                        var40 = true;
                    }
                    field584[++field618 - 1] = var39;
                    class3 var41 = field582[var39];
                    var41.field429 = field510;
                    int var42 = field502.method2334(1);
                    int var43 = field502.method2334(1);
                    if (var43 == 1) {
                        field543[++field585 - 1] = var39;
                    }
                    int var44 = field502.method2334(5);
                    if (var44 > 15) {
                        var44 -= 32;
                    }
                    int var45 = field604[field502.method2334(3)];
                    if (var40) {
                        var41.field408 = var41.field452 = var45;
                    }
                    int var46 = field502.method2334(5);
                    if (var46 > 15) {
                        var46 -= 32;
                    }
                    var41.method225(Statics.field2540.field448[0] + var44, Statics.field2540.field449[0] + var46, var42 == 1);
                }
                field502.method2339();
                method107();
                for (int var47 = 0; var47 < field590; var47++) {
                    int var48 = field591[var47];
                    if (field510 != field582[var48].field429) {
                        field582[var48] = null;
                    }
                }
                if (field693 != field502.field2027) {
                    throw new RuntimeException(field502.field2027 + class2.field24 + field693);
                }
                for (int var49 = 0; var49 < field618; var49++) {
                    if (field582[field584[var49]] == null) {
                        throw new RuntimeException(var49 + class2.field24 + field618);
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 208) {
                int var50 = field502.method2619();
                int var51 = field502.method2619();
                int var52 = field502.method2490();
                Statics.field188 = var50 >> 1;
                Statics.field2540.method225(var51, var52, (var50 & 0x1) == 1);
                field504 = -1;
                return true;
            }
            if (field504 == 146) {
                int var53 = field502.method2606();
                if (var53 == 65535) {
                    var53 = -1;
                }
                int var54 = field502.method2500();
                int var55 = field502.method2543();
                if (var55 == 65535) {
                    var55 = -1;
                }
                int var56 = field502.method2506();
                for (int var57 = var55; var57 <= var53; var57++) {
                    long var58 = ((long) var54 << 32) + (long) var57;
                    class178 var60 = field523.method3270(var58);
                    if (var60 != null) {
                        var60.method3320();
                    }
                    field523.method3284(new class170(var56), var58);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 89) {
                field455 = field502.method2466();
                field680 = field502.method2466();
                field504 = -1;
                return true;
            }
            if (field504 == 120) {
                int var61 = field693 + field502.field2027;
                int var62 = field502.method2468();
                int var63 = field502.method2468();
                if (field622 != var62) {
                    field622 = var62;
                    method546(field622);
                    class25.method757(field622);
                    for (int var64 = 0; var64 < 100; var64++) {
                        field665[var64] = true;
                    }
                }
                while (var63-- > 0) {
                    int var65 = field502.method2500();
                    int var66 = field502.method2468();
                    int var67 = field502.method2466();
                    class4 var68 = (class4) field623.method3270((long) var65);
                    if (var68 != null && var68.field55 != var66) {
                        method89(var68, true);
                        var68 = null;
                    }
                    if (var68 == null) {
                        var68 = method47(var65, var66, var67);
                    }
                    var68.field52 = true;
                }
                for (class4 var69 = (class4) field623.method3275(); var69 != null; var69 = (class4) field623.method3274()) {
                    if (var69.field52) {
                        var69.field52 = false;
                    } else {
                        method89(var69, true);
                    }
                }
                field523 = new class174(512);
                while (field502.field2027 < var61) {
                    int var70 = field502.method2500();
                    int var71 = field502.method2468();
                    int var72 = field502.method2468();
                    int var73 = field502.method2500();
                    for (int var74 = var71; var74 <= var72; var74++) {
                        long var75 = ((long) var70 << 32) + (long) var74;
                        field523.method3284(new class170(var73), var75);
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 63) {
                Statics.field2045 = field502.method2619();
                Statics.field1190 = field502.method2490();
                while (field502.field2027 < field693) {
                    field504 = field502.method2466();
                    method2815();
                }
                field504 = -1;
                return true;
            }
            if (field504 == 100) {
                Statics.field2045 = field502.method2619();
                Statics.field1190 = field502.method2466();
                for (int var77 = Statics.field1190; var77 < Statics.field1190 + 8; var77++) {
                    for (int var78 = Statics.field2045; var78 < Statics.field2045 + 8; var78++) {
                        if (field596[Statics.field188][var77][var78] != null) {
                            field596[Statics.field188][var77][var78] = null;
                            method207(var77, var78);
                        }
                    }
                }
                for (class21 var79 = (class21) field597.method3294(); var79 != null; var79 = (class21) field597.method3296()) {
                    if (var79.field329 >= Statics.field1190 && var79.field329 < Statics.field1190 + 8 && var79.field330 >= Statics.field2045 && var79.field330 < Statics.field2045 + 8 && Statics.field188 == var79.field327) {
                        var79.field338 = 0;
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 50) {
                String var80 = field502.method2462();
                long var81 = field502.method2472();
                long var83 = (long) field502.method2468();
                long var85 = (long) field502.method2470();
                int var87 = field502.method2466();
                long var88 = (var83 << 32) + var85;
                boolean var90 = false;
                for (int var91 = 0; var91 < 100; var91++) {
                    if (field681[var91] == var88) {
                        var90 = true;
                        break;
                    }
                }
                if (var87 <= 1 && method224(var80)) {
                    var90 = true;
                }
                if (!var90 && field581 == 0) {
                    field681[field503] = var88;
                    field503 = (field503 + 1) % 100;
                    class115 var92 = field502;
                    String var96;
                    try {
                        int var93 = var92.method2479();
                        if (var93 > 32767) {
                            var93 = 32767;
                        }
                        byte[] var94 = new byte[var93];
                        var92.field2027 += Statics.field2829.method2389(var92.field2029, var92.field2027, var94, 0, var93);
                        String var95 = class148.method64(var94, 0, var93);
                        var96 = var95;
                    } catch (Exception var283) {
                        var96 = "Cabbage";
                    }
                    String var99 = class184.method3404(class146.method1409(var96));
                    if (var87 == 2 || var87 == 3) {
                        method25(9, class2.method1377(1) + var80, var99, class145.method2403(var81));
                    } else if (var87 == 1) {
                        method25(9, class2.method1377(0) + var80, var99, class145.method2403(var81));
                    } else {
                        method25(9, var80, var99, class145.method2403(var81));
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 15) {
                Statics.field2428 = class136.method1406(field502.method2466());
                field504 = -1;
                return true;
            }
            if (field504 == 250) {
                field502.field2027 += 28;
                if (field502.method2486()) {
                    class81.method2053(field502, field502.field2027 - 28);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 194) {
                method3037();
                field627 = field502.method2466();
                field655 = field645;
                field504 = -1;
                return true;
            }
            if (field504 == 83) {
                method3037();
                field628 = field502.method2469();
                field655 = field645;
                field504 = -1;
                return true;
            }
            if (field504 == 95) {
                boolean var100 = field502.method2490() == 1;
                int var101 = field502.method2500();
                class157 var102 = class157.method3077(var101);
                if (var102.field2645 != var100) {
                    var102.field2645 = var100;
                    Statics.method1598(var102);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 201) {
                int var103 = field502.method2468();
                int var104 = field502.method2466();
                int var105 = field502.method2468();
                method32(var103, var104, var105);
                field504 = -1;
                return true;
            }
            if (field504 == 125) {
                method423();
                field504 = -1;
                return true;
            }
            if (field504 == 244) {
                String var106 = field502.method2462();
                int var107 = field502.method2468();
                byte var108 = field502.method2499();
                boolean var109 = false;
                if (var108 == -128) {
                    var109 = true;
                }
                if (var109) {
                    if (Statics.field856 == 0) {
                        field504 = -1;
                        return true;
                    }
                    boolean var110 = false;
                    int var111;
                    for (var111 = 0; var111 < Statics.field856 && (!Statics.field107[var111].field127.equals(var106) || Statics.field107[var111].field117 != var107); var111++) {
                    }
                    if (var111 < Statics.field856) {
                        while (var111 < Statics.field856 - 1) {
                            Statics.field107[var111] = Statics.field107[var111 + 1];
                            var111++;
                        }
                        Statics.field856--;
                        Statics.field107[Statics.field856] = null;
                    }
                } else {
                    field502.method2462();
                    class8 var112 = new class8();
                    var112.field127 = var106;
                    var112.field112 = class147.method831(var112.field127, Statics.field1276);
                    var112.field117 = var107;
                    var112.field115 = var108;
                    int var113;
                    for (var113 = Statics.field856 - 1; var113 >= 0; var113--) {
                        int var114 = Statics.field107[var113].field112.compareTo(var112.field127);
                        if (var114 == 0) {
                            Statics.field107[var113].field117 = var107;
                            Statics.field107[var113].field115 = var108;
                            if (var106.equals(Statics.field2540.field33)) {
                                Statics.field119 = var108;
                            }
                            field677 = field645;
                            field504 = -1;
                            return true;
                        }
                        if (var114 < 0) {
                            break;
                        }
                    }
                    if (Statics.field856 >= Statics.field107.length) {
                        field504 = -1;
                        return true;
                    }
                    for (int var115 = Statics.field856 - 1; var115 > var113; var115--) {
                        Statics.field107[var115 + 1] = Statics.field107[var115];
                    }
                    if (Statics.field856 == 0) {
                        Statics.field107 = new class8[100];
                    }
                    Statics.field107[var113 + 1] = var112;
                    Statics.field856++;
                    if (var106.equals(Statics.field2540.field33)) {
                        Statics.field119 = var108;
                    }
                }
                field677 = field645;
                field504 = -1;
                return true;
            }
            if (field504 == 239) {
                int var116 = field502.method2507();
                class157 var117 = class157.method3077(var116);
                var117.field2597 = 3;
                var117.field2683 = Statics.field2540.field30.method3160();
                Statics.method1598(var117);
                field504 = -1;
                return true;
            }
            if (field504 == 218) {
                method3037();
                int var118 = field502.method2619();
                int var119 = field502.method2505();
                int var120 = field502.method2466();
                field602[var118] = var119;
                field671[var118] = var120;
                field601[var118] = 1;
                for (int var121 = 0; var121 < 98; var121++) {
                    if (var119 >= class129.field2035[var121]) {
                        field601[var118] = var121 + 2;
                    }
                }
                field650[++field651 - 1 & 0x1F] = var118;
                field504 = -1;
                return true;
            }
            if (field504 == 51) {
                for (int var122 = 0; var122 < class158.field2693.length; var122++) {
                    if (class158.field2693[var122] != class158.field2692[var122]) {
                        class158.field2693[var122] = class158.field2692[var122];
                        method192(var122);
                        field646[++field647 - 1 & 0x1F] = var122;
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 171) {
                int var123 = field502.method2500();
                int var124 = field502.method2468();
                if (var123 < -70000) {
                    var124 += 32768;
                }
                class157 var125;
                if (var123 >= 0) {
                    var125 = class157.method3077(var123);
                } else {
                    var125 = null;
                }
                while (field502.field2027 < field693) {
                    int var126 = field502.method2479();
                    int var127 = field502.method2468();
                    int var128 = 0;
                    if (var127 != 0) {
                        var128 = field502.method2466();
                        if (var128 == 255) {
                            var128 = field502.method2500();
                        }
                    }
                    if (var125 != null && var126 >= 0 && var126 < var125.field2649.length) {
                        var125.field2649[var126] = var127;
                        var125.field2630[var126] = var128;
                    }
                    class18.method2393(var124, var126, var127 - 1, var128);
                }
                if (var125 != null) {
                    Statics.method1598(var125);
                }
                method3037();
                field648[++field649 - 1 & 0x1F] = var124 & 0x7FFF;
                field504 = -1;
                return true;
            }
            if (field504 == 173) {
                if (field622 != -1) {
                    int var129 = field622;
                    if (class157.method2697(var129)) {
                        method28(Statics.field2638[var129], 0);
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 153) {
                int var130 = field502.method2543();
                int var131 = field502.method2505();
                class158.field2692[var130] = var131;
                if (class158.field2693[var130] != var131) {
                    class158.field2693[var130] = var131;
                    method192(var130);
                }
                field646[++field647 - 1 & 0x1F] = var130;
                field504 = -1;
                return true;
            }
            if (field504 == 135) {
                for (int var132 = 0; var132 < field582.length; var132++) {
                    if (field582[var132] != null) {
                        field582[var132].field425 = -1;
                    }
                }
                for (int var133 = 0; var133 < field496.length; var133++) {
                    if (field496[var133] != null) {
                        field496[var133].field425 = -1;
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 204) {
                int var134 = field502.method2507();
                int var135 = field502.method2505();
                int var136 = field502.method2496();
                if (var136 == 65535) {
                    var136 = -1;
                }
                class157 var137 = class157.method3077(var135);
                if (var137.field2573) {
                    var137.field2678 = var136;
                    var137.field2679 = var134;
                    class39 var139 = class39.method1211(var136);
                    var137.field2614 = var139.field970;
                    var137.field2654 = var139.field980;
                    var137.field2616 = var139.field972;
                    var137.field2612 = var139.field962;
                    var137.field2613 = var139.field973;
                    var137.field2653 = var139.field969;
                    if (var137.field2583 > 0) {
                        var137.field2653 = var137.field2653 * 32 / var137.field2583;
                    }
                    Statics.method1598(var137);
                } else if (var136 == -1) {
                    var137.field2597 = 0;
                    field504 = -1;
                    return true;
                } else {
                    class39 var138 = class39.method1211(var136);
                    var137.field2597 = 4;
                    var137.field2683 = var136;
                    var137.field2614 = var138.field970;
                    var137.field2654 = var138.field980;
                    var137.field2653 = var138.field969 * 100 / var134;
                    Statics.method1598(var137);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 25) {
                method119(true);
                field504 = -1;
                return true;
            }
            if (field504 == 226) {
                int var140 = field502.method2500();
                class4 var141 = (class4) field623.method3270((long) var140);
                if (var141 != null) {
                    method89(var141, true);
                }
                if (field626 != null) {
                    Statics.method1598(field626);
                    field626 = null;
                }
                field504 = -1;
                return true;
            }
            if (field504 == 196) {
                int var142 = field502.method2543();
                field622 = var142;
                method546(var142);
                class25.method757(field622);
                for (int var143 = 0; var143 < 100; var143++) {
                    field665[var143] = true;
                }
                field504 = -1;
                return true;
            }
            if (field504 == 116) {
                String var144 = field502.method2462();
                long var145 = (long) field502.method2468();
                long var147 = (long) field502.method2470();
                int var149 = field502.method2466();
                long var150 = (var145 << 32) + var147;
                boolean var152 = false;
                for (int var153 = 0; var153 < 100; var153++) {
                    if (field681[var153] == var150) {
                        var152 = true;
                        break;
                    }
                }
                if (method224(var144)) {
                    var152 = true;
                }
                if (!var152 && field581 == 0) {
                    field681[field503] = var150;
                    field503 = (field503 + 1) % 100;
                    class115 var154 = field502;
                    String var158;
                    try {
                        int var155 = var154.method2479();
                        if (var155 > 32767) {
                            var155 = 32767;
                        }
                        byte[] var156 = new byte[var155];
                        var154.field2027 += Statics.field2829.method2389(var154.field2029, var154.field2027, var156, 0, var155);
                        String var157 = class148.method64(var156, 0, var155);
                        var158 = var157;
                    } catch (Exception var282) {
                        var158 = "Cabbage";
                    }
                    String var161 = class184.method3404(class146.method1409(var158));
                    if (var149 == 2 || var149 == 3) {
                        method2367(7, class2.method1377(1) + var144, var161);
                    } else if (var149 == 1) {
                        method2367(7, class2.method1377(0) + var144, var161);
                    } else {
                        method2367(3, var144, var161);
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 4) {
                int var162 = field502.method2507();
                int var163 = field502.method2496();
                class157 var164 = class157.method3077(var162);
                if (var164 != null && var164.field2687 == 0) {
                    if (var163 > var164.field2609 - var164.field2584) {
                        var163 = var164.field2609 - var164.field2584;
                    }
                    if (var163 < 0) {
                        var163 = 0;
                    }
                    if (var164.field2588 != var163) {
                        var164.field2588 = var163;
                        Statics.method1598(var164);
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 187) {
                field653 = field502.method2543() * 30;
                field655 = field645;
                field504 = -1;
                return true;
            }
            if (field504 == 36) {
                int var165 = field502.method2606();
                class18 var166 = (class18) class18.field266.method3270((long) var165);
                if (var166 != null) {
                    var166.method3320();
                }
                field648[++field649 - 1 & 0x1F] = var165 & 0x7FFF;
                field504 = -1;
                return true;
            }
            if (field504 == 188) {
                String var167 = field502.method2462();
                int var168 = field502.method2507();
                class157 var169 = class157.method3077(var168);
                if (!var167.equals(var169.field2621)) {
                    var169.field2621 = var167;
                    Statics.method1598(var169);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 119) {
                field677 = field645;
                if (field693 == 0) {
                    field462 = null;
                    field643 = null;
                    Statics.field856 = 0;
                    Statics.field107 = null;
                    field504 = -1;
                    return true;
                }
                field643 = field502.method2462();
                long var170 = field502.method2472();
                field462 = class145.method2050(var170);
                Statics.field206 = field502.method2499();
                int var172 = field502.method2466();
                if (var172 == 255) {
                    field504 = -1;
                    return true;
                }
                Statics.field856 = var172;
                class8[] var173 = new class8[100];
                for (int var174 = 0; var174 < Statics.field856; var174++) {
                    var173[var174] = new class8();
                    var173[var174].field127 = field502.method2462();
                    var173[var174].field112 = class147.method831(var173[var174].field127, Statics.field1276);
                    var173[var174].field117 = field502.method2468();
                    var173[var174].field115 = field502.method2499();
                    field502.method2462();
                    if (var173[var174].field127.equals(Statics.field2540.field33)) {
                        Statics.field119 = var173[var174].field115;
                    }
                }
                boolean var175 = false;
                int var176 = Statics.field856;
                while (var176 > 0) {
                    boolean var177 = true;
                    var176--;
                    for (int var178 = 0; var178 < var176; var178++) {
                        if (var173[var178].field112.compareTo(var173[var178 + 1].field112) > 0) {
                            class8 var179 = var173[var178];
                            var173[var178] = var173[var178 + 1];
                            var173[var178 + 1] = var179;
                            var177 = false;
                        }
                    }
                    if (var177) {
                        break;
                    }
                }
                Statics.field107 = var173;
                field504 = -1;
                return true;
            }
            if (field504 == 90) {
                int var180 = field502.method2507();
                class157 var181 = class157.method3077(var180);
                for (int var182 = 0; var182 < var181.field2649.length; var182++) {
                    var181.field2649[var182] = -1;
                    var181.field2649[var182] = 0;
                }
                Statics.method1598(var181);
                field504 = -1;
                return true;
            }
            if (field504 == 236) {
                int var183 = field502.method2543();
                int var184 = field502.method2496();
                int var185 = field502.method2496();
                int var186 = field502.method2506();
                class157 var187 = class157.method3077(var186);
                if (var187.field2614 != var183 || var187.field2654 != var184 || var187.field2653 != var185) {
                    var187.field2614 = var183;
                    var187.field2654 = var184;
                    var187.field2653 = var185;
                    Statics.method1598(var187);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 124) {
                String var188 = field502.method2462();
                class115 var189 = field502;
                String var193;
                try {
                    int var190 = var189.method2479();
                    if (var190 > 32767) {
                        var190 = 32767;
                    }
                    byte[] var191 = new byte[var190];
                    var189.field2027 += Statics.field2829.method2389(var189.field2029, var189.field2027, var191, 0, var190);
                    String var192 = class148.method64(var191, 0, var190);
                    var193 = var192;
                } catch (Exception var281) {
                    var193 = "Cabbage";
                }
                String var196 = class184.method3404(class146.method1409(var193));
                method2367(6, var188, var196);
                field504 = -1;
                return true;
            }
            if (field504 == 88) {
                int var197 = field502.method2505();
                Statics.field1358 = Statics.field960.method1514(var197);
                field504 = -1;
                return true;
            }
            if (field504 == 5) {
                int var198 = field502.method2507();
                int var199 = field502.method2490();
                int var200 = field502.method2496();
                class4 var201 = (class4) field623.method3270((long) var198);
                if (var201 != null) {
                    method89(var201, var201.field55 != var200);
                }
                method47(var198, var200, var199);
                field504 = -1;
                return true;
            }
            if (field504 == 47) {
                field507 = true;
                Statics.field1504 = field502.method2466();
                Statics.field1532 = field502.method2466();
                Statics.field208 = field502.method2468();
                Statics.field737 = field502.method2466();
                Statics.field125 = field502.method2466();
                if (Statics.field125 >= 100) {
                    int var202 = Statics.field1504 * 128 + 64;
                    int var203 = Statics.field1532 * 128 + 64;
                    int var204 = method135(var202, var203, Statics.field188) - Statics.field208;
                    int var205 = var202 - Statics.field1921;
                    int var206 = var204 - Statics.field2437;
                    int var207 = var203 - Statics.field1495;
                    int var208 = (int) Math.sqrt((double) (var205 * var205 + var207 * var207));
                    Statics.field363 = (int) (Math.atan2((double) var206, (double) var208) * 325.949D) & 0x7FF;
                    Statics.field375 = (int) (Math.atan2((double) var205, (double) var207) * -325.949D) & 0x7FF;
                    if (Statics.field363 < 128) {
                        Statics.field363 = 128;
                    }
                    if (Statics.field363 > 383) {
                        Statics.field363 = 383;
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 131) {
                String var209 = field502.method2462();
                int var210 = field502.method2466();
                int var211 = field502.method2489();
                if (var211 >= 1 && var211 <= 8) {
                    if (var209.equalsIgnoreCase("null")) {
                        var209 = null;
                    }
                    field593[var211 - 1] = var209;
                    field638[var211 - 1] = var210 == 0;
                }
                field504 = -1;
                return true;
            }
            if (field504 == 11) {
                field507 = true;
                Statics.field1240 = field502.method2466();
                Statics.field114 = field502.method2466();
                Statics.field1352 = field502.method2468();
                Statics.field207 = field502.method2466();
                Statics.field1971 = field502.method2466();
                if (Statics.field1971 >= 100) {
                    Statics.field1921 = Statics.field1240 * 128 + 64;
                    Statics.field1495 = Statics.field114 * 128 + 64;
                    Statics.field2437 = method135(Statics.field1921, Statics.field1495, Statics.field188) - Statics.field1352;
                }
                field504 = -1;
                return true;
            }
            if (field504 == 246) {
                for (int var212 = 0; var212 < Statics.field1020; var212++) {
                    class41 var213 = class41.method199(var212);
                    if (var213 != null && var213.field1021 == 0) {
                        class158.field2692[var212] = 0;
                        class158.field2693[var212] = 0;
                    }
                }
                method3037();
                field647 += 32;
                field504 = -1;
                return true;
            }
            if (field504 == 112) {
                field476 = field502.method2466();
                if (field476 == 1) {
                    field477 = field502.method2468();
                }
                if (field476 >= 2 && field476 <= 6) {
                    if (field476 == 2) {
                        field529 = 64;
                        field483 = 64;
                    }
                    if (field476 == 3) {
                        field529 = 0;
                        field483 = 64;
                    }
                    if (field476 == 4) {
                        field529 = 128;
                        field483 = 64;
                    }
                    if (field476 == 5) {
                        field529 = 64;
                        field483 = 0;
                    }
                    if (field476 == 6) {
                        field529 = 64;
                        field483 = 128;
                    }
                    field476 = 2;
                    field479 = field502.method2468();
                    field480 = field502.method2468();
                    field481 = field502.method2466();
                }
                if (field476 == 10) {
                    field568 = field502.method2468();
                }
                field504 = -1;
                return true;
            }
            if (field504 == 78) {
                method216();
                field504 = -1;
                return false;
            }
            if (field504 == 82) {
                int var214 = field502.method2500();
                int var215 = field502.method2468();
                if (var214 < -70000) {
                    var215 += 32768;
                }
                class157 var216;
                if (var214 >= 0) {
                    var216 = class157.method3077(var214);
                } else {
                    var216 = null;
                }
                if (var216 != null) {
                    for (int var217 = 0; var217 < var216.field2649.length; var217++) {
                        var216.field2649[var217] = 0;
                        var216.field2630[var217] = 0;
                    }
                }
                class18.method2382(var215);
                int var218 = field502.method2468();
                for (int var219 = 0; var219 < var218; var219++) {
                    int var220 = field502.method2489();
                    if (var220 == 255) {
                        var220 = field502.method2505();
                    }
                    int var221 = field502.method2468();
                    if (var216 != null && var219 < var216.field2649.length) {
                        var216.field2649[var219] = var221;
                        var216.field2630[var219] = var220;
                    }
                    class18.method2393(var215, var219, var221 - 1, var220);
                }
                if (var216 != null) {
                    Statics.method1598(var216);
                }
                method3037();
                field648[++field649 - 1 & 0x1F] = var215 & 0x7FFF;
                field504 = -1;
                return true;
            }
            if (field504 == 43) {
                int var222 = field502.method2466();
                int var223 = field502.method2466();
                int var224 = field502.method2466();
                int var225 = field502.method2466();
                field709[var222] = true;
                field657[var222] = var223;
                field720[var222] = var224;
                field712[var222] = var225;
                field713[var222] = 0;
                field504 = -1;
                return true;
            }
            if (field504 == 182) {
                field694 = 0;
                field504 = -1;
                return true;
            }
            if (field504 == 193) {
                field715 = 1;
                field587 = field645;
                field504 = -1;
                return true;
            }
            if (field504 == 156) {
                while (field502.field2027 < field693) {
                    int var226 = field502.method2466();
                    boolean var227 = (var226 & 0x1) == 1;
                    String var228 = field502.method2462();
                    String var229 = field502.method2462();
                    field502.method2462();
                    for (int var230 = 0; var230 < field718; var230++) {
                        class11 var231 = field609[var230];
                        if (var227) {
                            if (var229.equals(var231.field192)) {
                                var231.field192 = var228;
                                var231.field191 = var229;
                                var228 = null;
                                break;
                            }
                        } else if (var228.equals(var231.field192)) {
                            var231.field192 = var228;
                            var231.field191 = var229;
                            var228 = null;
                            break;
                        }
                    }
                    if (var228 != null && field718 < 100) {
                        class11 var232 = new class11();
                        field609[field718] = var232;
                        var232.field192 = var228;
                        var232.field191 = var229;
                        field718++;
                    }
                }
                field587 = field645;
                field504 = -1;
                return true;
            }
            if (field504 == 113) {
                int var233 = field502.method2507();
                int var234 = field502.method2496();
                class157 var235 = class157.method3077(var233);
                if (var235.field2597 != 1 || var235.field2683 != var234) {
                    var235.field2597 = 1;
                    var235.field2683 = var234;
                    Statics.method1598(var235);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 247) {
                int var236 = field502.method2506();
                int var237 = field502.method2496();
                int var238 = var237 >> 10 & 0x1F;
                int var239 = var237 >> 5 & 0x1F;
                int var240 = var237 & 0x1F;
                int var241 = (var240 << 3) + (var238 << 19) + (var239 << 11);
                class157 var242 = class157.method3077(var236);
                if (var242.field2591 != var241) {
                    var242.field2591 = var241;
                    Statics.method1598(var242);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 65) {
                field456 = field502.method2466();
                field504 = -1;
                return true;
            }
            if (field504 == 69) {
                while (field502.field2027 < field693) {
                    boolean var243 = field502.method2466() == 1;
                    String var244 = field502.method2462();
                    String var245 = field502.method2462();
                    int var246 = field502.method2468();
                    int var247 = field502.method2466();
                    int var248 = field502.method2466();
                    boolean var249 = (var248 & 0x2) != 0;
                    boolean var250 = (var248 & 0x1) != 0;
                    if (var246 > 0) {
                        field502.method2462();
                        field502.method2466();
                        field502.method2500();
                    }
                    field502.method2462();
                    for (int var251 = 0; var251 < field714; var251++) {
                        class22 var252 = field716[var251];
                        if (var243) {
                            if (var245.equals(var252.field346)) {
                                var252.field346 = var244;
                                var252.field349 = var245;
                                var244 = null;
                                break;
                            }
                        } else if (var244.equals(var252.field346)) {
                            if (var252.field342 != var246) {
                                boolean var253 = true;
                                for (class27 var254 = (class27) field586.method3263(); var254 != null; var254 = (class27) field586.method3256()) {
                                    if (var254.field726.equals(var244)) {
                                        if (var246 != 0 && var254.field729 == 0) {
                                            var254.method3319();
                                            var253 = false;
                                        } else if (var246 == 0 && var254.field729 != 0) {
                                            var254.method3319();
                                            var253 = false;
                                        }
                                    }
                                }
                                if (var253) {
                                    field586.method3262(new class27(var244, var246));
                                }
                                var252.field342 = var246;
                            }
                            var252.field349 = var245;
                            var252.field343 = var247;
                            var252.field344 = var249;
                            var252.field340 = var250;
                            var244 = null;
                            break;
                        }
                    }
                    if (var244 != null && field714 < 200) {
                        class22 var255 = new class22();
                        field716[field714] = var255;
                        var255.field346 = var244;
                        var255.field349 = var245;
                        var255.field342 = var246;
                        var255.field343 = var247;
                        var255.field344 = var249;
                        var255.field340 = var250;
                        field714++;
                    }
                }
                field715 = 2;
                field587 = field645;
                boolean var256 = false;
                int var257 = field714;
                while (var257 > 0) {
                    boolean var258 = true;
                    var257--;
                    for (int var259 = 0; var259 < var257; var259++) {
                        boolean var260 = false;
                        class22 var261 = field716[var259];
                        class22 var262 = field716[var259 + 1];
                        if (field557 != var261.field342 && field557 == var262.field342) {
                            var260 = true;
                        }
                        if (!var260 && var261.field342 == 0 && var262.field342 != 0) {
                            var260 = true;
                        }
                        if (!var260 && !var261.field344 && var262.field344) {
                            var260 = true;
                        }
                        if (!var260 && !var261.field340 && var262.field340) {
                            var260 = true;
                        }
                        if (var260) {
                            class22 var263 = field716[var259];
                            field716[var259] = field716[var259 + 1];
                            field716[var259 + 1] = var263;
                            var258 = false;
                        }
                    }
                    if (var258) {
                        break;
                    }
                }
                field504 = -1;
                return true;
            }
            if (field504 == 104) {
                Statics.field2045 = field502.method2490();
                Statics.field1190 = field502.method2619();
                field504 = -1;
                return true;
            }
            if (field504 == 128) {
                String var264 = field502.method2462();
                Object[] var265 = new Object[var264.length() + 1];
                for (int var266 = var264.length() - 1; var266 >= 0; var266--) {
                    if (var264.charAt(var266) == 's') {
                        var265[var266 + 1] = field502.method2462();
                    } else {
                        var265[var266 + 1] = Integer.valueOf(field502.method2500());
                    }
                }
                var265[0] = Integer.valueOf(field502.method2500());
                class1 var267 = new class1();
                var267.field12 = var265;
                Statics.method116(var267);
                field504 = -1;
                return true;
            }
            if (field504 == 79) {
                int var268 = field502.method2500();
                int var269 = field502.method2468();
                int var270 = field502.method2543();
                class157 var271 = class157.method3077(var268);
                var271.field2659 = (var270 << 16) + var269;
                field504 = -1;
                return true;
            }
            if (field504 == 238) {
                method119(false);
                field504 = -1;
                return true;
            }
            if (field504 == 60) {
                int var272 = field502.method2507();
                int var273 = field502.method2534();
                class157 var274 = class157.method3077(var272);
                if (var274.field2610 != var273 || var273 == -1) {
                    var274.field2610 = var273;
                    var274.field2680 = 0;
                    var274.field2681 = 0;
                    Statics.method1598(var274);
                }
                field504 = -1;
                return true;
            }
            if (field504 == 115) {
                int var275 = field502.method2496();
                byte var276 = field502.method2499();
                class158.field2692[var275] = var276;
                if (class158.field2693[var275] != var276) {
                    class158.field2693[var275] = var276;
                    method192(var275);
                }
                field646[++field647 - 1 & 0x1F] = var275;
                field504 = -1;
                return true;
            }
            if (field504 == 197) {
                class181.method118(field502, field693);
                field504 = -1;
                return true;
            }
            class79.method811("" + field504 + class2.field24 + field482 + class2.field24 + field547 + class2.field24 + field693, (Throwable) null);
            method216();
        } catch (IOException var284) {
            Statics.method23();
        } catch (Exception var285) {
            String var279 = "" + field504 + class2.field24 + field482 + class2.field24 + field547 + class2.field24 + field693 + class2.field24 + (Statics.field911 + Statics.field2540.field448[0]) + class2.field24 + (Statics.field1286 + Statics.field2540.field449[0]) + class2.field24;
            for (int var280 = 0; var280 < field693 && var280 < 50; var280++) {
                var279 = var279 + field502.field2029[var280] + class2.field24;
            }
            class79.method811(var279, var285);
            method216();
        }
        return true;
    }

    @ObfuscatedName("ek.by(B)V")
    public static final void method2815() {
        if (field504 == 42) {
            int var0 = field502.method2466();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1190;
            int var2 = (var0 & 0x7) + Statics.field2045;
            int var3 = var1 + field502.method2499();
            int var4 = var2 + field502.method2499();
            int var5 = field502.method2469();
            int var6 = field502.method2468();
            int var7 = field502.method2466() * 4;
            int var8 = field502.method2466() * 4;
            int var9 = field502.method2468();
            int var10 = field502.method2468();
            int var11 = field502.method2466();
            int var12 = field502.method2466();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104 && var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104 && var6 != 65535) {
                int var13 = var1 * 128 + 64;
                int var14 = var2 * 128 + 64;
                int var15 = var3 * 128 + 64;
                int var16 = var4 * 128 + 64;
                class10 var17 = new class10(var6, Statics.field188, var13, var14, method135(var13, var14, Statics.field188) - var7, field510 + var9, field510 + var10, var11, var12, var5, var8);
                var17.method93(var15, var16, method135(var15, var16, Statics.field188) - var8, field510 + var9);
                field598.method3316(var17);
            }
        } else if (field504 == 214) {
            int var18 = field502.method2466();
            int var19 = (var18 >> 4 & 0x7) + Statics.field1190;
            int var20 = (var18 & 0x7) + Statics.field2045;
            int var21 = field502.method2468();
            if (var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104) {
                class176 var22 = field596[Statics.field188][var19][var20];
                if (var22 != null) {
                    for (class16 var23 = (class16) var22.method3294(); var23 != null; var23 = (class16) var22.method3296()) {
                        if ((var21 & 0x7FFF) == var23.field255) {
                            var23.method3320();
                            break;
                        }
                    }
                    if (var22.method3294() == null) {
                        field596[Statics.field188][var19][var20] = null;
                    }
                    method207(var19, var20);
                }
            }
        } else if (field504 == 147) {
            int var24 = field502.method2606();
            int var25 = field502.method2619();
            int var26 = (var25 >> 4 & 0x7) + Statics.field1190;
            int var27 = (var25 & 0x7) + Statics.field2045;
            int var28 = field502.method2466();
            int var29 = var28 >> 2;
            int var30 = var28 & 0x3;
            int var31 = field522[var29];
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                method175(Statics.field188, var26, var27, var31, var24, var29, var30, 0, -1);
            }
        } else if (field504 == 163) {
            int var32 = field502.method2466();
            int var33 = (var32 >> 4 & 0x7) + Statics.field1190;
            int var34 = (var32 & 0x7) + Statics.field2045;
            int var35 = field502.method2468();
            int var36 = field502.method2466();
            int var37 = field502.method2468();
            if (var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104) {
                int var38 = var33 * 128 + 64;
                int var39 = var34 * 128 + 64;
                class19 var40 = new class19(var35, Statics.field188, var38, var39, method135(var38, var39, Statics.field188) - var36, var37, field510);
                field599.method3316(var40);
            }
        } else if (field504 == 179) {
            int var41 = field502.method2489();
            int var42 = (var41 >> 4 & 0x7) + Statics.field1190;
            int var43 = (var41 & 0x7) + Statics.field2045;
            int var44 = field502.method2489();
            int var45 = var44 >> 2;
            int var46 = var44 & 0x3;
            int var47 = field522[var45];
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                method175(Statics.field188, var42, var43, var47, -1, var45, var46, 0, -1);
            }
        } else {
            if (field504 == 252) {
                byte var48 = field502.method2492();
                int var49 = field502.method2468();
                int var50 = field502.method2606();
                int var51 = field502.method2468();
                byte var52 = field502.method2492();
                byte var53 = field502.method2492();
                int var54 = field502.method2606();
                int var55 = field502.method2466();
                int var56 = (var55 >> 4 & 0x7) + Statics.field1190;
                int var57 = (var55 & 0x7) + Statics.field2045;
                int var58 = field502.method2489();
                int var59 = var58 >> 2;
                int var60 = var58 & 0x3;
                int var61 = field522[var59];
                byte var62 = field502.method2492();
                class3 var63;
                if (field588 == var54) {
                    var63 = Statics.field2540;
                } else {
                    var63 = field582[var54];
                }
                if (var63 != null) {
                    class31 var64 = class31.method195(var50);
                    int var65;
                    int var66;
                    if (var60 == 1 || var60 == 3) {
                        var65 = var64.field810;
                        var66 = var64.field809;
                    } else {
                        var65 = var64.field809;
                        var66 = var64.field810;
                    }
                    int var67 = (var65 >> 1) + var56;
                    int var68 = (var65 + 1 >> 1) + var56;
                    int var69 = (var66 >> 1) + var57;
                    int var70 = (var66 + 1 >> 1) + var57;
                    int[][] var71 = class9.field135[Statics.field188];
                    int var72 = var71[var67][var69] + var71[var68][var69] + var71[var67][var70] + var71[var68][var70] >> 2;
                    int var73 = (var56 << 7) + (var65 << 6);
                    int var74 = (var57 << 7) + (var66 << 6);
                    class111 var75 = var64.method664(var59, var60, var71, var73, var72, var74);
                    if (var75 != null) {
                        method175(Statics.field188, var56, var57, var61, -1, 0, 0, var51 + 1, var49 + 1);
                        var63.field36 = field510 + var51;
                        var63.field37 = field510 + var49;
                        var63.field40 = var75;
                        var63.field38 = var56 * 128 + var65 * 64;
                        var63.field29 = var57 * 128 + var66 * 64;
                        var63.field39 = var72;
                        if (var62 > var53) {
                            byte var76 = var62;
                            var62 = var53;
                            var53 = var76;
                        }
                        if (var52 > var48) {
                            byte var77 = var52;
                            var52 = var48;
                            var48 = var77;
                        }
                        var63.field42 = var56 + var62;
                        var63.field44 = var53 + var56;
                        var63.field43 = var52 + var57;
                        var63.field41 = var48 + var57;
                    }
                }
            }
            if (field504 == 117) {
                int var78 = field502.method2490();
                int var79 = (var78 >> 4 & 0x7) + Statics.field1190;
                int var80 = (var78 & 0x7) + Statics.field2045;
                int var81 = field502.method2468();
                int var82 = field502.method2496();
                if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104) {
                    class16 var83 = new class16();
                    var83.field255 = var81;
                    var83.field254 = var82;
                    if (field596[Statics.field188][var79][var80] == null) {
                        field596[Statics.field188][var79][var80] = new class176();
                    }
                    field596[Statics.field188][var79][var80].method3316(var83);
                    method207(var79, var80);
                }
            } else if (field504 == 190) {
                int var84 = field502.method2489();
                int var85 = (var84 >> 4 & 0x7) + Statics.field1190;
                int var86 = (var84 & 0x7) + Statics.field2045;
                int var87 = field502.method2490();
                int var88 = var87 >> 2;
                int var89 = var87 & 0x3;
                int var90 = field522[var88];
                int var91 = field502.method2606();
                if (var85 >= 0 && var86 >= 0 && var85 < 103 && var86 < 103) {
                    if (var90 == 0) {
                        class95 var92 = Statics.field220.method1888(Statics.field188, var85, var86);
                        if (var92 != null) {
                            int var93 = var92.field1605 >> 14 & 0x7FFF;
                            if (var88 == 2) {
                                var92.field1598 = new class13(var93, 2, var89 + 4, Statics.field188, var85, var86, var91, false, var92.field1598);
                                var92.field1608 = new class13(var93, 2, var89 + 1 & 0x3, Statics.field188, var85, var86, var91, false, var92.field1608);
                            } else {
                                var92.field1598 = new class13(var93, var88, var89, Statics.field188, var85, var86, var91, false, var92.field1598);
                            }
                        }
                    }
                    if (var90 == 1) {
                        class107 var94 = Statics.field220.method2036(Statics.field188, var85, var86);
                        if (var94 != null) {
                            int var95 = var94.field1800 >> 14 & 0x7FFF;
                            if (var88 == 4 || var88 == 5) {
                                var94.field1793 = new class13(var95, 4, var89, Statics.field188, var85, var86, var91, false, var94.field1793);
                            } else if (var88 == 6) {
                                var94.field1793 = new class13(var95, 4, var89 + 4, Statics.field188, var85, var86, var91, false, var94.field1793);
                            } else if (var88 == 7) {
                                var94.field1793 = new class13(var95, 4, (var89 + 2 & 0x3) + 4, Statics.field188, var85, var86, var91, false, var94.field1793);
                            } else if (var88 == 8) {
                                var94.field1793 = new class13(var95, 4, var89 + 4, Statics.field188, var85, var86, var91, false, var94.field1793);
                                var94.field1791 = new class13(var95, 4, (var89 + 2 & 0x3) + 4, Statics.field188, var85, var86, var91, false, var94.field1791);
                            }
                        }
                    }
                    if (var90 == 2) {
                        class97 var96 = Statics.field220.method1987(Statics.field188, var85, var86);
                        if (var88 == 11) {
                            var88 = 10;
                        }
                        if (var96 != null) {
                            var96.field1628 = new class13(var96.field1633 >> 14 & 0x7FFF, var88, var89, Statics.field188, var85, var86, var91, false, var96.field1628);
                        }
                    }
                    if (var90 == 3) {
                        class106 var97 = Statics.field220.method1908(Statics.field188, var85, var86);
                        if (var97 != null) {
                            var97.field1785 = new class13(var97.field1782 >> 14 & 0x7FFF, 22, var89, Statics.field188, var85, var86, var91, false, var97.field1785);
                        }
                    }
                }
            } else if (field504 == 142) {
                int var98 = field502.method2496();
                int var99 = field502.method2466();
                int var100 = (var99 >> 4 & 0x7) + Statics.field1190;
                int var101 = (var99 & 0x7) + Statics.field2045;
                int var102 = field502.method2543();
                int var103 = field502.method2543();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && field588 != var98) {
                    class16 var104 = new class16();
                    var104.field255 = var102;
                    var104.field254 = var103;
                    if (field596[Statics.field188][var100][var101] == null) {
                        field596[Statics.field188][var100][var101] = new class176();
                    }
                    field596[Statics.field188][var100][var101].method3316(var104);
                    method207(var100, var101);
                }
            } else if (field504 == 62) {
                int var105 = field502.method2466();
                int var106 = (var105 >> 4 & 0x7) + Statics.field1190;
                int var107 = (var105 & 0x7) + Statics.field2045;
                int var108 = field502.method2468();
                int var109 = field502.method2468();
                int var110 = field502.method2468();
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class176 var111 = field596[Statics.field188][var106][var107];
                    if (var111 != null) {
                        for (class16 var112 = (class16) var111.method3294(); var112 != null; var112 = (class16) var111.method3296()) {
                            if ((var108 & 0x7FFF) == var112.field255 && var112.field254 == var109) {
                                var112.field254 = var110;
                                break;
                            }
                        }
                        method207(var106, var107);
                    }
                }
            } else if (field504 == 34) {
                int var113 = field502.method2466();
                int var114 = (var113 >> 4 & 0x7) + Statics.field1190;
                int var115 = (var113 & 0x7) + Statics.field2045;
                int var116 = field502.method2468();
                int var117 = field502.method2466();
                int var118 = var117 >> 4 & 0xF;
                int var119 = var117 & 0x7;
                int var120 = field502.method2466();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var121 = var118 + 1;
                    if (Statics.field2540.field448[0] >= var114 - var121 && Statics.field2540.field448[0] <= var114 + var121 && Statics.field2540.field449[0] >= var115 - var121 && Statics.field2540.field449[0] <= var115 + var121 && field701 != 0 && var119 > 0 && field702 < 50) {
                        field703[field702] = var116;
                        field595[field702] = var119;
                        field577[field702] = var120;
                        field707[field702] = null;
                        field706[field702] = (var114 << 16) + (var115 << 8) + var118;
                        field702++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.bz(IIIIIIIIII)V")
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field597.method3294(); var10 != null; var10 = (class21) field597.method3296()) {
            if (var10.field327 == arg0 && var10.field329 == arg1 && var10.field330 == arg2 && var10.field336 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field327 = arg0;
            var9.field336 = arg3;
            var9.field329 = arg1;
            var9.field330 = arg2;
            method3179(var9);
            field597.method3316(var9);
        }
        var9.field334 = arg4;
        var9.field335 = arg5;
        var9.field337 = arg6;
        var9.field328 = arg7;
        var9.field338 = arg8;
    }

    @ObfuscatedName("fw.bt(La;I)V")
    public static final void method3179(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field336 == 0) {
            var1 = Statics.field220.method1909(arg0.field327, arg0.field329, arg0.field330);
        }
        if (arg0.field336 == 1) {
            var1 = Statics.field220.method1923(arg0.field327, arg0.field329, arg0.field330);
        }
        if (arg0.field336 == 2) {
            var1 = Statics.field220.method1911(arg0.field327, arg0.field329, arg0.field330);
        }
        if (arg0.field336 == 3) {
            var1 = Statics.field220.method1912(arg0.field327, arg0.field329, arg0.field330);
        }
        if (var1 != 0) {
            int var5 = Statics.field220.method2044(arg0.field327, arg0.field329, arg0.field330, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field331 = var2;
        arg0.field333 = var3;
        arg0.field332 = var4;
    }

    @ObfuscatedName("cl.bc(I)V")
    public static final void method1625() {
        for (class21 var0 = (class21) field597.method3294(); var0 != null; var0 = (class21) field597.method3296()) {
            if (var0.field338 > 0) {
                var0.field338--;
            }
            if (var0.field338 == 0) {
                if (var0.field331 >= 0) {
                    int var1 = var0.field331;
                    int var2 = var0.field333;
                    class31 var3 = class31.method195(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method642(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method48(var0.field327, var0.field336, var0.field329, var0.field330, var0.field331, var0.field332, var0.field333);
                var0.method3320();
            } else {
                if (var0.field328 > 0) {
                    var0.field328--;
                }
                if (var0.field328 == 0 && var0.field329 >= 1 && var0.field330 >= 1 && var0.field329 <= 102 && var0.field330 <= 102) {
                    if (var0.field334 >= 0) {
                        int var5 = var0.field334;
                        int var6 = var0.field335;
                        class31 var7 = class31.method195(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method642(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method48(var0.field327, var0.field336, var0.field329, var0.field330, var0.field334, var0.field337, var0.field335);
                    var0.field328 = -1;
                    if (var0.field334 == var0.field331 && var0.field331 == -1) {
                        var0.method3320();
                    } else if (var0.field334 == var0.field331 && var0.field337 == var0.field332 && var0.field335 == var0.field333) {
                        var0.method3320();
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.bd(IIIIIIII)V")
    public static final void method48(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field617 && Statics.field188 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field220.method1909(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field220.method1923(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field220.method1911(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field220.method1912(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field220.method2044(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field220.method1900(arg0, arg2, arg3);
                class31 var15 = class31.method195(var12);
                if (var15.field811 != 0) {
                    field519[arg0].method3195(arg2, arg3, var13, var14, var15.field812);
                }
            }
            if (arg1 == 1) {
                Statics.field220.method2045(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field220.method1927(arg0, arg2, arg3);
                class31 var16 = class31.method195(var12);
                if (var16.field809 + arg2 > 103 || var16.field809 + arg3 > 103 || var16.field810 + arg2 > 103 || var16.field810 + arg3 > 103) {
                    return;
                }
                if (var16.field811 != 0) {
                    field519[arg0].method3187(arg2, arg3, var16.field809, var16.field810, var14, var16.field812);
                }
            }
            if (arg1 == 3) {
                Statics.field220.method2003(arg0, arg2, arg3);
                class31 var17 = class31.method195(var12);
                if (var17.field811 == 1) {
                    field519[arg0].method3189(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field133[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class94 var19 = Statics.field220;
        class163 var20 = field519[arg0];
        class31 var21 = class31.method195(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field810;
            var23 = var21.field809;
        } else {
            var22 = var21.field809;
            var23 = var21.field810;
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
        int[][] var28 = class9.field135[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field818 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field835 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class93 var34;
            if (var21.field817 == -1 && var21.field794 == null) {
                var34 = var21.method664(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1988(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field811 == 1) {
                var20.method3210(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var57;
            if (var21.field817 == -1 && var21.field794 == null) {
                var57 = var21.method664(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            if (var57 != null) {
                var19.method1894(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field811 != 0) {
                var20.method3182(arg2, arg3, var22, var23, var21.field812);
            }
        } else if (arg6 >= 12) {
            class93 var35;
            if (var21.field817 == -1 && var21.field794 == null) {
                var35 = var21.method664(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1894(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3182(arg2, arg3, var22, var23, var21.field812);
            }
        } else if (arg6 == 0) {
            class93 var36;
            if (var21.field817 == -1 && var21.field794 == null) {
                var36 = var21.method664(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1953(arg0, arg2, arg3, var29, var36, (class93) null, class9.field140[arg5], 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3181(arg2, arg3, arg6, arg5, var21.field812);
            }
        } else if (arg6 == 1) {
            class93 var37;
            if (var21.field817 == -1 && var21.field794 == null) {
                var37 = var21.method664(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1953(arg0, arg2, arg3, var29, var37, (class93) null, class9.field141[arg5], 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3181(arg2, arg3, arg6, arg5, var21.field812);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class93 var39;
            class93 var40;
            if (var21.field817 == -1 && var21.field794 == null) {
                var39 = var21.method664(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method664(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field817, true, (class93) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1953(arg0, arg2, arg3, var29, var39, var40, class9.field140[arg5], class9.field140[var38], var32, var33);
            if (var21.field811 != 0) {
                var20.method3181(arg2, arg3, arg6, arg5, var21.field812);
            }
        } else if (arg6 == 3) {
            class93 var41;
            if (var21.field817 == -1 && var21.field794 == null) {
                var41 = var21.method664(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1953(arg0, arg2, arg3, var29, var41, (class93) null, class9.field141[arg5], 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3181(arg2, arg3, arg6, arg5, var21.field812);
            }
        } else if (arg6 == 9) {
            class93 var42;
            if (var21.field817 == -1 && var21.field794 == null) {
                var42 = var21.method664(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1894(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field811 != 0) {
                var20.method3182(arg2, arg3, var22, var23, var21.field812);
            }
        } else if (arg6 == 4) {
            class93 var43;
            if (var21.field817 == -1 && var21.field794 == null) {
                var43 = var21.method664(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1921(arg0, arg2, arg3, var29, var43, (class93) null, class9.field140[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1909(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class31.method195(var45 >> 14 & 0x7FFF).field806;
            }
            class93 var46;
            if (var21.field817 == -1 && var21.field794 == null) {
                var46 = var21.method664(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1921(arg0, arg2, arg3, var29, var46, (class93) null, class9.field140[arg5], 0, class9.field142[arg5] * var44, class9.field143[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1909(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class31.method195(var48 >> 14 & 0x7FFF).field806 / 2;
            }
            class93 var49;
            if (var21.field817 == -1 && var21.field794 == null) {
                var49 = var21.method664(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1921(arg0, arg2, arg3, var29, var49, (class93) null, 256, arg5, class9.field144[arg5] * var47, class9.field145[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class93 var51;
            if (var21.field817 == -1 && var21.field794 == null) {
                var51 = var21.method664(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1921(arg0, arg2, arg3, var29, var51, (class93) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1909(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class31.method195(var53 >> 14 & 0x7FFF).field806 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class93 var55;
            class93 var56;
            if (var21.field817 == -1 && var21.field794 == null) {
                var55 = var21.method664(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method664(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field817, true, (class93) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field817, true, (class93) null);
            }
            var19.method1921(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field144[arg5] * var52, class9.field145[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("x.bj(IIB)V")
    public static final void method207(int arg0, int arg1) {
        class176 var2 = field596[Statics.field188][arg0][arg1];
        if (var2 == null) {
            Statics.field220.method1904(Statics.field188, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3294(); var5 != null; var5 = (class16) var2.method3296()) {
            class39 var6 = class39.method1211(var5.field255);
            int var7 = var6.field1000;
            if (var6.field975 == 1) {
                var7 = (var5.field254 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field220.method1904(Statics.field188, arg0, arg1);
            return;
        }
        var2.method3291(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3294(); var10 != null; var10 = (class16) var2.method3296()) {
            if (var4.field255 != var10.field255) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field255 != var10.field255 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field220.method1965(Statics.field188, arg0, arg1, method135(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field188), var4, var11, var8, var9);
    }

    @ObfuscatedName("t.bn(I)V")
    public static final void method136() {
        field502.method2332();
        int var0 = field502.method2334(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field502.method2334(2);
        if (var1 == 0) {
            field543[++field585 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field502.method2334(3);
            Statics.field2540.method227(var2, false);
            int var3 = field502.method2334(1);
            if (var3 == 1) {
                field543[++field585 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field502.method2334(3);
            Statics.field2540.method227(var4, true);
            int var5 = field502.method2334(3);
            Statics.field2540.method227(var5, true);
            int var6 = field502.method2334(1);
            if (var6 == 1) {
                field543[++field585 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field502.method2334(7);
            int var8 = field502.method2334(1);
            int var9 = field502.method2334(7);
            int var10 = field502.method2334(1);
            if (var10 == 1) {
                field543[++field585 - 1] = 2047;
            }
            Statics.field188 = field502.method2334(2);
            Statics.field2540.method225(var7, var9, var8 == 1);
        }
    }

    @ObfuscatedName("l.bv(B)V")
    public static final void method107() {
        for (int var0 = 0; var0 < field585; var0++) {
            int var1 = field543[var0];
            class3 var2 = field582[var1];
            int var3 = field502.method2466();
            if ((var3 & 0x8) != 0) {
                var3 += field502.method2466() << 8;
            }
            method1261(var1, var2, var3);
        }
    }

    @ObfuscatedName("bs.bw(ILn;IB)V")
    public static final void method1261(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x40) != 0) {
            arg1.field419 = field502.method2606();
            arg1.field402 = field502.method2468();
        }
        if ((arg2 & 0x200) != 0) {
            arg1.field401 = field502.method2468();
            int var3 = field502.method2506();
            arg1.field434 = var3 >> 16;
            arg1.field421 = (var3 & 0xFFFF) + field510;
            arg1.field431 = 0;
            arg1.field432 = 0;
            if (arg1.field421 > field510) {
                arg1.field431 = -1;
            }
            if (arg1.field401 == 65535) {
                arg1.field401 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field435 = field502.method2490();
            arg1.field442 = field502.method2466();
            arg1.field436 = field502.method2466();
            arg1.field438 = field502.method2489();
            arg1.field439 = field502.method2606() + field510;
            arg1.field440 = field502.method2496() + field510;
            arg1.field441 = field502.method2466();
            arg1.field447 = 1;
            arg1.field407 = 0;
        }
        if ((arg2 & 0x80) != 0) {
            int var4 = field502.method2490();
            byte[] var5 = new byte[var4];
            class126 var6 = new class126(var5);
            field502.method2587(var5, 0, var4);
            field572[arg0] = var6;
            arg1.method12(var6);
        }
        if ((arg2 & 0x10) != 0) {
            int var7 = field502.method2466();
            int var8 = field502.method2489();
            arg1.method234(var7, var8, field510);
            arg1.field416 = field510 + 300;
            arg1.field428 = field502.method2466();
            arg1.field418 = field502.method2619();
        }
        if ((arg2 & 0x20) != 0) {
            arg1.field411 = field502.method2496();
            if (arg1.field411 == 65535) {
                arg1.field411 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            int var9 = field502.method2543();
            int var10 = field502.method2489();
            int var11 = field502.method2489();
            int var12 = field502.field2027;
            if (arg1.field33 != null && arg1.field30 != null) {
                boolean var13 = false;
                if (var10 <= 1 && method224(arg1.field33)) {
                    var13 = true;
                }
                if (!var13 && field581 == 0) {
                    field484.field2027 = 0;
                    field502.method2508(field484.field2029, 0, var11);
                    field484.field2027 = 0;
                    class126 var14 = field484;
                    String var18;
                    try {
                        int var15 = var14.method2479();
                        if (var15 > 32767) {
                            var15 = 32767;
                        }
                        byte[] var16 = new byte[var15];
                        var14.field2027 += Statics.field2829.method2389(var14.field2029, var14.field2027, var16, 0, var15);
                        String var17 = class148.method64(var16, 0, var15);
                        var18 = var17;
                    } catch (Exception var26) {
                        var18 = "Cabbage";
                    }
                    String var21 = class184.method3404(class146.method1409(var18));
                    arg1.field420 = var21.trim();
                    arg1.field417 = var9 >> 8;
                    arg1.field412 = var9 & 0xFF;
                    arg1.field398 = 150;
                    if (var10 == 2 || var10 == 3) {
                        method2367(1, class2.method1377(1) + arg1.field33, var21);
                    } else if (var10 == 1) {
                        method2367(1, class2.method1377(0) + arg1.field33, var21);
                    } else {
                        method2367(2, arg1.field33, var21);
                    }
                }
            }
            field502.field2027 = var11 + var12;
        }
        if ((arg2 & 0x4) != 0) {
            int var22 = field502.method2468();
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = field502.method2619();
            method1(arg1, var22, var23);
        }
        if ((arg2 & 0x400) != 0) {
            int var24 = field502.method2489();
            int var25 = field502.method2466();
            arg1.method234(var24, var25, field510);
            arg1.field416 = field510 + 300;
            arg1.field428 = field502.method2619();
            arg1.field418 = field502.method2489();
        }
        if ((arg2 & 0x1) == 0) {
            return;
        }
        arg1.field420 = field502.method2462();
        if (arg1.field420.charAt(0) == '~') {
            arg1.field420 = arg1.field420.substring(1);
            method2367(2, arg1.field33, arg1.field420);
        } else if (Statics.field2540 == arg1) {
            method2367(2, arg1.field33, arg1.field420);
        }
        arg1.field417 = 0;
        arg1.field412 = 0;
        arg1.field398 = 150;
    }

    @ObfuscatedName("client.bg(B)V")
    public static final void method423() {
        field590 = 0;
        field585 = 0;
        method111();
        method49();
        for (int var0 = 0; var0 < field585; var0++) {
            int var1 = field543[var0];
            class24 var2 = field496[var1];
            int var3 = field502.method2466();
            if ((var3 & 0x4) != 0) {
                var2.field419 = field502.method2468();
                var2.field402 = field502.method2468();
            }
            if ((var3 & 0x1) != 0) {
                var2.field411 = field502.method2496();
                if (var2.field411 == 65535) {
                    var2.field411 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                int var4 = field502.method2489();
                int var5 = field502.method2490();
                var2.method234(var4, var5, field510);
                var2.field416 = field510 + 300;
                var2.field428 = field502.method2489();
                var2.field418 = field502.method2489();
            }
            if ((var3 & 0x80) != 0) {
                int var6 = field502.method2496();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field502.method2466();
                if (var2.field425 == var6 && var6 != -1) {
                    int var8 = class33.method1401(var6).field874;
                    if (var8 == 1) {
                        var2.field426 = 0;
                        var2.field444 = 0;
                        var2.field451 = var7;
                        var2.field446 = 0;
                    }
                    if (var8 == 2) {
                        var2.field446 = 0;
                    }
                } else if (var6 == -1 || var2.field425 == -1 || class33.method1401(var6).field868 >= class33.method1401(var2.field425).field868) {
                    var2.field425 = var6;
                    var2.field426 = 0;
                    var2.field444 = 0;
                    var2.field451 = var7;
                    var2.field446 = 0;
                    var2.field407 = var2.field447;
                }
            }
            if ((var3 & 0x40) != 0) {
                var2.field379 = class30.method3061(field502.method2606());
                var2.field400 = var2.field379.field763;
                var2.field430 = var2.field379.field776;
                var2.field404 = var2.field379.field769;
                var2.field405 = var2.field379.field770;
                var2.field406 = var2.field379.field771;
                var2.field409 = var2.field379.field761;
                var2.field437 = var2.field379.field766;
                var2.field396 = var2.field379.field767;
                var2.field403 = var2.field379.field768;
            }
            if ((var3 & 0x20) != 0) {
                int var9 = field502.method2466();
                int var10 = field502.method2619();
                var2.method234(var9, var10, field510);
                var2.field416 = field510 + 300;
                var2.field428 = field502.method2619();
                var2.field418 = field502.method2489();
            }
            if ((var3 & 0x2) != 0) {
                var2.field401 = field502.method2496();
                int var11 = field502.method2506();
                var2.field434 = var11 >> 16;
                var2.field421 = (var11 & 0xFFFF) + field510;
                var2.field431 = 0;
                var2.field432 = 0;
                if (var2.field421 > field510) {
                    var2.field431 = -1;
                }
                if (var2.field401 == 65535) {
                    var2.field401 = -1;
                }
            }
            if ((var3 & 0x8) != 0) {
                var2.field420 = field502.method2462();
                var2.field398 = 100;
            }
        }
        for (int var12 = 0; var12 < field590; var12++) {
            int var13 = field591[var12];
            if (field510 != field496[var13].field429) {
                field496[var13].field379 = null;
                field496[var13] = null;
            }
        }
        if (field693 != field502.field2027) {
            throw new RuntimeException(field502.field2027 + class2.field24 + field693);
        }
        for (int var14 = 0; var14 < field497; var14++) {
            if (field496[field630[var14]] == null) {
                throw new RuntimeException(var14 + class2.field24 + field497);
            }
        }
    }

    @ObfuscatedName("o.bm(I)V")
    public static final void method111() {
        field502.method2332();
        int var0 = field502.method2334(8);
        if (var0 < field497) {
            for (int var1 = var0; var1 < field497; var1++) {
                field591[++field590 - 1] = field630[var1];
            }
        }
        if (var0 > field497) {
            throw new RuntimeException("");
        }
        field497 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field630[var2];
            class24 var4 = field496[var3];
            int var5 = field502.method2334(1);
            if (var5 == 0) {
                field630[++field497 - 1] = var3;
                var4.field429 = field510;
            } else {
                int var6 = field502.method2334(2);
                if (var6 == 0) {
                    field630[++field497 - 1] = var3;
                    var4.field429 = field510;
                    field543[++field585 - 1] = var3;
                } else if (var6 == 1) {
                    field630[++field497 - 1] = var3;
                    var4.field429 = field510;
                    int var7 = field502.method2334(3);
                    var4.method227(var7, false);
                    int var8 = field502.method2334(1);
                    if (var8 == 1) {
                        field543[++field585 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field630[++field497 - 1] = var3;
                    var4.field429 = field510;
                    int var9 = field502.method2334(3);
                    var4.method227(var9, true);
                    int var10 = field502.method2334(3);
                    var4.method227(var10, true);
                    int var11 = field502.method2334(1);
                    if (var11 == 1) {
                        field543[++field585 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field591[++field590 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("q.bu(B)V")
    public static final void method49() {
        while (true) {
            if (field502.method2341(field693) >= 27) {
                int var0 = field502.method2334(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field496[var0] == null) {
                        field496[var0] = new class24();
                        var1 = true;
                    }
                    class24 var2 = field496[var0];
                    field630[++field497 - 1] = var0;
                    var2.field429 = field510;
                    int var3 = field502.method2334(1);
                    if (var3 == 1) {
                        field543[++field585 - 1] = var0;
                    }
                    int var4 = field502.method2334(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var2.field379 = class30.method3061(field502.method2334(14));
                    int var5 = field604[field502.method2334(3)];
                    if (var1) {
                        var2.field408 = var2.field452 = var5;
                    }
                    int var6 = field502.method2334(1);
                    int var7 = field502.method2334(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field400 = var2.field379.field763;
                    var2.field430 = var2.field379.field776;
                    if (var2.field430 == 0) {
                        var2.field452 = 0;
                    }
                    var2.field404 = var2.field379.field769;
                    var2.field405 = var2.field379.field770;
                    var2.field406 = var2.field379.field771;
                    var2.field409 = var2.field379.field761;
                    var2.field437 = var2.field379.field766;
                    var2.field396 = var2.field379.field767;
                    var2.field403 = var2.field379.field768;
                    var2.method225(Statics.field2540.field448[0] + var7, Statics.field2540.field449[0] + var4, var6 == 1);
                    continue;
                }
            }
            field502.method2339();
            return;
        }
    }

    @ObfuscatedName("o.br(IIIII)V")
    public static final void method112(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field520; var4++) {
            if (field723[var4] + field664[var4] > arg0 && field723[var4] < arg0 + arg2 && field708[var4] + field705[var4] > arg1 && field705[var4] < arg1 + arg3) {
                field665[var4] = true;
            }
        }
    }

    @ObfuscatedName("i.bx(IIIII)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field520; var4++) {
            if (field723[var4] + field664[var4] > arg0 && field723[var4] < arg0 + arg2 && field708[var4] + field705[var4] > arg1 && field705[var4] < arg1 + arg3) {
                field666[var4] = true;
            }
        }
    }

    @ObfuscatedName("x.bq(I)V")
    public static final void method209() {
        if (Statics.field28 != null || field532 != null) {
            return;
        }
        int var0 = class76.field1375;
        if (field683) {
            if (var0 != 1) {
                int var1 = class76.field1376;
                int var2 = class76.field1370;
                if (var1 < Statics.field2022 - 10 || var1 > Statics.field390 + Statics.field2022 + 10 || var2 < Statics.field1609 - 10 || var2 > Statics.field955 + Statics.field1609 + 10) {
                    field683 = false;
                    method112(Statics.field2022, Statics.field1609, Statics.field390, Statics.field955);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field2022;
                int var4 = Statics.field1609;
                int var5 = Statics.field390;
                int var6 = class76.field1382;
                int var7 = class76.field1380;
                int var8 = -1;
                for (int var9 = 0; var9 < field525; var9++) {
                    int var10 = (field525 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method884(var8);
                }
                field683 = false;
                method112(Statics.field2022, Statics.field1609, Statics.field390, Statics.field955);
            }
            return;
        }
        if (var0 == 1 && field525 > 0) {
            int var11 = field608[field525 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                label176: {
                    int var12 = field606[field525 - 1];
                    int var13 = field607[field525 - 1];
                    class157 var14 = class157.method3077(var13);
                    int var15 = Statics.method108(var14);
                    boolean var16 = (var15 >> 28 & 0x1) != 0;
                    if (!var16) {
                        int var17 = Statics.method108(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (!var18) {
                            break label176;
                        }
                    }
                    field631 = false;
                    field580 = 0;
                    if (Statics.field28 != null) {
                        Statics.method1598(Statics.field28);
                    }
                    Statics.field28 = class157.method3077(var13);
                    field575 = var12;
                    field576 = class76.field1382;
                    field637 = class76.field1380;
                    Statics.method1598(Statics.field28);
                    return;
                }
            }
        }
        if (var0 == 1) {
            label178: {
                if (field669 != 1 || field525 <= 2) {
                    int var19 = field525 - 1;
                    boolean var20;
                    if (var19 < 0) {
                        var20 = false;
                    } else {
                        int var21 = field608[var19];
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
        if (var0 == 1 && field525 > 0) {
            method884(field525 - 1);
        }
        if (var0 == 2 && field525 > 0) {
            method220();
        }
    }

    @ObfuscatedName("w.ba(I)V")
    public static final void method220() {
        int var0 = Statics.field78.method3356(class133.field2210);
        for (int var1 = 0; var1 < field525; var1++) {
            class182 var2 = Statics.field78;
            String var3;
            if (field583[var1].length() > 0) {
                var3 = field687[var1] + class133.field2217 + field583[var1];
            } else {
                var3 = field687[var1];
            }
            int var4 = var2.method3356(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field525 * 15 + 21;
        int var6 = class76.field1382 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class76.field1380;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field683 = true;
        Statics.field2022 = var6;
        Statics.field1609 = var7;
        Statics.field390 = var0;
        Statics.field955 = field525 * 15 + 22;
    }

    @ObfuscatedName("av.bb(II)V")
    public static final void method884(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field606[arg0];
        int var2 = field607[arg0];
        int var3 = field608[arg0];
        int var4 = field509[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 18) {
            boolean var5 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var5) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(74);
            field500.method2454(Statics.field1286 + var2);
            field500.method2642(var4);
            field500.method2493(Statics.field911 + var1);
        }
        if (var3 == 38) {
            method889();
            class157 var7 = class157.method3077(var2);
            field616 = 1;
            Statics.field1740 = var1;
            Statics.field366 = var2;
            Statics.field2297 = var4;
            Statics.method1598(var7);
            field564 = class2.method699(16748608) + class39.method1211(var4).field964 + class2.method699(16777215);
            if (field564 == null) {
                field564 = "null";
            }
            return;
        }
        if (var3 == 3) {
            method700(var1, var2, var4);
            field500.method2331(150);
            field500.method2494(var4 >> 14 & 0x7FFF);
            field500.method2493(Statics.field911 + var1);
            field500.method2454(Statics.field1286 + var2);
        }
        if (var3 == 39) {
            field500.method2331(86);
            field500.method2503(var2);
            field500.method2454(var4);
            field500.method2494(var1);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 58) {
            field500.method2331(217);
            field500.method2504(Statics.field1403);
            field500.method2642(field619);
            field500.method2642(var1);
            field500.method2503(var2);
        }
        if (var3 == 5) {
            method700(var1, var2, var4);
            field500.method2331(132);
            field500.method2494(var4 >> 14 & 0x7FFF);
            field500.method2494(Statics.field911 + var1);
            field500.method2642(Statics.field1286 + var2);
        }
        if (var3 == 34) {
            field500.method2331(62);
            field500.method2455(var2);
            field500.method2493(var1);
            field500.method2494(var4);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 35) {
            field500.method2331(232);
            field500.method2493(var1);
            field500.method2504(var2);
            field500.method2493(var4);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 42) {
            field500.method2331(2);
            field500.method2454(var4);
            field500.method2455(var2);
            field500.method2494(var1);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 20) {
            boolean var8 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var8) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(71);
            field500.method2642(Statics.field1286 + var2);
            field500.method2494(var4);
            field500.method2642(Statics.field911 + var1);
        }
        if (var3 == 6) {
            method700(var1, var2, var4);
            field500.method2331(192);
            field500.method2494(var4 >> 14 & 0x7FFF);
            field500.method2494(Statics.field1286 + var2);
            field500.method2493(Statics.field911 + var1);
        }
        if (var3 == 33) {
            field500.method2331(143);
            field500.method2454(var1);
            field500.method2493(var4);
            field500.method2455(var2);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 49) {
            class3 var10 = field582[var4];
            if (var10 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var10.field448[0], var10.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(125);
                field500.method2642(var4);
            }
        }
        if (var3 == 26) {
            field500.method2331(145);
            for (class4 var11 = (class4) field623.method3275(); var11 != null; var11 = (class4) field623.method3274()) {
                if (var11.field51 == 0 || var11.field51 == 3) {
                    method89(var11, true);
                }
            }
            if (field626 != null) {
                Statics.method1598(field626);
                field626 = null;
            }
        }
        if (var3 == 25) {
            class157 var12 = class157.method549(var2, var1);
            if (var12 != null) {
                method889();
                int var13 = class161.method2373(Statics.method108(var12));
                class157 var14 = class157.method549(var2, var1);
                if (var14 != null && var14.field2652 != null) {
                    class1 var15 = new class1();
                    var15.field2 = var14;
                    var15.field12 = var14.field2652;
                    Statics.method116(var15);
                }
                field717 = true;
                Statics.field1403 = var2;
                field619 = var1;
                Statics.field1422 = var13;
                Statics.method1598(var14);
                field616 = 0;
                field620 = method2727(var12);
                if (field620 == null) {
                    field620 = "Null";
                }
                if (var12.field2573) {
                    field654 = var12.field2634 + class2.method699(16777215);
                } else {
                    field654 = class2.method699(65280) + var12.field2617 + class2.method699(16777215);
                }
            }
            return;
        }
        if (var3 == 44) {
            class3 var16 = field582[var4];
            if (var16 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var16.field448[0], var16.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(93);
                field500.method2494(var4);
            }
        }
        if (var3 == 50) {
            class3 var17 = field582[var4];
            if (var17 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var17.field448[0], var17.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(138);
                field500.method2494(var4);
            }
        }
        if (var3 == 9) {
            class24 var18 = field496[var4];
            if (var18 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var18.field448[0], var18.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(139);
                field500.method2494(var4);
            }
        }
        if (var3 == 12) {
            class24 var19 = field496[var4];
            if (var19 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var19.field448[0], var19.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(34);
                field500.method2642(var4);
            }
        }
        if (var3 == 7) {
            class24 var20 = field496[var4];
            if (var20 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var20.field448[0], var20.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(140);
                field500.method2454(Statics.field1740);
                field500.method2454(var4);
                field500.method2504(Statics.field366);
                field500.method2454(Statics.field2297);
            }
        }
        if (var3 == 1002) {
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(31);
            field500.method2494(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1005) {
            class157 var21 = class157.method3077(var2);
            if (var21 == null || var21.field2630[var1] < 100000) {
                field500.method2331(81);
                field500.method2494(var4);
            } else {
                method2367(0, "", var21.field2630[var1] + " x " + class39.method1211(var4).field964);
            }
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 37) {
            field500.method2331(155);
            field500.method2493(var4);
            field500.method2493(var1);
            field500.method2503(var2);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 32) {
            field500.method2331(121);
            field500.method2642(field619);
            field500.method2642(var1);
            field500.method2455(Statics.field1403);
            field500.method2455(var2);
            field500.method2493(var4);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 41) {
            field500.method2331(137);
            field500.method2454(var4);
            field500.method2494(var1);
            field500.method2504(var2);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 24) {
            class157 var22 = class157.method3077(var2);
            boolean var23 = true;
            if (var22.field2578 > 0) {
                var23 = method1607(var22);
            }
            if (var23) {
                field500.method2331(202);
                field500.method2455(var2);
            }
        }
        if (var3 == 8) {
            class24 var24 = field496[var4];
            if (var24 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var24.field448[0], var24.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(27);
                field500.method2454(field619);
                field500.method2454(var4);
                field500.method2503(Statics.field1403);
            }
        }
        if (var3 == 23) {
            Statics.field220.method1920(Statics.field188, var1, var2);
        }
        if (var3 == 13) {
            class24 var25 = field496[var4];
            if (var25 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var25.field448[0], var25.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(240);
                field500.method2454(var4);
            }
        }
        if (var3 == 17) {
            boolean var26 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var26) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(25);
            field500.method2504(Statics.field1403);
            field500.method2454(field619);
            field500.method2454(Statics.field911 + var1);
            field500.method2493(Statics.field1286 + var2);
            field500.method2493(var4);
        }
        if (var3 == 36) {
            field500.method2331(177);
            field500.method2455(var2);
            field500.method2493(var1);
            field500.method2642(var4);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 10) {
            class24 var28 = field496[var4];
            if (var28 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var28.field448[0], var28.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(197);
                field500.method2494(var4);
            }
        }
        if (var3 == 29) {
            field500.method2331(202);
            field500.method2455(var2);
            class157 var29 = class157.method3077(var2);
            if (var29.field2596 != null && var29.field2596[0][0] == 5) {
                int var30 = var29.field2596[0][1];
                if (class158.field2693[var30] != var29.field2576[0]) {
                    class158.field2693[var30] = var29.field2576[0];
                    method192(var30);
                }
            }
        }
        if (var3 == 47) {
            class3 var31 = field582[var4];
            if (var31 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var31.field448[0], var31.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(50);
                field500.method2454(var4);
            }
        }
        if (var3 == 4) {
            method700(var1, var2, var4);
            field500.method2331(56);
            field500.method2642(var4 >> 14 & 0x7FFF);
            field500.method2494(Statics.field911 + var1);
            field500.method2454(Statics.field1286 + var2);
        }
        if (var3 == 1003) {
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            class24 var32 = field496[var4];
            if (var32 != null) {
                class30 var33 = var32.field379;
                if (var33.field787 != null) {
                    var33 = var33.method607();
                }
                if (var33 != null) {
                    field500.method2331(225);
                    field500.method2454(var33.field790);
                }
            }
        }
        if (var3 == 40) {
            field500.method2331(178);
            field500.method2504(var2);
            field500.method2494(var4);
            field500.method2493(var1);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 2 && method700(var1, var2, var4)) {
            field500.method2331(248);
            field500.method2493(field619);
            field500.method2642(var4 >> 14 & 0x7FFF);
            field500.method2503(Statics.field1403);
            field500.method2493(Statics.field911 + var1);
            field500.method2494(Statics.field1286 + var2);
        }
        if (var3 == 43) {
            field500.method2331(134);
            field500.method2503(var2);
            field500.method2493(var4);
            field500.method2642(var1);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 28) {
            field500.method2331(202);
            field500.method2455(var2);
            class157 var34 = class157.method3077(var2);
            if (var34.field2596 != null && var34.field2596[0][0] == 5) {
                int var35 = var34.field2596[0][1];
                class158.field2693[var35] = 1 - class158.field2693[var35];
                method192(var35);
            }
        }
        if (var3 == 31) {
            field500.method2331(224);
            field500.method2503(var2);
            field500.method2642(var1);
            field500.method2494(Statics.field2297);
            field500.method2455(Statics.field366);
            field500.method2642(var4);
            field500.method2454(Statics.field1740);
            field573 = 0;
            Statics.field740 = class157.method3077(var2);
            field574 = var1;
        }
        if (var3 == 1 && method700(var1, var2, var4)) {
            field500.method2331(169);
            field500.method2454(Statics.field1286 + var2);
            field500.method2455(Statics.field366);
            field500.method2494(Statics.field2297);
            field500.method2493(var4 >> 14 & 0x7FFF);
            field500.method2493(Statics.field911 + var1);
            field500.method2642(Statics.field1740);
        }
        if (var3 == 51) {
            class3 var36 = field582[var4];
            if (var36 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var36.field448[0], var36.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(189);
                field500.method2454(var4);
            }
        }
        if (var3 == 1004) {
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(81);
            field500.method2494(var4);
        }
        if (var3 == 45) {
            class3 var37 = field582[var4];
            if (var37 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var37.field448[0], var37.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(53);
                field500.method2494(var4);
            }
        }
        if (var3 == 1001) {
            method700(var1, var2, var4);
            field500.method2331(144);
            field500.method2494(Statics.field1286 + var2);
            field500.method2493(var4 >> 14 & 0x7FFF);
            field500.method2493(Statics.field911 + var1);
        }
        if (var3 == 30 && field626 == null) {
            method2392(var2, var1);
            field626 = class157.method549(var2, var1);
            Statics.method1598(field626);
        }
        if (var3 == 21) {
            boolean var38 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var38) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(236);
            field500.method2494(Statics.field911 + var1);
            field500.method2642(Statics.field1286 + var2);
            field500.method2494(var4);
        }
        if (var3 == 19) {
            boolean var40 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var40) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(19);
            field500.method2493(var4);
            field500.method2642(Statics.field1286 + var2);
            field500.method2494(Statics.field911 + var1);
        }
        if (var3 == 48) {
            class3 var42 = field582[var4];
            if (var42 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var42.field448[0], var42.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(11);
                field500.method2642(var4);
            }
        }
        if (var3 == 11) {
            class24 var43 = field496[var4];
            if (var43 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var43.field448[0], var43.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(103);
                field500.method2454(var4);
            }
        }
        if (var3 == 46) {
            class3 var44 = field582[var4];
            if (var44 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var44.field448[0], var44.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(152);
                field500.method2493(var4);
            }
        }
        if (var3 == 22) {
            boolean var45 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var45) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(162);
            field500.method2493(Statics.field911 + var1);
            field500.method2454(Statics.field1286 + var2);
            field500.method2454(var4);
        }
        if (var3 == 14) {
            class3 var47 = field582[var4];
            if (var47 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var47.field448[0], var47.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(10);
                field500.method2454(var4);
                field500.method2493(Statics.field1740);
                field500.method2642(Statics.field2297);
                field500.method2504(Statics.field366);
            }
        }
        if (var3 == 15) {
            class3 var48 = field582[var4];
            if (var48 != null) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var48.field448[0], var48.field449[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class76.field1382;
                field570 = class76.field1380;
                field656 = 2;
                field571 = 0;
                field500.method2331(104);
                field500.method2454(var4);
                field500.method2454(field619);
                field500.method2503(Statics.field1403);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            String var49 = field583[arg0];
            class157 var50 = class157.method549(var2, var1);
            if (var50 != null) {
                if (var50.field2661 != null) {
                    class1 var51 = new class1();
                    var51.field2 = var50;
                    var51.field5 = var4;
                    var51.field6 = var49;
                    var51.field12 = var50.field2661;
                    Statics.method116(var51);
                }
                boolean var52 = true;
                if (var50.field2578 > 0) {
                    var52 = method1607(var50);
                }
                if (var52) {
                    int var53 = Statics.method108(var50);
                    int var54 = var4 - 1;
                    boolean var55 = (var53 >> var54 + 1 & 0x1) != 0;
                    if (var55) {
                        if (var4 == 1) {
                            field500.method2331(173);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 2) {
                            field500.method2331(151);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 3) {
                            field500.method2331(100);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 4) {
                            field500.method2331(59);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 5) {
                            field500.method2331(114);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 6) {
                            field500.method2331(101);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 7) {
                            field500.method2331(251);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 8) {
                            field500.method2331(109);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 9) {
                            field500.method2331(119);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                        if (var4 == 10) {
                            field500.method2331(220);
                            field500.method2455(var2);
                            field500.method2642(var1);
                        }
                    }
                }
            }
        }
        if (var3 == 16) {
            boolean var56 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var56) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class76.field1382;
            field570 = class76.field1380;
            field656 = 2;
            field571 = 0;
            field500.method2331(200);
            field500.method2493(Statics.field2297);
            field500.method2642(var4);
            field500.method2454(Statics.field1740);
            field500.method2642(Statics.field1286 + var2);
            field500.method2642(Statics.field911 + var1);
            field500.method2455(Statics.field366);
        }
        if (field616 != 0) {
            field616 = 0;
            Statics.method1598(class157.method3077(Statics.field366));
        }
        if (field717) {
            method889();
        }
        if (Statics.field740 != null && field573 == 0) {
            Statics.method1598(Statics.field740);
        }
    }

    @ObfuscatedName("f.bl(ILjava/lang/String;I)V")
    public static void method10(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field618; var3++) {
            class3 var4 = field582[field584[var3]];
            if (var4 != null && var4.field33 != null && var4.field33.equalsIgnoreCase(arg1)) {
                method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var4.field448[0], var4.field449[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field500.method2331(93);
                    field500.method2494(field584[var3]);
                } else if (arg0 == 4) {
                    field500.method2331(50);
                    field500.method2454(field584[var3]);
                } else if (arg0 == 6) {
                    field500.method2331(125);
                    field500.method2642(field584[var3]);
                } else if (arg0 == 7) {
                    field500.method2331(138);
                    field500.method2494(field584[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method2367(0, "", class133.field2163 + arg1);
        }
    }

    @ObfuscatedName("av.cn(I)V")
    public static void method889() {
        if (!field717) {
            return;
        }
        class157 var0 = class157.method549(Statics.field1403, field619);
        if (var0 != null && var0.field2586 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field12 = var0.field2586;
            Statics.method116(var1);
        }
        field717 = false;
        Statics.method1598(var0);
    }

    @ObfuscatedName("dt.ch(III)V")
    public static void method2392(int arg0, int arg1) {
        field500.method2331(76);
        field500.method2494(arg1);
        field500.method2455(arg0);
    }

    @ObfuscatedName("c.cl(B)V")
    public static final void method26() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field525 - 1; var1++) {
                if (field608[var1] < 1000 && field608[var1 + 1] > 1000) {
                    String var2 = field583[var1];
                    field583[var1] = field583[var1 + 1];
                    field583[var1 + 1] = var2;
                    String var3 = field687[var1];
                    field687[var1] = field687[var1 + 1];
                    field687[var1 + 1] = var3;
                    int var4 = field608[var1];
                    field608[var1] = field608[var1 + 1];
                    field608[var1 + 1] = var4;
                    int var5 = field606[var1];
                    field606[var1] = field606[var1 + 1];
                    field606[var1 + 1] = var5;
                    int var6 = field607[var1];
                    field607[var1] = field607[var1 + 1];
                    field607[var1 + 1] = var6;
                    int var7 = field509[var1];
                    field509[var1] = field509[var1 + 1];
                    field509[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("bn.cr(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method1402(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field683 || field525 >= 500) {
            return;
        }
        field687[field525] = arg0;
        field583[field525] = arg1;
        field608[field525] = arg2;
        field509[field525] = arg3;
        field606[field525] = arg4;
        field607[field525] = arg5;
        field525++;
    }

    @ObfuscatedName("v.cj(IIIIB)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3) {
        if (field616 == 0 && !field717) {
            method1402(class133.field2212, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class111.field1870; var5++) {
            int var6 = class111.field1855[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field220.method2044(Statics.field188, var7, var8, var6) >= 0) {
                    class31 var11 = class31.method195(var10);
                    if (var11.field794 != null) {
                        var11 = var11.method648();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field616 == 1) {
                        method1402(class133.field2207, field564 + " " + class2.field20 + " " + class2.method699(65535) + var11.field804, 1, var6, var7, var8);
                    } else if (!field717) {
                        String[] var12 = var11.field821;
                        if (field633) {
                            var12 = method1437(var12);
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
                                    method1402(var12[var13], class2.method699(65535) + var11.field804, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1402(class133.field2122, class2.method699(65535) + var11.field804, 1002, var11.field826 << 14, var7, var8);
                    } else if ((Statics.field1422 & 0x4) == 4) {
                        method1402(field620, field654 + " " + class2.field20 + " " + class2.method699(65535) + var11.field804, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class24 var15 = field496[var10];
                    if (var15.field379.field763 == 1 && (var15.field410 & 0x7F) == 64 && (var15.field397 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field497; var16++) {
                            class24 var17 = field496[field630[var16]];
                            if (var17 != null && var15 != var17 && var17.field379.field763 == 1 && var15.field410 == var17.field410 && var15.field397 == var17.field397) {
                                method2228(var17.field379, field630[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field618; var18++) {
                            class3 var19 = field582[field584[var18]];
                            if (var19 != null && var15.field410 == var19.field410 && var15.field397 == var19.field397) {
                                method131(var19, field584[var18], var7, var8);
                            }
                        }
                    }
                    method2228(var15.field379, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field582[var10];
                    if ((var20.field410 & 0x7F) == 64 && (var20.field397 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field497; var21++) {
                            class24 var22 = field496[field630[var21]];
                            if (var22 != null && var22.field379.field763 == 1 && var20.field410 == var22.field410 && var20.field397 == var22.field397) {
                                method2228(var22.field379, field630[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field618; var23++) {
                            class3 var24 = field582[field584[var23]];
                            if (var24 != null && var20 != var24 && var20.field410 == var24.field410 && var20.field397 == var24.field397) {
                                method131(var24, field584[var23], var7, var8);
                            }
                        }
                    }
                    method131(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class176 var25 = field596[Statics.field188][var7][var8];
                    if (var25 != null) {
                        for (class16 var26 = (class16) var25.method3295(); var26 != null; var26 = (class16) var25.method3287()) {
                            class39 var27 = class39.method1211(var26.field255);
                            if (field616 == 1) {
                                method1402(class133.field2207, field564 + " " + class2.field20 + " " + class2.method699(16748608) + var27.field964, 16, var26.field255, var7, var8);
                            } else if (!field717) {
                                String[] var28 = var27.field978;
                                if (field633) {
                                    var28 = method1437(var28);
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
                                        method1402(var28[var29], class2.method699(16748608) + var27.field964, var30, var26.field255, var7, var8);
                                    } else if (var29 == 2) {
                                        method1402(class133.field2091, class2.method699(16748608) + var27.field964, 20, var26.field255, var7, var8);
                                    }
                                }
                                method1402(class133.field2122, class2.method699(16748608) + var27.field964, 1004, var26.field255, var7, var8);
                            } else if ((Statics.field1422 & 0x1) == 1) {
                                method1402(field620, field654 + " " + class2.field20 + " " + class2.method699(16748608) + var27.field964, 17, var26.field255, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("dy.cz(Lah;IIIB)V")
    public static final void method2228(class30 arg0, int arg1, int arg2, int arg3) {
        if (field525 >= 400) {
            return;
        }
        if (arg0.field787 != null) {
            arg0 = arg0.method607();
        }
        if (arg0 == null || !arg0.field759) {
            return;
        }
        String var4 = arg0.field765;
        if (arg0.field779 != 0) {
            int var6 = arg0.field779;
            int var7 = Statics.field2540.field34;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method699(16711680);
            } else if (var8 < -6) {
                var9 = class2.method699(16723968);
            } else if (var8 < -3) {
                var9 = class2.method699(16740352);
            } else if (var8 < 0) {
                var9 = class2.method699(16756736);
            } else if (var8 > 9) {
                var9 = class2.method699(65280);
            } else if (var8 > 6) {
                var9 = class2.method699(4259584);
            } else if (var8 > 3) {
                var9 = class2.method699(8453888);
            } else if (var8 > 0) {
                var9 = class2.method699(12648192);
            } else {
                var9 = class2.method699(16776960);
            }
            var4 = var4 + var9 + " " + class2.field25 + class133.field2213 + arg0.field779 + class2.field19;
        }
        if (field616 == 1) {
            method1402(class133.field2207, field564 + " " + class2.field20 + " " + class2.method699(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field717) {
            String[] var10 = arg0.field777;
            if (field633) {
                var10 = method1437(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class133.field2209)) {
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
                        method1402(var10[var11], class2.method699(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class133.field2209)) {
                        short var14 = 0;
                        if (arg0.field779 > Statics.field2540.field34) {
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
                        method1402(var10[var13], class2.method699(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method1402(class133.field2122, class2.method699(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1422 & 0x2) == 2) {
            method1402(field620, field654 + " " + class2.field20 + " " + class2.method699(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("m.cc(Ln;IIII)V")
    public static final void method131(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2540 == arg0 || field525 >= 400) {
            return;
        }
        String var4;
        if (arg0.field45 == 0) {
            var4 = arg0.field33 + method2049(arg0.field34, Statics.field2540.field34) + " " + class2.field25 + class133.field2213 + arg0.field34 + class2.field19;
        } else {
            var4 = arg0.field33 + " " + class2.field25 + class133.field2080 + arg0.field45 + class2.field19;
        }
        if (field616 == 1) {
            method1402(class133.field2207, field564 + " " + class2.field20 + " " + class2.method699(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field717) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field593[var5] != null) {
                    short var6 = 0;
                    if (field593[var5].equalsIgnoreCase(class133.field2209)) {
                        if (arg0.field34 > Statics.field2540.field34) {
                            var6 = 2000;
                        }
                        if (Statics.field2540.field31 != 0 && arg0.field31 != 0) {
                            if (Statics.field2540.field31 == arg0.field31) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field638[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field561[var5] + var6;
                    method1402(field593[var5], class2.method699(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1422 & 0x8) == 8) {
            method1402(field620, field654 + " " + class2.field20 + " " + class2.method699(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field525; var9++) {
            if (field608[var9] == 23) {
                field583[var9] = class2.method699(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("cs.ct(III)Ljava/lang/String;")
    public static final String method2049(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method699(16711680);
        } else if (var2 < -6) {
            return class2.method699(16723968);
        } else if (var2 < -3) {
            return class2.method699(16740352);
        } else if (var2 < 0) {
            return class2.method699(16756736);
        } else if (var2 > 9) {
            return class2.method699(65280);
        } else if (var2 > 6) {
            return class2.method699(4259584);
        } else if (var2 > 3) {
            return class2.method699(8453888);
        } else if (var2 > 0) {
            return class2.method699(12648192);
        } else {
            return class2.method699(16776960);
        }
    }

    @ObfuscatedName("r.ce(IIIIIIIIB)V")
    public static final void method36(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class157.method2697(arg0)) {
            Statics.field1264 = null;
            method531(Statics.field2638[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1264 != null) {
                method531(Statics.field1264, -1412584499, arg1, arg2, arg3, arg4, Statics.field358, Statics.field187, arg7);
                Statics.field1264 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field665[var8] = true;
            }
        } else {
            field665[arg7] = true;
        }
    }

    @ObfuscatedName("client.cu([Lfk;IIIIIIIII)V")
    public static final void method531(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1858(arg2, arg3, arg4, arg5);
        class103.method2143();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class157 var10 = arg0[var9];
            if (var10 != null && (var10.field2585 == arg1 || arg1 == -1412584499 && field532 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field723[field520] = var10.field2676 + arg6;
                    field705[field520] = var10.field2580 + arg7;
                    field664[field520] = var10.field2583;
                    field708[field520] = var10.field2584;
                    var11 = ++field520 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2619 = var11;
                var10.field2674 = field510;
                if (!var10.field2573 || !method3078(var10)) {
                    if (var10.field2578 > 0) {
                        Statics.method27(var10);
                    }
                    int var12 = var10.field2676 + arg6;
                    int var13 = var10.field2580 + arg7;
                    int var14 = var10.field2566;
                    if (field532 == var10) {
                        if (arg1 != -1412584499 && !var10.field2671) {
                            Statics.field1264 = arg0;
                            Statics.field358 = arg6;
                            Statics.field187 = arg7;
                            continue;
                        }
                        if (field644 && field600) {
                            int var15 = class76.field1376;
                            int var16 = class76.field1370;
                            int var17 = var15 - field635;
                            int var18 = var16 - field636;
                            if (var17 < field639) {
                                var17 = field639;
                            }
                            if (var10.field2583 + var17 > field639 + field634.field2583) {
                                var17 = field639 + field634.field2583 - var10.field2583;
                            }
                            if (var18 < field640) {
                                var18 = field640;
                            }
                            if (var10.field2584 + var18 > field640 + field634.field2584) {
                                var18 = field640 + field634.field2584 - var10.field2584;
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
                    if (var10.field2687 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2687 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2583 + var12;
                        int var26 = var10.field2584 + var13;
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
                        int var29 = var10.field2583 + var12;
                        int var30 = var10.field2584 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2573 || var19 < var21 && var20 < var22) {
                        if (var10.field2578 != 0) {
                            if (var10.field2578 == 1337) {
                                field605 = var12;
                                field613 = var13;
                                method96(var12, var13, var10.field2583, var10.field2584);
                                class88.method1858(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2578 == 1338) {
                                method200(var12, var13, var11);
                                class88.method1858(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var31 = class76.field1376;
                        int var32 = class76.field1370;
                        if (!field683 && var31 >= var19 && var32 >= var20 && var31 < var21 && var32 < var22) {
                            int var33 = var31 - var12;
                            int var34 = var32 - var13;
                            if (var10.field2611 == 1) {
                                method1402(var10.field2675, "", 24, 0, 0, var10.field2574);
                            }
                            if (var10.field2611 == 2 && !field717) {
                                String var35 = method2727(var10);
                                if (var35 != null) {
                                    method1402(var35, class2.method699(65280) + var10.field2617, 25, 0, -1, var10.field2574);
                                }
                            }
                            if (var10.field2611 == 3) {
                                method1402(class133.field2070, "", 26, 0, 0, var10.field2574);
                            }
                            if (var10.field2611 == 4) {
                                method1402(var10.field2675, "", 28, 0, 0, var10.field2574);
                            }
                            if (var10.field2611 == 5) {
                                method1402(var10.field2675, "", 29, 0, 0, var10.field2574);
                            }
                            if (var10.field2611 == 6 && field626 == null) {
                                method1402(var10.field2675, "", 30, 0, -1, var10.field2574);
                            }
                            if (var10.field2687 == 2) {
                                int var36 = 0;
                                for (int var37 = 0; var37 < var10.field2584; var37++) {
                                    for (int var38 = 0; var38 < var10.field2583; var38++) {
                                        int var39 = (var10.field2665 + 32) * var38;
                                        int var40 = (var10.field2615 + 32) * var37;
                                        if (var36 < 20) {
                                            var39 += var10.field2629[var36];
                                            var40 += var10.field2685[var36];
                                        }
                                        if (var33 >= var39 && var34 >= var40 && var33 < var39 + 32 && var34 < var40 + 32) {
                                            field578 = var36;
                                            Statics.field283 = var10;
                                            if (var10.field2649[var36] > 0) {
                                                label1082: {
                                                    class39 var41 = class39.method1211(var10.field2649[var36] - 1);
                                                    if (field616 == 1) {
                                                        int var42 = Statics.method108(var10);
                                                        boolean var43 = (var42 >> 30 & 0x1) != 0;
                                                        if (var43) {
                                                            if (Statics.field366 != var10.field2574 || Statics.field1740 != var36) {
                                                                method1402(class133.field2207, field564 + " " + class2.field20 + " " + class2.method699(16748608) + var41.field964, 31, var41.field979, var36, var10.field2574);
                                                            }
                                                            break label1082;
                                                        }
                                                    }
                                                    if (field717) {
                                                        int var44 = Statics.method108(var10);
                                                        boolean var45 = (var44 >> 30 & 0x1) != 0;
                                                        if (var45) {
                                                            if ((Statics.field1422 & 0x10) == 16) {
                                                                method1402(field620, field654 + " " + class2.field20 + " " + class2.method699(16748608) + var41.field964, 32, var41.field979, var36, var10.field2574);
                                                            }
                                                            break label1082;
                                                        }
                                                    }
                                                    String[] var46 = var41.field1001;
                                                    if (field633) {
                                                        var46 = method1437(var46);
                                                    }
                                                    int var47 = Statics.method108(var10);
                                                    boolean var48 = (var47 >> 30 & 0x1) != 0;
                                                    if (var48) {
                                                        for (int var49 = 4; var49 >= 3; var49--) {
                                                            if (var46 != null && var46[var49] != null) {
                                                                byte var50;
                                                                if (var49 == 3) {
                                                                    var50 = 36;
                                                                } else {
                                                                    var50 = 37;
                                                                }
                                                                method1402(var46[var49], class2.method699(16748608) + var41.field964, var50, var41.field979, var36, var10.field2574);
                                                            } else if (var49 == 4) {
                                                                method1402(class133.field2068, class2.method699(16748608) + var41.field964, 37, var41.field979, var36, var10.field2574);
                                                            }
                                                        }
                                                    }
                                                    int var51 = Statics.method108(var10);
                                                    boolean var52 = (var51 >> 31 & 0x1) != 0;
                                                    if (var52) {
                                                        method1402(class133.field2207, class2.method699(16748608) + var41.field964, 38, var41.field979, var36, var10.field2574);
                                                    }
                                                    int var53 = Statics.method108(var10);
                                                    boolean var54 = (var53 >> 30 & 0x1) != 0;
                                                    if (var54 && var46 != null) {
                                                        for (int var55 = 2; var55 >= 0; var55--) {
                                                            if (var46[var55] != null) {
                                                                byte var56 = 0;
                                                                if (var55 == 0) {
                                                                    var56 = 33;
                                                                }
                                                                if (var55 == 1) {
                                                                    var56 = 34;
                                                                }
                                                                if (var55 == 2) {
                                                                    var56 = 35;
                                                                }
                                                                method1402(var46[var55], class2.method699(16748608) + var41.field964, var56, var41.field979, var36, var10.field2574);
                                                            }
                                                        }
                                                    }
                                                    String[] var57 = var10.field2632;
                                                    if (field633) {
                                                        var57 = method1437(var57);
                                                    }
                                                    if (var57 != null) {
                                                        for (int var58 = 4; var58 >= 0; var58--) {
                                                            if (var57[var58] != null) {
                                                                byte var59 = 0;
                                                                if (var58 == 0) {
                                                                    var59 = 39;
                                                                }
                                                                if (var58 == 1) {
                                                                    var59 = 40;
                                                                }
                                                                if (var58 == 2) {
                                                                    var59 = 41;
                                                                }
                                                                if (var58 == 3) {
                                                                    var59 = 42;
                                                                }
                                                                if (var58 == 4) {
                                                                    var59 = 43;
                                                                }
                                                                method1402(var57[var58], class2.method699(16748608) + var41.field964, var59, var41.field979, var36, var10.field2574);
                                                            }
                                                        }
                                                    }
                                                    method1402(class133.field2122, class2.method699(16748608) + var41.field964, 1005, var41.field979, var36, var10.field2574);
                                                }
                                            }
                                        }
                                        var36++;
                                    }
                                }
                            }
                            if (var10.field2573) {
                                if (field717) {
                                    int var60 = Statics.method108(var10);
                                    boolean var61 = (var60 >> 21 & 0x1) != 0;
                                    if (var61 && (Statics.field1422 & 0x20) == 32) {
                                        method1402(field620, field654 + " " + class2.field20 + " " + var10.field2634, 58, 0, var10.field2575, var10.field2574);
                                    }
                                } else {
                                    for (int var62 = 9; var62 >= 5; var62--) {
                                        int var63 = Statics.method108(var10);
                                        boolean var64 = (var63 >> var62 + 1 & 0x1) != 0;
                                        String var65;
                                        if (!var64 && var10.field2661 == null) {
                                            var65 = null;
                                        } else if (var10.field2635 == null || var10.field2635.length <= var62 || var10.field2635[var62] == null || var10.field2635[var62].trim().length() == 0) {
                                            var65 = null;
                                        } else {
                                            var65 = var10.field2635[var62];
                                        }
                                        if (var65 != null) {
                                            method1402(var65, var10.field2634, 1007, var62 + 1, var10.field2575, var10.field2574);
                                        }
                                    }
                                    String var67 = method2727(var10);
                                    if (var67 != null) {
                                        method1402(var67, var10.field2634, 25, 0, var10.field2575, var10.field2574);
                                    }
                                    for (int var68 = 4; var68 >= 0; var68--) {
                                        int var69 = Statics.method108(var10);
                                        boolean var70 = (var69 >> var68 + 1 & 0x1) != 0;
                                        String var71;
                                        if (!var70 && var10.field2661 == null) {
                                            var71 = null;
                                        } else if (var10.field2635 == null || var10.field2635.length <= var68 || var10.field2635[var68] == null || var10.field2635[var68].trim().length() == 0) {
                                            var71 = null;
                                        } else {
                                            var71 = var10.field2635[var68];
                                        }
                                        if (var71 != null) {
                                            method1402(var71, var10.field2634, 57, var68 + 1, var10.field2575, var10.field2574);
                                        }
                                    }
                                    if (class161.method211(Statics.method108(var10))) {
                                        method1402(class133.field2072, "", 30, 0, var10.field2575, var10.field2574);
                                    }
                                }
                            }
                        }
                        if (var10.field2687 == 0) {
                            if (!var10.field2573 && method3078(var10) && Statics.field1746 != var10) {
                                continue;
                            }
                            if (!var10.field2573) {
                                if (var10.field2588 > var10.field2609 - var10.field2584) {
                                    var10.field2588 = var10.field2609 - var10.field2584;
                                }
                                if (var10.field2588 < 0) {
                                    var10.field2588 = 0;
                                }
                            }
                            method531(arg0, var10.field2574, var19, var20, var21, var22, var12 - var10.field2587, var13 - var10.field2588, var11);
                            if (var10.field2682 != null) {
                                method531(var10.field2682, var10.field2574, var19, var20, var21, var22, var12 - var10.field2587, var13 - var10.field2588, var11);
                            }
                            class4 var73 = (class4) field623.method3270((long) var10.field2574);
                            if (var73 != null) {
                                if (var73.field51 == 0 && class76.field1376 >= var19 && class76.field1370 >= var20 && class76.field1376 < var21 && class76.field1370 < var22 && !field683 && !field659) {
                                    field687[0] = class133.field2280;
                                    field583[0] = "";
                                    field608[0] = 1006;
                                    field525 = 1;
                                }
                                method36(var73.field55, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class88.method1858(arg2, arg3, arg4, arg5);
                            class103.method2143();
                        }
                        if (field552[var11] || field469 > 1) {
                            if (var10.field2687 == 0 && !var10.field2573 && var10.field2609 > var10.field2584) {
                                int var74 = var10.field2583 + var12;
                                int var75 = var10.field2588;
                                int var76 = var10.field2584;
                                int var77 = var10.field2609;
                                Statics.field11[0].method1794(var74, var13);
                                Statics.field11[1].method1794(var74, var13 + var76 - 16);
                                class88.method1816(var74, var13 + 16, 16, var76 - 32, field542);
                                int var78 = (var76 - 32) * var76 / var77;
                                if (var78 < 8) {
                                    var78 = 8;
                                }
                                int var79 = (var76 - 32 - var78) * var75 / (var77 - var76);
                                class88.method1816(var74, var13 + 16 + var79, 16, var78, field689);
                                class88.method1836(var74, var13 + 16 + var79, var78, field545);
                                class88.method1836(var74 + 1, var13 + 16 + var79, var78, field545);
                                class88.method1820(var74, var13 + 16 + var79, 16, field545);
                                class88.method1820(var74, var13 + 17 + var79, 16, field545);
                                class88.method1836(var74 + 15, var13 + 16 + var79, var78, field544);
                                class88.method1836(var74 + 14, var13 + 17 + var79, var78 - 1, field544);
                                class88.method1820(var74, var13 + 15 + var79 + var78, 16, field544);
                                class88.method1820(var74 + 1, var13 + 14 + var79 + var78, 15, field544);
                            }
                            if (var10.field2687 != 1) {
                                if (var10.field2687 == 2) {
                                    int var80 = 0;
                                    for (int var81 = 0; var81 < var10.field2584; var81++) {
                                        for (int var82 = 0; var82 < var10.field2583; var82++) {
                                            int var83 = (var10.field2665 + 32) * var82 + var12;
                                            int var84 = (var10.field2615 + 32) * var81 + var13;
                                            if (var80 < 20) {
                                                var83 += var10.field2629[var80];
                                                var84 += var10.field2685[var80];
                                            }
                                            if (var10.field2649[var80] > 0) {
                                                boolean var85 = false;
                                                boolean var86 = false;
                                                int var87 = var10.field2649[var80] - 1;
                                                if (var83 + 32 > arg2 && var83 < arg4 && var84 + 32 > arg3 && var84 < arg5 || Statics.field28 == var10 && field575 == var80) {
                                                    class85 var88;
                                                    if (field616 == 1 && Statics.field1740 == var80 && Statics.field366 == var10.field2574) {
                                                        var88 = class39.method20(var87, var10.field2630[var80], 2, 0, false);
                                                    } else {
                                                        var88 = class39.method20(var87, var10.field2630[var80], 1, 3153952, false);
                                                    }
                                                    if (var88 == null) {
                                                        Statics.method1598(var10);
                                                    } else if (Statics.field28 == var10 && field575 == var80) {
                                                        int var89 = class76.field1376 - field576;
                                                        int var90 = class76.field1370 - field637;
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (var90 < 5 && var90 > -5) {
                                                            var90 = 0;
                                                        }
                                                        if (field580 < 5) {
                                                            var89 = 0;
                                                            var90 = 0;
                                                        }
                                                        var88.method1721(var83 + var89, var84 + var90, 128);
                                                        if (arg1 != -1) {
                                                            class157 var91 = arg0[arg1 & 0xFFFF];
                                                            if (var84 + var90 < class88.field1467 && var91.field2588 > 0) {
                                                                int var92 = field540 * (class88.field1467 - var84 - var90) / 3;
                                                                if (var92 > field540 * 10) {
                                                                    var92 = field540 * 10;
                                                                }
                                                                if (var92 > var91.field2588) {
                                                                    var92 = var91.field2588;
                                                                }
                                                                var91.field2588 -= var92;
                                                                field637 += var92;
                                                                Statics.method1598(var91);
                                                            }
                                                            if (var84 + var90 + 32 > class88.field1466 && var91.field2588 < var91.field2609 - var91.field2584) {
                                                                int var93 = field540 * (var84 + var90 + 32 - class88.field1466) / 3;
                                                                if (var93 > field540 * 10) {
                                                                    var93 = field540 * 10;
                                                                }
                                                                if (var93 > var91.field2609 - var91.field2584 - var91.field2588) {
                                                                    var93 = var91.field2609 - var91.field2584 - var91.field2588;
                                                                }
                                                                var91.field2588 += var93;
                                                                field637 -= var93;
                                                                Statics.method1598(var91);
                                                            }
                                                        }
                                                    } else if (Statics.field740 == var10 && field574 == var80) {
                                                        var88.method1721(var83, var84, 128);
                                                    } else {
                                                        var88.method1715(var83, var84);
                                                    }
                                                }
                                            } else if (var10.field2631 != null && var80 < 20) {
                                                class85 var94 = var10.method3097(var80);
                                                if (var94 != null) {
                                                    var94.method1715(var83, var84);
                                                } else if (class157.field2667) {
                                                    Statics.method1598(var10);
                                                }
                                            }
                                            var80++;
                                        }
                                    }
                                } else if (var10.field2687 == 3) {
                                    int var95;
                                    if (method240(var10)) {
                                        var95 = var10.field2592;
                                        if (Statics.field1746 == var10 && var10.field2594 != 0) {
                                            var95 = var10.field2594;
                                        }
                                    } else {
                                        var95 = var10.field2591;
                                        if (Statics.field1746 == var10 && var10.field2567 != 0) {
                                            var95 = var10.field2567;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2595) {
                                            class88.method1816(var12, var13, var10.field2583, var10.field2584, var95);
                                        } else {
                                            class88.method1818(var12, var13, var10.field2583, var10.field2584, var95);
                                        }
                                    } else if (var10.field2595) {
                                        class88.method1815(var12, var13, var10.field2583, var10.field2584, var95, 256 - (var14 & 0xFF));
                                    } else {
                                        class88.method1819(var12, var13, var10.field2583, var10.field2584, var95, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2687 == 4) {
                                    class182 var96 = var10.method3117();
                                    if (var96 != null) {
                                        String var97 = var10.field2621;
                                        int var98;
                                        if (method240(var10)) {
                                            var98 = var10.field2592;
                                            if (Statics.field1746 == var10 && var10.field2594 != 0) {
                                                var98 = var10.field2594;
                                            }
                                            if (var10.field2622.length() > 0) {
                                                var97 = var10.field2622;
                                            }
                                        } else {
                                            var98 = var10.field2591;
                                            if (Statics.field1746 == var10 && var10.field2567 != 0) {
                                                var98 = var10.field2567;
                                            }
                                        }
                                        if (var10.field2573 && var10.field2678 != -1) {
                                            class39 var99 = class39.method1211(var10.field2678);
                                            var97 = var99.field964;
                                            if (var97 == null) {
                                                var97 = "null";
                                            }
                                            if ((var99.field975 == 1 || var10.field2679 != 1) && var10.field2679 != -1) {
                                                var97 = class2.method699(16748608) + var97 + class2.field22 + " " + 'x' + method635(var10.field2679);
                                            }
                                        }
                                        if (field626 == var10) {
                                            class133 var10000 = (class133) null;
                                            var97 = class133.field2215;
                                            var98 = var10.field2591;
                                        }
                                        if (!var10.field2573) {
                                            var97 = method1403(var97, var10);
                                        }
                                        var96.method3364(var97, var12, var13, var10.field2583, var10.field2584, var98, var10.field2626 ? 0 : -1, var10.field2624, var10.field2625, var10.field2623);
                                    } else if (class157.field2667) {
                                        Statics.method1598(var10);
                                    }
                                } else if (var10.field2687 == 5) {
                                    if (var10.field2573) {
                                        class85 var101;
                                        if (var10.field2678 == -1) {
                                            var101 = var10.method3095(false);
                                        } else {
                                            var101 = class39.method20(var10.field2678, var10.field2679, var10.field2598, var10.field2648, false);
                                        }
                                        if (var101 != null) {
                                            int var102 = var101.field1449;
                                            int var103 = var101.field1450;
                                            if (var10.field2599) {
                                                class88.method1821(var12, var13, var10.field2583 + var12, var10.field2584 + var13);
                                                int var104 = (var10.field2583 + (var102 - 1)) / var102;
                                                int var105 = (var10.field2584 + (var103 - 1)) / var103;
                                                for (int var106 = 0; var106 < var104; var106++) {
                                                    for (int var107 = 0; var107 < var105; var107++) {
                                                        if (var10.field2600 != 0) {
                                                            var101.method1727(var102 / 2 + var102 * var106 + var12, var103 / 2 + var103 * var107 + var13, var10.field2600, 4096);
                                                        } else if (var14 == 0) {
                                                            var101.method1715(var102 * var106 + var12, var103 * var107 + var13);
                                                        } else {
                                                            var101.method1721(var102 * var106 + var12, var103 * var107 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1858(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var108 = var10.field2583 * 4096 / var102;
                                                if (var10.field2600 != 0) {
                                                    var101.method1727(var10.field2583 / 2 + var12, var10.field2584 / 2 + var13, var10.field2600, var108);
                                                } else if (var14 != 0) {
                                                    var101.method1723(var12, var13, var10.field2583, var10.field2584, 256 - (var14 & 0xFF));
                                                } else if (var10.field2583 == var102 && var10.field2584 == var103) {
                                                    var101.method1715(var12, var13);
                                                } else {
                                                    var101.method1786(var12, var13, var10.field2583, var10.field2584);
                                                }
                                            }
                                        } else if (class157.field2667) {
                                            Statics.method1598(var10);
                                        }
                                    } else {
                                        class85 var100 = var10.method3095(method240(var10));
                                        if (var100 != null) {
                                            var100.method1715(var12, var13);
                                        } else if (class157.field2667) {
                                            Statics.method1598(var10);
                                        }
                                    }
                                } else if (var10.field2687 == 6) {
                                    boolean var109 = method240(var10);
                                    int var110;
                                    if (var109) {
                                        var110 = var10.field2601;
                                    } else {
                                        var110 = var10.field2610;
                                    }
                                    class111 var111 = null;
                                    int var112 = 0;
                                    if (var10.field2678 != -1) {
                                        class39 var113 = class39.method1211(var10.field2678);
                                        if (var113 != null) {
                                            class39 var114 = var113.method840(var10.field2679);
                                            var111 = var114.method878(1);
                                            if (var111 == null) {
                                                Statics.method1598(var10);
                                            } else {
                                                var111.method2253();
                                                var112 = var111.field1531 / 2;
                                            }
                                        }
                                    } else if (var10.field2597 == 5) {
                                        if (var10.field2683 == 0) {
                                            var111 = field682.method3157((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var111 = Statics.field2540.method13();
                                        }
                                    } else if (var110 == -1) {
                                        var111 = var10.method3121((class33) null, -1, var109, Statics.field2540.field30);
                                        if (var111 == null && class157.field2667) {
                                            Statics.method1598(var10);
                                        }
                                    } else {
                                        class33 var115 = class33.method1401(var110);
                                        var111 = var10.method3121(var115, var10.field2680, var109, Statics.field2540.field30);
                                        if (var111 == null && class157.field2667) {
                                            Statics.method1598(var10);
                                        }
                                    }
                                    class103.method2146(var10.field2583 / 2 + var12, var10.field2584 / 2 + var13);
                                    int var116 = var10.field2653 * class103.field1765[var10.field2614] >> 16;
                                    int var117 = var10.field2653 * class103.field1771[var10.field2614] >> 16;
                                    if (var111 != null) {
                                        if (var10.field2573) {
                                            var111.method2253();
                                            if (var10.field2564) {
                                                var111.method2310(0, var10.field2654, var10.field2616, var10.field2614, var10.field2612, var10.field2613 + var112 + var116, var10.field2613 + var117, var10.field2653);
                                            } else {
                                                var111.method2265(0, var10.field2654, var10.field2616, var10.field2614, var10.field2612, var10.field2613 + var112 + var116, var10.field2613 + var117);
                                            }
                                        } else {
                                            var111.method2265(0, var10.field2654, 0, var10.field2614, 0, var116, var117);
                                        }
                                    }
                                    class103.method2154();
                                } else {
                                    if (var10.field2687 == 7) {
                                        class182 var118 = var10.method3117();
                                        if (var118 == null) {
                                            if (class157.field2667) {
                                                Statics.method1598(var10);
                                            }
                                            continue;
                                        }
                                        int var119 = 0;
                                        for (int var120 = 0; var120 < var10.field2584; var120++) {
                                            for (int var121 = 0; var121 < var10.field2583; var121++) {
                                                if (var10.field2649[var119] > 0) {
                                                    class39 var122 = class39.method1211(var10.field2649[var119] - 1);
                                                    String var123;
                                                    if (var122.field975 != 1 && var10.field2630[var119] == 1) {
                                                        var123 = class2.method699(16748608) + var122.field964 + class2.field22;
                                                    } else {
                                                        var123 = class2.method699(16748608) + var122.field964 + class2.field22 + " " + 'x' + method635(var10.field2630[var119]);
                                                    }
                                                    int var124 = (var10.field2665 + 115) * var121 + var12;
                                                    int var125 = (var10.field2615 + 12) * var120 + var13;
                                                    if (var10.field2624 == 0) {
                                                        var118.method3361(var123, var124, var125, var10.field2591, var10.field2626 ? 0 : -1);
                                                    } else if (var10.field2624 == 1) {
                                                        var118.method3363(var123, var10.field2583 / 2 + var124, var125, var10.field2591, var10.field2626 ? 0 : -1);
                                                    } else {
                                                        var118.method3362(var123, var10.field2583 + var124 - 1, var125, var10.field2591, var10.field2626 ? 0 : -1);
                                                    }
                                                }
                                                var119++;
                                            }
                                        }
                                    }
                                    if (var10.field2687 == 8 && Statics.field85 == var10 && field615 == field478) {
                                        int var126 = 0;
                                        int var127 = 0;
                                        class182 var128 = Statics.field81;
                                        String var129 = var10.field2621;
                                        String var130 = method1403(var129, var10);
                                        while (var130.length() > 0) {
                                            int var131 = var130.indexOf(class2.field16);
                                            String var132;
                                            if (var131 == -1) {
                                                var132 = var130;
                                                var130 = "";
                                            } else {
                                                var132 = var130.substring(0, var131);
                                                var130 = var130.substring(var131 + 4);
                                            }
                                            int var133 = var128.method3356(var132);
                                            if (var133 > var126) {
                                                var126 = var133;
                                            }
                                            var127 += var128.field2836 + 1;
                                        }
                                        var126 += 6;
                                        var127 += 7;
                                        int var134 = var10.field2583 + var12 - 5 - var126;
                                        int var135 = var10.field2584 + var13 + 5;
                                        if (var134 < var12 + 5) {
                                            var134 = var12 + 5;
                                        }
                                        if (var126 + var134 > arg4) {
                                            var134 = arg4 - var126;
                                        }
                                        if (var127 + var135 > arg5) {
                                            var135 = arg5 - var127;
                                        }
                                        class88.method1816(var134, var135, var126, var127, 16777120);
                                        class88.method1818(var134, var135, var126, var127, 0);
                                        String var136 = var10.field2621;
                                        int var137 = var128.field2836 + var135 + 2;
                                        String var138 = method1403(var136, var10);
                                        while (var138.length() > 0) {
                                            int var139 = var138.indexOf(class2.field16);
                                            String var140;
                                            if (var139 == -1) {
                                                var140 = var138;
                                                var138 = "";
                                            } else {
                                                var140 = var138.substring(0, var139);
                                                var138 = var138.substring(var139 + 4);
                                            }
                                            var128.method3361(var140, var134 + 3, var137, 0, -1);
                                            var137 += var128.field2836 + 1;
                                        }
                                    }
                                    if (var10.field2687 == 9) {
                                        if (var10.field2593 == 1) {
                                            class88.method1824(var12, var13, var10.field2583 + var12, var10.field2584 + var13, var10.field2591);
                                        } else {
                                            int var141 = var10.field2583 >= 0 ? var10.field2583 : -var10.field2583;
                                            int var142 = var10.field2584 >= 0 ? var10.field2584 : -var10.field2584;
                                            int var143 = var141;
                                            if (var141 < var142) {
                                                var143 = var142;
                                            }
                                            if (var143 != 0) {
                                                int var144 = (var10.field2583 << 16) / var143;
                                                int var145 = (var10.field2584 << 16) / var143;
                                                if (var145 <= var144) {
                                                    var144 = -var144;
                                                } else {
                                                    var145 = -var145;
                                                }
                                                int var146 = var10.field2593 * var145 >> 17;
                                                int var147 = var10.field2593 * var145 + 1 >> 17;
                                                int var148 = var10.field2593 * var144 >> 17;
                                                int var149 = var10.field2593 * var144 + 1 >> 17;
                                                int var150 = var12 + var146;
                                                int var151 = var12 - var147;
                                                int var152 = var10.field2583 + var12 - var147;
                                                int var153 = var10.field2583 + var12 + var146;
                                                int var154 = var13 + var148;
                                                int var155 = var13 - var149;
                                                int var156 = var10.field2584 + var13 - var149;
                                                int var157 = var10.field2584 + var13 + var148;
                                                class103.method2150(var150, var151, var152);
                                                class103.method2144(var154, var155, var156, var150, var151, var152, var10.field2591);
                                                class103.method2150(var150, var152, var153);
                                                class103.method2144(var154, var156, var157, var150, var152, var153, var10.field2591);
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

    @ObfuscatedName("bv.cb(Ljava/lang/String;Lfk;B)Ljava/lang/String;")
    public static String method1403(String arg0, class157 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method1266(arg1, var2 - 1);
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
                if (Statics.field1358 != null) {
                    int var9 = Statics.field1358.field1391;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1358.field1385 != null) {
                        var8 = (String) Statics.field1358.field1385;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ah.cp(IS)Ljava/lang/String;")
    public static final String method635(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field24 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method699(65408) + var1.substring(0, var1.length() - 8) + class133.field2218 + " " + class2.field25 + var1 + class2.field19 + class2.field22;
        } else if (var1.length() > 6) {
            return " " + class2.method699(16777215) + var1.substring(0, var1.length() - 4) + class133.field2220 + " " + class2.field25 + var1 + class2.field19 + class2.field22;
        } else {
            return " " + class2.method699(16776960) + var1 + class2.field22;
        }
    }

    @ObfuscatedName("y.cm(Lfk;B)Z")
    public static final boolean method240(class157 arg0) {
        if (arg0.field2628 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2628.length; var1++) {
            int var2 = method1266(arg0, var1);
            int var3 = arg0.field2576[var1];
            if (arg0.field2628[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2628[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2628[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bs.ci(Lfk;II)I")
    public static final int method1266(class157 arg0, int arg1) {
        if (arg0.field2596 == null || arg1 >= arg0.field2596.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2596[arg1];
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
                    var7 = field671[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field601[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field602[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class157 var11 = class157.method3077(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method1211(var12).field977 || field567)) {
                        for (int var13 = 0; var13 < var11.field2649.length; var13++) {
                            if (var12 + 1 == var11.field2649[var13]) {
                                var7 += var11.field2630[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class158.field2693[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2035[field601[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class158.field2693[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2540.field34;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2036[var14]) {
                            var7 += field601[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class157 var17 = class157.method3077(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method1211(var18).field977 || field567)) {
                        for (int var19 = 0; var19 < var17.field2649.length; var19++) {
                            if (var18 + 1 == var17.field2649[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field627;
                }
                if (var6 == 12) {
                    var7 = field628;
                }
                if (var6 == 13) {
                    int var20 = class158.field2693[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class158.method2233(var22);
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
                    var7 = (Statics.field2540.field410 >> 7) + Statics.field911;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2540.field397 >> 7) + Statics.field1286;
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

    @ObfuscatedName("ef.cf([Lfk;IIIIIIIB)V")
    public static final void method2925(class157[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class157 var9 = arg0[var8];
            if (var9 != null && (!var9.field2573 || var9.field2687 == 0 || var9.field2641 || Statics.method108(var9) != 0 || field634 == var9) && var9.field2585 == arg1 && (!var9.field2573 || !method3078(var9))) {
                int var10 = var9.field2676 + arg6;
                int var11 = var9.field2580 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2687 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2687 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2583 + var10;
                    int var19 = var9.field2584 + var11;
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
                    int var22 = var9.field2583 + var10;
                    int var23 = var9.field2584 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field532 == var9) {
                    field641 = true;
                    field642 = var10;
                    field696 = var11;
                }
                if (!var9.field2573 || var12 < var14 && var13 < var15) {
                    if (var9.field2578 == 1337) {
                        Statics.method1598(var9);
                    } else if (var9.field2578 != 1338) {
                        if (var9.field2687 == 0) {
                            if (!var9.field2573 && method3078(var9) && Statics.field1746 != var9) {
                                continue;
                            }
                            method2925(arg0, var9.field2574, var12, var13, var14, var15, var10 - var9.field2587, var11 - var9.field2588);
                            if (var9.field2682 != null) {
                                method2925(var9.field2682, var9.field2574, var12, var13, var14, var15, var10 - var9.field2587, var11 - var9.field2588);
                            }
                            class4 var36 = (class4) field623.method3270((long) var9.field2574);
                            if (var36 != null) {
                                int var37 = var36.field55;
                                if (class157.method2697(var37)) {
                                    method2925(Statics.field2638[var37], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2573) {
                            boolean var38;
                            if (class76.field1376 >= var12 && class76.field1370 >= var13 && class76.field1376 < var14 && class76.field1370 < var15) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if (class76.field1369 == 1 && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if (class76.field1375 == 1 && class76.field1382 >= var12 && class76.field1380 >= var13 && class76.field1382 < var14 && class76.field1380 < var15) {
                                var40 = true;
                            }
                            if (var40) {
                                method117(var9, class76.field1382 - var10, class76.field1380 - var11);
                            }
                            if (field532 != null && field532 != var9 && var38 && class161.method106(Statics.method108(var9))) {
                                field555 = var9;
                            }
                            if (field634 == var9) {
                                field600 = true;
                                field639 = var10;
                                field640 = var11;
                            }
                            if (var9.field2641) {
                                if (var38 && field658 != 0 && var9.field2662 != null) {
                                    class1 var41 = new class1();
                                    var41.field2 = var9;
                                    var41.field4 = field658;
                                    var41.field12 = var9.field2662;
                                    field603.method3316(var41);
                                }
                                if (field532 != null || Statics.field28 != null || field683) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field2684 && var40) {
                                    var9.field2684 = true;
                                    if (var9.field2643 != null) {
                                        class1 var42 = new class1();
                                        var42.field2 = var9;
                                        var42.field3 = class76.field1382 - var10;
                                        var42.field4 = class76.field1380 - var11;
                                        var42.field12 = var9.field2643;
                                        field603.method3316(var42);
                                    }
                                }
                                if (var9.field2684 && var39 && var9.field2565 != null) {
                                    class1 var43 = new class1();
                                    var43.field2 = var9;
                                    var43.field3 = class76.field1376 - var10;
                                    var43.field4 = class76.field1370 - var11;
                                    var43.field12 = var9.field2565;
                                    field603.method3316(var43);
                                }
                                if (var9.field2684 && !var39) {
                                    var9.field2684 = false;
                                    if (var9.field2607 != null) {
                                        class1 var44 = new class1();
                                        var44.field2 = var9;
                                        var44.field3 = class76.field1376 - var10;
                                        var44.field4 = class76.field1370 - var11;
                                        var44.field12 = var9.field2607;
                                        field473.method3316(var44);
                                    }
                                }
                                if (var39 && var9.field2646 != null) {
                                    class1 var45 = new class1();
                                    var45.field2 = var9;
                                    var45.field3 = class76.field1376 - var10;
                                    var45.field4 = class76.field1370 - var11;
                                    var45.field12 = var9.field2646;
                                    field603.method3316(var45);
                                }
                                if (!var9.field2606 && var38) {
                                    var9.field2606 = true;
                                    if (var9.field2647 != null) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field3 = class76.field1376 - var10;
                                        var46.field4 = class76.field1370 - var11;
                                        var46.field12 = var9.field2647;
                                        field603.method3316(var46);
                                    }
                                }
                                if (var9.field2606 && var38 && var9.field2627 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = var9;
                                    var47.field3 = class76.field1376 - var10;
                                    var47.field4 = class76.field1370 - var11;
                                    var47.field12 = var9.field2627;
                                    field603.method3316(var47);
                                }
                                if (var9.field2606 && !var38) {
                                    var9.field2606 = false;
                                    if (var9.field2689 != null) {
                                        class1 var48 = new class1();
                                        var48.field2 = var9;
                                        var48.field3 = class76.field1376 - var10;
                                        var48.field4 = class76.field1370 - var11;
                                        var48.field12 = var9.field2689;
                                        field473.method3316(var48);
                                    }
                                }
                                if (var9.field2660 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = var9;
                                    var49.field12 = var9.field2660;
                                    field660.method3316(var49);
                                }
                                if (var9.field2642 != null && field647 > var9.field2686) {
                                    if (var9.field2655 == null || field647 - var9.field2686 > 32) {
                                        class1 var54 = new class1();
                                        var54.field2 = var9;
                                        var54.field12 = var9.field2642;
                                        field603.method3316(var54);
                                    } else {
                                        label450: for (int var50 = var9.field2686; var50 < field647; var50++) {
                                            int var51 = field646[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2655.length; var52++) {
                                                if (var9.field2655[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field2 = var9;
                                                    var53.field12 = var9.field2642;
                                                    field603.method3316(var53);
                                                    break label450;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2686 = field647;
                                }
                                if (var9.field2656 != null && field649 > var9.field2618) {
                                    if (var9.field2657 == null || field649 - var9.field2618 > 32) {
                                        class1 var59 = new class1();
                                        var59.field2 = var9;
                                        var59.field12 = var9.field2656;
                                        field603.method3316(var59);
                                    } else {
                                        label430: for (int var55 = var9.field2618; var55 < field649; var55++) {
                                            int var56 = field648[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2657.length; var57++) {
                                                if (var9.field2657[var57] == var56) {
                                                    class1 var58 = new class1();
                                                    var58.field2 = var9;
                                                    var58.field12 = var9.field2656;
                                                    field603.method3316(var58);
                                                    break label430;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2618 = field649;
                                }
                                if (var9.field2658 != null && field651 > var9.field2688) {
                                    if (var9.field2582 == null || field651 - var9.field2688 > 32) {
                                        class1 var64 = new class1();
                                        var64.field2 = var9;
                                        var64.field12 = var9.field2658;
                                        field603.method3316(var64);
                                    } else {
                                        label410: for (int var60 = var9.field2688; var60 < field651; var60++) {
                                            int var61 = field650[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field2582.length; var62++) {
                                                if (var9.field2582[var62] == var61) {
                                                    class1 var63 = new class1();
                                                    var63.field2 = var9;
                                                    var63.field12 = var9.field2658;
                                                    field603.method3316(var63);
                                                    break label410;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2688 = field651;
                                }
                                if (field652 > var9.field2603 && var9.field2663 != null) {
                                    class1 var65 = new class1();
                                    var65.field2 = var9;
                                    var65.field12 = var9.field2663;
                                    field603.method3316(var65);
                                }
                                if (field587 > var9.field2603 && var9.field2670 != null) {
                                    class1 var66 = new class1();
                                    var66.field2 = var9;
                                    var66.field12 = var9.field2670;
                                    field603.method3316(var66);
                                }
                                if (field677 > var9.field2603 && var9.field2666 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = var9;
                                    var67.field12 = var9.field2666;
                                    field603.method3316(var67);
                                }
                                if (field655 > var9.field2603 && var9.field2644 != null) {
                                    class1 var68 = new class1();
                                    var68.field2 = var9;
                                    var68.field12 = var9.field2644;
                                    field603.method3316(var68);
                                }
                                var9.field2603 = field645;
                                if (var9.field2664 != null) {
                                    for (int var69 = 0; var69 < field632; var69++) {
                                        class1 var70 = new class1();
                                        var70.field2 = var9;
                                        var70.field7 = field611[var69];
                                        var70.field8 = field684[var69];
                                        var70.field12 = var9.field2664;
                                        field603.method3316(var70);
                                    }
                                }
                            }
                        }
                        if (!var9.field2573) {
                            if (field532 != null || Statics.field28 != null || field683) {
                                return;
                            }
                            if ((var9.field2673 >= 0 || var9.field2567 != 0) && class76.field1376 >= var12 && class76.field1370 >= var13 && class76.field1376 < var14 && class76.field1370 < var15) {
                                if (var9.field2673 >= 0) {
                                    Statics.field1746 = arg0[var9.field2673];
                                } else {
                                    Statics.field1746 = var9;
                                }
                            }
                            if (var9.field2687 == 8 && class76.field1376 >= var12 && class76.field1370 >= var13 && class76.field1376 < var14 && class76.field1370 < var15) {
                                Statics.field85 = var9;
                            }
                            if (var9.field2609 > var9.field2584) {
                                int var71 = var9.field2583 + var10;
                                int var72 = var9.field2584;
                                int var73 = var9.field2609;
                                int var74 = class76.field1376;
                                int var75 = class76.field1370;
                                if (field670) {
                                    field594 = 32;
                                } else {
                                    field594 = 0;
                                }
                                field670 = false;
                                if (class76.field1369 != 0) {
                                    if (var74 >= var71 && var74 < var71 + 16 && var75 >= var11 && var75 < var11 + 16) {
                                        var9.field2588 -= 4;
                                        Statics.method1598(var9);
                                    } else if (var74 >= var71 && var74 < var71 + 16 && var75 >= var11 + var72 - 16 && var75 < var11 + var72) {
                                        var9.field2588 += 4;
                                        Statics.method1598(var9);
                                    } else if (var74 >= var71 - field594 && var74 < field594 + var71 + 16 && var75 >= var11 + 16 && var75 < var11 + var72 - 16) {
                                        int var76 = (var72 - 32) * var72 / var73;
                                        if (var76 < 8) {
                                            var76 = 8;
                                        }
                                        int var77 = var75 - var11 - 16 - var76 / 2;
                                        int var78 = var72 - 32 - var76;
                                        var9.field2588 = (var73 - var72) * var77 / var78;
                                        Statics.method1598(var9);
                                        field670 = true;
                                    }
                                }
                                if (field658 != 0) {
                                    int var79 = var9.field2583;
                                    if (var74 >= var71 - var79 && var75 >= var11 && var74 < var71 + 16 && var75 <= var11 + var72) {
                                        var9.field2588 += field658 * 45;
                                        Statics.method1598(var9);
                                    }
                                }
                            }
                        }
                    } else if ((field456 == 0 || field456 == 3) && class76.field1375 == 1) {
                        int var24 = class76.field1382 - 25 - var10;
                        int var25 = class76.field1380 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field549 + field535 & 0x7FF;
                            int var27 = class103.field1765[var26];
                            int var28 = class103.field1771[var26];
                            int var29 = (field621 + 256) * var27 >> 8;
                            int var30 = (field621 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field2540.field410 + var31 >> 7;
                            int var34 = Statics.field2540.field397 - var32 >> 7;
                            boolean var35 = method133(Statics.field2540.field448[0], Statics.field2540.field449[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field500.method2452(var24);
                                field500.method2452(var25);
                                field500.method2642(field549);
                                field500.method2452(57);
                                field500.method2452(field535);
                                field500.method2452(field621);
                                field500.method2452(89);
                                field500.method2642(Statics.field2540.field410);
                                field500.method2642(Statics.field2540.field397);
                                field500.method2452(field579);
                                field500.method2452(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.cx([Lfk;II)V")
    public static final void method28(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2687 == 0) {
                    if (var3.field2682 != null) {
                        method28(var3.field2682, arg1);
                    }
                    class4 var4 = (class4) field623.method3270((long) var3.field2574);
                    if (var4 != null) {
                        int var5 = var4.field55;
                        if (class157.method2697(var5)) {
                            method28(Statics.field2638[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2668 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field12 = var3.field2668;
                    Statics.method116(var6);
                }
                if (arg1 == 1 && var3.field2669 != null) {
                    if (var3.field2575 >= 0) {
                        class157 var7 = class157.method3077(var3.field2574);
                        if (var7 == null || var7.field2682 == null || var3.field2575 >= var7.field2682.length || var7.field2682[var3.field2575] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field12 = var3.field2669;
                    Statics.method116(var8);
                }
            }
        }
    }

    @ObfuscatedName("h.cs(Lfk;IIB)V")
    public static final void method117(class157 arg0, int arg1, int arg2) {
        if (field532 != null || field683 || arg0 == null) {
            return;
        }
        class157 var3 = arg0;
        int var4 = Statics.method108(arg0);
        int var5 = var4 >> 17 & 0x7;
        int var6 = var5;
        class157 var7;
        if (var5 == 0) {
            var7 = null;
        } else {
            int var8 = 0;
            while (true) {
                if (var8 >= var6) {
                    var7 = var3;
                    break;
                }
                var3 = class157.method3077(var3.field2585);
                if (var3 == null) {
                    var7 = null;
                    break;
                }
                var8++;
            }
        }
        class157 var9 = var7;
        if (var7 == null) {
            var9 = arg0.field2636;
        }
        if (var9 == null) {
            return;
        }
        field532 = arg0;
        class157 var11 = arg0;
        int var12 = Statics.method108(arg0);
        int var13 = var12 >> 17 & 0x7;
        int var14 = var13;
        class157 var15;
        if (var13 == 0) {
            var15 = null;
        } else {
            int var16 = 0;
            while (true) {
                if (var16 >= var14) {
                    var15 = var11;
                    break;
                }
                var11 = class157.method3077(var11.field2585);
                if (var11 == null) {
                    var15 = null;
                    break;
                }
                var16++;
            }
        }
        class157 var17 = var15;
        if (var15 == null) {
            var17 = arg0.field2636;
        }
        field634 = var17;
        field635 = arg1;
        field636 = arg2;
        Statics.field2562 = 0;
        field644 = false;
        return;
    }

    @ObfuscatedName("am.cq(S)V")
    public static final void method698() {
        Statics.method1598(field532);
        Statics.field2562++;
        if (field641 && field600) {
            int var0 = class76.field1376;
            int var1 = class76.field1370;
            int var2 = var0 - field635;
            int var3 = var1 - field636;
            if (var2 < field639) {
                var2 = field639;
            }
            if (field532.field2583 + var2 > field639 + field634.field2583) {
                var2 = field639 + field634.field2583 - field532.field2583;
            }
            if (var3 < field640) {
                var3 = field640;
            }
            if (field532.field2584 + var3 > field640 + field634.field2584) {
                var3 = field640 + field634.field2584 - field532.field2584;
            }
            int var4 = var2 - field642;
            int var5 = var3 - field696;
            int var6 = field532.field2637;
            if (Statics.field2562 > field532.field2677 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field644 = true;
            }
            int var7 = field634.field2587 + (var2 - field639);
            int var8 = field634.field2588 + (var3 - field640);
            if (field532.field2650 != null && field644) {
                class1 var9 = new class1();
                var9.field2 = field532;
                var9.field3 = var7;
                var9.field4 = var8;
                var9.field12 = field532.field2650;
                Statics.method116(var9);
            }
            if (class76.field1369 == 0) {
                if (field644) {
                    if (field532.field2651 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field532;
                        var10.field3 = var7;
                        var10.field4 = var8;
                        var10.field1 = field555;
                        var10.field12 = field532.field2651;
                        Statics.method116(var10);
                    }
                    if (field555 != null) {
                        class157 var11 = field532;
                        int var12 = Statics.method108(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class157 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class157.method3077(var11.field2585);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field500.method2331(46);
                            field500.method2455(field555.field2574);
                            field500.method2504(field532.field2574);
                            field500.method2494(field555.field2575);
                            field500.method2493(field532.field2575);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field669 != 1) {
                                int var17 = field525 - 1;
                                boolean var18;
                                if (var17 < 0) {
                                    var18 = false;
                                } else {
                                    int var19 = field608[var17];
                                    if (var19 >= 2000) {
                                        var19 -= 2000;
                                    }
                                    if (var19 == 1007) {
                                        var18 = true;
                                    } else {
                                        var18 = false;
                                    }
                                }
                                if (!var18) {
                                    break label91;
                                }
                            }
                            if (field525 > 2) {
                                method220();
                                break label120;
                            }
                        }
                        if (field525 > 0) {
                            method884(field525 - 1);
                        }
                    }
                }
                field532 = null;
            }
        } else if (Statics.field2562 > 1) {
            field532 = null;
        }
    }

    @ObfuscatedName("el.cd(I)V")
    public static void method3037() {
        for (class4 var0 = (class4) field623.method3275(); var0 != null; var0 = (class4) field623.method3274()) {
            int var1 = var0.field55;
            if (class157.method2697(var1)) {
                boolean var2 = true;
                class157[] var3 = Statics.field2638[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2573;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2814;
                    class157 var6 = class157.method3077(var5);
                    if (var6 != null) {
                        Statics.method1598(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.cy([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1437(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("client.cw(II)V")
    public static final void method546(int arg0) {
        if (!class157.method2697(arg0)) {
            return;
        }
        class157[] var1 = Statics.field2638[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class157 var3 = var1[var2];
            if (var3 != null) {
                var3.field2680 = 0;
                var3.field2681 = 0;
            }
        }
    }

    @ObfuscatedName("bc.co(II)V")
    public static final void method1380(int arg0) {
        if (class157.method2697(arg0)) {
            method816(Statics.field2638[arg0], -1);
        }
    }

    @ObfuscatedName("ai.ck([Lfk;IB)V")
    public static final void method816(class157[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class157 var3 = arg0[var2];
            if (var3 != null && var3.field2585 == arg1 && (!var3.field2573 || !method3078(var3))) {
                if (var3.field2687 == 0) {
                    if (!var3.field2573 && method3078(var3) && Statics.field1746 != var3) {
                        continue;
                    }
                    method816(arg0, var3.field2574);
                    if (var3.field2682 != null) {
                        method816(var3.field2682, var3.field2574);
                    }
                    class4 var4 = (class4) field623.method3270((long) var3.field2574);
                    if (var4 != null) {
                        method1380(var4.field55);
                    }
                }
                if (var3.field2687 == 6) {
                    if (var3.field2610 != -1 || var3.field2601 != -1) {
                        boolean var5 = method240(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2601;
                        } else {
                            var6 = var3.field2610;
                        }
                        if (var6 != -1) {
                            class33 var7 = class33.method1401(var6);
                            var3.field2681 += field540;
                            while (var3.field2681 > var7.field864[var3.field2680]) {
                                var3.field2681 -= var7.field864[var3.field2680];
                                var3.field2680++;
                                if (var3.field2680 >= var7.field861.length) {
                                    var3.field2680 -= var7.field865;
                                    if (var3.field2680 < 0 || var3.field2680 >= var7.field861.length) {
                                        var3.field2680 = 0;
                                    }
                                }
                                Statics.method1598(var3);
                            }
                        }
                    }
                    if (var3.field2659 != 0 && !var3.field2573) {
                        int var8 = var3.field2659 >> 16;
                        int var9 = var3.field2659 << 16 >> 16;
                        int var10 = field540 * var8;
                        int var11 = field540 * var9;
                        var3.field2614 = var3.field2614 + var10 & 0x7FF;
                        var3.field2654 = var3.field2654 + var11 & 0x7FF;
                        Statics.method1598(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cv(II)V")
    public static final void method192(int arg0) {
        method3037();
        for (class7 var1 = (class7) class7.field101.method3294(); var1 != null; var1 = (class7) class7.field101.method3296()) {
            if (var1.field106 != null) {
                var1.method39();
            }
        }
        int var2 = class41.method199(arg0).field1021;
        if (var2 == 0) {
            return;
        }
        int var3 = class158.field2693[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class103.method2200(0.9D);
                ((class109) Statics.field1747).method2239(0.9D);
            }
            if (var3 == 2) {
                class103.method2200(0.8D);
                ((class109) Statics.field1747).method2239(0.8D);
            }
            if (var3 == 3) {
                class103.method2200(0.7D);
                ((class109) Statics.field1747).method2239(0.7D);
            }
            if (var3 == 4) {
                class103.method2200(0.6D);
                ((class109) Statics.field1747).method2239(0.6D);
            }
            class39.method679();
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
            if (field697 != var4) {
                if (field697 == 0 && field698 != -1) {
                    class137.method799(Statics.field348, field698, 0, var4, false);
                    field699 = false;
                } else if (var4 == 0) {
                    class137.method51();
                    field699 = false;
                } else {
                    class137.method1600(var4);
                }
                field697 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field472 = 127;
            }
            if (var3 == 1) {
                field472 = 96;
            }
            if (var3 == 2) {
                field472 = 64;
            }
            if (var3 == 3) {
                field472 = 32;
            }
            if (var3 == 4) {
                field472 = 0;
            }
        }
        if (var2 == 5) {
            field669 = var3;
        }
        if (var2 == 6) {
            field624 = var3;
        }
        if (var2 == 9) {
            field625 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field701 = 127;
        }
        if (var3 == 1) {
            field701 = 96;
        }
        if (var3 == 2) {
            field701 = 64;
        }
        if (var3 == 3) {
            field701 = 32;
        }
        if (var3 == 4) {
            field701 = 0;
        }
    }

    @ObfuscatedName("e.db(IIIB)Lc;")
    public static final class4 method47(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field55 = arg1;
        var3.field51 = arg2;
        field623.method3284(var3, (long) arg0);
        method546(arg1);
        class25.method757(arg1);
        class157 var4 = class157.method3077(arg0);
        if (var4 != null) {
            Statics.method1598(var4);
        }
        if (field626 != null) {
            Statics.method1598(field626);
            field626 = null;
        }
        field683 = false;
        field525 = 0;
        method112(Statics.field2022, Statics.field1609, Statics.field390, Statics.field955);
        if (field622 != -1) {
            int var5 = field622;
            if (class157.method2697(var5)) {
                method28(Statics.field2638[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("u.dg(Lc;ZS)V")
    public static final void method89(class4 arg0, boolean arg1) {
        int var2 = arg0.field55;
        int var3 = (int) arg0.field2814;
        arg0.method3320();
        if (arg1 && var2 != -1 && Statics.field2827[var2]) {
            Statics.field2571.method2999(var2);
            if (Statics.field2638[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2638[var2].length; var5++) {
                    if (Statics.field2638[var2][var5] != null) {
                        if (Statics.field2638[var2][var5].field2687 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2638[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2638[var2] = null;
                }
                Statics.field2827[var2] = false;
            }
        }
        method575(var2);
        class157 var6 = class157.method3077(var3);
        if (var6 != null) {
            Statics.method1598(var6);
        }
        field683 = false;
        field525 = 0;
        method112(Statics.field2022, Statics.field1609, Statics.field390, Statics.field955);
        if (field622 != -1) {
            int var7 = field622;
            if (class157.method2697(var7)) {
                method28(Statics.field2638[var7], 1);
            }
        }
    }

    @ObfuscatedName("cn.dy(Lfk;I)Z")
    public static final boolean method1607(class157 arg0) {
        int var1 = arg0.field2578;
        if (var1 == 205) {
            field711 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field682.method3175(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field682.method3153(var4, var5 == 1);
        }
        if (var1 == 324) {
            field682.method3154(false);
        }
        if (var1 == 325) {
            field682.method3154(true);
        }
        if (var1 == 326) {
            field500.method2331(52);
            field682.method3165(field500);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("a.ds(IIIB)V")
    public static final void method200(int arg0, int arg1, int arg2) {
        method120();
        class88.method1858(arg0, arg1, Statics.field2744.field1459 + arg0, Statics.field2744.field1458 + arg1);
        if (field456 == 2 || field456 == 5) {
            class88.method1825(arg0 + 25, arg1 + 5, 0, Statics.field1503, Statics.field1192);
        } else {
            int var3 = field549 + field535 & 0x7FF;
            int var4 = Statics.field2540.field410 / 32 + 48;
            int var5 = 464 - Statics.field2540.field397 / 32;
            Statics.field2436.method1733(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field621 + 256, Statics.field1503, Statics.field1192);
            for (int var6 = 0; var6 < field672; var6++) {
                int var7 = field691[var6] * 4 + 2 - Statics.field2540.field410 / 32;
                int var8 = field692[var6] * 4 + 2 - Statics.field2540.field397 / 32;
                method37(arg0, arg1, var7, var8, field457[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class176 var11 = field596[Statics.field188][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2540.field410 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2540.field397 / 32;
                        method37(arg0, arg1, var12, var13, Statics.field257[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field497; var14++) {
                class24 var15 = field496[field630[var14]];
                if (var15 != null && var15.method24()) {
                    class30 var16 = var15.field379;
                    if (var16 != null && var16.field787 != null) {
                        var16 = var16.method607();
                    }
                    if (var16 != null && var16.field778 && var16.field759) {
                        int var17 = var15.field410 / 32 - Statics.field2540.field410 / 32;
                        int var18 = var15.field397 / 32 - Statics.field2540.field397 / 32;
                        method37(arg0, arg1, var17, var18, Statics.field257[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field618; var19++) {
                class3 var20 = field582[field584[var19]];
                if (var20 != null && var20.method24()) {
                    int var21 = var20.field410 / 32 - Statics.field2540.field410 / 32;
                    int var22 = var20.field397 / 32 - Statics.field2540.field397 / 32;
                    boolean var23 = false;
                    if (method68(var20.field33)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field2540.field31 != 0 && var20.field31 != 0 && Statics.field2540.field31 == var20.field31) {
                        var24 = true;
                    }
                    if (var23) {
                        method37(arg0, arg1, var21, var22, Statics.field257[3]);
                    } else if (var24) {
                        method37(arg0, arg1, var21, var22, Statics.field257[4]);
                    } else {
                        method37(arg0, arg1, var21, var22, Statics.field257[2]);
                    }
                }
            }
            if (field476 != 0 && field510 % 20 < 10) {
                if (field476 == 1 && field477 >= 0 && field477 < field496.length) {
                    class24 var25 = field496[field477];
                    if (var25 != null) {
                        int var26 = var25.field410 / 32 - Statics.field2540.field410 / 32;
                        int var27 = var25.field397 / 32 - Statics.field2540.field397 / 32;
                        method545(arg0, arg1, var26, var27, Statics.field912[1]);
                    }
                }
                if (field476 == 2) {
                    int var28 = field479 * 4 - Statics.field911 * 4 + 2 - Statics.field2540.field410 / 32;
                    int var29 = field480 * 4 - Statics.field1286 * 4 + 2 - Statics.field2540.field397 / 32;
                    method545(arg0, arg1, var28, var29, Statics.field912[1]);
                }
                if (field476 == 10 && field568 >= 0 && field568 < field582.length) {
                    class3 var30 = field582[field568];
                    if (var30 != null) {
                        int var31 = var30.field410 / 32 - Statics.field2540.field410 / 32;
                        int var32 = var30.field397 / 32 - Statics.field2540.field397 / 32;
                        method545(arg0, arg1, var31, var32, Statics.field912[1]);
                    }
                }
            }
            if (field694 != 0) {
                int var33 = field694 * 4 + 2 - Statics.field2540.field410 / 32;
                int var34 = field695 * 4 + 2 - Statics.field2540.field397 / 32;
                method37(arg0, arg1, var33, var34, Statics.field912[0]);
            }
            class88.method1816(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field456 < 3) {
            Statics.field198.method1733(arg0, arg1, 33, 33, 25, 25, field549, 256, Statics.field1368, Statics.field541);
        } else {
            class88.method1825(arg0, arg1, 0, Statics.field1368, Statics.field541);
        }
        if (field552[arg2]) {
            Statics.field2744.method1794(arg0, arg1);
        }
        field666[arg2] = true;
    }

    @ObfuscatedName("client.dj(IIIILcc;S)V")
    public static final void method545(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method37(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field549 + field535 & 0x7FF;
        int var7 = class103.field1765[var6];
        int var8 = class103.field1771[var6];
        int var9 = var7 * 256 / (field621 + 256);
        int var10 = var8 * 256 / (field621 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field129.method1726(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("r.dp(IIIILcc;I)V")
    public static final void method37(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field549 + field535 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class103.field1765[var5];
        int var8 = class103.field1771[var5];
        int var9 = var7 * 256 / (field621 + 256);
        int var10 = var8 * 256 / (field621 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1729(Statics.field2744, arg0 + 94 + var11 - arg4.field1449 / 2 + 4, arg1 + 83 - var12 - arg4.field1450 / 2 - 4);
        } else {
            arg4.method1715(arg0 + 94 + var11 - arg4.field1449 / 2 + 4, arg1 + 83 - var12 - arg4.field1450 / 2 - 4);
        }
    }

    @ObfuscatedName("dx.df(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2367(int arg0, String arg1, String arg2) {
        method25(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("n.dh(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method25(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field673[var4] = field673[var4 - 1];
            field674[var4] = field674[var4 - 1];
            field676[var4] = field676[var4 - 1];
            field675[var4] = field675[var4 - 1];
        }
        field673[0] = arg0;
        field674[0] = arg1;
        field676[0] = arg2;
        field675[0] = arg3;
        field704++;
        field652 = field645;
    }

    @ObfuscatedName("u.dn(Ljava/lang/String;I)Z")
    public static boolean method68(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method831(arg0, Statics.field1276);
        for (int var2 = 0; var2 < field714; var2++) {
            if (var1.equalsIgnoreCase(class147.method831(field716[var2].field346, Statics.field1276))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method831(Statics.field2540.field33, Statics.field1276))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("y.dd(Ljava/lang/String;B)Z")
    public static boolean method224(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method831(arg0, Statics.field1276);
        for (int var2 = 0; var2 < field718; var2++) {
            class11 var3 = field609[var2];
            if (var1.equalsIgnoreCase(class147.method831(var3.field192, Statics.field1276))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method831(var3.field191, Statics.field1276))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dv.de(Ljava/lang/String;B)V")
    public static final void method2443(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field714 < 200 || field589 == 1) || field714 >= 200) {
            method2367(0, "", class133.field2223);
            return;
        }
        String var1 = class147.method831(arg0, Statics.field1276);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field714; var2++) {
            class22 var3 = field716[var2];
            String var4 = class147.method831(var3.field346, Statics.field1276);
            if (var4 != null && var4.equals(var1)) {
                method2367(0, "", arg0 + class133.field2171);
                return;
            }
            if (var3.field349 != null) {
                String var5 = class147.method831(var3.field349, Statics.field1276);
                if (var5 != null && var5.equals(var1)) {
                    method2367(0, "", arg0 + class133.field2171);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field718; var6++) {
            class11 var7 = field609[var6];
            String var8 = class147.method831(var7.field192, Statics.field1276);
            if (var8 != null && var8.equals(var1)) {
                method2367(0, "", class133.field2229 + arg0 + class133.field2257);
                return;
            }
            if (var7.field191 != null) {
                String var9 = class147.method831(var7.field191, Statics.field1276);
                if (var9 != null && var9.equals(var1)) {
                    method2367(0, "", class133.field2229 + arg0 + class133.field2257);
                    return;
                }
            }
        }
        if (class147.method831(Statics.field2540.field33, Statics.field1276).equals(var1)) {
            method2367(0, "", class133.field2227);
        } else {
            field500.method2331(98);
            field500.method2452(class126.method2141(arg0));
            field500.method2457(arg0);
        }
    }

    @ObfuscatedName("au.dc(Ljava/lang/String;ZI)V")
    public static final void method553(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (field718 >= 100) {
            method2367(0, "", class133.field2225);
            return;
        }
        String var2 = class147.method831(arg0, Statics.field1276);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field718; var3++) {
            class11 var4 = field609[var3];
            String var5 = class147.method831(var4.field192, Statics.field1276);
            if (var5 != null && var5.equals(var2)) {
                method2367(0, "", arg0 + class133.field2226);
                return;
            }
            if (var4.field191 != null) {
                String var6 = class147.method831(var4.field191, Statics.field1276);
                if (var6 != null && var6.equals(var2)) {
                    method2367(0, "", arg0 + class133.field2226);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field714; var7++) {
            class22 var8 = field716[var7];
            String var9 = class147.method831(var8.field346, Statics.field1276);
            if (var9 != null && var9.equals(var2)) {
                method2367(0, "", class133.field2231 + arg0 + class133.field2129);
                return;
            }
            if (var8.field349 != null) {
                String var10 = class147.method831(var8.field349, Statics.field1276);
                if (var10 != null && var10.equals(var2)) {
                    method2367(0, "", class133.field2231 + arg0 + class133.field2129);
                    return;
                }
            }
        }
        if (class147.method831(Statics.field2540.field33, Statics.field1276).equals(var2)) {
            method2367(0, "", class133.field2228);
        } else {
            field500.method2331(30);
            field500.method2452(class126.method2141(arg0));
            field500.method2457(arg0);
        }
    }

    @ObfuscatedName("s.dz(Ljava/lang/String;S)V")
    public static final void method105(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method831(arg0, Statics.field1276);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field714; var2++) {
            class22 var3 = field716[var2];
            String var4 = var3.field346;
            String var5 = class147.method831(var4, Statics.field1276);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field714--;
                for (int var7 = var2; var7 < field714; var7++) {
                    field716[var7] = field716[var7 + 1];
                }
                field587 = field645;
                field500.method2331(141);
                field500.method2452(class126.method2141(arg0));
                field500.method2457(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("al.dx(Ljava/lang/String;B)V")
    public static final void method738(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method831(arg0, Statics.field1276);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field718; var2++) {
            class11 var3 = field609[var2];
            String var4 = var3.field192;
            String var5 = class147.method831(var4, Statics.field1276);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field718--;
                for (int var7 = var2; var7 < field718; var7++) {
                    field609[var7] = field609[var7 + 1];
                }
                field587 = field645;
                field500.method2331(129);
                field500.method2452(class126.method2141(arg0));
                field500.method2457(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ca.dt(Ljava/lang/String;B)V")
    public static final void method2052(String arg0) {
        if (Statics.field107 != null) {
            field500.method2331(166);
            field500.method2452(class126.method2141(arg0));
            field500.method2457(arg0);
        }
    }

    @ObfuscatedName("cz.du(I)V")
    public static final void method1701() {
        field500.method2331(1);
        field500.method2452(0);
    }

    @ObfuscatedName("az.dk(IB)V")
    public static void method575(int arg0) {
        for (class170 var1 = (class170) field523.method3275(); var1 != null; var1 = (class170) field523.method3274()) {
            if ((var1.field2814 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3320();
            }
        }
    }

    @ObfuscatedName("eh.dv(Lfk;S)Z")
    public static boolean method3078(class157 arg0) {
        if (field659) {
            if (Statics.method108(arg0) != 0) {
                return false;
            }
            if (arg0.field2687 == 0) {
                return false;
            }
        }
        return arg0.field2645;
    }

    @ObfuscatedName("ek.dq(Lfk;I)Ljava/lang/String;")
    public static String method2727(class157 arg0) {
        if (class161.method2373(Statics.method108(arg0)) == 0) {
            return null;
        } else if (arg0.field2640 == null || arg0.field2640.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2640;
        }
    }
}

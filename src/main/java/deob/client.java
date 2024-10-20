package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class72 {

    @ObfuscatedName("client.c")
    public static boolean field457 = true;

    @ObfuscatedName("client.e")
    public static int field714 = 1;

    @ObfuscatedName("client.i")
    public static int field459 = 0;

    @ObfuscatedName("client.w")
    public static class162[] field513 = new class162[4];

    @ObfuscatedName("client.k")
    public static boolean field624 = false;

    @ObfuscatedName("client.v")
    public static boolean field461 = false;

    @ObfuscatedName("client.o")
    public static int field700 = 0;

    @ObfuscatedName("client.m")
    public static int field463 = 1;

    @ObfuscatedName("client.r")
    public static int field464 = 0;

    @ObfuscatedName("client.d")
    public static boolean field465 = true;

    @ObfuscatedName("client.n")
    public static int field636 = 0;

    @ObfuscatedName("client.b")
    public static long field467 = 0L;

    @ObfuscatedName("client.t")
    public static int field468 = 0;

    @ObfuscatedName("client.l")
    public static int field469 = 0;

    @ObfuscatedName("client.a")
    public static int field594 = 0;

    @ObfuscatedName("client.f")
    public static boolean field500 = true;

    @ObfuscatedName("client.h")
    public static boolean field472 = false;

    @ObfuscatedName("client.az")
    public static int field533 = 0;

    @ObfuscatedName("client.ao")
    public static int field696 = 0;

    @ObfuscatedName("client.au")
    public static int field475 = 0;

    @ObfuscatedName("client.aw")
    public static int field476 = 0;

    @ObfuscatedName("client.ad")
    public static int field560 = 0;

    @ObfuscatedName("client.av")
    public static int field518 = 0;

    @ObfuscatedName("client.am")
    public static int field566 = 0;

    @ObfuscatedName("client.an")
    public static int field480 = 0;

    @ObfuscatedName("client.ac")
    public static int field481 = 0;

    @ObfuscatedName("client.at")
    public static class126 field482 = new class126(new byte[5000]);

    @ObfuscatedName("client.ai")
    public static int field483 = 0;

    @ObfuscatedName("client.ar")
    public static int field484 = 0;

    @ObfuscatedName("client.ae")
    public static int field485 = 0;

    @ObfuscatedName("client.bg")
    public static int field487 = 0;

    @ObfuscatedName("client.bb")
    public static int field588 = 0;

    @ObfuscatedName("client.bj")
    public static int field669 = 0;

    @ObfuscatedName("client.bl")
    public static int field668 = 0;

    @ObfuscatedName("client.bm")
    public static int field491 = 0;

    @ObfuscatedName("client.bo")
    public static class24[] field492 = new class24[32768];

    @ObfuscatedName("client.bk")
    public static int field493 = 0;

    @ObfuscatedName("client.bu")
    public static int[] field494 = new int[32768];

    @ObfuscatedName("client.cu")
    public static class115 field631 = new class115(5000);

    @ObfuscatedName("client.cg")
    public static class115 field679 = new class115(5000);

    @ObfuscatedName("client.cv")
    public static class115 field497 = new class115(5000);

    @ObfuscatedName("client.ci")
    public static int field498 = 0;

    @ObfuscatedName("client.cs")
    public static int field499 = 0;

    @ObfuscatedName("client.ct")
    public static int field517 = 0;

    @ObfuscatedName("client.cb")
    public static int field501 = 0;

    @ObfuscatedName("client.cd")
    public static int field502 = 0;

    @ObfuscatedName("client.cc")
    public static int field503 = 0;

    @ObfuscatedName("client.cx")
    public static int field504 = 0;

    @ObfuscatedName("client.cp")
    public static int field505 = 0;

    @ObfuscatedName("client.cw")
    public static boolean field506 = false;

    @ObfuscatedName("client.cz")
    public static int field507 = 0;

    @ObfuscatedName("client.cf")
    public static int field508 = 0;

    @ObfuscatedName("client.cl")
    public static int field571 = 1;

    @ObfuscatedName("client.ch")
    public static int field510 = 0;

    @ObfuscatedName("client.dq")
    public static int field511 = 1;

    @ObfuscatedName("client.dy")
    public static int field512 = 0;

    @ObfuscatedName("client.db")
    public static boolean field514 = false;

    @ObfuscatedName("client.dj")
    public static int[][][] field515 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field516 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dw")
    public static int field490 = 0;

    @ObfuscatedName("client.dt")
    public static int[][] field645 = new int[104][104];

    @ObfuscatedName("client.da")
    public static int[][] field519 = new int[104][104];

    @ObfuscatedName("client.di")
    public static int[] field520 = new int[4000];

    @ObfuscatedName("client.dx")
    public static int[] field687 = new int[4000];

    @ObfuscatedName("client.dz")
    public static int field522 = 0;

    @ObfuscatedName("client.dm")
    public static int field591 = 2;

    @ObfuscatedName("client.dr")
    public static int field524 = 0;

    @ObfuscatedName("client.dd")
    public static int field525 = 2;

    @ObfuscatedName("client.ds")
    public static int field581 = 0;

    @ObfuscatedName("client.de")
    public static int field527 = 1;

    @ObfuscatedName("client.dc")
    public static int field528 = 0;

    @ObfuscatedName("client.ev")
    public static int field529 = 0;

    @ObfuscatedName("client.ez")
    public static int field530 = 2;

    @ObfuscatedName("client.ej")
    public static int field531 = 0;

    @ObfuscatedName("client.el")
    public static int field532 = 1;

    @ObfuscatedName("client.ec")
    public static int field712 = 0;

    @ObfuscatedName("client.eq")
    public static int field534 = 0;

    @ObfuscatedName("client.ew")
    public static int field535 = 2301979;

    @ObfuscatedName("client.ee")
    public static int field536 = 5063219;

    @ObfuscatedName("client.fp")
    public static int field537 = 3353893;

    @ObfuscatedName("client.fc")
    public static int field509 = 7759444;

    @ObfuscatedName("client.fv")
    public static boolean field559 = false;

    @ObfuscatedName("client.fj")
    public static int field470 = 0;

    @ObfuscatedName("client.fz")
    public static int field542 = 128;

    @ObfuscatedName("client.fl")
    public static int field543 = 0;

    @ObfuscatedName("client.fk")
    public static int field544 = 0;

    @ObfuscatedName("client.fw")
    public static int field495 = 0;

    @ObfuscatedName("client.fr")
    public static int field489 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field547 = false;

    @ObfuscatedName("client.fx")
    public static int field548 = 0;

    @ObfuscatedName("client.fe")
    public static int field455 = 0;

    @ObfuscatedName("client.fu")
    public static int field545 = 50;

    @ObfuscatedName("client.fa")
    public static int[] field686 = new int[field545];

    @ObfuscatedName("client.fb")
    public static int[] field552 = new int[field545];

    @ObfuscatedName("client.fs")
    public static int[] field473 = new int[field545];

    @ObfuscatedName("client.fy")
    public static int[] field708 = new int[field545];

    @ObfuscatedName("client.fd")
    public static int[] field474 = new int[field545];

    @ObfuscatedName("client.fg")
    public static int[] field556 = new int[field545];

    @ObfuscatedName("client.gj")
    public static int[] field557 = new int[field545];

    @ObfuscatedName("client.gg")
    public static String[] field558 = new String[field545];

    @ObfuscatedName("client.gm")
    public static int[][] field553 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field604 = 0;

    @ObfuscatedName("client.gn")
    public static int field614 = -1;

    @ObfuscatedName("client.gu")
    public static int field562 = -1;

    @ObfuscatedName("client.gp")
    public static int field563 = 0;

    @ObfuscatedName("client.gf")
    public static int field572 = 0;

    @ObfuscatedName("client.go")
    public static int field549 = 0;

    @ObfuscatedName("client.gy")
    public static int field586 = 0;

    @ObfuscatedName("client.gl")
    public static int field567 = 0;

    @ObfuscatedName("client.gt")
    public static int field568 = 0;

    @ObfuscatedName("client.gh")
    public static int field550 = 0;

    @ObfuscatedName("client.ga")
    public static int field526 = 0;

    @ObfuscatedName("client.gd")
    public static int field705 = 0;

    @ObfuscatedName("client.gw")
    public static int field523 = 0;

    @ObfuscatedName("client.gv")
    public static boolean field573 = false;

    @ObfuscatedName("client.gc")
    public static int field610 = 0;

    @ObfuscatedName("client.gx")
    public static int field672 = 0;

    @ObfuscatedName("client.gi")
    public static class3[] field576 = new class3[2048];

    @ObfuscatedName("client.gk")
    public static int field577 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field578 = new int[2048];

    @ObfuscatedName("client.hl")
    public static int field579 = 0;

    @ObfuscatedName("client.hj")
    public static int[] field580 = new int[2048];

    @ObfuscatedName("client.hw")
    public static class126[] field555 = new class126[2048];

    @ObfuscatedName("client.hf")
    public static int field583 = -1;

    @ObfuscatedName("client.hm")
    public static int field584 = 0;

    @ObfuscatedName("client.he")
    public static int field585 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field593 = new int[1000];

    @ObfuscatedName("client.hn")
    public static final int[] field570 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hu")
    public static String[] field565 = new String[8];

    @ObfuscatedName("client.hb")
    public static boolean[] field713 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field590 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ho")
    public static class175[][][] field589 = new class175[4][104][104];

    @ObfuscatedName("client.hr")
    public static class175 field592 = new class175();

    @ObfuscatedName("client.hs")
    public static class175 field460 = new class175();

    @ObfuscatedName("client.hx")
    public static class175 field458 = new class175();

    @ObfuscatedName("client.hg")
    public static int[] field595 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field596 = new int[25];

    @ObfuscatedName("client.hi")
    public static int[] field715 = new int[25];

    @ObfuscatedName("client.hy")
    public static int field598 = 0;

    @ObfuscatedName("client.hz")
    public static boolean field599 = false;

    @ObfuscatedName("client.id")
    public static int field637 = 0;

    @ObfuscatedName("client.ic")
    public static int[] field601 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field602 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field603 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field486 = new int[500];

    @ObfuscatedName("client.iu")
    public static String[] field605 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field606 = new String[500];

    @ObfuscatedName("client.il")
    public static int field607 = -1;

    @ObfuscatedName("client.ij")
    public static int field608 = -1;

    @ObfuscatedName("client.ip")
    public static int field710 = 0;

    @ObfuscatedName("client.ik")
    public static int field600 = 50;

    @ObfuscatedName("client.iy")
    public static int field551 = 0;

    @ObfuscatedName("client.it")
    public static String field612 = null;

    @ObfuscatedName("client.in")
    public static boolean field613 = false;

    @ObfuscatedName("client.ir")
    public static int field539 = -1;

    @ObfuscatedName("client.ia")
    public static String field615 = null;

    @ObfuscatedName("client.jl")
    public static String field616 = null;

    @ObfuscatedName("client.je")
    public static int field617 = -1;

    @ObfuscatedName("client.js")
    public static class173 field618 = new class173(8);

    @ObfuscatedName("client.jr")
    public static int field587 = 0;

    @ObfuscatedName("client.jh")
    public static int field620 = 0;

    @ObfuscatedName("client.jg")
    public static class156 field621 = null;

    @ObfuscatedName("client.jm")
    public static int field622 = 0;

    @ObfuscatedName("client.jf")
    public static int field623 = 0;

    @ObfuscatedName("client.jb")
    public static int field609 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field625 = false;

    @ObfuscatedName("client.jo")
    public static boolean field626 = false;

    @ObfuscatedName("client.jt")
    public static boolean field627 = false;

    @ObfuscatedName("client.jj")
    public static class156 field471 = null;

    @ObfuscatedName("client.jy")
    public static class156 field629 = null;

    @ObfuscatedName("client.jp")
    public static int field630 = 0;

    @ObfuscatedName("client.jw")
    public static int field642 = 0;

    @ObfuscatedName("client.jd")
    public static class156 field632 = null;

    @ObfuscatedName("client.jc")
    public static boolean field633 = false;

    @ObfuscatedName("client.jn")
    public static int field634 = -1;

    @ObfuscatedName("client.ju")
    public static int field635 = -1;

    @ObfuscatedName("client.jx")
    public static boolean field521 = false;

    @ObfuscatedName("client.ji")
    public static int field477 = -1;

    @ObfuscatedName("client.jq")
    public static int field611 = -1;

    @ObfuscatedName("client.jz")
    public static boolean field639 = false;

    @ObfuscatedName("client.kd")
    public static int field640 = 1;

    @ObfuscatedName("client.kv")
    public static int[] field641 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field574 = 0;

    @ObfuscatedName("client.kx")
    public static int[] field644 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field664 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field693 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field646 = 0;

    @ObfuscatedName("client.kn")
    public static int field647 = 0;

    @ObfuscatedName("client.kr")
    public static int field648 = 0;

    @ObfuscatedName("client.kb")
    public static int field649 = 0;

    @ObfuscatedName("client.kw")
    public static int field650 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field651 = new int[2000];

    @ObfuscatedName("client.ks")
    public static String[] field575 = new String[1000];

    @ObfuscatedName("client.kc")
    public static int field653 = 0;

    @ObfuscatedName("client.kt")
    public static class175 field654 = new class175();

    @ObfuscatedName("client.ki")
    public static class175 field655 = new class175();

    @ObfuscatedName("client.kk")
    public static class175 field656 = new class175();

    @ObfuscatedName("client.km")
    public static class173 field673 = new class173(512);

    @ObfuscatedName("client.kg")
    public static int field658 = 0;

    @ObfuscatedName("client.kf")
    public static int field659 = -2;

    @ObfuscatedName("client.ls")
    public static boolean[] field660 = new boolean[100];

    @ObfuscatedName("client.lr")
    public static boolean[] field661 = new boolean[100];

    @ObfuscatedName("client.lg")
    public static boolean[] field662 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static int[] field663 = new int[100];

    @ObfuscatedName("client.lm")
    public static int[] field561 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field665 = new int[100];

    @ObfuscatedName("client.lp")
    public static int[] field666 = new int[100];

    @ObfuscatedName("client.lc")
    public static int field667 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field569 = new int[100];

    @ObfuscatedName("client.la")
    public static String[] field709 = new String[100];

    @ObfuscatedName("client.lq")
    public static String[] field670 = new String[100];

    @ObfuscatedName("client.lj")
    public static String[] field671 = new String[100];

    @ObfuscatedName("client.lw")
    public static int field496 = 0;

    @ObfuscatedName("client.lv")
    public static int[] field682 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ll")
    public static int field674 = 0;

    @ObfuscatedName("client.lh")
    public static int field675 = 0;

    @ObfuscatedName("client.ln")
    public static long[] field479 = new long[100];

    @ObfuscatedName("client.le")
    public static int field677 = 0;

    @ObfuscatedName("client.lk")
    public static int field678 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field676 = new int[128];

    @ObfuscatedName("client.lf")
    public static int[] field680 = new int[128];

    @ObfuscatedName("client.lo")
    public static String field681 = null;

    @ObfuscatedName("client.mo")
    public static String field707 = null;

    @ObfuscatedName("client.me")
    public static int field683 = -1;

    @ObfuscatedName("client.mx")
    public static int field684 = 0;

    @ObfuscatedName("client.mj")
    public static int[] field597 = new int[1000];

    @ObfuscatedName("client.mr")
    public static int[] field638 = new int[1000];

    @ObfuscatedName("client.mc")
    public static class85[] field538 = new class85[1000];

    @ObfuscatedName("client.mu")
    public static int field466 = 0;

    @ObfuscatedName("client.ml")
    public static int field689 = 0;

    @ObfuscatedName("client.mq")
    public static int field690 = 0;

    @ObfuscatedName("client.mz")
    public static int field691 = 255;

    @ObfuscatedName("client.mg")
    public static int field692 = -1;

    @ObfuscatedName("client.mb")
    public static boolean field540 = false;

    @ObfuscatedName("client.mt")
    public static int field695 = 127;

    @ObfuscatedName("client.ms")
    public static int field711 = 127;

    @ObfuscatedName("client.na")
    public static int field619 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field697 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field698 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field699 = new int[50];

    @ObfuscatedName("client.nn")
    public static int[] field628 = new int[50];

    @ObfuscatedName("client.no")
    public static class56[] field701 = new class56[50];

    @ObfuscatedName("client.nf")
    public static boolean field702 = false;

    @ObfuscatedName("client.nj")
    public static boolean[] field703 = new boolean[5];

    @ObfuscatedName("client.ns")
    public static int[] field704 = new int[5];

    @ObfuscatedName("client.nw")
    public static int[] field688 = new int[5];

    @ObfuscatedName("client.ny")
    public static int[] field706 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field554 = new int[5];

    @ObfuscatedName("client.op")
    public static int field546 = 0;

    @ObfuscatedName("client.om")
    public static int field717 = 0;

    @ObfuscatedName("client.oj")
    public static class22[] field564 = new class22[200];

    @ObfuscatedName("client.oi")
    public static class171 field462 = new class171();

    @ObfuscatedName("client.os")
    public static int field694 = 0;

    @ObfuscatedName("client.oo")
    public static class11[] field685 = new class11[100];

    @ObfuscatedName("client.or")
    public static class161 field657 = new class161();

    @ObfuscatedName("client.og")
    public static int field652 = -1;

    @ObfuscatedName("client.od")
    public static int field716 = -1;

    @ObfuscatedName("client.z(B)V")
    public final void method246() {
    }

    public final void init() {
        if (!this.method1389()) {
            return;
        }
        class165[] var1 = new class165[] { class165.field2717, class165.field2723, class165.field2720, class165.field2722, class165.field2724, class165.field2716, class165.field2719, class165.field2718, class165.field2721 };
        class165[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class165 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2725);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2725)) {
                    case 1:
                        int var12 = Integer.parseInt(var5);
                        class131[] var13 = class131.method2585();
                        int var14 = 0;
                        class131 var16;
                        while (true) {
                            if (var14 >= var13.length) {
                                var16 = null;
                                break;
                            }
                            class131 var15 = var13[var14];
                            if (var15.field2045 == var12) {
                                var16 = var15;
                                break;
                            }
                            var14++;
                        }
                        Statics.field1775 = var16;
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field31)) {
                            field624 = true;
                        } else {
                            field624 = false;
                        }
                        break;
                    case 3:
                        class132[] var6 = class132.method1827();
                        int var7 = Integer.parseInt(var5);
                        class132[] var8 = var6;
                        int var9 = 0;
                        class132 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class132 var10 = var8[var9];
                            if (var7 == var10.method2286()) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field234 = (class132) var11;
                        if (Statics.field234 == class132.field2056) {
                            Statics.field183 = class184.field2804;
                        } else {
                            Statics.field183 = class184.field2806;
                        }
                        break;
                    case 4:
                        if (var5.equalsIgnoreCase(class2.field31)) {
                            field463 = 1;
                        } else {
                            field463 = 0;
                        }
                        break;
                    case 5:
                        field700 = Integer.parseInt(var5);
                        break;
                    case 6:
                        field459 = Integer.parseInt(var5);
                    case 7:
                    default:
                        break;
                    case 8:
                        field714 = Integer.parseInt(var5);
                        break;
                    case 9:
                        Statics.field105 = var5;
                }
            }
        }
        method38();
        Statics.field142 = this.getCodeBase().getHost();
        String var17 = Statics.field1775.field2043;
        byte var18 = 0;
        try {
            Statics.method1816("oldschool", var17, var18, 16);
        } catch (Exception var20) {
            class79.method2299((String) null, var20);
        }
        Statics.field456 = this;
        this.method1442(765, 503, 5);
    }

    @ObfuscatedName("e.e(I)V")
    public static final void method38() {
        class94.field1552 = false;
        field461 = false;
    }

    @ObfuscatedName("client.s(I)V")
    public final void method249() {
        Statics.field2298 = field459 == 0 ? 43594 : field714 + 40000;
        Statics.field1002 = field459 == 0 ? 443 : field714 + 50000;
        Statics.field2041 = Statics.field2298;
        Statics.field1294 = class159.field2653;
        Statics.field2665 = class159.field2655;
        Statics.field1240 = class159.field2654;
        Statics.field2669 = class159.field2652;
        if (Statics.field1326.toLowerCase().indexOf("microsoft") == -1) {
            class74.field1351[44] = 71;
            class74.field1351[45] = 26;
            class74.field1351[46] = 72;
            class74.field1351[47] = 73;
            class74.field1351[59] = 57;
            class74.field1351[61] = 27;
            class74.field1351[91] = 42;
            class74.field1351[92] = 74;
            class74.field1351[93] = 43;
            class74.field1351[192] = 28;
            class74.field1351[222] = 58;
            class74.field1351[520] = 59;
        } else {
            class74.field1351[186] = 57;
            class74.field1351[187] = 27;
            class74.field1351[188] = 71;
            class74.field1351[189] = 26;
            class74.field1351[190] = 72;
            class74.field1351[191] = 73;
            class74.field1351[192] = 58;
            class74.field1351[219] = 42;
            class74.field1351[220] = 74;
            class74.field1351[221] = 43;
            class74.field1351[222] = 59;
            class74.field1351[223] = 28;
        }
        Canvas var1 = Statics.field1997;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class74.field1335);
        var1.addFocusListener(class74.field1335);
        Canvas var2 = Statics.field1997;
        var2.addMouseListener(class76.field1387);
        var2.addMouseMotionListener(class76.field1387);
        var2.addFocusListener(class76.field1387);
        class77 var3;
        try {
            var3 = new class77();
        } catch (Throwable var5) {
            var3 = null;
        }
        Statics.field729 = var3;
        if (Statics.field729 != null) {
            Statics.field729.method1323(Statics.field1997);
        }
        Statics.field1258 = new class70(255, class81.field1421, class81.field1419, 500000);
        if (field459 != 0) {
            field472 = true;
        }
    }

    @ObfuscatedName("client.i(B)V")
    public final void method454() {
        field636++;
        this.method254();
        class155.method2245();
        try {
            if (class137.field2314 == 1) {
                int var1 = Statics.field2313.method2667();
                if (var1 > 0 && Statics.field2313.method2673()) {
                    int var2 = var1 - Statics.field2316;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2313.method2666(var2);
                } else {
                    Statics.field2313.method2672();
                    Statics.field2313.method2712();
                    if (Statics.field1738 == null) {
                        class137.field2314 = 0;
                    } else {
                        class137.field2314 = 2;
                    }
                    Statics.field2317 = null;
                    Statics.field376 = null;
                }
            }
        } catch (Exception var132) {
            var132.printStackTrace();
            Statics.field2313.method2672();
            class137.field2314 = 0;
            Statics.field2317 = null;
            Statics.field376 = null;
            Statics.field1738 = null;
        }
        Statics.method1342();
        class74.method37();
        class76 var4 = class76.field1387;
        synchronized (class76.field1387) {
            class76.field1377 = class76.field1381;
            class76.field1378 = class76.field1372;
            class76.field1379 = class76.field1375;
            class76.field1384 = class76.field1380;
            class76.field1386 = class76.field1374;
            class76.field1383 = class76.field1376;
            class76.field1389 = class76.field1385 * 696926260298208083L;
            class76.field1380 = 0;
        }
        if (Statics.field729 != null) {
            int var6 = Statics.field729.method1322();
            field653 = var6;
        }
        if (field464 == 0) {
            method657();
            class72.method23();
        } else if (field464 == 5) {
            class20.method121(this);
            method657();
            class72.method23();
        } else if (field464 == 10) {
            class20.method121(this);
        } else if (field464 == 20) {
            class20.method121(this);
            method207();
        } else if (field464 == 25) {
            method2298(false);
            field508 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field2030.length; var8++) {
                if (Statics.field364[var8] != -1 && Statics.field2030[var8] == null) {
                    Statics.field2030[var8] = Statics.field15.method2903(Statics.field364[var8], 0);
                    if (Statics.field2030[var8] == null) {
                        var7 = false;
                        field508++;
                    }
                }
                if (Statics.field2019[var8] != -1 && Statics.field1660[var8] == null) {
                    Statics.field1660[var8] = Statics.field15.method2915(Statics.field2019[var8], 0, Statics.field334[var8]);
                    if (Statics.field1660[var8] == null) {
                        var7 = false;
                        field508++;
                    }
                }
            }
            if (var7) {
                field510 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field2030.length; var10++) {
                    byte[] var11 = Statics.field1660[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field1662[var10] >> 8) * 64 - Statics.field953;
                        int var13 = (Statics.field1662[var10] & 0xFF) * 64 - Statics.field450;
                        if (field514) {
                            var12 = 10;
                            var13 = 10;
                        }
                        var9 &= class9.method2988(var11, var12, var13);
                    }
                }
                if (var9) {
                    if (field512 != 0) {
                        method205(class133.field2256 + class2.field22 + class2.field35 + 100 + "%" + class2.field20, true);
                    }
                    Statics.method1342();
                    method887();
                    Statics.method1342();
                    Statics.field362.method1829();
                    Statics.method1342();
                    System.gc();
                    for (int var14 = 0; var14 < 4; var14++) {
                        field513[var14].method3134();
                    }
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                class9.field125[var15][var16][var17] = 0;
                            }
                        }
                    }
                    Statics.method1342();
                    class9.method2621();
                    int var18 = Statics.field2030.length;
                    class7.method874();
                    method2298(true);
                    if (!field514) {
                        int var19 = 0;
                        label541: while (true) {
                            if (var19 >= var18) {
                                for (int var33 = 0; var33 < var18; var33++) {
                                    int var34 = (Statics.field1662[var33] >> 8) * 64 - Statics.field953;
                                    int var35 = (Statics.field1662[var33] & 0xFF) * 64 - Statics.field450;
                                    byte[] var36 = Statics.field2030[var33];
                                    if (var36 == null && Statics.field898 < 800) {
                                        Statics.method1342();
                                        class9.method1517(var34, var35, 64, 64);
                                    }
                                }
                                method2298(true);
                                int var37 = 0;
                                while (true) {
                                    if (var37 >= var18) {
                                        break label541;
                                    }
                                    byte[] var38 = Statics.field1660[var37];
                                    if (var38 != null) {
                                        int var39 = (Statics.field1662[var37] >> 8) * 64 - Statics.field953;
                                        int var40 = (Statics.field1662[var37] & 0xFF) * 64 - Statics.field450;
                                        Statics.method1342();
                                        class94 var41 = Statics.field362;
                                        class162[] var42 = field513;
                                        class126 var43 = new class126(var38);
                                        int var44 = -1;
                                        while (true) {
                                            int var45 = var43.method2395();
                                            if (var45 == 0) {
                                                break;
                                            }
                                            var44 += var45;
                                            int var46 = 0;
                                            while (true) {
                                                int var47 = var43.method2395();
                                                if (var47 == 0) {
                                                    break;
                                                }
                                                var46 += var47 - 1;
                                                int var48 = var46 & 0x3F;
                                                int var49 = var46 >> 6 & 0x3F;
                                                int var50 = var46 >> 12;
                                                int var51 = var43.method2399();
                                                int var52 = var51 >> 2;
                                                int var53 = var51 & 0x3;
                                                int var54 = var39 + var49;
                                                int var55 = var40 + var48;
                                                if (var54 > 0 && var55 > 0 && var54 < 103 && var55 < 103) {
                                                    int var56 = var50;
                                                    if ((class9.field125[1][var54][var55] & 0x2) == 2) {
                                                        var56 = var50 - 1;
                                                    }
                                                    class162 var57 = null;
                                                    if (var56 >= 0) {
                                                        var57 = var42[var56];
                                                    }
                                                    class9.method3(var50, var54, var55, var44, var53, var52, var41, var57);
                                                }
                                            }
                                        }
                                    }
                                    var37++;
                                }
                            }
                            int var20 = (Statics.field1662[var19] >> 8) * 64 - Statics.field953;
                            int var21 = (Statics.field1662[var19] & 0xFF) * 64 - Statics.field450;
                            byte[] var22 = Statics.field2030[var19];
                            if (var22 != null) {
                                Statics.method1342();
                                int var23 = Statics.field201 * 8 - 48;
                                int var24 = Statics.field898 * 8 - 48;
                                class162[] var25 = field513;
                                int var26 = 0;
                                label538: while (true) {
                                    if (var26 >= 4) {
                                        class126 var29 = new class126(var22);
                                        int var30 = 0;
                                        while (true) {
                                            if (var30 >= 4) {
                                                break label538;
                                            }
                                            for (int var31 = 0; var31 < 64; var31++) {
                                                for (int var32 = 0; var32 < 64; var32++) {
                                                    class9.method2617(var29, var30, var20 + var31, var21 + var32, var23, var24, 0);
                                                }
                                            }
                                            var30++;
                                        }
                                    }
                                    for (int var27 = 0; var27 < 64; var27++) {
                                        for (int var28 = 0; var28 < 64; var28++) {
                                            if (var20 + var27 > 0 && var20 + var27 < 103 && var21 + var28 > 0 && var21 + var28 < 103) {
                                                var25[var26].field2686[var20 + var27][var21 + var28] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var26++;
                                }
                            }
                            var19++;
                        }
                    }
                    if (field514) {
                        int var58 = 0;
                        label474: while (true) {
                            if (var58 >= 4) {
                                for (int var76 = 0; var76 < 13; var76++) {
                                    for (int var77 = 0; var77 < 13; var77++) {
                                        int var78 = field515[0][var76][var77];
                                        if (var78 == -1) {
                                            class9.method1517(var76 * 8, var77 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2298(true);
                                int var79 = 0;
                                while (true) {
                                    if (var79 >= 4) {
                                        break label474;
                                    }
                                    Statics.method1342();
                                    for (int var80 = 0; var80 < 13; var80++) {
                                        label397: for (int var81 = 0; var81 < 13; var81++) {
                                            int var82 = field515[var79][var80][var81];
                                            if (var82 != -1) {
                                                int var83 = var82 >> 24 & 0x3;
                                                int var84 = var82 >> 1 & 0x3;
                                                int var85 = var82 >> 14 & 0x3FF;
                                                int var86 = var82 >> 3 & 0x7FF;
                                                int var87 = (var85 / 8 << 8) + var86 / 8;
                                                for (int var88 = 0; var88 < Statics.field1662.length; var88++) {
                                                    if (Statics.field1662[var88] == var87 && Statics.field1660[var88] != null) {
                                                        byte[] var89 = Statics.field1660[var88];
                                                        int var90 = var80 * 8;
                                                        int var91 = var81 * 8;
                                                        int var92 = (var85 & 0x7) * 8;
                                                        int var93 = (var86 & 0x7) * 8;
                                                        class94 var94 = Statics.field362;
                                                        class162[] var95 = field513;
                                                        class126 var96 = new class126(var89);
                                                        int var97 = -1;
                                                        while (true) {
                                                            int var98 = var96.method2395();
                                                            if (var98 == 0) {
                                                                continue label397;
                                                            }
                                                            var97 += var98;
                                                            int var99 = 0;
                                                            while (true) {
                                                                int var100 = var96.method2395();
                                                                if (var100 == 0) {
                                                                    break;
                                                                }
                                                                var99 += var100 - 1;
                                                                int var101 = var99 & 0x3F;
                                                                int var102 = var99 >> 6 & 0x3F;
                                                                int var103 = var99 >> 12;
                                                                int var104 = var96.method2399();
                                                                int var105 = var104 >> 2;
                                                                int var106 = var104 & 0x3;
                                                                if (var83 == var103 && var102 >= var92 && var102 < var92 + 8 && var101 >= var93 && var101 < var93 + 8) {
                                                                    class31 var107 = class31.method35(var97);
                                                                    int var108 = var90 + class158.method2072(var102 & 0x7, var101 & 0x7, var84, var107.field808, var107.field814, var106);
                                                                    int var110 = var102 & 0x7;
                                                                    int var111 = var101 & 0x7;
                                                                    int var113 = var107.field808;
                                                                    int var114 = var107.field814;
                                                                    if ((var106 & 0x1) == 1) {
                                                                        int var115 = var113;
                                                                        var113 = var114;
                                                                        var114 = var115;
                                                                    }
                                                                    int var116 = var84 & 0x3;
                                                                    int var117;
                                                                    if (var116 == 0) {
                                                                        var117 = var111;
                                                                    } else if (var116 == 1) {
                                                                        var117 = 7 - var110 - (var113 - 1);
                                                                    } else if (var116 == 2) {
                                                                        var117 = 7 - var111 - (var114 - 1);
                                                                    } else {
                                                                        var117 = var110;
                                                                    }
                                                                    int var118 = var91 + var117;
                                                                    if (var108 > 0 && var118 > 0 && var108 < 103 && var118 < 103) {
                                                                        int var119 = var79;
                                                                        if ((class9.field125[1][var108][var118] & 0x2) == 2) {
                                                                            var119 = var79 - 1;
                                                                        }
                                                                        class162 var120 = null;
                                                                        if (var119 >= 0) {
                                                                            var120 = var95[var119];
                                                                        }
                                                                        class9.method3(var79, var108, var118, var97, var84 + var106 & 0x3, var105, var94, var120);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var79++;
                                }
                            }
                            Statics.method1342();
                            for (int var59 = 0; var59 < 13; var59++) {
                                for (int var60 = 0; var60 < 13; var60++) {
                                    boolean var61 = false;
                                    int var62 = field515[var58][var59][var60];
                                    if (var62 != -1) {
                                        int var63 = var62 >> 24 & 0x3;
                                        int var64 = var62 >> 1 & 0x3;
                                        int var65 = var62 >> 14 & 0x3FF;
                                        int var66 = var62 >> 3 & 0x7FF;
                                        int var67 = (var65 / 8 << 8) + var66 / 8;
                                        for (int var68 = 0; var68 < Statics.field1662.length; var68++) {
                                            if (Statics.field1662[var68] == var67 && Statics.field2030[var68] != null) {
                                                class9.method1521(Statics.field2030[var68], var58, var59 * 8, var60 * 8, var63, (var65 & 0x7) * 8, (var66 & 0x7) * 8, var64, field513);
                                                var61 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var61) {
                                        int var69 = var58;
                                        int var70 = var59 * 8;
                                        int var71 = var60 * 8;
                                        for (int var72 = 0; var72 < 8; var72++) {
                                            for (int var73 = 0; var73 < 8; var73++) {
                                                class9.field145[var69][var70 + var72][var71 + var73] = 0;
                                            }
                                        }
                                        if (var70 > 0) {
                                            for (int var74 = 1; var74 < 8; var74++) {
                                                class9.field145[var69][var70][var71 + var74] = class9.field145[var69][var70 - 1][var71 + var74];
                                            }
                                        }
                                        if (var71 > 0) {
                                            for (int var75 = 1; var75 < 8; var75++) {
                                                class9.field145[var69][var70 + var75][var71] = class9.field145[var69][var70 + var75][var71 - 1];
                                            }
                                        }
                                        if (var70 > 0 && class9.field145[var69][var70 - 1][var71] != 0) {
                                            class9.field145[var69][var70][var71] = class9.field145[var69][var70 - 1][var71];
                                        } else if (var71 > 0 && class9.field145[var69][var70][var71 - 1] != 0) {
                                            class9.field145[var69][var70][var71] = class9.field145[var69][var70][var71 - 1];
                                        } else if (var70 > 0 && var71 > 0 && class9.field145[var69][var70 - 1][var71 - 1] != 0) {
                                            class9.field145[var69][var70][var71] = class9.field145[var69][var70 - 1][var71 - 1];
                                        }
                                    }
                                }
                            }
                            var58++;
                        }
                    }
                    method2298(true);
                    method887();
                    Statics.method1342();
                    class9.method536(Statics.field362, field513);
                    method2298(true);
                    int var121 = class9.field124;
                    if (var121 > Statics.field582) {
                        var121 = Statics.field582;
                    }
                    if (var121 < Statics.field582 - 1) {
                        int var122 = Statics.field582 - 1;
                    }
                    if (field461) {
                        Statics.field362.method1990(class9.field124);
                    } else {
                        Statics.field362.method1990(0);
                    }
                    for (int var123 = 0; var123 < 104; var123++) {
                        for (int var124 = 0; var124 < 104; var124++) {
                            method1327(var123, var124);
                        }
                    }
                    Statics.method1342();
                    method2366();
                    class31.field796.method3185();
                    if (Statics.field843 != null) {
                        field631.method2273(165);
                        field631.method2372(1057001181);
                    }
                    if (!field514) {
                        int var125 = (Statics.field201 - 6) / 8;
                        int var126 = (Statics.field201 + 6) / 8;
                        int var127 = (Statics.field898 - 6) / 8;
                        int var128 = (Statics.field898 + 6) / 8;
                        for (int var129 = var125 - 1; var129 <= var126 + 1; var129++) {
                            for (int var130 = var127 - 1; var130 <= var128 + 1; var130++) {
                                if (var129 < var125 || var129 > var126 || var130 < var127 || var130 > var128) {
                                    Statics.field15.method2977("m" + var129 + "_" + var130);
                                    Statics.field15.method2977("l" + var129 + "_" + var130);
                                }
                            }
                        }
                    }
                    method242(30);
                    Statics.method1342();
                    Statics.field122 = (byte[][][]) null;
                    Statics.field126 = (byte[][][]) null;
                    Statics.field1998 = (byte[][][]) null;
                    Statics.field127 = (byte[][][]) null;
                    Statics.field2039 = (int[][][]) null;
                    Statics.field128 = (byte[][][]) null;
                    Statics.field852 = (int[][]) null;
                    Statics.field129 = null;
                    Statics.field130 = null;
                    Statics.field1250 = null;
                    Statics.field1770 = null;
                    Statics.field2505 = null;
                    field631.method2273(235);
                    class72.method23();
                } else {
                    field512 = 2;
                }
            } else {
                field512 = 1;
            }
        }
        if (field464 == 30) {
            method5();
        } else if (field464 == 40) {
            method207();
        }
    }

    @ObfuscatedName("client.g(I)V")
    public final void method251() {
        boolean var1;
        label123: {
            try {
                if (class137.field2314 == 2) {
                    if (Statics.field2317 == null) {
                        Statics.field2317 = class138.method2656(Statics.field1738, Statics.field2320, Statics.field2295);
                        if (Statics.field2317 == null) {
                            var1 = false;
                            break label123;
                        }
                    }
                    if (Statics.field376 == null) {
                        Statics.field376 = new class57(Statics.field2312, Statics.field2311);
                    }
                    if (Statics.field2313.method2742(Statics.field2317, Statics.field2315, Statics.field376, 22050)) {
                        Statics.field2313.method2699();
                        Statics.field2313.method2666(Statics.field368);
                        Statics.field2313.method2730(Statics.field2317, Statics.field210);
                        class137.field2314 = 0;
                        Statics.field2317 = null;
                        Statics.field376 = null;
                        Statics.field1738 = null;
                        var1 = true;
                        break label123;
                    }
                }
            } catch (Exception var17) {
                var17.printStackTrace();
                Statics.field2313.method2672();
                class137.field2314 = 0;
                Statics.field2317 = null;
                Statics.field376 = null;
                Statics.field1738 = null;
            }
            var1 = false;
        }
        if (var1 && field540 && Statics.field1275 != null) {
            Statics.field1275.method1131();
        }
        if (field1315) {
            Canvas var4 = Statics.field1997;
            var4.removeKeyListener(class74.field1335);
            var4.removeFocusListener(class74.field1335);
            class74.field1354 = -1;
            class76.method1379(Statics.field1997);
            if (Statics.field729 != null) {
                Statics.field729.method1334(Statics.field1997);
            }
            this.method1388();
            Canvas var5 = Statics.field1997;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class74.field1335);
            var5.addFocusListener(class74.field1335);
            Canvas var6 = Statics.field1997;
            var6.addMouseListener(class76.field1387);
            var6.addMouseMotionListener(class76.field1387);
            var6.addFocusListener(class76.field1387);
            if (Statics.field729 != null) {
                Statics.field729.method1323(Statics.field1997);
            }
        }
        if (field464 == 0) {
            class72.method854(class20.field302, class20.field303, (Color) null);
        } else if (field464 == 5) {
            class20.method2300(Statics.field232, Statics.field1816);
        } else if (field464 == 10) {
            class20.method2300(Statics.field232, Statics.field1816);
        } else if (field464 == 20) {
            class20.method2300(Statics.field232, Statics.field1816);
        } else if (field464 == 25) {
            if (field512 == 1) {
                if (field508 > field571) {
                    field571 = field508;
                }
                int var7 = (field571 * 50 - field508 * 50) / field571;
                method205(class133.field2256 + class2.field22 + class2.field35 + var7 + "%" + class2.field20, false);
            } else if (field512 == 2) {
                if (field510 > field511) {
                    field511 = field510;
                }
                int var8 = (field511 * 50 - field510 * 50) / field511 + 50;
                method205(class133.field2256 + class2.field22 + class2.field35 + var8 + "%" + class2.field20, false);
            } else {
                method205(class133.field2256, false);
            }
        } else if (field464 == 30) {
            method660();
        } else if (field464 == 40) {
            method205(class133.field2192 + class2.field22 + class133.field2264, false);
        }
        if (field464 == 30 && field667 == 0 && !field1307) {
            try {
                Graphics var9 = Statics.field1997.getGraphics();
                for (int var10 = 0; var10 < field658; var10++) {
                    if (field661[var10]) {
                        Statics.field1532.method1576(var9, field663[var10], field561[var10], field665[var10], field666[var10]);
                        field661[var10] = false;
                    }
                }
            } catch (Exception var16) {
                Statics.field1997.repaint();
            }
        } else if (field464 > 0) {
            try {
                Graphics var12 = Statics.field1997.getGraphics();
                Statics.field1532.method1584(var12, 0, 0);
                field1307 = false;
                for (int var13 = 0; var13 < field658; var13++) {
                    field661[var13] = false;
                }
            } catch (Exception var15) {
                Statics.field1997.repaint();
            }
        }
    }

    @ObfuscatedName("client.q(I)V")
    public final void method392() {
        if (Statics.field194 != null) {
            Statics.field194.field241 = false;
        }
        Statics.field194 = null;
        if (Statics.field1012 != null) {
            Statics.field1012.method1350();
            Statics.field1012 = null;
        }
        class74.method157();
        class76.method9();
        Statics.field729 = null;
        if (Statics.field1275 != null) {
            Statics.field1275.method1133();
        }
        if (Statics.field1322 != null) {
            Statics.field1322.method1133();
        }
        if (Statics.field2475 != null) {
            Statics.field2475.method1350();
        }
        class155.method1207();
        try {
            class81.field1421.method577();
            for (int var1 = 0; var1 < Statics.field133; var1++) {
                Statics.field910[var1].method577();
            }
            class81.field1419.method577();
            class81.field1420.method577();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("h.w(IB)V")
    public static void method242(int arg0) {
        if (field464 == arg0) {
            return;
        }
        if (field464 == 0) {
            Statics.field1008 = null;
            Statics.field2023 = null;
            Statics.field1964 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field588 = 0;
            field669 = 0;
            field668 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field1907 != null) {
            Statics.field1907.method1350();
            Statics.field1907 = null;
        }
        if (field464 == 25) {
            field512 = 0;
            field508 = 0;
            field571 = 1;
            field510 = 0;
            field511 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class20.method142(Statics.field1997, Statics.field85, Statics.field1000);
        } else {
            Statics.method220();
        }
        field464 = arg0;
    }

    @ObfuscatedName("client.k(B)V")
    public void method254() {
        if (field464 != 1000) {
            boolean var1 = class151.method2359();
            if (!var1) {
                this.method267();
            }
        }
    }

    @ObfuscatedName("client.v(I)V")
    public void method267() {
        if (class151.field2473 >= 4) {
            this.method1397("js5crc");
            field464 = 1000;
            return;
        }
        if (class151.field2469 >= 4) {
            if (field464 <= 5) {
                this.method1397("js5io");
                field464 = 1000;
                return;
            }
            field485 = 3000;
            class151.field2469 = 3;
        }
        if (--field485 + 1 > 0) {
            return;
        }
        try {
            if (field484 == 0) {
                Statics.field1500 = Statics.field16.method1469(Statics.field142, Statics.field2041);
                field484++;
            }
            if (field484 == 1) {
                if (Statics.field1500.field1399 == 2) {
                    this.method255(-1);
                    return;
                }
                if (Statics.field1500.field1399 == 1) {
                    field484++;
                }
            }
            if (field484 == 2) {
                Statics.field141 = new class69((Socket) Statics.field1500.field1398, Statics.field16);
                class126 var1 = new class126(5);
                var1.method2369(15);
                var1.method2372(5);
                Statics.field141.method1355(var1.field2025, 0, 5);
                field484++;
                Statics.field25 = class120.method2616();
            }
            if (field484 == 3) {
                if (field464 <= 5 || Statics.field141.method1353() > 0) {
                    int var2 = Statics.field141.method1352();
                    if (var2 != 0) {
                        this.method255(var2);
                        return;
                    }
                    field484++;
                } else if (class120.method2616() - Statics.field25 > 30000L) {
                    this.method255(-2);
                    return;
                }
            }
            if (field484 == 4) {
                class69 var3 = Statics.field141;
                boolean var4 = field464 > 20;
                if (Statics.field2475 != null) {
                    try {
                        Statics.field2475.method1350();
                    } catch (Exception var14) {
                    }
                    Statics.field2475 = null;
                }
                Statics.field2475 = var3;
                class151.method2632(var4);
                class151.field2467.field2020 = 0;
                Statics.field1983 = null;
                Statics.field195 = null;
                class151.field2481 = 0;
                while (true) {
                    class153 var6 = (class153) class151.field2482.method3225();
                    if (var6 == null) {
                        while (true) {
                            class153 var7 = (class153) class151.field2472.method3225();
                            if (var7 == null) {
                                if (class151.field2479 != 0) {
                                    try {
                                        class126 var8 = new class126(4);
                                        var8.method2369(4);
                                        var8.method2369(class151.field2479);
                                        var8.method2505(0);
                                        Statics.field2475.method1355(var8.field2025, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2475.method1350();
                                        } catch (Exception var12) {
                                        }
                                        class151.field2469++;
                                        Statics.field2475 = null;
                                    }
                                }
                                class151.field2463 = 0;
                                Statics.field2464 = class120.method2616();
                                Statics.field1500 = null;
                                Statics.field141 = null;
                                field484 = 0;
                                field487 = 0;
                                return;
                            }
                            class151.field2462.method3202(var7);
                            class151.field2470.method3223(var7, var7.field2758);
                            class151.field2471++;
                            class151.field2476--;
                        }
                    }
                    class151.field2465.method3223(var6, var6.field2758);
                    class151.field2466++;
                    class151.field2468--;
                }
            }
        } catch (IOException var15) {
            this.method255(-3);
        }
    }

    @ObfuscatedName("client.o(II)V")
    public void method255(int arg0) {
        Statics.field1500 = null;
        Statics.field141 = null;
        field484 = 0;
        if (Statics.field2298 == Statics.field2041) {
            Statics.field2041 = Statics.field1002;
        } else {
            Statics.field2041 = Statics.field2298;
        }
        field487++;
        if (field487 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field464 <= 5) {
                this.method1397("js5connect_full");
                field464 = 1000;
            } else {
                field485 = 3000;
            }
        } else if (field487 >= 2 && arg0 == 6) {
            this.method1397("js5connect_outofdate");
            field464 = 1000;
        } else if (field487 >= 4) {
            if (field464 <= 5) {
                this.method1397("js5connect");
                field464 = 1000;
            } else {
                field485 = 3000;
            }
        }
    }

    @ObfuscatedName("ad.m(I)V")
    public static void method657() {
        if (field483 == 0) {
            Statics.field362 = new class94(4, 104, 104, class9.field145);
            for (int var0 = 0; var0 < 4; var0++) {
                field513[var0] = new class162(104, 104);
            }
            Statics.field14 = new class85(512, 512);
            class20.field303 = class133.field2069;
            class20.field302 = 5;
            field483 = 20;
        } else if (field483 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class103.field1764[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class94.method1864(var1, 500, 800, 512, 334);
            class20.field303 = class133.field2286;
            class20.field302 = 10;
            field483 = 30;
        } else if (field483 == 30) {
            Statics.field257 = method219(0, false, true, true);
            Statics.field741 = method219(1, false, true, true);
            Statics.field240 = method219(2, true, false, true);
            Statics.field79 = method219(3, false, true, true);
            Statics.field111 = method219(4, false, true, true);
            Statics.field15 = method219(5, true, true, true);
            Statics.field488 = method219(6, true, true, false);
            Statics.field1296 = method219(7, false, true, true);
            Statics.field1000 = method219(8, false, true, true);
            Statics.field64 = method219(9, false, true, true);
            Statics.field85 = method219(10, false, true, true);
            Statics.field26 = method219(11, false, true, true);
            Statics.field260 = method219(12, false, true, true);
            Statics.field1283 = method219(13, true, false, true);
            Statics.field1366 = method219(14, false, true, false);
            Statics.field1318 = method219(15, false, true, true);
            class20.field303 = class133.field2259;
            class20.field302 = 20;
            field483 = 40;
        } else if (field483 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field257.method2994() * 4 / 100;
            int var8 = var7 + Statics.field741.method2994() * 4 / 100;
            int var9 = var8 + Statics.field240.method2994() * 2 / 100;
            int var10 = var9 + Statics.field79.method2994() * 2 / 100;
            int var11 = var10 + Statics.field111.method2994() * 6 / 100;
            int var12 = var11 + Statics.field15.method2994() * 4 / 100;
            int var13 = var12 + Statics.field488.method2994() * 2 / 100;
            int var14 = var13 + Statics.field1296.method2994() * 60 / 100;
            int var15 = var14 + Statics.field1000.method2994() * 2 / 100;
            int var16 = var15 + Statics.field64.method2994() * 2 / 100;
            int var17 = var16 + Statics.field85.method2994() * 2 / 100;
            int var18 = var17 + Statics.field26.method2994() * 2 / 100;
            int var19 = var18 + Statics.field260.method2994() * 2 / 100;
            int var20 = var19 + Statics.field1283.method2994() * 2 / 100;
            int var21 = var20 + Statics.field1366.method2994() * 2 / 100;
            int var22 = var21 + Statics.field1318.method2994() * 2 / 100;
            if (var22 == 100) {
                class20.field303 = class133.field2073;
                class20.field302 = 30;
                field483 = 45;
            } else {
                if (var22 != 0) {
                    class20.field303 = class133.field2072 + var22 + "%";
                }
                class20.field302 = 30;
            }
        } else if (field483 == 45) {
            boolean var23 = !field461;
            Statics.field1091 = 22050;
            Statics.field2033 = var23;
            Statics.field2306 = 2;
            class140 var24 = new class140();
            var24.method2674(9, 128);
            Statics.field1275 = class51.method1336(Statics.field16, Statics.field1997, 0, 22050);
            Statics.field1275.method1128(var24);
            class152 var25 = Statics.field1318;
            class152 var26 = Statics.field1366;
            class152 var27 = Statics.field111;
            Statics.field2315 = var25;
            Statics.field2311 = var26;
            Statics.field2312 = var27;
            Statics.field2313 = var24;
            Statics.field1322 = class51.method1336(Statics.field16, Statics.field1997, 1, 2048);
            Statics.field2415 = new class45();
            Statics.field1322.method1128(Statics.field2415);
            Statics.field1533 = new class61(22050, Statics.field1091);
            class20.field303 = class133.field2170;
            class20.field302 = 35;
            field483 = 50;
        } else if (field483 == 50) {
            int var28 = 0;
            if (Statics.field1816 == null) {
                Statics.field1816 = class83.method2279(Statics.field1000, Statics.field1283, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field1259 == null) {
                Statics.field1259 = class83.method2279(Statics.field1000, Statics.field1283, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field232 == null) {
                Statics.field232 = class83.method2279(Statics.field1000, Statics.field1283, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class20.field303 = class133.field2075 + var28 * 100 / 3 + "%";
                class20.field302 = 40;
            } else {
                class20.field303 = class133.field2076;
                class20.field302 = 40;
                field483 = 60;
            }
        } else if (field483 == 60) {
            int var29 = class20.method162(Statics.field85, Statics.field1000);
            int var30 = class20.method131();
            if (var29 < var30) {
                class20.field303 = class133.field2285 + var29 * 100 / var30 + "%";
                class20.field302 = 50;
            } else {
                class20.field303 = class133.field2078;
                class20.field302 = 50;
                method242(5);
                field483 = 70;
            }
        } else if (field483 == 70) {
            if (Statics.field240.method2938()) {
                class152 var31 = Statics.field240;
                Statics.field927 = var31;
                class152 var32 = Statics.field240;
                Statics.field2660 = var32;
                class152 var33 = Statics.field240;
                class152 var34 = Statics.field1296;
                Statics.field909 = var33;
                Statics.field904 = var34;
                Statics.field905 = Statics.field909.method2913(3);
                class152 var35 = Statics.field240;
                class152 var36 = Statics.field1296;
                boolean var37 = field461;
                Statics.field793 = var35;
                Statics.field794 = var36;
                class31.field833 = var37;
                Statics.method115(Statics.field240, Statics.field1296);
                class152 var38 = Statics.field240;
                class152 var39 = Statics.field1296;
                boolean var40 = field624;
                class181 var41 = Statics.field1816;
                Statics.field987 = var38;
                Statics.field956 = var39;
                Statics.field1740 = var40;
                Statics.field987.method2913(10);
                Statics.field2504 = var41;
                class152 var42 = Statics.field240;
                class152 var43 = Statics.field257;
                class152 var44 = Statics.field741;
                Statics.field873 = var42;
                Statics.field857 = var43;
                Statics.field870 = var44;
                class152 var45 = Statics.field240;
                class152 var46 = Statics.field1296;
                Statics.field881 = var45;
                Statics.field879 = var46;
                class152 var47 = Statics.field240;
                Statics.field940 = var47;
                class152 var48 = Statics.field240;
                Statics.field1016 = var48;
                Statics.field1015 = Statics.field1016.method2913(16);
                class152 var49 = Statics.field79;
                class152 var50 = Statics.field1296;
                class152 var51 = Statics.field1000;
                class152 var52 = Statics.field1283;
                Statics.field2656 = var49;
                Statics.field2537 = var50;
                Statics.field2521 = var51;
                Statics.field2522 = var52;
                Statics.field2592 = new class156[Statics.field2656.method2923()][];
                Statics.field1982 = new boolean[Statics.field2656.method2923()];
                class152 var53 = Statics.field240;
                Statics.field1911 = var53;
                class38.method116(Statics.field240);
                class20.field303 = class133.field2080;
                class20.field302 = 60;
                field483 = 80;
            } else {
                class20.field303 = class133.field2217 + Statics.field240.method3000() + "%";
                class20.field302 = 60;
            }
        } else if (field483 == 80) {
            int var54 = 0;
            if (Statics.field1205 == null) {
                Statics.field1205 = class83.method1333(Statics.field1000, "compass", "");
            } else {
                var54++;
            }
            if (Statics.field1914 == null) {
                Statics.field1914 = class83.method1333(Statics.field1000, "mapedge", "");
            } else {
                var54++;
            }
            if (Statics.field1382 == null) {
                Statics.field1382 = class83.method1381(Statics.field1000, "mapscene", "");
            } else {
                var54++;
            }
            if (Statics.field2658 == null) {
                Statics.field2658 = class83.method134(Statics.field1000, "mapfunction", "");
            } else {
                var54++;
            }
            if (Statics.field78 == null) {
                Statics.field78 = class83.method134(Statics.field1000, "hitmarks", "");
            } else {
                var54++;
            }
            if (Statics.field1652 == null) {
                Statics.field1652 = class83.method134(Statics.field1000, "headicons_pk", "");
            } else {
                var54++;
            }
            if (Statics.field1913 == null) {
                Statics.field1913 = class83.method134(Statics.field1000, "headicons_prayer", "");
            } else {
                var54++;
            }
            if (Statics.field247 == null) {
                Statics.field247 = class83.method134(Statics.field1000, "headicons_hint", "");
            } else {
                var54++;
            }
            if (Statics.field1253 == null) {
                Statics.field1253 = class83.method134(Statics.field1000, "mapmarker", "");
            } else {
                var54++;
            }
            if (Statics.field242 == null) {
                Statics.field242 = class83.method134(Statics.field1000, "cross", "");
            } else {
                var54++;
            }
            if (Statics.field143 == null) {
                Statics.field143 = class83.method134(Statics.field1000, "mapdots", "");
            } else {
                var54++;
            }
            if (Statics.field1995 == null) {
                Statics.field1995 = class83.method1381(Statics.field1000, "scrollbar", "");
            } else {
                var54++;
            }
            if (Statics.field478 == null) {
                Statics.field478 = class83.method1381(Statics.field1000, "mod_icons", "");
            } else {
                var54++;
            }
            if (Statics.field851 == null) {
                Statics.field851 = class83.method1608(Statics.field1000, "mapback", "");
            } else {
                var54++;
            }
            if (var54 < 14) {
                class20.field303 = class133.field2081 + var54 * 100 / 14 + "%";
                class20.field302 = 70;
            } else {
                Statics.field2786 = Statics.field478;
                Statics.field1914.method1725();
                int var55 = (int) (Math.random() * 21.0D) - 10;
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 41.0D) - 20;
                for (int var59 = 0; var59 < Statics.field2658.length; var59++) {
                    Statics.field2658[var59].method1645(var55 + var58, var56 + var58, var57 + var58);
                }
                Statics.field1382[0].method1737(var55 + var58, var56 + var58, var57 + var58);
                method2631();
                class20.field303 = class133.field2064;
                class20.field302 = 70;
                field483 = 90;
            }
        } else if (field483 == 90) {
            if (Statics.field64.method2938()) {
                class109 var60 = new class109(Statics.field64, Statics.field1000, 20, 0.8D, field461 ? 64 : 128);
                class103.method2084(var60);
                class103.method2098(0.8D);
                class20.field303 = class133.field2110;
                class20.field302 = 90;
                field483 = 110;
            } else {
                class20.field303 = class133.field2218 + Statics.field64.method3000() + "%";
                class20.field302 = 90;
            }
        } else if (field483 == 110) {
            Statics.field194 = new class15();
            Statics.field16.method1455(Statics.field194, 10);
            class20.field303 = class133.field2085;
            class20.field302 = 94;
            field483 = 120;
        } else if (field483 == 120) {
            if (Statics.field85.method2921("huffman", "")) {
                class119 var61 = new class119(Statics.field85.method2904("huffman", ""));
                class182.method1392(var61);
                class20.field303 = class133.field2232;
                class20.field302 = 96;
                field483 = 130;
            } else {
                class20.field303 = class133.field2086 + "%";
                class20.field302 = 96;
            }
        } else if (field483 == 130) {
            if (!Statics.field79.method2938()) {
                class20.field303 = class133.field2088 + Statics.field79.method3000() * 4 / 5 + "%";
                class20.field302 = 100;
            } else if (!Statics.field260.method2938()) {
                class20.field303 = class133.field2088 + (80 + Statics.field260.method3000() / 6) + "%";
                class20.field302 = 100;
            } else if (Statics.field1283.method2938()) {
                class20.field303 = class133.field2089;
                class20.field302 = 100;
                field483 = 140;
            } else {
                class20.field303 = class133.field2088 + (96 + Statics.field1283.method3000() / 20) + "%";
                class20.field302 = 100;
            }
        } else if (field483 == 140) {
            method242(10);
        }
    }

    @ObfuscatedName("a.u(IZZZB)Led;")
    public static class152 method219(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1421 != null) {
            var4 = new class70(arg0, class81.field1421, Statics.field910[arg0], 1000000);
        }
        return new class152(var4, Statics.field1258, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ec.r(I)V")
    public static void method2631() {
        Statics.field2517 = new int[33];
        Statics.field27 = new int[33];
        Statics.field1781 = new int[151];
        Statics.field1503 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field851.field1465[Statics.field851.field1466 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field2517[var0] = var1;
            Statics.field27[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field851.field1465[Statics.field851.field1466 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field1781[var4 - 5] = var5 - 25;
            Statics.field1503[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("t.d(I)V")
    public static final void method207() {
        try {
            if (field588 == 0) {
                if (Statics.field1012 != null) {
                    Statics.field1012.method1350();
                    Statics.field1012 = null;
                }
                Statics.field2359 = null;
                field506 = false;
                field669 = 0;
                field588 = 1;
            }
            if (field588 == 1) {
                if (Statics.field2359 == null) {
                    Statics.field2359 = Statics.field16.method1469(Statics.field142, Statics.field2041);
                }
                if (Statics.field2359.field1399 == 2) {
                    throw new IOException();
                }
                if (Statics.field2359.field1399 == 1) {
                    Statics.field1012 = new class69((Socket) Statics.field2359.field1398, Statics.field16);
                    Statics.field2359 = null;
                    field588 = 2;
                }
            }
            if (field588 == 2) {
                field631.field2020 = 0;
                field631.method2369(14);
                Statics.field1012.method1355(field631.field2025, 0, 1);
                field497.field2020 = 0;
                field588 = 3;
            }
            if (field588 == 3) {
                if (Statics.field1275 != null) {
                    Statics.field1275.method1130();
                }
                if (Statics.field1322 != null) {
                    Statics.field1322.method1130();
                }
                int var0 = Statics.field1012.method1352();
                if (Statics.field1275 != null) {
                    Statics.field1275.method1130();
                }
                if (Statics.field1322 != null) {
                    Statics.field1322.method1130();
                }
                if (var0 != 0) {
                    method199(var0);
                    return;
                }
                field497.field2020 = 0;
                field588 = 5;
            }
            if (field588 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field631.field2020 = 0;
                field631.method2369(10);
                field631.method2372(var1[0]);
                field631.method2372(var1[1]);
                field631.method2372(var1[2]);
                field631.method2372(var1[3]);
                field631.method2537(0L);
                field631.method2374(class20.field320);
                field631.method2400(class6.field88, class6.field84);
                field679.field2020 = 0;
                if (field464 == 40) {
                    field679.method2369(18);
                } else {
                    field679.method2369(16);
                }
                field679.method2505(0);
                int var2 = field679.field2020;
                field679.method2372(5);
                field679.method2376(field631.field2025, 0, field631.field2020);
                int var3 = field679.field2020;
                field679.method2374(class20.field308);
                field679.method2369(field461 ? 1 : 0);
                class115 var4 = field679;
                byte[] var5 = new byte[24];
                try {
                    class81.field1420.method583(0L);
                    class81.field1420.method570(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var21) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2376(var5, 0, 24);
                field679.method2372(Statics.field257.field2456);
                field679.method2372(Statics.field741.field2456);
                field679.method2372(Statics.field240.field2456);
                field679.method2372(Statics.field79.field2456);
                field679.method2372(Statics.field111.field2456);
                field679.method2372(Statics.field15.field2456);
                field679.method2372(Statics.field488.field2456);
                field679.method2372(Statics.field1296.field2456);
                field679.method2372(Statics.field1000.field2456);
                field679.method2372(Statics.field64.field2456);
                field679.method2372(Statics.field85.field2456);
                field679.method2372(Statics.field26.field2456);
                field679.method2372(Statics.field260.field2456);
                field679.method2372(Statics.field1283.field2456);
                field679.method2372(Statics.field1366.field2456);
                field679.method2372(Statics.field1318.field2456);
                field679.method2398(var1, var3, field679.field2020);
                field679.method2373(field679.field2020 - var2);
                Statics.field1012.method1355(field679.field2025, 0, field679.field2020);
                field631.method2252(var1);
                for (int var9 = 0; var9 < 4; var9++) {
                    var1[var9] += 50;
                }
                field497.method2252(var1);
                field588 = 6;
            }
            if (field588 == 6 && Statics.field1012.method1353() > 0) {
                int var10 = Statics.field1012.method1352();
                if (var10 == 21 && field464 == 20) {
                    field588 = 7;
                } else if (var10 == 2) {
                    field588 = 9;
                } else if (var10 == 15 && field464 == 40) {
                    field631.field2020 = 0;
                    field497.field2020 = 0;
                    field499 = -1;
                    field503 = -1;
                    field504 = -1;
                    field505 = -1;
                    field498 = 0;
                    field517 = 0;
                    field533 = 0;
                    field637 = 0;
                    field599 = false;
                    field690 = 0;
                    field466 = 0;
                    for (int var11 = 0; var11 < field576.length; var11++) {
                        if (field576[var11] != null) {
                            field576[var11].field411 = -1;
                        }
                    }
                    for (int var12 = 0; var12 < field492.length; var12++) {
                        if (field492[var12] != null) {
                            field492[var12].field411 = -1;
                        }
                    }
                    class18.method1520();
                    method242(30);
                    for (int var13 = 0; var13 < 100; var13++) {
                        field660[var13] = true;
                    }
                    return;
                } else if (var10 == 23 && field668 < 1) {
                    field668++;
                    field588 = 0;
                } else {
                    method199(var10);
                    return;
                }
            }
            if (field588 == 7 && Statics.field1012.method1353() > 0) {
                field491 = (Statics.field1012.method1352() + 3) * 60;
                field588 = 8;
            }
            if (field588 == 8) {
                field669 = 0;
                class20.method2883(class133.field2090, class133.field2091, field491 / 60 + class133.field2269);
                if (--field491 <= 0) {
                    field588 = 0;
                }
            } else {
                if (field588 == 9 && Statics.field1012.method1353() >= 8) {
                    field609 = Statics.field1012.method1352();
                    field625 = Statics.field1012.method1352() == 1;
                    field583 = Statics.field1012.method1352();
                    field583 <<= 0x8;
                    field583 += Statics.field1012.method1352();
                    field584 = Statics.field1012.method1352();
                    Statics.field1012.method1354(field497.field2025, 0, 1);
                    field497.field2020 = 0;
                    field499 = field497.method2254();
                    Statics.field1012.method1354(field497.field2025, 0, 2);
                    field497.field2020 = 0;
                    field498 = field497.method2405();
                    if (field584 == 1) {
                        try {
                            client var14 = Statics.field456;
                            JSObject.getWindow(var14).call("zap", (Object[]) null);
                        } catch (Throwable var20) {
                        }
                    } else {
                        try {
                            client var16 = Statics.field456;
                            JSObject.getWindow(var16).call("unzap", (Object[]) null);
                        } catch (Throwable var19) {
                        }
                    }
                    field588 = 10;
                }
                if (field588 != 10) {
                    field669++;
                    if (field669 > 2000) {
                        if (field668 < 1) {
                            if (Statics.field2298 == Statics.field2041) {
                                Statics.field2041 = Statics.field1002;
                            } else {
                                Statics.field2041 = Statics.field2298;
                            }
                            field668++;
                            field588 = 0;
                        } else {
                            method199(-3);
                        }
                    }
                } else if (Statics.field1012.method1353() >= field498) {
                    field497.field2020 = 0;
                    Statics.field1012.method1354(field497.field2025, 0, field498);
                    method1997();
                    Statics.field201 = -1;
                    method2246(false);
                    field499 = -1;
                }
            }
        } catch (IOException var22) {
            if (field668 < 1) {
                if (Statics.field2298 == Statics.field2041) {
                    Statics.field2041 = Statics.field1002;
                } else {
                    Statics.field2041 = Statics.field2298;
                }
                field668++;
                field588 = 0;
            } else {
                method199(-2);
            }
        }
    }

    @ObfuscatedName("ce.n(I)V")
    public static void method1997() {
        field467 = 0L;
        field594 = 0;
        Statics.field194.field243 = 0;
        Statics.field66 = true;
        field500 = true;
        class180.field2774 = new class175();
        field631.field2020 = 0;
        field497.field2020 = 0;
        field499 = -1;
        field503 = -1;
        field504 = -1;
        field505 = -1;
        field517 = 0;
        field533 = 0;
        field502 = 0;
        field696 = 0;
        field637 = 0;
        field599 = false;
        class76.field1373 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field671[var0] = null;
        }
        field496 = 0;
        field551 = 0;
        field613 = false;
        field619 = 0;
        field522 = (int) (Math.random() * 100.0D) - 50;
        field524 = (int) (Math.random() * 110.0D) - 55;
        field581 = (int) (Math.random() * 80.0D) - 40;
        field529 = (int) (Math.random() * 120.0D) - 60;
        field531 = (int) (Math.random() * 30.0D) - 20;
        field543 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field690 = 0;
        field683 = -1;
        field466 = 0;
        field689 = 0;
        field577 = 0;
        field493 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field576[var1] = null;
            field555[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field492[var2] = null;
        }
        Statics.field244 = field576[2047] = new class3();
        field460.method3255();
        field458.method3255();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field589[var3][var4][var5] = null;
                }
            }
        }
        field592 = new class175();
        field717 = 0;
        field546 = 0;
        for (int var6 = 0; var6 < Statics.field1015; var6++) {
            class41 var7 = class41.method125(var6);
            if (var7 != null && var7.field1017 == 0) {
                class157.field2646[var6] = 0;
                class157.field2647[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field651.length; var8++) {
            field651[var8] = -1;
        }
        if (field617 != -1) {
            int var9 = field617;
            if (var9 != -1 && Statics.field1982[var9]) {
                Statics.field2656.method2901(var9);
                if (Statics.field2592[var9] != null) {
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field2592[var9].length; var11++) {
                        if (Statics.field2592[var9][var11] != null) {
                            if (Statics.field2592[var9][var11].field2530 == 2) {
                                var10 = false;
                            } else {
                                Statics.field2592[var9][var11] = null;
                            }
                        }
                    }
                    if (var10) {
                        Statics.field2592[var9] = null;
                    }
                    Statics.field1982[var9] = false;
                }
            }
        }
        for (class4 var12 = (class4) field618.method3225(); var12 != null; var12 = (class4) field618.method3230()) {
            method138(var12, true);
        }
        field617 = -1;
        field618 = new class173(8);
        field621 = null;
        field599 = false;
        field637 = 0;
        field657.method3126((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field565[var13] = null;
            field713[var13] = false;
        }
        class18.method1520();
        field465 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field660[var14] = true;
        }
        field681 = null;
        Statics.field1228 = 0;
        Statics.field1276 = null;
    }

    @ObfuscatedName("b.b(IB)V")
    public static void method199(int arg0) {
        if (arg0 == -3) {
            class20.method2883(class133.field2093, class133.field2094, class133.field2095);
        } else if (arg0 == -2) {
            class20.method2883(class133.field2111, class133.field2097, class133.field2098);
        } else if (arg0 == -1) {
            class20.method2883(class133.field2184, class133.field2194, class133.field2101);
        } else if (arg0 == 3) {
            class20.method2883(class133.field2102, class133.field2103, class133.field2070);
        } else if (arg0 == 4) {
            class20.method2883(class133.field2196, class133.field2083, class133.field2107);
        } else if (arg0 == 5) {
            class20.method2883(class133.field2108, class133.field2109, class133.field2077);
        } else if (arg0 == 6) {
            class20.method2883(class133.field2274, class133.field2112, class133.field2216);
        } else if (arg0 == 7) {
            class20.method2883(class133.field2114, class133.field2100, class133.field2203);
        } else if (arg0 == 8) {
            class20.method2883(class133.field2117, class133.field2118, class133.field2223);
        } else if (arg0 == 9) {
            class20.method2883(class133.field2120, class133.field2239, class133.field2122);
        } else if (arg0 == 10) {
            class20.method2883(class133.field2123, class133.field2124, class133.field2125);
        } else if (arg0 == 11) {
            class20.method2883(class133.field2126, class133.field2116, class133.field2128);
        } else if (arg0 == 12) {
            class20.method2883(class133.field2129, class133.field2082, class133.field2197);
        } else if (arg0 == 13) {
            class20.method2883(class133.field2132, class133.field2133, class133.field2134);
        } else if (arg0 == 14) {
            class20.method2883(class133.field2154, class133.field2136, class133.field2137);
        } else if (arg0 == 16) {
            class20.method2883(class133.field2138, class133.field2139, class133.field2140);
        } else if (arg0 == 17) {
            class20.method2883(class133.field2141, class133.field2142, class133.field2143);
        } else if (arg0 == 18) {
            class20.method2883(class133.field2144, class133.field2145, class133.field2146);
        } else if (arg0 == 19) {
            class20.method2883(class133.field2147, class133.field2148, class133.field2149);
        } else if (arg0 == 20) {
            class20.method2883(class133.field2130, class133.field2151, class133.field2152);
        } else if (arg0 == 22) {
            class20.method2883(class133.field2153, class133.field2161, class133.field2155);
        } else if (arg0 == 23) {
            class20.method2883(class133.field2156, class133.field2150, class133.field2158);
        } else if (arg0 == 24) {
            class20.method2883(class133.field2254, class133.field2160, class133.field2099);
        } else if (arg0 == 25) {
            class20.method2883(class133.field2162, class133.field2163, class133.field2222);
        } else if (arg0 == 26) {
            class20.method2883(class133.field2165, class133.field2166, class133.field2167);
        } else if (arg0 == 27) {
            class20.method2883(class133.field2168, class133.field2169, class133.field2248);
        } else if (arg0 == 31) {
            class20.method2883(class133.field2177, class133.field2178, class133.field2066);
        } else if (arg0 == 32) {
            class20.method2883(class133.field2180, class133.field2181, class133.field2182);
        } else if (arg0 == 37) {
            class20.method2883(class133.field2183, class133.field2131, class133.field2185);
        } else if (arg0 == 38) {
            class20.method2883(class133.field2186, class133.field2187, class133.field2283);
        } else if (arg0 == 55) {
            class20.method2883(class133.field2189, class133.field2190, class133.field2287);
        } else {
            class20.method2883(class133.field2115, class133.field2193, class133.field2119);
        }
        method242(10);
    }

    @ObfuscatedName("e.p(I)V")
    public static final void method36() {
        if (Statics.field1012 != null) {
            Statics.field1012.method1350();
            Statics.field1012 = null;
        }
        method887();
        Statics.field362.method1829();
        for (int var0 = 0; var0 < 4; var0++) {
            field513[var0].method3134();
        }
        System.gc();
        class137.method1825(2);
        field692 = -1;
        field540 = false;
        class7.method874();
        method242(10);
    }

    @ObfuscatedName("ag.t(I)V")
    public static final void method887() {
        class36.field919.method3185();
        class32.method1348();
        class35.method1244();
        class31.field795.method3185();
        class31.field796.method3185();
        class31.field816.method3185();
        class31.field798.method3185();
        class30.field756.method3185();
        class30.field780.method3185();
        class39.method800();
        class33.field859.method3185();
        class33.field860.method3185();
        class34.method1447();
        class37.method661();
        class41.field1019.method3185();
        class161.field2671.method3185();
        class156.field2556.method3185();
        class156.field2524.method3185();
        class156.field2519.method3185();
        ((class109) Statics.field1761).method2153();
        class5.field71.method3185();
        Statics.field257.method2916();
        Statics.field741.method2916();
        Statics.field79.method2916();
        Statics.field111.method2916();
        Statics.field15.method2916();
        Statics.field488.method2916();
        Statics.field1296.method2916();
        Statics.field1000.method2916();
        Statics.field64.method2916();
        Statics.field85.method2916();
        Statics.field26.method2916();
        Statics.field260.method2916();
    }

    @ObfuscatedName("h.l(I)V")
    public static final void method231() {
        if (field502 > 0) {
            method36();
        } else {
            method242(40);
            Statics.field1907 = Statics.field1012;
            Statics.field1012 = null;
        }
    }

    @ObfuscatedName("y.a(I)V")
    public static final void method5() {
        if (field533 > 1) {
            field533--;
        }
        if (field502 > 0) {
            field502--;
        }
        if (field506) {
            field506 = false;
            method231();
            return;
        }
        for (int var0 = 0; var0 < 100 && method120(); var0++) {
        }
        if (field464 != 30) {
            return;
        }
        class180.method1612(field631, 204);
        Object var1 = Statics.field194.field236;
        synchronized (Statics.field194.field236) {
            if (!field457) {
                Statics.field194.field243 = 0;
            } else if (class76.field1384 != 0 || Statics.field194.field243 >= 40) {
                field631.method2273(250);
                field631.method2369(0);
                int var2 = field631.field2020;
                int var3 = 0;
                for (int var4 = 0; var4 < Statics.field194.field243 && field631.field2020 - var2 < 240; var4++) {
                    var3++;
                    int var5 = Statics.field194.field239[var4];
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > 502) {
                        var5 = 502;
                    }
                    int var6 = Statics.field194.field238[var4];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 764) {
                        var6 = 764;
                    }
                    int var7 = var5 * 765 + var6;
                    if (Statics.field194.field239[var4] == -1 && Statics.field194.field238[var4] == -1) {
                        var6 = -1;
                        var5 = -1;
                        var7 = 524287;
                    }
                    if (field468 != var6 || field469 != var5) {
                        int var8 = var6 - field468;
                        field468 = var6;
                        int var9 = var5 - field469;
                        field469 = var5;
                        if (field594 < 8 && var8 >= -32 && var8 <= 31 && var9 >= -32 && var9 <= 31) {
                            var8 += 32;
                            var9 += 32;
                            field631.method2505((field594 << 12) + (var8 << 6) + var9);
                            field594 = 0;
                        } else if (field594 < 8) {
                            field631.method2371((field594 << 19) + 8388608 + var7);
                            field594 = 0;
                        } else {
                            field631.method2372((field594 << 19) + -1073741824 + var7);
                            field594 = 0;
                        }
                    } else if (field594 < 2047) {
                        field594++;
                    }
                }
                field631.method2379(field631.field2020 - var2);
                if (var3 >= Statics.field194.field243) {
                    Statics.field194.field243 = 0;
                } else {
                    Statics.field194.field243 -= var3;
                    for (int var10 = 0; var10 < Statics.field194.field243; var10++) {
                        Statics.field194.field238[var10] = Statics.field194.field238[var3 + var10];
                        Statics.field194.field239[var10] = Statics.field194.field239[var3 + var10];
                    }
                }
            }
        }
        if (class76.field1384 != 0) {
            long var12 = (class76.field1389 * 760883483108600027L - field467) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            field467 = class76.field1389 * 760883483108600027L;
            int var14 = class76.field1383;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class76.field1386;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            if (class76.field1384 == 2) {
                var17 = 1;
            }
            int var18 = (int) var12;
            field631.method2273(49);
            field631.method2421((var17 << 19) + (var18 << 20) + var16);
        }
        if (field489 > 0) {
            field489--;
        }
        if (class74.field1341[96] || class74.field1341[97] || class74.field1341[98] || class74.field1341[99]) {
            field547 = true;
        }
        if (field547 && field489 <= 0) {
            field489 = 20;
            field547 = false;
            field631.method2273(50);
            field631.method2579(field542);
            field631.method2412(field543);
        }
        if (Statics.field66 && !field500) {
            field500 = true;
            field631.method2273(77);
            field631.method2369(1);
        }
        if (!Statics.field66 && field500) {
            field500 = false;
            field631.method2273(77);
            field631.method2369(0);
        }
        if (field461 && Statics.field582 != field507) {
            method2882(Statics.field201, Statics.field898, Statics.field582, Statics.field244.field409[0], Statics.field244.field446[0]);
        } else if (Statics.field582 != field683) {
            field683 = Statics.field582;
            method100(Statics.field582);
        }
        if (field464 != 30) {
            return;
        }
        for (class21 var19 = (class21) field592.method3279(); var19 != null; var19 = (class21) field592.method3249()) {
            if (var19.field333 > 0) {
                var19.field333--;
            }
            if (var19.field333 != 0) {
                if (var19.field332 > 0) {
                    var19.field332--;
                }
                if (var19.field332 == 0 && var19.field337 >= 1 && var19.field322 >= 1 && var19.field337 <= 102 && var19.field322 <= 102 && (var19.field329 < 0 || class9.method2283(var19.field329, var19.field331))) {
                    method136(var19.field324, var19.field339, var19.field337, var19.field322, var19.field329, var19.field330, var19.field331);
                    var19.field332 = -1;
                    if (var19.field329 == var19.field326 && var19.field326 == -1) {
                        var19.method3289();
                    } else if (var19.field329 == var19.field326 && var19.field330 == var19.field323 && var19.field331 == var19.field328) {
                        var19.method3289();
                    }
                }
            } else if (var19.field326 < 0 || class9.method2283(var19.field326, var19.field328)) {
                method136(var19.field324, var19.field339, var19.field337, var19.field322, var19.field326, var19.field323, var19.field328);
                var19.method3289();
            }
        }
        method218();
        field517++;
        if (field517 > 750) {
            method231();
            return;
        }
        method4();
        for (int var20 = 0; var20 < field493; var20++) {
            int var21 = field494[var20];
            class24 var22 = field492[var21];
            if (var22 != null) {
                method160(var22, var22.field379.field760);
            }
        }
        for (int var23 = -1; var23 < field577; var23++) {
            int var24;
            if (var23 == -1) {
                var24 = 2047;
            } else {
                var24 = field578[var23];
            }
            class3 var25 = field576[var24];
            if (var25 != null && var25.field407 > 0) {
                var25.field407--;
                if (var25.field407 == 0) {
                    var25.field406 = null;
                }
            }
        }
        for (int var26 = 0; var26 < field493; var26++) {
            int var27 = field494[var26];
            class24 var28 = field492[var27];
            if (var28 != null && var28.field407 > 0) {
                var28.field407--;
                if (var28.field407 == 0) {
                    var28.field406 = null;
                }
            }
        }
        field534++;
        if (field586 != 0) {
            field549 += 20;
            if (field549 >= 400) {
                field586 = 0;
            }
        }
        if (Statics.field1364 != null) {
            field567++;
            if (field567 >= 15) {
                method1345(Statics.field1364);
                Statics.field1364 = null;
            }
        }
        if (Statics.field1916 != null) {
            method1345(Statics.field1916);
            field610++;
            if (class76.field1378 > field526 + 5 || class76.field1378 < field526 - 5 || class76.field1379 > field705 + 5 || class76.field1379 < field705 - 5) {
                field573 = true;
            }
            if (class76.field1377 == 0) {
                if (field573 && field610 >= 5) {
                    if (Statics.field1980 == Statics.field1916 && field550 != field523) {
                        class156 var29 = Statics.field1916;
                        byte var30 = 0;
                        if (field620 == 1 && var29.field2532 == 206) {
                            var30 = 1;
                        }
                        if (var29.field2630[field523] <= 0) {
                            var30 = 0;
                        }
                        if (class160.method29(method210(var29))) {
                            int var31 = field550;
                            int var32 = field523;
                            var29.field2630[var32] = var29.field2630[var31];
                            var29.field2631[var32] = var29.field2631[var31];
                            var29.field2630[var31] = -1;
                            var29.field2631[var31] = 0;
                        } else if (var30 == 1) {
                            int var33 = field550;
                            int var34 = field523;
                            while (var33 != var34) {
                                if (var33 > var34) {
                                    var29.method3038(var33 - 1, var33);
                                    var33--;
                                } else if (var33 < var34) {
                                    var29.method3038(var33 + 1, var33);
                                    var33++;
                                }
                            }
                        } else {
                            var29.method3038(field523, field550);
                        }
                        field631.method2273(205);
                        field631.method2505(field523);
                        field631.method2420(Statics.field1916.field2528);
                        field631.method2579(field550);
                        field631.method2428(var30);
                    }
                } else if ((field598 == 1 || method593(field637 - 1)) && field637 > 2) {
                    method2247();
                } else if (field637 > 0) {
                    method27(field637 - 1);
                }
                field567 = 10;
                class76.field1384 = 0;
                Statics.field1916 = null;
            }
        }
        class156 var35 = Statics.field447;
        class156 var36 = Statics.field367;
        Statics.field447 = null;
        Statics.field367 = null;
        field632 = null;
        field521 = false;
        field633 = false;
        for (field678 = 0; class74.method504() && field678 < 128; field678++) {
            field680[field678] = Statics.field2319;
            field676[field678] = Statics.field1957;
        }
        method22(field617, 0, 0, 765, 503, 0, 0);
        field640++;
        while (true) {
            class1 var37;
            class156 var38;
            class156 var39;
            do {
                var37 = (class1) field655.method3246();
                if (var37 == null) {
                    while (true) {
                        class1 var40;
                        class156 var41;
                        class156 var42;
                        do {
                            var40 = (class1) field656.method3246();
                            if (var40 == null) {
                                while (true) {
                                    class1 var43;
                                    class156 var44;
                                    class156 var45;
                                    do {
                                        var43 = (class1) field654.method3246();
                                        if (var43 == null) {
                                            if (field471 != null) {
                                                method124();
                                            }
                                            if (class94.field1578 != -1) {
                                                int var46 = class94.field1578;
                                                int var47 = class94.field1573;
                                                boolean var48 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var46, var47, true, 0, 0, 0, 0, 0, 0);
                                                class94.field1578 = -1;
                                                if (var48) {
                                                    field563 = class76.field1386;
                                                    field572 = class76.field1383;
                                                    field586 = 1;
                                                    field549 = 0;
                                                }
                                            }
                                            method209();
                                            if (Statics.field447 != var35) {
                                                if (var35 != null) {
                                                    method1345(var35);
                                                }
                                                if (Statics.field447 != null) {
                                                    method1345(Statics.field447);
                                                }
                                            }
                                            if (Statics.field367 != var36 && field710 == field600) {
                                                if (var36 != null) {
                                                    method1345(var36);
                                                }
                                                if (Statics.field367 != null) {
                                                    method1345(Statics.field367);
                                                }
                                            }
                                            if (Statics.field367 == null) {
                                                if (field710 > 0) {
                                                    field710--;
                                                }
                                            } else if (field710 < field600) {
                                                field710++;
                                                if (field710 == field600) {
                                                    method1345(Statics.field367);
                                                }
                                            }
                                            int var49 = field522 + Statics.field244.field396;
                                            int var50 = field524 + Statics.field244.field394;
                                            if (Statics.field2318 - var49 < -500 || Statics.field2318 - var49 > 500 || Statics.field375 - var50 < -500 || Statics.field375 - var50 > 500) {
                                                Statics.field2318 = var49;
                                                Statics.field375 = var50;
                                            }
                                            if (Statics.field2318 != var49) {
                                                Statics.field2318 += (var49 - Statics.field2318) / 16;
                                            }
                                            if (Statics.field375 != var50) {
                                                Statics.field375 += (var50 - Statics.field375) / 16;
                                            }
                                            if (class74.field1341[96]) {
                                                field544 += (-24 - field544) / 2;
                                            } else if (class74.field1341[97]) {
                                                field544 += (24 - field544) / 2;
                                            } else {
                                                field544 /= 2;
                                            }
                                            if (class74.field1341[98]) {
                                                field495 += (12 - field495) / 2;
                                            } else if (class74.field1341[99]) {
                                                field495 += (-12 - field495) / 2;
                                            } else {
                                                field495 /= 2;
                                            }
                                            field543 = field544 / 2 + field543 & 0x7FF;
                                            field542 += field495 / 2;
                                            if (field542 < 128) {
                                                field542 = 128;
                                            }
                                            if (field542 > 383) {
                                                field542 = 383;
                                            }
                                            int var51 = Statics.field2318 >> 7;
                                            int var52 = Statics.field375 >> 7;
                                            int var53 = method3106(Statics.field2318, Statics.field375, Statics.field582);
                                            int var54 = 0;
                                            if (var51 > 3 && var52 > 3 && var51 < 100 && var52 < 100) {
                                                for (int var55 = var51 - 4; var55 <= var51 + 4; var55++) {
                                                    for (int var56 = var52 - 4; var56 <= var52 + 4; var56++) {
                                                        int var57 = Statics.field582;
                                                        if (var57 < 3 && (class9.field125[1][var55][var56] & 0x2) == 2) {
                                                            var57++;
                                                        }
                                                        int var58 = var53 - class9.field145[var57][var55][var56];
                                                        if (var58 > var54) {
                                                            var54 = var58;
                                                        }
                                                    }
                                                }
                                            }
                                            int var59 = var54 * 192;
                                            if (var59 > 98048) {
                                                var59 = 98048;
                                            }
                                            if (var59 < 32768) {
                                                var59 = 32768;
                                            }
                                            if (var59 > field548) {
                                                field548 += (var59 - field548) / 24;
                                            } else if (var59 < field548) {
                                                field548 += (var59 - field548) / 80;
                                            }
                                            if (field702) {
                                                int var60 = Statics.field148 * 128 + 64;
                                                int var61 = Statics.field57 * 128 + 64;
                                                int var62 = method3106(var60, var61, Statics.field582) - Statics.field1908;
                                                if (Statics.field340 < var60) {
                                                    Statics.field340 += Statics.field184 * (var60 - Statics.field340) / 1000 + Statics.field2026;
                                                    if (Statics.field340 > var60) {
                                                        Statics.field340 = var60;
                                                    }
                                                }
                                                if (Statics.field340 > var60) {
                                                    Statics.field340 -= Statics.field184 * (Statics.field340 - var60) / 1000 + Statics.field2026;
                                                    if (Statics.field340 < var60) {
                                                        Statics.field340 = var60;
                                                    }
                                                }
                                                if (Statics.field736 < var62) {
                                                    Statics.field736 += Statics.field184 * (var62 - Statics.field736) / 1000 + Statics.field2026;
                                                    if (Statics.field736 > var62) {
                                                        Statics.field736 = var62;
                                                    }
                                                }
                                                if (Statics.field736 > var62) {
                                                    Statics.field736 -= Statics.field184 * (Statics.field736 - var62) / 1000 + Statics.field2026;
                                                    if (Statics.field736 < var62) {
                                                        Statics.field736 = var62;
                                                    }
                                                }
                                                if (Statics.field1645 < var61) {
                                                    Statics.field1645 += Statics.field184 * (var61 - Statics.field1645) / 1000 + Statics.field2026;
                                                    if (Statics.field1645 > var61) {
                                                        Statics.field1645 = var61;
                                                    }
                                                }
                                                if (Statics.field1645 > var61) {
                                                    Statics.field1645 -= Statics.field184 * (Statics.field1645 - var61) / 1000 + Statics.field2026;
                                                    if (Statics.field1645 < var61) {
                                                        Statics.field1645 = var61;
                                                    }
                                                }
                                                int var63 = Statics.field1639 * 128 + 64;
                                                int var64 = Statics.field51 * 128 + 64;
                                                int var65 = method3106(var63, var64, Statics.field582) - Statics.field2440;
                                                int var66 = var63 - Statics.field340;
                                                int var67 = var65 - Statics.field736;
                                                int var68 = var64 - Statics.field1645;
                                                int var69 = (int) Math.sqrt((double) (var66 * var66 + var68 * var68));
                                                int var70 = (int) (Math.atan2((double) var67, (double) var69) * 325.949D) & 0x7FF;
                                                int var71 = (int) (Math.atan2((double) var66, (double) var68) * -325.949D) & 0x7FF;
                                                if (var70 < 128) {
                                                    var70 = 128;
                                                }
                                                if (var70 > 383) {
                                                    var70 = 383;
                                                }
                                                if (Statics.field541 < var70) {
                                                    Statics.field541 += Statics.field1910 * (var70 - Statics.field541) / 1000 + Statics.field2674;
                                                    if (Statics.field541 > var70) {
                                                        Statics.field541 = var70;
                                                    }
                                                }
                                                if (Statics.field541 > var70) {
                                                    Statics.field541 -= Statics.field1910 * (Statics.field541 - var70) / 1000 + Statics.field2674;
                                                    if (Statics.field541 < var70) {
                                                        Statics.field541 = var70;
                                                    }
                                                }
                                                int var72 = var71 - Statics.field56;
                                                if (var72 > 1024) {
                                                    var72 -= 2048;
                                                }
                                                if (var72 < -1024) {
                                                    var72 += 2048;
                                                }
                                                if (var72 > 0) {
                                                    Statics.field56 += Statics.field1910 * var72 / 1000 + Statics.field2674;
                                                    Statics.field56 &= 0x7FF;
                                                }
                                                if (var72 < 0) {
                                                    Statics.field56 -= Statics.field1910 * -var72 / 1000 + Statics.field2674;
                                                    Statics.field56 &= 0x7FF;
                                                }
                                                int var73 = var71 - Statics.field56;
                                                if (var73 > 1024) {
                                                    var73 -= 2048;
                                                }
                                                if (var73 < -1024) {
                                                    var73 += 2048;
                                                }
                                                if (var73 < 0 && var72 > 0 || var73 > 0 && var72 < 0) {
                                                    Statics.field56 = var71;
                                                }
                                            }
                                            for (int var74 = 0; var74 < 5; var74++) {
                                                int var10002 = field554[var74]++;
                                            }
                                            int var75 = ++class76.field1373 - 1;
                                            int var77 = Statics.method2615();
                                            if (var75 > 15000 && var77 > 15000) {
                                                field502 = 250;
                                                class76.field1373 = 14500;
                                                field631.method2273(65);
                                            }
                                            field528++;
                                            if (field528 > 500) {
                                                field528 = 0;
                                                int var78 = (int) (Math.random() * 8.0D);
                                                if ((var78 & 0x1) == 1) {
                                                    field522 += field591;
                                                }
                                                if ((var78 & 0x2) == 2) {
                                                    field524 += field525;
                                                }
                                                if ((var78 & 0x4) == 4) {
                                                    field581 += field527;
                                                }
                                            }
                                            if (field522 < -50) {
                                                field591 = 2;
                                            }
                                            if (field522 > 50) {
                                                field591 = -2;
                                            }
                                            if (field524 < -55) {
                                                field525 = 2;
                                            }
                                            if (field524 > 55) {
                                                field525 = -2;
                                            }
                                            if (field581 < -40) {
                                                field527 = 1;
                                            }
                                            if (field581 > 40) {
                                                field527 = -1;
                                            }
                                            field712++;
                                            if (field712 > 500) {
                                                field712 = 0;
                                                int var79 = (int) (Math.random() * 8.0D);
                                                if ((var79 & 0x1) == 1) {
                                                    field529 += field530;
                                                }
                                                if ((var79 & 0x2) == 2) {
                                                    field531 += field532;
                                                }
                                            }
                                            if (field529 < -60) {
                                                field530 = 2;
                                            }
                                            if (field529 > 60) {
                                                field530 = -2;
                                            }
                                            if (field531 < -20) {
                                                field532 = 1;
                                            }
                                            if (field531 > 10) {
                                                field532 = -1;
                                            }
                                            for (class27 var80 = (class27) field462.method3209(); var80 != null; var80 = (class27) field462.method3210()) {
                                                if ((long) var80.field723 < class120.method2616() / 1000L - 5L) {
                                                    if (var80.field722 > 0) {
                                                        method8(5, "", var80.field721 + class133.field2228);
                                                    }
                                                    if (var80.field722 == 0) {
                                                        method8(5, "", var80.field721 + class133.field2079);
                                                    }
                                                    var80.method3286();
                                                }
                                            }
                                            field501++;
                                            if (field501 > 50) {
                                                field631.method2273(100);
                                            }
                                            try {
                                                if (Statics.field1012 != null && field631.field2020 > 0) {
                                                    Statics.field1012.method1355(field631.field2025, 0, field631.field2020);
                                                    field631.field2020 = 0;
                                                    field501 = 0;
                                                }
                                            } catch (IOException var82) {
                                                method231();
                                            }
                                            return;
                                        }
                                        var44 = var43.field2;
                                        if (var44.field2629 < 0) {
                                            break;
                                        }
                                        var45 = class156.method822(var44.field2641);
                                    } while (var45 == null || var45.field2644 == null || var44.field2629 >= var45.field2644.length || var45.field2644[var44.field2629] != var44);
                                    class25.method1580(var43);
                                }
                            }
                            var41 = var40.field2;
                            if (var41.field2629 < 0) {
                                break;
                            }
                            var42 = class156.method822(var41.field2641);
                        } while (var42 == null || var42.field2644 == null || var41.field2629 >= var42.field2644.length || var42.field2644[var41.field2629] != var41);
                        class25.method1580(var40);
                    }
                }
                var38 = var37.field2;
                if (var38.field2629 < 0) {
                    break;
                }
                var39 = class156.method822(var38.field2641);
            } while (var39 == null || var39.field2644 == null || var38.field2629 >= var39.field2644.length || var39.field2644[var38.field2629] != var38);
            class25.method1580(var37);
        }
    }

    @ObfuscatedName("a.h(B)V")
    public static final void method218() {
        for (int var0 = 0; var0 < field619; var0++) {
            int var10002 = field699[var0]--;
            if (field699[var0] >= -10) {
                class56 var2 = field701[var0];
                if (var2 == null) {
                    class56 var10000 = (class56) null;
                    var2 = class56.method1240(Statics.field111, field697[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field699[var0] += var2.method1228();
                    field701[var0] = var2;
                }
                if (field699[var0] < 0) {
                    int var9;
                    if (field628[var0] == 0) {
                        var9 = field695;
                    } else {
                        int var3 = (field628[var0] & 0xFF) * 128;
                        int var4 = field628[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field244.field396;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field628[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field244.field394;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field699[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field711 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class62 var10 = var2.method1229().method1299(Statics.field1533);
                        class44 var11 = class44.method930(var10, 100, var9);
                        var11.method933(field698[var0] - 1);
                        Statics.field2415.method1099(var11);
                    }
                    field699[var0] = -100;
                }
            } else {
                field619--;
                for (int var1 = var0; var1 < field619; var1++) {
                    field697[var1] = field697[var1 + 1];
                    field701[var1] = field701[var1 + 1];
                    field698[var1] = field698[var1 + 1];
                    field699[var1] = field699[var1 + 1];
                    field628[var1] = field628[var1 + 1];
                }
                var0--;
            }
        }
        if (!field540) {
            return;
        }
        boolean var12;
        if (class137.field2314 == 0) {
            var12 = Statics.field2313.method2673();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field691 != 0 && field692 != -1) {
                class137.method783(Statics.field488, field692, 0, field691, false);
            }
            field540 = false;
        }
    }

    @ObfuscatedName("ew.az(Lam;IIII)V")
    public static void method3031(class33 arg0, int arg1, int arg2, int arg3) {
        if (field619 >= 50 || field711 == 0 || arg0.field874 == null || arg1 >= arg0.field874.length) {
            return;
        }
        int var4 = arg0.field874[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field697[field619] = var5;
        field698[field619] = var6;
        field699[field619] = 0;
        field701[field619] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field628[field619] = (var8 << 16) + (var9 << 8) + var7;
        field619++;
    }

    @ObfuscatedName("f.ao(IB)V")
    public static void method226(int arg0) {
        if (arg0 == -1 && !field540) {
            Statics.method50();
        } else if (arg0 != -1 && field692 != arg0 && field691 != 0 && !field540) {
            class137.method864(2, Statics.field488, arg0, 0, field691, false);
        }
        field692 = arg0;
    }

    @ObfuscatedName("ad.au(III)V")
    public static void method659(int arg0, int arg1) {
        if (field691 != 0 && arg0 != -1) {
            class137.method783(Statics.field26, arg0, 0, field691, false);
            field540 = true;
        }
    }

    @ObfuscatedName("cm.aw(III)V")
    public static final void method2070(int arg0, int arg1) {
        if (field690 != 0 && field690 != 3 || class76.field1384 != 1) {
            return;
        }
        int var2 = class76.field1386 - 25 - arg0;
        int var3 = class76.field1383 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field543 + field529 & 0x7FF;
        int var5 = class103.field1764[var4];
        int var6 = class103.field1765[var4];
        int var7 = (field531 + 256) * var5 >> 8;
        int var8 = (field531 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field244.field396 + var9 >> 7;
        int var12 = Statics.field244.field394 - var10 >> 7;
        boolean var13 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field631.method2369(var2);
        field631.method2369(var3);
        field631.method2505(field543);
        field631.method2369(57);
        field631.method2369(field529);
        field631.method2369(field531);
        field631.method2369(89);
        field631.method2505(Statics.field244.field396);
        field631.method2505(Statics.field244.field394);
        field631.method2369(field490);
        field631.method2369(63);
    }

    @ObfuscatedName("p.ad(Ljava/lang/String;B)V")
    public static final void method203(String arg0) {
        if (field609 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method231();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field472 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field472 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field513[var1].field2686[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field459 == 2) {
                throw new RuntimeException();
            }
        }
        field631.method2273(9);
        field631.method2369(arg0.length() - 1);
        field631.method2374(arg0.substring(2));
    }

    @ObfuscatedName("j.av(I)V")
    public static final void method4() {
        for (int var0 = -1; var0 < field577; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field578[var0];
            }
            class3 var2 = field576[var1];
            if (var2 != null) {
                method160(var2, 1);
            }
        }
    }

    @ObfuscatedName("n.am(Lh;II)V")
    public static final void method160(class26 arg0, int arg1) {
        if (arg0.field415 > field636) {
            method1380(arg0);
        } else if (arg0.field393 >= field636) {
            if (field636 == arg0.field393 || arg0.field422 == -1 || arg0.field437 != 0 || arg0.field424 + 1 > class33.method2614(arg0.field422).field863[arg0.field423]) {
                int var2 = arg0.field393 - arg0.field415;
                int var3 = field636 - arg0.field415;
                int var4 = arg0.field444 * 128 + arg0.field408 * 64;
                int var5 = arg0.field434 * 128 + arg0.field408 * 64;
                int var6 = arg0.field433 * 128 + arg0.field408 * 64;
                int var7 = arg0.field435 * 128 + arg0.field408 * 64;
                arg0.field396 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field394 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field448 = 0;
            if (arg0.field416 == 0) {
                arg0.field441 = 1024;
            }
            if (arg0.field416 == 1) {
                arg0.field441 = 1536;
            }
            if (arg0.field416 == 2) {
                arg0.field441 = 0;
            }
            if (arg0.field416 == 3) {
                arg0.field441 = 512;
            }
            arg0.field427 = arg0.field441;
        } else {
            method119(arg0);
        }
        if (arg0.field396 < 128 || arg0.field394 < 128 || arg0.field396 >= 13184 || arg0.field394 >= 13184) {
            arg0.field422 = -1;
            arg0.field425 = -1;
            arg0.field415 = 0;
            arg0.field393 = 0;
            arg0.field396 = arg0.field409[0] * 128 + arg0.field408 * 64;
            arg0.field394 = arg0.field446[0] * 128 + arg0.field408 * 64;
            arg0.method239();
        }
        if (Statics.field244 == arg0 && (arg0.field396 < 1536 || arg0.field394 < 1536 || arg0.field396 >= 11776 || arg0.field394 >= 11776)) {
            arg0.field422 = -1;
            arg0.field425 = -1;
            arg0.field415 = 0;
            arg0.field393 = 0;
            arg0.field396 = arg0.field409[0] * 128 + arg0.field408 * 64;
            arg0.field394 = arg0.field446[0] * 128 + arg0.field408 * 64;
            arg0.method239();
        }
        method32(arg0);
        arg0.field436 = false;
        if (arg0.field443 != -1) {
            class33 var8 = class33.method2614(arg0.field443);
            if (var8 == null || var8.field861 == null) {
                arg0.field443 = -1;
            } else {
                arg0.field421++;
                if (arg0.field420 < var8.field861.length && arg0.field421 > var8.field863[arg0.field420]) {
                    arg0.field421 = 1;
                    arg0.field420++;
                    method3031(var8, arg0.field420, arg0.field396, arg0.field394);
                }
                if (arg0.field420 >= var8.field861.length) {
                    arg0.field421 = 0;
                    arg0.field420 = 0;
                    method3031(var8, arg0.field420, arg0.field396, arg0.field394);
                }
            }
        }
        if (arg0.field425 != -1 && field636 >= arg0.field430) {
            if (arg0.field428 < 0) {
                arg0.field428 = 0;
            }
            int var9 = class34.method564(arg0.field425).field901;
            if (var9 == -1) {
                arg0.field425 = -1;
            } else {
                class33 var10 = class33.method2614(var9);
                if (var10 == null || var10.field861 == null) {
                    arg0.field425 = -1;
                } else {
                    arg0.field429++;
                    if (arg0.field428 < var10.field861.length && arg0.field429 > var10.field863[arg0.field428]) {
                        arg0.field429 = 1;
                        arg0.field428++;
                        method3031(var10, arg0.field428, arg0.field396, arg0.field394);
                    }
                    if (arg0.field428 >= var10.field861.length && (arg0.field428 < 0 || arg0.field428 >= var10.field861.length)) {
                        arg0.field425 = -1;
                    }
                }
            }
        }
        if (arg0.field422 != -1 && arg0.field437 <= 1) {
            class33 var11 = class33.method2614(arg0.field422);
            if (var11.field872 == 1 && arg0.field449 > 0 && arg0.field415 <= field636 && arg0.field393 < field636) {
                arg0.field437 = 1;
                return;
            }
        }
        if (arg0.field422 != -1 && arg0.field437 == 0) {
            class33 var12 = class33.method2614(arg0.field422);
            if (var12 == null || var12.field861 == null) {
                arg0.field422 = -1;
            } else {
                arg0.field424++;
                if (arg0.field423 < var12.field861.length && arg0.field424 > var12.field863[arg0.field423]) {
                    arg0.field424 = 1;
                    arg0.field423++;
                    method3031(var12, arg0.field423, arg0.field396, arg0.field394);
                }
                if (arg0.field423 >= var12.field861.length) {
                    arg0.field423 -= var12.field865;
                    arg0.field426++;
                    if (arg0.field426 >= var12.field871) {
                        arg0.field422 = -1;
                    } else if (arg0.field423 >= 0 && arg0.field423 < var12.field861.length) {
                        method3031(var12, arg0.field423, arg0.field396, arg0.field394);
                    } else {
                        arg0.field422 = -1;
                    }
                }
                arg0.field436 = var12.field869;
            }
        }
        if (arg0.field437 > 0) {
            arg0.field437--;
        }
    }

    @ObfuscatedName("bd.an(Lh;B)V")
    public static final void method1380(class26 arg0) {
        int var1 = arg0.field415 - field636;
        int var2 = arg0.field444 * 128 + arg0.field408 * 64;
        int var3 = arg0.field434 * 128 + arg0.field408 * 64;
        arg0.field396 += (var2 - arg0.field396) / var1;
        arg0.field394 += (var3 - arg0.field394) / var1;
        arg0.field448 = 0;
        if (arg0.field416 == 0) {
            arg0.field441 = 1024;
        }
        if (arg0.field416 == 1) {
            arg0.field441 = 1536;
        }
        if (arg0.field416 == 2) {
            arg0.field441 = 0;
        }
        if (arg0.field416 == 3) {
            arg0.field441 = 512;
        }
    }

    @ObfuscatedName("k.ac(Lh;B)V")
    public static final void method119(class26 arg0) {
        arg0.field443 = arg0.field398;
        if (arg0.field400 == 0) {
            arg0.field448 = 0;
            return;
        }
        if (arg0.field422 != -1 && arg0.field437 == 0) {
            class33 var1 = class33.method2614(arg0.field422);
            if (arg0.field449 > 0 && var1.field872 == 0) {
                arg0.field448++;
                return;
            }
            if (arg0.field449 <= 0 && var1.field864 == 0) {
                arg0.field448++;
                return;
            }
        }
        int var2 = arg0.field396;
        int var3 = arg0.field394;
        int var4 = arg0.field409[arg0.field400 - 1] * 128 + arg0.field408 * 64;
        int var5 = arg0.field446[arg0.field400 - 1] * 128 + arg0.field408 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field396 = var4;
            arg0.field394 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field441 = 1280;
            } else if (var3 > var5) {
                arg0.field441 = 1792;
            } else {
                arg0.field441 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field441 = 768;
            } else if (var3 > var5) {
                arg0.field441 = 256;
            } else {
                arg0.field441 = 512;
            }
        } else if (var3 < var5) {
            arg0.field441 = 1024;
        } else if (var3 > var5) {
            arg0.field441 = 0;
        }
        int var6 = arg0.field441 - arg0.field427 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field402;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field401;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field404;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field403;
        }
        if (var7 == -1) {
            var7 = arg0.field401;
        }
        arg0.field443 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field379.field788;
        }
        if (var9) {
            if (arg0.field441 != arg0.field427 && arg0.field411 == -1 && arg0.field432 != 0) {
                var8 = 2;
            }
            if (arg0.field400 > 2) {
                var8 = 6;
            }
            if (arg0.field400 > 3) {
                var8 = 8;
            }
            if (arg0.field448 > 0 && arg0.field400 > 1) {
                var8 = 8;
                arg0.field448--;
            }
        } else {
            if (arg0.field400 > 1) {
                var8 = 6;
            }
            if (arg0.field400 > 2) {
                var8 = 8;
            }
            if (arg0.field448 > 0 && arg0.field400 > 1) {
                var8 = 8;
                arg0.field448--;
            }
        }
        if (arg0.field418[arg0.field400 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field443 == arg0.field401 && arg0.field405 != -1) {
            arg0.field443 = arg0.field405;
        }
        if (var2 < var4) {
            arg0.field396 += var8;
            if (arg0.field396 > var4) {
                arg0.field396 = var4;
            }
        } else if (var2 > var4) {
            arg0.field396 -= var8;
            if (arg0.field396 < var4) {
                arg0.field396 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field394 += var8;
            if (arg0.field394 > var5) {
                arg0.field394 = var5;
            }
        } else if (var3 > var5) {
            arg0.field394 -= var8;
            if (arg0.field394 < var5) {
                arg0.field394 = var5;
            }
        }
        if (arg0.field396 == var4 && arg0.field394 == var5) {
            arg0.field400--;
            if (arg0.field449 > 0) {
                arg0.field449--;
            }
        }
    }

    @ObfuscatedName("c.at(Lh;I)V")
    public static final void method32(class26 arg0) {
        if (arg0.field432 == 0) {
            return;
        }
        if (arg0.field411 != -1 && arg0.field411 < 32768) {
            class24 var1 = field492[arg0.field411];
            if (var1 != null) {
                int var2 = arg0.field396 - var1.field396;
                int var3 = arg0.field394 - var1.field394;
                if (var2 != 0 || var3 != 0) {
                    arg0.field441 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field411 >= 32768) {
            int var4 = arg0.field411 - 32768;
            if (field583 == var4) {
                var4 = 2047;
            }
            class3 var5 = field576[var4];
            if (var5 != null) {
                int var6 = arg0.field396 - var5.field396;
                int var7 = arg0.field394 - var5.field394;
                if (var6 != 0 || var7 != 0) {
                    arg0.field441 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field417 != 0 || arg0.field438 != 0) && (arg0.field400 == 0 || arg0.field448 > 0)) {
            int var8 = arg0.field396 - (arg0.field417 * 64 - Statics.field953 * 64 - Statics.field953 * 64);
            int var9 = arg0.field394 - (arg0.field438 * 64 - Statics.field450 * 64 - Statics.field450 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field441 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field417 = 0;
            arg0.field438 = 0;
        }
        int var10 = arg0.field441 - arg0.field427 & 0x7FF;
        if (var10 == 0) {
            arg0.field395 = 0;
            return;
        }
        arg0.field395++;
        if (var10 > 1024) {
            arg0.field427 -= arg0.field432;
            boolean var11 = true;
            if (var10 < arg0.field432 || var10 > 2048 - arg0.field432) {
                arg0.field427 = arg0.field441;
                var11 = false;
            }
            if (arg0.field443 == arg0.field398 && (arg0.field395 > 25 || var11)) {
                if (arg0.field399 == -1) {
                    arg0.field443 = arg0.field401;
                } else {
                    arg0.field443 = arg0.field399;
                }
            }
        } else {
            arg0.field427 += arg0.field432;
            boolean var12 = true;
            if (var10 < arg0.field432 || var10 > 2048 - arg0.field432) {
                arg0.field427 = arg0.field441;
                var12 = false;
            }
            if (arg0.field443 == arg0.field398 && (arg0.field395 > 25 || var12)) {
                if (arg0.field442 == -1) {
                    arg0.field443 = arg0.field401;
                } else {
                    arg0.field443 = arg0.field442;
                }
            }
        }
        arg0.field427 &= 0x7FF;
    }

    @ObfuscatedName("dg.ax(Lx;III)V")
    public static void method2244(class3 arg0, int arg1, int arg2) {
        if (arg0.field422 == arg1 && arg1 != -1) {
            int var3 = class33.method2614(arg1).field858;
            if (var3 == 1) {
                arg0.field423 = 0;
                arg0.field424 = 0;
                arg0.field437 = arg2;
                arg0.field426 = 0;
            }
            if (var3 == 2) {
                arg0.field426 = 0;
            }
        } else if (arg1 == -1 || arg0.field422 == -1 || class33.method2614(arg1).field868 >= class33.method2614(arg0.field422).field868) {
            arg0.field422 = arg1;
            arg0.field423 = 0;
            arg0.field424 = 0;
            arg0.field437 = arg2;
            arg0.field426 = 0;
            arg0.field449 = arg0.field400;
        }
    }

    @ObfuscatedName("ad.aj(I)V")
    public static final void method660() {
        if (!field599) {
            field605[0] = class133.field2105;
            field606[0] = "";
            field603[0] = 1006;
            field637 = 1;
        }
        if (field617 != -1) {
            int var0 = field617;
            if (class156.method60(var0)) {
                method2149(Statics.field2592[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field658; var1++) {
            if (field660[var1]) {
                field661[var1] = true;
            }
            field662[var1] = field660[var1];
            field660[var1] = false;
        }
        field659 = field636;
        field607 = -1;
        field608 = -1;
        Statics.field1980 = null;
        if (field617 != -1) {
            field658 = 0;
            method113(field617, 0, 0, 765, 503, 0, 0, -1);
        }
        class88.method1768();
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < field637 - 1; var3++) {
                if (field603[var3] < 1000 && field603[var3 + 1] > 1000) {
                    String var4 = field606[var3];
                    field606[var3] = field606[var3 + 1];
                    field606[var3 + 1] = var4;
                    String var5 = field605[var3];
                    field605[var3] = field605[var3 + 1];
                    field605[var3 + 1] = var5;
                    int var6 = field603[var3];
                    field603[var3] = field603[var3 + 1];
                    field603[var3 + 1] = var6;
                    int var7 = field601[var3];
                    field601[var3] = field601[var3 + 1];
                    field601[var3 + 1] = var7;
                    int var8 = field602[var3];
                    field602[var3] = field602[var3 + 1];
                    field602[var3 + 1] = var8;
                    int var9 = field486[var3];
                    field486[var3] = field486[var3 + 1];
                    field486[var3 + 1] = var9;
                    var2 = false;
                }
            }
        }
        if (field599) {
            int var10 = Statics.field1251;
            int var11 = Statics.field1612;
            int var12 = Statics.field1004;
            int var13 = Statics.field269;
            int var14 = 6116423;
            class88.method1776(var10, var11, var12, var13, var14);
            class88.method1776(var10 + 1, var11 + 1, var12 - 2, 16, 0);
            class88.method1755(var10 + 1, var11 + 18, var12 - 2, var13 - 19, 0);
            Statics.field232.method3322(class133.field2201, var10 + 3, var11 + 14, var14, -1);
            int var15 = class76.field1378;
            int var16 = class76.field1379;
            for (int var17 = 0; var17 < field637; var17++) {
                int var18 = (field637 - 1 - var17) * 15 + var11 + 31;
                int var19 = 16777215;
                if (var15 > var10 && var15 < var10 + var12 && var16 > var18 - 13 && var16 < var18 + 3) {
                    var19 = 16776960;
                }
                Statics.field232.method3322(method799(var17), var10 + 3, var18, var19, 0);
            }
            int var20 = Statics.field1251;
            int var21 = Statics.field1612;
            int var22 = Statics.field1004;
            int var23 = Statics.field269;
            for (int var24 = 0; var24 < field658; var24++) {
                if (field665[var24] + field663[var24] > var20 && field663[var24] < var20 + var22 && field666[var24] + field561[var24] > var21 && field561[var24] < var21 + var23) {
                    field661[var24] = true;
                }
            }
        } else if (field607 != -1) {
            method140(field607, field608);
        }
        if (field667 == 3) {
            for (int var25 = 0; var25 < field658; var25++) {
                if (field662[var25]) {
                    class88.method1752(field663[var25], field561[var25], field665[var25], field666[var25], 16711935, 128);
                } else if (field661[var25]) {
                    class88.method1752(field663[var25], field561[var25], field665[var25], field666[var25], 16711680, 128);
                }
            }
        }
        int var26 = Statics.field582;
        int var27 = Statics.field244.field396;
        int var28 = Statics.field244.field394;
        int var29 = field534;
        for (class7 var30 = (class7) class7.field103.method3279(); var30 != null; var30 = (class7) class7.field103.method3249()) {
            if (var30.field97 != -1 || var30.field101 != null) {
                int var31 = 0;
                if (var27 > var30.field92) {
                    var31 += var27 - var30.field92;
                } else if (var27 < var30.field94) {
                    var31 += var30.field94 - var27;
                }
                if (var28 > var30.field91) {
                    var31 += var28 - var30.field91;
                } else if (var28 < var30.field93) {
                    var31 += var30.field93 - var28;
                }
                if (var31 - 64 > var30.field96 || field711 == 0 || var30.field100 != var26) {
                    if (var30.field90 != null) {
                        Statics.field2415.method1081(var30.field90);
                        var30.field90 = null;
                    }
                    if (var30.field99 != null) {
                        Statics.field2415.method1081(var30.field99);
                        var30.field99 = null;
                    }
                } else {
                    var31 -= 64;
                    if (var31 < 0) {
                        var31 = 0;
                    }
                    int var32 = field711 * (var30.field96 - var31) / var30.field96;
                    class56 var10000;
                    if (var30.field90 != null) {
                        var30.field90.method934(var32);
                    } else if (var30.field97 >= 0) {
                        var10000 = (class56) null;
                        class56 var33 = class56.method1240(Statics.field111, var30.field97, 0);
                        if (var33 != null) {
                            class62 var34 = var33.method1229().method1299(Statics.field1533);
                            class44 var35 = class44.method930(var34, 100, var32);
                            var35.method933(-1);
                            Statics.field2415.method1099(var35);
                            var30.field90 = var35;
                        }
                    }
                    if (var30.field99 != null) {
                        var30.field99.method934(var32);
                        if (!var30.field99.method3288()) {
                            var30.field99 = null;
                        }
                    } else if (var30.field101 != null && (var30.field102 -= var29) <= 0) {
                        int var36 = (int) (Math.random() * (double) var30.field101.length);
                        var10000 = (class56) null;
                        class56 var37 = class56.method1240(Statics.field111, var30.field101[var36], 0);
                        if (var37 != null) {
                            class62 var38 = var37.method1229().method1299(Statics.field1533);
                            class44 var39 = class44.method930(var38, 100, var32);
                            var39.method933(0);
                            Statics.field2415.method1099(var39);
                            var30.field99 = var39;
                            var30.field102 = var30.field98 + (int) (Math.random() * (double) (var30.field95 - var30.field98));
                        }
                    }
                }
            }
        }
        field534 = 0;
    }

    @ObfuscatedName("p.ai(Ljava/lang/String;ZI)V")
    public static final void method205(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1259.method3319(arg0, 250);
        int var6 = Statics.field1259.method3390(arg0, 250) * 13;
        class88.method1776(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class88.method1755(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1259.method3325(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method211(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1997.getGraphics();
                Statics.field1532.method1584(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1997.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field658; var13++) {
            if (field665[var13] + field663[var13] > var9 && field663[var13] < var9 + var11 && field666[var13] + field561[var13] > var10 && field561[var13] < var10 + var12) {
                field661[var13] = true;
            }
        }
    }

    @ObfuscatedName("client.ay(IIIII)V")
    public static final void method533(int arg0, int arg1, int arg2, int arg3) {
        class88.method1794(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class103.method2080();
        field604++;
        method1(true);
        method111(true);
        method1(false);
        method111(false);
        method2077();
        for (class19 var4 = (class19) field458.method3279(); var4 != null; var4 = (class19) field458.method3249()) {
            if (Statics.field582 != var4.field272 || var4.field279) {
                var4.method3289();
            } else if (field636 >= var4.field271) {
                var4.method159(field534);
                if (var4.field279) {
                    var4.method3289();
                } else {
                    Statics.field362.method1972(var4.field272, var4.field273, var4.field277, var4.field275, 60, var4, 0, -1, false);
                }
            }
        }
        if (!field702) {
            int var5 = field542;
            if (field548 / 256 > var5) {
                var5 = field548 / 256;
            }
            if (field703[4] && field688[4] + 128 > var5) {
                var5 = field688[4] + 128;
            }
            int var6 = field581 + field543 & 0x7FF;
            int var7 = Statics.field2318;
            int var8 = method3106(Statics.field244.field396, Statics.field244.field394, Statics.field582) - 50;
            int var9 = Statics.field375;
            int var10 = var5 * 3 + 600;
            int var11 = 2048 - var5 & 0x7FF;
            int var12 = 2048 - var6 & 0x7FF;
            int var13 = 0;
            int var14 = 0;
            int var15 = var10;
            if (var11 != 0) {
                int var16 = class103.field1764[var11];
                int var17 = class103.field1765[var11];
                int var18 = var14 * var17 - var10 * var16 >> 16;
                var15 = var14 * var16 + var10 * var17 >> 16;
                var14 = var18;
            }
            if (var12 != 0) {
                int var19 = class103.field1764[var12];
                int var20 = class103.field1765[var12];
                int var21 = var13 * var20 + var15 * var19 >> 16;
                var15 = var15 * var20 - var13 * var19 >> 16;
                var13 = var21;
            }
            Statics.field340 = var7 - var13;
            Statics.field736 = var8 - var14;
            Statics.field1645 = var9 - var15;
            Statics.field541 = var5;
            Statics.field56 = var6;
        }
        int var22;
        if (field702) {
            var22 = method1560();
        } else {
            var22 = method163();
        }
        int var23 = Statics.field340;
        int var24 = Statics.field736;
        int var25 = Statics.field1645;
        int var26 = Statics.field541;
        int var27 = Statics.field56;
        for (int var28 = 0; var28 < 5; var28++) {
            if (field703[var28]) {
                int var29 = (int) (Math.random() * (double) (field704[var28] * 2 + 1) - (double) field704[var28] + Math.sin((double) field706[var28] / 100.0D * (double) field554[var28]) * (double) field688[var28]);
                if (var28 == 0) {
                    Statics.field340 += var29;
                }
                if (var28 == 1) {
                    Statics.field736 += var29;
                }
                if (var28 == 2) {
                    Statics.field1645 += var29;
                }
                if (var28 == 3) {
                    Statics.field56 = Statics.field56 + var29 & 0x7FF;
                }
                if (var28 == 4) {
                    Statics.field541 += var29;
                    if (Statics.field541 < 128) {
                        Statics.field541 = 128;
                    }
                    if (Statics.field541 > 383) {
                        Statics.field541 = 383;
                    }
                }
            }
        }
        int var30 = class76.field1378;
        int var31 = class76.field1379;
        if (var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            class111.field1895 = true;
            class111.field1898 = 0;
            class111.field1841 = class76.field1378 - arg0;
            class111.field1897 = class76.field1379 - arg1;
        } else {
            class111.field1895 = false;
            class111.field1898 = 0;
        }
        Statics.method1342();
        class88.method1776(arg0, arg1, arg2, arg3, 0);
        Statics.method1342();
        Statics.field362.method1919(Statics.field340, Statics.field736, Statics.field1645, Statics.field541, Statics.field56, var22);
        Statics.method1342();
        Statics.field362.method1945();
        Statics.method195(arg0, arg1, arg2, arg3);
        if (field696 == 2) {
            method156((field560 - Statics.field953 << 7) + field480, (field518 - Statics.field450 << 7) + field481, field566 * 2);
            if (field614 > -1 && field636 % 20 < 10) {
                Statics.field247[0].method1656(field614 + arg0 - 12, field562 + arg1 - 28);
            }
        }
        ((class109) Statics.field1761).method2154(field534);
        if (field586 == 1) {
            Statics.field242[field549 / 100].method1656(field563 - 8, field572 - 8);
        }
        if (field586 == 2) {
            Statics.field242[field549 / 100 + 4].method1656(field563 - 8, field572 - 8);
        }
        method2586();
        if (field472) {
            int var32 = arg0 + 512 - 5;
            int var33 = arg1 + 20;
            Statics.field1259.method3372("Fps:" + field1310, var32, var33, 16776960, -1);
            int var40 = var33 + 15;
            Runtime var34 = Runtime.getRuntime();
            int var35 = (int) ((var34.totalMemory() - var34.freeMemory()) / 1024L);
            int var36 = 16776960;
            if (var35 > 32768 && field461) {
                var36 = 16711680;
            }
            if (var35 > 65536 && !field461) {
                var36 = 16711680;
            }
            Statics.field1259.method3372("Mem:" + var35 + "k", var32, var40, var36, -1);
            var33 = var40 + 15;
        }
        Statics.field340 = var23;
        Statics.field736 = var24;
        Statics.field1645 = var25;
        Statics.field541 = var26;
        Statics.field56 = var27;
        if (field465) {
            byte var37 = 0;
            int var38 = class151.field2468 + class151.field2466 + var37;
            if (var38 == 0) {
                field465 = false;
            }
        }
        if (field465) {
            class88.method1776(arg0, arg1, arg2, arg3, 0);
            method205(class133.field2256, false);
        }
        if (!field465 && !field599 && var30 >= arg0 && var30 < arg0 + arg2 && var31 >= arg1 && var31 < arg1 + arg3) {
            method217(var30, var31, arg0, arg1);
        }
    }

    @ObfuscatedName("j.ag(ZI)V")
    public static final void method1(boolean arg0) {
        if (Statics.field244.field396 >> 7 == field466 && Statics.field244.field394 >> 7 == field689) {
            field466 = 0;
        }
        int var1 = field577;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field244;
                var4 = 33538048;
            } else {
                var3 = field576[field578[var2]];
                var4 = field578[var2] << 14;
            }
            if (var3 != null && var3.method11()) {
                var3.field42 = false;
                if ((field461 && field577 > 50 || field577 > 200) && !arg0 && var3.field443 == var3.field398) {
                    var3.field42 = true;
                }
                int var5 = var3.field396 >> 7;
                int var6 = var3.field394 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field48 == null || field636 < var3.field47 || field636 >= var3.field44) {
                        if ((var3.field396 & 0x7F) == 64 && (var3.field394 & 0x7F) == 64) {
                            if (field604 == field553[var5][var6]) {
                                continue;
                            }
                            field553[var5][var6] = field604;
                        }
                        var3.field59 = method3106(var3.field396, var3.field394, Statics.field582);
                        Statics.field362.method1972(Statics.field582, var3.field396, var3.field394, var3.field59, 60, var3, var3.field427, var4, var3.field436);
                    } else {
                        var3.field42 = false;
                        var3.field59 = method3106(var3.field396, var3.field394, Statics.field582);
                        Statics.field362.method1841(Statics.field582, var3.field396, var3.field394, var3.field59, 60, var3, var3.field427, var4, var3.field49, var3.field50, var3.field53, var3.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("q.ar(ZB)V")
    public static final void method111(boolean arg0) {
        for (int var1 = 0; var1 < field493; var1++) {
            class24 var2 = field492[field494[var1]];
            int var3 = (field494[var1] << 14) + 536870912;
            if (var2 != null && var2.method11() && var2.field379.field779 == arg0 && var2.field379.method594()) {
                int var4 = var2.field396 >> 7;
                int var5 = var2.field394 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field408 == 1 && (var2.field396 & 0x7F) == 64 && (var2.field394 & 0x7F) == 64) {
                        if (field604 == field553[var4][var5]) {
                            continue;
                        }
                        field553[var4][var5] = field604;
                    }
                    if (!var2.field379.field787) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field362.method1972(Statics.field582, var2.field396, var2.field394, method3106(var2.field396 + (var2.field408 * 64 - 64), var2.field394 + (var2.field408 * 64 - 64), Statics.field582), var2.field408 * 64 - 64 + 60, var2, var2.field427, var3, var2.field436);
                }
            }
        }
    }

    @ObfuscatedName("cf.ae(B)V")
    public static final void method2077() {
        for (class10 var0 = (class10) field460.method3279(); var0 != null; var0 = (class10) field460.method3249()) {
            if (Statics.field582 != var0.field162 || field636 > var0.field176) {
                var0.method3289();
            } else if (field636 >= var0.field155) {
                if (var0.field156 > 0) {
                    class24 var1 = field492[var0.field156 - 1];
                    if (var1 != null && var1.field396 >= 0 && var1.field396 < 13312 && var1.field394 >= 0 && var1.field394 < 13312) {
                        var0.method104(var1.field396, var1.field394, method3106(var1.field396, var1.field394, var0.field162) - var0.field154, field636);
                    }
                }
                if (var0.field156 < 0) {
                    int var2 = -var0.field156 - 1;
                    class3 var3;
                    if (field583 == var2) {
                        var3 = Statics.field244;
                    } else {
                        var3 = field576[var2];
                    }
                    if (var3 != null && var3.field396 >= 0 && var3.field396 < 13312 && var3.field394 >= 0 && var3.field394 < 13312) {
                        var0.method104(var3.field396, var3.field394, method3106(var3.field396, var3.field394, var0.field162) - var0.field154, field636);
                    }
                }
                var0.method105(field534);
                Statics.field362.method1972(Statics.field582, (int) var0.field161, (int) var0.field170, (int) var0.field172, 60, var0, var0.field165, -1, false);
            }
        }
    }

    @ObfuscatedName("n.ah(I)I")
    public static final int method163() {
        int var0 = 3;
        if (Statics.field541 < 310) {
            int var1 = Statics.field340 >> 7;
            int var2 = Statics.field1645 >> 7;
            int var3 = Statics.field244.field396 >> 7;
            int var4 = Statics.field244.field394 >> 7;
            if ((class9.field125[Statics.field582][var1][var2] & 0x4) != 0) {
                var0 = Statics.field582;
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
                    if ((class9.field125[Statics.field582][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field582;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field125[Statics.field582][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field582;
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
                    if ((class9.field125[Statics.field582][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field582;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field125[Statics.field582][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field582;
                        }
                    }
                }
            }
        }
        if ((class9.field125[Statics.field582][Statics.field244.field396 >> 7][Statics.field244.field394 >> 7] & 0x4) != 0) {
            var0 = Statics.field582;
        }
        return var0;
    }

    @ObfuscatedName("cr.aa(I)I")
    public static final int method1560() {
        int var0 = method3106(Statics.field340, Statics.field1645, Statics.field582);
        return var0 - Statics.field736 >= 800 || (class9.field125[Statics.field582][Statics.field340 >> 7][Statics.field1645 >> 7] & 0x4) == 0 ? 3 : Statics.field582;
    }

    @ObfuscatedName("dr.ak(I)V")
    public static final void method2586() {
        field672 = 0;
        int var0 = (Statics.field244.field396 >> 7) + Statics.field953;
        int var1 = (Statics.field244.field394 >> 7) + Statics.field450;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field672 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field672 = 1;
        }
        if (field672 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field672 = 0;
        }
    }

    @ObfuscatedName("bl.al(Lh;IB)V")
    public static final void method1313(class26 arg0, int arg1) {
        method156(arg0.field396, arg0.field394, arg1);
    }

    @ObfuscatedName("d.as(IIII)V")
    public static final void method156(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field614 = -1;
            field562 = -1;
            return;
        }
        int var3 = method3106(arg0, arg1, Statics.field582) - arg2;
        int var4 = arg0 - Statics.field340;
        int var5 = var3 - Statics.field736;
        int var6 = arg1 - Statics.field1645;
        int var7 = class103.field1764[Statics.field541];
        int var8 = class103.field1765[Statics.field541];
        int var9 = class103.field1764[Statics.field56];
        int var10 = class103.field1765[Statics.field56];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field614 = (var11 << 9) / var15 + 256;
            field562 = (var14 << 9) / var15 + 167;
        } else {
            field614 = -1;
            field562 = -1;
        }
    }

    @ObfuscatedName("fj.ap(IIII)I")
    public static final int method3106(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field145[var5][var3][var4] + class9.field145[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field145[var5][var3][var4 + 1] + class9.field145[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("dg.aq(ZI)V")
    public static final void method2246(boolean arg0) {
        field514 = arg0;
        if (!field514) {
            int var1 = field497.method2405();
            int var2 = field497.method2405();
            int var3 = field497.method2405();
            int var4 = field497.method2407();
            int var5 = field497.method2405();
            int var6 = (field498 - field497.field2020) / 16;
            Statics.field334 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    Statics.field334[var7][var8] = field497.method2387();
                }
            }
            Statics.field1662 = new int[var6];
            Statics.field364 = new int[var6];
            Statics.field2019 = new int[var6];
            Statics.field2030 = new byte[var6][];
            Statics.field1660 = new byte[var6][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1662[var10] = var13;
                        Statics.field364[var10] = Statics.field15.method2918("m" + var11 + "_" + var12);
                        Statics.field2019[var10] = Statics.field15.method2918("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method2882(var1, var2, var4, var3, var5);
            return;
        }
        field497.method2255();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field497.method2256(1);
                    if (var17 == 1) {
                        field515[var14][var15][var16] = field497.method2256(26);
                    } else {
                        field515[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field497.method2269();
        int var18 = (field498 - field497.field2020) / 16;
        Statics.field334 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field334[var19][var20] = field497.method2387();
            }
        }
        int var21 = field497.method2583();
        int var22 = field497.method2416();
        int var23 = field497.method2416();
        int var24 = field497.method2414();
        int var25 = field497.method2405();
        Statics.field1662 = new int[var18];
        Statics.field364 = new int[var18];
        Statics.field2019 = new int[var18];
        Statics.field2030 = new byte[var18][];
        Statics.field1660 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field515[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1662[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1662[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field364[var26] = Statics.field15.method2918("m" + var35 + "_" + var36);
                            Statics.field2019[var26] = Statics.field15.method2918("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method2882(var23, var22, var21, var24, var25);
    }

    @ObfuscatedName("es.af(IIIIII)V")
    public static final void method2882(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field201 == arg0 && Statics.field898 == arg1 && field507 == arg2 || !field461) {
            return;
        }
        Statics.field201 = arg0;
        Statics.field898 = arg1;
        field507 = arg2;
        if (!field461) {
            field507 = 0;
        }
        method242(25);
        method205(class133.field2256, true);
        int var5 = Statics.field953;
        int var6 = Statics.field450;
        Statics.field953 = (arg0 - 6) * 8;
        Statics.field450 = (arg1 - 6) * 8;
        int var7 = Statics.field953 - var5;
        int var8 = Statics.field450 - var6;
        int var9 = Statics.field953;
        int var10 = Statics.field450;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field492[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field409[var13] -= var7;
                    var12.field446[var13] -= var8;
                }
                var12.field396 -= var7 * 128;
                var12.field394 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field576[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field409[var16] -= var7;
                    var15.field446[var16] -= var8;
                }
                var15.field396 -= var7 * 128;
                var15.field394 -= var8 * 128;
            }
        }
        Statics.field582 = arg2;
        Statics.field244.method233(arg3, arg4, false);
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
                        field589[var27][var23][var24] = field589[var27][var25][var26];
                    } else {
                        field589[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class21 var28 = (class21) field592.method3279(); var28 != null; var28 = (class21) field592.method3249()) {
            var28.field337 -= var7;
            var28.field322 -= var8;
            if (var28.field337 < 0 || var28.field322 < 0 || var28.field337 >= 104 || var28.field322 >= 104) {
                var28.method3289();
            }
        }
        if (field466 != 0) {
            field466 -= var7;
            field689 -= var8;
        }
        field619 = 0;
        field702 = false;
        field683 = -1;
        field458.method3255();
        field460.method3255();
    }

    @ObfuscatedName("df.bv(ZI)V")
    public static final void method2298(boolean arg0) {
        Statics.method1342();
        field501++;
        if (field501 < 50 && !arg0) {
            return;
        }
        field501 = 0;
        if (field506 || Statics.field1012 == null) {
            return;
        }
        field631.method2273(100);
        try {
            Statics.field1012.method1355(field631.field2025, 0, field631.field2020);
            field631.field2020 = 0;
        } catch (IOException var2) {
            field506 = true;
        }
    }

    @ObfuscatedName("g.bz(IS)V")
    public static final void method100(int arg0) {
        int[] var1 = Statics.field14.field1459;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field125[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field362.method1920(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field125[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field362.method1920(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field14.method1646();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field125[arg0][var10][var9] & 0x18) == 0) {
                    method3014(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field125[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3014(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field684 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field362.method1858(Statics.field582, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class31.method35(var14).field827;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field513[Statics.field582].field2686;
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
                        field538[field684] = Statics.field2658[var15];
                        field597[field684] = var16;
                        field638[field684] = var17;
                        field684++;
                    }
                }
            }
        }
        Statics.field1532.method1640();
    }

    @ObfuscatedName("ed.ba(IIIIIB)V")
    public static final void method3014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field362.method1855(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field362.method1859(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field14.field1459;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method35(var12);
            if (var13.field822 == -1) {
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
                class86 var14 = Statics.field1382[var13.field822];
                if (var14 != null) {
                    int var15 = (var13.field808 * 4 - var14.field1466) / 2;
                    int var16 = (var13.field814 * 4 - var14.field1467) / 2;
                    var14.method1738(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field814) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field362.method1988(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field362.method1859(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method35(var21);
            if (var22.field822 != -1) {
                class86 var23 = Statics.field1382[var22.field822];
                if (var23 != null) {
                    int var24 = (var22.field808 * 4 - var23.field1466) / 2;
                    int var25 = (var22.field814 * 4 - var23.field1467) / 2;
                    var23.method1738(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field814) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field14.field1459;
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
        int var29 = Statics.field362.method1858(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method35(var30);
        if (var31.field822 == -1) {
            return;
        }
        class86 var32 = Statics.field1382[var31.field822];
        if (var32 != null) {
            int var33 = (var31.field808 * 4 - var32.field1466) / 2;
            int var34 = (var31.field814 * 4 - var32.field1467) / 2;
            var32.method1738(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field814) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ay.br(IIII)Z")
    public static final boolean method875(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field362.method1859(Statics.field582, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method35(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field808;
                var9 = var7.field814;
            } else {
                var8 = var7.field814;
                var9 = var7.field808;
            }
            int var10 = var7.field804;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method126(Statics.field244.field409[0], Statics.field244.field446[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method126(Statics.field244.field409[0], Statics.field244.field446[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field563 = class76.field1386;
        field572 = class76.field1383;
        field586 = 2;
        field549 = 0;
        return true;
    }

    @ObfuscatedName("o.by(IIIIZIIIIIII)Z")
    public static final boolean method126(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field645[var11][var12] = 0;
                field519[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field645[arg0][arg1] = 99;
        field519[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field520[var15] = arg0;
        int var36 = var15 + 1;
        field687[var15] = arg1;
        boolean var17 = false;
        int var18 = field520.length;
        int[][] var19 = field513[Statics.field582].field2686;
        while (var36 != var16) {
            var13 = field520[var16];
            var14 = field687[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field513[Statics.field582].method3144(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field513[Statics.field582].method3158(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field513[Statics.field582].method3146(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field519[var13][var14] + 1;
            if (var13 > 0 && field645[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field520[var36] = var13 - 1;
                field687[var36] = var14;
                var36 = (var36 + 1) % var18;
                field645[var13 - 1][var14] = 2;
                field519[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field645[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field520[var36] = var13 + 1;
                field687[var36] = var14;
                var36 = (var36 + 1) % var18;
                field645[var13 + 1][var14] = 8;
                field519[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field645[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field520[var36] = var13;
                field687[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field645[var13][var14 - 1] = 1;
                field519[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field645[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field520[var36] = var13;
                field687[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field645[var13][var14 + 1] = 4;
                field519[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field645[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field520[var36] = var13 - 1;
                field687[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field645[var13 - 1][var14 - 1] = 3;
                field519[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field645[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field520[var36] = var13 + 1;
                field687[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field645[var13 + 1][var14 - 1] = 9;
                field519[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field645[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field520[var36] = var13 - 1;
                field687[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field645[var13 - 1][var14 + 1] = 6;
                field519[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field645[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field520[var36] = var13 + 1;
                field687[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field645[var13 + 1][var14 + 1] = 12;
                field519[var13 + 1][var14 + 1] = var20;
            }
        }
        field490 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field519[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field519[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field519[var24][var25];
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
            field490 = 1;
        }
        byte var29 = 0;
        field520[var29] = var13;
        int var37 = var29 + 1;
        field687[var29] = var14;
        int var30;
        int var31 = var30 = field645[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field520[var37] = var13;
                field687[var37++] = var14;
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
            var31 = field645[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field520[var37];
            int var34 = field687[var37];
            if (arg10 == 0) {
                field631.method2273(249);
                field631.method2369(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field631.method2273(226);
                field631.method2369(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field631.method2273(176);
                field631.method2369(var32 + var32 + 3);
            }
            field631.method2412(Statics.field450 + var34);
            field631.method2505(Statics.field953 + var33);
            field631.method2575(class74.field1341[82] ? 1 : 0);
            field466 = field520[0];
            field689 = field687[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field631.method2552(field520[var37] - var33);
                field631.method2369(field687[var37] - var34);
            }
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("v.bt(I)Z")
    public static final boolean method120() {
        if (Statics.field1012 == null) {
            return false;
        }
        try {
            int var0 = Statics.field1012.method1353();
            if (var0 == 0) {
                return false;
            }
            if (field499 == -1) {
                Statics.field1012.method1354(field497.field2025, 0, 1);
                field497.field2020 = 0;
                field499 = field497.method2254();
                field498 = class163.field2709[field499];
                var0--;
            }
            if (field498 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field1012.method1354(field497.field2025, 0, 1);
                field498 = field497.field2025[0] & 0xFF;
                var0--;
            }
            if (field498 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field1012.method1354(field497.field2025, 0, 2);
                field497.field2020 = 0;
                field498 = field497.method2405();
                var0 -= 2;
            }
            if (var0 < field498) {
                return false;
            }
            field497.field2020 = 0;
            Statics.field1012.method1354(field497.field2025, 0, field498);
            field517 = 0;
            field505 = field504;
            field504 = field503;
            field503 = field499;
            if (field499 == 151) {
                int var1 = field497.method2474();
                int var2 = field497.method2405();
                class156 var3 = class156.method822(var1);
                if (var3 != null && var3.field2530 == 0) {
                    if (var2 > var3.field2624 - var3.field2538) {
                        var2 = var3.field2624 - var3.field2538;
                    }
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    if (var3.field2542 != var2) {
                        var3.field2542 = var2;
                        method1345(var3);
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 12) {
                class180.method2074(field497, field498);
                field499 = -1;
                return true;
            }
            if (field499 == 227) {
                int var4 = field497.method2387();
                class156 var5 = class156.method822(var4);
                var5.field2560 = 3;
                var5.field2561 = Statics.field244.field55.method3115();
                method1345(var5);
                field499 = -1;
                return true;
            }
            if (field499 == 190) {
                field674 = field497.method2399();
                field675 = field497.method2399();
                field499 = -1;
                return true;
            }
            if (field499 == 91) {
                method20();
                field499 = -1;
                return true;
            }
            if (field499 == 44) {
                if (field617 != -1) {
                    int var6 = field617;
                    if (class156.method60(var6)) {
                        method2(Statics.field2592[var6], 0);
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 35) {
                for (int var7 = 0; var7 < Statics.field1015; var7++) {
                    class41 var8 = (class41) class41.field1019.method3191((long) var7);
                    class41 var9;
                    if (var8 == null) {
                        byte[] var10 = Statics.field1016.method2903(16, var7);
                        class41 var11 = new class41();
                        if (var10 != null) {
                            var11.method876(new class126(var10));
                        }
                        class41.field1019.method3181(var11, (long) var7);
                        var9 = var11;
                    } else {
                        var9 = var8;
                    }
                    if (var9 != null && var9.field1017 == 0) {
                        class157.field2646[var7] = 0;
                        class157.field2647[var7] = 0;
                    }
                }
                method1482();
                field574 += 32;
                field499 = -1;
                return true;
            }
            if (field499 == 160) {
                method1482();
                field623 = field497.method2385();
                field650 = field640;
                field499 = -1;
                return true;
            }
            if (field499 == 131) {
                Statics.field189 = field497.method2399();
                Statics.field83 = field497.method2407();
                field499 = -1;
                return true;
            }
            if (field499 == 148) {
                int var13 = field497.method2415();
                field617 = var13;
                method206(var13);
                class25.method133(field617);
                for (int var14 = 0; var14 < 100; var14++) {
                    field660[var14] = true;
                }
                field499 = -1;
                return true;
            }
            if (field499 == 58) {
                int var15 = field497.method2405();
                int var16 = field497.method2387();
                int var17 = field497.method2416();
                class156 var18 = class156.method822(var16);
                var18.field2572 = (var17 << 16) + var15;
                field499 = -1;
                return true;
            }
            if (field499 == 155) {
                field466 = 0;
                field499 = -1;
                return true;
            }
            if (field499 == 79) {
                int var19 = field497.method2425();
                int var20 = field497.method2414();
                class156 var21 = class156.method822(var19);
                if (var21.field2560 != 2 || var21.field2561 != var20) {
                    var21.field2560 = 2;
                    var21.field2561 = var20;
                    method1345(var21);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 157 || field499 == 3 || field499 == 144 || field499 == 116 || field499 == 46 || field499 == 114 || field499 == 221 || field499 == 210 || field499 == 17 || field499 == 74 || field499 == 135) {
                method101();
                field499 = -1;
                return true;
            }
            if (field499 == 34) {
                int var22 = field497.method2387();
                int var23 = field497.method2405();
                if (var22 < -70000) {
                    var23 += 32768;
                }
                class156 var24;
                if (var22 >= 0) {
                    var24 = class156.method822(var22);
                } else {
                    var24 = null;
                }
                while (field497.field2020 < field498) {
                    int var25 = field497.method2395();
                    int var26 = field497.method2405();
                    int var27 = 0;
                    if (var26 != 0) {
                        var27 = field497.method2399();
                        if (var27 == 255) {
                            var27 = field497.method2387();
                        }
                    }
                    if (var24 != null && var25 >= 0 && var25 < var24.field2630.length) {
                        var24.field2630[var25] = var26;
                        var24.field2631[var25] = var27;
                    }
                    class18.method204(var23, var25, var26 - 1, var27);
                }
                if (var24 != null) {
                    method1345(var24);
                }
                method1482();
                field644[++field664 - 1 & 0x1F] = var23 & 0x7FFF;
                field499 = -1;
                return true;
            }
            if (field499 == 137) {
                int var28 = field497.method2418();
                int var29 = field497.method2543();
                class156 var30 = class156.method822(var29);
                if (var30.field2564 != var28 || var28 == -1) {
                    var30.field2564 = var28;
                    var30.field2634 = 0;
                    var30.field2635 = 0;
                    method1345(var30);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 196) {
                method36();
                field499 = -1;
                return false;
            }
            if (field499 == 102) {
                field702 = true;
                Statics.field148 = field497.method2399();
                Statics.field57 = field497.method2399();
                Statics.field1908 = field497.method2405();
                Statics.field2026 = field497.method2399();
                Statics.field184 = field497.method2399();
                if (Statics.field184 >= 100) {
                    Statics.field340 = Statics.field148 * 128 + 64;
                    Statics.field1645 = Statics.field57 * 128 + 64;
                    Statics.field736 = method3106(Statics.field340, Statics.field1645, Statics.field582) - Statics.field1908;
                }
                field499 = -1;
                return true;
            }
            if (field499 == 31) {
                method141();
                field499 = -1;
                return true;
            }
            if (field499 == 110) {
                int var31 = field497.method2415();
                int var32 = field497.method2414();
                int var33 = field497.method2474();
                int var34 = field497.method2405();
                class156 var35 = class156.method822(var33);
                if (var35.field2638 != var34 || var35.field2569 != var31 || var35.field2529 != var32) {
                    var35.field2638 = var34;
                    var35.field2569 = var31;
                    var35.field2529 = var32;
                    method1345(var35);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 68) {
                int var36 = field497.method2553();
                int var37 = field497.method2399();
                int var38 = field497.method2553();
                Statics.field582 = var37 >> 1;
                Statics.field244.method233(var38, var36, (var37 & 0x1) == 1);
                field499 = -1;
                return true;
            }
            if (field499 == 94) {
                int var39 = field497.method2387();
                int var40 = field497.method2416();
                class156 var41 = class156.method822(var39);
                if (var41.field2560 != 1 || var41.field2561 != var40) {
                    var41.field2560 = 1;
                    var41.field2561 = var40;
                    method1345(var41);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 125) {
                field649 = field640;
                if (field498 == 0) {
                    field681 = null;
                    field707 = null;
                    Statics.field1228 = 0;
                    Statics.field1276 = null;
                    field499 = -1;
                    return true;
                }
                field707 = field497.method2390();
                long var42 = field497.method2388();
                field681 = class145.method103(var42);
                Statics.field1362 = field497.method2383();
                int var44 = field497.method2399();
                if (var44 == 255) {
                    field499 = -1;
                    return true;
                }
                Statics.field1228 = var44;
                class8[] var45 = new class8[100];
                for (int var46 = 0; var46 < Statics.field1228; var46++) {
                    var45[var46] = new class8();
                    var45[var46].field116 = field497.method2390();
                    var45[var46].field110 = class147.method51(var45[var46].field116, Statics.field183);
                    var45[var46].field120 = field497.method2405();
                    var45[var46].field112 = field497.method2383();
                    field497.method2390();
                    if (var45[var46].field116.equals(Statics.field244.field37)) {
                        Statics.field1924 = var45[var46].field112;
                    }
                }
                boolean var47 = false;
                int var48 = Statics.field1228;
                while (var48 > 0) {
                    boolean var49 = true;
                    var48--;
                    for (int var50 = 0; var50 < var48; var50++) {
                        if (var45[var50].field110.compareTo(var45[var50 + 1].field110) > 0) {
                            class8 var51 = var45[var50];
                            var45[var50] = var45[var50 + 1];
                            var45[var50 + 1] = var51;
                            var49 = false;
                        }
                    }
                    if (var49) {
                        break;
                    }
                }
                Statics.field1276 = var45;
                field499 = -1;
                return true;
            }
            if (field499 == 120) {
                field533 = field497.method2416() * 30;
                field650 = field640;
                field499 = -1;
                return true;
            }
            if (field499 == 115) {
                int var52 = field497.method2387();
                int var53 = field497.method2387();
                int var54 = field497.method2414();
                if (var54 == 65535) {
                    var54 = -1;
                }
                class156 var55 = class156.method822(var53);
                if (var55.field2595) {
                    var55.field2523 = var54;
                    var55.field2633 = var52;
                    class39 var57 = class39.method1818(var54);
                    var55.field2638 = var57.field986;
                    var55.field2569 = var57.field995;
                    var55.field2570 = var57.field970;
                    var55.field2566 = var57.field971;
                    var55.field2567 = var57.field972;
                    var55.field2529 = var57.field967;
                    if (var55.field2555 > 0) {
                        var55.field2529 = var55.field2529 * 32 / var55.field2555;
                    }
                    method1345(var55);
                } else if (var54 == -1) {
                    var55.field2560 = 0;
                    field499 = -1;
                    return true;
                } else {
                    class39 var56 = class39.method1818(var54);
                    var55.field2560 = 4;
                    var55.field2561 = var54;
                    var55.field2638 = var56.field986;
                    var55.field2569 = var56.field995;
                    var55.field2529 = var56.field967 * 100 / var52;
                    method1345(var55);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 152) {
                method1482();
                field622 = field497.method2399();
                field650 = field640;
                field499 = -1;
                return true;
            }
            if (field499 == 255) {
                field702 = false;
                for (int var58 = 0; var58 < 5; var58++) {
                    field703[var58] = false;
                }
                field499 = -1;
                return true;
            }
            if (field499 == 203) {
                Statics.field189 = field497.method2399();
                Statics.field83 = field497.method2407();
                while (field497.field2020 < field498) {
                    field499 = field497.method2399();
                    method101();
                }
                field499 = -1;
                return true;
            }
            if (field499 == 222) {
                int var59 = field497.method2415();
                int var60 = field497.method2425();
                int var61 = var59 >> 10 & 0x1F;
                int var62 = var59 >> 5 & 0x1F;
                int var63 = var59 & 0x1F;
                int var64 = (var63 << 3) + (var61 << 19) + (var62 << 11);
                class156 var65 = class156.method822(var60);
                if (var65.field2545 != var64) {
                    var65.field2545 = var64;
                    method1345(var65);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 60) {
                int var66 = field497.method2553();
                int var67 = field497.method2543();
                int var68 = field497.method2405();
                class4 var69 = (class4) field618.method3222((long) var67);
                if (var69 != null) {
                    method138(var69, var69.field61 != var68);
                }
                method607(var67, var68, var66);
                field499 = -1;
                return true;
            }
            if (field499 == 41) {
                int var70 = field497.method2405();
                int var71 = field497.method2399();
                int var72 = field497.method2405();
                if (field695 != 0 && var71 != 0 && field619 < 50) {
                    field697[field619] = var70;
                    field698[field619] = var71;
                    field699[field619] = var72;
                    field701[field619] = null;
                    field628[field619] = 0;
                    field619++;
                }
                field499 = -1;
                return true;
            }
            if (field499 == 217) {
                String var76 = field497.method2390();
                long var77 = field497.method2388();
                long var79 = (long) field497.method2405();
                long var81 = (long) field497.method2386();
                int var83 = field497.method2399();
                long var84 = (var79 << 32) + var81;
                boolean var86 = false;
                for (int var87 = 0; var87 < 100; var87++) {
                    if (field479[var87] == var84) {
                        var86 = true;
                        break;
                    }
                }
                if (var83 <= 1 && method25(var76)) {
                    var86 = true;
                }
                if (!var86 && field672 == 0) {
                    field479[field677] = var84;
                    field677 = (field677 + 1) % 100;
                    class115 var88 = field497;
                    String var89 = class182.method1335(var88, 32767);
                    String var90 = class183.method3321(class146.method2629(var89));
                    if (var83 == 2 || var83 == 3) {
                        method34(9, class2.method1341(1) + var76, var90, class145.method1817(var77));
                    } else if (var83 == 1) {
                        method34(9, class2.method1341(0) + var76, var90, class145.method1817(var77));
                    } else {
                        method34(9, var76, var90, class145.method1817(var77));
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 236) {
                boolean var91 = field497.method2583() == 1;
                int var92 = field497.method2387();
                class156 var93 = class156.method822(var92);
                if (var93.field2620 != var91) {
                    var93.field2620 = var91;
                    method1345(var93);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 181) {
                for (int var94 = 0; var94 < field576.length; var94++) {
                    if (field576[var94] != null) {
                        field576[var94].field422 = -1;
                    }
                }
                for (int var95 = 0; var95 < field492.length; var95++) {
                    if (field492[var95] != null) {
                        field492[var95].field422 = -1;
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 250) {
                method2246(false);
                field499 = -1;
                return true;
            }
            if (field499 == 142) {
                Statics.field83 = field497.method2583();
                Statics.field189 = field497.method2399();
                for (int var96 = Statics.field83; var96 < Statics.field83 + 8; var96++) {
                    for (int var97 = Statics.field189; var97 < Statics.field189 + 8; var97++) {
                        if (field589[Statics.field582][var96][var97] != null) {
                            field589[Statics.field582][var96][var97] = null;
                            method1327(var96, var97);
                        }
                    }
                }
                for (class21 var98 = (class21) field592.method3279(); var98 != null; var98 = (class21) field592.method3249()) {
                    if (var98.field337 >= Statics.field83 && var98.field337 < Statics.field83 + 8 && var98.field322 >= Statics.field189 && var98.field322 < Statics.field189 + 8 && Statics.field582 == var98.field324) {
                        var98.field333 = 0;
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 113) {
                while (field497.field2020 < field498) {
                    boolean var99 = field497.method2399() == 1;
                    String var100 = field497.method2390();
                    String var101 = field497.method2390();
                    int var102 = field497.method2405();
                    int var103 = field497.method2399();
                    int var104 = field497.method2399();
                    boolean var105 = (var104 & 0x2) != 0;
                    boolean var106 = (var104 & 0x1) != 0;
                    if (var102 > 0) {
                        field497.method2390();
                        field497.method2399();
                        field497.method2387();
                    }
                    field497.method2390();
                    for (int var107 = 0; var107 < field546; var107++) {
                        class22 var108 = field564[var107];
                        if (var99) {
                            if (var101.equals(var108.field347)) {
                                var108.field347 = var100;
                                var108.field341 = var101;
                                var100 = null;
                                break;
                            }
                        } else if (var100.equals(var108.field347)) {
                            if (var108.field342 != var102) {
                                boolean var109 = true;
                                for (class27 var110 = (class27) field462.method3209(); var110 != null; var110 = (class27) field462.method3210()) {
                                    if (var110.field721.equals(var100)) {
                                        if (var102 != 0 && var110.field722 == 0) {
                                            var110.method3286();
                                            var109 = false;
                                        } else if (var102 == 0 && var110.field722 != 0) {
                                            var110.method3286();
                                            var109 = false;
                                        }
                                    }
                                }
                                if (var109) {
                                    field462.method3208(new class27(var100, var102));
                                }
                                var108.field342 = var102;
                            }
                            var108.field341 = var101;
                            var108.field343 = var103;
                            var108.field344 = var105;
                            var108.field345 = var106;
                            var100 = null;
                            break;
                        }
                    }
                    if (var100 != null && field546 < 200) {
                        class22 var111 = new class22();
                        field564[field546] = var111;
                        var111.field347 = var100;
                        var111.field341 = var101;
                        var111.field342 = var102;
                        var111.field343 = var103;
                        var111.field344 = var105;
                        var111.field345 = var106;
                        field546++;
                    }
                }
                field717 = 2;
                field648 = field640;
                boolean var112 = false;
                int var113 = field546;
                while (var113 > 0) {
                    boolean var114 = true;
                    var113--;
                    for (int var115 = 0; var115 < var113; var115++) {
                        boolean var116 = false;
                        class22 var117 = field564[var115];
                        class22 var118 = field564[var115 + 1];
                        if (field714 != var117.field342 && field714 == var118.field342) {
                            var116 = true;
                        }
                        if (!var116 && var117.field342 == 0 && var118.field342 != 0) {
                            var116 = true;
                        }
                        if (!var116 && !var117.field344 && var118.field344) {
                            var116 = true;
                        }
                        if (!var116 && !var117.field345 && var118.field345) {
                            var116 = true;
                        }
                        if (var116) {
                            class22 var119 = field564[var115];
                            field564[var115] = field564[var115 + 1];
                            field564[var115 + 1] = var119;
                            var114 = false;
                        }
                    }
                    if (var114) {
                        break;
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 208) {
                field690 = field497.method2399();
                field499 = -1;
                return true;
            }
            if (field499 == 53) {
                int var120 = field497.method2387();
                Statics.field1990 = Statics.field16.method1484(var120);
                field499 = -1;
                return true;
            }
            if (field499 == 77) {
                int var121 = field497.method2399();
                int var122 = field497.method2399();
                int var123 = field497.method2399();
                int var124 = field497.method2399();
                field703[var121] = true;
                field704[var121] = var122;
                field688[var121] = var123;
                field706[var121] = var124;
                field554[var121] = 0;
                field499 = -1;
                return true;
            }
            if (field499 == 14) {
                String var125 = field497.method2390();
                class115 var126 = field497;
                String var127 = class182.method1335(var126, 32767);
                String var128 = class183.method3321(class146.method2629(var127));
                method8(6, var125, var128);
                field499 = -1;
                return true;
            }
            if (field499 == 166) {
                String var129 = field497.method2390();
                Object[] var130 = new Object[var129.length() + 1];
                for (int var131 = var129.length() - 1; var131 >= 0; var131--) {
                    if (var129.charAt(var131) == 's') {
                        var130[var131 + 1] = field497.method2390();
                    } else {
                        var130[var131 + 1] = Integer.valueOf(field497.method2387());
                    }
                }
                var130[0] = Integer.valueOf(field497.method2387());
                class1 var132 = new class1();
                var132.field1 = var130;
                class25.method1580(var132);
                field499 = -1;
                return true;
            }
            if (field499 == 88) {
                int var133 = field497.method2425();
                class156 var134 = class156.method822(var133);
                for (int var135 = 0; var135 < var134.field2630.length; var135++) {
                    var134.field2630[var135] = -1;
                    var134.field2630[var135] = 0;
                }
                method1345(var134);
                field499 = -1;
                return true;
            }
            if (field499 == 80) {
                String var136 = field497.method2390();
                if (var136.endsWith(":tradereq:")) {
                    String var137 = var136.substring(0, var136.indexOf(":"));
                    boolean var138 = false;
                    if (method25(var137)) {
                        var138 = true;
                    }
                    if (!var138 && field672 == 0) {
                        method8(4, var137, class133.field2195);
                    }
                } else if (var136.endsWith(":duelreq:")) {
                    String var139 = var136.substring(0, var136.indexOf(":"));
                    boolean var140 = false;
                    if (method25(var139)) {
                        var140 = true;
                    }
                    if (!var140 && field672 == 0) {
                        method8(8, var139, class133.field2159);
                    }
                } else if (var136.endsWith(":chalreq:")) {
                    String var141 = var136.substring(0, var136.indexOf(":"));
                    boolean var142 = false;
                    if (method25(var141)) {
                        var142 = true;
                    }
                    if (!var142 && field672 == 0) {
                        String var143 = var136.substring(var136.indexOf(":") + 1, var136.length() - 9);
                        method8(8, var141, var143);
                    }
                } else if (var136.endsWith(":assistreq:")) {
                    String var144 = var136.substring(0, var136.indexOf(":"));
                    boolean var145 = false;
                    if (method25(var144)) {
                        var145 = true;
                    }
                    if (!var145 && field672 == 0) {
                        method8(10, var144, "");
                    }
                } else if (var136.endsWith(":clan:")) {
                    String var146 = var136.substring(0, var136.indexOf(":clan:"));
                    method8(11, "", var146);
                } else if (var136.endsWith(":trade:")) {
                    String var147 = var136.substring(0, var136.indexOf(":trade:"));
                    if (field672 == 0) {
                        method8(12, "", var147);
                    }
                } else if (var136.endsWith(":assist:")) {
                    String var148 = var136.substring(0, var136.indexOf(":assist:"));
                    if (field672 == 0) {
                        method8(13, "", var148);
                    }
                } else {
                    method8(0, "", var136);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 78) {
                byte var149 = field497.method2409();
                int var150 = field497.method2405();
                class157.field2646[var150] = var149;
                if (class157.field2647[var150] != var149) {
                    class157.field2647[var150] = var149;
                    method127(var150);
                }
                field641[++field574 - 1 & 0x1F] = var150;
                field499 = -1;
                return true;
            }
            if (field499 == 56) {
                int var151 = field497.method2416();
                if (var151 == 65535) {
                    var151 = -1;
                }
                int var152 = field497.method2405();
                if (var152 == 65535) {
                    var152 = -1;
                }
                int var153 = field497.method2474();
                int var154 = field497.method2425();
                for (int var155 = var152; var155 <= var151; var155++) {
                    long var156 = ((long) var153 << 32) + (long) var155;
                    class177 var158 = field673.method3222(var156);
                    if (var158 != null) {
                        var158.method3289();
                    }
                    field673.method3223(new class169(var154), var156);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 241) {
                int var159 = field497.method2543();
                int var160 = field497.method2442();
                int var161 = field497.method2418();
                class156 var162 = class156.method822(var159);
                int var163 = var162.field2535 + var161;
                int var164 = var162.field2536 + var160;
                if (var162.field2540 != var163 || var162.field2534 != var164) {
                    var162.field2540 = var163;
                    var162.field2534 = var164;
                    method1345(var162);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 247) {
                int var165 = field497.method2399();
                int var166 = field497.method2583();
                String var167 = field497.method2390();
                if (var165 >= 1 && var165 <= 8) {
                    if (var167.equalsIgnoreCase("null")) {
                        var167 = null;
                    }
                    field565[var165 - 1] = var167;
                    field713[var165 - 1] = var166 == 0;
                }
                field499 = -1;
                return true;
            }
            if (field499 == 4) {
                field696 = field497.method2399();
                if (field696 == 1) {
                    field475 = field497.method2405();
                }
                if (field696 >= 2 && field696 <= 6) {
                    if (field696 == 2) {
                        field480 = 64;
                        field481 = 64;
                    }
                    if (field696 == 3) {
                        field480 = 0;
                        field481 = 64;
                    }
                    if (field696 == 4) {
                        field480 = 128;
                        field481 = 64;
                    }
                    if (field696 == 5) {
                        field480 = 64;
                        field481 = 0;
                    }
                    if (field696 == 6) {
                        field480 = 64;
                        field481 = 128;
                    }
                    field696 = 2;
                    field560 = field497.method2405();
                    field518 = field497.method2405();
                    field566 = field497.method2399();
                }
                if (field696 == 10) {
                    field476 = field497.method2405();
                }
                field499 = -1;
                return true;
            }
            if (field499 == 7) {
                String var168 = field497.method2390();
                long var169 = (long) field497.method2405();
                long var171 = (long) field497.method2386();
                int var173 = field497.method2399();
                long var174 = (var169 << 32) + var171;
                boolean var176 = false;
                for (int var177 = 0; var177 < 100; var177++) {
                    if (field479[var177] == var174) {
                        var176 = true;
                        break;
                    }
                }
                if (method25(var168)) {
                    var176 = true;
                }
                if (!var176 && field672 == 0) {
                    field479[field677] = var174;
                    field677 = (field677 + 1) % 100;
                    class115 var178 = field497;
                    String var179 = class182.method1335(var178, 32767);
                    String var180 = class183.method3321(class146.method2629(var179));
                    if (var173 == 2 || var173 == 3) {
                        method8(7, class2.method1341(1) + var168, var180);
                    } else if (var173 == 1) {
                        method8(7, class2.method1341(0) + var168, var180);
                    } else {
                        method8(3, var168, var180);
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 106) {
                int var181 = field498 + field497.field2020;
                int var182 = field497.method2405();
                int var183 = field497.method2405();
                if (field617 != var182) {
                    field617 = var182;
                    method206(field617);
                    class25.method133(field617);
                    for (int var184 = 0; var184 < 100; var184++) {
                        field660[var184] = true;
                    }
                }
                while (var183-- > 0) {
                    int var185 = field497.method2387();
                    int var186 = field497.method2405();
                    int var187 = field497.method2399();
                    class4 var188 = (class4) field618.method3222((long) var185);
                    if (var188 != null && var188.field61 != var186) {
                        method138(var188, true);
                        var188 = null;
                    }
                    if (var188 == null) {
                        var188 = method607(var185, var186, var187);
                    }
                    var188.field62 = true;
                }
                for (class4 var189 = (class4) field618.method3225(); var189 != null; var189 = (class4) field618.method3230()) {
                    if (var189.field62) {
                        var189.field62 = false;
                    } else {
                        method138(var189, true);
                    }
                }
                field673 = new class173(512);
                while (field497.field2020 < var181) {
                    int var190 = field497.method2387();
                    int var191 = field497.method2405();
                    int var192 = field497.method2405();
                    int var193 = field497.method2387();
                    for (int var194 = var191; var194 <= var192; var194++) {
                        long var195 = ((long) var190 << 32) + (long) var194;
                        field673.method3223(new class169(var193), var195);
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 101) {
                int var197 = field497.method2387();
                String var198 = field497.method2390();
                class156 var199 = class156.method822(var197);
                if (!var198.equals(var199.field2575)) {
                    var199.field2575 = var198;
                    method1345(var199);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 209) {
                while (field497.field2020 < field498) {
                    int var200 = field497.method2399();
                    boolean var201 = (var200 & 0x1) == 1;
                    String var202 = field497.method2390();
                    String var203 = field497.method2390();
                    field497.method2390();
                    for (int var204 = 0; var204 < field694; var204++) {
                        class11 var205 = field685[var204];
                        if (var201) {
                            if (var203.equals(var205.field179)) {
                                var205.field179 = var202;
                                var205.field178 = var203;
                                var202 = null;
                                break;
                            }
                        } else if (var202.equals(var205.field179)) {
                            var205.field179 = var202;
                            var205.field178 = var203;
                            var202 = null;
                            break;
                        }
                    }
                    if (var202 != null && field694 < 100) {
                        class11 var206 = new class11();
                        field685[field694] = var206;
                        var206.field179 = var202;
                        var206.field178 = var203;
                        field694++;
                    }
                }
                field648 = field640;
                field499 = -1;
                return true;
            }
            if (field499 == 85) {
                int var207 = field497.method2387();
                class4 var208 = (class4) field618.method3222((long) var207);
                if (var208 != null) {
                    method138(var208, true);
                }
                if (field621 != null) {
                    method1345(field621);
                    field621 = null;
                }
                field499 = -1;
                return true;
            }
            if (field499 == 213) {
                int var209 = field497.method2387();
                int var210 = field497.method2414();
                class157.field2646[var210] = var209;
                if (class157.field2647[var210] != var209) {
                    class157.field2647[var210] = var209;
                    method127(var210);
                }
                field641[++field574 - 1 & 0x1F] = var210;
                field499 = -1;
                return true;
            }
            if (field499 == 123) {
                field717 = 1;
                field648 = field640;
                field499 = -1;
                return true;
            }
            if (field499 == 245) {
                int var211 = field497.method2387();
                int var212 = field497.method2405();
                if (var211 < -70000) {
                    var212 += 32768;
                }
                class156 var213;
                if (var211 >= 0) {
                    var213 = class156.method822(var211);
                } else {
                    var213 = null;
                }
                if (var213 != null) {
                    for (int var214 = 0; var214 < var213.field2630.length; var214++) {
                        var213.field2630[var214] = 0;
                        var213.field2631[var214] = 0;
                    }
                }
                class18.method777(var212);
                int var215 = field497.method2405();
                for (int var216 = 0; var216 < var215; var216++) {
                    int var217 = field497.method2399();
                    if (var217 == 255) {
                        var217 = field497.method2425();
                    }
                    int var218 = field497.method2416();
                    if (var213 != null && var216 < var213.field2630.length) {
                        var213.field2630[var216] = var218;
                        var213.field2631[var216] = var217;
                    }
                    class18.method204(var212, var216, var218 - 1, var217);
                }
                if (var213 != null) {
                    method1345(var213);
                }
                method1482();
                field644[++field664 - 1 & 0x1F] = var212 & 0x7FFF;
                field499 = -1;
                return true;
            }
            if (field499 == 146) {
                method2246(true);
                field499 = -1;
                return true;
            }
            if (field499 == 232) {
                String var219 = field497.method2390();
                int var220 = field497.method2405();
                byte var221 = field497.method2383();
                boolean var222 = false;
                if (var221 == -128) {
                    var222 = true;
                }
                if (var222) {
                    if (Statics.field1228 == 0) {
                        field499 = -1;
                        return true;
                    }
                    boolean var223 = false;
                    int var224;
                    for (var224 = 0; var224 < Statics.field1228 && (!Statics.field1276[var224].field116.equals(var219) || Statics.field1276[var224].field120 != var220); var224++) {
                    }
                    if (var224 < Statics.field1228) {
                        while (var224 < Statics.field1228 - 1) {
                            Statics.field1276[var224] = Statics.field1276[var224 + 1];
                            var224++;
                        }
                        Statics.field1228--;
                        Statics.field1276[Statics.field1228] = null;
                    }
                } else {
                    field497.method2390();
                    class8 var225 = new class8();
                    var225.field116 = var219;
                    var225.field110 = class147.method51(var225.field116, Statics.field183);
                    var225.field120 = var220;
                    var225.field112 = var221;
                    int var226;
                    for (var226 = Statics.field1228 - 1; var226 >= 0; var226--) {
                        int var227 = Statics.field1276[var226].field110.compareTo(var225.field116);
                        if (var227 == 0) {
                            Statics.field1276[var226].field120 = var220;
                            Statics.field1276[var226].field112 = var221;
                            if (var219.equals(Statics.field244.field37)) {
                                Statics.field1924 = var221;
                            }
                            field649 = field640;
                            field499 = -1;
                            return true;
                        }
                        if (var227 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1228 >= Statics.field1276.length) {
                        field499 = -1;
                        return true;
                    }
                    for (int var228 = Statics.field1228 - 1; var228 > var226; var228--) {
                        Statics.field1276[var228 + 1] = Statics.field1276[var228];
                    }
                    if (Statics.field1228 == 0) {
                        Statics.field1276 = new class8[100];
                    }
                    Statics.field1276[var226 + 1] = var225;
                    Statics.field1228++;
                    if (var219.equals(Statics.field244.field37)) {
                        Statics.field1924 = var221;
                    }
                }
                field649 = field640;
                field499 = -1;
                return true;
            }
            if (field499 == 48) {
                for (int var229 = 0; var229 < class157.field2647.length; var229++) {
                    if (class157.field2647[var229] != class157.field2646[var229]) {
                        class157.field2647[var229] = class157.field2646[var229];
                        method127(var229);
                        field641[++field574 - 1 & 0x1F] = var229;
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 65) {
                int var230 = field497.method2416();
                class18 var231 = (class18) class18.field263.method3222((long) var230);
                if (var231 != null) {
                    var231.method3289();
                }
                field644[++field664 - 1 & 0x1F] = var230 & 0x7FFF;
                field499 = -1;
                return true;
            }
            if (field499 == 165) {
                field497.field2020 += 28;
                if (field497.method2402()) {
                    class81.method2360(field497, field497.field2020 - 28);
                }
                field499 = -1;
                return true;
            }
            if (field499 == 238) {
                method1482();
                int var232 = field497.method2399();
                int var233 = field497.method2425();
                int var234 = field497.method2407();
                field715[var232] = var233;
                field595[var232] = var234;
                field596[var232] = 1;
                for (int var235 = 0; var235 < 98; var235++) {
                    if (var233 >= class129.field2029[var235]) {
                        field596[var232] = var235 + 2;
                    }
                }
                field693[++field646 - 1 & 0x1F] = var232;
                field499 = -1;
                return true;
            }
            if (field499 == 98) {
                int var236 = field497.method2399();
                class136[] var237 = new class136[] { class136.field2302, class136.field2307, class136.field2304 };
                class136[] var238 = var237;
                int var239 = 0;
                class136 var241;
                while (true) {
                    if (var239 >= var238.length) {
                        var241 = null;
                        break;
                    }
                    class136 var240 = var238[var239];
                    if (var240.field2305 == var236) {
                        var241 = var240;
                        break;
                    }
                    var239++;
                }
                Statics.field1651 = var241;
                field499 = -1;
                return true;
            }
            if (field499 == 122) {
                field702 = true;
                Statics.field1639 = field497.method2399();
                Statics.field51 = field497.method2399();
                Statics.field2440 = field497.method2405();
                Statics.field2674 = field497.method2399();
                Statics.field1910 = field497.method2399();
                if (Statics.field1910 >= 100) {
                    int var242 = Statics.field1639 * 128 + 64;
                    int var243 = Statics.field51 * 128 + 64;
                    int var244 = method3106(var242, var243, Statics.field582) - Statics.field2440;
                    int var245 = var242 - Statics.field340;
                    int var246 = var244 - Statics.field736;
                    int var247 = var243 - Statics.field1645;
                    int var248 = (int) Math.sqrt((double) (var245 * var245 + var247 * var247));
                    Statics.field541 = (int) (Math.atan2((double) var246, (double) var248) * 325.949D) & 0x7FF;
                    Statics.field56 = (int) (Math.atan2((double) var245, (double) var247) * -325.949D) & 0x7FF;
                    if (Statics.field541 < 128) {
                        Statics.field541 = 128;
                    }
                    if (Statics.field541 > 383) {
                        Statics.field541 = 383;
                    }
                }
                field499 = -1;
                return true;
            }
            if (field499 == 145) {
                int var249 = field497.method2414();
                if (var249 == 65535) {
                    var249 = -1;
                }
                method226(var249);
                field499 = -1;
                return true;
            }
            if (field499 == 72) {
                int var250 = field497.method2559();
                int var251 = field497.method2416();
                if (var251 == 65535) {
                    var251 = -1;
                }
                method659(var251, var250);
                field499 = -1;
                return true;
            }
            class79.method2299("" + field499 + class2.field24 + field504 + class2.field24 + field505 + class2.field24 + field498, (Throwable) null);
            method36();
        } catch (IOException var256) {
            method231();
        } catch (Exception var257) {
            String var254 = "" + field499 + class2.field24 + field504 + class2.field24 + field505 + class2.field24 + field498 + class2.field24 + (Statics.field953 + Statics.field244.field409[0]) + class2.field24 + (Statics.field450 + Statics.field244.field446[0]) + class2.field24;
            for (int var255 = 0; var255 < field498 && var255 < 50; var255++) {
                var254 = var254 + field497.field2025[var255] + class2.field24;
            }
            class79.method2299(var254, var257);
            method36();
        }
        return true;
    }

    @ObfuscatedName("g.bs(B)V")
    public static final void method101() {
        if (field499 == 157) {
            int var0 = field497.method2399();
            int var1 = (var0 >> 4 & 0x7) + Statics.field83;
            int var2 = (var0 & 0x7) + Statics.field189;
            int var3 = field497.method2405();
            int var4 = field497.method2399();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field497.method2399();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field244.field409[0] >= var1 - var8 && Statics.field244.field409[0] <= var1 + var8 && Statics.field244.field446[0] >= var2 - var8 && Statics.field244.field446[0] <= var2 + var8 && field711 != 0 && var6 > 0 && field619 < 50) {
                    field697[field619] = var3;
                    field698[field619] = var6;
                    field699[field619] = var7;
                    field701[field619] = null;
                    field628[field619] = (var1 << 16) + (var2 << 8) + var5;
                    field619++;
                }
            }
        }
        if (field499 == 116) {
            int var9 = field497.method2583();
            int var10 = (var9 >> 4 & 0x7) + Statics.field83;
            int var11 = (var9 & 0x7) + Statics.field189;
            int var12 = field497.method2416();
            int var13 = field497.method2416();
            int var14 = field497.method2415();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && field583 != var13) {
                class16 var15 = new class16();
                var15.field252 = var12;
                var15.field246 = var14;
                if (field589[Statics.field582][var10][var11] == null) {
                    field589[Statics.field582][var10][var11] = new class175();
                }
                field589[Statics.field582][var10][var11].method3283(var15);
                method1327(var10, var11);
            }
        } else if (field499 == 114) {
            int var16 = field497.method2399();
            int var17 = (var16 >> 4 & 0x7) + Statics.field83;
            int var18 = (var16 & 0x7) + Statics.field189;
            int var19 = var17 + field497.method2383();
            int var20 = var18 + field497.method2383();
            int var21 = field497.method2385();
            int var22 = field497.method2405();
            int var23 = field497.method2399() * 4;
            int var24 = field497.method2399() * 4;
            int var25 = field497.method2405();
            int var26 = field497.method2405();
            int var27 = field497.method2399();
            int var28 = field497.method2399();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104 && var19 >= 0 && var20 >= 0 && var19 < 104 && var20 < 104 && var22 != 65535) {
                int var29 = var17 * 128 + 64;
                int var30 = var18 * 128 + 64;
                int var31 = var19 * 128 + 64;
                int var32 = var20 * 128 + 64;
                class10 var33 = new class10(var22, Statics.field582, var29, var30, method3106(var29, var30, Statics.field582) - var23, field636 + var25, field636 + var26, var27, var28, var21, var24);
                var33.method104(var31, var32, method3106(var31, var32, Statics.field582) - var24, field636 + var25);
                field460.method3283(var33);
            }
        } else if (field499 == 74) {
            int var34 = field497.method2407();
            int var35 = (var34 >> 4 & 0x7) + Statics.field83;
            int var36 = (var34 & 0x7) + Statics.field189;
            int var37 = field497.method2583();
            int var38 = var37 >> 2;
            int var39 = var37 & 0x3;
            int var40 = field516[var38];
            if (var35 >= 0 && var36 >= 0 && var35 < 104 && var36 < 104) {
                method748(Statics.field582, var35, var36, var40, -1, var38, var39, 0, -1);
            }
        } else if (field499 == 221) {
            int var41 = field497.method2583();
            int var42 = (var41 >> 4 & 0x7) + Statics.field83;
            int var43 = (var41 & 0x7) + Statics.field189;
            int var44 = field497.method2405();
            if (var42 >= 0 && var43 >= 0 && var42 < 104 && var43 < 104) {
                class175 var45 = field589[Statics.field582][var42][var43];
                if (var45 != null) {
                    for (class16 var46 = (class16) var45.method3279(); var46 != null; var46 = (class16) var45.method3249()) {
                        if ((var44 & 0x7FFF) == var46.field252) {
                            var46.method3289();
                            break;
                        }
                    }
                    if (var45.method3279() == null) {
                        field589[Statics.field582][var42][var43] = null;
                    }
                    method1327(var42, var43);
                }
            }
        } else if (field499 == 46) {
            int var47 = field497.method2399();
            int var48 = (var47 >> 4 & 0x7) + Statics.field83;
            int var49 = (var47 & 0x7) + Statics.field189;
            int var50 = field497.method2405();
            int var51 = field497.method2399();
            int var52 = field497.method2405();
            if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                int var53 = var48 * 128 + 64;
                int var54 = var49 * 128 + 64;
                class19 var55 = new class19(var50, Statics.field582, var53, var54, method3106(var53, var54, Statics.field582) - var51, var52, field636);
                field458.method3283(var55);
            }
        } else if (field499 == 135) {
            int var56 = field497.method2407();
            int var57 = var56 >> 2;
            int var58 = var56 & 0x3;
            int var59 = field516[var57];
            int var60 = field497.method2405();
            int var61 = field497.method2553();
            int var62 = (var61 >> 4 & 0x7) + Statics.field83;
            int var63 = (var61 & 0x7) + Statics.field189;
            if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                method748(Statics.field582, var62, var63, var59, var60, var57, var58, 0, -1);
            }
        } else {
            if (field499 == 144) {
                int var64 = field497.method2416();
                int var65 = field497.method2553();
                int var66 = var65 >> 2;
                int var67 = var65 & 0x3;
                int var68 = field516[var66];
                int var69 = field497.method2553();
                int var70 = (var69 >> 4 & 0x7) + Statics.field83;
                int var71 = (var69 & 0x7) + Statics.field189;
                byte var72 = field497.method2411();
                int var73 = field497.method2416();
                byte var74 = field497.method2409();
                byte var75 = field497.method2411();
                int var76 = field497.method2414();
                byte var77 = field497.method2383();
                int var78 = field497.method2415();
                class3 var79;
                if (field583 == var76) {
                    var79 = Statics.field244;
                } else {
                    var79 = field576[var76];
                }
                if (var79 != null) {
                    class31 var80 = class31.method35(var78);
                    int var81;
                    int var82;
                    if (var67 == 1 || var67 == 3) {
                        var81 = var80.field814;
                        var82 = var80.field808;
                    } else {
                        var81 = var80.field808;
                        var82 = var80.field814;
                    }
                    int var83 = (var81 >> 1) + var70;
                    int var84 = (var81 + 1 >> 1) + var70;
                    int var85 = (var82 >> 1) + var71;
                    int var86 = (var82 + 1 >> 1) + var71;
                    int[][] var87 = class9.field145[Statics.field582];
                    int var88 = var87[var83][var85] + var87[var84][var85] + var87[var83][var86] + var87[var84][var86] >> 2;
                    int var89 = (var70 << 7) + (var81 << 6);
                    int var90 = (var71 << 7) + (var82 << 6);
                    class111 var91 = var80.method627(var66, var67, var87, var89, var88, var90);
                    if (var91 != null) {
                        method748(Statics.field582, var70, var71, var68, -1, 0, 0, var64 + 1, var73 + 1);
                        var79.field47 = field636 + var64;
                        var79.field44 = field636 + var73;
                        var79.field48 = var91;
                        var79.field45 = var70 * 128 + var81 * 64;
                        var79.field38 = var71 * 128 + var82 * 64;
                        var79.field46 = var88;
                        if (var72 > var74) {
                            byte var92 = var72;
                            var72 = var74;
                            var74 = var92;
                        }
                        if (var75 > var77) {
                            byte var93 = var75;
                            var75 = var77;
                            var77 = var93;
                        }
                        var79.field49 = var70 + var72;
                        var79.field53 = var70 + var74;
                        var79.field50 = var71 + var75;
                        var79.field52 = var71 + var77;
                    }
                }
            }
            if (field499 == 17) {
                int var94 = field497.method2553();
                int var95 = (var94 >> 4 & 0x7) + Statics.field83;
                int var96 = (var94 & 0x7) + Statics.field189;
                int var97 = field497.method2399();
                int var98 = var97 >> 2;
                int var99 = var97 & 0x3;
                int var100 = field516[var98];
                int var101 = field497.method2415();
                if (var95 >= 0 && var96 >= 0 && var95 < 103 && var96 < 103) {
                    if (var100 == 0) {
                        class95 var102 = Statics.field362.method1851(Statics.field582, var95, var96);
                        if (var102 != null) {
                            int var103 = var102.field1606 >> 14 & 0x7FFF;
                            if (var98 == 2) {
                                var102.field1604 = new class13(var103, 2, var99 + 4, Statics.field582, var95, var96, var101, false, var102.field1604);
                                var102.field1609 = new class13(var103, 2, var99 + 1 & 0x3, Statics.field582, var95, var96, var101, false, var102.field1609);
                            } else {
                                var102.field1604 = new class13(var103, var98, var99, Statics.field582, var95, var96, var101, false, var102.field1604);
                            }
                        }
                    }
                    if (var100 == 1) {
                        class107 var104 = Statics.field362.method1869(Statics.field582, var95, var96);
                        if (var104 != null) {
                            int var105 = var104.field1793 >> 14 & 0x7FFF;
                            if (var98 == 4 || var98 == 5) {
                                var104.field1785 = new class13(var105, 4, var99, Statics.field582, var95, var96, var101, false, var104.field1785);
                            } else if (var98 == 6) {
                                var104.field1785 = new class13(var105, 4, var99 + 4, Statics.field582, var95, var96, var101, false, var104.field1785);
                            } else if (var98 == 7) {
                                var104.field1785 = new class13(var105, 4, (var99 + 2 & 0x3) + 4, Statics.field582, var95, var96, var101, false, var104.field1785);
                            } else if (var98 == 8) {
                                var104.field1785 = new class13(var105, 4, var99 + 4, Statics.field582, var95, var96, var101, false, var104.field1785);
                                var104.field1792 = new class13(var105, 4, (var99 + 2 & 0x3) + 4, Statics.field582, var95, var96, var101, false, var104.field1792);
                            }
                        }
                    }
                    if (var100 == 2) {
                        class97 var106 = Statics.field362.method1853(Statics.field582, var95, var96);
                        if (var98 == 11) {
                            var98 = 10;
                        }
                        if (var106 != null) {
                            var106.field1624 = new class13(var106.field1625 >> 14 & 0x7FFF, var98, var99, Statics.field582, var95, var96, var101, false, var106.field1624);
                        }
                    }
                    if (var100 == 3) {
                        class106 var107 = Statics.field362.method1854(Statics.field582, var95, var96);
                        if (var107 != null) {
                            var107.field1774 = new class13(var107.field1778 >> 14 & 0x7FFF, 22, var99, Statics.field582, var95, var96, var101, false, var107.field1774);
                        }
                    }
                }
            } else if (field499 == 3) {
                int var108 = field497.method2399();
                int var109 = (var108 >> 4 & 0x7) + Statics.field83;
                int var110 = (var108 & 0x7) + Statics.field189;
                int var111 = field497.method2405();
                int var112 = field497.method2405();
                int var113 = field497.method2405();
                if (var109 >= 0 && var110 >= 0 && var109 < 104 && var110 < 104) {
                    class175 var114 = field589[Statics.field582][var109][var110];
                    if (var114 != null) {
                        for (class16 var115 = (class16) var114.method3279(); var115 != null; var115 = (class16) var114.method3249()) {
                            if ((var111 & 0x7FFF) == var115.field252 && var115.field246 == var112) {
                                var115.field246 = var113;
                                break;
                            }
                        }
                        method1327(var109, var110);
                    }
                }
            } else if (field499 == 210) {
                int var116 = field497.method2407();
                int var117 = (var116 >> 4 & 0x7) + Statics.field83;
                int var118 = (var116 & 0x7) + Statics.field189;
                int var119 = field497.method2414();
                int var120 = field497.method2415();
                if (var117 >= 0 && var118 >= 0 && var117 < 104 && var118 < 104) {
                    class16 var121 = new class16();
                    var121.field252 = var119;
                    var121.field246 = var120;
                    if (field589[Statics.field582][var117][var118] == null) {
                        field589[Statics.field582][var117][var118] = new class175();
                    }
                    field589[Statics.field582][var117][var118].method3283(var121);
                    method1327(var117, var118);
                }
            }
        }
    }

    @ObfuscatedName("ac.bi(IIIIIIIIIS)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field592.method3279(); var10 != null; var10 = (class21) field592.method3249()) {
            if (var10.field324 == arg0 && var10.field337 == arg1 && var10.field322 == arg2 && var10.field339 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field324 = arg0;
            var9.field339 = arg3;
            var9.field337 = arg1;
            var9.field322 = arg2;
            method1209(var9);
            field592.method3283(var9);
        }
        var9.field329 = arg4;
        var9.field331 = arg5;
        var9.field330 = arg6;
        var9.field332 = arg7;
        var9.field333 = arg8;
    }

    @ObfuscatedName("dm.bg(I)V")
    public static final void method2366() {
        for (class21 var0 = (class21) field592.method3279(); var0 != null; var0 = (class21) field592.method3249()) {
            if (var0.field333 == -1) {
                var0.field332 = 0;
                method1209(var0);
            } else {
                var0.method3289();
            }
        }
    }

    @ObfuscatedName("bz.bb(Lp;I)V")
    public static final void method1209(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field339 == 0) {
            var1 = Statics.field362.method1855(arg0.field324, arg0.field337, arg0.field322);
        }
        if (arg0.field339 == 1) {
            var1 = Statics.field362.method1856(arg0.field324, arg0.field337, arg0.field322);
        }
        if (arg0.field339 == 2) {
            var1 = Statics.field362.method1988(arg0.field324, arg0.field337, arg0.field322);
        }
        if (arg0.field339 == 3) {
            var1 = Statics.field362.method1858(arg0.field324, arg0.field337, arg0.field322);
        }
        if (var1 != 0) {
            int var5 = Statics.field362.method1859(arg0.field324, arg0.field337, arg0.field322, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field326 = var2;
        arg0.field328 = var3;
        arg0.field323 = var4;
    }

    @ObfuscatedName("u.bj(IIIIIIII)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field461 && Statics.field582 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field362.method1855(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field362.method1856(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field362.method1988(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field362.method1858(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field362.method1859(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field362.method1846(arg0, arg2, arg3);
                class31 var15 = class31.method35(var12);
                if (var15.field800 != 0) {
                    field513[arg0].method3140(arg2, arg3, var13, var14, var15.field811);
                }
            }
            if (arg1 == 1) {
                Statics.field362.method1843(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field362.method1887(arg0, arg2, arg3);
                class31 var16 = class31.method35(var12);
                if (var16.field808 + arg2 > 103 || var16.field808 + arg3 > 103 || var16.field814 + arg2 > 103 || var16.field814 + arg3 > 103) {
                    return;
                }
                if (var16.field800 != 0) {
                    field513[arg0].method3141(arg2, arg3, var16.field808, var16.field814, var14, var16.field811);
                }
            }
            if (arg1 == 3) {
                Statics.field362.method1849(arg0, arg2, arg3);
                class31 var17 = class31.method35(var12);
                if (var17.field800 == 1) {
                    field513[arg0].method3165(arg2, arg3);
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
        class94 var19 = Statics.field362;
        class162 var20 = field513[arg0];
        class31 var21 = class31.method35(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field814;
            var23 = var21.field808;
        } else {
            var22 = var21.field808;
            var23 = var21.field814;
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
        int[][] var28 = class9.field145[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field812 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field834 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class93 var34;
            if (var21.field810 == -1 && var21.field835 == null) {
                var34 = var21.method627(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1835(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field800 == 1) {
                var20.method3136(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var57;
            if (var21.field810 == -1 && var21.field835 == null) {
                var57 = var21.method627(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            if (var57 != null) {
                var19.method1838(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field800 != 0) {
                var20.method3151(arg2, arg3, var22, var23, var21.field811);
            }
        } else if (arg6 >= 12) {
            class93 var35;
            if (var21.field810 == -1 && var21.field835 == null) {
                var35 = var21.method627(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1838(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field800 != 0) {
                var20.method3151(arg2, arg3, var22, var23, var21.field811);
            }
        } else if (arg6 == 0) {
            class93 var36;
            if (var21.field810 == -1 && var21.field835 == null) {
                var36 = var21.method627(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1996(arg0, arg2, arg3, var29, var36, (class93) null, class9.field132[arg5], 0, var32, var33);
            if (var21.field800 != 0) {
                var20.method3135(arg2, arg3, arg6, arg5, var21.field811);
            }
        } else if (arg6 == 1) {
            class93 var37;
            if (var21.field810 == -1 && var21.field835 == null) {
                var37 = var21.method627(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1996(arg0, arg2, arg3, var29, var37, (class93) null, class9.field123[arg5], 0, var32, var33);
            if (var21.field800 != 0) {
                var20.method3135(arg2, arg3, arg6, arg5, var21.field811);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class93 var39;
            class93 var40;
            if (var21.field810 == -1 && var21.field835 == null) {
                var39 = var21.method627(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method627(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field810, true, (class93) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1996(arg0, arg2, arg3, var29, var39, var40, class9.field132[arg5], class9.field132[var38], var32, var33);
            if (var21.field800 != 0) {
                var20.method3135(arg2, arg3, arg6, arg5, var21.field811);
            }
        } else if (arg6 == 3) {
            class93 var41;
            if (var21.field810 == -1 && var21.field835 == null) {
                var41 = var21.method627(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1996(arg0, arg2, arg3, var29, var41, (class93) null, class9.field123[arg5], 0, var32, var33);
            if (var21.field800 != 0) {
                var20.method3135(arg2, arg3, arg6, arg5, var21.field811);
            }
        } else if (arg6 == 9) {
            class93 var42;
            if (var21.field810 == -1 && var21.field835 == null) {
                var42 = var21.method627(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1838(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field800 != 0) {
                var20.method3151(arg2, arg3, var22, var23, var21.field811);
            }
        } else if (arg6 == 4) {
            class93 var43;
            if (var21.field810 == -1 && var21.field835 == null) {
                var43 = var21.method627(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1955(arg0, arg2, arg3, var29, var43, (class93) null, class9.field132[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1855(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class31.method35(var45 >> 14 & 0x7FFF).field817;
            }
            class93 var46;
            if (var21.field810 == -1 && var21.field835 == null) {
                var46 = var21.method627(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1955(arg0, arg2, arg3, var29, var46, (class93) null, class9.field132[arg5], 0, class9.field134[arg5] * var44, class9.field135[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1855(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class31.method35(var48 >> 14 & 0x7FFF).field817 / 2;
            }
            class93 var49;
            if (var21.field810 == -1 && var21.field835 == null) {
                var49 = var21.method627(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1955(arg0, arg2, arg3, var29, var49, (class93) null, 256, arg5, class9.field144[arg5] * var47, class9.field137[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class93 var51;
            if (var21.field810 == -1 && var21.field835 == null) {
                var51 = var21.method627(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1955(arg0, arg2, arg3, var29, var51, (class93) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1855(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class31.method35(var53 >> 14 & 0x7FFF).field817 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class93 var55;
            class93 var56;
            if (var21.field810 == -1 && var21.field835 == null) {
                var55 = var21.method627(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method627(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field810, true, (class93) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field810, true, (class93) null);
            }
            var19.method1955(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field144[arg5] * var52, class9.field137[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("bm.bl(IIB)V")
    public static final void method1327(int arg0, int arg1) {
        class175 var2 = field589[Statics.field582][arg0][arg1];
        if (var2 == null) {
            Statics.field362.method1850(Statics.field582, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3279(); var5 != null; var5 = (class16) var2.method3249()) {
            class39 var6 = class39.method1818(var5.field252);
            int var7 = var6.field974;
            if (var6.field973 == 1) {
                var7 = (var5.field246 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field362.method1850(Statics.field582, arg0, arg1);
            return;
        }
        var2.method3244(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3279(); var10 != null; var10 = (class16) var2.method3249()) {
            if (var4.field252 != var10.field252) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field252 != var10.field252 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field362.method1836(Statics.field582, arg0, arg1, method3106(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field582), var4, var11, var8, var9);
    }

    @ObfuscatedName("x.bm(I)V")
    public static final void method20() {
        field585 = 0;
        field579 = 0;
        field497.method2255();
        int var0 = field497.method2256(1);
        if (var0 != 0) {
            int var1 = field497.method2256(2);
            if (var1 == 0) {
                field580[++field579 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field497.method2256(3);
                Statics.field244.method234(var2, false);
                int var3 = field497.method2256(1);
                if (var3 == 1) {
                    field580[++field579 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field497.method2256(3);
                Statics.field244.method234(var4, true);
                int var5 = field497.method2256(3);
                Statics.field244.method234(var5, true);
                int var6 = field497.method2256(1);
                if (var6 == 1) {
                    field580[++field579 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field497.method2256(1);
                if (var7 == 1) {
                    field580[++field579 - 1] = 2047;
                }
                int var8 = field497.method2256(7);
                int var9 = field497.method2256(1);
                int var10 = field497.method2256(7);
                Statics.field582 = field497.method2256(2);
                Statics.field244.method233(var8, var10, var9 == 1);
            }
        }
        int var11 = field497.method2256(8);
        if (var11 < field577) {
            for (int var12 = var11; var12 < field577; var12++) {
                field593[++field585 - 1] = field578[var12];
            }
        }
        if (var11 > field577) {
            throw new RuntimeException("");
        }
        field577 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field578[var13];
            class3 var15 = field576[var14];
            int var16 = field497.method2256(1);
            if (var16 == 0) {
                field578[++field577 - 1] = var14;
                var15.field439 = field636;
            } else {
                int var17 = field497.method2256(2);
                if (var17 == 0) {
                    field578[++field577 - 1] = var14;
                    var15.field439 = field636;
                    field580[++field579 - 1] = var14;
                } else if (var17 == 1) {
                    field578[++field577 - 1] = var14;
                    var15.field439 = field636;
                    int var18 = field497.method2256(3);
                    var15.method234(var18, false);
                    int var19 = field497.method2256(1);
                    if (var19 == 1) {
                        field580[++field579 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field578[++field577 - 1] = var14;
                    var15.field439 = field636;
                    int var20 = field497.method2256(3);
                    var15.method234(var20, true);
                    int var21 = field497.method2256(3);
                    var15.method234(var21, true);
                    int var22 = field497.method2256(1);
                    if (var22 == 1) {
                        field580[++field579 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field593[++field585 - 1] = var14;
                }
            }
        }
        while (field497.method2258(field498) >= 11) {
            int var23 = field497.method2256(11);
            if (var23 == 2047) {
                break;
            }
            boolean var49 = false;
            if (field576[var23] == null) {
                field576[var23] = new class3();
                if (field555[var23] != null) {
                    field576[var23].method15(field555[var23]);
                }
                var49 = true;
            }
            field578[++field577 - 1] = var23;
            class3 var50 = field576[var23];
            var50.field439 = field636;
            int var51 = field497.method2256(1);
            if (var51 == 1) {
                field580[++field579 - 1] = var23;
            }
            int var52 = field497.method2256(1);
            int var53 = field590[field497.method2256(3)];
            if (var49) {
                var50.field441 = var50.field427 = var53;
            }
            int var54 = field497.method2256(5);
            if (var54 > 15) {
                var54 -= 32;
            }
            int var55 = field497.method2256(5);
            if (var55 > 15) {
                var55 -= 32;
            }
            var50.method233(Statics.field244.field409[0] + var54, Statics.field244.field446[0] + var55, var52 == 1);
        }
        field497.method2269();
        for (int var24 = 0; var24 < field579; var24++) {
            int var25 = field580[var24];
            class3 var26 = field576[var25];
            int var27 = field497.method2399();
            if ((var27 & 0x40) != 0) {
                var27 += field497.method2399() << 8;
            }
            if ((var27 & 0x400) != 0) {
                var26.field444 = field497.method2553();
                var26.field434 = field497.method2583();
                var26.field433 = field497.method2399();
                var26.field435 = field497.method2407();
                var26.field415 = field497.method2405() + field636;
                var26.field393 = field497.method2405() + field636;
                var26.field416 = field497.method2399();
                var26.field400 = 1;
                var26.field449 = 0;
            }
            if ((var27 & 0x1) != 0) {
                int var28 = field497.method2405();
                if (var28 == 65535) {
                    var28 = -1;
                }
                int var29 = field497.method2553();
                method2244(var26, var28, var29);
            }
            if ((var27 & 0x20) != 0) {
                var26.field406 = field497.method2390();
                if (var26.field406.charAt(0) == '~') {
                    var26.field406 = var26.field406.substring(1);
                    method8(2, var26.field37, var26.field406);
                } else if (Statics.field244 == var26) {
                    method8(2, var26.field37, var26.field406);
                }
                var26.field397 = 0;
                var26.field419 = 0;
                var26.field407 = 150;
            }
            if ((var27 & 0x100) != 0) {
                var26.field425 = field497.method2405();
                int var30 = field497.method2387();
                var26.field431 = var30 >> 16;
                var26.field430 = (var30 & 0xFFFF) + field636;
                var26.field428 = 0;
                var26.field429 = 0;
                if (var26.field430 > field636) {
                    var26.field428 = -1;
                }
                if (var26.field425 == 65535) {
                    var26.field425 = -1;
                }
            }
            if ((var27 & 0x80) != 0) {
                int var31 = field497.method2399();
                byte[] var32 = new byte[var31];
                class126 var33 = new class126(var32);
                field497.method2427(var32, 0, var31);
                field555[var25] = var33;
                var26.method15(var33);
            }
            if ((var27 & 0x10) != 0) {
                int var34 = field497.method2553();
                int var35 = field497.method2553();
                var26.method232(var34, var35, field636);
                var26.field413 = field636 + 300;
                var26.field414 = field497.method2399();
                var26.field445 = field497.method2553();
            }
            if ((var27 & 0x200) != 0) {
                int var36 = field497.method2399();
                int var37 = field497.method2407();
                var26.method232(var36, var37, field636);
                var26.field413 = field636 + 300;
                var26.field414 = field497.method2399();
                var26.field445 = field497.method2407();
            }
            if ((var27 & 0x8) != 0) {
                var26.field417 = field497.method2415();
                var26.field438 = field497.method2415();
            }
            if ((var27 & 0x2) != 0) {
                int var38 = field497.method2415();
                int var39 = field497.method2399();
                int var40 = field497.method2553();
                int var41 = field497.field2020;
                if (var26.field37 != null && var26.field55 != null) {
                    boolean var42 = false;
                    if (var39 <= 1 && method25(var26.field37)) {
                        var42 = true;
                    }
                    if (!var42 && field672 == 0) {
                        field482.field2020 = 0;
                        field497.method2426(field482.field2025, 0, var40);
                        field482.field2020 = 0;
                        class126 var43 = field482;
                        String var44 = class182.method1335(var43, 32767);
                        String var45 = class183.method3321(class146.method2629(var44));
                        var26.field406 = var45.trim();
                        var26.field397 = var38 >> 8;
                        var26.field419 = var38 & 0xFF;
                        var26.field407 = 150;
                        if (var39 == 2 || var39 == 3) {
                            method8(1, class2.method1341(1) + var26.field37, var45);
                        } else if (var39 == 1) {
                            method8(1, class2.method1341(0) + var26.field37, var45);
                        } else {
                            method8(2, var26.field37, var45);
                        }
                    }
                }
                field497.field2020 = var40 + var41;
            }
            if ((var27 & 0x4) != 0) {
                var26.field411 = field497.method2414();
                if (var26.field411 == 65535) {
                    var26.field411 = -1;
                }
            }
        }
        for (int var46 = 0; var46 < field585; var46++) {
            int var47 = field593[var46];
            if (field636 != field576[var47].field439) {
                field576[var47] = null;
            }
        }
        if (field498 != field497.field2020) {
            throw new RuntimeException(field497.field2020 + class2.field24 + field498);
        }
        for (int var48 = 0; var48 < field577; var48++) {
            if (field576[field578[var48]] == null) {
                throw new RuntimeException(var48 + class2.field24 + field577);
            }
        }
    }

    @ObfuscatedName("r.bw(S)V")
    public static final void method141() {
        field585 = 0;
        field579 = 0;
        method3015();
        method19();
        method1331();
        for (int var0 = 0; var0 < field585; var0++) {
            int var1 = field593[var0];
            if (field636 != field492[var1].field439) {
                field492[var1].field379 = null;
                field492[var1] = null;
            }
        }
        if (field498 != field497.field2020) {
            throw new RuntimeException(field497.field2020 + class2.field24 + field498);
        }
        for (int var2 = 0; var2 < field493; var2++) {
            if (field492[field494[var2]] == null) {
                throw new RuntimeException(var2 + class2.field24 + field493);
            }
        }
    }

    @ObfuscatedName("ef.bh(B)V")
    public static final void method3015() {
        field497.method2255();
        int var0 = field497.method2256(8);
        if (var0 < field493) {
            for (int var1 = var0; var1 < field493; var1++) {
                field593[++field585 - 1] = field494[var1];
            }
        }
        if (var0 > field493) {
            throw new RuntimeException("");
        }
        field493 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field494[var2];
            class24 var4 = field492[var3];
            int var5 = field497.method2256(1);
            if (var5 == 0) {
                field494[++field493 - 1] = var3;
                var4.field439 = field636;
            } else {
                int var6 = field497.method2256(2);
                if (var6 == 0) {
                    field494[++field493 - 1] = var3;
                    var4.field439 = field636;
                    field580[++field579 - 1] = var3;
                } else if (var6 == 1) {
                    field494[++field493 - 1] = var3;
                    var4.field439 = field636;
                    int var7 = field497.method2256(3);
                    var4.method234(var7, false);
                    int var8 = field497.method2256(1);
                    if (var8 == 1) {
                        field580[++field579 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field494[++field493 - 1] = var3;
                    var4.field439 = field636;
                    int var9 = field497.method2256(3);
                    var4.method234(var9, true);
                    int var10 = field497.method2256(3);
                    var4.method234(var10, true);
                    int var11 = field497.method2256(1);
                    if (var11 == 1) {
                        field580[++field579 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field593[++field585 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("x.bp(I)V")
    public static final void method19() {
        while (true) {
            if (field497.method2258(field498) >= 27) {
                int var0 = field497.method2256(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field492[var0] == null) {
                        field492[var0] = new class24();
                        var1 = true;
                    }
                    class24 var2 = field492[var0];
                    field494[++field493 - 1] = var0;
                    var2.field439 = field636;
                    int var3 = field497.method2256(1);
                    int var4 = field497.method2256(1);
                    if (var4 == 1) {
                        field580[++field579 - 1] = var0;
                    }
                    var2.field379 = class30.method117(field497.method2256(14));
                    int var5 = field497.method2256(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field590[field497.method2256(3)];
                    if (var1) {
                        var2.field441 = var2.field427 = var6;
                    }
                    int var7 = field497.method2256(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field408 = var2.field379.field760;
                    var2.field432 = var2.field379.field771;
                    if (var2.field432 == 0) {
                        var2.field427 = 0;
                    }
                    var2.field401 = var2.field379.field766;
                    var2.field402 = var2.field379.field767;
                    var2.field403 = var2.field379.field768;
                    var2.field404 = var2.field379.field769;
                    var2.field398 = var2.field379.field763;
                    var2.field399 = var2.field379.field764;
                    var2.field442 = var2.field379.field765;
                    var2.method233(Statics.field244.field409[0] + var7, Statics.field244.field446[0] + var5, var3 == 1);
                    continue;
                }
            }
            field497.method2269();
            return;
        }
    }

    @ObfuscatedName("bm.bn(I)V")
    public static final void method1331() {
        for (int var0 = 0; var0 < field579; var0++) {
            int var1 = field580[var0];
            class24 var2 = field492[var1];
            int var3 = field497.method2399();
            if ((var3 & 0x20) != 0) {
                var2.field406 = field497.method2390();
                var2.field407 = 100;
            }
            if ((var3 & 0x40) != 0) {
                var2.field379 = class30.method117(field497.method2414());
                var2.field408 = var2.field379.field760;
                var2.field432 = var2.field379.field771;
                var2.field401 = var2.field379.field766;
                var2.field402 = var2.field379.field767;
                var2.field403 = var2.field379.field768;
                var2.field404 = var2.field379.field769;
                var2.field398 = var2.field379.field763;
                var2.field399 = var2.field379.field764;
                var2.field442 = var2.field379.field765;
            }
            if ((var3 & 0x2) != 0) {
                var2.field411 = field497.method2415();
                if (var2.field411 == 65535) {
                    var2.field411 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                var2.field417 = field497.method2405();
                var2.field438 = field497.method2415();
            }
            if ((var3 & 0x8) != 0) {
                int var4 = field497.method2415();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field497.method2583();
                if (var2.field422 == var4 && var4 != -1) {
                    int var6 = class33.method2614(var4).field858;
                    if (var6 == 1) {
                        var2.field423 = 0;
                        var2.field424 = 0;
                        var2.field437 = var5;
                        var2.field426 = 0;
                    }
                    if (var6 == 2) {
                        var2.field426 = 0;
                    }
                } else if (var4 == -1 || var2.field422 == -1 || class33.method2614(var4).field868 >= class33.method2614(var2.field422).field868) {
                    var2.field422 = var4;
                    var2.field423 = 0;
                    var2.field424 = 0;
                    var2.field437 = var5;
                    var2.field426 = 0;
                    var2.field449 = var2.field400;
                }
            }
            if ((var3 & 0x1) != 0) {
                var2.field425 = field497.method2414();
                int var7 = field497.method2474();
                var2.field431 = var7 >> 16;
                var2.field430 = (var7 & 0xFFFF) + field636;
                var2.field428 = 0;
                var2.field429 = 0;
                if (var2.field430 > field636) {
                    var2.field428 = -1;
                }
                if (var2.field425 == 65535) {
                    var2.field425 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var8 = field497.method2553();
                int var9 = field497.method2553();
                var2.method232(var8, var9, field636);
                var2.field413 = field636 + 300;
                var2.field414 = field497.method2399();
                var2.field445 = field497.method2583();
            }
            if ((var3 & 0x10) != 0) {
                int var10 = field497.method2553();
                int var11 = field497.method2399();
                var2.method232(var10, var11, field636);
                var2.field413 = field636 + 300;
                var2.field414 = field497.method2399();
                var2.field445 = field497.method2399();
            }
        }
    }

    @ObfuscatedName("r.bd(IIB)V")
    public static final void method140(int arg0, int arg1) {
        if (field637 < 2 && field551 == 0 && !field613) {
            return;
        }
        String var2;
        if (field551 == 1 && field637 < 2) {
            var2 = class133.field2200 + class133.field2210 + field612 + " " + class2.field17;
        } else if (field613 && field637 < 2) {
            var2 = field615 + class133.field2210 + field616 + " " + class2.field17;
        } else {
            var2 = method799(field637 - 1);
        }
        if (field637 > 2) {
            var2 = var2 + class2.method1507(16777215) + " " + '/' + " " + (field637 - 2) + class133.field2260;
        }
        Statics.field232.method3323(var2, arg0 + 4, arg1 + 15, 16777215, 0, field636 / 1000);
    }

    @ObfuscatedName("t.bq(IIIIB)V")
    public static final void method211(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field658; var4++) {
            if (field665[var4] + field663[var4] > arg0 && field663[var4] < arg0 + arg2 && field666[var4] + field561[var4] > arg1 && field561[var4] < arg1 + arg3) {
                field660[var4] = true;
            }
        }
    }

    @ObfuscatedName("t.bc(I)V")
    public static final void method209() {
        if (Statics.field1916 != null || field471 != null) {
            return;
        }
        int var0 = class76.field1384;
        if (field599) {
            if (var0 != 1) {
                int var1 = class76.field1378;
                int var2 = class76.field1379;
                if (var1 < Statics.field1251 - 10 || var1 > Statics.field1251 + Statics.field1004 + 10 || var2 < Statics.field1612 - 10 || var2 > Statics.field269 + Statics.field1612 + 10) {
                    field599 = false;
                    method211(Statics.field1251, Statics.field1612, Statics.field1004, Statics.field269);
                }
            }
            if (var0 == 1) {
                int var3 = Statics.field1251;
                int var4 = Statics.field1612;
                int var5 = Statics.field1004;
                int var6 = class76.field1386;
                int var7 = class76.field1383;
                int var8 = -1;
                for (int var9 = 0; var9 < field637; var9++) {
                    int var10 = (field637 - 1 - var9) * 15 + var4 + 31;
                    if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                        var8 = var9;
                    }
                }
                if (var8 != -1) {
                    method27(var8);
                }
                field599 = false;
                method211(Statics.field1251, Statics.field1612, Statics.field1004, Statics.field269);
            }
            return;
        }
        if (var0 == 1 && field637 > 0) {
            int var11 = field603[field637 - 1];
            if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                int var12 = field601[field637 - 1];
                int var13 = field602[field637 - 1];
                class156 var14 = class156.method822(var13);
                if (class160.method3074(method210(var14)) || class160.method29(method210(var14))) {
                    field573 = false;
                    field610 = 0;
                    if (Statics.field1916 != null) {
                        method1345(Statics.field1916);
                    }
                    Statics.field1916 = class156.method822(var13);
                    field550 = var12;
                    field526 = class76.field1386;
                    field705 = class76.field1383;
                    method1345(Statics.field1916);
                    return;
                }
            }
        }
        if (var0 == 1 && (field598 == 1 && field637 > 2 || method593(field637 - 1))) {
            var0 = 2;
        }
        if (var0 == 1 && field637 > 0) {
            method27(field637 - 1);
        }
        if (var0 == 2 && field637 > 0) {
            method2247();
        }
    }

    @ObfuscatedName("dg.bo(I)V")
    public static final void method2247() {
        int var0 = Statics.field232.method3349(class133.field2201);
        for (int var1 = 0; var1 < field637; var1++) {
            int var2 = Statics.field232.method3349(method799(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field637 * 15 + 21;
        int var4 = class76.field1386 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class76.field1383;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field599 = true;
        Statics.field1251 = var4;
        Statics.field1612 = var5;
        Statics.field1004 = var0;
        Statics.field269 = field637 * 15 + 22;
    }

    @ObfuscatedName("au.bk(IB)Z")
    public static final boolean method593(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field603[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("z.bu(II)V")
    public static final void method27(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field601[arg0];
        int var2 = field602[arg0];
        int var3 = field603[arg0];
        int var4 = field486[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1001) {
            method875(var1, var2, var4);
            field631.method2273(124);
            field631.method2579(var4 >> 14 & 0x7FFF);
            field631.method2505(Statics.field450 + var2);
            field631.method2579(Statics.field953 + var1);
        }
        if (var3 == 1 && method875(var1, var2, var4)) {
            field631.method2273(36);
            field631.method2420(Statics.field6);
            field631.method2579(Statics.field1654);
            field631.method2579(Statics.field188);
            field631.method2505(var4 >> 14 & 0x7FFF);
            field631.method2579(Statics.field450 + var2);
            field631.method2412(Statics.field953 + var1);
        }
        if (var3 == 44) {
            class3 var5 = field576[var4];
            if (var5 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var5.field409[0], var5.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(61);
                field631.method2412(var4);
            }
        }
        if (var3 == 31) {
            field631.method2273(72);
            field631.method2505(Statics.field188);
            field631.method2372(Statics.field6);
            field631.method2550(var2);
            field631.method2412(var1);
            field631.method2544(Statics.field1654);
            field631.method2544(var4);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 28) {
            field631.method2273(5);
            field631.method2372(var2);
            class156 var6 = class156.method822(var2);
            if (var6.field2527 != null && var6.field2527[0][0] == 5) {
                int var7 = var6.field2527[0][1];
                class157.field2647[var7] = 1 - class157.field2647[var7];
                method127(var7);
            }
        }
        if (var3 == 1005) {
            class156 var8 = class156.method822(var2);
            if (var8 == null || var8.field2631[var1] < 100000) {
                field631.method2273(38);
                field631.method2505(var4);
            } else {
                method8(0, "", var8.field2631[var1] + " x " + class39.method1818(var4).field960);
            }
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 20) {
            boolean var9 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var9) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(58);
            field631.method2505(Statics.field450 + var2);
            field631.method2412(var4);
            field631.method2579(Statics.field953 + var1);
        }
        if (var3 == 32) {
            field631.method2273(113);
            field631.method2420(Statics.field1293);
            field631.method2544(field539);
            field631.method2544(var4);
            field631.method2544(var1);
            field631.method2550(var2);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 22) {
            boolean var11 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var11) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(75);
            field631.method2579(Statics.field450 + var2);
            field631.method2412(Statics.field953 + var1);
            field631.method2579(var4);
        }
        if (var3 == 3) {
            method875(var1, var2, var4);
            field631.method2273(161);
            field631.method2579(Statics.field953 + var1);
            field631.method2544(var4 >> 14 & 0x7FFF);
            field631.method2579(Statics.field450 + var2);
        }
        if (var3 == 1004) {
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(38);
            field631.method2505(var4);
        }
        if (var3 == 38) {
            method790();
            class156 var13 = class156.method822(var2);
            field551 = 1;
            Statics.field188 = var1;
            Statics.field6 = var2;
            Statics.field1654 = var4;
            method1345(var13);
            field612 = class2.method1507(16748608) + class39.method1818(var4).field960 + class2.method1507(16777215);
            if (field612 == null) {
                field612 = "null";
            }
            return;
        }
        if (var3 == 17) {
            boolean var14 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var14) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(69);
            field631.method2412(var4);
            field631.method2412(field539);
            field631.method2372(Statics.field1293);
            field631.method2579(Statics.field953 + var1);
            field631.method2505(Statics.field450 + var2);
        }
        if (var3 == 5) {
            method875(var1, var2, var4);
            field631.method2273(60);
            field631.method2579(var4 >> 14 & 0x7FFF);
            field631.method2505(Statics.field450 + var2);
            field631.method2412(Statics.field953 + var1);
        }
        if (var3 == 45) {
            class3 var16 = field576[var4];
            if (var16 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var16.field409[0], var16.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(237);
                field631.method2412(var4);
            }
        }
        if (var3 == 21) {
            boolean var17 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var17) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(42);
            field631.method2544(var4);
            field631.method2505(Statics.field450 + var2);
            field631.method2505(Statics.field953 + var1);
        }
        if (var3 == 6) {
            method875(var1, var2, var4);
            field631.method2273(174);
            field631.method2505(Statics.field450 + var2);
            field631.method2412(var4 >> 14 & 0x7FFF);
            field631.method2544(Statics.field953 + var1);
        }
        if (var3 == 15) {
            class3 var19 = field576[var4];
            if (var19 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var19.field409[0], var19.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(105);
                field631.method2505(field539);
                field631.method2579(var4);
                field631.method2421(Statics.field1293);
            }
        }
        if (var3 == 8) {
            class24 var20 = field492[var4];
            if (var20 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var20.field409[0], var20.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(88);
                field631.method2579(var4);
                field631.method2505(field539);
                field631.method2372(Statics.field1293);
            }
        }
        if (var3 == 36) {
            field631.method2273(141);
            field631.method2579(var4);
            field631.method2550(var2);
            field631.method2544(var1);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 29) {
            field631.method2273(5);
            field631.method2372(var2);
            class156 var21 = class156.method822(var2);
            if (var21.field2527 != null && var21.field2527[0][0] == 5) {
                int var22 = var21.field2527[0][1];
                if (class157.field2647[var22] != var21.field2626[0]) {
                    class157.field2647[var22] = var21.field2626[0];
                    method127(var22);
                }
            }
        }
        if (var3 == 40) {
            field631.method2273(189);
            field631.method2420(var2);
            field631.method2505(var4);
            field631.method2505(var1);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 46) {
            class3 var23 = field576[var4];
            if (var23 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var23.field409[0], var23.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(79);
                field631.method2505(var4);
            }
        }
        if (var3 == 19) {
            boolean var24 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(30);
            field631.method2412(var4);
            field631.method2412(Statics.field450 + var2);
            field631.method2505(Statics.field953 + var1);
        }
        if (var3 == 12) {
            class24 var26 = field492[var4];
            if (var26 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var26.field409[0], var26.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(214);
                field631.method2544(var4);
            }
        }
        if (var3 == 25) {
            class156 var27 = class156.method2787(var2, var1);
            if (var27 != null) {
                method790();
                int var28 = method210(var27);
                int var29 = var28 >> 11 & 0x3F;
                class156 var31 = class156.method2787(var2, var1);
                if (var31 != null && var31.field2606 != null) {
                    class1 var32 = new class1();
                    var32.field2 = var31;
                    var32.field1 = var31.field2606;
                    class25.method1580(var32);
                }
                field613 = true;
                Statics.field1293 = var2;
                field539 = var1;
                Statics.field931 = var29;
                method1345(var31);
                field551 = 0;
                int var33 = method210(var27);
                int var34 = var33 >> 11 & 0x3F;
                String var35;
                if (var34 == 0) {
                    var35 = null;
                } else if (var27.field2594 == null || var27.field2594.trim().length() == 0) {
                    var35 = null;
                } else {
                    var35 = var27.field2594;
                }
                field615 = var35;
                if (field615 == null) {
                    field615 = "Null";
                }
                if (var27.field2595) {
                    field616 = var27.field2533 + class2.method1507(16777215);
                } else {
                    field616 = class2.method1507(65280) + var27.field2628 + class2.method1507(16777215);
                }
            }
            return;
        }
        if (var3 == 10) {
            class24 var36 = field492[var4];
            if (var36 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var36.field409[0], var36.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(133);
                field631.method2579(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            String var37 = field606[arg0];
            class156 var38 = class156.method2787(var2, var1);
            if (var38 != null) {
                if (var38.field2604 != null) {
                    class1 var39 = new class1();
                    var39.field2 = var38;
                    var39.field5 = var4;
                    var39.field9 = var37;
                    var39.field1 = var38.field2604;
                    class25.method1580(var39);
                }
                boolean var40 = true;
                if (var38.field2532 > 0) {
                    var40 = method30(var38);
                }
                if (var40 && class160.method1485(method210(var38), var4 - 1)) {
                    if (var4 == 1) {
                        field631.method2273(89);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 2) {
                        field631.method2273(68);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 3) {
                        field631.method2273(245);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 4) {
                        field631.method2273(180);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 5) {
                        field631.method2273(47);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 6) {
                        field631.method2273(217);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 7) {
                        field631.method2273(238);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 8) {
                        field631.method2273(160);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 9) {
                        field631.method2273(200);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                    if (var4 == 10) {
                        field631.method2273(44);
                        field631.method2372(var2);
                        field631.method2505(var1);
                    }
                }
            }
        }
        if (var3 == 30 && field621 == null) {
            method40(var2, var1);
            field621 = class156.method2787(var2, var1);
            method1345(field621);
        }
        if (var3 == 7) {
            class24 var41 = field492[var4];
            if (var41 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var41.field409[0], var41.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(22);
                field631.method2579(Statics.field188);
                field631.method2412(Statics.field1654);
                field631.method2421(Statics.field6);
                field631.method2544(var4);
            }
        }
        if (var3 == 39) {
            field631.method2273(13);
            field631.method2372(var2);
            field631.method2579(var1);
            field631.method2412(var4);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 51) {
            class3 var42 = field576[var4];
            if (var42 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var42.field409[0], var42.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(194);
                field631.method2505(var4);
            }
        }
        if (var3 == 24) {
            class156 var43 = class156.method822(var2);
            boolean var44 = true;
            if (var43.field2532 > 0) {
                var44 = method30(var43);
            }
            if (var44) {
                field631.method2273(5);
                field631.method2372(var2);
            }
        }
        if (var3 == 9) {
            class24 var45 = field492[var4];
            if (var45 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var45.field409[0], var45.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(140);
                field631.method2412(var4);
            }
        }
        if (var3 == 14) {
            class3 var46 = field576[var4];
            if (var46 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var46.field409[0], var46.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(91);
                field631.method2412(var4);
                field631.method2412(Statics.field188);
                field631.method2421(Statics.field6);
                field631.method2412(Statics.field1654);
            }
        }
        if (var3 == 4) {
            method875(var1, var2, var4);
            field631.method2273(236);
            field631.method2412(Statics.field953 + var1);
            field631.method2412(Statics.field450 + var2);
            field631.method2505(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 37) {
            field631.method2273(8);
            field631.method2505(var1);
            field631.method2544(var4);
            field631.method2550(var2);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 33) {
            field631.method2273(102);
            field631.method2579(var1);
            field631.method2412(var4);
            field631.method2420(var2);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 16) {
            boolean var47 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var47) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(111);
            field631.method2505(Statics.field450 + var2);
            field631.method2372(Statics.field6);
            field631.method2544(Statics.field1654);
            field631.method2412(var4);
            field631.method2579(Statics.field953 + var1);
            field631.method2505(Statics.field188);
        }
        if (var3 == 41) {
            field631.method2273(81);
            field631.method2420(var2);
            field631.method2505(var1);
            field631.method2412(var4);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 18) {
            boolean var49 = method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var49) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(109);
            field631.method2579(Statics.field953 + var1);
            field631.method2505(var4);
            field631.method2579(Statics.field450 + var2);
        }
        if (var3 == 50) {
            class3 var51 = field576[var4];
            if (var51 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var51.field409[0], var51.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(92);
                field631.method2505(var4);
            }
        }
        if (var3 == 1002) {
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            field631.method2273(110);
            field631.method2544(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 34) {
            field631.method2273(114);
            field631.method2579(var4);
            field631.method2505(var1);
            field631.method2421(var2);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 42) {
            field631.method2273(177);
            field631.method2421(var2);
            field631.method2544(var4);
            field631.method2505(var1);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 58) {
            field631.method2273(53);
            field631.method2579(var1);
            field631.method2421(var2);
            field631.method2420(Statics.field1293);
            field631.method2505(field539);
        }
        if (var3 == 1003) {
            field563 = class76.field1386;
            field572 = class76.field1383;
            field586 = 2;
            field549 = 0;
            class24 var52 = field492[var4];
            if (var52 != null) {
                class30 var53 = var52.field379;
                if (var53.field784 != null) {
                    var53 = var53.method596();
                }
                if (var53 != null) {
                    field631.method2273(216);
                    field631.method2579(var53.field783);
                }
            }
        }
        if (var3 == 2 && method875(var1, var2, var4)) {
            field631.method2273(95);
            field631.method2412(Statics.field450 + var2);
            field631.method2505(field539);
            field631.method2372(Statics.field1293);
            field631.method2544(var4 >> 14 & 0x7FFF);
            field631.method2412(Statics.field953 + var1);
        }
        if (var3 == 26) {
            field631.method2273(121);
            for (class4 var54 = (class4) field618.method3225(); var54 != null; var54 = (class4) field618.method3230()) {
                if (var54.field68 == 0 || var54.field68 == 3) {
                    method138(var54, true);
                }
            }
            if (field621 != null) {
                method1345(field621);
                field621 = null;
            }
        }
        if (var3 == 43) {
            field631.method2273(123);
            field631.method2505(var4);
            field631.method2505(var1);
            field631.method2550(var2);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 49) {
            class3 var55 = field576[var4];
            if (var55 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var55.field409[0], var55.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(243);
                field631.method2579(var4);
            }
        }
        if (var3 == 11) {
            class24 var56 = field492[var4];
            if (var56 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var56.field409[0], var56.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(108);
                field631.method2505(var4);
            }
        }
        if (var3 == 35) {
            field631.method2273(157);
            field631.method2544(var4);
            field631.method2505(var1);
            field631.method2372(var2);
            field567 = 0;
            Statics.field1364 = class156.method822(var2);
            field568 = var1;
        }
        if (var3 == 48) {
            class3 var57 = field576[var4];
            if (var57 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var57.field409[0], var57.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(52);
                field631.method2505(var4);
            }
        }
        if (var3 == 47) {
            class3 var58 = field576[var4];
            if (var58 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var58.field409[0], var58.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(173);
                field631.method2544(var4);
            }
        }
        if (var3 == 23) {
            Statics.field362.method1866(Statics.field582, var1, var2);
        }
        if (var3 == 13) {
            class24 var59 = field492[var4];
            if (var59 != null) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var59.field409[0], var59.field446[0], false, 0, 0, 1, 1, 0, 2);
                field563 = class76.field1386;
                field572 = class76.field1383;
                field586 = 2;
                field549 = 0;
                field631.method2273(184);
                field631.method2544(var4);
            }
        }
        if (field551 != 0) {
            field551 = 0;
            method1345(class156.method822(Statics.field6));
        }
        if (field613) {
            method790();
        }
        if (Statics.field1364 != null && field567 == 0) {
            method1345(Statics.field1364);
        }
    }

    @ObfuscatedName("cf.be(ILjava/lang/String;B)V")
    public static void method2076(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field577; var3++) {
            class3 var4 = field576[field578[var3]];
            if (var4 != null && var4.field37 != null && var4.field37.equalsIgnoreCase(arg1)) {
                method126(Statics.field244.field409[0], Statics.field244.field446[0], var4.field409[0], var4.field446[0], false, 0, 0, 1, 1, 0, 2);
                if (arg0 == 1) {
                    field631.method2273(61);
                    field631.method2412(field578[var3]);
                } else if (arg0 == 4) {
                    field631.method2273(173);
                    field631.method2544(field578[var3]);
                } else if (arg0 == 6) {
                    field631.method2273(243);
                    field631.method2579(field578[var3]);
                } else if (arg0 == 7) {
                    field631.method2273(92);
                    field631.method2505(field578[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method8(0, "", class133.field2199 + arg1);
        }
    }

    @ObfuscatedName("ax.bx(I)V")
    public static void method790() {
        if (!field613) {
            return;
        }
        class156 var0 = class156.method2787(Statics.field1293, field539);
        if (var0 != null && var0.field2607 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field1 = var0.field2607;
            class25.method1580(var1);
        }
        field613 = false;
        method1345(var0);
    }

    @ObfuscatedName("s.bf(IIB)V")
    public static void method40(int arg0, int arg1) {
        field631.method2273(254);
        field631.method2421(arg0);
        field631.method2544(arg1);
    }

    @ObfuscatedName("ez.cr(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2624(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field599 || field637 >= 500) {
            return;
        }
        field605[field637] = arg0;
        field606[field637] = arg1;
        field603[field637] = arg2;
        field486[field637] = arg3;
        field601[field637] = arg4;
        field602[field637] = arg5;
        field637++;
    }

    @ObfuscatedName("ax.cu(II)Ljava/lang/String;")
    public static String method799(int arg0) {
        return field606[arg0].length() > 0 ? field605[arg0] + class133.field2210 + field606[arg0] : field605[arg0];
    }

    @ObfuscatedName("a.cg(IIIII)V")
    public static final void method217(int arg0, int arg1, int arg2, int arg3) {
        if (field551 == 0 && !field613) {
            method2624(class133.field2205, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class111.field1898; var5++) {
            int var6 = class111.field1856[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field362.method1859(Statics.field582, var7, var8, var6) >= 0) {
                    class31 var11 = class31.method35(var10);
                    if (var11.field835 != null) {
                        var11 = var11.method630();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field551 == 1) {
                        method2624(class133.field2200, field612 + " " + class2.field17 + " " + class2.method1507(65535) + var11.field803, 1, var6, var7, var8);
                    } else if (!field613) {
                        String[] var12 = var11.field820;
                        if (field627) {
                            var12 = method2622(var12);
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
                                    method2624(var12[var13], class2.method1507(65535) + var11.field803, var14, var6, var7, var8);
                                }
                            }
                        }
                        method2624(class133.field2253, class2.method1507(65535) + var11.field803, 1002, var11.field819 << 14, var7, var8);
                    } else if ((Statics.field931 & 0x4) == 4) {
                        method2624(field615, field616 + " " + class2.field17 + " " + class2.method1507(65535) + var11.field803, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class24 var15 = field492[var10];
                    if (var15.field379.field760 == 1 && (var15.field396 & 0x7F) == 64 && (var15.field394 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field493; var16++) {
                            class24 var17 = field492[field494[var16]];
                            if (var17 != null && var15 != var17 && var17.field379.field760 == 1 && var15.field396 == var17.field396 && var15.field394 == var17.field394) {
                                Statics.method1347(var17.field379, field494[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field577; var18++) {
                            class3 var19 = field576[field578[var18]];
                            if (var19 != null && var15.field396 == var19.field396 && var15.field394 == var19.field394) {
                                Statics.method114(var19, field578[var18], var7, var8);
                            }
                        }
                    }
                    Statics.method1347(var15.field379, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field576[var10];
                    if ((var20.field396 & 0x7F) == 64 && (var20.field394 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field493; var21++) {
                            class24 var22 = field492[field494[var21]];
                            if (var22 != null && var22.field379.field760 == 1 && var20.field396 == var22.field396 && var20.field394 == var22.field394) {
                                Statics.method1347(var22.field379, field494[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field577; var23++) {
                            class3 var24 = field576[field578[var23]];
                            if (var24 != null && var20 != var24 && var20.field396 == var24.field396 && var20.field394 == var24.field394) {
                                Statics.method114(var24, field578[var23], var7, var8);
                            }
                        }
                    }
                    Statics.method114(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class175 var25 = field589[Statics.field582][var7][var8];
                    if (var25 != null) {
                        for (class16 var26 = (class16) var25.method3264(); var26 != null; var26 = (class16) var25.method3248()) {
                            class39 var27 = class39.method1818(var26.field252);
                            if (field551 == 1) {
                                method2624(class133.field2200, field612 + " " + class2.field17 + " " + class2.method1507(16748608) + var27.field960, 16, var26.field252, var7, var8);
                            } else if (!field613) {
                                String[] var28 = var27.field977;
                                if (field627) {
                                    var28 = method2622(var28);
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
                                        method2624(var28[var29], class2.method1507(16748608) + var27.field960, var30, var26.field252, var7, var8);
                                    } else if (var29 == 2) {
                                        method2624(class133.field2255, class2.method1507(16748608) + var27.field960, 20, var26.field252, var7, var8);
                                    }
                                }
                                method2624(class133.field2253, class2.method1507(16748608) + var27.field960, 1004, var26.field252, var7, var8);
                            } else if ((Statics.field931 & 0x1) == 1) {
                                method2624(field615, field616 + " " + class2.field17 + " " + class2.method1507(16748608) + var27.field960, 17, var26.field252, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ac.cs(IIB)Ljava/lang/String;")
    public static final String method740(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1507(16711680);
        } else if (var2 < -6) {
            return class2.method1507(16723968);
        } else if (var2 < -3) {
            return class2.method1507(16740352);
        } else if (var2 < 0) {
            return class2.method1507(16756736);
        } else if (var2 > 9) {
            return class2.method1507(65280);
        } else if (var2 > 6) {
            return class2.method1507(4259584);
        } else if (var2 > 3) {
            return class2.method1507(8453888);
        } else if (var2 > 0) {
            return class2.method1507(12648192);
        } else {
            return class2.method1507(16776960);
        }
    }

    @ObfuscatedName("q.ct(IIIIIIIII)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class156.method60(arg0)) {
            Statics.field1242 = null;
            method1162(Statics.field2592[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1242 != null) {
                method1162(Statics.field1242, -1412584499, arg1, arg2, arg3, arg4, Statics.field1836, Statics.field146, arg7);
                Statics.field1242 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field660[var8] = true;
            }
        } else {
            field660[arg7] = true;
        }
    }

    @ObfuscatedName("aq.cb([Lee;IIIIIIIII)V")
    public static final void method1162(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1794(arg2, arg3, arg4, arg5);
        class103.method2080();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class156 var10 = arg0[var9];
            if (var10 != null && (var10.field2641 == arg1 || arg1 == -1412584499 && field471 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field663[field658] = var10.field2540 + arg6;
                    field561[field658] = var10.field2534 + arg7;
                    field665[field658] = var10.field2555;
                    field666[field658] = var10.field2538;
                    var11 = ++field658 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2559 = var11;
                var10.field2548 = field636;
                if (!var10.field2595 || !method202(var10)) {
                    if (var10.field2532 > 0) {
                        int var12 = var10.field2532;
                        if (var12 == 324) {
                            if (field652 == -1) {
                                field652 = var10.field2552;
                                field716 = var10.field2553;
                            }
                            if (field657.field2664) {
                                var10.field2552 = field652;
                            } else {
                                var10.field2552 = field716;
                            }
                        } else if (var12 == 325) {
                            if (field652 == -1) {
                                field652 = var10.field2552;
                                field716 = var10.field2553;
                            }
                            if (field657.field2664) {
                                var10.field2552 = field716;
                            } else {
                                var10.field2552 = field652;
                            }
                        } else if (var12 == 327) {
                            var10.field2638 = 150;
                            var10.field2569 = (int) (Math.sin((double) field636 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2560 = 5;
                            var10.field2561 = 0;
                        } else if (var12 == 328) {
                            var10.field2638 = 150;
                            var10.field2569 = (int) (Math.sin((double) field636 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2560 = 5;
                            var10.field2561 = 1;
                        }
                    }
                    int var13 = var10.field2540 + arg6;
                    int var14 = var10.field2534 + arg7;
                    int var15 = var10.field2550;
                    if (field471 == var10) {
                        if (arg1 != -1412584499 && !var10.field2593) {
                            Statics.field1242 = arg0;
                            Statics.field1836 = arg6;
                            Statics.field146 = arg7;
                            continue;
                        }
                        if (field639 && field633) {
                            int var16 = class76.field1378;
                            int var17 = class76.field1379;
                            int var18 = var16 - field630;
                            int var19 = var17 - field642;
                            if (var18 < field634) {
                                var18 = field634;
                            }
                            if (var10.field2555 + var18 > field634 + field629.field2555) {
                                var18 = field634 + field629.field2555 - var10.field2555;
                            }
                            if (var19 < field635) {
                                var19 = field635;
                            }
                            if (var10.field2538 + var19 > field635 + field629.field2538) {
                                var19 = field635 + field629.field2538 - var10.field2538;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2593) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2530 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2530 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2555 + var13;
                        int var27 = var10.field2538 + var14;
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
                        int var30 = var10.field2555 + var13;
                        int var31 = var10.field2538 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2595 || var20 < var22 && var21 < var23) {
                        if (var10.field2532 != 0) {
                            if (var10.field2532 == 1337) {
                                field607 = var13;
                                field608 = var14;
                                method533(var13, var14, var10.field2555, var10.field2538);
                                class88.method1794(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2532 == 1338) {
                                Statics.method1342();
                                class88.method1794(var13, var14, Statics.field851.field1466 + var13, Statics.field851.field1467 + var14);
                                if (field690 == 2 || field690 == 5) {
                                    class88.method1789(var13 + 25, var14 + 5, 0, Statics.field1781, Statics.field1503);
                                } else {
                                    int var32 = field543 + field529 & 0x7FF;
                                    int var33 = Statics.field244.field396 / 32 + 48;
                                    int var34 = 464 - Statics.field244.field394 / 32;
                                    Statics.field14.method1666(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field531 + 256, Statics.field1781, Statics.field1503);
                                    for (int var35 = 0; var35 < field684; var35++) {
                                        int var36 = field597[var35] * 4 + 2 - Statics.field244.field396 / 32;
                                        int var37 = field638[var35] * 4 + 2 - Statics.field244.field394 / 32;
                                        method155(var13, var14, var36, var37, field538[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class175 var40 = field589[Statics.field582][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field244.field396 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field244.field394 / 32;
                                                method155(var13, var14, var41, var42, Statics.field143[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field493; var43++) {
                                        class24 var44 = field492[field494[var43]];
                                        if (var44 != null && var44.method11()) {
                                            class30 var45 = var44.field379;
                                            if (var45 != null && var45.field784 != null) {
                                                var45 = var45.method596();
                                            }
                                            if (var45 != null && var45.field775 && var45.field787) {
                                                int var46 = var44.field396 / 32 - Statics.field244.field396 / 32;
                                                int var47 = var44.field394 / 32 - Statics.field244.field394 / 32;
                                                method155(var13, var14, var46, var47, Statics.field143[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field577; var48++) {
                                        class3 var49 = field576[field578[var48]];
                                        if (var49 != null && var49.method11()) {
                                            int var50 = var49.field396 / 32 - Statics.field244.field396 / 32;
                                            int var51 = var49.field394 / 32 - Statics.field244.field394 / 32;
                                            boolean var52 = false;
                                            if (method154(var49.field37)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            if (Statics.field244.field54 != 0 && var49.field54 != 0 && Statics.field244.field54 == var49.field54) {
                                                var53 = true;
                                            }
                                            if (var52) {
                                                method155(var13, var14, var50, var51, Statics.field143[3]);
                                            } else if (var53) {
                                                method155(var13, var14, var50, var51, Statics.field143[4]);
                                            } else {
                                                method155(var13, var14, var50, var51, Statics.field143[2]);
                                            }
                                        }
                                    }
                                    if (field696 != 0 && field636 % 20 < 10) {
                                        if (field696 == 1 && field475 >= 0 && field475 < field492.length) {
                                            class24 var54 = field492[field475];
                                            if (var54 != null) {
                                                int var55 = var54.field396 / 32 - Statics.field244.field396 / 32;
                                                int var56 = var54.field394 / 32 - Statics.field244.field394 / 32;
                                                method572(var13, var14, var55, var56, Statics.field1253[1]);
                                            }
                                        }
                                        if (field696 == 2) {
                                            int var57 = field560 * 4 - Statics.field953 * 4 + 2 - Statics.field244.field396 / 32;
                                            int var58 = field518 * 4 - Statics.field450 * 4 + 2 - Statics.field244.field394 / 32;
                                            method572(var13, var14, var57, var58, Statics.field1253[1]);
                                        }
                                        if (field696 == 10 && field476 >= 0 && field476 < field576.length) {
                                            class3 var59 = field576[field476];
                                            if (var59 != null) {
                                                int var60 = var59.field396 / 32 - Statics.field244.field396 / 32;
                                                int var61 = var59.field394 / 32 - Statics.field244.field394 / 32;
                                                method572(var13, var14, var60, var61, Statics.field1253[1]);
                                            }
                                        }
                                    }
                                    if (field466 != 0) {
                                        int var62 = field466 * 4 + 2 - Statics.field244.field396 / 32;
                                        int var63 = field689 * 4 + 2 - Statics.field244.field394 / 32;
                                        method155(var13, var14, var62, var63, Statics.field1253[0]);
                                    }
                                    class88.method1776(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field690 < 3) {
                                    Statics.field1205.method1666(var13, var14, 33, 33, 25, 25, field543, 256, Statics.field2517, Statics.field27);
                                } else {
                                    class88.method1789(var13, var14, 0, Statics.field2517, Statics.field27);
                                }
                                if (field662[var11]) {
                                    Statics.field851.method1738(var13, var14);
                                }
                                field661[var11] = true;
                                class88.method1794(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var64 = class76.field1378;
                        int var65 = class76.field1379;
                        if (!field599 && var64 >= var20 && var65 >= var21 && var64 < var22 && var65 < var23) {
                            method10(var10, var64 - var13, var65 - var14);
                        }
                        if (var10.field2530 == 0) {
                            if (!var10.field2595 && method202(var10) && Statics.field447 != var10) {
                                continue;
                            }
                            if (!var10.field2595) {
                                if (var10.field2542 > var10.field2624 - var10.field2538) {
                                    var10.field2542 = var10.field2624 - var10.field2538;
                                }
                                if (var10.field2542 < 0) {
                                    var10.field2542 = 0;
                                }
                            }
                            method1162(arg0, var10.field2528, var20, var21, var22, var23, var13 - var10.field2541, var14 - var10.field2542, var11);
                            if (var10.field2644 != null) {
                                method1162(var10.field2644, var10.field2528, var20, var21, var22, var23, var13 - var10.field2541, var14 - var10.field2542, var11);
                            }
                            class4 var66 = (class4) field618.method3222((long) var10.field2528);
                            if (var66 != null) {
                                if (var66.field68 == 0 && class76.field1378 >= var20 && class76.field1379 >= var21 && class76.field1378 < var22 && class76.field1379 < var23 && !field599 && !field626) {
                                    field605[0] = class133.field2105;
                                    field606[0] = "";
                                    field603[0] = 1006;
                                    field637 = 1;
                                }
                                method113(var66.field61, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class88.method1794(arg2, arg3, arg4, arg5);
                            class103.method2080();
                        }
                        if (field662[var11] || field667 > 1) {
                            if (var10.field2530 == 0 && !var10.field2595 && var10.field2624 > var10.field2538) {
                                int var67 = var10.field2555 + var13;
                                int var68 = var10.field2542;
                                int var69 = var10.field2538;
                                int var70 = var10.field2624;
                                Statics.field1995[0].method1738(var67, var14);
                                Statics.field1995[1].method1738(var67, var14 + var69 - 16);
                                class88.method1776(var67, var14 + 16, 16, var69 - 32, field535);
                                int var71 = (var69 - 32) * var69 / var70;
                                if (var71 < 8) {
                                    var71 = 8;
                                }
                                int var72 = (var69 - 32 - var71) * var68 / (var70 - var69);
                                class88.method1776(var67, var14 + 16 + var72, 16, var71, field536);
                                class88.method1787(var67, var14 + 16 + var72, var71, field509);
                                class88.method1787(var67 + 1, var14 + 16 + var72, var71, field509);
                                class88.method1753(var67, var14 + 16 + var72, 16, field509);
                                class88.method1753(var67, var14 + 17 + var72, 16, field509);
                                class88.method1787(var67 + 15, var14 + 16 + var72, var71, field537);
                                class88.method1787(var67 + 14, var14 + 17 + var72, var71 - 1, field537);
                                class88.method1753(var67, var14 + 15 + var72 + var71, 16, field537);
                                class88.method1753(var67 + 1, var14 + 14 + var72 + var71, 15, field537);
                            }
                            if (var10.field2530 != 1) {
                                if (var10.field2530 == 2) {
                                    int var73 = 0;
                                    for (int var74 = 0; var74 < var10.field2538; var74++) {
                                        for (int var75 = 0; var75 < var10.field2555; var75++) {
                                            int var76 = (var10.field2581 + 32) * var75 + var13;
                                            int var77 = (var10.field2582 + 32) * var74 + var14;
                                            if (var73 < 20) {
                                                var76 += var10.field2618[var73];
                                                var77 += var10.field2584[var73];
                                            }
                                            if (var10.field2630[var73] > 0) {
                                                boolean var78 = false;
                                                boolean var79 = false;
                                                int var80 = var10.field2630[var73] - 1;
                                                if (var76 + 32 > arg2 && var76 < arg4 && var77 + 32 > arg3 && var77 < arg5 || Statics.field1916 == var10 && field550 == var73) {
                                                    class85 var81;
                                                    if (field551 == 1 && Statics.field188 == var73 && Statics.field6 == var10.field2528) {
                                                        var81 = class39.method2075(var80, var10.field2631[var73], 2, 0, false);
                                                    } else {
                                                        var81 = class39.method2075(var80, var10.field2631[var73], 1, 3153952, false);
                                                    }
                                                    if (var81 == null) {
                                                        method1345(var10);
                                                    } else if (Statics.field1916 == var10 && field550 == var73) {
                                                        int var82 = class76.field1378 - field526;
                                                        int var83 = class76.field1379 - field705;
                                                        if (var82 < 5 && var82 > -5) {
                                                            var82 = 0;
                                                        }
                                                        if (var83 < 5 && var83 > -5) {
                                                            var83 = 0;
                                                        }
                                                        if (field610 < 5) {
                                                            var82 = 0;
                                                            var83 = 0;
                                                        }
                                                        var81.method1723(var76 + var82, var77 + var83, 128);
                                                        if (arg1 != -1) {
                                                            class156 var84 = arg0[arg1 & 0xFFFF];
                                                            if (var77 + var83 < class88.field1475 && var84.field2542 > 0) {
                                                                int var85 = field534 * (class88.field1475 - var77 - var83) / 3;
                                                                if (var85 > field534 * 10) {
                                                                    var85 = field534 * 10;
                                                                }
                                                                if (var85 > var84.field2542) {
                                                                    var85 = var84.field2542;
                                                                }
                                                                var84.field2542 -= var85;
                                                                field705 += var85;
                                                                method1345(var84);
                                                            }
                                                            if (var77 + var83 + 32 > class88.field1477 && var84.field2542 < var84.field2624 - var84.field2538) {
                                                                int var86 = field534 * (var77 + var83 + 32 - class88.field1477) / 3;
                                                                if (var86 > field534 * 10) {
                                                                    var86 = field534 * 10;
                                                                }
                                                                if (var86 > var84.field2624 - var84.field2538 - var84.field2542) {
                                                                    var86 = var84.field2624 - var84.field2538 - var84.field2542;
                                                                }
                                                                var84.field2542 += var86;
                                                                field705 -= var86;
                                                                method1345(var84);
                                                            }
                                                        }
                                                    } else if (Statics.field1364 == var10 && field568 == var73) {
                                                        var81.method1723(var76, var77, 128);
                                                    } else {
                                                        var81.method1656(var76, var77);
                                                    }
                                                }
                                            } else if (var10.field2520 != null && var73 < 20) {
                                                class85 var87 = var10.method3041(var73);
                                                if (var87 != null) {
                                                    var87.method1656(var76, var77);
                                                } else if (class156.field2526) {
                                                    method1345(var10);
                                                }
                                            }
                                            var73++;
                                        }
                                    }
                                } else if (var10.field2530 == 3) {
                                    int var88;
                                    if (method2071(var10)) {
                                        var88 = var10.field2546;
                                        if (Statics.field447 == var10 && var10.field2637 != 0) {
                                            var88 = var10.field2637;
                                        }
                                    } else {
                                        var88 = var10.field2545;
                                        if (Statics.field447 == var10 && var10.field2525 != 0) {
                                            var88 = var10.field2525;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2549) {
                                            class88.method1776(var13, var14, var10.field2555, var10.field2538, var88);
                                        } else {
                                            class88.method1755(var13, var14, var10.field2555, var10.field2538, var88);
                                        }
                                    } else if (var10.field2549) {
                                        class88.method1752(var13, var14, var10.field2555, var10.field2538, var88, 256 - (var15 & 0xFF));
                                    } else {
                                        class88.method1756(var13, var14, var10.field2555, var10.field2538, var88, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2530 == 4) {
                                    class181 var89 = var10.method3061();
                                    if (var89 != null) {
                                        String var90 = var10.field2575;
                                        int var91;
                                        if (method2071(var10)) {
                                            var91 = var10.field2546;
                                            if (Statics.field447 == var10 && var10.field2637 != 0) {
                                                var91 = var10.field2637;
                                            }
                                            if (var10.field2623.length() > 0) {
                                                var90 = var10.field2623;
                                            }
                                        } else {
                                            var91 = var10.field2545;
                                            if (Statics.field447 == var10 && var10.field2525 != 0) {
                                                var91 = var10.field2525;
                                            }
                                        }
                                        if (var10.field2595 && var10.field2523 != -1) {
                                            class39 var92 = class39.method1818(var10.field2523);
                                            var90 = var92.field960;
                                            if (var90 == null) {
                                                var90 = "null";
                                            }
                                            if ((var92.field973 == 1 || var10.field2633 != 1) && var10.field2633 != -1) {
                                                var90 = class2.method1507(16748608) + var90 + class2.field23 + " " + 'x' + method1163(var10.field2633);
                                            }
                                        }
                                        if (field621 == var10) {
                                            class133 var10000 = (class133) null;
                                            var90 = class133.field2208;
                                            var91 = var10.field2545;
                                        }
                                        if (!var10.field2595) {
                                            var90 = method208(var90, var10);
                                        }
                                        var89.method3325(var90, var13, var14, var10.field2555, var10.field2538, var91, var10.field2547 ? 0 : -1, var10.field2616, var10.field2579, var10.field2577);
                                    } else if (class156.field2526) {
                                        method1345(var10);
                                    }
                                } else if (var10.field2530 == 5) {
                                    if (var10.field2595) {
                                        class85 var94;
                                        if (var10.field2523 == -1) {
                                            var94 = var10.method3039(false);
                                        } else {
                                            var94 = class39.method2075(var10.field2523, var10.field2633, var10.field2589, var10.field2615, false);
                                        }
                                        if (var94 != null) {
                                            int var95 = var94.field1463;
                                            int var96 = var94.field1457;
                                            if (var10.field2588) {
                                                class88.method1749(var13, var14, var10.field2555 + var13, var10.field2538 + var14);
                                                int var97 = (var10.field2555 + (var95 - 1)) / var95;
                                                int var98 = (var10.field2538 + (var96 - 1)) / var96;
                                                for (int var99 = 0; var99 < var97; var99++) {
                                                    for (int var100 = 0; var100 < var98; var100++) {
                                                        if (var10.field2554 != 0) {
                                                            var94.method1668(var95 / 2 + var95 * var99 + var13, var96 / 2 + var96 * var100 + var14, var10.field2554, 4096);
                                                        } else if (var15 == 0) {
                                                            var94.method1656(var95 * var99 + var13, var96 * var100 + var14);
                                                        } else {
                                                            var94.method1723(var95 * var99 + var13, var96 * var100 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1794(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var101 = var10.field2555 * 4096 / var95;
                                                if (var10.field2554 != 0) {
                                                    var94.method1668(var10.field2555 / 2 + var13, var10.field2538 / 2 + var14, var10.field2554, var101);
                                                } else if (var15 != 0) {
                                                    var94.method1720(var13, var14, var10.field2555, var10.field2538, 256 - (var15 & 0xFF));
                                                } else if (var10.field2555 == var95 && var10.field2538 == var96) {
                                                    var94.method1656(var13, var14);
                                                } else {
                                                    var94.method1658(var13, var14, var10.field2555, var10.field2538);
                                                }
                                            }
                                        } else if (class156.field2526) {
                                            method1345(var10);
                                        }
                                    } else {
                                        class85 var93 = var10.method3039(method2071(var10));
                                        if (var93 != null) {
                                            var93.method1656(var13, var14);
                                        } else if (class156.field2526) {
                                            method1345(var10);
                                        }
                                    }
                                } else if (var10.field2530 == 6) {
                                    boolean var102 = method2071(var10);
                                    int var103;
                                    if (var102) {
                                        var103 = var10.field2565;
                                    } else {
                                        var103 = var10.field2564;
                                    }
                                    class111 var104 = null;
                                    int var105 = 0;
                                    if (var10.field2523 != -1) {
                                        class39 var106 = class39.method1818(var10.field2523);
                                        if (var106 != null) {
                                            class39 var107 = var106.method827(var10.field2633);
                                            var104 = var107.method821(1);
                                            if (var104 == null) {
                                                method1345(var10);
                                            } else {
                                                var104.method2170();
                                                var105 = var104.field1534 / 2;
                                            }
                                        }
                                    } else if (var10.field2560 == 5) {
                                        if (var10.field2561 == 0) {
                                            var104 = field657.method3114((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var104 = Statics.field244.method13();
                                        }
                                    } else if (var103 == -1) {
                                        var104 = var10.method3042((class33) null, -1, var102, Statics.field244.field55);
                                        if (var104 == null && class156.field2526) {
                                            method1345(var10);
                                        }
                                    } else {
                                        class33 var108 = class33.method2614(var103);
                                        var104 = var10.method3042(var108, var10.field2634, var102, Statics.field244.field55);
                                        if (var104 == null && class156.field2526) {
                                            method1345(var10);
                                        }
                                    }
                                    class103.method2124(var10.field2555 / 2 + var13, var10.field2538 / 2 + var14);
                                    int var109 = var10.field2529 * class103.field1764[var10.field2638] >> 16;
                                    int var110 = var10.field2529 * class103.field1765[var10.field2638] >> 16;
                                    if (var104 != null) {
                                        if (var10.field2595) {
                                            var104.method2170();
                                            if (var10.field2573) {
                                                var104.method2183(0, var10.field2569, var10.field2570, var10.field2638, var10.field2566, var10.field2567 + var105 + var109, var10.field2567 + var110, var10.field2529);
                                            } else {
                                                var104.method2166(0, var10.field2569, var10.field2570, var10.field2638, var10.field2566, var10.field2567 + var105 + var109, var10.field2567 + var110);
                                            }
                                        } else {
                                            var104.method2166(0, var10.field2569, 0, var10.field2638, 0, var109, var110);
                                        }
                                    }
                                    class103.method2090();
                                } else {
                                    if (var10.field2530 == 7) {
                                        class181 var111 = var10.method3061();
                                        if (var111 == null) {
                                            if (class156.field2526) {
                                                method1345(var10);
                                            }
                                            continue;
                                        }
                                        int var112 = 0;
                                        for (int var113 = 0; var113 < var10.field2538; var113++) {
                                            for (int var114 = 0; var114 < var10.field2555; var114++) {
                                                if (var10.field2630[var112] > 0) {
                                                    class39 var115 = class39.method1818(var10.field2630[var112] - 1);
                                                    String var116;
                                                    if (var115.field973 != 1 && var10.field2631[var112] == 1) {
                                                        var116 = class2.method1507(16748608) + var115.field960 + class2.field23;
                                                    } else {
                                                        var116 = class2.method1507(16748608) + var115.field960 + class2.field23 + " " + 'x' + method1163(var10.field2631[var112]);
                                                    }
                                                    int var117 = (var10.field2581 + 115) * var114 + var13;
                                                    int var118 = (var10.field2582 + 12) * var113 + var14;
                                                    if (var10.field2616 == 0) {
                                                        var111.method3322(var116, var117, var118, var10.field2545, var10.field2547 ? 0 : -1);
                                                    } else if (var10.field2616 == 1) {
                                                        var111.method3324(var116, var10.field2555 / 2 + var117, var118, var10.field2545, var10.field2547 ? 0 : -1);
                                                    } else {
                                                        var111.method3372(var116, var10.field2555 + var117 - 1, var118, var10.field2545, var10.field2547 ? 0 : -1);
                                                    }
                                                }
                                                var112++;
                                            }
                                        }
                                    }
                                    if (var10.field2530 == 8 && Statics.field367 == var10 && field710 == field600) {
                                        int var119 = 0;
                                        int var120 = 0;
                                        class181 var121 = Statics.field1259;
                                        String var122 = var10.field2575;
                                        String var123 = method208(var122, var10);
                                        while (var123.length() > 0) {
                                            int var124 = var123.indexOf(class2.field22);
                                            String var125;
                                            if (var124 == -1) {
                                                var125 = var123;
                                                var123 = "";
                                            } else {
                                                var125 = var123.substring(0, var124);
                                                var123 = var123.substring(var124 + 4);
                                            }
                                            int var126 = var121.method3349(var125);
                                            if (var126 > var119) {
                                                var119 = var126;
                                            }
                                            var120 += var121.field2787 + 1;
                                        }
                                        var119 += 6;
                                        var120 += 7;
                                        int var127 = var10.field2555 + var13 - 5 - var119;
                                        int var128 = var10.field2538 + var14 + 5;
                                        if (var127 < var13 + 5) {
                                            var127 = var13 + 5;
                                        }
                                        if (var119 + var127 > arg4) {
                                            var127 = arg4 - var119;
                                        }
                                        if (var120 + var128 > arg5) {
                                            var128 = arg5 - var120;
                                        }
                                        class88.method1776(var127, var128, var119, var120, 16777120);
                                        class88.method1755(var127, var128, var119, var120, 0);
                                        String var129 = var10.field2575;
                                        int var130 = var121.field2787 + var128 + 2;
                                        String var131 = method208(var129, var10);
                                        while (var131.length() > 0) {
                                            int var132 = var131.indexOf(class2.field22);
                                            String var133;
                                            if (var132 == -1) {
                                                var133 = var131;
                                                var131 = "";
                                            } else {
                                                var133 = var131.substring(0, var132);
                                                var131 = var131.substring(var132 + 4);
                                            }
                                            var121.method3322(var133, var127 + 3, var130, 0, -1);
                                            var130 += var121.field2787 + 1;
                                        }
                                    }
                                    if (var10.field2530 == 9) {
                                        if (var10.field2551 == 1) {
                                            class88.method1782(var13, var14, var10.field2555 + var13, var10.field2538 + var14, var10.field2545);
                                        } else {
                                            int var134 = var10.field2555 >= 0 ? var10.field2555 : -var10.field2555;
                                            int var135 = var10.field2538 >= 0 ? var10.field2538 : -var10.field2538;
                                            int var136 = var134;
                                            if (var134 < var135) {
                                                var136 = var135;
                                            }
                                            if (var136 != 0) {
                                                int var137 = (var10.field2555 << 16) / var136;
                                                int var138 = (var10.field2538 << 16) / var136;
                                                if (var138 <= var137) {
                                                    var137 = -var137;
                                                } else {
                                                    var138 = -var138;
                                                }
                                                int var139 = var10.field2551 * var138 >> 17;
                                                int var140 = var10.field2551 * var138 + 1 >> 17;
                                                int var141 = var10.field2551 * var137 >> 17;
                                                int var142 = var10.field2551 * var137 + 1 >> 17;
                                                int var143 = var13 + var139;
                                                int var144 = var13 - var140;
                                                int var145 = var10.field2555 + var13 - var140;
                                                int var146 = var10.field2555 + var13 + var139;
                                                int var147 = var14 + var141;
                                                int var148 = var14 - var142;
                                                int var149 = var10.field2538 + var14 - var142;
                                                int var150 = var10.field2538 + var14 + var141;
                                                class103.method2087(var143, var144, var145);
                                                class103.method2091(var147, var148, var149, var143, var144, var145, var10.field2545);
                                                class103.method2087(var143, var145, var146);
                                                class103.method2091(var147, var149, var150, var143, var145, var146, var10.field2545);
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

    @ObfuscatedName("t.cd(Ljava/lang/String;Lee;I)Ljava/lang/String;")
    public static String method208(String arg0, class156 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method33(arg1, var2 - 1);
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
                if (Statics.field1990 != null) {
                    var8 = class146.method697(Statics.field1990.field1401);
                    if (Statics.field1990.field1398 != null) {
                        var8 = (String) Statics.field1990.field1398;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("aq.cc(IB)Ljava/lang/String;")
    public static final String method1163(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field24 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1507(65408) + var1.substring(0, var1.length() - 8) + class133.field2211 + " " + class2.field35 + var1 + class2.field20 + class2.field23;
        } else if (var1.length() > 6) {
            return " " + class2.method1507(16777215) + var1.substring(0, var1.length() - 4) + class133.field2213 + " " + class2.field35 + var1 + class2.field20 + class2.field23;
        } else {
            return " " + class2.method1507(16776960) + var1 + class2.field23;
        }
    }

    @ObfuscatedName("cm.cx(Lee;S)Z")
    public static final boolean method2071(class156 arg0) {
        if (arg0.field2625 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2625.length; var1++) {
            int var2 = method33(arg0, var1);
            int var3 = arg0.field2626[var1];
            if (arg0.field2625[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2625[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2625[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("c.cp(Lee;II)I")
    public static final int method33(class156 arg0, int arg1) {
        if (arg0.field2527 == null || arg1 >= arg0.field2527.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2527[arg1];
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
                    var7 = field595[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field596[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field715[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class156 var11 = class156.method822(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method1818(var12).field975 || field624)) {
                        for (int var13 = 0; var13 < var11.field2630.length; var13++) {
                            if (var12 + 1 == var11.field2630[var13]) {
                                var7 += var11.field2631[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2647[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2029[field596[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2647[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field244.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2028[var14]) {
                            var7 += field596[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class156 var17 = class156.method822(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method1818(var18).field975 || field624)) {
                        for (int var19 = 0; var19 < var17.field2630.length; var19++) {
                            if (var18 + 1 == var17.field2630[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field622;
                }
                if (var6 == 12) {
                    var7 = field623;
                }
                if (var6 == 13) {
                    int var20 = class157.field2647[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method1999(var22);
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
                    var7 = (Statics.field244.field396 >> 7) + Statics.field953;
                }
                if (var6 == 19) {
                    var7 = (Statics.field244.field394 >> 7) + Statics.field450;
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

    @ObfuscatedName("y.cw(Lee;III)V")
    public static final void method10(class156 arg0, int arg1, int arg2) {
        if (arg0.field2585 == 1) {
            method2624(arg0.field2583, "", 24, 0, 0, arg0.field2528);
        }
        if (arg0.field2585 == 2 && !field613) {
            int var3 = method210(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2594 == null || arg0.field2594.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2594;
            }
            if (var5 != null) {
                method2624(var5, class2.method1507(65280) + arg0.field2628, 25, 0, -1, arg0.field2528);
            }
        }
        if (arg0.field2585 == 3) {
            method2624(class133.field2209, "", 26, 0, 0, arg0.field2528);
        }
        if (arg0.field2585 == 4) {
            method2624(arg0.field2583, "", 28, 0, 0, arg0.field2528);
        }
        if (arg0.field2585 == 5) {
            method2624(arg0.field2583, "", 29, 0, 0, arg0.field2528);
        }
        if (arg0.field2585 == 6 && field621 == null) {
            method2624(arg0.field2583, "", 30, 0, -1, arg0.field2528);
        }
        if (arg0.field2530 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2538; var8++) {
                for (int var9 = 0; var9 < arg0.field2555; var9++) {
                    int var10 = (arg0.field2581 + 32) * var9;
                    int var11 = (arg0.field2582 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2618[var7];
                        var11 += arg0.field2584[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field523 = var7;
                        Statics.field1980 = arg0;
                        if (arg0.field2630[var7] > 0) {
                            class39 var12 = class39.method1818(arg0.field2630[var7] - 1);
                            if (field551 == 1 && class160.method2634(method210(arg0))) {
                                if (Statics.field6 != arg0.field2528 || Statics.field188 != var7) {
                                    method2624(class133.field2200, field612 + " " + class2.field17 + " " + class2.method1507(16748608) + var12.field960, 31, var12.field976, var7, arg0.field2528);
                                }
                            } else if (!field613 || !class160.method2634(method210(arg0))) {
                                String[] var13 = var12.field964;
                                if (field627) {
                                    var13 = method2622(var13);
                                }
                                if (class160.method2634(method210(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method2624(var13[var14], class2.method1507(16748608) + var12.field960, var15, var12.field976, var7, arg0.field2528);
                                        } else if (var14 == 4) {
                                            method2624(class133.field2061, class2.method1507(16748608) + var12.field960, 37, var12.field976, var7, arg0.field2528);
                                        }
                                    }
                                }
                                int var16 = method210(arg0);
                                boolean var17 = (var16 >> 31 & 0x1) != 0;
                                if (var17) {
                                    method2624(class133.field2200, class2.method1507(16748608) + var12.field960, 38, var12.field976, var7, arg0.field2528);
                                }
                                class160 var10000 = (class160) null;
                                if (class160.method2634(method210(arg0)) && var13 != null) {
                                    for (int var18 = 2; var18 >= 0; var18--) {
                                        if (var13[var18] != null) {
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 33;
                                            }
                                            if (var18 == 1) {
                                                var19 = 34;
                                            }
                                            if (var18 == 2) {
                                                var19 = 35;
                                            }
                                            method2624(var13[var18], class2.method1507(16748608) + var12.field960, var19, var12.field976, var7, arg0.field2528);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2586;
                                if (field627) {
                                    var20 = method2622(var20);
                                }
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 39;
                                            }
                                            if (var21 == 1) {
                                                var22 = 40;
                                            }
                                            if (var21 == 2) {
                                                var22 = 41;
                                            }
                                            if (var21 == 3) {
                                                var22 = 42;
                                            }
                                            if (var21 == 4) {
                                                var22 = 43;
                                            }
                                            method2624(var20[var21], class2.method1507(16748608) + var12.field960, var22, var12.field976, var7, arg0.field2528);
                                        }
                                    }
                                }
                                method2624(class133.field2253, class2.method1507(16748608) + var12.field960, 1005, var12.field976, var7, arg0.field2528);
                            } else if ((Statics.field931 & 0x10) == 16) {
                                method2624(field615, field616 + " " + class2.field17 + " " + class2.method1507(16748608) + var12.field960, 32, var12.field976, var7, arg0.field2528);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2595) {
            return;
        }
        if (field613) {
            int var23 = method210(arg0);
            boolean var24 = (var23 >> 21 & 0x1) != 0;
            if (var24 && (Statics.field931 & 0x20) == 32) {
                method2624(field615, field616 + " " + class2.field17 + " " + arg0.field2533, 58, 0, arg0.field2629, arg0.field2528);
            }
            return;
        }
        for (int var25 = 9; var25 >= 5; var25--) {
            String var26 = method2886(arg0, var25);
            if (var26 != null) {
                method2624(var26, arg0.field2533, 1007, var25 + 1, arg0.field2629, arg0.field2528);
            }
        }
        int var27 = method210(arg0);
        int var28 = var27 >> 11 & 0x3F;
        String var29;
        if (var28 == 0) {
            var29 = null;
        } else if (arg0.field2594 == null || arg0.field2594.trim().length() == 0) {
            var29 = null;
        } else {
            var29 = arg0.field2594;
        }
        if (var29 != null) {
            method2624(var29, arg0.field2533, 25, 0, arg0.field2629, arg0.field2528);
        }
        for (int var31 = 4; var31 >= 0; var31--) {
            String var32 = method2886(arg0, var31);
            if (var32 != null) {
                method2624(var32, arg0.field2533, 57, var31 + 1, arg0.field2629, arg0.field2528);
            }
        }
        if (class160.method2073(method210(arg0))) {
            method2624(class133.field2065, "", 30, 0, arg0.field2629, arg0.field2528);
        }
    }

    @ObfuscatedName("z.cj(IIIIIIIB)V")
    public static final void method22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class156.method60(arg0)) {
            method21(Statics.field2592[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("z.co([Lee;IIIIIIIB)V")
    public static final void method21(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class156 var9 = arg0[var8];
            if (var9 != null && (!var9.field2595 || var9.field2530 == 0 || var9.field2632 || method210(var9) != 0 || field629 == var9) && var9.field2641 == arg1 && (!var9.field2595 || !method202(var9))) {
                int var10 = var9.field2540 + arg6;
                int var11 = var9.field2534 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2530 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2530 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2555 + var10;
                    int var19 = var9.field2538 + var11;
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
                    int var22 = var9.field2555 + var10;
                    int var23 = var9.field2538 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field471 == var9) {
                    field521 = true;
                    field477 = var10;
                    field611 = var11;
                }
                if (!var9.field2595 || var12 < var14 && var13 < var15) {
                    if (var9.field2532 == 1337) {
                        method1345(var9);
                    } else if (var9.field2532 == 1338) {
                        method2070(var10, var11);
                    } else {
                        if (var9.field2530 == 0) {
                            if (!var9.field2595 && method202(var9) && Statics.field447 != var9) {
                                continue;
                            }
                            method21(arg0, var9.field2528, var12, var13, var14, var15, var10 - var9.field2541, var11 - var9.field2542);
                            if (var9.field2644 != null) {
                                method21(var9.field2644, var9.field2528, var12, var13, var14, var15, var10 - var9.field2541, var11 - var9.field2542);
                            }
                            class4 var24 = (class4) field618.method3222((long) var9.field2528);
                            if (var24 != null) {
                                method22(var24.field61, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2595) {
                            boolean var25;
                            if (class76.field1378 >= var12 && class76.field1379 >= var13 && class76.field1378 < var14 && class76.field1379 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class76.field1377 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class76.field1384 == 1 && class76.field1386 >= var12 && class76.field1383 >= var13 && class76.field1386 < var14 && class76.field1383 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                method1343(var9, class76.field1386 - var10, class76.field1383 - var11);
                            }
                            if (field471 != null && field471 != var9 && var25) {
                                int var28 = method210(var9);
                                boolean var29 = (var28 >> 20 & 0x1) != 0;
                                if (var29) {
                                    field632 = var9;
                                }
                            }
                            if (field629 == var9) {
                                field633 = true;
                                field634 = var10;
                                field635 = var11;
                            }
                            if (var9.field2632) {
                                if (var25 && field653 != 0 && var9.field2591 != null) {
                                    class1 var30 = new class1();
                                    var30.field2 = var9;
                                    var30.field4 = field653;
                                    var30.field1 = var9.field2591;
                                    field654.method3283(var30);
                                }
                                if (field471 != null || Statics.field1916 != null || field599) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2636 && var27) {
                                    var9.field2636 = true;
                                    if (var9.field2597 != null) {
                                        class1 var31 = new class1();
                                        var31.field2 = var9;
                                        var31.field13 = class76.field1386 - var10;
                                        var31.field4 = class76.field1383 - var11;
                                        var31.field1 = var9.field2597;
                                        field654.method3283(var31);
                                    }
                                }
                                if (var9.field2636 && var26 && var9.field2598 != null) {
                                    class1 var32 = new class1();
                                    var32.field2 = var9;
                                    var32.field13 = class76.field1378 - var10;
                                    var32.field4 = class76.field1379 - var11;
                                    var32.field1 = var9.field2598;
                                    field654.method3283(var32);
                                }
                                if (var9.field2636 && !var26) {
                                    var9.field2636 = false;
                                    if (var9.field2599 != null) {
                                        class1 var33 = new class1();
                                        var33.field2 = var9;
                                        var33.field13 = class76.field1378 - var10;
                                        var33.field4 = class76.field1379 - var11;
                                        var33.field1 = var9.field2599;
                                        field656.method3283(var33);
                                    }
                                }
                                if (var26 && var9.field2600 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field13 = class76.field1378 - var10;
                                    var34.field4 = class76.field1379 - var11;
                                    var34.field1 = var9.field2600;
                                    field654.method3283(var34);
                                }
                                if (!var9.field2568 && var25) {
                                    var9.field2568 = true;
                                    if (var9.field2571 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field13 = class76.field1378 - var10;
                                        var35.field4 = class76.field1379 - var11;
                                        var35.field1 = var9.field2571;
                                        field654.method3283(var35);
                                    }
                                }
                                if (var9.field2568 && var25 && var9.field2576 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field13 = class76.field1378 - var10;
                                    var36.field4 = class76.field1379 - var11;
                                    var36.field1 = var9.field2576;
                                    field654.method3283(var36);
                                }
                                if (var9.field2568 && !var25) {
                                    var9.field2568 = false;
                                    if (var9.field2603 != null) {
                                        class1 var37 = new class1();
                                        var37.field2 = var9;
                                        var37.field13 = class76.field1378 - var10;
                                        var37.field4 = class76.field1379 - var11;
                                        var37.field1 = var9.field2603;
                                        field656.method3283(var37);
                                    }
                                }
                                if (var9.field2614 != null) {
                                    class1 var38 = new class1();
                                    var38.field2 = var9;
                                    var38.field1 = var9.field2614;
                                    field655.method3283(var38);
                                }
                                if (var9.field2608 != null && field574 > var9.field2640) {
                                    if (var9.field2609 == null || field574 - var9.field2640 > 32) {
                                        class1 var43 = new class1();
                                        var43.field2 = var9;
                                        var43.field1 = var9.field2608;
                                        field654.method3283(var43);
                                    } else {
                                        label436: for (int var39 = var9.field2640; var39 < field574; var39++) {
                                            int var40 = field641[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var9.field2609.length; var41++) {
                                                if (var9.field2609[var41] == var40) {
                                                    class1 var42 = new class1();
                                                    var42.field2 = var9;
                                                    var42.field1 = var9.field2608;
                                                    field654.method3283(var42);
                                                    break label436;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2640 = field574;
                                }
                                if (var9.field2610 != null && field664 > var9.field2601) {
                                    if (var9.field2611 == null || field664 - var9.field2601 > 32) {
                                        class1 var48 = new class1();
                                        var48.field2 = var9;
                                        var48.field1 = var9.field2610;
                                        field654.method3283(var48);
                                    } else {
                                        label416: for (int var44 = var9.field2601; var44 < field664; var44++) {
                                            int var45 = field644[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var9.field2611.length; var46++) {
                                                if (var9.field2611[var46] == var45) {
                                                    class1 var47 = new class1();
                                                    var47.field2 = var9;
                                                    var47.field1 = var9.field2610;
                                                    field654.method3283(var47);
                                                    break label416;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2601 = field664;
                                }
                                if (var9.field2557 != null && field646 > var9.field2642) {
                                    if (var9.field2613 == null || field646 - var9.field2642 > 32) {
                                        class1 var53 = new class1();
                                        var53.field2 = var9;
                                        var53.field1 = var9.field2557;
                                        field654.method3283(var53);
                                    } else {
                                        label396: for (int var49 = var9.field2642; var49 < field646; var49++) {
                                            int var50 = field693[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field2613.length; var51++) {
                                                if (var9.field2613[var51] == var50) {
                                                    class1 var52 = new class1();
                                                    var52.field2 = var9;
                                                    var52.field1 = var9.field2557;
                                                    field654.method3283(var52);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2642 = field646;
                                }
                                if (field647 > var9.field2639 && var9.field2617 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = var9;
                                    var54.field1 = var9.field2617;
                                    field654.method3283(var54);
                                }
                                if (field648 > var9.field2639 && var9.field2619 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field1 = var9.field2619;
                                    field654.method3283(var55);
                                }
                                if (field649 > var9.field2639 && var9.field2580 != null) {
                                    class1 var56 = new class1();
                                    var56.field2 = var9;
                                    var56.field1 = var9.field2580;
                                    field654.method3283(var56);
                                }
                                if (field650 > var9.field2639 && var9.field2621 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field1 = var9.field2621;
                                    field654.method3283(var57);
                                }
                                var9.field2639 = field640;
                                if (var9.field2539 != null) {
                                    for (int var58 = 0; var58 < field678; var58++) {
                                        class1 var59 = new class1();
                                        var59.field2 = var9;
                                        var59.field7 = field680[var58];
                                        var59.field3 = field676[var58];
                                        var59.field1 = var9.field2539;
                                        field654.method3283(var59);
                                    }
                                }
                            }
                        }
                        if (!var9.field2595) {
                            if (field471 != null || Statics.field1916 != null || field599) {
                                return;
                            }
                            if ((var9.field2627 >= 0 || var9.field2525 != 0) && class76.field1378 >= var12 && class76.field1379 >= var13 && class76.field1378 < var14 && class76.field1379 < var15) {
                                if (var9.field2627 >= 0) {
                                    Statics.field447 = arg0[var9.field2627];
                                } else {
                                    Statics.field447 = var9;
                                }
                            }
                            if (var9.field2530 == 8 && class76.field1378 >= var12 && class76.field1379 >= var13 && class76.field1378 < var14 && class76.field1379 < var15) {
                                Statics.field367 = var9;
                            }
                            if (var9.field2624 > var9.field2538) {
                                int var60 = var9.field2555 + var10;
                                int var61 = var9.field2538;
                                int var62 = var9.field2624;
                                int var63 = class76.field1378;
                                int var64 = class76.field1379;
                                if (field559) {
                                    field470 = 32;
                                } else {
                                    field470 = 0;
                                }
                                field559 = false;
                                if (class76.field1377 != 0) {
                                    if (var63 >= var60 && var63 < var60 + 16 && var64 >= var11 && var64 < var11 + 16) {
                                        var9.field2542 -= 4;
                                        method1345(var9);
                                    } else if (var63 >= var60 && var63 < var60 + 16 && var64 >= var11 + var61 - 16 && var64 < var11 + var61) {
                                        var9.field2542 += 4;
                                        method1345(var9);
                                    } else if (var63 >= var60 - field470 && var63 < field470 + var60 + 16 && var64 >= var11 + 16 && var64 < var11 + var61 - 16) {
                                        int var65 = (var61 - 32) * var61 / var62;
                                        if (var65 < 8) {
                                            var65 = 8;
                                        }
                                        int var66 = var64 - var11 - 16 - var65 / 2;
                                        int var67 = var61 - 32 - var65;
                                        var9.field2542 = (var62 - var61) * var66 / var67;
                                        method1345(var9);
                                        field559 = true;
                                    }
                                }
                                if (field653 != 0) {
                                    int var68 = var9.field2555;
                                    if (var63 >= var60 - var68 && var64 >= var11 && var63 < var60 + 16 && var64 <= var11 + var61) {
                                        var9.field2542 += field653 * 45;
                                        method1345(var9);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cn([Lee;II)V")
    public static final void method2(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2530 == 0) {
                    if (var3.field2644 != null) {
                        method2(var3.field2644, arg1);
                    }
                    class4 var4 = (class4) field618.method3222((long) var3.field2528);
                    if (var4 != null) {
                        int var5 = var4.field61;
                        if (class156.method60(var5)) {
                            method2(Statics.field2592[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2622 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field1 = var3.field2622;
                    class25.method1580(var6);
                }
                if (arg1 == 1 && var3.field2544 != null) {
                    if (var3.field2629 >= 0) {
                        class156 var7 = class156.method822(var3.field2528);
                        if (var7 == null || var7.field2644 == null || var3.field2629 >= var7.field2644.length || var7.field2644[var3.field2629] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field1 = var3.field2544;
                    class25.method1580(var8);
                }
            }
        }
    }

    @ObfuscatedName("bh.ce(Lee;III)V")
    public static final void method1343(class156 arg0, int arg1, int arg2) {
        if (field471 != null || field599 || arg0 == null || method123(arg0) == null) {
            return;
        }
        field471 = arg0;
        field629 = method123(arg0);
        field630 = arg1;
        field642 = arg2;
        Statics.field2334 = 0;
        field639 = false;
    }

    @ObfuscatedName("o.ca(I)V")
    public static final void method124() {
        method1345(field471);
        Statics.field2334++;
        if (field521 && field633) {
            int var0 = class76.field1378;
            int var1 = class76.field1379;
            int var2 = var0 - field630;
            int var3 = var1 - field642;
            if (var2 < field634) {
                var2 = field634;
            }
            if (field471.field2555 + var2 > field634 + field629.field2555) {
                var2 = field634 + field629.field2555 - field471.field2555;
            }
            if (var3 < field635) {
                var3 = field635;
            }
            if (field471.field2538 + var3 > field635 + field629.field2538) {
                var3 = field635 + field629.field2538 - field471.field2538;
            }
            int var4 = var2 - field477;
            int var5 = var3 - field611;
            int var6 = field471.field2578;
            if (Statics.field2334 > field471.field2643 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field639 = true;
            }
            int var7 = field629.field2541 + (var2 - field634);
            int var8 = field629.field2542 + (var3 - field635);
            if (field471.field2574 != null && field639) {
                class1 var9 = new class1();
                var9.field2 = field471;
                var9.field13 = var7;
                var9.field4 = var8;
                var9.field1 = field471.field2574;
                class25.method1580(var9);
            }
            if (class76.field1377 == 0) {
                if (field639) {
                    if (field471.field2605 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field471;
                        var10.field13 = var7;
                        var10.field4 = var8;
                        var10.field12 = field632;
                        var10.field1 = field471.field2605;
                        class25.method1580(var10);
                    }
                    if (field632 != null) {
                        class156 var11 = field471;
                        int var12 = method210(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class156 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class156.method822(var11.field2641);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field631.method2273(190);
                            field631.method2505(field471.field2629);
                            field631.method2420(field471.field2528);
                            field631.method2579(field632.field2629);
                            field631.method2420(field632.field2528);
                        }
                    }
                } else if ((field598 == 1 || method593(field637 - 1)) && field637 > 2) {
                    method2247();
                } else if (field637 > 0) {
                    method27(field637 - 1);
                }
                field471 = null;
            }
        } else if (Statics.field2334 > 1) {
            field471 = null;
        }
    }

    @ObfuscatedName("bp.cy(Lee;I)V")
    public static void method1345(class156 arg0) {
        if (field659 == arg0.field2548) {
            field660[arg0.field2559] = true;
        }
    }

    @ObfuscatedName("bo.cq(B)V")
    public static void method1482() {
        for (class4 var0 = (class4) field618.method3225(); var0 != null; var0 = (class4) field618.method3230()) {
            int var1 = var0.field61;
            if (class156.method60(var1)) {
                boolean var2 = true;
                class156[] var3 = Statics.field2592[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2595;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2758;
                    class156 var6 = class156.method822(var5);
                    if (var6 != null) {
                        method1345(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.cz(Lee;B)Lee;")
    public static class156 method123(class156 arg0) {
        class156 var1 = arg0;
        int var2 = method210(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class156 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class156.method822(var1.field2641);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class156 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2590;
        }
        return var7;
    }

    @ObfuscatedName("ez.ck([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2622(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("t.cm(II)V")
    public static final void method206(int arg0) {
        if (!class156.method60(arg0)) {
            return;
        }
        class156[] var1 = Statics.field2592[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class156 var3 = var1[var2];
            if (var3 != null) {
                var3.field2634 = 0;
                var3.field2635 = 0;
            }
        }
    }

    @ObfuscatedName("dk.cf([Lee;II)V")
    public static final void method2149(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null && var3.field2641 == arg1 && (!var3.field2595 || !method202(var3))) {
                if (var3.field2530 == 0) {
                    if (!var3.field2595 && method202(var3) && Statics.field447 != var3) {
                        continue;
                    }
                    method2149(arg0, var3.field2528);
                    if (var3.field2644 != null) {
                        method2149(var3.field2644, var3.field2528);
                    }
                    class4 var4 = (class4) field618.method3222((long) var3.field2528);
                    if (var4 != null) {
                        int var5 = var4.field61;
                        if (class156.method60(var5)) {
                            method2149(Statics.field2592[var5], -1);
                        }
                    }
                }
                if (var3.field2530 == 6) {
                    if (var3.field2564 != -1 || var3.field2565 != -1) {
                        boolean var6 = method2071(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2565;
                        } else {
                            var7 = var3.field2564;
                        }
                        if (var7 != -1) {
                            class33 var8 = class33.method2614(var7);
                            var3.field2635 += field534;
                            while (var3.field2635 > var8.field863[var3.field2634]) {
                                var3.field2635 -= var8.field863[var3.field2634];
                                var3.field2634++;
                                if (var3.field2634 >= var8.field861.length) {
                                    var3.field2634 -= var8.field865;
                                    if (var3.field2634 < 0 || var3.field2634 >= var8.field861.length) {
                                        var3.field2634 = 0;
                                    }
                                }
                                method1345(var3);
                            }
                        }
                    }
                    if (var3.field2572 != 0 && !var3.field2595) {
                        int var9 = var3.field2572 >> 16;
                        int var10 = var3.field2572 << 16 >> 16;
                        int var11 = field534 * var9;
                        int var12 = field534 * var10;
                        var3.field2638 = var3.field2638 + var11 & 0x7FF;
                        var3.field2569 = var3.field2569 + var12 & 0x7FF;
                        method1345(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("m.cl(IB)V")
    public static final void method127(int arg0) {
        method1482();
        class7.method24();
        class41 var1 = (class41) class41.field1019.method3191((long) arg0);
        class41 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1016.method2903(16, arg0);
            class41 var4 = new class41();
            if (var3 != null) {
                var4.method876(new class126(var3));
            }
            class41.field1019.method3181(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1017;
        if (var5 == 0) {
            return;
        }
        int var6 = class157.field2647[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class103.method2098(0.9D);
                ((class109) Statics.field1761).method2160(0.9D);
            }
            if (var6 == 2) {
                class103.method2098(0.8D);
                ((class109) Statics.field1761).method2160(0.8D);
            }
            if (var6 == 3) {
                class103.method2098(0.7D);
                ((class109) Statics.field1761).method2160(0.7D);
            }
            if (var6 == 4) {
                class103.method2098(0.6D);
                ((class109) Statics.field1761).method2160(0.6D);
            }
            class39.field968.method3185();
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
            if (field691 != var7) {
                if (field691 == 0 && field692 != -1) {
                    class137.method783(Statics.field488, field692, 0, var7, false);
                    field540 = false;
                } else if (var7 == 0) {
                    Statics.method50();
                    field540 = false;
                } else {
                    class137.method1609(var7);
                }
                field691 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field695 = 127;
            }
            if (var6 == 1) {
                field695 = 96;
            }
            if (var6 == 2) {
                field695 = 64;
            }
            if (var6 == 3) {
                field695 = 32;
            }
            if (var6 == 4) {
                field695 = 0;
            }
        }
        if (var5 == 5) {
            field598 = var6;
        }
        if (var5 == 6) {
            field587 = var6;
        }
        if (var5 == 9) {
            field620 = var6;
        }
        if (var5 != 10) {
            return;
        }
        if (var6 == 0) {
            field711 = 127;
        }
        if (var6 == 1) {
            field711 = 96;
        }
        if (var6 == 2) {
            field711 = 64;
        }
        if (var6 == 3) {
            field711 = 32;
        }
        if (var6 == 4) {
            field711 = 0;
        }
    }

    @ObfuscatedName("q.ch(I)V")
    public static final void method108() {
        field631.method2273(121);
        for (class4 var0 = (class4) field618.method3225(); var0 != null; var0 = (class4) field618.method3230()) {
            if (var0.field68 == 0 || var0.field68 == 3) {
                method138(var0, true);
            }
        }
        if (field621 != null) {
            method1345(field621);
            field621 = null;
        }
    }

    @ObfuscatedName("aw.dq(IIII)Lz;")
    public static final class4 method607(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field61 = arg1;
        var3.field68 = arg2;
        field618.method3223(var3, (long) arg0);
        method206(arg1);
        class25.method133(arg1);
        class156 var4 = class156.method822(arg0);
        if (var4 != null) {
            method1345(var4);
        }
        if (field621 != null) {
            method1345(field621);
            field621 = null;
        }
        field599 = false;
        field637 = 0;
        method211(Statics.field1251, Statics.field1612, Statics.field1004, Statics.field269);
        if (field617 != -1) {
            int var5 = field617;
            if (class156.method60(var5)) {
                method2(Statics.field2592[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("r.dy(Lz;ZI)V")
    public static final void method138(class4 arg0, boolean arg1) {
        int var2 = arg0.field61;
        int var3 = (int) arg0.field2758;
        arg0.method3289();
        if (arg1 && var2 != -1 && Statics.field1982[var2]) {
            Statics.field2656.method2901(var2);
            if (Statics.field2592[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2592[var2].length; var5++) {
                    if (Statics.field2592[var2][var5] != null) {
                        if (Statics.field2592[var2][var5].field2530 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2592[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2592[var2] = null;
                }
                Statics.field1982[var2] = false;
            }
        }
        method2633(var2);
        class156 var6 = class156.method822(var3);
        if (var6 != null) {
            method1345(var6);
        }
        field599 = false;
        field637 = 0;
        method211(Statics.field1251, Statics.field1612, Statics.field1004, Statics.field269);
        if (field617 != -1) {
            int var7 = field617;
            if (class156.method60(var7)) {
                method2(Statics.field2592[var7], 1);
            }
        }
    }

    @ObfuscatedName("c.dk(Lee;B)Z")
    public static final boolean method30(class156 arg0) {
        int var1 = arg0.field2532;
        if (var1 == 205) {
            field502 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field657.method3108(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field657.method3113(var4, var5 == 1);
        }
        if (var1 == 324) {
            field657.method3110(false);
        }
        if (var1 == 325) {
            field657.method3110(true);
        }
        if (var1 == 326) {
            field631.method2273(25);
            field657.method3111(field631);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("au.du(IIIILct;B)V")
    public static final void method572(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method155(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field543 + field529 & 0x7FF;
        int var7 = class103.field1764[var6];
        int var8 = class103.field1765[var6];
        int var9 = var7 * 256 / (field531 + 256);
        int var10 = var8 * 256 / (field531 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1914.method1699(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("d.dn(IIIILct;B)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field543 + field529 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class103.field1764[var5];
        int var8 = class103.field1765[var5];
        int var9 = var7 * 256 / (field531 + 256);
        int var10 = var8 * 256 / (field531 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1670(Statics.field851, arg0 + 94 + var11 - arg4.field1463 / 2 + 4, arg1 + 83 - var12 - arg4.field1457 / 2 - 4);
        } else {
            arg4.method1656(arg0 + 94 + var11 - arg4.field1463 / 2 + 4, arg1 + 83 - var12 - arg4.field1457 / 2 - 4);
        }
    }

    @ObfuscatedName("y.dv(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method8(int arg0, String arg1, String arg2) {
        method34(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("c.dh(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method34(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field569[var4] = field569[var4 - 1];
            field709[var4] = field709[var4 - 1];
            field671[var4] = field671[var4 - 1];
            field670[var4] = field670[var4 - 1];
        }
        field569[0] = arg0;
        field709[0] = arg1;
        field671[0] = arg2;
        field670[0] = arg3;
        field496++;
        field647 = field640;
    }

    @ObfuscatedName("d.dg(Ljava/lang/String;B)Z")
    public static boolean method154(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method51(arg0, Statics.field183);
        for (int var2 = 0; var2 < field546; var2++) {
            if (var1.equalsIgnoreCase(class147.method51(field564[var2].field347, Statics.field183))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method51(Statics.field244.field37, Statics.field183))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("z.dl(Ljava/lang/String;I)Z")
    public static boolean method25(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method51(arg0, Statics.field183);
        for (int var2 = 0; var2 < field694; var2++) {
            class11 var3 = field685[var2];
            if (var1.equalsIgnoreCase(class147.method51(var3.field179, Statics.field183))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method51(var3.field178, Statics.field183))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("bm.db(Ljava/lang/String;I)V")
    public static final void method1324(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class147.method51(arg0, Statics.field183);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field694; var2++) {
            class11 var3 = field685[var2];
            String var4 = var3.field179;
            String var5 = class147.method51(var4, Statics.field183);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field694--;
                for (int var7 = var2; var7 < field694; var7++) {
                    field685[var7] = field685[var7 + 1];
                }
                field648 = field640;
                field631.method2273(164);
                field631.method2369(class126.method871(arg0));
                field631.method2374(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("l.dj(Ljava/lang/String;II)V")
    public static final void method212(String arg0, int arg1) {
        field631.method2273(112);
        field631.method2369(class126.method871(arg0) + 1);
        field631.method2575(arg1);
        field631.method2374(arg0);
    }

    @ObfuscatedName("eq.do(IB)V")
    public static void method2633(int arg0) {
        for (class169 var1 = (class169) field673.method3225(); var1 != null; var1 = (class169) field673.method3230()) {
            if ((var1.field2758 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3289();
            }
        }
    }

    @ObfuscatedName("t.dp(Lee;I)I")
    public static int method210(class156 arg0) {
        class169 var1 = (class169) field673.method3222(((long) arg0.field2528 << 32) + (long) arg0.field2629);
        return var1 == null ? arg0.field2587 : var1.field2742;
    }

    @ObfuscatedName("b.df(Lee;I)Z")
    public static boolean method202(class156 arg0) {
        if (field626) {
            if (method210(arg0) != 0) {
                return false;
            }
            if (arg0.field2530 == 0) {
                return false;
            }
        }
        return arg0.field2620;
    }

    @ObfuscatedName("er.dw(Lee;II)Ljava/lang/String;")
    public static String method2886(class156 arg0, int arg1) {
        if (!class160.method1485(method210(arg0), arg1) && arg0.field2604 == null) {
            return null;
        } else if (arg0.field2602 == null || arg0.field2602.length <= arg1 || arg0.field2602[arg1] == null || arg0.field2602[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2602[arg1];
        }
    }
}

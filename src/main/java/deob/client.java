package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.v")
    public static boolean field520 = true;

    @ObfuscatedName("client.r")
    public static int field639 = 1;

    @ObfuscatedName("client.i")
    public static int field469 = 0;

    @ObfuscatedName("client.w")
    public static class164[] field524 = new class164[4];

    @ObfuscatedName("client.t")
    public static boolean field714 = false;

    @ObfuscatedName("client.f")
    public static boolean field472 = false;

    @ObfuscatedName("client.b")
    public static int field573 = 0;

    @ObfuscatedName("client.l")
    public static int field474 = 0;

    @ObfuscatedName("client.e")
    public static boolean field475 = true;

    @ObfuscatedName("client.p")
    public static int field476 = 0;

    @ObfuscatedName("client.o")
    public static long field477 = 1L;

    @ObfuscatedName("client.j")
    public static int field478 = -1;

    @ObfuscatedName("client.k")
    public static int field479 = -1;

    @ObfuscatedName("client.a")
    public static int field480 = -1;

    @ObfuscatedName("client.q")
    public static boolean field481 = true;

    @ObfuscatedName("client.c")
    public static boolean field464 = false;

    @ObfuscatedName("client.u")
    public static int field483 = 0;

    @ObfuscatedName("client.ah")
    public static int field484 = 0;

    @ObfuscatedName("client.az")
    public static int field485 = 0;

    @ObfuscatedName("client.au")
    public static int field486 = 0;

    @ObfuscatedName("client.ae")
    public static int field487 = 0;

    @ObfuscatedName("client.aa")
    public static int field488 = 0;

    @ObfuscatedName("client.av")
    public static int field489 = 0;

    @ObfuscatedName("client.aq")
    public static int field490 = 0;

    @ObfuscatedName("client.ak")
    public static int field536 = 0;

    @ObfuscatedName("client.ad")
    public static class127 field492 = new class127(new byte[5000]);

    @ObfuscatedName("client.aw")
    public static int field493 = 0;

    @ObfuscatedName("client.as")
    public static int field610 = 0;

    @ObfuscatedName("client.ao")
    public static int field682 = 0;

    @ObfuscatedName("client.bk")
    public static int field497 = 0;

    @ObfuscatedName("client.bu")
    public static int field498 = 0;

    @ObfuscatedName("client.by")
    public static int field594 = 0;

    @ObfuscatedName("client.bd")
    public static int field689 = 0;

    @ObfuscatedName("client.bq")
    public static int field501 = 0;

    @ObfuscatedName("client.bo")
    public static class25[] field494 = new class25[32768];

    @ObfuscatedName("client.bc")
    public static int field551 = 0;

    @ObfuscatedName("client.bh")
    public static int[] field504 = new int[32768];

    @ObfuscatedName("client.cq")
    public static class116 field505 = new class116(5000);

    @ObfuscatedName("client.ct")
    public static class116 field506 = new class116(5000);

    @ObfuscatedName("client.cc")
    public static class116 field570 = new class116(5000);

    @ObfuscatedName("client.ca")
    public static int field508 = 0;

    @ObfuscatedName("client.cw")
    public static int field509 = 0;

    @ObfuscatedName("client.cg")
    public static int field510 = 0;

    @ObfuscatedName("client.ce")
    public static int field542 = 0;

    @ObfuscatedName("client.cu")
    public static int field512 = 0;

    @ObfuscatedName("client.cp")
    public static int field555 = 0;

    @ObfuscatedName("client.co")
    public static int field679 = 0;

    @ObfuscatedName("client.ch")
    public static int field575 = 0;

    @ObfuscatedName("client.cr")
    public static boolean field503 = false;

    @ObfuscatedName("client.cd")
    public static int field562 = 0;

    @ObfuscatedName("client.ck")
    public static int field597 = 0;

    @ObfuscatedName("client.cs")
    public static int field511 = 1;

    @ObfuscatedName("client.cf")
    public static int field521 = 0;

    @ObfuscatedName("client.cm")
    public static int field522 = 1;

    @ObfuscatedName("client.dy")
    public static int field507 = 0;

    @ObfuscatedName("client.dc")
    public static boolean field525 = false;

    @ObfuscatedName("client.dx")
    public static int[][][] field630 = new int[4][13][13];

    @ObfuscatedName("client.ds")
    public static final int[] field527 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dt")
    public static int field528 = 0;

    @ObfuscatedName("client.dd")
    public static int[][] field576 = new int[104][104];

    @ObfuscatedName("client.dk")
    public static int[][] field530 = new int[104][104];

    @ObfuscatedName("client.di")
    public static int[] field531 = new int[4000];

    @ObfuscatedName("client.dn")
    public static int[] field532 = new int[4000];

    @ObfuscatedName("client.dg")
    public static int field580 = 0;

    @ObfuscatedName("client.de")
    public static int field502 = 2;

    @ObfuscatedName("client.db")
    public static int field572 = 0;

    @ObfuscatedName("client.dz")
    public static int field554 = 2;

    @ObfuscatedName("client.dr")
    public static int field537 = 0;

    @ObfuscatedName("client.dp")
    public static int field615 = 1;

    @ObfuscatedName("client.da")
    public static int field539 = 0;

    @ObfuscatedName("client.du")
    public static int field540 = 0;

    @ObfuscatedName("client.ex")
    public static int field625 = 2;

    @ObfuscatedName("client.ec")
    public static int field595 = 0;

    @ObfuscatedName("client.eu")
    public static int field543 = 1;

    @ObfuscatedName("client.er")
    public static int field700 = 0;

    @ObfuscatedName("client.ep")
    public static int field545 = 0;

    @ObfuscatedName("client.ek")
    public static int field619 = 2301979;

    @ObfuscatedName("client.ea")
    public static int field548 = 5063219;

    @ObfuscatedName("client.eb")
    public static int field549 = 3353893;

    @ObfuscatedName("client.fj")
    public static int field550 = 7759444;

    @ObfuscatedName("client.ff")
    public static boolean field655 = false;

    @ObfuscatedName("client.fh")
    public static int field552 = 0;

    @ObfuscatedName("client.fr")
    public static int field553 = 128;

    @ObfuscatedName("client.fv")
    public static int field724 = 0;

    @ObfuscatedName("client.fi")
    public static int field473 = 0;

    @ObfuscatedName("client.fw")
    public static int field556 = 0;

    @ObfuscatedName("client.fd")
    public static int field557 = 0;

    @ObfuscatedName("client.fl")
    public static boolean field558 = false;

    @ObfuscatedName("client.fz")
    public static int field534 = 0;

    @ObfuscatedName("client.fn")
    public static int field565 = 0;

    @ObfuscatedName("client.fa")
    public static int field561 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field643 = new int[field561];

    @ObfuscatedName("client.fm")
    public static int[] field563 = new int[field561];

    @ObfuscatedName("client.fg")
    public static int[] field583 = new int[field561];

    @ObfuscatedName("client.fu")
    public static int[] field467 = new int[field561];

    @ObfuscatedName("client.fq")
    public static int[] field566 = new int[field561];

    @ObfuscatedName("client.fe")
    public static int[] field567 = new int[field561];

    @ObfuscatedName("client.fo")
    public static int[] field568 = new int[field561];

    @ObfuscatedName("client.gb")
    public static String[] field658 = new String[field561];

    @ObfuscatedName("client.gm")
    public static int[][] field579 = new int[104][104];

    @ObfuscatedName("client.gp")
    public static int field571 = 0;

    @ObfuscatedName("client.gj")
    public static int field589 = -1;

    @ObfuscatedName("client.gl")
    public static int field681 = -1;

    @ObfuscatedName("client.gk")
    public static int field574 = 0;

    @ObfuscatedName("client.gq")
    public static int field499 = 0;

    @ObfuscatedName("client.gy")
    public static int field664 = 0;

    @ObfuscatedName("client.ge")
    public static int field577 = 0;

    @ObfuscatedName("client.gx")
    public static int field578 = 0;

    @ObfuscatedName("client.gi")
    public static int field546 = 0;

    @ObfuscatedName("client.gf")
    public static int field526 = 0;

    @ObfuscatedName("client.gc")
    public static int field605 = 0;

    @ObfuscatedName("client.gw")
    public static int field541 = 0;

    @ObfuscatedName("client.gh")
    public static int field560 = 0;

    @ObfuscatedName("client.ga")
    public static boolean field611 = false;

    @ObfuscatedName("client.gs")
    public static int field585 = 0;

    @ObfuscatedName("client.gz")
    public static int field586 = 0;

    @ObfuscatedName("client.gn")
    public static class3[] field726 = new class3[2048];

    @ObfuscatedName("client.gd")
    public static int field588 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field587 = new int[2048];

    @ObfuscatedName("client.hd")
    public static int field590 = 0;

    @ObfuscatedName("client.he")
    public static int[] field591 = new int[2048];

    @ObfuscatedName("client.hy")
    public static class127[] field592 = new class127[2048];

    @ObfuscatedName("client.hx")
    public static int field593 = -1;

    @ObfuscatedName("client.hi")
    public static int field683 = 0;

    @ObfuscatedName("client.hw")
    public static int field729 = 0;

    @ObfuscatedName("client.ha")
    public static int[] field596 = new int[1000];

    @ObfuscatedName("client.hp")
    public static final int[] field559 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field466 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field599 = new boolean[8];

    @ObfuscatedName("client.ht")
    public static int[] field600 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hs")
    public static class177[][][] field687 = new class177[4][104][104];

    @ObfuscatedName("client.hg")
    public static class177 field602 = new class177();

    @ObfuscatedName("client.hf")
    public static class177 field603 = new class177();

    @ObfuscatedName("client.hu")
    public static class177 field604 = new class177();

    @ObfuscatedName("client.hz")
    public static int[] field653 = new int[25];

    @ObfuscatedName("client.hq")
    public static int[] field606 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field607 = new int[25];

    @ObfuscatedName("client.hc")
    public static int field465 = 0;

    @ObfuscatedName("client.hn")
    public static boolean field609 = false;

    @ObfuscatedName("client.ik")
    public static int field722 = 0;

    @ObfuscatedName("client.iv")
    public static int[] field547 = new int[500];

    @ObfuscatedName("client.is")
    public static int[] field612 = new int[500];

    @ObfuscatedName("client.if")
    public static int[] field613 = new int[500];

    @ObfuscatedName("client.ia")
    public static int[] field614 = new int[500];

    @ObfuscatedName("client.ie")
    public static String[] field500 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field616 = new String[500];

    @ObfuscatedName("client.iw")
    public static int field617 = -1;

    @ObfuscatedName("client.iu")
    public static int field491 = -1;

    @ObfuscatedName("client.ii")
    public static int field514 = 0;

    @ObfuscatedName("client.ih")
    public static int field598 = 50;

    @ObfuscatedName("client.id")
    public static int field621 = 0;

    @ObfuscatedName("client.it")
    public static String field666 = null;

    @ObfuscatedName("client.ib")
    public static boolean field727 = false;

    @ObfuscatedName("client.ig")
    public static int field624 = -1;

    @ObfuscatedName("client.in")
    public static String field627 = null;

    @ObfuscatedName("client.il")
    public static String field628 = null;

    @ObfuscatedName("client.jn")
    public static int field629 = -1;

    @ObfuscatedName("client.jp")
    public static class175 field582 = new class175(8);

    @ObfuscatedName("client.jq")
    public static int field631 = 0;

    @ObfuscatedName("client.js")
    public static int field669 = 0;

    @ObfuscatedName("client.jg")
    public static class158 field516 = null;

    @ObfuscatedName("client.jx")
    public static int field634 = 0;

    @ObfuscatedName("client.jj")
    public static int field635 = 0;

    @ObfuscatedName("client.jk")
    public static int field636 = 0;

    @ObfuscatedName("client.jd")
    public static boolean field637 = false;

    @ObfuscatedName("client.ji")
    public static boolean field638 = false;

    @ObfuscatedName("client.jt")
    public static boolean field633 = false;

    @ObfuscatedName("client.jw")
    public static class158 field640 = null;

    @ObfuscatedName("client.jl")
    public static class158 field641 = null;

    @ObfuscatedName("client.jf")
    public static int field642 = 0;

    @ObfuscatedName("client.jh")
    public static int field495 = 0;

    @ObfuscatedName("client.jo")
    public static class158 field728 = null;

    @ObfuscatedName("client.jy")
    public static boolean field645 = false;

    @ObfuscatedName("client.jv")
    public static int field646 = -1;

    @ObfuscatedName("client.jz")
    public static int field626 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field648 = false;

    @ObfuscatedName("client.jb")
    public static int field649 = -1;

    @ObfuscatedName("client.je")
    public static int field650 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field651 = false;

    @ObfuscatedName("client.ka")
    public static int field517 = 1;

    @ObfuscatedName("client.kb")
    public static int[] field533 = new int[32];

    @ObfuscatedName("client.kh")
    public static int field654 = 0;

    @ObfuscatedName("client.ki")
    public static int[] field519 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field656 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field657 = new int[32];

    @ObfuscatedName("client.ku")
    public static int field529 = 0;

    @ObfuscatedName("client.kp")
    public static int field659 = 0;

    @ObfuscatedName("client.kw")
    public static int field660 = 0;

    @ObfuscatedName("client.ko")
    public static int field671 = 0;

    @ObfuscatedName("client.kc")
    public static int field662 = 0;

    @ObfuscatedName("client.kn")
    public static int[] field705 = new int[2000];

    @ObfuscatedName("client.kx")
    public static String[] field535 = new String[1000];

    @ObfuscatedName("client.ky")
    public static int field665 = 0;

    @ObfuscatedName("client.kv")
    public static class177 field601 = new class177();

    @ObfuscatedName("client.kg")
    public static class177 field667 = new class177();

    @ObfuscatedName("client.kt")
    public static class177 field668 = new class177();

    @ObfuscatedName("client.km")
    public static class175 field523 = new class175(512);

    @ObfuscatedName("client.kz")
    public static int field670 = 0;

    @ObfuscatedName("client.ks")
    public static int field698 = -2;

    @ObfuscatedName("client.ke")
    public static boolean[] field672 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static boolean[] field673 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static boolean[] field581 = new boolean[100];

    @ObfuscatedName("client.ly")
    public static int[] field675 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field676 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field677 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field678 = new int[100];

    @ObfuscatedName("client.ls")
    public static int field706 = 0;

    @ObfuscatedName("client.lw")
    public static int[] field680 = new int[100];

    @ObfuscatedName("client.lp")
    public static String[] field663 = new String[100];

    @ObfuscatedName("client.lc")
    public static String[] field569 = new String[100];

    @ObfuscatedName("client.lb")
    public static String[] field608 = new String[100];

    @ObfuscatedName("client.ln")
    public static int field684 = 0;

    @ObfuscatedName("client.lt")
    public static int[] field685 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lu")
    public static int field686 = 0;

    @ObfuscatedName("client.lq")
    public static int field661 = 0;

    @ObfuscatedName("client.lk")
    public static long[] field688 = new long[100];

    @ObfuscatedName("client.lz")
    public static int field674 = 0;

    @ObfuscatedName("client.lm")
    public static int field690 = 0;

    @ObfuscatedName("client.lf")
    public static int[] field691 = new int[128];

    @ObfuscatedName("client.lv")
    public static int[] field692 = new int[128];

    @ObfuscatedName("client.lx")
    public static long field693 = -1L;

    @ObfuscatedName("client.ld")
    public static String field694 = null;

    @ObfuscatedName("client.me")
    public static String field695 = null;

    @ObfuscatedName("client.mc")
    public static int field697 = -1;

    @ObfuscatedName("client.mz")
    public static int field544 = 0;

    @ObfuscatedName("client.mv")
    public static int[] field699 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field513 = new int[1000];

    @ObfuscatedName("client.mo")
    public static class86[] field701 = new class86[1000];

    @ObfuscatedName("client.my")
    public static int field702 = 0;

    @ObfuscatedName("client.mm")
    public static int field703 = 0;

    @ObfuscatedName("client.mu")
    public static int field704 = 0;

    @ObfuscatedName("client.ma")
    public static int field618 = 255;

    @ObfuscatedName("client.mr")
    public static int field725 = -1;

    @ObfuscatedName("client.mp")
    public static boolean field707 = false;

    @ObfuscatedName("client.ms")
    public static int field708 = 127;

    @ObfuscatedName("client.mg")
    public static int field709 = 127;

    @ObfuscatedName("client.nx")
    public static int field710 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field711 = new int[50];

    @ObfuscatedName("client.ng")
    public static int[] field712 = new int[50];

    @ObfuscatedName("client.nl")
    public static int[] field713 = new int[50];

    @ObfuscatedName("client.nj")
    public static int[] field647 = new int[50];

    @ObfuscatedName("client.nz")
    public static class57[] field715 = new class57[50];

    @ObfuscatedName("client.nm")
    public static boolean field716 = false;

    @ObfuscatedName("client.no")
    public static boolean[] field718 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field564 = new int[5];

    @ObfuscatedName("client.nn")
    public static int[] field720 = new int[5];

    @ObfuscatedName("client.nv")
    public static int[] field721 = new int[5];

    @ObfuscatedName("client.ob")
    public static int[] field538 = new int[5];

    @ObfuscatedName("client.oh")
    public static int field723 = 0;

    @ObfuscatedName("client.op")
    public static int field632 = 0;

    @ObfuscatedName("client.or")
    public static class23[] field518 = new class23[400];

    @ObfuscatedName("client.od")
    public static class173 field719 = new class173();

    @ObfuscatedName("client.om")
    public static int field471 = 0;

    @ObfuscatedName("client.ol")
    public static class11[] field620 = new class11[400];

    @ObfuscatedName("client.on")
    public static class163 field644 = new class163();

    @ObfuscatedName("client.oa")
    public static int field730 = -1;

    @ObfuscatedName("client.oe")
    public static int field731 = -1;

    @ObfuscatedName("client.v(I)V")
    public final void method241() {
    }

    public final void init() {
        if (!this.method1440()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2775, class167.field2773, class167.field2780, class167.field2776, class167.field2774, class167.field2777, class167.field2778, class167.field2779, class167.field2772 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2781);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2781)) {
                    case 1:
                        Statics.field468 = class132.method150(Integer.parseInt(var5));
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                        }
                        break;
                    case 3:
                        field469 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field573 = Integer.parseInt(var5);
                        break;
                    case 5:
                        class133[] var6 = new class133[] { class133.field2063, class133.field2060, class133.field2059, class133.field2056, class133.field2057, class133.field2062 };
                        int var8 = Integer.parseInt(var5);
                        class133[] var9 = var6;
                        int var10 = 0;
                        class133 var12;
                        while (true) {
                            if (var10 >= var9.length) {
                                var12 = null;
                                break;
                            }
                            class133 var11 = var9[var10];
                            if (var8 == var11.method2328()) {
                                var12 = var11;
                                break;
                            }
                            var10++;
                        }
                        Statics.field167 = (class133) var12;
                        if (Statics.field167 == class133.field2060) {
                            Statics.field470 = class186.field2865;
                        } else {
                            Statics.field470 = class186.field2863;
                        }
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field28)) {
                            field714 = true;
                        } else {
                            field714 = false;
                        }
                    case 7:
                    default:
                        break;
                    case 8:
                        Statics.field176 = var5;
                        break;
                    case 9:
                        field639 = Integer.parseInt(var5);
                }
            }
        }
        Statics.method1544();
        Statics.field245 = this.getCodeBase().getHost();
        String var13 = Statics.field468.field2052;
        byte var14 = 0;
        try {
            class82.method2("oldschool", var13, var14, 16);
        } catch (Exception var16) {
            class80.method815((String) null, var16);
        }
        Statics.field482 = this;
        this.method1438(765, 503, 26);
    }

    @ObfuscatedName("client.i(B)V")
    public final void method337() {
        Statics.field734 = field469 == 0 ? 43594 : field639 + 40000;
        Statics.field127 = field469 == 0 ? 443 : field639 + 50000;
        Statics.field87 = Statics.field734;
        Statics.field2717 = class161.field2701;
        Statics.field2719 = class161.field2700;
        Statics.field2711 = class161.field2699;
        Statics.field2342 = class161.field2702;
        if (Statics.field2021.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1339[44] = 71;
            class75.field1339[45] = 26;
            class75.field1339[46] = 72;
            class75.field1339[47] = 73;
            class75.field1339[59] = 57;
            class75.field1339[61] = 27;
            class75.field1339[91] = 42;
            class75.field1339[92] = 74;
            class75.field1339[93] = 43;
            class75.field1339[192] = 28;
            class75.field1339[222] = 58;
            class75.field1339[520] = 59;
        } else {
            class75.field1339[186] = 57;
            class75.field1339[187] = 27;
            class75.field1339[188] = 71;
            class75.field1339[189] = 26;
            class75.field1339[190] = 72;
            class75.field1339[191] = 73;
            class75.field1339[192] = 58;
            class75.field1339[219] = 42;
            class75.field1339[220] = 74;
            class75.field1339[221] = 43;
            class75.field1339[222] = 59;
            class75.field1339[223] = 28;
        }
        class75.method2322(Statics.field2330);
        Canvas var1 = Statics.field2330;
        var1.addMouseListener(class77.field1395);
        var1.addMouseMotionListener(class77.field1395);
        var1.addFocusListener(class77.field1395);
        Statics.field1551 = class66.method873();
        if (Statics.field1551 != null) {
            Statics.field1551.method1365(Statics.field2330);
        }
        Statics.field267 = new class71(255, class82.field1430, class82.field1431, 500000);
        class29 var2 = null;
        class12 var3 = new class12();
        try {
            var2 = class82.method11("", Statics.field167.field2061, false);
            byte[] var4 = new byte[(int) var2.method548()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method546(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class12(new class127(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method544();
            }
        } catch (Exception var10) {
        }
        Statics.field2014 = var3;
        if (field469 != 0) {
            field464 = true;
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method270() {
        field476++;
        this.method248();
        while (true) {
            class177 var1 = class157.field2556;
            class156 var2;
            synchronized (class157.field2556) {
                var2 = (class156) class157.field2555.method3319();
            }
            if (var2 == null) {
                class138.method43();
                method883();
                class75 var4 = class75.field1361;
                synchronized (class75.field1361) {
                    class75.field1365++;
                    class75.field1362 = class75.field1364;
                    class75.field1353 = 0;
                    if (class75.field1357 >= 0) {
                        while (class75.field1357 != class75.field1346) {
                            int var6 = class75.field1355[class75.field1346];
                            class75.field1346 = class75.field1346 + 1 & 0x7F;
                            if (var6 < 0) {
                                class75.field1340[~var6] = false;
                            } else {
                                if (!class75.field1340[var6] && class75.field1353 < class75.field1360.length - 1) {
                                    class75.field1360[++class75.field1353 - 1] = var6;
                                }
                                class75.field1340[var6] = true;
                            }
                        }
                    } else {
                        for (int var5 = 0; var5 < 112; var5++) {
                            class75.field1340[var5] = false;
                        }
                        class75.field1357 = class75.field1346;
                    }
                    class75.field1364 = class75.field1366;
                }
                class77 var8 = class77.field1395;
                synchronized (class77.field1395) {
                    class77.field1392 = class77.field1380;
                    class77.field1384 = class77.field1381;
                    class77.field1385 = class77.field1382;
                    class77.field1390 = class77.field1378;
                    class77.field1391 = class77.field1383;
                    class77.field1398 = class77.field1386;
                    class77.field1393 = class77.field1389;
                    class77.field1378 = 0;
                }
                if (Statics.field1551 != null) {
                    int var10 = Statics.field1551.method1367();
                    field665 = var10;
                }
                if (field474 == 0) {
                    method1378();
                    class73.method3082();
                } else if (field474 == 5) {
                    class21.method86(this);
                    method1378();
                    class73.method3082();
                } else if (field474 == 10) {
                    class21.method86(this);
                } else if (field474 == 20) {
                    class21.method86(this);
                    method153();
                } else if (field474 == 25) {
                    method2657();
                }
                if (field474 == 30) {
                    method1435();
                } else if (field474 == 40) {
                    method153();
                }
                return;
            }
            var2.field2554.method3067(var2.field2550, (int) var2.field2814, var2.field2551, false);
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method246() {
        boolean var1 = class138.method116();
        if (var1 && field707 && Statics.field1221 != null) {
            Statics.field1221.method1168();
        }
        if (field1314) {
            Canvas var2 = Statics.field2330;
            var2.removeKeyListener(class75.field1361);
            var2.removeFocusListener(class75.field1361);
            class75.field1357 = -1;
            Canvas var3 = Statics.field2330;
            var3.removeMouseListener(class77.field1395);
            var3.removeMouseMotionListener(class77.field1395);
            var3.removeFocusListener(class77.field1395);
            class77.field1380 = 0;
            if (Statics.field1551 != null) {
                Statics.field1551.method1375(Statics.field2330);
            }
            this.method1439();
            class75.method2322(Statics.field2330);
            Canvas var4 = Statics.field2330;
            var4.addMouseListener(class77.field1395);
            var4.addMouseMotionListener(class77.field1395);
            var4.addFocusListener(class77.field1395);
            if (Statics.field1551 != null) {
                Statics.field1551.method1365(Statics.field2330);
            }
        }
        if (field474 == 0) {
            int var5 = class21.field307;
            String var6 = class21.field308;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field2330.getGraphics();
                if (Statics.field969 == null) {
                    Statics.field969 = new Font("Helvetica", 1, 13);
                    Statics.field965 = Statics.field2330.getFontMetrics(Statics.field969);
                }
                if (field1311) {
                    field1311 = false;
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field1196, Statics.field1215);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field2433 == null) {
                        Statics.field2433 = Statics.field2330.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field2433.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field969);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field965.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field2433, Statics.field1196 / 2 - 152, Statics.field1215 / 2 - 18, (ImageObserver) null);
                } catch (Exception var61) {
                    int var11 = Statics.field1196 / 2 - 152;
                    int var12 = Statics.field1215 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field969);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field965.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var62) {
                Statics.field2330.repaint();
            }
        } else if (field474 == 5) {
            class21.method2188(Statics.field1026, Statics.field496);
        } else if (field474 == 10) {
            class21.method2188(Statics.field1026, Statics.field496);
        } else if (field474 == 20) {
            class21.method2188(Statics.field1026, Statics.field496);
        } else if (field474 == 25) {
            if (field507 == 1) {
                if (field597 > field511) {
                    field511 = field597;
                }
                int var14 = (field511 * 50 - field597 * 50) / field511;
                method207(class134.field2266 + class2.field26 + class2.field31 + var14 + "%" + class2.field24, false);
            } else if (field507 == 2) {
                if (field521 > field522) {
                    field522 = field521;
                }
                int var15 = (field522 * 50 - field521 * 50) / field522 + 50;
                method207(class134.field2266 + class2.field26 + class2.field31 + var15 + "%" + class2.field24, false);
            } else {
                method207(class134.field2266, false);
            }
        } else if (field474 == 30) {
            if (!field609) {
                field500[0] = class134.field2187;
                field616[0] = "";
                field613[0] = 1006;
                field722 = 1;
            }
            if (field629 != -1) {
                method2888(field629);
            }
            for (int var16 = 0; var16 < field670; var16++) {
                if (field672[var16]) {
                    field673[var16] = true;
                }
                field581[var16] = field672[var16];
                field672[var16] = false;
            }
            field698 = field476;
            field617 = -1;
            field491 = -1;
            Statics.field1023 = null;
            if (field629 != -1) {
                field670 = 0;
                method159(field629, 0, 0, 765, 503, 0, 0, -1);
            }
            class89.method1815();
            boolean var17 = false;
            while (!var17) {
                var17 = true;
                for (int var18 = 0; var18 < field722 - 1; var18++) {
                    if (field613[var18] < 1000 && field613[var18 + 1] > 1000) {
                        String var19 = field616[var18];
                        field616[var18] = field616[var18 + 1];
                        field616[var18 + 1] = var19;
                        String var20 = field500[var18];
                        field500[var18] = field500[var18 + 1];
                        field500[var18 + 1] = var20;
                        int var21 = field613[var18];
                        field613[var18] = field613[var18 + 1];
                        field613[var18 + 1] = var21;
                        int var22 = field547[var18];
                        field547[var18] = field547[var18 + 1];
                        field547[var18 + 1] = var22;
                        int var23 = field612[var18];
                        field612[var18] = field612[var18 + 1];
                        field612[var18 + 1] = var23;
                        int var24 = field614[var18];
                        field614[var18] = field614[var18 + 1];
                        field614[var18 + 1] = var24;
                        var17 = false;
                    }
                }
            }
            if (field609) {
                int var25 = Statics.field239;
                int var26 = Statics.field2315;
                int var27 = Statics.field918;
                int var28 = Statics.field954;
                int var29 = 6116423;
                class89.method1819(var25, var26, var27, var28, var29);
                class89.method1819(var25 + 1, var26 + 1, var27 - 2, 16, 0);
                class89.method1775(var25 + 1, var26 + 18, var27 - 2, var28 - 19, 0);
                Statics.field1026.method3390(class134.field2193, var25 + 3, var26 + 14, var29, -1);
                int var30 = class77.field1384;
                int var31 = class77.field1385;
                for (int var32 = 0; var32 < field722; var32++) {
                    int var33 = (field722 - 1 - var32) * 15 + var26 + 31;
                    int var34 = 16777215;
                    if (var30 > var25 && var30 < var25 + var27 && var31 > var33 - 13 && var31 < var33 + 3) {
                        var34 = 16776960;
                    }
                    Statics.field1026.method3390(method26(var32), var25 + 3, var33, var34, 0);
                }
                int var35 = Statics.field239;
                int var36 = Statics.field2315;
                int var37 = Statics.field918;
                int var38 = Statics.field954;
                for (int var39 = 0; var39 < field670; var39++) {
                    if (field677[var39] + field675[var39] > var35 && field675[var39] < var35 + var37 && field678[var39] + field676[var39] > var36 && field676[var39] < var36 + var38) {
                        field673[var39] = true;
                    }
                }
            } else if (field617 != -1) {
                method120(field617, field491);
            }
            if (field706 == 3) {
                for (int var40 = 0; var40 < field670; var40++) {
                    if (field581[var40]) {
                        class89.method1824(field675[var40], field676[var40], field677[var40], field678[var40], 16711935, 128);
                    } else if (field673[var40]) {
                        class89.method1824(field675[var40], field676[var40], field677[var40], field678[var40], 16711680, 128);
                    }
                }
            }
            int var41 = Statics.field948;
            int var42 = Statics.field2706.field463;
            int var43 = Statics.field2706.field404;
            int var44 = field545;
            for (class7 var45 = (class7) class7.field100.method3321(); var45 != null; var45 = (class7) class7.field100.method3323()) {
                if (var45.field103 != -1 || var45.field97 != null) {
                    int var46 = 0;
                    if (var42 > var45.field90) {
                        var46 += var42 - var45.field90;
                    } else if (var42 < var45.field88) {
                        var46 += var45.field88 - var42;
                    }
                    if (var43 > var45.field91) {
                        var46 += var43 - var45.field91;
                    } else if (var43 < var45.field89) {
                        var46 += var45.field89 - var43;
                    }
                    if (var46 - 64 > var45.field93 || field709 == 0 || var45.field99 != var41) {
                        if (var45.field94 != null) {
                            Statics.field766.method1104(var45.field94);
                            var45.field94 = null;
                        }
                        if (var45.field101 != null) {
                            Statics.field766.method1104(var45.field101);
                            var45.field101 = null;
                        }
                    } else {
                        var46 -= 64;
                        if (var46 < 0) {
                            var46 = 0;
                        }
                        int var47 = field709 * (var45.field93 - var46) / var45.field93;
                        class57 var10000;
                        if (var45.field94 != null) {
                            var45.field94.method939(var47);
                        } else if (var45.field103 >= 0) {
                            var10000 = (class57) null;
                            class57 var48 = class57.method1266(Statics.field398, var45.field103, 0);
                            if (var48 != null) {
                                class63 var49 = var48.method1259().method1328(Statics.field376);
                                class45 var50 = class45.method1077(var49, 100, var47);
                                var50.method938(-1);
                                Statics.field766.method1103(var50);
                                var45.field94 = var50;
                            }
                        }
                        if (var45.field101 != null) {
                            var45.field101.method939(var47);
                            if (!var45.field101.method3347()) {
                                var45.field101 = null;
                            }
                        } else if (var45.field97 != null && (var45.field98 -= var44) <= 0) {
                            int var51 = (int) (Math.random() * (double) var45.field97.length);
                            var10000 = (class57) null;
                            class57 var52 = class57.method1266(Statics.field398, var45.field97[var51], 0);
                            if (var52 != null) {
                                class63 var53 = var52.method1259().method1328(Statics.field376);
                                class45 var54 = class45.method1077(var53, 100, var47);
                                var54.method938(0);
                                Statics.field766.method1103(var54);
                                var45.field101 = var54;
                                var45.field98 = var45.field86 + (int) (Math.random() * (double) (var45.field95 - var45.field86));
                            }
                        }
                    }
                }
            }
            field545 = 0;
        } else if (field474 == 40) {
            method207(class134.field2204 + class2.field26 + class134.field2076, false);
        }
        if (field474 == 30 && field706 == 0 && !field1311) {
            try {
                Graphics var55 = Statics.field2330.getGraphics();
                for (int var56 = 0; var56 < field670; var56++) {
                    if (field673[var56]) {
                        Statics.field2704.method1609(var55, field675[var56], field676[var56], field677[var56], field678[var56]);
                        field673[var56] = false;
                    }
                }
            } catch (Exception var64) {
                Statics.field2330.repaint();
            }
        } else if (field474 > 0) {
            try {
                Graphics var58 = Statics.field2330.getGraphics();
                Statics.field2704.method1587(var58, 0, 0);
                field1311 = false;
                for (int var59 = 0; var59 < field670; var59++) {
                    field673[var59] = false;
                }
            } catch (Exception var63) {
                Statics.field2330.repaint();
            }
        }
    }

    @ObfuscatedName("client.d(I)V")
    public final void method247() {
        if (Statics.field2861 != null) {
            Statics.field2861.field233 = false;
        }
        Statics.field2861 = null;
        if (Statics.field9 != null) {
            Statics.field9.method1410();
            Statics.field9 = null;
        }
        if (class75.field1361 != null) {
            class75 var1 = class75.field1361;
            synchronized (class75.field1361) {
                class75.field1361 = null;
            }
        }
        class77.method130();
        Statics.field1551 = null;
        if (Statics.field1221 != null) {
            Statics.field1221.method1163();
        }
        if (Statics.field1374 != null) {
            Statics.field1374.method1163();
        }
        if (Statics.field2523 != null) {
            Statics.field2523.method1410();
        }
        Object var3 = class157.field2558;
        synchronized (class157.field2558) {
            if (class157.field2557 != 0) {
                class157.field2557 = 1;
                try {
                    class157.field2558.wait();
                } catch (InterruptedException var6) {
                }
            }
        }
        Statics.method1836();
    }

    @ObfuscatedName("az.t(IB)V")
    public static void method541(int arg0) {
        if (field474 == arg0) {
            return;
        }
        if (field474 == 0) {
            Statics.field2433 = null;
            Statics.field969 = null;
            Statics.field965 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field498 = 0;
            field594 = 0;
            field689 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field10 != null) {
            Statics.field10.method1410();
            Statics.field10 = null;
        }
        if (field474 == 25) {
            field507 = 0;
            field597 = 0;
            field511 = 1;
            field521 = 0;
            field522 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field2330;
            class154 var2 = Statics.field2437;
            class154 var3 = Statics.field1022;
            if (!Statics.field319) {
                class89.method1778();
                byte[] var4 = var2.method2985("title.jpg", "");
                Statics.field297 = new class86(var4, var1);
                Statics.field2818 = Statics.field297.method1651();
                int var5 = var3.method3015("logo");
                int var6 = var3.method2984(var5, "");
                class87 var7 = Statics.method235(var3, var5, var6);
                Statics.field1171 = var7;
                int var8 = var3.method3015("titlebox");
                int var9 = var3.method2984(var8, "");
                class87 var10 = Statics.method235(var3, var8, var9);
                Statics.field293 = var10;
                int var11 = var3.method3015("titlebutton");
                int var12 = var3.method2984(var11, "");
                class87 var13 = Statics.method235(var3, var11, var12);
                Statics.field295 = var13;
                Statics.field316 = Statics.method186(var3, "runes", "");
                Statics.field304 = Statics.method186(var3, "title_mute", "");
                Statics.field255 = new int[256];
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field255[var14] = var14 * 262144;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field255[var15 + 64] = var15 * 1024 + 16711680;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field255[var16 + 128] = var16 * 4 + 16776960;
                }
                for (int var17 = 0; var17 < 64; var17++) {
                    Statics.field255[var17 + 192] = 16777215;
                }
                Statics.field248 = new int[256];
                for (int var18 = 0; var18 < 64; var18++) {
                    Statics.field248[var18] = var18 * 1024;
                }
                for (int var19 = 0; var19 < 64; var19++) {
                    Statics.field248[var19 + 64] = var19 * 4 + 65280;
                }
                for (int var20 = 0; var20 < 64; var20++) {
                    Statics.field248[var20 + 128] = var20 * 262144 + 65535;
                }
                for (int var21 = 0; var21 < 64; var21++) {
                    Statics.field248[var21 + 192] = 16777215;
                }
                Statics.field1662 = new int[256];
                for (int var22 = 0; var22 < 64; var22++) {
                    Statics.field1662[var22] = var22 * 4;
                }
                for (int var23 = 0; var23 < 64; var23++) {
                    Statics.field1662[var23 + 64] = var23 * 262144 + 255;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    Statics.field1662[var24 + 128] = var24 * 1024 + 16711935;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    Statics.field1662[var25 + 192] = 16777215;
                }
                Statics.field168 = new int[256];
                Statics.field2313 = new int[32768];
                Statics.field60 = new int[32768];
                class21.method812((class87) null);
                Statics.field2055 = new int[32768];
                Statics.field109 = new int[32768];
                class21.field309 = 0;
                class21.field298 = "";
                class21.field294 = "";
                class21.field317 = false;
                if (Statics.field2014.field177) {
                    class138.method1286(2);
                } else {
                    class154 var26 = Statics.field652;
                    int var27 = var26.method3015("scape main");
                    int var28 = var26.method2984(var27, "");
                    class138.field2324 = 1;
                    Statics.field2320 = var26;
                    Statics.field2301 = var27;
                    Statics.field2316 = var28;
                    Statics.field1293 = 255;
                    Statics.field1454 = false;
                    Statics.field1417 = 2;
                }
                if (Statics.field2523 != null) {
                    try {
                        class127 var29 = new class127(4);
                        var29.method2498(3);
                        var29.method2402(0);
                        Statics.field2523.method1395(var29.field2028, 0, 4);
                    } catch (IOException var38) {
                        try {
                            Statics.field2523.method1410();
                        } catch (Exception var37) {
                        }
                        class153.field2514++;
                        Statics.field2523 = null;
                    }
                }
                Statics.field319 = true;
                Statics.field297.method1677(0, 0);
                Statics.field2818.method1677(382, 0);
                Statics.field1171.method1755(382 - Statics.field1171.field1483 / 2, 18);
            }
        } else if (Statics.field319) {
            Statics.field293 = null;
            Statics.field295 = null;
            Statics.field316 = null;
            Statics.field297 = null;
            Statics.field2818 = null;
            Statics.field1171 = null;
            Statics.field304 = null;
            Statics.field957 = null;
            Statics.field318 = null;
            Statics.field939 = null;
            Statics.field1334 = null;
            Statics.field237 = null;
            Statics.field255 = null;
            Statics.field248 = null;
            Statics.field1662 = null;
            Statics.field168 = null;
            Statics.field2313 = null;
            Statics.field60 = null;
            Statics.field2055 = null;
            Statics.field109 = null;
            class138.method1286(2);
            if (Statics.field2523 != null) {
                try {
                    class127 var32 = new class127(4);
                    var32.method2498(2);
                    var32.method2402(0);
                    Statics.field2523.method1395(var32.field2028, 0, 4);
                } catch (IOException var36) {
                    try {
                        Statics.field2523.method1410();
                    } catch (Exception var35) {
                    }
                    class153.field2514++;
                    Statics.field2523 = null;
                }
            }
            Statics.field319 = false;
        }
        field474 = arg0;
    }

    @ObfuscatedName("client.f(B)V")
    public void method248() {
        if (field474 != 1000) {
            boolean var1 = class153.method2289();
            if (!var1) {
                this.method249();
            }
        }
    }

    @ObfuscatedName("client.b(I)V")
    public void method249() {
        if (class153.field2528 >= 4) {
            this.method1452("js5crc");
            field474 = 1000;
            return;
        }
        if (class153.field2514 >= 4) {
            if (field474 <= 5) {
                this.method1452("js5io");
                field474 = 1000;
                return;
            }
            field682 = 3000;
            class153.field2514 = 3;
        }
        if (--field682 + 1 > 0) {
            return;
        }
        try {
            if (field610 == 0) {
                Statics.field1525 = Statics.field1457.method1497(Statics.field245, Statics.field87);
                field610++;
            }
            if (field610 == 1) {
                if (Statics.field1525.field1401 == 2) {
                    this.method250(-1);
                    return;
                }
                if (Statics.field1525.field1401 == 1) {
                    field610++;
                }
            }
            if (field610 == 2) {
                Statics.field1524 = new class70((Socket) Statics.field1525.field1408, Statics.field1457);
                class127 var1 = new class127(5);
                var1.method2498(15);
                var1.method2448(26);
                Statics.field1524.method1395(var1.field2028, 0, 5);
                field610++;
                Statics.field1786 = class121.method131();
            }
            if (field610 == 3) {
                if (field474 <= 5 || Statics.field1524.method1388() > 0) {
                    int var2 = Statics.field1524.method1408();
                    if (var2 != 0) {
                        this.method250(var2);
                        return;
                    }
                    field610++;
                } else if (class121.method131() - Statics.field1786 > 30000L) {
                    this.method250(-2);
                    return;
                }
            }
            if (field610 == 4) {
                class70 var3 = Statics.field1524;
                boolean var4 = field474 > 20;
                if (Statics.field2523 != null) {
                    try {
                        Statics.field2523.method1410();
                    } catch (Exception var19) {
                    }
                    Statics.field2523 = null;
                }
                Statics.field2523 = var3;
                if (Statics.field2523 != null) {
                    try {
                        class127 var6 = new class127(4);
                        var6.method2498(var4 ? 2 : 3);
                        var6.method2402(0);
                        Statics.field2523.method1395(var6.field2028, 0, 4);
                    } catch (IOException var18) {
                        try {
                            Statics.field2523.method1410();
                        } catch (Exception var17) {
                        }
                        class153.field2514++;
                        Statics.field2523 = null;
                    }
                }
                class153.field2522.field2023 = 0;
                Statics.field371 = null;
                Statics.field1808 = null;
                class153.field2526 = 0;
                while (true) {
                    class155 var9 = (class155) class153.field2515.method3312();
                    if (var9 == null) {
                        while (true) {
                            class155 var10 = (class155) class153.field2517.method3312();
                            if (var10 == null) {
                                if (class153.field2527 != 0) {
                                    try {
                                        class127 var11 = new class127(4);
                                        var11.method2498(4);
                                        var11.method2498(class153.field2527);
                                        var11.method2401(0);
                                        Statics.field2523.method1395(var11.field2028, 0, 4);
                                    } catch (IOException var16) {
                                        try {
                                            Statics.field2523.method1410();
                                        } catch (Exception var15) {
                                        }
                                        class153.field2514++;
                                        Statics.field2523 = null;
                                    }
                                }
                                class153.field2512 = 0;
                                Statics.field2441 = class121.method131();
                                Statics.field1525 = null;
                                Statics.field1524 = null;
                                field610 = 0;
                                field497 = 0;
                                return;
                            }
                            class153.field2520.method3257(var10);
                            class153.field2518.method3303(var10, var10.field2814);
                            class153.field2519++;
                            class153.field2521--;
                        }
                    }
                    class153.field2513.method3303(var9, var9.field2814);
                    class153.field2511++;
                    class153.field2516--;
                }
            }
        } catch (IOException var20) {
            this.method250(-3);
        }
    }

    @ObfuscatedName("client.z(II)V")
    public void method250(int arg0) {
        Statics.field1525 = null;
        Statics.field1524 = null;
        field610 = 0;
        if (Statics.field87 == Statics.field734) {
            Statics.field87 = Statics.field127;
        } else {
            Statics.field87 = Statics.field734;
        }
        field497++;
        if (field497 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field474 <= 5) {
                this.method1452("js5connect_full");
                field474 = 1000;
            } else {
                field682 = 3000;
            }
        } else if (field497 >= 2 && arg0 == 6) {
            this.method1452("js5connect_outofdate");
            field474 = 1000;
        } else if (field497 >= 4) {
            if (field474 <= 5) {
                this.method1452("js5connect");
                field474 = 1000;
            } else {
                field682 = 3000;
            }
        }
    }

    @ObfuscatedName("bf.l(I)V")
    public static void method1378() {
        if (field493 == 0) {
            Statics.field1510 = new class95(4, 104, 104, class9.field126);
            for (int var0 = 0; var0 < 4; var0++) {
                field524[var0] = new class164(104, 104);
            }
            Statics.field230 = new class86(512, 512);
            class21.field308 = class134.field2077;
            class21.field307 = 5;
            field493 = 20;
        } else if (field493 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1778[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1876(var1, 500, 800, 512, 334);
            class21.field308 = class134.field2078;
            class21.field307 = 10;
            field493 = 30;
        } else if (field493 == 30) {
            Statics.field170 = method3234(0, false, true, true);
            Statics.field2003 = method3234(1, false, true, true);
            Statics.field1438 = method3234(2, true, false, true);
            Statics.field1094 = method3234(3, false, true, true);
            Statics.field398 = method3234(4, false, true, true);
            Statics.field190 = method3234(5, true, true, true);
            Statics.field652 = method3234(6, true, true, false);
            Statics.field1843 = method3234(7, false, true, true);
            Statics.field1022 = method3234(8, false, true, true);
            Statics.field2823 = method3234(9, false, true, true);
            Statics.field2437 = method3234(10, false, true, true);
            Statics.field1265 = method3234(11, false, true, true);
            Statics.field343 = method3234(12, false, true, true);
            Statics.field162 = method3234(13, true, false, true);
            Statics.field92 = method3234(14, false, true, false);
            Statics.field199 = method3234(15, false, true, true);
            class21.field308 = class134.field2079;
            class21.field307 = 20;
            field493 = 40;
        } else if (field493 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field170.method3069() * 4 / 100;
            int var8 = var7 + Statics.field2003.method3069() * 4 / 100;
            int var9 = var8 + Statics.field1438.method3069() * 2 / 100;
            int var10 = var9 + Statics.field1094.method3069() * 2 / 100;
            int var11 = var10 + Statics.field398.method3069() * 6 / 100;
            int var12 = var11 + Statics.field190.method3069() * 4 / 100;
            int var13 = var12 + Statics.field652.method3069() * 2 / 100;
            int var14 = var13 + Statics.field1843.method3069() * 60 / 100;
            int var15 = var14 + Statics.field1022.method3069() * 2 / 100;
            int var16 = var15 + Statics.field2823.method3069() * 2 / 100;
            int var17 = var16 + Statics.field2437.method3069() * 2 / 100;
            int var18 = var17 + Statics.field1265.method3069() * 2 / 100;
            int var19 = var18 + Statics.field343.method3069() * 2 / 100;
            int var20 = var19 + Statics.field162.method3069() * 2 / 100;
            int var21 = var20 + Statics.field92.method3069() * 2 / 100;
            int var22 = var21 + Statics.field199.method3069() * 2 / 100;
            if (var22 == 100) {
                class21.field308 = class134.field2081;
                class21.field307 = 30;
                field493 = 45;
            } else {
                if (var22 != 0) {
                    class21.field308 = class134.field2139 + var22 + "%";
                }
                class21.field307 = 30;
            }
        } else if (field493 == 45) {
            boolean var23 = !field472;
            Statics.field1096 = 22050;
            Statics.field1085 = var23;
            Statics.field1195 = 2;
            class141 var24 = new class141();
            var24.method2709(9, 128);
            Statics.field1221 = class52.method1382(Statics.field1457, Statics.field2330, 0, 22050);
            Statics.field1221.method1159(var24);
            Statics.method3083(Statics.field199, Statics.field92, Statics.field398, var24);
            Statics.field1374 = class52.method1382(Statics.field1457, Statics.field2330, 1, 2048);
            Statics.field766 = new class46();
            Statics.field1374.method1159(Statics.field766);
            Statics.field376 = new class62(22050, Statics.field1096);
            class21.field308 = class134.field2082;
            class21.field307 = 35;
            field493 = 50;
        } else if (field493 == 50) {
            int var25 = 0;
            if (Statics.field496 == null) {
                class154 var26 = Statics.field1022;
                class154 var27 = Statics.field162;
                int var28 = var26.method3015("p11_full");
                int var29 = var26.method2984(var28, "");
                class183 var30 = class84.method56(var26, var27, var28, var29);
                Statics.field496 = var30;
            } else {
                var25++;
            }
            if (Statics.field2345 == null) {
                class154 var31 = Statics.field1022;
                class154 var32 = Statics.field162;
                int var33 = var31.method3015("p12_full");
                int var34 = var31.method2984(var33, "");
                class183 var35 = class84.method56(var31, var32, var33, var34);
                Statics.field2345 = var35;
            } else {
                var25++;
            }
            if (Statics.field1026 == null) {
                class154 var36 = Statics.field1022;
                class154 var37 = Statics.field162;
                int var38 = var36.method3015("b12_full");
                int var39 = var36.method2984(var38, "");
                class183 var40 = class84.method56(var36, var37, var38, var39);
                Statics.field1026 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class21.field308 = class134.field2083 + var25 * 100 / 3 + "%";
                class21.field307 = 40;
            } else {
                Statics.field732 = new class151(true);
                class21.field308 = class134.field2084;
                class21.field307 = 40;
                field493 = 60;
            }
        } else if (field493 == 60) {
            class154 var41 = Statics.field2437;
            class154 var42 = Statics.field1022;
            int var43 = 0;
            if (var41.method2986("title.jpg", "")) {
                var43++;
            }
            if (var42.method2986("logo", "")) {
                var43++;
            }
            if (var42.method2986("titlebox", "")) {
                var43++;
            }
            if (var42.method2986("titlebutton", "")) {
                var43++;
            }
            if (var42.method2986("runes", "")) {
                var43++;
            }
            if (var42.method2986("title_mute", "")) {
                var43++;
            }
            var42.method2986("sl_back", "");
            var42.method2986("sl_flags", "");
            var42.method2986("sl_arrows", "");
            var42.method2986("sl_stars", "");
            var42.method2986("sl_button", "");
            byte var46 = 6;
            if (var43 < var46) {
                class21.field308 = class134.field2085 + var43 * 100 / var46 + "%";
                class21.field307 = 50;
            } else {
                class21.field308 = class134.field2086;
                class21.field307 = 50;
                method541(5);
                field493 = 70;
            }
        } else if (field493 == 70) {
            if (Statics.field1438.method2999()) {
                class154 var48 = Statics.field1438;
                Statics.field934 = var48;
                class154 var49 = Statics.field1438;
                Statics.field858 = var49;
                class154 var50 = Statics.field1438;
                class154 var51 = Statics.field1843;
                Statics.field907 = var50;
                Statics.field905 = var51;
                Statics.field919 = Statics.field907.method2975(3);
                class32.method2658(Statics.field1438, Statics.field1843, field472);
                class154 var52 = Statics.field1438;
                class154 var53 = Statics.field1843;
                Statics.field2016 = var52;
                Statics.field798 = var53;
                class154 var54 = Statics.field1438;
                class154 var55 = Statics.field1843;
                boolean var56 = field714;
                class183 var57 = Statics.field496;
                Statics.field1015 = var54;
                Statics.field977 = var55;
                Statics.field978 = var56;
                Statics.field1015.method2975(10);
                Statics.field733 = var57;
                class34.method2654(Statics.field1438, Statics.field170, Statics.field2003);
                class35.method889(Statics.field1438, Statics.field1843);
                class154 var58 = Statics.field1438;
                Statics.field950 = var58;
                class154 var59 = Statics.field1438;
                Statics.field1035 = var59;
                Statics.field1032 = Statics.field1035.method2975(16);
                class154 var60 = Statics.field1094;
                class154 var61 = Statics.field1843;
                class154 var62 = Statics.field1022;
                class154 var63 = Statics.field162;
                Statics.field1268 = var60;
                Statics.field2564 = var61;
                Statics.field2665 = var62;
                Statics.field2566 = var63;
                Statics.field2588 = new class158[Statics.field1268.method2979()][];
                Statics.field2563 = new boolean[Statics.field1268.method2979()];
                class41.method1326(Statics.field1438);
                class154 var64 = Statics.field1438;
                Statics.field956 = var64;
                class21.field308 = class134.field2088;
                class21.field307 = 60;
                field493 = 80;
            } else {
                class21.field308 = class134.field2211 + Statics.field1438.method3062() + "%";
                class21.field307 = 60;
            }
        } else if (field493 == 80) {
            int var65 = 0;
            if (Statics.field1512 == null) {
                class154 var66 = Statics.field1022;
                int var67 = var66.method3015("compass");
                int var68 = var66.method2984(var67, "");
                class86 var69 = class84.method47(var66, var67, var68);
                Statics.field1512 = var69;
            } else {
                var65++;
            }
            if (Statics.field2338 == null) {
                Statics.field2338 = class84.method2192(Statics.field1022, "mapedge", "");
            } else {
                var65++;
            }
            if (Statics.field96 == null) {
                Statics.field96 = Statics.method186(Statics.field1022, "mapscene", "");
            } else {
                var65++;
            }
            if (Statics.field1319 == null) {
                Statics.field1319 = Statics.method2184(Statics.field1022, "mapfunction", "");
            } else {
                var65++;
            }
            if (Statics.field1172 == null) {
                Statics.field1172 = Statics.method2184(Statics.field1022, "hitmarks", "");
            } else {
                var65++;
            }
            if (Statics.field1753 == null) {
                Statics.field1753 = Statics.method2184(Statics.field1022, "headicons_pk", "");
            } else {
                var65++;
            }
            if (Statics.field1548 == null) {
                Statics.field1548 = Statics.method2184(Statics.field1022, "headicons_prayer", "");
            } else {
                var65++;
            }
            if (Statics.field1463 == null) {
                Statics.field1463 = Statics.method2184(Statics.field1022, "headicons_hint", "");
            } else {
                var65++;
            }
            if (Statics.field111 == null) {
                Statics.field111 = Statics.method2184(Statics.field1022, "mapmarker", "");
            } else {
                var65++;
            }
            if (Statics.field584 == null) {
                Statics.field584 = Statics.method2184(Statics.field1022, "cross", "");
            } else {
                var65++;
            }
            if (Statics.field324 == null) {
                Statics.field324 = Statics.method2184(Statics.field1022, "mapdots", "");
            } else {
                var65++;
            }
            if (Statics.field1289 == null) {
                Statics.field1289 = Statics.method186(Statics.field1022, "scrollbar", "");
            } else {
                var65++;
            }
            if (Statics.field1751 == null) {
                Statics.field1751 = Statics.method186(Statics.field1022, "mod_icons", "");
            } else {
                var65++;
            }
            if (Statics.field460 == null) {
                class154 var70 = Statics.field1022;
                int var71 = var70.method3015("mapback");
                int var72 = var70.method2984(var71, "");
                class87 var73 = Statics.method235(var70, var71, var72);
                Statics.field460 = var73;
            } else {
                var65++;
            }
            if (var65 < 14) {
                class21.field308 = class134.field2090 + var65 * 100 / 14 + "%";
                class21.field307 = 70;
            } else {
                Statics.field2843 = Statics.field1751;
                Statics.field2338.method1674();
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 21.0D) - 10;
                int var77 = (int) (Math.random() * 41.0D) - 20;
                for (int var78 = 0; var78 < Statics.field1319.length; var78++) {
                    Statics.field1319[var78].method1652(var74 + var77, var75 + var77, var76 + var77);
                }
                Statics.field96[0].method1751(var74 + var77, var75 + var77, var76 + var77);
                method135();
                class21.field308 = class134.field2276;
                class21.field307 = 70;
                field493 = 90;
            }
        } else if (field493 == 90) {
            if (Statics.field2823.method2999()) {
                class110 var79 = new class110(Statics.field2823, Statics.field1022, 20, 0.8D, field472 ? 64 : 128);
                class104.method2100(var79);
                class104.method2118(0.8D);
                class21.field308 = class134.field2092;
                class21.field307 = 90;
                field493 = 110;
            } else {
                class21.field308 = class134.field2091 + Statics.field2823.method3062() + "%";
                class21.field307 = 90;
            }
        } else if (field493 == 110) {
            Statics.field2861 = new class16();
            Statics.field1457.method1498(Statics.field2861, 10);
            class21.field308 = class134.field2093;
            class21.field307 = 94;
            field493 = 120;
        } else if (field493 == 120) {
            if (Statics.field2437.method2986("huffman", "")) {
                class120 var80 = new class120(Statics.field2437.method2985("huffman", ""));
                class184.method2938(var80);
                class21.field308 = class134.field2095;
                class21.field307 = 96;
                field493 = 130;
            } else {
                class21.field308 = class134.field2094 + "%";
                class21.field307 = 96;
            }
        } else if (field493 == 130) {
            if (!Statics.field1094.method2999()) {
                class21.field308 = class134.field2096 + Statics.field1094.method3062() * 4 / 5 + "%";
                class21.field307 = 100;
            } else if (!Statics.field343.method2999()) {
                class21.field308 = class134.field2096 + (80 + Statics.field343.method3062() / 6) + "%";
                class21.field307 = 100;
            } else if (Statics.field162.method2999()) {
                class21.field308 = class134.field2272;
                class21.field307 = 100;
                field493 = 140;
            } else {
                class21.field308 = class134.field2096 + (96 + Statics.field162.method3062() / 20) + "%";
                class21.field307 = 100;
            }
        } else if (field493 == 140) {
            method541(10);
        }
    }

    @ObfuscatedName("fv.e(IZZZI)Lek;")
    public static class154 method3234(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1430 != null) {
            var4 = new class71(arg0, class82.field1430, Statics.field1432[arg0], 1000000);
        }
        return new class154(var4, Statics.field267, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("o.p(I)V")
    public static void method135() {
        Statics.field1727 = new int[33];
        Statics.field2340 = new int[33];
        Statics.field73 = new int[151];
        Statics.field290 = new int[151];
        for (int var0 = 0; var0 < 33; var0++) {
            int var1 = 999;
            int var2 = 0;
            for (int var3 = 0; var3 < 34; var3++) {
                if (Statics.field460.field1482[Statics.field460.field1483 * var0 + var3] == 0) {
                    if (var1 == 999) {
                        var1 = var3;
                    }
                } else if (var1 != 999) {
                    var2 = var3;
                    break;
                }
            }
            Statics.field1727[var0] = var1;
            Statics.field2340[var0] = var2 - var1;
        }
        for (int var4 = 5; var4 < 156; var4++) {
            int var5 = 999;
            int var6 = 0;
            for (int var7 = 25; var7 < 172; var7++) {
                if (Statics.field460.field1482[Statics.field460.field1483 * var4 + var7] == 0 && (var7 > 34 || var4 > 34)) {
                    if (var5 == 999) {
                        var5 = var7;
                    }
                } else if (var5 != 999) {
                    var6 = var7;
                    break;
                }
            }
            Statics.field73[var4 - 5] = var5 - 25;
            Statics.field290[var4 - 5] = var6 - var5;
        }
    }

    @ObfuscatedName("x.o(I)V")
    public static final void method153() {
        try {
            if (field498 == 0) {
                if (Statics.field9 != null) {
                    Statics.field9.method1410();
                    Statics.field9 = null;
                }
                Statics.field344 = null;
                field503 = false;
                field594 = 0;
                field498 = 1;
            }
            if (field498 == 1) {
                if (Statics.field344 == null) {
                    Statics.field344 = Statics.field1457.method1497(Statics.field245, Statics.field87);
                }
                if (Statics.field344.field1401 == 2) {
                    throw new IOException();
                }
                if (Statics.field344.field1401 == 1) {
                    Statics.field9 = new class70((Socket) Statics.field344.field1408, Statics.field1457);
                    Statics.field344 = null;
                    field498 = 2;
                }
            }
            if (field498 == 2) {
                field505.field2023 = 0;
                field505.method2498(14);
                Statics.field9.method1395(field505.field2028, 0, 1);
                field570.field2023 = 0;
                field498 = 3;
            }
            if (field498 == 3) {
                if (Statics.field1221 != null) {
                    Statics.field1221.method1161();
                }
                if (Statics.field1374 != null) {
                    Statics.field1374.method1161();
                }
                int var0 = Statics.field9.method1408();
                if (Statics.field1221 != null) {
                    Statics.field1221.method1161();
                }
                if (Statics.field1374 != null) {
                    Statics.field1374.method1161();
                }
                if (var0 != 0) {
                    method1244(var0);
                    return;
                }
                field570.field2023 = 0;
                field498 = 5;
            }
            if (field498 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field505.field2023 = 0;
                field505.method2498(10);
                field505.method2448(var1[0]);
                field505.method2448(var1[1]);
                field505.method2448(var1[2]);
                field505.method2448(var1[3]);
                field505.method2484(0L);
                field505.method2465(class21.field294);
                field505.method2432(class6.field82, class6.field84);
                field506.field2023 = 0;
                if (field474 == 40) {
                    field506.method2498(18);
                } else {
                    field506.method2498(16);
                }
                field506.method2401(0);
                int var2 = field506.field2023;
                field506.method2448(26);
                field506.method2408(field505.field2028, 0, field505.field2023);
                int var3 = field506.field2023;
                field506.method2465(class21.field298);
                field506.method2498(field472 ? 1 : 0);
                class82.method2652(field506);
                class127 var4 = new class127(Statics.field732.method2958());
                Statics.field732.method2957(var4);
                field506.method2408(var4.field2028, 0, var4.field2028.length);
                field506.method2448(Statics.field170.field2509);
                field506.method2448(Statics.field2003.field2509);
                field506.method2448(Statics.field1438.field2509);
                field506.method2448(Statics.field1094.field2509);
                field506.method2448(Statics.field398.field2509);
                field506.method2448(Statics.field190.field2509);
                field506.method2448(Statics.field652.field2509);
                field506.method2448(Statics.field1843.field2509);
                field506.method2448(Statics.field1022.field2509);
                field506.method2448(Statics.field2823.field2509);
                field506.method2448(Statics.field2437.field2509);
                field506.method2448(Statics.field1265.field2509);
                field506.method2448(Statics.field343.field2509);
                field506.method2448(Statics.field162.field2509);
                field506.method2448(Statics.field92.field2509);
                field506.method2448(Statics.field199.field2509);
                field506.method2539(var1, var3, field506.field2023);
                field506.method2410(field506.field2023 - var2);
                Statics.field9.method1395(field506.field2028, 0, field506.field2023);
                field505.method2292(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field570.method2292(var1);
                field498 = 6;
            }
            if (field498 == 6 && Statics.field9.method1388() > 0) {
                int var6 = Statics.field9.method1408();
                if (var6 == 21 && field474 == 20) {
                    field498 = 7;
                } else if (var6 == 2) {
                    field498 = 9;
                } else if (var6 == 15 && field474 == 40) {
                    field505.field2023 = 0;
                    field570.field2023 = 0;
                    field509 = -1;
                    field555 = -1;
                    field679 = -1;
                    field575 = -1;
                    field508 = 0;
                    field510 = 0;
                    field483 = 0;
                    field722 = 0;
                    field609 = false;
                    field704 = 0;
                    field702 = 0;
                    for (int var7 = 0; var7 < field726.length; var7++) {
                        if (field726[var7] != null) {
                            field726[var7].field426 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field494.length; var8++) {
                        if (field494[var8] != null) {
                            field494[var8].field426 = -1;
                        }
                    }
                    class19.method3149();
                    method541(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field672[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field689 < 1) {
                    field689++;
                    field498 = 0;
                } else {
                    method1244(var6);
                    return;
                }
            }
            if (field498 == 7 && Statics.field9.method1388() > 0) {
                field501 = (Statics.field9.method1408() + 3) * 60;
                field498 = 8;
            }
            if (field498 == 8) {
                field594 = 0;
                class21.method129(class134.field2098, class134.field2099, field501 / 60 + class134.field2100);
                if (--field501 <= 0) {
                    field498 = 0;
                }
            } else {
                if (field498 == 9 && Statics.field9.method1388() >= 8) {
                    field636 = Statics.field9.method1408();
                    field637 = Statics.field9.method1408() == 1;
                    field593 = Statics.field9.method1408();
                    field593 <<= 0x8;
                    field593 += Statics.field9.method1408();
                    field683 = Statics.field9.method1408();
                    Statics.field9.method1389(field570.field2028, 0, 1);
                    field570.field2023 = 0;
                    field509 = field570.method2294();
                    Statics.field9.method1389(field570.field2028, 0, 2);
                    field570.field2023 = 0;
                    field508 = field570.method2416();
                    if (field683 == 1) {
                        try {
                            client var10 = Statics.field482;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var16) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field482;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var15) {
                        }
                    }
                    field498 = 10;
                }
                if (field498 != 10) {
                    field594++;
                    if (field594 > 2000) {
                        if (field689 < 1) {
                            if (Statics.field87 == Statics.field734) {
                                Statics.field87 = Statics.field127;
                            } else {
                                Statics.field87 = Statics.field734;
                            }
                            field689++;
                            field498 = 0;
                        } else {
                            method1244(-3);
                        }
                    }
                } else if (Statics.field9.method1388() >= field508) {
                    field570.field2023 = 0;
                    Statics.field9.method1389(field570.field2028, 0, field508);
                    method2662();
                    Statics.field227 = -1;
                    method874(false);
                    field509 = -1;
                }
            }
        } catch (IOException var17) {
            if (field689 < 1) {
                if (Statics.field87 == Statics.field734) {
                    Statics.field87 = Statics.field127;
                } else {
                    Statics.field87 = Statics.field734;
                }
                field689++;
                field498 = 0;
            } else {
                method1244(-2);
            }
        }
    }

    @ObfuscatedName("ef.h(B)V")
    public static void method2662() {
        field477 = 1L;
        field480 = -1;
        Statics.field2861.field232 = 0;
        Statics.field76 = true;
        field481 = true;
        field693 = -1L;
        class182.method1384();
        field505.field2023 = 0;
        field570.field2023 = 0;
        field509 = -1;
        field555 = -1;
        field679 = -1;
        field575 = -1;
        field510 = 0;
        field483 = 0;
        field512 = 0;
        field484 = 0;
        field722 = 0;
        field609 = false;
        class77.field1396 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field608[var0] = null;
        }
        field684 = 0;
        field621 = 0;
        field727 = false;
        field710 = 0;
        field580 = (int) (Math.random() * 100.0D) - 50;
        field572 = (int) (Math.random() * 110.0D) - 55;
        field537 = (int) (Math.random() * 80.0D) - 40;
        field540 = (int) (Math.random() * 120.0D) - 60;
        field595 = (int) (Math.random() * 30.0D) - 20;
        field724 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field704 = 0;
        field697 = -1;
        field702 = 0;
        field703 = 0;
        field588 = 0;
        field551 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field726[var1] = null;
            field592[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field494[var2] = null;
        }
        Statics.field2706 = field726[2047] = new class3();
        field603.method3315();
        field604.method3315();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field687[var3][var4][var5] = null;
                }
            }
        }
        field602 = new class177();
        field632 = 0;
        field723 = 0;
        field471 = 0;
        for (int var6 = 0; var6 < Statics.field1032; var6++) {
            class42 var7 = class42.method1543(var6);
            if (var7 != null && var7.field1036 == 0) {
                class159.field2691[var6] = 0;
                class159.field2693[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field705.length; var8++) {
            field705[var8] = -1;
        }
        if (field629 != -1) {
            class158.method200(field629);
        }
        for (class4 var9 = (class4) field582.method3312(); var9 != null; var9 = (class4) field582.method3297()) {
            method42(var9, true);
        }
        field629 = -1;
        field582 = new class175(8);
        field516 = null;
        field609 = false;
        field722 = 0;
        field644.method3156((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var10 = 0; var10 < 8; var10++) {
            field466[var10] = null;
            field599[var10] = false;
        }
        class19.method3149();
        field475 = true;
        for (int var11 = 0; var11 < 100; var11++) {
            field672[var11] = true;
        }
        field694 = null;
        Statics.field193 = 0;
        Statics.field1307 = null;
    }

    @ObfuscatedName("ba.j(II)V")
    public static void method1244(int arg0) {
        if (arg0 == -3) {
            class21.method129(class134.field2074, class134.field2294, class134.field2073);
        } else if (arg0 == -2) {
            class21.method129(class134.field2104, class134.field2105, class134.field2111);
        } else if (arg0 == -1) {
            class21.method129(class134.field2107, class134.field2108, class134.field2252);
        } else if (arg0 == 3) {
            class21.method129(class134.field2110, class134.field2209, class134.field2270);
        } else if (arg0 == 4) {
            class21.method129(class134.field2113, class134.field2114, class134.field2165);
        } else if (arg0 == 5) {
            class21.method129(class134.field2116, class134.field2117, class134.field2118);
        } else if (arg0 == 6) {
            class21.method129(class134.field2284, class134.field2120, class134.field2121);
        } else if (arg0 == 7) {
            class21.method129(class134.field2122, class134.field2123, class134.field2213);
        } else if (arg0 == 8) {
            class21.method129(class134.field2242, class134.field2126, class134.field2239);
        } else if (arg0 == 9) {
            class21.method129(class134.field2128, class134.field2129, class134.field2130);
        } else if (arg0 == 10) {
            class21.method129(class134.field2131, class134.field2132, class134.field2133);
        } else if (arg0 == 11) {
            class21.method129(class134.field2214, class134.field2119, class134.field2136);
        } else if (arg0 == 12) {
            class21.method129(class134.field2137, class134.field2138, class134.field2109);
        } else if (arg0 == 13) {
            class21.method129(class134.field2140, class134.field2141, class134.field2142);
        } else if (arg0 == 14) {
            class21.method129(class134.field2143, class134.field2144, class134.field2145);
        } else if (arg0 == 16) {
            class21.method129(class134.field2146, class134.field2183, class134.field2148);
        } else if (arg0 == 17) {
            class21.method129(class134.field2149, class134.field2150, class134.field2125);
        } else if (arg0 == 18) {
            class21.method129(class134.field2156, class134.field2153, class134.field2154);
        } else if (arg0 == 19) {
            class21.method129(class134.field2155, class134.field2223, class134.field2157);
        } else if (arg0 == 20) {
            class21.method129(class134.field2067, class134.field2159, class134.field2262);
        } else if (arg0 == 22) {
            class21.method129(class134.field2277, class134.field2162, class134.field2163);
        } else if (arg0 == 23) {
            class21.method129(class134.field2164, class134.field2243, class134.field2166);
        } else if (arg0 == 24) {
            class21.method129(class134.field2167, class134.field2245, class134.field2253);
        } else if (arg0 == 25) {
            class21.method129(class134.field2170, class134.field2171, class134.field2172);
        } else if (arg0 == 26) {
            class21.method129(class134.field2068, class134.field2174, class134.field2232);
        } else if (arg0 == 27) {
            class21.method129(class134.field2176, class134.field2177, class134.field2244);
        } else if (arg0 == 31) {
            class21.method129(class134.field2185, class134.field2186, class134.field2283);
        } else if (arg0 == 32) {
            class21.method129(class134.field2188, class134.field2189, class134.field2190);
        } else if (arg0 == 37) {
            class21.method129(class134.field2191, class134.field2175, class134.field2173);
        } else if (arg0 == 38) {
            class21.method129(class134.field2226, class134.field2195, class134.field2196);
        } else if (arg0 == 55) {
            class21.method129(class134.field2197, class134.field2198, class134.field2227);
        } else {
            class21.method129(class134.field2200, class134.field2201, class134.field2202);
        }
        method541(10);
    }

    @ObfuscatedName("ev.k(I)V")
    public static final void method2923() {
        class37.field926.method3251();
        class33.field856.method3251();
        class36.field908.method3251();
        class32.method184();
        class31.field768.method3251();
        class31.field767.method3251();
        class40.field979.method3251();
        class40.field980.method3251();
        class40.field981.method3251();
        class34.field868.method3251();
        class34.field885.method3251();
        class35.method1383();
        class38.field944.method3251();
        class42.method622();
        class163.field2721.method3251();
        class158.field2621.method3251();
        class158.field2568.method3251();
        class158.field2623.method3251();
        ((class110) Statics.field1766).method2198();
        class5.field66.method3251();
        Statics.field170.method2981();
        Statics.field2003.method2981();
        Statics.field1094.method2981();
        Statics.field398.method2981();
        Statics.field190.method2981();
        Statics.field652.method2981();
        Statics.field1843.method2981();
        Statics.field1022.method2981();
        Statics.field2823.method2981();
        Statics.field2437.method2981();
        Statics.field1265.method2981();
        Statics.field343.method2981();
    }

    @ObfuscatedName("p.a(I)V")
    public static final void method126() {
        if (field512 > 0) {
            Statics.method2018();
        } else {
            method541(40);
            Statics.field10 = Statics.field9;
            Statics.field9 = null;
        }
    }

    @ObfuscatedName("bj.y(I)V")
    public static final void method1435() {
        if (field483 > 1) {
            field483--;
        }
        if (field512 > 0) {
            field512--;
        }
        if (field503) {
            field503 = false;
            method126();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field9 == null) {
                var1 = false;
            } else {
                label2703: {
                    try {
                        int var2 = Statics.field9.method1388();
                        if (var2 == 0) {
                            var1 = false;
                            break label2703;
                        }
                        if (field509 == -1) {
                            Statics.field9.method1389(field570.field2028, 0, 1);
                            field570.field2023 = 0;
                            field509 = field570.method2294();
                            field508 = class165.field2770[field509];
                            var2--;
                        }
                        if (field508 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2703;
                            }
                            Statics.field9.method1389(field570.field2028, 0, 1);
                            field508 = field570.field2028[0] & 0xFF;
                            var2--;
                        }
                        if (field508 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2703;
                            }
                            Statics.field9.method1389(field570.field2028, 0, 2);
                            field570.field2023 = 0;
                            field508 = field570.method2416();
                            var2 -= 2;
                        }
                        if (var2 < field508) {
                            var1 = false;
                            break label2703;
                        }
                        field570.field2023 = 0;
                        Statics.field9.method1389(field570.field2028, 0, field508);
                        field510 = 0;
                        field575 = field679;
                        field679 = field555;
                        field555 = field509;
                        if (field509 == 168) {
                            int var3 = field570.method2449();
                            int var4 = field570.method2537();
                            class158 var5 = class158.method2199(var3);
                            if (var5.field2644 != var4 || var4 == -1) {
                                var5.field2644 = var4;
                                var5.field2678 = 0;
                                var5.field2625 = 0;
                                method118(var5);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 33) {
                            Statics.field1793 = field570.method2414();
                            Statics.field1371 = field570.method2439();
                            for (int var6 = Statics.field1371; var6 < Statics.field1371 + 8; var6++) {
                                for (int var7 = Statics.field1793; var7 < Statics.field1793 + 8; var7++) {
                                    if (field687[Statics.field948][var6][var7] != null) {
                                        field687[Statics.field948][var6][var7] = null;
                                        method154(var6, var7);
                                    }
                                }
                            }
                            for (class22 var8 = (class22) field602.method3321(); var8 != null; var8 = (class22) field602.method3323()) {
                                if (var8.field333 >= Statics.field1371 && var8.field333 < Statics.field1371 + 8 && var8.field334 >= Statics.field1793 && var8.field334 < Statics.field1793 + 8 && Statics.field948 == var8.field341) {
                                    var8.field342 = 0;
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 160) {
                            int var9 = field570.method2447();
                            int var10 = field570.method2493();
                            int var11 = field570.method2536();
                            int var12 = field570.method2419();
                            class158 var13 = class158.method2199(var11);
                            if (var13.field2612 != var12 || var13.field2613 != var10 || var13.field2615 != var9) {
                                var13.field2612 = var12;
                                var13.field2613 = var10;
                                var13.field2615 = var9;
                                method118(var13);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 88) {
                            int var14 = field570.method2414();
                            int var15 = field570.method2447();
                            int var16 = field570.method2536();
                            class4 var17 = (class4) field582.method3293((long) var16);
                            if (var17 != null) {
                                method42(var17, var17.field56 != var15);
                            }
                            class4 var18 = new class4();
                            var18.field56 = var15;
                            var18.field61 = var14;
                            field582.method3303(var18, (long) var16);
                            if (class158.method1643(var15)) {
                                class158[] var19 = Statics.field2588[var15];
                                for (int var20 = 0; var20 < var19.length; var20++) {
                                    class158 var21 = var19[var20];
                                    if (var21 != null) {
                                        var21.field2678 = 0;
                                        var21.field2625 = 0;
                                    }
                                }
                            }
                            class26.method1436(var15);
                            class158 var22 = class158.method2199(var16);
                            if (var22 != null) {
                                method118(var22);
                            }
                            if (field516 != null) {
                                method118(field516);
                                field516 = null;
                            }
                            method52();
                            if (field629 != -1) {
                                method2288(field629, 1);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 109) {
                            int var23 = field570.method2414();
                            int var24 = field570.method2414();
                            int var25 = field570.method2414();
                            int var26 = field570.method2414();
                            field718[var23] = true;
                            field564[var23] = var24;
                            field720[var23] = var25;
                            field721[var23] = var26;
                            field538[var23] = 0;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 142) {
                            method219();
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 36) {
                            field716 = true;
                            Statics.field2705 = field570.method2414();
                            Statics.field117 = field570.method2414();
                            Statics.field207 = field570.method2416();
                            Statics.field360 = field570.method2414();
                            Statics.field1818 = field570.method2414();
                            if (Statics.field1818 >= 100) {
                                int var27 = Statics.field2705 * 128 + 64;
                                int var28 = Statics.field117 * 128 + 64;
                                int var29 = method1646(var27, var28, Statics.field948) - Statics.field207;
                                int var30 = var27 - Statics.field330;
                                int var31 = var29 - Statics.field1963;
                                int var32 = var28 - Statics.field2690;
                                int var33 = (int) Math.sqrt((double) (var30 * var30 + var32 * var32));
                                Statics.field778 = (int) (Math.atan2((double) var31, (double) var33) * 325.949D) & 0x7FF;
                                Statics.field750 = (int) (Math.atan2((double) var30, (double) var32) * -325.949D) & 0x7FF;
                                if (Statics.field778 < 128) {
                                    Statics.field778 = 128;
                                }
                                if (Statics.field778 > 383) {
                                    Statics.field778 = 383;
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 8) {
                            method12();
                            field635 = field570.method2480();
                            field662 = field517;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 18) {
                            int var34 = field570.method2416();
                            int var35 = field570.method2459();
                            int var36 = field570.method2493();
                            class158 var37 = class158.method2199(var35);
                            var37.field2616 = (var34 << 16) + var36;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 118) {
                            String var38 = field570.method2422();
                            Object[] var39 = new Object[var38.length() + 1];
                            for (int var40 = var38.length() - 1; var40 >= 0; var40--) {
                                if (var38.charAt(var40) == 's') {
                                    var39[var40 + 1] = field570.method2422();
                                } else {
                                    var39[var40 + 1] = Integer.valueOf(field570.method2430());
                                }
                            }
                            var39[0] = Integer.valueOf(field570.method2430());
                            class1 var41 = new class1();
                            var41.field3 = var39;
                            class26.method132(var41);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 234) {
                            int var42 = field570.method2450();
                            int var43 = field570.method2537();
                            int var44 = field570.method2536();
                            class158 var45 = class158.method2199(var44);
                            int var46 = var45.field2579 + var43;
                            int var47 = var45.field2580 + var42;
                            if (var45.field2577 != var46 || var45.field2578 != var47) {
                                var45.field2577 = var46;
                                var45.field2578 = var47;
                                method118(var45);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 239) {
                            String var48 = field570.method2422();
                            int var49 = field570.method2449();
                            class158 var50 = class158.method2199(var49);
                            if (!var48.equals(var50.field2619)) {
                                var50.field2619 = var48;
                                method118(var50);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 200) {
                            int var51 = field570.method2493();
                            if (var51 == 65535) {
                                var51 = -1;
                            }
                            int var52 = field570.method2449();
                            int var53 = field570.method2430();
                            int var54 = field570.method2447();
                            if (var54 == 65535) {
                                var54 = -1;
                            }
                            for (int var55 = var51; var55 <= var54; var55++) {
                                long var56 = ((long) var52 << 32) + (long) var55;
                                class179 var58 = field523.method3293(var56);
                                if (var58 != null) {
                                    var58.method3346();
                                }
                                field523.method3303(new class171(var53), var56);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 240) {
                            String var59 = field570.method2422();
                            long var60 = field570.method2420();
                            long var62 = (long) field570.method2416();
                            long var64 = (long) field570.method2479();
                            int var66 = field570.method2414();
                            long var67 = (var62 << 32) + var64;
                            boolean var69 = false;
                            for (int var70 = 0; var70 < 100; var70++) {
                                if (field688[var70] == var67) {
                                    var69 = true;
                                    break;
                                }
                            }
                            if (var66 <= 1 && method205(var59)) {
                                var69 = true;
                            }
                            if (!var69 && field586 == 0) {
                                field688[field674] = var67;
                                field674 = (field674 + 1) % 100;
                                class116 var71 = field570;
                                String var72 = Statics.method1364(var71, 32767);
                                String var73 = class185.method3389(class147.method1381(var72));
                                if (var66 == 2 || var66 == 3) {
                                    method1243(9, class2.method96(1) + var59, var73, class146.method3081(var60));
                                } else if (var66 == 1) {
                                    method1243(9, class2.method96(0) + var59, var73, class146.method3081(var60));
                                } else {
                                    method1243(9, var59, var73, class146.method3081(var60));
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 154) {
                            int var74 = field570.method2416();
                            if (var74 == 65535) {
                                var74 = -1;
                            }
                            method2093(var74);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 92) {
                            int var75 = field570.method2447();
                            if (var75 == 65535) {
                                var75 = -1;
                            }
                            int var76 = field570.method2453();
                            method101(var75, var76);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 195) {
                            field671 = field517;
                            if (field508 == 0) {
                                field694 = null;
                                field695 = null;
                                Statics.field193 = 0;
                                Statics.field1307 = null;
                                field509 = -1;
                                var1 = true;
                            } else {
                                field695 = field570.method2422();
                                long var77 = field570.method2420();
                                field694 = class146.method2285(var77);
                                Statics.field696 = field570.method2415();
                                int var79 = field570.method2414();
                                if (var79 == 255) {
                                    field509 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field193 = var79;
                                    class8[] var80 = new class8[100];
                                    for (int var81 = 0; var81 < Statics.field193; var81++) {
                                        var80[var81] = new class8();
                                        var80[var81].field105 = field570.method2422();
                                        var80[var81].field104 = class148.method595(var80[var81].field105, Statics.field470);
                                        var80[var81].field106 = field570.method2416();
                                        var80[var81].field107 = field570.method2415();
                                        field570.method2422();
                                        if (var80[var81].field105.equals(Statics.field2706.field50)) {
                                            Statics.field1966 = var80[var81].field107;
                                        }
                                    }
                                    boolean var82 = false;
                                    int var83 = Statics.field193;
                                    while (var83 > 0) {
                                        boolean var84 = true;
                                        var83--;
                                        for (int var85 = 0; var85 < var83; var85++) {
                                            if (var80[var85].field104.compareTo(var80[var85 + 1].field104) > 0) {
                                                class8 var86 = var80[var85];
                                                var80[var85] = var80[var85 + 1];
                                                var80[var85 + 1] = var86;
                                                var84 = false;
                                            }
                                        }
                                        if (var84) {
                                            break;
                                        }
                                    }
                                    Statics.field1307 = var80;
                                    field509 = -1;
                                    var1 = true;
                                }
                            }
                            break label2703;
                        }
                        if (field509 == 79) {
                            int var87 = field570.method2536();
                            Statics.field260 = Statics.field1457.method1503(var87);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 64) {
                            field716 = false;
                            for (int var88 = 0; var88 < 5; var88++) {
                                field718[var88] = false;
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 185) {
                            method12();
                            int var89 = field570.method2440();
                            int var90 = field570.method2439();
                            int var91 = field570.method2459();
                            field607[var90] = var91;
                            field653[var90] = var89;
                            field606[var90] = 1;
                            for (int var92 = 0; var92 < 98; var92++) {
                                if (var91 >= class130.field2030[var92]) {
                                    field606[var90] = var92 + 2;
                                }
                            }
                            field657[++field529 - 1 & 0x1F] = var90;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 104) {
                            class182.method160(field570, field508);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 134) {
                            while (field570.field2023 < field508) {
                                int var93 = field570.method2414();
                                boolean var94 = (var93 & 0x1) == 1;
                                String var95 = field570.method2422();
                                String var96 = field570.method2422();
                                field570.method2422();
                                for (int var97 = 0; var97 < field471; var97++) {
                                    class11 var98 = field620[var97];
                                    if (var94) {
                                        if (var96.equals(var98.field165)) {
                                            var98.field165 = var95;
                                            var98.field166 = var96;
                                            var95 = null;
                                            break;
                                        }
                                    } else if (var95.equals(var98.field165)) {
                                        var98.field165 = var95;
                                        var98.field166 = var96;
                                        var95 = null;
                                        break;
                                    }
                                }
                                if (var95 != null && field471 < 400) {
                                    class11 var99 = new class11();
                                    field620[field471] = var99;
                                    var99.field165 = var95;
                                    var99.field166 = var96;
                                    field471++;
                                }
                            }
                            field660 = field517;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 199) {
                            int var100 = field570.method2459();
                            int var101 = field570.method2419();
                            class158 var102 = class158.method2199(var100);
                            if (var102.field2604 != 1 || var102.field2605 != var101) {
                                var102.field2604 = 1;
                                var102.field2605 = var101;
                                method118(var102);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 183) {
                            int var103 = field570.method2430();
                            int var104 = field570.method2416();
                            if (var103 < -70000) {
                                var104 += 32768;
                            }
                            class158 var105;
                            if (var103 >= 0) {
                                var105 = class158.method2199(var103);
                            } else {
                                var105 = null;
                            }
                            while (field570.field2023 < field508) {
                                int var106 = field570.method2427();
                                int var107 = field570.method2416();
                                int var108 = 0;
                                if (var107 != 0) {
                                    var108 = field570.method2414();
                                    if (var108 == 255) {
                                        var108 = field570.method2430();
                                    }
                                }
                                if (var105 != null && var106 >= 0 && var106 < var105.field2581.length) {
                                    var105.field2581[var106] = var107;
                                    var105.field2675[var106] = var108;
                                }
                                class19.method705(var104, var106, var107 - 1, var108);
                            }
                            if (var105 != null) {
                                method118(var105);
                            }
                            method12();
                            field519[++field656 - 1 & 0x1F] = var104 & 0x7FFF;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 146) {
                            field686 = field570.method2414();
                            field661 = field570.method2414();
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 74) {
                            Statics.method2018();
                            field509 = -1;
                            var1 = false;
                            break label2703;
                        }
                        if (field509 == 90) {
                            field570.field2023 += 28;
                            if (field570.method2434()) {
                                class116 var109 = field570;
                                int var110 = field570.field2023 - 28;
                                if (class82.field1429 != null) {
                                    try {
                                        class82.field1429.method568(0L);
                                        class82.field1429.method574(var109.field2028, var110, 24);
                                    } catch (Exception var400) {
                                    }
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 49) {
                            Statics.field1793 = field570.method2440();
                            Statics.field1371 = field570.method2414();
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 158) {
                            field484 = field570.method2414();
                            if (field484 == 1) {
                                field485 = field570.method2416();
                            }
                            if (field484 >= 2 && field484 <= 6) {
                                if (field484 == 2) {
                                    field490 = 64;
                                    field536 = 64;
                                }
                                if (field484 == 3) {
                                    field490 = 0;
                                    field536 = 64;
                                }
                                if (field484 == 4) {
                                    field490 = 128;
                                    field536 = 64;
                                }
                                if (field484 == 5) {
                                    field490 = 64;
                                    field536 = 0;
                                }
                                if (field484 == 6) {
                                    field490 = 64;
                                    field536 = 128;
                                }
                                field484 = 2;
                                field487 = field570.method2416();
                                field488 = field570.method2416();
                                field489 = field570.method2414();
                            }
                            if (field484 == 10) {
                                field486 = field570.method2416();
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 37) {
                            String var112 = field570.method2422();
                            if (var112.endsWith(":tradereq:")) {
                                String var113 = var112.substring(0, var112.indexOf(":"));
                                boolean var114 = false;
                                if (method205(var113)) {
                                    var114 = true;
                                }
                                if (!var114 && field586 == 0) {
                                    method1287(4, var113, class134.field2203);
                                }
                            } else if (var112.endsWith(":duelreq:")) {
                                String var115 = var112.substring(0, var112.indexOf(":"));
                                boolean var116 = false;
                                if (method205(var115)) {
                                    var116 = true;
                                }
                                if (!var116 && field586 == 0) {
                                    method1287(8, var115, class134.field2297);
                                }
                            } else if (var112.endsWith(":chalreq:")) {
                                String var117 = var112.substring(0, var112.indexOf(":"));
                                boolean var118 = false;
                                if (method205(var117)) {
                                    var118 = true;
                                }
                                if (!var118 && field586 == 0) {
                                    String var119 = var112.substring(var112.indexOf(":") + 1, var112.length() - 9);
                                    method1287(8, var117, var119);
                                }
                            } else if (var112.endsWith(":assistreq:")) {
                                String var120 = var112.substring(0, var112.indexOf(":"));
                                boolean var121 = false;
                                if (method205(var120)) {
                                    var121 = true;
                                }
                                if (!var121 && field586 == 0) {
                                    method1287(10, var120, "");
                                }
                            } else if (var112.endsWith(":clan:")) {
                                String var122 = var112.substring(0, var112.indexOf(":clan:"));
                                method1287(11, "", var122);
                            } else if (var112.endsWith(":trade:")) {
                                String var123 = var112.substring(0, var112.indexOf(":trade:"));
                                if (field586 == 0) {
                                    method1287(12, "", var123);
                                }
                            } else if (var112.endsWith(":assist:")) {
                                String var124 = var112.substring(0, var112.indexOf(":assist:"));
                                if (field586 == 0) {
                                    method1287(13, "", var124);
                                }
                            } else {
                                method1287(0, "", var112);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 145) {
                            Statics.field1793 = field570.method2414();
                            Statics.field1371 = field570.method2439();
                            while (field570.field2023 < field508) {
                                field509 = field570.method2414();
                                method550();
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 89) {
                            if (field629 != -1) {
                                method2288(field629, 0);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 0) {
                            int var125 = field570.method2536();
                            class158 var126 = class158.method2199(var125);
                            var126.field2604 = 3;
                            var126.field2605 = Statics.field2706.field39.method3163();
                            method118(var126);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 152) {
                            int var127 = field570.method2419();
                            int var128 = field570.method2536();
                            class159.field2691[var127] = var128;
                            if (class159.field2693[var127] != var128) {
                                class159.field2693[var127] = var128;
                                Statics.method94(var127);
                            }
                            field533[++field654 - 1 & 0x1F] = var127;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 60) {
                            int var129 = field570.method2449();
                            class158 var130 = class158.method2199(var129);
                            for (int var131 = 0; var131 < var130.field2581.length; var131++) {
                                var130.field2581[var131] = -1;
                                var130.field2581[var131] = 0;
                            }
                            method118(var130);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 253) {
                            int var132 = field570.method2430();
                            int var133 = field570.method2416();
                            if (var132 < -70000) {
                                var133 += 32768;
                            }
                            class158 var134;
                            if (var132 >= 0) {
                                var134 = class158.method2199(var132);
                            } else {
                                var134 = null;
                            }
                            if (var134 != null) {
                                for (int var135 = 0; var135 < var134.field2581.length; var135++) {
                                    var134.field2581[var135] = 0;
                                    var134.field2675[var135] = 0;
                                }
                            }
                            class19 var136 = (class19) class19.field272.method3293((long) var133);
                            if (var136 != null) {
                                for (int var137 = 0; var137 < var136.field266.length; var137++) {
                                    var136.field266[var137] = -1;
                                    var136.field268[var137] = 0;
                                }
                            }
                            int var138 = field570.method2416();
                            for (int var139 = 0; var139 < var138; var139++) {
                                int var140 = field570.method2439();
                                if (var140 == 255) {
                                    var140 = field570.method2536();
                                }
                                int var141 = field570.method2493();
                                if (var134 != null && var139 < var134.field2581.length) {
                                    var134.field2581[var139] = var141;
                                    var134.field2675[var139] = var140;
                                }
                                class19.method705(var133, var139, var141 - 1, var140);
                            }
                            if (var134 != null) {
                                method118(var134);
                            }
                            method12();
                            field519[++field656 - 1 & 0x1F] = var133 & 0x7FFF;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 78) {
                            String var142 = field570.method2422();
                            long var143 = (long) field570.method2416();
                            long var145 = (long) field570.method2479();
                            int var147 = field570.method2414();
                            long var148 = (var143 << 32) + var145;
                            boolean var150 = false;
                            for (int var151 = 0; var151 < 100; var151++) {
                                if (field688[var151] == var148) {
                                    var150 = true;
                                    break;
                                }
                            }
                            if (method205(var142)) {
                                var150 = true;
                            }
                            if (!var150 && field586 == 0) {
                                field688[field674] = var148;
                                field674 = (field674 + 1) % 100;
                                String var152 = class185.method3389(class147.method1381(class184.method597(field570)));
                                if (var147 == 2 || var147 == 3) {
                                    method1287(7, class2.method96(1) + var142, var152);
                                } else if (var147 == 1) {
                                    method1287(7, class2.method96(0) + var142, var152);
                                } else {
                                    method1287(3, var142, var152);
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 162) {
                            int var153 = field570.method2419();
                            class19.method31(var153);
                            field519[++field656 - 1 & 0x1F] = var153 & 0x7FFF;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 248) {
                            String var154 = field570.method2422();
                            int var155 = field570.method2416();
                            byte var156 = field570.method2415();
                            boolean var157 = false;
                            if (var156 == -128) {
                                var157 = true;
                            }
                            if (var157) {
                                if (Statics.field193 == 0) {
                                    field509 = -1;
                                    var1 = true;
                                    break label2703;
                                }
                                boolean var158 = false;
                                int var159;
                                for (var159 = 0; var159 < Statics.field193 && (!Statics.field1307[var159].field105.equals(var154) || Statics.field1307[var159].field106 != var155); var159++) {
                                }
                                if (var159 < Statics.field193) {
                                    while (var159 < Statics.field193 - 1) {
                                        Statics.field1307[var159] = Statics.field1307[var159 + 1];
                                        var159++;
                                    }
                                    Statics.field193--;
                                    Statics.field1307[Statics.field193] = null;
                                }
                            } else {
                                field570.method2422();
                                class8 var160 = new class8();
                                var160.field105 = var154;
                                var160.field104 = class148.method595(var160.field105, Statics.field470);
                                var160.field106 = var155;
                                var160.field107 = var156;
                                int var161;
                                for (var161 = Statics.field193 - 1; var161 >= 0; var161--) {
                                    int var162 = Statics.field1307[var161].field104.compareTo(var160.field105);
                                    if (var162 == 0) {
                                        Statics.field1307[var161].field106 = var155;
                                        Statics.field1307[var161].field107 = var156;
                                        if (var154.equals(Statics.field2706.field50)) {
                                            Statics.field1966 = var156;
                                        }
                                        field671 = field517;
                                        field509 = -1;
                                        var1 = true;
                                        break label2703;
                                    }
                                    if (var162 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field193 >= Statics.field1307.length) {
                                    field509 = -1;
                                    var1 = true;
                                    break label2703;
                                }
                                for (int var163 = Statics.field193 - 1; var163 > var161; var163--) {
                                    Statics.field1307[var163 + 1] = Statics.field1307[var163];
                                }
                                if (Statics.field193 == 0) {
                                    Statics.field1307 = new class8[100];
                                }
                                Statics.field1307[var161 + 1] = var160;
                                Statics.field193++;
                                if (var154.equals(Statics.field2706.field50)) {
                                    Statics.field1966 = var156;
                                }
                            }
                            field671 = field517;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 6) {
                            field632 = 1;
                            field660 = field517;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 115) {
                            for (int var164 = 0; var164 < class159.field2693.length; var164++) {
                                if (class159.field2693[var164] != class159.field2691[var164]) {
                                    class159.field2693[var164] = class159.field2691[var164];
                                    Statics.method94(var164);
                                    field533[++field654 - 1 & 0x1F] = var164;
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 238) {
                            boolean var165 = field570.method2440() == 1;
                            int var166 = field570.method2459();
                            class158 var167 = class158.method2199(var166);
                            if (var167.field2584 != var165) {
                                var167.field2584 = var165;
                                method118(var167);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 9) {
                            int var168 = field508 + field570.field2023;
                            int var169 = field570.method2416();
                            int var170 = field570.method2416();
                            if (field629 != var169) {
                                field629 = var169;
                                int var171 = field629;
                                if (class158.method1643(var171)) {
                                    class158[] var172 = Statics.field2588[var171];
                                    for (int var173 = 0; var173 < var172.length; var173++) {
                                        class158 var174 = var172[var173];
                                        if (var174 != null) {
                                            var174.field2678 = 0;
                                            var174.field2625 = 0;
                                        }
                                    }
                                }
                                class26.method1436(field629);
                                for (int var175 = 0; var175 < 100; var175++) {
                                    field672[var175] = true;
                                }
                            }
                            while (var170-- > 0) {
                                int var176 = field570.method2430();
                                int var177 = field570.method2416();
                                int var178 = field570.method2414();
                                class4 var179 = (class4) field582.method3293((long) var176);
                                if (var179 != null && var179.field56 != var177) {
                                    method42(var179, true);
                                    var179 = null;
                                }
                                if (var179 == null) {
                                    class4 var180 = new class4();
                                    var180.field56 = var177;
                                    var180.field61 = var178;
                                    field582.method3303(var180, (long) var176);
                                    if (class158.method1643(var177)) {
                                        class158[] var181 = Statics.field2588[var177];
                                        for (int var182 = 0; var182 < var181.length; var182++) {
                                            class158 var183 = var181[var182];
                                            if (var183 != null) {
                                                var183.field2678 = 0;
                                                var183.field2625 = 0;
                                            }
                                        }
                                    }
                                    class26.method1436(var177);
                                    class158 var184 = class158.method2199(var176);
                                    if (var184 != null) {
                                        method118(var184);
                                    }
                                    if (field516 != null) {
                                        method118(field516);
                                        field516 = null;
                                    }
                                    method52();
                                    if (field629 != -1) {
                                        method2288(field629, 1);
                                    }
                                    var179 = var180;
                                }
                                var179.field57 = true;
                            }
                            for (class4 var186 = (class4) field582.method3312(); var186 != null; var186 = (class4) field582.method3297()) {
                                if (var186.field57) {
                                    var186.field57 = false;
                                } else {
                                    method42(var186, true);
                                }
                            }
                            field523 = new class175(512);
                            while (field570.field2023 < var168) {
                                int var187 = field570.method2430();
                                int var188 = field570.method2416();
                                int var189 = field570.method2416();
                                int var190 = field570.method2430();
                                for (int var191 = var188; var191 <= var189; var191++) {
                                    long var192 = ((long) var187 << 32) + (long) var191;
                                    field523.method3303(new class171(var190), var192);
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 173) {
                            int var194 = field570.method2439();
                            int var195 = field570.method2440();
                            int var196 = field570.method2438();
                            Statics.field948 = var196 >> 1;
                            Statics.field2706.method220(var195, var194, (var196 & 0x1) == 1);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 29) {
                            field702 = 0;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 130) {
                            method874(false);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 206) {
                            int var197 = field570.method2416();
                            int var198 = field570.method2459();
                            class158 var199 = class158.method2199(var198);
                            if (var199 != null && var199.field2574 == 0) {
                                if (var197 > var199.field2567 - var199.field2582) {
                                    var197 = var199.field2567 - var199.field2582;
                                }
                                if (var197 < 0) {
                                    var197 = 0;
                                }
                                if (var199.field2571 != var197) {
                                    var199.field2571 = var197;
                                    method118(var199);
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 75) {
                            field716 = true;
                            Statics.field1991 = field570.method2414();
                            Statics.field921 = field570.method2414();
                            Statics.field2510 = field570.method2416();
                            Statics.field393 = field570.method2414();
                            Statics.field42 = field570.method2414();
                            if (Statics.field42 >= 100) {
                                Statics.field330 = Statics.field1991 * 128 + 64;
                                Statics.field2690 = Statics.field921 * 128 + 64;
                                Statics.field1963 = method1646(Statics.field330, Statics.field2690, Statics.field948) - Statics.field2510;
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 194) {
                            int var200 = field570.method2414();
                            String var201 = field570.method2422();
                            int var202 = field570.method2439();
                            if (var200 >= 1 && var200 <= 8) {
                                if (var201.equalsIgnoreCase("null")) {
                                    var201 = null;
                                }
                                field466[var200 - 1] = var201;
                                field599[var200 - 1] = var202 == 0;
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 101) {
                            method12();
                            field634 = field570.method2414();
                            field662 = field517;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 236) {
                            String var203 = field570.method2422();
                            class116 var204 = field570;
                            String var205 = Statics.method1364(var204, 32767);
                            String var206 = class185.method3389(class147.method1381(var205));
                            method1287(6, var203, var206);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 14) {
                            int var207 = field570.method2447();
                            field629 = var207;
                            if (class158.method1643(var207)) {
                                class158[] var208 = Statics.field2588[var207];
                                for (int var209 = 0; var209 < var208.length; var209++) {
                                    class158 var210 = var208[var209];
                                    if (var210 != null) {
                                        var210.field2678 = 0;
                                        var210.field2625 = 0;
                                    }
                                }
                            }
                            class26.method1436(field629);
                            for (int var211 = 0; var211 < 100; var211++) {
                                field672[var211] = true;
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 93) {
                            field729 = 0;
                            field590 = 0;
                            field570.method2308();
                            int var212 = field570.method2291(8);
                            if (var212 < field551) {
                                for (int var213 = var212; var213 < field551; var213++) {
                                    field596[++field729 - 1] = field504[var213];
                                }
                            }
                            if (var212 > field551) {
                                throw new RuntimeException("");
                            }
                            field551 = 0;
                            for (int var214 = 0; var214 < var212; var214++) {
                                int var215 = field504[var214];
                                class25 var216 = field494[var215];
                                int var217 = field570.method2291(1);
                                if (var217 == 0) {
                                    field504[++field551 - 1] = var215;
                                    var216.field449 = field476;
                                } else {
                                    int var218 = field570.method2291(2);
                                    if (var218 == 0) {
                                        field504[++field551 - 1] = var215;
                                        var216.field449 = field476;
                                        field591[++field590 - 1] = var215;
                                    } else if (var218 == 1) {
                                        field504[++field551 - 1] = var215;
                                        var216.field449 = field476;
                                        int var219 = field570.method2291(3);
                                        var216.method221(var219, false);
                                        int var220 = field570.method2291(1);
                                        if (var220 == 1) {
                                            field591[++field590 - 1] = var215;
                                        }
                                    } else if (var218 == 2) {
                                        field504[++field551 - 1] = var215;
                                        var216.field449 = field476;
                                        int var221 = field570.method2291(3);
                                        var216.method221(var221, true);
                                        int var222 = field570.method2291(3);
                                        var216.method221(var222, true);
                                        int var223 = field570.method2291(1);
                                        if (var223 == 1) {
                                            field591[++field590 - 1] = var215;
                                        }
                                    } else if (var218 == 3) {
                                        field596[++field729 - 1] = var215;
                                    }
                                }
                            }
                            method3046();
                            for (int var224 = 0; var224 < field590; var224++) {
                                int var225 = field591[var224];
                                class25 var226 = field494[var225];
                                int var227 = field570.method2414();
                                if ((var227 & 0x40) != 0) {
                                    var226.field374 = class31.method44(field570.method2419());
                                    var226.field407 = var226.field374.field772;
                                    var226.field453 = var226.field374.field795;
                                    var226.field411 = var226.field374.field797;
                                    var226.field451 = var226.field374.field794;
                                    var226.field445 = var226.field374.field780;
                                    var226.field423 = var226.field374.field769;
                                    var226.field408 = var226.field374.field788;
                                    var226.field409 = var226.field374.field801;
                                    var226.field430 = var226.field374.field777;
                                }
                                if ((var227 & 0x8) != 0) {
                                    var226.field454 = field570.method2416();
                                    var226.field433 = field570.method2419();
                                }
                                if ((var227 & 0x2) != 0) {
                                    var226.field426 = field570.method2493();
                                    if (var226.field426 == 65535) {
                                        var226.field426 = -1;
                                    }
                                }
                                if ((var227 & 0x20) != 0) {
                                    var226.field437 = field570.method2416();
                                    int var228 = field570.method2449();
                                    var226.field441 = var228 >> 16;
                                    var226.field431 = (var228 & 0xFFFF) + field476;
                                    var226.field405 = 0;
                                    var226.field439 = 0;
                                    if (var226.field431 > field476) {
                                        var226.field405 = -1;
                                    }
                                    if (var226.field437 == 65535) {
                                        var226.field437 = -1;
                                    }
                                }
                                if ((var227 & 0x10) != 0) {
                                    var226.field416 = field570.method2422();
                                    var226.field417 = 100;
                                }
                                if ((var227 & 0x1) != 0) {
                                    int var229 = field570.method2419();
                                    if (var229 == 65535) {
                                        var229 = -1;
                                    }
                                    int var230 = field570.method2414();
                                    if (var226.field432 == var229 && var229 != -1) {
                                        int var231 = class34.method1536(var229).field884;
                                        if (var231 == 1) {
                                            var226.field418 = 0;
                                            var226.field434 = 0;
                                            var226.field435 = var230;
                                            var226.field438 = 0;
                                        }
                                        if (var231 == 2) {
                                            var226.field438 = 0;
                                        }
                                    } else if (var229 == -1 || var226.field432 == -1 || class34.method1536(var229).field875 >= class34.method1536(var226.field432).field875) {
                                        var226.field432 = var229;
                                        var226.field418 = 0;
                                        var226.field434 = 0;
                                        var226.field435 = var230;
                                        var226.field438 = 0;
                                        var226.field459 = var226.field428;
                                    }
                                }
                                if ((var227 & 0x4) != 0) {
                                    int var232 = field570.method2440();
                                    int var233 = field570.method2438();
                                    var226.method239(var232, var233, field476);
                                    var226.field443 = field476 + 300;
                                    var226.field424 = field570.method2440();
                                    var226.field425 = field570.method2414();
                                }
                                if ((var227 & 0x80) != 0) {
                                    int var234 = field570.method2439();
                                    int var235 = field570.method2414();
                                    var226.method239(var234, var235, field476);
                                    var226.field443 = field476 + 300;
                                    var226.field424 = field570.method2438();
                                    var226.field425 = field570.method2414();
                                }
                            }
                            for (int var236 = 0; var236 < field729; var236++) {
                                int var237 = field596[var236];
                                if (field476 != field494[var237].field449) {
                                    field494[var237].field374 = null;
                                    field494[var237] = null;
                                }
                            }
                            if (field508 != field570.field2023) {
                                throw new RuntimeException(field570.field2023 + class2.field23 + field508);
                            }
                            for (int var238 = 0; var238 < field551; var238++) {
                                if (field494[field504[var238]] == null) {
                                    throw new RuntimeException(var238 + class2.field23 + field551);
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 112) {
                            int var239 = field570.method2447();
                            int var240 = field570.method2536();
                            class158 var241 = class158.method2199(var240);
                            if (var241.field2604 != 2 || var241.field2605 != var239) {
                                var241.field2604 = 2;
                                var241.field2605 = var239;
                                method118(var241);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 76) {
                            int var242 = field570.method2430();
                            class4 var243 = (class4) field582.method3293((long) var242);
                            if (var243 != null) {
                                method42(var243, true);
                            }
                            if (field516 != null) {
                                method118(field516);
                                field516 = null;
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 108) {
                            while (field570.field2023 < field508) {
                                boolean var244 = field570.method2414() == 1;
                                String var245 = field570.method2422();
                                String var246 = field570.method2422();
                                int var247 = field570.method2416();
                                int var248 = field570.method2414();
                                int var249 = field570.method2414();
                                boolean var250 = (var249 & 0x2) != 0;
                                boolean var251 = (var249 & 0x1) != 0;
                                if (var247 > 0) {
                                    field570.method2422();
                                    field570.method2414();
                                    field570.method2430();
                                }
                                field570.method2422();
                                for (int var252 = 0; var252 < field723; var252++) {
                                    class23 var253 = field518[var252];
                                    if (var244) {
                                        if (var246.equals(var253.field358)) {
                                            var253.field358 = var245;
                                            var253.field356 = var246;
                                            var245 = null;
                                            break;
                                        }
                                    } else if (var245.equals(var253.field358)) {
                                        if (var253.field353 != var247) {
                                            boolean var254 = true;
                                            for (class28 var255 = (class28) field719.method3280(); var255 != null; var255 = (class28) field719.method3286()) {
                                                if (var255.field735.equals(var245)) {
                                                    if (var247 != 0 && var255.field736 == 0) {
                                                        var255.method3342();
                                                        var254 = false;
                                                    } else if (var247 == 0 && var255.field736 != 0) {
                                                        var255.method3342();
                                                        var254 = false;
                                                    }
                                                }
                                            }
                                            if (var254) {
                                                field719.method3279(new class28(var245, var247));
                                            }
                                            var253.field353 = var247;
                                        }
                                        var253.field356 = var246;
                                        var253.field354 = var248;
                                        var253.field355 = var250;
                                        var253.field357 = var251;
                                        var245 = null;
                                        break;
                                    }
                                }
                                if (var245 != null && field723 < 400) {
                                    class23 var256 = new class23();
                                    field518[field723] = var256;
                                    var256.field358 = var245;
                                    var256.field356 = var246;
                                    var256.field353 = var247;
                                    var256.field354 = var248;
                                    var256.field355 = var250;
                                    var256.field357 = var251;
                                    field723++;
                                }
                            }
                            field632 = 2;
                            field660 = field517;
                            boolean var257 = false;
                            int var258 = field723;
                            while (var258 > 0) {
                                boolean var259 = true;
                                var258--;
                                for (int var260 = 0; var260 < var258; var260++) {
                                    boolean var261 = false;
                                    class23 var262 = field518[var260];
                                    class23 var263 = field518[var260 + 1];
                                    if (field639 != var262.field353 && field639 == var263.field353) {
                                        var261 = true;
                                    }
                                    if (!var261 && var262.field353 == 0 && var263.field353 != 0) {
                                        var261 = true;
                                    }
                                    if (!var261 && !var262.field355 && var263.field355) {
                                        var261 = true;
                                    }
                                    if (!var261 && !var262.field357 && var263.field357) {
                                        var261 = true;
                                    }
                                    if (var261) {
                                        class23 var264 = field518[var260];
                                        field518[var260] = field518[var260 + 1];
                                        field518[var260 + 1] = var264;
                                        var259 = false;
                                    }
                                }
                                if (var259) {
                                    break;
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 13) {
                            byte var265 = field570.method2441();
                            int var266 = field570.method2416();
                            class159.field2691[var266] = var265;
                            if (class159.field2693[var266] != var265) {
                                class159.field2693[var266] = var265;
                                Statics.method94(var266);
                            }
                            field533[++field654 - 1 & 0x1F] = var266;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 30) {
                            int var267 = field570.method2416();
                            int var268 = field570.method2414();
                            int var269 = field570.method2416();
                            method124(var267, var268, var269);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 201 || field509 == 164 || field509 == 243 || field509 == 45 || field509 == 177 || field509 == 50 || field509 == 137 || field509 == 135 || field509 == 155 || field509 == 187 || field509 == 122) {
                            method550();
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 139) {
                            int var270 = field570.method2459();
                            int var271 = field570.method2430();
                            int var272 = field570.method2447();
                            if (var272 == 65535) {
                                var272 = -1;
                            }
                            class158 var273 = class158.method2199(var270);
                            if (var273.field2662) {
                                var273.field2676 = var272;
                                var273.field2677 = var271;
                                class40 var275 = class40.method41(var272);
                                var273.field2612 = var275.field990;
                                var273.field2613 = var275.field991;
                                var273.field2614 = var275.field992;
                                var273.field2610 = var275.field993;
                                var273.field2611 = var275.field994;
                                var273.field2615 = var275.field1009;
                                if (var273.field2569 > 0) {
                                    var273.field2615 = var273.field2615 * 32 / var273.field2569;
                                }
                                method118(var273);
                            } else {
                                if (var272 == -1) {
                                    var273.field2604 = 0;
                                    field509 = -1;
                                    var1 = true;
                                    break label2703;
                                }
                                class40 var274 = class40.method41(var272);
                                var273.field2604 = 4;
                                var273.field2605 = var272;
                                var273.field2612 = var274.field990;
                                var273.field2613 = var274.field991;
                                var273.field2615 = var274.field1009 * 100 / var271;
                                method118(var273);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 224) {
                            for (int var276 = 0; var276 < field726.length; var276++) {
                                if (field726[var276] != null) {
                                    field726[var276].field432 = -1;
                                }
                            }
                            for (int var277 = 0; var277 < field494.length; var277++) {
                                if (field494[var277] != null) {
                                    field494[var277].field432 = -1;
                                }
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 44) {
                            field704 = field570.method2414();
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 55) {
                            int var278 = field570.method2536();
                            int var279 = field570.method2493();
                            int var280 = var279 >> 10 & 0x1F;
                            int var281 = var279 >> 5 & 0x1F;
                            int var282 = var279 & 0x1F;
                            int var283 = (var282 << 3) + (var280 << 19) + (var281 << 11);
                            class158 var284 = class158.method2199(var278);
                            if (var284.field2589 != var283) {
                                var284.field2589 = var283;
                                method118(var284);
                            }
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 39) {
                            for (int var285 = 0; var285 < Statics.field1032; var285++) {
                                class42 var286 = class42.method1543(var285);
                                if (var286 != null && var286.field1036 == 0) {
                                    class159.field2691[var285] = 0;
                                    class159.field2693[var285] = 0;
                                }
                            }
                            method12();
                            field654 += 32;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 250) {
                            field483 = field570.method2447() * 30;
                            field662 = field517;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 255) {
                            int var287 = field570.method2414();
                            class137[] var288 = class137.method626();
                            int var289 = 0;
                            class137 var291;
                            while (true) {
                                if (var289 >= var288.length) {
                                    var291 = null;
                                    break;
                                }
                                class137 var290 = var288[var289];
                                if (var290.field2311 == var287) {
                                    var291 = var290;
                                    break;
                                }
                                var289++;
                            }
                            Statics.field2442 = var291;
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        if (field509 == 71) {
                            method874(true);
                            field509 = -1;
                            var1 = true;
                            break label2703;
                        }
                        class80.method815("" + field509 + class2.field23 + field679 + class2.field23 + field575 + class2.field23 + field508, (Throwable) null);
                        Statics.method2018();
                    } catch (IOException var402) {
                        method126();
                    } catch (Exception var403) {
                        String var294 = "" + field509 + class2.field23 + field679 + class2.field23 + field575 + class2.field23 + field508 + class2.field23 + (Statics.field80 + Statics.field2706.field436[0]) + class2.field23 + (Statics.field377 + Statics.field2706.field456[0]) + class2.field23;
                        for (int var295 = 0; var295 < field508 && var295 < 50; var295++) {
                            var294 = var294 + field570.field2028[var295] + class2.field23;
                        }
                        class80.method815(var294, var403);
                        Statics.method2018();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field474 != 30) {
            return;
        }
        class182.method890(field505, 4);
        Object var296 = Statics.field2861.field231;
        synchronized (Statics.field2861.field231) {
            if (!field520) {
                Statics.field2861.field232 = 0;
            } else if (class77.field1390 != 0 || Statics.field2861.field232 >= 40) {
                field505.method2295(157);
                field505.method2498(0);
                int var297 = field505.field2023;
                int var298 = 0;
                for (int var299 = 0; var299 < Statics.field2861.field232 && field505.field2023 - var297 < 240; var299++) {
                    var298++;
                    int var300 = Statics.field2861.field234[var299];
                    if (var300 < 0) {
                        var300 = 0;
                    } else if (var300 > 502) {
                        var300 = 502;
                    }
                    int var301 = Statics.field2861.field235[var299];
                    if (var301 < 0) {
                        var301 = 0;
                    } else if (var301 > 764) {
                        var301 = 764;
                    }
                    int var302 = var300 * 765 + var301;
                    if (Statics.field2861.field234[var299] == -1 && Statics.field2861.field235[var299] == -1) {
                        var301 = -1;
                        var300 = -1;
                        var302 = 524287;
                    }
                    if (field478 != var301 || field479 != var300) {
                        int var303 = var301 - field478;
                        field478 = var301;
                        int var304 = var300 - field479;
                        field479 = var300;
                        if (field480 < 8 && var303 >= -32 && var303 <= 31 && var304 >= -32 && var304 <= 31) {
                            var303 += 32;
                            var304 += 32;
                            field505.method2401((field480 << 12) + (var303 << 6) + var304);
                            field480 = 0;
                        } else if (field480 < 8) {
                            field505.method2402((field480 << 19) + 8388608 + var302);
                            field480 = 0;
                        } else {
                            field505.method2448((field480 << 19) + -1073741824 + var302);
                            field480 = 0;
                        }
                    } else if (field480 < 2047) {
                        field480++;
                    }
                }
                field505.method2411(field505.field2023 - var297);
                if (var298 >= Statics.field2861.field232) {
                    Statics.field2861.field232 = 0;
                } else {
                    Statics.field2861.field232 -= var298;
                    for (int var305 = 0; var305 < Statics.field2861.field232; var305++) {
                        Statics.field2861.field235[var305] = Statics.field2861.field235[var298 + var305];
                        Statics.field2861.field234[var305] = Statics.field2861.field234[var298 + var305];
                    }
                }
            }
        }
        if (class77.field1390 != 0) {
            long var307 = (class77.field1393 - field477 * -1L) / 50L;
            if (var307 > 4095L) {
                var307 = 4095L;
            }
            field477 = class77.field1393 * -1L;
            int var309 = class77.field1398;
            if (var309 < 0) {
                var309 = 0;
            } else if (var309 > 502) {
                var309 = 502;
            }
            int var310 = class77.field1391;
            if (var310 < 0) {
                var310 = 0;
            } else if (var310 > 764) {
                var310 = 764;
            }
            int var311 = var309 * 765 + var310;
            byte var312 = 0;
            if (class77.field1390 == 2) {
                var312 = 1;
            }
            int var313 = (int) var307;
            field505.method2295(192);
            field505.method2448((var312 << 19) + (var313 << 20) + var311);
        }
        if (class75.field1353 > 0) {
            field505.method2295(172);
            field505.method2401(0);
            int var314 = field505.field2023;
            long var315 = class121.method131();
            for (int var317 = 0; var317 < class75.field1353; var317++) {
                long var318 = var315 - field693;
                if (var318 > 16777215L) {
                    var318 = 16777215L;
                }
                field693 = var315;
                field505.method2437(class75.field1360[var317]);
                field505.method2452((int) var318);
            }
            field505.method2410(field505.field2023 - var314);
        }
        if (field557 > 0) {
            field557--;
        }
        if (class75.field1340[96] || class75.field1340[97] || class75.field1340[98] || class75.field1340[99]) {
            field558 = true;
        }
        if (field558 && field557 <= 0) {
            field557 = 20;
            field558 = false;
            field505.method2295(29);
            field505.method2401(field724);
            field505.method2444(field553);
        }
        if (Statics.field76 && !field481) {
            field481 = true;
            field505.method2295(144);
            field505.method2498(1);
        }
        if (!Statics.field76 && field481) {
            field481 = false;
            field505.method2295(144);
            field505.method2498(0);
        }
        if (field472 && Statics.field948 != field562) {
            method95(Statics.field227, Statics.field1379, Statics.field948, Statics.field2706.field436[0], Statics.field2706.field456[0]);
        } else if (Statics.field948 != field697) {
            field697 = Statics.field948;
            method770(Statics.field948);
        }
        if (field474 != 30) {
            return;
        }
        method100();
        int var10002;
        for (int var320 = 0; var320 < field710; var320++) {
            var10002 = field713[var320]--;
            if (field713[var320] >= -10) {
                class57 var322 = field715[var320];
                if (var322 == null) {
                    class57 var404 = (class57) null;
                    var322 = class57.method1266(Statics.field398, field711[var320], 0);
                    if (var322 == null) {
                        continue;
                    }
                    field713[var320] += var322.method1262();
                    field715[var320] = var322;
                }
                if (field713[var320] < 0) {
                    int var329;
                    if (field647[var320] == 0) {
                        var329 = field708;
                    } else {
                        int var323 = (field647[var320] & 0xFF) * 128;
                        int var324 = field647[var320] >> 16 & 0xFF;
                        int var325 = var324 * 128 + 64 - Statics.field2706.field463;
                        if (var325 < 0) {
                            var325 = -var325;
                        }
                        int var326 = field647[var320] >> 8 & 0xFF;
                        int var327 = var326 * 128 + 64 - Statics.field2706.field404;
                        if (var327 < 0) {
                            var327 = -var327;
                        }
                        int var328 = var325 + var327 - 128;
                        if (var328 > var323) {
                            field713[var320] = -100;
                            continue;
                        }
                        if (var328 < 0) {
                            var328 = 0;
                        }
                        var329 = field709 * (var323 - var328) / var323;
                    }
                    if (var329 > 0) {
                        class63 var330 = var322.method1259().method1328(Statics.field376);
                        class45 var331 = class45.method1077(var330, 100, var329);
                        var331.method938(field712[var320] - 1);
                        Statics.field766.method1103(var331);
                    }
                    field713[var320] = -100;
                }
            } else {
                field710--;
                for (int var321 = var320; var321 < field710; var321++) {
                    field711[var321] = field711[var321 + 1];
                    field715[var321] = field715[var321 + 1];
                    field712[var321] = field712[var321 + 1];
                    field713[var321] = field713[var321 + 1];
                    field647[var321] = field647[var321 + 1];
                }
                var320--;
            }
        }
        if (field707) {
            boolean var332;
            if (class138.field2324 == 0) {
                var332 = Statics.field1752.method2708();
            } else {
                var332 = true;
            }
            if (!var332) {
                if (field618 != 0 && field725 != -1) {
                    class138.method98(Statics.field652, field725, 0, field618, false);
                }
                field707 = false;
            }
        }
        field510++;
        if (field510 > 750) {
            method126();
            return;
        }
        method474();
        method538();
        for (int var333 = -1; var333 < field588; var333++) {
            int var334;
            if (var333 == -1) {
                var334 = 2047;
            } else {
                var334 = field587[var333];
            }
            class3 var335 = field726[var334];
            if (var335 != null && var335.field417 > 0) {
                var335.field417--;
                if (var335.field417 == 0) {
                    var335.field416 = null;
                }
            }
        }
        for (int var336 = 0; var336 < field551; var336++) {
            int var337 = field504[var336];
            class25 var338 = field494[var337];
            if (var338 != null && var338.field417 > 0) {
                var338.field417--;
                if (var338.field417 == 0) {
                    var338.field416 = null;
                }
            }
        }
        field545++;
        if (field577 != 0) {
            field664 += 20;
            if (field664 >= 400) {
                field577 = 0;
            }
        }
        if (Statics.field1351 != null) {
            field578++;
            if (field578 >= 15) {
                method118(Statics.field1351);
                Statics.field1351 = null;
            }
        }
        if (Statics.field883 != null) {
            method118(Statics.field883);
            field585++;
            if (class77.field1384 > field605 + 5 || class77.field1384 < field605 - 5 || class77.field1385 > field541 + 5 || class77.field1385 < field541 - 5) {
                field611 = true;
            }
            if (class77.field1392 == 0) {
                if (field611 && field585 >= 5) {
                    if (Statics.field883 == Statics.field1023 && field560 != field526) {
                        class158 var339 = Statics.field883;
                        byte var340 = 0;
                        if (field669 == 1 && var339.field2565 == 206) {
                            var340 = 1;
                        }
                        if (var339.field2581[field560] <= 0) {
                            var340 = 0;
                        }
                        if (class162.method195(method1434(var339))) {
                            int var341 = field526;
                            int var342 = field560;
                            var339.field2581[var342] = var339.field2581[var341];
                            var339.field2675[var342] = var339.field2675[var341];
                            var339.field2581[var341] = -1;
                            var339.field2675[var341] = 0;
                        } else if (var340 == 1) {
                            int var343 = field526;
                            int var344 = field560;
                            while (var343 != var344) {
                                if (var343 > var344) {
                                    var339.method3105(var343 - 1, var343);
                                    var343--;
                                } else if (var343 < var344) {
                                    var339.method3105(var343 + 1, var343);
                                    var343++;
                                }
                            }
                        } else {
                            var339.method3105(field560, field526);
                        }
                        field505.method2295(132);
                        field505.method2401(field526);
                        field505.method2456(Statics.field883.field2634);
                        field505.method2435(var340);
                        field505.method2401(field560);
                    }
                } else if ((field465 == 1 || method1650(field722 - 1)) && field722 > 2) {
                    method206();
                } else if (field722 > 0) {
                    method36(field722 - 1);
                }
                field578 = 10;
                class77.field1390 = 0;
                Statics.field883 = null;
            }
        }
        class158 var345 = Statics.field228;
        class158 var346 = Statics.field349;
        Statics.field228 = null;
        Statics.field349 = null;
        field728 = null;
        field648 = false;
        field645 = false;
        for (field690 = 0; class75.method2640() && field690 < 128; field690++) {
            field692[field690] = Statics.field1354;
            field691[field690] = Statics.field1257;
        }
        int var347 = field629;
        if (class158.method1643(var347)) {
            method1839(Statics.field2588[var347], -1, 0, 0, 765, 503, 0, 0);
        }
        field517++;
        while (true) {
            class1 var348;
            class158 var349;
            class158 var350;
            do {
                var348 = (class1) field667.method3319();
                if (var348 == null) {
                    while (true) {
                        class1 var351;
                        class158 var352;
                        class158 var353;
                        do {
                            var351 = (class1) field668.method3319();
                            if (var351 == null) {
                                while (true) {
                                    class1 var354;
                                    class158 var355;
                                    class158 var356;
                                    do {
                                        var354 = (class1) field601.method3319();
                                        if (var354 == null) {
                                            if (field640 != null) {
                                                method2351();
                                            }
                                            if (class95.field1589 != -1) {
                                                int var357 = class95.field1589;
                                                int var358 = class95.field1614;
                                                boolean var359 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var357, var358, true, 0, 0, 0, 0, 0, 0);
                                                class95.field1589 = -1;
                                                if (var359) {
                                                    field574 = class77.field1391;
                                                    field499 = class77.field1398;
                                                    field577 = 1;
                                                    field664 = 0;
                                                }
                                            }
                                            if (Statics.field883 == null && field640 == null) {
                                                int var360 = class77.field1390;
                                                if (field609) {
                                                    if (var360 != 1) {
                                                        int var361 = class77.field1384;
                                                        int var362 = class77.field1385;
                                                        if (var361 < Statics.field239 - 10 || var361 > Statics.field918 + Statics.field239 + 10 || var362 < Statics.field2315 - 10 || var362 > Statics.field954 + Statics.field2315 + 10) {
                                                            field609 = false;
                                                            method1649(Statics.field239, Statics.field2315, Statics.field918, Statics.field954);
                                                        }
                                                    }
                                                    if (var360 == 1) {
                                                        int var363 = Statics.field239;
                                                        int var364 = Statics.field2315;
                                                        int var365 = Statics.field918;
                                                        int var366 = class77.field1391;
                                                        int var367 = class77.field1398;
                                                        int var368 = -1;
                                                        for (int var369 = 0; var369 < field722; var369++) {
                                                            int var370 = (field722 - 1 - var369) * 15 + var364 + 31;
                                                            if (var366 > var363 && var366 < var363 + var365 && var367 > var370 - 13 && var367 < var370 + 3) {
                                                                var368 = var369;
                                                            }
                                                        }
                                                        if (var368 != -1) {
                                                            method36(var368);
                                                        }
                                                        field609 = false;
                                                        method1649(Statics.field239, Statics.field2315, Statics.field918, Statics.field954);
                                                    }
                                                } else {
                                                    label2818: {
                                                        int var372;
                                                        int var373;
                                                        label2898: {
                                                            if (var360 == 1 && field722 > 0) {
                                                                int var371 = field613[field722 - 1];
                                                                if (var371 == 39 || var371 == 40 || var371 == 41 || var371 == 42 || var371 == 43 || var371 == 33 || var371 == 34 || var371 == 35 || var371 == 36 || var371 == 37 || var371 == 38 || var371 == 1005) {
                                                                    var372 = field547[field722 - 1];
                                                                    var373 = field612[field722 - 1];
                                                                    class158 var374 = class158.method2199(var373);
                                                                    int var375 = method1434(var374);
                                                                    boolean var376 = (var375 >> 28 & 0x1) != 0;
                                                                    if (var376) {
                                                                        break label2898;
                                                                    }
                                                                    int var377 = method1434(var374);
                                                                    boolean var378 = (var377 >> 29 & 0x1) != 0;
                                                                    if (var378) {
                                                                        break label2898;
                                                                    }
                                                                }
                                                            }
                                                            if (var360 == 1 && (field465 == 1 && field722 > 2 || method1650(field722 - 1))) {
                                                                var360 = 2;
                                                            }
                                                            if (var360 == 1 && field722 > 0) {
                                                                method36(field722 - 1);
                                                            }
                                                            if (var360 == 2 && field722 > 0) {
                                                                method206();
                                                            }
                                                            break label2818;
                                                        }
                                                        field611 = false;
                                                        field585 = 0;
                                                        if (Statics.field883 != null) {
                                                            method118(Statics.field883);
                                                        }
                                                        Statics.field883 = class158.method2199(var373);
                                                        field526 = var372;
                                                        field605 = class77.field1391;
                                                        field541 = class77.field1398;
                                                        method118(Statics.field883);
                                                    }
                                                }
                                            }
                                            if (Statics.field228 != var345) {
                                                if (var345 != null) {
                                                    method118(var345);
                                                }
                                                if (Statics.field228 != null) {
                                                    method118(Statics.field228);
                                                }
                                            }
                                            if (Statics.field349 != var346 && field598 == field514) {
                                                if (var346 != null) {
                                                    method118(var346);
                                                }
                                                if (Statics.field349 != null) {
                                                    method118(Statics.field349);
                                                }
                                            }
                                            if (Statics.field349 == null) {
                                                if (field514 > 0) {
                                                    field514--;
                                                }
                                            } else if (field514 < field598) {
                                                field514++;
                                                if (field598 == field514) {
                                                    method118(Statics.field349);
                                                }
                                            }
                                            int var379 = field580 + Statics.field2706.field463;
                                            int var380 = field572 + Statics.field2706.field404;
                                            if (Statics.field1516 - var379 < -500 || Statics.field1516 - var379 > 500 || Statics.field938 - var380 < -500 || Statics.field938 - var380 > 500) {
                                                Statics.field1516 = var379;
                                                Statics.field938 = var380;
                                            }
                                            if (Statics.field1516 != var379) {
                                                Statics.field1516 += (var379 - Statics.field1516) / 16;
                                            }
                                            if (Statics.field938 != var380) {
                                                Statics.field938 += (var380 - Statics.field938) / 16;
                                            }
                                            if (class75.field1340[96]) {
                                                field473 += (-24 - field473) / 2;
                                            } else if (class75.field1340[97]) {
                                                field473 += (24 - field473) / 2;
                                            } else {
                                                field473 /= 2;
                                            }
                                            if (class75.field1340[98]) {
                                                field556 += (12 - field556) / 2;
                                            } else if (class75.field1340[99]) {
                                                field556 += (-12 - field556) / 2;
                                            } else {
                                                field556 /= 2;
                                            }
                                            field724 = field473 / 2 + field724 & 0x7FF;
                                            field553 += field556 / 2;
                                            if (field553 < 128) {
                                                field553 = 128;
                                            }
                                            if (field553 > 383) {
                                                field553 = 383;
                                            }
                                            int var381 = Statics.field1516 >> 7;
                                            int var382 = Statics.field938 >> 7;
                                            int var383 = method1646(Statics.field1516, Statics.field938, Statics.field948);
                                            int var384 = 0;
                                            if (var381 > 3 && var382 > 3 && var381 < 100 && var382 < 100) {
                                                for (int var385 = var381 - 4; var385 <= var381 + 4; var385++) {
                                                    for (int var386 = var382 - 4; var386 <= var382 + 4; var386++) {
                                                        int var387 = Statics.field948;
                                                        if (var387 < 3 && (class9.field129[1][var385][var386] & 0x2) == 2) {
                                                            var387++;
                                                        }
                                                        int var388 = var383 - class9.field126[var387][var385][var386];
                                                        if (var388 > var384) {
                                                            var384 = var388;
                                                        }
                                                    }
                                                }
                                            }
                                            int var389 = var384 * 192;
                                            if (var389 > 98048) {
                                                var389 = 98048;
                                            }
                                            if (var389 < 32768) {
                                                var389 = 32768;
                                            }
                                            if (var389 > field534) {
                                                field534 += (var389 - field534) / 24;
                                            } else if (var389 < field534) {
                                                field534 += (var389 - field534) / 80;
                                            }
                                            if (field716) {
                                                method551();
                                            }
                                            for (int var390 = 0; var390 < 5; var390++) {
                                                var10002 = field538[var390]++;
                                            }
                                            int var391 = ++class77.field1396 - 1;
                                            int var393 = class75.field1365;
                                            if (var391 > 15000 && var393 > 15000) {
                                                field512 = 250;
                                                class77.field1396 = 14500;
                                                field505.method2295(117);
                                            }
                                            field539++;
                                            if (field539 > 500) {
                                                field539 = 0;
                                                int var395 = (int) (Math.random() * 8.0D);
                                                if ((var395 & 0x1) == 1) {
                                                    field580 += field502;
                                                }
                                                if ((var395 & 0x2) == 2) {
                                                    field572 += field554;
                                                }
                                                if ((var395 & 0x4) == 4) {
                                                    field537 += field615;
                                                }
                                            }
                                            if (field580 < -50) {
                                                field502 = 2;
                                            }
                                            if (field580 > 50) {
                                                field502 = -2;
                                            }
                                            if (field572 < -55) {
                                                field554 = 2;
                                            }
                                            if (field572 > 55) {
                                                field554 = -2;
                                            }
                                            if (field537 < -40) {
                                                field615 = 1;
                                            }
                                            if (field537 > 40) {
                                                field615 = -1;
                                            }
                                            field700++;
                                            if (field700 > 500) {
                                                field700 = 0;
                                                int var396 = (int) (Math.random() * 8.0D);
                                                if ((var396 & 0x1) == 1) {
                                                    field540 += field625;
                                                }
                                                if ((var396 & 0x2) == 2) {
                                                    field595 += field543;
                                                }
                                            }
                                            if (field540 < -60) {
                                                field625 = 2;
                                            }
                                            if (field540 > 60) {
                                                field625 = -2;
                                            }
                                            if (field595 < -20) {
                                                field543 = 1;
                                            }
                                            if (field595 > 10) {
                                                field543 = -1;
                                            }
                                            for (class28 var397 = (class28) field719.method3280(); var397 != null; var397 = (class28) field719.method3286()) {
                                                if ((long) var397.field738 < class121.method131() / 1000L - 5L) {
                                                    if (var397.field736 > 0) {
                                                        method1287(5, "", var397.field735 + class134.field2075);
                                                    }
                                                    if (var397.field736 == 0) {
                                                        method1287(5, "", var397.field735 + class134.field2206);
                                                    }
                                                    var397.method3342();
                                                }
                                            }
                                            field542++;
                                            if (field542 > 50) {
                                                field505.method2295(118);
                                            }
                                            try {
                                                if (Statics.field9 != null && field505.field2023 > 0) {
                                                    Statics.field9.method1395(field505.field2028, 0, field505.field2023);
                                                    field505.field2023 = 0;
                                                    field542 = 0;
                                                }
                                            } catch (IOException var399) {
                                                method126();
                                            }
                                            return;
                                        }
                                        var355 = var354.field2;
                                        if (var355.field2573 < 0) {
                                            break;
                                        }
                                        var356 = class158.method2199(var355.field2648);
                                    } while (var356 == null || var356.field2679 == null || var355.field2573 >= var356.field2679.length || var356.field2679[var355.field2573] != var355);
                                    class26.method132(var354);
                                }
                            }
                            var352 = var351.field2;
                            if (var352.field2573 < 0) {
                                break;
                            }
                            var353 = class158.method2199(var352.field2648);
                        } while (var353 == null || var353.field2679 == null || var352.field2573 >= var353.field2679.length || var353.field2679[var352.field2573] != var352);
                        class26.method132(var351);
                    }
                }
                var349 = var348.field2;
                if (var349.field2573 < 0) {
                    break;
                }
                var350 = class158.method2199(var349.field2648);
            } while (var350 == null || var350.field2679 == null || var349.field2573 >= var350.field2679.length || var350.field2679[var349.field2573] != var349);
            class26.method132(var348);
        }
    }

    @ObfuscatedName("ao.q(I)V")
    public static final void method883() {
        if (Statics.field1374 != null) {
            Statics.field1374.method1160();
        }
        if (Statics.field1221 != null) {
            Statics.field1221.method1160();
        }
    }

    @ObfuscatedName("q.c(Lak;IIII)V")
    public static void method198(class34 arg0, int arg1, int arg2, int arg3) {
        if (field710 >= 50 || field709 == 0 || arg0.field873 == null || arg1 >= arg0.field873.length) {
            return;
        }
        int var4 = arg0.field873[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field711[field710] = var5;
        field712[field710] = var6;
        field713[field710] = 0;
        field715[field710] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field647[field710] = (var8 << 16) + (var9 << 8) + var7;
        field710++;
    }

    @ObfuscatedName("e.u(IIII)V")
    public static void method124(int arg0, int arg1, int arg2) {
        if (field708 == 0 || arg1 == 0 || field710 >= 50) {
            return;
        }
        field711[field710] = arg0;
        field712[field710] = arg1;
        field713[field710] = arg2;
        field715[field710] = null;
        field647[field710] = 0;
        field710++;
    }

    @ObfuscatedName("cf.ah(II)V")
    public static void method2093(int arg0) {
        if (arg0 == -1 && !field707) {
            Statics.field1752.method2712();
            class138.field2324 = 1;
            Statics.field2320 = null;
        } else if (arg0 != -1 && field725 != arg0 && field618 != 0 && !field707) {
            class154 var1 = Statics.field652;
            int var2 = field618;
            class138.field2324 = 1;
            Statics.field2320 = var1;
            Statics.field2301 = arg0;
            Statics.field2316 = 0;
            Statics.field1293 = var2;
            Statics.field1454 = false;
            Statics.field1417 = 2;
        }
        field725 = arg0;
    }

    @ObfuscatedName("f.az(III)V")
    public static void method101(int arg0, int arg1) {
        if (field618 != 0 && arg0 != -1) {
            class138.method98(Statics.field1265, arg0, 0, field618, false);
            field707 = true;
        }
    }

    @ObfuscatedName("ah.au(III)V")
    public static final void method232(int arg0, int arg1) {
        if (field704 != 0 && field704 != 3 || class77.field1390 != 1) {
            return;
        }
        int var2 = class77.field1391 - 25 - arg0;
        int var3 = class77.field1398 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field724 + field540 & 0x7FF;
        int var5 = class104.field1778[var4];
        int var6 = class104.field1779[var4];
        int var7 = (field595 + 256) * var5 >> 8;
        int var8 = (field595 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field2706.field463 + var9 >> 7;
        int var12 = Statics.field2706.field404 - var10 >> 7;
        boolean var13 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field505.method2498(var2);
        field505.method2498(var3);
        field505.method2401(field724);
        field505.method2498(57);
        field505.method2498(field540);
        field505.method2498(field595);
        field505.method2498(89);
        field505.method2401(Statics.field2706.field463);
        field505.method2401(Statics.field2706.field404);
        field505.method2498(field528);
        field505.method2498(63);
    }

    @ObfuscatedName("bb.ae(Ljava/lang/String;I)V")
    public static final void method1556(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field2014.field178 = !Statics.field2014.field178;
            class12.method2818();
            if (Statics.field2014.field178) {
                method1287(0, "", "Roofs are now all hidden");
            } else {
                method1287(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field636 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method126();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field464 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field464 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field524[var1].field2748[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field469 == 2) {
                throw new RuntimeException();
            }
        }
        field505.method2295(201);
        field505.method2498(arg0.length() - 1);
        field505.method2465(arg0.substring(2));
    }

    @ObfuscatedName("au.aa(I)V")
    public static final void method551() {
        int var0 = Statics.field1991 * 128 + 64;
        int var1 = Statics.field921 * 128 + 64;
        int var2 = method1646(var0, var1, Statics.field948) - Statics.field2510;
        if (Statics.field330 < var0) {
            Statics.field330 += Statics.field42 * (var0 - Statics.field330) / 1000 + Statics.field393;
            if (Statics.field330 > var0) {
                Statics.field330 = var0;
            }
        }
        if (Statics.field330 > var0) {
            Statics.field330 -= Statics.field42 * (Statics.field330 - var0) / 1000 + Statics.field393;
            if (Statics.field330 < var0) {
                Statics.field330 = var0;
            }
        }
        if (Statics.field1963 < var2) {
            Statics.field1963 += Statics.field42 * (var2 - Statics.field1963) / 1000 + Statics.field393;
            if (Statics.field1963 > var2) {
                Statics.field1963 = var2;
            }
        }
        if (Statics.field1963 > var2) {
            Statics.field1963 -= Statics.field42 * (Statics.field1963 - var2) / 1000 + Statics.field393;
            if (Statics.field1963 < var2) {
                Statics.field1963 = var2;
            }
        }
        if (Statics.field2690 < var1) {
            Statics.field2690 += Statics.field42 * (var1 - Statics.field2690) / 1000 + Statics.field393;
            if (Statics.field2690 > var1) {
                Statics.field2690 = var1;
            }
        }
        if (Statics.field2690 > var1) {
            Statics.field2690 -= Statics.field42 * (Statics.field2690 - var1) / 1000 + Statics.field393;
            if (Statics.field2690 < var1) {
                Statics.field2690 = var1;
            }
        }
        int var3 = Statics.field2705 * 128 + 64;
        int var4 = Statics.field117 * 128 + 64;
        int var5 = method1646(var3, var4, Statics.field948) - Statics.field207;
        int var6 = var3 - Statics.field330;
        int var7 = var5 - Statics.field1963;
        int var8 = var4 - Statics.field2690;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field778 < var10) {
            Statics.field778 += Statics.field1818 * (var10 - Statics.field778) / 1000 + Statics.field360;
            if (Statics.field778 > var10) {
                Statics.field778 = var10;
            }
        }
        if (Statics.field778 > var10) {
            Statics.field778 -= Statics.field1818 * (Statics.field778 - var10) / 1000 + Statics.field360;
            if (Statics.field778 < var10) {
                Statics.field778 = var10;
            }
        }
        int var12 = var11 - Statics.field750;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field750 += Statics.field1818 * var12 / 1000 + Statics.field360;
            Statics.field750 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field750 -= Statics.field1818 * -var12 / 1000 + Statics.field360;
            Statics.field750 &= 0x7FF;
        }
        int var13 = var11 - Statics.field750;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field750 = var11;
        }
    }

    @ObfuscatedName("client.av(I)V")
    public static final void method474() {
        for (int var0 = -1; var0 < field588; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field587[var0];
            }
            class3 var2 = field726[var1];
            if (var2 != null) {
                method103(var2, 1);
            }
        }
    }

    @ObfuscatedName("az.aq(I)V")
    public static final void method538() {
        for (int var0 = 0; var0 < field551; var0++) {
            int var1 = field504[var0];
            class25 var2 = field494[var1];
            if (var2 != null) {
                method103(var2, var2.field374.field772);
            }
        }
    }

    @ObfuscatedName("f.ak(Lah;IB)V")
    public static final void method103(class27 arg0, int arg1) {
        if (arg0.field446 > field476) {
            method2168(arg0);
        } else if (arg0.field447 >= field476) {
            method2166(arg0);
        } else {
            method806(arg0);
        }
        if (arg0.field463 < 128 || arg0.field404 < 128 || arg0.field463 >= 13184 || arg0.field404 >= 13184) {
            arg0.field432 = -1;
            arg0.field437 = -1;
            arg0.field446 = 0;
            arg0.field447 = 0;
            arg0.field463 = arg0.field436[0] * 128 + arg0.field407 * 64;
            arg0.field404 = arg0.field456[0] * 128 + arg0.field407 * 64;
            arg0.method222();
        }
        if (Statics.field2706 == arg0 && (arg0.field463 < 1536 || arg0.field404 < 1536 || arg0.field463 >= 11776 || arg0.field404 >= 11776)) {
            arg0.field432 = -1;
            arg0.field437 = -1;
            arg0.field446 = 0;
            arg0.field447 = 0;
            arg0.field463 = arg0.field436[0] * 128 + arg0.field407 * 64;
            arg0.field404 = arg0.field456[0] * 128 + arg0.field407 * 64;
            arg0.method222();
        }
        if (arg0.field453 != 0) {
            if (arg0.field426 != -1 && arg0.field426 < 32768) {
                class25 var2 = field494[arg0.field426];
                if (var2 != null) {
                    int var3 = arg0.field463 - var2.field463;
                    int var4 = arg0.field404 - var2.field404;
                    if (var3 != 0 || var4 != 0) {
                        arg0.field406 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                    }
                }
            }
            if (arg0.field426 >= 32768) {
                int var5 = arg0.field426 - 32768;
                if (field593 == var5) {
                    var5 = 2047;
                }
                class3 var6 = field726[var5];
                if (var6 != null) {
                    int var7 = arg0.field463 - var6.field463;
                    int var8 = arg0.field404 - var6.field404;
                    if (var7 != 0 || var8 != 0) {
                        arg0.field406 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                    }
                }
            }
            if ((arg0.field454 != 0 || arg0.field433 != 0) && (arg0.field428 == 0 || arg0.field458 > 0)) {
                int var9 = arg0.field463 - (arg0.field454 * 64 - Statics.field80 * 64 - Statics.field80 * 64);
                int var10 = arg0.field404 - (arg0.field433 * 64 - Statics.field377 * 64 - Statics.field377 * 64);
                if (var9 != 0 || var10 != 0) {
                    arg0.field406 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                }
                arg0.field454 = 0;
                arg0.field433 = 0;
            }
            int var11 = arg0.field406 - arg0.field413 & 0x7FF;
            if (var11 == 0) {
                arg0.field403 = 0;
            } else {
                arg0.field403++;
                if (var11 > 1024) {
                    arg0.field413 -= arg0.field453;
                    boolean var12 = true;
                    if (var11 < arg0.field453 || var11 > 2048 - arg0.field453) {
                        arg0.field413 = arg0.field406;
                        var12 = false;
                    }
                    if (arg0.field429 == arg0.field408 && (arg0.field403 > 25 || var12)) {
                        if (arg0.field409 == -1) {
                            arg0.field429 = arg0.field411;
                        } else {
                            arg0.field429 = arg0.field409;
                        }
                    }
                } else {
                    arg0.field413 += arg0.field453;
                    boolean var13 = true;
                    if (var11 < arg0.field453 || var11 > 2048 - arg0.field453) {
                        arg0.field413 = arg0.field406;
                        var13 = false;
                    }
                    if (arg0.field429 == arg0.field408 && (arg0.field403 > 25 || var13)) {
                        if (arg0.field430 == -1) {
                            arg0.field429 = arg0.field411;
                        } else {
                            arg0.field429 = arg0.field430;
                        }
                    }
                }
                arg0.field413 &= 0x7FF;
            }
        }
        arg0.field450 = false;
        if (arg0.field429 != -1) {
            class34 var15 = class34.method1536(arg0.field429);
            if (var15 == null || var15.field870 == null) {
                arg0.field429 = -1;
            } else {
                arg0.field427++;
                if (arg0.field410 < var15.field870.length && arg0.field427 > var15.field872[arg0.field410]) {
                    arg0.field427 = 1;
                    arg0.field410++;
                    method198(var15, arg0.field410, arg0.field463, arg0.field404);
                }
                if (arg0.field410 >= var15.field870.length) {
                    arg0.field427 = 0;
                    arg0.field410 = 0;
                    method198(var15, arg0.field410, arg0.field463, arg0.field404);
                }
            }
        }
        if (arg0.field437 != -1 && field476 >= arg0.field431) {
            if (arg0.field405 < 0) {
                arg0.field405 = 0;
            }
            int var16 = class35.method226(arg0.field437).field893;
            if (var16 == -1) {
                arg0.field437 = -1;
            } else {
                class34 var17 = class34.method1536(var16);
                if (var17 == null || var17.field870 == null) {
                    arg0.field437 = -1;
                } else {
                    arg0.field439++;
                    if (arg0.field405 < var17.field870.length && arg0.field439 > var17.field872[arg0.field405]) {
                        arg0.field439 = 1;
                        arg0.field405++;
                        method198(var17, arg0.field405, arg0.field463, arg0.field404);
                    }
                    if (arg0.field405 >= var17.field870.length && (arg0.field405 < 0 || arg0.field405 >= var17.field870.length)) {
                        arg0.field437 = -1;
                    }
                }
            }
        }
        if (arg0.field432 != -1 && arg0.field435 <= 1) {
            class34 var18 = class34.method1536(arg0.field432);
            if (var18.field881 == 1 && arg0.field459 > 0 && arg0.field446 <= field476 && arg0.field447 < field476) {
                arg0.field435 = 1;
                return;
            }
        }
        if (arg0.field432 != -1 && arg0.field435 == 0) {
            class34 var19 = class34.method1536(arg0.field432);
            if (var19 == null || var19.field870 == null) {
                arg0.field432 = -1;
            } else {
                arg0.field434++;
                if (arg0.field418 < var19.field870.length && arg0.field434 > var19.field872[arg0.field418]) {
                    arg0.field434 = 1;
                    arg0.field418++;
                    method198(var19, arg0.field418, arg0.field463, arg0.field404);
                }
                if (arg0.field418 >= var19.field870.length) {
                    arg0.field418 -= var19.field874;
                    arg0.field438++;
                    if (arg0.field438 >= var19.field880) {
                        arg0.field432 = -1;
                    } else if (arg0.field418 >= 0 && arg0.field418 < var19.field870.length) {
                        method198(var19, arg0.field418, arg0.field463, arg0.field404);
                    } else {
                        arg0.field432 = -1;
                    }
                }
                arg0.field450 = var19.field876;
            }
        }
        if (arg0.field435 > 0) {
            arg0.field435--;
        }
    }

    @ObfuscatedName("dy.ad(Lah;I)V")
    public static final void method2168(class27 arg0) {
        int var1 = arg0.field446 - field476;
        int var2 = arg0.field455 * 128 + arg0.field407 * 64;
        int var3 = arg0.field444 * 128 + arg0.field407 * 64;
        arg0.field463 += (var2 - arg0.field463) / var1;
        arg0.field404 += (var3 - arg0.field404) / var1;
        arg0.field458 = 0;
        if (arg0.field448 == 0) {
            arg0.field406 = 1024;
        }
        if (arg0.field448 == 1) {
            arg0.field406 = 1536;
        }
        if (arg0.field448 == 2) {
            arg0.field406 = 0;
        }
        if (arg0.field448 == 3) {
            arg0.field406 = 512;
        }
    }

    @ObfuscatedName("dy.at(Lah;B)V")
    public static final void method2166(class27 arg0) {
        if (field476 == arg0.field447 || arg0.field432 == -1 || arg0.field435 != 0 || arg0.field434 + 1 > class34.method1536(arg0.field432).field872[arg0.field418]) {
            int var1 = arg0.field447 - arg0.field446;
            int var2 = field476 - arg0.field446;
            int var3 = arg0.field455 * 128 + arg0.field407 * 64;
            int var4 = arg0.field444 * 128 + arg0.field407 * 64;
            int var5 = arg0.field442 * 128 + arg0.field407 * 64;
            int var6 = arg0.field412 * 128 + arg0.field407 * 64;
            arg0.field463 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field404 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field458 = 0;
        if (arg0.field448 == 0) {
            arg0.field406 = 1024;
        }
        if (arg0.field448 == 1) {
            arg0.field406 = 1536;
        }
        if (arg0.field448 == 2) {
            arg0.field406 = 0;
        }
        if (arg0.field448 == 3) {
            arg0.field406 = 512;
        }
        arg0.field413 = arg0.field406;
    }

    @ObfuscatedName("aw.an(Lah;S)V")
    public static final void method806(class27 arg0) {
        arg0.field429 = arg0.field408;
        if (arg0.field428 == 0) {
            arg0.field458 = 0;
            return;
        }
        if (arg0.field432 != -1 && arg0.field435 == 0) {
            class34 var1 = class34.method1536(arg0.field432);
            if (arg0.field459 > 0 && var1.field881 == 0) {
                arg0.field458++;
                return;
            }
            if (arg0.field459 <= 0 && var1.field865 == 0) {
                arg0.field458++;
                return;
            }
        }
        int var2 = arg0.field463;
        int var3 = arg0.field404;
        int var4 = arg0.field436[arg0.field428 - 1] * 128 + arg0.field407 * 64;
        int var5 = arg0.field456[arg0.field428 - 1] * 128 + arg0.field407 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field463 = var4;
            arg0.field404 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field406 = 1280;
            } else if (var3 > var5) {
                arg0.field406 = 1792;
            } else {
                arg0.field406 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field406 = 768;
            } else if (var3 > var5) {
                arg0.field406 = 256;
            } else {
                arg0.field406 = 512;
            }
        } else if (var3 < var5) {
            arg0.field406 = 1024;
        } else if (var3 > var5) {
            arg0.field406 = 0;
        }
        int var6 = arg0.field406 - arg0.field413 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field451;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field411;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field423;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field445;
        }
        if (var7 == -1) {
            var7 = arg0.field411;
        }
        arg0.field429 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field374.field776;
        }
        if (var9) {
            if (arg0.field413 != arg0.field406 && arg0.field426 == -1 && arg0.field453 != 0) {
                var8 = 2;
            }
            if (arg0.field428 > 2) {
                var8 = 6;
            }
            if (arg0.field428 > 3) {
                var8 = 8;
            }
            if (arg0.field458 > 0 && arg0.field428 > 1) {
                var8 = 8;
                arg0.field458--;
            }
        } else {
            if (arg0.field428 > 1) {
                var8 = 6;
            }
            if (arg0.field428 > 2) {
                var8 = 8;
            }
            if (arg0.field458 > 0 && arg0.field428 > 1) {
                var8 = 8;
                arg0.field458--;
            }
        }
        if (arg0.field457[arg0.field428 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field429 == arg0.field411 && arg0.field415 != -1) {
            arg0.field429 = arg0.field415;
        }
        if (var2 < var4) {
            arg0.field463 += var8;
            if (arg0.field463 > var4) {
                arg0.field463 = var4;
            }
        } else if (var2 > var4) {
            arg0.field463 -= var8;
            if (arg0.field463 < var4) {
                arg0.field463 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field404 += var8;
            if (arg0.field404 > var5) {
                arg0.field404 = var5;
            }
        } else if (var3 > var5) {
            arg0.field404 -= var8;
            if (arg0.field404 < var5) {
                arg0.field404 = var5;
            }
        }
        if (arg0.field463 == var4 && arg0.field404 == var5) {
            arg0.field428--;
            if (arg0.field459 > 0) {
                arg0.field459--;
            }
        }
    }

    @ObfuscatedName("q.aw(Lv;III)V")
    public static void method201(class3 arg0, int arg1, int arg2) {
        if (arg0.field432 == arg1 && arg1 != -1) {
            int var3 = class34.method1536(arg1).field884;
            if (var3 == 1) {
                arg0.field418 = 0;
                arg0.field434 = 0;
                arg0.field435 = arg2;
                arg0.field438 = 0;
            }
            if (var3 == 2) {
                arg0.field438 = 0;
            }
        } else if (arg1 == -1 || arg0.field432 == -1 || class34.method1536(arg1).field875 >= class34.method1536(arg0.field432).field875) {
            arg0.field432 = arg1;
            arg0.field418 = 0;
            arg0.field434 = 0;
            arg0.field435 = arg2;
            arg0.field438 = 0;
            arg0.field459 = arg0.field428;
        }
    }

    @ObfuscatedName("c.am(Ljava/lang/String;ZB)V")
    public static final void method207(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2345.method3447(arg0, 250);
        int var6 = Statics.field2345.method3400(arg0, 250) * 13;
        class89.method1819(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1775(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2345.method3446(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1649(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2330.getGraphics();
                Statics.field2704.method1587(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2330.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field670; var13++) {
            if (field677[var13] + field675[var13] > var9 && field675[var13] < var9 + var11 && field678[var13] + field676[var13] > var10 && field676[var13] < var10 + var12) {
                field673[var13] = true;
            }
        }
    }

    @ObfuscatedName("ak.af(ZI)V")
    public static final void method735(boolean arg0) {
        if (Statics.field2706.field463 >> 7 == field702 && Statics.field2706.field404 >> 7 == field703) {
            field702 = 0;
        }
        int var1 = field588;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2706;
                var4 = 33538048;
            } else {
                var3 = field726[field587[var2]];
                var4 = field587[var2] << 14;
            }
            if (var3 != null && var3.method20()) {
                var3.field53 = false;
                if ((field472 && field588 > 50 || field588 > 200) && !arg0 && var3.field429 == var3.field408) {
                    var3.field53 = true;
                }
                int var5 = var3.field463 >> 7;
                int var6 = var3.field404 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field48 == null || field476 < var3.field36 || field476 >= var3.field44) {
                        if ((var3.field463 & 0x7F) == 64 && (var3.field404 & 0x7F) == 64) {
                            if (field571 == field579[var5][var6]) {
                                continue;
                            }
                            field579[var5][var6] = field571;
                        }
                        var3.field41 = method1646(var3.field463, var3.field404, Statics.field948);
                        Statics.field1510.method1999(Statics.field948, var3.field463, var3.field404, var3.field41, 60, var3, var3.field413, var4, var3.field450);
                    } else {
                        var3.field53 = false;
                        var3.field41 = method1646(var3.field463, var3.field404, Statics.field948);
                        Statics.field1510.method1862(Statics.field948, var3.field463, var3.field404, var3.field41, 60, var3, var3.field413, var4, var3.field49, var3.field43, var3.field55, var3.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("du.as(ZI)V")
    public static final void method2643(boolean arg0) {
        for (int var1 = 0; var1 < field551; var1++) {
            class25 var2 = field494[field504[var1]];
            int var3 = (field504[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field374.field791 == arg0 && var2.field374.method604()) {
                int var4 = var2.field463 >> 7;
                int var5 = var2.field404 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field407 == 1 && (var2.field463 & 0x7F) == 64 && (var2.field404 & 0x7F) == 64) {
                        if (field571 == field579[var4][var5]) {
                            continue;
                        }
                        field579[var4][var5] = field571;
                    }
                    if (!var2.field374.field799) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1510.method1999(Statics.field948, var2.field463, var2.field404, method1646(var2.field463 + (var2.field407 * 64 - 64), var2.field404 + (var2.field407 * 64 - 64), Statics.field948), var2.field407 * 64 - 64 + 60, var2, var2.field413, var3, var2.field450);
                }
            }
        }
    }

    @ObfuscatedName("u.ao(I)V")
    public static final void method214() {
        for (class10 var0 = (class10) field603.method3321(); var0 != null; var0 = (class10) field603.method3323()) {
            if (Statics.field948 != var0.field138 || field476 > var0.field150) {
                var0.method3346();
            } else if (field476 >= var0.field143) {
                if (var0.field142 > 0) {
                    class25 var1 = field494[var0.field142 - 1];
                    if (var1 != null && var1.field463 >= 0 && var1.field463 < 13312 && var1.field404 >= 0 && var1.field404 < 13312) {
                        var0.method89(var1.field463, var1.field404, method1646(var1.field463, var1.field404, var0.field138) - var0.field137, field476);
                    }
                }
                if (var0.field142 < 0) {
                    int var2 = -var0.field142 - 1;
                    class3 var3;
                    if (field593 == var2) {
                        var3 = Statics.field2706;
                    } else {
                        var3 = field726[var2];
                    }
                    if (var3 != null && var3.field463 >= 0 && var3.field463 < 13312 && var3.field404 >= 0 && var3.field404 < 13312) {
                        var0.method89(var3.field463, var3.field404, method1646(var3.field463, var3.field404, var0.field138) - var0.field137, field476);
                    }
                }
                var0.method93(field545);
                Statics.field1510.method1999(Statics.field948, (int) var0.field149, (int) var0.field154, (int) var0.field158, 60, var0, var0.field157, -1, false);
            }
        }
    }

    @ObfuscatedName("r.ab(I)V")
    public static final void method35() {
        for (class20 var0 = (class20) field604.method3321(); var0 != null; var0 = (class20) field604.method3323()) {
            if (Statics.field948 != var0.field276 || var0.field283) {
                var0.method3346();
            } else if (field476 >= var0.field275) {
                var0.method151(field545);
                if (var0.field283) {
                    var0.method3346();
                } else {
                    Statics.field1510.method1999(var0.field276, var0.field277, var0.field278, var0.field279, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("af.ay(S)I")
    public static final int method859() {
        if (Statics.field2014.field178) {
            return Statics.field948;
        } else {
            int var0 = method1646(Statics.field330, Statics.field2690, Statics.field948);
            return var0 - Statics.field1963 >= 800 || (class9.field129[Statics.field948][Statics.field330 >> 7][Statics.field2690 >> 7] & 0x4) == 0 ? 3 : Statics.field948;
        }
    }

    @ObfuscatedName("by.ar(III)V")
    public static final void method1323(int arg0, int arg1) {
        if (field484 == 2) {
            method208((field487 - Statics.field80 << 7) + field490, (field488 - Statics.field377 << 7) + field536, field489 * 2);
            if (field589 > -1 && field476 % 20 < 10) {
                Statics.field1463[0].method1663(field589 + arg0 - 12, field681 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ew.aj(IIIII)V")
    public static final void method2881(int arg0, int arg1, int arg2, int arg3) {
        field565 = 0;
        for (int var4 = -1; var4 < field588 + field551; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field2706;
            } else if (var4 < field588) {
                var5 = field726[field587[var4]];
            } else {
                var5 = field494[field504[var4 - field588]];
            }
            if (var5 != null && var5.method20()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field374;
                    if (var6.field796 != null) {
                        var6 = var6.method610();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field588) {
                    class31 var9 = ((class25) var5).field374;
                    if (var9.field796 != null) {
                        var9 = var9.method610();
                    }
                    if (var9.field779 >= 0 && var9.field779 < Statics.field1548.length) {
                        method782(var5, var5.field452 + 15);
                        if (field589 > -1) {
                            Statics.field1548[var9.field779].method1663(field589 + arg0 - 12, field681 + arg1 - 30);
                        }
                    }
                    if (field484 == 1 && field485 == field504[var4 - field588] && field476 % 20 < 10) {
                        method782(var5, var5.field452 + 15);
                        if (field589 > -1) {
                            Statics.field1463[0].method1663(field589 + arg0 - 12, field681 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field51 != -1 || var8.field37 != -1) {
                        method782(var5, var5.field452 + 15);
                        if (field589 > -1) {
                            if (var8.field51 != -1) {
                                Statics.field1753[var8.field51].method1663(field589 + arg0 - 12, field681 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field37 != -1) {
                                Statics.field1548[var8.field37].method1663(field589 + arg0 - 12, field681 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field484 == 10 && field486 == field587[var4]) {
                        method782(var5, var5.field452 + 15);
                        if (field589 > -1) {
                            Statics.field1463[1].method1663(field589 + arg0 - 12, field681 + arg1 - var7);
                        }
                    }
                }
                if (var5.field416 != null) {
                    label326: {
                        if (var4 < field588 && field686 != 0 && field686 != 3) {
                            if (field686 != 1) {
                                break label326;
                            }
                            String var10 = ((class3) var5).field50;
                            boolean var11;
                            if (var10 == null) {
                                var11 = false;
                            } else {
                                String var12 = class148.method595(var10, Statics.field470);
                                int var13 = 0;
                                while (true) {
                                    if (var13 >= field723) {
                                        if (var10.equalsIgnoreCase(class148.method595(Statics.field2706.field50, Statics.field470))) {
                                            var11 = true;
                                        } else {
                                            var11 = false;
                                        }
                                        break;
                                    }
                                    if (var12.equalsIgnoreCase(class148.method595(field518[var13].field358, Statics.field470))) {
                                        var11 = true;
                                        break;
                                    }
                                    var13++;
                                }
                            }
                            if (!var11) {
                                break label326;
                            }
                        }
                        method782(var5, var5.field452);
                        if (field589 > -1 && field565 < field561) {
                            field467[field565] = Statics.field1026.method3465(var5.field416) / 2;
                            field583[field565] = Statics.field1026.field2841;
                            field643[field565] = field589;
                            field563[field565] = field681;
                            field566[field565] = var5.field440;
                            field567[field565] = var5.field419;
                            field568[field565] = var5.field417;
                            field658[field565] = var5.field416;
                            field565++;
                        }
                    }
                }
                if (var5.field443 > field476) {
                    method782(var5, var5.field452 + 15);
                    if (field589 > -1) {
                        int var14 = var5.field424 * 30 / var5.field425;
                        if (var14 > 30) {
                            var14 = 30;
                        }
                        class89.method1819(field589 + arg0 - 15, field681 + arg1 - 3, var14, 5, 65280);
                        class89.method1819(field589 + arg0 - 15 + var14, field681 + arg1 - 3, 30 - var14, 5, 16711680);
                    }
                }
                for (int var15 = 0; var15 < 4; var15++) {
                    if (var5.field422[var15] > field476) {
                        method782(var5, var5.field452 / 2);
                        if (field589 > -1) {
                            if (var15 == 1) {
                                field681 -= 20;
                            }
                            if (var15 == 2) {
                                field589 -= 15;
                                field681 -= 10;
                            }
                            if (var15 == 3) {
                                field589 += 15;
                                field681 -= 10;
                            }
                            Statics.field1172[var5.field421[var15]].method1663(field589 + arg0 - 12, field681 + arg1 - 12);
                            Statics.field496.method3433(Integer.toString(var5.field420[var15]), field589 + arg0 - 1, field681 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var16 = 0; var16 < field565; var16++) {
            int var17 = field643[var16];
            int var18 = field563[var16];
            int var19 = field467[var16];
            int var20 = field583[var16];
            boolean var21 = true;
            while (var21) {
                var21 = false;
                for (int var22 = 0; var22 < var16; var22++) {
                    if (var18 + 2 > field563[var22] - field583[var22] && var18 - var20 < field563[var22] + 2 && var17 - var19 < field643[var22] + field467[var22] && var17 + var19 > field643[var22] - field467[var22] && field563[var22] - field583[var22] < var18) {
                        var18 = field563[var22] - field583[var22];
                        var21 = true;
                    }
                }
            }
            field589 = field643[var16];
            field681 = field563[var16] = var18;
            String var23 = field658[var16];
            if (field631 == 0) {
                int var24 = 16776960;
                if (field566[var16] < 6) {
                    var24 = field685[field566[var16]];
                }
                if (field566[var16] == 6) {
                    var24 = field571 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field566[var16] == 7) {
                    var24 = field571 % 20 < 10 ? 255 : 65535;
                }
                if (field566[var16] == 8) {
                    var24 = field571 % 20 < 10 ? 45056 : 8454016;
                }
                if (field566[var16] == 9) {
                    int var25 = 150 - field568[var16];
                    if (var25 < 50) {
                        var24 = var25 * 1280 + 16711680;
                    } else if (var25 < 100) {
                        var24 = 16776960 - (var25 - 50) * 327680;
                    } else if (var25 < 150) {
                        var24 = (var25 - 100) * 5 + 65280;
                    }
                }
                if (field566[var16] == 10) {
                    int var26 = 150 - field568[var16];
                    if (var26 < 50) {
                        var24 = var26 * 5 + 16711680;
                    } else if (var26 < 100) {
                        var24 = 16711935 - (var26 - 50) * 327680;
                    } else if (var26 < 150) {
                        var24 = (var26 - 100) * 327680 + 255 - (var26 - 100) * 5;
                    }
                }
                if (field566[var16] == 11) {
                    int var27 = 150 - field568[var16];
                    if (var27 < 50) {
                        var24 = 16777215 - var27 * 327685;
                    } else if (var27 < 100) {
                        var24 = (var27 - 50) * 327685 + 65280;
                    } else if (var27 < 150) {
                        var24 = 16777215 - (var27 - 100) * 327680;
                    }
                }
                if (field567[var16] == 0) {
                    Statics.field1026.method3433(var23, field589 + arg0, field681 + arg1, var24, 0);
                }
                if (field567[var16] == 1) {
                    Statics.field1026.method3392(var23, field589 + arg0, field681 + arg1, var24, 0, field571);
                }
                if (field567[var16] == 2) {
                    Statics.field1026.method3415(var23, field589 + arg0, field681 + arg1, var24, 0, field571);
                }
                if (field567[var16] == 3) {
                    Statics.field1026.method3436(var23, field589 + arg0, field681 + arg1, var24, 0, field571, 150 - field568[var16]);
                }
                if (field567[var16] == 4) {
                    int var28 = (150 - field568[var16]) * (Statics.field1026.method3465(var23) + 100) / 150;
                    class89.method1768(field589 + arg0 - 50, arg1, field589 + arg0 + 50, arg1 + arg3);
                    Statics.field1026.method3390(var23, field589 + arg0 + 50 - var28, field681 + arg1, var24, 0);
                    class89.method1799(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field567[var16] == 5) {
                    int var29 = 150 - field568[var16];
                    int var30 = 0;
                    if (var29 < 25) {
                        var30 = var29 - 25;
                    } else if (var29 > 125) {
                        var30 = var29 - 125;
                    }
                    class89.method1768(arg0, field681 + arg1 - Statics.field1026.field2841 - 1, arg0 + arg2, field681 + arg1 + 5);
                    Statics.field1026.method3433(var23, field589 + arg0, field681 + arg1 + var30, var24, 0);
                    class89.method1799(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1026.method3433(var23, field589 + arg0, field681 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("at.ai(Lah;II)V")
    public static final void method782(class27 arg0, int arg1) {
        method208(arg0.field463, arg0.field404, arg1);
    }

    @ObfuscatedName("c.ax(IIIB)V")
    public static final void method208(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field589 = -1;
            field681 = -1;
            return;
        }
        int var3 = method1646(arg0, arg1, Statics.field948) - arg2;
        int var4 = arg0 - Statics.field330;
        int var5 = var3 - Statics.field1963;
        int var6 = arg1 - Statics.field2690;
        int var7 = class104.field1778[Statics.field778];
        int var8 = class104.field1779[Statics.field778];
        int var9 = class104.field1778[Statics.field750];
        int var10 = class104.field1779[Statics.field750];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field589 = (var11 << 9) / var15 + 256;
            field681 = (var14 << 9) / var15 + 167;
        } else {
            field589 = -1;
            field681 = -1;
        }
    }

    @ObfuscatedName("ce.al(IIII)I")
    public static final int method1646(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field129[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field126[var5][var3][var4] + class9.field126[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field126[var5][var3][var4 + 1] + class9.field126[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("as.ag(ZI)V")
    public static final void method874(boolean arg0) {
        field525 = arg0;
        if (!field525) {
            int var1 = field570.method2447();
            int var2 = (field508 - field570.field2023) / 16;
            Statics.field110 = new int[var2][4];
            for (int var3 = 0; var3 < var2; var3++) {
                for (int var4 = 0; var4 < 4; var4++) {
                    Statics.field110[var3][var4] = field570.method2536();
                }
            }
            int var5 = field570.method2419();
            int var6 = field570.method2416();
            int var7 = field570.method2414();
            int var8 = field570.method2416();
            Statics.field1675 = new int[var2];
            Statics.field191 = new int[var2];
            Statics.field1409 = new int[var2];
            Statics.field128 = new byte[var2][];
            Statics.field187 = new byte[var2][];
            boolean var9 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var1 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var1 - 6) / 8; var11 <= (var1 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1675[var10] = var13;
                        Statics.field191[var10] = Statics.field190.method3015("m" + var11 + "_" + var12);
                        Statics.field1409[var10] = Statics.field190.method3015("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method95(var1, var6, var7, var8, var5);
            return;
        }
        int var14 = field570.method2438();
        field570.method2308();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field570.method2291(1);
                    if (var18 == 1) {
                        field630[var15][var16][var17] = field570.method2291(26);
                    } else {
                        field630[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field570.method2293();
        int var19 = (field508 - field570.field2023) / 16;
        Statics.field110 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field110[var20][var21] = field570.method2430();
            }
        }
        int var22 = field570.method2447();
        int var23 = field570.method2447();
        int var24 = field570.method2447();
        int var25 = field570.method2493();
        Statics.field1675 = new int[var19];
        Statics.field191 = new int[var19];
        Statics.field1409 = new int[var19];
        Statics.field128 = new byte[var19][];
        Statics.field187 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field630[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1675[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1675[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field191[var26] = Statics.field190.method3015("m" + var35 + "_" + var36);
                            Statics.field1409[var26] = Statics.field190.method3015("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method95(var22, var24, var14, var25, var23);
    }

    @ObfuscatedName("t.ap(IIIIII)V")
    public static final void method95(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field227 == arg0 && Statics.field1379 == arg1 && field562 == arg2 || !field472) {
            return;
        }
        Statics.field227 = arg0;
        Statics.field1379 = arg1;
        field562 = arg2;
        if (!field472) {
            field562 = 0;
        }
        method541(25);
        method207(class134.field2266, true);
        int var5 = Statics.field80;
        int var6 = Statics.field377;
        Statics.field80 = (arg0 - 6) * 8;
        Statics.field377 = (arg1 - 6) * 8;
        int var7 = Statics.field80 - var5;
        int var8 = Statics.field377 - var6;
        int var9 = Statics.field80;
        int var10 = Statics.field377;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field494[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field436[var13] -= var7;
                    var12.field456[var13] -= var8;
                }
                var12.field463 -= var7 * 128;
                var12.field404 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field726[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field436[var16] -= var7;
                    var15.field456[var16] -= var8;
                }
                var15.field463 -= var7 * 128;
                var15.field404 -= var8 * 128;
            }
        }
        Statics.field948 = arg2;
        Statics.field2706.method220(arg3, arg4, false);
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
                        field687[var27][var23][var24] = field687[var27][var25][var26];
                    } else {
                        field687[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field602.method3321(); var28 != null; var28 = (class22) field602.method3323()) {
            var28.field333 -= var7;
            var28.field334 -= var8;
            if (var28.field333 < 0 || var28.field334 < 0 || var28.field333 >= 104 || var28.field334 >= 104) {
                var28.method3346();
            }
        }
        if (field702 != 0) {
            field702 -= var7;
            field703 -= var8;
        }
        field710 = 0;
        field716 = false;
        field697 = -1;
        field604.method3315();
        field603.method3315();
    }

    @ObfuscatedName("i.ac(ZS)V")
    public static final void method46(boolean arg0) {
        method883();
        field542++;
        if (field542 < 50 && !arg0) {
            return;
        }
        field542 = 0;
        if (field503 || Statics.field9 == null) {
            return;
        }
        field505.method2295(118);
        try {
            Statics.field9.method1395(field505.field2028, 0, field505.field2023);
            field505.field2023 = 0;
        } catch (IOException var2) {
            field503 = true;
        }
    }

    @ObfuscatedName("ep.bp(B)V")
    public static final void method2657() {
        method46(false);
        field597 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field128.length; var1++) {
            if (Statics.field191[var1] != -1 && Statics.field128[var1] == null) {
                Statics.field128[var1] = Statics.field190.method2968(Statics.field191[var1], 0);
                if (Statics.field128[var1] == null) {
                    var0 = false;
                    field597++;
                }
            }
            if (Statics.field1409[var1] != -1 && Statics.field187[var1] == null) {
                Statics.field187[var1] = Statics.field190.method2969(Statics.field1409[var1], 0, Statics.field110[var1]);
                if (Statics.field187[var1] == null) {
                    var0 = false;
                    field597++;
                }
            }
        }
        if (!var0) {
            field507 = 1;
            return;
        }
        field521 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field128.length; var3++) {
            byte[] var4 = Statics.field187[var3];
            if (var4 != null) {
                int var5 = (Statics.field1675[var3] >> 8) * 64 - Statics.field80;
                int var6 = (Statics.field1675[var3] & 0xFF) * 64 - Statics.field377;
                if (field525) {
                    var5 = 10;
                    var6 = 10;
                }
                boolean var8 = true;
                class127 var9 = new class127(var4);
                int var10 = -1;
                label1234: while (true) {
                    int var11 = var9.method2427();
                    if (var11 == 0) {
                        var2 &= var8;
                        break;
                    }
                    var10 += var11;
                    int var13 = 0;
                    boolean var14 = false;
                    while (true) {
                        while (!var14) {
                            int var16 = var9.method2427();
                            if (var16 == 0) {
                                continue label1234;
                            }
                            var13 += var16 - 1;
                            int var17 = var13 & 0x3F;
                            int var18 = var13 >> 6 & 0x3F;
                            int var19 = var9.method2414() >> 2;
                            int var20 = var5 + var18;
                            int var21 = var6 + var17;
                            if (var20 > 0 && var21 > 0 && var20 < 103 && var21 < 103) {
                                class32 var22 = class32.method54(var10);
                                if (var19 != 22 || !field472 || var22.field823 != 0 || var22.field833 == 1 || var22.field855) {
                                    if (!var22.method633()) {
                                        field521++;
                                        var8 = false;
                                    }
                                    var14 = true;
                                }
                            }
                        }
                        int var15 = var9.method2427();
                        if (var15 == 0) {
                            break;
                        }
                        var9.method2414();
                    }
                }
            }
        }
        if (!var2) {
            field507 = 2;
            return;
        }
        if (field507 != 0) {
            method207(class134.field2266 + class2.field26 + class2.field31 + 100 + "%" + class2.field24, true);
        }
        method883();
        method2923();
        method883();
        Statics.field1510.method1850();
        method883();
        System.gc();
        for (int var23 = 0; var23 < 4; var23++) {
            field524[var23].method3231();
        }
        for (int var24 = 0; var24 < 4; var24++) {
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class9.field129[var24][var25][var26] = 0;
                }
            }
        }
        method883();
        class9.field115 = 99;
        Statics.field375 = new byte[4][104][104];
        Statics.field121 = new byte[4][104][104];
        Statics.field1298 = new byte[4][104][104];
        Statics.field244 = new byte[4][104][104];
        Statics.field59 = new int[4][105][105];
        Statics.field2304 = new byte[4][105][105];
        Statics.field1984 = new int[105][105];
        Statics.field737 = new int[104];
        Statics.field967 = new int[104];
        Statics.field2832 = new int[104];
        Statics.field2789 = new int[104];
        Statics.field389 = new int[104];
        int var27 = Statics.field128.length;
        class7.method1847();
        method46(true);
        if (!field525) {
            for (int var28 = 0; var28 < var27; var28++) {
                int var29 = (Statics.field1675[var28] >> 8) * 64 - Statics.field80;
                int var30 = (Statics.field1675[var28] & 0xFF) * 64 - Statics.field377;
                byte[] var31 = Statics.field128[var28];
                if (var31 != null) {
                    method883();
                    int var32 = Statics.field227 * 8 - 48;
                    int var33 = Statics.field1379 * 8 - 48;
                    class164[] var34 = field524;
                    for (int var35 = 0; var35 < 4; var35++) {
                        for (int var36 = 0; var36 < 64; var36++) {
                            for (int var37 = 0; var37 < 64; var37++) {
                                if (var29 + var36 > 0 && var29 + var36 < 103 && var30 + var37 > 0 && var30 + var37 < 103) {
                                    var34[var35].field2748[var29 + var36][var30 + var37] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var38 = new class127(var31);
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 64; var40++) {
                            for (int var41 = 0; var41 < 64; var41++) {
                                class9.method123(var38, var39, var29 + var40, var30 + var41, var32, var33, 0);
                            }
                        }
                    }
                }
            }
            for (int var42 = 0; var42 < var27; var42++) {
                int var43 = (Statics.field1675[var42] >> 8) * 64 - Statics.field80;
                int var44 = (Statics.field1675[var42] & 0xFF) * 64 - Statics.field377;
                byte[] var45 = Statics.field128[var42];
                if (var45 == null && Statics.field1379 < 800) {
                    method883();
                    class9.method2183(var43, var44, 64, 64);
                }
            }
            method46(true);
            for (int var46 = 0; var46 < var27; var46++) {
                byte[] var47 = Statics.field187[var46];
                if (var47 != null) {
                    int var48 = (Statics.field1675[var46] >> 8) * 64 - Statics.field80;
                    int var49 = (Statics.field1675[var46] & 0xFF) * 64 - Statics.field377;
                    method883();
                    class95 var50 = Statics.field1510;
                    class164[] var51 = field524;
                    class127 var52 = new class127(var47);
                    int var53 = -1;
                    while (true) {
                        int var54 = var52.method2427();
                        if (var54 == 0) {
                            break;
                        }
                        var53 += var54;
                        int var55 = 0;
                        while (true) {
                            int var56 = var52.method2427();
                            if (var56 == 0) {
                                break;
                            }
                            var55 += var56 - 1;
                            int var57 = var55 & 0x3F;
                            int var58 = var55 >> 6 & 0x3F;
                            int var59 = var55 >> 12;
                            int var60 = var52.method2414();
                            int var61 = var60 >> 2;
                            int var62 = var60 & 0x3;
                            int var63 = var48 + var58;
                            int var64 = var49 + var57;
                            if (var63 > 0 && var64 > 0 && var63 < 103 && var64 < 103) {
                                int var65 = var59;
                                if ((class9.field129[1][var63][var64] & 0x2) == 2) {
                                    var65 = var59 - 1;
                                }
                                class164 var66 = null;
                                if (var65 >= 0) {
                                    var66 = var51[var65];
                                }
                                class9.method1568(var59, var63, var64, var53, var62, var61, var50, var66);
                            }
                        }
                    }
                }
            }
        }
        if (field525) {
            for (int var67 = 0; var67 < 4; var67++) {
                method883();
                for (int var68 = 0; var68 < 13; var68++) {
                    for (int var69 = 0; var69 < 13; var69++) {
                        boolean var70 = false;
                        int var71 = field630[var67][var68][var69];
                        if (var71 != -1) {
                            int var72 = var71 >> 24 & 0x3;
                            int var73 = var71 >> 1 & 0x3;
                            int var74 = var71 >> 14 & 0x3FF;
                            int var75 = var71 >> 3 & 0x7FF;
                            int var76 = (var74 / 8 << 8) + var75 / 8;
                            for (int var77 = 0; var77 < Statics.field1675.length; var77++) {
                                if (Statics.field1675[var77] == var76 && Statics.field128[var77] != null) {
                                    byte[] var78 = Statics.field128[var77];
                                    int var79 = var68 * 8;
                                    int var80 = var69 * 8;
                                    int var81 = (var74 & 0x7) * 8;
                                    int var82 = (var75 & 0x7) * 8;
                                    class164[] var83 = field524;
                                    for (int var84 = 0; var84 < 8; var84++) {
                                        for (int var85 = 0; var85 < 8; var85++) {
                                            if (var79 + var84 > 0 && var79 + var84 < 103 && var80 + var85 > 0 && var80 + var85 < 103) {
                                                var83[var67].field2748[var79 + var84][var80 + var85] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class127 var86 = new class127(var78);
                                    for (int var87 = 0; var87 < 4; var87++) {
                                        for (int var88 = 0; var88 < 64; var88++) {
                                            for (int var89 = 0; var89 < 64; var89++) {
                                                if (var72 == var87 && var88 >= var81 && var88 < var81 + 8 && var89 >= var82 && var89 < var82 + 8) {
                                                    int var92 = var79 + class160.method596(var88 & 0x7, var89 & 0x7, var73);
                                                    int var94 = var88 & 0x7;
                                                    int var95 = var89 & 0x7;
                                                    int var97 = var73 & 0x3;
                                                    int var98;
                                                    if (var97 == 0) {
                                                        var98 = var95;
                                                    } else if (var97 == 1) {
                                                        var98 = 7 - var94;
                                                    } else if (var97 == 2) {
                                                        var98 = 7 - var95;
                                                    } else {
                                                        var98 = var94;
                                                    }
                                                    class9.method123(var86, var67, var92, var80 + var98, 0, 0, var73);
                                                } else {
                                                    class9.method123(var86, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var70 = true;
                                    break;
                                }
                            }
                        }
                        if (!var70) {
                            int var99 = var67;
                            int var100 = var68 * 8;
                            int var101 = var69 * 8;
                            for (int var102 = 0; var102 < 8; var102++) {
                                for (int var103 = 0; var103 < 8; var103++) {
                                    class9.field126[var99][var100 + var102][var101 + var103] = 0;
                                }
                            }
                            if (var100 > 0) {
                                for (int var104 = 1; var104 < 8; var104++) {
                                    class9.field126[var99][var100][var101 + var104] = class9.field126[var99][var100 - 1][var101 + var104];
                                }
                            }
                            if (var101 > 0) {
                                for (int var105 = 1; var105 < 8; var105++) {
                                    class9.field126[var99][var100 + var105][var101] = class9.field126[var99][var100 + var105][var101 - 1];
                                }
                            }
                            if (var100 > 0 && class9.field126[var99][var100 - 1][var101] != 0) {
                                class9.field126[var99][var100][var101] = class9.field126[var99][var100 - 1][var101];
                            } else if (var101 > 0 && class9.field126[var99][var100][var101 - 1] != 0) {
                                class9.field126[var99][var100][var101] = class9.field126[var99][var100][var101 - 1];
                            } else if (var100 > 0 && var101 > 0 && class9.field126[var99][var100 - 1][var101 - 1] != 0) {
                                class9.field126[var99][var100][var101] = class9.field126[var99][var100 - 1][var101 - 1];
                            }
                        }
                    }
                }
            }
            for (int var106 = 0; var106 < 13; var106++) {
                for (int var107 = 0; var107 < 13; var107++) {
                    int var108 = field630[0][var106][var107];
                    if (var108 == -1) {
                        class9.method2183(var106 * 8, var107 * 8, 8, 8);
                    }
                }
            }
            method46(true);
            for (int var109 = 0; var109 < 4; var109++) {
                method883();
                for (int var110 = 0; var110 < 13; var110++) {
                    label992: for (int var111 = 0; var111 < 13; var111++) {
                        int var112 = field630[var109][var110][var111];
                        if (var112 != -1) {
                            int var113 = var112 >> 24 & 0x3;
                            int var114 = var112 >> 1 & 0x3;
                            int var115 = var112 >> 14 & 0x3FF;
                            int var116 = var112 >> 3 & 0x7FF;
                            int var117 = (var115 / 8 << 8) + var116 / 8;
                            for (int var118 = 0; var118 < Statics.field1675.length; var118++) {
                                if (Statics.field1675[var118] == var117 && Statics.field187[var118] != null) {
                                    byte[] var119 = Statics.field187[var118];
                                    int var120 = var110 * 8;
                                    int var121 = var111 * 8;
                                    int var122 = (var115 & 0x7) * 8;
                                    int var123 = (var116 & 0x7) * 8;
                                    class95 var124 = Statics.field1510;
                                    class164[] var125 = field524;
                                    class127 var126 = new class127(var119);
                                    int var127 = -1;
                                    while (true) {
                                        int var128 = var126.method2427();
                                        if (var128 == 0) {
                                            continue label992;
                                        }
                                        var127 += var128;
                                        int var129 = 0;
                                        while (true) {
                                            int var130 = var126.method2427();
                                            if (var130 == 0) {
                                                break;
                                            }
                                            var129 += var130 - 1;
                                            int var131 = var129 & 0x3F;
                                            int var132 = var129 >> 6 & 0x3F;
                                            int var133 = var129 >> 12;
                                            int var134 = var126.method2414();
                                            int var135 = var134 >> 2;
                                            int var136 = var134 & 0x3;
                                            if (var113 == var133 && var132 >= var122 && var132 < var122 + 8 && var131 >= var123 && var131 < var123 + 8) {
                                                class32 var137 = class32.method54(var127);
                                                int var138 = var120 + class160.method3135(var132 & 0x7, var131 & 0x7, var114, var137.field819, var137.field821, var136);
                                                int var139 = var121 + class160.method2955(var132 & 0x7, var131 & 0x7, var114, var137.field819, var137.field821, var136);
                                                if (var138 > 0 && var139 > 0 && var138 < 103 && var139 < 103) {
                                                    int var140 = var109;
                                                    if ((class9.field129[1][var138][var139] & 0x2) == 2) {
                                                        var140 = var109 - 1;
                                                    }
                                                    class164 var141 = null;
                                                    if (var140 >= 0) {
                                                        var141 = var125[var140];
                                                    }
                                                    class9.method1568(var109, var138, var139, var127, var114 + var136 & 0x3, var135, var124, var141);
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
        method46(true);
        method2923();
        method883();
        class95 var142 = Statics.field1510;
        class164[] var143 = field524;
        for (int var144 = 0; var144 < 4; var144++) {
            for (int var145 = 0; var145 < 104; var145++) {
                for (int var146 = 0; var146 < 104; var146++) {
                    if ((class9.field129[var144][var145][var146] & 0x1) == 1) {
                        int var147 = var144;
                        if ((class9.field129[1][var145][var146] & 0x2) == 2) {
                            var147 = var144 - 1;
                        }
                        if (var147 >= 0) {
                            var143[var147].method3209(var145, var146);
                        }
                    }
                }
            }
        }
        class9.field134 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field134 < -8) {
            class9.field134 = -8;
        }
        if (class9.field134 > 8) {
            class9.field134 = 8;
        }
        class9.field125 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field125 < -16) {
            class9.field125 = -16;
        }
        if (class9.field125 > 16) {
            class9.field125 = 16;
        }
        for (int var148 = 0; var148 < 4; var148++) {
            byte[][] var149 = Statics.field2304[var148];
            int var150 = (int) Math.sqrt(5100.0D);
            int var151 = var150 * 768 >> 8;
            for (int var152 = 1; var152 < 103; var152++) {
                for (int var153 = 1; var153 < 103; var153++) {
                    int var154 = class9.field126[var148][var153 + 1][var152] - class9.field126[var148][var153 - 1][var152];
                    int var155 = class9.field126[var148][var153][var152 + 1] - class9.field126[var148][var153][var152 - 1];
                    int var156 = (int) Math.sqrt((double) (var155 * var155 + var154 * var154 + 65536));
                    int var157 = (var154 << 8) / var156;
                    int var158 = 65536 / var156;
                    int var159 = (var155 << 8) / var156;
                    int var160 = (var159 * -50 + var157 * -50 + var158 * -10) / var151 + 96;
                    int var161 = (var149[var153][var152] >> 1) + (var149[var153][var152 + 1] >> 3) + (var149[var153][var152 - 1] >> 2) + (var149[var153 - 1][var152] >> 2) + (var149[var153 + 1][var152] >> 3);
                    Statics.field1984[var153][var152] = var160 - var161;
                }
            }
            for (int var162 = 0; var162 < 104; var162++) {
                Statics.field737[var162] = 0;
                Statics.field967[var162] = 0;
                Statics.field2832[var162] = 0;
                Statics.field2789[var162] = 0;
                Statics.field389[var162] = 0;
            }
            for (int var163 = -5; var163 < 109; var163++) {
                for (int var164 = 0; var164 < 104; var164++) {
                    int var165 = var163 + 5;
                    int var10002;
                    if (var165 >= 0 && var165 < 104) {
                        int var166 = Statics.field375[var148][var165][var164] & 0xFF;
                        if (var166 > 0) {
                            class33 var167 = class33.method25(var166 - 1);
                            Statics.field737[var164] += var167.field859;
                            Statics.field967[var164] += var167.field860;
                            Statics.field2832[var164] += var167.field861;
                            Statics.field2789[var164] += var167.field862;
                            var10002 = Statics.field389[var164]++;
                        }
                    }
                    int var168 = var163 - 5;
                    if (var168 >= 0 && var168 < 104) {
                        int var169 = Statics.field375[var148][var168][var164] & 0xFF;
                        if (var169 > 0) {
                            class33 var170 = class33.method25(var169 - 1);
                            Statics.field737[var164] -= var170.field859;
                            Statics.field967[var164] -= var170.field860;
                            Statics.field2832[var164] -= var170.field861;
                            Statics.field2789[var164] -= var170.field862;
                            var10002 = Statics.field389[var164]--;
                        }
                    }
                }
                if (var163 >= 1 && var163 < 103) {
                    int var171 = 0;
                    int var172 = 0;
                    int var173 = 0;
                    int var174 = 0;
                    int var175 = 0;
                    for (int var176 = -5; var176 < 109; var176++) {
                        int var177 = var176 + 5;
                        if (var177 >= 0 && var177 < 104) {
                            var171 += Statics.field737[var177];
                            var172 += Statics.field967[var177];
                            var173 += Statics.field2832[var177];
                            var174 += Statics.field2789[var177];
                            var175 += Statics.field389[var177];
                        }
                        int var178 = var176 - 5;
                        if (var178 >= 0 && var178 < 104) {
                            var171 -= Statics.field737[var178];
                            var172 -= Statics.field967[var178];
                            var173 -= Statics.field2832[var178];
                            var174 -= Statics.field2789[var178];
                            var175 -= Statics.field389[var178];
                        }
                        if (var176 >= 1 && var176 < 103) {
                            if (field472 && (class9.field129[0][var163][var176] & 0x2) == 0) {
                                if ((class9.field129[var148][var163][var176] & 0x10) != 0) {
                                    continue;
                                }
                                int var179;
                                if ((class9.field129[var148][var163][var176] & 0x8) != 0) {
                                    var179 = 0;
                                } else if (var148 <= 0 || (class9.field129[1][var163][var176] & 0x2) == 0) {
                                    var179 = var148;
                                } else {
                                    var179 = var148 - 1;
                                }
                                if (field562 != var179) {
                                    continue;
                                }
                            }
                            if (var148 < class9.field115) {
                                class9.field115 = var148;
                            }
                            int var180 = Statics.field375[var148][var163][var176] & 0xFF;
                            int var181 = Statics.field121[var148][var163][var176] & 0xFF;
                            if (var180 > 0 || var181 > 0) {
                                int var182 = class9.field126[var148][var163][var176];
                                int var183 = class9.field126[var148][var163 + 1][var176];
                                int var184 = class9.field126[var148][var163 + 1][var176 + 1];
                                int var185 = class9.field126[var148][var163][var176 + 1];
                                int var186 = Statics.field1984[var163][var176];
                                int var187 = Statics.field1984[var163 + 1][var176];
                                int var188 = Statics.field1984[var163 + 1][var176 + 1];
                                int var189 = Statics.field1984[var163][var176 + 1];
                                int var190 = -1;
                                int var191 = -1;
                                if (var180 > 0) {
                                    int var192 = var171 * 256 / var174;
                                    int var193 = var172 / var175;
                                    int var194 = var173 / var175;
                                    var190 = class9.method34(var192, var193, var194);
                                    int var195 = class9.field134 + var192 & 0xFF;
                                    int var196 = class9.field125 + var194;
                                    if (var196 < 0) {
                                        var196 = 0;
                                    } else if (var196 > 255) {
                                        var196 = 255;
                                    }
                                    var191 = class9.method34(var195, var193, var196);
                                }
                                if (var148 > 0) {
                                    boolean var197 = true;
                                    if (var180 == 0 && Statics.field1298[var148][var163][var176] != 0) {
                                        var197 = false;
                                    }
                                    if (var181 > 0 && !class37.method594(var181 - 1).field929) {
                                        var197 = false;
                                    }
                                    if (var197 && var182 == var183 && var182 == var184 && var182 == var185) {
                                        Statics.field59[var148][var163][var176] |= 0x924;
                                    }
                                }
                                int var198 = 0;
                                if (var191 != -1) {
                                    var198 = class104.field1775[class9.method1542(var191, 96)];
                                }
                                if (var181 == 0) {
                                    var142.method1855(var148, var163, var176, 0, 0, -1, var182, var183, var184, var185, class9.method1542(var190, var186), class9.method1542(var190, var187), class9.method1542(var190, var188), class9.method1542(var190, var189), 0, 0, 0, 0, var198, 0);
                                } else {
                                    int var199 = Statics.field1298[var148][var163][var176] + 1;
                                    byte var200 = Statics.field244[var148][var163][var176];
                                    class37 var201 = class37.method594(var181 - 1);
                                    int var202 = var201.field928;
                                    int var203;
                                    int var204;
                                    if (var202 >= 0) {
                                        var203 = Statics.field1766.method2172(var202);
                                        var204 = -1;
                                    } else if (var201.field927 == 16711935) {
                                        var204 = -2;
                                        var202 = -1;
                                        var203 = -2;
                                    } else {
                                        var204 = class9.method34(var201.field940, var201.field941, var201.field925);
                                        int var205 = class9.field134 + var201.field940 & 0xFF;
                                        int var206 = class9.field125 + var201.field925;
                                        if (var206 < 0) {
                                            var206 = 0;
                                        } else if (var206 > 255) {
                                            var206 = 255;
                                        }
                                        var203 = class9.method34(var205, var201.field941, var206);
                                    }
                                    int var207 = 0;
                                    if (var203 != -2) {
                                        var207 = class104.field1775[class9.method45(var203, 96)];
                                    }
                                    if (var201.field931 != -1) {
                                        int var208 = class9.field134 + var201.field930 & 0xFF;
                                        int var209 = class9.field125 + var201.field936;
                                        if (var209 < 0) {
                                            var209 = 0;
                                        } else if (var209 > 255) {
                                            var209 = 255;
                                        }
                                        int var210 = class9.method34(var208, var201.field935, var209);
                                        var207 = class104.field1775[class9.method45(var210, 96)];
                                    }
                                    var142.method1855(var148, var163, var176, var199, var200, var202, var182, var183, var184, var185, class9.method1542(var190, var186), class9.method1542(var190, var187), class9.method1542(var190, var188), class9.method1542(var190, var189), class9.method45(var204, var186), class9.method45(var204, var187), class9.method45(var204, var188), class9.method45(var204, var189), var198, var207);
                                }
                            }
                        }
                    }
                }
            }
            for (int var211 = 1; var211 < 103; var211++) {
                for (int var212 = 1; var212 < 103; var212++) {
                    int var217;
                    if ((class9.field129[var148][var212][var211] & 0x8) != 0) {
                        var217 = 0;
                    } else if (var148 <= 0 || (class9.field129[1][var212][var211] & 0x2) == 0) {
                        var217 = var148;
                    } else {
                        var217 = var148 - 1;
                    }
                    var142.method1854(var148, var212, var211, var217);
                }
            }
            Statics.field375[var148] = (byte[][]) null;
            Statics.field121[var148] = (byte[][]) null;
            Statics.field1298[var148] = (byte[][]) null;
            Statics.field244[var148] = (byte[][]) null;
            Statics.field2304[var148] = (byte[][]) null;
        }
        var142.method1931(-50, -10, -50);
        for (int var218 = 0; var218 < 104; var218++) {
            for (int var219 = 0; var219 < 104; var219++) {
                if ((class9.field129[1][var218][var219] & 0x2) == 2) {
                    var142.method1852(var218, var219);
                }
            }
        }
        int var220 = 1;
        int var221 = 2;
        int var222 = 4;
        for (int var223 = 0; var223 < 4; var223++) {
            if (var223 > 0) {
                var220 <<= 0x3;
                var221 <<= 0x3;
                var222 <<= 0x3;
            }
            for (int var224 = 0; var224 <= var223; var224++) {
                for (int var225 = 0; var225 <= 104; var225++) {
                    for (int var226 = 0; var226 <= 104; var226++) {
                        if ((Statics.field59[var224][var226][var225] & var220) != 0) {
                            int var227 = var225;
                            int var228 = var225;
                            int var229 = var224;
                            int var230 = var224;
                            while (var227 > 0 && (Statics.field59[var224][var226][var227 - 1] & var220) != 0) {
                                var227--;
                            }
                            while (var228 < 104 && (Statics.field59[var224][var226][var228 + 1] & var220) != 0) {
                                var228++;
                            }
                            label711: while (var229 > 0) {
                                for (int var231 = var227; var231 <= var228; var231++) {
                                    if ((Statics.field59[var229 - 1][var226][var231] & var220) == 0) {
                                        break label711;
                                    }
                                }
                                var229--;
                            }
                            label700: while (var230 < var223) {
                                for (int var232 = var227; var232 <= var228; var232++) {
                                    if ((Statics.field59[var230 + 1][var226][var232] & var220) == 0) {
                                        break label700;
                                    }
                                }
                                var230++;
                            }
                            int var233 = (var230 + 1 - var229) * (var228 - var227 + 1);
                            if (var233 >= 8) {
                                short var234 = 240;
                                int var235 = class9.field126[var230][var226][var227] - var234;
                                int var236 = class9.field126[var229][var226][var227];
                                class95.method1853(var223, 1, var226 * 128, var226 * 128, var227 * 128, var228 * 128 + 128, var235, var236);
                                for (int var237 = var229; var237 <= var230; var237++) {
                                    for (int var238 = var227; var238 <= var228; var238++) {
                                        Statics.field59[var237][var226][var238] &= ~var220;
                                    }
                                }
                            }
                        }
                        if ((Statics.field59[var224][var226][var225] & var221) != 0) {
                            int var239 = var226;
                            int var240 = var226;
                            int var241 = var224;
                            int var242 = var224;
                            while (var239 > 0 && (Statics.field59[var224][var239 - 1][var225] & var221) != 0) {
                                var239--;
                            }
                            while (var240 < 104 && (Statics.field59[var224][var240 + 1][var225] & var221) != 0) {
                                var240++;
                            }
                            label764: while (var241 > 0) {
                                for (int var243 = var239; var243 <= var240; var243++) {
                                    if ((Statics.field59[var241 - 1][var243][var225] & var221) == 0) {
                                        break label764;
                                    }
                                }
                                var241--;
                            }
                            label753: while (var242 < var223) {
                                for (int var244 = var239; var244 <= var240; var244++) {
                                    if ((Statics.field59[var242 + 1][var244][var225] & var221) == 0) {
                                        break label753;
                                    }
                                }
                                var242++;
                            }
                            int var245 = (var242 + 1 - var241) * (var240 - var239 + 1);
                            if (var245 >= 8) {
                                short var246 = 240;
                                int var247 = class9.field126[var242][var239][var225] - var246;
                                int var248 = class9.field126[var241][var239][var225];
                                class95.method1853(var223, 2, var239 * 128, var240 * 128 + 128, var225 * 128, var225 * 128, var247, var248);
                                for (int var249 = var241; var249 <= var242; var249++) {
                                    for (int var250 = var239; var250 <= var240; var250++) {
                                        Statics.field59[var249][var250][var225] &= ~var221;
                                    }
                                }
                            }
                        }
                        if ((Statics.field59[var224][var226][var225] & var222) != 0) {
                            int var251 = var226;
                            int var252 = var226;
                            int var253 = var225;
                            int var254 = var225;
                            while (var253 > 0 && (Statics.field59[var224][var226][var253 - 1] & var222) != 0) {
                                var253--;
                            }
                            while (var254 < 104 && (Statics.field59[var224][var226][var254 + 1] & var222) != 0) {
                                var254++;
                            }
                            label817: while (var251 > 0) {
                                for (int var255 = var253; var255 <= var254; var255++) {
                                    if ((Statics.field59[var224][var251 - 1][var255] & var222) == 0) {
                                        break label817;
                                    }
                                }
                                var251--;
                            }
                            label806: while (var252 < 104) {
                                for (int var256 = var253; var256 <= var254; var256++) {
                                    if ((Statics.field59[var224][var252 + 1][var256] & var222) == 0) {
                                        break label806;
                                    }
                                }
                                var252++;
                            }
                            if ((var252 - var251 + 1) * (var254 - var253 + 1) >= 4) {
                                int var257 = class9.field126[var224][var251][var253];
                                class95.method1853(var223, 4, var251 * 128, var252 * 128 + 128, var253 * 128, var254 * 128 + 128, var257, var257);
                                for (int var258 = var251; var258 <= var252; var258++) {
                                    for (int var259 = var253; var259 <= var254; var259++) {
                                        Statics.field59[var224][var258][var259] &= ~var222;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method46(true);
        int var260 = class9.field115;
        if (var260 > Statics.field948) {
            var260 = Statics.field948;
        }
        if (var260 < Statics.field948 - 1) {
            int var261 = Statics.field948 - 1;
        }
        if (field472) {
            Statics.field1510.method1882(class9.field115);
        } else {
            Statics.field1510.method1882(0);
        }
        for (int var262 = 0; var262 < 104; var262++) {
            for (int var263 = 0; var263 < 104; var263++) {
                method154(var262, var263);
            }
        }
        method883();
        method2653();
        class32.field807.method3251();
        if (Statics.field1387 != null) {
            field505.method2295(41);
            field505.method2448(1057001181);
        }
        if (!field525) {
            int var264 = (Statics.field227 - 6) / 8;
            int var265 = (Statics.field227 + 6) / 8;
            int var266 = (Statics.field1379 - 6) / 8;
            int var267 = (Statics.field1379 + 6) / 8;
            for (int var268 = var264 - 1; var268 <= var265 + 1; var268++) {
                for (int var269 = var266 - 1; var269 <= var267 + 1; var269++) {
                    if (var268 < var264 || var268 > var265 || var269 < var266 || var269 > var267) {
                        Statics.field190.method2987("m" + var268 + "_" + var269);
                        Statics.field190.method2987("l" + var268 + "_" + var269);
                    }
                }
            }
        }
        method541(30);
        method883();
        Statics.field375 = (byte[][][]) null;
        Statics.field121 = (byte[][][]) null;
        Statics.field1298 = (byte[][][]) null;
        Statics.field244 = (byte[][][]) null;
        Statics.field59 = (int[][][]) null;
        Statics.field2304 = (byte[][][]) null;
        Statics.field1984 = (int[][]) null;
        Statics.field737 = null;
        Statics.field967 = null;
        Statics.field2832 = null;
        Statics.field2789 = null;
        Statics.field389 = null;
        field505.method2295(167);
        class73.method3082();
    }

    @ObfuscatedName("at.bm(II)V")
    public static final void method770(int arg0) {
        int[] var1 = Statics.field230.field1470;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field129[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field1510.method1884(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field129[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field1510.method1884(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field230.method1681();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field129[arg0][var10][var9] & 0x18) == 0) {
                    method2650(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field129[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method2650(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field544 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field1510.method1980(Statics.field948, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method54(var14).field832;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field524[Statics.field948].field2748;
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
                        field701[field544] = Statics.field1319[var15];
                        field699[field544] = var16;
                        field513[field544] = var17;
                        field544++;
                    }
                }
            }
        }
        Statics.field2704.method1645();
    }

    @ObfuscatedName("eu.ba(IIIIII)V")
    public static final void method2650(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1510.method2001(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1510.method1994(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field230.field1470;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method54(var12);
            if (var13.field839 == -1) {
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
                class87 var14 = Statics.field96[var13.field839];
                if (var14 != null) {
                    int var15 = (var13.field819 * 4 - var14.field1483) / 2;
                    int var16 = (var13.field821 * 4 - var14.field1479) / 2;
                    var14.method1755(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field821) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1510.method1878(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1510.method1994(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method54(var21);
            if (var22.field839 != -1) {
                class87 var23 = Statics.field96[var22.field839];
                if (var23 != null) {
                    int var24 = (var22.field819 * 4 - var23.field1483) / 2;
                    int var25 = (var22.field821 * 4 - var23.field1479) / 2;
                    var23.method1755(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field821) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field230.field1470;
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
        int var29 = Statics.field1510.method1980(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method54(var30);
        if (var31.field839 == -1) {
            return;
        }
        class87 var32 = Statics.field96[var31.field839];
        if (var32 != null) {
            int var33 = (var31.field819 * 4 - var32.field1483) / 2;
            int var34 = (var31.field821 * 4 - var32.field1479) / 2;
            var32.method1755(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field821) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("bo.bx(IIII)Z")
    public static final boolean method1492(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1510.method1994(Statics.field948, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method54(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field819;
                var9 = var7.field821;
            } else {
                var8 = var7.field821;
                var9 = var7.field819;
            }
            int var10 = var7.field842;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field574 = class77.field1391;
        field499 = class77.field1398;
        field577 = 2;
        field664 = 0;
        return true;
    }

    @ObfuscatedName("bh.bn(IIIIZIIIIIII)Z")
    public static final boolean method1537(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field576[var11][var12] = 0;
                field530[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field576[arg0][arg1] = 99;
        field530[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field531[var15] = arg0;
        int var36 = var15 + 1;
        field532[var15] = arg1;
        boolean var17 = false;
        int var18 = field531.length;
        int[][] var19 = field524[Statics.field948].field2748;
        while (var36 != var16) {
            var13 = field531[var16];
            var14 = field532[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field524[Statics.field948].method3199(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field524[Statics.field948].method3200(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field524[Statics.field948].method3201(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field530[var13][var14] + 1;
            if (var13 > 0 && field576[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field531[var36] = var13 - 1;
                field532[var36] = var14;
                var36 = (var36 + 1) % var18;
                field576[var13 - 1][var14] = 2;
                field530[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field576[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field531[var36] = var13 + 1;
                field532[var36] = var14;
                var36 = (var36 + 1) % var18;
                field576[var13 + 1][var14] = 8;
                field530[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field576[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field531[var36] = var13;
                field532[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field576[var13][var14 - 1] = 1;
                field530[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field576[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field531[var36] = var13;
                field532[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field576[var13][var14 + 1] = 4;
                field530[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field576[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field531[var36] = var13 - 1;
                field532[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field576[var13 - 1][var14 - 1] = 3;
                field530[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field576[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field531[var36] = var13 + 1;
                field532[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field576[var13 + 1][var14 - 1] = 9;
                field530[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field576[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field531[var36] = var13 - 1;
                field532[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field576[var13 - 1][var14 + 1] = 6;
                field530[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field576[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field531[var36] = var13 + 1;
                field532[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field576[var13 + 1][var14 + 1] = 12;
                field530[var13 + 1][var14 + 1] = var20;
            }
        }
        field528 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field530[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field530[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field530[var24][var25];
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
            field528 = 1;
        }
        byte var29 = 0;
        field531[var29] = var13;
        int var37 = var29 + 1;
        field532[var29] = var14;
        int var30;
        int var31 = var30 = field576[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field531[var37] = var13;
                field532[var37++] = var14;
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
            var31 = field576[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field531[var37];
            int var34 = field532[var37];
            if (arg10 == 0) {
                field505.method2295(150);
                field505.method2498(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field505.method2295(170);
                field505.method2498(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field505.method2295(227);
                field505.method2498(var32 + var32 + 3);
            }
            field702 = field531[0];
            field703 = field532[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field505.method2598(field531[var37] - var33);
                field505.method2498(field532[var37] - var34);
            }
            field505.method2401(Statics.field377 + var34);
            field505.method2568(Statics.field80 + var33);
            field505.method2437(class75.field1340[82] ? 1 : 0);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("au.be(I)V")
    public static final void method550() {
        if (field509 == 135) {
            int var0 = field570.method2416();
            int var1 = field570.method2438();
            int var2 = (var1 >> 4 & 0x7) + Statics.field1371;
            int var3 = (var1 & 0x7) + Statics.field1793;
            int var4 = field570.method2447();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104) {
                class17 var5 = new class17();
                var5.field243 = var4;
                var5.field242 = var0;
                if (field687[Statics.field948][var2][var3] == null) {
                    field687[Statics.field948][var2][var3] = new class177();
                }
                field687[Statics.field948][var2][var3].method3326(var5);
                method154(var2, var3);
            }
        } else if (field509 == 155) {
            int var6 = field570.method2440();
            int var7 = var6 >> 2;
            int var8 = var6 & 0x3;
            int var9 = field527[var7];
            int var10 = field570.method2439();
            int var11 = (var10 >> 4 & 0x7) + Statics.field1371;
            int var12 = (var10 & 0x7) + Statics.field1793;
            int var13 = field570.method2447();
            if (var11 >= 0 && var12 >= 0 && var11 < 103 && var12 < 103) {
                if (var9 == 0) {
                    class96 var14 = Statics.field1510.method1872(Statics.field948, var11, var12);
                    if (var14 != null) {
                        int var15 = var14.field1616 >> 14 & 0x7FFF;
                        if (var7 == 2) {
                            var14.field1621 = new class14(var15, 2, var8 + 4, Statics.field948, var11, var12, var13, false, var14.field1621);
                            var14.field1625 = new class14(var15, 2, var8 + 1 & 0x3, Statics.field948, var11, var12, var13, false, var14.field1625);
                        } else {
                            var14.field1621 = new class14(var15, var7, var8, Statics.field948, var11, var12, var13, false, var14.field1621);
                        }
                    }
                }
                if (var9 == 1) {
                    class108 var16 = Statics.field1510.method1873(Statics.field948, var11, var12);
                    if (var16 != null) {
                        int var17 = var16.field1806 >> 14 & 0x7FFF;
                        if (var7 == 4 || var7 == 5) {
                            var16.field1804 = new class14(var17, 4, var8, Statics.field948, var11, var12, var13, false, var16.field1804);
                        } else if (var7 == 6) {
                            var16.field1804 = new class14(var17, 4, var8 + 4, Statics.field948, var11, var12, var13, false, var16.field1804);
                        } else if (var7 == 7) {
                            var16.field1804 = new class14(var17, 4, (var8 + 2 & 0x3) + 4, Statics.field948, var11, var12, var13, false, var16.field1804);
                        } else if (var7 == 8) {
                            var16.field1804 = new class14(var17, 4, var8 + 4, Statics.field948, var11, var12, var13, false, var16.field1804);
                            var16.field1797 = new class14(var17, 4, (var8 + 2 & 0x3) + 4, Statics.field948, var11, var12, var13, false, var16.field1797);
                        }
                    }
                }
                if (var9 == 2) {
                    class98 var18 = Statics.field1510.method1874(Statics.field948, var11, var12);
                    if (var7 == 11) {
                        var7 = 10;
                    }
                    if (var18 != null) {
                        var18.field1642 = new class14(var18.field1648 >> 14 & 0x7FFF, var7, var8, Statics.field948, var11, var12, var13, false, var18.field1642);
                    }
                }
                if (var9 == 3) {
                    class107 var19 = Statics.field1510.method1875(Statics.field948, var11, var12);
                    if (var19 != null) {
                        var19.field1789 = new class14(var19.field1790 >> 14 & 0x7FFF, 22, var8, Statics.field948, var11, var12, var13, false, var19.field1789);
                    }
                }
            }
        } else if (field509 == 177) {
            int var20 = field570.method2414();
            int var21 = (var20 >> 4 & 0x7) + Statics.field1371;
            int var22 = (var20 & 0x7) + Statics.field1793;
            int var23 = field570.method2416();
            int var24 = field570.method2414();
            int var25 = field570.method2416();
            if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104) {
                int var26 = var21 * 128 + 64;
                int var27 = var22 * 128 + 64;
                class20 var28 = new class20(var23, Statics.field948, var26, var27, method1646(var26, var27, Statics.field948) - var24, var25, field476);
                field604.method3326(var28);
            }
        } else if (field509 == 187) {
            int var29 = field570.method2414();
            int var30 = var29 >> 2;
            int var31 = var29 & 0x3;
            int var32 = field527[var30];
            int var33 = field570.method2438();
            int var34 = (var33 >> 4 & 0x7) + Statics.field1371;
            int var35 = (var33 & 0x7) + Statics.field1793;
            if (var34 >= 0 && var35 >= 0 && var34 < 104 && var35 < 104) {
                method2655(Statics.field948, var34, var35, var32, -1, var30, var31, 0, -1);
            }
        } else if (field509 == 50) {
            int var36 = field570.method2414();
            int var37 = (var36 >> 4 & 0x7) + Statics.field1371;
            int var38 = (var36 & 0x7) + Statics.field1793;
            int var39 = var37 + field570.method2415();
            int var40 = var38 + field570.method2415();
            int var41 = field570.method2480();
            int var42 = field570.method2416();
            int var43 = field570.method2414() * 4;
            int var44 = field570.method2414() * 4;
            int var45 = field570.method2416();
            int var46 = field570.method2416();
            int var47 = field570.method2414();
            int var48 = field570.method2414();
            if (var37 >= 0 && var38 >= 0 && var37 < 104 && var38 < 104 && var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104 && var42 != 65535) {
                int var49 = var37 * 128 + 64;
                int var50 = var38 * 128 + 64;
                int var51 = var39 * 128 + 64;
                int var52 = var40 * 128 + 64;
                class10 var53 = new class10(var42, Statics.field948, var49, var50, method1646(var49, var50, Statics.field948) - var43, field476 + var45, field476 + var46, var47, var48, var41, var44);
                var53.method89(var51, var52, method1646(var51, var52, Statics.field948) - var44, field476 + var45);
                field603.method3326(var53);
            }
        } else if (field509 == 164) {
            int var54 = field570.method2414();
            int var55 = (var54 >> 4 & 0x7) + Statics.field1371;
            int var56 = (var54 & 0x7) + Statics.field1793;
            int var57 = field570.method2416();
            int var58 = field570.method2416();
            int var59 = field570.method2416();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class177 var60 = field687[Statics.field948][var55][var56];
                if (var60 != null) {
                    for (class17 var61 = (class17) var60.method3321(); var61 != null; var61 = (class17) var60.method3323()) {
                        if ((var57 & 0x7FFF) == var61.field243 && var61.field242 == var58) {
                            var61.field242 = var59;
                            break;
                        }
                    }
                    method154(var55, var56);
                }
            }
        } else if (field509 == 122) {
            int var62 = field570.method2438();
            int var63 = (var62 >> 4 & 0x7) + Statics.field1371;
            int var64 = (var62 & 0x7) + Statics.field1793;
            int var65 = field570.method2414();
            int var66 = var65 >> 2;
            int var67 = var65 & 0x3;
            int var68 = field527[var66];
            int var69 = field570.method2447();
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                method2655(Statics.field948, var63, var64, var68, var69, var66, var67, 0, -1);
            }
        } else {
            if (field509 == 243) {
                byte var70 = field570.method2442();
                int var71 = field570.method2439();
                int var72 = var71 >> 2;
                int var73 = var71 & 0x3;
                int var74 = field527[var72];
                int var75 = field570.method2493();
                byte var76 = field570.method2476();
                int var77 = field570.method2419();
                byte var78 = field570.method2442();
                int var79 = field570.method2447();
                int var80 = field570.method2416();
                int var81 = field570.method2439();
                int var82 = (var81 >> 4 & 0x7) + Statics.field1371;
                int var83 = (var81 & 0x7) + Statics.field1793;
                byte var84 = field570.method2476();
                class3 var85;
                if (field593 == var75) {
                    var85 = Statics.field2706;
                } else {
                    var85 = field726[var75];
                }
                if (var85 != null) {
                    class32 var86 = class32.method54(var80);
                    int var87;
                    int var88;
                    if (var73 == 1 || var73 == 3) {
                        var87 = var86.field821;
                        var88 = var86.field819;
                    } else {
                        var87 = var86.field819;
                        var88 = var86.field821;
                    }
                    int var89 = (var87 >> 1) + var82;
                    int var90 = (var87 + 1 >> 1) + var82;
                    int var91 = (var88 >> 1) + var83;
                    int var92 = (var88 + 1 >> 1) + var83;
                    int[][] var93 = class9.field126[Statics.field948];
                    int var94 = var93[var89][var91] + var93[var90][var91] + var93[var89][var92] + var93[var90][var92] >> 2;
                    int var95 = (var82 << 7) + (var87 << 6);
                    int var96 = (var83 << 7) + (var88 << 6);
                    class112 var97 = var86.method635(var72, var73, var93, var95, var94, var96);
                    if (var97 != null) {
                        method2655(Statics.field948, var82, var83, var74, -1, 0, 0, var79 + 1, var77 + 1);
                        var85.field36 = field476 + var79;
                        var85.field44 = field476 + var77;
                        var85.field48 = var97;
                        var85.field45 = var82 * 128 + var87 * 64;
                        var85.field47 = var83 * 128 + var88 * 64;
                        var85.field46 = var94;
                        if (var70 > var84) {
                            byte var98 = var70;
                            var70 = var84;
                            var84 = var98;
                        }
                        if (var76 > var78) {
                            byte var99 = var76;
                            var76 = var78;
                            var78 = var99;
                        }
                        var85.field49 = var70 + var82;
                        var85.field55 = var82 + var84;
                        var85.field43 = var76 + var83;
                        var85.field52 = var78 + var83;
                    }
                }
            }
            if (field509 == 201) {
                int var100 = field570.method2414();
                int var101 = (var100 >> 4 & 0x7) + Statics.field1371;
                int var102 = (var100 & 0x7) + Statics.field1793;
                int var103 = field570.method2416();
                int var104 = field570.method2414();
                int var105 = var104 >> 4 & 0xF;
                int var106 = var104 & 0x7;
                int var107 = field570.method2414();
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    int var108 = var105 + 1;
                    if (Statics.field2706.field436[0] >= var101 - var108 && Statics.field2706.field436[0] <= var101 + var108 && Statics.field2706.field456[0] >= var102 - var108 && Statics.field2706.field456[0] <= var102 + var108 && field709 != 0 && var106 > 0 && field710 < 50) {
                        field711[field710] = var103;
                        field712[field710] = var106;
                        field713[field710] = var107;
                        field715[field710] = null;
                        field647[field710] = (var101 << 16) + (var102 << 8) + var105;
                        field710++;
                    }
                }
            }
            if (field509 == 137) {
                int var109 = field570.method2447();
                int var110 = field570.method2440();
                int var111 = (var110 >> 4 & 0x7) + Statics.field1371;
                int var112 = (var110 & 0x7) + Statics.field1793;
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    class177 var113 = field687[Statics.field948][var111][var112];
                    if (var113 != null) {
                        for (class17 var114 = (class17) var113.method3321(); var114 != null; var114 = (class17) var113.method3323()) {
                            if ((var109 & 0x7FFF) == var114.field243) {
                                var114.method3346();
                                break;
                            }
                        }
                        if (var113.method3321() == null) {
                            field687[Statics.field948][var111][var112] = null;
                        }
                        method154(var111, var112);
                    }
                }
            } else if (field509 == 45) {
                int var115 = field570.method2493();
                int var116 = field570.method2419();
                int var117 = field570.method2447();
                int var118 = field570.method2414();
                int var119 = (var118 >> 4 & 0x7) + Statics.field1371;
                int var120 = (var118 & 0x7) + Statics.field1793;
                if (var119 >= 0 && var120 >= 0 && var119 < 104 && var120 < 104 && field593 != var115) {
                    class17 var121 = new class17();
                    var121.field243 = var117;
                    var121.field242 = var116;
                    if (field687[Statics.field948][var119][var120] == null) {
                        field687[Statics.field948][var119][var120] = new class177();
                    }
                    field687[Statics.field948][var119][var120].method3326(var121);
                    method154(var119, var120);
                }
            }
        }
    }

    @ObfuscatedName("ep.bs(IIIIIIIIII)V")
    public static final void method2655(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field602.method3321(); var10 != null; var10 = (class22) field602.method3323()) {
            if (var10.field341 == arg0 && var10.field333 == arg1 && var10.field334 == arg2 && var10.field332 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field341 = arg0;
            var9.field332 = arg3;
            var9.field333 = arg1;
            var9.field334 = arg2;
            method217(var9);
            field602.method3326(var9);
        }
        var9.field338 = arg4;
        var9.field335 = arg5;
        var9.field339 = arg6;
        var9.field340 = arg7;
        var9.field342 = arg8;
    }

    @ObfuscatedName("eu.bk(B)V")
    public static final void method2653() {
        for (class22 var0 = (class22) field602.method3321(); var0 != null; var0 = (class22) field602.method3323()) {
            if (var0.field342 == -1) {
                var0.field340 = 0;
                method217(var0);
            } else {
                var0.method3346();
            }
        }
    }

    @ObfuscatedName("u.bu(La;I)V")
    public static final void method217(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field332 == 0) {
            var1 = Statics.field1510.method2001(arg0.field341, arg0.field333, arg0.field334);
        }
        if (arg0.field332 == 1) {
            var1 = Statics.field1510.method1877(arg0.field341, arg0.field333, arg0.field334);
        }
        if (arg0.field332 == 2) {
            var1 = Statics.field1510.method1878(arg0.field341, arg0.field333, arg0.field334);
        }
        if (arg0.field332 == 3) {
            var1 = Statics.field1510.method1980(arg0.field341, arg0.field333, arg0.field334);
        }
        if (var1 != 0) {
            int var5 = Statics.field1510.method1994(arg0.field341, arg0.field333, arg0.field334, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field331 = var2;
        arg0.field348 = var3;
        arg0.field336 = var4;
    }

    @ObfuscatedName("t.by(I)V")
    public static final void method100() {
        for (class22 var0 = (class22) field602.method3321(); var0 != null; var0 = (class22) field602.method3323()) {
            if (var0.field342 > 0) {
                var0.field342--;
            }
            if (var0.field342 != 0) {
                if (var0.field340 > 0) {
                    var0.field340--;
                }
                if (var0.field340 == 0 && var0.field333 >= 1 && var0.field334 >= 1 && var0.field333 <= 102 && var0.field334 <= 102 && (var0.field338 < 0 || class9.method872(var0.field338, var0.field335))) {
                    Statics.method125(var0.field341, var0.field332, var0.field333, var0.field334, var0.field338, var0.field339, var0.field335);
                    var0.field340 = -1;
                    if (var0.field338 == var0.field331 && var0.field331 == -1) {
                        var0.method3346();
                    } else if (var0.field338 == var0.field331 && var0.field339 == var0.field336 && var0.field348 == var0.field335) {
                        var0.method3346();
                    }
                }
            } else if (var0.field331 < 0 || class9.method872(var0.field331, var0.field348)) {
                Statics.method125(var0.field341, var0.field332, var0.field333, var0.field334, var0.field331, var0.field336, var0.field348);
                var0.method3346();
            }
        }
    }

    @ObfuscatedName("x.bq(III)V")
    public static final void method154(int arg0, int arg1) {
        class177 var2 = field687[Statics.field948][arg0][arg1];
        if (var2 == null) {
            Statics.field1510.method1871(Statics.field948, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3321(); var5 != null; var5 = (class17) var2.method3323()) {
            class40 var6 = class40.method41(var5.field243);
            int var7 = var6.field996;
            if (var6.field995 == 1) {
                var7 = (var5.field242 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1510.method1871(Statics.field948, arg0, arg1);
            return;
        }
        var2.method3320(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3321(); var10 != null; var10 = (class17) var2.method3323()) {
            if (var4.field243 != var10.field243) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field243 != var10.field243 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1510.method1857(Statics.field948, arg0, arg1, method1646(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field948), var4, var11, var8, var9);
    }

    @ObfuscatedName("ah.bt(I)V")
    public static final void method219() {
        field729 = 0;
        field590 = 0;
        field570.method2308();
        int var0 = field570.method2291(1);
        if (var0 != 0) {
            int var1 = field570.method2291(2);
            if (var1 == 0) {
                field591[++field590 - 1] = 2047;
            } else if (var1 == 1) {
                int var2 = field570.method2291(3);
                Statics.field2706.method221(var2, false);
                int var3 = field570.method2291(1);
                if (var3 == 1) {
                    field591[++field590 - 1] = 2047;
                }
            } else if (var1 == 2) {
                int var4 = field570.method2291(3);
                Statics.field2706.method221(var4, true);
                int var5 = field570.method2291(3);
                Statics.field2706.method221(var5, true);
                int var6 = field570.method2291(1);
                if (var6 == 1) {
                    field591[++field590 - 1] = 2047;
                }
            } else if (var1 == 3) {
                int var7 = field570.method2291(7);
                Statics.field948 = field570.method2291(2);
                int var8 = field570.method2291(1);
                if (var8 == 1) {
                    field591[++field590 - 1] = 2047;
                }
                int var9 = field570.method2291(7);
                int var10 = field570.method2291(1);
                Statics.field2706.method220(var9, var7, var10 == 1);
            }
        }
        int var11 = field570.method2291(8);
        if (var11 < field588) {
            for (int var12 = var11; var12 < field588; var12++) {
                field596[++field729 - 1] = field587[var12];
            }
        }
        if (var11 > field588) {
            throw new RuntimeException("");
        }
        field588 = 0;
        for (int var13 = 0; var13 < var11; var13++) {
            int var14 = field587[var13];
            class3 var15 = field726[var14];
            int var16 = field570.method2291(1);
            if (var16 == 0) {
                field587[++field588 - 1] = var14;
                var15.field449 = field476;
            } else {
                int var17 = field570.method2291(2);
                if (var17 == 0) {
                    field587[++field588 - 1] = var14;
                    var15.field449 = field476;
                    field591[++field590 - 1] = var14;
                } else if (var17 == 1) {
                    field587[++field588 - 1] = var14;
                    var15.field449 = field476;
                    int var18 = field570.method2291(3);
                    var15.method221(var18, false);
                    int var19 = field570.method2291(1);
                    if (var19 == 1) {
                        field591[++field590 - 1] = var14;
                    }
                } else if (var17 == 2) {
                    field587[++field588 - 1] = var14;
                    var15.field449 = field476;
                    int var20 = field570.method2291(3);
                    var15.method221(var20, true);
                    int var21 = field570.method2291(3);
                    var15.method221(var21, true);
                    int var22 = field570.method2291(1);
                    if (var22 == 1) {
                        field591[++field590 - 1] = var14;
                    }
                } else if (var17 == 3) {
                    field596[++field729 - 1] = var14;
                }
            }
        }
        while (field570.method2298(field508) >= 11) {
            int var23 = field570.method2291(11);
            if (var23 == 2047) {
                break;
            }
            boolean var27 = false;
            if (field726[var23] == null) {
                field726[var23] = new class3();
                if (field592[var23] != null) {
                    field726[var23].method15(field592[var23]);
                }
                var27 = true;
            }
            field587[++field588 - 1] = var23;
            class3 var28 = field726[var23];
            var28.field449 = field476;
            int var29 = field570.method2291(1);
            if (var29 == 1) {
                field591[++field590 - 1] = var23;
            }
            int var30 = field600[field570.method2291(3)];
            if (var27) {
                var28.field406 = var28.field413 = var30;
            }
            int var31 = field570.method2291(5);
            if (var31 > 15) {
                var31 -= 32;
            }
            int var32 = field570.method2291(1);
            int var33 = field570.method2291(5);
            if (var33 > 15) {
                var33 -= 32;
            }
            var28.method220(Statics.field2706.field436[0] + var31, Statics.field2706.field456[0] + var33, var32 == 1);
        }
        field570.method2293();
        method1327();
        for (int var24 = 0; var24 < field729; var24++) {
            int var25 = field596[var24];
            if (field476 != field726[var25].field449) {
                field726[var25] = null;
            }
        }
        if (field508 != field570.field2023) {
            throw new RuntimeException(field570.field2023 + class2.field23 + field508);
        }
        for (int var26 = 0; var26 < field588; var26++) {
            if (field726[field587[var26]] == null) {
                throw new RuntimeException(var26 + class2.field23 + field588);
            }
        }
    }

    @ObfuscatedName("by.br(B)V")
    public static final void method1327() {
        for (int var0 = 0; var0 < field590; var0++) {
            int var1 = field591[var0];
            class3 var2 = field726[var1];
            int var3 = field570.method2414();
            if ((var3 & 0x1) != 0) {
                var3 += field570.method2414() << 8;
            }
            if ((var3 & 0x40) != 0) {
                int var4 = field570.method2493();
                int var5 = field570.method2438();
                int var6 = field570.method2439();
                int var7 = field570.field2023;
                if (var2.field50 != null && var2.field39 != null) {
                    boolean var8 = false;
                    if (var5 <= 1 && method205(var2.field50)) {
                        var8 = true;
                    }
                    if (!var8 && field586 == 0) {
                        field492.field2023 = 0;
                        field570.method2461(field492.field2028, 0, var6);
                        field492.field2023 = 0;
                        String var9 = class185.method3389(class147.method1381(class184.method597(field492)));
                        var2.field416 = var9.trim();
                        var2.field440 = var4 >> 8;
                        var2.field419 = var4 & 0xFF;
                        var2.field417 = 150;
                        if (var5 == 2 || var5 == 3) {
                            method1287(1, class2.method96(1) + var2.field50, var9);
                        } else if (var5 == 1) {
                            method1287(1, class2.method96(0) + var2.field50, var9);
                        } else {
                            method1287(2, var2.field50, var9);
                        }
                    }
                }
                field570.field2023 = var6 + var7;
            }
            if ((var3 & 0x10) != 0) {
                int var10 = field570.method2440();
                byte[] var11 = new byte[var10];
                class127 var12 = new class127(var11);
                field570.method2460(var11, 0, var10);
                field592[var1] = var12;
                var2.method15(var12);
            }
            if ((var3 & 0x100) != 0) {
                int var13 = field570.method2438();
                int var14 = field570.method2440();
                var2.method239(var13, var14, field476);
                var2.field443 = field476 + 300;
                var2.field424 = field570.method2414();
                var2.field425 = field570.method2439();
            }
            if ((var3 & 0x4) != 0) {
                var2.field454 = field570.method2416();
                var2.field433 = field570.method2416();
            }
            if ((var3 & 0x2) != 0) {
                int var15 = field570.method2439();
                int var16 = field570.method2414();
                var2.method239(var15, var16, field476);
                var2.field443 = field476 + 300;
                var2.field424 = field570.method2414();
                var2.field425 = field570.method2438();
            }
            if ((var3 & 0x200) != 0) {
                var2.field437 = field570.method2493();
                int var17 = field570.method2459();
                var2.field441 = var17 >> 16;
                var2.field431 = (var17 & 0xFFFF) + field476;
                var2.field405 = 0;
                var2.field439 = 0;
                if (var2.field431 > field476) {
                    var2.field405 = -1;
                }
                if (var2.field437 == 65535) {
                    var2.field437 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                var2.field426 = field570.method2419();
                if (var2.field426 == 65535) {
                    var2.field426 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field416 = field570.method2422();
                if (var2.field416.charAt(0) == '~') {
                    var2.field416 = var2.field416.substring(1);
                    method1287(2, var2.field50, var2.field416);
                } else if (Statics.field2706 == var2) {
                    method1287(2, var2.field50, var2.field416);
                }
                var2.field440 = 0;
                var2.field419 = 0;
                var2.field417 = 150;
            }
            if ((var3 & 0x8) != 0) {
                int var18 = field570.method2447();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field570.method2414();
                method201(var2, var18, var19);
            }
            if ((var3 & 0x400) != 0) {
                var2.field455 = field570.method2439();
                var2.field444 = field570.method2439();
                var2.field442 = field570.method2439();
                var2.field412 = field570.method2439();
                var2.field446 = field570.method2419() + field476;
                var2.field447 = field570.method2447() + field476;
                var2.field448 = field570.method2439();
                var2.field428 = 1;
                var2.field459 = 0;
            }
        }
    }

    @ObfuscatedName("ed.bg(I)V")
    public static final void method3046() {
        while (true) {
            if (field570.method2298(field508) >= 27) {
                int var0 = field570.method2291(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field494[var0] == null) {
                        field494[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field494[var0];
                    field504[++field551 - 1] = var0;
                    var2.field449 = field476;
                    int var3 = field570.method2291(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field600[field570.method2291(3)];
                    if (var1) {
                        var2.field406 = var2.field413 = var4;
                    }
                    int var5 = field570.method2291(1);
                    int var6 = field570.method2291(1);
                    if (var6 == 1) {
                        field591[++field590 - 1] = var0;
                    }
                    var2.field374 = class31.method44(field570.method2291(14));
                    int var7 = field570.method2291(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field407 = var2.field374.field772;
                    var2.field453 = var2.field374.field795;
                    if (var2.field453 == 0) {
                        var2.field413 = 0;
                    }
                    var2.field411 = var2.field374.field797;
                    var2.field451 = var2.field374.field794;
                    var2.field445 = var2.field374.field780;
                    var2.field423 = var2.field374.field769;
                    var2.field408 = var2.field374.field788;
                    var2.field409 = var2.field374.field801;
                    var2.field430 = var2.field374.field777;
                    var2.method220(Statics.field2706.field436[0] + var7, Statics.field2706.field456[0] + var3, var5 == 1);
                    continue;
                }
            }
            field570.method2293();
            return;
        }
    }

    @ObfuscatedName("z.bf(IIB)V")
    public static final void method120(int arg0, int arg1) {
        if (field722 < 2 && field621 == 0 && !field727) {
            return;
        }
        String var2;
        if (field621 == 1 && field722 < 2) {
            var2 = class134.field2194 + class134.field2218 + field666 + " " + class2.field25;
        } else if (field727 && field722 < 2) {
            var2 = field627 + class134.field2218 + field628 + " " + class2.field25;
        } else {
            var2 = method26(field722 - 1);
        }
        if (field722 > 2) {
            var2 = var2 + class2.method2814(16777215) + " " + '/' + " " + (field722 - 2) + class134.field2212;
        }
        Statics.field1026.method3397(var2, arg0 + 4, arg1 + 15, 16777215, 0, field476 / 1000);
    }

    @ObfuscatedName("ce.bi(IIIII)V")
    public static final void method1649(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field670; var4++) {
            if (field677[var4] + field675[var4] > arg0 && field675[var4] < arg0 + arg2 && field678[var4] + field676[var4] > arg1 && field676[var4] < arg1 + arg3) {
                field672[var4] = true;
            }
        }
    }

    @ObfuscatedName("q.bz(I)V")
    public static final void method206() {
        int var0 = Statics.field1026.method3465(class134.field2193);
        for (int var1 = 0; var1 < field722; var1++) {
            int var2 = Statics.field1026.method3465(method26(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field722 * 15 + 21;
        int var4 = class77.field1391 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1398;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field609 = true;
        Statics.field239 = var4;
        Statics.field2315 = var5;
        Statics.field918 = var0;
        Statics.field954 = field722 * 15 + 22;
    }

    @ObfuscatedName("ce.bl(IB)Z")
    public static final boolean method1650(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field613[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("r.bj(II)V")
    public static final void method36(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field547[arg0];
        int var2 = field612[arg0];
        int var3 = field613[arg0];
        int var4 = field614[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 18) {
            boolean var5 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var5) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(199);
            field505.method2445(var4);
            field505.method2444(Statics.field377 + var2);
            field505.method2444(Statics.field80 + var1);
        }
        if (var3 == 8) {
            class25 var7 = field494[var4];
            if (var7 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var7.field436[0], var7.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(55);
                field505.method2445(field624);
                field505.method2454(Statics.field1377);
                field505.method2568(var4);
            }
        }
        if (var3 == 50) {
            class3 var8 = field726[var4];
            if (var8 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var8.field436[0], var8.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(235);
                field505.method2568(var4);
            }
        }
        if (var3 == 1004) {
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(11);
            field505.method2445(var4);
        }
        if (var3 == 39) {
            field505.method2295(91);
            field505.method2401(var1);
            field505.method2448(var2);
            field505.method2401(var4);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 49) {
            class3 var9 = field726[var4];
            if (var9 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var9.field436[0], var9.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(111);
                field505.method2445(var4);
            }
        }
        if (var3 == 10) {
            class25 var10 = field494[var4];
            if (var10 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var10.field436[0], var10.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(64);
                field505.method2401(var4);
            }
        }
        if (var3 == 24) {
            class158 var11 = class158.method2199(var2);
            boolean var12 = true;
            if (var11.field2565 > 0) {
                var12 = method1363(var11);
            }
            if (var12) {
                field505.method2295(164);
                field505.method2448(var2);
            }
        }
        if (var3 == 47) {
            class3 var13 = field726[var4];
            if (var13 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var13.field436[0], var13.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(83);
                field505.method2444(var4);
            }
        }
        if (var3 == 57 || var3 == 1007) {
            method1397(var4, var2, var1, field616[arg0]);
        }
        if (var3 == 23) {
            Statics.field1510.method1887(Statics.field948, var1, var2);
        }
        if (var3 == 35) {
            field505.method2295(185);
            field505.method2401(var1);
            field505.method2456(var2);
            field505.method2401(var4);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 1002) {
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(163);
            field505.method2444(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 45) {
            class3 var14 = field726[var4];
            if (var14 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var14.field436[0], var14.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(63);
                field505.method2445(var4);
            }
        }
        if (var3 == 1005) {
            class158 var15 = class158.method2199(var2);
            if (var15 == null || var15.field2675[var1] < 100000) {
                field505.method2295(11);
                field505.method2445(var4);
            } else {
                method1287(0, "", var15.field2675[var1] + " x " + class40.method41(var4).field984);
            }
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 14) {
            class3 var16 = field726[var4];
            if (var16 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var16.field436[0], var16.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(13);
                field505.method2444(var4);
                field505.method2401(Statics.field623);
                field505.method2401(Statics.field622);
                field505.method2468(Statics.field2024);
            }
        }
        if (var3 == 6) {
            method1492(var1, var2, var4);
            field505.method2295(228);
            field505.method2401(Statics.field80 + var1);
            field505.method2445(var4 >> 14 & 0x7FFF);
            field505.method2445(Statics.field377 + var2);
        }
        if (var3 == 16) {
            boolean var17 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var17) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(59);
            field505.method2568(Statics.field623);
            field505.method2568(Statics.field377 + var2);
            field505.method2444(var4);
            field505.method2568(Statics.field622);
            field505.method2468(Statics.field2024);
            field505.method2401(Statics.field80 + var1);
        }
        if (var3 == 4) {
            method1492(var1, var2, var4);
            field505.method2295(69);
            field505.method2568(Statics.field80 + var1);
            field505.method2444(var4 >> 14 & 0x7FFF);
            field505.method2401(Statics.field377 + var2);
        }
        if (var3 == 37) {
            field505.method2295(138);
            field505.method2445(var4);
            field505.method2448(var2);
            field505.method2401(var1);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 11) {
            class25 var19 = field494[var4];
            if (var19 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var19.field436[0], var19.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(5);
                field505.method2444(var4);
            }
        }
        if (var3 == 1001) {
            method1492(var1, var2, var4);
            field505.method2295(203);
            field505.method2445(Statics.field377 + var2);
            field505.method2444(Statics.field80 + var1);
            field505.method2568(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 33) {
            field505.method2295(115);
            field505.method2445(var4);
            field505.method2401(var1);
            field505.method2448(var2);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 38) {
            method2642();
            class158 var20 = class158.method2199(var2);
            field621 = 1;
            Statics.field622 = var1;
            Statics.field2024 = var2;
            Statics.field623 = var4;
            method118(var20);
            field666 = class2.method2814(16748608) + class40.method41(var4).field984 + class2.method2814(16777215);
            if (field666 == null) {
                field666 = "null";
            }
            return;
        }
        if (var3 == 31) {
            field505.method2295(221);
            field505.method2445(Statics.field622);
            field505.method2445(var1);
            field505.method2468(var2);
            field505.method2448(Statics.field2024);
            field505.method2444(Statics.field623);
            field505.method2444(var4);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 1 && method1492(var1, var2, var4)) {
            field505.method2295(70);
            field505.method2448(Statics.field2024);
            field505.method2568(var4 >> 14 & 0x7FFF);
            field505.method2401(Statics.field622);
            field505.method2568(Statics.field623);
            field505.method2444(Statics.field377 + var2);
            field505.method2445(Statics.field80 + var1);
        }
        if (var3 == 40) {
            field505.method2295(230);
            field505.method2401(var4);
            field505.method2401(var1);
            field505.method2456(var2);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 28) {
            field505.method2295(164);
            field505.method2448(var2);
            class158 var21 = class158.method2199(var2);
            if (var21.field2668 != null && var21.field2668[0][0] == 5) {
                int var22 = var21.field2668[0][1];
                class159.field2693[var22] = 1 - class159.field2693[var22];
                Statics.method94(var22);
            }
        }
        if (var3 == 7) {
            class25 var23 = field494[var4];
            if (var23 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var23.field436[0], var23.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(231);
                field505.method2445(Statics.field623);
                field505.method2468(Statics.field2024);
                field505.method2568(Statics.field622);
                field505.method2444(var4);
            }
        }
        if (var3 == 41) {
            field505.method2295(126);
            field505.method2468(var2);
            field505.method2444(var1);
            field505.method2444(var4);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 29) {
            field505.method2295(164);
            field505.method2448(var2);
            class158 var24 = class158.method2199(var2);
            if (var24.field2668 != null && var24.field2668[0][0] == 5) {
                int var25 = var24.field2668[0][1];
                if (class159.field2693[var25] != var24.field2659[0]) {
                    class159.field2693[var25] = var24.field2659[0];
                    Statics.method94(var25);
                }
            }
        }
        if (var3 == 1003) {
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            class25 var26 = field494[var4];
            if (var26 != null) {
                class31 var27 = var26.field374;
                if (var27.field796 != null) {
                    var27 = var27.method610();
                }
                if (var27 != null) {
                    field505.method2295(42);
                    field505.method2568(var27.field770);
                }
            }
        }
        if (var3 == 58) {
            field505.method2295(47);
            field505.method2454(Statics.field1377);
            field505.method2568(var1);
            field505.method2444(field624);
            field505.method2448(var2);
        }
        if (var3 == 26) {
            field505.method2295(153);
            for (class4 var28 = (class4) field582.method3312(); var28 != null; var28 = (class4) field582.method3297()) {
                if (var28.field61 == 0 || var28.field61 == 3) {
                    method42(var28, true);
                }
            }
            if (field516 != null) {
                method118(field516);
                field516 = null;
            }
        }
        if (var3 == 36) {
            field505.method2295(165);
            field505.method2444(var4);
            field505.method2444(var1);
            field505.method2468(var2);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 17) {
            boolean var29 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var29) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(168);
            field505.method2568(Statics.field377 + var2);
            field505.method2568(Statics.field80 + var1);
            field505.method2401(field624);
            field505.method2448(Statics.field1377);
            field505.method2568(var4);
        }
        if (var3 == 44) {
            class3 var31 = field726[var4];
            if (var31 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var31.field436[0], var31.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(23);
                field505.method2401(var4);
            }
        }
        if (var3 == 48) {
            class3 var32 = field726[var4];
            if (var32 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var32.field436[0], var32.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(188);
                field505.method2401(var4);
            }
        }
        if (var3 == 34) {
            field505.method2295(12);
            field505.method2568(var4);
            field505.method2568(var1);
            field505.method2456(var2);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 21) {
            boolean var33 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var33) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(148);
            field505.method2445(var4);
            field505.method2444(Statics.field80 + var1);
            field505.method2401(Statics.field377 + var2);
        }
        if (var3 == 3) {
            method1492(var1, var2, var4);
            field505.method2295(242);
            field505.method2444(var4 >> 14 & 0x7FFF);
            field505.method2401(Statics.field80 + var1);
            field505.method2444(Statics.field377 + var2);
        }
        if (var3 == 32) {
            field505.method2295(101);
            field505.method2456(var2);
            field505.method2401(field624);
            field505.method2456(Statics.field1377);
            field505.method2568(var4);
            field505.method2401(var1);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 25) {
            class158 var35 = class158.method2290(var2, var1);
            if (var35 != null) {
                method2642();
                method1838(var2, var1, class162.method134(method1434(var35)));
                field621 = 0;
                String var36;
                if (class162.method134(method1434(var35)) == 0) {
                    var36 = null;
                } else if (var35.field2653 == null || var35.field2653.trim().length() == 0) {
                    var36 = null;
                } else {
                    var36 = var35.field2653;
                }
                field627 = var36;
                if (field627 == null) {
                    field627 = "Null";
                }
                if (var35.field2662) {
                    field628 = var35.field2632 + class2.method2814(16777215);
                } else {
                    field628 = class2.method2814(65280) + var35.field2658 + class2.method2814(16777215);
                }
            }
            return;
        }
        if (var3 == 15) {
            class3 var37 = field726[var4];
            if (var37 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var37.field436[0], var37.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(237);
                field505.method2444(var4);
                field505.method2445(field624);
                field505.method2448(Statics.field1377);
            }
        }
        if (var3 == 19) {
            boolean var38 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var38) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(120);
            field505.method2445(Statics.field80 + var1);
            field505.method2445(Statics.field377 + var2);
            field505.method2445(var4);
        }
        if (var3 == 42) {
            field505.method2295(48);
            field505.method2444(var4);
            field505.method2448(var2);
            field505.method2568(var1);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 13) {
            class25 var40 = field494[var4];
            if (var40 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var40.field436[0], var40.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(43);
                field505.method2445(var4);
            }
        }
        if (var3 == 5) {
            method1492(var1, var2, var4);
            field505.method2295(73);
            field505.method2444(var4 >> 14 & 0x7FFF);
            field505.method2401(Statics.field377 + var2);
            field505.method2445(Statics.field80 + var1);
        }
        if (var3 == 43) {
            field505.method2295(106);
            field505.method2568(var1);
            field505.method2568(var4);
            field505.method2454(var2);
            field578 = 0;
            Statics.field1351 = class158.method2199(var2);
            field546 = var1;
        }
        if (var3 == 20) {
            boolean var41 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var41) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(166);
            field505.method2401(Statics.field377 + var2);
            field505.method2445(Statics.field80 + var1);
            field505.method2445(var4);
        }
        if (var3 == 51) {
            class3 var43 = field726[var4];
            if (var43 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var43.field436[0], var43.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(65);
                field505.method2401(var4);
            }
        }
        if (var3 == 2 && method1492(var1, var2, var4)) {
            field505.method2295(127);
            field505.method2568(Statics.field377 + var2);
            field505.method2445(Statics.field80 + var1);
            field505.method2456(Statics.field1377);
            field505.method2444(field624);
            field505.method2568(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 9) {
            class25 var44 = field494[var4];
            if (var44 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var44.field436[0], var44.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(213);
                field505.method2401(var4);
            }
        }
        if (var3 == 22) {
            boolean var45 = method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var45) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field574 = class77.field1391;
            field499 = class77.field1398;
            field577 = 2;
            field664 = 0;
            field505.method2295(158);
            field505.method2401(var4);
            field505.method2401(Statics.field377 + var2);
            field505.method2445(Statics.field80 + var1);
        }
        if (var3 == 46) {
            class3 var47 = field726[var4];
            if (var47 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var47.field436[0], var47.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(193);
                field505.method2568(var4);
            }
        }
        if (var3 == 30 && field516 == null) {
            method33(var2, var1);
            field516 = class158.method2290(var2, var1);
            method118(field516);
        }
        if (var3 == 12) {
            class25 var48 = field494[var4];
            if (var48 != null) {
                method1537(Statics.field2706.field436[0], Statics.field2706.field456[0], var48.field436[0], var48.field456[0], false, 0, 0, 1, 1, 0, 2);
                field574 = class77.field1391;
                field499 = class77.field1398;
                field577 = 2;
                field664 = 0;
                field505.method2295(171);
                field505.method2401(var4);
            }
        }
        if (field621 != 0) {
            field621 = 0;
            method118(class158.method2199(Statics.field2024));
        }
        if (field727) {
            method2642();
        }
        if (Statics.field1351 != null && field578 == 0) {
            method118(Statics.field1351);
        }
    }

    @ObfuscatedName("cj.bo(IIII)V")
    public static void method1838(int arg0, int arg1, int arg2) {
        class158 var3 = class158.method2290(arg0, arg1);
        if (var3 != null && var3.field2650 != null) {
            class1 var4 = new class1();
            var4.field2 = var3;
            var4.field3 = var3.field2650;
            class26.method132(var4);
        }
        field727 = true;
        Statics.field1377 = arg0;
        field624 = arg1;
        Statics.field1919 = arg2;
        method118(var3);
    }

    @ObfuscatedName("du.bc(I)V")
    public static void method2642() {
        if (!field727) {
            return;
        }
        class158 var0 = class158.method2290(Statics.field1377, field624);
        if (var0 != null && var0.field2651 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field3 = var0.field2651;
            class26.method132(var1);
        }
        field727 = false;
        method118(var0);
    }

    @ObfuscatedName("r.bh(IIB)V")
    public static void method33(int arg0, int arg1) {
        field505.method2295(160);
        field505.method2444(arg1);
        field505.method2468(arg0);
    }

    @ObfuscatedName("bz.bv(IIILjava/lang/String;B)V")
    public static void method1397(int arg0, int arg1, int arg2, String arg3) {
        class158 var4 = class158.method2290(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2670 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field5 = arg0;
            var5.field14 = arg3;
            var5.field3 = var4.field2670;
            class26.method132(var5);
        }
        boolean var6 = true;
        if (var4.field2565 > 0) {
            var6 = method1363(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method1434(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field505.method2295(186);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 2) {
            field505.method2295(239);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 3) {
            field505.method2295(75);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 4) {
            field505.method2295(93);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 5) {
            field505.method2295(128);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 6) {
            field505.method2295(102);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 7) {
            field505.method2295(215);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 8) {
            field505.method2295(180);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 9) {
            field505.method2295(142);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
        if (arg0 == 10) {
            field505.method2295(122);
            field505.method2448(arg1);
            field505.method2401(arg2);
        }
    }

    @ObfuscatedName("bc.bb(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1519(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field609 || field722 >= 500) {
            return;
        }
        field500[field722] = arg0;
        field616[field722] = arg1;
        field613[field722] = arg2;
        field614[field722] = arg3;
        field547[field722] = arg4;
        field612[field722] = arg5;
        field722++;
    }

    @ObfuscatedName("w.bw(I)V")
    public static void method52() {
        for (int var0 = 0; var0 < field722; var0++) {
            if (method1490(field613[var0])) {
                if (var0 < field722 - 1) {
                    for (int var1 = var0; var1 < field722 - 1; var1++) {
                        field500[var1] = field500[var1 + 1];
                        field616[var1] = field616[var1 + 1];
                        field613[var1] = field613[var1 + 1];
                        field614[var1] = field614[var1 + 1];
                        field547[var1] = field547[var1 + 1];
                        field612[var1] = field612[var1 + 1];
                    }
                }
                field722--;
            }
        }
    }

    @ObfuscatedName("bo.cq(II)Z")
    public static boolean method1490(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("v.ct(II)Ljava/lang/String;")
    public static String method26(int arg0) {
        return field616[arg0].length() > 0 ? field500[arg0] + class134.field2218 + field616[arg0] : field500[arg0];
    }

    @ObfuscatedName("an.cc(IIIII)V")
    public static final void method800(int arg0, int arg1, int arg2, int arg3) {
        if (field621 == 0 && !field727) {
            method1519(class134.field2134, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1904; var5++) {
            int var6 = class112.field1888[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field1510.method1994(Statics.field948, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method54(var10);
                    if (var11.field846 != null) {
                        var11 = var11.method638();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field621 == 1) {
                        method1519(class134.field2194, field666 + " " + class2.field25 + " " + class2.method2814(65535) + var11.field814, 1, var6, var7, var8);
                    } else if (!field727) {
                        String[] var12 = var11.field831;
                        if (field633) {
                            var12 = method234(var12);
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
                                    method1519(var12[var13], class2.method2814(65535) + var11.field814, var14, var6, var7, var8);
                                }
                            }
                        }
                        method1519(class134.field2169, class2.method2814(65535) + var11.field814, 1002, var11.field804 << 14, var7, var8);
                    } else if ((Statics.field1919 & 0x4) == 4) {
                        method1519(field627, field628 + " " + class2.field25 + " " + class2.method2814(65535) + var11.field814, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field494[var10];
                    if (var15.field374.field772 == 1 && (var15.field463 & 0x7F) == 64 && (var15.field404 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field551; var16++) {
                            class25 var17 = field494[field504[var16]];
                            if (var17 != null && var15 != var17 && var17.field374.field772 == 1 && var15.field463 == var17.field463 && var15.field404 == var17.field404) {
                                Statics.method2316(var17.field374, field504[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field588; var18++) {
                            class3 var19 = field726[field587[var18]];
                            if (var19 != null && var15.field463 == var19.field463 && var15.field404 == var19.field404) {
                                method121(var19, field587[var18], var7, var8);
                            }
                        }
                    }
                    Statics.method2316(var15.field374, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field726[var10];
                    if ((var20.field463 & 0x7F) == 64 && (var20.field404 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field551; var21++) {
                            class25 var22 = field494[field504[var21]];
                            if (var22 != null && var22.field374.field772 == 1 && var20.field463 == var22.field463 && var20.field404 == var22.field404) {
                                Statics.method2316(var22.field374, field504[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field588; var23++) {
                            class3 var24 = field726[field587[var23]];
                            if (var24 != null && var20 != var24 && var20.field463 == var24.field463 && var20.field404 == var24.field404) {
                                method121(var24, field587[var23], var7, var8);
                            }
                        }
                    }
                    method121(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field687[Statics.field948][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3318(); var26 != null; var26 = (class17) var25.method3314()) {
                            class40 var27 = class40.method41(var26.field243);
                            if (field621 == 1) {
                                method1519(class134.field2194, field666 + " " + class2.field25 + " " + class2.method2814(16748608) + var27.field984, 16, var26.field243, var7, var8);
                            } else if (!field727) {
                                String[] var28 = var27.field998;
                                if (field633) {
                                    var28 = method234(var28);
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
                                        method1519(var28[var29], class2.method2814(16748608) + var27.field984, var30, var26.field243, var7, var8);
                                    } else if (var29 == 2) {
                                        method1519(class134.field2161, class2.method2814(16748608) + var27.field984, 20, var26.field243, var7, var8);
                                    }
                                }
                                method1519(class134.field2169, class2.method2814(16748608) + var27.field984, 1004, var26.field243, var7, var8);
                            } else if ((Statics.field1919 & 0x1) == 1) {
                                method1519(field627, field628 + " " + class2.field25 + " " + class2.method2814(16748608) + var27.field984, 17, var26.field243, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.cw(Lv;IIII)V")
    public static final void method121(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2706 == arg0 || field722 >= 400) {
            return;
        }
        String var4;
        if (arg0.field38 == 0) {
            var4 = arg0.field50 + method161(arg0.field40, Statics.field2706.field40) + " " + class2.field31 + class134.field2249 + arg0.field40 + class2.field24;
        } else {
            var4 = arg0.field50 + " " + class2.field31 + class134.field2215 + arg0.field38 + class2.field24;
        }
        if (field621 == 1) {
            method1519(class134.field2194, field666 + " " + class2.field25 + " " + class2.method2814(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field727) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field466[var5] != null) {
                    short var6 = 0;
                    if (field466[var5].equalsIgnoreCase(class134.field2210)) {
                        if (arg0.field40 > Statics.field2706.field40) {
                            var6 = 2000;
                        }
                        if (Statics.field2706.field54 != 0 && arg0.field54 != 0) {
                            if (Statics.field2706.field54 == arg0.field54) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field599[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field559[var5] + var6;
                    method1519(field466[var5], class2.method2814(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1919 & 0x8) == 8) {
            method1519(field627, field628 + " " + class2.field25 + " " + class2.method2814(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field722; var9++) {
            if (field613[var9] == 23) {
                field616[var9] = class2.method2814(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("k.cg(III)Ljava/lang/String;")
    public static final String method161(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method2814(16711680);
        } else if (var2 < -6) {
            return class2.method2814(16723968);
        } else if (var2 < -3) {
            return class2.method2814(16740352);
        } else if (var2 < 0) {
            return class2.method2814(16756736);
        } else if (var2 > 9) {
            return class2.method2814(65280);
        } else if (var2 > 6) {
            return class2.method2814(4259584);
        } else if (var2 > 3) {
            return class2.method2814(8453888);
        } else if (var2 > 0) {
            return class2.method2814(12648192);
        } else {
            return class2.method2814(16776960);
        }
    }

    @ObfuscatedName("x.ce(IIIIIIIIB)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class158.method1643(arg0)) {
            Statics.field1661 = null;
            method3043(Statics.field2588[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1661 != null) {
                method3043(Statics.field1661, -1412584499, arg1, arg2, arg3, arg4, Statics.field1444, Statics.field462, arg7);
                Statics.field1661 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field672[var8] = true;
            }
        } else {
            field672[arg7] = true;
        }
    }

    @ObfuscatedName("ed.cu([Lff;IIIIIIIII)V")
    public static final void method3043(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1799(arg2, arg3, arg4, arg5);
        class104.method2098();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2648 == arg1 || arg1 == -1412584499 && field640 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field675[field670] = var10.field2577 + arg6;
                    field676[field670] = var10.field2578 + arg7;
                    field677[field670] = var10.field2569;
                    field678[field670] = var10.field2582;
                    var11 = ++field670 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2687 = var11;
                var10.field2638 = field476;
                if (!var10.field2662 || !method2895(var10)) {
                    if (var10.field2565 > 0) {
                        method105(var10);
                    }
                    int var12 = var10.field2577 + arg6;
                    int var13 = var10.field2578 + arg7;
                    int var14 = var10.field2594;
                    if (field640 == var10) {
                        if (arg1 != -1412584499 && !var10.field2637) {
                            Statics.field1661 = arg0;
                            Statics.field1444 = arg6;
                            Statics.field462 = arg7;
                            continue;
                        }
                        if (field651 && field645) {
                            int var15 = class77.field1384;
                            int var16 = class77.field1385;
                            int var17 = var15 - field642;
                            int var18 = var16 - field495;
                            if (var17 < field646) {
                                var17 = field646;
                            }
                            if (var10.field2569 + var17 > field646 + field641.field2569) {
                                var17 = field646 + field641.field2569 - var10.field2569;
                            }
                            if (var18 < field626) {
                                var18 = field626;
                            }
                            if (var10.field2582 + var18 > field626 + field641.field2582) {
                                var18 = field626 + field641.field2582 - var10.field2582;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2637) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2574 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2574 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2569 + var12;
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
                        int var29 = var10.field2569 + var12;
                        int var30 = var10.field2582 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2662 || var19 < var21 && var20 < var22) {
                        if (var10.field2565 != 0) {
                            if (var10.field2565 == 1337) {
                                field617 = var12;
                                field491 = var13;
                                int var31 = var10.field2569;
                                int var32 = var10.field2582;
                                class89.method1799(var12, var13, var12 + var31, var13 + var32);
                                class104.method2098();
                                field571++;
                                method735(true);
                                method2643(true);
                                method735(false);
                                method2643(false);
                                method214();
                                method35();
                                if (!field716) {
                                    int var33 = field553;
                                    if (field534 / 256 > var33) {
                                        var33 = field534 / 256;
                                    }
                                    if (field718[4] && field720[4] + 128 > var33) {
                                        var33 = field720[4] + 128;
                                    }
                                    int var34 = field724 + field537 & 0x7FF;
                                    int var35 = Statics.field1516;
                                    int var36 = method1646(Statics.field2706.field463, Statics.field2706.field404, Statics.field948) - 50;
                                    int var37 = Statics.field938;
                                    int var38 = var33 * 3 + 600;
                                    int var39 = 2048 - var33 & 0x7FF;
                                    int var40 = 2048 - var34 & 0x7FF;
                                    int var41 = 0;
                                    int var42 = 0;
                                    int var43 = var38;
                                    if (var39 != 0) {
                                        int var44 = class104.field1778[var39];
                                        int var45 = class104.field1779[var39];
                                        int var46 = var42 * var45 - var38 * var44 >> 16;
                                        var43 = var42 * var44 + var38 * var45 >> 16;
                                        var42 = var46;
                                    }
                                    if (var40 != 0) {
                                        int var47 = class104.field1778[var40];
                                        int var48 = class104.field1779[var40];
                                        int var49 = var41 * var48 + var43 * var47 >> 16;
                                        var43 = var43 * var48 - var41 * var47 >> 16;
                                        var41 = var49;
                                    }
                                    Statics.field330 = var35 - var41;
                                    Statics.field1963 = var36 - var42;
                                    Statics.field2690 = var37 - var43;
                                    Statics.field778 = var33;
                                    Statics.field750 = var34;
                                }
                                int var62;
                                if (field716) {
                                    var62 = method859();
                                } else {
                                    int var50;
                                    if (Statics.field2014.field178) {
                                        var50 = Statics.field948;
                                    } else {
                                        int var51 = 3;
                                        if (Statics.field778 < 310) {
                                            int var52 = Statics.field330 >> 7;
                                            int var53 = Statics.field2690 >> 7;
                                            int var54 = Statics.field2706.field463 >> 7;
                                            int var55 = Statics.field2706.field404 >> 7;
                                            if ((class9.field129[Statics.field948][var52][var53] & 0x4) != 0) {
                                                var51 = Statics.field948;
                                            }
                                            int var56;
                                            if (var54 > var52) {
                                                var56 = var54 - var52;
                                            } else {
                                                var56 = var52 - var54;
                                            }
                                            int var57;
                                            if (var55 > var53) {
                                                var57 = var55 - var53;
                                            } else {
                                                var57 = var53 - var55;
                                            }
                                            if (var56 > var57) {
                                                int var58 = var57 * 65536 / var56;
                                                int var59 = 32768;
                                                while (var52 != var54) {
                                                    if (var52 < var54) {
                                                        var52++;
                                                    } else if (var52 > var54) {
                                                        var52--;
                                                    }
                                                    if ((class9.field129[Statics.field948][var52][var53] & 0x4) != 0) {
                                                        var51 = Statics.field948;
                                                    }
                                                    var59 += var58;
                                                    if (var59 >= 65536) {
                                                        var59 -= 65536;
                                                        if (var53 < var55) {
                                                            var53++;
                                                        } else if (var53 > var55) {
                                                            var53--;
                                                        }
                                                        if ((class9.field129[Statics.field948][var52][var53] & 0x4) != 0) {
                                                            var51 = Statics.field948;
                                                        }
                                                    }
                                                }
                                            } else {
                                                int var60 = var56 * 65536 / var57;
                                                int var61 = 32768;
                                                while (var53 != var55) {
                                                    if (var53 < var55) {
                                                        var53++;
                                                    } else if (var53 > var55) {
                                                        var53--;
                                                    }
                                                    if ((class9.field129[Statics.field948][var52][var53] & 0x4) != 0) {
                                                        var51 = Statics.field948;
                                                    }
                                                    var61 += var60;
                                                    if (var61 >= 65536) {
                                                        var61 -= 65536;
                                                        if (var52 < var54) {
                                                            var52++;
                                                        } else if (var52 > var54) {
                                                            var52--;
                                                        }
                                                        if ((class9.field129[Statics.field948][var52][var53] & 0x4) != 0) {
                                                            var51 = Statics.field948;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        if ((class9.field129[Statics.field948][Statics.field2706.field463 >> 7][Statics.field2706.field404 >> 7] & 0x4) != 0) {
                                            var51 = Statics.field948;
                                        }
                                        var50 = var51;
                                    }
                                    var62 = var50;
                                }
                                int var63 = Statics.field330;
                                int var64 = Statics.field1963;
                                int var65 = Statics.field2690;
                                int var66 = Statics.field778;
                                int var67 = Statics.field750;
                                for (int var68 = 0; var68 < 5; var68++) {
                                    if (field718[var68]) {
                                        int var69 = (int) (Math.random() * (double) (field564[var68] * 2 + 1) - (double) field564[var68] + Math.sin((double) field721[var68] / 100.0D * (double) field538[var68]) * (double) field720[var68]);
                                        if (var68 == 0) {
                                            Statics.field330 += var69;
                                        }
                                        if (var68 == 1) {
                                            Statics.field1963 += var69;
                                        }
                                        if (var68 == 2) {
                                            Statics.field2690 += var69;
                                        }
                                        if (var68 == 3) {
                                            Statics.field750 = Statics.field750 + var69 & 0x7FF;
                                        }
                                        if (var68 == 4) {
                                            Statics.field778 += var69;
                                            if (Statics.field778 < 128) {
                                                Statics.field778 = 128;
                                            }
                                            if (Statics.field778 > 383) {
                                                Statics.field778 = 383;
                                            }
                                        }
                                    }
                                }
                                int var70 = class77.field1384;
                                int var71 = class77.field1385;
                                if (var70 >= var12 && var70 < var12 + var31 && var71 >= var13 && var71 < var13 + var32) {
                                    class112.field1901 = true;
                                    class112.field1904 = 0;
                                    class112.field1902 = class77.field1384 - var12;
                                    class112.field1878 = class77.field1385 - var13;
                                } else {
                                    class112.field1901 = false;
                                    class112.field1904 = 0;
                                }
                                method883();
                                class89.method1819(var12, var13, var31, var32, 0);
                                method883();
                                Statics.field1510.method1888(Statics.field330, Statics.field1963, Statics.field2690, Statics.field778, Statics.field750, var62);
                                method883();
                                Statics.field1510.method1864();
                                method2881(var12, var13, var31, var32);
                                method1323(var12, var13);
                                ((class110) Statics.field1766).method2191(field545);
                                if (field577 == 1) {
                                    Statics.field584[field664 / 100].method1663(field574 - 8, field499 - 8);
                                }
                                if (field577 == 2) {
                                    Statics.field584[field664 / 100 + 4].method1663(field574 - 8, field499 - 8);
                                }
                                field586 = 0;
                                int var72 = (Statics.field2706.field463 >> 7) + Statics.field80;
                                int var73 = (Statics.field2706.field404 >> 7) + Statics.field377;
                                if (var72 >= 3053 && var72 <= 3156 && var73 >= 3056 && var73 <= 3136) {
                                    field586 = 1;
                                }
                                if (var72 >= 3072 && var72 <= 3118 && var73 >= 9492 && var73 <= 9535) {
                                    field586 = 1;
                                }
                                if (field586 == 1 && var72 >= 3139 && var72 <= 3199 && var73 >= 3008 && var73 <= 3062) {
                                    field586 = 0;
                                }
                                if (field464) {
                                    int var74 = var12 + 512 - 5;
                                    int var75 = var13 + 20;
                                    Statics.field2345.method3422("Fps:" + field1318, var74, var75, 16776960, -1);
                                    int var179 = var75 + 15;
                                    Runtime var76 = Runtime.getRuntime();
                                    int var77 = (int) ((var76.totalMemory() - var76.freeMemory()) / 1024L);
                                    int var78 = 16776960;
                                    if (var77 > 32768 && field472) {
                                        var78 = 16711680;
                                    }
                                    if (var77 > 65536 && !field472) {
                                        var78 = 16711680;
                                    }
                                    Statics.field2345.method3422("Mem:" + var77 + "k", var74, var179, var78, -1);
                                    var75 = var179 + 15;
                                }
                                Statics.field330 = var63;
                                Statics.field1963 = var64;
                                Statics.field2690 = var65;
                                Statics.field778 = var66;
                                Statics.field750 = var67;
                                if (field475) {
                                    byte var79 = 0;
                                    int var80 = class153.field2516 + class153.field2511 + var79;
                                    if (var80 == 0) {
                                        field475 = false;
                                    }
                                }
                                if (field475) {
                                    class89.method1819(var12, var13, var31, var32, 0);
                                    method207(class134.field2266, false);
                                }
                                if (!field475 && !field609 && var70 >= var12 && var70 < var12 + var31 && var71 >= var13 && var71 < var13 + var32) {
                                    method800(var70, var71, var12, var13);
                                }
                                class89.method1799(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2565 == 1338) {
                                method2656(var12, var13, var11);
                                class89.method1799(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var82 = class77.field1384;
                        int var83 = class77.field1385;
                        if (!field609 && var82 >= var19 && var83 >= var20 && var82 < var21 && var83 < var22) {
                            method751(var10, var82 - var12, var83 - var13);
                        }
                        if (var10.field2574 == 0) {
                            if (!var10.field2662 && method2895(var10) && Statics.field228 != var10) {
                                continue;
                            }
                            if (!var10.field2662) {
                                if (var10.field2571 > var10.field2567 - var10.field2582) {
                                    var10.field2571 = var10.field2567 - var10.field2582;
                                }
                                if (var10.field2571 < 0) {
                                    var10.field2571 = 0;
                                }
                            }
                            method3043(arg0, var10.field2634, var19, var20, var21, var22, var12 - var10.field2585, var13 - var10.field2571, var11);
                            if (var10.field2679 != null) {
                                method3043(var10.field2679, var10.field2634, var19, var20, var21, var22, var12 - var10.field2585, var13 - var10.field2571, var11);
                            }
                            class4 var84 = (class4) field582.method3293((long) var10.field2634);
                            if (var84 != null) {
                                if (var84.field61 == 0 && class77.field1384 >= var19 && class77.field1385 >= var20 && class77.field1384 < var21 && class77.field1385 < var22 && !field609 && !field638) {
                                    field500[0] = class134.field2187;
                                    field616[0] = "";
                                    field613[0] = 1006;
                                    field722 = 1;
                                }
                                method159(var84.field56, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class89.method1799(arg2, arg3, arg4, arg5);
                            class104.method2098();
                        }
                        if (field581[var11] || field706 > 1) {
                            if (var10.field2574 == 0 && !var10.field2662 && var10.field2567 > var10.field2582) {
                                int var85 = var10.field2569 + var12;
                                int var86 = var10.field2571;
                                int var87 = var10.field2582;
                                int var88 = var10.field2567;
                                Statics.field1289[0].method1755(var85, var13);
                                Statics.field1289[1].method1755(var85, var13 + var87 - 16);
                                class89.method1819(var85, var13 + 16, 16, var87 - 32, field619);
                                int var89 = (var87 - 32) * var87 / var88;
                                if (var89 < 8) {
                                    var89 = 8;
                                }
                                int var90 = (var87 - 32 - var89) * var86 / (var88 - var87);
                                class89.method1819(var85, var13 + 16 + var90, 16, var89, field548);
                                class89.method1779(var85, var13 + 16 + var90, var89, field550);
                                class89.method1779(var85 + 1, var13 + 16 + var90, var89, field550);
                                class89.method1786(var85, var13 + 16 + var90, 16, field550);
                                class89.method1786(var85, var13 + 17 + var90, 16, field550);
                                class89.method1779(var85 + 15, var13 + 16 + var90, var89, field549);
                                class89.method1779(var85 + 14, var13 + 17 + var90, var89 - 1, field549);
                                class89.method1786(var85, var13 + 15 + var90 + var89, 16, field549);
                                class89.method1786(var85 + 1, var13 + 14 + var90 + var89, 15, field549);
                            }
                            if (var10.field2574 != 1) {
                                if (var10.field2574 == 2) {
                                    int var91 = 0;
                                    for (int var92 = 0; var92 < var10.field2582; var92++) {
                                        for (int var93 = 0; var93 < var10.field2569; var93++) {
                                            int var94 = (var10.field2608 + 32) * var93 + var12;
                                            int var95 = (var10.field2626 + 32) * var92 + var13;
                                            if (var91 < 20) {
                                                var94 += var10.field2627[var91];
                                                var95 += var10.field2593[var91];
                                            }
                                            if (var10.field2581[var91] > 0) {
                                                boolean var96 = false;
                                                boolean var97 = false;
                                                int var98 = var10.field2581[var91] - 1;
                                                if (var94 + 32 > arg2 && var94 < arg4 && var95 + 32 > arg3 && var95 < arg5 || Statics.field883 == var10 && field526 == var91) {
                                                    class86 var99;
                                                    if (field621 == 1 && Statics.field622 == var91 && Statics.field2024 == var10.field2634) {
                                                        var99 = class40.method122(var98, var10.field2675[var91], 2, 0, false);
                                                    } else {
                                                        var99 = class40.method122(var98, var10.field2675[var91], 1, 3153952, false);
                                                    }
                                                    if (var99 == null) {
                                                        method118(var10);
                                                    } else if (Statics.field883 == var10 && field526 == var91) {
                                                        int var100 = class77.field1384 - field605;
                                                        int var101 = class77.field1385 - field541;
                                                        if (var100 < 5 && var100 > -5) {
                                                            var100 = 0;
                                                        }
                                                        if (var101 < 5 && var101 > -5) {
                                                            var101 = 0;
                                                        }
                                                        if (field585 < 5) {
                                                            var100 = 0;
                                                            var101 = 0;
                                                        }
                                                        var99.method1715(var94 + var100, var95 + var101, 128);
                                                        if (arg1 != -1) {
                                                            class158 var102 = arg0[arg1 & 0xFFFF];
                                                            if (var95 + var101 < class89.field1488 && var102.field2571 > 0) {
                                                                int var103 = field545 * (class89.field1488 - var95 - var101) / 3;
                                                                if (var103 > field545 * 10) {
                                                                    var103 = field545 * 10;
                                                                }
                                                                if (var103 > var102.field2571) {
                                                                    var103 = var102.field2571;
                                                                }
                                                                var102.field2571 -= var103;
                                                                field541 += var103;
                                                                method118(var102);
                                                            }
                                                            if (var95 + var101 + 32 > class89.field1490 && var102.field2571 < var102.field2567 - var102.field2582) {
                                                                int var104 = field545 * (var95 + var101 + 32 - class89.field1490) / 3;
                                                                if (var104 > field545 * 10) {
                                                                    var104 = field545 * 10;
                                                                }
                                                                if (var104 > var102.field2567 - var102.field2582 - var102.field2571) {
                                                                    var104 = var102.field2567 - var102.field2582 - var102.field2571;
                                                                }
                                                                var102.field2571 += var104;
                                                                field541 -= var104;
                                                                method118(var102);
                                                            }
                                                        }
                                                    } else if (Statics.field1351 == var10 && field546 == var91) {
                                                        var99.method1715(var94, var95, 128);
                                                    } else {
                                                        var99.method1663(var94, var95);
                                                    }
                                                }
                                            } else if (var10.field2629 != null && var91 < 20) {
                                                class86 var105 = var10.method3096(var91);
                                                if (var105 != null) {
                                                    var105.method1663(var94, var95);
                                                } else if (class158.field2570) {
                                                    method118(var10);
                                                }
                                            }
                                            var91++;
                                        }
                                    }
                                } else if (var10.field2574 == 3) {
                                    int var106;
                                    if (method2651(var10)) {
                                        var106 = var10.field2590;
                                        if (Statics.field228 == var10 && var10.field2587 != 0) {
                                            var106 = var10.field2587;
                                        }
                                    } else {
                                        var106 = var10.field2589;
                                        if (Statics.field228 == var10 && var10.field2591 != 0) {
                                            var106 = var10.field2591;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2649) {
                                            class89.method1819(var12, var13, var10.field2569, var10.field2582, var106);
                                        } else {
                                            class89.method1775(var12, var13, var10.field2569, var10.field2582, var106);
                                        }
                                    } else if (var10.field2649) {
                                        class89.method1824(var12, var13, var10.field2569, var10.field2582, var106, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1792(var12, var13, var10.field2569, var10.field2582, var106, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2574 == 4) {
                                    class183 var107 = var10.method3095();
                                    if (var107 != null) {
                                        String var108 = var10.field2619;
                                        int var109;
                                        if (method2651(var10)) {
                                            var109 = var10.field2590;
                                            if (Statics.field228 == var10 && var10.field2587 != 0) {
                                                var109 = var10.field2587;
                                            }
                                            if (var10.field2620.length() > 0) {
                                                var108 = var10.field2620;
                                            }
                                        } else {
                                            var109 = var10.field2589;
                                            if (Statics.field228 == var10 && var10.field2591 != 0) {
                                                var109 = var10.field2591;
                                            }
                                        }
                                        if (var10.field2662 && var10.field2676 != -1) {
                                            class40 var110 = class40.method41(var10.field2676);
                                            var108 = var110.field984;
                                            if (var108 == null) {
                                                var108 = "null";
                                            }
                                            if ((var110.field995 == 1 || var10.field2677 != 1) && var10.field2677 != -1) {
                                                String var111 = class2.method2814(16748608) + var108 + class2.field27 + " " + 'x';
                                                int var112 = var10.field2677;
                                                String var113 = Integer.toString(var112);
                                                for (int var114 = var113.length() - 3; var114 > 0; var114 -= 3) {
                                                    var113 = var113.substring(0, var114) + class2.field23 + var113.substring(var114);
                                                }
                                                StringBuilder var10000;
                                                class134 var10001;
                                                String var115;
                                                if (var113.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2814(65408)).append(var113.substring(0, var113.length() - 8));
                                                    var10001 = (class134) null;
                                                    var115 = var10000.append(class134.field2219).append(" ").append(class2.field31).append(var113).append(class2.field24).append(class2.field27).toString();
                                                } else if (var113.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2814(16777215)).append(var113.substring(0, var113.length() - 4));
                                                    var10001 = (class134) null;
                                                    var115 = var10000.append(class134.field2221).append(" ").append(class2.field31).append(var113).append(class2.field24).append(class2.field27).toString();
                                                } else {
                                                    var115 = " " + class2.method2814(16776960) + var113 + class2.field27;
                                                }
                                                var108 = var111 + var115;
                                            }
                                        }
                                        if (field516 == var10) {
                                            class134 var180 = (class134) null;
                                            var108 = class134.field2216;
                                            var109 = var10.field2589;
                                        }
                                        if (!var10.field2662) {
                                            var108 = method1518(var108, var10);
                                        }
                                        var107.method3446(var108, var12, var13, var10.field2569, var10.field2582, var109, var10.field2624 ? 0 : -1, var10.field2622, var10.field2586, var10.field2572);
                                    } else if (class158.field2570) {
                                        method118(var10);
                                    }
                                } else if (var10.field2574 == 5) {
                                    if (var10.field2662) {
                                        class86 var117;
                                        if (var10.field2676 == -1) {
                                            var117 = var10.method3094(false);
                                        } else {
                                            var117 = class40.method122(var10.field2676, var10.field2677, var10.field2600, var10.field2680, false);
                                        }
                                        if (var117 != null) {
                                            int var118 = var117.field1469;
                                            int var119 = var117.field1464;
                                            if (var10.field2599) {
                                                class89.method1768(var12, var13, var10.field2569 + var12, var10.field2582 + var13);
                                                int var120 = (var10.field2569 + (var118 - 1)) / var118;
                                                int var121 = (var10.field2582 + (var119 - 1)) / var119;
                                                for (int var122 = 0; var122 < var120; var122++) {
                                                    for (int var123 = 0; var123 < var121; var123++) {
                                                        if (var10.field2598 != 0) {
                                                            var117.method1695(var118 / 2 + var118 * var122 + var12, var119 / 2 + var119 * var123 + var13, var10.field2598, 4096);
                                                        } else if (var14 == 0) {
                                                            var117.method1663(var118 * var122 + var12, var119 * var123 + var13);
                                                        } else {
                                                            var117.method1715(var118 * var122 + var12, var119 * var123 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1799(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var124 = var10.field2569 * 4096 / var118;
                                                if (var10.field2598 != 0) {
                                                    var117.method1695(var10.field2569 / 2 + var12, var10.field2582 / 2 + var13, var10.field2598, var124);
                                                } else if (var14 != 0) {
                                                    var117.method1671(var12, var13, var10.field2569, var10.field2582, 256 - (var14 & 0xFF));
                                                } else if (var10.field2569 == var118 && var10.field2582 == var119) {
                                                    var117.method1663(var12, var13);
                                                } else {
                                                    var117.method1665(var12, var13, var10.field2569, var10.field2582);
                                                }
                                            }
                                        } else if (class158.field2570) {
                                            method118(var10);
                                        }
                                    } else {
                                        class86 var116 = var10.method3094(method2651(var10));
                                        if (var116 != null) {
                                            var116.method1663(var12, var13);
                                        } else if (class158.field2570) {
                                            method118(var10);
                                        }
                                    }
                                } else if (var10.field2574 == 6) {
                                    boolean var125 = method2651(var10);
                                    int var126;
                                    if (var125) {
                                        var126 = var10.field2609;
                                    } else {
                                        var126 = var10.field2644;
                                    }
                                    class112 var127 = null;
                                    int var128 = 0;
                                    if (var10.field2676 != -1) {
                                        class40 var129 = class40.method41(var10.field2676);
                                        if (var129 != null) {
                                            class40 var130 = var129.method823(var10.field2677);
                                            var127 = var130.method822(1);
                                            if (var127 == null) {
                                                method118(var10);
                                            } else {
                                                var127.method2270();
                                                var128 = var127.field1549 / 2;
                                            }
                                        }
                                    } else if (var10.field2604 == 5) {
                                        if (var10.field2605 == 0) {
                                            var127 = field644.method3161((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var127 = Statics.field2706.method30();
                                        }
                                    } else if (var126 == -1) {
                                        var127 = var10.method3097((class34) null, -1, var125, Statics.field2706.field39);
                                        if (var127 == null && class158.field2570) {
                                            method118(var10);
                                        }
                                    } else {
                                        class34 var131 = class34.method1536(var126);
                                        var127 = var10.method3097(var131, var10.field2678, var125, Statics.field2706.field39);
                                        if (var127 == null && class158.field2570) {
                                            method118(var10);
                                        }
                                    }
                                    class104.method2099(var10.field2569 / 2 + var12, var10.field2582 / 2 + var13);
                                    int var132 = var10.field2615 * class104.field1778[var10.field2612] >> 16;
                                    int var133 = var10.field2615 * class104.field1779[var10.field2612] >> 16;
                                    if (var127 != null) {
                                        if (var10.field2662) {
                                            var127.method2270();
                                            if (var10.field2617) {
                                                var127.method2219(0, var10.field2613, var10.field2614, var10.field2612, var10.field2610, var10.field2611 + var128 + var132, var10.field2611 + var133, var10.field2615);
                                            } else {
                                                var127.method2218(0, var10.field2613, var10.field2614, var10.field2612, var10.field2610, var10.field2611 + var128 + var132, var10.field2611 + var133);
                                            }
                                        } else {
                                            var127.method2218(0, var10.field2613, 0, var10.field2612, 0, var132, var133);
                                        }
                                    }
                                    class104.method2157();
                                } else {
                                    if (var10.field2574 == 7) {
                                        class183 var134 = var10.method3095();
                                        if (var134 == null) {
                                            if (class158.field2570) {
                                                method118(var10);
                                            }
                                            continue;
                                        }
                                        int var135 = 0;
                                        for (int var136 = 0; var136 < var10.field2582; var136++) {
                                            for (int var137 = 0; var137 < var10.field2569; var137++) {
                                                if (var10.field2581[var135] > 0) {
                                                    class40 var138 = class40.method41(var10.field2581[var135] - 1);
                                                    String var139;
                                                    if (var138.field995 != 1 && var10.field2675[var135] == 1) {
                                                        var139 = class2.method2814(16748608) + var138.field984 + class2.field27;
                                                    } else {
                                                        String var140 = class2.method2814(16748608) + var138.field984 + class2.field27 + " " + 'x';
                                                        int var141 = var10.field2675[var135];
                                                        String var142 = Integer.toString(var141);
                                                        for (int var143 = var142.length() - 3; var143 > 0; var143 -= 3) {
                                                            var142 = var142.substring(0, var143) + class2.field23 + var142.substring(var143);
                                                        }
                                                        String var144;
                                                        if (var142.length() > 9) {
                                                            var144 = " " + class2.method2814(65408) + var142.substring(0, var142.length() - 8) + class134.field2219 + " " + class2.field31 + var142 + class2.field24 + class2.field27;
                                                        } else if (var142.length() > 6) {
                                                            var144 = " " + class2.method2814(16777215) + var142.substring(0, var142.length() - 4) + class134.field2221 + " " + class2.field31 + var142 + class2.field24 + class2.field27;
                                                        } else {
                                                            var144 = " " + class2.method2814(16776960) + var142 + class2.field27;
                                                        }
                                                        var139 = var140 + var144;
                                                    }
                                                    int var145 = (var10.field2608 + 115) * var137 + var12;
                                                    int var146 = (var10.field2626 + 12) * var136 + var13;
                                                    if (var10.field2622 == 0) {
                                                        var134.method3390(var139, var145, var146, var10.field2589, var10.field2624 ? 0 : -1);
                                                    } else if (var10.field2622 == 1) {
                                                        var134.method3433(var139, var10.field2569 / 2 + var145, var146, var10.field2589, var10.field2624 ? 0 : -1);
                                                    } else {
                                                        var134.method3422(var139, var10.field2569 + var145 - 1, var146, var10.field2589, var10.field2624 ? 0 : -1);
                                                    }
                                                }
                                                var135++;
                                            }
                                        }
                                    }
                                    if (var10.field2574 == 8 && Statics.field349 == var10 && field598 == field514) {
                                        int var147 = 0;
                                        int var148 = 0;
                                        class183 var149 = Statics.field2345;
                                        String var150 = var10.field2619;
                                        String var151 = method1518(var150, var10);
                                        while (var151.length() > 0) {
                                            int var152 = var151.indexOf(class2.field26);
                                            String var153;
                                            if (var152 == -1) {
                                                var153 = var151;
                                                var151 = "";
                                            } else {
                                                var153 = var151.substring(0, var152);
                                                var151 = var151.substring(var152 + 4);
                                            }
                                            int var154 = var149.method3465(var153);
                                            if (var154 > var147) {
                                                var147 = var154;
                                            }
                                            var148 += var149.field2841 + 1;
                                        }
                                        var147 += 6;
                                        var148 += 7;
                                        int var155 = var10.field2569 + var12 - 5 - var147;
                                        int var156 = var10.field2582 + var13 + 5;
                                        if (var155 < var12 + 5) {
                                            var155 = var12 + 5;
                                        }
                                        if (var147 + var155 > arg4) {
                                            var155 = arg4 - var147;
                                        }
                                        if (var148 + var156 > arg5) {
                                            var156 = arg5 - var148;
                                        }
                                        class89.method1819(var155, var156, var147, var148, 16777120);
                                        class89.method1775(var155, var156, var147, var148, 0);
                                        String var157 = var10.field2619;
                                        int var158 = var149.field2841 + var156 + 2;
                                        String var159 = method1518(var157, var10);
                                        while (var159.length() > 0) {
                                            int var160 = var159.indexOf(class2.field26);
                                            String var161;
                                            if (var160 == -1) {
                                                var161 = var159;
                                                var159 = "";
                                            } else {
                                                var161 = var159.substring(0, var160);
                                                var159 = var159.substring(var160 + 4);
                                            }
                                            var149.method3390(var161, var155 + 3, var158, 0, -1);
                                            var158 += var149.field2841 + 1;
                                        }
                                    }
                                    if (var10.field2574 == 9) {
                                        if (var10.field2596 == 1) {
                                            class89.method1781(var12, var13, var10.field2569 + var12, var10.field2582 + var13, var10.field2589);
                                        } else {
                                            int var162 = var10.field2569 >= 0 ? var10.field2569 : -var10.field2569;
                                            int var163 = var10.field2582 >= 0 ? var10.field2582 : -var10.field2582;
                                            int var164 = var162;
                                            if (var162 < var163) {
                                                var164 = var163;
                                            }
                                            if (var164 != 0) {
                                                int var165 = (var10.field2569 << 16) / var164;
                                                int var166 = (var10.field2582 << 16) / var164;
                                                if (var166 <= var165) {
                                                    var165 = -var165;
                                                } else {
                                                    var166 = -var166;
                                                }
                                                int var167 = var10.field2596 * var166 >> 17;
                                                int var168 = var10.field2596 * var166 + 1 >> 17;
                                                int var169 = var10.field2596 * var165 >> 17;
                                                int var170 = var10.field2596 * var165 + 1 >> 17;
                                                int var171 = var12 + var167;
                                                int var172 = var12 - var168;
                                                int var173 = var10.field2569 + var12 - var168;
                                                int var174 = var10.field2569 + var12 + var167;
                                                int var175 = var13 + var169;
                                                int var176 = var13 - var170;
                                                int var177 = var10.field2582 + var13 - var170;
                                                int var178 = var10.field2582 + var13 + var169;
                                                class104.method2142(var171, var172, var173);
                                                class104.method2117(var175, var176, var177, var171, var172, var173, var10.field2589);
                                                class104.method2142(var171, var173, var174);
                                                class104.method2117(var175, var177, var178, var171, var173, var174, var10.field2589);
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

    @ObfuscatedName("bc.cp(Ljava/lang/String;Lff;I)Ljava/lang/String;")
    public static String method1518(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method1427(method104(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field260 != null) {
                    var5 = class147.method1409(Statics.field260.field1400);
                    if (Statics.field260.field1408 != null) {
                        var5 = (String) Statics.field260.field1408;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.co(Lff;IIIIIII)V")
    public static final void method188(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field655) {
            field552 = 32;
        } else {
            field552 = 0;
        }
        field655 = false;
        if (class77.field1392 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2571 -= 4;
                method118(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2571 += 4;
                method118(arg0);
            } else if (arg5 >= arg1 - field552 && arg5 < field552 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2571 = (arg4 - arg3) * var8 / var9;
                method118(arg0);
                field655 = true;
            }
        }
        if (field665 == 0) {
            return;
        }
        int var10 = arg0.field2569;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2571 += field665 * 45;
            method118(arg0);
        }
    }

    @ObfuscatedName("bj.ch(II)Ljava/lang/String;")
    public static final String method1427(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("eu.cr(Lff;I)Z")
    public static final boolean method2651(class158 arg0) {
        if (arg0.field2669 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2669.length; var1++) {
            int var2 = method104(arg0, var1);
            int var3 = arg0.field2659[var1];
            if (arg0.field2669[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2669[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2669[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("f.ci(Lff;II)I")
    public static final int method104(class158 arg0, int arg1) {
        if (arg0.field2668 == null || arg1 >= arg0.field2668.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2668[arg1];
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
                    var7 = field653[var2[var4++]];
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
                    class158 var11 = class158.method2199(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method41(var12).field1004 || field714)) {
                        for (int var13 = 0; var13 < var11.field2581.length; var13++) {
                            if (var12 + 1 == var11.field2581[var13]) {
                                var7 += var11.field2675[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2693[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2030[field606[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2693[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2706.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2031[var14]) {
                            var7 += field606[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method2199(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method41(var18).field1004 || field714)) {
                        for (int var19 = 0; var19 < var17.field2581.length; var19++) {
                            if (var18 + 1 == var17.field2581[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field634;
                }
                if (var6 == 12) {
                    var7 = field635;
                }
                if (var6 == 13) {
                    int var20 = class159.field2693[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method2666(var22);
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
                    var7 = (Statics.field2706.field463 >> 7) + Statics.field80;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2706.field404 >> 7) + Statics.field377;
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

    @ObfuscatedName("ad.cj(Lff;III)V")
    public static final void method751(class158 arg0, int arg1, int arg2) {
        if (arg0.field2688 == 1) {
            method1519(arg0.field2673, "", 24, 0, 0, arg0.field2634);
        }
        if (arg0.field2688 == 2 && !field727) {
            String var3;
            if (class162.method134(method1434(arg0)) == 0) {
                var3 = null;
            } else if (arg0.field2653 == null || arg0.field2653.trim().length() == 0) {
                var3 = null;
            } else {
                var3 = arg0.field2653;
            }
            if (var3 != null) {
                method1519(var3, class2.method2814(65280) + arg0.field2658, 25, 0, -1, arg0.field2634);
            }
        }
        if (arg0.field2688 == 3) {
            method1519(class134.field2217, "", 26, 0, 0, arg0.field2634);
        }
        if (arg0.field2688 == 4) {
            method1519(arg0.field2673, "", 28, 0, 0, arg0.field2634);
        }
        if (arg0.field2688 == 5) {
            method1519(arg0.field2673, "", 29, 0, 0, arg0.field2634);
        }
        if (arg0.field2688 == 6 && field516 == null) {
            method1519(arg0.field2673, "", 30, 0, -1, arg0.field2634);
        }
        if (arg0.field2574 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field2582; var6++) {
                for (int var7 = 0; var7 < arg0.field2569; var7++) {
                    int var8 = (arg0.field2608 + 32) * var7;
                    int var9 = (arg0.field2626 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg0.field2627[var5];
                        var9 += arg0.field2593[var5];
                    }
                    if (arg1 >= var8 && arg2 >= var9 && arg1 < var8 + 32 && arg2 < var9 + 32) {
                        field560 = var5;
                        Statics.field1023 = arg0;
                        if (arg0.field2581[var5] > 0) {
                            label371: {
                                class40 var10 = class40.method41(arg0.field2581[var5] - 1);
                                if (field621 == 1) {
                                    int var11 = method1434(arg0);
                                    boolean var12 = (var11 >> 30 & 0x1) != 0;
                                    if (var12) {
                                        if (Statics.field2024 != arg0.field2634 || Statics.field622 != var5) {
                                            method1519(class134.field2194, field666 + " " + class2.field25 + " " + class2.method2814(16748608) + var10.field984, 31, var10.field982, var5, arg0.field2634);
                                        }
                                        break label371;
                                    }
                                }
                                if (field727) {
                                    int var13 = method1434(arg0);
                                    boolean var14 = (var13 >> 30 & 0x1) != 0;
                                    if (var14) {
                                        if ((Statics.field1919 & 0x10) == 16) {
                                            method1519(field627, field628 + " " + class2.field25 + " " + class2.method2814(16748608) + var10.field984, 32, var10.field982, var5, arg0.field2634);
                                        }
                                        break label371;
                                    }
                                }
                                String[] var15 = var10.field999;
                                if (field633) {
                                    var15 = method234(var15);
                                }
                                int var16 = method1434(arg0);
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
                                            method1519(var15[var18], class2.method2814(16748608) + var10.field984, var19, var10.field982, var5, arg0.field2634);
                                        } else if (var18 == 4) {
                                            method1519(class134.field2192, class2.method2814(16748608) + var10.field984, 37, var10.field982, var5, arg0.field2634);
                                        }
                                    }
                                }
                                class162 var10000 = (class162) null;
                                if (class162.method32(method1434(arg0))) {
                                    method1519(class134.field2194, class2.method2814(16748608) + var10.field984, 38, var10.field982, var5, arg0.field2634);
                                }
                                int var20 = method1434(arg0);
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
                                            method1519(var15[var22], class2.method2814(16748608) + var10.field984, var23, var10.field982, var5, arg0.field2634);
                                        }
                                    }
                                }
                                String[] var24 = arg0.field2630;
                                if (field633) {
                                    var24 = method234(var24);
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
                                            method1519(var24[var25], class2.method2814(16748608) + var10.field984, var26, var10.field982, var5, arg0.field2634);
                                        }
                                    }
                                }
                                method1519(class134.field2169, class2.method2814(16748608) + var10.field984, 1005, var10.field982, var5, arg0.field2634);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field2662) {
            return;
        }
        if (field727) {
            int var27 = method1434(arg0);
            boolean var28 = (var27 >> 21 & 0x1) != 0;
            if (var28 && (Statics.field1919 & 0x20) == 32) {
                method1519(field627, field628 + " " + class2.field25 + " " + arg0.field2632, 58, 0, arg0.field2573, arg0.field2634);
            }
            return;
        }
        for (int var29 = 9; var29 >= 5; var29--) {
            int var30 = method1434(arg0);
            boolean var31 = (var30 >> var29 + 1 & 0x1) != 0;
            String var32;
            if (!var31 && arg0.field2670 == null) {
                var32 = null;
            } else if (arg0.field2633 == null || arg0.field2633.length <= var29 || arg0.field2633[var29] == null || arg0.field2633[var29].trim().length() == 0) {
                var32 = null;
            } else {
                var32 = arg0.field2633[var29];
            }
            if (var32 != null) {
                method1519(var32, arg0.field2632, 1007, var29 + 1, arg0.field2573, arg0.field2634);
            }
        }
        String var34;
        if (class162.method134(method1434(arg0)) == 0) {
            var34 = null;
        } else if (arg0.field2653 == null || arg0.field2653.trim().length() == 0) {
            var34 = null;
        } else {
            var34 = arg0.field2653;
        }
        if (var34 != null) {
            method1519(var34, arg0.field2632, 25, 0, arg0.field2573, arg0.field2634);
        }
        for (int var36 = 4; var36 >= 0; var36--) {
            int var37 = method1434(arg0);
            boolean var38 = (var37 >> var36 + 1 & 0x1) != 0;
            String var39;
            if (!var38 && arg0.field2670 == null) {
                var39 = null;
            } else if (arg0.field2633 == null || arg0.field2633.length <= var36 || arg0.field2633[var36] == null || arg0.field2633[var36].trim().length() == 0) {
                var39 = null;
            } else {
                var39 = arg0.field2633[var36];
            }
            if (var39 != null) {
                method1519(var39, arg0.field2632, 57, var36 + 1, arg0.field2573, arg0.field2634);
            }
        }
        int var41 = method1434(arg0);
        boolean var42 = (var41 & 0x1) != 0;
        if (var42) {
            method1519(class134.field2231, "", 30, 0, arg0.field2573, arg0.field2634);
        }
    }

    @ObfuscatedName("cj.cb([Lff;IIIIIIIS)V")
    public static final void method1839(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2662 || var9.field2574 == 0 || var9.field2576 || method1434(var9) != 0 || field641 == var9) && var9.field2648 == arg1 && (!var9.field2662 || !method2895(var9))) {
                int var10 = var9.field2577 + arg6;
                int var11 = var9.field2578 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2574 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2574 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2569 + var10;
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
                    int var22 = var9.field2569 + var10;
                    int var23 = var9.field2582 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field640 == var9) {
                    field648 = true;
                    field649 = var10;
                    field650 = var11;
                }
                if (!var9.field2662 || var12 < var14 && var13 < var15) {
                    if (var9.field2565 == 1337) {
                        method118(var9);
                    } else if (var9.field2565 == 1338) {
                        method232(var10, var11);
                    } else {
                        if (var9.field2574 == 0) {
                            if (!var9.field2662 && method2895(var9) && Statics.field228 != var9) {
                                continue;
                            }
                            method1839(arg0, var9.field2634, var12, var13, var14, var15, var10 - var9.field2585, var11 - var9.field2571);
                            if (var9.field2679 != null) {
                                method1839(var9.field2679, var9.field2634, var12, var13, var14, var15, var10 - var9.field2585, var11 - var9.field2571);
                            }
                            class4 var24 = (class4) field582.method3293((long) var9.field2634);
                            if (var24 != null) {
                                int var25 = var24.field56;
                                if (class158.method1643(var25)) {
                                    method1839(Statics.field2588[var25], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2662) {
                            boolean var26;
                            if (class77.field1384 >= var12 && class77.field1385 >= var13 && class77.field1384 < var14 && class77.field1385 < var15) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class77.field1392 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class77.field1390 == 1 && class77.field1391 >= var12 && class77.field1398 >= var13 && class77.field1391 < var14 && class77.field1398 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                method193(var9, class77.field1391 - var10, class77.field1398 - var11);
                            }
                            if (field640 != null && field640 != var9 && var26) {
                                int var29 = method1434(var9);
                                boolean var30 = (var29 >> 20 & 0x1) != 0;
                                if (var30) {
                                    field728 = var9;
                                }
                            }
                            if (field641 == var9) {
                                field645 = true;
                                field646 = var10;
                                field626 = var11;
                            }
                            if (var9.field2576) {
                                if (var26 && field665 != 0 && var9.field2660 != null) {
                                    class1 var31 = new class1();
                                    var31.field2 = var9;
                                    var31.field4 = field665;
                                    var31.field3 = var9.field2660;
                                    field601.method3326(var31);
                                }
                                if (field640 != null || Statics.field883 != null || field609) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var9.field2575 && var28) {
                                    var9.field2575 = true;
                                    if (var9.field2641 != null) {
                                        class1 var32 = new class1();
                                        var32.field2 = var9;
                                        var32.field13 = class77.field1391 - var10;
                                        var32.field4 = class77.field1398 - var11;
                                        var32.field3 = var9.field2641;
                                        field601.method3326(var32);
                                    }
                                }
                                if (var9.field2575 && var27 && var9.field2642 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = var9;
                                    var33.field13 = class77.field1384 - var10;
                                    var33.field4 = class77.field1385 - var11;
                                    var33.field3 = var9.field2642;
                                    field601.method3326(var33);
                                }
                                if (var9.field2575 && !var27) {
                                    var9.field2575 = false;
                                    if (var9.field2643 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = var9;
                                        var34.field13 = class77.field1384 - var10;
                                        var34.field4 = class77.field1385 - var11;
                                        var34.field3 = var9.field2643;
                                        field668.method3326(var34);
                                    }
                                }
                                if (var27 && var9.field2592 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = var9;
                                    var35.field13 = class77.field1384 - var10;
                                    var35.field4 = class77.field1385 - var11;
                                    var35.field3 = var9.field2592;
                                    field601.method3326(var35);
                                }
                                if (!var9.field2628 && var26) {
                                    var9.field2628 = true;
                                    if (var9.field2645 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = var9;
                                        var36.field13 = class77.field1384 - var10;
                                        var36.field4 = class77.field1385 - var11;
                                        var36.field3 = var9.field2645;
                                        field601.method3326(var36);
                                    }
                                }
                                if (var9.field2628 && var26 && var9.field2646 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = var9;
                                    var37.field13 = class77.field1384 - var10;
                                    var37.field4 = class77.field1385 - var11;
                                    var37.field3 = var9.field2646;
                                    field601.method3326(var37);
                                }
                                if (var9.field2628 && !var26) {
                                    var9.field2628 = false;
                                    if (var9.field2647 != null) {
                                        class1 var38 = new class1();
                                        var38.field2 = var9;
                                        var38.field13 = class77.field1384 - var10;
                                        var38.field4 = class77.field1385 - var11;
                                        var38.field3 = var9.field2647;
                                        field668.method3326(var38);
                                    }
                                }
                                if (var9.field2681 != null) {
                                    class1 var39 = new class1();
                                    var39.field2 = var9;
                                    var39.field3 = var9.field2681;
                                    field667.method3326(var39);
                                }
                                if (var9.field2595 != null && field654 > var9.field2684) {
                                    if (var9.field2664 == null || field654 - var9.field2684 > 32) {
                                        class1 var44 = new class1();
                                        var44.field2 = var9;
                                        var44.field3 = var9.field2595;
                                        field601.method3326(var44);
                                    } else {
                                        label386: for (int var40 = var9.field2684; var40 < field654; var40++) {
                                            int var41 = field533[var40 & 0x1F];
                                            for (int var42 = 0; var42 < var9.field2664.length; var42++) {
                                                if (var9.field2664[var42] == var41) {
                                                    class1 var43 = new class1();
                                                    var43.field2 = var9;
                                                    var43.field3 = var9.field2595;
                                                    field601.method3326(var43);
                                                    break label386;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2684 = field654;
                                }
                                if (var9.field2654 != null && field656 > var9.field2685) {
                                    if (var9.field2655 == null || field656 - var9.field2685 > 32) {
                                        class1 var49 = new class1();
                                        var49.field2 = var9;
                                        var49.field3 = var9.field2654;
                                        field601.method3326(var49);
                                    } else {
                                        label366: for (int var45 = var9.field2685; var45 < field656; var45++) {
                                            int var46 = field519[var45 & 0x1F];
                                            for (int var47 = 0; var47 < var9.field2655.length; var47++) {
                                                if (var9.field2655[var47] == var46) {
                                                    class1 var48 = new class1();
                                                    var48.field2 = var9;
                                                    var48.field3 = var9.field2654;
                                                    field601.method3326(var48);
                                                    break label366;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2685 = field656;
                                }
                                if (var9.field2656 != null && field529 > var9.field2686) {
                                    if (var9.field2657 == null || field529 - var9.field2686 > 32) {
                                        class1 var54 = new class1();
                                        var54.field2 = var9;
                                        var54.field3 = var9.field2656;
                                        field601.method3326(var54);
                                    } else {
                                        label346: for (int var50 = var9.field2686; var50 < field529; var50++) {
                                            int var51 = field657[var50 & 0x1F];
                                            for (int var52 = 0; var52 < var9.field2657.length; var52++) {
                                                if (var9.field2657[var52] == var51) {
                                                    class1 var53 = new class1();
                                                    var53.field2 = var9;
                                                    var53.field3 = var9.field2656;
                                                    field601.method3326(var53);
                                                    break label346;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2686 = field529;
                                }
                                if (field659 > var9.field2683 && var9.field2652 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field3 = var9.field2652;
                                    field601.method3326(var55);
                                }
                                if (field660 > var9.field2683 && var9.field2663 != null) {
                                    class1 var56 = new class1();
                                    var56.field2 = var9;
                                    var56.field3 = var9.field2663;
                                    field601.method3326(var56);
                                }
                                if (field671 > var9.field2683 && var9.field2682 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field3 = var9.field2682;
                                    field601.method3326(var57);
                                }
                                if (field662 > var9.field2683 && var9.field2661 != null) {
                                    class1 var58 = new class1();
                                    var58.field2 = var9;
                                    var58.field3 = var9.field2661;
                                    field601.method3326(var58);
                                }
                                var9.field2683 = field517;
                                if (var9.field2583 != null) {
                                    for (int var59 = 0; var59 < field690; var59++) {
                                        class1 var60 = new class1();
                                        var60.field2 = var9;
                                        var60.field7 = field692[var59];
                                        var60.field8 = field691[var59];
                                        var60.field3 = var9.field2583;
                                        field601.method3326(var60);
                                    }
                                }
                            }
                        }
                        if (!var9.field2662) {
                            if (field640 != null || Statics.field883 != null || field609) {
                                return;
                            }
                            if ((var9.field2671 >= 0 || var9.field2591 != 0) && class77.field1384 >= var12 && class77.field1385 >= var13 && class77.field1384 < var14 && class77.field1385 < var15) {
                                if (var9.field2671 >= 0) {
                                    Statics.field228 = arg0[var9.field2671];
                                } else {
                                    Statics.field228 = var9;
                                }
                            }
                            if (var9.field2574 == 8 && class77.field1384 >= var12 && class77.field1385 >= var13 && class77.field1384 < var14 && class77.field1385 < var15) {
                                Statics.field349 = var9;
                            }
                            if (var9.field2567 > var9.field2582) {
                                method188(var9, var9.field2569 + var10, var11, var9.field2582, var9.field2567, class77.field1384, class77.field1385);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ds.cy(IIB)V")
    public static final void method2288(int arg0, int arg1) {
        if (class158.method1643(arg0)) {
            method2345(Statics.field2588[arg0], arg1);
        }
    }

    @ObfuscatedName("dk.cn([Lff;IB)V")
    public static final void method2345(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2574 == 0) {
                    if (var3.field2679 != null) {
                        method2345(var3.field2679, arg1);
                    }
                    class4 var4 = (class4) field582.method3293((long) var3.field2634);
                    if (var4 != null) {
                        method2288(var4.field56, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2672 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field3 = var3.field2672;
                    class26.method132(var5);
                }
                if (arg1 == 1 && var3.field2667 != null) {
                    if (var3.field2573 >= 0) {
                        class158 var6 = class158.method2199(var3.field2634);
                        if (var6 == null || var6.field2679 == null || var3.field2573 >= var6.field2679.length || var6.field2679[var3.field2573] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field3 = var3.field2667;
                    class26.method132(var7);
                }
            }
        }
    }

    @ObfuscatedName("y.cl(Lff;III)V")
    public static final void method193(class158 arg0, int arg1, int arg2) {
        if (field640 != null || field609 || arg0 == null || method1240(arg0) == null) {
            return;
        }
        field640 = arg0;
        field641 = method1240(arg0);
        field642 = arg1;
        field495 = arg2;
        Statics.field1441 = 0;
        field651 = false;
    }

    @ObfuscatedName("di.cv(B)V")
    public static final void method2351() {
        method118(field640);
        Statics.field1441++;
        if (field648 && field645) {
            int var0 = class77.field1384;
            int var1 = class77.field1385;
            int var2 = var0 - field642;
            int var3 = var1 - field495;
            if (var2 < field646) {
                var2 = field646;
            }
            if (field640.field2569 + var2 > field646 + field641.field2569) {
                var2 = field646 + field641.field2569 - field640.field2569;
            }
            if (var3 < field626) {
                var3 = field626;
            }
            if (field640.field2582 + var3 > field626 + field641.field2582) {
                var3 = field626 + field641.field2582 - field640.field2582;
            }
            int var4 = var2 - field649;
            int var5 = var3 - field650;
            int var6 = field640.field2635;
            if (Statics.field1441 > field640.field2636 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field651 = true;
            }
            int var7 = field641.field2585 + (var2 - field646);
            int var8 = field641.field2571 + (var3 - field626);
            if (field640.field2640 != null && field651) {
                class1 var9 = new class1();
                var9.field2 = field640;
                var9.field13 = var7;
                var9.field4 = var8;
                var9.field3 = field640.field2640;
                class26.method132(var9);
            }
            if (class77.field1392 == 0) {
                if (field651) {
                    if (field640.field2674 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field640;
                        var10.field13 = var7;
                        var10.field4 = var8;
                        var10.field19 = field728;
                        var10.field3 = field640.field2674;
                        class26.method132(var10);
                    }
                    if (field728 != null && method2200(field640) != null) {
                        field505.method2295(105);
                        field505.method2568(field640.field2573);
                        field505.method2568(field728.field2573);
                        field505.method2448(field728.field2634);
                        field505.method2454(field640.field2634);
                    }
                } else if ((field465 == 1 || method1650(field722 - 1)) && field722 > 2) {
                    method206();
                } else if (field722 > 0) {
                    method36(field722 - 1);
                }
                field640 = null;
            }
        } else if (Statics.field1441 > 1) {
            field640 = null;
        }
    }

    @ObfuscatedName("z.cd(Lff;B)V")
    public static void method118(class158 arg0) {
        if (field698 == arg0.field2638) {
            field672[arg0.field2687] = true;
        }
    }

    @ObfuscatedName("m.cz(B)V")
    public static void method12() {
        for (class4 var0 = (class4) field582.method3312(); var0 != null; var0 = (class4) field582.method3297()) {
            int var1 = var0.field56;
            if (class158.method1643(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2588[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2662;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2814;
                    class158 var6 = class158.method2199(var5);
                    if (var6 != null) {
                        method118(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.cx(Lff;I)Lff;")
    public static class158 method1240(class158 arg0) {
        class158 var1 = method2200(arg0);
        if (var1 == null) {
            var1 = arg0.field2639;
        }
        return var1;
    }

    @ObfuscatedName("ah.ck([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method234(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("en.cs(IB)V")
    public static final void method2888(int arg0) {
        if (class158.method1643(arg0)) {
            method2389(Statics.field2588[arg0], -1);
        }
    }

    @ObfuscatedName("de.cf([Lff;II)V")
    public static final void method2389(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2648 == arg1 && (!var3.field2662 || !method2895(var3))) {
                if (var3.field2574 == 0) {
                    if (!var3.field2662 && method2895(var3) && Statics.field228 != var3) {
                        continue;
                    }
                    method2389(arg0, var3.field2634);
                    if (var3.field2679 != null) {
                        method2389(var3.field2679, var3.field2634);
                    }
                    class4 var4 = (class4) field582.method3293((long) var3.field2634);
                    if (var4 != null) {
                        method2888(var4.field56);
                    }
                }
                if (var3.field2574 == 6) {
                    if (var3.field2644 != -1 || var3.field2609 != -1) {
                        boolean var5 = method2651(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2609;
                        } else {
                            var6 = var3.field2644;
                        }
                        if (var6 != -1) {
                            class34 var7 = class34.method1536(var6);
                            var3.field2625 += field545;
                            while (var3.field2625 > var7.field872[var3.field2678]) {
                                var3.field2625 -= var7.field872[var3.field2678];
                                var3.field2678++;
                                if (var3.field2678 >= var7.field870.length) {
                                    var3.field2678 -= var7.field874;
                                    if (var3.field2678 < 0 || var3.field2678 >= var7.field870.length) {
                                        var3.field2678 = 0;
                                    }
                                }
                                method118(var3);
                            }
                        }
                    }
                    if (var3.field2616 != 0 && !var3.field2662) {
                        int var8 = var3.field2616 >> 16;
                        int var9 = var3.field2616 << 16 >> 16;
                        int var10 = field545 * var8;
                        int var11 = field545 * var9;
                        var3.field2612 = var3.field2612 + var10 & 0x7FF;
                        var3.field2613 = var3.field2613 + var11 & 0x7FF;
                        method118(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("f.dy(Lff;I)V")
    public static final void method105(class158 arg0) {
        int var1 = arg0.field2565;
        if (var1 == 324) {
            if (field730 == -1) {
                field730 = arg0.field2601;
                field731 = arg0.field2597;
            }
            if (field644.field2714) {
                arg0.field2601 = field730;
            } else {
                arg0.field2601 = field731;
            }
        } else if (var1 == 325) {
            if (field730 == -1) {
                field730 = arg0.field2601;
                field731 = arg0.field2597;
            }
            if (field644.field2714) {
                arg0.field2601 = field731;
            } else {
                arg0.field2601 = field730;
            }
        } else if (var1 == 327) {
            arg0.field2612 = 150;
            arg0.field2613 = (int) (Math.sin((double) field476 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2604 = 5;
            arg0.field2605 = 0;
        } else if (var1 == 328) {
            arg0.field2612 = 150;
            arg0.field2613 = (int) (Math.sin((double) field476 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2604 = 5;
            arg0.field2605 = 1;
        }
    }

    @ObfuscatedName("i.dv(Lr;ZI)V")
    public static final void method42(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2814;
        arg0.method3346();
        if (arg1) {
            class158.method200(var2);
        }
        for (class171 var4 = (class171) field523.method3312(); var4 != null; var4 = (class171) field523.method3297()) {
            if ((long) var2 == (var4.field2814 >> 48 & 0xFFFFL)) {
                var4.method3346();
            }
        }
        class158 var5 = class158.method2199(var3);
        if (var5 != null) {
            method118(var5);
        }
        method52();
        if (field629 != -1) {
            method2288(field629, 1);
        }
    }

    @ObfuscatedName("bt.dl(Lff;B)Z")
    public static final boolean method1363(class158 arg0) {
        int var1 = arg0.field2565;
        if (var1 == 205) {
            field512 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field644.method3157(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field644.method3177(var4, var5 == 1);
        }
        if (var1 == 324) {
            field644.method3174(false);
        }
        if (var1 == 325) {
            field644.method3174(true);
        }
        if (var1 == 326) {
            field505.method2295(90);
            field644.method3159(field505);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ep.dm(IIII)V")
    public static final void method2656(int arg0, int arg1, int arg2) {
        method883();
        class89.method1799(arg0, arg1, Statics.field460.field1483 + arg0, Statics.field460.field1479 + arg1);
        if (field704 == 2 || field704 == 5) {
            class89.method1782(arg0 + 25, arg1 + 5, 0, Statics.field73, Statics.field290);
        } else {
            int var3 = field724 + field540 & 0x7FF;
            int var4 = Statics.field2706.field463 / 32 + 48;
            int var5 = 464 - Statics.field2706.field404 / 32;
            Statics.field230.method1673(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field595 + 256, Statics.field73, Statics.field290);
            for (int var6 = 0; var6 < field544; var6++) {
                int var7 = field699[var6] * 4 + 2 - Statics.field2706.field463 / 32;
                int var8 = field513[var6] * 4 + 2 - Statics.field2706.field404 / 32;
                method155(arg0, arg1, var7, var8, field701[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field687[Statics.field948][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2706.field463 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2706.field404 / 32;
                        method155(arg0, arg1, var12, var13, Statics.field324[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field551; var14++) {
                class25 var15 = field494[field504[var14]];
                if (var15 != null && var15.method20()) {
                    class31 var16 = var15.field374;
                    if (var16 != null && var16.field796 != null) {
                        var16 = var16.method610();
                    }
                    if (var16 != null && var16.field775 && var16.field799) {
                        int var17 = var15.field463 / 32 - Statics.field2706.field463 / 32;
                        int var18 = var15.field404 / 32 - Statics.field2706.field404 / 32;
                        method155(arg0, arg1, var17, var18, Statics.field324[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field588; var19++) {
                class3 var20 = field726[field587[var19]];
                if (var20 != null && var20.method20()) {
                    int var21 = var20.field463 / 32 - Statics.field2706.field463 / 32;
                    int var22 = var20.field404 / 32 - Statics.field2706.field404 / 32;
                    boolean var23 = false;
                    String var24 = var20.field50;
                    boolean var25;
                    if (var24 == null) {
                        var25 = false;
                    } else {
                        String var26 = class148.method595(var24, Statics.field470);
                        int var27 = 0;
                        while (true) {
                            if (var27 >= field723) {
                                if (var24.equalsIgnoreCase(class148.method595(Statics.field2706.field50, Statics.field470))) {
                                    var25 = true;
                                } else {
                                    var25 = false;
                                }
                                break;
                            }
                            if (var26.equalsIgnoreCase(class148.method595(field518[var27].field358, Statics.field470))) {
                                var25 = true;
                                break;
                            }
                            var27++;
                        }
                    }
                    if (var25) {
                        var23 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field193; var29++) {
                        if (var20.field50.equals(Statics.field1307[var29].field105)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2706.field54 != 0 && var20.field54 != 0 && Statics.field2706.field54 == var20.field54) {
                        var30 = true;
                    }
                    if (var23) {
                        method155(arg0, arg1, var21, var22, Statics.field324[3]);
                    } else if (var30) {
                        method155(arg0, arg1, var21, var22, Statics.field324[4]);
                    } else if (var28) {
                        method155(arg0, arg1, var21, var22, Statics.field324[5]);
                    } else {
                        method155(arg0, arg1, var21, var22, Statics.field324[2]);
                    }
                }
            }
            if (field484 != 0 && field476 % 20 < 10) {
                if (field484 == 1 && field485 >= 0 && field485 < field494.length) {
                    class25 var31 = field494[field485];
                    if (var31 != null) {
                        int var32 = var31.field463 / 32 - Statics.field2706.field463 / 32;
                        int var33 = var31.field404 / 32 - Statics.field2706.field404 / 32;
                        method3136(arg0, arg1, var32, var33, Statics.field111[1]);
                    }
                }
                if (field484 == 2) {
                    int var34 = field487 * 4 - Statics.field80 * 4 + 2 - Statics.field2706.field463 / 32;
                    int var35 = field488 * 4 - Statics.field377 * 4 + 2 - Statics.field2706.field404 / 32;
                    method3136(arg0, arg1, var34, var35, Statics.field111[1]);
                }
                if (field484 == 10 && field486 >= 0 && field486 < field726.length) {
                    class3 var36 = field726[field486];
                    if (var36 != null) {
                        int var37 = var36.field463 / 32 - Statics.field2706.field463 / 32;
                        int var38 = var36.field404 / 32 - Statics.field2706.field404 / 32;
                        method3136(arg0, arg1, var37, var38, Statics.field111[1]);
                    }
                }
            }
            if (field702 != 0) {
                int var39 = field702 * 4 + 2 - Statics.field2706.field463 / 32;
                int var40 = field703 * 4 + 2 - Statics.field2706.field404 / 32;
                method155(arg0, arg1, var39, var40, Statics.field111[0]);
            }
            class89.method1819(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field704 < 3) {
            Statics.field1512.method1673(arg0, arg1, 33, 33, 25, 25, field724, 256, Statics.field1727, Statics.field2340);
        } else {
            class89.method1782(arg0, arg1, 0, Statics.field1727, Statics.field2340);
        }
        if (field581[arg2]) {
            Statics.field460.method1755(arg0, arg1);
        }
        field673[arg2] = true;
    }

    @ObfuscatedName("fy.dw(IIIILcu;B)V")
    public static final void method3136(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method155(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field724 + field540 & 0x7FF;
        int var7 = class104.field1778[var6];
        int var8 = class104.field1779[var6];
        int var9 = var7 * 256 / (field595 + 256);
        int var10 = var8 * 256 / (field595 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2338.method1680(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("x.dj(IIIILcu;I)V")
    public static final void method155(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field724 + field540 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1778[var5];
        int var8 = class104.field1779[var5];
        int var9 = var7 * 256 / (field595 + 256);
        int var10 = var8 * 256 / (field595 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1675(Statics.field460, arg0 + 94 + var11 - arg4.field1469 / 2 + 4, arg1 + 83 - var12 - arg4.field1464 / 2 - 4);
        } else {
            arg4.method1663(arg0 + 94 + var11 - arg4.field1469 / 2 + 4, arg1 + 83 - var12 - arg4.field1464 / 2 - 4);
        }
    }

    @ObfuscatedName("be.dq(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1287(int arg0, String arg1, String arg2) {
        method1243(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ba.df(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method1243(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field680[var4] = field680[var4 - 1];
            field663[var4] = field663[var4 - 1];
            field608[var4] = field608[var4 - 1];
            field569[var4] = field569[var4 - 1];
        }
        field680[0] = arg0;
        field663[0] = arg1;
        field608[0] = arg2;
        field569[0] = arg3;
        field684++;
        field659 = field517;
    }

    @ObfuscatedName("q.dc(Ljava/lang/String;I)Z")
    public static boolean method205(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method595(arg0, Statics.field470);
        for (int var2 = 0; var2 < field471; var2++) {
            class11 var3 = field620[var2];
            if (var1.equalsIgnoreCase(class148.method595(var3.field165, Statics.field470))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method595(var3.field166, Statics.field470))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("v.dx(Ljava/lang/String;I)V")
    public static final void method14(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field723 < 200 || field683 == 1) || field723 >= 400) {
            method1287(0, "", class134.field2224);
            return;
        }
        String var1 = class148.method595(arg0, Statics.field470);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field723; var2++) {
            class23 var3 = field518[var2];
            String var4 = class148.method595(var3.field358, Statics.field470);
            if (var4 != null && var4.equals(var1)) {
                method1287(0, "", arg0 + class134.field2225);
                return;
            }
            if (var3.field356 != null) {
                String var5 = class148.method595(var3.field356, Statics.field470);
                if (var5 != null && var5.equals(var1)) {
                    method1287(0, "", arg0 + class134.field2225);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field471; var6++) {
            class11 var7 = field620[var6];
            String var8 = class148.method595(var7.field165, Statics.field470);
            if (var8 != null && var8.equals(var1)) {
                method1287(0, "", class134.field2230 + arg0 + class134.field2089);
                return;
            }
            if (var7.field166 != null) {
                String var9 = class148.method595(var7.field166, Statics.field470);
                if (var9 != null && var9.equals(var1)) {
                    method1287(0, "", class134.field2230 + arg0 + class134.field2089);
                    return;
                }
            }
        }
        if (class148.method595(Statics.field2706.field50, Statics.field470).equals(var1)) {
            method1287(0, "", class134.field2228);
        } else {
            field505.method2295(200);
            field505.method2498(Statics.method1837(arg0));
            field505.method2465(arg0);
        }
    }

    @ObfuscatedName("ao.ds(Ljava/lang/String;ZI)V")
    public static final void method887(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field471 < 100 || field683 == 1) || field471 >= 400) {
            method1287(0, "", class134.field2279);
            return;
        }
        String var2 = class148.method595(arg0, Statics.field470);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field471; var3++) {
            class11 var4 = field620[var3];
            String var5 = class148.method595(var4.field165, Statics.field470);
            if (var5 != null && var5.equals(var2)) {
                method1287(0, "", arg0 + class134.field2285);
                return;
            }
            if (var4.field166 != null) {
                String var6 = class148.method595(var4.field166, Statics.field470);
                if (var6 != null && var6.equals(var2)) {
                    method1287(0, "", arg0 + class134.field2285);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field723; var7++) {
            class23 var8 = field518[var7];
            String var9 = class148.method595(var8.field358, Statics.field470);
            if (var9 != null && var9.equals(var2)) {
                method1287(0, "", class134.field2287 + arg0 + class134.field2233);
                return;
            }
            if (var8.field356 != null) {
                String var10 = class148.method595(var8.field356, Statics.field470);
                if (var10 != null && var10.equals(var2)) {
                    method1287(0, "", class134.field2287 + arg0 + class134.field2233);
                    return;
                }
            }
        }
        if (class148.method595(Statics.field2706.field50, Statics.field470).equals(var2)) {
            method1287(0, "", class134.field2229);
        } else {
            field505.method2295(114);
            field505.method2498(Statics.method1837(arg0));
            field505.method2465(arg0);
        }
    }

    @ObfuscatedName("ej.do(Ljava/lang/String;IB)V")
    public static final void method2660(String arg0, int arg1) {
        field505.method2295(7);
        field505.method2498(Statics.method1837(arg0) + 1);
        field505.method2465(arg0);
        field505.method2437(arg1);
    }

    @ObfuscatedName("f.dh(Ljava/lang/String;B)V")
    public static final void method102(String arg0) {
        if (Statics.field1307 != null) {
            field505.method2295(223);
            field505.method2498(Statics.method1837(arg0));
            field505.method2465(arg0);
        }
    }

    @ObfuscatedName("y.dt(Ljava/lang/String;I)V")
    public static final void method191(String arg0) {
        if (!arg0.equals("")) {
            field505.method2295(229);
            field505.method2498(Statics.method1837(arg0));
            field505.method2465(arg0);
        }
    }

    @ObfuscatedName("fj.dd(I)V")
    public static final void method3087() {
        field505.method2295(229);
        field505.method2498(0);
    }

    @ObfuscatedName("bj.dk(Lff;B)I")
    public static int method1434(class158 arg0) {
        class171 var1 = (class171) field523.method3293(((long) arg0.field2634 << 32) + (long) arg0.field2573);
        return var1 == null ? arg0.field2631 : var1.field2797;
    }

    @ObfuscatedName("dq.di(Lff;B)Lff;")
    public static class158 method2200(class158 arg0) {
        int var1 = method1434(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class158.method2199(arg0.field2648);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("ev.dn(Lff;B)Z")
    public static boolean method2895(class158 arg0) {
        if (field638) {
            if (method1434(arg0) != 0) {
                return false;
            }
            if (arg0.field2574 == 0) {
                return false;
            }
        }
        return arg0.field2584;
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class73 {

    @ObfuscatedName("client.a")
    public static boolean field460 = true;

    @ObfuscatedName("client.t")
    public static int field461 = 1;

    @ObfuscatedName("client.c")
    public static int field462 = 0;

    @ObfuscatedName("client.k")
    public static boolean field471 = false;

    @ObfuscatedName("client.m")
    public static boolean field563 = false;

    @ObfuscatedName("client.b")
    public static int field467 = 0;

    @ObfuscatedName("client.l")
    public static int field468 = 1;

    @ObfuscatedName("client.r")
    public static int field470 = 0;

    @ObfuscatedName("client.h")
    public static boolean field637 = true;

    @ObfuscatedName("client.v")
    public static int field472 = 0;

    @ObfuscatedName("client.u")
    public static long field473 = 1L;

    @ObfuscatedName("client.e")
    public static int field706 = -1;

    @ObfuscatedName("client.n")
    public static int field625 = -1;

    @ObfuscatedName("client.q")
    public static int field476 = -1;

    @ObfuscatedName("client.w")
    public static class164[] field477 = new class164[4];

    @ObfuscatedName("client.o")
    public static boolean field498 = true;

    @ObfuscatedName("client.j")
    public static boolean field478 = false;

    @ObfuscatedName("client.ae")
    public static int field479 = 0;

    @ObfuscatedName("client.aq")
    public static int field517 = 0;

    @ObfuscatedName("client.ap")
    public static int field481 = 0;

    @ObfuscatedName("client.ah")
    public static int field482 = 0;

    @ObfuscatedName("client.ax")
    public static int field483 = 0;

    @ObfuscatedName("client.ai")
    public static int field484 = 0;

    @ObfuscatedName("client.aa")
    public static int field485 = 0;

    @ObfuscatedName("client.ar")
    public static int field486 = 0;

    @ObfuscatedName("client.ak")
    public static int field492 = 0;

    @ObfuscatedName("client.al")
    public static class127 field488 = new class127(new byte[5000]);

    @ObfuscatedName("client.az")
    public static int field619 = 0;

    @ObfuscatedName("client.as")
    public static int field583 = 0;

    @ObfuscatedName("client.af")
    public static int field491 = 0;

    @ObfuscatedName("client.bc")
    public static int field493 = 0;

    @ObfuscatedName("client.bl")
    public static int field494 = 0;

    @ObfuscatedName("client.bp")
    public static int field495 = 0;

    @ObfuscatedName("client.bs")
    public static int field474 = 0;

    @ObfuscatedName("client.bu")
    public static int field497 = 0;

    @ObfuscatedName("client.by")
    public static class25[] field559 = new class25[32768];

    @ObfuscatedName("client.ba")
    public static int field499 = 0;

    @ObfuscatedName("client.bg")
    public static int[] field500 = new int[32768];

    @ObfuscatedName("client.ci")
    public static class116 field501 = new class116(5000);

    @ObfuscatedName("client.cf")
    public static class116 field502 = new class116(5000);

    @ObfuscatedName("client.cb")
    public static class116 field595 = new class116(5000);

    @ObfuscatedName("client.cy")
    public static int field504 = 0;

    @ObfuscatedName("client.cs")
    public static int field505 = 0;

    @ObfuscatedName("client.co")
    public static int field506 = 0;

    @ObfuscatedName("client.cv")
    public static int field487 = 0;

    @ObfuscatedName("client.ck")
    public static int field545 = 0;

    @ObfuscatedName("client.cj")
    public static int field551 = 0;

    @ObfuscatedName("client.cp")
    public static int field510 = 0;

    @ObfuscatedName("client.cx")
    public static int field511 = 0;

    @ObfuscatedName("client.cd")
    public static boolean field512 = false;

    @ObfuscatedName("client.ch")
    public static int field513 = 0;

    @ObfuscatedName("client.ce")
    public static int field562 = 0;

    @ObfuscatedName("client.cl")
    public static int field665 = 1;

    @ObfuscatedName("client.cu")
    public static int field516 = 0;

    @ObfuscatedName("client.di")
    public static int field521 = 1;

    @ObfuscatedName("client.dy")
    public static int field565 = 0;

    @ObfuscatedName("client.dp")
    public static boolean field520 = false;

    @ObfuscatedName("client.dh")
    public static int[][][] field651 = new int[4][13][13];

    @ObfuscatedName("client.dc")
    public static final int[] field522 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dm")
    public static int field529 = 0;

    @ObfuscatedName("client.dx")
    public static int[][] field524 = new int[104][104];

    @ObfuscatedName("client.dw")
    public static int[][] field658 = new int[104][104];

    @ObfuscatedName("client.dt")
    public static int[] field526 = new int[4000];

    @ObfuscatedName("client.db")
    public static int[] field465 = new int[4000];

    @ObfuscatedName("client.dr")
    public static int field528 = 0;

    @ObfuscatedName("client.dz")
    public static int field546 = 2;

    @ObfuscatedName("client.df")
    public static int field530 = 0;

    @ObfuscatedName("client.do")
    public static int field531 = 2;

    @ObfuscatedName("client.dl")
    public static int field671 = 0;

    @ObfuscatedName("client.dk")
    public static int field533 = 1;

    @ObfuscatedName("client.de")
    public static int field534 = 0;

    @ObfuscatedName("client.ec")
    public static int field535 = 0;

    @ObfuscatedName("client.ez")
    public static int field547 = 2;

    @ObfuscatedName("client.ei")
    public static int field537 = 0;

    @ObfuscatedName("client.em")
    public static int field538 = 1;

    @ObfuscatedName("client.ea")
    public static int field539 = 0;

    @ObfuscatedName("client.ef")
    public static int field540 = 0;

    @ObfuscatedName("client.eb")
    public static int field541 = 2301979;

    @ObfuscatedName("client.ee")
    public static int field571 = 5063219;

    @ObfuscatedName("client.fg")
    public static int field640 = 3353893;

    @ObfuscatedName("client.fa")
    public static int field544 = 7759444;

    @ObfuscatedName("client.ff")
    public static boolean field519 = false;

    @ObfuscatedName("client.fk")
    public static int field598 = 0;

    @ObfuscatedName("client.fc")
    public static int field548 = 128;

    @ObfuscatedName("client.fx")
    public static int field549 = 0;

    @ObfuscatedName("client.fe")
    public static int field697 = 0;

    @ObfuscatedName("client.ft")
    public static int field578 = 0;

    @ObfuscatedName("client.fs")
    public static int field626 = 0;

    @ObfuscatedName("client.fu")
    public static boolean field553 = false;

    @ObfuscatedName("client.fz")
    public static int field652 = 0;

    @ObfuscatedName("client.fo")
    public static int field555 = 0;

    @ObfuscatedName("client.fn")
    public static int field466 = 50;

    @ObfuscatedName("client.fi")
    public static int[] field612 = new int[field466];

    @ObfuscatedName("client.fv")
    public static int[] field558 = new int[field466];

    @ObfuscatedName("client.fy")
    public static int[] field682 = new int[field466];

    @ObfuscatedName("client.fq")
    public static int[] field560 = new int[field466];

    @ObfuscatedName("client.fm")
    public static int[] field561 = new int[field466];

    @ObfuscatedName("client.fw")
    public static int[] field668 = new int[field466];

    @ObfuscatedName("client.gc")
    public static int[] field608 = new int[field466];

    @ObfuscatedName("client.gh")
    public static String[] field564 = new String[field466];

    @ObfuscatedName("client.ge")
    public static int[][] field525 = new int[104][104];

    @ObfuscatedName("client.gd")
    public static int field566 = 0;

    @ObfuscatedName("client.gp")
    public static int field567 = -1;

    @ObfuscatedName("client.gu")
    public static int field568 = -1;

    @ObfuscatedName("client.gx")
    public static int field569 = 0;

    @ObfuscatedName("client.gz")
    public static int field718 = 0;

    @ObfuscatedName("client.gg")
    public static int field676 = 0;

    @ObfuscatedName("client.gn")
    public static int field572 = 0;

    @ObfuscatedName("client.gw")
    public static int field570 = 0;

    @ObfuscatedName("client.gt")
    public static int field574 = 0;

    @ObfuscatedName("client.gq")
    public static int field575 = 0;

    @ObfuscatedName("client.gi")
    public static int field576 = 0;

    @ObfuscatedName("client.gs")
    public static int field577 = 0;

    @ObfuscatedName("client.ga")
    public static int field674 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field579 = false;

    @ObfuscatedName("client.gf")
    public static int field725 = 0;

    @ObfuscatedName("client.gv")
    public static int field581 = 0;

    @ObfuscatedName("client.gl")
    public static class3[] field582 = new class3[2048];

    @ObfuscatedName("client.gk")
    public static int field642 = 0;

    @ObfuscatedName("client.hi")
    public static int[] field584 = new int[2048];

    @ObfuscatedName("client.hp")
    public static int field585 = 0;

    @ObfuscatedName("client.hd")
    public static int[] field602 = new int[2048];

    @ObfuscatedName("client.hf")
    public static class127[] field587 = new class127[2048];

    @ObfuscatedName("client.hj")
    public static int field588 = -1;

    @ObfuscatedName("client.hh")
    public static int field589 = 0;

    @ObfuscatedName("client.hk")
    public static int field590 = 0;

    @ObfuscatedName("client.hs")
    public static int[] field591 = new int[1000];

    @ObfuscatedName("client.hn")
    public static final int[] field592 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hb")
    public static String[] field593 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field594 = new boolean[8];

    @ObfuscatedName("client.hq")
    public static int[] field557 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hc")
    public static class177[][][] field596 = new class177[4][104][104];

    @ObfuscatedName("client.hr")
    public static class177 field597 = new class177();

    @ObfuscatedName("client.hx")
    public static class177 field507 = new class177();

    @ObfuscatedName("client.hm")
    public static class177 field614 = new class177();

    @ObfuscatedName("client.hw")
    public static int[] field552 = new int[25];

    @ObfuscatedName("client.hz")
    public static int[] field601 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field503 = new int[25];

    @ObfuscatedName("client.hg")
    public static int field675 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field724 = false;

    @ObfuscatedName("client.iv")
    public static int field605 = 0;

    @ObfuscatedName("client.ir")
    public static int[] field606 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field607 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field550 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field609 = new int[500];

    @ObfuscatedName("client.is")
    public static String[] field610 = new String[500];

    @ObfuscatedName("client.iq")
    public static String[] field611 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field515 = -1;

    @ObfuscatedName("client.if")
    public static int field613 = -1;

    @ObfuscatedName("client.id")
    public static int field556 = 0;

    @ObfuscatedName("client.iu")
    public static int field615 = 50;

    @ObfuscatedName("client.iw")
    public static int field616 = 0;

    @ObfuscatedName("client.it")
    public static String field617 = null;

    @ObfuscatedName("client.ia")
    public static boolean field618 = false;

    @ObfuscatedName("client.iz")
    public static int field702 = -1;

    @ObfuscatedName("client.ih")
    public static String field620 = null;

    @ObfuscatedName("client.jq")
    public static String field621 = null;

    @ObfuscatedName("client.jb")
    public static int field622 = -1;

    @ObfuscatedName("client.jj")
    public static class175 field623 = new class175(8);

    @ObfuscatedName("client.jl")
    public static int field710 = 0;

    @ObfuscatedName("client.jg")
    public static int field670 = 0;

    @ObfuscatedName("client.jp")
    public static class158 field459 = null;

    @ObfuscatedName("client.jy")
    public static int field627 = 0;

    @ObfuscatedName("client.jk")
    public static int field628 = 0;

    @ObfuscatedName("client.jn")
    public static int field629 = 0;

    @ObfuscatedName("client.jx")
    public static boolean field630 = false;

    @ObfuscatedName("client.jt")
    public static boolean field527 = false;

    @ObfuscatedName("client.jr")
    public static boolean field624 = false;

    @ObfuscatedName("client.jd")
    public static class158 field633 = null;

    @ObfuscatedName("client.jw")
    public static class158 field634 = null;

    @ObfuscatedName("client.ju")
    public static int field635 = 0;

    @ObfuscatedName("client.jh")
    public static int field580 = 0;

    @ObfuscatedName("client.jo")
    public static class158 field660 = null;

    @ObfuscatedName("client.jf")
    public static boolean field638 = false;

    @ObfuscatedName("client.je")
    public static int field639 = -1;

    @ObfuscatedName("client.jm")
    public static int field603 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field641 = false;

    @ObfuscatedName("client.jz")
    public static int field490 = -1;

    @ObfuscatedName("client.jv")
    public static int field643 = -1;

    @ObfuscatedName("client.js")
    public static boolean field644 = false;

    @ObfuscatedName("client.ko")
    public static int field600 = 1;

    @ObfuscatedName("client.kl")
    public static int[] field646 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field647 = 0;

    @ObfuscatedName("client.kk")
    public static int[] field586 = new int[32];

    @ObfuscatedName("client.ky")
    public static int field649 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field650 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field523 = 0;

    @ObfuscatedName("client.kp")
    public static int field632 = 0;

    @ObfuscatedName("client.kt")
    public static int field653 = 0;

    @ObfuscatedName("client.kx")
    public static int field654 = 0;

    @ObfuscatedName("client.kc")
    public static int field655 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field656 = new int[2000];

    @ObfuscatedName("client.ks")
    public static String[] field657 = new String[1000];

    @ObfuscatedName("client.kr")
    public static int field496 = 0;

    @ObfuscatedName("client.kq")
    public static class177 field599 = new class177();

    @ObfuscatedName("client.ka")
    public static class177 field508 = new class177();

    @ObfuscatedName("client.kv")
    public static class177 field661 = new class177();

    @ObfuscatedName("client.kb")
    public static class175 field662 = new class175(512);

    @ObfuscatedName("client.kj")
    public static int field663 = 0;

    @ObfuscatedName("client.kd")
    public static int field480 = -2;

    @ObfuscatedName("client.la")
    public static boolean[] field604 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field666 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static boolean[] field667 = new boolean[100];

    @ObfuscatedName("client.ll")
    public static int[] field543 = new int[100];

    @ObfuscatedName("client.lr")
    public static int[] field669 = new int[100];

    @ObfuscatedName("client.le")
    public static int[] field554 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field573 = new int[100];

    @ObfuscatedName("client.lh")
    public static int field672 = 0;

    @ObfuscatedName("client.lo")
    public static int[] field673 = new int[100];

    @ObfuscatedName("client.lb")
    public static String[] field685 = new String[100];

    @ObfuscatedName("client.lm")
    public static String[] field542 = new String[100];

    @ObfuscatedName("client.lx")
    public static String[] field645 = new String[100];

    @ObfuscatedName("client.ly")
    public static int field691 = 0;

    @ObfuscatedName("client.ls")
    public static int[] field678 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lg")
    public static int field679 = 0;

    @ObfuscatedName("client.lk")
    public static int field680 = 0;

    @ObfuscatedName("client.lw")
    public static long[] field681 = new long[100];

    @ObfuscatedName("client.ln")
    public static int field475 = 0;

    @ObfuscatedName("client.lz")
    public static int field683 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field684 = new int[128];

    @ObfuscatedName("client.lt")
    public static int[] field664 = new int[128];

    @ObfuscatedName("client.lf")
    public static long field686 = -1L;

    @ObfuscatedName("client.mi")
    public static String field687 = null;

    @ObfuscatedName("client.my")
    public static String field688 = null;

    @ObfuscatedName("client.ms")
    public static int field689 = -1;

    @ObfuscatedName("client.mp")
    public static int field690 = 0;

    @ObfuscatedName("client.mr")
    public static int[] field458 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field692 = new int[1000];

    @ObfuscatedName("client.ma")
    public static class86[] field693 = new class86[1000];

    @ObfuscatedName("client.mn")
    public static int field694 = 0;

    @ObfuscatedName("client.md")
    public static int field695 = 0;

    @ObfuscatedName("client.mh")
    public static int field696 = 0;

    @ObfuscatedName("client.mx")
    public static int field532 = 255;

    @ObfuscatedName("client.mf")
    public static int field698 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field699 = false;

    @ObfuscatedName("client.mj")
    public static int field700 = 127;

    @ObfuscatedName("client.mq")
    public static int field701 = 127;

    @ObfuscatedName("client.nc")
    public static int field514 = 0;

    @ObfuscatedName("client.np")
    public static int[] field703 = new int[50];

    @ObfuscatedName("client.nz")
    public static int[] field704 = new int[50];

    @ObfuscatedName("client.nb")
    public static int[] field705 = new int[50];

    @ObfuscatedName("client.nq")
    public static int[] field489 = new int[50];

    @ObfuscatedName("client.nf")
    public static class57[] field707 = new class57[50];

    @ObfuscatedName("client.no")
    public static boolean field722 = false;

    @ObfuscatedName("client.nl")
    public static boolean[] field709 = new boolean[5];

    @ObfuscatedName("client.ny")
    public static int[] field631 = new int[5];

    @ObfuscatedName("client.nd")
    public static int[] field711 = new int[5];

    @ObfuscatedName("client.od")
    public static int[] field518 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field659 = new int[5];

    @ObfuscatedName("client.oc")
    public static int field714 = 0;

    @ObfuscatedName("client.oo")
    public static int field715 = 0;

    @ObfuscatedName("client.oq")
    public static class23[] field716 = new class23[200];

    @ObfuscatedName("client.on")
    public static class173 field717 = new class173();

    @ObfuscatedName("client.ou")
    public static int field712 = 0;

    @ObfuscatedName("client.oj")
    public static class11[] field719 = new class11[100];

    @ObfuscatedName("client.oi")
    public static class163 field720 = new class163();

    @ObfuscatedName("client.oa")
    public static int field721 = -1;

    @ObfuscatedName("client.om")
    public static int field713 = -1;

    @ObfuscatedName("client.a(I)V")
    public final void method248() {
    }

    public final void init() {
        if (!this.method1411()) {
            return;
        }
        class167[] var1 = new class167[] { class167.field2783, class167.field2788, class167.field2785, class167.field2781, class167.field2784, class167.field2789, class167.field2782, class167.field2786, class167.field2790 };
        class167[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class167 var4 = var2[var3];
            String var5 = this.getParameter(var4.field2787);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field2787)) {
                    case 1:
                        class133[] var6 = class133.method523();
                        int var7 = Integer.parseInt(var5);
                        class133[] var8 = var6;
                        int var9 = 0;
                        class133 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class133 var10 = var8[var9];
                            if (var7 == var10.method2301()) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field463 = (class133) var11;
                        if (Statics.field463 == class133.field2069) {
                            Statics.field464 = class186.field2858;
                        } else {
                            Statics.field464 = class186.field2860;
                        }
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                            field471 = true;
                        } else {
                            field471 = false;
                        }
                        break;
                    case 3:
                        field461 = Integer.parseInt(var5);
                    case 4:
                    default:
                        break;
                    case 5:
                        field467 = Integer.parseInt(var5);
                        break;
                    case 6:
                        if (var5.equalsIgnoreCase(class2.field21)) {
                            field468 = 1;
                        } else {
                            field468 = 0;
                        }
                        break;
                    case 7:
                        Statics.field1264 = class132.method684(Integer.parseInt(var5));
                        break;
                    case 8:
                        Statics.field469 = var5;
                        break;
                    case 9:
                        field462 = Integer.parseInt(var5);
                }
            }
        }
        method3015();
        Statics.field219 = this.getCodeBase().getHost();
        String var12 = Statics.field1264.field2060;
        byte var13 = 0;
        try {
            Statics.field1433 = 16;
            Statics.field2066 = var13;
            try {
                Statics.field1277 = System.getProperty("os.name");
            } catch (Exception var32) {
                Statics.field1277 = "Unknown";
            }
            Statics.field1793 = Statics.field1277.toLowerCase();
            try {
                Statics.field1807 = System.getProperty("user.home");
                if (Statics.field1807 != null) {
                    Statics.field1807 = Statics.field1807 + "/";
                }
            } catch (Exception var31) {
            }
            try {
                if (Statics.field1793.startsWith("win")) {
                    if (Statics.field1807 == null) {
                        Statics.field1807 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field1807 == null) {
                    Statics.field1807 = System.getenv("HOME");
                }
                if (Statics.field1807 != null) {
                    Statics.field1807 = Statics.field1807 + "/";
                }
            } catch (Exception var30) {
            }
            if (Statics.field1807 == null) {
                Statics.field1807 = "~/";
            }
            Statics.field1228 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field1807, "/tmp/", "" };
            Statics.field1975 = new String[] { ".jagex_cache_" + Statics.field2066, ".file_store_" + Statics.field2066 };
            label128: for (int var17 = 0; var17 < 4; var17++) {
                Statics.field1427 = class82.method173("oldschool", var12, var17);
                if (!Statics.field1427.exists()) {
                    Statics.field1427.mkdirs();
                }
                File[] var18 = Statics.field1427.listFiles();
                if (var18 == null) {
                    break;
                }
                File[] var19 = var18;
                int var20 = 0;
                while (true) {
                    if (var20 >= var19.length) {
                        break label128;
                    }
                    File var21 = var19[var20];
                    boolean var24;
                    try {
                        RandomAccessFile var22 = new RandomAccessFile(var21, "rw");
                        int var23 = var22.read();
                        var22.seek(0L);
                        var22.write(var23);
                        var22.seek(0L);
                        var22.close();
                        var24 = true;
                    } catch (Exception var29) {
                        var24 = false;
                    }
                    if (!var24) {
                        break;
                    }
                    var20++;
                }
            }
            File var26 = Statics.field1427;
            Statics.field1303 = var26;
            if (!Statics.field1303.exists()) {
                throw new RuntimeException("");
            }
            class72.field1302 = true;
            class82.method882();
            class82.field1431 = new class30(new class29(class72.method172("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class82.field1432 = new class30(new class29(class72.method172("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field88 = new class30[Statics.field1433];
            for (int var27 = 0; var27 < Statics.field1433; var27++) {
                Statics.field88[var27] = new class30(new class29(class72.method172("main_file_cache.idx" + var27), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var33) {
            class80.method2305((String) null, var33);
        }
        Statics.field677 = this;
        this.method1395(765, 503, 12);
    }

    @ObfuscatedName("ey.f(I)V")
    public static final void method3015() {
        class95.field1607 = false;
        field563 = false;
    }

    @ObfuscatedName("client.c(I)V")
    public final void method250() {
        Statics.field928 = field462 == 0 ? 43594 : field461 + 40000;
        Statics.field2463 = field462 == 0 ? 443 : field461 + 50000;
        Statics.field1752 = Statics.field928;
        Statics.field2585 = class161.field2724;
        Statics.field1508 = class161.field2727;
        Statics.field2742 = class161.field2725;
        Statics.field2003 = class161.field2726;
        if (Statics.field1332.toLowerCase().indexOf("microsoft") == -1) {
            class75.field1357[44] = 71;
            class75.field1357[45] = 26;
            class75.field1357[46] = 72;
            class75.field1357[47] = 73;
            class75.field1357[59] = 57;
            class75.field1357[61] = 27;
            class75.field1357[91] = 42;
            class75.field1357[92] = 74;
            class75.field1357[93] = 43;
            class75.field1357[192] = 28;
            class75.field1357[222] = 58;
            class75.field1357[520] = 59;
        } else {
            class75.field1357[186] = 57;
            class75.field1357[187] = 27;
            class75.field1357[188] = 71;
            class75.field1357[189] = 26;
            class75.field1357[190] = 72;
            class75.field1357[191] = 73;
            class75.field1357[192] = 58;
            class75.field1357[219] = 42;
            class75.field1357[220] = 74;
            class75.field1357[221] = 43;
            class75.field1357[222] = 59;
            class75.field1357[223] = 28;
        }
        class75.method860(Statics.field1272);
        Canvas var1 = Statics.field1272;
        var1.addMouseListener(class77.field1406);
        var1.addMouseMotionListener(class77.field1406);
        var1.addFocusListener(class77.field1406);
        Statics.field796 = class66.method3028();
        if (Statics.field796 != null) {
            Statics.field796.method1325(Statics.field1272);
        }
        Statics.field2740 = new class71(255, class82.field1431, class82.field1432, 500000);
        class29 var2 = null;
        class12 var3 = new class12();
        try {
            var2 = class82.method1499("", Statics.field463.field2073, false);
            byte[] var4 = new byte[(int) var2.method535()];
            int var6;
            for (int var5 = 0; var5 < var4.length; var5 += var6) {
                var6 = var2.method534(var4, var5, var4.length - var5);
                if (var6 == -1) {
                    throw new IOException();
                }
            }
            var3 = new class12(new class127(var4));
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method532();
            }
        } catch (Exception var10) {
        }
        Statics.field97 = var3;
        if (field462 != 0) {
            field478 = true;
        }
    }

    @ObfuscatedName("client.p(I)V")
    public final void method251() {
        field472++;
        this.method418();
        class157.method1480();
        class138.method2299();
        method5();
        class75.method239();
        class77 var1 = class77.field1406;
        synchronized (class77.field1406) {
            class77.field1392 = class77.field1389;
            class77.field1405 = class77.field1390;
            class77.field1394 = class77.field1387;
            class77.field1399 = class77.field1395;
            class77.field1400 = class77.field1396;
            class77.field1393 = class77.field1397;
            class77.field1402 = class77.field1398;
            class77.field1395 = 0;
        }
        if (Statics.field796 != null) {
            int var3 = Statics.field796.method1341();
            field496 = var3;
        }
        if (field470 == 0) {
            method2893();
            Statics.field2323.method1311();
            for (int var4 = 0; var4 < 32; var4++) {
                field1327[var4] = 0L;
            }
            for (int var5 = 0; var5 < 32; var5++) {
                field1319[var5] = 0L;
            }
            Statics.field906 = 0;
        } else if (field470 == 5) {
            class21.method3(this);
            method2893();
            Statics.field2323.method1311();
            for (int var6 = 0; var6 < 32; var6++) {
                field1327[var6] = 0L;
            }
            for (int var7 = 0; var7 < 32; var7++) {
                field1319[var7] = 0L;
            }
            Statics.field906 = 0;
        } else if (field470 == 10) {
            class21.method3(this);
        } else if (field470 == 20) {
            class21.method3(this);
            method1997();
        } else if (field470 == 25) {
            method527(false);
            field562 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field917.length; var9++) {
                if (Statics.field154[var9] != -1 && Statics.field917[var9] == null) {
                    Statics.field917[var9] = Statics.field1201.method2958(Statics.field154[var9], 0);
                    if (Statics.field917[var9] == null) {
                        var8 = false;
                        field562++;
                    }
                }
                if (Statics.field964[var9] != -1 && Statics.field732[var9] == null) {
                    Statics.field732[var9] = Statics.field1201.method2959(Statics.field964[var9], 0, Statics.field1996[var9]);
                    if (Statics.field732[var9] == null) {
                        var8 = false;
                        field562++;
                    }
                }
            }
            if (var8) {
                field516 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field917.length; var11++) {
                    byte[] var12 = Statics.field732[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field1444[var11] >> 8) * 64 - Statics.field751;
                        int var14 = (Statics.field1444[var11] & 0xFF) * 64 - Statics.field1920;
                        if (field520) {
                            var13 = 10;
                            var14 = 10;
                        }
                        boolean var16 = true;
                        class127 var17 = new class127(var12);
                        int var18 = -1;
                        label1175: while (true) {
                            int var19 = var17.method2413();
                            if (var19 == 0) {
                                var10 &= var16;
                                break;
                            }
                            var18 += var19;
                            int var20 = 0;
                            boolean var21 = false;
                            while (true) {
                                while (!var21) {
                                    int var23 = var17.method2413();
                                    if (var23 == 0) {
                                        continue label1175;
                                    }
                                    var20 += var23 - 1;
                                    int var24 = var20 & 0x3F;
                                    int var25 = var20 >> 6 & 0x3F;
                                    int var26 = var17.method2509() >> 2;
                                    int var27 = var13 + var25;
                                    int var28 = var14 + var24;
                                    if (var27 > 0 && var28 > 0 && var27 < 103 && var28 < 103) {
                                        class32 var29 = class32.method204(var18);
                                        if (var26 != 22 || !field563 || var29.field819 != 0 || var29.field850 == 1 || var29.field839) {
                                            if (!var29.method657()) {
                                                field516++;
                                                var16 = false;
                                            }
                                            var21 = true;
                                        }
                                    }
                                }
                                int var22 = var17.method2413();
                                if (var22 == 0) {
                                    break;
                                }
                                var17.method2509();
                            }
                        }
                    }
                }
                if (var10) {
                    if (field565 != 0) {
                        method1394(class134.field2085 + class2.field27 + class2.field26 + 100 + "%" + class2.field25, true);
                    }
                    method5();
                    method142();
                    method5();
                    Statics.field2456.method1826();
                    method5();
                    System.gc();
                    for (int var31 = 0; var31 < 4; var31++) {
                        field477[var31].method3187();
                    }
                    for (int var32 = 0; var32 < 4; var32++) {
                        for (int var33 = 0; var33 < 104; var33++) {
                            for (int var34 = 0; var34 < 104; var34++) {
                                class9.field142[var32][var33][var34] = 0;
                            }
                        }
                    }
                    method5();
                    class9.method1();
                    int var35 = Statics.field917.length;
                    class7.method52();
                    method527(true);
                    if (!field520) {
                        int var36 = 0;
                        label1113: while (true) {
                            if (var36 >= var35) {
                                for (int var50 = 0; var50 < var35; var50++) {
                                    int var51 = (Statics.field1444[var50] >> 8) * 64 - Statics.field751;
                                    int var52 = (Statics.field1444[var50] & 0xFF) * 64 - Statics.field1920;
                                    byte[] var53 = Statics.field917[var50];
                                    if (var53 == null && Statics.field2527 < 800) {
                                        method5();
                                        class9.method858(var51, var52, 64, 64);
                                    }
                                }
                                method527(true);
                                int var54 = 0;
                                while (true) {
                                    if (var54 >= var35) {
                                        break label1113;
                                    }
                                    byte[] var55 = Statics.field732[var54];
                                    if (var55 != null) {
                                        int var56 = (Statics.field1444[var54] >> 8) * 64 - Statics.field751;
                                        int var57 = (Statics.field1444[var54] & 0xFF) * 64 - Statics.field1920;
                                        method5();
                                        class9.method2289(var55, var56, var57, Statics.field2456, field477);
                                    }
                                    var54++;
                                }
                            }
                            int var37 = (Statics.field1444[var36] >> 8) * 64 - Statics.field751;
                            int var38 = (Statics.field1444[var36] & 0xFF) * 64 - Statics.field1920;
                            byte[] var39 = Statics.field917[var36];
                            if (var39 != null) {
                                method5();
                                int var40 = Statics.field2054 * 8 - 48;
                                int var41 = Statics.field2527 * 8 - 48;
                                class164[] var42 = field477;
                                int var43 = 0;
                                label1110: while (true) {
                                    if (var43 >= 4) {
                                        class127 var46 = new class127(var39);
                                        int var47 = 0;
                                        while (true) {
                                            if (var47 >= 4) {
                                                break label1110;
                                            }
                                            for (int var48 = 0; var48 < 64; var48++) {
                                                for (int var49 = 0; var49 < 64; var49++) {
                                                    class9.method135(var46, var47, var37 + var48, var38 + var49, var40, var41, 0);
                                                }
                                            }
                                            var47++;
                                        }
                                    }
                                    for (int var44 = 0; var44 < 64; var44++) {
                                        for (int var45 = 0; var45 < 64; var45++) {
                                            if (var37 + var44 > 0 && var37 + var44 < 103 && var38 + var45 > 0 && var38 + var45 < 103) {
                                                var42[var43].field2762[var37 + var44][var38 + var45] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var43++;
                                }
                            }
                            var36++;
                        }
                    }
                    if (field520) {
                        int var58 = 0;
                        label1059: while (true) {
                            if (var58 >= 4) {
                                for (int var90 = 0; var90 < 13; var90++) {
                                    for (int var91 = 0; var91 < 13; var91++) {
                                        int var92 = field651[0][var90][var91];
                                        if (var92 == -1) {
                                            class9.method858(var90 * 8, var91 * 8, 8, 8);
                                        }
                                    }
                                }
                                method527(true);
                                int var93 = 0;
                                while (true) {
                                    if (var93 >= 4) {
                                        break label1059;
                                    }
                                    method5();
                                    for (int var94 = 0; var94 < 13; var94++) {
                                        for (int var95 = 0; var95 < 13; var95++) {
                                            int var96 = field651[var93][var94][var95];
                                            if (var96 != -1) {
                                                int var97 = var96 >> 24 & 0x3;
                                                int var98 = var96 >> 1 & 0x3;
                                                int var99 = var96 >> 14 & 0x3FF;
                                                int var100 = var96 >> 3 & 0x7FF;
                                                int var101 = (var99 / 8 << 8) + var100 / 8;
                                                for (int var102 = 0; var102 < Statics.field1444.length; var102++) {
                                                    if (Statics.field1444[var102] == var101 && Statics.field732[var102] != null) {
                                                        class9.method165(Statics.field732[var102], var93, var94 * 8, var95 * 8, var97, (var99 & 0x7) * 8, (var100 & 0x7) * 8, var98, Statics.field2456, field477);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var93++;
                                }
                            }
                            method5();
                            for (int var59 = 0; var59 < 13; var59++) {
                                for (int var60 = 0; var60 < 13; var60++) {
                                    boolean var61 = false;
                                    int var62 = field651[var58][var59][var60];
                                    if (var62 != -1) {
                                        int var63 = var62 >> 24 & 0x3;
                                        int var64 = var62 >> 1 & 0x3;
                                        int var65 = var62 >> 14 & 0x3FF;
                                        int var66 = var62 >> 3 & 0x7FF;
                                        int var67 = (var65 / 8 << 8) + var66 / 8;
                                        for (int var68 = 0; var68 < Statics.field1444.length; var68++) {
                                            if (Statics.field1444[var68] == var67 && Statics.field917[var68] != null) {
                                                byte[] var69 = Statics.field917[var68];
                                                int var70 = var59 * 8;
                                                int var71 = var60 * 8;
                                                int var72 = (var65 & 0x7) * 8;
                                                int var73 = (var66 & 0x7) * 8;
                                                class164[] var74 = field477;
                                                for (int var75 = 0; var75 < 8; var75++) {
                                                    for (int var76 = 0; var76 < 8; var76++) {
                                                        if (var70 + var75 > 0 && var70 + var75 < 103 && var71 + var76 > 0 && var71 + var76 < 103) {
                                                            var74[var58].field2762[var70 + var75][var71 + var76] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class127 var77 = new class127(var69);
                                                for (int var78 = 0; var78 < 4; var78++) {
                                                    for (int var79 = 0; var79 < 64; var79++) {
                                                        for (int var80 = 0; var80 < 64; var80++) {
                                                            if (var63 == var78 && var79 >= var72 && var79 < var72 + 8 && var80 >= var73 && var80 < var73 + 8) {
                                                                int var83 = var70 + class160.method3050(var79 & 0x7, var80 & 0x7, var64);
                                                                int var85 = var79 & 0x7;
                                                                int var86 = var80 & 0x7;
                                                                int var88 = var64 & 0x3;
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
                                                                class9.method135(var77, var58, var83, var71 + var89, 0, 0, var64);
                                                            } else {
                                                                class9.method135(var77, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var61 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var61) {
                                        class9.method866(var58, var59 * 8, var60 * 8);
                                    }
                                }
                            }
                            var58++;
                        }
                    }
                    method527(true);
                    method142();
                    method5();
                    class95 var103 = Statics.field2456;
                    class164[] var104 = field477;
                    for (int var105 = 0; var105 < 4; var105++) {
                        for (int var106 = 0; var106 < 104; var106++) {
                            for (int var107 = 0; var107 < 104; var107++) {
                                if ((class9.field142[var105][var106][var107] & 0x1) == 1) {
                                    int var108 = var105;
                                    if ((class9.field142[1][var106][var107] & 0x2) == 2) {
                                        var108 = var105 - 1;
                                    }
                                    if (var108 >= 0) {
                                        var104[var108].method3171(var106, var107);
                                    }
                                }
                            }
                        }
                    }
                    class9.field137 += (int) (Math.random() * 5.0D) - 2;
                    if (class9.field137 < -8) {
                        class9.field137 = -8;
                    }
                    if (class9.field137 > 8) {
                        class9.field137 = 8;
                    }
                    class9.field138 += (int) (Math.random() * 5.0D) - 2;
                    if (class9.field138 < -16) {
                        class9.field138 = -16;
                    }
                    if (class9.field138 > 16) {
                        class9.field138 = 16;
                    }
                    for (int var109 = 0; var109 < 4; var109++) {
                        byte[][] var110 = Statics.field2831[var109];
                        int var111 = (int) Math.sqrt(5100.0D);
                        int var112 = var111 * 768 >> 8;
                        for (int var113 = 1; var113 < 103; var113++) {
                            for (int var114 = 1; var114 < 103; var114++) {
                                int var115 = class9.field130[var109][var114 + 1][var113] - class9.field130[var109][var114 - 1][var113];
                                int var116 = class9.field130[var109][var114][var113 + 1] - class9.field130[var109][var114][var113 - 1];
                                int var117 = (int) Math.sqrt((double) (var116 * var116 + var115 * var115 + 65536));
                                int var118 = (var115 << 8) / var117;
                                int var119 = 65536 / var117;
                                int var120 = (var116 << 8) / var117;
                                int var121 = (var120 * -50 + var118 * -50 + var119 * -10) / var112 + 96;
                                int var122 = (var110[var114][var113] >> 1) + (var110[var114][var113 + 1] >> 3) + (var110[var114][var113 - 1] >> 2) + (var110[var114 - 1][var113] >> 2) + (var110[var114 + 1][var113] >> 3);
                                Statics.field2007[var114][var113] = var121 - var122;
                            }
                        }
                        for (int var123 = 0; var123 < 104; var123++) {
                            Statics.field1994[var123] = 0;
                            Statics.field131[var123] = 0;
                            Statics.field2023[var123] = 0;
                            Statics.field129[var123] = 0;
                            Statics.field1618[var123] = 0;
                        }
                        for (int var124 = -5; var124 < 109; var124++) {
                            for (int var125 = 0; var125 < 104; var125++) {
                                int var126 = var124 + 5;
                                int var10002;
                                if (var126 >= 0 && var126 < 104) {
                                    int var127 = Statics.field2006[var109][var126][var125] & 0xFF;
                                    if (var127 > 0) {
                                        int var128 = var127 - 1;
                                        class33 var129 = (class33) class33.field858.method3210((long) var128);
                                        class33 var130;
                                        if (var129 == null) {
                                            byte[] var131 = Statics.field861.method2958(1, var128);
                                            class33 var132 = new class33();
                                            if (var131 != null) {
                                                var132.method660(new class127(var131), var128);
                                            }
                                            var132.method659();
                                            class33.field858.method3221(var132, (long) var128);
                                            var130 = var132;
                                        } else {
                                            var130 = var129;
                                        }
                                        Statics.field1994[var125] += var130.field860;
                                        Statics.field131[var125] += var130.field862;
                                        Statics.field2023[var125] += var130.field863;
                                        Statics.field129[var125] += var130.field857;
                                        var10002 = Statics.field1618[var125]++;
                                    }
                                }
                                int var134 = var124 - 5;
                                if (var134 >= 0 && var134 < 104) {
                                    int var135 = Statics.field2006[var109][var134][var125] & 0xFF;
                                    if (var135 > 0) {
                                        int var136 = var135 - 1;
                                        class33 var137 = (class33) class33.field858.method3210((long) var136);
                                        class33 var138;
                                        if (var137 == null) {
                                            byte[] var139 = Statics.field861.method2958(1, var136);
                                            class33 var140 = new class33();
                                            if (var139 != null) {
                                                var140.method660(new class127(var139), var136);
                                            }
                                            var140.method659();
                                            class33.field858.method3221(var140, (long) var136);
                                            var138 = var140;
                                        } else {
                                            var138 = var137;
                                        }
                                        Statics.field1994[var125] -= var138.field860;
                                        Statics.field131[var125] -= var138.field862;
                                        Statics.field2023[var125] -= var138.field863;
                                        Statics.field129[var125] -= var138.field857;
                                        var10002 = Statics.field1618[var125]--;
                                    }
                                }
                            }
                            if (var124 >= 1 && var124 < 103) {
                                int var142 = 0;
                                int var143 = 0;
                                int var144 = 0;
                                int var145 = 0;
                                int var146 = 0;
                                for (int var147 = -5; var147 < 109; var147++) {
                                    int var148 = var147 + 5;
                                    if (var148 >= 0 && var148 < 104) {
                                        var142 += Statics.field1994[var148];
                                        var143 += Statics.field131[var148];
                                        var144 += Statics.field2023[var148];
                                        var145 += Statics.field129[var148];
                                        var146 += Statics.field1618[var148];
                                    }
                                    int var149 = var147 - 5;
                                    if (var149 >= 0 && var149 < 104) {
                                        var142 -= Statics.field1994[var149];
                                        var143 -= Statics.field131[var149];
                                        var144 -= Statics.field2023[var149];
                                        var145 -= Statics.field129[var149];
                                        var146 -= Statics.field1618[var149];
                                    }
                                    if (var147 >= 1 && var147 < 103 && (!field563 || (class9.field142[0][var124][var147] & 0x2) != 0 || (class9.field142[var109][var124][var147] & 0x10) == 0 && class9.method1815(var109, var124, var147) == field513)) {
                                        if (var109 < class9.field126) {
                                            class9.field126 = var109;
                                        }
                                        int var150 = Statics.field2006[var109][var124][var147] & 0xFF;
                                        int var151 = Statics.field127[var109][var124][var147] & 0xFF;
                                        if (var150 > 0 || var151 > 0) {
                                            int var152 = class9.field130[var109][var124][var147];
                                            int var153 = class9.field130[var109][var124 + 1][var147];
                                            int var154 = class9.field130[var109][var124 + 1][var147 + 1];
                                            int var155 = class9.field130[var109][var124][var147 + 1];
                                            int var156 = Statics.field2007[var124][var147];
                                            int var157 = Statics.field2007[var124 + 1][var147];
                                            int var158 = Statics.field2007[var124 + 1][var147 + 1];
                                            int var159 = Statics.field2007[var124][var147 + 1];
                                            int var160 = -1;
                                            int var161 = -1;
                                            if (var150 > 0) {
                                                int var162 = var142 * 256 / var145;
                                                int var163 = var143 / var146;
                                                int var164 = var144 / var146;
                                                var160 = class9.method2148(var162, var163, var164);
                                                int var165 = class9.field137 + var162 & 0xFF;
                                                int var166 = class9.field138 + var164;
                                                if (var166 < 0) {
                                                    var166 = 0;
                                                } else if (var166 > 255) {
                                                    var166 = 255;
                                                }
                                                var161 = class9.method2148(var165, var163, var166);
                                            }
                                            if (var109 > 0) {
                                                boolean var167 = true;
                                                if (var150 == 0 && Statics.field1921[var109][var124][var147] != 0) {
                                                    var167 = false;
                                                }
                                                if (var151 > 0 && !class37.method1242(var151 - 1).field935) {
                                                    var167 = false;
                                                }
                                                if (var167 && var152 == var153 && var152 == var154 && var152 == var155) {
                                                    Statics.field297[var109][var124][var147] |= 0x924;
                                                }
                                            }
                                            int var168 = 0;
                                            if (var161 != -1) {
                                                var168 = class104.field1774[class9.method1561(var161, 96)];
                                            }
                                            if (var151 == 0) {
                                                var103.method1851(var109, var124, var147, 0, 0, -1, var152, var153, var154, var155, class9.method1561(var160, var156), class9.method1561(var160, var157), class9.method1561(var160, var158), class9.method1561(var160, var159), 0, 0, 0, 0, var168, 0);
                                            } else {
                                                int var169 = Statics.field1921[var109][var124][var147] + 1;
                                                byte var170 = Statics.field68[var109][var124][var147];
                                                class37 var171 = class37.method1242(var151 - 1);
                                                int var172 = var171.field938;
                                                int var173;
                                                int var174;
                                                if (var172 >= 0) {
                                                    var173 = Statics.field1773.method2149(var172);
                                                    var174 = -1;
                                                } else if (var171.field946 == 16711935) {
                                                    var174 = -2;
                                                    var172 = -1;
                                                    var173 = -2;
                                                } else {
                                                    var174 = class9.method2148(var171.field941, var171.field942, var171.field943);
                                                    int var175 = class9.field137 + var171.field941 & 0xFF;
                                                    int var176 = class9.field138 + var171.field943;
                                                    if (var176 < 0) {
                                                        var176 = 0;
                                                    } else if (var176 > 255) {
                                                        var176 = 255;
                                                    }
                                                    var173 = class9.method2148(var175, var171.field942, var176);
                                                }
                                                int var177 = 0;
                                                if (var173 != -2) {
                                                    var177 = class104.field1774[class9.method26(var173, 96)];
                                                }
                                                if (var171.field940 != -1) {
                                                    int var178 = class9.field137 + var171.field944 & 0xFF;
                                                    int var179 = class9.field138 + var171.field939;
                                                    if (var179 < 0) {
                                                        var179 = 0;
                                                    } else if (var179 > 255) {
                                                        var179 = 255;
                                                    }
                                                    int var180 = class9.method2148(var178, var171.field937, var179);
                                                    var177 = class104.field1774[class9.method26(var180, 96)];
                                                }
                                                var103.method1851(var109, var124, var147, var169, var170, var172, var152, var153, var154, var155, class9.method1561(var160, var156), class9.method1561(var160, var157), class9.method1561(var160, var158), class9.method1561(var160, var159), class9.method26(var174, var156), class9.method26(var174, var157), class9.method26(var174, var158), class9.method26(var174, var159), var168, var177);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var181 = 1; var181 < 103; var181++) {
                            for (int var182 = 1; var182 < 103; var182++) {
                                var103.method1821(var109, var182, var181, class9.method1815(var109, var182, var181));
                            }
                        }
                        Statics.field2006[var109] = (byte[][]) null;
                        Statics.field127[var109] = (byte[][]) null;
                        Statics.field1921[var109] = (byte[][]) null;
                        Statics.field68[var109] = (byte[][]) null;
                        Statics.field2831[var109] = (byte[][]) null;
                    }
                    var103.method1848(-50, -10, -50);
                    for (int var183 = 0; var183 < 104; var183++) {
                        for (int var184 = 0; var184 < 104; var184++) {
                            if ((class9.field142[1][var183][var184] & 0x2) == 2) {
                                var103.method1819(var183, var184);
                            }
                        }
                    }
                    int var185 = 1;
                    int var186 = 2;
                    int var187 = 4;
                    for (int var188 = 0; var188 < 4; var188++) {
                        if (var188 > 0) {
                            var185 <<= 0x3;
                            var186 <<= 0x3;
                            var187 <<= 0x3;
                        }
                        for (int var189 = 0; var189 <= var188; var189++) {
                            for (int var190 = 0; var190 <= 104; var190++) {
                                for (int var191 = 0; var191 <= 104; var191++) {
                                    if ((Statics.field297[var189][var191][var190] & var185) != 0) {
                                        int var192 = var190;
                                        int var193 = var190;
                                        int var194 = var189;
                                        int var195 = var189;
                                        while (var192 > 0 && (Statics.field297[var189][var191][var192 - 1] & var185) != 0) {
                                            var192--;
                                        }
                                        while (var193 < 104 && (Statics.field297[var189][var191][var193 + 1] & var185) != 0) {
                                            var193++;
                                        }
                                        label715: while (var194 > 0) {
                                            for (int var196 = var192; var196 <= var193; var196++) {
                                                if ((Statics.field297[var194 - 1][var191][var196] & var185) == 0) {
                                                    break label715;
                                                }
                                            }
                                            var194--;
                                        }
                                        label704: while (var195 < var188) {
                                            for (int var197 = var192; var197 <= var193; var197++) {
                                                if ((Statics.field297[var195 + 1][var191][var197] & var185) == 0) {
                                                    break label704;
                                                }
                                            }
                                            var195++;
                                        }
                                        int var198 = (var195 + 1 - var194) * (var193 - var192 + 1);
                                        if (var198 >= 8) {
                                            short var199 = 240;
                                            int var200 = class9.field130[var195][var191][var192] - var199;
                                            int var201 = class9.field130[var194][var191][var192];
                                            class95.method1820(var188, 1, var191 * 128, var191 * 128, var192 * 128, var193 * 128 + 128, var200, var201);
                                            for (int var202 = var194; var202 <= var195; var202++) {
                                                for (int var203 = var192; var203 <= var193; var203++) {
                                                    Statics.field297[var202][var191][var203] &= ~var185;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field297[var189][var191][var190] & var186) != 0) {
                                        int var204 = var191;
                                        int var205 = var191;
                                        int var206 = var189;
                                        int var207 = var189;
                                        while (var204 > 0 && (Statics.field297[var189][var204 - 1][var190] & var186) != 0) {
                                            var204--;
                                        }
                                        while (var205 < 104 && (Statics.field297[var189][var205 + 1][var190] & var186) != 0) {
                                            var205++;
                                        }
                                        label768: while (var206 > 0) {
                                            for (int var208 = var204; var208 <= var205; var208++) {
                                                if ((Statics.field297[var206 - 1][var208][var190] & var186) == 0) {
                                                    break label768;
                                                }
                                            }
                                            var206--;
                                        }
                                        label757: while (var207 < var188) {
                                            for (int var209 = var204; var209 <= var205; var209++) {
                                                if ((Statics.field297[var207 + 1][var209][var190] & var186) == 0) {
                                                    break label757;
                                                }
                                            }
                                            var207++;
                                        }
                                        int var210 = (var207 + 1 - var206) * (var205 - var204 + 1);
                                        if (var210 >= 8) {
                                            short var211 = 240;
                                            int var212 = class9.field130[var207][var204][var190] - var211;
                                            int var213 = class9.field130[var206][var204][var190];
                                            class95.method1820(var188, 2, var204 * 128, var205 * 128 + 128, var190 * 128, var190 * 128, var212, var213);
                                            for (int var214 = var206; var214 <= var207; var214++) {
                                                for (int var215 = var204; var215 <= var205; var215++) {
                                                    Statics.field297[var214][var215][var190] &= ~var186;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field297[var189][var191][var190] & var187) != 0) {
                                        int var216 = var191;
                                        int var217 = var191;
                                        int var218 = var190;
                                        int var219 = var190;
                                        while (var218 > 0 && (Statics.field297[var189][var191][var218 - 1] & var187) != 0) {
                                            var218--;
                                        }
                                        while (var219 < 104 && (Statics.field297[var189][var191][var219 + 1] & var187) != 0) {
                                            var219++;
                                        }
                                        label821: while (var216 > 0) {
                                            for (int var220 = var218; var220 <= var219; var220++) {
                                                if ((Statics.field297[var189][var216 - 1][var220] & var187) == 0) {
                                                    break label821;
                                                }
                                            }
                                            var216--;
                                        }
                                        label810: while (var217 < 104) {
                                            for (int var221 = var218; var221 <= var219; var221++) {
                                                if ((Statics.field297[var189][var217 + 1][var221] & var187) == 0) {
                                                    break label810;
                                                }
                                            }
                                            var217++;
                                        }
                                        if ((var217 - var216 + 1) * (var219 - var218 + 1) >= 4) {
                                            int var222 = class9.field130[var189][var216][var218];
                                            class95.method1820(var188, 4, var216 * 128, var217 * 128 + 128, var218 * 128, var219 * 128 + 128, var222, var222);
                                            for (int var223 = var216; var223 <= var217; var223++) {
                                                for (int var224 = var218; var224 <= var219; var224++) {
                                                    Statics.field297[var189][var223][var224] &= ~var187;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method527(true);
                    int var225 = class9.field126;
                    if (var225 > Statics.field2034) {
                        var225 = Statics.field2034;
                    }
                    if (var225 < Statics.field2034 - 1) {
                        int var226 = Statics.field2034 - 1;
                    }
                    if (field563) {
                        Statics.field2456.method1818(class9.field126);
                    } else {
                        Statics.field2456.method1818(0);
                    }
                    for (int var227 = 0; var227 < 104; var227++) {
                        for (int var228 = 0; var228 < 104; var228++) {
                            method2584(var227, var228);
                        }
                    }
                    method5();
                    for (class22 var229 = (class22) field597.method3278(); var229 != null; var229 = (class22) field597.method3280()) {
                        if (var229.field350 == -1) {
                            var229.field339 = 0;
                            method2978(var229);
                        } else {
                            var229.method3306();
                        }
                    }
                    class32.field803.method3209();
                    if (Statics.field2455 != null) {
                        field501.method2265(67);
                        field501.method2389(1057001181);
                    }
                    if (!field520) {
                        int var230 = (Statics.field2054 - 6) / 8;
                        int var231 = (Statics.field2054 + 6) / 8;
                        int var232 = (Statics.field2527 - 6) / 8;
                        int var233 = (Statics.field2527 + 6) / 8;
                        for (int var234 = var230 - 1; var234 <= var231 + 1; var234++) {
                            for (int var235 = var232 - 1; var235 <= var233 + 1; var235++) {
                                if (var234 < var230 || var234 > var231 || var235 < var232 || var235 > var233) {
                                    Statics.field1201.method2952("m" + var234 + "_" + var235);
                                    Statics.field1201.method2952("l" + var234 + "_" + var235);
                                }
                            }
                        }
                    }
                    method2633(30);
                    method5();
                    class9.method552();
                    field501.method2265(164);
                    Statics.field2323.method1311();
                    for (int var236 = 0; var236 < 32; var236++) {
                        field1327[var236] = 0L;
                    }
                    for (int var237 = 0; var237 < 32; var237++) {
                        field1319[var237] = 0L;
                    }
                    Statics.field906 = 0;
                } else {
                    field565 = 2;
                }
            } else {
                field565 = 1;
            }
        }
        if (field470 == 30) {
            method178();
        } else if (field470 == 40) {
            method1997();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method266() {
        boolean var1 = class138.method44();
        if (var1 && field699 && Statics.field244 != null) {
            Statics.field244.method1137();
        }
        if (field1323) {
            Canvas var2 = Statics.field1272;
            var2.removeKeyListener(class75.field1351);
            var2.removeFocusListener(class75.field1351);
            class75.field1350 = -1;
            class77.method218(Statics.field1272);
            if (Statics.field796 != null) {
                Statics.field796.method1330(Statics.field1272);
            }
            this.method1396();
            class75.method860(Statics.field1272);
            Canvas var3 = Statics.field1272;
            var3.addMouseListener(class77.field1406);
            var3.addMouseMotionListener(class77.field1406);
            var3.addFocusListener(class77.field1406);
            if (Statics.field796 != null) {
                Statics.field796.method1325(Statics.field1272);
            }
        }
        if (field470 == 0) {
            class73.method2084(class21.field338, class21.field315, (Color) null);
        } else if (field470 == 5) {
            class21.method1342(Statics.field144, Statics.field1662);
        } else if (field470 == 10) {
            class21.method1342(Statics.field144, Statics.field1662);
        } else if (field470 == 20) {
            class21.method1342(Statics.field144, Statics.field1662);
        } else if (field470 == 25) {
            if (field565 == 1) {
                if (field562 > field665) {
                    field665 = field562;
                }
                int var4 = (field665 * 50 - field562 * 50) / field665;
                method1394(class134.field2085 + class2.field27 + class2.field26 + var4 + "%" + class2.field25, false);
            } else if (field565 == 2) {
                if (field516 > field521) {
                    field521 = field516;
                }
                int var5 = (field521 * 50 - field516 * 50) / field521 + 50;
                method1394(class134.field2085 + class2.field27 + class2.field26 + var5 + "%" + class2.field25, false);
            } else {
                method1394(class134.field2085, false);
            }
        } else if (field470 == 30) {
            if (!field724) {
                field610[0] = class134.field2293;
                field611[0] = "";
                field550[0] = 1006;
                field605 = 1;
            }
            if (field622 != -1) {
                method1252(field622);
            }
            for (int var6 = 0; var6 < field663; var6++) {
                if (field604[var6]) {
                    field666[var6] = true;
                }
                field667[var6] = field604[var6];
                field604[var6] = false;
            }
            field480 = field472;
            field515 = -1;
            field613 = -1;
            Statics.field1263 = null;
            if (field622 != -1) {
                field663 = 0;
                int var7 = field622;
                if (class158.method2630(var7)) {
                    Statics.field381 = null;
                    method1590(Statics.field2626[var7], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field381 != null) {
                        method1590(Statics.field381, -1412584499, 0, 0, 765, 503, Statics.field15, Statics.field456, -1);
                        Statics.field381 = null;
                    }
                } else {
                    for (int var8 = 0; var8 < 100; var8++) {
                        field604[var8] = true;
                    }
                }
            }
            class89.method1740();
            method795();
            if (field724) {
                method881();
            } else if (field515 != -1) {
                int var9 = field515;
                int var10 = field613;
                if (field605 >= 2 || field616 != 0 || field618) {
                    String var11;
                    if (field616 == 1 && field605 < 2) {
                        var11 = class134.field2219 + class134.field2229 + field617 + " " + class2.field24;
                    } else if (field618 && field605 < 2) {
                        var11 = field620 + class134.field2229 + field621 + " " + class2.field24;
                    } else {
                        int var12 = field605 - 1;
                        String var13;
                        if (field611[var12].length() > 0) {
                            var13 = field610[var12] + class134.field2229 + field611[var12];
                        } else {
                            var13 = field610[var12];
                        }
                        var11 = var13;
                    }
                    if (field605 > 2) {
                        var11 = var11 + class2.method1521(16777215) + " " + '/' + " " + (field605 - 2) + class134.field2223;
                    }
                    Statics.field144.method3376(var11, var9 + 4, var10 + 15, 16777215, 0, field472 / 1000);
                }
            }
            if (field672 == 3) {
                for (int var14 = 0; var14 < field663; var14++) {
                    if (field667[var14]) {
                        class89.method1745(field543[var14], field669[var14], field554[var14], field573[var14], 16711935, 128);
                    } else if (field666[var14]) {
                        class89.method1745(field543[var14], field669[var14], field554[var14], field573[var14], 16711680, 128);
                    }
                }
            }
            class7.method45(Statics.field2034, Statics.field2319.field420, Statics.field2319.field400, field540);
            field540 = 0;
        } else if (field470 == 40) {
            method1394(class134.field2149 + class2.field27 + class134.field2087, false);
        }
        if (field470 == 30 && field672 == 0 && !field1321) {
            try {
                Graphics var15 = Statics.field1272.getGraphics();
                for (int var16 = 0; var16 < field663; var16++) {
                    if (field666[var16]) {
                        Statics.field1022.method1564(var15, field543[var16], field669[var16], field554[var16], field573[var16]);
                        field666[var16] = false;
                    }
                }
            } catch (Exception var22) {
                Statics.field1272.repaint();
            }
        } else if (field470 > 0) {
            try {
                Graphics var18 = Statics.field1272.getGraphics();
                Statics.field1022.method1572(var18, 0, 0);
                field1321 = false;
                for (int var19 = 0; var19 < field663; var19++) {
                    field666[var19] = false;
                }
            } catch (Exception var21) {
                Statics.field1272.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(B)V")
    public final void method253() {
        if (Statics.field1269 != null) {
            Statics.field1269.field251 = false;
        }
        Statics.field1269 = null;
        if (Statics.field324 != null) {
            Statics.field324.method1356();
            Statics.field324 = null;
        }
        if (class75.field1351 != null) {
            class75 var1 = class75.field1351;
            synchronized (class75.field1351) {
                class75.field1351 = null;
            }
        }
        if (class77.field1406 != null) {
            class77 var3 = class77.field1406;
            synchronized (class77.field1406) {
                class77.field1406 = null;
            }
        }
        Statics.field796 = null;
        if (Statics.field244 != null) {
            Statics.field244.method1138();
        }
        if (Statics.field1268 != null) {
            Statics.field1268.method1138();
        }
        class153.method2863();
        Object var5 = class157.field2581;
        synchronized (class157.field2581) {
            if (class157.field2580 != 0) {
                class157.field2580 = 1;
                try {
                    class157.field2581.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class82.field1431.method554();
            for (int var8 = 0; var8 < Statics.field1433; var8++) {
                Statics.field88[var8].method554();
            }
            class82.field1432.method554();
            class82.field1425.method554();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("ea.m(II)V")
    public static void method2633(int arg0) {
        if (field470 == arg0) {
            return;
        }
        if (field470 == 0) {
            class73.method1343();
        }
        if (arg0 == 20 || arg0 == 40) {
            field494 = 0;
            field495 = 0;
            field474 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2565 != null) {
            Statics.field2565.method1356();
            Statics.field2565 = null;
        }
        if (field470 == 25) {
            field565 = 0;
            field562 = 0;
            field665 = 1;
            field516 = 0;
            field521 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class21.method883(Statics.field1272, Statics.field1923, Statics.field1808);
        } else if (Statics.field302) {
            Statics.field300 = null;
            Statics.field301 = null;
            Statics.field305 = null;
            Statics.field2318 = null;
            Statics.field2466 = null;
            Statics.field303 = null;
            Statics.field269 = null;
            Statics.field2795 = null;
            Statics.field38 = null;
            Statics.field2053 = null;
            Statics.field325 = null;
            Statics.field326 = null;
            Statics.field2582 = null;
            Statics.field2458 = null;
            Statics.field118 = null;
            Statics.field1374 = null;
            Statics.field290 = null;
            Statics.field306 = null;
            Statics.field1983 = null;
            Statics.field80 = null;
            class138.field2340 = 1;
            Statics.field2341 = null;
            Statics.field2342 = -1;
            Statics.field2344 = -1;
            Statics.field2012 = 0;
            Statics.field2030 = false;
            Statics.field2038 = 2;
            class153.method1539(true);
            Statics.field302 = false;
        }
        field470 = arg0;
    }

    @ObfuscatedName("client.y(I)V")
    public void method418() {
        if (field470 == 1000) {
            return;
        }
        long var1 = class121.method1250();
        int var3 = (int) (var1 - Statics.field2533);
        Statics.field2533 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class153.field2532 += var3;
        boolean var4;
        if (class153.field2542 == 0 && class153.field2537 == 0 && class153.field2538 == 0 && class153.field2540 == 0) {
            var4 = true;
        } else if (Statics.field2535 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class153.field2532 > 30000) {
                        throw new IOException();
                    }
                    while (class153.field2537 < 20 && class153.field2540 > 0) {
                        class155 var5 = (class155) class153.field2544.method3257();
                        class127 var6 = new class127(4);
                        var6.method2386(1);
                        var6.method2460((int) var5.field2818);
                        Statics.field2535.method1361(var6.field2035, 0, 4);
                        class153.field2553.method3268(var5, var5.field2818);
                        class153.field2540--;
                        class153.field2537++;
                    }
                    while (class153.field2542 < 20 && class153.field2538 > 0) {
                        class155 var7 = (class155) class153.field2531.method3224();
                        class127 var8 = new class127(4);
                        var8.method2386(0);
                        var8.method2460((int) var7.field2818);
                        Statics.field2535.method1361(var8.field2035, 0, 4);
                        var7.method3248();
                        class153.field2541.method3268(var7, var7.field2818);
                        class153.field2538--;
                        class153.field2542++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2535.method1359();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class153.field2532 = 0;
                        byte var11 = 0;
                        if (Statics.field2543 == null) {
                            var11 = 8;
                        } else if (class153.field2546 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class153.field2534.field2042;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2535.method1360(class153.field2534.field2035, class153.field2534.field2042, var12);
                            if (class153.field2550 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class153.field2534.field2035[class153.field2534.field2042 + var13] ^= class153.field2550;
                                }
                            }
                            class153.field2534.field2042 += var12;
                            if (class153.field2534.field2042 < var11) {
                                break;
                            }
                            if (Statics.field2543 == null) {
                                class153.field2534.field2042 = 0;
                                int var14 = class153.field2534.method2509();
                                int var15 = class153.field2534.method2512();
                                int var16 = class153.field2534.method2509();
                                int var17 = class153.field2534.method2405();
                                long var18 = (long) ((var14 << 16) + var15);
                                class155 var20 = (class155) class153.field2553.method3255(var18);
                                Statics.field1384 = true;
                                if (var20 == null) {
                                    var20 = (class155) class153.field2541.method3255(var18);
                                    Statics.field1384 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2543 = var20;
                                Statics.field2545 = new class127(var17 + var21 + Statics.field2543.field2569);
                                Statics.field2545.method2386(var16);
                                Statics.field2545.method2389(var17);
                                class153.field2546 = 8;
                                class153.field2534.field2042 = 0;
                            } else if (class153.field2546 == 0) {
                                if (class153.field2534.field2035[0] == -1) {
                                    class153.field2546 = 1;
                                    class153.field2534.field2042 = 0;
                                } else {
                                    Statics.field2543 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2545.field2035.length - Statics.field2543.field2569;
                            int var23 = 512 - class153.field2546;
                            if (var23 > var22 - Statics.field2545.field2042) {
                                var23 = var22 - Statics.field2545.field2042;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2535.method1360(Statics.field2545.field2035, Statics.field2545.field2042, var23);
                            if (class153.field2550 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2545.field2035[Statics.field2545.field2042 + var24] ^= class153.field2550;
                                }
                            }
                            Statics.field2545.field2042 += var23;
                            class153.field2546 += var23;
                            if (Statics.field2545.field2042 == var22) {
                                if (Statics.field2543.field2818 == 16711935L) {
                                    Statics.field2058 = Statics.field2545;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class154 var26 = class153.field2549[var25];
                                        if (var26 != null) {
                                            Statics.field2058.field2042 = var25 * 8 + 5;
                                            int var27 = Statics.field2058.method2405();
                                            int var28 = Statics.field2058.method2405();
                                            var26.method3038(var27, var28);
                                        }
                                    }
                                } else {
                                    class153.field2536.reset();
                                    class153.field2536.update(Statics.field2545.field2035, 0, var22);
                                    int var29 = (int) class153.field2536.getValue();
                                    if (Statics.field2543.field2567 != var29) {
                                        try {
                                            Statics.field2535.method1356();
                                        } catch (Exception var35) {
                                        }
                                        class153.field2551++;
                                        Statics.field2535 = null;
                                        class153.field2550 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class153.field2551 = 0;
                                    class153.field2552 = 0;
                                    Statics.field2543.field2571.method3033((int) (Statics.field2543.field2818 & 0xFFFFL), Statics.field2545.field2035, (Statics.field2543.field2818 & 0xFF0000L) == 16711680L, Statics.field1384);
                                }
                                Statics.field2543.method3306();
                                if (Statics.field1384) {
                                    class153.field2537--;
                                } else {
                                    class153.field2542--;
                                }
                                class153.field2546 = 0;
                                Statics.field2543 = null;
                                Statics.field2545 = null;
                            } else {
                                if (class153.field2546 != 512) {
                                    break;
                                }
                                class153.field2546 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2535.method1356();
                } catch (Exception var34) {
                }
                class153.field2552++;
                Statics.field2535 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method513();
        }
    }

    @ObfuscatedName("client.b(I)V")
    public void method513() {
        if (class153.field2551 >= 4) {
            this.method1414("js5crc");
            field470 = 1000;
            return;
        }
        if (class153.field2552 >= 4) {
            if (field470 <= 5) {
                this.method1414("js5io");
                field470 = 1000;
                return;
            }
            field491 = 3000;
            class153.field2552 = 3;
        }
        if (--field491 + 1 > 0) {
            return;
        }
        try {
            if (field583 == 0) {
                Statics.field173 = Statics.field1652.method1465(Statics.field219, Statics.field1752);
                field583++;
            }
            if (field583 == 1) {
                if (Statics.field173.field1412 == 2) {
                    this.method256(-1);
                    return;
                }
                if (Statics.field173.field1412 == 1) {
                    field583++;
                }
            }
            if (field583 == 2) {
                Statics.field91 = new class70((Socket) Statics.field173.field1416, Statics.field1652);
                class127 var1 = new class127(5);
                var1.method2386(15);
                var1.method2389(12);
                Statics.field91.method1361(var1.field2035, 0, 5);
                field583++;
                Statics.field1978 = class121.method1250();
            }
            if (field583 == 3) {
                if (field470 <= 5 || Statics.field91.method1359() > 0) {
                    int var2 = Statics.field91.method1358();
                    if (var2 != 0) {
                        this.method256(var2);
                        return;
                    }
                    field583++;
                } else if (class121.method1250() - Statics.field1978 > 30000L) {
                    this.method256(-2);
                    return;
                }
            }
            if (field583 == 4) {
                class153.method667(Statics.field91, field470 > 20);
                Statics.field173 = null;
                Statics.field91 = null;
                field583 = 0;
                field493 = 0;
            }
        } catch (IOException var4) {
            this.method256(-3);
        }
    }

    @ObfuscatedName("client.l(II)V")
    public void method256(int arg0) {
        Statics.field173 = null;
        Statics.field91 = null;
        field583 = 0;
        if (Statics.field928 == Statics.field1752) {
            Statics.field1752 = Statics.field2463;
        } else {
            Statics.field1752 = Statics.field928;
        }
        field493++;
        if (field493 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field470 <= 5) {
                this.method1414("js5connect_full");
                field470 = 1000;
            } else {
                field491 = 3000;
            }
        } else if (field493 >= 2 && arg0 == 6) {
            this.method1414("js5connect_outofdate");
            field470 = 1000;
        } else if (field493 >= 4) {
            if (field470 <= 5) {
                this.method1414("js5connect");
                field470 = 1000;
            } else {
                field491 = 3000;
            }
        }
    }

    @ObfuscatedName("es.x(I)V")
    public static void method2893() {
        if (field619 == 0) {
            Statics.field2456 = new class95(4, 104, 104, class9.field130);
            for (int var0 = 0; var0 < 4; var0++) {
                field477[var0] = new class164(104, 104);
            }
            Statics.field1026 = new class86(512, 512);
            class21.field315 = class134.field2088;
            class21.field338 = 5;
            field619 = 20;
        } else if (field619 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1776[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1852(var1, 500, 800, 512, 334);
            class21.field315 = class134.field2089;
            class21.field338 = 10;
            field619 = 30;
        } else if (field619 == 30) {
            Statics.field267 = method148(0, false, true, true);
            Statics.field271 = method148(1, false, true, true);
            Statics.field1669 = method148(2, true, false, true);
            Statics.field1456 = method148(3, false, true, true);
            Statics.field1030 = method148(4, false, true, true);
            Statics.field1201 = method148(5, true, true, true);
            Statics.field1512 = method148(6, true, true, false);
            Statics.field2327 = method148(7, false, true, true);
            Statics.field1808 = method148(8, false, true, true);
            Statics.field636 = method148(9, false, true, true);
            Statics.field1923 = method148(10, false, true, true);
            Statics.field1440 = method148(11, false, true, true);
            Statics.field89 = method148(12, false, true, true);
            Statics.field509 = method148(13, true, false, true);
            Statics.field289 = method148(14, false, true, false);
            Statics.field2450 = method148(15, false, true, true);
            class21.field315 = class134.field2108;
            class21.field338 = 20;
            field619 = 40;
        } else if (field619 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field267.method3030() * 4 / 100;
            int var8 = var7 + Statics.field271.method3030() * 4 / 100;
            int var9 = var8 + Statics.field1669.method3030() * 2 / 100;
            int var10 = var9 + Statics.field1456.method3030() * 2 / 100;
            int var11 = var10 + Statics.field1030.method3030() * 6 / 100;
            int var12 = var11 + Statics.field1201.method3030() * 4 / 100;
            int var13 = var12 + Statics.field1512.method3030() * 2 / 100;
            int var14 = var13 + Statics.field2327.method3030() * 60 / 100;
            int var15 = var14 + Statics.field1808.method3030() * 2 / 100;
            int var16 = var15 + Statics.field636.method3030() * 2 / 100;
            int var17 = var16 + Statics.field1923.method3030() * 2 / 100;
            int var18 = var17 + Statics.field1440.method3030() * 2 / 100;
            int var19 = var18 + Statics.field89.method3030() * 2 / 100;
            int var20 = var19 + Statics.field509.method3030() * 2 / 100;
            int var21 = var20 + Statics.field289.method3030() * 2 / 100;
            int var22 = var21 + Statics.field2450.method3030() * 2 / 100;
            if (var22 == 100) {
                class21.field315 = class134.field2181;
                class21.field338 = 30;
                field619 = 45;
            } else {
                if (var22 != 0) {
                    class21.field315 = class134.field2091 + var22 + "%";
                }
                class21.field338 = 30;
            }
        } else if (field619 == 45) {
            boolean var23 = !field563;
            Statics.field2328 = 22050;
            Statics.field1178 = var23;
            Statics.field121 = 2;
            class141 var24 = new class141();
            var24.method2720(9, 128);
            Statics.field244 = Statics.method110(Statics.field1652, Statics.field1272, 0, 22050);
            Statics.field244.method1136(var24);
            class154 var25 = Statics.field2450;
            class154 var26 = Statics.field289;
            class154 var27 = Statics.field1030;
            Statics.field2343 = var25;
            Statics.field2337 = var26;
            Statics.field2338 = var27;
            Statics.field2339 = var24;
            Statics.field1268 = Statics.method110(Statics.field1652, Statics.field1272, 1, 2048);
            Statics.field205 = new class46();
            Statics.field1268.method1136(Statics.field205);
            Statics.field1379 = new class62(22050, Statics.field2328);
            class21.field315 = class134.field2134;
            class21.field338 = 35;
            field619 = 50;
        } else if (field619 == 50) {
            int var28 = 0;
            if (Statics.field1662 == null) {
                Statics.field1662 = Statics.method528(Statics.field1808, Statics.field509, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field180 == null) {
                Statics.field180 = Statics.method528(Statics.field1808, Statics.field509, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field144 == null) {
                Statics.field144 = Statics.method528(Statics.field1808, Statics.field509, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field315 = class134.field2094 + var28 * 100 / 3 + "%";
                class21.field338 = 40;
            } else {
                Statics.field1919 = new class151(true);
                class21.field315 = class134.field2234;
                class21.field338 = 40;
                field619 = 60;
            }
        } else if (field619 == 60) {
            class154 var29 = Statics.field1923;
            class154 var30 = Statics.field1808;
            int var31 = 0;
            if (var29.method3009("title.jpg", "")) {
                var31++;
            }
            if (var30.method3009("logo", "")) {
                var31++;
            }
            if (var30.method3009("titlebox", "")) {
                var31++;
            }
            if (var30.method3009("titlebutton", "")) {
                var31++;
            }
            if (var30.method3009("runes", "")) {
                var31++;
            }
            if (var30.method3009("title_mute", "")) {
                var31++;
            }
            var30.method3009("sl_back", "");
            var30.method3009("sl_flags", "");
            var30.method3009("sl_arrows", "");
            var30.method3009("sl_stars", "");
            var30.method3009("sl_button", "");
            byte var34 = 6;
            if (var31 < var34) {
                class21.field315 = class134.field2232 + var31 * 100 / var34 + "%";
                class21.field338 = 50;
            } else {
                class21.field315 = class134.field2097;
                class21.field338 = 50;
                method2633(5);
                field619 = 70;
            }
        } else if (field619 == 70) {
            if (Statics.field1669.method2985()) {
                class154 var36 = Statics.field1669;
                Statics.field936 = var36;
                class154 var37 = Statics.field1669;
                Statics.field861 = var37;
                class36.method807(Statics.field1669, Statics.field2327);
                class32.method2000(Statics.field1669, Statics.field2327, field563);
                class31.method1375(Statics.field1669, Statics.field2327);
                class40.method1354(Statics.field1669, Statics.field2327, field471, Statics.field1662);
                class34.method2184(Statics.field1669, Statics.field267, Statics.field271);
                class154 var38 = Statics.field1669;
                class154 var39 = Statics.field2327;
                Statics.field902 = var38;
                Statics.field900 = var39;
                class154 var40 = Statics.field1669;
                Statics.field956 = var40;
                class154 var41 = Statics.field1669;
                Statics.field1042 = var41;
                Statics.field1036 = Statics.field1042.method2943(16);
                class158.method179(Statics.field1456, Statics.field2327, Statics.field1808, Statics.field509);
                class154 var42 = Statics.field1669;
                Statics.field1032 = var42;
                class39.method28(Statics.field1669);
                class21.field315 = class134.field2099;
                class21.field338 = 60;
                field619 = 80;
            } else {
                class21.field315 = class134.field2098 + Statics.field1669.method3037() + "%";
                class21.field338 = 60;
            }
        } else if (field619 == 80) {
            int var43 = 0;
            if (Statics.field1516 == null) {
                Statics.field1516 = class84.method779(Statics.field1808, "compass", "");
            } else {
                var43++;
            }
            if (Statics.field2360 == null) {
                Statics.field2360 = class84.method779(Statics.field1808, "mapedge", "");
            } else {
                var43++;
            }
            if (Statics.field1435 == null) {
                Statics.field1435 = class84.method1526(Statics.field1808, "mapscene", "");
            } else {
                var43++;
            }
            if (Statics.field1261 == null) {
                Statics.field1261 = class84.method59(Statics.field1808, "mapfunction", "");
            } else {
                var43++;
            }
            if (Statics.field1 == null) {
                Statics.field1 = class84.method59(Statics.field1808, "hitmarks", "");
            } else {
                var43++;
            }
            if (Statics.field933 == null) {
                Statics.field933 = class84.method59(Statics.field1808, "headicons_pk", "");
            } else {
                var43++;
            }
            if (Statics.field1434 == null) {
                Statics.field1434 = class84.method59(Statics.field1808, "headicons_prayer", "");
            } else {
                var43++;
            }
            if (Statics.field63 == null) {
                Statics.field63 = class84.method59(Statics.field1808, "headicons_hint", "");
            } else {
                var43++;
            }
            if (Statics.field241 == null) {
                Statics.field241 = class84.method59(Statics.field1808, "mapmarker", "");
            } else {
                var43++;
            }
            if (Statics.field1831 == null) {
                Statics.field1831 = class84.method59(Statics.field1808, "cross", "");
            } else {
                var43++;
            }
            if (Statics.field926 == null) {
                Statics.field926 = class84.method59(Statics.field1808, "mapdots", "");
            } else {
                var43++;
            }
            if (Statics.field273 == null) {
                Statics.field273 = class84.method1526(Statics.field1808, "scrollbar", "");
            } else {
                var43++;
            }
            if (Statics.field1326 == null) {
                Statics.field1326 = class84.method1526(Statics.field1808, "mod_icons", "");
            } else {
                var43++;
            }
            if (Statics.field280 == null) {
                Statics.field280 = class84.method1391(Statics.field1808, "mapback", "");
            } else {
                var43++;
            }
            if (var43 < 14) {
                class21.field315 = class134.field2100 + var43 * 100 / 14 + "%";
                class21.field338 = 70;
            } else {
                Statics.field2842 = Statics.field1326;
                Statics.field2360.method1708();
                int var44 = (int) (Math.random() * 21.0D) - 10;
                int var45 = (int) (Math.random() * 21.0D) - 10;
                int var46 = (int) (Math.random() * 21.0D) - 10;
                int var47 = (int) (Math.random() * 41.0D) - 20;
                for (int var48 = 0; var48 < Statics.field1261.length; var48++) {
                    Statics.field1261[var48].method1637(var44 + var47, var45 + var47, var46 + var47);
                }
                Statics.field1435[0].method1725(var44 + var47, var45 + var47, var46 + var47);
                Statics.field334 = new int[33];
                Statics.field1972 = new int[33];
                Statics.field2467 = new int[151];
                Statics.field864 = new int[151];
                for (int var49 = 0; var49 < 33; var49++) {
                    int var50 = 999;
                    int var51 = 0;
                    for (int var52 = 0; var52 < 34; var52++) {
                        if (Statics.field280.field1475[Statics.field280.field1470 * var49 + var52] == 0) {
                            if (var50 == 999) {
                                var50 = var52;
                            }
                        } else if (var50 != 999) {
                            var51 = var52;
                            break;
                        }
                    }
                    Statics.field334[var49] = var50;
                    Statics.field1972[var49] = var51 - var50;
                }
                for (int var53 = 5; var53 < 156; var53++) {
                    int var54 = 999;
                    int var55 = 0;
                    for (int var56 = 25; var56 < 172; var56++) {
                        if (Statics.field280.field1475[Statics.field280.field1470 * var53 + var56] == 0 && (var56 > 34 || var53 > 34)) {
                            if (var54 == 999) {
                                var54 = var56;
                            }
                        } else if (var54 != 999) {
                            var55 = var56;
                            break;
                        }
                    }
                    Statics.field2467[var53 - 5] = var54 - 25;
                    Statics.field864[var53 - 5] = var55 - var54;
                }
                class21.field315 = class134.field2101;
                class21.field338 = 70;
                field619 = 90;
            }
        } else if (field619 == 90) {
            if (Statics.field636.method2985()) {
                class110 var57 = new class110(Statics.field636, Statics.field1808, 20, 0.8D, field563 ? 64 : 128);
                class104.method2091(var57);
                class104.method2092(0.8D);
                class21.field315 = class134.field2170;
                class21.field338 = 90;
                field619 = 110;
            } else {
                class21.field315 = class134.field2115 + Statics.field636.method3037() + "%";
                class21.field338 = 90;
            }
        } else if (field619 == 110) {
            Statics.field1269 = new class16();
            Statics.field1652.method1460(Statics.field1269, 10);
            class21.field315 = class134.field2104;
            class21.field338 = 94;
            field619 = 120;
        } else if (field619 == 120) {
            if (Statics.field1923.method3009("huffman", "")) {
                class120 var58 = new class120(Statics.field1923.method2950("huffman", ""));
                Statics.field2832 = var58;
                class21.field315 = class134.field2106;
                class21.field338 = 96;
                field619 = 130;
            } else {
                class21.field315 = class134.field2291 + "%";
                class21.field338 = 96;
            }
        } else if (field619 == 130) {
            if (!Statics.field1456.method2985()) {
                class21.field315 = class134.field2107 + Statics.field1456.method3037() * 4 / 5 + "%";
                class21.field338 = 100;
            } else if (!Statics.field89.method2985()) {
                class21.field315 = class134.field2107 + (80 + Statics.field89.method3037() / 6) + "%";
                class21.field338 = 100;
            } else if (Statics.field509.method2985()) {
                class21.field315 = class134.field2196;
                class21.field338 = 100;
                field619 = 140;
            } else {
                class21.field315 = class134.field2107 + (96 + Statics.field509.method3037() / 20) + "%";
                class21.field338 = 100;
            }
        } else if (field619 == 140) {
            method2633(10);
        }
    }

    @ObfuscatedName("h.z(IZZZI)Leo;")
    public static class154 method148(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1431 != null) {
            var4 = new class71(arg0, class82.field1431, Statics.field88[arg0], 1000000);
        }
        return new class154(var4, Statics.field2740, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cn.r(I)V")
    public static final void method1997() {
        try {
            if (field494 == 0) {
                if (Statics.field324 != null) {
                    Statics.field324.method1356();
                    Statics.field324 = null;
                }
                Statics.field1448 = null;
                field512 = false;
                field495 = 0;
                field494 = 1;
            }
            if (field494 == 1) {
                if (Statics.field1448 == null) {
                    Statics.field1448 = Statics.field1652.method1465(Statics.field219, Statics.field1752);
                }
                if (Statics.field1448.field1412 == 2) {
                    throw new IOException();
                }
                if (Statics.field1448.field1412 == 1) {
                    Statics.field324 = new class70((Socket) Statics.field1448.field1416, Statics.field1652);
                    Statics.field1448 = null;
                    field494 = 2;
                }
            }
            if (field494 == 2) {
                field501.field2042 = 0;
                field501.method2386(14);
                Statics.field324.method1361(field501.field2035, 0, 1);
                field595.field2042 = 0;
                field494 = 3;
            }
            if (field494 == 3) {
                if (Statics.field244 != null) {
                    Statics.field244.method1142();
                }
                if (Statics.field1268 != null) {
                    Statics.field1268.method1142();
                }
                int var0 = Statics.field324.method1358();
                if (Statics.field244 != null) {
                    Statics.field244.method1142();
                }
                if (Statics.field1268 != null) {
                    Statics.field1268.method1142();
                }
                if (var0 != 0) {
                    method2374(var0);
                    return;
                }
                field595.field2042 = 0;
                field494 = 5;
            }
            if (field494 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field501.field2042 = 0;
                field501.method2386(10);
                field501.method2389(var1[0]);
                field501.method2389(var1[1]);
                field501.method2389(var1[2]);
                field501.method2389(var1[3]);
                field501.method2390(0L);
                field501.method2574(class21.field309);
                field501.method2418(class6.field87, class6.field85);
                field502.field2042 = 0;
                if (field470 == 40) {
                    field502.method2386(18);
                } else {
                    field502.method2386(16);
                }
                field502.method2387(0);
                int var2 = field502.field2042;
                field502.method2389(12);
                field502.method2423(field501.field2035, 0, field501.field2042);
                int var3 = field502.field2042;
                field502.method2574(class21.field320);
                field502.method2386(field563 ? 1 : 0);
                class82.method1289(field502);
                class127 var4 = new class127(Statics.field1919.method2925());
                Statics.field1919.method2922(var4);
                field502.method2423(var4.field2035, 0, var4.field2035.length);
                field502.method2389(Statics.field267.field2522);
                field502.method2389(Statics.field271.field2522);
                field502.method2389(Statics.field1669.field2522);
                field502.method2389(Statics.field1456.field2522);
                field502.method2389(Statics.field1030.field2522);
                field502.method2389(Statics.field1201.field2522);
                field502.method2389(Statics.field1512.field2522);
                field502.method2389(Statics.field2327.field2522);
                field502.method2389(Statics.field1808.field2522);
                field502.method2389(Statics.field636.field2522);
                field502.method2389(Statics.field1923.field2522);
                field502.method2389(Statics.field1440.field2522);
                field502.method2389(Statics.field89.field2522);
                field502.method2389(Statics.field509.field2522);
                field502.method2389(Statics.field289.field2522);
                field502.method2389(Statics.field2450.field2522);
                field502.method2542(var1, var3, field502.field2042);
                field502.method2396(field502.field2042 - var2);
                Statics.field324.method1361(field502.field2035, 0, field502.field2042);
                field501.method2266(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field595.method2266(var1);
                field494 = 6;
            }
            if (field494 == 6 && Statics.field324.method1359() > 0) {
                int var6 = Statics.field324.method1358();
                if (var6 == 21 && field470 == 20) {
                    field494 = 7;
                } else if (var6 == 2) {
                    field494 = 9;
                } else if (var6 == 15 && field470 == 40) {
                    field501.field2042 = 0;
                    field595.field2042 = 0;
                    field505 = -1;
                    field551 = -1;
                    field510 = -1;
                    field511 = -1;
                    field504 = 0;
                    field506 = 0;
                    field479 = 0;
                    field605 = 0;
                    field724 = false;
                    field696 = 0;
                    field694 = 0;
                    for (int var7 = 0; var7 < field582.length; var7++) {
                        if (field582[var7] != null) {
                            field582[var7].field422 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field559.length; var8++) {
                        if (field559[var8] != null) {
                            field559[var8].field422 = -1;
                        }
                    }
                    class19.method551();
                    method2633(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field604[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field474 < 1) {
                    field474++;
                    field494 = 0;
                } else {
                    method2374(var6);
                    return;
                }
            }
            if (field494 == 7 && Statics.field324.method1359() > 0) {
                field497 = (Statics.field324.method1358() + 3) * 60;
                field494 = 8;
            }
            if (field494 == 8) {
                field495 = 0;
                class21.method46(class134.field2109, class134.field2110, field497 / 60 + class134.field2111);
                if (--field497 <= 0) {
                    field494 = 0;
                }
            } else {
                if (field494 == 9 && Statics.field324.method1359() >= 8) {
                    field629 = Statics.field324.method1358();
                    field630 = Statics.field324.method1358() == 1;
                    field588 = Statics.field324.method1358();
                    field588 <<= 0x8;
                    field588 += Statics.field324.method1358();
                    field589 = Statics.field324.method1358();
                    Statics.field324.method1360(field595.field2035, 0, 1);
                    field595.field2042 = 0;
                    field505 = field595.method2277();
                    Statics.field324.method1360(field595.field2035, 0, 2);
                    field595.field2042 = 0;
                    field504 = field595.method2512();
                    if (field589 == 1) {
                        try {
                            client var10 = Statics.field677;
                            JSObject.getWindow(var10).call("zap", (Object[]) null);
                        } catch (Throwable var31) {
                        }
                    } else {
                        try {
                            client var12 = Statics.field677;
                            JSObject.getWindow(var12).call("unzap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    }
                    field494 = 10;
                }
                if (field494 != 10) {
                    field495++;
                    if (field495 > 2000) {
                        if (field474 < 1) {
                            if (Statics.field928 == Statics.field1752) {
                                Statics.field1752 = Statics.field2463;
                            } else {
                                Statics.field1752 = Statics.field928;
                            }
                            field474++;
                            field494 = 0;
                        } else {
                            method2374(-3);
                        }
                    }
                } else if (Statics.field324.method1359() >= field504) {
                    field595.field2042 = 0;
                    Statics.field324.method1360(field595.field2035, 0, field504);
                    field473 = 1L;
                    field476 = -1;
                    Statics.field1269.field246 = 0;
                    Statics.field1100 = true;
                    field498 = true;
                    field686 = -1L;
                    class182.field2830 = new class177();
                    field501.field2042 = 0;
                    field595.field2042 = 0;
                    field505 = -1;
                    field551 = -1;
                    field510 = -1;
                    field511 = -1;
                    field506 = 0;
                    field479 = 0;
                    field545 = 0;
                    field517 = 0;
                    field605 = 0;
                    field724 = false;
                    class77.field1403 = 0;
                    for (int var14 = 0; var14 < 100; var14++) {
                        field645[var14] = null;
                    }
                    field691 = 0;
                    field616 = 0;
                    field618 = false;
                    field514 = 0;
                    field528 = (int) (Math.random() * 100.0D) - 50;
                    field530 = (int) (Math.random() * 110.0D) - 55;
                    field671 = (int) (Math.random() * 80.0D) - 40;
                    field535 = (int) (Math.random() * 120.0D) - 60;
                    field537 = (int) (Math.random() * 30.0D) - 20;
                    field549 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field696 = 0;
                    field689 = -1;
                    field694 = 0;
                    field695 = 0;
                    field642 = 0;
                    field499 = 0;
                    for (int var15 = 0; var15 < 2048; var15++) {
                        field582[var15] = null;
                        field587[var15] = null;
                    }
                    for (int var16 = 0; var16 < 32768; var16++) {
                        field559[var16] = null;
                    }
                    Statics.field2319 = field582[2047] = new class3();
                    field507.method3279();
                    field614.method3279();
                    for (int var17 = 0; var17 < 4; var17++) {
                        for (int var18 = 0; var18 < 104; var18++) {
                            for (int var19 = 0; var19 < 104; var19++) {
                                field596[var17][var18][var19] = null;
                            }
                        }
                    }
                    field597 = new class177();
                    field715 = 0;
                    field714 = 0;
                    for (int var20 = 0; var20 < Statics.field1036; var20++) {
                        class42 var21 = class42.method35(var20);
                        if (var21 != null && var21.field1035 == 0) {
                            class159.field2714[var20] = 0;
                            class159.field2715[var20] = 0;
                        }
                    }
                    for (int var22 = 0; var22 < field656.length; var22++) {
                        field656[var22] = -1;
                    }
                    if (field622 != -1) {
                        int var23 = field622;
                        if (var23 != -1 && Statics.field2025[var23]) {
                            Statics.field1259.method2945(var23);
                            if (Statics.field2626[var23] != null) {
                                boolean var24 = true;
                                for (int var25 = 0; var25 < Statics.field2626[var23].length; var25++) {
                                    if (Statics.field2626[var23][var25] != null) {
                                        if (Statics.field2626[var23][var25].field2597 == 2) {
                                            var24 = false;
                                        } else {
                                            Statics.field2626[var23][var25] = null;
                                        }
                                    }
                                }
                                if (var24) {
                                    Statics.field2626[var23] = null;
                                }
                                Statics.field2025[var23] = false;
                            }
                        }
                    }
                    for (class4 var26 = (class4) field623.method3257(); var26 != null; var26 = (class4) field623.method3258()) {
                        method3318(var26, true);
                    }
                    field622 = -1;
                    field623 = new class175(8);
                    field459 = null;
                    field724 = false;
                    field605 = 0;
                    field720.method3138((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var27 = 0; var27 < 8; var27++) {
                        field593[var27] = null;
                        field594[var27] = false;
                    }
                    class19.method551();
                    field637 = true;
                    for (int var28 = 0; var28 < 100; var28++) {
                        field604[var28] = true;
                    }
                    field687 = null;
                    Statics.field189 = 0;
                    Statics.field192 = null;
                    Statics.field2054 = -1;
                    method526(false);
                    field505 = -1;
                }
            }
        } catch (IOException var32) {
            if (field474 < 1) {
                if (Statics.field928 == Statics.field1752) {
                    Statics.field1752 = Statics.field2463;
                } else {
                    Statics.field1752 = Statics.field928;
                }
                field474++;
                field494 = 0;
            } else {
                method2374(-2);
            }
        }
    }

    @ObfuscatedName("df.h(IB)V")
    public static void method2374(int arg0) {
        if (arg0 == -3) {
            class21.method46(class134.field2112, class134.field2113, class134.field2114);
        } else if (arg0 == -2) {
            class21.method46(class134.field2266, class134.field2116, class134.field2302);
        } else if (arg0 == -1) {
            class21.method46(class134.field2144, class134.field2086, class134.field2120);
        } else if (arg0 == 3) {
            class21.method46(class134.field2121, class134.field2200, class134.field2123);
        } else if (arg0 == 4) {
            class21.method46(class134.field2124, class134.field2174, class134.field2126);
        } else if (arg0 == 5) {
            class21.method46(class134.field2127, class134.field2141, class134.field2236);
        } else if (arg0 == 6) {
            class21.method46(class134.field2130, class134.field2131, class134.field2132);
        } else if (arg0 == 7) {
            class21.method46(class134.field2092, class134.field2295, class134.field2305);
        } else if (arg0 == 8) {
            class21.method46(class134.field2292, class134.field2146, class134.field2138);
        } else if (arg0 == 9) {
            class21.method46(class134.field2139, class134.field2140, class134.field2306);
        } else if (arg0 == 10) {
            class21.method46(class134.field2142, class134.field2143, class134.field2151);
        } else if (arg0 == 11) {
            class21.method46(class134.field2145, class134.field2155, class134.field2147);
        } else if (arg0 == 12) {
            class21.method46(class134.field2148, class134.field2128, class134.field2080);
        } else if (arg0 == 13) {
            class21.method46(class134.field2122, class134.field2197, class134.field2257);
        } else if (arg0 == 14) {
            class21.method46(class134.field2154, class134.field2103, class134.field2156);
        } else if (arg0 == 16) {
            class21.method46(class134.field2157, class134.field2158, class134.field2150);
        } else if (arg0 == 17) {
            class21.method46(class134.field2160, class134.field2161, class134.field2119);
        } else if (arg0 == 18) {
            class21.method46(class134.field2268, class134.field2260, class134.field2165);
        } else if (arg0 == 19) {
            class21.method46(class134.field2166, class134.field2206, class134.field2168);
        } else if (arg0 == 20) {
            class21.method46(class134.field2169, class134.field2153, class134.field2171);
        } else if (arg0 == 22) {
            class21.method46(class134.field2270, class134.field2173, class134.field2133);
        } else if (arg0 == 23) {
            class21.method46(class134.field2175, class134.field2269, class134.field2177);
        } else if (arg0 == 24) {
            class21.method46(class134.field2247, class134.field2179, class134.field2180);
        } else if (arg0 == 25) {
            class21.method46(class134.field2167, class134.field2182, class134.field2125);
        } else if (arg0 == 26) {
            class21.method46(class134.field2184, class134.field2129, class134.field2105);
        } else if (arg0 == 27) {
            class21.method46(class134.field2187, class134.field2188, class134.field2189);
        } else if (arg0 == 31) {
            class21.method46(class134.field2283, class134.field2212, class134.field2199);
        } else if (arg0 == 32) {
            class21.method46(class134.field2136, class134.field2137, class134.field2201);
        } else if (arg0 == 37) {
            class21.method46(class134.field2202, class134.field2251, class134.field2243);
        } else if (arg0 == 38) {
            class21.method46(class134.field2205, class134.field2298, class134.field2207);
        } else if (arg0 == 55) {
            class21.method46(class134.field2208, class134.field2209, class134.field2210);
        } else {
            class21.method46(class134.field2211, class134.field2203, class134.field2213);
        }
        method2633(10);
    }

    @ObfuscatedName("ah.v(I)V")
    public static final void method578() {
        if (Statics.field324 != null) {
            Statics.field324.method1356();
            Statics.field324 = null;
        }
        method142();
        Statics.field2456.method1826();
        for (int var0 = 0; var0 < 4; var0++) {
            field477[var0].method3187();
        }
        System.gc();
        class138.field2340 = 1;
        Statics.field2341 = null;
        Statics.field2342 = -1;
        Statics.field2344 = -1;
        Statics.field2012 = 0;
        Statics.field2030 = false;
        Statics.field2038 = 2;
        field698 = -1;
        field699 = false;
        class7.method52();
        method2633(10);
    }

    @ObfuscatedName("z.u(I)V")
    public static final void method142() {
        class37.field948.method3209();
        class33.field858.method3209();
        class36.method206();
        class32.field802.method3209();
        class32.field803.method3209();
        class32.field823.method3209();
        class32.field813.method3209();
        class31.field782.method3209();
        class31.field762.method3209();
        class40.method214();
        class34.field881.method3209();
        class34.field870.method3209();
        class35.method1633();
        class38.method33();
        class42.method777();
        class163.method3051();
        class158.method2264();
        ((class110) Statics.field1773).method2175();
        class5.field75.method3209();
        Statics.field267.method2946();
        Statics.field271.method2946();
        Statics.field1456.method2946();
        Statics.field1030.method2946();
        Statics.field1201.method2946();
        Statics.field1512.method2946();
        Statics.field2327.method2946();
        Statics.field1808.method2946();
        Statics.field636.method2946();
        Statics.field1923.method2946();
        Statics.field1440.method2946();
        Statics.field89.method2946();
    }

    @ObfuscatedName("fj.i(I)V")
    public static final void method3116() {
        if (field545 > 0) {
            method578();
        } else {
            method2633(40);
            Statics.field2565 = Statics.field324;
            Statics.field324 = null;
        }
    }

    @ObfuscatedName("i.e(I)V")
    public static final void method178() {
        if (field479 > 1) {
            field479--;
        }
        if (field545 > 0) {
            field545--;
        }
        if (field512) {
            field512 = false;
            method3116();
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field324 == null) {
                var1 = false;
            } else {
                label2305: {
                    try {
                        int var2 = Statics.field324.method1359();
                        if (var2 == 0) {
                            var1 = false;
                            break label2305;
                        }
                        if (field505 == -1) {
                            Statics.field324.method1360(field595.field2035, 0, 1);
                            field595.field2042 = 0;
                            field505 = field595.method2277();
                            field504 = class165.field2778[field505];
                            var2--;
                        }
                        if (field504 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2305;
                            }
                            Statics.field324.method1360(field595.field2035, 0, 1);
                            field504 = field595.field2035[0] & 0xFF;
                            var2--;
                        }
                        if (field504 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2305;
                            }
                            Statics.field324.method1360(field595.field2035, 0, 2);
                            field595.field2042 = 0;
                            field504 = field595.method2512();
                            var2 -= 2;
                        }
                        if (var2 < field504) {
                            var1 = false;
                            break label2305;
                        }
                        field595.field2042 = 0;
                        Statics.field324.method1360(field595.field2035, 0, field504);
                        field506 = 0;
                        field511 = field510;
                        field510 = field551;
                        field551 = field505;
                        if (field505 == 235) {
                            field679 = field595.method2509();
                            field680 = field595.method2509();
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 2) {
                            int var3 = field595.method2391();
                            int var4 = field595.method2410();
                            int var5 = field595.method2432();
                            class4 var6 = (class4) field623.method3255((long) var3);
                            if (var6 != null) {
                                method3318(var6, var6.field66 != var5);
                            }
                            method131(var3, var5, var4);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 22) {
                            boolean var7 = field595.method2425() == 1;
                            int var8 = field595.method2405();
                            class158 var9 = class158.method3027(var8);
                            if (var9.field2601 != var7) {
                                var9.field2601 = var7;
                                method62(var9);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 98) {
                            String var10 = field595.method2408();
                            long var11 = field595.method2406();
                            long var13 = (long) field595.method2512();
                            long var15 = (long) field595.method2404();
                            int var17 = field595.method2509();
                            long var18 = (var13 << 32) + var15;
                            boolean var20 = false;
                            for (int var21 = 0; var21 < 100; var21++) {
                                if (field681[var21] == var18) {
                                    var20 = true;
                                    break;
                                }
                            }
                            if (var17 <= 1 && method2262(var10)) {
                                var20 = true;
                            }
                            if (!var20 && field581 == 0) {
                                field681[field475] = var18;
                                field475 = (field475 + 1) % 100;
                                String var22 = class185.method3363(class147.method129(class184.method2321(field595)));
                                if (var17 == 2 || var17 == 3) {
                                    method1562(9, class2.method2083(1) + var10, var22, class146.method149(var11));
                                } else if (var17 == 1) {
                                    method1562(9, class2.method2083(0) + var10, var22, class146.method149(var11));
                                } else {
                                    method1562(9, var10, var22, class146.method149(var11));
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 174) {
                            field715 = 1;
                            field653 = field600;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 148) {
                            for (int var23 = 0; var23 < class159.field2715.length; var23++) {
                                if (class159.field2715[var23] != class159.field2714[var23]) {
                                    class159.field2715[var23] = class159.field2714[var23];
                                    method760(var23);
                                    field646[++field647 - 1 & 0x1F] = var23;
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 184) {
                            String var24 = field595.method2408();
                            int var25 = field595.method2512();
                            byte var26 = field595.method2500();
                            boolean var27 = false;
                            if (var26 == -128) {
                                var27 = true;
                            }
                            if (var27) {
                                if (Statics.field189 == 0) {
                                    field505 = -1;
                                    var1 = true;
                                    break label2305;
                                }
                                boolean var28 = false;
                                int var29;
                                for (var29 = 0; var29 < Statics.field189 && (!Statics.field192[var29].field119.equals(var24) || Statics.field192[var29].field116 != var25); var29++) {
                                }
                                if (var29 < Statics.field189) {
                                    while (var29 < Statics.field189 - 1) {
                                        Statics.field192[var29] = Statics.field192[var29 + 1];
                                        var29++;
                                    }
                                    Statics.field189--;
                                    Statics.field192[Statics.field189] = null;
                                }
                            } else {
                                field595.method2408();
                                class8 var30 = new class8();
                                var30.field119 = var24;
                                var30.field115 = class148.method808(var30.field119, Statics.field464);
                                var30.field116 = var25;
                                var30.field117 = var26;
                                int var31;
                                for (var31 = Statics.field189 - 1; var31 >= 0; var31--) {
                                    int var32 = Statics.field192[var31].field115.compareTo(var30.field119);
                                    if (var32 == 0) {
                                        Statics.field192[var31].field116 = var25;
                                        Statics.field192[var31].field117 = var26;
                                        if (var24.equals(Statics.field2319.field52)) {
                                            Statics.field19 = var26;
                                        }
                                        field654 = field600;
                                        field505 = -1;
                                        var1 = true;
                                        break label2305;
                                    }
                                    if (var32 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field189 >= Statics.field192.length) {
                                    field505 = -1;
                                    var1 = true;
                                    break label2305;
                                }
                                for (int var33 = Statics.field189 - 1; var33 > var31; var33--) {
                                    Statics.field192[var33 + 1] = Statics.field192[var33];
                                }
                                if (Statics.field189 == 0) {
                                    Statics.field192 = new class8[100];
                                }
                                Statics.field192[var31 + 1] = var30;
                                Statics.field189++;
                                if (var24.equals(Statics.field2319.field52)) {
                                    Statics.field19 = var26;
                                }
                            }
                            field654 = field600;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 37) {
                            field479 = field595.method2578() * 30;
                            field655 = field600;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 190) {
                            field694 = 0;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 186) {
                            int var34 = field595.method2568();
                            int var35 = field595.method2509();
                            String var36 = field595.method2408();
                            if (var34 >= 1 && var34 <= 8) {
                                if (var36.equalsIgnoreCase("null")) {
                                    var36 = null;
                                }
                                field593[var34 - 1] = var36;
                                field594[var34 - 1] = var35 == 0;
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 66) {
                            int var37 = field595.method2578();
                            Statics.method1509(var37);
                            field586[++field649 - 1 & 0x1F] = var37 & 0x7FFF;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 102) {
                            while (field595.field2042 < field504) {
                                int var38 = field595.method2509();
                                boolean var39 = (var38 & 0x1) == 1;
                                String var40 = field595.method2408();
                                String var41 = field595.method2408();
                                field595.method2408();
                                for (int var42 = 0; var42 < field712; var42++) {
                                    class11 var43 = field719[var42];
                                    if (var39) {
                                        if (var41.equals(var43.field178)) {
                                            var43.field178 = var40;
                                            var43.field177 = var41;
                                            var40 = null;
                                            break;
                                        }
                                    } else if (var40.equals(var43.field178)) {
                                        var43.field178 = var40;
                                        var43.field177 = var41;
                                        var40 = null;
                                        break;
                                    }
                                }
                                if (var40 != null && field712 < 100) {
                                    class11 var44 = new class11();
                                    field719[field712] = var44;
                                    var44.field178 = var40;
                                    var44.field177 = var41;
                                    field712++;
                                }
                            }
                            field653 = field600;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 224) {
                            int var45 = field595.method2405();
                            class4 var46 = (class4) field623.method3255((long) var45);
                            if (var46 != null) {
                                method3318(var46, true);
                            }
                            if (field459 != null) {
                                method62(field459);
                                field459 = null;
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 158) {
                            field722 = true;
                            Statics.field10 = field595.method2509();
                            Statics.field1441 = field595.method2509();
                            Statics.field1305 = field595.method2512();
                            Statics.field365 = field595.method2509();
                            Statics.field795 = field595.method2509();
                            if (Statics.field795 >= 100) {
                                Statics.field865 = Statics.field10 * 128 + 64;
                                Statics.field1507 = Statics.field1441 * 128 + 64;
                                Statics.field212 = method163(Statics.field865, Statics.field1507, Statics.field2034) - Statics.field1305;
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 45) {
                            method8();
                            field627 = field595.method2509();
                            field655 = field600;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 30) {
                            int var47 = field595.method2419();
                            int var48 = field595.method2434();
                            class158 var49 = class158.method3027(var47);
                            if (var49 != null && var49.field2597 == 0) {
                                if (var48 > var49.field2611 - var49.field2605) {
                                    var48 = var49.field2611 - var49.field2605;
                                }
                                if (var48 < 0) {
                                    var48 = 0;
                                }
                                if (var49.field2691 != var48) {
                                    var49.field2691 = var48;
                                    method62(var49);
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 123) {
                            field517 = field595.method2509();
                            if (field517 == 1) {
                                field481 = field595.method2512();
                            }
                            if (field517 >= 2 && field517 <= 6) {
                                if (field517 == 2) {
                                    field486 = 64;
                                    field492 = 64;
                                }
                                if (field517 == 3) {
                                    field486 = 0;
                                    field492 = 64;
                                }
                                if (field517 == 4) {
                                    field486 = 128;
                                    field492 = 64;
                                }
                                if (field517 == 5) {
                                    field486 = 64;
                                    field492 = 0;
                                }
                                if (field517 == 6) {
                                    field486 = 64;
                                    field492 = 128;
                                }
                                field517 = 2;
                                field483 = field595.method2512();
                                field484 = field595.method2512();
                                field485 = field595.method2509();
                            }
                            if (field517 == 10) {
                                field482 = field595.method2512();
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 183) {
                            int var50 = field595.method2432();
                            int var51 = field595.method2391();
                            class159.field2714[var50] = var51;
                            if (class159.field2715[var50] != var51) {
                                class159.field2715[var50] = var51;
                                method760(var50);
                            }
                            field646[++field647 - 1 & 0x1F] = var50;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 159) {
                            int var52 = field595.method2405();
                            int var53 = field595.method2512();
                            if (var52 < -70000) {
                                var53 += 32768;
                            }
                            class158 var54;
                            if (var52 >= 0) {
                                var54 = class158.method3027(var52);
                            } else {
                                var54 = null;
                            }
                            if (var54 != null) {
                                for (int var55 = 0; var55 < var54.field2660.length; var55++) {
                                    var54.field2660[var55] = 0;
                                    var54.field2698[var55] = 0;
                                }
                            }
                            class19 var56 = (class19) class19.field277.method3255((long) var53);
                            if (var56 != null) {
                                for (int var57 = 0; var57 < var56.field268.length; var57++) {
                                    var56.field268[var57] = -1;
                                    var56.field270[var57] = 0;
                                }
                            }
                            int var58 = field595.method2512();
                            for (int var59 = 0; var59 < var58; var59++) {
                                int var60 = field595.method2425();
                                if (var60 == 255) {
                                    var60 = field595.method2441();
                                }
                                int var61 = field595.method2432();
                                if (var54 != null && var59 < var54.field2660.length) {
                                    var54.field2660[var59] = var61;
                                    var54.field2698[var59] = var60;
                                }
                                class19.method215(var53, var59, var61 - 1, var60);
                            }
                            if (var54 != null) {
                                method62(var54);
                            }
                            method8();
                            field586[++field649 - 1 & 0x1F] = var53 & 0x7FFF;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 48) {
                            Statics.field59 = field595.method2410();
                            Statics.field1273 = field595.method2410();
                            for (int var62 = Statics.field59; var62 < Statics.field59 + 8; var62++) {
                                for (int var63 = Statics.field1273; var63 < Statics.field1273 + 8; var63++) {
                                    if (field596[Statics.field2034][var62][var63] != null) {
                                        field596[Statics.field2034][var62][var63] = null;
                                        method2584(var62, var63);
                                    }
                                }
                            }
                            for (class22 var64 = (class22) field597.method3278(); var64 != null; var64 = (class22) field597.method3280()) {
                                if (var64.field341 >= Statics.field59 && var64.field341 < Statics.field59 + 8 && var64.field342 >= Statics.field1273 && var64.field342 < Statics.field1273 + 8 && Statics.field2034 == var64.field353) {
                                    var64.field350 = 0;
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 223) {
                            Statics.field1273 = field595.method2509();
                            Statics.field59 = field595.method2425();
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 85) {
                            int var65 = field595.method2512();
                            int var66 = field595.method2509();
                            int var67 = field595.method2512();
                            method2167(var65, var66, var67);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 122) {
                            int var68 = field595.method2405();
                            class158 var69 = class158.method3027(var68);
                            for (int var70 = 0; var70 < var69.field2660.length; var70++) {
                                var69.field2660[var70] = -1;
                                var69.field2660[var70] = 0;
                            }
                            method62(var69);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 200) {
                            String var71 = field595.method2408();
                            String var72 = class185.method3363(class147.method129(class184.method2321(field595)));
                            method2003(6, var71, var72);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 5) {
                            int var73 = field595.method2419();
                            class158 var74 = class158.method3027(var73);
                            var74.field2627 = 3;
                            var74.field2686 = Statics.field2319.field40.method3131();
                            method62(var74);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 243) {
                            method526(false);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 113) {
                            field722 = false;
                            for (int var75 = 0; var75 < 5; var75++) {
                                field709[var75] = false;
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 147) {
                            int var76 = field595.method2405();
                            int var77 = field595.method2471();
                            int var78 = field595.method2436();
                            class158 var79 = class158.method3027(var76);
                            int var80 = var79.field2602 + var78;
                            int var81 = var79.field2603 + var77;
                            if (var79.field2600 != var80 || var79.field2702 != var81) {
                                var79.field2600 = var80;
                                var79.field2702 = var81;
                                method62(var79);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 229) {
                            byte var82 = field595.method2500();
                            int var83 = field595.method2512();
                            class159.field2714[var83] = var82;
                            if (class159.field2715[var83] != var82) {
                                class159.field2715[var83] = var82;
                                method760(var83);
                            }
                            field646[++field647 - 1 & 0x1F] = var83;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 163) {
                            while (field595.field2042 < field504) {
                                boolean var84 = field595.method2509() == 1;
                                String var85 = field595.method2408();
                                String var86 = field595.method2408();
                                int var87 = field595.method2512();
                                int var88 = field595.method2509();
                                int var89 = field595.method2509();
                                boolean var90 = (var89 & 0x2) != 0;
                                boolean var91 = (var89 & 0x1) != 0;
                                if (var87 > 0) {
                                    field595.method2408();
                                    field595.method2509();
                                    field595.method2405();
                                }
                                field595.method2408();
                                for (int var92 = 0; var92 < field714; var92++) {
                                    class23 var93 = field716[var92];
                                    if (var84) {
                                        if (var86.equals(var93.field362)) {
                                            var93.field362 = var85;
                                            var93.field355 = var86;
                                            var85 = null;
                                            break;
                                        }
                                    } else if (var85.equals(var93.field362)) {
                                        if (var93.field357 != var87) {
                                            boolean var94 = true;
                                            for (class28 var95 = (class28) field717.method3245(); var95 != null; var95 = (class28) field717.method3239()) {
                                                if (var95.field728.equals(var85)) {
                                                    if (var87 != 0 && var95.field734 == 0) {
                                                        var95.method3302();
                                                        var94 = false;
                                                    } else if (var87 == 0 && var95.field734 != 0) {
                                                        var95.method3302();
                                                        var94 = false;
                                                    }
                                                }
                                            }
                                            if (var94) {
                                                field717.method3237(new class28(var85, var87));
                                            }
                                            var93.field357 = var87;
                                        }
                                        var93.field355 = var86;
                                        var93.field358 = var88;
                                        var93.field359 = var90;
                                        var93.field360 = var91;
                                        var85 = null;
                                        break;
                                    }
                                }
                                if (var85 != null && field714 < 200) {
                                    class23 var96 = new class23();
                                    field716[field714] = var96;
                                    var96.field362 = var85;
                                    var96.field355 = var86;
                                    var96.field357 = var87;
                                    var96.field358 = var88;
                                    var96.field359 = var90;
                                    var96.field360 = var91;
                                    field714++;
                                }
                            }
                            field715 = 2;
                            field653 = field600;
                            boolean var97 = false;
                            int var98 = field714;
                            while (var98 > 0) {
                                boolean var99 = true;
                                var98--;
                                for (int var100 = 0; var100 < var98; var100++) {
                                    boolean var101 = false;
                                    class23 var102 = field716[var100];
                                    class23 var103 = field716[var100 + 1];
                                    if (field461 != var102.field357 && field461 == var103.field357) {
                                        var101 = true;
                                    }
                                    if (!var101 && var102.field357 == 0 && var103.field357 != 0) {
                                        var101 = true;
                                    }
                                    if (!var101 && !var102.field359 && var103.field359) {
                                        var101 = true;
                                    }
                                    if (!var101 && !var102.field360 && var103.field360) {
                                        var101 = true;
                                    }
                                    if (var101) {
                                        class23 var104 = field716[var100];
                                        field716[var100] = field716[var100 + 1];
                                        field716[var100 + 1] = var104;
                                        var99 = false;
                                    }
                                }
                                if (var99) {
                                    break;
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 54) {
                            int var105 = field595.method2405();
                            int var106 = field595.method2434();
                            class158 var107 = class158.method3027(var105);
                            if (var107.field2627 != 1 || var107.field2686 != var106) {
                                var107.field2627 = 1;
                                var107.field2686 = var106;
                                method62(var107);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 100) {
                            int var108 = field595.method2405();
                            int var109 = field595.method2432();
                            if (var109 == 65535) {
                                var109 = -1;
                            }
                            int var110 = field595.method2441();
                            class158 var111 = class158.method3027(var110);
                            if (var111.field2594) {
                                var111.field2706 = var109;
                                var111.field2636 = var108;
                                class40 var113 = class40.method211(var109);
                                var111.field2635 = var113.field990;
                                var111.field2689 = var113.field991;
                                var111.field2683 = var113.field992;
                                var111.field2633 = var113.field999;
                                var111.field2634 = var113.field980;
                                var111.field2638 = var113.field989;
                                if (var111.field2637 > 0) {
                                    var111.field2638 = var111.field2638 * 32 / var111.field2637;
                                }
                                method62(var111);
                            } else {
                                if (var109 == -1) {
                                    var111.field2627 = 0;
                                    field505 = -1;
                                    var1 = true;
                                    break label2305;
                                }
                                class40 var112 = class40.method211(var109);
                                var111.field2627 = 4;
                                var111.field2686 = var109;
                                var111.field2635 = var112.field990;
                                var111.field2689 = var112.field991;
                                var111.field2638 = var112.field989 * 100 / var108;
                                method62(var111);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 47) {
                            Statics.field2331 = class137.method105(field595.method2509());
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 176) {
                            method8();
                            int var114 = field595.method2410();
                            int var115 = field595.method2405();
                            int var116 = field595.method2509();
                            field503[var114] = var115;
                            field552[var114] = var116;
                            field601[var114] = 1;
                            for (int var117 = 0; var117 < 98; var117++) {
                                if (var115 >= class130.field2045[var117]) {
                                    field601[var114] = var117 + 2;
                                }
                            }
                            field650[++field523 - 1 & 0x1F] = var114;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 209) {
                            if (field622 != -1) {
                                method1510(field622, 0);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 211) {
                            int var118 = field595.method2419();
                            Statics.field733 = Statics.field1652.method1476(var118);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 33 || field505 == 108 || field505 == 75 || field505 == 119 || field505 == 8 || field505 == 207 || field505 == 142 || field505 == 63 || field505 == 64 || field505 == 94 || field505 == 179) {
                            method1349();
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 68) {
                            int var119 = field595.method2432();
                            int var120 = field595.method2512();
                            int var121 = field595.method2432();
                            int var122 = field595.method2419();
                            class158 var123 = class158.method3027(var122);
                            if (var123.field2635 != var119 || var123.field2689 != var121 || var123.field2638 != var120) {
                                var123.field2635 = var119;
                                var123.field2689 = var121;
                                var123.field2638 = var120;
                                method62(var123);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 178) {
                            String var124 = field595.method2408();
                            int var125 = field595.method2405();
                            class158 var126 = class158.method3027(var125);
                            if (!var124.equals(var126.field2642)) {
                                var126.field2642 = var124;
                                method62(var126);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 57) {
                            method151();
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 129) {
                            method526(true);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 185) {
                            int var127 = field595.method2434();
                            field622 = var127;
                            method139(var127);
                            class26.method809(field622);
                            for (int var128 = 0; var128 < 100; var128++) {
                                field604[var128] = true;
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 61) {
                            int var129 = field595.method2432();
                            if (var129 == 65535) {
                                var129 = -1;
                            }
                            method212(var129);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 236) {
                            int var130 = field595.method2578();
                            if (var130 == 65535) {
                                var130 = -1;
                            }
                            int var131 = field595.method2585();
                            if (field532 != 0 && var130 != -1) {
                                class138.method574(Statics.field1440, var130, 0, field532, false);
                                field699 = true;
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 58) {
                            for (int var132 = 0; var132 < field582.length; var132++) {
                                if (field582[var132] != null) {
                                    field582[var132].field428 = -1;
                                }
                            }
                            for (int var133 = 0; var133 < field559.length; var133++) {
                                if (field559[var133] != null) {
                                    field559[var133].field428 = -1;
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 42) {
                            String var134 = field595.method2408();
                            if (var134.endsWith(":tradereq:")) {
                                String var135 = var134.substring(0, var134.indexOf(":"));
                                boolean var136 = false;
                                if (method2262(var135)) {
                                    var136 = true;
                                }
                                if (!var136 && field581 == 0) {
                                    method2003(4, var135, class134.field2214);
                                }
                            } else if (var134.endsWith(":duelreq:")) {
                                String var137 = var134.substring(0, var134.indexOf(":"));
                                boolean var138 = false;
                                if (method2262(var137)) {
                                    var138 = true;
                                }
                                if (!var138 && field581 == 0) {
                                    method2003(8, var137, class134.field2215);
                                }
                            } else if (var134.endsWith(":chalreq:")) {
                                String var139 = var134.substring(0, var134.indexOf(":"));
                                boolean var140 = false;
                                if (method2262(var139)) {
                                    var140 = true;
                                }
                                if (!var140 && field581 == 0) {
                                    String var141 = var134.substring(var134.indexOf(":") + 1, var134.length() - 9);
                                    method2003(8, var139, var141);
                                }
                            } else if (var134.endsWith(":assistreq:")) {
                                String var142 = var134.substring(0, var134.indexOf(":"));
                                boolean var143 = false;
                                if (method2262(var142)) {
                                    var143 = true;
                                }
                                if (!var143 && field581 == 0) {
                                    method2003(10, var142, "");
                                }
                            } else if (var134.endsWith(":clan:")) {
                                String var144 = var134.substring(0, var134.indexOf(":clan:"));
                                method2003(11, "", var144);
                            } else if (var134.endsWith(":trade:")) {
                                String var145 = var134.substring(0, var134.indexOf(":trade:"));
                                if (field581 == 0) {
                                    method2003(12, "", var145);
                                }
                            } else if (var134.endsWith(":assist:")) {
                                String var146 = var134.substring(0, var134.indexOf(":assist:"));
                                if (field581 == 0) {
                                    method2003(13, "", var146);
                                }
                            } else {
                                method2003(0, "", var134);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 150) {
                            field696 = field595.method2509();
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 168) {
                            Statics.field1273 = field595.method2509();
                            Statics.field59 = field595.method2425();
                            while (field595.field2042 < field504) {
                                field505 = field595.method2509();
                                method1349();
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 12) {
                            String var147 = field595.method2408();
                            long var148 = (long) field595.method2512();
                            long var150 = (long) field595.method2404();
                            int var152 = field595.method2509();
                            long var153 = (var148 << 32) + var150;
                            boolean var155 = false;
                            for (int var156 = 0; var156 < 100; var156++) {
                                if (field681[var156] == var153) {
                                    var155 = true;
                                    break;
                                }
                            }
                            if (method2262(var147)) {
                                var155 = true;
                            }
                            if (!var155 && field581 == 0) {
                                field681[field475] = var153;
                                field475 = (field475 + 1) % 100;
                                String var157 = class185.method3363(class147.method129(class184.method2321(field595)));
                                if (var152 == 2 || var152 == 3) {
                                    method2003(7, class2.method2083(1) + var147, var157);
                                } else if (var152 == 1) {
                                    method2003(7, class2.method2083(0) + var147, var157);
                                } else {
                                    method2003(3, var147, var157);
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 70) {
                            method56();
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 69) {
                            class116 var158 = field595;
                            int var159 = field504;
                            class181 var160 = new class181();
                            var160.field2822 = var158.method2509();
                            var160.field2829 = var158.method2405();
                            var160.field2824 = new int[var160.field2822];
                            var160.field2825 = new int[var160.field2822];
                            var160.field2826 = new Field[var160.field2822];
                            var160.field2827 = new int[var160.field2822];
                            var160.field2823 = new Method[var160.field2822];
                            var160.field2828 = new byte[var160.field2822][][];
                            for (int var161 = 0; var161 < var160.field2822; var161++) {
                                try {
                                    int var162 = var158.method2509();
                                    if (var162 == 0 || var162 == 1 || var162 == 2) {
                                        String var163 = new String(var158.method2408());
                                        String var164 = new String(var158.method2408());
                                        int var165 = 0;
                                        if (var162 == 1) {
                                            var165 = var158.method2405();
                                        }
                                        var160.field2824[var161] = var162;
                                        var160.field2827[var161] = var165;
                                        var160.field2826[var161] = class182.method2618(var163).getDeclaredField(var164);
                                    } else if (var162 == 3 || var162 == 4) {
                                        String var166 = new String(var158.method2408());
                                        String var167 = new String(var158.method2408());
                                        int var168 = var158.method2509();
                                        String[] var169 = new String[var168];
                                        for (int var170 = 0; var170 < var168; var170++) {
                                            var169[var170] = new String(var158.method2408());
                                        }
                                        byte[][] var171 = new byte[var168][];
                                        if (var162 == 3) {
                                            for (int var172 = 0; var172 < var168; var172++) {
                                                int var173 = var158.method2405();
                                                var171[var172] = new byte[var173];
                                                var158.method2388(var171[var172], 0, var173);
                                            }
                                        }
                                        var160.field2824[var161] = var162;
                                        Class[] var174 = new Class[var168];
                                        for (int var175 = 0; var175 < var168; var175++) {
                                            var174[var175] = class182.method2618(var169[var175]);
                                        }
                                        var160.field2823[var161] = class182.method2618(var166).getDeclaredMethod(var167, var174);
                                        var160.field2828[var161] = var171;
                                    }
                                } catch (ClassNotFoundException var344) {
                                    var160.field2825[var161] = -1;
                                } catch (SecurityException var345) {
                                    var160.field2825[var161] = -2;
                                } catch (NullPointerException var346) {
                                    var160.field2825[var161] = -3;
                                } catch (Exception var347) {
                                    var160.field2825[var161] = -4;
                                } catch (Throwable var348) {
                                    var160.field2825[var161] = -5;
                                }
                            }
                            class182.field2830.method3273(var160);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 222) {
                            field654 = field600;
                            if (field504 == 0) {
                                field687 = null;
                                field688 = null;
                                Statics.field189 = 0;
                                Statics.field192 = null;
                                field505 = -1;
                                var1 = true;
                            } else {
                                field688 = field595.method2408();
                                long var181 = field595.method2406();
                                field687 = class146.method1486(var181);
                                Statics.field351 = field595.method2500();
                                int var183 = field595.method2509();
                                if (var183 == 255) {
                                    field505 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field189 = var183;
                                    class8[] var184 = new class8[100];
                                    for (int var185 = 0; var185 < Statics.field189; var185++) {
                                        var184[var185] = new class8();
                                        var184[var185].field119 = field595.method2408();
                                        var184[var185].field115 = class148.method808(var184[var185].field119, Statics.field464);
                                        var184[var185].field116 = field595.method2512();
                                        var184[var185].field117 = field595.method2500();
                                        field595.method2408();
                                        if (var184[var185].field119.equals(Statics.field2319.field52)) {
                                            Statics.field19 = var184[var185].field117;
                                        }
                                    }
                                    boolean var186 = false;
                                    int var187 = Statics.field189;
                                    while (var187 > 0) {
                                        boolean var188 = true;
                                        var187--;
                                        for (int var189 = 0; var189 < var187; var189++) {
                                            if (var184[var189].field115.compareTo(var184[var189 + 1].field115) > 0) {
                                                class8 var190 = var184[var189];
                                                var184[var189] = var184[var189 + 1];
                                                var184[var189 + 1] = var190;
                                                var188 = false;
                                            }
                                        }
                                        if (var188) {
                                            break;
                                        }
                                    }
                                    Statics.field192 = var184;
                                    field505 = -1;
                                    var1 = true;
                                }
                            }
                            break label2305;
                        }
                        if (field505 == 10) {
                            int var191 = field504 + field595.field2042;
                            int var192 = field595.method2512();
                            int var193 = field595.method2512();
                            if (field622 != var192) {
                                field622 = var192;
                                method139(field622);
                                class26.method809(field622);
                                for (int var194 = 0; var194 < 100; var194++) {
                                    field604[var194] = true;
                                }
                            }
                            while (var193-- > 0) {
                                int var195 = field595.method2405();
                                int var196 = field595.method2512();
                                int var197 = field595.method2509();
                                class4 var198 = (class4) field623.method3255((long) var195);
                                if (var198 != null && var198.field66 != var196) {
                                    method3318(var198, true);
                                    var198 = null;
                                }
                                if (var198 == null) {
                                    var198 = method131(var195, var196, var197);
                                }
                                var198.field67 = true;
                            }
                            for (class4 var199 = (class4) field623.method3257(); var199 != null; var199 = (class4) field623.method3258()) {
                                if (var199.field67) {
                                    var199.field67 = false;
                                } else {
                                    method3318(var199, true);
                                }
                            }
                            field662 = new class175(512);
                            while (field595.field2042 < var191) {
                                int var200 = field595.method2405();
                                int var201 = field595.method2512();
                                int var202 = field595.method2512();
                                int var203 = field595.method2405();
                                for (int var204 = var201; var204 <= var202; var204++) {
                                    long var205 = ((long) var200 << 32) + (long) var204;
                                    field662.method3268(new class171(var203), var205);
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 26) {
                            method8();
                            field628 = field595.method2403();
                            field655 = field600;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 4) {
                            int var207 = field595.method2578();
                            int var208 = field595.method2391();
                            int var209 = var207 >> 10 & 0x1F;
                            int var210 = var207 >> 5 & 0x1F;
                            int var211 = var207 & 0x1F;
                            int var212 = (var211 << 3) + (var209 << 19) + (var210 << 11);
                            class158 var213 = class158.method3027(var208);
                            if (var213.field2607 != var212) {
                                var213.field2607 = var212;
                                method62(var213);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 15) {
                            field722 = true;
                            Statics.field1039 = field595.method2509();
                            Statics.field291 = field595.method2509();
                            Statics.field2376 = field595.method2512();
                            Statics.field2405 = field595.method2509();
                            Statics.field910 = field595.method2509();
                            if (Statics.field910 >= 100) {
                                int var214 = Statics.field1039 * 128 + 64;
                                int var215 = Statics.field291 * 128 + 64;
                                int var216 = method163(var214, var215, Statics.field2034) - Statics.field2376;
                                int var217 = var214 - Statics.field865;
                                int var218 = var216 - Statics.field212;
                                int var219 = var215 - Statics.field1507;
                                int var220 = (int) Math.sqrt((double) (var217 * var217 + var219 * var219));
                                Statics.field83 = (int) (Math.atan2((double) var218, (double) var220) * 325.949D) & 0x7FF;
                                Statics.field708 = (int) (Math.atan2((double) var217, (double) var219) * -325.949D) & 0x7FF;
                                if (Statics.field83 < 128) {
                                    Statics.field83 = 128;
                                }
                                if (Statics.field83 > 383) {
                                    Statics.field83 = 383;
                                }
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 118) {
                            int var221 = field595.method2425();
                            int var222 = field595.method2425();
                            int var223 = field595.method2568();
                            Statics.field2034 = var222 >> 1;
                            Statics.field2319.method231(var221, var223, (var222 & 0x1) == 1);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 14) {
                            method578();
                            field505 = -1;
                            var1 = false;
                            break label2305;
                        }
                        if (field505 == 239) {
                            for (int var224 = 0; var224 < Statics.field1036; var224++) {
                                class42 var225 = class42.method35(var224);
                                if (var225 != null && var225.field1035 == 0) {
                                    class159.field2714[var224] = 0;
                                    class159.field2715[var224] = 0;
                                }
                            }
                            method8();
                            field647 += 32;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 187) {
                            field595.field2042 += 28;
                            if (field595.method2420()) {
                                class82.method721(field595, field595.field2042 - 28);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 180) {
                            int var226 = field595.method2403();
                            int var227 = field595.method2391();
                            class158 var228 = class158.method3027(var227);
                            if (var228.field2616 != var226 || var226 == -1) {
                                var228.field2616 = var226;
                                var228.field2653 = 0;
                                var228.field2631 = 0;
                                method62(var228);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 34) {
                            String var229 = field595.method2408();
                            Object[] var230 = new Object[var229.length() + 1];
                            for (int var231 = var229.length() - 1; var231 >= 0; var231--) {
                                if (var229.charAt(var231) == 's') {
                                    var230[var231 + 1] = field595.method2408();
                                } else {
                                    var230[var231 + 1] = Integer.valueOf(field595.method2405());
                                }
                            }
                            var230[0] = Integer.valueOf(field595.method2405());
                            class1 var232 = new class1();
                            var232.field8 = var230;
                            class26.method1254(var232);
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 242) {
                            int var233 = field595.method2578();
                            if (var233 == 65535) {
                                var233 = -1;
                            }
                            int var234 = field595.method2512();
                            if (var234 == 65535) {
                                var234 = -1;
                            }
                            int var235 = field595.method2419();
                            int var236 = field595.method2419();
                            for (int var237 = var234; var237 <= var233; var237++) {
                                long var238 = ((long) var235 << 32) + (long) var237;
                                class179 var240 = field662.method3255(var238);
                                if (var240 != null) {
                                    var240.method3306();
                                }
                                field662.method3268(new class171(var236), var238);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 255) {
                            int var241 = field595.method2405();
                            int var242 = field595.method2512();
                            if (var241 < -70000) {
                                var242 += 32768;
                            }
                            class158 var243;
                            if (var241 >= 0) {
                                var243 = class158.method3027(var241);
                            } else {
                                var243 = null;
                            }
                            while (field595.field2042 < field504) {
                                int var244 = field595.method2413();
                                int var245 = field595.method2512();
                                int var246 = 0;
                                if (var245 != 0) {
                                    var246 = field595.method2509();
                                    if (var246 == 255) {
                                        var246 = field595.method2405();
                                    }
                                }
                                if (var243 != null && var244 >= 0 && var244 < var243.field2660.length) {
                                    var243.field2660[var244] = var245;
                                    var243.field2698[var244] = var246;
                                }
                                class19.method215(var242, var244, var245 - 1, var246);
                            }
                            if (var243 != null) {
                                method62(var243);
                            }
                            method8();
                            field586[++field649 - 1 & 0x1F] = var242 & 0x7FFF;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 247) {
                            int var247 = field595.method2391();
                            int var248 = field595.method2434();
                            class158 var249 = class158.method3027(var247);
                            if (var249.field2627 != 2 || var249.field2686 != var248) {
                                var249.field2627 = 2;
                                var249.field2686 = var248;
                                method62(var249);
                            }
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 27) {
                            int var250 = field595.method2578();
                            int var251 = field595.method2434();
                            int var252 = field595.method2391();
                            class158 var253 = class158.method3027(var252);
                            var253.field2639 = (var250 << 16) + var251;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        if (field505 == 191) {
                            int var254 = field595.method2509();
                            int var255 = field595.method2509();
                            int var256 = field595.method2509();
                            int var257 = field595.method2509();
                            field709[var254] = true;
                            field631[var254] = var255;
                            field711[var254] = var256;
                            field518[var254] = var257;
                            field659[var254] = 0;
                            field505 = -1;
                            var1 = true;
                            break label2305;
                        }
                        class80.method2305("" + field505 + class2.field22 + field510 + class2.field22 + field511 + class2.field22 + field504, (Throwable) null);
                        method578();
                    } catch (IOException var349) {
                        method3116();
                    } catch (Exception var350) {
                        String var260 = "" + field505 + class2.field22 + field510 + class2.field22 + field511 + class2.field22 + field504 + class2.field22 + (Statics.field751 + Statics.field2319.field451[0]) + class2.field22 + (Statics.field1920 + Statics.field2319.field452[0]) + class2.field22;
                        for (int var261 = 0; var261 < field504 && var261 < 50; var261++) {
                            var260 = var260 + field595.field2035[var261] + class2.field22;
                        }
                        class80.method2305(var260, var350);
                        method578();
                    }
                    var1 = true;
                }
            }
            if (!var1) {
                break;
            }
        }
        if (field470 != 30) {
            return;
        }
        class182.method2634(field501, 243);
        Object var262 = Statics.field1269.field249;
        synchronized (Statics.field1269.field249) {
            if (!field460) {
                Statics.field1269.field246 = 0;
            } else if (class77.field1399 != 0 || Statics.field1269.field246 >= 40) {
                field501.method2265(236);
                field501.method2386(0);
                int var263 = field501.field2042;
                int var264 = 0;
                for (int var265 = 0; var265 < Statics.field1269.field246 && field501.field2042 - var263 < 240; var265++) {
                    var264++;
                    int var266 = Statics.field1269.field248[var265];
                    if (var266 < 0) {
                        var266 = 0;
                    } else if (var266 > 502) {
                        var266 = 502;
                    }
                    int var267 = Statics.field1269.field247[var265];
                    if (var267 < 0) {
                        var267 = 0;
                    } else if (var267 > 764) {
                        var267 = 764;
                    }
                    int var268 = var266 * 765 + var267;
                    if (Statics.field1269.field248[var265] == -1 && Statics.field1269.field247[var265] == -1) {
                        var267 = -1;
                        var266 = -1;
                        var268 = 524287;
                    }
                    if (field706 != var267 || field625 != var266) {
                        int var269 = var267 - field706;
                        field706 = var267;
                        int var270 = var266 - field625;
                        field625 = var266;
                        if (field476 < 8 && var269 >= -32 && var269 <= 31 && var270 >= -32 && var270 <= 31) {
                            var269 += 32;
                            var270 += 32;
                            field501.method2387((field476 << 12) + (var269 << 6) + var270);
                            field476 = 0;
                        } else if (field476 < 8) {
                            field501.method2460((field476 << 19) + 8388608 + var268);
                            field476 = 0;
                        } else {
                            field501.method2389((field476 << 19) + -1073741824 + var268);
                            field476 = 0;
                        }
                    } else if (field476 < 2047) {
                        field476++;
                    }
                }
                field501.method2397(field501.field2042 - var263);
                if (var264 >= Statics.field1269.field246) {
                    Statics.field1269.field246 = 0;
                } else {
                    Statics.field1269.field246 -= var264;
                    for (int var271 = 0; var271 < Statics.field1269.field246; var271++) {
                        Statics.field1269.field247[var271] = Statics.field1269.field247[var264 + var271];
                        Statics.field1269.field248[var271] = Statics.field1269.field248[var264 + var271];
                    }
                }
            }
        }
        if (class77.field1399 != 0) {
            long var273 = (class77.field1402 - field473 * -1L) / 50L;
            if (var273 > 4095L) {
                var273 = 4095L;
            }
            field473 = class77.field1402 * -1L;
            int var275 = class77.field1393;
            if (var275 < 0) {
                var275 = 0;
            } else if (var275 > 502) {
                var275 = 502;
            }
            int var276 = class77.field1400;
            if (var276 < 0) {
                var276 = 0;
            } else if (var276 > 764) {
                var276 = 764;
            }
            int var277 = var275 * 765 + var276;
            byte var278 = 0;
            if (class77.field1399 == 2) {
                var278 = 1;
            }
            int var279 = (int) var273;
            field501.method2265(33);
            field501.method2389((var278 << 19) + (var279 << 20) + var277);
        }
        if (class75.field1367 > 0) {
            field501.method2265(210);
            field501.method2387(0);
            int var280 = field501.field2042;
            long var281 = class121.method1250();
            for (int var283 = 0; var283 < class75.field1367; var283++) {
                long var284 = var281 - field686;
                if (var284 > 16777215L) {
                    var284 = 16777215L;
                }
                field686 = var281;
                field501.method2437((int) var284);
                field501.method2550(class75.field1353[var283]);
            }
            field501.method2396(field501.field2042 - var280);
        }
        if (field626 > 0) {
            field626--;
        }
        if (class75.field1359[96] || class75.field1359[97] || class75.field1359[98] || class75.field1359[99]) {
            field553 = true;
        }
        if (field553 && field626 <= 0) {
            field626 = 20;
            field553 = false;
            field501.method2265(31);
            field501.method2429(field549);
            field501.method2429(field548);
        }
        if (Statics.field1100 && !field498) {
            field498 = true;
            field501.method2265(10);
            field501.method2386(1);
        }
        if (!Statics.field1100 && field498) {
            field498 = false;
            field501.method2265(10);
            field501.method2386(0);
        }
        method729();
        if (field470 != 30) {
            return;
        }
        method1610();
        method1350();
        field506++;
        if (field506 > 750) {
            method3116();
            return;
        }
        method174();
        method1548();
        for (int var286 = -1; var286 < field642; var286++) {
            int var287;
            if (var286 == -1) {
                var287 = 2047;
            } else {
                var287 = field584[var286];
            }
            class3 var288 = field582[var287];
            if (var288 != null && var288.field413 > 0) {
                var288.field413--;
                if (var288.field413 == 0) {
                    var288.field457 = null;
                }
            }
        }
        for (int var289 = 0; var289 < field499; var289++) {
            int var290 = field500[var289];
            class25 var291 = field559[var290];
            if (var291 != null && var291.field413 > 0) {
                var291.field413--;
                if (var291.field413 == 0) {
                    var291.field457 = null;
                }
            }
        }
        field540++;
        if (field572 != 0) {
            field676 += 20;
            if (field676 >= 400) {
                field572 = 0;
            }
        }
        if (Statics.field2027 != null) {
            field570++;
            if (field570 >= 15) {
                method62(Statics.field2027);
                Statics.field2027 = null;
            }
        }
        if (Statics.field294 != null) {
            method62(Statics.field294);
            field725++;
            if (class77.field1405 > field576 + 5 || class77.field1405 < field576 - 5 || class77.field1394 > field577 + 5 || class77.field1394 < field577 - 5) {
                field579 = true;
            }
            if (class77.field1392 == 0) {
                if (field579 && field725 >= 5) {
                    if (Statics.field294 == Statics.field1263 && field674 != field575) {
                        class158 var292 = Statics.field294;
                        byte var293 = 0;
                        if (field670 == 1 && var292.field2599 == 206) {
                            var293 = 1;
                        }
                        if (var292.field2660[field674] <= 0) {
                            var293 = 0;
                        }
                        int var294 = method2685(var292);
                        boolean var295 = (var294 >> 29 & 0x1) != 0;
                        if (var295) {
                            int var296 = field575;
                            int var297 = field674;
                            var292.field2660[var297] = var292.field2660[var296];
                            var292.field2698[var297] = var292.field2698[var296];
                            var292.field2660[var296] = -1;
                            var292.field2698[var296] = 0;
                        } else if (var293 == 1) {
                            int var298 = field575;
                            int var299 = field674;
                            while (var298 != var299) {
                                if (var298 > var299) {
                                    var292.method3104(var298 - 1, var298);
                                    var298--;
                                } else if (var298 < var299) {
                                    var292.method3104(var298 + 1, var298);
                                    var298++;
                                }
                            }
                        } else {
                            var292.method3104(field674, field575);
                        }
                        field501.method2265(170);
                        field501.method2430(field674);
                        field501.method2538(field575);
                        field501.method2453(var293);
                        field501.method2389(Statics.field294.field2595);
                    }
                } else if ((field675 == 1 || method23(field605 - 1)) && field605 > 2) {
                    method2619();
                } else if (field605 > 0) {
                    method1351(field605 - 1);
                }
                field570 = 10;
                class77.field1399 = 0;
                Statics.field294 = null;
            }
        }
        class158 var300 = Statics.field1318;
        class158 var301 = Statics.field120;
        Statics.field1318 = null;
        Statics.field120 = null;
        field660 = null;
        field641 = false;
        field638 = false;
        field683 = 0;
        while (true) {
            class75 var302 = class75.field1351;
            boolean var303;
            synchronized (class75.field1351) {
                if (class75.field1368 == class75.field1363) {
                    var303 = false;
                } else {
                    Statics.field2062 = class75.field1365[class75.field1368];
                    Statics.field1360 = class75.field1364[class75.field1368];
                    class75.field1368 = class75.field1368 + 1 & 0x7F;
                    var303 = true;
                }
            }
            if (!var303 || field683 >= 128) {
                Statics.method1239(field622, 0, 0, 765, 503, 0, 0);
                field600++;
                while (true) {
                    class1 var305;
                    class158 var306;
                    class158 var307;
                    do {
                        var305 = (class1) field508.method3274();
                        if (var305 == null) {
                            while (true) {
                                class1 var308;
                                class158 var309;
                                class158 var310;
                                do {
                                    var308 = (class1) field661.method3274();
                                    if (var308 == null) {
                                        while (true) {
                                            class1 var311;
                                            class158 var312;
                                            class158 var313;
                                            do {
                                                var311 = (class1) field599.method3274();
                                                if (var311 == null) {
                                                    if (field633 != null) {
                                                        method62(field633);
                                                        Statics.field2478++;
                                                        if (field641 && field638) {
                                                            int var314 = class77.field1405;
                                                            int var315 = class77.field1394;
                                                            int var316 = var314 - field635;
                                                            int var317 = var315 - field580;
                                                            if (var316 < field639) {
                                                                var316 = field639;
                                                            }
                                                            if (field633.field2637 + var316 > field639 + field634.field2637) {
                                                                var316 = field639 + field634.field2637 - field633.field2637;
                                                            }
                                                            if (var317 < field603) {
                                                                var317 = field603;
                                                            }
                                                            if (field633.field2605 + var317 > field603 + field634.field2605) {
                                                                var317 = field603 + field634.field2605 - field633.field2605;
                                                            }
                                                            int var318 = var316 - field490;
                                                            int var319 = var317 - field643;
                                                            int var320 = field633.field2646;
                                                            if (Statics.field2478 > field633.field2659 && (var318 > var320 || var318 < -var320 || var319 > var320 || var319 < -var320)) {
                                                                field644 = true;
                                                            }
                                                            int var321 = field634.field2608 + (var316 - field639);
                                                            int var322 = field634.field2691 + (var317 - field603);
                                                            if (field633.field2671 != null && field644) {
                                                                class1 var323 = new class1();
                                                                var323.field2 = field633;
                                                                var323.field3 = var321;
                                                                var323.field4 = var322;
                                                                var323.field8 = field633.field2671;
                                                                class26.method1254(var323);
                                                            }
                                                            if (class77.field1392 == 0) {
                                                                if (field644) {
                                                                    if (field633.field2672 != null) {
                                                                        class1 var324 = new class1();
                                                                        var324.field2 = field633;
                                                                        var324.field3 = var321;
                                                                        var324.field4 = var322;
                                                                        var324.field6 = field660;
                                                                        var324.field8 = field633.field2672;
                                                                        class26.method1254(var324);
                                                                    }
                                                                    if (field660 != null) {
                                                                        class158 var325 = field633;
                                                                        int var326 = class162.method2631(method2685(var325));
                                                                        class158 var327;
                                                                        if (var326 == 0) {
                                                                            var327 = null;
                                                                        } else {
                                                                            int var328 = 0;
                                                                            while (true) {
                                                                                if (var328 >= var326) {
                                                                                    var327 = var325;
                                                                                    break;
                                                                                }
                                                                                var325 = class158.method3027(var325.field2606);
                                                                                if (var325 == null) {
                                                                                    var327 = null;
                                                                                    break;
                                                                                }
                                                                                var328++;
                                                                            }
                                                                        }
                                                                        if (var327 != null) {
                                                                            field501.method2265(245);
                                                                            field501.method2389(field660.field2595);
                                                                            field501.method2389(field633.field2595);
                                                                            field501.method2429(field633.field2596);
                                                                            field501.method2538(field660.field2596);
                                                                        }
                                                                    }
                                                                } else if ((field675 == 1 || method23(field605 - 1)) && field605 > 2) {
                                                                    method2619();
                                                                } else if (field605 > 0) {
                                                                    method1351(field605 - 1);
                                                                }
                                                                field633 = null;
                                                            }
                                                        } else if (Statics.field2478 > 1) {
                                                            field633 = null;
                                                        }
                                                    }
                                                    if (class95.field1583 != -1) {
                                                        int var329 = class95.field1583;
                                                        int var330 = class95.field1566;
                                                        boolean var331 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var329, var330, true, 0, 0, 0, 0, 0, 0);
                                                        class95.field1583 = -1;
                                                        if (var331) {
                                                            field569 = class77.field1400;
                                                            field718 = class77.field1393;
                                                            field572 = 1;
                                                            field676 = 0;
                                                        }
                                                    }
                                                    method3026();
                                                    if (Statics.field1318 != var300) {
                                                        if (var300 != null) {
                                                            method62(var300);
                                                        }
                                                        if (Statics.field1318 != null) {
                                                            method62(Statics.field1318);
                                                        }
                                                    }
                                                    if (Statics.field120 != var301 && field615 == field556) {
                                                        if (var301 != null) {
                                                            method62(var301);
                                                        }
                                                        if (Statics.field120 != null) {
                                                            method62(Statics.field120);
                                                        }
                                                    }
                                                    if (Statics.field120 == null) {
                                                        if (field556 > 0) {
                                                            field556--;
                                                        }
                                                    } else if (field556 < field615) {
                                                        field556++;
                                                        if (field615 == field556) {
                                                            method62(Statics.field120);
                                                        }
                                                    }
                                                    method2311();
                                                    if (field722) {
                                                        method2431();
                                                    }
                                                    for (int var332 = 0; var332 < 5; var332++) {
                                                        int var10002 = field659[var332]++;
                                                    }
                                                    int var333 = ++class77.field1403 - 1;
                                                    int var335 = class75.field1346;
                                                    if (var333 > 15000 && var335 > 15000) {
                                                        field545 = 250;
                                                        class77.field1403 = 14500;
                                                        field501.method2265(130);
                                                    }
                                                    field534++;
                                                    if (field534 > 500) {
                                                        field534 = 0;
                                                        int var337 = (int) (Math.random() * 8.0D);
                                                        if ((var337 & 0x1) == 1) {
                                                            field528 += field546;
                                                        }
                                                        if ((var337 & 0x2) == 2) {
                                                            field530 += field531;
                                                        }
                                                        if ((var337 & 0x4) == 4) {
                                                            field671 += field533;
                                                        }
                                                    }
                                                    if (field528 < -50) {
                                                        field546 = 2;
                                                    }
                                                    if (field528 > 50) {
                                                        field546 = -2;
                                                    }
                                                    if (field530 < -55) {
                                                        field531 = 2;
                                                    }
                                                    if (field530 > 55) {
                                                        field531 = -2;
                                                    }
                                                    if (field671 < -40) {
                                                        field533 = 1;
                                                    }
                                                    if (field671 > 40) {
                                                        field533 = -1;
                                                    }
                                                    field539++;
                                                    if (field539 > 500) {
                                                        field539 = 0;
                                                        int var338 = (int) (Math.random() * 8.0D);
                                                        if ((var338 & 0x1) == 1) {
                                                            field535 += field547;
                                                        }
                                                        if ((var338 & 0x2) == 2) {
                                                            field537 += field538;
                                                        }
                                                    }
                                                    if (field535 < -60) {
                                                        field547 = 2;
                                                    }
                                                    if (field535 > 60) {
                                                        field547 = -2;
                                                    }
                                                    if (field537 < -20) {
                                                        field538 = 1;
                                                    }
                                                    if (field537 > 10) {
                                                        field538 = -1;
                                                    }
                                                    for (class28 var339 = (class28) field717.method3245(); var339 != null; var339 = (class28) field717.method3239()) {
                                                        if ((long) var339.field730 < class121.method1250() / 1000L - 5L) {
                                                            if (var339.field734 > 0) {
                                                                method2003(5, "", var339.field728 + class134.field2216);
                                                            }
                                                            if (var339.field734 == 0) {
                                                                method2003(5, "", var339.field728 + class134.field2217);
                                                            }
                                                            var339.method3302();
                                                        }
                                                    }
                                                    field487++;
                                                    if (field487 > 50) {
                                                        field501.method2265(248);
                                                    }
                                                    try {
                                                        if (Statics.field324 != null && field501.field2042 > 0) {
                                                            Statics.field324.method1361(field501.field2035, 0, field501.field2042);
                                                            field501.field2042 = 0;
                                                            field487 = 0;
                                                        }
                                                    } catch (IOException var341) {
                                                        method3116();
                                                    }
                                                    return;
                                                }
                                                var312 = var311.field2;
                                                if (var312.field2596 < 0) {
                                                    break;
                                                }
                                                var313 = class158.method3027(var312.field2606);
                                            } while (var313 == null || var313.field2703 == null || var312.field2596 >= var313.field2703.length || var313.field2703[var312.field2596] != var312);
                                            class26.method1254(var311);
                                        }
                                    }
                                    var309 = var308.field2;
                                    if (var309.field2596 < 0) {
                                        break;
                                    }
                                    var310 = class158.method3027(var309.field2606);
                                } while (var310 == null || var310.field2703 == null || var309.field2596 >= var310.field2703.length || var310.field2703[var309.field2596] != var309);
                                class26.method1254(var308);
                            }
                        }
                        var306 = var305.field2;
                        if (var306.field2596 < 0) {
                            break;
                        }
                        var307 = class158.method3027(var306.field2606);
                    } while (var307 == null || var307.field2703 == null || var306.field2596 >= var307.field2703.length || var307.field2703[var306.field2596] != var306);
                    class26.method1254(var305);
                }
            }
            field664[field683] = Statics.field2062;
            field684[field683] = Statics.field1360;
            field683++;
        }
    }

    @ObfuscatedName("d.n(I)V")
    public static final void method5() {
        if (Statics.field1268 != null) {
            Statics.field1268.method1135();
        }
        if (Statics.field244 != null) {
            Statics.field244.method1135();
        }
    }

    @ObfuscatedName("be.q(I)V")
    public static final void method1350() {
        for (int var0 = 0; var0 < field514; var0++) {
            int var10002 = field705[var0]--;
            if (field705[var0] >= -10) {
                class57 var2 = field707[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1221(Statics.field1030, field703[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field705[var0] += var2.method1224();
                    field707[var0] = var2;
                }
                if (field705[var0] < 0) {
                    int var9;
                    if (field489[var0] == 0) {
                        var9 = field700;
                    } else {
                        int var3 = (field489[var0] & 0xFF) * 128;
                        int var4 = field489[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2319.field420;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field489[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2319.field400;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field705[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field701 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1223().method1293(Statics.field1379);
                        class45 var11 = class45.method931(var10, 100, var9);
                        var11.method943(field704[var0] - 1);
                        Statics.field205.method1090(var11);
                    }
                    field705[var0] = -100;
                }
            } else {
                field514--;
                for (int var1 = var0; var1 < field514; var1++) {
                    field703[var1] = field703[var1 + 1];
                    field707[var1] = field707[var1 + 1];
                    field704[var1] = field704[var1 + 1];
                    field705[var1] = field705[var1 + 1];
                    field489[var1] = field489[var1 + 1];
                }
                var0--;
            }
        }
        if (field699 && !class138.method1809()) {
            if (field532 != 0 && field698 != -1) {
                class138.method574(Statics.field1512, field698, 0, field532, false);
            }
            field699 = false;
        }
    }

    @ObfuscatedName("d.w(Lar;IIIB)V")
    public static void method4(class34 arg0, int arg1, int arg2, int arg3) {
        if (field514 >= 50 || field701 == 0 || arg0.field874 == null || arg1 >= arg0.field874.length) {
            return;
        }
        int var4 = arg0.field874[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field703[field514] = var5;
        field704[field514] = var6;
        field705[field514] = 0;
        field707[field514] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field489[field514] = (var8 << 16) + (var9 << 8) + var7;
        field514++;
    }

    @ObfuscatedName("dg.o(IIIB)V")
    public static void method2167(int arg0, int arg1, int arg2) {
        if (field700 == 0 || arg1 == 0 || field514 >= 50) {
            return;
        }
        field703[field514] = arg0;
        field704[field514] = arg1;
        field705[field514] = arg2;
        field707[field514] = null;
        field489[field514] = 0;
        field514++;
    }

    @ObfuscatedName("o.j(II)V")
    public static void method212(int arg0) {
        if (arg0 == -1 && !field699) {
            class138.method138();
        } else if (arg0 != -1 && field698 != arg0 && field532 != 0 && !field699) {
            class154 var1 = Statics.field1512;
            int var2 = field532;
            class138.field2340 = 1;
            Statics.field2341 = var1;
            Statics.field2342 = arg0;
            Statics.field2344 = 0;
            Statics.field2012 = var2;
            Statics.field2030 = false;
            Statics.field2038 = 2;
        }
        field698 = arg0;
    }

    @ObfuscatedName("ak.ae(B)V")
    public static final void method729() {
        if (field563 && Statics.field2034 != field513) {
            method217(Statics.field2054, Statics.field2527, Statics.field2034, Statics.field2319.field451[0], Statics.field2319.field452[0]);
        } else if (Statics.field2034 != field689) {
            field689 = Statics.field2034;
            Statics.method2629(Statics.field2034);
        }
    }

    @ObfuscatedName("h.aq(III)V")
    public static final void method150(int arg0, int arg1) {
        if (field696 != 0 && field696 != 3 || class77.field1399 != 1) {
            return;
        }
        int var2 = class77.field1400 - 25 - arg0;
        int var3 = class77.field1393 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field549 + field535 & 0x7FF;
        int var5 = class104.field1776[var4];
        int var6 = class104.field1771[var4];
        int var7 = (field537 + 256) * var5 >> 8;
        int var8 = (field537 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field2319.field420 + var9 >> 7;
        int var12 = Statics.field2319.field400 - var10 >> 7;
        boolean var13 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var11, var12, true, 0, 0, 0, 0, 0, 1);
        if (!var13) {
            return;
        }
        field501.method2386(var2);
        field501.method2386(var3);
        field501.method2387(field549);
        field501.method2386(57);
        field501.method2386(field535);
        field501.method2386(field537);
        field501.method2386(89);
        field501.method2387(Statics.field2319.field420);
        field501.method2387(Statics.field2319.field400);
        field501.method2386(field529);
        field501.method2386(63);
    }

    @ObfuscatedName("do.ap(I)V")
    public static final void method2431() {
        int var0 = Statics.field10 * 128 + 64;
        int var1 = Statics.field1441 * 128 + 64;
        int var2 = method163(var0, var1, Statics.field2034) - Statics.field1305;
        if (Statics.field865 < var0) {
            Statics.field865 += Statics.field795 * (var0 - Statics.field865) / 1000 + Statics.field365;
            if (Statics.field865 > var0) {
                Statics.field865 = var0;
            }
        }
        if (Statics.field865 > var0) {
            Statics.field865 -= Statics.field795 * (Statics.field865 - var0) / 1000 + Statics.field365;
            if (Statics.field865 < var0) {
                Statics.field865 = var0;
            }
        }
        if (Statics.field212 < var2) {
            Statics.field212 += Statics.field795 * (var2 - Statics.field212) / 1000 + Statics.field365;
            if (Statics.field212 > var2) {
                Statics.field212 = var2;
            }
        }
        if (Statics.field212 > var2) {
            Statics.field212 -= Statics.field795 * (Statics.field212 - var2) / 1000 + Statics.field365;
            if (Statics.field212 < var2) {
                Statics.field212 = var2;
            }
        }
        if (Statics.field1507 < var1) {
            Statics.field1507 += Statics.field795 * (var1 - Statics.field1507) / 1000 + Statics.field365;
            if (Statics.field1507 > var1) {
                Statics.field1507 = var1;
            }
        }
        if (Statics.field1507 > var1) {
            Statics.field1507 -= Statics.field795 * (Statics.field1507 - var1) / 1000 + Statics.field365;
            if (Statics.field1507 < var1) {
                Statics.field1507 = var1;
            }
        }
        int var3 = Statics.field1039 * 128 + 64;
        int var4 = Statics.field291 * 128 + 64;
        int var5 = method163(var3, var4, Statics.field2034) - Statics.field2376;
        int var6 = var3 - Statics.field865;
        int var7 = var5 - Statics.field212;
        int var8 = var4 - Statics.field1507;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field83 < var10) {
            Statics.field83 += Statics.field910 * (var10 - Statics.field83) / 1000 + Statics.field2405;
            if (Statics.field83 > var10) {
                Statics.field83 = var10;
            }
        }
        if (Statics.field83 > var10) {
            Statics.field83 -= Statics.field910 * (Statics.field83 - var10) / 1000 + Statics.field2405;
            if (Statics.field83 < var10) {
                Statics.field83 = var10;
            }
        }
        int var12 = var11 - Statics.field708;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field708 += Statics.field910 * var12 / 1000 + Statics.field2405;
            Statics.field708 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field708 -= Statics.field910 * -var12 / 1000 + Statics.field2405;
            Statics.field708 &= 0x7FF;
        }
        int var13 = var11 - Statics.field708;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field708 = var11;
        }
    }

    @ObfuscatedName("dm.ah(I)V")
    public static final void method2311() {
        int var0 = field528 + Statics.field2319.field420;
        int var1 = field530 + Statics.field2319.field400;
        if (Statics.field1174 - var0 < -500 || Statics.field1174 - var0 > 500 || Statics.field869 - var1 < -500 || Statics.field869 - var1 > 500) {
            Statics.field1174 = var0;
            Statics.field869 = var1;
        }
        if (Statics.field1174 != var0) {
            Statics.field1174 += (var0 - Statics.field1174) / 16;
        }
        if (Statics.field869 != var1) {
            Statics.field869 += (var1 - Statics.field869) / 16;
        }
        if (class75.field1359[96]) {
            field697 += (-24 - field697) / 2;
        } else if (class75.field1359[97]) {
            field697 += (24 - field697) / 2;
        } else {
            field697 /= 2;
        }
        if (class75.field1359[98]) {
            field578 += (12 - field578) / 2;
        } else if (class75.field1359[99]) {
            field578 += (-12 - field578) / 2;
        } else {
            field578 /= 2;
        }
        field549 = field697 / 2 + field549 & 0x7FF;
        field548 += field578 / 2;
        if (field548 < 128) {
            field548 = 128;
        }
        if (field548 > 383) {
            field548 = 383;
        }
        int var2 = Statics.field1174 >> 7;
        int var3 = Statics.field869 >> 7;
        int var4 = method163(Statics.field1174, Statics.field869, Statics.field2034);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field2034;
                    if (var8 < 3 && (class9.field142[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = var4 - class9.field130[var8][var6][var7];
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
        if (var10 > field652) {
            field652 += (var10 - field652) / 24;
        } else if (var10 < field652) {
            field652 += (var10 - field652) / 80;
        }
    }

    @ObfuscatedName("i.ax(B)V")
    public static final void method174() {
        for (int var0 = -1; var0 < field642; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field584[var0];
            }
            class3 var2 = field582[var1];
            if (var2 != null) {
                method127(var2, 1);
            }
        }
    }

    @ObfuscatedName("ci.ai(I)V")
    public static final void method1548() {
        for (int var0 = 0; var0 < field499; var0++) {
            int var1 = field500[var0];
            class25 var2 = field559[var1];
            if (var2 != null) {
                method127(var2, var2.field382.field769);
            }
        }
    }

    @ObfuscatedName("b.aa(Lae;IB)V")
    public static final void method127(class27 arg0, int arg1) {
        if (arg0.field442 > field472) {
            int var2 = arg0.field442 - field472;
            int var3 = arg0.field438 * 128 + arg0.field403 * 64;
            int var4 = arg0.field425 * 128 + arg0.field403 * 64;
            arg0.field420 += (var3 - arg0.field420) / var2;
            arg0.field400 += (var4 - arg0.field400) / var2;
            arg0.field399 = 0;
            if (arg0.field444 == 0) {
                arg0.field447 = 1024;
            }
            if (arg0.field444 == 1) {
                arg0.field447 = 1536;
            }
            if (arg0.field444 == 2) {
                arg0.field447 = 0;
            }
            if (arg0.field444 == 3) {
                arg0.field447 = 512;
            }
        } else if (arg0.field450 >= field472) {
            if (field472 == arg0.field450 || arg0.field428 == -1 || arg0.field431 != 0 || arg0.field430 + 1 > class34.method136(arg0.field428).field877[arg0.field445]) {
                int var5 = arg0.field450 - arg0.field442;
                int var6 = field472 - arg0.field442;
                int var7 = arg0.field438 * 128 + arg0.field403 * 64;
                int var8 = arg0.field425 * 128 + arg0.field403 * 64;
                int var9 = arg0.field448 * 128 + arg0.field403 * 64;
                int var10 = arg0.field441 * 128 + arg0.field403 * 64;
                arg0.field420 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field400 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field399 = 0;
            if (arg0.field444 == 0) {
                arg0.field447 = 1024;
            }
            if (arg0.field444 == 1) {
                arg0.field447 = 1536;
            }
            if (arg0.field444 == 2) {
                arg0.field447 = 0;
            }
            if (arg0.field444 == 3) {
                arg0.field447 = 512;
            }
            arg0.field401 = arg0.field447;
        } else {
            arg0.field408 = arg0.field412;
            if (arg0.field427 == 0) {
                arg0.field399 = 0;
            } else {
                label359: {
                    if (arg0.field428 != -1 && arg0.field431 == 0) {
                        class34 var11 = class34.method136(arg0.field428);
                        if (arg0.field454 > 0 && var11.field882 == 0) {
                            arg0.field399++;
                            break label359;
                        }
                        if (arg0.field454 <= 0 && var11.field883 == 0) {
                            arg0.field399++;
                            break label359;
                        }
                    }
                    int var12 = arg0.field420;
                    int var13 = arg0.field400;
                    int var14 = arg0.field451[arg0.field427 - 1] * 128 + arg0.field403 * 64;
                    int var15 = arg0.field452[arg0.field427 - 1] * 128 + arg0.field403 * 64;
                    if (var14 - var12 <= 256 && var14 - var12 >= -256 && var15 - var13 <= 256 && var15 - var13 >= -256) {
                        if (var12 < var14) {
                            if (var13 < var15) {
                                arg0.field447 = 1280;
                            } else if (var13 > var15) {
                                arg0.field447 = 1792;
                            } else {
                                arg0.field447 = 1536;
                            }
                        } else if (var12 > var14) {
                            if (var13 < var15) {
                                arg0.field447 = 768;
                            } else if (var13 > var15) {
                                arg0.field447 = 256;
                            } else {
                                arg0.field447 = 512;
                            }
                        } else if (var13 < var15) {
                            arg0.field447 = 1024;
                        } else if (var13 > var15) {
                            arg0.field447 = 0;
                        }
                        int var16 = arg0.field447 - arg0.field401 & 0x7FF;
                        if (var16 > 1024) {
                            var16 -= 2048;
                        }
                        int var17 = arg0.field426;
                        if (var16 >= -256 && var16 <= 256) {
                            var17 = arg0.field407;
                        } else if (var16 >= 256 && var16 < 768) {
                            var17 = arg0.field406;
                        } else if (var16 >= -768 && var16 <= -256) {
                            var17 = arg0.field409;
                        }
                        if (var17 == -1) {
                            var17 = arg0.field407;
                        }
                        arg0.field408 = var17;
                        int var18 = 4;
                        boolean var19 = true;
                        if (arg0 instanceof class25) {
                            var19 = ((class25) arg0).field382.field793;
                        }
                        if (var19) {
                            if (arg0.field447 != arg0.field401 && arg0.field422 == -1 && arg0.field404 != 0) {
                                var18 = 2;
                            }
                            if (arg0.field427 > 2) {
                                var18 = 6;
                            }
                            if (arg0.field427 > 3) {
                                var18 = 8;
                            }
                            if (arg0.field399 > 0 && arg0.field427 > 1) {
                                var18 = 8;
                                arg0.field399--;
                            }
                        } else {
                            if (arg0.field427 > 1) {
                                var18 = 6;
                            }
                            if (arg0.field427 > 2) {
                                var18 = 8;
                            }
                            if (arg0.field399 > 0 && arg0.field427 > 1) {
                                var18 = 8;
                                arg0.field399--;
                            }
                        }
                        if (arg0.field453[arg0.field427 - 1]) {
                            var18 <<= 0x1;
                        }
                        if (var18 >= 8 && arg0.field408 == arg0.field407 && arg0.field411 != -1) {
                            arg0.field408 = arg0.field411;
                        }
                        if (var12 < var14) {
                            arg0.field420 += var18;
                            if (arg0.field420 > var14) {
                                arg0.field420 = var14;
                            }
                        } else if (var12 > var14) {
                            arg0.field420 -= var18;
                            if (arg0.field420 < var14) {
                                arg0.field420 = var14;
                            }
                        }
                        if (var13 < var15) {
                            arg0.field400 += var18;
                            if (arg0.field400 > var15) {
                                arg0.field400 = var15;
                            }
                        } else if (var13 > var15) {
                            arg0.field400 -= var18;
                            if (arg0.field400 < var15) {
                                arg0.field400 = var15;
                            }
                        }
                        if (arg0.field420 == var14 && arg0.field400 == var15) {
                            arg0.field427--;
                            if (arg0.field454 > 0) {
                                arg0.field454--;
                            }
                        }
                    } else {
                        arg0.field420 = var14;
                        arg0.field400 = var15;
                    }
                }
            }
        }
        if (arg0.field420 < 128 || arg0.field400 < 128 || arg0.field420 >= 13184 || arg0.field400 >= 13184) {
            arg0.field428 = -1;
            arg0.field455 = -1;
            arg0.field442 = 0;
            arg0.field450 = 0;
            arg0.field420 = arg0.field451[0] * 128 + arg0.field403 * 64;
            arg0.field400 = arg0.field452[0] * 128 + arg0.field403 * 64;
            arg0.method234();
        }
        if (Statics.field2319 == arg0 && (arg0.field420 < 1536 || arg0.field400 < 1536 || arg0.field420 >= 11776 || arg0.field400 >= 11776)) {
            arg0.field428 = -1;
            arg0.field455 = -1;
            arg0.field442 = 0;
            arg0.field450 = 0;
            arg0.field420 = arg0.field451[0] * 128 + arg0.field403 * 64;
            arg0.field400 = arg0.field452[0] * 128 + arg0.field403 * 64;
            arg0.method234();
        }
        method2172(arg0);
        arg0.field402 = false;
        if (arg0.field408 != -1) {
            class34 var20 = class34.method136(arg0.field408);
            if (var20 == null || var20.field871 == null) {
                arg0.field408 = -1;
            } else {
                arg0.field439++;
                if (arg0.field440 < var20.field871.length && arg0.field439 > var20.field877[arg0.field440]) {
                    arg0.field439 = 1;
                    arg0.field440++;
                    method4(var20, arg0.field440, arg0.field420, arg0.field400);
                }
                if (arg0.field440 >= var20.field871.length) {
                    arg0.field439 = 0;
                    arg0.field440 = 0;
                    method4(var20, arg0.field440, arg0.field420, arg0.field400);
                }
            }
        }
        if (arg0.field455 != -1 && field472 >= arg0.field436) {
            if (arg0.field429 < 0) {
                arg0.field429 = 0;
            }
            int var21 = class35.method102(arg0.field455).field896;
            if (var21 == -1) {
                arg0.field455 = -1;
            } else {
                class34 var22 = class34.method136(var21);
                if (var22 == null || var22.field871 == null) {
                    arg0.field455 = -1;
                } else {
                    arg0.field435++;
                    if (arg0.field429 < var22.field871.length && arg0.field435 > var22.field877[arg0.field429]) {
                        arg0.field435 = 1;
                        arg0.field429++;
                        method4(var22, arg0.field429, arg0.field420, arg0.field400);
                    }
                    if (arg0.field429 >= var22.field871.length && (arg0.field429 < 0 || arg0.field429 >= var22.field871.length)) {
                        arg0.field455 = -1;
                    }
                }
            }
        }
        if (arg0.field428 != -1 && arg0.field431 <= 1) {
            class34 var23 = class34.method136(arg0.field428);
            if (var23.field882 == 1 && arg0.field454 > 0 && arg0.field442 <= field472 && arg0.field450 < field472) {
                arg0.field431 = 1;
                return;
            }
        }
        if (arg0.field428 != -1 && arg0.field431 == 0) {
            class34 var24 = class34.method136(arg0.field428);
            if (var24 == null || var24.field871 == null) {
                arg0.field428 = -1;
            } else {
                arg0.field430++;
                if (arg0.field445 < var24.field871.length && arg0.field430 > var24.field877[arg0.field445]) {
                    arg0.field430 = 1;
                    arg0.field445++;
                    method4(var24, arg0.field445, arg0.field420, arg0.field400);
                }
                if (arg0.field445 >= var24.field871.length) {
                    arg0.field445 -= var24.field873;
                    arg0.field416++;
                    if (arg0.field416 >= var24.field868) {
                        arg0.field428 = -1;
                    } else if (arg0.field445 >= 0 && arg0.field445 < var24.field871.length) {
                        method4(var24, arg0.field445, arg0.field420, arg0.field400);
                    } else {
                        arg0.field428 = -1;
                    }
                }
                arg0.field402 = var24.field878;
            }
        }
        if (arg0.field431 > 0) {
            arg0.field431--;
        }
    }

    @ObfuscatedName("dv.ar(Lae;I)V")
    public static final void method2172(class27 arg0) {
        if (arg0.field404 == 0) {
            return;
        }
        if (arg0.field422 != -1 && arg0.field422 < 32768) {
            class25 var1 = field559[arg0.field422];
            if (var1 != null) {
                int var2 = arg0.field420 - var1.field420;
                int var3 = arg0.field400 - var1.field400;
                if (var2 != 0 || var3 != 0) {
                    arg0.field447 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field422 >= 32768) {
            int var4 = arg0.field422 - 32768;
            if (field588 == var4) {
                var4 = 2047;
            }
            class3 var5 = field582[var4];
            if (var5 != null) {
                int var6 = arg0.field420 - var5.field420;
                int var7 = arg0.field400 - var5.field400;
                if (var6 != 0 || var7 != 0) {
                    arg0.field447 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field423 != 0 || arg0.field424 != 0) && (arg0.field427 == 0 || arg0.field399 > 0)) {
            int var8 = arg0.field420 - (arg0.field423 * 64 - Statics.field751 * 64 - Statics.field751 * 64);
            int var9 = arg0.field400 - (arg0.field424 * 64 - Statics.field1920 * 64 - Statics.field1920 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field447 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field423 = 0;
            arg0.field424 = 0;
        }
        int var10 = arg0.field447 - arg0.field401 & 0x7FF;
        if (var10 == 0) {
            arg0.field415 = 0;
            return;
        }
        arg0.field415++;
        if (var10 > 1024) {
            arg0.field401 -= arg0.field404;
            boolean var11 = true;
            if (var10 < arg0.field404 || var10 > 2048 - arg0.field404) {
                arg0.field401 = arg0.field447;
                var11 = false;
            }
            if (arg0.field412 == arg0.field408 && (arg0.field415 > 25 || var11)) {
                if (arg0.field405 == -1) {
                    arg0.field408 = arg0.field407;
                } else {
                    arg0.field408 = arg0.field405;
                }
            }
        } else {
            arg0.field401 += arg0.field404;
            boolean var12 = true;
            if (var10 < arg0.field404 || var10 > 2048 - arg0.field404) {
                arg0.field401 = arg0.field447;
                var12 = false;
            }
            if (arg0.field412 == arg0.field408 && (arg0.field415 > 25 || var12)) {
                if (arg0.field443 == -1) {
                    arg0.field408 = arg0.field407;
                } else {
                    arg0.field408 = arg0.field443;
                }
            }
        }
        arg0.field401 &= 0x7FF;
    }

    @ObfuscatedName("r.ak(La;IIB)V")
    public static void method146(class3 arg0, int arg1, int arg2) {
        if (arg0.field428 == arg1 && arg1 != -1) {
            int var3 = class34.method136(arg1).field884;
            if (var3 == 1) {
                arg0.field445 = 0;
                arg0.field430 = 0;
                arg0.field431 = arg2;
                arg0.field416 = 0;
            }
            if (var3 == 2) {
                arg0.field416 = 0;
            }
        } else if (arg1 == -1 || arg0.field428 == -1 || class34.method136(arg1).field875 >= class34.method136(arg0.field428).field875) {
            arg0.field428 = arg1;
            arg0.field445 = 0;
            arg0.field430 = 0;
            arg0.field431 = arg2;
            arg0.field416 = 0;
            arg0.field454 = arg0.field427;
        }
    }

    @ObfuscatedName("bx.al(Ljava/lang/String;ZI)V")
    public static final void method1394(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field180.method3345(arg0, 250);
        int var6 = Statics.field180.method3346(arg0, 250) * 13;
        class89.method1748(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1759(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field180.method3351(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method227(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1272.getGraphics();
                Statics.field1022.method1572(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1272.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field663; var13++) {
            if (field554[var13] + field543[var13] > var9 && field543[var13] < var9 + var11 && field669[var13] + field573[var13] > var10 && field669[var13] < var10 + var12) {
                field666[var13] = true;
            }
        }
    }

    @ObfuscatedName("l.au(ZI)V")
    public static final void method130(boolean arg0) {
        if (Statics.field2319.field420 >> 7 == field694 && Statics.field2319.field400 >> 7 == field695) {
            field694 = 0;
        }
        int var1 = field642;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field2319;
                var4 = 33538048;
            } else {
                var3 = field582[field584[var2]];
                var4 = field584[var2] << 14;
            }
            if (var3 != null && var3.method19()) {
                var3.field56 = false;
                if ((field563 && field642 > 50 || field642 > 200) && !arg0 && var3.field412 == var3.field408) {
                    var3.field56 = true;
                }
                int var5 = var3.field420 >> 7;
                int var6 = var3.field400 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field41 == null || field472 < var3.field46 || field472 >= var3.field47) {
                        if ((var3.field420 & 0x7F) == 64 && (var3.field400 & 0x7F) == 64) {
                            if (field566 == field525[var5][var6]) {
                                continue;
                            }
                            field525[var5][var6] = field566;
                        }
                        var3.field45 = method163(var3.field420, var3.field400, Statics.field2034);
                        Statics.field2456.method1828(Statics.field2034, var3.field420, var3.field400, var3.field45, 60, var3, var3.field401, var4, var3.field402);
                    } else {
                        var3.field56 = false;
                        var3.field45 = method163(var3.field420, var3.field400, Statics.field2034);
                        Statics.field2456.method1948(Statics.field2034, var3.field420, var3.field400, var3.field45, 60, var3, var3.field401, var4, var3.field39, var3.field53, var3.field55, var3.field49);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ba.aj(ZI)V")
    public static final void method1500(boolean arg0) {
        for (int var1 = 0; var1 < field499; var1++) {
            class25 var2 = field559[field500[var1]];
            int var3 = (field500[var1] << 14) + 536870912;
            if (var2 != null && var2.method19() && var2.field382.field784 == arg0 && var2.field382.method586()) {
                int var4 = var2.field420 >> 7;
                int var5 = var2.field400 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field403 == 1 && (var2.field420 & 0x7F) == 64 && (var2.field400 & 0x7F) == 64) {
                        if (field566 == field525[var4][var5]) {
                            continue;
                        }
                        field525[var4][var5] = field566;
                    }
                    if (!var2.field382.field760) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2456.method1828(Statics.field2034, var2.field420, var2.field400, method163(var2.field420 + (var2.field403 * 64 - 64), var2.field400 + (var2.field403 * 64 - 64), Statics.field2034), var2.field403 * 64 - 64 + 60, var2, var2.field401, var3, var2.field402);
                }
            }
        }
    }

    @ObfuscatedName("ch.az(I)I")
    public static final int method2002() {
        if (Statics.field97.field185) {
            return Statics.field2034;
        }
        int var0 = 3;
        if (Statics.field83 < 310) {
            int var1 = Statics.field865 >> 7;
            int var2 = Statics.field1507 >> 7;
            int var3 = Statics.field2319.field420 >> 7;
            int var4 = Statics.field2319.field400 >> 7;
            if ((class9.field142[Statics.field2034][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2034;
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
                    if ((class9.field142[Statics.field2034][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2034;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field142[Statics.field2034][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2034;
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
                    if ((class9.field142[Statics.field2034][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2034;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field142[Statics.field2034][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2034;
                        }
                    }
                }
            }
        }
        if ((class9.field142[Statics.field2034][Statics.field2319.field420 >> 7][Statics.field2319.field400 >> 7] & 0x4) != 0) {
            var0 = Statics.field2034;
        }
        return var0;
    }

    @ObfuscatedName("bc.ac(III)V")
    public static final void method1282(int arg0, int arg1) {
        if (field517 == 2) {
            method607((field483 - Statics.field751 << 7) + field486, (field484 - Statics.field1920 << 7) + field492, field485 * 2);
            if (field567 > -1 && field472 % 20 < 10) {
                Statics.field63[0].method1646(field567 + arg0 - 12, field568 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ay.ay(IIIII)V")
    public static final void method864(int arg0, int arg1, int arg2, int arg3) {
        field555 = 0;
        for (int var4 = -1; var4 < field642 + field499; var4++) {
            class27 var5;
            if (var4 == -1) {
                var5 = Statics.field2319;
            } else if (var4 < field642) {
                var5 = field582[field584[var4]];
            } else {
                var5 = field559[field500[var4 - field642]];
            }
            if (var5 != null && var5.method19()) {
                if (var5 instanceof class25) {
                    class31 var6 = ((class25) var5).field382;
                    if (var6.field789 != null) {
                        var6 = var6.method585();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field642) {
                    class31 var9 = ((class25) var5).field382;
                    if (var9.field789 != null) {
                        var9 = var9.method585();
                    }
                    if (var9.field787 >= 0 && var9.field787 < Statics.field1434.length) {
                        method175(var5, var5.field446 + 15);
                        if (field567 > -1) {
                            Statics.field1434[var9.field787].method1646(field567 + arg0 - 12, field568 + arg1 - 30);
                        }
                    }
                    if (field517 == 1 && field481 == field500[var4 - field642] && field472 % 20 < 10) {
                        method175(var5, var5.field446 + 15);
                        if (field567 > -1) {
                            Statics.field63[0].method1646(field567 + arg0 - 12, field568 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field54 != -1 || var8.field42 != -1) {
                        method175(var5, var5.field446 + 15);
                        if (field567 > -1) {
                            if (var8.field54 != -1) {
                                Statics.field933[var8.field54].method1646(field567 + arg0 - 12, field568 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field42 != -1) {
                                Statics.field1434[var8.field42].method1646(field567 + arg0 - 12, field568 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field517 == 10 && field482 == field584[var4]) {
                        method175(var5, var5.field446 + 15);
                        if (field567 > -1) {
                            Statics.field63[1].method1646(field567 + arg0 - 12, field568 + arg1 - var7);
                        }
                    }
                }
                if (var5.field457 != null && (var4 >= field642 || field679 == 0 || field679 == 3 || field679 == 1 && method2163(((class3) var5).field52))) {
                    method175(var5, var5.field446);
                    if (field567 > -1 && field555 < field466) {
                        field560[field555] = Statics.field144.method3343(var5.field457) / 2;
                        field682[field555] = Statics.field144.field2839;
                        field612[field555] = field567;
                        field558[field555] = field568;
                        field561[field555] = var5.field414;
                        field668[field555] = var5.field449;
                        field608[field555] = var5.field413;
                        field564[field555] = var5.field457;
                        field555++;
                    }
                }
                if (var5.field419 > field472) {
                    method175(var5, var5.field446 + 15);
                    if (field567 > -1) {
                        int var10 = var5.field432 * 30 / var5.field421;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class89.method1748(field567 + arg0 - 15, field568 + arg1 - 3, var10, 5, 65280);
                        class89.method1748(field567 + arg0 - 15 + var10, field568 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field418[var11] > field472) {
                        method175(var5, var5.field446 / 2);
                        if (field567 > -1) {
                            if (var11 == 1) {
                                field568 -= 20;
                            }
                            if (var11 == 2) {
                                field567 -= 15;
                                field568 -= 10;
                            }
                            if (var11 == 3) {
                                field567 += 15;
                                field568 -= 10;
                            }
                            Statics.field1[var5.field417[var11]].method1646(field567 + arg0 - 12, field568 + arg1 - 12);
                            Statics.field1662.method3365(Integer.toString(var5.field434[var11]), field567 + arg0 - 1, field568 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field555; var12++) {
            int var13 = field612[var12];
            int var14 = field558[var12];
            int var15 = field560[var12];
            int var16 = field682[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field558[var18] - field682[var18] && var14 - var16 < field558[var18] + 2 && var13 - var15 < field612[var18] + field560[var18] && var13 + var15 > field612[var18] - field560[var18] && field558[var18] - field682[var18] < var14) {
                        var14 = field558[var18] - field682[var18];
                        var17 = true;
                    }
                }
            }
            field567 = field612[var12];
            field568 = field558[var12] = var14;
            String var19 = field564[var12];
            if (field710 == 0) {
                int var20 = 16776960;
                if (field561[var12] < 6) {
                    var20 = field678[field561[var12]];
                }
                if (field561[var12] == 6) {
                    var20 = field566 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field561[var12] == 7) {
                    var20 = field566 % 20 < 10 ? 255 : 65535;
                }
                if (field561[var12] == 8) {
                    var20 = field566 % 20 < 10 ? 45056 : 8454016;
                }
                if (field561[var12] == 9) {
                    int var21 = 150 - field608[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field561[var12] == 10) {
                    int var22 = 150 - field608[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field561[var12] == 11) {
                    int var23 = 150 - field608[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field668[var12] == 0) {
                    Statics.field144.method3365(var19, field567 + arg0, field568 + arg1, var20, 0);
                }
                if (field668[var12] == 1) {
                    Statics.field144.method3352(var19, field567 + arg0, field568 + arg1, var20, 0, field566);
                }
                if (field668[var12] == 2) {
                    Statics.field144.method3353(var19, field567 + arg0, field568 + arg1, var20, 0, field566);
                }
                if (field668[var12] == 3) {
                    Statics.field144.method3354(var19, field567 + arg0, field568 + arg1, var20, 0, field566, 150 - field608[var12]);
                }
                if (field668[var12] == 4) {
                    int var24 = (150 - field608[var12]) * (Statics.field144.method3343(var19) + 100) / 150;
                    class89.method1790(field567 + arg0 - 50, arg1, field567 + arg0 + 50, arg1 + arg3);
                    Statics.field144.method3348(var19, field567 + arg0 + 50 - var24, field568 + arg1, var20, 0);
                    class89.method1741(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field668[var12] == 5) {
                    int var25 = 150 - field608[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class89.method1790(arg0, field568 + arg1 - Statics.field144.field2839 - 1, arg0 + arg2, field568 + arg1 + 5);
                    Statics.field144.method3365(var19, field567 + arg0, field568 + arg1 + var26, var20, 0);
                    class89.method1741(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field144.method3365(var19, field567 + arg0, field568 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("bd.as(IIIIB)V")
    public static final void method1352(int arg0, int arg1, int arg2, int arg3) {
        if (field572 == 1) {
            Statics.field1831[field676 / 100].method1646(field569 - 8, field718 - 8);
        }
        if (field572 == 2) {
            Statics.field1831[field676 / 100 + 4].method1646(field569 - 8, field718 - 8);
        }
        field581 = 0;
        int var4 = (Statics.field2319.field420 >> 7) + Statics.field751;
        int var5 = (Statics.field2319.field400 >> 7) + Statics.field1920;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field581 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field581 = 1;
        }
        if (field581 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field581 = 0;
        }
        if (!field478) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field180.method3379("Fps:" + field1317, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field563) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field563) {
            var10 = 16711680;
        }
        Statics.field180.method3379("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("i.af(Lae;II)V")
    public static final void method175(class27 arg0, int arg1) {
        method607(arg0.field420, arg0.field400, arg1);
    }

    @ObfuscatedName("ax.an(IIIB)V")
    public static final void method607(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field567 = -1;
            field568 = -1;
            return;
        }
        int var3 = method163(arg0, arg1, Statics.field2034) - arg2;
        int var4 = arg0 - Statics.field865;
        int var5 = var3 - Statics.field212;
        int var6 = arg1 - Statics.field1507;
        int var7 = class104.field1776[Statics.field83];
        int var8 = class104.field1771[Statics.field83];
        int var9 = class104.field1776[Statics.field708];
        int var10 = class104.field1771[Statics.field708];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field567 = (var11 << 9) / var15 + 256;
            field568 = (var14 << 9) / var15 + 167;
        } else {
            field567 = -1;
            field568 = -1;
        }
    }

    @ObfuscatedName("u.am(IIII)I")
    public static final int method163(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field142[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field130[var5][var3][var4] + class9.field130[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field130[var5][var3][var4 + 1] + class9.field130[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("bb.av(IIIIIII)V")
    public static final void method1455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1776[var6];
            int var12 = class104.field1771[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1776[var7];
            int var15 = class104.field1771[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field865 = arg0 - var8;
        Statics.field212 = arg1 - var9;
        Statics.field1507 = arg2 - var10;
        Statics.field83 = arg3;
        Statics.field708 = arg4;
    }

    @ObfuscatedName("aq.aw(ZB)V")
    public static final void method526(boolean arg0) {
        field520 = arg0;
        if (!field520) {
            int var1 = field595.method2434();
            int var2 = field595.method2578();
            int var3 = field595.method2434();
            int var4 = (field504 - field595.field2042) / 16;
            Statics.field1996 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field1996[var5][var6] = field595.method2391();
                }
            }
            int var7 = field595.method2568();
            int var8 = field595.method2578();
            Statics.field1444 = new int[var4];
            Statics.field154 = new int[var4];
            Statics.field964 = new int[var4];
            Statics.field917 = new byte[var4][];
            Statics.field732 = new byte[var4][];
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var3 - 6) / 8; var11 <= (var3 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1444[var10] = var13;
                        Statics.field154[var10] = Statics.field1201.method2948("m" + var11 + "_" + var12);
                        Statics.field964[var10] = Statics.field1201.method2948("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method217(var3, var2, var7, var1, var8);
            return;
        }
        int var14 = field595.method2410();
        int var15 = field595.method2578();
        int var16 = field595.method2434();
        int var17 = field595.method2432();
        field595.method2268();
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = field595.method2274(1);
                    if (var21 == 1) {
                        field651[var18][var19][var20] = field595.method2274(26);
                    } else {
                        field651[var18][var19][var20] = -1;
                    }
                }
            }
        }
        field595.method2276();
        int var22 = (field504 - field595.field2042) / 16;
        Statics.field1996 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                Statics.field1996[var23][var24] = field595.method2391();
            }
        }
        int var25 = field595.method2432();
        Statics.field1444 = new int[var22];
        Statics.field154 = new int[var22];
        Statics.field964 = new int[var22];
        Statics.field917 = new byte[var22][];
        Statics.field732 = new byte[var22][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field651[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1444[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1444[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field154[var26] = Statics.field1201.method2948("m" + var35 + "_" + var36);
                            Statics.field964[var26] = Statics.field1201.method2948("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method217(var25, var17, var14, var15, var16);
    }

    @ObfuscatedName("o.ao(IIIIII)V")
    public static final void method217(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field2054 == arg0 && Statics.field2527 == arg1 && field513 == arg2 || !field563) {
            return;
        }
        Statics.field2054 = arg0;
        Statics.field2527 = arg1;
        field513 = arg2;
        if (!field563) {
            field513 = 0;
        }
        method2633(25);
        method1394(class134.field2085, true);
        int var5 = Statics.field751;
        int var6 = Statics.field1920;
        Statics.field751 = (arg0 - 6) * 8;
        Statics.field1920 = (arg1 - 6) * 8;
        int var7 = Statics.field751 - var5;
        int var8 = Statics.field1920 - var6;
        int var9 = Statics.field751;
        int var10 = Statics.field1920;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field559[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field451[var13] -= var7;
                    var12.field452[var13] -= var8;
                }
                var12.field420 -= var7 * 128;
                var12.field400 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field582[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field451[var16] -= var7;
                    var15.field452[var16] -= var8;
                }
                var15.field420 -= var7 * 128;
                var15.field400 -= var8 * 128;
            }
        }
        Statics.field2034 = arg2;
        Statics.field2319.method231(arg3, arg4, false);
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
        for (class22 var28 = (class22) field597.method3278(); var28 != null; var28 = (class22) field597.method3280()) {
            var28.field341 -= var7;
            var28.field342 -= var8;
            if (var28.field341 < 0 || var28.field342 < 0 || var28.field341 >= 104 || var28.field342 >= 104) {
                var28.method3306();
            }
        }
        if (field694 != 0) {
            field694 -= var7;
            field695 -= var8;
        }
        field514 = 0;
        field722 = false;
        field689 = -1;
        field614.method3279();
        field507.method3279();
    }

    @ObfuscatedName("aq.at(ZI)V")
    public static final void method527(boolean arg0) {
        method5();
        field487++;
        if (field487 < 50 && !arg0) {
            return;
        }
        field487 = 0;
        if (field512 || Statics.field324 == null) {
            return;
        }
        field501.method2265(248);
        try {
            Statics.field324.method1361(field501.field2035, 0, field501.field2042);
            field501.field2042 = 0;
        } catch (IOException var2) {
            field512 = true;
        }
    }

    @ObfuscatedName("i.ag(IIIIII)V")
    public static final void method171(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2456.method1878(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2456.method1946(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1026.field1463;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method204(var12);
            if (var13.field829 == -1) {
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
                class87 var14 = Statics.field1435[var13.field829];
                if (var14 != null) {
                    int var15 = (var13.field818 * 4 - var14.field1470) / 2;
                    int var16 = (var13.field816 * 4 - var14.field1473) / 2;
                    var14.method1734(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field816) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2456.method1845(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2456.method1946(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method204(var21);
            if (var22.field829 != -1) {
                class87 var23 = Statics.field1435[var22.field829];
                if (var23 != null) {
                    int var24 = (var22.field818 * 4 - var23.field1470) / 2;
                    int var25 = (var22.field816 * 4 - var23.field1473) / 2;
                    var23.method1734(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field816) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1026.field1463;
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
        int var29 = Statics.field2456.method1850(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method204(var30);
        if (var31.field829 == -1) {
            return;
        }
        class87 var32 = Statics.field1435[var31.field829];
        if (var32 != null) {
            int var33 = (var31.field818 * 4 - var32.field1470) / 2;
            int var34 = (var31.field816 * 4 - var32.field1473) / 2;
            var32.method1734(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field816) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("t.ab(IIIB)Z")
    public static final boolean method36(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field2456.method1946(Statics.field2034, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method204(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field818;
                var9 = var7.field816;
            } else {
                var8 = var7.field816;
                var9 = var7.field818;
            }
            int var10 = var7.field804;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method778(Statics.field2319.field451[0], Statics.field2319.field452[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method778(Statics.field2319.field451[0], Statics.field2319.field452[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field569 = class77.field1400;
        field718 = class77.field1393;
        field572 = 2;
        field676 = 0;
        return true;
    }

    @ObfuscatedName("au.bw(IIIIZIIIIIII)Z")
    public static final boolean method778(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field524[var11][var12] = 0;
                field658[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field524[arg0][arg1] = 99;
        field658[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field526[var15] = arg0;
        int var36 = var15 + 1;
        field465[var15] = arg1;
        boolean var17 = false;
        int var18 = field526.length;
        int[][] var19 = field477[Statics.field2034].field2762;
        while (var36 != var16) {
            var13 = field526[var16];
            var14 = field465[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field477[Statics.field2034].method3172(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field477[Statics.field2034].method3163(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field477[Statics.field2034].method3167(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field658[var13][var14] + 1;
            if (var13 > 0 && field524[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field526[var36] = var13 - 1;
                field465[var36] = var14;
                var36 = (var36 + 1) % var18;
                field524[var13 - 1][var14] = 2;
                field658[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field524[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field526[var36] = var13 + 1;
                field465[var36] = var14;
                var36 = (var36 + 1) % var18;
                field524[var13 + 1][var14] = 8;
                field658[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field524[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field526[var36] = var13;
                field465[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field524[var13][var14 - 1] = 1;
                field658[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field524[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field526[var36] = var13;
                field465[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field524[var13][var14 + 1] = 4;
                field658[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field524[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field526[var36] = var13 - 1;
                field465[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field524[var13 - 1][var14 - 1] = 3;
                field658[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field524[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field526[var36] = var13 + 1;
                field465[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field524[var13 + 1][var14 - 1] = 9;
                field658[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field524[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field526[var36] = var13 - 1;
                field465[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field524[var13 - 1][var14 + 1] = 6;
                field658[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field524[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field526[var36] = var13 + 1;
                field465[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field524[var13 + 1][var14 + 1] = 12;
                field658[var13 + 1][var14 + 1] = var20;
            }
        }
        field529 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field658[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field658[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field658[var24][var25];
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
            field529 = 1;
        }
        byte var29 = 0;
        field526[var29] = var13;
        int var37 = var29 + 1;
        field465[var29] = var14;
        int var30;
        int var31 = var30 = field524[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field526[var37] = var13;
                field465[var37++] = var14;
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
            int var33 = field526[var37];
            int var34 = field465[var37];
            if (arg10 == 0) {
                field501.method2265(34);
                field501.method2386(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field501.method2265(193);
                field501.method2386(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field501.method2265(224);
                field501.method2386(var32 + var32 + 3);
            }
            field694 = field526[0];
            field695 = field465[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field501.method2453(field526[var37] - var33);
                field501.method2550(field465[var37] - var34);
            }
            field501.method2538(Statics.field751 + var33);
            field501.method2430(Statics.field1920 + var34);
            field501.method2550(class75.field1359[82] ? 1 : 0);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("be.bz(I)V")
    public static final void method1349() {
        if (field505 == 33) {
            int var0 = field595.method2509();
            int var1 = (var0 >> 4 & 0x7) + Statics.field59;
            int var2 = (var0 & 0x7) + Statics.field1273;
            int var3 = field595.method2512();
            int var4 = field595.method2509();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field595.method2509();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field2319.field451[0] >= var1 - var8 && Statics.field2319.field451[0] <= var1 + var8 && Statics.field2319.field452[0] >= var2 - var8 && Statics.field2319.field452[0] <= var2 + var8 && field701 != 0 && var6 > 0 && field514 < 50) {
                    field703[field514] = var3;
                    field704[field514] = var6;
                    field705[field514] = var7;
                    field707[field514] = null;
                    field489[field514] = (var1 << 16) + (var2 << 8) + var5;
                    field514++;
                }
            }
        }
        if (field505 == 119) {
            int var9 = field595.method2509();
            int var10 = (var9 >> 4 & 0x7) + Statics.field59;
            int var11 = (var9 & 0x7) + Statics.field1273;
            int var12 = field595.method2432();
            int var13 = field595.method2578();
            int var14 = field595.method2512();
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104 && field588 != var14) {
                class17 var15 = new class17();
                var15.field256 = var12;
                var15.field255 = var13;
                if (field596[Statics.field2034][var10][var11] == null) {
                    field596[Statics.field2034][var10][var11] = new class177();
                }
                field596[Statics.field2034][var10][var11].method3273(var15);
                method2584(var10, var11);
            }
        } else if (field505 == 64) {
            int var16 = field595.method2410();
            int var17 = var16 >> 2;
            int var18 = var16 & 0x3;
            int var19 = field522[var17];
            int var20 = field595.method2578();
            int var21 = field595.method2425();
            int var22 = (var21 >> 4 & 0x7) + Statics.field59;
            int var23 = (var21 & 0x7) + Statics.field1273;
            if (var22 >= 0 && var23 >= 0 && var22 < 103 && var23 < 103) {
                if (var19 == 0) {
                    class96 var24 = Statics.field2456.method1822(Statics.field2034, var22, var23);
                    if (var24 != null) {
                        int var25 = var24.field1616 >> 14 & 0x7FFF;
                        if (var17 == 2) {
                            var24.field1614 = new class14(var25, 2, var18 + 4, Statics.field2034, var22, var23, var20, false, var24.field1614);
                            var24.field1615 = new class14(var25, 2, var18 + 1 & 0x3, Statics.field2034, var22, var23, var20, false, var24.field1615);
                        } else {
                            var24.field1614 = new class14(var25, var17, var18, Statics.field2034, var22, var23, var20, false, var24.field1614);
                        }
                    }
                }
                if (var19 == 1) {
                    class108 var26 = Statics.field2456.method1897(Statics.field2034, var22, var23);
                    if (var26 != null) {
                        int var27 = var26.field1805 >> 14 & 0x7FFF;
                        if (var17 == 4 || var17 == 5) {
                            var26.field1803 = new class14(var27, 4, var18, Statics.field2034, var22, var23, var20, false, var26.field1803);
                        } else if (var17 == 6) {
                            var26.field1803 = new class14(var27, 4, var18 + 4, Statics.field2034, var22, var23, var20, false, var26.field1803);
                        } else if (var17 == 7) {
                            var26.field1803 = new class14(var27, 4, (var18 + 2 & 0x3) + 4, Statics.field2034, var22, var23, var20, false, var26.field1803);
                        } else if (var17 == 8) {
                            var26.field1803 = new class14(var27, 4, var18 + 4, Statics.field2034, var22, var23, var20, false, var26.field1803);
                            var26.field1804 = new class14(var27, 4, (var18 + 2 & 0x3) + 4, Statics.field2034, var22, var23, var20, false, var26.field1804);
                        }
                    }
                }
                if (var19 == 2) {
                    class98 var28 = Statics.field2456.method1841(Statics.field2034, var22, var23);
                    if (var17 == 11) {
                        var17 = 10;
                    }
                    if (var28 != null) {
                        var28.field1635 = new class14(var28.field1643 >> 14 & 0x7FFF, var17, var18, Statics.field2034, var22, var23, var20, false, var28.field1635);
                    }
                }
                if (var19 == 3) {
                    class107 var29 = Statics.field2456.method1842(Statics.field2034, var22, var23);
                    if (var29 != null) {
                        var29.field1786 = new class14(var29.field1790 >> 14 & 0x7FFF, 22, var18, Statics.field2034, var22, var23, var20, false, var29.field1786);
                    }
                }
            }
        } else if (field505 == 207) {
            int var30 = field595.method2509();
            int var31 = (var30 >> 4 & 0x7) + Statics.field59;
            int var32 = (var30 & 0x7) + Statics.field1273;
            int var33 = var31 + field595.method2500();
            int var34 = var32 + field595.method2500();
            int var35 = field595.method2403();
            int var36 = field595.method2512();
            int var37 = field595.method2509() * 4;
            int var38 = field595.method2509() * 4;
            int var39 = field595.method2512();
            int var40 = field595.method2512();
            int var41 = field595.method2509();
            int var42 = field595.method2509();
            if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104 && var33 >= 0 && var34 >= 0 && var33 < 104 && var34 < 104 && var36 != 65535) {
                int var43 = var31 * 128 + 64;
                int var44 = var32 * 128 + 64;
                int var45 = var33 * 128 + 64;
                int var46 = var34 * 128 + 64;
                class10 var47 = new class10(var36, Statics.field2034, var43, var44, method163(var43, var44, Statics.field2034) - var37, field472 + var39, field472 + var40, var41, var42, var35, var38);
                var47.method104(var45, var46, method163(var45, var46, Statics.field2034) - var38, field472 + var39);
                field507.method3273(var47);
            }
        } else {
            if (field505 == 75) {
                byte var48 = field595.method2427();
                int var49 = field595.method2512();
                byte var50 = field595.method2428();
                byte var51 = field595.method2426();
                int var52 = field595.method2578();
                int var53 = field595.method2512();
                int var54 = field595.method2568();
                int var55 = var54 >> 2;
                int var56 = var54 & 0x3;
                int var57 = field522[var55];
                int var58 = field595.method2578();
                int var59 = field595.method2425();
                int var60 = (var59 >> 4 & 0x7) + Statics.field59;
                int var61 = (var59 & 0x7) + Statics.field1273;
                byte var62 = field595.method2500();
                class3 var63;
                if (field588 == var52) {
                    var63 = Statics.field2319;
                } else {
                    var63 = field582[var52];
                }
                if (var63 != null) {
                    class32 var64 = class32.method204(var58);
                    int var65;
                    int var66;
                    if (var56 == 1 || var56 == 3) {
                        var65 = var64.field816;
                        var66 = var64.field818;
                    } else {
                        var65 = var64.field818;
                        var66 = var64.field816;
                    }
                    int var67 = (var65 >> 1) + var60;
                    int var68 = (var65 + 1 >> 1) + var60;
                    int var69 = (var66 >> 1) + var61;
                    int var70 = (var66 + 1 >> 1) + var61;
                    int[][] var71 = class9.field130[Statics.field2034];
                    int var72 = var71[var67][var69] + var71[var68][var69] + var71[var67][var70] + var71[var68][var70] >> 2;
                    int var73 = (var60 << 7) + (var65 << 6);
                    int var74 = (var61 << 7) + (var66 << 6);
                    class112 var75 = var64.method615(var55, var56, var71, var73, var72, var74);
                    if (var75 != null) {
                        Statics.method2085(Statics.field2034, var60, var61, var57, -1, 0, 0, var53 + 1, var49 + 1);
                        var63.field46 = field472 + var53;
                        var63.field47 = field472 + var49;
                        var63.field41 = var75;
                        var63.field48 = var60 * 128 + var65 * 64;
                        var63.field50 = var61 * 128 + var66 * 64;
                        var63.field51 = var72;
                        if (var51 > var62) {
                            byte var76 = var51;
                            var51 = var62;
                            var62 = var76;
                        }
                        if (var48 > var50) {
                            byte var77 = var48;
                            var48 = var50;
                            var50 = var77;
                        }
                        var63.field39 = var51 + var60;
                        var63.field55 = var60 + var62;
                        var63.field53 = var48 + var61;
                        var63.field49 = var50 + var61;
                    }
                }
            }
            if (field505 == 94) {
                int var78 = field595.method2425();
                int var79 = var78 >> 2;
                int var80 = var78 & 0x3;
                int var81 = field522[var79];
                int var82 = field595.method2509();
                int var83 = (var82 >> 4 & 0x7) + Statics.field59;
                int var84 = (var82 & 0x7) + Statics.field1273;
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    Statics.method2085(Statics.field2034, var83, var84, var81, -1, var79, var80, 0, -1);
                }
            } else if (field505 == 179) {
                int var85 = field595.method2509();
                int var86 = var85 >> 2;
                int var87 = var85 & 0x3;
                int var88 = field522[var86];
                int var89 = field595.method2509();
                int var90 = (var89 >> 4 & 0x7) + Statics.field59;
                int var91 = (var89 & 0x7) + Statics.field1273;
                int var92 = field595.method2432();
                if (var90 >= 0 && var91 >= 0 && var90 < 104 && var91 < 104) {
                    Statics.method2085(Statics.field2034, var90, var91, var88, var92, var86, var87, 0, -1);
                }
            } else if (field505 == 142) {
                int var93 = field595.method2578();
                int var94 = field595.method2568();
                int var95 = (var94 >> 4 & 0x7) + Statics.field59;
                int var96 = (var94 & 0x7) + Statics.field1273;
                if (var95 >= 0 && var96 >= 0 && var95 < 104 && var96 < 104) {
                    class177 var97 = field596[Statics.field2034][var95][var96];
                    if (var97 != null) {
                        for (class17 var98 = (class17) var97.method3278(); var98 != null; var98 = (class17) var97.method3280()) {
                            if ((var93 & 0x7FFF) == var98.field256) {
                                var98.method3306();
                                break;
                            }
                        }
                        if (var97.method3278() == null) {
                            field596[Statics.field2034][var95][var96] = null;
                        }
                        method2584(var95, var96);
                    }
                }
            } else if (field505 == 8) {
                int var99 = field595.method2509();
                int var100 = (var99 >> 4 & 0x7) + Statics.field59;
                int var101 = (var99 & 0x7) + Statics.field1273;
                int var102 = field595.method2512();
                int var103 = field595.method2509();
                int var104 = field595.method2512();
                if (var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104) {
                    int var105 = var100 * 128 + 64;
                    int var106 = var101 * 128 + 64;
                    class20 var107 = new class20(var102, Statics.field2034, var105, var106, method163(var105, var106, Statics.field2034) - var103, var104, field472);
                    field614.method3273(var107);
                }
            } else if (field505 == 63) {
                int var108 = field595.method2432();
                int var109 = field595.method2578();
                int var110 = field595.method2509();
                int var111 = (var110 >> 4 & 0x7) + Statics.field59;
                int var112 = (var110 & 0x7) + Statics.field1273;
                if (var111 >= 0 && var112 >= 0 && var111 < 104 && var112 < 104) {
                    class17 var113 = new class17();
                    var113.field256 = var109;
                    var113.field255 = var108;
                    if (field596[Statics.field2034][var111][var112] == null) {
                        field596[Statics.field2034][var111][var112] = new class177();
                    }
                    field596[Statics.field2034][var111][var112].method3273(var113);
                    method2584(var111, var112);
                }
            } else if (field505 == 108) {
                int var114 = field595.method2509();
                int var115 = (var114 >> 4 & 0x7) + Statics.field59;
                int var116 = (var114 & 0x7) + Statics.field1273;
                int var117 = field595.method2512();
                int var118 = field595.method2512();
                int var119 = field595.method2512();
                if (var115 >= 0 && var116 >= 0 && var115 < 104 && var116 < 104) {
                    class177 var120 = field596[Statics.field2034][var115][var116];
                    if (var120 != null) {
                        for (class17 var121 = (class17) var120.method3278(); var121 != null; var121 = (class17) var120.method3280()) {
                            if ((var117 & 0x7FFF) == var121.field256 && var121.field255 == var118) {
                                var121.field255 = var119;
                                break;
                            }
                        }
                        method2584(var115, var116);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ej.bq(Ln;I)V")
    public static final void method2978(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field340 == 0) {
            var1 = Statics.field2456.method1878(arg0.field353, arg0.field341, arg0.field342);
        }
        if (arg0.field340 == 1) {
            var1 = Statics.field2456.method1915(arg0.field353, arg0.field341, arg0.field342);
        }
        if (arg0.field340 == 2) {
            var1 = Statics.field2456.method1845(arg0.field353, arg0.field341, arg0.field342);
        }
        if (arg0.field340 == 3) {
            var1 = Statics.field2456.method1850(arg0.field353, arg0.field341, arg0.field342);
        }
        if (var1 != 0) {
            int var5 = Statics.field2456.method1946(arg0.field353, arg0.field341, arg0.field342, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field349 = var2;
        arg0.field345 = var3;
        arg0.field344 = var4;
    }

    @ObfuscatedName("cs.bh(I)V")
    public static final void method1610() {
        for (class22 var0 = (class22) field597.method3278(); var0 != null; var0 = (class22) field597.method3280()) {
            if (var0.field350 > 0) {
                var0.field350--;
            }
            if (var0.field350 != 0) {
                if (var0.field339 > 0) {
                    var0.field339--;
                }
                if (var0.field339 == 0 && var0.field341 >= 1 && var0.field342 >= 1 && var0.field341 <= 102 && var0.field342 <= 102 && (var0.field346 < 0 || class9.method219(var0.field346, var0.field352))) {
                    method3011(var0.field353, var0.field340, var0.field341, var0.field342, var0.field346, var0.field347, var0.field352);
                    var0.field339 = -1;
                    if (var0.field349 == var0.field346 && var0.field349 == -1) {
                        var0.method3306();
                    } else if (var0.field349 == var0.field346 && var0.field347 == var0.field344 && var0.field352 == var0.field345) {
                        var0.method3306();
                    }
                }
            } else if (var0.field349 < 0 || class9.method219(var0.field349, var0.field345)) {
                method3011(var0.field353, var0.field340, var0.field341, var0.field342, var0.field349, var0.field344, var0.field345);
                var0.method3306();
            }
        }
    }

    @ObfuscatedName("ej.bi(IIIIIIII)V")
    public static final void method3011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field563 && Statics.field2034 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2456.method1878(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2456.method1915(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2456.method1845(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2456.method1850(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2456.method1946(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2456.method1834(arg0, arg2, arg3);
                class32 var15 = class32.method204(var12);
                if (var15.field850 != 0) {
                    field477[arg0].method3169(arg2, arg3, var13, var14, var15.field805);
                }
            }
            if (arg1 == 1) {
                Statics.field2456.method1835(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2456.method1979(arg0, arg2, arg3);
                class32 var16 = class32.method204(var12);
                if (var16.field818 + arg2 > 103 || var16.field818 + arg3 > 103 || var16.field816 + arg2 > 103 || var16.field816 + arg3 > 103) {
                    return;
                }
                if (var16.field850 != 0) {
                    field477[arg0].method3170(arg2, arg3, var16.field818, var16.field816, var14, var16.field805);
                }
            }
            if (arg1 == 3) {
                Statics.field2456.method1837(arg0, arg2, arg3);
                class32 var17 = class32.method204(var12);
                if (var17.field850 == 1) {
                    field477[arg0].method3197(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field142[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class95 var19 = Statics.field2456;
        class164 var20 = field477[arg0];
        class32 var21 = class32.method204(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field816;
            var23 = var21.field818;
        } else {
            var22 = var21.field818;
            var23 = var21.field816;
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
        int[][] var28 = class9.field130[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field819 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field807 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class94 var34;
            if (var21.field808 == -1 && var21.field801 == null) {
                var34 = var21.method615(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class14(arg4, 22, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1893(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field850 == 1) {
                var20.method3188(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class94 var57;
            if (var21.field808 == -1 && var21.field801 == null) {
                var57 = var21.method615(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class14(arg4, 10, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            if (var57 != null) {
                var19.method1827(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field850 != 0) {
                var20.method3174(arg2, arg3, var22, var23, var21.field805);
            }
        } else if (arg6 >= 12) {
            class94 var35;
            if (var21.field808 == -1 && var21.field801 == null) {
                var35 = var21.method615(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1827(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3174(arg2, arg3, var22, var23, var21.field805);
            }
        } else if (arg6 == 0) {
            class94 var36;
            if (var21.field808 == -1 && var21.field801 == null) {
                var36 = var21.method615(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class14(arg4, 0, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var36, (class94) null, class9.field124[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3191(arg2, arg3, arg6, arg5, var21.field805);
            }
        } else if (arg6 == 1) {
            class94 var37;
            if (var21.field808 == -1 && var21.field801 == null) {
                var37 = var21.method615(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class14(arg4, 1, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var37, (class94) null, class9.field132[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3191(arg2, arg3, arg6, arg5, var21.field805);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class94 var39;
            class94 var40;
            if (var21.field808 == -1 && var21.field801 == null) {
                var39 = var21.method615(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method615(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class14(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field808, true, (class94) null);
                var40 = new class14(arg4, 2, var38, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var39, var40, class9.field124[arg5], class9.field124[var38], var32, var33);
            if (var21.field850 != 0) {
                var20.method3191(arg2, arg3, arg6, arg5, var21.field805);
            }
        } else if (arg6 == 3) {
            class94 var41;
            if (var21.field808 == -1 && var21.field801 == null) {
                var41 = var21.method615(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class14(arg4, 3, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1825(arg0, arg2, arg3, var29, var41, (class94) null, class9.field132[arg5], 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3191(arg2, arg3, arg6, arg5, var21.field805);
            }
        } else if (arg6 == 9) {
            class94 var42;
            if (var21.field808 == -1 && var21.field801 == null) {
                var42 = var21.method615(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class14(arg4, arg6, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1827(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field850 != 0) {
                var20.method3174(arg2, arg3, var22, var23, var21.field805);
            }
        } else if (arg6 == 4) {
            class94 var43;
            if (var21.field808 == -1 && var21.field801 == null) {
                var43 = var21.method615(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1993(arg0, arg2, arg3, var29, var43, (class94) null, class9.field124[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1878(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class32.method204(var45 >> 14 & 0x7FFF).field824;
            }
            class94 var46;
            if (var21.field808 == -1 && var21.field801 == null) {
                var46 = var21.method615(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class14(arg4, 4, arg5, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1993(arg0, arg2, arg3, var29, var46, (class94) null, class9.field124[arg5], 0, class9.field125[arg5] * var44, class9.field134[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1878(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class32.method204(var48 >> 14 & 0x7FFF).field824 / 2;
            }
            class94 var49;
            if (var21.field808 == -1 && var21.field801 == null) {
                var49 = var21.method615(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1993(arg0, arg2, arg3, var29, var49, (class94) null, 256, arg5, class9.field135[arg5] * var47, class9.field136[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class94 var51;
            if (var21.field808 == -1 && var21.field801 == null) {
                var51 = var21.method615(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class14(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1993(arg0, arg2, arg3, var29, var51, (class94) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1878(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class32.method204(var53 >> 14 & 0x7FFF).field824 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class94 var55;
            class94 var56;
            if (var21.field808 == -1 && var21.field801 == null) {
                var55 = var21.method615(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method615(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class14(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field808, true, (class94) null);
                var56 = new class14(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field808, true, (class94) null);
            }
            var19.method1993(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field135[arg5] * var52, class9.field136[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("do.bf(III)V")
    public static final void method2584(int arg0, int arg1) {
        class177 var2 = field596[Statics.field2034][arg0][arg1];
        if (var2 == null) {
            Statics.field2456.method1838(Statics.field2034, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3278(); var5 != null; var5 = (class17) var2.method3280()) {
            class40 var6 = class40.method211(var5.field256);
            int var7 = var6.field996;
            if (var6.field982 == 1) {
                var7 = (var5.field255 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field2456.method1838(Statics.field2034, arg0, arg1);
            return;
        }
        var2.method3289(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3278(); var10 != null; var10 = (class17) var2.method3280()) {
            if (var4.field256 != var10.field256) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field256 != var10.field256 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2456.method1824(Statics.field2034, arg0, arg1, method163(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2034), var4, var11, var8, var9);
    }

    @ObfuscatedName("h.bv(I)V")
    public static final void method151() {
        field590 = 0;
        field585 = 0;
        method114();
        int var0 = field595.method2274(8);
        if (var0 < field642) {
            for (int var1 = var0; var1 < field642; var1++) {
                field591[++field590 - 1] = field584[var1];
            }
        }
        if (var0 > field642) {
            throw new RuntimeException("");
        }
        field642 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field584[var2];
            class3 var4 = field582[var3];
            int var5 = field595.method2274(1);
            if (var5 == 0) {
                field584[++field642 - 1] = var3;
                var4.field410 = field472;
            } else {
                int var6 = field595.method2274(2);
                if (var6 == 0) {
                    field584[++field642 - 1] = var3;
                    var4.field410 = field472;
                    field602[++field585 - 1] = var3;
                } else if (var6 == 1) {
                    field584[++field642 - 1] = var3;
                    var4.field410 = field472;
                    int var7 = field595.method2274(3);
                    var4.method232(var7, false);
                    int var8 = field595.method2274(1);
                    if (var8 == 1) {
                        field602[++field585 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field584[++field642 - 1] = var3;
                    var4.field410 = field472;
                    int var9 = field595.method2274(3);
                    var4.method232(var9, true);
                    int var10 = field595.method2274(3);
                    var4.method232(var10, true);
                    int var11 = field595.method2274(1);
                    if (var11 == 1) {
                        field602[++field585 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field591[++field590 - 1] = var3;
                }
            }
        }
        method200();
        method299();
        for (int var12 = 0; var12 < field590; var12++) {
            int var13 = field591[var12];
            if (field472 != field582[var13].field410) {
                field582[var13] = null;
            }
        }
        if (field504 != field595.field2042) {
            throw new RuntimeException(field595.field2042 + class2.field22 + field504);
        }
        for (int var14 = 0; var14 < field642; var14++) {
            if (field582[field584[var14]] == null) {
                throw new RuntimeException(var14 + class2.field22 + field642);
            }
        }
    }

    @ObfuscatedName("y.bk(B)V")
    public static final void method114() {
        field595.method2268();
        int var0 = field595.method2274(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field595.method2274(2);
        if (var1 == 0) {
            field602[++field585 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field595.method2274(3);
            Statics.field2319.method232(var2, false);
            int var3 = field595.method2274(1);
            if (var3 == 1) {
                field602[++field585 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field595.method2274(3);
            Statics.field2319.method232(var4, true);
            int var5 = field595.method2274(3);
            Statics.field2319.method232(var5, true);
            int var6 = field595.method2274(1);
            if (var6 == 1) {
                field602[++field585 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field595.method2274(7);
            int var8 = field595.method2274(1);
            if (var8 == 1) {
                field602[++field585 - 1] = 2047;
            }
            int var9 = field595.method2274(7);
            Statics.field2034 = field595.method2274(2);
            int var10 = field595.method2274(1);
            Statics.field2319.method231(var9, var7, var10 == 1);
        }
    }

    @ObfuscatedName("n.bc(I)V")
    public static final void method200() {
        while (true) {
            if (field595.method2275(field504) >= 11) {
                int var0 = field595.method2274(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field582[var0] == null) {
                        field582[var0] = new class3();
                        if (field587[var0] != null) {
                            field582[var0].method16(field587[var0]);
                        }
                        var1 = true;
                    }
                    field584[++field642 - 1] = var0;
                    class3 var2 = field582[var0];
                    var2.field410 = field472;
                    int var3 = field595.method2274(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field595.method2274(1);
                    int var5 = field595.method2274(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field557[field595.method2274(3)];
                    if (var1) {
                        var2.field447 = var2.field401 = var6;
                    }
                    int var7 = field595.method2274(1);
                    if (var7 == 1) {
                        field602[++field585 - 1] = var0;
                    }
                    var2.method231(Statics.field2319.field451[0] + var5, Statics.field2319.field452[0] + var3, var4 == 1);
                    continue;
                }
            }
            field595.method2276();
            return;
        }
    }

    @ObfuscatedName("client.bl(S)V")
    public static final void method299() {
        for (int var0 = 0; var0 < field585; var0++) {
            int var1 = field602[var0];
            class3 var2 = field582[var1];
            int var3 = field595.method2509();
            if ((var3 & 0x80) != 0) {
                var3 += field595.method2509() << 8;
            }
            method1389(var1, var2, var3);
        }
    }

    @ObfuscatedName("bo.bp(ILa;IB)V")
    public static final void method1389(int arg0, class3 arg1, int arg2) {
        if ((arg2 & 0x20) != 0) {
            int var3 = field595.method2432();
            int var4 = field595.method2509();
            int var5 = field595.method2568();
            int var6 = field595.field2042;
            if (arg1.field52 != null && arg1.field40 != null) {
                boolean var7 = false;
                if (var4 <= 1 && method2262(arg1.field52)) {
                    var7 = true;
                }
                if (!var7 && field581 == 0) {
                    field488.field2042 = 0;
                    field595.method2465(field488.field2035, 0, var5);
                    field488.field2042 = 0;
                    String var8 = class185.method3363(class147.method129(class184.method2321(field488)));
                    arg1.field457 = var8.trim();
                    arg1.field414 = var3 >> 8;
                    arg1.field449 = var3 & 0xFF;
                    arg1.field413 = 150;
                    if (var4 == 2 || var4 == 3) {
                        method2003(1, class2.method2083(1) + arg1.field52, var8);
                    } else if (var4 == 1) {
                        method2003(1, class2.method2083(0) + arg1.field52, var8);
                    } else {
                        method2003(2, arg1.field52, var8);
                    }
                }
            }
            field595.field2042 = var5 + var6;
        }
        if ((arg2 & 0x200) != 0) {
            int var9 = field595.method2410();
            int var10 = field595.method2410();
            arg1.method246(var9, var10, field472);
            arg1.field419 = field472 + 300;
            arg1.field432 = field595.method2425();
            arg1.field421 = field595.method2410();
        }
        if ((arg2 & 0x40) != 0) {
            int var11 = field595.method2425();
            int var12 = field595.method2509();
            arg1.method246(var11, var12, field472);
            arg1.field419 = field472 + 300;
            arg1.field432 = field595.method2425();
            arg1.field421 = field595.method2425();
        }
        if ((arg2 & 0x8) != 0) {
            arg1.field422 = field595.method2432();
            if (arg1.field422 == 65535) {
                arg1.field422 = -1;
            }
        }
        if ((arg2 & 0x100) != 0) {
            arg1.field455 = field595.method2512();
            int var13 = field595.method2391();
            arg1.field437 = var13 >> 16;
            arg1.field436 = (var13 & 0xFFFF) + field472;
            arg1.field429 = 0;
            arg1.field435 = 0;
            if (arg1.field436 > field472) {
                arg1.field429 = -1;
            }
            if (arg1.field455 == 65535) {
                arg1.field455 = -1;
            }
        }
        if ((arg2 & 0x2) != 0) {
            arg1.field457 = field595.method2408();
            if (arg1.field457.charAt(0) == '~') {
                arg1.field457 = arg1.field457.substring(1);
                method2003(2, arg1.field52, arg1.field457);
            } else if (Statics.field2319 == arg1) {
                method2003(2, arg1.field52, arg1.field457);
            }
            arg1.field414 = 0;
            arg1.field449 = 0;
            arg1.field413 = 150;
        }
        if ((arg2 & 0x4) != 0) {
            int var14 = field595.method2432();
            if (var14 == 65535) {
                var14 = -1;
            }
            int var15 = field595.method2568();
            method146(arg1, var14, var15);
        }
        if ((arg2 & 0x1) != 0) {
            int var16 = field595.method2425();
            byte[] var17 = new byte[var16];
            class127 var18 = new class127(var17);
            field595.method2388(var17, 0, var16);
            field587[arg0] = var18;
            arg1.method16(var18);
        }
        if ((arg2 & 0x400) != 0) {
            arg1.field438 = field595.method2568();
            arg1.field425 = field595.method2509();
            arg1.field448 = field595.method2425();
            arg1.field441 = field595.method2425();
            arg1.field442 = field595.method2578() + field472;
            arg1.field450 = field595.method2512() + field472;
            arg1.field444 = field595.method2509();
            arg1.field427 = 1;
            arg1.field454 = 0;
        }
        if ((arg2 & 0x10) != 0) {
            arg1.field423 = field595.method2432();
            arg1.field424 = field595.method2434();
        }
    }

    @ObfuscatedName("p.bs(B)V")
    public static final void method56() {
        field590 = 0;
        field585 = 0;
        method1810();
        while (field595.method2275(field504) >= 27) {
            int var0 = field595.method2274(15);
            if (var0 == 32767) {
                break;
            }
            boolean var4 = false;
            if (field559[var0] == null) {
                field559[var0] = new class25();
                var4 = true;
            }
            class25 var5 = field559[var0];
            field500[++field499 - 1] = var0;
            var5.field410 = field472;
            int var6 = field595.method2274(1);
            var5.field382 = class31.method213(field595.method2274(14));
            int var7 = field557[field595.method2274(3)];
            if (var4) {
                var5.field447 = var5.field401 = var7;
            }
            int var8 = field595.method2274(5);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = field595.method2274(5);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = field595.method2274(1);
            if (var10 == 1) {
                field602[++field585 - 1] = var0;
            }
            var5.field403 = var5.field382.field769;
            var5.field404 = var5.field382.field788;
            if (var5.field404 == 0) {
                var5.field401 = 0;
            }
            var5.field407 = var5.field382.field771;
            var5.field426 = var5.field382.field772;
            var5.field409 = var5.field382.field773;
            var5.field406 = var5.field382.field774;
            var5.field412 = var5.field382.field777;
            var5.field405 = var5.field382.field761;
            var5.field443 = var5.field382.field791;
            var5.method231(Statics.field2319.field451[0] + var8, Statics.field2319.field452[0] + var9, var6 == 1);
        }
        field595.method2276();
        method710();
        for (int var1 = 0; var1 < field590; var1++) {
            int var2 = field591[var1];
            if (field472 != field559[var2].field410) {
                field559[var2].field382 = null;
                field559[var2] = null;
            }
        }
        if (field504 != field595.field2042) {
            throw new RuntimeException(field595.field2042 + class2.field22 + field504);
        }
        for (int var3 = 0; var3 < field499; var3++) {
            if (field559[field500[var3]] == null) {
                throw new RuntimeException(var3 + class2.field22 + field499);
            }
        }
    }

    @ObfuscatedName("cm.bu(B)V")
    public static final void method1810() {
        field595.method2268();
        int var0 = field595.method2274(8);
        if (var0 < field499) {
            for (int var1 = var0; var1 < field499; var1++) {
                field591[++field590 - 1] = field500[var1];
            }
        }
        if (var0 > field499) {
            throw new RuntimeException("");
        }
        field499 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field500[var2];
            class25 var4 = field559[var3];
            int var5 = field595.method2274(1);
            if (var5 == 0) {
                field500[++field499 - 1] = var3;
                var4.field410 = field472;
            } else {
                int var6 = field595.method2274(2);
                if (var6 == 0) {
                    field500[++field499 - 1] = var3;
                    var4.field410 = field472;
                    field602[++field585 - 1] = var3;
                } else if (var6 == 1) {
                    field500[++field499 - 1] = var3;
                    var4.field410 = field472;
                    int var7 = field595.method2274(3);
                    var4.method232(var7, false);
                    int var8 = field595.method2274(1);
                    if (var8 == 1) {
                        field602[++field585 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field500[++field499 - 1] = var3;
                    var4.field410 = field472;
                    int var9 = field595.method2274(3);
                    var4.method232(var9, true);
                    int var10 = field595.method2274(3);
                    var4.method232(var10, true);
                    int var11 = field595.method2274(1);
                    if (var11 == 1) {
                        field602[++field585 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field591[++field590 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("ar.bt(I)V")
    public static final void method710() {
        for (int var0 = 0; var0 < field585; var0++) {
            int var1 = field602[var0];
            class25 var2 = field559[var1];
            int var3 = field595.method2509();
            if ((var3 & 0x40) != 0) {
                var2.field422 = field595.method2432();
                if (var2.field422 == 65535) {
                    var2.field422 = -1;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var4 = field595.method2578();
                if (var4 == 65535) {
                    var4 = -1;
                }
                int var5 = field595.method2509();
                if (var2.field428 == var4 && var4 != -1) {
                    int var6 = class34.method136(var4).field884;
                    if (var6 == 1) {
                        var2.field445 = 0;
                        var2.field430 = 0;
                        var2.field431 = var5;
                        var2.field416 = 0;
                    }
                    if (var6 == 2) {
                        var2.field416 = 0;
                    }
                } else if (var4 == -1 || var2.field428 == -1 || class34.method136(var4).field875 >= class34.method136(var2.field428).field875) {
                    var2.field428 = var4;
                    var2.field445 = 0;
                    var2.field430 = 0;
                    var2.field431 = var5;
                    var2.field416 = 0;
                    var2.field454 = var2.field427;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field423 = field595.method2512();
                var2.field424 = field595.method2434();
            }
            if ((var3 & 0x4) != 0) {
                int var7 = field595.method2410();
                int var8 = field595.method2568();
                var2.method246(var7, var8, field472);
                var2.field419 = field472 + 300;
                var2.field432 = field595.method2509();
                var2.field421 = field595.method2568();
            }
            if ((var3 & 0x10) != 0) {
                var2.field382 = class31.method213(field595.method2432());
                var2.field403 = var2.field382.field769;
                var2.field404 = var2.field382.field788;
                var2.field407 = var2.field382.field771;
                var2.field426 = var2.field382.field772;
                var2.field409 = var2.field382.field773;
                var2.field406 = var2.field382.field774;
                var2.field412 = var2.field382.field777;
                var2.field405 = var2.field382.field761;
                var2.field443 = var2.field382.field791;
            }
            if ((var3 & 0x2) != 0) {
                int var9 = field595.method2425();
                int var10 = field595.method2509();
                var2.method246(var9, var10, field472);
                var2.field419 = field472 + 300;
                var2.field432 = field595.method2509();
                var2.field421 = field595.method2410();
            }
            if ((var3 & 0x1) != 0) {
                var2.field457 = field595.method2408();
                var2.field413 = 100;
            }
            if ((var3 & 0x8) != 0) {
                var2.field455 = field595.method2432();
                int var11 = field595.method2419();
                var2.field437 = var11 >> 16;
                var2.field436 = (var11 & 0xFFFF) + field472;
                var2.field429 = 0;
                var2.field435 = 0;
                if (var2.field436 > field472) {
                    var2.field429 = -1;
                }
                if (var2.field455 == 65535) {
                    var2.field455 = -1;
                }
            }
        }
    }

    @ObfuscatedName("as.be(I)V")
    public static final void method881() {
        int var0 = Statics.field1816;
        int var1 = Statics.field2330;
        int var2 = Statics.field908;
        int var3 = Statics.field92;
        int var4 = 6116423;
        class89.method1748(var0, var1, var2, var3, var4);
        class89.method1748(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class89.method1759(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field144.method3348(class134.field2222, var0 + 3, var1 + 14, var4, -1);
        int var5 = class77.field1405;
        int var6 = class77.field1394;
        for (int var7 = 0; var7 < field605; var7++) {
            int var8 = (field605 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class183 var10 = Statics.field144;
            String var11;
            if (field611[var7].length() > 0) {
                var11 = field610[var7] + class134.field2229 + field611[var7];
            } else {
                var11 = field610[var7];
            }
            var10.method3348(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field1816;
        int var13 = Statics.field2330;
        int var14 = Statics.field908;
        int var15 = Statics.field92;
        for (int var16 = 0; var16 < field663; var16++) {
            if (field554[var16] + field543[var16] > var12 && field543[var16] < var12 + var14 && field669[var16] + field573[var16] > var13 && field669[var16] < var13 + var15) {
                field666[var16] = true;
            }
        }
    }

    @ObfuscatedName("j.bd(IIIIB)V")
    public static final void method227(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field663; var4++) {
            if (field554[var4] + field543[var4] > arg0 && field543[var4] < arg0 + arg2 && field669[var4] + field573[var4] > arg1 && field669[var4] < arg1 + arg3) {
                field604[var4] = true;
            }
        }
    }

    @ObfuscatedName("ey.br(I)V")
    public static final void method3026() {
        if (Statics.field294 != null || field633 != null) {
            return;
        }
        int var12;
        int var13;
        label157: {
            int var0 = class77.field1399;
            if (field724) {
                if (var0 != 1) {
                    int var1 = class77.field1405;
                    int var2 = class77.field1394;
                    if (var1 < Statics.field1816 - 10 || var1 > Statics.field908 + Statics.field1816 + 10 || var2 < Statics.field2330 - 10 || var2 > Statics.field92 + Statics.field2330 + 10) {
                        field724 = false;
                        method227(Statics.field1816, Statics.field2330, Statics.field908, Statics.field92);
                    }
                }
                if (var0 == 1) {
                    int var3 = Statics.field1816;
                    int var4 = Statics.field2330;
                    int var5 = Statics.field908;
                    int var6 = class77.field1400;
                    int var7 = class77.field1393;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field605; var9++) {
                        int var10 = (field605 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1) {
                        method1351(var8);
                    }
                    field724 = false;
                    method227(Statics.field1816, Statics.field2330, Statics.field908, Statics.field92);
                }
            } else {
                if (var0 == 1 && field605 > 0) {
                    int var11 = field550[field605 - 1];
                    if (var11 == 39 || var11 == 40 || var11 == 41 || var11 == 42 || var11 == 43 || var11 == 33 || var11 == 34 || var11 == 35 || var11 == 36 || var11 == 37 || var11 == 38 || var11 == 1005) {
                        var12 = field606[field605 - 1];
                        var13 = field607[field605 - 1];
                        class158 var14 = class158.method3027(var13);
                        int var15 = method2685(var14);
                        boolean var16 = (var15 >> 28 & 0x1) != 0;
                        if (var16) {
                            break label157;
                        }
                        int var17 = method2685(var14);
                        boolean var18 = (var17 >> 29 & 0x1) != 0;
                        if (var18) {
                            break label157;
                        }
                    }
                }
                if (var0 == 1 && (field675 == 1 && field605 > 2 || method23(field605 - 1))) {
                    var0 = 2;
                }
                if (var0 == 1 && field605 > 0) {
                    method1351(field605 - 1);
                }
                if (var0 == 2 && field605 > 0) {
                    method2619();
                }
            }
            return;
        }
        field579 = false;
        field725 = 0;
        if (Statics.field294 != null) {
            method62(Statics.field294);
        }
        Statics.field294 = class158.method3027(var13);
        field575 = var12;
        field576 = class77.field1400;
        field577 = class77.field1393;
        method62(Statics.field294);
    }

    @ObfuscatedName("ec.bo(I)V")
    public static final void method2619() {
        int var0 = Statics.field144.method3343(class134.field2222);
        for (int var1 = 0; var1 < field605; var1++) {
            class183 var2 = Statics.field144;
            String var3;
            if (field611[var1].length() > 0) {
                var3 = field610[var1] + class134.field2229 + field611[var1];
            } else {
                var3 = field610[var1];
            }
            int var4 = var2.method3343(var3);
            if (var4 > var0) {
                var0 = var4;
            }
        }
        var0 += 8;
        int var5 = field605 * 15 + 21;
        int var6 = class77.field1400 - var0 / 2;
        if (var0 + var6 > 765) {
            var6 = 765 - var0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = class77.field1393;
        if (var5 + var7 > 503) {
            var7 = 503 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field724 = true;
        Statics.field1816 = var6;
        Statics.field2330 = var7;
        Statics.field908 = var0;
        Statics.field92 = field605 * 15 + 22;
    }

    @ObfuscatedName("a.bx(IB)Z")
    public static final boolean method23(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field550[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("bd.bb(II)V")
    public static final void method1351(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field606[arg0];
        int var2 = field607[arg0];
        int var3 = field550[arg0];
        int var4 = field609[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 48) {
            class3 var5 = field582[var4];
            if (var5 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var5.field451[0], var5.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(116);
                field501.method2538(var4);
            }
        }
        if (var3 == 38) {
            Statics.method3203();
            class158 var6 = class158.method3027(var2);
            field616 = 1;
            Statics.field1041 = var1;
            Statics.field1038 = var2;
            Statics.field909 = var4;
            method62(var6);
            field617 = class2.method1521(16748608) + class40.method211(var4).field984 + class2.method1521(16777215);
            if (field617 == null) {
                field617 = "null";
            }
            return;
        }
        if (var3 == 57 || var3 == 1007) {
            method27(var4, var2, var1, field611[arg0]);
        }
        if (var3 == 46) {
            class3 var7 = field582[var4];
            if (var7 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var7.field451[0], var7.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(73);
                field501.method2429(var4);
            }
        }
        if (var3 == 13) {
            class25 var8 = field559[var4];
            if (var8 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var8.field451[0], var8.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(86);
                field501.method2538(var4);
            }
        }
        if (var3 == 49) {
            class3 var9 = field582[var4];
            if (var9 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var9.field451[0], var9.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(80);
                field501.method2387(var4);
            }
        }
        if (var3 == 9) {
            class25 var10 = field559[var4];
            if (var10 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var10.field451[0], var10.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(197);
                field501.method2387(var4);
            }
        }
        if (var3 == 34) {
            field501.method2265(36);
            field501.method2430(var4);
            field501.method2559(var2);
            field501.method2429(var1);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 30 && field459 == null) {
            method152(var2, var1);
            field459 = class158.method2990(var2, var1);
            method62(field459);
        }
        if (var3 == 23) {
            Statics.field2456.method1854(Statics.field2034, var1, var2);
        }
        if (var3 == 15) {
            class3 var11 = field582[var4];
            if (var11 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var11.field451[0], var11.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(40);
                field501.method2429(var4);
                field501.method2387(field702);
                field501.method2522(Statics.field176);
            }
        }
        if (var3 == 1002) {
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(186);
            field501.method2430(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 47) {
            class3 var12 = field582[var4];
            if (var12 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var12.field451[0], var12.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(160);
                field501.method2429(var4);
            }
        }
        if (var3 == 44) {
            class3 var13 = field582[var4];
            if (var13 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var13.field451[0], var13.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(145);
                field501.method2429(var4);
            }
        }
        if (var3 == 10) {
            class25 var14 = field559[var4];
            if (var14 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var14.field451[0], var14.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(155);
                field501.method2430(var4);
            }
        }
        if (var3 == 42) {
            field501.method2265(29);
            field501.method2429(var4);
            field501.method2430(var1);
            field501.method2389(var2);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 3) {
            method36(var1, var2, var4);
            field501.method2265(108);
            field501.method2538(var4 >> 14 & 0x7FFF);
            field501.method2387(Statics.field1920 + var2);
            field501.method2430(Statics.field751 + var1);
        }
        if (var3 == 36) {
            field501.method2265(182);
            field501.method2538(var1);
            field501.method2538(var4);
            field501.method2389(var2);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 35) {
            field501.method2265(194);
            field501.method2559(var2);
            field501.method2430(var1);
            field501.method2387(var4);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 43) {
            field501.method2265(51);
            field501.method2387(var4);
            field501.method2538(var1);
            field501.method2522(var2);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 12) {
            class25 var15 = field559[var4];
            if (var15 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var15.field451[0], var15.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(212);
                field501.method2538(var4);
            }
        }
        if (var3 == 6) {
            method36(var1, var2, var4);
            field501.method2265(174);
            field501.method2430(var4 >> 14 & 0x7FFF);
            field501.method2538(Statics.field751 + var1);
            field501.method2538(Statics.field1920 + var2);
        }
        if (var3 == 7) {
            class25 var16 = field559[var4];
            if (var16 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var16.field451[0], var16.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(249);
                field501.method2538(Statics.field909);
                field501.method2429(Statics.field1041);
                field501.method2439(Statics.field1038);
                field501.method2538(var4);
            }
        }
        if (var3 == 4) {
            method36(var1, var2, var4);
            field501.method2265(69);
            field501.method2429(Statics.field1920 + var2);
            field501.method2430(Statics.field751 + var1);
            field501.method2430(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 8) {
            class25 var17 = field559[var4];
            if (var17 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var17.field451[0], var17.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(4);
                field501.method2430(var4);
                field501.method2429(field702);
                field501.method2559(Statics.field176);
            }
        }
        if (var3 == 58) {
            field501.method2265(214);
            field501.method2387(var1);
            field501.method2559(Statics.field176);
            field501.method2522(var2);
            field501.method2538(field702);
        }
        if (var3 == 5) {
            method36(var1, var2, var4);
            field501.method2265(41);
            field501.method2429(Statics.field751 + var1);
            field501.method2387(Statics.field1920 + var2);
            field501.method2429(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 29) {
            field501.method2265(185);
            field501.method2389(var2);
            class158 var18 = class158.method3027(var2);
            if (var18.field2665 != null && var18.field2665[0][0] == 5) {
                int var19 = var18.field2665[0][1];
                if (class159.field2715[var19] != var18.field2693[0]) {
                    class159.field2715[var19] = var18.field2693[0];
                    method760(var19);
                }
            }
        }
        if (var3 == 1005) {
            class158 var20 = class158.method3027(var2);
            if (var20 == null || var20.field2698[var1] < 100000) {
                field501.method2265(233);
                field501.method2429(var4);
            } else {
                method2003(0, "", var20.field2698[var1] + " x " + class40.method211(var4).field984);
            }
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 1001) {
            method36(var1, var2, var4);
            field501.method2265(107);
            field501.method2538(Statics.field1920 + var2);
            field501.method2387(var4 >> 14 & 0x7FFF);
            field501.method2429(Statics.field751 + var1);
        }
        if (var3 == 2 && method36(var1, var2, var4)) {
            field501.method2265(189);
            field501.method2429(Statics.field1920 + var2);
            field501.method2389(Statics.field176);
            field501.method2430(field702);
            field501.method2429(Statics.field751 + var1);
            field501.method2538(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1003) {
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            class25 var21 = field559[var4];
            if (var21 != null) {
                class31 var22 = var21.field382;
                if (var22.field789 != null) {
                    var22 = var22.method585();
                }
                if (var22 != null) {
                    field501.method2265(213);
                    field501.method2429(var22.field763);
                }
            }
        }
        if (var3 == 1 && method36(var1, var2, var4)) {
            field501.method2265(60);
            field501.method2439(Statics.field1038);
            field501.method2387(Statics.field751 + var1);
            field501.method2538(Statics.field1920 + var2);
            field501.method2430(Statics.field1041);
            field501.method2430(var4 >> 14 & 0x7FFF);
            field501.method2387(Statics.field909);
        }
        if (var3 == 45) {
            class3 var23 = field582[var4];
            if (var23 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var23.field451[0], var23.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(71);
                field501.method2538(var4);
            }
        }
        if (var3 == 21) {
            boolean var24 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var24) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(123);
            field501.method2429(var4);
            field501.method2387(Statics.field1920 + var2);
            field501.method2538(Statics.field751 + var1);
        }
        if (var3 == 16) {
            boolean var26 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var26) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(171);
            field501.method2439(Statics.field1038);
            field501.method2430(Statics.field1041);
            field501.method2430(Statics.field751 + var1);
            field501.method2387(Statics.field1920 + var2);
            field501.method2538(var4);
            field501.method2429(Statics.field909);
        }
        if (var3 == 40) {
            field501.method2265(35);
            field501.method2429(var1);
            field501.method2389(var2);
            field501.method2538(var4);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 17) {
            boolean var28 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var28) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(188);
            field501.method2430(var4);
            field501.method2559(Statics.field176);
            field501.method2538(field702);
            field501.method2538(Statics.field1920 + var2);
            field501.method2430(Statics.field751 + var1);
        }
        if (var3 == 50) {
            class3 var30 = field582[var4];
            if (var30 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var30.field451[0], var30.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(85);
                field501.method2538(var4);
            }
        }
        if (var3 == 31) {
            field501.method2265(252);
            field501.method2430(Statics.field909);
            field501.method2389(Statics.field1038);
            field501.method2430(var4);
            field501.method2538(Statics.field1041);
            field501.method2439(var2);
            field501.method2430(var1);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 41) {
            field501.method2265(173);
            field501.method2559(var2);
            field501.method2430(var1);
            field501.method2538(var4);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 1004) {
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(233);
            field501.method2429(var4);
        }
        if (var3 == 20) {
            boolean var31 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var31) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(105);
            field501.method2538(Statics.field1920 + var2);
            field501.method2429(Statics.field751 + var1);
            field501.method2429(var4);
        }
        if (var3 == 18) {
            boolean var33 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var33) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(75);
            field501.method2429(Statics.field751 + var1);
            field501.method2538(Statics.field1920 + var2);
            field501.method2430(var4);
        }
        if (var3 == 37) {
            field501.method2265(12);
            field501.method2387(var1);
            field501.method2439(var2);
            field501.method2538(var4);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 28) {
            field501.method2265(185);
            field501.method2389(var2);
            class158 var35 = class158.method3027(var2);
            if (var35.field2665 != null && var35.field2665[0][0] == 5) {
                int var36 = var35.field2665[0][1];
                class159.field2715[var36] = 1 - class159.field2715[var36];
                method760(var36);
            }
        }
        if (var3 == 22) {
            boolean var37 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var37) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(219);
            field501.method2538(Statics.field751 + var1);
            field501.method2387(var4);
            field501.method2429(Statics.field1920 + var2);
        }
        if (var3 == 32) {
            field501.method2265(102);
            field501.method2559(Statics.field176);
            field501.method2429(field702);
            field501.method2430(var1);
            field501.method2430(var4);
            field501.method2389(var2);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 51) {
            class3 var39 = field582[var4];
            if (var39 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var39.field451[0], var39.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(227);
                field501.method2430(var4);
            }
        }
        if (var3 == 25) {
            class158 var40 = class158.method2990(var2, var1);
            if (var40 != null) {
                Statics.method3203();
                int var41 = method2685(var40);
                int var42 = var41 >> 11 & 0x3F;
                class158 var44 = class158.method2990(var2, var1);
                if (var44 != null && var44.field2673 != null) {
                    class1 var45 = new class1();
                    var45.field2 = var44;
                    var45.field8 = var44.field2673;
                    class26.method1254(var45);
                }
                field618 = true;
                Statics.field176 = var2;
                field702 = var1;
                Statics.field33 = var42;
                method62(var44);
                field616 = 0;
                int var46 = method2685(var40);
                int var47 = var46 >> 11 & 0x3F;
                String var48;
                if (var47 == 0) {
                    var48 = null;
                } else if (var40.field2661 == null || var40.field2661.trim().length() == 0) {
                    var48 = null;
                } else {
                    var48 = var40.field2661;
                }
                field620 = var48;
                if (field620 == null) {
                    field620 = "Null";
                }
                if (var40.field2594) {
                    field621 = var40.field2655 + class2.method1521(16777215);
                } else {
                    field621 = class2.method1521(65280) + var40.field2628 + class2.method1521(16777215);
                }
            }
            return;
        }
        if (var3 == 14) {
            class3 var49 = field582[var4];
            if (var49 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var49.field451[0], var49.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(111);
                field501.method2439(Statics.field1038);
                field501.method2429(Statics.field1041);
                field501.method2429(Statics.field909);
                field501.method2429(var4);
            }
        }
        if (var3 == 11) {
            class25 var50 = field559[var4];
            if (var50 != null) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var50.field451[0], var50.field452[0], false, 0, 0, 1, 1, 0, 2);
                field569 = class77.field1400;
                field718 = class77.field1393;
                field572 = 2;
                field676 = 0;
                field501.method2265(37);
                field501.method2538(var4);
            }
        }
        if (var3 == 19) {
            boolean var51 = method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var51) {
                method778(Statics.field2319.field451[0], Statics.field2319.field452[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field569 = class77.field1400;
            field718 = class77.field1393;
            field572 = 2;
            field676 = 0;
            field501.method2265(119);
            field501.method2538(Statics.field1920 + var2);
            field501.method2538(Statics.field751 + var1);
            field501.method2430(var4);
        }
        if (var3 == 33) {
            field501.method2265(68);
            field501.method2538(var4);
            field501.method2387(var1);
            field501.method2522(var2);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 24) {
            class158 var53 = class158.method3027(var2);
            boolean var54 = true;
            if (var53.field2599 > 0) {
                var54 = method109(var53);
            }
            if (var54) {
                field501.method2265(185);
                field501.method2389(var2);
            }
        }
        if (var3 == 39) {
            field501.method2265(220);
            field501.method2389(var2);
            field501.method2387(var4);
            field501.method2538(var1);
            field570 = 0;
            Statics.field2027 = class158.method3027(var2);
            field574 = var1;
        }
        if (var3 == 26) {
            field501.method2265(131);
            for (class4 var55 = (class4) field623.method3257(); var55 != null; var55 = (class4) field623.method3258()) {
                if (var55.field64 == 0 || var55.field64 == 3) {
                    method3318(var55, true);
                }
            }
            if (field459 != null) {
                method62(field459);
                field459 = null;
            }
        }
        if (field616 != 0) {
            field616 = 0;
            method62(class158.method3027(Statics.field1038));
        }
        if (field618) {
            Statics.method3203();
        }
        if (Statics.field2027 != null && field570 == 0) {
            method62(Statics.field2027);
        }
    }

    @ObfuscatedName("v.ba(IIB)V")
    public static void method152(int arg0, int arg1) {
        field501.method2265(234);
        field501.method2559(arg0);
        field501.method2387(arg1);
    }

    @ObfuscatedName("a.bg(IIILjava/lang/String;I)V")
    public static void method27(int arg0, int arg1, int arg2, String arg3) {
        class158 var4 = class158.method2990(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2682 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field5 = arg0;
            var5.field9 = arg3;
            var5.field8 = var4.field2682;
            class26.method1254(var5);
        }
        boolean var6 = true;
        if (var4.field2599 > 0) {
            var6 = method109(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method2685(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field501.method2265(76);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 2) {
            field501.method2265(222);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 3) {
            field501.method2265(5);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 4) {
            field501.method2265(149);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 5) {
            field501.method2265(78);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 6) {
            field501.method2265(54);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 7) {
            field501.method2265(221);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 8) {
            field501.method2265(44);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 9) {
            field501.method2265(28);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
        if (arg0 == 10) {
            field501.method2265(204);
            field501.method2389(arg1);
            field501.method2387(arg2);
        }
    }

    @ObfuscatedName("aj.bn(I)V")
    public static final void method795() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field605 - 1; var1++) {
                if (field550[var1] < 1000 && field550[var1 + 1] > 1000) {
                    String var2 = field611[var1];
                    field611[var1] = field611[var1 + 1];
                    field611[var1 + 1] = var2;
                    String var3 = field610[var1];
                    field610[var1] = field610[var1 + 1];
                    field610[var1 + 1] = var3;
                    int var4 = field550[var1];
                    field550[var1] = field550[var1 + 1];
                    field550[var1 + 1] = var4;
                    int var5 = field606[var1];
                    field606[var1] = field606[var1 + 1];
                    field606[var1 + 1] = var5;
                    int var6 = field607[var1];
                    field607[var1] = field607[var1 + 1];
                    field607[var1 + 1] = var6;
                    int var7 = field609[var1];
                    field609[var1] = field609[var1 + 1];
                    field609[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("fa.bj(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method3077(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field724 || field605 >= 500) {
            return;
        }
        field610[field605] = arg0;
        field611[field605] = arg1;
        field550[field605] = arg2;
        field609[field605] = arg3;
        field606[field605] = arg4;
        field607[field605] = arg5;
        field605++;
    }

    @ObfuscatedName("bo.ca(Lax;IIIB)V")
    public static final void method1380(class31 arg0, int arg1, int arg2, int arg3) {
        if (field605 >= 400) {
            return;
        }
        if (arg0.field789 != null) {
            arg0 = arg0.method585();
        }
        if (arg0 == null || !arg0.field760) {
            return;
        }
        String var4 = arg0.field764;
        if (arg0.field781 != 0) {
            var4 = var4 + method2260(arg0.field781, Statics.field2319.field43) + " " + class2.field26 + class134.field2274 + arg0.field781 + class2.field25;
        }
        if (field616 == 1) {
            method3077(class134.field2219, field617 + " " + class2.field24 + " " + class2.method1521(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field618) {
            String[] var5 = arg0.field783;
            if (field624) {
                var5 = method229(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class134.field2221)) {
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
                        method3077(var5[var6], class2.method1521(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class134.field2221)) {
                        short var9 = 0;
                        if (arg0.field781 > Statics.field2319.field43) {
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
                        method3077(var5[var8], class2.method1521(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method3077(class134.field2220, class2.method1521(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field33 & 0x2) == 2) {
            method3077(field620, field621 + " " + class2.field24 + " " + class2.method1521(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ez.ci(La;IIIB)V")
    public static final void method2625(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2319 == arg0 || field605 >= 400) {
            return;
        }
        String var4;
        if (arg0.field58 == 0) {
            var4 = arg0.field52 + method2260(arg0.field43, Statics.field2319.field43) + " " + class2.field26 + class134.field2274 + arg0.field43 + class2.field25;
        } else {
            var4 = arg0.field52 + " " + class2.field26 + class134.field2226 + arg0.field58 + class2.field25;
        }
        if (field616 == 1) {
            method3077(class134.field2219, field617 + " " + class2.field24 + " " + class2.method1521(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field618) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field593[var5] != null) {
                    short var6 = 0;
                    if (field593[var5].equalsIgnoreCase(class134.field2221)) {
                        if (arg0.field43 > Statics.field2319.field43) {
                            var6 = 2000;
                        }
                        if (Statics.field2319.field57 != 0 && arg0.field57 != 0) {
                            if (Statics.field2319.field57 == arg0.field57) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field594[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field592[var5] + var6;
                    method3077(field593[var5], class2.method1521(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field33 & 0x8) == 8) {
            method3077(field620, field621 + " " + class2.field24 + " " + class2.method1521(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field605; var9++) {
            if (field550[var9] == 23) {
                field611[var9] = class2.method1521(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("da.cf(III)Ljava/lang/String;")
    public static final String method2260(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1521(16711680);
        } else if (var2 < -6) {
            return class2.method1521(16723968);
        } else if (var2 < -3) {
            return class2.method1521(16740352);
        } else if (var2 < 0) {
            return class2.method1521(16756736);
        } else if (var2 > 9) {
            return class2.method1521(65280);
        } else if (var2 > 6) {
            return class2.method1521(4259584);
        } else if (var2 > 3) {
            return class2.method1521(8453888);
        } else if (var2 > 0) {
            return class2.method1521(12648192);
        } else {
            return class2.method1521(16776960);
        }
    }

    @ObfuscatedName("cy.cb([Lfa;IIIIIIIIB)V")
    public static final void method1590(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1741(arg2, arg3, arg4, arg5);
        class104.method2087();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2606 == arg1 || arg1 == -1412584499 && field633 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field543[field663] = var10.field2600 + arg6;
                    field669[field663] = var10.field2702 + arg7;
                    field554[field663] = var10.field2637;
                    field573[field663] = var10.field2605;
                    var11 = ++field663 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2710 = var11;
                var10.field2711 = field472;
                if (!var10.field2594 || !method37(var10)) {
                    if (var10.field2599 > 0) {
                        method525(var10);
                    }
                    int var12 = var10.field2600 + arg6;
                    int var13 = var10.field2702 + arg7;
                    int var14 = var10.field2676;
                    if (field633 == var10) {
                        if (arg1 != -1412584499 && !var10.field2604) {
                            Statics.field381 = arg0;
                            Statics.field15 = arg6;
                            Statics.field456 = arg7;
                            continue;
                        }
                        if (field644 && field638) {
                            int var15 = class77.field1405;
                            int var16 = class77.field1394;
                            int var17 = var15 - field635;
                            int var18 = var16 - field580;
                            if (var17 < field639) {
                                var17 = field639;
                            }
                            if (var10.field2637 + var17 > field639 + field634.field2637) {
                                var17 = field639 + field634.field2637 - var10.field2637;
                            }
                            if (var18 < field603) {
                                var18 = field603;
                            }
                            if (var10.field2605 + var18 > field603 + field634.field2605) {
                                var18 = field603 + field634.field2605 - var10.field2605;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2604) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2597 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2597 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2637 + var12;
                        int var26 = var10.field2605 + var13;
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
                        int var29 = var10.field2637 + var12;
                        int var30 = var10.field2605 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2594 || var19 < var21 && var20 < var22) {
                        if (var10.field2599 != 0) {
                            if (var10.field2599 == 1337) {
                                field515 = var12;
                                field613 = var13;
                                int var31 = var10.field2637;
                                int var32 = var10.field2605;
                                class89.method1741(var12, var13, var12 + var31, var13 + var32);
                                class104.method2087();
                                field566++;
                                method130(true);
                                method1500(true);
                                method130(false);
                                method1500(false);
                                for (class10 var33 = (class10) field507.method3278(); var33 != null; var33 = (class10) field507.method3280()) {
                                    if (Statics.field2034 != var33.field169 || field472 > var33.field151) {
                                        var33.method3306();
                                    } else if (field472 >= var33.field174) {
                                        if (var33.field159 > 0) {
                                            class25 var34 = field559[var33.field159 - 1];
                                            if (var34 != null && var34.field420 >= 0 && var34.field420 < 13312 && var34.field400 >= 0 && var34.field400 < 13312) {
                                                var33.method104(var34.field420, var34.field400, method163(var34.field420, var34.field400, var33.field169) - var33.field149, field472);
                                            }
                                        }
                                        if (var33.field159 < 0) {
                                            int var35 = -var33.field159 - 1;
                                            class3 var36;
                                            if (field588 == var35) {
                                                var36 = Statics.field2319;
                                            } else {
                                                var36 = field582[var35];
                                            }
                                            if (var36 != null && var36.field420 >= 0 && var36.field420 < 13312 && var36.field400 >= 0 && var36.field400 < 13312) {
                                                var33.method104(var36.field420, var36.field400, method163(var36.field420, var36.field400, var33.field169) - var33.field149, field472);
                                            }
                                        }
                                        var33.method106(field540);
                                        Statics.field2456.method1828(Statics.field2034, (int) var33.field158, (int) var33.field157, (int) var33.field166, 60, var33, var33.field164, -1, false);
                                    }
                                }
                                for (class20 var37 = (class20) field614.method3278(); var37 != null; var37 = (class20) field614.method3280()) {
                                    if (Statics.field2034 != var37.field292 || var37.field287) {
                                        var37.method3306();
                                    } else if (field472 >= var37.field279) {
                                        var37.method168(field540);
                                        if (var37.field287) {
                                            var37.method3306();
                                        } else {
                                            Statics.field2456.method1828(var37.field292, var37.field281, var37.field282, var37.field283, 60, var37, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field722) {
                                    int var38 = field548;
                                    if (field652 / 256 > var38) {
                                        var38 = field652 / 256;
                                    }
                                    if (field709[4] && field711[4] + 128 > var38) {
                                        var38 = field711[4] + 128;
                                    }
                                    int var39 = field671 + field549 & 0x7FF;
                                    method1455(Statics.field1174, method163(Statics.field2319.field420, Statics.field2319.field400, Statics.field2034) - 50, Statics.field869, var38, var39, var38 * 3 + 600);
                                }
                                int var40;
                                if (field722) {
                                    int var41;
                                    if (Statics.field97.field185) {
                                        var41 = Statics.field2034;
                                    } else {
                                        int var42 = method163(Statics.field865, Statics.field1507, Statics.field2034);
                                        if (var42 - Statics.field212 >= 800 || (class9.field142[Statics.field2034][Statics.field865 >> 7][Statics.field1507 >> 7] & 0x4) == 0) {
                                            var41 = 3;
                                        } else {
                                            var41 = Statics.field2034;
                                        }
                                    }
                                    var40 = var41;
                                } else {
                                    var40 = method2002();
                                }
                                int var43 = Statics.field865;
                                int var44 = Statics.field212;
                                int var45 = Statics.field1507;
                                int var46 = Statics.field83;
                                int var47 = Statics.field708;
                                for (int var48 = 0; var48 < 5; var48++) {
                                    if (field709[var48]) {
                                        int var49 = (int) (Math.random() * (double) (field631[var48] * 2 + 1) - (double) field631[var48] + Math.sin((double) field518[var48] / 100.0D * (double) field659[var48]) * (double) field711[var48]);
                                        if (var48 == 0) {
                                            Statics.field865 += var49;
                                        }
                                        if (var48 == 1) {
                                            Statics.field212 += var49;
                                        }
                                        if (var48 == 2) {
                                            Statics.field1507 += var49;
                                        }
                                        if (var48 == 3) {
                                            Statics.field708 = Statics.field708 + var49 & 0x7FF;
                                        }
                                        if (var48 == 4) {
                                            Statics.field83 += var49;
                                            if (Statics.field83 < 128) {
                                                Statics.field83 = 128;
                                            }
                                            if (Statics.field83 > 383) {
                                                Statics.field83 = 383;
                                            }
                                        }
                                    }
                                }
                                int var50 = class77.field1405;
                                int var51 = class77.field1394;
                                if (var50 >= var12 && var50 < var12 + var31 && var51 >= var13 && var51 < var13 + var32) {
                                    class112.field1907 = true;
                                    class112.field1910 = 0;
                                    class112.field1908 = class77.field1405 - var12;
                                    class112.field1909 = class77.field1394 - var13;
                                } else {
                                    class112.field1907 = false;
                                    class112.field1910 = 0;
                                }
                                method5();
                                class89.method1748(var12, var13, var31, var32, 0);
                                method5();
                                Statics.field2456.method1855(Statics.field865, Statics.field212, Statics.field1507, Statics.field83, Statics.field708, var40);
                                method5();
                                Statics.field2456.method1831();
                                method864(var12, var13, var31, var32);
                                method1282(var12, var13);
                                ((class110) Statics.field1773).method2174(field540);
                                method1352(var12, var13, var31, var32);
                                Statics.field865 = var43;
                                Statics.field212 = var44;
                                Statics.field1507 = var45;
                                Statics.field83 = var46;
                                Statics.field708 = var47;
                                if (field637 && class153.method39(true, false) == 0) {
                                    field637 = false;
                                }
                                if (field637) {
                                    class89.method1748(var12, var13, var31, var32, 0);
                                    method1394(class134.field2085, false);
                                }
                                if (!field637 && !field724 && var50 >= var12 && var50 < var12 + var31 && var51 >= var13 && var51 < var13 + var32) {
                                    if (field616 == 0 && !field618) {
                                        method3077(class134.field2224, "", 23, 0, var50 - var12, var51 - var13);
                                    }
                                    int var52 = -1;
                                    for (int var53 = 0; var53 < class112.field1910; var53++) {
                                        int var54 = class112.field1860[var53];
                                        int var55 = var54 & 0x7F;
                                        int var56 = var54 >> 7 & 0x7F;
                                        int var57 = var54 >> 29 & 0x3;
                                        int var58 = var54 >> 14 & 0x7FFF;
                                        if (var52 != var54) {
                                            var52 = var54;
                                            if (var57 == 2 && Statics.field2456.method1946(Statics.field2034, var55, var56, var54) >= 0) {
                                                class32 var59 = class32.method204(var58);
                                                if (var59.field801 != null) {
                                                    var59 = var59.method618();
                                                }
                                                if (var59 == null) {
                                                    continue;
                                                }
                                                if (field616 == 1) {
                                                    method3077(class134.field2219, field617 + " " + class2.field24 + " " + class2.method1521(65535) + var59.field810, 1, var54, var55, var56);
                                                } else if (!field618) {
                                                    String[] var60 = var59.field827;
                                                    if (field624) {
                                                        var60 = method229(var60);
                                                    }
                                                    if (var60 != null) {
                                                        for (int var61 = 4; var61 >= 0; var61--) {
                                                            if (var60[var61] != null) {
                                                                short var62 = 0;
                                                                if (var61 == 0) {
                                                                    var62 = 3;
                                                                }
                                                                if (var61 == 1) {
                                                                    var62 = 4;
                                                                }
                                                                if (var61 == 2) {
                                                                    var62 = 5;
                                                                }
                                                                if (var61 == 3) {
                                                                    var62 = 6;
                                                                }
                                                                if (var61 == 4) {
                                                                    var62 = 1001;
                                                                }
                                                                method3077(var60[var61], class2.method1521(65535) + var59.field810, var62, var54, var55, var56);
                                                            }
                                                        }
                                                    }
                                                    method3077(class134.field2220, class2.method1521(65535) + var59.field810, 1002, var59.field814 << 14, var55, var56);
                                                } else if ((Statics.field33 & 0x4) == 4) {
                                                    method3077(field620, field621 + " " + class2.field24 + " " + class2.method1521(65535) + var59.field810, 2, var54, var55, var56);
                                                }
                                            }
                                            if (var57 == 1) {
                                                class25 var63 = field559[var58];
                                                if (var63.field382.field769 == 1 && (var63.field420 & 0x7F) == 64 && (var63.field400 & 0x7F) == 64) {
                                                    for (int var64 = 0; var64 < field499; var64++) {
                                                        class25 var65 = field559[field500[var64]];
                                                        if (var65 != null && var63 != var65 && var65.field382.field769 == 1 && var63.field420 == var65.field420 && var63.field400 == var65.field400) {
                                                            method1380(var65.field382, field500[var64], var55, var56);
                                                        }
                                                    }
                                                    for (int var66 = 0; var66 < field642; var66++) {
                                                        class3 var67 = field582[field584[var66]];
                                                        if (var67 != null && var63.field420 == var67.field420 && var63.field400 == var67.field400) {
                                                            method2625(var67, field584[var66], var55, var56);
                                                        }
                                                    }
                                                }
                                                method1380(var63.field382, var58, var55, var56);
                                            }
                                            if (var57 == 0) {
                                                class3 var68 = field582[var58];
                                                if ((var68.field420 & 0x7F) == 64 && (var68.field400 & 0x7F) == 64) {
                                                    for (int var69 = 0; var69 < field499; var69++) {
                                                        class25 var70 = field559[field500[var69]];
                                                        if (var70 != null && var70.field382.field769 == 1 && var68.field420 == var70.field420 && var68.field400 == var70.field400) {
                                                            method1380(var70.field382, field500[var69], var55, var56);
                                                        }
                                                    }
                                                    for (int var71 = 0; var71 < field642; var71++) {
                                                        class3 var72 = field582[field584[var71]];
                                                        if (var72 != null && var68 != var72 && var68.field420 == var72.field420 && var68.field400 == var72.field400) {
                                                            method2625(var72, field584[var71], var55, var56);
                                                        }
                                                    }
                                                }
                                                method2625(var68, var58, var55, var56);
                                            }
                                            if (var57 == 3) {
                                                class177 var73 = field596[Statics.field2034][var55][var56];
                                                if (var73 != null) {
                                                    for (class17 var74 = (class17) var73.method3282(); var74 != null; var74 = (class17) var73.method3281()) {
                                                        class40 var75 = class40.method211(var74.field256);
                                                        if (field616 == 1) {
                                                            method3077(class134.field2219, field617 + " " + class2.field24 + " " + class2.method1521(16748608) + var75.field984, 16, var74.field256, var55, var56);
                                                        } else if (!field618) {
                                                            String[] var76 = var75.field1020;
                                                            if (field624) {
                                                                var76 = method229(var76);
                                                            }
                                                            for (int var77 = 4; var77 >= 0; var77--) {
                                                                if (var76 != null && var76[var77] != null) {
                                                                    byte var78 = 0;
                                                                    if (var77 == 0) {
                                                                        var78 = 18;
                                                                    }
                                                                    if (var77 == 1) {
                                                                        var78 = 19;
                                                                    }
                                                                    if (var77 == 2) {
                                                                        var78 = 20;
                                                                    }
                                                                    if (var77 == 3) {
                                                                        var78 = 21;
                                                                    }
                                                                    if (var77 == 4) {
                                                                        var78 = 22;
                                                                    }
                                                                    method3077(var76[var77], class2.method1521(16748608) + var75.field984, var78, var74.field256, var55, var56);
                                                                } else if (var77 == 2) {
                                                                    method3077(class134.field2079, class2.method1521(16748608) + var75.field984, 20, var74.field256, var55, var56);
                                                                }
                                                            }
                                                            method3077(class134.field2220, class2.method1521(16748608) + var75.field984, 1004, var74.field256, var55, var56);
                                                        } else if ((Statics.field33 & 0x1) == 1) {
                                                            method3077(field620, field621 + " " + class2.field24 + " " + class2.method1521(16748608) + var75.field984, 17, var74.field256, var55, var56);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class89.method1741(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2599 == 1338) {
                                method2373(var12, var13, var11);
                                class89.method1741(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var79 = class77.field1405;
                        int var80 = class77.field1394;
                        if (!field724 && var79 >= var19 && var80 >= var20 && var79 < var21 && var80 < var22) {
                            method2384(var10, var79 - var12, var80 - var13);
                        }
                        if (var10.field2597 == 0) {
                            if (!var10.field2594 && method37(var10) && Statics.field1318 != var10) {
                                continue;
                            }
                            if (!var10.field2594) {
                                if (var10.field2691 > var10.field2611 - var10.field2605) {
                                    var10.field2691 = var10.field2611 - var10.field2605;
                                }
                                if (var10.field2691 < 0) {
                                    var10.field2691 = 0;
                                }
                            }
                            method1590(arg0, var10.field2595, var19, var20, var21, var22, var12 - var10.field2608, var13 - var10.field2691, var11);
                            if (var10.field2703 != null) {
                                method1590(var10.field2703, var10.field2595, var19, var20, var21, var22, var12 - var10.field2608, var13 - var10.field2691, var11);
                            }
                            class4 var81 = (class4) field623.method3255((long) var10.field2595);
                            if (var81 != null) {
                                if (var81.field64 == 0 && class77.field1405 >= var19 && class77.field1394 >= var20 && class77.field1405 < var21 && class77.field1394 < var22 && !field724 && !field527) {
                                    field610[0] = class134.field2293;
                                    field611[0] = "";
                                    field550[0] = 1006;
                                    field605 = 1;
                                }
                                int var82 = var81.field66;
                                if (class158.method2630(var82)) {
                                    Statics.field381 = null;
                                    method1590(Statics.field2626[var82], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field381 != null) {
                                        method1590(Statics.field381, -1412584499, var19, var20, var21, var22, Statics.field15, Statics.field456, var11);
                                        Statics.field381 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var83 = 0; var83 < 100; var83++) {
                                        field604[var83] = true;
                                    }
                                } else {
                                    field604[var11] = true;
                                }
                            }
                            class89.method1741(arg2, arg3, arg4, arg5);
                            class104.method2087();
                        }
                        if (field667[var11] || field672 > 1) {
                            if (var10.field2597 == 0 && !var10.field2594 && var10.field2611 > var10.field2605) {
                                method103(var10.field2637 + var12, var13, var10.field2691, var10.field2605, var10.field2611);
                            }
                            if (var10.field2597 != 1) {
                                if (var10.field2597 == 2) {
                                    int var84 = 0;
                                    for (int var85 = 0; var85 < var10.field2605; var85++) {
                                        for (int var86 = 0; var86 < var10.field2637; var86++) {
                                            int var87 = (var10.field2648 + 32) * var86 + var12;
                                            int var88 = (var10.field2663 + 32) * var85 + var13;
                                            if (var84 < 20) {
                                                var87 += var10.field2650[var84];
                                                var88 += var10.field2652[var84];
                                            }
                                            if (var10.field2660[var84] > 0) {
                                                boolean var89 = false;
                                                boolean var90 = false;
                                                int var91 = var10.field2660[var84] - 1;
                                                if (var87 + 32 > arg2 && var87 < arg4 && var88 + 32 > arg3 && var88 < arg5 || Statics.field294 == var10 && field575 == var84) {
                                                    class86 var92;
                                                    if (field616 == 1 && Statics.field1041 == var84 && Statics.field1038 == var10.field2595) {
                                                        var92 = class40.method38(var91, var10.field2698[var84], 2, 0, false);
                                                    } else {
                                                        var92 = class40.method38(var91, var10.field2698[var84], 1, 3153952, false);
                                                    }
                                                    if (var92 == null) {
                                                        method62(var10);
                                                    } else if (Statics.field294 == var10 && field575 == var84) {
                                                        int var93 = class77.field1405 - field576;
                                                        int var94 = class77.field1394 - field577;
                                                        if (var93 < 5 && var93 > -5) {
                                                            var93 = 0;
                                                        }
                                                        if (var94 < 5 && var94 > -5) {
                                                            var94 = 0;
                                                        }
                                                        if (field725 < 5) {
                                                            var93 = 0;
                                                            var94 = 0;
                                                        }
                                                        var92.method1651(var87 + var93, var88 + var94, 128);
                                                        if (arg1 != -1) {
                                                            class158 var95 = arg0[arg1 & 0xFFFF];
                                                            if (var88 + var94 < class89.field1482 && var95.field2691 > 0) {
                                                                int var96 = field540 * (class89.field1482 - var88 - var94) / 3;
                                                                if (var96 > field540 * 10) {
                                                                    var96 = field540 * 10;
                                                                }
                                                                if (var96 > var95.field2691) {
                                                                    var96 = var95.field2691;
                                                                }
                                                                var95.field2691 -= var96;
                                                                field577 += var96;
                                                                method62(var95);
                                                            }
                                                            if (var88 + var94 + 32 > class89.field1483 && var95.field2691 < var95.field2611 - var95.field2605) {
                                                                int var97 = field540 * (var88 + var94 + 32 - class89.field1483) / 3;
                                                                if (var97 > field540 * 10) {
                                                                    var97 = field540 * 10;
                                                                }
                                                                if (var97 > var95.field2611 - var95.field2605 - var95.field2691) {
                                                                    var97 = var95.field2611 - var95.field2605 - var95.field2691;
                                                                }
                                                                var95.field2691 += var97;
                                                                field577 -= var97;
                                                                method62(var95);
                                                            }
                                                        }
                                                    } else if (Statics.field2027 == var10 && field574 == var84) {
                                                        var92.method1651(var87, var88, 128);
                                                    } else {
                                                        var92.method1646(var87, var88);
                                                    }
                                                }
                                            } else if (var10.field2697 != null && var84 < 20) {
                                                class86 var98 = var10.method3070(var84);
                                                if (var98 != null) {
                                                    var98.method1646(var87, var88);
                                                } else if (class158.field2593) {
                                                    method62(var10);
                                                }
                                            }
                                            var84++;
                                        }
                                    }
                                } else if (var10.field2597 == 3) {
                                    int var99;
                                    if (method34(var10)) {
                                        var99 = var10.field2613;
                                        if (Statics.field1318 == var10 && var10.field2615 != 0) {
                                            var99 = var10.field2615;
                                        }
                                    } else {
                                        var99 = var10.field2607;
                                        if (Statics.field1318 == var10 && var10.field2614 != 0) {
                                            var99 = var10.field2614;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2670) {
                                            class89.method1748(var12, var13, var10.field2637, var10.field2605, var99);
                                        } else {
                                            class89.method1759(var12, var13, var10.field2637, var10.field2605, var99);
                                        }
                                    } else if (var10.field2670) {
                                        class89.method1745(var12, var13, var10.field2637, var10.field2605, var99, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1749(var12, var13, var10.field2637, var10.field2605, var99, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2597 == 4) {
                                    class183 var100 = var10.method3073();
                                    if (var100 != null) {
                                        String var101 = var10.field2642;
                                        int var102;
                                        if (method34(var10)) {
                                            var102 = var10.field2613;
                                            if (Statics.field1318 == var10 && var10.field2615 != 0) {
                                                var102 = var10.field2615;
                                            }
                                            if (var10.field2643.length() > 0) {
                                                var101 = var10.field2643;
                                            }
                                        } else {
                                            var102 = var10.field2607;
                                            if (Statics.field1318 == var10 && var10.field2614 != 0) {
                                                var102 = var10.field2614;
                                            }
                                        }
                                        if (var10.field2594 && var10.field2706 != -1) {
                                            class40 var103 = class40.method211(var10.field2706);
                                            var101 = var103.field984;
                                            if (var101 == null) {
                                                var101 = "null";
                                            }
                                            if ((var103.field982 == 1 || var10.field2636 != 1) && var10.field2636 != -1) {
                                                var101 = class2.method1521(16748608) + var101 + class2.field36 + " " + 'x' + method228(var10.field2636);
                                            }
                                        }
                                        if (field459 == var10) {
                                            class134 var10000 = (class134) null;
                                            var101 = class134.field2227;
                                            var102 = var10.field2607;
                                        }
                                        if (!var10.field2594) {
                                            var101 = method1508(var101, var10);
                                        }
                                        var100.method3351(var101, var12, var13, var10.field2637, var10.field2605, var102, var10.field2647 ? 0 : -1, var10.field2589, var10.field2609, var10.field2644);
                                    } else if (class158.field2593) {
                                        method62(var10);
                                    }
                                } else if (var10.field2597 == 5) {
                                    if (var10.field2594) {
                                        class86 var105;
                                        if (var10.field2706 == -1) {
                                            var105 = var10.method3112(false);
                                        } else {
                                            var105 = class40.method38(var10.field2706, var10.field2636, var10.field2623, var10.field2624, false);
                                        }
                                        if (var105 != null) {
                                            int var106 = var105.field1462;
                                            int var107 = var105.field1464;
                                            if (var10.field2622) {
                                                class89.method1790(var12, var13, var10.field2637 + var12, var10.field2605 + var13);
                                                int var108 = (var10.field2637 + (var106 - 1)) / var106;
                                                int var109 = (var10.field2605 + (var107 - 1)) / var107;
                                                for (int var110 = 0; var110 < var108; var110++) {
                                                    for (int var111 = 0; var111 < var109; var111++) {
                                                        if (var10.field2621 != 0) {
                                                            var105.method1657(var106 / 2 + var106 * var110 + var12, var107 / 2 + var107 * var111 + var13, var10.field2621, 4096);
                                                        } else if (var14 == 0) {
                                                            var105.method1646(var106 * var110 + var12, var107 * var111 + var13);
                                                        } else {
                                                            var105.method1651(var106 * var110 + var12, var107 * var111 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1741(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var112 = var10.field2637 * 4096 / var106;
                                                if (var10.field2621 != 0) {
                                                    var105.method1657(var10.field2637 / 2 + var12, var10.field2605 / 2 + var13, var10.field2621, var112);
                                                } else if (var14 != 0) {
                                                    var105.method1653(var12, var13, var10.field2637, var10.field2605, 256 - (var14 & 0xFF));
                                                } else if (var10.field2637 == var106 && var10.field2605 == var107) {
                                                    var105.method1646(var12, var13);
                                                } else {
                                                    var105.method1648(var12, var13, var10.field2637, var10.field2605);
                                                }
                                            }
                                        } else if (class158.field2593) {
                                            method62(var10);
                                        }
                                    } else {
                                        class86 var104 = var10.method3112(method34(var10));
                                        if (var104 != null) {
                                            var104.method1646(var12, var13);
                                        } else if (class158.field2593) {
                                            method62(var10);
                                        }
                                    }
                                } else if (var10.field2597 == 6) {
                                    boolean var113 = method34(var10);
                                    int var114;
                                    if (var113) {
                                        var114 = var10.field2632;
                                    } else {
                                        var114 = var10.field2616;
                                    }
                                    class112 var115 = null;
                                    int var116 = 0;
                                    if (var10.field2706 != -1) {
                                        class40 var117 = class40.method211(var10.field2706);
                                        if (var117 != null) {
                                            class40 var118 = var117.method817(var10.field2636);
                                            var115 = var118.method816(1);
                                            if (var115 == null) {
                                                method62(var10);
                                            } else {
                                                var115.method2190();
                                                var116 = var115.field1545 / 2;
                                            }
                                        }
                                    } else if (var10.field2627 == 5) {
                                        if (var10.field2686 == 0) {
                                            var115 = field720.method3135((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var115 = Statics.field2319.method18();
                                        }
                                    } else if (var114 == -1) {
                                        var115 = var10.method3071((class34) null, -1, var113, Statics.field2319.field40);
                                        if (var115 == null && class158.field2593) {
                                            method62(var10);
                                        }
                                    } else {
                                        class34 var119 = class34.method136(var114);
                                        var115 = var10.method3071(var119, var10.field2653, var113, Statics.field2319.field40);
                                        if (var115 == null && class158.field2593) {
                                            method62(var10);
                                        }
                                    }
                                    class104.method2090(var10.field2637 / 2 + var12, var10.field2605 / 2 + var13);
                                    int var120 = var10.field2638 * class104.field1776[var10.field2635] >> 16;
                                    int var121 = var10.field2638 * class104.field1771[var10.field2635] >> 16;
                                    if (var115 != null) {
                                        if (var10.field2594) {
                                            var115.method2190();
                                            if (var10.field2640) {
                                                var115.method2203(0, var10.field2689, var10.field2683, var10.field2635, var10.field2633, var10.field2634 + var116 + var120, var10.field2634 + var121, var10.field2638);
                                            } else {
                                                var115.method2202(0, var10.field2689, var10.field2683, var10.field2635, var10.field2633, var10.field2634 + var116 + var120, var10.field2634 + var121);
                                            }
                                        } else {
                                            var115.method2202(0, var10.field2689, 0, var10.field2635, 0, var120, var121);
                                        }
                                    }
                                    class104.method2089();
                                } else {
                                    if (var10.field2597 == 7) {
                                        class183 var122 = var10.method3073();
                                        if (var122 == null) {
                                            if (class158.field2593) {
                                                method62(var10);
                                            }
                                            continue;
                                        }
                                        int var123 = 0;
                                        for (int var124 = 0; var124 < var10.field2605; var124++) {
                                            for (int var125 = 0; var125 < var10.field2637; var125++) {
                                                if (var10.field2660[var123] > 0) {
                                                    class40 var126 = class40.method211(var10.field2660[var123] - 1);
                                                    String var127;
                                                    if (var126.field982 != 1 && var10.field2698[var123] == 1) {
                                                        var127 = class2.method1521(16748608) + var126.field984 + class2.field36;
                                                    } else {
                                                        var127 = class2.method1521(16748608) + var126.field984 + class2.field36 + " " + 'x' + method228(var10.field2698[var123]);
                                                    }
                                                    int var128 = (var10.field2648 + 115) * var125 + var12;
                                                    int var129 = (var10.field2663 + 12) * var124 + var13;
                                                    if (var10.field2589 == 0) {
                                                        var122.method3348(var127, var128, var129, var10.field2607, var10.field2647 ? 0 : -1);
                                                    } else if (var10.field2589 == 1) {
                                                        var122.method3365(var127, var10.field2637 / 2 + var128, var129, var10.field2607, var10.field2647 ? 0 : -1);
                                                    } else {
                                                        var122.method3379(var127, var10.field2637 + var128 - 1, var129, var10.field2607, var10.field2647 ? 0 : -1);
                                                    }
                                                }
                                                var123++;
                                            }
                                        }
                                    }
                                    if (var10.field2597 == 8 && Statics.field120 == var10 && field615 == field556) {
                                        int var130 = 0;
                                        int var131 = 0;
                                        class183 var132 = Statics.field180;
                                        String var133 = var10.field2642;
                                        String var134 = method1508(var133, var10);
                                        while (var134.length() > 0) {
                                            int var135 = var134.indexOf(class2.field27);
                                            String var136;
                                            if (var135 == -1) {
                                                var136 = var134;
                                                var134 = "";
                                            } else {
                                                var136 = var134.substring(0, var135);
                                                var134 = var134.substring(var135 + 4);
                                            }
                                            int var137 = var132.method3343(var136);
                                            if (var137 > var130) {
                                                var130 = var137;
                                            }
                                            var131 += var132.field2839 + 1;
                                        }
                                        var130 += 6;
                                        var131 += 7;
                                        int var138 = var10.field2637 + var12 - 5 - var130;
                                        int var139 = var10.field2605 + var13 + 5;
                                        if (var138 < var12 + 5) {
                                            var138 = var12 + 5;
                                        }
                                        if (var130 + var138 > arg4) {
                                            var138 = arg4 - var130;
                                        }
                                        if (var131 + var139 > arg5) {
                                            var139 = arg5 - var131;
                                        }
                                        class89.method1748(var138, var139, var130, var131, 16777120);
                                        class89.method1759(var138, var139, var130, var131, 0);
                                        String var140 = var10.field2642;
                                        int var141 = var132.field2839 + var139 + 2;
                                        String var142 = method1508(var140, var10);
                                        while (var142.length() > 0) {
                                            int var143 = var142.indexOf(class2.field27);
                                            String var144;
                                            if (var143 == -1) {
                                                var144 = var142;
                                                var142 = "";
                                            } else {
                                                var144 = var142.substring(0, var143);
                                                var142 = var142.substring(var143 + 4);
                                            }
                                            var132.method3348(var144, var138 + 3, var141, 0, -1);
                                            var141 += var132.field2839 + 1;
                                        }
                                    }
                                    if (var10.field2597 == 9) {
                                        if (var10.field2618 == 1) {
                                            class89.method1754(var12, var13, var10.field2637 + var12, var10.field2605 + var13, var10.field2607);
                                        } else {
                                            int var145 = var10.field2637 >= 0 ? var10.field2637 : -var10.field2637;
                                            int var146 = var10.field2605 >= 0 ? var10.field2605 : -var10.field2605;
                                            int var147 = var145;
                                            if (var145 < var146) {
                                                var147 = var146;
                                            }
                                            if (var147 != 0) {
                                                int var148 = (var10.field2637 << 16) / var147;
                                                int var149 = (var10.field2605 << 16) / var147;
                                                if (var149 <= var148) {
                                                    var148 = -var148;
                                                } else {
                                                    var149 = -var149;
                                                }
                                                int var150 = var10.field2618 * var149 >> 17;
                                                int var151 = var10.field2618 * var149 + 1 >> 17;
                                                int var152 = var10.field2618 * var148 >> 17;
                                                int var153 = var10.field2618 * var148 + 1 >> 17;
                                                int var154 = var12 + var150;
                                                int var155 = var12 - var151;
                                                int var156 = var10.field2637 + var12 - var151;
                                                int var157 = var10.field2637 + var12 + var150;
                                                int var158 = var13 + var152;
                                                int var159 = var13 - var153;
                                                int var160 = var10.field2605 + var13 - var153;
                                                int var161 = var10.field2605 + var13 + var152;
                                                class104.method2095(var154, var155, var156);
                                                class104.method2098(var158, var159, var160, var154, var155, var156, var10.field2607);
                                                class104.method2095(var154, var156, var157);
                                                class104.method2098(var158, var160, var161, var154, var156, var157, var10.field2607);
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

    @ObfuscatedName("bg.cy(Ljava/lang/String;Lfa;B)Ljava/lang/String;")
    public static String method1508(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method140(method188(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field733 != null) {
                    var5 = class147.method2632(Statics.field733.field1413);
                    if (Statics.field733.field1416 != null) {
                        var5 = (String) Statics.field733.field1416;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("j.cs(II)Ljava/lang/String;")
    public static final String method228(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field22 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method1521(65408) + var1.substring(0, var1.length() - 8) + class134.field2230 + " " + class2.field26 + var1 + class2.field25 + class2.field36;
        } else if (var1.length() > 6) {
            return " " + class2.method1521(16777215) + var1.substring(0, var1.length() - 4) + class134.field2090 + " " + class2.field26 + var1 + class2.field25 + class2.field36;
        } else {
            return " " + class2.method1521(16776960) + var1 + class2.field36;
        }
    }

    @ObfuscatedName("z.co(Lfa;IIIIIIB)V")
    public static final void method141(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field519) {
            field598 = 32;
        } else {
            field598 = 0;
        }
        field519 = false;
        if (class77.field1392 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2691 -= 4;
                method62(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2691 += 4;
                method62(arg0);
            } else if (arg5 >= arg1 - field598 && arg5 < field598 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2691 = (arg4 - arg3) * var8 / var9;
                method62(arg0);
                field519 = true;
            }
        }
        if (field496 == 0) {
            return;
        }
        int var10 = arg0.field2637;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2691 += field496 * 45;
            method62(arg0);
        }
    }

    @ObfuscatedName("k.cv(IIIIII)V")
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field273[0].method1734(arg0, arg1);
        Statics.field273[1].method1734(arg0, arg1 + arg3 - 16);
        class89.method1748(arg0, arg1 + 16, 16, arg3 - 32, field541);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1748(arg0, arg1 + 16 + var6, 16, var5, field571);
        class89.method1768(arg0, arg1 + 16 + var6, var5, field544);
        class89.method1768(arg0 + 1, arg1 + 16 + var6, var5, field544);
        class89.method1750(arg0, arg1 + 16 + var6, 16, field544);
        class89.method1750(arg0, arg1 + 17 + var6, 16, field544);
        class89.method1768(arg0 + 15, arg1 + 16 + var6, var5, field640);
        class89.method1768(arg0 + 14, arg1 + 17 + var6, var5 - 1, field640);
        class89.method1750(arg0, arg1 + 15 + var6 + var5, 16, field640);
        class89.method1750(arg0 + 1, arg1 + 14 + var6 + var5, 15, field640);
    }

    @ObfuscatedName("x.ck(II)Ljava/lang/String;")
    public static final String method140(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("t.cj(Lfa;I)Z")
    public static final boolean method34(class158 arg0) {
        if (arg0.field2692 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2692.length; var1++) {
            int var2 = method188(arg0, var1);
            int var3 = arg0.field2693[var1];
            if (arg0.field2692[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2692[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2692[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("e.cp(Lfa;II)I")
    public static final int method188(class158 arg0, int arg1) {
        if (arg0.field2665 == null || arg1 >= arg0.field2665.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2665[arg1];
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
                    var7 = field552[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field601[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field503[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method3027(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method211(var12).field997 || field471)) {
                        for (int var13 = 0; var13 < var11.field2660.length; var13++) {
                            if (var12 + 1 == var11.field2660[var13]) {
                                var7 += var11.field2698[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2715[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2045[field601[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2715[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2319.field43;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2043[var14]) {
                            var7 += field601[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method3027(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method211(var18).field997 || field471)) {
                        for (int var19 = 0; var19 < var17.field2660.length; var19++) {
                            if (var18 + 1 == var17.field2660[var19]) {
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
                    int var20 = class159.field2715[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = Statics.method2894(var22);
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
                    var7 = (Statics.field2319.field420 >> 7) + Statics.field751;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2319.field400 >> 7) + Statics.field1920;
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

    @ObfuscatedName("df.cx(Lfa;III)V")
    public static final void method2384(class158 arg0, int arg1, int arg2) {
        if (arg0.field2695 == 1) {
            method3077(arg0.field2696, "", 24, 0, 0, arg0.field2595);
        }
        if (arg0.field2695 == 2 && !field618) {
            int var3 = method2685(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2661 == null || arg0.field2661.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2661;
            }
            if (var5 != null) {
                method3077(var5, class2.method1521(65280) + arg0.field2628, 25, 0, -1, arg0.field2595);
            }
        }
        if (arg0.field2695 == 3) {
            method3077(class134.field2228, "", 26, 0, 0, arg0.field2595);
        }
        if (arg0.field2695 == 4) {
            method3077(arg0.field2696, "", 28, 0, 0, arg0.field2595);
        }
        if (arg0.field2695 == 5) {
            method3077(arg0.field2696, "", 29, 0, 0, arg0.field2595);
        }
        if (arg0.field2695 == 6 && field459 == null) {
            method3077(arg0.field2696, "", 30, 0, -1, arg0.field2595);
        }
        if (arg0.field2597 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2605; var8++) {
                for (int var9 = 0; var9 < arg0.field2637; var9++) {
                    int var10 = (arg0.field2648 + 32) * var9;
                    int var11 = (arg0.field2663 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2650[var7];
                        var11 += arg0.field2652[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field674 = var7;
                        Statics.field1263 = arg0;
                        if (arg0.field2660[var7] > 0) {
                            class40 var12 = class40.method211(arg0.field2660[var7] - 1);
                            if (field616 == 1 && class162.method203(method2685(arg0))) {
                                if (Statics.field1038 != arg0.field2595 || Statics.field1041 != var7) {
                                    method3077(class134.field2219, field617 + " " + class2.field24 + " " + class2.method1521(16748608) + var12.field984, 31, var12.field1010, var7, arg0.field2595);
                                }
                            } else if (!field618 || !class162.method203(method2685(arg0))) {
                                String[] var13 = var12.field998;
                                if (field624) {
                                    var13 = method229(var13);
                                }
                                if (class162.method203(method2685(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method3077(var13[var14], class2.method1521(16748608) + var12.field984, var15, var12.field1010, var7, arg0.field2595);
                                        } else if (var14 == 4) {
                                            method3077(class134.field2271, class2.method1521(16748608) + var12.field984, 37, var12.field1010, var7, arg0.field2595);
                                        }
                                    }
                                }
                                int var16 = method2685(arg0);
                                boolean var17 = (var16 >> 31 & 0x1) != 0;
                                if (var17) {
                                    method3077(class134.field2219, class2.method1521(16748608) + var12.field984, 38, var12.field1010, var7, arg0.field2595);
                                }
                                class162 var10000 = (class162) null;
                                if (class162.method203(method2685(arg0)) && var13 != null) {
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
                                            method3077(var13[var18], class2.method1521(16748608) + var12.field984, var19, var12.field1010, var7, arg0.field2595);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2620;
                                if (field624) {
                                    var20 = method229(var20);
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
                                            method3077(var20[var21], class2.method1521(16748608) + var12.field984, var22, var12.field1010, var7, arg0.field2595);
                                        }
                                    }
                                }
                                method3077(class134.field2220, class2.method1521(16748608) + var12.field984, 1005, var12.field1010, var7, arg0.field2595);
                            } else if ((Statics.field33 & 0x10) == 16) {
                                method3077(field620, field621 + " " + class2.field24 + " " + class2.method1521(16748608) + var12.field984, 32, var12.field1010, var7, arg0.field2595);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2594) {
            return;
        }
        if (field618) {
            int var23 = method2685(arg0);
            boolean var24 = (var23 >> 21 & 0x1) != 0;
            if (var24 && (Statics.field33 & 0x20) == 32) {
                method3077(field620, field621 + " " + class2.field24 + " " + arg0.field2655, 58, 0, arg0.field2596, arg0.field2595);
            }
            return;
        }
        for (int var25 = 9; var25 >= 5; var25--) {
            int var26 = method2685(arg0);
            boolean var27 = (var26 >> var25 + 1 & 0x1) != 0;
            String var28;
            if (!var27 && arg0.field2682 == null) {
                var28 = null;
            } else if (arg0.field2656 == null || arg0.field2656.length <= var25 || arg0.field2656[var25] == null || arg0.field2656[var25].trim().length() == 0) {
                var28 = null;
            } else {
                var28 = arg0.field2656[var25];
            }
            if (var28 != null) {
                method3077(var28, arg0.field2655, 1007, var25 + 1, arg0.field2596, arg0.field2595);
            }
        }
        int var30 = method2685(arg0);
        int var31 = var30 >> 11 & 0x3F;
        String var32;
        if (var31 == 0) {
            var32 = null;
        } else if (arg0.field2661 == null || arg0.field2661.trim().length() == 0) {
            var32 = null;
        } else {
            var32 = arg0.field2661;
        }
        if (var32 != null) {
            method3077(var32, arg0.field2655, 25, 0, arg0.field2596, arg0.field2595);
        }
        for (int var34 = 4; var34 >= 0; var34--) {
            int var35 = method2685(arg0);
            boolean var36 = (var35 >> var34 + 1 & 0x1) != 0;
            String var37;
            if (!var36 && arg0.field2682 == null) {
                var37 = null;
            } else if (arg0.field2656 == null || arg0.field2656.length <= var34 || arg0.field2656[var34] == null || arg0.field2656[var34].trim().length() == 0) {
                var37 = null;
            } else {
                var37 = arg0.field2656[var34];
            }
            if (var37 != null) {
                method3077(var37, arg0.field2655, 57, var34 + 1, arg0.field2596, arg0.field2595);
            }
        }
        if (class162.method1353(method2685(arg0))) {
            method3077(class134.field2280, "", 30, 0, arg0.field2596, arg0.field2595);
        }
    }

    @ObfuscatedName("ak.cm([Lfa;IIIIIIII)V")
    public static final void method728(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2594 || var9.field2597 == 0 || var9.field2662 || method2685(var9) != 0 || field634 == var9) && var9.field2606 == arg1 && (!var9.field2594 || !method37(var9))) {
                int var10 = var9.field2600 + arg6;
                int var11 = var9.field2702 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2597 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2597 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2637 + var10;
                    int var19 = var9.field2605 + var11;
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
                    int var22 = var9.field2637 + var10;
                    int var23 = var9.field2605 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field633 == var9) {
                    field641 = true;
                    field490 = var10;
                    field643 = var11;
                }
                if (!var9.field2594 || var12 < var14 && var13 < var15) {
                    if (var9.field2599 == 1337) {
                        method62(var9);
                    } else if (var9.field2599 == 1338) {
                        method150(var10, var11);
                    } else {
                        if (var9.field2597 == 0) {
                            if (!var9.field2594 && method37(var9) && Statics.field1318 != var9) {
                                continue;
                            }
                            method728(arg0, var9.field2595, var12, var13, var14, var15, var10 - var9.field2608, var11 - var9.field2691);
                            if (var9.field2703 != null) {
                                method728(var9.field2703, var9.field2595, var12, var13, var14, var15, var10 - var9.field2608, var11 - var9.field2691);
                            }
                            class4 var24 = (class4) field623.method3255((long) var9.field2595);
                            if (var24 != null) {
                                Statics.method1239(var24.field66, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2594) {
                            boolean var25;
                            if (class77.field1405 >= var12 && class77.field1394 >= var13 && class77.field1405 < var14 && class77.field1394 < var15) {
                                var25 = true;
                            } else {
                                var25 = false;
                            }
                            boolean var26 = false;
                            if (class77.field1392 == 1 && var25) {
                                var26 = true;
                            }
                            boolean var27 = false;
                            if (class77.field1399 == 1 && class77.field1400 >= var12 && class77.field1393 >= var13 && class77.field1400 < var14 && class77.field1393 < var15) {
                                var27 = true;
                            }
                            if (var27) {
                                method1631(var9, class77.field1400 - var10, class77.field1393 - var11);
                            }
                            if (field633 != null && field633 != var9 && var25 && class162.method1377(method2685(var9))) {
                                field660 = var9;
                            }
                            if (field634 == var9) {
                                field638 = true;
                                field639 = var10;
                                field603 = var11;
                            }
                            if (var9.field2662) {
                                if (var25 && field496 != 0 && var9.field2699 != null) {
                                    class1 var28 = new class1();
                                    var28.field2 = var9;
                                    var28.field4 = field496;
                                    var28.field8 = var9.field2699;
                                    field599.method3273(var28);
                                }
                                if (field633 != null || Statics.field294 != null || field724) {
                                    var27 = false;
                                    var26 = false;
                                    var25 = false;
                                }
                                if (!var9.field2705 && var27) {
                                    var9.field2705 = true;
                                    if (var9.field2664 != null) {
                                        class1 var29 = new class1();
                                        var29.field2 = var9;
                                        var29.field3 = class77.field1400 - var10;
                                        var29.field4 = class77.field1393 - var11;
                                        var29.field8 = var9.field2664;
                                        field599.method3273(var29);
                                    }
                                }
                                if (var9.field2705 && var26 && var9.field2598 != null) {
                                    class1 var30 = new class1();
                                    var30.field2 = var9;
                                    var30.field3 = class77.field1405 - var10;
                                    var30.field4 = class77.field1394 - var11;
                                    var30.field8 = var9.field2598;
                                    field599.method3273(var30);
                                }
                                if (var9.field2705 && !var26) {
                                    var9.field2705 = false;
                                    if (var9.field2617 != null) {
                                        class1 var31 = new class1();
                                        var31.field2 = var9;
                                        var31.field3 = class77.field1405 - var10;
                                        var31.field4 = class77.field1394 - var11;
                                        var31.field8 = var9.field2617;
                                        field661.method3273(var31);
                                    }
                                }
                                if (var26 && var9.field2667 != null) {
                                    class1 var32 = new class1();
                                    var32.field2 = var9;
                                    var32.field3 = class77.field1405 - var10;
                                    var32.field4 = class77.field1394 - var11;
                                    var32.field8 = var9.field2667;
                                    field599.method3273(var32);
                                }
                                if (!var9.field2704 && var25) {
                                    var9.field2704 = true;
                                    if (var9.field2668 != null) {
                                        class1 var33 = new class1();
                                        var33.field2 = var9;
                                        var33.field3 = class77.field1405 - var10;
                                        var33.field4 = class77.field1394 - var11;
                                        var33.field8 = var9.field2668;
                                        field599.method3273(var33);
                                    }
                                }
                                if (var9.field2704 && var25 && var9.field2669 != null) {
                                    class1 var34 = new class1();
                                    var34.field2 = var9;
                                    var34.field3 = class77.field1405 - var10;
                                    var34.field4 = class77.field1394 - var11;
                                    var34.field8 = var9.field2669;
                                    field599.method3273(var34);
                                }
                                if (var9.field2704 && !var25) {
                                    var9.field2704 = false;
                                    if (var9.field2649 != null) {
                                        class1 var35 = new class1();
                                        var35.field2 = var9;
                                        var35.field3 = class77.field1405 - var10;
                                        var35.field4 = class77.field1394 - var11;
                                        var35.field8 = var9.field2649;
                                        field661.method3273(var35);
                                    }
                                }
                                if (var9.field2681 != null) {
                                    class1 var36 = new class1();
                                    var36.field2 = var9;
                                    var36.field8 = var9.field2681;
                                    field508.method3273(var36);
                                }
                                if (var9.field2675 != null && field647 > var9.field2707) {
                                    if (var9.field2654 == null || field647 - var9.field2707 > 32) {
                                        class1 var41 = new class1();
                                        var41.field2 = var9;
                                        var41.field8 = var9.field2675;
                                        field599.method3273(var41);
                                    } else {
                                        label378: for (int var37 = var9.field2707; var37 < field647; var37++) {
                                            int var38 = field646[var37 & 0x1F];
                                            for (int var39 = 0; var39 < var9.field2654.length; var39++) {
                                                if (var9.field2654[var39] == var38) {
                                                    class1 var40 = new class1();
                                                    var40.field2 = var9;
                                                    var40.field8 = var9.field2675;
                                                    field599.method3273(var40);
                                                    break label378;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2707 = field647;
                                }
                                if (var9.field2677 != null && field649 > var9.field2708) {
                                    if (var9.field2678 == null || field649 - var9.field2708 > 32) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field8 = var9.field2677;
                                        field599.method3273(var46);
                                    } else {
                                        label358: for (int var42 = var9.field2708; var42 < field649; var42++) {
                                            int var43 = field586[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2678.length; var44++) {
                                                if (var9.field2678[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field2 = var9;
                                                    var45.field8 = var9.field2677;
                                                    field599.method3273(var45);
                                                    break label358;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2708 = field649;
                                }
                                if (var9.field2679 != null && field523 > var9.field2709) {
                                    if (var9.field2680 == null || field523 - var9.field2709 > 32) {
                                        class1 var51 = new class1();
                                        var51.field2 = var9;
                                        var51.field8 = var9.field2679;
                                        field599.method3273(var51);
                                    } else {
                                        label338: for (int var47 = var9.field2709; var47 < field523; var47++) {
                                            int var48 = field650[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2680.length; var49++) {
                                                if (var9.field2680[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field2 = var9;
                                                    var50.field8 = var9.field2679;
                                                    field599.method3273(var50);
                                                    break label338;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2709 = field523;
                                }
                                if (field632 > var9.field2658 && var9.field2684 != null) {
                                    class1 var52 = new class1();
                                    var52.field2 = var9;
                                    var52.field8 = var9.field2684;
                                    field599.method3273(var52);
                                }
                                if (field653 > var9.field2658 && var9.field2591 != null) {
                                    class1 var53 = new class1();
                                    var53.field2 = var9;
                                    var53.field8 = var9.field2591;
                                    field599.method3273(var53);
                                }
                                if (field654 > var9.field2658 && var9.field2687 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = var9;
                                    var54.field8 = var9.field2687;
                                    field599.method3273(var54);
                                }
                                if (field655 > var9.field2658 && var9.field2688 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field8 = var9.field2688;
                                    field599.method3273(var55);
                                }
                                var9.field2658 = field600;
                                if (var9.field2685 != null) {
                                    for (int var56 = 0; var56 < field683; var56++) {
                                        class1 var57 = new class1();
                                        var57.field2 = var9;
                                        var57.field17 = field664[var56];
                                        var57.field20 = field684[var56];
                                        var57.field8 = var9.field2685;
                                        field599.method3273(var57);
                                    }
                                }
                            }
                        }
                        if (!var9.field2594) {
                            if (field633 != null || Statics.field294 != null || field724) {
                                return;
                            }
                            if ((var9.field2701 >= 0 || var9.field2614 != 0) && class77.field1405 >= var12 && class77.field1394 >= var13 && class77.field1405 < var14 && class77.field1394 < var15) {
                                if (var9.field2701 >= 0) {
                                    Statics.field1318 = arg0[var9.field2701];
                                } else {
                                    Statics.field1318 = var9;
                                }
                            }
                            if (var9.field2597 == 8 && class77.field1405 >= var12 && class77.field1394 >= var13 && class77.field1405 < var14 && class77.field1394 < var15) {
                                Statics.field120 = var9;
                            }
                            if (var9.field2611 > var9.field2605) {
                                method141(var9, var9.field2637 + var10, var11, var9.field2605, var9.field2611, class77.field1405, class77.field1394);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("bg.cc(IIB)V")
    public static final void method1510(int arg0, int arg1) {
        if (class158.method2630(arg0)) {
            method2313(Statics.field2626[arg0], arg1);
        }
    }

    @ObfuscatedName("dm.cg([Lfa;IB)V")
    public static final void method2313(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2597 == 0) {
                    if (var3.field2703 != null) {
                        method2313(var3.field2703, arg1);
                    }
                    class4 var4 = (class4) field623.method3255((long) var3.field2595);
                    if (var4 != null) {
                        method1510(var4.field66, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2700 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field8 = var3.field2700;
                    class26.method1254(var5);
                }
                if (arg1 == 1 && var3.field2690 != null) {
                    if (var3.field2596 >= 0) {
                        class158 var6 = class158.method3027(var3.field2595);
                        if (var6 == null || var6.field2703 == null || var3.field2596 >= var6.field2703.length || var6.field2703[var3.field2596] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field8 = var3.field2690;
                    class26.method1254(var7);
                }
            }
        }
    }

    @ObfuscatedName("co.cq(Lfa;III)V")
    public static final void method1631(class158 arg0, int arg1, int arg2) {
        if (field633 != null || field724 || arg0 == null) {
            return;
        }
        class158 var3 = arg0;
        int var4 = class162.method2631(method2685(arg0));
        class158 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class158.method3027(var3.field2606);
                if (var3 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class158 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2657;
        }
        if (var7 == null) {
            return;
        }
        field633 = arg0;
        class158 var9 = arg0;
        int var10 = class162.method2631(method2685(arg0));
        class158 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class158.method3027(var9.field2606);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class158 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2657;
        }
        field634 = var13;
        field635 = arg1;
        field580 = arg2;
        Statics.field2478 = 0;
        field644 = false;
        return;
    }

    @ObfuscatedName("s.cw(Lfa;I)V")
    public static void method62(class158 arg0) {
        if (field480 == arg0.field2711) {
            field604[arg0.field2710] = true;
        }
    }

    @ObfuscatedName("g.cz(B)V")
    public static void method8() {
        for (class4 var0 = (class4) field623.method3257(); var0 != null; var0 = (class4) field623.method3258()) {
            int var1 = var0.field66;
            if (class158.method2630(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2626[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2594;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2818;
                    class158 var6 = class158.method3027(var5);
                    if (var6 != null) {
                        method62(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("j.cn([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method229(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("x.ch(II)V")
    public static final void method139(int arg0) {
        if (!class158.method2630(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2626[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2653 = 0;
                var3.field2631 = 0;
            }
        }
    }

    @ObfuscatedName("bi.ct(II)V")
    public static final void method1252(int arg0) {
        if (class158.method2630(arg0)) {
            Statics.method2(Statics.field2626[arg0], -1);
        }
    }

    @ObfuscatedName("al.ce(IB)V")
    public static final void method760(int arg0) {
        method8();
        for (class7 var1 = (class7) class7.field109.method3278(); var1 != null; var1 = (class7) class7.field109.method3280()) {
            if (var1.field103 != null) {
                var1.method58();
            }
        }
        int var2 = class42.method35(arg0).field1035;
        if (var2 == 0) {
            return;
        }
        int var3 = class159.field2715[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2092(0.9D);
                ((class110) Statics.field1773).method2171(0.9D);
            }
            if (var3 == 2) {
                class104.method2092(0.8D);
                ((class110) Statics.field1773).method2171(0.8D);
            }
            if (var3 == 3) {
                class104.method2092(0.7D);
                ((class110) Statics.field1773).method2171(0.7D);
            }
            if (var3 == 4) {
                class104.method2092(0.6D);
                ((class110) Statics.field1773).method2171(0.6D);
            }
            Statics.method1999();
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
            if (field532 != var4) {
                if (field532 == 0 && field698 != -1) {
                    class138.method574(Statics.field1512, field698, 0, var4, false);
                    field699 = false;
                } else if (var4 == 0) {
                    class138.method138();
                    field699 = false;
                } else {
                    class138.method1620(var4);
                }
                field532 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field700 = 127;
            }
            if (var3 == 1) {
                field700 = 96;
            }
            if (var3 == 2) {
                field700 = 64;
            }
            if (var3 == 3) {
                field700 = 32;
            }
            if (var3 == 4) {
                field700 = 0;
            }
        }
        if (var2 == 5) {
            field675 = var3;
        }
        if (var2 == 6) {
            field710 = var3;
        }
        if (var2 == 9) {
            field670 = var3;
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

    @ObfuscatedName("aq.cl(Lfa;B)V")
    public static final void method525(class158 arg0) {
        int var1 = arg0.field2599;
        if (var1 == 324) {
            if (field721 == -1) {
                field721 = arg0.field2619;
                field713 = arg0.field2592;
            }
            if (field720.field2738) {
                arg0.field2619 = field721;
            } else {
                arg0.field2619 = field713;
            }
        } else if (var1 == 325) {
            if (field721 == -1) {
                field721 = arg0.field2619;
                field713 = arg0.field2592;
            }
            if (field720.field2738) {
                arg0.field2619 = field713;
            } else {
                arg0.field2619 = field721;
            }
        } else if (var1 == 327) {
            arg0.field2635 = 150;
            arg0.field2689 = (int) (Math.sin((double) field472 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2627 = 5;
            arg0.field2686 = 0;
        } else if (var1 == 328) {
            arg0.field2635 = 150;
            arg0.field2689 = (int) (Math.sin((double) field472 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2627 = 5;
            arg0.field2686 = 1;
        }
    }

    @ObfuscatedName("l.cu(IIII)Lt;")
    public static final class4 method131(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field66 = arg1;
        var3.field64 = arg2;
        field623.method3268(var3, (long) arg0);
        method139(arg1);
        class26.method809(arg1);
        class158 var4 = class158.method3027(arg0);
        if (var4 != null) {
            method62(var4);
        }
        if (field459 != null) {
            method62(field459);
            field459 = null;
        }
        field724 = false;
        field605 = 0;
        method227(Statics.field1816, Statics.field2330, Statics.field908, Statics.field92);
        if (field622 != -1) {
            method1510(field622, 1);
        }
        return var3;
    }

    @ObfuscatedName("fm.di(Lt;ZB)V")
    public static final void method3318(class4 arg0, boolean arg1) {
        int var2 = arg0.field66;
        int var3 = (int) arg0.field2818;
        arg0.method3306();
        if (arg1 && var2 != -1 && Statics.field2025[var2]) {
            Statics.field1259.method2945(var2);
            if (Statics.field2626[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2626[var2].length; var5++) {
                    if (Statics.field2626[var2][var5] != null) {
                        if (Statics.field2626[var2][var5].field2597 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2626[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2626[var2] = null;
                }
                Statics.field2025[var2] = false;
            }
        }
        for (class171 var6 = (class171) field662.method3257(); var6 != null; var6 = (class171) field662.method3258()) {
            if ((var6.field2818 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3306();
            }
        }
        class158 var7 = class158.method3027(var3);
        if (var7 != null) {
            method62(var7);
        }
        field724 = false;
        field605 = 0;
        method227(Statics.field1816, Statics.field2330, Statics.field908, Statics.field92);
        if (field622 != -1) {
            method1510(field622, 1);
        }
    }

    @ObfuscatedName("m.dy(Lfa;B)Z")
    public static final boolean method109(class158 arg0) {
        int var1 = arg0.field2599;
        if (var1 == 205) {
            field545 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field720.method3144(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field720.method3141(var4, var5 == 1);
        }
        if (var1 == 324) {
            field720.method3132(false);
        }
        if (var1 == 325) {
            field720.method3132(true);
        }
        if (var1 == 326) {
            field501.method2265(62);
            field720.method3133(field501);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dr.dn(IIII)V")
    public static final void method2373(int arg0, int arg1, int arg2) {
        method5();
        class89.method1741(arg0, arg1, Statics.field280.field1470 + arg0, Statics.field280.field1473 + arg1);
        if (field696 == 2 || field696 == 5) {
            class89.method1775(arg0 + 25, arg1 + 5, 0, Statics.field2467, Statics.field864);
        } else {
            int var3 = field549 + field535 & 0x7FF;
            int var4 = Statics.field2319.field420 / 32 + 48;
            int var5 = 464 - Statics.field2319.field400 / 32;
            Statics.field1026.method1655(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field537 + 256, Statics.field2467, Statics.field864);
            for (int var6 = 0; var6 < field690; var6++) {
                int var7 = field458[var6] * 4 + 2 - Statics.field2319.field420 / 32;
                int var8 = field692[var6] * 4 + 2 - Statics.field2319.field400 / 32;
                method448(arg0, arg1, var7, var8, field693[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field596[Statics.field2034][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field2319.field420 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field2319.field400 / 32;
                        method448(arg0, arg1, var12, var13, Statics.field926[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field499; var14++) {
                class25 var15 = field559[field500[var14]];
                if (var15 != null && var15.method19()) {
                    class31 var16 = var15.field382;
                    if (var16 != null && var16.field789 != null) {
                        var16 = var16.method585();
                    }
                    if (var16 != null && var16.field780 && var16.field760) {
                        int var17 = var15.field420 / 32 - Statics.field2319.field420 / 32;
                        int var18 = var15.field400 / 32 - Statics.field2319.field400 / 32;
                        method448(arg0, arg1, var17, var18, Statics.field926[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field642; var19++) {
                class3 var20 = field582[field584[var19]];
                if (var20 != null && var20.method19()) {
                    int var21 = var20.field420 / 32 - Statics.field2319.field420 / 32;
                    int var22 = var20.field400 / 32 - Statics.field2319.field400 / 32;
                    boolean var23 = false;
                    if (method2163(var20.field52)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field2319.field57 != 0 && var20.field57 != 0 && Statics.field2319.field57 == var20.field57) {
                        var24 = true;
                    }
                    if (var23) {
                        method448(arg0, arg1, var21, var22, Statics.field926[3]);
                    } else if (var24) {
                        method448(arg0, arg1, var21, var22, Statics.field926[4]);
                    } else {
                        method448(arg0, arg1, var21, var22, Statics.field926[2]);
                    }
                }
            }
            if (field517 != 0 && field472 % 20 < 10) {
                if (field517 == 1 && field481 >= 0 && field481 < field559.length) {
                    class25 var25 = field559[field481];
                    if (var25 != null) {
                        int var26 = var25.field420 / 32 - Statics.field2319.field420 / 32;
                        int var27 = var25.field400 / 32 - Statics.field2319.field400 / 32;
                        method3111(arg0, arg1, var26, var27, Statics.field241[1]);
                    }
                }
                if (field517 == 2) {
                    int var28 = field483 * 4 - Statics.field751 * 4 + 2 - Statics.field2319.field420 / 32;
                    int var29 = field484 * 4 - Statics.field1920 * 4 + 2 - Statics.field2319.field400 / 32;
                    method3111(arg0, arg1, var28, var29, Statics.field241[1]);
                }
                if (field517 == 10 && field482 >= 0 && field482 < field582.length) {
                    class3 var30 = field582[field482];
                    if (var30 != null) {
                        int var31 = var30.field420 / 32 - Statics.field2319.field420 / 32;
                        int var32 = var30.field400 / 32 - Statics.field2319.field400 / 32;
                        method3111(arg0, arg1, var31, var32, Statics.field241[1]);
                    }
                }
            }
            if (field694 != 0) {
                int var33 = field694 * 4 + 2 - Statics.field2319.field420 / 32;
                int var34 = field695 * 4 + 2 - Statics.field2319.field400 / 32;
                method448(arg0, arg1, var33, var34, Statics.field241[0]);
            }
            class89.method1748(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field696 < 3) {
            Statics.field1516.method1655(arg0, arg1, 33, 33, 25, 25, field549, 256, Statics.field334, Statics.field1972);
        } else {
            class89.method1775(arg0, arg1, 0, Statics.field334, Statics.field1972);
        }
        if (field667[arg2]) {
            Statics.field280.method1734(arg0, arg1);
        }
        field666[arg2] = true;
    }

    @ObfuscatedName("fa.du(IIIILcv;B)V")
    public static final void method3111(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method448(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field549 + field535 & 0x7FF;
        int var7 = class104.field1776[var6];
        int var8 = class104.field1771[var6];
        int var9 = var7 * 256 / (field537 + 256);
        int var10 = var8 * 256 / (field537 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field2360.method1645(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("client.dg(IIIILcv;I)V")
    public static final void method448(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field549 + field535 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1776[var5];
        int var8 = class104.field1771[var5];
        int var9 = var7 * 256 / (field537 + 256);
        int var10 = var8 * 256 / (field537 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1702(Statics.field280, arg0 + 94 + var11 - arg4.field1462 / 2 + 4, arg1 + 83 - var12 - arg4.field1464 / 2 - 4);
        } else {
            arg4.method1646(arg0 + 94 + var11 - arg4.field1462 / 2 + 4, arg1 + 83 - var12 - arg4.field1464 / 2 - 4);
        }
    }

    @ObfuscatedName("ch.dv(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method2003(int arg0, String arg1, String arg2) {
        method1562(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cb.dj(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method1562(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field673[var4] = field673[var4 - 1];
            field685[var4] = field685[var4 - 1];
            field645[var4] = field645[var4 - 1];
            field542[var4] = field542[var4 - 1];
        }
        field673[0] = arg0;
        field685[0] = arg1;
        field645[0] = arg2;
        field542[0] = arg3;
        field691++;
        field632 = field600;
    }

    @ObfuscatedName("dn.dd(Ljava/lang/String;B)Z")
    public static boolean method2163(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method808(arg0, Statics.field464);
        for (int var2 = 0; var2 < field714; var2++) {
            if (var1.equalsIgnoreCase(class148.method808(field716[var2].field362, Statics.field464))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class148.method808(Statics.field2319.field52, Statics.field464))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dp.da(Ljava/lang/String;I)Z")
    public static boolean method2262(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class148.method808(arg0, Statics.field464);
        for (int var2 = 0; var2 < field712; var2++) {
            class11 var3 = field719[var2];
            if (var1.equalsIgnoreCase(class148.method808(var3.field178, Statics.field464))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class148.method808(var3.field177, Statics.field464))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("u.dp(Ljava/lang/String;I)V")
    public static final void method153(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field714 < 200 || field589 == 1) || field714 >= 200) {
            method2003(0, "", class134.field2235);
            return;
        }
        String var1 = class148.method808(arg0, Statics.field464);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field714; var2++) {
            class23 var3 = field716[var2];
            String var4 = class148.method808(var3.field362, Statics.field464);
            if (var4 != null && var4.equals(var1)) {
                method2003(0, "", arg0 + class134.field2093);
                return;
            }
            if (var3.field355 != null) {
                String var5 = class148.method808(var3.field355, Statics.field464);
                if (var5 != null && var5.equals(var1)) {
                    method2003(0, "", arg0 + class134.field2093);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field712; var6++) {
            class11 var7 = field719[var6];
            String var8 = class148.method808(var7.field178, Statics.field464);
            if (var8 != null && var8.equals(var1)) {
                method2003(0, "", class134.field2163 + arg0 + class134.field2242);
                return;
            }
            if (var7.field177 != null) {
                String var9 = class148.method808(var7.field177, Statics.field464);
                if (var9 != null && var9.equals(var1)) {
                    method2003(0, "", class134.field2163 + arg0 + class134.field2242);
                    return;
                }
            }
        }
        if (class148.method808(Statics.field2319.field52, Statics.field464).equals(var1)) {
            method2003(0, "", class134.field2239);
            return;
        }
        field501.method2265(106);
        class116 var10 = field501;
        int var11 = arg0.length() + 1;
        var10.method2386(var11);
        field501.method2574(arg0);
    }

    @ObfuscatedName("l.dh(Ljava/lang/String;I)V")
    public static final void method137(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class148.method808(arg0, Statics.field464);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field714; var2++) {
            class23 var3 = field716[var2];
            String var4 = var3.field362;
            String var5 = class148.method808(var4, Statics.field464);
            if (class136.method216(arg0, var1, var4, var5)) {
                field714--;
                for (int var6 = var2; var6 < field714; var6++) {
                    field716[var6] = field716[var6 + 1];
                }
                field653 = field600;
                field501.method2265(47);
                class116 var7 = field501;
                int var8 = arg0.length() + 1;
                var7.method2386(var8);
                field501.method2574(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("a.dc(Ljava/lang/String;II)V")
    public static final void method30(String arg0, int arg1) {
        field501.method2265(32);
        class116 var2 = field501;
        int var3 = arg0.length() + 1;
        var2.method2386(var3 + 1);
        field501.method2574(arg0);
        field501.method2453(arg1);
    }

    @ObfuscatedName("cm.dq(Ljava/lang/String;I)V")
    public static final void method1811(String arg0) {
        if (Statics.field192 == null) {
            return;
        }
        field501.method2265(56);
        class116 var1 = field501;
        int var2 = arg0.length() + 1;
        var1.method2386(var2);
        field501.method2574(arg0);
    }

    @ObfuscatedName("ew.ds(Lfa;I)I")
    public static int method2685(class158 arg0) {
        class171 var1 = (class171) field662.method3255(((long) arg0.field2595 << 32) + (long) arg0.field2596);
        return var1 == null ? arg0.field2610 : var1.field2802;
    }

    @ObfuscatedName("t.dm(Lfa;I)Z")
    public static boolean method37(class158 arg0) {
        if (field527) {
            if (method2685(arg0) != 0) {
                return false;
            }
            if (arg0.field2597 == 0) {
                return false;
            }
        }
        return arg0.field2601;
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.d")
    public static boolean field607 = true;

    @ObfuscatedName("client.o")
    public static int field657 = 1;

    @ObfuscatedName("client.a")
    public static int field456 = 0;

    @ObfuscatedName("client.w")
    public static class130[] field516 = new class130[4];

    @ObfuscatedName("client.m")
    public static int field458 = 0;

    @ObfuscatedName("client.e")
    public static boolean field460 = false;

    @ObfuscatedName("client.r")
    public static boolean field623 = false;

    @ObfuscatedName("client.n")
    public static int field654 = 0;

    @ObfuscatedName("client.c")
    public static int field693 = 0;

    @ObfuscatedName("client.v")
    public static boolean field464 = true;

    @ObfuscatedName("client.b")
    public static int field465 = 0;

    @ObfuscatedName("client.k")
    public static long field466 = -1L;

    @ObfuscatedName("client.f")
    public static int field467 = -1;

    @ObfuscatedName("client.h")
    public static int field468 = -1;

    @ObfuscatedName("client.j")
    public static int field690 = -1;

    @ObfuscatedName("client.q")
    public static boolean field552 = true;

    @ObfuscatedName("client.z")
    public static boolean field576 = false;

    @ObfuscatedName("client.af")
    public static int field472 = 0;

    @ObfuscatedName("client.ap")
    public static int field473 = 0;

    @ObfuscatedName("client.ah")
    public static int field474 = 0;

    @ObfuscatedName("client.at")
    public static int field529 = 0;

    @ObfuscatedName("client.aa")
    public static int field476 = 0;

    @ObfuscatedName("client.ae")
    public static int field477 = 0;

    @ObfuscatedName("client.aw")
    public static int field478 = 0;

    @ObfuscatedName("client.ar")
    public static int field479 = 0;

    @ObfuscatedName("client.ai")
    public static int field671 = 0;

    @ObfuscatedName("client.au")
    public static class127 field481 = new class127(new byte[5000]);

    @ObfuscatedName("client.al")
    public static int field553 = 0;

    @ObfuscatedName("client.aq")
    public static int field483 = 0;

    @ObfuscatedName("client.ag")
    public static int field544 = 0;

    @ObfuscatedName("client.bw")
    public static int field488 = 0;

    @ObfuscatedName("client.bx")
    public static int field519 = 0;

    @ObfuscatedName("client.bn")
    public static int field490 = 0;

    @ObfuscatedName("client.be")
    public static int field491 = 0;

    @ObfuscatedName("client.by")
    public static int field492 = 0;

    @ObfuscatedName("client.bc")
    public static class25[] field494 = new class25[32768];

    @ObfuscatedName("client.bm")
    public static int field495 = 0;

    @ObfuscatedName("client.bs")
    public static int[] field496 = new int[32768];

    @ObfuscatedName("client.cd")
    public static class116 field498 = new class116(5000);

    @ObfuscatedName("client.cb")
    public static class116 field499 = new class116(5000);

    @ObfuscatedName("client.cj")
    public static class116 field500 = new class116(5000);

    @ObfuscatedName("client.ce")
    public static int field533 = 0;

    @ObfuscatedName("client.cu")
    public static int field659 = 0;

    @ObfuscatedName("client.cz")
    public static int field503 = 0;

    @ObfuscatedName("client.cv")
    public static int field470 = 0;

    @ObfuscatedName("client.ct")
    public static int field577 = 0;

    @ObfuscatedName("client.ch")
    public static int field680 = 0;

    @ObfuscatedName("client.cg")
    public static int field507 = 0;

    @ObfuscatedName("client.ca")
    public static int field568 = 0;

    @ObfuscatedName("client.cx")
    public static boolean field509 = false;

    @ObfuscatedName("client.cp")
    public static int field631 = 0;

    @ObfuscatedName("client.cl")
    public static int field511 = 0;

    @ObfuscatedName("client.ci")
    public static int field512 = 1;

    @ObfuscatedName("client.cw")
    public static int field513 = 0;

    @ObfuscatedName("client.dg")
    public static int field514 = 1;

    @ObfuscatedName("client.df")
    public static int field505 = 0;

    @ObfuscatedName("client.da")
    public static boolean field517 = false;

    @ObfuscatedName("client.dq")
    public static int[][][] field626 = new int[4][13][13];

    @ObfuscatedName("client.dr")
    public static final int[] field489 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.db")
    public static int field520 = 0;

    @ObfuscatedName("client.dn")
    public static int field521 = 2;

    @ObfuscatedName("client.dz")
    public static int field522 = 0;

    @ObfuscatedName("client.dv")
    public static int field523 = 2;

    @ObfuscatedName("client.dk")
    public static int field524 = 0;

    @ObfuscatedName("client.du")
    public static int field525 = 1;

    @ObfuscatedName("client.dt")
    public static int field526 = 0;

    @ObfuscatedName("client.dy")
    public static int field527 = 0;

    @ObfuscatedName("client.ds")
    public static int field508 = 2;

    @ObfuscatedName("client.dw")
    public static int field501 = 0;

    @ObfuscatedName("client.do")
    public static int field615 = 1;

    @ObfuscatedName("client.dc")
    public static int field531 = 0;

    @ObfuscatedName("client.ea")
    public static int field532 = 0;

    @ObfuscatedName("client.ed")
    public static int field528 = 2301979;

    @ObfuscatedName("client.ei")
    public static int field534 = 5063219;

    @ObfuscatedName("client.ep")
    public static int field535 = 3353893;

    @ObfuscatedName("client.eh")
    public static int field536 = 7759444;

    @ObfuscatedName("client.eo")
    public static boolean field537 = false;

    @ObfuscatedName("client.eu")
    public static int field658 = 0;

    @ObfuscatedName("client.fw")
    public static int field539 = 128;

    @ObfuscatedName("client.fp")
    public static int field540 = 0;

    @ObfuscatedName("client.fc")
    public static int field541 = 0;

    @ObfuscatedName("client.fr")
    public static int field542 = 0;

    @ObfuscatedName("client.fl")
    public static int field543 = 0;

    @ObfuscatedName("client.fu")
    public static int field482 = 0;

    @ObfuscatedName("client.fv")
    public static int field605 = 0;

    @ObfuscatedName("client.fq")
    public static boolean field546 = false;

    @ObfuscatedName("client.fy")
    public static int field616 = 0;

    @ObfuscatedName("client.fa")
    public static int field502 = 0;

    @ObfuscatedName("client.fg")
    public static int field549 = 50;

    @ObfuscatedName("client.fe")
    public static int[] field550 = new int[field549];

    @ObfuscatedName("client.fd")
    public static int[] field689 = new int[field549];

    @ObfuscatedName("client.fb")
    public static int[] field480 = new int[field549];

    @ObfuscatedName("client.fm")
    public static int[] field452 = new int[field549];

    @ObfuscatedName("client.fh")
    public static int[] field554 = new int[field549];

    @ObfuscatedName("client.fn")
    public static int[] field555 = new int[field549];

    @ObfuscatedName("client.ff")
    public static int[] field556 = new int[field549];

    @ObfuscatedName("client.fj")
    public static String[] field557 = new String[field549];

    @ObfuscatedName("client.fo")
    public static int[][] field462 = new int[104][104];

    @ObfuscatedName("client.gg")
    public static int field559 = 0;

    @ObfuscatedName("client.gi")
    public static int field560 = -1;

    @ObfuscatedName("client.ga")
    public static int field561 = -1;

    @ObfuscatedName("client.gk")
    public static int field562 = 0;

    @ObfuscatedName("client.gw")
    public static int field563 = 0;

    @ObfuscatedName("client.gv")
    public static int field564 = 0;

    @ObfuscatedName("client.gp")
    public static int field565 = 0;

    @ObfuscatedName("client.go")
    public static int field518 = 0;

    @ObfuscatedName("client.ge")
    public static int field692 = 0;

    @ObfuscatedName("client.gn")
    public static int field569 = 0;

    @ObfuscatedName("client.gc")
    public static int field618 = 0;

    @ObfuscatedName("client.gu")
    public static int field571 = 0;

    @ObfuscatedName("client.gm")
    public static int field572 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field573 = false;

    @ObfuscatedName("client.gy")
    public static int field574 = 0;

    @ObfuscatedName("client.gl")
    public static int field575 = 0;

    @ObfuscatedName("client.gs")
    public static class3[] field506 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field570 = 0;

    @ObfuscatedName("client.gf")
    public static int[] field642 = new int[2048];

    @ObfuscatedName("client.gz")
    public static int field579 = 0;

    @ObfuscatedName("client.gt")
    public static int[] field630 = new int[2048];

    @ObfuscatedName("client.hr")
    public static class127[] field581 = new class127[2048];

    @ObfuscatedName("client.hb")
    public static int field646 = -1;

    @ObfuscatedName("client.hk")
    public static int field583 = 0;

    @ObfuscatedName("client.hj")
    public static int field637 = 0;

    @ObfuscatedName("client.hw")
    public static int[] field585 = new int[1000];

    @ObfuscatedName("client.hi")
    public static final int[] field586 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hn")
    public static String[] field622 = new String[8];

    @ObfuscatedName("client.hm")
    public static boolean[] field588 = new boolean[8];

    @ObfuscatedName("client.hz")
    public static int[] field589 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static class177[][][] field653 = new class177[4][104][104];

    @ObfuscatedName("client.hl")
    public static class177 field597 = new class177();

    @ObfuscatedName("client.hc")
    public static class177 field592 = new class177();

    @ObfuscatedName("client.hg")
    public static class177 field578 = new class177();

    @ObfuscatedName("client.hf")
    public static int[] field594 = new int[25];

    @ObfuscatedName("client.hp")
    public static int[] field595 = new int[25];

    @ObfuscatedName("client.hd")
    public static int[] field613 = new int[25];

    @ObfuscatedName("client.hu")
    public static int field655 = 0;

    @ObfuscatedName("client.hh")
    public static boolean field455 = false;

    @ObfuscatedName("client.io")
    public static int field471 = 0;

    @ObfuscatedName("client.ia")
    public static int[] field600 = new int[500];

    @ObfuscatedName("client.iy")
    public static int[] field601 = new int[500];

    @ObfuscatedName("client.ib")
    public static int[] field602 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field603 = new int[500];

    @ObfuscatedName("client.iu")
    public static String[] field604 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field599 = new String[500];

    @ObfuscatedName("client.ic")
    public static int field606 = -1;

    @ObfuscatedName("client.ig")
    public static int field685 = -1;

    @ObfuscatedName("client.il")
    public static int field635 = 0;

    @ObfuscatedName("client.ip")
    public static int field609 = 50;

    @ObfuscatedName("client.ij")
    public static int field672 = 0;

    @ObfuscatedName("client.ii")
    public static String field530 = null;

    @ObfuscatedName("client.it")
    public static boolean field612 = false;

    @ObfuscatedName("client.is")
    public static int field610 = -1;

    @ObfuscatedName("client.id")
    public static String field614 = null;

    @ObfuscatedName("client.in")
    public static String field715 = null;

    @ObfuscatedName("client.ie")
    public static int field711 = -1;

    @ObfuscatedName("client.ih")
    public static class175 field617 = new class175(8);

    @ObfuscatedName("client.jf")
    public static int field624 = 0;

    @ObfuscatedName("client.jo")
    public static int field619 = 0;

    @ObfuscatedName("client.jv")
    public static class159 field620 = null;

    @ObfuscatedName("client.jj")
    public static int field621 = 0;

    @ObfuscatedName("client.jd")
    public static int field584 = 0;

    @ObfuscatedName("client.jz")
    public static int field547 = 0;

    @ObfuscatedName("client.je")
    public static boolean field461 = false;

    @ObfuscatedName("client.jb")
    public static boolean field625 = false;

    @ObfuscatedName("client.jq")
    public static boolean field457 = false;

    @ObfuscatedName("client.jg")
    public static class159 field627 = null;

    @ObfuscatedName("client.jx")
    public static class159 field628 = null;

    @ObfuscatedName("client.jm")
    public static int field629 = 0;

    @ObfuscatedName("client.jr")
    public static int field591 = 0;

    @ObfuscatedName("client.jw")
    public static class159 field641 = null;

    @ObfuscatedName("client.jy")
    public static boolean field632 = false;

    @ObfuscatedName("client.ju")
    public static int field545 = -1;

    @ObfuscatedName("client.js")
    public static int field696 = -1;

    @ObfuscatedName("client.jc")
    public static boolean field504 = false;

    @ObfuscatedName("client.jt")
    public static int field636 = -1;

    @ObfuscatedName("client.jl")
    public static int field669 = -1;

    @ObfuscatedName("client.jp")
    public static boolean field638 = false;

    @ObfuscatedName("client.jn")
    public static int field639 = 1;

    @ObfuscatedName("client.kh")
    public static int[] field640 = new int[32];

    @ObfuscatedName("client.kf")
    public static int field593 = 0;

    @ObfuscatedName("client.kd")
    public static int[] field548 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field643 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field645 = 0;

    @ObfuscatedName("client.kq")
    public static int field582 = 0;

    @ObfuscatedName("client.ks")
    public static int field647 = 0;

    @ObfuscatedName("client.ku")
    public static int field648 = 0;

    @ObfuscatedName("client.kx")
    public static int field649 = 0;

    @ObfuscatedName("client.ke")
    public static int[] field650 = new int[2000];

    @ObfuscatedName("client.kk")
    public static String[] field651 = new String[1000];

    @ObfuscatedName("client.ky")
    public static int field652 = 0;

    @ObfuscatedName("client.ko")
    public static class177 field665 = new class177();

    @ObfuscatedName("client.kz")
    public static class177 field706 = new class177();

    @ObfuscatedName("client.kw")
    public static class177 field598 = new class177();

    @ObfuscatedName("client.kc")
    public static class175 field656 = new class175(512);

    @ObfuscatedName("client.kn")
    public static int field660 = 0;

    @ObfuscatedName("client.kp")
    public static int field670 = -2;

    @ObfuscatedName("client.km")
    public static boolean[] field493 = new boolean[100];

    @ObfuscatedName("client.kg")
    public static boolean[] field661 = new boolean[100];

    @ObfuscatedName("client.kt")
    public static boolean[] field662 = new boolean[100];

    @ObfuscatedName("client.lb")
    public static int[] field663 = new int[100];

    @ObfuscatedName("client.li")
    public static int[] field664 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field454 = new int[100];

    @ObfuscatedName("client.lv")
    public static int[] field666 = new int[100];

    @ObfuscatedName("client.la")
    public static int field667 = 0;

    @ObfuscatedName("client.lz")
    public static int[] field608 = new int[100];

    @ObfuscatedName("client.lk")
    public static String[] field551 = new String[100];

    @ObfuscatedName("client.lt")
    public static String[] field567 = new String[100];

    @ObfuscatedName("client.le")
    public static String[] field633 = new String[100];

    @ObfuscatedName("client.lm")
    public static int field684 = 0;

    @ObfuscatedName("client.lo")
    public static int[] field673 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lg")
    public static int field674 = 0;

    @ObfuscatedName("client.lw")
    public static int field463 = 0;

    @ObfuscatedName("client.lj")
    public static long[] field676 = new long[100];

    @ObfuscatedName("client.ly")
    public static int field677 = 0;

    @ObfuscatedName("client.ls")
    public static int field678 = 0;

    @ObfuscatedName("client.lr")
    public static int[] field679 = new int[128];

    @ObfuscatedName("client.lu")
    public static int[] field694 = new int[128];

    @ObfuscatedName("client.ll")
    public static long field681 = -1L;

    @ObfuscatedName("client.lc")
    public static String field682 = null;

    @ObfuscatedName("client.ld")
    public static String field683 = null;

    @ObfuscatedName("client.mk")
    public static int field566 = -1;

    @ObfuscatedName("client.mn")
    public static int field611 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field686 = new int[1000];

    @ObfuscatedName("client.mw")
    public static int[] field687 = new int[1000];

    @ObfuscatedName("client.mg")
    public static class86[] field714 = new class86[1000];

    @ObfuscatedName("client.mp")
    public static int field634 = 0;

    @ObfuscatedName("client.mj")
    public static int field587 = 0;

    @ObfuscatedName("client.mc")
    public static int field691 = 0;

    @ObfuscatedName("client.ms")
    public static int field484 = 255;

    @ObfuscatedName("client.mh")
    public static int field538 = -1;

    @ObfuscatedName("client.ma")
    public static boolean field596 = false;

    @ObfuscatedName("client.mz")
    public static int field695 = 127;

    @ObfuscatedName("client.mi")
    public static int field688 = 127;

    @ObfuscatedName("client.nl")
    public static int field697 = 0;

    @ObfuscatedName("client.nb")
    public static int[] field718 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field699 = new int[50];

    @ObfuscatedName("client.nt")
    public static int[] field700 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field701 = new int[50];

    @ObfuscatedName("client.na")
    public static class57[] field702 = new class57[50];

    @ObfuscatedName("client.nq")
    public static boolean field703 = false;

    @ObfuscatedName("client.nm")
    public static boolean[] field704 = new boolean[5];

    @ObfuscatedName("client.nd")
    public static int[] field705 = new int[5];

    @ObfuscatedName("client.nf")
    public static int[] field698 = new int[5];

    @ObfuscatedName("client.nj")
    public static int[] field707 = new int[5];

    @ObfuscatedName("client.nh")
    public static int[] field708 = new int[5];

    @ObfuscatedName("client.ng")
    public static int field709 = 0;

    @ObfuscatedName("client.os")
    public static int field644 = 0;

    @ObfuscatedName("client.om")
    public static class23[] field668 = new class23[400];

    @ObfuscatedName("client.oi")
    public static class173 field712 = new class173();

    @ObfuscatedName("client.og")
    public static int field713 = 0;

    @ObfuscatedName("client.or")
    public static class11[] field580 = new class11[400];

    @ObfuscatedName("client.on")
    public static class164 field510 = new class164();

    @ObfuscatedName("client.oy")
    public static int field716 = -1;

    @ObfuscatedName("client.ot")
    public static int field717 = -1;

    @ObfuscatedName("client.o(B)V")
    public final void method459() {
    }

    public final void init() {
        if (!this.method1489()) {
            return;
        }
        class167[] var1 = class167.method3460();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2789);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2789)) {
                    case 1:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                        }
                        break;
                    case 2:
                        if (var4.equalsIgnoreCase(class2.field30)) {
                            field460 = true;
                        } else {
                            field460 = false;
                        }
                        break;
                    case 3:
                        Statics.field710 = class133.method1284(Integer.parseInt(var4));
                        break;
                    case 4:
                        field456 = Integer.parseInt(var4);
                        break;
                    case 5:
                        class134[] var5 = class134.method211();
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
                            if (var6 == var9.method2399()) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field2019 = (class134) var10;
                        if (Statics.field2019 == class134.field2081) {
                            Statics.field459 = class186.field2865;
                        } else {
                            Statics.field459 = class186.field2867;
                        }
                        break;
                    case 6:
                        field657 = Integer.parseInt(var4);
                        break;
                    case 7:
                        Statics.field372 = var4;
                    case 8:
                    default:
                        break;
                    case 9:
                        field458 = Integer.parseInt(var4);
                        break;
                    case 10:
                        field654 = Integer.parseInt(var4);
                }
            }
        }
        method2350();
        Statics.field263 = this.getCodeBase().getHost();
        String var11 = Statics.field710.field2072;
        byte var12 = 0;
        try {
            class82.method152("oldschool", var11, var12, 16);
        } catch (Exception var14) {
            class80.method2076((String) null, var14);
        }
        Statics.field453 = this;
        this.method1478(765, 503, 37);
    }

    @ObfuscatedName("dq.w(I)V")
    public static final void method2350() {
        class95.field1600 = false;
        field623 = false;
    }

    @ObfuscatedName("client.i(B)V")
    public final void method261() {
        Statics.field1658 = field458 == 0 ? 43594 : field657 + 40000;
        Statics.field2406 = field458 == 0 ? 443 : field657 + 50000;
        Statics.field1262 = Statics.field1658;
        Statics.field2746 = class162.field2737;
        Statics.field2747 = class162.field2735;
        Statics.field2753 = class162.field2734;
        Statics.field2740 = class162.field2733;
        class75.method65();
        Canvas var1 = Statics.field1425;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class75.field1363);
        var1.addFocusListener(class75.field1363);
        class77.method1655(Statics.field1425);
        Statics.field1515 = class66.method162();
        if (Statics.field1515 != null) {
            Statics.field1515.method1401(Statics.field1425);
        }
        Statics.field2339 = new class71(255, class82.field1428, class82.field1421, 500000);
        Statics.field948 = Statics.method1443();
        Statics.field1113 = this.getToolkit().getSystemClipboard();
        if (field458 != 0) {
            field576 = true;
        }
    }

    @ObfuscatedName("client.y(B)V")
    public final void method249() {
        field465++;
        this.method306();
        class158.method1388();
        try {
            if (class139.field2355 == 1) {
                int var1 = Statics.field2832.method2862();
                if (var1 > 0 && Statics.field2832.method2815()) {
                    int var2 = var1 - Statics.field1299;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2832.method2808(var2);
                } else {
                    Statics.field2832.method2925();
                    Statics.field2832.method2812();
                    if (Statics.field2361 == null) {
                        class139.field2355 = 0;
                    } else {
                        class139.field2355 = 2;
                    }
                    Statics.field2358 = null;
                    Statics.field2359 = null;
                }
            }
        } catch (Exception var257) {
            var257.printStackTrace();
            Statics.field2832.method2925();
            class139.field2355 = 0;
            Statics.field2358 = null;
            Statics.field2359 = null;
            Statics.field2361 = null;
        }
        method1422();
        class75.method209();
        class77 var4 = class77.field1383;
        synchronized (class77.field1383) {
            class77.field1376 = class77.field1380;
            class77.field1377 = class77.field1388;
            class77.field1381 = class77.field1378;
            class77.field1386 = class77.field1382;
            class77.field1387 = class77.field1375;
            class77.field1385 = class77.field1384;
            class77.field1389 = class77.field1374;
            class77.field1382 = 0;
        }
        if (Statics.field1515 != null) {
            int var6 = Statics.field1515.method1402();
            field652 = var6;
        }
        if (field693 == 0) {
            method826();
            class73.method137();
        } else if (field693 == 5) {
            class21.method599(this);
            method826();
            class73.method137();
        } else if (field693 == 10) {
            class21.method599(this);
        } else if (field693 == 20) {
            class21.method599(this);
            method2077();
        } else if (field693 == 25) {
            method2758(false);
            field511 = 0;
            boolean var7 = true;
            for (int var8 = 0; var8 < Statics.field2479.length; var8++) {
                if (Statics.field722[var8] != -1 && Statics.field2479[var8] == null) {
                    Statics.field2479[var8] = Statics.field1361.method3078(Statics.field722[var8], 0);
                    if (Statics.field2479[var8] == null) {
                        var7 = false;
                        field511++;
                    }
                }
                if (Statics.field284[var8] != -1 && Statics.field1829[var8] == null) {
                    Statics.field1829[var8] = Statics.field1361.method3079(Statics.field284[var8], 0, Statics.field264[var8]);
                    if (Statics.field1829[var8] == null) {
                        var7 = false;
                        field511++;
                    }
                }
            }
            if (var7) {
                field513 = 0;
                boolean var9 = true;
                for (int var10 = 0; var10 < Statics.field2479.length; var10++) {
                    byte[] var11 = Statics.field1829[var10];
                    if (var11 != null) {
                        int var12 = (Statics.field1033[var10] >> 8) * 64 - Statics.field1848;
                        int var13 = (Statics.field1033[var10] & 0xFF) * 64 - Statics.field178;
                        if (field517) {
                            var12 = 10;
                            var13 = 10;
                        }
                        boolean var15 = true;
                        class127 var16 = new class127(var11);
                        int var17 = -1;
                        label1716: while (true) {
                            int var18 = var16.method2511();
                            if (var18 == 0) {
                                var9 &= var15;
                                break;
                            }
                            var17 += var18;
                            int var19 = 0;
                            boolean var20 = false;
                            while (true) {
                                while (!var20) {
                                    int var22 = var16.method2511();
                                    if (var22 == 0) {
                                        continue label1716;
                                    }
                                    var19 += var22 - 1;
                                    int var23 = var19 & 0x3F;
                                    int var24 = var19 >> 6 & 0x3F;
                                    int var25 = var16.method2498() >> 2;
                                    int var26 = var12 + var24;
                                    int var27 = var13 + var23;
                                    if (var26 > 0 && var27 > 0 && var26 < 103 && var27 < 103) {
                                        class32 var28 = class32.method1332(var17);
                                        if (var25 != 22 || !field623 || var28.field841 != 0 || var28.field812 == 1 || var28.field797) {
                                            if (!var28.method647()) {
                                                field513++;
                                                var15 = false;
                                            }
                                            var20 = true;
                                        }
                                    }
                                }
                                int var21 = var16.method2511();
                                if (var21 == 0) {
                                    break;
                                }
                                var16.method2498();
                            }
                        }
                    }
                }
                if (var9) {
                    if (field505 != 0) {
                        method2997(class135.field2096 + class2.field25 + class2.field20 + 100 + "%" + class2.field21, true);
                    }
                    method1422();
                    method601();
                    method1422();
                    Statics.field163.method2058();
                    method1422();
                    System.gc();
                    for (int var30 = 0; var30 < 4; var30++) {
                        field516[var30].method2725();
                    }
                    for (int var31 = 0; var31 < 4; var31++) {
                        for (int var32 = 0; var32 < 104; var32++) {
                            for (int var33 = 0; var33 < 104; var33++) {
                                class9.field119[var31][var32][var33] = 0;
                            }
                        }
                    }
                    method1422();
                    class9.method2172();
                    int var34 = Statics.field2479.length;
                    Statics.method906();
                    method2758(true);
                    if (!field517) {
                        for (int var35 = 0; var35 < var34; var35++) {
                            int var36 = (Statics.field1033[var35] >> 8) * 64 - Statics.field1848;
                            int var37 = (Statics.field1033[var35] & 0xFF) * 64 - Statics.field178;
                            byte[] var38 = Statics.field2479[var35];
                            if (var38 != null) {
                                method1422();
                                class9.method571(var38, var36, var37, Statics.field243 * 8 - 48, Statics.field1320 * 8 - 48, field516);
                            }
                        }
                        for (int var39 = 0; var39 < var34; var39++) {
                            int var40 = (Statics.field1033[var39] >> 8) * 64 - Statics.field1848;
                            int var41 = (Statics.field1033[var39] & 0xFF) * 64 - Statics.field178;
                            byte[] var42 = Statics.field2479[var39];
                            if (var42 == null && Statics.field1320 < 800) {
                                method1422();
                                class9.method2380(var40, var41, 64, 64);
                            }
                        }
                        method2758(true);
                        for (int var43 = 0; var43 < var34; var43++) {
                            byte[] var44 = Statics.field1829[var43];
                            if (var44 != null) {
                                int var45 = (Statics.field1033[var43] >> 8) * 64 - Statics.field1848;
                                int var46 = (Statics.field1033[var43] & 0xFF) * 64 - Statics.field178;
                                method1422();
                                class9.method669(var44, var45, var46, Statics.field163, field516);
                            }
                        }
                    }
                    if (field517) {
                        int var47 = 0;
                        label1634: while (true) {
                            if (var47 >= 4) {
                                for (int var85 = 0; var85 < 13; var85++) {
                                    for (int var86 = 0; var86 < 13; var86++) {
                                        int var87 = field626[0][var85][var86];
                                        if (var87 == -1) {
                                            class9.method2380(var85 * 8, var86 * 8, 8, 8);
                                        }
                                    }
                                }
                                method2758(true);
                                int var88 = 0;
                                while (true) {
                                    if (var88 >= 4) {
                                        break label1634;
                                    }
                                    method1422();
                                    for (int var89 = 0; var89 < 13; var89++) {
                                        label1523: for (int var90 = 0; var90 < 13; var90++) {
                                            int var91 = field626[var88][var89][var90];
                                            if (var91 != -1) {
                                                int var92 = var91 >> 24 & 0x3;
                                                int var93 = var91 >> 1 & 0x3;
                                                int var94 = var91 >> 14 & 0x3FF;
                                                int var95 = var91 >> 3 & 0x7FF;
                                                int var96 = (var94 / 8 << 8) + var95 / 8;
                                                for (int var97 = 0; var97 < Statics.field1033.length; var97++) {
                                                    if (Statics.field1033[var97] == var96 && Statics.field1829[var97] != null) {
                                                        byte[] var98 = Statics.field1829[var97];
                                                        int var99 = var89 * 8;
                                                        int var100 = var90 * 8;
                                                        int var101 = (var94 & 0x7) * 8;
                                                        int var102 = (var95 & 0x7) * 8;
                                                        class95 var103 = Statics.field163;
                                                        class130[] var104 = field516;
                                                        class127 var105 = new class127(var98);
                                                        int var106 = -1;
                                                        while (true) {
                                                            int var107 = var105.method2511();
                                                            if (var107 == 0) {
                                                                continue label1523;
                                                            }
                                                            var106 += var107;
                                                            int var108 = 0;
                                                            while (true) {
                                                                int var109 = var105.method2511();
                                                                if (var109 == 0) {
                                                                    break;
                                                                }
                                                                var108 += var109 - 1;
                                                                int var110 = var108 & 0x3F;
                                                                int var111 = var108 >> 6 & 0x3F;
                                                                int var112 = var108 >> 12;
                                                                int var113 = var105.method2498();
                                                                int var114 = var113 >> 2;
                                                                int var115 = var113 & 0x3;
                                                                if (var92 == var112 && var111 >= var101 && var111 < var101 + 8 && var110 >= var102 && var110 < var102 + 8) {
                                                                    class32 var116 = class32.method1332(var106);
                                                                    int var117 = var99 + class161.method3209(var111 & 0x7, var110 & 0x7, var93, var116.field810, var116.field837, var115);
                                                                    int var118 = var100 + class161.method2171(var111 & 0x7, var110 & 0x7, var93, var116.field810, var116.field837, var115);
                                                                    if (var117 > 0 && var118 > 0 && var117 < 103 && var118 < 103) {
                                                                        int var119 = var88;
                                                                        if ((class9.field119[1][var117][var118] & 0x2) == 2) {
                                                                            var119 = var88 - 1;
                                                                        }
                                                                        class130 var120 = null;
                                                                        if (var119 >= 0) {
                                                                            var120 = var104[var119];
                                                                        }
                                                                        class9.method1285(var88, var117, var118, var106, var93 + var115 & 0x3, var114, var103, var120);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var88++;
                                }
                            }
                            method1422();
                            for (int var48 = 0; var48 < 13; var48++) {
                                for (int var49 = 0; var49 < 13; var49++) {
                                    boolean var50 = false;
                                    int var51 = field626[var47][var48][var49];
                                    if (var51 != -1) {
                                        int var52 = var51 >> 24 & 0x3;
                                        int var53 = var51 >> 1 & 0x3;
                                        int var54 = var51 >> 14 & 0x3FF;
                                        int var55 = var51 >> 3 & 0x7FF;
                                        int var56 = (var54 / 8 << 8) + var55 / 8;
                                        for (int var57 = 0; var57 < Statics.field1033.length; var57++) {
                                            if (Statics.field1033[var57] == var56 && Statics.field2479[var57] != null) {
                                                byte[] var58 = Statics.field2479[var57];
                                                int var59 = var48 * 8;
                                                int var60 = var49 * 8;
                                                int var61 = (var54 & 0x7) * 8;
                                                int var62 = (var55 & 0x7) * 8;
                                                class130[] var63 = field516;
                                                for (int var64 = 0; var64 < 8; var64++) {
                                                    for (int var65 = 0; var65 < 8; var65++) {
                                                        if (var59 + var64 > 0 && var59 + var64 < 103 && var60 + var65 > 0 && var60 + var65 < 103) {
                                                            var63[var47].field2037[var59 + var64][var60 + var65] &= 0xFEFFFFFF;
                                                        }
                                                    }
                                                }
                                                class127 var66 = new class127(var58);
                                                for (int var67 = 0; var67 < 4; var67++) {
                                                    for (int var68 = 0; var68 < 64; var68++) {
                                                        for (int var69 = 0; var69 < 64; var69++) {
                                                            if (var52 == var67 && var68 >= var61 && var68 < var61 + 8 && var69 >= var62 && var69 < var62 + 8) {
                                                                int var73 = var68 & 0x7;
                                                                int var74 = var69 & 0x7;
                                                                int var76 = var53 & 0x3;
                                                                int var77;
                                                                if (var76 == 0) {
                                                                    var77 = var73;
                                                                } else if (var76 == 1) {
                                                                    var77 = var74;
                                                                } else if (var76 == 2) {
                                                                    var77 = 7 - var73;
                                                                } else {
                                                                    var77 = 7 - var74;
                                                                }
                                                                class9.method2926(var66, var47, var59 + var77, var60 + class161.method2341(var68 & 0x7, var69 & 0x7, var53), 0, 0, var53);
                                                            } else {
                                                                class9.method2926(var66, 0, -1, -1, 0, 0, 0);
                                                            }
                                                        }
                                                    }
                                                }
                                                var50 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var50) {
                                        int var78 = var47;
                                        int var79 = var48 * 8;
                                        int var80 = var49 * 8;
                                        for (int var81 = 0; var81 < 8; var81++) {
                                            for (int var82 = 0; var82 < 8; var82++) {
                                                class9.field126[var78][var79 + var81][var80 + var82] = 0;
                                            }
                                        }
                                        if (var79 > 0) {
                                            for (int var83 = 1; var83 < 8; var83++) {
                                                class9.field126[var78][var79][var80 + var83] = class9.field126[var78][var79 - 1][var80 + var83];
                                            }
                                        }
                                        if (var80 > 0) {
                                            for (int var84 = 1; var84 < 8; var84++) {
                                                class9.field126[var78][var79 + var84][var80] = class9.field126[var78][var79 + var84][var80 - 1];
                                            }
                                        }
                                        if (var79 > 0 && class9.field126[var78][var79 - 1][var80] != 0) {
                                            class9.field126[var78][var79][var80] = class9.field126[var78][var79 - 1][var80];
                                        } else if (var80 > 0 && class9.field126[var78][var79][var80 - 1] != 0) {
                                            class9.field126[var78][var79][var80] = class9.field126[var78][var79][var80 - 1];
                                        } else if (var79 > 0 && var80 > 0 && class9.field126[var78][var79 - 1][var80 - 1] != 0) {
                                            class9.field126[var78][var79][var80] = class9.field126[var78][var79 - 1][var80 - 1];
                                        }
                                    }
                                }
                            }
                            var47++;
                        }
                    }
                    method2758(true);
                    method601();
                    method1422();
                    class9.method809(Statics.field163, field516);
                    method2758(true);
                    int var121 = class9.field123;
                    if (var121 > Statics.field2374) {
                        var121 = Statics.field2374;
                    }
                    if (var121 < Statics.field2374 - 1) {
                        int var122 = Statics.field2374 - 1;
                    }
                    if (field623) {
                        Statics.field163.method1904(class9.field123);
                    } else {
                        Statics.field163.method1904(0);
                    }
                    for (int var123 = 0; var123 < 104; var123++) {
                        for (int var124 = 0; var124 < 104; var124++) {
                            method2397(var123, var124);
                        }
                    }
                    method1422();
                    Statics.method2421();
                    class32.field798.method3360();
                    if (Statics.field1202 != null) {
                        field498.method2355(216);
                        field498.method2487(1057001181);
                    }
                    if (!field517) {
                        int var125 = (Statics.field243 - 6) / 8;
                        int var126 = (Statics.field243 + 6) / 8;
                        int var127 = (Statics.field1320 - 6) / 8;
                        int var128 = (Statics.field1320 + 6) / 8;
                        for (int var129 = var125 - 1; var129 <= var126 + 1; var129++) {
                            for (int var130 = var127 - 1; var130 <= var128 + 1; var130++) {
                                if (var129 < var125 || var129 > var126 || var130 < var127 || var130 > var128) {
                                    Statics.field1361.method3108("m" + var129 + "_" + var130);
                                    Statics.field1361.method3108("l" + var129 + "_" + var130);
                                }
                            }
                        }
                    }
                    method1(30);
                    method1422();
                    Statics.field131 = (byte[][][]) null;
                    Statics.field736 = (byte[][][]) null;
                    Statics.field122 = (byte[][][]) null;
                    Statics.field2023 = (byte[][][]) null;
                    Statics.field1295 = (int[][][]) null;
                    Statics.field2834 = (byte[][][]) null;
                    Statics.field121 = (int[][]) null;
                    Statics.field2736 = null;
                    Statics.field120 = null;
                    Statics.field113 = null;
                    Statics.field964 = null;
                    Statics.field1017 = null;
                    field498.method2355(114);
                    class73.method137();
                } else {
                    field505 = 2;
                }
            } else {
                field505 = 1;
            }
        }
        if (field693 == 30) {
            if (field472 > 1) {
                field472--;
            }
            if (field577 > 0) {
                field577--;
            }
            if (field509) {
                field509 = false;
                if (field577 > 0) {
                    method1476();
                } else {
                    method1(40);
                    Statics.field497 = Statics.field355;
                    Statics.field355 = null;
                }
            } else {
                for (int var131 = 0; var131 < 100 && method2440(); var131++) {
                }
                if (field693 == 30) {
                    class182.method1415(field498, 159);
                    Object var132 = Statics.field1315.field232;
                    synchronized (Statics.field1315.field232) {
                        if (!field607) {
                            Statics.field1315.field233 = 0;
                        } else if (class77.field1386 != 0 || Statics.field1315.field233 >= 40) {
                            field498.method2355(113);
                            field498.method2484(0);
                            int var133 = field498.field2030;
                            int var134 = 0;
                            for (int var135 = 0; var135 < Statics.field1315.field233 && field498.field2030 - var133 < 240; var135++) {
                                var134++;
                                int var136 = Statics.field1315.field235[var135];
                                if (var136 < 0) {
                                    var136 = 0;
                                } else if (var136 > 502) {
                                    var136 = 502;
                                }
                                int var137 = Statics.field1315.field239[var135];
                                if (var137 < 0) {
                                    var137 = 0;
                                } else if (var137 > 764) {
                                    var137 = 764;
                                }
                                int var138 = var136 * 765 + var137;
                                if (Statics.field1315.field235[var135] == -1 && Statics.field1315.field239[var135] == -1) {
                                    var137 = -1;
                                    var136 = -1;
                                    var138 = 524287;
                                }
                                if (field467 != var137 || field468 != var136) {
                                    int var139 = var137 - field467;
                                    field467 = var137;
                                    int var140 = var136 - field468;
                                    field468 = var136;
                                    if (field690 < 8 && var139 >= -32 && var139 <= 31 && var140 >= -32 && var140 <= 31) {
                                        var139 += 32;
                                        var140 += 32;
                                        field498.method2485((field690 << 12) + (var139 << 6) + var140);
                                        field690 = 0;
                                    } else if (field690 < 8) {
                                        field498.method2486((field690 << 19) + 8388608 + var138);
                                        field690 = 0;
                                    } else {
                                        field498.method2487((field690 << 19) + -1073741824 + var138);
                                        field690 = 0;
                                    }
                                } else if (field690 < 2047) {
                                    field690++;
                                }
                            }
                            field498.method2518(field498.field2030 - var133);
                            if (var134 >= Statics.field1315.field233) {
                                Statics.field1315.field233 = 0;
                            } else {
                                Statics.field1315.field233 -= var134;
                                for (int var141 = 0; var141 < Statics.field1315.field233; var141++) {
                                    Statics.field1315.field239[var141] = Statics.field1315.field239[var134 + var141];
                                    Statics.field1315.field235[var141] = Statics.field1315.field235[var134 + var141];
                                }
                            }
                        }
                    }
                    if (class77.field1386 == 1 || class77.field1386 == 2) {
                        long var143 = (class77.field1389 - field466) / 50L;
                        if (var143 > 4095L) {
                            var143 = 4095L;
                        }
                        field466 = class77.field1389;
                        int var145 = class77.field1385;
                        if (var145 < 0) {
                            var145 = 0;
                        } else if (var145 > 502) {
                            var145 = 502;
                        }
                        int var146 = class77.field1387;
                        if (var146 < 0) {
                            var146 = 0;
                        } else if (var146 > 764) {
                            var146 = 764;
                        }
                        int var147 = var145 * 765 + var146;
                        byte var148 = 0;
                        if (class77.field1386 == 2) {
                            var148 = 1;
                        }
                        int var149 = (int) var143;
                        field498.method2355(6);
                        field498.method2487((var148 << 19) + (var149 << 20) + var147);
                    }
                    if (class75.field1352 > 0) {
                        field498.method2355(39);
                        field498.method2485(0);
                        int var150 = field498.field2030;
                        long var151 = class121.method548();
                        for (int var153 = 0; var153 < class75.field1352; var153++) {
                            long var154 = var151 - field681;
                            if (var154 > 16777215L) {
                                var154 = 16777215L;
                            }
                            field681 = var151;
                            field498.method2486((int) var154);
                            field498.method2519(class75.field1354[var153]);
                        }
                        field498.method2494(field498.field2030 - var150);
                    }
                    if (field605 > 0) {
                        field605--;
                    }
                    if (class75.field1348[96] || class75.field1348[97] || class75.field1348[98] || class75.field1348[99]) {
                        field546 = true;
                    }
                    if (field546 && field605 <= 0) {
                        field605 = 20;
                        field546 = false;
                        field498.method2355(153);
                        field498.method2528(field539);
                        field498.method2550(field540);
                    }
                    if (Statics.field1430 && !field552) {
                        field552 = true;
                        field498.method2355(73);
                        field498.method2484(1);
                    }
                    if (!Statics.field1430 && field552) {
                        field552 = false;
                        field498.method2355(73);
                        field498.method2484(0);
                    }
                    method157();
                    if (field693 == 30) {
                        for (class22 var156 = (class22) field597.method3446(); var156 != null; var156 = (class22) field597.method3428()) {
                            if (var156.field346 > 0) {
                                var156.field346--;
                            }
                            if (var156.field346 == 0) {
                                if (var156.field333 >= 0) {
                                    int var157 = var156.field333;
                                    int var158 = var156.field335;
                                    class32 var159 = class32.method1332(var157);
                                    if (var158 == 11) {
                                        var158 = 10;
                                    }
                                    if (var158 >= 5 && var158 <= 8) {
                                        var158 = 4;
                                    }
                                    boolean var160 = var159.method646(var158);
                                    if (!var160) {
                                        continue;
                                    }
                                }
                                method146(var156.field340, var156.field337, var156.field331, var156.field332, var156.field333, var156.field341, var156.field335);
                                var156.method3455();
                            } else {
                                if (var156.field339 > 0) {
                                    var156.field339--;
                                }
                                if (var156.field339 == 0 && var156.field331 >= 1 && var156.field332 >= 1 && var156.field331 <= 102 && var156.field332 <= 102) {
                                    if (var156.field334 >= 0) {
                                        int var161 = var156.field334;
                                        int var162 = var156.field338;
                                        class32 var163 = class32.method1332(var161);
                                        if (var162 == 11) {
                                            var162 = 10;
                                        }
                                        if (var162 >= 5 && var162 <= 8) {
                                            var162 = 4;
                                        }
                                        boolean var164 = var163.method646(var162);
                                        if (!var164) {
                                            continue;
                                        }
                                    }
                                    method146(var156.field340, var156.field337, var156.field331, var156.field332, var156.field334, var156.field343, var156.field338);
                                    var156.field339 = -1;
                                    if (var156.field334 == var156.field333 && var156.field333 == -1) {
                                        var156.method3455();
                                    } else if (var156.field334 == var156.field333 && var156.field343 == var156.field341 && var156.field338 == var156.field335) {
                                        var156.method3455();
                                    }
                                }
                            }
                        }
                        method48();
                        field503++;
                        if (field503 <= 750) {
                            for (int var165 = -1; var165 < field570; var165++) {
                                int var166;
                                if (var165 == -1) {
                                    var166 = 2047;
                                } else {
                                    var166 = field642[var165];
                                }
                                class3 var167 = field506[var166];
                                if (var167 != null) {
                                    method1484(var167, 1);
                                }
                            }
                            for (int var168 = 0; var168 < field495; var168++) {
                                int var169 = field496[var168];
                                class25 var170 = field494[var169];
                                if (var170 != null) {
                                    method1484(var170, var170.field367.field786);
                                }
                            }
                            for (int var171 = -1; var171 < field570; var171++) {
                                int var172;
                                if (var171 == -1) {
                                    var172 = 2047;
                                } else {
                                    var172 = field642[var171];
                                }
                                class3 var173 = field506[var172];
                                if (var173 != null && var173.field429 > 0) {
                                    var173.field429--;
                                    if (var173.field429 == 0) {
                                        var173.field406 = null;
                                    }
                                }
                            }
                            for (int var174 = 0; var174 < field495; var174++) {
                                int var175 = field496[var174];
                                class25 var176 = field494[var175];
                                if (var176 != null && var176.field429 > 0) {
                                    var176.field429--;
                                    if (var176.field429 == 0) {
                                        var176.field406 = null;
                                    }
                                }
                            }
                            field532++;
                            if (field565 != 0) {
                                field564 += 20;
                                if (field564 >= 400) {
                                    field565 = 0;
                                }
                            }
                            if (Statics.field1513 != null) {
                                field518++;
                                if (field518 >= 15) {
                                    method1331(Statics.field1513);
                                    Statics.field1513 = null;
                                }
                            }
                            if (Statics.field2628 != null) {
                                method1331(Statics.field2628);
                                field574++;
                                if (class77.field1377 > field618 + 5 || class77.field1377 < field618 - 5 || class77.field1381 > field571 + 5 || class77.field1381 < field571 - 5) {
                                    field573 = true;
                                }
                                if (class77.field1376 == 0) {
                                    if (field573 && field574 >= 5) {
                                        if (Statics.field558 == Statics.field2628 && field572 != field569) {
                                            class159 var177 = Statics.field2628;
                                            byte var178 = 0;
                                            if (field619 == 1 && var177.field2627 == 206) {
                                                var178 = 1;
                                            }
                                            if (var177.field2704[field572] <= 0) {
                                                var178 = 0;
                                            }
                                            if (class163.method2927(method2769(var177))) {
                                                int var179 = field569;
                                                int var180 = field572;
                                                var177.field2704[var180] = var177.field2704[var179];
                                                var177.field2643[var180] = var177.field2643[var179];
                                                var177.field2704[var179] = -1;
                                                var177.field2643[var179] = 0;
                                            } else if (var178 == 1) {
                                                int var181 = field569;
                                                int var182 = field572;
                                                while (var181 != var182) {
                                                    if (var181 > var182) {
                                                        var177.method3236(var181 - 1, var181);
                                                        var181--;
                                                    } else if (var181 < var182) {
                                                        var177.method3236(var181 + 1, var181);
                                                        var181++;
                                                    }
                                                }
                                            } else {
                                                var177.method3236(field572, field569);
                                            }
                                            field498.method2355(3);
                                            field498.method2485(field569);
                                            field498.method2519(var178);
                                            field498.method2528(field572);
                                            field498.method2536(Statics.field2628.field2673);
                                        }
                                    } else if ((field655 == 1 || method45(field471 - 1)) && field471 > 2) {
                                        method206();
                                    } else if (field471 > 0) {
                                        method30(field471 - 1);
                                    }
                                    field518 = 10;
                                    class77.field1386 = 0;
                                    Statics.field2628 = null;
                                }
                            }
                            class159 var183 = Statics.field1112;
                            class159 var184 = Statics.field1274;
                            Statics.field1112 = null;
                            Statics.field1274 = null;
                            field641 = null;
                            field504 = false;
                            field632 = false;
                            field678 = 0;
                            while (true) {
                                while (true) {
                                    class75 var185 = class75.field1363;
                                    boolean var186;
                                    synchronized (class75.field1363) {
                                        if (class75.field1356 == class75.field1345) {
                                            var186 = false;
                                        } else {
                                            Statics.field78 = class75.field1353[class75.field1356];
                                            Statics.field1405 = class75.field1333[class75.field1356];
                                            class75.field1356 = class75.field1356 + 1 & 0x7F;
                                            var186 = true;
                                        }
                                    }
                                    if (!var186 || field678 >= 128) {
                                        int var190 = field711;
                                        if (class159.method129(var190)) {
                                            method1450(Statics.field1921[var190], -1, 0, 0, 765, 503, 0, 0);
                                        }
                                        field639++;
                                        while (true) {
                                            class1 var191;
                                            class159 var192;
                                            class159 var193;
                                            do {
                                                var191 = (class1) field706.method3425();
                                                if (var191 == null) {
                                                    while (true) {
                                                        class1 var194;
                                                        class159 var195;
                                                        class159 var196;
                                                        do {
                                                            var194 = (class1) field598.method3425();
                                                            if (var194 == null) {
                                                                while (true) {
                                                                    class1 var197;
                                                                    class159 var198;
                                                                    class159 var199;
                                                                    do {
                                                                        var197 = (class1) field665.method3425();
                                                                        if (var197 == null) {
                                                                            if (field627 != null) {
                                                                                method1331(field627);
                                                                                Statics.field2348++;
                                                                                if (field504 && field632) {
                                                                                    int var200 = class77.field1377;
                                                                                    int var201 = class77.field1381;
                                                                                    int var202 = var200 - field629;
                                                                                    int var203 = var201 - field591;
                                                                                    if (var202 < field545) {
                                                                                        var202 = field545;
                                                                                    }
                                                                                    if (field627.field2611 + var202 > field545 + field628.field2611) {
                                                                                        var202 = field545 + field628.field2611 - field627.field2611;
                                                                                    }
                                                                                    if (var203 < field696) {
                                                                                        var203 = field696;
                                                                                    }
                                                                                    if (field627.field2672 + var203 > field696 + field628.field2672) {
                                                                                        var203 = field696 + field628.field2672 - field627.field2672;
                                                                                    }
                                                                                    int var204 = var202 - field636;
                                                                                    int var205 = var203 - field669;
                                                                                    int var206 = field627.field2665;
                                                                                    if (Statics.field2348 > field627.field2702 && (var204 > var206 || var204 < -var206 || var205 > var206 || var205 < -var206)) {
                                                                                        field638 = true;
                                                                                    }
                                                                                    int var207 = field628.field2612 + (var202 - field545);
                                                                                    int var208 = field628.field2616 + (var203 - field696);
                                                                                    if (field627.field2678 != null && field638) {
                                                                                        class1 var209 = new class1();
                                                                                        var209.field2 = field627;
                                                                                        var209.field3 = var207;
                                                                                        var209.field4 = var208;
                                                                                        var209.field6 = field627.field2678;
                                                                                        class26.method47(var209);
                                                                                    }
                                                                                    if (class77.field1376 == 0) {
                                                                                        if (field638) {
                                                                                            if (field627.field2679 != null) {
                                                                                                class1 var210 = new class1();
                                                                                                var210.field2 = field627;
                                                                                                var210.field3 = var207;
                                                                                                var210.field4 = var208;
                                                                                                var210.field5 = field641;
                                                                                                var210.field6 = field627.field2679;
                                                                                                class26.method47(var210);
                                                                                            }
                                                                                            if (field641 != null) {
                                                                                                class159 var211 = field627;
                                                                                                int var212 = class163.method705(method2769(var211));
                                                                                                class159 var213;
                                                                                                if (var212 == 0) {
                                                                                                    var213 = null;
                                                                                                } else {
                                                                                                    int var214 = 0;
                                                                                                    while (true) {
                                                                                                        if (var214 >= var212) {
                                                                                                            var213 = var211;
                                                                                                            break;
                                                                                                        }
                                                                                                        var211 = class159.method1397(var211.field2613);
                                                                                                        if (var211 == null) {
                                                                                                            var213 = null;
                                                                                                            break;
                                                                                                        }
                                                                                                        var214++;
                                                                                                    }
                                                                                                }
                                                                                                if (var213 != null) {
                                                                                                    field498.method2355(213);
                                                                                                    field498.method2534(field627.field2673);
                                                                                                    field498.method2535(field641.field2673);
                                                                                                    field498.method2485(field641.field2603);
                                                                                                    field498.method2485(field627.field2603);
                                                                                                }
                                                                                            }
                                                                                        } else if ((field655 == 1 || method45(field471 - 1)) && field471 > 2) {
                                                                                            method206();
                                                                                        } else if (field471 > 0) {
                                                                                            method30(field471 - 1);
                                                                                        }
                                                                                        field627 = null;
                                                                                    }
                                                                                } else if (Statics.field2348 > 1) {
                                                                                    field627 = null;
                                                                                }
                                                                            }
                                                                            if (class95.field1584 != -1) {
                                                                                int var215 = class95.field1584;
                                                                                int var216 = class95.field1596;
                                                                                field498.method2355(1);
                                                                                field498.method2484(5);
                                                                                field498.method2484(class75.field1348[82] ? (class75.field1348[81] ? 2 : 1) : 0);
                                                                                field498.method2550(Statics.field1848 + var215);
                                                                                field498.method2528(Statics.field178 + var216);
                                                                                class95.field1584 = -1;
                                                                                field562 = class77.field1387;
                                                                                field563 = class77.field1385;
                                                                                field565 = 1;
                                                                                field564 = 0;
                                                                                field634 = var215;
                                                                                field587 = var216;
                                                                            }
                                                                            if (Statics.field2628 == null && field627 == null) {
                                                                                int var217 = class77.field1386;
                                                                                if (field455) {
                                                                                    if (var217 != 1) {
                                                                                        int var218 = class77.field1377;
                                                                                        int var219 = class77.field1381;
                                                                                        if (var218 < Statics.field327 - 10 || var218 > Statics.field79 + Statics.field327 + 10 || var219 < Statics.field2585 - 10 || var219 > Statics.field2585 + Statics.field2420 + 10) {
                                                                                            field455 = false;
                                                                                            method2420(Statics.field327, Statics.field2585, Statics.field79, Statics.field2420);
                                                                                        }
                                                                                    }
                                                                                    if (var217 == 1) {
                                                                                        int var220 = Statics.field327;
                                                                                        int var221 = Statics.field2585;
                                                                                        int var222 = Statics.field79;
                                                                                        int var223 = class77.field1387;
                                                                                        int var224 = class77.field1385;
                                                                                        int var225 = -1;
                                                                                        for (int var226 = 0; var226 < field471; var226++) {
                                                                                            int var227 = (field471 - 1 - var226) * 15 + var221 + 31;
                                                                                            if (var223 > var220 && var223 < var220 + var222 && var224 > var227 - 13 && var224 < var227 + 3) {
                                                                                                var225 = var226;
                                                                                            }
                                                                                        }
                                                                                        if (var225 != -1) {
                                                                                            method30(var225);
                                                                                        }
                                                                                        field455 = false;
                                                                                        method2420(Statics.field327, Statics.field2585, Statics.field79, Statics.field2420);
                                                                                    }
                                                                                } else {
                                                                                    label1887: {
                                                                                        if (var217 == 1 && field471 > 0) {
                                                                                            int var228 = field602[field471 - 1];
                                                                                            if (var228 == 39 || var228 == 40 || var228 == 41 || var228 == 42 || var228 == 43 || var228 == 33 || var228 == 34 || var228 == 35 || var228 == 36 || var228 == 37 || var228 == 38 || var228 == 1005) {
                                                                                                int var229 = field600[field471 - 1];
                                                                                                int var230 = field601[field471 - 1];
                                                                                                class159 var231 = class159.method1397(var230);
                                                                                                if (class163.method920(method2769(var231)) || class163.method2927(method2769(var231))) {
                                                                                                    if (Statics.field2628 != null && !field573 && field655 != 1 && !method45(field471 - 1) && field471 > 0) {
                                                                                                        method30(field471 - 1);
                                                                                                    }
                                                                                                    field573 = false;
                                                                                                    field574 = 0;
                                                                                                    if (Statics.field2628 != null) {
                                                                                                        method1331(Statics.field2628);
                                                                                                    }
                                                                                                    Statics.field2628 = class159.method1397(var230);
                                                                                                    field569 = var229;
                                                                                                    field618 = class77.field1387;
                                                                                                    field571 = class77.field1385;
                                                                                                    method1331(Statics.field2628);
                                                                                                    break label1887;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (var217 == 1 && (field655 == 1 && field471 > 2 || method45(field471 - 1))) {
                                                                                            var217 = 2;
                                                                                        }
                                                                                        if (var217 == 1 && field471 > 0) {
                                                                                            method30(field471 - 1);
                                                                                        }
                                                                                        if (var217 == 2 && field471 > 0) {
                                                                                            method206();
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            if (Statics.field1112 != var183) {
                                                                                if (var183 != null) {
                                                                                    method1331(var183);
                                                                                }
                                                                                if (Statics.field1112 != null) {
                                                                                    method1331(Statics.field1112);
                                                                                }
                                                                            }
                                                                            if (Statics.field1274 != var184 && field635 == field609) {
                                                                                if (var184 != null) {
                                                                                    method1331(var184);
                                                                                }
                                                                                if (Statics.field1274 != null) {
                                                                                    method1331(Statics.field1274);
                                                                                }
                                                                            }
                                                                            if (Statics.field1274 == null) {
                                                                                if (field635 > 0) {
                                                                                    field635--;
                                                                                }
                                                                            } else if (field635 < field609) {
                                                                                field635++;
                                                                                if (field635 == field609) {
                                                                                    method1331(Statics.field1274);
                                                                                }
                                                                            }
                                                                            int var232 = field520 + Statics.field905.field404;
                                                                            int var233 = field522 + Statics.field905.field394;
                                                                            if (Statics.field1648 - var232 < -500 || Statics.field1648 - var232 > 500 || Statics.field1547 - var233 < -500 || Statics.field1547 - var233 > 500) {
                                                                                Statics.field1648 = var232;
                                                                                Statics.field1547 = var233;
                                                                            }
                                                                            if (Statics.field1648 != var232) {
                                                                                Statics.field1648 += (var232 - Statics.field1648) / 16;
                                                                            }
                                                                            if (Statics.field1547 != var233) {
                                                                                Statics.field1547 += (var233 - Statics.field1547) / 16;
                                                                            }
                                                                            if (class77.field1376 == 4 && field547 >= 2) {
                                                                                int var234 = class77.field1381 - field482;
                                                                                field542 = var234 * 2;
                                                                                field482 = var234 == -1 || var234 == 1 ? class77.field1381 : (field482 + class77.field1381) / 2;
                                                                                int var235 = field543 - class77.field1377;
                                                                                field541 = var235 * 2;
                                                                                field543 = var235 == -1 || var235 == 1 ? class77.field1377 : (field543 + class77.field1377) / 2;
                                                                            } else {
                                                                                if (class75.field1348[96]) {
                                                                                    field541 += (-24 - field541) / 2;
                                                                                } else if (class75.field1348[97]) {
                                                                                    field541 += (24 - field541) / 2;
                                                                                } else {
                                                                                    field541 /= 2;
                                                                                }
                                                                                if (class75.field1348[98]) {
                                                                                    field542 += (12 - field542) / 2;
                                                                                } else if (class75.field1348[99]) {
                                                                                    field542 += (-12 - field542) / 2;
                                                                                } else {
                                                                                    field542 /= 2;
                                                                                }
                                                                                field482 = class77.field1381;
                                                                                field543 = class77.field1377;
                                                                            }
                                                                            field540 = field541 / 2 + field540 & 0x7FF;
                                                                            field539 += field542 / 2;
                                                                            if (field539 < 128) {
                                                                                field539 = 128;
                                                                            }
                                                                            if (field539 > 383) {
                                                                                field539 = 383;
                                                                            }
                                                                            int var236 = Statics.field1648 >> 7;
                                                                            int var237 = Statics.field1547 >> 7;
                                                                            int var238 = method2435(Statics.field1648, Statics.field1547, Statics.field2374);
                                                                            int var239 = 0;
                                                                            if (var236 > 3 && var237 > 3 && var236 < 100 && var237 < 100) {
                                                                                for (int var240 = var236 - 4; var240 <= var236 + 4; var240++) {
                                                                                    for (int var241 = var237 - 4; var241 <= var237 + 4; var241++) {
                                                                                        int var242 = Statics.field2374;
                                                                                        if (var242 < 3 && (class9.field119[1][var240][var241] & 0x2) == 2) {
                                                                                            var242++;
                                                                                        }
                                                                                        int var243 = var238 - class9.field126[var242][var240][var241];
                                                                                        if (var243 > var239) {
                                                                                            var239 = var243;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var244 = var239 * 192;
                                                                            if (var244 > 98048) {
                                                                                var244 = 98048;
                                                                            }
                                                                            if (var244 < 32768) {
                                                                                var244 = 32768;
                                                                            }
                                                                            if (var244 > field616) {
                                                                                field616 += (var244 - field616) / 24;
                                                                            } else if (var244 < field616) {
                                                                                field616 += (var244 - field616) / 80;
                                                                            }
                                                                            if (field703) {
                                                                                method1413();
                                                                            }
                                                                            for (int var245 = 0; var245 < 5; var245++) {
                                                                                int var10002 = field708[var245]++;
                                                                            }
                                                                            int var246 = ++class77.field1379 - 1;
                                                                            int var248 = class75.method919();
                                                                            if (var246 > 15000 && var248 > 15000) {
                                                                                field577 = 250;
                                                                                class77.method1599(14500);
                                                                                field498.method2355(151);
                                                                            }
                                                                            field526++;
                                                                            if (field526 > 500) {
                                                                                field526 = 0;
                                                                                int var249 = (int) (Math.random() * 8.0D);
                                                                                if ((var249 & 0x1) == 1) {
                                                                                    field520 += field521;
                                                                                }
                                                                                if ((var249 & 0x2) == 2) {
                                                                                    field522 += field523;
                                                                                }
                                                                                if ((var249 & 0x4) == 4) {
                                                                                    field524 += field525;
                                                                                }
                                                                            }
                                                                            if (field520 < -50) {
                                                                                field521 = 2;
                                                                            }
                                                                            if (field520 > 50) {
                                                                                field521 = -2;
                                                                            }
                                                                            if (field522 < -55) {
                                                                                field523 = 2;
                                                                            }
                                                                            if (field522 > 55) {
                                                                                field523 = -2;
                                                                            }
                                                                            if (field524 < -40) {
                                                                                field525 = 1;
                                                                            }
                                                                            if (field524 > 40) {
                                                                                field525 = -1;
                                                                            }
                                                                            field531++;
                                                                            if (field531 > 500) {
                                                                                field531 = 0;
                                                                                int var250 = (int) (Math.random() * 8.0D);
                                                                                if ((var250 & 0x1) == 1) {
                                                                                    field527 += field508;
                                                                                }
                                                                                if ((var250 & 0x2) == 2) {
                                                                                    field501 += field615;
                                                                                }
                                                                            }
                                                                            if (field527 < -60) {
                                                                                field508 = 2;
                                                                            }
                                                                            if (field527 > 60) {
                                                                                field508 = -2;
                                                                            }
                                                                            if (field501 < -20) {
                                                                                field615 = 1;
                                                                            }
                                                                            if (field501 > 10) {
                                                                                field615 = -1;
                                                                            }
                                                                            for (class28 var251 = (class28) field712.method3395(); var251 != null; var251 = (class28) field712.method3390()) {
                                                                                if ((long) var251.field720 < class121.method548() / 1000L - 5L) {
                                                                                    if (var251.field719 > 0) {
                                                                                        method3179(5, "", var251.field723 + class135.field2168);
                                                                                    }
                                                                                    if (var251.field719 == 0) {
                                                                                        method3179(5, "", var251.field723 + class135.field2228);
                                                                                    }
                                                                                    var251.method3451();
                                                                                }
                                                                            }
                                                                            field470++;
                                                                            if (field470 > 50) {
                                                                                field498.method2355(9);
                                                                            }
                                                                            try {
                                                                                if (Statics.field355 != null && field498.field2030 > 0) {
                                                                                    Statics.field355.method1448(field498.field2036, 0, field498.field2030);
                                                                                    field498.field2030 = 0;
                                                                                    field470 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var255) {
                                                                                if (field577 > 0) {
                                                                                    method1476();
                                                                                } else {
                                                                                    method1(40);
                                                                                    Statics.field497 = Statics.field355;
                                                                                    Statics.field355 = null;
                                                                                }
                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        var198 = var197.field2;
                                                                        if (var198.field2603 < 0) {
                                                                            break;
                                                                        }
                                                                        var199 = class159.method1397(var198.field2613);
                                                                    } while (var199 == null || var199.field2595 == null || var198.field2603 >= var199.field2595.length || var199.field2595[var198.field2603] != var198);
                                                                    class26.method47(var197);
                                                                }
                                                            }
                                                            var195 = var194.field2;
                                                            if (var195.field2603 < 0) {
                                                                break;
                                                            }
                                                            var196 = class159.method1397(var195.field2613);
                                                        } while (var196 == null || var196.field2595 == null || var195.field2603 >= var196.field2595.length || var196.field2595[var195.field2603] != var195);
                                                        class26.method47(var194);
                                                    }
                                                }
                                                var192 = var191.field2;
                                                if (var192.field2603 < 0) {
                                                    break;
                                                }
                                                var193 = class159.method1397(var192.field2613);
                                            } while (var193 == null || var193.field2595 == null || var192.field2603 >= var193.field2595.length || var193.field2595[var192.field2603] != var192);
                                            class26.method47(var191);
                                        }
                                    }
                                    if (field547 >= 2 && class75.field1348[82] && Statics.field78 == 66) {
                                        String var188 = "";
                                        for (int var189 = 0; var189 < field684 && var189 < 100; var189++) {
                                            var188 = var188 + field551[var189] + ':' + field633[var189] + '\n';
                                        }
                                        Statics.field1113.setContents(new StringSelection(var188), (ClipboardOwner) null);
                                    } else {
                                        field694[field678] = Statics.field78;
                                        field679[field678] = Statics.field1405;
                                        field678++;
                                    }
                                }
                            }
                        } else if (field577 > 0) {
                            method1476();
                        } else {
                            method1(40);
                            Statics.field497 = Statics.field355;
                            Statics.field355 = null;
                        }
                    }
                }
            }
        } else if (field693 == 40) {
            method2077();
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method250() {
        boolean var1;
        label123: {
            try {
                if (class139.field2355 == 2) {
                    if (Statics.field2358 == null) {
                        Statics.field2358 = class140.method2796(Statics.field2361, Statics.field2353, Statics.field1298);
                        if (Statics.field2358 == null) {
                            var1 = false;
                            break label123;
                        }
                    }
                    if (Statics.field2359 == null) {
                        Statics.field2359 = new class58(Statics.field2354, Statics.field1750);
                    }
                    if (Statics.field2832.method2810(Statics.field2358, Statics.field2360, Statics.field2359, 22050)) {
                        Statics.field2832.method2811();
                        Statics.field2832.method2808(Statics.field1990);
                        Statics.field2832.method2813(Statics.field2358, Statics.field2467);
                        class139.field2355 = 0;
                        Statics.field2358 = null;
                        Statics.field2359 = null;
                        Statics.field2361 = null;
                        var1 = true;
                        break label123;
                    }
                }
            } catch (Exception var16) {
                var16.printStackTrace();
                Statics.field2832.method2925();
                class139.field2355 = 0;
                Statics.field2358 = null;
                Statics.field2359 = null;
                Statics.field2361 = null;
            }
            var1 = false;
        }
        if (var1 && field596 && Statics.field285 != null) {
            Statics.field285.method1206();
        }
        if (field1314) {
            class75.method2726(Statics.field1425);
            Canvas var4 = Statics.field1425;
            var4.removeMouseListener(class77.field1383);
            var4.removeMouseMotionListener(class77.field1383);
            var4.removeFocusListener(class77.field1383);
            class77.field1380 = 0;
            if (Statics.field1515 != null) {
                Statics.field1515.method1410(Statics.field1425);
            }
            this.method1479();
            Canvas var5 = Statics.field1425;
            var5.setFocusTraversalKeysEnabled(false);
            var5.addKeyListener(class75.field1363);
            var5.addFocusListener(class75.field1363);
            class77.method1655(Statics.field1425);
            if (Statics.field1515 != null) {
                Statics.field1515.method1401(Statics.field1425);
            }
        }
        if (field693 == 0) {
            class73.method210(class21.field290, class21.field307, (Color) null);
        } else if (field693 == 5) {
            class21.method148(Statics.field1039, Statics.field255);
        } else if (field693 == 10) {
            class21.method148(Statics.field1039, Statics.field255);
        } else if (field693 == 20) {
            class21.method148(Statics.field1039, Statics.field255);
        } else if (field693 == 25) {
            if (field505 == 1) {
                if (field511 > field512) {
                    field512 = field511;
                }
                int var6 = (field512 * 50 - field511 * 50) / field512;
                method2997(class135.field2096 + class2.field25 + class2.field20 + var6 + "%" + class2.field21, false);
            } else if (field505 == 2) {
                if (field513 > field514) {
                    field514 = field513;
                }
                int var7 = (field514 * 50 - field513 * 50) / field514 + 50;
                method2997(class135.field2096 + class2.field25 + class2.field20 + var7 + "%" + class2.field21, false);
            } else {
                method2997(class135.field2096, false);
            }
        } else if (field693 == 30) {
            method231();
        } else if (field693 == 40) {
            method2997(class135.field2124 + class2.field25 + class135.field2098, false);
        }
        if (field693 == 30 && field667 == 0 && !field1309) {
            try {
                Graphics var8 = Statics.field1425.getGraphics();
                for (int var9 = 0; var9 < field660; var9++) {
                    if (field661[var9]) {
                        Statics.field1514.method1658(var8, field663[var9], field664[var9], field454[var9], field666[var9]);
                        field661[var9] = false;
                    }
                }
            } catch (Exception var15) {
                Statics.field1425.repaint();
            }
        } else if (field693 > 0) {
            try {
                Graphics var11 = Statics.field1425.getGraphics();
                Statics.field1514.method1686(var11, 0, 0);
                field1309 = false;
                for (int var12 = 0; var12 < field660; var12++) {
                    field661[var12] = false;
                }
            } catch (Exception var14) {
                Statics.field1425.repaint();
            }
        }
    }

    @ObfuscatedName("client.u(S)V")
    public final void method251() {
        if (Statics.field1315 != null) {
            Statics.field1315.field236 = false;
        }
        Statics.field1315 = null;
        if (Statics.field355 != null) {
            Statics.field355.method1430();
            Statics.field355 = null;
        }
        class75.method1203();
        if (class77.field1383 != null) {
            class77 var1 = class77.field1383;
            synchronized (class77.field1383) {
                class77.field1383 = null;
            }
        }
        Statics.field1515 = null;
        if (Statics.field285 != null) {
            Statics.field285.method1199();
        }
        if (Statics.field2352 != null) {
            Statics.field2352.method1199();
        }
        class154.method2339();
        class158.method3207();
        class82.method1396();
    }

    @ObfuscatedName("p.s(II)V")
    public static void method1(int arg0) {
        if (field693 == arg0) {
            return;
        }
        if (field693 == 0) {
            class73.method682();
        }
        if (arg0 == 20 || arg0 == 40) {
            field519 = 0;
            field490 = 0;
            field491 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field497 != null) {
            Statics.field497.method1430();
            Statics.field497 = null;
        }
        if (field693 == 25) {
            field505 = 0;
            field511 = 0;
            field512 = 1;
            field513 = 0;
            field514 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            Canvas var1 = Statics.field1425;
            class155 var2 = Statics.field486;
            class155 var3 = Statics.field1179;
            if (!Statics.field318) {
                class89.method1829();
                byte[] var4 = var2.method3095("title.jpg", "");
                Statics.field2054 = new class86(var4, var1);
                Statics.field293 = Statics.field2054.method1720();
                Statics.field1991 = class84.method1593(var3, "logo", "");
                Statics.field306 = class84.method1593(var3, "titlebox", "");
                Statics.field291 = class84.method1593(var3, "titlebutton", "");
                Statics.field312 = class84.method2(var3, "runes", "");
                Statics.field323 = class84.method2(var3, "title_mute", "");
                Statics.field1669 = new int[256];
                for (int var5 = 0; var5 < 64; var5++) {
                    Statics.field1669[var5] = var5 * 262144;
                }
                for (int var6 = 0; var6 < 64; var6++) {
                    Statics.field1669[var6 + 64] = var6 * 1024 + 16711680;
                }
                for (int var7 = 0; var7 < 64; var7++) {
                    Statics.field1669[var7 + 128] = var7 * 4 + 16776960;
                }
                for (int var8 = 0; var8 < 64; var8++) {
                    Statics.field1669[var8 + 192] = 16777215;
                }
                Statics.field899 = new int[256];
                for (int var9 = 0; var9 < 64; var9++) {
                    Statics.field899[var9] = var9 * 1024;
                }
                for (int var10 = 0; var10 < 64; var10++) {
                    Statics.field899[var10 + 64] = var10 * 4 + 65280;
                }
                for (int var11 = 0; var11 < 64; var11++) {
                    Statics.field899[var11 + 128] = var11 * 262144 + 65535;
                }
                for (int var12 = 0; var12 < 64; var12++) {
                    Statics.field899[var12 + 192] = 16777215;
                }
                Statics.field2085 = new int[256];
                for (int var13 = 0; var13 < 64; var13++) {
                    Statics.field2085[var13] = var13 * 4;
                }
                for (int var14 = 0; var14 < 64; var14++) {
                    Statics.field2085[var14 + 64] = var14 * 262144 + 255;
                }
                for (int var15 = 0; var15 < 64; var15++) {
                    Statics.field2085[var15 + 128] = var15 * 1024 + 16711935;
                }
                for (int var16 = 0; var16 < 64; var16++) {
                    Statics.field2085[var16 + 192] = 16777215;
                }
                Statics.field1785 = new int[256];
                Statics.field923 = new int[32768];
                Statics.field300 = new int[32768];
                class21.method2340((class87) null);
                Statics.field301 = new int[32768];
                Statics.field2003 = new int[32768];
                class21.field308 = 0;
                class21.field317 = "";
                class21.field313 = "";
                class21.field316 = false;
                if (Statics.field948.field174) {
                    class139.field2355 = 1;
                    Statics.field2361 = null;
                    Statics.field2353 = -1;
                    Statics.field1298 = -1;
                    Statics.field1990 = 0;
                    Statics.field2467 = false;
                    Statics.field1299 = 2;
                } else {
                    class155 var17 = Statics.field743;
                    int var18 = var17.method3093("scape main");
                    int var19 = var17.method3094(var18, "");
                    class139.field2355 = 1;
                    Statics.field2361 = var17;
                    Statics.field2353 = var18;
                    Statics.field1298 = var19;
                    Statics.field1990 = 255;
                    Statics.field2467 = false;
                    Statics.field1299 = 2;
                }
                class154.method147(false);
                Statics.field318 = true;
                Statics.field2054.method1729(0, 0);
                Statics.field293.method1729(382, 0);
                Statics.field1991.method1819(382 - Statics.field1991.field1474 / 2, 18);
            }
        } else if (Statics.field318) {
            Statics.field306 = null;
            Statics.field291 = null;
            Statics.field312 = null;
            Statics.field2054 = null;
            Statics.field293 = null;
            Statics.field1991 = null;
            Statics.field323 = null;
            Statics.field741 = null;
            Statics.field1651 = null;
            Statics.field1031 = null;
            Statics.field197 = null;
            Statics.field257 = null;
            Statics.field1669 = null;
            Statics.field899 = null;
            Statics.field2085 = null;
            Statics.field1785 = null;
            Statics.field923 = null;
            Statics.field300 = null;
            Statics.field301 = null;
            Statics.field2003 = null;
            class139.field2355 = 1;
            Statics.field2361 = null;
            Statics.field2353 = -1;
            Statics.field1298 = -1;
            Statics.field1990 = 0;
            Statics.field2467 = false;
            Statics.field1299 = 2;
            class154.method147(true);
            Statics.field318 = false;
        }
        field693 = arg0;
    }

    @ObfuscatedName("client.e(I)V")
    public void method306() {
        if (field693 != 1000) {
            boolean var1 = class154.method242();
            if (!var1) {
                this.method253();
            }
        }
    }

    @ObfuscatedName("client.r(B)V")
    public void method253() {
        if (class154.field2560 >= 4) {
            this.method1519("js5crc");
            field693 = 1000;
            return;
        }
        if (class154.field2561 >= 4) {
            if (field693 <= 5) {
                this.method1519("js5io");
                field693 = 1000;
                return;
            }
            field544 = 3000;
            class154.field2561 = 3;
        }
        if (--field544 + 1 > 0) {
            return;
        }
        try {
            if (field483 == 0) {
                Statics.field2833 = Statics.field2345.method1552(Statics.field263, Statics.field1262);
                field483++;
            }
            if (field483 == 1) {
                if (Statics.field2833.field1396 == 2) {
                    this.method254(-1);
                    return;
                }
                if (Statics.field2833.field1396 == 1) {
                    field483++;
                }
            }
            if (field483 == 2) {
                Statics.field1671 = new class70((Socket) Statics.field2833.field1398, Statics.field2345);
                class127 var1 = new class127(5);
                var1.method2484(15);
                var1.method2487(37);
                Statics.field1671.method1448(var1.field2036, 0, 5);
                field483++;
                Statics.field325 = class121.method548();
            }
            if (field483 == 3) {
                if (field693 <= 5 || Statics.field1671.method1429() > 0) {
                    int var2 = Statics.field1671.method1431();
                    if (var2 != 0) {
                        this.method254(var2);
                        return;
                    }
                    field483++;
                } else if (class121.method548() - Statics.field325 > 30000L) {
                    this.method254(-2);
                    return;
                }
            }
            if (field483 == 4) {
                class154.method197(Statics.field1671, field693 > 20);
                Statics.field2833 = null;
                Statics.field1671 = null;
                field483 = 0;
                field488 = 0;
            }
        } catch (IOException var4) {
            this.method254(-3);
        }
    }

    @ObfuscatedName("client.n(II)V")
    public void method254(int arg0) {
        Statics.field2833 = null;
        Statics.field1671 = null;
        field483 = 0;
        if (Statics.field1658 == Statics.field1262) {
            Statics.field1262 = Statics.field2406;
        } else {
            Statics.field1262 = Statics.field1658;
        }
        field488++;
        if (field488 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field693 <= 5) {
                this.method1519("js5connect_full");
                field693 = 1000;
            } else {
                field544 = 3000;
            }
        } else if (field488 >= 2 && arg0 == 6) {
            this.method1519("js5connect_outofdate");
            field693 = 1000;
        } else if (field488 >= 4) {
            if (field693 <= 5) {
                this.method1519("js5connect");
                field693 = 1000;
            } else {
                field544 = 3000;
            }
        }
    }

    @ObfuscatedName("al.g(S)V")
    public static void method826() {
        if (field553 == 0) {
            Statics.field163 = new class95(4, 104, 104, class9.field126);
            for (int var0 = 0; var0 < 4; var0++) {
                field516[var0] = new class130(104, 104);
            }
            Statics.field1817 = new class86(512, 512);
            class21.field307 = class135.field2194;
            class21.field290 = 5;
            field553 = 20;
        } else if (field553 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1779[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1938(var1, 500, 800, 512, 334);
            class21.field307 = class135.field2296;
            class21.field290 = 10;
            field553 = 30;
        } else if (field553 == 30) {
            Statics.field485 = method1900(0, false, true, true);
            Statics.field1523 = method1900(1, false, true, true);
            Statics.field1667 = method1900(2, true, false, true);
            Statics.field1506 = method1900(3, false, true, true);
            Statics.field1642 = method1900(4, false, true, true);
            Statics.field1361 = method1900(5, true, true, true);
            Statics.field743 = method1900(6, true, true, false);
            Statics.field1390 = method1900(7, false, true, true);
            Statics.field1179 = method1900(8, false, true, true);
            Statics.field1268 = method1900(9, false, true, true);
            Statics.field486 = method1900(10, false, true, true);
            Statics.field487 = method1900(11, false, true, true);
            Statics.field950 = method1900(12, false, true, true);
            Statics.field2028 = method1900(13, true, false, true);
            Statics.field1034 = method1900(14, false, true, false);
            Statics.field328 = method1900(15, false, true, true);
            class21.field307 = class135.field2321;
            class21.field290 = 20;
            field553 = 40;
        } else if (field553 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field485.method3181() * 4 / 100;
            int var8 = var7 + Statics.field1523.method3181() * 4 / 100;
            int var9 = var8 + Statics.field1667.method3181() * 2 / 100;
            int var10 = var9 + Statics.field1506.method3181() * 2 / 100;
            int var11 = var10 + Statics.field1642.method3181() * 6 / 100;
            int var12 = var11 + Statics.field1361.method3181() * 4 / 100;
            int var13 = var12 + Statics.field743.method3181() * 2 / 100;
            int var14 = var13 + Statics.field1390.method3181() * 60 / 100;
            int var15 = var14 + Statics.field1179.method3181() * 2 / 100;
            int var16 = var15 + Statics.field1268.method3181() * 2 / 100;
            int var17 = var16 + Statics.field486.method3181() * 2 / 100;
            int var18 = var17 + Statics.field487.method3181() * 2 / 100;
            int var19 = var18 + Statics.field950.method3181() * 2 / 100;
            int var20 = var19 + Statics.field2028.method3181() * 2 / 100;
            int var21 = var20 + Statics.field1034.method3181() * 2 / 100;
            int var22 = var21 + Statics.field328.method3181() * 2 / 100;
            if (var22 == 100) {
                class21.field307 = class135.field2134;
                class21.field290 = 30;
                field553 = 45;
            } else {
                if (var22 != 0) {
                    class21.field307 = class135.field2102 + var22 + "%";
                }
                class21.field290 = 30;
            }
        } else if (field553 == 45) {
            boolean var23 = !field623;
            Statics.field1099 = 22050;
            Statics.field1368 = var23;
            Statics.field1091 = 2;
            class142 var24 = new class142();
            var24.method2816(9, 128);
            Statics.field285 = class52.method546(Statics.field2345, Statics.field1425, 0, 22050);
            Statics.field285.method1200(var24);
            class155 var25 = Statics.field328;
            class155 var26 = Statics.field1034;
            class155 var27 = Statics.field1642;
            Statics.field2360 = var25;
            Statics.field1750 = var26;
            Statics.field2354 = var27;
            Statics.field2832 = var24;
            Statics.field2352 = class52.method546(Statics.field2345, Statics.field1425, 1, 2048);
            Statics.field2522 = new class46();
            Statics.field2352.method1200(Statics.field2522);
            Statics.field90 = new class62(22050, Statics.field1099);
            class21.field307 = class135.field2189;
            class21.field290 = 35;
            field553 = 50;
        } else if (field553 == 50) {
            int var28 = 0;
            if (Statics.field255 == null) {
                class155 var29 = Statics.field1179;
                class155 var30 = Statics.field2028;
                int var31 = var29.method3093("p11_full");
                int var32 = var29.method3094(var31, "");
                class183 var33;
                if (class84.method24(var29, var31, var32)) {
                    var33 = Statics.method638(var30.method3078(var31, var32));
                } else {
                    var33 = null;
                }
                Statics.field255 = var33;
            } else {
                var28++;
            }
            if (Statics.field2002 == null) {
                class155 var35 = Statics.field1179;
                class155 var36 = Statics.field2028;
                int var37 = var35.method3093("p12_full");
                int var38 = var35.method3094(var37, "");
                class183 var39;
                if (class84.method24(var35, var37, var38)) {
                    var39 = Statics.method638(var36.method3078(var37, var38));
                } else {
                    var39 = null;
                }
                Statics.field2002 = var39;
            } else {
                var28++;
            }
            if (Statics.field1039 == null) {
                class155 var41 = Statics.field1179;
                class155 var42 = Statics.field2028;
                int var43 = var41.method3093("b12_full");
                int var44 = var41.method3094(var43, "");
                class183 var45;
                if (class84.method24(var41, var43, var44)) {
                    var45 = Statics.method638(var42.method3078(var43, var44));
                } else {
                    var45 = null;
                }
                Statics.field1039 = var45;
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field307 = class135.field2090 + var28 * 100 / 3 + "%";
                class21.field290 = 40;
            } else {
                Statics.field344 = new class152(true);
                class21.field307 = class135.field2106;
                class21.field290 = 40;
                field553 = 60;
            }
        } else if (field553 == 60) {
            class155 var47 = Statics.field486;
            class155 var48 = Statics.field1179;
            int var49 = 0;
            if (var47.method3096("title.jpg", "")) {
                var49++;
            }
            if (var48.method3096("logo", "")) {
                var49++;
            }
            if (var48.method3096("titlebox", "")) {
                var49++;
            }
            if (var48.method3096("titlebutton", "")) {
                var49++;
            }
            if (var48.method3096("runes", "")) {
                var49++;
            }
            if (var48.method3096("title_mute", "")) {
                var49++;
            }
            var48.method3096("sl_back", "");
            var48.method3096("sl_flags", "");
            var48.method3096("sl_arrows", "");
            var48.method3096("sl_stars", "");
            var48.method3096("sl_button", "");
            byte var52 = 6;
            if (var49 < var52) {
                class21.field307 = class135.field2107 + var49 * 100 / var52 + "%";
                class21.field290 = 50;
            } else {
                class21.field307 = class135.field2238;
                class21.field290 = 50;
                method1(5);
                field553 = 70;
            }
        } else if (field553 == 70) {
            if (Statics.field1667.method3082()) {
                class37.method1895(Statics.field1667);
                class155 var54 = Statics.field1667;
                Statics.field861 = var54;
                class36.method195(Statics.field1667, Statics.field1390);
                class155 var55 = Statics.field1667;
                class155 var56 = Statics.field1390;
                boolean var57 = field623;
                Statics.field795 = var55;
                Statics.field796 = var56;
                class32.field824 = var57;
                class155 var58 = Statics.field1667;
                class155 var59 = Statics.field1390;
                Statics.field760 = var58;
                Statics.field789 = var59;
                class40.method3033(Statics.field1667, Statics.field1390, field460, Statics.field255);
                class34.method32(Statics.field1667, Statics.field485, Statics.field1523);
                class155 var60 = Statics.field1667;
                class155 var61 = Statics.field1390;
                Statics.field904 = var60;
                Statics.field2822 = var61;
                class155 var62 = Statics.field1667;
                Statics.field941 = var62;
                class155 var63 = Statics.field1667;
                Statics.field1040 = var63;
                Statics.field1028 = Statics.field1040.method3117(16);
                class155 var64 = Statics.field1506;
                class155 var65 = Statics.field1390;
                class155 var66 = Statics.field1179;
                class155 var67 = Statics.field2028;
                Statics.field1752 = var64;
                Statics.field2720 = var65;
                Statics.field2596 = var66;
                Statics.field2874 = var67;
                Statics.field1921 = new class159[Statics.field1752.method3099()][];
                Statics.field2471 = new boolean[Statics.field1752.method3099()];
                class41.method115(Statics.field1667);
                class39.method22(Statics.field1667);
                class21.field307 = class135.field2110;
                class21.field290 = 60;
                field553 = 80;
            } else {
                class21.field307 = class135.field2199 + Statics.field1667.method3187() + "%";
                class21.field290 = 60;
            }
        } else if (field553 == 80) {
            int var68 = 0;
            if (Statics.field2086 == null) {
                Statics.field2086 = class84.method221(Statics.field1179, "compass", "");
            } else {
                var68++;
            }
            if (Statics.field369 == null) {
                Statics.field369 = class84.method221(Statics.field1179, "mapedge", "");
            } else {
                var68++;
            }
            if (Statics.field910 == null) {
                Statics.field910 = class84.method2(Statics.field1179, "mapscene", "");
            } else {
                var68++;
            }
            if (Statics.field1614 == null) {
                Statics.field1614 = class84.method2338(Statics.field1179, "mapfunction", "");
            } else {
                var68++;
            }
            if (Statics.field951 == null) {
                Statics.field951 = class84.method2338(Statics.field1179, "hitmarks", "");
            } else {
                var68++;
            }
            if (Statics.field234 == null) {
                Statics.field234 = class84.method2338(Statics.field1179, "headicons_pk", "");
            } else {
                var68++;
            }
            if (Statics.field965 == null) {
                Statics.field965 = class84.method2338(Statics.field1179, "headicons_prayer", "");
            } else {
                var68++;
            }
            if (Statics.field1016 == null) {
                Statics.field1016 = class84.method2338(Statics.field1179, "headicons_hint", "");
            } else {
                var68++;
            }
            if (Statics.field172 == null) {
                Statics.field172 = class84.method2338(Statics.field1179, "mapmarker", "");
            } else {
                var68++;
            }
            if (Statics.field381 == null) {
                Statics.field381 = class84.method2338(Statics.field1179, "cross", "");
            } else {
                var68++;
            }
            if (Statics.field368 == null) {
                Statics.field368 = class84.method2338(Statics.field1179, "mapdots", "");
            } else {
                var68++;
            }
            if (Statics.field99 == null) {
                Statics.field99 = class84.method2(Statics.field1179, "scrollbar", "");
            } else {
                var68++;
            }
            if (Statics.field27 == null) {
                Statics.field27 = class84.method2(Statics.field1179, "mod_icons", "");
            } else {
                var68++;
            }
            if (Statics.field244 == null) {
                Statics.field244 = class84.method1593(Statics.field1179, "mapback", "");
            } else {
                var68++;
            }
            if (var68 < 14) {
                class21.field307 = class135.field2268 + var68 * 100 / 14 + "%";
                class21.field290 = 70;
            } else {
                Statics.field2846 = Statics.field27;
                Statics.field369.method1723();
                int var69 = (int) (Math.random() * 21.0D) - 10;
                int var70 = (int) (Math.random() * 21.0D) - 10;
                int var71 = (int) (Math.random() * 21.0D) - 10;
                int var72 = (int) (Math.random() * 41.0D) - 20;
                for (int var73 = 0; var73 < Statics.field1614.length; var73++) {
                    Statics.field1614[var73].method1722(var69 + var72, var70 + var72, var71 + var72);
                }
                Statics.field910[0].method1812(var69 + var72, var70 + var72, var71 + var72);
                Statics.field1751 = new int[33];
                Statics.field387 = new int[33];
                Statics.field2470 = new int[151];
                Statics.field756 = new int[151];
                for (int var74 = 0; var74 < 33; var74++) {
                    int var75 = 999;
                    int var76 = 0;
                    for (int var77 = 0; var77 < 34; var77++) {
                        if (Statics.field244.field1476[Statics.field244.field1474 * var74 + var77] == 0) {
                            if (var75 == 999) {
                                var75 = var77;
                            }
                        } else if (var75 != 999) {
                            var76 = var77;
                            break;
                        }
                    }
                    Statics.field1751[var74] = var75;
                    Statics.field387[var74] = var76 - var75;
                }
                for (int var78 = 5; var78 < 156; var78++) {
                    int var79 = 999;
                    int var80 = 0;
                    for (int var81 = 25; var81 < 172; var81++) {
                        if (Statics.field244.field1476[Statics.field244.field1474 * var78 + var81] == 0 && (var81 > 34 || var78 > 34)) {
                            if (var79 == 999) {
                                var79 = var81;
                            }
                        } else if (var79 != 999) {
                            var80 = var81;
                            break;
                        }
                    }
                    Statics.field2470[var78 - 5] = var79 - 25;
                    Statics.field756[var78 - 5] = var80 - var79;
                }
                class21.field307 = class135.field2112;
                class21.field290 = 70;
                field553 = 90;
            }
        } else if (field553 == 90) {
            if (Statics.field1268.method3082()) {
                class110 var82 = new class110(Statics.field1268, Statics.field1179, 20, 0.8D, field623 ? 64 : 128);
                class104.method2177(var82);
                class104.method2175(0.8D);
                class21.field307 = class135.field2170;
                class21.field290 = 90;
                field553 = 110;
            } else {
                class21.field307 = class135.field2121 + Statics.field1268.method3187() + "%";
                class21.field290 = 90;
            }
        } else if (field553 == 110) {
            Statics.field1315 = new class16();
            Statics.field2345.method1549(Statics.field1315, 10);
            class21.field307 = class135.field2295;
            class21.field290 = 94;
            field553 = 120;
        } else if (field553 == 120) {
            if (Statics.field486.method3096("huffman", "")) {
                class120 var83 = new class120(Statics.field486.method3095("huffman", ""));
                Statics.field2836 = var83;
                class21.field307 = class135.field2144;
                class21.field290 = 96;
                field553 = 130;
            } else {
                class21.field307 = class135.field2116 + "%";
                class21.field290 = 96;
            }
        } else if (field553 == 130) {
            if (!Statics.field1506.method3082()) {
                class21.field307 = class135.field2118 + Statics.field1506.method3187() * 4 / 5 + "%";
                class21.field290 = 100;
            } else if (!Statics.field950.method3082()) {
                class21.field307 = class135.field2118 + (80 + Statics.field950.method3187() / 6) + "%";
                class21.field290 = 100;
            } else if (Statics.field2028.method3082()) {
                class21.field307 = class135.field2119;
                class21.field290 = 100;
                field553 = 140;
            } else {
                class21.field307 = class135.field2118 + (96 + Statics.field2028.method3187() / 20) + "%";
                class21.field290 = 100;
            }
        } else if (field553 == 140) {
            method1(10);
        }
    }

    @ObfuscatedName("cy.c(IZZZI)Leu;")
    public static class155 method1900(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1428 != null) {
            var4 = new class71(arg0, class82.field1428, Statics.field2731[arg0], 1000000);
        }
        return new class155(var4, Statics.field2339, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("cf.v(I)V")
    public static final void method2077() {
        try {
            if (field519 == 0) {
                if (Statics.field355 != null) {
                    Statics.field355.method1430();
                    Statics.field355 = null;
                }
                Statics.field1827 = null;
                field509 = false;
                field490 = 0;
                field519 = 1;
            }
            if (field519 == 1) {
                if (Statics.field1827 == null) {
                    Statics.field1827 = Statics.field2345.method1552(Statics.field263, Statics.field1262);
                }
                if (Statics.field1827.field1396 == 2) {
                    throw new IOException();
                }
                if (Statics.field1827.field1396 == 1) {
                    Statics.field355 = new class70((Socket) Statics.field1827.field1398, Statics.field2345);
                    Statics.field1827 = null;
                    field519 = 2;
                }
            }
            if (field519 == 2) {
                field498.field2030 = 0;
                field498.method2484(14);
                Statics.field355.method1448(field498.field2036, 0, 1);
                field500.field2030 = 0;
                field519 = 3;
            }
            if (field519 == 3) {
                if (Statics.field285 != null) {
                    Statics.field285.method1198();
                }
                if (Statics.field2352 != null) {
                    Statics.field2352.method1198();
                }
                int var0 = Statics.field355.method1431();
                if (Statics.field285 != null) {
                    Statics.field285.method1198();
                }
                if (Statics.field2352 != null) {
                    Statics.field2352.method1198();
                }
                if (var0 != 0) {
                    method704(var0);
                    return;
                }
                field500.field2030 = 0;
                field519 = 5;
            }
            if (field519 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field498.field2030 = 0;
                field498.method2484(10);
                field498.method2487(var1[0]);
                field498.method2487(var1[1]);
                field498.method2487(var1[2]);
                field498.method2487(var1[3]);
                field498.method2510(0L);
                field498.method2682(class21.field313);
                field498.method2516(class6.field82, class6.field74);
                field499.field2030 = 0;
                if (field693 == 40) {
                    field499.method2484(18);
                } else {
                    field499.method2484(16);
                }
                field499.method2485(0);
                int var2 = field499.field2030;
                field499.method2487(37);
                field499.method2492(field498.field2036, 0, field498.field2030);
                int var3 = field499.field2030;
                field499.method2682(class21.field317);
                field499.method2484(field623 ? 1 : 0);
                class82.method1563(field499);
                class127 var4 = new class127(Statics.field344.method3066());
                Statics.field344.method3064(var4);
                field499.method2492(var4.field2036, 0, var4.field2036.length);
                field499.method2487(Statics.field485.field2537);
                field499.method2487(Statics.field1523.field2537);
                field499.method2487(Statics.field1667.field2537);
                field499.method2487(Statics.field1506.field2537);
                field499.method2487(Statics.field1642.field2537);
                field499.method2487(Statics.field1361.field2537);
                field499.method2487(Statics.field743.field2537);
                field499.method2487(Statics.field1390.field2537);
                field499.method2487(Statics.field1179.field2537);
                field499.method2487(Statics.field1268.field2537);
                field499.method2487(Statics.field486.field2537);
                field499.method2487(Statics.field487.field2537);
                field499.method2487(Statics.field950.field2537);
                field499.method2487(Statics.field2028.field2537);
                field499.method2487(Statics.field1034.field2537);
                field499.method2487(Statics.field328.field2537);
                field499.method2514(var1, var3, field499.field2030);
                field499.method2494(field499.field2030 - var2);
                Statics.field355.method1448(field499.field2036, 0, field499.field2030);
                field498.method2370(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field500.method2370(var1);
                field519 = 6;
            }
            if (field519 == 6 && Statics.field355.method1429() > 0) {
                int var6 = Statics.field355.method1431();
                if (var6 == 21 && field693 == 20) {
                    field519 = 7;
                } else if (var6 == 2) {
                    field519 = 9;
                } else if (var6 == 15 && field693 == 40) {
                    field498.field2030 = 0;
                    field500.field2030 = 0;
                    field659 = -1;
                    field680 = -1;
                    field507 = -1;
                    field568 = -1;
                    field533 = 0;
                    field503 = 0;
                    field472 = 0;
                    field471 = 0;
                    field455 = false;
                    field691 = 0;
                    field634 = 0;
                    for (int var7 = 0; var7 < field506.length; var7++) {
                        if (field506[var7] != null) {
                            field506[var7].field416 = -1;
                        }
                    }
                    for (int var8 = 0; var8 < field494.length; var8++) {
                        if (field494[var8] != null) {
                            field494[var8].field416 = -1;
                        }
                    }
                    class19.field272 = new class175(32);
                    method1(30);
                    for (int var9 = 0; var9 < 100; var9++) {
                        field493[var9] = true;
                    }
                    return;
                } else if (var6 == 23 && field491 < 1) {
                    field491++;
                    field519 = 0;
                } else {
                    method704(var6);
                    return;
                }
            }
            if (field519 == 7 && Statics.field355.method1429() > 0) {
                field492 = (Statics.field355.method1431() + 3) * 60;
                field519 = 8;
            }
            if (field519 == 8) {
                field490 = 0;
                class21.method1452(class135.field2120, class135.field2227, field492 / 60 + class135.field2122);
                if (--field492 <= 0) {
                    field519 = 0;
                }
            } else {
                if (field519 == 9 && Statics.field355.method1429() >= 8) {
                    field547 = Statics.field355.method1431();
                    field461 = Statics.field355.method1431() == 1;
                    field646 = Statics.field355.method1431();
                    field646 <<= 0x8;
                    field646 += Statics.field355.method1431();
                    field583 = Statics.field355.method1431();
                    Statics.field355.method1433(field500.field2036, 0, 1);
                    field500.field2030 = 0;
                    field659 = field500.method2354();
                    Statics.field355.method1433(field500.field2036, 0, 2);
                    field500.field2030 = 0;
                    field533 = field500.method2581();
                    if (field583 == 1) {
                        try {
                            class67.method1416(Statics.field453, "zap");
                        } catch (Throwable var29) {
                        }
                    } else {
                        try {
                            class67.method1416(Statics.field453, "unzap");
                        } catch (Throwable var28) {
                        }
                    }
                    field519 = 10;
                }
                if (field519 != 10) {
                    field490++;
                    if (field490 > 2000) {
                        if (field491 < 1) {
                            if (Statics.field1658 == Statics.field1262) {
                                Statics.field1262 = Statics.field2406;
                            } else {
                                Statics.field1262 = Statics.field1658;
                            }
                            field491++;
                            field519 = 0;
                        } else {
                            method704(-3);
                        }
                    }
                } else if (Statics.field355.method1429() >= field533) {
                    field500.field2030 = 0;
                    Statics.field355.method1433(field500.field2036, 0, field533);
                    field466 = -1L;
                    field690 = -1;
                    Statics.field1315.field233 = 0;
                    Statics.field1430 = true;
                    field552 = true;
                    field681 = -1L;
                    class182.field2831 = new class177();
                    field498.field2030 = 0;
                    field500.field2030 = 0;
                    field659 = -1;
                    field680 = -1;
                    field507 = -1;
                    field568 = -1;
                    field503 = 0;
                    field472 = 0;
                    field577 = 0;
                    field473 = 0;
                    field471 = 0;
                    field455 = false;
                    class77.method1599(0);
                    for (int var12 = 0; var12 < 100; var12++) {
                        field633[var12] = null;
                    }
                    field684 = 0;
                    field672 = 0;
                    field612 = false;
                    field697 = 0;
                    field520 = (int) (Math.random() * 100.0D) - 50;
                    field522 = (int) (Math.random() * 110.0D) - 55;
                    field524 = (int) (Math.random() * 80.0D) - 40;
                    field527 = (int) (Math.random() * 120.0D) - 60;
                    field501 = (int) (Math.random() * 30.0D) - 20;
                    field540 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field691 = 0;
                    field566 = -1;
                    field634 = 0;
                    field587 = 0;
                    field570 = 0;
                    field495 = 0;
                    for (int var13 = 0; var13 < 2048; var13++) {
                        field506[var13] = null;
                        field581[var13] = null;
                    }
                    for (int var14 = 0; var14 < 32768; var14++) {
                        field494[var14] = null;
                    }
                    Statics.field905 = field506[2047] = new class3();
                    field592.method3449();
                    field578.method3449();
                    for (int var15 = 0; var15 < 4; var15++) {
                        for (int var16 = 0; var16 < 104; var16++) {
                            for (int var17 = 0; var17 < 104; var17++) {
                                field653[var15][var16][var17] = null;
                            }
                        }
                    }
                    field597 = new class177();
                    field644 = 0;
                    field709 = 0;
                    field713 = 0;
                    for (int var18 = 0; var18 < Statics.field1028; var18++) {
                        class42 var19 = class42.method1457(var18);
                        if (var19 != null && var19.field1030 == 0) {
                            class160.field2722[var18] = 0;
                            class160.field2725[var18] = 0;
                        }
                    }
                    for (int var20 = 0; var20 < field650.length; var20++) {
                        field650[var20] = -1;
                    }
                    if (field711 != -1) {
                        int var21 = field711;
                        if (var21 != -1 && Statics.field2471[var21]) {
                            Statics.field1752.method3077(var21);
                            if (Statics.field1921[var21] != null) {
                                boolean var22 = true;
                                for (int var23 = 0; var23 < Statics.field1921[var21].length; var23++) {
                                    if (Statics.field1921[var21][var23] != null) {
                                        if (Statics.field1921[var21][var23].field2705 == 2) {
                                            var22 = false;
                                        } else {
                                            Statics.field1921[var21][var23] = null;
                                        }
                                    }
                                }
                                if (var22) {
                                    Statics.field1921[var21] = null;
                                }
                                Statics.field2471[var21] = false;
                            }
                        }
                    }
                    for (class4 var24 = (class4) field617.method3408(); var24 != null; var24 = (class4) field617.method3415()) {
                        method207(var24, true);
                    }
                    field711 = -1;
                    field617 = new class175(8);
                    field620 = null;
                    field455 = false;
                    field471 = 0;
                    field510.method3348((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var25 = 0; var25 < 8; var25++) {
                        field622[var25] = null;
                        field588[var25] = false;
                    }
                    class19.field272 = new class175(32);
                    field464 = true;
                    for (int var26 = 0; var26 < 100; var26++) {
                        field493[var26] = true;
                    }
                    field682 = null;
                    Statics.field1928 = 0;
                    Statics.field67 = null;
                    Statics.field243 = -1;
                    method755(false);
                    field659 = -1;
                }
            }
        } catch (IOException var30) {
            if (field491 < 1) {
                if (Statics.field1658 == Statics.field1262) {
                    Statics.field1262 = Statics.field2406;
                } else {
                    Statics.field1262 = Statics.field1658;
                }
                field491++;
                field519 = 0;
            } else {
                method704(-2);
            }
        }
    }

    @ObfuscatedName("aw.b(IB)V")
    public static void method704(int arg0) {
        if (arg0 == -3) {
            class21.method1452(class135.field2146, class135.field2323, class135.field2125);
        } else if (arg0 == -2) {
            class21.method1452(class135.field2126, class135.field2104, class135.field2128);
        } else if (arg0 == -1) {
            class21.method1452(class135.field2273, class135.field2130, class135.field2131);
        } else if (arg0 == 3) {
            class21.method1452(class135.field2242, class135.field2133, class135.field2117);
        } else if (arg0 == 4) {
            class21.method1452(class135.field2135, class135.field2136, class135.field2164);
        } else if (arg0 == 5) {
            class21.method1452(class135.field2138, class135.field2155, class135.field2231);
        } else if (arg0 == 6) {
            class21.method1452(class135.field2141, class135.field2142, class135.field2143);
        } else if (arg0 == 7) {
            class21.method1452(class135.field2140, class135.field2145, class135.field2097);
        } else if (arg0 == 8) {
            class21.method1452(class135.field2147, class135.field2148, class135.field2137);
        } else if (arg0 == 9) {
            class21.method1452(class135.field2150, class135.field2151, class135.field2152);
        } else if (arg0 == 10) {
            class21.method1452(class135.field2267, class135.field2149, class135.field2188);
        } else if (arg0 == 11) {
            class21.method1452(class135.field2156, class135.field2157, class135.field2158);
        } else if (arg0 == 12) {
            class21.method1452(class135.field2159, class135.field2232, class135.field2258);
        } else if (arg0 == 13) {
            class21.method1452(class135.field2162, class135.field2163, class135.field2100);
        } else if (arg0 == 14) {
            class21.method1452(class135.field2165, class135.field2317, class135.field2298);
        } else if (arg0 == 16) {
            class21.method1452(class135.field2259, class135.field2169, class135.field2174);
        } else if (arg0 == 17) {
            class21.method1452(class135.field2171, class135.field2172, class135.field2173);
        } else if (arg0 == 18) {
            class21.method1452(class135.field2304, class135.field2175, class135.field2176);
        } else if (arg0 == 19) {
            class21.method1452(class135.field2177, class135.field2178, class135.field2179);
        } else if (arg0 == 20) {
            class21.method1452(class135.field2180, class135.field2092, class135.field2182);
        } else if (arg0 == 22) {
            class21.method1452(class135.field2183, class135.field2184, class135.field2185);
        } else if (arg0 == 23) {
            class21.method1452(class135.field2186, class135.field2205, class135.field2275);
        } else if (arg0 == 24) {
            class21.method1452(class135.field2109, class135.field2190, class135.field2191);
        } else if (arg0 == 25) {
            class21.method1452(class135.field2206, class135.field2193, class135.field2263);
        } else if (arg0 == 26) {
            class21.method1452(class135.field2195, class135.field2196, class135.field2197);
        } else if (arg0 == 27) {
            class21.method1452(class135.field2198, class135.field2225, class135.field2200);
        } else if (arg0 == 31) {
            class21.method1452(class135.field2207, class135.field2208, class135.field2257);
        } else if (arg0 == 32) {
            class21.method1452(class135.field2209, class135.field2211, class135.field2089);
        } else if (arg0 == 37) {
            class21.method1452(class135.field2213, class135.field2214, class135.field2215);
        } else if (arg0 == 38) {
            class21.method1452(class135.field2111, class135.field2217, class135.field2101);
        } else if (arg0 == 55) {
            class21.method1452(class135.field2219, class135.field2220, class135.field2221);
        } else {
            class21.method1452(class135.field2222, class135.field2223, class135.field2224);
        }
        method1(10);
    }

    @ObfuscatedName("bv.k(B)V")
    public static final void method1476() {
        if (Statics.field355 != null) {
            Statics.field355.method1430();
            Statics.field355 = null;
        }
        method601();
        Statics.field163.method2058();
        for (int var0 = 0; var0 < 4; var0++) {
            field516[var0].method2725();
        }
        System.gc();
        class139.field2355 = 1;
        Statics.field2361 = null;
        Statics.field2353 = -1;
        Statics.field1298 = -1;
        Statics.field1990 = 0;
        Statics.field2467 = false;
        Statics.field1299 = 2;
        field538 = -1;
        field596 = false;
        Statics.method906();
        method1(10);
    }

    @ObfuscatedName("at.t(I)V")
    public static final void method601() {
        class37.field939.method3360();
        class33.field859.method3360();
        class36.method3();
        class32.field831.method3360();
        class32.field798.method3360();
        class32.field803.method3360();
        class32.field800.method3360();
        class31.method3031();
        class40.method10();
        class34.field885.method3360();
        class34.field886.method3360();
        class35.method98();
        class38.method2764();
        class42.method17();
        class164.field2749.method3360();
        class159.field2597.method3360();
        class159.field2710.method3360();
        class159.field2639.method3360();
        ((class110) Statics.field1776).method2254();
        class5.field59.method3360();
        Statics.field485.method3091();
        Statics.field1523.method3091();
        Statics.field1506.method3091();
        Statics.field1642.method3091();
        Statics.field1361.method3091();
        Statics.field743.method3091();
        Statics.field1390.method3091();
        Statics.field1179.method3091();
        Statics.field1268.method3091();
        Statics.field486.method3091();
        Statics.field487.method3091();
        Statics.field950.method3091();
    }

    @ObfuscatedName("bi.f(B)V")
    public static final void method1422() {
        if (Statics.field2352 != null) {
            Statics.field2352.method1197();
        }
        if (Statics.field285 != null) {
            Statics.field285.method1197();
        }
    }

    @ObfuscatedName("i.h(B)V")
    public static final void method48() {
        for (int var0 = 0; var0 < field697; var0++) {
            int var10002 = field700[var0]--;
            if (field700[var0] >= -10) {
                class57 var2 = field702[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1299(Statics.field1642, field718[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field700[var0] += var2.method1301();
                    field702[var0] = var2;
                }
                if (field700[var0] < 0) {
                    int var9;
                    if (field701[var0] == 0) {
                        var9 = field695;
                    } else {
                        int var3 = (field701[var0] & 0xFF) * 128;
                        int var4 = field701[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field905.field404;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field701[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field905.field394;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field700[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field688 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1304().method1371(Statics.field90);
                        class45 var11 = class45.method967(var10, 100, var9);
                        var11.method970(field699[var0] - 1);
                        Statics.field2522.method1143(var11);
                    }
                    field700[var0] = -100;
                }
            } else {
                field697--;
                for (int var1 = var0; var1 < field697; var1++) {
                    field718[var1] = field718[var1 + 1];
                    field702[var1] = field702[var1 + 1];
                    field699[var1] = field699[var1 + 1];
                    field700[var1] = field700[var1 + 1];
                    field701[var1] = field701[var1 + 1];
                }
                var0--;
            }
        }
        if (!field596) {
            return;
        }
        boolean var12;
        if (class139.field2355 == 0) {
            var12 = Statics.field2832.method2815();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field484 != 0 && field538 != -1) {
                class139.method2165(Statics.field743, field538, 0, field484, false);
            }
            field596 = false;
        }
    }

    @ObfuscatedName("db.j(Lar;IIII)V")
    public static void method2419(class34 arg0, int arg1, int arg2, int arg3) {
        if (field697 >= 50 || field688 == 0 || arg0.field872 == null || arg1 >= arg0.field872.length) {
            return;
        }
        int var4 = arg0.field872[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field718[field697] = var5;
        field699[field697] = var6;
        field700[field697] = 0;
        field702[field697] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field701[field697] = (var8 << 16) + (var9 << 8) + var7;
        field697++;
    }

    @ObfuscatedName("cn.q(IS)V")
    public static void method2079(int arg0) {
        if (arg0 == -1 && !field596) {
            class139.method593();
        } else if (arg0 != -1 && field538 != arg0 && field484 != 0 && !field596) {
            class155 var1 = Statics.field743;
            int var2 = field484;
            class139.field2355 = 1;
            Statics.field2361 = var1;
            Statics.field2353 = arg0;
            Statics.field1298 = 0;
            Statics.field1990 = var2;
            Statics.field2467 = false;
            Statics.field1299 = 2;
        }
        field538 = arg0;
    }

    @ObfuscatedName("k.z(B)V")
    public static final void method157() {
        if (field623 && Statics.field2374 != field631) {
            method164(Statics.field243, Statics.field1320, Statics.field2374, Statics.field905.field395[0], Statics.field905.field446[0]);
        } else if (Statics.field2374 != field566) {
            field566 = Statics.field2374;
            method21(Statics.field2374);
        }
    }

    @ObfuscatedName("k.af(III)V")
    public static final void method163(int arg0, int arg1) {
        if (field691 != 0 && field691 != 3 || class77.field1386 != 1) {
            return;
        }
        int var2 = class77.field1387 - 25 - arg0;
        int var3 = class77.field1385 - 5 - arg1;
        if (var2 < 0 || var3 < 0 || var2 >= 146 || var3 >= 151) {
            return;
        }
        var2 -= 73;
        var3 -= 75;
        int var4 = field540 + field527 & 0x7FF;
        int var5 = class104.field1779[var4];
        int var6 = class104.field1780[var4];
        int var7 = (field501 + 256) * var5 >> 8;
        int var8 = (field501 + 256) * var6 >> 8;
        int var9 = var2 * var8 + var3 * var7 >> 11;
        int var10 = var3 * var8 - var2 * var7 >> 11;
        int var11 = Statics.field905.field404 + var9 >> 7;
        int var12 = Statics.field905.field394 - var10 >> 7;
        field498.method2355(190);
        field498.method2484(18);
        field498.method2484(class75.field1348[82] ? (class75.field1348[81] ? 2 : 1) : 0);
        field498.method2550(Statics.field1848 + var11);
        field498.method2528(Statics.field178 + var12);
        field498.method2484(var2);
        field498.method2484(var3);
        field498.method2485(field540);
        field498.method2484(57);
        field498.method2484(field527);
        field498.method2484(field501);
        field498.method2484(89);
        field498.method2485(Statics.field905.field404);
        field498.method2485(Statics.field905.field394);
        field498.method2484(63);
        field634 = var11;
        field587 = var12;
    }

    @ObfuscatedName("h.ap(Ljava/lang/String;I)V")
    public static final void method199(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field948.field173 = !Statics.field948.field173;
            class12.method198();
            if (Statics.field948.field173) {
                method3179(0, "", "Roofs are now all hidden");
            } else {
                method3179(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field547 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field576 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field576 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field577 > 0) {
                    method1476();
                } else {
                    method1(40);
                    Statics.field497 = Statics.field355;
                    Statics.field355 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field458 == 2) {
                throw new RuntimeException();
            }
        }
        field498.method2355(157);
        field498.method2484(arg0.length() + 1);
        field498.method2682(arg0);
    }

    @ObfuscatedName("by.ah(I)V")
    public static final void method1413() {
        int var0 = Statics.field8 * 128 + 64;
        int var1 = Statics.field83 * 128 + 64;
        int var2 = method2435(var0, var1, Statics.field2374) - Statics.field389;
        if (Statics.field2423 < var0) {
            Statics.field2423 += Statics.field1260 * (var0 - Statics.field2423) / 1000 + Statics.field1437;
            if (Statics.field2423 > var0) {
                Statics.field2423 = var0;
            }
        }
        if (Statics.field2423 > var0) {
            Statics.field2423 -= Statics.field1260 * (Statics.field2423 - var0) / 1000 + Statics.field1437;
            if (Statics.field2423 < var0) {
                Statics.field2423 = var0;
            }
        }
        if (Statics.field1286 < var2) {
            Statics.field1286 += Statics.field1260 * (var2 - Statics.field1286) / 1000 + Statics.field1437;
            if (Statics.field1286 > var2) {
                Statics.field1286 = var2;
            }
        }
        if (Statics.field1286 > var2) {
            Statics.field1286 -= Statics.field1260 * (Statics.field1286 - var2) / 1000 + Statics.field1437;
            if (Statics.field1286 < var2) {
                Statics.field1286 = var2;
            }
        }
        if (Statics.field187 < var1) {
            Statics.field187 += Statics.field1260 * (var1 - Statics.field187) / 1000 + Statics.field1437;
            if (Statics.field187 > var1) {
                Statics.field187 = var1;
            }
        }
        if (Statics.field187 > var1) {
            Statics.field187 -= Statics.field1260 * (Statics.field187 - var1) / 1000 + Statics.field1437;
            if (Statics.field187 < var1) {
                Statics.field187 = var1;
            }
        }
        int var3 = Statics.field857 * 128 + 64;
        int var4 = Statics.field1408 * 128 + 64;
        int var5 = method2435(var3, var4, Statics.field2374) - Statics.field324;
        int var6 = var3 - Statics.field2423;
        int var7 = var5 - Statics.field1286;
        int var8 = var4 - Statics.field187;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field2468 < var10) {
            Statics.field2468 += Statics.field180 * (var10 - Statics.field2468) / 1000 + Statics.field168;
            if (Statics.field2468 > var10) {
                Statics.field2468 = var10;
            }
        }
        if (Statics.field2468 > var10) {
            Statics.field2468 -= Statics.field180 * (Statics.field2468 - var10) / 1000 + Statics.field168;
            if (Statics.field2468 < var10) {
                Statics.field2468 = var10;
            }
        }
        int var12 = var11 - Statics.field1815;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1815 += Statics.field180 * var12 / 1000 + Statics.field168;
            Statics.field1815 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1815 -= Statics.field180 * -var12 / 1000 + Statics.field168;
            Statics.field1815 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1815;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1815 = var11;
        }
    }

    @ObfuscatedName("ba.at(Laf;II)V")
    public static final void method1484(class27 arg0, int arg1) {
        if (arg0.field436 > field465) {
            method88(arg0);
        } else if (arg0.field437 >= field465) {
            if (field465 == arg0.field437 || arg0.field403 == -1 || arg0.field410 != 0 || arg0.field438 + 1 > class34.method93(arg0.field403).field871[arg0.field423]) {
                int var2 = arg0.field437 - arg0.field436;
                int var3 = field465 - arg0.field436;
                int var4 = arg0.field432 * 128 + arg0.field414 * 64;
                int var5 = arg0.field434 * 128 + arg0.field414 * 64;
                int var6 = arg0.field433 * 128 + arg0.field414 * 64;
                int var7 = arg0.field435 * 128 + arg0.field414 * 64;
                arg0.field404 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field394 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field448 = 0;
            if (arg0.field425 == 0) {
                arg0.field441 = 1024;
            }
            if (arg0.field425 == 1) {
                arg0.field441 = 1536;
            }
            if (arg0.field425 == 2) {
                arg0.field441 = 0;
            }
            if (arg0.field425 == 3) {
                arg0.field441 = 512;
            }
            arg0.field428 = arg0.field441;
        } else {
            method2080(arg0);
        }
        if (arg0.field404 < 128 || arg0.field394 < 128 || arg0.field404 >= 13184 || arg0.field394 >= 13184) {
            arg0.field403 = -1;
            arg0.field427 = -1;
            arg0.field436 = 0;
            arg0.field437 = 0;
            arg0.field404 = arg0.field395[0] * 128 + arg0.field414 * 64;
            arg0.field394 = arg0.field446[0] * 128 + arg0.field414 * 64;
            arg0.method224();
        }
        if (Statics.field905 == arg0 && (arg0.field404 < 1536 || arg0.field394 < 1536 || arg0.field404 >= 11776 || arg0.field394 >= 11776)) {
            arg0.field403 = -1;
            arg0.field427 = -1;
            arg0.field436 = 0;
            arg0.field437 = 0;
            arg0.field404 = arg0.field395[0] * 128 + arg0.field414 * 64;
            arg0.field394 = arg0.field446[0] * 128 + arg0.field414 * 64;
            arg0.method224();
        }
        method2170(arg0);
        arg0.field407 = false;
        if (arg0.field424 != -1) {
            class34 var8 = class34.method93(arg0.field424);
            if (var8 == null || var8.field869 == null) {
                arg0.field424 = -1;
            } else {
                arg0.field426++;
                if (arg0.field420 < var8.field869.length && arg0.field426 > var8.field871[arg0.field420]) {
                    arg0.field426 = 1;
                    arg0.field420++;
                    method2419(var8, arg0.field420, arg0.field404, arg0.field394);
                }
                if (arg0.field420 >= var8.field869.length) {
                    arg0.field426 = 0;
                    arg0.field420 = 0;
                    method2419(var8, arg0.field420, arg0.field404, arg0.field394);
                }
            }
        }
        if (arg0.field427 != -1 && field465 >= arg0.field430) {
            if (arg0.field422 < 0) {
                arg0.field422 = 0;
            }
            int var9 = class35.method144(arg0.field427).field893;
            if (var9 == -1) {
                arg0.field427 = -1;
            } else {
                class34 var10 = class34.method93(var9);
                if (var10 == null || var10.field869 == null) {
                    arg0.field427 = -1;
                } else {
                    arg0.field421++;
                    if (arg0.field422 < var10.field869.length && arg0.field421 > var10.field871[arg0.field422]) {
                        arg0.field421 = 1;
                        arg0.field422++;
                        method2419(var10, arg0.field422, arg0.field404, arg0.field394);
                    }
                    if (arg0.field422 >= var10.field869.length && (arg0.field422 < 0 || arg0.field422 >= var10.field869.length)) {
                        arg0.field427 = -1;
                    }
                }
            }
        }
        if (arg0.field403 != -1 && arg0.field410 <= 1) {
            class34 var11 = class34.method93(arg0.field403);
            if (var11.field880 == 1 && arg0.field449 > 0 && arg0.field436 <= field465 && arg0.field437 < field465) {
                arg0.field410 = 1;
                return;
            }
        }
        if (arg0.field403 != -1 && arg0.field410 == 0) {
            class34 var12 = class34.method93(arg0.field403);
            if (var12 == null || var12.field869 == null) {
                arg0.field403 = -1;
            } else {
                arg0.field438++;
                if (arg0.field423 < var12.field869.length && arg0.field438 > var12.field871[arg0.field423]) {
                    arg0.field438 = 1;
                    arg0.field423++;
                    method2419(var12, arg0.field423, arg0.field404, arg0.field394);
                }
                if (arg0.field423 >= var12.field869.length) {
                    arg0.field423 -= var12.field873;
                    arg0.field396++;
                    if (arg0.field396 >= var12.field874) {
                        arg0.field403 = -1;
                    } else if (arg0.field423 >= 0 && arg0.field423 < var12.field869.length) {
                        method2419(var12, arg0.field423, arg0.field404, arg0.field394);
                    } else {
                        arg0.field403 = -1;
                    }
                }
                arg0.field407 = var12.field875;
            }
        }
        if (arg0.field410 > 0) {
            arg0.field410--;
        }
    }

    @ObfuscatedName("y.aa(Laf;I)V")
    public static final void method88(class27 arg0) {
        int var1 = arg0.field436 - field465;
        int var2 = arg0.field432 * 128 + arg0.field414 * 64;
        int var3 = arg0.field434 * 128 + arg0.field414 * 64;
        arg0.field404 += (var2 - arg0.field404) / var1;
        arg0.field394 += (var3 - arg0.field394) / var1;
        arg0.field448 = 0;
        if (arg0.field425 == 0) {
            arg0.field441 = 1024;
        }
        if (arg0.field425 == 1) {
            arg0.field441 = 1536;
        }
        if (arg0.field425 == 2) {
            arg0.field441 = 0;
        }
        if (arg0.field425 == 3) {
            arg0.field441 = 512;
        }
    }

    @ObfuscatedName("cn.ae(Laf;B)V")
    public static final void method2080(class27 arg0) {
        arg0.field424 = arg0.field398;
        if (arg0.field444 == 0) {
            arg0.field448 = 0;
            return;
        }
        if (arg0.field403 != -1 && arg0.field410 == 0) {
            class34 var1 = class34.method93(arg0.field403);
            if (arg0.field449 > 0 && var1.field880 == 0) {
                arg0.field448++;
                return;
            }
            if (arg0.field449 <= 0 && var1.field867 == 0) {
                arg0.field448++;
                return;
            }
        }
        int var2 = arg0.field404;
        int var3 = arg0.field394;
        int var4 = arg0.field395[arg0.field444 - 1] * 128 + arg0.field414 * 64;
        int var5 = arg0.field446[arg0.field444 - 1] * 128 + arg0.field414 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field404 = var4;
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
        int var6 = arg0.field441 - arg0.field428 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field402;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field401;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field419;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field445;
        }
        if (var7 == -1) {
            var7 = arg0.field401;
        }
        arg0.field424 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class25) {
            var9 = ((class25) arg0).field367.field792;
        }
        if (var9) {
            if (arg0.field441 != arg0.field428 && arg0.field416 == -1 && arg0.field443 != 0) {
                var8 = 2;
            }
            if (arg0.field444 > 2) {
                var8 = 6;
            }
            if (arg0.field444 > 3) {
                var8 = 8;
            }
            if (arg0.field448 > 0 && arg0.field444 > 1) {
                var8 = 8;
                arg0.field448--;
            }
        } else {
            if (arg0.field444 > 1) {
                var8 = 6;
            }
            if (arg0.field444 > 2) {
                var8 = 8;
            }
            if (arg0.field448 > 0 && arg0.field444 > 1) {
                var8 = 8;
                arg0.field448--;
            }
        }
        if (arg0.field447[arg0.field444 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field424 == arg0.field401 && arg0.field405 != -1) {
            arg0.field424 = arg0.field405;
        }
        if (var2 < var4) {
            arg0.field404 += var8;
            if (arg0.field404 > var4) {
                arg0.field404 = var4;
            }
        } else if (var2 > var4) {
            arg0.field404 -= var8;
            if (arg0.field404 < var4) {
                arg0.field404 = var4;
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
        if (arg0.field404 == var4 && arg0.field394 == var5) {
            arg0.field444--;
            if (arg0.field449 > 0) {
                arg0.field449--;
            }
        }
    }

    @ObfuscatedName("ci.aw(Laf;I)V")
    public static final void method2170(class27 arg0) {
        if (arg0.field443 == 0) {
            return;
        }
        if (arg0.field416 != -1 && arg0.field416 < 32768) {
            class25 var1 = field494[arg0.field416];
            if (var1 != null) {
                int var2 = arg0.field404 - var1.field404;
                int var3 = arg0.field394 - var1.field394;
                if (var2 != 0 || var3 != 0) {
                    arg0.field441 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field416 >= 32768) {
            int var4 = arg0.field416 - 32768;
            if (field646 == var4) {
                var4 = 2047;
            }
            class3 var5 = field506[var4];
            if (var5 != null) {
                int var6 = arg0.field404 - var5.field404;
                int var7 = arg0.field394 - var5.field394;
                if (var6 != 0 || var7 != 0) {
                    arg0.field441 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field417 != 0 || arg0.field418 != 0) && (arg0.field444 == 0 || arg0.field448 > 0)) {
            int var8 = arg0.field404 - (arg0.field417 * 64 - Statics.field1848 * 64 - Statics.field1848 * 64);
            int var9 = arg0.field394 - (arg0.field418 * 64 - Statics.field178 * 64 - Statics.field178 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field441 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field417 = 0;
            arg0.field418 = 0;
        }
        int var10 = arg0.field441 - arg0.field428 & 0x7FF;
        if (var10 == 0) {
            arg0.field442 = 0;
            return;
        }
        arg0.field442++;
        if (var10 > 1024) {
            arg0.field428 -= arg0.field443;
            boolean var11 = true;
            if (var10 < arg0.field443 || var10 > 2048 - arg0.field443) {
                arg0.field428 = arg0.field441;
                var11 = false;
            }
            if (arg0.field424 == arg0.field398 && (arg0.field442 > 25 || var11)) {
                if (arg0.field399 == -1) {
                    arg0.field424 = arg0.field401;
                } else {
                    arg0.field424 = arg0.field399;
                }
            }
        } else {
            arg0.field428 += arg0.field443;
            boolean var12 = true;
            if (var10 < arg0.field443 || var10 > 2048 - arg0.field443) {
                arg0.field428 = arg0.field441;
                var12 = false;
            }
            if (arg0.field424 == arg0.field398 && (arg0.field442 > 25 || var12)) {
                if (arg0.field400 == -1) {
                    arg0.field424 = arg0.field401;
                } else {
                    arg0.field424 = arg0.field400;
                }
            }
        }
        arg0.field428 &= 0x7FF;
    }

    @ObfuscatedName("bw.ar(Ld;III)V")
    public static void method1370(class3 arg0, int arg1, int arg2) {
        if (arg0.field403 == arg1 && arg1 != -1) {
            int var3 = class34.method93(arg1).field864;
            if (var3 == 1) {
                arg0.field423 = 0;
                arg0.field438 = 0;
                arg0.field410 = arg2;
                arg0.field396 = 0;
            }
            if (var3 == 2) {
                arg0.field396 = 0;
            }
        } else if (arg1 == -1 || arg0.field403 == -1 || class34.method93(arg1).field876 >= class34.method93(arg0.field403).field876) {
            arg0.field403 = arg1;
            arg0.field423 = 0;
            arg0.field438 = 0;
            arg0.field410 = arg2;
            arg0.field396 = 0;
            arg0.field449 = arg0.field444;
        }
    }

    @ObfuscatedName("af.ai(B)V")
    public static final void method231() {
        if (!field455) {
            field604[0] = class135.field2313;
            field599[0] = "";
            field602[0] = 1006;
            field471 = 1;
        }
        if (field711 != -1) {
            int var0 = field711;
            if (class159.method129(var0)) {
                method2429(Statics.field1921[var0], -1);
            }
        }
        for (int var1 = 0; var1 < field660; var1++) {
            if (field493[var1]) {
                field661[var1] = true;
            }
            field662[var1] = field493[var1];
            field493[var1] = false;
        }
        field670 = field465;
        field606 = -1;
        field685 = -1;
        Statics.field558 = null;
        if (field711 != -1) {
            field660 = 0;
            method1423(field711, 0, 0, 765, 503, 0, 0, -1);
        }
        class89.method1824();
        method1451();
        if (field455) {
            int var2 = Statics.field327;
            int var3 = Statics.field2585;
            int var4 = Statics.field79;
            int var5 = Statics.field2420;
            int var6 = 6116423;
            class89.method1831(var2, var3, var4, var5, var6);
            class89.method1831(var2 + 1, var3 + 1, var4 - 2, 16, 0);
            class89.method1833(var2 + 1, var3 + 18, var4 - 2, var5 - 19, 0);
            Statics.field1039.method3540(class135.field2233, var2 + 3, var3 + 14, var6, -1);
            int var7 = class77.field1377;
            int var8 = class77.field1381;
            for (int var9 = 0; var9 < field471; var9++) {
                int var10 = (field471 - 1 - var9) * 15 + var3 + 31;
                int var11 = 16777215;
                if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                    var11 = 16776960;
                }
                Statics.field1039.method3540(method1893(var9), var2 + 3, var10, var11, 0);
            }
            int var12 = Statics.field327;
            int var13 = Statics.field2585;
            int var14 = Statics.field79;
            int var15 = Statics.field2420;
            for (int var16 = 0; var16 < field660; var16++) {
                if (field663[var16] + field454[var16] > var12 && field663[var16] < var12 + var14 && field666[var16] + field664[var16] > var13 && field664[var16] < var13 + var15) {
                    field661[var16] = true;
                }
            }
        } else if (field606 != -1) {
            method2551(field606, field685);
        }
        if (field667 == 3) {
            for (int var17 = 0; var17 < field660; var17++) {
                if (field662[var17]) {
                    class89.method1869(field663[var17], field664[var17], field454[var17], field666[var17], 16711935, 128);
                } else if (field661[var17]) {
                    class89.method1869(field663[var17], field664[var17], field454[var17], field666[var17], 16711680, 128);
                }
            }
        }
        Statics.method1592(Statics.field2374, Statics.field905.field404, Statics.field905.field394, field532);
        field532 = 0;
    }

    @ObfuscatedName("et.au(Ljava/lang/String;ZI)V")
    public static final void method2997(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2002.method3483(arg0, 250);
        int var6 = Statics.field2002.method3484(arg0, 250) * 13;
        class89.method1831(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1833(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2002.method3506(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2420(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1425.getGraphics();
                Statics.field1514.method1686(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1425.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field660; var13++) {
            if (field663[var13] + field454[var13] > var9 && field663[var13] < var9 + var11 && field666[var13] + field664[var13] > var10 && field664[var13] < var10 + var12) {
                field661[var13] = true;
            }
        }
    }

    @ObfuscatedName("r.ay(IIIIB)V")
    public static final void method126(int arg0, int arg1, int arg2, int arg3) {
        class89.method1825(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2173();
        field559++;
        method28(true);
        method184(true);
        method28(false);
        method184(false);
        for (class10 var4 = (class10) field592.method3446(); var4 != null; var4 = (class10) field592.method3428()) {
            if (Statics.field2374 != var4.field159 || field465 > var4.field139) {
                var4.method3455();
            } else if (field465 >= var4.field144) {
                if (var4.field148 > 0) {
                    class25 var5 = field494[var4.field148 - 1];
                    if (var5 != null && var5.field404 >= 0 && var5.field404 < 13312 && var5.field394 >= 0 && var5.field394 < 13312) {
                        var4.method90(var5.field404, var5.field394, method2435(var5.field404, var5.field394, var4.field159) - var4.field138, field465);
                    }
                }
                if (var4.field148 < 0) {
                    int var6 = -var4.field148 - 1;
                    class3 var7;
                    if (field646 == var6) {
                        var7 = Statics.field905;
                    } else {
                        var7 = field506[var6];
                    }
                    if (var7 != null && var7.field404 >= 0 && var7.field404 < 13312 && var7.field394 >= 0 && var7.field394 < 13312) {
                        var4.method90(var7.field404, var7.field394, method2435(var7.field404, var7.field394, var4.field159) - var4.field138, field465);
                    }
                }
                var4.method91(field532);
                Statics.field163.method1914(Statics.field2374, (int) var4.field150, (int) var4.field160, (int) var4.field152, 60, var4, var4.field158, -1, false);
            }
        }
        for (class20 var8 = (class20) field578.method3446(); var8 != null; var8 = (class20) field578.method3428()) {
            if (Statics.field2374 != var8.field276 || var8.field283) {
                var8.method3455();
            } else if (field465 >= var8.field280) {
                var8.method161(field532);
                if (var8.field283) {
                    var8.method3455();
                } else {
                    Statics.field163.method1914(var8.field276, var8.field277, var8.field278, var8.field279, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field703) {
            int var9 = field539;
            if (field616 / 256 > var9) {
                var9 = field616 / 256;
            }
            if (field704[4] && field698[4] + 128 > var9) {
                var9 = field698[4] + 128;
            }
            int var10 = field540 + field524 & 0x7FF;
            method236(Statics.field1648, method2435(Statics.field905.field404, Statics.field905.field394, Statics.field2374) - 50, Statics.field1547, var9, var10, var9 * 3 + 600);
        }
        int var11;
        if (field703) {
            var11 = method2396();
        } else {
            var11 = method166();
        }
        int var12 = Statics.field2423;
        int var13 = Statics.field1286;
        int var14 = Statics.field187;
        int var15 = Statics.field2468;
        int var16 = Statics.field1815;
        for (int var17 = 0; var17 < 5; var17++) {
            if (field704[var17]) {
                int var18 = (int) (Math.random() * (double) (field705[var17] * 2 + 1) - (double) field705[var17] + Math.sin((double) field707[var17] / 100.0D * (double) field708[var17]) * (double) field698[var17]);
                if (var17 == 0) {
                    Statics.field2423 += var18;
                }
                if (var17 == 1) {
                    Statics.field1286 += var18;
                }
                if (var17 == 2) {
                    Statics.field187 += var18;
                }
                if (var17 == 3) {
                    Statics.field1815 = Statics.field1815 + var18 & 0x7FF;
                }
                if (var17 == 4) {
                    Statics.field2468 += var18;
                    if (Statics.field2468 < 128) {
                        Statics.field2468 = 128;
                    }
                    if (Statics.field2468 > 383) {
                        Statics.field2468 = 383;
                    }
                }
            }
        }
        int var19 = class77.field1377;
        int var20 = class77.field1381;
        if (var19 >= arg0 && var19 < arg0 + arg2 && var20 >= arg1 && var20 < arg1 + arg3) {
            class112.field1887 = true;
            class112.field1876 = 0;
            class112.field1907 = class77.field1377 - arg0;
            class112.field1889 = class77.field1381 - arg1;
        } else {
            class112.field1887 = false;
            class112.field1876 = 0;
        }
        method1422();
        class89.method1831(arg0, arg1, arg2, arg3, 0);
        method1422();
        Statics.field163.method2059(Statics.field2423, Statics.field1286, Statics.field187, Statics.field2468, Statics.field1815, var11);
        method1422();
        Statics.field163.method1917();
        field502 = 0;
        for (int var21 = -1; var21 < field570 + field495; var21++) {
            class27 var22;
            if (var21 == -1) {
                var22 = Statics.field905;
            } else if (var21 < field570) {
                var22 = field506[field642[var21]];
            } else {
                var22 = field494[field496[var21 - field570]];
            }
            if (var22 != null && var22.method14()) {
                if (var22 instanceof class25) {
                    class31 var23 = ((class25) var22).field367;
                    if (var23.field779 != null) {
                        var23 = var23.method626();
                    }
                    if (var23 == null) {
                        continue;
                    }
                }
                if (var21 >= field570) {
                    class31 var26 = ((class25) var22).field367;
                    if (var26.field779 != null) {
                        var26 = var26.method626();
                    }
                    if (var26.field775 >= 0 && var26.field775 < Statics.field965.length) {
                        method37(var22, var22.field440 + 15);
                        if (field560 > -1) {
                            Statics.field965[var26.field775].method1763(field560 + arg0 - 12, field561 + arg1 - 30);
                        }
                    }
                    if (field473 == 1 && field474 == field496[var21 - field570] && field465 % 20 < 10) {
                        method37(var22, var22.field440 + 15);
                        if (field560 > -1) {
                            Statics.field1016[0].method1763(field560 + arg0 - 12, field561 + arg1 - 28);
                        }
                    }
                } else {
                    int var24 = 30;
                    class3 var25 = (class3) var22;
                    if (var25.field51 != -1 || var25.field35 != -1) {
                        method37(var22, var22.field440 + 15);
                        if (field560 > -1) {
                            if (var25.field51 != -1) {
                                Statics.field234[var25.field51].method1763(field560 + arg0 - 12, field561 + arg1 - var24);
                                var24 += 25;
                            }
                            if (var25.field35 != -1) {
                                Statics.field965[var25.field35].method1763(field560 + arg0 - 12, field561 + arg1 - var24);
                                var24 += 25;
                            }
                        }
                    }
                    if (var21 >= 0 && field473 == 10 && field529 == field642[var21]) {
                        method37(var22, var22.field440 + 15);
                        if (field560 > -1) {
                            Statics.field1016[1].method1763(field560 + arg0 - 12, field561 + arg1 - var24);
                        }
                    }
                }
                if (var22.field406 != null && (var21 >= field570 || field674 == 0 || field674 == 3 || field674 == 1 && method2244(((class3) var22).field37))) {
                    method37(var22, var22.field440);
                    if (field560 > -1 && field502 < field549) {
                        field452[field502] = Statics.field1039.method3553(var22.field406) / 2;
                        field480[field502] = Statics.field1039.field2843;
                        field550[field502] = field560;
                        field689[field502] = field561;
                        field554[field502] = var22.field408;
                        field555[field502] = var22.field409;
                        field556[field502] = var22.field429;
                        field557[field502] = var22.field406;
                        field502++;
                    }
                }
                if (var22.field413 > field465) {
                    method37(var22, var22.field440 + 15);
                    if (field560 > -1) {
                        int var27 = var22.field393 * 30 / var22.field415;
                        if (var27 > 30) {
                            var27 = 30;
                        } else if (var27 == 0 && var22.field393 > 0) {
                            var27 = 1;
                        }
                        class89.method1831(field560 + arg0 - 15, field561 + arg1 - 3, var27, 5, 65280);
                        class89.method1831(field560 + arg0 - 15 + var27, field561 + arg1 - 3, 30 - var27, 5, 16711680);
                    }
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    if (var22.field412[var28] > field465) {
                        method37(var22, var22.field440 / 2);
                        if (field560 > -1) {
                            if (var28 == 1) {
                                field561 -= 20;
                            }
                            if (var28 == 2) {
                                field560 -= 15;
                                field561 -= 10;
                            }
                            if (var28 == 3) {
                                field560 += 15;
                                field561 -= 10;
                            }
                            Statics.field951[var22.field411[var28]].method1763(field560 + arg0 - 12, field561 + arg1 - 12);
                            Statics.field255.method3505(Integer.toString(var22.field397[var28]), field560 + arg0 - 1, field561 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var29 = 0; var29 < field502; var29++) {
            int var30 = field550[var29];
            int var31 = field689[var29];
            int var32 = field452[var29];
            int var33 = field480[var29];
            boolean var34 = true;
            while (var34) {
                var34 = false;
                for (int var35 = 0; var35 < var29; var35++) {
                    if (var31 + 2 > field689[var35] - field480[var35] && var31 - var33 < field689[var35] + 2 && var30 - var32 < field550[var35] + field452[var35] && var30 + var32 > field550[var35] - field452[var35] && field689[var35] - field480[var35] < var31) {
                        var31 = field689[var35] - field480[var35];
                        var34 = true;
                    }
                }
            }
            field560 = field550[var29];
            field561 = field689[var29] = var31;
            String var36 = field557[var29];
            if (field624 == 0) {
                int var37 = 16776960;
                if (field554[var29] < 6) {
                    var37 = field673[field554[var29]];
                }
                if (field554[var29] == 6) {
                    var37 = field559 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field554[var29] == 7) {
                    var37 = field559 % 20 < 10 ? 255 : 65535;
                }
                if (field554[var29] == 8) {
                    var37 = field559 % 20 < 10 ? 45056 : 8454016;
                }
                if (field554[var29] == 9) {
                    int var38 = 150 - field556[var29];
                    if (var38 < 50) {
                        var37 = var38 * 1280 + 16711680;
                    } else if (var38 < 100) {
                        var37 = 16776960 - (var38 - 50) * 327680;
                    } else if (var38 < 150) {
                        var37 = (var38 - 100) * 5 + 65280;
                    }
                }
                if (field554[var29] == 10) {
                    int var39 = 150 - field556[var29];
                    if (var39 < 50) {
                        var37 = var39 * 5 + 16711680;
                    } else if (var39 < 100) {
                        var37 = 16711935 - (var39 - 50) * 327680;
                    } else if (var39 < 150) {
                        var37 = (var39 - 100) * 327680 + 255 - (var39 - 100) * 5;
                    }
                }
                if (field554[var29] == 11) {
                    int var40 = 150 - field556[var29];
                    if (var40 < 50) {
                        var37 = 16777215 - var40 * 327685;
                    } else if (var40 < 100) {
                        var37 = (var40 - 50) * 327685 + 65280;
                    } else if (var40 < 150) {
                        var37 = 16777215 - (var40 - 100) * 327680;
                    }
                }
                if (field555[var29] == 0) {
                    Statics.field1039.method3505(var36, field560 + arg0, field561 + arg1, var37, 0);
                }
                if (field555[var29] == 1) {
                    Statics.field1039.method3490(var36, field560 + arg0, field561 + arg1, var37, 0, field559);
                }
                if (field555[var29] == 2) {
                    Statics.field1039.method3491(var36, field560 + arg0, field561 + arg1, var37, 0, field559);
                }
                if (field555[var29] == 3) {
                    Statics.field1039.method3492(var36, field560 + arg0, field561 + arg1, var37, 0, field559, 150 - field556[var29]);
                }
                if (field555[var29] == 4) {
                    int var41 = (150 - field556[var29]) * (Statics.field1039.method3553(var36) + 100) / 150;
                    class89.method1878(field560 + arg0 - 50, arg1, field560 + arg0 + 50, arg1 + arg3);
                    Statics.field1039.method3540(var36, field560 + arg0 + 50 - var41, field561 + arg1, var37, 0);
                    class89.method1825(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field555[var29] == 5) {
                    int var42 = 150 - field556[var29];
                    int var43 = 0;
                    if (var42 < 25) {
                        var43 = var42 - 25;
                    } else if (var42 > 125) {
                        var43 = var42 - 125;
                    }
                    class89.method1878(arg0, field561 + arg1 - Statics.field1039.field2843 - 1, arg0 + arg2, field561 + arg1 + 5);
                    Statics.field1039.method3505(var36, field560 + arg0, field561 + arg1 + var43, var37, 0);
                    class89.method1825(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1039.method3505(var36, field560 + arg0, field561 + arg1, 16776960, 0);
            }
        }
        method20(arg0, arg1);
        ((class110) Statics.field1776).method2256(field532);
        if (field565 == 1) {
            Statics.field381[field564 / 100].method1763(field562 - 8, field563 - 8);
        }
        if (field565 == 2) {
            Statics.field381[field564 / 100 + 4].method1763(field562 - 8, field563 - 8);
        }
        method918();
        if (field576) {
            int var44 = arg0 + 512 - 5;
            int var45 = arg1 + 20;
            Statics.field2002.method3487("Fps:" + field1317, var44, var45, 16776960, -1);
            int var79 = var45 + 15;
            Runtime var46 = Runtime.getRuntime();
            int var47 = (int) ((var46.totalMemory() - var46.freeMemory()) / 1024L);
            int var48 = 16776960;
            if (var47 > 32768 && field623) {
                var48 = 16711680;
            }
            if (var47 > 65536 && !field623) {
                var48 = 16711680;
            }
            Statics.field2002.method3487("Mem:" + var47 + "k", var44, var79, var48, -1);
            var45 = var79 + 15;
        }
        Statics.field2423 = var12;
        Statics.field1286 = var13;
        Statics.field187 = var14;
        Statics.field2468 = var15;
        Statics.field1815 = var16;
        if (field464) {
            byte var49 = 0;
            int var50 = class154.field2549 + class154.field2547 + var49;
            if (var50 == 0) {
                field464 = false;
            }
        }
        if (field464) {
            class89.method1831(arg0, arg1, arg2, arg3, 0);
            method2997(class135.field2096, false);
        }
        if (field464 || field455 || var19 < arg0 || var19 >= arg0 + arg2 || var20 < arg1 || var20 >= arg1 + arg3) {
            return;
        }
        if (field672 == 0 && !field612) {
            method1659(class135.field2235, "", 23, 0, var19 - arg0, var20 - arg1);
        }
        int var52 = -1;
        for (int var53 = 0; var53 < class112.field1876; var53++) {
            int var54 = class112.field1910[var53];
            int var55 = var54 & 0x7F;
            int var56 = var54 >> 7 & 0x7F;
            int var57 = var54 >> 29 & 0x3;
            int var58 = var54 >> 14 & 0x7FFF;
            if (var52 != var54) {
                var52 = var54;
                if (var57 == 2 && Statics.field163.method1916(Statics.field2374, var55, var56, var54) >= 0) {
                    class32 var59 = class32.method1332(var58);
                    if (var59.field836 != null) {
                        var59 = var59.method684();
                    }
                    if (var59 == null) {
                        continue;
                    }
                    if (field672 == 1) {
                        method1659(class135.field2230, field530 + " " + class2.field22 + " " + class2.method3035(65535) + var59.field805, 1, var54, var55, var56);
                    } else if (!field612) {
                        String[] var60 = var59.field835;
                        if (field457) {
                            var60 = method356(var60);
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
                                    method1659(var60[var61], class2.method3035(65535) + var59.field805, var62, var54, var55, var56);
                                }
                            }
                        }
                        method1659(class135.field2192, class2.method3035(65535) + var59.field805, 1002, var59.field802 << 14, var55, var56);
                    } else if ((Statics.field177 & 0x4) == 4) {
                        method1659(field614, field715 + " " + class2.field22 + " " + class2.method3035(65535) + var59.field805, 2, var54, var55, var56);
                    }
                }
                if (var57 == 1) {
                    class25 var63 = field494[var58];
                    if (var63.field367.field786 == 1 && (var63.field404 & 0x7F) == 64 && (var63.field394 & 0x7F) == 64) {
                        for (int var64 = 0; var64 < field495; var64++) {
                            class25 var65 = field494[field496[var64]];
                            if (var65 != null && var63 != var65 && var65.field367.field786 == 1 && var63.field404 == var65.field404 && var63.field394 == var65.field394) {
                                Statics.method114(var65.field367, field496[var64], var55, var56);
                            }
                        }
                        for (int var66 = 0; var66 < field570; var66++) {
                            class3 var67 = field506[field642[var66]];
                            if (var67 != null && var63.field404 == var67.field404 && var63.field394 == var67.field394) {
                                method1237(var67, field642[var66], var55, var56);
                            }
                        }
                    }
                    Statics.method114(var63.field367, var58, var55, var56);
                }
                if (var57 == 0) {
                    class3 var68 = field506[var58];
                    if ((var68.field404 & 0x7F) == 64 && (var68.field394 & 0x7F) == 64) {
                        for (int var69 = 0; var69 < field495; var69++) {
                            class25 var70 = field494[field496[var69]];
                            if (var70 != null && var70.field367.field786 == 1 && var68.field404 == var70.field404 && var68.field394 == var70.field394) {
                                Statics.method114(var70.field367, field496[var69], var55, var56);
                            }
                        }
                        for (int var71 = 0; var71 < field570; var71++) {
                            class3 var72 = field506[field642[var71]];
                            if (var72 != null && var68 != var72 && var68.field404 == var72.field404 && var68.field394 == var72.field394) {
                                method1237(var72, field642[var71], var55, var56);
                            }
                        }
                    }
                    method1237(var68, var58, var55, var56);
                }
                if (var57 == 3) {
                    class177 var73 = field653[Statics.field2374][var55][var56];
                    if (var73 != null) {
                        for (class17 var74 = (class17) var73.method3421(); var74 != null; var74 = (class17) var73.method3430()) {
                            class40 var75 = class40.method31(var74.field241);
                            if (field672 == 1) {
                                method1659(class135.field2230, field530 + " " + class2.field22 + " " + class2.method3035(16748608) + var75.field988, 16, var74.field241, var55, var56);
                            } else if (!field612) {
                                String[] var76 = var75.field990;
                                if (field457) {
                                    var76 = method356(var76);
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
                                        method1659(var76[var77], class2.method3035(16748608) + var75.field988, var78, var74.field241, var55, var56);
                                    } else if (var77 == 2) {
                                        method1659(class135.field2312, class2.method3035(16748608) + var75.field988, 20, var74.field241, var55, var56);
                                    }
                                }
                                method1659(class135.field2192, class2.method3035(16748608) + var75.field988, 1004, var74.field241, var55, var56);
                            } else if ((Statics.field177 & 0x1) == 1) {
                                method1659(field614, field715 + " " + class2.field22 + " " + class2.method3035(16748608) + var75.field988, 17, var74.field241, var55, var56);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.an(ZI)V")
    public static final void method28(boolean arg0) {
        if (Statics.field905.field404 >> 7 == field634 && Statics.field905.field394 >> 7 == field587) {
            field634 = 0;
        }
        int var1 = field570;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field905;
                var4 = 33538048;
            } else {
                var3 = field506[field642[var2]];
                var4 = field642[var2] << 14;
            }
            if (var3 != null && var3.method14()) {
                var3.field45 = false;
                if ((field623 && field570 > 50 || field570 > 200) && !arg0 && var3.field424 == var3.field398) {
                    var3.field45 = true;
                }
                int var5 = var3.field404 >> 7;
                int var6 = var3.field394 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field44 == null || field465 < var3.field32 || field465 >= var3.field40) {
                        if ((var3.field404 & 0x7F) == 64 && (var3.field394 & 0x7F) == 64) {
                            if (field559 == field462[var5][var6]) {
                                continue;
                            }
                            field462[var5][var6] = field559;
                        }
                        var3.field39 = method2435(var3.field404, var3.field394, Statics.field2374);
                        Statics.field163.method1914(Statics.field2374, var3.field404, var3.field394, var3.field39, 60, var3, var3.field428, var4, var3.field407);
                    } else {
                        var3.field45 = false;
                        var3.field39 = method2435(var3.field404, var3.field394, Statics.field2374);
                        Statics.field163.method2051(Statics.field2374, var3.field404, var3.field394, var3.field39, 60, var3, var3.field428, var4, var3.field33, var3.field46, var3.field47, var3.field48);
                    }
                }
            }
        }
    }

    @ObfuscatedName("t.al(ZB)V")
    public static final void method184(boolean arg0) {
        for (int var1 = 0; var1 < field495; var1++) {
            class25 var2 = field494[field496[var1]];
            int var3 = (field496[var1] << 14) + 536870912;
            if (var2 != null && var2.method14() && var2.field367.field791 == arg0 && var2.field367.method607()) {
                int var4 = var2.field404 >> 7;
                int var5 = var2.field394 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field414 == 1 && (var2.field404 & 0x7F) == 64 && (var2.field394 & 0x7F) == 64) {
                        if (field559 == field462[var4][var5]) {
                            continue;
                        }
                        field462[var4][var5] = field559;
                    }
                    if (!var2.field367.field759) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field163.method1914(Statics.field2374, var2.field404, var2.field394, method2435(var2.field404 + (var2.field414 * 64 - 64), var2.field394 + (var2.field414 * 64 - 64), Statics.field2374), var2.field414 * 64 - 64 + 60, var2, var2.field428, var3, var2.field407);
                }
            }
        }
    }

    @ObfuscatedName("k.as(S)I")
    public static final int method166() {
        if (Statics.field948.field173) {
            return Statics.field2374;
        }
        int var0 = 3;
        if (Statics.field2468 < 310) {
            int var1 = Statics.field2423 >> 7;
            int var2 = Statics.field187 >> 7;
            int var3 = Statics.field905.field404 >> 7;
            int var4 = Statics.field905.field394 >> 7;
            if ((class9.field119[Statics.field2374][var1][var2] & 0x4) != 0) {
                var0 = Statics.field2374;
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
                    if ((class9.field119[Statics.field2374][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2374;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class9.field119[Statics.field2374][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2374;
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
                    if ((class9.field119[Statics.field2374][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field2374;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class9.field119[Statics.field2374][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field2374;
                        }
                    }
                }
            }
        }
        if ((class9.field119[Statics.field2374][Statics.field905.field404 >> 7][Statics.field905.field394 >> 7] & 0x4) != 0) {
            var0 = Statics.field2374;
        }
        return var0;
    }

    @ObfuscatedName("dp.az(B)I")
    public static final int method2396() {
        if (Statics.field948.field173) {
            return Statics.field2374;
        } else {
            int var0 = method2435(Statics.field2423, Statics.field187, Statics.field2374);
            return var0 - Statics.field1286 >= 800 || (class9.field119[Statics.field2374][Statics.field2423 >> 7][Statics.field187 >> 7] & 0x4) == 0 ? 3 : Statics.field2374;
        }
    }

    @ObfuscatedName("x.aq(IIB)V")
    public static final void method20(int arg0, int arg1) {
        if (field473 == 2) {
            method3461((field476 - Statics.field1848 << 7) + field479, (field477 - Statics.field178 << 7) + field671, field478 * 2);
            if (field560 > -1 && field465 % 20 < 10) {
                Statics.field1016[0].method1763(field560 + arg0 - 12, field561 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("aq.ag(B)V")
    public static final void method918() {
        field575 = 0;
        int var0 = (Statics.field905.field404 >> 7) + Statics.field1848;
        int var1 = (Statics.field905.field394 >> 7) + Statics.field178;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field575 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field575 = 1;
        }
        if (field575 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field575 = 0;
        }
    }

    @ObfuscatedName("a.aj(Laf;II)V")
    public static final void method37(class27 arg0, int arg1) {
        method3461(arg0.field404, arg0.field394, arg1);
    }

    @ObfuscatedName("ff.ak(IIII)V")
    public static final void method3461(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field560 = -1;
            field561 = -1;
            return;
        }
        int var3 = method2435(arg0, arg1, Statics.field2374) - arg2;
        int var4 = arg0 - Statics.field2423;
        int var5 = var3 - Statics.field1286;
        int var6 = arg1 - Statics.field187;
        int var7 = class104.field1779[Statics.field2468];
        int var8 = class104.field1780[Statics.field2468];
        int var9 = class104.field1779[Statics.field1815];
        int var10 = class104.field1780[Statics.field1815];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field560 = (var11 << 9) / var15 + 256;
            field561 = (var14 << 9) / var15 + 167;
        } else {
            field560 = -1;
            field561 = -1;
        }
    }

    @ObfuscatedName("dz.ac(IIII)I")
    public static final int method2435(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field119[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field126[var5][var3][var4] + class9.field126[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field126[var5][var3][var4 + 1] + class9.field126[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("af.ab(IIIIIII)V")
    public static final void method236(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1779[var6];
            int var12 = class104.field1780[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1779[var7];
            int var15 = class104.field1780[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field2423 = arg0 - var8;
        Statics.field1286 = arg1 - var9;
        Statics.field187 = arg2 - var10;
        Statics.field2468 = arg3;
        Statics.field1815 = arg4;
    }

    @ObfuscatedName("ai.ax(ZB)V")
    public static final void method755(boolean arg0) {
        field517 = arg0;
        if (!field517) {
            int var1 = field500.method2555();
            int var2 = field500.method2531();
            int var3 = field500.method2531();
            int var4 = (field533 - field500.field2030) / 16;
            Statics.field264 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field264[var5][var6] = field500.method2539();
                }
            }
            int var7 = field500.method2615();
            int var8 = field500.method2581();
            Statics.field1033 = new int[var4];
            Statics.field722 = new int[var4];
            Statics.field284 = new int[var4];
            Statics.field2479 = new byte[var4][];
            Statics.field1829 = new byte[var4][];
            boolean var9 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var8 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var8 - 6) / 8; var11 <= (var8 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1033[var10] = var13;
                        Statics.field722[var10] = Statics.field1361.method3093("m" + var11 + "_" + var12);
                        Statics.field284[var10] = Statics.field1361.method3093("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method164(var8, var2, var7, var1, var3);
            return;
        }
        int var14 = field500.method2555();
        field500.method2361();
        for (int var15 = 0; var15 < 4; var15++) {
            for (int var16 = 0; var16 < 13; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    int var18 = field500.method2379(1);
                    if (var18 == 1) {
                        field626[var15][var16][var17] = field500.method2379(26);
                    } else {
                        field626[var15][var16][var17] = -1;
                    }
                }
            }
        }
        field500.method2357();
        int var19 = (field533 - field500.field2030) / 16;
        Statics.field264 = new int[var19][4];
        for (int var20 = 0; var20 < var19; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field264[var20][var21] = field500.method2539();
            }
        }
        int var22 = field500.method2581();
        int var23 = field500.method2555();
        int var24 = field500.method2624();
        int var25 = field500.method2555();
        Statics.field1033 = new int[var19];
        Statics.field722 = new int[var19];
        Statics.field284 = new int[var19];
        Statics.field2479 = new byte[var19][];
        Statics.field1829 = new byte[var19][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field626[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1033[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1033[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field722[var26] = Statics.field1361.method3093("m" + var35 + "_" + var36);
                            Statics.field284[var26] = Statics.field1361.method3093("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method164(var25, var22, var24, var14, var23);
    }

    @ObfuscatedName("k.av(IIIIII)V")
    public static final void method164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field243 == arg0 && Statics.field1320 == arg1 && field631 == arg2 || !field623) {
            return;
        }
        Statics.field243 = arg0;
        Statics.field1320 = arg1;
        field631 = arg2;
        if (!field623) {
            field631 = 0;
        }
        method1(25);
        method2997(class135.field2096, true);
        int var5 = Statics.field1848;
        int var6 = Statics.field178;
        Statics.field1848 = (arg0 - 6) * 8;
        Statics.field178 = (arg1 - 6) * 8;
        int var7 = Statics.field1848 - var5;
        int var8 = Statics.field178 - var6;
        int var9 = Statics.field1848;
        int var10 = Statics.field178;
        for (int var11 = 0; var11 < 32768; var11++) {
            class25 var12 = field494[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field395[var13] -= var7;
                    var12.field446[var13] -= var8;
                }
                var12.field404 -= var7 * 128;
                var12.field394 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field506[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field395[var16] -= var7;
                    var15.field446[var16] -= var8;
                }
                var15.field404 -= var7 * 128;
                var15.field394 -= var8 * 128;
            }
        }
        Statics.field2374 = arg2;
        Statics.field905.method222(arg3, arg4, false);
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
                        field653[var27][var23][var24] = field653[var27][var25][var26];
                    } else {
                        field653[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class22 var28 = (class22) field597.method3446(); var28 != null; var28 = (class22) field597.method3428()) {
            var28.field331 -= var7;
            var28.field332 -= var8;
            if (var28.field331 < 0 || var28.field332 < 0 || var28.field331 >= 104 || var28.field332 >= 104) {
                var28.method3455();
            }
        }
        if (field634 != 0) {
            field634 -= var7;
            field587 -= var8;
        }
        field697 = 0;
        field703 = false;
        field566 = -1;
        field578.method3449();
        field592.method3449();
    }

    @ObfuscatedName("ea.ad(ZI)V")
    public static final void method2758(boolean arg0) {
        method1422();
        field470++;
        if (field470 < 50 && !arg0) {
            return;
        }
        field470 = 0;
        if (field509 || Statics.field355 == null) {
            return;
        }
        field498.method2355(9);
        try {
            Statics.field355.method1448(field498.field2036, 0, field498.field2030);
            field498.field2030 = 0;
        } catch (IOException var2) {
            field509 = true;
        }
    }

    @ObfuscatedName("x.am(II)V")
    public static final void method21(int arg0) {
        int[] var1 = Statics.field1817.field1459;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class9.field119[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field163.method1937(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class9.field119[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field163.method1937(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1817.method1721();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class9.field119[arg0][var10][var9] & 0x18) == 0) {
                    method1685(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class9.field119[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method1685(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field611 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field163.method1941(Statics.field2374, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class32.method1332(var14).field823;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field516[Statics.field2374].field2037;
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
                        field714[field611] = Statics.field1614[var15];
                        field686[field611] = var16;
                        field687[field611] = var17;
                        field611++;
                    }
                }
            }
        }
        Statics.field1514.method1715();
    }

    @ObfuscatedName("ce.ao(IIIIII)V")
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field163.method1929(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field163.method1916(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1817.field1459;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method1332(var12);
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
                class87 var14 = Statics.field910[var13.field822];
                if (var14 != null) {
                    int var15 = (var13.field810 * 4 - var14.field1474) / 2;
                    int var16 = (var13.field837 * 4 - var14.field1475) / 2;
                    var14.method1819(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field837) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field163.method1931(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field163.method1916(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method1332(var21);
            if (var22.field822 != -1) {
                class87 var23 = Statics.field910[var22.field822];
                if (var23 != null) {
                    int var24 = (var22.field810 * 4 - var23.field1474) / 2;
                    int var25 = (var22.field837 * 4 - var23.field1475) / 2;
                    var23.method1819(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field837) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1817.field1459;
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
        int var29 = Statics.field163.method1941(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method1332(var30);
        if (var31.field822 == -1) {
            return;
        }
        class87 var32 = Statics.field910[var31.field822];
        if (var32 != null) {
            int var33 = (var31.field810 * 4 - var32.field1474) / 2;
            int var34 = (var31.field837 * 4 - var32.field1475) / 2;
            var32.method1819(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field837) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dv.bo(B)Z")
    public static final boolean method2440() {
        if (Statics.field355 == null) {
            return false;
        }
        try {
            int var0 = Statics.field355.method1429();
            if (var0 == 0) {
                return false;
            }
            if (field659 == -1) {
                Statics.field355.method1433(field500.field2036, 0, 1);
                field500.field2030 = 0;
                field659 = field500.method2354();
                field533 = class165.field2777[field659];
                var0--;
            }
            if (field533 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field355.method1433(field500.field2036, 0, 1);
                field533 = field500.field2036[0] & 0xFF;
                var0--;
            }
            if (field533 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field355.method1433(field500.field2036, 0, 2);
                field500.field2030 = 0;
                field533 = field500.method2581();
                var0 -= 2;
            }
            if (var0 < field533) {
                return false;
            }
            field500.field2030 = 0;
            Statics.field355.method1433(field500.field2036, 0, field533);
            field503 = 0;
            field568 = field507;
            field507 = field680;
            field680 = field659;
            if (field659 == 133) {
                int var1 = field500.method2489();
                int var2 = field500.method2581();
                if (var1 < -70000) {
                    var2 += 32768;
                }
                class159 var3;
                if (var1 >= 0) {
                    var3 = class159.method1397(var1);
                } else {
                    var3 = null;
                }
                while (field500.field2030 < field533) {
                    int var4 = field500.method2511();
                    int var5 = field500.method2581();
                    int var6 = 0;
                    if (var5 != 0) {
                        var6 = field500.method2498();
                        if (var6 == 255) {
                            var6 = field500.method2489();
                        }
                    }
                    if (var3 != null && var4 >= 0 && var4 < var3.field2704.length) {
                        var3.field2704[var4] = var5;
                        var3.field2643[var4] = var6;
                    }
                    class19.method2074(var2, var4, var5 - 1, var6);
                }
                if (var3 != null) {
                    method1331(var3);
                }
                method36();
                field548[++field643 - 1 & 0x1F] = var2 & 0x7FFF;
                field659 = -1;
                return true;
            }
            if (field659 == 92) {
                Statics.field1747 = class138.method789(field500.method2498());
                field659 = -1;
                return true;
            }
            if (field659 == 11) {
                int var7 = field500.method2581();
                int var8 = field500.method2498();
                int var9 = field500.method2581();
                if (field695 != 0 && var8 != 0 && field697 < 50) {
                    field718[field697] = var7;
                    field699[field697] = var8;
                    field700[field697] = var9;
                    field702[field697] = null;
                    field701[field697] = 0;
                    field697++;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 45) {
                int var13 = field500.method2555();
                int var14 = field500.method2685();
                class159 var15 = class159.method1397(var14);
                if (var15.field2634 != 2 || var15.field2664 != var13) {
                    var15.field2634 = 2;
                    var15.field2664 = var13;
                    method1331(var15);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 176) {
                for (int var16 = 0; var16 < field506.length; var16++) {
                    if (field506[var16] != null) {
                        field506[var16].field403 = -1;
                    }
                }
                for (int var17 = 0; var17 < field494.length; var17++) {
                    if (field494[var17] != null) {
                        field494[var17].field403 = -1;
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 78) {
                int var18 = field500.method2555();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field500.method2685();
                int var20 = field500.method2594();
                int var21 = field500.method2530();
                if (var21 == 65535) {
                    var21 = -1;
                }
                for (int var22 = var21; var22 <= var18; var22++) {
                    long var23 = ((long) var20 << 32) + (long) var22;
                    class179 var25 = field656.method3405(var23);
                    if (var25 != null) {
                        var25.method3455();
                    }
                    field656.method3406(new class171(var19), var23);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 74) {
                int var26 = field500.method2594();
                int var27 = field500.method2530();
                class159 var28 = class159.method1397(var26);
                if (var28 != null && var28.field2705 == 0) {
                    if (var27 > var28.field2618 - var28.field2672) {
                        var27 = var28.field2618 - var28.field2672;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                    if (var28.field2616 != var27) {
                        var28.field2616 = var27;
                        method1331(var28);
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 166) {
                int var29 = field500.method2581();
                if (var29 == 65535) {
                    var29 = -1;
                }
                int var30 = field500.method2685();
                int var31 = field500.method2539();
                class159 var32 = class159.method1397(var31);
                if (var32.field2601) {
                    var32.field2695 = var29;
                    var32.field2707 = var30;
                    class40 var34 = class40.method31(var29);
                    var32.field2642 = var34.field982;
                    var32.field2663 = var34.field983;
                    var32.field2644 = var34.field984;
                    var32.field2653 = var34.field968;
                    var32.field2641 = var34.field986;
                    var32.field2645 = var34.field997;
                    if (var32.field2611 > 0) {
                        var32.field2645 = var32.field2645 * 32 / var32.field2611;
                    }
                    method1331(var32);
                } else if (var29 == -1) {
                    var32.field2634 = 0;
                    field659 = -1;
                    return true;
                } else {
                    class40 var33 = class40.method31(var29);
                    var32.field2634 = 4;
                    var32.field2664 = var29;
                    var32.field2642 = var33.field982;
                    var32.field2663 = var33.field983;
                    var32.field2645 = var33.field997 * 100 / var30;
                    method1331(var32);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 94) {
                Statics.field740 = field500.method2498();
                Statics.field256 = field500.method2624();
                field659 = -1;
                return true;
            }
            if (field659 == 185) {
                method36();
                field621 = field500.method2498();
                field649 = field639;
                field659 = -1;
                return true;
            }
            if (field659 == 43) {
                field648 = field639;
                if (field533 == 0) {
                    field682 = null;
                    field683 = null;
                    Statics.field1928 = 0;
                    Statics.field67 = null;
                    field659 = -1;
                    return true;
                }
                field683 = field500.method2506();
                long var35 = field500.method2673();
                long var37 = var35;
                String var39;
                if (var35 <= 0L || var35 >= 6582952005840035281L) {
                    var39 = null;
                } else if (var35 % 37L == 0L) {
                    var39 = null;
                } else {
                    int var40 = 0;
                    for (long var41 = var35; var41 != 0L; var41 /= 37L) {
                        var40++;
                    }
                    StringBuilder var43 = new StringBuilder(var40);
                    while (var37 != 0L) {
                        long var44 = var37;
                        var37 /= 37L;
                        var43.append(class147.field2466[(int) (var44 - var37 * 37L)]);
                    }
                    var39 = var43.reverse().toString();
                }
                field682 = var39;
                Statics.field2336 = field500.method2499();
                int var46 = field500.method2498();
                if (var46 == 255) {
                    field659 = -1;
                    return true;
                }
                Statics.field1928 = var46;
                class8[] var47 = new class8[100];
                for (int var48 = 0; var48 < Statics.field1928; var48++) {
                    var47[var48] = new class8();
                    var47[var48].field116 = field500.method2506();
                    var47[var48].field109 = class149.method220(var47[var48].field116, Statics.field459);
                    var47[var48].field112 = field500.method2581();
                    var47[var48].field111 = field500.method2499();
                    field500.method2506();
                    if (var47[var48].field116.equals(Statics.field905.field37)) {
                        Statics.field227 = var47[var48].field111;
                    }
                }
                boolean var49 = false;
                int var50 = Statics.field1928;
                while (var50 > 0) {
                    boolean var51 = true;
                    var50--;
                    for (int var52 = 0; var52 < var50; var52++) {
                        if (var47[var52].field109.compareTo(var47[var52 + 1].field109) > 0) {
                            class8 var53 = var47[var52];
                            var47[var52] = var47[var52 + 1];
                            var47[var52 + 1] = var53;
                            var51 = false;
                        }
                    }
                    if (var51) {
                        break;
                    }
                }
                Statics.field67 = var47;
                field659 = -1;
                return true;
            }
            if (field659 == 198) {
                String var54 = field500.method2506();
                int var55 = field500.method2489();
                class159 var56 = class159.method1397(var55);
                if (!var54.equals(var56.field2649)) {
                    var56.field2649 = var54;
                    method1331(var56);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 155) {
                int var57 = field500.method2539();
                class159 var58 = class159.method1397(var57);
                var58.field2634 = 3;
                var58.field2664 = Statics.field905.field50.method3324();
                method1331(var58);
                field659 = -1;
                return true;
            }
            if (field659 == 126) {
                String var59 = field500.method2506();
                long var60 = (long) field500.method2581();
                long var62 = (long) field500.method2502();
                int var64 = field500.method2498();
                long var65 = (var60 << 32) + var62;
                boolean var67 = false;
                for (int var68 = 0; var68 < 100; var68++) {
                    if (field676[var68] == var65) {
                        var67 = true;
                        break;
                    }
                }
                if (method128(var59)) {
                    var67 = true;
                }
                if (!var67 && field575 == 0) {
                    field676[field677] = var65;
                    field677 = (field677 + 1) % 100;
                    class116 var69 = field500;
                    String var73;
                    try {
                        int var70 = var69.method2511();
                        if (var70 > 32767) {
                            var70 = 32767;
                        }
                        byte[] var71 = new byte[var70];
                        var69.field2030 += Statics.field2836.method2423(var69.field2036, var69.field2030, var71, 0, var70);
                        String var72 = class150.method2756(var71, 0, var70);
                        var73 = var72;
                    } catch (Exception var311) {
                        var73 = "Cabbage";
                    }
                    String var76 = class185.method3485(class148.method640(var73));
                    if (var64 == 2 || var64 == 3) {
                        method3179(7, class2.method2478(1) + var59, var76);
                    } else if (var64 == 1) {
                        method3179(7, class2.method2478(0) + var59, var76);
                    } else {
                        method3179(3, var59, var76);
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 127) {
                field634 = field500.method2498();
                if (field634 == 255) {
                    field634 = 0;
                }
                field587 = field500.method2498();
                if (field587 == 255) {
                    field587 = 0;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 7) {
                method36();
                int var77 = field500.method2615();
                int var78 = field500.method2685();
                int var79 = field500.method2521();
                field613[var77] = var78;
                field594[var77] = var79;
                field595[var77] = 1;
                for (int var80 = 0; var80 < 98; var80++) {
                    if (var78 >= class131.field2058[var80]) {
                        field595[var77] = var80 + 2;
                    }
                }
                field475[++field645 - 1 & 0x1F] = var77;
                field659 = -1;
                return true;
            }
            if (field659 == 146) {
                String var81 = field500.method2506();
                class116 var82 = field500;
                String var86;
                try {
                    int var83 = var82.method2511();
                    if (var83 > 32767) {
                        var83 = 32767;
                    }
                    byte[] var84 = new byte[var83];
                    var82.field2030 += Statics.field2836.method2423(var82.field2036, var82.field2030, var84, 0, var83);
                    String var85 = class150.method2756(var84, 0, var83);
                    var86 = var85;
                } catch (Exception var310) {
                    var86 = "Cabbage";
                }
                String var89 = class185.method3485(class148.method640(var86));
                method3179(6, var81, var89);
                field659 = -1;
                return true;
            }
            if (field659 == 30 || field659 == 226 || field659 == 160 || field659 == 9 || field659 == 102 || field659 == 64 || field659 == 89 || field659 == 140 || field659 == 67 || field659 == 131 || field659 == 249) {
                method833();
                field659 = -1;
                return true;
            }
            if (field659 == 4) {
                int var90 = field500.method2501();
                int var91 = field500.method2489();
                class159 var92 = class159.method1397(var91);
                if (var92.field2659 != var90 || var90 == -1) {
                    var92.field2659 = var90;
                    var92.field2708 = 0;
                    var92.field2699 = 0;
                    method1331(var92);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 189) {
                int var93 = field500.method2498();
                int var94 = field500.method2498();
                int var95 = field500.method2498();
                int var96 = field500.method2498();
                field704[var93] = true;
                field705[var93] = var94;
                field698[var93] = var95;
                field707[var93] = var96;
                field708[var93] = 0;
                field659 = -1;
                return true;
            }
            if (field659 == 18) {
                while (field500.field2030 < field533) {
                    boolean var97 = field500.method2498() == 1;
                    String var98 = field500.method2506();
                    String var99 = field500.method2506();
                    int var100 = field500.method2581();
                    int var101 = field500.method2498();
                    int var102 = field500.method2498();
                    boolean var103 = (var102 & 0x2) != 0;
                    boolean var104 = (var102 & 0x1) != 0;
                    if (var100 > 0) {
                        field500.method2506();
                        field500.method2498();
                        field500.method2489();
                    }
                    field500.method2506();
                    for (int var105 = 0; var105 < field709; var105++) {
                        class23 var106 = field668[var105];
                        if (var97) {
                            if (var99.equals(var106.field350)) {
                                var106.field350 = var98;
                                var106.field349 = var99;
                                var98 = null;
                                break;
                            }
                        } else if (var98.equals(var106.field350)) {
                            if (var106.field354 != var100) {
                                boolean var107 = true;
                                for (class28 var108 = (class28) field712.method3395(); var108 != null; var108 = (class28) field712.method3390()) {
                                    if (var108.field723.equals(var98)) {
                                        if (var100 != 0 && var108.field719 == 0) {
                                            var108.method3451();
                                            var107 = false;
                                        } else if (var100 == 0 && var108.field719 != 0) {
                                            var108.method3451();
                                            var107 = false;
                                        }
                                    }
                                }
                                if (var107) {
                                    field712.method3389(new class28(var98, var100));
                                }
                                var106.field354 = var100;
                            }
                            var106.field349 = var99;
                            var106.field351 = var101;
                            var106.field352 = var103;
                            var106.field353 = var104;
                            var98 = null;
                            break;
                        }
                    }
                    if (var98 != null && field709 < 400) {
                        class23 var109 = new class23();
                        field668[field709] = var109;
                        var109.field350 = var98;
                        var109.field349 = var99;
                        var109.field354 = var100;
                        var109.field351 = var101;
                        var109.field352 = var103;
                        var109.field353 = var104;
                        field709++;
                    }
                }
                field644 = 2;
                field647 = field639;
                boolean var110 = false;
                int var111 = field709;
                while (var111 > 0) {
                    boolean var112 = true;
                    var111--;
                    for (int var113 = 0; var113 < var111; var113++) {
                        boolean var114 = false;
                        class23 var115 = field668[var113];
                        class23 var116 = field668[var113 + 1];
                        if (field657 != var115.field354 && field657 == var116.field354) {
                            var114 = true;
                        }
                        if (!var114 && var115.field354 == 0 && var116.field354 != 0) {
                            var114 = true;
                        }
                        if (!var114 && !var115.field352 && var116.field352) {
                            var114 = true;
                        }
                        if (!var114 && !var115.field353 && var116.field353) {
                            var114 = true;
                        }
                        if (var114) {
                            class23 var117 = field668[var113];
                            field668[var113] = field668[var113 + 1];
                            field668[var113 + 1] = var117;
                            var112 = false;
                        }
                    }
                    if (var112) {
                        break;
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 24) {
                while (field500.field2030 < field533) {
                    int var118 = field500.method2498();
                    boolean var119 = (var118 & 0x1) == 1;
                    String var120 = field500.method2506();
                    String var121 = field500.method2506();
                    field500.method2506();
                    for (int var122 = 0; var122 < field713; var122++) {
                        class11 var123 = field580[var122];
                        if (var119) {
                            if (var121.equals(var123.field169)) {
                                var123.field169 = var120;
                                var123.field167 = var121;
                                var120 = null;
                                break;
                            }
                        } else if (var120.equals(var123.field169)) {
                            var123.field169 = var120;
                            var123.field167 = var121;
                            var120 = null;
                            break;
                        }
                    }
                    if (var120 != null && field713 < 400) {
                        class11 var124 = new class11();
                        field580[field713] = var124;
                        var124.field169 = var120;
                        var124.field167 = var121;
                        field713++;
                    }
                }
                field647 = field639;
                field659 = -1;
                return true;
            }
            if (field659 == 49) {
                int var125 = field500.method2489();
                Statics.field907 = Statics.field2345.method1550(var125);
                field659 = -1;
                return true;
            }
            if (field659 == 50) {
                field674 = field500.method2498();
                field463 = field500.method2498();
                field659 = -1;
                return true;
            }
            if (field659 == 165) {
                method755(false);
                field659 = -1;
                return true;
            }
            if (field659 == 136) {
                field472 = field500.method2581() * 30;
                field649 = field639;
                field659 = -1;
                return true;
            }
            if (field659 == 151) {
                field703 = true;
                Statics.field8 = field500.method2498();
                Statics.field83 = field500.method2498();
                Statics.field389 = field500.method2581();
                Statics.field1437 = field500.method2498();
                Statics.field1260 = field500.method2498();
                if (Statics.field1260 >= 100) {
                    Statics.field2423 = Statics.field8 * 128 + 64;
                    Statics.field187 = Statics.field83 * 128 + 64;
                    Statics.field1286 = method2435(Statics.field2423, Statics.field187, Statics.field2374) - Statics.field389;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 144) {
                field644 = 1;
                field647 = field639;
                field659 = -1;
                return true;
            }
            if (field659 == 174) {
                for (int var126 = 0; var126 < class160.field2725.length; var126++) {
                    if (class160.field2725[var126] != class160.field2722[var126]) {
                        class160.field2725[var126] = class160.field2722[var126];
                        method3292(var126);
                        field640[++field593 - 1 & 0x1F] = var126;
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 188) {
                String var127 = field500.method2506();
                if (var127.endsWith(":tradereq:")) {
                    String var128 = var127.substring(0, var127.indexOf(":"));
                    boolean var129 = false;
                    if (method128(var128)) {
                        var129 = true;
                    }
                    if (!var129 && field575 == 0) {
                        method3179(4, var128, class135.field2319);
                    }
                } else if (var127.endsWith(":duelreq:")) {
                    String var130 = var127.substring(0, var127.indexOf(":"));
                    boolean var131 = false;
                    if (method128(var130)) {
                        var131 = true;
                    }
                    if (!var131 && field575 == 0) {
                        method3179(8, var130, class135.field2229);
                    }
                } else if (var127.endsWith(":chalreq:")) {
                    String var132 = var127.substring(0, var127.indexOf(":"));
                    boolean var133 = false;
                    if (method128(var132)) {
                        var133 = true;
                    }
                    if (!var133 && field575 == 0) {
                        String var134 = var127.substring(var127.indexOf(":") + 1, var127.length() - 9);
                        method3179(8, var132, var134);
                    }
                } else if (var127.endsWith(":assistreq:")) {
                    String var135 = var127.substring(0, var127.indexOf(":"));
                    boolean var136 = false;
                    if (method128(var135)) {
                        var136 = true;
                    }
                    if (!var136 && field575 == 0) {
                        method3179(10, var135, "");
                    }
                } else if (var127.endsWith(":clan:")) {
                    String var137 = var127.substring(0, var127.indexOf(":clan:"));
                    method3179(11, "", var137);
                } else if (var127.endsWith(":trade:")) {
                    String var138 = var127.substring(0, var127.indexOf(":trade:"));
                    if (field575 == 0) {
                        method3179(12, "", var138);
                    }
                } else if (var127.endsWith(":assist:")) {
                    String var139 = var127.substring(0, var127.indexOf(":assist:"));
                    if (field575 == 0) {
                        method3179(13, "", var139);
                    }
                } else if (var127.endsWith(":broadcast:")) {
                    String var140 = var127.substring(0, var127.indexOf(":broadcast:"));
                    if (field575 == 0) {
                        method3179(14, "", var140);
                    }
                } else {
                    method3179(0, "", var127);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 223) {
                int var141 = field500.method2489();
                class4 var142 = (class4) field617.method3405((long) var141);
                if (var142 != null) {
                    method207(var142, true);
                }
                if (field620 != null) {
                    method1331(field620);
                    field620 = null;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 81) {
                method755(true);
                field659 = -1;
                return true;
            }
            if (field659 == 86) {
                int var143 = field500.method2555();
                if (var143 == 65535) {
                    var143 = -1;
                }
                method2079(var143);
                field659 = -1;
                return true;
            }
            if (field659 == 103) {
                int var144 = field500.method2533();
                int var145 = field500.method2531();
                if (var145 == 65535) {
                    var145 = -1;
                }
                if (field484 != 0 && var145 != -1) {
                    class139.method2165(Statics.field487, var145, 0, field484, false);
                    field596 = true;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 149) {
                int var146 = field500.method2539();
                boolean var147 = field500.method2624() == 1;
                class159 var148 = class159.method1397(var146);
                if (var148.field2614 != var147) {
                    var148.field2614 = var147;
                    method1331(var148);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 40) {
                int var149 = field500.method2531();
                class19.method1369(var149);
                field548[++field643 - 1 & 0x1F] = var149 & 0x7FFF;
                field659 = -1;
                return true;
            }
            if (field659 == 13) {
                String var150 = field500.method2506();
                long var151 = field500.method2673();
                long var153 = (long) field500.method2581();
                long var155 = (long) field500.method2502();
                int var157 = field500.method2498();
                long var158 = (var153 << 32) + var155;
                boolean var160 = false;
                for (int var161 = 0; var161 < 100; var161++) {
                    if (field676[var161] == var158) {
                        var160 = true;
                        break;
                    }
                }
                if (var157 <= 1 && method128(var150)) {
                    var160 = true;
                }
                if (!var160 && field575 == 0) {
                    field676[field677] = var158;
                    field677 = (field677 + 1) % 100;
                    class116 var162 = field500;
                    String var166;
                    try {
                        int var163 = var162.method2511();
                        if (var163 > 32767) {
                            var163 = 32767;
                        }
                        byte[] var164 = new byte[var163];
                        var162.field2030 += Statics.field2836.method2423(var162.field2036, var162.field2030, var164, 0, var163);
                        String var165 = class150.method2756(var164, 0, var163);
                        var166 = var165;
                    } catch (Exception var309) {
                        var166 = "Cabbage";
                    }
                    String var169 = class185.method3485(class148.method640(var166));
                    if (var157 == 2 || var157 == 3) {
                        method196(9, class2.method2478(1) + var150, var169, class147.method904(var151));
                    } else if (var157 == 1) {
                        method196(9, class2.method2478(0) + var150, var169, class147.method904(var151));
                    } else {
                        method196(9, var150, var169, class147.method904(var151));
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 111) {
                String var170 = field500.method2506();
                Object[] var171 = new Object[var170.length() + 1];
                for (int var172 = var170.length() - 1; var172 >= 0; var172--) {
                    if (var170.charAt(var172) == 's') {
                        var171[var172 + 1] = field500.method2506();
                    } else {
                        var171[var172 + 1] = Integer.valueOf(field500.method2489());
                    }
                }
                var171[0] = Integer.valueOf(field500.method2489());
                class1 var173 = new class1();
                var173.field6 = var171;
                class26.method47(var173);
                field659 = -1;
                return true;
            }
            if (field659 == 53) {
                int var174 = field500.method2521();
                int var175 = field500.method2521();
                int var176 = field500.method2521();
                Statics.field2374 = var174 >> 1;
                Statics.field905.method222(var175, var176, (var174 & 0x1) == 1);
                field659 = -1;
                return true;
            }
            if (field659 == 48) {
                field637 = 0;
                field579 = 0;
                method200();
                method23();
                while (field500.method2358(field533) >= 11) {
                    int var177 = field500.method2379(11);
                    if (var177 == 2047) {
                        break;
                    }
                    boolean var178 = false;
                    if (field506[var177] == null) {
                        field506[var177] = new class3();
                        if (field581[var177] != null) {
                            field506[var177].method19(field581[var177]);
                        }
                        var178 = true;
                    }
                    field642[++field570 - 1] = var177;
                    class3 var179 = field506[var177];
                    var179.field439 = field465;
                    int var180 = field589[field500.method2379(3)];
                    if (var178) {
                        var179.field441 = var179.field428 = var180;
                    }
                    int var181 = field500.method2379(1);
                    if (var181 == 1) {
                        field630[++field579 - 1] = var177;
                    }
                    int var182 = field500.method2379(5);
                    if (var182 > 15) {
                        var182 -= 32;
                    }
                    int var183 = field500.method2379(5);
                    if (var183 > 15) {
                        var183 -= 32;
                    }
                    int var184 = field500.method2379(1);
                    var179.method222(Statics.field905.field395[0] + var183, Statics.field905.field446[0] + var182, var184 == 1);
                }
                field500.method2357();
                method1420();
                for (int var185 = 0; var185 < field637; var185++) {
                    int var186 = field585[var185];
                    if (field465 != field506[var186].field439) {
                        field506[var186] = null;
                    }
                }
                if (field533 != field500.field2030) {
                    throw new RuntimeException(field500.field2030 + class2.field18 + field533);
                }
                for (int var187 = 0; var187 < field570; var187++) {
                    if (field506[field642[var187]] == null) {
                        throw new RuntimeException(var187 + class2.field18 + field570);
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 167) {
                for (int var188 = 0; var188 < Statics.field1028; var188++) {
                    class42 var189 = class42.method1457(var188);
                    if (var189 != null && var189.field1030 == 0) {
                        class160.field2722[var188] = 0;
                        class160.field2725[var188] = 0;
                    }
                }
                method36();
                field593 += 32;
                field659 = -1;
                return true;
            }
            if (field659 == 148) {
                int var190 = field533 + field500.field2030;
                int var191 = field500.method2581();
                int var192 = field500.method2581();
                if (field711 != var191) {
                    field711 = var191;
                    method18(field711);
                    class26.method6(field711);
                    for (int var193 = 0; var193 < 100; var193++) {
                        field493[var193] = true;
                    }
                }
                while (var192-- > 0) {
                    int var194 = field500.method2489();
                    int var195 = field500.method2581();
                    int var196 = field500.method2498();
                    class4 var197 = (class4) field617.method3405((long) var194);
                    if (var197 != null && var197.field56 != var195) {
                        method207(var197, true);
                        var197 = null;
                    }
                    if (var197 == null) {
                        var197 = method1894(var194, var195, var196);
                    }
                    var197.field54 = true;
                }
                for (class4 var198 = (class4) field617.method3408(); var198 != null; var198 = (class4) field617.method3415()) {
                    if (var198.field54) {
                        var198.field54 = false;
                    } else {
                        method207(var198, true);
                    }
                }
                field656 = new class175(512);
                while (field500.field2030 < var190) {
                    int var199 = field500.method2489();
                    int var200 = field500.method2581();
                    int var201 = field500.method2581();
                    int var202 = field500.method2489();
                    for (int var203 = var200; var203 <= var201; var203++) {
                        long var204 = ((long) var199 << 32) + (long) var203;
                        field656.method3406(new class171(var202), var204);
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 135) {
                method1476();
                field659 = -1;
                return false;
            }
            if (field659 == 157) {
                Statics.field256 = field500.method2624();
                Statics.field740 = field500.method2624();
                for (int var206 = Statics.field740; var206 < Statics.field740 + 8; var206++) {
                    for (int var207 = Statics.field256; var207 < Statics.field256 + 8; var207++) {
                        if (field653[Statics.field2374][var206][var207] != null) {
                            field653[Statics.field2374][var206][var207] = null;
                            method2397(var206, var207);
                        }
                    }
                }
                for (class22 var208 = (class22) field597.method3446(); var208 != null; var208 = (class22) field597.method3428()) {
                    if (var208.field331 >= Statics.field740 && var208.field331 < Statics.field740 + 8 && var208.field332 >= Statics.field256 && var208.field332 < Statics.field256 + 8 && Statics.field2374 == var208.field340) {
                        var208.field346 = 0;
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 177) {
                int var209 = field500.method2624();
                int var210 = field500.method2521();
                String var211 = field500.method2506();
                if (var209 >= 1 && var209 <= 8) {
                    if (var211.equalsIgnoreCase("null")) {
                        var211 = null;
                    }
                    field622[var209 - 1] = var211;
                    field588[var209 - 1] = var210 == 0;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 56) {
                int var212 = field500.method2530();
                int var213 = field500.method2685();
                int var214 = field500.method2530();
                class159 var215 = class159.method1397(var213);
                var215.field2703 = (var212 << 16) + var214;
                field659 = -1;
                return true;
            }
            if (field659 == 143) {
                String var216 = field500.method2506();
                int var217 = field500.method2581();
                byte var218 = field500.method2499();
                boolean var219 = false;
                if (var218 == -128) {
                    var219 = true;
                }
                if (var219) {
                    if (Statics.field1928 == 0) {
                        field659 = -1;
                        return true;
                    }
                    boolean var220 = false;
                    int var221;
                    for (var221 = 0; var221 < Statics.field1928 && (!Statics.field67[var221].field116.equals(var216) || Statics.field67[var221].field112 != var217); var221++) {
                    }
                    if (var221 < Statics.field1928) {
                        while (var221 < Statics.field1928 - 1) {
                            Statics.field67[var221] = Statics.field67[var221 + 1];
                            var221++;
                        }
                        Statics.field1928--;
                        Statics.field67[Statics.field1928] = null;
                    }
                } else {
                    field500.method2506();
                    class8 var222 = new class8();
                    var222.field116 = var216;
                    var222.field109 = class149.method220(var222.field116, Statics.field459);
                    var222.field112 = var217;
                    var222.field111 = var218;
                    int var223;
                    for (var223 = Statics.field1928 - 1; var223 >= 0; var223--) {
                        int var224 = Statics.field67[var223].field109.compareTo(var222.field116);
                        if (var224 == 0) {
                            Statics.field67[var223].field112 = var217;
                            Statics.field67[var223].field111 = var218;
                            if (var216.equals(Statics.field905.field37)) {
                                Statics.field227 = var218;
                            }
                            field648 = field639;
                            field659 = -1;
                            return true;
                        }
                        if (var224 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1928 >= Statics.field67.length) {
                        field659 = -1;
                        return true;
                    }
                    for (int var225 = Statics.field1928 - 1; var225 > var223; var225--) {
                        Statics.field67[var225 + 1] = Statics.field67[var225];
                    }
                    if (Statics.field1928 == 0) {
                        Statics.field67 = new class8[100];
                    }
                    Statics.field67[var223 + 1] = var222;
                    Statics.field1928++;
                    if (var216.equals(Statics.field905.field37)) {
                        Statics.field227 = var218;
                    }
                }
                field648 = field639;
                field659 = -1;
                return true;
            }
            if (field659 == 87) {
                if (field711 != -1) {
                    int var226 = field711;
                    if (class159.method129(var226)) {
                        method2169(Statics.field1921[var226], 0);
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 145) {
                field703 = false;
                for (int var227 = 0; var227 < 5; var227++) {
                    field704[var227] = false;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 255) {
                int var228 = field500.method2542();
                int var229 = field500.method2685();
                int var230 = field500.method2501();
                class159 var231 = class159.method1397(var229);
                int var232 = var231.field2714 + var228;
                int var233 = var231.field2666 + var230;
                if (var231.field2607 != var232 || var231.field2640 != var233) {
                    var231.field2607 = var232;
                    var231.field2640 = var233;
                    method1331(var231);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 187) {
                field500.field2030 += 28;
                if (field500.method2513()) {
                    class82.method837(field500, field500.field2030 - 28);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 25) {
                method36();
                field584 = field500.method2542();
                field649 = field639;
                field659 = -1;
                return true;
            }
            if (field659 == 219) {
                field703 = true;
                Statics.field857 = field500.method2498();
                Statics.field1408 = field500.method2498();
                Statics.field324 = field500.method2581();
                Statics.field168 = field500.method2498();
                Statics.field180 = field500.method2498();
                if (Statics.field180 >= 100) {
                    int var234 = Statics.field857 * 128 + 64;
                    int var235 = Statics.field1408 * 128 + 64;
                    int var236 = method2435(var234, var235, Statics.field2374) - Statics.field324;
                    int var237 = var234 - Statics.field2423;
                    int var238 = var236 - Statics.field1286;
                    int var239 = var235 - Statics.field187;
                    int var240 = (int) Math.sqrt((double) (var237 * var237 + var239 * var239));
                    Statics.field2468 = (int) (Math.atan2((double) var238, (double) var240) * 325.949D) & 0x7FF;
                    Statics.field1815 = (int) (Math.atan2((double) var237, (double) var239) * -325.949D) & 0x7FF;
                    if (Statics.field2468 < 128) {
                        Statics.field2468 = 128;
                    }
                    if (Statics.field2468 > 383) {
                        Statics.field2468 = 383;
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 35) {
                field473 = field500.method2498();
                if (field473 == 1) {
                    field474 = field500.method2581();
                }
                if (field473 >= 2 && field473 <= 6) {
                    if (field473 == 2) {
                        field479 = 64;
                        field671 = 64;
                    }
                    if (field473 == 3) {
                        field479 = 0;
                        field671 = 64;
                    }
                    if (field473 == 4) {
                        field479 = 128;
                        field671 = 64;
                    }
                    if (field473 == 5) {
                        field479 = 64;
                        field671 = 0;
                    }
                    if (field473 == 6) {
                        field479 = 64;
                        field671 = 128;
                    }
                    field473 = 2;
                    field476 = field500.method2581();
                    field477 = field500.method2581();
                    field478 = field500.method2498();
                }
                if (field473 == 10) {
                    field529 = field500.method2581();
                }
                field659 = -1;
                return true;
            }
            if (field659 == 116) {
                field637 = 0;
                field579 = 0;
                Statics.method2167();
                method544();
                method213();
                for (int var241 = 0; var241 < field637; var241++) {
                    int var242 = field585[var241];
                    if (field465 != field494[var242].field439) {
                        field494[var242].field367 = null;
                        field494[var242] = null;
                    }
                }
                if (field533 != field500.field2030) {
                    throw new RuntimeException(field500.field2030 + class2.field18 + field533);
                }
                for (int var243 = 0; var243 < field495; var243++) {
                    if (field494[field496[var243]] == null) {
                        throw new RuntimeException(var243 + class2.field18 + field495);
                    }
                }
                field659 = -1;
                return true;
            }
            if (field659 == 230) {
                class116 var244 = field500;
                int var245 = field533;
                class181 var246 = new class181();
                var246.field2825 = var244.method2498();
                var246.field2828 = var244.method2489();
                var246.field2823 = new int[var246.field2825];
                var246.field2826 = new int[var246.field2825];
                var246.field2824 = new Field[var246.field2825];
                var246.field2830 = new int[var246.field2825];
                var246.field2829 = new Method[var246.field2825];
                var246.field2827 = new byte[var246.field2825][][];
                for (int var247 = 0; var247 < var246.field2825; var247++) {
                    try {
                        int var248 = var244.method2498();
                        if (var248 == 0 || var248 == 1 || var248 == 2) {
                            String var249 = new String(var244.method2506());
                            String var250 = new String(var244.method2506());
                            int var251 = 0;
                            if (var248 == 1) {
                                var251 = var244.method2489();
                            }
                            var246.field2823[var247] = var248;
                            var246.field2830[var247] = var251;
                            var246.field2824[var247] = class182.method103(var249).getDeclaredField(var250);
                        } else if (var248 == 3 || var248 == 4) {
                            String var252 = new String(var244.method2506());
                            String var253 = new String(var244.method2506());
                            int var254 = var244.method2498();
                            String[] var255 = new String[var254];
                            for (int var256 = 0; var256 < var254; var256++) {
                                var255[var256] = new String(var244.method2506());
                            }
                            byte[][] var257 = new byte[var254][];
                            if (var248 == 3) {
                                for (int var258 = 0; var258 < var254; var258++) {
                                    int var259 = var244.method2489();
                                    var257[var258] = new byte[var259];
                                    var244.method2504(var257[var258], 0, var259);
                                }
                            }
                            var246.field2823[var247] = var248;
                            Class[] var260 = new Class[var254];
                            for (int var261 = 0; var261 < var254; var261++) {
                                var260[var261] = class182.method103(var255[var261]);
                            }
                            var246.field2829[var247] = class182.method103(var252).getDeclaredMethod(var253, var260);
                            var246.field2827[var247] = var257;
                        }
                    } catch (ClassNotFoundException var312) {
                        var246.field2826[var247] = -1;
                    } catch (SecurityException var313) {
                        var246.field2826[var247] = -2;
                    } catch (NullPointerException var314) {
                        var246.field2826[var247] = -3;
                    } catch (Exception var315) {
                        var246.field2826[var247] = -4;
                    } catch (Throwable var316) {
                        var246.field2826[var247] = -5;
                    }
                }
                class182.field2831.method3422(var246);
                field659 = -1;
                return true;
            }
            if (field659 == 236) {
                int var267 = field500.method2685();
                int var268 = field500.method2581();
                class159 var269 = class159.method1397(var267);
                if (var269.field2634 != 1 || var269.field2664 != var268) {
                    var269.field2634 = 1;
                    var269.field2664 = var268;
                    method1331(var269);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 202) {
                int var270 = field500.method2489();
                int var271 = field500.method2581();
                if (var270 < -70000) {
                    var271 += 32768;
                }
                class159 var272;
                if (var270 >= 0) {
                    var272 = class159.method1397(var270);
                } else {
                    var272 = null;
                }
                if (var272 != null) {
                    for (int var273 = 0; var273 < var272.field2704.length; var273++) {
                        var272.field2704[var273] = 0;
                        var272.field2643[var273] = 0;
                    }
                }
                class19 var274 = (class19) class19.field272.method3405((long) var271);
                if (var274 != null) {
                    for (int var275 = 0; var275 < var274.field267.length; var275++) {
                        var274.field267[var275] = -1;
                        var274.field266[var275] = 0;
                    }
                }
                int var276 = field500.method2581();
                for (int var277 = 0; var277 < var276; var277++) {
                    int var278 = field500.method2581();
                    int var279 = field500.method2498();
                    if (var279 == 255) {
                        var279 = field500.method2539();
                    }
                    if (var272 != null && var277 < var272.field2704.length) {
                        var272.field2704[var277] = var278;
                        var272.field2643[var277] = var279;
                    }
                    class19.method2074(var271, var277, var278 - 1, var279);
                }
                if (var272 != null) {
                    method1331(var272);
                }
                method36();
                field548[++field643 - 1 & 0x1F] = var271 & 0x7FFF;
                field659 = -1;
                return true;
            }
            if (field659 == 108) {
                field691 = field500.method2498();
                field659 = -1;
                return true;
            }
            if (field659 == 98) {
                int var280 = field500.method2685();
                int var281 = field500.method2581();
                class160.field2722[var281] = var280;
                if (class160.field2725[var281] != var280) {
                    class160.field2725[var281] = var280;
                    method3292(var281);
                }
                field640[++field593 - 1 & 0x1F] = var281;
                field659 = -1;
                return true;
            }
            if (field659 == 191) {
                int var282 = field500.method2594();
                class159 var283 = class159.method1397(var282);
                for (int var284 = 0; var284 < var283.field2704.length; var284++) {
                    var283.field2704[var284] = -1;
                    var283.field2704[var284] = 0;
                }
                method1331(var283);
                field659 = -1;
                return true;
            }
            if (field659 == 150) {
                Statics.field740 = field500.method2521();
                Statics.field256 = field500.method2624();
                while (field500.field2030 < field533) {
                    field659 = field500.method2498();
                    method833();
                }
                field659 = -1;
                return true;
            }
            if (field659 == 65) {
                int var285 = field500.method2498();
                int var286 = field500.method2685();
                int var287 = field500.method2531();
                class4 var288 = (class4) field617.method3405((long) var286);
                if (var288 != null) {
                    method207(var288, var288.field56 != var287);
                }
                method1894(var286, var287, var285);
                field659 = -1;
                return true;
            }
            if (field659 == 27) {
                int var289 = field500.method2530();
                field711 = var289;
                method18(var289);
                class26.method6(field711);
                for (int var290 = 0; var290 < 100; var290++) {
                    field493[var290] = true;
                }
                field659 = -1;
                return true;
            }
            if (field659 == 197) {
                int var291 = field500.method2581();
                int var292 = field500.method2530();
                int var293 = field500.method2555();
                int var294 = field500.method2685();
                class159 var295 = class159.method1397(var294);
                if (var295.field2642 != var292 || var295.field2663 != var293 || var295.field2645 != var291) {
                    var295.field2642 = var292;
                    var295.field2663 = var293;
                    var295.field2645 = var291;
                    method1331(var295);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 20) {
                int var296 = field500.method2489();
                int var297 = field500.method2531();
                int var298 = var297 >> 10 & 0x1F;
                int var299 = var297 >> 5 & 0x1F;
                int var300 = var297 & 0x1F;
                int var301 = (var300 << 3) + (var298 << 19) + (var299 << 11);
                class159 var302 = class159.method1397(var296);
                if (var302.field2619 != var301) {
                    var302.field2619 = var301;
                    method1331(var302);
                }
                field659 = -1;
                return true;
            }
            if (field659 == 234) {
                int var303 = field500.method2555();
                byte var304 = field500.method2525();
                class160.field2722[var303] = var304;
                if (class160.field2725[var303] != var304) {
                    class160.field2725[var303] = var304;
                    method3292(var303);
                }
                field640[++field593 - 1 & 0x1F] = var303;
                field659 = -1;
                return true;
            }
            class80.method2076("" + field659 + class2.field18 + field507 + class2.field18 + field568 + class2.field18 + field533, (Throwable) null);
            method1476();
        } catch (IOException var317) {
            if (field577 > 0) {
                method1476();
            } else {
                method1(40);
                Statics.field497 = Statics.field355;
                Statics.field355 = null;
            }
        } catch (Exception var318) {
            String var307 = "" + field659 + class2.field18 + field507 + class2.field18 + field568 + class2.field18 + field533 + class2.field18 + (Statics.field1848 + Statics.field905.field395[0]) + class2.field18 + (Statics.field178 + Statics.field905.field446[0]) + class2.field18;
            for (int var308 = 0; var308 < field533 && var308 < 50; var308++) {
                var307 = var307 + field500.field2036[var308] + class2.field18;
            }
            class80.method2076(var307, var318);
            method1476();
        }
        return true;
    }

    @ObfuscatedName("al.bj(I)V")
    public static final void method833() {
        if (field659 == 249) {
            int var0 = field500.method2615();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field489[var1];
            int var4 = field500.method2615();
            int var5 = (var4 >> 4 & 0x7) + Statics.field740;
            int var6 = (var4 & 0x7) + Statics.field256;
            int var7 = field500.method2531();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                method2378(Statics.field2374, var5, var6, var3, var7, var1, var2, 0, -1);
            }
        } else if (field659 == 140) {
            int var8 = field500.method2555();
            int var9 = field500.method2555();
            int var10 = field500.method2615();
            int var11 = (var10 >> 4 & 0x7) + Statics.field740;
            int var12 = (var10 & 0x7) + Statics.field256;
            if (var11 >= 0 && var12 >= 0 && var11 < 104 && var12 < 104) {
                class17 var13 = new class17();
                var13.field241 = var9;
                var13.field242 = var8;
                if (field653[Statics.field2374][var11][var12] == null) {
                    field653[Statics.field2374][var11][var12] = new class177();
                }
                field653[Statics.field2374][var11][var12].method3422(var13);
                method2397(var11, var12);
            }
        } else if (field659 == 131) {
            int var14 = field500.method2624();
            int var15 = (var14 >> 4 & 0x7) + Statics.field740;
            int var16 = (var14 & 0x7) + Statics.field256;
            int var17 = field500.method2521();
            int var18 = var17 >> 2;
            int var19 = var17 & 0x3;
            int var20 = field489[var18];
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                method2378(Statics.field2374, var15, var16, var20, -1, var18, var19, 0, -1);
            }
        } else if (field659 == 67) {
            int var21 = field500.method2615();
            int var22 = (var21 >> 4 & 0x7) + Statics.field740;
            int var23 = (var21 & 0x7) + Statics.field256;
            int var24 = field500.method2531();
            int var25 = field500.method2615();
            int var26 = var25 >> 2;
            int var27 = var25 & 0x3;
            int var28 = field489[var26];
            if (var22 >= 0 && var23 >= 0 && var22 < 103 && var23 < 103) {
                if (var28 == 0) {
                    class96 var29 = Statics.field163.method1925(Statics.field2374, var22, var23);
                    if (var29 != null) {
                        int var30 = var29.field1611 >> 14 & 0x7FFF;
                        if (var26 == 2) {
                            var29.field1616 = new class14(var30, 2, var27 + 4, Statics.field2374, var22, var23, var24, false, var29.field1616);
                            var29.field1617 = new class14(var30, 2, var27 + 1 & 0x3, Statics.field2374, var22, var23, var24, false, var29.field1617);
                        } else {
                            var29.field1616 = new class14(var30, var26, var27, Statics.field2374, var22, var23, var24, false, var29.field1616);
                        }
                    }
                }
                if (var28 == 1) {
                    class108 var31 = Statics.field163.method1965(Statics.field2374, var22, var23);
                    if (var31 != null) {
                        int var32 = var31.field1806 >> 14 & 0x7FFF;
                        if (var26 == 4 || var26 == 5) {
                            var31.field1804 = new class14(var32, 4, var27, Statics.field2374, var22, var23, var24, false, var31.field1804);
                        } else if (var26 == 6) {
                            var31.field1804 = new class14(var32, 4, var27 + 4, Statics.field2374, var22, var23, var24, false, var31.field1804);
                        } else if (var26 == 7) {
                            var31.field1804 = new class14(var32, 4, (var27 + 2 & 0x3) + 4, Statics.field2374, var22, var23, var24, false, var31.field1804);
                        } else if (var26 == 8) {
                            var31.field1804 = new class14(var32, 4, var27 + 4, Statics.field2374, var22, var23, var24, false, var31.field1804);
                            var31.field1805 = new class14(var32, 4, (var27 + 2 & 0x3) + 4, Statics.field2374, var22, var23, var24, false, var31.field1805);
                        }
                    }
                }
                if (var28 == 2) {
                    class98 var33 = Statics.field163.method1960(Statics.field2374, var22, var23);
                    if (var26 == 11) {
                        var26 = 10;
                    }
                    if (var33 != null) {
                        var33.field1641 = new class14(var33.field1645 >> 14 & 0x7FFF, var26, var27, Statics.field2374, var22, var23, var24, false, var33.field1641);
                    }
                }
                if (var28 == 3) {
                    class107 var34 = Statics.field163.method1928(Statics.field2374, var22, var23);
                    if (var34 != null) {
                        var34.field1796 = new class14(var34.field1792 >> 14 & 0x7FFF, 22, var27, Statics.field2374, var22, var23, var24, false, var34.field1796);
                    }
                }
            }
        } else if (field659 == 102) {
            int var35 = field500.method2498();
            int var36 = (var35 >> 4 & 0x7) + Statics.field740;
            int var37 = (var35 & 0x7) + Statics.field256;
            int var38 = field500.method2581();
            int var39 = field500.method2498();
            int var40 = field500.method2581();
            if (var36 >= 0 && var37 >= 0 && var36 < 104 && var37 < 104) {
                int var41 = var36 * 128 + 64;
                int var42 = var37 * 128 + 64;
                class20 var43 = new class20(var38, Statics.field2374, var41, var42, method2435(var41, var42, Statics.field2374) - var39, var40, field465);
                field578.method3422(var43);
            }
        } else if (field659 == 9) {
            int var44 = field500.method2531();
            int var45 = field500.method2624();
            int var46 = (var45 >> 4 & 0x7) + Statics.field740;
            int var47 = (var45 & 0x7) + Statics.field256;
            int var48 = field500.method2581();
            int var49 = field500.method2530();
            if (var46 >= 0 && var47 >= 0 && var46 < 104 && var47 < 104 && field646 != var44) {
                class17 var50 = new class17();
                var50.field241 = var48;
                var50.field242 = var49;
                if (field653[Statics.field2374][var46][var47] == null) {
                    field653[Statics.field2374][var46][var47] = new class177();
                }
                field653[Statics.field2374][var46][var47].method3422(var50);
                method2397(var46, var47);
            }
        } else if (field659 == 64) {
            int var51 = field500.method2498();
            int var52 = (var51 >> 4 & 0x7) + Statics.field740;
            int var53 = (var51 & 0x7) + Statics.field256;
            int var54 = var52 + field500.method2499();
            int var55 = var53 + field500.method2499();
            int var56 = field500.method2542();
            int var57 = field500.method2581();
            int var58 = field500.method2498() * 4;
            int var59 = field500.method2498() * 4;
            int var60 = field500.method2581();
            int var61 = field500.method2581();
            int var62 = field500.method2498();
            int var63 = field500.method2498();
            if (var52 >= 0 && var53 >= 0 && var52 < 104 && var53 < 104 && var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104 && var57 != 65535) {
                int var64 = var52 * 128 + 64;
                int var65 = var53 * 128 + 64;
                int var66 = var54 * 128 + 64;
                int var67 = var55 * 128 + 64;
                class10 var68 = new class10(var57, Statics.field2374, var64, var65, method2435(var64, var65, Statics.field2374) - var58, field465 + var60, field465 + var61, var62, var63, var56, var59);
                var68.method90(var66, var67, method2435(var66, var67, Statics.field2374) - var59, field465 + var60);
                field592.method3422(var68);
            }
        } else if (field659 == 89) {
            int var69 = field500.method2521();
            int var70 = (var69 >> 4 & 0x7) + Statics.field740;
            int var71 = (var69 & 0x7) + Statics.field256;
            int var72 = field500.method2530();
            if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                class177 var73 = field653[Statics.field2374][var70][var71];
                if (var73 != null) {
                    for (class17 var74 = (class17) var73.method3446(); var74 != null; var74 = (class17) var73.method3428()) {
                        if ((var72 & 0x7FFF) == var74.field241) {
                            var74.method3455();
                            break;
                        }
                    }
                    if (var73.method3446() == null) {
                        field653[Statics.field2374][var70][var71] = null;
                    }
                    method2397(var70, var71);
                }
            }
        } else {
            if (field659 == 160) {
                byte var75 = field500.method2525();
                int var76 = field500.method2531();
                int var77 = field500.method2615();
                int var78 = (var77 >> 4 & 0x7) + Statics.field740;
                int var79 = (var77 & 0x7) + Statics.field256;
                byte var80 = field500.method2525();
                int var81 = field500.method2530();
                int var82 = field500.method2555();
                int var83 = field500.method2555();
                int var84 = field500.method2498();
                int var85 = var84 >> 2;
                int var86 = var84 & 0x3;
                int var87 = field489[var85];
                byte var88 = field500.method2523();
                byte var89 = field500.method2524();
                class3 var90;
                if (field646 == var76) {
                    var90 = Statics.field905;
                } else {
                    var90 = field506[var76];
                }
                if (var90 != null) {
                    class32 var91 = class32.method1332(var83);
                    int var92;
                    int var93;
                    if (var86 == 1 || var86 == 3) {
                        var92 = var91.field837;
                        var93 = var91.field810;
                    } else {
                        var92 = var91.field810;
                        var93 = var91.field837;
                    }
                    int var94 = (var92 >> 1) + var78;
                    int var95 = (var92 + 1 >> 1) + var78;
                    int var96 = (var93 >> 1) + var79;
                    int var97 = (var93 + 1 >> 1) + var79;
                    int[][] var98 = class9.field126[Statics.field2374];
                    int var99 = var98[var94][var96] + var98[var95][var96] + var98[var94][var97] + var98[var95][var97] >> 2;
                    int var100 = (var78 << 7) + (var92 << 6);
                    int var101 = (var79 << 7) + (var93 << 6);
                    class112 var102 = var91.method649(var85, var86, var98, var100, var99, var101);
                    if (var102 != null) {
                        method2378(Statics.field2374, var78, var79, var87, -1, 0, 0, var81 + 1, var82 + 1);
                        var90.field32 = field465 + var81;
                        var90.field40 = field465 + var82;
                        var90.field44 = var102;
                        var90.field41 = var78 * 128 + var92 * 64;
                        var90.field34 = var79 * 128 + var93 * 64;
                        var90.field42 = var99;
                        if (var75 > var89) {
                            byte var103 = var75;
                            var75 = var89;
                            var89 = var103;
                        }
                        if (var80 > var88) {
                            byte var104 = var80;
                            var80 = var88;
                            var88 = var104;
                        }
                        var90.field33 = var75 + var78;
                        var90.field47 = var78 + var89;
                        var90.field46 = var79 + var80;
                        var90.field48 = var79 + var88;
                    }
                }
            }
            if (field659 == 226) {
                int var105 = field500.method2498();
                int var106 = (var105 >> 4 & 0x7) + Statics.field740;
                int var107 = (var105 & 0x7) + Statics.field256;
                int var108 = field500.method2581();
                int var109 = field500.method2581();
                int var110 = field500.method2581();
                if (var106 >= 0 && var107 >= 0 && var106 < 104 && var107 < 104) {
                    class177 var111 = field653[Statics.field2374][var106][var107];
                    if (var111 != null) {
                        for (class17 var112 = (class17) var111.method3446(); var112 != null; var112 = (class17) var111.method3428()) {
                            if ((var108 & 0x7FFF) == var112.field241 && var112.field242 == var109) {
                                var112.field242 = var110;
                                break;
                            }
                        }
                        method2397(var106, var107);
                    }
                }
            } else if (field659 == 30) {
                int var113 = field500.method2498();
                int var114 = (var113 >> 4 & 0x7) + Statics.field740;
                int var115 = (var113 & 0x7) + Statics.field256;
                int var116 = field500.method2581();
                int var117 = field500.method2498();
                int var118 = var117 >> 4 & 0xF;
                int var119 = var117 & 0x7;
                int var120 = field500.method2498();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var121 = var118 + 1;
                    if (Statics.field905.field395[0] >= var114 - var121 && Statics.field905.field395[0] <= var114 + var121 && Statics.field905.field446[0] >= var115 - var121 && Statics.field905.field446[0] <= var115 + var121 && field688 != 0 && var119 > 0 && field697 < 50) {
                        field718[field697] = var116;
                        field699[field697] = var119;
                        field700[field697] = var120;
                        field702[field697] = null;
                        field701[field697] = (var114 << 16) + (var115 << 8) + var118;
                        field697++;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dr.bg(IIIIIIIIIB)V")
    public static final void method2378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field597.method3446(); var10 != null; var10 = (class22) field597.method3428()) {
            if (var10.field340 == arg0 && var10.field331 == arg1 && var10.field332 == arg2 && var10.field337 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field340 = arg0;
            var9.field337 = arg3;
            var9.field331 = arg1;
            var9.field332 = arg2;
            Statics.method212(var9);
            field597.method3422(var9);
        }
        var9.field334 = arg4;
        var9.field338 = arg5;
        var9.field343 = arg6;
        var9.field339 = arg7;
        var9.field346 = arg8;
    }

    @ObfuscatedName("c.bd(IIIIIIII)V")
    public static final void method146(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field623 && Statics.field2374 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field163.method1929(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field163.method1930(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field163.method1931(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field163.method1941(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field163.method1916(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field163.method1920(arg0, arg2, arg3);
                class32 var15 = class32.method1332(var12);
                if (var15.field812 != 0) {
                    field516[arg0].method2731(arg2, arg3, var13, var14, var15.field811);
                }
            }
            if (arg1 == 1) {
                Statics.field163.method2040(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field163.method1932(arg0, arg2, arg3);
                class32 var16 = class32.method1332(var12);
                if (var16.field810 + arg2 > 103 || var16.field810 + arg3 > 103 || var16.field837 + arg2 > 103 || var16.field837 + arg3 > 103) {
                    return;
                }
                if (var16.field812 != 0) {
                    field516[arg0].method2735(arg2, arg3, var16.field810, var16.field837, var14, var16.field811);
                }
            }
            if (arg1 == 3) {
                Statics.field163.method1923(arg0, arg2, arg3);
                class32 var17 = class32.method1332(var12);
                if (var17.field812 == 1) {
                    field516[arg0].method2734(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field119[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class9.method1367(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field163, field516[arg0]);
    }

    @ObfuscatedName("dp.br(III)V")
    public static final void method2397(int arg0, int arg1) {
        class177 var2 = field653[Statics.field2374][arg0][arg1];
        if (var2 == null) {
            Statics.field163.method1924(Statics.field2374, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class17 var5 = null;
        for (class17 var6 = (class17) var2.method3446(); var6 != null; var6 = (class17) var2.method3428()) {
            class40 var7 = class40.method31(var6.field241);
            long var8 = (long) var7.field973;
            if (var7.field987 == 1) {
                var8 = (long) (var6.field242 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field163.method1924(Statics.field2374, arg0, arg1);
            return;
        }
        var2.method3433(var5);
        class17 var10 = null;
        class17 var11 = null;
        for (class17 var12 = (class17) var2.method3446(); var12 != null; var12 = (class17) var2.method3428()) {
            if (var5.field241 != var12.field241) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field241 != var12.field241 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field163.method1910(Statics.field2374, arg0, arg1, method2435(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field2374), var5, var13, var10, var11);
    }

    @ObfuscatedName("h.bu(I)V")
    public static final void method200() {
        field500.method2361();
        int var0 = field500.method2379(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field500.method2379(2);
        if (var1 == 0) {
            field630[++field579 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field500.method2379(3);
            Statics.field905.method241(var2, false);
            int var3 = field500.method2379(1);
            if (var3 == 1) {
                field630[++field579 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field500.method2379(3);
            Statics.field905.method241(var4, true);
            int var5 = field500.method2379(3);
            Statics.field905.method241(var5, true);
            int var6 = field500.method2379(1);
            if (var6 == 1) {
                field630[++field579 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field500.method2379(7);
            int var8 = field500.method2379(7);
            int var9 = field500.method2379(1);
            if (var9 == 1) {
                field630[++field579 - 1] = 2047;
            }
            Statics.field2374 = field500.method2379(2);
            int var10 = field500.method2379(1);
            Statics.field905.method222(var8, var7, var10 == 1);
        }
    }

    @ObfuscatedName("x.bl(I)V")
    public static final void method23() {
        int var0 = field500.method2379(8);
        if (var0 < field570) {
            for (int var1 = var0; var1 < field570; var1++) {
                field585[++field637 - 1] = field642[var1];
            }
        }
        if (var0 > field570) {
            throw new RuntimeException("");
        }
        field570 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field642[var2];
            class3 var4 = field506[var3];
            int var5 = field500.method2379(1);
            if (var5 == 0) {
                field642[++field570 - 1] = var3;
                var4.field439 = field465;
            } else {
                int var6 = field500.method2379(2);
                if (var6 == 0) {
                    field642[++field570 - 1] = var3;
                    var4.field439 = field465;
                    field630[++field579 - 1] = var3;
                } else if (var6 == 1) {
                    field642[++field570 - 1] = var3;
                    var4.field439 = field465;
                    int var7 = field500.method2379(3);
                    var4.method241(var7, false);
                    int var8 = field500.method2379(1);
                    if (var8 == 1) {
                        field630[++field579 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field642[++field570 - 1] = var3;
                    var4.field439 = field465;
                    int var9 = field500.method2379(3);
                    var4.method241(var9, true);
                    int var10 = field500.method2379(3);
                    var4.method241(var10, true);
                    int var11 = field500.method2379(1);
                    if (var11 == 1) {
                        field630[++field579 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field585[++field637 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bi.bw(I)V")
    public static final void method1420() {
        for (int var0 = 0; var0 < field579; var0++) {
            int var1 = field630[var0];
            class3 var2 = field506[var1];
            int var3 = field500.method2498();
            if ((var3 & 0x8) != 0) {
                var3 += field500.method2498() << 8;
            }
            if ((var3 & 0x2) != 0) {
                int var4 = field500.method2624();
                int var5 = field500.method2521();
                var2.method226(var4, var5, field465);
                var2.field413 = field465 + 300;
                var2.field393 = field500.method2498();
                var2.field415 = field500.method2624();
            }
            if ((var3 & 0x10) != 0) {
                int var6 = field500.method2521();
                byte[] var7 = new byte[var6];
                class127 var8 = new class127(var7);
                field500.method2504(var7, 0, var6);
                field581[var1] = var8;
                var2.method19(var8);
            }
            if ((var3 & 0x1) != 0) {
                int var9 = field500.method2555();
                if (var9 == 65535) {
                    var9 = -1;
                }
                int var10 = field500.method2521();
                method1370(var2, var9, var10);
            }
            if ((var3 & 0x4) != 0) {
                var2.field416 = field500.method2555();
                if (var2.field416 == 65535) {
                    var2.field416 = -1;
                }
            }
            if ((var3 & 0x200) != 0) {
                var2.field427 = field500.method2581();
                int var11 = field500.method2539();
                var2.field431 = var11 >> 16;
                var2.field430 = (var11 & 0xFFFF) + field465;
                var2.field422 = 0;
                var2.field421 = 0;
                if (var2.field430 > field465) {
                    var2.field422 = -1;
                }
                if (var2.field427 == 65535) {
                    var2.field427 = -1;
                }
            }
            if ((var3 & 0x400) != 0) {
                var2.field432 = field500.method2521();
                var2.field434 = field500.method2615();
                var2.field433 = field500.method2615();
                var2.field435 = field500.method2521();
                var2.field436 = field500.method2581() + field465;
                var2.field437 = field500.method2530() + field465;
                var2.field425 = field500.method2624();
                var2.field444 = 1;
                var2.field449 = 0;
            }
            if ((var3 & 0x40) != 0) {
                int var12 = field500.method2531();
                int var13 = field500.method2624();
                int var14 = field500.method2615();
                int var15 = field500.field2030;
                if (var2.field37 != null && var2.field50 != null) {
                    boolean var16 = false;
                    if (var13 <= 1 && method128(var2.field37)) {
                        var16 = true;
                    }
                    if (!var16 && field575 == 0) {
                        field481.field2030 = 0;
                        field500.method2540(field481.field2036, 0, var14);
                        field481.field2030 = 0;
                        class127 var17 = field481;
                        String var21;
                        try {
                            int var18 = var17.method2511();
                            if (var18 > 32767) {
                                var18 = 32767;
                            }
                            byte[] var19 = new byte[var18];
                            var17.field2030 += Statics.field2836.method2423(var17.field2036, var17.field2030, var19, 0, var18);
                            String var20 = class150.method2756(var19, 0, var18);
                            var21 = var20;
                        } catch (Exception var27) {
                            var21 = "Cabbage";
                        }
                        String var24 = class185.method3485(class148.method640(var21));
                        var2.field406 = var24.trim();
                        var2.field408 = var12 >> 8;
                        var2.field409 = var12 & 0xFF;
                        var2.field429 = 150;
                        if (var13 == 2 || var13 == 3) {
                            method3179(1, class2.method2478(1) + var2.field37, var24);
                        } else if (var13 == 1) {
                            method3179(1, class2.method2478(0) + var2.field37, var24);
                        } else {
                            method3179(2, var2.field37, var24);
                        }
                    }
                }
                field500.field2030 = var14 + var15;
            }
            if ((var3 & 0x80) != 0) {
                var2.field417 = field500.method2555();
                var2.field418 = field500.method2531();
            }
            if ((var3 & 0x20) != 0) {
                var2.field406 = field500.method2506();
                if (var2.field406.charAt(0) == '~') {
                    var2.field406 = var2.field406.substring(1);
                    method3179(2, var2.field37, var2.field406);
                } else if (Statics.field905 == var2) {
                    method3179(2, var2.field37, var2.field406);
                }
                var2.field408 = 0;
                var2.field409 = 0;
                var2.field429 = 150;
            }
            if ((var3 & 0x100) != 0) {
                int var25 = field500.method2615();
                int var26 = field500.method2615();
                var2.method226(var25, var26, field465);
                var2.field413 = field465 + 300;
                var2.field393 = field500.method2624();
                var2.field415 = field500.method2521();
            }
        }
    }

    @ObfuscatedName("client.bn(I)V")
    public static final void method544() {
        while (true) {
            if (field500.method2358(field533) >= 27) {
                int var0 = field500.method2379(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field494[var0] == null) {
                        field494[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field494[var0];
                    field496[++field495 - 1] = var0;
                    var2.field439 = field465;
                    var2.field367 = class31.method2231(field500.method2379(14));
                    int var3 = field500.method2379(1);
                    if (var3 == 1) {
                        field630[++field579 - 1] = var0;
                    }
                    int var4 = field589[field500.method2379(3)];
                    if (var1) {
                        var2.field441 = var2.field428 = var4;
                    }
                    int var5 = field500.method2379(1);
                    int var6 = field500.method2379(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field500.method2379(5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    var2.field414 = var2.field367.field786;
                    var2.field443 = var2.field367.field787;
                    if (var2.field443 == 0) {
                        var2.field428 = 0;
                    }
                    var2.field401 = var2.field367.field788;
                    var2.field402 = var2.field367.field771;
                    var2.field445 = var2.field367.field770;
                    var2.field419 = var2.field367.field773;
                    var2.field398 = var2.field367.field764;
                    var2.field399 = var2.field367.field768;
                    var2.field400 = var2.field367.field769;
                    var2.method222(Statics.field905.field395[0] + var6, Statics.field905.field446[0] + var7, var5 == 1);
                    continue;
                }
            }
            field500.method2357();
            return;
        }
    }

    @ObfuscatedName("q.be(I)V")
    public static final void method213() {
        for (int var0 = 0; var0 < field579; var0++) {
            int var1 = field630[var0];
            class25 var2 = field494[var1];
            int var3 = field500.method2498();
            if ((var3 & 0x4) != 0) {
                var2.field367 = class31.method2231(field500.method2530());
                var2.field414 = var2.field367.field786;
                var2.field443 = var2.field367.field787;
                var2.field401 = var2.field367.field788;
                var2.field402 = var2.field367.field771;
                var2.field445 = var2.field367.field770;
                var2.field419 = var2.field367.field773;
                var2.field398 = var2.field367.field764;
                var2.field399 = var2.field367.field768;
                var2.field400 = var2.field367.field769;
            }
            if ((var3 & 0x1) != 0) {
                var2.field427 = field500.method2531();
                int var4 = field500.method2489();
                var2.field431 = var4 >> 16;
                var2.field430 = (var4 & 0xFFFF) + field465;
                var2.field422 = 0;
                var2.field421 = 0;
                if (var2.field430 > field465) {
                    var2.field422 = -1;
                }
                if (var2.field427 == 65535) {
                    var2.field427 = -1;
                }
            }
            if ((var3 & 0x20) != 0) {
                int var5 = field500.method2531();
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = field500.method2498();
                if (var2.field403 == var5 && var5 != -1) {
                    int var7 = class34.method93(var5).field864;
                    if (var7 == 1) {
                        var2.field423 = 0;
                        var2.field438 = 0;
                        var2.field410 = var6;
                        var2.field396 = 0;
                    }
                    if (var7 == 2) {
                        var2.field396 = 0;
                    }
                } else if (var5 == -1 || var2.field403 == -1 || class34.method93(var5).field876 >= class34.method93(var2.field403).field876) {
                    var2.field403 = var5;
                    var2.field423 = 0;
                    var2.field438 = 0;
                    var2.field410 = var6;
                    var2.field396 = 0;
                    var2.field449 = var2.field444;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var8 = field500.method2615();
                int var9 = field500.method2521();
                var2.method226(var8, var9, field465);
                var2.field413 = field465 + 300;
                var2.field393 = field500.method2615();
                var2.field415 = field500.method2615();
            }
            if ((var3 & 0x8) != 0) {
                var2.field406 = field500.method2506();
                var2.field429 = 100;
            }
            if ((var3 & 0x40) != 0) {
                int var10 = field500.method2521();
                int var11 = field500.method2615();
                var2.method226(var10, var11, field465);
                var2.field413 = field465 + 300;
                var2.field393 = field500.method2521();
                var2.field415 = field500.method2615();
            }
            if ((var3 & 0x10) != 0) {
                var2.field416 = field500.method2581();
                if (var2.field416 == 65535) {
                    var2.field416 = -1;
                }
            }
            if ((var3 & 0x2) != 0) {
                var2.field417 = field500.method2530();
                var2.field418 = field500.method2581();
            }
        }
    }

    @ObfuscatedName("ds.by(IIB)V")
    public static final void method2551(int arg0, int arg1) {
        if (field471 < 2 && field672 == 0 && !field612) {
            return;
        }
        String var2;
        if (field672 == 1 && field471 < 2) {
            var2 = class135.field2230 + class135.field2203 + field530 + " " + class2.field22;
        } else if (field612 && field471 < 2) {
            var2 = field614 + class135.field2203 + field715 + " " + class2.field22;
        } else {
            var2 = method1893(field471 - 1);
        }
        if (field471 > 2) {
            var2 = var2 + class2.method3035(16777215) + " " + '/' + " " + (field471 - 2) + class135.field2132;
        }
        Statics.field1039.method3499(var2, arg0 + 4, arg1 + 15, 16777215, 0, field465 / 1000);
    }

    @ObfuscatedName("db.bq(IIIIB)V")
    public static final void method2420(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field660; var4++) {
            if (field663[var4] + field454[var4] > arg0 && field663[var4] < arg0 + arg2 && field666[var4] + field664[var4] > arg1 && field664[var4] < arg1 + arg3) {
                field493[var4] = true;
            }
        }
    }

    @ObfuscatedName("j.bi(I)V")
    public static final void method206() {
        int var0 = Statics.field1039.method3553(class135.field2233);
        for (int var1 = 0; var1 < field471; var1++) {
            int var2 = Statics.field1039.method3553(method1893(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field471 * 15 + 21;
        int var4 = class77.field1387 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1385;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field455 = true;
        Statics.field327 = var4;
        Statics.field2585 = var5;
        Statics.field79 = var0;
        Statics.field2420 = field471 * 15 + 22;
    }

    @ObfuscatedName("w.bt(II)Z")
    public static final boolean method45(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field602[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("o.bk(II)V")
    public static final void method30(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field600[arg0];
        int var2 = field601[arg0];
        int var3 = field602[arg0];
        int var4 = field603[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 36) {
            field498.method2355(10);
            field498.method2487(var2);
            field498.method2550(var1);
            field498.method2485(var4);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 18) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(201);
            field498.method2528(var4);
            field498.method2528(Statics.field178 + var2);
            field498.method2485(Statics.field1848 + var1);
        }
        if (var3 == 48) {
            class3 var5 = field506[var4];
            if (var5 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(200);
                field498.method2485(var4);
            }
        }
        if (var3 == 15) {
            class3 var6 = field506[var4];
            if (var6 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(160);
                field498.method2526(var4);
                field498.method2487(Statics.field1035);
                field498.method2526(field610);
            }
        }
        if (var3 == 11) {
            class25 var7 = field494[var4];
            if (var7 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(89);
                field498.method2485(var4);
            }
        }
        if (var3 == 40) {
            field498.method2355(205);
            field498.method2550(var4);
            field498.method2526(var1);
            field498.method2487(var2);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 2) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(135);
            field498.method2550(field610);
            field498.method2534(Statics.field1035);
            field498.method2526(Statics.field1848 + var1);
            field498.method2485(var4 >> 14 & 0x7FFF);
            field498.method2526(Statics.field178 + var2);
        }
        if (var3 == 8) {
            class25 var8 = field494[var4];
            if (var8 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(126);
                field498.method2485(field610);
                field498.method2487(Statics.field1035);
                field498.method2526(var4);
            }
        }
        if (var3 == 33) {
            field498.method2355(227);
            field498.method2485(var1);
            field498.method2485(var4);
            field498.method2487(var2);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 32) {
            field498.method2355(11);
            field498.method2487(Statics.field1035);
            field498.method2487(var2);
            field498.method2550(var1);
            field498.method2526(var4);
            field498.method2485(field610);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            method810(var4, var2, var1, field599[arg0]);
        }
        if (var3 == 22) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(231);
            field498.method2526(Statics.field1848 + var1);
            field498.method2526(Statics.field178 + var2);
            field498.method2550(var4);
        }
        if (var3 == 44) {
            class3 var9 = field506[var4];
            if (var9 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(111);
                field498.method2485(var4);
            }
        }
        if (var3 == 37) {
            field498.method2355(203);
            field498.method2536(var2);
            field498.method2550(var1);
            field498.method2528(var4);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 3) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(98);
            field498.method2526(Statics.field178 + var2);
            field498.method2485(Statics.field1848 + var1);
            field498.method2485(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 17) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(119);
            field498.method2528(Statics.field1848 + var1);
            field498.method2550(var4);
            field498.method2550(field610);
            field498.method2536(Statics.field1035);
            field498.method2485(Statics.field178 + var2);
        }
        if (var3 == 16) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(22);
            field498.method2528(Statics.field1848 + var1);
            field498.method2528(Statics.field1114);
            field498.method2528(var4);
            field498.method2526(Statics.field178 + var2);
            field498.method2535(Statics.field89);
            field498.method2550(Statics.field366);
        }
        if (var3 == 49) {
            class3 var10 = field506[var4];
            if (var10 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(219);
                field498.method2526(var4);
            }
        }
        if (var3 == 39) {
            field498.method2355(179);
            field498.method2550(var1);
            field498.method2550(var4);
            field498.method2535(var2);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 6) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(152);
            field498.method2485(var4 >> 14 & 0x7FFF);
            field498.method2528(Statics.field1848 + var1);
            field498.method2550(Statics.field178 + var2);
        }
        if (var3 == 1004) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field498.method2355(25);
            field498.method2526(var4);
        }
        if (var3 == 4) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(214);
            field498.method2550(Statics.field1848 + var1);
            field498.method2485(Statics.field178 + var2);
            field498.method2485(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 35) {
            field498.method2355(74);
            field498.method2528(var1);
            field498.method2535(var2);
            field498.method2550(var4);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 30 && field620 == null) {
            method125(var2, var1);
            field620 = class159.method89(var2, var1);
            method1331(field620);
        }
        if (var3 == 20) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(125);
            field498.method2528(Statics.field1848 + var1);
            field498.method2526(Statics.field178 + var2);
            field498.method2526(var4);
        }
        if (var3 == 9) {
            class25 var11 = field494[var4];
            if (var11 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(210);
                field498.method2485(var4);
            }
        }
        if (var3 == 58) {
            field498.method2355(77);
            field498.method2485(var1);
            field498.method2485(field610);
            field498.method2534(var2);
            field498.method2534(Statics.field1035);
        }
        if (var3 == 47) {
            class3 var12 = field506[var4];
            if (var12 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(145);
                field498.method2550(var4);
            }
        }
        if (var3 == 14) {
            class3 var13 = field506[var4];
            if (var13 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(241);
                field498.method2528(Statics.field366);
                field498.method2528(Statics.field1114);
                field498.method2485(var4);
                field498.method2487(Statics.field89);
            }
        }
        if (var3 == 21) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(155);
            field498.method2485(var4);
            field498.method2550(Statics.field1848 + var1);
            field498.method2526(Statics.field178 + var2);
        }
        if (var3 == 38) {
            method2864();
            class159 var14 = class159.method1397(var2);
            field672 = 1;
            Statics.field1114 = var1;
            Statics.field89 = var2;
            Statics.field366 = var4;
            method1331(var14);
            field530 = class2.method3035(16748608) + class40.method31(var4).field988 + class2.method3035(16777215);
            if (field530 == null) {
                field530 = "null";
            }
            return;
        }
        if (var3 == 10) {
            class25 var15 = field494[var4];
            if (var15 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(107);
                field498.method2526(var4);
            }
        }
        if (var3 == 50) {
            class3 var16 = field506[var4];
            if (var16 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(79);
                field498.method2550(var4);
            }
        }
        if (var3 == 43) {
            field498.method2355(137);
            field498.method2535(var2);
            field498.method2528(var4);
            field498.method2485(var1);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 51) {
            class3 var17 = field506[var4];
            if (var17 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(165);
                field498.method2550(var4);
            }
        }
        if (var3 == 23) {
            Statics.field163.method1940(Statics.field2374, var1, var2);
        }
        if (var3 == 1005) {
            class159 var18 = class159.method1397(var2);
            if (var18 == null || var18.field2643[var1] < 100000) {
                field498.method2355(25);
                field498.method2526(var4);
            } else {
                method3179(0, "", var18.field2643[var1] + " x " + class40.method31(var4).field988);
            }
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 28) {
            field498.method2355(75);
            field498.method2487(var2);
            class159 var19 = class159.method1397(var2);
            if (var19.field2698 != null && var19.field2698[0][0] == 5) {
                int var20 = var19.field2698[0][1];
                class160.field2725[var20] = 1 - class160.field2725[var20];
                method3292(var20);
            }
        }
        if (var3 == 42) {
            field498.method2355(221);
            field498.method2528(var1);
            field498.method2526(var4);
            field498.method2535(var2);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 19) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(86);
            field498.method2485(Statics.field1848 + var1);
            field498.method2526(Statics.field178 + var2);
            field498.method2550(var4);
        }
        if (var3 == 1003) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            class25 var21 = field494[var4];
            if (var21 != null) {
                class31 var22 = var21.field367;
                if (var22.field779 != null) {
                    var22 = var22.method626();
                }
                if (var22 != null) {
                    field498.method2355(230);
                    field498.method2526(var22.field772);
                }
            }
        }
        if (var3 == 1001) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(255);
            field498.method2550(var4 >> 14 & 0x7FFF);
            field498.method2528(Statics.field1848 + var1);
            field498.method2528(Statics.field178 + var2);
        }
        if (var3 == 12) {
            class25 var23 = field494[var4];
            if (var23 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(206);
                field498.method2485(var4);
            }
        }
        if (var3 == 29) {
            field498.method2355(75);
            field498.method2487(var2);
            class159 var24 = class159.method1397(var2);
            if (var24.field2698 != null && var24.field2698[0][0] == 5) {
                int var25 = var24.field2698[0][1];
                if (class160.field2725[var25] != var24.field2700[0]) {
                    class160.field2725[var25] = var24.field2700[0];
                    method3292(var25);
                }
            }
        }
        if (var3 == 13) {
            class25 var26 = field494[var4];
            if (var26 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(67);
                field498.method2550(var4);
            }
        }
        if (var3 == 34) {
            field498.method2355(7);
            field498.method2534(var2);
            field498.method2485(var4);
            field498.method2528(var1);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 25) {
            class159 var27 = class159.method89(var2, var1);
            if (var27 != null) {
                method2864();
                int var28 = method2769(var27);
                int var29 = var28 >> 11 & 0x3F;
                class159 var31 = class159.method89(var2, var1);
                if (var31 != null && var31.field2680 != null) {
                    class1 var32 = new class1();
                    var32.field2 = var31;
                    var32.field6 = var31.field2680;
                    class26.method47(var32);
                }
                field612 = true;
                Statics.field1035 = var2;
                field610 = var1;
                Statics.field177 = var29;
                method1331(var31);
                field672 = 0;
                field614 = method132(var27);
                if (field614 == null) {
                    field614 = "Null";
                }
                if (var27.field2601) {
                    field715 = var27.field2662 + class2.method3035(16777215);
                } else {
                    field715 = class2.method3035(65280) + var27.field2694 + class2.method3035(16777215);
                }
            }
            return;
        }
        if (var3 == 7) {
            class25 var33 = field494[var4];
            if (var33 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(248);
                field498.method2550(Statics.field366);
                field498.method2526(var4);
                field498.method2485(Statics.field1114);
                field498.method2534(Statics.field89);
            }
        }
        if (var3 == 5) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(90);
            field498.method2526(Statics.field1848 + var1);
            field498.method2485(Statics.field178 + var2);
            field498.method2528(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 46) {
            class3 var34 = field506[var4];
            if (var34 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(129);
                field498.method2526(var4);
            }
        }
        if (var3 == 24) {
            class159 var35 = class159.method1397(var2);
            boolean var36 = true;
            if (var35.field2627 > 0) {
                var36 = method806(var35);
            }
            if (var36) {
                field498.method2355(75);
                field498.method2487(var2);
            }
        }
        if (var3 == 31) {
            field498.method2355(154);
            field498.method2485(var1);
            field498.method2534(var2);
            field498.method2528(var4);
            field498.method2550(Statics.field366);
            field498.method2535(Statics.field89);
            field498.method2550(Statics.field1114);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 26) {
            Statics.method102();
        }
        if (var3 == 1002) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field498.method2355(175);
            field498.method2526(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 1) {
            field562 = class77.field1387;
            field563 = class77.field1385;
            field565 = 2;
            field564 = 0;
            field634 = var1;
            field587 = var2;
            field498.method2355(184);
            field498.method2528(Statics.field1848 + var1);
            field498.method2526(Statics.field1114);
            field498.method2528(Statics.field366);
            field498.method2485(var4 >> 14 & 0x7FFF);
            field498.method2536(Statics.field89);
            field498.method2526(Statics.field178 + var2);
        }
        if (var3 == 41) {
            field498.method2355(253);
            field498.method2534(var2);
            field498.method2528(var1);
            field498.method2485(var4);
            field518 = 0;
            Statics.field1513 = class159.method1397(var2);
            field692 = var1;
        }
        if (var3 == 45) {
            class3 var37 = field506[var4];
            if (var37 != null) {
                field562 = class77.field1387;
                field563 = class77.field1385;
                field565 = 2;
                field564 = 0;
                field634 = var1;
                field587 = var2;
                field498.method2355(37);
                field498.method2550(var4);
            }
        }
        if (field672 != 0) {
            field672 = 0;
            method1331(class159.method1397(Statics.field89));
        }
        if (field612) {
            method2864();
        }
        if (Statics.field1513 != null && field518 == 0) {
            method1331(Statics.field1513);
        }
    }

    @ObfuscatedName("em.bp(ILjava/lang/String;I)V")
    public static void method2924(int arg0, String arg1) {
        boolean var2 = false;
        for (int var3 = 0; var3 < field570; var3++) {
            class3 var4 = field506[field642[var3]];
            if (var4 != null && var4.field37 != null && var4.field37.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field498.method2355(111);
                    field498.method2485(field642[var3]);
                } else if (arg0 == 4) {
                    field498.method2355(145);
                    field498.method2550(field642[var3]);
                } else if (arg0 == 6) {
                    field498.method2355(219);
                    field498.method2526(field642[var3]);
                } else if (arg0 == 7) {
                    field498.method2355(79);
                    field498.method2550(field642[var3]);
                }
                var2 = true;
                break;
            }
        }
        if (!var2) {
            method3179(0, "", class135.field2153 + arg1);
        }
    }

    @ObfuscatedName("em.bv(I)V")
    public static void method2864() {
        if (!field612) {
            return;
        }
        class159 var0 = class159.method89(Statics.field1035, field610);
        if (var0 != null && var0.field2681 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field6 = var0.field2681;
            class26.method47(var1);
        }
        field612 = false;
        method1331(var0);
    }

    @ObfuscatedName("r.ba(IIB)V")
    public static void method125(int arg0, int arg1) {
        field498.method2355(96);
        field498.method2485(arg1);
        field498.method2534(arg0);
    }

    @ObfuscatedName("ay.bc(IIILjava/lang/String;B)V")
    public static void method810(int arg0, int arg1, int arg2, String arg3) {
        class159 var4 = class159.method89(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2689 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field1 = arg0;
            var5.field9 = arg3;
            var5.field6 = var4.field2689;
            class26.method47(var5);
        }
        boolean var6 = true;
        if (var4.field2627 > 0) {
            var6 = method806(var4);
        }
        if (!var6 || !class163.method39(method2769(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field498.method2355(225);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 2) {
            field498.method2355(133);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 3) {
            field498.method2355(13);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 4) {
            field498.method2355(197);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 5) {
            field498.method2355(83);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 6) {
            field498.method2355(71);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 7) {
            field498.method2355(144);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 8) {
            field498.method2355(208);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 9) {
            field498.method2355(249);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
        if (arg0 == 10) {
            field498.method2355(228);
            field498.method2487(arg1);
            field498.method2485(arg2);
        }
    }

    @ObfuscatedName("bk.bm(I)V")
    public static final void method1451() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field471 - 1; var1++) {
                if (field602[var1] < 1000 && field602[var1 + 1] > 1000) {
                    String var2 = field599[var1];
                    field599[var1] = field599[var1 + 1];
                    field599[var1 + 1] = var2;
                    String var3 = field604[var1];
                    field604[var1] = field604[var1 + 1];
                    field604[var1 + 1] = var3;
                    int var4 = field602[var1];
                    field602[var1] = field602[var1 + 1];
                    field602[var1 + 1] = var4;
                    int var5 = field600[var1];
                    field600[var1] = field600[var1 + 1];
                    field600[var1 + 1] = var5;
                    int var6 = field601[var1];
                    field601[var1] = field601[var1 + 1];
                    field601[var1 + 1] = var6;
                    int var7 = field603[var1];
                    field603[var1] = field603[var1 + 1];
                    field603[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ce.bs(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method1659(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field455 || field471 >= 500) {
            return;
        }
        field604[field471] = arg0;
        field599[field471] = arg1;
        field602[field471] = arg2;
        field603[field471] = arg3;
        field600[field471] = arg4;
        field601[field471] = arg5;
        field471++;
    }

    @ObfuscatedName("r.bz(I)V")
    public static void method124() {
        for (int var0 = 0; var0 < field471; var0++) {
            if (method29(field602[var0])) {
                if (var0 < field471 - 1) {
                    for (int var1 = var0; var1 < field471 - 1; var1++) {
                        field604[var1] = field604[var1 + 1];
                        field599[var1] = field599[var1 + 1];
                        field602[var1] = field602[var1 + 1];
                        field603[var1] = field603[var1 + 1];
                        field600[var1] = field600[var1 + 1];
                        field601[var1] = field601[var1 + 1];
                    }
                }
                field471--;
            }
        }
    }

    @ObfuscatedName("o.bh(IB)Z")
    public static boolean method29(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("cx.co(II)Ljava/lang/String;")
    public static String method1893(int arg0) {
        return field599[arg0].length() > 0 ? field604[arg0] + class135.field2203 + field599[arg0] : field604[arg0];
    }

    @ObfuscatedName("ao.cb(Ld;IIIB)V")
    public static final void method1237(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field905 == arg0 || field471 >= 400) {
            return;
        }
        String var9;
        if (arg0.field38 == 0) {
            String var4 = arg0.field37;
            int var5 = arg0.field36;
            int var6 = Statics.field905.field36;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method3035(16711680);
            } else if (var7 < -6) {
                var8 = class2.method3035(16723968);
            } else if (var7 < -3) {
                var8 = class2.method3035(16740352);
            } else if (var7 < 0) {
                var8 = class2.method3035(16756736);
            } else if (var7 > 9) {
                var8 = class2.method3035(65280);
            } else if (var7 > 6) {
                var8 = class2.method3035(4259584);
            } else if (var7 > 3) {
                var8 = class2.method3035(8453888);
            } else if (var7 > 0) {
                var8 = class2.method3035(12648192);
            } else {
                var8 = class2.method3035(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class135.field2236 + arg0.field36 + class2.field21;
        } else {
            var9 = arg0.field37 + " " + class2.field20 + class135.field2297 + arg0.field38 + class2.field21;
        }
        if (field672 == 1) {
            method1659(class135.field2230, field530 + " " + class2.field22 + " " + class2.method3035(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field612) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field622[var10] != null) {
                    short var11 = 0;
                    if (field622[var10].equalsIgnoreCase(class135.field2218)) {
                        if (arg0.field36 > Statics.field905.field36) {
                            var11 = 2000;
                        }
                        if (Statics.field905.field43 != 0 && arg0.field43 != 0) {
                            if (Statics.field905.field43 == arg0.field43) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field588[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field586[var10] + var11;
                    method1659(field622[var10], class2.method3035(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field177 & 0x8) == 8) {
            method1659(field614, field715 + " " + class2.field22 + " " + class2.method3035(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field471; var14++) {
            if (field602[var14] == 23) {
                field599[var14] = class2.method3035(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("bi.cj(IIIIIIIII)V")
    public static final void method1423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class159.method129(arg0)) {
            Statics.field947 = null;
            method1330(Statics.field1921[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field947 != null) {
                method1330(Statics.field947, -1412584499, arg1, arg2, arg3, arg4, Statics.field2357, Statics.field1818, arg7);
                Statics.field947 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field493[var8] = true;
            }
        } else {
            field493[arg7] = true;
        }
    }

    @ObfuscatedName("bd.ce([Lfi;IIIIIIIII)V")
    public static final void method1330(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1825(arg2, arg3, arg4, arg5);
        class104.method2173();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class159 var10 = arg0[var9];
            if (var10 != null && (var10.field2613 == arg1 || arg1 == -1412584499 && field627 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field663[field660] = var10.field2607 + arg6;
                    field664[field660] = var10.field2640 + arg7;
                    field454[field660] = var10.field2611;
                    field666[field660] = var10.field2672;
                    var11 = ++field660 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2717 = var11;
                var10.field2684 = field465;
                if (!var10.field2601 || !method1424(var10)) {
                    if (var10.field2627 > 0) {
                        int var12 = var10.field2627;
                        if (var12 == 324) {
                            if (field716 == -1) {
                                field716 = var10.field2626;
                                field717 = var10.field2622;
                            }
                            if (field510.field2752) {
                                var10.field2626 = field716;
                            } else {
                                var10.field2626 = field717;
                            }
                        } else if (var12 == 325) {
                            if (field716 == -1) {
                                field716 = var10.field2626;
                                field717 = var10.field2622;
                            }
                            if (field510.field2752) {
                                var10.field2626 = field717;
                            } else {
                                var10.field2626 = field716;
                            }
                        } else if (var12 == 327) {
                            var10.field2642 = 150;
                            var10.field2663 = (int) (Math.sin((double) field465 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2634 = 5;
                            var10.field2664 = 0;
                        } else if (var12 == 328) {
                            var10.field2642 = 150;
                            var10.field2663 = (int) (Math.sin((double) field465 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2634 = 5;
                            var10.field2664 = 1;
                        }
                    }
                    int var13 = var10.field2607 + arg6;
                    int var14 = var10.field2640 + arg7;
                    int var15 = var10.field2646;
                    if (field627 == var10) {
                        if (arg1 != -1412584499 && !var10.field2667) {
                            Statics.field947 = arg0;
                            Statics.field2357 = arg6;
                            Statics.field1818 = arg7;
                            continue;
                        }
                        if (field638 && field632) {
                            int var16 = class77.field1377;
                            int var17 = class77.field1381;
                            int var18 = var16 - field629;
                            int var19 = var17 - field591;
                            if (var18 < field545) {
                                var18 = field545;
                            }
                            if (var10.field2611 + var18 > field545 + field628.field2611) {
                                var18 = field545 + field628.field2611 - var10.field2611;
                            }
                            if (var19 < field696) {
                                var19 = field696;
                            }
                            if (var10.field2672 + var19 > field696 + field628.field2672) {
                                var19 = field696 + field628.field2672 - var10.field2672;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2667) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2705 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2705 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2611 + var13;
                        int var27 = var10.field2672 + var14;
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
                        int var30 = var10.field2611 + var13;
                        int var31 = var10.field2672 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2601 || var20 < var22 && var21 < var23) {
                        if (var10.field2627 != 0) {
                            if (var10.field2627 == 1337) {
                                field606 = var13;
                                field685 = var14;
                                method126(var13, var14, var10.field2611, var10.field2672);
                                class89.method1825(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2627 == 1338) {
                                method1422();
                                class89.method1825(var13, var14, Statics.field244.field1474 + var13, Statics.field244.field1475 + var14);
                                if (field691 == 2 || field691 == 5) {
                                    class89.method1841(var13 + 25, var14 + 5, 0, Statics.field2470, Statics.field756);
                                } else {
                                    int var32 = field540 + field527 & 0x7FF;
                                    int var33 = Statics.field905.field404 / 32 + 48;
                                    int var34 = 464 - Statics.field905.field394 / 32;
                                    Statics.field1817.method1741(var13 + 25, var14 + 5, 146, 151, var33, var34, var32, field501 + 256, Statics.field2470, Statics.field756);
                                    for (int var35 = 0; var35 < field611; var35++) {
                                        int var36 = field686[var35] * 4 + 2 - Statics.field905.field404 / 32;
                                        int var37 = field687[var35] * 4 + 2 - Statics.field905.field394 / 32;
                                        method1411(var13, var14, var36, var37, field714[var35]);
                                    }
                                    for (int var38 = 0; var38 < 104; var38++) {
                                        for (int var39 = 0; var39 < 104; var39++) {
                                            class177 var40 = field653[Statics.field2374][var38][var39];
                                            if (var40 != null) {
                                                int var41 = var38 * 4 + 2 - Statics.field905.field404 / 32;
                                                int var42 = var39 * 4 + 2 - Statics.field905.field394 / 32;
                                                method1411(var13, var14, var41, var42, Statics.field368[0]);
                                            }
                                        }
                                    }
                                    for (int var43 = 0; var43 < field495; var43++) {
                                        class25 var44 = field494[field496[var43]];
                                        if (var44 != null && var44.method14()) {
                                            class31 var45 = var44.field367;
                                            if (var45 != null && var45.field779 != null) {
                                                var45 = var45.method626();
                                            }
                                            if (var45 != null && var45.field767 && var45.field759) {
                                                int var46 = var44.field404 / 32 - Statics.field905.field404 / 32;
                                                int var47 = var44.field394 / 32 - Statics.field905.field394 / 32;
                                                method1411(var13, var14, var46, var47, Statics.field368[1]);
                                            }
                                        }
                                    }
                                    for (int var48 = 0; var48 < field570; var48++) {
                                        class3 var49 = field506[field642[var48]];
                                        if (var49 != null && var49.method14()) {
                                            int var50 = var49.field404 / 32 - Statics.field905.field404 / 32;
                                            int var51 = var49.field394 / 32 - Statics.field905.field394 / 32;
                                            boolean var52 = false;
                                            if (method2244(var49.field37)) {
                                                var52 = true;
                                            }
                                            boolean var53 = false;
                                            for (int var54 = 0; var54 < Statics.field1928; var54++) {
                                                if (var49.field37.equals(Statics.field67[var54].field116)) {
                                                    var53 = true;
                                                    break;
                                                }
                                            }
                                            boolean var55 = false;
                                            if (Statics.field905.field43 != 0 && var49.field43 != 0 && Statics.field905.field43 == var49.field43) {
                                                var55 = true;
                                            }
                                            if (var52) {
                                                method1411(var13, var14, var50, var51, Statics.field368[3]);
                                            } else if (var55) {
                                                method1411(var13, var14, var50, var51, Statics.field368[4]);
                                            } else if (var53) {
                                                method1411(var13, var14, var50, var51, Statics.field368[5]);
                                            } else {
                                                method1411(var13, var14, var50, var51, Statics.field368[2]);
                                            }
                                        }
                                    }
                                    if (field473 != 0 && field465 % 20 < 10) {
                                        if (field473 == 1 && field474 >= 0 && field474 < field494.length) {
                                            class25 var56 = field494[field474];
                                            if (var56 != null) {
                                                int var57 = var56.field404 / 32 - Statics.field905.field404 / 32;
                                                int var58 = var56.field394 / 32 - Statics.field905.field394 / 32;
                                                method2762(var13, var14, var57, var58, Statics.field172[1]);
                                            }
                                        }
                                        if (field473 == 2) {
                                            int var59 = field476 * 4 - Statics.field1848 * 4 + 2 - Statics.field905.field404 / 32;
                                            int var60 = field477 * 4 - Statics.field178 * 4 + 2 - Statics.field905.field394 / 32;
                                            method2762(var13, var14, var59, var60, Statics.field172[1]);
                                        }
                                        if (field473 == 10 && field529 >= 0 && field529 < field506.length) {
                                            class3 var61 = field506[field529];
                                            if (var61 != null) {
                                                int var62 = var61.field404 / 32 - Statics.field905.field404 / 32;
                                                int var63 = var61.field394 / 32 - Statics.field905.field394 / 32;
                                                method2762(var13, var14, var62, var63, Statics.field172[1]);
                                            }
                                        }
                                    }
                                    if (field634 != 0) {
                                        int var64 = field634 * 4 + 2 - Statics.field905.field404 / 32;
                                        int var65 = field587 * 4 + 2 - Statics.field905.field394 / 32;
                                        method1411(var13, var14, var64, var65, Statics.field172[0]);
                                    }
                                    class89.method1831(var13 + 93 + 4, var14 + 82 - 4, 3, 3, 16777215);
                                }
                                if (field691 < 3) {
                                    Statics.field2086.method1741(var13, var14, 33, 33, 25, 25, field540, 256, Statics.field1751, Statics.field387);
                                } else {
                                    class89.method1841(var13, var14, 0, Statics.field1751, Statics.field387);
                                }
                                if (field662[var11]) {
                                    Statics.field244.method1819(var13, var14);
                                }
                                field661[var11] = true;
                                class89.method1825(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var66 = class77.field1377;
                        int var67 = class77.field1381;
                        if (!field455 && var66 >= var20 && var67 >= var21 && var66 < var22 && var67 < var23) {
                            int var68 = var66 - var13;
                            int var69 = var67 - var14;
                            if (var10.field2605 == 1) {
                                method1659(var10.field2691, "", 24, 0, 0, var10.field2673);
                            }
                            if (var10.field2605 == 2 && !field612) {
                                String var70 = method132(var10);
                                if (var70 != null) {
                                    method1659(var70, class2.method3035(65280) + var10.field2694, 25, 0, -1, var10.field2673);
                                }
                            }
                            if (var10.field2605 == 3) {
                                method1659(class135.field2239, "", 26, 0, 0, var10.field2673);
                            }
                            if (var10.field2605 == 4) {
                                method1659(var10.field2691, "", 28, 0, 0, var10.field2673);
                            }
                            if (var10.field2605 == 5) {
                                method1659(var10.field2691, "", 29, 0, 0, var10.field2673);
                            }
                            if (var10.field2605 == 6 && field620 == null) {
                                method1659(var10.field2691, "", 30, 0, -1, var10.field2673);
                            }
                            if (var10.field2705 == 2) {
                                int var71 = 0;
                                for (int var72 = 0; var72 < var10.field2672; var72++) {
                                    for (int var73 = 0; var73 < var10.field2611; var73++) {
                                        int var74 = (var10.field2655 + 32) * var73;
                                        int var75 = (var10.field2656 + 32) * var72;
                                        if (var71 < 20) {
                                            var74 += var10.field2657[var71];
                                            var75 += var10.field2658[var71];
                                        }
                                        if (var68 >= var74 && var69 >= var75 && var68 < var74 + 32 && var69 < var75 + 32) {
                                            field572 = var71;
                                            Statics.field558 = var10;
                                            if (var10.field2704[var71] > 0) {
                                                label1210: {
                                                    class40 var76 = class40.method31(var10.field2704[var71] - 1);
                                                    if (field672 == 1) {
                                                        int var77 = method2769(var10);
                                                        boolean var78 = (var77 >> 30 & 0x1) != 0;
                                                        if (var78) {
                                                            if (Statics.field89 != var10.field2673 || Statics.field1114 != var71) {
                                                                method1659(class135.field2230, field530 + " " + class2.field22 + " " + class2.method3035(16748608) + var76.field988, 31, var76.field974, var71, var10.field2673);
                                                            }
                                                            break label1210;
                                                        }
                                                    }
                                                    if (field612) {
                                                        int var79 = method2769(var10);
                                                        boolean var80 = (var79 >> 30 & 0x1) != 0;
                                                        if (var80) {
                                                            if ((Statics.field177 & 0x10) == 16) {
                                                                method1659(field614, field715 + " " + class2.field22 + " " + class2.method3035(16748608) + var76.field988, 32, var76.field974, var71, var10.field2673);
                                                            }
                                                            break label1210;
                                                        }
                                                    }
                                                    String[] var81 = var76.field991;
                                                    if (field457) {
                                                        var81 = method356(var81);
                                                    }
                                                    int var82 = method2769(var10);
                                                    boolean var83 = (var82 >> 30 & 0x1) != 0;
                                                    if (var83) {
                                                        for (int var84 = 4; var84 >= 3; var84--) {
                                                            if (var81 != null && var81[var84] != null) {
                                                                byte var85;
                                                                if (var84 == 3) {
                                                                    var85 = 36;
                                                                } else {
                                                                    var85 = 37;
                                                                }
                                                                method1659(var81[var84], class2.method3035(16748608) + var76.field988, var85, var76.field974, var71, var10.field2673);
                                                            } else if (var84 == 4) {
                                                                method1659(class135.field2091, class2.method3035(16748608) + var76.field988, 37, var76.field974, var71, var10.field2673);
                                                            }
                                                        }
                                                    }
                                                    class163 var10000 = (class163) null;
                                                    if (class163.method3285(method2769(var10))) {
                                                        method1659(class135.field2230, class2.method3035(16748608) + var76.field988, 38, var76.field974, var71, var10.field2673);
                                                    }
                                                    int var86 = method2769(var10);
                                                    boolean var87 = (var86 >> 30 & 0x1) != 0;
                                                    if (var87 && var81 != null) {
                                                        for (int var88 = 2; var88 >= 0; var88--) {
                                                            if (var81[var88] != null) {
                                                                byte var89 = 0;
                                                                if (var88 == 0) {
                                                                    var89 = 33;
                                                                }
                                                                if (var88 == 1) {
                                                                    var89 = 34;
                                                                }
                                                                if (var88 == 2) {
                                                                    var89 = 35;
                                                                }
                                                                method1659(var81[var88], class2.method3035(16748608) + var76.field988, var89, var76.field974, var71, var10.field2673);
                                                            }
                                                        }
                                                    }
                                                    String[] var90 = var10.field2660;
                                                    if (field457) {
                                                        var90 = method356(var90);
                                                    }
                                                    if (var90 != null) {
                                                        for (int var91 = 4; var91 >= 0; var91--) {
                                                            if (var90[var91] != null) {
                                                                byte var92 = 0;
                                                                if (var91 == 0) {
                                                                    var92 = 39;
                                                                }
                                                                if (var91 == 1) {
                                                                    var92 = 40;
                                                                }
                                                                if (var91 == 2) {
                                                                    var92 = 41;
                                                                }
                                                                if (var91 == 3) {
                                                                    var92 = 42;
                                                                }
                                                                if (var91 == 4) {
                                                                    var92 = 43;
                                                                }
                                                                method1659(var90[var91], class2.method3035(16748608) + var76.field988, var92, var76.field974, var71, var10.field2673);
                                                            }
                                                        }
                                                    }
                                                    method1659(class135.field2192, class2.method3035(16748608) + var76.field988, 1005, var76.field974, var71, var10.field2673);
                                                }
                                            }
                                        }
                                        var71++;
                                    }
                                }
                            }
                            if (var10.field2601) {
                                if (!field612) {
                                    for (int var93 = 9; var93 >= 5; var93--) {
                                        String var94 = method2770(var10, var93);
                                        if (var94 != null) {
                                            method1659(var94, var10.field2662, 1007, var93 + 1, var10.field2603, var10.field2673);
                                        }
                                    }
                                    String var95 = method132(var10);
                                    if (var95 != null) {
                                        method1659(var95, var10.field2662, 25, 0, var10.field2603, var10.field2673);
                                    }
                                    for (int var96 = 4; var96 >= 0; var96--) {
                                        String var97 = method2770(var10, var96);
                                        if (var97 != null) {
                                            method1659(var97, var10.field2662, 57, var96 + 1, var10.field2603, var10.field2673);
                                        }
                                    }
                                    if (class163.method2381(method2769(var10))) {
                                        method1659(class135.field2308, "", 30, 0, var10.field2603, var10.field2673);
                                    }
                                } else if (class163.method3208(method2769(var10)) && (Statics.field177 & 0x20) == 32) {
                                    method1659(field614, field715 + " " + class2.field22 + " " + var10.field2662, 58, 0, var10.field2603, var10.field2673);
                                }
                            }
                        }
                        if (var10.field2705 == 0) {
                            if (!var10.field2601 && method1424(var10) && Statics.field1112 != var10) {
                                continue;
                            }
                            if (!var10.field2601) {
                                if (var10.field2616 > var10.field2618 - var10.field2672) {
                                    var10.field2616 = var10.field2618 - var10.field2672;
                                }
                                if (var10.field2616 < 0) {
                                    var10.field2616 = 0;
                                }
                            }
                            method1330(arg0, var10.field2673, var20, var21, var22, var23, var13 - var10.field2612, var14 - var10.field2616, var11);
                            if (var10.field2595 != null) {
                                method1330(var10.field2595, var10.field2673, var20, var21, var22, var23, var13 - var10.field2612, var14 - var10.field2616, var11);
                            }
                            class4 var98 = (class4) field617.method3405((long) var10.field2673);
                            if (var98 != null) {
                                if (var98.field53 == 0 && class77.field1377 >= var20 && class77.field1381 >= var21 && class77.field1377 < var22 && class77.field1381 < var23 && !field455 && !field625) {
                                    field604[0] = class135.field2313;
                                    field599[0] = "";
                                    field602[0] = 1006;
                                    field471 = 1;
                                }
                                method1423(var98.field56, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class89.method1825(arg2, arg3, arg4, arg5);
                            class104.method2173();
                        }
                        if (field662[var11] || field667 > 1) {
                            if (var10.field2705 == 0 && !var10.field2601 && var10.field2618 > var10.field2672) {
                                method2164(var10.field2611 + var13, var14, var10.field2616, var10.field2672, var10.field2618);
                            }
                            if (var10.field2705 != 1) {
                                if (var10.field2705 == 2) {
                                    int var99 = 0;
                                    for (int var100 = 0; var100 < var10.field2672; var100++) {
                                        for (int var101 = 0; var101 < var10.field2611; var101++) {
                                            int var102 = (var10.field2655 + 32) * var101 + var13;
                                            int var103 = (var10.field2656 + 32) * var100 + var14;
                                            if (var99 < 20) {
                                                var102 += var10.field2657[var99];
                                                var103 += var10.field2658[var99];
                                            }
                                            if (var10.field2704[var99] > 0) {
                                                boolean var104 = false;
                                                boolean var105 = false;
                                                int var106 = var10.field2704[var99] - 1;
                                                if (var102 + 32 > arg2 && var102 < arg4 && var103 + 32 > arg3 && var103 < arg5 || Statics.field2628 == var10 && field569 == var99) {
                                                    class86 var107;
                                                    if (field672 == 1 && Statics.field1114 == var99 && Statics.field89 == var10.field2673) {
                                                        var107 = class40.method101(var106, var10.field2643[var99], 2, 0, false);
                                                    } else {
                                                        var107 = class40.method101(var106, var10.field2643[var99], 1, 3153952, false);
                                                    }
                                                    if (var107 == null) {
                                                        method1331(var10);
                                                    } else if (Statics.field2628 == var10 && field569 == var99) {
                                                        int var108 = class77.field1377 - field618;
                                                        int var109 = class77.field1381 - field571;
                                                        if (var108 < 5 && var108 > -5) {
                                                            var108 = 0;
                                                        }
                                                        if (var109 < 5 && var109 > -5) {
                                                            var109 = 0;
                                                        }
                                                        if (field574 < 5) {
                                                            var108 = 0;
                                                            var109 = 0;
                                                        }
                                                        var107.method1809(var102 + var108, var103 + var109, 128);
                                                        if (arg1 != -1) {
                                                            class159 var110 = arg0[arg1 & 0xFFFF];
                                                            if (var103 + var109 < class89.field1483 && var110.field2616 > 0) {
                                                                int var111 = field532 * (class89.field1483 - var103 - var109) / 3;
                                                                if (var111 > field532 * 10) {
                                                                    var111 = field532 * 10;
                                                                }
                                                                if (var111 > var110.field2616) {
                                                                    var111 = var110.field2616;
                                                                }
                                                                var110.field2616 -= var111;
                                                                field571 += var111;
                                                                method1331(var110);
                                                            }
                                                            if (var103 + var109 + 32 > class89.field1484 && var110.field2616 < var110.field2618 - var110.field2672) {
                                                                int var112 = field532 * (var103 + var109 + 32 - class89.field1484) / 3;
                                                                if (var112 > field532 * 10) {
                                                                    var112 = field532 * 10;
                                                                }
                                                                if (var112 > var110.field2618 - var110.field2672 - var110.field2616) {
                                                                    var112 = var110.field2618 - var110.field2672 - var110.field2616;
                                                                }
                                                                var110.field2616 += var112;
                                                                field571 -= var112;
                                                                method1331(var110);
                                                            }
                                                        }
                                                    } else if (Statics.field1513 == var10 && field692 == var99) {
                                                        var107.method1809(var102, var103, 128);
                                                    } else {
                                                        var107.method1763(var102, var103);
                                                    }
                                                }
                                            } else if (var10.field2604 != null && var99 < 20) {
                                                class86 var113 = var10.method3239(var99);
                                                if (var113 != null) {
                                                    var113.method1763(var102, var103);
                                                } else if (class159.field2600) {
                                                    method1331(var10);
                                                }
                                            }
                                            var99++;
                                        }
                                    }
                                } else if (var10.field2705 == 3) {
                                    int var114;
                                    if (method141(var10)) {
                                        var114 = var10.field2620;
                                        if (Statics.field1112 == var10 && var10.field2599 != 0) {
                                            var114 = var10.field2599;
                                        }
                                    } else {
                                        var114 = var10.field2619;
                                        if (Statics.field1112 == var10 && var10.field2690 != 0) {
                                            var114 = var10.field2690;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2623) {
                                            class89.method1831(var13, var14, var10.field2611, var10.field2672, var114);
                                        } else {
                                            class89.method1833(var13, var14, var10.field2611, var10.field2672, var114);
                                        }
                                    } else if (var10.field2623) {
                                        class89.method1869(var13, var14, var10.field2611, var10.field2672, var114, 256 - (var15 & 0xFF));
                                    } else {
                                        class89.method1822(var13, var14, var10.field2611, var10.field2672, var114, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2705 == 4) {
                                    class183 var115 = var10.method3238();
                                    if (var115 != null) {
                                        String var116 = var10.field2649;
                                        int var117;
                                        if (method141(var10)) {
                                            var117 = var10.field2620;
                                            if (Statics.field1112 == var10 && var10.field2599 != 0) {
                                                var117 = var10.field2599;
                                            }
                                            if (var10.field2650.length() > 0) {
                                                var116 = var10.field2650;
                                            }
                                        } else {
                                            var117 = var10.field2619;
                                            if (Statics.field1112 == var10 && var10.field2690 != 0) {
                                                var117 = var10.field2690;
                                            }
                                        }
                                        if (var10.field2601 && var10.field2695 != -1) {
                                            class40 var118 = class40.method31(var10.field2695);
                                            var116 = var118.field988;
                                            if (var116 == null) {
                                                var116 = "null";
                                            }
                                            if ((var118.field987 == 1 || var10.field2707 != 1) && var10.field2707 != -1) {
                                                var116 = class2.method3035(16748608) + var116 + class2.field24 + " " + 'x' + method35(var10.field2707);
                                            }
                                        }
                                        if (field620 == var10) {
                                            class135 var177 = (class135) null;
                                            var116 = class135.field2234;
                                            var117 = var10.field2619;
                                        }
                                        if (!var10.field2601) {
                                            var116 = method1901(var116, var10);
                                        }
                                        var115.method3506(var116, var13, var14, var10.field2611, var10.field2672, var117, var10.field2654 ? 0 : -1, var10.field2652, var10.field2661, var10.field2651);
                                    } else if (class159.field2600) {
                                        method1331(var10);
                                    }
                                } else if (var10.field2705 == 5) {
                                    if (var10.field2601) {
                                        class86 var120;
                                        if (var10.field2695 == -1) {
                                            var120 = var10.method3263(false);
                                        } else {
                                            var120 = class40.method101(var10.field2695, var10.field2707, var10.field2630, var10.field2631, false);
                                        }
                                        if (var120 != null) {
                                            int var121 = var120.field1464;
                                            int var122 = var120.field1465;
                                            if (var10.field2688) {
                                                class89.method1878(var13, var14, var10.field2611 + var13, var10.field2672 + var14);
                                                int var123 = (var10.field2611 + (var121 - 1)) / var121;
                                                int var124 = (var10.field2672 + (var122 - 1)) / var122;
                                                for (int var125 = 0; var125 < var123; var125++) {
                                                    for (int var126 = 0; var126 < var124; var126++) {
                                                        if (var10.field2624 != 0) {
                                                            var120.method1788(var121 / 2 + var121 * var125 + var13, var122 / 2 + var122 * var126 + var14, var10.field2624, 4096);
                                                        } else if (var15 == 0) {
                                                            var120.method1763(var121 * var125 + var13, var122 * var126 + var14);
                                                        } else {
                                                            var120.method1809(var121 * var125 + var13, var122 * var126 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1825(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var127 = var10.field2611 * 4096 / var121;
                                                if (var10.field2624 != 0) {
                                                    var120.method1788(var10.field2611 / 2 + var13, var10.field2672 / 2 + var14, var10.field2624, var127);
                                                } else if (var15 != 0) {
                                                    var120.method1739(var13, var14, var10.field2611, var10.field2672, 256 - (var15 & 0xFF));
                                                } else if (var10.field2611 == var121 && var10.field2672 == var122) {
                                                    var120.method1763(var13, var14);
                                                } else {
                                                    var120.method1733(var13, var14, var10.field2611, var10.field2672);
                                                }
                                            }
                                        } else if (class159.field2600) {
                                            method1331(var10);
                                        }
                                    } else {
                                        class86 var119 = var10.method3263(method141(var10));
                                        if (var119 != null) {
                                            var119.method1763(var13, var14);
                                        } else if (class159.field2600) {
                                            method1331(var10);
                                        }
                                    }
                                } else if (var10.field2705 == 6) {
                                    boolean var128 = method141(var10);
                                    int var129;
                                    if (var128) {
                                        var129 = var10.field2610;
                                    } else {
                                        var129 = var10.field2659;
                                    }
                                    class112 var130 = null;
                                    int var131 = 0;
                                    if (var10.field2695 != -1) {
                                        class40 var132 = class40.method31(var10.field2695);
                                        if (var132 != null) {
                                            class40 var133 = var132.method846(var10.field2707);
                                            var130 = var133.method845(1);
                                            if (var130 == null) {
                                                method1331(var10);
                                            } else {
                                                var130.method2274();
                                                var131 = var130.field1546 / 2;
                                            }
                                        }
                                    } else if (var10.field2634 == 5) {
                                        if (var10.field2664 == 0) {
                                            var130 = field510.method3338((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var130 = Statics.field905.method9();
                                        }
                                    } else if (var129 == -1) {
                                        var130 = var10.method3240((class34) null, -1, var128, Statics.field905.field50);
                                        if (var130 == null && class159.field2600) {
                                            method1331(var10);
                                        }
                                    } else {
                                        class34 var134 = class34.method93(var129);
                                        var130 = var10.method3240(var134, var10.field2708, var128, Statics.field905.field50);
                                        if (var130 == null && class159.field2600) {
                                            method1331(var10);
                                        }
                                    }
                                    class104.method2228(var10.field2611 / 2 + var13, var10.field2672 / 2 + var14);
                                    int var135 = var10.field2645 * class104.field1779[var10.field2642] >> 16;
                                    int var136 = var10.field2645 * class104.field1780[var10.field2642] >> 16;
                                    if (var130 != null) {
                                        if (var10.field2601) {
                                            var130.method2274();
                                            if (var10.field2647) {
                                                var130.method2312(0, var10.field2663, var10.field2644, var10.field2642, var10.field2653, var10.field2641 + var131 + var135, var10.field2641 + var136, var10.field2645);
                                            } else {
                                                var130.method2285(0, var10.field2663, var10.field2644, var10.field2642, var10.field2653, var10.field2641 + var131 + var135, var10.field2641 + var136);
                                            }
                                        } else {
                                            var130.method2285(0, var10.field2663, 0, var10.field2642, 0, var135, var136);
                                        }
                                    }
                                    class104.method2176();
                                } else {
                                    if (var10.field2705 == 7) {
                                        class183 var137 = var10.method3238();
                                        if (var137 == null) {
                                            if (class159.field2600) {
                                                method1331(var10);
                                            }
                                            continue;
                                        }
                                        int var138 = 0;
                                        for (int var139 = 0; var139 < var10.field2672; var139++) {
                                            for (int var140 = 0; var140 < var10.field2611; var140++) {
                                                if (var10.field2704[var138] > 0) {
                                                    class40 var141 = class40.method31(var10.field2704[var138] - 1);
                                                    String var142;
                                                    if (var141.field987 != 1 && var10.field2643[var138] == 1) {
                                                        var142 = class2.method3035(16748608) + var141.field988 + class2.field24;
                                                    } else {
                                                        var142 = class2.method3035(16748608) + var141.field988 + class2.field24 + " " + 'x' + method35(var10.field2643[var138]);
                                                    }
                                                    int var143 = (var10.field2655 + 115) * var140 + var13;
                                                    int var144 = (var10.field2656 + 12) * var139 + var14;
                                                    if (var10.field2652 == 0) {
                                                        var137.method3540(var142, var143, var144, var10.field2619, var10.field2654 ? 0 : -1);
                                                    } else if (var10.field2652 == 1) {
                                                        var137.method3505(var142, var10.field2611 / 2 + var143, var144, var10.field2619, var10.field2654 ? 0 : -1);
                                                    } else {
                                                        var137.method3487(var142, var10.field2611 + var143 - 1, var144, var10.field2619, var10.field2654 ? 0 : -1);
                                                    }
                                                }
                                                var138++;
                                            }
                                        }
                                    }
                                    if (var10.field2705 == 8 && Statics.field1274 == var10 && field635 == field609) {
                                        int var145 = 0;
                                        int var146 = 0;
                                        class183 var147 = Statics.field2002;
                                        String var148 = var10.field2649;
                                        String var149 = method1901(var148, var10);
                                        while (var149.length() > 0) {
                                            int var150 = var149.indexOf(class2.field25);
                                            String var151;
                                            if (var150 == -1) {
                                                var151 = var149;
                                                var149 = "";
                                            } else {
                                                var151 = var149.substring(0, var150);
                                                var149 = var149.substring(var150 + 4);
                                            }
                                            int var152 = var147.method3553(var151);
                                            if (var152 > var145) {
                                                var145 = var152;
                                            }
                                            var146 += var147.field2843 + 1;
                                        }
                                        var145 += 6;
                                        var146 += 7;
                                        int var153 = var10.field2611 + var13 - 5 - var145;
                                        int var154 = var10.field2672 + var14 + 5;
                                        if (var153 < var13 + 5) {
                                            var153 = var13 + 5;
                                        }
                                        if (var145 + var153 > arg4) {
                                            var153 = arg4 - var145;
                                        }
                                        if (var146 + var154 > arg5) {
                                            var154 = arg5 - var146;
                                        }
                                        class89.method1831(var153, var154, var145, var146, 16777120);
                                        class89.method1833(var153, var154, var145, var146, 0);
                                        String var155 = var10.field2649;
                                        int var156 = var147.field2843 + var154 + 2;
                                        String var157 = method1901(var155, var10);
                                        while (var157.length() > 0) {
                                            int var158 = var157.indexOf(class2.field25);
                                            String var159;
                                            if (var158 == -1) {
                                                var159 = var157;
                                                var157 = "";
                                            } else {
                                                var159 = var157.substring(0, var158);
                                                var157 = var157.substring(var158 + 4);
                                            }
                                            var147.method3540(var159, var153 + 3, var156, 0, -1);
                                            var156 += var147.field2843 + 1;
                                        }
                                    }
                                    if (var10.field2705 == 9) {
                                        if (var10.field2625 == 1) {
                                            class89.method1839(var13, var14, var10.field2611 + var13, var10.field2672 + var14, var10.field2619);
                                        } else {
                                            int var160 = var10.field2611 >= 0 ? var10.field2611 : -var10.field2611;
                                            int var161 = var10.field2672 >= 0 ? var10.field2672 : -var10.field2672;
                                            int var162 = var160;
                                            if (var160 < var161) {
                                                var162 = var161;
                                            }
                                            if (var162 != 0) {
                                                int var163 = (var10.field2611 << 16) / var162;
                                                int var164 = (var10.field2672 << 16) / var162;
                                                if (var164 <= var163) {
                                                    var163 = -var163;
                                                } else {
                                                    var164 = -var164;
                                                }
                                                int var165 = var10.field2625 * var164 >> 17;
                                                int var166 = var10.field2625 * var164 + 1 >> 17;
                                                int var167 = var10.field2625 * var163 >> 17;
                                                int var168 = var10.field2625 * var163 + 1 >> 17;
                                                int var169 = var13 + var165;
                                                int var170 = var13 - var166;
                                                int var171 = var10.field2611 + var13 - var166;
                                                int var172 = var10.field2611 + var13 + var165;
                                                int var173 = var14 + var167;
                                                int var174 = var14 - var168;
                                                int var175 = var10.field2672 + var14 - var168;
                                                int var176 = var10.field2672 + var14 + var167;
                                                class104.method2181(var169, var170, var171);
                                                class104.method2190(var173, var174, var175, var169, var170, var171, var10.field2619);
                                                class104.method2181(var169, var171, var172);
                                                class104.method2190(var173, var175, var176, var169, var171, var172, var10.field2619);
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

    @ObfuscatedName("cy.cu(Ljava/lang/String;Lfi;B)Ljava/lang/String;")
    public static String method1901(String arg0, class159 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method652(method1582(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field907 != null) {
                    int var6 = Statics.field907.field1397;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field907.field1398 != null) {
                        var5 = (String) Statics.field907.field1398;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.cz(II)Ljava/lang/String;")
    public static final String method35(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field18 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3035(65408) + var1.substring(0, var1.length() - 8) + class135.field2241 + " " + class2.field20 + var1 + class2.field21 + class2.field24;
        } else if (var1.length() > 6) {
            return " " + class2.method3035(16777215) + var1.substring(0, var1.length() - 4) + class135.field2243 + " " + class2.field20 + var1 + class2.field21 + class2.field24;
        } else {
            return " " + class2.method3035(16776960) + var1 + class2.field24;
        }
    }

    @ObfuscatedName("t.cv(Lfi;IIIIIIB)V")
    public static final void method194(class159 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field537) {
            field658 = 32;
        } else {
            field658 = 0;
        }
        field537 = false;
        if (class77.field1376 == 1) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2616 -= 4;
                method1331(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2616 += 4;
                method1331(arg0);
            } else if (arg5 >= arg1 - field658 && arg5 < field658 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2616 = (arg4 - arg3) * var8 / var9;
                method1331(arg0);
                field537 = true;
            }
        }
        if (field652 == 0) {
            return;
        }
        int var10 = arg0.field2611;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2616 += field652 * 45;
            method1331(arg0);
        }
    }

    @ObfuscatedName("cl.ct(IIIIII)V")
    public static final void method2164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field99[0].method1819(arg0, arg1);
        Statics.field99[1].method1819(arg0, arg1 + arg3 - 16);
        class89.method1831(arg0, arg1 + 16, 16, arg3 - 32, field528);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1831(arg0, arg1 + 16 + var6, 16, var5, field534);
        class89.method1834(arg0, arg1 + 16 + var6, var5, field536);
        class89.method1834(arg0 + 1, arg1 + 16 + var6, var5, field536);
        class89.method1835(arg0, arg1 + 16 + var6, 16, field536);
        class89.method1835(arg0, arg1 + 17 + var6, 16, field536);
        class89.method1834(arg0 + 15, arg1 + 16 + var6, var5, field535);
        class89.method1834(arg0 + 14, arg1 + 17 + var6, var5 - 1, field535);
        class89.method1835(arg0, arg1 + 15 + var6 + var5, 16, field535);
        class89.method1835(arg0 + 1, arg1 + 14 + var6 + var5, 15, field535);
    }

    @ObfuscatedName("ae.ch(IB)Ljava/lang/String;")
    public static final String method652(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("g.cg(Lfi;I)Z")
    public static final boolean method141(class159 arg0) {
        if (arg0.field2638 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2638.length; var1++) {
            int var2 = method1582(arg0, var1);
            int var3 = arg0.field2700[var1];
            if (arg0.field2638[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2638[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2638[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("bm.ca(Lfi;II)I")
    public static final int method1582(class159 arg0, int arg1) {
        if (arg0.field2698 == null || arg1 >= arg0.field2698.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2698[arg1];
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
                    var7 = field594[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field595[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field613[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class159 var11 = class159.method1397(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method31(var12).field1003 || field460)) {
                        for (int var13 = 0; var13 < var11.field2704.length; var13++) {
                            if (var12 + 1 == var11.field2704[var13]) {
                                var7 += var11.field2643[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class160.field2725[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class131.field2058[field595[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class160.field2725[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field905.field36;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class131.field2052[var14]) {
                            var7 += field595[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class159 var17 = class159.method1397(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method31(var18).field1003 || field460)) {
                        for (int var19 = 0; var19 < var17.field2704.length; var19++) {
                            if (var18 + 1 == var17.field2704[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field621;
                }
                if (var6 == 12) {
                    var7 = field584;
                }
                if (var6 == 13) {
                    int var20 = class160.field2725[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class160.method905(var22);
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
                    var7 = (Statics.field905.field404 >> 7) + Statics.field1848;
                }
                if (var6 == 19) {
                    var7 = (Statics.field905.field394 >> 7) + Statics.field178;
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

    @ObfuscatedName("bk.cx([Lfi;IIIIIIII)V")
    public static final void method1450(class159[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class159 var9 = arg0[var8];
            if (var9 != null && (!var9.field2601 || var9.field2705 == 0 || var9.field2669 || method2769(var9) != 0 || field628 == var9) && var9.field2613 == arg1 && (!var9.field2601 || !method1424(var9))) {
                int var10 = var9.field2607 + arg6;
                int var11 = var9.field2640 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2705 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2705 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2611 + var10;
                    int var19 = var9.field2672 + var11;
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
                    int var22 = var9.field2611 + var10;
                    int var23 = var9.field2672 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field627 == var9) {
                    field504 = true;
                    field636 = var10;
                    field669 = var11;
                }
                if (!var9.field2601 || var12 < var14 && var13 < var15) {
                    if (var9.field2627 == 1337) {
                        method1331(var9);
                    } else if (var9.field2627 == 1338) {
                        method163(var10, var11);
                    } else {
                        if (var9.field2705 == 0) {
                            if (!var9.field2601 && method1424(var9) && Statics.field1112 != var9) {
                                continue;
                            }
                            method1450(arg0, var9.field2673, var12, var13, var14, var15, var10 - var9.field2612, var11 - var9.field2616);
                            if (var9.field2595 != null) {
                                method1450(var9.field2595, var9.field2673, var12, var13, var14, var15, var10 - var9.field2612, var11 - var9.field2616);
                            }
                            class4 var24 = (class4) field617.method3405((long) var9.field2673);
                            if (var24 != null) {
                                int var25 = var24.field56;
                                if (class159.method129(var25)) {
                                    method1450(Statics.field1921[var25], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2601) {
                            boolean var26;
                            if (class77.field1377 >= var12 && class77.field1381 >= var13 && class77.field1377 < var14 && class77.field1381 < var15) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            if (class77.field1376 == 1 && var26) {
                                var27 = true;
                            }
                            boolean var28 = false;
                            if (class77.field1386 == 1 && class77.field1387 >= var12 && class77.field1385 >= var13 && class77.field1387 < var14 && class77.field1385 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                method130(var9, class77.field1387 - var10, class77.field1385 - var11);
                            }
                            if (field627 != null && field627 != var9 && var26 && class163.method3090(method2769(var9))) {
                                field641 = var9;
                            }
                            if (field628 == var9) {
                                field632 = true;
                                field545 = var10;
                                field696 = var11;
                            }
                            if (var9.field2669) {
                                if (var26 && field652 != 0 && var9.field2706 != null) {
                                    class1 var29 = new class1();
                                    var29.field2 = var9;
                                    var29.field4 = field652;
                                    var29.field6 = var9.field2706;
                                    field665.method3422(var29);
                                }
                                if (field627 != null || Statics.field2628 != null || field455) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var9.field2712 && var28) {
                                    var9.field2712 = true;
                                    if (var9.field2671 != null) {
                                        class1 var30 = new class1();
                                        var30.field2 = var9;
                                        var30.field3 = class77.field1387 - var10;
                                        var30.field4 = class77.field1385 - var11;
                                        var30.field6 = var9.field2671;
                                        field665.method3422(var30);
                                    }
                                }
                                if (var9.field2712 && var27 && var9.field2621 != null) {
                                    class1 var31 = new class1();
                                    var31.field2 = var9;
                                    var31.field3 = class77.field1377 - var10;
                                    var31.field4 = class77.field1381 - var11;
                                    var31.field6 = var9.field2621;
                                    field665.method3422(var31);
                                }
                                if (var9.field2712 && !var27) {
                                    var9.field2712 = false;
                                    if (var9.field2709 != null) {
                                        class1 var32 = new class1();
                                        var32.field2 = var9;
                                        var32.field3 = class77.field1377 - var10;
                                        var32.field4 = class77.field1381 - var11;
                                        var32.field6 = var9.field2709;
                                        field598.method3422(var32);
                                    }
                                }
                                if (var27 && var9.field2674 != null) {
                                    class1 var33 = new class1();
                                    var33.field2 = var9;
                                    var33.field3 = class77.field1377 - var10;
                                    var33.field4 = class77.field1381 - var11;
                                    var33.field6 = var9.field2674;
                                    field665.method3422(var33);
                                }
                                if (!var9.field2711 && var26) {
                                    var9.field2711 = true;
                                    if (var9.field2606 != null) {
                                        class1 var34 = new class1();
                                        var34.field2 = var9;
                                        var34.field3 = class77.field1377 - var10;
                                        var34.field4 = class77.field1381 - var11;
                                        var34.field6 = var9.field2606;
                                        field665.method3422(var34);
                                    }
                                }
                                if (var9.field2711 && var26 && var9.field2676 != null) {
                                    class1 var35 = new class1();
                                    var35.field2 = var9;
                                    var35.field3 = class77.field1377 - var10;
                                    var35.field4 = class77.field1381 - var11;
                                    var35.field6 = var9.field2676;
                                    field665.method3422(var35);
                                }
                                if (var9.field2711 && !var26) {
                                    var9.field2711 = false;
                                    if (var9.field2677 != null) {
                                        class1 var36 = new class1();
                                        var36.field2 = var9;
                                        var36.field3 = class77.field1377 - var10;
                                        var36.field4 = class77.field1381 - var11;
                                        var36.field6 = var9.field2677;
                                        field598.method3422(var36);
                                    }
                                }
                                if (var9.field2629 != null) {
                                    class1 var37 = new class1();
                                    var37.field2 = var9;
                                    var37.field6 = var9.field2629;
                                    field706.method3422(var37);
                                }
                                if (var9.field2682 != null && field593 > var9.field2598) {
                                    if (var9.field2683 == null || field593 - var9.field2598 > 32) {
                                        class1 var42 = new class1();
                                        var42.field2 = var9;
                                        var42.field6 = var9.field2682;
                                        field665.method3422(var42);
                                    } else {
                                        label381: for (int var38 = var9.field2598; var38 < field593; var38++) {
                                            int var39 = field640[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var9.field2683.length; var40++) {
                                                if (var9.field2683[var40] == var39) {
                                                    class1 var41 = new class1();
                                                    var41.field2 = var9;
                                                    var41.field6 = var9.field2682;
                                                    field665.method3422(var41);
                                                    break label381;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2598 = field593;
                                }
                                if (var9.field2615 != null && field643 > var9.field2715) {
                                    if (var9.field2685 == null || field643 - var9.field2715 > 32) {
                                        class1 var47 = new class1();
                                        var47.field2 = var9;
                                        var47.field6 = var9.field2615;
                                        field665.method3422(var47);
                                    } else {
                                        label361: for (int var43 = var9.field2715; var43 < field643; var43++) {
                                            int var44 = field548[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var9.field2685.length; var45++) {
                                                if (var9.field2685[var45] == var44) {
                                                    class1 var46 = new class1();
                                                    var46.field2 = var9;
                                                    var46.field6 = var9.field2615;
                                                    field665.method3422(var46);
                                                    break label361;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2715 = field643;
                                }
                                if (var9.field2686 != null && field645 > var9.field2716) {
                                    if (var9.field2687 == null || field645 - var9.field2716 > 32) {
                                        class1 var52 = new class1();
                                        var52.field2 = var9;
                                        var52.field6 = var9.field2686;
                                        field665.method3422(var52);
                                    } else {
                                        label341: for (int var48 = var9.field2716; var48 < field645; var48++) {
                                            int var49 = field475[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var9.field2687.length; var50++) {
                                                if (var9.field2687[var50] == var49) {
                                                    class1 var51 = new class1();
                                                    var51.field2 = var9;
                                                    var51.field6 = var9.field2686;
                                                    field665.method3422(var51);
                                                    break label341;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2716 = field645;
                                }
                                if (field582 > var9.field2713 && var9.field2602 != null) {
                                    class1 var53 = new class1();
                                    var53.field2 = var9;
                                    var53.field6 = var9.field2602;
                                    field665.method3422(var53);
                                }
                                if (field647 > var9.field2713 && var9.field2693 != null) {
                                    class1 var54 = new class1();
                                    var54.field2 = var9;
                                    var54.field6 = var9.field2693;
                                    field665.method3422(var54);
                                }
                                if (field648 > var9.field2713 && var9.field2718 != null) {
                                    class1 var55 = new class1();
                                    var55.field2 = var9;
                                    var55.field6 = var9.field2718;
                                    field665.method3422(var55);
                                }
                                if (field649 > var9.field2713 && var9.field2675 != null) {
                                    class1 var56 = new class1();
                                    var56.field2 = var9;
                                    var56.field6 = var9.field2675;
                                    field665.method3422(var56);
                                }
                                var9.field2713 = field639;
                                if (var9.field2692 != null) {
                                    for (int var57 = 0; var57 < field678; var57++) {
                                        class1 var58 = new class1();
                                        var58.field2 = var9;
                                        var58.field7 = field694[var57];
                                        var58.field13 = field679[var57];
                                        var58.field6 = var9.field2692;
                                        field665.method3422(var58);
                                    }
                                }
                            }
                        }
                        if (!var9.field2601) {
                            if (field627 != null || Statics.field2628 != null || field455) {
                                return;
                            }
                            if ((var9.field2701 >= 0 || var9.field2690 != 0) && class77.field1377 >= var12 && class77.field1381 >= var13 && class77.field1377 < var14 && class77.field1381 < var15) {
                                if (var9.field2701 >= 0) {
                                    Statics.field1112 = arg0[var9.field2701];
                                } else {
                                    Statics.field1112 = var9;
                                }
                            }
                            if (var9.field2705 == 8 && class77.field1377 >= var12 && class77.field1381 >= var13 && class77.field1377 < var14 && class77.field1381 < var15) {
                                Statics.field1274 = var9;
                            }
                            if (var9.field2618 > var9.field2672) {
                                method194(var9, var9.field2611 + var10, var11, var9.field2672, var9.field2618, class77.field1377, class77.field1381);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ci.ck([Lfi;II)V")
    public static final void method2169(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2705 == 0) {
                    if (var3.field2595 != null) {
                        method2169(var3.field2595, arg1);
                    }
                    class4 var4 = (class4) field617.method3405((long) var3.field2673);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class159.method129(var5)) {
                            method2169(Statics.field1921[var5], arg1);
                        }
                    }
                }
                if (arg1 == 0 && var3.field2696 != null) {
                    class1 var6 = new class1();
                    var6.field2 = var3;
                    var6.field6 = var3.field2696;
                    class26.method47(var6);
                }
                if (arg1 == 1 && var3.field2697 != null) {
                    if (var3.field2603 >= 0) {
                        class159 var7 = class159.method1397(var3.field2673);
                        if (var7 == null || var7.field2595 == null || var3.field2603 >= var7.field2595.length || var7.field2595[var3.field2603] != var3) {
                            continue;
                        }
                    }
                    class1 var8 = new class1();
                    var8.field2 = var3;
                    var8.field6 = var3.field2697;
                    class26.method47(var8);
                }
            }
        }
    }

    @ObfuscatedName("n.cc(Lfi;III)V")
    public static final void method130(class159 arg0, int arg1, int arg2) {
        if (field627 != null || field455 || arg0 == null || method131(arg0) == null) {
            return;
        }
        field627 = arg0;
        field628 = method131(arg0);
        field629 = arg1;
        field591 = arg2;
        Statics.field2348 = 0;
        field638 = false;
    }

    @ObfuscatedName("bd.cy(Lfi;I)V")
    public static void method1331(class159 arg0) {
        if (field670 == arg0.field2684) {
            field493[arg0.field2717] = true;
        }
    }

    @ObfuscatedName("a.cr(B)V")
    public static void method36() {
        for (class4 var0 = (class4) field617.method3408(); var0 != null; var0 = (class4) field617.method3415()) {
            int var1 = var0.field56;
            if (class159.method129(var1)) {
                boolean var2 = true;
                class159[] var3 = Statics.field1921[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2601;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2821;
                    class159 var6 = class159.method1397(var5);
                    if (var6 != null) {
                        method1331(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("n.cf(Lfi;B)Lfi;")
    public static class159 method131(class159 arg0) {
        class159 var1 = arg0;
        int var2 = class163.method705(method2769(arg0));
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
                var1 = class159.method1397(var1.field2613);
                if (var1 == null) {
                    var3 = null;
                    break;
                }
                var4++;
            }
        }
        class159 var5 = var3;
        if (var3 == null) {
            var5 = arg0.field2608;
        }
        return var5;
    }

    @ObfuscatedName("client.cs([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method356(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("d.cq(II)V")
    public static final void method18(int arg0) {
        if (!class159.method129(arg0)) {
            return;
        }
        class159[] var1 = Statics.field1921[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class159 var3 = var1[var2];
            if (var3 != null) {
                var3.field2708 = 0;
                var3.field2699 = 0;
            }
        }
    }

    @ObfuscatedName("dn.cp([Lfi;II)V")
    public static final void method2429(class159[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class159 var3 = arg0[var2];
            if (var3 != null && var3.field2613 == arg1 && (!var3.field2601 || !method1424(var3))) {
                if (var3.field2705 == 0) {
                    if (!var3.field2601 && method1424(var3) && Statics.field1112 != var3) {
                        continue;
                    }
                    method2429(arg0, var3.field2673);
                    if (var3.field2595 != null) {
                        method2429(var3.field2595, var3.field2673);
                    }
                    class4 var4 = (class4) field617.method3405((long) var3.field2673);
                    if (var4 != null) {
                        int var5 = var4.field56;
                        if (class159.method129(var5)) {
                            method2429(Statics.field1921[var5], -1);
                        }
                    }
                }
                if (var3.field2705 == 6) {
                    if (var3.field2659 != -1 || var3.field2610 != -1) {
                        boolean var6 = method141(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2610;
                        } else {
                            var7 = var3.field2659;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method93(var7);
                            var3.field2699 += field532;
                            while (var3.field2699 > var8.field871[var3.field2708]) {
                                var3.field2699 -= var8.field871[var3.field2708];
                                var3.field2708++;
                                if (var3.field2708 >= var8.field869.length) {
                                    var3.field2708 -= var8.field873;
                                    if (var3.field2708 < 0 || var3.field2708 >= var8.field869.length) {
                                        var3.field2708 = 0;
                                    }
                                }
                                method1331(var3);
                            }
                        }
                    }
                    if (var3.field2703 != 0 && !var3.field2601) {
                        int var9 = var3.field2703 >> 16;
                        int var10 = var3.field2703 << 16 >> 16;
                        int var11 = field532 * var9;
                        int var12 = field532 * var10;
                        var3.field2642 = var3.field2642 + var11 & 0x7FF;
                        var3.field2663 = var3.field2663 + var12 & 0x7FF;
                        method1331(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("fw.cn(II)V")
    public static final void method3292(int arg0) {
        method36();
        for (class7 var1 = (class7) class7.field107.method3446(); var1 != null; var1 = (class7) class7.field107.method3428()) {
            if (var1.field98 != null) {
                var1.method40();
            }
        }
        int var2 = class42.method1457(arg0).field1030;
        if (var2 == 0) {
            return;
        }
        int var3 = class160.field2725[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class104.method2175(0.9D);
                ((class110) Statics.field1776).method2253(0.9D);
            }
            if (var3 == 2) {
                class104.method2175(0.8D);
                ((class110) Statics.field1776).method2253(0.8D);
            }
            if (var3 == 3) {
                class104.method2175(0.7D);
                ((class110) Statics.field1776).method2253(0.7D);
            }
            if (var3 == 4) {
                class104.method2175(0.6D);
                ((class110) Statics.field1776).method2253(0.6D);
            }
            class40.method240();
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
            if (field484 != var4) {
                if (field484 == 0 && field538 != -1) {
                    class139.method2165(Statics.field743, field538, 0, var4, false);
                    field596 = false;
                } else if (var4 == 0) {
                    class139.method593();
                    field596 = false;
                } else {
                    class139.method790(var4);
                }
                field484 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field695 = 127;
            }
            if (var3 == 1) {
                field695 = 96;
            }
            if (var3 == 2) {
                field695 = 64;
            }
            if (var3 == 3) {
                field695 = 32;
            }
            if (var3 == 4) {
                field695 = 0;
            }
        }
        if (var2 == 5) {
            field655 = var3;
        }
        if (var2 == 6) {
            field624 = var3;
        }
        if (var2 == 9) {
            field619 = var3;
        }
        if (var2 != 10) {
            return;
        }
        if (var3 == 0) {
            field688 = 127;
        }
        if (var3 == 1) {
            field688 = 96;
        }
        if (var3 == 2) {
            field688 = 64;
        }
        if (var3 == 3) {
            field688 = 32;
        }
        if (var3 == 4) {
            field688 = 0;
        }
    }

    @ObfuscatedName("cx.cl(IIIS)Lx;")
    public static final class4 method1894(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field56 = arg1;
        var3.field53 = arg2;
        field617.method3406(var3, (long) arg0);
        method18(arg1);
        class26.method6(arg1);
        class159 var4 = class159.method1397(arg0);
        if (var4 != null) {
            method1331(var4);
        }
        if (field620 != null) {
            method1331(field620);
            field620 = null;
        }
        method124();
        if (field711 != -1) {
            int var5 = field711;
            if (class159.method129(var5)) {
                method2169(Statics.field1921[var5], 1);
            }
        }
        return var3;
    }

    @ObfuscatedName("j.ci(Lx;ZI)V")
    public static final void method207(class4 arg0, boolean arg1) {
        int var2 = arg0.field56;
        int var3 = (int) arg0.field2821;
        arg0.method3455();
        if (arg1 && var2 != -1 && Statics.field2471[var2]) {
            Statics.field1752.method3077(var2);
            if (Statics.field1921[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field1921[var2].length; var5++) {
                    if (Statics.field1921[var2][var5] != null) {
                        if (Statics.field1921[var2][var5].field2705 == 2) {
                            var4 = false;
                        } else {
                            Statics.field1921[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field1921[var2] = null;
                }
                Statics.field2471[var2] = false;
            }
        }
        for (class171 var6 = (class171) field656.method3408(); var6 != null; var6 = (class171) field656.method3415()) {
            if ((var6.field2821 >> 48 & 0xFFFFL) == (long) var2) {
                var6.method3455();
            }
        }
        class159 var7 = class159.method1397(var3);
        if (var7 != null) {
            method1331(var7);
        }
        method124();
        if (field711 != -1) {
            int var8 = field711;
            if (class159.method129(var8)) {
                method2169(Statics.field1921[var8], 1);
            }
        }
    }

    @ObfuscatedName("ay.cw(Lfi;I)Z")
    public static final boolean method806(class159 arg0) {
        int var1 = arg0.field2627;
        if (var1 == 205) {
            field577 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field510.method3322(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field510.method3321(var4, var5 == 1);
        }
        if (var1 == 324) {
            field510.method3319(false);
        }
        if (var1 == 325) {
            field510.method3319(true);
        }
        if (var1 == 326) {
            field498.method2355(49);
            field510.method3349(field498);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("eg.dg(IIIILcv;I)V")
    public static final void method2762(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method1411(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field540 + field527 & 0x7FF;
        int var7 = class104.field1779[var6];
        int var8 = class104.field1780[var6];
        int var9 = var7 * 256 / (field501 + 256);
        int var10 = var8 * 256 / (field501 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field369.method1740(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("by.df(IIIILcv;I)V")
    public static final void method1411(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field540 + field527 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1779[var5];
        int var8 = class104.field1780[var5];
        int var9 = var7 * 256 / (field501 + 256);
        int var10 = var8 * 256 / (field501 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1799(Statics.field244, arg0 + 94 + var11 - arg4.field1464 / 2 + 4, arg1 + 83 - var12 - arg4.field1465 / 2 - 4);
        } else {
            arg4.method1763(arg0 + 94 + var11 - arg4.field1464 / 2 + 4, arg1 + 83 - var12 - arg4.field1465 / 2 - 4);
        }
    }

    @ObfuscatedName("eo.dj(ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method3179(int arg0, String arg1, String arg2) {
        method196(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("f.dm(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method196(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field608[var4] = field608[var4 - 1];
            field551[var4] = field551[var4 - 1];
            field633[var4] = field633[var4 - 1];
            field567[var4] = field567[var4 - 1];
        }
        field608[0] = arg0;
        field551[0] = arg1;
        field633[0] = arg2;
        field567[0] = arg3;
        field684++;
        field582 = field639;
    }

    @ObfuscatedName("dj.dd(Ljava/lang/String;I)Z")
    public static boolean method2244(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method220(arg0, Statics.field459);
        for (int var2 = 0; var2 < field709; var2++) {
            if (var1.equalsIgnoreCase(class149.method220(field668[var2].field350, Statics.field459))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class149.method220(Statics.field905.field37, Statics.field459))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("r.dh(Ljava/lang/String;I)Z")
    public static boolean method128(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class149.method220(arg0, Statics.field459);
        for (int var2 = 0; var2 < field713; var2++) {
            class11 var3 = field580[var2];
            if (var1.equalsIgnoreCase(class149.method220(var3.field169, Statics.field459))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class149.method220(var3.field167, Statics.field459))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("da.di(Ljava/lang/String;I)V")
    public static final void method2346(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field709 < 200 || field583 == 1) || field709 >= 400) {
            method3179(0, "", class135.field2246);
            return;
        }
        String var1 = class149.method220(arg0, Statics.field459);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field709; var2++) {
            class23 var3 = field668[var2];
            String var4 = class149.method220(var3.field350, Statics.field459);
            if (var4 != null && var4.equals(var1)) {
                method3179(0, "", arg0 + class135.field2247);
                return;
            }
            if (var3.field349 != null) {
                String var5 = class149.method220(var3.field349, Statics.field459);
                if (var5 != null && var5.equals(var1)) {
                    method3179(0, "", arg0 + class135.field2247);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field713; var6++) {
            class11 var7 = field580[var6];
            String var8 = class149.method220(var7.field169, Statics.field459);
            if (var8 != null && var8.equals(var1)) {
                method3179(0, "", class135.field2252 + arg0 + class135.field2253);
                return;
            }
            if (var7.field167 != null) {
                String var9 = class149.method220(var7.field167, Statics.field459);
                if (var9 != null && var9.equals(var1)) {
                    method3179(0, "", class135.field2252 + arg0 + class135.field2253);
                    return;
                }
            }
        }
        if (class149.method220(Statics.field905.field37, Statics.field459).equals(var1)) {
            method3179(0, "", class135.field2250);
            return;
        }
        field498.method2355(185);
        class116 var10 = field498;
        int var11 = arg0.length() + 1;
        var10.method2484(var11);
        field498.method2682(arg0);
    }

    @ObfuscatedName("o.dl(Ljava/lang/String;I)V")
    public static final void method25(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method220(arg0, Statics.field459);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field709; var2++) {
            class23 var3 = field668[var2];
            String var4 = var3.field350;
            String var5 = class149.method220(var4, Statics.field459);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field709--;
                for (int var7 = var2; var7 < field709; var7++) {
                    field668[var7] = field668[var7 + 1];
                }
                field647 = field639;
                field498.method2355(242);
                class116 var8 = field498;
                int var9 = arg0.length() + 1;
                var8.method2484(var9);
                field498.method2682(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("du.de(Ljava/lang/String;I)V")
    public static final void method2476(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class149.method220(arg0, Statics.field459);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field713; var2++) {
            class11 var3 = field580[var2];
            String var4 = var3.field169;
            String var5 = class149.method220(var4, Statics.field459);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field713--;
                for (int var7 = var2; var7 < field713; var7++) {
                    field580[var7] = field580[var7 + 1];
                }
                field647 = field639;
                field498.method2355(198);
                class116 var8 = field498;
                int var9 = arg0.length() + 1;
                var8.method2484(var9);
                field498.method2682(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cl.da(B)V")
    public static final void method2163() {
        field498.method2355(95);
        field498.method2484(0);
    }

    @ObfuscatedName("ey.dq(Lfi;S)I")
    public static int method2769(class159 arg0) {
        class171 var1 = (class171) field656.method3405(((long) arg0.field2673 << 32) + (long) arg0.field2603);
        return var1 == null ? arg0.field2635 : var1.field2803;
    }

    @ObfuscatedName("bi.dr(Lfi;I)Z")
    public static boolean method1424(class159 arg0) {
        if (field625) {
            if (method2769(arg0) != 0) {
                return false;
            }
            if (arg0.field2705 == 0) {
                return false;
            }
        }
        return arg0.field2614;
    }

    @ObfuscatedName("en.dp(Lfi;IB)Ljava/lang/String;")
    public static String method2770(class159 arg0, int arg1) {
        if (!class163.method39(method2769(arg0), arg1) && arg0.field2689 == null) {
            return null;
        } else if (arg0.field2609 == null || arg0.field2609.length <= arg1 || arg0.field2609[arg1] == null || arg0.field2609[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2609[arg1];
        }
    }

    @ObfuscatedName("n.dx(Lfi;B)Ljava/lang/String;")
    public static String method132(class159 arg0) {
        int var1 = method2769(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2668 == null || arg0.field2668.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2668;
        }
    }
}

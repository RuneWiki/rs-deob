package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;

public final class client extends class73 {

    @ObfuscatedName("client.a")
    public static boolean field445 = true;

    @ObfuscatedName("client.q")
    public static int field446 = 1;

    @ObfuscatedName("client.v")
    public static int field459 = 0;

    @ObfuscatedName("client.w")
    public static class164[] field504 = new class164[4];

    @ObfuscatedName("client.n")
    public static boolean field449 = false;

    @ObfuscatedName("client.c")
    public static boolean field450 = false;

    @ObfuscatedName("client.h")
    public static int field451 = 0;

    @ObfuscatedName("client.b")
    public static int field452 = 0;

    @ObfuscatedName("client.t")
    public static boolean field453 = true;

    @ObfuscatedName("client.r")
    public static int field668 = 0;

    @ObfuscatedName("client.g")
    public static long field622 = -1L;

    @ObfuscatedName("client.o")
    public static int field456 = -1;

    @ObfuscatedName("client.e")
    public static int field457 = -1;

    @ObfuscatedName("client.f")
    public static int field701 = -1;

    @ObfuscatedName("client.i")
    public static boolean field486 = true;

    @ObfuscatedName("client.d")
    public static boolean field460 = false;

    @ObfuscatedName("client.z")
    public static int field475 = 0;

    @ObfuscatedName("client.ai")
    public static int field462 = 0;

    @ObfuscatedName("client.ag")
    public static int field463 = 0;

    @ObfuscatedName("client.as")
    public static int field481 = 0;

    @ObfuscatedName("client.al")
    public static int field465 = 0;

    @ObfuscatedName("client.aj")
    public static int field454 = 0;

    @ObfuscatedName("client.am")
    public static int field467 = 0;

    @ObfuscatedName("client.ab")
    public static int field637 = 0;

    @ObfuscatedName("client.ao")
    public static int field693 = 0;

    @ObfuscatedName("client.ac")
    public static class127 field470 = new class127(new byte[5000]);

    @ObfuscatedName("client.az")
    public static int field471 = 0;

    @ObfuscatedName("client.aw")
    public static int field472 = 0;

    @ObfuscatedName("client.an")
    public static int field473 = 0;

    @ObfuscatedName("client.bs")
    public static int field649 = 0;

    @ObfuscatedName("client.be")
    public static int field591 = 0;

    @ObfuscatedName("client.bu")
    public static int field477 = 0;

    @ObfuscatedName("client.bj")
    public static int field588 = 0;

    @ObfuscatedName("client.bh")
    public static int field479 = 0;

    @ObfuscatedName("client.ba")
    public static class25[] field482 = new class25[32768];

    @ObfuscatedName("client.bo")
    public static int field483 = 0;

    @ObfuscatedName("client.bp")
    public static int[] field484 = new int[32768];

    @ObfuscatedName("client.cr")
    public static class116 field485 = new class116(5000);

    @ObfuscatedName("client.cq")
    public static class116 field628 = new class116(5000);

    @ObfuscatedName("client.cn")
    public static class116 field487 = new class116(5000);

    @ObfuscatedName("client.ck")
    public static int field488 = 0;

    @ObfuscatedName("client.co")
    public static int field489 = 0;

    @ObfuscatedName("client.cs")
    public static int field490 = 0;

    @ObfuscatedName("client.cc")
    public static int field528 = 0;

    @ObfuscatedName("client.cm")
    public static int field492 = 0;

    @ObfuscatedName("client.ci")
    public static int field493 = 0;

    @ObfuscatedName("client.cb")
    public static int field494 = 0;

    @ObfuscatedName("client.cu")
    public static int field645 = 0;

    @ObfuscatedName("client.cp")
    public static boolean field496 = false;

    @ObfuscatedName("client.cv")
    public static int field616 = 0;

    @ObfuscatedName("client.cy")
    public static int field499 = 0;

    @ObfuscatedName("client.ce")
    public static int field500 = 1;

    @ObfuscatedName("client.cl")
    public static int field501 = 0;

    @ObfuscatedName("client.ca")
    public static int field510 = 1;

    @ObfuscatedName("client.dk")
    public static int field503 = 0;

    @ObfuscatedName("client.dp")
    public static boolean field640 = false;

    @ObfuscatedName("client.da")
    public static int[][][] field506 = new int[4][13][13];

    @ObfuscatedName("client.du")
    public static final int[] field507 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dw")
    public static int field703 = 0;

    @ObfuscatedName("client.dh")
    public static int[][] field509 = new int[104][104];

    @ObfuscatedName("client.do")
    public static int[][] field620 = new int[104][104];

    @ObfuscatedName("client.dr")
    public static int[] field511 = new int[4000];

    @ObfuscatedName("client.dc")
    public static int[] field508 = new int[4000];

    @ObfuscatedName("client.dq")
    public static int field556 = 0;

    @ObfuscatedName("client.de")
    public static int field514 = 2;

    @ObfuscatedName("client.dl")
    public static int field466 = 0;

    @ObfuscatedName("client.dy")
    public static int field516 = 2;

    @ObfuscatedName("client.dg")
    public static int field517 = 0;

    @ObfuscatedName("client.dj")
    public static int field602 = 1;

    @ObfuscatedName("client.dz")
    public static int field680 = 0;

    @ObfuscatedName("client.dm")
    public static int field706 = 0;

    @ObfuscatedName("client.em")
    public static int field521 = 2;

    @ObfuscatedName("client.ex")
    public static int field522 = 0;

    @ObfuscatedName("client.et")
    public static int field557 = 1;

    @ObfuscatedName("client.eu")
    public static int field524 = 0;

    @ObfuscatedName("client.ei")
    public static int field525 = 0;

    @ObfuscatedName("client.eq")
    public static int field532 = 2301979;

    @ObfuscatedName("client.eb")
    public static int field527 = 5063219;

    @ObfuscatedName("client.ey")
    public static int field461 = 3353893;

    @ObfuscatedName("client.fm")
    public static int field519 = 7759444;

    @ObfuscatedName("client.fw")
    public static boolean field530 = false;

    @ObfuscatedName("client.fu")
    public static int field531 = 0;

    @ObfuscatedName("client.fb")
    public static int field458 = 128;

    @ObfuscatedName("client.ff")
    public static int field533 = 0;

    @ObfuscatedName("client.fp")
    public static int field534 = 0;

    @ObfuscatedName("client.fv")
    public static int field535 = 0;

    @ObfuscatedName("client.fk")
    public static int field536 = 0;

    @ObfuscatedName("client.fn")
    public static boolean field537 = false;

    @ObfuscatedName("client.fj")
    public static int field589 = 0;

    @ObfuscatedName("client.fs")
    public static int field539 = 0;

    @ObfuscatedName("client.fi")
    public static int field540 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field541 = new int[field540];

    @ObfuscatedName("client.fy")
    public static int[] field542 = new int[field540];

    @ObfuscatedName("client.fq")
    public static int[] field543 = new int[field540];

    @ObfuscatedName("client.fz")
    public static int[] field544 = new int[field540];

    @ObfuscatedName("client.fd")
    public static int[] field545 = new int[field540];

    @ObfuscatedName("client.fg")
    public static int[] field546 = new int[field540];

    @ObfuscatedName("client.fr")
    public static int[] field547 = new int[field540];

    @ObfuscatedName("client.gh")
    public static String[] field548 = new String[field540];

    @ObfuscatedName("client.gy")
    public static int[][] field549 = new int[104][104];

    @ObfuscatedName("client.gp")
    public static int field689 = 0;

    @ObfuscatedName("client.gg")
    public static int field551 = -1;

    @ObfuscatedName("client.gi")
    public static int field552 = -1;

    @ObfuscatedName("client.gs")
    public static int field520 = 0;

    @ObfuscatedName("client.gl")
    public static int field554 = 0;

    @ObfuscatedName("client.ge")
    public static int field550 = 0;

    @ObfuscatedName("client.gz")
    public static int field667 = 0;

    @ObfuscatedName("client.ga")
    public static int field600 = 0;

    @ObfuscatedName("client.gm")
    public static int field558 = 0;

    @ObfuscatedName("client.gq")
    public static int field559 = 0;

    @ObfuscatedName("client.gv")
    public static int field560 = 0;

    @ObfuscatedName("client.gb")
    public static int field561 = 0;

    @ObfuscatedName("client.gr")
    public static int field686 = 0;

    @ObfuscatedName("client.gw")
    public static boolean field563 = false;

    @ObfuscatedName("client.gc")
    public static int field583 = 0;

    @ObfuscatedName("client.gt")
    public static int field565 = 0;

    @ObfuscatedName("client.gn")
    public static class3[] field566 = new class3[2048];

    @ObfuscatedName("client.gu")
    public static int field683 = 0;

    @ObfuscatedName("client.gx")
    public static int[] field568 = new int[2048];

    @ObfuscatedName("client.hi")
    public static int field569 = 0;

    @ObfuscatedName("client.he")
    public static int[] field670 = new int[2048];

    @ObfuscatedName("client.hn")
    public static class127[] field571 = new class127[2048];

    @ObfuscatedName("client.hh")
    public static int field570 = -1;

    @ObfuscatedName("client.hz")
    public static int field464 = 0;

    @ObfuscatedName("client.hf")
    public static int field574 = 0;

    @ObfuscatedName("client.hl")
    public static int[] field538 = new int[1000];

    @ObfuscatedName("client.hy")
    public static final int[] field708 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hm")
    public static String[] field577 = new String[8];

    @ObfuscatedName("client.hg")
    public static boolean[] field578 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field579 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.ht")
    public static class177[][][] field639 = new class177[4][104][104];

    @ObfuscatedName("client.hv")
    public static class177 field581 = new class177();

    @ObfuscatedName("client.hr")
    public static class177 field582 = new class177();

    @ObfuscatedName("client.hx")
    public static class177 field455 = new class177();

    @ObfuscatedName("client.hw")
    public static int[] field584 = new int[25];

    @ObfuscatedName("client.ho")
    public static int[] field585 = new int[25];

    @ObfuscatedName("client.hj")
    public static int[] field586 = new int[25];

    @ObfuscatedName("client.hb")
    public static int field587 = 0;

    @ObfuscatedName("client.ha")
    public static boolean field572 = false;

    @ObfuscatedName("client.ig")
    public static int field590 = 0;

    @ObfuscatedName("client.io")
    public static int[] field687 = new int[500];

    @ObfuscatedName("client.iq")
    public static int[] field592 = new int[500];

    @ObfuscatedName("client.ih")
    public static int[] field593 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field604 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field595 = new String[500];

    @ObfuscatedName("client.ip")
    public static String[] field596 = new String[500];

    @ObfuscatedName("client.ir")
    public static int field597 = -1;

    @ObfuscatedName("client.ia")
    public static int field598 = -1;

    @ObfuscatedName("client.if")
    public static int field599 = 0;

    @ObfuscatedName("client.il")
    public static int field447 = 50;

    @ObfuscatedName("client.ij")
    public static int field663 = 0;

    @ObfuscatedName("client.it")
    public static String field658 = null;

    @ObfuscatedName("client.ie")
    public static boolean field603 = false;

    @ObfuscatedName("client.ii")
    public static int field515 = -1;

    @ObfuscatedName("client.iw")
    public static String field605 = null;

    @ObfuscatedName("client.ic")
    public static String field468 = null;

    @ObfuscatedName("client.jp")
    public static int field607 = -1;

    @ObfuscatedName("client.jo")
    public static class175 field608 = new class175(8);

    @ObfuscatedName("client.jy")
    public static int field526 = 0;

    @ObfuscatedName("client.jt")
    public static int field626 = 0;

    @ObfuscatedName("client.jf")
    public static class158 field611 = null;

    @ObfuscatedName("client.jd")
    public static int field612 = 0;

    @ObfuscatedName("client.ja")
    public static int field613 = 0;

    @ObfuscatedName("client.jw")
    public static int field614 = 0;

    @ObfuscatedName("client.ju")
    public static boolean field615 = false;

    @ObfuscatedName("client.jj")
    public static boolean field601 = false;

    @ObfuscatedName("client.jb")
    public static boolean field480 = false;

    @ObfuscatedName("client.ji")
    public static class158 field512 = null;

    @ObfuscatedName("client.jv")
    public static class158 field619 = null;

    @ObfuscatedName("client.jc")
    public static int field562 = 0;

    @ObfuscatedName("client.jn")
    public static int field621 = 0;

    @ObfuscatedName("client.jl")
    public static class158 field677 = null;

    @ObfuscatedName("client.js")
    public static boolean field623 = false;

    @ObfuscatedName("client.jh")
    public static int field624 = -1;

    @ObfuscatedName("client.jz")
    public static int field625 = -1;

    @ObfuscatedName("client.je")
    public static boolean field692 = false;

    @ObfuscatedName("client.jg")
    public static int field627 = -1;

    @ObfuscatedName("client.jr")
    public static int field505 = -1;

    @ObfuscatedName("client.jq")
    public static boolean field629 = false;

    @ObfuscatedName("client.kj")
    public static int field630 = 1;

    @ObfuscatedName("client.kv")
    public static int[] field631 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field632 = 0;

    @ObfuscatedName("client.ka")
    public static int[] field594 = new int[32];

    @ObfuscatedName("client.kq")
    public static int field648 = 0;

    @ObfuscatedName("client.kc")
    public static int[] field518 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field564 = 0;

    @ObfuscatedName("client.ky")
    public static int field567 = 0;

    @ObfuscatedName("client.kd")
    public static int field638 = 0;

    @ObfuscatedName("client.kk")
    public static int field691 = 0;

    @ObfuscatedName("client.kl")
    public static int field553 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field641 = new int[2000];

    @ObfuscatedName("client.ko")
    public static String[] field642 = new String[1000];

    @ObfuscatedName("client.km")
    public static int field643 = 0;

    @ObfuscatedName("client.ke")
    public static class177 field644 = new class177();

    @ObfuscatedName("client.ki")
    public static class177 field523 = new class177();

    @ObfuscatedName("client.kh")
    public static class177 field617 = new class177();

    @ObfuscatedName("client.kw")
    public static class175 field647 = new class175(512);

    @ObfuscatedName("client.kr")
    public static int field681 = 0;

    @ObfuscatedName("client.kn")
    public static int field498 = -2;

    @ObfuscatedName("client.kp")
    public static boolean[] field650 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field651 = new boolean[100];

    @ObfuscatedName("client.le")
    public static boolean[] field652 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static int[] field653 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field654 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field636 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field662 = new int[100];

    @ObfuscatedName("client.lm")
    public static int field657 = 0;

    @ObfuscatedName("client.lu")
    public static int[] field633 = new int[100];

    @ObfuscatedName("client.lx")
    public static String[] field580 = new String[100];

    @ObfuscatedName("client.lo")
    public static String[] field660 = new String[100];

    @ObfuscatedName("client.ly")
    public static String[] field661 = new String[100];

    @ObfuscatedName("client.lr")
    public static int field469 = 0;

    @ObfuscatedName("client.ln")
    public static int[] field609 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lk")
    public static int field664 = 0;

    @ObfuscatedName("client.lp")
    public static int field665 = 0;

    @ObfuscatedName("client.lj")
    public static long[] field666 = new long[100];

    @ObfuscatedName("client.lw")
    public static int field573 = 0;

    @ObfuscatedName("client.lq")
    public static int field555 = 0;

    @ObfuscatedName("client.lh")
    public static int[] field669 = new int[128];

    @ObfuscatedName("client.lz")
    public static int[] field491 = new int[128];

    @ObfuscatedName("client.lb")
    public static long field671 = -1L;

    @ObfuscatedName("client.lc")
    public static String field672 = null;

    @ObfuscatedName("client.mb")
    public static String field646 = null;

    @ObfuscatedName("client.mi")
    public static int field674 = -1;

    @ObfuscatedName("client.mz")
    public static int field675 = 0;

    @ObfuscatedName("client.mm")
    public static int[] field495 = new int[1000];

    @ObfuscatedName("client.mf")
    public static int[] field529 = new int[1000];

    @ObfuscatedName("client.mu")
    public static class86[] field678 = new class86[1000];

    @ObfuscatedName("client.mq")
    public static int field679 = 0;

    @ObfuscatedName("client.mt")
    public static int field676 = 0;

    @ObfuscatedName("client.mj")
    public static int field709 = 0;

    @ObfuscatedName("client.mh")
    public static int field682 = 255;

    @ObfuscatedName("client.my")
    public static int field656 = -1;

    @ObfuscatedName("client.md")
    public static boolean field684 = false;

    @ObfuscatedName("client.mg")
    public static int field659 = 127;

    @ObfuscatedName("client.mc")
    public static int field575 = 127;

    @ObfuscatedName("client.nq")
    public static int field478 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field688 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field673 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field690 = new int[50];

    @ObfuscatedName("client.ni")
    public static int[] field513 = new int[50];

    @ObfuscatedName("client.nb")
    public static class57[] field610 = new class57[50];

    @ObfuscatedName("client.no")
    public static boolean field476 = false;

    @ObfuscatedName("client.nj")
    public static boolean[] field694 = new boolean[5];

    @ObfuscatedName("client.nk")
    public static int[] field695 = new int[5];

    @ObfuscatedName("client.nn")
    public static int[] field696 = new int[5];

    @ObfuscatedName("client.ng")
    public static int[] field697 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field685 = new int[5];

    @ObfuscatedName("client.ol")
    public static int field699 = 0;

    @ObfuscatedName("client.ok")
    public static int field700 = 0;

    @ObfuscatedName("client.os")
    public static class23[] field576 = new class23[200];

    @ObfuscatedName("client.oj")
    public static class173 field702 = new class173();

    @ObfuscatedName("client.of")
    public static int field634 = 0;

    @ObfuscatedName("client.ou")
    public static class11[] field704 = new class11[100];

    @ObfuscatedName("client.on")
    public static class163 field705 = new class163();

    @ObfuscatedName("client.om")
    public static int field655 = -1;

    @ObfuscatedName("client.ow")
    public static int field707 = -1;

    @ObfuscatedName("client.k(I)V")
    public final void method250() {
    }

    public final void init() {
        if (!this.method1437()) {
            return;
        }
        class167[] var1 = class167.method2264();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class167 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2773);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2773)) {
                    case 1:
                        field446 = Integer.parseInt(var4);
                        break;
                    case 2:
                        Statics.field2307 = class132.method1996(Integer.parseInt(var4));
                        break;
                    case 3:
                        class133[] var5 = new class133[] { class133.field2053, class133.field2046, class133.field2051, class133.field2047, class133.field2045, class133.field2048 };
                        Statics.field1158 = (class133) class113.method1371(var5, Integer.parseInt(var4));
                        if (Statics.field1158 == class133.field2053) {
                            Statics.field448 = class186.field2862;
                        } else {
                            Statics.field448 = class186.field2859;
                        }
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                            field449 = true;
                        } else {
                            field449 = false;
                        }
                        break;
                    case 5:
                        Statics.field1256 = var4;
                    case 6:
                    default:
                        break;
                    case 7:
                        field451 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field459 = Integer.parseInt(var4);
                        break;
                    case 9:
                        if (var4.equalsIgnoreCase(class2.field23)) {
                        }
                }
            }
        }
        class95.field1533 = false;
        field450 = false;
        Statics.field375 = this.getCodeBase().getHost();
        String var6 = Statics.field2307.field2042;
        byte var7 = 0;
        try {
            class82.method520("oldschool", var6, var7, 16);
        } catch (Exception var9) {
            class80.method2341((String) null, var9);
        }
        Statics.field444 = this;
        this.method1396(765, 503, 15);
    }

    @ObfuscatedName("client.q(I)V")
    public final void method469() {
        Statics.field443 = field459 == 0 ? 43594 : field446 + 40000;
        Statics.field227 = field459 == 0 ? 443 : field446 + 50000;
        Statics.field618 = Statics.field443;
        Statics.field2717 = class161.field2705;
        Statics.field2719 = class161.field2702;
        Statics.field1415 = class161.field2704;
        Statics.field2333 = class161.field2703;
        class75.method652();
        Canvas var1 = Statics.field831;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class75.field1338);
        var1.addFocusListener(class75.field1338);
        class77.method35(Statics.field831);
        Statics.field51 = class66.method187();
        if (Statics.field51 != null) {
            Statics.field51.method1325(Statics.field831);
        }
        Statics.field2286 = new class71(255, class82.field1406, class82.field1407, 500000);
        Statics.field1825 = class12.method610();
        if (field459 != 0) {
            field460 = true;
        }
    }

    @ObfuscatedName("client.j(B)V")
    public final void method254() {
        field668++;
        this.method257();
        while (true) {
            class177 var1 = class157.field2560;
            class156 var2;
            synchronized (class157.field2560) {
                var2 = (class156) class157.field2562.method3279();
            }
            if (var2 == null) {
                class138.method1482();
                Statics.method132();
                class75.method560();
                class77.method222();
                if (Statics.field51 != null) {
                    int var4 = Statics.field51.method1327();
                    field643 = var4;
                }
                if (field452 == 0) {
                    method606();
                    Statics.field2038.method1318();
                    for (int var5 = 0; var5 < 32; var5++) {
                        field1297[var5] = 0L;
                    }
                    for (int var6 = 0; var6 < 32; var6++) {
                        field1296[var6] = 0L;
                    }
                    Statics.field340 = 0;
                } else if (field452 == 5) {
                    class21.method880(this);
                    method606();
                    Statics.field2038.method1318();
                    for (int var7 = 0; var7 < 32; var7++) {
                        field1297[var7] = 0L;
                    }
                    for (int var8 = 0; var8 < 32; var8++) {
                        field1296[var8] = 0L;
                    }
                    Statics.field340 = 0;
                } else if (field452 == 10) {
                    class21.method880(this);
                } else if (field452 == 20) {
                    class21.method880(this);
                    method229();
                } else if (field452 == 25) {
                    method109();
                }
                if (field452 == 30) {
                    if (field475 > 1) {
                        field475--;
                    }
                    if (field492 > 0) {
                        field492--;
                    }
                    if (field496) {
                        field496 = false;
                        method2890();
                    } else {
                        for (int var9 = 0; var9 < 100; var9++) {
                            boolean var10;
                            if (Statics.field1244 == null) {
                                var10 = false;
                            } else {
                                label2819: {
                                    try {
                                        int var11 = Statics.field1244.method1355();
                                        if (var11 == 0) {
                                            var10 = false;
                                            break label2819;
                                        }
                                        if (field489 == -1) {
                                            Statics.field1244.method1369(field487.field2015, 0, 1);
                                            field487.field2008 = 0;
                                            field489 = field487.method2276();
                                            field488 = class165.field2744[field489];
                                            var11--;
                                        }
                                        if (field488 == -1) {
                                            if (var11 <= 0) {
                                                var10 = false;
                                                break label2819;
                                            }
                                            Statics.field1244.method1369(field487.field2015, 0, 1);
                                            field488 = field487.field2015[0] & 0xFF;
                                            var11--;
                                        }
                                        if (field488 == -2) {
                                            if (var11 <= 1) {
                                                var10 = false;
                                                break label2819;
                                            }
                                            Statics.field1244.method1369(field487.field2015, 0, 2);
                                            field487.field2008 = 0;
                                            field488 = field487.method2539();
                                            var11 -= 2;
                                        }
                                        if (var11 < field488) {
                                            var10 = false;
                                            break label2819;
                                        }
                                        field487.field2008 = 0;
                                        Statics.field1244.method1369(field487.field2015, 0, field488);
                                        field490 = 0;
                                        field645 = field494;
                                        field494 = field493;
                                        field493 = field489;
                                        if (field489 == 50) {
                                            Statics.field243 = field487.method2434();
                                            Statics.field109 = field487.method2434();
                                            while (field487.field2008 < field488) {
                                                field489 = field487.method2484();
                                                method1156();
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 10) {
                                            int var12 = field487.method2451();
                                            class158 var13 = class158.method220(var12);
                                            for (int var14 = 0; var14 < var13.field2675.length; var14++) {
                                                var13.field2675[var14] = -1;
                                                var13.field2675[var14] = 0;
                                            }
                                            method2272(var13);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 162) {
                                            field462 = field487.method2484();
                                            if (field462 == 1) {
                                                field463 = field487.method2539();
                                            }
                                            if (field462 >= 2 && field462 <= 6) {
                                                if (field462 == 2) {
                                                    field637 = 64;
                                                    field693 = 64;
                                                }
                                                if (field462 == 3) {
                                                    field637 = 0;
                                                    field693 = 64;
                                                }
                                                if (field462 == 4) {
                                                    field637 = 128;
                                                    field693 = 64;
                                                }
                                                if (field462 == 5) {
                                                    field637 = 64;
                                                    field693 = 0;
                                                }
                                                if (field462 == 6) {
                                                    field637 = 64;
                                                    field693 = 128;
                                                }
                                                field462 = 2;
                                                field465 = field487.method2539();
                                                field454 = field487.method2539();
                                                field467 = field487.method2484();
                                            }
                                            if (field462 == 10) {
                                                field481 = field487.method2539();
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 23) {
                                            int var15 = field487.method2443();
                                            class19 var16 = (class19) class19.field256.method3259((long) var15);
                                            if (var16 != null) {
                                                var16.method3301();
                                            }
                                            field594[++field648 - 1 & 0x1F] = var15 & 0x7FFF;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 220) {
                                            field475 = field487.method2539() * 30;
                                            field553 = field630;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 153) {
                                            field691 = field630;
                                            if (field488 == 0) {
                                                field672 = null;
                                                field646 = null;
                                                Statics.field360 = 0;
                                                Statics.field1434 = null;
                                                field489 = -1;
                                                var10 = true;
                                                break label2819;
                                            }
                                            field646 = field487.method2571();
                                            long var17 = field487.method2554();
                                            long var19 = var17;
                                            String var21;
                                            if (var17 <= 0L || var17 >= 6582952005840035281L) {
                                                var21 = null;
                                            } else if (var17 % 37L == 0L) {
                                                var21 = null;
                                            } else {
                                                int var22 = 0;
                                                for (long var23 = var17; var23 != 0L; var23 /= 37L) {
                                                    var22++;
                                                }
                                                StringBuilder var25 = new StringBuilder(var22);
                                                while (var19 != 0L) {
                                                    long var26 = var19;
                                                    var19 /= 37L;
                                                    var25.append(class146.field2433[(int) (var26 - var19 * 37L)]);
                                                }
                                                var21 = var25.reverse().toString();
                                            }
                                            field672 = var21;
                                            Statics.field55 = field487.method2411();
                                            int var28 = field487.method2484();
                                            if (var28 == 255) {
                                                field489 = -1;
                                                var10 = true;
                                                break label2819;
                                            }
                                            Statics.field360 = var28;
                                            class8[] var29 = new class8[100];
                                            for (int var30 = 0; var30 < Statics.field360; var30++) {
                                                var29[var30] = new class8();
                                                var29[var30].field116 = field487.method2571();
                                                var29[var30].field105 = Statics.method201(var29[var30].field116, Statics.field448);
                                                var29[var30].field107 = field487.method2539();
                                                var29[var30].field108 = field487.method2411();
                                                field487.method2571();
                                                if (var29[var30].field116.equals(Statics.field714.field39)) {
                                                    Statics.field2457 = var29[var30].field108;
                                                }
                                            }
                                            boolean var31 = false;
                                            int var32 = Statics.field360;
                                            while (var32 > 0) {
                                                boolean var33 = true;
                                                var32--;
                                                for (int var34 = 0; var34 < var32; var34++) {
                                                    if (var29[var34].field105.compareTo(var29[var34 + 1].field105) > 0) {
                                                        class8 var35 = var29[var34];
                                                        var29[var34] = var29[var34 + 1];
                                                        var29[var34 + 1] = var35;
                                                        var33 = false;
                                                    }
                                                }
                                                if (var33) {
                                                    break;
                                                }
                                            }
                                            Statics.field1434 = var29;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 13) {
                                            int var36 = field487.method2539();
                                            if (var36 == 65535) {
                                                var36 = -1;
                                            }
                                            int var37 = field487.method2539();
                                            if (var37 == 65535) {
                                                var37 = -1;
                                            }
                                            int var38 = field487.method2451();
                                            int var39 = field487.method2415();
                                            for (int var40 = var36; var40 <= var37; var40++) {
                                                long var41 = ((long) var39 << 32) + (long) var40;
                                                class179 var43 = field647.method3259(var41);
                                                if (var43 != null) {
                                                    var43.method3301();
                                                }
                                                field647.method3253(new class171(var38), var41);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 45) {
                                            method48();
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 148) {
                                            int var44 = field487.method2443();
                                            field607 = var44;
                                            method2175(var44);
                                            class26.method2627(field607);
                                            for (int var45 = 0; var45 < 100; var45++) {
                                                field650[var45] = true;
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 139) {
                                            field476 = false;
                                            for (int var46 = 0; var46 < 5; var46++) {
                                                field694[var46] = false;
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 48) {
                                            for (int var47 = 0; var47 < Statics.field1010; var47++) {
                                                class42 var48 = (class42) class42.field1011.method3196((long) var47);
                                                class42 var49;
                                                if (var48 == null) {
                                                    byte[] var50 = Statics.field1013.method2920(16, var47);
                                                    class42 var51 = new class42();
                                                    if (var50 != null) {
                                                        var51.method874(new class127(var50));
                                                    }
                                                    class42.field1011.method3197(var51, (long) var47);
                                                    var49 = var51;
                                                } else {
                                                    var49 = var48;
                                                }
                                                if (var49 != null && var49.field1019 == 0) {
                                                    class159.field2691[var47] = 0;
                                                    class159.field2696[var47] = 0;
                                                }
                                            }
                                            method21();
                                            field632 += 32;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 214) {
                                            byte var53 = field487.method2551();
                                            int var54 = field487.method2443();
                                            class159.field2691[var54] = var53;
                                            if (class159.field2696[var54] != var53) {
                                                class159.field2696[var54] = var53;
                                                method221(var54);
                                            }
                                            field631[++field632 - 1 & 0x1F] = var54;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 39) {
                                            while (field487.field2008 < field488) {
                                                boolean var55 = field487.method2484() == 1;
                                                String var56 = field487.method2571();
                                                String var57 = field487.method2571();
                                                int var58 = field487.method2539();
                                                int var59 = field487.method2484();
                                                int var60 = field487.method2484();
                                                boolean var61 = (var60 & 0x2) != 0;
                                                boolean var62 = (var60 & 0x1) != 0;
                                                if (var58 > 0) {
                                                    field487.method2571();
                                                    field487.method2484();
                                                    field487.method2415();
                                                }
                                                field487.method2571();
                                                for (int var63 = 0; var63 < field699; var63++) {
                                                    class23 var64 = field576[var63];
                                                    if (var55) {
                                                        if (var57.equals(var64.field330)) {
                                                            var64.field330 = var56;
                                                            var64.field338 = var57;
                                                            var56 = null;
                                                            break;
                                                        }
                                                    } else if (var56.equals(var64.field330)) {
                                                        if (var64.field332 != var58) {
                                                            boolean var65 = true;
                                                            for (class28 var66 = (class28) field702.method3230(); var66 != null; var66 = (class28) field702.method3234()) {
                                                                if (var66.field712.equals(var56)) {
                                                                    if (var58 != 0 && var66.field713 == 0) {
                                                                        var66.method3294();
                                                                        var65 = false;
                                                                    } else if (var58 == 0 && var66.field713 != 0) {
                                                                        var66.method3294();
                                                                        var65 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var65) {
                                                                field702.method3229(new class28(var56, var58));
                                                            }
                                                            var64.field332 = var58;
                                                        }
                                                        var64.field338 = var57;
                                                        var64.field333 = var59;
                                                        var64.field334 = var61;
                                                        var64.field335 = var62;
                                                        var56 = null;
                                                        break;
                                                    }
                                                }
                                                if (var56 != null && field699 < 200) {
                                                    class23 var67 = new class23();
                                                    field576[field699] = var67;
                                                    var67.field330 = var56;
                                                    var67.field338 = var57;
                                                    var67.field332 = var58;
                                                    var67.field333 = var59;
                                                    var67.field334 = var61;
                                                    var67.field335 = var62;
                                                    field699++;
                                                }
                                            }
                                            field700 = 2;
                                            field638 = field630;
                                            boolean var68 = false;
                                            int var69 = field699;
                                            while (var69 > 0) {
                                                boolean var70 = true;
                                                var69--;
                                                for (int var71 = 0; var71 < var69; var71++) {
                                                    boolean var72 = false;
                                                    class23 var73 = field576[var71];
                                                    class23 var74 = field576[var71 + 1];
                                                    if (field446 != var73.field332 && field446 == var74.field332) {
                                                        var72 = true;
                                                    }
                                                    if (!var72 && var73.field332 == 0 && var74.field332 != 0) {
                                                        var72 = true;
                                                    }
                                                    if (!var72 && !var73.field334 && var74.field334) {
                                                        var72 = true;
                                                    }
                                                    if (!var72 && !var73.field335 && var74.field335) {
                                                        var72 = true;
                                                    }
                                                    if (var72) {
                                                        class23 var75 = field576[var71];
                                                        field576[var71] = field576[var71 + 1];
                                                        field576[var71 + 1] = var75;
                                                        var70 = false;
                                                    }
                                                }
                                                if (var70) {
                                                    break;
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 121) {
                                            String var76 = field487.method2571();
                                            int var77 = field487.method2484();
                                            int var78 = field487.method2484();
                                            if (var78 >= 1 && var78 <= 8) {
                                                if (var76.equalsIgnoreCase("null")) {
                                                    var76 = null;
                                                }
                                                field577[var78 - 1] = var76;
                                                field578[var78 - 1] = var77 == 0;
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 132) {
                                            field476 = true;
                                            Statics.field2368 = field487.method2484();
                                            Statics.field929 = field487.method2484();
                                            Statics.field440 = field487.method2539();
                                            Statics.field111 = field487.method2484();
                                            Statics.field322 = field487.method2484();
                                            if (Statics.field322 >= 100) {
                                                int var79 = Statics.field2368 * 128 + 64;
                                                int var80 = Statics.field929 * 128 + 64;
                                                int var81 = method1500(var79, var80, Statics.field1310) - Statics.field440;
                                                int var82 = var79 - Statics.field881;
                                                int var83 = var81 - Statics.field1428;
                                                int var84 = var80 - Statics.field114;
                                                int var85 = (int) Math.sqrt((double) (var82 * var82 + var84 * var84));
                                                Statics.field1412 = (int) (Math.atan2((double) var83, (double) var85) * 325.949D) & 0x7FF;
                                                Statics.field110 = (int) (Math.atan2((double) var82, (double) var84) * -325.949D) & 0x7FF;
                                                if (Statics.field1412 < 128) {
                                                    Statics.field1412 = 128;
                                                }
                                                if (Statics.field1412 > 383) {
                                                    Statics.field1412 = 383;
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 141) {
                                            if (field607 != -1) {
                                                method5(field607, 0);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 94) {
                                            method21();
                                            field612 = field487.method2484();
                                            field553 = field630;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 90) {
                                            field709 = field487.method2484();
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 135) {
                                            int var86 = field487.method2441();
                                            int var87 = field487.method2539();
                                            int var88 = field487.method2415();
                                            class158 var89 = class158.method220(var88);
                                            var89.field2617 = (var87 << 16) + var86;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 216) {
                                            int var90 = field487.method2484();
                                            class137[] var91 = class137.method2002();
                                            int var92 = 0;
                                            class137 var94;
                                            while (true) {
                                                if (var92 >= var91.length) {
                                                    var94 = null;
                                                    break;
                                                }
                                                class137 var93 = var91[var92];
                                                if (var93.field2303 == var90) {
                                                    var94 = var93;
                                                    break;
                                                }
                                                var92++;
                                            }
                                            Statics.field1781 = var94;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 86) {
                                            int var95 = field487.method2449();
                                            int var96 = field487.method2442();
                                            class158 var97 = class158.method220(var95);
                                            if (var97.field2667 != 1 || var97.field2606 != var96) {
                                                var97.field2667 = 1;
                                                var97.field2606 = var96;
                                                method2272(var97);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 145) {
                                            int var98 = field487.method2539();
                                            int var99 = field487.method2484();
                                            int var100 = field487.method2539();
                                            Statics.method2351(var98, var99, var100);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 176) {
                                            int var101 = field487.method2415();
                                            class158 var102 = class158.method220(var101);
                                            var102.field2667 = 3;
                                            var102.field2606 = Statics.field714.field28.method3114();
                                            method2272(var102);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 202) {
                                            String var103 = field487.method2571();
                                            Object[] var104 = new Object[var103.length() + 1];
                                            for (int var105 = var103.length() - 1; var105 >= 0; var105--) {
                                                if (var103.charAt(var105) == 's') {
                                                    var104[var105 + 1] = field487.method2571();
                                                } else {
                                                    var104[var105 + 1] = Integer.valueOf(field487.method2415());
                                                }
                                            }
                                            var104[0] = Integer.valueOf(field487.method2415());
                                            class1 var106 = new class1();
                                            var106.field1 = var104;
                                            class26.method161(var106);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 119) {
                                            for (int var107 = 0; var107 < field566.length; var107++) {
                                                if (field566[var107] != null) {
                                                    field566[var107].field411 = -1;
                                                }
                                            }
                                            for (int var108 = 0; var108 < field482.length; var108++) {
                                                if (field482[var108] != null) {
                                                    field482[var108].field411 = -1;
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 60) {
                                            String var109 = field487.method2571();
                                            int var110 = field487.method2450();
                                            class158 var111 = class158.method220(var110);
                                            if (!var109.equals(var111.field2624)) {
                                                var111.field2624 = var109;
                                                method2272(var111);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 7) {
                                            int var112 = field487.method2484();
                                            int var113 = field487.method2484();
                                            int var114 = field487.method2484();
                                            int var115 = field487.method2484();
                                            field694[var112] = true;
                                            field695[var112] = var113;
                                            field696[var112] = var114;
                                            field697[var112] = var115;
                                            field685[var112] = 0;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 77) {
                                            method213(false);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 144) {
                                            field700 = 1;
                                            field638 = field630;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 73) {
                                            field574 = 0;
                                            field569 = 0;
                                            Statics.method204();
                                            method1999();
                                            for (int var116 = 0; var116 < field569; var116++) {
                                                int var117 = field670[var116];
                                                class25 var118 = field482[var117];
                                                int var119 = field487.method2484();
                                                if ((var119 & 0x40) != 0) {
                                                    int var120 = field487.method2432();
                                                    int var121 = field487.method2432();
                                                    var118.method235(var120, var121, field668);
                                                    var118.field402 = field668 + 300;
                                                    var118.field427 = field487.method2484();
                                                    var118.field426 = field487.method2432();
                                                }
                                                if ((var119 & 0x4) != 0) {
                                                    var118.field354 = Statics.method1391(field487.method2441());
                                                    var118.field433 = var118.field354.field749;
                                                    var118.field432 = var118.field354.field772;
                                                    var118.field390 = var118.field354.field779;
                                                    var118.field412 = var118.field354.field743;
                                                    var118.field442 = var118.field354.field762;
                                                    var118.field403 = var118.field354.field758;
                                                    var118.field387 = var118.field354.field752;
                                                    var118.field388 = var118.field354.field767;
                                                    var118.field389 = var118.field354.field771;
                                                }
                                                if ((var119 & 0x1) != 0) {
                                                    var118.field405 = field487.method2539();
                                                    if (var118.field405 == 65535) {
                                                        var118.field405 = -1;
                                                    }
                                                }
                                                if ((var119 & 0x10) != 0) {
                                                    int var122 = field487.method2442();
                                                    if (var122 == 65535) {
                                                        var122 = -1;
                                                    }
                                                    int var123 = field487.method2434();
                                                    if (var118.field411 == var122 && var122 != -1) {
                                                        int var124 = class34.method516(var122).field863;
                                                        if (var124 == 1) {
                                                            var118.field398 = 0;
                                                            var118.field415 = 0;
                                                            var118.field414 = var123;
                                                            var118.field386 = 0;
                                                        }
                                                        if (var124 == 2) {
                                                            var118.field386 = 0;
                                                        }
                                                    } else if (var122 == -1 || var118.field411 == -1 || class34.method516(var122).field858 >= class34.method516(var118.field411).field858) {
                                                        var118.field411 = var122;
                                                        var118.field398 = 0;
                                                        var118.field415 = 0;
                                                        var118.field414 = var123;
                                                        var118.field386 = 0;
                                                        var118.field438 = var118.field434;
                                                    }
                                                }
                                                if ((var119 & 0x20) != 0) {
                                                    var118.field395 = field487.method2571();
                                                    var118.field396 = 100;
                                                }
                                                if ((var119 & 0x80) != 0) {
                                                    var118.field416 = field487.method2539();
                                                    int var125 = field487.method2449();
                                                    var118.field392 = var125 >> 16;
                                                    var118.field419 = (var125 & 0xFFFF) + field668;
                                                    var118.field417 = 0;
                                                    var118.field418 = 0;
                                                    if (var118.field419 > field668) {
                                                        var118.field417 = -1;
                                                    }
                                                    if (var118.field416 == 65535) {
                                                        var118.field416 = -1;
                                                    }
                                                }
                                                if ((var119 & 0x8) != 0) {
                                                    var118.field406 = field487.method2442();
                                                    var118.field407 = field487.method2443();
                                                }
                                                if ((var119 & 0x2) != 0) {
                                                    int var126 = field487.method2433();
                                                    int var127 = field487.method2484();
                                                    var118.method235(var126, var127, field668);
                                                    var118.field402 = field668 + 300;
                                                    var118.field427 = field487.method2434();
                                                    var118.field426 = field487.method2433();
                                                }
                                            }
                                            for (int var128 = 0; var128 < field574; var128++) {
                                                int var129 = field538[var128];
                                                if (field668 != field482[var129].field424) {
                                                    field482[var129].field354 = null;
                                                    field482[var129] = null;
                                                }
                                            }
                                            if (field488 != field487.field2008) {
                                                throw new RuntimeException(field487.field2008 + class2.field18 + field488);
                                            }
                                            for (int var130 = 0; var130 < field483; var130++) {
                                                if (field482[field484[var130]] == null) {
                                                    throw new RuntimeException(var130 + class2.field18 + field483);
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 72) {
                                            String var131 = field487.method2571();
                                            long var132 = field487.method2554();
                                            long var134 = (long) field487.method2539();
                                            long var136 = (long) field487.method2403();
                                            int var138 = field487.method2484();
                                            long var139 = (var134 << 32) + var136;
                                            boolean var141 = false;
                                            for (int var142 = 0; var142 < 100; var142++) {
                                                if (field666[var142] == var139) {
                                                    var141 = true;
                                                    break;
                                                }
                                            }
                                            if (var138 <= 1 && Statics.method713(var131)) {
                                                var141 = true;
                                            }
                                            if (!var141 && field565 == 0) {
                                                field666[field573] = var139;
                                                field573 = (field573 + 1) % 100;
                                                String var143 = class185.method3326(class147.method519(class184.method2634(field487)));
                                                if (var138 == 2 || var138 == 3) {
                                                    method536(9, class2.method1291(1) + var131, var143, class146.method2261(var132));
                                                } else if (var138 == 1) {
                                                    method536(9, class2.method1291(0) + var131, var143, class146.method2261(var132));
                                                } else {
                                                    method536(9, var131, var143, class146.method2261(var132));
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 8) {
                                            int var144 = field487.method2539();
                                            int var145 = field487.method2415();
                                            int var146 = var144 >> 10 & 0x1F;
                                            int var147 = var144 >> 5 & 0x1F;
                                            int var148 = var144 & 0x1F;
                                            int var149 = (var148 << 3) + (var146 << 19) + (var147 << 11);
                                            class158 var150 = class158.method220(var145);
                                            if (var150.field2590 != var149) {
                                                var150.field2590 = var149;
                                                method2272(var150);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 237) {
                                            field679 = 0;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 158) {
                                            int var151 = field487.method2517();
                                            int var152 = field487.method2450();
                                            int var153 = field487.method2479();
                                            class158 var154 = class158.method220(var152);
                                            int var155 = var154.field2597 + var151;
                                            int var156 = var154.field2581 + var153;
                                            if (var154.field2578 != var155 || var154.field2579 != var156) {
                                                var154.field2578 = var155;
                                                var154.field2579 = var156;
                                                method2272(var154);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 126) {
                                            int var157 = field487.method2415();
                                            int var158 = field487.method2539();
                                            if (var157 < -70000) {
                                                var158 += 32768;
                                            }
                                            class158 var159;
                                            if (var157 >= 0) {
                                                var159 = class158.method220(var157);
                                            } else {
                                                var159 = null;
                                            }
                                            if (var159 != null) {
                                                for (int var160 = 0; var160 < var159.field2675.length; var160++) {
                                                    var159.field2675[var160] = 0;
                                                    var159.field2676[var160] = 0;
                                                }
                                            }
                                            class19.method1392(var158);
                                            int var161 = field487.method2539();
                                            for (int var162 = 0; var162 < var161; var162++) {
                                                int var163 = field487.method2433();
                                                if (var163 == 255) {
                                                    var163 = field487.method2451();
                                                }
                                                int var164 = field487.method2443();
                                                if (var159 != null && var162 < var159.field2675.length) {
                                                    var159.field2675[var162] = var164;
                                                    var159.field2676[var162] = var163;
                                                }
                                                class19.method1810(var158, var162, var164 - 1, var163);
                                            }
                                            if (var159 != null) {
                                                method2272(var159);
                                            }
                                            method21();
                                            field594[++field648 - 1 & 0x1F] = var158 & 0x7FFF;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 16) {
                                            int var165 = field487.method2451();
                                            Statics.field1900 = Statics.field1301.method1463(var165);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 218) {
                                            boolean var166 = field487.method2434() == 1;
                                            int var167 = field487.method2449();
                                            class158 var168 = class158.method220(var167);
                                            if (var168.field2683 != var166) {
                                                var168.field2683 = var166;
                                                method2272(var168);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 28) {
                                            int var169 = field487.method2415();
                                            class4 var170 = (class4) field608.method3259((long) var169);
                                            if (var170 != null) {
                                                method1293(var170, true);
                                            }
                                            if (field611 != null) {
                                                method2272(field611);
                                                field611 = null;
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 213) {
                                            int var171 = field487.method2442();
                                            if (var171 == 65535) {
                                                var171 = -1;
                                            }
                                            method1240(var171);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 203) {
                                            int var172 = field487.method2403();
                                            int var173 = field487.method2539();
                                            if (var173 == 65535) {
                                                var173 = -1;
                                            }
                                            if (field682 != 0 && var173 != -1) {
                                                class138.method2342(Statics.field1700, var173, 0, field682, false);
                                                field684 = true;
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 166) {
                                            class182.method3188(field487, field488);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 186) {
                                            int var174 = field487.method2484();
                                            int var175 = field487.method2434();
                                            int var176 = field487.method2433();
                                            Statics.field1310 = var174 >> 1;
                                            Statics.field714.method230(var175, var176, (var174 & 0x1) == 1);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 114) {
                                            int var177 = field487.method2441();
                                            int var178 = field487.method2539();
                                            int var179 = field487.method2443();
                                            int var180 = field487.method2450();
                                            class158 var181 = class158.method220(var180);
                                            if (var181.field2613 != var179 || var181.field2614 != var177 || var181.field2616 != var178) {
                                                var181.field2613 = var179;
                                                var181.field2614 = var177;
                                                var181.field2616 = var178;
                                                method2272(var181);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 208) {
                                            field476 = true;
                                            Statics.field2044 = field487.method2484();
                                            Statics.field56 = field487.method2484();
                                            Statics.field312 = field487.method2539();
                                            Statics.field1283 = field487.method2484();
                                            Statics.field1262 = field487.method2484();
                                            if (Statics.field1262 >= 100) {
                                                Statics.field881 = Statics.field2044 * 128 + 64;
                                                Statics.field114 = Statics.field56 * 128 + 64;
                                                Statics.field1428 = method1500(Statics.field881, Statics.field114, Statics.field1310) - Statics.field312;
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 6) {
                                            String var182 = field487.method2571();
                                            if (var182.endsWith(":tradereq:")) {
                                                String var183 = var182.substring(0, var182.indexOf(":"));
                                                boolean var184 = false;
                                                if (Statics.method713(var183)) {
                                                    var184 = true;
                                                }
                                                if (!var184 && field565 == 0) {
                                                    method3033(4, var183, class134.field2239);
                                                }
                                            } else if (var182.endsWith(":duelreq:")) {
                                                String var185 = var182.substring(0, var182.indexOf(":"));
                                                boolean var186 = false;
                                                if (Statics.method713(var185)) {
                                                    var186 = true;
                                                }
                                                if (!var186 && field565 == 0) {
                                                    method3033(8, var185, class134.field2191);
                                                }
                                            } else if (var182.endsWith(":chalreq:")) {
                                                String var187 = var182.substring(0, var182.indexOf(":"));
                                                boolean var188 = false;
                                                if (Statics.method713(var187)) {
                                                    var188 = true;
                                                }
                                                if (!var188 && field565 == 0) {
                                                    String var189 = var182.substring(var182.indexOf(":") + 1, var182.length() - 9);
                                                    method3033(8, var187, var189);
                                                }
                                            } else if (var182.endsWith(":assistreq:")) {
                                                String var190 = var182.substring(0, var182.indexOf(":"));
                                                boolean var191 = false;
                                                if (Statics.method713(var190)) {
                                                    var191 = true;
                                                }
                                                if (!var191 && field565 == 0) {
                                                    method3033(10, var190, "");
                                                }
                                            } else if (var182.endsWith(":clan:")) {
                                                String var192 = var182.substring(0, var182.indexOf(":clan:"));
                                                method3033(11, "", var192);
                                            } else if (var182.endsWith(":trade:")) {
                                                String var193 = var182.substring(0, var182.indexOf(":trade:"));
                                                if (field565 == 0) {
                                                    method3033(12, "", var193);
                                                }
                                            } else if (var182.endsWith(":assist:")) {
                                                String var194 = var182.substring(0, var182.indexOf(":assist:"));
                                                if (field565 == 0) {
                                                    method3033(13, "", var194);
                                                }
                                            } else {
                                                method3033(0, "", var182);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 46) {
                                            for (int var195 = 0; var195 < class159.field2696.length; var195++) {
                                                if (class159.field2696[var195] != class159.field2691[var195]) {
                                                    class159.field2696[var195] = class159.field2691[var195];
                                                    method221(var195);
                                                    field631[++field632 - 1 & 0x1F] = var195;
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 125) {
                                            int var196 = field487.method2415();
                                            int var197 = field487.method2443();
                                            class159.field2691[var197] = var196;
                                            if (class159.field2696[var197] != var196) {
                                                class159.field2696[var197] = var196;
                                                method221(var197);
                                            }
                                            field631[++field632 - 1 & 0x1F] = var197;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 133) {
                                            String var198 = field487.method2571();
                                            long var199 = (long) field487.method2539();
                                            long var201 = (long) field487.method2403();
                                            int var203 = field487.method2484();
                                            long var204 = (var199 << 32) + var201;
                                            boolean var206 = false;
                                            for (int var207 = 0; var207 < 100; var207++) {
                                                if (field666[var207] == var204) {
                                                    var206 = true;
                                                    break;
                                                }
                                            }
                                            if (Statics.method713(var198)) {
                                                var206 = true;
                                            }
                                            if (!var206 && field565 == 0) {
                                                field666[field573] = var204;
                                                field573 = (field573 + 1) % 100;
                                                String var208 = class185.method3326(class147.method519(class184.method2634(field487)));
                                                if (var203 == 2 || var203 == 3) {
                                                    method3033(7, class2.method1291(1) + var198, var208);
                                                } else if (var203 == 1) {
                                                    method3033(7, class2.method1291(0) + var198, var208);
                                                } else {
                                                    method3033(3, var198, var208);
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 42) {
                                            int var209 = field487.method2415();
                                            int var210 = field487.method2539();
                                            if (var209 < -70000) {
                                                var210 += 32768;
                                            }
                                            class158 var211;
                                            if (var209 >= 0) {
                                                var211 = class158.method220(var209);
                                            } else {
                                                var211 = null;
                                            }
                                            while (field487.field2008 < field488) {
                                                int var212 = field487.method2437();
                                                int var213 = field487.method2539();
                                                int var214 = 0;
                                                if (var213 != 0) {
                                                    var214 = field487.method2484();
                                                    if (var214 == 255) {
                                                        var214 = field487.method2415();
                                                    }
                                                }
                                                if (var211 != null && var212 >= 0 && var212 < var211.field2675.length) {
                                                    var211.field2675[var212] = var213;
                                                    var211.field2676[var212] = var214;
                                                }
                                                class19.method1810(var210, var212, var213 - 1, var214);
                                            }
                                            if (var211 != null) {
                                                method2272(var211);
                                            }
                                            method21();
                                            field594[++field648 - 1 & 0x1F] = var210 & 0x7FFF;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 234) {
                                            method188();
                                            field489 = -1;
                                            var10 = false;
                                            break label2819;
                                        }
                                        if (field489 == 171) {
                                            while (field487.field2008 < field488) {
                                                int var215 = field487.method2484();
                                                boolean var216 = (var215 & 0x1) == 1;
                                                String var217 = field487.method2571();
                                                String var218 = field487.method2571();
                                                field487.method2571();
                                                for (int var219 = 0; var219 < field634; var219++) {
                                                    class11 var220 = field704[var219];
                                                    if (var216) {
                                                        if (var218.equals(var220.field170)) {
                                                            var220.field170 = var217;
                                                            var220.field171 = var218;
                                                            var217 = null;
                                                            break;
                                                        }
                                                    } else if (var217.equals(var220.field170)) {
                                                        var220.field170 = var217;
                                                        var220.field171 = var218;
                                                        var217 = null;
                                                        break;
                                                    }
                                                }
                                                if (var217 != null && field634 < 100) {
                                                    class11 var221 = new class11();
                                                    field704[field634] = var221;
                                                    var221.field170 = var217;
                                                    var221.field171 = var218;
                                                    field634++;
                                                }
                                            }
                                            field638 = field630;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 44) {
                                            int var222 = field488 + field487.field2008;
                                            int var223 = field487.method2539();
                                            int var224 = field487.method2539();
                                            if (field607 != var223) {
                                                field607 = var223;
                                                method2175(field607);
                                                class26.method2627(field607);
                                                for (int var225 = 0; var225 < 100; var225++) {
                                                    field650[var225] = true;
                                                }
                                            }
                                            while (var224-- > 0) {
                                                int var226 = field487.method2415();
                                                int var227 = field487.method2539();
                                                int var228 = field487.method2484();
                                                class4 var229 = (class4) field608.method3259((long) var226);
                                                if (var229 != null && var229.field60 != var227) {
                                                    method1293(var229, true);
                                                    var229 = null;
                                                }
                                                if (var229 == null) {
                                                    class4 var230 = new class4();
                                                    var230.field60 = var227;
                                                    var230.field52 = var228;
                                                    field608.method3253(var230, (long) var226);
                                                    method2175(var227);
                                                    class26.method2627(var227);
                                                    class158 var231 = class158.method220(var226);
                                                    if (var231 != null) {
                                                        method2272(var231);
                                                    }
                                                    if (field611 != null) {
                                                        method2272(field611);
                                                        field611 = null;
                                                    }
                                                    field572 = false;
                                                    field590 = 0;
                                                    method162(Statics.field635, Statics.field1180, Statics.field1497, Statics.field1972);
                                                    if (field607 != -1) {
                                                        method5(field607, 1);
                                                    }
                                                    var229 = var230;
                                                }
                                                var229.field53 = true;
                                            }
                                            for (class4 var233 = (class4) field608.method3248(); var233 != null; var233 = (class4) field608.method3247()) {
                                                if (var233.field53) {
                                                    var233.field53 = false;
                                                } else {
                                                    method1293(var233, true);
                                                }
                                            }
                                            field647 = new class175(512);
                                            while (field487.field2008 < var222) {
                                                int var234 = field487.method2415();
                                                int var235 = field487.method2539();
                                                int var236 = field487.method2539();
                                                int var237 = field487.method2415();
                                                for (int var238 = var235; var238 <= var236; var238++) {
                                                    long var239 = ((long) var234 << 32) + (long) var238;
                                                    field647.method3253(new class171(var237), var239);
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 152) {
                                            int var241 = field487.method2449();
                                            int var242 = field487.method2517();
                                            class158 var243 = class158.method220(var241);
                                            if (var243.field2609 != var242 || var242 == -1) {
                                                var243.field2609 = var242;
                                                var243.field2679 = 0;
                                                var243.field2629 = 0;
                                                method2272(var243);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 41 || field489 == 192 || field489 == 245 || field489 == 204 || field489 == 159 || field489 == 138 || field489 == 123 || field489 == 33 || field489 == 163 || field489 == 107 || field489 == 17) {
                                            method1156();
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 253) {
                                            int var244 = field487.method2433();
                                            int var245 = field487.method2450();
                                            int var246 = field487.method2443();
                                            class4 var247 = (class4) field608.method3259((long) var245);
                                            if (var247 != null) {
                                                method1293(var247, var247.field60 != var246);
                                            }
                                            class4 var248 = new class4();
                                            var248.field60 = var246;
                                            var248.field52 = var244;
                                            field608.method3253(var248, (long) var245);
                                            method2175(var246);
                                            class26.method2627(var246);
                                            class158 var249 = class158.method220(var245);
                                            if (var249 != null) {
                                                method2272(var249);
                                            }
                                            if (field611 != null) {
                                                method2272(field611);
                                                field611 = null;
                                            }
                                            field572 = false;
                                            field590 = 0;
                                            method162(Statics.field635, Statics.field1180, Statics.field1497, Statics.field1972);
                                            if (field607 != -1) {
                                                method5(field607, 1);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 210) {
                                            int var250 = field487.method2441();
                                            int var251 = field487.method2415();
                                            class158 var252 = class158.method220(var251);
                                            if (var252.field2667 != 2 || var252.field2606 != var250) {
                                                var252.field2667 = 2;
                                                var252.field2606 = var250;
                                                method2272(var252);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 157) {
                                            field664 = field487.method2484();
                                            field665 = field487.method2484();
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 70) {
                                            Statics.field109 = field487.method2433();
                                            Statics.field243 = field487.method2434();
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 129) {
                                            field487.field2008 += 28;
                                            if (field487.method2431()) {
                                                class116 var253 = field487;
                                                int var254 = field487.field2008 - 28;
                                                if (class82.field1414 != null) {
                                                    try {
                                                        class82.field1414.method553(0L);
                                                        class82.field1414.method558(var253.field2015, var254, 24);
                                                    } catch (Exception var386) {
                                                    }
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 174) {
                                            Statics.field243 = field487.method2433();
                                            Statics.field109 = field487.method2433();
                                            for (int var256 = Statics.field243; var256 < Statics.field243 + 8; var256++) {
                                                for (int var257 = Statics.field109; var257 < Statics.field109 + 8; var257++) {
                                                    if (field639[Statics.field1310][var256][var257] != null) {
                                                        field639[Statics.field1310][var256][var257] = null;
                                                        method2633(var256, var257);
                                                    }
                                                }
                                            }
                                            for (class22 var258 = (class22) field581.method3280(); var258 != null; var258 = (class22) field581.method3269()) {
                                                if (var258.field329 >= Statics.field243 && var258.field329 < Statics.field243 + 8 && var258.field317 >= Statics.field109 && var258.field317 < Statics.field109 + 8 && Statics.field1310 == var258.field321) {
                                                    var258.field325 = 0;
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 43) {
                                            String var259 = field487.method2571();
                                            String var260 = class185.method3326(class147.method519(class184.method2634(field487)));
                                            method3033(6, var259, var260);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 221) {
                                            method21();
                                            int var261 = field487.method2433();
                                            int var262 = field487.method2484();
                                            int var263 = field487.method2450();
                                            field586[var261] = var263;
                                            field584[var261] = var262;
                                            field585[var261] = 1;
                                            for (int var264 = 0; var264 < 98; var264++) {
                                                if (var263 >= class130.field2023[var264]) {
                                                    field585[var261] = var264 + 2;
                                                }
                                            }
                                            field518[++field564 - 1 & 0x1F] = var261;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 232) {
                                            method213(true);
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 9) {
                                            String var265 = field487.method2571();
                                            int var266 = field487.method2539();
                                            byte var267 = field487.method2411();
                                            boolean var268 = false;
                                            if (var267 == -128) {
                                                var268 = true;
                                            }
                                            if (var268) {
                                                if (Statics.field360 == 0) {
                                                    field489 = -1;
                                                    var10 = true;
                                                    break label2819;
                                                }
                                                boolean var269 = false;
                                                int var270;
                                                for (var270 = 0; var270 < Statics.field360 && (!Statics.field1434[var270].field116.equals(var265) || Statics.field1434[var270].field107 != var266); var270++) {
                                                }
                                                if (var270 < Statics.field360) {
                                                    while (var270 < Statics.field360 - 1) {
                                                        Statics.field1434[var270] = Statics.field1434[var270 + 1];
                                                        var270++;
                                                    }
                                                    Statics.field360--;
                                                    Statics.field1434[Statics.field360] = null;
                                                }
                                            } else {
                                                field487.method2571();
                                                class8 var271 = new class8();
                                                var271.field116 = var265;
                                                var271.field105 = Statics.method201(var271.field116, Statics.field448);
                                                var271.field107 = var266;
                                                var271.field108 = var267;
                                                int var272;
                                                for (var272 = Statics.field360 - 1; var272 >= 0; var272--) {
                                                    int var273 = Statics.field1434[var272].field105.compareTo(var271.field116);
                                                    if (var273 == 0) {
                                                        Statics.field1434[var272].field107 = var266;
                                                        Statics.field1434[var272].field108 = var267;
                                                        if (var265.equals(Statics.field714.field39)) {
                                                            Statics.field2457 = var267;
                                                        }
                                                        field691 = field630;
                                                        field489 = -1;
                                                        var10 = true;
                                                        break label2819;
                                                    }
                                                    if (var273 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field360 >= Statics.field1434.length) {
                                                    field489 = -1;
                                                    var10 = true;
                                                    break label2819;
                                                }
                                                for (int var274 = Statics.field360 - 1; var274 > var272; var274--) {
                                                    Statics.field1434[var274 + 1] = Statics.field1434[var274];
                                                }
                                                if (Statics.field360 == 0) {
                                                    Statics.field1434 = new class8[100];
                                                }
                                                Statics.field1434[var272 + 1] = var271;
                                                Statics.field360++;
                                                if (var265.equals(Statics.field714.field39)) {
                                                    Statics.field2457 = var267;
                                                }
                                            }
                                            field691 = field630;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 18) {
                                            int var275 = field487.method2442();
                                            if (var275 == 65535) {
                                                var275 = -1;
                                            }
                                            int var276 = field487.method2451();
                                            int var277 = field487.method2449();
                                            class158 var278 = class158.method220(var277);
                                            if (var278.field2572) {
                                                var278.field2592 = var275;
                                                var278.field2682 = var276;
                                                class40 var280 = class40.method125(var275);
                                                var278.field2613 = var280.field997;
                                                var278.field2614 = var280.field967;
                                                var278.field2654 = var280.field971;
                                                var278.field2611 = var280.field969;
                                                var278.field2598 = var280.field979;
                                                var278.field2616 = var280.field983;
                                                if (var278.field2582 > 0) {
                                                    var278.field2616 = var278.field2616 * 32 / var278.field2582;
                                                }
                                                method2272(var278);
                                            } else {
                                                if (var275 == -1) {
                                                    var278.field2667 = 0;
                                                    field489 = -1;
                                                    var10 = true;
                                                    break label2819;
                                                }
                                                class40 var279 = class40.method125(var275);
                                                var278.field2667 = 4;
                                                var278.field2606 = var275;
                                                var278.field2613 = var279.field997;
                                                var278.field2614 = var279.field967;
                                                var278.field2616 = var279.field983 * 100 / var276;
                                                method2272(var278);
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 80) {
                                            method21();
                                            field613 = field487.method2517();
                                            field553 = field630;
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        if (field489 == 180) {
                                            int var281 = field487.method2443();
                                            int var282 = field487.method2451();
                                            class158 var283 = class158.method220(var282);
                                            if (var283 != null && var283.field2575 == 0) {
                                                if (var281 > var283.field2589 - var283.field2583) {
                                                    var281 = var283.field2589 - var283.field2583;
                                                }
                                                if (var281 < 0) {
                                                    var281 = 0;
                                                }
                                                if (var283.field2580 != var281) {
                                                    var283.field2580 = var281;
                                                    method2272(var283);
                                                }
                                            }
                                            field489 = -1;
                                            var10 = true;
                                            break label2819;
                                        }
                                        class80.method2341("" + field489 + class2.field18 + field494 + class2.field18 + field645 + class2.field18 + field488, (Throwable) null);
                                        method188();
                                    } catch (IOException var389) {
                                        method2890();
                                    } catch (Exception var390) {
                                        String var286 = "" + field489 + class2.field18 + field494 + class2.field18 + field645 + class2.field18 + field488 + class2.field18 + (Statics.field497 + Statics.field714.field420[0]) + class2.field18 + (Statics.field904 + Statics.field714.field436[0]) + class2.field18;
                                        for (int var287 = 0; var287 < field488 && var287 < 50; var287++) {
                                            var286 = var286 + field487.field2015[var287] + class2.field18;
                                        }
                                        class80.method2341(var286, var390);
                                        method188();
                                    }
                                    var10 = true;
                                }
                            }
                            if (!var10) {
                                break;
                            }
                        }
                        if (field452 == 30) {
                            class182.method3189(field485, 238);
                            Object var288 = Statics.field2781.field229;
                            synchronized (Statics.field2781.field229) {
                                if (!field445) {
                                    Statics.field2781.field230 = 0;
                                } else if (class77.field1370 != 0 || Statics.field2781.field230 >= 40) {
                                    field485.method2275(231);
                                    field485.method2396(0);
                                    int var289 = field485.field2008;
                                    int var290 = 0;
                                    for (int var291 = 0; var291 < Statics.field2781.field230 && field485.field2008 - var289 < 240; var291++) {
                                        var290++;
                                        int var292 = Statics.field2781.field232[var291];
                                        if (var292 < 0) {
                                            var292 = 0;
                                        } else if (var292 > 502) {
                                            var292 = 502;
                                        }
                                        int var293 = Statics.field2781.field231[var291];
                                        if (var293 < 0) {
                                            var293 = 0;
                                        } else if (var293 > 764) {
                                            var293 = 764;
                                        }
                                        int var294 = var292 * 765 + var293;
                                        if (Statics.field2781.field232[var291] == -1 && Statics.field2781.field231[var291] == -1) {
                                            var293 = -1;
                                            var292 = -1;
                                            var294 = 524287;
                                        }
                                        if (field456 != var293 || field457 != var292) {
                                            int var295 = var293 - field456;
                                            field456 = var293;
                                            int var296 = var292 - field457;
                                            field457 = var292;
                                            if (field701 < 8 && var295 >= -32 && var295 <= 31 && var296 >= -32 && var296 <= 31) {
                                                var295 += 32;
                                                var296 += 32;
                                                field485.method2397((field701 << 12) + (var295 << 6) + var296);
                                                field701 = 0;
                                            } else if (field701 < 8) {
                                                field485.method2398((field701 << 19) + 8388608 + var294);
                                                field701 = 0;
                                            } else {
                                                field485.method2470((field701 << 19) + -1073741824 + var294);
                                                field701 = 0;
                                            }
                                        } else if (field701 < 2047) {
                                            field701++;
                                        }
                                    }
                                    field485.method2492(field485.field2008 - var289);
                                    if (var290 >= Statics.field2781.field230) {
                                        Statics.field2781.field230 = 0;
                                    } else {
                                        Statics.field2781.field230 -= var290;
                                        for (int var297 = 0; var297 < Statics.field2781.field230; var297++) {
                                            Statics.field2781.field231[var297] = Statics.field2781.field231[var290 + var297];
                                            Statics.field2781.field232[var297] = Statics.field2781.field232[var290 + var297];
                                        }
                                    }
                                }
                            }
                            if (class77.field1370 != 0) {
                                long var299 = (class77.field1374 - field622) / 50L;
                                if (var299 > 4095L) {
                                    var299 = 4095L;
                                }
                                field622 = class77.field1374;
                                int var301 = class77.field1369;
                                if (var301 < 0) {
                                    var301 = 0;
                                } else if (var301 > 502) {
                                    var301 = 502;
                                }
                                int var302 = class77.field1372;
                                if (var302 < 0) {
                                    var302 = 0;
                                } else if (var302 > 764) {
                                    var302 = 764;
                                }
                                int var303 = var301 * 765 + var302;
                                byte var304 = 0;
                                if (class77.field1370 == 2) {
                                    var304 = 1;
                                }
                                int var305 = (int) var299;
                                field485.method2275(182);
                                field485.method2470((var304 << 19) + (var305 << 20) + var303);
                            }
                            if (class75.field1335 > 0) {
                                field485.method2275(153);
                                field485.method2397(0);
                                int var306 = field485.field2008;
                                long var307 = class121.method2636();
                                for (int var309 = 0; var309 < class75.field1335; var309++) {
                                    long var310 = var307 - field671;
                                    if (var310 > 16777215L) {
                                        var310 = 16777215L;
                                    }
                                    field671 = var307;
                                    field485.method2567(class75.field1328[var309]);
                                    field485.method2445((int) var310);
                                }
                                field485.method2406(field485.field2008 - var306);
                            }
                            if (field536 > 0) {
                                field536--;
                            }
                            if (class75.field1331[96] || class75.field1331[97] || class75.field1331[98] || class75.field1331[99]) {
                                field537 = true;
                            }
                            if (field537 && field536 <= 0) {
                                field536 = 20;
                                field537 = false;
                                field485.method2275(21);
                                field485.method2397(field533);
                                field485.method2466(field458);
                            }
                            if (Statics.field1278 && !field486) {
                                field486 = true;
                                field485.method2275(175);
                                field485.method2396(1);
                            }
                            if (!Statics.field1278 && field486) {
                                field486 = false;
                                field485.method2275(175);
                                field485.method2396(0);
                            }
                            method165();
                            if (field452 == 30) {
                                for (class22 var312 = (class22) field581.method3280(); var312 != null; var312 = (class22) field581.method3269()) {
                                    if (var312.field325 > 0) {
                                        var312.field325--;
                                    }
                                    if (var312.field325 != 0) {
                                        if (var312.field324 > 0) {
                                            var312.field324--;
                                        }
                                        if (var312.field324 == 0 && var312.field329 >= 1 && var312.field317 >= 1 && var312.field329 <= 102 && var312.field317 <= 102 && (var312.field319 < 0 || class9.method38(var312.field319, var312.field323))) {
                                            Statics.method216(var312.field321, var312.field315, var312.field329, var312.field317, var312.field319, var312.field314, var312.field323);
                                            var312.field324 = -1;
                                            if (var312.field319 == var312.field318 && var312.field318 == -1) {
                                                var312.method3301();
                                            } else if (var312.field319 == var312.field318 && var312.field327 == var312.field314 && var312.field323 == var312.field320) {
                                                var312.method3301();
                                            }
                                        }
                                    } else if (var312.field318 < 0 || class9.method38(var312.field318, var312.field320)) {
                                        Statics.method216(var312.field321, var312.field315, var312.field329, var312.field317, var312.field318, var312.field327, var312.field320);
                                        var312.method3301();
                                    }
                                }
                                method2856();
                                field490++;
                                if (field490 <= 750) {
                                    method135();
                                    method782();
                                    for (int var313 = -1; var313 < field683; var313++) {
                                        int var314;
                                        if (var313 == -1) {
                                            var314 = 2047;
                                        } else {
                                            var314 = field568[var313];
                                        }
                                        class3 var315 = field566[var314];
                                        if (var315 != null && var315.field396 > 0) {
                                            var315.field396--;
                                            if (var315.field396 == 0) {
                                                var315.field395 = null;
                                            }
                                        }
                                    }
                                    for (int var316 = 0; var316 < field483; var316++) {
                                        int var317 = field484[var316];
                                        class25 var318 = field482[var317];
                                        if (var318 != null && var318.field396 > 0) {
                                            var318.field396--;
                                            if (var318.field396 == 0) {
                                                var318.field395 = null;
                                            }
                                        }
                                    }
                                    field525++;
                                    if (field667 != 0) {
                                        field550 += 20;
                                        if (field550 >= 400) {
                                            field667 = 0;
                                        }
                                    }
                                    if (Statics.field249 != null) {
                                        field600++;
                                        if (field600 >= 15) {
                                            method2272(Statics.field249);
                                            Statics.field249 = null;
                                        }
                                    }
                                    if (Statics.field372 != null) {
                                        method2272(Statics.field372);
                                        field583++;
                                        if (class77.field1373 > field560 + 5 || class77.field1373 < field560 - 5 || class77.field1366 > field561 + 5 || class77.field1366 < field561 - 5) {
                                            field563 = true;
                                        }
                                        if (class77.field1377 == 0) {
                                            if (!field563 || field583 < 5) {
                                                label2895: {
                                                    label1955: {
                                                        if (field587 != 1) {
                                                            int var327 = field590 - 1;
                                                            boolean var328;
                                                            if (var327 < 0) {
                                                                var328 = false;
                                                            } else {
                                                                int var329 = field593[var327];
                                                                if (var329 >= 2000) {
                                                                    var329 -= 2000;
                                                                }
                                                                if (var329 == 1007) {
                                                                    var328 = true;
                                                                } else {
                                                                    var328 = false;
                                                                }
                                                            }
                                                            if (!var328) {
                                                                break label1955;
                                                            }
                                                        }
                                                        if (field590 > 2) {
                                                            method143();
                                                            break label2895;
                                                        }
                                                    }
                                                    if (field590 > 0) {
                                                        method2647(field590 - 1);
                                                    }
                                                }
                                            } else if (Statics.field48 == Statics.field372 && field686 != field559) {
                                                class158 var319 = Statics.field372;
                                                byte var320 = 0;
                                                if (field626 == 1 && var319.field2577 == 206) {
                                                    var320 = 1;
                                                }
                                                if (var319.field2675[field686] <= 0) {
                                                    var320 = 0;
                                                }
                                                int var321 = method712(var319);
                                                boolean var322 = (var321 >> 29 & 0x1) != 0;
                                                if (var322) {
                                                    int var323 = field559;
                                                    int var324 = field686;
                                                    var319.field2675[var324] = var319.field2675[var323];
                                                    var319.field2676[var324] = var319.field2676[var323];
                                                    var319.field2675[var323] = -1;
                                                    var319.field2676[var323] = 0;
                                                } else if (var320 == 1) {
                                                    int var325 = field559;
                                                    int var326 = field686;
                                                    while (var325 != var326) {
                                                        if (var325 > var326) {
                                                            var319.method3047(var325 - 1, var325);
                                                            var325--;
                                                        } else if (var325 < var326) {
                                                            var319.method3047(var325 + 1, var325);
                                                            var325++;
                                                        }
                                                    }
                                                } else {
                                                    var319.method3047(field686, field559);
                                                }
                                                field485.method2275(114);
                                                field485.method2439(field686);
                                                field485.method2446(Statics.field372.field2620);
                                                field485.method2499(field559);
                                                field485.method2567(var320);
                                            }
                                            field600 = 10;
                                            class77.field1370 = 0;
                                            Statics.field372 = null;
                                        }
                                    }
                                    class158 var330 = Statics.field441;
                                    class158 var331 = Statics.field78;
                                    Statics.field441 = null;
                                    Statics.field78 = null;
                                    field677 = null;
                                    field692 = false;
                                    field623 = false;
                                    field555 = 0;
                                    while (true) {
                                        class75 var332 = class75.field1338;
                                        boolean var333;
                                        synchronized (class75.field1338) {
                                            if (class75.field1345 == class75.field1343) {
                                                var333 = false;
                                            } else {
                                                Statics.field1230 = class75.field1341[class75.field1343];
                                                Statics.field1017 = class75.field1339[class75.field1343];
                                                class75.field1343 = class75.field1343 + 1 & 0x7F;
                                                var333 = true;
                                            }
                                        }
                                        if (!var333 || field555 >= 128) {
                                            method134(field607, 0, 0, 765, 503, 0, 0);
                                            field630++;
                                            while (true) {
                                                class1 var335;
                                                class158 var336;
                                                class158 var337;
                                                do {
                                                    var335 = (class1) field523.method3279();
                                                    if (var335 == null) {
                                                        while (true) {
                                                            class1 var338;
                                                            class158 var339;
                                                            class158 var340;
                                                            do {
                                                                var338 = (class1) field617.method3279();
                                                                if (var338 == null) {
                                                                    while (true) {
                                                                        class1 var341;
                                                                        class158 var342;
                                                                        class158 var343;
                                                                        do {
                                                                            var341 = (class1) field644.method3279();
                                                                            if (var341 == null) {
                                                                                if (field512 != null) {
                                                                                    method2272(field512);
                                                                                    Statics.field2820++;
                                                                                    if (field692 && field623) {
                                                                                        int var344 = class77.field1373;
                                                                                        int var345 = class77.field1366;
                                                                                        int var346 = var344 - field562;
                                                                                        int var347 = var345 - field621;
                                                                                        if (var346 < field624) {
                                                                                            var346 = field624;
                                                                                        }
                                                                                        if (field512.field2582 + var346 > field624 + field619.field2582) {
                                                                                            var346 = field624 + field619.field2582 - field512.field2582;
                                                                                        }
                                                                                        if (var347 < field625) {
                                                                                            var347 = field625;
                                                                                        }
                                                                                        if (field512.field2583 + var347 > field625 + field619.field2583) {
                                                                                            var347 = field625 + field619.field2583 - field512.field2583;
                                                                                        }
                                                                                        int var348 = var346 - field627;
                                                                                        int var349 = var347 - field505;
                                                                                        int var350 = field512.field2636;
                                                                                        if (Statics.field2820 > field512.field2571 && (var348 > var350 || var348 < -var350 || var349 > var350 || var349 < -var350)) {
                                                                                            field629 = true;
                                                                                        }
                                                                                        int var351 = field619.field2586 + (var346 - field624);
                                                                                        int var352 = field619.field2580 + (var347 - field625);
                                                                                        if (field512.field2649 != null && field629) {
                                                                                            class1 var353 = new class1();
                                                                                            var353.field3 = field512;
                                                                                            var353.field4 = var351;
                                                                                            var353.field16 = var352;
                                                                                            var353.field1 = field512.field2649;
                                                                                            class26.method161(var353);
                                                                                        }
                                                                                        if (class77.field1377 == 0) {
                                                                                            if (field629) {
                                                                                                if (field512.field2567 != null) {
                                                                                                    class1 var354 = new class1();
                                                                                                    var354.field3 = field512;
                                                                                                    var354.field4 = var351;
                                                                                                    var354.field16 = var352;
                                                                                                    var354.field2 = field677;
                                                                                                    var354.field1 = field512.field2567;
                                                                                                    class26.method161(var354);
                                                                                                }
                                                                                                if (field677 != null && method576(field512) != null) {
                                                                                                    field485.method2275(61);
                                                                                                    field485.method2470(field512.field2620);
                                                                                                    field485.method2466(field512.field2601);
                                                                                                    field485.method2466(field677.field2601);
                                                                                                    field485.method2467(field677.field2620);
                                                                                                }
                                                                                            } else if ((field587 == 1 || Statics.method121(field590 - 1)) && field590 > 2) {
                                                                                                method143();
                                                                                            } else if (field590 > 0) {
                                                                                                method2647(field590 - 1);
                                                                                            }
                                                                                            field512 = null;
                                                                                        }
                                                                                    } else if (Statics.field2820 > 1) {
                                                                                        field512 = null;
                                                                                    }
                                                                                }
                                                                                if (class95.field1564 != -1) {
                                                                                    int var355 = class95.field1564;
                                                                                    int var356 = class95.field1565;
                                                                                    boolean var357 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var355, var356, true, 0, 0, 0, 0, 0, 0);
                                                                                    class95.field1564 = -1;
                                                                                    if (var357) {
                                                                                        field520 = class77.field1372;
                                                                                        field554 = class77.field1369;
                                                                                        field667 = 1;
                                                                                        field550 = 0;
                                                                                    }
                                                                                }
                                                                                if (Statics.field372 == null && field512 == null) {
                                                                                    int var358 = class77.field1370;
                                                                                    if (field572) {
                                                                                        if (var358 != 1) {
                                                                                            int var359 = class77.field1373;
                                                                                            int var360 = class77.field1366;
                                                                                            if (var359 < Statics.field635 - 10 || var359 > Statics.field635 + Statics.field1497 + 10 || var360 < Statics.field1180 - 10 || var360 > Statics.field1972 + Statics.field1180 + 10) {
                                                                                                field572 = false;
                                                                                                method162(Statics.field635, Statics.field1180, Statics.field1497, Statics.field1972);
                                                                                            }
                                                                                        }
                                                                                        if (var358 == 1) {
                                                                                            int var361 = Statics.field635;
                                                                                            int var362 = Statics.field1180;
                                                                                            int var363 = Statics.field1497;
                                                                                            int var364 = class77.field1372;
                                                                                            int var365 = class77.field1369;
                                                                                            int var366 = -1;
                                                                                            for (int var367 = 0; var367 < field590; var367++) {
                                                                                                int var368 = (field590 - 1 - var367) * 15 + var362 + 31;
                                                                                                if (var364 > var361 && var364 < var361 + var363 && var365 > var368 - 13 && var365 < var368 + 3) {
                                                                                                    var366 = var367;
                                                                                                }
                                                                                            }
                                                                                            if (var366 != -1) {
                                                                                                method2647(var366);
                                                                                            }
                                                                                            field572 = false;
                                                                                            method162(Statics.field635, Statics.field1180, Statics.field1497, Statics.field1972);
                                                                                        }
                                                                                    } else {
                                                                                        label2869: {
                                                                                            int var370;
                                                                                            int var371;
                                                                                            label2889: {
                                                                                                if (var358 == 1 && field590 > 0) {
                                                                                                    int var369 = field593[field590 - 1];
                                                                                                    if (var369 == 39 || var369 == 40 || var369 == 41 || var369 == 42 || var369 == 43 || var369 == 33 || var369 == 34 || var369 == 35 || var369 == 36 || var369 == 37 || var369 == 38 || var369 == 1005) {
                                                                                                        var370 = field687[field590 - 1];
                                                                                                        var371 = field592[field590 - 1];
                                                                                                        class158 var372 = class158.method220(var371);
                                                                                                        if (class162.method1208(method712(var372))) {
                                                                                                            break label2889;
                                                                                                        }
                                                                                                        int var373 = method712(var372);
                                                                                                        boolean var374 = (var373 >> 29 & 0x1) != 0;
                                                                                                        if (var374) {
                                                                                                            break label2889;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (var358 == 1 && (field587 == 1 && field590 > 2 || Statics.method121(field590 - 1))) {
                                                                                                    var358 = 2;
                                                                                                }
                                                                                                if (var358 == 1 && field590 > 0) {
                                                                                                    method2647(field590 - 1);
                                                                                                }
                                                                                                if (var358 == 2 && field590 > 0) {
                                                                                                    method143();
                                                                                                }
                                                                                                break label2869;
                                                                                            }
                                                                                            field563 = false;
                                                                                            field583 = 0;
                                                                                            if (Statics.field372 != null) {
                                                                                                method2272(Statics.field372);
                                                                                            }
                                                                                            Statics.field372 = class158.method220(var371);
                                                                                            field559 = var370;
                                                                                            field560 = class77.field1372;
                                                                                            field561 = class77.field1369;
                                                                                            method2272(Statics.field372);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                if (Statics.field441 != var330) {
                                                                                    if (var330 != null) {
                                                                                        method2272(var330);
                                                                                    }
                                                                                    if (Statics.field441 != null) {
                                                                                        method2272(Statics.field441);
                                                                                    }
                                                                                }
                                                                                if (Statics.field78 != var331 && field599 == field447) {
                                                                                    if (var331 != null) {
                                                                                        method2272(var331);
                                                                                    }
                                                                                    if (Statics.field78 != null) {
                                                                                        method2272(Statics.field78);
                                                                                    }
                                                                                }
                                                                                if (Statics.field78 == null) {
                                                                                    if (field599 > 0) {
                                                                                        field599--;
                                                                                    }
                                                                                } else if (field599 < field447) {
                                                                                    field599++;
                                                                                    if (field599 == field447) {
                                                                                        method2272(Statics.field78);
                                                                                    }
                                                                                }
                                                                                method2792();
                                                                                if (field476) {
                                                                                    method2624();
                                                                                }
                                                                                for (int var375 = 0; var375 < 5; var375++) {
                                                                                    int var10002 = field685[var375]++;
                                                                                }
                                                                                int var376 = ++class77.field1360 - 1;
                                                                                int var378 = class75.field1346;
                                                                                if (var376 > 15000 && var378 > 15000) {
                                                                                    field492 = 250;
                                                                                    class77.method1(14500);
                                                                                    field485.method2275(184);
                                                                                }
                                                                                field680++;
                                                                                if (field680 > 500) {
                                                                                    field680 = 0;
                                                                                    int var380 = (int) (Math.random() * 8.0D);
                                                                                    if ((var380 & 0x1) == 1) {
                                                                                        field556 += field514;
                                                                                    }
                                                                                    if ((var380 & 0x2) == 2) {
                                                                                        field466 += field516;
                                                                                    }
                                                                                    if ((var380 & 0x4) == 4) {
                                                                                        field517 += field602;
                                                                                    }
                                                                                }
                                                                                if (field556 < -50) {
                                                                                    field514 = 2;
                                                                                }
                                                                                if (field556 > 50) {
                                                                                    field514 = -2;
                                                                                }
                                                                                if (field466 < -55) {
                                                                                    field516 = 2;
                                                                                }
                                                                                if (field466 > 55) {
                                                                                    field516 = -2;
                                                                                }
                                                                                if (field517 < -40) {
                                                                                    field602 = 1;
                                                                                }
                                                                                if (field517 > 40) {
                                                                                    field602 = -1;
                                                                                }
                                                                                field524++;
                                                                                if (field524 > 500) {
                                                                                    field524 = 0;
                                                                                    int var381 = (int) (Math.random() * 8.0D);
                                                                                    if ((var381 & 0x1) == 1) {
                                                                                        field706 += field521;
                                                                                    }
                                                                                    if ((var381 & 0x2) == 2) {
                                                                                        field522 += field557;
                                                                                    }
                                                                                }
                                                                                if (field706 < -60) {
                                                                                    field521 = 2;
                                                                                }
                                                                                if (field706 > 60) {
                                                                                    field521 = -2;
                                                                                }
                                                                                if (field522 < -20) {
                                                                                    field557 = 1;
                                                                                }
                                                                                if (field522 > 10) {
                                                                                    field557 = -1;
                                                                                }
                                                                                for (class28 var382 = (class28) field702.method3230(); var382 != null; var382 = (class28) field702.method3234()) {
                                                                                    if ((long) var382.field716 < class121.method2636() / 1000L - 5L) {
                                                                                        if (var382.field713 > 0) {
                                                                                            method3033(5, "", var382.field712 + class134.field2170);
                                                                                        }
                                                                                        if (var382.field713 == 0) {
                                                                                            method3033(5, "", var382.field712 + class134.field2193);
                                                                                        }
                                                                                        var382.method3294();
                                                                                    }
                                                                                }
                                                                                field528++;
                                                                                if (field528 > 50) {
                                                                                    field485.method2275(105);
                                                                                }
                                                                                try {
                                                                                    if (Statics.field1244 != null && field485.field2008 > 0) {
                                                                                        Statics.field1244.method1357(field485.field2015, 0, field485.field2008);
                                                                                        field485.field2008 = 0;
                                                                                        field528 = 0;
                                                                                        return;
                                                                                    }
                                                                                } catch (IOException var384) {
                                                                                    method2890();
                                                                                }
                                                                                return;
                                                                            }
                                                                            var342 = var341.field3;
                                                                            if (var342.field2601 < 0) {
                                                                                break;
                                                                            }
                                                                            var343 = class158.method220(var342.field2585);
                                                                        } while (var343 == null || var343.field2681 == null || var342.field2601 >= var343.field2681.length || var343.field2681[var342.field2601] != var342);
                                                                        class26.method161(var341);
                                                                    }
                                                                }
                                                                var339 = var338.field3;
                                                                if (var339.field2601 < 0) {
                                                                    break;
                                                                }
                                                                var340 = class158.method220(var339.field2585);
                                                            } while (var340 == null || var340.field2681 == null || var339.field2601 >= var340.field2681.length || var340.field2681[var339.field2601] != var339);
                                                            class26.method161(var338);
                                                        }
                                                    }
                                                    var336 = var335.field3;
                                                    if (var336.field2601 < 0) {
                                                        break;
                                                    }
                                                    var337 = class158.method220(var336.field2585);
                                                } while (var337 == null || var337.field2681 == null || var336.field2601 >= var337.field2681.length || var337.field2681[var336.field2601] != var336);
                                                class26.method161(var335);
                                            }
                                        }
                                        field491[field555] = Statics.field1230;
                                        field669[field555] = Statics.field1017;
                                        field555++;
                                    }
                                } else if (field492 > 0) {
                                    method188();
                                } else {
                                    Statics.method2148(40);
                                    Statics.field1205 = Statics.field1244;
                                    Statics.field1244 = null;
                                }
                            }
                        }
                    }
                } else if (field452 == 40) {
                    method229();
                }
                return;
            }
            var2.field2558.method3007(var2.field2551, (int) var2.field2816, var2.field2552, false);
        }
    }

    @ObfuscatedName("client.v(I)V")
    public final void method255() {
        boolean var1;
        label213: {
            try {
                if (class138.field2315 == 2) {
                    if (Statics.field15 == null) {
                        Statics.field15 = class139.method2672(Statics.field2384, Statics.field1436, Statics.field2316);
                        if (Statics.field15 == null) {
                            var1 = false;
                            break label213;
                        }
                    }
                    if (Statics.field2318 == null) {
                        Statics.field2318 = new class58(Statics.field2319, Statics.field2312);
                    }
                    if (Statics.field2313.method2689(Statics.field15, Statics.field2314, Statics.field2318, 22050)) {
                        Statics.field2313.method2690();
                        Statics.field2313.method2687(Statics.field2330);
                        Statics.field2313.method2692(Statics.field15, Statics.field2043);
                        class138.field2315 = 0;
                        Statics.field15 = null;
                        Statics.field2318 = null;
                        Statics.field2384 = null;
                        var1 = true;
                        break label213;
                    }
                }
            } catch (Exception var32) {
                var32.printStackTrace();
                Statics.field2313.method2771();
                class138.field2315 = 0;
                Statics.field15 = null;
                Statics.field2318 = null;
                Statics.field2384 = null;
            }
            var1 = false;
        }
        if (var1 && field684 && Statics.field2373 != null) {
            Statics.field2373.method1126();
        }
        if (field1294) {
            Canvas var4 = Statics.field831;
            var4.removeKeyListener(class75.field1338);
            var4.removeFocusListener(class75.field1338);
            class75.field1342 = -1;
            Canvas var5 = Statics.field831;
            var5.removeMouseListener(class77.field1361);
            var5.removeMouseMotionListener(class77.field1361);
            var5.removeFocusListener(class77.field1361);
            class77.field1364 = 0;
            if (Statics.field51 != null) {
                Statics.field51.method1338(Statics.field831);
            }
            this.method1401();
            Canvas var6 = Statics.field831;
            var6.setFocusTraversalKeysEnabled(false);
            var6.addKeyListener(class75.field1338);
            var6.addFocusListener(class75.field1338);
            class77.method35(Statics.field831);
            if (Statics.field51 != null) {
                Statics.field51.method1325(Statics.field831);
            }
        }
        if (field452 == 0) {
            class73.method36(class21.field308, class21.field301, (Color) null);
        } else if (field452 == 5) {
            class21.method50(Statics.field1006, Statics.field356);
        } else if (field452 == 10) {
            class21.method50(Statics.field1006, Statics.field356);
        } else if (field452 == 20) {
            class21.method50(Statics.field1006, Statics.field356);
        } else if (field452 == 25) {
            if (field503 == 1) {
                if (field499 > field500) {
                    field500 = field499;
                }
                int var7 = (field500 * 50 - field499 * 50) / field500;
                method1378(class134.field2061 + class2.field17 + class2.field20 + var7 + "%" + class2.field21, false);
            } else if (field503 == 2) {
                if (field501 > field510) {
                    field510 = field501;
                }
                int var8 = (field510 * 50 - field501 * 50) / field510 + 50;
                method1378(class134.field2061 + class2.field17 + class2.field20 + var8 + "%" + class2.field21, false);
            } else {
                method1378(class134.field2061, false);
            }
        } else if (field452 == 30) {
            if (!field572) {
                field595[0] = class134.field2268;
                field596[0] = "";
                field593[0] = 1006;
                field590 = 1;
            }
            if (field607 != -1) {
                int var9 = field607;
                if (class158.method1202(var9)) {
                    method227(Statics.field2607[var9], -1);
                }
            }
            for (int var10 = 0; var10 < field681; var10++) {
                if (field650[var10]) {
                    field651[var10] = true;
                }
                field652[var10] = field650[var10];
                field650[var10] = false;
            }
            field498 = field668;
            field597 = -1;
            field598 = -1;
            Statics.field48 = null;
            if (field607 != -1) {
                field681 = 0;
                int var11 = field607;
                if (class158.method1202(var11)) {
                    Statics.field1231 = null;
                    method197(Statics.field2607[var11], -1, 0, 0, 765, 503, 0, 0, -1);
                    if (Statics.field1231 != null) {
                        method197(Statics.field1231, -1412584499, 0, 0, 765, 503, Statics.field46, Statics.field32, -1);
                        Statics.field1231 = null;
                    }
                } else {
                    for (int var12 = 0; var12 < 100; var12++) {
                        field650[var12] = true;
                    }
                }
            }
            class89.method1730();
            method122();
            if (field572) {
                int var13 = Statics.field635;
                int var14 = Statics.field1180;
                int var15 = Statics.field1497;
                int var16 = Statics.field1972;
                int var17 = 6116423;
                class89.method1767(var13, var14, var15, var16, var17);
                class89.method1767(var13 + 1, var14 + 1, var15 - 2, 16, 0);
                class89.method1739(var13 + 1, var14 + 18, var15 - 2, var16 - 19, 0);
                Statics.field1006.method3327(class134.field2163, var13 + 3, var14 + 14, var17, -1);
                int var18 = class77.field1373;
                int var19 = class77.field1366;
                for (int var20 = 0; var20 < field590; var20++) {
                    int var21 = (field590 - 1 - var20) * 15 + var14 + 31;
                    int var22 = 16777215;
                    if (var18 > var13 && var18 < var13 + var15 && var19 > var21 - 13 && var19 < var21 + 3) {
                        var22 = 16776960;
                    }
                    Statics.field1006.method3327(method2000(var20), var13 + 3, var21, var22, 0);
                }
                method2887(Statics.field635, Statics.field1180, Statics.field1497, Statics.field1972);
            } else if (field597 != -1) {
                method215(field597, field598);
            }
            if (field657 == 3) {
                for (int var23 = 0; var23 < field681; var23++) {
                    if (field652[var23]) {
                        class89.method1796(field653[var23], field654[var23], field636[var23], field662[var23], 16711935, 128);
                    } else if (field651[var23]) {
                        class89.method1796(field653[var23], field654[var23], field636[var23], field662[var23], 16711680, 128);
                    }
                }
            }
            class7.method842(Statics.field1310, Statics.field714.field399, Statics.field714.field383, field525);
            field525 = 0;
        } else if (field452 == 40) {
            method1378(class134.field2062 + class2.field17 + class134.field2063, false);
        }
        if (field452 == 30 && field657 == 0 && !field1295) {
            try {
                Graphics var24 = Statics.field831.getGraphics();
                for (int var25 = 0; var25 < field681; var25++) {
                    if (field651[var25]) {
                        Statics.field778.method1562(var24, field653[var25], field654[var25], field636[var25], field662[var25]);
                        field651[var25] = false;
                    }
                }
            } catch (Exception var31) {
                Statics.field831.repaint();
            }
        } else if (field452 > 0) {
            try {
                Graphics var27 = Statics.field831.getGraphics();
                Statics.field778.method1568(var27, 0, 0);
                field1295 = false;
                for (int var28 = 0; var28 < field681; var28++) {
                    field651[var28] = false;
                }
            } catch (Exception var30) {
                Statics.field831.repaint();
            }
        }
    }

    @ObfuscatedName("client.w(I)V")
    public final void method425() {
        if (Statics.field2781 != null) {
            Statics.field2781.field228 = false;
        }
        Statics.field2781 = null;
        if (Statics.field1244 != null) {
            Statics.field1244.method1352();
            Statics.field1244 = null;
        }
        class75.method2001();
        class77.method203();
        Statics.field51 = null;
        if (Statics.field2373 != null) {
            Statics.field2373.method1127();
        }
        if (Statics.field1014 != null) {
            Statics.field1014.method1127();
        }
        if (Statics.field2531 != null) {
            Statics.field2531.method1352();
        }
        class157.method130();
        try {
            class82.field1406.method552();
            for (int var1 = 0; var1 < Statics.field1248; var1++) {
                Statics.field2817[var1].method552();
            }
            class82.field1407.method552();
            class82.field1414.method552();
        } catch (Exception var3) {
        }
    }

    @ObfuscatedName("client.s(B)V")
    public void method257() {
        if (field452 != 1000) {
            boolean var1 = class153.method23();
            if (!var1) {
                this.method258();
            }
        }
    }

    @ObfuscatedName("client.n(I)V")
    public void method258() {
        if (class153.field2532 >= 4) {
            this.method1405("js5crc");
            field452 = 1000;
            return;
        }
        if (class153.field2515 >= 4) {
            if (field452 <= 5) {
                this.method1405("js5io");
                field452 = 1000;
                return;
            }
            field473 = 3000;
            class153.field2515 = 3;
        }
        if (--field473 + 1 > 0) {
            return;
        }
        try {
            if (field472 == 0) {
                Statics.field1898 = Statics.field1301.method1479(Statics.field375, Statics.field618);
                field472++;
            }
            if (field472 == 1) {
                if (Statics.field1898.field1379 == 2) {
                    this.method259(-1);
                    return;
                }
                if (Statics.field1898.field1379 == 1) {
                    field472++;
                }
            }
            if (field472 == 2) {
                Statics.field1315 = new class70((Socket) Statics.field1898.field1387, Statics.field1301);
                class127 var1 = new class127(5);
                var1.method2396(15);
                var1.method2470(15);
                Statics.field1315.method1357(var1.field2015, 0, 5);
                field472++;
                Statics.field1240 = class121.method2636();
            }
            if (field472 == 3) {
                if (field452 <= 5 || Statics.field1315.method1355() > 0) {
                    int var2 = Statics.field1315.method1354();
                    if (var2 != 0) {
                        this.method259(var2);
                        return;
                    }
                    field472++;
                } else if (class121.method2636() - Statics.field1240 > 30000L) {
                    this.method259(-2);
                    return;
                }
            }
            if (field472 == 4) {
                class70 var3 = Statics.field1315;
                boolean var4 = field452 > 20;
                if (Statics.field2531 != null) {
                    try {
                        Statics.field2531.method1352();
                    } catch (Exception var19) {
                    }
                    Statics.field2531 = null;
                }
                Statics.field2531 = var3;
                if (Statics.field2531 != null) {
                    try {
                        class127 var6 = new class127(4);
                        var6.method2396(var4 ? 2 : 3);
                        var6.method2398(0);
                        Statics.field2531.method1357(var6.field2015, 0, 4);
                    } catch (IOException var18) {
                        try {
                            Statics.field2531.method1352();
                        } catch (Exception var17) {
                        }
                        class153.field2515++;
                        Statics.field2531 = null;
                    }
                }
                class153.field2513.field2008 = 0;
                Statics.field366 = null;
                Statics.field2518 = null;
                class153.field2528 = 0;
                while (true) {
                    class155 var9 = (class155) class153.field2527.method3248();
                    if (var9 == null) {
                        while (true) {
                            class155 var10 = (class155) class153.field2523.method3248();
                            if (var10 == null) {
                                if (class153.field2521 != 0) {
                                    try {
                                        class127 var11 = new class127(4);
                                        var11.method2396(4);
                                        var11.method2396(class153.field2521);
                                        var11.method2397(0);
                                        Statics.field2531.method1357(var11.field2015, 0, 4);
                                    } catch (IOException var16) {
                                        try {
                                            Statics.field2531.method1352();
                                        } catch (Exception var15) {
                                        }
                                        class153.field2515++;
                                        Statics.field2531 = null;
                                    }
                                }
                                class153.field2514 = 0;
                                Statics.field2533 = class121.method2636();
                                Statics.field1898 = null;
                                Statics.field1315 = null;
                                field472 = 0;
                                field649 = 0;
                                return;
                            }
                            class153.field2520.method3211(var10);
                            class153.field2519.method3253(var10, var10.field2816);
                            class153.field2522++;
                            class153.field2524--;
                        }
                    }
                    class153.field2516.method3253(var9, var9.field2816);
                    class153.field2517++;
                    class153.field2526--;
                }
            }
        } catch (IOException var20) {
            this.method259(-3);
        }
    }

    @ObfuscatedName("client.c(II)V")
    public void method259(int arg0) {
        Statics.field1898 = null;
        Statics.field1315 = null;
        field472 = 0;
        if (Statics.field618 == Statics.field443) {
            Statics.field618 = Statics.field227;
        } else {
            Statics.field618 = Statics.field443;
        }
        field649++;
        if (field649 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field452 <= 5) {
                this.method1405("js5connect_full");
                field452 = 1000;
            } else {
                field473 = 3000;
            }
        } else if (field649 >= 2 && arg0 == 6) {
            this.method1405("js5connect_outofdate");
            field452 = 1000;
        } else if (field649 >= 4) {
            if (field452 <= 5) {
                this.method1405("js5connect");
                field452 = 1000;
            } else {
                field473 = 3000;
            }
        }
    }

    @ObfuscatedName("aj.h(I)V")
    public static void method606() {
        if (field471 == 0) {
            Statics.field106 = new class95(4, 104, 104, class9.field130);
            for (int var0 = 0; var0 < 4; var0++) {
                field504[var0] = new class164(104, 104);
            }
            Statics.field1157 = new class86(512, 512);
            class21.field301 = class134.field2198;
            class21.field308 = 5;
            field471 = 20;
        } else if (field471 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class104.field1752[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class95.method1943(var1, 500, 800, 512, 334);
            class21.field301 = class134.field2142;
            class21.field308 = 10;
            field471 = 30;
        } else if (field471 == 30) {
            Statics.field1801 = method8(0, false, true, true);
            Statics.field1353 = method8(1, false, true, true);
            Statics.field2708 = method8(2, true, false, true);
            Statics.field925 = method8(3, false, true, true);
            Statics.field1754 = method8(4, false, true, true);
            Statics.field1973 = method8(5, true, true, true);
            Statics.field474 = method8(6, true, true, false);
            Statics.field717 = method8(7, false, true, true);
            Statics.field336 = method8(8, false, true, true);
            Statics.field855 = method8(9, false, true, true);
            Statics.field1983 = method8(10, false, true, true);
            Statics.field1700 = method8(11, false, true, true);
            Statics.field815 = method8(12, false, true, true);
            Statics.field188 = method8(13, true, false, true);
            Statics.field723 = method8(14, false, true, false);
            Statics.field70 = method8(15, false, true, true);
            class21.field301 = class134.field2066;
            class21.field308 = 20;
            field471 = 40;
        } else if (field471 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1801.method3005() * 4 / 100;
            int var8 = var7 + Statics.field1353.method3005() * 4 / 100;
            int var9 = var8 + Statics.field2708.method3005() * 2 / 100;
            int var10 = var9 + Statics.field925.method3005() * 2 / 100;
            int var11 = var10 + Statics.field1754.method3005() * 6 / 100;
            int var12 = var11 + Statics.field1973.method3005() * 4 / 100;
            int var13 = var12 + Statics.field474.method3005() * 2 / 100;
            int var14 = var13 + Statics.field717.method3005() * 60 / 100;
            int var15 = var14 + Statics.field336.method3005() * 2 / 100;
            int var16 = var15 + Statics.field855.method3005() * 2 / 100;
            int var17 = var16 + Statics.field1983.method3005() * 2 / 100;
            int var18 = var17 + Statics.field1700.method3005() * 2 / 100;
            int var19 = var18 + Statics.field815.method3005() * 2 / 100;
            int var20 = var19 + Statics.field188.method3005() * 2 / 100;
            int var21 = var20 + Statics.field723.method3005() * 2 / 100;
            int var22 = var21 + Statics.field70.method3005() * 2 / 100;
            if (var22 == 100) {
                class21.field301 = class134.field2068;
                class21.field308 = 30;
                field471 = 45;
            } else {
                if (var22 != 0) {
                    class21.field301 = class134.field2110 + var22 + "%";
                }
                class21.field308 = 30;
            }
        } else if (field471 == 45) {
            boolean var23 = !field450;
            Statics.field1082 = 22050;
            Statics.field1974 = var23;
            Statics.field1068 = 2;
            class141 var24 = new class141();
            var24.method2695(9, 128);
            Statics.field2373 = class52.method2258(Statics.field1301, Statics.field831, 0, 22050);
            Statics.field2373.method1123(var24);
            class154 var25 = Statics.field70;
            class154 var26 = Statics.field723;
            class154 var27 = Statics.field1754;
            Statics.field2314 = var25;
            Statics.field2312 = var26;
            Statics.field2319 = var27;
            Statics.field2313 = var24;
            Statics.field1014 = class52.method2258(Statics.field1301, Statics.field831, 1, 2048);
            Statics.field711 = new class46();
            Statics.field1014.method1123(Statics.field711);
            Statics.field2385 = new class62(22050, Statics.field1082);
            class21.field301 = class134.field2069;
            class21.field308 = 35;
            field471 = 50;
        } else if (field471 == 50) {
            int var28 = 0;
            if (Statics.field356 == null) {
                Statics.field356 = class84.method801(Statics.field336, Statics.field188, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field63 == null) {
                Statics.field63 = class84.method801(Statics.field336, Statics.field188, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field1006 == null) {
                Statics.field1006 = class84.method801(Statics.field336, Statics.field188, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class21.field301 = class134.field2070 + var28 * 100 / 3 + "%";
                class21.field308 = 40;
            } else {
                Statics.field1525 = new class151(true);
                class21.field301 = class134.field2071;
                class21.field308 = 40;
                field471 = 60;
            }
        } else if (field471 == 60) {
            class154 var29 = Statics.field1983;
            class154 var30 = Statics.field336;
            int var31 = 0;
            if (var29.method2937("title.jpg", "")) {
                var31++;
            }
            if (var30.method2937("logo", "")) {
                var31++;
            }
            if (var30.method2937("titlebox", "")) {
                var31++;
            }
            if (var30.method2937("titlebutton", "")) {
                var31++;
            }
            if (var30.method2937("runes", "")) {
                var31++;
            }
            if (var30.method2937("title_mute", "")) {
                var31++;
            }
            var30.method2937("sl_back", "");
            var30.method2937("sl_flags", "");
            var30.method2937("sl_arrows", "");
            var30.method2937("sl_stars", "");
            var30.method2937("sl_button", "");
            byte var34 = 6;
            if (var31 < var34) {
                class21.field301 = class134.field2072 + var31 * 100 / var34 + "%";
                class21.field308 = 50;
            } else {
                class21.field301 = class134.field2273;
                class21.field308 = 50;
                Statics.method2148(5);
                field471 = 70;
            }
        } else if (field471 == 70) {
            if (Statics.field2708.method2965()) {
                class37.method33(Statics.field2708);
                class33.method2917(Statics.field2708);
                class36.method89(Statics.field2708, Statics.field717);
                class154 var36 = Statics.field2708;
                class154 var37 = Statics.field717;
                boolean var38 = field450;
                Statics.field2697 = var36;
                Statics.field1997 = var37;
                class32.field788 = var38;
                class31.method2635(Statics.field2708, Statics.field717);
                Statics.method37(Statics.field2708, Statics.field717, field449, Statics.field356);
                class34.method133(Statics.field2708, Statics.field1801, Statics.field1353);
                class154 var39 = Statics.field2708;
                class154 var40 = Statics.field717;
                Statics.field882 = var39;
                Statics.field884 = var40;
                class154 var41 = Statics.field2708;
                Statics.field2458 = var41;
                class42.method1349(Statics.field2708);
                class154 var42 = Statics.field925;
                class154 var43 = Statics.field717;
                class154 var44 = Statics.field336;
                class154 var45 = Statics.field188;
                Statics.field1352 = var42;
                Statics.field2386 = var43;
                Statics.field2432 = var44;
                Statics.field1015 = var45;
                Statics.field2607 = new class158[Statics.field1352.method2930()][];
                Statics.field803 = new boolean[Statics.field1352.method2930()];
                class41.method2(Statics.field2708);
                class154 var46 = Statics.field2708;
                Statics.field950 = var46;
                class21.field301 = class134.field2075;
                class21.field308 = 60;
                field471 = 80;
            } else {
                class21.field301 = class134.field2074 + Statics.field2708.method3023() + "%";
                class21.field308 = 60;
            }
        } else if (field471 == 80) {
            int var47 = 0;
            if (Statics.field81 == null) {
                class154 var48 = Statics.field336;
                int var49 = var48.method2934("compass");
                int var50 = var48.method2972(var49, "");
                class86 var51 = class84.method2308(var48, var49, var50);
                Statics.field81 = var51;
            } else {
                var47++;
            }
            if (Statics.field1595 == null) {
                class154 var52 = Statics.field336;
                int var53 = var52.method2934("mapedge");
                int var54 = var52.method2972(var53, "");
                class86 var55 = class84.method2308(var52, var53, var54);
                Statics.field1595 = var55;
            } else {
                var47++;
            }
            if (Statics.field127 == null) {
                Statics.field127 = class84.method676(Statics.field336, "mapscene", "");
            } else {
                var47++;
            }
            if (Statics.field2545 == null) {
                Statics.field2545 = class84.method612(Statics.field336, "mapfunction", "");
            } else {
                var47++;
            }
            if (Statics.field1804 == null) {
                Statics.field1804 = class84.method612(Statics.field336, "hitmarks", "");
            } else {
                var47++;
            }
            if (Statics.field235 == null) {
                Statics.field235 = class84.method612(Statics.field336, "headicons_pk", "");
            } else {
                var47++;
            }
            if (Statics.field1526 == null) {
                Statics.field1526 = class84.method612(Statics.field336, "headicons_prayer", "");
            } else {
                var47++;
            }
            if (Statics.field2550 == null) {
                Statics.field2550 = class84.method612(Statics.field336, "headicons_hint", "");
            } else {
                var47++;
            }
            if (Statics.field1279 == null) {
                Statics.field1279 = class84.method612(Statics.field336, "mapmarker", "");
            } else {
                var47++;
            }
            if (Statics.field2512 == null) {
                Statics.field2512 = class84.method612(Statics.field336, "cross", "");
            } else {
                var47++;
            }
            if (Statics.field737 == null) {
                Statics.field737 = class84.method612(Statics.field336, "mapdots", "");
            } else {
                var47++;
            }
            if (Statics.field754 == null) {
                Statics.field754 = class84.method676(Statics.field336, "scrollbar", "");
            } else {
                var47++;
            }
            if (Statics.field189 == null) {
                Statics.field189 = class84.method676(Statics.field336, "mod_icons", "");
            } else {
                var47++;
            }
            if (Statics.field5 == null) {
                Statics.field5 = class84.method145(Statics.field336, "mapback", "");
            } else {
                var47++;
            }
            if (var47 < 14) {
                class21.field301 = class134.field2076 + var47 * 100 / 14 + "%";
                class21.field308 = 70;
            } else {
                Statics.field2842 = Statics.field189;
                Statics.field1595.method1627();
                int var56 = (int) (Math.random() * 21.0D) - 10;
                int var57 = (int) (Math.random() * 21.0D) - 10;
                int var58 = (int) (Math.random() * 21.0D) - 10;
                int var59 = (int) (Math.random() * 41.0D) - 20;
                for (int var60 = 0; var60 < Statics.field2545.length; var60++) {
                    Statics.field2545[var60].method1626(var56 + var59, var57 + var59, var58 + var59);
                }
                Statics.field127[0].method1726(var56 + var59, var57 + var59, var58 + var59);
                Statics.field1649 = new int[33];
                Statics.field2769 = new int[33];
                Statics.field757 = new int[151];
                Statics.field236 = new int[151];
                for (int var61 = 0; var61 < 33; var61++) {
                    int var62 = 999;
                    int var63 = 0;
                    for (int var64 = 0; var64 < 34; var64++) {
                        if (Statics.field5.field1453[Statics.field5.field1454 * var61 + var64] == 0) {
                            if (var62 == 999) {
                                var62 = var64;
                            }
                        } else if (var62 != 999) {
                            var63 = var64;
                            break;
                        }
                    }
                    Statics.field1649[var61] = var62;
                    Statics.field2769[var61] = var63 - var62;
                }
                for (int var65 = 5; var65 < 156; var65++) {
                    int var66 = 999;
                    int var67 = 0;
                    for (int var68 = 25; var68 < 172; var68++) {
                        if (Statics.field5.field1453[Statics.field5.field1454 * var65 + var68] == 0 && (var68 > 34 || var65 > 34)) {
                            if (var66 == 999) {
                                var66 = var68;
                            }
                        } else if (var66 != 999) {
                            var67 = var68;
                            break;
                        }
                    }
                    Statics.field757[var65 - 5] = var66 - 25;
                    Statics.field236[var65 - 5] = var67 - var66;
                }
                class21.field301 = class134.field2199;
                class21.field308 = 70;
                field471 = 90;
            }
        } else if (field471 == 90) {
            if (Statics.field855.method2965()) {
                class110 var69 = new class110(Statics.field855, Statics.field336, 20, 0.8D, field450 ? 64 : 128);
                class104.method2105(var69);
                class104.method2121(0.8D);
                class21.field301 = class134.field2114;
                class21.field308 = 90;
                field471 = 110;
            } else {
                class21.field301 = class134.field2078 + Statics.field855.method3023() + "%";
                class21.field308 = 90;
            }
        } else if (field471 == 110) {
            Statics.field2781 = new class16();
            Statics.field1301.method1458(Statics.field2781, 10);
            class21.field301 = class134.field2263;
            class21.field308 = 94;
            field471 = 120;
        } else if (field471 == 120) {
            if (Statics.field1983.method2937("huffman", "")) {
                class120 var70 = new class120(Statics.field1983.method2970("huffman", ""));
                Statics.field2830 = var70;
                class21.field301 = class134.field2156;
                class21.field308 = 96;
                field471 = 130;
            } else {
                class21.field301 = class134.field2129 + "%";
                class21.field308 = 96;
            }
        } else if (field471 == 130) {
            if (!Statics.field925.method2965()) {
                class21.field301 = class134.field2227 + Statics.field925.method3023() * 4 / 5 + "%";
                class21.field308 = 100;
            } else if (!Statics.field815.method2965()) {
                class21.field301 = class134.field2227 + (80 + Statics.field815.method3023() / 6) + "%";
                class21.field308 = 100;
            } else if (Statics.field188.method2965()) {
                class21.field301 = class134.field2084;
                class21.field308 = 100;
                field471 = 140;
            } else {
                class21.field301 = class134.field2227 + (96 + Statics.field188.method3023() / 20) + "%";
                class21.field308 = 100;
            }
        } else if (field471 == 140) {
            Statics.method2148(10);
        }
    }

    @ObfuscatedName("k.u(IZZZB)Leq;")
    public static class154 method8(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class71 var4 = null;
        if (class82.field1406 != null) {
            var4 = new class71(arg0, class82.field1406, Statics.field2817[arg0], 1000000);
        }
        return new class154(var4, Statics.field2286, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.y(I)V")
    public static final void method229() {
        try {
            if (field591 == 0) {
                if (Statics.field1244 != null) {
                    Statics.field1244.method1352();
                    Statics.field1244 = null;
                }
                Statics.field234 = null;
                field496 = false;
                field477 = 0;
                field591 = 1;
            }
            if (field591 == 1) {
                if (Statics.field234 == null) {
                    Statics.field234 = Statics.field1301.method1479(Statics.field375, Statics.field618);
                }
                if (Statics.field234.field1379 == 2) {
                    throw new IOException();
                }
                if (Statics.field234.field1379 == 1) {
                    Statics.field1244 = new class70((Socket) Statics.field234.field1387, Statics.field1301);
                    Statics.field234 = null;
                    field591 = 2;
                }
            }
            if (field591 == 2) {
                field485.field2008 = 0;
                field485.method2396(14);
                Statics.field1244.method1357(field485.field2015, 0, 1);
                field487.field2008 = 0;
                field591 = 3;
            }
            if (field591 == 3) {
                if (Statics.field2373 != null) {
                    Statics.field2373.method1148();
                }
                if (Statics.field1014 != null) {
                    Statics.field1014.method1148();
                }
                int var0 = Statics.field1244.method1354();
                if (Statics.field2373 != null) {
                    Statics.field2373.method1148();
                }
                if (Statics.field1014 != null) {
                    Statics.field1014.method1148();
                }
                if (var0 != 0) {
                    method1347(var0);
                    return;
                }
                field487.field2008 = 0;
                field591 = 5;
            }
            if (field591 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field485.field2008 = 0;
                field485.method2396(10);
                field485.method2470(var1[0]);
                field485.method2470(var1[1]);
                field485.method2470(var1[2]);
                field485.method2470(var1[3]);
                field485.method2400(0L);
                field485.method2401(class21.field300);
                field485.method2428(class6.field74, class6.field73);
                field628.field2008 = 0;
                if (field452 == 40) {
                    field628.method2396(18);
                } else {
                    field628.method2396(16);
                }
                field628.method2397(0);
                int var2 = field628.field2008;
                field628.method2470(15);
                field628.method2404(field485.field2015, 0, field485.field2008);
                int var3 = field628.field2008;
                field628.method2401(class21.field299);
                field628.method2396(field450 ? 1 : 0);
                class82.method622(field628);
                class127 var4 = new class127(Statics.field1525.method2908());
                Statics.field1525.method2907(var4);
                field628.method2404(var4.field2015, 0, var4.field2015.length);
                field628.method2470(Statics.field1801.field2505);
                field628.method2470(Statics.field1353.field2505);
                field628.method2470(Statics.field2708.field2505);
                field628.method2470(Statics.field925.field2505);
                field628.method2470(Statics.field1754.field2505);
                field628.method2470(Statics.field1973.field2505);
                field628.method2470(Statics.field474.field2505);
                field628.method2470(Statics.field717.field2505);
                field628.method2470(Statics.field336.field2505);
                field628.method2470(Statics.field855.field2505);
                field628.method2470(Statics.field1983.field2505);
                field628.method2470(Statics.field1700.field2505);
                field628.method2470(Statics.field815.field2505);
                field628.method2470(Statics.field188.field2505);
                field628.method2470(Statics.field723.field2505);
                field628.method2470(Statics.field70.field2505);
                field628.method2426(var1, var3, field628.field2008);
                field628.method2406(field628.field2008 - var2);
                Statics.field1244.method1357(field628.field2015, 0, field628.field2008);
                field485.method2280(var1);
                for (int var5 = 0; var5 < 4; var5++) {
                    var1[var5] += 50;
                }
                field487.method2280(var1);
                field591 = 6;
            }
            if (field591 == 6 && Statics.field1244.method1355() > 0) {
                int var6 = Statics.field1244.method1354();
                if (var6 == 21 && field452 == 20) {
                    field591 = 7;
                } else if (var6 == 2) {
                    field591 = 9;
                } else if (var6 == 15 && field452 == 40) {
                    method1386();
                    return;
                } else if (var6 == 23 && field588 < 1) {
                    field588++;
                    field591 = 0;
                } else {
                    method1347(var6);
                    return;
                }
            }
            if (field591 == 7 && Statics.field1244.method1355() > 0) {
                field479 = (Statics.field1244.method1354() + 3) * 60;
                field591 = 8;
            }
            if (field591 == 8) {
                field477 = 0;
                class21.method139(class134.field2085, class134.field2086, field479 / 60 + class134.field2087);
                if (--field479 <= 0) {
                    field591 = 0;
                }
            } else {
                if (field591 == 9 && Statics.field1244.method1355() >= 8) {
                    field614 = Statics.field1244.method1354();
                    field615 = Statics.field1244.method1354() == 1;
                    field570 = Statics.field1244.method1354();
                    field570 <<= 0x8;
                    field570 += Statics.field1244.method1354();
                    field464 = Statics.field1244.method1354();
                    Statics.field1244.method1369(field487.field2015, 0, 1);
                    field487.field2008 = 0;
                    field489 = field487.method2276();
                    Statics.field1244.method1369(field487.field2015, 0, 2);
                    field487.field2008 = 0;
                    field488 = field487.method2539();
                    if (field464 == 1) {
                        try {
                            class67.method1340(Statics.field444, "zap");
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class67.method1340(Statics.field444, "unzap");
                        } catch (Throwable var10) {
                        }
                    }
                    field591 = 10;
                }
                if (field591 != 10) {
                    field477++;
                    if (field477 > 2000) {
                        if (field588 < 1) {
                            if (Statics.field618 == Statics.field443) {
                                Statics.field618 = Statics.field227;
                            } else {
                                Statics.field618 = Statics.field443;
                            }
                            field588++;
                            field591 = 0;
                        } else {
                            method1347(-3);
                        }
                    }
                } else if (Statics.field1244.method1355() >= field488) {
                    field487.field2008 = 0;
                    Statics.field1244.method1369(field487.field2015, 0, field488);
                    method1394();
                    Statics.field1245 = -1;
                    method213(false);
                    field489 = -1;
                }
            }
        } catch (IOException var12) {
            if (field588 < 1) {
                if (Statics.field618 == Statics.field443) {
                    Statics.field618 = Statics.field227;
                } else {
                    Statics.field618 = Statics.field443;
                }
                field588++;
                field591 = 0;
            } else {
                method1347(-2);
            }
        }
    }

    @ObfuscatedName("ba.b(B)V")
    public static void method1394() {
        field622 = -1L;
        field701 = -1;
        Statics.field2781.field230 = 0;
        Statics.field1278 = true;
        field486 = true;
        field671 = -1L;
        class182.field2827 = new class177();
        field485.field2008 = 0;
        field487.field2008 = 0;
        field489 = -1;
        field493 = -1;
        field494 = -1;
        field645 = -1;
        field490 = 0;
        field475 = 0;
        field492 = 0;
        field462 = 0;
        field590 = 0;
        field572 = false;
        class77.method1(0);
        for (int var0 = 0; var0 < 100; var0++) {
            field661[var0] = null;
        }
        field469 = 0;
        field663 = 0;
        field603 = false;
        field478 = 0;
        field556 = (int) (Math.random() * 100.0D) - 50;
        field466 = (int) (Math.random() * 110.0D) - 55;
        field517 = (int) (Math.random() * 80.0D) - 40;
        field706 = (int) (Math.random() * 120.0D) - 60;
        field522 = (int) (Math.random() * 30.0D) - 20;
        field533 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field709 = 0;
        field674 = -1;
        field679 = 0;
        field676 = 0;
        field683 = 0;
        field483 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field566[var1] = null;
            field571[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field482[var2] = null;
        }
        Statics.field714 = field566[2047] = new class3();
        field582.method3262();
        field455.method3262();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field639[var3][var4][var5] = null;
                }
            }
        }
        field581 = new class177();
        field700 = 0;
        field699 = 0;
        for (int var6 = 0; var6 < Statics.field1010; var6++) {
            class42 var7 = (class42) class42.field1011.method3196((long) var6);
            class42 var8;
            if (var7 == null) {
                byte[] var9 = Statics.field1013.method2920(16, var6);
                class42 var10 = new class42();
                if (var9 != null) {
                    var10.method874(new class127(var9));
                }
                class42.field1011.method3197(var10, (long) var6);
                var8 = var10;
            } else {
                var8 = var7;
            }
            if (var8 != null && var8.field1019 == 0) {
                class159.field2691[var6] = 0;
                class159.field2696[var6] = 0;
            }
        }
        for (int var12 = 0; var12 < field641.length; var12++) {
            field641[var12] = -1;
        }
        if (field607 != -1) {
            int var13 = field607;
            if (var13 != -1 && Statics.field803[var13]) {
                Statics.field1352.method2931(var13);
                if (Statics.field2607[var13] != null) {
                    boolean var14 = true;
                    for (int var15 = 0; var15 < Statics.field2607[var13].length; var15++) {
                        if (Statics.field2607[var13][var15] != null) {
                            if (Statics.field2607[var13][var15].field2575 == 2) {
                                var14 = false;
                            } else {
                                Statics.field2607[var13][var15] = null;
                            }
                        }
                    }
                    if (var14) {
                        Statics.field2607[var13] = null;
                    }
                    Statics.field803[var13] = false;
                }
            }
        }
        for (class4 var16 = (class4) field608.method3248(); var16 != null; var16 = (class4) field608.method3247()) {
            method1293(var16, true);
        }
        field607 = -1;
        field608 = new class175(8);
        field611 = null;
        field572 = false;
        field590 = 0;
        field705.method3113((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var17 = 0; var17 < 8; var17++) {
            field577[var17] = null;
            field578[var17] = false;
        }
        class19.field256 = new class175(32);
        field453 = true;
        for (int var18 = 0; var18 < 100; var18++) {
            field650[var18] = true;
        }
        field672 = null;
        Statics.field360 = 0;
        Statics.field1434 = null;
    }

    @ObfuscatedName("ba.t(B)V")
    public static void method1386() {
        field485.field2008 = 0;
        field487.field2008 = 0;
        field489 = -1;
        field493 = -1;
        field494 = -1;
        field645 = -1;
        field488 = 0;
        field490 = 0;
        field475 = 0;
        field590 = 0;
        field572 = false;
        field709 = 0;
        field679 = 0;
        for (int var0 = 0; var0 < field566.length; var0++) {
            if (field566[var0] != null) {
                field566[var0].field405 = -1;
            }
        }
        for (int var1 = 0; var1 < field482.length; var1++) {
            if (field482[var1] != null) {
                field482[var1].field405 = -1;
            }
        }
        class19.field256 = new class175(32);
        Statics.method2148(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field650[var2] = true;
        }
    }

    @ObfuscatedName("bw.r(II)V")
    public static void method1347(int arg0) {
        if (arg0 == -3) {
            class21.method139(class134.field2088, class134.field2089, class134.field2090);
        } else if (arg0 == -2) {
            class21.method139(class134.field2091, class134.field2092, class134.field2093);
        } else if (arg0 == -1) {
            class21.method139(class134.field2094, class134.field2095, class134.field2096);
        } else if (arg0 == 3) {
            class21.method139(class134.field2097, class134.field2228, class134.field2115);
        } else if (arg0 == 4) {
            class21.method139(class134.field2249, class134.field2226, class134.field2282);
        } else if (arg0 == 5) {
            class21.method139(class134.field2214, class134.field2104, class134.field2105);
        } else if (arg0 == 6) {
            class21.method139(class134.field2106, class134.field2178, class134.field2108);
        } else if (arg0 == 7) {
            class21.method139(class134.field2109, class134.field2174, class134.field2111);
        } else if (arg0 == 8) {
            class21.method139(class134.field2112, class134.field2064, class134.field2133);
        } else if (arg0 == 9) {
            class21.method139(class134.field2172, class134.field2194, class134.field2117);
        } else if (arg0 == 10) {
            class21.method139(class134.field2118, class134.field2119, class134.field2165);
        } else if (arg0 == 11) {
            class21.method139(class134.field2121, class134.field2122, class134.field2123);
        } else if (arg0 == 12) {
            class21.method139(class134.field2212, class134.field2125, class134.field2126);
        } else if (arg0 == 13) {
            class21.method139(class134.field2127, class134.field2128, class134.field2120);
        } else if (arg0 == 14) {
            class21.method139(class134.field2130, class134.field2240, class134.field2132);
        } else if (arg0 == 16) {
            class21.method139(class134.field2116, class134.field2134, class134.field2135);
        } else if (arg0 == 17) {
            class21.method139(class134.field2136, class134.field2137, class134.field2138);
        } else if (arg0 == 18) {
            class21.method139(class134.field2186, class134.field2158, class134.field2141);
        } else if (arg0 == 19) {
            class21.method139(class134.field2124, class134.field2079, class134.field2144);
        } else if (arg0 == 20) {
            class21.method139(class134.field2145, class134.field2146, class134.field2233);
        } else if (arg0 == 22) {
            class21.method139(class134.field2148, class134.field2149, class134.field2150);
        } else if (arg0 == 23) {
            class21.method139(class134.field2151, class134.field2152, class134.field2242);
        } else if (arg0 == 24) {
            class21.method139(class134.field2244, class134.field2155, class134.field2099);
        } else if (arg0 == 25) {
            class21.method139(class134.field2157, class134.field2147, class134.field2067);
        } else if (arg0 == 26) {
            class21.method139(class134.field2160, class134.field2161, class134.field2162);
        } else if (arg0 == 27) {
            class21.method139(class134.field2202, class134.field2164, class134.field2220);
        } else if (arg0 == 31) {
            class21.method139(class134.field2277, class134.field2173, class134.field2248);
        } else if (arg0 == 32) {
            class21.method139(class134.field2175, class134.field2176, class134.field2177);
        } else if (arg0 == 37) {
            class21.method139(class134.field2139, class134.field2179, class134.field2153);
        } else if (arg0 == 38) {
            class21.method139(class134.field2181, class134.field2182, class134.field2183);
        } else if (arg0 == 55) {
            class21.method139(class134.field2184, class134.field2185, class134.field2189);
        } else {
            class21.method139(class134.field2187, class134.field2188, class134.field2265);
        }
        Statics.method2148(10);
    }

    @ObfuscatedName("o.g(S)V")
    public static final void method188() {
        if (Statics.field1244 != null) {
            Statics.field1244.method1352();
            Statics.field1244 = null;
        }
        method127();
        Statics.field106.method1971();
        for (int var0 = 0; var0 < 4; var0++) {
            field504[var0].method3155();
        }
        System.gc();
        class138.method2327(2);
        field656 = -1;
        field684 = false;
        for (class7 var1 = (class7) class7.field99.method3280(); var1 != null; var1 = (class7) class7.field99.method3269()) {
            if (var1.field92 != null) {
                Statics.field711.method1075(var1.field92);
                var1.field92 = null;
            }
            if (var1.field97 != null) {
                Statics.field711.method1075(var1.field97);
                var1.field97 = null;
            }
        }
        class7.field99.method3262();
        Statics.method2148(10);
    }

    @ObfuscatedName("h.m(B)V")
    public static final void method127() {
        class37.method219();
        class33.method196();
        class36.method100();
        class32.field783.method3198();
        class32.field784.method3198();
        class32.field832.method3198();
        class32.field786.method3198();
        class31.method546();
        class40.field955.method3198();
        class40.field959.method3198();
        class40.field957.method3198();
        class34.method194();
        class35.method170();
        class38.field938.method3198();
        class42.method611();
        class163.method136();
        class158.method2646();
        ((class110) Statics.field1749).method2177();
        class5.field69.method3198();
        Statics.field1801.method2989();
        Statics.field1353.method2989();
        Statics.field925.method2989();
        Statics.field1754.method2989();
        Statics.field1973.method2989();
        Statics.field474.method2989();
        Statics.field717.method2989();
        Statics.field336.method2989();
        Statics.field855.method2989();
        Statics.field1983.method2989();
        Statics.field1700.method2989();
        Statics.field815.method2989();
    }

    @ObfuscatedName("el.o(I)V")
    public static final void method2890() {
        if (field492 > 0) {
            method188();
        } else {
            Statics.method2148(40);
            Statics.field1205 = Statics.field1244;
            Statics.field1244 = null;
        }
    }

    @ObfuscatedName("eo.f(I)V")
    public static final void method2856() {
        for (int var0 = 0; var0 < field478; var0++) {
            int var10002 = field690[var0]--;
            if (field690[var0] >= -10) {
                class57 var2 = field610[var0];
                if (var2 == null) {
                    class57 var10000 = (class57) null;
                    var2 = class57.method1228(Statics.field1754, field688[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field690[var0] += var2.method1222();
                    field610[var0] = var2;
                }
                if (field690[var0] < 0) {
                    int var9;
                    if (field513[var0] == 0) {
                        var9 = field659;
                    } else {
                        int var3 = (field513[var0] & 0xFF) * 128;
                        int var4 = field513[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field714.field399;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field513[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field714.field383;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field690[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field575 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1221().method1295(Statics.field2385);
                        class45 var11 = class45.method926(var10, 100, var9);
                        var11.method1028(field673[var0] - 1);
                        Statics.field711.method1074(var11);
                    }
                    field690[var0] = -100;
                }
            } else {
                field478--;
                for (int var1 = var0; var1 < field478; var1++) {
                    field688[var1] = field688[var1 + 1];
                    field610[var1] = field610[var1 + 1];
                    field673[var1] = field673[var1 + 1];
                    field690[var1] = field690[var1 + 1];
                    field513[var1] = field513[var1 + 1];
                }
                var0--;
            }
        }
        if (field684 && !class138.method803()) {
            if (field682 != 0 && field656 != -1) {
                class138.method2342(Statics.field474, field656, 0, field682, false);
            }
            field684 = false;
        }
    }

    @ObfuscatedName("dv.i(Lao;IIII)V")
    public static void method2173(class34 arg0, int arg1, int arg2, int arg3) {
        if (field478 >= 50 || field575 == 0 || arg0.field854 == null || arg1 >= arg0.field854.length) {
            return;
        }
        int var4 = arg0.field854[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field688[field478] = var5;
        field673[field478] = var6;
        field690[field478] = 0;
        field610[field478] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field513[field478] = (var8 << 16) + (var9 << 8) + var7;
        field478++;
    }

    @ObfuscatedName("bd.z(IS)V")
    public static void method1240(int arg0) {
        if (arg0 == -1 && !field684) {
            class138.method1323();
        } else if (arg0 != -1 && field656 != arg0 && field682 != 0 && !field684) {
            class138.method31(2, Statics.field474, arg0, 0, field682, false);
        }
        field656 = arg0;
    }

    @ObfuscatedName("m.ai(I)V")
    public static final void method165() {
        if (field450 && Statics.field1310 != field616) {
            Statics.method2685(Statics.field1245, Statics.field101, Statics.field1310, Statics.field714.field420[0], Statics.field714.field436[0]);
        } else if (Statics.field1310 != field674) {
            field674 = Statics.field1310;
            int var0 = Statics.field1310;
            int[] var1 = Statics.field1157.field1444;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field119[var0][var6][var4] & 0x18) == 0) {
                        Statics.field106.method1962(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field119[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field106.method1962(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field1157.method1625();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field119[var0][var10][var9] & 0x18) == 0) {
                        method1372(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field119[var0 + 1][var10][var9] & 0x8) != 0) {
                        method1372(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field675 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field106.method1821(Statics.field1310, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class32.method1131(var14).field809;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field504[Statics.field1310].field2724;
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
                            field678[field675] = Statics.field2545[var15];
                            field495[field675] = var16;
                            field529[field675] = var17;
                            field675++;
                        }
                    }
                }
            }
            Statics.field778.method1620();
        }
    }

    @ObfuscatedName("fo.ag(Ljava/lang/String;I)V")
    public static final void method3111(String arg0) {
        if (arg0.equalsIgnoreCase("::toggleroof")) {
            Statics.field1825.field177 = !Statics.field1825.field177;
            class12.method49();
            if (Statics.field1825.field177) {
                method3033(0, "", "Roofs are now all hidden");
            } else {
                method3033(0, "", "Roofs will only be removed selectively");
            }
        }
        if (field614 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                method2890();
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field460 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field460 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field504[var1].field2724[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field459 == 2) {
                throw new RuntimeException();
            }
        }
        field485.method2275(89);
        field485.method2396(arg0.length() - 1);
        field485.method2401(arg0.substring(2));
    }

    @ObfuscatedName("dm.as(I)V")
    public static final void method2624() {
        int var0 = Statics.field2044 * 128 + 64;
        int var1 = Statics.field56 * 128 + 64;
        int var2 = method1500(var0, var1, Statics.field1310) - Statics.field312;
        if (Statics.field881 < var0) {
            Statics.field881 += Statics.field1262 * (var0 - Statics.field881) / 1000 + Statics.field1283;
            if (Statics.field881 > var0) {
                Statics.field881 = var0;
            }
        }
        if (Statics.field881 > var0) {
            Statics.field881 -= Statics.field1262 * (Statics.field881 - var0) / 1000 + Statics.field1283;
            if (Statics.field881 < var0) {
                Statics.field881 = var0;
            }
        }
        if (Statics.field1428 < var2) {
            Statics.field1428 += Statics.field1262 * (var2 - Statics.field1428) / 1000 + Statics.field1283;
            if (Statics.field1428 > var2) {
                Statics.field1428 = var2;
            }
        }
        if (Statics.field1428 > var2) {
            Statics.field1428 -= Statics.field1262 * (Statics.field1428 - var2) / 1000 + Statics.field1283;
            if (Statics.field1428 < var2) {
                Statics.field1428 = var2;
            }
        }
        if (Statics.field114 < var1) {
            Statics.field114 += Statics.field1262 * (var1 - Statics.field114) / 1000 + Statics.field1283;
            if (Statics.field114 > var1) {
                Statics.field114 = var1;
            }
        }
        if (Statics.field114 > var1) {
            Statics.field114 -= Statics.field1262 * (Statics.field114 - var1) / 1000 + Statics.field1283;
            if (Statics.field114 < var1) {
                Statics.field114 = var1;
            }
        }
        int var3 = Statics.field2368 * 128 + 64;
        int var4 = Statics.field929 * 128 + 64;
        int var5 = method1500(var3, var4, Statics.field1310) - Statics.field440;
        int var6 = var3 - Statics.field881;
        int var7 = var5 - Statics.field1428;
        int var8 = var4 - Statics.field114;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1412 < var10) {
            Statics.field1412 += Statics.field322 * (var10 - Statics.field1412) / 1000 + Statics.field111;
            if (Statics.field1412 > var10) {
                Statics.field1412 = var10;
            }
        }
        if (Statics.field1412 > var10) {
            Statics.field1412 -= Statics.field322 * (Statics.field1412 - var10) / 1000 + Statics.field111;
            if (Statics.field1412 < var10) {
                Statics.field1412 = var10;
            }
        }
        int var12 = var11 - Statics.field110;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field110 += Statics.field322 * var12 / 1000 + Statics.field111;
            Statics.field110 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field110 -= Statics.field322 * -var12 / 1000 + Statics.field111;
            Statics.field110 &= 0x7FF;
        }
        int var13 = var11 - Statics.field110;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field110 = var11;
        }
    }

    @ObfuscatedName("ek.al(I)V")
    public static final void method2792() {
        int var0 = field556 + Statics.field714.field399;
        int var1 = field466 + Statics.field714.field383;
        if (Statics.field923 - var0 < -500 || Statics.field923 - var0 > 500 || Statics.field999 - var1 < -500 || Statics.field999 - var1 > 500) {
            Statics.field923 = var0;
            Statics.field999 = var1;
        }
        if (Statics.field923 != var0) {
            Statics.field923 += (var0 - Statics.field923) / 16;
        }
        if (Statics.field999 != var1) {
            Statics.field999 += (var1 - Statics.field999) / 16;
        }
        if (class75.field1331[96]) {
            field534 += (-24 - field534) / 2;
        } else if (class75.field1331[97]) {
            field534 += (24 - field534) / 2;
        } else {
            field534 /= 2;
        }
        if (class75.field1331[98]) {
            field535 += (12 - field535) / 2;
        } else if (class75.field1331[99]) {
            field535 += (-12 - field535) / 2;
        } else {
            field535 /= 2;
        }
        field533 = field534 / 2 + field533 & 0x7FF;
        field458 += field535 / 2;
        if (field458 < 128) {
            field458 = 128;
        }
        if (field458 > 383) {
            field458 = 383;
        }
        int var2 = Statics.field923 >> 7;
        int var3 = Statics.field999 >> 7;
        int var4 = method1500(Statics.field923, Statics.field999, Statics.field1310);
        int var5 = 0;
        if (var2 > 3 && var3 > 3 && var2 < 100 && var3 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                    int var8 = Statics.field1310;
                    if (var8 < 3 && (class9.field119[1][var6][var7] & 0x2) == 2) {
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
        if (var10 > field589) {
            field589 += (var10 - field589) / 24;
        } else if (var10 < field589) {
            field589 += (var10 - field589) / 80;
        }
    }

    @ObfuscatedName("y.aj(B)V")
    public static final void method135() {
        for (int var0 = -1; var0 < field683; var0++) {
            int var1;
            if (var0 == -1) {
                var1 = 2047;
            } else {
                var1 = field568[var0];
            }
            class3 var2 = field566[var1];
            if (var2 != null) {
                method247(var2, 1);
            }
        }
    }

    @ObfuscatedName("at.am(I)V")
    public static final void method782() {
        for (int var0 = 0; var0 < field483; var0++) {
            int var1 = field484[var0];
            class25 var2 = field482[var1];
            if (var2 != null) {
                method247(var2, var2.field354.field749);
            }
        }
    }

    @ObfuscatedName("ai.ab(Lai;II)V")
    public static final void method247(class27 arg0, int arg1) {
        if (arg0.field425 > field668) {
            method2667(arg0);
        } else if (arg0.field382 >= field668) {
            if (field668 == arg0.field382 || arg0.field411 == -1 || arg0.field414 != 0 || arg0.field415 + 1 > class34.method516(arg0.field411).field853[arg0.field398]) {
                int var2 = arg0.field382 - arg0.field425;
                int var3 = field668 - arg0.field425;
                int var4 = arg0.field433 * 64 + arg0.field422 * 128;
                int var5 = arg0.field433 * 64 + arg0.field423 * 128;
                int var6 = arg0.field433 * 64 + arg0.field404 * 128;
                int var7 = arg0.field435 * 128 + arg0.field433 * 64;
                arg0.field399 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field383 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field437 = 0;
            if (arg0.field413 == 0) {
                arg0.field430 = 1024;
            }
            if (arg0.field413 == 1) {
                arg0.field430 = 1536;
            }
            if (arg0.field413 == 2) {
                arg0.field430 = 0;
            }
            if (arg0.field413 == 3) {
                arg0.field430 = 512;
            }
            arg0.field384 = arg0.field430;
        } else {
            arg0.field408 = arg0.field387;
            if (arg0.field434 == 0) {
                arg0.field437 = 0;
            } else {
                label234: {
                    if (arg0.field411 != -1 && arg0.field414 == 0) {
                        class34 var8 = class34.method516(arg0.field411);
                        if (arg0.field438 > 0 && var8.field862 == 0) {
                            arg0.field437++;
                            break label234;
                        }
                        if (arg0.field438 <= 0 && var8.field868 == 0) {
                            arg0.field437++;
                            break label234;
                        }
                    }
                    int var9 = arg0.field399;
                    int var10 = arg0.field383;
                    int var11 = arg0.field420[arg0.field434 - 1] * 128 + arg0.field433 * 64;
                    int var12 = arg0.field436[arg0.field434 - 1] * 128 + arg0.field433 * 64;
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        if (var9 < var11) {
                            if (var10 < var12) {
                                arg0.field430 = 1280;
                            } else if (var10 > var12) {
                                arg0.field430 = 1792;
                            } else {
                                arg0.field430 = 1536;
                            }
                        } else if (var9 > var11) {
                            if (var10 < var12) {
                                arg0.field430 = 768;
                            } else if (var10 > var12) {
                                arg0.field430 = 256;
                            } else {
                                arg0.field430 = 512;
                            }
                        } else if (var10 < var12) {
                            arg0.field430 = 1024;
                        } else if (var10 > var12) {
                            arg0.field430 = 0;
                        }
                        int var13 = arg0.field430 - arg0.field384 & 0x7FF;
                        if (var13 > 1024) {
                            var13 -= 2048;
                        }
                        int var14 = arg0.field412;
                        if (var13 >= -256 && var13 <= 256) {
                            var14 = arg0.field390;
                        } else if (var13 >= 256 && var13 < 768) {
                            var14 = arg0.field403;
                        } else if (var13 >= -768 && var13 <= -256) {
                            var14 = arg0.field442;
                        }
                        if (var14 == -1) {
                            var14 = arg0.field390;
                        }
                        arg0.field408 = var14;
                        int var15 = 4;
                        boolean var16 = true;
                        if (arg0 instanceof class25) {
                            var16 = ((class25) arg0).field354.field750;
                        }
                        if (var16) {
                            if (arg0.field430 != arg0.field384 && arg0.field405 == -1 && arg0.field432 != 0) {
                                var15 = 2;
                            }
                            if (arg0.field434 > 2) {
                                var15 = 6;
                            }
                            if (arg0.field434 > 3) {
                                var15 = 8;
                            }
                            if (arg0.field437 > 0 && arg0.field434 > 1) {
                                var15 = 8;
                                arg0.field437--;
                            }
                        } else {
                            if (arg0.field434 > 1) {
                                var15 = 6;
                            }
                            if (arg0.field434 > 2) {
                                var15 = 8;
                            }
                            if (arg0.field437 > 0 && arg0.field434 > 1) {
                                var15 = 8;
                                arg0.field437--;
                            }
                        }
                        if (arg0.field393[arg0.field434 - 1]) {
                            var15 <<= 0x1;
                        }
                        if (var15 >= 8 && arg0.field408 == arg0.field390 && arg0.field394 != -1) {
                            arg0.field408 = arg0.field394;
                        }
                        if (var9 < var11) {
                            arg0.field399 += var15;
                            if (arg0.field399 > var11) {
                                arg0.field399 = var11;
                            }
                        } else if (var9 > var11) {
                            arg0.field399 -= var15;
                            if (arg0.field399 < var11) {
                                arg0.field399 = var11;
                            }
                        }
                        if (var10 < var12) {
                            arg0.field383 += var15;
                            if (arg0.field383 > var12) {
                                arg0.field383 = var12;
                            }
                        } else if (var10 > var12) {
                            arg0.field383 -= var15;
                            if (arg0.field383 < var12) {
                                arg0.field383 = var12;
                            }
                        }
                        if (arg0.field399 == var11 && arg0.field383 == var12) {
                            arg0.field434--;
                            if (arg0.field438 > 0) {
                                arg0.field438--;
                            }
                        }
                    } else {
                        arg0.field399 = var11;
                        arg0.field383 = var12;
                    }
                }
            }
        }
        if (arg0.field399 < 128 || arg0.field383 < 128 || arg0.field399 >= 13184 || arg0.field383 >= 13184) {
            arg0.field411 = -1;
            arg0.field416 = -1;
            arg0.field425 = 0;
            arg0.field382 = 0;
            arg0.field399 = arg0.field420[0] * 128 + arg0.field433 * 64;
            arg0.field383 = arg0.field436[0] * 128 + arg0.field433 * 64;
            arg0.method232();
        }
        if (Statics.field714 == arg0 && (arg0.field399 < 1536 || arg0.field383 < 1536 || arg0.field399 >= 11776 || arg0.field383 >= 11776)) {
            arg0.field411 = -1;
            arg0.field416 = -1;
            arg0.field425 = 0;
            arg0.field382 = 0;
            arg0.field399 = arg0.field420[0] * 128 + arg0.field433 * 64;
            arg0.field383 = arg0.field436[0] * 128 + arg0.field433 * 64;
            arg0.method232();
        }
        Statics.method102(arg0);
        method2345(arg0);
    }

    @ObfuscatedName("er.ao(Lai;I)V")
    public static final void method2667(class27 arg0) {
        int var1 = arg0.field425 - field668;
        int var2 = arg0.field433 * 64 + arg0.field422 * 128;
        int var3 = arg0.field433 * 64 + arg0.field423 * 128;
        arg0.field399 += (var2 - arg0.field399) / var1;
        arg0.field383 += (var3 - arg0.field383) / var1;
        arg0.field437 = 0;
        if (arg0.field413 == 0) {
            arg0.field430 = 1024;
        }
        if (arg0.field413 == 1) {
            arg0.field430 = 1536;
        }
        if (arg0.field413 == 2) {
            arg0.field430 = 0;
        }
        if (arg0.field413 == 3) {
            arg0.field430 = 512;
        }
    }

    @ObfuscatedName("dr.ap(Lai;B)V")
    public static final void method2345(class27 arg0) {
        arg0.field385 = false;
        if (arg0.field408 != -1) {
            class34 var1 = class34.method516(arg0.field408);
            if (var1 == null || var1.field851 == null) {
                arg0.field408 = -1;
            } else {
                arg0.field410++;
                if (arg0.field429 < var1.field851.length && arg0.field410 > var1.field853[arg0.field429]) {
                    arg0.field410 = 1;
                    arg0.field429++;
                    method2173(var1, arg0.field429, arg0.field399, arg0.field383);
                }
                if (arg0.field429 >= var1.field851.length) {
                    arg0.field410 = 0;
                    arg0.field429 = 0;
                    method2173(var1, arg0.field429, arg0.field399, arg0.field383);
                }
            }
        }
        if (arg0.field416 != -1 && field668 >= arg0.field419) {
            if (arg0.field417 < 0) {
                arg0.field417 = 0;
            }
            int var2 = class35.method1621(arg0.field416).field875;
            if (var2 == -1) {
                arg0.field416 = -1;
            } else {
                class34 var3 = class34.method516(var2);
                if (var3 == null || var3.field851 == null) {
                    arg0.field416 = -1;
                } else {
                    arg0.field418++;
                    if (arg0.field417 < var3.field851.length && arg0.field418 > var3.field853[arg0.field417]) {
                        arg0.field418 = 1;
                        arg0.field417++;
                        method2173(var3, arg0.field417, arg0.field399, arg0.field383);
                    }
                    if (arg0.field417 >= var3.field851.length && (arg0.field417 < 0 || arg0.field417 >= var3.field851.length)) {
                        arg0.field416 = -1;
                    }
                }
            }
        }
        if (arg0.field411 != -1 && arg0.field414 <= 1) {
            class34 var4 = class34.method516(arg0.field411);
            if (var4.field862 == 1 && arg0.field438 > 0 && arg0.field425 <= field668 && arg0.field382 < field668) {
                arg0.field414 = 1;
                return;
            }
        }
        if (arg0.field411 != -1 && arg0.field414 == 0) {
            class34 var5 = class34.method516(arg0.field411);
            if (var5 == null || var5.field851 == null) {
                arg0.field411 = -1;
            } else {
                arg0.field415++;
                if (arg0.field398 < var5.field851.length && arg0.field415 > var5.field853[arg0.field398]) {
                    arg0.field415 = 1;
                    arg0.field398++;
                    method2173(var5, arg0.field398, arg0.field399, arg0.field383);
                }
                if (arg0.field398 >= var5.field851.length) {
                    arg0.field398 -= var5.field864;
                    arg0.field386++;
                    if (arg0.field386 >= var5.field847) {
                        arg0.field411 = -1;
                    } else if (arg0.field398 >= 0 && arg0.field398 < var5.field851.length) {
                        method2173(var5, arg0.field398, arg0.field399, arg0.field383);
                    } else {
                        arg0.field411 = -1;
                    }
                }
                arg0.field385 = var5.field857;
            }
        }
        if (arg0.field414 > 0) {
            arg0.field414--;
        }
    }

    @ObfuscatedName("as.at(Lk;III)V")
    public static void method550(class3 arg0, int arg1, int arg2) {
        if (arg0.field411 == arg1 && arg1 != -1) {
            int var3 = class34.method516(arg1).field863;
            if (var3 == 1) {
                arg0.field398 = 0;
                arg0.field415 = 0;
                arg0.field414 = arg2;
                arg0.field386 = 0;
            }
            if (var3 == 2) {
                arg0.field386 = 0;
            }
        } else if (arg1 == -1 || arg0.field411 == -1 || class34.method516(arg1).field858 >= class34.method516(arg0.field411).field858) {
            arg0.field411 = arg1;
            arg0.field398 = 0;
            arg0.field415 = 0;
            arg0.field414 = arg2;
            arg0.field386 = 0;
            arg0.field438 = arg0.field434;
        }
    }

    @ObfuscatedName("bt.az(Ljava/lang/String;ZB)V")
    public static final void method1378(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field63.method3325(arg0, 250);
        int var6 = Statics.field63.method3356(arg0, 250) * 13;
        class89.method1767(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class89.method1739(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field63.method3329(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method162(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method2887(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field831.getGraphics();
            Statics.field778.method1568(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field831.repaint();
        }
    }

    @ObfuscatedName("w.ae(IIIII)V")
    public static final void method52(int arg0, int arg1, int arg2, int arg3) {
        class89.method1731(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class104.method2086();
        field689++;
        method523(true);
        method177(true);
        method523(false);
        method177(false);
        for (class10 var4 = (class10) field582.method3280(); var4 != null; var4 = (class10) field582.method3269()) {
            if (Statics.field1310 != var4.field168 || field668 > var4.field149) {
                var4.method3301();
            } else if (field668 >= var4.field154) {
                if (var4.field152 > 0) {
                    class25 var5 = field482[var4.field152 - 1];
                    if (var5 != null && var5.field399 >= 0 && var5.field399 < 13312 && var5.field383 >= 0 && var5.field383 < 13312) {
                        var4.method92(var5.field399, var5.field383, method1500(var5.field399, var5.field383, var4.field168) - var4.field147, field668);
                    }
                }
                if (var4.field152 < 0) {
                    int var6 = -var4.field152 - 1;
                    class3 var7;
                    if (field570 == var6) {
                        var7 = Statics.field714;
                    } else {
                        var7 = field566[var6];
                    }
                    if (var7 != null && var7.field399 >= 0 && var7.field399 < 13312 && var7.field383 >= 0 && var7.field383 < 13312) {
                        var4.method92(var7.field399, var7.field383, method1500(var7.field399, var7.field383, var4.field168) - var4.field147, field668);
                    }
                }
                var4.method93(field525);
                Statics.field106.method1828(Statics.field1310, (int) var4.field158, (int) var4.field155, (int) var4.field143, 60, var4, var4.field162, -1, false);
            }
        }
        for (class20 var8 = (class20) field455.method3280(); var8 != null; var8 = (class20) field455.method3269()) {
            if (Statics.field1310 != var8.field271 || var8.field272) {
                var8.method3301();
            } else if (field668 >= var8.field264) {
                var8.method163(field525);
                if (var8.field272) {
                    var8.method3301();
                } else {
                    Statics.field106.method1828(var8.field271, var8.field266, var8.field270, var8.field268, 60, var8, 0, -1, false);
                }
            }
        }
        if (!field476) {
            int var9 = field458;
            if (field589 / 256 > var9) {
                var9 = field589 / 256;
            }
            if (field694[4] && field696[4] + 128 > var9) {
                var9 = field696[4] + 128;
            }
            int var10 = field533 + field517 & 0x7FF;
            method129(Statics.field923, method1500(Statics.field714.field399, Statics.field714.field383, Statics.field1310) - 50, Statics.field999, var9, var10, var9 * 3 + 600);
        }
        int var23;
        if (field476) {
            var23 = method117();
        } else {
            int var11;
            if (Statics.field1825.field177) {
                var11 = Statics.field1310;
            } else {
                int var12 = 3;
                if (Statics.field1412 < 310) {
                    int var13 = Statics.field881 >> 7;
                    int var14 = Statics.field114 >> 7;
                    int var15 = Statics.field714.field399 >> 7;
                    int var16 = Statics.field714.field383 >> 7;
                    if ((class9.field119[Statics.field1310][var13][var14] & 0x4) != 0) {
                        var12 = Statics.field1310;
                    }
                    int var17;
                    if (var15 > var13) {
                        var17 = var15 - var13;
                    } else {
                        var17 = var13 - var15;
                    }
                    int var18;
                    if (var16 > var14) {
                        var18 = var16 - var14;
                    } else {
                        var18 = var14 - var16;
                    }
                    if (var17 > var18) {
                        int var19 = var18 * 65536 / var17;
                        int var20 = 32768;
                        while (var13 != var15) {
                            if (var13 < var15) {
                                var13++;
                            } else if (var13 > var15) {
                                var13--;
                            }
                            if ((class9.field119[Statics.field1310][var13][var14] & 0x4) != 0) {
                                var12 = Statics.field1310;
                            }
                            var20 += var19;
                            if (var20 >= 65536) {
                                var20 -= 65536;
                                if (var14 < var16) {
                                    var14++;
                                } else if (var14 > var16) {
                                    var14--;
                                }
                                if ((class9.field119[Statics.field1310][var13][var14] & 0x4) != 0) {
                                    var12 = Statics.field1310;
                                }
                            }
                        }
                    } else {
                        int var21 = var17 * 65536 / var18;
                        int var22 = 32768;
                        while (var14 != var16) {
                            if (var14 < var16) {
                                var14++;
                            } else if (var14 > var16) {
                                var14--;
                            }
                            if ((class9.field119[Statics.field1310][var13][var14] & 0x4) != 0) {
                                var12 = Statics.field1310;
                            }
                            var22 += var21;
                            if (var22 >= 65536) {
                                var22 -= 65536;
                                if (var13 < var15) {
                                    var13++;
                                } else if (var13 > var15) {
                                    var13--;
                                }
                                if ((class9.field119[Statics.field1310][var13][var14] & 0x4) != 0) {
                                    var12 = Statics.field1310;
                                }
                            }
                        }
                    }
                }
                if ((class9.field119[Statics.field1310][Statics.field714.field399 >> 7][Statics.field714.field383 >> 7] & 0x4) != 0) {
                    var12 = Statics.field1310;
                }
                var11 = var12;
            }
            var23 = var11;
        }
        int var24 = Statics.field881;
        int var25 = Statics.field1428;
        int var26 = Statics.field114;
        int var27 = Statics.field1412;
        int var28 = Statics.field110;
        for (int var29 = 0; var29 < 5; var29++) {
            if (field694[var29]) {
                int var30 = (int) (Math.random() * (double) (field695[var29] * 2 + 1) - (double) field695[var29] + Math.sin((double) field697[var29] / 100.0D * (double) field685[var29]) * (double) field696[var29]);
                if (var29 == 0) {
                    Statics.field881 += var30;
                }
                if (var29 == 1) {
                    Statics.field1428 += var30;
                }
                if (var29 == 2) {
                    Statics.field114 += var30;
                }
                if (var29 == 3) {
                    Statics.field110 = Statics.field110 + var30 & 0x7FF;
                }
                if (var29 == 4) {
                    Statics.field1412 += var30;
                    if (Statics.field1412 < 128) {
                        Statics.field1412 = 128;
                    }
                    if (Statics.field1412 > 383) {
                        Statics.field1412 = 383;
                    }
                }
            }
        }
        int var31 = class77.field1373;
        int var32 = class77.field1366;
        if (var31 >= arg0 && var31 < arg0 + arg2 && var32 >= arg1 && var32 < arg1 + arg3) {
            class112.field1883 = true;
            class112.field1886 = 0;
            class112.field1884 = class77.field1373 - arg0;
            class112.field1835 = class77.field1366 - arg1;
        } else {
            class112.field1883 = false;
            class112.field1886 = 0;
        }
        Statics.method132();
        class89.method1767(arg0, arg1, arg2, arg3, 0);
        Statics.method132();
        Statics.field106.method1884(Statics.field881, Statics.field1428, Statics.field114, Statics.field1412, Statics.field110, var23);
        Statics.method132();
        Statics.field106.method1831();
        field539 = 0;
        for (int var33 = -1; var33 < field683 + field483; var33++) {
            class27 var34;
            if (var33 == -1) {
                var34 = Statics.field714;
            } else if (var33 < field683) {
                var34 = field566[field568[var33]];
            } else {
                var34 = field482[field484[var33 - field683]];
            }
            if (var34 != null && var34.method11()) {
                if (var34 instanceof class25) {
                    class31 var35 = ((class25) var34).field354;
                    if (var35.field773 != null) {
                        var35 = var35.method582();
                    }
                    if (var35 == null) {
                        continue;
                    }
                }
                if (var33 >= field683) {
                    class31 var40 = ((class25) var34).field354;
                    if (var40.field773 != null) {
                        var40 = var40.method582();
                    }
                    if (var40.field751 >= 0 && var40.field751 < Statics.field1526.length) {
                        int var41 = var34.field391 + 15;
                        method2637(var34.field399, var34.field383, var41);
                        if (field551 > -1) {
                            Statics.field1526[var40.field751].method1635(field551 + arg0 - 12, field552 + arg1 - 30);
                        }
                    }
                    if (field462 == 1 && field463 == field484[var33 - field683] && field668 % 20 < 10) {
                        int var42 = var34.field391 + 15;
                        method2637(var34.field399, var34.field383, var42);
                        if (field551 > -1) {
                            Statics.field2550[0].method1635(field551 + arg0 - 12, field552 + arg1 - 28);
                        }
                    }
                } else {
                    int var36 = 30;
                    class3 var37 = (class3) var34;
                    if (var37.field29 != -1 || var37.field30 != -1) {
                        int var38 = var34.field391 + 15;
                        method2637(var34.field399, var34.field383, var38);
                        if (field551 > -1) {
                            if (var37.field29 != -1) {
                                Statics.field235[var37.field29].method1635(field551 + arg0 - 12, field552 + arg1 - var36);
                                var36 += 25;
                            }
                            if (var37.field30 != -1) {
                                Statics.field1526[var37.field30].method1635(field551 + arg0 - 12, field552 + arg1 - var36);
                                var36 += 25;
                            }
                        }
                    }
                    if (var33 >= 0 && field462 == 10 && field481 == field568[var33]) {
                        int var39 = var34.field391 + 15;
                        method2637(var34.field399, var34.field383, var39);
                        if (field551 > -1) {
                            Statics.field2550[1].method1635(field551 + arg0 - 12, field552 + arg1 - var36);
                        }
                    }
                }
                if (var34.field395 != null && (var33 >= field683 || field664 == 0 || field664 == 3 || field664 == 1 && Statics.method111(((class3) var34).field39))) {
                    int var43 = var34.field391;
                    method2637(var34.field399, var34.field383, var43);
                    if (field551 > -1 && field539 < field540) {
                        field544[field539] = Statics.field1006.method3323(var34.field395) / 2;
                        field543[field539] = Statics.field1006.field2847;
                        field541[field539] = field551;
                        field542[field539] = field552;
                        field545[field539] = var34.field397;
                        field546[field539] = var34.field439;
                        field547[field539] = var34.field396;
                        field548[field539] = var34.field395;
                        field539++;
                    }
                }
                if (var34.field402 > field668) {
                    int var44 = var34.field391 + 15;
                    method2637(var34.field399, var34.field383, var44);
                    if (field551 > -1) {
                        int var45 = var34.field427 * 30 / var34.field426;
                        if (var45 > 30) {
                            var45 = 30;
                        }
                        class89.method1767(field551 + arg0 - 15, field552 + arg1 - 3, var45, 5, 65280);
                        class89.method1767(field551 + arg0 - 15 + var45, field552 + arg1 - 3, 30 - var45, 5, 16711680);
                    }
                }
                for (int var46 = 0; var46 < 4; var46++) {
                    if (var34.field401[var46] > field668) {
                        int var47 = var34.field391 / 2;
                        method2637(var34.field399, var34.field383, var47);
                        if (field551 > -1) {
                            if (var46 == 1) {
                                field552 -= 20;
                            }
                            if (var46 == 2) {
                                field551 -= 15;
                                field552 -= 10;
                            }
                            if (var46 == 3) {
                                field551 += 15;
                                field552 -= 10;
                            }
                            Statics.field1804[var34.field400[var46]].method1635(field551 + arg0 - 12, field552 + arg1 - 12);
                            Statics.field356.method3366(Integer.toString(var34.field409[var46]), field551 + arg0 - 1, field552 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var48 = 0; var48 < field539; var48++) {
            int var49 = field541[var48];
            int var50 = field542[var48];
            int var51 = field544[var48];
            int var52 = field543[var48];
            boolean var53 = true;
            while (var53) {
                var53 = false;
                for (int var54 = 0; var54 < var48; var54++) {
                    if (var50 + 2 > field542[var54] - field543[var54] && var50 - var52 < field542[var54] + 2 && var49 - var51 < field544[var54] + field541[var54] && var49 + var51 > field541[var54] - field544[var54] && field542[var54] - field543[var54] < var50) {
                        var50 = field542[var54] - field543[var54];
                        var53 = true;
                    }
                }
            }
            field551 = field541[var48];
            field552 = field542[var48] = var50;
            String var55 = field548[var48];
            if (field526 == 0) {
                int var56 = 16776960;
                if (field545[var48] < 6) {
                    var56 = field609[field545[var48]];
                }
                if (field545[var48] == 6) {
                    var56 = field689 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field545[var48] == 7) {
                    var56 = field689 % 20 < 10 ? 255 : 65535;
                }
                if (field545[var48] == 8) {
                    var56 = field689 % 20 < 10 ? 45056 : 8454016;
                }
                if (field545[var48] == 9) {
                    int var57 = 150 - field547[var48];
                    if (var57 < 50) {
                        var56 = var57 * 1280 + 16711680;
                    } else if (var57 < 100) {
                        var56 = 16776960 - (var57 - 50) * 327680;
                    } else if (var57 < 150) {
                        var56 = (var57 - 100) * 5 + 65280;
                    }
                }
                if (field545[var48] == 10) {
                    int var58 = 150 - field547[var48];
                    if (var58 < 50) {
                        var56 = var58 * 5 + 16711680;
                    } else if (var58 < 100) {
                        var56 = 16711935 - (var58 - 50) * 327680;
                    } else if (var58 < 150) {
                        var56 = (var58 - 100) * 327680 + 255 - (var58 - 100) * 5;
                    }
                }
                if (field545[var48] == 11) {
                    int var59 = 150 - field547[var48];
                    if (var59 < 50) {
                        var56 = 16777215 - var59 * 327685;
                    } else if (var59 < 100) {
                        var56 = (var59 - 50) * 327685 + 65280;
                    } else if (var59 < 150) {
                        var56 = 16777215 - (var59 - 100) * 327680;
                    }
                }
                if (field546[var48] == 0) {
                    Statics.field1006.method3366(var55, field551 + arg0, field552 + arg1, var56, 0);
                }
                if (field546[var48] == 1) {
                    Statics.field1006.method3330(var55, field551 + arg0, field552 + arg1, var56, 0, field689);
                }
                if (field546[var48] == 2) {
                    Statics.field1006.method3331(var55, field551 + arg0, field552 + arg1, var56, 0, field689);
                }
                if (field546[var48] == 3) {
                    Statics.field1006.method3332(var55, field551 + arg0, field552 + arg1, var56, 0, field689, 150 - field547[var48]);
                }
                if (field546[var48] == 4) {
                    int var60 = (150 - field547[var48]) * (Statics.field1006.method3323(var55) + 100) / 150;
                    class89.method1732(field551 + arg0 - 50, arg1, field551 + arg0 + 50, arg1 + arg3);
                    Statics.field1006.method3327(var55, field551 + arg0 + 50 - var60, field552 + arg1, var56, 0);
                    class89.method1731(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field546[var48] == 5) {
                    int var61 = 150 - field547[var48];
                    int var62 = 0;
                    if (var61 < 25) {
                        var62 = var61 - 25;
                    } else if (var61 > 125) {
                        var62 = var61 - 125;
                    }
                    class89.method1732(arg0, field552 + arg1 - Statics.field1006.field2847 - 1, arg0 + arg2, field552 + arg1 + 5);
                    Statics.field1006.method3366(var55, field551 + arg0, field552 + arg1 + var62, var56, 0);
                    class89.method1731(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1006.method3366(var55, field551 + arg0, field552 + arg1, 16776960, 0);
            }
        }
        if (field462 == 2) {
            method2637((field465 - Statics.field497 << 7) + field637, (field454 - Statics.field904 << 7) + field693, field467 * 2);
            if (field551 > -1 && field668 % 20 < 10) {
                Statics.field2550[0].method1635(field551 + arg0 - 12, field552 + arg1 - 28);
            }
        }
        ((class110) Statics.field1749).method2178(field525);
        method159(arg0, arg1, arg2, arg3);
        Statics.field881 = var24;
        Statics.field1428 = var25;
        Statics.field114 = var26;
        Statics.field1412 = var27;
        Statics.field110 = var28;
        if (field453 && class153.method107(true, false) == 0) {
            field453 = false;
        }
        if (field453) {
            class89.method1767(arg0, arg1, arg2, arg3, 0);
            method1378(class134.field2061, false);
        }
        if (!field453 && !field572 && var31 >= arg0 && var31 < arg0 + arg2 && var32 >= arg1 && var32 < arg1 + arg3) {
            method2265(var31, var32, arg0, arg1);
        }
    }

    @ObfuscatedName("as.ad(ZI)V")
    public static final void method523(boolean arg0) {
        if (Statics.field714.field399 >> 7 == field679 && Statics.field714.field383 >> 7 == field676) {
            field679 = 0;
        }
        int var1 = field683;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field714;
                var4 = 33538048;
            } else {
                var3 = field566[field568[var2]];
                var4 = field568[var2] << 14;
            }
            if (var3 != null && var3.method11()) {
                var3.field44 = false;
                if ((field450 && field683 > 50 || field683 > 200) && !arg0 && var3.field408 == var3.field387) {
                    var3.field44 = true;
                }
                int var5 = var3.field399 >> 7;
                int var6 = var3.field383 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field37 == null || field668 < var3.field34 || field668 >= var3.field45) {
                        if ((var3.field399 & 0x7F) == 64 && (var3.field383 & 0x7F) == 64) {
                            if (field689 == field549[var5][var6]) {
                                continue;
                            }
                            field549[var5][var6] = field689;
                        }
                        var3.field33 = method1500(var3.field399, var3.field383, Statics.field1310);
                        Statics.field106.method1828(Statics.field1310, var3.field399, var3.field383, var3.field33, 60, var3, var3.field384, var4, var3.field385);
                    } else {
                        var3.field44 = false;
                        var3.field33 = method1500(var3.field399, var3.field383, Statics.field1310);
                        Statics.field106.method1845(Statics.field1310, var3.field399, var3.field383, var3.field33, 60, var3, var3.field384, var4, var3.field40, var3.field41, var3.field31, var3.field38);
                    }
                }
            }
        }
    }

    @ObfuscatedName("o.aw(ZI)V")
    public static final void method177(boolean arg0) {
        for (int var1 = 0; var1 < field483; var1++) {
            class25 var2 = field482[field484[var1]];
            int var3 = (field484[var1] << 14) + 536870912;
            if (var2 != null && var2.method11() && var2.field354.field768 == arg0 && var2.field354.method583()) {
                int var4 = var2.field399 >> 7;
                int var5 = var2.field383 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field433 == 1 && (var2.field399 & 0x7F) == 64 && (var2.field383 & 0x7F) == 64) {
                        if (field689 == field549[var4][var5]) {
                            continue;
                        }
                        field549[var4][var5] = field689;
                    }
                    if (!var2.field354.field776) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field106.method1828(Statics.field1310, var2.field399, var2.field383, method1500(var2.field399 + (var2.field433 * 64 - 64), var2.field383 + (var2.field433 * 64 - 64), Statics.field1310), var2.field433 * 64 - 64 + 60, var2, var2.field384, var3, var2.field385);
                }
            }
        }
    }

    @ObfuscatedName("c.an(I)I")
    public static final int method117() {
        if (Statics.field1825.field177) {
            return Statics.field1310;
        } else {
            int var0 = method1500(Statics.field881, Statics.field114, Statics.field1310);
            return var0 - Statics.field1428 >= 800 || (class9.field119[Statics.field1310][Statics.field881 >> 7][Statics.field114 >> 7] & 0x4) == 0 ? 3 : Statics.field1310;
        }
    }

    @ObfuscatedName("g.aq(IIIII)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3) {
        if (field667 == 1) {
            Statics.field2512[field550 / 100].method1635(field520 - 8, field554 - 8);
        }
        if (field667 == 2) {
            Statics.field2512[field550 / 100 + 4].method1635(field520 - 8, field554 - 8);
        }
        field565 = 0;
        int var4 = (Statics.field714.field399 >> 7) + Statics.field497;
        int var5 = (Statics.field714.field383 >> 7) + Statics.field904;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field565 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field565 = 1;
        }
        if (field565 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field565 = 0;
        }
        if (!field460) {
            return;
        }
        int var6 = arg0 + 512 - 5;
        int var7 = arg1 + 20;
        Statics.field63.method3328("Fps:" + field1292, var6, var7, 16776960, -1);
        int var11 = var7 + 15;
        Runtime var8 = Runtime.getRuntime();
        int var9 = (int) ((var8.totalMemory() - var8.freeMemory()) / 1024L);
        int var10 = 16776960;
        if (var9 > 32768 && field450) {
            var10 = 16711680;
        }
        if (var9 > 65536 && !field450) {
            var10 = 16711680;
        }
        Statics.field63.method3328("Mem:" + var9 + "k", var6, var11, var10, -1);
        var7 = var11 + 15;
    }

    @ObfuscatedName("eu.ax(IIII)V")
    public static final void method2637(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field551 = -1;
            field552 = -1;
            return;
        }
        int var3 = method1500(arg0, arg1, Statics.field1310) - arg2;
        int var4 = arg0 - Statics.field881;
        int var5 = var3 - Statics.field1428;
        int var6 = arg1 - Statics.field114;
        int var7 = class104.field1752[Statics.field1412];
        int var8 = class104.field1731[Statics.field1412];
        int var9 = class104.field1752[Statics.field110];
        int var10 = class104.field1731[Statics.field110];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field551 = (var11 << 9) / var15 + 256;
            field552 = (var14 << 9) / var15 + 167;
        } else {
            field551 = -1;
            field552 = -1;
        }
    }

    @ObfuscatedName("by.af(IIII)I")
    public static final int method1500(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class9.field130[var5][var3][var4] + class9.field130[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field130[var5][var3][var4 + 1] + class9.field130[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("h.ar(IIIIIIB)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class104.field1752[var6];
            int var12 = class104.field1731[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class104.field1752[var7];
            int var15 = class104.field1731[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field881 = arg0 - var8;
        Statics.field1428 = arg1 - var9;
        Statics.field114 = arg2 - var10;
        Statics.field1412 = arg3;
        Statics.field110 = arg4;
    }

    @ObfuscatedName("i.ay(ZI)V")
    public static final void method213(boolean arg0) {
        field640 = arg0;
        if (!field640) {
            int var1 = field487.method2441();
            int var2 = field487.method2484();
            int var3 = field487.method2441();
            int var4 = (field488 - field487.field2008) / 16;
            Statics.field846 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field846[var5][var6] = field487.method2415();
                }
            }
            int var7 = field487.method2539();
            int var8 = field487.method2442();
            Statics.field1726 = new int[var4];
            Statics.field1784 = new int[var4];
            Statics.field6 = new int[var4];
            Statics.field1644 = new byte[var4][];
            Statics.field257 = new byte[var4][];
            boolean var9 = false;
            if ((var7 / 8 == 48 || var7 / 8 == 49) && var8 / 8 == 48) {
                var9 = true;
            }
            if (var7 / 8 == 48 && var8 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var7 - 6) / 8; var11 <= (var7 + 6) / 8; var11++) {
                for (int var12 = (var8 - 6) / 8; var12 <= (var8 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field1726[var10] = var13;
                        Statics.field1784[var10] = Statics.field1973.method2934("m" + var11 + "_" + var12);
                        Statics.field6[var10] = Statics.field1973.method2934("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            Statics.method2685(var7, var8, var2, var3, var1);
            return;
        }
        int var14 = field487.method2433();
        int var15 = field487.method2442();
        int var16 = field487.method2443();
        int var17 = field487.method2539();
        int var18 = field487.method2442();
        field487.method2277();
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = field487.method2278(1);
                    if (var22 == 1) {
                        field506[var19][var20][var21] = field487.method2278(26);
                    } else {
                        field506[var19][var20][var21] = -1;
                    }
                }
            }
        }
        field487.method2279();
        int var23 = (field488 - field487.field2008) / 16;
        Statics.field846 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                Statics.field846[var24][var25] = field487.method2450();
            }
        }
        Statics.field1726 = new int[var23];
        Statics.field1784 = new int[var23];
        Statics.field6 = new int[var23];
        Statics.field1644 = new byte[var23][];
        Statics.field257 = new byte[var23][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field506[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field1726[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field1726[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field1784[var26] = Statics.field1973.method2934("m" + var35 + "_" + var36);
                            Statics.field6[var26] = Statics.field1973.method2934("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        Statics.method2685(var16, var18, var14, var17, var15);
    }

    @ObfuscatedName("du.ak(ZB)V")
    public static final void method2270(boolean arg0) {
        Statics.method132();
        field528++;
        if (field528 < 50 && !arg0) {
            return;
        }
        field528 = 0;
        if (field496 || Statics.field1244 == null) {
            return;
        }
        field485.method2275(105);
        try {
            Statics.field1244.method1357(field485.field2015, 0, field485.field2008);
            field485.field2008 = 0;
        } catch (IOException var2) {
            field496 = true;
        }
    }

    @ObfuscatedName("n.aa(I)V")
    public static final void method109() {
        method2270(false);
        field499 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1644.length; var1++) {
            if (Statics.field1784[var1] != -1 && Statics.field1644[var1] == null) {
                Statics.field1644[var1] = Statics.field1973.method2920(Statics.field1784[var1], 0);
                if (Statics.field1644[var1] == null) {
                    var0 = false;
                    field499++;
                }
            }
            if (Statics.field6[var1] != -1 && Statics.field257[var1] == null) {
                Statics.field257[var1] = Statics.field1973.method2921(Statics.field6[var1], 0, Statics.field846[var1]);
                if (Statics.field257[var1] == null) {
                    var0 = false;
                    field499++;
                }
            }
        }
        if (!var0) {
            field503 = 1;
            return;
        }
        field501 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1644.length; var3++) {
            byte[] var4 = Statics.field257[var3];
            if (var4 != null) {
                int var5 = (Statics.field1726[var3] >> 8) * 64 - Statics.field497;
                int var6 = (Statics.field1726[var3] & 0xFF) * 64 - Statics.field904;
                if (field640) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method18(var4, var5, var6);
            }
        }
        if (!var2) {
            field503 = 2;
            return;
        }
        if (field503 != 0) {
            method1378(class134.field2061 + class2.field17 + class2.field20 + 100 + "%" + class2.field21, true);
        }
        Statics.method132();
        method127();
        Statics.method132();
        Statics.field106.method1971();
        Statics.method132();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field504[var7].method3155();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field119[var8][var9][var10] = 0;
                }
            }
        }
        Statics.method132();
        class9.field121 = 99;
        Statics.field141 = new byte[4][104][104];
        Statics.field359 = new byte[4][104][104];
        Statics.field122 = new byte[4][104][104];
        Statics.field2383 = new byte[4][104][104];
        Statics.field1627 = new int[4][105][105];
        Statics.field1155 = new byte[4][105][105];
        Statics.field76 = new int[105][105];
        Statics.field310 = new int[104];
        Statics.field123 = new int[104];
        Statics.field2706 = new int[104];
        Statics.field1910 = new int[104];
        Statics.field1971 = new int[104];
        int var11 = Statics.field1644.length;
        for (class7 var12 = (class7) class7.field99.method3280(); var12 != null; var12 = (class7) class7.field99.method3269()) {
            if (var12.field92 != null) {
                Statics.field711.method1075(var12.field92);
                var12.field92 = null;
            }
            if (var12.field97 != null) {
                Statics.field711.method1075(var12.field97);
                var12.field97 = null;
            }
        }
        class7.field99.method3262();
        method2270(true);
        if (!field640) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field1726[var13] >> 8) * 64 - Statics.field497;
                int var15 = (Statics.field1726[var13] & 0xFF) * 64 - Statics.field904;
                byte[] var16 = Statics.field1644[var13];
                if (var16 != null) {
                    Statics.method132();
                    int var17 = Statics.field1245 * 8 - 48;
                    int var18 = Statics.field101 * 8 - 48;
                    class164[] var19 = field504;
                    for (int var20 = 0; var20 < 4; var20++) {
                        for (int var21 = 0; var21 < 64; var21++) {
                            for (int var22 = 0; var22 < 64; var22++) {
                                if (var14 + var21 > 0 && var14 + var21 < 103 && var15 + var22 > 0 && var15 + var22 < 103) {
                                    var19[var20].field2724[var14 + var21][var15 + var22] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class127 var23 = new class127(var16);
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 64; var25++) {
                            for (int var26 = 0; var26 < 64; var26++) {
                                class9.method3032(var23, var24, var14 + var25, var15 + var26, var17, var18, 0);
                            }
                        }
                    }
                }
            }
            for (int var27 = 0; var27 < var11; var27++) {
                int var28 = (Statics.field1726[var27] >> 8) * 64 - Statics.field497;
                int var29 = (Statics.field1726[var27] & 0xFF) * 64 - Statics.field904;
                byte[] var30 = Statics.field1644[var27];
                if (var30 == null && Statics.field101 < 800) {
                    Statics.method132();
                    class9.method2167(var28, var29, 64, 64);
                }
            }
            method2270(true);
            for (int var31 = 0; var31 < var11; var31++) {
                byte[] var32 = Statics.field257[var31];
                if (var32 != null) {
                    int var33 = (Statics.field1726[var31] >> 8) * 64 - Statics.field497;
                    int var34 = (Statics.field1726[var31] & 0xFF) * 64 - Statics.field904;
                    Statics.method132();
                    class95 var35 = Statics.field106;
                    class164[] var36 = field504;
                    class127 var37 = new class127(var32);
                    int var38 = -1;
                    while (true) {
                        int var39 = var37.method2437();
                        if (var39 == 0) {
                            break;
                        }
                        var38 += var39;
                        int var40 = 0;
                        while (true) {
                            int var41 = var37.method2437();
                            if (var41 == 0) {
                                break;
                            }
                            var40 += var41 - 1;
                            int var42 = var40 & 0x3F;
                            int var43 = var40 >> 6 & 0x3F;
                            int var44 = var40 >> 12;
                            int var45 = var37.method2484();
                            int var46 = var45 >> 2;
                            int var47 = var45 & 0x3;
                            int var48 = var33 + var43;
                            int var49 = var34 + var42;
                            if (var48 > 0 && var49 > 0 && var48 < 103 && var49 < 103) {
                                int var50 = var44;
                                if ((class9.field119[1][var48][var49] & 0x2) == 2) {
                                    var50 = var44 - 1;
                                }
                                class164 var51 = null;
                                if (var50 >= 0) {
                                    var51 = var36[var50];
                                }
                                class9.method22(var44, var48, var49, var38, var47, var46, var35, var51);
                            }
                        }
                    }
                }
            }
        }
        if (field640) {
            for (int var52 = 0; var52 < 4; var52++) {
                Statics.method132();
                for (int var53 = 0; var53 < 13; var53++) {
                    for (int var54 = 0; var54 < 13; var54++) {
                        boolean var55 = false;
                        int var56 = field506[var52][var53][var54];
                        if (var56 != -1) {
                            int var57 = var56 >> 24 & 0x3;
                            int var58 = var56 >> 1 & 0x3;
                            int var59 = var56 >> 14 & 0x3FF;
                            int var60 = var56 >> 3 & 0x7FF;
                            int var61 = (var59 / 8 << 8) + var60 / 8;
                            for (int var62 = 0; var62 < Statics.field1726.length; var62++) {
                                if (Statics.field1726[var62] == var61 && Statics.field1644[var62] != null) {
                                    byte[] var63 = Statics.field1644[var62];
                                    int var64 = var53 * 8;
                                    int var65 = var54 * 8;
                                    int var66 = (var59 & 0x7) * 8;
                                    int var67 = (var60 & 0x7) * 8;
                                    class164[] var68 = field504;
                                    for (int var69 = 0; var69 < 8; var69++) {
                                        for (int var70 = 0; var70 < 8; var70++) {
                                            if (var64 + var69 > 0 && var64 + var69 < 103 && var65 + var70 > 0 && var65 + var70 < 103) {
                                                var68[var52].field2724[var64 + var69][var65 + var70] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class127 var71 = new class127(var63);
                                    for (int var72 = 0; var72 < 4; var72++) {
                                        for (int var73 = 0; var73 < 64; var73++) {
                                            for (int var74 = 0; var74 < 64; var74++) {
                                                if (var57 == var72 && var73 >= var66 && var73 < var66 + 8 && var74 >= var67 && var74 < var67 + 8) {
                                                    class9.method3032(var71, var52, var64 + class160.method1615(var73 & 0x7, var74 & 0x7, var58), var65 + class160.method43(var73 & 0x7, var74 & 0x7, var58), 0, 0, var58);
                                                } else {
                                                    class9.method3032(var71, 0, -1, -1, 0, 0, 0);
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
                            int var75 = var52;
                            int var76 = var53 * 8;
                            int var77 = var54 * 8;
                            for (int var78 = 0; var78 < 8; var78++) {
                                for (int var79 = 0; var79 < 8; var79++) {
                                    class9.field130[var75][var76 + var78][var77 + var79] = 0;
                                }
                            }
                            if (var76 > 0) {
                                for (int var80 = 1; var80 < 8; var80++) {
                                    class9.field130[var75][var76][var77 + var80] = class9.field130[var75][var76 - 1][var77 + var80];
                                }
                            }
                            if (var77 > 0) {
                                for (int var81 = 1; var81 < 8; var81++) {
                                    class9.field130[var75][var76 + var81][var77] = class9.field130[var75][var76 + var81][var77 - 1];
                                }
                            }
                            if (var76 > 0 && class9.field130[var75][var76 - 1][var77] != 0) {
                                class9.field130[var75][var76][var77] = class9.field130[var75][var76 - 1][var77];
                            } else if (var77 > 0 && class9.field130[var75][var76][var77 - 1] != 0) {
                                class9.field130[var75][var76][var77] = class9.field130[var75][var76][var77 - 1];
                            } else if (var76 > 0 && var77 > 0 && class9.field130[var75][var76 - 1][var77 - 1] != 0) {
                                class9.field130[var75][var76][var77] = class9.field130[var75][var76 - 1][var77 - 1];
                            }
                        }
                    }
                }
            }
            for (int var82 = 0; var82 < 13; var82++) {
                for (int var83 = 0; var83 < 13; var83++) {
                    int var84 = field506[0][var82][var83];
                    if (var84 == -1) {
                        class9.method2167(var82 * 8, var83 * 8, 8, 8);
                    }
                }
            }
            method2270(true);
            for (int var85 = 0; var85 < 4; var85++) {
                Statics.method132();
                for (int var86 = 0; var86 < 13; var86++) {
                    for (int var87 = 0; var87 < 13; var87++) {
                        int var88 = field506[var85][var86][var87];
                        if (var88 != -1) {
                            int var89 = var88 >> 24 & 0x3;
                            int var90 = var88 >> 1 & 0x3;
                            int var91 = var88 >> 14 & 0x3FF;
                            int var92 = var88 >> 3 & 0x7FF;
                            int var93 = (var91 / 8 << 8) + var92 / 8;
                            for (int var94 = 0; var94 < Statics.field1726.length; var94++) {
                                if (Statics.field1726[var94] == var93 && Statics.field257[var94] != null) {
                                    class9.method732(Statics.field257[var94], var85, var86 * 8, var87 * 8, var89, (var91 & 0x7) * 8, (var92 & 0x7) * 8, var90, Statics.field106, field504);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method2270(true);
        method127();
        Statics.method132();
        class95 var95 = Statics.field106;
        class164[] var96 = field504;
        for (int var97 = 0; var97 < 4; var97++) {
            for (int var98 = 0; var98 < 104; var98++) {
                for (int var99 = 0; var99 < 104; var99++) {
                    if ((class9.field119[var97][var98][var99] & 0x1) == 1) {
                        int var100 = var97;
                        if ((class9.field119[1][var98][var99] & 0x2) == 2) {
                            var100 = var97 - 1;
                        }
                        if (var100 >= 0) {
                            var96[var100].method3165(var98, var99);
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
        class9.field134 += (int) (Math.random() * 5.0D) - 2;
        if (class9.field134 < -16) {
            class9.field134 = -16;
        }
        if (class9.field134 > 16) {
            class9.field134 = 16;
        }
        for (int var101 = 0; var101 < 4; var101++) {
            byte[][] var102 = Statics.field1155[var101];
            int var103 = (int) Math.sqrt(5100.0D);
            int var104 = var103 * 768 >> 8;
            for (int var105 = 1; var105 < 103; var105++) {
                for (int var106 = 1; var106 < 103; var106++) {
                    int var107 = class9.field130[var101][var106 + 1][var105] - class9.field130[var101][var106 - 1][var105];
                    int var108 = class9.field130[var101][var106][var105 + 1] - class9.field130[var101][var106][var105 - 1];
                    int var109 = (int) Math.sqrt((double) (var108 * var108 + var107 * var107 + 65536));
                    int var110 = (var107 << 8) / var109;
                    int var111 = 65536 / var109;
                    int var112 = (var108 << 8) / var109;
                    int var113 = (var112 * -50 + var110 * -50 + var111 * -10) / var104 + 96;
                    int var114 = (var102[var106][var105] >> 1) + (var102[var106][var105 + 1] >> 3) + (var102[var106][var105 - 1] >> 2) + (var102[var106 - 1][var105] >> 2) + (var102[var106 + 1][var105] >> 3);
                    Statics.field76[var106][var105] = var113 - var114;
                }
            }
            for (int var115 = 0; var115 < 104; var115++) {
                Statics.field310[var115] = 0;
                Statics.field123[var115] = 0;
                Statics.field2706[var115] = 0;
                Statics.field1910[var115] = 0;
                Statics.field1971[var115] = 0;
            }
            for (int var116 = -5; var116 < 109; var116++) {
                for (int var117 = 0; var117 < 104; var117++) {
                    int var118 = var116 + 5;
                    int var10002;
                    if (var118 >= 0 && var118 < 104) {
                        int var119 = Statics.field141[var101][var118][var117] & 0xFF;
                        if (var119 > 0) {
                            int var120 = var119 - 1;
                            class33 var121 = (class33) class33.field844.method3196((long) var120);
                            class33 var122;
                            if (var121 == null) {
                                byte[] var123 = Statics.field838.method2920(1, var120);
                                class33 var124 = new class33();
                                if (var123 != null) {
                                    var124.method654(new class127(var123), var120);
                                }
                                var124.method669();
                                class33.field844.method3197(var124, (long) var120);
                                var122 = var124;
                            } else {
                                var122 = var121;
                            }
                            Statics.field310[var117] += var122.field840;
                            Statics.field123[var117] += var122.field841;
                            Statics.field2706[var117] += var122.field842;
                            Statics.field1910[var117] += var122.field843;
                            var10002 = Statics.field1971[var117]++;
                        }
                    }
                    int var126 = var116 - 5;
                    if (var126 >= 0 && var126 < 104) {
                        int var127 = Statics.field141[var101][var126][var117] & 0xFF;
                        if (var127 > 0) {
                            int var128 = var127 - 1;
                            class33 var129 = (class33) class33.field844.method3196((long) var128);
                            class33 var130;
                            if (var129 == null) {
                                byte[] var131 = Statics.field838.method2920(1, var128);
                                class33 var132 = new class33();
                                if (var131 != null) {
                                    var132.method654(new class127(var131), var128);
                                }
                                var132.method669();
                                class33.field844.method3197(var132, (long) var128);
                                var130 = var132;
                            } else {
                                var130 = var129;
                            }
                            Statics.field310[var117] -= var130.field840;
                            Statics.field123[var117] -= var130.field841;
                            Statics.field2706[var117] -= var130.field842;
                            Statics.field1910[var117] -= var130.field843;
                            var10002 = Statics.field1971[var117]--;
                        }
                    }
                }
                if (var116 >= 1 && var116 < 103) {
                    int var134 = 0;
                    int var135 = 0;
                    int var136 = 0;
                    int var137 = 0;
                    int var138 = 0;
                    for (int var139 = -5; var139 < 109; var139++) {
                        int var140 = var139 + 5;
                        if (var140 >= 0 && var140 < 104) {
                            var134 += Statics.field310[var140];
                            var135 += Statics.field123[var140];
                            var136 += Statics.field2706[var140];
                            var137 += Statics.field1910[var140];
                            var138 += Statics.field1971[var140];
                        }
                        int var141 = var139 - 5;
                        if (var141 >= 0 && var141 < 104) {
                            var134 -= Statics.field310[var141];
                            var135 -= Statics.field123[var141];
                            var136 -= Statics.field2706[var141];
                            var137 -= Statics.field1910[var141];
                            var138 -= Statics.field1971[var141];
                        }
                        if (var139 >= 1 && var139 < 103) {
                            if (field450 && (class9.field119[0][var116][var139] & 0x2) == 0) {
                                if ((class9.field119[var101][var116][var139] & 0x10) != 0) {
                                    continue;
                                }
                                int var142;
                                if ((class9.field119[var101][var116][var139] & 0x8) != 0) {
                                    var142 = 0;
                                } else if (var101 <= 0 || (class9.field119[1][var116][var139] & 0x2) == 0) {
                                    var142 = var101;
                                } else {
                                    var142 = var101 - 1;
                                }
                                if (field616 != var142) {
                                    continue;
                                }
                            }
                            if (var101 < class9.field121) {
                                class9.field121 = var101;
                            }
                            int var143 = Statics.field141[var101][var116][var139] & 0xFF;
                            int var144 = Statics.field359[var101][var116][var139] & 0xFF;
                            if (var143 > 0 || var144 > 0) {
                                int var145 = class9.field130[var101][var116][var139];
                                int var146 = class9.field130[var101][var116 + 1][var139];
                                int var147 = class9.field130[var101][var116 + 1][var139 + 1];
                                int var148 = class9.field130[var101][var116][var139 + 1];
                                int var149 = Statics.field76[var116][var139];
                                int var150 = Statics.field76[var116 + 1][var139];
                                int var151 = Statics.field76[var116 + 1][var139 + 1];
                                int var152 = Statics.field76[var116][var139 + 1];
                                int var153 = -1;
                                int var154 = -1;
                                if (var143 > 0) {
                                    int var155 = var134 * 256 / var137;
                                    int var156 = var135 / var138;
                                    int var157 = var136 / var138;
                                    var153 = class9.method1457(var155, var156, var157);
                                    int var158 = class9.field133 + var155 & 0xFF;
                                    int var159 = class9.field134 + var157;
                                    if (var159 < 0) {
                                        var159 = 0;
                                    } else if (var159 > 255) {
                                        var159 = 255;
                                    }
                                    var154 = class9.method1457(var158, var156, var159);
                                }
                                if (var101 > 0) {
                                    boolean var160 = true;
                                    if (var143 == 0 && Statics.field122[var101][var116][var139] != 0) {
                                        var160 = false;
                                    }
                                    if (var144 > 0 && !class37.method169(var144 - 1).field914) {
                                        var160 = false;
                                    }
                                    if (var160 && var145 == var146 && var145 == var147 && var145 == var148) {
                                        Statics.field1627[var101][var116][var139] |= 0x924;
                                    }
                                }
                                int var161 = 0;
                                if (var154 != -1) {
                                    var161 = class104.field1748[class9.method141(var154, 96)];
                                }
                                if (var144 == 0) {
                                    var95.method1853(var101, var116, var139, 0, 0, -1, var145, var146, var147, var148, class9.method141(var153, var149), class9.method141(var153, var150), class9.method141(var153, var151), class9.method141(var153, var152), 0, 0, 0, 0, var161, 0);
                                } else {
                                    int var162 = Statics.field122[var101][var116][var139] + 1;
                                    byte var163 = Statics.field2383[var101][var116][var139];
                                    class37 var164 = class37.method169(var144 - 1);
                                    int var165 = var164.field913;
                                    int var166;
                                    int var167;
                                    if (var165 >= 0) {
                                        var166 = Statics.field1749.method2150(var165);
                                        var167 = -1;
                                    } else if (var164.field912 == 16711935) {
                                        var167 = -2;
                                        var165 = -1;
                                        var166 = -2;
                                    } else {
                                        var167 = class9.method1457(var164.field916, var164.field917, var164.field918);
                                        int var168 = class9.field133 + var164.field916 & 0xFF;
                                        int var169 = class9.field134 + var164.field918;
                                        if (var169 < 0) {
                                            var169 = 0;
                                        } else if (var169 > 255) {
                                            var169 = 255;
                                        }
                                        var166 = class9.method1457(var168, var164.field917, var169);
                                    }
                                    int var170 = 0;
                                    if (var166 != -2) {
                                        var170 = class104.field1748[class9.method20(var166, 96)];
                                    }
                                    if (var164.field915 != -1) {
                                        int var171 = class9.field133 + var164.field919 & 0xFF;
                                        int var172 = class9.field134 + var164.field921;
                                        if (var172 < 0) {
                                            var172 = 0;
                                        } else if (var172 > 255) {
                                            var172 = 255;
                                        }
                                        int var173 = class9.method1457(var171, var164.field920, var172);
                                        var170 = class104.field1748[class9.method20(var173, 96)];
                                    }
                                    var95.method1853(var101, var116, var139, var162, var163, var165, var145, var146, var147, var148, class9.method141(var153, var149), class9.method141(var153, var150), class9.method141(var153, var151), class9.method141(var153, var152), class9.method20(var167, var149), class9.method20(var167, var150), class9.method20(var167, var151), class9.method20(var167, var152), var161, var170);
                                }
                            }
                        }
                    }
                }
            }
            for (int var174 = 1; var174 < 103; var174++) {
                for (int var175 = 1; var175 < 103; var175++) {
                    int var180;
                    if ((class9.field119[var101][var175][var174] & 0x8) != 0) {
                        var180 = 0;
                    } else if (var101 <= 0 || (class9.field119[1][var175][var174] & 0x2) == 0) {
                        var180 = var101;
                    } else {
                        var180 = var101 - 1;
                    }
                    var95.method1980(var101, var175, var174, var180);
                }
            }
            Statics.field141[var101] = (byte[][]) null;
            Statics.field359[var101] = (byte[][]) null;
            Statics.field122[var101] = (byte[][]) null;
            Statics.field2383[var101] = (byte[][]) null;
            Statics.field1155[var101] = (byte[][]) null;
        }
        var95.method1847(-50, -10, -50);
        for (int var181 = 0; var181 < 104; var181++) {
            for (int var182 = 0; var182 < 104; var182++) {
                if ((class9.field119[1][var181][var182] & 0x2) == 2) {
                    var95.method1819(var181, var182);
                }
            }
        }
        int var183 = 1;
        int var184 = 2;
        int var185 = 4;
        for (int var186 = 0; var186 < 4; var186++) {
            if (var186 > 0) {
                var183 <<= 0x3;
                var184 <<= 0x3;
                var185 <<= 0x3;
            }
            for (int var187 = 0; var187 <= var186; var187++) {
                for (int var188 = 0; var188 <= 104; var188++) {
                    for (int var189 = 0; var189 <= 104; var189++) {
                        if ((Statics.field1627[var187][var189][var188] & var183) != 0) {
                            int var190 = var188;
                            int var191 = var188;
                            int var192 = var187;
                            int var193 = var187;
                            while (var190 > 0 && (Statics.field1627[var187][var189][var190 - 1] & var183) != 0) {
                                var190--;
                            }
                            while (var191 < 104 && (Statics.field1627[var187][var189][var191 + 1] & var183) != 0) {
                                var191++;
                            }
                            label705: while (var192 > 0) {
                                for (int var194 = var190; var194 <= var191; var194++) {
                                    if ((Statics.field1627[var192 - 1][var189][var194] & var183) == 0) {
                                        break label705;
                                    }
                                }
                                var192--;
                            }
                            label694: while (var193 < var186) {
                                for (int var195 = var190; var195 <= var191; var195++) {
                                    if ((Statics.field1627[var193 + 1][var189][var195] & var183) == 0) {
                                        break label694;
                                    }
                                }
                                var193++;
                            }
                            int var196 = (var193 + 1 - var192) * (var191 - var190 + 1);
                            if (var196 >= 8) {
                                short var197 = 240;
                                int var198 = class9.field130[var193][var189][var190] - var197;
                                int var199 = class9.field130[var192][var189][var190];
                                class95.method1964(var186, 1, var189 * 128, var189 * 128, var190 * 128, var191 * 128 + 128, var198, var199);
                                for (int var200 = var192; var200 <= var193; var200++) {
                                    for (int var201 = var190; var201 <= var191; var201++) {
                                        Statics.field1627[var200][var189][var201] &= ~var183;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1627[var187][var189][var188] & var184) != 0) {
                            int var202 = var189;
                            int var203 = var189;
                            int var204 = var187;
                            int var205 = var187;
                            while (var202 > 0 && (Statics.field1627[var187][var202 - 1][var188] & var184) != 0) {
                                var202--;
                            }
                            while (var203 < 104 && (Statics.field1627[var187][var203 + 1][var188] & var184) != 0) {
                                var203++;
                            }
                            label758: while (var204 > 0) {
                                for (int var206 = var202; var206 <= var203; var206++) {
                                    if ((Statics.field1627[var204 - 1][var206][var188] & var184) == 0) {
                                        break label758;
                                    }
                                }
                                var204--;
                            }
                            label747: while (var205 < var186) {
                                for (int var207 = var202; var207 <= var203; var207++) {
                                    if ((Statics.field1627[var205 + 1][var207][var188] & var184) == 0) {
                                        break label747;
                                    }
                                }
                                var205++;
                            }
                            int var208 = (var205 + 1 - var204) * (var203 - var202 + 1);
                            if (var208 >= 8) {
                                short var209 = 240;
                                int var210 = class9.field130[var205][var202][var188] - var209;
                                int var211 = class9.field130[var204][var202][var188];
                                class95.method1964(var186, 2, var202 * 128, var203 * 128 + 128, var188 * 128, var188 * 128, var210, var211);
                                for (int var212 = var204; var212 <= var205; var212++) {
                                    for (int var213 = var202; var213 <= var203; var213++) {
                                        Statics.field1627[var212][var213][var188] &= ~var184;
                                    }
                                }
                            }
                        }
                        if ((Statics.field1627[var187][var189][var188] & var185) != 0) {
                            int var214 = var189;
                            int var215 = var189;
                            int var216 = var188;
                            int var217 = var188;
                            while (var216 > 0 && (Statics.field1627[var187][var189][var216 - 1] & var185) != 0) {
                                var216--;
                            }
                            while (var217 < 104 && (Statics.field1627[var187][var189][var217 + 1] & var185) != 0) {
                                var217++;
                            }
                            label811: while (var214 > 0) {
                                for (int var218 = var216; var218 <= var217; var218++) {
                                    if ((Statics.field1627[var187][var214 - 1][var218] & var185) == 0) {
                                        break label811;
                                    }
                                }
                                var214--;
                            }
                            label800: while (var215 < 104) {
                                for (int var219 = var216; var219 <= var217; var219++) {
                                    if ((Statics.field1627[var187][var215 + 1][var219] & var185) == 0) {
                                        break label800;
                                    }
                                }
                                var215++;
                            }
                            if ((var215 - var214 + 1) * (var217 - var216 + 1) >= 4) {
                                int var220 = class9.field130[var187][var214][var216];
                                class95.method1964(var186, 4, var214 * 128, var215 * 128 + 128, var216 * 128, var217 * 128 + 128, var220, var220);
                                for (int var221 = var214; var221 <= var215; var221++) {
                                    for (int var222 = var216; var222 <= var217; var222++) {
                                        Statics.field1627[var187][var221][var222] &= ~var185;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        method2270(true);
        int var223 = class9.field121;
        if (var223 > Statics.field1310) {
            var223 = Statics.field1310;
        }
        if (var223 < Statics.field1310 - 1) {
            int var224 = Statics.field1310 - 1;
        }
        if (field450) {
            Statics.field106.method1818(class9.field121);
        } else {
            Statics.field106.method1818(0);
        }
        for (int var225 = 0; var225 < 104; var225++) {
            for (int var226 = 0; var226 < 104; var226++) {
                method2633(var225, var226);
            }
        }
        Statics.method132();
        for (class22 var227 = (class22) field581.method3280(); var227 != null; var227 = (class22) field581.method3269()) {
            if (var227.field325 == -1) {
                var227.field324 = 0;
                method1203(var227);
            } else {
                var227.method3301();
            }
        }
        class32.field784.method3198();
        if (Statics.field331 != null) {
            field485.method2275(26);
            field485.method2470(1057001181);
        }
        if (!field640) {
            int var228 = (Statics.field1245 - 6) / 8;
            int var229 = (Statics.field1245 + 6) / 8;
            int var230 = (Statics.field101 - 6) / 8;
            int var231 = (Statics.field101 + 6) / 8;
            for (int var232 = var228 - 1; var232 <= var229 + 1; var232++) {
                for (int var233 = var230 - 1; var233 <= var231 + 1; var233++) {
                    if (var232 < var228 || var232 > var229 || var233 < var230 || var233 > var231) {
                        Statics.field1973.method2938("m" + var232 + "_" + var233);
                        Statics.field1973.method2938("l" + var232 + "_" + var233);
                    }
                }
            }
        }
        Statics.method2148(30);
        Statics.method132();
        class9.method164();
        field485.method2275(139);
        Statics.field2038.method1318();
        for (int var234 = 0; var234 < 32; var234++) {
            field1297[var234] = 0L;
        }
        for (int var235 = 0; var235 < 32; var235++) {
            field1296[var235] = 0L;
        }
        Statics.field340 = 0;
    }

    @ObfuscatedName("bx.av(IIIIIS)V")
    public static final void method1372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field106.method1842(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field106.method1985(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1157.field1444;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class32 var13 = class32.method1131(var12);
            if (var13.field810 == -1) {
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
                class87 var14 = Statics.field127[var13.field810];
                if (var14 != null) {
                    int var15 = (var13.field796 * 4 - var14.field1454) / 2;
                    int var16 = (var13.field807 * 4 - var14.field1452) / 2;
                    var14.method1721(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field807) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field106.method1864(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field106.method1985(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class32 var22 = class32.method1131(var21);
            if (var22.field810 != -1) {
                class87 var23 = Statics.field127[var22.field810];
                if (var23 != null) {
                    int var24 = (var22.field796 * 4 - var23.field1454) / 2;
                    int var25 = (var22.field807 * 4 - var23.field1452) / 2;
                    var23.method1721(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field807) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1157.field1444;
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
        int var29 = Statics.field106.method1821(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class32 var31 = class32.method1131(var30);
        if (var31.field810 == -1) {
            return;
        }
        class87 var32 = Statics.field127[var31.field810];
        if (var32 != null) {
            int var33 = (var31.field796 * 4 - var32.field1454) / 2;
            int var34 = (var31.field807 * 4 - var32.field1452) / 2;
            var32.method1721(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field807) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("s.ah(IIIB)Z")
    public static final boolean method91(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field106.method1985(Statics.field1310, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class32 var7 = class32.method1131(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field796;
                var9 = var7.field807;
            } else {
                var8 = var7.field807;
                var9 = var7.field796;
            }
            int var10 = var7.field834;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field520 = class77.field1372;
        field554 = class77.field1369;
        field667 = 2;
        field550 = 0;
        return true;
    }

    @ObfuscatedName("ah.bz(I)V")
    public static final void method1156() {
        if (field489 == 204) {
            int var0 = field487.method2442();
            int var1 = field487.method2432();
            int var2 = (var1 >> 4 & 0x7) + Statics.field243;
            int var3 = (var1 & 0x7) + Statics.field109;
            int var4 = field487.method2443();
            int var5 = field487.method2539();
            if (var2 >= 0 && var3 >= 0 && var2 < 104 && var3 < 104 && field570 != var5) {
                class17 var6 = new class17();
                var6.field242 = var0;
                var6.field241 = var4;
                if (field639[Statics.field1310][var2][var3] == null) {
                    field639[Statics.field1310][var2][var3] = new class177();
                }
                field639[Statics.field1310][var2][var3].method3264(var6);
                method2633(var2, var3);
            }
        } else if (field489 == 17) {
            int var7 = field487.method2539();
            int var8 = field487.method2433();
            int var9 = (var8 >> 4 & 0x7) + Statics.field243;
            int var10 = (var8 & 0x7) + Statics.field109;
            int var11 = field487.method2434();
            int var12 = var11 >> 2;
            int var13 = var11 & 0x3;
            int var14 = field507[var12];
            if (var9 >= 0 && var10 >= 0 && var9 < 104 && var10 < 104) {
                method83(Statics.field1310, var9, var10, var14, var7, var12, var13, 0, -1);
            }
        } else if (field489 == 33) {
            int var15 = field487.method2443();
            int var16 = field487.method2539();
            int var17 = field487.method2432();
            int var18 = (var17 >> 4 & 0x7) + Statics.field243;
            int var19 = (var17 & 0x7) + Statics.field109;
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                class17 var20 = new class17();
                var20.field242 = var15;
                var20.field241 = var16;
                if (field639[Statics.field1310][var18][var19] == null) {
                    field639[Statics.field1310][var18][var19] = new class177();
                }
                field639[Statics.field1310][var18][var19].method3264(var20);
                method2633(var18, var19);
            }
        } else if (field489 == 138) {
            int var21 = field487.method2484();
            int var22 = (var21 >> 4 & 0x7) + Statics.field243;
            int var23 = (var21 & 0x7) + Statics.field109;
            int var24 = var22 + field487.method2411();
            int var25 = var23 + field487.method2411();
            int var26 = field487.method2517();
            int var27 = field487.method2539();
            int var28 = field487.method2484() * 4;
            int var29 = field487.method2484() * 4;
            int var30 = field487.method2539();
            int var31 = field487.method2539();
            int var32 = field487.method2484();
            int var33 = field487.method2484();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && var27 != 65535) {
                int var34 = var22 * 128 + 64;
                int var35 = var23 * 128 + 64;
                int var36 = var24 * 128 + 64;
                int var37 = var25 * 128 + 64;
                class10 var38 = new class10(var27, Statics.field1310, var34, var35, method1500(var34, var35, Statics.field1310) - var28, field668 + var30, field668 + var31, var32, var33, var26, var29);
                var38.method92(var36, var37, method1500(var36, var37, Statics.field1310) - var29, field668 + var30);
                field582.method3264(var38);
            }
        } else if (field489 == 192) {
            int var39 = field487.method2484();
            int var40 = (var39 >> 4 & 0x7) + Statics.field243;
            int var41 = (var39 & 0x7) + Statics.field109;
            int var42 = field487.method2539();
            int var43 = field487.method2539();
            int var44 = field487.method2539();
            if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                class177 var45 = field639[Statics.field1310][var40][var41];
                if (var45 != null) {
                    for (class17 var46 = (class17) var45.method3280(); var46 != null; var46 = (class17) var45.method3269()) {
                        if ((var42 & 0x7FFF) == var46.field242 && var46.field241 == var43) {
                            var46.field241 = var44;
                            break;
                        }
                    }
                    method2633(var40, var41);
                }
            }
        } else {
            if (field489 == 41) {
                int var47 = field487.method2484();
                int var48 = (var47 >> 4 & 0x7) + Statics.field243;
                int var49 = (var47 & 0x7) + Statics.field109;
                int var50 = field487.method2539();
                int var51 = field487.method2484();
                int var52 = var51 >> 4 & 0xF;
                int var53 = var51 & 0x7;
                int var54 = field487.method2484();
                if (var48 >= 0 && var49 >= 0 && var48 < 104 && var49 < 104) {
                    int var55 = var52 + 1;
                    if (Statics.field714.field420[0] >= var48 - var55 && Statics.field714.field420[0] <= var48 + var55 && Statics.field714.field436[0] >= var49 - var55 && Statics.field714.field436[0] <= var49 + var55 && field575 != 0 && var53 > 0 && field478 < 50) {
                        field688[field478] = var50;
                        field673[field478] = var53;
                        field690[field478] = var54;
                        field610[field478] = null;
                        field513[field478] = (var48 << 16) + (var49 << 8) + var52;
                        field478++;
                    }
                }
            }
            if (field489 == 245) {
                byte var56 = field487.method2411();
                int var57 = field487.method2443();
                byte var58 = field487.method2478();
                int var59 = field487.method2441();
                int var60 = field487.method2484();
                int var61 = var60 >> 2;
                int var62 = var60 & 0x3;
                int var63 = field507[var61];
                int var64 = field487.method2484();
                int var65 = (var64 >> 4 & 0x7) + Statics.field243;
                int var66 = (var64 & 0x7) + Statics.field109;
                int var67 = field487.method2539();
                byte var68 = field487.method2471();
                byte var69 = field487.method2411();
                int var70 = field487.method2539();
                class3 var71;
                if (field570 == var67) {
                    var71 = Statics.field714;
                } else {
                    var71 = field566[var67];
                }
                if (var71 != null) {
                    class32 var72 = class32.method1131(var59);
                    int var73;
                    int var74;
                    if (var62 == 1 || var62 == 3) {
                        var73 = var72.field807;
                        var74 = var72.field796;
                    } else {
                        var73 = var72.field796;
                        var74 = var72.field807;
                    }
                    int var75 = (var73 >> 1) + var65;
                    int var76 = (var73 + 1 >> 1) + var65;
                    int var77 = (var74 >> 1) + var66;
                    int var78 = (var74 + 1 >> 1) + var66;
                    int[][] var79 = class9.field130[Statics.field1310];
                    int var80 = var79[var75][var77] + var79[var76][var77] + var79[var75][var78] + var79[var76][var78] >> 2;
                    int var81 = (var65 << 7) + (var73 << 6);
                    int var82 = (var66 << 7) + (var74 << 6);
                    class112 var83 = var72.method618(var61, var62, var79, var81, var80, var82);
                    if (var83 != null) {
                        method83(Statics.field1310, var65, var66, var63, -1, 0, 0, var70 + 1, var57 + 1);
                        var71.field34 = field668 + var70;
                        var71.field45 = field668 + var57;
                        var71.field37 = var83;
                        var71.field36 = var65 * 128 + var73 * 64;
                        var71.field47 = var66 * 128 + var74 * 64;
                        var71.field35 = var80;
                        if (var56 > var58) {
                            byte var84 = var56;
                            var56 = var58;
                            var58 = var84;
                        }
                        if (var69 > var68) {
                            byte var85 = var69;
                            var69 = var68;
                            var68 = var85;
                        }
                        var71.field40 = var56 + var65;
                        var71.field31 = var58 + var65;
                        var71.field41 = var66 + var69;
                        var71.field38 = var66 + var68;
                    }
                }
            }
            if (field489 == 163) {
                int var86 = field487.method2432();
                int var87 = var86 >> 2;
                int var88 = var86 & 0x3;
                int var89 = field507[var87];
                int var90 = field487.method2443();
                int var91 = field487.method2432();
                int var92 = (var91 >> 4 & 0x7) + Statics.field243;
                int var93 = (var91 & 0x7) + Statics.field109;
                if (var92 >= 0 && var93 >= 0 && var92 < 103 && var93 < 103) {
                    if (var89 == 0) {
                        class96 var94 = Statics.field106.method1852(Statics.field1310, var92, var93);
                        if (var94 != null) {
                            int var95 = var94.field1598 >> 14 & 0x7FFF;
                            if (var87 == 2) {
                                var94.field1596 = new class14(var95, 2, var88 + 4, Statics.field1310, var92, var93, var90, false, var94.field1596);
                                var94.field1597 = new class14(var95, 2, var88 + 1 & 0x3, Statics.field1310, var92, var93, var90, false, var94.field1597);
                            } else {
                                var94.field1596 = new class14(var95, var87, var88, Statics.field1310, var92, var93, var90, false, var94.field1596);
                            }
                        }
                    }
                    if (var89 == 1) {
                        class108 var96 = Statics.field106.method1839(Statics.field1310, var92, var93);
                        if (var96 != null) {
                            int var97 = var96.field1783 >> 14 & 0x7FFF;
                            if (var87 == 4 || var87 == 5) {
                                var96.field1778 = new class14(var97, 4, var88, Statics.field1310, var92, var93, var90, false, var96.field1778);
                            } else if (var87 == 6) {
                                var96.field1778 = new class14(var97, 4, var88 + 4, Statics.field1310, var92, var93, var90, false, var96.field1778);
                            } else if (var87 == 7) {
                                var96.field1778 = new class14(var97, 4, (var88 + 2 & 0x3) + 4, Statics.field1310, var92, var93, var90, false, var96.field1778);
                            } else if (var87 == 8) {
                                var96.field1778 = new class14(var97, 4, var88 + 4, Statics.field1310, var92, var93, var90, false, var96.field1778);
                                var96.field1780 = new class14(var97, 4, (var88 + 2 & 0x3) + 4, Statics.field1310, var92, var93, var90, false, var96.field1780);
                            }
                        }
                    }
                    if (var89 == 2) {
                        class98 var98 = Statics.field106.method1840(Statics.field1310, var92, var93);
                        if (var87 == 11) {
                            var87 = 10;
                        }
                        if (var98 != null) {
                            var98.field1617 = new class14(var98.field1625 >> 14 & 0x7FFF, var87, var88, Statics.field1310, var92, var93, var90, false, var98.field1617);
                        }
                    }
                    if (var89 == 3) {
                        class107 var99 = Statics.field106.method1841(Statics.field1310, var92, var93);
                        if (var99 != null) {
                            var99.field1771 = new class14(var99.field1769 >> 14 & 0x7FFF, 22, var88, Statics.field1310, var92, var93, var90, false, var99.field1771);
                        }
                    }
                }
            } else if (field489 == 123) {
                int var100 = field487.method2434();
                int var101 = (var100 >> 4 & 0x7) + Statics.field243;
                int var102 = (var100 & 0x7) + Statics.field109;
                int var103 = field487.method2443();
                if (var101 >= 0 && var102 >= 0 && var101 < 104 && var102 < 104) {
                    class177 var104 = field639[Statics.field1310][var101][var102];
                    if (var104 != null) {
                        for (class17 var105 = (class17) var104.method3280(); var105 != null; var105 = (class17) var104.method3269()) {
                            if ((var103 & 0x7FFF) == var105.field242) {
                                var105.method3301();
                                break;
                            }
                        }
                        if (var104.method3280() == null) {
                            field639[Statics.field1310][var101][var102] = null;
                        }
                        method2633(var101, var102);
                    }
                }
            } else if (field489 == 107) {
                int var106 = field487.method2432();
                int var107 = (var106 >> 4 & 0x7) + Statics.field243;
                int var108 = (var106 & 0x7) + Statics.field109;
                int var109 = field487.method2433();
                int var110 = var109 >> 2;
                int var111 = var109 & 0x3;
                int var112 = field507[var110];
                if (var107 >= 0 && var108 >= 0 && var107 < 104 && var108 < 104) {
                    method83(Statics.field1310, var107, var108, var112, -1, var110, var111, 0, -1);
                }
            } else if (field489 == 159) {
                int var113 = field487.method2484();
                int var114 = (var113 >> 4 & 0x7) + Statics.field243;
                int var115 = (var113 & 0x7) + Statics.field109;
                int var116 = field487.method2539();
                int var117 = field487.method2484();
                int var118 = field487.method2539();
                if (var114 >= 0 && var115 >= 0 && var114 < 104 && var115 < 104) {
                    int var119 = var114 * 128 + 64;
                    int var120 = var115 * 128 + 64;
                    class20 var121 = new class20(var116, Statics.field1310, var119, var120, method1500(var119, var120, Statics.field1310) - var117, var118, field668);
                    field455.method3264(var121);
                }
            }
        }
    }

    @ObfuscatedName("l.bl(IIIIIIIIII)V")
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class22 var9 = null;
        for (class22 var10 = (class22) field581.method3280(); var10 != null; var10 = (class22) field581.method3269()) {
            if (var10.field321 == arg0 && var10.field329 == arg1 && var10.field317 == arg2 && var10.field315 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class22();
            var9.field321 = arg0;
            var9.field315 = arg3;
            var9.field329 = arg1;
            var9.field317 = arg2;
            method1203(var9);
            field581.method3264(var9);
        }
        var9.field319 = arg4;
        var9.field323 = arg5;
        var9.field314 = arg6;
        var9.field324 = arg7;
        var9.field325 = arg8;
    }

    @ObfuscatedName("bl.bc(Le;I)V")
    public static final void method1203(class22 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field315 == 0) {
            var1 = Statics.field106.method1842(arg0.field321, arg0.field329, arg0.field317);
        }
        if (arg0.field315 == 1) {
            var1 = Statics.field106.method1843(arg0.field321, arg0.field329, arg0.field317);
        }
        if (arg0.field315 == 2) {
            var1 = Statics.field106.method1864(arg0.field321, arg0.field329, arg0.field317);
        }
        if (arg0.field315 == 3) {
            var1 = Statics.field106.method1821(arg0.field321, arg0.field329, arg0.field317);
        }
        if (var1 != 0) {
            int var5 = Statics.field106.method1985(arg0.field321, arg0.field329, arg0.field317, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field318 = var2;
        arg0.field320 = var3;
        arg0.field327 = var4;
    }

    @ObfuscatedName("et.bd(III)V")
    public static final void method2633(int arg0, int arg1) {
        class177 var2 = field639[Statics.field1310][arg0][arg1];
        if (var2 == null) {
            Statics.field106.method1838(Statics.field1310, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class17 var4 = null;
        for (class17 var5 = (class17) var2.method3280(); var5 != null; var5 = (class17) var2.method3269()) {
            class40 var6 = class40.method125(var5.field242);
            int var7 = var6.field998;
            if (var6.field985 == 1) {
                var7 = (var5.field241 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field106.method1838(Statics.field1310, arg0, arg1);
            return;
        }
        var2.method3268(var4);
        class17 var8 = null;
        class17 var9 = null;
        for (class17 var10 = (class17) var2.method3280(); var10 != null; var10 = (class17) var2.method3269()) {
            if (var4.field242 != var10.field242) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field242 != var10.field242 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field106.method1824(Statics.field1310, arg0, arg1, method1500(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1310), var4, var11, var8, var9);
    }

    @ObfuscatedName("v.bv(S)V")
    public static final void method48() {
        field574 = 0;
        field569 = 0;
        method124();
        int var0 = field487.method2278(8);
        if (var0 < field683) {
            for (int var1 = var0; var1 < field683; var1++) {
                field538[++field574 - 1] = field568[var1];
            }
        }
        if (var0 > field683) {
            throw new RuntimeException("");
        }
        field683 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field568[var2];
            class3 var4 = field566[var3];
            int var5 = field487.method2278(1);
            if (var5 == 0) {
                field568[++field683 - 1] = var3;
                var4.field424 = field668;
            } else {
                int var6 = field487.method2278(2);
                if (var6 == 0) {
                    field568[++field683 - 1] = var3;
                    var4.field424 = field668;
                    field670[++field569 - 1] = var3;
                } else if (var6 == 1) {
                    field568[++field683 - 1] = var3;
                    var4.field424 = field668;
                    int var7 = field487.method2278(3);
                    var4.method239(var7, false);
                    int var8 = field487.method2278(1);
                    if (var8 == 1) {
                        field670[++field569 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field568[++field683 - 1] = var3;
                    var4.field424 = field668;
                    int var9 = field487.method2278(3);
                    var4.method239(var9, true);
                    int var10 = field487.method2278(3);
                    var4.method239(var10, true);
                    int var11 = field487.method2278(1);
                    if (var11 == 1) {
                        field670[++field569 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field538[++field574 - 1] = var3;
                }
            }
        }
        method30();
        method867();
        for (int var12 = 0; var12 < field574; var12++) {
            int var13 = field538[var12];
            if (field668 != field566[var13].field424) {
                field566[var13] = null;
            }
        }
        if (field488 != field487.field2008) {
            throw new RuntimeException(field487.field2008 + class2.field18 + field488);
        }
        for (int var14 = 0; var14 < field683; var14++) {
            if (field566[field568[var14]] == null) {
                throw new RuntimeException(var14 + class2.field18 + field683);
            }
        }
    }

    @ObfuscatedName("c.bs(I)V")
    public static final void method124() {
        field487.method2277();
        int var0 = field487.method2278(1);
        if (var0 == 0) {
            return;
        }
        int var1 = field487.method2278(2);
        if (var1 == 0) {
            field670[++field569 - 1] = 2047;
        } else if (var1 == 1) {
            int var2 = field487.method2278(3);
            Statics.field714.method239(var2, false);
            int var3 = field487.method2278(1);
            if (var3 == 1) {
                field670[++field569 - 1] = 2047;
            }
        } else if (var1 == 2) {
            int var4 = field487.method2278(3);
            Statics.field714.method239(var4, true);
            int var5 = field487.method2278(3);
            Statics.field714.method239(var5, true);
            int var6 = field487.method2278(1);
            if (var6 == 1) {
                field670[++field569 - 1] = 2047;
            }
        } else if (var1 == 3) {
            int var7 = field487.method2278(1);
            int var8 = field487.method2278(1);
            if (var8 == 1) {
                field670[++field569 - 1] = 2047;
            }
            int var9 = field487.method2278(7);
            int var10 = field487.method2278(7);
            Statics.field1310 = field487.method2278(2);
            Statics.field714.method230(var9, var10, var7 == 1);
        }
    }

    @ObfuscatedName("q.be(B)V")
    public static final void method30() {
        while (true) {
            if (field487.method2290(field488) >= 11) {
                int var0 = field487.method2278(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field566[var0] == null) {
                        field566[var0] = new class3();
                        if (field571[var0] != null) {
                            field566[var0].method12(field571[var0]);
                        }
                        var1 = true;
                    }
                    field568[++field683 - 1] = var0;
                    class3 var2 = field566[var0];
                    var2.field424 = field668;
                    int var3 = field487.method2278(1);
                    int var4 = field487.method2278(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field579[field487.method2278(3)];
                    if (var1) {
                        var2.field430 = var2.field384 = var5;
                    }
                    int var6 = field487.method2278(5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = field487.method2278(1);
                    if (var7 == 1) {
                        field670[++field569 - 1] = var0;
                    }
                    var2.method230(Statics.field714.field420[0] + var6, Statics.field714.field436[0] + var4, var3 == 1);
                    continue;
                }
            }
            field487.method2279();
            return;
        }
    }

    @ObfuscatedName("aw.bu(I)V")
    public static final void method867() {
        for (int var0 = 0; var0 < field569; var0++) {
            int var1 = field670[var0];
            class3 var2 = field566[var1];
            int var3 = field487.method2484();
            if ((var3 & 0x4) != 0) {
                var3 += field487.method2484() << 8;
            }
            if ((var3 & 0x1) != 0) {
                int var4 = field487.method2442();
                int var5 = field487.method2432();
                int var6 = field487.method2484();
                int var7 = field487.field2008;
                if (var2.field39 != null && var2.field28 != null) {
                    boolean var8 = false;
                    if (var5 <= 1 && Statics.method713(var2.field39)) {
                        var8 = true;
                    }
                    if (!var8 && field565 == 0) {
                        field470.field2008 = 0;
                        field487.method2421(field470.field2015, 0, var6);
                        field470.field2008 = 0;
                        String var9 = class185.method3326(class147.method519(class184.method2634(field470)));
                        var2.field395 = var9.trim();
                        var2.field397 = var4 >> 8;
                        var2.field439 = var4 & 0xFF;
                        var2.field396 = 150;
                        if (var5 == 2 || var5 == 3) {
                            method3033(1, class2.method1291(1) + var2.field39, var9);
                        } else if (var5 == 1) {
                            method3033(1, class2.method1291(0) + var2.field39, var9);
                        } else {
                            method3033(2, var2.field39, var9);
                        }
                    }
                }
                field487.field2008 = var6 + var7;
            }
            if ((var3 & 0x400) != 0) {
                var2.field416 = field487.method2443();
                int var10 = field487.method2451();
                var2.field392 = var10 >> 16;
                var2.field419 = (var10 & 0xFFFF) + field668;
                var2.field417 = 0;
                var2.field418 = 0;
                if (var2.field419 > field668) {
                    var2.field417 = -1;
                }
                if (var2.field416 == 65535) {
                    var2.field416 = -1;
                }
            }
            if ((var3 & 0x200) != 0) {
                int var11 = field487.method2432();
                int var12 = field487.method2433();
                var2.method235(var11, var12, field668);
                var2.field402 = field668 + 300;
                var2.field427 = field487.method2484();
                var2.field426 = field487.method2433();
            }
            if ((var3 & 0x2) != 0) {
                var2.field405 = field487.method2442();
                if (var2.field405 == 65535) {
                    var2.field405 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field395 = field487.method2571();
                if (var2.field395.charAt(0) == '~') {
                    var2.field395 = var2.field395.substring(1);
                    method3033(2, var2.field39, var2.field395);
                } else if (Statics.field714 == var2) {
                    method3033(2, var2.field39, var2.field395);
                }
                var2.field397 = 0;
                var2.field439 = 0;
                var2.field396 = 150;
            }
            if ((var3 & 0x80) != 0) {
                int var13 = field487.method2433();
                int var14 = field487.method2434();
                var2.method235(var13, var14, field668);
                var2.field402 = field668 + 300;
                var2.field427 = field487.method2434();
                var2.field426 = field487.method2433();
            }
            if ((var3 & 0x100) != 0) {
                var2.field422 = field487.method2432();
                var2.field423 = field487.method2432();
                var2.field404 = field487.method2484();
                var2.field435 = field487.method2434();
                var2.field425 = field487.method2443() + field668;
                var2.field382 = field487.method2539() + field668;
                var2.field413 = field487.method2484();
                var2.field434 = 1;
                var2.field438 = 0;
            }
            if ((var3 & 0x20) != 0) {
                int var15 = field487.method2432();
                byte[] var16 = new byte[var15];
                class127 var17 = new class127(var16);
                field487.method2407(var16, 0, var15);
                field571[var1] = var17;
                var2.method12(var17);
            }
            if ((var3 & 0x40) != 0) {
                var2.field406 = field487.method2442();
                var2.field407 = field487.method2539();
            }
            if ((var3 & 0x8) != 0) {
                int var18 = field487.method2443();
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = field487.method2432();
                method550(var2, var18, var19);
            }
        }
    }

    @ObfuscatedName("cx.bh(I)V")
    public static final void method1999() {
        while (true) {
            if (field487.method2290(field488) >= 27) {
                int var0 = field487.method2278(15);
                if (var0 != 32767) {
                    boolean var1 = false;
                    if (field482[var0] == null) {
                        field482[var0] = new class25();
                        var1 = true;
                    }
                    class25 var2 = field482[var0];
                    field484[++field483 - 1] = var0;
                    var2.field424 = field668;
                    int var3 = field487.method2278(1);
                    int var4 = field487.method2278(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var2.field354 = Statics.method1391(field487.method2278(14));
                    int var5 = field487.method2278(5);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = field487.method2278(1);
                    if (var6 == 1) {
                        field670[++field569 - 1] = var0;
                    }
                    int var7 = field579[field487.method2278(3)];
                    if (var1) {
                        var2.field430 = var2.field384 = var7;
                    }
                    var2.field433 = var2.field354.field749;
                    var2.field432 = var2.field354.field772;
                    if (var2.field432 == 0) {
                        var2.field384 = 0;
                    }
                    var2.field390 = var2.field354.field779;
                    var2.field412 = var2.field354.field743;
                    var2.field442 = var2.field354.field762;
                    var2.field403 = var2.field354.field758;
                    var2.field387 = var2.field354.field752;
                    var2.field388 = var2.field354.field767;
                    var2.field389 = var2.field354.field771;
                    var2.method230(Statics.field714.field420[0] + var4, Statics.field714.field436[0] + var5, var3 == 1);
                    continue;
                }
            }
            field487.method2279();
            return;
        }
    }

    @ObfuscatedName("d.bm(III)V")
    public static final void method215(int arg0, int arg1) {
        if (field590 < 2 && field663 == 0 && !field603) {
            return;
        }
        String var2;
        if (field663 == 1 && field590 < 2) {
            var2 = class134.field2195 + class134.field2205 + field658 + " " + class2.field19;
        } else if (field603 && field590 < 2) {
            var2 = field605 + class134.field2205 + field468 + " " + class2.field19;
        } else {
            var2 = method2000(field590 - 1);
        }
        if (field590 > 2) {
            var2 = var2 + class2.method2892(16777215) + " " + '/' + " " + (field590 - 2) + class134.field2073;
        }
        Statics.field1006.method3379(var2, arg0 + 4, arg1 + 15, 16777215, 0, field668 / 1000);
    }

    @ObfuscatedName("g.bg(IIIIB)V")
    public static final void method162(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field681; var4++) {
            if (field653[var4] + field636[var4] > arg0 && field653[var4] < arg0 + arg2 && field662[var4] + field654[var4] > arg1 && field654[var4] < arg1 + arg3) {
                field650[var4] = true;
            }
        }
    }

    @ObfuscatedName("el.br(IIIII)V")
    public static final void method2887(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field681; var4++) {
            if (field653[var4] + field636[var4] > arg0 && field653[var4] < arg0 + arg2 && field662[var4] + field654[var4] > arg1 && field654[var4] < arg1 + arg3) {
                field651[var4] = true;
            }
        }
    }

    @ObfuscatedName("r.bw(B)V")
    public static final void method143() {
        int var0 = Statics.field1006.method3323(class134.field2163);
        for (int var1 = 0; var1 < field590; var1++) {
            int var2 = Statics.field1006.method3323(method2000(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field590 * 15 + 21;
        int var4 = class77.field1372 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class77.field1369;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field572 = true;
        Statics.field635 = var4;
        Statics.field1180 = var5;
        Statics.field1497 = var0;
        Statics.field1972 = field590 * 15 + 22;
    }

    @ObfuscatedName("ee.bx(IS)V")
    public static final void method2647(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field687[arg0];
        int var2 = field592[arg0];
        int var3 = field593[arg0];
        int var4 = field604[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 2 && method91(var1, var2, var4)) {
            field485.method2275(65);
            field485.method2448(Statics.field1951);
            field485.method2466(field515);
            field485.method2499(Statics.field904 + var2);
            field485.method2439(Statics.field497 + var1);
            field485.method2439(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 19) {
            boolean var5 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var5) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(199);
            field485.method2499(Statics.field904 + var2);
            field485.method2499(Statics.field497 + var1);
            field485.method2397(var4);
        }
        if (var3 == 45) {
            class3 var7 = field566[var4];
            if (var7 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var7.field420[0], var7.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(57);
                field485.method2397(var4);
            }
        }
        if (var3 == 12) {
            class25 var8 = field482[var4];
            if (var8 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var8.field420[0], var8.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(46);
                field485.method2499(var4);
            }
        }
        if (var3 == 21) {
            boolean var9 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var9) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(109);
            field485.method2499(Statics.field904 + var2);
            field485.method2397(var4);
            field485.method2439(Statics.field497 + var1);
        }
        if (var3 == 13) {
            class25 var11 = field482[var4];
            if (var11 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var11.field420[0], var11.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(108);
                field485.method2466(var4);
            }
        }
        if (var3 == 48) {
            class3 var12 = field566[var4];
            if (var12 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var12.field420[0], var12.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(116);
                field485.method2397(var4);
            }
        }
        if (var3 == 37) {
            field485.method2275(171);
            field485.method2499(var4);
            field485.method2448(var2);
            field485.method2397(var1);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 11) {
            class25 var13 = field482[var4];
            if (var13 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var13.field420[0], var13.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(88);
                field485.method2397(var4);
            }
        }
        if (var3 == 51) {
            class3 var14 = field566[var4];
            if (var14 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var14.field420[0], var14.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(243);
                field485.method2397(var4);
            }
        }
        if (var3 == 20) {
            boolean var15 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var15) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(64);
            field485.method2439(var4);
            field485.method2397(Statics.field497 + var1);
            field485.method2466(Statics.field904 + var2);
        }
        if (var3 == 1002) {
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(66);
            field485.method2466(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 39) {
            field485.method2275(39);
            field485.method2448(var2);
            field485.method2466(var1);
            field485.method2466(var4);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 9) {
            class25 var17 = field482[var4];
            if (var17 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var17.field420[0], var17.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(203);
                field485.method2466(var4);
            }
        }
        if (var3 == 6) {
            method91(var1, var2, var4);
            field485.method2275(130);
            field485.method2466(Statics.field497 + var1);
            field485.method2499(Statics.field904 + var2);
            field485.method2397(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 30 && field611 == null) {
            field485.method2275(133);
            field485.method2470(var2);
            field485.method2466(var1);
            field611 = class158.method2262(var2, var1);
            method2272(field611);
        }
        if (var3 == 1 && method91(var1, var2, var4)) {
            field485.method2275(5);
            field485.method2466(Statics.field904 + var2);
            field485.method2439(Statics.field357);
            field485.method2466(Statics.field497 + var1);
            field485.method2466(var4 >> 14 & 0x7FFF);
            field485.method2439(Statics.field140);
            field485.method2448(Statics.field1000);
        }
        if (var3 == 41) {
            field485.method2275(141);
            field485.method2448(var2);
            field485.method2499(var1);
            field485.method2397(var4);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 28) {
            field485.method2275(52);
            field485.method2470(var2);
            class158 var18 = class158.method220(var2);
            if (var18.field2669 != null && var18.field2669[0][0] == 5) {
                int var19 = var18.field2669[0][1];
                class159.field2696[var19] = 1 - class159.field2696[var19];
                method221(var19);
            }
        }
        if (var3 == 58) {
            field485.method2275(229);
            field485.method2467(Statics.field1951);
            field485.method2446(var2);
            field485.method2397(var1);
            field485.method2397(field515);
        }
        if (var3 == 22) {
            boolean var20 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var20) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(197);
            field485.method2439(var4);
            field485.method2466(Statics.field904 + var2);
            field485.method2466(Statics.field497 + var1);
        }
        if (var3 == 42) {
            field485.method2275(48);
            field485.method2448(var2);
            field485.method2466(var4);
            field485.method2499(var1);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 44) {
            class3 var22 = field566[var4];
            if (var22 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var22.field420[0], var22.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(96);
                field485.method2466(var4);
            }
        }
        if (var3 == 34) {
            field485.method2275(248);
            field485.method2499(var1);
            field485.method2397(var4);
            field485.method2467(var2);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 57 || var3 == 1007) {
            method104(var4, var2, var1, field596[arg0]);
        }
        if (var3 == 25) {
            class158 var23 = class158.method2262(var2, var1);
            if (var23 != null) {
                method2165();
                int var24 = method712(var23);
                int var25 = var24 >> 11 & 0x3F;
                class158 var27 = class158.method2262(var2, var1);
                if (var27 != null && var27.field2651 != null) {
                    class1 var28 = new class1();
                    var28.field3 = var27;
                    var28.field1 = var27.field2651;
                    class26.method161(var28);
                }
                field603 = true;
                Statics.field1951 = var2;
                field515 = var1;
                Statics.field182 = var25;
                method2272(var27);
                field663 = 0;
                int var29 = method712(var23);
                int var30 = var29 >> 11 & 0x3F;
                String var31;
                if (var30 == 0) {
                    var31 = null;
                } else if (var23.field2639 == null || var23.field2639.trim().length() == 0) {
                    var31 = null;
                } else {
                    var31 = var23.field2639;
                }
                field605 = var31;
                if (field605 == null) {
                    field605 = "Null";
                }
                if (var23.field2572) {
                    field468 = var23.field2633 + class2.method2892(16777215);
                } else {
                    field468 = class2.method2892(65280) + var23.field2673 + class2.method2892(16777215);
                }
            }
            return;
        }
        if (var3 == 23) {
            Statics.field106.method1822(Statics.field1310, var1, var2);
        }
        if (var3 == 33) {
            field485.method2275(118);
            field485.method2448(var2);
            field485.method2466(var4);
            field485.method2466(var1);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 16) {
            boolean var32 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var32) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(230);
            field485.method2397(var4);
            field485.method2439(Statics.field904 + var2);
            field485.method2466(Statics.field497 + var1);
            field485.method2466(Statics.field357);
            field485.method2466(Statics.field140);
            field485.method2446(Statics.field1000);
        }
        if (var3 == 4) {
            method91(var1, var2, var4);
            field485.method2275(90);
            field485.method2397(var4 >> 14 & 0x7FFF);
            field485.method2499(Statics.field904 + var2);
            field485.method2466(Statics.field497 + var1);
        }
        if (var3 == 49) {
            class3 var34 = field566[var4];
            if (var34 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var34.field420[0], var34.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(128);
                field485.method2397(var4);
            }
        }
        if (var3 == 31) {
            field485.method2275(62);
            field485.method2439(Statics.field357);
            field485.method2397(Statics.field140);
            field485.method2397(var1);
            field485.method2470(Statics.field1000);
            field485.method2448(var2);
            field485.method2439(var4);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 40) {
            field485.method2275(254);
            field485.method2397(var4);
            field485.method2448(var2);
            field485.method2397(var1);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 1005) {
            class158 var35 = class158.method220(var2);
            if (var35 == null || var35.field2676[var1] < 100000) {
                field485.method2275(47);
                field485.method2439(var4);
            } else {
                method3033(0, "", var35.field2676[var1] + " x " + class40.method125(var4).field960);
            }
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 47) {
            class3 var36 = field566[var4];
            if (var36 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var36.field420[0], var36.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(180);
                field485.method2439(var4);
            }
        }
        if (var3 == 18) {
            boolean var37 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var37) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(41);
            field485.method2499(var4);
            field485.method2499(Statics.field497 + var1);
            field485.method2499(Statics.field904 + var2);
        }
        if (var3 == 5) {
            method91(var1, var2, var4);
            field485.method2275(150);
            field485.method2439(var4 >> 14 & 0x7FFF);
            field485.method2466(Statics.field904 + var2);
            field485.method2397(Statics.field497 + var1);
        }
        if (var3 == 32) {
            field485.method2275(75);
            field485.method2439(field515);
            field485.method2467(Statics.field1951);
            field485.method2467(var2);
            field485.method2439(var4);
            field485.method2466(var1);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 7) {
            class25 var39 = field482[var4];
            if (var39 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var39.field420[0], var39.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(252);
                field485.method2499(var4);
                field485.method2397(Statics.field357);
                field485.method2397(Statics.field140);
                field485.method2467(Statics.field1000);
            }
        }
        if (var3 == 3) {
            method91(var1, var2, var4);
            field485.method2275(155);
            field485.method2499(Statics.field497 + var1);
            field485.method2499(Statics.field904 + var2);
            field485.method2499(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 46) {
            class3 var40 = field566[var4];
            if (var40 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var40.field420[0], var40.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(77);
                field485.method2466(var4);
            }
        }
        if (var3 == 15) {
            class3 var41 = field566[var4];
            if (var41 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var41.field420[0], var41.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(51);
                field485.method2446(Statics.field1951);
                field485.method2439(field515);
                field485.method2397(var4);
            }
        }
        if (var3 == 29) {
            field485.method2275(52);
            field485.method2470(var2);
            class158 var42 = class158.method220(var2);
            if (var42.field2669 != null && var42.field2669[0][0] == 5) {
                int var43 = var42.field2669[0][1];
                if (class159.field2696[var43] != var42.field2671[0]) {
                    class159.field2696[var43] = var42.field2671[0];
                    method221(var43);
                }
            }
        }
        if (var3 == 1003) {
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            class25 var44 = field482[var4];
            if (var44 != null) {
                class31 var45 = var44.field354;
                if (var45.field773 != null) {
                    var45 = var45.method582();
                }
                if (var45 != null) {
                    field485.method2275(217);
                    field485.method2499(var45.field747);
                }
            }
        }
        if (var3 == 43) {
            field485.method2275(204);
            field485.method2466(var4);
            field485.method2446(var2);
            field485.method2439(var1);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 26) {
            Statics.method675();
        }
        if (var3 == 36) {
            field485.method2275(80);
            field485.method2397(var4);
            field485.method2439(var1);
            field485.method2448(var2);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 10) {
            class25 var46 = field482[var4];
            if (var46 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var46.field420[0], var46.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(198);
                field485.method2397(var4);
            }
        }
        if (var3 == 14) {
            class3 var47 = field566[var4];
            if (var47 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var47.field420[0], var47.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(76);
                field485.method2446(Statics.field1000);
                field485.method2466(var4);
                field485.method2397(Statics.field357);
                field485.method2499(Statics.field140);
            }
        }
        if (var3 == 35) {
            field485.method2275(131);
            field485.method2439(var1);
            field485.method2448(var2);
            field485.method2397(var4);
            field600 = 0;
            Statics.field249 = class158.method220(var2);
            field558 = var1;
        }
        if (var3 == 17) {
            boolean var48 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var48) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(253);
            field485.method2397(Statics.field904 + var2);
            field485.method2466(field515);
            field485.method2467(Statics.field1951);
            field485.method2397(Statics.field497 + var1);
            field485.method2466(var4);
        }
        if (var3 == 50) {
            class3 var50 = field566[var4];
            if (var50 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var50.field420[0], var50.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(111);
                field485.method2499(var4);
            }
        }
        if (var3 == 8) {
            class25 var51 = field482[var4];
            if (var51 != null) {
                Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var51.field420[0], var51.field436[0], false, 0, 0, 1, 1, 0, 2);
                field520 = class77.field1372;
                field554 = class77.field1369;
                field667 = 2;
                field550 = 0;
                field485.method2275(107);
                field485.method2397(var4);
                field485.method2448(Statics.field1951);
                field485.method2439(field515);
            }
        }
        if (var3 == 24) {
            class158 var52 = class158.method220(var2);
            boolean var53 = true;
            if (var52.field2577 > 0) {
                var53 = method88(var52);
            }
            if (var53) {
                field485.method2275(52);
                field485.method2470(var2);
            }
        }
        if (var3 == 1004) {
            field520 = class77.field1372;
            field554 = class77.field1369;
            field667 = 2;
            field550 = 0;
            field485.method2275(47);
            field485.method2439(var4);
        }
        if (var3 == 38) {
            method2165();
            class158 var54 = class158.method220(var2);
            field663 = 1;
            Statics.field357 = var1;
            Statics.field1000 = var2;
            Statics.field140 = var4;
            method2272(var54);
            field658 = class2.method2892(16748608) + class40.method125(var4).field960 + class2.method2892(16777215);
            if (field658 == null) {
                field658 = "null";
            }
            return;
        }
        if (var3 == 1001) {
            method91(var1, var2, var4);
            field485.method2275(87);
            field485.method2397(var4 >> 14 & 0x7FFF);
            field485.method2466(Statics.field497 + var1);
            field485.method2439(Statics.field904 + var2);
        }
        if (field663 != 0) {
            field663 = 0;
            method2272(class158.method220(Statics.field1000));
        }
        if (field603) {
            method2165();
        }
        if (Statics.field249 != null && field600 == 0) {
            method2272(Statics.field249);
        }
    }

    @ObfuscatedName("db.bt(B)V")
    public static void method2165() {
        if (!field603) {
            return;
        }
        class158 var0 = class158.method2262(Statics.field1951, field515);
        if (var0 != null && var0.field2677 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field1 = var0.field2677;
            class26.method161(var1);
        }
        field603 = false;
        method2272(var0);
    }

    @ObfuscatedName("s.ba(IIILjava/lang/String;B)V")
    public static void method104(int arg0, int arg1, int arg2, String arg3) {
        class158 var4 = class158.method2262(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2660 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field11 = arg0;
            var5.field9 = arg3;
            var5.field1 = var4.field2660;
            class26.method161(var5);
        }
        boolean var6 = true;
        if (var4.field2577 > 0) {
            var6 = method88(var4);
        }
        if (!var6 || !class162.method3100(method712(var4), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field485.method2275(38);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 2) {
            field485.method2275(144);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 3) {
            field485.method2275(247);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 4) {
            field485.method2275(148);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 5) {
            field485.method2275(208);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 6) {
            field485.method2275(162);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 7) {
            field485.method2275(161);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 8) {
            field485.method2275(125);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 9) {
            field485.method2275(40);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
        if (arg0 == 10) {
            field485.method2275(158);
            field485.method2470(arg1);
            field485.method2397(arg2);
        }
    }

    @ObfuscatedName("c.bo(I)V")
    public static final void method122() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field590 - 1; var1++) {
                if (field593[var1] < 1000 && field593[var1 + 1] > 1000) {
                    String var2 = field596[var1];
                    field596[var1] = field596[var1 + 1];
                    field596[var1 + 1] = var2;
                    String var3 = field595[var1];
                    field595[var1] = field595[var1 + 1];
                    field595[var1 + 1] = var3;
                    int var4 = field593[var1];
                    field593[var1] = field593[var1 + 1];
                    field593[var1 + 1] = var4;
                    int var5 = field687[var1];
                    field687[var1] = field687[var1 + 1];
                    field687[var1 + 1] = var5;
                    int var6 = field592[var1];
                    field592[var1] = field592[var1 + 1];
                    field592[var1 + 1] = var6;
                    int var7 = field604[var1];
                    field604[var1] = field604[var1 + 1];
                    field604[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("ab.bp(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method677(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field572 || field590 >= 500) {
            return;
        }
        field595[field590] = arg0;
        field596[field590] = arg1;
        field593[field590] = arg2;
        field604[field590] = arg3;
        field687[field590] = arg4;
        field592[field590] = arg5;
        field590++;
    }

    @ObfuscatedName("cw.bk(II)Ljava/lang/String;")
    public static String method2000(int arg0) {
        return field596[arg0].length() > 0 ? field595[arg0] + class134.field2205 + field596[arg0] : field595[arg0];
    }

    @ObfuscatedName("dp.by(IIIII)V")
    public static final void method2265(int arg0, int arg1, int arg2, int arg3) {
        if (field663 == 0 && !field603) {
            method677(class134.field2100, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        for (int var5 = 0; var5 < class112.field1886; var5++) {
            int var6 = class112.field1887[var5];
            int var7 = var6 & 0x7F;
            int var8 = var6 >> 7 & 0x7F;
            int var9 = var6 >> 29 & 0x3;
            int var10 = var6 >> 14 & 0x7FFF;
            if (var4 != var6) {
                var4 = var6;
                if (var9 == 2 && Statics.field106.method1985(Statics.field1310, var7, var8, var6) >= 0) {
                    class32 var11 = class32.method1131(var10);
                    if (var11.field823 != null) {
                        var11 = var11.method623();
                    }
                    if (var11 == null) {
                        continue;
                    }
                    if (field663 == 1) {
                        method677(class134.field2195, field658 + " " + class2.field19 + " " + class2.method2892(65535) + var11.field791, 1, var6, var7, var8);
                    } else if (!field603) {
                        String[] var12 = var11.field808;
                        if (field480) {
                            var12 = method1348(var12);
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
                                    method677(var12[var13], class2.method2892(65535) + var11.field791, var14, var6, var7, var8);
                                }
                            }
                        }
                        method677(class134.field2196, class2.method2892(65535) + var11.field791, 1002, var11.field797 << 14, var7, var8);
                    } else if ((Statics.field182 & 0x4) == 4) {
                        method677(field605, field468 + " " + class2.field19 + " " + class2.method2892(65535) + var11.field791, 2, var6, var7, var8);
                    }
                }
                if (var9 == 1) {
                    class25 var15 = field482[var10];
                    if (var15.field354.field749 == 1 && (var15.field399 & 0x7F) == 64 && (var15.field383 & 0x7F) == 64) {
                        for (int var16 = 0; var16 < field483; var16++) {
                            class25 var17 = field482[field484[var16]];
                            if (var17 != null && var15 != var17 && var17.field354.field749 == 1 && var15.field399 == var17.field399 && var15.field383 == var17.field383) {
                                method2626(var17.field354, field484[var16], var7, var8);
                            }
                        }
                        for (int var18 = 0; var18 < field683; var18++) {
                            class3 var19 = field566[field568[var18]];
                            if (var19 != null && var15.field399 == var19.field399 && var15.field383 == var19.field383) {
                                method2726(var19, field568[var18], var7, var8);
                            }
                        }
                    }
                    method2626(var15.field354, var10, var7, var8);
                }
                if (var9 == 0) {
                    class3 var20 = field566[var10];
                    if ((var20.field399 & 0x7F) == 64 && (var20.field383 & 0x7F) == 64) {
                        for (int var21 = 0; var21 < field483; var21++) {
                            class25 var22 = field482[field484[var21]];
                            if (var22 != null && var22.field354.field749 == 1 && var20.field399 == var22.field399 && var20.field383 == var22.field383) {
                                method2626(var22.field354, field484[var21], var7, var8);
                            }
                        }
                        for (int var23 = 0; var23 < field683; var23++) {
                            class3 var24 = field566[field568[var23]];
                            if (var24 != null && var20 != var24 && var20.field399 == var24.field399 && var20.field383 == var24.field383) {
                                method2726(var24, field568[var23], var7, var8);
                            }
                        }
                    }
                    method2726(var20, var10, var7, var8);
                }
                if (var9 == 3) {
                    class177 var25 = field639[Statics.field1310][var7][var8];
                    if (var25 != null) {
                        for (class17 var26 = (class17) var25.method3274(); var26 != null; var26 = (class17) var25.method3266()) {
                            class40 var27 = class40.method125(var26.field242);
                            if (field663 == 1) {
                                method677(class134.field2195, field658 + " " + class2.field19 + " " + class2.method2892(16748608) + var27.field960, 16, var26.field242, var7, var8);
                            } else if (!field603) {
                                String[] var28 = var27.field982;
                                if (field480) {
                                    var28 = method1348(var28);
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
                                        method677(var28[var29], class2.method2892(16748608) + var27.field960, var30, var26.field242, var7, var8);
                                    } else if (var29 == 2) {
                                        method677(class134.field2055, class2.method2892(16748608) + var27.field960, 20, var26.field242, var7, var8);
                                    }
                                }
                                method677(class134.field2196, class2.method2892(16748608) + var27.field960, 1004, var26.field242, var7, var8);
                            } else if ((Statics.field182 & 0x1) == 1) {
                                method677(field605, field468 + " " + class2.field19 + " " + class2.method2892(16748608) + var27.field960, 17, var26.field242, var7, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("em.bf(Laj;IIII)V")
    public static final void method2626(class31 arg0, int arg1, int arg2, int arg3) {
        if (field590 >= 400) {
            return;
        }
        if (arg0.field773 != null) {
            arg0 = arg0.method582();
        }
        if (arg0 == null || !arg0.field776) {
            return;
        }
        String var4 = arg0.field753;
        if (arg0.field765 != 0) {
            int var6 = arg0.field765;
            int var7 = Statics.field714.field49;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2892(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2892(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2892(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2892(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2892(65280);
            } else if (var8 > 6) {
                var9 = class2.method2892(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2892(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2892(12648192);
            } else {
                var9 = class2.method2892(16776960);
            }
            var4 = var4 + var9 + " " + class2.field20 + class134.field2278 + arg0.field765 + class2.field21;
        }
        if (field663 == 1) {
            method677(class134.field2195, field658 + " " + class2.field19 + " " + class2.method2892(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field603) {
            String[] var10 = arg0.field763;
            if (field480) {
                var10 = method1348(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class134.field2197)) {
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
                        method677(var10[var11], class2.method2892(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class134.field2197)) {
                        short var14 = 0;
                        if (arg0.field765 > Statics.field714.field49) {
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
                        method677(var10[var13], class2.method2892(16776960) + var4, var15, arg1, arg2, arg3);
                    }
                }
            }
            method677(class134.field2196, class2.method2892(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field182 & 0x2) == 2) {
            method677(field605, field468 + " " + class2.field19 + " " + class2.method2892(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ec.bq(Lk;IIII)V")
    public static final void method2726(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field714 == arg0 || field590 >= 400) {
            return;
        }
        String var9;
        if (arg0.field50 == 0) {
            String var4 = arg0.field39;
            int var5 = arg0.field49;
            int var6 = Statics.field714.field49;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2892(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2892(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2892(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2892(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2892(65280);
            } else if (var7 > 6) {
                var8 = class2.method2892(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2892(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2892(12648192);
            } else {
                var8 = class2.method2892(16776960);
            }
            var9 = var4 + var8 + " " + class2.field20 + class134.field2278 + arg0.field49 + class2.field21;
        } else {
            var9 = arg0.field39 + " " + class2.field20 + class134.field2219 + arg0.field50 + class2.field21;
        }
        if (field663 == 1) {
            method677(class134.field2195, field658 + " " + class2.field19 + " " + class2.method2892(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field603) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field577[var10] != null) {
                    short var11 = 0;
                    if (field577[var10].equalsIgnoreCase(class134.field2197)) {
                        if (arg0.field49 > Statics.field714.field49) {
                            var11 = 2000;
                        }
                        if (Statics.field714.field27 != 0 && arg0.field27 != 0) {
                            if (Statics.field714.field27 == arg0.field27) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field578[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field708[var10] + var11;
                    method677(field577[var10], class2.method2892(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field182 & 0x8) == 8) {
            method677(field605, field468 + " " + class2.field19 + " " + class2.method2892(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field590; var14++) {
            if (field593[var14] == 23) {
                field596[var14] = class2.method2892(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("o.cr([Lfw;IIIIIIIII)V")
    public static final void method197(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class89.method1731(arg2, arg3, arg4, arg5);
        class104.method2086();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class158 var10 = arg0[var9];
            if (var10 != null && (var10.field2585 == arg1 || arg1 == -1412584499 && field512 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field653[field681] = var10.field2578 + arg6;
                    field654[field681] = var10.field2579 + arg7;
                    field636[field681] = var10.field2582;
                    field662[field681] = var10.field2583;
                    var11 = ++field681 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2688 = var11;
                var10.field2689 = field668;
                if (!var10.field2572 || !method1995(var10)) {
                    if (var10.field2577 > 0) {
                        method3041(var10);
                    }
                    int var12 = var10.field2578 + arg6;
                    int var13 = var10.field2579 + arg7;
                    int var14 = var10.field2595;
                    if (field512 == var10) {
                        if (arg1 != -1412584499 && !var10.field2637) {
                            Statics.field1231 = arg0;
                            Statics.field46 = arg6;
                            Statics.field32 = arg7;
                            continue;
                        }
                        if (field629 && field623) {
                            int var15 = class77.field1373;
                            int var16 = class77.field1366;
                            int var17 = var15 - field562;
                            int var18 = var16 - field621;
                            if (var17 < field624) {
                                var17 = field624;
                            }
                            if (var10.field2582 + var17 > field624 + field619.field2582) {
                                var17 = field624 + field619.field2582 - var10.field2582;
                            }
                            if (var18 < field625) {
                                var18 = field625;
                            }
                            if (var10.field2583 + var18 > field625 + field619.field2583) {
                                var18 = field625 + field619.field2583 - var10.field2583;
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
                    if (var10.field2575 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2575 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2582 + var12;
                        int var26 = var10.field2583 + var13;
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
                        int var29 = var10.field2582 + var12;
                        int var30 = var10.field2583 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2572 || var19 < var21 && var20 < var22) {
                        if (var10.field2577 != 0) {
                            if (var10.field2577 == 1337) {
                                field597 = var12;
                                field598 = var13;
                                method52(var12, var13, var10.field2582, var10.field2583);
                                class89.method1731(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2577 == 1338) {
                                method2174(var12, var13, var11);
                                class89.method1731(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var31 = class77.field1373;
                        int var32 = class77.field1366;
                        if (!field572 && var31 >= var19 && var32 >= var20 && var31 < var21 && var32 < var22) {
                            method140(var10, var31 - var12, var32 - var13);
                        }
                        if (var10.field2575 == 0) {
                            if (!var10.field2572 && method1995(var10) && Statics.field441 != var10) {
                                continue;
                            }
                            if (!var10.field2572) {
                                if (var10.field2580 > var10.field2589 - var10.field2583) {
                                    var10.field2580 = var10.field2589 - var10.field2583;
                                }
                                if (var10.field2580 < 0) {
                                    var10.field2580 = 0;
                                }
                            }
                            method197(arg0, var10.field2620, var19, var20, var21, var22, var12 - var10.field2586, var13 - var10.field2580, var11);
                            if (var10.field2681 != null) {
                                method197(var10.field2681, var10.field2620, var19, var20, var21, var22, var12 - var10.field2586, var13 - var10.field2580, var11);
                            }
                            class4 var33 = (class4) field608.method3259((long) var10.field2620);
                            if (var33 != null) {
                                if (var33.field52 == 0 && class77.field1373 >= var19 && class77.field1366 >= var20 && class77.field1373 < var21 && class77.field1366 < var22 && !field572 && !field601) {
                                    field595[0] = class134.field2268;
                                    field596[0] = "";
                                    field593[0] = 1006;
                                    field590 = 1;
                                }
                                int var34 = var33.field60;
                                if (class158.method1202(var34)) {
                                    Statics.field1231 = null;
                                    method197(Statics.field2607[var34], -1, var19, var20, var21, var22, var12, var13, var11);
                                    if (Statics.field1231 != null) {
                                        method197(Statics.field1231, -1412584499, var19, var20, var21, var22, Statics.field46, Statics.field32, var11);
                                        Statics.field1231 = null;
                                    }
                                } else if (var11 == -1) {
                                    for (int var35 = 0; var35 < 100; var35++) {
                                        field650[var35] = true;
                                    }
                                } else {
                                    field650[var11] = true;
                                }
                            }
                            class89.method1731(arg2, arg3, arg4, arg5);
                            class104.method2086();
                        }
                        if (field652[var11] || field657 > 1) {
                            if (var10.field2575 == 0 && !var10.field2572 && var10.field2589 > var10.field2583) {
                                method802(var10.field2582 + var12, var13, var10.field2580, var10.field2583, var10.field2589);
                            }
                            if (var10.field2575 != 1) {
                                if (var10.field2575 == 2) {
                                    int var36 = 0;
                                    for (int var37 = 0; var37 < var10.field2583; var37++) {
                                        for (int var38 = 0; var38 < var10.field2582; var38++) {
                                            int var39 = (var10.field2626 + 32) * var38 + var12;
                                            int var40 = (var10.field2627 + 32) * var37 + var13;
                                            if (var36 < 20) {
                                                var39 += var10.field2628[var36];
                                                var40 += var10.field2610[var36];
                                            }
                                            if (var10.field2675[var36] > 0) {
                                                boolean var41 = false;
                                                boolean var42 = false;
                                                int var43 = var10.field2675[var36] - 1;
                                                if (var39 + 32 > arg2 && var39 < arg4 && var40 + 32 > arg3 && var40 < arg5 || Statics.field372 == var10 && field559 == var36) {
                                                    class86 var44;
                                                    if (field663 == 1 && Statics.field357 == var36 && Statics.field1000 == var10.field2620) {
                                                        var44 = class40.method202(var43, var10.field2676[var36], 2, 0, false);
                                                    } else {
                                                        var44 = class40.method202(var43, var10.field2676[var36], 1, 3153952, false);
                                                    }
                                                    if (var44 == null) {
                                                        method2272(var10);
                                                    } else if (Statics.field372 == var10 && field559 == var36) {
                                                        int var45 = class77.field1373 - field560;
                                                        int var46 = class77.field1366 - field561;
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (var46 < 5 && var46 > -5) {
                                                            var46 = 0;
                                                        }
                                                        if (field583 < 5) {
                                                            var45 = 0;
                                                            var46 = 0;
                                                        }
                                                        var44.method1712(var39 + var45, var40 + var46, 128);
                                                        if (arg1 != -1) {
                                                            class158 var47 = arg0[arg1 & 0xFFFF];
                                                            if (var40 + var46 < class89.field1464 && var47.field2580 > 0) {
                                                                int var48 = field525 * (class89.field1464 - var40 - var46) / 3;
                                                                if (var48 > field525 * 10) {
                                                                    var48 = field525 * 10;
                                                                }
                                                                if (var48 > var47.field2580) {
                                                                    var48 = var47.field2580;
                                                                }
                                                                var47.field2580 -= var48;
                                                                field561 += var48;
                                                                method2272(var47);
                                                            }
                                                            if (var40 + var46 + 32 > class89.field1461 && var47.field2580 < var47.field2589 - var47.field2583) {
                                                                int var49 = field525 * (var40 + var46 + 32 - class89.field1461) / 3;
                                                                if (var49 > field525 * 10) {
                                                                    var49 = field525 * 10;
                                                                }
                                                                if (var49 > var47.field2589 - var47.field2583 - var47.field2580) {
                                                                    var49 = var47.field2589 - var47.field2583 - var47.field2580;
                                                                }
                                                                var47.field2580 += var49;
                                                                field561 -= var49;
                                                                method2272(var47);
                                                            }
                                                        }
                                                    } else if (Statics.field249 == var10 && field558 == var36) {
                                                        var44.method1712(var39, var40, 128);
                                                    } else {
                                                        var44.method1635(var39, var40);
                                                    }
                                                }
                                            } else if (var10.field2630 != null && var36 < 20) {
                                                class86 var50 = var10.method3050(var36);
                                                if (var50 != null) {
                                                    var50.method1635(var39, var40);
                                                } else if (class158.field2591) {
                                                    method2272(var10);
                                                }
                                            }
                                            var36++;
                                        }
                                    }
                                } else if (var10.field2575 == 3) {
                                    int var51;
                                    if (method2511(var10)) {
                                        var51 = var10.field2670;
                                        if (Statics.field441 == var10 && var10.field2612 != 0) {
                                            var51 = var10.field2612;
                                        }
                                    } else {
                                        var51 = var10.field2590;
                                        if (Statics.field441 == var10 && var10.field2678 != 0) {
                                            var51 = var10.field2678;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2594) {
                                            class89.method1767(var12, var13, var10.field2582, var10.field2583, var51);
                                        } else {
                                            class89.method1739(var12, var13, var10.field2582, var10.field2583, var51);
                                        }
                                    } else if (var10.field2594) {
                                        class89.method1796(var12, var13, var10.field2582, var10.field2583, var51, 256 - (var14 & 0xFF));
                                    } else {
                                        class89.method1740(var12, var13, var10.field2582, var10.field2583, var51, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2575 == 4) {
                                    class183 var52 = var10.method3049();
                                    if (var52 != null) {
                                        String var53 = var10.field2624;
                                        int var54;
                                        if (method2511(var10)) {
                                            var54 = var10.field2670;
                                            if (Statics.field441 == var10 && var10.field2612 != 0) {
                                                var54 = var10.field2612;
                                            }
                                            if (var10.field2588.length() > 0) {
                                                var53 = var10.field2588;
                                            }
                                        } else {
                                            var54 = var10.field2590;
                                            if (Statics.field441 == var10 && var10.field2678 != 0) {
                                                var54 = var10.field2678;
                                            }
                                        }
                                        if (var10.field2572 && var10.field2592 != -1) {
                                            class40 var55 = class40.method125(var10.field2592);
                                            var53 = var55.field960;
                                            if (var53 == null) {
                                                var53 = "null";
                                            }
                                            if ((var55.field985 == 1 || var10.field2682 != 1) && var10.field2682 != -1) {
                                                String var56 = class2.method2892(16748608) + var53 + class2.field24 + " " + 'x';
                                                int var57 = var10.field2682;
                                                String var58 = Integer.toString(var57);
                                                for (int var59 = var58.length() - 3; var59 > 0; var59 -= 3) {
                                                    var58 = var58.substring(0, var59) + class2.field18 + var58.substring(var59);
                                                }
                                                StringBuilder var10000;
                                                class134 var10001;
                                                String var60;
                                                if (var58.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2892(65408)).append(var58.substring(0, var58.length() - 8));
                                                    var10001 = (class134) null;
                                                    var60 = var10000.append(class134.field2206).append(" ").append(class2.field20).append(var58).append(class2.field21).append(class2.field24).toString();
                                                } else if (var58.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method2892(16777215)).append(var58.substring(0, var58.length() - 4));
                                                    var10001 = (class134) null;
                                                    var60 = var10000.append(class134.field2208).append(" ").append(class2.field20).append(var58).append(class2.field21).append(class2.field24).toString();
                                                } else {
                                                    var60 = " " + class2.method2892(16776960) + var58 + class2.field24;
                                                }
                                                var53 = var56 + var60;
                                            }
                                        }
                                        if (field611 == var10) {
                                            class134 var124 = (class134) null;
                                            var53 = class134.field2203;
                                            var54 = var10.field2590;
                                        }
                                        if (!var10.field2572) {
                                            var53 = method521(var53, var10);
                                        }
                                        var52.method3329(var53, var12, var13, var10.field2582, var10.field2583, var54, var10.field2625 ? 0 : -1, var10.field2623, var10.field2638, var10.field2652);
                                    } else if (class158.field2591) {
                                        method2272(var10);
                                    }
                                } else if (var10.field2575 == 5) {
                                    if (var10.field2572) {
                                        class86 var62;
                                        if (var10.field2592 == -1) {
                                            var62 = var10.method3042(false);
                                        } else {
                                            var62 = class40.method202(var10.field2592, var10.field2682, var10.field2573, var10.field2663, false);
                                        }
                                        if (var62 != null) {
                                            int var63 = var62.field1445;
                                            int var64 = var62.field1447;
                                            if (var10.field2600) {
                                                class89.method1732(var12, var13, var10.field2582 + var12, var10.field2583 + var13);
                                                int var65 = (var10.field2582 + (var63 - 1)) / var63;
                                                int var66 = (var10.field2583 + (var64 - 1)) / var64;
                                                for (int var67 = 0; var67 < var65; var67++) {
                                                    for (int var68 = 0; var68 < var66; var68++) {
                                                        if (var10.field2599 != 0) {
                                                            var62.method1646(var63 / 2 + var63 * var67 + var12, var64 / 2 + var64 * var68 + var13, var10.field2599, 4096);
                                                        } else if (var14 == 0) {
                                                            var62.method1635(var63 * var67 + var12, var64 * var68 + var13);
                                                        } else {
                                                            var62.method1712(var63 * var67 + var12, var64 * var68 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class89.method1731(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var69 = var10.field2582 * 4096 / var63;
                                                if (var10.field2599 != 0) {
                                                    var62.method1646(var10.field2582 / 2 + var12, var10.field2583 / 2 + var13, var10.field2599, var69);
                                                } else if (var14 != 0) {
                                                    var62.method1679(var12, var13, var10.field2582, var10.field2583, 256 - (var14 & 0xFF));
                                                } else if (var10.field2582 == var63 && var10.field2583 == var64) {
                                                    var62.method1635(var12, var13);
                                                } else {
                                                    var62.method1634(var12, var13, var10.field2582, var10.field2583);
                                                }
                                            }
                                        } else if (class158.field2591) {
                                            method2272(var10);
                                        }
                                    } else {
                                        class86 var61 = var10.method3042(method2511(var10));
                                        if (var61 != null) {
                                            var61.method1635(var12, var13);
                                        } else if (class158.field2591) {
                                            method2272(var10);
                                        }
                                    }
                                } else if (var10.field2575 == 6) {
                                    boolean var70 = method2511(var10);
                                    int var71;
                                    if (var70) {
                                        var71 = var10.field2602;
                                    } else {
                                        var71 = var10.field2609;
                                    }
                                    class112 var72 = null;
                                    int var73 = 0;
                                    if (var10.field2592 != -1) {
                                        class40 var74 = class40.method125(var10.field2592);
                                        if (var74 != null) {
                                            class40 var75 = var74.method811(var10.field2682);
                                            var72 = var75.method810(1);
                                            if (var72 == null) {
                                                method2272(var10);
                                            } else {
                                                var72.method2242();
                                                var73 = var72.field1524 / 2;
                                            }
                                        }
                                    } else if (var10.field2667 == 5) {
                                        if (var10.field2606 == 0) {
                                            var72 = field705.method3140((class34) null, -1, (class34) null, -1);
                                        } else {
                                            var72 = Statics.field714.method10();
                                        }
                                    } else if (var71 == -1) {
                                        var72 = var10.method3082((class34) null, -1, var70, Statics.field714.field28);
                                        if (var72 == null && class158.field2591) {
                                            method2272(var10);
                                        }
                                    } else {
                                        class34 var76 = class34.method516(var71);
                                        var72 = var10.method3082(var76, var10.field2679, var70, Statics.field714.field28);
                                        if (var72 == null && class158.field2591) {
                                            method2272(var10);
                                        }
                                    }
                                    class104.method2089(var10.field2582 / 2 + var12, var10.field2583 / 2 + var13);
                                    int var77 = var10.field2616 * class104.field1752[var10.field2613] >> 16;
                                    int var78 = var10.field2616 * class104.field1731[var10.field2613] >> 16;
                                    if (var72 != null) {
                                        if (var10.field2572) {
                                            var72.method2242();
                                            if (var10.field2618) {
                                                var72.method2225(0, var10.field2614, var10.field2654, var10.field2613, var10.field2611, var10.field2598 + var73 + var77, var10.field2598 + var78, var10.field2616);
                                            } else {
                                                var72.method2205(0, var10.field2614, var10.field2654, var10.field2613, var10.field2611, var10.field2598 + var73 + var77, var10.field2598 + var78);
                                            }
                                        } else {
                                            var72.method2205(0, var10.field2614, 0, var10.field2613, 0, var77, var78);
                                        }
                                    }
                                    class104.method2088();
                                } else {
                                    if (var10.field2575 == 7) {
                                        class183 var79 = var10.method3049();
                                        if (var79 == null) {
                                            if (class158.field2591) {
                                                method2272(var10);
                                            }
                                            continue;
                                        }
                                        int var80 = 0;
                                        for (int var81 = 0; var81 < var10.field2583; var81++) {
                                            for (int var82 = 0; var82 < var10.field2582; var82++) {
                                                if (var10.field2675[var80] > 0) {
                                                    class40 var83 = class40.method125(var10.field2675[var80] - 1);
                                                    String var84;
                                                    if (var83.field985 != 1 && var10.field2676[var80] == 1) {
                                                        var84 = class2.method2892(16748608) + var83.field960 + class2.field24;
                                                    } else {
                                                        String var85 = class2.method2892(16748608) + var83.field960 + class2.field24 + " " + 'x';
                                                        int var86 = var10.field2676[var80];
                                                        String var87 = Integer.toString(var86);
                                                        for (int var88 = var87.length() - 3; var88 > 0; var88 -= 3) {
                                                            var87 = var87.substring(0, var88) + class2.field18 + var87.substring(var88);
                                                        }
                                                        String var89;
                                                        if (var87.length() > 9) {
                                                            var89 = " " + class2.method2892(65408) + var87.substring(0, var87.length() - 8) + class134.field2206 + " " + class2.field20 + var87 + class2.field21 + class2.field24;
                                                        } else if (var87.length() > 6) {
                                                            var89 = " " + class2.method2892(16777215) + var87.substring(0, var87.length() - 4) + class134.field2208 + " " + class2.field20 + var87 + class2.field21 + class2.field24;
                                                        } else {
                                                            var89 = " " + class2.method2892(16776960) + var87 + class2.field24;
                                                        }
                                                        var84 = var85 + var89;
                                                    }
                                                    int var90 = (var10.field2626 + 115) * var82 + var12;
                                                    int var91 = (var10.field2627 + 12) * var81 + var13;
                                                    if (var10.field2623 == 0) {
                                                        var79.method3327(var84, var90, var91, var10.field2590, var10.field2625 ? 0 : -1);
                                                    } else if (var10.field2623 == 1) {
                                                        var79.method3366(var84, var10.field2582 / 2 + var90, var91, var10.field2590, var10.field2625 ? 0 : -1);
                                                    } else {
                                                        var79.method3328(var84, var10.field2582 + var90 - 1, var91, var10.field2590, var10.field2625 ? 0 : -1);
                                                    }
                                                }
                                                var80++;
                                            }
                                        }
                                    }
                                    if (var10.field2575 == 8 && Statics.field78 == var10 && field599 == field447) {
                                        int var92 = 0;
                                        int var93 = 0;
                                        class183 var94 = Statics.field63;
                                        String var95 = var10.field2624;
                                        String var96 = method521(var95, var10);
                                        while (var96.length() > 0) {
                                            int var97 = var96.indexOf(class2.field17);
                                            String var98;
                                            if (var97 == -1) {
                                                var98 = var96;
                                                var96 = "";
                                            } else {
                                                var98 = var96.substring(0, var97);
                                                var96 = var96.substring(var97 + 4);
                                            }
                                            int var99 = var94.method3323(var98);
                                            if (var99 > var92) {
                                                var92 = var99;
                                            }
                                            var93 += var94.field2847 + 1;
                                        }
                                        var92 += 6;
                                        var93 += 7;
                                        int var100 = var10.field2582 + var12 - 5 - var92;
                                        int var101 = var10.field2583 + var13 + 5;
                                        if (var100 < var12 + 5) {
                                            var100 = var12 + 5;
                                        }
                                        if (var92 + var100 > arg4) {
                                            var100 = arg4 - var92;
                                        }
                                        if (var93 + var101 > arg5) {
                                            var101 = arg5 - var93;
                                        }
                                        class89.method1767(var100, var101, var92, var93, 16777120);
                                        class89.method1739(var100, var101, var92, var93, 0);
                                        String var102 = var10.field2624;
                                        int var103 = var94.field2847 + var101 + 2;
                                        String var104 = method521(var102, var10);
                                        while (var104.length() > 0) {
                                            int var105 = var104.indexOf(class2.field17);
                                            String var106;
                                            if (var105 == -1) {
                                                var106 = var104;
                                                var104 = "";
                                            } else {
                                                var106 = var104.substring(0, var105);
                                                var104 = var104.substring(var105 + 4);
                                            }
                                            var94.method3327(var106, var100 + 3, var103, 0, -1);
                                            var103 += var94.field2847 + 1;
                                        }
                                    }
                                    if (var10.field2575 == 9) {
                                        if (var10.field2596 == 1) {
                                            class89.method1745(var12, var13, var10.field2582 + var12, var10.field2583 + var13, var10.field2590);
                                        } else {
                                            int var107 = var10.field2582 >= 0 ? var10.field2582 : -var10.field2582;
                                            int var108 = var10.field2583 >= 0 ? var10.field2583 : -var10.field2583;
                                            int var109 = var107;
                                            if (var107 < var108) {
                                                var109 = var108;
                                            }
                                            if (var109 != 0) {
                                                int var110 = (var10.field2582 << 16) / var109;
                                                int var111 = (var10.field2583 << 16) / var109;
                                                if (var111 <= var110) {
                                                    var110 = -var110;
                                                } else {
                                                    var111 = -var111;
                                                }
                                                int var112 = var10.field2596 * var111 >> 17;
                                                int var113 = var10.field2596 * var111 + 1 >> 17;
                                                int var114 = var10.field2596 * var110 >> 17;
                                                int var115 = var10.field2596 * var110 + 1 >> 17;
                                                int var116 = var12 + var112;
                                                int var117 = var12 - var113;
                                                int var118 = var10.field2582 + var12 - var113;
                                                int var119 = var10.field2582 + var12 + var112;
                                                int var120 = var13 + var114;
                                                int var121 = var13 - var115;
                                                int var122 = var10.field2583 + var13 - var115;
                                                int var123 = var10.field2583 + var13 + var114;
                                                class104.method2146(var116, var117, var118);
                                                class104.method2097(var120, var121, var122, var116, var117, var118, var10.field2590);
                                                class104.method2146(var116, var118, var119);
                                                class104.method2097(var120, var122, var123, var116, var118, var119, var10.field2590);
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

    @ObfuscatedName("ag.cq(Ljava/lang/String;Lfw;I)Ljava/lang/String;")
    public static String method521(String arg0, class158 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2268(arg1, var2 - 1);
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
                if (Statics.field1900 != null) {
                    int var9 = Statics.field1900.field1385;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1900.field1387 != null) {
                        var8 = (String) Statics.field1900.field1387;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("aw.cn(Lfw;IIIIIIB)V")
    public static final void method865(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field530) {
            field531 = 32;
        } else {
            field531 = 0;
        }
        field530 = false;
        if (class77.field1377 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2580 -= 4;
                method2272(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2580 += 4;
                method2272(arg0);
            } else if (arg5 >= arg1 - field531 && arg5 < field531 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2580 = (arg4 - arg3) * var8 / var9;
                method2272(arg0);
                field530 = true;
            }
        }
        if (field643 == 0) {
            return;
        }
        int var10 = arg0.field2582;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2580 += field643 * 45;
            method2272(arg0);
        }
    }

    @ObfuscatedName("ae.ck(IIIIII)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field754[0].method1721(arg0, arg1);
        Statics.field754[1].method1721(arg0, arg1 + arg3 - 16);
        class89.method1767(arg0, arg1 + 16, 16, arg3 - 32, field532);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class89.method1767(arg0, arg1 + 16 + var6, 16, var5, field527);
        class89.method1743(arg0, arg1 + 16 + var6, var5, field519);
        class89.method1743(arg0 + 1, arg1 + 16 + var6, var5, field519);
        class89.method1741(arg0, arg1 + 16 + var6, 16, field519);
        class89.method1741(arg0, arg1 + 17 + var6, 16, field519);
        class89.method1743(arg0 + 15, arg1 + 16 + var6, var5, field461);
        class89.method1743(arg0 + 14, arg1 + 17 + var6, var5 - 1, field461);
        class89.method1741(arg0, arg1 + 15 + var6 + var5, 16, field461);
        class89.method1741(arg0 + 1, arg1 + 14 + var6 + var5, 15, field461);
    }

    @ObfuscatedName("dg.co(Lfw;I)Z")
    public static final boolean method2511(class158 arg0) {
        if (arg0.field2587 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2587.length; var1++) {
            int var2 = method2268(arg0, var1);
            int var3 = arg0.field2671[var1];
            if (arg0.field2587[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2587[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2587[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("da.cs(Lfw;II)I")
    public static final int method2268(class158 arg0, int arg1) {
        if (arg0.field2669 == null || arg1 >= arg0.field2669.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2669[arg1];
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
                    var7 = field584[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field585[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field586[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class158 var11 = class158.method220(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class40.method125(var12).field972 || field449)) {
                        for (int var13 = 0; var13 < var11.field2675.length; var13++) {
                            if (var12 + 1 == var11.field2675[var13]) {
                                var7 += var11.field2676[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class159.field2696[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class130.field2023[field585[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class159.field2696[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field714.field49;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class130.field2019[var14]) {
                            var7 += field585[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class158 var17 = class158.method220(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class40.method125(var18).field972 || field449)) {
                        for (int var19 = 0; var19 < var17.field2675.length; var19++) {
                            if (var18 + 1 == var17.field2675[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field612;
                }
                if (var6 == 12) {
                    var7 = field613;
                }
                if (var6 == 13) {
                    int var20 = class159.field2696[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class159.method1498(var22);
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
                    var7 = (Statics.field714.field399 >> 7) + Statics.field497;
                }
                if (var6 == 19) {
                    var7 = (Statics.field714.field383 >> 7) + Statics.field904;
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

    @ObfuscatedName("t.cc(Lfw;IIB)V")
    public static final void method140(class158 arg0, int arg1, int arg2) {
        if (arg0.field2576 == 1) {
            method677(arg0.field2674, "", 24, 0, 0, arg0.field2620);
        }
        if (arg0.field2576 == 2 && !field603) {
            int var3 = method712(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2639 == null || arg0.field2639.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2639;
            }
            if (var5 != null) {
                method677(var5, class2.method2892(65280) + arg0.field2673, 25, 0, -1, arg0.field2620);
            }
        }
        if (arg0.field2576 == 3) {
            method677(class134.field2204, "", 26, 0, 0, arg0.field2620);
        }
        if (arg0.field2576 == 4) {
            method677(arg0.field2674, "", 28, 0, 0, arg0.field2620);
        }
        if (arg0.field2576 == 5) {
            method677(arg0.field2674, "", 29, 0, 0, arg0.field2620);
        }
        if (arg0.field2576 == 6 && field611 == null) {
            method677(arg0.field2674, "", 30, 0, -1, arg0.field2620);
        }
        if (arg0.field2575 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2583; var8++) {
                for (int var9 = 0; var9 < arg0.field2582; var9++) {
                    int var10 = (arg0.field2626 + 32) * var9;
                    int var11 = (arg0.field2627 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2628[var7];
                        var11 += arg0.field2610[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field686 = var7;
                        Statics.field48 = arg0;
                        if (arg0.field2675[var7] > 0) {
                            class40 var12 = class40.method125(arg0.field2675[var7] - 1);
                            if (field663 == 1 && class162.method24(method712(arg0))) {
                                if (Statics.field1000 != arg0.field2620 || Statics.field357 != var7) {
                                    method677(class134.field2195, field658 + " " + class2.field19 + " " + class2.method2892(16748608) + var12.field960, 31, var12.field958, var7, arg0.field2620);
                                }
                            } else if (!field603 || !class162.method24(method712(arg0))) {
                                String[] var13 = var12.field975;
                                if (field480) {
                                    var13 = method1348(var13);
                                }
                                if (class162.method24(method712(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method677(var13[var14], class2.method2892(16748608) + var12.field960, var15, var12.field958, var7, arg0.field2620);
                                        } else if (var14 == 4) {
                                            method677(class134.field2056, class2.method2892(16748608) + var12.field960, 37, var12.field958, var7, arg0.field2620);
                                        }
                                    }
                                }
                                int var16 = method712(arg0);
                                boolean var17 = (var16 >> 31 & 0x1) != 0;
                                if (var17) {
                                    method677(class134.field2195, class2.method2892(16748608) + var12.field960, 38, var12.field958, var7, arg0.field2620);
                                }
                                class162 var10000 = (class162) null;
                                if (class162.method24(method712(arg0)) && var13 != null) {
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
                                            method677(var13[var18], class2.method2892(16748608) + var12.field960, var19, var12.field958, var7, arg0.field2620);
                                        }
                                    }
                                }
                                String[] var20 = arg0.field2593;
                                if (field480) {
                                    var20 = method1348(var20);
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
                                            method677(var20[var21], class2.method2892(16748608) + var12.field960, var22, var12.field958, var7, arg0.field2620);
                                        }
                                    }
                                }
                                method677(class134.field2196, class2.method2892(16748608) + var12.field960, 1005, var12.field958, var7, arg0.field2620);
                            } else if ((Statics.field182 & 0x10) == 16) {
                                method677(field605, field468 + " " + class2.field19 + " " + class2.method2892(16748608) + var12.field960, 32, var12.field958, var7, arg0.field2620);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2572) {
            return;
        }
        if (!field603) {
            for (int var23 = 9; var23 >= 5; var23--) {
                String var24 = method1499(arg0, var23);
                if (var24 != null) {
                    method677(var24, arg0.field2633, 1007, var23 + 1, arg0.field2601, arg0.field2620);
                }
            }
            int var25 = method712(arg0);
            int var26 = var25 >> 11 & 0x3F;
            String var27;
            if (var26 == 0) {
                var27 = null;
            } else if (arg0.field2639 == null || arg0.field2639.trim().length() == 0) {
                var27 = null;
            } else {
                var27 = arg0.field2639;
            }
            if (var27 != null) {
                method677(var27, arg0.field2633, 25, 0, arg0.field2601, arg0.field2620);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = method1499(arg0, var29);
                if (var30 != null) {
                    method677(var30, arg0.field2633, 57, var29 + 1, arg0.field2601, arg0.field2620);
                }
            }
            int var31 = method712(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method677(class134.field2054, "", 30, 0, arg0.field2601, arg0.field2620);
            }
        } else if (class162.method1390(method712(arg0)) && (Statics.field182 & 0x20) == 32) {
            method677(field605, field468 + " " + class2.field19 + " " + arg0.field2633, 58, 0, arg0.field2601, arg0.field2620);
        }
    }

    @ObfuscatedName("y.cm(IIIIIIII)V")
    public static final void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class158.method1202(arg0)) {
            method547(Statics.field2607[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("as.ci([Lfw;IIIIIIII)V")
    public static final void method547(class158[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class158 var9 = arg0[var8];
            if (var9 != null && (!var9.field2572 || var9.field2575 == 0 || var9.field2640 || method712(var9) != 0 || field619 == var9) && var9.field2585 == arg1 && (!var9.field2572 || !method1995(var9))) {
                int var10 = var9.field2578 + arg6;
                int var11 = var9.field2579 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2575 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2575 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2582 + var10;
                    int var19 = var9.field2583 + var11;
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
                    int var22 = var9.field2582 + var10;
                    int var23 = var9.field2583 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field512 == var9) {
                    field692 = true;
                    field627 = var10;
                    field505 = var11;
                }
                if (!var9.field2572 || var12 < var14 && var13 < var15) {
                    if (var9.field2577 == 1337) {
                        method2272(var9);
                    } else if (var9.field2577 != 1338) {
                        if (var9.field2575 == 0) {
                            if (!var9.field2572 && method1995(var9) && Statics.field441 != var9) {
                                continue;
                            }
                            method547(arg0, var9.field2620, var12, var13, var14, var15, var10 - var9.field2586, var11 - var9.field2580);
                            if (var9.field2681 != null) {
                                method547(var9.field2681, var9.field2620, var12, var13, var14, var15, var10 - var9.field2586, var11 - var9.field2580);
                            }
                            class4 var36 = (class4) field608.method3259((long) var9.field2620);
                            if (var36 != null) {
                                method134(var36.field60, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2572) {
                            boolean var37;
                            if (class77.field1373 >= var12 && class77.field1366 >= var13 && class77.field1373 < var14 && class77.field1366 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if (class77.field1377 == 1 && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if (class77.field1370 == 1 && class77.field1372 >= var12 && class77.field1369 >= var13 && class77.field1372 < var14 && class77.field1369 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                int var40 = class77.field1372 - var10;
                                int var41 = class77.field1369 - var11;
                                if (field512 == null && !field572 && var9 != null) {
                                    class158 var42 = method576(var9);
                                    if (var42 == null) {
                                        var42 = var9.field2658;
                                    }
                                    if (var42 != null) {
                                        field512 = var9;
                                        field619 = method856(var9);
                                        field562 = var40;
                                        field621 = var41;
                                        Statics.field2820 = 0;
                                        field629 = false;
                                    }
                                }
                            }
                            if (field512 != null && field512 != var9 && var37) {
                                int var44 = method712(var9);
                                boolean var45 = (var44 >> 20 & 0x1) != 0;
                                if (var45) {
                                    field677 = var9;
                                }
                            }
                            if (field619 == var9) {
                                field623 = true;
                                field624 = var10;
                                field625 = var11;
                            }
                            if (var9.field2640) {
                                if (var37 && field643 != 0 && var9.field2661 != null) {
                                    class1 var46 = new class1();
                                    var46.field3 = var9;
                                    var46.field16 = field643;
                                    var46.field1 = var9.field2661;
                                    field644.method3264(var46);
                                }
                                if (field512 != null || Statics.field372 != null || field572) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2569 && var39) {
                                    var9.field2569 = true;
                                    if (var9.field2642 != null) {
                                        class1 var47 = new class1();
                                        var47.field3 = var9;
                                        var47.field4 = class77.field1372 - var10;
                                        var47.field16 = class77.field1369 - var11;
                                        var47.field1 = var9.field2642;
                                        field644.method3264(var47);
                                    }
                                }
                                if (var9.field2569 && var38 && var9.field2643 != null) {
                                    class1 var48 = new class1();
                                    var48.field3 = var9;
                                    var48.field4 = class77.field1373 - var10;
                                    var48.field16 = class77.field1366 - var11;
                                    var48.field1 = var9.field2643;
                                    field644.method3264(var48);
                                }
                                if (var9.field2569 && !var38) {
                                    var9.field2569 = false;
                                    if (var9.field2644 != null) {
                                        class1 var49 = new class1();
                                        var49.field3 = var9;
                                        var49.field4 = class77.field1373 - var10;
                                        var49.field16 = class77.field1366 - var11;
                                        var49.field1 = var9.field2644;
                                        field617.method3264(var49);
                                    }
                                }
                                if (var38 && var9.field2645 != null) {
                                    class1 var50 = new class1();
                                    var50.field3 = var9;
                                    var50.field4 = class77.field1373 - var10;
                                    var50.field16 = class77.field1366 - var11;
                                    var50.field1 = var9.field2645;
                                    field644.method3264(var50);
                                }
                                if (!var9.field2657 && var37) {
                                    var9.field2657 = true;
                                    if (var9.field2646 != null) {
                                        class1 var51 = new class1();
                                        var51.field3 = var9;
                                        var51.field4 = class77.field1373 - var10;
                                        var51.field16 = class77.field1366 - var11;
                                        var51.field1 = var9.field2646;
                                        field644.method3264(var51);
                                    }
                                }
                                if (var9.field2657 && var37 && var9.field2647 != null) {
                                    class1 var52 = new class1();
                                    var52.field3 = var9;
                                    var52.field4 = class77.field1373 - var10;
                                    var52.field16 = class77.field1366 - var11;
                                    var52.field1 = var9.field2647;
                                    field644.method3264(var52);
                                }
                                if (var9.field2657 && !var37) {
                                    var9.field2657 = false;
                                    if (var9.field2648 != null) {
                                        class1 var53 = new class1();
                                        var53.field3 = var9;
                                        var53.field4 = class77.field1373 - var10;
                                        var53.field16 = class77.field1366 - var11;
                                        var53.field1 = var9.field2648;
                                        field617.method3264(var53);
                                    }
                                }
                                if (var9.field2659 != null) {
                                    class1 var54 = new class1();
                                    var54.field3 = var9;
                                    var54.field1 = var9.field2659;
                                    field523.method3264(var54);
                                }
                                if (var9.field2653 != null && field632 > var9.field2685) {
                                    if (var9.field2631 == null || field632 - var9.field2685 > 32) {
                                        class1 var59 = new class1();
                                        var59.field3 = var9;
                                        var59.field1 = var9.field2653;
                                        field644.method3264(var59);
                                    } else {
                                        label412: for (int var55 = var9.field2685; var55 < field632; var55++) {
                                            int var56 = field631[var55 & 0x1F];
                                            for (int var57 = 0; var57 < var9.field2631.length; var57++) {
                                                if (var9.field2631[var57] == var56) {
                                                    class1 var58 = new class1();
                                                    var58.field3 = var9;
                                                    var58.field1 = var9.field2653;
                                                    field644.method3264(var58);
                                                    break label412;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2685 = field632;
                                }
                                if (var9.field2655 != null && field648 > var9.field2686) {
                                    if (var9.field2656 == null || field648 - var9.field2686 > 32) {
                                        class1 var64 = new class1();
                                        var64.field3 = var9;
                                        var64.field1 = var9.field2655;
                                        field644.method3264(var64);
                                    } else {
                                        label392: for (int var60 = var9.field2686; var60 < field648; var60++) {
                                            int var61 = field594[var60 & 0x1F];
                                            for (int var62 = 0; var62 < var9.field2656.length; var62++) {
                                                if (var9.field2656[var62] == var61) {
                                                    class1 var63 = new class1();
                                                    var63.field3 = var9;
                                                    var63.field1 = var9.field2655;
                                                    field644.method3264(var63);
                                                    break label392;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2686 = field648;
                                }
                                if (var9.field2574 != null && field564 > var9.field2687) {
                                    if (var9.field2621 == null || field564 - var9.field2687 > 32) {
                                        class1 var69 = new class1();
                                        var69.field3 = var9;
                                        var69.field1 = var9.field2574;
                                        field644.method3264(var69);
                                    } else {
                                        label372: for (int var65 = var9.field2687; var65 < field564; var65++) {
                                            int var66 = field518[var65 & 0x1F];
                                            for (int var67 = 0; var67 < var9.field2621.length; var67++) {
                                                if (var9.field2621[var67] == var66) {
                                                    class1 var68 = new class1();
                                                    var68.field3 = var9;
                                                    var68.field1 = var9.field2574;
                                                    field644.method3264(var68);
                                                    break label372;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2687 = field564;
                                }
                                if (field567 > var9.field2615 && var9.field2662 != null) {
                                    class1 var70 = new class1();
                                    var70.field3 = var9;
                                    var70.field1 = var9.field2662;
                                    field644.method3264(var70);
                                }
                                if (field638 > var9.field2615 && var9.field2584 != null) {
                                    class1 var71 = new class1();
                                    var71.field3 = var9;
                                    var71.field1 = var9.field2584;
                                    field644.method3264(var71);
                                }
                                if (field691 > var9.field2615 && var9.field2665 != null) {
                                    class1 var72 = new class1();
                                    var72.field3 = var9;
                                    var72.field1 = var9.field2665;
                                    field644.method3264(var72);
                                }
                                if (field553 > var9.field2615 && var9.field2666 != null) {
                                    class1 var73 = new class1();
                                    var73.field3 = var9;
                                    var73.field1 = var9.field2666;
                                    field644.method3264(var73);
                                }
                                var9.field2615 = field630;
                                if (var9.field2680 != null) {
                                    for (int var74 = 0; var74 < field555; var74++) {
                                        class1 var75 = new class1();
                                        var75.field3 = var9;
                                        var75.field7 = field491[var74];
                                        var75.field8 = field669[var74];
                                        var75.field1 = var9.field2680;
                                        field644.method3264(var75);
                                    }
                                }
                            }
                        }
                        if (!var9.field2572) {
                            if (field512 != null || Statics.field372 != null || field572) {
                                return;
                            }
                            if ((var9.field2672 >= 0 || var9.field2678 != 0) && class77.field1373 >= var12 && class77.field1366 >= var13 && class77.field1373 < var14 && class77.field1366 < var15) {
                                if (var9.field2672 >= 0) {
                                    Statics.field441 = arg0[var9.field2672];
                                } else {
                                    Statics.field441 = var9;
                                }
                            }
                            if (var9.field2575 == 8 && class77.field1373 >= var12 && class77.field1366 >= var13 && class77.field1373 < var14 && class77.field1366 < var15) {
                                Statics.field78 = var9;
                            }
                            if (var9.field2589 > var9.field2583) {
                                method865(var9, var9.field2582 + var10, var11, var9.field2583, var9.field2589, class77.field1373, class77.field1366);
                            }
                        }
                    } else if ((field709 == 0 || field709 == 3) && class77.field1370 == 1) {
                        int var24 = class77.field1372 - 25 - var10;
                        int var25 = class77.field1369 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field706 + field533 & 0x7FF;
                            int var27 = class104.field1752[var26];
                            int var28 = class104.field1731[var26];
                            int var29 = (field522 + 256) * var27 >> 8;
                            int var30 = (field522 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field714.field399 + var31 >> 7;
                            int var34 = Statics.field714.field383 - var32 >> 7;
                            boolean var35 = Statics.method785(Statics.field714.field420[0], Statics.field714.field436[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field485.method2396(var24);
                                field485.method2396(var25);
                                field485.method2397(field533);
                                field485.method2396(57);
                                field485.method2396(field706);
                                field485.method2396(field522);
                                field485.method2396(89);
                                field485.method2397(Statics.field714.field399);
                                field485.method2397(Statics.field714.field383);
                                field485.method2396(field703);
                                field485.method2396(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("p.cb(III)V")
    public static final void method5(int arg0, int arg1) {
        if (class158.method1202(arg0)) {
            method517(Statics.field2607[arg0], arg1);
        }
    }

    @ObfuscatedName("client.cu([Lfw;II)V")
    public static final void method517(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2575 == 0) {
                    if (var3.field2681 != null) {
                        method517(var3.field2681, arg1);
                    }
                    class4 var4 = (class4) field608.method3259((long) var3.field2620);
                    if (var4 != null) {
                        method5(var4.field60, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2603 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field1 = var3.field2603;
                    class26.method161(var5);
                }
                if (arg1 == 1 && var3.field2622 != null) {
                    if (var3.field2601 >= 0) {
                        class158 var6 = class158.method220(var3.field2620);
                        if (var6 == null || var6.field2681 == null || var3.field2601 >= var6.field2681.length || var6.field2681[var3.field2601] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field1 = var3.field2622;
                    class26.method161(var7);
                }
            }
        }
    }

    @ObfuscatedName("du.cp(Lfw;B)V")
    public static void method2272(class158 arg0) {
        if (field498 == arg0.field2689) {
            field650[arg0.field2688] = true;
        }
    }

    @ObfuscatedName("k.cj(I)V")
    public static void method21() {
        for (class4 var0 = (class4) field608.method3248(); var0 != null; var0 = (class4) field608.method3247()) {
            int var1 = var0.field60;
            if (class158.method1202(var1)) {
                boolean var2 = true;
                class158[] var3 = Statics.field2607[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2572;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2816;
                    class158 var6 = class158.method220(var5);
                    if (var6 != null) {
                        method2272(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.cg(Lfw;B)Lfw;")
    public static class158 method856(class158 arg0) {
        class158 var1 = method576(arg0);
        if (var1 == null) {
            var1 = arg0.field2658;
        }
        return var1;
    }

    @ObfuscatedName("bw.ch([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method1348(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("dv.ct(II)V")
    public static final void method2175(int arg0) {
        if (!class158.method1202(arg0)) {
            return;
        }
        class158[] var1 = Statics.field2607[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class158 var3 = var1[var2];
            if (var3 != null) {
                var3.field2679 = 0;
                var3.field2629 = 0;
            }
        }
    }

    @ObfuscatedName("z.cz([Lfw;II)V")
    public static final void method227(class158[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class158 var3 = arg0[var2];
            if (var3 != null && var3.field2585 == arg1 && (!var3.field2572 || !method1995(var3))) {
                if (var3.field2575 == 0) {
                    if (!var3.field2572 && method1995(var3) && Statics.field441 != var3) {
                        continue;
                    }
                    method227(arg0, var3.field2620);
                    if (var3.field2681 != null) {
                        method227(var3.field2681, var3.field2620);
                    }
                    class4 var4 = (class4) field608.method3259((long) var3.field2620);
                    if (var4 != null) {
                        int var5 = var4.field60;
                        if (class158.method1202(var5)) {
                            method227(Statics.field2607[var5], -1);
                        }
                    }
                }
                if (var3.field2575 == 6) {
                    if (var3.field2609 != -1 || var3.field2602 != -1) {
                        boolean var6 = method2511(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2602;
                        } else {
                            var7 = var3.field2609;
                        }
                        if (var7 != -1) {
                            class34 var8 = class34.method516(var7);
                            var3.field2629 += field525;
                            while (var3.field2629 > var8.field853[var3.field2679]) {
                                var3.field2629 -= var8.field853[var3.field2679];
                                var3.field2679++;
                                if (var3.field2679 >= var8.field851.length) {
                                    var3.field2679 -= var8.field864;
                                    if (var3.field2679 < 0 || var3.field2679 >= var8.field851.length) {
                                        var3.field2679 = 0;
                                    }
                                }
                                method2272(var3);
                            }
                        }
                    }
                    if (var3.field2617 != 0 && !var3.field2572) {
                        int var9 = var3.field2617 >> 16;
                        int var10 = var3.field2617 << 16 >> 16;
                        int var11 = field525 * var9;
                        int var12 = field525 * var10;
                        var3.field2613 = var3.field2613 + var11 & 0x7FF;
                        var3.field2614 = var3.field2614 + var12 & 0x7FF;
                        method2272(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.cd(II)V")
    public static final void method221(int arg0) {
        method21();
        class7.method1155();
        class42 var1 = (class42) class42.field1011.method3196((long) arg0);
        class42 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field1013.method2920(16, arg0);
            class42 var4 = new class42();
            if (var3 != null) {
                var4.method874(new class127(var3));
            }
            class42.field1011.method3197(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var5 = var2.field1019;
        if (var5 == 0) {
            return;
        }
        int var6 = class159.field2696[arg0];
        if (var5 == 1) {
            if (var6 == 1) {
                class104.method2121(0.9D);
                ((class110) Statics.field1749).method2180(0.9D);
            }
            if (var6 == 2) {
                class104.method2121(0.8D);
                ((class110) Statics.field1749).method2180(0.8D);
            }
            if (var6 == 3) {
                class104.method2121(0.7D);
                ((class110) Statics.field1749).method2180(0.7D);
            }
            if (var6 == 4) {
                class104.method2121(0.6D);
                ((class110) Statics.field1749).method2180(0.6D);
            }
            class40.field957.method3198();
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
                if (field682 == 0 && field656 != -1) {
                    class138.method2342(Statics.field474, field656, 0, var7, false);
                    field684 = false;
                } else if (var7 == 0) {
                    class138.method1323();
                    field684 = false;
                } else if (class138.field2315 == 0) {
                    Statics.field2313.method2687(var7);
                } else {
                    Statics.field2330 = var7;
                }
                field682 = var7;
            }
        }
        if (var5 == 4) {
            if (var6 == 0) {
                field659 = 127;
            }
            if (var6 == 1) {
                field659 = 96;
            }
            if (var6 == 2) {
                field659 = 64;
            }
            if (var6 == 3) {
                field659 = 32;
            }
            if (var6 == 4) {
                field659 = 0;
            }
        }
        if (var5 == 5) {
            field587 = var6;
        }
        if (var5 == 6) {
            field526 = var6;
        }
        if (var5 == 9) {
            field626 = var6;
        }
        if (var5 != 10) {
            return;
        }
        if (var6 == 0) {
            field575 = 127;
        }
        if (var6 == 1) {
            field575 = 96;
        }
        if (var6 == 2) {
            field575 = 64;
        }
        if (var6 == 3) {
            field575 = 32;
        }
        if (var6 == 4) {
            field575 = 0;
        }
    }

    @ObfuscatedName("fm.cf(Lfw;I)V")
    public static final void method3041(class158 arg0) {
        int var1 = arg0.field2577;
        if (var1 == 324) {
            if (field655 == -1) {
                field655 = arg0.field2635;
                field707 = arg0.field2668;
            }
            if (field705.field2718) {
                arg0.field2635 = field655;
            } else {
                arg0.field2635 = field707;
            }
        } else if (var1 == 325) {
            if (field655 == -1) {
                field655 = arg0.field2635;
                field707 = arg0.field2668;
            }
            if (field705.field2718) {
                arg0.field2635 = field707;
            } else {
                arg0.field2635 = field655;
            }
        } else if (var1 == 327) {
            arg0.field2613 = 150;
            arg0.field2614 = (int) (Math.sin((double) field668 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2667 = 5;
            arg0.field2606 = 0;
        } else if (var1 == 328) {
            arg0.field2613 = 150;
            arg0.field2614 = (int) (Math.sin((double) field668 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2667 = 5;
            arg0.field2606 = 1;
        }
    }

    @ObfuscatedName("bu.cx(La;ZI)V")
    public static final void method1293(class4 arg0, boolean arg1) {
        int var2 = arg0.field60;
        int var3 = (int) arg0.field2816;
        arg0.method3301();
        if (arg1 && var2 != -1 && Statics.field803[var2]) {
            Statics.field1352.method2931(var2);
            if (Statics.field2607[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2607[var2].length; var5++) {
                    if (Statics.field2607[var2][var5] != null) {
                        if (Statics.field2607[var2][var5].field2575 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2607[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2607[var2] = null;
                }
                Statics.field803[var2] = false;
            }
        }
        method721(var2);
        class158 var6 = class158.method220(var3);
        if (var6 != null) {
            method2272(var6);
        }
        field572 = false;
        field590 = 0;
        method162(Statics.field635, Statics.field1180, Statics.field1497, Statics.field1972);
        if (field607 != -1) {
            method5(field607, 1);
        }
    }

    @ObfuscatedName("l.cw(Lfw;I)Z")
    public static final boolean method88(class158 arg0) {
        int var1 = arg0.field2577;
        if (var1 == 205) {
            field492 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field705.method3116(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field705.method3115(var4, var5 == 1);
        }
        if (var1 == 324) {
            field705.method3137(false);
        }
        if (var1 == 325) {
            field705.method3137(true);
        }
        if (var1 == 326) {
            field485.method2275(211);
            field705.method3117(field485);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("dv.cy(IIII)V")
    public static final void method2174(int arg0, int arg1, int arg2) {
        Statics.method132();
        class89.method1731(arg0, arg1, Statics.field5.field1454 + arg0, Statics.field5.field1452 + arg1);
        if (field709 == 2 || field709 == 5) {
            class89.method1742(arg0 + 25, arg1 + 5, 0, Statics.field757, Statics.field236);
        } else {
            int var3 = field706 + field533 & 0x7FF;
            int var4 = Statics.field714.field399 / 32 + 48;
            int var5 = 464 - Statics.field714.field383 / 32;
            Statics.field1157.method1645(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field522 + 256, Statics.field757, Statics.field236);
            for (int var6 = 0; var6 < field675; var6++) {
                int var7 = field495[var6] * 4 + 2 - Statics.field714.field399 / 32;
                int var8 = field529[var6] * 4 + 2 - Statics.field714.field383 / 32;
                method160(arg0, arg1, var7, var8, field678[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class177 var11 = field639[Statics.field1310][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field714.field399 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field714.field383 / 32;
                        method160(arg0, arg1, var12, var13, Statics.field737[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field483; var14++) {
                class25 var15 = field482[field484[var14]];
                if (var15 != null && var15.method11()) {
                    class31 var16 = var15.field354;
                    if (var16 != null && var16.field773 != null) {
                        var16 = var16.method582();
                    }
                    if (var16 != null && var16.field764 && var16.field776) {
                        int var17 = var15.field399 / 32 - Statics.field714.field399 / 32;
                        int var18 = var15.field383 / 32 - Statics.field714.field383 / 32;
                        method160(arg0, arg1, var17, var18, Statics.field737[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field683; var19++) {
                class3 var20 = field566[field568[var19]];
                if (var20 != null && var20.method11()) {
                    int var21 = var20.field399 / 32 - Statics.field714.field399 / 32;
                    int var22 = var20.field383 / 32 - Statics.field714.field383 / 32;
                    boolean var23 = false;
                    if (Statics.method111(var20.field39)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field714.field27 != 0 && var20.field27 != 0 && Statics.field714.field27 == var20.field27) {
                        var24 = true;
                    }
                    if (var23) {
                        method160(arg0, arg1, var21, var22, Statics.field737[3]);
                    } else if (var24) {
                        method160(arg0, arg1, var21, var22, Statics.field737[4]);
                    } else {
                        method160(arg0, arg1, var21, var22, Statics.field737[2]);
                    }
                }
            }
            if (field462 != 0 && field668 % 20 < 10) {
                if (field462 == 1 && field463 >= 0 && field463 < field482.length) {
                    class25 var25 = field482[field463];
                    if (var25 != null) {
                        int var26 = var25.field399 / 32 - Statics.field714.field399 / 32;
                        int var27 = var25.field383 / 32 - Statics.field714.field383 / 32;
                        method1814(arg0, arg1, var26, var27, Statics.field1279[1]);
                    }
                }
                if (field462 == 2) {
                    int var28 = field465 * 4 - Statics.field497 * 4 + 2 - Statics.field714.field399 / 32;
                    int var29 = field454 * 4 - Statics.field904 * 4 + 2 - Statics.field714.field383 / 32;
                    method1814(arg0, arg1, var28, var29, Statics.field1279[1]);
                }
                if (field462 == 10 && field481 >= 0 && field481 < field566.length) {
                    class3 var30 = field566[field481];
                    if (var30 != null) {
                        int var31 = var30.field399 / 32 - Statics.field714.field399 / 32;
                        int var32 = var30.field383 / 32 - Statics.field714.field383 / 32;
                        method1814(arg0, arg1, var31, var32, Statics.field1279[1]);
                    }
                }
            }
            if (field679 != 0) {
                int var33 = field679 * 4 + 2 - Statics.field714.field399 / 32;
                int var34 = field676 * 4 + 2 - Statics.field714.field383 / 32;
                method160(arg0, arg1, var33, var34, Statics.field1279[0]);
            }
            class89.method1767(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field709 < 3) {
            Statics.field81.method1645(arg0, arg1, 33, 33, 25, 25, field533, 256, Statics.field1649, Statics.field2769);
        } else {
            class89.method1742(arg0, arg1, 0, Statics.field1649, Statics.field2769);
        }
        if (field652[arg2]) {
            Statics.field5.method1721(arg0, arg1);
        }
        field651[arg2] = true;
    }

    @ObfuscatedName("ct.ce(IIIILcm;I)V")
    public static final void method1814(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            method160(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field706 + field533 & 0x7FF;
        int var7 = class104.field1752[var6];
        int var8 = class104.field1731[var6];
        int var9 = var7 * 256 / (field522 + 256);
        int var10 = var8 * 256 / (field522 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field1595.method1692(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("g.cl(IIIILcm;I)V")
    public static final void method160(int arg0, int arg1, int arg2, int arg3, class86 arg4) {
        if (arg4 == null) {
            return;
        }
        int var5 = field706 + field533 & 0x7FF;
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 > 6400) {
            return;
        }
        int var7 = class104.field1752[var5];
        int var8 = class104.field1731[var5];
        int var9 = var7 * 256 / (field522 + 256);
        int var10 = var8 * 256 / (field522 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        if (var6 > 2500) {
            arg4.method1648(Statics.field5, arg0 + 94 + var11 - arg4.field1445 / 2 + 4, arg1 + 83 - var12 - arg4.field1447 / 2 - 4);
        } else {
            arg4.method1635(arg0 + 94 + var11 - arg4.field1445 / 2 + 4, arg1 + 83 - var12 - arg4.field1447 / 2 - 4);
        }
    }

    @ObfuscatedName("ey.ca(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method3033(int arg0, String arg1, String arg2) {
        method536(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("as.dk(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static final void method536(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field633[var4] = field633[var4 - 1];
            field580[var4] = field580[var4 - 1];
            field661[var4] = field661[var4 - 1];
            field660[var4] = field660[var4 - 1];
        }
        field633[0] = arg0;
        field580[0] = arg1;
        field661[0] = arg2;
        field660[0] = arg3;
        field469++;
        field567 = field630;
    }

    @ObfuscatedName("bg.dd(Ljava/lang/String;B)V")
    public static final void method1337(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = Statics.method201(arg0, Statics.field448);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field699; var2++) {
            class23 var3 = field576[var2];
            String var4 = var3.field330;
            String var5 = Statics.method201(var4, Statics.field448);
            if (class136.method1536(arg0, var1, var4, var5)) {
                field699--;
                for (int var6 = var2; var6 < field699; var6++) {
                    field576[var6] = field576[var6 + 1];
                }
                field638 = field630;
                field485.method2275(143);
                class116 var7 = field485;
                int var8 = arg0.length() + 1;
                var7.method2396(var8);
                field485.method2401(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("ah.dv(Ljava/lang/String;I)V")
    public static final void method1157(String arg0) {
        if (Statics.field1434 == null) {
            return;
        }
        field485.method2275(8);
        class116 var1 = field485;
        int var2 = arg0.length() + 1;
        var1.method2396(var2);
        field485.method2401(arg0);
    }

    @ObfuscatedName("dc.dn(I)V")
    public static final void method2349() {
        field485.method2275(179);
        field485.method2396(0);
    }

    @ObfuscatedName("ac.dt(II)V")
    public static void method721(int arg0) {
        for (class171 var1 = (class171) field647.method3248(); var1 != null; var1 = (class171) field647.method3247()) {
            if ((long) arg0 == (var1.field2816 >> 48 & 0xFFFFL)) {
                var1.method3301();
            }
        }
    }

    @ObfuscatedName("ao.di(Lfw;B)I")
    public static int method712(class158 arg0) {
        class171 var1 = (class171) field647.method3259(((long) arg0.field2620 << 32) + (long) arg0.field2601);
        return var1 == null ? arg0.field2684 : var1.field2798;
    }

    @ObfuscatedName("al.dp(Lfw;I)Lfw;")
    public static class158 method576(class158 arg0) {
        int var1 = class162.method2337(method712(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class158.method220(arg0.field2585);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("cd.da(Lfw;B)Z")
    public static boolean method1995(class158 arg0) {
        if (field601) {
            if (method712(arg0) != 0) {
                return false;
            }
            if (arg0.field2575 == 0) {
                return false;
            }
        }
        return arg0.field2683;
    }

    @ObfuscatedName("bk.du(Lfw;IB)Ljava/lang/String;")
    public static String method1499(class158 arg0, int arg1) {
        if (!class162.method3100(method712(arg0), arg1) && arg0.field2660 == null) {
            return null;
        } else if (arg0.field2634 == null || arg0.field2634.length <= arg1 || arg0.field2634[arg1] == null || arg0.field2634[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2634[arg1];
        }
    }
}

package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.Socket;
import netscape.javascript.JSObject;

public final class client extends class72 {

    @ObfuscatedName("client.f")
    public static boolean field466 = true;

    @ObfuscatedName("client.e")
    public static int field467 = 1;

    @ObfuscatedName("client.s")
    public static int field468 = 0;

    @ObfuscatedName("client.w")
    public static class162[] field671 = new class162[4];

    @ObfuscatedName("client.n")
    public static boolean field470 = false;

    @ObfuscatedName("client.b")
    public static boolean field528 = false;

    @ObfuscatedName("client.z")
    public static int field571 = 0;

    @ObfuscatedName("client.h")
    public static int field541 = 1;

    @ObfuscatedName("client.l")
    public static int field474 = 0;

    @ObfuscatedName("client.t")
    public static boolean field475 = true;

    @ObfuscatedName("client.g")
    public static int field516 = 0;

    @ObfuscatedName("client.a")
    public static long field476 = 0L;

    @ObfuscatedName("client.i")
    public static int field523 = 0;

    @ObfuscatedName("client.k")
    public static int field479 = 0;

    @ObfuscatedName("client.o")
    public static int field480 = 0;

    @ObfuscatedName("client.d")
    public static boolean field715 = true;

    @ObfuscatedName("client.u")
    public static boolean field482 = false;

    @ObfuscatedName("client.ap")
    public static int field483 = 0;

    @ObfuscatedName("client.ad")
    public static int field484 = 0;

    @ObfuscatedName("client.ao")
    public static int field509 = 0;

    @ObfuscatedName("client.av")
    public static int field486 = 0;

    @ObfuscatedName("client.af")
    public static int field487 = 0;

    @ObfuscatedName("client.ae")
    public static int field704 = 0;

    @ObfuscatedName("client.ax")
    public static int field489 = 0;

    @ObfuscatedName("client.aw")
    public static int field490 = 0;

    @ObfuscatedName("client.an")
    public static int field491 = 0;

    @ObfuscatedName("client.az")
    public static class125 field492 = new class125(new byte[5000]);

    @ObfuscatedName("client.am")
    public static int field722 = 0;

    @ObfuscatedName("client.ab")
    public static int field633 = 0;

    @ObfuscatedName("client.at")
    public static int field496 = 0;

    @ObfuscatedName("client.br")
    public static int field637 = 0;

    @ObfuscatedName("client.bm")
    public static int field498 = 0;

    @ObfuscatedName("client.bg")
    public static int field499 = 0;

    @ObfuscatedName("client.bb")
    public static int field500 = 0;

    @ObfuscatedName("client.bp")
    public static int field501 = 0;

    @ObfuscatedName("client.by")
    public static class24[] field681 = new class24[32768];

    @ObfuscatedName("client.bn")
    public static int field503 = 0;

    @ObfuscatedName("client.bv")
    public static int[] field696 = new int[32768];

    @ObfuscatedName("client.ci")
    public static class115 field505 = new class115(5000);

    @ObfuscatedName("client.cv")
    public static class115 field724 = new class115(5000);

    @ObfuscatedName("client.cy")
    public static class115 field507 = new class115(5000);

    @ObfuscatedName("client.cr")
    public static int field508 = 0;

    @ObfuscatedName("client.cs")
    public static int field657 = 0;

    @ObfuscatedName("client.cu")
    public static int field510 = 0;

    @ObfuscatedName("client.cq")
    public static int field557 = 0;

    @ObfuscatedName("client.cb")
    public static int field512 = 0;

    @ObfuscatedName("client.cn")
    public static int field513 = 0;

    @ObfuscatedName("client.cp")
    public static int field514 = 0;

    @ObfuscatedName("client.ct")
    public static int field515 = 0;

    @ObfuscatedName("client.ce")
    public static boolean field493 = false;

    @ObfuscatedName("client.co")
    public static int field517 = 0;

    @ObfuscatedName("client.cf")
    public static int field518 = 0;

    @ObfuscatedName("client.cc")
    public static int field611 = 1;

    @ObfuscatedName("client.cz")
    public static int field520 = 0;

    @ObfuscatedName("client.dv")
    public static int field521 = 1;

    @ObfuscatedName("client.dh")
    public static int field584 = 0;

    @ObfuscatedName("client.dn")
    public static boolean field524 = false;

    @ObfuscatedName("client.dd")
    public static int[][][] field525 = new int[4][13][13];

    @ObfuscatedName("client.do")
    public static final int[] field526 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dz")
    public static int field527 = 0;

    @ObfuscatedName("client.dg")
    public static int[][] field604 = new int[104][104];

    @ObfuscatedName("client.dy")
    public static int[][] field529 = new int[104][104];

    @ObfuscatedName("client.dk")
    public static int[] field530 = new int[4000];

    @ObfuscatedName("client.da")
    public static int[] field531 = new int[4000];

    @ObfuscatedName("client.dx")
    public static int field506 = 0;

    @ObfuscatedName("client.dl")
    public static int field700 = 2;

    @ObfuscatedName("client.dm")
    public static int field686 = 0;

    @ObfuscatedName("client.ds")
    public static int field535 = 2;

    @ObfuscatedName("client.dp")
    public static int field536 = 0;

    @ObfuscatedName("client.du")
    public static int field537 = 1;

    @ObfuscatedName("client.dq")
    public static int field546 = 0;

    @ObfuscatedName("client.ek")
    public static int field477 = 0;

    @ObfuscatedName("client.ee")
    public static int field540 = 2;

    @ObfuscatedName("client.ea")
    public static int field661 = 0;

    @ObfuscatedName("client.eo")
    public static int field577 = 1;

    @ObfuscatedName("client.en")
    public static int field543 = 0;

    @ObfuscatedName("client.eg")
    public static int field544 = 0;

    @ObfuscatedName("client.ef")
    public static int field545 = 2301979;

    @ObfuscatedName("client.ej")
    public static int field648 = 5063219;

    @ObfuscatedName("client.fu")
    public static int field547 = 3353893;

    @ObfuscatedName("client.fq")
    public static int field548 = 7759444;

    @ObfuscatedName("client.fd")
    public static boolean field549 = false;

    @ObfuscatedName("client.fw")
    public static int field606 = 0;

    @ObfuscatedName("client.ff")
    public static int field551 = 128;

    @ObfuscatedName("client.fc")
    public static int field552 = 0;

    @ObfuscatedName("client.fr")
    public static int field553 = 0;

    @ObfuscatedName("client.fp")
    public static int field688 = 0;

    @ObfuscatedName("client.fa")
    public static int field629 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field556 = false;

    @ObfuscatedName("client.ft")
    public static int field504 = 0;

    @ObfuscatedName("client.fn")
    public static int field558 = 0;

    @ObfuscatedName("client.fg")
    public static int field559 = 50;

    @ObfuscatedName("client.fk")
    public static int[] field560 = new int[field559];

    @ObfuscatedName("client.fs")
    public static int[] field561 = new int[field559];

    @ObfuscatedName("client.fl")
    public static int[] field497 = new int[field559];

    @ObfuscatedName("client.fh")
    public static int[] field464 = new int[field559];

    @ObfuscatedName("client.fx")
    public static int[] field564 = new int[field559];

    @ObfuscatedName("client.fm")
    public static int[] field473 = new int[field559];

    @ObfuscatedName("client.gh")
    public static int[] field574 = new int[field559];

    @ObfuscatedName("client.gn")
    public static String[] field567 = new String[field559];

    @ObfuscatedName("client.gs")
    public static int[][] field568 = new int[104][104];

    @ObfuscatedName("client.gv")
    public static int field683 = 0;

    @ObfuscatedName("client.gb")
    public static int field570 = -1;

    @ObfuscatedName("client.gk")
    public static int field655 = -1;

    @ObfuscatedName("client.ga")
    public static int field572 = 0;

    @ObfuscatedName("client.gj")
    public static int field519 = 0;

    @ObfuscatedName("client.gi")
    public static int field511 = 0;

    @ObfuscatedName("client.gl")
    public static int field563 = 0;

    @ObfuscatedName("client.gp")
    public static int field626 = 0;

    @ObfuscatedName("client.gu")
    public static int field653 = 0;

    @ObfuscatedName("client.gx")
    public static int field578 = 0;

    @ObfuscatedName("client.gz")
    public static int field555 = 0;

    @ObfuscatedName("client.gt")
    public static int field580 = 0;

    @ObfuscatedName("client.gd")
    public static int field573 = 0;

    @ObfuscatedName("client.gr")
    public static boolean field582 = false;

    @ObfuscatedName("client.gy")
    public static int field583 = 0;

    @ObfuscatedName("client.gc")
    public static int field478 = 0;

    @ObfuscatedName("client.ge")
    public static class3[] field562 = new class3[2048];

    @ObfuscatedName("client.gm")
    public static int field677 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field587 = new int[2048];

    @ObfuscatedName("client.hs")
    public static int field588 = 0;

    @ObfuscatedName("client.hm")
    public static int[] field703 = new int[2048];

    @ObfuscatedName("client.hu")
    public static class125[] field565 = new class125[2048];

    @ObfuscatedName("client.hc")
    public static int field481 = -1;

    @ObfuscatedName("client.hh")
    public static int field592 = 0;

    @ObfuscatedName("client.hi")
    public static int field593 = 0;

    @ObfuscatedName("client.hp")
    public static int[] field594 = new int[1000];

    @ObfuscatedName("client.hn")
    public static final int[] field595 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hf")
    public static String[] field719 = new String[8];

    @ObfuscatedName("client.hx")
    public static boolean[] field597 = new boolean[8];

    @ObfuscatedName("client.hj")
    public static int[] field603 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hg")
    public static class175[][][] field599 = new class175[4][104][104];

    @ObfuscatedName("client.hz")
    public static class175 field591 = new class175();

    @ObfuscatedName("client.he")
    public static class175 field601 = new class175();

    @ObfuscatedName("client.ha")
    public static class175 field602 = new class175();

    @ObfuscatedName("client.hr")
    public static int[] field621 = new int[25];

    @ObfuscatedName("client.hk")
    public static int[] field666 = new int[25];

    @ObfuscatedName("client.hb")
    public static int[] field605 = new int[25];

    @ObfuscatedName("client.hl")
    public static int field471 = 0;

    @ObfuscatedName("client.hw")
    public static boolean field607 = false;

    @ObfuscatedName("client.ie")
    public static int field608 = 0;

    @ObfuscatedName("client.iu")
    public static int[] field609 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field610 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field576 = new int[500];

    @ObfuscatedName("client.il")
    public static int[] field612 = new int[500];

    @ObfuscatedName("client.im")
    public static String[] field613 = new String[500];

    @ObfuscatedName("client.ir")
    public static String[] field614 = new String[500];

    @ObfuscatedName("client.id")
    public static int field615 = -1;

    @ObfuscatedName("client.ii")
    public static int field691 = -1;

    @ObfuscatedName("client.ia")
    public static int field617 = 0;

    @ObfuscatedName("client.iy")
    public static int field618 = 50;

    @ObfuscatedName("client.ic")
    public static int field642 = 0;

    @ObfuscatedName("client.it")
    public static String field643 = null;

    @ObfuscatedName("client.is")
    public static boolean field660 = false;

    @ObfuscatedName("client.iv")
    public static int field623 = -1;

    @ObfuscatedName("client.ik")
    public static String field624 = null;

    @ObfuscatedName("client.jm")
    public static String field625 = null;

    @ObfuscatedName("client.jx")
    public static int field485 = -1;

    @ObfuscatedName("client.jp")
    public static class173 field627 = new class173(8);

    @ObfuscatedName("client.ju")
    public static int field628 = 0;

    @ObfuscatedName("client.jh")
    public static int field600 = 0;

    @ObfuscatedName("client.jv")
    public static class156 field630 = null;

    @ObfuscatedName("client.jy")
    public static int field631 = 0;

    @ObfuscatedName("client.ji")
    public static int field632 = 0;

    @ObfuscatedName("client.je")
    public static int field569 = 0;

    @ObfuscatedName("client.jq")
    public static boolean field586 = false;

    @ObfuscatedName("client.jw")
    public static boolean field635 = false;

    @ObfuscatedName("client.jn")
    public static boolean field636 = false;

    @ObfuscatedName("client.jg")
    public static class156 field598 = null;

    @ObfuscatedName("client.js")
    public static class156 field638 = null;

    @ObfuscatedName("client.jt")
    public static int field639 = 0;

    @ObfuscatedName("client.jl")
    public static int field640 = 0;

    @ObfuscatedName("client.jd")
    public static class156 field641 = null;

    @ObfuscatedName("client.jo")
    public static boolean field502 = false;

    @ObfuscatedName("client.ja")
    public static int field554 = -1;

    @ObfuscatedName("client.jz")
    public static int field644 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field645 = false;

    @ObfuscatedName("client.jb")
    public static int field646 = -1;

    @ObfuscatedName("client.jc")
    public static int field647 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field676 = false;

    @ObfuscatedName("client.kq")
    public static int field649 = 1;

    @ObfuscatedName("client.ku")
    public static int[] field650 = new int[32];

    @ObfuscatedName("client.kw")
    public static int field651 = 0;

    @ObfuscatedName("client.ko")
    public static int[] field652 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field705 = 0;

    @ObfuscatedName("client.kl")
    public static int[] field654 = new int[32];

    @ObfuscatedName("client.kt")
    public static int field472 = 0;

    @ObfuscatedName("client.kn")
    public static int field656 = 0;

    @ObfuscatedName("client.kv")
    public static int field622 = 0;

    @ObfuscatedName("client.kb")
    public static int field658 = 0;

    @ObfuscatedName("client.kk")
    public static int field659 = 0;

    @ObfuscatedName("client.kf")
    public static int[] field585 = new int[2000];

    @ObfuscatedName("client.ky")
    public static String[] field534 = new String[1000];

    @ObfuscatedName("client.kd")
    public static int field662 = 0;

    @ObfuscatedName("client.kp")
    public static class175 field663 = new class175();

    @ObfuscatedName("client.ki")
    public static class175 field664 = new class175();

    @ObfuscatedName("client.kc")
    public static class175 field665 = new class175();

    @ObfuscatedName("client.kx")
    public static class173 field566 = new class173(512);

    @ObfuscatedName("client.ks")
    public static int field667 = 0;

    @ObfuscatedName("client.kh")
    public static int field668 = -2;

    @ObfuscatedName("client.lt")
    public static boolean[] field634 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field670 = new boolean[100];

    @ObfuscatedName("client.lv")
    public static boolean[] field522 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field672 = new int[100];

    @ObfuscatedName("client.lg")
    public static int[] field673 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field674 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field675 = new int[100];

    @ObfuscatedName("client.lu")
    public static int field710 = 0;

    @ObfuscatedName("client.lx")
    public static int[] field723 = new int[100];

    @ObfuscatedName("client.lh")
    public static String[] field678 = new String[100];

    @ObfuscatedName("client.lw")
    public static String[] field679 = new String[100];

    @ObfuscatedName("client.lb")
    public static String[] field680 = new String[100];

    @ObfuscatedName("client.ly")
    public static int field495 = 0;

    @ObfuscatedName("client.lm")
    public static int[] field682 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.le")
    public static int field532 = 0;

    @ObfuscatedName("client.li")
    public static int field684 = 0;

    @ObfuscatedName("client.ls")
    public static long[] field619 = new long[100];

    @ObfuscatedName("client.ln")
    public static int field533 = 0;

    @ObfuscatedName("client.lk")
    public static int field687 = 0;

    @ObfuscatedName("client.ll")
    public static int[] field590 = new int[128];

    @ObfuscatedName("client.lz")
    public static int[] field689 = new int[128];

    @ObfuscatedName("client.lc")
    public static String field690 = null;

    @ObfuscatedName("client.mq")
    public static String field616 = null;

    @ObfuscatedName("client.mc")
    public static int field692 = -1;

    @ObfuscatedName("client.mk")
    public static int field488 = 0;

    @ObfuscatedName("client.mb")
    public static int[] field694 = new int[1000];

    @ObfuscatedName("client.ma")
    public static int[] field579 = new int[1000];

    @ObfuscatedName("client.mn")
    public static class85[] field542 = new class85[1000];

    @ObfuscatedName("client.mh")
    public static int field693 = 0;

    @ObfuscatedName("client.mt")
    public static int field698 = 0;

    @ObfuscatedName("client.mi")
    public static int field699 = 0;

    @ObfuscatedName("client.mz")
    public static int field538 = 255;

    @ObfuscatedName("client.mj")
    public static int field701 = -1;

    @ObfuscatedName("client.mm")
    public static boolean field702 = false;

    @ObfuscatedName("client.mg")
    public static int field596 = 127;

    @ObfuscatedName("client.mr")
    public static int field469 = 127;

    @ObfuscatedName("client.nr")
    public static int field695 = 0;

    @ObfuscatedName("client.no")
    public static int[] field706 = new int[50];

    @ObfuscatedName("client.nh")
    public static int[] field707 = new int[50];

    @ObfuscatedName("client.ny")
    public static int[] field708 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field575 = new int[50];

    @ObfuscatedName("client.nz")
    public static class56[] field539 = new class56[50];

    @ObfuscatedName("client.nd")
    public static boolean field711 = false;

    @ObfuscatedName("client.nu")
    public static boolean[] field712 = new boolean[5];

    @ObfuscatedName("client.ng")
    public static int[] field713 = new int[5];

    @ObfuscatedName("client.nq")
    public static int[] field714 = new int[5];

    @ObfuscatedName("client.nt")
    public static int[] field589 = new int[5];

    @ObfuscatedName("client.oi")
    public static int[] field716 = new int[5];

    @ObfuscatedName("client.om")
    public static int field717 = 0;

    @ObfuscatedName("client.os")
    public static int field718 = 0;

    @ObfuscatedName("client.og")
    public static class22[] field685 = new class22[200];

    @ObfuscatedName("client.oj")
    public static class171 field720 = new class171();

    @ObfuscatedName("client.op")
    public static int field721 = 0;

    @ObfuscatedName("client.oq")
    public static class11[] field669 = new class11[100];

    @ObfuscatedName("client.ok")
    public static class161 field550 = new class161();

    @ObfuscatedName("client.oy")
    public static int field709 = -1;

    @ObfuscatedName("client.ov")
    public static int field725 = -1;

    @ObfuscatedName("client.f(I)V")
    public final void method249() {
    }

    public final void init() {
        if (!this.method1385()) {
            return;
        }
        class165[] var1 = class165.method720();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class165 var3 = var1[var2];
            String var4 = this.getParameter(var3.field2725);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field2725)) {
                    case 1:
                        class132[] var11 = class132.method28();
                        int var12 = Integer.parseInt(var4);
                        class132[] var13 = var11;
                        int var14 = 0;
                        class132 var16;
                        while (true) {
                            if (var14 >= var13.length) {
                                var16 = null;
                                break;
                            }
                            class132 var15 = var13[var14];
                            if (var12 == var15.method2231()) {
                                var16 = var15;
                                break;
                            }
                            var14++;
                        }
                        Statics.field581 = (class132) var16;
                        if (Statics.field581 == class132.field2049) {
                            Statics.field1255 = class184.field2807;
                        } else {
                            Statics.field1255 = class184.field2806;
                        }
                        break;
                    case 2:
                        field571 = Integer.parseInt(var4);
                        break;
                    case 3:
                        int var5 = Integer.parseInt(var4);
                        class131[] var6 = new class131[] { class131.field2032, class131.field2034, class131.field2043, class131.field2042 };
                        class131[] var7 = var6;
                        int var8 = 0;
                        class131 var10;
                        while (true) {
                            if (var8 >= var7.length) {
                                var10 = null;
                                break;
                            }
                            class131 var9 = var7[var8];
                            if (var9.field2037 == var5) {
                                var10 = var9;
                                break;
                            }
                            var8++;
                        }
                        Statics.field741 = var10;
                        break;
                    case 4:
                        if (var4.equalsIgnoreCase(class2.field31)) {
                            field541 = 1;
                        } else {
                            field541 = 0;
                        }
                        break;
                    case 5:
                        if (var4.equalsIgnoreCase(class2.field31)) {
                            field470 = true;
                        } else {
                            field470 = false;
                        }
                        break;
                    case 6:
                        Statics.field1413 = var4;
                        break;
                    case 7:
                        field467 = Integer.parseInt(var4);
                        break;
                    case 8:
                        field468 = Integer.parseInt(var4);
                }
            }
        }
        class94.field1551 = false;
        field528 = false;
        Statics.field204 = this.getCodeBase().getHost();
        String var17 = Statics.field741.field2036;
        byte var18 = 0;
        try {
            Statics.field1397 = 16;
            Statics.field2027 = var18;
            try {
                Statics.field379 = System.getProperty("os.name");
            } catch (Exception var62) {
                Statics.field379 = "Unknown";
            }
            Statics.field913 = Statics.field379.toLowerCase();
            try {
                Statics.field117 = System.getProperty("user.home");
                if (Statics.field117 != null) {
                    Statics.field117 = Statics.field117 + "/";
                }
            } catch (Exception var61) {
            }
            try {
                if (Statics.field913.startsWith("win")) {
                    if (Statics.field117 == null) {
                        Statics.field117 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field117 == null) {
                    Statics.field117 = System.getenv("HOME");
                }
                if (Statics.field117 != null) {
                    Statics.field117 = Statics.field117 + "/";
                }
            } catch (Exception var60) {
            }
            if (Statics.field117 == null) {
                Statics.field117 = "~/";
            }
            Statics.field99 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field117, "/tmp/", "" };
            Statics.field378 = new String[] { ".jagex_cache_" + Statics.field2027, ".file_store_" + Statics.field2027 };
            int var22 = 0;
            label259: while (var22 < 4) {
                String var23 = var22 == 0 ? "" : "" + var22;
                Statics.field2296 = new File(Statics.field117, "jagex_cl_oldschool_" + var17 + var23 + ".dat");
                String var24 = null;
                String var25 = null;
                boolean var26 = false;
                if (Statics.field2296.exists()) {
                    try {
                        class28 var27 = new class28(Statics.field2296, "rw", 10000L);
                        class125 var28 = new class125((int) var27.method512());
                        while (var28.field2003 < var28.field2002.length) {
                            int var29 = var27.method517(var28.field2002, var28.field2003, var28.field2002.length - var28.field2003);
                            if (var29 == -1) {
                                throw new IOException();
                            }
                            var28.field2003 += var29;
                        }
                        var28.field2003 = 0;
                        int var30 = var28.method2326();
                        if (var30 < 1 || var30 > 3) {
                            throw new IOException("" + var30);
                        }
                        int var31 = 0;
                        if (var30 > 1) {
                            var31 = var28.method2326();
                        }
                        if (var30 <= 2) {
                            var24 = var28.method2405();
                            if (var31 == 1) {
                                var25 = var28.method2405();
                            }
                        } else {
                            var24 = var28.method2388();
                            if (var31 == 1) {
                                var25 = var28.method2388();
                            }
                        }
                        var27.method510();
                    } catch (IOException var64) {
                        var64.printStackTrace();
                    }
                    if (var24 != null) {
                        File var33 = new File(var24);
                        if (!var33.exists()) {
                            var24 = null;
                        }
                    }
                    if (var24 != null) {
                        File var34 = new File(var24, "test.dat");
                        if (!class81.method117(var34, true)) {
                            var24 = null;
                        }
                    }
                }
                if (var24 == null && var22 == 0) {
                    label234: for (int var35 = 0; var35 < Statics.field378.length; var35++) {
                        for (int var36 = 0; var36 < Statics.field99.length; var36++) {
                            File var37 = new File(Statics.field99[var36] + Statics.field378[var35] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var37.exists() && class81.method117(new File(var37, "test.dat"), true)) {
                                var24 = var37.toString();
                                var26 = true;
                                break label234;
                            }
                        }
                    }
                }
                if (var24 == null) {
                    var24 = Statics.field117 + File.separatorChar + "jagexcache" + var23 + File.separatorChar + "oldschool" + File.separatorChar + var17 + File.separatorChar;
                    var26 = true;
                }
                if (var25 != null) {
                    File var38 = new File(var25);
                    File var39 = new File(var24);
                    try {
                        File[] var40 = var38.listFiles();
                        File[] var41 = var40;
                        for (int var42 = 0; var42 < var41.length; var42++) {
                            File var43 = var41[var42];
                            File var44 = new File(var39, var43.getName());
                            boolean var45 = var43.renameTo(var44);
                            if (!var45) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var63) {
                        var63.printStackTrace();
                    }
                    var26 = true;
                }
                if (var26) {
                    File var47 = new File(var24);
                    Object var48 = null;
                    try {
                        class28 var49 = new class28(Statics.field2296, "rw", 10000L);
                        class125 var50 = new class125(500);
                        var50.method2339(3);
                        var50.method2339(var48 == null ? 0 : 1);
                        var50.method2319(var47.getPath());
                        if (var48 != null) {
                            var50.method2319(((File) var48).getPath());
                        }
                        var49.method511(var50.field2002, 0, var50.field2003);
                        var49.method510();
                    } catch (IOException var59) {
                        var59.printStackTrace();
                    }
                }
                File var52 = new File(var24);
                Statics.field2009 = var52;
                if (!Statics.field2009.exists()) {
                    Statics.field2009.mkdirs();
                }
                File[] var53 = Statics.field2009.listFiles();
                if (var53 == null) {
                    break;
                }
                File[] var54 = var53;
                int var55 = 0;
                while (true) {
                    if (var55 >= var54.length) {
                        break label259;
                    }
                    File var56 = var54[var55];
                    if (!class81.method117(var56, false)) {
                        var22++;
                        break;
                    }
                    var55++;
                }
            }
            class71.method55(Statics.field2009);
            class81.method2566();
            class81.field1400 = new class29(new class28(class71.method231("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class81.field1403 = new class29(new class28(class71.method231("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field955 = new class29[Statics.field1397];
            for (int var57 = 0; var57 < Statics.field1397; var57++) {
                Statics.field955[var57] = new class29(new class28(class71.method231("main_file_cache.idx" + var57), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var65) {
            class79.method848((String) null, var65);
        }
        Statics.field465 = this;
        this.method1371(765, 503, 6);
    }

    @ObfuscatedName("client.x(B)V")
    public final void method251() {
        Statics.field98 = field468 == 0 ? 43594 : field467 + 40000;
        Statics.field914 = field468 == 0 ? 443 : field467 + 50000;
        Statics.field2297 = Statics.field98;
        Statics.field2664 = class159.field2655;
        Statics.field2667 = class159.field2660;
        Statics.field2672 = class159.field2659;
        Statics.field2673 = class159.field2657;
        class74.method2973();
        class74.method654(Statics.field67);
        class76.method2812(Statics.field67);
        class77 var1;
        try {
            var1 = new class77();
        } catch (Throwable var3) {
            var1 = null;
        }
        Statics.field1786 = var1;
        if (Statics.field1786 != null) {
            Statics.field1786.method1309(Statics.field67);
        }
        Statics.field1273 = new class70(255, class81.field1400, class81.field1403, 500000);
        if (field468 != 0) {
            field482 = true;
        }
    }

    @ObfuscatedName("client.e(B)V")
    public final void method301() {
        field516++;
        this.method463();
        while (true) {
            class175 var1 = class155.field2518;
            class154 var2;
            synchronized (class155.field2518) {
                var2 = (class154) class155.field2514.method3150();
            }
            if (var2 == null) {
                try {
                    if (class137.field2312 == 1) {
                        int var4 = Statics.field2012.method2605();
                        if (var4 > 0 && Statics.field2012.method2611()) {
                            int var5 = var4 - Statics.field1242;
                            if (var5 < 0) {
                                var5 = 0;
                            }
                            Statics.field2012.method2629(var5);
                        } else {
                            Statics.field2012.method2610();
                            Statics.field2012.method2666();
                            if (Statics.field2318 == null) {
                                class137.field2312 = 0;
                            } else {
                                class137.field2312 = 2;
                            }
                            Statics.field2313 = null;
                            Statics.field364 = null;
                        }
                    }
                } catch (Exception var9) {
                    var9.printStackTrace();
                    Statics.field2012.method2610();
                    class137.field2312 = 0;
                    Statics.field2313 = null;
                    Statics.field364 = null;
                    Statics.field2318 = null;
                }
                method1346();
                class74.method1232();
                class76.method2();
                if (Statics.field1786 != null) {
                    int var7 = Statics.field1786.method1311();
                    field662 = var7;
                }
                if (field474 == 0) {
                    method2248();
                    class72.method2113();
                } else if (field474 == 5) {
                    class20.method770(this);
                    method2248();
                    class72.method2113();
                } else if (field474 == 10) {
                    class20.method770(this);
                } else if (field474 == 20) {
                    class20.method770(this);
                    method115();
                } else if (field474 == 25) {
                    method1360();
                }
                if (field474 == 30) {
                    method217();
                } else if (field474 == 40) {
                    method115();
                }
                return;
            }
            var2.field2509.method2907(var2.field2508, (int) var2.field2759, var2.field2507, false);
        }
    }

    @ObfuscatedName("client.m(I)V")
    public final void method253() {
        boolean var1;
        label150: {
            try {
                if (class137.field2312 == 2) {
                    if (Statics.field2313 == null) {
                        Statics.field2313 = class138.method2595(Statics.field2318, Statics.field2426, Statics.field253);
                        if (Statics.field2313 == null) {
                            var1 = false;
                            break label150;
                        }
                    }
                    if (Statics.field364 == null) {
                        Statics.field364 = new class57(Statics.field2311, Statics.field2310);
                    }
                    if (Statics.field2012.method2630(Statics.field2313, Statics.field2314, Statics.field364, 22050)) {
                        Statics.field2012.method2607();
                        Statics.field2012.method2629(Statics.field2320);
                        Statics.field2012.method2609(Statics.field2313, Statics.field2315);
                        class137.field2312 = 0;
                        Statics.field2313 = null;
                        Statics.field364 = null;
                        Statics.field2318 = null;
                        var1 = true;
                        break label150;
                    }
                }
            } catch (Exception var26) {
                var26.printStackTrace();
                Statics.field2012.method2610();
                class137.field2312 = 0;
                Statics.field2313 = null;
                Statics.field364 = null;
                Statics.field2318 = null;
            }
            var1 = false;
        }
        if (var1 && field702 && Statics.field1246 != null) {
            Statics.field1246.method1107();
        }
        if (field1298) {
            class74.method503(Statics.field67);
            Canvas var4 = Statics.field67;
            var4.removeMouseListener(class76.field1375);
            var4.removeMouseMotionListener(class76.field1375);
            var4.removeFocusListener(class76.field1375);
            class76.field1361 = 0;
            if (Statics.field1786 != null) {
                Statics.field1786.method1308(Statics.field67);
            }
            this.method1382();
            class74.method654(Statics.field67);
            class76.method2812(Statics.field67);
            if (Statics.field1786 != null) {
                Statics.field1786.method1309(Statics.field67);
            }
        }
        if (field474 == 0) {
            int var5 = class20.field334;
            String var6 = class20.field305;
            Color var7 = null;
            try {
                Graphics var8 = Statics.field67.getGraphics();
                if (Statics.field124 == null) {
                    Statics.field124 = new Font("Helvetica", 1, 13);
                    Statics.field1304 = Statics.field67.getFontMetrics(Statics.field124);
                }
                if (field1305) {
                    field1305 = false;
                    var8.setColor(Color.black);
                    var8.fillRect(0, 0, Statics.field1405, Statics.field1323);
                }
                if (var7 == null) {
                    var7 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field1971 == null) {
                        Statics.field1971 = Statics.field67.createImage(304, 34);
                    }
                    Graphics var9 = Statics.field1971.getGraphics();
                    var9.setColor(var7);
                    var9.drawRect(0, 0, 303, 33);
                    var9.fillRect(2, 2, var5 * 3, 30);
                    var9.setColor(Color.black);
                    var9.drawRect(1, 1, 301, 31);
                    var9.fillRect(var5 * 3 + 2, 2, 300 - var5 * 3, 30);
                    var9.setFont(Statics.field124);
                    var9.setColor(Color.white);
                    var9.drawString(var6, (304 - Statics.field1304.stringWidth(var6)) / 2, 22);
                    var8.drawImage(Statics.field1971, Statics.field1405 / 2 - 152, Statics.field1323 / 2 - 18, (ImageObserver) null);
                } catch (Exception var22) {
                    int var11 = Statics.field1405 / 2 - 152;
                    int var12 = Statics.field1323 / 2 - 18;
                    var8.setColor(var7);
                    var8.drawRect(var11, var12, 303, 33);
                    var8.fillRect(var11 + 2, var12 + 2, var5 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(var11 + 1, var12 + 1, 301, 31);
                    var8.fillRect(var5 * 3 + var11 + 2, var12 + 2, 300 - var5 * 3, 30);
                    var8.setFont(Statics.field124);
                    var8.setColor(Color.white);
                    var8.drawString(var6, var11 + (304 - Statics.field1304.stringWidth(var6)) / 2, var12 + 22);
                }
            } catch (Exception var23) {
                Statics.field67.repaint();
            }
        } else if (field474 == 5) {
            class20.method1140(Statics.field1264, Statics.field849);
        } else if (field474 == 10) {
            class20.method1140(Statics.field1264, Statics.field849);
        } else if (field474 == 20) {
            class20.method1140(Statics.field1264, Statics.field849);
        } else if (field474 == 25) {
            if (field584 == 1) {
                if (field518 > field611) {
                    field611 = field518;
                }
                int var14 = (field611 * 50 - field518 * 50) / field611;
                method8(class133.field2143 + class2.field22 + class2.field23 + var14 + "%" + class2.field20, false);
            } else if (field584 == 2) {
                if (field520 > field521) {
                    field521 = field520;
                }
                int var15 = (field521 * 50 - field520 * 50) / field521 + 50;
                method8(class133.field2143 + class2.field22 + class2.field23 + var15 + "%" + class2.field20, false);
            } else {
                method8(class133.field2143, false);
            }
        } else if (field474 == 30) {
            method2927();
        } else if (field474 == 40) {
            method8(class133.field2063 + class2.field22 + class133.field2211, false);
        }
        if (field474 == 30 && field710 == 0 && !field1305) {
            try {
                Graphics var16 = Statics.field67.getGraphics();
                for (int var17 = 0; var17 < field667; var17++) {
                    if (field670[var17]) {
                        Statics.field1277.method1525(var16, field672[var17], field673[var17], field674[var17], field675[var17]);
                        field670[var17] = false;
                    }
                }
            } catch (Exception var25) {
                Statics.field67.repaint();
            }
        } else if (field474 > 0) {
            try {
                Graphics var19 = Statics.field67.getGraphics();
                Statics.field1277.method1551(var19, 0, 0);
                field1305 = false;
                for (int var20 = 0; var20 < field667; var20++) {
                    field670[var20] = false;
                }
            } catch (Exception var24) {
                Statics.field67.repaint();
            }
        }
    }

    @ObfuscatedName("client.s(B)V")
    public final void method314() {
        if (Statics.field2383 != null) {
            Statics.field2383.field251 = false;
        }
        Statics.field2383 = null;
        if (Statics.field82 != null) {
            Statics.field82.method1340();
            Statics.field82 = null;
        }
        class74.method1();
        if (class76.field1375 != null) {
            class76 var1 = class76.field1375;
            synchronized (class76.field1375) {
                class76.field1375 = null;
            }
        }
        Statics.field1786 = null;
        if (Statics.field1246 != null) {
            Statics.field1246.method1108();
        }
        if (Statics.field184 != null) {
            Statics.field184.method1108();
        }
        class151.method2902();
        class155.method102();
        try {
            class81.field1400.method530();
            for (int var3 = 0; var3 < Statics.field1397; var3++) {
                Statics.field955[var3].method530();
            }
            class81.field1403.method530();
            class81.field1399.method530();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("b.p(II)V")
    public static void method119(int arg0) {
        if (field474 == arg0) {
            return;
        }
        if (field474 == 0) {
            Statics.field1971 = null;
            Statics.field124 = null;
            Statics.field1304 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            field498 = 0;
            field499 = 0;
            field500 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field402 != null) {
            Statics.field402.method1340();
            Statics.field402 = null;
        }
        if (field474 == 25) {
            field584 = 0;
            field518 = 0;
            field611 = 1;
            field520 = 0;
            field521 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class20.method661(Statics.field67, Statics.field2006, Statics.field2505);
        } else if (Statics.field316) {
            Statics.field300 = null;
            Statics.field318 = null;
            Statics.field313 = null;
            Statics.field301 = null;
            Statics.field2439 = null;
            Statics.field1901 = null;
            Statics.field1497 = null;
            Statics.field65 = null;
            Statics.field203 = null;
            Statics.field1953 = null;
            Statics.field2005 = null;
            Statics.field220 = null;
            Statics.field1651 = null;
            Statics.field306 = null;
            Statics.field335 = null;
            Statics.field2712 = null;
            Statics.field927 = null;
            Statics.field310 = null;
            Statics.field2035 = null;
            Statics.field238 = null;
            class137.field2312 = 1;
            Statics.field2318 = null;
            Statics.field2426 = -1;
            Statics.field253 = -1;
            Statics.field2320 = 0;
            Statics.field2315 = false;
            Statics.field1242 = 2;
            class151.method1274(true);
            Statics.field316 = false;
        }
        field474 = arg0;
    }

    @ObfuscatedName("client.w(B)V")
    public void method463() {
        if (field474 == 1000) {
            return;
        }
        long var1 = class120.method774();
        int var3 = (int) (var1 - Statics.field259);
        Statics.field259 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class151.field2477 += var3;
        boolean var4;
        if (class151.field2476 == 0 && class151.field2479 == 0 && class151.field2473 == 0 && class151.field2471 == 0) {
            var4 = true;
        } else if (Statics.field2484 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class151.field2477 > 30000) {
                        throw new IOException();
                    }
                    while (class151.field2479 < 20 && class151.field2471 > 0) {
                        class153 var5 = (class153) class151.field2470.method3141();
                        class125 var6 = new class125(4);
                        var6.method2339(1);
                        var6.method2332((int) var5.field2759);
                        Statics.field2484.method1328(var6.field2002, 0, 4);
                        class151.field2478.method3137(var5, var5.field2759);
                        class151.field2471--;
                        class151.field2479++;
                    }
                    while (class151.field2476 < 20 && class151.field2473 > 0) {
                        class153 var7 = (class153) class151.field2474.method3105();
                        class125 var8 = new class125(4);
                        var8.method2339(0);
                        var8.method2332((int) var7.field2759);
                        Statics.field2484.method1328(var8.field2002, 0, 4);
                        var7.method3127();
                        class151.field2469.method3137(var7, var7.field2759);
                        class151.field2473--;
                        class151.field2476++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2484.method1326();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class151.field2477 = 0;
                        byte var11 = 0;
                        if (Statics.field1778 == null) {
                            var11 = 8;
                        } else if (class151.field2481 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class151.field2480.field2003;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2484.method1329(class151.field2480.field2002, class151.field2480.field2003, var12);
                            if (class151.field2485 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class151.field2480.field2002[class151.field2480.field2003 + var13] ^= class151.field2485;
                                }
                            }
                            class151.field2480.field2003 += var12;
                            if (class151.field2480.field2003 < var11) {
                                break;
                            }
                            if (Statics.field1778 == null) {
                                class151.field2480.field2003 = 0;
                                int var14 = class151.field2480.method2326();
                                int var15 = class151.field2480.method2328();
                                int var16 = class151.field2480.method2326();
                                int var17 = class151.field2480.method2489();
                                long var18 = (long) ((var14 << 16) + var15);
                                class153 var20 = (class153) class151.field2478.method3129(var18);
                                Statics.field2468 = true;
                                if (var20 == null) {
                                    var20 = (class153) class151.field2469.method3129(var18);
                                    Statics.field2468 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field1778 = var20;
                                Statics.field733 = new class125(var17 + var21 + Statics.field1778.field2500);
                                Statics.field733.method2339(var16);
                                Statics.field733.method2316(var17);
                                class151.field2481 = 8;
                                class151.field2480.field2003 = 0;
                            } else if (class151.field2481 == 0) {
                                if (class151.field2480.field2002[0] == -1) {
                                    class151.field2481 = 1;
                                    class151.field2480.field2003 = 0;
                                } else {
                                    Statics.field1778 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field733.field2002.length - Statics.field1778.field2500;
                            int var23 = 512 - class151.field2481;
                            if (var23 > var22 - Statics.field733.field2003) {
                                var23 = var22 - Statics.field733.field2003;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2484.method1329(Statics.field733.field2002, Statics.field733.field2003, var23);
                            if (class151.field2485 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field733.field2002[Statics.field733.field2003 + var24] ^= class151.field2485;
                                }
                            }
                            Statics.field733.field2003 += var23;
                            class151.field2481 += var23;
                            if (Statics.field733.field2003 == var22) {
                                if (Statics.field1778.field2759 == 16711935L) {
                                    Statics.field97 = Statics.field733;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class152 var26 = class151.field2472[var25];
                                        if (var26 != null) {
                                            Statics.field97.field2003 = var25 * 8 + 5;
                                            int var27 = Statics.field97.method2489();
                                            int var28 = Statics.field97.method2489();
                                            var26.method2905(var27, var28);
                                        }
                                    }
                                } else {
                                    class151.field2483.reset();
                                    class151.field2483.update(Statics.field733.field2002, 0, var22);
                                    int var29 = (int) class151.field2483.getValue();
                                    if (Statics.field1778.field2502 != var29) {
                                        try {
                                            Statics.field2484.method1340();
                                        } catch (Exception var35) {
                                        }
                                        class151.field2486++;
                                        Statics.field2484 = null;
                                        class151.field2485 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class151.field2486 = 0;
                                    class151.field2487 = 0;
                                    Statics.field1778.field2501.method2906((int) (Statics.field1778.field2759 & 0xFFFFL), Statics.field733.field2002, (Statics.field1778.field2759 & 0xFF0000L) == 16711680L, Statics.field2468);
                                }
                                Statics.field1778.method3182();
                                if (Statics.field2468) {
                                    class151.field2479--;
                                } else {
                                    class151.field2476--;
                                }
                                class151.field2481 = 0;
                                Statics.field1778 = null;
                                Statics.field733 = null;
                            } else {
                                if (class151.field2481 != 512) {
                                    break;
                                }
                                class151.field2481 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2484.method1340();
                } catch (Exception var34) {
                }
                class151.field2487++;
                Statics.field2484 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method418();
        }
    }

    @ObfuscatedName("client.r(I)V")
    public void method418() {
        if (class151.field2486 >= 4) {
            this.method1377("js5crc");
            field474 = 1000;
            return;
        }
        if (class151.field2487 >= 4) {
            if (field474 <= 5) {
                this.method1377("js5io");
                field474 = 1000;
                return;
            }
            field496 = 3000;
            class151.field2487 = 3;
        }
        if (--field496 + 1 > 0) {
            return;
        }
        try {
            if (field633 == 0) {
                Statics.field1027 = Statics.field1010.method1437(Statics.field204, Statics.field2297);
                field633++;
            }
            if (field633 == 1) {
                if (Statics.field1027.field1385 == 2) {
                    this.method257(-1);
                    return;
                }
                if (Statics.field1027.field1385 == 1) {
                    field633++;
                }
            }
            if (field633 == 2) {
                Statics.field494 = new class69((Socket) Statics.field1027.field1384, Statics.field1010);
                class125 var1 = new class125(5);
                var1.method2339(15);
                var1.method2316(6);
                Statics.field494.method1328(var1.field2002, 0, 5);
                field633++;
                Statics.field854 = class120.method774();
            }
            if (field633 == 3) {
                if (field474 <= 5 || Statics.field494.method1326() > 0) {
                    int var2 = Statics.field494.method1325();
                    if (var2 != 0) {
                        this.method257(var2);
                        return;
                    }
                    field633++;
                } else if (class120.method774() - Statics.field854 > 30000L) {
                    this.method257(-2);
                    return;
                }
            }
            if (field633 == 4) {
                class69 var3 = Statics.field494;
                boolean var4 = field474 > 20;
                if (Statics.field2484 != null) {
                    try {
                        Statics.field2484.method1340();
                    } catch (Exception var14) {
                    }
                    Statics.field2484 = null;
                }
                Statics.field2484 = var3;
                class151.method1274(var4);
                class151.field2480.field2003 = 0;
                Statics.field1778 = null;
                Statics.field733 = null;
                class151.field2481 = 0;
                while (true) {
                    class153 var6 = (class153) class151.field2478.method3141();
                    if (var6 == null) {
                        while (true) {
                            class153 var7 = (class153) class151.field2469.method3141();
                            if (var7 == null) {
                                if (class151.field2485 != 0) {
                                    try {
                                        class125 var8 = new class125(4);
                                        var8.method2339(4);
                                        var8.method2339(class151.field2485);
                                        var8.method2314(0);
                                        Statics.field2484.method1328(var8.field2002, 0, 4);
                                    } catch (IOException var13) {
                                        try {
                                            Statics.field2484.method1340();
                                        } catch (Exception var12) {
                                        }
                                        class151.field2487++;
                                        Statics.field2484 = null;
                                    }
                                }
                                class151.field2477 = 0;
                                Statics.field259 = class120.method774();
                                Statics.field1027 = null;
                                Statics.field494 = null;
                                field633 = 0;
                                field637 = 0;
                                return;
                            }
                            class151.field2474.method3103(var7);
                            class151.field2475.method3137(var7, var7.field2759);
                            class151.field2473++;
                            class151.field2476--;
                        }
                    }
                    class151.field2470.method3137(var6, var6.field2759);
                    class151.field2471++;
                    class151.field2479--;
                }
            }
        } catch (IOException var15) {
            this.method257(-3);
        }
    }

    @ObfuscatedName("client.n(II)V")
    public void method257(int arg0) {
        Statics.field1027 = null;
        Statics.field494 = null;
        field633 = 0;
        if (Statics.field98 == Statics.field2297) {
            Statics.field2297 = Statics.field914;
        } else {
            Statics.field2297 = Statics.field98;
        }
        field637++;
        if (field637 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field474 <= 5) {
                this.method1377("js5connect_full");
                field474 = 1000;
            } else {
                field496 = 3000;
            }
        } else if (field637 >= 2 && arg0 == 6) {
            this.method1377("js5connect_outofdate");
            field474 = 1000;
        } else if (field637 >= 4) {
            if (field474 <= 5) {
                this.method1377("js5connect");
                field474 = 1000;
            } else {
                field496 = 3000;
            }
        }
    }

    @ObfuscatedName("dz.b(I)V")
    public static void method2248() {
        if (field722 == 0) {
            Statics.field1310 = new class94(4, 104, 104, class9.field157);
            for (int var0 = 0; var0 < 4; var0++) {
                field671[var0] = new class162(104, 104);
            }
            Statics.field347 = new class85(512, 512);
            class20.field305 = class133.field2065;
            class20.field334 = 5;
            field722 = 20;
        } else if (field722 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class103.field1763[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class94.method1785(var1, 500, 800, 512, 334);
            class20.field305 = class133.field2066;
            class20.field334 = 10;
            field722 = 30;
        } else if (field722 == 30) {
            Statics.field190 = method219(0, false, true, true);
            Statics.field206 = method219(1, false, true, true);
            Statics.field2288 = method219(2, true, false, true);
            Statics.field395 = method219(3, false, true, true);
            Statics.field1237 = method219(4, false, true, true);
            Statics.field739 = method219(5, true, true, true);
            Statics.field984 = method219(6, true, true, false);
            Statics.field250 = method219(7, false, true, true);
            Statics.field2505 = method219(8, false, true, true);
            Statics.field1434 = method219(9, false, true, true);
            Statics.field2006 = method219(10, false, true, true);
            Statics.field373 = method219(11, false, true, true);
            Statics.field1409 = method219(12, false, true, true);
            Statics.field2676 = method219(13, true, false, true);
            Statics.field2652 = method219(14, false, true, false);
            Statics.field898 = method219(15, false, true, true);
            class20.field305 = class133.field2067;
            class20.field334 = 20;
            field722 = 40;
        } else if (field722 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field190.method2904() * 4 / 100;
            int var8 = var7 + Statics.field206.method2904() * 4 / 100;
            int var9 = var8 + Statics.field2288.method2904() * 2 / 100;
            int var10 = var9 + Statics.field395.method2904() * 2 / 100;
            int var11 = var10 + Statics.field1237.method2904() * 6 / 100;
            int var12 = var11 + Statics.field739.method2904() * 4 / 100;
            int var13 = var12 + Statics.field984.method2904() * 2 / 100;
            int var14 = var13 + Statics.field250.method2904() * 60 / 100;
            int var15 = var14 + Statics.field2505.method2904() * 2 / 100;
            int var16 = var15 + Statics.field1434.method2904() * 2 / 100;
            int var17 = var16 + Statics.field2006.method2904() * 2 / 100;
            int var18 = var17 + Statics.field373.method2904() * 2 / 100;
            int var19 = var18 + Statics.field1409.method2904() * 2 / 100;
            int var20 = var19 + Statics.field2676.method2904() * 2 / 100;
            int var21 = var20 + Statics.field2652.method2904() * 2 / 100;
            int var22 = var21 + Statics.field898.method2904() * 2 / 100;
            if (var22 == 100) {
                class20.field305 = class133.field2069;
                class20.field334 = 30;
                field722 = 45;
            } else {
                if (var22 != 0) {
                    class20.field305 = class133.field2068 + var22 + "%";
                }
                class20.field334 = 30;
            }
        } else if (field722 == 45) {
            class51.method10(22050, !field528, 2);
            class140 var23 = new class140();
            var23.method2612(9, 128);
            Statics.field1246 = class51.method111(Statics.field1010, Statics.field67, 0, 22050);
            Statics.field1246.method1104(var23);
            class152 var24 = Statics.field898;
            class152 var25 = Statics.field2652;
            class152 var26 = Statics.field1237;
            Statics.field2314 = var24;
            Statics.field2310 = var25;
            Statics.field2311 = var26;
            Statics.field2012 = var23;
            Statics.field184 = class51.method111(Statics.field1010, Statics.field67, 1, 2048);
            Statics.field61 = new class45();
            Statics.field184.method1104(Statics.field61);
            Statics.field1967 = new class61(22050, Statics.field1090);
            class20.field305 = class133.field2176;
            class20.field334 = 35;
            field722 = 50;
        } else if (field722 == 50) {
            int var27 = 0;
            if (Statics.field849 == null) {
                Statics.field849 = class83.method809(Statics.field2505, Statics.field2676, "p11_full", "");
            } else {
                var27++;
            }
            if (Statics.field1719 == null) {
                Statics.field1719 = class83.method809(Statics.field2505, Statics.field2676, "p12_full", "");
            } else {
                var27++;
            }
            if (Statics.field1264 == null) {
                Statics.field1264 = class83.method809(Statics.field2505, Statics.field2676, "b12_full", "");
            } else {
                var27++;
            }
            if (var27 < 3) {
                class20.field305 = class133.field2071 + var27 * 100 / 3 + "%";
                class20.field334 = 40;
            } else {
                class20.field305 = class133.field2234;
                class20.field334 = 40;
                field722 = 60;
            }
        } else if (field722 == 60) {
            int var28 = class20.method1265(Statics.field2006, Statics.field2505);
            int var29 = class20.method116();
            if (var28 < var29) {
                class20.field305 = class133.field2180 + var28 * 100 / var29 + "%";
                class20.field334 = 50;
            } else {
                class20.field305 = class133.field2074;
                class20.field334 = 50;
                method119(5);
                field722 = 70;
            }
        } else if (field722 == 70) {
            if (Statics.field2288.method2825()) {
                class152 var30 = Statics.field2288;
                Statics.field917 = var30;
                class32.method506(Statics.field2288);
                class152 var31 = Statics.field2288;
                class152 var32 = Statics.field250;
                Statics.field902 = var31;
                Statics.field901 = var32;
                Statics.field907 = Statics.field902.method2866(3);
                class31.method2571(Statics.field2288, Statics.field250, field528);
                class152 var33 = Statics.field2288;
                class152 var34 = Statics.field250;
                Statics.field777 = var33;
                Statics.field2663 = var34;
                Statics.method2936(Statics.field2288, Statics.field250, field470, Statics.field849);
                class33.method1761(Statics.field2288, Statics.field190, Statics.field206);
                class152 var35 = Statics.field2288;
                class152 var36 = Statics.field250;
                Statics.field887 = var35;
                Statics.field883 = var36;
                class37.method2567(Statics.field2288);
                class152 var37 = Statics.field2288;
                Statics.field1019 = var37;
                Statics.field1020 = Statics.field1019.method2866(16);
                class156.method2565(Statics.field395, Statics.field250, Statics.field2505, Statics.field2676);
                class152 var38 = Statics.field2288;
                Statics.field1012 = var38;
                class152 var39 = Statics.field2288;
                Statics.field943 = var39;
                class20.field305 = class133.field2076;
                class20.field334 = 60;
                field722 = 80;
            } else {
                class20.field305 = class133.field2075 + Statics.field2288.method2910() + "%";
                class20.field334 = 60;
            }
        } else if (field722 == 80) {
            int var40 = 0;
            if (Statics.field106 == null) {
                Statics.field106 = class83.method527(Statics.field2505, "compass", "");
            } else {
                var40++;
            }
            if (Statics.field981 == null) {
                Statics.field981 = class83.method527(Statics.field2505, "mapedge", "");
            } else {
                var40++;
            }
            if (Statics.field30 == null) {
                Statics.field30 = class83.method1559(Statics.field2505, "mapscene", "");
            } else {
                var40++;
            }
            if (Statics.field34 == null) {
                Statics.field34 = class83.method11(Statics.field2505, "mapfunction", "");
            } else {
                var40++;
            }
            if (Statics.field12 == null) {
                Statics.field12 = class83.method11(Statics.field2505, "hitmarks", "");
            } else {
                var40++;
            }
            if (Statics.field382 == null) {
                Statics.field382 = class83.method11(Statics.field2505, "headicons_pk", "");
            } else {
                var40++;
            }
            if (Statics.field923 == null) {
                Statics.field923 = class83.method11(Statics.field2505, "headicons_prayer", "");
            } else {
                var40++;
            }
            if (Statics.field225 == null) {
                Statics.field225 = class83.method11(Statics.field2505, "headicons_hint", "");
            } else {
                var40++;
            }
            if (Statics.field152 == null) {
                Statics.field152 = class83.method11(Statics.field2505, "mapmarker", "");
            } else {
                var40++;
            }
            if (Statics.field1348 == null) {
                Statics.field1348 = class83.method11(Statics.field2505, "cross", "");
            } else {
                var40++;
            }
            if (Statics.field187 == null) {
                Statics.field187 = class83.method11(Statics.field2505, "mapdots", "");
            } else {
                var40++;
            }
            if (Statics.field290 == null) {
                Statics.field290 = class83.method1559(Statics.field2505, "scrollbar", "");
            } else {
                var40++;
            }
            if (Statics.field1243 == null) {
                Statics.field1243 = class83.method1559(Statics.field2505, "mod_icons", "");
            } else {
                var40++;
            }
            if (Statics.field2053 == null) {
                Statics.field2053 = class83.method49(Statics.field2505, "mapback", "");
            } else {
                var40++;
            }
            if (var40 < 14) {
                class20.field305 = class133.field2114 + var40 * 100 / 14 + "%";
                class20.field334 = 70;
            } else {
                Statics.field2786 = Statics.field1243;
                Statics.field981.method1600();
                int var41 = (int) (Math.random() * 21.0D) - 10;
                int var42 = (int) (Math.random() * 21.0D) - 10;
                int var43 = (int) (Math.random() * 21.0D) - 10;
                int var44 = (int) (Math.random() * 41.0D) - 20;
                for (int var45 = 0; var45 < Statics.field34.length; var45++) {
                    Statics.field34[var45].method1599(var41 + var44, var42 + var44, var43 + var44);
                }
                Statics.field30[0].method1680(var41 + var44, var42 + var44, var43 + var44);
                Statics.field930 = new int[33];
                Statics.field280 = new int[33];
                Statics.field92 = new int[151];
                Statics.field1431 = new int[151];
                for (int var46 = 0; var46 < 33; var46++) {
                    int var47 = 999;
                    int var48 = 0;
                    for (int var49 = 0; var49 < 34; var49++) {
                        if (Statics.field2053.field1453[Statics.field2053.field1452 * var46 + var49] == 0) {
                            if (var47 == 999) {
                                var47 = var49;
                            }
                        } else if (var47 != 999) {
                            var48 = var49;
                            break;
                        }
                    }
                    Statics.field930[var46] = var47;
                    Statics.field280[var46] = var48 - var47;
                }
                for (int var50 = 5; var50 < 156; var50++) {
                    int var51 = 999;
                    int var52 = 0;
                    for (int var53 = 25; var53 < 172; var53++) {
                        if (Statics.field2053.field1453[Statics.field2053.field1452 * var50 + var53] == 0 && var53 > 34 || var50 > 34) {
                            if (var51 == 999) {
                                var51 = var53;
                            }
                        } else if (var51 != 999) {
                            var52 = var53;
                            break;
                        }
                    }
                    Statics.field92[var50 - 5] = var51 - 25;
                    Statics.field1431[var50 - 5] = var52 - var51;
                }
                class20.field305 = class133.field2100;
                class20.field334 = 70;
                field722 = 90;
            }
        } else if (field722 == 90) {
            if (Statics.field1434.method2825()) {
                class109 var54 = new class109(Statics.field1434, Statics.field2505, 20, 0.8D, field528 ? 64 : 128);
                class103.method2016(var54);
                class103.method2017(0.8D);
                class20.field305 = class133.field2080;
                class20.field334 = 90;
                field722 = 110;
            } else {
                class20.field305 = class133.field2079 + Statics.field1434.method2910() + "%";
                class20.field334 = 90;
            }
        } else if (field722 == 110) {
            Statics.field2383 = new class15();
            Statics.field1010.method1438(Statics.field2383, 10);
            class20.field305 = class133.field2215;
            class20.field334 = 94;
            field722 = 120;
        } else if (field722 == 120) {
            if (Statics.field2006.method2822("huffman", "")) {
                class119 var55 = new class119(Statics.field2006.method2850("huffman", ""));
                class182.method771(var55);
                class20.field305 = class133.field2083;
                class20.field334 = 96;
                field722 = 130;
            } else {
                class20.field305 = class133.field2274 + "%";
                class20.field334 = 96;
            }
        } else if (field722 == 130) {
            if (!Statics.field395.method2825()) {
                class20.field305 = class133.field2084 + Statics.field395.method2910() * 4 / 5 + "%";
                class20.field334 = 100;
            } else if (!Statics.field1409.method2825()) {
                class20.field305 = class133.field2084 + (80 + Statics.field1409.method2910() / 6) + "%";
                class20.field334 = 100;
            } else if (Statics.field2676.method2825()) {
                class20.field305 = class133.field2226;
                class20.field334 = 100;
                field722 = 140;
            } else {
                class20.field305 = class133.field2084 + (96 + Statics.field2676.method2910() / 20) + "%";
                class20.field334 = 100;
            }
        } else if (field722 == 140) {
            method119(10);
        }
    }

    @ObfuscatedName("k.z(IZZZB)Lem;")
    public static class152 method219(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class70 var4 = null;
        if (class81.field1400 != null) {
            var4 = new class70(arg0, class81.field1400, Statics.field955[arg0], 1000000);
        }
        return new class152(var4, Statics.field1273, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("r.h(B)V")
    public static final void method115() {
        try {
            if (field498 == 0) {
                if (Statics.field82 != null) {
                    Statics.field82.method1340();
                    Statics.field82 = null;
                }
                Statics.field1436 = null;
                field493 = false;
                field499 = 0;
                field498 = 1;
            }
            if (field498 == 1) {
                if (Statics.field1436 == null) {
                    Statics.field1436 = Statics.field1010.method1437(Statics.field204, Statics.field2297);
                }
                if (Statics.field1436.field1385 == 2) {
                    throw new IOException();
                }
                if (Statics.field1436.field1385 == 1) {
                    Statics.field82 = new class69((Socket) Statics.field1436.field1384, Statics.field1010);
                    Statics.field1436 = null;
                    field498 = 2;
                }
            }
            if (field498 == 2) {
                field505.field2003 = 0;
                field505.method2339(14);
                Statics.field82.method1328(field505.field2002, 0, 1);
                field507.field2003 = 0;
                field498 = 3;
            }
            if (field498 == 3) {
                if (Statics.field1246 != null) {
                    Statics.field1246.method1106();
                }
                if (Statics.field184 != null) {
                    Statics.field184.method1106();
                }
                int var0 = Statics.field82.method1325();
                if (Statics.field1246 != null) {
                    Statics.field1246.method1106();
                }
                if (Statics.field184 != null) {
                    Statics.field184.method1106();
                }
                if (var0 != 0) {
                    method1306(var0);
                    return;
                }
                field507.field2003 = 0;
                field498 = 5;
            }
            if (field498 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field505.field2003 = 0;
                field505.method2339(10);
                field505.method2316(var1[0]);
                field505.method2316(var1[1]);
                field505.method2316(var1[2]);
                field505.method2316(var1[3]);
                field505.method2317(0L);
                field505.method2318(class20.field307);
                field505.method2344(class6.field102, class6.field90);
                field724.field2003 = 0;
                if (field474 == 40) {
                    field724.method2339(18);
                } else {
                    field724.method2339(16);
                }
                field724.method2314(0);
                int var2 = field724.field2003;
                field724.method2316(6);
                field724.method2374(field505.field2002, 0, field505.field2003);
                int var3 = field724.field2003;
                field724.method2318(class20.field321);
                field724.method2339(field528 ? 1 : 0);
                class115 var4 = field724;
                byte[] var5 = new byte[24];
                try {
                    class81.field1399.method531(0L);
                    class81.field1399.method533(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var18) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2374(var5, 0, 24);
                field724.method2316(Statics.field190.field2457);
                field724.method2316(Statics.field206.field2457);
                field724.method2316(Statics.field2288.field2457);
                field724.method2316(Statics.field395.field2457);
                field724.method2316(Statics.field1237.field2457);
                field724.method2316(Statics.field739.field2457);
                field724.method2316(Statics.field984.field2457);
                field724.method2316(Statics.field250.field2457);
                field724.method2316(Statics.field2505.field2457);
                field724.method2316(Statics.field1434.field2457);
                field724.method2316(Statics.field2006.field2457);
                field724.method2316(Statics.field373.field2457);
                field724.method2316(Statics.field1409.field2457);
                field724.method2316(Statics.field2676.field2457);
                field724.method2316(Statics.field2652.field2457);
                field724.method2316(Statics.field898.field2457);
                field724.method2442(var1, var3, field724.field2003);
                field724.method2322(field724.field2003 - var2);
                Statics.field82.method1328(field724.field2002, 0, field724.field2003);
                field505.method2211(var1);
                for (int var9 = 0; var9 < 4; var9++) {
                    var1[var9] += 50;
                }
                field507.method2211(var1);
                field498 = 6;
            }
            if (field498 == 6 && Statics.field82.method1326() > 0) {
                int var10 = Statics.field82.method1325();
                if (var10 == 21 && field474 == 20) {
                    field498 = 7;
                } else if (var10 == 2) {
                    field498 = 9;
                } else if (var10 == 15 && field474 == 40) {
                    method233();
                    return;
                } else if (var10 == 23 && field500 < 1) {
                    field500++;
                    field498 = 0;
                } else {
                    method1306(var10);
                    return;
                }
            }
            if (field498 == 7 && Statics.field82.method1326() > 0) {
                field501 = (Statics.field82.method1325() + 3) * 60;
                field498 = 8;
            }
            if (field498 == 8) {
                field499 = 0;
                class20.method4(class133.field2086, class133.field2280, field501 / 60 + class133.field2088);
                if (--field501 <= 0) {
                    field498 = 0;
                }
            } else {
                if (field498 == 9 && Statics.field82.method1326() >= 8) {
                    field569 = Statics.field82.method1325();
                    field586 = Statics.field82.method1325() == 1;
                    field481 = Statics.field82.method1325();
                    field481 <<= 0x8;
                    field481 += Statics.field82.method1325();
                    field592 = Statics.field82.method1325();
                    Statics.field82.method1329(field507.field2002, 0, 1);
                    field507.field2003 = 0;
                    field657 = field507.method2203();
                    Statics.field82.method1329(field507.field2002, 0, 2);
                    field507.field2003 = 0;
                    field508 = field507.method2328();
                    if (field592 == 1) {
                        try {
                            client var11 = Statics.field465;
                            JSObject.getWindow(var11).call("zap", (Object[]) null);
                        } catch (Throwable var17) {
                        }
                    } else {
                        try {
                            client var13 = Statics.field465;
                            JSObject.getWindow(var13).call("unzap", (Object[]) null);
                        } catch (Throwable var16) {
                        }
                    }
                    field498 = 10;
                }
                if (field498 != 10) {
                    field499++;
                    if (field499 > 2000) {
                        if (field500 < 1) {
                            if (Statics.field98 == Statics.field2297) {
                                Statics.field2297 = Statics.field914;
                            } else {
                                Statics.field2297 = Statics.field98;
                            }
                            field500++;
                            field498 = 0;
                        } else {
                            method1306(-3);
                        }
                    }
                } else if (Statics.field82.method1326() >= field508) {
                    field507.field2003 = 0;
                    Statics.field82.method1329(field507.field2002, 0, field508);
                    method2603();
                    Statics.field122 = -1;
                    method26(false);
                    field657 = -1;
                }
            }
        } catch (IOException var19) {
            if (field500 < 1) {
                if (Statics.field98 == Statics.field2297) {
                    Statics.field2297 = Statics.field914;
                } else {
                    Statics.field2297 = Statics.field98;
                }
                field500++;
                field498 = 0;
            } else {
                method1306(-2);
            }
        }
    }

    @ObfuscatedName("et.q(I)V")
    public static void method2603() {
        field476 = 0L;
        field480 = 0;
        Statics.field2383.field245 = 0;
        Statics.field1029 = true;
        field715 = true;
        class180.field2773 = new class175();
        field505.field2003 = 0;
        field507.field2003 = 0;
        field657 = -1;
        field513 = -1;
        field514 = -1;
        field515 = -1;
        field510 = 0;
        field483 = 0;
        field512 = 0;
        field484 = 0;
        field608 = 0;
        field607 = false;
        class76.field1360 = 0;
        for (int var0 = 0; var0 < 100; var0++) {
            field680[var0] = null;
        }
        field495 = 0;
        field642 = 0;
        field660 = false;
        field695 = 0;
        field506 = (int) (Math.random() * 100.0D) - 50;
        field686 = (int) (Math.random() * 110.0D) - 55;
        field536 = (int) (Math.random() * 80.0D) - 40;
        field477 = (int) (Math.random() * 120.0D) - 60;
        field661 = (int) (Math.random() * 30.0D) - 20;
        field552 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field699 = 0;
        field692 = -1;
        field693 = 0;
        field698 = 0;
        field677 = 0;
        field503 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            field562[var1] = null;
            field565[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field681[var2] = null;
        }
        Statics.field1623 = field562[2047] = new class3();
        field601.method3146();
        field602.method3146();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field599[var3][var4][var5] = null;
                }
            }
        }
        field591 = new class175();
        field718 = 0;
        field717 = 0;
        for (int var6 = 0; var6 < Statics.field1020; var6++) {
            class41 var7 = class41.method2259(var6);
            if (var7 != null && var7.field1022 == 0) {
                class157.field2645[var6] = 0;
                class157.field2649[var6] = 0;
            }
        }
        for (int var8 = 0; var8 < field585.length; var8++) {
            field585[var8] = -1;
        }
        if (field485 != -1) {
            int var9 = field485;
            if (var9 != -1 && Statics.field2529[var9]) {
                Statics.field2521.method2833(var9);
                if (Statics.field2632[var9] != null) {
                    boolean var10 = true;
                    for (int var11 = 0; var11 < Statics.field2632[var9].length; var11++) {
                        if (Statics.field2632[var9][var11] != null) {
                            if (Statics.field2632[var9][var11].field2643 == 2) {
                                var10 = false;
                            } else {
                                Statics.field2632[var9][var11] = null;
                            }
                        }
                    }
                    if (var10) {
                        Statics.field2632[var9] = null;
                    }
                    Statics.field2529[var9] = false;
                }
            }
        }
        for (class4 var12 = (class4) field627.method3141(); var12 != null; var12 = (class4) field627.method3128()) {
            method2562(var12, true);
        }
        field485 = -1;
        field627 = new class173(8);
        field630 = null;
        field607 = false;
        field608 = 0;
        field550.method3008((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var13 = 0; var13 < 8; var13++) {
            field719[var13] = null;
            field597[var13] = false;
        }
        class18.method779();
        field475 = true;
        for (int var14 = 0; var14 < 100; var14++) {
            field634[var14] = true;
        }
        field690 = null;
        Statics.field383 = 0;
        Statics.field2337 = null;
    }

    @ObfuscatedName("d.l(I)V")
    public static void method233() {
        field505.field2003 = 0;
        field507.field2003 = 0;
        field657 = -1;
        field513 = -1;
        field514 = -1;
        field515 = -1;
        field508 = 0;
        field510 = 0;
        field483 = 0;
        field608 = 0;
        field607 = false;
        field699 = 0;
        field693 = 0;
        for (int var0 = 0; var0 < field562.length; var0++) {
            if (field562[var0] != null) {
                field562[var0].field428 = -1;
            }
        }
        for (int var1 = 0; var1 < field681.length; var1++) {
            if (field681[var1] != null) {
                field681[var1].field428 = -1;
            }
        }
        class18.method779();
        method119(30);
        for (int var2 = 0; var2 < 100; var2++) {
            field634[var2] = true;
        }
    }

    @ObfuscatedName("bb.t(IB)V")
    public static void method1306(int arg0) {
        if (arg0 == -3) {
            class20.method4(class133.field2089, class133.field2171, class133.field2091);
        } else if (arg0 == -2) {
            class20.method4(class133.field2200, class133.field2093, class133.field2094);
        } else if (arg0 == -1) {
            class20.method4(class133.field2095, class133.field2096, class133.field2097);
        } else if (arg0 == 3) {
            class20.method4(class133.field2098, class133.field2142, class133.field2150);
        } else if (arg0 == 4) {
            class20.method4(class133.field2101, class133.field2102, class133.field2103);
        } else if (arg0 == 5) {
            class20.method4(class133.field2208, class133.field2276, class133.field2159);
        } else if (arg0 == 6) {
            class20.method4(class133.field2107, class133.field2108, class133.field2109);
        } else if (arg0 == 7) {
            class20.method4(class133.field2115, class133.field2111, class133.field2112);
        } else if (arg0 == 8) {
            class20.method4(class133.field2113, class133.field2251, class133.field2209);
        } else if (arg0 == 9) {
            class20.method4(class133.field2173, class133.field2266, class133.field2085);
        } else if (arg0 == 10) {
            class20.method4(class133.field2119, class133.field2120, class133.field2121);
        } else if (arg0 == 11) {
            class20.method4(class133.field2122, class133.field2205, class133.field2124);
        } else if (arg0 == 12) {
            class20.method4(class133.field2229, class133.field2269, class133.field2246);
        } else if (arg0 == 13) {
            class20.method4(class133.field2128, class133.field2123, class133.field2130);
        } else if (arg0 == 14) {
            class20.method4(class133.field2078, class133.field2132, class133.field2133);
        } else if (arg0 == 16) {
            class20.method4(class133.field2134, class133.field2135, class133.field2087);
        } else if (arg0 == 17) {
            class20.method4(class133.field2258, class133.field2138, class133.field2139);
        } else if (arg0 == 18) {
            class20.method4(class133.field2140, class133.field2141, class133.field2272);
        } else if (arg0 == 19) {
            class20.method4(class133.field2126, class133.field2116, class133.field2145);
        } else if (arg0 == 20) {
            class20.method4(class133.field2146, class133.field2147, class133.field2188);
        } else if (arg0 == 22) {
            class20.method4(class133.field2149, class133.field2270, class133.field2151);
        } else if (arg0 == 23) {
            class20.method4(class133.field2152, class133.field2153, class133.field2154);
        } else if (arg0 == 24) {
            class20.method4(class133.field2155, class133.field2156, class133.field2235);
        } else if (arg0 == 25) {
            class20.method4(class133.field2158, class133.field2117, class133.field2160);
        } else if (arg0 == 26) {
            class20.method4(class133.field2242, class133.field2090, class133.field2199);
        } else if (arg0 == 27) {
            class20.method4(class133.field2164, class133.field2165, class133.field2166);
        } else if (arg0 == 31) {
            class20.method4(class133.field2127, class133.field2174, class133.field2175);
        } else if (arg0 == 32) {
            class20.method4(class133.field2183, class133.field2106, class133.field2178);
        } else if (arg0 == 37) {
            class20.method4(class133.field2179, class133.field2058, class133.field2212);
        } else if (arg0 == 38) {
            class20.method4(class133.field2182, class133.field2105, class133.field2184);
        } else if (arg0 == 55) {
            class20.method4(class133.field2177, class133.field2186, class133.field2187);
        } else {
            class20.method4(class133.field2195, class133.field2189, class133.field2161);
        }
        method119(10);
    }

    @ObfuscatedName("h.g(I)V")
    public static final void method126() {
        if (Statics.field82 != null) {
            Statics.field82.method1340();
            Statics.field82 = null;
        }
        method131();
        Statics.field1310.method1764();
        for (int var0 = 0; var0 < 4; var0++) {
            field671[var0].method3044();
        }
        System.gc();
        class137.field2312 = 1;
        Statics.field2318 = null;
        Statics.field2426 = -1;
        Statics.field253 = -1;
        Statics.field2320 = 0;
        Statics.field2315 = false;
        Statics.field1242 = 2;
        field701 = -1;
        field702 = false;
        class7.method232();
        method119(10);
    }

    @ObfuscatedName("h.a(I)V")
    public static final void method131() {
        class36.field916.method3092();
        class32.method130();
        class35.field903.method3092();
        class31.method717();
        class30.field762.method3092();
        class30.field763.method3092();
        class39.field959.method3092();
        class39.field976.method3092();
        class39.field961.method3092();
        class33.method1433();
        class34.field880.method3092();
        class34.field894.method3092();
        class37.field940.method3092();
        class41.field1023.method3092();
        class161.field2675.method3092();
        class156.field2536.method3092();
        class156.field2524.method3092();
        class156.field2628.method3092();
        ((class109) Statics.field1759).method2110();
        class5.field87.method3092();
        Statics.field190.method2819();
        Statics.field206.method2819();
        Statics.field395.method2819();
        Statics.field1237.method2819();
        Statics.field739.method2819();
        Statics.field984.method2819();
        Statics.field250.method2819();
        Statics.field2505.method2819();
        Statics.field1434.method2819();
        Statics.field2006.method2819();
        Statics.field373.method2819();
        Statics.field1409.method2819();
    }

    @ObfuscatedName("k.v(B)V")
    public static final void method217() {
        if (field483 > 1) {
            field483--;
        }
        if (field512 > 0) {
            field512--;
        }
        if (field493) {
            field493 = false;
            if (field512 > 0) {
                method126();
            } else {
                method119(40);
                Statics.field402 = Statics.field82;
                Statics.field82 = null;
            }
            return;
        }
        for (int var0 = 0; var0 < 100; var0++) {
            boolean var1;
            if (Statics.field82 == null) {
                var1 = false;
            } else {
                label2694: {
                    try {
                        int var2 = Statics.field82.method1326();
                        if (var2 == 0) {
                            var1 = false;
                            break label2694;
                        }
                        if (field657 == -1) {
                            Statics.field82.method1329(field507.field2002, 0, 1);
                            field507.field2003 = 0;
                            field657 = field507.method2203();
                            field508 = class163.field2709[field657];
                            var2--;
                        }
                        if (field508 == -1) {
                            if (var2 <= 0) {
                                var1 = false;
                                break label2694;
                            }
                            Statics.field82.method1329(field507.field2002, 0, 1);
                            field508 = field507.field2002[0] & 0xFF;
                            var2--;
                        }
                        if (field508 == -2) {
                            if (var2 <= 1) {
                                var1 = false;
                                break label2694;
                            }
                            Statics.field82.method1329(field507.field2002, 0, 2);
                            field507.field2003 = 0;
                            field508 = field507.method2328();
                            var2 -= 2;
                        }
                        if (var2 < field508) {
                            var1 = false;
                            break label2694;
                        }
                        field507.field2003 = 0;
                        Statics.field82.method1329(field507.field2002, 0, field508);
                        field510 = 0;
                        field515 = field514;
                        field514 = field513;
                        field513 = field657;
                        if (field657 == 68) {
                            field711 = true;
                            Statics.field258 = field507.method2326();
                            Statics.field221 = field507.method2326();
                            Statics.field293 = field507.method2328();
                            Statics.field242 = field507.method2326();
                            Statics.field1832 = field507.method2326();
                            if (Statics.field1832 >= 100) {
                                int var3 = Statics.field258 * 128 + 64;
                                int var4 = Statics.field221 * 128 + 64;
                                int var5 = method505(var3, var4, Statics.field208) - Statics.field293;
                                int var6 = var3 - Statics.field1492;
                                int var7 = var5 - Statics.field1407;
                                int var8 = var4 - Statics.field361;
                                int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
                                Statics.field1262 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
                                Statics.field17 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
                                if (Statics.field1262 < 128) {
                                    Statics.field1262 = 128;
                                }
                                if (Statics.field1262 > 383) {
                                    Statics.field1262 = 383;
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 61) {
                            int var10 = field508 + field507.field2003;
                            int var11 = field507.method2328();
                            int var12 = field507.method2328();
                            if (field485 != var11) {
                                field485 = var11;
                                Statics.method1922(field485);
                                class25.method1361(field485);
                                for (int var13 = 0; var13 < 100; var13++) {
                                    field634[var13] = true;
                                }
                            }
                            while (var12-- > 0) {
                                int var14 = field507.method2489();
                                int var15 = field507.method2328();
                                int var16 = field507.method2326();
                                class4 var17 = (class4) field627.method3129((long) var14);
                                if (var17 != null && var17.field70 != var15) {
                                    method2562(var17, true);
                                    var17 = null;
                                }
                                if (var17 == null) {
                                    var17 = method3040(var14, var15, var16);
                                }
                                var17.field63 = true;
                            }
                            for (class4 var18 = (class4) field627.method3141(); var18 != null; var18 = (class4) field627.method3128()) {
                                if (var18.field63) {
                                    var18.field63 = false;
                                } else {
                                    method2562(var18, true);
                                }
                            }
                            field566 = new class173(512);
                            while (field507.field2003 < var10) {
                                int var19 = field507.method2489();
                                int var20 = field507.method2328();
                                int var21 = field507.method2328();
                                int var22 = field507.method2489();
                                for (int var23 = var20; var23 <= var21; var23++) {
                                    long var24 = ((long) var19 << 32) + (long) var23;
                                    field566.method3137(new class169(var22), var24);
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 188) {
                            method2253();
                            field632 = field507.method2329();
                            field659 = field649;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 15) {
                            field658 = field649;
                            if (field508 == 0) {
                                field690 = null;
                                field616 = null;
                                Statics.field383 = 0;
                                Statics.field2337 = null;
                                field657 = -1;
                                var1 = true;
                            } else {
                                field616 = field507.method2515();
                                long var26 = field507.method2402();
                                field690 = class145.method1527(var26);
                                Statics.field1902 = field507.method2347();
                                int var28 = field507.method2326();
                                if (var28 == 255) {
                                    field657 = -1;
                                    var1 = true;
                                } else {
                                    Statics.field383 = var28;
                                    class8[] var29 = new class8[100];
                                    for (int var30 = 0; var30 < Statics.field383; var30++) {
                                        var29[var30] = new class8();
                                        var29[var30].field130 = field507.method2515();
                                        var29[var30].field127 = class147.method136(var29[var30].field130, Statics.field1255);
                                        var29[var30].field129 = field507.method2328();
                                        var29[var30].field126 = field507.method2347();
                                        field507.method2515();
                                        if (var29[var30].field130.equals(Statics.field1623.field58)) {
                                            Statics.field1780 = var29[var30].field126;
                                        }
                                    }
                                    boolean var31 = false;
                                    int var32 = Statics.field383;
                                    while (var32 > 0) {
                                        boolean var33 = true;
                                        var32--;
                                        for (int var34 = 0; var34 < var32; var34++) {
                                            if (var29[var34].field127.compareTo(var29[var34 + 1].field127) > 0) {
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
                                    Statics.field2337 = var29;
                                    field657 = -1;
                                    var1 = true;
                                }
                            }
                            break label2694;
                        }
                        if (field657 == 48) {
                            String var36 = field507.method2515();
                            int var37 = field507.method2489();
                            class156 var38 = class156.method2702(var37);
                            if (!var36.equals(var38.field2575)) {
                                var38.field2575 = var36;
                                method166(var38);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 247) {
                            method2253();
                            field631 = field507.method2326();
                            field659 = field649;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 70) {
                            field718 = 1;
                            field622 = field649;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 160) {
                            method2253();
                            int var39 = field507.method2378();
                            int var40 = field507.method2326();
                            int var41 = field507.method2351();
                            field605[var40] = var39;
                            field621[var40] = var41;
                            field666[var40] = 1;
                            for (int var42 = 0; var42 < 98; var42++) {
                                if (var39 >= class129.field2017[var42]) {
                                    field666[var40] = var42 + 2;
                                }
                            }
                            field654[++field472 - 1 & 0x1F] = var40;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 51) {
                            int var43 = field507.method2358();
                            if (var43 == 65535) {
                                var43 = -1;
                            }
                            int var44 = field507.method2378();
                            int var45 = field507.method2358();
                            if (var45 == 65535) {
                                var45 = -1;
                            }
                            int var46 = field507.method2489();
                            for (int var47 = var43; var47 <= var45; var47++) {
                                long var48 = ((long) var44 << 32) + (long) var47;
                                class177 var50 = field566.method3129(var48);
                                if (var50 != null) {
                                    var50.method3182();
                                }
                                field566.method3137(new class169(var46), var48);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 19) {
                            field699 = field507.method2326();
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 44) {
                            int var51 = field507.method2329();
                            int var52 = field507.method2378();
                            class156 var53 = class156.method2702(var52);
                            if (var53.field2564 != var51 || var51 == -1) {
                                var53.field2564 = var51;
                                var53.field2634 = 0;
                                var53.field2635 = 0;
                                method166(var53);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 218) {
                            int var54 = field507.method2362();
                            int var55 = field507.method2366();
                            int var56 = field507.method2329();
                            class156 var57 = class156.method2702(var55);
                            int var58 = var57.field2535 + var56;
                            int var59 = var57.field2626 + var54;
                            if (var57.field2533 != var58 || var57.field2534 != var59) {
                                var57.field2533 = var58;
                                var57.field2534 = var59;
                                method166(var57);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 198) {
                            field483 = field507.method2359() * 30;
                            field659 = field649;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 190) {
                            field693 = 0;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 203) {
                            method26(true);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 22) {
                            int var60 = field507.method2489();
                            int var61 = field507.method2360();
                            class156 var62 = class156.method2702(var60);
                            if (var62.field2560 != 1 || var62.field2561 != var61) {
                                var62.field2560 = 1;
                                var62.field2561 = var61;
                                method166(var62);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 154) {
                            field507.field2003 += 28;
                            if (field507.method2346()) {
                                class81.method2010(field507, field507.field2003 - 28);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 142) {
                            for (int var63 = 0; var63 < class157.field2649.length; var63++) {
                                if (class157.field2649[var63] != class157.field2645[var63]) {
                                    class157.field2649[var63] = class157.field2645[var63];
                                    method61(var63);
                                    field650[++field651 - 1 & 0x1F] = var63;
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 163) {
                            while (field507.field2003 < field508) {
                                int var64 = field507.method2326();
                                boolean var65 = (var64 & 0x1) == 1;
                                String var66 = field507.method2515();
                                String var67 = field507.method2515();
                                field507.method2515();
                                for (int var68 = 0; var68 < field721; var68++) {
                                    class11 var69 = field669[var68];
                                    if (var65) {
                                        if (var67.equals(var69.field195)) {
                                            var69.field195 = var66;
                                            var69.field186 = var67;
                                            var66 = null;
                                            break;
                                        }
                                    } else if (var66.equals(var69.field195)) {
                                        var69.field195 = var66;
                                        var69.field186 = var67;
                                        var66 = null;
                                        break;
                                    }
                                }
                                if (var66 != null && field721 < 100) {
                                    class11 var70 = new class11();
                                    field669[field721] = var70;
                                    var70.field195 = var66;
                                    var70.field186 = var67;
                                    field721++;
                                }
                            }
                            field622 = field649;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 100) {
                            Statics.field265 = field507.method2351();
                            Statics.field431 = field507.method2351();
                            while (field507.field2003 < field508) {
                                field657 = field507.method2326();
                                method858();
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 34) {
                            int var71 = field507.method2366();
                            class156 var72 = class156.method2702(var71);
                            var72.field2560 = 3;
                            var72.field2561 = Statics.field1623.field43.method3016();
                            method166(var72);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 233) {
                            int var73 = field507.method2367();
                            int var74 = field507.method2360();
                            if (var74 == 65535) {
                                var74 = -1;
                            }
                            int var75 = field507.method2366();
                            class156 var76 = class156.method2702(var75);
                            if (var76.field2527) {
                                var76.field2644 = var74;
                                var76.field2519 = var73;
                                class39 var78 = class39.method2570(var74);
                                var76.field2568 = var78.field971;
                                var76.field2569 = var78.field962;
                                var76.field2550 = var78.field973;
                                var76.field2566 = var78.field974;
                                var76.field2570 = var78.field975;
                                var76.field2581 = var78.field956;
                                if (var76.field2537 > 0) {
                                    var76.field2581 = var76.field2581 * 32 / var76.field2537;
                                }
                                method166(var76);
                            } else {
                                if (var74 == -1) {
                                    var76.field2560 = 0;
                                    field657 = -1;
                                    var1 = true;
                                    break label2694;
                                }
                                class39 var77 = class39.method2570(var74);
                                var76.field2560 = 4;
                                var76.field2561 = var74;
                                var76.field2568 = var77.field971;
                                var76.field2569 = var77.field962;
                                var76.field2581 = var77.field956 * 100 / var73;
                                method166(var76);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 65) {
                            int var79 = field507.method2367();
                            Statics.field1013 = Statics.field1010.method1439(var79);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 104) {
                            int var80 = field507.method2360();
                            field485 = var80;
                            Statics.method1922(var80);
                            class25.method1361(field485);
                            for (int var81 = 0; var81 < 100; var81++) {
                                field634[var81] = true;
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 174) {
                            String var82 = field507.method2515();
                            String var83 = class183.method3229(class146.method159(class182.method2092(field507)));
                            method56(6, var82, var83);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 37) {
                            int var84 = field507.method2489();
                            class4 var85 = (class4) field627.method3129((long) var84);
                            if (var85 != null) {
                                method2562(var85, true);
                            }
                            if (field630 != null) {
                                method166(field630);
                                field630 = null;
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 242) {
                            int var86 = field507.method2352();
                            int var87 = field507.method2351();
                            int var88 = field507.method2352();
                            Statics.field208 = var87 >> 1;
                            Statics.field1623.method235(var86, var88, (var87 & 0x1) == 1);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 136) {
                            int var89 = field507.method2328();
                            int var90 = field507.method2366();
                            class156 var91 = class156.method2702(var90);
                            if (var91.field2560 != 2 || var91.field2561 != var89) {
                                var91.field2560 = 2;
                                var91.field2561 = var89;
                                method166(var91);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 109) {
                            for (int var92 = 0; var92 < field562.length; var92++) {
                                if (field562[var92] != null) {
                                    field562[var92].field434 = -1;
                                }
                            }
                            for (int var93 = 0; var93 < field681.length; var93++) {
                                if (field681[var93] != null) {
                                    field681[var93].field434 = -1;
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 42 || field657 == 249 || field657 == 241 || field657 == 77 || field657 == 181 || field657 == 43 || field657 == 202 || field657 == 155 || field657 == 45 || field657 == 110 || field657 == 184) {
                            method858();
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 139) {
                            String var94 = field507.method2515();
                            long var95 = field507.method2402();
                            long var97 = (long) field507.method2328();
                            long var99 = (long) field507.method2330();
                            int var101 = field507.method2326();
                            long var102 = (var97 << 32) + var99;
                            boolean var104 = false;
                            for (int var105 = 0; var105 < 100; var105++) {
                                if (field619[var105] == var102) {
                                    var104 = true;
                                    break;
                                }
                            }
                            if (var101 <= 1 && method141(var94)) {
                                var104 = true;
                            }
                            if (!var104 && field478 == 0) {
                                field619[field533] = var102;
                                field533 = (field533 + 1) % 100;
                                String var106 = class183.method3229(class146.method159(class182.method2092(field507)));
                                if (var101 == 2 || var101 == 3) {
                                    method1319(9, class2.method122(1) + var94, var106, class145.method1521(var95));
                                } else if (var101 == 1) {
                                    method1319(9, class2.method122(0) + var94, var106, class145.method1521(var95));
                                } else {
                                    method1319(9, var94, var106, class145.method1521(var95));
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 250) {
                            int var107 = field507.method2326();
                            int var108 = field507.method2326();
                            int var109 = field507.method2326();
                            int var110 = field507.method2326();
                            field712[var107] = true;
                            field713[var107] = var108;
                            field714[var107] = var109;
                            field589[var107] = var110;
                            field716[var107] = 0;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 73) {
                            for (int var111 = 0; var111 < Statics.field1020; var111++) {
                                class41 var112 = class41.method2259(var111);
                                if (var112 != null && var112.field1022 == 0) {
                                    class157.field2645[var111] = 0;
                                    class157.field2649[var111] = 0;
                                }
                            }
                            method2253();
                            field651 += 32;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 207) {
                            int var113 = field507.method2328();
                            int var114 = field507.method2366();
                            int var115 = var113 >> 10 & 0x1F;
                            int var116 = var113 >> 5 & 0x1F;
                            int var117 = var113 & 0x1F;
                            int var118 = (var117 << 3) + (var115 << 19) + (var116 << 11);
                            class156 var119 = class156.method2702(var114);
                            if (var119.field2623 != var118) {
                                var119.field2623 = var118;
                                method166(var119);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 220) {
                            int var120 = field507.method2489();
                            int var121 = field507.method2328();
                            if (var120 < -70000) {
                                var121 += 32768;
                            }
                            class156 var122;
                            if (var120 >= 0) {
                                var122 = class156.method2702(var120);
                            } else {
                                var122 = null;
                            }
                            if (var122 != null) {
                                for (int var123 = 0; var123 < var122.field2630.length; var123++) {
                                    var122.field2630[var123] = 0;
                                    var122.field2631[var123] = 0;
                                }
                            }
                            class18.method113(var121);
                            int var124 = field507.method2328();
                            for (int var125 = 0; var125 < var124; var125++) {
                                int var126 = field507.method2328();
                                int var127 = field507.method2352();
                                if (var127 == 255) {
                                    var127 = field507.method2366();
                                }
                                if (var122 != null && var125 < var122.field2630.length) {
                                    var122.field2630[var125] = var126;
                                    var122.field2631[var125] = var127;
                                }
                                class18.method23(var121, var125, var126 - 1, var127);
                            }
                            if (var122 != null) {
                                method166(var122);
                            }
                            method2253();
                            field652[++field705 - 1 & 0x1F] = var121 & 0x7FFF;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 18) {
                            field711 = true;
                            Statics.field62 = field507.method2326();
                            Statics.field1282 = field507.method2326();
                            Statics.field192 = field507.method2328();
                            Statics.field2291 = field507.method2326();
                            Statics.field1270 = field507.method2326();
                            if (Statics.field1270 >= 100) {
                                Statics.field1492 = Statics.field62 * 128 + 64;
                                Statics.field361 = Statics.field1282 * 128 + 64;
                                Statics.field1407 = method505(Statics.field1492, Statics.field361, Statics.field208) - Statics.field192;
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 238) {
                            int var128 = field507.method2367();
                            int var129 = field507.method2358();
                            class156 var130 = class156.method2702(var128);
                            if (var130 != null && var130.field2643 == 0) {
                                if (var129 > var130.field2544 - var130.field2538) {
                                    var129 = var130.field2544 - var130.field2538;
                                }
                                if (var129 < 0) {
                                    var129 = 0;
                                }
                                if (var130.field2587 != var129) {
                                    var130.field2587 = var129;
                                    method166(var130);
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 33) {
                            String var131 = field507.method2515();
                            if (var131.endsWith(":tradereq:")) {
                                String var132 = var131.substring(0, var131.indexOf(":"));
                                boolean var133 = false;
                                if (method141(var132)) {
                                    var133 = true;
                                }
                                if (!var133 && field478 == 0) {
                                    method56(4, var132, class133.field2191);
                                }
                            } else if (var131.endsWith(":duelreq:")) {
                                String var134 = var131.substring(0, var131.indexOf(":"));
                                boolean var135 = false;
                                if (method141(var134)) {
                                    var135 = true;
                                }
                                if (!var135 && field478 == 0) {
                                    method56(8, var134, class133.field2057);
                                }
                            } else if (var131.endsWith(":chalreq:")) {
                                String var136 = var131.substring(0, var131.indexOf(":"));
                                boolean var137 = false;
                                if (method141(var136)) {
                                    var137 = true;
                                }
                                if (!var137 && field478 == 0) {
                                    String var138 = var131.substring(var131.indexOf(":") + 1, var131.length() - 9);
                                    method56(8, var136, var138);
                                }
                            } else if (var131.endsWith(":assistreq:")) {
                                String var139 = var131.substring(0, var131.indexOf(":"));
                                boolean var140 = false;
                                if (method141(var139)) {
                                    var140 = true;
                                }
                                if (!var140 && field478 == 0) {
                                    method56(10, var139, "");
                                }
                            } else if (var131.endsWith(":clan:")) {
                                String var141 = var131.substring(0, var131.indexOf(":clan:"));
                                method56(11, "", var141);
                            } else if (var131.endsWith(":trade:")) {
                                String var142 = var131.substring(0, var131.indexOf(":trade:"));
                                if (field478 == 0) {
                                    method56(12, "", var142);
                                }
                            } else if (var131.endsWith(":assist:")) {
                                String var143 = var131.substring(0, var131.indexOf(":assist:"));
                                if (field478 == 0) {
                                    method56(13, "", var143);
                                }
                            } else {
                                method56(0, "", var131);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 219) {
                            Statics.field431 = field507.method2326();
                            Statics.field265 = field507.method2326();
                            for (int var144 = Statics.field431; var144 < Statics.field431 + 8; var144++) {
                                for (int var145 = Statics.field265; var145 < Statics.field265 + 8; var145++) {
                                    if (field599[Statics.field208][var144][var145] != null) {
                                        field599[Statics.field208][var144][var145] = null;
                                        method2985(var144, var145);
                                    }
                                }
                            }
                            for (class21 var146 = (class21) field591.method3145(); var146 != null; var146 = (class21) field591.method3154()) {
                                if (var146.field341 >= Statics.field431 && var146.field341 < Statics.field431 + 8 && var146.field342 >= Statics.field265 && var146.field342 < Statics.field265 + 8 && Statics.field208 == var146.field349) {
                                    var146.field350 = 0;
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 87) {
                            int var147 = field507.method2328();
                            int var148 = field507.method2326();
                            int var149 = field507.method2328();
                            if (field596 != 0 && var148 != 0 && field695 < 50) {
                                field706[field695] = var147;
                                field707[field695] = var148;
                                field708[field695] = var149;
                                field539[field695] = null;
                                field575[field695] = 0;
                                field695++;
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 176) {
                            int var153 = field507.method2489();
                            int var154 = field507.method2328();
                            if (var153 < -70000) {
                                var154 += 32768;
                            }
                            class156 var155;
                            if (var153 >= 0) {
                                var155 = class156.method2702(var153);
                            } else {
                                var155 = null;
                            }
                            while (field507.field2003 < field508) {
                                int var156 = field507.method2377();
                                int var157 = field507.method2328();
                                int var158 = 0;
                                if (var157 != 0) {
                                    var158 = field507.method2326();
                                    if (var158 == 255) {
                                        var158 = field507.method2489();
                                    }
                                }
                                if (var155 != null && var156 >= 0 && var156 < var155.field2630.length) {
                                    var155.field2630[var156] = var157;
                                    var155.field2631[var156] = var158;
                                }
                                class18.method23(var154, var156, var157 - 1, var158);
                            }
                            if (var155 != null) {
                                method166(var155);
                            }
                            method2253();
                            field652[++field705 - 1 & 0x1F] = var154 & 0x7FFF;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 50) {
                            int var159 = field507.method2366();
                            int var160 = field507.method2313();
                            int var161 = field507.method2358();
                            class4 var162 = (class4) field627.method3129((long) var159);
                            if (var162 != null) {
                                method2562(var162, var162.field70 != var161);
                            }
                            method3040(var159, var161, var160);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 159) {
                            while (field507.field2003 < field508) {
                                boolean var163 = field507.method2326() == 1;
                                String var164 = field507.method2515();
                                String var165 = field507.method2515();
                                int var166 = field507.method2328();
                                int var167 = field507.method2326();
                                int var168 = field507.method2326();
                                boolean var169 = (var168 & 0x2) != 0;
                                boolean var170 = (var168 & 0x1) != 0;
                                if (var166 > 0) {
                                    field507.method2515();
                                    field507.method2326();
                                    field507.method2489();
                                }
                                field507.method2515();
                                for (int var171 = 0; var171 < field717; var171++) {
                                    class22 var172 = field685[var171];
                                    if (var163) {
                                        if (var165.equals(var172.field366)) {
                                            var172.field366 = var164;
                                            var172.field356 = var165;
                                            var164 = null;
                                            break;
                                        }
                                    } else if (var164.equals(var172.field366)) {
                                        if (var172.field358 != var166) {
                                            boolean var173 = true;
                                            for (class27 var174 = (class27) field720.method3119(); var174 != null; var174 = (class27) field720.method3120()) {
                                                if (var174.field728.equals(var164)) {
                                                    if (var166 != 0 && var174.field735 == 0) {
                                                        var174.method3178();
                                                        var173 = false;
                                                    } else if (var166 == 0 && var174.field735 != 0) {
                                                        var174.method3178();
                                                        var173 = false;
                                                    }
                                                }
                                            }
                                            if (var173) {
                                                field720.method3118(new class27(var164, var166));
                                            }
                                            var172.field358 = var166;
                                        }
                                        var172.field356 = var165;
                                        var172.field355 = var167;
                                        var172.field359 = var169;
                                        var172.field360 = var170;
                                        var164 = null;
                                        break;
                                    }
                                }
                                if (var164 != null && field717 < 200) {
                                    class22 var175 = new class22();
                                    field685[field717] = var175;
                                    var175.field366 = var164;
                                    var175.field356 = var165;
                                    var175.field358 = var166;
                                    var175.field355 = var167;
                                    var175.field359 = var169;
                                    var175.field360 = var170;
                                    field717++;
                                }
                            }
                            field718 = 2;
                            field622 = field649;
                            boolean var176 = false;
                            int var177 = field717;
                            while (var177 > 0) {
                                boolean var178 = true;
                                var177--;
                                for (int var179 = 0; var179 < var177; var179++) {
                                    boolean var180 = false;
                                    class22 var181 = field685[var179];
                                    class22 var182 = field685[var179 + 1];
                                    if (field467 != var181.field358 && field467 == var182.field358) {
                                        var180 = true;
                                    }
                                    if (!var180 && var181.field358 == 0 && var182.field358 != 0) {
                                        var180 = true;
                                    }
                                    if (!var180 && !var181.field359 && var182.field359) {
                                        var180 = true;
                                    }
                                    if (!var180 && !var181.field360 && var182.field360) {
                                        var180 = true;
                                    }
                                    if (var180) {
                                        class22 var183 = field685[var179];
                                        field685[var179] = field685[var179 + 1];
                                        field685[var179 + 1] = var183;
                                        var178 = false;
                                    }
                                }
                                if (var178) {
                                    break;
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 66) {
                            int var184 = field507.method2328();
                            if (var184 == 65535) {
                                var184 = -1;
                            }
                            method2115(var184);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 143) {
                            int var185 = field507.method2359();
                            if (var185 == 65535) {
                                var185 = -1;
                            }
                            int var186 = field507.method2408();
                            method60(var185, var186);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 213) {
                            method26(false);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 140) {
                            int var187 = field507.method2489();
                            boolean var188 = field507.method2352() == 1;
                            class156 var189 = class156.method2702(var187);
                            if (var189.field2567 != var188) {
                                var189.field2567 = var188;
                                method166(var189);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 251) {
                            field484 = field507.method2326();
                            if (field484 == 1) {
                                field509 = field507.method2328();
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
                                field487 = field507.method2328();
                                field704 = field507.method2328();
                                field489 = field507.method2326();
                            }
                            if (field484 == 10) {
                                field486 = field507.method2328();
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 112) {
                            String var190 = field507.method2515();
                            int var191 = field507.method2328();
                            byte var192 = field507.method2347();
                            boolean var193 = false;
                            if (var192 == -128) {
                                var193 = true;
                            }
                            if (var193) {
                                if (Statics.field383 == 0) {
                                    field657 = -1;
                                    var1 = true;
                                    break label2694;
                                }
                                boolean var194 = false;
                                int var195;
                                for (var195 = 0; var195 < Statics.field383 && (!Statics.field2337[var195].field130.equals(var190) || Statics.field2337[var195].field129 != var191); var195++) {
                                }
                                if (var195 < Statics.field383) {
                                    while (var195 < Statics.field383 - 1) {
                                        Statics.field2337[var195] = Statics.field2337[var195 + 1];
                                        var195++;
                                    }
                                    Statics.field383--;
                                    Statics.field2337[Statics.field383] = null;
                                }
                            } else {
                                field507.method2515();
                                class8 var196 = new class8();
                                var196.field130 = var190;
                                var196.field127 = class147.method136(var196.field130, Statics.field1255);
                                var196.field129 = var191;
                                var196.field126 = var192;
                                int var197;
                                for (var197 = Statics.field383 - 1; var197 >= 0; var197--) {
                                    int var198 = Statics.field2337[var197].field127.compareTo(var196.field130);
                                    if (var198 == 0) {
                                        Statics.field2337[var197].field129 = var191;
                                        Statics.field2337[var197].field126 = var192;
                                        if (var190.equals(Statics.field1623.field58)) {
                                            Statics.field1780 = var192;
                                        }
                                        field658 = field649;
                                        field657 = -1;
                                        var1 = true;
                                        break label2694;
                                    }
                                    if (var198 < 0) {
                                        break;
                                    }
                                }
                                if (Statics.field383 >= Statics.field2337.length) {
                                    field657 = -1;
                                    var1 = true;
                                    break label2694;
                                }
                                for (int var199 = Statics.field383 - 1; var199 > var197; var199--) {
                                    Statics.field2337[var199 + 1] = Statics.field2337[var199];
                                }
                                if (Statics.field383 == 0) {
                                    Statics.field2337 = new class8[100];
                                }
                                Statics.field2337[var197 + 1] = var196;
                                Statics.field383++;
                                if (var190.equals(Statics.field1623.field58)) {
                                    Statics.field1780 = var192;
                                }
                            }
                            field658 = field649;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 55) {
                            String var200 = field507.method2515();
                            long var201 = (long) field507.method2328();
                            long var203 = (long) field507.method2330();
                            int var205 = field507.method2326();
                            long var206 = (var201 << 32) + var203;
                            boolean var208 = false;
                            for (int var209 = 0; var209 < 100; var209++) {
                                if (field619[var209] == var206) {
                                    var208 = true;
                                    break;
                                }
                            }
                            if (method141(var200)) {
                                var208 = true;
                            }
                            if (!var208 && field478 == 0) {
                                field619[field533] = var206;
                                field533 = (field533 + 1) % 100;
                                String var210 = class183.method3229(class146.method159(class182.method2092(field507)));
                                if (var205 == 2 || var205 == 3) {
                                    method56(7, class2.method122(1) + var200, var210);
                                } else if (var205 == 1) {
                                    method56(7, class2.method122(0) + var200, var210);
                                } else {
                                    method56(3, var200, var210);
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 20) {
                            byte var211 = field507.method2353();
                            int var212 = field507.method2328();
                            class157.field2645[var212] = var211;
                            if (class157.field2649[var212] != var211) {
                                class157.field2649[var212] = var211;
                                method61(var212);
                            }
                            field650[++field651 - 1 & 0x1F] = var212;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 151) {
                            field593 = 0;
                            field588 = 0;
                            Statics.method787();
                            method59();
                            method1321();
                            for (int var213 = 0; var213 < field588; var213++) {
                                int var214 = field703[var213];
                                class3 var215 = field562[var214];
                                int var216 = field507.method2326();
                                if ((var216 & 0x40) != 0) {
                                    var216 += field507.method2326() << 8;
                                }
                                if ((var216 & 0x4) != 0) {
                                    var215.field429 = field507.method2328();
                                    var215.field448 = field507.method2328();
                                }
                                if ((var216 & 0x80) != 0) {
                                    var215.field428 = field507.method2360();
                                    if (var215.field428 == 65535) {
                                        var215.field428 = -1;
                                    }
                                }
                                if ((var216 & 0x20) != 0) {
                                    var215.field456 = field507.method2515();
                                    if (var215.field456.charAt(0) == '~') {
                                        var215.field456 = var215.field456.substring(1);
                                        method56(2, var215.field58, var215.field456);
                                    } else if (Statics.field1623 == var215) {
                                        method56(2, var215.field58, var215.field456);
                                    }
                                    var215.field438 = 0;
                                    var215.field420 = 0;
                                    var215.field419 = 150;
                                }
                                if ((var216 & 0x1) != 0) {
                                    int var217 = field507.method2351();
                                    byte[] var218 = new byte[var217];
                                    class125 var219 = new class125(var218);
                                    field507.method2311(var218, 0, var217);
                                    field565[var214] = var219;
                                    var215.method17(var219);
                                }
                                if ((var216 & 0x100) != 0) {
                                    var215.field447 = field507.method2358();
                                    int var220 = field507.method2367();
                                    var215.field443 = var220 >> 16;
                                    var215.field442 = (var220 & 0xFFFF) + field516;
                                    var215.field440 = 0;
                                    var215.field441 = 0;
                                    if (var215.field442 > field516) {
                                        var215.field440 = -1;
                                    }
                                    if (var215.field447 == 65535) {
                                        var215.field447 = -1;
                                    }
                                }
                                if ((var216 & 0x200) != 0) {
                                    int var221 = field507.method2326();
                                    int var222 = field507.method2313();
                                    var215.method242(var221, var222, field516);
                                    var215.field425 = field516 + 300;
                                    var215.field426 = field507.method2313();
                                    var215.field427 = field507.method2313();
                                }
                                if ((var216 & 0x2) != 0) {
                                    int var223 = field507.method2328();
                                    if (var223 == 65535) {
                                        var223 = -1;
                                    }
                                    int var224 = field507.method2352();
                                    Statics.method773(var215, var223, var224);
                                }
                                if ((var216 & 0x400) != 0) {
                                    var215.field435 = field507.method2352();
                                    var215.field432 = field507.method2313();
                                    var215.field444 = field507.method2351();
                                    var215.field421 = field507.method2351();
                                    var215.field445 = field507.method2359() + field516;
                                    var215.field449 = field507.method2359() + field516;
                                    var215.field450 = field507.method2351();
                                    var215.field462 = 1;
                                    var215.field439 = 0;
                                }
                                if ((var216 & 0x10) != 0) {
                                    int var225 = field507.method2351();
                                    int var226 = field507.method2351();
                                    var215.method242(var225, var226, field516);
                                    var215.field425 = field516 + 300;
                                    var215.field426 = field507.method2351();
                                    var215.field427 = field507.method2313();
                                }
                                if ((var216 & 0x8) != 0) {
                                    int var227 = field507.method2358();
                                    int var228 = field507.method2326();
                                    int var229 = field507.method2313();
                                    int var230 = field507.field2003;
                                    if (var215.field58 != null && var215.field43 != null) {
                                        boolean var231 = false;
                                        if (var228 <= 1 && method141(var215.field58)) {
                                            var231 = true;
                                        }
                                        if (!var231 && field478 == 0) {
                                            field492.field2003 = 0;
                                            field507.method2369(field492.field2002, 0, var229);
                                            field492.field2003 = 0;
                                            String var232 = class183.method3229(class146.method159(class182.method2092(field492)));
                                            var215.field456 = var232.trim();
                                            var215.field438 = var227 >> 8;
                                            var215.field420 = var227 & 0xFF;
                                            var215.field419 = 150;
                                            if (var228 == 2 || var228 == 3) {
                                                method56(1, class2.method122(1) + var215.field58, var232);
                                            } else if (var228 == 1) {
                                                method56(1, class2.method122(0) + var215.field58, var232);
                                            } else {
                                                method56(2, var215.field58, var232);
                                            }
                                        }
                                    }
                                    field507.field2003 = var229 + var230;
                                }
                            }
                            for (int var233 = 0; var233 < field593; var233++) {
                                int var234 = field594[var233];
                                if (field516 != field562[var234].field451) {
                                    field562[var234] = null;
                                }
                            }
                            if (field508 != field507.field2003) {
                                throw new RuntimeException(field507.field2003 + class2.field24 + field508);
                            }
                            for (int var235 = 0; var235 < field677; var235++) {
                                if (field562[field587[var235]] == null) {
                                    throw new RuntimeException(var235 + class2.field24 + field677);
                                }
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 226) {
                            int var236 = field507.method2489();
                            class156 var237 = class156.method2702(var236);
                            for (int var238 = 0; var238 < var237.field2630.length; var238++) {
                                var237.field2630[var238] = -1;
                                var237.field2630[var238] = 0;
                            }
                            method166(var237);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 96) {
                            int var239 = field507.method2367();
                            int var240 = field507.method2360();
                            class157.field2645[var240] = var239;
                            if (class157.field2649[var240] != var239) {
                                class157.field2649[var240] = var239;
                                method61(var240);
                            }
                            field650[++field651 - 1 & 0x1F] = var240;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 5) {
                            int var241 = field507.method2359();
                            int var242 = field507.method2328();
                            int var243 = field507.method2489();
                            class156 var244 = class156.method2702(var243);
                            var244.field2572 = (var241 << 16) + var242;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 125) {
                            method126();
                            field657 = -1;
                            var1 = false;
                            break label2694;
                        }
                        if (field657 == 28) {
                            Statics.field431 = field507.method2313();
                            Statics.field265 = field507.method2352();
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 148) {
                            int var245 = field507.method2359();
                            class18 var246 = (class18) class18.field276.method3129((long) var245);
                            if (var246 != null) {
                                var246.method3182();
                            }
                            field652[++field705 - 1 & 0x1F] = var245 & 0x7FFF;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 2) {
                            int var247 = field507.method2359();
                            int var248 = field507.method2358();
                            int var249 = field507.method2359();
                            int var250 = field507.method2378();
                            class156 var251 = class156.method2702(var250);
                            if (var251.field2568 != var249 || var251.field2569 != var248 || var251.field2581 != var247) {
                                var251.field2568 = var249;
                                var251.field2569 = var248;
                                var251.field2581 = var247;
                                method166(var251);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 133) {
                            String var252 = field507.method2515();
                            Object[] var253 = new Object[var252.length() + 1];
                            for (int var254 = var252.length() - 1; var254 >= 0; var254--) {
                                if (var252.charAt(var254) == 's') {
                                    var253[var254 + 1] = field507.method2515();
                                } else {
                                    var253[var254 + 1] = Integer.valueOf(field507.method2489());
                                }
                            }
                            var253[0] = Integer.valueOf(field507.method2489());
                            class1 var255 = new class1();
                            var255.field4 = var253;
                            class25.method790(var255);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 91) {
                            int var256 = field507.method2313();
                            String var257 = field507.method2515();
                            int var258 = field507.method2313();
                            if (var256 >= 1 && var256 <= 8) {
                                if (var257.equalsIgnoreCase("null")) {
                                    var257 = null;
                                }
                                field719[var256 - 1] = var257;
                                field597[var256 - 1] = var258 == 0;
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 186) {
                            class180.method247(field507, field508);
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 124) {
                            field532 = field507.method2326();
                            field684 = field507.method2326();
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 1) {
                            field711 = false;
                            for (int var259 = 0; var259 < 5; var259++) {
                                field712[var259] = false;
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 106) {
                            int var260 = field507.method2326();
                            class136[] var261 = class136.method2292();
                            int var262 = 0;
                            class136 var264;
                            while (true) {
                                if (var262 >= var261.length) {
                                    var264 = null;
                                    break;
                                }
                                class136 var263 = var261[var262];
                                if (var263.field2306 == var260) {
                                    var264 = var263;
                                    break;
                                }
                                var262++;
                            }
                            Statics.field2038 = var264;
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 131) {
                            method1320();
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        if (field657 == 81) {
                            if (field485 != -1) {
                                method3(field485, 0);
                            }
                            field657 = -1;
                            var1 = true;
                            break label2694;
                        }
                        class79.method848("" + field657 + class2.field24 + field514 + class2.field24 + field515 + class2.field24 + field508, (Throwable) null);
                        method126();
                    } catch (IOException var374) {
                        if (field512 > 0) {
                            method126();
                        } else {
                            method119(40);
                            Statics.field402 = Statics.field82;
                            Statics.field82 = null;
                        }
                    } catch (Exception var375) {
                        String var267 = "" + field657 + class2.field24 + field514 + class2.field24 + field515 + class2.field24 + field508 + class2.field24 + (Statics.field1738 + Statics.field1623.field457[0]) + class2.field24 + (Statics.field277 + Statics.field1623.field458[0]) + class2.field24;
                        for (int var268 = 0; var268 < field508 && var268 < 50; var268++) {
                            var267 = var267 + field507.field2002[var268] + class2.field24;
                        }
                        class79.method848(var267, var375);
                        method126();
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
        class180.method528(field505, 149);
        Object var269 = Statics.field2383.field246;
        synchronized (Statics.field2383.field246) {
            if (!field466) {
                Statics.field2383.field245 = 0;
            } else if (class76.field1374 != 0 || Statics.field2383.field245 >= 40) {
                field505.method2198(249);
                field505.method2339(0);
                int var270 = field505.field2003;
                int var271 = 0;
                for (int var272 = 0; var272 < Statics.field2383.field245 && field505.field2003 - var270 < 240; var272++) {
                    var271++;
                    int var273 = Statics.field2383.field249[var272];
                    if (var273 < 0) {
                        var273 = 0;
                    } else if (var273 > 502) {
                        var273 = 502;
                    }
                    int var274 = Statics.field2383.field248[var272];
                    if (var274 < 0) {
                        var274 = 0;
                    } else if (var274 > 764) {
                        var274 = 764;
                    }
                    int var275 = var273 * 765 + var274;
                    if (Statics.field2383.field249[var272] == -1 && Statics.field2383.field248[var272] == -1) {
                        var274 = -1;
                        var273 = -1;
                        var275 = 524287;
                    }
                    if (field523 != var274 || field479 != var273) {
                        int var276 = var274 - field523;
                        field523 = var274;
                        int var277 = var273 - field479;
                        field479 = var273;
                        if (field480 < 8 && var276 >= -32 && var276 <= 31 && var277 >= -32 && var277 <= 31) {
                            var276 += 32;
                            var277 += 32;
                            field505.method2314((field480 << 12) + (var276 << 6) + var277);
                            field480 = 0;
                        } else if (field480 < 8) {
                            field505.method2332((field480 << 19) + 8388608 + var275);
                            field480 = 0;
                        } else {
                            field505.method2316((field480 << 19) + -1073741824 + var275);
                            field480 = 0;
                        }
                    } else if (field480 < 2047) {
                        field480++;
                    }
                }
                field505.method2323(field505.field2003 - var270);
                if (var271 >= Statics.field2383.field245) {
                    Statics.field2383.field245 = 0;
                } else {
                    Statics.field2383.field245 -= var271;
                    for (int var278 = 0; var278 < Statics.field2383.field245; var278++) {
                        Statics.field2383.field248[var278] = Statics.field2383.field248[var271 + var278];
                        Statics.field2383.field249[var278] = Statics.field2383.field249[var271 + var278];
                    }
                }
            }
        }
        if (class76.field1374 != 0) {
            long var280 = (class76.field1362 - field476) / 50L;
            if (var280 > 4095L) {
                var280 = 4095L;
            }
            field476 = class76.field1362;
            int var282 = class76.field1373;
            if (var282 < 0) {
                var282 = 0;
            } else if (var282 > 502) {
                var282 = 502;
            }
            int var283 = class76.field1372;
            if (var283 < 0) {
                var283 = 0;
            } else if (var283 > 764) {
                var283 = 764;
            }
            int var284 = var282 * 765 + var283;
            byte var285 = 0;
            if (class76.field1374 == 2) {
                var285 = 1;
            }
            int var286 = (int) var280;
            field505.method2198(2);
            field505.method2363((var285 << 19) + (var286 << 20) + var284);
        }
        if (field629 > 0) {
            field629--;
        }
        if (class74.field1326[96] || class74.field1326[97] || class74.field1326[98] || class74.field1326[99]) {
            field556 = true;
        }
        if (field556 && field629 <= 0) {
            field629 = 20;
            field556 = false;
            field505.method2198(222);
            field505.method2314(field552);
            field505.method2314(field551);
        }
        if (Statics.field1029 && !field715) {
            field715 = true;
            field505.method2198(172);
            field505.method2339(1);
        }
        if (!Statics.field1029 && field715) {
            field715 = false;
            field505.method2198(172);
            field505.method2339(0);
        }
        method224();
        if (field474 != 30) {
            return;
        }
        for (class21 var287 = (class21) field591.method3145(); var287 != null; var287 = (class21) field591.method3154()) {
            if (var287.field350 > 0) {
                var287.field350--;
            }
            if (var287.field350 != 0) {
                if (var287.field354 > 0) {
                    var287.field354--;
                }
                if (var287.field354 == 0 && var287.field341 >= 1 && var287.field342 >= 1 && var287.field341 <= 102 && var287.field342 <= 102 && (var287.field346 < 0 || class9.method2903(var287.field346, var287.field348))) {
                    method2233(var287.field349, var287.field345, var287.field341, var287.field342, var287.field346, var287.field340, var287.field348);
                    var287.field354 = -1;
                    if (var287.field346 == var287.field343 && var287.field343 == -1) {
                        var287.method3182();
                    } else if (var287.field346 == var287.field343 && var287.field344 == var287.field340 && var287.field351 == var287.field348) {
                        var287.method3182();
                    }
                }
            } else if (var287.field343 < 0 || class9.method2903(var287.field343, var287.field351)) {
                method2233(var287.field349, var287.field345, var287.field341, var287.field342, var287.field343, var287.field344, var287.field351);
                var287.method3182();
            }
        }
        method31();
        field510++;
        if (field510 <= 750) {
            for (int var288 = -1; var288 < field677; var288++) {
                int var289;
                if (var288 == -1) {
                    var289 = 2047;
                } else {
                    var289 = field587[var288];
                }
                class3 var290 = field562[var289];
                if (var290 != null) {
                    method24(var290, 1);
                }
            }
            method1514();
            for (int var291 = -1; var291 < field677; var291++) {
                int var292;
                if (var291 == -1) {
                    var292 = 2047;
                } else {
                    var292 = field587[var291];
                }
                class3 var293 = field562[var292];
                if (var293 != null && var293.field419 > 0) {
                    var293.field419--;
                    if (var293.field419 == 0) {
                        var293.field456 = null;
                    }
                }
            }
            for (int var294 = 0; var294 < field503; var294++) {
                int var295 = field696[var294];
                class24 var296 = field681[var295];
                if (var296 != null && var296.field419 > 0) {
                    var296.field419--;
                    if (var296.field419 == 0) {
                        var296.field456 = null;
                    }
                }
            }
            field544++;
            if (field563 != 0) {
                field511 += 20;
                if (field511 >= 400) {
                    field563 = 0;
                }
            }
            if (Statics.field1411 != null) {
                field626++;
                if (field626 >= 15) {
                    method166(Statics.field1411);
                    Statics.field1411 = null;
                }
            }
            if (Statics.field731 != null) {
                method166(Statics.field731);
                field583++;
                if (class76.field1365 > field555 + 5 || class76.field1365 < field555 - 5 || class76.field1369 > field580 + 5 || class76.field1369 < field580 - 5) {
                    field582 = true;
                }
                if (class76.field1364 == 0) {
                    if (!field582 || field583 < 5) {
                        label2865: {
                            label2015: {
                                if (field471 != 1) {
                                    int var303 = field608 - 1;
                                    boolean var304;
                                    if (var303 < 0) {
                                        var304 = false;
                                    } else {
                                        int var305 = field576[var303];
                                        if (var305 >= 2000) {
                                            var305 -= 2000;
                                        }
                                        if (var305 == 1007) {
                                            var304 = true;
                                        } else {
                                            var304 = false;
                                        }
                                    }
                                    if (!var304) {
                                        break label2015;
                                    }
                                }
                                if (field608 > 2) {
                                    method703();
                                    break label2865;
                                }
                            }
                            if (field608 > 0) {
                                method2252(field608 - 1);
                            }
                        }
                    } else if (Statics.field731 == Statics.field2294 && field578 != field573) {
                        class156 var297 = Statics.field731;
                        byte var298 = 0;
                        if (field600 == 1 && var297.field2532 == 206) {
                            var298 = 1;
                        }
                        if (var297.field2630[field573] <= 0) {
                            var298 = 0;
                        }
                        if (class160.method2258(method2194(var297))) {
                            int var299 = field578;
                            int var300 = field573;
                            var297.field2630[var300] = var297.field2630[var299];
                            var297.field2631[var300] = var297.field2631[var299];
                            var297.field2630[var299] = -1;
                            var297.field2631[var299] = 0;
                        } else if (var298 == 1) {
                            int var301 = field578;
                            int var302 = field573;
                            while (var301 != var302) {
                                if (var301 > var302) {
                                    var297.method2953(var301 - 1, var301);
                                    var301--;
                                } else if (var301 < var302) {
                                    var297.method2953(var301 + 1, var301);
                                    var301++;
                                }
                            }
                        } else {
                            var297.method2953(field573, field578);
                        }
                        field505.method2198(65);
                        field505.method2357(field578);
                        field505.method2365(Statics.field731.field2528);
                        field505.method2494(var298);
                        field505.method2314(field573);
                    }
                    field626 = 10;
                    class76.field1374 = 0;
                    Statics.field731 = null;
                }
            }
            class156 var306 = Statics.field7;
            class156 var307 = Statics.field1325;
            Statics.field7 = null;
            Statics.field1325 = null;
            field641 = null;
            field645 = false;
            field502 = false;
            for (field687 = 0; class74.method203() && field687 < 128; field687++) {
                field689[field687] = Statics.field1643;
                field590[field687] = Statics.field1957;
            }
            int var308 = field485;
            if (class156.method1920(var308)) {
                method836(Statics.field2632[var308], -1, 0, 0, 765, 503, 0, 0);
            }
            field649++;
            while (true) {
                class1 var309;
                class156 var310;
                class156 var311;
                do {
                    var309 = (class1) field664.method3150();
                    if (var309 == null) {
                        while (true) {
                            class1 var312;
                            class156 var313;
                            class156 var314;
                            do {
                                var312 = (class1) field665.method3150();
                                if (var312 == null) {
                                    while (true) {
                                        class1 var315;
                                        class156 var316;
                                        class156 var317;
                                        do {
                                            var315 = (class1) field663.method3150();
                                            if (var315 == null) {
                                                if (field598 != null) {
                                                    method200();
                                                }
                                                if (class94.field1558 != -1) {
                                                    int var318 = class94.field1558;
                                                    int var319 = class94.field1559;
                                                    boolean var320 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var318, var319, true, 0, 0, 0, 0, 0, 0);
                                                    class94.field1558 = -1;
                                                    if (var320) {
                                                        field572 = class76.field1372;
                                                        field519 = class76.field1373;
                                                        field563 = 1;
                                                        field511 = 0;
                                                    }
                                                }
                                                if (Statics.field731 == null && field598 == null) {
                                                    int var321 = class76.field1374;
                                                    if (field607) {
                                                        if (var321 != 1) {
                                                            int var322 = class76.field1365;
                                                            int var323 = class76.field1369;
                                                            if (var322 < Statics.field1356 - 10 || var322 > Statics.field367 + Statics.field1356 + 10 || var323 < Statics.field1358 - 10 || var323 > Statics.field269 + Statics.field1358 + 10) {
                                                                field607 = false;
                                                                method1577(Statics.field1356, Statics.field1358, Statics.field367, Statics.field269);
                                                            }
                                                        }
                                                        if (var321 == 1) {
                                                            int var324 = Statics.field1356;
                                                            int var325 = Statics.field1358;
                                                            int var326 = Statics.field367;
                                                            int var327 = class76.field1372;
                                                            int var328 = class76.field1373;
                                                            int var329 = -1;
                                                            for (int var330 = 0; var330 < field608; var330++) {
                                                                int var331 = (field608 - 1 - var330) * 15 + var325 + 31;
                                                                if (var327 > var324 && var327 < var324 + var326 && var328 > var331 - 13 && var328 < var331 + 3) {
                                                                    var329 = var330;
                                                                }
                                                            }
                                                            if (var329 != -1) {
                                                                method2252(var329);
                                                            }
                                                            field607 = false;
                                                            method1577(Statics.field1356, Statics.field1358, Statics.field367, Statics.field269);
                                                        }
                                                    } else {
                                                        label2895: {
                                                            if (var321 == 1 && field608 > 0) {
                                                                int var332 = field576[field608 - 1];
                                                                if (var332 == 39 || var332 == 40 || var332 == 41 || var332 == 42 || var332 == 43 || var332 == 33 || var332 == 34 || var332 == 35 || var332 == 36 || var332 == 37 || var332 == 38 || var332 == 1005) {
                                                                    int var333 = field609[field608 - 1];
                                                                    int var334 = field610[field608 - 1];
                                                                    class156 var335 = class156.method2702(var334);
                                                                    if (class160.method1560(method2194(var335)) || class160.method2258(method2194(var335))) {
                                                                        field582 = false;
                                                                        field583 = 0;
                                                                        if (Statics.field731 != null) {
                                                                            method166(Statics.field731);
                                                                        }
                                                                        Statics.field731 = class156.method2702(var334);
                                                                        field578 = var333;
                                                                        field555 = class76.field1372;
                                                                        field580 = class76.field1373;
                                                                        method166(Statics.field731);
                                                                        break label2895;
                                                                    }
                                                                }
                                                            }
                                                            if (var321 == 1) {
                                                                label2880: {
                                                                    if (field471 != 1 || field608 <= 2) {
                                                                        int var336 = field608 - 1;
                                                                        boolean var337;
                                                                        if (var336 < 0) {
                                                                            var337 = false;
                                                                        } else {
                                                                            int var338 = field576[var336];
                                                                            if (var338 >= 2000) {
                                                                                var338 -= 2000;
                                                                            }
                                                                            if (var338 == 1007) {
                                                                                var337 = true;
                                                                            } else {
                                                                                var337 = false;
                                                                            }
                                                                        }
                                                                        if (!var337) {
                                                                            break label2880;
                                                                        }
                                                                    }
                                                                    var321 = 2;
                                                                }
                                                            }
                                                            if (var321 == 1 && field608 > 0) {
                                                                method2252(field608 - 1);
                                                            }
                                                            if (var321 == 2 && field608 > 0) {
                                                                method703();
                                                            }
                                                        }
                                                    }
                                                }
                                                if (Statics.field7 != var306) {
                                                    if (var306 != null) {
                                                        method166(var306);
                                                    }
                                                    if (Statics.field7 != null) {
                                                        method166(Statics.field7);
                                                    }
                                                }
                                                if (Statics.field1325 != var307 && field618 == field617) {
                                                    if (var307 != null) {
                                                        method166(var307);
                                                    }
                                                    if (Statics.field1325 != null) {
                                                        method166(Statics.field1325);
                                                    }
                                                }
                                                if (Statics.field1325 == null) {
                                                    if (field617 > 0) {
                                                        field617--;
                                                    }
                                                } else if (field617 < field618) {
                                                    field617++;
                                                    if (field618 == field617) {
                                                        method166(Statics.field1325);
                                                    }
                                                }
                                                int var339 = field506 + Statics.field1623.field446;
                                                int var340 = field686 + Statics.field1623.field406;
                                                if (Statics.field2305 - var339 < -500 || Statics.field2305 - var339 > 500 || Statics.field353 - var340 < -500 || Statics.field353 - var340 > 500) {
                                                    Statics.field2305 = var339;
                                                    Statics.field353 = var340;
                                                }
                                                if (Statics.field2305 != var339) {
                                                    Statics.field2305 += (var339 - Statics.field2305) / 16;
                                                }
                                                if (Statics.field353 != var340) {
                                                    Statics.field353 += (var340 - Statics.field353) / 16;
                                                }
                                                if (class74.field1326[96]) {
                                                    field553 += (-24 - field553) / 2;
                                                } else if (class74.field1326[97]) {
                                                    field553 += (24 - field553) / 2;
                                                } else {
                                                    field553 /= 2;
                                                }
                                                if (class74.field1326[98]) {
                                                    field688 += (12 - field688) / 2;
                                                } else if (class74.field1326[99]) {
                                                    field688 += (-12 - field688) / 2;
                                                } else {
                                                    field688 /= 2;
                                                }
                                                field552 = field553 / 2 + field552 & 0x7FF;
                                                field551 += field688 / 2;
                                                if (field551 < 128) {
                                                    field551 = 128;
                                                }
                                                if (field551 > 383) {
                                                    field551 = 383;
                                                }
                                                int var341 = Statics.field2305 >> 7;
                                                int var342 = Statics.field353 >> 7;
                                                int var343 = method505(Statics.field2305, Statics.field353, Statics.field208);
                                                int var344 = 0;
                                                if (var341 > 3 && var342 > 3 && var341 < 100 && var342 < 100) {
                                                    for (int var345 = var341 - 4; var345 <= var341 + 4; var345++) {
                                                        for (int var346 = var342 - 4; var346 <= var342 + 4; var346++) {
                                                            int var347 = Statics.field208;
                                                            if (var347 < 3 && (class9.field143[1][var345][var346] & 0x2) == 2) {
                                                                var347++;
                                                            }
                                                            int var348 = var343 - class9.field157[var347][var345][var346];
                                                            if (var348 > var344) {
                                                                var344 = var348;
                                                            }
                                                        }
                                                    }
                                                }
                                                int var349 = var344 * 192;
                                                if (var349 > 98048) {
                                                    var349 = 98048;
                                                }
                                                if (var349 < 32768) {
                                                    var349 = 32768;
                                                }
                                                if (var349 > field504) {
                                                    field504 += (var349 - field504) / 24;
                                                } else if (var349 < field504) {
                                                    field504 += (var349 - field504) / 80;
                                                }
                                                if (field711) {
                                                    int var350 = Statics.field62 * 128 + 64;
                                                    int var351 = Statics.field1282 * 128 + 64;
                                                    int var352 = method505(var350, var351, Statics.field208) - Statics.field192;
                                                    if (Statics.field1492 < var350) {
                                                        Statics.field1492 += Statics.field1270 * (var350 - Statics.field1492) / 1000 + Statics.field2291;
                                                        if (Statics.field1492 > var350) {
                                                            Statics.field1492 = var350;
                                                        }
                                                    }
                                                    if (Statics.field1492 > var350) {
                                                        Statics.field1492 -= Statics.field1270 * (Statics.field1492 - var350) / 1000 + Statics.field2291;
                                                        if (Statics.field1492 < var350) {
                                                            Statics.field1492 = var350;
                                                        }
                                                    }
                                                    if (Statics.field1407 < var352) {
                                                        Statics.field1407 += Statics.field1270 * (var352 - Statics.field1407) / 1000 + Statics.field2291;
                                                        if (Statics.field1407 > var352) {
                                                            Statics.field1407 = var352;
                                                        }
                                                    }
                                                    if (Statics.field1407 > var352) {
                                                        Statics.field1407 -= Statics.field1270 * (Statics.field1407 - var352) / 1000 + Statics.field2291;
                                                        if (Statics.field1407 < var352) {
                                                            Statics.field1407 = var352;
                                                        }
                                                    }
                                                    if (Statics.field361 < var351) {
                                                        Statics.field361 += Statics.field1270 * (var351 - Statics.field361) / 1000 + Statics.field2291;
                                                        if (Statics.field361 > var351) {
                                                            Statics.field361 = var351;
                                                        }
                                                    }
                                                    if (Statics.field361 > var351) {
                                                        Statics.field361 -= Statics.field1270 * (Statics.field361 - var351) / 1000 + Statics.field2291;
                                                        if (Statics.field361 < var351) {
                                                            Statics.field361 = var351;
                                                        }
                                                    }
                                                    int var353 = Statics.field258 * 128 + 64;
                                                    int var354 = Statics.field221 * 128 + 64;
                                                    int var355 = method505(var353, var354, Statics.field208) - Statics.field293;
                                                    int var356 = var353 - Statics.field1492;
                                                    int var357 = var355 - Statics.field1407;
                                                    int var358 = var354 - Statics.field361;
                                                    int var359 = (int) Math.sqrt((double) (var356 * var356 + var358 * var358));
                                                    int var360 = (int) (Math.atan2((double) var357, (double) var359) * 325.949D) & 0x7FF;
                                                    int var361 = (int) (Math.atan2((double) var356, (double) var358) * -325.949D) & 0x7FF;
                                                    if (var360 < 128) {
                                                        var360 = 128;
                                                    }
                                                    if (var360 > 383) {
                                                        var360 = 383;
                                                    }
                                                    if (Statics.field1262 < var360) {
                                                        Statics.field1262 += Statics.field1832 * (var360 - Statics.field1262) / 1000 + Statics.field242;
                                                        if (Statics.field1262 > var360) {
                                                            Statics.field1262 = var360;
                                                        }
                                                    }
                                                    if (Statics.field1262 > var360) {
                                                        Statics.field1262 -= Statics.field1832 * (Statics.field1262 - var360) / 1000 + Statics.field242;
                                                        if (Statics.field1262 < var360) {
                                                            Statics.field1262 = var360;
                                                        }
                                                    }
                                                    int var362 = var361 - Statics.field17;
                                                    if (var362 > 1024) {
                                                        var362 -= 2048;
                                                    }
                                                    if (var362 < -1024) {
                                                        var362 += 2048;
                                                    }
                                                    if (var362 > 0) {
                                                        Statics.field17 += Statics.field1832 * var362 / 1000 + Statics.field242;
                                                        Statics.field17 &= 0x7FF;
                                                    }
                                                    if (var362 < 0) {
                                                        Statics.field17 -= Statics.field1832 * -var362 / 1000 + Statics.field242;
                                                        Statics.field17 &= 0x7FF;
                                                    }
                                                    int var363 = var361 - Statics.field17;
                                                    if (var363 > 1024) {
                                                        var363 -= 2048;
                                                    }
                                                    if (var363 < -1024) {
                                                        var363 += 2048;
                                                    }
                                                    if (var363 < 0 && var362 > 0 || var363 > 0 && var362 < 0) {
                                                        Statics.field17 = var361;
                                                    }
                                                }
                                                for (int var364 = 0; var364 < 5; var364++) {
                                                    int var10002 = field716[var364]++;
                                                }
                                                int var365 = ++class76.field1360 - 1;
                                                int var367 = class74.method1400();
                                                if (var365 > 15000 && var367 > 15000) {
                                                    field512 = 250;
                                                    class76.field1360 = 14500;
                                                    field505.method2198(68);
                                                }
                                                field546++;
                                                if (field546 > 500) {
                                                    field546 = 0;
                                                    int var368 = (int) (Math.random() * 8.0D);
                                                    if ((var368 & 0x1) == 1) {
                                                        field506 += field700;
                                                    }
                                                    if ((var368 & 0x2) == 2) {
                                                        field686 += field535;
                                                    }
                                                    if ((var368 & 0x4) == 4) {
                                                        field536 += field537;
                                                    }
                                                }
                                                if (field506 < -50) {
                                                    field700 = 2;
                                                }
                                                if (field506 > 50) {
                                                    field700 = -2;
                                                }
                                                if (field686 < -55) {
                                                    field535 = 2;
                                                }
                                                if (field686 > 55) {
                                                    field535 = -2;
                                                }
                                                if (field536 < -40) {
                                                    field537 = 1;
                                                }
                                                if (field536 > 40) {
                                                    field537 = -1;
                                                }
                                                field543++;
                                                if (field543 > 500) {
                                                    field543 = 0;
                                                    int var369 = (int) (Math.random() * 8.0D);
                                                    if ((var369 & 0x1) == 1) {
                                                        field477 += field540;
                                                    }
                                                    if ((var369 & 0x2) == 2) {
                                                        field661 += field577;
                                                    }
                                                }
                                                if (field477 < -60) {
                                                    field540 = 2;
                                                }
                                                if (field477 > 60) {
                                                    field540 = -2;
                                                }
                                                if (field661 < -20) {
                                                    field577 = 1;
                                                }
                                                if (field661 > 10) {
                                                    field577 = -1;
                                                }
                                                for (class27 var370 = (class27) field720.method3119(); var370 != null; var370 = (class27) field720.method3120()) {
                                                    if ((long) var370.field730 < class120.method774() / 1000L - 5L) {
                                                        if (var370.field735 > 0) {
                                                            method56(5, "", var370.field728 + class133.field2193);
                                                        }
                                                        if (var370.field735 == 0) {
                                                            method56(5, "", var370.field728 + class133.field2194);
                                                        }
                                                        var370.method3178();
                                                    }
                                                }
                                                field557++;
                                                if (field557 > 50) {
                                                    field505.method2198(177);
                                                }
                                                try {
                                                    if (Statics.field82 != null && field505.field2003 > 0) {
                                                        Statics.field82.method1328(field505.field2002, 0, field505.field2003);
                                                        field505.field2003 = 0;
                                                        field557 = 0;
                                                    }
                                                } catch (IOException var372) {
                                                    if (field512 > 0) {
                                                        method126();
                                                    } else {
                                                        method119(40);
                                                        Statics.field402 = Statics.field82;
                                                        Statics.field82 = null;
                                                    }
                                                }
                                                return;
                                            }
                                            var316 = var315.field2;
                                            if (var316.field2616 < 0) {
                                                break;
                                            }
                                            var317 = class156.method2702(var316.field2539);
                                        } while (var317 == null || var317.field2636 == null || var316.field2616 >= var317.field2636.length || var317.field2636[var316.field2616] != var316);
                                        class25.method790(var315);
                                    }
                                }
                                var313 = var312.field2;
                                if (var313.field2616 < 0) {
                                    break;
                                }
                                var314 = class156.method2702(var313.field2539);
                            } while (var314 == null || var314.field2636 == null || var313.field2616 >= var314.field2636.length || var314.field2636[var313.field2616] != var313);
                            class25.method790(var312);
                        }
                    }
                    var310 = var309.field2;
                    if (var310.field2616 < 0) {
                        break;
                    }
                    var311 = class156.method2702(var310.field2539);
                } while (var311 == null || var311.field2636 == null || var310.field2616 >= var311.field2636.length || var311.field2636[var310.field2616] != var310);
                class25.method790(var309);
            }
        } else if (field512 > 0) {
            method126();
        } else {
            method119(40);
            Statics.field402 = Statics.field82;
            Statics.field82 = null;
        }
    }

    @ObfuscatedName("bq.i(I)V")
    public static final void method1346() {
        if (Statics.field184 != null) {
            Statics.field184.method1105();
        }
        if (Statics.field1246 != null) {
            Statics.field1246.method1105();
        }
    }

    @ObfuscatedName("e.k(I)V")
    public static final void method31() {
        for (int var0 = 0; var0 < field695; var0++) {
            int var10002 = field708[var0]--;
            if (field708[var0] >= -10) {
                class56 var2 = field539[var0];
                if (var2 == null) {
                    class56 var10000 = (class56) null;
                    var2 = class56.method1216(Statics.field1237, field706[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field708[var0] += var2.method1213();
                    field539[var0] = var2;
                }
                if (field708[var0] < 0) {
                    int var9;
                    if (field575[var0] == 0) {
                        var9 = field596;
                    } else {
                        int var3 = (field575[var0] & 0xFF) * 128;
                        int var4 = field575[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field1623.field446;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field575[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field1623.field406;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field708[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field469 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class62 var10 = var2.method1211().method1278(Statics.field1967);
                        class44 var11 = class44.method907(var10, 100, var9);
                        var11.method910(field707[var0] - 1);
                        Statics.field61.method1054(var11);
                    }
                    field708[var0] = -100;
                }
            } else {
                field695--;
                for (int var1 = var0; var1 < field695; var1++) {
                    field706[var1] = field706[var1 + 1];
                    field539[var1] = field539[var1 + 1];
                    field707[var1] = field707[var1 + 1];
                    field708[var1] = field708[var1 + 1];
                    field575[var1] = field575[var1 + 1];
                }
                var0--;
            }
        }
        if (field702 && !class137.method1190()) {
            if (field538 != 0 && field701 != -1) {
                class137.method2564(Statics.field984, field701, 0, field538, false);
            }
            field702 = false;
        }
    }

    @ObfuscatedName("as.o(Lax;IIII)V")
    public static void method772(class33 arg0, int arg1, int arg2, int arg3) {
        if (field695 >= 50 || field469 == 0 || arg0.field869 == null || arg1 >= arg0.field869.length) {
            return;
        }
        int var4 = arg0.field869[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field706[field695] = var5;
        field707[field695] = var6;
        field708[field695] = 0;
        field539[field695] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field575[field695] = (var8 << 16) + (var9 << 8) + var7;
        field695++;
    }

    @ObfuscatedName("dr.d(IB)V")
    public static void method2115(int arg0) {
        if (arg0 == -1 && !field702) {
            Statics.field2012.method2610();
            class137.field2312 = 1;
            Statics.field2318 = null;
        } else if (arg0 != -1 && field701 != arg0 && field538 != 0 && !field702) {
            class137.method549(2, Statics.field984, arg0, 0, field538, false);
        }
        field701 = arg0;
    }

    @ObfuscatedName("s.u(IIB)V")
    public static void method60(int arg0, int arg1) {
        if (field538 != 0 && arg0 != -1) {
            class137.method2564(Statics.field373, arg0, 0, field538, false);
            field702 = true;
        }
    }

    @ObfuscatedName("o.ap(B)V")
    public static final void method224() {
        if (field528 && Statics.field208 != field517) {
            method207(Statics.field122, Statics.field1311, Statics.field208, Statics.field1623.field457[0], Statics.field1623.field458[0]);
        } else if (Statics.field208 != field692) {
            field692 = Statics.field208;
            int var0 = Statics.field208;
            int[] var1 = Statics.field347.field1449;
            int var2 = var1.length;
            for (int var3 = 0; var3 < var2; var3++) {
                var1[var3] = 0;
            }
            for (int var4 = 1; var4 < 103; var4++) {
                int var5 = (103 - var4) * 2048 + 24628;
                for (int var6 = 1; var6 < 103; var6++) {
                    if ((class9.field143[var0][var6][var4] & 0x18) == 0) {
                        Statics.field1310.method1798(var1, var5, 512, var0, var6, var4);
                    }
                    if (var0 < 3 && (class9.field143[var0 + 1][var6][var4] & 0x8) != 0) {
                        Statics.field1310.method1798(var1, var5, 512, var0 + 1, var6, var4);
                    }
                    var5 += 4;
                }
            }
            int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
            int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
            Statics.field347.method1598();
            for (int var9 = 1; var9 < 103; var9++) {
                for (int var10 = 1; var10 < 103; var10++) {
                    if ((class9.field143[var0][var10][var9] & 0x18) == 0) {
                        method2518(var0, var10, var9, var7, var8);
                    }
                    if (var0 < 3 && (class9.field143[var0 + 1][var10][var9] & 0x8) != 0) {
                        method2518(var0 + 1, var10, var9, var7, var8);
                    }
                }
            }
            field488 = 0;
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    int var13 = Statics.field1310.method1906(Statics.field208, var11, var12);
                    if (var13 != 0) {
                        int var14 = var13 >> 14 & 0x7FFF;
                        int var15 = class31.method2519(var14).field823;
                        if (var15 >= 0) {
                            int var16 = var11;
                            int var17 = var12;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var18 = field671[Statics.field208].field2694;
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
                            field542[field488] = Statics.field34[var15];
                            field694[field488] = var16;
                            field579[field488] = var17;
                            field488++;
                        }
                    }
                }
            }
            Statics.field1277.method1591();
        }
    }

    @ObfuscatedName("ba.ad(Ljava/lang/String;B)V")
    public static final void method1508(String arg0) {
        if (field569 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                if (field512 > 0) {
                    method126();
                } else {
                    method119(40);
                    Statics.field402 = Statics.field82;
                    Statics.field82 = null;
                }
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                field482 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                field482 = false;
            }
            if (arg0.equalsIgnoreCase("::noclip")) {
                for (int var1 = 0; var1 < 4; var1++) {
                    for (int var2 = 1; var2 < 103; var2++) {
                        for (int var3 = 1; var3 < 103; var3++) {
                            field671[var1].field2694[var2][var3] = 0;
                        }
                    }
                }
            }
            if (arg0.equalsIgnoreCase("::errortest") && field468 == 2) {
                throw new RuntimeException();
            }
        }
        field505.method2198(141);
        field505.method2339(arg0.length() - 1);
        field505.method2318(arg0.substring(2));
    }

    @ObfuscatedName("cd.ao(I)V")
    public static final void method1514() {
        for (int var0 = 0; var0 < field503; var0++) {
            int var1 = field696[var0];
            class24 var2 = field681[var1];
            if (var2 != null) {
                method24(var2, var2.field384.field766);
            }
        }
    }

    @ObfuscatedName("y.av(Lu;II)V")
    public static final void method24(class26 arg0, int arg1) {
        if (arg0.field445 > field516) {
            int var2 = arg0.field445 - field516;
            int var3 = arg0.field435 * 128 + arg0.field409 * 64;
            int var4 = arg0.field432 * 128 + arg0.field409 * 64;
            arg0.field446 += (var3 - arg0.field446) / var2;
            arg0.field406 += (var4 - arg0.field406) / var2;
            arg0.field460 = 0;
            if (arg0.field450 == 0) {
                arg0.field453 = 1024;
            }
            if (arg0.field450 == 1) {
                arg0.field453 = 1536;
            }
            if (arg0.field450 == 2) {
                arg0.field453 = 0;
            }
            if (arg0.field450 == 3) {
                arg0.field453 = 512;
            }
        } else if (arg0.field449 >= field516) {
            if (field516 == arg0.field449 || arg0.field434 == -1 || arg0.field437 != 0 || arg0.field415 + 1 > class33.method2589(arg0.field434).field864[arg0.field436]) {
                int var5 = arg0.field449 - arg0.field445;
                int var6 = field516 - arg0.field445;
                int var7 = arg0.field435 * 128 + arg0.field409 * 64;
                int var8 = arg0.field432 * 128 + arg0.field409 * 64;
                int var9 = arg0.field444 * 128 + arg0.field409 * 64;
                int var10 = arg0.field421 * 128 + arg0.field409 * 64;
                arg0.field446 = ((var5 - var6) * var7 + var6 * var9) / var5;
                arg0.field406 = ((var5 - var6) * var8 + var6 * var10) / var5;
            }
            arg0.field460 = 0;
            if (arg0.field450 == 0) {
                arg0.field453 = 1024;
            }
            if (arg0.field450 == 1) {
                arg0.field453 = 1536;
            }
            if (arg0.field450 == 2) {
                arg0.field453 = 0;
            }
            if (arg0.field450 == 3) {
                arg0.field453 = 512;
            }
            arg0.field407 = arg0.field453;
        } else {
            method54(arg0);
        }
        if (arg0.field446 < 128 || arg0.field406 < 128 || arg0.field446 >= 13184 || arg0.field406 >= 13184) {
            arg0.field434 = -1;
            arg0.field447 = -1;
            arg0.field445 = 0;
            arg0.field449 = 0;
            arg0.field446 = arg0.field457[0] * 128 + arg0.field409 * 64;
            arg0.field406 = arg0.field458[0] * 128 + arg0.field409 * 64;
            arg0.method244();
        }
        if (Statics.field1623 == arg0 && (arg0.field446 < 1536 || arg0.field406 < 1536 || arg0.field446 >= 11776 || arg0.field406 >= 11776)) {
            arg0.field434 = -1;
            arg0.field447 = -1;
            arg0.field445 = 0;
            arg0.field449 = 0;
            arg0.field446 = arg0.field457[0] * 128 + arg0.field409 * 64;
            arg0.field406 = arg0.field458[0] * 128 + arg0.field409 * 64;
            arg0.method244();
        }
        method35(arg0);
        method112(arg0);
    }

    @ObfuscatedName("m.af(Lu;I)V")
    public static final void method54(class26 arg0) {
        arg0.field463 = arg0.field430;
        if (arg0.field462 == 0) {
            arg0.field460 = 0;
            return;
        }
        if (arg0.field434 != -1 && arg0.field437 == 0) {
            class33 var1 = class33.method2589(arg0.field434);
            if (arg0.field439 > 0 && var1.field867 == 0) {
                arg0.field460++;
                return;
            }
            if (arg0.field439 <= 0 && var1.field874 == 0) {
                arg0.field460++;
                return;
            }
        }
        int var2 = arg0.field446;
        int var3 = arg0.field406;
        int var4 = arg0.field457[arg0.field462 - 1] * 128 + arg0.field409 * 64;
        int var5 = arg0.field458[arg0.field462 - 1] * 128 + arg0.field409 * 64;
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field446 = var4;
            arg0.field406 = var5;
            return;
        }
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field453 = 1280;
            } else if (var3 > var5) {
                arg0.field453 = 1792;
            } else {
                arg0.field453 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field453 = 768;
            } else if (var3 > var5) {
                arg0.field453 = 256;
            } else {
                arg0.field453 = 512;
            }
        } else if (var3 < var5) {
            arg0.field453 = 1024;
        } else if (var3 > var5) {
            arg0.field453 = 0;
        }
        int var6 = arg0.field453 - arg0.field407 & 0x7FF;
        if (var6 > 1024) {
            var6 -= 2048;
        }
        int var7 = arg0.field414;
        if (var6 >= -256 && var6 <= 256) {
            var7 = arg0.field413;
        } else if (var6 >= 256 && var6 < 768) {
            var7 = arg0.field416;
        } else if (var6 >= -768 && var6 <= -256) {
            var7 = arg0.field433;
        }
        if (var7 == -1) {
            var7 = arg0.field413;
        }
        arg0.field463 = var7;
        int var8 = 4;
        boolean var9 = true;
        if (arg0 instanceof class24) {
            var9 = ((class24) arg0).field384.field776;
        }
        if (var9) {
            if (arg0.field453 != arg0.field407 && arg0.field428 == -1 && arg0.field455 != 0) {
                var8 = 2;
            }
            if (arg0.field462 > 2) {
                var8 = 6;
            }
            if (arg0.field462 > 3) {
                var8 = 8;
            }
            if (arg0.field460 > 0 && arg0.field462 > 1) {
                var8 = 8;
                arg0.field460--;
            }
        } else {
            if (arg0.field462 > 1) {
                var8 = 6;
            }
            if (arg0.field462 > 2) {
                var8 = 8;
            }
            if (arg0.field460 > 0 && arg0.field462 > 1) {
                var8 = 8;
                arg0.field460--;
            }
        }
        if (arg0.field459[arg0.field462 - 1]) {
            var8 <<= 0x1;
        }
        if (var8 >= 8 && arg0.field463 == arg0.field413 && arg0.field417 != -1) {
            arg0.field463 = arg0.field417;
        }
        if (var2 < var4) {
            arg0.field446 += var8;
            if (arg0.field446 > var4) {
                arg0.field446 = var4;
            }
        } else if (var2 > var4) {
            arg0.field446 -= var8;
            if (arg0.field446 < var4) {
                arg0.field446 = var4;
            }
        }
        if (var3 < var5) {
            arg0.field406 += var8;
            if (arg0.field406 > var5) {
                arg0.field406 = var5;
            }
        } else if (var3 > var5) {
            arg0.field406 -= var8;
            if (arg0.field406 < var5) {
                arg0.field406 = var5;
            }
        }
        if (arg0.field446 == var4 && arg0.field406 == var5) {
            arg0.field462--;
            if (arg0.field439 > 0) {
                arg0.field439--;
            }
        }
    }

    @ObfuscatedName("m.ae(Lu;I)V")
    public static final void method35(class26 arg0) {
        if (arg0.field455 == 0) {
            return;
        }
        if (arg0.field428 != -1 && arg0.field428 < 32768) {
            class24 var1 = field681[arg0.field428];
            if (var1 != null) {
                int var2 = arg0.field446 - var1.field446;
                int var3 = arg0.field406 - var1.field406;
                if (var2 != 0 || var3 != 0) {
                    arg0.field453 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field428 >= 32768) {
            int var4 = arg0.field428 - 32768;
            if (field481 == var4) {
                var4 = 2047;
            }
            class3 var5 = field562[var4];
            if (var5 != null) {
                int var6 = arg0.field446 - var5.field446;
                int var7 = arg0.field406 - var5.field406;
                if (var6 != 0 || var7 != 0) {
                    arg0.field453 = (int) (Math.atan2((double) var6, (double) var7) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field429 != 0 || arg0.field448 != 0) && (arg0.field462 == 0 || arg0.field460 > 0)) {
            int var8 = arg0.field446 - (arg0.field429 * 64 - Statics.field1738 * 64 - Statics.field1738 * 64);
            int var9 = arg0.field406 - (arg0.field448 * 64 - Statics.field277 * 64 - Statics.field277 * 64);
            if (var8 != 0 || var9 != 0) {
                arg0.field453 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
            }
            arg0.field429 = 0;
            arg0.field448 = 0;
        }
        int var10 = arg0.field453 - arg0.field407 & 0x7FF;
        if (var10 == 0) {
            arg0.field454 = 0;
            return;
        }
        arg0.field454++;
        if (var10 > 1024) {
            arg0.field407 -= arg0.field455;
            boolean var11 = true;
            if (var10 < arg0.field455 || var10 > 2048 - arg0.field455) {
                arg0.field407 = arg0.field453;
                var11 = false;
            }
            if (arg0.field463 == arg0.field430 && (arg0.field454 > 25 || var11)) {
                if (arg0.field461 == -1) {
                    arg0.field463 = arg0.field413;
                } else {
                    arg0.field463 = arg0.field461;
                }
            }
        } else {
            arg0.field407 += arg0.field455;
            boolean var12 = true;
            if (var10 < arg0.field455 || var10 > 2048 - arg0.field455) {
                arg0.field407 = arg0.field453;
                var12 = false;
            }
            if (arg0.field463 == arg0.field430 && (arg0.field454 > 25 || var12)) {
                if (arg0.field412 == -1) {
                    arg0.field463 = arg0.field413;
                } else {
                    arg0.field463 = arg0.field412;
                }
            }
        }
        arg0.field407 &= 0x7FF;
    }

    @ObfuscatedName("r.ax(Lu;B)V")
    public static final void method112(class26 arg0) {
        arg0.field408 = false;
        if (arg0.field463 != -1) {
            class33 var1 = class33.method2589(arg0.field463);
            if (var1 == null || var1.field857 == null) {
                arg0.field463 = -1;
            } else {
                arg0.field452++;
                if (arg0.field410 < var1.field857.length && arg0.field452 > var1.field864[arg0.field410]) {
                    arg0.field452 = 1;
                    arg0.field410++;
                    method772(var1, arg0.field410, arg0.field446, arg0.field406);
                }
                if (arg0.field410 >= var1.field857.length) {
                    arg0.field452 = 0;
                    arg0.field410 = 0;
                    method772(var1, arg0.field410, arg0.field446, arg0.field406);
                }
            }
        }
        if (arg0.field447 != -1 && field516 >= arg0.field442) {
            if (arg0.field440 < 0) {
                arg0.field440 = 0;
            }
            int var2 = class34.method135(arg0.field447).field895;
            if (var2 == -1) {
                arg0.field447 = -1;
            } else {
                class33 var3 = class33.method2589(var2);
                if (var3 == null || var3.field857 == null) {
                    arg0.field447 = -1;
                } else {
                    arg0.field441++;
                    if (arg0.field440 < var3.field857.length && arg0.field441 > var3.field864[arg0.field440]) {
                        arg0.field441 = 1;
                        arg0.field440++;
                        method772(var3, arg0.field440, arg0.field446, arg0.field406);
                    }
                    if (arg0.field440 >= var3.field857.length && (arg0.field440 < 0 || arg0.field440 >= var3.field857.length)) {
                        arg0.field447 = -1;
                    }
                }
            }
        }
        if (arg0.field434 != -1 && arg0.field437 <= 1) {
            class33 var4 = class33.method2589(arg0.field434);
            if (var4.field867 == 1 && arg0.field439 > 0 && arg0.field445 <= field516 && arg0.field449 < field516) {
                arg0.field437 = 1;
                return;
            }
        }
        if (arg0.field434 != -1 && arg0.field437 == 0) {
            class33 var5 = class33.method2589(arg0.field434);
            if (var5 == null || var5.field857 == null) {
                arg0.field434 = -1;
            } else {
                arg0.field415++;
                if (arg0.field436 < var5.field857.length && arg0.field415 > var5.field864[arg0.field436]) {
                    arg0.field415 = 1;
                    arg0.field436++;
                    method772(var5, arg0.field436, arg0.field446, arg0.field406);
                }
                if (arg0.field436 >= var5.field857.length) {
                    arg0.field436 -= var5.field866;
                    arg0.field418++;
                    if (arg0.field418 >= var5.field865) {
                        arg0.field434 = -1;
                    } else if (arg0.field436 >= 0 && arg0.field436 < var5.field857.length) {
                        method772(var5, arg0.field436, arg0.field446, arg0.field406);
                    } else {
                        arg0.field434 = -1;
                    }
                }
                arg0.field408 = var5.field868;
            }
        }
        if (arg0.field437 > 0) {
            arg0.field437--;
        }
    }

    @ObfuscatedName("em.an(B)V")
    public static final void method2927() {
        if (!field607) {
            field613[0] = class133.field2059;
            field614[0] = "";
            field576[0] = 1006;
            field608 = 1;
        }
        if (field485 != -1) {
            method225(field485);
        }
        for (int var0 = 0; var0 < field667; var0++) {
            if (field634[var0]) {
                field670[var0] = true;
            }
            field522[var0] = field634[var0];
            field634[var0] = false;
        }
        field668 = field516;
        field615 = -1;
        field691 = -1;
        Statics.field2294 = null;
        if (field485 != -1) {
            field667 = 0;
            method1918(field485, 0, 0, 765, 503, 0, 0, -1);
        }
        class88.method1692();
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < field608 - 1; var2++) {
                if (field576[var2] < 1000 && field576[var2 + 1] > 1000) {
                    String var3 = field614[var2];
                    field614[var2] = field614[var2 + 1];
                    field614[var2 + 1] = var3;
                    String var4 = field613[var2];
                    field613[var2] = field613[var2 + 1];
                    field613[var2 + 1] = var4;
                    int var5 = field576[var2];
                    field576[var2] = field576[var2 + 1];
                    field576[var2 + 1] = var5;
                    int var6 = field609[var2];
                    field609[var2] = field609[var2 + 1];
                    field609[var2 + 1] = var6;
                    int var7 = field610[var2];
                    field610[var2] = field610[var2 + 1];
                    field610[var2 + 1] = var7;
                    int var8 = field612[var2];
                    field612[var2] = field612[var2 + 1];
                    field612[var2 + 1] = var8;
                    var1 = false;
                }
            }
        }
        if (field607) {
            int var12 = Statics.field1356;
            int var13 = Statics.field1358;
            int var14 = Statics.field367;
            int var15 = Statics.field269;
            int var16 = 6116423;
            class88.method1699(var12, var13, var14, var15, var16);
            class88.method1699(var12 + 1, var13 + 1, var14 - 2, 16, 0);
            class88.method1701(var12 + 1, var13 + 18, var14 - 2, var15 - 19, 0);
            Statics.field1264.method3230(class133.field2125, var12 + 3, var13 + 14, var16, -1);
            int var17 = class76.field1365;
            int var18 = class76.field1369;
            for (int var19 = 0; var19 < field608; var19++) {
                int var20 = (field608 - 1 - var19) * 15 + var13 + 31;
                int var21 = 16777215;
                if (var17 > var12 && var17 < var12 + var14 && var18 > var20 - 13 && var18 < var20 + 3) {
                    var21 = 16776960;
                }
                Statics.field1264.method3230(method853(var19), var12 + 3, var20, var21, 0);
            }
            method507(Statics.field1356, Statics.field1358, Statics.field367, Statics.field269);
        } else if (field615 != -1) {
            int var9 = field615;
            int var10 = field691;
            if (field608 >= 2 || field642 != 0 || field660) {
                String var11;
                if (field642 == 1 && field608 < 2) {
                    var11 = class133.field2196 + class133.field2206 + field643 + " " + class2.field25;
                } else if (field660 && field608 < 2) {
                    var11 = field624 + class133.field2206 + field625 + " " + class2.field25;
                } else {
                    var11 = method853(field608 - 1);
                }
                if (field608 > 2) {
                    var11 = var11 + class2.method1139(16777215) + " " + '/' + " " + (field608 - 2) + class133.field2055;
                }
                Statics.field1264.method3237(var11, var9 + 4, var10 + 15, 16777215, 0, field516 / 1000);
            }
        }
        if (field710 == 3) {
            for (int var22 = 0; var22 < field667; var22++) {
                if (field522[var22]) {
                    class88.method1727(field672[var22], field673[var22], field674[var22], field675[var22], 16711935, 128);
                } else if (field670[var22]) {
                    class88.method1727(field672[var22], field673[var22], field674[var22], field675[var22], 16711680, 128);
                }
            }
        }
        class7.method58(Statics.field208, Statics.field1623.field446, Statics.field1623.field406, field544);
        field544 = 0;
    }

    @ObfuscatedName("j.az(Ljava/lang/String;ZI)V")
    public static final void method8(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field1719.method3227(arg0, 250);
        int var6 = Statics.field1719.method3228(arg0, 250) * 13;
        class88.method1699(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class88.method1701(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field1719.method3233(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method1577(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method507(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field67.getGraphics();
            Statics.field1277.method1551(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field67.repaint();
        }
    }

    @ObfuscatedName("dc.as(ZI)V")
    public static final void method2095(boolean arg0) {
        if (Statics.field1623.field446 >> 7 == field693 && Statics.field1623.field406 >> 7 == field698) {
            field693 = 0;
        }
        int var1 = field677;
        if (arg0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            class3 var3;
            int var4;
            if (arg0) {
                var3 = Statics.field1623;
                var4 = 33538048;
            } else {
                var3 = field562[field587[var2]];
                var4 = field587[var2] << 14;
            }
            if (var3 != null && var3.method20()) {
                var3.field48 = false;
                if ((field528 && field677 > 50 || field677 > 200) && !arg0 && var3.field463 == var3.field430) {
                    var3.field48 = true;
                }
                int var5 = var3.field446 >> 7;
                int var6 = var3.field406 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field54 == null || field516 < var3.field55 || field516 >= var3.field59) {
                        if ((var3.field446 & 0x7F) == 64 && (var3.field406 & 0x7F) == 64) {
                            if (field683 == field568[var5][var6]) {
                                continue;
                            }
                            field568[var5][var6] = field683;
                        }
                        var3.field42 = method505(var3.field446, var3.field406, Statics.field208);
                        Statics.field1310.method1775(Statics.field208, var3.field446, var3.field406, var3.field42, 60, var3, var3.field407, var4, var3.field408);
                    } else {
                        var3.field48 = false;
                        var3.field42 = method505(var3.field446, var3.field406, Statics.field208);
                        Statics.field1310.method1776(Statics.field208, var3.field446, var3.field406, var3.field42, 60, var3, var3.field407, var4, var3.field47, var3.field56, var3.field57, var3.field45);
                    }
                }
            }
        }
    }

    @ObfuscatedName("k.ag(ZI)V")
    public static final void method220(boolean arg0) {
        for (int var1 = 0; var1 < field503; var1++) {
            class24 var2 = field681[field696[var1]];
            int var3 = (field696[var1] << 14) + 536870912;
            if (var2 != null && var2.method20() && var2.field384.field785 == arg0 && var2.field384.method566()) {
                int var4 = var2.field446 >> 7;
                int var5 = var2.field406 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field409 == 1 && (var2.field446 & 0x7F) == 64 && (var2.field406 & 0x7F) == 64) {
                        if (field683 == field568[var4][var5]) {
                            continue;
                        }
                        field568[var4][var5] = field683;
                    }
                    if (!var2.field384.field783) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1310.method1775(Statics.field208, var2.field446, var2.field406, method505(var2.field446 + (var2.field409 * 64 - 64), var2.field406 + (var2.field409 * 64 - 64), Statics.field208), var2.field409 * 64 - 64 + 60, var2, var2.field407, var3, var2.field408);
                }
            }
        }
    }

    @ObfuscatedName("w.am(I)V")
    public static final void method107() {
        for (class10 var0 = (class10) field601.method3145(); var0 != null; var0 = (class10) field601.method3154()) {
            if (Statics.field208 != var0.field159 || field516 > var0.field165) {
                var0.method3182();
            } else if (field516 >= var0.field178) {
                if (var0.field168 > 0) {
                    class24 var1 = field681[var0.field168 - 1];
                    if (var1 != null && var1.field446 >= 0 && var1.field446 < 13312 && var1.field406 >= 0 && var1.field406 < 13312) {
                        var0.method103(var1.field446, var1.field406, method505(var1.field446, var1.field406, var0.field159) - var0.field163, field516);
                    }
                }
                if (var0.field168 < 0) {
                    int var2 = -var0.field168 - 1;
                    class3 var3;
                    if (field481 == var2) {
                        var3 = Statics.field1623;
                    } else {
                        var3 = field562[var2];
                    }
                    if (var3 != null && var3.field446 >= 0 && var3.field446 < 13312 && var3.field406 >= 0 && var3.field406 < 13312) {
                        var0.method103(var3.field446, var3.field406, method505(var3.field446, var3.field406, var0.field159) - var0.field163, field516);
                    }
                }
                var0.method104(field544);
                Statics.field1310.method1775(Statics.field208, (int) var0.field166, (int) var0.field183, (int) var0.field169, 60, var0, var0.field172, -1, false);
            }
        }
    }

    @ObfuscatedName("ac.aj(IIIII)V")
    public static final void method1103(int arg0, int arg1, int arg2, int arg3) {
        field558 = 0;
        for (int var4 = -1; var4 < field677 + field503; var4++) {
            class26 var5;
            if (var4 == -1) {
                var5 = Statics.field1623;
            } else if (var4 < field677) {
                var5 = field562[field587[var4]];
            } else {
                var5 = field681[field696[var4 - field677]];
            }
            if (var5 != null && var5.method20()) {
                if (var5 instanceof class24) {
                    class30 var6 = ((class24) var5).field384;
                    if (var6.field790 != null) {
                        var6 = var6.method564();
                    }
                    if (var6 == null) {
                        continue;
                    }
                }
                if (var4 >= field677) {
                    class30 var9 = ((class24) var5).field384;
                    if (var9.field790 != null) {
                        var9 = var9.method564();
                    }
                    if (var9.field788 >= 0 && var9.field788 < Statics.field923.length) {
                        method2576(var5, var5.field405 + 15);
                        if (field570 > -1) {
                            Statics.field923[var9.field788].method1596(field570 + arg0 - 12, field655 + arg1 - 30);
                        }
                    }
                    if (field484 == 1 && field509 == field696[var4 - field677] && field516 % 20 < 10) {
                        method2576(var5, var5.field405 + 15);
                        if (field570 > -1) {
                            Statics.field225[0].method1596(field570 + arg0 - 12, field655 + arg1 - 28);
                        }
                    }
                } else {
                    int var7 = 30;
                    class3 var8 = (class3) var5;
                    if (var8.field44 != -1 || var8.field49 != -1) {
                        method2576(var5, var5.field405 + 15);
                        if (field570 > -1) {
                            if (var8.field44 != -1) {
                                Statics.field382[var8.field44].method1596(field570 + arg0 - 12, field655 + arg1 - var7);
                                var7 += 25;
                            }
                            if (var8.field49 != -1) {
                                Statics.field923[var8.field49].method1596(field570 + arg0 - 12, field655 + arg1 - var7);
                                var7 += 25;
                            }
                        }
                    }
                    if (var4 >= 0 && field484 == 10 && field486 == field587[var4]) {
                        method2576(var5, var5.field405 + 15);
                        if (field570 > -1) {
                            Statics.field225[1].method1596(field570 + arg0 - 12, field655 + arg1 - var7);
                        }
                    }
                }
                if (var5.field456 != null && (var4 >= field677 || field532 == 0 || field532 == 3 || field532 == 1 && method138(((class3) var5).field58))) {
                    method2576(var5, var5.field405);
                    if (field570 > -1 && field558 < field559) {
                        field464[field558] = Statics.field1264.method3225(var5.field456) / 2;
                        field497[field558] = Statics.field1264.field2790;
                        field560[field558] = field570;
                        field561[field558] = field655;
                        field564[field558] = var5.field438;
                        field473[field558] = var5.field420;
                        field574[field558] = var5.field419;
                        field567[field558] = var5.field456;
                        field558++;
                    }
                }
                if (var5.field425 > field516) {
                    method2576(var5, var5.field405 + 15);
                    if (field570 > -1) {
                        int var10 = var5.field426 * 30 / var5.field427;
                        if (var10 > 30) {
                            var10 = 30;
                        }
                        class88.method1699(field570 + arg0 - 15, field655 + arg1 - 3, var10, 5, 65280);
                        class88.method1699(field570 + arg0 - 15 + var10, field655 + arg1 - 3, 30 - var10, 5, 16711680);
                    }
                }
                for (int var11 = 0; var11 < 4; var11++) {
                    if (var5.field424[var11] > field516) {
                        method2576(var5, var5.field405 / 2);
                        if (field570 > -1) {
                            if (var11 == 1) {
                                field655 -= 20;
                            }
                            if (var11 == 2) {
                                field570 -= 15;
                                field655 -= 10;
                            }
                            if (var11 == 3) {
                                field570 += 15;
                                field655 -= 10;
                            }
                            Statics.field12[var5.field423[var11]].method1596(field570 + arg0 - 12, field655 + arg1 - 12);
                            Statics.field849.method3289(Integer.toString(var5.field422[var11]), field570 + arg0 - 1, field655 + arg1 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var12 = 0; var12 < field558; var12++) {
            int var13 = field560[var12];
            int var14 = field561[var12];
            int var15 = field464[var12];
            int var16 = field497[var12];
            boolean var17 = true;
            while (var17) {
                var17 = false;
                for (int var18 = 0; var18 < var12; var18++) {
                    if (var14 + 2 > field561[var18] - field497[var18] && var14 - var16 < field561[var18] + 2 && var13 - var15 < field560[var18] + field464[var18] && var13 + var15 > field560[var18] - field464[var18] && field561[var18] - field497[var18] < var14) {
                        var14 = field561[var18] - field497[var18];
                        var17 = true;
                    }
                }
            }
            field570 = field560[var12];
            field655 = field561[var12] = var14;
            String var19 = field567[var12];
            if (field628 == 0) {
                int var20 = 16776960;
                if (field564[var12] < 6) {
                    var20 = field682[field564[var12]];
                }
                if (field564[var12] == 6) {
                    var20 = field683 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field564[var12] == 7) {
                    var20 = field683 % 20 < 10 ? 255 : 65535;
                }
                if (field564[var12] == 8) {
                    var20 = field683 % 20 < 10 ? 45056 : 8454016;
                }
                if (field564[var12] == 9) {
                    int var21 = 150 - field574[var12];
                    if (var21 < 50) {
                        var20 = var21 * 1280 + 16711680;
                    } else if (var21 < 100) {
                        var20 = 16776960 - (var21 - 50) * 327680;
                    } else if (var21 < 150) {
                        var20 = (var21 - 100) * 5 + 65280;
                    }
                }
                if (field564[var12] == 10) {
                    int var22 = 150 - field574[var12];
                    if (var22 < 50) {
                        var20 = var22 * 5 + 16711680;
                    } else if (var22 < 100) {
                        var20 = 16711935 - (var22 - 50) * 327680;
                    } else if (var22 < 150) {
                        var20 = (var22 - 100) * 327680 + 255 - (var22 - 100) * 5;
                    }
                }
                if (field564[var12] == 11) {
                    int var23 = 150 - field574[var12];
                    if (var23 < 50) {
                        var20 = 16777215 - var23 * 327685;
                    } else if (var23 < 100) {
                        var20 = (var23 - 50) * 327685 + 65280;
                    } else if (var23 < 150) {
                        var20 = 16777215 - (var23 - 100) * 327680;
                    }
                }
                if (field473[var12] == 0) {
                    Statics.field1264.method3289(var19, field570 + arg0, field655 + arg1, var20, 0);
                }
                if (field473[var12] == 1) {
                    Statics.field1264.method3234(var19, field570 + arg0, field655 + arg1, var20, 0, field683);
                }
                if (field473[var12] == 2) {
                    Statics.field1264.method3235(var19, field570 + arg0, field655 + arg1, var20, 0, field683);
                }
                if (field473[var12] == 3) {
                    Statics.field1264.method3268(var19, field570 + arg0, field655 + arg1, var20, 0, field683, 150 - field574[var12]);
                }
                if (field473[var12] == 4) {
                    int var24 = (150 - field574[var12]) * (Statics.field1264.method3225(var19) + 100) / 150;
                    class88.method1694(field570 + arg0 - 50, arg1, field570 + arg0 + 50, arg1 + arg3);
                    Statics.field1264.method3230(var19, field570 + arg0 + 50 - var24, field655 + arg1, var20, 0);
                    class88.method1693(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field473[var12] == 5) {
                    int var25 = 150 - field574[var12];
                    int var26 = 0;
                    if (var25 < 25) {
                        var26 = var25 - 25;
                    } else if (var25 > 125) {
                        var26 = var25 - 125;
                    }
                    class88.method1694(arg0, field655 + arg1 - Statics.field1264.field2790 - 1, arg0 + arg2, field655 + arg1 + 5);
                    Statics.field1264.method3289(var19, field570 + arg0, field655 + arg1 + var26, var20, 0);
                    class88.method1693(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field1264.method3289(var19, field570 + arg0, field655 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("ck.ab(I)V")
    public static final void method2008() {
        field478 = 0;
        int var0 = (Statics.field1623.field446 >> 7) + Statics.field1738;
        int var1 = (Statics.field1623.field406 >> 7) + Statics.field277;
        if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            field478 = 1;
        }
        if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            field478 = 1;
        }
        if (field478 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            field478 = 0;
        }
    }

    @ObfuscatedName("ef.at(IIIII)V")
    public static final void method2935(int arg0, int arg1, int arg2, int arg3) {
        if (field563 == 1) {
            Statics.field1348[field511 / 100].method1596(field572 - 8, field519 - 8);
        }
        if (field563 == 2) {
            Statics.field1348[field511 / 100 + 4].method1596(field572 - 8, field519 - 8);
        }
        method2008();
        if (!field482) {
            return;
        }
        int var4 = arg0 + 512 - 5;
        int var5 = arg1 + 20;
        Statics.field1719.method3231("Fps:" + field1301, var4, var5, 16776960, -1);
        int var9 = var5 + 15;
        Runtime var6 = Runtime.getRuntime();
        int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
        int var8 = 16776960;
        if (var7 > 32768 && field528) {
            var8 = 16711680;
        }
        if (var7 > 65536 && !field528) {
            var8 = 16711680;
        }
        Statics.field1719.method3231("Mem:" + var7 + "k", var4, var9, var8, -1);
        var5 = var9 + 15;
    }

    @ObfuscatedName("eg.ai(Lu;II)V")
    public static final void method2576(class26 arg0, int arg1) {
        method2228(arg0.field446, arg0.field406, arg1);
    }

    @ObfuscatedName("do.aa(IIIB)V")
    public static final void method2228(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field570 = -1;
            field655 = -1;
            return;
        }
        int var3 = method505(arg0, arg1, Statics.field208) - arg2;
        int var4 = arg0 - Statics.field1492;
        int var5 = var3 - Statics.field1407;
        int var6 = arg1 - Statics.field361;
        int var7 = class103.field1763[Statics.field1262];
        int var8 = class103.field1757[Statics.field1262];
        int var9 = class103.field1763[Statics.field17];
        int var10 = class103.field1757[Statics.field17];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field570 = (var11 << 9) / var15 + 256;
            field655 = (var14 << 9) / var15 + 167;
        } else {
            field570 = -1;
            field655 = -1;
        }
    }

    @ObfuscatedName("client.ar(IIII)I")
    public static final int method505(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class9.field143[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class9.field157[var5][var3][var4] + class9.field157[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class9.field157[var5][var3][var4 + 1] + class9.field157[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("er.au(IIIIIII)V")
    public static final void method2588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class103.field1763[var6];
            int var12 = class103.field1757[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class103.field1763[var7];
            int var15 = class103.field1757[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field1492 = arg0 - var8;
        Statics.field1407 = arg1 - var9;
        Statics.field361 = arg2 - var10;
        Statics.field1262 = arg3;
        Statics.field17 = arg4;
    }

    @ObfuscatedName("x.aq(ZI)V")
    public static final void method26(boolean arg0) {
        field524 = arg0;
        if (!field524) {
            int var1 = field507.method2328();
            int var2 = field507.method2359();
            int var3 = (field508 - field507.field2003) / 16;
            Statics.field26 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field26[var4][var5] = field507.method2366();
                }
            }
            int var6 = field507.method2359();
            int var7 = field507.method2352();
            int var8 = field507.method2358();
            Statics.field268 = new int[var3];
            Statics.field136 = new int[var3];
            Statics.field1352 = new int[var3];
            Statics.field1432 = new byte[var3][];
            Statics.field1187 = new byte[var3][];
            boolean var9 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && var6 / 8 == 48) {
                var9 = true;
            }
            if (var2 / 8 == 48 && var6 / 8 == 148) {
                var9 = true;
            }
            int var10 = 0;
            for (int var11 = (var2 - 6) / 8; var11 <= (var2 + 6) / 8; var11++) {
                for (int var12 = (var6 - 6) / 8; var12 <= (var6 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var9 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        Statics.field268[var10] = var13;
                        Statics.field136[var10] = Statics.field739.method2836("m" + var11 + "_" + var12);
                        Statics.field1352[var10] = Statics.field739.method2836("l" + var11 + "_" + var12);
                        var10++;
                    }
                }
            }
            method207(var2, var6, var7, var8, var1);
            return;
        }
        field507.method2200();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field507.method2201(1);
                    if (var17 == 1) {
                        field525[var14][var15][var16] = field507.method2201(26);
                    } else {
                        field525[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field507.method2202();
        int var18 = (field508 - field507.field2003) / 16;
        Statics.field26 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var20 = 0; var20 < 4; var20++) {
                Statics.field26[var19][var20] = field507.method2489();
            }
        }
        int var21 = field507.method2358();
        int var22 = field507.method2352();
        int var23 = field507.method2359();
        int var24 = field507.method2359();
        int var25 = field507.method2328();
        Statics.field268 = new int[var18];
        Statics.field136 = new int[var18];
        Statics.field1352 = new int[var18];
        Statics.field1432 = new byte[var18][];
        Statics.field1187 = new byte[var18][];
        int var26 = 0;
        for (int var27 = 0; var27 < 4; var27++) {
            for (int var28 = 0; var28 < 13; var28++) {
                for (int var29 = 0; var29 < 13; var29++) {
                    int var30 = field525[var27][var28][var29];
                    if (var30 != -1) {
                        int var31 = var30 >> 14 & 0x3FF;
                        int var32 = var30 >> 3 & 0x7FF;
                        int var33 = (var31 / 8 << 8) + var32 / 8;
                        for (int var34 = 0; var34 < var26; var34++) {
                            if (Statics.field268[var34] == var33) {
                                var33 = -1;
                                break;
                            }
                        }
                        if (var33 != -1) {
                            Statics.field268[var26] = var33;
                            int var35 = var33 >> 8 & 0xFF;
                            int var36 = var33 & 0xFF;
                            Statics.field136[var26] = Statics.field739.method2836("m" + var35 + "_" + var36);
                            Statics.field1352[var26] = Statics.field739.method2836("l" + var35 + "_" + var36);
                            var26++;
                        }
                    }
                }
            }
        }
        method207(var25, var21, var22, var23, var24);
    }

    @ObfuscatedName("v.ay(IIIIII)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (Statics.field122 == arg0 && Statics.field1311 == arg1 && field517 == arg2 || !field528) {
            return;
        }
        Statics.field122 = arg0;
        Statics.field1311 = arg1;
        field517 = arg2;
        if (!field528) {
            field517 = 0;
        }
        method119(25);
        method8(class133.field2143, true);
        int var5 = Statics.field1738;
        int var6 = Statics.field277;
        Statics.field1738 = (arg0 - 6) * 8;
        Statics.field277 = (arg1 - 6) * 8;
        int var7 = Statics.field1738 - var5;
        int var8 = Statics.field277 - var6;
        int var9 = Statics.field1738;
        int var10 = Statics.field277;
        for (int var11 = 0; var11 < 32768; var11++) {
            class24 var12 = field681[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field457[var13] -= var7;
                    var12.field458[var13] -= var8;
                }
                var12.field446 -= var7 * 128;
                var12.field406 -= var8 * 128;
            }
        }
        for (int var14 = 0; var14 < 2048; var14++) {
            class3 var15 = field562[var14];
            if (var15 != null) {
                for (int var16 = 0; var16 < 10; var16++) {
                    var15.field457[var16] -= var7;
                    var15.field458[var16] -= var8;
                }
                var15.field446 -= var7 * 128;
                var15.field406 -= var8 * 128;
            }
        }
        Statics.field208 = arg2;
        Statics.field1623.method235(arg3, arg4, false);
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
                        field599[var27][var23][var24] = field599[var27][var25][var26];
                    } else {
                        field599[var27][var23][var24] = null;
                    }
                }
            }
        }
        for (class21 var28 = (class21) field591.method3145(); var28 != null; var28 = (class21) field591.method3154()) {
            var28.field341 -= var7;
            var28.field342 -= var8;
            if (var28.field341 < 0 || var28.field342 < 0 || var28.field341 >= 104 || var28.field342 >= 104) {
                var28.method3182();
            }
        }
        if (field693 != 0) {
            field693 -= var7;
            field698 -= var8;
        }
        field695 = 0;
        field711 = false;
        field692 = -1;
        field602.method3146();
        field601.method3146();
    }

    @ObfuscatedName("t.ak(ZI)V")
    public static final void method158(boolean arg0) {
        method1346();
        field557++;
        if (field557 < 50 && !arg0) {
            return;
        }
        field557 = 0;
        if (field493 || Statics.field82 == null) {
            return;
        }
        field505.method2198(177);
        try {
            Statics.field82.method1328(field505.field2002, 0, field505.field2003);
            field505.field2003 = 0;
        } catch (IOException var2) {
            field493 = true;
        }
    }

    @ObfuscatedName("bc.ac(I)V")
    public static final void method1360() {
        method158(false);
        field518 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field1432.length; var1++) {
            if (Statics.field136[var1] != -1 && Statics.field1432[var1] == null) {
                Statics.field1432[var1] = Statics.field739.method2821(Statics.field136[var1], 0);
                if (Statics.field1432[var1] == null) {
                    var0 = false;
                    field518++;
                }
            }
            if (Statics.field1352[var1] != -1 && Statics.field1187[var1] == null) {
                Statics.field1187[var1] = Statics.field739.method2832(Statics.field1352[var1], 0, Statics.field26[var1]);
                if (Statics.field1187[var1] == null) {
                    var0 = false;
                    field518++;
                }
            }
        }
        if (!var0) {
            field584 = 1;
            return;
        }
        field520 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field1432.length; var3++) {
            byte[] var4 = Statics.field1187[var3];
            if (var4 != null) {
                int var5 = (Statics.field268[var3] >> 8) * 64 - Statics.field1738;
                int var6 = (Statics.field268[var3] & 0xFF) * 64 - Statics.field277;
                if (field524) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class9.method133(var4, var5, var6);
            }
        }
        if (!var2) {
            field584 = 2;
            return;
        }
        if (field584 != 0) {
            method8(class133.field2143 + class2.field22 + class2.field23 + 100 + "%" + class2.field20, true);
        }
        method1346();
        method131();
        method1346();
        Statics.field1310.method1764();
        method1346();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field671[var7].method3044();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class9.field143[var8][var9][var10] = 0;
                }
            }
        }
        method1346();
        class9.method222();
        int var11 = Statics.field1432.length;
        class7.method232();
        method158(true);
        if (!field524) {
            for (int var12 = 0; var12 < var11; var12++) {
                int var13 = (Statics.field268[var12] >> 8) * 64 - Statics.field1738;
                int var14 = (Statics.field268[var12] & 0xFF) * 64 - Statics.field277;
                byte[] var15 = Statics.field1432[var12];
                if (var15 != null) {
                    method1346();
                    int var16 = Statics.field122 * 8 - 48;
                    int var17 = Statics.field1311 * 8 - 48;
                    class162[] var18 = field671;
                    for (int var19 = 0; var19 < 4; var19++) {
                        for (int var20 = 0; var20 < 64; var20++) {
                            for (int var21 = 0; var21 < 64; var21++) {
                                if (var13 + var20 > 0 && var13 + var20 < 103 && var14 + var21 > 0 && var14 + var21 < 103) {
                                    var18[var19].field2694[var13 + var20][var14 + var21] &= 0xFEFFFFFF;
                                }
                            }
                        }
                    }
                    class125 var22 = new class125(var15);
                    for (int var23 = 0; var23 < 4; var23++) {
                        for (int var24 = 0; var24 < 64; var24++) {
                            for (int var25 = 0; var25 < 64; var25++) {
                                class9.method114(var22, var23, var13 + var24, var14 + var25, var16, var17, 0);
                            }
                        }
                    }
                }
            }
            for (int var26 = 0; var26 < var11; var26++) {
                int var27 = (Statics.field268[var26] >> 8) * 64 - Statics.field1738;
                int var28 = (Statics.field268[var26] & 0xFF) * 64 - Statics.field277;
                byte[] var29 = Statics.field1432[var26];
                if (var29 == null && Statics.field1311 < 800) {
                    method1346();
                    class9.method584(var27, var28, 64, 64);
                }
            }
            method158(true);
            for (int var30 = 0; var30 < var11; var30++) {
                byte[] var31 = Statics.field1187[var30];
                if (var31 != null) {
                    int var32 = (Statics.field268[var30] >> 8) * 64 - Statics.field1738;
                    int var33 = (Statics.field268[var30] & 0xFF) * 64 - Statics.field277;
                    method1346();
                    class94 var34 = Statics.field1310;
                    class162[] var35 = field671;
                    class125 var36 = new class125(var31);
                    int var37 = -1;
                    while (true) {
                        int var38 = var36.method2377();
                        if (var38 == 0) {
                            break;
                        }
                        var37 += var38;
                        int var39 = 0;
                        while (true) {
                            int var40 = var36.method2377();
                            if (var40 == 0) {
                                break;
                            }
                            var39 += var40 - 1;
                            int var41 = var39 & 0x3F;
                            int var42 = var39 >> 6 & 0x3F;
                            int var43 = var39 >> 12;
                            int var44 = var36.method2326();
                            int var45 = var44 >> 2;
                            int var46 = var44 & 0x3;
                            int var47 = var32 + var42;
                            int var48 = var33 + var41;
                            if (var47 > 0 && var48 > 0 && var47 < 103 && var48 < 103) {
                                int var49 = var43;
                                if ((class9.field143[1][var47][var48] & 0x2) == 2) {
                                    var49 = var43 - 1;
                                }
                                class162 var50 = null;
                                if (var49 >= 0) {
                                    var50 = var35[var49];
                                }
                                class9.method2574(var43, var47, var48, var37, var46, var45, var34, var50);
                            }
                        }
                    }
                }
            }
        }
        if (field524) {
            for (int var51 = 0; var51 < 4; var51++) {
                method1346();
                for (int var52 = 0; var52 < 13; var52++) {
                    for (int var53 = 0; var53 < 13; var53++) {
                        boolean var54 = false;
                        int var55 = field525[var51][var52][var53];
                        if (var55 != -1) {
                            int var56 = var55 >> 24 & 0x3;
                            int var57 = var55 >> 1 & 0x3;
                            int var58 = var55 >> 14 & 0x3FF;
                            int var59 = var55 >> 3 & 0x7FF;
                            int var60 = (var58 / 8 << 8) + var59 / 8;
                            for (int var61 = 0; var61 < Statics.field268.length; var61++) {
                                if (Statics.field268[var61] == var60 && Statics.field1432[var61] != null) {
                                    byte[] var62 = Statics.field1432[var61];
                                    int var63 = var52 * 8;
                                    int var64 = var53 * 8;
                                    int var65 = (var58 & 0x7) * 8;
                                    int var66 = (var59 & 0x7) * 8;
                                    class162[] var67 = field671;
                                    for (int var68 = 0; var68 < 8; var68++) {
                                        for (int var69 = 0; var69 < 8; var69++) {
                                            if (var63 + var68 > 0 && var63 + var68 < 103 && var64 + var69 > 0 && var64 + var69 < 103) {
                                                var67[var51].field2694[var63 + var68][var64 + var69] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    class125 var70 = new class125(var62);
                                    for (int var71 = 0; var71 < 4; var71++) {
                                        for (int var72 = 0; var72 < 64; var72++) {
                                            for (int var73 = 0; var73 < 64; var73++) {
                                                if (var56 == var71 && var72 >= var65 && var72 < var65 + 8 && var73 >= var66 && var73 < var66 + 8) {
                                                    int var76 = var63 + class158.method1454(var72 & 0x7, var73 & 0x7, var57);
                                                    int var78 = var72 & 0x7;
                                                    int var79 = var73 & 0x7;
                                                    int var81 = var57 & 0x3;
                                                    int var82;
                                                    if (var81 == 0) {
                                                        var82 = var79;
                                                    } else if (var81 == 1) {
                                                        var82 = 7 - var78;
                                                    } else if (var81 == 2) {
                                                        var82 = 7 - var79;
                                                    } else {
                                                        var82 = var78;
                                                    }
                                                    class9.method114(var70, var51, var76, var64 + var82, 0, 0, var57);
                                                } else {
                                                    class9.method114(var70, 0, -1, -1, 0, 0, 0);
                                                }
                                            }
                                        }
                                    }
                                    var54 = true;
                                    break;
                                }
                            }
                        }
                        if (!var54) {
                            int var83 = var51;
                            int var84 = var52 * 8;
                            int var85 = var53 * 8;
                            for (int var86 = 0; var86 < 8; var86++) {
                                for (int var87 = 0; var87 < 8; var87++) {
                                    class9.field157[var83][var84 + var86][var85 + var87] = 0;
                                }
                            }
                            if (var84 > 0) {
                                for (int var88 = 1; var88 < 8; var88++) {
                                    class9.field157[var83][var84][var85 + var88] = class9.field157[var83][var84 - 1][var85 + var88];
                                }
                            }
                            if (var85 > 0) {
                                for (int var89 = 1; var89 < 8; var89++) {
                                    class9.field157[var83][var84 + var89][var85] = class9.field157[var83][var84 + var89][var85 - 1];
                                }
                            }
                            if (var84 > 0 && class9.field157[var83][var84 - 1][var85] != 0) {
                                class9.field157[var83][var84][var85] = class9.field157[var83][var84 - 1][var85];
                            } else if (var85 > 0 && class9.field157[var83][var84][var85 - 1] != 0) {
                                class9.field157[var83][var84][var85] = class9.field157[var83][var84][var85 - 1];
                            } else if (var84 > 0 && var85 > 0 && class9.field157[var83][var84 - 1][var85 - 1] != 0) {
                                class9.field157[var83][var84][var85] = class9.field157[var83][var84 - 1][var85 - 1];
                            }
                        }
                    }
                }
            }
            for (int var90 = 0; var90 < 13; var90++) {
                for (int var91 = 0; var91 < 13; var91++) {
                    int var92 = field525[0][var90][var91];
                    if (var92 == -1) {
                        class9.method584(var90 * 8, var91 * 8, 8, 8);
                    }
                }
            }
            method158(true);
            for (int var93 = 0; var93 < 4; var93++) {
                method1346();
                for (int var94 = 0; var94 < 13; var94++) {
                    for (int var95 = 0; var95 < 13; var95++) {
                        int var96 = field525[var93][var94][var95];
                        if (var96 != -1) {
                            int var97 = var96 >> 24 & 0x3;
                            int var98 = var96 >> 1 & 0x3;
                            int var99 = var96 >> 14 & 0x3FF;
                            int var100 = var96 >> 3 & 0x7FF;
                            int var101 = (var99 / 8 << 8) + var100 / 8;
                            for (int var102 = 0; var102 < Statics.field268.length; var102++) {
                                if (Statics.field268[var102] == var101 && Statics.field1187[var102] != null) {
                                    class9.method118(Statics.field1187[var102], var93, var94 * 8, var95 * 8, var97, (var99 & 0x7) * 8, (var100 & 0x7) * 8, var98, Statics.field1310, field671);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        method158(true);
        method131();
        method1346();
        class9.method583(Statics.field1310, field671);
        method158(true);
        int var103 = class9.field137;
        if (var103 > Statics.field208) {
            var103 = Statics.field208;
        }
        if (var103 < Statics.field208 - 1) {
            int var104 = Statics.field208 - 1;
        }
        if (field528) {
            Statics.field1310.method1765(class9.field137);
        } else {
            Statics.field1310.method1765(0);
        }
        for (int var105 = 0; var105 < 104; var105++) {
            for (int var106 = 0; var106 < 104; var106++) {
                method2985(var105, var106);
            }
        }
        method1346();
        method212();
        class31.field798.method3092();
        if (Statics.field2467 != null) {
            field505.method2198(73);
            field505.method2316(1057001181);
        }
        if (!field524) {
            int var107 = (Statics.field122 - 6) / 8;
            int var108 = (Statics.field122 + 6) / 8;
            int var109 = (Statics.field1311 - 6) / 8;
            int var110 = (Statics.field1311 + 6) / 8;
            for (int var111 = var107 - 1; var111 <= var108 + 1; var111++) {
                for (int var112 = var109 - 1; var112 <= var110 + 1; var112++) {
                    if (var111 < var107 || var111 > var108 || var112 < var109 || var112 > var110) {
                        Statics.field739.method2856("m" + var111 + "_" + var112);
                        Statics.field739.method2856("l" + var111 + "_" + var112);
                    }
                }
            }
        }
        method119(30);
        method1346();
        Statics.field138 = (byte[][][]) null;
        Statics.field139 = (byte[][][]) null;
        Statics.field1800 = (byte[][][]) null;
        Statics.field2713 = (byte[][][]) null;
        Statics.field1256 = (int[][][]) null;
        Statics.field146 = (byte[][][]) null;
        Statics.field1768 = (int[][]) null;
        Statics.field141 = null;
        Statics.field1999 = null;
        Statics.field140 = null;
        Statics.field1288 = null;
        Statics.field2040 = null;
        field505.method2198(214);
        class72.method2113();
    }

    @ObfuscatedName("dl.al(IIIIII)V")
    public static final void method2518(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1310.method1903(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1310.method1794(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field347.field1449;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class31 var13 = class31.method2519(var12);
            if (var13.field795 == -1) {
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
                class86 var14 = Statics.field30[var13.field795];
                if (var14 != null) {
                    int var15 = (var13.field810 * 4 - var14.field1452) / 2;
                    int var16 = (var13.field796 * 4 - var14.field1450) / 2;
                    var14.method1686(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field796) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1310.method1859(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1310.method1794(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class31 var22 = class31.method2519(var21);
            if (var22.field795 != -1) {
                class86 var23 = Statics.field30[var22.field795];
                if (var23 != null) {
                    int var24 = (var22.field810 * 4 - var23.field1452) / 2;
                    int var25 = (var22.field796 * 4 - var23.field1450) / 2;
                    var23.method1686(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field796) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field347.field1449;
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
        int var29 = Statics.field1310.method1906(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class31 var31 = class31.method2519(var30);
        if (var31.field795 == -1) {
            return;
        }
        class86 var32 = Statics.field30[var31.field795];
        if (var32 != null) {
            int var33 = (var31.field810 * 4 - var32.field1452) / 2;
            int var34 = (var31.field796 * 4 - var32.field1450) / 2;
            var32.method1686(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field796) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("ce.bd(IIII)Z")
    public static final boolean method1755(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 14 & 0x7FFF;
        int var4 = Statics.field1310.method1794(Statics.field208, arg0, arg1, arg2);
        if (var4 == -1) {
            return false;
        }
        int var5 = var4 & 0x1F;
        int var6 = var4 >> 6 & 0x3;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class31 var7 = class31.method2519(var3);
            int var8;
            int var9;
            if (var6 == 0 || var6 == 2) {
                var8 = var7.field810;
                var9 = var7.field796;
            } else {
                var8 = var7.field796;
                var9 = var7.field810;
            }
            int var10 = var7.field833;
            if (var6 != 0) {
                var10 = (var10 >> 4 - var6) + (var10 << var6 & 0xF);
            }
            method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], arg0, arg1, true, 0, 0, var8, var9, var10, 2);
        } else {
            method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], arg0, arg1, true, var5 + 1, var6, 0, 0, 0, 2);
        }
        field572 = class76.field1372;
        field519 = class76.field1373;
        field563 = 2;
        field511 = 0;
        return true;
    }

    @ObfuscatedName("bp.bt(IIIIZIIIIIIB)Z")
    public static final boolean method1317(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                field604[var11][var12] = 0;
                field529[var11][var12] = 99999999;
            }
        }
        int var13 = arg0;
        int var14 = arg1;
        field604[arg0][arg1] = 99;
        field529[arg0][arg1] = 0;
        byte var15 = 0;
        int var16 = 0;
        field530[var15] = arg0;
        int var36 = var15 + 1;
        field531[var15] = arg1;
        boolean var17 = false;
        int var18 = field530.length;
        int[][] var19 = field671[Statics.field208].field2694;
        while (var36 != var16) {
            var13 = field530[var16];
            var14 = field531[var16];
            var16 = (var16 + 1) % var18;
            if (arg2 == var13 && arg3 == var14) {
                var17 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && field671[Statics.field208].method3061(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
                if (arg5 < 10 && field671[Statics.field208].method3066(var13, var14, arg2, arg3, arg5 - 1, arg6)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg8 != 0 && field671[Statics.field208].method3056(var13, var14, arg2, arg3, arg7, arg8, arg9)) {
                var17 = true;
                break;
            }
            int var20 = field529[var13][var14] + 1;
            if (var13 > 0 && field604[var13 - 1][var14] == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0) {
                field530[var36] = var13 - 1;
                field531[var36] = var14;
                var36 = (var36 + 1) % var18;
                field604[var13 - 1][var14] = 2;
                field529[var13 - 1][var14] = var20;
            }
            if (var13 < 103 && field604[var13 + 1][var14] == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0) {
                field530[var36] = var13 + 1;
                field531[var36] = var14;
                var36 = (var36 + 1) % var18;
                field604[var13 + 1][var14] = 8;
                field529[var13 + 1][var14] = var20;
            }
            if (var14 > 0 && field604[var13][var14 - 1] == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field530[var36] = var13;
                field531[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field604[var13][var14 - 1] = 1;
                field529[var13][var14 - 1] = var20;
            }
            if (var14 < 103 && field604[var13][var14 + 1] == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field530[var36] = var13;
                field531[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field604[var13][var14 + 1] = 4;
                field529[var13][var14 + 1] = var20;
            }
            if (var13 > 0 && var14 > 0 && field604[var13 - 1][var14 - 1] == 0 && (var19[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field530[var36] = var13 - 1;
                field531[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field604[var13 - 1][var14 - 1] = 3;
                field529[var13 - 1][var14 - 1] = var20;
            }
            if (var13 < 103 && var14 > 0 && field604[var13 + 1][var14 - 1] == 0 && (var19[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 - 1] & 0x12C0102) == 0) {
                field530[var36] = var13 + 1;
                field531[var36] = var14 - 1;
                var36 = (var36 + 1) % var18;
                field604[var13 + 1][var14 - 1] = 9;
                field529[var13 + 1][var14 - 1] = var20;
            }
            if (var13 > 0 && var14 < 103 && field604[var13 - 1][var14 + 1] == 0 && (var19[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var14] & 0x12C0108) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field530[var36] = var13 - 1;
                field531[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field604[var13 - 1][var14 + 1] = 6;
                field529[var13 - 1][var14 + 1] = var20;
            }
            if (var13 < 103 && var14 < 103 && field604[var13 + 1][var14 + 1] == 0 && (var19[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var14] & 0x12C0180) == 0 && (var19[var13][var14 + 1] & 0x12C0120) == 0) {
                field530[var36] = var13 + 1;
                field531[var36] = var14 + 1;
                var36 = (var36 + 1) % var18;
                field604[var13 + 1][var14 + 1] = 12;
                field529[var13 + 1][var14 + 1] = var20;
            }
        }
        field527 = 0;
        if (!var17) {
            if (!arg4) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg2 - var23; var24 <= arg2 + var23; var24++) {
                for (int var25 = arg3 - var23; var25 <= arg3 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && field529[var24][var25] < 100) {
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
                        if (var28 < var21 || var21 == var28 && field529[var24][var25] < var22) {
                            var21 = var28;
                            var22 = field529[var24][var25];
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
            field527 = 1;
        }
        byte var29 = 0;
        field530[var29] = var13;
        int var37 = var29 + 1;
        field531[var29] = var14;
        int var30;
        int var31 = var30 = field604[var13][var14];
        while (arg0 != var13 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                field530[var37] = var13;
                field531[var37++] = var14;
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
            var31 = field604[var13][var14];
        }
        if (var37 > 0) {
            int var32 = var37;
            if (var37 > 25) {
                var32 = 25;
            }
            var37--;
            int var33 = field530[var37];
            int var34 = field531[var37];
            if (arg10 == 0) {
                field505.method2198(69);
                field505.method2339(var32 + var32 + 3);
            }
            if (arg10 == 1) {
                field505.method2198(117);
                field505.method2339(var32 + var32 + 3 + 14);
            }
            if (arg10 == 2) {
                field505.method2198(44);
                field505.method2339(var32 + var32 + 3);
            }
            field505.method2355(class74.field1326[82] ? 1 : 0);
            field505.method2357(Statics.field277 + var34);
            field693 = field530[0];
            field698 = field531[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var37--;
                field505.method2355(field530[var37] - var33);
                field505.method2339(field531[var37] - var34);
            }
            field505.method2492(Statics.field1738 + var33);
            return true;
        } else if (arg10 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aj.bh(I)V")
    public static final void method858() {
        if (field657 == 45) {
            int var0 = field507.method2313();
            int var1 = var0 >> 2;
            int var2 = var0 & 0x3;
            int var3 = field526[var1];
            int var4 = field507.method2328();
            int var5 = field507.method2313();
            int var6 = (var5 >> 4 & 0x7) + Statics.field431;
            int var7 = (var5 & 0x7) + Statics.field265;
            if (var6 >= 0 && var7 >= 0 && var6 < 103 && var7 < 103) {
                if (var3 == 0) {
                    class95 var8 = Statics.field1310.method1786(Statics.field208, var6, var7);
                    if (var8 != null) {
                        int var9 = var8.field1592 >> 14 & 0x7FFF;
                        if (var1 == 2) {
                            var8.field1590 = new class13(var9, 2, var2 + 4, Statics.field208, var6, var7, var4, false, var8.field1590);
                            var8.field1591 = new class13(var9, 2, var2 + 1 & 0x3, Statics.field208, var6, var7, var4, false, var8.field1591);
                        } else {
                            var8.field1590 = new class13(var9, var1, var2, Statics.field208, var6, var7, var4, false, var8.field1590);
                        }
                    }
                }
                if (var3 == 1) {
                    class107 var10 = Statics.field1310.method1787(Statics.field208, var6, var7);
                    if (var10 != null) {
                        int var11 = var10.field1793 >> 14 & 0x7FFF;
                        if (var1 == 4 || var1 == 5) {
                            var10.field1791 = new class13(var11, 4, var2, Statics.field208, var6, var7, var4, false, var10.field1791);
                        } else if (var1 == 6) {
                            var10.field1791 = new class13(var11, 4, var2 + 4, Statics.field208, var6, var7, var4, false, var10.field1791);
                        } else if (var1 == 7) {
                            var10.field1791 = new class13(var11, 4, (var2 + 2 & 0x3) + 4, Statics.field208, var6, var7, var4, false, var10.field1791);
                        } else if (var1 == 8) {
                            var10.field1791 = new class13(var11, 4, var2 + 4, Statics.field208, var6, var7, var4, false, var10.field1791);
                            var10.field1792 = new class13(var11, 4, (var2 + 2 & 0x3) + 4, Statics.field208, var6, var7, var4, false, var10.field1792);
                        }
                    }
                }
                if (var3 == 2) {
                    class97 var12 = Statics.field1310.method1788(Statics.field208, var6, var7);
                    if (var1 == 11) {
                        var1 = 10;
                    }
                    if (var12 != null) {
                        var12.field1614 = new class13(var12.field1620 >> 14 & 0x7FFF, var1, var2, Statics.field208, var6, var7, var4, false, var12.field1614);
                    }
                }
                if (var3 == 3) {
                    class106 var13 = Statics.field1310.method1789(Statics.field208, var6, var7);
                    if (var13 != null) {
                        var13.field1777 = new class13(var13.field1771 >> 14 & 0x7FFF, 22, var2, Statics.field208, var6, var7, var4, false, var13.field1777);
                    }
                }
            }
        } else if (field657 == 249) {
            int var14 = field507.method2326();
            int var15 = (var14 >> 4 & 0x7) + Statics.field431;
            int var16 = (var14 & 0x7) + Statics.field265;
            int var17 = field507.method2328();
            int var18 = field507.method2328();
            int var19 = field507.method2328();
            if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
                class175 var20 = field599[Statics.field208][var15][var16];
                if (var20 != null) {
                    for (class16 var21 = (class16) var20.method3145(); var21 != null; var21 = (class16) var20.method3154()) {
                        if ((var17 & 0x7FFF) == var21.field257 && var21.field256 == var18) {
                            var21.field256 = var19;
                            break;
                        }
                    }
                    method2985(var15, var16);
                }
            }
        } else if (field657 == 77) {
            int var22 = field507.method2328();
            int var23 = field507.method2358();
            int var24 = field507.method2313();
            int var25 = (var24 >> 4 & 0x7) + Statics.field431;
            int var26 = (var24 & 0x7) + Statics.field265;
            int var27 = field507.method2359();
            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && field481 != var22) {
                class16 var28 = new class16();
                var28.field257 = var27;
                var28.field256 = var23;
                if (field599[Statics.field208][var25][var26] == null) {
                    field599[Statics.field208][var25][var26] = new class175();
                }
                field599[Statics.field208][var25][var26].method3147(var28);
                method2985(var25, var26);
            }
        } else if (field657 == 181) {
            int var29 = field507.method2326();
            int var30 = (var29 >> 4 & 0x7) + Statics.field431;
            int var31 = (var29 & 0x7) + Statics.field265;
            int var32 = field507.method2328();
            int var33 = field507.method2326();
            int var34 = field507.method2328();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                int var35 = var30 * 128 + 64;
                int var36 = var31 * 128 + 64;
                class19 var37 = new class19(var32, Statics.field208, var35, var36, method505(var35, var36, Statics.field208) - var33, var34, field516);
                field602.method3147(var37);
            }
        } else if (field657 == 155) {
            int var38 = field507.method2358();
            int var39 = field507.method2358();
            int var40 = field507.method2351();
            int var41 = (var40 >> 4 & 0x7) + Statics.field431;
            int var42 = (var40 & 0x7) + Statics.field265;
            if (var41 >= 0 && var42 >= 0 && var41 < 104 && var42 < 104) {
                class16 var43 = new class16();
                var43.field257 = var38;
                var43.field256 = var39;
                if (field599[Statics.field208][var41][var42] == null) {
                    field599[Statics.field208][var41][var42] = new class175();
                }
                field599[Statics.field208][var41][var42].method3147(var43);
                method2985(var41, var42);
            }
        } else {
            if (field657 == 42) {
                int var44 = field507.method2326();
                int var45 = (var44 >> 4 & 0x7) + Statics.field431;
                int var46 = (var44 & 0x7) + Statics.field265;
                int var47 = field507.method2328();
                int var48 = field507.method2326();
                int var49 = var48 >> 4 & 0xF;
                int var50 = var48 & 0x7;
                int var51 = field507.method2326();
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104) {
                    int var52 = var49 + 1;
                    if (Statics.field1623.field457[0] >= var45 - var52 && Statics.field1623.field457[0] <= var45 + var52 && Statics.field1623.field458[0] >= var46 - var52 && Statics.field1623.field458[0] <= var46 + var52 && field469 != 0 && var50 > 0 && field695 < 50) {
                        field706[field695] = var47;
                        field707[field695] = var50;
                        field708[field695] = var51;
                        field539[field695] = null;
                        field575[field695] = (var45 << 16) + (var46 << 8) + var49;
                        field695++;
                    }
                }
            }
            if (field657 == 110) {
                int var53 = field507.method2313();
                int var54 = (var53 >> 4 & 0x7) + Statics.field431;
                int var55 = (var53 & 0x7) + Statics.field265;
                int var56 = field507.method2351();
                int var57 = var56 >> 2;
                int var58 = var56 & 0x3;
                int var59 = field526[var57];
                if (var54 >= 0 && var55 >= 0 && var54 < 104 && var55 < 104) {
                    method137(Statics.field208, var54, var55, var59, -1, var57, var58, 0, -1);
                }
            } else if (field657 == 184) {
                int var60 = field507.method2313();
                int var61 = var60 >> 2;
                int var62 = var60 & 0x3;
                int var63 = field526[var61];
                int var64 = field507.method2313();
                int var65 = (var64 >> 4 & 0x7) + Statics.field431;
                int var66 = (var64 & 0x7) + Statics.field265;
                int var67 = field507.method2359();
                if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                    method137(Statics.field208, var65, var66, var63, var67, var61, var62, 0, -1);
                }
            } else if (field657 == 202) {
                int var68 = field507.method2359();
                int var69 = field507.method2352();
                int var70 = (var69 >> 4 & 0x7) + Statics.field431;
                int var71 = (var69 & 0x7) + Statics.field265;
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                    class175 var72 = field599[Statics.field208][var70][var71];
                    if (var72 != null) {
                        for (class16 var73 = (class16) var72.method3145(); var73 != null; var73 = (class16) var72.method3154()) {
                            if ((var68 & 0x7FFF) == var73.field257) {
                                var73.method3182();
                                break;
                            }
                        }
                        if (var72.method3145() == null) {
                            field599[Statics.field208][var70][var71] = null;
                        }
                        method2985(var70, var71);
                    }
                }
            } else if (field657 == 43) {
                int var74 = field507.method2326();
                int var75 = (var74 >> 4 & 0x7) + Statics.field431;
                int var76 = (var74 & 0x7) + Statics.field265;
                int var77 = var75 + field507.method2347();
                int var78 = var76 + field507.method2347();
                int var79 = field507.method2329();
                int var80 = field507.method2328();
                int var81 = field507.method2326() * 4;
                int var82 = field507.method2326() * 4;
                int var83 = field507.method2328();
                int var84 = field507.method2328();
                int var85 = field507.method2326();
                int var86 = field507.method2326();
                if (var75 >= 0 && var76 >= 0 && var75 < 104 && var76 < 104 && var77 >= 0 && var78 >= 0 && var77 < 104 && var78 < 104 && var80 != 65535) {
                    int var87 = var75 * 128 + 64;
                    int var88 = var76 * 128 + 64;
                    int var89 = var77 * 128 + 64;
                    int var90 = var78 * 128 + 64;
                    class10 var91 = new class10(var80, Statics.field208, var87, var88, method505(var87, var88, Statics.field208) - var81, field516 + var83, field516 + var84, var85, var86, var79, var82);
                    var91.method103(var89, var90, method505(var89, var90, Statics.field208) - var82, field516 + var83);
                    field601.method3147(var91);
                }
            } else if (field657 == 241) {
                byte var92 = field507.method2353();
                byte var93 = field507.method2347();
                byte var94 = field507.method2467();
                int var95 = field507.method2352();
                int var96 = var95 >> 2;
                int var97 = var95 & 0x3;
                int var98 = field526[var96];
                int var99 = field507.method2326();
                int var100 = (var99 >> 4 & 0x7) + Statics.field431;
                int var101 = (var99 & 0x7) + Statics.field265;
                int var102 = field507.method2328();
                int var103 = field507.method2358();
                int var104 = field507.method2360();
                byte var105 = field507.method2467();
                int var106 = field507.method2360();
                class3 var107;
                if (field481 == var103) {
                    var107 = Statics.field1623;
                } else {
                    var107 = field562[var103];
                }
                if (var107 != null) {
                    class31 var108 = class31.method2519(var102);
                    int var109;
                    int var110;
                    if (var97 == 1 || var97 == 3) {
                        var109 = var108.field796;
                        var110 = var108.field810;
                    } else {
                        var109 = var108.field810;
                        var110 = var108.field796;
                    }
                    int var111 = (var109 >> 1) + var100;
                    int var112 = (var109 + 1 >> 1) + var100;
                    int var113 = (var110 >> 1) + var101;
                    int var114 = (var110 + 1 >> 1) + var101;
                    int[][] var115 = class9.field157[Statics.field208];
                    int var116 = var115[var111][var113] + var115[var112][var113] + var115[var111][var114] + var115[var112][var114] >> 2;
                    int var117 = (var100 << 7) + (var109 << 6);
                    int var118 = (var101 << 7) + (var110 << 6);
                    class111 var119 = var108.method591(var96, var97, var115, var117, var116, var118);
                    if (var119 != null) {
                        method137(Statics.field208, var100, var101, var98, -1, 0, 0, var106 + 1, var104 + 1);
                        var107.field55 = field516 + var106;
                        var107.field59 = field516 + var104;
                        var107.field54 = var119;
                        var107.field50 = var100 * 128 + var109 * 64;
                        var107.field53 = var101 * 128 + var110 * 64;
                        var107.field52 = var116;
                        if (var92 > var93) {
                            byte var120 = var92;
                            var92 = var93;
                            var93 = var120;
                        }
                        if (var105 > var94) {
                            byte var121 = var105;
                            var105 = var94;
                            var94 = var121;
                        }
                        var107.field47 = var92 + var100;
                        var107.field57 = var93 + var100;
                        var107.field56 = var101 + var105;
                        var107.field45 = var94 + var101;
                    }
                }
            }
        }
    }

    @ObfuscatedName("l.bl(IIIIIIIIII)V")
    public static final void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var9 = null;
        for (class21 var10 = (class21) field591.method3145(); var10 != null; var10 = (class21) field591.method3154()) {
            if (var10.field349 == arg0 && var10.field341 == arg1 && var10.field342 == arg2 && var10.field345 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class21();
            var9.field349 = arg0;
            var9.field345 = arg3;
            var9.field341 = arg1;
            var9.field342 = arg2;
            method211(var9);
            field591.method3147(var9);
        }
        var9.field346 = arg4;
        var9.field348 = arg5;
        var9.field340 = arg6;
        var9.field354 = arg7;
        var9.field350 = arg8;
    }

    @ObfuscatedName("i.bx(I)V")
    public static final void method212() {
        for (class21 var0 = (class21) field591.method3145(); var0 != null; var0 = (class21) field591.method3154()) {
            if (var0.field350 == -1) {
                var0.field354 = 0;
                method211(var0);
            } else {
                var0.method3182();
            }
        }
    }

    @ObfuscatedName("i.bk(Lv;B)V")
    public static final void method211(class21 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field345 == 0) {
            var1 = Statics.field1310.method1903(arg0.field349, arg0.field341, arg0.field342);
        }
        if (arg0.field345 == 1) {
            var1 = Statics.field1310.method1784(arg0.field349, arg0.field341, arg0.field342);
        }
        if (arg0.field345 == 2) {
            var1 = Statics.field1310.method1859(arg0.field349, arg0.field341, arg0.field342);
        }
        if (arg0.field345 == 3) {
            var1 = Statics.field1310.method1906(arg0.field349, arg0.field341, arg0.field342);
        }
        if (var1 != 0) {
            int var5 = Statics.field1310.method1794(arg0.field349, arg0.field341, arg0.field342, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field343 = var2;
        arg0.field351 = var3;
        arg0.field344 = var4;
    }

    @ObfuscatedName("db.bu(IIIIIIIB)V")
    public static final void method2233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field528 && Statics.field208 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1310.method1903(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1310.method1784(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1310.method1859(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1310.method1906(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1310.method1794(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1310.method1781(arg0, arg2, arg3);
                class31 var15 = class31.method2519(var12);
                if (var15.field815 != 0) {
                    field671[arg0].method3050(arg2, arg3, var13, var14, var15.field813);
                }
            }
            if (arg1 == 1) {
                Statics.field1310.method1782(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1310.method1830(arg0, arg2, arg3);
                class31 var16 = class31.method2519(var12);
                if (var16.field810 + arg2 > 103 || var16.field810 + arg3 > 103 || var16.field796 + arg2 > 103 || var16.field796 + arg3 > 103) {
                    return;
                }
                if (var16.field815 != 0) {
                    field671[arg0].method3075(arg2, arg3, var16.field810, var16.field796, var14, var16.field813);
                }
            }
            if (arg1 == 3) {
                Statics.field1310.method1912(arg0, arg2, arg3);
                class31 var17 = class31.method2519(var12);
                if (var17.field815 == 1) {
                    field671[arg0].method3048(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class9.field143[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class94 var19 = Statics.field1310;
        class162 var20 = field671[arg0];
        class31 var21 = class31.method2519(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field796;
            var23 = var21.field810;
        } else {
            var22 = var21.field810;
            var23 = var21.field796;
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
        int[][] var28 = class9.field157[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field842 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field800 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class93 var34;
            if (var21.field818 == -1 && var21.field812 == null) {
                var34 = var21.method591(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1799(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field815 == 1) {
                var20.method3051(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class93 var57;
            if (var21.field818 == -1 && var21.field812 == null) {
                var57 = var21.method591(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            if (var57 != null) {
                var19.method1774(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field815 != 0) {
                var20.method3046(arg2, arg3, var22, var23, var21.field813);
            }
        } else if (arg6 >= 12) {
            class93 var35;
            if (var21.field818 == -1 && var21.field812 == null) {
                var35 = var21.method591(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1774(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field815 != 0) {
                var20.method3046(arg2, arg3, var22, var23, var21.field813);
            }
        } else if (arg6 == 0) {
            class93 var36;
            if (var21.field818 == -1 && var21.field812 == null) {
                var36 = var21.method591(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1772(arg0, arg2, arg3, var29, var36, (class93) null, class9.field135[arg5], 0, var32, var33);
            if (var21.field815 != 0) {
                var20.method3069(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 1) {
            class93 var37;
            if (var21.field818 == -1 && var21.field812 == null) {
                var37 = var21.method591(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1772(arg0, arg2, arg3, var29, var37, (class93) null, class9.field144[arg5], 0, var32, var33);
            if (var21.field815 != 0) {
                var20.method3069(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class93 var39;
            class93 var40;
            if (var21.field818 == -1 && var21.field812 == null) {
                var39 = var21.method591(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method591(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field818, true, (class93) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1772(arg0, arg2, arg3, var29, var39, var40, class9.field135[arg5], class9.field135[var38], var32, var33);
            if (var21.field815 != 0) {
                var20.method3069(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 3) {
            class93 var41;
            if (var21.field818 == -1 && var21.field812 == null) {
                var41 = var21.method591(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1772(arg0, arg2, arg3, var29, var41, (class93) null, class9.field144[arg5], 0, var32, var33);
            if (var21.field815 != 0) {
                var20.method3069(arg2, arg3, arg6, arg5, var21.field813);
            }
        } else if (arg6 == 9) {
            class93 var42;
            if (var21.field818 == -1 && var21.field812 == null) {
                var42 = var21.method591(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1774(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field815 != 0) {
                var20.method3046(arg2, arg3, var22, var23, var21.field813);
            }
        } else if (arg6 == 4) {
            class93 var43;
            if (var21.field818 == -1 && var21.field812 == null) {
                var43 = var21.method591(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1836(arg0, arg2, arg3, var29, var43, (class93) null, class9.field135[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1903(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class31.method2519(var45 >> 14 & 0x7FFF).field819;
            }
            class93 var46;
            if (var21.field818 == -1 && var21.field812 == null) {
                var46 = var21.method591(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1836(arg0, arg2, arg3, var29, var46, (class93) null, class9.field135[arg5], 0, class9.field145[arg5] * var44, class9.field149[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1903(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class31.method2519(var48 >> 14 & 0x7FFF).field819 / 2;
            }
            class93 var49;
            if (var21.field818 == -1 && var21.field812 == null) {
                var49 = var21.method591(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1836(arg0, arg2, arg3, var29, var49, (class93) null, 256, arg5, class9.field147[arg5] * var47, class9.field148[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class93 var51;
            if (var21.field818 == -1 && var21.field812 == null) {
                var51 = var21.method591(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1836(arg0, arg2, arg3, var29, var51, (class93) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1903(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class31.method2519(var53 >> 14 & 0x7FFF).field819 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class93 var55;
            class93 var56;
            if (var21.field818 == -1 && var21.field812 == null) {
                var55 = var21.method591(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method591(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field818, true, (class93) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field818, true, (class93) null);
            }
            var19.method1836(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class9.field147[arg5] * var52, class9.field148[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("fu.bo(III)V")
    public static final void method2985(int arg0, int arg1) {
        class175 var2 = field599[Statics.field208][arg0][arg1];
        if (var2 == null) {
            Statics.field1310.method1770(Statics.field208, arg0, arg1);
            return;
        }
        int var3 = -99999999;
        class16 var4 = null;
        for (class16 var5 = (class16) var2.method3145(); var5 != null; var5 = (class16) var2.method3154()) {
            class39 var6 = class39.method2570(var5.field257);
            int var7 = var6.field977;
            if (var6.field980 == 1) {
                var7 = (var5.field256 + 1) * var7;
            }
            if (var7 > var3) {
                var3 = var7;
                var4 = var5;
            }
        }
        if (var4 == null) {
            Statics.field1310.method1770(Statics.field208, arg0, arg1);
            return;
        }
        var2.method3148(var4);
        class16 var8 = null;
        class16 var9 = null;
        for (class16 var10 = (class16) var2.method3145(); var10 != null; var10 = (class16) var2.method3154()) {
            if (var4.field257 != var10.field257) {
                if (var8 == null) {
                    var8 = var10;
                }
                if (var8.field257 != var10.field257 && var9 == null) {
                    var9 = var10;
                }
            }
        }
        int var11 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1310.method1806(Statics.field208, arg0, arg1, method505(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field208), var4, var11, var8, var9);
    }

    @ObfuscatedName("s.bm(I)V")
    public static final void method59() {
        int var0 = field507.method2201(8);
        if (var0 < field677) {
            for (int var1 = var0; var1 < field677; var1++) {
                field594[++field593 - 1] = field587[var1];
            }
        }
        if (var0 > field677) {
            throw new RuntimeException("");
        }
        field677 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field587[var2];
            class3 var4 = field562[var3];
            int var5 = field507.method2201(1);
            if (var5 == 0) {
                field587[++field677 - 1] = var3;
                var4.field451 = field516;
            } else {
                int var6 = field507.method2201(2);
                if (var6 == 0) {
                    field587[++field677 - 1] = var3;
                    var4.field451 = field516;
                    field703[++field588 - 1] = var3;
                } else if (var6 == 1) {
                    field587[++field677 - 1] = var3;
                    var4.field451 = field516;
                    int var7 = field507.method2201(3);
                    var4.method236(var7, false);
                    int var8 = field507.method2201(1);
                    if (var8 == 1) {
                        field703[++field588 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field587[++field677 - 1] = var3;
                    var4.field451 = field516;
                    int var9 = field507.method2201(3);
                    var4.method236(var9, true);
                    int var10 = field507.method2201(3);
                    var4.method236(var10, true);
                    int var11 = field507.method2201(1);
                    if (var11 == 1) {
                        field703[++field588 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field594[++field593 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("bs.bg(I)V")
    public static final void method1321() {
        while (true) {
            if (field507.method2214(field508) >= 11) {
                int var0 = field507.method2201(11);
                if (var0 != 2047) {
                    boolean var1 = false;
                    if (field562[var0] == null) {
                        field562[var0] = new class3();
                        if (field565[var0] != null) {
                            field562[var0].method17(field565[var0]);
                        }
                        var1 = true;
                    }
                    field587[++field677 - 1] = var0;
                    class3 var2 = field562[var0];
                    var2.field451 = field516;
                    int var3 = field507.method2201(5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = field507.method2201(5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = field507.method2201(1);
                    int var6 = field507.method2201(1);
                    if (var6 == 1) {
                        field703[++field588 - 1] = var0;
                    }
                    int var7 = field603[field507.method2201(3)];
                    if (var1) {
                        var2.field453 = var2.field407 = var7;
                    }
                    var2.method235(Statics.field1623.field457[0] + var3, Statics.field1623.field458[0] + var4, var5 == 1);
                    continue;
                }
            }
            field507.method2202();
            return;
        }
    }

    @ObfuscatedName("bi.bb(I)V")
    public static final void method1320() {
        field593 = 0;
        field588 = 0;
        field507.method2200();
        int var0 = field507.method2201(8);
        if (var0 < field503) {
            for (int var1 = var0; var1 < field503; var1++) {
                field594[++field593 - 1] = field696[var1];
            }
        }
        if (var0 > field503) {
            throw new RuntimeException("");
        }
        field503 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field696[var2];
            class24 var4 = field681[var3];
            int var5 = field507.method2201(1);
            if (var5 == 0) {
                field696[++field503 - 1] = var3;
                var4.field451 = field516;
            } else {
                int var6 = field507.method2201(2);
                if (var6 == 0) {
                    field696[++field503 - 1] = var3;
                    var4.field451 = field516;
                    field703[++field588 - 1] = var3;
                } else if (var6 == 1) {
                    field696[++field503 - 1] = var3;
                    var4.field451 = field516;
                    int var7 = field507.method2201(3);
                    var4.method236(var7, false);
                    int var8 = field507.method2201(1);
                    if (var8 == 1) {
                        field703[++field588 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field696[++field503 - 1] = var3;
                    var4.field451 = field516;
                    int var9 = field507.method2201(3);
                    var4.method236(var9, true);
                    int var10 = field507.method2201(3);
                    var4.method236(var10, true);
                    int var11 = field507.method2201(1);
                    if (var11 == 1) {
                        field703[++field588 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field594[++field593 - 1] = var3;
                }
            }
        }
        while (field507.method2214(field508) >= 27) {
            int var12 = field507.method2201(15);
            if (var12 == 32767) {
                break;
            }
            boolean var28 = false;
            if (field681[var12] == null) {
                field681[var12] = new class24();
                var28 = true;
            }
            class24 var29 = field681[var12];
            field696[++field503 - 1] = var12;
            var29.field451 = field516;
            var29.field384 = class30.method804(field507.method2201(14));
            int var30 = field507.method2201(5);
            if (var30 > 15) {
                var30 -= 32;
            }
            int var31 = field507.method2201(1);
            int var32 = field507.method2201(1);
            if (var32 == 1) {
                field703[++field588 - 1] = var12;
            }
            int var33 = field507.method2201(5);
            if (var33 > 15) {
                var33 -= 32;
            }
            int var34 = field603[field507.method2201(3)];
            if (var28) {
                var29.field453 = var29.field407 = var34;
            }
            var29.field409 = var29.field384.field766;
            var29.field455 = var29.field384.field761;
            if (var29.field455 == 0) {
                var29.field407 = 0;
            }
            var29.field413 = var29.field384.field772;
            var29.field414 = var29.field384.field773;
            var29.field433 = var29.field384.field774;
            var29.field416 = var29.field384.field768;
            var29.field430 = var29.field384.field769;
            var29.field461 = var29.field384.field770;
            var29.field412 = var29.field384.field765;
            var29.method235(Statics.field1623.field457[0] + var33, Statics.field1623.field458[0] + var30, var31 == 1);
        }
        field507.method2202();
        for (int var13 = 0; var13 < field588; var13++) {
            int var14 = field703[var13];
            class24 var15 = field681[var14];
            int var16 = field507.method2326();
            if ((var16 & 0x2) != 0) {
                var15.field456 = field507.method2515();
                var15.field419 = 100;
            }
            if ((var16 & 0x4) != 0) {
                var15.field429 = field507.method2359();
                var15.field448 = field507.method2360();
            }
            if ((var16 & 0x1) != 0) {
                int var17 = field507.method2352();
                int var18 = field507.method2352();
                var15.method242(var17, var18, field516);
                var15.field425 = field516 + 300;
                var15.field426 = field507.method2351();
                var15.field427 = field507.method2313();
            }
            if ((var16 & 0x40) != 0) {
                int var19 = field507.method2328();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field507.method2351();
                if (var15.field434 == var19 && var19 != -1) {
                    int var21 = class33.method2589(var19).field875;
                    if (var21 == 1) {
                        var15.field436 = 0;
                        var15.field415 = 0;
                        var15.field437 = var20;
                        var15.field418 = 0;
                    }
                    if (var21 == 2) {
                        var15.field418 = 0;
                    }
                } else if (var19 == -1 || var15.field434 == -1 || class33.method2589(var19).field862 >= class33.method2589(var15.field434).field862) {
                    var15.field434 = var19;
                    var15.field436 = 0;
                    var15.field415 = 0;
                    var15.field437 = var20;
                    var15.field418 = 0;
                    var15.field439 = var15.field462;
                }
            }
            if ((var16 & 0x80) != 0) {
                var15.field428 = field507.method2328();
                if (var15.field428 == 65535) {
                    var15.field428 = -1;
                }
            }
            if ((var16 & 0x8) != 0) {
                var15.field384 = class30.method804(field507.method2360());
                var15.field409 = var15.field384.field766;
                var15.field455 = var15.field384.field761;
                var15.field413 = var15.field384.field772;
                var15.field414 = var15.field384.field773;
                var15.field433 = var15.field384.field774;
                var15.field416 = var15.field384.field768;
                var15.field430 = var15.field384.field769;
                var15.field461 = var15.field384.field770;
                var15.field412 = var15.field384.field765;
            }
            if ((var16 & 0x20) != 0) {
                int var22 = field507.method2352();
                int var23 = field507.method2326();
                var15.method242(var22, var23, field516);
                var15.field425 = field516 + 300;
                var15.field426 = field507.method2313();
                var15.field427 = field507.method2352();
            }
            if ((var16 & 0x10) != 0) {
                var15.field447 = field507.method2360();
                int var24 = field507.method2489();
                var15.field443 = var24 >> 16;
                var15.field442 = (var24 & 0xFFFF) + field516;
                var15.field440 = 0;
                var15.field441 = 0;
                if (var15.field442 > field516) {
                    var15.field440 = -1;
                }
                if (var15.field447 == 65535) {
                    var15.field447 = -1;
                }
            }
        }
        for (int var25 = 0; var25 < field593; var25++) {
            int var26 = field594[var25];
            if (field516 != field681[var26].field451) {
                field681[var26].field384 = null;
                field681[var26] = null;
            }
        }
        if (field508 != field507.field2003) {
            throw new RuntimeException(field507.field2003 + class2.field24 + field508);
        }
        for (int var27 = 0; var27 < field503; var27++) {
            if (field681[field696[var27]] == null) {
                throw new RuntimeException(var27 + class2.field24 + field503);
            }
        }
    }

    @ObfuscatedName("cr.bp(IIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field667; var4++) {
            if (field674[var4] + field672[var4] > arg0 && field672[var4] < arg0 + arg2 && field675[var4] + field673[var4] > arg1 && field673[var4] < arg1 + arg3) {
                field634[var4] = true;
            }
        }
    }

    @ObfuscatedName("ap.bw(IIIII)V")
    public static final void method507(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field667; var4++) {
            if (field674[var4] + field672[var4] > arg0 && field672[var4] < arg0 + arg2 && field675[var4] + field673[var4] > arg1 && field673[var4] < arg1 + arg3) {
                field670[var4] = true;
            }
        }
    }

    @ObfuscatedName("ax.bi(I)V")
    public static final void method703() {
        int var0 = Statics.field1264.method3225(class133.field2125);
        for (int var1 = 0; var1 < field608; var1++) {
            int var2 = Statics.field1264.method3225(method853(var1));
            if (var2 > var0) {
                var0 = var2;
            }
        }
        var0 += 8;
        int var3 = field608 * 15 + 21;
        int var4 = class76.field1372 - var0 / 2;
        if (var0 + var4 > 765) {
            var4 = 765 - var0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        int var5 = class76.field1373;
        if (var3 + var5 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        field607 = true;
        Statics.field1356 = var4;
        Statics.field1358 = var5;
        Statics.field367 = var0;
        Statics.field269 = field608 * 15 + 22;
    }

    @ObfuscatedName("dg.bs(II)V")
    public static final void method2252(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field609[arg0];
        int var2 = field610[arg0];
        int var3 = field576[arg0];
        int var4 = field612[arg0];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 57 || var3 == 1007) {
            method1347(var4, var2, var1, field614[arg0]);
        }
        if (var3 == 18) {
            boolean var5 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var5) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(85);
            field505.method2381(var4);
            field505.method2381(Statics.field1738 + var1);
            field505.method2314(Statics.field277 + var2);
        }
        if (var3 == 34) {
            field505.method2198(146);
            field505.method2314(var1);
            field505.method2365(var2);
            field505.method2492(var4);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 23) {
            Statics.field1310.method1801(Statics.field208, var1, var2);
        }
        if (var3 == 2 && method1755(var1, var2, var4)) {
            field505.method2198(103);
            field505.method2365(Statics.field88);
            field505.method2381(Statics.field1738 + var1);
            field505.method2381(field623);
            field505.method2314(var4 >> 14 & 0x7FFF);
            field505.method2381(Statics.field277 + var2);
        }
        if (var3 == 39) {
            field505.method2198(116);
            field505.method2357(var1);
            field505.method2364(var2);
            field505.method2381(var4);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 48) {
            class3 var7 = field562[var4];
            if (var7 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var7.field457[0], var7.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(139);
                field505.method2381(var4);
            }
        }
        if (var3 == 30 && field630 == null) {
            field505.method2198(193);
            field505.method2492(var1);
            field505.method2365(var2);
            field630 = class156.method124(var2, var1);
            method166(field630);
        }
        if (var3 == 16) {
            boolean var8 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var8) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(109);
            field505.method2381(Statics.field2007);
            field505.method2492(Statics.field277 + var2);
            field505.method2314(Statics.field1782);
            field505.method2381(Statics.field1738 + var1);
            field505.method2381(var4);
            field505.method2363(Statics.field620);
        }
        if (var3 == 35) {
            field505.method2198(104);
            field505.method2364(var2);
            field505.method2314(var1);
            field505.method2381(var4);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 19) {
            boolean var10 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var10) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(78);
            field505.method2314(var4);
            field505.method2381(Statics.field277 + var2);
            field505.method2381(Statics.field1738 + var1);
        }
        if (var3 == 1002) {
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(34);
            field505.method2357(var4 >> 14 & 0x7FFF);
        }
        if (var3 == 45) {
            class3 var12 = field562[var4];
            if (var12 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var12.field457[0], var12.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(171);
                field505.method2381(var4);
            }
        }
        if (var3 == 17) {
            boolean var13 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var13) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(93);
            field505.method2357(Statics.field277 + var2);
            field505.method2357(Statics.field1738 + var1);
            field505.method2492(field623);
            field505.method2492(var4);
            field505.method2363(Statics.field88);
        }
        if (var3 == 41) {
            field505.method2198(1);
            field505.method2363(var2);
            field505.method2492(var1);
            field505.method2492(var4);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 9) {
            class24 var15 = field681[var4];
            if (var15 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var15.field457[0], var15.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(137);
                field505.method2314(var4);
            }
        }
        if (var3 == 36) {
            field505.method2198(55);
            field505.method2363(var2);
            field505.method2314(var1);
            field505.method2314(var4);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 50) {
            class3 var16 = field562[var4];
            if (var16 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var16.field457[0], var16.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(125);
                field505.method2381(var4);
            }
        }
        if (var3 == 21) {
            boolean var17 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var17) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(111);
            field505.method2381(Statics.field277 + var2);
            field505.method2492(Statics.field1738 + var1);
            field505.method2314(var4);
        }
        if (var3 == 10) {
            class24 var19 = field681[var4];
            if (var19 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var19.field457[0], var19.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(154);
                field505.method2381(var4);
            }
        }
        if (var3 == 43) {
            field505.method2198(9);
            field505.method2314(var4);
            field505.method2364(var2);
            field505.method2357(var1);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 40) {
            field505.method2198(84);
            field505.method2314(var1);
            field505.method2492(var4);
            field505.method2363(var2);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 26) {
            field505.method2198(147);
            for (class4 var20 = (class4) field627.method3141(); var20 != null; var20 = (class4) field627.method3128()) {
                if (var20.field64 == 0 || var20.field64 == 3) {
                    method2562(var20, true);
                }
            }
            if (field630 != null) {
                method166(field630);
                field630 = null;
            }
        }
        if (var3 == 44) {
            class3 var21 = field562[var4];
            if (var21 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var21.field457[0], var21.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(83);
                field505.method2381(var4);
            }
        }
        if (var3 == 29) {
            field505.method2198(36);
            field505.method2316(var2);
            class156 var22 = class156.method2702(var2);
            if (var22.field2624 != null && var22.field2624[0][0] == 5) {
                int var23 = var22.field2624[0][1];
                if (class157.field2649[var23] != var22.field2549[0]) {
                    class157.field2649[var23] = var22.field2549[0];
                    method61(var23);
                }
            }
        }
        if (var3 == 25) {
            class156 var24 = class156.method124(var2, var1);
            if (var24 != null) {
                if (field660) {
                    class156 var25 = class156.method124(Statics.field88, field623);
                    if (var25 != null && var25.field2607 != null) {
                        class1 var26 = new class1();
                        var26.field2 = var25;
                        var26.field4 = var25.field2607;
                        class25.method790(var26);
                    }
                    field660 = false;
                    method166(var25);
                }
                int var27 = method2194(var24);
                int var28 = var27 >> 11 & 0x3F;
                class156 var30 = class156.method124(var2, var1);
                if (var30 != null && var30.field2606 != null) {
                    class1 var31 = new class1();
                    var31.field2 = var30;
                    var31.field4 = var30.field2606;
                    class25.method790(var31);
                }
                field660 = true;
                Statics.field88 = var2;
                field623 = var1;
                Statics.field873 = var28;
                method166(var30);
                field642 = 0;
                field624 = method182(var24);
                if (field624 == null) {
                    field624 = "Null";
                }
                if (var24.field2527) {
                    field625 = var24.field2588 + class2.method1139(16777215);
                } else {
                    field625 = class2.method1139(65280) + var24.field2602 + class2.method1139(16777215);
                }
            }
            return;
        }
        if (var3 == 37) {
            field505.method2198(192);
            field505.method2314(var1);
            field505.method2314(var4);
            field505.method2363(var2);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 28) {
            field505.method2198(36);
            field505.method2316(var2);
            class156 var32 = class156.method2702(var2);
            if (var32.field2624 != null && var32.field2624[0][0] == 5) {
                int var33 = var32.field2624[0][1];
                class157.field2649[var33] = 1 - class157.field2649[var33];
                method61(var33);
            }
        }
        if (var3 == 51) {
            class3 var34 = field562[var4];
            if (var34 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var34.field457[0], var34.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(201);
                field505.method2381(var4);
            }
        }
        if (var3 == 1001) {
            method1755(var1, var2, var4);
            field505.method2198(12);
            field505.method2381(var4 >> 14 & 0x7FFF);
            field505.method2357(Statics.field1738 + var1);
            field505.method2381(Statics.field277 + var2);
        }
        if (var3 == 8) {
            class24 var35 = field681[var4];
            if (var35 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var35.field457[0], var35.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(10);
                field505.method2357(var4);
                field505.method2381(field623);
                field505.method2364(Statics.field88);
            }
        }
        if (var3 == 15) {
            class3 var36 = field562[var4];
            if (var36 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var36.field457[0], var36.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(112);
                field505.method2364(Statics.field88);
                field505.method2314(field623);
                field505.method2357(var4);
            }
        }
        if (var3 == 12) {
            class24 var37 = field681[var4];
            if (var37 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var37.field457[0], var37.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(118);
                field505.method2314(var4);
            }
        }
        if (var3 == 14) {
            class3 var38 = field562[var4];
            if (var38 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var38.field457[0], var38.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(231);
                field505.method2314(Statics.field2007);
                field505.method2492(var4);
                field505.method2365(Statics.field620);
                field505.method2492(Statics.field1782);
            }
        }
        if (var3 == 31) {
            field505.method2198(187);
            field505.method2357(var1);
            field505.method2363(Statics.field620);
            field505.method2381(Statics.field2007);
            field505.method2314(var4);
            field505.method2314(Statics.field1782);
            field505.method2363(var2);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 24) {
            class156 var39 = class156.method2702(var2);
            boolean var40 = true;
            if (var39.field2532 > 0) {
                var40 = method504(var39);
            }
            if (var40) {
                field505.method2198(36);
                field505.method2316(var2);
            }
        }
        if (var3 == 11) {
            class24 var41 = field681[var4];
            if (var41 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var41.field457[0], var41.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(42);
                field505.method2357(var4);
            }
        }
        if (var3 == 5) {
            method1755(var1, var2, var4);
            field505.method2198(210);
            field505.method2492(Statics.field277 + var2);
            field505.method2381(var4 >> 14 & 0x7FFF);
            field505.method2492(Statics.field1738 + var1);
        }
        if (var3 == 1 && method1755(var1, var2, var4)) {
            field505.method2198(124);
            field505.method2381(var4 >> 14 & 0x7FFF);
            field505.method2492(Statics.field2007);
            field505.method2365(Statics.field620);
            field505.method2357(Statics.field277 + var2);
            field505.method2357(Statics.field1738 + var1);
            field505.method2357(Statics.field1782);
        }
        if (var3 == 22) {
            boolean var42 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var42) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(250);
            field505.method2492(Statics.field277 + var2);
            field505.method2357(var4);
            field505.method2314(Statics.field1738 + var1);
        }
        if (var3 == 13) {
            class24 var44 = field681[var4];
            if (var44 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var44.field457[0], var44.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(173);
                field505.method2492(var4);
            }
        }
        if (var3 == 1005) {
            class156 var45 = class156.method2702(var2);
            if (var45 == null || var45.field2631[var1] < 100000) {
                field505.method2198(194);
                field505.method2492(var4);
            } else {
                method56(0, "", var45.field2631[var1] + " x " + class39.method2570(var4).field965);
            }
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 58) {
            field505.method2198(50);
            field505.method2364(Statics.field88);
            field505.method2314(var1);
            field505.method2357(field623);
            field505.method2365(var2);
        }
        if (var3 == 38) {
            if (field660) {
                class156 var46 = class156.method124(Statics.field88, field623);
                if (var46 != null && var46.field2607 != null) {
                    class1 var47 = new class1();
                    var47.field2 = var46;
                    var47.field4 = var46.field2607;
                    class25.method790(var47);
                }
                field660 = false;
                method166(var46);
            }
            class156 var48 = class156.method2702(var2);
            field642 = 1;
            Statics.field2007 = var1;
            Statics.field620 = var2;
            Statics.field1782 = var4;
            method166(var48);
            field643 = class2.method1139(16748608) + class39.method2570(var4).field965 + class2.method1139(16777215);
            if (field643 == null) {
                field643 = "null";
            }
            return;
        }
        if (var3 == 32) {
            field505.method2198(33);
            field505.method2492(var4);
            field505.method2363(Statics.field88);
            field505.method2381(field623);
            field505.method2363(var2);
            field505.method2314(var1);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 46) {
            class3 var49 = field562[var4];
            if (var49 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var49.field457[0], var49.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(157);
                field505.method2357(var4);
            }
        }
        if (var3 == 42) {
            field505.method2198(254);
            field505.method2357(var4);
            field505.method2316(var2);
            field505.method2492(var1);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 3) {
            method1755(var1, var2, var4);
            field505.method2198(110);
            field505.method2492(var4 >> 14 & 0x7FFF);
            field505.method2314(Statics.field1738 + var1);
            field505.method2381(Statics.field277 + var2);
        }
        if (var3 == 6) {
            method1755(var1, var2, var4);
            field505.method2198(121);
            field505.method2357(var4 >> 14 & 0x7FFF);
            field505.method2357(Statics.field1738 + var1);
            field505.method2314(Statics.field277 + var2);
        }
        if (var3 == 49) {
            class3 var50 = field562[var4];
            if (var50 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var50.field457[0], var50.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(82);
                field505.method2492(var4);
            }
        }
        if (var3 == 1003) {
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            class24 var51 = field681[var4];
            if (var51 != null) {
                class30 var52 = var51.field384;
                if (var52.field790 != null) {
                    var52 = var52.method564();
                }
                if (var52 != null) {
                    field505.method2198(246);
                    field505.method2357(var52.field764);
                }
            }
        }
        if (var3 == 4) {
            method1755(var1, var2, var4);
            field505.method2198(71);
            field505.method2357(var4 >> 14 & 0x7FFF);
            field505.method2314(Statics.field277 + var2);
            field505.method2357(Statics.field1738 + var1);
        }
        if (var3 == 33) {
            field505.method2198(28);
            field505.method2381(var4);
            field505.method2357(var1);
            field505.method2365(var2);
            field626 = 0;
            Statics.field1411 = class156.method2702(var2);
            field653 = var1;
        }
        if (var3 == 1004) {
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(194);
            field505.method2492(var4);
        }
        if (var3 == 20) {
            boolean var53 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 0, 0, 0, 2);
            if (!var53) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var1, var2, false, 0, 0, 1, 1, 0, 2);
            }
            field572 = class76.field1372;
            field519 = class76.field1373;
            field563 = 2;
            field511 = 0;
            field505.method2198(200);
            field505.method2492(Statics.field277 + var2);
            field505.method2381(Statics.field1738 + var1);
            field505.method2381(var4);
        }
        if (var3 == 47) {
            class3 var55 = field562[var4];
            if (var55 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var55.field457[0], var55.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(48);
                field505.method2492(var4);
            }
        }
        if (var3 == 7) {
            class24 var56 = field681[var4];
            if (var56 != null) {
                method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var56.field457[0], var56.field458[0], false, 0, 0, 1, 1, 0, 2);
                field572 = class76.field1372;
                field519 = class76.field1373;
                field563 = 2;
                field511 = 0;
                field505.method2198(59);
                field505.method2381(var4);
                field505.method2364(Statics.field620);
                field505.method2357(Statics.field1782);
                field505.method2381(Statics.field2007);
            }
        }
        if (field642 != 0) {
            field642 = 0;
            method166(class156.method2702(Statics.field620));
        }
        if (field660 && field660) {
            class156 var57 = class156.method124(Statics.field88, field623);
            if (var57 != null && var57.field2607 != null) {
                class1 var58 = new class1();
                var58.field2 = var57;
                var58.field4 = var57.field2607;
                class25.method790(var58);
            }
            field660 = false;
            method166(var57);
        }
        if (Statics.field1411 != null && field626 == 0) {
            method166(Statics.field1411);
        }
    }

    @ObfuscatedName("bq.bq(IIILjava/lang/String;B)V")
    public static void method1347(int arg0, int arg1, int arg2, String arg3) {
        class156 var4 = class156.method124(arg1, arg2);
        if (var4 == null) {
            return;
        }
        if (var4.field2601 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field5 = arg0;
            var5.field9 = arg3;
            var5.field4 = var4.field2601;
            class25.method790(var5);
        }
        boolean var6 = true;
        if (var4.field2532 > 0) {
            var6 = method504(var4);
        }
        if (!var6) {
            return;
        }
        int var7 = method2194(var4);
        int var8 = arg0 - 1;
        boolean var9 = (var7 >> var8 + 1 & 0x1) != 0;
        if (!var9) {
            return;
        }
        if (arg0 == 1) {
            field505.method2198(191);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 2) {
            field505.method2198(165);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 3) {
            field505.method2198(52);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 4) {
            field505.method2198(196);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 5) {
            field505.method2198(32);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 6) {
            field505.method2198(21);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 7) {
            field505.method2198(161);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 8) {
            field505.method2198(114);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 9) {
            field505.method2198(3);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
        if (arg0 == 10) {
            field505.method2198(0);
            field505.method2316(arg1);
            field505.method2314(arg2);
        }
    }

    @ObfuscatedName("af.bc(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method637(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field607 || field608 >= 500) {
            return;
        }
        field613[field608] = arg0;
        field614[field608] = arg1;
        field576[field608] = arg2;
        field612[field608] = arg3;
        field609[field608] = arg4;
        field610[field608] = arg5;
        field608++;
    }

    @ObfuscatedName("aj.bz(II)Ljava/lang/String;")
    public static String method853(int arg0) {
        return field614[arg0].length() > 0 ? field613[arg0] + class133.field2206 + field614[arg0] : field613[arg0];
    }

    @ObfuscatedName("k.be(Lav;IIII)V")
    public static final void method221(class30 arg0, int arg1, int arg2, int arg3) {
        if (field608 >= 400) {
            return;
        }
        if (arg0.field790 != null) {
            arg0 = arg0.method564();
        }
        if (arg0 == null || !arg0.field783) {
            return;
        }
        String var4 = arg0.field775;
        if (arg0.field782 != 0) {
            var4 = var4 + method30(arg0.field782, Statics.field1623.field46) + " " + class2.field23 + class133.field2202 + arg0.field782 + class2.field20;
        }
        if (field642 == 1) {
            method637(class133.field2196, field643 + " " + class2.field25 + " " + class2.method1139(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field660) {
            String[] var5 = arg0.field780;
            if (field636) {
                var5 = method22(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class133.field2198)) {
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
                        method637(var5[var6], class2.method1139(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class133.field2198)) {
                        short var9 = 0;
                        if (arg0.field782 > Statics.field1623.field46) {
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
                        method637(var5[var8], class2.method1139(16776960) + var4, var10, arg1, arg2, arg3);
                    }
                }
            }
            method637(class133.field2162, class2.method1139(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field873 & 0x2) == 2) {
            method637(field624, field625 + " " + class2.field25 + " " + class2.method1139(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("t.by(Lf;IIII)V")
    public static final void method157(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field1623 == arg0 || field608 >= 400) {
            return;
        }
        String var4;
        if (arg0.field51 == 0) {
            var4 = arg0.field58 + method30(arg0.field46, Statics.field1623.field46) + " " + class2.field23 + class133.field2202 + arg0.field46 + class2.field20;
        } else {
            var4 = arg0.field58 + " " + class2.field23 + class133.field2203 + arg0.field51 + class2.field20;
        }
        if (field642 == 1) {
            method637(class133.field2196, field643 + " " + class2.field25 + " " + class2.method1139(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field660) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field719[var5] != null) {
                    short var6 = 0;
                    if (field719[var5].equalsIgnoreCase(class133.field2198)) {
                        if (arg0.field46 > Statics.field1623.field46) {
                            var6 = 2000;
                        }
                        if (Statics.field1623.field60 != 0 && arg0.field60 != 0) {
                            if (Statics.field1623.field60 == arg0.field60) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field597[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field595[var5] + var6;
                    method637(field719[var5], class2.method1139(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field873 & 0x8) == 8) {
            method637(field624, field625 + " " + class2.field25 + " " + class2.method1139(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field608; var9++) {
            if (field576[var9] == 23) {
                field614[var9] = class2.method1139(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("e.bn(III)Ljava/lang/String;")
    public static final String method30(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method1139(16711680);
        } else if (var2 < -6) {
            return class2.method1139(16723968);
        } else if (var2 < -3) {
            return class2.method1139(16740352);
        } else if (var2 < 0) {
            return class2.method1139(16756736);
        } else if (var2 > 9) {
            return class2.method1139(65280);
        } else if (var2 > 6) {
            return class2.method1139(4259584);
        } else if (var2 > 3) {
            return class2.method1139(8453888);
        } else if (var2 > 0) {
            return class2.method1139(12648192);
        } else {
            return class2.method1139(16776960);
        }
    }

    @ObfuscatedName("cw.bv(IIIIIIIII)V")
    public static final void method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class156.method1920(arg0)) {
            Statics.field110 = null;
            method2804(Statics.field2632[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field110 != null) {
                method2804(Statics.field110, -1412584499, arg1, arg2, arg3, arg4, Statics.field339, Statics.field1208, arg7);
                Statics.field110 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field634[var8] = true;
            }
        } else {
            field634[arg7] = true;
        }
    }

    @ObfuscatedName("ei.ba([Lej;IIIIIIIII)V")
    public static final void method2804(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class88.method1693(arg2, arg3, arg4, arg5);
        class103.method2012();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class156 var10 = arg0[var9];
            if (var10 != null && (var10.field2539 == arg1 || arg1 == -1412584499 && field598 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field672[field667] = var10.field2533 + arg6;
                    field673[field667] = var10.field2534 + arg7;
                    field674[field667] = var10.field2537;
                    field675[field667] = var10.field2538;
                    var11 = ++field667 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2565 = var11;
                var10.field2571 = field516;
                if (!var10.field2527 || !method165(var10)) {
                    if (var10.field2532 > 0) {
                        method625(var10);
                    }
                    int var12 = var10.field2533 + arg6;
                    int var13 = var10.field2534 + arg7;
                    int var14 = var10.field2595;
                    if (field598 == var10) {
                        if (arg1 != -1412584499 && !var10.field2593) {
                            Statics.field110 = arg0;
                            Statics.field339 = arg6;
                            Statics.field1208 = arg7;
                            continue;
                        }
                        if (field676 && field502) {
                            int var15 = class76.field1365;
                            int var16 = class76.field1369;
                            int var17 = var15 - field639;
                            int var18 = var16 - field640;
                            if (var17 < field554) {
                                var17 = field554;
                            }
                            if (var10.field2537 + var17 > field554 + field638.field2537) {
                                var17 = field554 + field638.field2537 - var10.field2537;
                            }
                            if (var18 < field644) {
                                var18 = field644;
                            }
                            if (var10.field2538 + var18 > field644 + field638.field2538) {
                                var18 = field644 + field638.field2538 - var10.field2538;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field2593) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2643 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2643 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2537 + var12;
                        int var26 = var10.field2538 + var13;
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
                        int var29 = var10.field2537 + var12;
                        int var30 = var10.field2538 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2527 || var19 < var21 && var20 < var22) {
                        if (var10.field2532 != 0) {
                            if (var10.field2532 == 1337) {
                                field615 = var12;
                                field691 = var13;
                                int var31 = var10.field2537;
                                int var32 = var10.field2538;
                                class88.method1693(var12, var13, var12 + var31, var13 + var32);
                                class103.method2012();
                                field683++;
                                method2095(true);
                                method220(true);
                                method2095(false);
                                method220(false);
                                method107();
                                for (class19 var33 = (class19) field602.method3145(); var33 != null; var33 = (class19) field602.method3154()) {
                                    if (Statics.field208 != var33.field282 || var33.field294) {
                                        var33.method3182();
                                    } else if (field516 >= var33.field283) {
                                        var33.method162(field544);
                                        if (var33.field294) {
                                            var33.method3182();
                                        } else {
                                            Statics.field1310.method1775(var33.field282, var33.field285, var33.field291, var33.field287, 60, var33, 0, -1, false);
                                        }
                                    }
                                }
                                if (!field711) {
                                    int var34 = field551;
                                    if (field504 / 256 > var34) {
                                        var34 = field504 / 256;
                                    }
                                    if (field712[4] && field714[4] + 128 > var34) {
                                        var34 = field714[4] + 128;
                                    }
                                    int var35 = field552 + field536 & 0x7FF;
                                    method2588(Statics.field2305, method505(Statics.field1623.field446, Statics.field1623.field406, Statics.field208) - 50, Statics.field353, var34, var35, var34 * 3 + 600);
                                }
                                int var48;
                                if (field711) {
                                    int var49 = method505(Statics.field1492, Statics.field361, Statics.field208);
                                    int var50;
                                    if (var49 - Statics.field1407 >= 800 || (class9.field143[Statics.field208][Statics.field1492 >> 7][Statics.field361 >> 7] & 0x4) == 0) {
                                        var50 = 3;
                                    } else {
                                        var50 = Statics.field208;
                                    }
                                    var48 = var50;
                                } else {
                                    int var36 = 3;
                                    if (Statics.field1262 < 310) {
                                        int var37 = Statics.field1492 >> 7;
                                        int var38 = Statics.field361 >> 7;
                                        int var39 = Statics.field1623.field446 >> 7;
                                        int var40 = Statics.field1623.field406 >> 7;
                                        if ((class9.field143[Statics.field208][var37][var38] & 0x4) != 0) {
                                            var36 = Statics.field208;
                                        }
                                        int var41;
                                        if (var39 > var37) {
                                            var41 = var39 - var37;
                                        } else {
                                            var41 = var37 - var39;
                                        }
                                        int var42;
                                        if (var40 > var38) {
                                            var42 = var40 - var38;
                                        } else {
                                            var42 = var38 - var40;
                                        }
                                        if (var41 > var42) {
                                            int var43 = var42 * 65536 / var41;
                                            int var44 = 32768;
                                            while (var37 != var39) {
                                                if (var37 < var39) {
                                                    var37++;
                                                } else if (var37 > var39) {
                                                    var37--;
                                                }
                                                if ((class9.field143[Statics.field208][var37][var38] & 0x4) != 0) {
                                                    var36 = Statics.field208;
                                                }
                                                var44 += var43;
                                                if (var44 >= 65536) {
                                                    var44 -= 65536;
                                                    if (var38 < var40) {
                                                        var38++;
                                                    } else if (var38 > var40) {
                                                        var38--;
                                                    }
                                                    if ((class9.field143[Statics.field208][var37][var38] & 0x4) != 0) {
                                                        var36 = Statics.field208;
                                                    }
                                                }
                                            }
                                        } else {
                                            int var45 = var41 * 65536 / var42;
                                            int var46 = 32768;
                                            while (var38 != var40) {
                                                if (var38 < var40) {
                                                    var38++;
                                                } else if (var38 > var40) {
                                                    var38--;
                                                }
                                                if ((class9.field143[Statics.field208][var37][var38] & 0x4) != 0) {
                                                    var36 = Statics.field208;
                                                }
                                                var46 += var45;
                                                if (var46 >= 65536) {
                                                    var46 -= 65536;
                                                    if (var37 < var39) {
                                                        var37++;
                                                    } else if (var37 > var39) {
                                                        var37--;
                                                    }
                                                    if ((class9.field143[Statics.field208][var37][var38] & 0x4) != 0) {
                                                        var36 = Statics.field208;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if ((class9.field143[Statics.field208][Statics.field1623.field446 >> 7][Statics.field1623.field406 >> 7] & 0x4) != 0) {
                                        var36 = Statics.field208;
                                    }
                                    var48 = var36;
                                }
                                int var51 = Statics.field1492;
                                int var52 = Statics.field1407;
                                int var53 = Statics.field361;
                                int var54 = Statics.field1262;
                                int var55 = Statics.field17;
                                for (int var56 = 0; var56 < 5; var56++) {
                                    if (field712[var56]) {
                                        int var57 = (int) (Math.random() * (double) (field713[var56] * 2 + 1) - (double) field713[var56] + Math.sin((double) field589[var56] / 100.0D * (double) field716[var56]) * (double) field714[var56]);
                                        if (var56 == 0) {
                                            Statics.field1492 += var57;
                                        }
                                        if (var56 == 1) {
                                            Statics.field1407 += var57;
                                        }
                                        if (var56 == 2) {
                                            Statics.field361 += var57;
                                        }
                                        if (var56 == 3) {
                                            Statics.field17 = Statics.field17 + var57 & 0x7FF;
                                        }
                                        if (var56 == 4) {
                                            Statics.field1262 += var57;
                                            if (Statics.field1262 < 128) {
                                                Statics.field1262 = 128;
                                            }
                                            if (Statics.field1262 > 383) {
                                                Statics.field1262 = 383;
                                            }
                                        }
                                    }
                                }
                                int var58 = class76.field1365;
                                int var59 = class76.field1369;
                                if (var58 >= var12 && var58 < var12 + var31 && var59 >= var13 && var59 < var13 + var32) {
                                    class111.field1889 = true;
                                    class111.field1851 = 0;
                                    class111.field1890 = class76.field1365 - var12;
                                    class111.field1891 = class76.field1369 - var13;
                                } else {
                                    class111.field1889 = false;
                                    class111.field1851 = 0;
                                }
                                method1346();
                                class88.method1699(var12, var13, var31, var32, 0);
                                method1346();
                                Statics.field1310.method1802(Statics.field1492, Statics.field1407, Statics.field361, Statics.field1262, Statics.field17, var48);
                                method1346();
                                Statics.field1310.method1778();
                                method1103(var12, var13, var31, var32);
                                Statics.method123(var12, var13);
                                ((class109) Statics.field1759).method2106(field544);
                                method2935(var12, var13, var31, var32);
                                Statics.field1492 = var51;
                                Statics.field1407 = var52;
                                Statics.field361 = var53;
                                Statics.field1262 = var54;
                                Statics.field17 = var55;
                                if (field475 && class151.method1758(true, false) == 0) {
                                    field475 = false;
                                }
                                if (field475) {
                                    class88.method1699(var12, var13, var31, var32, 0);
                                    method8(class133.field2143, false);
                                }
                                if (!field475 && !field607 && var58 >= var12 && var58 < var12 + var31 && var59 >= var13 && var59 < var13 + var32) {
                                    if (field642 == 0 && !field660) {
                                        method637(class133.field2201, "", 23, 0, var58 - var12, var59 - var13);
                                    }
                                    int var60 = -1;
                                    for (int var61 = 0; var61 < class111.field1851; var61++) {
                                        int var62 = class111.field1893[var61];
                                        int var63 = var62 & 0x7F;
                                        int var64 = var62 >> 7 & 0x7F;
                                        int var65 = var62 >> 29 & 0x3;
                                        int var66 = var62 >> 14 & 0x7FFF;
                                        if (var60 != var62) {
                                            var60 = var62;
                                            if (var65 == 2 && Statics.field1310.method1794(Statics.field208, var63, var64, var62) >= 0) {
                                                class31 var67 = class31.method2519(var66);
                                                if (var67.field812 != null) {
                                                    var67 = var67.method594();
                                                }
                                                if (var67 == null) {
                                                    continue;
                                                }
                                                if (field642 == 1) {
                                                    method637(class133.field2196, field643 + " " + class2.field25 + " " + class2.method1139(65535) + var67.field805, 1, var62, var63, var64);
                                                } else if (!field660) {
                                                    String[] var68 = var67.field822;
                                                    if (field636) {
                                                        var68 = method22(var68);
                                                    }
                                                    if (var68 != null) {
                                                        for (int var69 = 4; var69 >= 0; var69--) {
                                                            if (var68[var69] != null) {
                                                                short var70 = 0;
                                                                if (var69 == 0) {
                                                                    var70 = 3;
                                                                }
                                                                if (var69 == 1) {
                                                                    var70 = 4;
                                                                }
                                                                if (var69 == 2) {
                                                                    var70 = 5;
                                                                }
                                                                if (var69 == 3) {
                                                                    var70 = 6;
                                                                }
                                                                if (var69 == 4) {
                                                                    var70 = 1001;
                                                                }
                                                                method637(var68[var69], class2.method1139(65535) + var67.field805, var70, var62, var63, var64);
                                                            }
                                                        }
                                                    }
                                                    method637(class133.field2162, class2.method1139(65535) + var67.field805, 1002, var67.field802 << 14, var63, var64);
                                                } else if ((Statics.field873 & 0x4) == 4) {
                                                    method637(field624, field625 + " " + class2.field25 + " " + class2.method1139(65535) + var67.field805, 2, var62, var63, var64);
                                                }
                                            }
                                            if (var65 == 1) {
                                                class24 var71 = field681[var66];
                                                if (var71.field384.field766 == 1 && (var71.field446 & 0x7F) == 64 && (var71.field406 & 0x7F) == 64) {
                                                    for (int var72 = 0; var72 < field503; var72++) {
                                                        class24 var73 = field681[field696[var72]];
                                                        if (var73 != null && var71 != var73 && var73.field384.field766 == 1 && var71.field446 == var73.field446 && var71.field406 == var73.field406) {
                                                            method221(var73.field384, field696[var72], var63, var64);
                                                        }
                                                    }
                                                    for (int var74 = 0; var74 < field677; var74++) {
                                                        class3 var75 = field562[field587[var74]];
                                                        if (var75 != null && var71.field446 == var75.field446 && var71.field406 == var75.field406) {
                                                            method157(var75, field587[var74], var63, var64);
                                                        }
                                                    }
                                                }
                                                method221(var71.field384, var66, var63, var64);
                                            }
                                            if (var65 == 0) {
                                                class3 var76 = field562[var66];
                                                if ((var76.field446 & 0x7F) == 64 && (var76.field406 & 0x7F) == 64) {
                                                    for (int var77 = 0; var77 < field503; var77++) {
                                                        class24 var78 = field681[field696[var77]];
                                                        if (var78 != null && var78.field384.field766 == 1 && var76.field446 == var78.field446 && var76.field406 == var78.field406) {
                                                            method221(var78.field384, field696[var77], var63, var64);
                                                        }
                                                    }
                                                    for (int var79 = 0; var79 < field677; var79++) {
                                                        class3 var80 = field562[field587[var79]];
                                                        if (var80 != null && var76 != var80 && var76.field446 == var80.field446 && var76.field406 == var80.field406) {
                                                            method157(var80, field587[var79], var63, var64);
                                                        }
                                                    }
                                                }
                                                method157(var76, var66, var63, var64);
                                            }
                                            if (var65 == 3) {
                                                class175 var81 = field599[Statics.field208][var63][var64];
                                                if (var81 != null) {
                                                    for (class16 var82 = (class16) var81.method3153(); var82 != null; var82 = (class16) var81.method3155()) {
                                                        class39 var83 = class39.method2570(var82.field257);
                                                        if (field642 == 1) {
                                                            method637(class133.field2196, field643 + " " + class2.field25 + " " + class2.method1139(16748608) + var83.field965, 16, var82.field257, var63, var64);
                                                        } else if (!field660) {
                                                            String[] var84 = var83.field979;
                                                            if (field636) {
                                                                var84 = method22(var84);
                                                            }
                                                            for (int var85 = 4; var85 >= 0; var85--) {
                                                                if (var84 != null && var84[var85] != null) {
                                                                    byte var86 = 0;
                                                                    if (var85 == 0) {
                                                                        var86 = 18;
                                                                    }
                                                                    if (var85 == 1) {
                                                                        var86 = 19;
                                                                    }
                                                                    if (var85 == 2) {
                                                                        var86 = 20;
                                                                    }
                                                                    if (var85 == 3) {
                                                                        var86 = 21;
                                                                    }
                                                                    if (var85 == 4) {
                                                                        var86 = 22;
                                                                    }
                                                                    method637(var84[var85], class2.method1139(16748608) + var83.field965, var86, var82.field257, var63, var64);
                                                                } else if (var85 == 2) {
                                                                    method637(class133.field2056, class2.method1139(16748608) + var83.field965, 20, var82.field257, var63, var64);
                                                                }
                                                            }
                                                            method637(class133.field2162, class2.method1139(16748608) + var83.field965, 1004, var82.field257, var63, var64);
                                                        } else if ((Statics.field873 & 0x1) == 1) {
                                                            method637(field624, field625 + " " + class2.field25 + " " + class2.method1139(16748608) + var83.field965, 17, var82.field257, var63, var64);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                class88.method1693(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2532 == 1338) {
                                method2007(var12, var13, var11);
                                class88.method1693(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        int var87 = class76.field1365;
                        int var88 = class76.field1369;
                        if (!field607 && var87 >= var19 && var88 >= var20 && var87 < var21 && var88 < var22) {
                            int var89 = var87 - var12;
                            int var90 = var88 - var13;
                            if (var10.field2531 == 1) {
                                method637(var10.field2629, "", 24, 0, 0, var10.field2528);
                            }
                            if (var10.field2531 == 2 && !field660) {
                                String var91 = method182(var10);
                                if (var91 != null) {
                                    method637(var91, class2.method1139(65280) + var10.field2602, 25, 0, -1, var10.field2528);
                                }
                            }
                            if (var10.field2531 == 3) {
                                method637(class133.field2284, "", 26, 0, 0, var10.field2528);
                            }
                            if (var10.field2531 == 4) {
                                method637(var10.field2629, "", 28, 0, 0, var10.field2528);
                            }
                            if (var10.field2531 == 5) {
                                method637(var10.field2629, "", 29, 0, 0, var10.field2528);
                            }
                            if (var10.field2531 == 6 && field630 == null) {
                                method637(var10.field2629, "", 30, 0, -1, var10.field2528);
                            }
                            if (var10.field2643 == 2) {
                                int var92 = 0;
                                for (int var93 = 0; var93 < var10.field2538; var93++) {
                                    for (int var94 = 0; var94 < var10.field2537; var94++) {
                                        int var95 = (var10.field2614 + 32) * var94;
                                        int var96 = (var10.field2582 + 32) * var93;
                                        if (var92 < 20) {
                                            var95 += var10.field2583[var92];
                                            var96 += var10.field2584[var92];
                                        }
                                        if (var89 >= var95 && var90 >= var96 && var89 < var95 + 32 && var90 < var96 + 32) {
                                            field573 = var92;
                                            Statics.field2294 = var10;
                                            if (var10.field2630[var92] > 0) {
                                                class39 var97 = class39.method2570(var10.field2630[var92] - 1);
                                                if (field642 == 1 && class160.method2990(method2194(var10))) {
                                                    if (Statics.field620 != var10.field2528 || Statics.field2007 != var92) {
                                                        method637(class133.field2196, field643 + " " + class2.field25 + " " + class2.method1139(16748608) + var97.field965, 31, var97.field996, var92, var10.field2528);
                                                    }
                                                } else if (!field660 || !class160.method2990(method2194(var10))) {
                                                    String[] var98 = var97.field970;
                                                    if (field636) {
                                                        var98 = method22(var98);
                                                    }
                                                    if (class160.method2990(method2194(var10))) {
                                                        for (int var99 = 4; var99 >= 3; var99--) {
                                                            if (var98 != null && var98[var99] != null) {
                                                                byte var100;
                                                                if (var99 == 3) {
                                                                    var100 = 36;
                                                                } else {
                                                                    var100 = 37;
                                                                }
                                                                method637(var98[var99], class2.method1139(16748608) + var97.field965, var100, var97.field996, var92, var10.field2528);
                                                            } else if (var99 == 4) {
                                                                method637(class133.field2099, class2.method1139(16748608) + var97.field965, 37, var97.field996, var92, var10.field2528);
                                                            }
                                                        }
                                                    }
                                                    if (class160.method2765(method2194(var10))) {
                                                        method637(class133.field2196, class2.method1139(16748608) + var97.field965, 38, var97.field996, var92, var10.field2528);
                                                    }
                                                    if (class160.method2990(method2194(var10)) && var98 != null) {
                                                        for (int var101 = 2; var101 >= 0; var101--) {
                                                            if (var98[var101] != null) {
                                                                byte var102 = 0;
                                                                if (var101 == 0) {
                                                                    var102 = 33;
                                                                }
                                                                if (var101 == 1) {
                                                                    var102 = 34;
                                                                }
                                                                if (var101 == 2) {
                                                                    var102 = 35;
                                                                }
                                                                method637(var98[var101], class2.method1139(16748608) + var97.field965, var102, var97.field996, var92, var10.field2528);
                                                            }
                                                        }
                                                    }
                                                    String[] var103 = var10.field2573;
                                                    if (field636) {
                                                        var103 = method22(var103);
                                                    }
                                                    if (var103 != null) {
                                                        for (int var104 = 4; var104 >= 0; var104--) {
                                                            if (var103[var104] != null) {
                                                                byte var105 = 0;
                                                                if (var104 == 0) {
                                                                    var105 = 39;
                                                                }
                                                                if (var104 == 1) {
                                                                    var105 = 40;
                                                                }
                                                                if (var104 == 2) {
                                                                    var105 = 41;
                                                                }
                                                                if (var104 == 3) {
                                                                    var105 = 42;
                                                                }
                                                                if (var104 == 4) {
                                                                    var105 = 43;
                                                                }
                                                                method637(var103[var104], class2.method1139(16748608) + var97.field965, var105, var97.field996, var92, var10.field2528);
                                                            }
                                                        }
                                                    }
                                                    method637(class133.field2162, class2.method1139(16748608) + var97.field965, 1005, var97.field996, var92, var10.field2528);
                                                } else if ((Statics.field873 & 0x10) == 16) {
                                                    method637(field624, field625 + " " + class2.field25 + " " + class2.method1139(16748608) + var97.field965, 32, var97.field996, var92, var10.field2528);
                                                }
                                            }
                                        }
                                        var92++;
                                    }
                                }
                            }
                            if (var10.field2527) {
                                if (field660) {
                                    int var106 = method2194(var10);
                                    boolean var107 = (var106 >> 21 & 0x1) != 0;
                                    if (var107 && (Statics.field873 & 0x20) == 32) {
                                        method637(field624, field625 + " " + class2.field25 + " " + var10.field2588, 58, 0, var10.field2616, var10.field2528);
                                    }
                                } else {
                                    for (int var108 = 9; var108 >= 5; var108--) {
                                        int var109 = method2194(var10);
                                        boolean var110 = (var109 >> var108 + 1 & 0x1) != 0;
                                        String var111;
                                        if (!var110 && var10.field2601 == null) {
                                            var111 = null;
                                        } else if (var10.field2589 == null || var10.field2589.length <= var108 || var10.field2589[var108] == null || var10.field2589[var108].trim().length() == 0) {
                                            var111 = null;
                                        } else {
                                            var111 = var10.field2589[var108];
                                        }
                                        if (var111 != null) {
                                            method637(var111, var10.field2588, 1007, var108 + 1, var10.field2616, var10.field2528);
                                        }
                                    }
                                    String var113 = method182(var10);
                                    if (var113 != null) {
                                        method637(var113, var10.field2588, 25, 0, var10.field2616, var10.field2528);
                                    }
                                    for (int var114 = 4; var114 >= 0; var114--) {
                                        int var115 = method2194(var10);
                                        boolean var116 = (var115 >> var114 + 1 & 0x1) != 0;
                                        String var117;
                                        if (!var116 && var10.field2601 == null) {
                                            var117 = null;
                                        } else if (var10.field2589 == null || var10.field2589.length <= var114 || var10.field2589[var114] == null || var10.field2589[var114].trim().length() == 0) {
                                            var117 = null;
                                        } else {
                                            var117 = var10.field2589[var114];
                                        }
                                        if (var117 != null) {
                                            method637(var117, var10.field2588, 57, var114 + 1, var10.field2616, var10.field2528);
                                        }
                                    }
                                    int var119 = method2194(var10);
                                    boolean var120 = (var119 & 0x1) != 0;
                                    if (var120) {
                                        method637(class133.field2061, "", 30, 0, var10.field2616, var10.field2528);
                                    }
                                }
                            }
                        }
                        if (var10.field2643 == 0) {
                            if (!var10.field2527 && method165(var10) && Statics.field7 != var10) {
                                continue;
                            }
                            if (!var10.field2527) {
                                if (var10.field2587 > var10.field2544 - var10.field2538) {
                                    var10.field2587 = var10.field2544 - var10.field2538;
                                }
                                if (var10.field2587 < 0) {
                                    var10.field2587 = 0;
                                }
                            }
                            method2804(arg0, var10.field2528, var19, var20, var21, var22, var12 - var10.field2541, var13 - var10.field2587, var11);
                            if (var10.field2636 != null) {
                                method2804(var10.field2636, var10.field2528, var19, var20, var21, var22, var12 - var10.field2541, var13 - var10.field2587, var11);
                            }
                            class4 var121 = (class4) field627.method3129((long) var10.field2528);
                            if (var121 != null) {
                                if (var121.field64 == 0 && class76.field1365 >= var19 && class76.field1369 >= var20 && class76.field1365 < var21 && class76.field1369 < var22 && !field607 && !field635) {
                                    field613[0] = class133.field2059;
                                    field614[0] = "";
                                    field576[0] = 1006;
                                    field608 = 1;
                                }
                                method1918(var121.field70, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class88.method1693(arg2, arg3, arg4, arg5);
                            class103.method2012();
                        }
                        if (field522[var11] || field710 > 1) {
                            if (var10.field2643 == 0 && !var10.field2527 && var10.field2544 > var10.field2538) {
                                int var122 = var10.field2537 + var12;
                                int var123 = var10.field2587;
                                int var124 = var10.field2538;
                                int var125 = var10.field2544;
                                Statics.field290[0].method1686(var122, var13);
                                Statics.field290[1].method1686(var122, var13 + var124 - 16);
                                class88.method1699(var122, var13 + 16, 16, var124 - 32, field545);
                                int var126 = (var124 - 32) * var124 / var125;
                                if (var126 < 8) {
                                    var126 = 8;
                                }
                                int var127 = (var124 - 32 - var126) * var123 / (var125 - var124);
                                class88.method1699(var122, var13 + 16 + var127, 16, var126, field648);
                                class88.method1722(var122, var13 + 16 + var127, var126, field548);
                                class88.method1722(var122 + 1, var13 + 16 + var127, var126, field548);
                                class88.method1703(var122, var13 + 16 + var127, 16, field548);
                                class88.method1703(var122, var13 + 17 + var127, 16, field548);
                                class88.method1722(var122 + 15, var13 + 16 + var127, var126, field547);
                                class88.method1722(var122 + 14, var13 + 17 + var127, var126 - 1, field547);
                                class88.method1703(var122, var13 + 15 + var127 + var126, 16, field547);
                                class88.method1703(var122 + 1, var13 + 14 + var127 + var126, 15, field547);
                            }
                            if (var10.field2643 != 1) {
                                if (var10.field2643 == 2) {
                                    int var128 = 0;
                                    for (int var129 = 0; var129 < var10.field2538; var129++) {
                                        for (int var130 = 0; var130 < var10.field2537; var130++) {
                                            int var131 = (var10.field2614 + 32) * var130 + var12;
                                            int var132 = (var10.field2582 + 32) * var129 + var13;
                                            if (var128 < 20) {
                                                var131 += var10.field2583[var128];
                                                var132 += var10.field2584[var128];
                                            }
                                            if (var10.field2630[var128] > 0) {
                                                boolean var133 = false;
                                                boolean var134 = false;
                                                int var135 = var10.field2630[var128] - 1;
                                                if (var131 + 32 > arg2 && var131 < arg4 && var132 + 32 > arg3 && var132 < arg5 || Statics.field731 == var10 && field578 == var128) {
                                                    class85 var136;
                                                    if (field642 == 1 && Statics.field2007 == var128 && Statics.field620 == var10.field2528) {
                                                        var136 = class39.method110(var135, var10.field2631[var128], 2, 0, false);
                                                    } else {
                                                        var136 = class39.method110(var135, var10.field2631[var128], 1, 3153952, false);
                                                    }
                                                    if (var136 == null) {
                                                        method166(var10);
                                                    } else if (Statics.field731 == var10 && field578 == var128) {
                                                        int var137 = class76.field1365 - field555;
                                                        int var138 = class76.field1369 - field580;
                                                        if (var137 < 5 && var137 > -5) {
                                                            var137 = 0;
                                                        }
                                                        if (var138 < 5 && var138 > -5) {
                                                            var138 = 0;
                                                        }
                                                        if (field583 < 5) {
                                                            var137 = 0;
                                                            var138 = 0;
                                                        }
                                                        var136.method1602(var131 + var137, var132 + var138, 128);
                                                        if (arg1 != -1) {
                                                            class156 var139 = arg0[arg1 & 0xFFFF];
                                                            if (var132 + var138 < class88.field1462 && var139.field2587 > 0) {
                                                                int var140 = field544 * (class88.field1462 - var132 - var138) / 3;
                                                                if (var140 > field544 * 10) {
                                                                    var140 = field544 * 10;
                                                                }
                                                                if (var140 > var139.field2587) {
                                                                    var140 = var139.field2587;
                                                                }
                                                                var139.field2587 -= var140;
                                                                field580 += var140;
                                                                method166(var139);
                                                            }
                                                            if (var132 + var138 + 32 > class88.field1460 && var139.field2587 < var139.field2544 - var139.field2538) {
                                                                int var141 = field544 * (var132 + var138 + 32 - class88.field1460) / 3;
                                                                if (var141 > field544 * 10) {
                                                                    var141 = field544 * 10;
                                                                }
                                                                if (var141 > var139.field2544 - var139.field2538 - var139.field2587) {
                                                                    var141 = var139.field2544 - var139.field2538 - var139.field2587;
                                                                }
                                                                var139.field2587 += var141;
                                                                field580 -= var141;
                                                                method166(var139);
                                                            }
                                                        }
                                                    } else if (Statics.field1411 == var10 && field653 == var128) {
                                                        var136.method1602(var131, var132, 128);
                                                    } else {
                                                        var136.method1596(var131, var132);
                                                    }
                                                }
                                            } else if (var10.field2585 != null && var128 < 20) {
                                                class85 var142 = var10.method2945(var128);
                                                if (var142 != null) {
                                                    var142.method1596(var131, var132);
                                                } else if (class156.field2526) {
                                                    method166(var10);
                                                }
                                            }
                                            var128++;
                                        }
                                    }
                                } else if (var10.field2643 == 3) {
                                    int var143;
                                    if (method1304(var10)) {
                                        var143 = var10.field2546;
                                        if (Statics.field7 == var10 && var10.field2548 != 0) {
                                            var143 = var10.field2548;
                                        }
                                    } else {
                                        var143 = var10.field2623;
                                        if (Statics.field7 == var10 && var10.field2633 != 0) {
                                            var143 = var10.field2633;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var10.field2591) {
                                            class88.method1699(var12, var13, var10.field2537, var10.field2538, var143);
                                        } else {
                                            class88.method1701(var12, var13, var10.field2537, var10.field2538, var143);
                                        }
                                    } else if (var10.field2591) {
                                        class88.method1727(var12, var13, var10.field2537, var10.field2538, var143, 256 - (var14 & 0xFF));
                                    } else {
                                        class88.method1691(var12, var13, var10.field2537, var10.field2538, var143, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2643 == 4) {
                                    class181 var144 = var10.method2944();
                                    if (var144 != null) {
                                        String var145 = var10.field2575;
                                        int var146;
                                        if (method1304(var10)) {
                                            var146 = var10.field2546;
                                            if (Statics.field7 == var10 && var10.field2548 != 0) {
                                                var146 = var10.field2548;
                                            }
                                            if (var10.field2576.length() > 0) {
                                                var145 = var10.field2576;
                                            }
                                        } else {
                                            var146 = var10.field2623;
                                            if (Statics.field7 == var10 && var10.field2633 != 0) {
                                                var146 = var10.field2633;
                                            }
                                        }
                                        if (var10.field2527 && var10.field2644 != -1) {
                                            class39 var147 = class39.method2570(var10.field2644);
                                            var145 = var147.field965;
                                            if (var145 == null) {
                                                var145 = "null";
                                            }
                                            if ((var147.field980 == 1 || var10.field2519 != 1) && var10.field2519 != -1) {
                                                String var148 = class2.method1139(16748608) + var145 + class2.field27 + " " + 'x';
                                                int var149 = var10.field2519;
                                                String var150 = Integer.toString(var149);
                                                for (int var151 = var150.length() - 3; var151 > 0; var151 -= 3) {
                                                    var150 = var150.substring(0, var151) + class2.field24 + var150.substring(var151);
                                                }
                                                String var152;
                                                StringBuilder var10000;
                                                class133 var10001;
                                                if (var150.length() > 9) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method1139(65408)).append(var150.substring(0, var150.length() - 8));
                                                    var10001 = (class133) null;
                                                    var152 = var10000.append(class133.field2207).append(" ").append(class2.field23).append(var150).append(class2.field20).append(class2.field27).toString();
                                                } else if (var150.length() > 6) {
                                                    var10000 = (new StringBuilder()).append(" ").append(class2.method1139(16777215)).append(var150.substring(0, var150.length() - 4));
                                                    var10001 = (class133) null;
                                                    var152 = var10000.append(class133.field2064).append(" ").append(class2.field23).append(var150).append(class2.field20).append(class2.field27).toString();
                                                } else {
                                                    var152 = " " + class2.method1139(16776960) + var150 + class2.field27;
                                                }
                                                var145 = var148 + var152;
                                            }
                                        }
                                        if (field630 == var10) {
                                            class133 var216 = (class133) null;
                                            var145 = class133.field2204;
                                            var146 = var10.field2623;
                                        }
                                        if (!var10.field2527) {
                                            var145 = method209(var145, var10);
                                        }
                                        var144.method3233(var145, var12, var13, var10.field2537, var10.field2538, var146, var10.field2580 ? 0 : -1, var10.field2578, var10.field2579, var10.field2610);
                                    } else if (class156.field2526) {
                                        method166(var10);
                                    }
                                } else if (var10.field2643 == 5) {
                                    if (var10.field2527) {
                                        class85 var154;
                                        if (var10.field2644 == -1) {
                                            var154 = var10.method2958(false);
                                        } else {
                                            var154 = class39.method110(var10.field2644, var10.field2519, var10.field2556, var10.field2557, false);
                                        }
                                        if (var154 != null) {
                                            int var155 = var154.field1443;
                                            int var156 = var154.field1438;
                                            if (var10.field2555) {
                                                class88.method1694(var12, var13, var10.field2537 + var12, var10.field2538 + var13);
                                                int var157 = (var10.field2537 + (var155 - 1)) / var155;
                                                int var158 = (var10.field2538 + (var156 - 1)) / var156;
                                                for (int var159 = 0; var159 < var157; var159++) {
                                                    for (int var160 = 0; var160 < var158; var160++) {
                                                        if (var10.field2554 != 0) {
                                                            var154.method1613(var155 / 2 + var155 * var159 + var12, var156 / 2 + var156 * var160 + var13, var10.field2554, 4096);
                                                        } else if (var14 == 0) {
                                                            var154.method1596(var155 * var159 + var12, var156 * var160 + var13);
                                                        } else {
                                                            var154.method1602(var155 * var159 + var12, var156 * var160 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class88.method1693(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var161 = var10.field2537 * 4096 / var155;
                                                if (var10.field2554 != 0) {
                                                    var154.method1613(var10.field2537 / 2 + var12, var10.field2538 / 2 + var13, var10.field2554, var161);
                                                } else if (var14 != 0) {
                                                    var154.method1615(var12, var13, var10.field2537, var10.field2538, 256 - (var14 & 0xFF));
                                                } else if (var10.field2537 == var155 && var10.field2538 == var156) {
                                                    var154.method1596(var12, var13);
                                                } else {
                                                    var154.method1675(var12, var13, var10.field2537, var10.field2538);
                                                }
                                            }
                                        } else if (class156.field2526) {
                                            method166(var10);
                                        }
                                    } else {
                                        class85 var153 = var10.method2958(method1304(var10));
                                        if (var153 != null) {
                                            var153.method1596(var12, var13);
                                        } else if (class156.field2526) {
                                            method166(var10);
                                        }
                                    }
                                } else if (var10.field2643 == 6) {
                                    boolean var162 = method1304(var10);
                                    int var163;
                                    if (var162) {
                                        var163 = var10.field2547;
                                    } else {
                                        var163 = var10.field2564;
                                    }
                                    class111 var164 = null;
                                    int var165 = 0;
                                    if (var10.field2644 != -1) {
                                        class39 var166 = class39.method2570(var10.field2644);
                                        if (var166 != null) {
                                            class39 var167 = var166.method799(var10.field2519);
                                            var164 = var167.method793(1);
                                            if (var164 == null) {
                                                method166(var10);
                                            } else {
                                                var164.method2121();
                                                var165 = var164.field1521 / 2;
                                            }
                                        }
                                    } else if (var10.field2560 == 5) {
                                        if (var10.field2561 == 0) {
                                            var164 = field550.method3014((class33) null, -1, (class33) null, -1);
                                        } else {
                                            var164 = Statics.field1623.method18();
                                        }
                                    } else if (var163 == -1) {
                                        var164 = var10.method2946((class33) null, -1, var162, Statics.field1623.field43);
                                        if (var164 == null && class156.field2526) {
                                            method166(var10);
                                        }
                                    } else {
                                        class33 var168 = class33.method2589(var163);
                                        var164 = var10.method2946(var168, var10.field2634, var162, Statics.field1623.field43);
                                        if (var164 == null && class156.field2526) {
                                            method166(var10);
                                        }
                                    }
                                    class103.method2015(var10.field2537 / 2 + var12, var10.field2538 / 2 + var13);
                                    int var169 = var10.field2581 * class103.field1763[var10.field2568] >> 16;
                                    int var170 = var10.field2581 * class103.field1757[var10.field2568] >> 16;
                                    if (var164 != null) {
                                        if (var10.field2527) {
                                            var164.method2121();
                                            if (var10.field2640) {
                                                var164.method2134(0, var10.field2569, var10.field2550, var10.field2568, var10.field2566, var10.field2570 + var165 + var169, var10.field2570 + var170, var10.field2581);
                                            } else {
                                                var164.method2133(0, var10.field2569, var10.field2550, var10.field2568, var10.field2566, var10.field2570 + var165 + var169, var10.field2570 + var170);
                                            }
                                        } else {
                                            var164.method2133(0, var10.field2569, 0, var10.field2568, 0, var169, var170);
                                        }
                                    }
                                    class103.method2021();
                                } else {
                                    if (var10.field2643 == 7) {
                                        class181 var171 = var10.method2944();
                                        if (var171 == null) {
                                            if (class156.field2526) {
                                                method166(var10);
                                            }
                                            continue;
                                        }
                                        int var172 = 0;
                                        for (int var173 = 0; var173 < var10.field2538; var173++) {
                                            for (int var174 = 0; var174 < var10.field2537; var174++) {
                                                if (var10.field2630[var172] > 0) {
                                                    class39 var175 = class39.method2570(var10.field2630[var172] - 1);
                                                    String var176;
                                                    if (var175.field980 != 1 && var10.field2631[var172] == 1) {
                                                        var176 = class2.method1139(16748608) + var175.field965 + class2.field27;
                                                    } else {
                                                        String var177 = class2.method1139(16748608) + var175.field965 + class2.field27 + " " + 'x';
                                                        int var178 = var10.field2631[var172];
                                                        String var179 = Integer.toString(var178);
                                                        for (int var180 = var179.length() - 3; var180 > 0; var180 -= 3) {
                                                            var179 = var179.substring(0, var180) + class2.field24 + var179.substring(var180);
                                                        }
                                                        String var181;
                                                        if (var179.length() > 9) {
                                                            var181 = " " + class2.method1139(65408) + var179.substring(0, var179.length() - 8) + class133.field2207 + " " + class2.field23 + var179 + class2.field20 + class2.field27;
                                                        } else if (var179.length() > 6) {
                                                            var181 = " " + class2.method1139(16777215) + var179.substring(0, var179.length() - 4) + class133.field2064 + " " + class2.field23 + var179 + class2.field20 + class2.field27;
                                                        } else {
                                                            var181 = " " + class2.method1139(16776960) + var179 + class2.field27;
                                                        }
                                                        var176 = var177 + var181;
                                                    }
                                                    int var182 = (var10.field2614 + 115) * var174 + var12;
                                                    int var183 = (var10.field2582 + 12) * var173 + var13;
                                                    if (var10.field2578 == 0) {
                                                        var171.method3230(var176, var182, var183, var10.field2623, var10.field2580 ? 0 : -1);
                                                    } else if (var10.field2578 == 1) {
                                                        var171.method3289(var176, var10.field2537 / 2 + var182, var183, var10.field2623, var10.field2580 ? 0 : -1);
                                                    } else {
                                                        var171.method3231(var176, var10.field2537 + var182 - 1, var183, var10.field2623, var10.field2580 ? 0 : -1);
                                                    }
                                                }
                                                var172++;
                                            }
                                        }
                                    }
                                    if (var10.field2643 == 8 && Statics.field1325 == var10 && field618 == field617) {
                                        int var184 = 0;
                                        int var185 = 0;
                                        class181 var186 = Statics.field1719;
                                        String var187 = var10.field2575;
                                        String var188 = method209(var187, var10);
                                        while (var188.length() > 0) {
                                            int var189 = var188.indexOf(class2.field22);
                                            String var190;
                                            if (var189 == -1) {
                                                var190 = var188;
                                                var188 = "";
                                            } else {
                                                var190 = var188.substring(0, var189);
                                                var188 = var188.substring(var189 + 4);
                                            }
                                            int var191 = var186.method3225(var190);
                                            if (var191 > var184) {
                                                var184 = var191;
                                            }
                                            var185 += var186.field2790 + 1;
                                        }
                                        var184 += 6;
                                        var185 += 7;
                                        int var192 = var10.field2537 + var12 - 5 - var184;
                                        int var193 = var10.field2538 + var13 + 5;
                                        if (var192 < var12 + 5) {
                                            var192 = var12 + 5;
                                        }
                                        if (var184 + var192 > arg4) {
                                            var192 = arg4 - var184;
                                        }
                                        if (var185 + var193 > arg5) {
                                            var193 = arg5 - var185;
                                        }
                                        class88.method1699(var192, var193, var184, var185, 16777120);
                                        class88.method1701(var192, var193, var184, var185, 0);
                                        String var194 = var10.field2575;
                                        int var195 = var186.field2790 + var193 + 2;
                                        String var196 = method209(var194, var10);
                                        while (var196.length() > 0) {
                                            int var197 = var196.indexOf(class2.field22);
                                            String var198;
                                            if (var197 == -1) {
                                                var198 = var196;
                                                var196 = "";
                                            } else {
                                                var198 = var196.substring(0, var197);
                                                var196 = var196.substring(var197 + 4);
                                            }
                                            var186.method3230(var198, var192 + 3, var195, 0, -1);
                                            var195 += var186.field2790 + 1;
                                        }
                                    }
                                    if (var10.field2643 == 9) {
                                        if (var10.field2551 == 1) {
                                            class88.method1707(var12, var13, var10.field2537 + var12, var10.field2538 + var13, var10.field2623);
                                        } else {
                                            int var199 = var10.field2537 >= 0 ? var10.field2537 : -var10.field2537;
                                            int var200 = var10.field2538 >= 0 ? var10.field2538 : -var10.field2538;
                                            int var201 = var199;
                                            if (var199 < var200) {
                                                var201 = var200;
                                            }
                                            if (var201 != 0) {
                                                int var202 = (var10.field2537 << 16) / var201;
                                                int var203 = (var10.field2538 << 16) / var201;
                                                if (var203 <= var202) {
                                                    var202 = -var202;
                                                } else {
                                                    var203 = -var203;
                                                }
                                                int var204 = var10.field2551 * var203 >> 17;
                                                int var205 = var10.field2551 * var203 + 1 >> 17;
                                                int var206 = var10.field2551 * var202 >> 17;
                                                int var207 = var10.field2551 * var202 + 1 >> 17;
                                                int var208 = var12 + var204;
                                                int var209 = var12 - var205;
                                                int var210 = var10.field2537 + var12 - var205;
                                                int var211 = var10.field2537 + var12 + var204;
                                                int var212 = var13 + var206;
                                                int var213 = var13 - var207;
                                                int var214 = var10.field2538 + var13 - var207;
                                                int var215 = var10.field2538 + var13 + var206;
                                                class103.method2027(var208, var209, var210);
                                                class103.method2014(var212, var213, var214, var208, var209, var210, var10.field2623);
                                                class103.method2027(var208, var210, var211);
                                                class103.method2014(var212, var214, var215, var208, var210, var211, var10.field2623);
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

    @ObfuscatedName("v.bj(Ljava/lang/String;Lej;I)Ljava/lang/String;")
    public static String method209(String arg0, class156 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method213(arg1, var2 - 1);
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
                if (Statics.field1013 != null) {
                    int var9 = Statics.field1013.field1383;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field1013.field1384 != null) {
                        var8 = (String) Statics.field1013.field1384;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("a.bf(Lej;IIIIIIB)V")
    public static final void method205(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field549) {
            field606 = 32;
        } else {
            field606 = 0;
        }
        field549 = false;
        if (class76.field1364 != 0) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2587 -= 4;
                method166(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2587 += 4;
                method166(arg0);
            } else if (arg5 >= arg1 - field606 && arg5 < field606 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2587 = (arg4 - arg3) * var8 / var9;
                method166(arg0);
                field549 = true;
            }
        }
        if (field662 == 0) {
            return;
        }
        int var10 = arg0.field2537;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2587 += field662 * 45;
            method166(arg0);
        }
    }

    @ObfuscatedName("bb.cd(Lej;B)Z")
    public static final boolean method1304(class156 arg0) {
        if (arg0.field2625 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2625.length; var1++) {
            int var2 = method213(arg0, var1);
            int var3 = arg0.field2549[var1];
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

    @ObfuscatedName("i.ci(Lej;IB)I")
    public static final int method213(class156 arg0, int arg1) {
        if (arg0.field2624 == null || arg1 >= arg0.field2624.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2624[arg1];
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
                    var7 = field621[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field666[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field605[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class156 var11 = class156.method2702(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class39.method2570(var12).field978 || field470)) {
                        for (int var13 = 0; var13 < var11.field2630.length; var13++) {
                            if (var12 + 1 == var11.field2630[var13]) {
                                var7 += var11.field2631[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class157.field2649[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class129.field2017[field666[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class157.field2649[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field1623.field46;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class129.field2016[var14]) {
                            var7 += field666[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class156 var17 = class156.method2702(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class39.method2570(var18).field978 || field470)) {
                        for (int var19 = 0; var19 < var17.field2630.length; var19++) {
                            if (var18 + 1 == var17.field2630[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field631;
                }
                if (var6 == 12) {
                    var7 = field632;
                }
                if (var6 == 13) {
                    int var20 = class157.field2649[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class157.method125(var22);
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
                    var7 = (Statics.field1623.field446 >> 7) + Statics.field1738;
                }
                if (var6 == 19) {
                    var7 = (Statics.field1623.field406 >> 7) + Statics.field277;
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

    @ObfuscatedName("am.cv([Lej;IIIIIIIS)V")
    public static final void method836(class156[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class156 var9 = arg0[var8];
            if (var9 != null && (!var9.field2527 || var9.field2643 == 0 || var9.field2525 || method2194(var9) != 0 || field638 == var9) && var9.field2539 == arg1 && (!var9.field2527 || !method165(var9))) {
                int var10 = var9.field2533 + arg6;
                int var11 = var9.field2534 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2643 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2643 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2537 + var10;
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
                    int var22 = var9.field2537 + var10;
                    int var23 = var9.field2538 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field598 == var9) {
                    field645 = true;
                    field646 = var10;
                    field647 = var11;
                }
                if (!var9.field2527 || var12 < var14 && var13 < var15) {
                    if (var9.field2532 == 1337) {
                        method166(var9);
                    } else if (var9.field2532 != 1338) {
                        if (var9.field2643 == 0) {
                            if (!var9.field2527 && method165(var9) && Statics.field7 != var9) {
                                continue;
                            }
                            method836(arg0, var9.field2528, var12, var13, var14, var15, var10 - var9.field2541, var11 - var9.field2587);
                            if (var9.field2636 != null) {
                                method836(var9.field2636, var9.field2528, var12, var13, var14, var15, var10 - var9.field2541, var11 - var9.field2587);
                            }
                            class4 var36 = (class4) field627.method3129((long) var9.field2528);
                            if (var36 != null) {
                                int var37 = var36.field70;
                                if (class156.method1920(var37)) {
                                    method836(Statics.field2632[var37], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2527) {
                            boolean var38;
                            if (class76.field1365 >= var12 && class76.field1369 >= var13 && class76.field1365 < var14 && class76.field1369 < var15) {
                                var38 = true;
                            } else {
                                var38 = false;
                            }
                            boolean var39 = false;
                            if (class76.field1364 == 1 && var38) {
                                var39 = true;
                            }
                            boolean var40 = false;
                            if (class76.field1374 == 1 && class76.field1372 >= var12 && class76.field1373 >= var13 && class76.field1372 < var14 && class76.field1373 < var15) {
                                var40 = true;
                            }
                            if (var40) {
                                method12(var9, class76.field1372 - var10, class76.field1373 - var11);
                            }
                            if (field598 != null && field598 != var9 && var38) {
                                int var41 = method2194(var9);
                                boolean var42 = (var41 >> 20 & 0x1) != 0;
                                if (var42) {
                                    field641 = var9;
                                }
                            }
                            if (field638 == var9) {
                                field502 = true;
                                field554 = var10;
                                field644 = var11;
                            }
                            if (var9.field2525) {
                                if (var38 && field662 != 0 && var9.field2613 != null) {
                                    class1 var43 = new class1();
                                    var43.field2 = var9;
                                    var43.field14 = field662;
                                    var43.field4 = var9.field2613;
                                    field663.method3147(var43);
                                }
                                if (field598 != null || Statics.field731 != null || field607) {
                                    var40 = false;
                                    var39 = false;
                                    var38 = false;
                                }
                                if (!var9.field2638 && var40) {
                                    var9.field2638 = true;
                                    if (var9.field2619 != null) {
                                        class1 var44 = new class1();
                                        var44.field2 = var9;
                                        var44.field3 = class76.field1372 - var10;
                                        var44.field14 = class76.field1373 - var11;
                                        var44.field4 = var9.field2619;
                                        field663.method3147(var44);
                                    }
                                }
                                if (var9.field2638 && var39 && var9.field2520 != null) {
                                    class1 var45 = new class1();
                                    var45.field2 = var9;
                                    var45.field3 = class76.field1365 - var10;
                                    var45.field14 = class76.field1369 - var11;
                                    var45.field4 = var9.field2520;
                                    field663.method3147(var45);
                                }
                                if (var9.field2638 && !var39) {
                                    var9.field2638 = false;
                                    if (var9.field2599 != null) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field3 = class76.field1365 - var10;
                                        var46.field14 = class76.field1369 - var11;
                                        var46.field4 = var9.field2599;
                                        field665.method3147(var46);
                                    }
                                }
                                if (var39 && var9.field2600 != null) {
                                    class1 var47 = new class1();
                                    var47.field2 = var9;
                                    var47.field3 = class76.field1365 - var10;
                                    var47.field14 = class76.field1369 - var11;
                                    var47.field4 = var9.field2600;
                                    field663.method3147(var47);
                                }
                                if (!var9.field2615 && var38) {
                                    var9.field2615 = true;
                                    if (var9.field2540 != null) {
                                        class1 var48 = new class1();
                                        var48.field2 = var9;
                                        var48.field3 = class76.field1365 - var10;
                                        var48.field14 = class76.field1369 - var11;
                                        var48.field4 = var9.field2540;
                                        field663.method3147(var48);
                                    }
                                }
                                if (var9.field2615 && var38 && var9.field2530 != null) {
                                    class1 var49 = new class1();
                                    var49.field2 = var9;
                                    var49.field3 = class76.field1365 - var10;
                                    var49.field14 = class76.field1369 - var11;
                                    var49.field4 = var9.field2530;
                                    field663.method3147(var49);
                                }
                                if (var9.field2615 && !var38) {
                                    var9.field2615 = false;
                                    if (var9.field2603 != null) {
                                        class1 var50 = new class1();
                                        var50.field2 = var9;
                                        var50.field3 = class76.field1365 - var10;
                                        var50.field14 = class76.field1369 - var11;
                                        var50.field4 = var9.field2603;
                                        field665.method3147(var50);
                                    }
                                }
                                if (var9.field2617 != null) {
                                    class1 var51 = new class1();
                                    var51.field2 = var9;
                                    var51.field4 = var9.field2617;
                                    field664.method3147(var51);
                                }
                                if (var9.field2523 != null && field651 > var9.field2639) {
                                    if (var9.field2620 == null || field651 - var9.field2639 > 32) {
                                        class1 var56 = new class1();
                                        var56.field2 = var9;
                                        var56.field4 = var9.field2523;
                                        field663.method3147(var56);
                                    } else {
                                        label402: for (int var52 = var9.field2639; var52 < field651; var52++) {
                                            int var53 = field650[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2620.length; var54++) {
                                                if (var9.field2620[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field2 = var9;
                                                    var55.field4 = var9.field2523;
                                                    field663.method3147(var55);
                                                    break label402;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2639 = field651;
                                }
                                if (var9.field2594 != null && field705 > var9.field2641) {
                                    if (var9.field2611 == null || field705 - var9.field2641 > 32) {
                                        class1 var61 = new class1();
                                        var61.field2 = var9;
                                        var61.field4 = var9.field2594;
                                        field663.method3147(var61);
                                    } else {
                                        label382: for (int var57 = var9.field2641; var57 < field705; var57++) {
                                            int var58 = field652[var57 & 0x1F];
                                            for (int var59 = 0; var59 < var9.field2611.length; var59++) {
                                                if (var9.field2611[var59] == var58) {
                                                    class1 var60 = new class1();
                                                    var60.field2 = var9;
                                                    var60.field4 = var9.field2594;
                                                    field663.method3147(var60);
                                                    break label382;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2641 = field705;
                                }
                                if (var9.field2612 != null && field472 > var9.field2642) {
                                    if (var9.field2609 == null || field472 - var9.field2642 > 32) {
                                        class1 var66 = new class1();
                                        var66.field2 = var9;
                                        var66.field4 = var9.field2612;
                                        field663.method3147(var66);
                                    } else {
                                        label362: for (int var62 = var9.field2642; var62 < field472; var62++) {
                                            int var63 = field654[var62 & 0x1F];
                                            for (int var64 = 0; var64 < var9.field2609.length; var64++) {
                                                if (var9.field2609[var64] == var63) {
                                                    class1 var65 = new class1();
                                                    var65.field2 = var9;
                                                    var65.field4 = var9.field2612;
                                                    field663.method3147(var65);
                                                    break label362;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2642 = field472;
                                }
                                if (field656 > var9.field2563 && var9.field2608 != null) {
                                    class1 var67 = new class1();
                                    var67.field2 = var9;
                                    var67.field4 = var9.field2608;
                                    field663.method3147(var67);
                                }
                                if (field622 > var9.field2563 && var9.field2597 != null) {
                                    class1 var68 = new class1();
                                    var68.field2 = var9;
                                    var68.field4 = var9.field2597;
                                    field663.method3147(var68);
                                }
                                if (field658 > var9.field2563 && var9.field2577 != null) {
                                    class1 var69 = new class1();
                                    var69.field2 = var9;
                                    var69.field4 = var9.field2577;
                                    field663.method3147(var69);
                                }
                                if (field659 > var9.field2563 && var9.field2621 != null) {
                                    class1 var70 = new class1();
                                    var70.field2 = var9;
                                    var70.field4 = var9.field2621;
                                    field663.method3147(var70);
                                }
                                var9.field2563 = field649;
                                if (var9.field2618 != null) {
                                    for (int var71 = 0; var71 < field687; var71++) {
                                        class1 var72 = new class1();
                                        var72.field2 = var9;
                                        var72.field16 = field689[var71];
                                        var72.field8 = field590[var71];
                                        var72.field4 = var9.field2618;
                                        field663.method3147(var72);
                                    }
                                }
                            }
                        }
                        if (!var9.field2527) {
                            if (field598 != null || Statics.field731 != null || field607) {
                                return;
                            }
                            if ((var9.field2627 >= 0 || var9.field2633 != 0) && class76.field1365 >= var12 && class76.field1369 >= var13 && class76.field1365 < var14 && class76.field1369 < var15) {
                                if (var9.field2627 >= 0) {
                                    Statics.field7 = arg0[var9.field2627];
                                } else {
                                    Statics.field7 = var9;
                                }
                            }
                            if (var9.field2643 == 8 && class76.field1365 >= var12 && class76.field1369 >= var13 && class76.field1365 < var14 && class76.field1369 < var15) {
                                Statics.field1325 = var9;
                            }
                            if (var9.field2544 > var9.field2538) {
                                method205(var9, var9.field2537 + var10, var11, var9.field2538, var9.field2544, class76.field1365, class76.field1369);
                            }
                        }
                    } else if ((field699 == 0 || field699 == 3) && class76.field1374 == 1) {
                        int var24 = class76.field1372 - 25 - var10;
                        int var25 = class76.field1373 - 5 - var11;
                        if (var24 >= 0 && var25 >= 0 && var24 < 146 && var25 < 151) {
                            var24 -= 73;
                            var25 -= 75;
                            int var26 = field552 + field477 & 0x7FF;
                            int var27 = class103.field1763[var26];
                            int var28 = class103.field1757[var26];
                            int var29 = (field661 + 256) * var27 >> 8;
                            int var30 = (field661 + 256) * var28 >> 8;
                            int var31 = var24 * var30 + var25 * var29 >> 11;
                            int var32 = var25 * var30 - var24 * var29 >> 11;
                            int var33 = Statics.field1623.field446 + var31 >> 7;
                            int var34 = Statics.field1623.field406 - var32 >> 7;
                            boolean var35 = method1317(Statics.field1623.field457[0], Statics.field1623.field458[0], var33, var34, true, 0, 0, 0, 0, 0, 1);
                            if (var35) {
                                field505.method2339(var24);
                                field505.method2339(var25);
                                field505.method2314(field552);
                                field505.method2339(57);
                                field505.method2339(field477);
                                field505.method2339(field661);
                                field505.method2339(89);
                                field505.method2314(Statics.field1623.field446);
                                field505.method2314(Statics.field1623.field406);
                                field505.method2339(field527);
                                field505.method2339(63);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.cy(III)V")
    public static final void method3(int arg0, int arg1) {
        if (class156.method1920(arg0)) {
            method721(Statics.field2632[arg0], arg1);
        }
    }

    @ObfuscatedName("aw.cr([Lej;IB)V")
    public static final void method721(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2643 == 0) {
                    if (var3.field2636 != null) {
                        method721(var3.field2636, arg1);
                    }
                    class4 var4 = (class4) field627.method3129((long) var3.field2528);
                    if (var4 != null) {
                        method3(var4.field70, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2622 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field4 = var3.field2622;
                    class25.method790(var5);
                }
                if (arg1 == 1 && var3.field2598 != null) {
                    if (var3.field2616 >= 0) {
                        class156 var6 = class156.method2702(var3.field2528);
                        if (var6 == null || var6.field2636 == null || var3.field2616 >= var6.field2636.length || var6.field2636[var3.field2616] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field4 = var3.field2598;
                    class25.method790(var7);
                }
            }
        }
    }

    @ObfuscatedName("j.cs(Lej;IIB)V")
    public static final void method12(class156 arg0, int arg1, int arg2) {
        if (field598 != null || field607 || arg0 == null) {
            return;
        }
        class156 var3 = arg0;
        int var4 = class160.method2979(method2194(arg0));
        class156 var5;
        if (var4 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var3;
                    break;
                }
                var3 = class156.method2702(var3.field2539);
                if (var3 == null) {
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
        if (var7 == null) {
            return;
        }
        field598 = arg0;
        class156 var9 = arg0;
        int var10 = class160.method2979(method2194(arg0));
        class156 var11;
        if (var10 == 0) {
            var11 = null;
        } else {
            int var12 = 0;
            while (true) {
                if (var12 >= var10) {
                    var11 = var9;
                    break;
                }
                var9 = class156.method2702(var9.field2539);
                if (var9 == null) {
                    var11 = null;
                    break;
                }
                var12++;
            }
        }
        class156 var13 = var11;
        if (var11 == null) {
            var13 = arg0.field2590;
        }
        field638 = var13;
        field639 = arg1;
        field640 = arg2;
        Statics.field66 = 0;
        field676 = false;
        return;
    }

    @ObfuscatedName("a.cu(I)V")
    public static final void method200() {
        method166(field598);
        Statics.field66++;
        if (field645 && field502) {
            int var0 = class76.field1365;
            int var1 = class76.field1369;
            int var2 = var0 - field639;
            int var3 = var1 - field640;
            if (var2 < field554) {
                var2 = field554;
            }
            if (field598.field2537 + var2 > field554 + field638.field2537) {
                var2 = field554 + field638.field2537 - field598.field2537;
            }
            if (var3 < field644) {
                var3 = field644;
            }
            if (field598.field2538 + var3 > field644 + field638.field2538) {
                var3 = field644 + field638.field2538 - field598.field2538;
            }
            int var4 = var2 - field646;
            int var5 = var3 - field647;
            int var6 = field598.field2545;
            if (Statics.field66 > field598.field2592 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field676 = true;
            }
            int var7 = field638.field2541 + (var2 - field554);
            int var8 = field638.field2587 + (var3 - field644);
            if (field598.field2604 != null && field676) {
                class1 var9 = new class1();
                var9.field2 = field598;
                var9.field3 = var7;
                var9.field14 = var8;
                var9.field4 = field598.field2604;
                class25.method790(var9);
            }
            if (class76.field1364 == 0) {
                if (field676) {
                    if (field598.field2605 != null) {
                        class1 var10 = new class1();
                        var10.field2 = field598;
                        var10.field3 = var7;
                        var10.field14 = var8;
                        var10.field6 = field641;
                        var10.field4 = field598.field2605;
                        class25.method790(var10);
                    }
                    if (field641 != null) {
                        class156 var11 = field598;
                        int var12 = class160.method2979(method2194(var11));
                        class156 var13;
                        if (var12 == 0) {
                            var13 = null;
                        } else {
                            int var14 = 0;
                            while (true) {
                                if (var14 >= var12) {
                                    var13 = var11;
                                    break;
                                }
                                var11 = class156.method2702(var11.field2539);
                                if (var11 == null) {
                                    var13 = null;
                                    break;
                                }
                                var14++;
                            }
                        }
                        if (var13 != null) {
                            field505.method2198(209);
                            field505.method2357(field641.field2616);
                            field505.method2365(field641.field2528);
                            field505.method2365(field598.field2528);
                            field505.method2381(field598.field2616);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field471 != 1) {
                                int var15 = field608 - 1;
                                boolean var16;
                                if (var15 < 0) {
                                    var16 = false;
                                } else {
                                    int var17 = field576[var15];
                                    if (var17 >= 2000) {
                                        var17 -= 2000;
                                    }
                                    if (var17 == 1007) {
                                        var16 = true;
                                    } else {
                                        var16 = false;
                                    }
                                }
                                if (!var16) {
                                    break label91;
                                }
                            }
                            if (field608 > 2) {
                                method703();
                                break label120;
                            }
                        }
                        if (field608 > 0) {
                            method2252(field608 - 1);
                        }
                    }
                }
                field598 = null;
            }
        } else if (Statics.field66 > 1) {
            field598 = null;
        }
    }

    @ObfuscatedName("g.cq(Lej;I)V")
    public static void method166(class156 arg0) {
        if (field668 == arg0.field2571) {
            field634[arg0.field2565] = true;
        }
    }

    @ObfuscatedName("dg.cb(I)V")
    public static void method2253() {
        for (class4 var0 = (class4) field627.method3141(); var0 != null; var0 = (class4) field627.method3128()) {
            int var1 = var0.field70;
            if (class156.method1920(var1)) {
                boolean var2 = true;
                class156[] var3 = Statics.field2632[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2527;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field2759;
                    class156 var6 = class156.method2702(var5);
                    if (var6 != null) {
                        method166(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("y.cn([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method22(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("o.ct(II)V")
    public static final void method225(int arg0) {
        if (class156.method1920(arg0)) {
            method210(Statics.field2632[arg0], -1);
        }
    }

    @ObfuscatedName("i.ce([Lej;II)V")
    public static final void method210(class156[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class156 var3 = arg0[var2];
            if (var3 != null && var3.field2539 == arg1 && (!var3.field2527 || !method165(var3))) {
                if (var3.field2643 == 0) {
                    if (!var3.field2527 && method165(var3) && Statics.field7 != var3) {
                        continue;
                    }
                    method210(arg0, var3.field2528);
                    if (var3.field2636 != null) {
                        method210(var3.field2636, var3.field2528);
                    }
                    class4 var4 = (class4) field627.method3129((long) var3.field2528);
                    if (var4 != null) {
                        int var5 = var4.field70;
                        if (class156.method1920(var5)) {
                            method210(Statics.field2632[var5], -1);
                        }
                    }
                }
                if (var3.field2643 == 6) {
                    if (var3.field2564 != -1 || var3.field2547 != -1) {
                        boolean var6 = method1304(var3);
                        int var7;
                        if (var6) {
                            var7 = var3.field2547;
                        } else {
                            var7 = var3.field2564;
                        }
                        if (var7 != -1) {
                            class33 var8 = class33.method2589(var7);
                            var3.field2635 += field544;
                            while (var3.field2635 > var8.field864[var3.field2634]) {
                                var3.field2635 -= var8.field864[var3.field2634];
                                var3.field2634++;
                                if (var3.field2634 >= var8.field857.length) {
                                    var3.field2634 -= var8.field866;
                                    if (var3.field2634 < 0 || var3.field2634 >= var8.field857.length) {
                                        var3.field2634 = 0;
                                    }
                                }
                                method166(var3);
                            }
                        }
                    }
                    if (var3.field2572 != 0 && !var3.field2527) {
                        int var9 = var3.field2572 >> 16;
                        int var10 = var3.field2572 << 16 >> 16;
                        int var11 = field544 * var9;
                        int var12 = field544 * var10;
                        var3.field2568 = var3.field2568 + var11 & 0x7FF;
                        var3.field2569 = var3.field2569 + var12 & 0x7FF;
                        method166(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("s.cm(IS)V")
    public static final void method61(int arg0) {
        method2253();
        class7.method14();
        int var1 = class41.method2259(arg0).field1022;
        if (var1 == 0) {
            return;
        }
        int var2 = class157.field2649[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class103.method2017(0.9D);
                ((class109) Statics.field1759).method2111(0.9D);
            }
            if (var2 == 2) {
                class103.method2017(0.8D);
                ((class109) Statics.field1759).method2111(0.8D);
            }
            if (var2 == 3) {
                class103.method2017(0.7D);
                ((class109) Statics.field1759).method2111(0.7D);
            }
            if (var2 == 4) {
                class103.method2017(0.6D);
                ((class109) Statics.field1759).method2111(0.6D);
            }
            class39.field961.method3092();
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
            if (field538 != var3) {
                if (field538 == 0 && field701 != -1) {
                    class137.method2564(Statics.field984, field701, 0, var3, false);
                    field702 = false;
                } else if (var3 == 0) {
                    Statics.field2012.method2610();
                    class137.field2312 = 1;
                    Statics.field2318 = null;
                    field702 = false;
                } else if (class137.field2312 == 0) {
                    Statics.field2012.method2629(var3);
                } else {
                    Statics.field2320 = var3;
                }
                field538 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field596 = 127;
            }
            if (var2 == 1) {
                field596 = 96;
            }
            if (var2 == 2) {
                field596 = 64;
            }
            if (var2 == 3) {
                field596 = 32;
            }
            if (var2 == 4) {
                field596 = 0;
            }
        }
        if (var1 == 5) {
            field471 = var2;
        }
        if (var1 == 6) {
            field628 = var2;
        }
        if (var1 == 9) {
            field600 = var2;
        }
        if (var1 != 10) {
            return;
        }
        if (var2 == 0) {
            field469 = 127;
        }
        if (var2 == 1) {
            field469 = 96;
        }
        if (var2 == 2) {
            field469 = 64;
        }
        if (var2 == 3) {
            field469 = 32;
        }
        if (var2 == 4) {
            field469 = 0;
        }
    }

    @ObfuscatedName("af.ca(Lej;I)V")
    public static final void method625(class156 arg0) {
        int var1 = arg0.field2532;
        if (var1 == 324) {
            if (field709 == -1) {
                field709 = arg0.field2552;
                field725 = arg0.field2553;
            }
            if (field550.field2666) {
                arg0.field2552 = field709;
            } else {
                arg0.field2552 = field725;
            }
        } else if (var1 == 325) {
            if (field709 == -1) {
                field709 = arg0.field2552;
                field725 = arg0.field2553;
            }
            if (field550.field2666) {
                arg0.field2552 = field725;
            } else {
                arg0.field2552 = field709;
            }
        } else if (var1 == 327) {
            arg0.field2568 = 150;
            arg0.field2569 = (int) (Math.sin((double) field516 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2560 = 5;
            arg0.field2561 = 0;
        } else if (var1 == 328) {
            arg0.field2568 = 150;
            arg0.field2569 = (int) (Math.sin((double) field516 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2560 = 5;
            arg0.field2561 = 1;
        }
    }

    @ObfuscatedName("fo.cg(IIII)Ly;")
    public static final class4 method3040(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field70 = arg1;
        var3.field64 = arg2;
        field627.method3137(var3, (long) arg0);
        Statics.method1922(arg1);
        class25.method1361(arg1);
        class156 var4 = class156.method2702(arg0);
        if (var4 != null) {
            method166(var4);
        }
        if (field630 != null) {
            method166(field630);
            field630 = null;
        }
        field607 = false;
        field608 = 0;
        method1577(Statics.field1356, Statics.field1358, Statics.field367, Statics.field269);
        if (field485 != -1) {
            method3(field485, 1);
        }
        return var3;
    }

    @ObfuscatedName("dq.ch(Ly;ZI)V")
    public static final void method2562(class4 arg0, boolean arg1) {
        int var2 = arg0.field70;
        int var3 = (int) arg0.field2759;
        arg0.method3182();
        if (arg1 && var2 != -1 && Statics.field2529[var2]) {
            Statics.field2521.method2833(var2);
            if (Statics.field2632[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2632[var2].length; var5++) {
                    if (Statics.field2632[var2][var5] != null) {
                        if (Statics.field2632[var2][var5].field2643 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2632[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2632[var2] = null;
                }
                Statics.field2529[var2] = false;
            }
        }
        for (class169 var6 = (class169) field566.method3141(); var6 != null; var6 = (class169) field566.method3128()) {
            if ((long) var2 == (var6.field2759 >> 48 & 0xFFFFL)) {
                var6.method3182();
            }
        }
        class156 var7 = class156.method2702(var3);
        if (var7 != null) {
            method166(var7);
        }
        field607 = false;
        field608 = 0;
        method1577(Statics.field1356, Statics.field1358, Statics.field367, Statics.field269);
        if (field485 != -1) {
            method3(field485, 1);
        }
    }

    @ObfuscatedName("client.cj(Lej;S)Z")
    public static final boolean method504(class156 arg0) {
        int var1 = arg0.field2532;
        if (var1 == 205) {
            field512 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field550.method3033(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field550.method3010(var4, var5 == 1);
        }
        if (var1 == 324) {
            field550.method3011(false);
        }
        if (var1 == 325) {
            field550.method3011(true);
        }
        if (var1 == 326) {
            field505.method2198(37);
            field550.method3042(field505);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ck.cw(IIIS)V")
    public static final void method2007(int arg0, int arg1, int arg2) {
        method1346();
        class88.method1693(arg0, arg1, Statics.field2053.field1452 + arg0, Statics.field2053.field1450 + arg1);
        if (field699 == 2 || field699 == 5) {
            class88.method1708(arg0 + 25, arg1 + 5, 0, Statics.field92, Statics.field1431);
        } else {
            int var3 = field552 + field477 & 0x7FF;
            int var4 = Statics.field1623.field446 / 32 + 48;
            int var5 = 464 - Statics.field1623.field406 / 32;
            Statics.field347.method1607(arg0 + 25, arg1 + 5, 146, 151, var4, var5, var3, field661 + 256, Statics.field92, Statics.field1431);
            for (int var6 = 0; var6 < field488; var6++) {
                int var7 = field694[var6] * 4 + 2 - Statics.field1623.field446 / 32;
                int var8 = field579[var6] * 4 + 2 - Statics.field1623.field406 / 32;
                Statics.method139(arg0, arg1, var7, var8, field542[var6]);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class175 var11 = field599[Statics.field208][var9][var10];
                    if (var11 != null) {
                        int var12 = var9 * 4 + 2 - Statics.field1623.field446 / 32;
                        int var13 = var10 * 4 + 2 - Statics.field1623.field406 / 32;
                        Statics.method139(arg0, arg1, var12, var13, Statics.field187[0]);
                    }
                }
            }
            for (int var14 = 0; var14 < field503; var14++) {
                class24 var15 = field681[field696[var14]];
                if (var15 != null && var15.method20()) {
                    class30 var16 = var15.field384;
                    if (var16 != null && var16.field790 != null) {
                        var16 = var16.method564();
                    }
                    if (var16 != null && var16.field781 && var16.field783) {
                        int var17 = var15.field446 / 32 - Statics.field1623.field446 / 32;
                        int var18 = var15.field406 / 32 - Statics.field1623.field406 / 32;
                        Statics.method139(arg0, arg1, var17, var18, Statics.field187[1]);
                    }
                }
            }
            for (int var19 = 0; var19 < field677; var19++) {
                class3 var20 = field562[field587[var19]];
                if (var20 != null && var20.method20()) {
                    int var21 = var20.field446 / 32 - Statics.field1623.field446 / 32;
                    int var22 = var20.field406 / 32 - Statics.field1623.field406 / 32;
                    boolean var23 = false;
                    if (method138(var20.field58)) {
                        var23 = true;
                    }
                    boolean var24 = false;
                    if (Statics.field1623.field60 != 0 && var20.field60 != 0 && Statics.field1623.field60 == var20.field60) {
                        var24 = true;
                    }
                    if (var23) {
                        Statics.method139(arg0, arg1, var21, var22, Statics.field187[3]);
                    } else if (var24) {
                        Statics.method139(arg0, arg1, var21, var22, Statics.field187[4]);
                    } else {
                        Statics.method139(arg0, arg1, var21, var22, Statics.field187[2]);
                    }
                }
            }
            if (field484 != 0 && field516 % 20 < 10) {
                if (field484 == 1 && field509 >= 0 && field509 < field681.length) {
                    class24 var25 = field681[field509];
                    if (var25 != null) {
                        int var26 = var25.field446 / 32 - Statics.field1623.field446 / 32;
                        int var27 = var25.field406 / 32 - Statics.field1623.field406 / 32;
                        method226(arg0, arg1, var26, var27, Statics.field152[1]);
                    }
                }
                if (field484 == 2) {
                    int var28 = field487 * 4 - Statics.field1738 * 4 + 2 - Statics.field1623.field446 / 32;
                    int var29 = field704 * 4 - Statics.field277 * 4 + 2 - Statics.field1623.field406 / 32;
                    method226(arg0, arg1, var28, var29, Statics.field152[1]);
                }
                if (field484 == 10 && field486 >= 0 && field486 < field562.length) {
                    class3 var30 = field562[field486];
                    if (var30 != null) {
                        int var31 = var30.field446 / 32 - Statics.field1623.field446 / 32;
                        int var32 = var30.field406 / 32 - Statics.field1623.field406 / 32;
                        method226(arg0, arg1, var31, var32, Statics.field152[1]);
                    }
                }
            }
            if (field693 != 0) {
                int var33 = field693 * 4 + 2 - Statics.field1623.field446 / 32;
                int var34 = field698 * 4 + 2 - Statics.field1623.field406 / 32;
                Statics.method139(arg0, arg1, var33, var34, Statics.field152[0]);
            }
            class88.method1699(arg0 + 93 + 4, arg1 + 82 - 4, 3, 3, 16777215);
        }
        if (field699 < 3) {
            Statics.field106.method1607(arg0, arg1, 33, 33, 25, 25, field552, 256, Statics.field930, Statics.field280);
        } else {
            class88.method1708(arg0, arg1, 0, Statics.field930, Statics.field280);
        }
        if (field522[arg2]) {
            Statics.field2053.method1686(arg0, arg1);
        }
        field670[arg2] = true;
    }

    @ObfuscatedName("o.cx(IIIILcu;I)V")
    public static final void method226(int arg0, int arg1, int arg2, int arg3, class85 arg4) {
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 <= 4225 || var5 >= 90000) {
            Statics.method139(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var6 = field552 + field477 & 0x7FF;
        int var7 = class103.field1763[var6];
        int var8 = class103.field1757[var6];
        int var9 = var7 * 256 / (field661 + 256);
        int var10 = var8 * 256 / (field661 + 256);
        int var11 = arg2 * var10 + arg3 * var9 >> 16;
        int var12 = arg3 * var10 - arg2 * var9 >> 16;
        double var13 = Math.atan2((double) var11, (double) var12);
        int var15 = (int) (Math.sin(var13) * 63.0D);
        int var16 = (int) (Math.cos(var13) * 57.0D);
        Statics.field981.method1605(arg0 + 94 + var15 + 4 - 10, arg1 + 83 - var16 - 20, 20, 20, 15, 15, var13, 256);
    }

    @ObfuscatedName("m.cl(ILjava/lang/String;Ljava/lang/String;B)V")
    public static final void method56(int arg0, String arg1, String arg2) {
        method1319(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bi.ck(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static final void method1319(int arg0, String arg1, String arg2, String arg3) {
        for (int var4 = 99; var4 > 0; var4--) {
            field723[var4] = field723[var4 - 1];
            field678[var4] = field678[var4 - 1];
            field680[var4] = field680[var4 - 1];
            field679[var4] = field679[var4 - 1];
        }
        field723[0] = arg0;
        field678[0] = arg1;
        field680[0] = arg2;
        field679[0] = arg3;
        field495++;
        field656 = field649;
    }

    @ObfuscatedName("l.cf(Ljava/lang/String;B)Z")
    public static boolean method138(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method136(arg0, Statics.field1255);
        for (int var2 = 0; var2 < field717; var2++) {
            if (var1.equalsIgnoreCase(class147.method136(field685[var2].field366, Statics.field1255))) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class147.method136(Statics.field1623.field58, Statics.field1255))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("l.cc(Ljava/lang/String;I)Z")
    public static boolean method141(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class147.method136(arg0, Statics.field1255);
        for (int var2 = 0; var2 < field721; var2++) {
            class11 var3 = field669[var2];
            if (var1.equalsIgnoreCase(class147.method136(var3.field195, Statics.field1255))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class147.method136(var3.field186, Statics.field1255))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("ea.dv(Ljava/lang/String;II)V")
    public static final void method2572(String arg0, int arg1) {
        field505.method2198(56);
        class115 var2 = field505;
        int var3 = arg0.length() + 1;
        var2.method2339(var3 + 1);
        field505.method2318(arg0);
        field505.method2370(arg1);
    }

    @ObfuscatedName("ct.dh(Ljava/lang/String;I)V")
    public static final void method1754(String arg0) {
        if (Statics.field2337 == null) {
            return;
        }
        field505.method2198(188);
        class115 var1 = field505;
        int var2 = arg0.length() + 1;
        var1.method2339(var2);
        field505.method2318(arg0);
    }

    @ObfuscatedName("dj.dc(Lej;I)I")
    public static int method2194(class156 arg0) {
        class169 var1 = (class169) field566.method3129(((long) arg0.field2528 << 32) + (long) arg0.field2616);
        return var1 == null ? arg0.field2637 : var1.field2742;
    }

    @ObfuscatedName("g.dw(Lej;I)Z")
    public static boolean method165(class156 arg0) {
        if (field635) {
            if (method2194(arg0) != 0) {
                return false;
            }
            if (arg0.field2643 == 0) {
                return false;
            }
        }
        return arg0.field2567;
    }

    @ObfuscatedName("a.dt(Lej;I)Ljava/lang/String;")
    public static String method182(class156 arg0) {
        int var1 = method2194(arg0);
        int var2 = var1 >> 11 & 0x3F;
        if (var2 == 0) {
            return null;
        } else if (arg0.field2542 == null || arg0.field2542.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2542;
        }
    }
}

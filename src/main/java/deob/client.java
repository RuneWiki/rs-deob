package deob;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class client extends class19 implements class318 {

    @ObfuscatedName("client.w")
    public static class160[] field465 = new class160[4];

    @ObfuscatedName("client.aw")
    public static boolean field635 = true;

    @ObfuscatedName("client.bt")
    public static int field405 = 1;

    @ObfuscatedName("client.bk")
    public static int field406 = 0;

    @ObfuscatedName("client.by")
    public static int field407 = 0;

    @ObfuscatedName("client.bd")
    public static boolean field562 = false;

    @ObfuscatedName("client.bg")
    public static boolean field409 = false;

    @ObfuscatedName("client.bu")
    public static int field410 = -1;

    @ObfuscatedName("client.bl")
    public static int field474 = -1;

    @ObfuscatedName("client.bj")
    public static boolean field412 = false;

    @ObfuscatedName("client.bq")
    public static int field413 = 0;

    @ObfuscatedName("client.co")
    public static boolean field415 = true;

    @ObfuscatedName("client.cm")
    public static int field452 = 0;

    @ObfuscatedName("client.ct")
    public static long field417 = 1L;

    @ObfuscatedName("client.cy")
    public static int field418 = -1;

    @ObfuscatedName("client.cp")
    public static int field419 = -1;

    @ObfuscatedName("client.cs")
    public static long field420 = -1L;

    @ObfuscatedName("client.cv")
    public static boolean field421 = true;

    @ObfuscatedName("client.cg")
    public static boolean field422 = false;

    @ObfuscatedName("client.cu")
    public static int field423 = 0;

    @ObfuscatedName("client.ck")
    public static int field424 = 0;

    @ObfuscatedName("client.cz")
    public static int field425 = 0;

    @ObfuscatedName("client.ca")
    public static int field426 = 0;

    @ObfuscatedName("client.cx")
    public static int field477 = 0;

    @ObfuscatedName("client.cr")
    public static int field454 = 0;

    @ObfuscatedName("client.cc")
    public static int field429 = 0;

    @ObfuscatedName("client.dk")
    public static int field430 = 0;

    @ObfuscatedName("client.df")
    public static int field553 = 0;

    @ObfuscatedName("client.de")
    public static class81 field459 = class81.field1160;

    @ObfuscatedName("client.dc")
    public static class81 field433 = class81.field1160;

    @ObfuscatedName("client.dx")
    public static int field411 = 0;

    @ObfuscatedName("client.dw")
    public static int field438 = 0;

    @ObfuscatedName("client.dj")
    public static int field436 = 0;

    @ObfuscatedName("client.ee")
    public static int field504 = 0;

    @ObfuscatedName("client.el")
    public static int field673 = 0;

    @ObfuscatedName("client.eg")
    public static int field439 = 0;

    @ObfuscatedName("client.ei")
    public static int field440 = 0;

    @ObfuscatedName("client.ep")
    public static int field590 = 0;

    @ObfuscatedName("client.ea")
    public static class100 field448 = class100.field1268;

    @ObfuscatedName("client.ec")
    public static boolean field443 = false;

    @ObfuscatedName("client.ez")
    public static class58 field444 = new class58();

    @ObfuscatedName("client.em")
    public class385 field596;

    @ObfuscatedName("client.fh")
    public class8 field446;

    @ObfuscatedName("client.fw")
    public static byte[] field447 = null;

    @ObfuscatedName("client.fp")
    public static class78[] field567 = new class78[32768];

    @ObfuscatedName("client.fj")
    public static int field685 = 0;

    @ObfuscatedName("client.fc")
    public static int[] field450 = new int[32768];

    @ObfuscatedName("client.fi")
    public static int field501 = 0;

    @ObfuscatedName("client.fq")
    public static int[] field475 = new int[250];

    @ObfuscatedName("client.fb")
    public static final class86 field453 = new class86();

    @ObfuscatedName("client.fr")
    public static int field571 = 0;

    @ObfuscatedName("client.fe")
    public static boolean field456 = false;

    @ObfuscatedName("client.fm")
    public static boolean field457 = true;

    @ObfuscatedName("client.ft")
    public static class312 field458 = new class312();

    @ObfuscatedName("client.fn")
    public static HashMap field495 = new HashMap();

    @ObfuscatedName("client.gg")
    public static int field460 = 0;

    @ObfuscatedName("client.gx")
    public static int field461 = 1;

    @ObfuscatedName("client.gi")
    public static int field462 = 0;

    @ObfuscatedName("client.gb")
    public static int field550 = 1;

    @ObfuscatedName("client.gh")
    public static int field464 = 0;

    @ObfuscatedName("client.gj")
    public static boolean field481 = false;

    @ObfuscatedName("client.gw")
    public static int[][][] field467 = new int[4][13][13];

    @ObfuscatedName("client.gy")
    public static final int[] field468 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.gv")
    public static int field556 = 0;

    @ObfuscatedName("client.ht")
    public static int field470 = 2301979;

    @ObfuscatedName("client.hl")
    public static int field471 = 5063219;

    @ObfuscatedName("client.hc")
    public static int field472 = 3353893;

    @ObfuscatedName("client.hy")
    public static int field633 = 7759444;

    @ObfuscatedName("client.hn")
    public static boolean field455 = false;

    @ObfuscatedName("client.hk")
    public static int field416 = 0;

    @ObfuscatedName("client.hg")
    public static int field476 = 128;

    @ObfuscatedName("client.hi")
    public static int field445 = 0;

    @ObfuscatedName("client.hb")
    public static int field478 = 0;

    @ObfuscatedName("client.hr")
    public static int field658 = 0;

    @ObfuscatedName("client.hq")
    public static int field491 = 0;

    @ObfuscatedName("client.hd")
    public static int field546 = 0;

    @ObfuscatedName("client.iv")
    public static int field482 = 0;

    @ObfuscatedName("client.ic")
    public static int field483 = 50;

    @ObfuscatedName("client.it")
    public static String field530 = null;

    @ObfuscatedName("client.ir")
    public static int field434 = 0;

    @ObfuscatedName("client.iy")
    public static int field441 = 0;

    @ObfuscatedName("client.in")
    public static int field486 = 0;

    @ObfuscatedName("client.ii")
    public static int field487 = 12;

    @ObfuscatedName("client.ih")
    public static int field488 = 6;

    @ObfuscatedName("client.iq")
    public static int field489 = 0;

    @ObfuscatedName("client.io")
    public static boolean field490 = false;

    @ObfuscatedName("client.ik")
    public static int field608 = 0;

    @ObfuscatedName("client.ie")
    public static boolean field492 = false;

    @ObfuscatedName("client.ia")
    public static int field493 = 0;

    @ObfuscatedName("client.ig")
    public static int field650 = 0;

    @ObfuscatedName("client.id")
    public static int field579 = 50;

    @ObfuscatedName("client.is")
    public static int[] field496 = new int[field579];

    @ObfuscatedName("client.ib")
    public static int[] field497 = new int[field579];

    @ObfuscatedName("client.ip")
    public static int[] field442 = new int[field579];

    @ObfuscatedName("client.im")
    public static int[] field499 = new int[field579];

    @ObfuscatedName("client.iw")
    public static int[] field500 = new int[field579];

    @ObfuscatedName("client.jc")
    public static int[] field662 = new int[field579];

    @ObfuscatedName("client.je")
    public static int[] field664 = new int[field579];

    @ObfuscatedName("client.jv")
    public static String[] field503 = new String[field579];

    @ObfuscatedName("client.jn")
    public static int[][] field502 = new int[104][104];

    @ObfuscatedName("client.ja")
    public static int field505 = 0;

    @ObfuscatedName("client.jr")
    public static int field506 = -1;

    @ObfuscatedName("client.jz")
    public static int field507 = -1;

    @ObfuscatedName("client.jw")
    public static int field508 = 0;

    @ObfuscatedName("client.jt")
    public static int field463 = 0;

    @ObfuscatedName("client.jq")
    public static int field540 = 0;

    @ObfuscatedName("client.jo")
    public static int field511 = 0;

    @ObfuscatedName("client.jh")
    public static boolean field512 = true;

    @ObfuscatedName("client.jd")
    public static int field513 = 0;

    @ObfuscatedName("client.js")
    public static int field514 = 0;

    @ObfuscatedName("client.jb")
    public static int field516 = 0;

    @ObfuscatedName("client.jf")
    public static int field404 = 0;

    @ObfuscatedName("client.jp")
    public static int field584 = 0;

    @ObfuscatedName("client.jl")
    public static int field519 = 0;

    @ObfuscatedName("client.ju")
    public static boolean field520 = false;

    @ObfuscatedName("client.jg")
    public static int field521 = 0;

    @ObfuscatedName("client.jx")
    public static int field522 = 0;

    @ObfuscatedName("client.jk")
    public static boolean field523 = true;

    @ObfuscatedName("client.ki")
    public static class70[] field524 = new class70[2048];

    @ObfuscatedName("client.kf")
    public static int field665 = -1;

    @ObfuscatedName("client.kl")
    public static int field526 = 0;

    @ObfuscatedName("client.kj")
    public static boolean field527 = true;

    @ObfuscatedName("client.kk")
    public static int field427 = 0;

    @ObfuscatedName("client.ko")
    public static int field529 = 0;

    @ObfuscatedName("client.kh")
    public static int[] field628 = new int[1000];

    @ObfuscatedName("client.kt")
    public static final int[] field531 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.kb")
    public static String[] field532 = new String[8];

    @ObfuscatedName("client.ky")
    public static boolean[] field533 = new boolean[8];

    @ObfuscatedName("client.kx")
    public static int[] field534 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.kw")
    public static int field535 = -1;

    @ObfuscatedName("client.km")
    public static class296[][][] field536 = new class296[4][104][104];

    @ObfuscatedName("client.ka")
    public static class296 field537 = new class296();

    @ObfuscatedName("client.kz")
    public static class296 field538 = new class296();

    @ObfuscatedName("client.kp")
    public static class296 field539 = new class296();

    @ObfuscatedName("client.kg")
    public static int[] field435 = new int[25];

    @ObfuscatedName("client.kv")
    public static int[] field541 = new int[25];

    @ObfuscatedName("client.lz")
    public static int[] field542 = new int[25];

    @ObfuscatedName("client.ls")
    public static int field528 = 0;

    @ObfuscatedName("client.ll")
    public static boolean field544 = false;

    @ObfuscatedName("client.lb")
    public static int field545 = 0;

    @ObfuscatedName("client.lc")
    public static int[] field678 = new int[500];

    @ObfuscatedName("client.lg")
    public static int[] field547 = new int[500];

    @ObfuscatedName("client.lm")
    public static int[] field548 = new int[500];

    @ObfuscatedName("client.ly")
    public static int[] field549 = new int[500];

    @ObfuscatedName("client.lw")
    public static String[] field485 = new String[500];

    @ObfuscatedName("client.lt")
    public static String[] field551 = new String[500];

    @ObfuscatedName("client.lr")
    public static boolean[] field674 = new boolean[500];

    @ObfuscatedName("client.li")
    public static boolean field408 = false;

    @ObfuscatedName("client.lx")
    public static boolean field554 = false;

    @ObfuscatedName("client.lv")
    public static boolean field555 = false;

    @ObfuscatedName("client.le")
    public static boolean field578 = true;

    @ObfuscatedName("client.ln")
    public static int field557 = -1;

    @ObfuscatedName("client.lk")
    public static int field558 = -1;

    @ObfuscatedName("client.mo")
    public static int field649 = 0;

    @ObfuscatedName("client.ma")
    public static int field560 = 50;

    @ObfuscatedName("client.mh")
    public static int field561 = 0;

    @ObfuscatedName("client.md")
    public static boolean field563 = false;

    @ObfuscatedName("client.mq")
    public static int field564 = -1;

    @ObfuscatedName("client.mv")
    public static int field565 = -1;

    @ObfuscatedName("client.mf")
    public static String field566 = null;

    @ObfuscatedName("client.mw")
    public static String field466 = null;

    @ObfuscatedName("client.mu")
    public static int field568 = -1;

    @ObfuscatedName("client.mn")
    public static class364 field569 = new class364(8);

    @ObfuscatedName("client.mz")
    public static int field570 = 0;

    @ObfuscatedName("client.mb")
    public static int field484 = -1;

    @ObfuscatedName("client.mp")
    public static int field572 = 0;

    @ObfuscatedName("client.mr")
    public static int field655 = 0;

    @ObfuscatedName("client.mt")
    public static class249 field574 = null;

    @ObfuscatedName("client.mk")
    public static int field432 = 0;

    @ObfuscatedName("client.mx")
    public static int field576 = 0;

    @ObfuscatedName("client.mc")
    public static int field577 = 0;

    @ObfuscatedName("client.mi")
    public static int field510 = -1;

    @ObfuscatedName("client.ng")
    public static boolean field603 = false;

    @ObfuscatedName("client.no")
    public static class249 field580 = null;

    @ObfuscatedName("client.nf")
    public static class249 field581 = null;

    @ObfuscatedName("client.nt")
    public static class249 field582 = null;

    @ObfuscatedName("client.nx")
    public static int field583 = 0;

    @ObfuscatedName("client.nh")
    public static int field525 = 0;

    @ObfuscatedName("client.nb")
    public static class249 field585 = null;

    @ObfuscatedName("client.ns")
    public static boolean field586 = false;

    @ObfuscatedName("client.nd")
    public static int field587 = -1;

    @ObfuscatedName("client.nl")
    public static int field588 = -1;

    @ObfuscatedName("client.nz")
    public static boolean field589 = false;

    @ObfuscatedName("client.nm")
    public static int field679 = -1;

    @ObfuscatedName("client.ni")
    public static int field677 = -1;

    @ObfuscatedName("client.ny")
    public static boolean field592 = false;

    @ObfuscatedName("client.nj")
    public static int field593 = 1;

    @ObfuscatedName("client.nn")
    public static int[] field594 = new int[32];

    @ObfuscatedName("client.na")
    public static int field552 = 0;

    @ObfuscatedName("client.nr")
    public static int[] field641 = new int[32];

    @ObfuscatedName("client.nc")
    public static int field575 = 0;

    @ObfuscatedName("client.ne")
    public static int[] field428 = new int[32];

    @ObfuscatedName("client.op")
    public static int field599 = 0;

    @ObfuscatedName("client.ob")
    public static int[] field600 = new int[32];

    @ObfuscatedName("client.ok")
    public static int field601 = 0;

    @ObfuscatedName("client.oz")
    public static int field602 = 0;

    @ObfuscatedName("client.ox")
    public static int field610 = 0;

    @ObfuscatedName("client.ou")
    public static int field604 = 0;

    @ObfuscatedName("client.of")
    public static int field605 = 0;

    @ObfuscatedName("client.om")
    public static int field606 = 0;

    @ObfuscatedName("client.os")
    public static int field607 = 0;

    @ObfuscatedName("client.ov")
    public static int field480 = 0;

    @ObfuscatedName("client.og")
    public static int field517 = 0;

    @ObfuscatedName("client.ol")
    public static int field657 = 0;

    @ObfuscatedName("client.ow")
    public static class296 field611 = new class296();

    @ObfuscatedName("client.oa")
    public static class296 field612 = new class296();

    @ObfuscatedName("client.oe")
    public static class296 field686 = new class296();

    @ObfuscatedName("client.oi")
    public static class364 field469 = new class364(512);

    @ObfuscatedName("client.oq")
    public static int field591 = 0;

    @ObfuscatedName("client.on")
    public static int field616 = -2;

    @ObfuscatedName("client.or")
    public static boolean[] field617 = new boolean[100];

    @ObfuscatedName("client.oy")
    public static boolean[] field618 = new boolean[100];

    @ObfuscatedName("client.pi")
    public static boolean[] field509 = new boolean[100];

    @ObfuscatedName("client.py")
    public static int[] field623 = new int[100];

    @ObfuscatedName("client.ph")
    public static int[] field626 = new int[100];

    @ObfuscatedName("client.pg")
    public static int[] field622 = new int[100];

    @ObfuscatedName("client.po")
    public static int[] field619 = new int[100];

    @ObfuscatedName("client.pl")
    public static int field624 = 0;

    @ObfuscatedName("client.pf")
    public static long field625 = 0L;

    @ObfuscatedName("client.pm")
    public static boolean field613 = true;

    @ObfuscatedName("client.pb")
    public static int[] field627 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.pz")
    public static int field670 = 0;

    @ObfuscatedName("client.ps")
    public static int field647 = 0;

    @ObfuscatedName("client.pa")
    public static String field630 = "";

    @ObfuscatedName("client.pe")
    public static long[] field573 = new long[100];

    @ObfuscatedName("client.pj")
    public static int field631 = 0;

    @ObfuscatedName("client.pw")
    public static int field451 = 0;

    @ObfuscatedName("client.pk")
    public static int[] field634 = new int[128];

    @ObfuscatedName("client.px")
    public static int[] field431 = new int[128];

    @ObfuscatedName("client.ql")
    public static long field636 = -1L;

    @ObfuscatedName("client.qa")
    public static class115[] field637 = new class115[1];

    @ObfuscatedName("client.qs")
    public static class124[] field638 = new class124[1];

    @ObfuscatedName("client.qi")
    public static int field639 = -1;

    @ObfuscatedName("client.qy")
    public static int field621 = 0;

    @ObfuscatedName("client.qp")
    public static int[] field614 = new int[1000];

    @ObfuscatedName("client.qx")
    public static int[] field642 = new int[1000];

    @ObfuscatedName("client.qq")
    public static class398[] field643 = new class398[1000];

    @ObfuscatedName("client.qv")
    public static int field644 = 0;

    @ObfuscatedName("client.qd")
    public static int field597 = 0;

    @ObfuscatedName("client.qf")
    public static int field646 = 0;

    @ObfuscatedName("client.qe")
    public static int field640 = -1;

    @ObfuscatedName("client.qn")
    public static boolean field648 = false;

    @ObfuscatedName("client.re")
    public static int field498 = 0;

    @ObfuscatedName("client.rh")
    public static int[] field629 = new int[50];

    @ObfuscatedName("client.rr")
    public static int[] field651 = new int[50];

    @ObfuscatedName("client.rl")
    public static int[] field652 = new int[50];

    @ObfuscatedName("client.rn")
    public static int[] field653 = new int[50];

    @ObfuscatedName("client.rj")
    public static class22[] field654 = new class22[50];

    @ObfuscatedName("client.ra")
    public static boolean field615 = false;

    @ObfuscatedName("client.rx")
    public static boolean[] field656 = new boolean[5];

    @ObfuscatedName("client.ri")
    public static int[] field437 = new int[5];

    @ObfuscatedName("client.rm")
    public static int[] field609 = new int[5];

    @ObfuscatedName("client.rc")
    public static int[] field659 = new int[5];

    @ObfuscatedName("client.sg")
    public static int[] field660 = new int[5];

    @ObfuscatedName("client.se")
    public static short field661 = 256;

    @ObfuscatedName("client.sw")
    public static short field632 = 205;

    @ObfuscatedName("client.sh")
    public static short field663 = 256;

    @ObfuscatedName("client.sx")
    public static short field449 = 320;

    @ObfuscatedName("client.sk")
    public static short field473 = 1;

    @ObfuscatedName("client.so")
    public static short field543 = 32767;

    @ObfuscatedName("client.sl")
    public static short field667 = 1;

    @ObfuscatedName("client.sz")
    public static short field668 = 32767;

    @ObfuscatedName("client.sq")
    public static int field669 = 0;

    @ObfuscatedName("client.sy")
    public static int field479 = 0;

    @ObfuscatedName("client.sm")
    public static int field671 = 0;

    @ObfuscatedName("client.sp")
    public static int field672 = 0;

    @ObfuscatedName("client.sv")
    public static int field595 = 0;

    @ObfuscatedName("client.su")
    public static class247 field598 = new class247();

    @ObfuscatedName("client.sn")
    public static int field675 = -1;

    @ObfuscatedName("client.sr")
    public static int field676 = -1;

    @ObfuscatedName("client.sj")
    public static class357 field559 = new class355();

    @ObfuscatedName("client.sb")
    public static class286[] field620 = new class286[8];

    @ObfuscatedName("client.sa")
    public static class47 field518 = new class47();

    @ObfuscatedName("client.tb")
    public static int field680 = -1;

    @ObfuscatedName("client.ta")
    public static ArrayList field681 = new ArrayList(10);

    @ObfuscatedName("client.ty")
    public static int field682 = 0;

    @ObfuscatedName("client.tt")
    public static int field683 = 0;

    @ObfuscatedName("client.tg")
    public static final class46 field494 = new class46();

    @ObfuscatedName("client.tw")
    public static int[] field684 = new int[50];

    @ObfuscatedName("client.tc")
    public static int[] field666 = new int[50];

    @ObfuscatedName("gr.ew(I)Lmr;")
    public static class359 method3288() {
        return Statics.field202;
    }

    @ObfuscatedName("client.at(B)V")
    public final void method225() {
    }

    public final void init() {
        if (!this.method193()) {
            return;
        }
        for (int var1 = 0; var1 <= 20; var1++) {
            String var2 = this.getParameter(Integer.toString(var1));
            if (var2 != null) {
                switch(var1) {
                    case 1:
                        field457 = Integer.parseInt(var2) != 0;
                    case 2:
                    case 11:
                    case 13:
                    case 16:
                    default:
                        break;
                    case 3:
                        if (var2.equalsIgnoreCase(class79.field1142)) {
                            field562 = true;
                        } else {
                            field562 = false;
                        }
                        break;
                    case 4:
                        if (field410 == -1) {
                            field410 = Integer.parseInt(var2);
                        }
                        break;
                    case 5:
                        field406 = Integer.parseInt(var2);
                        break;
                    case 6:
                        Statics.field3644 = class292.method4662(Integer.parseInt(var2));
                        break;
                    case 7:
                        int var3 = Integer.parseInt(var2);
                        class265[] var4 = class265.method1676();
                        int var5 = 0;
                        class265 var7;
                        while (true) {
                            if (var5 >= var4.length) {
                                var7 = null;
                                break;
                            }
                            class265 var6 = var4[var5];
                            if (var6.field3200 == var3) {
                                var7 = var6;
                                break;
                            }
                            var5++;
                        }
                        Statics.field2350 = var7;
                        break;
                    case 8:
                        if (var2.equalsIgnoreCase(class79.field1142)) {
                        }
                        break;
                    case 9:
                        Statics.field1661 = var2;
                        break;
                    case 10:
                        Statics.field976 = (class266) class291.method4326(class266.method3878(), Integer.parseInt(var2));
                        if (Statics.field976 == class266.field3206) {
                            Statics.field761 = class367.field4123;
                        } else {
                            Statics.field761 = class367.field4122;
                        }
                        break;
                    case 12:
                        field405 = Integer.parseInt(var2);
                        break;
                    case 14:
                        Statics.field4314 = Integer.parseInt(var2);
                        break;
                    case 15:
                        field407 = Integer.parseInt(var2);
                        break;
                    case 17:
                        Statics.field3776 = var2;
                }
            }
        }
        method4332();
        Statics.field2918 = this.getCodeBase().getHost();
        String var8 = Statics.field2350.field3202;
        byte var9 = 0;
        try {
            Statics.method3886("oldschool", var8, var9, 21);
        } catch (Exception var11) {
            class409.method5337((String) null, var11);
        }
        Statics.field874 = this;
        Statics.field1259 = field410;
        if (field474 == -1) {
            field474 = 0;
        }
        this.method256(765, 503, 198);
    }

    @ObfuscatedName("ie.ec(I)V")
    public static final void method4332() {
        class200.field2307 = false;
        field409 = false;
    }

    @ObfuscatedName("client.g(B)V")
    public final void method314() {
        int[] var1 = new int[] { 20, 260, 10000 };
        int[] var2 = new int[] { 1000, 100, 500 };
        if (var1 == null || var2 == null) {
            Statics.field3774 = null;
            Statics.field1460 = null;
            Statics.field3775 = (byte[][][]) null;
        } else {
            Statics.field3774 = var1;
            Statics.field1460 = new int[var1.length];
            Statics.field3775 = new byte[var1.length][][];
            for (int var3 = 0; var3 < Statics.field3774.length; var3++) {
                Statics.field3775[var3] = new byte[var2[var3]][];
            }
        }
        Statics.field1982 = field407 == 0 ? 43594 : field405 + 40000;
        Statics.field7 = field407 == 0 ? 443 : field405 + 50000;
        Statics.field3679 = Statics.field1982;
        Statics.field3635 = class248.field2942;
        Statics.field2915 = class248.field2944;
        Statics.field26 = class248.field2941;
        Statics.field2499 = class248.field2943;
        Statics.field1992 = new class87();
        this.method196();
        this.method197();
        Statics.field79 = this.method194();
        Statics.field3766 = new class334(255, class131.field1477, class131.field1479, 500000);
        Statics.field308 = class76.method475();
        this.method195();
        class17.method1703(this, Statics.field1249);
        if (field407 != 0) {
            field422 = true;
        }
        method2909(Statics.field308.field1122);
        Statics.field80 = new class49(Statics.field761);
    }

    @ObfuscatedName("client.aa(I)V")
    public final void method217() {
        field452++;
        this.method1150();
        class274.method4397();
        try {
            if (class235.field2819 == 1) {
                int var1 = Statics.field2816.method4006();
                if (var1 > 0 && Statics.field2816.method4014()) {
                    int var2 = var1 - Statics.field1439;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    Statics.field2816.method4005(var2);
                } else {
                    Statics.field2816.method4011();
                    Statics.field2816.method4009();
                    if (Statics.field2820 == null) {
                        class235.field2819 = 0;
                    } else {
                        class235.field2819 = 2;
                    }
                    Statics.field2080 = null;
                    Statics.field1576 = null;
                }
            }
        } catch (Exception var250) {
            var250.printStackTrace();
            Statics.field2816.method4011();
            class235.field2819 = 0;
            Statics.field2080 = null;
            Statics.field1576 = null;
            Statics.field2820 = null;
        }
        method4372();
        class11 var4 = class11.field59;
        synchronized (class11.field59) {
            class11.field61++;
            class11.field58 = class11.field60;
            class11.field36 = 0;
            class11.field65 = 0;
            Arrays.fill(class11.field47, false);
            Arrays.fill(class11.field39, false);
            if (class11.field51 < 0) {
                Arrays.fill(class11.field46, false);
                class11.field51 = class11.field50;
            } else {
                while (class11.field51 != class11.field50) {
                    int var5 = class11.field49[class11.field50];
                    class11.field50 = class11.field50 + 1 & 0x7F;
                    if (var5 < 0) {
                        int var6 = ~var5;
                        if (class11.field46[var6]) {
                            class11.field46[var6] = false;
                            class11.field39[var6] = true;
                            class11.field56[class11.field65] = var6;
                            class11.field65++;
                        }
                    } else {
                        if (!class11.field46[var5] && class11.field36 < class11.field54.length - 1) {
                            class11.field47[var5] = true;
                            class11.field54[++class11.field36 - 1] = var5;
                        }
                        class11.field46[var5] = true;
                    }
                }
            }
            if (class11.field36 > 0) {
                class11.field61 = 0;
            }
            class11.field60 = class11.field53;
        }
        class20 var8 = class20.field135;
        synchronized (class20.field135) {
            class20.field141 = class20.field143;
            class20.field142 = class20.field138;
            class20.field145 = class20.field139;
            class20.field144 = class20.field133;
            class20.field149 = class20.field154;
            class20.field150 = class20.field136;
            class20.field151 = class20.field147;
            class20.field152 = class20.field148;
            class20.field154 = 0;
        }
        if (Statics.field79 != null) {
            int var10 = Statics.field79.method67();
            field657 = var10;
        }
        if (field413 == 0) {
            method3298();
            Statics.field1199.method2281();
            for (int var11 = 0; var11 < 32; var11++) {
                field105[var11] = 0L;
            }
            for (int var12 = 0; var12 < 32; var12++) {
                field112[var12] = 0L;
            }
            Statics.field3167 = 0;
        } else if (field413 == 5) {
            class56.method2688(this);
            method3298();
            Statics.field1199.method2281();
            for (int var13 = 0; var13 < 32; var13++) {
                field105[var13] = 0L;
            }
            for (int var14 = 0; var14 < 32; var14++) {
                field112[var14] = 0L;
            }
            Statics.field3167 = 0;
        } else if (field413 == 10 || field413 == 11) {
            class56.method2688(this);
        } else if (field413 == 20) {
            class56.method2688(this);
            this.method1113();
        } else if (field413 == 25) {
            method3963(false);
            field460 = 0;
            boolean var15 = true;
            for (int var16 = 0; var16 < Statics.field2673.length; var16++) {
                if (Statics.field3110[var16] != -1 && Statics.field2673[var16] == null) {
                    Statics.field2673[var16] = Statics.field2277.method4459(Statics.field3110[var16], 0);
                    if (Statics.field2673[var16] == null) {
                        var15 = false;
                        field460++;
                    }
                }
                if (Statics.field1263[var16] != -1 && Statics.field4011[var16] == null) {
                    Statics.field4011[var16] = Statics.field2277.method4460(Statics.field1263[var16], 0, Statics.field370[var16]);
                    if (Statics.field4011[var16] == null) {
                        var15 = false;
                        field460++;
                    }
                }
            }
            if (var15) {
                field462 = 0;
                boolean var17 = true;
                for (int var18 = 0; var18 < Statics.field2673.length; var18++) {
                    byte[] var19 = Statics.field4011[var18];
                    if (var19 != null) {
                        int var20 = (Statics.field2821[var18] >> 8) * 64 - Statics.field3625;
                        int var21 = (Statics.field2821[var18] & 0xFF) * 64 - Statics.field1134;
                        if (field481) {
                            var20 = 10;
                            var21 = 10;
                        }
                        boolean var23 = true;
                        class385 var24 = new class385(var19);
                        int var25 = -1;
                        label1153: while (true) {
                            int var26 = var24.method6181();
                            if (var26 == 0) {
                                var17 &= var23;
                                break;
                            }
                            var25 += var26;
                            int var27 = 0;
                            boolean var28 = false;
                            while (true) {
                                while (!var28) {
                                    int var30 = var24.method5972();
                                    if (var30 == 0) {
                                        continue label1153;
                                    }
                                    var27 += var30 - 1;
                                    int var31 = var27 & 0x3F;
                                    int var32 = var27 >> 6 & 0x3F;
                                    int var33 = var24.method5958() >> 2;
                                    int var34 = var20 + var32;
                                    int var35 = var21 + var31;
                                    if (var34 > 0 && var35 > 0 && var34 < 103 && var35 < 103) {
                                        class156 var36 = class156.method2267(var25);
                                        if (var33 != 22 || !field409 || var36.field1754 != 0 || var36.field1752 == 1 || var36.field1759) {
                                            if (!var36.method2675()) {
                                                field462++;
                                                var23 = false;
                                            }
                                            var28 = true;
                                        }
                                    }
                                }
                                int var29 = var24.method5972();
                                if (var29 == 0) {
                                    break;
                                }
                                var24.method5958();
                            }
                        }
                    }
                }
                if (var17) {
                    if (field464 != 0) {
                        method108(class270.field3237 + class79.field1144 + class79.field1141 + 100 + "%" + class79.field1139, true);
                    }
                    method4372();
                    Statics.field1925.method3699();
                    for (int var38 = 0; var38 < 4; var38++) {
                        field465[var38].method2851();
                    }
                    for (int var39 = 0; var39 < 4; var39++) {
                        for (int var40 = 0; var40 < 104; var40++) {
                            for (int var41 = 0; var41 < 104; var41++) {
                                class62.field901[var39][var40][var41] = 0;
                            }
                        }
                    }
                    method4372();
                    class62.field902 = 99;
                    Statics.field3937 = new byte[4][104][104];
                    Statics.field895 = new byte[4][104][104];
                    Statics.field916 = new byte[4][104][104];
                    Statics.field910 = new byte[4][104][104];
                    Statics.field1915 = new int[4][105][105];
                    Statics.field3114 = new byte[4][105][105];
                    Statics.field905 = new int[105][105];
                    Statics.field788 = new int[104];
                    Statics.field903 = new int[104];
                    Statics.field3138 = new int[104];
                    Statics.field3926 = new int[104];
                    Statics.field1162 = new int[104];
                    int var42 = Statics.field2673.length;
                    for (class50 var43 = (class50) class50.field720.method4721(); var43 != null; var43 = (class50) class50.field720.method4712()) {
                        if (var43.field727 != null) {
                            Statics.field1163.method380(var43.field727);
                            var43.field727 = null;
                        }
                        if (var43.field725 != null) {
                            Statics.field1163.method380(var43.field725);
                            var43.field725 = null;
                        }
                    }
                    class50.field720.method4705();
                    method3963(true);
                    if (!field481) {
                        for (int var44 = 0; var44 < var42; var44++) {
                            int var45 = (Statics.field2821[var44] >> 8) * 64 - Statics.field3625;
                            int var46 = (Statics.field2821[var44] & 0xFF) * 64 - Statics.field1134;
                            byte[] var47 = Statics.field2673[var44];
                            if (var47 != null) {
                                method4372();
                                class62.method1610(var47, var45, var46, Statics.field137 * 8 - 48, Statics.field27 * 8 - 48, field465);
                            }
                        }
                        for (int var48 = 0; var48 < var42; var48++) {
                            int var49 = (Statics.field2821[var48] >> 8) * 64 - Statics.field3625;
                            int var50 = (Statics.field2821[var48] & 0xFF) * 64 - Statics.field1134;
                            byte[] var51 = Statics.field2673[var48];
                            if (var51 == null && Statics.field27 < 800) {
                                method4372();
                                class62.method2939(var49, var50, 64, 64);
                            }
                        }
                        method3963(true);
                        for (int var52 = 0; var52 < var42; var52++) {
                            byte[] var53 = Statics.field4011[var52];
                            if (var53 != null) {
                                int var54 = (Statics.field2821[var52] >> 8) * 64 - Statics.field3625;
                                int var55 = (Statics.field2821[var52] & 0xFF) * 64 - Statics.field1134;
                                method4372();
                                class200 var56 = Statics.field1925;
                                class160[] var57 = field465;
                                class385 var58 = new class385(var53);
                                int var59 = -1;
                                while (true) {
                                    int var60 = var58.method6181();
                                    if (var60 == 0) {
                                        break;
                                    }
                                    var59 += var60;
                                    int var61 = 0;
                                    while (true) {
                                        int var62 = var58.method5972();
                                        if (var62 == 0) {
                                            break;
                                        }
                                        var61 += var62 - 1;
                                        int var63 = var61 & 0x3F;
                                        int var64 = var61 >> 6 & 0x3F;
                                        int var65 = var61 >> 12;
                                        int var66 = var58.method5958();
                                        int var67 = var66 >> 2;
                                        int var68 = var66 & 0x3;
                                        int var69 = var54 + var64;
                                        int var70 = var55 + var63;
                                        if (var69 > 0 && var70 > 0 && var69 < 103 && var70 < 103) {
                                            int var71 = var65;
                                            if ((class62.field901[1][var69][var70] & 0x2) == 2) {
                                                var71 = var65 - 1;
                                            }
                                            class160 var72 = null;
                                            if (var71 >= 0) {
                                                var72 = var57[var71];
                                            }
                                            class62.method1293(var65, var69, var70, var59, var68, var67, var56, var72);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (field481) {
                        int var73 = 0;
                        label1052: while (true) {
                            if (var73 >= 4) {
                                for (int var84 = 0; var84 < 13; var84++) {
                                    for (int var85 = 0; var85 < 13; var85++) {
                                        int var86 = field467[0][var84][var85];
                                        if (var86 == -1) {
                                            class62.method2939(var84 * 8, var85 * 8, 8, 8);
                                        }
                                    }
                                }
                                method3963(true);
                                int var87 = 0;
                                while (true) {
                                    if (var87 >= 4) {
                                        break label1052;
                                    }
                                    method4372();
                                    for (int var88 = 0; var88 < 13; var88++) {
                                        for (int var89 = 0; var89 < 13; var89++) {
                                            int var90 = field467[var87][var88][var89];
                                            if (var90 != -1) {
                                                int var91 = var90 >> 24 & 0x3;
                                                int var92 = var90 >> 1 & 0x3;
                                                int var93 = var90 >> 14 & 0x3FF;
                                                int var94 = var90 >> 3 & 0x7FF;
                                                int var95 = (var93 / 8 << 8) + var94 / 8;
                                                for (int var96 = 0; var96 < Statics.field2821.length; var96++) {
                                                    if (Statics.field2821[var96] == var95 && Statics.field4011[var96] != null) {
                                                        class62.method2375(Statics.field4011[var96], var87, var88 * 8, var89 * 8, var91, (var93 & 0x7) * 8, (var94 & 0x7) * 8, var92, Statics.field1925, field465);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var87++;
                                }
                            }
                            method4372();
                            for (int var74 = 0; var74 < 13; var74++) {
                                for (int var75 = 0; var75 < 13; var75++) {
                                    boolean var76 = false;
                                    int var77 = field467[var73][var74][var75];
                                    if (var77 != -1) {
                                        int var78 = var77 >> 24 & 0x3;
                                        int var79 = var77 >> 1 & 0x3;
                                        int var80 = var77 >> 14 & 0x3FF;
                                        int var81 = var77 >> 3 & 0x7FF;
                                        int var82 = (var80 / 8 << 8) + var81 / 8;
                                        for (int var83 = 0; var83 < Statics.field2821.length; var83++) {
                                            if (Statics.field2821[var83] == var82 && Statics.field2673[var83] != null) {
                                                class62.method3148(Statics.field2673[var83], var73, var74 * 8, var75 * 8, var78, (var80 & 0x7) * 8, (var81 & 0x7) * 8, var79, field465);
                                                var76 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var76) {
                                        class62.method4679(var73, var74 * 8, var75 * 8);
                                    }
                                }
                            }
                            var73++;
                        }
                    }
                    method3963(true);
                    method4372();
                    class200 var97 = Statics.field1925;
                    class160[] var98 = field465;
                    for (int var99 = 0; var99 < 4; var99++) {
                        for (int var100 = 0; var100 < 104; var100++) {
                            for (int var101 = 0; var101 < 104; var101++) {
                                if ((class62.field901[var99][var100][var101] & 0x1) == 1) {
                                    int var102 = var99;
                                    if ((class62.field901[1][var100][var101] & 0x2) == 2) {
                                        var102 = var99 - 1;
                                    }
                                    if (var102 >= 0) {
                                        var98[var102].method2850(var100, var101);
                                    }
                                }
                            }
                        }
                    }
                    class62.field914 += (int) (Math.random() * 5.0D) - 2;
                    if (class62.field914 < -8) {
                        class62.field914 = -8;
                    }
                    if (class62.field914 > 8) {
                        class62.field914 = 8;
                    }
                    class62.field900 += (int) (Math.random() * 5.0D) - 2;
                    if (class62.field900 < -16) {
                        class62.field900 = -16;
                    }
                    if (class62.field900 > 16) {
                        class62.field900 = 16;
                    }
                    for (int var103 = 0; var103 < 4; var103++) {
                        byte[][] var104 = Statics.field3114[var103];
                        int var105 = (int) Math.sqrt(5100.0D);
                        int var106 = var105 * 768 >> 8;
                        for (int var107 = 1; var107 < 103; var107++) {
                            for (int var108 = 1; var108 < 103; var108++) {
                                int var109 = class62.field911[var103][var108 + 1][var107] - class62.field911[var103][var108 - 1][var107];
                                int var110 = class62.field911[var103][var108][var107 + 1] - class62.field911[var103][var108][var107 - 1];
                                int var111 = (int) Math.sqrt((double) (var110 * var110 + var109 * var109 + 65536));
                                int var112 = (var109 << 8) / var111;
                                int var113 = 65536 / var111;
                                int var114 = (var110 << 8) / var111;
                                int var115 = (var114 * -50 + var112 * -50 + var113 * -10) / var106 + 96;
                                int var116 = (var104[var108][var107] >> 1) + (var104[var108][var107 + 1] >> 3) + (var104[var108][var107 - 1] >> 2) + (var104[var108 - 1][var107] >> 2) + (var104[var108 + 1][var107] >> 3);
                                Statics.field905[var108][var107] = var115 - var116;
                            }
                        }
                        for (int var117 = 0; var117 < 104; var117++) {
                            Statics.field788[var117] = 0;
                            Statics.field903[var117] = 0;
                            Statics.field3138[var117] = 0;
                            Statics.field3926[var117] = 0;
                            Statics.field1162[var117] = 0;
                        }
                        for (int var118 = -5; var118 < 109; var118++) {
                            for (int var119 = 0; var119 < 104; var119++) {
                                int var120 = var118 + 5;
                                int var10002;
                                if (var120 >= 0 && var120 < 104) {
                                    int var121 = Statics.field3937[var103][var120][var119] & 0xFF;
                                    if (var121 > 0) {
                                        int var122 = var121 - 1;
                                        class151 var123 = (class151) class151.field1680.method3927((long) var122);
                                        class151 var124;
                                        if (var123 == null) {
                                            byte[] var125 = Statics.field1683.method4459(1, var122);
                                            class151 var126 = new class151();
                                            if (var125 != null) {
                                                var126.method2559(new class385(var125), var122);
                                            }
                                            var126.method2558();
                                            class151.field1680.method3929(var126, (long) var122);
                                            var124 = var126;
                                        } else {
                                            var124 = var123;
                                        }
                                        Statics.field788[var119] += var124.field1682;
                                        Statics.field903[var119] += var124.field1686;
                                        Statics.field3138[var119] += var124.field1684;
                                        Statics.field3926[var119] += var124.field1685;
                                        var10002 = Statics.field1162[var119]++;
                                    }
                                }
                                int var128 = var118 - 5;
                                if (var128 >= 0 && var128 < 104) {
                                    int var129 = Statics.field3937[var103][var128][var119] & 0xFF;
                                    if (var129 > 0) {
                                        int var130 = var129 - 1;
                                        class151 var131 = (class151) class151.field1680.method3927((long) var130);
                                        class151 var132;
                                        if (var131 == null) {
                                            byte[] var133 = Statics.field1683.method4459(1, var130);
                                            class151 var134 = new class151();
                                            if (var133 != null) {
                                                var134.method2559(new class385(var133), var130);
                                            }
                                            var134.method2558();
                                            class151.field1680.method3929(var134, (long) var130);
                                            var132 = var134;
                                        } else {
                                            var132 = var131;
                                        }
                                        Statics.field788[var119] -= var132.field1682;
                                        Statics.field903[var119] -= var132.field1686;
                                        Statics.field3138[var119] -= var132.field1684;
                                        Statics.field3926[var119] -= var132.field1685;
                                        var10002 = Statics.field1162[var119]--;
                                    }
                                }
                            }
                            if (var118 >= 1 && var118 < 103) {
                                int var136 = 0;
                                int var137 = 0;
                                int var138 = 0;
                                int var139 = 0;
                                int var140 = 0;
                                for (int var141 = -5; var141 < 109; var141++) {
                                    int var142 = var141 + 5;
                                    if (var142 >= 0 && var142 < 104) {
                                        var136 += Statics.field788[var142];
                                        var137 += Statics.field903[var142];
                                        var138 += Statics.field3138[var142];
                                        var139 += Statics.field3926[var142];
                                        var140 += Statics.field1162[var142];
                                    }
                                    int var143 = var141 - 5;
                                    if (var143 >= 0 && var143 < 104) {
                                        var136 -= Statics.field788[var143];
                                        var137 -= Statics.field903[var143];
                                        var138 -= Statics.field3138[var143];
                                        var139 -= Statics.field3926[var143];
                                        var140 -= Statics.field1162[var143];
                                    }
                                    if (var141 >= 1 && var141 < 103 && (!field409 || (class62.field901[0][var118][var141] & 0x2) != 0 || (class62.field901[var103][var118][var141] & 0x10) == 0)) {
                                        if (var103 < class62.field902) {
                                            class62.field902 = var103;
                                        }
                                        int var144 = Statics.field3937[var103][var118][var141] & 0xFF;
                                        int var145 = Statics.field895[var103][var118][var141] & 0xFF;
                                        if (var144 > 0 || var145 > 0) {
                                            int var146 = class62.field911[var103][var118][var141];
                                            int var147 = class62.field911[var103][var118 + 1][var141];
                                            int var148 = class62.field911[var103][var118 + 1][var141 + 1];
                                            int var149 = class62.field911[var103][var118][var141 + 1];
                                            int var150 = Statics.field905[var118][var141];
                                            int var151 = Statics.field905[var118 + 1][var141];
                                            int var152 = Statics.field905[var118 + 1][var141 + 1];
                                            int var153 = Statics.field905[var118][var141 + 1];
                                            int var154 = -1;
                                            int var155 = -1;
                                            if (var144 > 0) {
                                                int var156 = var136 * 256 / var139;
                                                int var157 = var137 / var140;
                                                int var158 = var138 / var140;
                                                var154 = class62.method1678(var156, var157, var158);
                                                int var159 = class62.field914 + var156 & 0xFF;
                                                int var160 = class62.field900 + var158;
                                                if (var160 < 0) {
                                                    var160 = 0;
                                                } else if (var160 > 255) {
                                                    var160 = 255;
                                                }
                                                var155 = class62.method1678(var159, var157, var160);
                                            }
                                            if (var103 > 0) {
                                                boolean var161 = true;
                                                if (var144 == 0 && Statics.field916[var103][var118][var141] != 0) {
                                                    var161 = false;
                                                }
                                                if (var145 > 0) {
                                                    int var162 = var145 - 1;
                                                    class158 var163 = (class158) class158.field1843.method3927((long) var162);
                                                    class158 var164;
                                                    if (var163 == null) {
                                                        byte[] var165 = Statics.field1855.method4459(4, var162);
                                                        class158 var166 = new class158();
                                                        if (var165 != null) {
                                                            var166.method2801(new class385(var165), var162);
                                                        }
                                                        var166.method2800();
                                                        class158.field1843.method3929(var166, (long) var162);
                                                        var164 = var166;
                                                    } else {
                                                        var164 = var163;
                                                    }
                                                    if (!var164.field1846) {
                                                        var161 = false;
                                                    }
                                                }
                                                if (var161 && var146 == var147 && var146 == var148 && var146 == var149) {
                                                    Statics.field1915[var103][var118][var141] |= 0x924;
                                                }
                                            }
                                            int var167 = 0;
                                            if (var155 != -1) {
                                                var167 = class198.field2268[class62.method1563(var155, 96)];
                                            }
                                            if (var145 == 0) {
                                                var97.method3718(var103, var118, var141, 0, 0, -1, var146, var147, var148, var149, class62.method1563(var154, var150), class62.method1563(var154, var151), class62.method1563(var154, var152), class62.method1563(var154, var153), 0, 0, 0, 0, var167, 0);
                                            } else {
                                                int var168 = Statics.field916[var103][var118][var141] + 1;
                                                byte var169 = Statics.field910[var103][var118][var141];
                                                int var170 = var145 - 1;
                                                class158 var171 = (class158) class158.field1843.method3927((long) var170);
                                                class158 var172;
                                                if (var171 == null) {
                                                    byte[] var173 = Statics.field1855.method4459(4, var170);
                                                    class158 var174 = new class158();
                                                    if (var173 != null) {
                                                        var174.method2801(new class385(var173), var170);
                                                    }
                                                    var174.method2800();
                                                    class158.field1843.method3929(var174, (long) var170);
                                                    var172 = var174;
                                                } else {
                                                    var172 = var171;
                                                }
                                                int var176 = var172.field1856;
                                                int var177;
                                                int var178;
                                                if (var176 >= 0) {
                                                    var177 = Statics.field2269.method3742(var176);
                                                    var178 = -1;
                                                } else if (var172.field1844 == 16711935) {
                                                    var178 = -2;
                                                    var176 = -1;
                                                    var177 = -2;
                                                } else {
                                                    var178 = class62.method1678(var172.field1847, var172.field1849, var172.field1850);
                                                    int var179 = class62.field914 + var172.field1847 & 0xFF;
                                                    int var180 = class62.field900 + var172.field1850;
                                                    if (var180 < 0) {
                                                        var180 = 0;
                                                    } else if (var180 > 255) {
                                                        var180 = 255;
                                                    }
                                                    var177 = class62.method1678(var179, var172.field1849, var180);
                                                }
                                                int var181 = 0;
                                                if (var177 != -2) {
                                                    var181 = class198.field2268[class62.method1549(var177, 96)];
                                                }
                                                if (var172.field1848 != -1) {
                                                    int var182 = class62.field914 + var172.field1851 & 0xFF;
                                                    int var183 = class62.field900 + var172.field1853;
                                                    if (var183 < 0) {
                                                        var183 = 0;
                                                    } else if (var183 > 255) {
                                                        var183 = 255;
                                                    }
                                                    int var184 = class62.method1678(var182, var172.field1852, var183);
                                                    var181 = class198.field2268[class62.method1549(var184, 96)];
                                                }
                                                var97.method3718(var103, var118, var141, var168, var169, var176, var146, var147, var148, var149, class62.method1563(var154, var150), class62.method1563(var154, var151), class62.method1563(var154, var152), class62.method1563(var154, var153), class62.method1549(var178, var150), class62.method1549(var178, var151), class62.method1549(var178, var152), class62.method1549(var178, var153), var167, var181);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (int var185 = 1; var185 < 103; var185++) {
                            for (int var186 = 1; var186 < 103; var186++) {
                                int var191;
                                if ((class62.field901[var103][var186][var185] & 0x8) != 0) {
                                    var191 = 0;
                                } else if (var103 <= 0 || (class62.field901[1][var186][var185] & 0x2) == 0) {
                                    var191 = var103;
                                } else {
                                    var191 = var103 - 1;
                                }
                                var97.method3543(var103, var186, var185, var191);
                            }
                        }
                        Statics.field3937[var103] = (byte[][]) null;
                        Statics.field895[var103] = (byte[][]) null;
                        Statics.field916[var103] = (byte[][]) null;
                        Statics.field910[var103] = (byte[][]) null;
                        Statics.field3114[var103] = (byte[][]) null;
                    }
                    var97.method3569(-50, -10, -50);
                    for (int var192 = 0; var192 < 104; var192++) {
                        for (int var193 = 0; var193 < 104; var193++) {
                            if ((class62.field901[1][var192][var193] & 0x2) == 2) {
                                var97.method3653(var192, var193);
                            }
                        }
                    }
                    int var194 = 1;
                    int var195 = 2;
                    int var196 = 4;
                    for (int var197 = 0; var197 < 4; var197++) {
                        if (var197 > 0) {
                            var194 <<= 0x3;
                            var195 <<= 0x3;
                            var196 <<= 0x3;
                        }
                        for (int var198 = 0; var198 <= var197; var198++) {
                            for (int var199 = 0; var199 <= 104; var199++) {
                                for (int var200 = 0; var200 <= 104; var200++) {
                                    if ((Statics.field1915[var198][var200][var199] & var194) != 0) {
                                        int var201 = var199;
                                        int var202 = var199;
                                        int var203 = var198;
                                        int var204 = var198;
                                        while (var201 > 0 && (Statics.field1915[var198][var200][var201 - 1] & var194) != 0) {
                                            var201--;
                                        }
                                        while (var202 < 104 && (Statics.field1915[var198][var200][var202 + 1] & var194) != 0) {
                                            var202++;
                                        }
                                        label737: while (var203 > 0) {
                                            for (int var205 = var201; var205 <= var202; var205++) {
                                                if ((Statics.field1915[var203 - 1][var200][var205] & var194) == 0) {
                                                    break label737;
                                                }
                                            }
                                            var203--;
                                        }
                                        label726: while (var204 < var197) {
                                            for (int var206 = var201; var206 <= var202; var206++) {
                                                if ((Statics.field1915[var204 + 1][var200][var206] & var194) == 0) {
                                                    break label726;
                                                }
                                            }
                                            var204++;
                                        }
                                        int var207 = (var204 + 1 - var203) * (var202 - var201 + 1);
                                        if (var207 >= 8) {
                                            short var208 = 240;
                                            int var209 = class62.field911[var204][var200][var201] - var208;
                                            int var210 = class62.field911[var203][var200][var201];
                                            class200.method3542(var197, 1, var200 * 128, var200 * 128, var201 * 128, var202 * 128 + 128, var209, var210);
                                            for (int var211 = var203; var211 <= var204; var211++) {
                                                for (int var212 = var201; var212 <= var202; var212++) {
                                                    Statics.field1915[var211][var200][var212] &= ~var194;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1915[var198][var200][var199] & var195) != 0) {
                                        int var213 = var200;
                                        int var214 = var200;
                                        int var215 = var198;
                                        int var216 = var198;
                                        while (var213 > 0 && (Statics.field1915[var198][var213 - 1][var199] & var195) != 0) {
                                            var213--;
                                        }
                                        while (var214 < 104 && (Statics.field1915[var198][var214 + 1][var199] & var195) != 0) {
                                            var214++;
                                        }
                                        label790: while (var215 > 0) {
                                            for (int var217 = var213; var217 <= var214; var217++) {
                                                if ((Statics.field1915[var215 - 1][var217][var199] & var195) == 0) {
                                                    break label790;
                                                }
                                            }
                                            var215--;
                                        }
                                        label779: while (var216 < var197) {
                                            for (int var218 = var213; var218 <= var214; var218++) {
                                                if ((Statics.field1915[var216 + 1][var218][var199] & var195) == 0) {
                                                    break label779;
                                                }
                                            }
                                            var216++;
                                        }
                                        int var219 = (var216 + 1 - var215) * (var214 - var213 + 1);
                                        if (var219 >= 8) {
                                            short var220 = 240;
                                            int var221 = class62.field911[var216][var213][var199] - var220;
                                            int var222 = class62.field911[var215][var213][var199];
                                            class200.method3542(var197, 2, var213 * 128, var214 * 128 + 128, var199 * 128, var199 * 128, var221, var222);
                                            for (int var223 = var215; var223 <= var216; var223++) {
                                                for (int var224 = var213; var224 <= var214; var224++) {
                                                    Statics.field1915[var223][var224][var199] &= ~var195;
                                                }
                                            }
                                        }
                                    }
                                    if ((Statics.field1915[var198][var200][var199] & var196) != 0) {
                                        int var225 = var200;
                                        int var226 = var200;
                                        int var227 = var199;
                                        int var228 = var199;
                                        while (var227 > 0 && (Statics.field1915[var198][var200][var227 - 1] & var196) != 0) {
                                            var227--;
                                        }
                                        while (var228 < 104 && (Statics.field1915[var198][var200][var228 + 1] & var196) != 0) {
                                            var228++;
                                        }
                                        label843: while (var225 > 0) {
                                            for (int var229 = var227; var229 <= var228; var229++) {
                                                if ((Statics.field1915[var198][var225 - 1][var229] & var196) == 0) {
                                                    break label843;
                                                }
                                            }
                                            var225--;
                                        }
                                        label832: while (var226 < 104) {
                                            for (int var230 = var227; var230 <= var228; var230++) {
                                                if ((Statics.field1915[var198][var226 + 1][var230] & var196) == 0) {
                                                    break label832;
                                                }
                                            }
                                            var226++;
                                        }
                                        if ((var226 - var225 + 1) * (var228 - var227 + 1) >= 4) {
                                            int var231 = class62.field911[var198][var225][var227];
                                            class200.method3542(var197, 4, var225 * 128, var226 * 128 + 128, var227 * 128, var228 * 128 + 128, var231, var231);
                                            for (int var232 = var225; var232 <= var226; var232++) {
                                                for (int var233 = var227; var233 <= var228; var233++) {
                                                    Statics.field1915[var198][var232][var233] &= ~var196;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    method3963(true);
                    int var234 = class62.field902;
                    if (var234 > Statics.field3652) {
                        var234 = Statics.field3652;
                    }
                    if (var234 < Statics.field3652 - 1) {
                        int var235 = Statics.field3652 - 1;
                    }
                    if (field409) {
                        Statics.field1925.method3597(class62.field902);
                    } else {
                        Statics.field1925.method3597(0);
                    }
                    for (int var236 = 0; var236 < 104; var236++) {
                        for (int var237 = 0; var237 < 104; var237++) {
                            method1404(var236, var237);
                        }
                    }
                    method4372();
                    method2889();
                    class156.field1738.method3930();
                    if (Statics.field874.method224()) {
                        class229 var238 = class229.method2538(class227.field2622, field453.field1205);
                        var238.field2691.method5944(1057001181);
                        field453.method1987(var238);
                    }
                    if (!field481) {
                        int var239 = (Statics.field137 - 6) / 8;
                        int var240 = (Statics.field137 + 6) / 8;
                        int var241 = (Statics.field27 - 6) / 8;
                        int var242 = (Statics.field27 + 6) / 8;
                        for (int var243 = var239 - 1; var243 <= var240 + 1; var243++) {
                            for (int var244 = var241 - 1; var244 <= var242 + 1; var244++) {
                                if (var243 < var239 || var243 > var240 || var244 < var241 || var244 > var242) {
                                    Statics.field2277.method4481("m" + var243 + "_" + var244);
                                    Statics.field2277.method4481("l" + var243 + "_" + var244);
                                }
                            }
                        }
                    }
                    method159(30);
                    method4372();
                    Statics.field3937 = (byte[][][]) null;
                    Statics.field895 = (byte[][][]) null;
                    Statics.field916 = (byte[][][]) null;
                    Statics.field910 = (byte[][][]) null;
                    Statics.field1915 = (int[][][]) null;
                    Statics.field3114 = (byte[][][]) null;
                    Statics.field905 = (int[][]) null;
                    Statics.field788 = null;
                    Statics.field903 = null;
                    Statics.field3138 = null;
                    Statics.field3926 = null;
                    Statics.field1162 = null;
                    class229 var245 = class229.method2538(class227.field2577, field453.field1205);
                    field453.method1987(var245);
                    Statics.field1199.method2281();
                    for (int var246 = 0; var246 < 32; var246++) {
                        field105[var246] = 0L;
                    }
                    for (int var247 = 0; var247 < 32; var247++) {
                        field112[var247] = 0L;
                    }
                    Statics.field3167 = 0;
                } else {
                    field464 = 2;
                }
            } else {
                field464 = 1;
            }
        }
        if (field413 == 30) {
            this.method843();
        } else if (field413 == 40 || field413 == 45) {
            this.method1113();
        }
    }

    @ObfuscatedName("client.ab(ZI)V")
    public final void method229(boolean arg0) {
        boolean var2 = class235.method341();
        if (var2 && field648 && Statics.field2070 != null) {
            Statics.field2070.method449();
        }
        if ((field413 == 10 || field413 == 20 || field413 == 30) && field625 != 0L && class382.method2013() > field625) {
            method2909(method4156());
        }
        if (arg0) {
            for (int var3 = 0; var3 < 100; var3++) {
                field617[var3] = true;
            }
        }
        if (field413 == 0) {
            this.method219(class56.field806, class56.field807, arg0);
        } else if (field413 == 5) {
            class56.method4691(Statics.field1468, Statics.field398, Statics.field3165);
        } else if (field413 == 10 || field413 == 11) {
            class56.method4691(Statics.field1468, Statics.field398, Statics.field3165);
        } else if (field413 == 20) {
            class56.method4691(Statics.field1468, Statics.field398, Statics.field3165);
        } else if (field413 == 25) {
            if (field464 == 1) {
                if (field460 > field461) {
                    field461 = field460;
                }
                int var4 = (field461 * 50 - field460 * 50) / field461;
                method108(class270.field3237 + class79.field1144 + class79.field1141 + var4 + "%" + class79.field1139, false);
            } else if (field464 == 2) {
                if (field462 > field550) {
                    field550 = field462;
                }
                int var5 = (field550 * 50 - field462 * 50) / field550 + 50;
                method108(class270.field3237 + class79.field1144 + class79.field1141 + var5 + "%" + class79.field1139, false);
            } else {
                method108(class270.field3237, false);
            }
        } else if (field413 == 30) {
            this.method1133();
        } else if (field413 == 40) {
            method108(class270.field3238 + class79.field1144 + class270.field3354, false);
        } else if (field413 == 45) {
            method108(class270.field3388, false);
        }
        if (field413 == 30 && field624 == 0 && !arg0 && !field613) {
            for (int var6 = 0; var6 < field591; var6++) {
                if (field618[var6]) {
                    Statics.field3194.method185(field623[var6], field626[var6], field622[var6], field619[var6]);
                    field618[var6] = false;
                }
            }
        } else if (field413 > 0) {
            Statics.field3194.method176(0, 0);
            for (int var7 = 0; var7 < field591; var7++) {
                field618[var7] = false;
            }
        }
    }

    @ObfuscatedName("client.ax(B)V")
    public final void method218() {
        if (Statics.field311.method1945()) {
            Statics.field311.method1919();
        }
        if (Statics.field14 != null) {
            Statics.field14.field966 = false;
        }
        Statics.field14 = null;
        field453.method1989();
        class11.method3939();
        if (class20.field135 != null) {
            class20 var1 = class20.field135;
            synchronized (class20.field135) {
                class20.field135 = null;
            }
        }
        Statics.field79 = null;
        if (Statics.field2070 != null) {
            Statics.field2070.method450();
        }
        if (Statics.field1560 != null) {
            Statics.field1560.method450();
        }
        if (Statics.field3614 != null) {
            Statics.field3614.method2335();
        }
        Statics.method4297();
        if (Statics.field1992 != null) {
            Statics.field1992.method2008();
            Statics.field1992 = null;
        }
        try {
            class131.field1477.method5825();
            for (int var3 = 0; var3 < Statics.field71; var3++) {
                Statics.field3840[var3].method5825();
            }
            class131.field1479.method5825();
            class131.field1471.method5825();
        } catch (Exception var6) {
        }
    }

    @ObfuscatedName("u.ez(IB)V")
    public static void method159(int arg0) {
        if (field413 == arg0) {
            return;
        }
        if (field413 == 0) {
            Statics.field874.method220();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field673 = 0;
            field439 = 0;
            field440 = 0;
            field458.method5093(arg0);
            if (arg0 != 20) {
                method1490(false);
            }
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field645 != null) {
            Statics.field645.method2335();
            Statics.field645 = null;
        }
        if (field413 == 25) {
            field464 = 0;
            field460 = 0;
            field461 = 1;
            field462 = 0;
            field550 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class56.method4151(Statics.field1301, Statics.field3536, true, 0);
        } else if (arg0 == 20) {
            class56.method4151(Statics.field1301, Statics.field3536, true, field413 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class56.method4151(Statics.field1301, Statics.field3536, false, 4);
        } else if (Statics.field798) {
            Statics.field3760 = null;
            Statics.field801 = null;
            Statics.field797 = null;
            Statics.field815 = null;
            Statics.field803 = null;
            Statics.field1229 = null;
            Statics.field1486 = null;
            Statics.field397 = null;
            Statics.field2014 = null;
            Statics.field2127 = null;
            Statics.field770 = null;
            Statics.field392 = null;
            Statics.field897 = null;
            Statics.field2847 = null;
            Statics.field16.method1818();
            class235.field2819 = 1;
            Statics.field2820 = null;
            Statics.field2822 = -1;
            Statics.field1264 = -1;
            Statics.field1612 = 0;
            Statics.field1598 = false;
            Statics.field1439 = 2;
            if (Statics.field3614 != null) {
                try {
                    class385 var1 = new class385(4);
                    var1.method5941(2);
                    var1.method6121(0);
                    Statics.field3614.method2342(var1.field4184, 0, 4);
                } catch (IOException var5) {
                    try {
                        Statics.field3614.method2335();
                    } catch (Exception var4) {
                    }
                    class278.field3605++;
                    Statics.field3614 = null;
                }
            }
            Statics.field798 = false;
        }
        field413 = arg0;
    }

    @ObfuscatedName("client.et(B)V")
    public void method1150() {
        if (field413 == 1000) {
            return;
        }
        long var1 = class382.method2013();
        int var3 = (int) (var1 - Statics.field3597);
        Statics.field3597 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class278.field3596 += var3;
        boolean var4;
        if (class278.field3606 == 0 && class278.field3607 == 0 && class278.field3604 == 0 && class278.field3599 == 0) {
            var4 = true;
        } else if (Statics.field3614 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class278.field3596 > 30000) {
                        throw new IOException();
                    }
                    while (class278.field3607 < 200 && class278.field3599 > 0) {
                        class276 var5 = (class276) class278.field3598.method5746();
                        class385 var6 = new class385(4);
                        var6.method5941(1);
                        var6.method6121((int) var5.field3966);
                        Statics.field3614.method2342(var6.field4184, 0, 4);
                        class278.field3600.method5747(var5, var5.field3966);
                        class278.field3599--;
                        class278.field3607++;
                    }
                    while (class278.field3606 < 200 && class278.field3604 > 0) {
                        class276 var7 = (class276) class278.field3602.method4698();
                        class385 var8 = new class385(4);
                        var8.method5941(0);
                        var8.method6121((int) var7.field3966);
                        Statics.field3614.method2342(var8.field4184, 0, 4);
                        var7.method5445();
                        class278.field3611.method5747(var7, var7.field3966);
                        class278.field3604--;
                        class278.field3606++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field3614.method2338();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class278.field3596 = 0;
                        byte var11 = 0;
                        if (Statics.field3595 == null) {
                            var11 = 8;
                        } else if (class278.field3609 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class278.field3608.field4182;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field3614.method2337(class278.field3608.field4184, class278.field3608.field4182, var12);
                            if (class278.field3613 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class278.field3608.field4184[class278.field3608.field4182 + var13] ^= class278.field3613;
                                }
                            }
                            class278.field3608.field4182 += var12;
                            if (class278.field3608.field4182 < var11) {
                                break;
                            }
                            if (Statics.field3595 == null) {
                                class278.field3608.field4182 = 0;
                                int var14 = class278.field3608.method5958();
                                int var15 = class278.field3608.method6053();
                                int var16 = class278.field3608.method5958();
                                int var17 = class278.field3608.method6182();
                                long var18 = (long) ((var14 << 16) + var15);
                                class276 var20 = (class276) class278.field3600.method5756(var18);
                                Statics.field878 = true;
                                if (var20 == null) {
                                    var20 = (class276) class278.field3611.method5756(var18);
                                    Statics.field878 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field3595 = var20;
                                Statics.field1248 = new class385(var17 + var21 + Statics.field3595.field3573);
                                Statics.field1248.method5941(var16);
                                Statics.field1248.method5944(var17);
                                class278.field3609 = 8;
                                class278.field3608.field4182 = 0;
                            } else if (class278.field3609 == 0) {
                                if (class278.field3608.field4184[0] == -1) {
                                    class278.field3609 = 1;
                                    class278.field3608.field4182 = 0;
                                } else {
                                    Statics.field3595 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field1248.field4184.length - Statics.field3595.field3573;
                            int var23 = 512 - class278.field3609;
                            if (var23 > var22 - Statics.field1248.field4182) {
                                var23 = var22 - Statics.field1248.field4182;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field3614.method2337(Statics.field1248.field4184, Statics.field1248.field4182, var23);
                            if (class278.field3613 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field1248.field4184[Statics.field1248.field4182 + var24] ^= class278.field3613;
                                }
                            }
                            Statics.field1248.field4182 += var23;
                            class278.field3609 += var23;
                            if (Statics.field1248.field4182 == var22) {
                                if (Statics.field3595.field3966 == 16711935L) {
                                    Statics.field3603 = Statics.field1248;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class275 var26 = class278.field3612[var25];
                                        if (var26 != null) {
                                            Statics.field3603.field4182 = var25 * 8 + 5;
                                            int var27 = Statics.field3603.method6182();
                                            int var28 = Statics.field3603.method6182();
                                            var26.method4421(var27, var28);
                                        }
                                    }
                                } else {
                                    class278.field3610.reset();
                                    class278.field3610.update(Statics.field1248.field4184, 0, var22);
                                    int var29 = (int) class278.field3610.getValue();
                                    if (Statics.field3595.field3574 != var29) {
                                        try {
                                            Statics.field3614.method2335();
                                        } catch (Exception var35) {
                                        }
                                        class278.field3601++;
                                        Statics.field3614 = null;
                                        class278.field3613 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class278.field3601 = 0;
                                    class278.field3605 = 0;
                                    Statics.field3595.field3577.method4445((int) (Statics.field3595.field3966 & 0xFFFFL), Statics.field1248.field4184, (Statics.field3595.field3966 & 0xFF0000L) == 16711680L, Statics.field878);
                                }
                                Statics.field3595.method5447();
                                if (Statics.field878) {
                                    class278.field3607--;
                                } else {
                                    class278.field3606--;
                                }
                                class278.field3609 = 0;
                                Statics.field3595 = null;
                                Statics.field1248 = null;
                            } else {
                                if (class278.field3609 != 512) {
                                    break;
                                }
                                class278.field3609 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field3614.method2335();
                } catch (Exception var34) {
                }
                class278.field3605++;
                Statics.field3614 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method1132();
        }
    }

    @ObfuscatedName("client.es(B)V")
    public void method1132() {
        if (class278.field3601 >= 4) {
            this.method221("js5crc");
            field413 = 1000;
            return;
        }
        if (class278.field3605 >= 4) {
            if (field413 <= 5) {
                this.method221("js5io");
                field413 = 1000;
                return;
            }
            field436 = 3000;
            class278.field3605 = 3;
        }
        if (--field436 + 1 > 0) {
            return;
        }
        try {
            if (field438 == 0) {
                Statics.field2879 = Statics.field101.method2289(Statics.field2918, Statics.field3679);
                field438++;
            }
            if (field438 == 1) {
                if (Statics.field2879.field1511 == 2) {
                    this.method841(-1);
                    return;
                }
                if (Statics.field2879.field1511 == 1) {
                    field438++;
                }
            }
            if (field438 == 2) {
                if (field457) {
                    Socket var1 = (Socket) Statics.field2879.field1510;
                    class331 var2 = new class331(var1, 40000, 5000);
                    Statics.field1197 = var2;
                } else {
                    Statics.field1197 = new class134((Socket) Statics.field2879.field1510, Statics.field101, 5000);
                }
                class385 var3 = new class385(5);
                var3.method5941(15);
                var3.method5944(198);
                Statics.field1197.method2342(var3.field4184, 0, 5);
                field438++;
                Statics.field1610 = class382.method2013();
            }
            if (field438 == 3) {
                if (Statics.field1197.method2338() > 0 || !field457 && field413 <= 5) {
                    int var4 = Statics.field1197.method2367();
                    if (var4 != 0) {
                        this.method841(var4);
                        return;
                    }
                    field438++;
                } else if (class382.method2013() - Statics.field1610 > 30000L) {
                    this.method841(-2);
                    return;
                }
            }
            if (field438 == 4) {
                class278.method2272(Statics.field1197, field413 > 20);
                Statics.field2879 = null;
                Statics.field1197 = null;
                field438 = 0;
                field504 = 0;
            }
        } catch (IOException var6) {
            this.method841(-3);
        }
    }

    @ObfuscatedName("client.em(II)V")
    public void method841(int arg0) {
        Statics.field2879 = null;
        Statics.field1197 = null;
        field438 = 0;
        if (Statics.field3679 == Statics.field1982) {
            Statics.field3679 = Statics.field7;
        } else {
            Statics.field3679 = Statics.field1982;
        }
        field504++;
        if (field504 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field413 <= 5) {
                this.method221("js5connect_full");
                field413 = 1000;
            } else {
                field436 = 3000;
            }
        } else if (field504 >= 2 && arg0 == 6) {
            this.method221("js5connect_outofdate");
            field413 = 1000;
        } else if (field504 >= 4) {
            if (field413 <= 5) {
                this.method221("js5connect");
                field413 = 1000;
            } else {
                field436 = 3000;
            }
        }
    }

    @ObfuscatedName("co.fh(Ljs;Ljava/lang/String;I)V")
    public static void method2031(class275 arg0, String arg1) {
        class64 var2 = new class64(arg0, arg1);
        field681.add(var2);
        field683 += var2.field925;
    }

    @ObfuscatedName("u.fw(I)Z")
    public static boolean method169() {
        if (field681 == null || field682 >= field681.size()) {
            return true;
        }
        while (field682 < field681.size()) {
            class64 var0 = (class64) field681.get(field682);
            if (!var0.method1685()) {
                return false;
            }
            field682++;
        }
        return true;
    }

    @ObfuscatedName("bq.fz(I)I")
    public static int method1714() {
        if (field681 == null || field682 >= field681.size()) {
            return 10000;
        }
        int var0 = 0;
        for (int var1 = 0; var1 <= field682; var1++) {
            var0 += ((class64) field681.get(var1)).field927;
        }
        return var0 * 10000 / field683;
    }

    @ObfuscatedName("gr.fy(I)V")
    public static void method3298() {
        if (field411 == 0) {
            Statics.field1925 = new class200(4, 104, 104, class62.field911);
            for (int var0 = 0; var0 < 4; var0++) {
                field465[var0] = new class160(104, 104);
            }
            Statics.field4167 = new class398(512, 512);
            class56.field807 = class270.field3240;
            class56.field806 = 5;
            field411 = 20;
        } else if (field411 == 20) {
            class56.field807 = class270.field3241;
            class56.field806 = 10;
            field411 = 30;
        } else if (field411 == 30) {
            Statics.field1417 = method2059(0, false, true, true);
            Statics.field3693 = method2059(1, false, true, true);
            Statics.field2149 = method2059(2, true, false, true);
            Statics.field307 = method2059(3, false, true, true);
            Statics.field1521 = method2059(4, false, true, true);
            Statics.field2277 = method2059(5, true, true, true);
            Statics.field1326 = method2059(6, true, true, true);
            Statics.field1107 = method2059(7, false, true, true);
            Statics.field3536 = method2059(8, false, true, true);
            Statics.field1454 = method2059(9, false, true, true);
            Statics.field1301 = method2059(10, false, true, true);
            Statics.field3938 = method2059(11, false, true, true);
            Statics.field391 = method2059(12, false, true, true);
            Statics.field1440 = method2059(13, true, false, true);
            Statics.field2139 = method2059(14, false, true, true);
            Statics.field917 = method2059(15, false, true, true);
            Statics.field96 = method2059(17, true, true, true);
            Statics.field85 = method2059(18, false, true, true);
            Statics.field302 = method2059(19, false, true, true);
            Statics.field3848 = method2059(20, false, true, true);
            class56.field807 = class270.field3437;
            class56.field806 = 20;
            field411 = 40;
        } else if (field411 == 40) {
            byte var1 = 0;
            int var2 = var1 + Statics.field1417.method4454() * 4 / 100;
            int var3 = var2 + Statics.field3693.method4454() * 4 / 100;
            int var4 = var3 + Statics.field2149.method4454() * 2 / 100;
            int var5 = var4 + Statics.field307.method4454() * 2 / 100;
            int var6 = var5 + Statics.field1521.method4454() * 6 / 100;
            int var7 = var6 + Statics.field2277.method4454() * 4 / 100;
            int var8 = var7 + Statics.field1326.method4454() * 2 / 100;
            int var9 = var8 + Statics.field1107.method4454() * 56 / 100;
            int var10 = var9 + Statics.field3536.method4454() * 2 / 100;
            int var11 = var10 + Statics.field1454.method4454() * 2 / 100;
            int var12 = var11 + Statics.field1301.method4454() * 2 / 100;
            int var13 = var12 + Statics.field3938.method4454() * 2 / 100;
            int var14 = var13 + Statics.field391.method4454() * 2 / 100;
            int var15 = var14 + Statics.field1440.method4454() * 2 / 100;
            int var16 = var15 + Statics.field2139.method4454() * 2 / 100;
            int var17 = var16 + Statics.field917.method4454() * 2 / 100;
            int var18 = var17 + Statics.field302.method4454() / 100;
            int var19 = var18 + Statics.field85.method4454() / 100;
            int var20 = var19 + Statics.field3848.method4454() / 100;
            int var21 = var20 + (Statics.field96.method4417() && Statics.field96.method4464() ? 1 : 0);
            if (var21 == 100) {
                method2031(Statics.field1417, "Animations");
                method2031(Statics.field3693, "Skeletons");
                method2031(Statics.field1521, "Sound FX");
                method2031(Statics.field2277, "Maps");
                method2031(Statics.field1326, "Music Tracks");
                method2031(Statics.field1107, "Models");
                method2031(Statics.field3536, "Sprites");
                method2031(Statics.field3938, "Music Jingles");
                method2031(Statics.field2139, "Music Samples");
                method2031(Statics.field917, "Music Patches");
                method2031(Statics.field302, "World Map");
                method2031(Statics.field85, "World Map Geography");
                method2031(Statics.field3848, "World Map Ground");
                Statics.field2122 = new class336();
                Statics.field2122.method5369(Statics.field96);
                class56.field807 = class270.field3433;
                class56.field806 = 30;
                field411 = 45;
            } else {
                if (var21 != 0) {
                    class56.field807 = class270.field3510 + var21 + "%";
                }
                class56.field806 = 30;
            }
        } else if (field411 == 45) {
            Statics.method1688(22050, !field409, 2);
            class236 var22 = new class236();
            var22.method4012(9, 128);
            Statics.field2070 = class25.method2339(Statics.field101, 0, 22050);
            Statics.field2070.method456(var22);
            class275 var23 = Statics.field917;
            class275 var24 = Statics.field2139;
            class275 var25 = Statics.field1521;
            Statics.field2818 = var23;
            Statics.field2815 = var24;
            Statics.field2817 = var25;
            Statics.field2816 = var22;
            Statics.field1560 = class25.method2339(Statics.field101, 1, 2048);
            Statics.field1163 = new class21();
            Statics.field1560.method456(Statics.field1163);
            Statics.field1842 = new class38(22050, Statics.field3634);
            class56.field807 = class270.field3245;
            class56.field806 = 35;
            field411 = 50;
            Statics.field2602 = new class360(Statics.field3536, Statics.field1440);
        } else if (field411 == 50) {
            class361[] var26 = new class361[] { class361.field4086, class361.field4093, class361.field4087, class361.field4085, class361.field4096, class361.field4088 };
            int var27 = var26.length;
            class360 var28 = Statics.field2602;
            class361[] var29 = new class361[] { class361.field4086, class361.field4093, class361.field4087, class361.field4085, class361.field4096, class361.field4088 };
            field495 = var28.method5704(var29);
            if (field495.size() < var27) {
                class56.field807 = class270.field3288 + field495.size() * 100 / var27 + "%";
                class56.field806 = 40;
            } else {
                Statics.field398 = (class302) field495.get(class361.field4085);
                Statics.field3165 = (class302) field495.get(class361.field4093);
                Statics.field1468 = (class302) field495.get(class361.field4086);
                Statics.field2789 = field559.method5456();
                class56.field807 = class270.field3247;
                class56.field806 = 40;
                field411 = 60;
            }
        } else if (field411 == 60) {
            class275 var30 = Statics.field1301;
            class275 var31 = Statics.field3536;
            int var32 = 0;
            if (var30.method4510("title.jpg", "")) {
                var32++;
            }
            if (var31.method4510("logo", "")) {
                var32++;
            }
            if (var31.method4510("logo_deadman_mode", "")) {
                var32++;
            }
            if (var31.method4510("logo_seasonal_mode", "")) {
                var32++;
            }
            if (var31.method4510("titlebox", "")) {
                var32++;
            }
            if (var31.method4510("titlebutton", "")) {
                var32++;
            }
            if (var31.method4510("runes", "")) {
                var32++;
            }
            if (var31.method4510("title_mute", "")) {
                var32++;
            }
            if (var31.method4510("options_radio_buttons,0", "")) {
                var32++;
            }
            if (var31.method4510("options_radio_buttons,2", "")) {
                var32++;
            }
            if (var31.method4510("options_radio_buttons,4", "")) {
                var32++;
            }
            if (var31.method4510("options_radio_buttons,6", "")) {
                var32++;
            }
            var31.method4510("sl_back", "");
            var31.method4510("sl_flags", "");
            var31.method4510("sl_arrows", "");
            var31.method4510("sl_stars", "");
            var31.method4510("sl_button", "");
            byte var35 = 12;
            if (var32 < var35) {
                class56.field807 = class270.field3248 + var32 * 100 / var35 + "%";
                class56.field806 = 50;
            } else {
                class56.field807 = class270.field3249;
                class56.field806 = 50;
                method159(5);
                field411 = 70;
            }
        } else if (field411 == 70) {
            if (Statics.field2149.method4464()) {
                class275 var37 = Statics.field2149;
                Statics.field1855 = var37;
                class151.method1612(Statics.field2149);
                class275 var38 = Statics.field2149;
                class275 var39 = Statics.field1107;
                Statics.field1565 = var38;
                Statics.field1120 = var39;
                Statics.field1564 = Statics.field1565.method4484(3);
                class156.method2143(Statics.field2149, Statics.field1107, field409);
                class275 var40 = Statics.field2149;
                class275 var41 = Statics.field1107;
                Statics.field1637 = var40;
                Statics.field1617 = var41;
                class275 var42 = Statics.field2149;
                Statics.field1703 = var42;
                class157.method3299(Statics.field2149, Statics.field1107, field562, Statics.field398);
                class275 var43 = Statics.field2149;
                class275 var44 = Statics.field1417;
                class275 var45 = Statics.field3693;
                Statics.field1875 = var43;
                Statics.field1859 = var44;
                Statics.field1871 = var45;
                class150.method2029(Statics.field2149, Statics.field1107);
                class152.method1363(Statics.field2149);
                class140.method1314(Statics.field2149);
                class249.method2377(Statics.field307, Statics.field1107, Statics.field3536, Statics.field1440);
                class139.method1864(Statics.field2149);
                class275 var46 = Statics.field2149;
                Statics.field1601 = var46;
                class275 var47 = Statics.field2149;
                Statics.field1561 = var47;
                class153.method5309(Statics.field2149);
                Statics.field1272 = new class372(Statics.field976, 54, Statics.field3644, Statics.field2149);
                Statics.field3664 = new class372(Statics.field976, 47, Statics.field3644, Statics.field2149);
                Statics.field311 = new class84();
                class155.method4689(Statics.field2149, Statics.field3536, Statics.field1440);
                class144.method4680(Statics.field2149, Statics.field3536);
                class141.method5839(Statics.field2149, Statics.field3536);
                class56.field807 = class270.field3251;
                class56.field806 = 60;
                field411 = 80;
            } else {
                class56.field807 = class270.field3420 + Statics.field2149.method4428() + "%";
                class56.field806 = 60;
            }
        } else if (field411 == 80) {
            int var48 = 0;
            if (Statics.field736 == null) {
                Statics.field736 = class399.method3879(Statics.field3536, Statics.field2122.field3917, 0);
            } else {
                var48++;
            }
            if (Statics.field1594 == null) {
                Statics.field1594 = class399.method3879(Statics.field3536, Statics.field2122.field3916, 0);
            } else {
                var48++;
            }
            if (Statics.field3575 == null) {
                Statics.field3575 = Statics.method2333(Statics.field3536, Statics.field2122.field3910, 0);
            } else {
                var48++;
            }
            if (Statics.field1230 == null) {
                Statics.field1230 = class399.method1785(Statics.field3536, Statics.field2122.field3908, 0);
            } else {
                var48++;
            }
            if (Statics.field3211 == null) {
                Statics.field3211 = class399.method1785(Statics.field3536, Statics.field2122.field3911, 0);
            } else {
                var48++;
            }
            if (Statics.field1677 == null) {
                Statics.field1677 = class399.method1785(Statics.field3536, Statics.field2122.field3913, 0);
            } else {
                var48++;
            }
            if (Statics.field1679 == null) {
                Statics.field1679 = class399.method1785(Statics.field3536, Statics.field2122.field3909, 0);
            } else {
                var48++;
            }
            if (Statics.field1190 == null) {
                Statics.field1190 = class399.method1785(Statics.field3536, Statics.field2122.field3915, 0);
            } else {
                var48++;
            }
            if (Statics.field1452 == null) {
                Statics.field1452 = class399.method1785(Statics.field3536, Statics.field2122.field3914, 0);
            } else {
                var48++;
            }
            if (Statics.field386 == null) {
                Statics.field386 = Statics.method2333(Statics.field3536, Statics.field2122.field3912, 0);
            } else {
                var48++;
            }
            if (Statics.field3107 == null) {
                Statics.field3107 = Statics.method2333(Statics.field3536, Statics.field2122.field3918, 0);
            } else {
                var48++;
            }
            if (var48 < 11) {
                class56.field807 = class270.field3259 + var48 * 100 / 12 + "%";
                class56.field806 = 70;
            } else {
                Statics.field3741 = Statics.field3107;
                Statics.field1594.method6370();
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 21.0D) - 10;
                int var52 = (int) (Math.random() * 41.0D) - 20;
                Statics.field3575[0].method6350(var49 + var52, var50 + var52, var51 + var52);
                class56.field807 = class270.field3253;
                class56.field806 = 70;
                field411 = 90;
            }
        } else if (field411 == 90) {
            if (Statics.field1454.method4464()) {
                Statics.field2077 = new class205(Statics.field1454, Statics.field3536, 20, Statics.field308.field1118, field409 ? 64 : 128);
                class198.method3460(Statics.field2077);
                class198.method3461(Statics.field308.field1118);
                field411 = 100;
            } else {
                class56.field807 = class270.field3254 + "0%";
                class56.field806 = 90;
            }
        } else if (field411 == 100) {
            int var53 = Statics.field2077.method3739();
            if (var53 < 100) {
                class56.field807 = class270.field3254 + var53 + "%";
                class56.field806 = 90;
            } else {
                class56.field807 = class270.field3455;
                class56.field806 = 90;
                field411 = 110;
            }
        } else if (field411 == 110) {
            Statics.field14 = new class69();
            Statics.field101.method2288(Statics.field14, 10);
            class56.field807 = class270.field3256;
            class56.field806 = 92;
            field411 = 120;
        } else if (field411 == 120) {
            if (Statics.field1301.method4510("huffman", "")) {
                class251 var54 = new class251(Statics.field1301.method4478("huffman", ""));
                Statics.method2112(var54);
                class56.field807 = class270.field3258;
                class56.field806 = 94;
                field411 = 130;
            } else {
                class56.field807 = class270.field3257 + "%";
                class56.field806 = 94;
            }
        } else if (field411 == 130) {
            if (!Statics.field307.method4464()) {
                class56.field807 = class270.field3484 + Statics.field307.method4428() * 4 / 5 + "%";
                class56.field806 = 96;
            } else if (!Statics.field391.method4464()) {
                class56.field807 = class270.field3484 + (80 + Statics.field391.method4428() / 6) + "%";
                class56.field806 = 96;
            } else if (Statics.field1440.method4464()) {
                class56.field807 = class270.field3517;
                class56.field806 = 98;
                field411 = 140;
            } else {
                class56.field807 = class270.field3484 + (96 + Statics.field1440.method4428() / 50) + "%";
                class56.field806 = 96;
            }
        } else if (field411 == 140) {
            class56.field806 = 100;
            if (Statics.field302.method4480(class187.field2118.field2114)) {
                if (Statics.field202 == null) {
                    Statics.field202 = new class359();
                    Statics.field202.method5554(Statics.field302, Statics.field85, Statics.field3848, Statics.field1468, field495, Statics.field3575);
                }
                class56.field807 = class270.field3262;
                field411 = 150;
            } else {
                class56.field807 = class270.field3361 + Statics.field302.method4482(class187.field2118.field2114) / 10 + "%";
            }
        } else if (field411 == 150) {
            method159(10);
        }
    }

    @ObfuscatedName("ch.fg(IZZZI)Ljs;")
    public static class275 method2059(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class334 var4 = null;
        if (class131.field1477 != null) {
            var4 = new class334(arg0, class131.field1477, Statics.field3840[arg0], 1000000);
        }
        return new class275(var4, Statics.field3766, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("client.fc(I)V")
    public final void method1113() {
        class330 var1 = field453.method1992();
        class384 var2 = field453.field1201;
        try {
            if (field673 == 0) {
                if (Statics.field1267 == null && (field444.method1621() || field439 > 250)) {
                    Statics.field1267 = field444.method1615();
                    field444.method1613();
                    field444 = null;
                }
                if (Statics.field1267 != null) {
                    if (var1 != null) {
                        var1.method2335();
                        var1 = null;
                    }
                    Statics.field3214 = null;
                    field456 = false;
                    field439 = 0;
                    field673 = 1;
                }
            }
            if (field673 == 1) {
                if (Statics.field3214 == null) {
                    Statics.field3214 = Statics.field101.method2289(Statics.field2918, Statics.field3679);
                }
                if (Statics.field3214.field1511 == 2) {
                    throw new IOException();
                }
                if (Statics.field3214.field1511 == 1) {
                    if (field457) {
                        Socket var3 = (Socket) Statics.field3214.field1510;
                        class331 var4 = new class331(var3, 40000, 5000);
                        var1 = var4;
                    } else {
                        var1 = new class134((Socket) Statics.field3214.field1510, Statics.field101, 5000);
                    }
                    field453.method1988(var1);
                    Statics.field3214 = null;
                    field673 = 2;
                }
            }
            if (field673 == 2) {
                field453.method1999();
                class229 var5 = class229.method1686();
                var5.field2691.method5941(class231.field2792.field2796);
                field453.method1987(var5);
                field453.method1986();
                var2.field4182 = 0;
                field673 = 3;
            }
            if (field673 == 3) {
                if (Statics.field2070 != null) {
                    Statics.field2070.method462();
                }
                if (Statics.field1560 != null) {
                    Statics.field1560.method462();
                }
                boolean var6 = true;
                if (field457 && !var1.method2336(1)) {
                    var6 = false;
                }
                if (var6) {
                    int var7 = var1.method2367();
                    if (Statics.field2070 != null) {
                        Statics.field2070.method462();
                    }
                    if (Statics.field1560 != null) {
                        Statics.field1560.method462();
                    }
                    if (var7 != 0) {
                        method4387(var7);
                        return;
                    }
                    var2.field4182 = 0;
                    field673 = 4;
                }
            }
            if (field673 == 4) {
                if (var2.field4182 < 8) {
                    int var8 = var1.method2338();
                    if (var8 > 8 - var2.field4182) {
                        var8 = 8 - var2.field4182;
                    }
                    if (var8 > 0) {
                        var1.method2337(var2.field4184, var2.field4182, var8);
                        var2.field4182 += var8;
                    }
                }
                if (var2.field4182 == 8) {
                    var2.field4182 = 0;
                    Statics.field2120 = var2.method5964();
                    field673 = 5;
                }
            }
            if (field673 == 5) {
                field453.field1201.field4182 = 0;
                field453.method1999();
                class384 var9 = new class384(500);
                int[] var10 = new int[] { Statics.field1267.nextInt(), Statics.field1267.nextInt(), Statics.field1267.nextInt(), Statics.field1267.nextInt() };
                var9.field4182 = 0;
                var9.method5941(1);
                var9.method5944(var10[0]);
                var9.method5944(var10[1]);
                var9.method5944(var10[2]);
                var9.method5944(var10[3]);
                var9.method5946(Statics.field2120);
                if (field413 == 40) {
                    var9.method5944(Statics.field357[0]);
                    var9.method5944(Statics.field357[1]);
                    var9.method5944(Statics.field357[2]);
                    var9.method5944(Statics.field357[3]);
                } else {
                    var9.method5941(field448.method35());
                    switch(field448.field1270) {
                        case 0:
                        case 1:
                            var9.method6121(Statics.field3640);
                            var9.field4182++;
                            break;
                        case 2:
                            var9.field4182 += 4;
                            break;
                        case 3:
                            var9.method5944((Integer) Statics.field308.field1115.get(class306.method2944(class56.field809)));
                    }
                    var9.method5941(class389.field4231.method35());
                    var9.method5948(class56.field818);
                }
                var9.method5981(class55.field793, class55.field792);
                Statics.field357 = var10;
                class229 var11 = class229.method2886();
                var11.field2685 = null;
                var11.field2686 = 0;
                var11.field2691 = new class384(5000);
                var11.field2691.field4182 = 0;
                if (field413 == 40) {
                    var11.field2691.method5941(class231.field2793.field2796);
                } else {
                    var11.field2691.method5941(class231.field2790.field2796);
                }
                var11.field2691.method6132(0);
                int var14 = var11.field2691.field4182;
                var11.field2691.method5944(198);
                var11.field2691.method5944(1);
                var11.field2691.method5941(field410);
                var11.field2691.method5941(field474);
                var11.field2691.method6013(var9.field4184, 0, var9.field4182);
                int var15 = var11.field2691.field4182;
                var11.field2691.method5948(class56.field809);
                var11.field2691.method5941((field613 ? 1 : 0) << 1 | (field409 ? 1 : 0));
                var11.field2691.method6132(Statics.field971);
                var11.field2691.method6132(Statics.field687);
                method2494(var11.field2691);
                var11.field2691.method5948(Statics.field1661);
                var11.field2691.method5944(Statics.field4314);
                class385 var16 = new class385(Statics.field2789.method5471());
                Statics.field2789.method5470(var16);
                var11.field2691.method6013(var16.field4184, 0, var16.field4184.length);
                var11.field2691.method5941(field410);
                var11.field2691.method5944(0);
                var11.field2691.method6004(Statics.field3938.field3591);
                var11.field2691.method6002(Statics.field96.field3591);
                var11.field2691.method5944(Statics.field307.field3591);
                var11.field2691.method5982(Statics.field917.field3591);
                var11.field2691.method6004(Statics.field1440.field3591);
                var11.field2691.method6004(Statics.field1454.field3591);
                var11.field2691.method6004(Statics.field1521.field3591);
                var11.field2691.method6004(Statics.field2277.field3591);
                var11.field2691.method5982(Statics.field1301.field3591);
                var11.field2691.method5982(Statics.field1107.field3591);
                var11.field2691.method5982(Statics.field3693.field3591);
                var11.field2691.method6002(Statics.field3536.field3591);
                var11.field2691.method6002(Statics.field302.field3591);
                var11.field2691.method5944(Statics.field391.field3591);
                var11.field2691.method6002(0);
                var11.field2691.method6002(Statics.field3848.field3591);
                var11.field2691.method6002(Statics.field2139.field3591);
                var11.field2691.method6002(Statics.field1326.field3591);
                var11.field2691.method5982(Statics.field85.field3591);
                var11.field2691.method5982(Statics.field2149.field3591);
                var11.field2691.method5944(Statics.field1417.field3591);
                var11.field2691.method5943(var10, var15, var11.field2691.field4182);
                var11.field2691.method6044(var11.field2691.field4182 - var14);
                field453.method1987(var11);
                field453.method1986();
                field453.field1205 = new class401(var10);
                int[] var17 = new int[4];
                for (int var18 = 0; var18 < 4; var18++) {
                    var17[var18] = var10[var18] + 50;
                }
                var2.method5895(var17);
                field673 = 6;
            }
            if (field673 == 6 && var1.method2338() > 0) {
                int var19 = var1.method2367();
                if (var19 == 21 && field413 == 20) {
                    field673 = 12;
                } else if (var19 == 2) {
                    field673 = 14;
                } else if (var19 == 15 && field413 == 40) {
                    field453.field1209 = -1;
                    field673 = 19;
                } else if (var19 == 64) {
                    field673 = 10;
                } else if (var19 == 23 && field440 < 1) {
                    field440++;
                    field673 = 0;
                } else if (var19 == 29) {
                    field673 = 17;
                } else if (var19 == 69) {
                    field673 = 7;
                } else {
                    method4387(var19);
                    return;
                }
            }
            if (field673 == 7 && var1.method2338() >= 2) {
                var1.method2337(var2.field4184, 0, 2);
                var2.field4182 = 0;
                Statics.field1426 = var2.method6053();
                field673 = 8;
            }
            if (field673 == 8 && var1.method2338() >= Statics.field1426) {
                var2.field4182 = 0;
                var1.method2337(var2.field4184, var2.field4182, Statics.field1426);
                class7[] var20 = new class7[] { class7.field17 };
                class7 var21 = var20[var2.method5958()];
                try {
                    switch(var21.field11) {
                        case 0:
                            class1 var22 = new class1();
                            this.field446 = new class8(var2, var22);
                            field673 = 9;
                            break;
                        default:
                            throw new IllegalArgumentException();
                    }
                } catch (Exception var50) {
                    method4387(22);
                    return;
                }
            }
            if (field673 == 9 && this.field446.method42()) {
                this.field596 = this.field446.method53();
                this.field446.method45();
                this.field446 = null;
                if (this.field596 == null) {
                    method4387(22);
                    return;
                }
                field453.method1999();
                class229 var25 = class229.method2886();
                var25.field2685 = null;
                var25.field2686 = 0;
                var25.field2691 = new class384(5000);
                var25.field2691.method5941(class231.field2794.field2796);
                var25.field2691.method6132(this.field596.field4182);
                var25.field2691.method5952(this.field596);
                field453.method1987(var25);
                field453.method1986();
                this.field596 = null;
                field673 = 6;
            }
            if (field673 == 10 && var1.method2338() > 0) {
                Statics.field2549 = var1.method2367();
                field673 = 11;
            }
            if (field673 == 11 && var1.method2338() >= Statics.field2549) {
                var1.method2337(var2.field4184, 0, Statics.field2549);
                var2.field4182 = 0;
                field673 = 6;
            }
            if (field673 == 12 && var1.method2338() > 0) {
                field590 = (var1.method2367() + 3) * 60;
                field673 = 13;
            }
            if (field673 == 13) {
                field439 = 0;
                class56.method1294(class270.field3268, class270.field3348, field590 / 60 + class270.field3371);
                if (--field590 <= 0) {
                    field673 = 0;
                }
            } else {
                if (field673 == 14 && var1.method2338() >= 1) {
                    Statics.field3714 = var1.method2367();
                    field673 = 15;
                }
                if (field673 == 15 && var1.method2338() >= Statics.field3714) {
                    boolean var28 = var1.method2367() == 1;
                    var1.method2337(var2.field4184, 0, 4);
                    var2.field4182 = 0;
                    boolean var29 = false;
                    if (var28) {
                        int var30 = var2.method5898() << 24;
                        int var31 = var30 | var2.method5898() << 16;
                        int var32 = var31 | var2.method5898() << 8;
                        int var33 = var32 | var2.method5898();
                        String var34 = class56.field809;
                        int var35 = var34.length();
                        int var36 = 0;
                        int var37 = 0;
                        while (true) {
                            if (var37 >= var35) {
                                if (Statics.field308.field1115.size() >= 10 && !Statics.field308.field1115.containsKey(var36)) {
                                    Iterator var40 = Statics.field308.field1115.entrySet().iterator();
                                    var40.next();
                                    var40.remove();
                                }
                                Statics.field308.field1115.put(var36, var33);
                                break;
                            }
                            var36 = (var36 << 5) - var36 + var34.charAt(var37);
                            var37++;
                        }
                    }
                    if (field443) {
                        Statics.field308.field1123 = class56.field809;
                    } else {
                        Statics.field308.field1123 = null;
                    }
                    class76.method2370();
                    field577 = var1.method2367();
                    field603 = var1.method2367() == 1;
                    field665 = var1.method2367();
                    field665 <<= 0x8;
                    field665 += var1.method2367();
                    field526 = var1.method2367();
                    var1.method2337(var2.field4184, 0, 1);
                    var2.field4182 = 0;
                    class230[] var41 = class230.method3309();
                    int var42 = var2.method5900();
                    if (var42 < 0 || var42 >= var41.length) {
                        throw new IOException(var42 + " " + var2.field4182);
                    }
                    field453.field1206 = var41[var42];
                    field453.field1209 = field453.field1206.field2740;
                    var1.method2337(var2.field4184, 0, 2);
                    var2.field4182 = 0;
                    field453.field1209 = var2.method6053();
                    try {
                        class15.method144(Statics.field874, "zap");
                    } catch (Throwable var49) {
                    }
                    field673 = 16;
                }
                if (field673 != 16) {
                    if (field673 == 17 && var1.method2338() >= 2) {
                        var2.field4182 = 0;
                        var1.method2337(var2.field4184, 0, 2);
                        var2.field4182 = 0;
                        Statics.field3870 = var2.method6053();
                        field673 = 18;
                    }
                    if (field673 == 18 && var1.method2338() >= Statics.field3870) {
                        var2.field4182 = 0;
                        var1.method2337(var2.field4184, 0, Statics.field3870);
                        var2.field4182 = 0;
                        String var44 = var2.method5967();
                        String var45 = var2.method5967();
                        String var46 = var2.method5967();
                        class56.method1294(var44, var45, var46);
                        method159(10);
                    }
                    if (field673 == 19) {
                        if (field453.field1209 == -1) {
                            if (var1.method2338() < 2) {
                                return;
                            }
                            var1.method2337(var2.field4184, 0, 2);
                            var2.field4182 = 0;
                            field453.field1209 = var2.method6053();
                        }
                        if (var1.method2338() >= field453.field1209) {
                            var1.method2337(var2.field4184, 0, field453.field1209);
                            var2.field4182 = 0;
                            int var47 = field453.field1209;
                            field458.method5097();
                            method4655();
                            class83.method785(var2);
                            if (var2.field4182 != var47) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field439++;
                        if (field439 > 2000) {
                            if (field440 < 1) {
                                if (Statics.field3679 == Statics.field1982) {
                                    Statics.field3679 = Statics.field7;
                                } else {
                                    Statics.field3679 = Statics.field1982;
                                }
                                field440++;
                                field673 = 0;
                            } else {
                                method4387(-3);
                            }
                        }
                    }
                } else if (var1.method2338() >= field453.field1209) {
                    var2.field4182 = 0;
                    var1.method2337(var2.field4184, 0, field453.field1209);
                    field458.method5108();
                    method2223();
                    class83.method785(var2);
                    Statics.field137 = -1;
                    method4164(false, var2);
                    field453.field1206 = null;
                }
            }
        } catch (IOException var51) {
            if (field440 < 1) {
                if (Statics.field3679 == Statics.field1982) {
                    Statics.field3679 = Statics.field7;
                } else {
                    Statics.field3679 = Statics.field1982;
                }
                field440++;
                field673 = 0;
            } else {
                method4387(-2);
            }
        }
    }

    @ObfuscatedName("dh.fi(B)V")
    public static void method2223() {
        field417 = 1L;
        Statics.field14.field967 = 0;
        Statics.field3128 = true;
        field421 = true;
        field636 = -1L;
        class42.method5334();
        field453.method1999();
        field453.field1201.field4182 = 0;
        field453.field1206 = null;
        field453.field1212 = null;
        field453.field1214 = null;
        field453.field1213 = null;
        field453.field1209 = 0;
        field453.field1210 = 0;
        field423 = 0;
        field571 = 0;
        field424 = 0;
        method2217();
        class20.field146 = 0;
        class85.method4621();
        field561 = 0;
        field563 = false;
        field498 = 0;
        field445 = 0;
        field482 = 0;
        Statics.field4128 = null;
        field646 = 0;
        field639 = -1;
        field644 = 0;
        field597 = 0;
        field459 = class81.field1160;
        field433 = class81.field1160;
        field685 = 0;
        class83.field1172 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class83.field1168[var0] = null;
            class83.field1171[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field524[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field567[var2] = null;
        }
        field535 = -1;
        field538.method4705();
        field539.method4705();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field536[var3][var4][var5] = null;
                }
            }
        }
        field537 = new class296();
        Statics.field80.method1345();
        for (int var6 = 0; var6 < Statics.field3631; var6++) {
            class140 var7 = class140.method1405(var6);
            if (var7 != null) {
                class244.field2912[var6] = 0;
                class244.field2911[var6] = 0;
            }
        }
        Statics.field311.method1911();
        field510 = -1;
        if (field568 != -1) {
            class249.method16(field568);
        }
        for (class67 var8 = (class67) field569.method5746(); var8 != null; var8 = (class67) field569.method5749()) {
            Statics.method2891(var8, true);
        }
        field568 = -1;
        field569 = new class364(8);
        field574 = null;
        field545 = 0;
        field544 = false;
        field598.method4236((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var9 = 0; var9 < 8; var9++) {
            field532[var9] = null;
            field533[var9] = false;
        }
        class65.field935 = new class364(32);
        field415 = true;
        for (int var10 = 0; var10 < 100; var10++) {
            field617[var10] = true;
        }
        class229 var11 = class229.method2538(class227.field2572, field453.field1205);
        var11.field2691.method5941(method4156());
        var11.field2691.method6132(Statics.field971);
        var11.field2691.method6132(Statics.field687);
        field453.method1987(var11);
        Statics.field972 = null;
        Statics.field355 = null;
        Arrays.fill(field637, (Object) null);
        Statics.field3845 = null;
        Arrays.fill(field638, (Object) null);
        for (int var12 = 0; var12 < 8; var12++) {
            field620[var12] = new class286();
        }
        Statics.field3711 = null;
    }

    @ObfuscatedName("kr.fq(B)V")
    public static void method4655() {
        field453.method1999();
        field453.field1201.field4182 = 0;
        field453.field1206 = null;
        field453.field1212 = null;
        field453.field1214 = null;
        field453.field1213 = null;
        field453.field1209 = 0;
        field453.field1210 = 0;
        field423 = 0;
        field545 = 0;
        field544 = false;
        field646 = 0;
        field644 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field524[var0] = null;
        }
        Statics.field140 = null;
        for (int var1 = 0; var1 < field567.length; var1++) {
            class78 var2 = field567[var1];
            if (var2 != null) {
                var2.field1047 = -1;
                var2.field1032 = false;
            }
        }
        class65.field935 = new class364(32);
        method159(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field617[var3] = true;
        }
        class229 var4 = class229.method2538(class227.field2572, field453.field1205);
        var4.field2691.method5941(method4156());
        var4.field2691.method6132(Statics.field971);
        var4.field2691.method6132(Statics.field687);
        field453.method1987(var4);
    }

    @ObfuscatedName("jr.fv(IS)V")
    public static void method4387(int arg0) {
        if (arg0 == -3) {
            class56.method1294(class270.field3434, class270.field3471, class270.field3273);
        } else if (arg0 == -2) {
            class56.method1294(class270.field3226, class270.field3275, class270.field3276);
        } else if (arg0 == -1) {
            class56.method1294(class270.field3277, class270.field3278, class270.field3365);
        } else if (arg0 == 3) {
            class56.field812 = 3;
            class56.field810 = 1;
        } else if (arg0 == 4) {
            class56.field812 = 12;
            class56.field805 = 0;
        } else if (arg0 == 5) {
            class56.field810 = 2;
            class56.method1294(class270.field3283, class270.field3284, class270.field3285);
        } else if (arg0 == 68 || !(field412 || arg0 != 6)) {
            class56.method1294(class270.field3298, class270.field3287, class270.field3343);
        } else if (arg0 == 7) {
            class56.method1294(class270.field3250, class270.field3290, class270.field3407);
        } else if (arg0 == 8) {
            class56.method1294(class270.field3295, class270.field3293, class270.field3294);
        } else if (arg0 == 9) {
            class56.method1294(class270.field3384, class270.field3261, class270.field3263);
        } else if (arg0 == 10) {
            class56.method1294(class270.field3450, class270.field3422, class270.field3300);
        } else if (arg0 == 11) {
            class56.method1294(class270.field3412, class270.field3302, class270.field3303);
        } else if (arg0 == 12) {
            class56.method1294(class270.field3324, class270.field3305, class270.field3306);
        } else if (arg0 == 13) {
            class56.method1294(class270.field3307, class270.field3346, class270.field3309);
        } else if (arg0 == 14) {
            class56.method1294(class270.field3310, class270.field3311, class270.field3312);
        } else if (arg0 == 16) {
            class56.method1294(class270.field3423, class270.field3314, class270.field3315);
        } else if (arg0 == 17) {
            class56.method1294(class270.field3316, class270.field3498, class270.field3318);
        } else if (arg0 == 18) {
            class56.field812 = 12;
            class56.field805 = 1;
        } else if (arg0 == 19) {
            class56.method1294(class270.field3322, class270.field3323, class270.field3286);
        } else if (arg0 == 20) {
            class56.method1294(class270.field3325, class270.field3505, class270.field3519);
        } else if (arg0 == 22) {
            class56.method1294(class270.field3296, class270.field3329, class270.field3390);
        } else if (arg0 == 23) {
            class56.method1294(class270.field3331, class270.field3328, class270.field3333);
        } else if (arg0 == 24) {
            class56.method1294(class270.field3334, class270.field3326, class270.field3358);
        } else if (arg0 == 25) {
            class56.method1294(class270.field3337, class270.field3338, class270.field3339);
        } else if (arg0 == 26) {
            class56.method1294(class270.field3340, class270.field3341, class270.field3243);
        } else if (arg0 == 27) {
            class56.method1294(class270.field3291, class270.field3344, class270.field3345);
        } else if (arg0 == 31) {
            class56.method1294(class270.field3352, class270.field3353, class270.field3279);
        } else if (arg0 == 32) {
            class56.method1294(class270.field3487, class270.field3356, class270.field3357);
        } else if (arg0 == 37) {
            class56.method1294(class270.field3317, class270.field3359, class270.field3360);
        } else if (arg0 == 38) {
            class56.method1294(class270.field3414, class270.field3362, class270.field3363);
        } else if (arg0 == 55) {
            class56.field812 = 8;
        } else if (arg0 == 56) {
            class56.method1294(class270.field3368, class270.field3369, class270.field3370);
            method159(11);
            return;
        } else if (arg0 == 57) {
            class56.method1294(class270.field3281, class270.field3255, class270.field3405);
            method159(11);
            return;
        } else if (arg0 == 61) {
            class56.field812 = 7;
        } else {
            class56.method1294(class270.field3374, class270.field3271, class270.field3376);
        }
        method159(10);
    }

    @ObfuscatedName("ed.fa(B)V")
    public static final void method2492() {
        field453.method1989();
        class158.method3985();
        class151.method4358();
        class143.method1566();
        class156.method54();
        class148.field1618.method3930();
        class148.field1621.method3930();
        class157.method2579();
        class159.method1562();
        Statics.method6339();
        class152.field1689.method3930();
        class140.field1526.method3930();
        Statics.field1272.method5842();
        Statics.field3664.method5842();
        class155.field1709.method3930();
        class155.field1708.method3930();
        class155.field1710.method3930();
        class144.field1580.method3930();
        class144.field1581.method3930();
        class154.method2369();
        class153.field1697.method3930();
        class141.method787();
        class247.method2014();
        class249.method119();
        ((class205) Statics.field2269).method3744();
        class59.field862.method3930();
        Statics.field1417.method4473();
        Statics.field3693.method4473();
        Statics.field307.method4473();
        Statics.field1521.method4473();
        Statics.field2277.method4473();
        Statics.field1326.method4473();
        Statics.field1107.method4473();
        Statics.field3536.method4473();
        Statics.field1454.method4473();
        Statics.field1301.method4473();
        Statics.field3938.method4473();
        Statics.field391.method4473();
        Statics.field1925.method3699();
        for (int var0 = 0; var0 < 4; var0++) {
            field465[var0].method2851();
        }
        System.gc();
        class235.field2819 = 1;
        Statics.field2820 = null;
        Statics.field2822 = -1;
        Statics.field1264 = -1;
        Statics.field1612 = 0;
        Statics.field1598 = false;
        Statics.field1439 = 2;
        field640 = -1;
        field648 = false;
        for (class50 var1 = (class50) class50.field720.method4721(); var1 != null; var1 = (class50) class50.field720.method4712()) {
            if (var1.field727 != null) {
                Statics.field1163.method380(var1.field727);
                var1.field727 = null;
            }
            if (var1.field725 != null) {
                Statics.field1163.method380(var1.field725);
                var1.field725 = null;
            }
        }
        class50.field720.method4705();
        method159(10);
    }

    @ObfuscatedName("ik.fb(IB)V")
    public static final void method4325(int arg0) {
        method2492();
        switch(arg0) {
            case 1:
                class56.method4361();
                break;
            case 2:
                class56.method5307();
        }
    }

    @ObfuscatedName("fu.fx(I)V")
    public static final void method3220() {
        if (field571 > 0) {
            method2492();
        } else {
            field458.method5089();
            method159(40);
            Statics.field645 = field453.method1992();
            field453.method1985();
        }
    }

    @ObfuscatedName("ac.fr(ZI)V")
    public static final void method1490(boolean arg0) {
        if (arg0) {
            field448 = class56.field821 ? class100.field1269 : class100.field1271;
            return;
        }
        LinkedHashMap var1 = Statics.field308.field1115;
        String var2 = class56.field809;
        int var3 = var2.length();
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            var4 = (var4 << 5) - var4 + var2.charAt(var5);
        }
        field448 = var1.containsKey(var4) ? class100.field1277 : class100.field1268;
    }

    @ObfuscatedName("client.fe(I)V")
    public final void method843() {
        if (field423 > 1) {
            field423--;
        }
        if (field571 > 0) {
            field571--;
        }
        if (field456) {
            field456 = false;
            method3220();
            return;
        }
        if (!field544) {
            method102();
        }
        for (int var1 = 0; var1 < 100 && this.method847(field453); var1++) {
        }
        if (field413 != 30) {
            return;
        }
        while (true) {
            class43 var2 = (class43) class42.field356.method4758();
            boolean var3;
            if (var2 == null) {
                var3 = false;
            } else {
                var3 = true;
            }
            if (!var3) {
                if (field458.field3782) {
                    class229 var6 = class229.method2538(class227.field2576, field453.field1205);
                    var6.field2691.method5941(0);
                    int var7 = var6.field2691.field4182;
                    field458.method5098(var6.field2691);
                    var6.field2691.method5955(var6.field2691.field4182 - var7);
                    field453.method1987(var6);
                    field458.method5092();
                }
                Object var8 = Statics.field14.field975;
                synchronized (Statics.field14.field975) {
                    if (!field635) {
                        Statics.field14.field967 = 0;
                    } else if (class20.field149 != 0 || Statics.field14.field967 >= 40) {
                        class229 var9 = null;
                        int var10 = 0;
                        int var11 = 0;
                        int var12 = 0;
                        int var13 = 0;
                        for (int var14 = 0; var14 < Statics.field14.field967 && (var9 == null || var9.field2691.field4182 - var10 < 246); var14++) {
                            var11 = var14;
                            int var15 = Statics.field14.field969[var14];
                            if (var15 < -1) {
                                var15 = -1;
                            } else if (var15 > 65534) {
                                var15 = 65534;
                            }
                            int var16 = Statics.field14.field968[var14];
                            if (var16 < -1) {
                                var16 = -1;
                            } else if (var16 > 65534) {
                                var16 = 65534;
                            }
                            if (field418 != var16 || field419 != var15) {
                                if (var9 == null) {
                                    var9 = class229.method2538(class227.field2626, field453.field1205);
                                    var9.field2691.method5941(0);
                                    var10 = var9.field2691.field4182;
                                    var9.field2691.field4182 += 2;
                                    var12 = 0;
                                    var13 = 0;
                                }
                                int var17;
                                int var18;
                                int var19;
                                if (field420 == -1L) {
                                    var17 = var16;
                                    var18 = var15;
                                    var19 = Integer.MAX_VALUE;
                                } else {
                                    var17 = var16 - field418;
                                    var18 = var15 - field419;
                                    var19 = (int) ((Statics.field14.field970[var14] - field420) / 20L);
                                    var12 = (int) ((Statics.field14.field970[var14] - field420) % 20L + (long) var12);
                                }
                                field418 = var16;
                                field419 = var15;
                                if (var19 < 8 && var17 >= -32 && var17 <= 31 && var18 >= -32 && var18 <= 31) {
                                    var17 += 32;
                                    var18 += 32;
                                    var9.field2691.method6132((var17 << 6) + (var19 << 12) + var18);
                                } else if (var19 < 32 && var17 >= -128 && var17 <= 127 && var18 >= -128 && var18 <= 127) {
                                    var17 += 128;
                                    var18 += 128;
                                    var9.field2691.method5941(var19 + 128);
                                    var9.field2691.method6132((var17 << 8) + var18);
                                } else if (var19 < 32) {
                                    var9.field2691.method5941(var19 + 192);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2691.method5944(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2691.method5944(var16 | var15 << 16);
                                    }
                                } else {
                                    var9.field2691.method6132((var19 & 0x1FFF) + 57344);
                                    if (var16 == -1 || var15 == -1) {
                                        var9.field2691.method5944(Integer.MIN_VALUE);
                                    } else {
                                        var9.field2691.method5944(var16 | var15 << 16);
                                    }
                                }
                                var13++;
                                field420 = Statics.field14.field970[var14];
                            }
                        }
                        if (var9 != null) {
                            var9.field2691.method5955(var9.field2691.field4182 - var10);
                            int var20 = var9.field2691.field4182;
                            var9.field2691.field4182 = var10;
                            var9.field2691.method5941(var12 / var13);
                            var9.field2691.method5941(var12 % var13);
                            var9.field2691.field4182 = var20;
                            field453.method1987(var9);
                        }
                        if (var11 >= Statics.field14.field967) {
                            Statics.field14.field967 = 0;
                        } else {
                            Statics.field14.field967 -= var11;
                            System.arraycopy(Statics.field14.field968, var11, Statics.field14.field968, 0, Statics.field14.field967);
                            System.arraycopy(Statics.field14.field969, var11, Statics.field14.field969, 0, Statics.field14.field967);
                            System.arraycopy(Statics.field14.field970, var11, Statics.field14.field970, 0, Statics.field14.field967);
                        }
                    }
                }
                if (class20.field149 == 1 || !Statics.field3777 && class20.field149 == 4 || class20.field149 == 2) {
                    long var22 = class20.field152 - field417 * -1L;
                    if (var22 > 32767L) {
                        var22 = 32767L;
                    }
                    field417 = class20.field152 * -1L;
                    int var24 = class20.field151;
                    if (var24 < 0) {
                        var24 = 0;
                    } else if (var24 > Statics.field687) {
                        var24 = Statics.field687;
                    }
                    int var25 = class20.field150;
                    if (var25 < 0) {
                        var25 = 0;
                    } else if (var25 > Statics.field971) {
                        var25 = Statics.field971;
                    }
                    int var26 = (int) var22;
                    class229 var27 = class229.method2538(class227.field2580, field453.field1205);
                    var27.field2691.method6132((class20.field149 == 2 ? 1 : 0) + (var26 << 1));
                    var27.field2691.method6132(var25);
                    var27.field2691.method6132(var24);
                    field453.method1987(var27);
                }
                if (class11.field36 > 0) {
                    class229 var28 = class229.method2538(class227.field2564, field453.field1205);
                    var28.field2691.method6132(0);
                    int var29 = var28.field2691.field4182;
                    long var30 = class382.method2013();
                    for (int var32 = 0; var32 < class11.field36; var32++) {
                        long var33 = var30 - field636;
                        if (var33 > 16777215L) {
                            var33 = 16777215L;
                        }
                        field636 = var30;
                        var28.field2691.method6121((int) var33);
                        var28.field2691.method5941(class11.field54[var32]);
                    }
                    var28.field2691.method6044(var28.field2691.field4182 - var29);
                    field453.method1987(var28);
                }
                if (field608 > 0) {
                    field608--;
                }
                if (class11.field46[96] || class11.field46[97] || class11.field46[98] || class11.field46[99]) {
                    field492 = true;
                }
                if (field492 && field608 <= 0) {
                    field608 = 20;
                    field492 = false;
                    class229 var35 = class229.method2538(class227.field2642, field453.field1205);
                    var35.field2691.method5993(field445);
                    var35.field2691.method6087(field476);
                    field453.method1987(var35);
                }
                if (Statics.field3128 && !field421) {
                    field421 = true;
                    class229 var36 = class229.method2538(class227.field2599, field453.field1205);
                    var36.field2691.method5941(1);
                    field453.method1987(var36);
                }
                if (!Statics.field3128 && field421) {
                    field421 = false;
                    class229 var37 = class229.method2538(class227.field2599, field453.field1205);
                    var37.field2691.method5941(0);
                    field453.method1987(var37);
                }
                if (Statics.field202 != null) {
                    Statics.field202.method5660();
                }
                method1641();
                method4158();
                if (Statics.field3652 != field639) {
                    field639 = Statics.field3652;
                    int var38 = Statics.field3652;
                    int[] var39 = Statics.field4167.field4280;
                    int var40 = var39.length;
                    for (int var41 = 0; var41 < var40; var41++) {
                        var39[var41] = 0;
                    }
                    for (int var42 = 1; var42 < 103; var42++) {
                        int var43 = (103 - var42) * 2048 + 24628;
                        for (int var44 = 1; var44 < 103; var44++) {
                            if ((class62.field901[var38][var44][var42] & 0x18) == 0) {
                                Statics.field1925.method3572(var39, var43, 512, var38, var44, var42);
                            }
                            if (var38 < 3 && (class62.field901[var38 + 1][var44][var42] & 0x8) != 0) {
                                Statics.field1925.method3572(var39, var43, 512, var38 + 1, var44, var42);
                            }
                            var43 += 4;
                        }
                    }
                    int var45 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var46 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field4167.method6399();
                    for (int var47 = 1; var47 < 103; var47++) {
                        for (int var48 = 1; var48 < 103; var48++) {
                            if ((class62.field901[var38][var48][var47] & 0x18) == 0) {
                                method5708(var38, var48, var47, var45, var46);
                            }
                            if (var38 < 3 && (class62.field901[var38 + 1][var48][var47] & 0x8) != 0) {
                                method5708(var38 + 1, var48, var47, var45, var46);
                            }
                        }
                    }
                    field621 = 0;
                    for (int var49 = 0; var49 < 104; var49++) {
                        for (int var50 = 0; var50 < 104; var50++) {
                            long var51 = Statics.field1925.method3669(Statics.field3652, var49, var50);
                            if (var51 != 0L) {
                                int var53 = class208.method1867(var51);
                                int var54 = class156.method2267(var53).field1763;
                                if (var54 >= 0 && class141.method1794(var54).field1542) {
                                    field643[field621] = class141.method1794(var54).method2411(false);
                                    field614[field621] = var49;
                                    field642[field621] = var50;
                                    field621++;
                                }
                            }
                        }
                    }
                    Statics.field3194.method6340();
                }
                if (field413 != 30) {
                    return;
                }
                method4356();
                method3441();
                field453.field1210++;
                if (field453.field1210 > 750) {
                    method3220();
                    return;
                }
                int var55 = class83.field1172;
                int[] var56 = class83.field1178;
                for (int var57 = 0; var57 < var55; var57++) {
                    class70 var58 = field524[var56[var57]];
                    if (var58 != null) {
                        method173(var58, 1);
                    }
                }
                method2334();
                method2128();
                field556++;
                if (field511 != 0) {
                    field540 += 20;
                    if (field540 >= 400) {
                        field511 = 0;
                    }
                }
                if (Statics.field78 != null) {
                    field513++;
                    if (field513 >= 15) {
                        method1893(Statics.field78);
                        Statics.field78 = null;
                    }
                }
                class249 var59 = Statics.field2923;
                class249 var60 = Statics.field3699;
                Statics.field2923 = null;
                Statics.field3699 = null;
                field585 = null;
                field589 = false;
                field586 = false;
                field451 = 0;
                while (class11.method5125() && field451 < 128) {
                    if (field577 >= 2 && class11.field46[82] && Statics.field1418 == 66) {
                        String var61 = "";
                        Iterator var62 = class85.field1194.iterator();
                        while (var62.hasNext()) {
                            class45 var63 = (class45) var62.next();
                            var61 = var61 + var63.field380 + ':' + var63.field388 + '\n';
                        }
                        Statics.field874.method191(var61);
                    } else if (field482 != 1 || Statics.field1450 <= 0) {
                        field431[field451] = Statics.field1418;
                        field634[field451] = Statics.field1450;
                        field451++;
                    }
                }
                if (method2470() && class11.field46[82] && class11.field46[81] && field657 != 0) {
                    int var66 = Statics.field140.field999 - field657;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 3) {
                        var66 = 3;
                    }
                    if (Statics.field140.field999 != var66) {
                        int var67 = Statics.field3625 + Statics.field140.field1076[0];
                        int var68 = Statics.field1134 + Statics.field140.field1077[0];
                        class229 var69 = class229.method2538(class227.field2635, field453.field1205);
                        var69.field2691.method5941(var66);
                        var69.field2691.method6132(var68);
                        var69.field2691.method6087(var67);
                        var69.field2691.method5944(0);
                        field453.method1987(var69);
                    }
                    field657 = 0;
                }
                if (field568 != -1) {
                    method4213(field568, 0, 0, Statics.field971, Statics.field687, 0, 0);
                }
                field593++;
                while (true) {
                    class68 var70;
                    class249 var71;
                    class249 var72;
                    do {
                        var70 = (class68) field612.method4733();
                        if (var70 == null) {
                            while (true) {
                                class68 var73;
                                class249 var74;
                                class249 var75;
                                do {
                                    var73 = (class68) field686.method4733();
                                    if (var73 == null) {
                                        while (true) {
                                            class68 var76;
                                            class249 var77;
                                            class249 var78;
                                            do {
                                                var76 = (class68) field611.method4733();
                                                if (var76 == null) {
                                                    this.method848();
                                                    if (Statics.field202 != null) {
                                                        Statics.field202.method5498(Statics.field3652, (Statics.field140.field1069 >> 7) + Statics.field3625, (Statics.field140.field1059 >> 7) + Statics.field1134, false);
                                                        Statics.field202.method5519();
                                                    }
                                                    if (field581 != null) {
                                                        this.method853();
                                                    }
                                                    if (Statics.field688 != null) {
                                                        method1893(Statics.field688);
                                                        field521++;
                                                        if (class20.field141 == 0) {
                                                            if (field520) {
                                                                if (Statics.field688 == Statics.field515 && field519 != field516) {
                                                                    class249 var79 = Statics.field688;
                                                                    byte var80 = 0;
                                                                    if (field655 == 1 && var79.field2962 == 206) {
                                                                        var80 = 1;
                                                                    }
                                                                    if (var79.field3086[field519] <= 0) {
                                                                        var80 = 0;
                                                                    }
                                                                    int var81 = method4179(var79);
                                                                    boolean var82 = (var81 >> 29 & 0x1) != 0;
                                                                    if (var82) {
                                                                        int var83 = field516;
                                                                        int var84 = field519;
                                                                        var79.field3086[var84] = var79.field3086[var83];
                                                                        var79.field3087[var84] = var79.field3087[var83];
                                                                        var79.field3086[var83] = -1;
                                                                        var79.field3087[var83] = 0;
                                                                    } else if (var80 == 1) {
                                                                        int var85 = field516;
                                                                        int var86 = field519;
                                                                        while (var85 != var86) {
                                                                            if (var85 > var86) {
                                                                                var79.method4277(var85 - 1, var85);
                                                                                var85--;
                                                                            } else if (var85 < var86) {
                                                                                var79.method4277(var85 + 1, var85);
                                                                                var85++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var79.method4277(field519, field516);
                                                                    }
                                                                    class229 var87 = class229.method2538(class227.field2578, field453.field1205);
                                                                    var87.field2691.method5982(Statics.field688.field2958);
                                                                    var87.field2691.method6087(field516);
                                                                    var87.field2691.method5993(field519);
                                                                    var87.field2691.method5941(var80);
                                                                    field453.method1987(var87);
                                                                }
                                                            } else if (this.method951()) {
                                                                this.method850(field404, field584);
                                                            } else if (field545 > 0) {
                                                                int var88 = field404;
                                                                int var89 = field584;
                                                                Statics.method518(Statics.field1305, var88, var89);
                                                                Statics.field1305 = null;
                                                            }
                                                            field513 = 10;
                                                            class20.field149 = 0;
                                                            Statics.field688 = null;
                                                        } else if (field521 >= 5 && (class20.field142 > field404 + 5 || class20.field142 < field404 - 5 || class20.field145 > field584 + 5 || class20.field145 < field584 - 5)) {
                                                            field520 = true;
                                                        }
                                                    }
                                                    if (class200.method3577()) {
                                                        int var90 = class200.field2314;
                                                        int var91 = class200.field2315;
                                                        class229 var92 = class229.method2538(class227.field2613, field453.field1205);
                                                        var92.field2691.method5941(5);
                                                        var92.field2691.method6087(Statics.field3625 + var90);
                                                        var92.field2691.method6132(Statics.field1134 + var91);
                                                        var92.field2691.method5941(class11.field46[82] ? (class11.field46[81] ? 2 : 1) : 0);
                                                        field453.method1987(var92);
                                                        class200.method3578();
                                                        field508 = class20.field150;
                                                        field463 = class20.field151;
                                                        field511 = 1;
                                                        field540 = 0;
                                                        field644 = var90;
                                                        field597 = var91;
                                                    }
                                                    if (Statics.field2923 != var59) {
                                                        if (var59 != null) {
                                                            method1893(var59);
                                                        }
                                                        if (Statics.field2923 != null) {
                                                            method1893(Statics.field2923);
                                                        }
                                                    }
                                                    if (Statics.field3699 != var60 && field649 == field560) {
                                                        if (var60 != null) {
                                                            method1893(var60);
                                                        }
                                                        if (Statics.field3699 != null) {
                                                            method1893(Statics.field3699);
                                                        }
                                                    }
                                                    if (Statics.field3699 == null) {
                                                        if (field649 > 0) {
                                                            field649--;
                                                        }
                                                    } else if (field649 < field560) {
                                                        field649++;
                                                        if (field649 == field560) {
                                                            method1893(Statics.field3699);
                                                        }
                                                    }
                                                    if (field482 == 0) {
                                                        int var93 = Statics.field140.field1069;
                                                        int var94 = Statics.field140.field1059;
                                                        if (Statics.field66 - var93 < -500 || Statics.field66 - var93 > 500 || Statics.field3553 - var94 < -500 || Statics.field3553 - var94 > 500) {
                                                            Statics.field66 = var93;
                                                            Statics.field3553 = var94;
                                                        }
                                                        if (Statics.field66 != var93) {
                                                            Statics.field66 += (var93 - Statics.field66) / 16;
                                                        }
                                                        if (Statics.field3553 != var94) {
                                                            Statics.field3553 += (var94 - Statics.field3553) / 16;
                                                        }
                                                        int var95 = Statics.field66 >> 7;
                                                        int var96 = Statics.field3553 >> 7;
                                                        int var97 = Statics.method2240(Statics.field66, Statics.field3553, Statics.field3652);
                                                        int var98 = 0;
                                                        if (var95 > 3 && var96 > 3 && var95 < 100 && var96 < 100) {
                                                            for (int var99 = var95 - 4; var99 <= var95 + 4; var99++) {
                                                                for (int var100 = var96 - 4; var100 <= var96 + 4; var100++) {
                                                                    int var101 = Statics.field3652;
                                                                    if (var101 < 3 && (class62.field901[1][var99][var100] & 0x2) == 2) {
                                                                        var101++;
                                                                    }
                                                                    int var102 = var97 - class62.field911[var101][var99][var100];
                                                                    if (var102 > var98) {
                                                                        var98 = var102;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        int var103 = var98 * 192;
                                                        if (var103 > 98048) {
                                                            var103 = 98048;
                                                        }
                                                        if (var103 < 32768) {
                                                            var103 = 32768;
                                                        }
                                                        if (var103 > field493) {
                                                            field493 += (var103 - field493) / 24;
                                                        } else if (var103 < field493) {
                                                            field493 += (var103 - field493) / 80;
                                                        }
                                                        Statics.field3533 = Statics.method2240(Statics.field140.field1069, Statics.field140.field1059, Statics.field3652) - field483;
                                                    } else if (field482 == 1) {
                                                        method2132();
                                                        short var104 = -1;
                                                        if (class11.field46[33]) {
                                                            var104 = 0;
                                                        } else if (class11.field46[49]) {
                                                            var104 = 1024;
                                                        }
                                                        if (class11.field46[48]) {
                                                            if (var104 == 0) {
                                                                var104 = 1792;
                                                            } else if (var104 == 1024) {
                                                                var104 = 1280;
                                                            } else {
                                                                var104 = 1536;
                                                            }
                                                        } else if (class11.field46[50]) {
                                                            if (var104 == 0) {
                                                                var104 = 256;
                                                            } else if (var104 == 1024) {
                                                                var104 = 768;
                                                            } else {
                                                                var104 = 512;
                                                            }
                                                        }
                                                        byte var105 = 0;
                                                        if (class11.field46[35]) {
                                                            var105 = -1;
                                                        } else if (class11.field46[51]) {
                                                            var105 = 1;
                                                        }
                                                        int var106 = 0;
                                                        if (var104 >= 0 || var105 != 0) {
                                                            int var107 = class11.field46[81] ? field488 : field487;
                                                            var106 = var107 * 16;
                                                            field441 = var104;
                                                            field486 = var105;
                                                        }
                                                        if (field434 < var106) {
                                                            field434 += var106 / 8;
                                                            if (field434 > var106) {
                                                                field434 = var106;
                                                            }
                                                        } else if (field434 > var106) {
                                                            field434 = field434 * 9 / 10;
                                                        }
                                                        if (field434 > 0) {
                                                            int var108 = field434 / 16;
                                                            if (field441 >= 0) {
                                                                int var109 = field441 - Statics.field1400 & 0x7FF;
                                                                int var110 = class198.field2266[var109];
                                                                int var111 = class198.field2273[var109];
                                                                Statics.field66 += var108 * var110 / 65536;
                                                                Statics.field3553 += var108 * var111 / 65536;
                                                            }
                                                            if (field486 != 0) {
                                                                Statics.field3533 += field486 * var108;
                                                                if (Statics.field3533 > 0) {
                                                                    Statics.field3533 = 0;
                                                                }
                                                            }
                                                        } else {
                                                            field441 = -1;
                                                            field486 = -1;
                                                        }
                                                        if (class11.field46[13]) {
                                                            field453.method1987(class229.method2538(class227.field2634, field453.field1205));
                                                            field482 = 0;
                                                        }
                                                    }
                                                    if (class20.field141 == 4 && Statics.field3777) {
                                                        int var112 = class20.field145 - field546;
                                                        field658 = var112 * 2;
                                                        field546 = var112 == -1 || var112 == 1 ? class20.field145 : (field546 + class20.field145) / 2;
                                                        int var113 = field491 - class20.field142;
                                                        field478 = var113 * 2;
                                                        field491 = var113 == -1 || var113 == 1 ? class20.field142 : (field491 + class20.field142) / 2;
                                                    } else {
                                                        if (class11.field46[96]) {
                                                            field478 += (-24 - field478) / 2;
                                                        } else if (class11.field46[97]) {
                                                            field478 += (24 - field478) / 2;
                                                        } else {
                                                            field478 /= 2;
                                                        }
                                                        if (class11.field46[98]) {
                                                            field658 += (12 - field658) / 2;
                                                        } else if (class11.field46[99]) {
                                                            field658 += (-12 - field658) / 2;
                                                        } else {
                                                            field658 /= 2;
                                                        }
                                                        field546 = class20.field145;
                                                        field491 = class20.field142;
                                                    }
                                                    field445 = field478 / 2 + field445 & 0x7FF;
                                                    field476 += field658 / 2;
                                                    if (field476 < 128) {
                                                        field476 = 128;
                                                    }
                                                    if (field476 > 383) {
                                                        field476 = 383;
                                                    }
                                                    if (field615) {
                                                        method2890();
                                                    }
                                                    for (int var114 = 0; var114 < 5; var114++) {
                                                        int var10002 = field660[var114]++;
                                                    }
                                                    Statics.field311.method1951();
                                                    int var115 = ++class20.field146 - 1;
                                                    int var117 = class11.field61;
                                                    if (var115 > 15000 && var117 > 15000) {
                                                        field571 = 250;
                                                        class20.field146 = 14500;
                                                        class229 var119 = class229.method2538(class227.field2664, field453.field1205);
                                                        field453.method1987(var119);
                                                    }
                                                    Statics.field80.method1344();
                                                    field453.field1216++;
                                                    if (field453.field1216 > 50) {
                                                        class229 var120 = class229.method2538(class227.field2574, field453.field1205);
                                                        field453.method1987(var120);
                                                    }
                                                    try {
                                                        field453.method1986();
                                                    } catch (IOException var122) {
                                                        method3220();
                                                    }
                                                    return;
                                                }
                                                var77 = var76.field961;
                                                if (var77.field3031 < 0) {
                                                    break;
                                                }
                                                var78 = class249.method2019(var77.field3001);
                                            } while (var78 == null || var78.field3061 == null || var77.field3031 >= var78.field3061.length || var78.field3061[var77.field3031] != var77);
                                            class51.method2079(var76);
                                        }
                                    }
                                    var74 = var73.field961;
                                    if (var74.field3031 < 0) {
                                        break;
                                    }
                                    var75 = class249.method2019(var74.field3001);
                                } while (var75 == null || var75.field3061 == null || var74.field3031 >= var75.field3061.length || var75.field3061[var74.field3031] != var74);
                                class51.method2079(var73);
                            }
                        }
                        var71 = var70.field961;
                        if (var71.field3031 < 0) {
                            break;
                        }
                        var72 = class249.method2019(var71.field3001);
                    } while (var72 == null || var72.field3061 == null || var71.field3031 >= var72.field3061.length || var72.field3061[var71.field3031] != var71);
                    class51.method2079(var70);
                }
            }
            class229 var4 = class229.method2538(class227.field2591, field453.field1205);
            var4.field2691.method5941(0);
            int var5 = var4.field2691.field4182;
            class42.method1772(var4.field2691);
            var4.field2691.method5955(var4.field2691.field4182 - var5);
            field453.method1987(var4);
        }
    }

    @ObfuscatedName("jv.fm(B)V")
    public static final void method4372() {
        if (Statics.field1560 != null) {
            Statics.field1560.method447();
        }
        if (Statics.field2070 != null) {
            Statics.field2070.method447();
        }
    }

    @ObfuscatedName("gn.ft(I)V")
    public static final void method3441() {
        for (int var0 = 0; var0 < field498; var0++) {
            int var10002 = field652[var0]--;
            if (field652[var0] >= -10) {
                class22 var2 = field654[var0];
                if (var2 == null) {
                    class22 var10000 = (class22) null;
                    var2 = class22.method413(Statics.field1521, field629[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field652[var0] += var2.method417();
                    field654[var0] = var2;
                }
                if (field652[var0] < 0) {
                    int var9;
                    if (field653[var0] == 0) {
                        var9 = Statics.field308.field1121;
                    } else {
                        int var3 = (field653[var0] & 0xFF) * 128;
                        int var4 = field653[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field140.field1069;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field653[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field140.field1059;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field652[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = Statics.field308.field1116 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class23 var10 = var2.method407().method418(Statics.field1842);
                        class30 var11 = class30.method573(var10, 100, var9);
                        var11.method603(field651[var0] - 1);
                        Statics.field1163.method368(var11);
                    }
                    field652[var0] = -100;
                }
            } else {
                field498--;
                for (int var1 = var0; var1 < field498; var1++) {
                    field629[var1] = field629[var1 + 1];
                    field654[var1] = field654[var1 + 1];
                    field651[var1] = field651[var1 + 1];
                    field652[var1] = field652[var1 + 1];
                    field653[var1] = field653[var1 + 1];
                }
                var0--;
            }
        }
        if (!field648) {
            return;
        }
        boolean var12;
        if (class235.field2819 == 0) {
            var12 = Statics.field2816.method4014();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (Statics.field308.field1119 != 0 && field640 != -1) {
                class235.method1910(Statics.field1326, field640, 0, Statics.field308.field1119, false);
            }
            field648 = false;
        }
    }

    @ObfuscatedName("ez.fu(Lfz;IIII)V")
    public static void method2607(class159 arg0, int arg1, int arg2, int arg3) {
        if (field498 >= 50 || Statics.field308.field1116 == 0 || arg0.field1866 == null || arg1 >= arg0.field1866.length) {
            return;
        }
        int var4 = arg0.field1866[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field629[field498] = var5;
        field651[field498] = var6;
        field652[field498] = 0;
        field654[field498] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field653[field498] = (var8 << 16) + (var9 << 8) + var7;
        field498++;
    }

    @ObfuscatedName("dl.fs(IIII)V")
    public static void method2280(int arg0, int arg1, int arg2) {
        if (Statics.field308.field1121 == 0 || arg1 == 0 || field498 >= 50) {
            return;
        }
        field629[field498] = arg0;
        field651[field498] = arg1;
        field652[field498] = arg2;
        field654[field498] = null;
        field653[field498] = 0;
        field498++;
    }

    @ObfuscatedName("at.fk(II)V")
    public static void method780(int arg0) {
        if (arg0 == -1 && !field648) {
            class235.method1634();
        } else if (arg0 != -1 && field640 != arg0 && Statics.field308.field1119 != 0 && !field648) {
            class235.method2050(2, Statics.field1326, arg0, 0, Statics.field308.field1119, false);
        }
        field640 = arg0;
    }

    @ObfuscatedName("cd.fo(IIB)V")
    public static void method2024(int arg0, int arg1) {
        if (Statics.field308.field1119 != 0 && arg0 != -1) {
            class235.method1910(Statics.field3938, arg0, 0, Statics.field308.field1119, false);
            field648 = true;
        }
    }

    @ObfuscatedName("bw.fl(I)V")
    public static final void method1641() {
        if (!Statics.field1232) {
            return;
        }
        if (Statics.field972 != null) {
            Statics.field972.method5232();
        }
        Statics.method2592();
        Statics.field1232 = false;
    }

    @ObfuscatedName("it.fn(I)V")
    public static final void method4158() {
        if (!Statics.field1183) {
            return;
        }
        for (int var0 = 0; var0 < class83.field1172; var0++) {
            class70 var1 = field524[class83.field1178[var0]];
            var1.method1732();
        }
        Statics.field1183 = false;
    }

    @ObfuscatedName("bk.ff(Lio;III)V")
    public static final void method1565(class249 arg0, int arg1, int arg2) {
        if (field646 != 0 && field646 != 3 || field544 || !(class20.field149 == 1 || !Statics.field3777 && class20.field149 == 4)) {
            return;
        }
        class243 var3 = arg0.method4266(true);
        if (var3 == null) {
            return;
        }
        int var4 = class20.field150 - arg1;
        int var5 = class20.field151 - arg2;
        if (!var3.method4187(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2910 / 2;
        int var7 = var5 - var3.field2906 / 2;
        int var8 = field445 & 0x7FF;
        int var9 = class198.field2266[var8];
        int var10 = class198.field2273[var8];
        int var11 = var6 * var10 + var7 * var9 >> 11;
        int var12 = var7 * var10 - var6 * var9 >> 11;
        int var13 = Statics.field140.field1069 + var11 >> 7;
        int var14 = Statics.field140.field1059 - var12 >> 7;
        class229 var15 = class229.method2538(class227.field2586, field453.field1205);
        var15.field2691.method5941(18);
        var15.field2691.method6087(Statics.field3625 + var13);
        var15.field2691.method6132(Statics.field1134 + var14);
        var15.field2691.method5941(class11.field46[82] ? (class11.field46[81] ? 2 : 1) : 0);
        var15.field2691.method5941(var6);
        var15.field2691.method5941(var7);
        var15.field2691.method6132(field445);
        var15.field2691.method5941(57);
        var15.field2691.method5941(0);
        var15.field2691.method5941(0);
        var15.field2691.method5941(89);
        var15.field2691.method6132(Statics.field140.field1069);
        var15.field2691.method6132(Statics.field140.field1059);
        var15.field2691.method5941(63);
        field453.method1987(var15);
        field644 = var13;
        field597 = var14;
    }

    @ObfuscatedName("de.fd(B)V")
    public static final void method2128() {
        int[] var0 = class83.field1178;
        for (int var1 = 0; var1 < class83.field1172; var1++) {
            class70 var2 = field524[var0[var1]];
            if (var2 != null && var2.field1037 > 0) {
                var2.field1037--;
                if (var2.field1037 == 0) {
                    var2.field1034 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field685; var3++) {
            int var4 = field450[var3];
            class78 var5 = field567[var4];
            if (var5 != null && var5.field1037 > 0) {
                var5.field1037--;
                if (var5.field1037 == 0) {
                    var5.field1034 = null;
                }
            }
        }
    }

    @ObfuscatedName("ds.ge(Ljava/lang/String;I)V")
    public static final void method2237(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field308.field1113 = !Statics.field308.field1113;
            class76.method2370();
            if (Statics.field308.field1113) {
                class85.method2228(99, "", "Roofs are now all hidden");
            } else {
                class85.method2228(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field422 = !field422;
        }
        if (arg0.equalsIgnoreCase("renderself")) {
            field527 = !field527;
        }
        if (arg0.equalsIgnoreCase("mouseovertext")) {
            field578 = !field578;
        }
        if (field577 >= 2) {
            if (arg0.equalsIgnoreCase("errortest")) {
                throw new RuntimeException();
            }
            if (arg0.equalsIgnoreCase("showcoord")) {
                Statics.field202.field4026 = !Statics.field202.field4026;
            }
            if (arg0.equalsIgnoreCase("fpson")) {
                field422 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field422 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3220();
            }
        }
        class229 var1 = class229.method2538(class227.field2666, field453.field1205);
        var1.field2691.method5941(arg0.length() + 1);
        var1.field2691.method5948(arg0);
        field453.method1987(var1);
    }

    @ObfuscatedName("fp.gk(I)V")
    public static final void method2890() {
        int var0 = Statics.field1324 * 128 + 64;
        int var1 = Statics.field1714 * 128 + 64;
        int var2 = Statics.method2240(var0, var1, Statics.field3652) - Statics.field15;
        if (Statics.field934 < var0) {
            Statics.field934 += Statics.field2546 * (var0 - Statics.field934) / 1000 + Statics.field1266;
            if (Statics.field934 > var0) {
                Statics.field934 = var0;
            }
        }
        if (Statics.field934 > var0) {
            Statics.field934 -= Statics.field2546 * (Statics.field934 - var0) / 1000 + Statics.field1266;
            if (Statics.field934 < var0) {
                Statics.field934 = var0;
            }
        }
        if (Statics.field3924 < var2) {
            Statics.field3924 += Statics.field2546 * (var2 - Statics.field3924) / 1000 + Statics.field1266;
            if (Statics.field3924 > var2) {
                Statics.field3924 = var2;
            }
        }
        if (Statics.field3924 > var2) {
            Statics.field3924 -= Statics.field2546 * (Statics.field3924 - var2) / 1000 + Statics.field1266;
            if (Statics.field3924 < var2) {
                Statics.field3924 = var2;
            }
        }
        if (Statics.field4012 < var1) {
            Statics.field4012 += Statics.field2546 * (var1 - Statics.field4012) / 1000 + Statics.field1266;
            if (Statics.field4012 > var1) {
                Statics.field4012 = var1;
            }
        }
        if (Statics.field4012 > var1) {
            Statics.field4012 -= Statics.field2546 * (Statics.field4012 - var1) / 1000 + Statics.field1266;
            if (Statics.field4012 < var1) {
                Statics.field4012 = var1;
            }
        }
        int var3 = Statics.field4166 * 128 + 64;
        int var4 = Statics.field2148 * 128 + 64;
        int var5 = Statics.method2240(var3, var4, Statics.field3652) - Statics.field3875;
        int var6 = var3 - Statics.field934;
        int var7 = var5 - Statics.field3924;
        int var8 = var4 - Statics.field4012;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1398 < var10) {
            Statics.field1398 += Statics.field3398 * (var10 - Statics.field1398) / 1000 + Statics.field1578;
            if (Statics.field1398 > var10) {
                Statics.field1398 = var10;
            }
        }
        if (Statics.field1398 > var10) {
            Statics.field1398 -= Statics.field3398 * (Statics.field1398 - var10) / 1000 + Statics.field1578;
            if (Statics.field1398 < var10) {
                Statics.field1398 = var10;
            }
        }
        int var12 = var11 - Statics.field1400;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1400 += Statics.field3398 * var12 / 1000 + Statics.field1578;
            Statics.field1400 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1400 -= Statics.field3398 * -var12 / 1000 + Statics.field1578;
            Statics.field1400 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1400;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1400 = var11;
        }
    }

    @ObfuscatedName("ek.gu(I)V")
    public static final void method2334() {
        for (int var0 = 0; var0 < field685; var0++) {
            int var1 = field450[var0];
            class78 var2 = field567[var1];
            if (var2 != null) {
                method173(var2, var2.field1132.field1622);
            }
        }
    }

    @ObfuscatedName("u.gr(Lbx;IB)V")
    public static final void method173(class72 arg0, int arg1) {
        if (arg0.field1074 >= field452) {
            method1337(arg0);
        } else if (arg0.field1068 >= field452) {
            method814(arg0);
        } else {
            method2694(arg0);
        }
        if (arg0.field1069 < 128 || arg0.field1059 < 128 || arg0.field1069 >= 13184 || arg0.field1059 >= 13184) {
            arg0.field1053 = -1;
            arg0.field1058 = -1;
            arg0.field1074 = 0;
            arg0.field1068 = 0;
            arg0.field1069 = arg0.field1076[0] * 128 + arg0.field1024 * 64;
            arg0.field1059 = arg0.field1077[0] * 128 + arg0.field1024 * 64;
            arg0.method1775();
        }
        if (Statics.field140 == arg0 && (arg0.field1069 < 1536 || arg0.field1059 < 1536 || arg0.field1069 >= 11776 || arg0.field1059 >= 11776)) {
            arg0.field1053 = -1;
            arg0.field1058 = -1;
            arg0.field1074 = 0;
            arg0.field1068 = 0;
            arg0.field1069 = arg0.field1076[0] * 128 + arg0.field1024 * 64;
            arg0.field1059 = arg0.field1077[0] * 128 + arg0.field1024 * 64;
            arg0.method1775();
        }
        method784(arg0);
        method2142(arg0);
    }

    @ObfuscatedName("ag.gg(Lbx;I)V")
    public static final void method1337(class72 arg0) {
        int var1 = Math.max(1, arg0.field1074 - field452);
        int var2 = arg0.field1063 * 128 + arg0.field1024 * 64;
        int var3 = arg0.field1065 * 128 + arg0.field1024 * 64;
        arg0.field1069 += (var2 - arg0.field1069) / var1;
        arg0.field1059 += (var3 - arg0.field1059) / var1;
        arg0.field1079 = 0;
        arg0.field1043 = arg0.field1051;
    }

    @ObfuscatedName("ay.gx(Lbx;I)V")
    public static final void method814(class72 arg0) {
        if (field452 == arg0.field1068 || arg0.field1053 == -1 || arg0.field1056 != 0 || arg0.field1055 + 1 > class159.method1334(arg0.field1053).field1865[arg0.field1054]) {
            int var1 = arg0.field1068 - arg0.field1074;
            int var2 = field452 - arg0.field1074;
            int var3 = arg0.field1063 * 128 + arg0.field1024 * 64;
            int var4 = arg0.field1065 * 128 + arg0.field1024 * 64;
            int var5 = arg0.field1064 * 128 + arg0.field1024 * 64;
            int var6 = arg0.field1066 * 128 + arg0.field1024 * 64;
            arg0.field1069 = ((var1 - var2) * var3 + var2 * var5) / var1;
            arg0.field1059 = ((var1 - var2) * var4 + var2 * var6) / var1;
        }
        arg0.field1079 = 0;
        arg0.field1043 = arg0.field1051;
        arg0.field1022 = arg0.field1043;
    }

    @ObfuscatedName("em.gi(Lbx;B)V")
    public static final void method2694(class72 arg0) {
        arg0.field1050 = arg0.field1030;
        if (arg0.field1027 == 0) {
            arg0.field1079 = 0;
            return;
        }
        if (arg0.field1053 != -1 && arg0.field1056 == 0) {
            class159 var1 = class159.method1334(arg0.field1053);
            if (arg0.field1067 > 0 && var1.field1868 == 0) {
                arg0.field1079++;
                return;
            }
            if (arg0.field1067 <= 0 && var1.field1860 == 0) {
                arg0.field1079++;
                return;
            }
        }
        int var2 = arg0.field1069;
        int var3 = arg0.field1059;
        int var4 = arg0.field1076[arg0.field1027 - 1] * 128 + arg0.field1024 * 64;
        int var5 = arg0.field1077[arg0.field1027 - 1] * 128 + arg0.field1024 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field1043 = 1280;
            } else if (var3 > var5) {
                arg0.field1043 = 1792;
            } else {
                arg0.field1043 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field1043 = 768;
            } else if (var3 > var5) {
                arg0.field1043 = 256;
            } else {
                arg0.field1043 = 512;
            }
        } else if (var3 < var5) {
            arg0.field1043 = 1024;
        } else if (var3 > var5) {
            arg0.field1043 = 0;
        }
        byte var6 = arg0.field1031[arg0.field1027 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field1069 = var4;
            arg0.field1059 = var5;
            arg0.field1027--;
            if (arg0.field1067 > 0) {
                arg0.field1067--;
            }
            return;
        }
        int var7 = arg0.field1043 - arg0.field1022 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field1072;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field1029;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field1021;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field1046;
        }
        if (var8 == -1) {
            var8 = arg0.field1029;
        }
        arg0.field1050 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class78) {
            var10 = ((class78) arg0).field1132.field1623;
        }
        if (var10) {
            if (arg0.field1043 != arg0.field1022 && arg0.field1047 == -1 && arg0.field1075 != 0) {
                var9 = 2;
            }
            if (arg0.field1027 > 2) {
                var9 = 6;
            }
            if (arg0.field1027 > 3) {
                var9 = 8;
            }
            if (arg0.field1079 > 0 && arg0.field1027 > 1) {
                var9 = 8;
                arg0.field1079--;
            }
        } else {
            if (arg0.field1027 > 1) {
                var9 = 6;
            }
            if (arg0.field1027 > 2) {
                var9 = 8;
            }
            if (arg0.field1079 > 0 && arg0.field1027 > 1) {
                var9 = 8;
                arg0.field1079--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field1050 == arg0.field1029 && arg0.field1033 != -1) {
            arg0.field1050 = arg0.field1033;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field1069 += var9;
                if (arg0.field1069 > var4) {
                    arg0.field1069 = var4;
                }
            } else if (var2 > var4) {
                arg0.field1069 -= var9;
                if (arg0.field1069 < var4) {
                    arg0.field1069 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field1059 += var9;
                if (arg0.field1059 > var5) {
                    arg0.field1059 = var5;
                }
            } else if (var3 > var5) {
                arg0.field1059 -= var9;
                if (arg0.field1059 < var5) {
                    arg0.field1059 = var5;
                }
            }
        }
        if (arg0.field1069 == var4 && arg0.field1059 == var5) {
            arg0.field1027--;
            if (arg0.field1067 > 0) {
                arg0.field1067--;
            }
        }
    }

    @ObfuscatedName("af.gb(Lbx;I)V")
    public static final void method784(class72 arg0) {
        if (arg0.field1075 == 0) {
            return;
        }
        if (arg0.field1047 != -1) {
            class72 var1 = null;
            if (arg0.field1047 < 32768) {
                var1 = field567[arg0.field1047];
            } else if (arg0.field1047 >= 32768) {
                var1 = field524[arg0.field1047 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field1069 - var1.field1069;
                int var3 = arg0.field1059 - var1.field1059;
                if (var2 != 0 || var3 != 0) {
                    arg0.field1043 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field1032) {
                arg0.field1047 = -1;
                arg0.field1032 = false;
            }
        }
        if (arg0.field1049 != -1 && (arg0.field1027 == 0 || arg0.field1079 > 0)) {
            arg0.field1043 = arg0.field1049;
            arg0.field1049 = -1;
        }
        int var4 = arg0.field1043 - arg0.field1022 & 0x7FF;
        if (var4 == 0 && arg0.field1032) {
            arg0.field1047 = -1;
            arg0.field1032 = false;
        }
        if (var4 == 0) {
            arg0.field1073 = 0;
            return;
        }
        arg0.field1073++;
        if (var4 > 1024) {
            arg0.field1022 -= arg0.field1075;
            boolean var5 = true;
            if (var4 < arg0.field1075 || var4 > 2048 - arg0.field1075) {
                arg0.field1022 = arg0.field1043;
                var5 = false;
            }
            if (arg0.field1050 == arg0.field1030 && (arg0.field1073 > 25 || var5)) {
                if (arg0.field1052 == -1) {
                    arg0.field1050 = arg0.field1029;
                } else {
                    arg0.field1050 = arg0.field1052;
                }
            }
        } else {
            arg0.field1022 += arg0.field1075;
            boolean var6 = true;
            if (var4 < arg0.field1075 || var4 > 2048 - arg0.field1075) {
                arg0.field1022 = arg0.field1043;
                var6 = false;
            }
            if (arg0.field1050 == arg0.field1030 && (arg0.field1073 > 25 || var6)) {
                if (arg0.field1020 == -1) {
                    arg0.field1050 = arg0.field1029;
                } else {
                    arg0.field1050 = arg0.field1020;
                }
            }
        }
        arg0.field1022 &= 0x7FF;
    }

    @ObfuscatedName("do.gh(Lbx;I)V")
    public static final void method2142(class72 arg0) {
        arg0.field1023 = false;
        if (arg0.field1050 != -1) {
            class159 var1 = class159.method1334(arg0.field1050);
            if (var1 == null || var1.field1863 == null) {
                arg0.field1050 = -1;
            } else {
                arg0.field1044++;
                if (arg0.field1042 < var1.field1863.length && arg0.field1044 > var1.field1865[arg0.field1042]) {
                    arg0.field1044 = 1;
                    arg0.field1042++;
                    method2607(var1, arg0.field1042, arg0.field1069, arg0.field1059);
                }
                if (arg0.field1042 >= var1.field1863.length) {
                    arg0.field1044 = 0;
                    arg0.field1042 = 0;
                    method2607(var1, arg0.field1042, arg0.field1069, arg0.field1059);
                }
            }
        }
        if (arg0.field1058 != -1 && field452 >= arg0.field1061) {
            if (arg0.field1028 < 0) {
                arg0.field1028 = 0;
            }
            int var2 = class150.method455(arg0.field1058).field1664;
            if (var2 == -1) {
                arg0.field1058 = -1;
            } else {
                class159 var3 = class159.method1334(var2);
                if (var3 == null || var3.field1863 == null) {
                    arg0.field1058 = -1;
                } else {
                    arg0.field1060++;
                    if (arg0.field1028 < var3.field1863.length && arg0.field1060 > var3.field1865[arg0.field1028]) {
                        arg0.field1060 = 1;
                        arg0.field1028++;
                        method2607(var3, arg0.field1028, arg0.field1069, arg0.field1059);
                    }
                    if (arg0.field1028 >= var3.field1863.length && (arg0.field1028 < 0 || arg0.field1028 >= var3.field1863.length)) {
                        arg0.field1058 = -1;
                    }
                }
            }
        }
        if (arg0.field1053 != -1 && arg0.field1056 <= 1) {
            class159 var4 = class159.method1334(arg0.field1053);
            if (var4.field1868 == 1 && arg0.field1067 > 0 && arg0.field1074 <= field452 && arg0.field1068 < field452) {
                arg0.field1056 = 1;
                return;
            }
        }
        if (arg0.field1053 != -1 && arg0.field1056 == 0) {
            class159 var5 = class159.method1334(arg0.field1053);
            if (var5 == null || var5.field1863 == null) {
                arg0.field1053 = -1;
            } else {
                arg0.field1055++;
                if (arg0.field1054 < var5.field1863.length && arg0.field1055 > var5.field1865[arg0.field1054]) {
                    arg0.field1055 = 1;
                    arg0.field1054++;
                    method2607(var5, arg0.field1054, arg0.field1069, arg0.field1059);
                }
                if (arg0.field1054 >= var5.field1863.length) {
                    arg0.field1054 -= var5.field1862;
                    arg0.field1057++;
                    if (arg0.field1057 >= var5.field1873) {
                        arg0.field1053 = -1;
                    } else if (arg0.field1054 >= 0 && arg0.field1054 < var5.field1863.length) {
                        method2607(var5, arg0.field1054, arg0.field1069, arg0.field1059);
                    } else {
                        arg0.field1053 = -1;
                    }
                }
                arg0.field1023 = var5.field1869;
            }
        }
        if (arg0.field1056 > 0) {
            arg0.field1056--;
        }
    }

    @ObfuscatedName("ez.gc(Lbb;III)V")
    public static void method2608(class70 arg0, int arg1, int arg2) {
        if (arg0.field1053 == arg1 && arg1 != -1) {
            int var3 = class159.method1334(arg1).field1876;
            if (var3 == 1) {
                arg0.field1054 = 0;
                arg0.field1055 = 0;
                arg0.field1056 = arg2;
                arg0.field1057 = 0;
            }
            if (var3 == 2) {
                arg0.field1057 = 0;
            }
        } else if (arg1 == -1 || arg0.field1053 == -1 || class159.method1334(arg1).field1864 >= class159.method1334(arg0.field1053).field1864) {
            arg0.field1053 = arg1;
            arg0.field1054 = 0;
            arg0.field1055 = 0;
            arg0.field1056 = arg2;
            arg0.field1057 = 0;
            arg0.field1067 = arg0.field1027;
        }
    }

    @ObfuscatedName("if.gz(B)I")
    public static int method4156() {
        return field613 ? 2 : 1;
    }

    @ObfuscatedName("fi.gn(II)V")
    public static void method2909(int arg0) {
        field625 = 0L;
        if (arg0 >= 2) {
            field613 = true;
        } else {
            field613 = false;
        }
        if (method4156() == 1) {
            Statics.field874.method297(765, 503);
        } else {
            Statics.field874.method297(7680, 2160);
        }
        if (field413 < 25) {
            return;
        }
        class229 var1 = class229.method2538(class227.field2572, field453.field1205);
        var1.field2691.method5941(method4156());
        var1.field2691.method6132(Statics.field971);
        var1.field2691.method6132(Statics.field687);
        field453.method1987(var1);
    }

    @ObfuscatedName("client.a(B)V")
    public final void method202() {
        field625 = class382.method2013() + 500L;
        this.method845();
        if (field568 != -1) {
            this.method851(true);
        }
    }

    @ObfuscatedName("client.go(I)V")
    public void method845() {
        int var1 = Statics.field971;
        int var2 = Statics.field687;
        if (this.field104 < var1) {
            int var3 = this.field104;
        }
        if (this.field98 < var2) {
            int var4 = this.field98;
        }
        if (Statics.field308 != null) {
            try {
                class15.method151(Statics.field874, "resize", new Object[] { method4156() });
            } catch (Throwable var6) {
            }
        }
    }

    @ObfuscatedName("client.gp(I)V")
    public final void method1133() {
        if (field568 != -1) {
            int var1 = field568;
            if (class249.method4333(var1)) {
                Statics.method2442(Statics.field3039[var1], -1);
            }
        }
        for (int var2 = 0; var2 < field591; var2++) {
            if (field617[var2]) {
                field618[var2] = true;
            }
            field509[var2] = field617[var2];
            field617[var2] = false;
        }
        field616 = field452;
        field557 = -1;
        field558 = -1;
        Statics.field515 = null;
        if (field568 != -1) {
            field591 = 0;
            method781(field568, 0, 0, Statics.field971, Statics.field687, 0, 0, -1);
        }
        class394.method6302();
        if (field512) {
            if (field511 == 1) {
                Statics.field1190[field540 / 100].method6403(field508 - 8, field463 - 8);
            }
            if (field511 == 2) {
                Statics.field1190[field540 / 100 + 4].method6403(field508 - 8, field463 - 8);
            }
        }
        if (field544) {
            int var8 = Statics.field1659;
            int var9 = Statics.field3907;
            int var10 = Statics.field69;
            int var11 = Statics.field772;
            int var12 = 6116423;
            class394.method6272(var8, var9, var10, var11, var12);
            class394.method6272(var8 + 1, var9 + 1, var10 - 2, 16, 0);
            class394.method6299(var8 + 1, var9 + 18, var10 - 2, var11 - 19, 0);
            Statics.field1468.method4891(class270.field3383, var8 + 3, var9 + 14, var12, -1);
            int var13 = class20.field142;
            int var14 = class20.field145;
            for (int var15 = 0; var15 < field545; var15++) {
                int var16 = (field545 - 1 - var15) * 15 + var9 + 31;
                int var17 = 16777215;
                if (var13 > var8 && var13 < var8 + var10 && var14 > var16 - 13 && var14 < var16 + 3) {
                    var17 = 16776960;
                }
                class302 var18 = Statics.field1468;
                String var19;
                if (var15 < 0) {
                    var19 = "";
                } else if (field551[var15].length() > 0) {
                    var19 = field485[var15] + class270.field3267 + field551[var15];
                } else {
                    var19 = field485[var15];
                }
                var18.method4891(var19, var8 + 3, var16, var17, 0);
            }
            method2516(Statics.field1659, Statics.field3907, Statics.field69, Statics.field772);
        } else if (field557 != -1) {
            int var3 = field557;
            int var4 = field558;
            if ((field545 >= 2 || field561 != 0 || field563) && field578) {
                int var5 = method2885();
                String var6;
                if (field561 == 1 && field545 < 2) {
                    var6 = class270.field3380 + class270.field3267 + field530 + " " + class79.field1143;
                } else if (field563 && field545 < 2) {
                    var6 = field566 + class270.field3267 + field466 + " " + class79.field1143;
                } else {
                    String var7;
                    if (var5 < 0) {
                        var7 = "";
                    } else if (field551[var5].length() > 0) {
                        var7 = field485[var5] + class270.field3267 + field551[var5];
                    } else {
                        var7 = field485[var5];
                    }
                    var6 = var7;
                }
                if (field545 > 2) {
                    var6 = var6 + class79.method786(16777215) + " " + '/' + " " + (field545 - 2) + class270.field3432;
                }
                Statics.field1468.method4899(var6, var3 + 4, var4 + 15, 16777215, 0, field452 / 1000);
            }
        }
        if (field624 == 3) {
            for (int var20 = 0; var20 < field591; var20++) {
                if (field509[var20]) {
                    class394.method6271(field623[var20], field626[var20], field622[var20], field619[var20], 16711935, 128);
                } else if (field618[var20]) {
                    class394.method6271(field623[var20], field626[var20], field622[var20], field619[var20], 16711680, 128);
                }
            }
        }
        class50.method1338(Statics.field3652, Statics.field140.field1069, Statics.field140.field1059, field556);
        field556 = 0;
    }

    @ObfuscatedName("p.gq(Ljava/lang/String;ZB)V")
    public static final void method108(String arg0, boolean arg1) {
        if (!field523) {
            return;
        }
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field3165.method4935(arg0, 250);
        int var6 = Statics.field3165.method4915(arg0, 250) * 13;
        class394.method6272(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class394.method6299(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field3165.method4895(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        int var7 = var3 - var2;
        int var8 = var4 - var2;
        int var9 = var2 + var5 + var2;
        int var10 = var2 + var6 + var2;
        for (int var11 = 0; var11 < field591; var11++) {
            if (field623[var11] + field622[var11] > var7 && field623[var11] < var7 + var9 && field626[var11] + field619[var11] > var8 && field626[var11] < var8 + var10) {
                field617[var11] = true;
            }
        }
        if (arg1) {
            Statics.field3194.method176(0, 0);
        } else {
            method2516(var3, var4, var5, var6);
        }
    }

    @ObfuscatedName("gr.gs(IIIII)V")
    public static final void method3287(int arg0, int arg1, int arg2, int arg3) {
        field505++;
        if (Statics.field140.field1069 >> 7 == field644 && Statics.field140.field1059 >> 7 == field597) {
            field644 = 0;
        }
        method2037();
        if (field535 >= 0 && field524[field535] != null) {
            method819(field524[field535], false);
        }
        method2266(true);
        int var4 = class83.field1172;
        int[] var5 = class83.field1178;
        for (int var6 = 0; var6 < var4; var6++) {
            if (field535 != var5[var6] && field665 != var5[var6]) {
                method819(field524[var5[var6]], true);
            }
        }
        method2266(false);
        method1700();
        method1564();
        method1547(arg0, arg1, arg2, arg3, true);
        int var7 = field669;
        int var8 = field479;
        int var9 = field671;
        int var10 = field672;
        class394.method6286(var7, var8, var7 + var9, var8 + var10);
        class198.method3456();
        if (!field615) {
            int var11 = field476;
            if (field493 / 256 > var11) {
                var11 = field493 / 256;
            }
            if (field656[4] && field609[4] + 128 > var11) {
                var11 = field609[4] + 128;
            }
            int var12 = field445 & 0x7FF;
            int var13 = Statics.field66;
            int var14 = Statics.field3533;
            int var15 = Statics.field3553;
            int var16 = var11 * 3 + 600;
            int var18 = var10 - 334;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 100) {
                var18 = 100;
            }
            int var19 = (field449 - field663) * var18 / 100 + field663;
            int var20 = var16 * var19 / 256;
            int var22 = 2048 - var11 & 0x7FF;
            int var23 = 2048 - var12 & 0x7FF;
            int var24 = 0;
            int var25 = 0;
            int var26 = var20;
            if (var22 != 0) {
                int var27 = class198.field2266[var22];
                int var28 = class198.field2273[var22];
                int var29 = var25 * var28 - var20 * var27 >> 16;
                var26 = var25 * var27 + var20 * var28 >> 16;
                var25 = var29;
            }
            if (var23 != 0) {
                int var30 = class198.field2266[var23];
                int var31 = class198.field2273[var23];
                int var32 = var24 * var31 + var26 * var30 >> 16;
                var26 = var26 * var31 - var24 * var30 >> 16;
                var24 = var32;
            }
            Statics.field934 = var13 - var24;
            Statics.field3924 = var14 - var25;
            Statics.field4012 = var15 - var26;
            Statics.field1398 = var11;
            Statics.field1400 = var12;
            if (field482 == 1 && field577 >= 2 && field452 % 50 == 0 && (Statics.field66 >> 7 != Statics.field140.field1069 >> 7 || Statics.field3553 >> 7 != Statics.field140.field1059 >> 7)) {
                int var33 = Statics.field140.field999;
                int var34 = (Statics.field66 >> 7) + Statics.field3625;
                int var35 = (Statics.field3553 >> 7) + Statics.field1134;
                method5429(var34, var35, var33, true);
            }
        }
        int var36;
        if (field615) {
            var36 = method3355();
        } else {
            var36 = method2038();
        }
        int var37 = Statics.field934;
        int var38 = Statics.field3924;
        int var39 = Statics.field4012;
        int var40 = Statics.field1398;
        int var41 = Statics.field1400;
        for (int var42 = 0; var42 < 5; var42++) {
            if (field656[var42]) {
                int var43 = (int) (Math.random() * (double) (field437[var42] * 2 + 1) - (double) field437[var42] + Math.sin((double) field659[var42] / 100.0D * (double) field660[var42]) * (double) field609[var42]);
                if (var42 == 0) {
                    Statics.field934 += var43;
                }
                if (var42 == 1) {
                    Statics.field3924 += var43;
                }
                if (var42 == 2) {
                    Statics.field4012 += var43;
                }
                if (var42 == 3) {
                    Statics.field1400 = Statics.field1400 + var43 & 0x7FF;
                }
                if (var42 == 4) {
                    Statics.field1398 += var43;
                    if (Statics.field1398 < 128) {
                        Statics.field1398 = 128;
                    }
                    if (Statics.field1398 > 383) {
                        Statics.field1398 = 383;
                    }
                }
            }
        }
        int var44 = class20.field142;
        int var45 = class20.field145;
        if (class20.field149 != 0) {
            var44 = class20.field150;
            var45 = class20.field151;
        }
        if (var44 >= var7 && var44 < var7 + var9 && var45 >= var8 && var45 < var8 + var10) {
            int var46 = var44 - var7;
            int var47 = var45 - var8;
            class208.field2488 = var46;
            class208.field2476 = var47;
            class208.field2490 = true;
            class208.field2484 = 0;
            class208.field2477 = false;
        } else {
            class208.method1690();
        }
        method4372();
        class394.method6272(var7, var8, var9, var10, 0);
        method4372();
        int var48 = class198.field2262;
        class198.field2262 = field595;
        Statics.field1925.method3656(Statics.field934, Statics.field3924, Statics.field4012, Statics.field1398, Statics.field1400, var36);
        class198.field2262 = var48;
        method4372();
        Statics.field1925.method3628();
        field650 = 0;
        boolean var49 = false;
        int var50 = -1;
        int var51 = -1;
        int var52 = class83.field1172;
        int[] var53 = class83.field1178;
        for (int var54 = 0; var54 < field685 + var52; var54++) {
            class72 var55;
            if (var54 < var52) {
                var55 = field524[var53[var54]];
                if (field535 == var53[var54]) {
                    var49 = true;
                    var50 = var54;
                    continue;
                }
                if (Statics.field140 == var55) {
                    var51 = var54;
                    continue;
                }
            } else {
                var55 = field567[field450[var54 - var52]];
            }
            method3880(var55, var54, var7, var8, var9, var10);
        }
        if (field527 && var51 != -1) {
            method3880(Statics.field140, var51, var7, var8, var9, var10);
        }
        if (var49) {
            method3880(field524[field535], var50, var7, var8, var9, var10);
        }
        for (int var56 = 0; var56 < field650; var56++) {
            int var57 = field496[var56];
            int var58 = field497[var56];
            int var59 = field499[var56];
            int var60 = field442[var56];
            boolean var61 = true;
            while (var61) {
                var61 = false;
                for (int var62 = 0; var62 < var56; var62++) {
                    if (var58 + 2 > field497[var62] - field442[var62] && var58 - var60 < field497[var62] + 2 && var57 - var59 < field499[var62] + field496[var62] && var57 + var59 > field496[var62] - field499[var62] && field497[var62] - field442[var62] < var58) {
                        var58 = field497[var62] - field442[var62];
                        var61 = true;
                    }
                }
            }
            field506 = field496[var56];
            field507 = field497[var56] = var58;
            String var63 = field503[var56];
            if (field572 == 0) {
                int var64 = 16776960;
                if (field500[var56] < 6) {
                    var64 = field627[field500[var56]];
                }
                if (field500[var56] == 6) {
                    var64 = field505 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field500[var56] == 7) {
                    var64 = field505 % 20 < 10 ? 255 : 65535;
                }
                if (field500[var56] == 8) {
                    var64 = field505 % 20 < 10 ? 45056 : 8454016;
                }
                if (field500[var56] == 9) {
                    int var65 = 150 - field664[var56];
                    if (var65 < 50) {
                        var64 = var65 * 1280 + 16711680;
                    } else if (var65 < 100) {
                        var64 = 16776960 - (var65 - 50) * 327680;
                    } else if (var65 < 150) {
                        var64 = (var65 - 100) * 5 + 65280;
                    }
                }
                if (field500[var56] == 10) {
                    int var66 = 150 - field664[var56];
                    if (var66 < 50) {
                        var64 = var66 * 5 + 16711680;
                    } else if (var66 < 100) {
                        var64 = 16711935 - (var66 - 50) * 327680;
                    } else if (var66 < 150) {
                        var64 = (var66 - 100) * 327680 + 255 - (var66 - 100) * 5;
                    }
                }
                if (field500[var56] == 11) {
                    int var67 = 150 - field664[var56];
                    if (var67 < 50) {
                        var64 = 16777215 - var67 * 327685;
                    } else if (var67 < 100) {
                        var64 = (var67 - 50) * 327685 + 65280;
                    } else if (var67 < 150) {
                        var64 = 16777215 - (var67 - 100) * 327680;
                    }
                }
                if (field662[var56] == 0) {
                    Statics.field1468.method4955(var63, field506 + var7, field507 + var8, var64, 0);
                }
                if (field662[var56] == 1) {
                    Statics.field1468.method4896(var63, field506 + var7, field507 + var8, var64, 0, field505);
                }
                if (field662[var56] == 2) {
                    Statics.field1468.method4910(var63, field506 + var7, field507 + var8, var64, 0, field505);
                }
                if (field662[var56] == 3) {
                    Statics.field1468.method4898(var63, field506 + var7, field507 + var8, var64, 0, field505, 150 - field664[var56]);
                }
                if (field662[var56] == 4) {
                    int var68 = (150 - field664[var56]) * (Statics.field1468.method4887(var63) + 100) / 150;
                    class394.method6265(field506 + var7 - 50, var8, field506 + var7 + 50, var8 + var10);
                    Statics.field1468.method4891(var63, field506 + var7 + 50 - var68, field507 + var8, var64, 0);
                    class394.method6286(var7, var8, var7 + var9, var8 + var10);
                }
                if (field662[var56] == 5) {
                    int var69 = 150 - field664[var56];
                    int var70 = 0;
                    if (var69 < 25) {
                        var70 = var69 - 25;
                    } else if (var69 > 125) {
                        var70 = var69 - 125;
                    }
                    class394.method6265(var7, field507 + var8 - Statics.field1468.field3738 - 1, var7 + var9, field507 + var8 + 5);
                    Statics.field1468.method4955(var63, field506 + var7, field507 + var8 + var70, var64, 0);
                    class394.method6286(var7, var8, var7 + var9, var8 + var10);
                }
            } else {
                Statics.field1468.method4955(var63, field506 + var7, field507 + var8, 16776960, 0);
            }
        }
        if (field424 == 2) {
            method5175((field477 - Statics.field3625 << 7) + field430, (field454 - Statics.field1134 << 7) + field553, field429 * 2);
            if (field506 > -1 && field452 % 20 < 10) {
                Statics.field1677[0].method6403(field506 + var7 - 12, field507 + var8 - 28);
            }
        }
        ((class205) Statics.field2269).method3745(field556);
        field522 = 0;
        int var71 = (Statics.field140.field1069 >> 7) + Statics.field3625;
        int var72 = (Statics.field140.field1059 >> 7) + Statics.field1134;
        if (var71 >= 3053 && var71 <= 3156 && var72 >= 3056 && var72 <= 3136) {
            field522 = 1;
        }
        if (var71 >= 3072 && var71 <= 3118 && var72 >= 9492 && var72 <= 9535) {
            field522 = 1;
        }
        if (field522 == 1 && var71 >= 3139 && var71 <= 3199 && var72 >= 3008 && var72 <= 3062) {
            field522 = 0;
        }
        Statics.field934 = var37;
        Statics.field3924 = var38;
        Statics.field4012 = var39;
        Statics.field1398 = var40;
        Statics.field1400 = var41;
        if (field415) {
            byte var73 = 0;
            int var74 = class278.field3607 + class278.field3599 + var73;
            if (var74 == 0) {
                field415 = false;
            }
        }
        if (field415) {
            class394.method6272(var7, var8, var9, var10, 0);
            method108(class270.field3237, false);
        }
    }

    @ObfuscatedName("ac.gj(IIIIZI)V")
    public static final void method1547(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        int var6;
        if (var5 < 0) {
            var6 = field661;
        } else if (var5 >= 100) {
            var6 = field632;
        } else {
            var6 = (field632 - field661) * var5 / 100 + field661;
        }
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field667) {
            short var8 = field667;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field543) {
                var6 = field543;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class394.method6302();
                    class394.method6272(arg0, arg1, var10, arg3, -16777216);
                    class394.method6272(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field668) {
            short var11 = field668;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field473) {
                var6 = field473;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class394.method6302();
                    class394.method6272(arg0, arg1, arg2, var13, -16777216);
                    class394.method6272(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        field595 = arg3 * var6 / 334;
        if (field671 != arg2 || field672 != arg3) {
            int[] var14 = new int[9];
            for (int var15 = 0; var15 < var14.length; var15++) {
                int var16 = var15 * 32 + 128 + 15;
                int var17 = var16 * 3 + 600;
                int var19 = class198.field2266[var16];
                int var20 = arg3 - 334;
                if (var20 < 0) {
                    var20 = 0;
                } else if (var20 > 100) {
                    var20 = 100;
                }
                int var21 = (field449 - field663) * var20 / 100 + field663;
                int var22 = var17 * var21 / 256;
                var14[var15] = var19 * var22 >> 16;
            }
            class200.method3573(var14, 500, 800, arg2 * 334 / arg3, 334);
        }
        field669 = arg0;
        field479 = arg1;
        field671 = arg2;
        field672 = arg3;
    }

    @ObfuscatedName("co.gw(I)V")
    public static void method2037() {
        if (field527) {
            method819(Statics.field140, false);
        }
    }

    @ObfuscatedName("ap.gy(Lbb;ZI)V")
    public static void method819(class70 arg0, boolean arg1) {
        if (arg0 == null || !arg0.method1738() || arg0.field998) {
            return;
        }
        arg0.field995 = false;
        if ((field409 && class83.field1172 > 50 || class83.field1172 > 200) && arg1 && arg0.field1050 == arg0.field1030) {
            arg0.field995 = true;
        }
        int var2 = arg0.field1069 >> 7;
        int var3 = arg0.field1059 >> 7;
        if (var2 < 0 || var2 >= 104 || var3 < 0 || var3 >= 104) {
            return;
        }
        long var4 = class208.method3213(0, 0, 0, false, arg0.field1000);
        if (arg0.field981 != null && field452 >= arg0.field986 && field452 < arg0.field987) {
            arg0.field995 = false;
            arg0.field985 = Statics.method2240(arg0.field1069, arg0.field1059, Statics.field3652);
            arg0.field1025 = field452;
            Statics.field1925.method3544(Statics.field3652, arg0.field1069, arg0.field1059, arg0.field985, 60, arg0, arg0.field1022, var4, arg0.field978, arg0.field993, arg0.field994, arg0.field989);
            return;
        }
        if ((arg0.field1069 & 0x7F) == 64 && (arg0.field1059 & 0x7F) == 64) {
            if (field505 == field502[var2][var3]) {
                return;
            }
            field502[var2][var3] = field505;
        }
        arg0.field985 = Statics.method2240(arg0.field1069, arg0.field1059, Statics.field3652);
        arg0.field1025 = field452;
        Statics.field1925.method3549(Statics.field3652, arg0.field1069, arg0.field1059, arg0.field985, 60, arg0, arg0.field1022, var4, arg0.field1023);
    }

    @ObfuscatedName("dt.gf(ZB)V")
    public static final void method2266(boolean arg0) {
        for (int var1 = 0; var1 < field685; var1++) {
            class78 var2 = field567[field450[var1]];
            if (var2 != null && var2.method1738() && var2.field1132.field1641 == arg0 && var2.field1132.method2515()) {
                int var3 = var2.field1069 >> 7;
                int var4 = var2.field1059 >> 7;
                if (var3 >= 0 && var3 < 104 && var4 >= 0 && var4 < 104) {
                    if (var2.field1024 == 1 && (var2.field1069 & 0x7F) == 64 && (var2.field1059 & 0x7F) == 64) {
                        if (field505 == field502[var3][var4]) {
                            continue;
                        }
                        field502[var3][var4] = field505;
                    }
                    long var5 = class208.method3213(0, 0, 1, !var2.field1132.field1649, field450[var1]);
                    var2.field1025 = field452;
                    Statics.field1925.method3549(Statics.field3652, var2.field1069, var2.field1059, Statics.method2240(var2.field1069 + (var2.field1024 * 64 - 64), var2.field1059 + (var2.field1024 * 64 - 64), Statics.field3652), var2.field1024 * 64 - 64 + 60, var2, var2.field1022, var5, var2.field1023);
                }
            }
        }
    }

    @ObfuscatedName("bu.ga(B)V")
    public static final void method1700() {
        for (class57 var0 = (class57) field538.method4721(); var0 != null; var0 = (class57) field538.method4712()) {
            if (Statics.field3652 != var0.field837 || field452 > var0.field844) {
                var0.method5447();
            } else if (field452 >= var0.field839) {
                if (var0.field856 > 0) {
                    class78 var1 = field567[var0.field856 - 1];
                    if (var1 != null && var1.field1069 >= 0 && var1.field1069 < 13312 && var1.field1059 >= 0 && var1.field1059 < 13312) {
                        var0.method1606(var1.field1069, var1.field1059, Statics.method2240(var1.field1069, var1.field1059, var0.field837) - var0.field846, field452);
                    }
                }
                if (var0.field856 < 0) {
                    int var2 = -var0.field856 - 1;
                    class70 var3;
                    if (field665 == var2) {
                        var3 = Statics.field140;
                    } else {
                        var3 = field524[var2];
                    }
                    if (var3 != null && var3.field1069 >= 0 && var3.field1069 < 13312 && var3.field1059 >= 0 && var3.field1059 < 13312) {
                        var0.method1606(var3.field1069, var3.field1059, Statics.method2240(var3.field1069, var3.field1059, var0.field837) - var0.field846, field452);
                    }
                }
                var0.method1607(field556);
                Statics.field1925.method3549(Statics.field3652, (int) var0.field832, (int) var0.field845, (int) var0.field833, 60, var0, var0.field852, -1L, false);
            }
        }
    }

    @ObfuscatedName("bt.gv(I)V")
    public static final void method1564() {
        for (class52 var0 = (class52) field539.method4721(); var0 != null; var0 = (class52) field539.method4712()) {
            if (Statics.field3652 != var0.field760 || var0.field767) {
                var0.method5447();
            } else if (field452 >= var0.field759) {
                var0.method1554(field556);
                if (var0.field767) {
                    var0.method5447();
                } else {
                    Statics.field1925.method3549(var0.field760, var0.field758, var0.field762, var0.field763, 60, var0, 0, -1L, false);
                }
            }
        }
    }

    @ObfuscatedName("co.gm(I)I")
    public static final int method2038() {
        if (Statics.field308.field1113) {
            return Statics.field3652;
        }
        int var0 = 3;
        if (Statics.field1398 < 310) {
            int var1;
            int var2;
            if (field482 == 1) {
                var1 = Statics.field66 >> 7;
                var2 = Statics.field3553 >> 7;
            } else {
                var1 = Statics.field140.field1069 >> 7;
                var2 = Statics.field140.field1059 >> 7;
            }
            int var3 = Statics.field934 >> 7;
            int var4 = Statics.field4012 >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
                return Statics.field3652;
            }
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field3652;
            }
            if ((class62.field901[Statics.field3652][var3][var4] & 0x4) != 0) {
                var0 = Statics.field3652;
            }
            int var5;
            if (var1 > var3) {
                var5 = var1 - var3;
            } else {
                var5 = var3 - var1;
            }
            int var6;
            if (var2 > var4) {
                var6 = var2 - var4;
            } else {
                var6 = var4 - var2;
            }
            if (var5 > var6) {
                int var7 = var6 * 65536 / var5;
                int var8 = 32768;
                while (var1 != var3) {
                    if (var3 < var1) {
                        var3++;
                    } else if (var3 > var1) {
                        var3--;
                    }
                    if ((class62.field901[Statics.field3652][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field3652;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var4 < var2) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class62.field901[Statics.field3652][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field3652;
                        }
                    }
                }
            } else if (var6 > 0) {
                int var9 = var5 * 65536 / var6;
                int var10 = 32768;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var4 > var2) {
                        var4--;
                    }
                    if ((class62.field901[Statics.field3652][var3][var4] & 0x4) != 0) {
                        var0 = Statics.field3652;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var3 < var1) {
                            var3++;
                        } else if (var3 > var1) {
                            var3--;
                        }
                        if ((class62.field901[Statics.field3652][var3][var4] & 0x4) != 0) {
                            var0 = Statics.field3652;
                        }
                    }
                }
            }
        }
        if (Statics.field140.field1069 >= 0 && Statics.field140.field1059 >= 0 && Statics.field140.field1069 < 13312 && Statics.field140.field1059 < 13312) {
            if ((class62.field901[Statics.field3652][Statics.field140.field1069 >> 7][Statics.field140.field1059 >> 7] & 0x4) != 0) {
                var0 = Statics.field3652;
            }
            return var0;
        } else {
            return Statics.field3652;
        }
    }

    @ObfuscatedName("gc.gt(I)I")
    public static final int method3355() {
        if (Statics.field308.field1113) {
            return Statics.field3652;
        } else {
            int var0 = Statics.method2240(Statics.field934, Statics.field4012, Statics.field3652);
            return var0 - Statics.field3924 >= 800 || (class62.field901[Statics.field3652][Statics.field934 >> 7][Statics.field4012 >> 7] & 0x4) == 0 ? 3 : Statics.field3652;
        }
    }

    @ObfuscatedName("jc.gl(B)Z")
    public static boolean method4371() {
        return (field427 & 0x4) != 0;
    }

    @ObfuscatedName("ay.gd(B)Z")
    public static boolean method801() {
        return (field427 & 0x8) != 0;
    }

    @ObfuscatedName("hf.hf(Lbx;IIIIIB)V")
    public static final void method3880(class72 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method1738()) {
            return;
        }
        if (arg0 instanceof class78) {
            class148 var6 = ((class78) arg0).field1132;
            if (var6.field1646 != null) {
                var6 = var6.method2514();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class83.field1172;
        int[] var8 = class83.field1178;
        byte var9 = 0;
        if (arg1 < var7 && field452 == arg0.field1025) {
            class70 var10 = (class70) arg0;
            boolean var11;
            if (field427 == 0) {
                var11 = false;
            } else if (Statics.field140 == var10) {
                var11 = method801();
            } else {
                boolean var12 = method4371();
                if (!var12) {
                    boolean var13 = (field427 & 0x1) != 0;
                    var12 = var13 && var10.method1725();
                }
                boolean var14 = var12;
                if (!var12) {
                    boolean var15 = (field427 & 0x2) != 0;
                    var14 = var15 && var10.method1728();
                }
                var11 = var14;
            }
            if (var11) {
                class70 var16 = (class70) arg0;
                if (arg1 < var7) {
                    method4182(arg0, arg0.field1071 + 15);
                    class303 var17 = (class303) field495.get(class361.field4093);
                    byte var18 = 9;
                    var17.method4955(var16.field980.method6520(), field506 + arg2, field507 + arg3 - var18, 16777215, 0);
                    var9 = 18;
                }
            }
        }
        int var19 = -2;
        if (!arg0.field1078.method4821()) {
            method4182(arg0, arg0.field1071 + 15);
            for (class77 var20 = (class77) arg0.field1078.method4758(); var20 != null; var20 = (class77) arg0.field1078.method4760()) {
                class73 var21 = var20.method1854(field452);
                if (var21 != null) {
                    class144 var22 = var20.field1129;
                    class398 var23 = var22.method2475();
                    class398 var24 = var22.method2486();
                    int var25 = 0;
                    int var26;
                    if (var23 == null || var24 == null) {
                        var26 = var22.field1590;
                    } else {
                        if (var22.field1592 * 2 < var24.field4270) {
                            var25 = var22.field1592;
                        }
                        var26 = var24.field4270 - var25 * 2;
                    }
                    int var27 = 255;
                    boolean var28 = true;
                    int var29 = field452 - var21.field1081;
                    int var30 = var21.field1083 * var26 / var22.field1590;
                    int var33;
                    if (var21.field1084 > var29) {
                        int var31 = var22.field1586 == 0 ? 0 : var29 / var22.field1586 * var22.field1586;
                        int var32 = var21.field1082 * var26 / var22.field1590;
                        var33 = (var30 - var32) * var31 / var21.field1084 + var32;
                    } else {
                        var33 = var30;
                        int var34 = var21.field1084 + var22.field1587 - var29;
                        if (var22.field1584 >= 0) {
                            var27 = (var34 << 8) / (var22.field1587 - var22.field1584);
                        }
                    }
                    if (var21.field1083 > 0 && var33 < 1) {
                        var33 = 1;
                    }
                    if (var23 == null || var24 == null) {
                        var19 += 5;
                        if (field506 > -1) {
                            int var40 = field506 + arg2 - (var26 >> 1);
                            int var41 = field507 + arg3 - var19;
                            class394.method6272(var40, var41, var33, 5, 65280);
                            class394.method6272(var33 + var40, var41, var26 - var33, 5, 16711680);
                        }
                        var19 += 2;
                    } else {
                        int var35;
                        if (var26 == var33) {
                            var35 = var25 * 2 + var33;
                        } else {
                            var35 = var25 + var33;
                        }
                        int var36 = var23.field4271;
                        var19 += var36;
                        int var37 = field506 + arg2 - (var26 >> 1);
                        int var38 = field507 + arg3 - var19;
                        int var39 = var37 - var25;
                        if (var27 >= 0 && var27 < 255) {
                            var23.method6384(var39, var38, var27);
                            class394.method6265(var39, var38, var35 + var39, var36 + var38);
                            var24.method6384(var39, var38, var27);
                        } else {
                            var23.method6403(var39, var38);
                            class394.method6265(var39, var38, var35 + var39, var36 + var38);
                            var24.method6403(var39, var38);
                        }
                        class394.method6286(arg2, arg3, arg2 + arg4, arg3 + arg5);
                        var19 += 2;
                    }
                } else if (var20.method1847()) {
                    var20.method5447();
                }
            }
        }
        if (var19 == -2) {
            var19 += 7;
        }
        int var42 = var9 + var19;
        if (arg1 < var7) {
            class70 var43 = (class70) arg0;
            if (var43.field998) {
                return;
            }
            if (var43.field996 != -1 || var43.field992 != -1) {
                method4182(arg0, arg0.field1071 + 15);
                if (field506 > -1) {
                    if (var43.field996 != -1) {
                        var42 += 25;
                        Statics.field1230[var43.field996].method6403(field506 + arg2 - 12, field507 + arg3 - var42);
                    }
                    if (var43.field992 != -1) {
                        var42 += 25;
                        Statics.field3211[var43.field992].method6403(field506 + arg2 - 12, field507 + arg3 - var42);
                    }
                }
            }
            if (arg1 >= 0 && field424 == 10 && field426 == var8[arg1]) {
                method4182(arg0, arg0.field1071 + 15);
                if (field506 > -1) {
                    int var44 = Statics.field1677[1].field4271 + var42;
                    Statics.field1677[1].method6403(field506 + arg2 - 12, field507 + arg3 - var44);
                }
            }
        } else {
            class148 var45 = ((class78) arg0).field1132;
            if (var45.field1646 != null) {
                var45 = var45.method2514();
            }
            if (var45.field1644 >= 0 && var45.field1644 < Statics.field3211.length) {
                method4182(arg0, arg0.field1071 + 15);
                if (field506 > -1) {
                    Statics.field3211[var45.field1644].method6403(field506 + arg2 - 12, field507 + arg3 - 30);
                }
            }
            if (field424 == 1 && field425 == field450[arg1 - var7] && field452 % 20 < 10) {
                method4182(arg0, arg0.field1071 + 15);
                if (field506 > -1) {
                    Statics.field1677[0].method6403(field506 + arg2 - 12, field507 + arg3 - 28);
                }
            }
        }
        if (arg0.field1034 != null && (arg1 >= var7 || !arg0.field1080 && (field670 == 4 || !arg0.field1035 && (field670 == 0 || field670 == 3 || field670 == 1 && ((class70) arg0).method1725())))) {
            method4182(arg0, arg0.field1071);
            if (field506 > -1 && field650 < field579) {
                field499[field650] = Statics.field1468.method4887(arg0.field1034) / 2;
                field442[field650] = Statics.field1468.field3738;
                field496[field650] = field506;
                field497[field650] = field507;
                field500[field650] = arg0.field1038;
                field662[field650] = arg0.field1039;
                field664[field650] = arg0.field1037;
                field503[field650] = arg0.field1034;
                field650++;
            }
        }
        for (int var46 = 0; var46 < 4; var46++) {
            int var47 = arg0.field1026[var46];
            int var48 = arg0.field1036[var46];
            class155 var49 = null;
            int var50 = 0;
            if (var48 >= 0) {
                if (var47 <= field452) {
                    continue;
                }
                var49 = class155.method2725(arg0.field1036[var46]);
                var50 = var49.field1717;
                if (var49 != null && var49.field1730 != null) {
                    var49 = var49.method2638();
                    if (var49 == null) {
                        arg0.field1026[var46] = -1;
                        continue;
                    }
                }
            } else if (var47 < 0) {
                continue;
            }
            int var51 = arg0.field1041[var46];
            class155 var52 = null;
            if (var51 >= 0) {
                var52 = class155.method2725(var51);
                if (var52 != null && var52.field1730 != null) {
                    var52 = var52.method2638();
                }
            }
            if (var47 - var50 <= field452) {
                if (var49 == null) {
                    arg0.field1026[var46] = -1;
                } else {
                    method4182(arg0, arg0.field1071 / 2);
                    if (field506 > -1) {
                        if (var46 == 1) {
                            field507 -= 20;
                        }
                        if (var46 == 2) {
                            field506 -= 15;
                            field507 -= 10;
                        }
                        if (var46 == 3) {
                            field506 += 15;
                            field507 -= 10;
                        }
                        Object var53 = null;
                        Object var54 = null;
                        Object var55 = null;
                        Object var56 = null;
                        int var57 = 0;
                        int var58 = 0;
                        int var59 = 0;
                        int var60 = 0;
                        int var61 = 0;
                        int var62 = 0;
                        int var63 = 0;
                        int var64 = 0;
                        class398 var65 = null;
                        class398 var66 = null;
                        class398 var67 = null;
                        class398 var68 = null;
                        int var69 = 0;
                        int var70 = 0;
                        int var71 = 0;
                        int var72 = 0;
                        int var73 = 0;
                        int var74 = 0;
                        int var75 = 0;
                        int var76 = 0;
                        int var77 = 0;
                        class398 var78 = var49.method2651();
                        if (var78 != null) {
                            var57 = var78.field4270;
                            int var79 = var78.field4271;
                            if (var79 > var77) {
                                var77 = var79;
                            }
                            var61 = var78.field4272;
                        }
                        class398 var80 = var49.method2641();
                        if (var80 != null) {
                            var58 = var80.field4270;
                            int var81 = var80.field4271;
                            if (var81 > var77) {
                                var77 = var81;
                            }
                            var62 = var80.field4272;
                        }
                        class398 var82 = var49.method2642();
                        if (var82 != null) {
                            var59 = var82.field4270;
                            int var83 = var82.field4271;
                            if (var83 > var77) {
                                var77 = var83;
                            }
                            var63 = var82.field4272;
                        }
                        class398 var84 = var49.method2643();
                        if (var84 != null) {
                            var60 = var84.field4270;
                            int var85 = var84.field4271;
                            if (var85 > var77) {
                                var77 = var85;
                            }
                            var64 = var84.field4272;
                        }
                        if (var52 != null) {
                            var65 = var52.method2651();
                            if (var65 != null) {
                                var69 = var65.field4270;
                                int var86 = var65.field4271;
                                if (var86 > var77) {
                                    var77 = var86;
                                }
                                var73 = var65.field4272;
                            }
                            var66 = var52.method2641();
                            if (var66 != null) {
                                var70 = var66.field4270;
                                int var87 = var66.field4271;
                                if (var87 > var77) {
                                    var77 = var87;
                                }
                                var74 = var66.field4272;
                            }
                            var67 = var52.method2642();
                            if (var67 != null) {
                                var71 = var67.field4270;
                                int var88 = var67.field4271;
                                if (var88 > var77) {
                                    var77 = var88;
                                }
                                var75 = var67.field4272;
                            }
                            var68 = var52.method2643();
                            if (var68 != null) {
                                var72 = var68.field4270;
                                int var89 = var68.field4271;
                                if (var89 > var77) {
                                    var77 = var89;
                                }
                                var76 = var68.field4272;
                            }
                        }
                        class302 var90 = var49.method2644();
                        if (var90 == null) {
                            var90 = Statics.field398;
                        }
                        class302 var91;
                        if (var52 == null) {
                            var91 = Statics.field398;
                        } else {
                            var91 = var52.method2644();
                            if (var91 == null) {
                                var91 = Statics.field398;
                            }
                        }
                        Object var92 = null;
                        String var93 = null;
                        boolean var94 = false;
                        int var95 = 0;
                        String var96 = var49.method2639(arg0.field1048[var46]);
                        int var97 = var90.method4887(var96);
                        if (var52 != null) {
                            var93 = var52.method2639(arg0.field1045[var46]);
                            var95 = var91.method4887(var93);
                        }
                        int var98 = 0;
                        int var99 = 0;
                        if (var58 > 0) {
                            if (var82 == null && var84 == null) {
                                var98 = 1;
                            } else {
                                var98 = var97 / var58 + 1;
                            }
                        }
                        if (var52 != null && var70 > 0) {
                            if (var67 == null && var68 == null) {
                                var99 = 1;
                            } else {
                                var99 = var95 / var70 + 1;
                            }
                        }
                        int var100 = 0;
                        int var101 = var100;
                        if (var57 > 0) {
                            var100 += var57;
                        }
                        var100 += 2;
                        int var102 = var100;
                        if (var59 > 0) {
                            var100 += var59;
                        }
                        int var103 = var100;
                        int var104 = var100;
                        int var106;
                        if (var58 > 0) {
                            int var105 = var58 * var98;
                            var106 = var100 + var105;
                            var104 = (var105 - var97) / 2 + var100;
                        } else {
                            var106 = var97 + var100;
                        }
                        int var107 = var106;
                        if (var60 > 0) {
                            var106 += var60;
                        }
                        int var108 = 0;
                        int var109 = 0;
                        int var110 = 0;
                        int var111 = 0;
                        int var112 = 0;
                        if (var52 != null) {
                            var106 += 2;
                            var108 = var106;
                            if (var69 > 0) {
                                var106 += var69;
                            }
                            var106 += 2;
                            var109 = var106;
                            if (var71 > 0) {
                                var106 += var71;
                            }
                            var110 = var106;
                            var112 = var106;
                            if (var70 > 0) {
                                int var113 = var70 * var99;
                                var106 += var113;
                                var112 += (var113 - var95) / 2;
                            } else {
                                var106 += var95;
                            }
                            var111 = var106;
                            if (var72 > 0) {
                                var106 += var72;
                            }
                        }
                        int var114 = arg0.field1026[var46] - field452;
                        int var115 = var49.field1722 - var49.field1722 * var114 / var49.field1717;
                        int var116 = var49.field1723 * var114 / var49.field1717 + -var49.field1723;
                        int var117 = field506 + arg2 - (var106 >> 1) + var115;
                        int var118 = field507 + arg3 - 12 + var116;
                        int var119 = var118;
                        int var120 = var77 + var118;
                        int var121 = var49.field1727 + var118 + 15;
                        int var122 = var121 - var90.field3739;
                        int var123 = var90.field3740 + var121;
                        if (var122 < var118) {
                            var119 = var122;
                        }
                        if (var123 > var120) {
                            var120 = var123;
                        }
                        int var124 = 0;
                        if (var52 != null) {
                            var124 = var52.field1727 + var118 + 15;
                            int var125 = var124 - var91.field3739;
                            int var126 = var91.field3740 + var124;
                            if (var125 < var119) {
                                ;
                            }
                            if (var126 > var120) {
                                ;
                            }
                        }
                        int var129 = 255;
                        if (var49.field1707 >= 0) {
                            var129 = (var114 << 8) / (var49.field1717 - var49.field1707);
                        }
                        if (var129 >= 0 && var129 < 255) {
                            if (var78 != null) {
                                var78.method6384(var101 + var117 - var61, var118, var129);
                            }
                            if (var82 != null) {
                                var82.method6384(var102 + var117 - var63, var118, var129);
                            }
                            if (var80 != null) {
                                for (int var130 = 0; var130 < var98; var130++) {
                                    var80.method6384(var58 * var130 + (var103 + var117 - var62), var118, var129);
                                }
                            }
                            if (var84 != null) {
                                var84.method6384(var107 + var117 - var64, var118, var129);
                            }
                            var90.method4903(var96, var104 + var117, var121, var49.field1724, 0, var129);
                            if (var52 != null) {
                                if (var65 != null) {
                                    var65.method6384(var108 + var117 - var73, var118, var129);
                                }
                                if (var67 != null) {
                                    var67.method6384(var109 + var117 - var75, var118, var129);
                                }
                                if (var66 != null) {
                                    for (int var131 = 0; var131 < var99; var131++) {
                                        var66.method6384(var70 * var131 + (var110 + var117 - var74), var118, var129);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method6384(var111 + var117 - var76, var118, var129);
                                }
                                var91.method4903(var93, var112 + var117, var124, var52.field1724, 0, var129);
                            }
                        } else {
                            if (var78 != null) {
                                var78.method6403(var101 + var117 - var61, var118);
                            }
                            if (var82 != null) {
                                var82.method6403(var102 + var117 - var63, var118);
                            }
                            if (var80 != null) {
                                for (int var132 = 0; var132 < var98; var132++) {
                                    var80.method6403(var58 * var132 + (var103 + var117 - var62), var118);
                                }
                            }
                            if (var84 != null) {
                                var84.method6403(var107 + var117 - var64, var118);
                            }
                            var90.method4891(var96, var104 + var117, var121, var49.field1724 | 0xFF000000, 0);
                            if (var52 != null) {
                                if (var65 != null) {
                                    var65.method6403(var108 + var117 - var73, var118);
                                }
                                if (var67 != null) {
                                    var67.method6403(var109 + var117 - var75, var118);
                                }
                                if (var66 != null) {
                                    for (int var133 = 0; var133 < var99; var133++) {
                                        var66.method6403(var70 * var133 + (var110 + var117 - var74), var118);
                                    }
                                }
                                if (var68 != null) {
                                    var68.method6403(var111 + var117 - var76, var118);
                                }
                                var91.method4891(var93, var112 + var117, var124, var52.field1724 | 0xFF000000, 0);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("iu.he(Lbx;II)V")
    public static final void method4182(class72 arg0, int arg1) {
        method5175(arg0.field1069, arg0.field1059, arg1);
    }

    @ObfuscatedName("lc.ho(IIII)V")
    public static final void method5175(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field506 = -1;
            field507 = -1;
            return;
        }
        int var3 = Statics.method2240(arg0, arg1, Statics.field3652) - arg2;
        int var4 = arg0 - Statics.field934;
        int var5 = var3 - Statics.field3924;
        int var6 = arg1 - Statics.field4012;
        int var7 = class198.field2266[Statics.field1398];
        int var8 = class198.field2273[Statics.field1398];
        int var9 = class198.field2266[Statics.field1400];
        int var10 = class198.field2273[Statics.field1400];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field506 = field595 * var11 / var15 + field671 / 2;
            field507 = field595 * var14 / var15 + field672 / 2;
        } else {
            field506 = -1;
            field507 = -1;
        }
    }

    @ObfuscatedName("it.hp(ZLnu;I)V")
    public static final void method4164(boolean arg0, class384 arg1) {
        field481 = arg0;
        if (!field481) {
            int var2 = arg1.method5997();
            int var3 = arg1.method6086();
            int var4 = arg1.method6053();
            Statics.field370 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var6 = 0; var6 < 4; var6++) {
                    Statics.field370[var5][var6] = arg1.method6182();
                }
            }
            Statics.field2821 = new int[var4];
            Statics.field3110 = new int[var4];
            Statics.field1263 = new int[var4];
            Statics.field2673 = new byte[var4][];
            Statics.field4011 = new byte[var4][];
            boolean var7 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var7 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var7 = true;
            }
            int var8 = 0;
            for (int var9 = (var3 - 6) / 8; var9 <= (var3 + 6) / 8; var9++) {
                for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                    int var11 = (var9 << 8) + var10;
                    if (!var7 || var10 != 49 && var10 != 149 && var10 != 147 && var9 != 50 && (var9 != 49 || var10 != 47)) {
                        Statics.field2821[var8] = var11;
                        Statics.field3110[var8] = Statics.field2277.method4474("m" + var9 + "_" + var10);
                        Statics.field1263[var8] = Statics.field2277.method4474("l" + var9 + "_" + var10);
                        var8++;
                    }
                }
            }
            method2096(var3, var2, true);
            return;
        }
        int var12 = arg1.method5998();
        boolean var13 = arg1.method5989() == 1;
        int var14 = arg1.method6053();
        int var15 = arg1.method6053();
        arg1.method5902();
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = arg1.method5903(1);
                    if (var19 == 1) {
                        field467[var16][var17][var18] = arg1.method5903(26);
                    } else {
                        field467[var16][var17][var18] = -1;
                    }
                }
            }
        }
        arg1.method5923();
        Statics.field370 = new int[var15][4];
        for (int var20 = 0; var20 < var15; var20++) {
            for (int var21 = 0; var21 < 4; var21++) {
                Statics.field370[var20][var21] = arg1.method6182();
            }
        }
        Statics.field2821 = new int[var15];
        Statics.field3110 = new int[var15];
        Statics.field1263 = new int[var15];
        Statics.field2673 = new byte[var15][];
        Statics.field4011 = new byte[var15][];
        int var22 = 0;
        for (int var23 = 0; var23 < 4; var23++) {
            for (int var24 = 0; var24 < 13; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    int var26 = field467[var23][var24][var25];
                    if (var26 != -1) {
                        int var27 = var26 >> 14 & 0x3FF;
                        int var28 = var26 >> 3 & 0x7FF;
                        int var29 = (var27 / 8 << 8) + var28 / 8;
                        for (int var30 = 0; var30 < var22; var30++) {
                            if (Statics.field2821[var30] == var29) {
                                var29 = -1;
                                break;
                            }
                        }
                        if (var29 != -1) {
                            Statics.field2821[var22] = var29;
                            int var31 = var29 >> 8 & 0xFF;
                            int var32 = var29 & 0xFF;
                            Statics.field3110[var22] = Statics.field2277.method4474("m" + var31 + "_" + var32);
                            Statics.field1263[var22] = Statics.field2277.method4474("l" + var31 + "_" + var32);
                            var22++;
                        }
                    }
                }
            }
        }
        method2096(var12, var14, !var13);
    }

    @ObfuscatedName("ck.ha(IIZI)V")
    public static final void method2096(int arg0, int arg1, boolean arg2) {
        if (arg2 && Statics.field137 == arg0 && Statics.field27 == arg1) {
            return;
        }
        Statics.field137 = arg0;
        Statics.field27 = arg1;
        method159(25);
        method108(class270.field3237, true);
        int var3 = Statics.field3625;
        int var4 = Statics.field1134;
        Statics.field3625 = (arg0 - 6) * 8;
        Statics.field1134 = (arg1 - 6) * 8;
        int var5 = Statics.field3625 - var3;
        int var6 = Statics.field1134 - var4;
        int var7 = Statics.field3625;
        int var8 = Statics.field1134;
        for (int var9 = 0; var9 < 32768; var9++) {
            class78 var10 = field567[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < 10; var11++) {
                    var10.field1076[var11] -= var5;
                    var10.field1077[var11] -= var6;
                }
                var10.field1069 -= var5 * 128;
                var10.field1059 -= var6 * 128;
            }
        }
        for (int var12 = 0; var12 < 2048; var12++) {
            class70 var13 = field524[var12];
            if (var13 != null) {
                for (int var14 = 0; var14 < 10; var14++) {
                    var13.field1076[var14] -= var5;
                    var13.field1077[var14] -= var6;
                }
                var13.field1069 -= var5 * 128;
                var13.field1059 -= var6 * 128;
            }
        }
        byte var15 = 0;
        byte var16 = 104;
        byte var17 = 1;
        if (var5 < 0) {
            var15 = 103;
            var16 = -1;
            var17 = -1;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var6 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        for (int var21 = var15; var21 != var16; var21 += var17) {
            for (int var22 = var18; var22 != var19; var22 += var20) {
                int var23 = var5 + var21;
                int var24 = var6 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        field536[var25][var21][var22] = field536[var25][var23][var24];
                    } else {
                        field536[var25][var21][var22] = null;
                    }
                }
            }
        }
        for (class71 var26 = (class71) field537.method4721(); var26 != null; var26 = (class71) field537.method4712()) {
            var26.field1016 -= var5;
            var26.field1011 -= var6;
            if (var26.field1016 < 0 || var26.field1011 < 0 || var26.field1016 >= 104 || var26.field1011 >= 104) {
                var26.method5447();
            }
        }
        if (field644 != 0) {
            field644 -= var5;
            field597 -= var6;
        }
        field498 = 0;
        field615 = false;
        Statics.field934 -= var5 << 7;
        Statics.field4012 -= var6 << 7;
        Statics.field66 -= var5 << 7;
        Statics.field3553 -= var6 << 7;
        field639 = -1;
        field539.method4705();
        field538.method4705();
        for (int var27 = 0; var27 < 4; var27++) {
            field465[var27].method2851();
        }
    }

    @ObfuscatedName("hr.hh(ZB)V")
    public static final void method3963(boolean arg0) {
        method4372();
        field453.field1216++;
        if (field453.field1216 < 50 && !arg0) {
            return;
        }
        field453.field1216 = 0;
        if (field456 || field453.method1992() == null) {
            return;
        }
        class229 var1 = class229.method2538(class227.field2574, field453.field1205);
        field453.method1987(var1);
        try {
            field453.method1986();
        } catch (IOException var3) {
            field456 = true;
        }
    }

    @ObfuscatedName("mt.ht(IIIIII)V")
    public static final void method5708(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = Statics.field1925.method3564(arg0, arg1, arg2);
        if (var5 != 0L) {
            int var7 = Statics.field1925.method3568(arg0, arg1, arg2, var5);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg3;
            boolean var11 = var5 != 0L;
            if (var11) {
                boolean var12 = (int) (var5 >>> 16 & 0x1L) == 1;
                var11 = !var12;
            }
            if (var11) {
                var10 = arg4;
            }
            int[] var14 = Statics.field4167.field4280;
            int var15 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var16 = class208.method1867(var5);
            class156 var17 = class156.method2267(var16);
            if (var17.field1764 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 1) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var14[var15] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var14[var15 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var14[var15] = var10;
                        var14[var15 + 512] = var10;
                        var14[var15 + 1024] = var10;
                        var14[var15 + 1536] = var10;
                    } else if (var8 == 0) {
                        var14[var15] = var10;
                        var14[var15 + 1] = var10;
                        var14[var15 + 2] = var10;
                        var14[var15 + 3] = var10;
                    } else if (var8 == 1) {
                        var14[var15 + 3] = var10;
                        var14[var15 + 3 + 512] = var10;
                        var14[var15 + 3 + 1024] = var10;
                        var14[var15 + 3 + 1536] = var10;
                    } else if (var8 == 2) {
                        var14[var15 + 1536] = var10;
                        var14[var15 + 1536 + 1] = var10;
                        var14[var15 + 1536 + 2] = var10;
                        var14[var15 + 1536 + 3] = var10;
                    }
                }
            } else {
                class397 var18 = Statics.field3575[var17.field1764];
                if (var18 != null) {
                    int var19 = (var17.field1750 * 4 - var18.field4263) / 2;
                    int var20 = (var17.field1751 * 4 - var18.field4264) / 2;
                    var18.method6348(arg1 * 4 + 48 + var19, (104 - arg2 - var17.field1751) * 4 + 48 + var20);
                }
            }
        }
        long var21 = Statics.field1925.method3566(arg0, arg1, arg2);
        if (var21 != 0L) {
            int var23 = Statics.field1925.method3568(arg0, arg1, arg2, var21);
            int var24 = var23 >> 6 & 0x3;
            int var25 = var23 & 0x1F;
            int var26 = class208.method1867(var21);
            class156 var27 = class156.method2267(var26);
            if (var27.field1764 != -1) {
                class397 var28 = Statics.field3575[var27.field1764];
                if (var28 != null) {
                    int var29 = (var27.field1750 * 4 - var28.field4263) / 2;
                    int var30 = (var27.field1751 * 4 - var28.field4264) / 2;
                    var28.method6348(arg1 * 4 + 48 + var29, (104 - arg2 - var27.field1751) * 4 + 48 + var30);
                }
            } else if (var25 == 9) {
                int var31 = 15658734;
                boolean var32 = var21 != 0L;
                if (var32) {
                    boolean var33 = (int) (var21 >>> 16 & 0x1L) == 1;
                    var32 = !var33;
                }
                if (var32) {
                    var31 = 15597568;
                }
                int[] var35 = Statics.field4167.field4280;
                int var36 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
                if (var24 == 0 || var24 == 2) {
                    var35[var36 + 1536] = var31;
                    var35[var36 + 1024 + 1] = var31;
                    var35[var36 + 512 + 2] = var31;
                    var35[var36 + 3] = var31;
                } else {
                    var35[var36] = var31;
                    var35[var36 + 512 + 1] = var31;
                    var35[var36 + 1024 + 2] = var31;
                    var35[var36 + 1536 + 3] = var31;
                }
            }
        }
        long var37 = Statics.field1925.method3669(arg0, arg1, arg2);
        if (var37 == 0L) {
            return;
        }
        int var39 = class208.method1867(var37);
        class156 var40 = class156.method2267(var39);
        if (var40.field1764 == -1) {
            return;
        }
        class397 var41 = Statics.field3575[var40.field1764];
        if (var41 != null) {
            int var42 = (var40.field1750 * 4 - var41.field4263) / 2;
            int var43 = (var40.field1751 * 4 - var41.field4264) / 2;
            var41.method6348(arg1 * 4 + 48 + var42, (104 - arg2 - var40.field1751) * 4 + 48 + var43);
        }
    }

    @ObfuscatedName("client.hl(Lcj;B)Z")
    public final boolean method847(class86 arg0) {
        class330 var2 = arg0.method1992();
        class384 var3 = arg0.field1201;
        if (var2 == null) {
            return false;
        }
        try {
            if (arg0.field1206 == null) {
                if (arg0.field1211) {
                    if (!var2.method2336(1)) {
                        return false;
                    }
                    var2.method2337(arg0.field1201.field4184, 0, 1);
                    arg0.field1210 = 0;
                    arg0.field1211 = false;
                }
                var3.field4182 = 0;
                if (var3.method5899()) {
                    if (!var2.method2336(1)) {
                        return false;
                    }
                    var2.method2337(arg0.field1201.field4184, 1, 1);
                    arg0.field1210 = 0;
                }
                arg0.field1211 = true;
                class230[] var4 = class230.method3309();
                int var5 = var3.method5900();
                if (var5 < 0 || var5 >= var4.length) {
                    throw new IOException(var5 + " " + var3.field4182);
                }
                arg0.field1206 = var4[var5];
                arg0.field1209 = arg0.field1206.field2740;
            }
            if (arg0.field1209 == -1) {
                if (!var2.method2336(1)) {
                    return false;
                }
                arg0.method1992().method2337(var3.field4184, 0, 1);
                arg0.field1209 = var3.field4184[0] & 0xFF;
            }
            if (arg0.field1209 == -2) {
                if (!var2.method2336(2)) {
                    return false;
                }
                arg0.method1992().method2337(var3.field4184, 0, 2);
                var3.field4182 = 0;
                arg0.field1209 = var3.method6053();
            }
            if (!var2.method2336(arg0.field1209)) {
                return false;
            }
            var3.field4182 = 0;
            var2.method2337(var3.field4184, 0, arg0.field1209);
            arg0.field1210 = 0;
            field458.method5088();
            arg0.field1213 = arg0.field1214;
            arg0.field1214 = arg0.field1212;
            arg0.field1212 = arg0.field1206;
            if (class230.field2721 == arg0.field1206) {
                boolean var6 = var3.method6188();
                if (!var6) {
                    Statics.field4128 = null;
                } else if (Statics.field4128 == null) {
                    Statics.field4128 = new class288();
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2709 == arg0.field1206) {
                if (field568 != -1) {
                    method2893(field568, 0);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2732 == arg0.field1206) {
                int var7 = var3.method6005();
                class249 var8 = class249.method2019(var7);
                for (int var9 = 0; var9 < var8.field3086.length; var9++) {
                    var8.field3086[var9] = -1;
                    var8.field3086[var9] = 0;
                }
                method1893(var8);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2730 == arg0.field1206) {
                class83.method1883(var3, arg0.field1209);
                Statics.method2662();
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2782 == arg0.field1206) {
                field670 = var3.method6174();
                field647 = var3.method5989();
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2720 == arg0.field1206) {
                for (int var10 = 0; var10 < field524.length; var10++) {
                    if (field524[var10] != null) {
                        field524[var10].field1053 = -1;
                    }
                }
                for (int var11 = 0; var11 < field567.length; var11++) {
                    if (field567[var11] != null) {
                        field567[var11].field1053 = -1;
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2741 == arg0.field1206) {
                int var12 = var3.method5972();
                boolean var13 = var3.method5958() == 1;
                String var14 = "";
                boolean var15 = false;
                if (var13) {
                    var14 = var3.method5967();
                    if (Statics.field80.method1347(new class406(var14, Statics.field761))) {
                        var15 = true;
                    }
                }
                String var16 = var3.method5967();
                if (!var15) {
                    class85.method2228(var12, var14, var16);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2771 == arg0.field1206) {
                int var17 = var3.method6007();
                class249 var18 = class249.method2019(var17);
                var18.field2950 = 3;
                var18.field3002 = Statics.field140.field979.method4237();
                method1893(var18);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2726 == arg0.field1206) {
                byte var19 = var3.method5959();
                String var20 = var3.method5967();
                long var21 = (long) var3.method6053();
                long var23 = (long) var3.method5962();
                class272 var25 = (class272) class291.method4326(class272.method1983(), var3.method5958());
                long var26 = (var21 << 32) + var23;
                boolean var28 = false;
                Object var29 = null;
                class124 var30 = var19 >= 0 ? field638[var19] : Statics.field3845;
                if (var30 == null) {
                    var28 = true;
                } else {
                    int var31 = 0;
                    while (true) {
                        if (var31 >= 100) {
                            if (var25.field3548 && Statics.field80.method1347(new class406(var20, Statics.field761))) {
                                var28 = true;
                            }
                            break;
                        }
                        if (field573[var31] == var26) {
                            var28 = true;
                            break;
                        }
                        var31++;
                    }
                }
                if (!var28) {
                    field573[field631] = var26;
                    field631 = (field631 + 1) % 100;
                    String var32 = class303.method4948(class252.method3227(var3));
                    int var33 = var19 >= 0 ? 41 : 44;
                    if (var25.field3543 == -1) {
                        class85.method2307(var33, var20, var32, var30.field1430);
                    } else {
                        class85.method2307(var33, class79.method1846(var25.field3543) + var20, var32, var30.field1430);
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2776 == arg0.field1206) {
                field615 = true;
                Statics.field4166 = var3.method5958();
                Statics.field2148 = var3.method5958();
                Statics.field3875 = var3.method6053();
                Statics.field1578 = var3.method5958();
                Statics.field3398 = var3.method5958();
                if (Statics.field3398 >= 100) {
                    int var34 = Statics.field4166 * 128 + 64;
                    int var35 = Statics.field2148 * 128 + 64;
                    int var36 = Statics.method2240(var34, var35, Statics.field3652) - Statics.field3875;
                    int var37 = var34 - Statics.field934;
                    int var38 = var36 - Statics.field3924;
                    int var39 = var35 - Statics.field4012;
                    int var40 = (int) Math.sqrt((double) (var37 * var37 + var39 * var39));
                    Statics.field1398 = (int) (Math.atan2((double) var38, (double) var40) * 325.949D) & 0x7FF;
                    Statics.field1400 = (int) (Math.atan2((double) var37, (double) var39) * -325.949D) & 0x7FF;
                    if (Statics.field1398 < 128) {
                        Statics.field1398 = 128;
                    }
                    if (Statics.field1398 > 383) {
                        Statics.field1398 = 383;
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2738 == arg0.field1206) {
                String var41 = var3.method5967();
                long var42 = (long) var3.method6053();
                long var44 = (long) var3.method5962();
                class272 var46 = (class272) class291.method4326(class272.method1983(), var3.method5958());
                long var47 = (var42 << 32) + var44;
                boolean var49 = false;
                for (int var50 = 0; var50 < 100; var50++) {
                    if (field573[var50] == var47) {
                        var49 = true;
                        break;
                    }
                }
                if (Statics.field80.method1347(new class406(var41, Statics.field761))) {
                    var49 = true;
                }
                if (!var49 && field522 == 0) {
                    field573[field631] = var47;
                    field631 = (field631 + 1) % 100;
                    String var51 = class303.method4948(class306.method4620(class252.method3227(var3)));
                    byte var52;
                    if (var46.field3547) {
                        var52 = 7;
                    } else {
                        var52 = 3;
                    }
                    if (var46.field3543 == -1) {
                        class85.method2228(var52, var41, var51);
                    } else {
                        class85.method2228(var52, class79.method1846(var46.field3543) + var41, var51);
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2763 == arg0.field1206) {
                Statics.field1441 = class402.method2815(var3.method5958());
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2702 == arg0.field1206) {
                method110(class228.field2681);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2746 == arg0.field1206) {
                method110(class228.field2677);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2700 == arg0.field1206) {
                method110(class228.field2679);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2778 == arg0.field1206) {
                String var53 = var3.method5967();
                int var54 = var3.method5987();
                int var55 = var3.method5987();
                if (var55 >= 1 && var55 <= 8) {
                    if (var53.equalsIgnoreCase(class270.field3234)) {
                        var53 = null;
                    }
                    field532[var55 - 1] = var53;
                    field533[var55 - 1] = var54 == 0;
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2749 == arg0.field1206) {
                String var56 = var3.method5967();
                String var57 = class303.method4948(class306.method4620(class252.method3227(var3)));
                class85.method2228(6, var56, var57);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2745 == arg0.field1206) {
                field424 = var3.method5958();
                if (field424 == 1) {
                    field425 = var3.method6053();
                }
                if (field424 >= 2 && field424 <= 6) {
                    if (field424 == 2) {
                        field430 = 64;
                        field553 = 64;
                    }
                    if (field424 == 3) {
                        field430 = 0;
                        field553 = 64;
                    }
                    if (field424 == 4) {
                        field430 = 128;
                        field553 = 64;
                    }
                    if (field424 == 5) {
                        field430 = 64;
                        field553 = 0;
                    }
                    if (field424 == 6) {
                        field430 = 64;
                        field553 = 128;
                    }
                    field424 = 2;
                    field477 = var3.method6053();
                    field454 = var3.method6053();
                    field429 = var3.method5958();
                }
                if (field424 == 10) {
                    field426 = var3.method6053();
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2783 == arg0.field1206) {
                String var58 = var3.method5967();
                Object[] var59 = new Object[var58.length() + 1];
                for (int var60 = var58.length() - 1; var60 >= 0; var60--) {
                    if (var58.charAt(var60) == 's') {
                        var59[var60 + 1] = var3.method5967();
                    } else {
                        var59[var60 + 1] = Integer.valueOf(var3.method6182());
                    }
                }
                var59[0] = Integer.valueOf(var3.method6182());
                class68 var61 = new class68();
                var61.field955 = var59;
                class51.method2079(var61);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2761 == arg0.field1206) {
                byte var62 = var3.method5991();
                int var63 = var3.method6086();
                class244.field2912[var63] = var62;
                if (class244.field2911[var63] != var62) {
                    class244.field2911[var63] = var62;
                }
                method817(var63);
                field594[++field552 - 1 & 0x1F] = var63;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2784 == arg0.field1206) {
                Statics.field859 = var3.method5958();
                Statics.field3695 = var3.method5989();
                for (int var64 = Statics.field3695; var64 < Statics.field3695 + 8; var64++) {
                    for (int var65 = Statics.field859; var65 < Statics.field859 + 8; var65++) {
                        if (field536[Statics.field3652][var64][var65] != null) {
                            field536[Statics.field3652][var64][var65] = null;
                            method1404(var64, var65);
                        }
                    }
                }
                for (class71 var66 = (class71) field537.method4721(); var66 != null; var66 = (class71) field537.method4712()) {
                    if (var66.field1016 >= Statics.field3695 && var66.field1016 < Statics.field3695 + 8 && var66.field1011 >= Statics.field859 && var66.field1011 < Statics.field859 + 8 && Statics.field3652 == var66.field1018) {
                        var66.field1019 = 0;
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2751 == arg0.field1206) {
                int var67 = var3.method6182();
                class67 var68 = (class67) field569.method5756((long) var67);
                if (var68 != null) {
                    Statics.method2891(var68, true);
                }
                if (field574 != null) {
                    method1893(field574);
                    field574 = null;
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2764 == arg0.field1206) {
                int var69 = var3.method5973();
                int var70 = var3.method6000();
                class249 var71 = class249.method2019(var69);
                if (var71.field3005 != var70 || var70 == -1) {
                    var71.field3005 = var70;
                    var71.field3094 = 0;
                    var71.field3090 = 0;
                    method1893(var71);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2774 == arg0.field1206) {
                byte[] var72 = new byte[arg0.field1209];
                var3.method5901(var72, 0, var72.length);
                class385 var73 = new class385(var72);
                String var74 = var73.method5967();
                Statics.method2388(var74, true, false);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2719 == arg0.field1206) {
                method2129();
                field432 = var3.method5958();
                field517 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2755 == arg0.field1206) {
                for (int var75 = 0; var75 < class244.field2911.length; var75++) {
                    if (class244.field2912[var75] != class244.field2911[var75]) {
                        class244.field2911[var75] = class244.field2912[var75];
                        method817(var75);
                        field594[++field552 - 1 & 0x1F] = var75;
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2736 == arg0.field1206) {
                field615 = false;
                for (int var76 = 0; var76 < 5; var76++) {
                    field656[var76] = false;
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2750 == arg0.field1206) {
                int var77 = var3.method6007();
                boolean var78 = var3.method6174() == 1;
                class249 var79 = class249.method2019(var77);
                if (var79.field2978 != var78) {
                    var79.field2978 = var78;
                    method1893(var79);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2737 == arg0.field1206) {
                int var80 = var3.method6005();
                int var81 = var3.method6086();
                int var82 = var81 >> 10 & 0x1F;
                int var83 = var81 >> 5 & 0x1F;
                int var84 = var81 & 0x1F;
                int var85 = (var84 << 3) + (var82 << 19) + (var83 << 11);
                class249 var86 = class249.method2019(var80);
                if (var86.field2983 != var85) {
                    var86.field2983 = var85;
                    method1893(var86);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2703 == arg0.field1206) {
                if (Statics.field972 != null) {
                    Statics.field972.method5142(var3);
                }
                method339();
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2768 == arg0.field1206) {
                method110(class228.field2678);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2706 == arg0.field1206) {
                Statics.field3695 = var3.method5987();
                Statics.field859 = var3.method5989();
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2707 == arg0.field1206) {
                Statics.field80.method1341(var3, arg0.field1209);
                field610 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2696 == arg0.field1206) {
                field646 = var3.method5958();
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2724 == arg0.field1206) {
                int var87 = var3.method6182();
                int var88 = var3.method6053();
                int var89 = var3.method5998();
                class249 var90 = class249.method2019(var87);
                var90.field3014 = (var89 << 16) + var88;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2753 == arg0.field1206) {
                int var91 = var3.method6182();
                int var92 = var3.method6053();
                if (var91 < -70000) {
                    var92 += 32768;
                }
                class249 var93;
                if (var91 >= 0) {
                    var93 = class249.method2019(var91);
                } else {
                    var93 = null;
                }
                if (var93 != null) {
                    for (int var94 = 0; var94 < var93.field3086.length; var94++) {
                        var93.field3086[var94] = 0;
                        var93.field3087[var94] = 0;
                    }
                }
                class65.method2117(var92);
                int var95 = var3.method6053();
                for (int var96 = 0; var96 < var95; var96++) {
                    int var97 = var3.method5997();
                    int var98 = var3.method5958();
                    if (var98 == 255) {
                        var98 = var3.method6007();
                    }
                    if (var93 != null && var96 < var93.field3086.length) {
                        var93.field3086[var96] = var97;
                        var93.field3087[var96] = var98;
                    }
                    Statics.method2405(var92, var96, var97 - 1, var98);
                }
                if (var93 != null) {
                    method1893(var93);
                }
                method2129();
                field641[++field575 - 1 & 0x1F] = var92 & 0x7FFF;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2748 == arg0.field1206) {
                int var99 = var3.method6053();
                int var100 = var3.method5998();
                int var101 = var3.method5997();
                int var102 = var3.method6007();
                class249 var103 = class249.method2019(var102);
                if (var103.field3009 != var100 || var103.field3010 != var101 || var103.field3000 != var99) {
                    var103.field3009 = var100;
                    var103.field3010 = var101;
                    var103.field3000 = var99;
                    method1893(var103);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2713 == arg0.field1206) {
                int var104 = var3.method5958();
                if (var3.method5958() == 0) {
                    field620[var104] = new class286();
                    var3.field4182 += 18;
                } else {
                    var3.field4182--;
                    field620[var104] = new class286(var3, false);
                }
                field607 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2722 == arg0.field1206) {
                method2129();
                int var105 = var3.method5958();
                int var106 = var3.method6005();
                int var107 = var3.method5989();
                field542[var105] = var106;
                field435[var105] = var107;
                field541[var105] = 1;
                for (int var108 = 0; var108 < 98; var108++) {
                    if (var106 >= class259.field3168[var108]) {
                        field541[var105] = var108 + 2;
                    }
                }
                field428[++field599 - 1 & 0x1F] = var105;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2758 == arg0.field1206) {
                if (arg0.field1209 == 0) {
                    Statics.field972 = null;
                } else {
                    if (Statics.field972 == null) {
                        Statics.field972 = new class320(Statics.field761, Statics.field874);
                    }
                    Statics.field972.method5150(var3);
                }
                method339();
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2767 == arg0.field1206) {
                int var109 = var3.method6182();
                int var110 = var3.method6053();
                class249 var111 = class249.method2019(var109);
                if (var111.field2950 != 1 || var111.field3002 != var110) {
                    var111.field2950 = 1;
                    var111.field3002 = var110;
                    method1893(var111);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2717 == arg0.field1206) {
                int var112 = var3.method5958();
                int var113 = var3.method5958();
                int var114 = var3.method5958();
                int var115 = var3.method5958();
                field656[var112] = true;
                field437[var112] = var113;
                field609[var112] = var114;
                field659[var112] = var115;
                field660[var112] = 0;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2708 == arg0.field1206) {
                int var116 = var3.method6182();
                if (field489 != var116) {
                    field489 = var116;
                    method5400();
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2781 == arg0.field1206) {
                method1546();
                byte var117 = var3.method5959();
                class107 var118 = new class107(var3);
                class115 var119;
                if (var117 >= 0) {
                    var119 = field637[var117];
                } else {
                    var119 = Statics.field355;
                }
                var118.method2120(var119);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2779 == arg0.field1206) {
                int var120 = var3.method6053();
                field568 = var120;
                this.method851(false);
                Statics.method5110(var120);
                class51.method2146(field568);
                for (int var121 = 0; var121 < 100; var121++) {
                    field617[var121] = true;
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2756 == arg0.field1206) {
                int var122 = var3.method5998();
                if (var122 == 65535) {
                    var122 = -1;
                }
                method780(var122);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2698 == arg0.field1206) {
                int var123 = var3.method5998();
                if (var123 == 65535) {
                    var123 = -1;
                }
                int var124 = var3.method6001();
                method2024(var123, var124);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2747 == arg0.field1206) {
                int var125 = arg0.field1209 + var3.field4182;
                int var126 = var3.method6053();
                int var127 = var3.method6053();
                if (field568 != var126) {
                    field568 = var126;
                    this.method851(false);
                    Statics.method5110(field568);
                    class51.method2146(field568);
                    for (int var128 = 0; var128 < 100; var128++) {
                        field617[var128] = true;
                    }
                }
                while (var127-- > 0) {
                    int var129 = var3.method6182();
                    int var130 = var3.method6053();
                    int var131 = var3.method5958();
                    class67 var132 = (class67) field569.method5756((long) var129);
                    if (var132 != null && var132.field950 != var130) {
                        Statics.method2891(var132, true);
                        var132 = null;
                    }
                    if (var132 == null) {
                        var132 = method2122(var129, var130, var131);
                    }
                    var132.field948 = true;
                }
                for (class67 var133 = (class67) field569.method5746(); var133 != null; var133 = (class67) field569.method5749()) {
                    if (var133.field948) {
                        var133.field948 = false;
                    } else {
                        Statics.method2891(var133, true);
                    }
                }
                field469 = new class364(512);
                while (var3.field4182 < var125) {
                    int var134 = var3.method6182();
                    int var135 = var3.method6053();
                    int var136 = var3.method6053();
                    int var137 = var3.method6182();
                    for (int var138 = var135; var138 <= var136; var138++) {
                        long var139 = ((long) var134 << 32) + (long) var138;
                        field469.method5747(new class353(var137), var139);
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2766 == arg0.field1206) {
                method815(var3.method5967());
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2752 == arg0.field1206) {
                int var141 = var3.method6007();
                int var142 = var3.method6182();
                class67 var143 = (class67) field569.method5756((long) var141);
                class67 var144 = (class67) field569.method5756((long) var142);
                if (var144 != null) {
                    Statics.method2891(var144, var143 == null || var143.field950 != var144.field950);
                }
                if (var143 != null) {
                    var143.method5447();
                    field569.method5747(var143, (long) var142);
                }
                class249 var145 = class249.method2019(var141);
                if (var145 != null) {
                    method1893(var145);
                }
                class249 var146 = class249.method2019(var142);
                if (var146 != null) {
                    method1893(var146);
                    method1892(Statics.field3039[var146.field2958 >>> 16], var146, true);
                }
                if (field568 != -1) {
                    method2893(field568, 1);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2757 == arg0.field1206) {
                method2587(true, var3);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2692 == arg0.field1206) {
                int var147 = var3.method5987();
                int var148 = var3.method5997();
                int var149 = var3.method6182();
                class67 var150 = (class67) field569.method5756((long) var149);
                if (var150 != null) {
                    Statics.method2891(var150, var150.field950 != var148);
                }
                method2122(var149, var148, var147);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2734 == arg0.field1206) {
                int var151 = var3.method6007();
                String var152 = var3.method5967();
                class249 var153 = class249.method2019(var151);
                if (!var152.equals(var153.field3042)) {
                    var153.field3042 = var152;
                    method1893(var153);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2733 == arg0.field1206) {
                class42.method2220(var3, arg0.field1209);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2695 == arg0.field1206) {
                Statics.field3695 = var3.method6174();
                Statics.field859 = var3.method6174();
                while (var3.field4182 < arg0.field1209) {
                    int var154 = var3.method5958();
                    class228 var155 = Statics.method3890()[var154];
                    method110(var155);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2727 == arg0.field1206) {
                method1546();
                byte var156 = var3.method5959();
                if (arg0.field1209 == 1) {
                    if (var156 >= 0) {
                        field637[var156] = null;
                    } else {
                        Statics.field355 = null;
                    }
                    arg0.field1206 = null;
                    return true;
                }
                if (var156 >= 0) {
                    field637[var156] = new class115(var3);
                } else {
                    Statics.field355 = new class115(var3);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2773 == arg0.field1206) {
                int var157 = var3.method6053();
                int var158 = var3.method5958();
                int var159 = var3.method6053();
                method2280(var157, var158, var159);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2728 == arg0.field1206) {
                for (int var160 = 0; var160 < Statics.field3631; var160++) {
                    class140 var161 = class140.method1405(var160);
                    if (var161 != null) {
                        class244.field2912[var160] = 0;
                        class244.field2911[var160] = 0;
                    }
                }
                method2129();
                field552 += 32;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2744 == arg0.field1206) {
                method2587(false, var3);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2718 == arg0.field1206) {
                Statics.field80.method1351();
                field610 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2769 == arg0.field1206) {
                Statics.field372 = null;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2735 == arg0.field1206) {
                method110(class228.field2680);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2694 == arg0.field1206) {
                method4164(false, arg0.field1201);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2777 == arg0.field1206) {
                int var162 = var3.method6182();
                int var163 = var3.method6053();
                if (var162 < -70000) {
                    var163 += 32768;
                }
                class249 var164;
                if (var162 >= 0) {
                    var164 = class249.method2019(var162);
                } else {
                    var164 = null;
                }
                while (var3.field4182 < arg0.field1209) {
                    int var165 = var3.method5972();
                    int var166 = var3.method6053();
                    int var167 = 0;
                    if (var166 != 0) {
                        var167 = var3.method5958();
                        if (var167 == 255) {
                            var167 = var3.method6182();
                        }
                    }
                    if (var164 != null && var165 >= 0 && var165 < var164.field3086.length) {
                        var164.field3086[var165] = var166;
                        var164.field3087[var165] = var167;
                    }
                    Statics.method2405(var163, var165, var166 - 1, var167);
                }
                if (var164 != null) {
                    method1893(var164);
                }
                method2129();
                field641[++field575 - 1 & 0x1F] = var163 & 0x7FFF;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2765 == arg0.field1206) {
                boolean var168 = var3.method5958() == 1;
                if (var168) {
                    Statics.field2067 = class382.method2013() - var3.method5964();
                    Statics.field3711 = new class279(var3, true);
                } else {
                    Statics.field3711 = null;
                }
                field480 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2785 == arg0.field1206) {
                String var169 = var3.method5967();
                long var170 = var3.method5964();
                long var172 = (long) var3.method6053();
                long var174 = (long) var3.method5962();
                class272 var176 = (class272) class291.method4326(class272.method1983(), var3.method5958());
                long var177 = (var172 << 32) + var174;
                boolean var179 = false;
                for (int var180 = 0; var180 < 100; var180++) {
                    if (field573[var180] == var177) {
                        var179 = true;
                        break;
                    }
                }
                if (var176.field3548 && Statics.field80.method1347(new class406(var169, Statics.field761))) {
                    var179 = true;
                }
                if (!var179 && field522 == 0) {
                    field573[field631] = var177;
                    field631 = (field631 + 1) % 100;
                    String var181 = class303.method4948(class306.method4620(class252.method3227(var3)));
                    if (var176.field3543 == -1) {
                        class85.method2307(9, var169, var181, class308.method1952(var170));
                    } else {
                        class85.method2307(9, class79.method1846(var176.field3543) + var169, var181, class308.method1952(var170));
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2759 == arg0.field1206) {
                field423 = var3.method6086() * 30;
                field517 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2742 == arg0.field1206) {
                int var182 = var3.method5958();
                method3261(var182);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2716 == arg0.field1206) {
                field606 = field593;
                byte var183 = var3.method5959();
                if (arg0.field1209 == 1) {
                    if (var183 >= 0) {
                        field638[var183] = null;
                    } else {
                        Statics.field3845 = null;
                    }
                    arg0.field1206 = null;
                    return true;
                }
                if (var183 >= 0) {
                    field638[var183] = new class124(var3);
                } else {
                    Statics.field3845 = new class124(var3);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2712 == arg0.field1206) {
                method110(class228.field2684);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2705 == arg0.field1206) {
                int var184 = var3.method5997();
                if (var184 == 65535) {
                    var184 = -1;
                }
                int var185 = var3.method6182();
                int var186 = var3.method5998();
                if (var186 == 65535) {
                    var186 = -1;
                }
                int var187 = var3.method6007();
                for (int var188 = var184; var188 <= var186; var188++) {
                    long var189 = ((long) var187 << 32) + (long) var188;
                    class354 var191 = field469.method5756(var189);
                    if (var191 != null) {
                        var191.method5447();
                    }
                    field469.method5747(new class353(var185), var189);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2729 == arg0.field1206) {
                Statics.field80.field713.method5116(var3, arg0.field1209);
                method4341();
                field610 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2693 == arg0.field1206) {
                method2492();
                arg0.field1206 = null;
                return false;
            }
            if (class230.field2739 == arg0.field1206) {
                int var192 = var3.method6005();
                int var193 = var3.method6053();
                if (var193 == 65535) {
                    var193 = -1;
                }
                int var194 = var3.method6005();
                class249 var195 = class249.method2019(var194);
                if (var195.field2993) {
                    var195.field3088 = var193;
                    var195.field3089 = var192;
                    class157 var197 = class157.method101(var193);
                    var195.field3009 = var197.field1801;
                    var195.field3010 = var197.field1822;
                    var195.field3011 = var197.field1803;
                    var195.field3007 = var197.field1804;
                    var195.field2960 = var197.field1805;
                    var195.field3000 = var197.field1800;
                    if (var197.field1806 == 1) {
                        var195.field2991 = 1;
                    } else {
                        var195.field2991 = 2;
                    }
                    if (var195.field3013 > 0) {
                        var195.field3000 = var195.field3000 * 32 / var195.field3013;
                    } else if (var195.field2969 > 0) {
                        var195.field3000 = var195.field3000 * 32 / var195.field2969;
                    }
                    method1893(var195);
                } else if (var193 == -1) {
                    var195.field2950 = 0;
                    arg0.field1206 = null;
                    return true;
                } else {
                    class157 var196 = class157.method101(var193);
                    var195.field2950 = 4;
                    var195.field3002 = var193;
                    var195.field3009 = var196.field1801;
                    var195.field3010 = var196.field1822;
                    var195.field3000 = var196.field1800 * 100 / var192;
                    method1893(var195);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2701 == arg0.field1206) {
                int var198 = var3.method5961();
                int var199 = var3.method5999();
                int var200 = var3.method6005();
                class249 var201 = class249.method2019(var200);
                if (var201.field2947 != var199 || var201.field3019 != var198 || var201.field3063 != 0 || var201.field2964 != 0) {
                    var201.field2947 = var199;
                    var201.field3019 = var198;
                    var201.field3063 = 0;
                    var201.field2964 = 0;
                    method1893(var201);
                    this.method852(var201);
                    if (var201.field2977 == 0) {
                        method1892(Statics.field3039[var200 >> 16], var201, false);
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2762 == arg0.field1206) {
                int var202 = var3.method6053();
                int var203 = var3.method6005();
                class244.field2912[var202] = var203;
                if (class244.field2911[var202] != var203) {
                    class244.field2911[var202] = var203;
                }
                method817(var202);
                field594[++field552 - 1 & 0x1F] = var202;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2704 == arg0.field1206) {
                field615 = true;
                Statics.field1324 = var3.method5958();
                Statics.field1714 = var3.method5958();
                Statics.field15 = var3.method6053();
                Statics.field1266 = var3.method5958();
                Statics.field2546 = var3.method5958();
                if (Statics.field2546 >= 100) {
                    Statics.field934 = Statics.field1324 * 128 + 64;
                    Statics.field4012 = Statics.field1714 * 128 + 64;
                    Statics.field3924 = Statics.method2240(Statics.field934, Statics.field4012, Statics.field3652) - Statics.field15;
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2780 == arg0.field1206) {
                method110(class228.field2675);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2725 == arg0.field1206) {
                int var204 = var3.method6182();
                int var205 = var3.method6182();
                int var206 = class19.method4378();
                class229 var207 = class229.method2538(class227.field2596, field453.field1205);
                var207.field2691.method5986(field120);
                var207.field2691.method6077(var206);
                var207.field2691.method6004(var204);
                var207.field2691.method5982(var205);
                field453.method1987(var207);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2715 == arg0.field1206) {
                int var208 = var3.method6053();
                Statics.method3731(var208);
                field641[++field575 - 1 & 0x1F] = var208 & 0x7FFF;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2711 == arg0.field1206) {
                if (Statics.field372 == null) {
                    Statics.field372 = new class340(Statics.field3664);
                }
                class393 var209 = Statics.field3664.method5417(var3);
                Statics.field372.field3936.method5760(var209.field4241, var209.field4242);
                field600[++field601 - 1 & 0x1F] = var209.field4241;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2772 == arg0.field1206) {
                method110(class228.field2676);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2699 == arg0.field1206) {
                var3.field4182 += 28;
                if (var3.method5983()) {
                    method1683(var3, var3.field4182 - 28);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2697 == arg0.field1206) {
                method4164(true, arg0.field1201);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2760 == arg0.field1206) {
                int var210 = var3.method6007();
                int var211 = var3.method6086();
                class249 var212 = class249.method2019(var210);
                if (var212 != null && var212.field2977 == 0) {
                    if (var211 > var212.field3091 - var212.field2990) {
                        var211 = var212.field3091 - var212.field2990;
                    }
                    if (var211 < 0) {
                        var211 = 0;
                    }
                    if (var212.field2968 != var211) {
                        var212.field2968 = var211;
                        method1893(var212);
                    }
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2710 == arg0.field1206) {
                method2129();
                field576 = var3.method5961();
                field517 = field593;
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2770 == arg0.field1206) {
                method110(class228.field2682);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2754 == arg0.field1206) {
                int var213 = var3.method6086();
                int var214 = var3.method6007();
                class249 var215 = class249.method2019(var214);
                if (var215.field2950 != 2 || var215.field3002 != var213) {
                    var215.field2950 = 2;
                    var215.field3002 = var213;
                    method1893(var215);
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2714 == arg0.field1206) {
                class48 var216 = new class48();
                var216.field701 = var3.method5967();
                var216.field697 = var3.method6053();
                int var217 = var3.method6182();
                var216.field700 = var217;
                method159(45);
                var2.method2335();
                Object var218 = null;
                class56.method2760(var216);
                arg0.field1206 = null;
                return false;
            }
            if (class230.field2775 == arg0.field1206) {
                method110(class228.field2683);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2731 == arg0.field1206) {
                int var219 = var3.method5958();
                method4325(var219);
                arg0.field1206 = null;
                return false;
            }
            if (class230.field2786 == arg0.field1206) {
                field644 = var3.method5958();
                if (field644 == 255) {
                    field644 = 0;
                }
                field597 = var3.method5958();
                if (field597 == 255) {
                    field597 = 0;
                }
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2743 == arg0.field1206) {
                Statics.field372 = new class340(Statics.field3664);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2788 == arg0.field1206) {
                field606 = field593;
                byte var220 = var3.method5959();
                class121 var221 = new class121(var3);
                class124 var222;
                if (var220 >= 0) {
                    var222 = field638[var220];
                } else {
                    var222 = Statics.field3845;
                }
                var221.method2227(var222);
                arg0.field1206 = null;
                return true;
            }
            if (class230.field2723 == arg0.field1206) {
                byte var223 = var3.method5959();
                long var224 = (long) var3.method6053();
                long var226 = (long) var3.method5962();
                long var228 = (var224 << 32) + var226;
                boolean var230 = false;
                class124 var231 = var223 >= 0 ? field638[var223] : Statics.field3845;
                if (var231 == null) {
                    var230 = true;
                } else {
                    for (int var232 = 0; var232 < 100; var232++) {
                        if (field573[var232] == var228) {
                            var230 = true;
                            break;
                        }
                    }
                }
                if (!var230) {
                    field573[field631] = var228;
                    field631 = (field631 + 1) % 100;
                    String var233 = class252.method3227(var3);
                    int var234 = var223 >= 0 ? 43 : 46;
                    class85.method2307(var234, "", var233, var231.field1430);
                }
                arg0.field1206 = null;
                return true;
            }
            class409.method5337("" + (arg0.field1206 == null ? -1 : arg0.field1206.field2787) + class79.field1140 + (arg0.field1214 == null ? -1 : arg0.field1214.field2787) + class79.field1140 + (arg0.field1213 == null ? -1 : arg0.field1213.field2787) + class79.field1140 + arg0.field1209, (Throwable) null);
            method2492();
        } catch (IOException var239) {
            method3220();
        } catch (Exception var240) {
            String var237 = "" + (arg0.field1206 == null ? -1 : arg0.field1206.field2787) + class79.field1140 + (arg0.field1214 == null ? -1 : arg0.field1214.field2787) + class79.field1140 + (arg0.field1213 == null ? -1 : arg0.field1213.field2787) + class79.field1140 + arg0.field1209 + class79.field1140 + (Statics.field3625 + Statics.field140.field1076[0]) + class79.field1140 + (Statics.field1134 + Statics.field140.field1077[0]) + class79.field1140;
            for (int var238 = 0; var238 < arg0.field1209 && var238 < 50; var238++) {
                var237 = var237 + var3.field4184[var238] + class79.field1140;
            }
            class409.method5337(var237, var240);
            method2492();
        }
        return true;
    }

    @ObfuscatedName("h.hc(Lhv;B)V")
    public static final void method110(class228 arg0) {
        class384 var1 = field453.field1201;
        if (class228.field2676 == arg0) {
            int var2 = var1.method5958();
            byte var3 = var1.method5945();
            int var4 = var1.method6086();
            int var5 = var1.method5997();
            byte var6 = var1.method5959();
            int var7 = var1.method5987();
            int var8 = (var7 >> 4 & 0x7) + Statics.field3695;
            int var9 = (var7 & 0x7) + Statics.field859;
            int var10 = var1.method5989() * 4;
            int var11 = var1.method5987() * 4;
            int var12 = var1.method5999();
            int var13 = var1.method6174();
            int var14 = var1.method6053();
            int var15 = var3 + var8;
            int var16 = var6 + var9;
            if (var8 >= 0 && var9 >= 0 && var8 < 104 && var9 < 104 && var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104 && var5 != 65535) {
                int var17 = var8 * 128 + 64;
                int var18 = var9 * 128 + 64;
                int var19 = var15 * 128 + 64;
                int var20 = var16 * 128 + 64;
                class57 var21 = new class57(var5, Statics.field3652, var17, var18, Statics.method2240(var17, var18, Statics.field3652) - var11, field452 + var14, field452 + var4, var2, var13, var12, var10);
                var21.method1606(var19, var20, Statics.method2240(var19, var20, Statics.field3652) - var10, field452 + var14);
                field538.method4706(var21);
            }
            return;
        }
        if (class228.field2677 == arg0) {
            byte var22 = var1.method5991();
            byte var23 = var1.method5991();
            byte var24 = var1.method5990();
            int var25 = var1.method5997();
            int var26 = var1.method6053();
            int var27 = var1.method5998();
            int var28 = var1.method6174();
            int var29 = var28 >> 2;
            int var30 = var28 & 0x3;
            int var31 = field468[var29];
            int var32 = var1.method5987();
            int var33 = (var32 >> 4 & 0x7) + Statics.field3695;
            int var34 = (var32 & 0x7) + Statics.field859;
            byte var35 = var1.method5990();
            int var36 = var1.method5997();
            class70 var37;
            if (field665 == var27) {
                var37 = Statics.field140;
            } else {
                var37 = field524[var27];
            }
            if (var37 != null) {
                class156 var38 = class156.method2267(var26);
                int var39;
                int var40;
                if (var30 == 1 || var30 == 3) {
                    var39 = var38.field1751;
                    var40 = var38.field1750;
                } else {
                    var39 = var38.field1750;
                    var40 = var38.field1751;
                }
                int var41 = (var39 >> 1) + var33;
                int var42 = (var39 + 1 >> 1) + var33;
                int var43 = (var40 >> 1) + var34;
                int var44 = (var40 + 1 >> 1) + var34;
                int[][] var45 = class62.field911[Statics.field3652];
                int var46 = var45[var41][var43] + var45[var42][var43] + var45[var41][var44] + var45[var42][var44] >> 2;
                int var47 = (var33 << 7) + (var39 << 6);
                int var48 = (var34 << 7) + (var40 << 6);
                class207 var49 = var38.method2687(var29, var30, var45, var47, var46, var48);
                if (var49 != null) {
                    method1689(Statics.field3652, var33, var34, var31, -1, 0, 0, var36 + 1, var25 + 1);
                    var37.field986 = field452 + var36;
                    var37.field987 = field452 + var25;
                    var37.field981 = var49;
                    var37.field983 = var33 * 128 + var39 * 64;
                    var37.field990 = var34 * 128 + var40 * 64;
                    var37.field984 = var46;
                    if (var22 > var35) {
                        byte var50 = var22;
                        var22 = var35;
                        var35 = var50;
                    }
                    if (var24 > var23) {
                        byte var51 = var24;
                        var24 = var23;
                        var23 = var51;
                    }
                    var37.field978 = var22 + var33;
                    var37.field994 = var33 + var35;
                    var37.field993 = var24 + var34;
                    var37.field989 = var23 + var34;
                }
            }
        }
        if (class228.field2683 == arg0) {
            int var52 = var1.method5987();
            int var53 = (var52 >> 4 & 0x7) + Statics.field3695;
            int var54 = (var52 & 0x7) + Statics.field859;
            int var55 = var1.method5989();
            int var56 = var1.method5998();
            int var57 = var1.method5998();
            if (var53 >= 0 && var54 >= 0 && var53 < 104 && var54 < 104) {
                int var58 = var53 * 128 + 64;
                int var59 = var54 * 128 + 64;
                class52 var60 = new class52(var57, Statics.field3652, var58, var59, Statics.method2240(var58, var59, Statics.field3652) - var55, var56, field452);
                field539.method4706(var60);
            }
        } else if (class228.field2684 == arg0) {
            int var61 = var1.method5998();
            int var62 = var1.method5989();
            int var63 = (var62 >> 4 & 0x7) + Statics.field3695;
            int var64 = (var62 & 0x7) + Statics.field859;
            int var65 = var1.method6086();
            int var66 = var1.method6053();
            if (var63 >= 0 && var64 >= 0 && var63 < 104 && var64 < 104) {
                class296 var67 = field536[Statics.field3652][var63][var64];
                if (var67 != null) {
                    for (class82 var68 = (class82) var67.method4721(); var68 != null; var68 = (class82) var67.method4712()) {
                        if ((var65 & 0x7FFF) == var68.field1167 && var68.field1164 == var66) {
                            var68.field1164 = var61;
                            break;
                        }
                    }
                    method1404(var63, var64);
                }
            }
        } else if (class228.field2681 == arg0) {
            int var69 = var1.method6174();
            int var70 = (var69 >> 4 & 0x7) + Statics.field3695;
            int var71 = (var69 & 0x7) + Statics.field859;
            int var72 = var1.method5997();
            if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104) {
                class296 var73 = field536[Statics.field3652][var70][var71];
                if (var73 != null) {
                    for (class82 var74 = (class82) var73.method4721(); var74 != null; var74 = (class82) var73.method4712()) {
                        if ((var72 & 0x7FFF) == var74.field1167) {
                            var74.method5447();
                            break;
                        }
                    }
                    if (var73.method4721() == null) {
                        field536[Statics.field3652][var70][var71] = null;
                    }
                    method1404(var70, var71);
                }
            }
        } else if (class228.field2679 == arg0) {
            int var75 = var1.method5958();
            int var76 = (var75 >> 4 & 0x7) + Statics.field3695;
            int var77 = (var75 & 0x7) + Statics.field859;
            int var78 = var1.method6174();
            int var79 = var78 >> 2;
            int var80 = var78 & 0x3;
            int var81 = field468[var79];
            if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                method1689(Statics.field3652, var76, var77, var81, -1, var79, var80, 0, -1);
            }
        } else {
            if (class228.field2682 == arg0) {
                int var82 = var1.method6053();
                int var83 = var1.method6174();
                int var84 = (var83 >> 4 & 0x7) + Statics.field3695;
                int var85 = (var83 & 0x7) + Statics.field859;
                int var86 = var1.method5958();
                int var87 = var86 >> 4 & 0xF;
                int var88 = var86 & 0x7;
                int var89 = var1.method6174();
                if (var84 >= 0 && var85 >= 0 && var84 < 104 && var85 < 104) {
                    int var90 = var87 + 1;
                    if (Statics.field140.field1076[0] >= var84 - var90 && Statics.field140.field1076[0] <= var84 + var90 && Statics.field140.field1077[0] >= var85 - var90 && Statics.field140.field1077[0] <= var85 + var90 && Statics.field308.field1116 != 0 && var88 > 0 && field498 < 50) {
                        field629[field498] = var82;
                        field651[field498] = var88;
                        field652[field498] = var89;
                        field654[field498] = null;
                        field653[field498] = (var84 << 16) + (var85 << 8) + var87;
                        field498++;
                    }
                }
            }
            if (class228.field2675 == arg0) {
                int var91 = var1.method6174();
                int var92 = (var91 >> 4 & 0x7) + Statics.field3695;
                int var93 = (var91 & 0x7) + Statics.field859;
                int var94 = var1.method6086();
                int var95 = var1.method6086();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104) {
                    class82 var96 = new class82();
                    var96.field1167 = var94;
                    var96.field1164 = var95;
                    if (field536[Statics.field3652][var92][var93] == null) {
                        field536[Statics.field3652][var92][var93] = new class296();
                    }
                    field536[Statics.field3652][var92][var93].method4706(var96);
                    method1404(var92, var93);
                }
            } else if (class228.field2678 == arg0) {
                int var97 = var1.method5987();
                int var98 = (var97 >> 4 & 0x7) + Statics.field3695;
                int var99 = (var97 & 0x7) + Statics.field859;
                int var100 = var1.method5998();
                int var101 = var1.method5989();
                int var102 = var101 >> 2;
                int var103 = var101 & 0x3;
                int var104 = field468[var102];
                if (var98 >= 0 && var99 >= 0 && var98 < 103 && var99 < 103) {
                    if (var104 == 0) {
                        class212 var105 = Statics.field1925.method3624(Statics.field3652, var98, var99);
                        if (var105 != null) {
                            int var106 = class208.method1867(var105.field2516);
                            if (var102 == 2) {
                                var105.field2514 = new class60(var106, 2, var103 + 4, Statics.field3652, var98, var99, var100, false, var105.field2514);
                                var105.field2515 = new class60(var106, 2, var103 + 1 & 0x3, Statics.field3652, var98, var99, var100, false, var105.field2515);
                            } else {
                                var105.field2514 = new class60(var106, var102, var103, Statics.field3652, var98, var99, var100, false, var105.field2514);
                            }
                        }
                    }
                    if (var104 == 1) {
                        class214 var107 = Statics.field1925.method3561(Statics.field3652, var98, var99);
                        if (var107 != null) {
                            int var108 = class208.method1867(var107.field2523);
                            if (var102 == 4 || var102 == 5) {
                                var107.field2528 = new class60(var108, 4, var103, Statics.field3652, var98, var99, var100, false, var107.field2528);
                            } else if (var102 == 6) {
                                var107.field2528 = new class60(var108, 4, var103 + 4, Statics.field3652, var98, var99, var100, false, var107.field2528);
                            } else if (var102 == 7) {
                                var107.field2528 = new class60(var108, 4, (var103 + 2 & 0x3) + 4, Statics.field3652, var98, var99, var100, false, var107.field2528);
                            } else if (var102 == 8) {
                                var107.field2528 = new class60(var108, 4, var103 + 4, Statics.field3652, var98, var99, var100, false, var107.field2528);
                                var107.field2529 = new class60(var108, 4, (var103 + 2 & 0x3) + 4, Statics.field3652, var98, var99, var100, false, var107.field2529);
                            }
                        }
                    }
                    if (var104 == 2) {
                        class215 var109 = Statics.field1925.method3607(Statics.field3652, var98, var99);
                        if (var102 == 11) {
                            var102 = 10;
                        }
                        if (var109 != null) {
                            var109.field2536 = new class60(class208.method1867(var109.field2538), var102, var103, Statics.field3652, var98, var99, var100, false, var109.field2536);
                        }
                    }
                    if (var104 == 3) {
                        class194 var110 = Statics.field1925.method3563(Statics.field3652, var98, var99);
                        if (var110 != null) {
                            var110.field2195 = new class60(class208.method1867(var110.field2194), 22, var103, Statics.field3652, var98, var99, var100, false, var110.field2195);
                        }
                    }
                }
            } else if (class228.field2680 == arg0) {
                int var111 = var1.method6174();
                int var112 = var111 >> 2;
                int var113 = var111 & 0x3;
                int var114 = field468[var112];
                int var115 = var1.method5958();
                int var116 = (var115 >> 4 & 0x7) + Statics.field3695;
                int var117 = (var115 & 0x7) + Statics.field859;
                int var118 = var1.method6053();
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    method1689(Statics.field3652, var116, var117, var114, var118, var112, var113, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("bu.hy(IIIIIIIIII)V")
    public static final void method1689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class71 var9 = null;
        for (class71 var10 = (class71) field537.method4721(); var10 != null; var10 = (class71) field537.method4712()) {
            if (var10.field1018 == arg0 && var10.field1016 == arg1 && var10.field1011 == arg2 && var10.field1009 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class71();
            var9.field1018 = arg0;
            var9.field1009 = arg3;
            var9.field1016 = arg1;
            var9.field1011 = arg2;
            method1982(var9);
            field537.method4706(var9);
        }
        var9.field1015 = arg4;
        var9.field1017 = arg5;
        var9.field1014 = arg6;
        var9.field1008 = arg7;
        var9.field1019 = arg8;
    }

    @ObfuscatedName("fp.hn(I)V")
    public static final void method2889() {
        for (class71 var0 = (class71) field537.method4721(); var0 != null; var0 = (class71) field537.method4712()) {
            if (var0.field1019 == -1) {
                var0.field1008 = 0;
                method1982(var0);
            } else {
                var0.method5447();
            }
        }
    }

    @ObfuscatedName("cq.hk(Lbs;B)V")
    public static final void method1982(class71 arg0) {
        long var1 = 0L;
        int var3 = -1;
        int var4 = 0;
        int var5 = 0;
        if (arg0.field1009 == 0) {
            var1 = Statics.field1925.method3564(arg0.field1018, arg0.field1016, arg0.field1011);
        }
        if (arg0.field1009 == 1) {
            var1 = Statics.field1925.method3565(arg0.field1018, arg0.field1016, arg0.field1011);
        }
        if (arg0.field1009 == 2) {
            var1 = Statics.field1925.method3566(arg0.field1018, arg0.field1016, arg0.field1011);
        }
        if (arg0.field1009 == 3) {
            var1 = Statics.field1925.method3669(arg0.field1018, arg0.field1016, arg0.field1011);
        }
        if (var1 != 0L) {
            int var6 = Statics.field1925.method3568(arg0.field1018, arg0.field1016, arg0.field1011, var1);
            var3 = class208.method1867(var1);
            var4 = var6 & 0x1F;
            var5 = var6 >> 6 & 0x3;
        }
        arg0.field1012 = var3;
        arg0.field1010 = var4;
        arg0.field1013 = var5;
    }

    @ObfuscatedName("ig.hj(I)V")
    public static final void method4356() {
        for (class71 var0 = (class71) field537.method4721(); var0 != null; var0 = (class71) field537.method4712()) {
            if (var0.field1019 > 0) {
                var0.field1019--;
            }
            if (var0.field1019 != 0) {
                if (var0.field1008 > 0) {
                    var0.field1008--;
                }
                if (var0.field1008 == 0 && var0.field1016 >= 1 && var0.field1011 >= 1 && var0.field1016 <= 102 && var0.field1011 <= 102) {
                    if (var0.field1015 >= 0) {
                        int var1 = var0.field1015;
                        int var2 = var0.field1017;
                        class156 var3 = class156.method2267(var1);
                        if (var2 == 11) {
                            var2 = 10;
                        }
                        if (var2 >= 5 && var2 <= 8) {
                            var2 = 4;
                        }
                        boolean var4 = var3.method2674(var2);
                        if (!var4) {
                            continue;
                        }
                    }
                    method3726(var0.field1018, var0.field1009, var0.field1016, var0.field1011, var0.field1015, var0.field1014, var0.field1017);
                    var0.field1008 = -1;
                    if (var0.field1015 == var0.field1012 && var0.field1012 == -1) {
                        var0.method5447();
                    } else if (var0.field1015 == var0.field1012 && var0.field1014 == var0.field1013 && var0.field1017 == var0.field1010) {
                        var0.method5447();
                    }
                }
            } else if (var0.field1012 < 0 || class62.method2278(var0.field1012, var0.field1010)) {
                method3726(var0.field1018, var0.field1009, var0.field1016, var0.field1011, var0.field1012, var0.field1013, var0.field1010);
                var0.method5447();
            }
        }
    }

    @ObfuscatedName("gy.hw(IIIIIIII)V")
    public static final void method3726(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field409 && Statics.field3652 != arg0) {
            return;
        }
        long var7 = 0L;
        boolean var9 = true;
        boolean var10 = false;
        boolean var11 = false;
        if (arg1 == 0) {
            var7 = Statics.field1925.method3564(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1925.method3565(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1925.method3566(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1925.method3669(arg0, arg2, arg3);
        }
        if (var7 != 0L) {
            int var12 = Statics.field1925.method3568(arg0, arg2, arg3, var7);
            int var13 = class208.method1867(var7);
            int var14 = var12 & 0x1F;
            int var15 = var12 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1925.method3555(arg0, arg2, arg3);
                class156 var16 = class156.method2267(var13);
                if (var16.field1752 != 0) {
                    field465[arg0].method2857(arg2, arg3, var14, var15, var16.field1779);
                }
            }
            if (arg1 == 1) {
                Statics.field1925.method3556(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1925.method3592(arg0, arg2, arg3);
                class156 var17 = class156.method2267(var13);
                if (var17.field1750 + arg2 > 103 || var17.field1750 + arg3 > 103 || var17.field1751 + arg2 > 103 || var17.field1751 + arg3 > 103) {
                    return;
                }
                if (var17.field1752 != 0) {
                    field465[arg0].method2875(arg2, arg3, var17.field1750, var17.field1751, var15, var17.field1779);
                }
            }
            if (arg1 == 3) {
                Statics.field1925.method3558(arg0, arg2, arg3);
                class156 var18 = class156.method2267(var13);
                if (var18.field1752 == 1) {
                    field465[arg0].method2881(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class62.field901[1][arg2][arg3] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class62.method116(arg0, var19, arg2, arg3, arg4, arg5, arg6, Statics.field1925, field465[arg0]);
    }

    @ObfuscatedName("ai.hz(III)V")
    public static final void method1404(int arg0, int arg1) {
        class296 var2 = field536[Statics.field3652][arg0][arg1];
        if (var2 == null) {
            Statics.field1925.method3559(Statics.field3652, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class82 var5 = null;
        for (class82 var6 = (class82) var2.method4721(); var6 != null; var6 = (class82) var2.method4712()) {
            class157 var7 = class157.method101(var6.field1167);
            long var8 = (long) var7.field1807;
            if (var7.field1806 == 1) {
                var8 = (long) (var6.field1164 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1925.method3559(Statics.field3652, arg0, arg1);
            return;
        }
        var2.method4707(var5);
        class82 var10 = null;
        class82 var11 = null;
        for (class82 var12 = (class82) var2.method4721(); var12 != null; var12 = (class82) var2.method4712()) {
            if (var5.field1167 != var12.field1167) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field1167 != var12.field1167 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        long var13 = class208.method3213(arg0, arg1, 3, false, 0);
        Statics.field1925.method3545(Statics.field3652, arg0, arg1, Statics.method2240(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field3652), var5, var13, var10, var11);
    }

    @ObfuscatedName("ez.hu(ZLnu;B)V")
    public static final void method2587(boolean arg0, class384 arg1) {
        field529 = 0;
        field501 = 0;
        class384 var2 = field453.field1201;
        var2.method5902();
        int var3 = var2.method5903(8);
        if (var3 < field685) {
            for (int var4 = var3; var4 < field685; var4++) {
                field628[++field529 - 1] = field450[var4];
            }
        }
        if (var3 > field685) {
            throw new RuntimeException("");
        }
        field685 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = field450[var5];
            class78 var7 = field567[var6];
            int var8 = var2.method5903(1);
            if (var8 == 0) {
                field450[++field685 - 1] = var6;
                var7.field1070 = field452;
            } else {
                int var9 = var2.method5903(2);
                if (var9 == 0) {
                    field450[++field685 - 1] = var6;
                    var7.field1070 = field452;
                    field475[++field501 - 1] = var6;
                } else if (var9 == 1) {
                    field450[++field685 - 1] = var6;
                    var7.field1070 = field452;
                    int var10 = var2.method5903(3);
                    var7.method1856(var10, (byte) 1);
                    int var11 = var2.method5903(1);
                    if (var11 == 1) {
                        field475[++field501 - 1] = var6;
                    }
                } else if (var9 == 2) {
                    field450[++field685 - 1] = var6;
                    var7.field1070 = field452;
                    int var12 = var2.method5903(3);
                    var7.method1856(var12, (byte) 2);
                    int var13 = var2.method5903(3);
                    var7.method1856(var13, (byte) 2);
                    int var14 = var2.method5903(1);
                    if (var14 == 1) {
                        field475[++field501 - 1] = var6;
                    }
                } else if (var9 == 3) {
                    field628[++field529 - 1] = var6;
                }
            }
        }
        method2103(arg0, arg1);
        for (int var15 = 0; var15 < field501; var15++) {
            int var16 = field475[var15];
            class78 var17 = field567[var16];
            int var18 = arg1.method5958();
            if ((var18 & 0x80) != 0) {
                var17.field1063 = arg1.method5991();
                var17.field1065 = arg1.method5991();
                var17.field1064 = arg1.method5990();
                var17.field1066 = arg1.method5945();
                var17.field1074 = arg1.method6086() + field452;
                var17.field1068 = arg1.method6053() + field452;
                var17.field1051 = arg1.method6053();
                var17.field1027 = 1;
                var17.field1067 = 0;
                var17.field1063 += var17.field1076[0];
                var17.field1065 += var17.field1077[0];
                var17.field1064 += var17.field1076[0];
                var17.field1066 += var17.field1077[0];
            }
            if ((var18 & 0x20) != 0) {
                int var19 = arg1.method6053();
                int var20 = arg1.method5998();
                int var21 = var17.field1069 - (var19 - Statics.field3625 - Statics.field3625) * 64;
                int var22 = var17.field1059 - (var20 - Statics.field1134 - Statics.field1134) * 64;
                if (var21 != 0 || var22 != 0) {
                    var17.field1049 = (int) (Math.atan2((double) var21, (double) var22) * 325.949D) & 0x7FF;
                }
            }
            if ((var18 & 0x40) != 0) {
                var17.field1132 = class148.method2089(arg1.method6053());
                var17.field1024 = var17.field1132.field1622;
                var17.field1075 = var17.field1132.field1645;
                var17.field1029 = var17.field1132.field1628;
                var17.field1072 = var17.field1132.field1629;
                var17.field1046 = var17.field1132.field1630;
                var17.field1021 = var17.field1132.field1631;
                var17.field1030 = var17.field1132.field1625;
                var17.field1052 = var17.field1132.field1626;
                var17.field1020 = var17.field1132.field1624;
            }
            if ((var18 & 0x10) != 0) {
                int var23 = arg1.method5998();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = arg1.method5958();
                if (var17.field1053 == var23 && var23 != -1) {
                    int var25 = class159.method1334(var23).field1876;
                    if (var25 == 1) {
                        var17.field1054 = 0;
                        var17.field1055 = 0;
                        var17.field1056 = var24;
                        var17.field1057 = 0;
                    }
                    if (var25 == 2) {
                        var17.field1057 = 0;
                    }
                } else if (var23 == -1 || var17.field1053 == -1 || class159.method1334(var23).field1864 >= class159.method1334(var17.field1053).field1864) {
                    var17.field1053 = var23;
                    var17.field1054 = 0;
                    var17.field1055 = 0;
                    var17.field1056 = var24;
                    var17.field1057 = 0;
                    var17.field1067 = var17.field1027;
                }
            }
            if ((var18 & 0x1) != 0) {
                int var26 = arg1.method5987();
                if (var26 > 0) {
                    for (int var27 = 0; var27 < var26; var27++) {
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = -1;
                        int var31 = arg1.method5972();
                        if (var31 == 32767) {
                            var31 = arg1.method5972();
                            var29 = arg1.method5972();
                            var28 = arg1.method5972();
                            var30 = arg1.method5972();
                        } else if (var31 == 32766) {
                            var31 = -1;
                        } else {
                            var29 = arg1.method5972();
                        }
                        int var32 = arg1.method5972();
                        var17.method1783(var31, var29, var28, var30, field452, var32);
                    }
                }
                int var33 = arg1.method6174();
                if (var33 > 0) {
                    for (int var34 = 0; var34 < var33; var34++) {
                        int var35 = arg1.method5972();
                        int var36 = arg1.method5972();
                        if (var36 == 32767) {
                            var17.method1777(var35);
                        } else {
                            int var37 = arg1.method5972();
                            int var38 = arg1.method6174();
                            int var39 = var36 > 0 ? arg1.method5958() : var38;
                            var17.method1776(var35, field452, var36, var37, var38, var39);
                        }
                    }
                }
            }
            if ((var18 & 0x4) != 0) {
                var17.field1034 = arg1.method5967();
                var17.field1037 = 100;
            }
            if ((var18 & 0x2) != 0) {
                var17.field1058 = arg1.method6086();
                int var40 = arg1.method6007();
                var17.field1062 = var40 >> 16;
                var17.field1061 = (var40 & 0xFFFF) + field452;
                var17.field1028 = 0;
                var17.field1060 = 0;
                if (var17.field1061 > field452) {
                    var17.field1028 = -1;
                }
                if (var17.field1058 == 65535) {
                    var17.field1058 = -1;
                }
            }
            if ((var18 & 0x8) != 0) {
                var17.field1047 = arg1.method6053();
                if (var17.field1047 == 65535) {
                    var17.field1047 = -1;
                }
            }
        }
        for (int var41 = 0; var41 < field529; var41++) {
            int var42 = field628[var41];
            if (field452 != field567[var42].field1070) {
                field567[var42].field1132 = null;
                field567[var42] = null;
            }
        }
        if (field453.field1209 != arg1.field4182) {
            throw new RuntimeException(arg1.field4182 + class79.field1140 + field453.field1209);
        }
        for (int var43 = 0; var43 < field685; var43++) {
            if (field567[field450[var43]] == null) {
                throw new RuntimeException(var43 + class79.field1140 + field685);
            }
        }
    }

    @ObfuscatedName("ca.hm(ZLnu;I)V")
    public static final void method2103(boolean arg0, class384 arg1) {
        while (true) {
            if (arg1.method5911(field453.field1209) >= 27) {
                int var2 = arg1.method5903(15);
                if (var2 != 32767) {
                    boolean var3 = false;
                    if (field567[var2] == null) {
                        field567[var2] = new class78();
                        var3 = true;
                    }
                    class78 var4 = field567[var2];
                    field450[++field685 - 1] = var2;
                    var4.field1070 = field452;
                    int var5 = arg1.method5903(1);
                    if (var5 == 1) {
                        field475[++field501 - 1] = var2;
                    }
                    int var6 = field534[arg1.method5903(3)];
                    if (var3) {
                        var4.field1043 = var4.field1022 = var6;
                    }
                    int var7;
                    if (arg0) {
                        var7 = arg1.method5903(8);
                        if (var7 > 127) {
                            var7 -= 256;
                        }
                    } else {
                        var7 = arg1.method5903(5);
                        if (var7 > 15) {
                            var7 -= 32;
                        }
                    }
                    int var8;
                    if (arg0) {
                        var8 = arg1.method5903(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = arg1.method5903(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    boolean var9 = arg1.method5903(1) == 1;
                    if (var9) {
                        arg1.method5903(32);
                    }
                    var4.field1132 = class148.method2089(arg1.method5903(14));
                    int var10 = arg1.method5903(1);
                    var4.field1024 = var4.field1132.field1622;
                    var4.field1075 = var4.field1132.field1645;
                    if (var4.field1075 == 0) {
                        var4.field1022 = 0;
                    }
                    var4.field1029 = var4.field1132.field1628;
                    var4.field1072 = var4.field1132.field1629;
                    var4.field1046 = var4.field1132.field1630;
                    var4.field1021 = var4.field1132.field1631;
                    var4.field1030 = var4.field1132.field1625;
                    var4.field1052 = var4.field1132.field1626;
                    var4.field1020 = var4.field1132.field1624;
                    var4.method1857(Statics.field140.field1076[0] + var7, Statics.field140.field1077[0] + var8, var10 == 1);
                    continue;
                }
            }
            arg1.method5923();
            return;
        }
    }

    @ObfuscatedName("dm.hx(I)V")
    public static void method2217() {
        field545 = 0;
        field544 = false;
    }

    @ObfuscatedName("r.hv(I)V")
    public static void method102() {
        method2217();
        field485[0] = class270.field3479;
        field551[0] = "";
        field548[0] = 1006;
        field674[0] = false;
        field545 = 1;
    }

    @ObfuscatedName("kj.hg(I)Z")
    public static final boolean method4690() {
        return field544;
    }

    @ObfuscatedName("ej.hi(IIIII)V")
    public static final void method2516(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field591; var4++) {
            if (field623[var4] + field622[var4] > arg0 && field623[var4] < arg0 + arg2 && field626[var4] + field619[var4] > arg1 && field626[var4] < arg1 + arg3) {
                field618[var4] = true;
            }
        }
    }

    @ObfuscatedName("client.hb(B)V")
    public final void method848() {
        method3881();
        if (Statics.field688 != null || field581 != null) {
            return;
        }
        int var28;
        int var30;
        int var31;
        label228: {
            int var1 = class20.field149;
            if (field544) {
                if (var1 != 1 && (Statics.field3777 || var1 != 4)) {
                    int var2 = class20.field142;
                    int var3 = class20.field145;
                    if (var2 < Statics.field1659 - 10 || var2 > Statics.field69 + Statics.field1659 + 10 || var3 < Statics.field3907 - 10 || var3 > Statics.field772 + Statics.field3907 + 10) {
                        field544 = false;
                        int var4 = Statics.field1659;
                        int var5 = Statics.field3907;
                        int var6 = Statics.field69;
                        int var7 = Statics.field772;
                        for (int var8 = 0; var8 < field591; var8++) {
                            if (field623[var8] + field622[var8] > var4 && field623[var8] < var4 + var6 && field626[var8] + field619[var8] > var5 && field626[var8] < var5 + var7) {
                                field617[var8] = true;
                            }
                        }
                    }
                }
                if (var1 == 1 || !Statics.field3777 && var1 == 4) {
                    int var9 = Statics.field1659;
                    int var10 = Statics.field3907;
                    int var11 = Statics.field69;
                    int var12 = class20.field150;
                    int var13 = class20.field151;
                    int var14 = -1;
                    for (int var15 = 0; var15 < field545; var15++) {
                        int var16 = (field545 - 1 - var15) * 15 + var10 + 31;
                        if (var12 > var9 && var12 < var9 + var11 && var13 > var16 - 13 && var13 < var16 + 3) {
                            var14 = var15;
                        }
                    }
                    if (var14 != -1 && var14 >= 0) {
                        int var17 = field678[var14];
                        int var18 = field547[var14];
                        int var19 = field548[var14];
                        int var20 = field549[var14];
                        String var21 = field485[var14];
                        String var22 = field551[var14];
                        method2238(var17, var18, var19, var20, var21, var22, class20.field150, class20.field151);
                    }
                    field544 = false;
                    int var23 = Statics.field1659;
                    int var24 = Statics.field3907;
                    int var25 = Statics.field69;
                    int var26 = Statics.field772;
                    for (int var27 = 0; var27 < field591; var27++) {
                        if (field623[var27] + field622[var27] > var23 && field623[var27] < var23 + var25 && field626[var27] + field619[var27] > var24 && field626[var27] < var24 + var26) {
                            field617[var27] = true;
                        }
                    }
                }
            } else {
                var28 = method2885();
                if ((var1 == 1 || !Statics.field3777 && var1 == 4) && var28 >= 0) {
                    int var29 = field548[var28];
                    if (var29 == 39 || var29 == 40 || var29 == 41 || var29 == 42 || var29 == 43 || var29 == 33 || var29 == 34 || var29 == 35 || var29 == 36 || var29 == 37 || var29 == 38 || var29 == 1005) {
                        var30 = field678[var28];
                        var31 = field547[var28];
                        class249 var32 = class249.method2019(var31);
                        if (class250.method2507(method4179(var32))) {
                            break label228;
                        }
                        int var33 = method4179(var32);
                        boolean var34 = (var33 >> 29 & 0x1) != 0;
                        if (var34) {
                            break label228;
                        }
                    }
                }
                if ((var1 == 1 || !Statics.field3777 && var1 == 4) && this.method951()) {
                    var1 = 2;
                }
                if ((var1 == 1 || !Statics.field3777 && var1 == 4) && field545 > 0 && var28 >= 0) {
                    int var37 = field678[var28];
                    int var38 = field547[var28];
                    int var39 = field548[var28];
                    int var40 = field549[var28];
                    String var41 = field485[var28];
                    String var42 = field551[var28];
                    method2238(var37, var38, var39, var40, var41, var42, class20.field150, class20.field151);
                }
                if (var1 == 2 && field545 > 0) {
                    this.method850(class20.field150, class20.field151);
                }
            }
            return;
        }
        if (Statics.field688 != null && !field520 && field545 > 0 && !this.method951()) {
            int var35 = field404;
            int var36 = field584;
            Statics.method518(Statics.field1305, var35, var36);
            Statics.field1305 = null;
        }
        field520 = false;
        field521 = 0;
        if (Statics.field688 != null) {
            method1893(Statics.field688);
        }
        Statics.field688 = class249.method2019(var31);
        field516 = var30;
        field404 = class20.field150;
        field584 = class20.field151;
        if (var28 >= 0) {
            Statics.field1305 = new class54();
            Statics.field1305.field791 = field678[var28];
            Statics.field1305.field787 = field547[var28];
            Statics.field1305.field786 = field548[var28];
            Statics.field1305.field789 = field549[var28];
            Statics.field1305.field790 = field485[var28];
        }
        method1893(Statics.field688);
    }

    @ObfuscatedName("client.hr(I)Z")
    public final boolean method951() {
        int var1 = method2885();
        return (field528 == 1 && field545 > 2 || method1832(var1)) && !field674[var1];
    }

    @ObfuscatedName("client.hq(III)V")
    public final void method850(int arg0, int arg1) {
        method2565(arg0, arg1);
        Statics.field1925.method3575(Statics.field3652, arg0, arg1, false);
        field544 = true;
    }

    @ObfuscatedName("bf.hd(B)V")
    public static void method1620() {
        method2565(Statics.field69 / 2 + Statics.field1659, Statics.field3907);
    }

    @ObfuscatedName("en.ix(III)V")
    public static void method2565(int arg0, int arg1) {
        int var2 = Statics.field1468.method4887(class270.field3383);
        for (int var3 = 0; var3 < field545; var3++) {
            class302 var4 = Statics.field1468;
            String var5;
            if (var3 < 0) {
                var5 = "";
            } else if (field551[var3].length() > 0) {
                var5 = field485[var3] + class270.field3267 + field551[var3];
            } else {
                var5 = field485[var3];
            }
            int var6 = var4.method4887(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field545 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field971) {
            var8 = Statics.field971 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field687) {
            var9 = Statics.field687 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        Statics.field1659 = var8;
        Statics.field3907 = var9;
        Statics.field69 = var2;
        Statics.field772 = field545 * 15 + 22;
    }

    @ObfuscatedName("bc.iv(II)Z")
    public static final boolean method1832(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field548[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("ds.if(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method2238(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 37) {
            class229 var8 = class229.method2538(class227.field2660, field453.field1205);
            var8.field2691.method6002(arg1);
            var8.field2691.method6087(arg3);
            var8.field2691.method5993(arg0);
            field453.method1987(var8);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 46) {
            class70 var9 = field524[arg3];
            if (var9 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var10 = class229.method2538(class227.field2661, field453.field1205);
                var10.field2691.method5986(class11.field46[82] ? 1 : 0);
                var10.field2691.method6087(arg3);
                field453.method1987(var10);
            }
        }
        if (arg2 == 10) {
            class78 var11 = field567[arg3];
            if (var11 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var12 = class229.method2538(class227.field2575, field453.field1205);
                var12.field2691.method6132(arg3);
                var12.field2691.method6077(class11.field46[82] ? 1 : 0);
                field453.method1987(var12);
            }
        }
        if (arg2 == 47) {
            class70 var13 = field524[arg3];
            if (var13 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var14 = class229.method2538(class227.field2651, field453.field1205);
                var14.field2691.method5994(arg3);
                var14.field2691.method6077(class11.field46[82] ? 1 : 0);
                field453.method1987(var14);
            }
        }
        if (arg2 == 45) {
            class70 var15 = field524[arg3];
            if (var15 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var16 = class229.method2538(class227.field2605, field453.field1205);
                var16.field2691.method6132(arg3);
                var16.field2691.method6077(class11.field46[82] ? 1 : 0);
                field453.method1987(var16);
            }
        }
        if (arg2 == 1002) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            class229 var17 = class229.method2538(class227.field2621, field453.field1205);
            var17.field2691.method5994(arg3);
            field453.method1987(var17);
        }
        if (arg2 == 35) {
            class229 var18 = class229.method2538(class227.field2582, field453.field1205);
            var18.field2691.method5994(arg3);
            var18.field2691.method6002(arg1);
            var18.field2691.method6132(arg0);
            field453.method1987(var18);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 31) {
            class229 var19 = class229.method2538(class227.field2629, field453.field1205);
            var19.field2691.method6004(Statics.field912);
            var19.field2691.method6132(Statics.field1295);
            var19.field2691.method5982(arg1);
            var19.field2691.method5993(arg3);
            var19.field2691.method5993(arg0);
            var19.field2691.method5993(Statics.field41);
            field453.method1987(var19);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 51) {
            class70 var20 = field524[arg3];
            if (var20 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var21 = class229.method2538(class227.field2589, field453.field1205);
                var21.field2691.method6132(arg3);
                var21.field2691.method6077(class11.field46[82] ? 1 : 0);
                field453.method1987(var21);
            }
        }
        if (arg2 == 40) {
            class229 var22 = class229.method2538(class227.field2615, field453.field1205);
            var22.field2691.method6002(arg1);
            var22.field2691.method5993(arg0);
            var22.field2691.method5994(arg3);
            field453.method1987(var22);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 50) {
            class70 var23 = field524[arg3];
            if (var23 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var24 = class229.method2538(class227.field2628, field453.field1205);
                var24.field2691.method5984(class11.field46[82] ? 1 : 0);
                var24.field2691.method5994(arg3);
                field453.method1987(var24);
            }
        }
        if (arg2 == 18) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var25 = class229.method2538(class227.field2595, field453.field1205);
            var25.field2691.method5993(arg3);
            var25.field2691.method6087(Statics.field3625 + arg0);
            var25.field2691.method5993(Statics.field1134 + arg1);
            var25.field2691.method5941(class11.field46[82] ? 1 : 0);
            field453.method1987(var25);
        }
        if (arg2 == 7) {
            class78 var26 = field567[arg3];
            if (var26 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var27 = class229.method2538(class227.field2616, field453.field1205);
                var27.field2691.method6087(Statics.field1295);
                var27.field2691.method6002(Statics.field912);
                var27.field2691.method5993(arg3);
                var27.field2691.method5941(class11.field46[82] ? 1 : 0);
                var27.field2691.method6132(Statics.field41);
                field453.method1987(var27);
            }
        }
        if (arg2 == 1004) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            class229 var28 = class229.method2538(class227.field2587, field453.field1205);
            var28.field2691.method5994(arg3);
            field453.method1987(var28);
        }
        if (arg2 == 1005) {
            class249 var29 = class249.method2019(arg1);
            if (var29 == null || var29.field3087[arg0] < 100000) {
                class229 var30 = class229.method2538(class227.field2587, field453.field1205);
                var30.field2691.method5994(arg3);
                field453.method1987(var30);
            } else {
                class85.method2228(27, "", var29.field3087[arg0] + " x " + class157.method101(arg3).field1836);
            }
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 34) {
            class229 var31 = class229.method2538(class227.field2630, field453.field1205);
            var31.field2691.method5982(arg1);
            var31.field2691.method6087(arg3);
            var31.field2691.method6132(arg0);
            field453.method1987(var31);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 48) {
            class70 var32 = field524[arg3];
            if (var32 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var33 = class229.method2538(class227.field2611, field453.field1205);
                var33.field2691.method6087(arg3);
                var33.field2691.method5941(class11.field46[82] ? 1 : 0);
                field453.method1987(var33);
            }
        }
        if (arg2 == 49) {
            class70 var34 = field524[arg3];
            if (var34 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var35 = class229.method2538(class227.field2570, field453.field1205);
                var35.field2691.method6132(arg3);
                var35.field2691.method5986(class11.field46[82] ? 1 : 0);
                field453.method1987(var35);
            }
        }
        if (arg2 == 12) {
            class78 var36 = field567[arg3];
            if (var36 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var37 = class229.method2538(class227.field2627, field453.field1205);
                var37.field2691.method6077(class11.field46[82] ? 1 : 0);
                var37.field2691.method5994(arg3);
                field453.method1987(var37);
            }
        }
        if (arg2 == 23) {
            if (field544) {
                Statics.field1925.method3719();
            } else {
                Statics.field1925.method3575(Statics.field3652, arg0, arg1, true);
            }
        }
        if (arg2 == 19) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var38 = class229.method2538(class227.field2590, field453.field1205);
            var38.field2691.method6087(Statics.field1134 + arg1);
            var38.field2691.method6087(Statics.field3625 + arg0);
            var38.field2691.method5941(class11.field46[82] ? 1 : 0);
            var38.field2691.method6087(arg3);
            field453.method1987(var38);
        }
        if (arg2 == 43) {
            class229 var39 = class229.method2538(class227.field2668, field453.field1205);
            var39.field2691.method6002(arg1);
            var39.field2691.method5993(arg3);
            var39.field2691.method6087(arg0);
            field453.method1987(var39);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 1) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var40 = class229.method2538(class227.field2618, field453.field1205);
            var40.field2691.method5941(class11.field46[82] ? 1 : 0);
            var40.field2691.method5994(Statics.field41);
            var40.field2691.method6004(Statics.field912);
            var40.field2691.method6132(arg3);
            var40.field2691.method6132(Statics.field1295);
            var40.field2691.method6132(Statics.field3625 + arg0);
            var40.field2691.method6087(Statics.field1134 + arg1);
            field453.method1987(var40);
        }
        if (arg2 == 17) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var41 = class229.method2538(class227.field2566, field453.field1205);
            var41.field2691.method5982(Statics.field185);
            var41.field2691.method5993(arg3);
            var41.field2691.method5986(class11.field46[82] ? 1 : 0);
            var41.field2691.method5993(field564);
            var41.field2691.method5994(Statics.field3625 + arg0);
            var41.field2691.method5994(Statics.field1134 + arg1);
            var41.field2691.method5994(field565);
            field453.method1987(var41);
        }
        if (arg2 == 22) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var42 = class229.method2538(class227.field2597, field453.field1205);
            var42.field2691.method6087(Statics.field3625 + arg0);
            var42.field2691.method6087(Statics.field1134 + arg1);
            var42.field2691.method5994(arg3);
            var42.field2691.method5986(class11.field46[82] ? 1 : 0);
            field453.method1987(var42);
        }
        if (arg2 == 16) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var43 = class229.method2538(class227.field2594, field453.field1205);
            var43.field2691.method6087(Statics.field1134 + arg1);
            var43.field2691.method6087(Statics.field41);
            var43.field2691.method6002(Statics.field912);
            var43.field2691.method5941(class11.field46[82] ? 1 : 0);
            var43.field2691.method5993(arg3);
            var43.field2691.method6087(Statics.field1295);
            var43.field2691.method5994(Statics.field3625 + arg0);
            field453.method1987(var43);
        }
        if (arg2 == 1003) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            class78 var44 = field567[arg3];
            if (var44 != null) {
                class148 var45 = var44.field1132;
                if (var45.field1646 != null) {
                    var45 = var45.method2514();
                }
                if (var45 != null) {
                    class229 var46 = class229.method2538(class227.field2648, field453.field1205);
                    var46.field2691.method5993(var45.field1627);
                    field453.method1987(var46);
                }
            }
        }
        if (arg2 == 2) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var47 = class229.method2538(class227.field2598, field453.field1205);
            var47.field2691.method6077(class11.field46[82] ? 1 : 0);
            var47.field2691.method5994(arg3);
            var47.field2691.method6087(Statics.field1134 + arg1);
            var47.field2691.method5944(Statics.field185);
            var47.field2691.method6087(Statics.field3625 + arg0);
            var47.field2691.method6087(field565);
            var47.field2691.method6087(field564);
            field453.method1987(var47);
        }
        if (arg2 == 38) {
            method2929();
            class249 var48 = class249.method2019(arg1);
            field561 = 1;
            Statics.field41 = arg0;
            Statics.field912 = arg1;
            Statics.field1295 = arg3;
            method1893(var48);
            field530 = class79.method786(16748608) + class157.method101(arg3).field1836 + class79.method786(16777215);
            if (field530 == null) {
                field530 = class270.field3234;
            }
            return;
        }
        if (arg2 == 3) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var49 = class229.method2538(class227.field2623, field453.field1205);
            var49.field2691.method6077(class11.field46[82] ? 1 : 0);
            var49.field2691.method5994(Statics.field1134 + arg1);
            var49.field2691.method5994(Statics.field3625 + arg0);
            var49.field2691.method5994(arg3);
            field453.method1987(var49);
        }
        if (arg2 == 15) {
            class70 var50 = field524[arg3];
            if (var50 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var51 = class229.method2538(class227.field2593, field453.field1205);
                var51.field2691.method6087(field565);
                var51.field2691.method6004(Statics.field185);
                var51.field2691.method6077(class11.field46[82] ? 1 : 0);
                var51.field2691.method6087(field564);
                var51.field2691.method6132(arg3);
                field453.method1987(var51);
            }
        }
        if (arg2 == 20) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var52 = class229.method2538(class227.field2600, field453.field1205);
            var52.field2691.method5994(Statics.field3625 + arg0);
            var52.field2691.method5986(class11.field46[82] ? 1 : 0);
            var52.field2691.method5994(Statics.field1134 + arg1);
            var52.field2691.method5994(arg3);
            field453.method1987(var52);
        }
        if (arg2 == 36) {
            class229 var53 = class229.method2538(class227.field2620, field453.field1205);
            var53.field2691.method6132(arg0);
            var53.field2691.method6087(arg3);
            var53.field2691.method6002(arg1);
            field453.method1987(var53);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 41) {
            class229 var54 = class229.method2538(class227.field2636, field453.field1205);
            var54.field2691.method5982(arg1);
            var54.field2691.method5993(arg3);
            var54.field2691.method6132(arg0);
            field453.method1987(var54);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 30 && field574 == null) {
            method3454(arg1, arg0);
            field574 = class249.method1416(arg1, arg0);
            method1893(field574);
        }
        if (arg2 == 33) {
            class229 var55 = class229.method2538(class227.field2563, field453.field1205);
            var55.field2691.method5982(arg1);
            var55.field2691.method5994(arg0);
            var55.field2691.method5994(arg3);
            field453.method1987(var55);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 42) {
            class229 var56 = class229.method2538(class227.field2567, field453.field1205);
            var56.field2691.method5994(arg3);
            var56.field2691.method6132(arg0);
            var56.field2691.method6002(arg1);
            field453.method1987(var56);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 39) {
            class229 var57 = class229.method2538(class227.field2573, field453.field1205);
            var57.field2691.method6132(arg3);
            var57.field2691.method5993(arg0);
            var57.field2691.method5944(arg1);
            field453.method1987(var57);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 11) {
            class78 var58 = field567[arg3];
            if (var58 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var59 = class229.method2538(class227.field2610, field453.field1205);
                var59.field2691.method5994(arg3);
                var59.field2691.method5984(class11.field46[82] ? 1 : 0);
                field453.method1987(var59);
            }
        }
        if (arg2 == 32) {
            class229 var60 = class229.method2538(class227.field2631, field453.field1205);
            var60.field2691.method6087(arg3);
            var60.field2691.method5982(arg1);
            var60.field2691.method5993(arg0);
            var60.field2691.method6004(Statics.field185);
            var60.field2691.method5994(field564);
            field453.method1987(var60);
            field513 = 0;
            Statics.field78 = class249.method2019(arg1);
            field514 = arg0;
        }
        if (arg2 == 1001) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var61 = class229.method2538(class227.field2612, field453.field1205);
            var61.field2691.method6132(arg3);
            var61.field2691.method5994(Statics.field1134 + arg1);
            var61.field2691.method5941(class11.field46[82] ? 1 : 0);
            var61.field2691.method5994(Statics.field3625 + arg0);
            field453.method1987(var61);
        }
        if (arg2 == 26) {
            method483();
        }
        if (arg2 == 6) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var62 = class229.method2538(class227.field2619, field453.field1205);
            var62.field2691.method5994(Statics.field1134 + arg1);
            var62.field2691.method6087(Statics.field3625 + arg0);
            var62.field2691.method5993(arg3);
            var62.field2691.method5984(class11.field46[82] ? 1 : 0);
            field453.method1987(var62);
        }
        if (arg2 == 44) {
            class70 var63 = field524[arg3];
            if (var63 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var64 = class229.method2538(class227.field2625, field453.field1205);
                var64.field2691.method5941(class11.field46[82] ? 1 : 0);
                var64.field2691.method6087(arg3);
                field453.method1987(var64);
            }
        }
        if (arg2 == 9) {
            class78 var65 = field567[arg3];
            if (var65 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var66 = class229.method2538(class227.field2607, field453.field1205);
                var66.field2691.method6087(arg3);
                var66.field2691.method5984(class11.field46[82] ? 1 : 0);
                field453.method1987(var66);
            }
        }
        if (arg2 == 28) {
            class229 var67 = class229.method2538(class227.field2652, field453.field1205);
            var67.field2691.method5944(arg1);
            field453.method1987(var67);
            class249 var68 = class249.method2019(arg1);
            if (var68.field3080 != null && var68.field3080[0][0] == 5) {
                int var69 = var68.field3080[0][1];
                class244.field2911[var69] = 1 - class244.field2911[var69];
                method817(var69);
            }
        }
        if (arg2 == 5) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var70 = class229.method2538(class227.field2592, field453.field1205);
            var70.field2691.method5993(Statics.field1134 + arg1);
            var70.field2691.method5994(arg3);
            var70.field2691.method6087(Statics.field3625 + arg0);
            var70.field2691.method6077(class11.field46[82] ? 1 : 0);
            field453.method1987(var70);
        }
        if (arg2 == 57 || arg2 == 1007) {
            class249 var71 = class249.method1416(arg1, arg0);
            if (var71 != null) {
                method3276(arg3, arg1, arg0, var71.field3088, arg5);
            }
        }
        if (arg2 == 13) {
            class78 var72 = field567[arg3];
            if (var72 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var73 = class229.method2538(class227.field2632, field453.field1205);
                var73.field2691.method5941(class11.field46[82] ? 1 : 0);
                var73.field2691.method5993(arg3);
                field453.method1987(var73);
            }
        }
        if (arg2 == 29) {
            class229 var74 = class229.method2538(class227.field2652, field453.field1205);
            var74.field2691.method5944(arg1);
            field453.method1987(var74);
            class249 var75 = class249.method2019(arg1);
            if (var75.field3080 != null && var75.field3080[0][0] == 5) {
                int var76 = var75.field3080[0][1];
                if (class244.field2911[var76] != var75.field3082[0]) {
                    class244.field2911[var76] = var75.field3082[0];
                    method817(var76);
                }
            }
        }
        if (arg2 == 4) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var77 = class229.method2538(class227.field2639, field453.field1205);
            var77.field2691.method5984(class11.field46[82] ? 1 : 0);
            var77.field2691.method5993(Statics.field1134 + arg1);
            var77.field2691.method5993(Statics.field3625 + arg0);
            var77.field2691.method6132(arg3);
            field453.method1987(var77);
        }
        if (arg2 == 24) {
            class249 var78 = class249.method2019(arg1);
            boolean var79 = true;
            if (var78.field2962 > 0) {
                var79 = method5868(var78);
            }
            if (var79) {
                class229 var80 = class229.method2538(class227.field2652, field453.field1205);
                var80.field2691.method5944(arg1);
                field453.method1987(var80);
            }
        }
        if (arg2 == 14) {
            class70 var81 = field524[arg3];
            if (var81 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var82 = class229.method2538(class227.field2656, field453.field1205);
                var82.field2691.method5994(arg3);
                var82.field2691.method6132(Statics.field1295);
                var82.field2691.method6004(Statics.field912);
                var82.field2691.method6087(Statics.field41);
                var82.field2691.method6077(class11.field46[82] ? 1 : 0);
                field453.method1987(var82);
            }
        }
        if (arg2 == 8) {
            class78 var83 = field567[arg3];
            if (var83 != null) {
                field508 = arg6;
                field463 = arg7;
                field511 = 2;
                field540 = 0;
                field644 = arg0;
                field597 = arg1;
                class229 var84 = class229.method2538(class227.field2603, field453.field1205);
                var84.field2691.method6132(field565);
                var84.field2691.method5984(class11.field46[82] ? 1 : 0);
                var84.field2691.method6132(field564);
                var84.field2691.method6004(Statics.field185);
                var84.field2691.method5994(arg3);
                field453.method1987(var84);
            }
        }
        if (arg2 == 58) {
            class249 var85 = class249.method1416(arg1, arg0);
            if (var85 != null) {
                class229 var86 = class229.method2538(class227.field2606, field453.field1205);
                var86.field2691.method5993(var85.field3088);
                var86.field2691.method6002(arg1);
                var86.field2691.method6132(arg0);
                var86.field2691.method5994(field565);
                var86.field2691.method6002(Statics.field185);
                var86.field2691.method6132(field564);
                field453.method1987(var86);
            }
        }
        if (arg2 == 1008 || arg2 == 1009 || arg2 == 1010 || arg2 == 1011 || arg2 == 1012) {
            Statics.field202.method5547(arg2, arg3, new class245(arg0), new class245(arg1));
        }
        if (arg2 == 21) {
            field508 = arg6;
            field463 = arg7;
            field511 = 2;
            field540 = 0;
            field644 = arg0;
            field597 = arg1;
            class229 var87 = class229.method2538(class227.field2585, field453.field1205);
            var87.field2691.method5994(arg3);
            var87.field2691.method5993(Statics.field3625 + arg0);
            var87.field2691.method6087(Statics.field1134 + arg1);
            var87.field2691.method5984(class11.field46[82] ? 1 : 0);
            field453.method1987(var87);
        }
        if (arg2 != 25) {
            if (field561 != 0) {
                field561 = 0;
                method1893(class249.method2019(Statics.field912));
            }
            if (field563) {
                method2929();
            }
            if (Statics.field78 != null && field513 == 0) {
                method1893(Statics.field78);
            }
            return;
        }
        class249 var88 = class249.method1416(arg1, arg0);
        if (var88 == null) {
            return;
        }
        method2929();
        method821(arg1, arg0, class250.method2115(method4179(var88)), var88.field3088);
        field561 = 0;
        field566 = method457(var88);
        if (field566 == null) {
            field566 = class270.field3234;
        }
        if (var88.field2993) {
            field466 = var88.field3037 + class79.method786(16777215);
        } else {
            field466 = class79.method786(65280) + var88.field3041 + class79.method786(16777215);
        }
    }

    @ObfuscatedName("dc.it(ILjava/lang/String;I)V")
    public static void method2133(int arg0, String arg1) {
        int var2 = class83.field1172;
        int[] var3 = class83.field1178;
        boolean var4 = false;
        class406 var5 = new class406(arg1, Statics.field761);
        for (int var6 = 0; var6 < var2; var6++) {
            class70 var7 = field524[var3[var6]];
            if (var7 != null && Statics.field140 != var7 && var7.field980 != null && var7.field980.equals(var5)) {
                if (arg0 == 1) {
                    class229 var8 = class229.method2538(class227.field2625, field453.field1205);
                    var8.field2691.method5941(0);
                    var8.field2691.method6087(var3[var6]);
                    field453.method1987(var8);
                } else if (arg0 == 4) {
                    class229 var9 = class229.method2538(class227.field2651, field453.field1205);
                    var9.field2691.method5994(var3[var6]);
                    var9.field2691.method6077(0);
                    field453.method1987(var9);
                } else if (arg0 == 6) {
                    class229 var10 = class229.method2538(class227.field2570, field453.field1205);
                    var10.field2691.method6132(var3[var6]);
                    var10.field2691.method5986(0);
                    field453.method1987(var10);
                } else if (arg0 == 7) {
                    class229 var11 = class229.method2538(class227.field2628, field453.field1205);
                    var11.field2691.method5984(0);
                    var11.field2691.method5994(var3[var6]);
                    field453.method1987(var11);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class85.method2228(4, "", class270.field3379 + arg1);
        }
    }

    @ObfuscatedName("ap.il(IIIII)V")
    public static void method821(int arg0, int arg1, int arg2, int arg3) {
        class249 var4 = class249.method1416(arg0, arg1);
        if (var4 != null && var4.field2974 != null) {
            class68 var5 = new class68();
            var5.field961 = var4;
            var5.field955 = var4.field2974;
            class51.method2079(var5);
        }
        field565 = arg3;
        field563 = true;
        Statics.field185 = arg0;
        field564 = arg1;
        Statics.field2474 = arg2;
        method1893(var4);
    }

    @ObfuscatedName("fq.iu(I)V")
    public static void method2929() {
        if (!field563) {
            return;
        }
        class249 var0 = class249.method1416(Statics.field185, field564);
        if (var0 != null && var0.field3056 != null) {
            class68 var1 = new class68();
            var1.field961 = var0;
            var1.field955 = var0.field3056;
            class51.method2079(var1);
        }
        field565 = -1;
        field563 = false;
        method1893(var0);
    }

    @ObfuscatedName("gq.ir(IIB)V")
    public static void method3454(int arg0, int arg1) {
        class229 var2 = class229.method2538(class227.field2614, field453.field1205);
        var2.field2691.method6132(arg1);
        var2.field2691.method5982(arg0);
        field453.method1987(var2);
    }

    @ObfuscatedName("gk.iy(IIIILjava/lang/String;I)V")
    public static void method3276(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class249 var5 = class249.method1416(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field3055 != null) {
            class68 var6 = new class68();
            var6.field961 = var5;
            var6.field957 = arg0;
            var6.field952 = arg4;
            var6.field955 = var5.field3055;
            class51.method2079(var6);
        }
        boolean var7 = true;
        if (var5.field2962 > 0) {
            var7 = method5868(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method4179(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            class229 var11 = class229.method2538(class227.field2643, field453.field1205);
            var11.field2691.method5944(arg1);
            var11.field2691.method6132(arg2);
            var11.field2691.method6132(arg3);
            field453.method1987(var11);
        }
        if (arg0 == 2) {
            class229 var12 = class229.method2538(class227.field2645, field453.field1205);
            var12.field2691.method5944(arg1);
            var12.field2691.method6132(arg2);
            var12.field2691.method6132(arg3);
            field453.method1987(var12);
        }
        if (arg0 == 3) {
            class229 var13 = class229.method2538(class227.field2617, field453.field1205);
            var13.field2691.method5944(arg1);
            var13.field2691.method6132(arg2);
            var13.field2691.method6132(arg3);
            field453.method1987(var13);
        }
        if (arg0 == 4) {
            class229 var14 = class229.method2538(class227.field2659, field453.field1205);
            var14.field2691.method5944(arg1);
            var14.field2691.method6132(arg2);
            var14.field2691.method6132(arg3);
            field453.method1987(var14);
        }
        if (arg0 == 5) {
            class229 var15 = class229.method2538(class227.field2583, field453.field1205);
            var15.field2691.method5944(arg1);
            var15.field2691.method6132(arg2);
            var15.field2691.method6132(arg3);
            field453.method1987(var15);
        }
        if (arg0 == 6) {
            class229 var16 = class229.method2538(class227.field2649, field453.field1205);
            var16.field2691.method5944(arg1);
            var16.field2691.method6132(arg2);
            var16.field2691.method6132(arg3);
            field453.method1987(var16);
        }
        if (arg0 == 7) {
            class229 var17 = class229.method2538(class227.field2640, field453.field1205);
            var17.field2691.method5944(arg1);
            var17.field2691.method6132(arg2);
            var17.field2691.method6132(arg3);
            field453.method1987(var17);
        }
        if (arg0 == 8) {
            class229 var18 = class229.method2538(class227.field2608, field453.field1205);
            var18.field2691.method5944(arg1);
            var18.field2691.method6132(arg2);
            var18.field2691.method6132(arg3);
            field453.method1987(var18);
        }
        if (arg0 == 9) {
            class229 var19 = class229.method2538(class227.field2654, field453.field1205);
            var19.field2691.method5944(arg1);
            var19.field2691.method6132(arg2);
            var19.field2691.method6132(arg3);
            field453.method1987(var19);
        }
        if (arg0 != 10) {
            return;
        }
        class229 var20 = class229.method2538(class227.field2571, field453.field1205);
        var20.field2691.method5944(arg1);
        var20.field2691.method6132(arg2);
        var20.field2691.method6132(arg3);
        field453.method1987(var20);
    }

    @ObfuscatedName("he.in(B)V")
    public static final void method3881() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field545 - 1; var1++) {
                if (field548[var1] < 1000 && field548[var1 + 1] > 1000) {
                    String var2 = field551[var1];
                    field551[var1] = field551[var1 + 1];
                    field551[var1 + 1] = var2;
                    String var3 = field485[var1];
                    field485[var1] = field485[var1 + 1];
                    field485[var1 + 1] = var3;
                    int var4 = field548[var1];
                    field548[var1] = field548[var1 + 1];
                    field548[var1 + 1] = var4;
                    int var5 = field678[var1];
                    field678[var1] = field678[var1 + 1];
                    field678[var1 + 1] = var5;
                    int var6 = field547[var1];
                    field547[var1] = field547[var1 + 1];
                    field547[var1 + 1] = var6;
                    int var7 = field549[var1];
                    field549[var1] = field549[var1 + 1];
                    field549[var1 + 1] = var7;
                    boolean var8 = field674[var1];
                    field674[var1] = field674[var1 + 1];
                    field674[var1 + 1] = var8;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("f.ij(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method43(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        method453(arg0, arg1, arg2, arg3, arg4, arg5, false);
    }

    @ObfuscatedName("y.ii(Ljava/lang/String;Ljava/lang/String;IIIIZI)V")
    public static final void method453(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (field544 || field545 >= 500) {
            return;
        }
        field485[field545] = arg0;
        field551[field545] = arg1;
        field548[field545] = arg2;
        field549[field545] = arg3;
        field678[field545] = arg4;
        field547[field545] = arg5;
        field674[field545] = arg6;
        field545++;
    }

    @ObfuscatedName("fy.ih(I)I")
    public static final int method2885() {
        return field545 - 1;
    }

    @ObfuscatedName("ae.iq(II)Z")
    public static boolean method500(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("ja.io(IIIII)V")
    public static final void method4381(int arg0, int arg1, int arg2, int arg3) {
        if (field561 == 0 && !field563) {
            method43(class270.field3385, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        long var4 = -1L;
        long var6 = -1L;
        for (int var8 = 0; var8 < class208.method1858(); var8++) {
            long var9 = class208.field2485[var8];
            if (var6 != var9) {
                var6 = var9;
                int var13 = class208.method3537(var8);
                int var14 = class208.method4605(var8);
                int var15 = class208.method4388(class208.field2485[var8]);
                int var17 = class208.method1867(class208.field2485[var8]);
                int var18 = var17;
                if (var15 == 2 && Statics.field1925.method3568(Statics.field3652, var13, var14, var9) >= 0) {
                    class156 var19 = class156.method2267(var17);
                    if (var19.field1762 != null) {
                        var19 = var19.method2681();
                    }
                    if (var19 == null) {
                        continue;
                    }
                    if (field561 == 1) {
                        method43(class270.field3380, field530 + " " + class79.field1143 + " " + class79.method786(65535) + var19.field1769, 1, var17, var13, var14);
                    } else if (!field563) {
                        String[] var20 = var19.field1783;
                        if (var20 != null) {
                            for (int var21 = 4; var21 >= 0; var21--) {
                                if (var20[var21] != null) {
                                    short var22 = 0;
                                    if (var21 == 0) {
                                        var22 = 3;
                                    }
                                    if (var21 == 1) {
                                        var22 = 4;
                                    }
                                    if (var21 == 2) {
                                        var22 = 5;
                                    }
                                    if (var21 == 3) {
                                        var22 = 6;
                                    }
                                    if (var21 == 4) {
                                        var22 = 1001;
                                    }
                                    method43(var20[var21], class79.method786(65535) + var19.field1769, var22, var18, var13, var14);
                                }
                            }
                        }
                        method43(class270.field3381, class79.method786(65535) + var19.field1769, 1002, var19.field1753, var13, var14);
                    } else if ((Statics.field2474 & 0x4) == 4) {
                        method43(field566, field466 + " " + class79.field1143 + " " + class79.method786(65535) + var19.field1769, 2, var17, var13, var14);
                    }
                }
                if (var15 == 1) {
                    class78 var23 = field567[var18];
                    if (var23 == null) {
                        continue;
                    }
                    if (var23.field1132.field1622 == 1 && (var23.field1069 & 0x7F) == 64 && (var23.field1059 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field685; var24++) {
                            class78 var25 = field567[field450[var24]];
                            if (var25 != null && var23 != var25 && var25.field1132.field1622 == 1 && var23.field1069 == var25.field1069 && var23.field1059 == var25.field1059) {
                                method4659(var25.field1132, field450[var24], var13, var14);
                            }
                        }
                        int var26 = class83.field1172;
                        int[] var27 = class83.field1178;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class70 var29 = field524[var27[var28]];
                            if (var29 != null && var23.field1069 == var29.field1069 && var23.field1059 == var29.field1059) {
                                method11(var29, var27[var28], var13, var14);
                            }
                        }
                    }
                    method4659(var23.field1132, var18, var13, var14);
                }
                if (var15 == 0) {
                    class70 var30 = field524[var18];
                    if (var30 == null) {
                        continue;
                    }
                    if ((var30.field1069 & 0x7F) == 64 && (var30.field1059 & 0x7F) == 64) {
                        for (int var31 = 0; var31 < field685; var31++) {
                            class78 var32 = field567[field450[var31]];
                            if (var32 != null && var32.field1132.field1622 == 1 && var30.field1069 == var32.field1069 && var30.field1059 == var32.field1059) {
                                method4659(var32.field1132, field450[var31], var13, var14);
                            }
                        }
                        int var33 = class83.field1172;
                        int[] var34 = class83.field1178;
                        for (int var35 = 0; var35 < var33; var35++) {
                            class70 var36 = field524[var34[var35]];
                            if (var36 != null && var30 != var36 && var30.field1069 == var36.field1069 && var30.field1059 == var36.field1059) {
                                method11(var36, var34[var35], var13, var14);
                            }
                        }
                    }
                    if (field535 == var18) {
                        var4 = var9;
                    } else {
                        method11(var30, var18, var13, var14);
                    }
                }
                if (var15 == 3) {
                    class296 var37 = field536[Statics.field3652][var13][var14];
                    if (var37 != null) {
                        for (class82 var38 = (class82) var37.method4728(); var38 != null; var38 = (class82) var37.method4713()) {
                            class157 var39 = class157.method101(var38.field1167);
                            if (field561 == 1) {
                                method43(class270.field3380, field530 + " " + class79.field1143 + " " + class79.method786(16748608) + var39.field1836, 16, var38.field1167, var13, var14);
                            } else if (!field563) {
                                String[] var40 = var39.field1809;
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 18;
                                        }
                                        if (var41 == 1) {
                                            var42 = 19;
                                        }
                                        if (var41 == 2) {
                                            var42 = 20;
                                        }
                                        if (var41 == 3) {
                                            var42 = 21;
                                        }
                                        if (var41 == 4) {
                                            var42 = 22;
                                        }
                                        method43(var40[var41], class79.method786(16748608) + var39.field1836, var42, var38.field1167, var13, var14);
                                    } else if (var41 == 2) {
                                        method43(class270.field3227, class79.method786(16748608) + var39.field1836, 20, var38.field1167, var13, var14);
                                    }
                                }
                                method43(class270.field3381, class79.method786(16748608) + var39.field1836, 1004, var38.field1167, var13, var14);
                            } else if ((Statics.field2474 & 0x1) == 1) {
                                method43(field566, field466 + " " + class79.field1143 + " " + class79.method786(16748608) + var39.field1836, 17, var38.field1167, var13, var14);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1L) {
            int var43 = Statics.method816(var4);
            int var44 = class208.method1885(var4);
            class70 var45 = field524[field535];
            method11(var45, field535, var43, var44);
        }
    }

    @ObfuscatedName("kl.ik(Lej;IIII)V")
    public static final void method4659(class148 arg0, int arg1, int arg2, int arg3) {
        if (field545 >= 400) {
            return;
        }
        if (arg0.field1646 != null) {
            arg0 = arg0.method2514();
        }
        if (arg0 == null || !arg0.field1649 || arg0.field1651 && field510 != arg1) {
            return;
        }
        String var4 = arg0.field1620;
        if (arg0.field1616 != 0) {
            int var6 = arg0.field1616;
            int var7 = Statics.field140.field991;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class79.method786(16711680);
            } else if (var8 < -6) {
                var9 = class79.method786(16723968);
            } else if (var8 < -3) {
                var9 = class79.method786(16740352);
            } else if (var8 < 0) {
                var9 = class79.method786(16756736);
            } else if (var8 > 9) {
                var9 = class79.method786(65280);
            } else if (var8 > 6) {
                var9 = class79.method786(4259584);
            } else if (var8 > 3) {
                var9 = class79.method786(8453888);
            } else if (var8 > 0) {
                var9 = class79.method786(12648192);
            } else {
                var9 = class79.method786(16776960);
            }
            var4 = var4 + var9 + " " + class79.field1141 + class270.field3386 + arg0.field1616 + class79.field1139;
        }
        if (arg0.field1651 && field408) {
            method43(class270.field3381, class79.method786(16776960) + var4, 1003, arg1, arg2, arg3);
        }
        if (field561 == 1) {
            method43(class270.field3380, field530 + " " + class79.field1143 + " " + class79.method786(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field563) {
            int var10 = arg0.field1651 && field408 ? 2000 : 0;
            String[] var11 = arg0.field1636;
            if (var11 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var11[var12] != null && !var11[var12].equalsIgnoreCase(class270.field3382)) {
                        int var13 = 0;
                        if (var12 == 0) {
                            var13 = var10 + 9;
                        }
                        if (var12 == 1) {
                            var13 = var10 + 10;
                        }
                        if (var12 == 2) {
                            var13 = var10 + 11;
                        }
                        if (var12 == 3) {
                            var13 = var10 + 12;
                        }
                        if (var12 == 4) {
                            var13 = var10 + 13;
                        }
                        method43(var11[var12], class79.method786(16776960) + var4, var13, arg1, arg2, arg3);
                    }
                }
            }
            if (var11 != null) {
                for (int var14 = 4; var14 >= 0; var14--) {
                    if (var11[var14] != null && var11[var14].equalsIgnoreCase(class270.field3382)) {
                        short var15 = 0;
                        if (field433 != class81.field1160) {
                            if (field433 == class81.field1156 || field433 == class81.field1154 && arg0.field1616 > Statics.field140.field991) {
                                var15 = 2000;
                            }
                            int var16 = 0;
                            if (var14 == 0) {
                                var16 = var15 + 9;
                            }
                            if (var14 == 1) {
                                var16 = var15 + 10;
                            }
                            if (var14 == 2) {
                                var16 = var15 + 11;
                            }
                            if (var14 == 3) {
                                var16 = var15 + 12;
                            }
                            if (var14 == 4) {
                                var16 = var15 + 13;
                            }
                            method43(var11[var14], class79.method786(16776960) + var4, var16, arg1, arg2, arg3);
                        }
                    }
                }
            }
            if (!arg0.field1651 || !field408) {
                method43(class270.field3381, class79.method786(16776960) + var4, 1003, arg1, arg2, arg3);
            }
        } else if ((Statics.field2474 & 0x2) == 2) {
            method43(field566, field466 + " " + class79.field1143 + " " + class79.method786(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("t.ie(Lbb;IIII)V")
    public static final void method11(class70 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field140 == arg0 || field545 >= 400) {
            return;
        }
        String var9;
        if (arg0.field1007 == 0) {
            String var4 = arg0.field982[0] + arg0.field980 + arg0.field982[1];
            int var5 = arg0.field991;
            int var6 = Statics.field140.field991;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class79.method786(16711680);
            } else if (var7 < -6) {
                var8 = class79.method786(16723968);
            } else if (var7 < -3) {
                var8 = class79.method786(16740352);
            } else if (var7 < 0) {
                var8 = class79.method786(16756736);
            } else if (var7 > 9) {
                var8 = class79.method786(65280);
            } else if (var7 > 6) {
                var8 = class79.method786(4259584);
            } else if (var7 > 3) {
                var8 = class79.method786(8453888);
            } else if (var7 > 0) {
                var8 = class79.method786(12648192);
            } else {
                var8 = class79.method786(16776960);
            }
            var9 = var4 + var8 + " " + class79.field1141 + class270.field3386 + arg0.field991 + class79.field1139 + arg0.field982[2];
        } else {
            var9 = arg0.field982[0] + arg0.field980 + arg0.field982[1] + " " + class79.field1141 + class270.field3387 + arg0.field1007 + class79.field1139 + arg0.field982[2];
        }
        if (field561 == 1) {
            method43(class270.field3380, field530 + " " + class79.field1143 + " " + class79.method786(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field563) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field532[var10] != null) {
                    short var11 = 0;
                    if (field532[var10].equalsIgnoreCase(class270.field3382)) {
                        if (field459 == class81.field1160) {
                            continue;
                        }
                        if (field459 == class81.field1156 || field459 == class81.field1154 && arg0.field991 > Statics.field140.field991) {
                            var11 = 2000;
                        }
                        if (Statics.field140.field997 == 0 || arg0.field997 == 0) {
                            if (field459 == class81.field1158 && arg0.method1733()) {
                                var11 = 2000;
                            }
                        } else if (Statics.field140.field997 == arg0.field997) {
                            var11 = 2000;
                        } else {
                            var11 = 0;
                        }
                    } else if (field533[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field531[var10] + var11;
                    method43(field532[var10], class79.method786(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2474 & 0x8) == 8) {
            method43(field566, field466 + " " + class79.field1143 + " " + class79.method786(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field545; var14++) {
            if (field548[var14] == 23) {
                field551[var14] = class79.method786(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("at.ia(IIIIIIIII)V")
    public static final void method781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class249.method4333(arg0)) {
            Statics.field1225 = null;
            method2629(Statics.field3039[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1225 != null) {
                method2629(Statics.field1225, -1412584499, arg1, arg2, arg3, arg4, Statics.field192, Statics.field977, arg7);
                Statics.field1225 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field617[var8] = true;
            }
        } else {
            field617[arg7] = true;
        }
    }

    @ObfuscatedName("et.ig([Lio;IIIIIIIII)V")
    public static final void method2629(class249[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class394.method6286(arg2, arg3, arg4, arg5);
        class198.method3456();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class249 var10 = arg0[var9];
            if (var10 != null && (var10.field3001 == arg1 || arg1 == -1412584499 && field581 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field623[field591] = var10.field2971 + arg6;
                    field626[field591] = var10.field2972 + arg7;
                    field622[field591] = var10.field2973;
                    field619[field591] = var10.field2990;
                    var11 = ++field591 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2966 = var11;
                var10.field3100 = field452;
                if (!var10.field2993 || !method2574(var10)) {
                    if (var10.field2962 > 0) {
                        method742(var10);
                    }
                    int var12 = var10.field2971 + arg6;
                    int var13 = var10.field2972 + arg7;
                    int var14 = var10.field2989;
                    if (field581 == var10) {
                        if (arg1 != -1412584499 && !var10.field3053) {
                            Statics.field1225 = arg0;
                            Statics.field192 = arg6;
                            Statics.field977 = arg7;
                            continue;
                        }
                        if (field592 && field586) {
                            int var15 = class20.field142;
                            int var16 = class20.field145;
                            int var17 = var15 - field583;
                            int var18 = var16 - field525;
                            if (var17 < field587) {
                                var17 = field587;
                            }
                            if (var10.field2973 + var17 > field587 + field582.field2973) {
                                var17 = field587 + field582.field2973 - var10.field2973;
                            }
                            if (var18 < field588) {
                                var18 = field588;
                            }
                            if (var10.field2990 + var18 > field588 + field582.field2990) {
                                var18 = field588 + field582.field2990 - var10.field2990;
                            }
                            var12 = var17;
                            var13 = var18;
                        }
                        if (!var10.field3053) {
                            var14 = 128;
                        }
                    }
                    int var19;
                    int var20;
                    int var21;
                    int var22;
                    if (var10.field2977 == 2) {
                        var19 = arg2;
                        var20 = arg3;
                        var21 = arg4;
                        var22 = arg5;
                    } else if (var10.field2977 == 9) {
                        int var23 = var12;
                        int var24 = var13;
                        int var25 = var10.field2973 + var12;
                        int var26 = var10.field2990 + var13;
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
                        int var29 = var10.field2973 + var12;
                        int var30 = var10.field2990 + var13;
                        var19 = var12 > arg2 ? var12 : arg2;
                        var20 = var13 > arg3 ? var13 : arg3;
                        var21 = var29 < arg4 ? var29 : arg4;
                        var22 = var30 < arg5 ? var30 : arg5;
                    }
                    if (!var10.field2993 || var19 < var21 && var20 < var22) {
                        if (var10.field2962 != 0) {
                            if (var10.field2962 == 1336) {
                                if (field422) {
                                    var13 += 15;
                                    Statics.field3165.method4954("Fps:" + field120, var10.field2973 + var12, var13, 16776960, -1);
                                    var13 += 15;
                                    Runtime var31 = Runtime.getRuntime();
                                    int var32 = (int) ((var31.totalMemory() - var31.freeMemory()) / 1024L);
                                    int var33 = 16776960;
                                    if (var32 > 327680 && !field409) {
                                        var33 = 16711680;
                                    }
                                    Statics.field3165.method4954("Mem:" + var32 + "k", var10.field2973 + var12, var13, var33, -1);
                                    var13 += 15;
                                }
                                continue;
                            }
                            if (var10.field2962 == 1337) {
                                field557 = var12;
                                field558 = var13;
                                method3287(var12, var13, var10.field2973, var10.field2990);
                                field617[var10.field2966] = true;
                                class394.method6286(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2962 == 1338) {
                                method1687(var10, var12, var13, var11);
                                class394.method6286(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2962 == 1339) {
                                method5438(var10, var12, var13, var11);
                                class394.method6286(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2962 == 1400) {
                                Statics.field202.method5511(var12, var13, var10.field2973, var10.field2990, field452);
                            }
                            if (var10.field2962 == 1401) {
                                Statics.field202.method5514(var12, var13, var10.field2973, var10.field2990);
                            }
                            if (var10.field2962 == 1402) {
                                Statics.field16.method1799(var12, field452);
                            }
                        }
                        if (var10.field2977 == 0) {
                            if (!var10.field2993 && method2574(var10) && Statics.field2923 != var10) {
                                continue;
                            }
                            if (!var10.field2993) {
                                if (var10.field2968 > var10.field3091 - var10.field2990) {
                                    var10.field2968 = var10.field3091 - var10.field2990;
                                }
                                if (var10.field2968 < 0) {
                                    var10.field2968 = 0;
                                }
                            }
                            method2629(arg0, var10.field2958, var19, var20, var21, var22, var12 - var10.field3054, var13 - var10.field2968, var11);
                            if (var10.field3061 != null) {
                                method2629(var10.field3061, var10.field2958, var19, var20, var21, var22, var12 - var10.field3054, var13 - var10.field2968, var11);
                            }
                            class67 var34 = (class67) field569.method5756((long) var10.field2958);
                            if (var34 != null) {
                                method781(var34.field950, var19, var20, var21, var22, var12, var13, var11);
                            }
                            class394.method6286(arg2, arg3, arg4, arg5);
                            class198.method3456();
                        }
                        if (field613 || field509[var11] || field624 > 1) {
                            if (var10.field2977 == 0 && !var10.field2993 && var10.field3091 > var10.field2990) {
                                method2109(var10.field2973 + var12, var13, var10.field2968, var10.field2990, var10.field3091);
                            }
                            if (var10.field2977 != 1) {
                                if (var10.field2977 == 2) {
                                    int var35 = 0;
                                    for (int var36 = 0; var36 < var10.field2970; var36++) {
                                        for (int var37 = 0; var37 < var10.field2969; var37++) {
                                            int var38 = (var10.field3025 + 32) * var37 + var12;
                                            int var39 = (var10.field3026 + 32) * var36 + var13;
                                            if (var35 < 20) {
                                                var38 += var10.field2946[var35];
                                                var39 += var10.field3028[var35];
                                            }
                                            if (var10.field3086[var35] > 0) {
                                                boolean var40 = false;
                                                boolean var41 = false;
                                                int var42 = var10.field3086[var35] - 1;
                                                if (var38 + 32 > arg2 && var38 < arg4 && var39 + 32 > arg3 && var39 < arg5 || Statics.field688 == var10 && field516 == var35) {
                                                    class398 var43;
                                                    if (field561 == 1 && Statics.field41 == var35 && Statics.field912 == var10.field2958) {
                                                        var43 = class157.method2271(var42, var10.field3087[var35], 2, 0, 2, false);
                                                    } else {
                                                        var43 = class157.method2271(var42, var10.field3087[var35], 1, 3153952, 2, false);
                                                    }
                                                    if (var43 == null) {
                                                        method1893(var10);
                                                    } else if (Statics.field688 == var10 && field516 == var35) {
                                                        int var44 = class20.field142 - field404;
                                                        int var45 = class20.field145 - field584;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var45 < 5 && var45 > -5) {
                                                            var45 = 0;
                                                        }
                                                        if (field521 < 5) {
                                                            var44 = 0;
                                                            var45 = 0;
                                                        }
                                                        var43.method6384(var38 + var44, var39 + var45, 128);
                                                        if (arg1 != -1) {
                                                            class249 var46 = arg0[arg1 & 0xFFFF];
                                                            if (var39 + var45 < class394.field4247 && var46.field2968 > 0) {
                                                                int var47 = field556 * (class394.field4247 - var39 - var45) / 3;
                                                                if (var47 > field556 * 10) {
                                                                    var47 = field556 * 10;
                                                                }
                                                                if (var47 > var46.field2968) {
                                                                    var47 = var46.field2968;
                                                                }
                                                                var46.field2968 -= var47;
                                                                field584 += var47;
                                                                method1893(var46);
                                                            }
                                                            if (var39 + var45 + 32 > class394.field4244 && var46.field2968 < var46.field3091 - var46.field2990) {
                                                                int var48 = field556 * (var39 + var45 + 32 - class394.field4244) / 3;
                                                                if (var48 > field556 * 10) {
                                                                    var48 = field556 * 10;
                                                                }
                                                                if (var48 > var46.field3091 - var46.field2990 - var46.field2968) {
                                                                    var48 = var46.field3091 - var46.field2990 - var46.field2968;
                                                                }
                                                                var46.field2968 += var48;
                                                                field584 -= var48;
                                                                method1893(var46);
                                                            }
                                                        }
                                                    } else if (Statics.field78 == var10 && field514 == var35) {
                                                        var43.method6384(var38, var39, 128);
                                                    } else {
                                                        var43.method6403(var38, var39);
                                                    }
                                                }
                                            } else if (var10.field3029 != null && var35 < 20) {
                                                class398 var49 = var10.method4264(var35);
                                                if (var49 != null) {
                                                    var49.method6403(var38, var39);
                                                } else if (class249.field2956) {
                                                    method1893(var10);
                                                }
                                            }
                                            var35++;
                                        }
                                    }
                                } else if (var10.field2977 == 3) {
                                    int var50;
                                    if (method2490(var10)) {
                                        var50 = var10.field2984;
                                        if (Statics.field2923 == var10 && var10.field2986 != 0) {
                                            var50 = var10.field2986;
                                        }
                                    } else {
                                        var50 = var10.field2983;
                                        if (Statics.field2923 == var10 && var10.field2985 != 0) {
                                            var50 = var10.field2985;
                                        }
                                    }
                                    if (var10.field2987) {
                                        switch(var10.field3071.field4258) {
                                            case 1:
                                                class394.method6273(var12, var13, var10.field2973, var10.field2990, var10.field2983, var10.field2984);
                                                break;
                                            case 2:
                                                class394.method6263(var12, var13, var10.field2973, var10.field2990, var10.field2983, var10.field2984, 255 - (var10.field2989 & 0xFF), 255 - (var10.field3103 & 0xFF));
                                                break;
                                            default:
                                                if (var14 == 0) {
                                                    class394.method6272(var12, var13, var10.field2973, var10.field2990, var50);
                                                } else {
                                                    class394.method6271(var12, var13, var10.field2973, var10.field2990, var50, 256 - (var14 & 0xFF));
                                                }
                                        }
                                    } else if (var14 == 0) {
                                        class394.method6299(var12, var13, var10.field2973, var10.field2990, var50);
                                    } else {
                                        class394.method6277(var12, var13, var10.field2973, var10.field2990, var50, 256 - (var14 & 0xFF));
                                    }
                                } else if (var10.field2977 == 4) {
                                    class302 var51 = var10.method4263();
                                    if (var51 != null) {
                                        String var52 = var10.field3042;
                                        int var53;
                                        if (method2490(var10)) {
                                            var53 = var10.field2984;
                                            if (Statics.field2923 == var10 && var10.field2986 != 0) {
                                                var53 = var10.field2986;
                                            }
                                            if (var10.field3020.length() > 0) {
                                                var52 = var10.field3020;
                                            }
                                        } else {
                                            var53 = var10.field2983;
                                            if (Statics.field2923 == var10 && var10.field2985 != 0) {
                                                var53 = var10.field2985;
                                            }
                                        }
                                        if (var10.field2993 && var10.field3088 != -1) {
                                            class157 var54 = class157.method101(var10.field3088);
                                            var52 = var54.field1836;
                                            if (var52 == null) {
                                                var52 = class270.field3234;
                                            }
                                            if ((var54.field1806 == 1 || var10.field3089 != 1) && var10.field3089 != -1) {
                                                var52 = class79.method786(16748608) + var52 + class79.field1145 + " " + 'x' + method2610(var10.field3089);
                                            }
                                        }
                                        if (field574 == var10) {
                                            var52 = class270.field3388;
                                            var53 = var10.field2983;
                                        }
                                        if (!var10.field2993) {
                                            var52 = method1739(var52, var10);
                                        }
                                        var51.method4895(var52, var12, var13, var10.field2973, var10.field2990, var53, var10.field3024 ? 0 : -1, var10.field3022, var10.field3023, var10.field3021);
                                    } else if (class249.field2956) {
                                        method1893(var10);
                                    }
                                } else if (var10.field2977 == 5) {
                                    if (var10.field2993) {
                                        class398 var56;
                                        if (var10.field3088 == -1) {
                                            var56 = var10.method4262(false);
                                        } else {
                                            var56 = class157.method2271(var10.field3088, var10.field3089, var10.field2997, var10.field2998, var10.field2991, false);
                                        }
                                        if (var56 != null) {
                                            int var57 = var56.field4274;
                                            int var58 = var56.field4275;
                                            if (var10.field3027) {
                                                class394.method6265(var12, var13, var10.field2973 + var12, var10.field2990 + var13);
                                                int var59 = (var10.field2973 + (var57 - 1)) / var57;
                                                int var60 = (var10.field2990 + (var58 - 1)) / var58;
                                                for (int var61 = 0; var61 < var59; var61++) {
                                                    for (int var62 = 0; var62 < var60; var62++) {
                                                        if (var10.field3077 != 0) {
                                                            var56.method6397(var57 / 2 + var57 * var61 + var12, var58 / 2 + var58 * var62 + var13, var10.field3077, 4096);
                                                        } else if (var14 == 0) {
                                                            var56.method6403(var57 * var61 + var12, var58 * var62 + var13);
                                                        } else {
                                                            var56.method6384(var57 * var61 + var12, var58 * var62 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class394.method6286(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var63 = var10.field2973 * 4096 / var57;
                                                if (var10.field3077 != 0) {
                                                    var56.method6397(var10.field2973 / 2 + var12, var10.field2990 / 2 + var13, var10.field3077, var63);
                                                } else if (var14 != 0) {
                                                    var56.method6386(var12, var13, var10.field2973, var10.field2990, 256 - (var14 & 0xFF));
                                                } else if (var10.field2973 == var57 && var10.field2990 == var58) {
                                                    var56.method6403(var12, var13);
                                                } else {
                                                    var56.method6380(var12, var13, var10.field2973, var10.field2990);
                                                }
                                            }
                                        } else if (class249.field2956) {
                                            method1893(var10);
                                        }
                                    } else {
                                        class398 var55 = var10.method4262(method2490(var10));
                                        if (var55 != null) {
                                            var55.method6403(var12, var13);
                                        } else if (class249.field2956) {
                                            method1893(var10);
                                        }
                                    }
                                } else if (var10.field2977 == 6) {
                                    boolean var64 = method2490(var10);
                                    int var65;
                                    if (var64) {
                                        var65 = var10.field3048;
                                    } else {
                                        var65 = var10.field3005;
                                    }
                                    class207 var66 = null;
                                    int var67 = 0;
                                    if (var10.field3088 != -1) {
                                        class157 var68 = class157.method101(var10.field3088);
                                        if (var68 != null) {
                                            class157 var69 = var68.method2737(var10.field3089);
                                            var66 = var69.method2764(1);
                                            if (var66 == null) {
                                                method1893(var10);
                                            } else {
                                                var66.method3772();
                                                var67 = var66.field2346 / 2;
                                            }
                                        }
                                    } else if (var10.field2950 == 5) {
                                        if (var10.field3002 == 0) {
                                            var66 = field598.method4240((class159) null, -1, (class159) null, -1);
                                        } else {
                                            var66 = Statics.field140.method1550();
                                        }
                                    } else if (var65 == -1) {
                                        var66 = var10.method4265((class159) null, -1, var64, Statics.field140.field979);
                                        if (var66 == null && class249.field2956) {
                                            method1893(var10);
                                        }
                                    } else {
                                        class159 var70 = class159.method1334(var65);
                                        var66 = var10.method4265(var70, var10.field3094, var64, Statics.field140.field979);
                                        if (var66 == null && class249.field2956) {
                                            method1893(var10);
                                        }
                                    }
                                    class198.method3459(var10.field2973 / 2 + var12, var10.field2990 / 2 + var13);
                                    int var71 = var10.field3000 * class198.field2266[var10.field3009] >> 16;
                                    int var72 = var10.field3000 * class198.field2273[var10.field3009] >> 16;
                                    if (var66 != null) {
                                        if (var10.field2993) {
                                            var66.method3772();
                                            if (var10.field3015) {
                                                var66.method3785(0, var10.field3010, var10.field3011, var10.field3009, var10.field3007, var10.field2960 + var67 + var71, var10.field2960 + var72, var10.field3000);
                                            } else {
                                                var66.method3820(0, var10.field3010, var10.field3011, var10.field3009, var10.field3007, var10.field2960 + var67 + var71, var10.field2960 + var72);
                                            }
                                        } else {
                                            var66.method3820(0, var10.field3010, 0, var10.field3009, 0, var71, var72);
                                        }
                                    }
                                    class198.method3458();
                                } else {
                                    if (var10.field2977 == 7) {
                                        class302 var73 = var10.method4263();
                                        if (var73 == null) {
                                            if (class249.field2956) {
                                                method1893(var10);
                                            }
                                            continue;
                                        }
                                        int var74 = 0;
                                        for (int var75 = 0; var75 < var10.field2970; var75++) {
                                            for (int var76 = 0; var76 < var10.field2969; var76++) {
                                                if (var10.field3086[var74] > 0) {
                                                    class157 var77 = class157.method101(var10.field3086[var74] - 1);
                                                    String var78;
                                                    if (var77.field1806 != 1 && var10.field3087[var74] == 1) {
                                                        var78 = class79.method786(16748608) + var77.field1836 + class79.field1145;
                                                    } else {
                                                        var78 = class79.method786(16748608) + var77.field1836 + class79.field1145 + " " + 'x' + method2610(var10.field3087[var74]);
                                                    }
                                                    int var79 = (var10.field3025 + 115) * var76 + var12;
                                                    int var80 = (var10.field3026 + 12) * var75 + var13;
                                                    if (var10.field3022 == 0) {
                                                        var73.method4891(var78, var79, var80, var10.field2983, var10.field3024 ? 0 : -1);
                                                    } else if (var10.field3022 == 1) {
                                                        var73.method4955(var78, var10.field2973 / 2 + var79, var80, var10.field2983, var10.field3024 ? 0 : -1);
                                                    } else {
                                                        var73.method4954(var78, var10.field2973 + var79 - 1, var80, var10.field2983, var10.field3024 ? 0 : -1);
                                                    }
                                                }
                                                var74++;
                                            }
                                        }
                                    }
                                    if (var10.field2977 == 8 && Statics.field3699 == var10 && field649 == field560) {
                                        int var81 = 0;
                                        int var82 = 0;
                                        class302 var83 = Statics.field3165;
                                        String var84 = var10.field3042;
                                        String var85 = method1739(var84, var10);
                                        while (var85.length() > 0) {
                                            int var86 = var85.indexOf(class79.field1144);
                                            String var87;
                                            if (var86 == -1) {
                                                var87 = var85;
                                                var85 = "";
                                            } else {
                                                var87 = var85.substring(0, var86);
                                                var85 = var85.substring(var86 + 4);
                                            }
                                            int var88 = var83.method4887(var87);
                                            if (var88 > var81) {
                                                var81 = var88;
                                            }
                                            var82 += var83.field3738 + 1;
                                        }
                                        var81 += 6;
                                        var82 += 7;
                                        int var89 = var10.field2973 + var12 - 5 - var81;
                                        int var90 = var10.field2990 + var13 + 5;
                                        if (var89 < var12 + 5) {
                                            var89 = var12 + 5;
                                        }
                                        if (var81 + var89 > arg4) {
                                            var89 = arg4 - var81;
                                        }
                                        if (var82 + var90 > arg5) {
                                            var90 = arg5 - var82;
                                        }
                                        class394.method6272(var89, var90, var81, var82, 16777120);
                                        class394.method6299(var89, var90, var81, var82, 0);
                                        String var91 = var10.field3042;
                                        int var92 = var83.field3738 + var90 + 2;
                                        String var93 = method1739(var91, var10);
                                        while (var93.length() > 0) {
                                            int var94 = var93.indexOf(class79.field1144);
                                            String var95;
                                            if (var94 == -1) {
                                                var95 = var93;
                                                var93 = "";
                                            } else {
                                                var95 = var93.substring(0, var94);
                                                var93 = var93.substring(var94 + 4);
                                            }
                                            var83.method4891(var95, var89 + 3, var92, 0, -1);
                                            var92 += var83.field3738 + 1;
                                        }
                                    }
                                    if (var10.field2977 == 9) {
                                        int var96;
                                        int var97;
                                        int var98;
                                        int var99;
                                        if (var10.field2992) {
                                            var96 = var12;
                                            var97 = var10.field2990 + var13;
                                            var98 = var10.field2973 + var12;
                                            var99 = var13;
                                        } else {
                                            var96 = var12;
                                            var97 = var13;
                                            var98 = var10.field2973 + var12;
                                            var99 = var10.field2990 + var13;
                                        }
                                        if (var10.field2959 == 1) {
                                            class394.method6262(var96, var97, var98, var99, var10.field2983);
                                        } else {
                                            method1773(var96, var97, var98, var99, var10.field2983, var10.field2959);
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

    @ObfuscatedName("bs.id(IIIIIIB)V")
    public static final void method1773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg2 - arg0;
        int var7 = arg3 - arg1;
        int var8 = var6 >= 0 ? var6 : -var6;
        int var9 = var7 >= 0 ? var7 : -var7;
        int var10 = var8;
        if (var8 < var9) {
            var10 = var9;
        }
        if (var10 == 0) {
            return;
        }
        int var11 = (var6 << 16) / var10;
        int var12 = (var7 << 16) / var10;
        if (var12 <= var11) {
            var11 = -var11;
        } else {
            var12 = -var12;
        }
        int var13 = arg5 * var12 >> 17;
        int var14 = arg5 * var12 + 1 >> 17;
        int var15 = arg5 * var11 >> 17;
        int var16 = arg5 * var11 + 1 >> 17;
        int var17 = arg0 - class394.field4249;
        int var18 = arg1 - class394.field4247;
        int var19 = var13 + var17;
        int var20 = var17 - var14;
        int var21 = var6 + var17 - var14;
        int var22 = var6 + var17 + var13;
        int var23 = var15 + var18;
        int var24 = var18 - var16;
        int var25 = var7 + var18 - var16;
        int var26 = var7 + var18 + var15;
        class198.method3464(var19, var20, var21);
        class198.method3467(var23, var24, var25, var19, var20, var21, arg4);
        class198.method3464(var19, var21, var22);
        class198.method3467(var23, var25, var26, var19, var21, var22, arg4);
    }

    @ObfuscatedName("bb.is(Ljava/lang/String;Lio;I)Ljava/lang/String;")
    public static String method1739(String arg0, class249 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + Statics.method79(method2325(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
        }
        return arg0;
    }

    @ObfuscatedName("ez.ib(II)Ljava/lang/String;")
    public static final String method2610(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class79.field1140 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class79.method786(65408) + var1.substring(0, var1.length() - 8) + class270.field3246 + " " + class79.field1141 + var1 + class79.field1139 + class79.field1145;
        } else if (var1.length() > 6) {
            return " " + class79.method786(16777215) + var1.substring(0, var1.length() - 4) + class270.field3393 + " " + class79.field1141 + var1 + class79.field1139 + class79.field1145;
        } else {
            return " " + class79.method786(16776960) + var1 + class79.field1145;
        }
    }

    @ObfuscatedName("client.iz(ZI)V")
    public final void method851(boolean arg0) {
        int var2 = field568;
        int var3 = Statics.field971;
        int var4 = Statics.field687;
        if (class249.method4333(var2)) {
            method3730(Statics.field3039[var2], -1, var3, var4, arg0);
        }
    }

    @ObfuscatedName("client.ip(Lio;I)V")
    public void method852(class249 arg0) {
        class249 var2 = arg0.field3001 == -1 ? null : class249.method2019(arg0.field3001);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = Statics.field971;
            var4 = Statics.field687;
        } else {
            var3 = var2.field2973;
            var4 = var2.field2990;
        }
        method4631(arg0, var3, var4, false);
        method519(arg0, var3, var4);
    }

    @ObfuscatedName("ce.im([Lio;Lio;ZI)V")
    public static void method1892(class249[] arg0, class249 arg1, boolean arg2) {
        int var3 = arg1.field2981 == 0 ? arg1.field2973 : arg1.field2981;
        int var4 = arg1.field3091 == 0 ? arg1.field2990 : arg1.field3091;
        method3730(arg0, arg1.field2958, var3, var4, arg2);
        if (arg1.field3061 != null) {
            method3730(arg1.field3061, arg1.field2958, var3, var4, arg2);
        }
        class67 var5 = (class67) field569.method5756((long) arg1.field2958);
        if (var5 != null) {
            int var6 = var5.field950;
            if (class249.method4333(var6)) {
                method3730(Statics.field3039[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2962 == 1337) {
        }
    }

    @ObfuscatedName("gf.iw([Lio;IIIZI)V")
    public static void method3730(class249[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class249 var6 = arg0[var5];
            if (var6 != null && var6.field3001 == arg1) {
                method4631(var6, arg2, arg3, arg4);
                method519(var6, arg2, arg3);
                if (var6.field3054 > var6.field2981 - var6.field2973) {
                    var6.field3054 = var6.field2981 - var6.field2973;
                }
                if (var6.field3054 < 0) {
                    var6.field3054 = 0;
                }
                if (var6.field2968 > var6.field3091 - var6.field2990) {
                    var6.field2968 = var6.field3091 - var6.field2990;
                }
                if (var6.field2968 < 0) {
                    var6.field2968 = 0;
                }
                if (var6.field2977 == 0) {
                    method1892(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("kn.jc(Lio;IIZB)V")
    public static void method4631(class249 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2973;
        int var5 = arg0.field2990;
        if (arg0.field3033 == 0) {
            arg0.field2973 = arg0.field2969;
        } else if (arg0.field3033 == 1) {
            arg0.field2973 = arg1 - arg0.field2969;
        } else if (arg0.field3033 == 2) {
            arg0.field2973 = arg0.field2969 * arg1 >> 14;
        }
        if (arg0.field3092 == 0) {
            arg0.field2990 = arg0.field2970;
        } else if (arg0.field3092 == 1) {
            arg0.field2990 = arg2 - arg0.field2970;
        } else if (arg0.field3092 == 2) {
            arg0.field2990 = arg0.field2970 * arg2 >> 14;
        }
        if (arg0.field3033 == 4) {
            arg0.field2973 = arg0.field2990 * arg0.field2975 / arg0.field2976;
        }
        if (arg0.field3092 == 4) {
            arg0.field2990 = arg0.field2976 * arg0.field2973 / arg0.field2975;
        }
        if (arg0.field2962 == 1337) {
            field580 = arg0;
        }
        if (arg3 && arg0.field3072 != null && (arg0.field2973 != var4 || arg0.field2990 != var5)) {
            class68 var6 = new class68();
            var6.field961 = arg0;
            var6.field955 = arg0.field3072;
            field611.method4706(var6);
        }
    }

    @ObfuscatedName("an.je(Lio;IIB)V")
    public static void method519(class249 arg0, int arg1, int arg2) {
        if (arg0.field3063 == 0) {
            arg0.field2971 = arg0.field2947;
        } else if (arg0.field3063 == 1) {
            arg0.field2971 = (arg1 - arg0.field2973) / 2 + arg0.field2947;
        } else if (arg0.field3063 == 2) {
            arg0.field2971 = arg1 - arg0.field2973 - arg0.field2947;
        } else if (arg0.field3063 == 3) {
            arg0.field2971 = arg0.field2947 * arg1 >> 14;
        } else if (arg0.field3063 == 4) {
            arg0.field2971 = (arg0.field2947 * arg1 >> 14) + (arg1 - arg0.field2973) / 2;
        } else {
            arg0.field2971 = arg1 - arg0.field2973 - (arg0.field2947 * arg1 >> 14);
        }
        if (arg0.field2964 == 0) {
            arg0.field2972 = arg0.field3019;
        } else if (arg0.field2964 == 1) {
            arg0.field2972 = (arg2 - arg0.field2990) / 2 + arg0.field3019;
        } else if (arg0.field2964 == 2) {
            arg0.field2972 = arg2 - arg0.field2990 - arg0.field3019;
        } else if (arg0.field2964 == 3) {
            arg0.field2972 = arg0.field3019 * arg2 >> 14;
        } else if (arg0.field2964 == 4) {
            arg0.field2972 = (arg0.field3019 * arg2 >> 14) + (arg2 - arg0.field2990) / 2;
        } else {
            arg0.field2972 = arg2 - arg0.field2990 - (arg0.field3019 * arg2 >> 14);
        }
    }

    @ObfuscatedName("dp.jv(Lio;IIIIIII)V")
    public static final void method2270(class249 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field455) {
            field416 = 32;
        } else {
            field416 = 0;
        }
        field455 = false;
        if (class20.field141 == 1 || !Statics.field3777 && class20.field141 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2968 -= 4;
                method1893(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2968 += 4;
                method1893(arg0);
            } else if (arg5 >= arg1 - field416 && arg5 < field416 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2968 = (arg4 - arg3) * var8 / var9;
                method1893(arg0);
                field455 = true;
            }
        }
        if (field657 == 0) {
            return;
        }
        int var10 = arg0.field2973;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2968 += field657 * 45;
            method1893(arg0);
        }
    }

    @ObfuscatedName("ca.jn(IIIIIB)V")
    public static final void method2109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field386[0].method6348(arg0, arg1);
        Statics.field386[1].method6348(arg0, arg1 + arg3 - 16);
        class394.method6272(arg0, arg1 + 16, 16, arg3 - 32, field470);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class394.method6272(arg0, arg1 + 16 + var6, 16, var5, field471);
        class394.method6324(arg0, arg1 + 16 + var6, var5, field633);
        class394.method6324(arg0 + 1, arg1 + 16 + var6, var5, field633);
        class394.method6278(arg0, arg1 + 16 + var6, 16, field633);
        class394.method6278(arg0, arg1 + 17 + var6, 16, field633);
        class394.method6324(arg0 + 15, arg1 + 16 + var6, var5, field472);
        class394.method6324(arg0 + 14, arg1 + 17 + var6, var5 - 1, field472);
        class394.method6278(arg0, arg1 + 15 + var6 + var5, 16, field472);
        class394.method6278(arg0 + 1, arg1 + 14 + var6 + var5, 15, field472);
    }

    @ObfuscatedName("eb.jr(Lio;B)Z")
    public static final boolean method2490(class249 arg0) {
        if (arg0.field3099 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field3099.length; var1++) {
            int var2 = method2325(arg0, var1);
            int var3 = arg0.field3082[var1];
            if (arg0.field3099[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field3099[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field3099[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("eu.jz(Lio;II)I")
    public static final int method2325(class249 arg0, int arg1) {
        if (arg0.field3080 == null || arg1 >= arg0.field3080.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field3080[arg1];
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
                    var7 = field435[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field541[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field542[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class249 var11 = class249.method2019(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class157.method101(var12).field1808 || field562)) {
                        for (int var13 = 0; var13 < var11.field3086.length; var13++) {
                            if (var12 + 1 == var11.field3086[var13]) {
                                var7 += var11.field3087[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class244.field2911[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class259.field3168[field541[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class244.field2911[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field140.field991;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class259.field3170[var14]) {
                            var7 += field541[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class249 var17 = class249.method2019(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class157.method101(var18).field1808 || field562)) {
                        for (int var19 = 0; var19 < var17.field3086.length; var19++) {
                            if (var18 + 1 == var17.field3086[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field432;
                }
                if (var6 == 12) {
                    var7 = field576;
                }
                if (var6 == 13) {
                    int var20 = class244.field2911[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class244.method3219(var22);
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
                    var7 = (Statics.field140.field1069 >> 7) + Statics.field3625;
                }
                if (var6 == 19) {
                    var7 = (Statics.field140.field1059 >> 7) + Statics.field1134;
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

    @ObfuscatedName("ni.jw(Lio;Lfh;IIZI)V")
    public static final void method5865(class249 arg0, class157 arg1, int arg2, int arg3, boolean arg4) {
        String[] var5 = arg1.field1810;
        byte var6 = -1;
        String var7 = null;
        if (var5 != null && var5[arg3] != null) {
            if (arg3 == 0) {
                var6 = 33;
            } else if (arg3 == 1) {
                var6 = 34;
            } else if (arg3 == 2) {
                var6 = 35;
            } else if (arg3 == 3) {
                var6 = 36;
            } else {
                var6 = 37;
            }
            var7 = var5[arg3];
        } else if (arg3 == 4) {
            var6 = 37;
            var7 = class270.field3228;
        }
        if (var6 != -1 && var7 != null) {
            method453(var7, class79.method786(16748608) + arg1.field1836, var6, arg1.field1802, arg2, arg0.field2958, arg4);
        }
    }

    @ObfuscatedName("c.jt(Lio;III)V")
    public static final void method340(class249 arg0, int arg1, int arg2) {
        if (arg0.field2961 == 1) {
            method43(arg0.field3085, "", 24, 0, 0, arg0.field2958);
        }
        if (arg0.field2961 == 2 && !field563) {
            String var3 = method457(arg0);
            if (var3 != null) {
                method43(var3, class79.method786(65280) + arg0.field3041, 25, 0, -1, arg0.field2958);
            }
        }
        if (arg0.field2961 == 3) {
            method43(class270.field3389, "", 26, 0, 0, arg0.field2958);
        }
        if (arg0.field2961 == 4) {
            method43(arg0.field3085, "", 28, 0, 0, arg0.field2958);
        }
        if (arg0.field2961 == 5) {
            method43(arg0.field3085, "", 29, 0, 0, arg0.field2958);
        }
        if (arg0.field2961 == 6 && field574 == null) {
            method43(arg0.field3085, "", 30, 0, -1, arg0.field2958);
        }
        if (arg0.field2977 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2990; var5++) {
                for (int var6 = 0; var6 < arg0.field2973; var6++) {
                    int var7 = (arg0.field3025 + 32) * var6;
                    int var8 = (arg0.field3026 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2946[var4];
                        var8 += arg0.field3028[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field519 = var4;
                        Statics.field515 = arg0;
                        if (arg0.field3086[var4] > 0) {
                            class157 var9 = class157.method101(arg0.field3086[var4] - 1);
                            if (field561 == 1 && class250.method3938(method4179(arg0))) {
                                if (Statics.field912 != arg0.field2958 || Statics.field41 != var4) {
                                    method43(class270.field3380, field530 + " " + class79.field1143 + " " + class79.method786(16748608) + var9.field1836, 31, var9.field1802, var4, arg0.field2958);
                                }
                            } else if (!field563 || !class250.method3938(method4179(arg0))) {
                                String[] var10 = var9.field1810;
                                int var11 = -1;
                                if (field554 && method1874()) {
                                    var11 = var9.method2744();
                                }
                                if (class250.method3938(method4179(arg0))) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != var12) {
                                            method5865(arg0, var9, var4, var12, false);
                                        }
                                    }
                                }
                                int var13 = method4179(arg0);
                                boolean var14 = (var13 >> 31 & 0x1) != 0;
                                if (var14) {
                                    method43(class270.field3380, class79.method786(16748608) + var9.field1836, 38, var9.field1802, var4, arg0.field2958);
                                }
                                class250 var10000 = (class250) null;
                                if (class250.method3938(method4179(arg0))) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var11 != var15) {
                                            method5865(arg0, var9, var4, var15, false);
                                        }
                                    }
                                    if (var11 >= 0) {
                                        method5865(arg0, var9, var4, var11, true);
                                    }
                                }
                                String[] var16 = arg0.field3030;
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 39;
                                            }
                                            if (var17 == 1) {
                                                var18 = 40;
                                            }
                                            if (var17 == 2) {
                                                var18 = 41;
                                            }
                                            if (var17 == 3) {
                                                var18 = 42;
                                            }
                                            if (var17 == 4) {
                                                var18 = 43;
                                            }
                                            method43(var16[var17], class79.method786(16748608) + var9.field1836, var18, var9.field1802, var4, arg0.field2958);
                                        }
                                    }
                                }
                                method43(class270.field3381, class79.method786(16748608) + var9.field1836, 1005, var9.field1802, var4, arg0.field2958);
                            } else if ((Statics.field2474 & 0x10) == 16) {
                                method43(field566, field466 + " " + class79.field1143 + " " + class79.method786(16748608) + var9.field1836, 32, var9.field1802, var4, arg0.field2958);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2993) {
            return;
        }
        if (!field563) {
            for (int var19 = 9; var19 >= 5; var19--) {
                int var20 = method4179(arg0);
                boolean var21 = (var20 >> var19 + 1 & 0x1) != 0;
                String var22;
                if (!var21 && arg0.field3055 == null) {
                    var22 = null;
                } else if (arg0.field3038 == null || arg0.field3038.length <= var19 || arg0.field3038[var19] == null || arg0.field3038[var19].trim().length() == 0) {
                    var22 = null;
                } else {
                    var22 = arg0.field3038[var19];
                }
                if (var22 != null) {
                    method43(var22, arg0.field3037, 1007, var19 + 1, arg0.field3031, arg0.field2958);
                }
            }
            String var24 = method457(arg0);
            if (var24 != null) {
                method43(var24, arg0.field3037, 25, 0, arg0.field3031, arg0.field2958);
            }
            for (int var25 = 4; var25 >= 0; var25--) {
                int var26 = method4179(arg0);
                boolean var27 = (var26 >> var25 + 1 & 0x1) != 0;
                String var28;
                if (!var27 && arg0.field3055 == null) {
                    var28 = null;
                } else if (arg0.field3038 == null || arg0.field3038.length <= var25 || arg0.field3038[var25] == null || arg0.field3038[var25].trim().length() == 0) {
                    var28 = null;
                } else {
                    var28 = arg0.field3038[var25];
                }
                if (var28 != null) {
                    method453(var28, arg0.field3037, 57, var25 + 1, arg0.field3031, arg0.field2958, arg0.field3104);
                }
            }
            int var30 = method4179(arg0);
            boolean var31 = (var30 & 0x1) != 0;
            if (var31) {
                method43(class270.field3232, "", 30, 0, arg0.field3031, arg0.field2958);
            }
        } else if (class250.method2144(method4179(arg0)) && (Statics.field2474 & 0x20) == 32) {
            method43(field566, field466 + " " + class79.field1143 + " " + arg0.field3037, 58, 0, arg0.field3031, arg0.field2958);
        }
    }

    @ObfuscatedName("q.jq(ZS)V")
    public static void method157(boolean arg0) {
        field555 = arg0;
    }

    @ObfuscatedName("af.jo(I)Z")
    public static boolean method783() {
        return field555;
    }

    @ObfuscatedName("cl.jh(I)Z")
    public static boolean method1874() {
        return field555 || class11.field46[81];
    }

    @ObfuscatedName("ii.ji(IIIIIIII)V")
    public static final void method4213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class249.method4333(arg0)) {
            method4403(Statics.field3039[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("jo.jd([Lio;IIIIIIIB)V")
    public static final void method4403(class249[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class249 var9 = arg0[var8];
            if (var9 != null && var9.field3001 == arg1 && (!var9.field2993 || var9.field2977 == 0 || var9.field3044 || method4179(var9) != 0 || field582 == var9 || var9.field2962 == 1338)) {
                if (var9.field2993) {
                    if (method2574(var9)) {
                        continue;
                    }
                } else if (var9.field2977 == 0 && Statics.field2923 != var9 && method2574(var9)) {
                    continue;
                }
                int var10 = var9.field2971 + arg6;
                int var11 = var9.field2972 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2977 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2977 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2973 + var10;
                    int var19 = var9.field2990 + var11;
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
                    int var22 = var9.field2973 + var10;
                    int var23 = var9.field2990 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field581 == var9) {
                    field589 = true;
                    field679 = var10;
                    field677 = var11;
                }
                boolean var24 = false;
                if (var9.field3032) {
                    switch(field570) {
                        case 0:
                            var24 = true;
                        case 1:
                        default:
                            break;
                        case 2:
                            if (var9.field2958 >>> 16 == field484) {
                                var24 = true;
                            }
                            break;
                        case 3:
                            if (field484 == var9.field2958) {
                                var24 = true;
                            }
                    }
                }
                if (var24 || !var9.field2993 || var12 < var14 && var13 < var15) {
                    if (var9.field2993) {
                        if (var9.field3102) {
                            if (class20.field142 >= var12 && class20.field145 >= var13 && class20.field142 < var14 && class20.field145 < var15) {
                                for (class68 var25 = (class68) field611.method4721(); var25 != null; var25 = (class68) field611.method4712()) {
                                    if (var25.field964) {
                                        var25.method5447();
                                        var25.field961.field3093 = false;
                                    }
                                }
                                if (Statics.field1319 == 0) {
                                    field581 = null;
                                    field582 = null;
                                }
                                if (!field544) {
                                    method102();
                                }
                            }
                        } else if (var9.field3078 && class20.field142 >= var12 && class20.field145 >= var13 && class20.field142 < var14 && class20.field145 < var15) {
                            for (class68 var26 = (class68) field611.method4721(); var26 != null; var26 = (class68) field611.method4712()) {
                                if (var26.field964 && var26.field961.field3065 == var26.field955) {
                                    var26.method5447();
                                }
                            }
                        }
                    }
                    int var27 = class20.field142;
                    int var28 = class20.field145;
                    if (class20.field149 != 0) {
                        var27 = class20.field150;
                        var28 = class20.field151;
                    }
                    boolean var29 = var27 >= var12 && var28 >= var13 && var27 < var14 && var28 < var15;
                    if (var9.field2962 == 1337) {
                        if (!field415 && !field544 && var29) {
                            method4381(var27, var28, var12, var13);
                        }
                    } else if (var9.field2962 == 1338) {
                        method1565(var9, var10, var11);
                    } else {
                        if (var9.field2962 == 1400) {
                            Statics.field202.method5494(class20.field142, class20.field145, var29, var10, var11, var9.field2973, var9.field2990);
                        }
                        if (!field544 && var29) {
                            if (var9.field2962 == 1400) {
                                Statics.field202.method5506(var10, var11, var9.field2973, var9.field2990, var27, var28);
                            } else {
                                method340(var9, var27 - var10, var28 - var11);
                            }
                        }
                        if (var24) {
                            for (int var30 = 0; var30 < var9.field2988.length; var30++) {
                                boolean var31 = false;
                                boolean var32 = false;
                                if (!var31 && var9.field2988[var30] != null) {
                                    for (int var33 = 0; var33 < var9.field2988[var30].length; var33++) {
                                        boolean var34 = false;
                                        if (var9.field2967 != null) {
                                            var34 = class11.field46[var9.field2988[var30][var33]];
                                        }
                                        if (method5086(var9.field2988[var30][var33]) || var34) {
                                            var31 = true;
                                            if (var9.field2967 != null && var9.field2967[var30] > field452) {
                                                break;
                                            }
                                            byte var35 = var9.field3034[var30][var33];
                                            if (var35 == 0 || ((var35 & 0x8) == 0 || !class11.field46[86] && !class11.field46[82] && !class11.field46[81]) && ((var35 & 0x2) == 0 || class11.field46[86]) && ((var35 & 0x1) == 0 || class11.field46[82]) && ((var35 & 0x4) == 0 || class11.field46[81])) {
                                                var32 = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (var32) {
                                    if (var30 < 10) {
                                        method3276(var30 + 1, var9.field2958, var9.field3031, var9.field3088, "");
                                    } else if (var30 == 10) {
                                        method2929();
                                        method821(var9.field2958, var9.field3031, class250.method2115(method4179(var9)), var9.field3088);
                                        field566 = method457(var9);
                                        if (field566 == null) {
                                            field566 = class270.field3234;
                                        }
                                        field466 = var9.field3037 + class79.method786(16777215);
                                    }
                                    int var36 = var9.field2994[var30];
                                    if (var9.field2967 == null) {
                                        var9.field2967 = new int[var9.field2988.length];
                                    }
                                    if (var9.field3036 == null) {
                                        var9.field3036 = new int[var9.field2988.length];
                                    }
                                    if (var36 == 0) {
                                        var9.field2967[var30] = Integer.MAX_VALUE;
                                    } else if (var9.field2967[var30] == 0) {
                                        var9.field2967[var30] = field452 + var36 + var9.field3036[var30];
                                    } else {
                                        var9.field2967[var30] = field452 + var36;
                                    }
                                }
                                if (!var31 && var9.field2967 != null) {
                                    var9.field2967[var30] = 0;
                                }
                            }
                        }
                        if (var9.field2993) {
                            boolean var37;
                            if (class20.field142 >= var12 && class20.field145 >= var13 && class20.field142 < var14 && class20.field145 < var15) {
                                var37 = true;
                            } else {
                                var37 = false;
                            }
                            boolean var38 = false;
                            if ((class20.field141 == 1 || !Statics.field3777 && class20.field141 == 4) && var37) {
                                var38 = true;
                            }
                            boolean var39 = false;
                            if ((class20.field149 == 1 || !Statics.field3777 && class20.field149 == 4) && class20.field150 >= var12 && class20.field151 >= var13 && class20.field150 < var14 && class20.field151 < var15) {
                                var39 = true;
                            }
                            if (var39) {
                                method1701(var9, class20.field150 - var10, class20.field151 - var11);
                            }
                            if (var9.field2962 == 1400) {
                                Statics.field202.method5495(var27, var28, var37 & var38, var37 & var39);
                            }
                            if (field581 != null && field581 != var9 && var37 && class250.method1909(method4179(var9))) {
                                field585 = var9;
                            }
                            if (field582 == var9) {
                                field586 = true;
                                field587 = var10;
                                field588 = var11;
                            }
                            if (var9.field3044) {
                                if (var37 && field657 != 0 && var9.field3065 != null) {
                                    class68 var40 = new class68();
                                    var40.field964 = true;
                                    var40.field961 = var9;
                                    var40.field956 = field657;
                                    var40.field955 = var9.field3065;
                                    field611.method4706(var40);
                                }
                                if (field581 != null || Statics.field688 != null || field544) {
                                    var39 = false;
                                    var38 = false;
                                    var37 = false;
                                }
                                if (!var9.field2980 && var39) {
                                    var9.field2980 = true;
                                    if (var9.field3046 != null) {
                                        class68 var41 = new class68();
                                        var41.field964 = true;
                                        var41.field961 = var9;
                                        var41.field953 = class20.field150 - var10;
                                        var41.field956 = class20.field151 - var11;
                                        var41.field955 = var9.field3046;
                                        field611.method4706(var41);
                                    }
                                }
                                if (var9.field2980 && var38 && var9.field3047 != null) {
                                    class68 var42 = new class68();
                                    var42.field964 = true;
                                    var42.field961 = var9;
                                    var42.field953 = class20.field142 - var10;
                                    var42.field956 = class20.field145 - var11;
                                    var42.field955 = var9.field3047;
                                    field611.method4706(var42);
                                }
                                if (var9.field2980 && !var38) {
                                    var9.field2980 = false;
                                    if (var9.field2955 != null) {
                                        class68 var43 = new class68();
                                        var43.field964 = true;
                                        var43.field961 = var9;
                                        var43.field953 = class20.field142 - var10;
                                        var43.field956 = class20.field145 - var11;
                                        var43.field955 = var9.field2955;
                                        field686.method4706(var43);
                                    }
                                }
                                if (var38 && var9.field3049 != null) {
                                    class68 var44 = new class68();
                                    var44.field964 = true;
                                    var44.field961 = var9;
                                    var44.field953 = class20.field142 - var10;
                                    var44.field956 = class20.field145 - var11;
                                    var44.field955 = var9.field3049;
                                    field611.method4706(var44);
                                }
                                if (!var9.field3093 && var37) {
                                    var9.field3093 = true;
                                    if (var9.field3050 != null) {
                                        class68 var45 = new class68();
                                        var45.field964 = true;
                                        var45.field961 = var9;
                                        var45.field953 = class20.field142 - var10;
                                        var45.field956 = class20.field145 - var11;
                                        var45.field955 = var9.field3050;
                                        field611.method4706(var45);
                                    }
                                }
                                if (var9.field3093 && var37 && var9.field3051 != null) {
                                    class68 var46 = new class68();
                                    var46.field964 = true;
                                    var46.field961 = var9;
                                    var46.field953 = class20.field142 - var10;
                                    var46.field956 = class20.field145 - var11;
                                    var46.field955 = var9.field3051;
                                    field611.method4706(var46);
                                }
                                if (var9.field3093 && !var37) {
                                    var9.field3093 = false;
                                    if (var9.field3052 != null) {
                                        class68 var47 = new class68();
                                        var47.field964 = true;
                                        var47.field961 = var9;
                                        var47.field953 = class20.field142 - var10;
                                        var47.field956 = class20.field145 - var11;
                                        var47.field955 = var9.field3052;
                                        field686.method4706(var47);
                                    }
                                }
                                if (var9.field3017 != null) {
                                    class68 var48 = new class68();
                                    var48.field961 = var9;
                                    var48.field955 = var9.field3017;
                                    field612.method4706(var48);
                                }
                                if (var9.field3057 != null && field552 > var9.field3096) {
                                    if (var9.field3058 == null || field552 - var9.field3096 > 32) {
                                        class68 var53 = new class68();
                                        var53.field961 = var9;
                                        var53.field955 = var9.field3057;
                                        field611.method4706(var53);
                                    } else {
                                        label634: for (int var49 = var9.field3096; var49 < field552; var49++) {
                                            int var50 = field594[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var9.field3058.length; var51++) {
                                                if (var9.field3058[var51] == var50) {
                                                    class68 var52 = new class68();
                                                    var52.field961 = var9;
                                                    var52.field955 = var9.field3057;
                                                    field611.method4706(var52);
                                                    break label634;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3096 = field552;
                                }
                                if (var9.field3083 != null && field575 > var9.field3097) {
                                    if (var9.field3060 == null || field575 - var9.field3097 > 32) {
                                        class68 var58 = new class68();
                                        var58.field961 = var9;
                                        var58.field955 = var9.field3083;
                                        field611.method4706(var58);
                                    } else {
                                        label610: for (int var54 = var9.field3097; var54 < field575; var54++) {
                                            int var55 = field641[var54 & 0x1F];
                                            for (int var56 = 0; var56 < var9.field3060.length; var56++) {
                                                if (var9.field3060[var56] == var55) {
                                                    class68 var57 = new class68();
                                                    var57.field961 = var9;
                                                    var57.field955 = var9.field3083;
                                                    field611.method4706(var57);
                                                    break label610;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3097 = field575;
                                }
                                if (var9.field2996 != null && field599 > var9.field3098) {
                                    if (var9.field3062 == null || field599 - var9.field3098 > 32) {
                                        class68 var63 = new class68();
                                        var63.field961 = var9;
                                        var63.field955 = var9.field2996;
                                        field611.method4706(var63);
                                    } else {
                                        label586: for (int var59 = var9.field3098; var59 < field599; var59++) {
                                            int var60 = field428[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var9.field3062.length; var61++) {
                                                if (var9.field3062[var61] == var60) {
                                                    class68 var62 = new class68();
                                                    var62.field961 = var9;
                                                    var62.field955 = var9.field2996;
                                                    field611.method4706(var62);
                                                    break label586;
                                                }
                                            }
                                        }
                                    }
                                    var9.field3098 = field599;
                                }
                                if (field602 > var9.field3095 && var9.field3066 != null) {
                                    class68 var64 = new class68();
                                    var64.field961 = var9;
                                    var64.field955 = var9.field3066;
                                    field611.method4706(var64);
                                }
                                if (field610 > var9.field3095 && var9.field3070 != null) {
                                    class68 var65 = new class68();
                                    var65.field961 = var9;
                                    var65.field955 = var9.field3070;
                                    field611.method4706(var65);
                                }
                                if (field604 > var9.field3095 && var9.field3059 != null) {
                                    class68 var66 = new class68();
                                    var66.field961 = var9;
                                    var66.field955 = var9.field3059;
                                    field611.method4706(var66);
                                }
                                if (field605 > var9.field3095 && var9.field3075 != null) {
                                    class68 var67 = new class68();
                                    var67.field961 = var9;
                                    var67.field955 = var9.field3075;
                                    field611.method4706(var67);
                                }
                                if (field606 > var9.field3095 && var9.field3073 != null) {
                                    class68 var68 = new class68();
                                    var68.field961 = var9;
                                    var68.field955 = var9.field3073;
                                    field611.method4706(var68);
                                }
                                if (field607 > var9.field3095 && var9.field2982 != null) {
                                    class68 var69 = new class68();
                                    var69.field961 = var9;
                                    var69.field955 = var9.field2982;
                                    field611.method4706(var69);
                                }
                                if (field480 > var9.field3095 && var9.field3079 != null) {
                                    class68 var70 = new class68();
                                    var70.field961 = var9;
                                    var70.field955 = var9.field3079;
                                    field611.method4706(var70);
                                }
                                if (field517 > var9.field3095 && var9.field3074 != null) {
                                    class68 var71 = new class68();
                                    var71.field961 = var9;
                                    var71.field955 = var9.field3074;
                                    field611.method4706(var71);
                                }
                                var9.field3095 = field593;
                                if (var9.field3067 != null) {
                                    for (int var72 = 0; var72 < field451; var72++) {
                                        class68 var73 = new class68();
                                        var73.field961 = var9;
                                        var73.field959 = field431[var72];
                                        var73.field960 = field634[var72];
                                        var73.field955 = var9.field3067;
                                        field611.method4706(var73);
                                    }
                                }
                                if (var9.field3068 != null) {
                                    int[] var74 = class11.method2374();
                                    for (int var75 = 0; var75 < var74.length; var75++) {
                                        class68 var76 = new class68();
                                        var76.field961 = var9;
                                        var76.field959 = var74[var75];
                                        var76.field955 = var9.field3068;
                                        field611.method4706(var76);
                                    }
                                }
                                if (var9.field3069 != null) {
                                    int[] var77 = class11.method1843();
                                    for (int var78 = 0; var78 < var77.length; var78++) {
                                        class68 var79 = new class68();
                                        var79.field961 = var9;
                                        var79.field959 = var77[var78];
                                        var79.field955 = var9.field3069;
                                        field611.method4706(var79);
                                    }
                                }
                            }
                        }
                        if (!var9.field2993) {
                            if (field581 != null || Statics.field688 != null || field544) {
                                continue;
                            }
                            if ((var9.field3012 >= 0 || var9.field2985 != 0) && class20.field142 >= var12 && class20.field145 >= var13 && class20.field142 < var14 && class20.field145 < var15) {
                                if (var9.field3012 >= 0) {
                                    Statics.field2923 = arg0[var9.field3012];
                                } else {
                                    Statics.field2923 = var9;
                                }
                            }
                            if (var9.field2977 == 8 && class20.field142 >= var12 && class20.field145 >= var13 && class20.field142 < var14 && class20.field145 < var15) {
                                Statics.field3699 = var9;
                            }
                            if (var9.field3091 > var9.field2990) {
                                method2270(var9, var9.field2973 + var10, var11, var9.field2990, var9.field3091, class20.field142, class20.field145);
                            }
                        }
                        if (var9.field2977 == 0) {
                            method4403(arg0, var9.field2958, var12, var13, var14, var15, var10 - var9.field3054, var11 - var9.field2968);
                            if (var9.field3061 != null) {
                                method4403(var9.field3061, var9.field2958, var12, var13, var14, var15, var10 - var9.field3054, var11 - var9.field2968);
                            }
                            class67 var80 = (class67) field569.method5756((long) var9.field2958);
                            if (var80 != null) {
                                if (var80.field949 == 0 && class20.field142 >= var12 && class20.field145 >= var13 && class20.field142 < var14 && class20.field145 < var15 && !field544) {
                                    for (class68 var81 = (class68) field611.method4721(); var81 != null; var81 = (class68) field611.method4712()) {
                                        if (var81.field964) {
                                            var81.method5447();
                                            var81.field961.field3093 = false;
                                        }
                                    }
                                    if (Statics.field1319 == 0) {
                                        field581 = null;
                                        field582 = null;
                                    }
                                    if (!field544) {
                                        method102();
                                    }
                                }
                                method4213(var80.field950, var12, var13, var14, var15, var10, var11);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("kg.js(II)Z")
    public static boolean method5086(int arg0) {
        for (int var1 = 0; var1 < field451; var1++) {
            if (field431[var1] == arg0) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fj.jm(IIB)V")
    public static final void method2893(int arg0, int arg1) {
        if (class249.method4333(arg0)) {
            method1855(Statics.field3039[arg0], arg1);
        }
    }

    @ObfuscatedName("bh.jy([Lio;II)V")
    public static final void method1855(class249[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class249 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2977 == 0) {
                    if (var3.field3061 != null) {
                        method1855(var3.field3061, arg1);
                    }
                    class67 var4 = (class67) field569.method5756((long) var3.field2958);
                    if (var4 != null) {
                        method2893(var4.field950, arg1);
                    }
                }
                if (arg1 == 0 && var3.field3008 != null) {
                    class68 var5 = new class68();
                    var5.field961 = var3;
                    var5.field955 = var3.field3008;
                    class51.method2079(var5);
                }
                if (arg1 == 1 && var3.field3076 != null) {
                    if (var3.field3031 >= 0) {
                        class249 var6 = class249.method2019(var3.field2958);
                        if (var6 == null || var6.field3061 == null || var3.field3031 >= var6.field3061.length || var6.field3061[var3.field3031] != var3) {
                            continue;
                        }
                    }
                    class68 var7 = new class68();
                    var7.field961 = var3;
                    var7.field955 = var3.field3076;
                    class51.method2079(var7);
                }
            }
        }
    }

    @ObfuscatedName("bu.jb(Lio;III)V")
    public static final void method1701(class249 arg0, int arg1, int arg2) {
        if (field581 != null || field544 || arg0 == null) {
            return;
        }
        class249 var3 = method2239(arg0);
        if (var3 == null) {
            var3 = arg0.field3064;
        }
        if (var3 == null) {
            return;
        }
        field581 = arg0;
        class249 var5 = method2239(arg0);
        if (var5 == null) {
            var5 = arg0.field3064;
        }
        field582 = var5;
        field583 = arg1;
        field525 = arg2;
        Statics.field1319 = 0;
        field592 = false;
        int var7 = method2885();
        if (var7 != -1) {
            Statics.field1305 = new class54();
            Statics.field1305.field791 = field678[var7];
            Statics.field1305.field787 = field547[var7];
            Statics.field1305.field786 = field548[var7];
            Statics.field1305.field789 = field549[var7];
            Statics.field1305.field790 = field485[var7];
        }
        return;
    }

    @ObfuscatedName("client.jf(B)V")
    public final void method853() {
        method1893(field581);
        Statics.field1319++;
        if (field589 && field586) {
            int var1 = class20.field142;
            int var2 = class20.field145;
            int var3 = var1 - field583;
            int var4 = var2 - field525;
            if (var3 < field587) {
                var3 = field587;
            }
            if (field581.field2973 + var3 > field587 + field582.field2973) {
                var3 = field587 + field582.field2973 - field581.field2973;
            }
            if (var4 < field588) {
                var4 = field588;
            }
            if (field581.field2990 + var4 > field588 + field582.field2990) {
                var4 = field588 + field582.field2990 - field581.field2990;
            }
            int var5 = var3 - field679;
            int var6 = var4 - field677;
            int var7 = field581.field3040;
            if (Statics.field1319 > field581.field2957 && (var5 > var7 || var5 < -var7 || var6 > var7 || var6 < -var7)) {
                field592 = true;
            }
            int var8 = field582.field3054 + (var3 - field587);
            int var9 = field582.field2968 + (var4 - field588);
            if (field581.field2995 != null && field592) {
                class68 var10 = new class68();
                var10.field961 = field581;
                var10.field953 = var8;
                var10.field956 = var9;
                var10.field955 = field581.field2995;
                class51.method2079(var10);
            }
            if (class20.field141 == 0) {
                if (field592) {
                    if (field581.field3081 != null) {
                        class68 var11 = new class68();
                        var11.field961 = field581;
                        var11.field953 = var8;
                        var11.field956 = var9;
                        var11.field958 = field585;
                        var11.field955 = field581.field3081;
                        class51.method2079(var11);
                    }
                    if (field585 != null && method2239(field581) != null) {
                        class229 var12 = class229.method2538(class227.field2662, field453.field1205);
                        var12.field2691.method6004(field581.field2958);
                        var12.field2691.method5994(field585.field3031);
                        var12.field2691.method6087(field581.field3088);
                        var12.field2691.method6087(field585.field3088);
                        var12.field2691.method5994(field581.field3031);
                        var12.field2691.method5944(field585.field2958);
                        field453.method1987(var12);
                    }
                } else if (this.method951()) {
                    this.method850(field679 + field583, field677 + field525);
                } else if (field545 > 0) {
                    int var13 = field679 + field583;
                    int var14 = field677 + field525;
                    Statics.method518(Statics.field1305, var13, var14);
                    Statics.field1305 = null;
                }
                field581 = null;
            }
        } else if (Statics.field1319 > 1) {
            field581 = null;
        }
    }

    @ObfuscatedName("ce.jp(Lio;I)V")
    public static void method1893(class249 arg0) {
        if (field616 == arg0.field3100) {
            field617[arg0.field2966] = true;
        }
    }

    @ObfuscatedName("de.jl(I)V")
    public static void method2129() {
        for (class67 var0 = (class67) field569.method5746(); var0 != null; var0 = (class67) field569.method5749()) {
            int var1 = var0.field950;
            if (class249.method4333(var1)) {
                boolean var2 = true;
                class249[] var3 = Statics.field3039[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2993;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3966;
                    class249 var6 = class249.method2019(var5);
                    if (var6 != null) {
                        method1893(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cv.jx(D)V")
    public static final void method2088(double arg0) {
        class198.method3461(arg0);
        ((class205) Statics.field2269).method3749(arg0);
        class157.field1837.method3930();
        Statics.field308.field1118 = arg0;
        class76.method2370();
    }

    @ObfuscatedName("dz.jj(II)V")
    public static final void method2290(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 255);
        if (Statics.field308.field1119 == var1) {
            return;
        }
        if (Statics.field308.field1119 == 0 && field640 != -1) {
            class235.method1910(Statics.field1326, field640, 0, var1, false);
            field648 = false;
        } else if (var1 == 0) {
            class235.method1634();
            field648 = false;
        } else {
            class235.method5710(var1);
        }
        Statics.field308.field1119 = var1;
        class76.method2370();
    }

    @ObfuscatedName("ck.jk(IB)V")
    public static final void method2097(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field308.field1121 = var1;
        class76.method2370();
    }

    @ObfuscatedName("u.kn(II)V")
    public static final void method171(int arg0) {
        int var1 = Math.min(Math.max(arg0, 0), 127);
        Statics.field308.field1116 = var1;
        class76.method2370();
    }

    @ObfuscatedName("ap.ki(IS)V")
    public static final void method817(int arg0) {
        method2129();
        class50.method2432();
        int var1 = class140.method1405(arg0).field1528;
        if (var1 == 0) {
            return;
        }
        int var2 = class244.field2911[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                method2088(0.9D);
            }
            if (var2 == 2) {
                method2088(0.8D);
            }
            if (var2 == 3) {
                method2088(0.7D);
            }
            if (var2 == 4) {
                method2088(0.6D);
            }
        }
        if (var1 == 3) {
            if (var2 == 0) {
                method2290(255);
            }
            if (var2 == 1) {
                method2290(192);
            }
            if (var2 == 2) {
                method2290(128);
            }
            if (var2 == 3) {
                method2290(64);
            }
            if (var2 == 4) {
                method2290(0);
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                method2097(127);
            }
            if (var2 == 1) {
                method2097(96);
            }
            if (var2 == 2) {
                method2097(64);
            }
            if (var2 == 3) {
                method2097(32);
            }
            if (var2 == 4) {
                method2097(0);
            }
        }
        if (var1 == 5) {
            field528 = var2;
        }
        if (var1 == 6) {
            field572 = var2;
        }
        if (var1 == 9) {
            field655 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                method171(127);
            }
            if (var2 == 1) {
                method171(96);
            }
            if (var2 == 2) {
                method171(64);
            }
            if (var2 == 3) {
                method171(32);
            }
            if (var2 == 4) {
                method171(0);
            }
        }
        if (var1 == 17) {
            field510 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field459 = (class81) class291.method4326(class81.method4677(), var2);
            if (field459 == null) {
                field459 = class81.field1154;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field535 = -1;
            } else {
                field535 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field433 = (class81) class291.method4326(class81.method4677(), var2);
            if (field433 == null) {
                field433 = class81.field1154;
            }
        }
    }

    @ObfuscatedName("ao.kr(Lio;B)V")
    public static final void method742(class249 arg0) {
        int var1 = arg0.field2962;
        if (var1 == 324) {
            if (field675 == -1) {
                field675 = arg0.field3084;
                field676 = arg0.field3006;
            }
            if (field598.field2931) {
                arg0.field3084 = field675;
            } else {
                arg0.field3084 = field676;
            }
        } else if (var1 == 325) {
            if (field675 == -1) {
                field675 = arg0.field3084;
                field676 = arg0.field3006;
            }
            if (field598.field2931) {
                arg0.field3084 = field676;
            } else {
                arg0.field3084 = field675;
            }
        } else if (var1 == 327) {
            arg0.field3009 = 150;
            arg0.field3010 = (int) (Math.sin((double) field452 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2950 = 5;
            arg0.field3002 = 0;
        } else if (var1 == 328) {
            arg0.field3009 = 150;
            arg0.field3010 = (int) (Math.sin((double) field452 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field2950 = 5;
            arg0.field3002 = 1;
        }
    }

    @ObfuscatedName("y.kf(I)V")
    public static final void method483() {
        class229 var0 = class229.method2538(class227.field2657, field453.field1205);
        field453.method1987(var0);
        for (class67 var1 = (class67) field569.method5746(); var1 != null; var1 = (class67) field569.method5749()) {
            if (var1.field949 == 0 || var1.field949 == 3) {
                Statics.method2891(var1, true);
            }
        }
        if (field574 != null) {
            method1893(field574);
            field574 = null;
        }
    }

    @ObfuscatedName("dn.kl(IIII)Lbj;")
    public static final class67 method2122(int arg0, int arg1, int arg2) {
        class67 var3 = new class67();
        var3.field950 = arg1;
        var3.field949 = arg2;
        field569.method5747(var3, (long) arg0);
        Statics.method5110(arg1);
        class249 var4 = class249.method2019(arg0);
        method1893(var4);
        if (field574 != null) {
            method1893(field574);
            field574 = null;
        }
        for (int var5 = 0; var5 < field545; var5++) {
            if (method500(field548[var5])) {
                if (var5 < field545 - 1) {
                    for (int var6 = var5; var6 < field545 - 1; var6++) {
                        field485[var6] = field485[var6 + 1];
                        field551[var6] = field551[var6 + 1];
                        field548[var6] = field548[var6 + 1];
                        field549[var6] = field549[var6 + 1];
                        field678[var6] = field678[var6 + 1];
                        field547[var6] = field547[var6 + 1];
                        field674[var6] = field674[var6 + 1];
                    }
                }
                var5--;
                field545--;
            }
        }
        method1620();
        method1892(Statics.field3039[arg0 >> 16], var4, false);
        class51.method2146(arg1);
        if (field568 != -1) {
            method2893(field568, 1);
        }
        return var3;
    }

    @ObfuscatedName("ni.kj(Lio;B)Z")
    public static final boolean method5868(class249 arg0) {
        int var1 = arg0.field2962;
        if (var1 == 205) {
            field571 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field598.method4229(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field598.method4222(var4, var5 == 1);
        }
        if (var1 == 324) {
            field598.method4219(false);
        }
        if (var1 == 325) {
            field598.method4219(true);
        }
        if (var1 == 326) {
            class229 var6 = class229.method2538(class227.field2658, field453.field1205);
            field598.method4220(var6.field2691);
            field453.method1987(var6);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ba.ku(Lio;IIII)V")
    public static final void method1687(class249 arg0, int arg1, int arg2, int arg3) {
        method4372();
        class243 var4 = arg0.method4266(false);
        if (var4 == null) {
            return;
        }
        class394.method6286(arg1, arg2, var4.field2910 + arg1, var4.field2906 + arg2);
        if (field646 == 2 || field646 == 5) {
            class394.method6284(arg1, arg2, 0, var4.field2908, var4.field2905);
        } else {
            int var5 = field445 & 0x7FF;
            int var6 = Statics.field140.field1069 / 32 + 48;
            int var7 = 464 - Statics.field140.field1059 / 32;
            Statics.field4167.method6395(arg1, arg2, var4.field2910, var4.field2906, var6, var7, var5, 256, var4.field2908, var4.field2905);
            for (int var8 = 0; var8 < field621; var8++) {
                int var9 = field614[var8] * 4 + 2 - Statics.field140.field1069 / 32;
                int var10 = field642[var8] * 4 + 2 - Statics.field140.field1059 / 32;
                method4390(arg1, arg2, var9, var10, field643[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class296 var13 = field536[Statics.field3652][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field140.field1069 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field140.field1059 / 32;
                        method4390(arg1, arg2, var14, var15, Statics.field1452[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field685; var16++) {
                class78 var17 = field567[field450[var16]];
                if (var17 != null && var17.method1738()) {
                    class148 var18 = var17.field1132;
                    if (var18 != null && var18.field1646 != null) {
                        var18 = var18.method2514();
                    }
                    if (var18 != null && var18.field1643 && var18.field1649) {
                        int var19 = var17.field1069 / 32 - Statics.field140.field1069 / 32;
                        int var20 = var17.field1059 / 32 - Statics.field140.field1059 / 32;
                        method4390(arg1, arg2, var19, var20, Statics.field1452[1], var4);
                    }
                }
            }
            int var21 = class83.field1172;
            int[] var22 = class83.field1178;
            for (int var23 = 0; var23 < var21; var23++) {
                class70 var24 = field524[var22[var23]];
                if (var24 != null && var24.method1738() && !var24.field998 && Statics.field140 != var24) {
                    int var25 = var24.field1069 / 32 - Statics.field140.field1069 / 32;
                    int var26 = var24.field1059 / 32 - Statics.field140.field1059 / 32;
                    if (var24.method1725()) {
                        method4390(arg1, arg2, var25, var26, Statics.field1452[3], var4);
                    } else if (Statics.field140.field997 != 0 && var24.field997 != 0 && Statics.field140.field997 == var24.field997) {
                        method4390(arg1, arg2, var25, var26, Statics.field1452[4], var4);
                    } else if (var24.method1728()) {
                        method4390(arg1, arg2, var25, var26, Statics.field1452[5], var4);
                    } else if (var24.method1733()) {
                        method4390(arg1, arg2, var25, var26, Statics.field1452[6], var4);
                    } else {
                        method4390(arg1, arg2, var25, var26, Statics.field1452[2], var4);
                    }
                }
            }
            if (field424 != 0 && field452 % 20 < 10) {
                if (field424 == 1 && field425 >= 0 && field425 < field567.length) {
                    class78 var27 = field567[field425];
                    if (var27 != null) {
                        int var28 = var27.field1069 / 32 - Statics.field140.field1069 / 32;
                        int var29 = var27.field1059 / 32 - Statics.field140.field1059 / 32;
                        method1954(arg1, arg2, var28, var29, Statics.field1679[1], var4);
                    }
                }
                if (field424 == 2) {
                    int var30 = field477 * 4 - Statics.field3625 * 4 + 2 - Statics.field140.field1069 / 32;
                    int var31 = field454 * 4 - Statics.field1134 * 4 + 2 - Statics.field140.field1059 / 32;
                    method1954(arg1, arg2, var30, var31, Statics.field1679[1], var4);
                }
                if (field424 == 10 && field426 >= 0 && field426 < field524.length) {
                    class70 var32 = field524[field426];
                    if (var32 != null) {
                        int var33 = var32.field1069 / 32 - Statics.field140.field1069 / 32;
                        int var34 = var32.field1059 / 32 - Statics.field140.field1059 / 32;
                        method1954(arg1, arg2, var33, var34, Statics.field1679[1], var4);
                    }
                }
            }
            if (field644 != 0) {
                int var35 = field644 * 4 + 2 - Statics.field140.field1069 / 32;
                int var36 = field597 * 4 + 2 - Statics.field140.field1059 / 32;
                method4390(arg1, arg2, var35, var36, Statics.field1679[0], var4);
            }
            if (!Statics.field140.field998) {
                class394.method6272(var4.field2910 / 2 + arg1 - 1, var4.field2906 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field618[arg3] = true;
    }

    @ObfuscatedName("mv.ks(Lio;IIII)V")
    public static final void method5438(class249 arg0, int arg1, int arg2, int arg3) {
        class243 var4 = arg0.method4266(false);
        if (var4 == null) {
            return;
        }
        if (field646 < 3) {
            Statics.field736.method6395(arg1, arg2, var4.field2910, var4.field2906, 25, 25, field445, 256, var4.field2908, var4.field2905);
        } else {
            class394.method6284(arg1, arg2, 0, var4.field2908, var4.field2905);
        }
    }

    @ObfuscatedName("ci.ke(IIIILom;Liy;I)V")
    public static final void method1954(int arg0, int arg1, int arg2, int arg3, class398 arg4, class243 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method4390(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field445 & 0x7FF;
        int var8 = class198.field2266[var7];
        int var9 = class198.field2273[var7];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = arg5.field2910 / 2 - 25;
        int var15 = (int) (Math.sin(var12) * (double) var14);
        int var16 = (int) (Math.cos(var12) * (double) var14);
        byte var17 = 20;
        Statics.field1594.method6396(arg5.field2910 / 2 + arg0 - var17 / 2 + var15, arg5.field2906 / 2 + arg1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
    }

    @ObfuscatedName("jw.kd(IIIILom;Liy;B)V")
    public static final void method4390(int arg0, int arg1, int arg2, int arg3, class398 arg4, class243 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field445 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class198.field2266[var6];
        int var9 = class198.field2273[var6];
        int var10 = arg2 * var9 + arg3 * var8 >> 16;
        int var11 = arg3 * var9 - arg2 * var8 >> 16;
        if (var7 > 2500) {
            arg4.method6394(arg5.field2910 / 2 + var10 - arg4.field4274 / 2, arg5.field2906 / 2 - var11 - arg4.field4275 / 2, arg0, arg1, arg5.field2910, arg5.field2906, arg5.field2908, arg5.field2905);
        } else {
            arg4.method6403(arg5.field2910 / 2 + arg0 + var10 - arg4.field4274 / 2, arg5.field2906 / 2 + arg1 - var11 - arg4.field4275 / 2);
        }
    }

    @ObfuscatedName("de.kk(B)V")
    public static final void method2131() {
        for (int var0 = 0; var0 < class83.field1172; var0++) {
            class70 var1 = field524[class83.field1178[var0]];
            var1.method1726();
        }
        Statics.method345();
        if (Statics.field972 != null) {
            Statics.field972.method5143();
        }
    }

    @ObfuscatedName("ig.ko(I)V")
    public static final void method4341() {
        class85.method3214();
        if (Statics.field972 != null) {
            Statics.field972.method5156();
        }
    }

    @ObfuscatedName("dp.kc(B)V")
    public static final void method2273() {
        field610 = field593;
    }

    @ObfuscatedName("c.kt(I)V")
    public static final void method339() {
        field604 = field593;
        Statics.field1232 = true;
    }

    @ObfuscatedName("ac.kb(I)V")
    public static final void method1546() {
        field605 = field593;
        Statics.field1183 = true;
    }

    @ObfuscatedName("bm.ky(Ljava/lang/String;I)V")
    public static final void method1684(String arg0) {
        if (Statics.field972 != null) {
            class229 var1 = class229.method2538(class227.field2633, field453.field1205);
            var1.field2691.method5941(class385.method4571(arg0));
            var1.field2691.method5948(arg0);
            field453.method1987(var1);
        }
    }

    @ObfuscatedName("ah.kx(Ljava/lang/String;I)V")
    public static final void method825(String arg0) {
        if (!arg0.equals("")) {
            class229 var1 = class229.method2538(class227.field2655, field453.field1205);
            var1.field2691.method5941(class385.method4571(arg0));
            var1.field2691.method5948(arg0);
            field453.method1987(var1);
        }
    }

    @ObfuscatedName("by.kw(I)V")
    public static final void method1604() {
        class229 var0 = class229.method2538(class227.field2655, field453.field1205);
        var0.field2691.method5941(0);
        field453.method1987(var0);
    }

    @ObfuscatedName("iu.km(IIB)V")
    public static final void method4183(int arg0, int arg1) {
        class124 var2 = arg0 >= 0 ? field638[arg0] : Statics.field3845;
        if (var2 == null || arg1 < 0 || arg1 >= var2.method2254()) {
            return;
        }
        class106 var3 = (class106) var2.field1436.get(arg1);
        if (var3.field1306 != -1) {
            return;
        }
        String var4 = var3.field1303.method6520();
        class86 var5 = field453;
        class229 var6 = class229.method2538(class227.field2672, var5.field1205);
        var6.field2691.method5941(3 + class385.method4571(var4));
        var6.field2691.method5941(arg0);
        var6.field2691.method6132(arg1);
        var6.field2691.method5948(var4);
        var5.method1987(var6);
    }

    @ObfuscatedName("i.ka(III)V")
    public static final void method364(int arg0, int arg1) {
        if (field638[arg0] == null || arg1 < 0 || arg1 >= field638[arg0].method2254()) {
            return;
        }
        class106 var2 = (class106) field638[arg0].field1436.get(arg1);
        if (var2.field1306 != -1) {
            return;
        }
        class86 var3 = field453;
        class229 var4 = class229.method2538(class227.field2646, var3.field1205);
        var4.field2691.method5941(3 + class385.method4571(var2.field1303.method6520()));
        var4.field2691.method5941(arg0);
        var4.field2691.method6132(arg1);
        var4.field2691.method5948(var2.field1303.method6520());
        var3.method1987(var4);
    }

    @ObfuscatedName("nc.kz(IIZB)V")
    public static final void method6238(int arg0, int arg1, boolean arg2) {
        if (field638[arg0] == null || arg1 < 0 || arg1 >= field638[arg0].method2254()) {
            return;
        }
        class106 var3 = (class106) field638[arg0].field1436.get(arg1);
        class86 var4 = field453;
        class229 var5 = class229.method2538(class227.field2665, var4.field1205);
        var5.field2691.method5941(4 + class385.method4571(var3.field1303.method6520()));
        var5.field2691.method5941(arg0);
        var5.field2691.method6132(arg1);
        var5.field2691.method5947(arg2);
        var5.field2691.method5948(var3.field1303.method6520());
        var4.method1987(var5);
    }

    @ObfuscatedName("ag.kp(II)V")
    public static void method1336(int arg0) {
        for (class353 var1 = (class353) field469.method5746(); var1 != null; var1 = (class353) field469.method5749()) {
            if ((long) arg0 == (var1.field3966 >> 48 & 0xFFFFL)) {
                var1.method5447();
            }
        }
    }

    @ObfuscatedName("iu.kg(Lio;B)I")
    public static int method4179(class249 arg0) {
        class353 var1 = (class353) field469.method5756(((long) arg0.field2958 << 32) + (long) arg0.field3031);
        return var1 == null ? arg0.field2979 : var1.field3964;
    }

    @ObfuscatedName("dq.kv(Lio;I)Lio;")
    public static class249 method2239(class249 arg0) {
        int var1 = class250.method39(method4179(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class249.method2019(arg0.field3001);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("en.lz(Lio;B)Z")
    public static boolean method2574(class249 arg0) {
        return arg0.field2978;
    }

    @ObfuscatedName("y.ls(Lio;I)Ljava/lang/String;")
    public static String method457(class249 arg0) {
        if (class250.method2115(method4179(arg0)) == 0) {
            return null;
        } else if (arg0.field3043 == null || arg0.field3043.trim().length() == 0) {
            return null;
        } else {
            return arg0.field3043;
        }
    }

    @ObfuscatedName("ch.ll(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method2055(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field407 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field407 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field407 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field407 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field407 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1661 != null) {
            var3 = "/p=" + Statics.field1661;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + Statics.field3644 + "/a=" + Statics.field4314 + var3 + "/";
    }

    @ObfuscatedName("ay.lj(Ljava/lang/String;I)V")
    public static void method815(String arg0) {
        Statics.field1661 = arg0;
        try {
            String var1 = Statics.field874.getParameter(Integer.toString(18));
            String var2 = Statics.field874.getParameter(Integer.toString(13));
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class254.method1699(class382.method2013() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class15.method143(Statics.field874, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("gu.lu(Ljava/lang/String;ZI)V")
    public static void method3278(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1687; var5++) {
            class157 var6 = class157.method101(var5);
            if ((!arg1 || var6.field1834) && var6.field1789 == -1 && var6.field1836.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field2520 = -1;
                    Statics.field1137 = null;
                    return;
                }
                if (var4 >= var3.length) {
                    short[] var7 = new short[var3.length * 2];
                    for (int var8 = 0; var8 < var4; var8++) {
                        var7[var8] = var3[var8];
                    }
                    var3 = var7;
                }
                var3[var4++] = (short) var5;
            }
        }
        Statics.field1137 = var3;
        Statics.field1165 = 0;
        Statics.field2520 = var4;
        String[] var9 = new String[Statics.field2520];
        for (int var10 = 0; var10 < Statics.field2520; var10++) {
            var9[var10] = class157.method101(var3[var10]).field1836;
        }
        short[] var11 = Statics.field1137;
        class380.method4674(var9, var11, 0, var9.length - 1);
    }

    @ObfuscatedName("ed.la([BIB)V")
    public static void method2493(byte[] arg0, int arg1) {
        if (field447 == null) {
            field447 = new byte[24];
        }
        class309.method5071(arg0, arg1, field447, 0, 24);
    }

    @ObfuscatedName("bm.ld(Lnv;IB)V")
    public static void method1683(class385 arg0, int arg1) {
        method2493(arg0.field4184, arg1);
        class131.method1705(arg0, arg1);
    }

    @ObfuscatedName("ed.lf(Lnv;I)V")
    public static void method2494(class385 arg0) {
        if (field447 == null) {
            byte[] var1 = class131.method2389();
            arg0.method6013(var1, 0, var1.length);
        } else {
            arg0.method6013(field447, 0, field447.length);
        }
    }

    @ObfuscatedName("client.lb(B)Loh;")
    public class406 method854() {
        return Statics.field140 == null ? null : Statics.field140.field980;
    }

    @ObfuscatedName("md.lc(IIIZI)V")
    public static void method5429(int arg0, int arg1, int arg2, boolean arg3) {
        class229 var4 = class229.method2538(class227.field2635, field453.field1205);
        var4.field2691.method5941(arg2);
        var4.field2691.method6132(arg1);
        var4.field2691.method6087(arg0);
        var4.field2691.method5944(arg3 ? field489 : 0);
        field453.method1987(var4);
    }

    @ObfuscatedName("ea.lg(I)Z")
    public static boolean method2470() {
        return field577 >= 2;
    }

    @ObfuscatedName("fo.lm(II)V")
    public static void method3261(int arg0) {
        field482 = arg0;
    }

    @ObfuscatedName("ma.ly(B)V")
    public static void method5400() {
        if (field482 == 1) {
            field490 = true;
        }
    }

    @ObfuscatedName("dc.lw(I)V")
    public static void method2132() {
        if (!field490 || Statics.field140 == null) {
            return;
        }
        int var0 = Statics.field140.field1076[0];
        int var1 = Statics.field140.field1077[0];
        if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
            return;
        }
        Statics.field66 = Statics.field140.field1069;
        int var2 = Statics.method2240(Statics.field140.field1069, Statics.field140.field1059, Statics.field3652) - field483;
        if (var2 < Statics.field3533) {
            Statics.field3533 = var2;
        }
        Statics.field3553 = Statics.field140.field1059;
        field490 = false;
    }

    @ObfuscatedName("bt.lt(Ljava/lang/String;S)Ljava/lang/String;")
    public static String method1559(String arg0) {
        class272[] var1 = class272.method1983();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class272 var3 = var1[var2];
            if (var3.field3543 != -1 && arg0.startsWith(class79.method1846(var3.field3543))) {
                arg0 = arg0.substring(6 + Integer.toString(var3.field3543).length());
                break;
            }
        }
        return arg0;
    }
}

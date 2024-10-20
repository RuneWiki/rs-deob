package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class144 {

    @ObfuscatedName("client.a")
    public static boolean field286 = true;

    @ObfuscatedName("client.i")
    public static int field287 = 1;

    @ObfuscatedName("client.f")
    public static int field288 = 0;

    @ObfuscatedName("client.o")
    public static int field289 = 0;

    @ObfuscatedName("client.k")
    public static boolean field292 = false;

    @ObfuscatedName("client.r")
    public static boolean field458 = false;

    @ObfuscatedName("client.b")
    public static int field473 = 0;

    @ObfuscatedName("client.d")
    public static int field296 = 0;

    @ObfuscatedName("client.z")
    public static boolean field317 = true;

    @ObfuscatedName("client.p")
    public static int field395 = 0;

    @ObfuscatedName("client.w")
    public static class108[] field347 = new class108[4];

    @ObfuscatedName("client.t")
    public static long field299 = -1L;

    @ObfuscatedName("client.e")
    public static int field300 = -1;

    @ObfuscatedName("client.v")
    public static int field374 = -1;

    @ObfuscatedName("client.ab")
    public static int field446 = -1;

    @ObfuscatedName("client.ak")
    public static boolean field303 = true;

    @ObfuscatedName("client.am")
    public static boolean field304 = false;

    @ObfuscatedName("client.aw")
    public static int field291 = 0;

    @ObfuscatedName("client.az")
    public static int field352 = 0;

    @ObfuscatedName("client.ac")
    public static int field307 = 0;

    @ObfuscatedName("client.ax")
    public static int field308 = 0;

    @ObfuscatedName("client.ai")
    public static int field439 = 0;

    @ObfuscatedName("client.ar")
    public static int field310 = 0;

    @ObfuscatedName("client.aa")
    public static int field311 = 0;

    @ObfuscatedName("client.as")
    public static int field312 = 0;

    @ObfuscatedName("client.ag")
    public static int field566 = 0;

    @ObfuscatedName("client.an")
    public static class21 field314 = class21.field580;

    @ObfuscatedName("client.at")
    public static class21 field358 = class21.field580;

    @ObfuscatedName("client.aq")
    public static int field404 = 0;

    @ObfuscatedName("client.ad")
    public static int field318 = 0;

    @ObfuscatedName("client.au")
    public static int field530 = 0;

    @ObfuscatedName("client.bx")
    public static int field437 = 0;

    @ObfuscatedName("client.bb")
    public static int field321 = 0;

    @ObfuscatedName("client.bz")
    public static int field571 = 0;

    @ObfuscatedName("client.ba")
    public static int field323 = 0;

    @ObfuscatedName("client.bt")
    public static int field324 = 0;

    @ObfuscatedName("client.cx")
    public static class35[] field325 = new class35[32768];

    @ObfuscatedName("client.ch")
    public static int field562 = 0;

    @ObfuscatedName("client.cg")
    public static int[] field327 = new int[32768];

    @ObfuscatedName("client.cm")
    public static int field328 = 0;

    @ObfuscatedName("client.cn")
    public static int[] field329 = new int[250];

    @ObfuscatedName("client.cp")
    public static class122 field330 = new class122(5000);

    @ObfuscatedName("client.co")
    public static class122 field331 = new class122(5000);

    @ObfuscatedName("client.cd")
    public static class122 field294 = new class122(15000);

    @ObfuscatedName("client.cu")
    public static int field333 = 0;

    @ObfuscatedName("client.cl")
    public static int field334 = 0;

    @ObfuscatedName("client.ct")
    public static int field335 = 0;

    @ObfuscatedName("client.cj")
    public static int field338 = 0;

    @ObfuscatedName("client.cy")
    public static int field337 = 0;

    @ObfuscatedName("client.ci")
    public static int field547 = 0;

    @ObfuscatedName("client.ca")
    public static int field555 = 0;

    @ObfuscatedName("client.cz")
    public static int field340 = 0;

    @ObfuscatedName("client.cf")
    public static boolean field305 = false;

    @ObfuscatedName("client.dr")
    public static int field373 = 0;

    @ObfuscatedName("client.du")
    public static int field435 = 1;

    @ObfuscatedName("client.di")
    public static int field344 = 0;

    @ObfuscatedName("client.dz")
    public static int field345 = 1;

    @ObfuscatedName("client.dl")
    public static int field346 = 0;

    @ObfuscatedName("client.df")
    public static boolean field348 = false;

    @ObfuscatedName("client.db")
    public static int[][][] field527 = new int[4][13][13];

    @ObfuscatedName("client.dw")
    public static final int[] field350 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dg")
    public static int field284 = 0;

    @ObfuscatedName("client.dk")
    public static int field343 = 2;

    @ObfuscatedName("client.da")
    public static int field353 = 0;

    @ObfuscatedName("client.ds")
    public static int field354 = 2;

    @ObfuscatedName("client.dx")
    public static int field355 = 0;

    @ObfuscatedName("client.ee")
    public static int field356 = 1;

    @ObfuscatedName("client.et")
    public static int field378 = 0;

    @ObfuscatedName("client.ed")
    public static int field523 = 0;

    @ObfuscatedName("client.eg")
    public static int field332 = 2;

    @ObfuscatedName("client.en")
    public static int field360 = 0;

    @ObfuscatedName("client.ea")
    public static int field361 = 1;

    @ObfuscatedName("client.eu")
    public static int field399 = 0;

    @ObfuscatedName("client.ex")
    public static int field363 = 0;

    @ObfuscatedName("client.eq")
    public static int field367 = 2301979;

    @ObfuscatedName("client.ev")
    public static int field368 = 5063219;

    @ObfuscatedName("client.el")
    public static int field369 = 3353893;

    @ObfuscatedName("client.eb")
    public static int field370 = 7759444;

    @ObfuscatedName("client.es")
    public static boolean field436 = false;

    @ObfuscatedName("client.fn")
    public static int field372 = 0;

    @ObfuscatedName("client.fz")
    public static int field556 = 128;

    @ObfuscatedName("client.fi")
    public static int field375 = 0;

    @ObfuscatedName("client.fk")
    public static int field506 = 0;

    @ObfuscatedName("client.fb")
    public static int field377 = 0;

    @ObfuscatedName("client.ff")
    public static int field416 = 0;

    @ObfuscatedName("client.fe")
    public static int field379 = 0;

    @ObfuscatedName("client.fr")
    public static int field380 = 50;

    @ObfuscatedName("client.fm")
    public static int field381 = 0;

    @ObfuscatedName("client.fv")
    public static boolean field382 = false;

    @ObfuscatedName("client.fd")
    public static int field552 = 0;

    @ObfuscatedName("client.fg")
    public static int field384 = 0;

    @ObfuscatedName("client.fo")
    public static int field385 = 50;

    @ObfuscatedName("client.ft")
    public static int[] field479 = new int[field385];

    @ObfuscatedName("client.fq")
    public static int[] field357 = new int[field385];

    @ObfuscatedName("client.fa")
    public static int[] field388 = new int[field385];

    @ObfuscatedName("client.fs")
    public static int[] field389 = new int[field385];

    @ObfuscatedName("client.fw")
    public static int[] field390 = new int[field385];

    @ObfuscatedName("client.fl")
    public static int[] field391 = new int[field385];

    @ObfuscatedName("client.ge")
    public static int[] field392 = new int[field385];

    @ObfuscatedName("client.gh")
    public static String[] field551 = new String[field385];

    @ObfuscatedName("client.gk")
    public static int[][] field394 = new int[104][104];

    @ObfuscatedName("client.gz")
    public static int field408 = 0;

    @ObfuscatedName("client.gf")
    public static int field359 = -1;

    @ObfuscatedName("client.gm")
    public static int field397 = -1;

    @ObfuscatedName("client.gp")
    public static int field398 = 0;

    @ObfuscatedName("client.ga")
    public static int field480 = 0;

    @ObfuscatedName("client.gy")
    public static int field306 = 0;

    @ObfuscatedName("client.gw")
    public static int field401 = 0;

    @ObfuscatedName("client.gg")
    public static int field339 = 0;

    @ObfuscatedName("client.gl")
    public static int field403 = 0;

    @ObfuscatedName("client.gq")
    public static int field536 = 0;

    @ObfuscatedName("client.gr")
    public static int field534 = 0;

    @ObfuscatedName("client.gi")
    public static int field293 = 0;

    @ObfuscatedName("client.gv")
    public static int field407 = 0;

    @ObfuscatedName("client.go")
    public static boolean field544 = false;

    @ObfuscatedName("client.gc")
    public static int field342 = 0;

    @ObfuscatedName("client.gj")
    public static int field472 = 0;

    @ObfuscatedName("client.gb")
    public static class3[] field411 = new class3[2048];

    @ObfuscatedName("client.gu")
    public static int field478 = -1;

    @ObfuscatedName("client.hh")
    public static int field413 = 0;

    @ObfuscatedName("client.hm")
    public static int field414 = 0;

    @ObfuscatedName("client.hq")
    public static int[] field415 = new int[1000];

    @ObfuscatedName("client.hp")
    public static final int[] field326 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hr")
    public static String[] field417 = new String[8];

    @ObfuscatedName("client.hj")
    public static boolean[] field349 = new boolean[8];

    @ObfuscatedName("client.he")
    public static int[] field419 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hs")
    public static int field420 = -1;

    @ObfuscatedName("client.hd")
    public static class199[][][] field421 = new class199[4][104][104];

    @ObfuscatedName("client.hz")
    public static class199 field410 = new class199();

    @ObfuscatedName("client.hf")
    public static class199 field423 = new class199();

    @ObfuscatedName("client.hw")
    public static class199 field424 = new class199();

    @ObfuscatedName("client.hv")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.hg")
    public static int[] field426 = new int[25];

    @ObfuscatedName("client.hy")
    public static int[] field427 = new int[25];

    @ObfuscatedName("client.ho")
    public static int field428 = 0;

    @ObfuscatedName("client.hk")
    public static boolean field309 = false;

    @ObfuscatedName("client.hb")
    public static int field431 = 0;

    @ObfuscatedName("client.ht")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field433 = new int[500];

    @ObfuscatedName("client.ic")
    public static int[] field434 = new int[500];

    @ObfuscatedName("client.im")
    public static int[] field524 = new int[500];

    @ObfuscatedName("client.il")
    public static String[] field438 = new String[500];

    @ObfuscatedName("client.io")
    public static String[] field366 = new String[500];

    @ObfuscatedName("client.is")
    public static int field290 = -1;

    @ObfuscatedName("client.iw")
    public static int field316 = -1;

    @ObfuscatedName("client.ii")
    public static int field440 = 0;

    @ObfuscatedName("client.ia")
    public static int field441 = 50;

    @ObfuscatedName("client.ip")
    public static int field302 = 0;

    @ObfuscatedName("client.ik")
    public static String field443 = null;

    @ObfuscatedName("client.it")
    public static boolean field409 = false;

    @ObfuscatedName("client.ir")
    public static int field445 = -1;

    @ObfuscatedName("client.ib")
    public static int field512 = -1;

    @ObfuscatedName("client.ij")
    public static String field447 = null;

    @ObfuscatedName("client.iy")
    public static String field448 = null;

    @ObfuscatedName("client.iq")
    public static int field449 = -1;

    @ObfuscatedName("client.id")
    public static class196 field450 = new class196(8);

    @ObfuscatedName("client.jz")
    public static int field362 = 0;

    @ObfuscatedName("client.ji")
    public static int field452 = 0;

    @ObfuscatedName("client.jg")
    public static class173 field453 = null;

    @ObfuscatedName("client.jh")
    public static int field336 = 0;

    @ObfuscatedName("client.jx")
    public static int field455 = 0;

    @ObfuscatedName("client.jr")
    public static int field456 = 0;

    @ObfuscatedName("client.je")
    public static int field451 = -1;

    @ObfuscatedName("client.jt")
    public static boolean field521 = false;

    @ObfuscatedName("client.jb")
    public static boolean field459 = false;

    @ObfuscatedName("client.jn")
    public static boolean field460 = false;

    @ObfuscatedName("client.js")
    public static class173 field461 = null;

    @ObfuscatedName("client.jp")
    public static class173 field537 = null;

    @ObfuscatedName("client.ja")
    public static class173 field298 = null;

    @ObfuscatedName("client.jl")
    public static int field429 = 0;

    @ObfuscatedName("client.jq")
    public static int field465 = 0;

    @ObfuscatedName("client.jo")
    public static class173 field313 = null;

    @ObfuscatedName("client.jj")
    public static boolean field467 = false;

    @ObfuscatedName("client.jy")
    public static int field468 = -1;

    @ObfuscatedName("client.jm")
    public static int field469 = -1;

    @ObfuscatedName("client.jk")
    public static boolean field470 = false;

    @ObfuscatedName("client.jw")
    public static int field471 = -1;

    @ObfuscatedName("client.jd")
    public static int field322 = -1;

    @ObfuscatedName("client.jv")
    public static boolean field315 = false;

    @ObfuscatedName("client.kh")
    public static int field393 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field475 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field341 = 0;

    @ObfuscatedName("client.ky")
    public static int[] field477 = new int[32];

    @ObfuscatedName("client.kg")
    public static int field412 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field464 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field522 = 0;

    @ObfuscatedName("client.ki")
    public static int field481 = 0;

    @ObfuscatedName("client.kp")
    public static int field482 = 0;

    @ObfuscatedName("client.kf")
    public static int field483 = 0;

    @ObfuscatedName("client.kl")
    public static int field484 = 0;

    @ObfuscatedName("client.kz")
    public static int field485 = 0;

    @ObfuscatedName("client.km")
    public static int field364 = 0;

    @ObfuscatedName("client.kt")
    public static int field487 = 0;

    @ObfuscatedName("client.kc")
    public static class199 field466 = new class199();

    @ObfuscatedName("client.ka")
    public static class199 field489 = new class199();

    @ObfuscatedName("client.kb")
    public static class199 field490 = new class199();

    @ObfuscatedName("client.kw")
    public static class196 field491 = new class196(512);

    @ObfuscatedName("client.kk")
    public static int field492 = 0;

    @ObfuscatedName("client.ku")
    public static int field493 = -2;

    @ObfuscatedName("client.lx")
    public static boolean[] field494 = new boolean[100];

    @ObfuscatedName("client.lq")
    public static boolean[] field498 = new boolean[100];

    @ObfuscatedName("client.lj")
    public static boolean[] field496 = new boolean[100];

    @ObfuscatedName("client.lf")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field457 = new int[100];

    @ObfuscatedName("client.lh")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.ld")
    public static int[] field500 = new int[100];

    @ObfuscatedName("client.lw")
    public static int field514 = 0;

    @ObfuscatedName("client.lp")
    public static long field502 = 0L;

    @ObfuscatedName("client.lm")
    public static boolean field383 = true;

    @ObfuscatedName("client.ln")
    public static int field504 = 765;

    @ObfuscatedName("client.lu")
    public static int field505 = 503;

    @ObfuscatedName("client.lv")
    public static int[] field319 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.li")
    public static int field507 = 0;

    @ObfuscatedName("client.ls")
    public static int field508 = 0;

    @ObfuscatedName("client.lt")
    public static String field509 = "";

    @ObfuscatedName("client.ly")
    public static long[] field510 = new long[100];

    @ObfuscatedName("client.lg")
    public static int field511 = 0;

    @ObfuscatedName("client.lr")
    public static int field501 = 0;

    @ObfuscatedName("client.my")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.mt")
    public static int[] field386 = new int[128];

    @ObfuscatedName("client.mc")
    public static long field515 = -1L;

    @ObfuscatedName("client.mn")
    public static String field516 = null;

    @ObfuscatedName("client.mf")
    public static String field517 = null;

    @ObfuscatedName("client.mw")
    public static int field518 = -1;

    @ObfuscatedName("client.mb")
    public static int field519 = 0;

    @ObfuscatedName("client.ml")
    public static int[] field520 = new int[1000];

    @ObfuscatedName("client.md")
    public static int[] field564 = new int[1000];

    @ObfuscatedName("client.mq")
    public static class79[] field396 = new class79[1000];

    @ObfuscatedName("client.mh")
    public static int field297 = 0;

    @ObfuscatedName("client.mp")
    public static int field320 = 0;

    @ObfuscatedName("client.mv")
    public static int field525 = 0;

    @ObfuscatedName("client.mm")
    public static int field526 = 255;

    @ObfuscatedName("client.ms")
    public static int field454 = -1;

    @ObfuscatedName("client.mj")
    public static boolean field528 = false;

    @ObfuscatedName("client.nb")
    public static int field301 = 127;

    @ObfuscatedName("client.ny")
    public static int field503 = 127;

    @ObfuscatedName("client.nu")
    public static int field531 = 0;

    @ObfuscatedName("client.nx")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.ne")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.np")
    public static int[] field444 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field535 = new int[50];

    @ObfuscatedName("client.nt")
    public static class59[] field402 = new class59[50];

    @ObfuscatedName("client.nn")
    public static boolean field529 = false;

    @ObfuscatedName("client.ot")
    public static boolean[] field538 = new boolean[5];

    @ObfuscatedName("client.oa")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.oe")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.ox")
    public static int[] field541 = new int[5];

    @ObfuscatedName("client.oh")
    public static int[] field542 = new int[5];

    @ObfuscatedName("client.oi")
    public static short field371 = 256;

    @ObfuscatedName("client.om")
    public static short field405 = 205;

    @ObfuscatedName("client.os")
    public static short field545 = 256;

    @ObfuscatedName("client.ol")
    public static short field546 = 320;

    @ObfuscatedName("client.op")
    public static short field463 = 1;

    @ObfuscatedName("client.or")
    public static short field548 = 32767;

    @ObfuscatedName("client.ou")
    public static short field549 = 1;

    @ObfuscatedName("client.ob")
    public static short field550 = 32767;

    @ObfuscatedName("client.on")
    public static int field442 = 0;

    @ObfuscatedName("client.oz")
    public static int field418 = 0;

    @ObfuscatedName("client.ok")
    public static int field553 = 0;

    @ObfuscatedName("client.oq")
    public static int field554 = 0;

    @ObfuscatedName("client.oc")
    public static int field488 = 0;

    @ObfuscatedName("client.ow")
    public static int field422 = 0;

    @ObfuscatedName("client.ov")
    public static int field387 = 0;

    @ObfuscatedName("client.of")
    public static class18[] field558 = new class18[400];

    @ObfuscatedName("client.oo")
    public static class195 field559 = new class195();

    @ObfuscatedName("client.od")
    public static int field560 = 0;

    @ObfuscatedName("client.oj")
    public static class8[] field561 = new class8[400];

    @ObfuscatedName("client.pe")
    public static class179 field476 = new class179();

    @ObfuscatedName("client.pp")
    public static int field563 = -1;

    @ObfuscatedName("client.pj")
    public static int field486 = -1;

    @ObfuscatedName("client.pn")
    public static class220[] field565 = new class220[8];

    @ObfuscatedName("client.px")
    public static long field462 = -1L;

    @ObfuscatedName("client.pg")
    public static long field567 = -1L;

    @ObfuscatedName("client.pw")
    public static final class11 field568 = new class11();

    @ObfuscatedName("client.pm")
    public static int[] field569 = new int[50];

    @ObfuscatedName("client.pq")
    public static int[] field570 = new int[50];

    @ObfuscatedName("client.i(I)V")
    public final void method232() {
    }

    public final void init() {
        if (!this.method2807()) {
            return;
        }
        class190[] var1 = new class190[] { class190.field3052, class190.field3054, class190.field3061, class190.field3049, class190.field3056, class190.field3060, class190.field3058, class190.field3057, class190.field3051, class190.field3055, class190.field3064, class190.field3053, class190.field3062, class190.field3059, class190.field3050 };
        class190[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class190 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3063);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3063)) {
                    case 1:
                        Statics.field625 = Integer.parseInt(var5);
                        break;
                    case 2:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                            field292 = true;
                        } else {
                            field292 = false;
                        }
                        break;
                    case 3:
                        field289 = Integer.parseInt(var5);
                        break;
                    case 4:
                        field287 = Integer.parseInt(var5);
                        break;
                    case 5:
                        Statics.field1640 = var5;
                        break;
                    case 6:
                        int var7 = Integer.parseInt(var5);
                        class153[] var8 = class153.method2890();
                        int var9 = 0;
                        class153 var11;
                        while (true) {
                            if (var9 >= var8.length) {
                                var11 = null;
                                break;
                            }
                            class153 var10 = var8[var9];
                            if (var10.field2289 == var7) {
                                var11 = var10;
                                break;
                            }
                            var9++;
                        }
                        Statics.field2649 = var11;
                        break;
                    case 7:
                        Statics.field2670 = Integer.parseInt(var5);
                    case 8:
                    case 11:
                    case 13:
                    default:
                        break;
                    case 9:
                        Statics.field295 = var5;
                        break;
                    case 10:
                        field473 = Integer.parseInt(var5);
                        break;
                    case 12:
                        field288 = Integer.parseInt(var5);
                        break;
                    case 14:
                        if (var5.equalsIgnoreCase(class2.field27)) {
                        }
                        break;
                    case 15:
                        class154[] var6 = new class154[] { class154.field2292, class154.field2290, class154.field2294, class154.field2297, class154.field2293, class154.field2295 };
                        Statics.field351 = (class154) class109.method2910(var6, Integer.parseInt(var5));
                        if (Statics.field351 == class154.field2295) {
                            Statics.field474 = class212.field3136;
                        } else {
                            Statics.field474 = class212.field3129;
                        }
                }
            }
        }
        method37();
        Statics.field2180 = this.getCodeBase().getHost();
        String var12 = Statics.field2649.field2287;
        byte var13 = 0;
        try {
            class149.method2604("oldschool", var12, var13, 16);
        } catch (Exception var15) {
            class148.method181((String) null, var15);
        }
        Statics.field285 = this;
        this.method2805(765, 503, 108);
    }

    @ObfuscatedName("f.m(I)V")
    public static final void method37() {
        class86.field1510 = false;
        field458 = false;
    }

    @ObfuscatedName("client.o(I)V")
    public final void method234() {
        Statics.field3153 = field289 == 0 ? 43594 : field287 + 40000;
        Statics.field112 = field289 == 0 ? 443 : field287 + 50000;
        Statics.field573 = Statics.field3153;
        Statics.field2920 = class174.field2896;
        Statics.field2080 = class174.field2895;
        Statics.field2921 = class174.field2899;
        Statics.field1174 = class174.field2897;
        class137.method146();
        Canvas var1 = Statics.field2040;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2114);
        var1.addFocusListener(class137.field2114);
        Canvas var2 = Statics.field2040;
        var2.addMouseListener(class140.field2165);
        var2.addMouseMotionListener(class140.field2165);
        var2.addFocusListener(class140.field2165);
        class145 var3;
        try {
            var3 = new class145();
        } catch (Throwable var15) {
            var3 = null;
        }
        Statics.field2999 = var3;
        if (Statics.field2999 != null) {
            Statics.field2999.method2619(Statics.field2040);
        }
        Statics.field2035 = new class134(255, class149.field2244, class149.field2241, 500000);
        class227 var5 = null;
        class9 var6 = new class9();
        try {
            var5 = class149.method2("", Statics.field351.field2296, false);
            byte[] var7 = new byte[(int) var5.method3816()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method3817(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class9(new class119(var7));
        } catch (Exception var16) {
        }
        try {
            if (var5 != null) {
                var5.method3818();
            }
        } catch (Exception var14) {
        }
        Statics.field170 = var6;
        Statics.field147 = this.getToolkit().getSystemClipboard();
        class138.method2237(this, Statics.field774);
        if (field289 != 0) {
            field304 = true;
        }
        int var13 = Statics.field170.field145;
        field502 = 0L;
        if (var13 >= 2) {
            field383 = true;
        } else {
            field383 = false;
        }
        method845();
        if (field296 >= 25) {
            field330.method2549(179);
            field330.method2301(method2039());
            field330.method2404(Statics.field2191);
            field330.method2404(Statics.field1567);
        }
        field2211 = true;
    }

    @ObfuscatedName("client.h(I)V")
    public final void method235() {
        field395++;
        this.method382();
        while (true) {
            class199 var1 = class170.field2718;
            class169 var2;
            synchronized (class170.field2718) {
                var2 = (class169) class170.field2721.method3526();
            }
            if (var2 == null) {
                class183.method2125();
                Statics.method749();
                class137.method657();
                class140 var4 = class140.field2165;
                synchronized (class140.field2165) {
                    class140.field2162 = class140.field2159;
                    class140.field2163 = class140.field2158;
                    class140.field2172 = class140.field2161 * -1129545677;
                    class140.field2169 = class140.field2160;
                    class140.field2170 = class140.field2166;
                    class140.field2164 = class140.field2167;
                    class140.field2157 = class140.field2168;
                    class140.field2160 = 0;
                }
                if (Statics.field2999 != null) {
                    int var6 = Statics.field2999.method2624();
                    field487 = var6;
                }
                int var10002;
                if (field296 == 0) {
                    method2909();
                    class144.method81();
                } else if (field296 == 5) {
                    class32.method97(this);
                    method2909();
                    class144.method81();
                } else if (field296 == 10 || field296 == 11) {
                    class32.method97(this);
                } else if (field296 == 20) {
                    class32.method97(this);
                    method2726();
                } else if (field296 == 25) {
                    method15(false);
                    field373 = 0;
                    boolean var7 = true;
                    for (int var8 = 0; var8 < Statics.field600.length; var8++) {
                        if (Statics.field193[var8] != -1 && Statics.field600[var8] == null) {
                            Statics.field600[var8] = Statics.field624.method3005(Statics.field193[var8], 0);
                            if (Statics.field600[var8] == null) {
                                var7 = false;
                                field373++;
                            }
                        }
                        if (Statics.field1627[var8] != -1 && Statics.field2657[var8] == null) {
                            Statics.field2657[var8] = Statics.field624.method3006(Statics.field1627[var8], 0, Statics.field2101[var8]);
                            if (Statics.field2657[var8] == null) {
                                var7 = false;
                                field373++;
                            }
                        }
                    }
                    if (var7) {
                        field344 = 0;
                        boolean var9 = true;
                        for (int var10 = 0; var10 < Statics.field600.length; var10++) {
                            byte[] var11 = Statics.field2657[var10];
                            if (var11 != null) {
                                int var12 = (Statics.field679[var10] >> 8) * 64 - Statics.field1684;
                                int var13 = (Statics.field679[var10] & 0xFF) * 64 - Statics.field1599;
                                if (field348) {
                                    var12 = 10;
                                    var13 = 10;
                                }
                                boolean var15 = true;
                                class119 var16 = new class119(var11);
                                int var17 = -1;
                                label3795: while (true) {
                                    int var18 = var16.method2329();
                                    if (var18 == 0) {
                                        var9 &= var15;
                                        break;
                                    }
                                    var17 += var18;
                                    int var19 = 0;
                                    boolean var20 = false;
                                    while (true) {
                                        while (!var20) {
                                            int var22 = var16.method2329();
                                            if (var22 == 0) {
                                                continue label3795;
                                            }
                                            var19 += var22 - 1;
                                            int var23 = var19 & 0x3F;
                                            int var24 = var19 >> 6 & 0x3F;
                                            int var25 = var16.method2316() >> 2;
                                            int var26 = var12 + var24;
                                            int var27 = var13 + var23;
                                            if (var26 > 0 && var27 > 0 && var26 < 103 && var27 < 103) {
                                                class41 var28 = class41.method981(var17);
                                                if (var25 != 22 || !field458 || var28.field937 != 0 || var28.field935 == 1 || var28.field956) {
                                                    if (!var28.method788()) {
                                                        field344++;
                                                        var15 = false;
                                                    }
                                                    var20 = true;
                                                }
                                            }
                                        }
                                        int var21 = var16.method2329();
                                        if (var21 == 0) {
                                            break;
                                        }
                                        var16.method2316();
                                    }
                                }
                            }
                        }
                        if (var9) {
                            if (field346 != 0) {
                                method127(class157.field2325 + class2.field23 + class2.field26 + 100 + "%" + class2.field19, true);
                            }
                            Statics.method749();
                            method188();
                            Statics.method749();
                            Statics.field1907.method1760();
                            Statics.method749();
                            System.gc();
                            for (int var30 = 0; var30 < 4; var30++) {
                                field347[var30].method2209();
                            }
                            for (int var31 = 0; var31 < 4; var31++) {
                                for (int var32 = 0; var32 < 104; var32++) {
                                    for (int var33 = 0; var33 < 104; var33++) {
                                        class6.field82[var31][var32][var33] = 0;
                                    }
                                }
                            }
                            Statics.method749();
                            class6.field83 = 99;
                            Statics.field91 = new byte[4][104][104];
                            Statics.field1973 = new byte[4][104][104];
                            Statics.field85 = new byte[4][104][104];
                            Statics.field86 = new byte[4][104][104];
                            Statics.field1384 = new int[4][105][105];
                            Statics.field98 = new byte[4][105][105];
                            Statics.field1104 = new int[105][105];
                            Statics.field265 = new int[104];
                            Statics.field1975 = new int[104];
                            Statics.field87 = new int[104];
                            Statics.field88 = new int[104];
                            Statics.field2745 = new int[104];
                            int var34 = Statics.field600.length;
                            for (class24 var35 = (class24) class24.field616.method3528(); var35 != null; var35 = (class24) class24.field616.method3527()) {
                                if (var35.field605 != null) {
                                    Statics.field253.method1122(var35.field605);
                                    var35.field605 = null;
                                }
                                if (var35.field607 != null) {
                                    Statics.field253.method1122(var35.field607);
                                    var35.field607 = null;
                                }
                            }
                            class24.field616.method3522();
                            method15(true);
                            if (!field348) {
                                for (int var36 = 0; var36 < var34; var36++) {
                                    int var37 = (Statics.field679[var36] >> 8) * 64 - Statics.field1684;
                                    int var38 = (Statics.field679[var36] & 0xFF) * 64 - Statics.field1599;
                                    byte[] var39 = Statics.field600[var36];
                                    if (var39 != null) {
                                        Statics.method749();
                                        class6.method2509(var39, var37, var38, Statics.field2066 * 8 - 48, Statics.field1879 * 8 - 48, field347);
                                    }
                                }
                                for (int var40 = 0; var40 < var34; var40++) {
                                    int var41 = (Statics.field679[var40] >> 8) * 64 - Statics.field1684;
                                    int var42 = (Statics.field679[var40] & 0xFF) * 64 - Statics.field1599;
                                    byte[] var43 = Statics.field600[var40];
                                    if (var43 == null && Statics.field1879 < 800) {
                                        Statics.method749();
                                        class6.method34(var41, var42, 64, 64);
                                    }
                                }
                                method15(true);
                                for (int var44 = 0; var44 < var34; var44++) {
                                    byte[] var45 = Statics.field2657[var44];
                                    if (var45 != null) {
                                        int var46 = (Statics.field679[var44] >> 8) * 64 - Statics.field1684;
                                        int var47 = (Statics.field679[var44] & 0xFF) * 64 - Statics.field1599;
                                        Statics.method749();
                                        class86 var48 = Statics.field1907;
                                        class108[] var49 = field347;
                                        class119 var50 = new class119(var45);
                                        int var51 = -1;
                                        while (true) {
                                            int var52 = var50.method2329();
                                            if (var52 == 0) {
                                                break;
                                            }
                                            var51 += var52;
                                            int var53 = 0;
                                            while (true) {
                                                int var54 = var50.method2329();
                                                if (var54 == 0) {
                                                    break;
                                                }
                                                var53 += var54 - 1;
                                                int var55 = var53 & 0x3F;
                                                int var56 = var53 >> 6 & 0x3F;
                                                int var57 = var53 >> 12;
                                                int var58 = var50.method2316();
                                                int var59 = var58 >> 2;
                                                int var60 = var58 & 0x3;
                                                int var61 = var46 + var56;
                                                int var62 = var47 + var55;
                                                if (var61 > 0 && var62 > 0 && var61 < 103 && var62 < 103) {
                                                    int var63 = var57;
                                                    if ((class6.field82[1][var61][var62] & 0x2) == 2) {
                                                        var63 = var57 - 1;
                                                    }
                                                    class108 var64 = null;
                                                    if (var63 >= 0) {
                                                        var64 = var49[var63];
                                                    }
                                                    class6.method2569(var57, var61, var62, var51, var60, var59, var48, var64);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (field348) {
                                int var65 = 0;
                                label3694: while (true) {
                                    if (var65 >= 4) {
                                        for (int var83 = 0; var83 < 13; var83++) {
                                            for (int var84 = 0; var84 < 13; var84++) {
                                                int var85 = field527[0][var83][var84];
                                                if (var85 == -1) {
                                                    class6.method34(var83 * 8, var84 * 8, 8, 8);
                                                }
                                            }
                                        }
                                        method15(true);
                                        int var86 = 0;
                                        while (true) {
                                            if (var86 >= 4) {
                                                break label3694;
                                            }
                                            Statics.method749();
                                            for (int var87 = 0; var87 < 13; var87++) {
                                                label3617: for (int var88 = 0; var88 < 13; var88++) {
                                                    int var89 = field527[var86][var87][var88];
                                                    if (var89 != -1) {
                                                        int var90 = var89 >> 24 & 0x3;
                                                        int var91 = var89 >> 1 & 0x3;
                                                        int var92 = var89 >> 14 & 0x3FF;
                                                        int var93 = var89 >> 3 & 0x7FF;
                                                        int var94 = (var92 / 8 << 8) + var93 / 8;
                                                        for (int var95 = 0; var95 < Statics.field679.length; var95++) {
                                                            if (Statics.field679[var95] == var94 && Statics.field2657[var95] != null) {
                                                                byte[] var96 = Statics.field2657[var95];
                                                                int var97 = var87 * 8;
                                                                int var98 = var88 * 8;
                                                                int var99 = (var92 & 0x7) * 8;
                                                                int var100 = (var93 & 0x7) * 8;
                                                                class86 var101 = Statics.field1907;
                                                                class108[] var102 = field347;
                                                                class119 var103 = new class119(var96);
                                                                int var104 = -1;
                                                                while (true) {
                                                                    int var105 = var103.method2329();
                                                                    if (var105 == 0) {
                                                                        continue label3617;
                                                                    }
                                                                    var104 += var105;
                                                                    int var106 = 0;
                                                                    while (true) {
                                                                        int var107 = var103.method2329();
                                                                        if (var107 == 0) {
                                                                            break;
                                                                        }
                                                                        var106 += var107 - 1;
                                                                        int var108 = var106 & 0x3F;
                                                                        int var109 = var106 >> 6 & 0x3F;
                                                                        int var110 = var106 >> 12;
                                                                        int var111 = var103.method2316();
                                                                        int var112 = var111 >> 2;
                                                                        int var113 = var111 & 0x3;
                                                                        if (var90 == var110 && var109 >= var99 && var109 < var99 + 8 && var108 >= var100 && var108 < var100 + 8) {
                                                                            class41 var114 = class41.method981(var104);
                                                                            int var115 = var97 + class177.method186(var109 & 0x7, var108 & 0x7, var91, var114.field933, var114.field934, var113);
                                                                            int var116 = var98 + class177.method655(var109 & 0x7, var108 & 0x7, var91, var114.field933, var114.field934, var113);
                                                                            if (var115 > 0 && var116 > 0 && var115 < 103 && var116 < 103) {
                                                                                int var117 = var86;
                                                                                if ((class6.field82[1][var115][var116] & 0x2) == 2) {
                                                                                    var117 = var86 - 1;
                                                                                }
                                                                                class108 var118 = null;
                                                                                if (var117 >= 0) {
                                                                                    var118 = var102[var117];
                                                                                }
                                                                                class6.method2569(var86, var115, var116, var104, var91 + var113 & 0x3, var112, var101, var118);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            var86++;
                                        }
                                    }
                                    Statics.method749();
                                    for (int var66 = 0; var66 < 13; var66++) {
                                        for (int var67 = 0; var67 < 13; var67++) {
                                            boolean var68 = false;
                                            int var69 = field527[var65][var66][var67];
                                            if (var69 != -1) {
                                                int var70 = var69 >> 24 & 0x3;
                                                int var71 = var69 >> 1 & 0x3;
                                                int var72 = var69 >> 14 & 0x3FF;
                                                int var73 = var69 >> 3 & 0x7FF;
                                                int var74 = (var72 / 8 << 8) + var73 / 8;
                                                for (int var75 = 0; var75 < Statics.field679.length; var75++) {
                                                    if (Statics.field679[var75] == var74 && Statics.field600[var75] != null) {
                                                        class6.method80(Statics.field600[var75], var65, var66 * 8, var67 * 8, var70, (var72 & 0x7) * 8, (var73 & 0x7) * 8, var71, field347);
                                                        var68 = true;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (!var68) {
                                                int var76 = var65;
                                                int var77 = var66 * 8;
                                                int var78 = var67 * 8;
                                                for (int var79 = 0; var79 < 8; var79++) {
                                                    for (int var80 = 0; var80 < 8; var80++) {
                                                        class6.field94[var76][var77 + var79][var78 + var80] = 0;
                                                    }
                                                }
                                                if (var77 > 0) {
                                                    for (int var81 = 1; var81 < 8; var81++) {
                                                        class6.field94[var76][var77][var78 + var81] = class6.field94[var76][var77 - 1][var78 + var81];
                                                    }
                                                }
                                                if (var78 > 0) {
                                                    for (int var82 = 1; var82 < 8; var82++) {
                                                        class6.field94[var76][var77 + var82][var78] = class6.field94[var76][var77 + var82][var78 - 1];
                                                    }
                                                }
                                                if (var77 > 0 && class6.field94[var76][var77 - 1][var78] != 0) {
                                                    class6.field94[var76][var77][var78] = class6.field94[var76][var77 - 1][var78];
                                                } else if (var78 > 0 && class6.field94[var76][var77][var78 - 1] != 0) {
                                                    class6.field94[var76][var77][var78] = class6.field94[var76][var77][var78 - 1];
                                                } else if (var77 > 0 && var78 > 0 && class6.field94[var76][var77 - 1][var78 - 1] != 0) {
                                                    class6.field94[var76][var77][var78] = class6.field94[var76][var77 - 1][var78 - 1];
                                                }
                                            }
                                        }
                                    }
                                    var65++;
                                }
                            }
                            method15(true);
                            method188();
                            Statics.method749();
                            class86 var119 = Statics.field1907;
                            class108[] var120 = field347;
                            for (int var121 = 0; var121 < 4; var121++) {
                                for (int var122 = 0; var122 < 104; var122++) {
                                    for (int var123 = 0; var123 < 104; var123++) {
                                        if ((class6.field82[var121][var122][var123] & 0x1) == 1) {
                                            int var124 = var121;
                                            if ((class6.field82[1][var122][var123] & 0x2) == 2) {
                                                var124 = var121 - 1;
                                            }
                                            if (var124 >= 0) {
                                                var120[var124].method2212(var122, var123);
                                            }
                                        }
                                    }
                                }
                            }
                            class6.field95 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field95 < -8) {
                                class6.field95 = -8;
                            }
                            if (class6.field95 > 8) {
                                class6.field95 = 8;
                            }
                            class6.field84 += (int) (Math.random() * 5.0D) - 2;
                            if (class6.field84 < -16) {
                                class6.field84 = -16;
                            }
                            if (class6.field84 > 16) {
                                class6.field84 = 16;
                            }
                            for (int var125 = 0; var125 < 4; var125++) {
                                byte[][] var126 = Statics.field98[var125];
                                int var127 = (int) Math.sqrt(5100.0D);
                                int var128 = var127 * 768 >> 8;
                                for (int var129 = 1; var129 < 103; var129++) {
                                    for (int var130 = 1; var130 < 103; var130++) {
                                        int var131 = class6.field94[var125][var130 + 1][var129] - class6.field94[var125][var130 - 1][var129];
                                        int var132 = class6.field94[var125][var130][var129 + 1] - class6.field94[var125][var130][var129 - 1];
                                        int var133 = (int) Math.sqrt((double) (var132 * var132 + var131 * var131 + 65536));
                                        int var134 = (var131 << 8) / var133;
                                        int var135 = 65536 / var133;
                                        int var136 = (var132 << 8) / var133;
                                        int var137 = (var136 * -50 + var134 * -50 + var135 * -10) / var128 + 96;
                                        int var138 = (var126[var130][var129] >> 1) + (var126[var130][var129 + 1] >> 3) + (var126[var130][var129 - 1] >> 2) + (var126[var130 - 1][var129] >> 2) + (var126[var130 + 1][var129] >> 3);
                                        Statics.field1104[var130][var129] = var137 - var138;
                                    }
                                }
                                for (int var139 = 0; var139 < 104; var139++) {
                                    Statics.field265[var139] = 0;
                                    Statics.field1975[var139] = 0;
                                    Statics.field87[var139] = 0;
                                    Statics.field88[var139] = 0;
                                    Statics.field2745[var139] = 0;
                                }
                                for (int var140 = -5; var140 < 109; var140++) {
                                    for (int var141 = 0; var141 < 104; var141++) {
                                        int var142 = var140 + 5;
                                        if (var142 >= 0 && var142 < 104) {
                                            int var143 = Statics.field91[var125][var142][var141] & 0xFF;
                                            if (var143 > 0) {
                                                class42 var144 = class42.method714(var143 - 1);
                                                Statics.field265[var141] += var144.field972;
                                                Statics.field1975[var141] += var144.field969;
                                                Statics.field87[var141] += var144.field970;
                                                Statics.field88[var141] += var144.field973;
                                                var10002 = Statics.field2745[var141]++;
                                            }
                                        }
                                        int var145 = var140 - 5;
                                        if (var145 >= 0 && var145 < 104) {
                                            int var146 = Statics.field91[var125][var145][var141] & 0xFF;
                                            if (var146 > 0) {
                                                class42 var147 = class42.method714(var146 - 1);
                                                Statics.field265[var141] -= var147.field972;
                                                Statics.field1975[var141] -= var147.field969;
                                                Statics.field87[var141] -= var147.field970;
                                                Statics.field88[var141] -= var147.field973;
                                                var10002 = Statics.field2745[var141]--;
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
                                                var148 += Statics.field265[var154];
                                                var149 += Statics.field1975[var154];
                                                var150 += Statics.field87[var154];
                                                var151 += Statics.field88[var154];
                                                var152 += Statics.field2745[var154];
                                            }
                                            int var155 = var153 - 5;
                                            if (var155 >= 0 && var155 < 104) {
                                                var148 -= Statics.field265[var155];
                                                var149 -= Statics.field1975[var155];
                                                var150 -= Statics.field87[var155];
                                                var151 -= Statics.field88[var155];
                                                var152 -= Statics.field2745[var155];
                                            }
                                            if (var153 >= 1 && var153 < 103 && (!field458 || (class6.field82[0][var140][var153] & 0x2) != 0 || (class6.field82[var125][var140][var153] & 0x10) == 0)) {
                                                if (var125 < class6.field83) {
                                                    class6.field83 = var125;
                                                }
                                                int var156 = Statics.field91[var125][var140][var153] & 0xFF;
                                                int var157 = Statics.field1973[var125][var140][var153] & 0xFF;
                                                if (var156 > 0 || var157 > 0) {
                                                    int var158 = class6.field94[var125][var140][var153];
                                                    int var159 = class6.field94[var125][var140 + 1][var153];
                                                    int var160 = class6.field94[var125][var140 + 1][var153 + 1];
                                                    int var161 = class6.field94[var125][var140][var153 + 1];
                                                    int var162 = Statics.field1104[var140][var153];
                                                    int var163 = Statics.field1104[var140 + 1][var153];
                                                    int var164 = Statics.field1104[var140 + 1][var153 + 1];
                                                    int var165 = Statics.field1104[var140][var153 + 1];
                                                    int var166 = -1;
                                                    int var167 = -1;
                                                    if (var156 > 0) {
                                                        int var168 = var148 * 256 / var151;
                                                        int var169 = var149 / var152;
                                                        int var170 = var150 / var152;
                                                        var166 = class6.method1521(var168, var169, var170);
                                                        int var171 = class6.field95 + var168 & 0xFF;
                                                        int var172 = class6.field84 + var170;
                                                        if (var172 < 0) {
                                                            var172 = 0;
                                                        } else if (var172 > 255) {
                                                            var172 = 255;
                                                        }
                                                        var167 = class6.method1521(var171, var169, var172);
                                                    }
                                                    if (var125 > 0) {
                                                        boolean var173 = true;
                                                        if (var156 == 0 && Statics.field85[var125][var140][var153] != 0) {
                                                            var173 = false;
                                                        }
                                                        if (var157 > 0) {
                                                            int var174 = var157 - 1;
                                                            class47 var175 = (class47) class47.field1055.method3466((long) var174);
                                                            class47 var176;
                                                            if (var175 == null) {
                                                                byte[] var177 = Statics.field1059.method3005(4, var174);
                                                                class47 var178 = new class47();
                                                                if (var177 != null) {
                                                                    var178.method939(new class119(var177), var174);
                                                                }
                                                                var178.method938();
                                                                class47.field1055.method3468(var178, (long) var174);
                                                                var176 = var178;
                                                            } else {
                                                                var176 = var175;
                                                            }
                                                            if (!var176.field1053) {
                                                                var173 = false;
                                                            }
                                                        }
                                                        if (var173 && var158 == var159 && var158 == var160 && var158 == var161) {
                                                            Statics.field1384[var125][var140][var153] |= 0x924;
                                                        }
                                                    }
                                                    int var179 = 0;
                                                    if (var167 != -1) {
                                                        var179 = class91.field1587[class6.method560(var167, 96)];
                                                    }
                                                    if (var157 == 0) {
                                                        var119.method1765(var125, var140, var153, 0, 0, -1, var158, var159, var160, var161, class6.method560(var166, var162), class6.method560(var166, var163), class6.method560(var166, var164), class6.method560(var166, var165), 0, 0, 0, 0, var179, 0);
                                                    } else {
                                                        int var180 = Statics.field85[var125][var140][var153] + 1;
                                                        byte var181 = Statics.field86[var125][var140][var153];
                                                        int var182 = var157 - 1;
                                                        class47 var183 = (class47) class47.field1055.method3466((long) var182);
                                                        class47 var184;
                                                        if (var183 == null) {
                                                            byte[] var185 = Statics.field1059.method3005(4, var182);
                                                            class47 var186 = new class47();
                                                            if (var185 != null) {
                                                                var186.method939(new class119(var185), var182);
                                                            }
                                                            var186.method938();
                                                            class47.field1055.method3468(var186, (long) var182);
                                                            var184 = var186;
                                                        } else {
                                                            var184 = var183;
                                                        }
                                                        int var188 = var184.field1054;
                                                        int var189;
                                                        int var190;
                                                        if (var188 >= 0) {
                                                            var189 = Statics.field1577.method2016(var188);
                                                            var190 = -1;
                                                        } else if (var184.field1052 == 16711935) {
                                                            var190 = -2;
                                                            var188 = -1;
                                                            var189 = -2;
                                                        } else {
                                                            var190 = class6.method1521(var184.field1057, var184.field1058, var184.field1051);
                                                            int var191 = class6.field95 + var184.field1057 & 0xFF;
                                                            int var192 = class6.field84 + var184.field1051;
                                                            if (var192 < 0) {
                                                                var192 = 0;
                                                            } else if (var192 > 255) {
                                                                var192 = 255;
                                                            }
                                                            var189 = class6.method1521(var191, var184.field1058, var192);
                                                        }
                                                        int var193 = 0;
                                                        if (var189 != -2) {
                                                            var193 = class91.field1587[Statics.method158(var189, 96)];
                                                        }
                                                        if (var184.field1056 != -1) {
                                                            int var194 = class6.field95 + var184.field1060 & 0xFF;
                                                            int var195 = class6.field84 + var184.field1062;
                                                            if (var195 < 0) {
                                                                var195 = 0;
                                                            } else if (var195 > 255) {
                                                                var195 = 255;
                                                            }
                                                            int var196 = class6.method1521(var194, var184.field1061, var195);
                                                            var193 = class91.field1587[Statics.method158(var196, 96)];
                                                        }
                                                        var119.method1765(var125, var140, var153, var180, var181, var188, var158, var159, var160, var161, class6.method560(var166, var162), class6.method560(var166, var163), class6.method560(var166, var164), class6.method560(var166, var165), Statics.method158(var190, var162), Statics.method158(var190, var163), Statics.method158(var190, var164), Statics.method158(var190, var165), var179, var193);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                for (int var197 = 1; var197 < 103; var197++) {
                                    for (int var198 = 1; var198 < 103; var198++) {
                                        var119.method1897(var125, var198, var197, class6.method1934(var125, var198, var197));
                                    }
                                }
                                Statics.field91[var125] = (byte[][]) null;
                                Statics.field1973[var125] = (byte[][]) null;
                                Statics.field85[var125] = (byte[][]) null;
                                Statics.field86[var125] = (byte[][]) null;
                                Statics.field98[var125] = (byte[][]) null;
                            }
                            var119.method1791(-50, -10, -50);
                            for (int var199 = 0; var199 < 104; var199++) {
                                for (int var200 = 0; var200 < 104; var200++) {
                                    if ((class6.field82[1][var199][var200] & 0x2) == 2) {
                                        var119.method1762(var199, var200);
                                    }
                                }
                            }
                            int var201 = 1;
                            int var202 = 2;
                            int var203 = 4;
                            for (int var204 = 0; var204 < 4; var204++) {
                                if (var204 > 0) {
                                    var201 <<= 0x3;
                                    var202 <<= 0x3;
                                    var203 <<= 0x3;
                                }
                                for (int var205 = 0; var205 <= var204; var205++) {
                                    for (int var206 = 0; var206 <= 104; var206++) {
                                        for (int var207 = 0; var207 <= 104; var207++) {
                                            if ((Statics.field1384[var205][var207][var206] & var201) != 0) {
                                                int var208 = var206;
                                                int var209 = var206;
                                                int var210 = var205;
                                                int var211 = var205;
                                                while (var208 > 0 && (Statics.field1384[var205][var207][var208 - 1] & var201) != 0) {
                                                    var208--;
                                                }
                                                while (var209 < 104 && (Statics.field1384[var205][var207][var209 + 1] & var201) != 0) {
                                                    var209++;
                                                }
                                                label3343: while (var210 > 0) {
                                                    for (int var212 = var208; var212 <= var209; var212++) {
                                                        if ((Statics.field1384[var210 - 1][var207][var212] & var201) == 0) {
                                                            break label3343;
                                                        }
                                                    }
                                                    var210--;
                                                }
                                                label3332: while (var211 < var204) {
                                                    for (int var213 = var208; var213 <= var209; var213++) {
                                                        if ((Statics.field1384[var211 + 1][var207][var213] & var201) == 0) {
                                                            break label3332;
                                                        }
                                                    }
                                                    var211++;
                                                }
                                                int var214 = (var211 + 1 - var210) * (var209 - var208 + 1);
                                                if (var214 >= 8) {
                                                    short var215 = 240;
                                                    int var216 = class6.field94[var211][var207][var208] - var215;
                                                    int var217 = class6.field94[var210][var207][var208];
                                                    class86.method1763(var204, 1, var207 * 128, var207 * 128, var208 * 128, var209 * 128 + 128, var216, var217);
                                                    for (int var218 = var210; var218 <= var211; var218++) {
                                                        for (int var219 = var208; var219 <= var209; var219++) {
                                                            Statics.field1384[var218][var207][var219] &= ~var201;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1384[var205][var207][var206] & var202) != 0) {
                                                int var220 = var207;
                                                int var221 = var207;
                                                int var222 = var205;
                                                int var223 = var205;
                                                while (var220 > 0 && (Statics.field1384[var205][var220 - 1][var206] & var202) != 0) {
                                                    var220--;
                                                }
                                                while (var221 < 104 && (Statics.field1384[var205][var221 + 1][var206] & var202) != 0) {
                                                    var221++;
                                                }
                                                label3396: while (var222 > 0) {
                                                    for (int var224 = var220; var224 <= var221; var224++) {
                                                        if ((Statics.field1384[var222 - 1][var224][var206] & var202) == 0) {
                                                            break label3396;
                                                        }
                                                    }
                                                    var222--;
                                                }
                                                label3385: while (var223 < var204) {
                                                    for (int var225 = var220; var225 <= var221; var225++) {
                                                        if ((Statics.field1384[var223 + 1][var225][var206] & var202) == 0) {
                                                            break label3385;
                                                        }
                                                    }
                                                    var223++;
                                                }
                                                int var226 = (var223 + 1 - var222) * (var221 - var220 + 1);
                                                if (var226 >= 8) {
                                                    short var227 = 240;
                                                    int var228 = class6.field94[var223][var220][var206] - var227;
                                                    int var229 = class6.field94[var222][var220][var206];
                                                    class86.method1763(var204, 2, var220 * 128, var221 * 128 + 128, var206 * 128, var206 * 128, var228, var229);
                                                    for (int var230 = var222; var230 <= var223; var230++) {
                                                        for (int var231 = var220; var231 <= var221; var231++) {
                                                            Statics.field1384[var230][var231][var206] &= ~var202;
                                                        }
                                                    }
                                                }
                                            }
                                            if ((Statics.field1384[var205][var207][var206] & var203) != 0) {
                                                int var232 = var207;
                                                int var233 = var207;
                                                int var234 = var206;
                                                int var235 = var206;
                                                while (var234 > 0 && (Statics.field1384[var205][var207][var234 - 1] & var203) != 0) {
                                                    var234--;
                                                }
                                                while (var235 < 104 && (Statics.field1384[var205][var207][var235 + 1] & var203) != 0) {
                                                    var235++;
                                                }
                                                label3449: while (var232 > 0) {
                                                    for (int var236 = var234; var236 <= var235; var236++) {
                                                        if ((Statics.field1384[var205][var232 - 1][var236] & var203) == 0) {
                                                            break label3449;
                                                        }
                                                    }
                                                    var232--;
                                                }
                                                label3438: while (var233 < 104) {
                                                    for (int var237 = var234; var237 <= var235; var237++) {
                                                        if ((Statics.field1384[var205][var233 + 1][var237] & var203) == 0) {
                                                            break label3438;
                                                        }
                                                    }
                                                    var233++;
                                                }
                                                if ((var233 - var232 + 1) * (var235 - var234 + 1) >= 4) {
                                                    int var238 = class6.field94[var205][var232][var234];
                                                    class86.method1763(var204, 4, var232 * 128, var233 * 128 + 128, var234 * 128, var235 * 128 + 128, var238, var238);
                                                    for (int var239 = var232; var239 <= var233; var239++) {
                                                        for (int var240 = var234; var240 <= var235; var240++) {
                                                            Statics.field1384[var205][var239][var240] &= ~var203;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            method15(true);
                            int var241 = class6.field83;
                            if (var241 > Statics.field1387) {
                                var241 = Statics.field1387;
                            }
                            if (var241 < Statics.field1387 - 1) {
                                int var242 = Statics.field1387 - 1;
                            }
                            if (field458) {
                                Statics.field1907.method1809(class6.field83);
                            } else {
                                Statics.field1907.method1809(0);
                            }
                            for (int var243 = 0; var243 < 104; var243++) {
                                for (int var244 = 0; var244 < 104; var244++) {
                                    method2234(var243, var244);
                                }
                            }
                            Statics.method749();
                            method2570();
                            class41.field958.method3475();
                            if (Statics.field575 != null) {
                                field330.method2549(121);
                                field330.method2304(1057001181);
                            }
                            if (!field348) {
                                int var245 = (Statics.field2066 - 6) / 8;
                                int var246 = (Statics.field2066 + 6) / 8;
                                int var247 = (Statics.field1879 - 6) / 8;
                                int var248 = (Statics.field1879 + 6) / 8;
                                for (int var249 = var245 - 1; var249 <= var246 + 1; var249++) {
                                    for (int var250 = var247 - 1; var250 <= var248 + 1; var250++) {
                                        if (var249 < var245 || var249 > var246 || var250 < var247 || var250 > var248) {
                                            Statics.field624.method3025("m" + var249 + "_" + var250);
                                            Statics.field624.method3025("l" + var249 + "_" + var250);
                                        }
                                    }
                                }
                            }
                            method553(30);
                            Statics.method749();
                            class6.method966();
                            field330.method2549(55);
                            class144.method81();
                        } else {
                            field346 = 2;
                        }
                    } else {
                        field346 = 1;
                    }
                }
                if (field296 == 30) {
                    if (field291 > 1) {
                        field291--;
                    }
                    if (field340 > 0) {
                        field340--;
                    }
                    if (field305) {
                        field305 = false;
                        method567();
                    } else {
                        if (!field309) {
                            field438[0] = class157.field2552;
                            field366[0] = "";
                            field434[0] = 1006;
                            field431 = 1;
                        }
                        for (int var251 = 0; var251 < 100; var251++) {
                            boolean var252;
                            if (Statics.field3116 == null) {
                                var252 = false;
                            } else {
                                label4045: {
                                    try {
                                        int var253 = Statics.field3116.method2788();
                                        if (var253 == 0) {
                                            var252 = false;
                                            break label4045;
                                        }
                                        if (field334 == -1) {
                                            Statics.field3116.method2779(field294.field1996, 0, 1);
                                            field294.field1999 = 0;
                                            field334 = field294.method2550();
                                            field333 = class188.field3045[field334];
                                            var253--;
                                        }
                                        if (field333 == -1) {
                                            if (var253 <= 0) {
                                                var252 = false;
                                                break label4045;
                                            }
                                            Statics.field3116.method2779(field294.field1996, 0, 1);
                                            field333 = field294.field1996[0] & 0xFF;
                                            var253--;
                                        }
                                        if (field333 == -2) {
                                            if (var253 <= 1) {
                                                var252 = false;
                                                break label4045;
                                            }
                                            Statics.field3116.method2779(field294.field1996, 0, 2);
                                            field294.field1999 = 0;
                                            field333 = field294.method2318();
                                            var253 -= 2;
                                        }
                                        if (var253 < field333) {
                                            var252 = false;
                                            break label4045;
                                        }
                                        field294.field1999 = 0;
                                        Statics.field3116.method2779(field294.field1996, 0, field333);
                                        field335 = 0;
                                        field555 = field547;
                                        field547 = field337;
                                        field337 = field334;
                                        if (field334 == 109) {
                                            int var254 = field294.method2318();
                                            if (var254 == 65535) {
                                                var254 = -1;
                                            }
                                            method187(var254);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 135) {
                                            int var255 = field294.method2356();
                                            int var256 = field294.method2350();
                                            if (var256 == 65535) {
                                                var256 = -1;
                                            }
                                            if (field526 != 0 && var256 != -1) {
                                                class183.method2247(Statics.field1670, var256, 0, field526, false);
                                                field528 = true;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 114) {
                                            for (int var257 = 0; var257 < field411.length; var257++) {
                                                if (field411[var257] != null) {
                                                    field411[var257].field821 = -1;
                                                }
                                            }
                                            for (int var258 = 0; var258 < field325.length; var258++) {
                                                if (field325[var258] != null) {
                                                    field325[var258].field821 = -1;
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 237) {
                                            int var259 = field294.method2349();
                                            int var260 = field294.method2316();
                                            String var261 = field294.method2324();
                                            if (var260 >= 1 && var260 <= 8) {
                                                if (var261.equalsIgnoreCase("null")) {
                                                    var261 = null;
                                                }
                                                field417[var260 - 1] = var261;
                                                field349[var260 - 1] = var259 == 0;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 161) {
                                            int var262 = field294.method2321();
                                            int var263 = field294.method2402();
                                            class4 var264 = (class4) field450.method3499((long) var262);
                                            class4 var265 = (class4) field450.method3499((long) var263);
                                            if (var265 != null) {
                                                method40(var265, var264 == null || var264.field67 != var265.field67);
                                            }
                                            if (var264 != null) {
                                                var264.method3608();
                                                field450.method3501(var264, (long) var263);
                                            }
                                            class173 var266 = class173.method691(var262);
                                            if (var266 != null) {
                                                method2263(var266);
                                            }
                                            class173 var267 = class173.method691(var263);
                                            if (var267 != null) {
                                                method2263(var267);
                                                method151(Statics.field2758[var267.field2760 >>> 16], var267, true);
                                            }
                                            if (field449 != -1) {
                                                method189(field449, 1);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 144) {
                                            int var268 = field294.method2350();
                                            int var269 = field294.method2402();
                                            class176.field2905[var268] = var269;
                                            if (class176.field2907[var268] != var269) {
                                                class176.field2907[var268] = var269;
                                            }
                                            method2614(var268);
                                            field475[++field341 - 1 & 0x1F] = var268;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 89) {
                                            class33.method2036();
                                            for (int var270 = 0; var270 < 2048; var270++) {
                                                field411[var270] = null;
                                            }
                                            class33.method144(field294);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 221) {
                                            int var271 = field294.method2316();
                                            if (field294.method2316() == 0) {
                                                field565[var271] = new class220();
                                                field294.field1999 += 18;
                                            } else {
                                                field294.field1999--;
                                                field565[var271] = new class220(field294, false);
                                            }
                                            field484 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 177) {
                                            field507 = field294.method2316();
                                            field508 = field294.method2316();
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 129) {
                                            Statics.field200 = field294.method2316();
                                            Statics.field762 = field294.method2316();
                                            for (int var272 = Statics.field200; var272 < Statics.field200 + 8; var272++) {
                                                for (int var273 = Statics.field762; var273 < Statics.field762 + 8; var273++) {
                                                    if (field421[Statics.field1387][var272][var273] != null) {
                                                        field421[Statics.field1387][var272][var273] = null;
                                                        method2234(var272, var273);
                                                    }
                                                }
                                            }
                                            for (class17 var274 = (class17) field410.method3528(); var274 != null; var274 = (class17) field410.method3527()) {
                                                if (var274.field231 >= Statics.field200 && var274.field231 < Statics.field200 + 8 && var274.field236 >= Statics.field762 && var274.field236 < Statics.field762 + 8 && Statics.field1387 == var274.field243) {
                                                    var274.field245 = 0;
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 106) {
                                            for (int var275 = 0; var275 < Statics.field1167; var275++) {
                                                class53 var276 = class53.method96(var275);
                                                if (var276 != null) {
                                                    class176.field2905[var275] = 0;
                                                    class176.field2907[var275] = 0;
                                                }
                                            }
                                            method1751();
                                            field341 += 32;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 207) {
                                            field291 = field294.method2318() * 30;
                                            field364 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 153) {
                                            boolean var277 = field294.method2316() == 1;
                                            if (var277) {
                                                Statics.field80 = class115.method2249() - field294.method2495();
                                                Statics.field761 = new class221(field294, true);
                                            } else {
                                                Statics.field761 = null;
                                            }
                                            field485 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 209) {
                                            int var278 = field294.method2350();
                                            int var279 = field294.method2372();
                                            class173 var280 = class173.method691(var279);
                                            if (var280.field2801 != 2 || var280.field2858 != var278) {
                                                var280.field2801 = 2;
                                                var280.field2858 = var278;
                                                method2263(var280);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 140) {
                                            int var281 = field294.method2344();
                                            int var282 = field294.method2372();
                                            int var283 = field294.method2350();
                                            class4 var284 = (class4) field450.method3499((long) var282);
                                            if (var284 != null) {
                                                method40(var284, var284.field67 != var283);
                                            }
                                            method457(var282, var283, var281);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 104) {
                                            int var285 = field294.method2402();
                                            class173 var286 = class173.method691(var285);
                                            for (int var287 = 0; var287 < var286.field2876.length; var287++) {
                                                var286.field2876[var287] = -1;
                                                var286.field2876[var287] = 0;
                                            }
                                            method2263(var286);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 187) {
                                            int var288 = field294.method2351();
                                            int var289 = field294.method2360();
                                            int var290 = var288 >> 10 & 0x1F;
                                            int var291 = var288 >> 5 & 0x1F;
                                            int var292 = var288 & 0x1F;
                                            int var293 = (var292 << 3) + (var290 << 19) + (var291 << 11);
                                            class173 var294 = class173.method691(var289);
                                            if (var294.field2860 != var293) {
                                                var294.field2860 = var293;
                                                method2263(var294);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 23) {
                                            int var295 = field294.method2421();
                                            int var296 = field294.method2321();
                                            int var297 = field294.method2362();
                                            class173 var298 = class173.method691(var296);
                                            if (var298.field2769 != var297 || var298.field2770 != var295 || var298.field2765 != 0 || var298.field2867 != 0) {
                                                var298.field2769 = var297;
                                                var298.field2770 = var295;
                                                var298.field2765 = 0;
                                                var298.field2867 = 0;
                                                method2263(var298);
                                                method1756(var298);
                                                if (var298.field2850 == 0) {
                                                    method151(Statics.field2758[var296 >> 16], var298, false);
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 92) {
                                            int var299 = field294.method2321();
                                            int var300 = field294.method2318();
                                            if (var299 < -70000) {
                                                var300 += 32768;
                                            }
                                            class173 var301;
                                            if (var299 >= 0) {
                                                var301 = class173.method691(var299);
                                            } else {
                                                var301 = null;
                                            }
                                            if (var301 != null) {
                                                for (int var302 = 0; var302 < var301.field2876.length; var302++) {
                                                    var301.field2876[var302] = 0;
                                                    var301.field2877[var302] = 0;
                                                }
                                            }
                                            class16 var303 = (class16) class16.field226.method3499((long) var300);
                                            if (var303 != null) {
                                                for (int var304 = 0; var304 < var303.field224.length; var304++) {
                                                    var303.field224[var304] = -1;
                                                    var303.field230[var304] = 0;
                                                }
                                            }
                                            int var305 = field294.method2318();
                                            for (int var306 = 0; var306 < var305; var306++) {
                                                int var307 = field294.method2434();
                                                if (var307 == 255) {
                                                    var307 = field294.method2321();
                                                }
                                                int var308 = field294.method2352();
                                                if (var301 != null && var306 < var301.field2876.length) {
                                                    var301.field2876[var306] = var308;
                                                    var301.field2877[var306] = var307;
                                                }
                                                class16.method94(var300, var306, var308 - 1, var307);
                                            }
                                            if (var301 != null) {
                                                method2263(var301);
                                            }
                                            method1751();
                                            field477[++field412 - 1 & 0x1F] = var300 & 0x7FFF;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 32) {
                                            field297 = field294.method2316();
                                            if (field297 == 255) {
                                                field297 = 0;
                                            }
                                            field320 = field294.method2316();
                                            if (field320 == 255) {
                                                field320 = 0;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 165) {
                                            method1751();
                                            field455 = field294.method2421();
                                            field364 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 65) {
                                            field387 = 1;
                                            field482 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 94) {
                                            method646(true);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 110) {
                                            int var309 = field294.method2321();
                                            class4 var310 = (class4) field450.method3499((long) var309);
                                            if (var310 != null) {
                                                method40(var310, true);
                                            }
                                            if (field453 != null) {
                                                method2263(field453);
                                                field453 = null;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 191) {
                                            int var311 = field294.method2350();
                                            byte var312 = field294.method2439();
                                            class176.field2905[var311] = var312;
                                            if (class176.field2907[var311] != var312) {
                                                class176.field2907[var311] = var312;
                                            }
                                            method2614(var311);
                                            field475[++field341 - 1 & 0x1F] = var311;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 113) {
                                            String var313 = field294.method2324();
                                            long var314 = (long) field294.method2318();
                                            long var316 = (long) field294.method2416();
                                            class152 var318 = (class152) class109.method2910(class152.method3197(), field294.method2316());
                                            long var319 = (var314 << 32) + var316;
                                            boolean var321 = false;
                                            for (int var322 = 0; var322 < 100; var322++) {
                                                if (field510[var322] == var319) {
                                                    var321 = true;
                                                    break;
                                                }
                                            }
                                            if (method191(var313)) {
                                                var321 = true;
                                            }
                                            if (!var321 && field472 == 0) {
                                                field510[field511] = var319;
                                                field511 = (field511 + 1) % 100;
                                                String var323 = class223.method3721(class163.method3460(class222.method3644(field294)));
                                                byte var324;
                                                if (var318.field2278) {
                                                    var324 = 7;
                                                } else {
                                                    var324 = 3;
                                                }
                                                if (var318.field2277 == -1) {
                                                    class12.method183(var324, var313, var323);
                                                } else {
                                                    int var326 = var318.field2277;
                                                    String var327 = "<img=" + var326 + ">";
                                                    class12.method183(var324, var327 + var313, var323);
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 235) {
                                            int var328 = field294.method2352();
                                            int var329 = field294.method2372();
                                            int var330 = field294.method2352();
                                            class173 var331 = class173.method691(var329);
                                            var331.field2814 = (var328 << 16) + var330;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 96) {
                                            int var332 = field294.method2318();
                                            int var333 = field294.method2352();
                                            int var334 = field294.method2350();
                                            int var335 = field294.method2360();
                                            class173 var336 = class173.method691(var335);
                                            if (var336.field2809 != var332 || var336.field2810 != var334 || var336.field2819 != var333) {
                                                var336.field2809 = var332;
                                                var336.field2810 = var334;
                                                var336.field2819 = var333;
                                                method2263(var336);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 174) {
                                            field483 = field393;
                                            if (field333 == 0) {
                                                field516 = null;
                                                field517 = null;
                                                Statics.field164 = 0;
                                                Statics.field2104 = null;
                                                field334 = -1;
                                                var252 = true;
                                                break label4045;
                                            }
                                            field517 = field294.method2324();
                                            long var337 = field294.method2495();
                                            long var339 = var337;
                                            String var341;
                                            if (var337 <= 0L || var337 >= 6582952005840035281L) {
                                                var341 = null;
                                            } else if (var337 % 37L == 0L) {
                                                var341 = null;
                                            } else {
                                                int var342 = 0;
                                                for (long var343 = var337; var343 != 0L; var343 /= 37L) {
                                                    var342++;
                                                }
                                                StringBuilder var345 = new StringBuilder(var342);
                                                while (var339 != 0L) {
                                                    long var346 = var339;
                                                    var339 /= 37L;
                                                    var345.append(class162.field2656[(int) (var346 - var339 * 37L)]);
                                                }
                                                var341 = var345.reverse().toString();
                                            }
                                            field516 = var341;
                                            Statics.field572 = field294.method2317();
                                            int var348 = field294.method2316();
                                            if (var348 == 255) {
                                                field334 = -1;
                                                var252 = true;
                                                break label4045;
                                            }
                                            Statics.field164 = var348;
                                            class25[] var349 = new class25[100];
                                            for (int var350 = 0; var350 < Statics.field164; var350++) {
                                                var349[var350] = new class25();
                                                var349[var350].field627 = field294.method2324();
                                                var349[var350].field622 = class164.method2659(var349[var350].field627, Statics.field474);
                                                var349[var350].field621 = field294.method2318();
                                                var349[var350].field623 = field294.method2317();
                                                field294.method2324();
                                                if (var349[var350].field627.equals(Statics.field2250.field49)) {
                                                    Statics.field2654 = var349[var350].field623;
                                                }
                                            }
                                            boolean var351 = false;
                                            int var352 = Statics.field164;
                                            while (var352 > 0) {
                                                boolean var353 = true;
                                                var352--;
                                                for (int var354 = 0; var354 < var352; var354++) {
                                                    if (var349[var354].field622.compareTo(var349[var354 + 1].field622) > 0) {
                                                        class25 var355 = var349[var354];
                                                        var349[var354] = var349[var354 + 1];
                                                        var349[var354 + 1] = var355;
                                                        var353 = false;
                                                    }
                                                }
                                                if (var353) {
                                                    break;
                                                }
                                            }
                                            Statics.field2104 = var349;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 38) {
                                            field352 = field294.method2316();
                                            if (field352 == 1) {
                                                field307 = field294.method2318();
                                            }
                                            if (field352 >= 2 && field352 <= 6) {
                                                if (field352 == 2) {
                                                    field312 = 64;
                                                    field566 = 64;
                                                }
                                                if (field352 == 3) {
                                                    field312 = 0;
                                                    field566 = 64;
                                                }
                                                if (field352 == 4) {
                                                    field312 = 128;
                                                    field566 = 64;
                                                }
                                                if (field352 == 5) {
                                                    field312 = 64;
                                                    field566 = 0;
                                                }
                                                if (field352 == 6) {
                                                    field312 = 64;
                                                    field566 = 128;
                                                }
                                                field352 = 2;
                                                field439 = field294.method2318();
                                                field310 = field294.method2318();
                                                field311 = field294.method2316();
                                            }
                                            if (field352 == 10) {
                                                field308 = field294.method2318();
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 90) {
                                            int var356 = field294.method2318();
                                            int var357 = field294.method2316();
                                            int var358 = field294.method2318();
                                            method746(var356, var357, var358);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 251) {
                                            int var359 = field294.method2316();
                                            int var360 = field294.method2316();
                                            int var361 = field294.method2316();
                                            int var362 = field294.method2316();
                                            field538[var359] = true;
                                            field539[var359] = var360;
                                            field540[var359] = var361;
                                            field541[var359] = var362;
                                            field542[var359] = 0;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 213) {
                                            Statics.field1144 = class130.method736(field294.method2316());
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 88) {
                                            int var363 = field294.method2321();
                                            boolean var364 = field294.method2349() == 1;
                                            class173 var365 = class173.method691(var363);
                                            if (var365.field2795 != var364) {
                                                var365.field2795 = var364;
                                                method2263(var365);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 155) {
                                            int var366 = field294.method2321();
                                            int var367 = field294.method2318();
                                            if (var366 < -70000) {
                                                var367 += 32768;
                                            }
                                            class173 var368;
                                            if (var366 >= 0) {
                                                var368 = class173.method691(var366);
                                            } else {
                                                var368 = null;
                                            }
                                            while (field294.field1999 < field333) {
                                                int var369 = field294.method2329();
                                                int var370 = field294.method2318();
                                                int var371 = 0;
                                                if (var370 != 0) {
                                                    var371 = field294.method2316();
                                                    if (var371 == 255) {
                                                        var371 = field294.method2321();
                                                    }
                                                }
                                                if (var368 != null && var369 >= 0 && var369 < var368.field2876.length) {
                                                    var368.field2876[var369] = var370;
                                                    var368.field2877[var369] = var371;
                                                }
                                                class16.method94(var367, var369, var370 - 1, var371);
                                            }
                                            if (var368 != null) {
                                                method2263(var368);
                                            }
                                            method1751();
                                            field477[++field412 - 1 & 0x1F] = var367 & 0x7FFF;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 35) {
                                            int var372 = field294.method2360();
                                            int var373 = field294.method2352();
                                            if (var373 == 65535) {
                                                var373 = -1;
                                            }
                                            int var374 = field294.method2318();
                                            if (var374 == 65535) {
                                                var374 = -1;
                                            }
                                            int var375 = field294.method2372();
                                            for (int var376 = var373; var376 <= var374; var376++) {
                                                long var377 = ((long) var375 << 32) + (long) var376;
                                                class208 var379 = field491.method3499(var377);
                                                if (var379 != null) {
                                                    var379.method3608();
                                                }
                                                field491.method3501(new class201(var372), var377);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 198) {
                                            method646(false);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 149) {
                                            int var380 = field294.method2321();
                                            Statics.field3209 = Statics.field649.method2666(var380);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 12) {
                                            int var381 = field294.method2321();
                                            int var382 = field294.method2321();
                                            int var383 = field294.method2350();
                                            if (var383 == 65535) {
                                                var383 = -1;
                                            }
                                            class173 var384 = class173.method691(var382);
                                            if (var384.field2759) {
                                                var384.field2878 = var383;
                                                var384.field2879 = var381;
                                                class52 var386 = class52.method578(var383);
                                                var384.field2809 = var386.field1128;
                                                var384.field2810 = var386.field1129;
                                                var384.field2811 = var386.field1143;
                                                var384.field2771 = var386.field1131;
                                                var384.field2840 = var386.field1164;
                                                var384.field2819 = var386.field1127;
                                                if (var386.field1135 == 1) {
                                                    var384.field2816 = 1;
                                                } else {
                                                    var384.field2816 = 2;
                                                }
                                                if (var384.field2813 > 0) {
                                                    var384.field2819 = var384.field2819 * 32 / var384.field2813;
                                                } else if (var384.field2782 > 0) {
                                                    var384.field2819 = var384.field2819 * 32 / var384.field2782;
                                                }
                                                method2263(var384);
                                            } else {
                                                if (var383 == -1) {
                                                    var384.field2801 = 0;
                                                    field334 = -1;
                                                    var252 = true;
                                                    break label4045;
                                                }
                                                class52 var385 = class52.method578(var383);
                                                var384.field2801 = 4;
                                                var384.field2858 = var383;
                                                var384.field2809 = var385.field1128;
                                                var384.field2810 = var385.field1129;
                                                var384.field2819 = var385.field1127 * 100 / var381;
                                                method2263(var384);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 146) {
                                            while (field294.field1999 < field333) {
                                                boolean var387 = field294.method2316() == 1;
                                                String var388 = field294.method2324();
                                                String var389 = field294.method2324();
                                                int var390 = field294.method2318();
                                                int var391 = field294.method2316();
                                                int var392 = field294.method2316();
                                                boolean var393 = (var392 & 0x2) != 0;
                                                boolean var394 = (var392 & 0x1) != 0;
                                                if (var390 > 0) {
                                                    field294.method2324();
                                                    field294.method2316();
                                                    field294.method2321();
                                                }
                                                field294.method2324();
                                                for (int var395 = 0; var395 < field422; var395++) {
                                                    class18 var396 = field558[var395];
                                                    if (var387) {
                                                        if (var389.equals(var396.field254)) {
                                                            var396.field254 = var388;
                                                            var396.field248 = var389;
                                                            var388 = null;
                                                            break;
                                                        }
                                                    } else if (var388.equals(var396.field254)) {
                                                        if (var396.field249 != var390) {
                                                            boolean var397 = true;
                                                            for (class39 var398 = (class39) field559.method3495(); var398 != null; var398 = (class39) field559.method3491()) {
                                                                if (var398.field876.equals(var388)) {
                                                                    if (var390 != 0 && var398.field872 == 0) {
                                                                        var398.method3605();
                                                                        var397 = false;
                                                                    } else if (var390 == 0 && var398.field872 != 0) {
                                                                        var398.method3605();
                                                                        var397 = false;
                                                                    }
                                                                }
                                                            }
                                                            if (var397) {
                                                                field559.method3489(new class39(var388, var390));
                                                            }
                                                            var396.field249 = var390;
                                                        }
                                                        var396.field248 = var389;
                                                        var396.field250 = var391;
                                                        var396.field247 = var393;
                                                        var396.field252 = var394;
                                                        var388 = null;
                                                        break;
                                                    }
                                                }
                                                if (var388 != null && field422 < 400) {
                                                    class18 var399 = new class18();
                                                    field558[field422] = var399;
                                                    var399.field254 = var388;
                                                    var399.field248 = var389;
                                                    var399.field249 = var390;
                                                    var399.field250 = var391;
                                                    var399.field247 = var393;
                                                    var399.field252 = var394;
                                                    field422++;
                                                }
                                            }
                                            field387 = 2;
                                            field482 = field393;
                                            boolean var400 = false;
                                            int var401 = field422;
                                            while (var401 > 0) {
                                                boolean var402 = true;
                                                var401--;
                                                for (int var403 = 0; var403 < var401; var403++) {
                                                    boolean var404 = false;
                                                    class18 var405 = field558[var403];
                                                    class18 var406 = field558[var403 + 1];
                                                    if (field287 != var405.field249 && field287 == var406.field249) {
                                                        var404 = true;
                                                    }
                                                    if (!var404 && var405.field249 == 0 && var406.field249 != 0) {
                                                        var404 = true;
                                                    }
                                                    if (!var404 && !var405.field247 && var406.field247) {
                                                        var404 = true;
                                                    }
                                                    if (!var404 && !var405.field252 && var406.field252) {
                                                        var404 = true;
                                                    }
                                                    if (var404) {
                                                        class18 var407 = field558[var403];
                                                        field558[var403] = field558[var403 + 1];
                                                        field558[var403 + 1] = var407;
                                                        var402 = false;
                                                    }
                                                }
                                                if (var402) {
                                                    break;
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 190) {
                                            int var408 = field294.method2402();
                                            int var409 = field294.method2350();
                                            class173 var410 = class173.method691(var408);
                                            if (var410.field2801 != 1 || var410.field2858 != var409) {
                                                var410.field2801 = 1;
                                                var410.field2858 = var409;
                                                method2263(var410);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 230) {
                                            int var411 = field294.method2372();
                                            class173 var412 = class173.method691(var411);
                                            var412.field2801 = 3;
                                            var412.field2858 = Statics.field2250.field35.method3228();
                                            method2263(var412);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 166) {
                                            class33.method590(field294, field333);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 33) {
                                            for (int var413 = 0; var413 < class176.field2907.length; var413++) {
                                                if (class176.field2907[var413] != class176.field2905[var413]) {
                                                    class176.field2907[var413] = class176.field2905[var413];
                                                    method2614(var413);
                                                    field475[++field341 - 1 & 0x1F] = var413;
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 39) {
                                            method3088(false);
                                            field294.method2550();
                                            int var414 = field294.method2318();
                                            class33.method590(field294, var414);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 8) {
                                            Statics.field762 = field294.method2316();
                                            Statics.field200 = field294.method2349();
                                            while (field294.field1999 < field333) {
                                                field334 = field294.method2316();
                                                method2034();
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 98) {
                                            class26 var415 = new class26();
                                            var415.field641 = field294.method2324();
                                            var415.field638 = field294.method2318();
                                            int var416 = field294.method2321();
                                            var415.field639 = var416;
                                            method553(45);
                                            Statics.field3116.method2796();
                                            Statics.field3116 = null;
                                            class32.method9(var415);
                                            field334 = -1;
                                            var252 = false;
                                            break label4045;
                                        }
                                        if (field334 == 72) {
                                            int var417 = field294.method2329();
                                            boolean var418 = field294.method2316() == 1;
                                            String var419 = "";
                                            boolean var420 = false;
                                            if (var418) {
                                                var419 = field294.method2324();
                                                if (method191(var419)) {
                                                    var420 = true;
                                                }
                                            }
                                            String var421 = field294.method2324();
                                            if (!var420) {
                                                class12.method183(var417, var419, var421);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 243) {
                                            int var422 = field294.method2352();
                                            field449 = var422;
                                            Statics.method1063(false);
                                            method924(var422);
                                            class37.method863(field449);
                                            for (int var423 = 0; var423 < 100; var423++) {
                                                field494[var423] = true;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 91) {
                                            if (field449 != -1) {
                                                method189(field449, 0);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 11) {
                                            String var424 = field294.method2324();
                                            int var425 = field294.method2402();
                                            class173 var426 = class173.method691(var425);
                                            if (!var424.equals(var426.field2818)) {
                                                var426.field2818 = var424;
                                                method2263(var426);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 101) {
                                            String var427 = field294.method2324();
                                            String var428 = class223.method3721(class163.method3460(class222.method3644(field294)));
                                            class12.method183(6, var427, var428);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 186) {
                                            method1751();
                                            int var429 = field294.method2349();
                                            int var430 = field294.method2434();
                                            int var431 = field294.method2372();
                                            field427[var429] = var431;
                                            field425[var429] = var430;
                                            field426[var429] = 1;
                                            for (int var432 = 0; var432 < 98; var432++) {
                                                if (var431 >= class155.field2302[var432]) {
                                                    field426[var429] = var432 + 2;
                                                }
                                            }
                                            field464[++field522 - 1 & 0x1F] = var429;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 67) {
                                            field529 = true;
                                            Statics.field1770 = field294.method2316();
                                            Statics.field1103 = field294.method2316();
                                            Statics.field1884 = field294.method2318();
                                            Statics.field598 = field294.method2316();
                                            Statics.field234 = field294.method2316();
                                            if (Statics.field234 >= 100) {
                                                int var433 = Statics.field1770 * 128 + 64;
                                                int var434 = Statics.field1103 * 128 + 64;
                                                int var435 = method2205(var433, var434, Statics.field1387) - Statics.field1884;
                                                int var436 = var433 - Statics.field2198;
                                                int var437 = var435 - Statics.field798;
                                                int var438 = var434 - Statics.field2229;
                                                int var439 = (int) Math.sqrt((double) (var436 * var436 + var438 * var438));
                                                Statics.field557 = (int) (Math.atan2((double) var437, (double) var439) * 325.949D) & 0x7FF;
                                                Statics.field1372 = (int) (Math.atan2((double) var436, (double) var438) * -325.949D) & 0x7FF;
                                                if (Statics.field557 < 128) {
                                                    Statics.field557 = 128;
                                                }
                                                if (Statics.field557 > 383) {
                                                    Statics.field557 = 383;
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 242) {
                                            field294.field1999 += 28;
                                            if (field294.method2338()) {
                                                class149.method2546(field294, field294.field1999 - 28);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 145) {
                                            int var440 = field294.method2402();
                                            int var441 = field294.method2351();
                                            class173 var442 = class173.method691(var440);
                                            if (var442 != null && var442.field2850 == 0) {
                                                if (var441 > var442.field2784 - var442.field2891) {
                                                    var441 = var442.field2784 - var442.field2891;
                                                }
                                                if (var441 < 0) {
                                                    var441 = 0;
                                                }
                                                if (var442.field2887 != var441) {
                                                    var442.field2887 = var441;
                                                    method2263(var442);
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 45) {
                                            int var443 = field333 + field294.field1999;
                                            int var444 = field294.method2318();
                                            int var445 = field294.method2318();
                                            if (field449 != var444) {
                                                field449 = var444;
                                                Statics.method1063(false);
                                                method924(field449);
                                                class37.method863(field449);
                                                for (int var446 = 0; var446 < 100; var446++) {
                                                    field494[var446] = true;
                                                }
                                            }
                                            while (var445-- > 0) {
                                                int var447 = field294.method2321();
                                                int var448 = field294.method2318();
                                                int var449 = field294.method2316();
                                                class4 var450 = (class4) field450.method3499((long) var447);
                                                if (var450 != null && var450.field67 != var448) {
                                                    method40(var450, true);
                                                    var450 = null;
                                                }
                                                if (var450 == null) {
                                                    var450 = method457(var447, var448, var449);
                                                }
                                                var450.field68 = true;
                                            }
                                            for (class4 var451 = (class4) field450.method3503(); var451 != null; var451 = (class4) field450.method3502()) {
                                                if (var451.field68) {
                                                    var451.field68 = false;
                                                } else {
                                                    method40(var451, true);
                                                }
                                            }
                                            field491 = new class196(512);
                                            while (field294.field1999 < var443) {
                                                int var452 = field294.method2321();
                                                int var453 = field294.method2318();
                                                int var454 = field294.method2318();
                                                int var455 = field294.method2321();
                                                for (int var456 = var453; var456 <= var454; var456++) {
                                                    long var457 = ((long) var452 << 32) + (long) var456;
                                                    field491.method3501(new class201(var455), var457);
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 81 || field334 == 141 || field334 == 210 || field334 == 30 || field334 == 216 || field334 == 66 || field334 == 139 || field334 == 1 || field334 == 60 || field334 == 44) {
                                            method2034();
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 122) {
                                            while (field294.field1999 < field333) {
                                                int var459 = field294.method2316();
                                                boolean var460 = (var459 & 0x1) == 1;
                                                String var461 = field294.method2324();
                                                String var462 = field294.method2324();
                                                field294.method2324();
                                                for (int var463 = 0; var463 < field560; var463++) {
                                                    class8 var464 = field561[var463];
                                                    if (var460) {
                                                        if (var462.equals(var464.field140)) {
                                                            var464.field140 = var461;
                                                            var464.field137 = var462;
                                                            var461 = null;
                                                            break;
                                                        }
                                                    } else if (var461.equals(var464.field140)) {
                                                        var464.field140 = var461;
                                                        var464.field137 = var462;
                                                        var461 = null;
                                                        break;
                                                    }
                                                }
                                                if (var461 != null && field560 < 400) {
                                                    class8 var465 = new class8();
                                                    field561[field560] = var465;
                                                    var465.field140 = var461;
                                                    var465.field137 = var462;
                                                    field560++;
                                                }
                                            }
                                            field482 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 22) {
                                            field525 = field294.method2316();
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 248) {
                                            String var466 = field294.method2324();
                                            int var467 = field294.method2318();
                                            byte var468 = field294.method2317();
                                            boolean var469 = false;
                                            if (var468 == -128) {
                                                var469 = true;
                                            }
                                            if (var469) {
                                                if (Statics.field164 == 0) {
                                                    field334 = -1;
                                                    var252 = true;
                                                    break label4045;
                                                }
                                                boolean var470 = false;
                                                int var471;
                                                for (var471 = 0; var471 < Statics.field164 && (!Statics.field2104[var471].field627.equals(var466) || Statics.field2104[var471].field621 != var467); var471++) {
                                                }
                                                if (var471 < Statics.field164) {
                                                    while (var471 < Statics.field164 - 1) {
                                                        Statics.field2104[var471] = Statics.field2104[var471 + 1];
                                                        var471++;
                                                    }
                                                    Statics.field164--;
                                                    Statics.field2104[Statics.field164] = null;
                                                }
                                            } else {
                                                field294.method2324();
                                                class25 var472 = new class25();
                                                var472.field627 = var466;
                                                var472.field622 = class164.method2659(var472.field627, Statics.field474);
                                                var472.field621 = var467;
                                                var472.field623 = var468;
                                                int var473;
                                                for (var473 = Statics.field164 - 1; var473 >= 0; var473--) {
                                                    int var474 = Statics.field2104[var473].field622.compareTo(var472.field622);
                                                    if (var474 == 0) {
                                                        Statics.field2104[var473].field621 = var467;
                                                        Statics.field2104[var473].field623 = var468;
                                                        if (var466.equals(Statics.field2250.field49)) {
                                                            Statics.field2654 = var468;
                                                        }
                                                        field483 = field393;
                                                        field334 = -1;
                                                        var252 = true;
                                                        break label4045;
                                                    }
                                                    if (var474 < 0) {
                                                        break;
                                                    }
                                                }
                                                if (Statics.field164 >= Statics.field2104.length) {
                                                    field334 = -1;
                                                    var252 = true;
                                                    break label4045;
                                                }
                                                for (int var475 = Statics.field164 - 1; var475 > var473; var475--) {
                                                    Statics.field2104[var475 + 1] = Statics.field2104[var475];
                                                }
                                                if (Statics.field164 == 0) {
                                                    Statics.field2104 = new class25[100];
                                                }
                                                Statics.field2104[var473 + 1] = var472;
                                                Statics.field164++;
                                                if (var466.equals(Statics.field2250.field49)) {
                                                    Statics.field2654 = var468;
                                                }
                                            }
                                            field483 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 0) {
                                            int var476 = field294.method2353();
                                            int var477 = field294.method2360();
                                            class173 var478 = class173.method691(var477);
                                            if (var478.field2837 != var476 || var476 == -1) {
                                                var478.field2837 = var476;
                                                var478.field2817 = 0;
                                                var478.field2761 = 0;
                                                method2263(var478);
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 64) {
                                            class211.method58(field294, field333);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 162) {
                                            String var479 = field294.method2324();
                                            long var480 = field294.method2495();
                                            long var482 = (long) field294.method2318();
                                            long var484 = (long) field294.method2416();
                                            class152 var486 = (class152) class109.method2910(class152.method3197(), field294.method2316());
                                            long var487 = (var482 << 32) + var484;
                                            boolean var489 = false;
                                            for (int var490 = 0; var490 < 100; var490++) {
                                                if (field510[var490] == var487) {
                                                    var489 = true;
                                                    break;
                                                }
                                            }
                                            if (var486.field2279 && method191(var479)) {
                                                var489 = true;
                                            }
                                            if (!var489 && field472 == 0) {
                                                field510[field511] = var487;
                                                field511 = (field511 + 1) % 100;
                                                String var491 = class223.method3721(class163.method3460(class222.method3644(field294)));
                                                if (var486.field2277 == -1) {
                                                    class12.method919(9, var479, var491, class162.method3457(var480));
                                                } else {
                                                    class12.method919(9, class2.method195(var486.field2277) + var479, var491, class162.method3457(var480));
                                                }
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 9) {
                                            method1751();
                                            field336 = field294.method2316();
                                            field364 = field393;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 176) {
                                            Statics.field762 = field294.method2434();
                                            Statics.field200 = field294.method2349();
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 97) {
                                            method645();
                                            field334 = -1;
                                            var252 = false;
                                            break label4045;
                                        }
                                        if (field334 == 217) {
                                            field529 = false;
                                            for (int var492 = 0; var492 < 5; var492++) {
                                                field538[var492] = false;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 61) {
                                            method3088(true);
                                            field294.method2550();
                                            int var493 = field294.method2318();
                                            class33.method590(field294, var493);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 25) {
                                            int var494 = field294.method2318();
                                            class16 var495 = (class16) class16.field226.method3499((long) var494);
                                            if (var495 != null) {
                                                var495.method3608();
                                            }
                                            field477[++field412 - 1 & 0x1F] = var494 & 0x7FFF;
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 36) {
                                            method1572(field294.method2324());
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 159) {
                                            int var496 = field294.method2321();
                                            int var497 = field294.method2321();
                                            if (Statics.field2936 == null || !Statics.field2936.isValid()) {
                                                try {
                                                    Iterator var498 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                                                    while (var498.hasNext()) {
                                                        GarbageCollectorMXBean var499 = (GarbageCollectorMXBean) var498.next();
                                                        if (var499.isValid()) {
                                                            Statics.field2936 = var499;
                                                            field567 = -1L;
                                                            field462 = -1L;
                                                        }
                                                    }
                                                } catch (Throwable var623) {
                                                }
                                            }
                                            long var501 = class115.method2249();
                                            int var503 = -1;
                                            if (Statics.field2936 != null) {
                                                long var504 = Statics.field2936.getCollectionTime();
                                                if (field462 != -1L) {
                                                    long var506 = var504 - field462;
                                                    long var508 = var501 - field567;
                                                    if (var508 != 0L) {
                                                        var503 = (int) (var506 * 100L / var508);
                                                    }
                                                }
                                                field462 = var504;
                                                field567 = var501;
                                            }
                                            field330.method2549(1);
                                            field330.method2499(var496);
                                            field330.method2499(var497);
                                            field330.method2340(field2206);
                                            field330.method2340(var503);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 171) {
                                            field529 = true;
                                            Statics.field136 = field294.method2316();
                                            Statics.field1911 = field294.method2316();
                                            Statics.field1221 = field294.method2318();
                                            Statics.field1978 = field294.method2316();
                                            Statics.field3164 = field294.method2316();
                                            if (Statics.field3164 >= 100) {
                                                Statics.field2198 = Statics.field136 * 128 + 64;
                                                Statics.field2229 = Statics.field1911 * 128 + 64;
                                                Statics.field798 = method2205(Statics.field2198, Statics.field2229, Statics.field1387) - Statics.field1221;
                                            }
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        if (field334 == 154) {
                                            String var510 = field294.method2324();
                                            Object[] var511 = new Object[var510.length() + 1];
                                            for (int var512 = var510.length() - 1; var512 >= 0; var512--) {
                                                if (var510.charAt(var512) == 's') {
                                                    var511[var512 + 1] = field294.method2324();
                                                } else {
                                                    var511[var512 + 1] = Integer.valueOf(field294.method2321());
                                                }
                                            }
                                            var511[0] = Integer.valueOf(field294.method2321());
                                            class1 var513 = new class1();
                                            var513.field6 = var511;
                                            class37.method2607(var513, 200000);
                                            field334 = -1;
                                            var252 = true;
                                            break label4045;
                                        }
                                        class148.method181("" + field334 + class2.field20 + field547 + class2.field20 + field555 + class2.field20 + field333, (Throwable) null);
                                        method645();
                                    } catch (IOException var624) {
                                        method567();
                                    } catch (Exception var625) {
                                        String var516 = "" + field334 + class2.field20 + field547 + class2.field20 + field555 + class2.field20 + field333 + class2.field20 + (Statics.field1684 + Statics.field2250.field865[0]) + class2.field20 + (Statics.field1599 + Statics.field2250.field818[0]) + class2.field20;
                                        for (int var517 = 0; var517 < field333 && var517 < 50; var517++) {
                                            var516 = var516 + field294.field1996[var517] + class2.field20;
                                        }
                                        class148.method181(var516, var625);
                                        method645();
                                    }
                                    var252 = true;
                                }
                            }
                            if (!var252) {
                                break;
                            }
                        }
                        if (field296 == 30) {
                            while (class211.method3456()) {
                                field330.method2549(242);
                                field330.method2301(0);
                                int var518 = field330.field1999;
                                class211.method3455(field330);
                                field330.method2313(field330.field1999 - var518);
                            }
                            Object var519 = Statics.field2913.field199;
                            synchronized (Statics.field2913.field199) {
                                if (!field286) {
                                    Statics.field2913.field206 = 0;
                                } else if (class140.field2169 != 0 || Statics.field2913.field206 >= 40) {
                                    field330.method2549(69);
                                    field330.method2301(0);
                                    int var520 = field330.field1999;
                                    int var521 = 0;
                                    for (int var522 = 0; var522 < Statics.field2913.field206 && field330.field1999 - var520 < 240; var522++) {
                                        var521++;
                                        int var523 = Statics.field2913.field207[var522];
                                        if (var523 < 0) {
                                            var523 = 0;
                                        } else if (var523 > 502) {
                                            var523 = 502;
                                        }
                                        int var524 = Statics.field2913.field203[var522];
                                        if (var524 < 0) {
                                            var524 = 0;
                                        } else if (var524 > 764) {
                                            var524 = 764;
                                        }
                                        int var525 = var523 * 765 + var524;
                                        if (Statics.field2913.field207[var522] == -1 && Statics.field2913.field203[var522] == -1) {
                                            var524 = -1;
                                            var523 = -1;
                                            var525 = 524287;
                                        }
                                        if (field300 != var524 || field374 != var523) {
                                            int var526 = var524 - field300;
                                            field300 = var524;
                                            int var527 = var523 - field374;
                                            field374 = var523;
                                            if (field446 < 8 && var526 >= -32 && var526 <= 31 && var527 >= -32 && var527 <= 31) {
                                                var526 += 32;
                                                var527 += 32;
                                                field330.method2404((field446 << 12) + (var526 << 6) + var527);
                                                field446 = 0;
                                            } else if (field446 < 8) {
                                                field330.method2320((field446 << 19) + 8388608 + var525);
                                                field446 = 0;
                                            } else {
                                                field330.method2304((field446 << 19) + -1073741824 + var525);
                                                field446 = 0;
                                            }
                                        } else if (field446 < 2047) {
                                            field446++;
                                        }
                                    }
                                    field330.method2313(field330.field1999 - var520);
                                    if (var521 >= Statics.field2913.field206) {
                                        Statics.field2913.field206 = 0;
                                    } else {
                                        Statics.field2913.field206 -= var521;
                                        for (int var528 = 0; var528 < Statics.field2913.field206; var528++) {
                                            Statics.field2913.field203[var528] = Statics.field2913.field203[var521 + var528];
                                            Statics.field2913.field207[var528] = Statics.field2913.field207[var521 + var528];
                                        }
                                    }
                                }
                            }
                            if (class140.field2169 == 1 || !Statics.field1618 && class140.field2169 == 4 || class140.field2169 == 2) {
                                long var530 = (class140.field2157 - field299) / 50L;
                                if (var530 > 4095L) {
                                    var530 = 4095L;
                                }
                                field299 = class140.field2157;
                                int var532 = class140.field2164;
                                if (var532 < 0) {
                                    var532 = 0;
                                } else if (var532 > Statics.field1567) {
                                    var532 = Statics.field1567;
                                }
                                int var533 = class140.field2170;
                                if (var533 < 0) {
                                    var533 = 0;
                                } else if (var533 > Statics.field2191) {
                                    var533 = Statics.field2191;
                                }
                                int var534 = (int) var530;
                                field330.method2549(200);
                                field330.method2404((class140.field2169 == 2 ? 1 : 0) + (var534 << 1));
                                field330.method2404(var533);
                                field330.method2404(var532);
                            }
                            if (class137.field2129 > 0) {
                                field330.method2549(138);
                                field330.method2404(0);
                                int var535 = field330.field1999;
                                long var536 = class115.method2249();
                                for (int var538 = 0; var538 < class137.field2129; var538++) {
                                    long var539 = var536 - field515;
                                    if (var539 > 16777215L) {
                                        var539 = 16777215L;
                                    }
                                    field515 = var536;
                                    field330.method2341((int) var539);
                                    field330.method2485(class137.field2128[var538]);
                                }
                                field330.method2377(field330.field1999 - var535);
                            }
                            if (field381 > 0) {
                                field381--;
                            }
                            if (class137.field2122[96] || class137.field2122[97] || class137.field2122[98] || class137.field2122[99]) {
                                field382 = true;
                            }
                            if (field382 && field381 <= 0) {
                                field381 = 20;
                                field382 = false;
                                field330.method2549(93);
                                field330.method2427(field556);
                                field330.method2347(field375);
                            }
                            if (Statics.field1107 && !field303) {
                                field303 = true;
                                field330.method2549(82);
                                field330.method2301(1);
                            }
                            if (!Statics.field1107 && field303) {
                                field303 = false;
                                field330.method2549(82);
                                field330.method2301(0);
                            }
                            if (Statics.field1387 != field518) {
                                field518 = Statics.field1387;
                                int var541 = Statics.field1387;
                                int[] var542 = Statics.field1003.field1413;
                                int var543 = var542.length;
                                for (int var544 = 0; var544 < var543; var544++) {
                                    var542[var544] = 0;
                                }
                                int var545 = 1;
                                while (true) {
                                    if (var545 >= 103) {
                                        int var548 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                                        int var549 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                                        Statics.field1003.method1576();
                                        for (int var550 = 1; var550 < 103; var550++) {
                                            for (int var551 = 1; var551 < 103; var551++) {
                                                if ((class6.field82[var541][var551][var550] & 0x18) == 0) {
                                                    method2245(var541, var551, var550, var548, var549);
                                                }
                                                if (var541 < 3 && (class6.field82[var541 + 1][var551][var550] & 0x8) != 0) {
                                                    method2245(var541 + 1, var551, var550, var548, var549);
                                                }
                                            }
                                        }
                                        field519 = 0;
                                        for (int var552 = 0; var552 < 104; var552++) {
                                            for (int var553 = 0; var553 < 104; var553++) {
                                                int var554 = Statics.field1907.method1895(Statics.field1387, var552, var553);
                                                if (var554 != 0) {
                                                    int var555 = var554 >> 14 & 0x7FFF;
                                                    int var556 = class41.method981(var555).field946;
                                                    if (var556 >= 0) {
                                                        int var557 = var552;
                                                        int var558 = var553;
                                                        if (var556 != 22 && var556 != 29 && var556 != 34 && var556 != 36 && var556 != 46 && var556 != 47 && var556 != 48) {
                                                            int[][] var559 = field347[Statics.field1387].field1905;
                                                            for (int var560 = 0; var560 < 10; var560++) {
                                                                int var561 = (int) (Math.random() * 4.0D);
                                                                if (var561 == 0 && var557 > 0 && var557 > var552 - 3 && (var559[var557 - 1][var558] & 0x1240108) == 0) {
                                                                    var557--;
                                                                }
                                                                if (var561 == 1 && var557 < 103 && var557 < var552 + 3 && (var559[var557 + 1][var558] & 0x1240180) == 0) {
                                                                    var557++;
                                                                }
                                                                if (var561 == 2 && var558 > 0 && var558 > var553 - 3 && (var559[var557][var558 - 1] & 0x1240102) == 0) {
                                                                    var558--;
                                                                }
                                                                if (var561 == 3 && var558 < 103 && var558 < var553 + 3 && (var559[var557][var558 + 1] & 0x1240120) == 0) {
                                                                    var558++;
                                                                }
                                                            }
                                                        }
                                                        field396[field519] = Statics.field967[var556];
                                                        field520[field519] = var557;
                                                        field564[field519] = var558;
                                                        field519++;
                                                    }
                                                }
                                            }
                                        }
                                        Statics.field1386.method1565();
                                        break;
                                    }
                                    int var546 = (103 - var545) * 2048 + 24628;
                                    for (int var547 = 1; var547 < 103; var547++) {
                                        if ((class6.field82[var541][var547][var545] & 0x18) == 0) {
                                            Statics.field1907.method1794(var542, var546, 512, var541, var547, var545);
                                        }
                                        if (var541 < 3 && (class6.field82[var541 + 1][var547][var545] & 0x8) != 0) {
                                            Statics.field1907.method1794(var542, var546, 512, var541 + 1, var547, var545);
                                        }
                                        var546 += 4;
                                    }
                                    var545++;
                                }
                            }
                            if (field296 == 30) {
                                for (class17 var562 = (class17) field410.method3528(); var562 != null; var562 = (class17) field410.method3527()) {
                                    if (var562.field245 > 0) {
                                        var562.field245--;
                                    }
                                    if (var562.field245 != 0) {
                                        if (var562.field241 > 0) {
                                            var562.field241--;
                                        }
                                        if (var562.field241 == 0 && var562.field231 >= 1 && var562.field236 >= 1 && var562.field231 <= 102 && var562.field236 <= 102 && (var562.field238 < 0 || class6.method162(var562.field238, var562.field240))) {
                                            method178(var562.field243, var562.field232, var562.field231, var562.field236, var562.field238, var562.field239, var562.field240);
                                            var562.field241 = -1;
                                            if (var562.field242 == var562.field238 && var562.field242 == -1) {
                                                var562.method3608();
                                            } else if (var562.field242 == var562.field238 && var562.field239 == var562.field235 && var562.field240 == var562.field237) {
                                                var562.method3608();
                                            }
                                        }
                                    } else if (var562.field242 < 0 || class6.method162(var562.field242, var562.field237)) {
                                        method178(var562.field243, var562.field232, var562.field231, var562.field236, var562.field242, var562.field235, var562.field237);
                                        var562.method3608();
                                    }
                                }
                                method3671();
                                field335++;
                                if (field335 > 750) {
                                    method567();
                                } else {
                                    int var563 = class33.field750;
                                    int[] var564 = class33.field756;
                                    for (int var565 = 0; var565 < var563; var565++) {
                                        class3 var566 = field411[var564[var565]];
                                        if (var566 != null) {
                                            method2970(var566, 1);
                                        }
                                    }
                                    method1937();
                                    method631();
                                    field363++;
                                    if (field401 != 0) {
                                        field306 += 20;
                                        if (field306 >= 400) {
                                            field401 = 0;
                                        }
                                    }
                                    if (Statics.field142 != null) {
                                        field339++;
                                        if (field339 >= 15) {
                                            method2263(Statics.field142);
                                            Statics.field142 = null;
                                        }
                                    }
                                    class173 var567 = Statics.field1377;
                                    class173 var568 = Statics.field1172;
                                    Statics.field1377 = null;
                                    Statics.field1172 = null;
                                    field313 = null;
                                    field470 = false;
                                    field467 = false;
                                    field501 = 0;
                                    while (true) {
                                        while (class137.method3458() && field501 < 128) {
                                            if (field456 >= 2 && class137.field2122[82] && Statics.field71 == 66) {
                                                String var569 = "";
                                                Iterator var570 = class12.field173.iterator();
                                                while (var570.hasNext()) {
                                                    class36 var571 = (class36) var570.next();
                                                    var569 = var569 + var571.field784 + ':' + var571.field786 + '\n';
                                                }
                                                Statics.field147.setContents(new StringSelection(var569), (ClipboardOwner) null);
                                            } else {
                                                field386[field501] = Statics.field71;
                                                field513[field501] = Statics.field255;
                                                field501++;
                                            }
                                        }
                                        if (field449 != -1) {
                                            int var574 = field449;
                                            int var575 = Statics.field2191;
                                            int var576 = Statics.field1567;
                                            if (class173.method2908(var574)) {
                                                method180(Statics.field2758[var574], -1, 0, 0, var575, var576, 0, 0);
                                            }
                                        }
                                        field393++;
                                        while (true) {
                                            class1 var577;
                                            class173 var578;
                                            class173 var579;
                                            do {
                                                var577 = (class1) field489.method3526();
                                                if (var577 == null) {
                                                    while (true) {
                                                        class1 var580;
                                                        class173 var581;
                                                        class173 var582;
                                                        do {
                                                            var580 = (class1) field490.method3526();
                                                            if (var580 == null) {
                                                                while (true) {
                                                                    class1 var583;
                                                                    class173 var584;
                                                                    class173 var585;
                                                                    do {
                                                                        var583 = (class1) field466.method3526();
                                                                        if (var583 == null) {
                                                                            method2769();
                                                                            if (field537 != null) {
                                                                                method2606();
                                                                            }
                                                                            if (Statics.field2074 != null) {
                                                                                method2263(Statics.field2074);
                                                                                field342++;
                                                                                if (class140.field2162 == 0) {
                                                                                    if (!field544) {
                                                                                        label2435: {
                                                                                            label2434: {
                                                                                                if (field428 != 1) {
                                                                                                    int var592 = field431 - 1;
                                                                                                    boolean var593;
                                                                                                    if (var592 < 0) {
                                                                                                        var593 = false;
                                                                                                    } else {
                                                                                                        int var594 = field434[var592];
                                                                                                        if (var594 >= 2000) {
                                                                                                            var594 -= 2000;
                                                                                                        }
                                                                                                        if (var594 == 1007) {
                                                                                                            var593 = true;
                                                                                                        } else {
                                                                                                            var593 = false;
                                                                                                        }
                                                                                                    }
                                                                                                    if (!var593) {
                                                                                                        break label2434;
                                                                                                    }
                                                                                                }
                                                                                                if (field431 > 2) {
                                                                                                    method209(field534, field293);
                                                                                                    break label2435;
                                                                                                }
                                                                                            }
                                                                                            if (field431 > 0) {
                                                                                                method991(field534, field293);
                                                                                            }
                                                                                        }
                                                                                    } else if (Statics.field2182 == Statics.field2074 && field536 != field407) {
                                                                                        class173 var586 = Statics.field2074;
                                                                                        byte var587 = 0;
                                                                                        if (field452 == 1 && var586.field2764 == 206) {
                                                                                            var587 = 1;
                                                                                        }
                                                                                        if (var586.field2876[field407] <= 0) {
                                                                                            var587 = 0;
                                                                                        }
                                                                                        if (class178.method1753(method883(var586))) {
                                                                                            int var588 = field536;
                                                                                            int var589 = field407;
                                                                                            var586.field2876[var589] = var586.field2876[var588];
                                                                                            var586.field2877[var589] = var586.field2877[var588];
                                                                                            var586.field2876[var588] = -1;
                                                                                            var586.field2877[var588] = 0;
                                                                                        } else if (var587 == 1) {
                                                                                            int var590 = field536;
                                                                                            int var591 = field407;
                                                                                            while (var590 != var591) {
                                                                                                if (var590 > var591) {
                                                                                                    var586.method3138(var590 - 1, var590);
                                                                                                    var590--;
                                                                                                } else if (var590 < var591) {
                                                                                                    var586.method3138(var590 + 1, var590);
                                                                                                    var590++;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            var586.method3138(field407, field536);
                                                                                        }
                                                                                        field330.method2549(99);
                                                                                        field330.method2404(field536);
                                                                                        field330.method2499(Statics.field2074.field2760);
                                                                                        field330.method2485(var587);
                                                                                        field330.method2303(field407);
                                                                                    }
                                                                                    field339 = 10;
                                                                                    class140.field2169 = 0;
                                                                                    Statics.field2074 = null;
                                                                                } else if (field342 >= 5 && (class140.field2163 > field534 + 5 || class140.field2163 < field534 - 5 || class140.field2172 * 488798971 > field293 + 5 || class140.field2172 * 488798971 < field293 - 5)) {
                                                                                    field544 = true;
                                                                                }
                                                                            }
                                                                            if (class86.field1471 != -1) {
                                                                                int var595 = class86.field1471;
                                                                                int var596 = class86.field1516;
                                                                                field330.method2549(60);
                                                                                field330.method2301(5);
                                                                                field330.method2303(Statics.field1599 + var596);
                                                                                field330.method2427(Statics.field1684 + var595);
                                                                                field330.method2339(class137.field2122[82] ? (class137.field2122[81] ? 2 : 1) : 0);
                                                                                class86.field1471 = -1;
                                                                                field398 = class140.field2170;
                                                                                field480 = class140.field2164;
                                                                                field401 = 1;
                                                                                field306 = 0;
                                                                                field297 = var595;
                                                                                field320 = var596;
                                                                            }
                                                                            if (Statics.field1377 != var567) {
                                                                                if (var567 != null) {
                                                                                    method2263(var567);
                                                                                }
                                                                                if (Statics.field1377 != null) {
                                                                                    method2263(Statics.field1377);
                                                                                }
                                                                            }
                                                                            if (Statics.field1172 != var568 && field441 == field440) {
                                                                                if (var568 != null) {
                                                                                    method2263(var568);
                                                                                }
                                                                                if (Statics.field1172 != null) {
                                                                                    method2263(Statics.field1172);
                                                                                }
                                                                            }
                                                                            if (Statics.field1172 == null) {
                                                                                if (field440 > 0) {
                                                                                    field440--;
                                                                                }
                                                                            } else if (field440 < field441) {
                                                                                field440++;
                                                                                if (field441 == field440) {
                                                                                    method2263(Statics.field1172);
                                                                                }
                                                                            }
                                                                            int var597 = field284 + Statics.field2250.field840;
                                                                            int var598 = field353 + Statics.field2250.field849;
                                                                            if (Statics.field1696 - var597 < -500 || Statics.field1696 - var597 > 500 || Statics.field2154 - var598 < -500 || Statics.field2154 - var598 > 500) {
                                                                                Statics.field1696 = var597;
                                                                                Statics.field2154 = var598;
                                                                            }
                                                                            if (Statics.field1696 != var597) {
                                                                                Statics.field1696 += (var597 - Statics.field1696) / 16;
                                                                            }
                                                                            if (Statics.field2154 != var598) {
                                                                                Statics.field2154 += (var598 - Statics.field2154) / 16;
                                                                            }
                                                                            if (class140.field2162 == 4 && Statics.field1618) {
                                                                                int var599 = class140.field2172 * 488798971 - field379 * 488798971;
                                                                                field377 = var599 * 2;
                                                                                field379 = (var599 == -1 || var599 == 1 ? class140.field2172 * 488798971 : (field379 * 488798971 + class140.field2172 * 488798971) / 2) * -1129545677;
                                                                                int var600 = field416 - class140.field2163;
                                                                                field506 = var600 * 2;
                                                                                field416 = var600 == -1 || var600 == 1 ? class140.field2163 : (field416 + class140.field2163) / 2;
                                                                            } else {
                                                                                if (class137.field2122[96]) {
                                                                                    field506 += (-24 - field506) / 2;
                                                                                } else if (class137.field2122[97]) {
                                                                                    field506 += (24 - field506) / 2;
                                                                                } else {
                                                                                    field506 /= 2;
                                                                                }
                                                                                if (class137.field2122[98]) {
                                                                                    field377 += (12 - field377) / 2;
                                                                                } else if (class137.field2122[99]) {
                                                                                    field377 += (-12 - field377) / 2;
                                                                                } else {
                                                                                    field377 /= 2;
                                                                                }
                                                                                field379 = class140.field2172;
                                                                                field416 = class140.field2163;
                                                                            }
                                                                            field375 = field506 / 2 + field375 & 0x7FF;
                                                                            field556 += field377 / 2;
                                                                            if (field556 < 128) {
                                                                                field556 = 128;
                                                                            }
                                                                            if (field556 > 383) {
                                                                                field556 = 383;
                                                                            }
                                                                            int var601 = Statics.field1696 >> 7;
                                                                            int var602 = Statics.field2154 >> 7;
                                                                            int var603 = method2205(Statics.field1696, Statics.field2154, Statics.field1387);
                                                                            int var604 = 0;
                                                                            if (var601 > 3 && var602 > 3 && var601 < 100 && var602 < 100) {
                                                                                for (int var605 = var601 - 4; var605 <= var601 + 4; var605++) {
                                                                                    for (int var606 = var602 - 4; var606 <= var602 + 4; var606++) {
                                                                                        int var607 = Statics.field1387;
                                                                                        if (var607 < 3 && (class6.field82[1][var605][var606] & 0x2) == 2) {
                                                                                            var607++;
                                                                                        }
                                                                                        int var608 = var603 - class6.field94[var607][var605][var606];
                                                                                        if (var608 > var604) {
                                                                                            var604 = var608;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            int var609 = var604 * 192;
                                                                            if (var609 > 98048) {
                                                                                var609 = 98048;
                                                                            }
                                                                            if (var609 < 32768) {
                                                                                var609 = 32768;
                                                                            }
                                                                            if (var609 > field552) {
                                                                                field552 += (var609 - field552) / 24;
                                                                            } else if (var609 < field552) {
                                                                                field552 += (var609 - field552) / 80;
                                                                            }
                                                                            if (field529) {
                                                                                method157();
                                                                            }
                                                                            for (int var610 = 0; var610 < 5; var610++) {
                                                                                var10002 = field542[var610]++;
                                                                            }
                                                                            Statics.field64.method219();
                                                                            int var611 = ++class140.field2171 - 1;
                                                                            int var613 = class137.field2133;
                                                                            if (var611 > 15000 && var613 > 15000) {
                                                                                field340 = 250;
                                                                                class140.method573(14500);
                                                                                field330.method2549(209);
                                                                            }
                                                                            field378++;
                                                                            if (field378 > 500) {
                                                                                field378 = 0;
                                                                                int var615 = (int) (Math.random() * 8.0D);
                                                                                if ((var615 & 0x1) == 1) {
                                                                                    field284 += field343;
                                                                                }
                                                                                if ((var615 & 0x2) == 2) {
                                                                                    field353 += field354;
                                                                                }
                                                                                if ((var615 & 0x4) == 4) {
                                                                                    field355 += field356;
                                                                                }
                                                                            }
                                                                            if (field284 < -50) {
                                                                                field343 = 2;
                                                                            }
                                                                            if (field284 > 50) {
                                                                                field343 = -2;
                                                                            }
                                                                            if (field353 < -55) {
                                                                                field354 = 2;
                                                                            }
                                                                            if (field353 > 55) {
                                                                                field354 = -2;
                                                                            }
                                                                            if (field355 < -40) {
                                                                                field356 = 1;
                                                                            }
                                                                            if (field355 > 40) {
                                                                                field356 = -1;
                                                                            }
                                                                            field399++;
                                                                            if (field399 > 500) {
                                                                                field399 = 0;
                                                                                int var616 = (int) (Math.random() * 8.0D);
                                                                                if ((var616 & 0x1) == 1) {
                                                                                    field523 += field332;
                                                                                }
                                                                                if ((var616 & 0x2) == 2) {
                                                                                    field360 += field361;
                                                                                }
                                                                            }
                                                                            if (field523 < -60) {
                                                                                field332 = 2;
                                                                            }
                                                                            if (field523 > 60) {
                                                                                field332 = -2;
                                                                            }
                                                                            if (field360 < -20) {
                                                                                field361 = 1;
                                                                            }
                                                                            if (field360 > 10) {
                                                                                field361 = -1;
                                                                            }
                                                                            for (class39 var617 = (class39) field559.method3495(); var617 != null; var617 = (class39) field559.method3491()) {
                                                                                if ((long) var617.field871 < class115.method2249() / 1000L - 5L) {
                                                                                    if (var617.field872 > 0) {
                                                                                        class12.method183(5, "", var617.field876 + class157.field2365);
                                                                                    }
                                                                                    if (var617.field872 == 0) {
                                                                                        class12.method183(5, "", var617.field876 + class157.field2461);
                                                                                    }
                                                                                    var617.method3605();
                                                                                }
                                                                            }
                                                                            field338++;
                                                                            if (field338 > 50) {
                                                                                field330.method2549(149);
                                                                            }
                                                                            try {
                                                                                if (Statics.field3116 != null && field330.field1999 > 0) {
                                                                                    Statics.field3116.method2780(field330.field1996, 0, field330.field1999);
                                                                                    field330.field1999 = 0;
                                                                                    field338 = 0;
                                                                                    return;
                                                                                }
                                                                            } catch (IOException var619) {
                                                                                method567();
                                                                            }
                                                                            return;
                                                                        }
                                                                        var584 = var583.field3;
                                                                        if (var584.field2826 < 0) {
                                                                            break;
                                                                        }
                                                                        var585 = class173.method691(var584.field2779);
                                                                    } while (var585 == null || var585.field2882 == null || var584.field2826 >= var585.field2882.length || var585.field2882[var584.field2826] != var584);
                                                                    class37.method2607(var583, 200000);
                                                                }
                                                            }
                                                            var581 = var580.field3;
                                                            if (var581.field2826 < 0) {
                                                                break;
                                                            }
                                                            var582 = class173.method691(var581.field2779);
                                                        } while (var582 == null || var582.field2882 == null || var581.field2826 >= var582.field2882.length || var582.field2882[var581.field2826] != var581);
                                                        class37.method2607(var580, 200000);
                                                    }
                                                }
                                                var578 = var577.field3;
                                                if (var578.field2826 < 0) {
                                                    break;
                                                }
                                                var579 = class173.method691(var578.field2779);
                                            } while (var579 == null || var579.field2882 == null || var578.field2826 >= var579.field2882.length || var579.field2882[var578.field2826] != var578);
                                            class37.method2607(var577, 200000);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (field296 == 40 || field296 == 45) {
                    method2726();
                }
                return;
            }
            var2.field2713.method3103(var2.field2712, (int) var2.field3113, var2.field2711, false);
        }
    }

    @ObfuscatedName("client.n(I)V")
    public final void method236() {
        boolean var1;
        label319: {
            try {
                if (class183.field2958 == 2) {
                    if (Statics.field2720 == null) {
                        Statics.field2720 = class180.method3250(Statics.field2956, Statics.field2044, Statics.field139);
                        if (Statics.field2720 == null) {
                            var1 = false;
                            break label319;
                        }
                    }
                    if (Statics.field2747 == null) {
                        Statics.field2747 = new class60(Statics.field2954, Statics.field2952);
                    }
                    if (Statics.field2955.method3334(Statics.field2720, Statics.field2953, Statics.field2747, 22050)) {
                        Statics.field2955.method3366();
                        Statics.field2955.method3332(Statics.field1389);
                        Statics.field2955.method3336(Statics.field2720, Statics.field183);
                        class183.field2958 = 0;
                        Statics.field2720 = null;
                        Statics.field2747 = null;
                        Statics.field2956 = null;
                        var1 = true;
                        break label319;
                    }
                }
            } catch (Exception var45) {
                var45.printStackTrace();
                Statics.field2955.method3406();
                class183.field2958 = 0;
                Statics.field2720 = null;
                Statics.field2747 = null;
                Statics.field2956 = null;
            }
            var1 = false;
        }
        if (var1 && field528 && Statics.field1071 != null) {
            Statics.field1071.method1160();
        }
        if (field296 == 10 || field296 == 20 || field296 == 30) {
            if (field502 != 0L && class115.method2249() > field502) {
                int var4 = method2039();
                field502 = 0L;
                if (var4 >= 2) {
                    field383 = true;
                } else {
                    field383 = false;
                }
                method845();
                if (field296 >= 25) {
                    field330.method2549(179);
                    field330.method2301(method2039());
                    field330.method2404(Statics.field2191);
                    field330.method2404(Statics.field1567);
                }
                field2211 = true;
            } else if (field2214) {
                method3653();
            }
        }
        Dimension var5 = this.method2812();
        if (Statics.field776 != var5.width || Statics.field1778 != var5.height || field2213) {
            method845();
            field502 = class115.method2249() + 500L;
            field2213 = false;
        }
        boolean var6 = false;
        if (field2211) {
            field2211 = false;
            var6 = true;
            for (int var7 = 0; var7 < 100; var7++) {
                field494[var7] = true;
            }
        }
        if (var6) {
            method3617();
        }
        if (field296 == 0) {
            int var8 = class32.field725;
            String var9 = class32.field724;
            Color var10 = null;
            try {
                Graphics var11 = Statics.field2040.getGraphics();
                if (Statics.field709 == null) {
                    Statics.field709 = new Font("Helvetica", 1, 13);
                    Statics.field2071 = Statics.field2040.getFontMetrics(Statics.field709);
                }
                if (var6) {
                    var11.setColor(Color.black);
                    var11.fillRect(0, 0, Statics.field2191, Statics.field1567);
                }
                if (var10 == null) {
                    var10 = new Color(140, 17, 17);
                }
                try {
                    if (Statics.field873 == null) {
                        Statics.field873 = Statics.field2040.createImage(304, 34);
                    }
                    Graphics var12 = Statics.field873.getGraphics();
                    var12.setColor(var10);
                    var12.drawRect(0, 0, 303, 33);
                    var12.fillRect(2, 2, var8 * 3, 30);
                    var12.setColor(Color.black);
                    var12.drawRect(1, 1, 301, 31);
                    var12.fillRect(var8 * 3 + 2, 2, 300 - var8 * 3, 30);
                    var12.setFont(Statics.field709);
                    var12.setColor(Color.white);
                    var12.drawString(var9, (304 - Statics.field2071.stringWidth(var9)) / 2, 22);
                    var11.drawImage(Statics.field873, Statics.field2191 / 2 - 152, Statics.field1567 / 2 - 18, (ImageObserver) null);
                } catch (Exception var41) {
                    int var14 = Statics.field2191 / 2 - 152;
                    int var15 = Statics.field1567 / 2 - 18;
                    var11.setColor(var10);
                    var11.drawRect(var14, var15, 303, 33);
                    var11.fillRect(var14 + 2, var15 + 2, var8 * 3, 30);
                    var11.setColor(Color.black);
                    var11.drawRect(var14 + 1, var15 + 1, 301, 31);
                    var11.fillRect(var8 * 3 + var14 + 2, var15 + 2, 300 - var8 * 3, 30);
                    var11.setFont(Statics.field709);
                    var11.setColor(Color.white);
                    var11.drawString(var9, var14 + (304 - Statics.field2071.stringWidth(var9)) / 2, var15 + 22);
                }
            } catch (Exception var42) {
                Statics.field2040.repaint();
            }
        } else if (field296 == 5) {
            class32.method2662(Statics.field29, Statics.field5, Statics.field693, var6);
        } else if (field296 == 10 || field296 == 11) {
            class32.method2662(Statics.field29, Statics.field5, Statics.field693, var6);
        } else if (field296 == 20) {
            class32.method2662(Statics.field29, Statics.field5, Statics.field693, var6);
        } else if (field296 == 25) {
            if (field346 == 1) {
                if (field373 > field435) {
                    field435 = field373;
                }
                int var17 = (field435 * 50 - field373 * 50) / field435;
                method127(class157.field2325 + class2.field23 + class2.field26 + var17 + "%" + class2.field19, false);
            } else if (field346 == 2) {
                if (field344 > field345) {
                    field345 = field344;
                }
                int var18 = (field345 * 50 - field344 * 50) / field345 + 50;
                method127(class157.field2325 + class2.field23 + class2.field26 + var18 + "%" + class2.field19, false);
            } else {
                method127(class157.field2325, false);
            }
        } else if (field296 == 30) {
            if (field449 != -1) {
                Statics.method737(field449);
            }
            for (int var19 = 0; var19 < field492; var19++) {
                if (field494[var19]) {
                    field498[var19] = true;
                }
                field496[var19] = field494[var19];
                field494[var19] = false;
            }
            field493 = field395;
            field290 = -1;
            field316 = -1;
            Statics.field2182 = null;
            if (field449 != -1) {
                field492 = 0;
                method1940(field449, 0, 0, Statics.field2191, Statics.field1567, 0, 0, -1);
            }
            class80.method1667();
            if (field309) {
                method3626();
            } else if (field290 != -1) {
                method227(field290, field316);
            }
            if (field514 == 3) {
                for (int var20 = 0; var20 < field492; var20++) {
                    if (field496[var20]) {
                        class80.method1716(field497[var20], field457[var20], field499[var20], field500[var20], 16711935, 128);
                    } else if (field498[var20]) {
                        class80.method1716(field497[var20], field457[var20], field499[var20], field500[var20], 16711680, 128);
                    }
                }
            }
            int var21 = Statics.field1387;
            int var22 = Statics.field2250.field840;
            int var23 = Statics.field2250.field849;
            int var24 = field363;
            for (class24 var25 = (class24) class24.field616.method3528(); var25 != null; var25 = (class24) class24.field616.method3527()) {
                if (var25.field610 != -1 || var25.field620 != null) {
                    int var26 = 0;
                    if (var22 > var25.field611) {
                        var26 += var22 - var25.field611;
                    } else if (var22 < var25.field603) {
                        var26 += var25.field603 - var22;
                    }
                    if (var23 > var25.field608) {
                        var26 += var23 - var25.field608;
                    } else if (var23 < var25.field606) {
                        var26 += var25.field606 - var23;
                    }
                    if (var26 - 64 > var25.field609 || field503 == 0 || var25.field604 != var21) {
                        if (var25.field605 != null) {
                            Statics.field253.method1122(var25.field605);
                            var25.field605 = null;
                        }
                        if (var25.field607 != null) {
                            Statics.field253.method1122(var25.field607);
                            var25.field607 = null;
                        }
                    } else {
                        var26 -= 64;
                        if (var26 < 0) {
                            var26 = 0;
                        }
                        int var27 = field503 * (var25.field609 - var26) / var25.field609;
                        class59 var10000;
                        if (var25.field605 != null) {
                            var25.field605.method1268(var27);
                        } else if (var25.field610 >= 0) {
                            var10000 = (class59) null;
                            class59 var28 = class59.method1210(Statics.field741, var25.field610, 0);
                            if (var28 != null) {
                                class63 var29 = var28.method1215().method1243(Statics.field629);
                                class65 var30 = class65.method1366(var29, 100, var27);
                                var30.method1267(-1);
                                Statics.field253.method1137(var30);
                                var25.field605 = var30;
                            }
                        }
                        if (var25.field607 != null) {
                            var25.field607.method1268(var27);
                            if (!var25.field607.method3609()) {
                                var25.field607 = null;
                            }
                        } else if (var25.field620 != null && (var25.field613 -= var24) <= 0) {
                            int var31 = (int) (Math.random() * (double) var25.field620.length);
                            var10000 = (class59) null;
                            class59 var32 = class59.method1210(Statics.field741, var25.field620[var31], 0);
                            if (var32 != null) {
                                class63 var33 = var32.method1215().method1243(Statics.field629);
                                class65 var34 = class65.method1366(var33, 100, var27);
                                var34.method1267(0);
                                Statics.field253.method1137(var34);
                                var25.field607 = var34;
                                var25.field613 = var25.field612 + (int) (Math.random() * (double) (var25.field615 - var25.field612));
                            }
                        }
                    }
                }
            }
            field363 = 0;
        } else if (field296 == 40) {
            method127(class157.field2326 + class2.field23 + class157.field2538, false);
        } else if (field296 == 45) {
            method127(class157.field2471, false);
        }
        if (field296 == 30 && field514 == 0 && !var6) {
            try {
                Graphics var35 = Statics.field2040.getGraphics();
                for (int var36 = 0; var36 < field492; var36++) {
                    if (field498[var36]) {
                        Statics.field1386.method1508(var35, field497[var36], field457[var36], field499[var36], field500[var36]);
                        field498[var36] = false;
                    }
                }
            } catch (Exception var44) {
                Statics.field2040.repaint();
            }
        } else if (field296 > 0) {
            try {
                Graphics var38 = Statics.field2040.getGraphics();
                Statics.field1386.method1518(var38, 0, 0);
                for (int var39 = 0; var39 < field492; var39++) {
                    field498[var39] = false;
                }
            } catch (Exception var43) {
                Statics.field2040.repaint();
            }
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method292() {
        if (Statics.field64.method206()) {
            Statics.field64.method210();
        }
        if (Statics.field2913 != null) {
            Statics.field2913.field204 = false;
        }
        Statics.field2913 = null;
        if (Statics.field3116 != null) {
            Statics.field3116.method2796();
            Statics.field3116 = null;
        }
        if (class137.field2114 != null) {
            class137 var1 = class137.field2114;
            synchronized (class137.field2114) {
                class137.field2114 = null;
            }
        }
        if (class140.field2165 != null) {
            class140 var3 = class140.field2165;
            synchronized (class140.field2165) {
                class140.field2165 = null;
            }
        }
        Statics.field2999 = null;
        if (Statics.field1071 != null) {
            Statics.field1071.method1161();
        }
        if (Statics.field1404 != null) {
            Statics.field1404.method1161();
        }
        class171.method1933();
        Object var5 = class170.field2717;
        synchronized (class170.field2717) {
            if (class170.field2719 != 0) {
                class170.field2719 = 1;
                try {
                    class170.field2717.wait();
                } catch (InterruptedException var10) {
                }
            }
        }
        try {
            class149.field2244.method3840();
            for (int var8 = 0; var8 < Statics.field2240; var8++) {
                Statics.field2056[var8].method3840();
            }
            class149.field2241.method3840();
            class149.field2242.method3840();
        } catch (Exception var13) {
        }
    }

    @ObfuscatedName("client.r(II)V")
    public static void method553(int arg0) {
        if (field296 == arg0) {
            return;
        }
        if (field296 == 0) {
            class144.method2035();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field321 = 0;
            field571 = 0;
            field323 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2912 != null) {
            Statics.field2912.method2796();
            Statics.field2912 = null;
        }
        if (field296 == 25) {
            field346 = 0;
            field373 = 0;
            field435 = 1;
            field344 = 0;
            field345 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method650(Statics.field2040, Statics.field1641, Statics.field2596, true, 0);
        } else if (arg0 == 20) {
            class32.method650(Statics.field2040, Statics.field1641, Statics.field2596, true, field296 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method650(Statics.field2040, Statics.field1641, Statics.field2596, false, 4);
        } else {
            class32.method651();
        }
        field296 = arg0;
    }

    @ObfuscatedName("client.b(I)V")
    public void method382() {
        if (field296 != 1000) {
            boolean var1 = class171.method2545();
            if (!var1) {
                this.method239();
            }
        }
    }

    @ObfuscatedName("client.q(I)V")
    public void method239() {
        if (class171.field2739 >= 4) {
            this.method2813("js5crc");
            field296 = 1000;
            return;
        }
        if (class171.field2740 >= 4) {
            if (field296 <= 5) {
                this.method2813("js5io");
                field296 = 1000;
                return;
            }
            field530 = 3000;
            class171.field2740 = 3;
        }
        if (--field530 + 1 > 0) {
            return;
        }
        try {
            if (field318 == 0) {
                Statics.field400 = Statics.field649.method2667(Statics.field2180, Statics.field573);
                field318++;
            }
            if (field318 == 1) {
                if (Statics.field400.field2223 == 2) {
                    this.method241(-1);
                    return;
                }
                if (Statics.field400.field2223 == 1) {
                    field318++;
                }
            }
            if (field318 == 2) {
                Statics.field1202 = new class143((Socket) Statics.field400.field2224, Statics.field649);
                class119 var1 = new class119(5);
                var1.method2301(15);
                var1.method2304(108);
                Statics.field1202.method2780(var1.field1996, 0, 5);
                field318++;
                Statics.field2029 = class115.method2249();
            }
            if (field318 == 3) {
                if (field296 <= 5 || Statics.field1202.method2788() > 0) {
                    int var2 = Statics.field1202.method2777();
                    if (var2 != 0) {
                        this.method241(var2);
                        return;
                    }
                    field318++;
                } else if (class115.method2249() - Statics.field2029 > 30000L) {
                    this.method241(-2);
                    return;
                }
            }
            if (field318 == 4) {
                class171.method868(Statics.field1202, field296 > 20);
                Statics.field400 = null;
                Statics.field1202 = null;
                field318 = 0;
                field437 = 0;
            }
        } catch (IOException var4) {
            this.method241(-3);
        }
    }

    @ObfuscatedName("client.u(II)V")
    public void method241(int arg0) {
        Statics.field400 = null;
        Statics.field1202 = null;
        field318 = 0;
        if (Statics.field573 == Statics.field3153) {
            Statics.field573 = Statics.field112;
        } else {
            Statics.field573 = Statics.field3153;
        }
        field437++;
        if (field437 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field296 <= 5) {
                this.method2813("js5connect_full");
                field296 = 1000;
            } else {
                field530 = 3000;
            }
        } else if (field437 >= 2 && arg0 == 6) {
            this.method2813("js5connect_outofdate");
            field296 = 1000;
        } else if (field437 >= 4) {
            if (field296 <= 5) {
                this.method2813("js5connect");
                field296 = 1000;
            } else {
                field530 = 3000;
            }
        }
    }

    @ObfuscatedName("ec.g(I)V")
    public static void method2909() {
        if (field404 == 0) {
            Statics.field1907 = new class86(4, 104, 104, class6.field94);
            for (int var0 = 0; var0 < 4; var0++) {
                field347[var0] = new class108(104, 104);
            }
            Statics.field1003 = new class79(512, 512);
            class32.field724 = class157.field2328;
            class32.field725 = 5;
            field404 = 20;
        } else if (field404 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class91.field1588[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class86.method1795(var1, 500, 800, 512, 334);
            class32.field724 = class157.field2329;
            class32.field725 = 10;
            field404 = 30;
        } else if (field404 == 30) {
            Statics.field169 = method1059(0, false, true, true);
            Statics.field1063 = method1059(1, false, true, true);
            Statics.field1979 = method1059(2, true, false, true);
            Statics.field1397 = method1059(3, false, true, true);
            Statics.field741 = method1059(4, false, true, true);
            Statics.field624 = method1059(5, true, true, true);
            Statics.field2140 = method1059(6, true, true, false);
            Statics.field758 = method1059(7, false, true, true);
            Statics.field2596 = method1059(8, false, true, true);
            Statics.field1916 = method1059(9, false, true, true);
            Statics.field1641 = method1059(10, false, true, true);
            Statics.field1670 = method1059(11, false, true, true);
            Statics.field2650 = method1059(12, false, true, true);
            Statics.field2959 = method1059(13, true, false, true);
            Statics.field2653 = method1059(14, false, true, false);
            Statics.field14 = method1059(15, false, true, true);
            class32.field724 = class157.field2330;
            class32.field725 = 20;
            field404 = 40;
        } else if (field404 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field169.method3078() * 4 / 100;
            int var8 = var7 + Statics.field1063.method3078() * 4 / 100;
            int var9 = var8 + Statics.field1979.method3078() * 2 / 100;
            int var10 = var9 + Statics.field1397.method3078() * 2 / 100;
            int var11 = var10 + Statics.field741.method3078() * 6 / 100;
            int var12 = var11 + Statics.field624.method3078() * 4 / 100;
            int var13 = var12 + Statics.field2140.method3078() * 2 / 100;
            int var14 = var13 + Statics.field758.method3078() * 60 / 100;
            int var15 = var14 + Statics.field2596.method3078() * 2 / 100;
            int var16 = var15 + Statics.field1916.method3078() * 2 / 100;
            int var17 = var16 + Statics.field1641.method3078() * 2 / 100;
            int var18 = var17 + Statics.field1670.method3078() * 2 / 100;
            int var19 = var18 + Statics.field2650.method3078() * 2 / 100;
            int var20 = var19 + Statics.field2959.method3078() * 2 / 100;
            int var21 = var20 + Statics.field2653.method3078() * 2 / 100;
            int var22 = var21 + Statics.field14.method3078() * 2 / 100;
            if (var22 == 100) {
                class32.field724 = class157.field2332;
                class32.field725 = 30;
                field404 = 45;
            } else {
                if (var22 != 0) {
                    class32.field724 = class157.field2490 + var22 + "%";
                }
                class32.field725 = 30;
            }
        } else if (field404 == 45) {
            boolean var23 = !field458;
            Statics.field1781 = 22050;
            Statics.field1192 = var23;
            Statics.field1197 = 2;
            class184 var24 = new class184();
            var24.method3424(9, 128);
            Statics.field1071 = class57.method2773(Statics.field649, Statics.field2040, 0, 22050);
            Statics.field1071.method1164(var24);
            class183.method2252(Statics.field14, Statics.field2653, Statics.field741, var24);
            Statics.field1404 = class57.method2773(Statics.field649, Statics.field2040, 1, 2048);
            Statics.field253 = new class56();
            Statics.field1404.method1164(Statics.field253);
            Statics.field629 = new class75(22050, Statics.field1781);
            class32.field724 = class157.field2333;
            class32.field725 = 35;
            field404 = 50;
        } else if (field404 == 50) {
            int var25 = 0;
            if (Statics.field5 == null) {
                class168 var26 = Statics.field2596;
                class168 var27 = Statics.field2959;
                int var28 = var26.method3039("p11_full");
                int var29 = var26.method3029(var28, "");
                class224 var30 = class77.method1540(var26, var27, var28, var29);
                Statics.field5 = var30;
            } else {
                var25++;
            }
            if (Statics.field693 == null) {
                class168 var31 = Statics.field2596;
                class168 var32 = Statics.field2959;
                int var33 = var31.method3039("p12_full");
                int var34 = var31.method3029(var33, "");
                class224 var35 = class77.method1540(var31, var32, var33, var34);
                Statics.field693 = var35;
            } else {
                var25++;
            }
            if (Statics.field29 == null) {
                class168 var36 = Statics.field2596;
                class168 var37 = Statics.field2959;
                int var38 = var36.method3039("b12_full");
                int var39 = var36.method3029(var38, "");
                class224 var40 = class77.method1540(var36, var37, var38, var39);
                Statics.field29 = var40;
            } else {
                var25++;
            }
            if (var25 < 3) {
                class32.field724 = class157.field2334 + var25 * 100 / 3 + "%";
                class32.field725 = 40;
            } else {
                Statics.field1694 = new class160(true);
                class32.field724 = class157.field2335;
                class32.field725 = 40;
                field404 = 60;
            }
        } else if (field404 == 60) {
            class168 var41 = Statics.field1641;
            class168 var42 = Statics.field2596;
            int var43 = 0;
            if (var41.method3065("title.jpg", "")) {
                var43++;
            }
            if (var42.method3065("logo", "")) {
                var43++;
            }
            if (var42.method3065("logo_deadman_mode", "")) {
                var43++;
            }
            if (var42.method3065("titlebox", "")) {
                var43++;
            }
            if (var42.method3065("titlebutton", "")) {
                var43++;
            }
            if (var42.method3065("runes", "")) {
                var43++;
            }
            if (var42.method3065("title_mute", "")) {
                var43++;
            }
            if (var42.method3024("options_radio_buttons,0")) {
                var43++;
            }
            if (var42.method3024("options_radio_buttons,2")) {
                var43++;
            }
            var42.method3065("sl_back", "");
            var42.method3065("sl_flags", "");
            var42.method3065("sl_arrows", "");
            var42.method3065("sl_stars", "");
            var42.method3065("sl_button", "");
            int var46 = class32.method2906();
            if (var43 < var46) {
                class32.field724 = class157.field2401 + var43 * 100 / var46 + "%";
                class32.field725 = 50;
            } else {
                class32.field724 = class157.field2337;
                class32.field725 = 50;
                method553(5);
                field404 = 70;
            }
        } else if (field404 == 70) {
            if (Statics.field1979.method3069()) {
                class168 var47 = Statics.field1979;
                Statics.field1059 = var47;
                class168 var48 = Statics.field1979;
                Statics.field971 = var48;
                class168 var49 = Statics.field1979;
                class168 var50 = Statics.field758;
                Statics.field1031 = var49;
                Statics.field1025 = var50;
                Statics.field1033 = Statics.field1031.method3015(3);
                class168 var51 = Statics.field1979;
                class168 var52 = Statics.field758;
                boolean var53 = field458;
                Statics.field949 = var51;
                Statics.field941 = var52;
                class41.field942 = var53;
                class40.method160(Statics.field1979, Statics.field758);
                class168 var54 = Statics.field1979;
                class168 var55 = Statics.field758;
                boolean var56 = field292;
                class224 var57 = Statics.field5;
                Statics.field1130 = var54;
                Statics.field1113 = var55;
                Statics.field2715 = var56;
                Statics.field1116 = Statics.field1130.method3015(10);
                Statics.field581 = var57;
                class168 var58 = Statics.field1979;
                class168 var59 = Statics.field169;
                class168 var60 = Statics.field1063;
                Statics.field990 = var58;
                Statics.field1002 = var59;
                Statics.field2047 = var60;
                class168 var61 = Statics.field1979;
                class168 var62 = Statics.field758;
                Statics.field1017 = var61;
                Statics.field1008 = var62;
                class168 var63 = Statics.field1979;
                Statics.field1074 = var63;
                class53.method2907(Statics.field1979);
                class173.method1564(Statics.field1397, Statics.field758, Statics.field2596, Statics.field2959);
                class51.method1032(Statics.field1979);
                class49.method692(Statics.field1979);
                class46.method1557(Statics.field1979);
                class168 var64 = Statics.field1979;
                Statics.field1089 = var64;
                Statics.field64 = new class20();
                class32.field724 = class157.field2379;
                class32.field725 = 60;
                field404 = 80;
            } else {
                class32.field724 = class157.field2338 + Statics.field1979.method3084() + "%";
                class32.field725 = 60;
            }
        } else if (field404 == 80) {
            int var65 = 0;
            if (Statics.field11 == null) {
                class168 var66 = Statics.field2596;
                int var67 = var66.method3039("compass");
                int var68 = var66.method3029(var67, "");
                class79 var69 = class77.method682(var66, var67, var68);
                Statics.field11 = var69;
            } else {
                var65++;
            }
            if (Statics.field495 == null) {
                class168 var70 = Statics.field2596;
                int var71 = var70.method3039("mapedge");
                int var72 = var70.method3029(var71, "");
                class79 var73 = class77.method682(var70, var71, var72);
                Statics.field495 = var73;
            } else {
                var65++;
            }
            if (Statics.field614 == null) {
                Statics.field614 = class77.method2929(Statics.field2596, "mapscene", "");
            } else {
                var65++;
            }
            if (Statics.field967 == null) {
                Statics.field967 = class77.method2617(Statics.field2596, "mapfunction", "");
            } else {
                var65++;
            }
            if (Statics.field266 == null) {
                Statics.field266 = class77.method2617(Statics.field2596, "hitmarks", "");
            } else {
                var65++;
            }
            if (Statics.field696 == null) {
                Statics.field696 = class77.method2617(Statics.field2596, "headicons_pk", "");
            } else {
                var65++;
            }
            if (Statics.field75 == null) {
                Statics.field75 = class77.method2617(Statics.field2596, "headicons_prayer", "");
            } else {
                var65++;
            }
            if (Statics.field1379 == null) {
                Statics.field1379 = class77.method2617(Statics.field2596, "headicons_hint", "");
            } else {
                var65++;
            }
            if (Statics.field365 == null) {
                Statics.field365 = class77.method2617(Statics.field2596, "mapmarker", "");
            } else {
                var65++;
            }
            if (Statics.field406 == null) {
                Statics.field406 = class77.method2617(Statics.field2596, "cross", "");
            } else {
                var65++;
            }
            if (Statics.field1006 == null) {
                Statics.field1006 = class77.method2617(Statics.field2596, "mapdots", "");
            } else {
                var65++;
            }
            if (Statics.field105 == null) {
                Statics.field105 = class77.method2929(Statics.field2596, "scrollbar", "");
            } else {
                var65++;
            }
            if (Statics.field3160 == null) {
                Statics.field3160 = class77.method2929(Statics.field2596, "mod_icons", "");
            } else {
                var65++;
            }
            if (var65 < 13) {
                class32.field724 = class157.field2340 + var65 * 100 / 13 + "%";
                class32.field725 = 70;
            } else {
                Statics.field3179 = Statics.field3160;
                Statics.field495.method1625();
                int var74 = (int) (Math.random() * 21.0D) - 10;
                int var75 = (int) (Math.random() * 21.0D) - 10;
                int var76 = (int) (Math.random() * 21.0D) - 10;
                int var77 = (int) (Math.random() * 41.0D) - 20;
                for (int var78 = 0; var78 < Statics.field967.length; var78++) {
                    Statics.field967[var78].method1653(var74 + var77, var75 + var77, var76 + var77);
                }
                Statics.field614[0].method1728(var74 + var77, var75 + var77, var76 + var77);
                class32.field724 = class157.field2341;
                class32.field725 = 70;
                field404 = 90;
            }
        } else if (field404 == 90) {
            if (Statics.field1916.method3069()) {
                class95 var79 = new class95(Statics.field1916, Statics.field2596, 20, 0.8D, field458 ? 64 : 128);
                class91.method1982(var79);
                class91.method1949(0.8D);
                class32.field724 = class157.field2343;
                class32.field725 = 90;
                field404 = 110;
            } else {
                class32.field724 = class157.field2380 + Statics.field1916.method3084() + "%";
                class32.field725 = 90;
            }
        } else if (field404 == 110) {
            Statics.field2913 = new class14();
            Statics.field649.method2689(Statics.field2913, 10);
            class32.field724 = class157.field2344;
            class32.field725 = 94;
            field404 = 120;
        } else if (field404 == 120) {
            if (Statics.field1641.method3065("huffman", "")) {
                class113 var80 = new class113(Statics.field1641.method3052("huffman", ""));
                class222.method3322(var80);
                class32.field724 = class157.field2346;
                class32.field725 = 96;
                field404 = 130;
            } else {
                class32.field724 = class157.field2446 + "%";
                class32.field725 = 96;
            }
        } else if (field404 == 130) {
            if (!Statics.field1397.method3069()) {
                class32.field724 = class157.field2347 + Statics.field1397.method3084() * 4 / 5 + "%";
                class32.field725 = 100;
            } else if (!Statics.field2650.method3069()) {
                class32.field724 = class157.field2347 + (80 + Statics.field2650.method3084() / 6) + "%";
                class32.field725 = 100;
            } else if (Statics.field2959.method3069()) {
                class32.field724 = class157.field2460;
                class32.field725 = 100;
                field404 = 140;
            } else {
                class32.field724 = class157.field2347 + (96 + Statics.field2959.method3084() / 20) + "%";
                class32.field725 = 100;
            }
        } else if (field404 == 140) {
            method553(10);
        }
    }

    @ObfuscatedName("aj.y(IZZZI)Lfe;")
    public static class168 method1059(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class134 var4 = null;
        if (class149.field2244 != null) {
            var4 = new class134(arg0, class149.field2244, Statics.field2056[arg0], 1000000);
        }
        return new class168(var4, Statics.field2035, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("eu.s(I)V")
    public static final void method2726() {
        try {
            if (field321 == 0) {
                if (Statics.field3116 != null) {
                    Statics.field3116.method2796();
                    Statics.field3116 = null;
                }
                Statics.field2263 = null;
                field305 = false;
                field571 = 0;
                field321 = 1;
            }
            if (field321 == 1) {
                if (Statics.field2263 == null) {
                    Statics.field2263 = Statics.field649.method2667(Statics.field2180, Statics.field573);
                }
                if (Statics.field2263.field2223 == 2) {
                    throw new IOException();
                }
                if (Statics.field2263.field2223 == 1) {
                    Statics.field3116 = new class143((Socket) Statics.field2263.field2224, Statics.field649);
                    Statics.field2263 = null;
                    field321 = 2;
                }
            }
            if (field321 == 2) {
                field330.field1999 = 0;
                field330.method2301(14);
                Statics.field3116.method2780(field330.field1996, 0, 1);
                field294.field1999 = 0;
                field321 = 3;
            }
            if (field321 == 3) {
                if (Statics.field1071 != null) {
                    Statics.field1071.method1167();
                }
                if (Statics.field1404 != null) {
                    Statics.field1404.method1167();
                }
                int var0 = Statics.field3116.method2777();
                if (Statics.field1071 != null) {
                    Statics.field1071.method1167();
                }
                if (Statics.field1404 != null) {
                    Statics.field1404.method1167();
                }
                if (var0 != 0) {
                    method193(var0);
                    return;
                }
                field294.field1999 = 0;
                field321 = 5;
            }
            if (field321 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field330.field1999 = 0;
                field330.method2301(1);
                field330.method2301(class32.field734.method558());
                field330.method2304(var1[0]);
                field330.method2304(var1[1]);
                field330.method2304(var1[2]);
                field330.method2304(var1[3]);
                switch(class32.field734.field2607) {
                    case 0:
                    case 2:
                        field330.method2320(Statics.field22);
                        field330.field1999 += 5;
                        break;
                    case 1:
                        field330.method2304((Integer) Statics.field170.field146.get(class163.method176(class32.field732)));
                        field330.field1999 += 4;
                        break;
                    case 3:
                        field330.field1999 += 8;
                }
                field330.method2307(class32.field719);
                field330.method2487(class5.field74, class5.field77);
                field331.field1999 = 0;
                if (field296 == 40) {
                    field331.method2301(18);
                } else {
                    field331.method2301(16);
                }
                field331.method2404(0);
                int var2 = field331.field1999;
                field331.method2304(108);
                field331.method2310(field330.field1996, 0, field330.field1999);
                int var3 = field331.field1999;
                field331.method2307(class32.field732);
                field331.method2301((field383 ? 1 : 0) << 1 | (field458 ? 1 : 0));
                field331.method2404(Statics.field2191);
                field331.method2404(Statics.field1567);
                class122 var4 = field331;
                byte[] var5 = new byte[24];
                try {
                    class149.field2242.method3833(0L);
                    class149.field2242.method3857(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var44) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2310(var5, 0, 24);
                field331.method2307(Statics.field1640);
                field331.method2304(Statics.field625);
                class119 var9 = new class119(Statics.field1694.method2920());
                Statics.field1694.method2919(var9);
                field331.method2310(var9.field1996, 0, var9.field1996.length);
                field331.method2301(Statics.field2670);
                field331.method2304(Statics.field169.field2689);
                field331.method2304(Statics.field1063.field2689);
                field331.method2304(Statics.field1979.field2689);
                field331.method2304(Statics.field1397.field2689);
                field331.method2304(Statics.field741.field2689);
                field331.method2304(Statics.field624.field2689);
                field331.method2304(Statics.field2140.field2689);
                field331.method2304(Statics.field758.field2689);
                field331.method2304(Statics.field2596.field2689);
                field331.method2304(Statics.field1916.field2689);
                field331.method2304(Statics.field1641.field2689);
                field331.method2304(Statics.field1670.field2689);
                field331.method2304(Statics.field2650.field2689);
                field331.method2304(Statics.field2959.field2689);
                field331.method2304(Statics.field2653.field2689);
                field331.method2304(Statics.field14.field2689);
                field331.method2308(var1, var3, field331.field1999);
                field331.method2377(field331.field1999 - var2);
                Statics.field3116.method2780(field331.field1996, 0, field331.field1999);
                field330.method2548(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field294.method2548(var1);
                field321 = 6;
            }
            if (field321 == 6 && Statics.field3116.method2788() > 0) {
                int var11 = Statics.field3116.method2777();
                if (var11 == 21 && field296 == 20) {
                    field321 = 7;
                } else if (var11 == 2) {
                    field321 = 9;
                } else if (var11 == 15 && field296 == 40) {
                    field333 = -1;
                    field321 = 13;
                } else if (var11 == 23 && field323 < 1) {
                    field323++;
                    field321 = 0;
                } else if (var11 == 29) {
                    field321 = 11;
                } else {
                    method193(var11);
                    return;
                }
            }
            if (field321 == 7 && Statics.field3116.method2788() > 0) {
                field324 = (Statics.field3116.method2777() + 3) * 60;
                field321 = 8;
            }
            if (field321 == 8) {
                field571 = 0;
                class32.method33(class157.field2352, class157.field2353, field324 / 60 + class157.field2354);
                if (--field324 <= 0) {
                    field321 = 0;
                }
            } else {
                if (field321 == 9 && Statics.field3116.method2788() >= 13) {
                    boolean var12 = Statics.field3116.method2777() == 1;
                    Statics.field3116.method2779(field294.field1996, 0, 4);
                    field294.field1999 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field294.method2550() << 24;
                        int var15 = var14 | field294.method2550() << 16;
                        int var16 = var15 | field294.method2550() << 8;
                        int var17 = var16 | field294.method2550();
                        int var18 = class163.method176(class32.field732);
                        if (Statics.field170.field146.size() >= 10 && !Statics.field170.field146.containsKey(var18)) {
                            Iterator var19 = Statics.field170.field146.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field170.field146.put(var18, var17);
                        class9.method36();
                    }
                    field456 = Statics.field3116.method2777();
                    field521 = Statics.field3116.method2777() == 1;
                    field478 = Statics.field3116.method2777();
                    field478 <<= 0x8;
                    field478 += Statics.field3116.method2777();
                    field413 = Statics.field3116.method2777();
                    Statics.field3116.method2779(field294.field1996, 0, 1);
                    field294.field1999 = 0;
                    field334 = field294.method2550();
                    Statics.field3116.method2779(field294.field1996, 0, 2);
                    field294.field1999 = 0;
                    field333 = field294.method2318();
                    if (field413 == 1) {
                        try {
                            class132.method2632(Statics.field285, "zap");
                        } catch (Throwable var43) {
                        }
                    } else {
                        try {
                            class132.method2632(Statics.field285, "unzap");
                        } catch (Throwable var42) {
                        }
                    }
                    field321 = 10;
                }
                if (field321 != 10) {
                    if (field321 == 11 && Statics.field3116.method2788() >= 2) {
                        field294.field1999 = 0;
                        Statics.field3116.method2779(field294.field1996, 0, 2);
                        field294.field1999 = 0;
                        Statics.field2041 = field294.method2318();
                        field321 = 12;
                    }
                    if (field321 == 12 && Statics.field3116.method2788() >= Statics.field2041) {
                        field294.field1999 = 0;
                        Statics.field3116.method2779(field294.field1996, 0, Statics.field2041);
                        field294.field1999 = 0;
                        String var33 = field294.method2324();
                        String var34 = field294.method2324();
                        String var35 = field294.method2324();
                        class32.method33(var33, var34, var35);
                        method553(10);
                    }
                    if (field321 == 13) {
                        if (field333 == -1) {
                            if (Statics.field3116.method2788() < 2) {
                                return;
                            }
                            Statics.field3116.method2779(field294.field1996, 0, 2);
                            field294.field1999 = 0;
                            field333 = field294.method2318();
                        }
                        if (Statics.field3116.method2788() >= field333) {
                            Statics.field3116.method2779(field294.field1996, 0, field333);
                            field294.field1999 = 0;
                            int var36 = field333;
                            field330.field1999 = 0;
                            field294.field1999 = 0;
                            field334 = -1;
                            field337 = -1;
                            field547 = -1;
                            field555 = -1;
                            field333 = 0;
                            field335 = 0;
                            field291 = 0;
                            field431 = 0;
                            field309 = false;
                            field525 = 0;
                            field297 = 0;
                            for (int var37 = 0; var37 < 2048; var37++) {
                                field411[var37] = null;
                            }
                            Statics.field2250 = null;
                            for (int var38 = 0; var38 < field325.length; var38++) {
                                class35 var39 = field325[var38];
                                if (var39 != null) {
                                    var39.field836 = -1;
                                    var39.field837 = false;
                                }
                            }
                            class16.field226 = new class196(32);
                            method553(30);
                            for (int var40 = 0; var40 < 100; var40++) {
                                field494[var40] = true;
                            }
                            field330.method2549(179);
                            field330.method2301(method2039());
                            field330.method2404(Statics.field2191);
                            field330.method2404(Statics.field1567);
                            class33.method144(field294);
                            if (field294.field1999 != var36) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field571++;
                        if (field571 > 2000) {
                            if (field323 < 1) {
                                if (Statics.field573 == Statics.field3153) {
                                    Statics.field573 = Statics.field112;
                                } else {
                                    Statics.field573 = Statics.field3153;
                                }
                                field323++;
                                field321 = 0;
                            } else {
                                method193(-3);
                            }
                        }
                    }
                } else if (Statics.field3116.method2788() >= field333) {
                    field294.field1999 = 0;
                    Statics.field3116.method2779(field294.field1996, 0, field333);
                    field299 = -1L;
                    field446 = -1;
                    Statics.field2913.field206 = 0;
                    Statics.field1107 = true;
                    field303 = true;
                    field515 = -1L;
                    class211.method2818();
                    field330.field1999 = 0;
                    field294.field1999 = 0;
                    field334 = -1;
                    field337 = -1;
                    field547 = -1;
                    field555 = -1;
                    field335 = 0;
                    field291 = 0;
                    field340 = 0;
                    field352 = 0;
                    field431 = 0;
                    field309 = false;
                    class140.field2171 = 0;
                    class12.field175.clear();
                    class12.field173.method3519();
                    class12.field174.method3553();
                    class12.field177 = 0;
                    field302 = 0;
                    field409 = false;
                    field531 = 0;
                    field284 = (int) (Math.random() * 100.0D) - 50;
                    field353 = (int) (Math.random() * 110.0D) - 55;
                    field355 = (int) (Math.random() * 80.0D) - 40;
                    field523 = (int) (Math.random() * 120.0D) - 60;
                    field360 = (int) (Math.random() * 30.0D) - 20;
                    field375 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
                    field525 = 0;
                    field518 = -1;
                    field297 = 0;
                    field320 = 0;
                    field314 = class21.field580;
                    field358 = class21.field580;
                    field562 = 0;
                    class33.method2036();
                    for (int var22 = 0; var22 < 2048; var22++) {
                        field411[var22] = null;
                    }
                    for (int var23 = 0; var23 < 32768; var23++) {
                        field325[var23] = null;
                    }
                    field420 = -1;
                    field423.method3522();
                    field424.method3522();
                    for (int var24 = 0; var24 < 4; var24++) {
                        for (int var25 = 0; var25 < 104; var25++) {
                            for (int var26 = 0; var26 < 104; var26++) {
                                field421[var24][var25][var26] = null;
                            }
                        }
                    }
                    field410 = new class199();
                    field387 = 0;
                    field422 = 0;
                    field560 = 0;
                    for (int var27 = 0; var27 < Statics.field1167; var27++) {
                        class53 var28 = class53.method96(var27);
                        if (var28 != null) {
                            class176.field2905[var27] = 0;
                            class176.field2907[var27] = 0;
                        }
                    }
                    Statics.field64.method205();
                    field451 = -1;
                    if (field449 != -1) {
                        class173.method41(field449);
                    }
                    for (class4 var29 = (class4) field450.method3503(); var29 != null; var29 = (class4) field450.method3502()) {
                        method40(var29, true);
                    }
                    field449 = -1;
                    field450 = new class196(8);
                    field453 = null;
                    field309 = false;
                    field431 = 0;
                    field476.method3216((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
                    for (int var30 = 0; var30 < 8; var30++) {
                        field417[var30] = null;
                        field349[var30] = false;
                    }
                    class16.method2260();
                    field317 = true;
                    for (int var31 = 0; var31 < 100; var31++) {
                        field494[var31] = true;
                    }
                    field330.method2549(179);
                    field330.method2301(method2039());
                    field330.method2404(Statics.field2191);
                    field330.method2404(Statics.field1567);
                    field516 = null;
                    Statics.field164 = 0;
                    Statics.field2104 = null;
                    for (int var32 = 0; var32 < 8; var32++) {
                        field565[var32] = new class220();
                    }
                    Statics.field761 = null;
                    class33.method144(field294);
                    Statics.field2066 = -1;
                    method3088(false);
                    field334 = -1;
                }
            }
        } catch (IOException var45) {
            if (field323 < 1) {
                if (Statics.field573 == Statics.field3153) {
                    Statics.field573 = Statics.field112;
                } else {
                    Statics.field573 = Statics.field3153;
                }
                field323++;
                field321 = 0;
            } else {
                method193(-2);
            }
        }
    }

    @ObfuscatedName("z.d(II)V")
    public static void method193(int arg0) {
        if (arg0 == -3) {
            class32.method33(class157.field2438, class157.field2565, class157.field2511);
        } else if (arg0 == -2) {
            class32.method33(class157.field2376, class157.field2359, class157.field2360);
        } else if (arg0 == -1) {
            class32.method33(class157.field2361, class157.field2585, class157.field2389);
        } else if (arg0 == 3) {
            class32.field723 = 3;
        } else if (arg0 == 4) {
            class32.method33(class157.field2364, class157.field2595, class157.field2377);
        } else if (arg0 == 5) {
            class32.method33(class157.field2367, class157.field2368, class157.field2369);
        } else if (arg0 == 6) {
            class32.method33(class157.field2537, class157.field2371, class157.field2372);
        } else if (arg0 == 7) {
            class32.method33(class157.field2373, class157.field2374, class157.field2418);
        } else if (arg0 == 8) {
            class32.method33(class157.field2382, class157.field2587, class157.field2378);
        } else if (arg0 == 9) {
            class32.method33(class157.field2385, class157.field2441, class157.field2381);
        } else if (arg0 == 10) {
            class32.method33(class157.field2394, class157.field2383, class157.field2384);
        } else if (arg0 == 11) {
            class32.method33(class157.field2457, class157.field2447, class157.field2425);
        } else if (arg0 == 12) {
            class32.method33(class157.field2388, class157.field2370, class157.field2390);
        } else if (arg0 == 13) {
            class32.method33(class157.field2559, class157.field2392, class157.field2393);
        } else if (arg0 == 14) {
            class32.method33(class157.field2396, class157.field2428, class157.field2322);
        } else if (arg0 == 16) {
            class32.method33(class157.field2397, class157.field2398, class157.field2399);
        } else if (arg0 == 17) {
            class32.method33(class157.field2400, class157.field2391, class157.field2402);
        } else if (arg0 == 18) {
            class32.method33(class157.field2386, class157.field2567, class157.field2474);
        } else if (arg0 == 19) {
            class32.method33(class157.field2406, class157.field2467, class157.field2544);
        } else if (arg0 == 20) {
            class32.method33(class157.field2520, class157.field2410, class157.field2411);
        } else if (arg0 == 22) {
            class32.method33(class157.field2412, class157.field2387, class157.field2580);
        } else if (arg0 == 23) {
            class32.method33(class157.field2415, class157.field2506, class157.field2417);
        } else if (arg0 == 24) {
            class32.method33(class157.field2483, class157.field2419, class157.field2420);
        } else if (arg0 == 25) {
            class32.method33(class157.field2362, class157.field2462, class157.field2423);
        } else if (arg0 == 26) {
            class32.method33(class157.field2424, class157.field2525, class157.field2426);
        } else if (arg0 == 27) {
            class32.method33(class157.field2427, class157.field2416, class157.field2429);
        } else if (arg0 == 31) {
            class32.method33(class157.field2495, class157.field2437, class157.field2494);
        } else if (arg0 == 32) {
            class32.method33(class157.field2339, class157.field2440, class157.field2529);
        } else if (arg0 == 37) {
            class32.method33(class157.field2442, class157.field2443, class157.field2444);
        } else if (arg0 == 38) {
            class32.method33(class157.field2445, class157.field2522, class157.field2433);
        } else if (arg0 == 55) {
            class32.method33(class157.field2448, class157.field2449, class157.field2450);
        } else if (arg0 == 56) {
            class32.method33(class157.field2451, class157.field2452, class157.field2453);
            method553(11);
            return;
        } else if (arg0 == 57) {
            class32.method33(class157.field2454, class157.field2455, class157.field2571);
            method553(11);
            return;
        } else {
            class32.method33(class157.field2505, class157.field2458, class157.field2459);
        }
        method553(10);
    }

    @ObfuscatedName("ak.z(I)V")
    public static final void method645() {
        if (Statics.field3116 != null) {
            Statics.field3116.method2796();
            Statics.field3116 = null;
        }
        method188();
        Statics.field1907.method1760();
        for (int var0 = 0; var0 < 4; var0++) {
            field347[var0].method2209();
        }
        System.gc();
        class183.field2958 = 1;
        Statics.field2956 = null;
        Statics.field2044 = -1;
        Statics.field139 = -1;
        Statics.field1389 = 0;
        Statics.field183 = false;
        Statics.field63 = 2;
        field454 = -1;
        field528 = false;
        for (class24 var1 = (class24) class24.field616.method3528(); var1 != null; var1 = (class24) class24.field616.method3527()) {
            if (var1.field605 != null) {
                Statics.field253.method1122(var1.field605);
                var1.field605 = null;
            }
            if (var1.field607 != null) {
                Statics.field253.method1122(var1.field607);
                var1.field607 = null;
            }
        }
        class24.field616.method3522();
        method553(10);
    }

    @ObfuscatedName("z.p(B)V")
    public static final void method188() {
        class47.method2510();
        class42.method880();
        class45.field1027.method3475();
        class41.method2613();
        class40.method38();
        class52.method95();
        class43.field985.method3475();
        class43.field986.method3475();
        class44.method2022();
        class48.method564();
        class53.field1166.method3475();
        class179.field2919.method3475();
        class173.method2916();
        ((class95) Statics.field1577).method2027();
        class23.field591.method3475();
        Statics.field169.method3018();
        Statics.field1063.method3018();
        Statics.field1397.method3018();
        Statics.field741.method3018();
        Statics.field624.method3018();
        Statics.field2140.method3018();
        Statics.field758.method3018();
        Statics.field2596.method3018();
        Statics.field1916.method3018();
        Statics.field1641.method3018();
        Statics.field1670.method3018();
        Statics.field2650.method3018();
    }

    @ObfuscatedName("t.w(S)V")
    public static final void method567() {
        if (field340 > 0) {
            method645();
        } else {
            method553(40);
            Statics.field2912 = Statics.field3116;
            Statics.field3116 = null;
        }
    }

    @ObfuscatedName("hs.c(I)V")
    public static final void method3671() {
        for (int var0 = 0; var0 < field531; var0++) {
            int var10002 = field444[var0]--;
            if (field444[var0] >= -10) {
                class59 var2 = field402[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1210(Statics.field741, field532[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field444[var0] += var2.method1205();
                    field402[var0] = var2;
                }
                if (field444[var0] < 0) {
                    int var9;
                    if (field535[var0] == 0) {
                        var9 = field301;
                    } else {
                        int var3 = (field535[var0] & 0xFF) * 128;
                        int var4 = field535[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field2250.field840;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field535[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field2250.field849;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field444[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field503 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1215().method1243(Statics.field629);
                        class65 var11 = class65.method1366(var10, 100, var9);
                        var11.method1267(field533[var0] - 1);
                        Statics.field253.method1137(var11);
                    }
                    field444[var0] = -100;
                }
            } else {
                field531--;
                for (int var1 = var0; var1 < field531; var1++) {
                    field532[var1] = field532[var1 + 1];
                    field402[var1] = field402[var1 + 1];
                    field533[var1] = field533[var1 + 1];
                    field444[var1] = field444[var1 + 1];
                    field535[var1] = field535[var1 + 1];
                }
                var0--;
            }
        }
        if (!field528) {
            return;
        }
        boolean var12;
        if (class183.field2958 == 0) {
            var12 = Statics.field2955.method3338();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field526 != 0 && field454 != -1) {
                class183.method2247(Statics.field2140, field454, 0, field526, false);
            }
            field528 = false;
        }
    }

    @ObfuscatedName("at.x(Lal;IIIB)V")
    public static void method844(class43 arg0, int arg1, int arg2, int arg3) {
        if (field531 >= 50 || field503 == 0 || arg0.field996 == null || arg1 >= arg0.field996.length) {
            return;
        }
        int var4 = arg0.field996[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field532[field531] = var5;
        field533[field531] = var6;
        field444[field531] = 0;
        field402[field531] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field535[field531] = (var8 << 16) + (var9 << 8) + var7;
        field531++;
    }

    @ObfuscatedName("af.e(IIII)V")
    public static void method746(int arg0, int arg1, int arg2) {
        if (field301 == 0 || arg1 == 0 || field531 >= 50) {
            return;
        }
        field532[field531] = arg0;
        field533[field531] = arg1;
        field444[field531] = arg2;
        field402[field531] = null;
        field535[field531] = 0;
        field531++;
    }

    @ObfuscatedName("z.v(II)V")
    public static void method187(int arg0) {
        if (arg0 == -1 && !field528) {
            class183.method936();
        } else if (arg0 != -1 && field454 != arg0 && field526 != 0 && !field528) {
            class168 var1 = Statics.field2140;
            int var2 = field526;
            class183.field2958 = 1;
            Statics.field2956 = var1;
            Statics.field2044 = arg0;
            Statics.field139 = 0;
            Statics.field1389 = var2;
            Statics.field183 = false;
            Statics.field63 = 2;
        }
        field454 = arg0;
    }

    @ObfuscatedName("v.ab(I)V")
    public static final void method631() {
        int[] var0 = class33.field756;
        for (int var1 = 0; var1 < class33.field750; var1++) {
            class3 var2 = field411[var0[var1]];
            if (var2 != null && var2.field827 > 0) {
                var2.field827--;
                if (var2.field827 == 0) {
                    var2.field824 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field562; var3++) {
            int var4 = field327[var3];
            class35 var5 = field325[var4];
            if (var5 != null && var5.field827 > 0) {
                var5.field827--;
                if (var5.field827 == 0) {
                    var5.field824 = null;
                }
            }
        }
    }

    @ObfuscatedName("g.ak(I)V")
    public static final void method157() {
        int var0 = Statics.field136 * 128 + 64;
        int var1 = Statics.field1911 * 128 + 64;
        int var2 = method2205(var0, var1, Statics.field1387) - Statics.field1221;
        if (Statics.field2198 < var0) {
            Statics.field2198 += Statics.field3164 * (var0 - Statics.field2198) / 1000 + Statics.field1978;
            if (Statics.field2198 > var0) {
                Statics.field2198 = var0;
            }
        }
        if (Statics.field2198 > var0) {
            Statics.field2198 -= Statics.field3164 * (Statics.field2198 - var0) / 1000 + Statics.field1978;
            if (Statics.field2198 < var0) {
                Statics.field2198 = var0;
            }
        }
        if (Statics.field798 < var2) {
            Statics.field798 += Statics.field3164 * (var2 - Statics.field798) / 1000 + Statics.field1978;
            if (Statics.field798 > var2) {
                Statics.field798 = var2;
            }
        }
        if (Statics.field798 > var2) {
            Statics.field798 -= Statics.field3164 * (Statics.field798 - var2) / 1000 + Statics.field1978;
            if (Statics.field798 < var2) {
                Statics.field798 = var2;
            }
        }
        if (Statics.field2229 < var1) {
            Statics.field2229 += Statics.field3164 * (var1 - Statics.field2229) / 1000 + Statics.field1978;
            if (Statics.field2229 > var1) {
                Statics.field2229 = var1;
            }
        }
        if (Statics.field2229 > var1) {
            Statics.field2229 -= Statics.field3164 * (Statics.field2229 - var1) / 1000 + Statics.field1978;
            if (Statics.field2229 < var1) {
                Statics.field2229 = var1;
            }
        }
        int var3 = Statics.field1770 * 128 + 64;
        int var4 = Statics.field1103 * 128 + 64;
        int var5 = method2205(var3, var4, Statics.field1387) - Statics.field1884;
        int var6 = var3 - Statics.field2198;
        int var7 = var5 - Statics.field798;
        int var8 = var4 - Statics.field2229;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field557 < var10) {
            Statics.field557 += Statics.field234 * (var10 - Statics.field557) / 1000 + Statics.field598;
            if (Statics.field557 > var10) {
                Statics.field557 = var10;
            }
        }
        if (Statics.field557 > var10) {
            Statics.field557 -= Statics.field234 * (Statics.field557 - var10) / 1000 + Statics.field598;
            if (Statics.field557 < var10) {
                Statics.field557 = var10;
            }
        }
        int var12 = var11 - Statics.field1372;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1372 += Statics.field234 * var12 / 1000 + Statics.field598;
            Statics.field1372 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1372 -= Statics.field234 * -var12 / 1000 + Statics.field598;
            Statics.field1372 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1372;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1372 = var11;
        }
    }

    @ObfuscatedName("co.am(B)V")
    public static final void method1937() {
        for (int var0 = 0; var0 < field562; var0++) {
            int var1 = field327[var0];
            class35 var2 = field325[var1];
            if (var2 != null) {
                method2970(var2, var2.field780.field886);
            }
        }
    }

    @ObfuscatedName("fz.aw(Lag;II)V")
    public static final void method2970(class38 arg0, int arg1) {
        if (arg0.field856 > field395) {
            method2204(arg0);
        } else if (arg0.field857 >= field395) {
            if (field395 == arg0.field857 || arg0.field821 == -1 || arg0.field845 != 0 || arg0.field838 + 1 > class43.method729(arg0.field821).field989[arg0.field828]) {
                int var2 = arg0.field857 - arg0.field856;
                int var3 = field395 - arg0.field856;
                int var4 = arg0.field852 * 128 + arg0.field815 * 64;
                int var5 = arg0.field833 * 128 + arg0.field815 * 64;
                int var6 = arg0.field815 * 64 + arg0.field811 * 128;
                int var7 = arg0.field855 * 128 + arg0.field815 * 64;
                arg0.field840 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field849 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field868 = 0;
            arg0.field861 = arg0.field866;
            arg0.field853 = arg0.field861;
        } else {
            arg0.field839 = arg0.field816;
            if (arg0.field825 == 0) {
                arg0.field868 = 0;
            } else {
                label334: {
                    if (arg0.field821 != -1 && arg0.field845 == 0) {
                        class43 var8 = class43.method729(arg0.field821);
                        if (arg0.field869 > 0 && var8.field1000 == 0) {
                            arg0.field868++;
                            break label334;
                        }
                        if (arg0.field869 <= 0 && var8.field999 == 0) {
                            arg0.field868++;
                            break label334;
                        }
                    }
                    int var9 = arg0.field840;
                    int var10 = arg0.field849;
                    int var11 = arg0.field865[arg0.field825 - 1] * 128 + arg0.field815 * 64;
                    int var12 = arg0.field818[arg0.field825 - 1] * 128 + arg0.field815 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field861 = 1280;
                        } else if (var10 > var12) {
                            arg0.field861 = 1792;
                        } else {
                            arg0.field861 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field861 = 768;
                        } else if (var10 > var12) {
                            arg0.field861 = 256;
                        } else {
                            arg0.field861 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field861 = 1024;
                    } else if (var10 > var12) {
                        arg0.field861 = 0;
                    }
                    byte var13 = arg0.field867[arg0.field825 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field861 - arg0.field853 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field820;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field819;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field822;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field812;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field819;
                        }
                        arg0.field839 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class35) {
                            var17 = ((class35) arg0).field780.field892;
                        }
                        if (var17) {
                            if (arg0.field861 != arg0.field853 && arg0.field836 == -1 && arg0.field863 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field825 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field825 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field868 > 0 && arg0.field825 > 1) {
                                var16 = 8;
                                arg0.field868--;
                            }
                        } else {
                            if (arg0.field825 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field825 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field868 > 0 && arg0.field825 > 1) {
                                var16 = 8;
                                arg0.field868--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field839 == arg0.field819 && arg0.field823 != -1) {
                            arg0.field839 = arg0.field823;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field840 += var16;
                                if (arg0.field840 > var11) {
                                    arg0.field840 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field840 -= var16;
                                if (arg0.field840 < var11) {
                                    arg0.field840 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field849 += var16;
                                if (arg0.field849 > var12) {
                                    arg0.field849 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field849 -= var16;
                                if (arg0.field849 < var12) {
                                    arg0.field849 = var12;
                                }
                            }
                        }
                        if (arg0.field840 == var11 && arg0.field849 == var12) {
                            arg0.field825--;
                            if (arg0.field869 > 0) {
                                arg0.field869--;
                            }
                        }
                    } else {
                        arg0.field840 = var11;
                        arg0.field849 = var12;
                        arg0.field825--;
                        if (arg0.field869 > 0) {
                            arg0.field869--;
                        }
                    }
                }
            }
        }
        if (arg0.field840 < 128 || arg0.field849 < 128 || arg0.field840 >= 13184 || arg0.field849 >= 13184) {
            arg0.field821 = -1;
            arg0.field847 = -1;
            arg0.field856 = 0;
            arg0.field857 = 0;
            arg0.field840 = arg0.field865[0] * 128 + arg0.field815 * 64;
            arg0.field849 = arg0.field818[0] * 128 + arg0.field815 * 64;
            arg0.method739();
        }
        if (Statics.field2250 == arg0 && (arg0.field840 < 1536 || arg0.field849 < 1536 || arg0.field840 >= 11776 || arg0.field849 >= 11776)) {
            arg0.field821 = -1;
            arg0.field847 = -1;
            arg0.field856 = 0;
            arg0.field857 = 0;
            arg0.field840 = arg0.field865[0] * 128 + arg0.field815 * 64;
            arg0.field849 = arg0.field818[0] * 128 + arg0.field815 * 64;
            arg0.method739();
        }
        Statics.method114(arg0);
        arg0.field814 = false;
        if (arg0.field839 != -1) {
            class43 var18 = class43.method729(arg0.field839);
            if (var18 == null || var18.field987 == null) {
                arg0.field839 = -1;
            } else {
                arg0.field841++;
                if (arg0.field830 < var18.field987.length && arg0.field841 > var18.field989[arg0.field830]) {
                    arg0.field841 = 1;
                    arg0.field830++;
                    method844(var18, arg0.field830, arg0.field840, arg0.field849);
                }
                if (arg0.field830 >= var18.field987.length) {
                    arg0.field841 = 0;
                    arg0.field830 = 0;
                    method844(var18, arg0.field830, arg0.field840, arg0.field849);
                }
            }
        }
        if (arg0.field847 != -1 && field395 >= arg0.field834) {
            if (arg0.field848 < 0) {
                arg0.field848 = 0;
            }
            int var19 = class44.method632(arg0.field847).field1013;
            if (var19 == -1) {
                arg0.field847 = -1;
            } else {
                class43 var20 = class43.method729(var19);
                if (var20 == null || var20.field987 == null) {
                    arg0.field847 = -1;
                } else {
                    arg0.field842++;
                    if (arg0.field848 < var20.field987.length && arg0.field842 > var20.field989[arg0.field848]) {
                        arg0.field842 = 1;
                        arg0.field848++;
                        method844(var20, arg0.field848, arg0.field840, arg0.field849);
                    }
                    if (arg0.field848 >= var20.field987.length && (arg0.field848 < 0 || arg0.field848 >= var20.field987.length)) {
                        arg0.field847 = -1;
                    }
                }
            }
        }
        if (arg0.field821 != -1 && arg0.field845 <= 1) {
            class43 var21 = class43.method729(arg0.field821);
            if (var21.field1000 == 1 && arg0.field869 > 0 && arg0.field856 <= field395 && arg0.field857 < field395) {
                arg0.field845 = 1;
                return;
            }
        }
        if (arg0.field821 != -1 && arg0.field845 == 0) {
            class43 var22 = class43.method729(arg0.field821);
            if (var22 == null || var22.field987 == null) {
                arg0.field821 = -1;
            } else {
                arg0.field838++;
                if (arg0.field828 < var22.field987.length && arg0.field838 > var22.field989[arg0.field828]) {
                    arg0.field838 = 1;
                    arg0.field828++;
                    method844(var22, arg0.field828, arg0.field840, arg0.field849);
                }
                if (arg0.field828 >= var22.field987.length) {
                    arg0.field828 -= var22.field984;
                    arg0.field846++;
                    if (arg0.field846 >= var22.field997) {
                        arg0.field821 = -1;
                    } else if (arg0.field828 >= 0 && arg0.field828 < var22.field987.length) {
                        method844(var22, arg0.field828, arg0.field840, arg0.field849);
                    } else {
                        arg0.field821 = -1;
                    }
                }
                arg0.field814 = var22.field993;
            }
        }
        if (arg0.field845 > 0) {
            arg0.field845--;
        }
    }

    @ObfuscatedName("dn.az(Lag;I)V")
    public static final void method2204(class38 arg0) {
        int var1 = arg0.field856 - field395;
        int var2 = arg0.field852 * 128 + arg0.field815 * 64;
        int var3 = arg0.field833 * 128 + arg0.field815 * 64;
        arg0.field840 += (var2 - arg0.field840) / var1;
        arg0.field849 += (var3 - arg0.field849) / var1;
        arg0.field868 = 0;
        arg0.field861 = arg0.field866;
    }

    @ObfuscatedName("g.ax(La;IIB)V")
    public static void method161(class3 arg0, int arg1, int arg2) {
        if (arg0.field821 == arg1 && arg1 != -1) {
            int var3 = class43.method729(arg1).field991;
            if (var3 == 1) {
                arg0.field828 = 0;
                arg0.field838 = 0;
                arg0.field845 = arg2;
                arg0.field846 = 0;
            }
            if (var3 == 2) {
                arg0.field846 = 0;
            }
        } else if (arg1 == -1 || arg0.field821 == -1 || class43.method729(arg1).field994 >= class43.method729(arg0.field821).field994) {
            arg0.field821 = arg1;
            arg0.field828 = 0;
            arg0.field838 = 0;
            arg0.field845 = arg2;
            arg0.field846 = 0;
            arg0.field869 = arg0.field825;
        }
    }

    @ObfuscatedName("cz.ai(I)I")
    public static int method2039() {
        return field383 ? 2 : 1;
    }

    @ObfuscatedName("hj.ar(S)V")
    public static void method3653() {
        class137.method1009(Statics.field2040);
        Canvas var0 = Statics.field2040;
        var0.removeMouseListener(class140.field2165);
        var0.removeMouseMotionListener(class140.field2165);
        var0.removeFocusListener(class140.field2165);
        class140.field2159 = 0;
        if (Statics.field2999 != null) {
            Statics.field2999.method2620(Statics.field2040);
        }
        Statics.field285.method2806();
        Statics.field2040.setBackground(Color.black);
        Canvas var1 = Statics.field2040;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class137.field2114);
        var1.addFocusListener(class137.field2114);
        Canvas var2 = Statics.field2040;
        var2.addMouseListener(class140.field2165);
        var2.addMouseMotionListener(class140.field2165);
        var2.addFocusListener(class140.field2165);
        if (Statics.field2999 != null) {
            Statics.field2999.method2619(Statics.field2040);
        }
        if (field449 != -1) {
            Statics.method1063(false);
        }
        field2213 = true;
    }

    @ObfuscatedName("at.aa(I)V")
    public static void method845() {
        client var0 = Statics.field285;
        synchronized (Statics.field285) {
            Container var1 = Statics.field285.method2814();
            if (var1 != null) {
                Statics.field776 = Math.max(var1.getSize().width, Statics.field1535);
                Statics.field1778 = Math.max(var1.getSize().height, Statics.field1045);
                if (Statics.field575 == var1) {
                    Insets var2 = Statics.field575.getInsets();
                    Statics.field776 -= var2.right + var2.left;
                    Statics.field1778 -= var2.top + var2.bottom;
                }
                if (Statics.field776 <= 0) {
                    Statics.field776 = 1;
                }
                if (Statics.field1778 <= 0) {
                    Statics.field1778 = 1;
                }
                if (method2039() == 1) {
                    Statics.field2191 = field504;
                    Statics.field1567 = field505;
                } else {
                    Statics.field2191 = Math.min(Statics.field776, 7680);
                    Statics.field1567 = Math.min(Statics.field1778, 2160);
                }
                field2209 = (Statics.field776 - Statics.field2191) / 2;
                field2210 = 0;
                Statics.field2040.setSize(Statics.field2191, Statics.field1567);
                Statics.field1386 = class78.method1939(Statics.field2191, Statics.field1567, Statics.field2040);
                if (Statics.field575 == var1) {
                    Insets var3 = Statics.field575.getInsets();
                    Statics.field2040.setLocation(field2209 + var3.left, field2210 + var3.top);
                } else {
                    Statics.field2040.setLocation(field2209, field2210);
                }
                method744();
                if (field449 != -1) {
                    Statics.method1063(true);
                }
                method3617();
            }
        }
    }

    @ObfuscatedName("ag.as(I)V")
    public static void method744() {
        int var0 = Statics.field2191;
        int var1 = Statics.field1567;
        if (Statics.field776 < var0) {
            int var2 = Statics.field776;
        }
        if (Statics.field1778 < var1) {
            int var3 = Statics.field1778;
        }
        if (Statics.field170 == null) {
            return;
        }
        try {
            client var4 = Statics.field285;
            Object[] var5 = new Object[] { method2039() };
            JSObject.getWindow(var4).call("resize", var5);
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("hh.ag(I)V")
    public static void method3617() {
        int var0 = field2209;
        int var1 = field2210;
        int var2 = Statics.field776 - Statics.field2191 - var0;
        int var3 = Statics.field1778 - Statics.field1567 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field285.method2814();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field575 == var4) {
                Insets var7 = Statics.field575.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1778);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field776, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field776 + var5 - var2, var6, var2, Statics.field1778);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1778 + var6 - var3, Statics.field776, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("r.af(Ljava/lang/String;ZB)V")
    public static final void method127(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field693.method3719(arg0, 250);
        int var6 = Statics.field693.method3720(arg0, 250) * 13;
        class80.method1674(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1711(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field693.method3725(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method2925(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field2040.getGraphics();
                Statics.field1386.method1518(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field2040.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field492; var13++) {
            if (field499[var13] + field497[var13] > var9 && field497[var13] < var9 + var11 && field500[var13] + field457[var13] > var10 && field457[var13] < var10 + var12) {
                field498[var13] = true;
            }
        }
    }

    @ObfuscatedName("fg.ao(IIIIZI)V")
    public static final void method3190(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        int var5 = arg3 - 334;
        if (var5 < 0) {
            var5 = 0;
        } else if (var5 > 100) {
            var5 = 100;
        }
        int var6 = (field405 - field371) * var5 / 100 + field371;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field549) {
            short var8 = field549;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field548) {
                var6 = field548;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1667();
                    class80.method1674(arg0, arg1, var10, arg3, -16777216);
                    class80.method1674(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field550) {
            short var11 = field550;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field463) {
                var6 = field463;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1667();
                    class80.method1674(arg0, arg1, arg2, var13, -16777216);
                    class80.method1674(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field546 - field545) * var5 / 100 + field545;
        field488 = arg3 * var6 * var14 / 85504 << 1;
        if (field553 != arg2 || field554 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class91.field1588[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class86.method1795(var15, 500, 800, arg2, arg3);
        }
        field442 = arg0;
        field418 = arg1;
        field553 = arg2;
        field554 = arg3;
    }

    @ObfuscatedName("ea.an(Lai;B)V")
    public static final void method2668(class34 arg0) {
        if (Statics.field2250.field840 >> 7 == field297 && Statics.field2250.field849 >> 7 == field320) {
            field297 = 0;
        }
        int var1 = class33.field750;
        int[] var2 = class33.field756;
        int var3 = var1;
        if (class34.field766 == arg0 || class34.field770 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field766 == arg0) {
                var5 = Statics.field2250;
                var6 = Statics.field2250.field57 << 14;
            } else if (class34.field770 == arg0) {
                var5 = field411[field420];
                var6 = field420 << 14;
            } else {
                var5 = field411[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field768 == arg0 && field420 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method18() && !var5.field55) {
                var5.field59 = false;
                if ((field458 && var1 > 50 || var1 > 200) && class34.field766 != arg0 && var5.field839 == var5.field816) {
                    var5.field59 = true;
                }
                int var7 = var5.field840 >> 7;
                int var8 = var5.field849 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field48 == null || field395 < var5.field44 || field395 >= var5.field53) {
                        if ((var5.field840 & 0x7F) == 64 && (var5.field849 & 0x7F) == 64) {
                            if (field408 == field394[var7][var8]) {
                                continue;
                            }
                            field394[var7][var8] = field408;
                        }
                        var5.field43 = method2205(var5.field840, var5.field849, Statics.field1387);
                        Statics.field1907.method1771(Statics.field1387, var5.field840, var5.field849, var5.field43, 60, var5, var5.field853, var6, var5.field814);
                    } else {
                        var5.field59 = false;
                        var5.field43 = method2205(var5.field840, var5.field849, Statics.field1387);
                        Statics.field1907.method1772(Statics.field1387, var5.field840, var5.field849, var5.field43, 60, var5, var5.field853, var6, var5.field60, var5.field34, var5.field51, var5.field52);
                    }
                }
            }
        }
    }

    @ObfuscatedName("bs.at(ZB)V")
    public static final void method1075(boolean arg0) {
        for (int var1 = 0; var1 < field562; var1++) {
            class35 var2 = field325[field327[var1]];
            int var3 = (field327[var1] << 14) + 536870912;
            if (var2 != null && var2.method18() && var2.field780.field905 == arg0 && var2.field780.method757()) {
                int var4 = var2.field840 >> 7;
                int var5 = var2.field849 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field815 == 1 && (var2.field840 & 0x7F) == 64 && (var2.field849 & 0x7F) == 64) {
                        if (field408 == field394[var4][var5]) {
                            continue;
                        }
                        field394[var4][var5] = field408;
                    }
                    if (!var2.field780.field884) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field1907.method1771(Statics.field1387, var2.field840, var2.field849, method2205(var2.field840 + (var2.field815 * 64 - 64), var2.field849 + (var2.field815 * 64 - 64), Statics.field1387), var2.field815 * 64 - 64 + 60, var2, var2.field853, var3, var2.field814);
                }
            }
        }
    }

    @ObfuscatedName("r.al(I)V")
    public static final void method128() {
        for (class7 var0 = (class7) field423.method3528(); var0 != null; var0 = (class7) field423.method3527()) {
            if (Statics.field1387 != var0.field107 || field395 > var0.field113) {
                var0.method3608();
            } else if (field395 >= var0.field106) {
                if (var0.field116 > 0) {
                    class35 var1 = field325[var0.field116 - 1];
                    if (var1 != null && var1.field840 >= 0 && var1.field840 < 13312 && var1.field849 >= 0 && var1.field849 < 13312) {
                        var0.method84(var1.field840, var1.field849, method2205(var1.field840, var1.field849, var0.field107) - var0.field123, field395);
                    }
                }
                if (var0.field116 < 0) {
                    int var2 = -var0.field116 - 1;
                    class3 var3;
                    if (field478 == var2) {
                        var3 = Statics.field2250;
                    } else {
                        var3 = field411[var2];
                    }
                    if (var3 != null && var3.field840 >= 0 && var3.field840 < 13312 && var3.field849 >= 0 && var3.field849 < 13312) {
                        var0.method84(var3.field840, var3.field849, method2205(var3.field840, var3.field849, var0.field107) - var0.field123, field395);
                    }
                }
                var0.method91(field363);
                Statics.field1907.method1771(Statics.field1387, (int) var0.field114, (int) var0.field118, (int) var0.field124, 60, var0, var0.field126, -1, false);
            }
        }
    }

    @ObfuscatedName("y.aq(I)I")
    public static final int method177() {
        if (Statics.field170.field143) {
            return Statics.field1387;
        } else {
            int var0 = method2205(Statics.field2198, Statics.field2229, Statics.field1387);
            return var0 - Statics.field798 >= 800 || (class6.field82[Statics.field1387][Statics.field2198 >> 7][Statics.field2229 >> 7] & 0x4) == 0 ? 3 : Statics.field1387;
        }
    }

    @ObfuscatedName("cw.ae(Lag;IIIIII)V")
    public static final void method2127(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method18()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field780;
            if (var6.field910 != null) {
                var6 = var6.method774();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field750;
        int[] var8 = class33.field756;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field55) {
                return;
            }
            if (var10.field42 != -1 || var10.field37 != -1) {
                method3432(arg0, arg0.field844 + 15);
                if (field359 > -1) {
                    if (var10.field42 != -1) {
                        Statics.field696[var10.field42].method1604(field359 + arg2 - 12, field397 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field37 != -1) {
                        Statics.field75[var10.field37].method1604(field359 + arg2 - 12, field397 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field352 == 10 && field308 == var8[arg1]) {
                method3432(arg0, arg0.field844 + 15);
                if (field359 > -1) {
                    Statics.field1379[1].method1604(field359 + arg2 - 12, field397 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field780;
            if (var11.field910 != null) {
                var11 = var11.method774();
            }
            if (var11.field904 >= 0 && var11.field904 < Statics.field75.length) {
                method3432(arg0, arg0.field844 + 15);
                if (field359 > -1) {
                    Statics.field75[var11.field904].method1604(field359 + arg2 - 12, field397 + arg3 - 30);
                }
            }
            if (field352 == 1 && field307 == field327[arg1 - var7] && field395 % 20 < 10) {
                method3432(arg0, arg0.field844 + 15);
                if (field359 > -1) {
                    Statics.field1379[0].method1604(field359 + arg2 - 12, field397 + arg3 - 28);
                }
            }
        }
        if (arg0.field824 != null && (arg1 >= var7 || !arg0.field826 && (field507 == 4 || !arg0.field843 && (field507 == 0 || field507 == 3 || field507 == 1 && method2647(((class3) arg0).field49, false))))) {
            method3432(arg0, arg0.field844);
            if (field359 > -1 && field384 < field385) {
                field389[field384] = Statics.field29.method3717(arg0.field824) / 2;
                field388[field384] = Statics.field29.field3183;
                field479[field384] = field359;
                field357[field384] = field397;
                field390[field384] = arg0.field860;
                field391[field384] = arg0.field829;
                field392[field384] = arg0.field827;
                field551[field384] = arg0.field824;
                field384++;
            }
        }
        if (arg0.field850 > field395) {
            method3432(arg0, arg0.field844 + 15);
            if (field359 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field780;
                    var12 = var13.field916;
                }
                int var14 = arg0.field813 * var12 / arg0.field835;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field813 > 0) {
                    var14 = 1;
                }
                class80.method1674(field359 + arg2 - var12 / 2, field397 + arg3 - 3, var14, 5, 65280);
                class80.method1674(field359 + arg2 - var12 / 2 + var14, field397 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field832[var15] > field395) {
                method3432(arg0, arg0.field844 / 2);
                if (field359 > -1) {
                    if (var15 == 1) {
                        field397 -= 20;
                    }
                    if (var15 == 2) {
                        field359 -= 15;
                        field397 -= 10;
                    }
                    if (var15 == 3) {
                        field359 += 15;
                        field397 -= 10;
                    }
                    Statics.field266[arg0.field831[var15]].method1604(field359 + arg2 - 12, field397 + arg3 - 12);
                    Statics.field5.method3794(Integer.toString(arg0.field864[var15]), field359 + arg2 - 1, field397 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("gh.ap(Lag;II)V")
    public static final void method3432(class38 arg0, int arg1) {
        method43(arg0.field840, arg0.field849, arg1);
    }

    @ObfuscatedName("f.ad(IIII)V")
    public static final void method43(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field359 = -1;
            field397 = -1;
            return;
        }
        int var3 = method2205(arg0, arg1, Statics.field1387) - arg2;
        int var4 = arg0 - Statics.field2198;
        int var5 = var3 - Statics.field798;
        int var6 = arg1 - Statics.field2229;
        int var7 = class91.field1588[Statics.field557];
        int var8 = class91.field1591[Statics.field557];
        int var9 = class91.field1588[Statics.field1372];
        int var10 = class91.field1591[Statics.field1372];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field359 = field488 * var11 / var15 + field553 / 2;
            field397 = field488 * var14 / var15 + field554 / 2;
        } else {
            field359 = -1;
            field397 = -1;
        }
    }

    @ObfuscatedName("dn.au(IIIB)I")
    public static final int method2205(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field82[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field94[var5][var3][var4] + class6.field94[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field94[var5][var3][var4 + 1] + class6.field94[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("fe.ay(ZI)V")
    public static final void method3088(boolean arg0) {
        field348 = arg0;
        if (!field348) {
            int var1 = field294.method2352();
            int var2 = field294.method2350();
            int var3 = field294.method2318();
            Statics.field2101 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field2101[var4][var5] = field294.method2321();
                }
            }
            Statics.field679 = new int[var3];
            Statics.field193 = new int[var3];
            Statics.field1627 = new int[var3];
            Statics.field600 = new byte[var3][];
            Statics.field2657 = new byte[var3][];
            boolean var6 = false;
            if ((var1 / 8 == 48 || var1 / 8 == 49) && var2 / 8 == 48) {
                var6 = true;
            }
            if (var1 / 8 == 48 && var2 / 8 == 148) {
                var6 = true;
            }
            int var7 = 0;
            for (int var8 = (var1 - 6) / 8; var8 <= (var1 + 6) / 8; var8++) {
                for (int var9 = (var2 - 6) / 8; var9 <= (var2 + 6) / 8; var9++) {
                    int var10 = (var8 << 8) + var9;
                    if (!var6 || var9 != 49 && var9 != 149 && var9 != 147 && var8 != 50 && (var8 != 49 || var9 != 47)) {
                        Statics.field679[var7] = var10;
                        Statics.field193[var7] = Statics.field624.method3039("m" + var8 + "_" + var9);
                        Statics.field1627[var7] = Statics.field624.method3039("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method2937(var1, var2);
            return;
        }
        int var11 = field294.method2350();
        int var12 = field294.method2318();
        int var13 = field294.method2318();
        field294.method2551();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field294.method2552(1);
                    if (var17 == 1) {
                        field527[var14][var15][var16] = field294.method2552(26);
                    } else {
                        field527[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field294.method2553();
        Statics.field2101 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field2101[var18][var19] = field294.method2321();
            }
        }
        Statics.field679 = new int[var13];
        Statics.field193 = new int[var13];
        Statics.field1627 = new int[var13];
        Statics.field600 = new byte[var13][];
        Statics.field2657 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field527[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field679[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field679[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field193[var20] = Statics.field624.method3039("m" + var29 + "_" + var30);
                            Statics.field1627[var20] = Statics.field624.method3039("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method2937(var12, var11);
    }

    @ObfuscatedName("fx.av(IIB)V")
    public static final void method2937(int arg0, int arg1) {
        if (Statics.field2066 == arg0 && Statics.field1879 == arg1) {
            return;
        }
        Statics.field2066 = arg0;
        Statics.field1879 = arg1;
        method553(25);
        method127(class157.field2325, true);
        int var2 = Statics.field1684;
        int var3 = Statics.field1599;
        Statics.field1684 = (arg0 - 6) * 8;
        Statics.field1599 = (arg1 - 6) * 8;
        int var4 = Statics.field1684 - var2;
        int var5 = Statics.field1599 - var3;
        int var6 = Statics.field1684;
        int var7 = Statics.field1599;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field325[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field865[var10] -= var4;
                    var9.field818[var10] -= var5;
                }
                var9.field840 -= var4 * 128;
                var9.field849 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field411[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field865[var13] -= var4;
                    var12.field818[var13] -= var5;
                }
                var12.field840 -= var4 * 128;
                var12.field849 -= var5 * 128;
            }
        }
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        if (var4 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var17 = 0;
        byte var18 = 104;
        byte var19 = 1;
        if (var5 < 0) {
            var17 = 103;
            var18 = -1;
            var19 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var21 = var17; var21 != var18; var21 += var19) {
                int var22 = var4 + var20;
                int var23 = var5 + var21;
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                        field421[var24][var20][var21] = field421[var24][var22][var23];
                    } else {
                        field421[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field410.method3528(); var25 != null; var25 = (class17) field410.method3527()) {
            var25.field231 -= var4;
            var25.field236 -= var5;
            if (var25.field231 < 0 || var25.field236 < 0 || var25.field231 >= 104 || var25.field236 >= 104) {
                var25.method3608();
            }
        }
        if (field297 != 0) {
            field297 -= var4;
            field320 -= var5;
        }
        field531 = 0;
        field529 = false;
        field518 = -1;
        field424.method3522();
        field423.method3522();
        for (int var26 = 0; var26 < 4; var26++) {
            field347[var26].method2209();
        }
    }

    @ObfuscatedName("a.ah(ZI)V")
    public static final void method15(boolean arg0) {
        Statics.method749();
        field338++;
        if (field338 < 50 && !arg0) {
            return;
        }
        field338 = 0;
        if (field305 || Statics.field3116 == null) {
            return;
        }
        field330.method2549(149);
        try {
            Statics.field3116.method2780(field330.field1996, 0, field330.field1999);
            field330.field1999 = 0;
        } catch (IOException var2) {
            field305 = true;
        }
    }

    @ObfuscatedName("dr.aj(IIIIIB)V")
    public static final void method2245(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field1907.method1786(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field1907.method1868(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1003.field1413;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method981(var12);
            if (var13.field947 == -1) {
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
                class81 var14 = Statics.field614[var13.field947];
                if (var14 != null) {
                    int var15 = (var13.field933 * 4 - var14.field1432) / 2;
                    int var16 = (var13.field934 * 4 - var14.field1435) / 2;
                    var14.method1736(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field934) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field1907.method1820(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field1907.method1868(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method981(var21);
            if (var22.field947 != -1) {
                class81 var23 = Statics.field614[var22.field947];
                if (var23 != null) {
                    int var24 = (var22.field933 * 4 - var23.field1432) / 2;
                    int var25 = (var22.field934 * 4 - var23.field1435) / 2;
                    var23.method1736(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field934) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1003.field1413;
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
        int var29 = Statics.field1907.method1895(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method981(var30);
        if (var31.field947 == -1) {
            return;
        }
        class81 var32 = Statics.field614[var31.field947];
        if (var32 != null) {
            int var33 = (var31.field933 * 4 - var32.field1432) / 2;
            int var34 = (var31.field934 * 4 - var32.field1435) / 2;
            var32.method1736(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field934) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("cy.bs(S)V")
    public static final void method2034() {
        if (field334 == 81) {
            int var0 = field294.method2316();
            int var1 = (var0 >> 4 & 0x7) + Statics.field200;
            int var2 = (var0 & 0x7) + Statics.field762;
            int var3 = field294.method2318();
            int var4 = field294.method2316();
            int var5 = var4 >> 4 & 0xF;
            int var6 = var4 & 0x7;
            int var7 = field294.method2316();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var8 = var5 + 1;
                if (Statics.field2250.field865[0] >= var1 - var8 && Statics.field2250.field865[0] <= var1 + var8 && Statics.field2250.field818[0] >= var2 - var8 && Statics.field2250.field818[0] <= var2 + var8 && field503 != 0 && var6 > 0 && field531 < 50) {
                    field532[field531] = var3;
                    field533[field531] = var6;
                    field444[field531] = var7;
                    field402[field531] = null;
                    field535[field531] = (var1 << 16) + (var2 << 8) + var5;
                    field531++;
                }
            }
        }
        if (field334 == 1) {
            int var9 = field294.method2344();
            int var10 = (var9 >> 4 & 0x7) + Statics.field200;
            int var11 = (var9 & 0x7) + Statics.field762;
            int var12 = field294.method2434();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field350[var13];
            int var16 = field294.method2352();
            if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                if (var15 == 0) {
                    class87 var17 = Statics.field1907.method1782(Statics.field1387, var10, var11);
                    if (var17 != null) {
                        int var18 = var17.field1533 >> 14 & 0x7FFF;
                        if (var13 == 2) {
                            var17.field1531 = new class13(var18, 2, var14 + 4, Statics.field1387, var10, var11, var16, false, var17.field1531);
                            var17.field1532 = new class13(var18, 2, var14 + 1 & 0x3, Statics.field1387, var10, var11, var16, false, var17.field1532);
                        } else {
                            var17.field1531 = new class13(var18, var13, var14, Statics.field1387, var10, var11, var16, false, var17.field1531);
                        }
                    }
                }
                if (var15 == 1) {
                    class94 var19 = Statics.field1907.method1929(Statics.field1387, var10, var11);
                    if (var19 != null) {
                        int var20 = var19.field1614 >> 14 & 0x7FFF;
                        if (var13 == 4 || var13 == 5) {
                            var19.field1605 = new class13(var20, 4, var14, Statics.field1387, var10, var11, var16, false, var19.field1605);
                        } else if (var13 == 6) {
                            var19.field1605 = new class13(var20, 4, var14 + 4, Statics.field1387, var10, var11, var16, false, var19.field1605);
                        } else if (var13 == 7) {
                            var19.field1605 = new class13(var20, 4, (var14 + 2 & 0x3) + 4, Statics.field1387, var10, var11, var16, false, var19.field1605);
                        } else if (var13 == 8) {
                            var19.field1605 = new class13(var20, 4, var14 + 4, Statics.field1387, var10, var11, var16, false, var19.field1605);
                            var19.field1613 = new class13(var20, 4, (var14 + 2 & 0x3) + 4, Statics.field1387, var10, var11, var16, false, var19.field1613);
                        }
                    }
                }
                if (var15 == 2) {
                    class98 var21 = Statics.field1907.method1784(Statics.field1387, var10, var11);
                    if (var13 == 11) {
                        var13 = 10;
                    }
                    if (var21 != null) {
                        var21.field1671 = new class13(var21.field1678 >> 14 & 0x7FFF, var13, var14, Statics.field1387, var10, var11, var16, false, var21.field1671);
                    }
                }
                if (var15 == 3) {
                    class93 var22 = Statics.field1907.method1785(Statics.field1387, var10, var11);
                    if (var22 != null) {
                        var22.field1600 = new class13(var22.field1597 >> 14 & 0x7FFF, 22, var14, Statics.field1387, var10, var11, var16, false, var22.field1600);
                    }
                }
            }
        } else if (field334 == 139) {
            int var23 = field294.method2318();
            int var24 = field294.method2350();
            int var25 = field294.method2349();
            int var26 = (var25 >> 4 & 0x7) + Statics.field200;
            int var27 = (var25 & 0x7) + Statics.field762;
            if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104) {
                class29 var28 = new class29();
                var28.field678 = var23;
                var28.field673 = var24;
                if (field421[Statics.field1387][var26][var27] == null) {
                    field421[Statics.field1387][var26][var27] = new class199();
                }
                field421[Statics.field1387][var26][var27].method3523(var28);
                method2234(var26, var27);
            }
        } else if (field334 == 30) {
            int var29 = field294.method2316();
            int var30 = (var29 >> 4 & 0x7) + Statics.field200;
            int var31 = (var29 & 0x7) + Statics.field762;
            int var32 = field294.method2318();
            int var33 = field294.method2316();
            int var34 = field294.method2318();
            if (var30 >= 0 && var31 >= 0 && var30 < 104 && var31 < 104) {
                int var35 = var30 * 128 + 64;
                int var36 = var31 * 128 + 64;
                class30 var37 = new class30(var32, Statics.field1387, var35, var36, method2205(var35, var36, Statics.field1387) - var33, var34, field395);
                field424.method3523(var37);
            }
        } else if (field334 == 141) {
            int var38 = field294.method2316();
            int var39 = (var38 >> 4 & 0x7) + Statics.field200;
            int var40 = (var38 & 0x7) + Statics.field762;
            int var41 = field294.method2318();
            int var42 = field294.method2318();
            int var43 = field294.method2318();
            if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                class199 var44 = field421[Statics.field1387][var39][var40];
                if (var44 != null) {
                    for (class29 var45 = (class29) var44.method3528(); var45 != null; var45 = (class29) var44.method3527()) {
                        if ((var41 & 0x7FFF) == var45.field678 && var45.field673 == var42) {
                            var45.field673 = var43;
                            break;
                        }
                    }
                    method2234(var39, var40);
                }
            }
        } else if (field334 == 44) {
            int var46 = field294.method2349();
            int var47 = (var46 >> 4 & 0x7) + Statics.field200;
            int var48 = (var46 & 0x7) + Statics.field762;
            int var49 = field294.method2344();
            int var50 = var49 >> 2;
            int var51 = var49 & 0x3;
            int var52 = field350[var50];
            int var53 = field294.method2352();
            if (var47 >= 0 && var48 >= 0 && var47 < 104 && var48 < 104) {
                method2544(Statics.field1387, var47, var48, var52, var53, var50, var51, 0, -1);
            }
        } else if (field334 == 66) {
            int var54 = field294.method2316();
            int var55 = (var54 >> 4 & 0x7) + Statics.field200;
            int var56 = (var54 & 0x7) + Statics.field762;
            int var57 = field294.method2350();
            if (var55 >= 0 && var56 >= 0 && var55 < 104 && var56 < 104) {
                class199 var58 = field421[Statics.field1387][var55][var56];
                if (var58 != null) {
                    for (class29 var59 = (class29) var58.method3528(); var59 != null; var59 = (class29) var58.method3527()) {
                        if ((var57 & 0x7FFF) == var59.field678) {
                            var59.method3608();
                            break;
                        }
                    }
                    if (var58.method3528() == null) {
                        field421[Statics.field1387][var55][var56] = null;
                    }
                    method2234(var55, var56);
                }
            }
        } else if (field334 == 60) {
            int var60 = field294.method2434();
            int var61 = var60 >> 2;
            int var62 = var60 & 0x3;
            int var63 = field350[var61];
            int var64 = field294.method2434();
            int var65 = (var64 >> 4 & 0x7) + Statics.field200;
            int var66 = (var64 & 0x7) + Statics.field762;
            if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                method2544(Statics.field1387, var65, var66, var63, -1, var61, var62, 0, -1);
            }
        } else {
            if (field334 == 210) {
                int var67 = field294.method2434();
                int var68 = var67 >> 2;
                int var69 = var67 & 0x3;
                int var70 = field350[var68];
                byte var71 = field294.method2439();
                int var72 = field294.method2352();
                byte var73 = field294.method2317();
                byte var74 = field294.method2345();
                int var75 = field294.method2352();
                int var76 = field294.method2318();
                byte var77 = field294.method2317();
                int var78 = field294.method2350();
                int var79 = field294.method2434();
                int var80 = (var79 >> 4 & 0x7) + Statics.field200;
                int var81 = (var79 & 0x7) + Statics.field762;
                class3 var82;
                if (field478 == var72) {
                    var82 = Statics.field2250;
                } else {
                    var82 = field411[var72];
                }
                if (var82 != null) {
                    class41 var83 = class41.method981(var78);
                    int var84;
                    int var85;
                    if (var69 == 1 || var69 == 3) {
                        var84 = var83.field934;
                        var85 = var83.field933;
                    } else {
                        var84 = var83.field933;
                        var85 = var83.field934;
                    }
                    int var86 = (var84 >> 1) + var80;
                    int var87 = (var84 + 1 >> 1) + var80;
                    int var88 = (var85 >> 1) + var81;
                    int var89 = (var85 + 1 >> 1) + var81;
                    int[][] var90 = class6.field94[Statics.field1387];
                    int var91 = var90[var86][var88] + var90[var87][var88] + var90[var86][var89] + var90[var87][var89] >> 2;
                    int var92 = (var80 << 7) + (var84 << 6);
                    int var93 = (var81 << 7) + (var85 << 6);
                    class105 var94 = var83.method790(var68, var69, var90, var92, var91, var93);
                    if (var94 != null) {
                        method2544(Statics.field1387, var80, var81, var70, -1, 0, 0, var75 + 1, var76 + 1);
                        var82.field44 = field395 + var75;
                        var82.field53 = field395 + var76;
                        var82.field48 = var94;
                        var82.field45 = var80 * 128 + var84 * 64;
                        var82.field47 = var81 * 128 + var85 * 64;
                        var82.field46 = var91;
                        if (var73 > var77) {
                            byte var95 = var73;
                            var73 = var77;
                            var77 = var95;
                        }
                        if (var74 > var71) {
                            byte var96 = var74;
                            var74 = var71;
                            var71 = var96;
                        }
                        var82.field60 = var73 + var80;
                        var82.field51 = var77 + var80;
                        var82.field34 = var74 + var81;
                        var82.field52 = var71 + var81;
                    }
                }
            }
            if (field334 == 216) {
                int var97 = field294.method2316();
                int var98 = (var97 >> 4 & 0x7) + Statics.field200;
                int var99 = (var97 & 0x7) + Statics.field762;
                int var100 = var98 + field294.method2317();
                int var101 = var99 + field294.method2317();
                int var102 = field294.method2421();
                int var103 = field294.method2318();
                int var104 = field294.method2316() * 4;
                int var105 = field294.method2316() * 4;
                int var106 = field294.method2318();
                int var107 = field294.method2318();
                int var108 = field294.method2316();
                int var109 = field294.method2316();
                if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104 && var100 >= 0 && var101 >= 0 && var100 < 104 && var101 < 104 && var103 != 65535) {
                    int var110 = var98 * 128 + 64;
                    int var111 = var99 * 128 + 64;
                    int var112 = var100 * 128 + 64;
                    int var113 = var101 * 128 + 64;
                    class7 var114 = new class7(var103, Statics.field1387, var110, var111, method2205(var110, var111, Statics.field1387) - var104, field395 + var106, field395 + var107, var108, var109, var102, var105);
                    var114.method84(var112, var113, method2205(var112, var113, Statics.field1387) - var105, field395 + var106);
                    field423.method3523(var114);
                }
            }
        }
    }

    @ObfuscatedName("df.bv(IIIIIIIIII)V")
    public static final void method2544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field410.method3528(); var10 != null; var10 = (class17) field410.method3527()) {
            if (var10.field243 == arg0 && var10.field231 == arg1 && var10.field236 == arg2 && var10.field232 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field243 = arg0;
            var9.field232 = arg3;
            var9.field231 = arg1;
            var9.field236 = arg2;
            Statics.method3110(var9);
            field410.method3523(var9);
        }
        var9.field238 = arg4;
        var9.field240 = arg5;
        var9.field239 = arg6;
        var9.field241 = arg7;
        var9.field245 = arg8;
    }

    @ObfuscatedName("db.bw(S)V")
    public static final void method2570() {
        for (class17 var0 = (class17) field410.method3528(); var0 != null; var0 = (class17) field410.method3527()) {
            if (var0.field245 == -1) {
                var0.field241 = 0;
                Statics.method3110(var0);
            } else {
                var0.method3608();
            }
        }
    }

    @ObfuscatedName("y.bq(IIIIIIIB)V")
    public static final void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field458 && Statics.field1387 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field1907.method1786(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field1907.method1787(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field1907.method1820(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field1907.method1895(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field1907.method1868(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field1907.method1893(arg0, arg2, arg3);
                class41 var15 = class41.method981(var12);
                if (var15.field935 != 0) {
                    field347[arg0].method2215(arg2, arg3, var13, var14, var15.field919);
                }
            }
            if (arg1 == 1) {
                Statics.field1907.method1913(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field1907.method1862(arg0, arg2, arg3);
                class41 var16 = class41.method981(var12);
                if (var16.field933 + arg2 > 103 || var16.field933 + arg3 > 103 || var16.field934 + arg2 > 103 || var16.field934 + arg3 > 103) {
                    return;
                }
                if (var16.field935 != 0) {
                    field347[arg0].method2216(arg2, arg3, var16.field933, var16.field934, var14, var16.field919);
                }
            }
            if (arg1 == 3) {
                Statics.field1907.method1780(arg0, arg2, arg3);
                class41 var17 = class41.method981(var12);
                if (var17.field935 == 1) {
                    field347[arg0].method2218(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field82[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class86 var19 = Statics.field1907;
        class108 var20 = field347[arg0];
        class41 var21 = class41.method981(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field934;
            var23 = var21.field933;
        } else {
            var22 = var21.field933;
            var23 = var21.field934;
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
        int[][] var28 = class6.field94[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field937 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field918 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class85 var34;
            if (var21.field950 == -1 && var21.field921 == null) {
                var34 = var21.method790(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1766(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field935 == 1) {
                var20.method2213(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class85 var57;
            if (var21.field950 == -1 && var21.field921 == null) {
                var57 = var21.method790(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            if (var57 != null) {
                var19.method1852(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field935 != 0) {
                var20.method2210(arg2, arg3, var22, var23, var21.field919);
            }
        } else if (arg6 >= 12) {
            class85 var35;
            if (var21.field950 == -1 && var21.field921 == null) {
                var35 = var21.method790(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1852(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field935 != 0) {
                var20.method2210(arg2, arg3, var22, var23, var21.field919);
            }
        } else if (arg6 == 0) {
            class85 var36;
            if (var21.field950 == -1 && var21.field921 == null) {
                var36 = var21.method790(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1761(arg0, arg2, arg3, var29, var36, (class85) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field935 != 0) {
                var20.method2233(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 1) {
            class85 var37;
            if (var21.field950 == -1 && var21.field921 == null) {
                var37 = var21.method790(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1761(arg0, arg2, arg3, var29, var37, (class85) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field935 != 0) {
                var20.method2233(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class85 var39;
            class85 var40;
            if (var21.field950 == -1 && var21.field921 == null) {
                var39 = var21.method790(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method790(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field950, true, (class85) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1761(arg0, arg2, arg3, var29, var39, var40, class6.field89[arg5], class6.field89[var38], var32, var33);
            if (var21.field935 != 0) {
                var20.method2233(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 3) {
            class85 var41;
            if (var21.field950 == -1 && var21.field921 == null) {
                var41 = var21.method790(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1761(arg0, arg2, arg3, var29, var41, (class85) null, class6.field81[arg5], 0, var32, var33);
            if (var21.field935 != 0) {
                var20.method2233(arg2, arg3, arg6, arg5, var21.field919);
            }
        } else if (arg6 == 9) {
            class85 var42;
            if (var21.field950 == -1 && var21.field921 == null) {
                var42 = var21.method790(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1852(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field935 != 0) {
                var20.method2210(arg2, arg3, var22, var23, var21.field919);
            }
        } else if (arg6 == 4) {
            class85 var43;
            if (var21.field950 == -1 && var21.field921 == null) {
                var43 = var21.method790(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var43, (class85) null, class6.field89[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1786(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method981(var45 >> 14 & 0x7FFF).field962;
            }
            class85 var46;
            if (var21.field950 == -1 && var21.field921 == null) {
                var46 = var21.method790(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var46, (class85) null, class6.field89[arg5], 0, class6.field104[arg5] * var44, class6.field90[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1786(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method981(var48 >> 14 & 0x7FFF).field962 / 2;
            }
            class85 var49;
            if (var21.field950 == -1 && var21.field921 == null) {
                var49 = var21.method790(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var49, (class85) null, 256, arg5, class6.field93[arg5] * var47, class6.field102[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class85 var51;
            if (var21.field950 == -1 && var21.field921 == null) {
                var51 = var21.method790(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var51, (class85) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1786(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method981(var53 >> 14 & 0x7FFF).field962 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class85 var55;
            class85 var56;
            if (var21.field950 == -1 && var21.field921 == null) {
                var55 = var21.method790(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method790(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field950, true, (class85) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field950, true, (class85) null);
            }
            var19.method1769(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field93[arg5] * var52, class6.field102[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("dt.bl(III)V")
    public static final void method2234(int arg0, int arg1) {
        class199 var2 = field421[Statics.field1387][arg0][arg1];
        if (var2 == null) {
            Statics.field1907.method1781(Statics.field1387, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3528(); var6 != null; var6 = (class29) var2.method3527()) {
            class52 var7 = class52.method578(var6.field678);
            long var8 = (long) var7.field1134;
            if (var7.field1135 == 1) {
                var8 = (long) (var6.field673 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field1907.method1781(Statics.field1387, arg0, arg1);
            return;
        }
        var2.method3524(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3528(); var12 != null; var12 = (class29) var2.method3527()) {
            if (var5.field678 != var12.field678) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field678 != var12.field678 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field1907.method1767(Statics.field1387, arg0, arg1, method2205(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1387), var5, var13, var10, var11);
    }

    @ObfuscatedName("ak.br(ZI)V")
    public static final void method646(boolean arg0) {
        field414 = 0;
        field328 = 0;
        method148();
        method1064(arg0);
        method90();
        for (int var1 = 0; var1 < field414; var1++) {
            int var2 = field415[var1];
            if (field395 != field325[var2].field859) {
                field325[var2].field780 = null;
                field325[var2] = null;
            }
        }
        if (field333 != field294.field1999) {
            throw new RuntimeException(field294.field1999 + class2.field20 + field333);
        }
        for (int var3 = 0; var3 < field562; var3++) {
            if (field325[field327[var3]] == null) {
                throw new RuntimeException(var3 + class2.field20 + field562);
            }
        }
    }

    @ObfuscatedName("q.bk(I)V")
    public static final void method148() {
        field294.method2551();
        int var0 = field294.method2552(8);
        if (var0 < field562) {
            for (int var1 = var0; var1 < field562; var1++) {
                field415[++field414 - 1] = field327[var1];
            }
        }
        if (var0 > field562) {
            throw new RuntimeException("");
        }
        field562 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            int var3 = field327[var2];
            class35 var4 = field325[var3];
            int var5 = field294.method2552(1);
            if (var5 == 0) {
                field327[++field562 - 1] = var3;
                var4.field859 = field395;
            } else {
                int var6 = field294.method2552(2);
                if (var6 == 0) {
                    field327[++field562 - 1] = var3;
                    var4.field859 = field395;
                    field329[++field328 - 1] = var3;
                } else if (var6 == 1) {
                    field327[++field562 - 1] = var3;
                    var4.field859 = field395;
                    int var7 = field294.method2552(3);
                    var4.method718(var7, (byte) 1);
                    int var8 = field294.method2552(1);
                    if (var8 == 1) {
                        field329[++field328 - 1] = var3;
                    }
                } else if (var6 == 2) {
                    field327[++field562 - 1] = var3;
                    var4.field859 = field395;
                    int var9 = field294.method2552(3);
                    var4.method718(var9, (byte) 2);
                    int var10 = field294.method2552(3);
                    var4.method718(var10, (byte) 2);
                    int var11 = field294.method2552(1);
                    if (var11 == 1) {
                        field329[++field328 - 1] = var3;
                    }
                } else if (var6 == 3) {
                    field415[++field414 - 1] = var3;
                }
            }
        }
    }

    @ObfuscatedName("aj.be(ZI)V")
    public static final void method1064(boolean arg0) {
        while (true) {
            if (field294.method2554(field333) >= 27) {
                int var1 = field294.method2552(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field325[var1] == null) {
                        field325[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field325[var1];
                    field327[++field562 - 1] = var1;
                    var3.field859 = field395;
                    var3.field780 = class40.method159(field294.method2552(14));
                    int var4;
                    if (arg0) {
                        var4 = field294.method2552(8);
                        if (var4 > 127) {
                            var4 -= 256;
                        }
                    } else {
                        var4 = field294.method2552(5);
                        if (var4 > 15) {
                            var4 -= 32;
                        }
                    }
                    int var5 = field419[field294.method2552(3)];
                    if (var2) {
                        var3.field861 = var3.field853 = var5;
                    }
                    int var6 = field294.method2552(1);
                    int var7 = field294.method2552(1);
                    if (var7 == 1) {
                        field329[++field328 - 1] = var1;
                    }
                    int var8;
                    if (arg0) {
                        var8 = field294.method2552(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field294.method2552(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field815 = var3.field780.field886;
                    var3.field863 = var3.field780.field909;
                    if (var3.field863 == 0) {
                        var3.field853 = 0;
                    }
                    var3.field819 = var3.field780.field907;
                    var3.field820 = var3.field780.field888;
                    var3.field812 = var3.field780.field894;
                    var3.field822 = var3.field780.field908;
                    var3.field816 = var3.field780.field889;
                    var3.field817 = var3.field780.field890;
                    var3.field858 = var3.field780.field891;
                    var3.method722(Statics.field2250.field865[0] + var8, Statics.field2250.field818[0] + var4, var6 == 1);
                    continue;
                }
            }
            field294.method2553();
            return;
        }
    }

    @ObfuscatedName("o.bc(B)V")
    public static final void method90() {
        for (int var0 = 0; var0 < field328; var0++) {
            int var1 = field329[var0];
            class35 var2 = field325[var1];
            int var3 = field294.method2316();
            if ((var3 & 0x1) != 0) {
                int var4 = field294.method2434();
                int var5 = field294.method2316();
                var2.method740(var4, var5, field395);
                var2.field850 = field395 + 300;
                var2.field813 = field294.method2351();
                var2.field835 = field294.method2350();
            }
            if ((var3 & 0x8) != 0) {
                int var6 = field294.method2350();
                if (var6 == 65535) {
                    var6 = -1;
                }
                int var7 = field294.method2434();
                if (var2.field821 == var6 && var6 != -1) {
                    int var8 = class43.method729(var6).field991;
                    if (var8 == 1) {
                        var2.field828 = 0;
                        var2.field838 = 0;
                        var2.field845 = var7;
                        var2.field846 = 0;
                    }
                    if (var8 == 2) {
                        var2.field846 = 0;
                    }
                } else if (var6 == -1 || var2.field821 == -1 || class43.method729(var6).field994 >= class43.method729(var2.field821).field994) {
                    var2.field821 = var6;
                    var2.field828 = 0;
                    var2.field838 = 0;
                    var2.field845 = var7;
                    var2.field846 = 0;
                    var2.field869 = var2.field825;
                }
            }
            if ((var3 & 0x20) != 0) {
                var2.field836 = field294.method2351();
                if (var2.field836 == 65535) {
                    var2.field836 = -1;
                }
            }
            if ((var3 & 0x4) != 0) {
                int var9 = field294.method2350();
                int var10 = field294.method2352();
                int var11 = var2.field840 - (var9 - Statics.field1684 - Statics.field1684) * 64;
                int var12 = var2.field849 - (var10 - Statics.field1599 - Statics.field1599) * 64;
                if (var11 != 0 || var12 != 0) {
                    var2.field854 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
                }
            }
            if ((var3 & 0x80) != 0) {
                int var13 = field294.method2344();
                int var14 = field294.method2316();
                var2.method740(var13, var14, field395);
                var2.field850 = field395 + 300;
                var2.field813 = field294.method2350();
                var2.field835 = field294.method2318();
            }
            if ((var3 & 0x2) != 0) {
                var2.field847 = field294.method2350();
                int var15 = field294.method2372();
                var2.field851 = var15 >> 16;
                var2.field834 = (var15 & 0xFFFF) + field395;
                var2.field848 = 0;
                var2.field842 = 0;
                if (var2.field834 > field395) {
                    var2.field848 = -1;
                }
                if (var2.field847 == 65535) {
                    var2.field847 = -1;
                }
            }
            if ((var3 & 0x10) != 0) {
                var2.field780 = class40.method159(field294.method2352());
                var2.field815 = var2.field780.field886;
                var2.field863 = var2.field780.field909;
                var2.field819 = var2.field780.field907;
                var2.field820 = var2.field780.field888;
                var2.field812 = var2.field780.field894;
                var2.field822 = var2.field780.field908;
                var2.field816 = var2.field780.field889;
                var2.field817 = var2.field780.field890;
                var2.field858 = var2.field780.field891;
            }
            if ((var3 & 0x40) != 0) {
                var2.field824 = field294.method2324();
                var2.field827 = 100;
            }
        }
    }

    @ObfuscatedName("n.bj(La;IIBI)V")
    public static final void method111(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field865[0];
        int var5 = arg0.field818[0];
        int var6 = arg0.method32();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var9 = arg0.method32();
        field568.field1890 = arg1;
        field568.field1886 = arg2;
        field568.field1887 = 1;
        field568.field1889 = 1;
        class11 var10 = field568;
        int var11 = class106.method92(var4, var5, var9, var10, field347[arg0.field56], true, field569, field570);
        if (var11 >= 1) {
            for (int var12 = 0; var12 < var11 - 1; var12++) {
                arg0.method17(field569[var12], field570[var12], arg3);
            }
        }
    }

    @ObfuscatedName("p.bi(IIS)V")
    public static final void method227(int arg0, int arg1) {
        if (field431 < 2 && field302 == 0 && !field409) {
            return;
        }
        String var2;
        if (field302 == 1 && field431 < 2) {
            var2 = class157.field2403 + class157.field2473 + field443 + " " + class2.field24;
        } else if (field409 && field431 < 2) {
            var2 = field447 + class157.field2473 + field448 + " " + class2.field24;
        } else {
            var2 = method747(field431 - 1);
        }
        if (field431 > 2) {
            var2 = var2 + class2.method589(16777215) + " " + '/' + " " + (field431 - 2) + class157.field2357;
        }
        Statics.field29.method3761(var2, arg0 + 4, arg1 + 15, 16777215, 0, field395 / 1000);
    }

    @ObfuscatedName("hm.bd(I)V")
    public static final void method3626() {
        int var0 = Statics.field2115;
        int var1 = Statics.field1388;
        int var2 = Statics.field1374;
        int var3 = Statics.field430;
        int var4 = 6116423;
        class80.method1674(var0, var1, var2, var3, var4);
        class80.method1674(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1711(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field29.method3722(class157.field2466, var0 + 3, var1 + 14, var4, -1);
        int var5 = class140.field2163;
        int var6 = class140.field2172 * 488798971;
        for (int var7 = 0; var7 < field431; var7++) {
            int var8 = (field431 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            Statics.field29.method3722(method747(var7), var0 + 3, var8, var9, 0);
        }
        int var10 = Statics.field2115;
        int var11 = Statics.field1388;
        int var12 = Statics.field1374;
        int var13 = Statics.field430;
        for (int var14 = 0; var14 < field492; var14++) {
            if (field499[var14] + field497[var14] > var10 && field497[var14] < var10 + var12 && field500[var14] + field457[var14] > var11 && field457[var14] < var11 + var13) {
                field498[var14] = true;
            }
        }
    }

    @ObfuscatedName("fu.bx(IIIIB)V")
    public static final void method2925(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field492; var4++) {
            if (field499[var4] + field497[var4] > arg0 && field497[var4] < arg0 + arg2 && field500[var4] + field457[var4] > arg1 && field457[var4] < arg1 + arg3) {
                field494[var4] = true;
            }
        }
    }

    @ObfuscatedName("ef.bf(B)V")
    public static final void method2769() {
        method2250();
        if (Statics.field2074 != null || field537 != null) {
            return;
        }
        int var18;
        int var19;
        label228: {
            int var0 = class140.field2169;
            if (field309) {
                if (var0 != 1 && (Statics.field1618 || var0 != 4)) {
                    int var1 = class140.field2163;
                    int var2 = class140.field2172 * 488798971;
                    if (var1 < Statics.field2115 - 10 || var1 > Statics.field2115 + Statics.field1374 + 10 || var2 < Statics.field1388 - 10 || var2 > Statics.field430 + Statics.field1388 + 10) {
                        field309 = false;
                        method2925(Statics.field2115, Statics.field1388, Statics.field1374, Statics.field430);
                    }
                }
                if (var0 == 1 || !Statics.field1618 && var0 == 4) {
                    int var3 = Statics.field2115;
                    int var4 = Statics.field1388;
                    int var5 = Statics.field1374;
                    int var6 = class140.field2170;
                    int var7 = class140.field2164;
                    int var8 = -1;
                    for (int var9 = 0; var9 < field431; var9++) {
                        int var10 = (field431 - 1 - var9) * 15 + var4 + 31;
                        if (var6 > var3 && var6 < var3 + var5 && var7 > var10 - 13 && var7 < var10 + 3) {
                            var8 = var9;
                        }
                    }
                    if (var8 != -1 && var8 >= 0) {
                        int var11 = field432[var8];
                        int var12 = field433[var8];
                        int var13 = field434[var8];
                        int var14 = field524[var8];
                        String var15 = field438[var8];
                        String var16 = field366[var8];
                        method1750(var11, var12, var13, var14, var15, var16, class140.field2170, class140.field2164);
                    }
                    field309 = false;
                    method2925(Statics.field2115, Statics.field1388, Statics.field1374, Statics.field430);
                }
            } else {
                if ((var0 == 1 || !Statics.field1618 && var0 == 4) && field431 > 0) {
                    int var17 = field434[field431 - 1];
                    if (var17 == 39 || var17 == 40 || var17 == 41 || var17 == 42 || var17 == 43 || var17 == 33 || var17 == 34 || var17 == 35 || var17 == 36 || var17 == 37 || var17 == 38 || var17 == 1005) {
                        var18 = field432[field431 - 1];
                        var19 = field433[field431 - 1];
                        class173 var20 = class173.method691(var19);
                        if (class178.method1935(method883(var20))) {
                            break label228;
                        }
                        int var21 = method883(var20);
                        boolean var22 = (var21 >> 29 & 0x1) != 0;
                        if (var22) {
                            break label228;
                        }
                    }
                }
                if (var0 == 1 || !Statics.field1618 && var0 == 4) {
                    label235: {
                        if (field428 != 1 || field431 <= 2) {
                            int var27 = field431 - 1;
                            boolean var28;
                            if (var27 < 0) {
                                var28 = false;
                            } else {
                                int var29 = field434[var27];
                                if (var29 >= 2000) {
                                    var29 -= 2000;
                                }
                                if (var29 == 1007) {
                                    var28 = true;
                                } else {
                                    var28 = false;
                                }
                            }
                            if (!var28) {
                                break label235;
                            }
                        }
                        var0 = 2;
                    }
                }
                if ((var0 == 1 || !Statics.field1618 && var0 == 4) && field431 > 0) {
                    int var30 = field431 - 1;
                    if (var30 >= 0) {
                        int var31 = field432[var30];
                        int var32 = field433[var30];
                        int var33 = field434[var30];
                        int var34 = field524[var30];
                        String var35 = field438[var30];
                        String var36 = field366[var30];
                        method1750(var31, var32, var33, var34, var35, var36, class140.field2170, class140.field2164);
                    }
                }
                if (var0 == 2 && field431 > 0) {
                    method209(class140.field2170, class140.field2164);
                }
            }
            return;
        }
        if (Statics.field2074 != null && !field544 && field428 != 1) {
            int var23 = field431 - 1;
            boolean var24;
            if (var23 < 0) {
                var24 = false;
            } else {
                int var25 = field434[var23];
                if (var25 >= 2000) {
                    var25 -= 2000;
                }
                if (var25 == 1007) {
                    var24 = true;
                } else {
                    var24 = false;
                }
            }
            if (!var24 && field431 > 0) {
                method991(field534, field293);
            }
        }
        field544 = false;
        field342 = 0;
        if (Statics.field2074 != null) {
            method2263(Statics.field2074);
        }
        Statics.field2074 = class173.method691(var19);
        field536 = var18;
        field534 = class140.field2170;
        field293 = class140.field2164;
        if (field431 > 0) {
            int var26 = field431 - 1;
            Statics.field181 = new class31();
            Statics.field181.field705 = field432[var26];
            Statics.field181.field697 = field433[var26];
            Statics.field181.field706 = field434[var26];
            Statics.field181.field699 = field524[var26];
            Statics.field181.field698 = field438[var26];
        }
        method2263(Statics.field2074);
    }

    @ObfuscatedName("p.bb(IIB)V")
    public static final void method209(int arg0, int arg1) {
        int var2 = Statics.field29.method3717(class157.field2466);
        for (int var3 = 0; var3 < field431; var3++) {
            int var4 = Statics.field29.method3717(method747(var3));
            if (var4 > var2) {
                var2 = var4;
            }
        }
        var2 += 8;
        int var5 = field431 * 15 + 22;
        int var6 = arg0 - var2 / 2;
        if (var2 + var6 > Statics.field2191) {
            var6 = Statics.field2191 - var2;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (var5 + arg1 > Statics.field1567) {
            var7 = Statics.field1567 - var5;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        field309 = true;
        Statics.field2115 = var6;
        Statics.field1388 = var7;
        Statics.field1374 = var2;
        Statics.field430 = field431 * 15 + 22;
    }

    @ObfuscatedName("client.bz(Laz;III)V")
    public static final void method303(class31 arg0, int arg1, int arg2) {
        method1750(arg0.field705, arg0.field697, arg0.field706, arg0.field699, arg0.field698, arg0.field698, arg1, arg2);
    }

    @ObfuscatedName("cn.ba(IIIILjava/lang/String;Ljava/lang/String;IIB)V")
    public static final void method1750(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 37) {
            field330.method2549(54);
            field330.method2404(arg0);
            field330.method2499(arg1);
            field330.method2427(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 35) {
            field330.method2549(227);
            field330.method2304(arg1);
            field330.method2404(arg3);
            field330.method2303(arg0);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 22) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(188);
            field330.method2485(class137.field2122[82] ? 1 : 0);
            field330.method2427(Statics.field1599 + arg1);
            field330.method2303(arg3);
            field330.method2404(Statics.field1684 + arg0);
        }
        if (arg2 == 4) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(4);
            field330.method2404(Statics.field1684 + arg0);
            field330.method2303(arg3 >> 14 & 0x7FFF);
            field330.method2340(class137.field2122[82] ? 1 : 0);
            field330.method2404(Statics.field1599 + arg1);
        }
        if (arg2 == 46) {
            class3 var8 = field411[arg3];
            if (var8 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(255);
                field330.method2427(arg3);
                field330.method2301(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 26) {
            Statics.method1755();
        }
        if (arg2 == 13) {
            class35 var9 = field325[arg3];
            if (var9 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(240);
                field330.method2303(arg3);
                field330.method2485(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 18) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(164);
            field330.method2427(arg3);
            field330.method2301(class137.field2122[82] ? 1 : 0);
            field330.method2303(Statics.field1599 + arg1);
            field330.method2404(Statics.field1684 + arg0);
        }
        if (arg2 == 1003) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            class35 var10 = field325[arg3];
            if (var10 != null) {
                class40 var11 = var10.field780;
                if (var11.field910 != null) {
                    var11 = var11.method774();
                }
                if (var11 != null) {
                    field330.method2549(105);
                    field330.method2347(var11.field897);
                }
            }
        }
        if (arg2 == 38) {
            method149();
            class173 var12 = class173.method691(arg1);
            field302 = 1;
            Statics.field2673 = arg0;
            Statics.field1075 = arg1;
            Statics.field283 = arg3;
            method2263(var12);
            field443 = class2.method589(16748608) + class52.method578(arg3).field1122 + class2.method589(16777215);
            if (field443 == null) {
                field443 = "null";
            }
            return;
        }
        if (arg2 == 1) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(185);
            field330.method2303(Statics.field1684 + arg0);
            field330.method2427(Statics.field283);
            field330.method2340(class137.field2122[82] ? 1 : 0);
            field330.method2304(Statics.field1075);
            field330.method2303(arg3 >> 14 & 0x7FFF);
            field330.method2404(Statics.field2673);
            field330.method2404(Statics.field1599 + arg1);
        }
        if (arg2 == 7) {
            class35 var13 = field325[arg3];
            if (var13 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(141);
                field330.method2427(Statics.field283);
                field330.method2404(arg3);
                field330.method2301(class137.field2122[82] ? 1 : 0);
                field330.method2404(Statics.field2673);
                field330.method2499(Statics.field1075);
            }
        }
        if (arg2 == 44) {
            class3 var14 = field411[arg3];
            if (var14 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(28);
                field330.method2485(class137.field2122[82] ? 1 : 0);
                field330.method2347(arg3);
            }
        }
        if (arg2 == 12) {
            class35 var15 = field325[arg3];
            if (var15 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(62);
                field330.method2301(class137.field2122[82] ? 1 : 0);
                field330.method2427(arg3);
            }
        }
        if (arg2 == 32) {
            field330.method2549(12);
            field330.method2404(arg0);
            field330.method2303(field445);
            field330.method2470(arg1);
            field330.method2499(Statics.field2145);
            field330.method2303(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 29) {
            field330.method2549(201);
            field330.method2304(arg1);
            class173 var16 = class173.method691(arg1);
            if (var16.field2870 != null && var16.field2870[0][0] == 5) {
                int var17 = var16.field2870[0][1];
                if (class176.field2907[var17] != var16.field2872[0]) {
                    class176.field2907[var17] = var16.field2872[0];
                    method2614(var17);
                }
            }
        }
        if (arg2 == 57 || arg2 == 1007) {
            class173 var18 = class173.method2802(arg1, arg0);
            if (var18 != null) {
                int var19 = var18.field2878;
                class173 var20 = class173.method2802(arg1, arg0);
                if (var20 != null) {
                    if (var20.field2892 != null) {
                        class1 var21 = new class1();
                        var21.field3 = var20;
                        var21.field15 = arg3;
                        var21.field10 = arg5;
                        var21.field6 = var20.field2892;
                        class37.method2607(var21, 200000);
                    }
                    boolean var22 = true;
                    if (var20.field2764 > 0) {
                        var22 = method120(var20);
                    }
                    if (var22 && class178.method824(method883(var20), arg3 - 1)) {
                        if (arg3 == 1) {
                            field330.method2549(175);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 2) {
                            field330.method2549(85);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 3) {
                            field330.method2549(222);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 4) {
                            field330.method2549(73);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 5) {
                            field330.method2549(61);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 6) {
                            field330.method2549(173);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 7) {
                            field330.method2549(183);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 8) {
                            field330.method2549(194);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 9) {
                            field330.method2549(120);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                        if (arg3 == 10) {
                            field330.method2549(198);
                            field330.method2304(arg1);
                            field330.method2404(arg0);
                            field330.method2404(var19);
                        }
                    }
                }
            }
        }
        if (arg2 == 23) {
            Statics.field1907.method1870(Statics.field1387, arg0, arg1);
        }
        if (arg2 == 24) {
            class173 var23 = class173.method691(arg1);
            boolean var24 = true;
            if (var23.field2764 > 0) {
                var24 = method120(var23);
            }
            if (var24) {
                field330.method2549(201);
                field330.method2304(arg1);
            }
        }
        if (arg2 == 41) {
            field330.method2549(104);
            field330.method2470(arg1);
            field330.method2303(arg0);
            field330.method2347(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 6) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(228);
            field330.method2303(Statics.field1599 + arg1);
            field330.method2339(class137.field2122[82] ? 1 : 0);
            field330.method2427(arg3 >> 14 & 0x7FFF);
            field330.method2404(Statics.field1684 + arg0);
        }
        if (arg2 == 5) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(182);
            field330.method2427(arg3 >> 14 & 0x7FFF);
            field330.method2301(class137.field2122[82] ? 1 : 0);
            field330.method2303(Statics.field1684 + arg0);
            field330.method2404(Statics.field1599 + arg1);
        }
        if (arg2 == 30 && field453 == null) {
            field330.method2549(13);
            field330.method2303(arg0);
            field330.method2357(arg1);
            field453 = class173.method2802(arg1, arg0);
            method2263(field453);
        }
        if (arg2 == 1001) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(88);
            field330.method2404(arg3 >> 14 & 0x7FFF);
            field330.method2303(Statics.field1684 + arg0);
            field330.method2303(Statics.field1599 + arg1);
            field330.method2485(class137.field2122[82] ? 1 : 0);
        }
        if (arg2 == 20) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(131);
            field330.method2404(Statics.field1684 + arg0);
            field330.method2340(class137.field2122[82] ? 1 : 0);
            field330.method2303(Statics.field1599 + arg1);
            field330.method2303(arg3);
        }
        if (arg2 == 28) {
            field330.method2549(201);
            field330.method2304(arg1);
            class173 var25 = class173.method691(arg1);
            if (var25.field2870 != null && var25.field2870[0][0] == 5) {
                int var26 = var25.field2870[0][1];
                class176.field2907[var26] = 1 - class176.field2907[var26];
                method2614(var26);
            }
        }
        if (arg2 == 8) {
            class35 var27 = field325[arg3];
            if (var27 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(136);
                field330.method2301(class137.field2122[82] ? 1 : 0);
                field330.method2303(field445);
                field330.method2304(Statics.field2145);
                field330.method2404(arg3);
            }
        }
        if (arg2 == 33) {
            field330.method2549(152);
            field330.method2404(arg0);
            field330.method2499(arg1);
            field330.method2427(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 45) {
            class3 var28 = field411[arg3];
            if (var28 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(214);
                field330.method2303(arg3);
                field330.method2301(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 58) {
            class173 var29 = class173.method2802(arg1, arg0);
            if (var29 != null) {
                field330.method2549(207);
                field330.method2427(var29.field2878);
                field330.method2404(arg0);
                field330.method2303(field445);
                field330.method2427(field512);
                field330.method2357(Statics.field2145);
                field330.method2470(arg1);
            }
        }
        if (arg2 == 43) {
            field330.method2549(133);
            field330.method2404(arg0);
            field330.method2404(arg3);
            field330.method2304(arg1);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 31) {
            field330.method2549(129);
            field330.method2470(Statics.field1075);
            field330.method2404(Statics.field283);
            field330.method2427(arg0);
            field330.method2404(Statics.field2673);
            field330.method2357(arg1);
            field330.method2303(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 25) {
            class173 var30 = class173.method2802(arg1, arg0);
            if (var30 != null) {
                method149();
                int var31 = class178.method2914(method883(var30));
                int var32 = var30.field2878;
                class173 var33 = class173.method2802(arg1, arg0);
                if (var33 != null && var33.field2793 != null) {
                    class1 var34 = new class1();
                    var34.field3 = var33;
                    var34.field6 = var33.field2793;
                    class37.method2607(var34, 200000);
                }
                field512 = var32;
                field409 = true;
                Statics.field2145 = arg1;
                field445 = arg0;
                Statics.field574 = var31;
                method2263(var33);
                field302 = 0;
                String var35;
                if (class178.method2914(method883(var30)) == 0) {
                    var35 = null;
                } else if (var30.field2807 == null || var30.field2807.trim().length() == 0) {
                    var35 = null;
                } else {
                    var35 = var30.field2807;
                }
                field447 = var35;
                if (field447 == null) {
                    field447 = "Null";
                }
                if (var30.field2759) {
                    field448 = var30.field2831 + class2.method589(16777215);
                } else {
                    field448 = class2.method589(65280) + var30.field2833 + class2.method589(16777215);
                }
            }
            return;
        }
        if (arg2 == 9) {
            class35 var36 = field325[arg3];
            if (var36 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(31);
                field330.method2485(class137.field2122[82] ? 1 : 0);
                field330.method2404(arg3);
            }
        }
        if (arg2 == 47) {
            class3 var37 = field411[arg3];
            if (var37 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(144);
                field330.method2347(arg3);
                field330.method2340(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 34) {
            field330.method2549(168);
            field330.method2357(arg1);
            field330.method2427(arg3);
            field330.method2303(arg0);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 40) {
            field330.method2549(235);
            field330.method2404(arg3);
            field330.method2303(arg0);
            field330.method2499(arg1);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 1002) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field330.method2549(186);
            field330.method2303(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 21) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(124);
            field330.method2404(Statics.field1684 + arg0);
            field330.method2301(class137.field2122[82] ? 1 : 0);
            field330.method2427(Statics.field1599 + arg1);
            field330.method2303(arg3);
        }
        if (arg2 == 17) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(170);
            field330.method2301(class137.field2122[82] ? 1 : 0);
            field330.method2404(Statics.field1599 + arg1);
            field330.method2427(Statics.field1684 + arg0);
            field330.method2470(Statics.field2145);
            field330.method2427(arg3);
            field330.method2427(field445);
        }
        if (arg2 == 16) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(225);
            field330.method2340(class137.field2122[82] ? 1 : 0);
            field330.method2470(Statics.field1075);
            field330.method2347(Statics.field1599 + arg1);
            field330.method2404(Statics.field283);
            field330.method2347(Statics.field1684 + arg0);
            field330.method2404(arg3);
            field330.method2404(Statics.field2673);
        }
        if (arg2 == 1004) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field330.method2549(142);
            field330.method2303(arg3);
        }
        if (arg2 == 48) {
            class3 var38 = field411[arg3];
            if (var38 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(206);
                field330.method2339(class137.field2122[82] ? 1 : 0);
                field330.method2427(arg3);
            }
        }
        if (arg2 == 36) {
            field330.method2549(84);
            field330.method2470(arg1);
            field330.method2347(arg0);
            field330.method2347(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 2) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(197);
            field330.method2347(field445);
            field330.method2304(Statics.field2145);
            field330.method2301(class137.field2122[82] ? 1 : 0);
            field330.method2303(Statics.field1684 + arg0);
            field330.method2303(Statics.field1599 + arg1);
            field330.method2427(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 49) {
            class3 var39 = field411[arg3];
            if (var39 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(158);
                field330.method2303(arg3);
                field330.method2339(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 50) {
            class3 var40 = field411[arg3];
            if (var40 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(9);
                field330.method2339(class137.field2122[82] ? 1 : 0);
                field330.method2427(arg3);
            }
        }
        if (arg2 == 14) {
            class3 var41 = field411[arg3];
            if (var41 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(226);
                field330.method2427(Statics.field2673);
                field330.method2404(Statics.field283);
                field330.method2301(class137.field2122[82] ? 1 : 0);
                field330.method2357(Statics.field1075);
                field330.method2303(arg3);
            }
        }
        if (arg2 == 51) {
            class3 var42 = field411[arg3];
            if (var42 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(67);
                field330.method2427(arg3);
                field330.method2301(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class35 var43 = field325[arg3];
            if (var43 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(0);
                field330.method2347(arg3);
                field330.method2340(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 39) {
            field330.method2549(21);
            field330.method2499(arg1);
            field330.method2427(arg0);
            field330.method2303(arg3);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 1005) {
            class173 var44 = class173.method691(arg1);
            if (var44 == null || var44.field2877[arg0] < 100000) {
                field330.method2549(142);
                field330.method2303(arg3);
            } else {
                class12.method183(27, "", var44.field2877[arg0] + " x " + class52.method578(arg3).field1122);
            }
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 15) {
            class3 var45 = field411[arg3];
            if (var45 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(42);
                field330.method2357(Statics.field2145);
                field330.method2404(arg3);
                field330.method2404(field445);
                field330.method2340(class137.field2122[82] ? 1 : 0);
            }
        }
        if (arg2 == 42) {
            field330.method2549(6);
            field330.method2357(arg1);
            field330.method2303(arg3);
            field330.method2427(arg0);
            field339 = 0;
            Statics.field142 = class173.method691(arg1);
            field403 = arg0;
        }
        if (arg2 == 19) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(78);
            field330.method2301(class137.field2122[82] ? 1 : 0);
            field330.method2303(Statics.field1684 + arg0);
            field330.method2347(Statics.field1599 + arg1);
            field330.method2427(arg3);
        }
        if (arg2 == 3) {
            field398 = arg6;
            field480 = arg7;
            field401 = 2;
            field306 = 0;
            field297 = arg0;
            field320 = arg1;
            field330.method2549(106);
            field330.method2303(arg3 >> 14 & 0x7FFF);
            field330.method2427(Statics.field1684 + arg0);
            field330.method2340(class137.field2122[82] ? 1 : 0);
            field330.method2427(Statics.field1599 + arg1);
        }
        if (arg2 == 10) {
            class35 var46 = field325[arg3];
            if (var46 != null) {
                field398 = arg6;
                field480 = arg7;
                field401 = 2;
                field306 = 0;
                field297 = arg0;
                field320 = arg1;
                field330.method2549(202);
                field330.method2339(class137.field2122[82] ? 1 : 0);
                field330.method2303(arg3);
            }
        }
        if (field302 != 0) {
            field302 = 0;
            method2263(class173.method691(Statics.field1075));
        }
        if (field409) {
            method149();
        }
        if (Statics.field142 != null && field339 == 0) {
            method2263(Statics.field142);
        }
    }

    @ObfuscatedName("q.bt(I)V")
    public static void method149() {
        if (!field409) {
            return;
        }
        class173 var0 = class173.method2802(Statics.field2145, field445);
        if (var0 != null && var0.field2815 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field6 = var0.field2815;
            class37.method2607(var1, 200000);
        }
        field409 = false;
        method2263(var0);
    }

    @ObfuscatedName("du.by(B)V")
    public static final void method2250() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field431 - 1; var1++) {
                if (field434[var1] < 1000 && field434[var1 + 1] > 1000) {
                    String var2 = field366[var1];
                    field366[var1] = field366[var1 + 1];
                    field366[var1 + 1] = var2;
                    String var3 = field438[var1];
                    field438[var1] = field438[var1 + 1];
                    field438[var1 + 1] = var3;
                    int var4 = field434[var1];
                    field434[var1] = field434[var1 + 1];
                    field434[var1 + 1] = var4;
                    int var5 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var5;
                    int var6 = field433[var1];
                    field433[var1] = field433[var1 + 1];
                    field433[var1 + 1] = var6;
                    int var7 = field524[var1];
                    field524[var1] = field524[var1 + 1];
                    field524[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
    }

    @ObfuscatedName("dc.bn(Ljava/lang/String;Ljava/lang/String;IIIIB)V")
    public static final void method2373(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field309 || field431 >= 500) {
            return;
        }
        field438[field431] = arg0;
        field366[field431] = arg1;
        field434[field431] = arg2;
        field524[field431] = arg3;
        field432[field431] = arg4;
        field433[field431] = arg5;
        field431++;
    }

    @ObfuscatedName("dt.bm(I)V")
    public static void method2239() {
        for (int var0 = 0; var0 < field431; var0++) {
            int var1 = field434[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field431 - 1) {
                    for (int var3 = var0; var3 < field431 - 1; var3++) {
                        field438[var3] = field438[var3 + 1];
                        field366[var3] = field366[var3 + 1];
                        field434[var3] = field434[var3 + 1];
                        field524[var3] = field524[var3 + 1];
                        field432[var3] = field432[var3 + 1];
                        field433[var3] = field433[var3 + 1];
                    }
                }
                field431--;
            }
        }
    }

    @ObfuscatedName("af.bh(II)Ljava/lang/String;")
    public static String method747(int arg0) {
        return field366[arg0].length() > 0 ? field438[arg0] + class157.field2473 + field366[arg0] : field438[arg0];
    }

    @ObfuscatedName("ar.bp(Lao;IIII)V")
    public static final void method717(class40 arg0, int arg1, int arg2, int arg3) {
        if (field431 >= 400) {
            return;
        }
        if (arg0.field910 != null) {
            arg0 = arg0.method774();
        }
        if (arg0 == null || !arg0.field884 || arg0.field915 && field451 != arg1) {
            return;
        }
        String var4 = arg0.field885;
        if (arg0.field902 != 0) {
            int var6 = arg0.field902;
            int var7 = Statics.field2250.field40;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method589(16711680);
            } else if (var8 < -6) {
                var9 = class2.method589(16723968);
            } else if (var8 < -3) {
                var9 = class2.method589(16740352);
            } else if (var8 < 0) {
                var9 = class2.method589(16756736);
            } else if (var8 > 9) {
                var9 = class2.method589(65280);
            } else if (var8 > 6) {
                var9 = class2.method589(4259584);
            } else if (var8 > 3) {
                var9 = class2.method589(8453888);
            } else if (var8 > 0) {
                var9 = class2.method589(12648192);
            } else {
                var9 = class2.method589(16776960);
            }
            var4 = var4 + var9 + " " + class2.field26 + class157.field2469 + arg0.field902 + class2.field19;
        }
        if (field302 == 1) {
            method2373(class157.field2403, field443 + " " + class2.field24 + " " + class2.method589(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field409) {
            String[] var10 = arg0.field900;
            if (field460) {
                var10 = method2114(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class157.field2465)) {
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
                        method2373(var10[var11], class2.method589(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class157.field2465)) {
                        short var14 = 0;
                        if (field358 != class21.field580) {
                            if (field358 == class21.field577 || field358 == class21.field579 && arg0.field902 > Statics.field2250.field40) {
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
                            method2373(var10[var13], class2.method589(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2373(class157.field2404, class2.method589(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field574 & 0x2) == 2) {
            method2373(field447, field448 + " " + class2.field24 + " " + class2.method589(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("n.bo(La;IIII)V")
    public static final void method107(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field2250 == arg0 || field431 >= 400) {
            return;
        }
        String var9;
        if (arg0.field41 == 0) {
            String var4 = arg0.field39[0] + arg0.field49 + arg0.field39[1];
            int var5 = arg0.field40;
            int var6 = Statics.field2250.field40;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method589(16711680);
            } else if (var7 < -6) {
                var8 = class2.method589(16723968);
            } else if (var7 < -3) {
                var8 = class2.method589(16740352);
            } else if (var7 < 0) {
                var8 = class2.method589(16756736);
            } else if (var7 > 9) {
                var8 = class2.method589(65280);
            } else if (var7 > 6) {
                var8 = class2.method589(4259584);
            } else if (var7 > 3) {
                var8 = class2.method589(8453888);
            } else if (var7 > 0) {
                var8 = class2.method589(12648192);
            } else {
                var8 = class2.method589(16776960);
            }
            var9 = var4 + var8 + " " + class2.field26 + class157.field2469 + arg0.field40 + class2.field19 + arg0.field39[2];
        } else {
            var9 = arg0.field39[0] + arg0.field49 + arg0.field39[1] + " " + class2.field26 + class157.field2375 + arg0.field41 + class2.field19 + arg0.field39[2];
        }
        if (field302 == 1) {
            method2373(class157.field2403, field443 + " " + class2.field24 + " " + class2.method589(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field409) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field417[var10] != null) {
                    short var11 = 0;
                    if (field417[var10].equalsIgnoreCase(class157.field2465)) {
                        if (field314 == class21.field580) {
                            continue;
                        }
                        if (field314 == class21.field577 || field314 == class21.field579 && arg0.field40 > Statics.field2250.field40) {
                            var11 = 2000;
                        }
                        if (Statics.field2250.field54 != 0 && arg0.field54 != 0) {
                            if (Statics.field2250.field54 == arg0.field54) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field349[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field326[var10] + var11;
                    method2373(field417[var10], class2.method589(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field574 & 0x8) == 8) {
            method2373(field447, field448 + " " + class2.field24 + " " + class2.method589(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field431; var14++) {
            if (field434[var14] == 23) {
                field366[var14] = class2.method589(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("cd.bu(IIIIIIIII)V")
    public static final void method1940(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class173.method2908(arg0)) {
            Statics.field1382 = null;
            method716(Statics.field2758[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field1382 != null) {
                method716(Statics.field1382, -1412584499, arg1, arg2, arg3, arg4, Statics.field132, Statics.field280, arg7);
                Statics.field1382 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field494[var8] = true;
            }
        } else {
            field494[arg7] = true;
        }
    }

    @ObfuscatedName("ai.cr([Lfv;IIIIIIIIS)V")
    public static final void method716(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1676(arg2, arg3, arg4, arg5);
        class91.method1999();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class173 var10 = arg0[var9];
            if (var10 != null && (var10.field2779 == arg1 || arg1 == -1412584499 && field537 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field497[field492] = var10.field2773 + arg6;
                    field457[field492] = var10.field2774 + arg7;
                    field499[field492] = var10.field2775;
                    field500[field492] = var10.field2891;
                    var11 = ++field492 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2889 = var11;
                var10.field2890 = field395;
                if (!var10.field2759 || !method192(var10)) {
                    if (var10.field2764 > 0) {
                        int var12 = var10.field2764;
                        if (var12 == 324) {
                            if (field563 == -1) {
                                field563 = var10.field2766;
                                field486 = var10.field2794;
                            }
                            if (field476.field2923) {
                                var10.field2766 = field563;
                            } else {
                                var10.field2766 = field486;
                            }
                        } else if (var12 == 325) {
                            if (field563 == -1) {
                                field563 = var10.field2766;
                                field486 = var10.field2794;
                            }
                            if (field476.field2923) {
                                var10.field2766 = field486;
                            } else {
                                var10.field2766 = field563;
                            }
                        } else if (var12 == 327) {
                            var10.field2809 = 150;
                            var10.field2810 = (int) (Math.sin((double) field395 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2801 = 5;
                            var10.field2858 = 0;
                        } else if (var12 == 328) {
                            var10.field2809 = 150;
                            var10.field2810 = (int) (Math.sin((double) field395 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2801 = 5;
                            var10.field2858 = 1;
                        }
                    }
                    int var13 = var10.field2773 + arg6;
                    int var14 = var10.field2774 + arg7;
                    int var15 = var10.field2754;
                    if (field537 == var10) {
                        if (arg1 != -1412584499 && !var10.field2776) {
                            Statics.field1382 = arg0;
                            Statics.field132 = arg6;
                            Statics.field280 = arg7;
                            continue;
                        }
                        if (field315 && field467) {
                            int var16 = class140.field2163;
                            int var17 = class140.field2172 * 488798971;
                            int var18 = var16 - field429;
                            int var19 = var17 - field465;
                            if (var18 < field468) {
                                var18 = field468;
                            }
                            if (var10.field2775 + var18 > field468 + field298.field2775) {
                                var18 = field468 + field298.field2775 - var10.field2775;
                            }
                            if (var19 < field469) {
                                var19 = field469;
                            }
                            if (var10.field2891 + var19 > field469 + field298.field2891) {
                                var19 = field469 + field298.field2891 - var10.field2891;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2776) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2850 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2850 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2775 + var13;
                        int var27 = var10.field2891 + var14;
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
                        int var30 = var10.field2775 + var13;
                        int var31 = var10.field2891 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2759 || var20 < var22 && var21 < var23) {
                        if (var10.field2764 != 0) {
                            if (var10.field2764 == 1336) {
                                if (field304) {
                                    var14 += 15;
                                    Statics.field693.method3723("Fps:" + field2206, var10.field2775 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field458) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field458) {
                                        var34 = 16711680;
                                    }
                                    Statics.field693.method3723("Mem:" + var33 + "k", var10.field2775 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2764 == 1337) {
                                field290 = var13;
                                field316 = var14;
                                int var37 = var10.field2775;
                                int var38 = var10.field2891;
                                field408++;
                                method2668(class34.field766);
                                boolean var39 = false;
                                if (field420 >= 0) {
                                    int var40 = class33.field750;
                                    int[] var41 = class33.field756;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field420 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method2668(class34.field770);
                                }
                                method1075(true);
                                method2668(var39 ? class34.field768 : class34.field767);
                                method1075(false);
                                method128();
                                for (class30 var43 = (class30) field424.method3528(); var43 != null; var43 = (class30) field424.method3527()) {
                                    if (Statics.field1387 != var43.field692 || var43.field688) {
                                        var43.method3608();
                                    } else if (field395 >= var43.field691) {
                                        var43.method652(field363);
                                        if (var43.field688) {
                                            var43.method3608();
                                        } else {
                                            Statics.field1907.method1771(var43.field692, var43.field686, var43.field683, var43.field684, 60, var43, 0, -1, false);
                                        }
                                    }
                                }
                                method3190(var13, var14, var37, var38, true);
                                int var44 = field442;
                                int var45 = field418;
                                int var46 = field553;
                                int var47 = field554;
                                class80.method1676(var44, var45, var44 + var46, var45 + var47);
                                class91.method1999();
                                if (!field529) {
                                    int var48 = field556;
                                    if (field552 / 256 > var48) {
                                        var48 = field552 / 256;
                                    }
                                    if (field538[4] && field540[4] + 128 > var48) {
                                        var48 = field540[4] + 128;
                                    }
                                    int var49 = field375 + field355 & 0x7FF;
                                    int var50 = Statics.field1696;
                                    int var51 = method2205(Statics.field2250.field840, Statics.field2250.field849, Statics.field1387) - field380;
                                    int var52 = Statics.field2154;
                                    int var53 = var48 * 3 + 600;
                                    int var54 = 2048 - var48 & 0x7FF;
                                    int var55 = 2048 - var49 & 0x7FF;
                                    int var56 = 0;
                                    int var57 = 0;
                                    int var58 = var53;
                                    if (var54 != 0) {
                                        int var59 = class91.field1588[var54];
                                        int var60 = class91.field1591[var54];
                                        int var61 = var57 * var60 - var53 * var59 >> 16;
                                        var58 = var57 * var59 + var53 * var60 >> 16;
                                        var57 = var61;
                                    }
                                    if (var55 != 0) {
                                        int var62 = class91.field1588[var55];
                                        int var63 = class91.field1591[var55];
                                        int var64 = var56 * var63 + var58 * var62 >> 16;
                                        var58 = var58 * var63 - var56 * var62 >> 16;
                                        var56 = var64;
                                    }
                                    Statics.field2198 = var50 - var56;
                                    Statics.field798 = var51 - var57;
                                    Statics.field2229 = var52 - var58;
                                    Statics.field557 = var48;
                                    Statics.field1372 = var49;
                                }
                                int var77;
                                if (field529) {
                                    var77 = method177();
                                } else {
                                    int var65;
                                    if (Statics.field170.field143) {
                                        var65 = Statics.field1387;
                                    } else {
                                        label1296: {
                                            int var66 = 3;
                                            if (Statics.field557 < 310) {
                                                int var67 = Statics.field2198 >> 7;
                                                int var68 = Statics.field2229 >> 7;
                                                int var69 = Statics.field2250.field840 >> 7;
                                                int var70 = Statics.field2250.field849 >> 7;
                                                if (var67 < 0 || var68 < 0 || var67 >= 104 || var68 >= 104) {
                                                    var65 = Statics.field1387;
                                                    break label1296;
                                                }
                                                if ((class6.field82[Statics.field1387][var67][var68] & 0x4) != 0) {
                                                    var66 = Statics.field1387;
                                                }
                                                int var71;
                                                if (var69 > var67) {
                                                    var71 = var69 - var67;
                                                } else {
                                                    var71 = var67 - var69;
                                                }
                                                int var72;
                                                if (var70 > var68) {
                                                    var72 = var70 - var68;
                                                } else {
                                                    var72 = var68 - var70;
                                                }
                                                if (var71 > var72) {
                                                    int var73 = var72 * 65536 / var71;
                                                    int var74 = 32768;
                                                    while (var67 != var69) {
                                                        if (var67 < var69) {
                                                            var67++;
                                                        } else if (var67 > var69) {
                                                            var67--;
                                                        }
                                                        if ((class6.field82[Statics.field1387][var67][var68] & 0x4) != 0) {
                                                            var66 = Statics.field1387;
                                                        }
                                                        var74 += var73;
                                                        if (var74 >= 65536) {
                                                            var74 -= 65536;
                                                            if (var68 < var70) {
                                                                var68++;
                                                            } else if (var68 > var70) {
                                                                var68--;
                                                            }
                                                            if ((class6.field82[Statics.field1387][var67][var68] & 0x4) != 0) {
                                                                var66 = Statics.field1387;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var75 = var71 * 65536 / var72;
                                                    int var76 = 32768;
                                                    while (var68 != var70) {
                                                        if (var68 < var70) {
                                                            var68++;
                                                        } else if (var68 > var70) {
                                                            var68--;
                                                        }
                                                        if ((class6.field82[Statics.field1387][var67][var68] & 0x4) != 0) {
                                                            var66 = Statics.field1387;
                                                        }
                                                        var76 += var75;
                                                        if (var76 >= 65536) {
                                                            var76 -= 65536;
                                                            if (var67 < var69) {
                                                                var67++;
                                                            } else if (var67 > var69) {
                                                                var67--;
                                                            }
                                                            if ((class6.field82[Statics.field1387][var67][var68] & 0x4) != 0) {
                                                                var66 = Statics.field1387;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field2250.field840 >= 0 && Statics.field2250.field849 >= 0 && Statics.field2250.field840 < 13312 && Statics.field2250.field849 < 13312) {
                                                if ((class6.field82[Statics.field1387][Statics.field2250.field840 >> 7][Statics.field2250.field849 >> 7] & 0x4) != 0) {
                                                    var66 = Statics.field1387;
                                                }
                                                var65 = var66;
                                            } else {
                                                var65 = Statics.field1387;
                                            }
                                        }
                                    }
                                    var77 = var65;
                                }
                                int var78 = Statics.field2198;
                                int var79 = Statics.field798;
                                int var80 = Statics.field2229;
                                int var81 = Statics.field557;
                                int var82 = Statics.field1372;
                                for (int var83 = 0; var83 < 5; var83++) {
                                    if (field538[var83]) {
                                        int var84 = (int) (Math.random() * (double) (field539[var83] * 2 + 1) - (double) field539[var83] + Math.sin((double) field541[var83] / 100.0D * (double) field542[var83]) * (double) field540[var83]);
                                        if (var83 == 0) {
                                            Statics.field2198 += var84;
                                        }
                                        if (var83 == 1) {
                                            Statics.field798 += var84;
                                        }
                                        if (var83 == 2) {
                                            Statics.field2229 += var84;
                                        }
                                        if (var83 == 3) {
                                            Statics.field1372 = Statics.field1372 + var84 & 0x7FF;
                                        }
                                        if (var83 == 4) {
                                            Statics.field557 += var84;
                                            if (Statics.field557 < 128) {
                                                Statics.field557 = 128;
                                            }
                                            if (Statics.field557 > 383) {
                                                Statics.field557 = 383;
                                            }
                                        }
                                    }
                                }
                                int var85 = class140.field2163;
                                int var86 = class140.field2172 * 488798971;
                                if (class140.field2169 != 0) {
                                    var85 = class140.field2170;
                                    var86 = class140.field2164;
                                }
                                if (var85 >= var44 && var85 < var44 + var46 && var86 >= var45 && var86 < var45 + var47) {
                                    class105.field1829 = true;
                                    class105.field1854 = 0;
                                    class105.field1860 = var85 - var44;
                                    class105.field1822 = var86 - var45;
                                } else {
                                    class105.field1829 = false;
                                    class105.field1854 = 0;
                                }
                                Statics.method749();
                                class80.method1674(var44, var45, var46, var47, 0);
                                Statics.method749();
                                int var87 = class91.field1576;
                                class91.field1576 = field488;
                                Statics.field1907.method1892(Statics.field2198, Statics.field798, Statics.field2229, Statics.field557, Statics.field1372, var77);
                                class91.field1576 = var87;
                                Statics.method749();
                                Statics.field1907.method1916();
                                field384 = 0;
                                boolean var88 = false;
                                int var89 = -1;
                                int var90 = class33.field750;
                                int[] var91 = class33.field756;
                                for (int var92 = 0; var92 < field562 + var90; var92++) {
                                    class38 var93;
                                    if (var92 < var90) {
                                        var93 = field411[var91[var92]];
                                        if (field420 == var91[var92]) {
                                            var88 = true;
                                            var89 = var92;
                                            continue;
                                        }
                                    } else {
                                        var93 = field325[field327[var92 - var90]];
                                    }
                                    method2127(var93, var92, var44, var45, var46, var47);
                                }
                                if (var88) {
                                    method2127(field411[field420], var89, var44, var45, var46, var47);
                                }
                                for (int var94 = 0; var94 < field384; var94++) {
                                    int var95 = field479[var94];
                                    int var96 = field357[var94];
                                    int var97 = field389[var94];
                                    int var98 = field388[var94];
                                    boolean var99 = true;
                                    while (var99) {
                                        var99 = false;
                                        for (int var100 = 0; var100 < var94; var100++) {
                                            if (var96 + 2 > field357[var100] - field388[var100] && var96 - var98 < field357[var100] + 2 && var95 - var97 < field479[var100] + field389[var100] && var95 + var97 > field479[var100] - field389[var100] && field357[var100] - field388[var100] < var96) {
                                                var96 = field357[var100] - field388[var100];
                                                var99 = true;
                                            }
                                        }
                                    }
                                    field359 = field479[var94];
                                    field397 = field357[var94] = var96;
                                    String var101 = field551[var94];
                                    if (field362 == 0) {
                                        int var102 = 16776960;
                                        if (field390[var94] < 6) {
                                            var102 = field319[field390[var94]];
                                        }
                                        if (field390[var94] == 6) {
                                            var102 = field408 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field390[var94] == 7) {
                                            var102 = field408 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field390[var94] == 8) {
                                            var102 = field408 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field390[var94] == 9) {
                                            int var103 = 150 - field392[var94];
                                            if (var103 < 50) {
                                                var102 = var103 * 1280 + 16711680;
                                            } else if (var103 < 100) {
                                                var102 = 16776960 - (var103 - 50) * 327680;
                                            } else if (var103 < 150) {
                                                var102 = (var103 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field390[var94] == 10) {
                                            int var104 = 150 - field392[var94];
                                            if (var104 < 50) {
                                                var102 = var104 * 5 + 16711680;
                                            } else if (var104 < 100) {
                                                var102 = 16711935 - (var104 - 50) * 327680;
                                            } else if (var104 < 150) {
                                                var102 = (var104 - 100) * 327680 + 255 - (var104 - 100) * 5;
                                            }
                                        }
                                        if (field390[var94] == 11) {
                                            int var105 = 150 - field392[var94];
                                            if (var105 < 50) {
                                                var102 = 16777215 - var105 * 327685;
                                            } else if (var105 < 100) {
                                                var102 = (var105 - 50) * 327685 + 65280;
                                            } else if (var105 < 150) {
                                                var102 = 16777215 - (var105 - 100) * 327680;
                                            }
                                        }
                                        if (field391[var94] == 0) {
                                            Statics.field29.method3794(var101, field359 + var44, field397 + var45, var102, 0);
                                        }
                                        if (field391[var94] == 1) {
                                            Statics.field29.method3715(var101, field359 + var44, field397 + var45, var102, 0, field408);
                                        }
                                        if (field391[var94] == 2) {
                                            Statics.field29.method3727(var101, field359 + var44, field397 + var45, var102, 0, field408);
                                        }
                                        if (field391[var94] == 3) {
                                            Statics.field29.method3728(var101, field359 + var44, field397 + var45, var102, 0, field408, 150 - field392[var94]);
                                        }
                                        if (field391[var94] == 4) {
                                            int var106 = (150 - field392[var94]) * (Statics.field29.method3717(var101) + 100) / 150;
                                            class80.method1681(field359 + var44 - 50, var45, field359 + var44 + 50, var45 + var47);
                                            Statics.field29.method3722(var101, field359 + var44 + 50 - var106, field397 + var45, var102, 0);
                                            class80.method1676(var44, var45, var44 + var46, var45 + var47);
                                        }
                                        if (field391[var94] == 5) {
                                            int var107 = 150 - field392[var94];
                                            int var108 = 0;
                                            if (var107 < 25) {
                                                var108 = var107 - 25;
                                            } else if (var107 > 125) {
                                                var108 = var107 - 125;
                                            }
                                            class80.method1681(var44, field397 + var45 - Statics.field29.field3183 - 1, var44 + var46, field397 + var45 + 5);
                                            Statics.field29.method3794(var101, field359 + var44, field397 + var45 + var108, var102, 0);
                                            class80.method1676(var44, var45, var44 + var46, var45 + var47);
                                        }
                                    } else {
                                        Statics.field29.method3794(var101, field359 + var44, field397 + var45, 16776960, 0);
                                    }
                                }
                                if (field352 == 2) {
                                    method43((field439 - Statics.field1684 << 7) + field312, (field310 - Statics.field1599 << 7) + field566, field311 * 2);
                                    if (field359 > -1 && field395 % 20 < 10) {
                                        Statics.field1379[0].method1604(field359 + var44 - 12, field397 + var45 - 28);
                                    }
                                }
                                ((class95) Statics.field1577).method2026(field363);
                                if (field401 == 1) {
                                    Statics.field406[field306 / 100].method1604(field398 - 8, field480 - 8);
                                }
                                if (field401 == 2) {
                                    Statics.field406[field306 / 100 + 4].method1604(field398 - 8, field480 - 8);
                                }
                                field472 = 0;
                                int var109 = (Statics.field2250.field840 >> 7) + Statics.field1684;
                                int var110 = (Statics.field2250.field849 >> 7) + Statics.field1599;
                                if (var109 >= 3053 && var109 <= 3156 && var110 >= 3056 && var110 <= 3136) {
                                    field472 = 1;
                                }
                                if (var109 >= 3072 && var109 <= 3118 && var110 >= 9492 && var110 <= 9535) {
                                    field472 = 1;
                                }
                                if (field472 == 1 && var109 >= 3139 && var109 <= 3199 && var110 >= 3008 && var110 <= 3062) {
                                    field472 = 0;
                                }
                                Statics.field2198 = var78;
                                Statics.field798 = var79;
                                Statics.field2229 = var80;
                                Statics.field557 = var81;
                                Statics.field1372 = var82;
                                if (field317) {
                                    byte var111 = 0;
                                    int var112 = class171.field2742 + class171.field2727 + var111;
                                    if (var112 == 0) {
                                        field317 = false;
                                    }
                                }
                                if (field317) {
                                    class80.method1674(var44, var45, var46, var47, 0);
                                    method127(class157.field2325, false);
                                }
                                field494[var10.field2889] = true;
                                class80.method1676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2764 == 1338) {
                                method2938(var10, var13, var14, var11);
                                class80.method1676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2764 == 1339) {
                                class175 var114 = var10.method3143(false);
                                if (var114 != null) {
                                    if (field525 < 3) {
                                        Statics.field11.method1597(var13, var14, var114.field2904, var114.field2901, 25, 25, field375, 256, var114.field2903, var114.field2900);
                                    } else {
                                        class80.method1669(var13, var14, 0, var114.field2903, var114.field2900);
                                    }
                                }
                                class80.method1676(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2850 == 0) {
                            if (!var10.field2759 && method192(var10) && Statics.field1377 != var10) {
                                continue;
                            }
                            if (!var10.field2759) {
                                if (var10.field2887 > var10.field2784 - var10.field2891) {
                                    var10.field2887 = var10.field2784 - var10.field2891;
                                }
                                if (var10.field2887 < 0) {
                                    var10.field2887 = 0;
                                }
                            }
                            method716(arg0, var10.field2760, var20, var21, var22, var23, var13 - var10.field2830, var14 - var10.field2887, var11);
                            if (var10.field2882 != null) {
                                method716(var10.field2882, var10.field2760, var20, var21, var22, var23, var13 - var10.field2830, var14 - var10.field2887, var11);
                            }
                            class4 var115 = (class4) field450.method3499((long) var10.field2760);
                            if (var115 != null) {
                                method1940(var115.field67, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1676(arg2, arg3, arg4, arg5);
                            class91.method1999();
                        }
                        if (field383 || field496[var11] || field514 > 1) {
                            if (var10.field2850 == 0 && !var10.field2759 && var10.field2784 > var10.field2891) {
                                int var116 = var10.field2775 + var13;
                                int var117 = var10.field2887;
                                int var118 = var10.field2891;
                                int var119 = var10.field2784;
                                Statics.field105[0].method1736(var116, var14);
                                Statics.field105[1].method1736(var116, var14 + var118 - 16);
                                class80.method1674(var116, var14 + 16, 16, var118 - 32, field367);
                                int var120 = (var118 - 32) * var118 / var119;
                                if (var120 < 8) {
                                    var120 = 8;
                                }
                                int var121 = (var118 - 32 - var120) * var117 / (var119 - var118);
                                class80.method1674(var116, var14 + 16 + var121, 16, var120, field368);
                                class80.method1688(var116, var14 + 16 + var121, var120, field370);
                                class80.method1688(var116 + 1, var14 + 16 + var121, var120, field370);
                                class80.method1678(var116, var14 + 16 + var121, 16, field370);
                                class80.method1678(var116, var14 + 17 + var121, 16, field370);
                                class80.method1688(var116 + 15, var14 + 16 + var121, var120, field369);
                                class80.method1688(var116 + 14, var14 + 17 + var121, var120 - 1, field369);
                                class80.method1678(var116, var14 + 15 + var121 + var120, 16, field369);
                                class80.method1678(var116 + 1, var14 + 14 + var121 + var120, 15, field369);
                            }
                            if (var10.field2850 != 1) {
                                if (var10.field2850 == 2) {
                                    int var122 = 0;
                                    for (int var123 = 0; var123 < var10.field2772; var123++) {
                                        for (int var124 = 0; var124 < var10.field2782; var124++) {
                                            int var125 = (var10.field2824 + 32) * var124 + var13;
                                            int var126 = (var10.field2825 + 32) * var123 + var14;
                                            if (var122 < 20) {
                                                var125 += var10.field2750[var122];
                                                var126 += var10.field2827[var122];
                                            }
                                            if (var10.field2876[var122] > 0) {
                                                boolean var127 = false;
                                                boolean var128 = false;
                                                int var129 = var10.field2876[var122] - 1;
                                                if (var125 + 32 > arg2 && var125 < arg4 && var126 + 32 > arg3 && var126 < arg5 || Statics.field2074 == var10 && field536 == var122) {
                                                    class79 var130;
                                                    if (field302 == 1 && Statics.field2673 == var122 && Statics.field1075 == var10.field2760) {
                                                        var130 = class52.method647(var129, var10.field2877[var122], 2, 0, 2, false);
                                                    } else {
                                                        var130 = class52.method647(var129, var10.field2877[var122], 1, 3153952, 2, false);
                                                    }
                                                    if (var130 == null) {
                                                        method2263(var10);
                                                    } else if (Statics.field2074 == var10 && field536 == var122) {
                                                        int var131 = class140.field2163 - field534;
                                                        int var132 = class140.field2172 * 488798971 - field293;
                                                        if (var131 < 5 && var131 > -5) {
                                                            var131 = 0;
                                                        }
                                                        if (var132 < 5 && var132 > -5) {
                                                            var132 = 0;
                                                        }
                                                        if (field342 < 5) {
                                                            var131 = 0;
                                                            var132 = 0;
                                                        }
                                                        var130.method1592(var125 + var131, var126 + var132, 128);
                                                        if (arg1 != -1) {
                                                            class173 var133 = arg0[arg1 & 0xFFFF];
                                                            if (var126 + var132 < class80.field1426 && var133.field2887 > 0) {
                                                                int var134 = field363 * (class80.field1426 - var126 - var132) / 3;
                                                                if (var134 > field363 * 10) {
                                                                    var134 = field363 * 10;
                                                                }
                                                                if (var134 > var133.field2887) {
                                                                    var134 = var133.field2887;
                                                                }
                                                                var133.field2887 -= var134;
                                                                field293 += var134;
                                                                method2263(var133);
                                                            }
                                                            if (var126 + var132 + 32 > class80.field1423 && var133.field2887 < var133.field2784 - var133.field2891) {
                                                                int var135 = field363 * (var126 + var132 + 32 - class80.field1423) / 3;
                                                                if (var135 > field363 * 10) {
                                                                    var135 = field363 * 10;
                                                                }
                                                                if (var135 > var133.field2784 - var133.field2891 - var133.field2887) {
                                                                    var135 = var133.field2784 - var133.field2891 - var133.field2887;
                                                                }
                                                                var133.field2887 += var135;
                                                                field293 -= var135;
                                                                method2263(var133);
                                                            }
                                                        }
                                                    } else if (Statics.field142 == var10 && field403 == var122) {
                                                        var130.method1592(var125, var126, 128);
                                                    } else {
                                                        var130.method1604(var125, var126);
                                                    }
                                                }
                                            } else if (var10.field2842 != null && var122 < 20) {
                                                class79 var136 = var10.method3167(var122);
                                                if (var136 != null) {
                                                    var136.method1604(var125, var126);
                                                } else if (class173.field2854) {
                                                    method2263(var10);
                                                }
                                            }
                                            var122++;
                                        }
                                    }
                                } else if (var10.field2850 == 3) {
                                    int var137;
                                    if (method1477(var10)) {
                                        var137 = var10.field2851;
                                        if (Statics.field1377 == var10 && var10.field2788 != 0) {
                                            var137 = var10.field2788;
                                        }
                                    } else {
                                        var137 = var10.field2860;
                                        if (Statics.field1377 == var10 && var10.field2787 != 0) {
                                            var137 = var10.field2787;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var10.field2789) {
                                            class80.method1674(var13, var14, var10.field2775, var10.field2891, var137);
                                        } else {
                                            class80.method1711(var13, var14, var10.field2775, var10.field2891, var137);
                                        }
                                    } else if (var10.field2789) {
                                        class80.method1716(var13, var14, var10.field2775, var10.field2891, var137, 256 - (var15 & 0xFF));
                                    } else {
                                        class80.method1677(var13, var14, var10.field2775, var10.field2891, var137, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2850 == 4) {
                                    class224 var138 = var10.method3156();
                                    if (var138 != null) {
                                        String var139 = var10.field2818;
                                        int var140;
                                        if (method1477(var10)) {
                                            var140 = var10.field2851;
                                            if (Statics.field1377 == var10 && var10.field2788 != 0) {
                                                var140 = var10.field2788;
                                            }
                                            if (var10.field2805.length() > 0) {
                                                var139 = var10.field2805;
                                            }
                                        } else {
                                            var140 = var10.field2860;
                                            if (Statics.field1377 == var10 && var10.field2787 != 0) {
                                                var140 = var10.field2787;
                                            }
                                        }
                                        if (var10.field2759 && var10.field2878 != -1) {
                                            class52 var141 = class52.method578(var10.field2878);
                                            var139 = var141.field1122;
                                            if (var139 == null) {
                                                var139 = "null";
                                            }
                                            if ((var141.field1135 == 1 || var10.field2879 != 1) && var10.field2879 != -1) {
                                                var139 = class2.method589(16748608) + var139 + class2.field33 + " " + 'x' + method2116(var10.field2879);
                                            }
                                        }
                                        if (field453 == var10) {
                                            class157 var10000 = (class157) null;
                                            var139 = class157.field2471;
                                            var140 = var10.field2860;
                                        }
                                        if (!var10.field2759) {
                                            var139 = method2630(var139, var10);
                                        }
                                        var138.method3725(var139, var13, var14, var10.field2775, var10.field2891, var140, var10.field2823 ? 0 : -1, var10.field2821, var10.field2822, var10.field2820);
                                    } else if (class173.field2854) {
                                        method2263(var10);
                                    }
                                } else if (var10.field2850 == 5) {
                                    if (var10.field2759) {
                                        class79 var143;
                                        if (var10.field2878 == -1) {
                                            var143 = var10.method3139(false);
                                        } else {
                                            var143 = class52.method647(var10.field2878, var10.field2879, var10.field2797, var10.field2798, var10.field2816, false);
                                        }
                                        if (var143 != null) {
                                            int var144 = var143.field1422;
                                            int var145 = var143.field1417;
                                            if (var10.field2796) {
                                                class80.method1681(var13, var14, var10.field2775 + var13, var10.field2891 + var14);
                                                int var146 = (var10.field2775 + (var144 - 1)) / var144;
                                                int var147 = (var10.field2891 + (var145 - 1)) / var145;
                                                for (int var148 = 0; var148 < var146; var148++) {
                                                    for (int var149 = 0; var149 < var147; var149++) {
                                                        if (var10.field2762 != 0) {
                                                            var143.method1599(var144 / 2 + var144 * var148 + var13, var145 / 2 + var145 * var149 + var14, var10.field2762, 4096);
                                                        } else if (var15 == 0) {
                                                            var143.method1604(var144 * var148 + var13, var145 * var149 + var14);
                                                        } else {
                                                            var143.method1592(var144 * var148 + var13, var145 * var149 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1676(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var150 = var10.field2775 * 4096 / var144;
                                                if (var10.field2762 != 0) {
                                                    var143.method1599(var10.field2775 / 2 + var13, var10.field2891 / 2 + var14, var10.field2762, var150);
                                                } else if (var15 != 0) {
                                                    var143.method1577(var13, var14, var10.field2775, var10.field2891, 256 - (var15 & 0xFF));
                                                } else if (var10.field2775 == var144 && var10.field2891 == var145) {
                                                    var143.method1604(var13, var14);
                                                } else {
                                                    var143.method1638(var13, var14, var10.field2775, var10.field2891);
                                                }
                                            }
                                        } else if (class173.field2854) {
                                            method2263(var10);
                                        }
                                    } else {
                                        class79 var142 = var10.method3139(method1477(var10));
                                        if (var142 != null) {
                                            var142.method1604(var13, var14);
                                        } else if (class173.field2854) {
                                            method2263(var10);
                                        }
                                    }
                                } else if (var10.field2850 == 6) {
                                    boolean var151 = method1477(var10);
                                    int var152;
                                    if (var151) {
                                        var152 = var10.field2806;
                                    } else {
                                        var152 = var10.field2837;
                                    }
                                    class105 var153 = null;
                                    int var154 = 0;
                                    if (var10.field2878 != -1) {
                                        class52 var155 = class52.method578(var10.field2878);
                                        if (var155 != null) {
                                            class52 var156 = var155.method1001(var10.field2879);
                                            var153 = var156.method1017(1);
                                            if (var153 == null) {
                                                method2263(var10);
                                            } else {
                                                var153.method2133();
                                                var154 = var153.field1462 / 2;
                                            }
                                        }
                                    } else if (var10.field2801 == 5) {
                                        if (var10.field2858 == 0) {
                                            var153 = field476.method3221((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var153 = Statics.field2250.method14();
                                        }
                                    } else if (var152 == -1) {
                                        var153 = var10.method3142((class43) null, -1, var151, Statics.field2250.field35);
                                        if (var153 == null && class173.field2854) {
                                            method2263(var10);
                                        }
                                    } else {
                                        class43 var157 = class43.method729(var152);
                                        var153 = var10.method3142(var157, var10.field2817, var151, Statics.field2250.field35);
                                        if (var153 == null && class173.field2854) {
                                            method2263(var10);
                                        }
                                    }
                                    class91.method1947(var10.field2775 / 2 + var13, var10.field2891 / 2 + var14);
                                    int var158 = var10.field2819 * class91.field1588[var10.field2809] >> 16;
                                    int var159 = var10.field2819 * class91.field1591[var10.field2809] >> 16;
                                    if (var153 != null) {
                                        if (var10.field2759) {
                                            var153.method2133();
                                            if (var10.field2802) {
                                                var153.method2145(0, var10.field2810, var10.field2811, var10.field2809, var10.field2771, var10.field2840 + var154 + var158, var10.field2840 + var159, var10.field2819);
                                            } else {
                                                var153.method2161(0, var10.field2810, var10.field2811, var10.field2809, var10.field2771, var10.field2840 + var154 + var158, var10.field2840 + var159);
                                            }
                                        } else {
                                            var153.method2161(0, var10.field2810, 0, var10.field2809, 0, var158, var159);
                                        }
                                    }
                                    class91.method2004();
                                } else {
                                    if (var10.field2850 == 7) {
                                        class224 var160 = var10.method3156();
                                        if (var160 == null) {
                                            if (class173.field2854) {
                                                method2263(var10);
                                            }
                                            continue;
                                        }
                                        int var161 = 0;
                                        for (int var162 = 0; var162 < var10.field2772; var162++) {
                                            for (int var163 = 0; var163 < var10.field2782; var163++) {
                                                if (var10.field2876[var161] > 0) {
                                                    class52 var164 = class52.method578(var10.field2876[var161] - 1);
                                                    String var165;
                                                    if (var164.field1135 != 1 && var10.field2877[var161] == 1) {
                                                        var165 = class2.method589(16748608) + var164.field1122 + class2.field33;
                                                    } else {
                                                        var165 = class2.method589(16748608) + var164.field1122 + class2.field33 + " " + 'x' + method2116(var10.field2877[var161]);
                                                    }
                                                    int var166 = (var10.field2824 + 115) * var163 + var13;
                                                    int var167 = (var10.field2825 + 12) * var162 + var14;
                                                    if (var10.field2821 == 0) {
                                                        var160.method3722(var165, var166, var167, var10.field2860, var10.field2823 ? 0 : -1);
                                                    } else if (var10.field2821 == 1) {
                                                        var160.method3794(var165, var10.field2775 / 2 + var166, var167, var10.field2860, var10.field2823 ? 0 : -1);
                                                    } else {
                                                        var160.method3723(var165, var10.field2775 + var166 - 1, var167, var10.field2860, var10.field2823 ? 0 : -1);
                                                    }
                                                }
                                                var161++;
                                            }
                                        }
                                    }
                                    if (var10.field2850 == 8 && Statics.field1172 == var10 && field441 == field440) {
                                        int var168 = 0;
                                        int var169 = 0;
                                        class224 var170 = Statics.field693;
                                        String var171 = var10.field2818;
                                        String var172 = method2630(var171, var10);
                                        while (var172.length() > 0) {
                                            int var173 = var172.indexOf(class2.field23);
                                            String var174;
                                            if (var173 == -1) {
                                                var174 = var172;
                                                var172 = "";
                                            } else {
                                                var174 = var172.substring(0, var173);
                                                var172 = var172.substring(var173 + 4);
                                            }
                                            int var175 = var170.method3717(var174);
                                            if (var175 > var168) {
                                                var168 = var175;
                                            }
                                            var169 += var170.field3183 + 1;
                                        }
                                        var168 += 6;
                                        var169 += 7;
                                        int var176 = var10.field2775 + var13 - 5 - var168;
                                        int var177 = var10.field2891 + var14 + 5;
                                        if (var176 < var13 + 5) {
                                            var176 = var13 + 5;
                                        }
                                        if (var168 + var176 > arg4) {
                                            var176 = arg4 - var168;
                                        }
                                        if (var169 + var177 > arg5) {
                                            var177 = arg5 - var169;
                                        }
                                        class80.method1674(var176, var177, var168, var169, 16777120);
                                        class80.method1711(var176, var177, var168, var169, 0);
                                        String var178 = var10.field2818;
                                        int var179 = var170.field3183 + var177 + 2;
                                        String var180 = method2630(var178, var10);
                                        while (var180.length() > 0) {
                                            int var181 = var180.indexOf(class2.field23);
                                            String var182;
                                            if (var181 == -1) {
                                                var182 = var180;
                                                var180 = "";
                                            } else {
                                                var182 = var180.substring(0, var181);
                                                var180 = var180.substring(var181 + 4);
                                            }
                                            var170.method3722(var182, var176 + 3, var179, 0, -1);
                                            var179 += var170.field3183 + 1;
                                        }
                                    }
                                    if (var10.field2850 == 9) {
                                        if (var10.field2791 == 1) {
                                            int var183;
                                            int var184;
                                            int var185;
                                            int var186;
                                            if (var10.field2792) {
                                                var183 = var13;
                                                var184 = var10.field2891 + var14;
                                                var185 = var10.field2775 + var13;
                                                var186 = var14;
                                            } else {
                                                var183 = var13;
                                                var184 = var14;
                                                var185 = var10.field2775 + var13;
                                                var186 = var10.field2891 + var14;
                                            }
                                            class80.method1682(var183, var184, var185, var186, var10.field2860);
                                        } else {
                                            int var187 = var10.field2775 >= 0 ? var10.field2775 : -var10.field2775;
                                            int var188 = var10.field2891 >= 0 ? var10.field2891 : -var10.field2891;
                                            int var189 = var187;
                                            if (var187 < var188) {
                                                var189 = var188;
                                            }
                                            if (var189 != 0) {
                                                int var190 = (var10.field2775 << 16) / var189;
                                                int var191 = (var10.field2891 << 16) / var189;
                                                if (var191 <= var190) {
                                                    var190 = -var190;
                                                } else {
                                                    var191 = -var191;
                                                }
                                                int var192 = var10.field2791 * var191 >> 17;
                                                int var193 = var10.field2791 * var191 + 1 >> 17;
                                                int var194 = var10.field2791 * var190 >> 17;
                                                int var195 = var10.field2791 * var190 + 1 >> 17;
                                                int var196 = var13 + var192;
                                                int var197 = var13 - var193;
                                                int var198 = var10.field2775 + var13 - var193;
                                                int var199 = var10.field2775 + var13 + var192;
                                                int var200 = var14 + var194;
                                                int var201 = var14 - var195;
                                                int var202 = var10.field2891 + var14 - var195;
                                                int var203 = var10.field2891 + var14 + var194;
                                                class91.method1952(var196, var197, var198);
                                                class91.method1955(var200, var201, var202, var196, var197, var198, var10.field2860);
                                                class91.method1952(var196, var198, var199);
                                                class91.method1955(var200, var202, var203, var196, var198, var199, var10.field2860);
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

    @ObfuscatedName("ee.cx(Ljava/lang/String;Lfv;B)Ljava/lang/String;")
    public static String method2630(String arg0, class173 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method3675(method2774(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field3209 != null) {
                    int var6 = Statics.field3209.field2225;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field3209.field2224 != null) {
                        var5 = (String) Statics.field3209.field2224;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("ck.ch(II)Ljava/lang/String;")
    public static final String method2116(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method589(65408) + var1.substring(0, var1.length() - 8) + class157.field2560 + " " + class2.field26 + var1 + class2.field19 + class2.field33;
        } else if (var1.length() > 6) {
            return " " + class2.method589(16777215) + var1.substring(0, var1.length() - 4) + class157.field2476 + " " + class2.field26 + var1 + class2.field19 + class2.field33;
        } else {
            return " " + class2.method589(16776960) + var1 + class2.field33;
        }
    }

    @ObfuscatedName("ce.cm(Lfv;B)V")
    public static void method1756(class173 arg0) {
        class173 var1 = arg0.field2779 == -1 ? null : class173.method691(arg0.field2779);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field2191;
            var3 = Statics.field1567;
        } else {
            var2 = var1.field2775;
            var3 = var1.field2891;
        }
        method592(arg0, var2, var3, false);
        method125(arg0, var2, var3);
    }

    @ObfuscatedName("u.cn([Lfv;Lfv;ZI)V")
    public static void method151(class173[] arg0, class173 arg1, boolean arg2) {
        int var3 = arg1.field2783 == 0 ? arg1.field2775 : arg1.field2783;
        int var4 = arg1.field2784 == 0 ? arg1.field2891 : arg1.field2784;
        method2600(arg0, arg1.field2760, var3, var4, arg2);
        if (arg1.field2882 != null) {
            method2600(arg1.field2882, arg1.field2760, var3, var4, arg2);
        }
        class4 var5 = (class4) field450.method3499((long) arg1.field2760);
        if (var5 != null) {
            Statics.method2038(var5.field67, var3, var4, arg2);
        }
        if (arg1.field2764 == 1337) {
        }
    }

    @ObfuscatedName("dg.cq([Lfv;IIIZB)V")
    public static void method2600(class173[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class173 var6 = arg0[var5];
            if (var6 != null && var6.field2779 == arg1) {
                method592(var6, arg2, arg3, arg4);
                method125(var6, arg2, arg3);
                if (var6.field2830 > var6.field2783 - var6.field2775) {
                    var6.field2830 = var6.field2783 - var6.field2775;
                }
                if (var6.field2830 < 0) {
                    var6.field2830 = 0;
                }
                if (var6.field2887 > var6.field2784 - var6.field2891) {
                    var6.field2887 = var6.field2784 - var6.field2891;
                }
                if (var6.field2887 < 0) {
                    var6.field2887 = 0;
                }
                if (var6.field2850 == 0) {
                    method151(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("e.cv(Lfv;IIZI)V")
    public static void method592(class173 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2775;
        int var5 = arg0.field2891;
        if (arg0.field2767 == 0) {
            arg0.field2775 = arg0.field2782;
        } else if (arg0.field2767 == 1) {
            arg0.field2775 = arg1 - arg0.field2782;
        } else if (arg0.field2767 == 2) {
            arg0.field2775 = arg0.field2782 * arg1 >> 14;
        }
        if (arg0.field2768 == 0) {
            arg0.field2891 = arg0.field2772;
        } else if (arg0.field2768 == 1) {
            arg0.field2891 = arg2 - arg0.field2772;
        } else if (arg0.field2768 == 2) {
            arg0.field2891 = arg0.field2772 * arg2 >> 14;
        }
        if (arg0.field2767 == 4) {
            arg0.field2775 = arg0.field2891 * arg0.field2777 / arg0.field2778;
        }
        if (arg0.field2768 == 4) {
            arg0.field2891 = arg0.field2778 * arg0.field2775 / arg0.field2777;
        }
        if (field459 && arg0.field2850 == 0) {
            if (arg0.field2891 < 5 && arg0.field2775 < 5) {
                arg0.field2891 = 5;
                arg0.field2775 = 5;
            } else {
                if (arg0.field2891 <= 0) {
                    arg0.field2891 = 5;
                }
                if (arg0.field2775 <= 0) {
                    arg0.field2775 = 5;
                }
            }
        }
        if (arg0.field2764 == 1337) {
            field461 = arg0;
        }
        if (arg3 && arg0.field2880 != null && (arg0.field2775 != var4 || arg0.field2891 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field6 = arg0.field2880;
            field466.method3523(var6);
        }
    }

    @ObfuscatedName("r.cp(Lfv;III)V")
    public static void method125(class173 arg0, int arg1, int arg2) {
        if (arg0.field2765 == 0) {
            arg0.field2773 = arg0.field2769;
        } else if (arg0.field2765 == 1) {
            arg0.field2773 = (arg1 - arg0.field2775) / 2 + arg0.field2769;
        } else if (arg0.field2765 == 2) {
            arg0.field2773 = arg1 - arg0.field2775 - arg0.field2769;
        } else if (arg0.field2765 == 3) {
            arg0.field2773 = arg0.field2769 * arg1 >> 14;
        } else if (arg0.field2765 == 4) {
            arg0.field2773 = (arg0.field2769 * arg1 >> 14) + (arg1 - arg0.field2775) / 2;
        } else {
            arg0.field2773 = arg1 - arg0.field2775 - (arg0.field2769 * arg1 >> 14);
        }
        if (arg0.field2867 == 0) {
            arg0.field2774 = arg0.field2770;
        } else if (arg0.field2867 == 1) {
            arg0.field2774 = (arg2 - arg0.field2891) / 2 + arg0.field2770;
        } else if (arg0.field2867 == 2) {
            arg0.field2774 = arg2 - arg0.field2891 - arg0.field2770;
        } else if (arg0.field2867 == 3) {
            arg0.field2774 = arg0.field2770 * arg2 >> 14;
        } else if (arg0.field2867 == 4) {
            arg0.field2774 = (arg0.field2770 * arg2 >> 14) + (arg2 - arg0.field2891) / 2;
        } else {
            arg0.field2774 = arg2 - arg0.field2891 - (arg0.field2770 * arg2 >> 14);
        }
        if (!field459 || arg0.field2850 != 0) {
            return;
        }
        if (arg0.field2773 < 0) {
            arg0.field2773 = 0;
        } else if (arg0.field2775 + arg0.field2773 > arg1) {
            arg0.field2773 = arg1 - arg0.field2775;
        }
        if (arg0.field2774 < 0) {
            arg0.field2774 = 0;
        } else if (arg0.field2891 + arg0.field2774 > arg2) {
            arg0.field2774 = arg2 - arg0.field2891;
        }
    }

    @ObfuscatedName("u.co(Lfv;IIIIIII)V")
    public static final void method155(class173 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field436) {
            field372 = 32;
        } else {
            field372 = 0;
        }
        field436 = false;
        if (class140.field2162 == 1 || !Statics.field1618 && class140.field2162 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2887 -= 4;
                method2263(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2887 += 4;
                method2263(arg0);
            } else if (arg5 >= arg1 - field372 && arg5 < field372 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2887 = (arg4 - arg3) * var8 / var9;
                method2263(arg0);
                field436 = true;
            }
        }
        if (field487 == 0) {
            return;
        }
        int var10 = arg0.field2775;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2887 += field487 * 45;
            method2263(arg0);
        }
    }

    @ObfuscatedName("hd.cd(II)Ljava/lang/String;")
    public static final String method3675(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("bn.cu(Lfv;S)Z")
    public static final boolean method1477(class173 arg0) {
        if (arg0.field2871 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2871.length; var1++) {
            int var2 = method2774(arg0, var1);
            int var3 = arg0.field2872[var1];
            if (arg0.field2871[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2871[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2871[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("ey.cl(Lfv;II)I")
    public static final int method2774(class173 arg0, int arg1) {
        if (arg0.field2870 == null || arg1 >= arg0.field2870.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2870[arg1];
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
                    var7 = field425[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field426[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field427[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class173 var11 = class173.method691(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method578(var12).field1115 || field292)) {
                        for (int var13 = 0; var13 < var11.field2876.length; var13++) {
                            if (var12 + 1 == var11.field2876[var13]) {
                                var7 += var11.field2877[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class176.field2907[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class155.field2302[field426[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class176.field2907[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field2250.field40;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class155.field2301[var14]) {
                            var7 += field426[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class173 var17 = class173.method691(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method578(var18).field1115 || field292)) {
                        for (int var19 = 0; var19 < var17.field2876.length; var19++) {
                            if (var18 + 1 == var17.field2876[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field336;
                }
                if (var6 == 12) {
                    var7 = field455;
                }
                if (var6 == 13) {
                    int var20 = class176.field2907[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class176.method2248(var22);
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
                    var7 = (Statics.field2250.field840 >> 7) + Statics.field1684;
                }
                if (var6 == 19) {
                    var7 = (Statics.field2250.field849 >> 7) + Statics.field1599;
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

    @ObfuscatedName("s.ct([Lfv;IIIIIIII)V")
    public static final void method180(class173[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class173 var9 = arg0[var8];
            if (var9 != null && (!var9.field2759 || var9.field2850 == 0 || var9.field2838 || method883(var9) != 0 || field298 == var9 || var9.field2764 == 1338) && var9.field2779 == arg1 && (!var9.field2759 || !method192(var9))) {
                int var10 = var9.field2773 + arg6;
                int var11 = var9.field2774 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2850 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2850 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2775 + var10;
                    int var19 = var9.field2891 + var11;
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
                    int var22 = var9.field2775 + var10;
                    int var23 = var9.field2891 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field537 == var9) {
                    field470 = true;
                    field471 = var10;
                    field322 = var11;
                }
                if (!var9.field2759 || var12 < var14 && var13 < var15) {
                    int var24 = class140.field2163;
                    int var25 = class140.field2172 * 488798971;
                    if (class140.field2169 != 0) {
                        var24 = class140.field2170;
                        var25 = class140.field2164;
                    }
                    if (var9.field2764 == 1337) {
                        if (!field317 && !field309 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field302 == 0 && !field409) {
                                method2373(class157.field2468, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class105.field1854; var28++) {
                                int var29 = class105.field1863[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field1907.method1868(Statics.field1387, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method981(var33);
                                        if (var34.field921 != null) {
                                            var34 = var34.method809();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field302 == 1) {
                                            method2373(class157.field2403, field443 + " " + class2.field24 + " " + class2.method589(65535) + var34.field928, 1, var29, var30, var31);
                                        } else if (!field409) {
                                            String[] var35 = var34.field945;
                                            if (field460) {
                                                var35 = method2114(var35);
                                            }
                                            if (var35 != null) {
                                                for (int var36 = 4; var36 >= 0; var36--) {
                                                    if (var35[var36] != null) {
                                                        short var37 = 0;
                                                        if (var36 == 0) {
                                                            var37 = 3;
                                                        }
                                                        if (var36 == 1) {
                                                            var37 = 4;
                                                        }
                                                        if (var36 == 2) {
                                                            var37 = 5;
                                                        }
                                                        if (var36 == 3) {
                                                            var37 = 6;
                                                        }
                                                        if (var36 == 4) {
                                                            var37 = 1001;
                                                        }
                                                        method2373(var35[var36], class2.method589(65535) + var34.field928, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method2373(class157.field2404, class2.method589(65535) + var34.field928, 1002, var34.field925 << 14, var30, var31);
                                        } else if ((Statics.field574 & 0x4) == 4) {
                                            method2373(field447, field448 + " " + class2.field24 + " " + class2.method589(65535) + var34.field928, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field325[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field780.field886 == 1 && (var38.field840 & 0x7F) == 64 && (var38.field849 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field562; var39++) {
                                                class35 var40 = field325[field327[var39]];
                                                if (var40 != null && var38 != var40 && var40.field780.field886 == 1 && var38.field840 == var40.field840 && var38.field849 == var40.field849) {
                                                    method717(var40.field780, field327[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field750;
                                            int[] var42 = class33.field756;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field411[var42[var43]];
                                                if (var44 != null && var38.field840 == var44.field840 && var38.field849 == var44.field849) {
                                                    method107(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method717(var38.field780, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field411[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field840 & 0x7F) == 64 && (var45.field849 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field562; var46++) {
                                                class35 var47 = field325[field327[var46]];
                                                if (var47 != null && var47.field780.field886 == 1 && var45.field840 == var47.field840 && var45.field849 == var47.field849) {
                                                    method717(var47.field780, field327[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field750;
                                            int[] var49 = class33.field756;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field411[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field840 == var51.field840 && var45.field849 == var51.field849) {
                                                    method107(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field420 == var33) {
                                            var26 = var29;
                                        } else {
                                            method107(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class199 var52 = field421[Statics.field1387][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3529(); var53 != null; var53 = (class29) var52.method3531()) {
                                                class52 var54 = class52.method578(var53.field678);
                                                if (field302 == 1) {
                                                    method2373(class157.field2403, field443 + " " + class2.field24 + " " + class2.method589(16748608) + var54.field1122, 16, var53.field678, var30, var31);
                                                } else if (!field409) {
                                                    String[] var55 = var54.field1136;
                                                    if (field460) {
                                                        var55 = method2114(var55);
                                                    }
                                                    for (int var56 = 4; var56 >= 0; var56--) {
                                                        if (var55 != null && var55[var56] != null) {
                                                            byte var57 = 0;
                                                            if (var56 == 0) {
                                                                var57 = 18;
                                                            }
                                                            if (var56 == 1) {
                                                                var57 = 19;
                                                            }
                                                            if (var56 == 2) {
                                                                var57 = 20;
                                                            }
                                                            if (var56 == 3) {
                                                                var57 = 21;
                                                            }
                                                            if (var56 == 4) {
                                                                var57 = 22;
                                                            }
                                                            method2373(var55[var56], class2.method589(16748608) + var54.field1122, var57, var53.field678, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method2373(class157.field2508, class2.method589(16748608) + var54.field1122, 20, var53.field678, var30, var31);
                                                        }
                                                    }
                                                    method2373(class157.field2404, class2.method589(16748608) + var54.field1122, 1004, var53.field678, var30, var31);
                                                } else if ((Statics.field574 & 0x1) == 1) {
                                                    method2373(field447, field448 + " " + class2.field24 + " " + class2.method589(16748608) + var54.field1122, 17, var53.field678, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field411[field420];
                                method107(var60, field420, var58, var59);
                            }
                        }
                    } else if (var9.field2764 != 1338) {
                        if (!field309 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            int var75 = var24 - var10;
                            int var76 = var25 - var11;
                            if (var9.field2763 == 1) {
                                method2373(var9.field2875, "", 24, 0, 0, var9.field2760);
                            }
                            if (var9.field2763 == 2 && !field409) {
                                String var77;
                                if (class178.method2914(method883(var9)) == 0) {
                                    var77 = null;
                                } else if (var9.field2807 == null || var9.field2807.trim().length() == 0) {
                                    var77 = null;
                                } else {
                                    var77 = var9.field2807;
                                }
                                if (var77 != null) {
                                    method2373(var77, class2.method589(65280) + var9.field2833, 25, 0, -1, var9.field2760);
                                }
                            }
                            if (var9.field2763 == 3) {
                                method2373(class157.field2472, "", 26, 0, 0, var9.field2760);
                            }
                            if (var9.field2763 == 4) {
                                method2373(var9.field2875, "", 28, 0, 0, var9.field2760);
                            }
                            if (var9.field2763 == 5) {
                                method2373(var9.field2875, "", 29, 0, 0, var9.field2760);
                            }
                            if (var9.field2763 == 6 && field453 == null) {
                                method2373(var9.field2875, "", 30, 0, -1, var9.field2760);
                            }
                            if (var9.field2850 == 2) {
                                int var79 = 0;
                                for (int var80 = 0; var80 < var9.field2891; var80++) {
                                    for (int var81 = 0; var81 < var9.field2775; var81++) {
                                        int var82 = (var9.field2824 + 32) * var81;
                                        int var83 = (var9.field2825 + 32) * var80;
                                        if (var79 < 20) {
                                            var82 += var9.field2750[var79];
                                            var83 += var9.field2827[var79];
                                        }
                                        if (var75 >= var82 && var76 >= var83 && var75 < var82 + 32 && var76 < var83 + 32) {
                                            field407 = var79;
                                            Statics.field2182 = var9;
                                            if (var9.field2876[var79] > 0) {
                                                class52 var84 = class52.method578(var9.field2876[var79] - 1);
                                                if (field302 == 1 && class178.method2123(method883(var9))) {
                                                    if (Statics.field1075 != var9.field2760 || Statics.field2673 != var79) {
                                                        method2373(class157.field2403, field443 + " " + class2.field24 + " " + class2.method589(16748608) + var84.field1122, 31, var84.field1152, var79, var9.field2760);
                                                    }
                                                } else if (!field409 || !class178.method2123(method883(var9))) {
                                                    String[] var85 = var84.field1137;
                                                    if (field460) {
                                                        var85 = method2114(var85);
                                                    }
                                                    if (class178.method2123(method883(var9))) {
                                                        for (int var86 = 4; var86 >= 3; var86--) {
                                                            if (var85 != null && var85[var86] != null) {
                                                                byte var87;
                                                                if (var86 == 3) {
                                                                    var87 = 36;
                                                                } else {
                                                                    var87 = 37;
                                                                }
                                                                method2373(var85[var86], class2.method589(16748608) + var84.field1122, var87, var84.field1152, var79, var9.field2760);
                                                            } else if (var86 == 4) {
                                                                method2373(class157.field2317, class2.method589(16748608) + var84.field1122, 37, var84.field1152, var79, var9.field2760);
                                                            }
                                                        }
                                                    }
                                                    int var88 = method883(var9);
                                                    boolean var89 = (var88 >> 31 & 0x1) != 0;
                                                    if (var89) {
                                                        method2373(class157.field2403, class2.method589(16748608) + var84.field1122, 38, var84.field1152, var79, var9.field2760);
                                                    }
                                                    class178 var10000 = (class178) null;
                                                    if (class178.method2123(method883(var9)) && var85 != null) {
                                                        for (int var90 = 2; var90 >= 0; var90--) {
                                                            if (var85[var90] != null) {
                                                                byte var91 = 0;
                                                                if (var90 == 0) {
                                                                    var91 = 33;
                                                                }
                                                                if (var90 == 1) {
                                                                    var91 = 34;
                                                                }
                                                                if (var90 == 2) {
                                                                    var91 = 35;
                                                                }
                                                                method2373(var85[var90], class2.method589(16748608) + var84.field1122, var91, var84.field1152, var79, var9.field2760);
                                                            }
                                                        }
                                                    }
                                                    String[] var92 = var9.field2781;
                                                    if (field460) {
                                                        var92 = method2114(var92);
                                                    }
                                                    if (var92 != null) {
                                                        for (int var93 = 4; var93 >= 0; var93--) {
                                                            if (var92[var93] != null) {
                                                                byte var94 = 0;
                                                                if (var93 == 0) {
                                                                    var94 = 39;
                                                                }
                                                                if (var93 == 1) {
                                                                    var94 = 40;
                                                                }
                                                                if (var93 == 2) {
                                                                    var94 = 41;
                                                                }
                                                                if (var93 == 3) {
                                                                    var94 = 42;
                                                                }
                                                                if (var93 == 4) {
                                                                    var94 = 43;
                                                                }
                                                                method2373(var92[var93], class2.method589(16748608) + var84.field1122, var94, var84.field1152, var79, var9.field2760);
                                                            }
                                                        }
                                                    }
                                                    method2373(class157.field2404, class2.method589(16748608) + var84.field1122, 1005, var84.field1152, var79, var9.field2760);
                                                } else if ((Statics.field574 & 0x10) == 16) {
                                                    method2373(field447, field448 + " " + class2.field24 + " " + class2.method589(16748608) + var84.field1122, 32, var84.field1152, var79, var9.field2760);
                                                }
                                            }
                                        }
                                        var79++;
                                    }
                                }
                            }
                            if (var9.field2759) {
                                if (field409) {
                                    int var95 = method883(var9);
                                    boolean var96 = (var95 >> 21 & 0x1) != 0;
                                    if (var96 && (Statics.field574 & 0x20) == 32) {
                                        method2373(field447, field448 + " " + class2.field24 + " " + var9.field2831, 58, 0, var9.field2826, var9.field2760);
                                    }
                                } else {
                                    for (int var97 = 9; var97 >= 5; var97--) {
                                        String var98;
                                        if (!class178.method824(method883(var9), var97) && var9.field2892 == null) {
                                            var98 = null;
                                        } else if (var9.field2832 == null || var9.field2832.length <= var97 || var9.field2832[var97] == null || var9.field2832[var97].trim().length() == 0) {
                                            var98 = null;
                                        } else {
                                            var98 = var9.field2832[var97];
                                        }
                                        if (var98 != null) {
                                            method2373(var98, var9.field2831, 1007, var97 + 1, var9.field2826, var9.field2760);
                                        }
                                    }
                                    String var100;
                                    if (class178.method2914(method883(var9)) == 0) {
                                        var100 = null;
                                    } else if (var9.field2807 == null || var9.field2807.trim().length() == 0) {
                                        var100 = null;
                                    } else {
                                        var100 = var9.field2807;
                                    }
                                    if (var100 != null) {
                                        method2373(var100, var9.field2831, 25, 0, var9.field2826, var9.field2760);
                                    }
                                    for (int var102 = 4; var102 >= 0; var102--) {
                                        String var103;
                                        if (!class178.method824(method883(var9), var102) && var9.field2892 == null) {
                                            var103 = null;
                                        } else if (var9.field2832 == null || var9.field2832.length <= var102 || var9.field2832[var102] == null || var9.field2832[var102].trim().length() == 0) {
                                            var103 = null;
                                        } else {
                                            var103 = var9.field2832[var102];
                                        }
                                        if (var103 != null) {
                                            method2373(var103, var9.field2831, 57, var102 + 1, var9.field2826, var9.field2760);
                                        }
                                    }
                                    int var105 = method883(var9);
                                    boolean var106 = (var105 & 0x1) != 0;
                                    if (var106) {
                                        method2373(class157.field2321, "", 30, 0, var9.field2826, var9.field2760);
                                    }
                                }
                            }
                        }
                        if (var9.field2850 == 0) {
                            if (!var9.field2759 && method192(var9) && Statics.field1377 != var9) {
                                continue;
                            }
                            method180(arg0, var9.field2760, var12, var13, var14, var15, var10 - var9.field2830, var11 - var9.field2887);
                            if (var9.field2882 != null) {
                                method180(var9.field2882, var9.field2760, var12, var13, var14, var15, var10 - var9.field2830, var11 - var9.field2887);
                            }
                            class4 var107 = (class4) field450.method3499((long) var9.field2760);
                            if (var107 != null) {
                                if (var107.field62 == 0 && class140.field2163 >= var12 && class140.field2172 * 488798971 >= var13 && class140.field2163 < var14 && class140.field2172 * 488798971 < var15 && !field309 && !field459) {
                                    for (class1 var108 = (class1) field466.method3528(); var108 != null; var108 = (class1) field466.method3527()) {
                                        if (var108.field2) {
                                            var108.method3608();
                                            var108.field3.field2883 = false;
                                        }
                                    }
                                    if (Statics.field1459 == 0) {
                                        field537 = null;
                                        field298 = null;
                                    }
                                    if (!field309) {
                                        field438[0] = class157.field2552;
                                        field366[0] = "";
                                        field434[0] = 1006;
                                        field431 = 1;
                                    }
                                }
                                int var109 = var107.field67;
                                if (class173.method2908(var109)) {
                                    method180(Statics.field2758[var109], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2759) {
                            if (var9.field2885) {
                                if (class140.field2163 >= var12 && class140.field2172 * 488798971 >= var13 && class140.field2163 < var14 && class140.field2172 * 488798971 < var15) {
                                    for (class1 var110 = (class1) field466.method3528(); var110 != null; var110 = (class1) field466.method3527()) {
                                        if (var110.field2) {
                                            var110.method3608();
                                            var110.field3.field2883 = false;
                                        }
                                    }
                                    if (Statics.field1459 == 0) {
                                        field537 = null;
                                        field298 = null;
                                    }
                                    if (!field309) {
                                        field438[0] = class157.field2552;
                                        field366[0] = "";
                                        field434[0] = 1006;
                                        field431 = 1;
                                    }
                                }
                            } else if (var9.field2881 && class140.field2163 >= var12 && class140.field2172 * 488798971 >= var13 && class140.field2163 < var14 && class140.field2172 * 488798971 < var15) {
                                for (class1 var111 = (class1) field466.method3528(); var111 != null; var111 = (class1) field466.method3527()) {
                                    if (var111.field2 && var111.field3.field2859 == var111.field6) {
                                        var111.method3608();
                                    }
                                }
                            }
                            boolean var112;
                            if (class140.field2163 >= var12 && class140.field2172 * 488798971 >= var13 && class140.field2163 < var14 && class140.field2172 * 488798971 < var15) {
                                var112 = true;
                            } else {
                                var112 = false;
                            }
                            boolean var113 = false;
                            if ((class140.field2162 == 1 || !Statics.field1618 && class140.field2162 == 4) && var112) {
                                var113 = true;
                            }
                            boolean var114 = false;
                            if ((class140.field2169 == 1 || !Statics.field1618 && class140.field2169 == 4) && class140.field2170 >= var12 && class140.field2164 >= var13 && class140.field2170 < var14 && class140.field2164 < var15) {
                                var114 = true;
                            }
                            if (var114) {
                                method992(var9, class140.field2170 - var10, class140.field2164 - var11);
                            }
                            if (field537 != null && field537 != var9 && var112) {
                                int var115 = method883(var9);
                                boolean var116 = (var115 >> 20 & 0x1) != 0;
                                if (var116) {
                                    field313 = var9;
                                }
                            }
                            if (field298 == var9) {
                                field467 = true;
                                field468 = var10;
                                field469 = var11;
                            }
                            if (var9.field2838) {
                                if (var112 && field487 != 0 && var9.field2859 != null) {
                                    class1 var117 = new class1();
                                    var117.field2 = true;
                                    var117.field3 = var9;
                                    var117.field7 = field487;
                                    var117.field6 = var9.field2859;
                                    field466.method3523(var117);
                                }
                                if (field537 != null || Statics.field2074 != null || field309) {
                                    var114 = false;
                                    var113 = false;
                                    var112 = false;
                                }
                                if (!var9.field2884 && var114) {
                                    var9.field2884 = true;
                                    if (var9.field2756 != null) {
                                        class1 var118 = new class1();
                                        var118.field2 = true;
                                        var118.field3 = var9;
                                        var118.field4 = class140.field2170 - var10;
                                        var118.field7 = class140.field2164 - var11;
                                        var118.field6 = var9.field2756;
                                        field466.method3523(var118);
                                    }
                                }
                                if (var9.field2884 && var113 && var9.field2841 != null) {
                                    class1 var119 = new class1();
                                    var119.field2 = true;
                                    var119.field3 = var9;
                                    var119.field4 = class140.field2163 - var10;
                                    var119.field7 = class140.field2172 * 488798971 - var11;
                                    var119.field6 = var9.field2841;
                                    field466.method3523(var119);
                                }
                                if (var9.field2884 && !var113) {
                                    var9.field2884 = false;
                                    if (var9.field2864 != null) {
                                        class1 var120 = new class1();
                                        var120.field2 = true;
                                        var120.field3 = var9;
                                        var120.field4 = class140.field2163 - var10;
                                        var120.field7 = class140.field2172 * 488798971 - var11;
                                        var120.field6 = var9.field2864;
                                        field490.method3523(var120);
                                    }
                                }
                                if (var113 && var9.field2843 != null) {
                                    class1 var121 = new class1();
                                    var121.field2 = true;
                                    var121.field3 = var9;
                                    var121.field4 = class140.field2163 - var10;
                                    var121.field7 = class140.field2172 * 488798971 - var11;
                                    var121.field6 = var9.field2843;
                                    field466.method3523(var121);
                                }
                                if (!var9.field2883 && var112) {
                                    var9.field2883 = true;
                                    if (var9.field2808 != null) {
                                        class1 var122 = new class1();
                                        var122.field2 = true;
                                        var122.field3 = var9;
                                        var122.field4 = class140.field2163 - var10;
                                        var122.field7 = class140.field2172 * 488798971 - var11;
                                        var122.field6 = var9.field2808;
                                        field466.method3523(var122);
                                    }
                                }
                                if (var9.field2883 && var112 && var9.field2845 != null) {
                                    class1 var123 = new class1();
                                    var123.field2 = true;
                                    var123.field3 = var9;
                                    var123.field4 = class140.field2163 - var10;
                                    var123.field7 = class140.field2172 * 488798971 - var11;
                                    var123.field6 = var9.field2845;
                                    field466.method3523(var123);
                                }
                                if (var9.field2883 && !var112) {
                                    var9.field2883 = false;
                                    if (var9.field2846 != null) {
                                        class1 var124 = new class1();
                                        var124.field2 = true;
                                        var124.field3 = var9;
                                        var124.field4 = class140.field2163 - var10;
                                        var124.field7 = class140.field2172 * 488798971 - var11;
                                        var124.field6 = var9.field2846;
                                        field490.method3523(var124);
                                    }
                                }
                                if (var9.field2857 != null) {
                                    class1 var125 = new class1();
                                    var125.field3 = var9;
                                    var125.field6 = var9.field2857;
                                    field489.method3523(var125);
                                }
                                if (var9.field2839 != null && field341 > var9.field2757) {
                                    if (var9.field2852 == null || field341 - var9.field2757 > 32) {
                                        class1 var130 = new class1();
                                        var130.field3 = var9;
                                        var130.field6 = var9.field2839;
                                        field466.method3523(var130);
                                    } else {
                                        label989: for (int var126 = var9.field2757; var126 < field341; var126++) {
                                            int var127 = field475[var126 & 0x1F];
                                            for (int var128 = 0; var128 < var9.field2852.length; var128++) {
                                                if (var9.field2852[var128] == var127) {
                                                    class1 var129 = new class1();
                                                    var129.field3 = var9;
                                                    var129.field6 = var9.field2839;
                                                    field466.method3523(var129);
                                                    break label989;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2757 = field341;
                                }
                                if (var9.field2853 != null && field412 > var9.field2790) {
                                    if (var9.field2752 == null || field412 - var9.field2790 > 32) {
                                        class1 var135 = new class1();
                                        var135.field3 = var9;
                                        var135.field6 = var9.field2853;
                                        field466.method3523(var135);
                                    } else {
                                        label965: for (int var131 = var9.field2790; var131 < field412; var131++) {
                                            int var132 = field477[var131 & 0x1F];
                                            for (int var133 = 0; var133 < var9.field2752.length; var133++) {
                                                if (var9.field2752[var133] == var132) {
                                                    class1 var134 = new class1();
                                                    var134.field3 = var9;
                                                    var134.field6 = var9.field2853;
                                                    field466.method3523(var134);
                                                    break label965;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2790 = field412;
                                }
                                if (var9.field2855 != null && field522 > var9.field2847) {
                                    if (var9.field2856 == null || field522 - var9.field2847 > 32) {
                                        class1 var140 = new class1();
                                        var140.field3 = var9;
                                        var140.field6 = var9.field2855;
                                        field466.method3523(var140);
                                    } else {
                                        label941: for (int var136 = var9.field2847; var136 < field522; var136++) {
                                            int var137 = field464[var136 & 0x1F];
                                            for (int var138 = 0; var138 < var9.field2856.length; var138++) {
                                                if (var9.field2856[var138] == var137) {
                                                    class1 var139 = new class1();
                                                    var139.field3 = var9;
                                                    var139.field6 = var9.field2855;
                                                    field466.method3523(var139);
                                                    break label941;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2847 = field522;
                                }
                                if (field481 > var9.field2786 && var9.field2886 != null) {
                                    class1 var141 = new class1();
                                    var141.field3 = var9;
                                    var141.field6 = var9.field2886;
                                    field466.method3523(var141);
                                }
                                if (field482 > var9.field2786 && var9.field2862 != null) {
                                    class1 var142 = new class1();
                                    var142.field3 = var9;
                                    var142.field6 = var9.field2862;
                                    field466.method3523(var142);
                                }
                                if (field483 > var9.field2786 && var9.field2863 != null) {
                                    class1 var143 = new class1();
                                    var143.field3 = var9;
                                    var143.field6 = var9.field2863;
                                    field466.method3523(var143);
                                }
                                if (field484 > var9.field2786 && var9.field2868 != null) {
                                    class1 var144 = new class1();
                                    var144.field3 = var9;
                                    var144.field6 = var9.field2868;
                                    field466.method3523(var144);
                                }
                                if (field485 > var9.field2786 && var9.field2869 != null) {
                                    class1 var145 = new class1();
                                    var145.field3 = var9;
                                    var145.field6 = var9.field2869;
                                    field466.method3523(var145);
                                }
                                if (field364 > var9.field2786 && var9.field2829 != null) {
                                    class1 var146 = new class1();
                                    var146.field3 = var9;
                                    var146.field6 = var9.field2829;
                                    field466.method3523(var146);
                                }
                                var9.field2786 = field393;
                                if (var9.field2861 != null) {
                                    for (int var147 = 0; var147 < field501; var147++) {
                                        class1 var148 = new class1();
                                        var148.field3 = var9;
                                        var148.field8 = field386[var147];
                                        var148.field9 = field513[var147];
                                        var148.field6 = var9.field2861;
                                        field466.method3523(var148);
                                    }
                                }
                            }
                        }
                        if (!var9.field2759 && field537 == null && Statics.field2074 == null && !field309) {
                            if ((var9.field2873 >= 0 || var9.field2787 != 0) && class140.field2163 >= var12 && class140.field2172 * 488798971 >= var13 && class140.field2163 < var14 && class140.field2172 * 488798971 < var15) {
                                if (var9.field2873 >= 0) {
                                    Statics.field1377 = arg0[var9.field2873];
                                } else {
                                    Statics.field1377 = var9;
                                }
                            }
                            if (var9.field2850 == 8 && class140.field2163 >= var12 && class140.field2172 * 488798971 >= var13 && class140.field2163 < var14 && class140.field2172 * 488798971 < var15) {
                                Statics.field1172 = var9;
                            }
                            if (var9.field2784 > var9.field2891) {
                                method155(var9, var9.field2775 + var10, var11, var9.field2891, var9.field2784, class140.field2163, class140.field2172 * 488798971);
                            }
                        }
                    } else if ((field525 == 0 || field525 == 3) && (class140.field2169 == 1 || !Statics.field1618 && class140.field2169 == 4)) {
                        class175 var61 = var9.method3143(true);
                        if (var61 != null) {
                            int var62 = class140.field2170 - var10;
                            int var63 = class140.field2164 - var11;
                            if (var61.method3187(var62, var63)) {
                                int var64 = var62 - var61.field2904 / 2;
                                int var65 = var63 - var61.field2901 / 2;
                                int var66 = field523 + field375 & 0x7FF;
                                int var67 = class91.field1588[var66];
                                int var68 = class91.field1591[var66];
                                int var69 = (field360 + 256) * var67 >> 8;
                                int var70 = (field360 + 256) * var68 >> 8;
                                int var71 = var64 * var70 + var65 * var69 >> 11;
                                int var72 = var65 * var70 - var64 * var69 >> 11;
                                int var73 = Statics.field2250.field840 + var71 >> 7;
                                int var74 = Statics.field2250.field849 - var72 >> 7;
                                field330.method2549(204);
                                field330.method2301(18);
                                field330.method2303(Statics.field1599 + var74);
                                field330.method2427(Statics.field1684 + var73);
                                field330.method2339(class137.field2122[82] ? (class137.field2122[81] ? 2 : 1) : 0);
                                field330.method2301(var64);
                                field330.method2301(var65);
                                field330.method2404(field375);
                                field330.method2301(57);
                                field330.method2301(field523);
                                field330.method2301(field360);
                                field330.method2301(89);
                                field330.method2404(Statics.field2250.field840);
                                field330.method2404(Statics.field2250.field849);
                                field330.method2301(63);
                                field297 = var73;
                                field320 = var74;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("z.cj(III)V")
    public static final void method189(int arg0, int arg1) {
        if (class173.method2908(arg0)) {
            method184(Statics.field2758[arg0], arg1);
        }
    }

    @ObfuscatedName("s.cy([Lfv;II)V")
    public static final void method184(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2850 == 0) {
                    if (var3.field2882 != null) {
                        method184(var3.field2882, arg1);
                    }
                    class4 var4 = (class4) field450.method3499((long) var3.field2760);
                    if (var4 != null) {
                        method189(var4.field67, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2865 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field6 = var3.field2865;
                    class37.method2607(var5, 200000);
                }
                if (arg1 == 1 && var3.field2866 != null) {
                    if (var3.field2826 >= 0) {
                        class173 var6 = class173.method691(var3.field2760);
                        if (var6 == null || var6.field2882 == null || var3.field2826 >= var6.field2882.length || var6.field2882[var3.field2826] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field6 = var3.field2866;
                    class37.method2607(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("av.ci(Lfv;IIB)V")
    public static final void method992(class173 arg0, int arg1, int arg2) {
        if (field537 != null || field309 || arg0 == null || method1942(arg0) == null) {
            return;
        }
        field537 = arg0;
        field298 = method1942(arg0);
        field429 = arg1;
        field465 = arg2;
        Statics.field1459 = 0;
        field315 = false;
        if (field431 <= 0) {
            return;
        }
        int var3 = field431 - 1;
        Statics.field181 = new class31();
        Statics.field181.field705 = field432[var3];
        Statics.field181.field697 = field433[var3];
        Statics.field181.field706 = field434[var3];
        Statics.field181.field699 = field524[var3];
        Statics.field181.field698 = field438[var3];
    }

    @ObfuscatedName("dk.ca(B)V")
    public static final void method2606() {
        method2263(field537);
        Statics.field1459++;
        if (field470 && field467) {
            int var0 = class140.field2163;
            int var1 = class140.field2172 * 488798971;
            int var2 = var0 - field429;
            int var3 = var1 - field465;
            if (var2 < field468) {
                var2 = field468;
            }
            if (field537.field2775 + var2 > field468 + field298.field2775) {
                var2 = field468 + field298.field2775 - field537.field2775;
            }
            if (var3 < field469) {
                var3 = field469;
            }
            if (field537.field2891 + var3 > field469 + field298.field2891) {
                var3 = field469 + field298.field2891 - field537.field2891;
            }
            int var4 = var2 - field471;
            int var5 = var3 - field322;
            int var6 = field537.field2834;
            if (Statics.field1459 > field537.field2835 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field315 = true;
            }
            int var7 = field298.field2830 + (var2 - field468);
            int var8 = field298.field2887 + (var3 - field469);
            if (field537.field2812 != null && field315) {
                class1 var9 = new class1();
                var9.field3 = field537;
                var9.field4 = var7;
                var9.field7 = var8;
                var9.field6 = field537.field2812;
                class37.method2607(var9, 200000);
            }
            if (class140.field2162 == 0) {
                if (field315) {
                    if (field537.field2888 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field537;
                        var10.field4 = var7;
                        var10.field7 = var8;
                        var10.field12 = field313;
                        var10.field6 = field537.field2888;
                        class37.method2607(var10, 200000);
                    }
                    if (field313 != null) {
                        class173 var11 = field537;
                        int var12 = method883(var11);
                        int var13 = var12 >> 17 & 0x7;
                        int var14 = var13;
                        class173 var15;
                        if (var13 == 0) {
                            var15 = null;
                        } else {
                            int var16 = 0;
                            while (true) {
                                if (var16 >= var14) {
                                    var15 = var11;
                                    break;
                                }
                                var11 = class173.method691(var11.field2779);
                                if (var11 == null) {
                                    var15 = null;
                                    break;
                                }
                                var16++;
                            }
                        }
                        if (var15 != null) {
                            field330.method2549(211);
                            field330.method2470(field313.field2760);
                            field330.method2404(field537.field2826);
                            field330.method2303(field313.field2878);
                            field330.method2427(field313.field2826);
                            field330.method2304(field537.field2760);
                            field330.method2427(field537.field2878);
                        }
                    }
                } else {
                    label120: {
                        label91: {
                            if (field428 != 1) {
                                int var17 = field431 - 1;
                                boolean var18;
                                if (var17 < 0) {
                                    var18 = false;
                                } else {
                                    int var19 = field434[var17];
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
                            if (field431 > 2) {
                                method209(field471 + field429, field465 + field322);
                                break label120;
                            }
                        }
                        if (field431 > 0) {
                            method991(field471 + field429, field465 + field322);
                        }
                    }
                }
                field537 = null;
            }
        } else if (Statics.field1459 > 1) {
            field537 = null;
        }
    }

    @ObfuscatedName("av.cz(III)V")
    public static void method991(int arg0, int arg1) {
        method303(Statics.field181, arg0, arg1);
        Statics.field181 = null;
    }

    @ObfuscatedName("do.cf(Lfv;I)V")
    public static void method2263(class173 arg0) {
        if (field493 == arg0.field2890) {
            field494[arg0.field2889] = true;
        }
    }

    @ObfuscatedName("cn.cb(B)V")
    public static void method1751() {
        for (class4 var0 = (class4) field450.method3503(); var0 != null; var0 = (class4) field450.method3502()) {
            int var1 = var0.field67;
            if (class173.method2908(var1)) {
                boolean var2 = true;
                class173[] var3 = Statics.field2758[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2759;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3113;
                    class173 var6 = class173.method691(var5);
                    if (var6 != null) {
                        method2263(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cd.ck(Lfv;I)Lfv;")
    public static class173 method1942(class173 arg0) {
        class173 var1 = arg0;
        int var2 = method883(arg0);
        int var3 = var2 >> 17 & 0x7;
        int var4 = var3;
        class173 var5;
        if (var3 == 0) {
            var5 = null;
        } else {
            int var6 = 0;
            while (true) {
                if (var6 >= var4) {
                    var5 = var1;
                    break;
                }
                var1 = class173.method691(var1.field2779);
                if (var1 == null) {
                    var5 = null;
                    break;
                }
                var6++;
            }
        }
        class173 var7 = var5;
        if (var5 == null) {
            var7 = arg0.field2844;
        }
        return var7;
    }

    @ObfuscatedName("ck.cc([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method2114(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ae.cs(IS)V")
    public static final void method924(int arg0) {
        if (!class173.method2908(arg0)) {
            return;
        }
        class173[] var1 = Statics.field2758[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class173 var3 = var1[var2];
            if (var3 != null) {
                var3.field2817 = 0;
                var3.field2761 = 0;
            }
        }
    }

    @ObfuscatedName("at.dd([Lfv;IS)V")
    public static final void method842(class173[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class173 var3 = arg0[var2];
            if (var3 != null && var3.field2779 == arg1 && (!var3.field2759 || !method192(var3))) {
                if (var3.field2850 == 0) {
                    if (!var3.field2759 && method192(var3) && Statics.field1377 != var3) {
                        continue;
                    }
                    method842(arg0, var3.field2760);
                    if (var3.field2882 != null) {
                        method842(var3.field2882, var3.field2760);
                    }
                    class4 var4 = (class4) field450.method3499((long) var3.field2760);
                    if (var4 != null) {
                        Statics.method737(var4.field67);
                    }
                }
                if (var3.field2850 == 6) {
                    if (var3.field2837 != -1 || var3.field2806 != -1) {
                        boolean var5 = method1477(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2806;
                        } else {
                            var6 = var3.field2837;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method729(var6);
                            var3.field2761 += field363;
                            while (var3.field2761 > var7.field989[var3.field2817]) {
                                var3.field2761 -= var7.field989[var3.field2817];
                                var3.field2817++;
                                if (var3.field2817 >= var7.field987.length) {
                                    var3.field2817 -= var7.field984;
                                    if (var3.field2817 < 0 || var3.field2817 >= var7.field987.length) {
                                        var3.field2817 = 0;
                                    }
                                }
                                method2263(var3);
                            }
                        }
                    }
                    if (var3.field2814 != 0 && !var3.field2759) {
                        int var8 = var3.field2814 >> 16;
                        int var9 = var3.field2814 << 16 >> 16;
                        int var10 = field363 * var8;
                        int var11 = field363 * var9;
                        var3.field2809 = var3.field2809 + var10 & 0x7FF;
                        var3.field2810 = var3.field2810 + var11 & 0x7FF;
                        method2263(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.dn(II)V")
    public static final void method2614(int arg0) {
        method1751();
        class24.method2118();
        int var1 = class53.method96(arg0).field1169;
        if (var1 == 0) {
            return;
        }
        int var2 = class176.field2907[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class91.method1949(0.9D);
                ((class95) Statics.field1577).method2025(0.9D);
            }
            if (var2 == 2) {
                class91.method1949(0.8D);
                ((class95) Statics.field1577).method2025(0.8D);
            }
            if (var2 == 3) {
                class91.method1949(0.7D);
                ((class95) Statics.field1577).method2025(0.7D);
            }
            if (var2 == 4) {
                class91.method1949(0.6D);
                ((class95) Statics.field1577).method2025(0.6D);
            }
            class52.field1119.method3475();
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
            if (field526 != var3) {
                if (field526 == 0 && field454 != -1) {
                    class183.method2247(Statics.field2140, field454, 0, var3, false);
                    field528 = false;
                } else if (var3 == 0) {
                    class183.method936();
                    field528 = false;
                } else {
                    class183.method2243(var3);
                }
                field526 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field301 = 127;
            }
            if (var2 == 1) {
                field301 = 96;
            }
            if (var2 == 2) {
                field301 = 64;
            }
            if (var2 == 3) {
                field301 = 32;
            }
            if (var2 == 4) {
                field301 = 0;
            }
        }
        if (var1 == 5) {
            field428 = var2;
        }
        if (var1 == 6) {
            field362 = var2;
        }
        if (var1 == 9) {
            field452 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field503 = 127;
            }
            if (var2 == 1) {
                field503 = 96;
            }
            if (var2 == 2) {
                field503 = 64;
            }
            if (var2 == 3) {
                field503 = 32;
            }
            if (var2 == 4) {
                field503 = 0;
            }
        }
        if (var1 == 17) {
            field451 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            class21[] var4 = new class21[] { class21.field579, class21.field577, class21.field578, class21.field580 };
            field314 = (class21) class109.method2910(var4, var2);
            if (field314 == null) {
                field314 = class21.field579;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field420 = -1;
            } else {
                field420 = var2 & 0x7FF;
            }
        }
        if (var1 != 22) {
            return;
        }
        class21[] var5 = new class21[] { class21.field579, class21.field577, class21.field578, class21.field580 };
        field358 = (class21) class109.method2910(var5, var2);
        if (field358 == null) {
            field358 = class21.field579;
        }
    }

    @ObfuscatedName("client.dt(IIII)Li;")
    public static final class4 method457(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field67 = arg1;
        var3.field62 = arg2;
        field450.method3501(var3, (long) arg0);
        method924(arg1);
        class173 var4 = class173.method691(arg0);
        method2263(var4);
        if (field453 != null) {
            method2263(field453);
            field453 = null;
        }
        method2239();
        method151(Statics.field2758[arg0 >> 16], var4, false);
        class37.method863(arg1);
        if (field449 != -1) {
            method189(field449, 1);
        }
        return var3;
    }

    @ObfuscatedName("f.dr(Li;ZI)V")
    public static final void method40(class4 arg0, boolean arg1) {
        int var2 = arg0.field67;
        int var3 = (int) arg0.field3113;
        arg0.method3608();
        if (arg1) {
            class173.method41(var2);
        }
        method2221(var2);
        class173 var4 = class173.method691(var3);
        if (var4 != null) {
            method2263(var4);
        }
        method2239();
        if (field449 != -1) {
            method189(field449, 1);
        }
    }

    @ObfuscatedName("k.du(Lfv;I)Z")
    public static final boolean method120(class173 arg0) {
        int var1 = arg0.field2764;
        if (var1 == 205) {
            field340 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field476.method3219(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field476.method3217(var4, var5 == 1);
        }
        if (var1 == 324) {
            field476.method3224(false);
        }
        if (var1 == 325) {
            field476.method3224(true);
        }
        if (var1 == 326) {
            field330.method2549(123);
            field476.method3237(field330);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("fx.di(Lfv;IIII)V")
    public static final void method2938(class173 arg0, int arg1, int arg2, int arg3) {
        Statics.method749();
        class175 var4 = arg0.method3143(false);
        if (var4 == null) {
            return;
        }
        class80.method1676(arg1, arg2, var4.field2904 + arg1, var4.field2901 + arg2);
        if (field525 == 2 || field525 == 5) {
            class80.method1669(arg1, arg2, 0, var4.field2903, var4.field2900);
        } else {
            int var5 = field523 + field375 & 0x7FF;
            int var6 = Statics.field2250.field840 / 32 + 48;
            int var7 = 464 - Statics.field2250.field849 / 32;
            Statics.field1003.method1597(arg1, arg2, var4.field2904, var4.field2901, var6, var7, var5, field360 + 256, var4.field2903, var4.field2900);
            for (int var8 = 0; var8 < field519; var8++) {
                int var9 = field520[var8] * 4 + 2 - Statics.field2250.field840 / 32;
                int var10 = field564[var8] * 4 + 2 - Statics.field2250.field849 / 32;
                method748(arg1, arg2, var9, var10, field396[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class199 var13 = field421[Statics.field1387][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field2250.field840 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field2250.field849 / 32;
                        method748(arg1, arg2, var14, var15, Statics.field1006[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field562; var16++) {
                class35 var17 = field325[field327[var16]];
                if (var17 != null && var17.method18()) {
                    class40 var18 = var17.field780;
                    if (var18 != null && var18.field910 != null) {
                        var18 = var18.method774();
                    }
                    if (var18 != null && var18.field901 && var18.field884) {
                        int var19 = var17.field840 / 32 - Statics.field2250.field840 / 32;
                        int var20 = var17.field849 / 32 - Statics.field2250.field849 / 32;
                        method748(arg1, arg2, var19, var20, Statics.field1006[1], var4);
                    }
                }
            }
            int var21 = class33.field750;
            int[] var22 = class33.field756;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field411[var22[var23]];
                if (var24 != null && var24.method18() && !var24.field55 && Statics.field2250 != var24) {
                    int var25 = var24.field840 / 32 - Statics.field2250.field840 / 32;
                    int var26 = var24.field849 / 32 - Statics.field2250.field849 / 32;
                    boolean var27 = false;
                    if (method2647(var24.field49, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field164; var29++) {
                        if (var24.field49.equals(Statics.field2104[var29].field627)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field2250.field54 != 0 && var24.field54 != 0 && Statics.field2250.field54 == var24.field54) {
                        var30 = true;
                    }
                    if (var27) {
                        method748(arg1, arg2, var25, var26, Statics.field1006[3], var4);
                    } else if (var30) {
                        method748(arg1, arg2, var25, var26, Statics.field1006[4], var4);
                    } else if (var28) {
                        method748(arg1, arg2, var25, var26, Statics.field1006[5], var4);
                    } else {
                        method748(arg1, arg2, var25, var26, Statics.field1006[2], var4);
                    }
                }
            }
            if (field352 != 0 && field395 % 20 < 10) {
                if (field352 == 1 && field307 >= 0 && field307 < field325.length) {
                    class35 var31 = field325[field307];
                    if (var31 != null) {
                        int var32 = var31.field840 / 32 - Statics.field2250.field840 / 32;
                        int var33 = var31.field849 / 32 - Statics.field2250.field849 / 32;
                        method1505(arg1, arg2, var32, var33, Statics.field365[1], var4);
                    }
                }
                if (field352 == 2) {
                    int var34 = field439 * 4 - Statics.field1684 * 4 + 2 - Statics.field2250.field840 / 32;
                    int var35 = field310 * 4 - Statics.field1599 * 4 + 2 - Statics.field2250.field849 / 32;
                    method1505(arg1, arg2, var34, var35, Statics.field365[1], var4);
                }
                if (field352 == 10 && field308 >= 0 && field308 < field411.length) {
                    class3 var36 = field411[field308];
                    if (var36 != null) {
                        int var37 = var36.field840 / 32 - Statics.field2250.field840 / 32;
                        int var38 = var36.field849 / 32 - Statics.field2250.field849 / 32;
                        method1505(arg1, arg2, var37, var38, Statics.field365[1], var4);
                    }
                }
            }
            if (field297 != 0) {
                int var39 = field297 * 4 + 2 - Statics.field2250.field840 / 32;
                int var40 = field320 * 4 + 2 - Statics.field2250.field849 / 32;
                method748(arg1, arg2, var39, var40, Statics.field365[0], var4);
            }
            if (!Statics.field2250.field55) {
                class80.method1674(var4.field2904 / 2 + arg1 - 1, var4.field2901 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field498[arg3] = true;
    }

    @ObfuscatedName("bh.dz(IIIILcr;Lfg;I)V")
    public static final void method1505(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method748(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field523 + field375 & 0x7FF;
        int var8 = class91.field1588[var7];
        int var9 = class91.field1591[var7];
        int var10 = var8 * 256 / (field360 + 256);
        int var11 = var9 * 256 / (field360 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field495.method1585(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("af.dl(IIIILcr;Lfg;I)V")
    public static final void method748(int arg0, int arg1, int arg2, int arg3, class79 arg4, class175 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field523 + field375 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class91.field1588[var6];
        int var9 = class91.field1591[var6];
        int var10 = var8 * 256 / (field360 + 256);
        int var11 = var9 * 256 / (field360 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1596(arg5.field2904 / 2 + var12 - arg4.field1422 / 2, arg5.field2901 / 2 - var13 - arg4.field1417 / 2, arg0, arg1, arg5.field2904, arg5.field2901, arg5.field2903, arg5.field2900);
        } else {
            arg4.method1604(arg5.field2904 / 2 + arg0 + var12 - arg4.field1422 / 2, arg5.field2901 / 2 + arg1 - var13 - arg4.field1417 / 2);
        }
    }

    @ObfuscatedName("ed.dh(Ljava/lang/String;ZI)Z")
    public static boolean method2647(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class164.method2659(arg0, Statics.field474);
        for (int var3 = 0; var3 < field422; var3++) {
            if (var2.equalsIgnoreCase(class164.method2659(field558[var3].field254, Statics.field474)) && (!arg1 || field558[var3].field249 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class164.method2659(Statics.field2250.field49, Statics.field474))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("z.do(Ljava/lang/String;B)Z")
    public static boolean method191(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class164.method2659(arg0, Statics.field474);
        for (int var2 = 0; var2 < field560; var2++) {
            class8 var3 = field561[var2];
            if (var1.equalsIgnoreCase(class164.method2659(var3.field140, Statics.field474))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class164.method2659(var3.field137, Statics.field474))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("dv.dp(Ljava/lang/String;I)V")
    public static final void method2206(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field422 < 200 || field413 == 1) || field422 >= 400) {
            class12.method183(30, "", class157.field2456);
            return;
        }
        String var1 = class164.method2659(arg0, Statics.field474);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field422; var2++) {
            class18 var3 = field558[var2];
            String var4 = class164.method2659(var3.field254, Statics.field474);
            if (var4 != null && var4.equals(var1)) {
                class12.method183(30, "", arg0 + class157.field2480);
                return;
            }
            if (var3.field248 != null) {
                String var5 = class164.method2659(var3.field248, Statics.field474);
                if (var5 != null && var5.equals(var1)) {
                    class12.method183(30, "", arg0 + class157.field2480);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field560; var6++) {
            class8 var7 = field561[var6];
            String var8 = class164.method2659(var7.field140, Statics.field474);
            if (var8 != null && var8.equals(var1)) {
                class12.method183(30, "", class157.field2485 + arg0 + class157.field2421);
                return;
            }
            if (var7.field137 != null) {
                String var9 = class164.method2659(var7.field137, Statics.field474);
                if (var9 != null && var9.equals(var1)) {
                    class12.method183(30, "", class157.field2485 + arg0 + class157.field2421);
                    return;
                }
            }
        }
        if (class164.method2659(Statics.field2250.field49, Statics.field474).equals(var1)) {
            class12.method183(30, "", class157.field2356);
        } else {
            field330.method2549(89);
            field330.method2301(class119.method730(arg0));
            field330.method2307(arg0);
        }
    }

    @ObfuscatedName("an.dy(Ljava/lang/String;ZB)V")
    public static final void method786(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field560 < 100 || field413 == 1) || field560 >= 400) {
            class12.method183(31, "", class157.field2481);
            return;
        }
        String var2 = class164.method2659(arg0, Statics.field474);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field560; var3++) {
            class8 var4 = field561[var3];
            String var5 = class164.method2659(var4.field140, Statics.field474);
            if (var5 != null && var5.equals(var2)) {
                class12.method183(31, "", arg0 + class157.field2482);
                return;
            }
            if (var4.field137 != null) {
                String var6 = class164.method2659(var4.field137, Statics.field474);
                if (var6 != null && var6.equals(var2)) {
                    class12.method183(31, "", arg0 + class157.field2482);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field422; var7++) {
            class18 var8 = field558[var7];
            String var9 = class164.method2659(var8.field254, Statics.field474);
            if (var9 != null && var9.equals(var2)) {
                class12.method183(31, "", class157.field2487 + arg0 + class157.field2488);
                return;
            }
            if (var8.field248 != null) {
                String var10 = class164.method2659(var8.field248, Statics.field474);
                if (var10 != null && var10.equals(var2)) {
                    class12.method183(31, "", class157.field2487 + arg0 + class157.field2488);
                    return;
                }
            }
        }
        if (class164.method2659(Statics.field2250.field49, Statics.field474).equals(var2)) {
            class12.method183(31, "", class157.field2484);
        } else {
            field330.method2549(251);
            field330.method2301(class119.method730(arg0));
            field330.method2307(arg0);
        }
    }

    @ObfuscatedName("ei.dm(Ljava/lang/String;I)V")
    public static final void method2771(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2659(arg0, Statics.field474);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field422; var2++) {
            class18 var3 = field558[var2];
            String var4 = var3.field254;
            String var5 = class164.method2659(var4, Statics.field474);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field422--;
                for (int var7 = var2; var7 < field422; var7++) {
                    field558[var7] = field558[var7 + 1];
                }
                field482 = field393;
                field330.method2549(210);
                field330.method2301(class119.method730(arg0));
                field330.method2307(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cn.dc(Ljava/lang/String;I)V")
    public static final void method1752(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class164.method2659(arg0, Statics.field474);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field560; var2++) {
            class8 var3 = field561[var2];
            String var4 = var3.field140;
            String var5 = class164.method2659(var4, Statics.field474);
            boolean var6;
            if (arg0 == null || var4 == null) {
                var6 = false;
            } else if (arg0.startsWith("#") || var4.startsWith("#")) {
                var6 = arg0.equals(var4);
            } else {
                var6 = var1.equals(var5);
            }
            if (var6) {
                field560--;
                for (int var7 = var2; var7 < field560; var7++) {
                    field561[var7] = field561[var7 + 1];
                }
                field482 = field393;
                field330.method2549(223);
                field330.method2301(class119.method730(arg0));
                field330.method2307(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("en.dq(Ljava/lang/String;II)V")
    public static final void method2663(String arg0, int arg1) {
        field330.method2549(128);
        field330.method2301(class119.method730(arg0) + 1);
        field330.method2307(arg0);
        field330.method2485(arg1);
    }

    @ObfuscatedName("gy.df(Ljava/lang/String;I)V")
    public static final void method3459(String arg0) {
        if (!arg0.equals("")) {
            field330.method2549(20);
            field330.method2301(class119.method730(arg0));
            field330.method2307(arg0);
        }
    }

    @ObfuscatedName("dt.db(II)V")
    public static void method2221(int arg0) {
        for (class201 var1 = (class201) field491.method3503(); var1 != null; var1 = (class201) field491.method3502()) {
            if ((long) arg0 == (var1.field3113 >> 48 & 0xFFFFL)) {
                var1.method3608();
            }
        }
    }

    @ObfuscatedName("al.dw(Lfv;B)I")
    public static int method883(class173 arg0) {
        class201 var1 = (class201) field491.method3499(((long) arg0.field2760 << 32) + (long) arg0.field2826);
        return var1 == null ? arg0.field2848 : var1.field3098;
    }

    @ObfuscatedName("z.dj(Lfv;I)Z")
    public static boolean method192(class173 arg0) {
        if (field459) {
            if (method883(arg0) != 0) {
                return false;
            }
            if (arg0.field2850 == 0) {
                return false;
            }
        }
        return arg0.field2795;
    }

    @ObfuscatedName("ea.de(Ljava/lang/String;ZB)Ljava/lang/String;")
    public static String method2694(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field289 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field289 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field289 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field289 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field289 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field1640 != null) {
            var3 = "/p=" + Statics.field1640;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field473 + "/a=" + Statics.field625 + var3 + "/";
    }

    @ObfuscatedName("bu.dg(Ljava/lang/String;I)V")
    public static void method1572(String arg0) {
        Statics.field1640 = arg0;
        try {
            String var1 = Statics.field285.getParameter(class190.field3060.field3063);
            String var2 = Statics.field285.getParameter(class190.field3061.field3063);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class111.method2999(class115.method2249() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class132.method2631(Statics.field285, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("dl.dk(Ljava/lang/String;ZI)V")
    public static void method2253(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1116; var5++) {
            class52 var6 = class52.method578(var5);
            if ((!arg1 || var6.field1160) && var6.field1153 == -1 && var6.field1122.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field3146 = -1;
                    Statics.field225 = null;
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
        Statics.field225 = var3;
        Statics.field799 = 0;
        Statics.field3146 = var4;
        String[] var9 = new String[Statics.field3146];
        for (int var10 = 0; var10 < Statics.field3146; var10++) {
            var9[var10] = class52.method578(var3[var10]).field1122;
        }
        class124.method134(var9, Statics.field225);
    }
}

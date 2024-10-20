package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.Socket;
import java.util.Iterator;

public final class client extends class145 {

    @ObfuscatedName("client.b")
    public static boolean field456 = true;

    @ObfuscatedName("client.l")
    public static int field387 = 1;

    @ObfuscatedName("client.d")
    public static int field292 = 0;

    @ObfuscatedName("client.m")
    public static int field294 = 0;

    @ObfuscatedName("client.r")
    public static boolean field411 = false;

    @ObfuscatedName("client.k")
    public static boolean field297 = false;

    @ObfuscatedName("client.o")
    public static int field298 = 0;

    @ObfuscatedName("client.t")
    public static int field300 = 0;

    @ObfuscatedName("client.w")
    public static class109[] field351 = new class109[4];

    @ObfuscatedName("client.v")
    public static boolean field301 = true;

    @ObfuscatedName("client.c")
    public static int field302 = 0;

    @ObfuscatedName("client.i")
    public static long field461 = -1L;

    @ObfuscatedName("client.z")
    public static int field355 = -1;

    @ObfuscatedName("client.j")
    public static int field306 = -1;

    @ObfuscatedName("client.ag")
    public static int field307 = -1;

    @ObfuscatedName("client.ax")
    public static boolean field308 = true;

    @ObfuscatedName("client.ao")
    public static boolean field356 = false;

    @ObfuscatedName("client.ac")
    public static int field310 = 0;

    @ObfuscatedName("client.aj")
    public static int field458 = 0;

    @ObfuscatedName("client.an")
    public static int field312 = 0;

    @ObfuscatedName("client.al")
    public static int field361 = 0;

    @ObfuscatedName("client.as")
    public static int field314 = 0;

    @ObfuscatedName("client.av")
    public static int field315 = 0;

    @ObfuscatedName("client.am")
    public static int field441 = 0;

    @ObfuscatedName("client.az")
    public static int field317 = 0;

    @ObfuscatedName("client.ai")
    public static int field318 = 0;

    @ObfuscatedName("client.ap")
    public static class21 field319 = class21.field576;

    @ObfuscatedName("client.af")
    public static class21 field320 = class21.field576;

    @ObfuscatedName("client.ay")
    public static int field321 = 0;

    @ObfuscatedName("client.ae")
    public static int field342 = 0;

    @ObfuscatedName("client.ad")
    public static int field323 = 0;

    @ObfuscatedName("client.bt")
    public static int field324 = 0;

    @ObfuscatedName("client.bv")
    public static int field379 = 0;

    @ObfuscatedName("client.bb")
    public static int field343 = 0;

    @ObfuscatedName("client.bz")
    public static int field327 = 0;

    @ObfuscatedName("client.bd")
    public static int field328 = 0;

    @ObfuscatedName("client.cl")
    public static class35[] field329 = new class35[32768];

    @ObfuscatedName("client.ci")
    public static int field495 = 0;

    @ObfuscatedName("client.cz")
    public static int[] field331 = new int[32768];

    @ObfuscatedName("client.cj")
    public static int field332 = 0;

    @ObfuscatedName("client.ch")
    public static int[] field289 = new int[250];

    @ObfuscatedName("client.cg")
    public static class123 field334 = new class123(5000);

    @ObfuscatedName("client.cw")
    public static class123 field452 = new class123(5000);

    @ObfuscatedName("client.ck")
    public static class123 field336 = new class123(15000);

    @ObfuscatedName("client.cv")
    public static int field420 = 0;

    @ObfuscatedName("client.cc")
    public static int field326 = 0;

    @ObfuscatedName("client.cf")
    public static int field339 = 0;

    @ObfuscatedName("client.cb")
    public static int field340 = 0;

    @ObfuscatedName("client.cs")
    public static int field305 = 0;

    @ObfuscatedName("client.cp")
    public static int field484 = 0;

    @ObfuscatedName("client.cd")
    public static int field418 = 0;

    @ObfuscatedName("client.cq")
    public static int field344 = 0;

    @ObfuscatedName("client.cy")
    public static boolean field362 = false;

    @ObfuscatedName("client.da")
    public static int field378 = 0;

    @ObfuscatedName("client.dy")
    public static int field480 = 1;

    @ObfuscatedName("client.dg")
    public static int field348 = 0;

    @ObfuscatedName("client.ds")
    public static int field405 = 1;

    @ObfuscatedName("client.do")
    public static int field500 = 0;

    @ObfuscatedName("client.de")
    public static boolean field352 = false;

    @ObfuscatedName("client.dm")
    public static int[][][] field353 = new int[4][13][13];

    @ObfuscatedName("client.dk")
    public static final int[] field288 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.df")
    public static int field383 = 0;

    @ObfuscatedName("client.db")
    public static int field551 = 2;

    @ObfuscatedName("client.dc")
    public static int field357 = 0;

    @ObfuscatedName("client.dv")
    public static int field358 = 2;

    @ObfuscatedName("client.dt")
    public static int field359 = 0;

    @ObfuscatedName("client.es")
    public static int field290 = 1;

    @ObfuscatedName("client.ea")
    public static int field346 = 0;

    @ObfuscatedName("client.eg")
    public static int field501 = 0;

    @ObfuscatedName("client.ej")
    public static int field363 = 2;

    @ObfuscatedName("client.ef")
    public static int field364 = 0;

    @ObfuscatedName("client.eh")
    public static int field504 = 1;

    @ObfuscatedName("client.ei")
    public static int field360 = 0;

    @ObfuscatedName("client.ek")
    public static int field367 = 0;

    @ObfuscatedName("client.ee")
    public static int field368 = 2301979;

    @ObfuscatedName("client.ep")
    public static int field369 = 5063219;

    @ObfuscatedName("client.ew")
    public static int field365 = 3353893;

    @ObfuscatedName("client.ed")
    public static int field371 = 7759444;

    @ObfuscatedName("client.ez")
    public static boolean field538 = false;

    @ObfuscatedName("client.fe")
    public static int field373 = 0;

    @ObfuscatedName("client.fv")
    public static int field374 = 128;

    @ObfuscatedName("client.fd")
    public static int field375 = 0;

    @ObfuscatedName("client.fq")
    public static int field376 = 0;

    @ObfuscatedName("client.fx")
    public static int field437 = 0;

    @ObfuscatedName("client.fz")
    public static int field372 = 0;

    @ObfuscatedName("client.fl")
    public static int field473 = 0;

    @ObfuscatedName("client.fo")
    public static int field380 = 50;

    @ObfuscatedName("client.ff")
    public static int field381 = 0;

    @ObfuscatedName("client.fb")
    public static boolean field341 = false;

    @ObfuscatedName("client.fw")
    public static int field557 = 0;

    @ObfuscatedName("client.fm")
    public static int field384 = 0;

    @ObfuscatedName("client.fc")
    public static int field385 = 50;

    @ObfuscatedName("client.fh")
    public static int[] field386 = new int[field385];

    @ObfuscatedName("client.fj")
    public static int[] field529 = new int[field385];

    @ObfuscatedName("client.fg")
    public static int[] field388 = new int[field385];

    @ObfuscatedName("client.fa")
    public static int[] field389 = new int[field385];

    @ObfuscatedName("client.fn")
    public static int[] field390 = new int[field385];

    @ObfuscatedName("client.ft")
    public static int[] field391 = new int[field385];

    @ObfuscatedName("client.gd")
    public static int[] field488 = new int[field385];

    @ObfuscatedName("client.gf")
    public static String[] field335 = new String[field385];

    @ObfuscatedName("client.gb")
    public static int[][] field338 = new int[104][104];

    @ObfuscatedName("client.gl")
    public static int field553 = 0;

    @ObfuscatedName("client.gr")
    public static int field396 = -1;

    @ObfuscatedName("client.gw")
    public static int field397 = -1;

    @ObfuscatedName("client.gk")
    public static int field347 = 0;

    @ObfuscatedName("client.ga")
    public static int field399 = 0;

    @ObfuscatedName("client.gm")
    public static int field512 = 0;

    @ObfuscatedName("client.gs")
    public static int field395 = 0;

    @ObfuscatedName("client.gp")
    public static int field402 = 0;

    @ObfuscatedName("client.gy")
    public static int field403 = 0;

    @ObfuscatedName("client.gx")
    public static int field404 = 0;

    @ObfuscatedName("client.gu")
    public static int field505 = 0;

    @ObfuscatedName("client.gh")
    public static int field406 = 0;

    @ObfuscatedName("client.gt")
    public static int field407 = 0;

    @ObfuscatedName("client.gn")
    public static boolean field408 = false;

    @ObfuscatedName("client.gz")
    public static int field472 = 0;

    @ObfuscatedName("client.gj")
    public static int field410 = 0;

    @ObfuscatedName("client.gc")
    public static class3[] field303 = new class3[2048];

    @ObfuscatedName("client.gv")
    public static int field412 = -1;

    @ObfuscatedName("client.hf")
    public static int field413 = 0;

    @ObfuscatedName("client.hu")
    public static int field325 = 0;

    @ObfuscatedName("client.hk")
    public static int[] field415 = new int[1000];

    @ObfuscatedName("client.hd")
    public static final int[] field416 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.ho")
    public static String[] field417 = new String[8];

    @ObfuscatedName("client.he")
    public static boolean[] field377 = new boolean[8];

    @ObfuscatedName("client.hr")
    public static int[] field419 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hp")
    public static int field465 = -1;

    @ObfuscatedName("client.hh")
    public static class200[][][] field573 = new class200[4][104][104];

    @ObfuscatedName("client.hj")
    public static class200 field422 = new class200();

    @ObfuscatedName("client.ha")
    public static class200 field550 = new class200();

    @ObfuscatedName("client.hw")
    public static class200 field424 = new class200();

    @ObfuscatedName("client.hm")
    public static int[] field425 = new int[25];

    @ObfuscatedName("client.hs")
    public static int[] field426 = new int[25];

    @ObfuscatedName("client.hv")
    public static int[] field427 = new int[25];

    @ObfuscatedName("client.hn")
    public static int field475 = 0;

    @ObfuscatedName("client.hi")
    public static boolean field311 = false;

    @ObfuscatedName("client.hq")
    public static int field430 = 0;

    @ObfuscatedName("client.hy")
    public static int[] field435 = new int[500];

    @ObfuscatedName("client.ip")
    public static int[] field432 = new int[500];

    @ObfuscatedName("client.in")
    public static int[] field330 = new int[500];

    @ObfuscatedName("client.iv")
    public static int[] field434 = new int[500];

    @ObfuscatedName("client.ie")
    public static String[] field460 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field436 = new String[500];

    @ObfuscatedName("client.ib")
    public static int field569 = -1;

    @ObfuscatedName("client.ia")
    public static int field462 = -1;

    @ObfuscatedName("client.is")
    public static int field439 = 0;

    @ObfuscatedName("client.ih")
    public static int field440 = 50;

    @ObfuscatedName("client.ir")
    public static int field354 = 0;

    @ObfuscatedName("client.iu")
    public static String field442 = null;

    @ObfuscatedName("client.iw")
    public static boolean field443 = false;

    @ObfuscatedName("client.ic")
    public static int field444 = -1;

    @ObfuscatedName("client.ij")
    public static int field471 = -1;

    @ObfuscatedName("client.ig")
    public static String field446 = null;

    @ObfuscatedName("client.if")
    public static String field447 = null;

    @ObfuscatedName("client.iz")
    public static int field392 = -1;

    @ObfuscatedName("client.it")
    public static class197 field449 = new class197(8);

    @ObfuscatedName("client.jh")
    public static int field450 = 0;

    @ObfuscatedName("client.jz")
    public static int field451 = 0;

    @ObfuscatedName("client.jc")
    public static class174 field313 = null;

    @ObfuscatedName("client.jy")
    public static int field453 = 0;

    @ObfuscatedName("client.jt")
    public static int field454 = 0;

    @ObfuscatedName("client.je")
    public static int field455 = 0;

    @ObfuscatedName("client.ji")
    public static int field333 = -1;

    @ObfuscatedName("client.jm")
    public static boolean field457 = false;

    @ObfuscatedName("client.jo")
    public static boolean field535 = false;

    @ObfuscatedName("client.jv")
    public static boolean field459 = false;

    @ObfuscatedName("client.jj")
    public static class174 field463 = null;

    @ObfuscatedName("client.js")
    public static class174 field429 = null;

    @ObfuscatedName("client.jd")
    public static class174 field299 = null;

    @ObfuscatedName("client.jf")
    public static int field309 = 0;

    @ObfuscatedName("client.jq")
    public static int field546 = 0;

    @ObfuscatedName("client.jk")
    public static class174 field400 = null;

    @ObfuscatedName("client.jw")
    public static boolean field466 = false;

    @ObfuscatedName("client.jl")
    public static int field467 = -1;

    @ObfuscatedName("client.ju")
    public static int field468 = -1;

    @ObfuscatedName("client.jn")
    public static boolean field469 = false;

    @ObfuscatedName("client.jx")
    public static int field470 = -1;

    @ObfuscatedName("client.jg")
    public static int field296 = -1;

    @ObfuscatedName("client.jr")
    public static boolean field370 = false;

    @ObfuscatedName("client.kx")
    public static int field564 = 1;

    @ObfuscatedName("client.kk")
    public static int[] field409 = new int[32];

    @ObfuscatedName("client.ki")
    public static int field291 = 0;

    @ObfuscatedName("client.kp")
    public static int[] field476 = new int[32];

    @ObfuscatedName("client.kd")
    public static int field477 = 0;

    @ObfuscatedName("client.kv")
    public static int[] field478 = new int[32];

    @ObfuscatedName("client.kj")
    public static int field479 = 0;

    @ObfuscatedName("client.kt")
    public static int field482 = 0;

    @ObfuscatedName("client.ku")
    public static int field481 = 0;

    @ObfuscatedName("client.km")
    public static int field543 = 0;

    @ObfuscatedName("client.ke")
    public static int field563 = 0;

    @ObfuscatedName("client.kh")
    public static int field536 = 0;

    @ObfuscatedName("client.kl")
    public static int field528 = 0;

    @ObfuscatedName("client.kf")
    public static int field486 = 0;

    @ObfuscatedName("client.kr")
    public static class200 field487 = new class200();

    @ObfuscatedName("client.kq")
    public static class200 field394 = new class200();

    @ObfuscatedName("client.ko")
    public static class200 field489 = new class200();

    @ObfuscatedName("client.ky")
    public static class197 field490 = new class197(512);

    @ObfuscatedName("client.kc")
    public static int field491 = 0;

    @ObfuscatedName("client.kg")
    public static int field492 = -2;

    @ObfuscatedName("client.lz")
    public static boolean[] field517 = new boolean[100];

    @ObfuscatedName("client.lm")
    public static boolean[] field494 = new boolean[100];

    @ObfuscatedName("client.lk")
    public static boolean[] field428 = new boolean[100];

    @ObfuscatedName("client.lh")
    public static int[] field496 = new int[100];

    @ObfuscatedName("client.ll")
    public static int[] field497 = new int[100];

    @ObfuscatedName("client.lo")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.ln")
    public static int[] field499 = new int[100];

    @ObfuscatedName("client.lj")
    public static int field337 = 0;

    @ObfuscatedName("client.lt")
    public static long field293 = 0L;

    @ObfuscatedName("client.la")
    public static boolean field502 = true;

    @ObfuscatedName("client.lr")
    public static int field503 = 765;

    @ObfuscatedName("client.lp")
    public static int field382 = 503;

    @ObfuscatedName("client.li")
    public static int[] field349 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.ly")
    public static int field506 = 0;

    @ObfuscatedName("client.lq")
    public static int field507 = 0;

    @ObfuscatedName("client.lc")
    public static String field508 = "";

    @ObfuscatedName("client.lx")
    public static long[] field509 = new long[100];

    @ObfuscatedName("client.ld")
    public static int field510 = 0;

    @ObfuscatedName("client.lu")
    public static int field511 = 0;

    @ObfuscatedName("client.mg")
    public static int[] field431 = new int[128];

    @ObfuscatedName("client.me")
    public static int[] field513 = new int[128];

    @ObfuscatedName("client.mn")
    public static long field514 = -1L;

    @ObfuscatedName("client.mw")
    public static String field515 = null;

    @ObfuscatedName("client.ms")
    public static String field516 = null;

    @ObfuscatedName("client.md")
    public static int field423 = -1;

    @ObfuscatedName("client.mf")
    public static int field518 = 0;

    @ObfuscatedName("client.mp")
    public static int[] field519 = new int[1000];

    @ObfuscatedName("client.mt")
    public static int[] field520 = new int[1000];

    @ObfuscatedName("client.mj")
    public static class79[] field521 = new class79[1000];

    @ObfuscatedName("client.mh")
    public static int field483 = 0;

    @ObfuscatedName("client.mq")
    public static int field523 = 0;

    @ObfuscatedName("client.mo")
    public static int field524 = 0;

    @ObfuscatedName("client.ma")
    public static int field525 = 255;

    @ObfuscatedName("client.mr")
    public static int field316 = -1;

    @ObfuscatedName("client.mv")
    public static boolean field527 = false;

    @ObfuscatedName("client.nw")
    public static int field493 = 127;

    @ObfuscatedName("client.ne")
    public static int field350 = 127;

    @ObfuscatedName("client.nk")
    public static int field555 = 0;

    @ObfuscatedName("client.nh")
    public static int[] field532 = new int[50];

    @ObfuscatedName("client.na")
    public static int[] field533 = new int[50];

    @ObfuscatedName("client.nc")
    public static int[] field534 = new int[50];

    @ObfuscatedName("client.nu")
    public static int[] field522 = new int[50];

    @ObfuscatedName("client.nb")
    public static class59[] field393 = new class59[50];

    @ObfuscatedName("client.ns")
    public static boolean field537 = false;

    @ObfuscatedName("client.od")
    public static boolean[] field526 = new boolean[5];

    @ObfuscatedName("client.of")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field540 = new int[5];

    @ObfuscatedName("client.oa")
    public static int[] field541 = new int[5];

    @ObfuscatedName("client.oj")
    public static int[] field542 = new int[5];

    @ObfuscatedName("client.os")
    public static short field345 = 256;

    @ObfuscatedName("client.om")
    public static short field544 = 205;

    @ObfuscatedName("client.ol")
    public static short field545 = 256;

    @ObfuscatedName("client.oz")
    public static short field445 = 320;

    @ObfuscatedName("client.oc")
    public static short field547 = 1;

    @ObfuscatedName("client.oe")
    public static short field548 = 32767;

    @ObfuscatedName("client.oi")
    public static short field421 = 1;

    @ObfuscatedName("client.oh")
    public static short field566 = 32767;

    @ObfuscatedName("client.oq")
    public static int field464 = 0;

    @ObfuscatedName("client.or")
    public static int field552 = 0;

    @ObfuscatedName("client.ou")
    public static int field433 = 0;

    @ObfuscatedName("client.on")
    public static int field554 = 0;

    @ObfuscatedName("client.oy")
    public static int field549 = 0;

    @ObfuscatedName("client.ox")
    public static int field556 = 0;

    @ObfuscatedName("client.ob")
    public static int field398 = 0;

    @ObfuscatedName("client.ok")
    public static class18[] field558 = new class18[400];

    @ObfuscatedName("client.og")
    public static class196 field559 = new class196();

    @ObfuscatedName("client.oo")
    public static int field560 = 0;

    @ObfuscatedName("client.ow")
    public static class8[] field561 = new class8[400];

    @ObfuscatedName("client.pl")
    public static class180 field562 = new class180();

    @ObfuscatedName("client.pg")
    public static int field304 = -1;

    @ObfuscatedName("client.pm")
    public static int field401 = -1;

    @ObfuscatedName("client.pj")
    public static class221[] field565 = new class221[8];

    @ObfuscatedName("client.pu")
    public static long field366 = -1L;

    @ObfuscatedName("client.pc")
    public static long field485 = -1L;

    @ObfuscatedName("client.py")
    public static final class11 field568 = new class11();

    @ObfuscatedName("client.ph")
    public static int[] field322 = new int[50];

    @ObfuscatedName("client.pp")
    public static int[] field570 = new int[50];

    @ObfuscatedName("client.d(B)V")
    public final void method423() {
    }

    public final void init() {
        if (!this.method2908()) {
            return;
        }
        class191[] var1 = new class191[] { class191.field3068, class191.field3058, class191.field3064, class191.field3063, class191.field3065, class191.field3061, class191.field3056, class191.field3069, class191.field3066, class191.field3059, class191.field3062, class191.field3060, class191.field3067, class191.field3057, class191.field3055 };
        class191[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            String var5 = this.getParameter(var4.field3070);
            if (var5 != null) {
                switch(Integer.parseInt(var4.field3070)) {
                    case 1:
                        field292 = Integer.parseInt(var5);
                        break;
                    case 2:
                        Statics.field448 = class154.method1823(Integer.parseInt(var5));
                        break;
                    case 3:
                        Statics.field1237 = var5;
                        break;
                    case 4:
                        Statics.field221 = Integer.parseInt(var5);
                        break;
                    case 5:
                        field294 = Integer.parseInt(var5);
                        break;
                    case 6:
                        Statics.field1037 = Integer.parseInt(var5);
                        break;
                    case 7:
                        if (var5.equalsIgnoreCase(class2.field32)) {
                            field411 = true;
                        } else {
                            field411 = false;
                        }
                        break;
                    case 8:
                        field298 = Integer.parseInt(var5);
                        break;
                    case 9:
                        if (var5.equalsIgnoreCase(class2.field32)) {
                        }
                        break;
                    case 10:
                        field387 = Integer.parseInt(var5);
                    case 11:
                    case 12:
                    case 14:
                    default:
                        break;
                    case 13:
                        Statics.field414 = var5;
                        break;
                    case 15:
                        class155[] var6 = new class155[] { class155.field2277, class155.field2283, class155.field2282, class155.field2280, class155.field2278, class155.field2279 };
                        Statics.field2131 = (class155) class110.method170(var6, Integer.parseInt(var5));
                        if (Statics.field2131 == class155.field2277) {
                            Statics.field295 = class213.field3141;
                        } else {
                            Statics.field295 = class213.field3140;
                        }
                }
            }
        }
        class87.field1499 = false;
        field297 = false;
        Statics.field67 = this.getCodeBase().getHost();
        String var7 = Statics.field448.field2276;
        byte var8 = 0;
        try {
            Statics.field1104 = 16;
            Statics.field1675 = var8;
            try {
                Statics.field71 = System.getProperty("os.name");
            } catch (Exception var60) {
                Statics.field71 = "Unknown";
            }
            Statics.field275 = Statics.field71.toLowerCase();
            try {
                Statics.field2240 = System.getProperty("user.home");
                if (Statics.field2240 != null) {
                    Statics.field2240 = Statics.field2240 + "/";
                }
            } catch (Exception var59) {
            }
            try {
                if (Statics.field275.startsWith("win")) {
                    if (Statics.field2240 == null) {
                        Statics.field2240 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field2240 == null) {
                    Statics.field2240 = System.getenv("HOME");
                }
                if (Statics.field2240 != null) {
                    Statics.field2240 = Statics.field2240 + "/";
                }
            } catch (Exception var58) {
            }
            if (Statics.field2240 == null) {
                Statics.field2240 = "~/";
            }
            Statics.field2045 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field2240, "/tmp/", "" };
            Statics.field2239 = new String[] { ".jagex_cache_" + Statics.field1675, ".file_store_" + Statics.field1675 };
            int var12 = 0;
            label294: while (var12 < 4) {
                String var13 = var12 == 0 ? "" : "" + var12;
                Statics.field68 = new File(Statics.field2240, "jagex_cl_oldschool_" + var7 + var13 + ".dat");
                String var14 = null;
                String var15 = null;
                boolean var16 = false;
                if (Statics.field68.exists()) {
                    try {
                        class228 var17 = new class228(Statics.field68, "rw", 10000L);
                        class120 var18 = new class120((int) var17.method3875());
                        while (var18.field1999 < var18.field2001.length) {
                            int var19 = var17.method3871(var18.field2001, var18.field1999, var18.field2001.length - var18.field1999);
                            if (var19 == -1) {
                                throw new IOException();
                            }
                            var18.field1999 += var19;
                        }
                        var18.field1999 = 0;
                        int var20 = var18.method2385();
                        if (var20 < 1 || var20 > 3) {
                            throw new IOException("" + var20);
                        }
                        int var21 = 0;
                        if (var20 > 1) {
                            var21 = var18.method2385();
                        }
                        if (var20 <= 2) {
                            var14 = var18.method2394();
                            if (var21 == 1) {
                                var15 = var18.method2394();
                            }
                        } else {
                            var14 = var18.method2439();
                            if (var21 == 1) {
                                var15 = var18.method2439();
                            }
                        }
                        var17.method3874();
                    } catch (IOException var63) {
                        var63.printStackTrace();
                    }
                    if (var14 != null) {
                        File var23 = new File(var14);
                        if (!var23.exists()) {
                            var14 = null;
                        }
                    }
                    if (var14 != null) {
                        File var24 = new File(var14, "test.dat");
                        if (!class150.method610(var24, true)) {
                            var14 = null;
                        }
                    }
                }
                if (var14 == null && var12 == 0) {
                    label270: for (int var25 = 0; var25 < Statics.field2239.length; var25++) {
                        for (int var26 = 0; var26 < Statics.field2045.length; var26++) {
                            File var27 = new File(Statics.field2045[var26] + Statics.field2239[var25] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var27.exists() && class150.method610(new File(var27, "test.dat"), true)) {
                                var14 = var27.toString();
                                var16 = true;
                                break label270;
                            }
                        }
                    }
                }
                if (var14 == null) {
                    var14 = Statics.field2240 + File.separatorChar + "jagexcache" + var13 + File.separatorChar + "oldschool" + File.separatorChar + var7 + File.separatorChar;
                    var16 = true;
                }
                if (var15 != null) {
                    File var28 = new File(var15);
                    File var29 = new File(var14);
                    try {
                        File[] var30 = var28.listFiles();
                        File[] var31 = var30;
                        for (int var32 = 0; var32 < var31.length; var32++) {
                            File var33 = var31[var32];
                            File var34 = new File(var29, var33.getName());
                            boolean var35 = var33.renameTo(var34);
                            if (!var35) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var62) {
                        var62.printStackTrace();
                    }
                    var16 = true;
                }
                if (var16) {
                    File var37 = new File(var14);
                    Object var38 = null;
                    try {
                        class228 var39 = new class228(Statics.field68, "rw", 10000L);
                        class120 var40 = new class120(500);
                        var40.method2485(3);
                        var40.method2485(var38 == null ? 0 : 1);
                        var40.method2446(var37.getPath());
                        if (var38 != null) {
                            var40.method2446(((File) var38).getPath());
                        }
                        var39.method3883(var40.field2001, 0, var40.field1999);
                        var39.method3874();
                    } catch (IOException var57) {
                        var57.printStackTrace();
                    }
                }
                File var42 = new File(var14);
                Statics.field675 = var42;
                if (!Statics.field675.exists()) {
                    Statics.field675.mkdirs();
                }
                File[] var43 = Statics.field675.listFiles();
                if (var43 == null) {
                    break;
                }
                File[] var44 = var43;
                int var45 = 0;
                while (true) {
                    if (var45 >= var44.length) {
                        break label294;
                    }
                    File var46 = var44[var45];
                    if (!class150.method610(var46, false)) {
                        var12++;
                        break;
                    }
                    var45++;
                }
            }
            File var47 = Statics.field675;
            Statics.field2086 = var47;
            if (!Statics.field2086.exists()) {
                throw new RuntimeException("");
            }
            class136.field2089 = true;
            try {
                File var48 = new File(Statics.field2240, "random.dat");
                if (var48.exists()) {
                    class150.field2242 = new class229(new class228(var48, "rw", 25L), 24, 0);
                } else {
                    label223: for (int var49 = 0; var49 < Statics.field2239.length; var49++) {
                        for (int var50 = 0; var50 < Statics.field2045.length; var50++) {
                            File var51 = new File(Statics.field2045[var50] + Statics.field2239[var49] + File.separatorChar + "random.dat");
                            if (var51.exists()) {
                                class150.field2242 = new class229(new class228(var51, "rw", 25L), 24, 0);
                                break label223;
                            }
                        }
                    }
                }
                if (class150.field2242 == null) {
                    RandomAccessFile var52 = new RandomAccessFile(var48, "rw");
                    int var53 = var52.read();
                    var52.seek(0L);
                    var52.write(var53);
                    var52.seek(0L);
                    var52.close();
                    class150.field2242 = new class229(new class228(var48, "rw", 25L), 24, 0);
                }
            } catch (IOException var61) {
            }
            class150.field2238 = new class229(new class228(class136.method186("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2233 = new class229(new class228(class136.method186("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field258 = new class229[Statics.field1104];
            for (int var55 = 0; var55 < Statics.field1104; var55++) {
                Statics.field258[var55] = new class229(new class228(class136.method186("main_file_cache.idx" + var55), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var64) {
            class149.method957((String) null, var64);
        }
        Statics.field531 = this;
        this.method2862(765, 503, 117);
    }

    @ObfuscatedName("client.m(B)V")
    public final void method253() {
        Statics.field3231 = field294 == 0 ? 43594 : field387 + 40000;
        Statics.field263 = field294 == 0 ? 443 : field387 + 50000;
        Statics.field225 = Statics.field3231;
        Statics.field2920 = class175.field2896;
        Statics.field2702 = class175.field2893;
        Statics.field1621 = class175.field2892;
        Statics.field2921 = class175.field2895;
        if (Statics.field2090.toLowerCase().indexOf("microsoft") == -1) {
            class138.field2104[44] = 71;
            class138.field2104[45] = 26;
            class138.field2104[46] = 72;
            class138.field2104[47] = 73;
            class138.field2104[59] = 57;
            class138.field2104[61] = 27;
            class138.field2104[91] = 42;
            class138.field2104[92] = 74;
            class138.field2104[93] = 43;
            class138.field2104[192] = 28;
            class138.field2104[222] = 58;
            class138.field2104[520] = 59;
        } else {
            class138.field2104[186] = 57;
            class138.field2104[187] = 27;
            class138.field2104[188] = 71;
            class138.field2104[189] = 26;
            class138.field2104[190] = 72;
            class138.field2104[191] = 73;
            class138.field2104[192] = 58;
            class138.field2104[219] = 42;
            class138.field2104[220] = 74;
            class138.field2104[221] = 43;
            class138.field2104[222] = 59;
            class138.field2104[223] = 28;
        }
        class138.method614(Statics.field1568);
        class141.method604(Statics.field1568);
        class146 var1;
        try {
            var1 = new class146();
        } catch (Throwable var6) {
            var1 = null;
        }
        Statics.field2019 = var1;
        if (Statics.field2019 != null) {
            Statics.field2019.method2687(Statics.field1568);
        }
        Statics.field567 = new class135(255, class150.field2238, class150.field2233, 500000);
        Statics.field581 = class9.method191();
        Statics.field2012 = this.getToolkit().getSystemClipboard();
        class139.method668(this, Statics.field588);
        if (field294 != 0) {
            field356 = true;
        }
        int var3 = Statics.field581.field143;
        field293 = 0L;
        if (var3 >= 2) {
            field502 = true;
        } else {
            field502 = false;
        }
        method2971();
        if (field300 >= 25) {
            field334.method2604(81);
            class123 var4 = field334;
            int var5 = field502 ? 2 : 1;
            var4.method2485(var5);
            field334.method2371(Statics.field709);
            field334.method2371(Statics.field2275);
        }
        field2197 = true;
    }

    @ObfuscatedName("client.g(S)V")
    public final void method244() {
        field302++;
        this.method278();
        class171.method2671();
        class184.method3254();
        method111();
        class138 var1 = class138.field2119;
        synchronized (class138.field2119) {
            class138.field2127++;
            class138.field2117 = class138.field2128;
            class138.field2124 = 0;
            if (class138.field2114 >= 0) {
                while (class138.field2126 != class138.field2114) {
                    int var3 = class138.field2123[class138.field2126];
                    class138.field2126 = class138.field2126 + 1 & 0x7F;
                    if (var3 < 0) {
                        class138.field2115[~var3] = false;
                    } else {
                        if (!class138.field2115[var3] && class138.field2124 < class138.field2118.length - 1) {
                            class138.field2118[++class138.field2124 - 1] = var3;
                        }
                        class138.field2115[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class138.field2115[var2] = false;
                }
                class138.field2114 = class138.field2126;
            }
            class138.field2128 = class138.field2125;
        }
        class141 var5 = class141.field2148;
        synchronized (class141.field2148) {
            class141.field2145 = class141.field2155;
            class141.field2147 = class141.field2150;
            class141.field2152 = class141.field2151;
            class141.field2157 = class141.field2153;
            class141.field2162 = class141.field2154;
            class141.field2159 = class141.field2158;
            class141.field2160 = class141.field2156;
            class141.field2153 = 0;
        }
        if (Statics.field2019 != null) {
            int var7 = Statics.field2019.method2681();
            field486 = var7;
        }
        if (field300 == 0) {
            method194();
            class145.method117();
        } else if (field300 == 5) {
            class32.method2186(this);
            method194();
            class145.method117();
        } else if (field300 == 10 || field300 == 11) {
            class32.method2186(this);
        } else if (field300 == 20) {
            class32.method2186(this);
            method52();
        } else if (field300 == 25) {
            method1047(false);
            field378 = 0;
            boolean var8 = true;
            for (int var9 = 0; var9 < Statics.field2088.length; var9++) {
                if (Statics.field2653[var9] != -1 && Statics.field2088[var9] == null) {
                    Statics.field2088[var9] = Statics.field1564.method3061(Statics.field2653[var9], 0);
                    if (Statics.field2088[var9] == null) {
                        var8 = false;
                        field378++;
                    }
                }
                if (Statics.field2898[var9] != -1 && Statics.field151[var9] == null) {
                    Statics.field151[var9] = Statics.field1564.method3062(Statics.field2898[var9], 0, Statics.field864[var9]);
                    if (Statics.field151[var9] == null) {
                        var8 = false;
                        field378++;
                    }
                }
            }
            if (var8) {
                field348 = 0;
                boolean var10 = true;
                for (int var11 = 0; var11 < Statics.field2088.length; var11++) {
                    byte[] var12 = Statics.field151[var11];
                    if (var12 != null) {
                        int var13 = (Statics.field244[var11] >> 8) * 64 - Statics.field2735;
                        int var14 = (Statics.field244[var11] & 0xFF) * 64 - Statics.field577;
                        if (field352) {
                            var13 = 10;
                            var14 = 10;
                        }
                        var10 &= class6.method10(var12, var13, var14);
                    }
                }
                if (var10) {
                    if (field500 != 0) {
                        method732(class158.field2317 + class2.field25 + class2.field34 + 100 + "%" + class2.field23, true);
                    }
                    method111();
                    method138();
                    method111();
                    Statics.field2057.method1963();
                    method111();
                    System.gc();
                    for (int var15 = 0; var15 < 4; var15++) {
                        field351[var15].method2266();
                    }
                    for (int var16 = 0; var16 < 4; var16++) {
                        for (int var17 = 0; var17 < 104; var17++) {
                            for (int var18 = 0; var18 < 104; var18++) {
                                class6.field83[var16][var17][var18] = 0;
                            }
                        }
                    }
                    method111();
                    class6.method2886();
                    int var19 = Statics.field2088.length;
                    class24.method911();
                    method1047(true);
                    if (!field352) {
                        int var20 = 0;
                        label491: while (true) {
                            if (var20 >= var19) {
                                for (int var34 = 0; var34 < var19; var34++) {
                                    int var35 = (Statics.field244[var34] >> 8) * 64 - Statics.field2735;
                                    int var36 = (Statics.field244[var34] & 0xFF) * 64 - Statics.field577;
                                    byte[] var37 = Statics.field2088[var34];
                                    if (var37 == null && Statics.field6 < 800) {
                                        method111();
                                        class6.method2327(var35, var36, 64, 64);
                                    }
                                }
                                method1047(true);
                                int var38 = 0;
                                while (true) {
                                    if (var38 >= var19) {
                                        break label491;
                                    }
                                    byte[] var39 = Statics.field151[var38];
                                    if (var39 != null) {
                                        int var40 = (Statics.field244[var38] >> 8) * 64 - Statics.field2735;
                                        int var41 = (Statics.field244[var38] & 0xFF) * 64 - Statics.field577;
                                        method111();
                                        class87 var42 = Statics.field2057;
                                        class109[] var43 = field351;
                                        class120 var44 = new class120(var39);
                                        int var45 = -1;
                                        while (true) {
                                            int var46 = var44.method2398();
                                            if (var46 == 0) {
                                                break;
                                            }
                                            var45 += var46;
                                            int var47 = 0;
                                            while (true) {
                                                int var48 = var44.method2398();
                                                if (var48 == 0) {
                                                    break;
                                                }
                                                var47 += var48 - 1;
                                                int var49 = var47 & 0x3F;
                                                int var50 = var47 >> 6 & 0x3F;
                                                int var51 = var47 >> 12;
                                                int var52 = var44.method2385();
                                                int var53 = var52 >> 2;
                                                int var54 = var52 & 0x3;
                                                int var55 = var40 + var50;
                                                int var56 = var41 + var49;
                                                if (var55 > 0 && var56 > 0 && var55 < 103 && var56 < 103) {
                                                    int var57 = var51;
                                                    if ((class6.field83[1][var55][var56] & 0x2) == 2) {
                                                        var57 = var51 - 1;
                                                    }
                                                    class109 var58 = null;
                                                    if (var57 >= 0) {
                                                        var58 = var43[var57];
                                                    }
                                                    class6.method755(var51, var55, var56, var45, var54, var53, var42, var58);
                                                }
                                            }
                                        }
                                    }
                                    var38++;
                                }
                            }
                            int var21 = (Statics.field244[var20] >> 8) * 64 - Statics.field2735;
                            int var22 = (Statics.field244[var20] & 0xFF) * 64 - Statics.field577;
                            byte[] var23 = Statics.field2088[var20];
                            if (var23 != null) {
                                method111();
                                int var24 = Statics.field2710 * 8 - 48;
                                int var25 = Statics.field6 * 8 - 48;
                                class109[] var26 = field351;
                                int var27 = 0;
                                label488: while (true) {
                                    if (var27 >= 4) {
                                        class120 var30 = new class120(var23);
                                        int var31 = 0;
                                        while (true) {
                                            if (var31 >= 4) {
                                                break label488;
                                            }
                                            for (int var32 = 0; var32 < 64; var32++) {
                                                for (int var33 = 0; var33 < 64; var33++) {
                                                    class6.method2088(var30, var31, var21 + var32, var22 + var33, var24, var25, 0);
                                                }
                                            }
                                            var31++;
                                        }
                                    }
                                    for (int var28 = 0; var28 < 64; var28++) {
                                        for (int var29 = 0; var29 < 64; var29++) {
                                            if (var21 + var28 > 0 && var21 + var28 < 103 && var22 + var29 > 0 && var22 + var29 < 103) {
                                                var26[var27].field1909[var21 + var28][var22 + var29] &= 0xFEFFFFFF;
                                            }
                                        }
                                    }
                                    var27++;
                                }
                            }
                            var20++;
                        }
                    }
                    if (field352) {
                        int var59 = 0;
                        label424: while (true) {
                            if (var59 >= 4) {
                                for (int var70 = 0; var70 < 13; var70++) {
                                    for (int var71 = 0; var71 < 13; var71++) {
                                        int var72 = field353[0][var70][var71];
                                        if (var72 == -1) {
                                            class6.method2327(var70 * 8, var71 * 8, 8, 8);
                                        }
                                    }
                                }
                                method1047(true);
                                int var73 = 0;
                                while (true) {
                                    if (var73 >= 4) {
                                        break label424;
                                    }
                                    method111();
                                    for (int var74 = 0; var74 < 13; var74++) {
                                        label381: for (int var75 = 0; var75 < 13; var75++) {
                                            int var76 = field353[var73][var74][var75];
                                            if (var76 != -1) {
                                                int var77 = var76 >> 24 & 0x3;
                                                int var78 = var76 >> 1 & 0x3;
                                                int var79 = var76 >> 14 & 0x3FF;
                                                int var80 = var76 >> 3 & 0x7FF;
                                                int var81 = (var79 / 8 << 8) + var80 / 8;
                                                for (int var82 = 0; var82 < Statics.field244.length; var82++) {
                                                    if (Statics.field244[var82] == var81 && Statics.field151[var82] != null) {
                                                        byte[] var83 = Statics.field151[var82];
                                                        int var84 = var74 * 8;
                                                        int var85 = var75 * 8;
                                                        int var86 = (var79 & 0x7) * 8;
                                                        int var87 = (var80 & 0x7) * 8;
                                                        class87 var88 = Statics.field2057;
                                                        class109[] var89 = field351;
                                                        class120 var90 = new class120(var83);
                                                        int var91 = -1;
                                                        while (true) {
                                                            int var92 = var90.method2398();
                                                            if (var92 == 0) {
                                                                continue label381;
                                                            }
                                                            var91 += var92;
                                                            int var93 = 0;
                                                            while (true) {
                                                                int var94 = var90.method2398();
                                                                if (var94 == 0) {
                                                                    break;
                                                                }
                                                                var93 += var94 - 1;
                                                                int var95 = var93 & 0x3F;
                                                                int var96 = var93 >> 6 & 0x3F;
                                                                int var97 = var93 >> 12;
                                                                int var98 = var90.method2385();
                                                                int var99 = var98 >> 2;
                                                                int var100 = var98 & 0x3;
                                                                if (var77 == var97 && var96 >= var86 && var96 < var86 + 8 && var95 >= var87 && var95 < var87 + 8) {
                                                                    class41 var101 = class41.method2950(var91);
                                                                    int var102 = var84 + class178.method1015(var96 & 0x7, var95 & 0x7, var78, var101.field946, var101.field938, var100);
                                                                    int var104 = var96 & 0x7;
                                                                    int var105 = var95 & 0x7;
                                                                    int var107 = var101.field946;
                                                                    int var108 = var101.field938;
                                                                    if ((var100 & 0x1) == 1) {
                                                                        int var109 = var107;
                                                                        var107 = var108;
                                                                        var108 = var109;
                                                                    }
                                                                    int var110 = var78 & 0x3;
                                                                    int var111;
                                                                    if (var110 == 0) {
                                                                        var111 = var105;
                                                                    } else if (var110 == 1) {
                                                                        var111 = 7 - var104 - (var107 - 1);
                                                                    } else if (var110 == 2) {
                                                                        var111 = 7 - var105 - (var108 - 1);
                                                                    } else {
                                                                        var111 = var104;
                                                                    }
                                                                    int var112 = var85 + var111;
                                                                    if (var102 > 0 && var112 > 0 && var102 < 103 && var112 < 103) {
                                                                        int var113 = var73;
                                                                        if ((class6.field83[1][var102][var112] & 0x2) == 2) {
                                                                            var113 = var73 - 1;
                                                                        }
                                                                        class109 var114 = null;
                                                                        if (var113 >= 0) {
                                                                            var114 = var89[var113];
                                                                        }
                                                                        class6.method755(var73, var102, var112, var91, var78 + var100 & 0x3, var99, var88, var114);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    var73++;
                                }
                            }
                            method111();
                            for (int var60 = 0; var60 < 13; var60++) {
                                for (int var61 = 0; var61 < 13; var61++) {
                                    boolean var62 = false;
                                    int var63 = field353[var59][var60][var61];
                                    if (var63 != -1) {
                                        int var64 = var63 >> 24 & 0x3;
                                        int var65 = var63 >> 1 & 0x3;
                                        int var66 = var63 >> 14 & 0x3FF;
                                        int var67 = var63 >> 3 & 0x7FF;
                                        int var68 = (var66 / 8 << 8) + var67 / 8;
                                        for (int var69 = 0; var69 < Statics.field244.length; var69++) {
                                            if (Statics.field244[var69] == var68 && Statics.field2088[var69] != null) {
                                                class6.method2306(Statics.field2088[var69], var59, var60 * 8, var61 * 8, var64, (var66 & 0x7) * 8, (var67 & 0x7) * 8, var65, field351);
                                                var62 = true;
                                                break;
                                            }
                                        }
                                    }
                                    if (!var62) {
                                        class6.method46(var59, var60 * 8, var61 * 8);
                                    }
                                }
                            }
                            var59++;
                        }
                    }
                    method1047(true);
                    method138();
                    method111();
                    class6.method2655(Statics.field2057, field351);
                    method1047(true);
                    int var115 = class6.field84;
                    if (var115 > Statics.field213) {
                        var115 = Statics.field213;
                    }
                    if (var115 < Statics.field213 - 1) {
                        int var116 = Statics.field213 - 1;
                    }
                    if (field297) {
                        Statics.field2057.method1831(class6.field84);
                    } else {
                        Statics.field2057.method1831(0);
                    }
                    for (int var117 = 0; var117 < 104; var117++) {
                        for (int var118 = 0; var118 < 104; var118++) {
                            method2979(var117, var118);
                        }
                    }
                    method111();
                    method2946();
                    class41.field967.method3529();
                    if (Statics.field1765 != null) {
                        field334.method2604(180);
                        field334.method2370(1057001181);
                    }
                    if (!field352) {
                        int var119 = (Statics.field2710 - 6) / 8;
                        int var120 = (Statics.field2710 + 6) / 8;
                        int var121 = (Statics.field6 - 6) / 8;
                        int var122 = (Statics.field6 + 6) / 8;
                        for (int var123 = var119 - 1; var123 <= var120 + 1; var123++) {
                            for (int var124 = var121 - 1; var124 <= var122 + 1; var124++) {
                                if (var123 < var119 || var123 > var120 || var124 < var121 || var124 > var122) {
                                    Statics.field1564.method3079("m" + var123 + "_" + var124);
                                    Statics.field1564.method3079("l" + var123 + "_" + var124);
                                }
                            }
                        }
                    }
                    method153(30);
                    method111();
                    Statics.field85 = (byte[][][]) null;
                    Statics.field3181 = (byte[][][]) null;
                    Statics.field82 = (byte[][][]) null;
                    Statics.field87 = (byte[][][]) null;
                    Statics.field287 = (int[][][]) null;
                    Statics.field3160 = (byte[][][]) null;
                    Statics.field148 = (int[][]) null;
                    Statics.field104 = null;
                    Statics.field88 = null;
                    Statics.field86 = null;
                    Statics.field91 = null;
                    Statics.field888 = null;
                    field334.method2604(116);
                    class145.method117();
                } else {
                    field500 = 2;
                }
            } else {
                field500 = 1;
            }
        }
        if (field300 == 30) {
            method47();
        } else if (field300 == 40 || field300 == 45) {
            method52();
        }
    }

    @ObfuscatedName("client.s(I)V")
    public final void method245() {
        boolean var1;
        label267: {
            try {
                if (class184.field2954 == 2) {
                    if (Statics.field2073 == null) {
                        Statics.field2073 = class181.method3325(Statics.field583, Statics.field590, Statics.field3146);
                        if (Statics.field2073 == null) {
                            var1 = false;
                            break label267;
                        }
                    }
                    if (Statics.field134 == null) {
                        Statics.field134 = new class60(Statics.field2955, Statics.field2953);
                    }
                    if (Statics.field2956.method3407(Statics.field2073, Statics.field2959, Statics.field134, 22050)) {
                        Statics.field2956.method3408();
                        Statics.field2956.method3405(Statics.field2957);
                        Statics.field2956.method3410(Statics.field2073, Statics.field584);
                        class184.field2954 = 0;
                        Statics.field2073 = null;
                        Statics.field134 = null;
                        Statics.field583 = null;
                        var1 = true;
                        break label267;
                    }
                }
            } catch (Exception var27) {
                var27.printStackTrace();
                Statics.field2956.method3411();
                class184.field2954 = 0;
                Statics.field2073 = null;
                Statics.field134 = null;
                Statics.field583 = null;
            }
            var1 = false;
        }
        if (var1 && field527 && Statics.field924 != null) {
            Statics.field924.method1214();
        }
        if (field300 == 10 || field300 == 20 || field300 == 30) {
            if (field293 != 0L && class116.method2672() > field293) {
                int var4 = field502 ? 2 : 1;
                field293 = 0L;
                if (var4 >= 2) {
                    field502 = true;
                } else {
                    field502 = false;
                }
                method2971();
                if (field300 >= 25) {
                    field334.method2604(81);
                    class123 var5 = field334;
                    int var6 = field502 ? 2 : 1;
                    var5.method2485(var6);
                    field334.method2371(Statics.field709);
                    field334.method2371(Statics.field2275);
                }
                field2197 = true;
            } else if (field2199) {
                method1107();
            }
        }
        Dimension var7 = this.method2875();
        if (Statics.field996 != var7.width || Statics.field1056 != var7.height || field2205) {
            method2971();
            field293 = class116.method2672() + 500L;
            field2205 = false;
        }
        boolean var8 = false;
        if (field2197) {
            field2197 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field517[var9] = true;
            }
        }
        if (var8) {
            method3();
        }
        if (field300 == 0) {
            class145.method2830(class32.field729, class32.field741, (Color) null, var8);
        } else if (field300 == 5) {
            class32.method2965(Statics.field759, Statics.field738, Statics.field815, var8);
        } else if (field300 == 10 || field300 == 11) {
            class32.method2965(Statics.field759, Statics.field738, Statics.field815, var8);
        } else if (field300 == 20) {
            class32.method2965(Statics.field759, Statics.field738, Statics.field815, var8);
        } else if (field300 == 25) {
            if (field500 == 1) {
                if (field378 > field480) {
                    field480 = field378;
                }
                int var10 = (field480 * 50 - field378 * 50) / field480;
                method732(class158.field2317 + class2.field25 + class2.field34 + var10 + "%" + class2.field23, false);
            } else if (field500 == 2) {
                if (field348 > field405) {
                    field405 = field348;
                }
                int var11 = (field405 * 50 - field348 * 50) / field405 + 50;
                method732(class158.field2317 + class2.field25 + class2.field34 + var11 + "%" + class2.field23, false);
            } else {
                method732(class158.field2317, false);
            }
        } else if (field300 == 30) {
            if (field392 != -1) {
                method626(field392);
            }
            for (int var12 = 0; var12 < field491; var12++) {
                if (field517[var12]) {
                    field494[var12] = true;
                }
                field428[var12] = field517[var12];
                field517[var12] = false;
            }
            field492 = field302;
            field569 = -1;
            field462 = -1;
            Statics.field1166 = null;
            if (field392 != -1) {
                field491 = 0;
                method1824(field392, 0, 0, Statics.field709, Statics.field2275, 0, 0, -1);
            }
            class80.method1721();
            if (field311) {
                method171();
            } else if (field569 != -1) {
                int var13 = field569;
                int var14 = field462;
                if (field430 >= 2 || field354 != 0 || field443) {
                    String var15;
                    if (field354 == 1 && field430 < 2) {
                        var15 = class158.field2538 + class158.field2465 + field442 + " " + class2.field24;
                    } else if (field443 && field430 < 2) {
                        var15 = field446 + class158.field2465 + field447 + " " + class2.field24;
                    } else {
                        int var16 = field430 - 1;
                        String var17;
                        if (field436[var16].length() > 0) {
                            var17 = field460[var16] + class158.field2465 + field436[var16];
                        } else {
                            var17 = field460[var16];
                        }
                        var15 = var17;
                    }
                    if (field430 > 2) {
                        var15 = var15 + class2.method3026(16777215) + " " + '/' + " " + (field430 - 2) + class158.field2459;
                    }
                    Statics.field759.method3847(var15, var13 + 4, var14 + 15, 16777215, 0, field302 / 1000);
                }
            }
            if (field337 == 3) {
                for (int var18 = 0; var18 < field491; var18++) {
                    if (field428[var18]) {
                        class80.method1727(field496[var18], field497[var18], field498[var18], field499[var18], 16711935, 128);
                    } else if (field494[var18]) {
                        class80.method1727(field496[var18], field497[var18], field498[var18], field499[var18], 16711680, 128);
                    }
                }
            }
            class24.method2334(Statics.field213, Statics.field226.field838, Statics.field226.field881, field367);
            field367 = 0;
        } else if (field300 == 40) {
            method732(class158.field2318 + class2.field25 + class158.field2319, false);
        } else if (field300 == 45) {
            method732(class158.field2463, false);
        }
        if (field300 == 30 && field337 == 0 && !var8) {
            try {
                Graphics var19 = Statics.field1568.getGraphics();
                for (int var20 = 0; var20 < field491; var20++) {
                    if (field494[var20]) {
                        Statics.field197.method1549(var19, field496[var20], field497[var20], field498[var20], field499[var20]);
                        field494[var20] = false;
                    }
                }
            } catch (Exception var26) {
                Statics.field1568.repaint();
            }
        } else if (field300 > 0) {
            try {
                Graphics var22 = Statics.field1568.getGraphics();
                Statics.field197.method1548(var22, 0, 0);
                for (int var23 = 0; var23 < field491; var23++) {
                    field494[var23] = false;
                }
            } catch (Exception var25) {
                Statics.field1568.repaint();
            }
        }
    }

    @ObfuscatedName("client.r(I)V")
    public final void method393() {
        if (Statics.field66.method219()) {
            Statics.field66.method220();
        }
        if (Statics.field474 != null) {
            Statics.field474.field205 = false;
        }
        Statics.field474 = null;
        if (Statics.field2743 != null) {
            Statics.field2743.method2832();
            Statics.field2743 = null;
        }
        class138.method810();
        if (class141.field2148 != null) {
            class141 var1 = class141.field2148;
            synchronized (class141.field2148) {
                class141.field2148 = null;
            }
        }
        Statics.field2019 = null;
        if (Statics.field924 != null) {
            Statics.field924.method1221();
        }
        if (Statics.field129 != null) {
            Statics.field129.method1221();
        }
        class172.method2324();
        Object var3 = class171.field2706;
        synchronized (class171.field2706) {
            if (class171.field2703 != 0) {
                class171.field2703 = 1;
                try {
                    class171.field2706.wait();
                } catch (InterruptedException var8) {
                }
            }
        }
        try {
            class150.field2238.method3904();
            for (int var6 = 0; var6 < Statics.field1104; var6++) {
                Statics.field258[var6].method3904();
            }
            class150.field2233.method3904();
            class150.field2242.method3904();
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("k.k(II)V")
    public static void method153(int arg0) {
        if (field300 == arg0) {
            return;
        }
        if (field300 == 0) {
            class145.method175();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field379 = 0;
            field343 = 0;
            field327 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field159 != null) {
            Statics.field159.method2832();
            Statics.field159 = null;
        }
        if (field300 == 25) {
            field500 = 0;
            field378 = 0;
            field480 = 1;
            field348 = 0;
            field405 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            class32.method859(Statics.field1568, Statics.field703, Statics.field1910, true, 0);
        } else if (arg0 == 20) {
            class32.method859(Statics.field1568, Statics.field703, Statics.field1910, true, field300 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            class32.method859(Statics.field1568, Statics.field703, Statics.field1910, false, 4);
        } else {
            class32.method607();
        }
        field300 = arg0;
    }

    @ObfuscatedName("client.o(I)V")
    public void method278() {
        if (field300 == 1000) {
            return;
        }
        long var1 = class116.method2672();
        int var3 = (int) (var1 - Statics.field2047);
        Statics.field2047 = var1;
        if (var3 > 200) {
            var3 = 200;
        }
        class172.field2725 += var3;
        boolean var4;
        if (class172.field2722 == 0 && class172.field2715 == 0 && class172.field2720 == 0 && class172.field2731 == 0) {
            var4 = true;
        } else if (Statics.field2723 == null) {
            var4 = false;
        } else {
            try {
                label209: {
                    if (class172.field2725 > 30000) {
                        throw new IOException();
                    }
                    while (class172.field2715 < 20 && class172.field2731 > 0) {
                        class173 var5 = (class173) class172.field2714.method3558();
                        class120 var6 = new class120(4);
                        var6.method2485(1);
                        var6.method2372((int) var5.field3116);
                        Statics.field2723.method2837(var6.field2001, 0, 4);
                        class172.field2716.method3559(var5, var5.field3116);
                        class172.field2731--;
                        class172.field2715++;
                    }
                    while (class172.field2722 < 20 && class172.field2720 > 0) {
                        class173 var7 = (class173) class172.field2718.method3648();
                        class120 var8 = new class120(4);
                        var8.method2485(0);
                        var8.method2372((int) var7.field3116);
                        Statics.field2723.method2837(var8.field2001, 0, 4);
                        var7.method3655();
                        class172.field2721.method3559(var7, var7.field3116);
                        class172.field2720--;
                        class172.field2722++;
                    }
                    for (int var9 = 0; var9 < 100; var9++) {
                        int var10 = Statics.field2723.method2831();
                        if (var10 < 0) {
                            throw new IOException();
                        }
                        if (var10 == 0) {
                            break;
                        }
                        class172.field2725 = 0;
                        byte var11 = 0;
                        if (Statics.field2174 == null) {
                            var11 = 8;
                        } else if (class172.field2712 == 0) {
                            var11 = 1;
                        }
                        if (var11 > 0) {
                            int var12 = var11 - class172.field2724.field1999;
                            if (var12 > var10) {
                                var12 = var10;
                            }
                            Statics.field2723.method2855(class172.field2724.field2001, class172.field2724.field1999, var12);
                            if (class172.field2730 != 0) {
                                for (int var13 = 0; var13 < var12; var13++) {
                                    class172.field2724.field2001[class172.field2724.field1999 + var13] ^= class172.field2730;
                                }
                            }
                            class172.field2724.field1999 += var12;
                            if (class172.field2724.field1999 < var11) {
                                break;
                            }
                            if (Statics.field2174 == null) {
                                class172.field2724.field1999 = 0;
                                int var14 = class172.field2724.method2385();
                                int var15 = class172.field2724.method2387();
                                int var16 = class172.field2724.method2385();
                                int var17 = class172.field2724.method2527();
                                long var18 = (long) ((var14 << 16) + var15);
                                class173 var20 = (class173) class172.field2716.method3555(var18);
                                Statics.field1969 = true;
                                if (var20 == null) {
                                    var20 = (class173) class172.field2721.method3555(var18);
                                    Statics.field1969 = false;
                                }
                                if (var20 == null) {
                                    throw new IOException();
                                }
                                int var21 = var16 == 0 ? 5 : 9;
                                Statics.field2174 = var20;
                                Statics.field2713 = new class120(var17 + var21 + Statics.field2174.field2738);
                                Statics.field2713.method2485(var16);
                                Statics.field2713.method2370(var17);
                                class172.field2712 = 8;
                                class172.field2724.field1999 = 0;
                            } else if (class172.field2712 == 0) {
                                if (class172.field2724.field2001[0] == -1) {
                                    class172.field2712 = 1;
                                    class172.field2724.field1999 = 0;
                                } else {
                                    Statics.field2174 = null;
                                }
                            }
                        } else {
                            int var22 = Statics.field2713.field2001.length - Statics.field2174.field2738;
                            int var23 = 512 - class172.field2712;
                            if (var23 > var22 - Statics.field2713.field1999) {
                                var23 = var22 - Statics.field2713.field1999;
                            }
                            if (var23 > var10) {
                                var23 = var10;
                            }
                            Statics.field2723.method2855(Statics.field2713.field2001, Statics.field2713.field1999, var23);
                            if (class172.field2730 != 0) {
                                for (int var24 = 0; var24 < var23; var24++) {
                                    Statics.field2713.field2001[Statics.field2713.field1999 + var24] ^= class172.field2730;
                                }
                            }
                            Statics.field2713.field1999 += var23;
                            class172.field2712 += var23;
                            if (Statics.field2713.field1999 == var22) {
                                if (Statics.field2174.field3116 == 16711935L) {
                                    Statics.field2728 = Statics.field2713;
                                    for (int var25 = 0; var25 < 256; var25++) {
                                        class169 var26 = class172.field2729[var25];
                                        if (var26 != null) {
                                            Statics.field2728.field1999 = var25 * 8 + 5;
                                            int var27 = Statics.field2728.method2527();
                                            int var28 = Statics.field2728.method2527();
                                            var26.method3141(var27, var28);
                                        }
                                    }
                                } else {
                                    class172.field2727.reset();
                                    class172.field2727.update(Statics.field2713.field2001, 0, var22);
                                    int var29 = (int) class172.field2727.getValue();
                                    if (Statics.field2174.field2736 != var29) {
                                        try {
                                            Statics.field2723.method2832();
                                        } catch (Exception var35) {
                                        }
                                        class172.field2732++;
                                        Statics.field2723 = null;
                                        class172.field2730 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                        var4 = false;
                                        break label209;
                                    }
                                    class172.field2732 = 0;
                                    class172.field2717 = 0;
                                    Statics.field2174.field2742.method3160((int) (Statics.field2174.field3116 & 0xFFFFL), Statics.field2713.field2001, (Statics.field2174.field3116 & 0xFF0000L) == 16711680L, Statics.field1969);
                                }
                                Statics.field2174.method3679();
                                if (Statics.field1969) {
                                    class172.field2715--;
                                } else {
                                    class172.field2722--;
                                }
                                class172.field2712 = 0;
                                Statics.field2174 = null;
                                Statics.field2713 = null;
                            } else {
                                if (class172.field2712 != 512) {
                                    break;
                                }
                                class172.field2712 = 0;
                            }
                        }
                    }
                    var4 = true;
                }
            } catch (IOException var36) {
                try {
                    Statics.field2723.method2832();
                } catch (Exception var34) {
                }
                class172.field2717++;
                Statics.field2723 = null;
                var4 = false;
            }
        }
        if (!var4) {
            this.method248();
        }
    }

    @ObfuscatedName("client.q(I)V")
    public void method248() {
        if (class172.field2732 >= 4) {
            this.method2872("js5crc");
            field300 = 1000;
            return;
        }
        if (class172.field2717 >= 4) {
            if (field300 <= 5) {
                this.method2872("js5io");
                field300 = 1000;
                return;
            }
            field323 = 3000;
            class172.field2717 = 3;
        }
        if (--field323 + 1 > 0) {
            return;
        }
        try {
            if (field342 == 0) {
                Statics.field778 = Statics.field137.method2728(Statics.field67, Statics.field225);
                field342++;
            }
            if (field342 == 1) {
                if (Statics.field778.field2215 == 2) {
                    this.method249(-1);
                    return;
                }
                if (Statics.field778.field2215 == 1) {
                    field342++;
                }
            }
            if (field342 == 2) {
                Statics.field619 = new class144((Socket) Statics.field778.field2217, Statics.field137);
                class120 var1 = new class120(5);
                var1.method2485(15);
                var1.method2370(117);
                Statics.field619.method2837(var1.field2001, 0, 5);
                field342++;
                Statics.field2002 = class116.method2672();
            }
            if (field342 == 3) {
                if (field300 <= 5 || Statics.field619.method2831() > 0) {
                    int var2 = Statics.field619.method2834();
                    if (var2 != 0) {
                        this.method249(var2);
                        return;
                    }
                    field342++;
                } else if (class116.method2672() - Statics.field2002 > 30000L) {
                    this.method249(-2);
                    return;
                }
            }
            if (field342 == 4) {
                class172.method2787(Statics.field619, field300 > 20);
                Statics.field778 = null;
                Statics.field619 = null;
                field342 = 0;
                field324 = 0;
            }
        } catch (IOException var4) {
            this.method249(-3);
        }
    }

    @ObfuscatedName("client.p(II)V")
    public void method249(int arg0) {
        Statics.field778 = null;
        Statics.field619 = null;
        field342 = 0;
        if (Statics.field3231 == Statics.field225) {
            Statics.field225 = Statics.field263;
        } else {
            Statics.field225 = Statics.field3231;
        }
        field324++;
        if (field324 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field300 <= 5) {
                this.method2872("js5connect_full");
                field300 = 1000;
            } else {
                field323 = 3000;
            }
        } else if (field324 >= 2 && arg0 == 6) {
            this.method2872("js5connect_outofdate");
            field300 = 1000;
        } else if (field324 >= 4) {
            if (field300 <= 5) {
                this.method2872("js5connect");
                field300 = 1000;
            } else {
                field323 = 3000;
            }
        }
    }

    @ObfuscatedName("t.h(I)V")
    public static void method194() {
        if (field321 == 0) {
            Statics.field2057 = new class87(4, 104, 104, class6.field100);
            for (int var0 = 0; var0 < 4; var0++) {
                field351[var0] = new class109(104, 104);
            }
            Statics.field2912 = new class79(512, 512);
            class32.field741 = class158.field2382;
            class32.field729 = 5;
            field321 = 20;
        } else if (field321 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1598[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1839(var1, 500, 800, 512, 334);
            class32.field741 = class158.field2397;
            class32.field729 = 10;
            field321 = 30;
        } else if (field321 == 30) {
            Statics.field2069 = method1586(0, false, true, true);
            Statics.field2063 = method1586(1, false, true, true);
            Statics.field178 = method1586(2, true, false, true);
            Statics.field144 = method1586(3, false, true, true);
            Statics.field2102 = method1586(4, false, true, true);
            Statics.field1564 = method1586(5, true, true, true);
            Statics.field262 = method1586(6, true, true, false);
            Statics.field1972 = method1586(7, false, true, true);
            Statics.field1910 = method1586(8, false, true, true);
            Statics.field890 = method1586(9, false, true, true);
            Statics.field703 = method1586(10, false, true, true);
            Statics.field2258 = method1586(11, false, true, true);
            Statics.field256 = method1586(12, false, true, true);
            Statics.field3005 = method1586(13, true, false, true);
            Statics.field2209 = method1586(14, false, true, false);
            Statics.field747 = method1586(15, false, true, true);
            class32.field741 = class158.field2322;
            class32.field729 = 20;
            field321 = 40;
        } else if (field321 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field2069.method3137() * 4 / 100;
            int var8 = var7 + Statics.field2063.method3137() * 4 / 100;
            int var9 = var8 + Statics.field178.method3137() * 2 / 100;
            int var10 = var9 + Statics.field144.method3137() * 2 / 100;
            int var11 = var10 + Statics.field2102.method3137() * 6 / 100;
            int var12 = var11 + Statics.field1564.method3137() * 4 / 100;
            int var13 = var12 + Statics.field262.method3137() * 2 / 100;
            int var14 = var13 + Statics.field1972.method3137() * 60 / 100;
            int var15 = var14 + Statics.field1910.method3137() * 2 / 100;
            int var16 = var15 + Statics.field890.method3137() * 2 / 100;
            int var17 = var16 + Statics.field703.method3137() * 2 / 100;
            int var18 = var17 + Statics.field2258.method3137() * 2 / 100;
            int var19 = var18 + Statics.field256.method3137() * 2 / 100;
            int var20 = var19 + Statics.field3005.method3137() * 2 / 100;
            int var21 = var20 + Statics.field2209.method3137() * 2 / 100;
            int var22 = var21 + Statics.field747.method3137() * 2 / 100;
            if (var22 == 100) {
                class32.field741 = class158.field2307;
                class32.field729 = 30;
                field321 = 45;
            } else {
                if (var22 != 0) {
                    class32.field741 = class158.field2323 + var22 + "%";
                }
                class32.field729 = 30;
            }
        } else if (field321 == 45) {
            class57.method1014(22050, !field297, 2);
            class185 var23 = new class185();
            var23.method3498(9, 128);
            Statics.field924 = class57.method12(Statics.field137, Statics.field1568, 0, 22050);
            Statics.field924.method1211(var23);
            class184.method189(Statics.field747, Statics.field2209, Statics.field2102, var23);
            Statics.field129 = class57.method12(Statics.field137, Statics.field1568, 1, 2048);
            Statics.field2015 = new class56();
            Statics.field129.method1211(Statics.field2015);
            Statics.field195 = new class75(22050, Statics.field1197);
            class32.field741 = class158.field2325;
            class32.field729 = 35;
            field321 = 50;
        } else if (field321 == 50) {
            int var24 = 0;
            if (Statics.field738 == null) {
                Statics.field738 = class77.method1111(Statics.field1910, Statics.field3005, "p11_full", "");
            } else {
                var24++;
            }
            if (Statics.field815 == null) {
                Statics.field815 = class77.method1111(Statics.field1910, Statics.field3005, "p12_full", "");
            } else {
                var24++;
            }
            if (Statics.field759 == null) {
                Statics.field759 = class77.method1111(Statics.field1910, Statics.field3005, "b12_full", "");
            } else {
                var24++;
            }
            if (var24 < 3) {
                class32.field741 = class158.field2326 + var24 * 100 / 3 + "%";
                class32.field729 = 40;
            } else {
                Statics.field1075 = new class161(true);
                class32.field741 = class158.field2327;
                class32.field729 = 40;
                field321 = 60;
            }
        } else if (field321 == 60) {
            class169 var25 = Statics.field703;
            class169 var26 = Statics.field1910;
            int var27 = 0;
            if (var25.method3123("title.jpg", "")) {
                var27++;
            }
            if (var26.method3123("logo", "")) {
                var27++;
            }
            if (var26.method3123("logo_deadman_mode", "")) {
                var27++;
            }
            if (var26.method3123("titlebox", "")) {
                var27++;
            }
            if (var26.method3123("titlebutton", "")) {
                var27++;
            }
            if (var26.method3123("runes", "")) {
                var27++;
            }
            if (var26.method3123("title_mute", "")) {
                var27++;
            }
            if (var26.method3099("options_radio_buttons,0")) {
                var27++;
            }
            if (var26.method3099("options_radio_buttons,2")) {
                var27++;
            }
            var26.method3123("sl_back", "");
            var26.method3123("sl_flags", "");
            var26.method3123("sl_arrows", "");
            var26.method3123("sl_stars", "");
            var26.method3123("sl_button", "");
            byte var30 = 9;
            if (var27 < var30) {
                class32.field741 = class158.field2549 + var27 * 100 / var30 + "%";
                class32.field729 = 50;
            } else {
                class32.field741 = class158.field2329;
                class32.field729 = 50;
                method153(5);
                field321 = 70;
            }
        } else if (field321 == 70) {
            if (Statics.field178.method3065()) {
                class47.method159(Statics.field178);
                class169 var32 = Statics.field178;
                Statics.field994 = var32;
                class45.method2104(Statics.field178, Statics.field1972);
                class41.method2309(Statics.field178, Statics.field1972, field297);
                class40.method2256(Statics.field178, Statics.field1972);
                class52.method201(Statics.field178, Statics.field1972, field411, Statics.field738);
                class169 var33 = Statics.field178;
                class169 var34 = Statics.field2069;
                class169 var35 = Statics.field2063;
                Statics.field1012 = var33;
                Statics.field999 = var34;
                Statics.field1001 = var35;
                class169 var36 = Statics.field178;
                class169 var37 = Statics.field1972;
                Statics.field1039 = var36;
                Statics.field1022 = var37;
                class48.method188(Statics.field178);
                class53.method1583(Statics.field178);
                class174.method980(Statics.field144, Statics.field1972, Statics.field1910, Statics.field3005);
                class51.method1279(Statics.field178);
                class169 var38 = Statics.field178;
                Statics.field1093 = var38;
                class46.method775(Statics.field178);
                class50.method108(Statics.field178);
                Statics.field66 = new class20();
                class32.field741 = class158.field2481;
                class32.field729 = 60;
                field321 = 80;
            } else {
                class32.field741 = class158.field2330 + Statics.field178.method3142() + "%";
                class32.field729 = 60;
            }
        } else if (field321 == 80) {
            int var39 = 0;
            if (Statics.field166 == null) {
                class169 var40 = Statics.field1910;
                int var41 = var40.method3075("compass");
                int var42 = var40.method3076(var41, "");
                class79 var43 = class77.method991(var40, var41, var42);
                Statics.field166 = var43;
            } else {
                var39++;
            }
            if (Statics.field3052 == null) {
                class169 var44 = Statics.field1910;
                int var45 = var44.method3075("mapedge");
                int var46 = var44.method3076(var45, "");
                class79 var47 = class77.method991(var44, var45, var46);
                Statics.field3052 = var47;
            } else {
                var39++;
            }
            if (Statics.field212 == null) {
                Statics.field212 = class77.method588(Statics.field1910, "mapscene", "");
            } else {
                var39++;
            }
            if (Statics.field145 == null) {
                Statics.field145 = Statics.method125(Statics.field1910, "mapfunction", "");
            } else {
                var39++;
            }
            if (Statics.field2140 == null) {
                Statics.field2140 = Statics.method125(Statics.field1910, "hitmarks", "");
            } else {
                var39++;
            }
            if (Statics.field2306 == null) {
                Statics.field2306 = Statics.method125(Statics.field1910, "headicons_pk", "");
            } else {
                var39++;
            }
            if (Statics.field1542 == null) {
                Statics.field1542 = Statics.method125(Statics.field1910, "headicons_prayer", "");
            } else {
                var39++;
            }
            if (Statics.field165 == null) {
                Statics.field165 = Statics.method125(Statics.field1910, "headicons_hint", "");
            } else {
                var39++;
            }
            if (Statics.field105 == null) {
                Statics.field105 = Statics.method125(Statics.field1910, "mapmarker", "");
            } else {
                var39++;
            }
            if (Statics.field712 == null) {
                Statics.field712 = Statics.method125(Statics.field1910, "cross", "");
            } else {
                var39++;
            }
            if (Statics.field1960 == null) {
                Statics.field1960 = Statics.method125(Statics.field1910, "mapdots", "");
            } else {
                var39++;
            }
            if (Statics.field2598 == null) {
                Statics.field2598 = class77.method588(Statics.field1910, "scrollbar", "");
            } else {
                var39++;
            }
            if (Statics.field1963 == null) {
                Statics.field1963 = class77.method588(Statics.field1910, "mod_icons", "");
            } else {
                var39++;
            }
            if (var39 < 13) {
                class32.field741 = class158.field2530 + var39 * 100 / 13 + "%";
                class32.field729 = 70;
            } else {
                Statics.field3192 = Statics.field1963;
                Statics.field3052.method1682();
                int var48 = (int) (Math.random() * 21.0D) - 10;
                int var49 = (int) (Math.random() * 21.0D) - 10;
                int var50 = (int) (Math.random() * 21.0D) - 10;
                int var51 = (int) (Math.random() * 41.0D) - 20;
                for (int var52 = 0; var52 < Statics.field145.length; var52++) {
                    Statics.field145[var52].method1702(var48 + var51, var49 + var51, var50 + var51);
                }
                Statics.field212[0].method1787(var48 + var51, var49 + var51, var50 + var51);
                class32.field741 = class158.field2310;
                class32.field729 = 70;
                field321 = 90;
            }
        } else if (field321 == 90) {
            if (Statics.field890.method3065()) {
                class96 var53 = new class96(Statics.field890, Statics.field1910, 20, 0.8D, field297 ? 64 : 128);
                class92.method2062(var53);
                class92.method2037(0.8D);
                class32.field741 = class158.field2335;
                class32.field729 = 90;
                field321 = 110;
            } else {
                class32.field741 = class158.field2334 + Statics.field890.method3142() + "%";
                class32.field729 = 90;
            }
        } else if (field321 == 110) {
            Statics.field474 = new class14();
            Statics.field137.method2729(Statics.field474, 10);
            class32.field741 = class158.field2336;
            class32.field729 = 94;
            field321 = 120;
        } else if (field321 == 120) {
            if (Statics.field703.method3123("huffman", "")) {
                class114 var54 = new class114(Statics.field703.method3077("huffman", ""));
                Statics.field3182 = var54;
                class32.field741 = class158.field2338;
                class32.field729 = 96;
                field321 = 130;
            } else {
                class32.field741 = class158.field2337 + "%";
                class32.field729 = 96;
            }
        } else if (field321 == 130) {
            if (!Statics.field144.method3065()) {
                class32.field741 = class158.field2537 + Statics.field144.method3142() * 4 / 5 + "%";
                class32.field729 = 100;
            } else if (!Statics.field256.method3065()) {
                class32.field741 = class158.field2537 + (80 + Statics.field256.method3142() / 6) + "%";
                class32.field729 = 100;
            } else if (Statics.field3005.method3065()) {
                class32.field741 = class158.field2510;
                class32.field729 = 100;
                field321 = 140;
            } else {
                class32.field741 = class158.field2537 + (96 + Statics.field3005.method3142() / 20) + "%";
                class32.field729 = 100;
            }
        } else if (field321 == 140) {
            method153(10);
        }
    }

    @ObfuscatedName("bu.e(IZZZS)Lfo;")
    public static class169 method1586(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2238 != null) {
            var4 = new class135(arg0, class150.field2238, Statics.field258[arg0], 1000000);
        }
        return new class169(var4, Statics.field567, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("l.t(B)V")
    public static final void method52() {
        try {
            if (field379 == 0) {
                if (Statics.field2743 != null) {
                    Statics.field2743.method2832();
                    Statics.field2743 = null;
                }
                Statics.field2661 = null;
                field362 = false;
                field343 = 0;
                field379 = 1;
            }
            if (field379 == 1) {
                if (Statics.field2661 == null) {
                    Statics.field2661 = Statics.field137.method2728(Statics.field67, Statics.field225);
                }
                if (Statics.field2661.field2215 == 2) {
                    throw new IOException();
                }
                if (Statics.field2661.field2215 == 1) {
                    Statics.field2743 = new class144((Socket) Statics.field2661.field2217, Statics.field137);
                    Statics.field2661 = null;
                    field379 = 2;
                }
            }
            if (field379 == 2) {
                field334.field1999 = 0;
                field334.method2485(14);
                Statics.field2743.method2837(field334.field2001, 0, 1);
                field336.field1999 = 0;
                field379 = 3;
            }
            if (field379 == 3) {
                if (Statics.field924 != null) {
                    Statics.field924.method1210();
                }
                if (Statics.field129 != null) {
                    Statics.field129.method1210();
                }
                int var0 = Statics.field2743.method2834();
                if (Statics.field924 != null) {
                    Statics.field924.method1210();
                }
                if (Statics.field129 != null) {
                    Statics.field129.method1210();
                }
                if (var0 != 0) {
                    method956(var0);
                    return;
                }
                field336.field1999 = 0;
                field379 = 5;
            }
            if (field379 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field334.field1999 = 0;
                field334.method2485(1);
                field334.method2485(class32.field728.method590());
                field334.method2370(var1[0]);
                field334.method2370(var1[1]);
                field334.method2370(var1[2]);
                field334.method2370(var1[3]);
                switch(class32.field728.field2597) {
                    case 0:
                    case 3:
                        field334.method2372(Statics.field1881);
                        field334.field1999 += 5;
                        break;
                    case 1:
                        field334.field1999 += 8;
                        break;
                    case 2:
                        field334.method2370((Integer) Statics.field581.field147.get(Statics.method2972(class32.field730)));
                        field334.field1999 += 4;
                }
                field334.method2376(class32.field737);
                field334.method2405(class5.field75, class5.field77);
                field452.field1999 = 0;
                if (field300 == 40) {
                    field452.method2485(18);
                } else {
                    field452.method2485(16);
                }
                field452.method2371(0);
                int var2 = field452.field1999;
                field452.method2370(117);
                field452.method2422(field334.field2001, 0, field334.field1999);
                int var3 = field452.field1999;
                field452.method2376(class32.field730);
                field452.method2485((field502 ? 1 : 0) << 1 | (field297 ? 1 : 0));
                field452.method2371(Statics.field709);
                field452.method2371(Statics.field2275);
                class123 var4 = field452;
                byte[] var5 = new byte[24];
                try {
                    class150.field2242.method3892(0L);
                    class150.field2242.method3894(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var33) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2422(var5, 0, 24);
                field452.method2376(Statics.field414);
                field452.method2370(Statics.field221);
                class120 var9 = new class120(Statics.field1075.method2975());
                Statics.field1075.method2978(var9);
                field452.method2422(var9.field2001, 0, var9.field2001.length);
                field452.method2485(Statics.field1037);
                field452.method2370(Statics.field2069.field2679);
                field452.method2370(Statics.field2063.field2679);
                field452.method2370(Statics.field178.field2679);
                field452.method2370(Statics.field144.field2679);
                field452.method2370(Statics.field2102.field2679);
                field452.method2370(Statics.field1564.field2679);
                field452.method2370(Statics.field262.field2679);
                field452.method2370(Statics.field1972.field2679);
                field452.method2370(Statics.field1910.field2679);
                field452.method2370(Statics.field890.field2679);
                field452.method2370(Statics.field703.field2679);
                field452.method2370(Statics.field2258.field2679);
                field452.method2370(Statics.field256.field2679);
                field452.method2370(Statics.field3005.field2679);
                field452.method2370(Statics.field2209.field2679);
                field452.method2370(Statics.field747.field2679);
                field452.method2374(var1, var3, field452.field1999);
                field452.method2381(field452.field1999 - var2);
                Statics.field2743.method2837(field452.field2001, 0, field452.field1999);
                field334.method2603(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field336.method2603(var1);
                field379 = 6;
            }
            if (field379 == 6 && Statics.field2743.method2831() > 0) {
                int var11 = Statics.field2743.method2834();
                if (var11 == 21 && field300 == 20) {
                    field379 = 7;
                } else if (var11 == 2) {
                    field379 = 9;
                } else if (var11 == 15 && field300 == 40) {
                    field420 = -1;
                    field379 = 13;
                } else if (var11 == 23 && field327 < 1) {
                    field327++;
                    field379 = 0;
                } else if (var11 == 29) {
                    field379 = 11;
                } else {
                    method956(var11);
                    return;
                }
            }
            if (field379 == 7 && Statics.field2743.method2831() > 0) {
                field328 = (Statics.field2743.method2834() + 3) * 60;
                field379 = 8;
            }
            if (field379 == 8) {
                field343 = 0;
                Statics.method2311(class158.field2344, class158.field2345, field328 / 60 + class158.field2557);
                if (--field328 <= 0) {
                    field379 = 0;
                }
            } else {
                if (field379 == 9 && Statics.field2743.method2831() >= 13) {
                    boolean var12 = Statics.field2743.method2834() == 1;
                    Statics.field2743.method2855(field336.field2001, 0, 4);
                    field336.field1999 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field336.method2618() << 24;
                        int var15 = var14 | field336.method2618() << 16;
                        int var16 = var15 | field336.method2618() << 8;
                        int var17 = var16 | field336.method2618();
                        int var18 = Statics.method2972(class32.field730);
                        if (Statics.field581.field147.size() >= 10 && !Statics.field581.field147.containsKey(var18)) {
                            Iterator var19 = Statics.field581.field147.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field581.field147.put(var18, var17);
                        class9.method606();
                    }
                    field455 = Statics.field2743.method2834();
                    field457 = Statics.field2743.method2834() == 1;
                    field412 = Statics.field2743.method2834();
                    field412 <<= 0x8;
                    field412 += Statics.field2743.method2834();
                    field413 = Statics.field2743.method2834();
                    Statics.field2743.method2855(field336.field2001, 0, 1);
                    field336.field1999 = 0;
                    field326 = field336.method2618();
                    Statics.field2743.method2855(field336.field2001, 0, 2);
                    field336.field1999 = 0;
                    field420 = field336.method2387();
                    try {
                        class133.method2691(Statics.field531, "zap");
                    } catch (Throwable var32) {
                    }
                    field379 = 10;
                }
                if (field379 != 10) {
                    if (field379 == 11 && Statics.field2743.method2831() >= 2) {
                        field336.field1999 = 0;
                        Statics.field2743.method2855(field336.field2001, 0, 2);
                        field336.field1999 = 0;
                        Statics.field1797 = field336.method2387();
                        field379 = 12;
                    }
                    if (field379 == 12 && Statics.field2743.method2831() >= Statics.field1797) {
                        field336.field1999 = 0;
                        Statics.field2743.method2855(field336.field2001, 0, Statics.field1797);
                        field336.field1999 = 0;
                        String var21 = field336.method2499();
                        String var22 = field336.method2499();
                        String var23 = field336.method2499();
                        Statics.method2311(var21, var22, var23);
                        method153(10);
                    }
                    if (field379 == 13) {
                        if (field420 == -1) {
                            if (Statics.field2743.method2831() < 2) {
                                return;
                            }
                            Statics.field2743.method2855(field336.field2001, 0, 2);
                            field336.field1999 = 0;
                            field420 = field336.method2387();
                        }
                        if (Statics.field2743.method2831() >= field420) {
                            Statics.field2743.method2855(field336.field2001, 0, field420);
                            field336.field1999 = 0;
                            int var24 = field420;
                            field334.field1999 = 0;
                            field336.field1999 = 0;
                            field326 = -1;
                            field305 = -1;
                            field484 = -1;
                            field418 = -1;
                            field420 = 0;
                            field339 = 0;
                            field310 = 0;
                            field430 = 0;
                            field311 = false;
                            field524 = 0;
                            field483 = 0;
                            for (int var25 = 0; var25 < 2048; var25++) {
                                field303[var25] = null;
                            }
                            Statics.field226 = null;
                            for (int var26 = 0; var26 < field329.length; var26++) {
                                class35 var27 = field329[var26];
                                if (var27 != null) {
                                    var27.field847 = -1;
                                    var27.field848 = false;
                                }
                            }
                            class16.field230 = new class197(32);
                            method153(30);
                            for (int var28 = 0; var28 < 100; var28++) {
                                field517[var28] = true;
                            }
                            field334.method2604(81);
                            class123 var29 = field334;
                            int var30 = field502 ? 2 : 1;
                            var29.method2485(var30);
                            field334.method2371(Statics.field709);
                            field334.method2371(Statics.field2275);
                            Statics.method109(field336);
                            if (field336.field1999 != var24) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field343++;
                        if (field343 > 2000) {
                            if (field327 < 1) {
                                if (Statics.field3231 == Statics.field225) {
                                    Statics.field225 = Statics.field263;
                                } else {
                                    Statics.field225 = Statics.field3231;
                                }
                                field327++;
                                field379 = 0;
                            } else {
                                method956(-3);
                            }
                        }
                    }
                } else if (Statics.field2743.method2831() >= field420) {
                    field336.field1999 = 0;
                    Statics.field2743.method2855(field336.field2001, 0, field420);
                    method2261();
                    Statics.method109(field336);
                    Statics.field2710 = -1;
                    method730(false);
                    field326 = -1;
                }
            }
        } catch (IOException var34) {
            if (field327 < 1) {
                if (Statics.field3231 == Statics.field225) {
                    Statics.field225 = Statics.field263;
                } else {
                    Statics.field225 = Statics.field3231;
                }
                field327++;
                field379 = 0;
            } else {
                method956(-2);
            }
        }
    }

    @ObfuscatedName("dw.w(B)V")
    public static void method2261() {
        field461 = -1L;
        field307 = -1;
        Statics.field474.field201 = 0;
        Statics.field710 = true;
        field308 = true;
        field514 = -1L;
        class212.method110();
        field334.field1999 = 0;
        field336.field1999 = 0;
        field326 = -1;
        field305 = -1;
        field484 = -1;
        field418 = -1;
        field339 = 0;
        field310 = 0;
        field344 = 0;
        field458 = 0;
        field430 = 0;
        field311 = false;
        class141.field2146 = 0;
        class12.method11();
        field354 = 0;
        field443 = false;
        field555 = 0;
        field383 = (int) (Math.random() * 100.0D) - 50;
        field357 = (int) (Math.random() * 110.0D) - 55;
        field359 = (int) (Math.random() * 80.0D) - 40;
        field501 = (int) (Math.random() * 120.0D) - 60;
        field364 = (int) (Math.random() * 30.0D) - 20;
        field375 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field524 = 0;
        field423 = -1;
        field483 = 0;
        field523 = 0;
        field319 = class21.field576;
        field320 = class21.field576;
        field495 = 0;
        class33.field754 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field757[var0] = null;
            class33.field768[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field303[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field329[var2] = null;
        }
        field465 = -1;
        field550.method3582();
        field424.method3582();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field573[var3][var4][var5] = null;
                }
            }
        }
        field422 = new class200();
        field398 = 0;
        field556 = 0;
        field560 = 0;
        for (int var6 = 0; var6 < Statics.field2055; var6++) {
            class53 var7 = class53.method2969(var6);
            if (var7 != null) {
                class177.field2904[var6] = 0;
                class177.field2906[var6] = 0;
            }
        }
        Statics.field66.method203();
        field333 = -1;
        if (field392 != -1) {
            int var8 = field392;
            if (var8 != -1 && Statics.field2745[var8]) {
                Statics.field2803.method3072(var8);
                if (Statics.field2771[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2771[var8].length; var10++) {
                        if (Statics.field2771[var8][var10] != null) {
                            if (Statics.field2771[var8][var10].field2799 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2771[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2771[var8] = null;
                    }
                    Statics.field2745[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field449.method3558(); var11 != null; var11 = (class4) field449.method3556()) {
            method621(var11, true);
        }
        field392 = -1;
        field449 = new class197(8);
        field313 = null;
        field311 = false;
        field430 = 0;
        field562.method3277((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field417[var12] = null;
            field377[var12] = false;
        }
        class16.method48();
        field301 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field517[var13] = true;
        }
        field334.method2604(81);
        class123 var14 = field334;
        int var15 = field502 ? 2 : 1;
        var14.method2485(var15);
        field334.method2371(Statics.field709);
        field334.method2371(Statics.field2275);
        field515 = null;
        Statics.field1637 = 0;
        Statics.field793 = null;
        for (int var16 = 0; var16 < 8; var16++) {
            field565[var16] = new class221();
        }
        Statics.field2099 = null;
    }

    @ObfuscatedName("aw.v(II)V")
    public static void method956(int arg0) {
        if (arg0 == -3) {
            Statics.method2311(class158.field2347, class158.field2527, class158.field2349);
        } else if (arg0 == -2) {
            Statics.method2311(class158.field2423, class158.field2351, class158.field2352);
        } else if (arg0 == -1) {
            Statics.method2311(class158.field2353, class158.field2354, class158.field2355);
        } else if (arg0 == 3) {
            class32.field725 = 3;
        } else if (arg0 == 4) {
            Statics.method2311(class158.field2356, class158.field2518, class158.field2358);
        } else if (arg0 == 5) {
            Statics.method2311(class158.field2359, class158.field2360, class158.field2361);
        } else if (arg0 == 6) {
            Statics.method2311(class158.field2576, class158.field2363, class158.field2364);
        } else if (arg0 == 7) {
            Statics.method2311(class158.field2488, class158.field2366, class158.field2371);
        } else if (arg0 == 8) {
            Statics.method2311(class158.field2368, class158.field2512, class158.field2370);
        } else if (arg0 == 9) {
            Statics.method2311(class158.field2556, class158.field2339, class158.field2373);
        } else if (arg0 == 10) {
            Statics.method2311(class158.field2374, class158.field2573, class158.field2376);
        } else if (arg0 == 11) {
            Statics.method2311(class158.field2377, class158.field2419, class158.field2555);
        } else if (arg0 == 12) {
            Statics.method2311(class158.field2492, class158.field2381, class158.field2466);
        } else if (arg0 == 13) {
            Statics.method2311(class158.field2383, class158.field2384, class158.field2522);
        } else if (arg0 == 14) {
            Statics.method2311(class158.field2331, class158.field2571, class158.field2504);
        } else if (arg0 == 16) {
            Statics.method2311(class158.field2444, class158.field2390, class158.field2391);
        } else if (arg0 == 17) {
            Statics.method2311(class158.field2412, class158.field2451, class158.field2394);
        } else if (arg0 == 18) {
            Statics.method2311(class158.field2418, class158.field2386, class158.field2575);
        } else if (arg0 == 19) {
            Statics.method2311(class158.field2407, class158.field2497, class158.field2400);
        } else if (arg0 == 20) {
            Statics.method2311(class158.field2380, class158.field2402, class158.field2536);
        } else if (arg0 == 22) {
            Statics.method2311(class158.field2424, class158.field2460, class158.field2406);
        } else if (arg0 == 23) {
            Statics.method2311(class158.field2365, class158.field2493, class158.field2409);
        } else if (arg0 == 24) {
            Statics.method2311(class158.field2431, class158.field2411, class158.field2332);
        } else if (arg0 == 25) {
            Statics.method2311(class158.field2413, class158.field2414, class158.field2415);
        } else if (arg0 == 26) {
            Statics.method2311(class158.field2416, class158.field2417, class158.field2333);
        } else if (arg0 == 27) {
            Statics.method2311(class158.field2375, class158.field2581, class158.field2421);
        } else if (arg0 == 31) {
            Statics.method2311(class158.field2428, class158.field2429, class158.field2430);
        } else if (arg0 == 32) {
            Statics.method2311(class158.field2486, class158.field2432, class158.field2433);
        } else if (arg0 == 37) {
            Statics.method2311(class158.field2452, class158.field2435, class158.field2387);
        } else if (arg0 == 38) {
            Statics.method2311(class158.field2437, class158.field2438, class158.field2439);
        } else if (arg0 == 55) {
            Statics.method2311(class158.field2410, class158.field2441, class158.field2442);
        } else if (arg0 == 56) {
            Statics.method2311(class158.field2443, class158.field2346, class158.field2445);
            method153(11);
            return;
        } else if (arg0 == 57) {
            Statics.method2311(class158.field2446, class158.field2447, class158.field2448);
            method153(11);
            return;
        } else {
            Statics.method2311(class158.field2395, class158.field2450, class158.field2440);
        }
        method153(10);
    }

    @ObfuscatedName("d.y(B)V")
    public static final void method72() {
        if (Statics.field2743 != null) {
            Statics.field2743.method2832();
            Statics.field2743 = null;
        }
        method138();
        Statics.field2057.method1963();
        for (int var0 = 0; var0 < 4; var0++) {
            field351[var0].method2266();
        }
        System.gc();
        class184.method7(2);
        field316 = -1;
        field527 = false;
        class24.method911();
        method153(10);
    }

    @ObfuscatedName("k.c(B)V")
    public static final void method138() {
        class47.field1061.method3529();
        class42.method2951();
        class45.field1048.method3529();
        class41.field939.method3529();
        class41.field967.method3529();
        class41.field941.method3529();
        class41.field951.method3529();
        class40.method2307();
        class52.method910();
        class43.field1014.method3529();
        class43.field1002.method3529();
        class44.method808();
        class48.method2828();
        class53.field1169.method3529();
        class180.method2181();
        class174.method97();
        ((class96) Statics.field1595).method2085();
        class23.field601.method3529();
        Statics.field2069.method3073();
        Statics.field2063.method3073();
        Statics.field144.method3073();
        Statics.field2102.method3073();
        Statics.field1564.method3073();
        Statics.field262.method3073();
        Statics.field1972.method3073();
        Statics.field1910.method3073();
        Statics.field890.method3073();
        Statics.field703.method3073();
        Statics.field2258.method3073();
        Statics.field256.method3073();
    }

    @ObfuscatedName("b.i(I)V")
    public static final void method47() {
        if (field310 > 1) {
            field310--;
        }
        if (field344 > 0) {
            field344--;
        }
        if (field362) {
            field362 = false;
            if (field344 > 0) {
                method72();
            } else {
                method153(40);
                Statics.field159 = Statics.field2743;
                Statics.field2743 = null;
            }
            return;
        }
        if (!field311) {
            field460[0] = class158.field2544;
            field436[0] = "";
            field330[0] = 1006;
            field430 = 1;
        }
        for (int var0 = 0; var0 < 100 && method2308(); var0++) {
        }
        if (field300 != 30) {
            return;
        }
        while (true) {
            class211 var1 = (class211) class212.field3129.method3624();
            boolean var2;
            if (var1 == null) {
                var2 = false;
            } else {
                var2 = true;
            }
            if (!var2) {
                Object var4 = Statics.field474.field200;
                synchronized (Statics.field474.field200) {
                    if (!field456) {
                        Statics.field474.field201 = 0;
                    } else if (class141.field2157 != 0 || Statics.field474.field201 >= 40) {
                        field334.method2604(86);
                        field334.method2485(0);
                        int var5 = field334.field1999;
                        int var6 = 0;
                        for (int var7 = 0; var7 < Statics.field474.field201 && field334.field1999 - var5 < 240; var7++) {
                            var6++;
                            int var8 = Statics.field474.field203[var7];
                            if (var8 < 0) {
                                var8 = 0;
                            } else if (var8 > 502) {
                                var8 = 502;
                            }
                            int var9 = Statics.field474.field202[var7];
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > 764) {
                                var9 = 764;
                            }
                            int var10 = var8 * 765 + var9;
                            if (Statics.field474.field203[var7] == -1 && Statics.field474.field202[var7] == -1) {
                                var9 = -1;
                                var8 = -1;
                                var10 = 524287;
                            }
                            if (field355 != var9 || field306 != var8) {
                                int var11 = var9 - field355;
                                field355 = var9;
                                int var12 = var8 - field306;
                                field306 = var8;
                                if (field307 < 8 && var11 >= -32 && var11 <= 31 && var12 >= -32 && var12 <= 31) {
                                    var11 += 32;
                                    var12 += 32;
                                    field334.method2371((field307 << 12) + (var11 << 6) + var12);
                                    field307 = 0;
                                } else if (field307 < 8) {
                                    field334.method2372((field307 << 19) + 8388608 + var10);
                                    field307 = 0;
                                } else {
                                    field334.method2370((field307 << 19) + -1073741824 + var10);
                                    field307 = 0;
                                }
                            } else if (field307 < 2047) {
                                field307++;
                            }
                        }
                        field334.method2382(field334.field1999 - var5);
                        if (var6 >= Statics.field474.field201) {
                            Statics.field474.field201 = 0;
                        } else {
                            Statics.field474.field201 -= var6;
                            for (int var13 = 0; var13 < Statics.field474.field201; var13++) {
                                Statics.field474.field202[var13] = Statics.field474.field202[var6 + var13];
                                Statics.field474.field203[var13] = Statics.field474.field203[var6 + var13];
                            }
                        }
                    }
                }
                if (class141.field2157 == 1 || !Statics.field2225 && class141.field2157 == 4 || class141.field2157 == 2) {
                    long var15 = (class141.field2160 - field461) / 50L;
                    if (var15 > 4095L) {
                        var15 = 4095L;
                    }
                    field461 = class141.field2160;
                    int var17 = class141.field2159;
                    if (var17 < 0) {
                        var17 = 0;
                    } else if (var17 > Statics.field2275) {
                        var17 = Statics.field2275;
                    }
                    int var18 = class141.field2162;
                    if (var18 < 0) {
                        var18 = 0;
                    } else if (var18 > Statics.field709) {
                        var18 = Statics.field709;
                    }
                    int var19 = (int) var15;
                    field334.method2604(4);
                    field334.method2371((class141.field2157 == 2 ? 1 : 0) + (var19 << 1));
                    field334.method2371(var18);
                    field334.method2371(var17);
                }
                if (class138.field2124 > 0) {
                    field334.method2604(236);
                    field334.method2371(0);
                    int var20 = field334.field1999;
                    long var21 = class116.method2672();
                    for (int var23 = 0; var23 < class138.field2124; var23++) {
                        long var24 = var21 - field514;
                        if (var24 > 16777215L) {
                            var24 = 16777215L;
                        }
                        field514 = var21;
                        field334.method2423((int) var24);
                        field334.method2409(class138.field2118[var23]);
                    }
                    field334.method2381(field334.field1999 - var20);
                }
                if (field381 > 0) {
                    field381--;
                }
                if (class138.field2115[96] || class138.field2115[97] || class138.field2115[98] || class138.field2115[99]) {
                    field341 = true;
                }
                if (field341 && field381 <= 0) {
                    field381 = 20;
                    field341 = false;
                    field334.method2604(6);
                    field334.method2415(field374);
                    field334.method2417(field375);
                }
                if (Statics.field710 && !field308) {
                    field308 = true;
                    field334.method2604(255);
                    field334.method2485(1);
                }
                if (!Statics.field710 && field308) {
                    field308 = false;
                    field334.method2604(255);
                    field334.method2485(0);
                }
                if (Statics.field213 != field423) {
                    field423 = Statics.field213;
                    int var26 = Statics.field213;
                    int[] var27 = Statics.field2912.field1410;
                    int var28 = var27.length;
                    for (int var29 = 0; var29 < var28; var29++) {
                        var27[var29] = 0;
                    }
                    for (int var30 = 1; var30 < 103; var30++) {
                        int var31 = (103 - var30) * 2048 + 24628;
                        for (int var32 = 1; var32 < 103; var32++) {
                            if ((class6.field83[var26][var32][var30] & 0x18) == 0) {
                                Statics.field2057.method1840(var27, var31, 512, var26, var32, var30);
                            }
                            if (var26 < 3 && (class6.field83[var26 + 1][var32][var30] & 0x8) != 0) {
                                Statics.field2057.method1840(var27, var31, 512, var26 + 1, var32, var30);
                            }
                            var31 += 4;
                        }
                    }
                    int var33 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
                    int var34 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
                    Statics.field2912.method1629();
                    for (int var35 = 1; var35 < 103; var35++) {
                        for (int var36 = 1; var36 < 103; var36++) {
                            if ((class6.field83[var26][var36][var35] & 0x18) == 0) {
                                method3161(var26, var36, var35, var33, var34);
                            }
                            if (var26 < 3 && (class6.field83[var26 + 1][var36][var35] & 0x8) != 0) {
                                method3161(var26 + 1, var36, var35, var33, var34);
                            }
                        }
                    }
                    field518 = 0;
                    for (int var37 = 0; var37 < 104; var37++) {
                        for (int var38 = 0; var38 < 104; var38++) {
                            int var39 = Statics.field2057.method1834(Statics.field213, var37, var38);
                            if (var39 != 0) {
                                int var40 = var39 >> 14 & 0x7FFF;
                                int var41 = class41.method2950(var40).field965;
                                if (var41 >= 0) {
                                    int var42 = var37;
                                    int var43 = var38;
                                    if (var41 != 22 && var41 != 29 && var41 != 34 && var41 != 36 && var41 != 46 && var41 != 47 && var41 != 48) {
                                        int[][] var44 = field351[Statics.field213].field1909;
                                        for (int var45 = 0; var45 < 10; var45++) {
                                            int var46 = (int) (Math.random() * 4.0D);
                                            if (var46 == 0 && var42 > 0 && var42 > var37 - 3 && (var44[var42 - 1][var43] & 0x1240108) == 0) {
                                                var42--;
                                            }
                                            if (var46 == 1 && var42 < 103 && var42 < var37 + 3 && (var44[var42 + 1][var43] & 0x1240180) == 0) {
                                                var42++;
                                            }
                                            if (var46 == 2 && var43 > 0 && var43 > var38 - 3 && (var44[var42][var43 - 1] & 0x1240102) == 0) {
                                                var43--;
                                            }
                                            if (var46 == 3 && var43 < 103 && var43 < var38 + 3 && (var44[var42][var43 + 1] & 0x1240120) == 0) {
                                                var43++;
                                            }
                                        }
                                    }
                                    field521[field518] = Statics.field145[var41];
                                    field519[field518] = var42;
                                    field520[field518] = var43;
                                    field518++;
                                }
                            }
                        }
                    }
                    Statics.field197.method1618();
                }
                if (field300 != 30) {
                    return;
                }
                method761();
                method3403();
                field339++;
                if (field339 > 750) {
                    if (field344 > 0) {
                        method72();
                    } else {
                        method153(40);
                        Statics.field159 = Statics.field2743;
                        Statics.field2743 = null;
                    }
                    return;
                }
                int var47 = class33.field754;
                int[] var48 = class33.field762;
                for (int var49 = 0; var49 < var47; var49++) {
                    class3 var50 = field303[var48[var49]];
                    if (var50 != null) {
                        method103(var50, 1);
                    }
                }
                method1001();
                method731();
                field367++;
                if (field395 != 0) {
                    field512 += 20;
                    if (field512 >= 400) {
                        field395 = 0;
                    }
                }
                if (Statics.field1226 != null) {
                    field402++;
                    if (field402 >= 15) {
                        method791(Statics.field1226);
                        Statics.field1226 = null;
                    }
                }
                class174 var51 = Statics.field1235;
                class174 var52 = Statics.field1003;
                Statics.field1235 = null;
                Statics.field1003 = null;
                field400 = null;
                field469 = false;
                field466 = false;
                field511 = 0;
                while (class138.method1821() && field511 < 128) {
                    if (field455 >= 2 && class138.field2115[82] && Statics.field1757 == 66) {
                        String var53 = "";
                        Iterator var54 = class12.field183.iterator();
                        while (var54.hasNext()) {
                            class36 var55 = (class36) var54.next();
                            var53 = var53 + var55.field790 + ':' + var55.field792 + '\n';
                        }
                        Statics.field2012.setContents(new StringSelection(var53), (ClipboardOwner) null);
                    } else {
                        field513[field511] = Statics.field1757;
                        field431[field511] = Statics.field199;
                        field511++;
                    }
                }
                if (field392 != -1) {
                    method762(field392, 0, 0, Statics.field709, Statics.field2275, 0, 0);
                }
                field564++;
                while (true) {
                    class1 var58;
                    class174 var59;
                    class174 var60;
                    do {
                        var58 = (class1) field394.method3586();
                        if (var58 == null) {
                            while (true) {
                                class1 var61;
                                class174 var62;
                                class174 var63;
                                do {
                                    var61 = (class1) field489.method3586();
                                    if (var61 == null) {
                                        while (true) {
                                            class1 var64;
                                            class174 var65;
                                            class174 var66;
                                            do {
                                                var64 = (class1) field487.method3586();
                                                if (var64 == null) {
                                                    method1240();
                                                    if (field429 != null) {
                                                        method791(field429);
                                                        Statics.field1368++;
                                                        if (field469 && field466) {
                                                            int var67 = class141.field2147;
                                                            int var68 = class141.field2152;
                                                            int var69 = var67 - field309;
                                                            int var70 = var68 - field546;
                                                            if (var69 < field467) {
                                                                var69 = field467;
                                                            }
                                                            if (field429.field2770 + var69 > field467 + field299.field2770) {
                                                                var69 = field467 + field299.field2770 - field429.field2770;
                                                            }
                                                            if (var70 < field468) {
                                                                var70 = field468;
                                                            }
                                                            if (field429.field2889 + var70 > field468 + field299.field2889) {
                                                                var70 = field468 + field299.field2889 - field429.field2889;
                                                            }
                                                            int var71 = var69 - field470;
                                                            int var72 = var70 - field296;
                                                            int var73 = field429.field2831;
                                                            if (Statics.field1368 > field429.field2832 && (var71 > var73 || var71 < -var73 || var72 > var73 || var72 < -var73)) {
                                                                field370 = true;
                                                            }
                                                            int var74 = field299.field2879 + (var69 - field467);
                                                            int var75 = field299.field2777 + (var70 - field468);
                                                            if (field429.field2844 != null && field370) {
                                                                class1 var76 = new class1();
                                                                var76.field2 = field429;
                                                                var76.field4 = var74;
                                                                var76.field5 = var75;
                                                                var76.field1 = field429.field2844;
                                                                class37.method722(var76, 200000);
                                                            }
                                                            if (class141.field2145 == 0) {
                                                                if (field370) {
                                                                    if (field429.field2845 != null) {
                                                                        class1 var77 = new class1();
                                                                        var77.field2 = field429;
                                                                        var77.field4 = var74;
                                                                        var77.field5 = var75;
                                                                        var77.field13 = field400;
                                                                        var77.field1 = field429.field2845;
                                                                        class37.method722(var77, 200000);
                                                                    }
                                                                    if (field400 != null && method1590(field429) != null) {
                                                                        field334.method2604(131);
                                                                        field334.method2415(field400.field2765);
                                                                        field334.method2416(field400.field2756);
                                                                        field334.method2371(field429.field2765);
                                                                        field334.method2425(field400.field2870);
                                                                        field334.method2416(field429.field2756);
                                                                        field334.method2426(field429.field2870);
                                                                    }
                                                                } else if ((field475 == 1 || method769(field430 - 1)) && field430 > 2) {
                                                                    method2940(field470 + field309, field546 + field296);
                                                                } else if (field430 > 0) {
                                                                    int var78 = field470 + field309;
                                                                    int var79 = field546 + field296;
                                                                    method169(Statics.field204, var78, var79);
                                                                    Statics.field204 = null;
                                                                }
                                                                field429 = null;
                                                            }
                                                        } else if (Statics.field1368 > 1) {
                                                            field429 = null;
                                                        }
                                                    }
                                                    if (Statics.field2676 != null) {
                                                        method791(Statics.field2676);
                                                        field472++;
                                                        if (class141.field2145 == 0) {
                                                            if (field408) {
                                                                if (Statics.field2676 == Statics.field1166 && field407 != field404) {
                                                                    class174 var80 = Statics.field2676;
                                                                    byte var81 = 0;
                                                                    if (field451 == 1 && var80.field2759 == 206) {
                                                                        var81 = 1;
                                                                    }
                                                                    if (var80.field2890[field407] <= 0) {
                                                                        var81 = 0;
                                                                    }
                                                                    int var82 = method198(var80);
                                                                    boolean var83 = (var82 >> 29 & 0x1) != 0;
                                                                    if (var83) {
                                                                        int var84 = field404;
                                                                        int var85 = field407;
                                                                        var80.field2890[var85] = var80.field2890[var84];
                                                                        var80.field2751[var85] = var80.field2751[var84];
                                                                        var80.field2890[var84] = -1;
                                                                        var80.field2751[var84] = 0;
                                                                    } else if (var81 == 1) {
                                                                        int var86 = field404;
                                                                        int var87 = field407;
                                                                        while (var86 != var87) {
                                                                            if (var86 > var87) {
                                                                                var80.method3218(var86 - 1, var86);
                                                                                var86--;
                                                                            } else if (var86 < var87) {
                                                                                var80.method3218(var86 + 1, var86);
                                                                                var86++;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        var80.method3218(field407, field404);
                                                                    }
                                                                    field334.method2604(79);
                                                                    field334.method2416(field404);
                                                                    field334.method2485(var81);
                                                                    field334.method2416(field407);
                                                                    field334.method2370(Statics.field2676.field2870);
                                                                }
                                                            } else if ((field475 == 1 || method769(field430 - 1)) && field430 > 2) {
                                                                method2940(field505, field406);
                                                            } else if (field430 > 0) {
                                                                int var88 = field505;
                                                                int var89 = field406;
                                                                method169(Statics.field204, var88, var89);
                                                                Statics.field204 = null;
                                                            }
                                                            field402 = 10;
                                                            class141.field2157 = 0;
                                                            Statics.field2676 = null;
                                                        } else if (field472 >= 5 && (class141.field2147 > field505 + 5 || class141.field2147 < field505 - 5 || class141.field2152 > field406 + 5 || class141.field2152 < field406 - 5)) {
                                                            field408 = true;
                                                        }
                                                    }
                                                    if (class87.field1470 != -1) {
                                                        int var90 = class87.field1470;
                                                        int var91 = class87.field1506;
                                                        field334.method2604(146);
                                                        field334.method2485(5);
                                                        field334.method2408(class138.field2115[82] ? (class138.field2115[81] ? 2 : 1) : 0);
                                                        field334.method2415(Statics.field577 + var91);
                                                        field334.method2371(Statics.field2735 + var90);
                                                        class87.field1470 = -1;
                                                        field347 = class141.field2162;
                                                        field399 = class141.field2159;
                                                        field395 = 1;
                                                        field512 = 0;
                                                        field483 = var90;
                                                        field523 = var91;
                                                    }
                                                    if (Statics.field1235 != var51) {
                                                        if (var51 != null) {
                                                            method791(var51);
                                                        }
                                                        if (Statics.field1235 != null) {
                                                            method791(Statics.field1235);
                                                        }
                                                    }
                                                    if (Statics.field1003 != var52 && field440 == field439) {
                                                        if (var52 != null) {
                                                            method791(var52);
                                                        }
                                                        if (Statics.field1003 != null) {
                                                            method791(Statics.field1003);
                                                        }
                                                    }
                                                    if (Statics.field1003 == null) {
                                                        if (field439 > 0) {
                                                            field439--;
                                                        }
                                                    } else if (field439 < field440) {
                                                        field439++;
                                                        if (field440 == field439) {
                                                            method791(Statics.field1003);
                                                        }
                                                    }
                                                    int var92 = field383 + Statics.field226.field838;
                                                    int var93 = field357 + Statics.field226.field881;
                                                    if (Statics.field102 - var92 < -500 || Statics.field102 - var92 > 500 || Statics.field162 - var93 < -500 || Statics.field162 - var93 > 500) {
                                                        Statics.field102 = var92;
                                                        Statics.field162 = var93;
                                                    }
                                                    if (Statics.field102 != var92) {
                                                        Statics.field102 += (var92 - Statics.field102) / 16;
                                                    }
                                                    if (Statics.field162 != var93) {
                                                        Statics.field162 += (var93 - Statics.field162) / 16;
                                                    }
                                                    if (class141.field2145 == 4 && Statics.field2225) {
                                                        int var94 = class141.field2152 - field473;
                                                        field437 = var94 * 2;
                                                        field473 = var94 == -1 || var94 == 1 ? class141.field2152 : (field473 + class141.field2152) / 2;
                                                        int var95 = field372 - class141.field2147;
                                                        field376 = var95 * 2;
                                                        field372 = var95 == -1 || var95 == 1 ? class141.field2147 : (field372 + class141.field2147) / 2;
                                                    } else {
                                                        if (class138.field2115[96]) {
                                                            field376 += (-24 - field376) / 2;
                                                        } else if (class138.field2115[97]) {
                                                            field376 += (24 - field376) / 2;
                                                        } else {
                                                            field376 /= 2;
                                                        }
                                                        if (class138.field2115[98]) {
                                                            field437 += (12 - field437) / 2;
                                                        } else if (class138.field2115[99]) {
                                                            field437 += (-12 - field437) / 2;
                                                        } else {
                                                            field437 /= 2;
                                                        }
                                                        field473 = class141.field2152;
                                                        field372 = class141.field2147;
                                                    }
                                                    field375 = field376 / 2 + field375 & 0x7FF;
                                                    field374 += field437 / 2;
                                                    if (field374 < 128) {
                                                        field374 = 128;
                                                    }
                                                    if (field374 > 383) {
                                                        field374 = 383;
                                                    }
                                                    int var96 = Statics.field102 >> 7;
                                                    int var97 = Statics.field162 >> 7;
                                                    int var98 = method1545(Statics.field102, Statics.field162, Statics.field213);
                                                    int var99 = 0;
                                                    if (var96 > 3 && var97 > 3 && var96 < 100 && var97 < 100) {
                                                        for (int var100 = var96 - 4; var100 <= var96 + 4; var100++) {
                                                            for (int var101 = var97 - 4; var101 <= var97 + 4; var101++) {
                                                                int var102 = Statics.field213;
                                                                if (var102 < 3 && (class6.field83[1][var100][var101] & 0x2) == 2) {
                                                                    var102++;
                                                                }
                                                                int var103 = var98 - class6.field100[var102][var100][var101];
                                                                if (var103 > var99) {
                                                                    var99 = var103;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    int var104 = var99 * 192;
                                                    if (var104 > 98048) {
                                                        var104 = 98048;
                                                    }
                                                    if (var104 < 32768) {
                                                        var104 = 32768;
                                                    }
                                                    if (var104 > field557) {
                                                        field557 += (var104 - field557) / 24;
                                                    } else if (var104 < field557) {
                                                        field557 += (var104 - field557) / 80;
                                                    }
                                                    if (field537) {
                                                        int var105 = Statics.field571 * 128 + 64;
                                                        int var106 = Statics.field1686 * 128 + 64;
                                                        int var107 = method1545(var105, var106, Statics.field213) - Statics.field1059;
                                                        if (Statics.field3161 < var105) {
                                                            Statics.field3161 += Statics.field12 * (var105 - Statics.field3161) / 1000 + Statics.field2243;
                                                            if (Statics.field3161 > var105) {
                                                                Statics.field3161 = var105;
                                                            }
                                                        }
                                                        if (Statics.field3161 > var105) {
                                                            Statics.field3161 -= Statics.field12 * (Statics.field3161 - var105) / 1000 + Statics.field2243;
                                                            if (Statics.field3161 < var105) {
                                                                Statics.field3161 = var105;
                                                            }
                                                        }
                                                        if (Statics.field28 < var107) {
                                                            Statics.field28 += Statics.field12 * (var107 - Statics.field28) / 1000 + Statics.field2243;
                                                            if (Statics.field28 > var107) {
                                                                Statics.field28 = var107;
                                                            }
                                                        }
                                                        if (Statics.field28 > var107) {
                                                            Statics.field28 -= Statics.field12 * (Statics.field28 - var107) / 1000 + Statics.field2243;
                                                            if (Statics.field28 < var107) {
                                                                Statics.field28 = var107;
                                                            }
                                                        }
                                                        if (Statics.field666 < var106) {
                                                            Statics.field666 += Statics.field12 * (var106 - Statics.field666) / 1000 + Statics.field2243;
                                                            if (Statics.field666 > var106) {
                                                                Statics.field666 = var106;
                                                            }
                                                        }
                                                        if (Statics.field666 > var106) {
                                                            Statics.field666 -= Statics.field12 * (Statics.field666 - var106) / 1000 + Statics.field2243;
                                                            if (Statics.field666 < var106) {
                                                                Statics.field666 = var106;
                                                            }
                                                        }
                                                        int var108 = Statics.field2092 * 128 + 64;
                                                        int var109 = Statics.field1051 * 128 + 64;
                                                        int var110 = method1545(var108, var109, Statics.field213) - Statics.field2129;
                                                        int var111 = var108 - Statics.field3161;
                                                        int var112 = var110 - Statics.field28;
                                                        int var113 = var109 - Statics.field666;
                                                        int var114 = (int) Math.sqrt((double) (var111 * var111 + var113 * var113));
                                                        int var115 = (int) (Math.atan2((double) var112, (double) var114) * 325.949D) & 0x7FF;
                                                        int var116 = (int) (Math.atan2((double) var111, (double) var113) * -325.949D) & 0x7FF;
                                                        if (var115 < 128) {
                                                            var115 = 128;
                                                        }
                                                        if (var115 > 383) {
                                                            var115 = 383;
                                                        }
                                                        if (Statics.field2083 < var115) {
                                                            Statics.field2083 += Statics.field1559 * (var115 - Statics.field2083) / 1000 + Statics.field2290;
                                                            if (Statics.field2083 > var115) {
                                                                Statics.field2083 = var115;
                                                            }
                                                        }
                                                        if (Statics.field2083 > var115) {
                                                            Statics.field2083 -= Statics.field1559 * (Statics.field2083 - var115) / 1000 + Statics.field2290;
                                                            if (Statics.field2083 < var115) {
                                                                Statics.field2083 = var115;
                                                            }
                                                        }
                                                        int var117 = var116 - Statics.field1019;
                                                        if (var117 > 1024) {
                                                            var117 -= 2048;
                                                        }
                                                        if (var117 < -1024) {
                                                            var117 += 2048;
                                                        }
                                                        if (var117 > 0) {
                                                            Statics.field1019 += Statics.field1559 * var117 / 1000 + Statics.field2290;
                                                            Statics.field1019 &= 0x7FF;
                                                        }
                                                        if (var117 < 0) {
                                                            Statics.field1019 -= Statics.field1559 * -var117 / 1000 + Statics.field2290;
                                                            Statics.field1019 &= 0x7FF;
                                                        }
                                                        int var118 = var116 - Statics.field1019;
                                                        if (var118 > 1024) {
                                                            var118 -= 2048;
                                                        }
                                                        if (var118 < -1024) {
                                                            var118 += 2048;
                                                        }
                                                        if (var118 < 0 && var117 > 0 || var118 > 0 && var117 < 0) {
                                                            Statics.field1019 = var116;
                                                        }
                                                    }
                                                    for (int var119 = 0; var119 < 5; var119++) {
                                                        int var10002 = field542[var119]++;
                                                    }
                                                    Statics.field66.method212();
                                                    int var120 = class141.method45();
                                                    int var121 = class138.field2127;
                                                    if (var120 > 15000 && var121 > 15000) {
                                                        field344 = 250;
                                                        class141.field2146 = 14500;
                                                        field334.method2604(74);
                                                    }
                                                    field346++;
                                                    if (field346 > 500) {
                                                        field346 = 0;
                                                        int var123 = (int) (Math.random() * 8.0D);
                                                        if ((var123 & 0x1) == 1) {
                                                            field383 += field551;
                                                        }
                                                        if ((var123 & 0x2) == 2) {
                                                            field357 += field358;
                                                        }
                                                        if ((var123 & 0x4) == 4) {
                                                            field359 += field290;
                                                        }
                                                    }
                                                    if (field383 < -50) {
                                                        field551 = 2;
                                                    }
                                                    if (field383 > 50) {
                                                        field551 = -2;
                                                    }
                                                    if (field357 < -55) {
                                                        field358 = 2;
                                                    }
                                                    if (field357 > 55) {
                                                        field358 = -2;
                                                    }
                                                    if (field359 < -40) {
                                                        field290 = 1;
                                                    }
                                                    if (field359 > 40) {
                                                        field290 = -1;
                                                    }
                                                    field360++;
                                                    if (field360 > 500) {
                                                        field360 = 0;
                                                        int var124 = (int) (Math.random() * 8.0D);
                                                        if ((var124 & 0x1) == 1) {
                                                            field501 += field363;
                                                        }
                                                        if ((var124 & 0x2) == 2) {
                                                            field364 += field504;
                                                        }
                                                    }
                                                    if (field501 < -60) {
                                                        field363 = 2;
                                                    }
                                                    if (field501 > 60) {
                                                        field363 = -2;
                                                    }
                                                    if (field364 < -20) {
                                                        field504 = 1;
                                                    }
                                                    if (field364 > 10) {
                                                        field504 = -1;
                                                    }
                                                    for (class39 var125 = (class39) field559.method3543(); var125 != null; var125 = (class39) field559.method3550()) {
                                                        if ((long) var125.field892 < class116.method2672() / 1000L - 5L) {
                                                            if (var125.field887 > 0) {
                                                                class12.method1120(5, "", var125.field886 + class158.field2472);
                                                            }
                                                            if (var125.field887 == 0) {
                                                                class12.method1120(5, "", var125.field886 + class158.field2453);
                                                            }
                                                            var125.method3669();
                                                        }
                                                    }
                                                    field340++;
                                                    if (field340 > 50) {
                                                        field334.method2604(144);
                                                    }
                                                    try {
                                                        if (Statics.field2743 != null && field334.field1999 > 0) {
                                                            Statics.field2743.method2837(field334.field2001, 0, field334.field1999);
                                                            field334.field1999 = 0;
                                                            field340 = 0;
                                                        }
                                                    } catch (IOException var127) {
                                                        if (field344 > 0) {
                                                            method72();
                                                        } else {
                                                            method153(40);
                                                            Statics.field159 = Statics.field2743;
                                                            Statics.field2743 = null;
                                                        }
                                                    }
                                                    return;
                                                }
                                                var65 = var64.field2;
                                                if (var65.field2756 < 0) {
                                                    break;
                                                }
                                                var66 = class174.method2958(var65.field2774);
                                            } while (var66 == null || var66.field2768 == null || var65.field2756 >= var66.field2768.length || var66.field2768[var65.field2756] != var65);
                                            class37.method722(var64, 200000);
                                        }
                                    }
                                    var62 = var61.field2;
                                    if (var62.field2756 < 0) {
                                        break;
                                    }
                                    var63 = class174.method2958(var62.field2774);
                                } while (var63 == null || var63.field2768 == null || var62.field2756 >= var63.field2768.length || var63.field2768[var62.field2756] != var62);
                                class37.method722(var61, 200000);
                            }
                        }
                        var59 = var58.field2;
                        if (var59.field2756 < 0) {
                            break;
                        }
                        var60 = class174.method2958(var59.field2774);
                    } while (var60 == null || var60.field2768 == null || var59.field2756 >= var60.field2768.length || var60.field2768[var59.field2756] != var59);
                    class37.method722(var58, 200000);
                }
            }
            field334.method2604(150);
            field334.method2485(0);
            int var3 = field334.field1999;
            class212.method137(field334);
            field334.method2382(field334.field1999 - var3);
        }
    }

    @ObfuscatedName("g.a(I)V")
    public static final void method111() {
        if (Statics.field129 != null) {
            Statics.field129.method1220();
        }
        if (Statics.field924 != null) {
            Statics.field924.method1220();
        }
    }

    @ObfuscatedName("gf.z(B)V")
    public static final void method3403() {
        for (int var0 = 0; var0 < field555; var0++) {
            int var10002 = field534[var0]--;
            if (field534[var0] >= -10) {
                class59 var2 = field393[var0];
                if (var2 == null) {
                    class59 var10000 = (class59) null;
                    var2 = class59.method1263(Statics.field2102, field532[var0], 0);
                    if (var2 == null) {
                        continue;
                    }
                    field534[var0] += var2.method1258();
                    field393[var0] = var2;
                }
                if (field534[var0] < 0) {
                    int var9;
                    if (field522[var0] == 0) {
                        var9 = field493;
                    } else {
                        int var3 = (field522[var0] & 0xFF) * 128;
                        int var4 = field522[var0] >> 16 & 0xFF;
                        int var5 = var4 * 128 + 64 - Statics.field226.field838;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        int var6 = field522[var0] >> 8 & 0xFF;
                        int var7 = var6 * 128 + 64 - Statics.field226.field881;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var5 + var7 - 128;
                        if (var8 > var3) {
                            field534[var0] = -100;
                            continue;
                        }
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        var9 = field350 * (var3 - var8) / var3;
                    }
                    if (var9 > 0) {
                        class63 var10 = var2.method1257().method1289(Statics.field195);
                        class65 var11 = class65.method1310(var10, 100, var9);
                        var11.method1328(field533[var0] - 1);
                        Statics.field2015.method1202(var11);
                    }
                    field534[var0] = -100;
                }
            } else {
                field555--;
                for (int var1 = var0; var1 < field555; var1++) {
                    field532[var1] = field532[var1 + 1];
                    field393[var1] = field393[var1 + 1];
                    field533[var1] = field533[var1 + 1];
                    field534[var1] = field534[var1 + 1];
                    field522[var1] = field522[var1 + 1];
                }
                var0--;
            }
        }
        if (!field527) {
            return;
        }
        boolean var12;
        if (class184.field2954 == 0) {
            var12 = Statics.field2956.method3413();
        } else {
            var12 = true;
        }
        if (!var12) {
            if (field525 != 0 && field316 != -1) {
                class184.method2099(Statics.field262, field316, 0, field525, false);
            }
            field527 = false;
        }
    }

    @ObfuscatedName("as.j(Laa;IIII)V")
    public static void method735(class43 arg0, int arg1, int arg2, int arg3) {
        if (field555 >= 50 || field350 == 0 || arg0.field1006 == null || arg1 >= arg0.field1006.length) {
            return;
        }
        int var4 = arg0.field1006[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field532[field555] = var5;
        field533[field555] = var6;
        field534[field555] = 0;
        field393[field555] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field522[field555] = (var8 << 16) + (var9 << 8) + var7;
        field555++;
    }

    @ObfuscatedName("cg.ag(IIII)V")
    public static void method1994(int arg0, int arg1, int arg2) {
        if (field493 == 0 || arg1 == 0 || field555 >= 50) {
            return;
        }
        field532[field555] = arg0;
        field533[field555] = arg1;
        field534[field555] = arg2;
        field393[field555] = null;
        field522[field555] = 0;
        field555++;
    }

    @ObfuscatedName("gs.ax(IIB)V")
    public static void method3514(int arg0, int arg1) {
        if (field525 != 0 && arg0 != -1) {
            class184.method2099(Statics.field2258, arg0, 0, field525, false);
            field527 = true;
        }
    }

    @ObfuscatedName("ae.ao(Lfw;III)V")
    public static final void method992(class174 arg0, int arg1, int arg2) {
        if (field524 != 0 && field524 != 3 || class141.field2157 != 1 && Statics.field2225 || class141.field2157 != 4) {
            return;
        }
        class176 var3 = arg0.method3223(true);
        if (var3 == null) {
            return;
        }
        int var4 = class141.field2162 - arg1;
        int var5 = class141.field2159 - arg2;
        if (!var3.method3244(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2901 / 2;
        int var7 = var5 - var3.field2902 / 2;
        int var8 = field501 + field375 & 0x7FF;
        int var9 = class92.field1598[var8];
        int var10 = class92.field1578[var8];
        int var11 = (field364 + 256) * var9 >> 8;
        int var12 = (field364 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field226.field838 + var13 >> 7;
        int var16 = Statics.field226.field881 - var14 >> 7;
        field334.method2604(9);
        field334.method2485(18);
        field334.method2408(class138.field2115[82] ? (class138.field2115[81] ? 2 : 1) : 0);
        field334.method2415(Statics.field577 + var16);
        field334.method2371(Statics.field2735 + var15);
        field334.method2485(var6);
        field334.method2485(var7);
        field334.method2371(field375);
        field334.method2485(57);
        field334.method2485(field501);
        field334.method2485(field364);
        field334.method2485(89);
        field334.method2371(Statics.field226.field838);
        field334.method2371(Statics.field226.field881);
        field334.method2485(63);
        field483 = var15;
        field523 = var16;
    }

    @ObfuscatedName("as.ac(S)V")
    public static final void method731() {
        int[] var0 = class33.field762;
        for (int var1 = 0; var1 < class33.field754; var1++) {
            class3 var2 = field303[var0[var1]];
            if (var2 != null && var2.field883 > 0) {
                var2.field883--;
                if (var2.field883 == 0) {
                    var2.field825 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field495; var3++) {
            int var4 = field331[var3];
            class35 var5 = field329[var4];
            if (var5 != null && var5.field883 > 0) {
                var5.field883--;
                if (var5.field883 == 0) {
                    var5.field825 = null;
                }
            }
        }
    }

    @ObfuscatedName("r.aj(Ljava/lang/String;I)V")
    public static final void method135(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field581.field141 = !Statics.field581.field141;
            class9.method606();
            if (Statics.field581.field141) {
                class12.method1120(99, "", "Roofs are now all hidden");
            } else {
                class12.method1120(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field356 = !field356;
        }
        if (field455 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field356 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field356 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                if (field344 > 0) {
                    method72();
                } else {
                    method153(40);
                    Statics.field159 = Statics.field2743;
                    Statics.field2743 = null;
                }
            }
            if (arg0.equalsIgnoreCase("errortest") && field294 == 2) {
                throw new RuntimeException();
            }
        }
        field334.method2604(227);
        field334.method2485(arg0.length() + 1);
        field334.method2376(arg0);
    }

    @ObfuscatedName("ad.an(I)V")
    public static final void method1001() {
        for (int var0 = 0; var0 < field495; var0++) {
            int var1 = field331[var0];
            class35 var2 = field329[var1];
            if (var2 != null) {
                method103(var2, var2.field783.field908);
            }
        }
    }

    @ObfuscatedName("n.al(Lai;IB)V")
    public static final void method103(class38 arg0, int arg1) {
        if (arg0.field824 > field302) {
            method157(arg0);
        } else if (arg0.field867 >= field302) {
            if (field302 == arg0.field867 || arg0.field823 == -1 || arg0.field856 != 0 || arg0.field855 + 1 > class43.method745(arg0.field823).field1005[arg0.field854]) {
                int var2 = arg0.field867 - arg0.field824;
                int var3 = field302 - arg0.field824;
                int var4 = arg0.field863 * 128 + arg0.field826 * 64;
                int var5 = arg0.field865 * 128 + arg0.field826 * 64;
                int var6 = arg0.field839 * 128 + arg0.field826 * 64;
                int var7 = arg0.field845 * 128 + arg0.field826 * 64;
                arg0.field838 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field881 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field866 = 0;
            arg0.field872 = arg0.field851;
            arg0.field884 = arg0.field872;
        } else {
            method193(arg0);
        }
        if (arg0.field838 < 128 || arg0.field881 < 128 || arg0.field838 >= 13184 || arg0.field881 >= 13184) {
            arg0.field823 = -1;
            arg0.field858 = -1;
            arg0.field824 = 0;
            arg0.field867 = 0;
            arg0.field838 = arg0.field876[0] * 128 + arg0.field826 * 64;
            arg0.field881 = arg0.field877[0] * 128 + arg0.field826 * 64;
            arg0.method767();
        }
        if (Statics.field226 == arg0 && (arg0.field838 < 1536 || arg0.field881 < 1536 || arg0.field838 >= 11776 || arg0.field881 >= 11776)) {
            arg0.field823 = -1;
            arg0.field858 = -1;
            arg0.field824 = 0;
            arg0.field867 = 0;
            arg0.field838 = arg0.field876[0] * 128 + arg0.field826 * 64;
            arg0.field881 = arg0.field877[0] * 128 + arg0.field826 * 64;
            arg0.method767();
        }
        if (arg0.field874 != 0) {
            if (arg0.field847 != -1) {
                class38 var8 = null;
                if (arg0.field847 < 32768) {
                    var8 = field329[arg0.field847];
                } else if (arg0.field847 >= 32768) {
                    var8 = field303[arg0.field847 - 32768];
                }
                if (var8 != null) {
                    int var9 = arg0.field838 - var8.field838;
                    int var10 = arg0.field881 - var8.field881;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field872 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
                    }
                } else if (arg0.field848) {
                    arg0.field847 = -1;
                    arg0.field848 = false;
                }
            }
            if (arg0.field849 != -1 && (arg0.field875 == 0 || arg0.field866 > 0)) {
                arg0.field872 = arg0.field849;
                arg0.field849 = -1;
            }
            int var11 = arg0.field872 - arg0.field884 & 0x7FF;
            if (var11 == 0 && arg0.field848) {
                arg0.field847 = -1;
                arg0.field848 = false;
            }
            if (var11 == 0) {
                arg0.field873 = 0;
            } else {
                arg0.field873++;
                if (var11 > 1024) {
                    arg0.field884 -= arg0.field874;
                    boolean var12 = true;
                    if (var11 < arg0.field874 || var11 > 2048 - arg0.field874) {
                        arg0.field884 = arg0.field872;
                        var12 = false;
                    }
                    if (arg0.field850 == arg0.field827 && (arg0.field873 > 25 || var12)) {
                        if (arg0.field828 == -1) {
                            arg0.field850 = arg0.field830;
                        } else {
                            arg0.field850 = arg0.field828;
                        }
                    }
                } else {
                    arg0.field884 += arg0.field874;
                    boolean var13 = true;
                    if (var11 < arg0.field874 || var11 > 2048 - arg0.field874) {
                        arg0.field884 = arg0.field872;
                        var13 = false;
                    }
                    if (arg0.field850 == arg0.field827 && (arg0.field873 > 25 || var13)) {
                        if (arg0.field846 == -1) {
                            arg0.field850 = arg0.field830;
                        } else {
                            arg0.field850 = arg0.field846;
                        }
                    }
                }
                arg0.field884 &= 0x7FF;
            }
        }
        arg0.field859 = false;
        if (arg0.field850 != -1) {
            class43 var15 = class43.method745(arg0.field850);
            if (var15 == null || var15.field1000 == null) {
                arg0.field850 = -1;
            } else {
                arg0.field852++;
                if (arg0.field869 < var15.field1000.length && arg0.field852 > var15.field1005[arg0.field869]) {
                    arg0.field852 = 1;
                    arg0.field869++;
                    method735(var15, arg0.field869, arg0.field838, arg0.field881);
                }
                if (arg0.field869 >= var15.field1000.length) {
                    arg0.field852 = 0;
                    arg0.field869 = 0;
                    method735(var15, arg0.field869, arg0.field838, arg0.field881);
                }
            }
        }
        if (arg0.field858 != -1 && field302 >= arg0.field861) {
            if (arg0.field822 < 0) {
                arg0.field822 = 0;
            }
            int var16 = class44.method13(arg0.field858).field1021;
            if (var16 == -1) {
                arg0.field858 = -1;
            } else {
                class43 var17 = class43.method745(var16);
                if (var17 == null || var17.field1000 == null) {
                    arg0.field858 = -1;
                } else {
                    arg0.field860++;
                    if (arg0.field822 < var17.field1000.length && arg0.field860 > var17.field1005[arg0.field822]) {
                        arg0.field860 = 1;
                        arg0.field822++;
                        method735(var17, arg0.field822, arg0.field838, arg0.field881);
                    }
                    if (arg0.field822 >= var17.field1000.length && (arg0.field822 < 0 || arg0.field822 >= var17.field1000.length)) {
                        arg0.field858 = -1;
                    }
                }
            }
        }
        if (arg0.field823 != -1 && arg0.field856 <= 1) {
            class43 var18 = class43.method745(arg0.field823);
            if (var18.field1009 == 1 && arg0.field880 > 0 && arg0.field824 <= field302 && arg0.field867 < field302) {
                arg0.field856 = 1;
                return;
            }
        }
        if (arg0.field823 != -1 && arg0.field856 == 0) {
            class43 var19 = class43.method745(arg0.field823);
            if (var19 == null || var19.field1000 == null) {
                arg0.field823 = -1;
            } else {
                arg0.field855++;
                if (arg0.field854 < var19.field1000.length && arg0.field855 > var19.field1005[arg0.field854]) {
                    arg0.field855 = 1;
                    arg0.field854++;
                    method735(var19, arg0.field854, arg0.field838, arg0.field881);
                }
                if (arg0.field854 >= var19.field1000.length) {
                    arg0.field854 -= var19.field1015;
                    arg0.field857++;
                    if (arg0.field857 >= var19.field1013) {
                        arg0.field823 = -1;
                    } else if (arg0.field854 >= 0 && arg0.field854 < var19.field1000.length) {
                        method735(var19, arg0.field854, arg0.field838, arg0.field881);
                    } else {
                        arg0.field823 = -1;
                    }
                }
                arg0.field859 = var19.field1020;
            }
        }
        if (arg0.field856 > 0) {
            arg0.field856--;
        }
    }

    @ObfuscatedName("k.as(Lai;I)V")
    public static final void method157(class38 arg0) {
        int var1 = arg0.field824 - field302;
        int var2 = arg0.field863 * 128 + arg0.field826 * 64;
        int var3 = arg0.field865 * 128 + arg0.field826 * 64;
        arg0.field838 += (var2 - arg0.field838) / var1;
        arg0.field881 += (var3 - arg0.field881) / var1;
        arg0.field866 = 0;
        arg0.field872 = arg0.field851;
    }

    @ObfuscatedName("t.av(Lai;B)V")
    public static final void method193(class38 arg0) {
        arg0.field850 = arg0.field827;
        if (arg0.field875 == 0) {
            arg0.field866 = 0;
            return;
        }
        if (arg0.field823 != -1 && arg0.field856 == 0) {
            class43 var1 = class43.method745(arg0.field823);
            if (arg0.field880 > 0 && var1.field1009 == 0) {
                arg0.field866++;
                return;
            }
            if (arg0.field880 <= 0 && var1.field998 == 0) {
                arg0.field866++;
                return;
            }
        }
        int var2 = arg0.field838;
        int var3 = arg0.field881;
        int var4 = arg0.field876[arg0.field875 - 1] * 128 + arg0.field826 * 64;
        int var5 = arg0.field877[arg0.field875 - 1] * 128 + arg0.field826 * 64;
        if (var2 < var4) {
            if (var3 < var5) {
                arg0.field872 = 1280;
            } else if (var3 > var5) {
                arg0.field872 = 1792;
            } else {
                arg0.field872 = 1536;
            }
        } else if (var2 > var4) {
            if (var3 < var5) {
                arg0.field872 = 768;
            } else if (var3 > var5) {
                arg0.field872 = 256;
            } else {
                arg0.field872 = 512;
            }
        } else if (var3 < var5) {
            arg0.field872 = 1024;
        } else if (var3 > var5) {
            arg0.field872 = 0;
        }
        byte var6 = arg0.field829[arg0.field875 - 1];
        if (var4 - var2 > 256 || var4 - var2 < -256 || var5 - var3 > 256 || var5 - var3 < -256) {
            arg0.field838 = var4;
            arg0.field881 = var5;
            arg0.field875--;
            if (arg0.field880 > 0) {
                arg0.field880--;
            }
            return;
        }
        int var7 = arg0.field872 - arg0.field884 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field831;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field830;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field833;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field832;
        }
        if (var8 == -1) {
            var8 = arg0.field830;
        }
        arg0.field850 = var8;
        int var9 = 4;
        boolean var10 = true;
        if (arg0 instanceof class35) {
            var10 = ((class35) arg0).field783.field934;
        }
        if (var10) {
            if (arg0.field884 != arg0.field872 && arg0.field847 == -1 && arg0.field874 != 0) {
                var9 = 2;
            }
            if (arg0.field875 > 2) {
                var9 = 6;
            }
            if (arg0.field875 > 3) {
                var9 = 8;
            }
            if (arg0.field866 > 0 && arg0.field875 > 1) {
                var9 = 8;
                arg0.field866--;
            }
        } else {
            if (arg0.field875 > 1) {
                var9 = 6;
            }
            if (arg0.field875 > 2) {
                var9 = 8;
            }
            if (arg0.field866 > 0 && arg0.field875 > 1) {
                var9 = 8;
                arg0.field866--;
            }
        }
        if (var6 == 2) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field850 == arg0.field830 && arg0.field834 != -1) {
            arg0.field850 = arg0.field834;
        }
        if (var2 != var4 || var3 != var5) {
            if (var2 < var4) {
                arg0.field838 += var9;
                if (arg0.field838 > var4) {
                    arg0.field838 = var4;
                }
            } else if (var2 > var4) {
                arg0.field838 -= var9;
                if (arg0.field838 < var4) {
                    arg0.field838 = var4;
                }
            }
            if (var3 < var5) {
                arg0.field881 += var9;
                if (arg0.field881 > var5) {
                    arg0.field881 = var5;
                }
            } else if (var3 > var5) {
                arg0.field881 -= var9;
                if (arg0.field881 < var5) {
                    arg0.field881 = var5;
                }
            }
        }
        if (arg0.field838 == var4 && arg0.field881 == var5) {
            arg0.field875--;
            if (arg0.field880 > 0) {
                arg0.field880--;
            }
        }
    }

    @ObfuscatedName("m.am(Lx;III)V")
    public static void method107(class3 arg0, int arg1, int arg2) {
        if (arg0.field823 == arg1 && arg1 != -1) {
            int var3 = class43.method745(arg1).field1016;
            if (var3 == 1) {
                arg0.field854 = 0;
                arg0.field855 = 0;
                arg0.field856 = arg2;
                arg0.field857 = 0;
            }
            if (var3 == 2) {
                arg0.field857 = 0;
            }
        } else if (arg1 == -1 || arg0.field823 == -1 || class43.method745(arg1).field1010 >= class43.method745(arg0.field823).field1010) {
            arg0.field823 = arg1;
            arg0.field854 = 0;
            arg0.field855 = 0;
            arg0.field856 = arg2;
            arg0.field857 = 0;
            arg0.field880 = arg0.field875;
        }
    }

    @ObfuscatedName("ab.az(B)V")
    public static void method1107() {
        class138.method1036(Statics.field1568);
        Canvas var0 = Statics.field1568;
        var0.removeMouseListener(class141.field2148);
        var0.removeMouseMotionListener(class141.field2148);
        var0.removeFocusListener(class141.field2148);
        class141.field2155 = 0;
        if (Statics.field2019 != null) {
            Statics.field2019.method2680(Statics.field1568);
        }
        Statics.field531.method2863();
        Statics.field1568.setBackground(Color.black);
        class138.method614(Statics.field1568);
        class141.method604(Statics.field1568);
        if (Statics.field2019 != null) {
            Statics.field2019.method2687(Statics.field1568);
        }
        if (field392 != -1) {
            method778(false);
        }
        field2205 = true;
    }

    @ObfuscatedName("fi.ai(B)V")
    public static void method2971() {
        client var0 = Statics.field531;
        synchronized (Statics.field531) {
            Container var1 = Statics.field531.method2874();
            if (var1 != null) {
                Statics.field996 = Math.max(var1.getSize().width, Statics.field750);
                Statics.field1056 = Math.max(var1.getSize().height, Statics.field2033);
                if (Statics.field1765 == var1) {
                    Insets var2 = Statics.field1765.getInsets();
                    Statics.field996 -= var2.right + var2.left;
                    Statics.field1056 -= var2.top + var2.bottom;
                }
                if (Statics.field996 <= 0) {
                    Statics.field996 = 1;
                }
                if (Statics.field1056 <= 0) {
                    Statics.field1056 = 1;
                }
                int var3 = field502 ? 2 : 1;
                if (var3 == 1) {
                    Statics.field709 = field503;
                    Statics.field2275 = field382;
                } else {
                    Statics.field709 = Math.min(Statics.field996, 7680);
                    Statics.field2275 = Math.min(Statics.field1056, 2160);
                }
                field2201 = (Statics.field996 - Statics.field709) / 2;
                field2191 = 0;
                Statics.field1568.setSize(Statics.field709, Statics.field2275);
                int var4 = Statics.field709;
                int var5 = Statics.field2275;
                Canvas var6 = Statics.field1568;
                class78 var8;
                try {
                    class82 var7 = new class82();
                    var7.method1547(var4, var5, var6);
                    var8 = var7;
                } catch (Throwable var13) {
                    class76 var10 = new class76();
                    var10.method1547(var4, var5, var6);
                    var8 = var10;
                }
                Statics.field197 = var8;
                if (Statics.field1765 == var1) {
                    Insets var11 = Statics.field1765.getInsets();
                    Statics.field1568.setLocation(field2201 + var11.left, field2191 + var11.top);
                } else {
                    Statics.field1568.setLocation(field2201, field2191);
                }
                method237();
                if (field392 != -1) {
                    method778(true);
                }
                method3();
            }
        }
    }

    @ObfuscatedName("v.aq(I)V")
    public static void method237() {
        int var0 = Statics.field709;
        int var1 = Statics.field2275;
        if (Statics.field996 < var0) {
            int var2 = Statics.field996;
        }
        if (Statics.field1056 < var1) {
            int var3 = Statics.field1056;
        }
        if (Statics.field581 == null) {
            return;
        }
        try {
            client var4 = Statics.field531;
            int var5 = field502 ? 2 : 1;
            class133.method2697(var4, "resize", new Object[] { var5 });
        } catch (Throwable var7) {
        }
    }

    @ObfuscatedName("f.ah(I)V")
    public static void method3() {
        int var0 = field2201;
        int var1 = field2191;
        int var2 = Statics.field996 - Statics.field709 - var0;
        int var3 = Statics.field1056 - Statics.field2275 - var1;
        if (var0 <= 0 && var2 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var4 = Statics.field531.method2874();
            int var5 = 0;
            int var6 = 0;
            if (Statics.field1765 == var4) {
                Insets var7 = Statics.field1765.getInsets();
                var5 = var7.left;
                var6 = var7.top;
            }
            Graphics var8 = var4.getGraphics();
            var8.setColor(Color.black);
            if (var0 > 0) {
                var8.fillRect(var5, var6, var0, Statics.field1056);
            }
            if (var1 > 0) {
                var8.fillRect(var5, var6, Statics.field996, var1);
            }
            if (var2 > 0) {
                var8.fillRect(Statics.field996 + var5 - var2, var6, var2, Statics.field1056);
            }
            if (var3 > 0) {
                var8.fillRect(var5, Statics.field1056 + var6 - var3, Statics.field996, var3);
            }
        } catch (Exception var10) {
        }
    }

    @ObfuscatedName("as.ap(Ljava/lang/String;ZI)V")
    public static final void method732(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field815.method3778(arg0, 250);
        int var6 = Statics.field815.method3779(arg0, 250) * 13;
        class80.method1728(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1734(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field815.method3784(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method665(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (arg1) {
            try {
                Graphics var7 = Statics.field1568.getGraphics();
                Statics.field197.method1548(var7, 0, 0);
            } catch (Exception var14) {
                Statics.field1568.repaint();
            }
            return;
        }
        int var9 = var3;
        int var10 = var4;
        int var11 = var5;
        int var12 = var6;
        for (int var13 = 0; var13 < field491; var13++) {
            if (field498[var13] + field496[var13] > var9 && field496[var13] < var9 + var11 && field499[var13] + field497[var13] > var10 && field497[var13] < var10 + var12) {
                field494[var13] = true;
            }
        }
    }

    @ObfuscatedName("fp.af(IIIIZS)V")
    public static final void method2967(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field544 - field345) * var5 / 100 + field345;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field421) {
            short var8 = field421;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field548) {
                var6 = field548;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1721();
                    class80.method1728(arg0, arg1, var10, arg3, -16777216);
                    class80.method1728(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field566) {
            short var11 = field566;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field547) {
                var6 = field547;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1721();
                    class80.method1728(arg0, arg1, arg2, var13, -16777216);
                    class80.method1728(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field445 - field545) * var5 / 100 + field545;
        field549 = arg3 * var6 * var14 / 85504 << 1;
        if (field433 != arg2 || field554 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1598[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1839(var15, 500, 800, arg2, arg3);
        }
        field464 = arg0;
        field552 = arg1;
        field433 = arg2;
        field554 = arg3;
    }

    @ObfuscatedName("fz.aa(Las;B)V")
    public static final void method3057(class34 arg0) {
        if (Statics.field226.field838 >> 7 == field483 && Statics.field226.field881 >> 7 == field523) {
            field483 = 0;
        }
        int var1 = class33.field754;
        int[] var2 = class33.field762;
        int var3 = var1;
        if (class34.field782 == arg0 || class34.field773 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field782 == arg0) {
                var5 = Statics.field226;
                var6 = Statics.field226.field38 << 14;
            } else if (class34.field773 == arg0) {
                var5 = field303[field465];
                var6 = field465 << 14;
            } else {
                var5 = field303[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field777 == arg0 && field465 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method22() && !var5.field47) {
                var5.field54 = false;
                if ((field297 && var1 > 50 || var1 > 200) && class34.field782 != arg0 && var5.field850 == var5.field827) {
                    var5.field54 = true;
                }
                int var7 = var5.field838 >> 7;
                int var8 = var5.field881 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field44 == null || field302 < var5.field55 || field302 >= var5.field49) {
                        if ((var5.field838 & 0x7F) == 64 && (var5.field881 & 0x7F) == 64) {
                            if (field553 == field338[var7][var8]) {
                                continue;
                            }
                            field338[var7][var8] = field553;
                        }
                        var5.field43 = method1545(var5.field838, var5.field881, Statics.field213);
                        Statics.field2057.method1841(Statics.field213, var5.field838, var5.field881, var5.field43, 60, var5, var5.field884, var6, var5.field859);
                    } else {
                        var5.field54 = false;
                        var5.field43 = method1545(var5.field838, var5.field881, Statics.field213);
                        Statics.field2057.method1906(Statics.field213, var5.field838, var5.field881, var5.field43, 60, var5, var5.field884, var6, var5.field50, var5.field51, var5.field52, var5.field53);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ar.ay(ZB)V")
    public static final void method1020(boolean arg0) {
        for (int var1 = 0; var1 < field495; var1++) {
            class35 var2 = field329[field331[var1]];
            int var3 = (field331[var1] << 14) + 536870912;
            if (var2 != null && var2.method22() && var2.field783.field899 == arg0 && var2.field783.method787()) {
                int var4 = var2.field838 >> 7;
                int var5 = var2.field881 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field826 == 1 && (var2.field838 & 0x7F) == 64 && (var2.field881 & 0x7F) == 64) {
                        if (field553 == field338[var4][var5]) {
                            continue;
                        }
                        field338[var4][var5] = field553;
                    }
                    if (!var2.field783.field927) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field2057.method1841(Statics.field213, var2.field838, var2.field881, method1545(var2.field838 + (var2.field826 * 64 - 64), var2.field881 + (var2.field826 * 64 - 64), Statics.field213), var2.field826 * 64 - 64 + 60, var2, var2.field884, var3, var2.field859);
                }
            }
        }
    }

    @ObfuscatedName("l.aw(S)V")
    public static final void method51() {
        for (class7 var0 = (class7) field550.method3585(); var0 != null; var0 = (class7) field550.method3590()) {
            if (Statics.field213 != var0.field109 || field302 > var0.field115) {
                var0.method3679();
            } else if (field302 >= var0.field114) {
                if (var0.field118 > 0) {
                    class35 var1 = field329[var0.field118 - 1];
                    if (var1 != null && var1.field838 >= 0 && var1.field838 < 13312 && var1.field881 >= 0 && var1.field881 < 13312) {
                        var0.method96(var1.field838, var1.field881, method1545(var1.field838, var1.field881, var0.field109) - var0.field113, field302);
                    }
                }
                if (var0.field118 < 0) {
                    int var2 = -var0.field118 - 1;
                    class3 var3;
                    if (field412 == var2) {
                        var3 = Statics.field226;
                    } else {
                        var3 = field303[var2];
                    }
                    if (var3 != null && var3.field838 >= 0 && var3.field838 < 13312 && var3.field881 >= 0 && var3.field881 < 13312) {
                        var0.method96(var3.field838, var3.field881, method1545(var3.field838, var3.field881, var0.field109) - var0.field113, field302);
                    }
                }
                var0.method102(field367);
                Statics.field2057.method1841(Statics.field213, (int) var0.field120, (int) var0.field121, (int) var0.field122, 60, var0, var0.field128, -1, false);
            }
        }
    }

    @ObfuscatedName("e.ak(I)V")
    public static final void method187() {
        for (class30 var0 = (class30) field424.method3585(); var0 != null; var0 = (class30) field424.method3590()) {
            if (Statics.field213 != var0.field695 || var0.field702) {
                var0.method3679();
            } else if (field302 >= var0.field694) {
                var0.method689(field367);
                if (var0.field702) {
                    var0.method3679();
                } else {
                    Statics.field2057.method1841(var0.field695, var0.field696, var0.field693, var0.field698, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("fq.ae(III)V")
    public static final void method3033(int arg0, int arg1) {
        if (field458 == 2) {
            method2101((field314 - Statics.field2735 << 7) + field317, (field315 - Statics.field577 << 7) + field318, field441 * 2);
            if (field396 > -1 && field302 % 20 < 10) {
                Statics.field165[0].method1637(field396 + arg0 - 12, field397 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("ae.ad(Lai;IIIIII)V")
    public static final void method990(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method22()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field783;
            if (var6.field911 != null) {
                var6 = var6.method786();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field754;
        int[] var8 = class33.field762;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field47) {
                return;
            }
            if (var10.field57 != -1 || var10.field39 != -1) {
                method3512(arg0, arg0.field871 + 15);
                if (field396 > -1) {
                    if (var10.field57 != -1) {
                        Statics.field2306[var10.field57].method1637(field396 + arg2 - 12, field397 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field39 != -1) {
                        Statics.field1542[var10.field39].method1637(field396 + arg2 - 12, field397 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field458 == 10 && field361 == var8[arg1]) {
                method3512(arg0, arg0.field871 + 15);
                if (field396 > -1) {
                    Statics.field165[1].method1637(field396 + arg2 - 12, field397 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field783;
            if (var11.field911 != null) {
                var11 = var11.method786();
            }
            if (var11.field922 >= 0 && var11.field922 < Statics.field1542.length) {
                method3512(arg0, arg0.field871 + 15);
                if (field396 > -1) {
                    Statics.field1542[var11.field922].method1637(field396 + arg2 - 12, field397 + arg3 - 30);
                }
            }
            if (field458 == 1 && field312 == field331[arg1 - var7] && field302 % 20 < 10) {
                method3512(arg0, arg0.field871 + 15);
                if (field396 > -1) {
                    Statics.field165[0].method1637(field396 + arg2 - 12, field397 + arg3 - 28);
                }
            }
        }
        if (arg0.field825 != null && (arg1 >= var7 || !arg0.field837 && (field506 == 4 || !arg0.field836 && (field506 == 0 || field506 == 3 || field506 == 1 && method1995(((class3) arg0).field61, false))))) {
            method3512(arg0, arg0.field871);
            if (field396 > -1 && field384 < field385) {
                field389[field384] = Statics.field759.method3776(arg0.field825) / 2;
                field388[field384] = Statics.field759.field3189;
                field386[field384] = field396;
                field529[field384] = field397;
                field390[field384] = arg0.field853;
                field391[field384] = arg0.field878;
                field488[field384] = arg0.field883;
                field335[field384] = arg0.field825;
                field384++;
            }
        }
        if (arg0.field844 > field302) {
            method3512(arg0, arg0.field871 + 15);
            if (field396 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field783;
                    var12 = var13.field915;
                }
                int var14 = arg0.field862 * var12 / arg0.field835;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field862 > 0) {
                    var14 = 1;
                }
                class80.method1728(field396 + arg2 - var12 / 2, field397 + arg3 - 3, var14, 5, 65280);
                class80.method1728(field396 + arg2 - var12 / 2 + var14, field397 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field870[var15] > field302) {
                method3512(arg0, arg0.field871 / 2);
                if (field396 > -1) {
                    if (var15 == 1) {
                        field397 -= 20;
                    }
                    if (var15 == 2) {
                        field396 -= 15;
                        field397 -= 10;
                    }
                    if (var15 == 3) {
                        field396 += 15;
                        field397 -= 10;
                    }
                    Statics.field2140[arg0.field842[var15]].method1637(field396 + arg2 - 12, field397 + arg3 - 12);
                    Statics.field738.method3806(Integer.toString(arg0.field841[var15]), field396 + arg2 - 1, field397 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ag.au(IIIII)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3) {
        if (field395 == 1) {
            Statics.field712[field512 / 100].method1637(field347 - 8, field399 - 8);
        }
        if (field395 == 2) {
            Statics.field712[field512 / 100 + 4].method1637(field347 - 8, field399 - 8);
        }
        field410 = 0;
        int var4 = (Statics.field226.field838 >> 7) + Statics.field2735;
        int var5 = (Statics.field226.field881 >> 7) + Statics.field577;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field410 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field410 = 1;
        }
        if (field410 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field410 = 0;
        }
    }

    @ObfuscatedName("gk.ar(Lai;IB)V")
    public static final void method3512(class38 arg0, int arg1) {
        method2101(arg0.field838, arg0.field881, arg1);
    }

    @ObfuscatedName("cy.at(IIII)V")
    public static final void method2101(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field396 = -1;
            field397 = -1;
            return;
        }
        int var3 = method1545(arg0, arg1, Statics.field213) - arg2;
        int var4 = arg0 - Statics.field3161;
        int var5 = var3 - Statics.field28;
        int var6 = arg1 - Statics.field666;
        int var7 = class92.field1598[Statics.field2083];
        int var8 = class92.field1578[Statics.field2083];
        int var9 = class92.field1598[Statics.field1019];
        int var10 = class92.field1578[Statics.field1019];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field396 = field549 * var11 / var15 + field433 / 2;
            field397 = field549 * var14 / var15 + field554 / 2;
        } else {
            field396 = -1;
            field397 = -1;
        }
    }

    @ObfuscatedName("br.ab(IIII)I")
    public static final int method1545(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 7;
        int var4 = arg1 >> 7;
        if (var3 < 0 || var4 < 0 || var3 > 103 || var4 > 103) {
            return 0;
        }
        int var5 = arg2;
        if (arg2 < 3 && (class6.field83[1][var3][var4] & 0x2) == 2) {
            var5 = arg2 + 1;
        }
        int var6 = arg0 & 0x7F;
        int var7 = arg1 & 0x7F;
        int var8 = (128 - var6) * class6.field100[var5][var3][var4] + class6.field100[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field100[var5][var3][var4 + 1] + class6.field100[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("s.bp(IIIIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class92.field1598[var6];
            int var12 = class92.field1578[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class92.field1598[var7];
            int var15 = class92.field1578[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field3161 = arg0 - var8;
        Statics.field28 = arg1 - var9;
        Statics.field666 = arg2 - var10;
        Statics.field2083 = arg3;
        Statics.field1019 = arg4;
    }

    @ObfuscatedName("al.bo(ZI)V")
    public static final void method730(boolean arg0) {
        field352 = arg0;
        if (!field352) {
            int var1 = field336.method2526();
            int var2 = field336.method2419();
            int var3 = field336.method2387();
            Statics.field864 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field864[var4][var5] = field336.method2527();
                }
            }
            Statics.field244 = new int[var3];
            Statics.field2653 = new int[var3];
            Statics.field2898 = new int[var3];
            Statics.field2088 = new byte[var3][];
            Statics.field151 = new byte[var3][];
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
                        Statics.field244[var7] = var10;
                        Statics.field2653[var7] = Statics.field1564.method3075("m" + var8 + "_" + var9);
                        Statics.field2898[var7] = Statics.field1564.method3075("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method155(var1, var2);
            return;
        }
        int var11 = field336.method2387();
        int var12 = field336.method2387();
        int var13 = field336.method2387();
        field336.method2606();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field336.method2607(1);
                    if (var17 == 1) {
                        field353[var14][var15][var16] = field336.method2607(26);
                    } else {
                        field353[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field336.method2622();
        Statics.field864 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field864[var18][var19] = field336.method2527();
            }
        }
        Statics.field244 = new int[var13];
        Statics.field2653 = new int[var13];
        Statics.field2898 = new int[var13];
        Statics.field2088 = new byte[var13][];
        Statics.field151 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field353[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field244[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field244[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field2653[var20] = Statics.field1564.method3075("m" + var29 + "_" + var30);
                            Statics.field2898[var20] = Statics.field1564.method3075("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method155(var11, var12);
    }

    @ObfuscatedName("k.bf(III)V")
    public static final void method155(int arg0, int arg1) {
        if (Statics.field2710 == arg0 && Statics.field6 == arg1) {
            return;
        }
        Statics.field2710 = arg0;
        Statics.field6 = arg1;
        method153(25);
        method732(class158.field2317, true);
        int var2 = Statics.field2735;
        int var3 = Statics.field577;
        Statics.field2735 = (arg0 - 6) * 8;
        Statics.field577 = (arg1 - 6) * 8;
        int var4 = Statics.field2735 - var2;
        int var5 = Statics.field577 - var3;
        int var6 = Statics.field2735;
        int var7 = Statics.field577;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field329[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field876[var10] -= var4;
                    var9.field877[var10] -= var5;
                }
                var9.field838 -= var4 * 128;
                var9.field881 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field303[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field876[var13] -= var4;
                    var12.field877[var13] -= var5;
                }
                var12.field838 -= var4 * 128;
                var12.field881 -= var5 * 128;
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
                        field573[var24][var20][var21] = field573[var24][var22][var23];
                    } else {
                        field573[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field422.method3585(); var25 != null; var25 = (class17) field422.method3590()) {
            var25.field234 -= var4;
            var25.field232 -= var5;
            if (var25.field234 < 0 || var25.field232 < 0 || var25.field234 >= 104 || var25.field232 >= 104) {
                var25.method3679();
            }
        }
        if (field483 != 0) {
            field483 -= var4;
            field523 -= var5;
        }
        field555 = 0;
        field537 = false;
        field423 = -1;
        field424.method3582();
        field550.method3582();
        for (int var26 = 0; var26 < 4; var26++) {
            field351[var26].method2266();
        }
    }

    @ObfuscatedName("at.bx(ZI)V")
    public static final void method1047(boolean arg0) {
        method111();
        field340++;
        if (field340 < 50 && !arg0) {
            return;
        }
        field340 = 0;
        if (field362 || Statics.field2743 == null) {
            return;
        }
        field334.method2604(144);
        try {
            Statics.field2743.method2837(field334.field2001, 0, field334.field1999);
            field334.field1999 = 0;
        } catch (IOException var2) {
            field362 = true;
        }
    }

    @ObfuscatedName("fo.bq(IIIIIB)V")
    public static final void method3161(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field2057.method1856(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field2057.method1949(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field2912.field1410;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2950(var12);
            if (var13.field966 == -1) {
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
                class81 var14 = Statics.field212[var13.field966];
                if (var14 != null) {
                    int var15 = (var13.field946 * 4 - var14.field1429) / 2;
                    int var16 = (var13.field938 * 4 - var14.field1430) / 2;
                    var14.method1790(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field938) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field2057.method1966(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field2057.method1949(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2950(var21);
            if (var22.field966 != -1) {
                class81 var23 = Statics.field212[var22.field966];
                if (var23 != null) {
                    int var24 = (var22.field946 * 4 - var23.field1429) / 2;
                    int var25 = (var22.field938 * 4 - var23.field1430) / 2;
                    var23.method1790(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field938) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field2912.field1410;
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
        int var29 = Statics.field2057.method1834(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2950(var30);
        if (var31.field966 == -1) {
            return;
        }
        class81 var32 = Statics.field212[var31.field966];
        if (var32 != null) {
            int var33 = (var31.field946 * 4 - var32.field1429) / 2;
            int var34 = (var31.field938 * 4 - var32.field1430) / 2;
            var32.method1790(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field938) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dg.bc(I)Z")
    public static final boolean method2308() {
        if (Statics.field2743 == null) {
            return false;
        }
        try {
            int var0 = Statics.field2743.method2831();
            if (var0 == 0) {
                return false;
            }
            if (field326 == -1) {
                Statics.field2743.method2855(field336.field2001, 0, 1);
                field336.field1999 = 0;
                field326 = field336.method2618();
                field420 = class189.field3040[field326];
                var0--;
            }
            if (field420 == -1) {
                if (var0 <= 0) {
                    return false;
                }
                Statics.field2743.method2855(field336.field2001, 0, 1);
                field420 = field336.field2001[0] & 0xFF;
                var0--;
            }
            if (field420 == -2) {
                if (var0 <= 1) {
                    return false;
                }
                Statics.field2743.method2855(field336.field2001, 0, 2);
                field336.field1999 = 0;
                field420 = field336.method2387();
                var0 -= 2;
            }
            if (var0 < field420) {
                return false;
            }
            field336.field1999 = 0;
            Statics.field2743.method2855(field336.field2001, 0, field420);
            field339 = 0;
            field418 = field484;
            field484 = field305;
            field305 = field326;
            if (field326 == 43) {
                int var1 = field336.method2527();
                class4 var2 = (class4) field449.method3555((long) var1);
                if (var2 != null) {
                    method621(var2, true);
                }
                if (field313 != null) {
                    method791(field313);
                    field313 = null;
                }
                field326 = -1;
                return true;
            }
            if (field326 == 250) {
                field537 = true;
                Statics.field571 = field336.method2385();
                Statics.field1686 = field336.method2385();
                Statics.field1059 = field336.method2387();
                Statics.field2243 = field336.method2385();
                Statics.field12 = field336.method2385();
                if (Statics.field12 >= 100) {
                    Statics.field3161 = Statics.field571 * 128 + 64;
                    Statics.field666 = Statics.field1686 * 128 + 64;
                    Statics.field28 = method1545(Statics.field3161, Statics.field666, Statics.field213) - Statics.field1059;
                }
                field326 = -1;
                return true;
            }
            if (field326 == 32) {
                int var3 = field336.method2419();
                field392 = var3;
                method778(false);
                method161(var3);
                class37.method2963(field392);
                for (int var4 = 0; var4 < 100; var4++) {
                    field517[var4] = true;
                }
                field326 = -1;
                return true;
            }
            if (field326 == 94) {
                method72();
                field326 = -1;
                return false;
            }
            if (field326 == 73) {
                int var5 = field336.method2385();
                if (field336.method2385() == 0) {
                    field565[var5] = new class221();
                    field336.field1999 += 18;
                } else {
                    field336.field1999--;
                    field565[var5] = new class221(field336, false);
                }
                field563 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 137) {
                String var6 = field336.method2499();
                int var7 = field336.method2387();
                byte var8 = field336.method2369();
                boolean var9 = false;
                if (var8 == -128) {
                    var9 = true;
                }
                if (var9) {
                    if (Statics.field1637 == 0) {
                        field326 = -1;
                        return true;
                    }
                    boolean var10 = false;
                    int var11;
                    for (var11 = 0; var11 < Statics.field1637 && (!Statics.field793[var11].field630.equals(var6) || Statics.field793[var11].field623 != var7); var11++) {
                    }
                    if (var11 < Statics.field1637) {
                        while (var11 < Statics.field1637 - 1) {
                            Statics.field793[var11] = Statics.field793[var11 + 1];
                            var11++;
                        }
                        Statics.field1637--;
                        Statics.field793[Statics.field1637] = null;
                    }
                } else {
                    field336.method2499();
                    class25 var12 = new class25();
                    var12.field630 = var6;
                    var12.field625 = class165.method2795(var12.field630, Statics.field295);
                    var12.field623 = var7;
                    var12.field624 = var8;
                    int var13;
                    for (var13 = Statics.field1637 - 1; var13 >= 0; var13--) {
                        int var14 = Statics.field793[var13].field625.compareTo(var12.field625);
                        if (var14 == 0) {
                            Statics.field793[var13].field623 = var7;
                            Statics.field793[var13].field624 = var8;
                            if (var6.equals(Statics.field226.field61)) {
                                Statics.field149 = var8;
                            }
                            field543 = field564;
                            field326 = -1;
                            return true;
                        }
                        if (var14 < 0) {
                            break;
                        }
                    }
                    if (Statics.field1637 >= Statics.field793.length) {
                        field326 = -1;
                        return true;
                    }
                    for (int var15 = Statics.field1637 - 1; var15 > var13; var15--) {
                        Statics.field793[var15 + 1] = Statics.field793[var15];
                    }
                    if (Statics.field1637 == 0) {
                        Statics.field793 = new class25[100];
                    }
                    Statics.field793[var13 + 1] = var12;
                    Statics.field1637++;
                    if (var6.equals(Statics.field226.field61)) {
                        Statics.field149 = var8;
                    }
                }
                field543 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 231) {
                boolean var16 = field336.method2385() == 1;
                if (var16) {
                    Statics.field146 = class116.method2672() - field336.method2391();
                    Statics.field2099 = new class222(field336, true);
                } else {
                    Statics.field2099 = null;
                }
                field536 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 232) {
                int var17 = field336.method2387();
                int var18 = field336.method2429();
                class174 var19 = class174.method2958(var18);
                if (var19 != null && var19.field2799 == 0) {
                    if (var17 > var19.field2779 - var19.field2889) {
                        var17 = var19.field2779 - var19.field2889;
                    }
                    if (var17 < 0) {
                        var17 = 0;
                    }
                    if (var19.field2777 != var17) {
                        var19.field2777 = var17;
                        method791(var19);
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 69) {
                class33.field754 = 0;
                for (int var20 = 0; var20 < 2048; var20++) {
                    class33.field757[var20] = null;
                    class33.field768[var20] = 1;
                }
                for (int var21 = 0; var21 < 2048; var21++) {
                    field303[var21] = null;
                }
                Statics.method109(field336);
                field326 = -1;
                return true;
            }
            if (field326 == 34) {
                Statics.field1772 = field336.method2410();
                Statics.field189 = field336.method2411();
                field326 = -1;
                return true;
            }
            if (field326 == 225 || field326 == 46 || field326 == 206 || field326 == 229 || field326 == 230 || field326 == 90 || field326 == 138 || field326 == 175 || field326 == 38 || field326 == 16) {
                Statics.method9();
                field326 = -1;
                return true;
            }
            if (field326 == 131) {
                int var22 = field336.method2418();
                int var23 = field336.method2561();
                int var24 = field336.method2520();
                class174 var25 = class174.method2958(var23);
                if (var25.field2764 != var24 || var25.field2754 != var22 || var25.field2760 != 0 || var25.field2859 != 0) {
                    var25.field2764 = var24;
                    var25.field2754 = var22;
                    var25.field2760 = 0;
                    var25.field2859 = 0;
                    method791(var25);
                    method997(var25);
                    if (var25.field2799 == 0) {
                        method1584(Statics.field2771[var23 >> 16], var25, false);
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 106) {
                int var26 = field336.method2385();
                class131[] var27 = class131.method2326();
                int var28 = 0;
                class131 var30;
                while (true) {
                    if (var28 >= var27.length) {
                        var30 = null;
                        break;
                    }
                    class131 var29 = var27[var28];
                    if (var29.field2066 == var26) {
                        var30 = var29;
                        break;
                    }
                    var28++;
                }
                Statics.field1078 = var30;
                field326 = -1;
                return true;
            }
            if (field326 == 36) {
                field483 = field336.method2385();
                if (field483 == 255) {
                    field483 = 0;
                }
                field523 = field336.method2385();
                if (field523 == 255) {
                    field523 = 0;
                }
                field326 = -1;
                return true;
            }
            if (field326 == 37) {
                for (int var31 = 0; var31 < field303.length; var31++) {
                    if (field303[var31] != null) {
                        field303[var31].field823 = -1;
                    }
                }
                for (int var32 = 0; var32 < field329.length; var32++) {
                    if (field329[var32] != null) {
                        field329[var32].field823 = -1;
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 65) {
                field543 = field564;
                if (field420 == 0) {
                    field515 = null;
                    field516 = null;
                    Statics.field1637 = 0;
                    Statics.field793 = null;
                    field326 = -1;
                    return true;
                }
                field516 = field336.method2499();
                long var33 = field336.method2391();
                field515 = class163.method2664(var33);
                Statics.field2960 = field336.method2369();
                int var35 = field336.method2385();
                if (var35 == 255) {
                    field326 = -1;
                    return true;
                }
                Statics.field1637 = var35;
                class25[] var36 = new class25[100];
                for (int var37 = 0; var37 < Statics.field1637; var37++) {
                    var36[var37] = new class25();
                    var36[var37].field630 = field336.method2499();
                    var36[var37].field625 = class165.method2795(var36[var37].field630, Statics.field295);
                    var36[var37].field623 = field336.method2387();
                    var36[var37].field624 = field336.method2369();
                    field336.method2499();
                    if (var36[var37].field630.equals(Statics.field226.field61)) {
                        Statics.field149 = var36[var37].field624;
                    }
                }
                boolean var38 = false;
                int var39 = Statics.field1637;
                while (var39 > 0) {
                    boolean var40 = true;
                    var39--;
                    for (int var41 = 0; var41 < var39; var41++) {
                        if (var36[var41].field625.compareTo(var36[var41 + 1].field625) > 0) {
                            class25 var42 = var36[var41];
                            var36[var41] = var36[var41 + 1];
                            var36[var41 + 1] = var42;
                            var40 = false;
                        }
                    }
                    if (var40) {
                        break;
                    }
                }
                Statics.field793 = var36;
                field326 = -1;
                return true;
            }
            if (field326 == 183) {
                int var43 = field336.method2527();
                int var44 = field336.method2418();
                class174 var45 = class174.method2958(var43);
                if (var45.field2757 != var44 || var44 == -1) {
                    var45.field2757 = var44;
                    var45.field2877 = 0;
                    var45.field2744 = 0;
                    method791(var45);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 174) {
                String var46 = field336.method2499();
                class123 var47 = field336;
                String var48 = class223.method3267(var47, 32767);
                String var49 = class224.method3802(class164.method178(var48));
                class12.method1120(6, var46, var49);
                field326 = -1;
                return true;
            }
            if (field326 == 64) {
                class123 var50 = field336;
                int var51 = field420;
                int var52 = var50.field1999;
                class33.field766 = 0;
                int var53 = 0;
                var50.method2606();
                for (int var54 = 0; var54 < class33.field754; var54++) {
                    int var55 = class33.field762[var54];
                    if ((class33.field756[var55] & 0x1) == 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field756[var55] = (byte) (class33.field756[var55] | 0x2);
                        } else {
                            int var56 = var50.method2607(1);
                            if (var56 == 0) {
                                var53 = Statics.method1099(var50);
                                class33.field756[var55] = (byte) (class33.field756[var55] | 0x2);
                            } else {
                                class33.method615(var50, var55);
                            }
                        }
                    }
                }
                var50.method2622();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                var50.method2606();
                for (int var57 = 0; var57 < class33.field754; var57++) {
                    int var58 = class33.field762[var57];
                    if ((class33.field756[var58] & 0x1) != 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field756[var58] = (byte) (class33.field756[var58] | 0x2);
                        } else {
                            int var59 = var50.method2607(1);
                            if (var59 == 0) {
                                var53 = Statics.method1099(var50);
                                class33.field756[var58] = (byte) (class33.field756[var58] | 0x2);
                            } else {
                                class33.method615(var50, var58);
                            }
                        }
                    }
                }
                var50.method2622();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                var50.method2606();
                for (int var60 = 0; var60 < class33.field761; var60++) {
                    int var61 = class33.field770[var60];
                    if ((class33.field756[var61] & 0x1) != 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field756[var61] = (byte) (class33.field756[var61] | 0x2);
                        } else {
                            int var62 = var50.method2607(1);
                            if (var62 == 0) {
                                var53 = Statics.method1099(var50);
                                class33.field756[var61] = (byte) (class33.field756[var61] | 0x2);
                            } else if (class33.method2597(var50, var61)) {
                                class33.field756[var61] = (byte) (class33.field756[var61] | 0x2);
                            }
                        }
                    }
                }
                var50.method2622();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                var50.method2606();
                for (int var63 = 0; var63 < class33.field761; var63++) {
                    int var64 = class33.field770[var63];
                    if ((class33.field756[var64] & 0x1) == 0) {
                        if (var53 > 0) {
                            var53--;
                            class33.field756[var64] = (byte) (class33.field756[var64] | 0x2);
                        } else {
                            int var65 = var50.method2607(1);
                            if (var65 == 0) {
                                var53 = Statics.method1099(var50);
                                class33.field756[var64] = (byte) (class33.field756[var64] | 0x2);
                            } else if (class33.method2597(var50, var64)) {
                                class33.field756[var64] = (byte) (class33.field756[var64] | 0x2);
                            }
                        }
                    }
                }
                var50.method2622();
                if (var53 != 0) {
                    throw new RuntimeException();
                }
                class33.field754 = 0;
                class33.field761 = 0;
                for (int var66 = 1; var66 < 2048; var66++) {
                    class33.field756[var66] = (byte) (class33.field756[var66] >> 1);
                    class3 var67 = field303[var66];
                    if (var67 == null) {
                        class33.field770[++class33.field761 - 1] = var66;
                    } else {
                        class33.field762[++class33.field754 - 1] = var66;
                    }
                }
                for (int var68 = 0; var68 < class33.field766; var68++) {
                    int var69 = class33.field769[var68];
                    class3 var70 = field303[var69];
                    int var71 = var50.method2385();
                    if ((var71 & 0x8) != 0) {
                        var71 += var50.method2385() << 8;
                    }
                    class33.method2183(var50, var69, var70, var71);
                }
                if (var50.field1999 - var52 != var51) {
                    throw new RuntimeException(var50.field1999 - var52 + " " + var51);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 148) {
                method2756(true);
                field326 = -1;
                return true;
            }
            if (field326 == 23) {
                for (int var72 = 0; var72 < Statics.field2055; var72++) {
                    class53 var73 = class53.method2969(var72);
                    if (var73 != null) {
                        class177.field2904[var72] = 0;
                        class177.field2906[var72] = 0;
                    }
                }
                method2674();
                field291 += 32;
                field326 = -1;
                return true;
            }
            if (field326 == 55) {
                String var74 = field336.method2499();
                int var75 = field336.method2429();
                class174 var76 = class174.method2958(var75);
                if (!var74.equals(var76.field2815)) {
                    var76.field2815 = var74;
                    method791(var76);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 48) {
                while (field336.field1999 < field420) {
                    boolean var77 = field336.method2385() == 1;
                    String var78 = field336.method2499();
                    String var79 = field336.method2499();
                    int var80 = field336.method2387();
                    int var81 = field336.method2385();
                    int var82 = field336.method2385();
                    boolean var83 = (var82 & 0x2) != 0;
                    boolean var84 = (var82 & 0x1) != 0;
                    if (var80 > 0) {
                        field336.method2499();
                        field336.method2385();
                        field336.method2527();
                    }
                    field336.method2499();
                    for (int var85 = 0; var85 < field556; var85++) {
                        class18 var86 = field558[var85];
                        if (var77) {
                            if (var79.equals(var86.field255)) {
                                var86.field255 = var78;
                                var86.field249 = var79;
                                var78 = null;
                                break;
                            }
                        } else if (var78.equals(var86.field255)) {
                            if (var86.field250 != var80) {
                                boolean var87 = true;
                                for (class39 var88 = (class39) field559.method3543(); var88 != null; var88 = (class39) field559.method3550()) {
                                    if (var88.field886.equals(var78)) {
                                        if (var80 != 0 && var88.field887 == 0) {
                                            var88.method3669();
                                            var87 = false;
                                        } else if (var80 == 0 && var88.field887 != 0) {
                                            var88.method3669();
                                            var87 = false;
                                        }
                                    }
                                }
                                if (var87) {
                                    field559.method3542(new class39(var78, var80));
                                }
                                var86.field250 = var80;
                            }
                            var86.field249 = var79;
                            var86.field261 = var81;
                            var86.field252 = var83;
                            var86.field253 = var84;
                            var78 = null;
                            break;
                        }
                    }
                    if (var78 != null && field556 < 400) {
                        class18 var89 = new class18();
                        field558[field556] = var89;
                        var89.field255 = var78;
                        var89.field249 = var79;
                        var89.field250 = var80;
                        var89.field261 = var81;
                        var89.field252 = var83;
                        var89.field253 = var84;
                        field556++;
                    }
                }
                field398 = 2;
                field481 = field564;
                boolean var90 = false;
                int var91 = field556;
                while (var91 > 0) {
                    boolean var92 = true;
                    var91--;
                    for (int var93 = 0; var93 < var91; var93++) {
                        boolean var94 = false;
                        class18 var95 = field558[var93];
                        class18 var96 = field558[var93 + 1];
                        if (field387 != var95.field250 && field387 == var96.field250) {
                            var94 = true;
                        }
                        if (!var94 && var95.field250 == 0 && var96.field250 != 0) {
                            var94 = true;
                        }
                        if (!var94 && !var95.field252 && var96.field252) {
                            var94 = true;
                        }
                        if (!var94 && !var95.field253 && var96.field253) {
                            var94 = true;
                        }
                        if (var94) {
                            class18 var97 = field558[var93];
                            field558[var93] = field558[var93 + 1];
                            field558[var93 + 1] = var97;
                            var92 = false;
                        }
                    }
                    if (var92) {
                        break;
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 51) {
                method2674();
                field454 = field336.method2388();
                field528 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 20) {
                int var98 = field336.method2429();
                int var99 = field336.method2526();
                class174 var100 = class174.method2958(var98);
                if (var100.field2798 != 2 || var100.field2769 != var99) {
                    var100.field2798 = 2;
                    var100.field2769 = var99;
                    method791(var100);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 191) {
                if (field392 != -1) {
                    method744(field392, 0);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 176) {
                field310 = field336.method2387() * 30;
                field528 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 214) {
                int var101 = field336.method2387();
                int var102 = field336.method2387();
                int var103 = field336.method2429();
                int var104 = field336.method2526();
                class174 var105 = class174.method2958(var103);
                if (var105.field2806 != var104 || var105.field2807 != var101 || var105.field2875 != var102) {
                    var105.field2806 = var104;
                    var105.field2807 = var101;
                    var105.field2875 = var102;
                    method791(var105);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 14) {
                int var106 = field336.method2427();
                class174 var107 = class174.method2958(var106);
                var107.field2798 = 3;
                var107.field2769 = Statics.field226.field37.method3285();
                method791(var107);
                field326 = -1;
                return true;
            }
            if (field326 == 217) {
                class212.method1619(field336, field420);
                field326 = -1;
                return true;
            }
            if (field326 == 96) {
                Statics.field189 = field336.method2410();
                Statics.field1772 = field336.method2412();
                for (int var108 = Statics.field189; var108 < Statics.field189 + 8; var108++) {
                    for (int var109 = Statics.field1772; var109 < Statics.field1772 + 8; var109++) {
                        if (field573[Statics.field213][var108][var109] != null) {
                            field573[Statics.field213][var108][var109] = null;
                            method2979(var108, var109);
                        }
                    }
                }
                for (class17 var110 = (class17) field422.method3585(); var110 != null; var110 = (class17) field422.method3590()) {
                    if (var110.field234 >= Statics.field189 && var110.field234 < Statics.field189 + 8 && var110.field232 >= Statics.field1772 && var110.field232 < Statics.field1772 + 8 && Statics.field213 == var110.field242) {
                        var110.field240 = 0;
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 211) {
                field336.field1999 += 28;
                if (field336.method2407()) {
                    class123 var111 = field336;
                    int var112 = field336.field1999 - 28;
                    if (class150.field2242 != null) {
                        try {
                            class150.field2242.method3892(0L);
                            class150.field2242.method3914(var111.field2001, var112, 24);
                        } catch (Exception var339) {
                        }
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 33) {
                method730(true);
                field336.method2618();
                int var114 = field336.method2387();
                class123 var115 = field336;
                int var116 = var115.field1999;
                class33.field766 = 0;
                int var117 = 0;
                var115.method2606();
                for (int var118 = 0; var118 < class33.field754; var118++) {
                    int var119 = class33.field762[var118];
                    if ((class33.field756[var119] & 0x1) == 0) {
                        if (var117 > 0) {
                            var117--;
                            class33.field756[var119] = (byte) (class33.field756[var119] | 0x2);
                        } else {
                            int var120 = var115.method2607(1);
                            if (var120 == 0) {
                                var117 = Statics.method1099(var115);
                                class33.field756[var119] = (byte) (class33.field756[var119] | 0x2);
                            } else {
                                class33.method615(var115, var119);
                            }
                        }
                    }
                }
                var115.method2622();
                if (var117 != 0) {
                    throw new RuntimeException();
                }
                var115.method2606();
                for (int var121 = 0; var121 < class33.field754; var121++) {
                    int var122 = class33.field762[var121];
                    if ((class33.field756[var122] & 0x1) != 0) {
                        if (var117 > 0) {
                            var117--;
                            class33.field756[var122] = (byte) (class33.field756[var122] | 0x2);
                        } else {
                            int var123 = var115.method2607(1);
                            if (var123 == 0) {
                                var117 = Statics.method1099(var115);
                                class33.field756[var122] = (byte) (class33.field756[var122] | 0x2);
                            } else {
                                class33.method615(var115, var122);
                            }
                        }
                    }
                }
                var115.method2622();
                if (var117 != 0) {
                    throw new RuntimeException();
                }
                var115.method2606();
                for (int var124 = 0; var124 < class33.field761; var124++) {
                    int var125 = class33.field770[var124];
                    if ((class33.field756[var125] & 0x1) != 0) {
                        if (var117 > 0) {
                            var117--;
                            class33.field756[var125] = (byte) (class33.field756[var125] | 0x2);
                        } else {
                            int var126 = var115.method2607(1);
                            if (var126 == 0) {
                                var117 = Statics.method1099(var115);
                                class33.field756[var125] = (byte) (class33.field756[var125] | 0x2);
                            } else if (class33.method2597(var115, var125)) {
                                class33.field756[var125] = (byte) (class33.field756[var125] | 0x2);
                            }
                        }
                    }
                }
                var115.method2622();
                if (var117 != 0) {
                    throw new RuntimeException();
                }
                var115.method2606();
                for (int var127 = 0; var127 < class33.field761; var127++) {
                    int var128 = class33.field770[var127];
                    if ((class33.field756[var128] & 0x1) == 0) {
                        if (var117 > 0) {
                            var117--;
                            class33.field756[var128] = (byte) (class33.field756[var128] | 0x2);
                        } else {
                            int var129 = var115.method2607(1);
                            if (var129 == 0) {
                                var117 = Statics.method1099(var115);
                                class33.field756[var128] = (byte) (class33.field756[var128] | 0x2);
                            } else if (class33.method2597(var115, var128)) {
                                class33.field756[var128] = (byte) (class33.field756[var128] | 0x2);
                            }
                        }
                    }
                }
                var115.method2622();
                if (var117 != 0) {
                    throw new RuntimeException();
                }
                class33.field754 = 0;
                class33.field761 = 0;
                for (int var130 = 1; var130 < 2048; var130++) {
                    class33.field756[var130] = (byte) (class33.field756[var130] >> 1);
                    class3 var131 = field303[var130];
                    if (var131 == null) {
                        class33.field770[++class33.field761 - 1] = var130;
                    } else {
                        class33.field762[++class33.field754 - 1] = var130;
                    }
                }
                for (int var132 = 0; var132 < class33.field766; var132++) {
                    int var133 = class33.field769[var132];
                    class3 var134 = field303[var133];
                    int var135 = var115.method2385();
                    if ((var135 & 0x8) != 0) {
                        var135 += var115.method2385() << 8;
                    }
                    class33.method2183(var115, var133, var134, var135);
                }
                if (var115.field1999 - var116 != var114) {
                    throw new RuntimeException(var115.field1999 - var116 + " " + var114);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 132) {
                String var136 = field336.method2499();
                long var137 = (long) field336.method2387();
                long var139 = (long) field336.method2389();
                class153 var141 = (class153) class110.method170(class153.method132(), field336.method2385());
                long var142 = (var137 << 32) + var139;
                boolean var144 = false;
                for (int var145 = 0; var145 < 100; var145++) {
                    if (field509[var145] == var142) {
                        var144 = true;
                        break;
                    }
                }
                if (method44(var136)) {
                    var144 = true;
                }
                if (!var144 && field410 == 0) {
                    field509[field510] = var142;
                    field510 = (field510 + 1) % 100;
                    class123 var146 = field336;
                    String var147 = class223.method3267(var146, 32767);
                    String var148 = class224.method3802(class164.method178(var147));
                    byte var149;
                    if (var141.field2262) {
                        var149 = 7;
                    } else {
                        var149 = 3;
                    }
                    if (var141.field2261 == -1) {
                        class12.method1120(var149, var136, var148);
                    } else {
                        int var151 = var141.field2261;
                        String var152 = "<img=" + var151 + ">";
                        class12.method1120(var149, var152 + var136, var148);
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 213) {
                method2756(false);
                field326 = -1;
                return true;
            }
            if (field326 == 66) {
                method144(field336.method2499());
                field326 = -1;
                return true;
            }
            if (field326 == 82) {
                field524 = field336.method2385();
                field326 = -1;
                return true;
            }
            if (field326 == 113) {
                int var153 = field336.method2419();
                int var154 = field336.method2427();
                class174 var155 = class174.method2958(var154);
                if (var155.field2798 != 1 || var155.field2769 != var153) {
                    var155.field2798 = 1;
                    var155.field2769 = var153;
                    method791(var155);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 180) {
                class26 var156 = new class26();
                var156.field644 = field336.method2499();
                var156.field641 = field336.method2387();
                int var157 = field336.method2527();
                var156.field642 = var157;
                method153(45);
                Statics.field2743.method2832();
                Statics.field2743 = null;
                class32.method2265(var156);
                field326 = -1;
                return false;
            }
            if (field326 == 147) {
                int var158 = field336.method2429();
                int var159 = field336.method2427();
                class4 var160 = (class4) field449.method3555((long) var159);
                class4 var161 = (class4) field449.method3555((long) var158);
                if (var161 != null) {
                    method621(var161, var160 == null || var160.field65 != var161.field65);
                }
                if (var160 != null) {
                    var160.method3679();
                    field449.method3559(var160, (long) var158);
                }
                class174 var162 = class174.method2958(var159);
                if (var162 != null) {
                    method791(var162);
                }
                class174 var163 = class174.method2958(var158);
                if (var163 != null) {
                    method791(var163);
                    method1584(Statics.field2771[var163.field2870 >>> 16], var163, true);
                }
                if (field392 != -1) {
                    method744(field392, 1);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 56) {
                method2674();
                int var164 = field336.method2410();
                int var165 = field336.method2429();
                int var166 = field336.method2411();
                field427[var164] = var165;
                field425[var164] = var166;
                field426[var164] = 1;
                for (int var167 = 0; var167 < 98; var167++) {
                    if (var165 >= class156.field2288[var167]) {
                        field426[var164] = var167 + 2;
                    }
                }
                field478[++field479 - 1 & 0x1F] = var164;
                field326 = -1;
                return true;
            }
            if (field326 == 125) {
                int var168 = field336.method2527();
                int var169 = field336.method2527();
                if (Statics.field3050 == null || !Statics.field3050.isValid()) {
                    try {
                        Iterator var170 = ManagementFactory.getGarbageCollectorMXBeans().iterator();
                        while (var170.hasNext()) {
                            GarbageCollectorMXBean var171 = (GarbageCollectorMXBean) var170.next();
                            if (var171.isValid()) {
                                Statics.field3050 = var171;
                                field485 = -1L;
                                field366 = -1L;
                            }
                        }
                    } catch (Throwable var340) {
                    }
                }
                long var173 = class116.method2672();
                int var175 = -1;
                if (Statics.field3050 != null) {
                    long var176 = Statics.field3050.getCollectionTime();
                    if (field366 != -1L) {
                        long var178 = var176 - field366;
                        long var180 = var173 - field485;
                        if (var180 != 0L) {
                            var175 = (int) (var178 * 100L / var180);
                        }
                    }
                    field366 = var176;
                    field485 = var173;
                }
                field334.method2604(184);
                field334.method2485(var175);
                field334.method2370(var168);
                field334.method2424(var169);
                field334.method2409(field2195);
                field326 = -1;
                return true;
            }
            if (field326 == 104) {
                field537 = false;
                for (int var182 = 0; var182 < 5; var182++) {
                    field526[var182] = false;
                }
                field326 = -1;
                return true;
            }
            if (field326 == 177) {
                int var183 = field336.method2429();
                int var184 = field336.method2387();
                int var185 = var184 >> 10 & 0x1F;
                int var186 = var184 >> 5 & 0x1F;
                int var187 = var184 & 0x1F;
                int var188 = (var187 << 3) + (var185 << 19) + (var186 << 11);
                class174 var189 = class174.method2958(var183);
                if (var189.field2780 != var188) {
                    var189.field2780 = var188;
                    method791(var189);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 249) {
                for (int var190 = 0; var190 < class177.field2906.length; var190++) {
                    if (class177.field2906[var190] != class177.field2904[var190]) {
                        class177.field2906[var190] = class177.field2904[var190];
                        method608(var190);
                        field409[++field291 - 1 & 0x1F] = var190;
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 195) {
                int var191 = field336.method2387();
                if (var191 == 65535) {
                    var191 = -1;
                }
                int var192 = field336.method2427();
                int var193 = field336.method2429();
                class174 var194 = class174.method2958(var192);
                if (var194.field2861) {
                    var194.field2765 = var191;
                    var194.field2795 = var193;
                    class52 var196 = class52.method2827(var191);
                    var194.field2806 = var196.field1118;
                    var194.field2807 = var196.field1130;
                    var194.field2747 = var196.field1132;
                    var194.field2804 = var196.field1134;
                    var194.field2805 = var196.field1133;
                    var194.field2875 = var196.field1128;
                    if (var196.field1152 == 1) {
                        var194.field2813 = 1;
                    } else {
                        var194.field2813 = 2;
                    }
                    if (var194.field2810 > 0) {
                        var194.field2875 = var194.field2875 * 32 / var194.field2810;
                    } else if (var194.field2826 > 0) {
                        var194.field2875 = var194.field2875 * 32 / var194.field2826;
                    }
                    method791(var194);
                } else if (var191 == -1) {
                    var194.field2798 = 0;
                    field326 = -1;
                    return true;
                } else {
                    class52 var195 = class52.method2827(var191);
                    var194.field2798 = 4;
                    var194.field2769 = var191;
                    var194.field2806 = var195.field1118;
                    var194.field2807 = var195.field1130;
                    var194.field2875 = var195.field1128 * 100 / var193;
                    method791(var194);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 251) {
                field398 = 1;
                field481 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 84) {
                int var197 = field420 + field336.field1999;
                int var198 = field336.method2387();
                int var199 = field336.method2387();
                if (field392 != var198) {
                    field392 = var198;
                    method778(false);
                    method161(field392);
                    class37.method2963(field392);
                    for (int var200 = 0; var200 < 100; var200++) {
                        field517[var200] = true;
                    }
                }
                while (var199-- > 0) {
                    int var201 = field336.method2527();
                    int var202 = field336.method2387();
                    int var203 = field336.method2385();
                    class4 var204 = (class4) field449.method3555((long) var201);
                    if (var204 != null && var204.field65 != var202) {
                        method621(var204, true);
                        var204 = null;
                    }
                    if (var204 == null) {
                        var204 = Statics.method4(var201, var202, var203);
                    }
                    var204.field69 = true;
                }
                for (class4 var205 = (class4) field449.method3558(); var205 != null; var205 = (class4) field449.method3556()) {
                    if (var205.field69) {
                        var205.field69 = false;
                    } else {
                        method621(var205, true);
                    }
                }
                field490 = new class197(512);
                while (field336.field1999 < var197) {
                    int var206 = field336.method2527();
                    int var207 = field336.method2387();
                    int var208 = field336.method2387();
                    int var209 = field336.method2527();
                    for (int var210 = var207; var210 <= var208; var210++) {
                        long var211 = ((long) var206 << 32) + (long) var210;
                        field490.method3559(new class202(var209), var211);
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 42) {
                method730(false);
                field336.method2618();
                int var213 = field336.method2387();
                class123 var214 = field336;
                int var215 = var214.field1999;
                class33.field766 = 0;
                int var216 = 0;
                var214.method2606();
                for (int var217 = 0; var217 < class33.field754; var217++) {
                    int var218 = class33.field762[var217];
                    if ((class33.field756[var218] & 0x1) == 0) {
                        if (var216 > 0) {
                            var216--;
                            class33.field756[var218] = (byte) (class33.field756[var218] | 0x2);
                        } else {
                            int var219 = var214.method2607(1);
                            if (var219 == 0) {
                                var216 = Statics.method1099(var214);
                                class33.field756[var218] = (byte) (class33.field756[var218] | 0x2);
                            } else {
                                class33.method615(var214, var218);
                            }
                        }
                    }
                }
                var214.method2622();
                if (var216 != 0) {
                    throw new RuntimeException();
                }
                var214.method2606();
                for (int var220 = 0; var220 < class33.field754; var220++) {
                    int var221 = class33.field762[var220];
                    if ((class33.field756[var221] & 0x1) != 0) {
                        if (var216 > 0) {
                            var216--;
                            class33.field756[var221] = (byte) (class33.field756[var221] | 0x2);
                        } else {
                            int var222 = var214.method2607(1);
                            if (var222 == 0) {
                                var216 = Statics.method1099(var214);
                                class33.field756[var221] = (byte) (class33.field756[var221] | 0x2);
                            } else {
                                class33.method615(var214, var221);
                            }
                        }
                    }
                }
                var214.method2622();
                if (var216 != 0) {
                    throw new RuntimeException();
                }
                var214.method2606();
                for (int var223 = 0; var223 < class33.field761; var223++) {
                    int var224 = class33.field770[var223];
                    if ((class33.field756[var224] & 0x1) != 0) {
                        if (var216 > 0) {
                            var216--;
                            class33.field756[var224] = (byte) (class33.field756[var224] | 0x2);
                        } else {
                            int var225 = var214.method2607(1);
                            if (var225 == 0) {
                                var216 = Statics.method1099(var214);
                                class33.field756[var224] = (byte) (class33.field756[var224] | 0x2);
                            } else if (class33.method2597(var214, var224)) {
                                class33.field756[var224] = (byte) (class33.field756[var224] | 0x2);
                            }
                        }
                    }
                }
                var214.method2622();
                if (var216 != 0) {
                    throw new RuntimeException();
                }
                var214.method2606();
                for (int var226 = 0; var226 < class33.field761; var226++) {
                    int var227 = class33.field770[var226];
                    if ((class33.field756[var227] & 0x1) == 0) {
                        if (var216 > 0) {
                            var216--;
                            class33.field756[var227] = (byte) (class33.field756[var227] | 0x2);
                        } else {
                            int var228 = var214.method2607(1);
                            if (var228 == 0) {
                                var216 = Statics.method1099(var214);
                                class33.field756[var227] = (byte) (class33.field756[var227] | 0x2);
                            } else if (class33.method2597(var214, var227)) {
                                class33.field756[var227] = (byte) (class33.field756[var227] | 0x2);
                            }
                        }
                    }
                }
                var214.method2622();
                if (var216 != 0) {
                    throw new RuntimeException();
                }
                class33.field754 = 0;
                class33.field761 = 0;
                for (int var229 = 1; var229 < 2048; var229++) {
                    class33.field756[var229] = (byte) (class33.field756[var229] >> 1);
                    class3 var230 = field303[var229];
                    if (var230 == null) {
                        class33.field770[++class33.field761 - 1] = var229;
                    } else {
                        class33.field762[++class33.field754 - 1] = var229;
                    }
                }
                for (int var231 = 0; var231 < class33.field766; var231++) {
                    int var232 = class33.field769[var231];
                    class3 var233 = field303[var232];
                    int var234 = var214.method2385();
                    if ((var234 & 0x8) != 0) {
                        var234 += var214.method2385() << 8;
                    }
                    class33.method2183(var214, var232, var233, var234);
                }
                if (var214.field1999 - var215 != var213) {
                    throw new RuntimeException(var214.field1999 - var215 + " " + var213);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 171) {
                int var235 = field336.method2526();
                class16 var236 = (class16) class16.field230.method3555((long) var235);
                if (var236 != null) {
                    var236.method3679();
                }
                field476[++field477 - 1 & 0x1F] = var235 & 0x7FFF;
                field326 = -1;
                return true;
            }
            if (field326 == 81) {
                while (field336.field1999 < field420) {
                    int var237 = field336.method2385();
                    boolean var238 = (var237 & 0x1) == 1;
                    String var239 = field336.method2499();
                    String var240 = field336.method2499();
                    field336.method2499();
                    for (int var241 = 0; var241 < field560; var241++) {
                        class8 var242 = field561[var241];
                        if (var238) {
                            if (var240.equals(var242.field135)) {
                                var242.field135 = var239;
                                var242.field138 = var240;
                                var239 = null;
                                break;
                            }
                        } else if (var239.equals(var242.field135)) {
                            var242.field135 = var239;
                            var242.field138 = var240;
                            var239 = null;
                            break;
                        }
                    }
                    if (var239 != null && field560 < 400) {
                        class8 var243 = new class8();
                        field561[field560] = var243;
                        var243.field135 = var239;
                        var243.field138 = var240;
                        field560++;
                    }
                }
                field481 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 3) {
                int var244 = field336.method2419();
                if (var244 == 65535) {
                    var244 = -1;
                }
                if (var244 == -1 && !field527) {
                    class184.method780();
                } else if (var244 != -1 && field316 != var244 && field525 != 0 && !field527) {
                    class169 var245 = Statics.field262;
                    int var246 = field525;
                    class184.field2954 = 1;
                    Statics.field583 = var245;
                    Statics.field590 = var244;
                    Statics.field3146 = 0;
                    Statics.field2957 = var246;
                    Statics.field584 = false;
                    Statics.field2958 = 2;
                }
                field316 = var244;
                field326 = -1;
                return true;
            }
            if (field326 == 167) {
                int var247 = field336.method2389();
                int var248 = field336.method2419();
                if (var248 == 65535) {
                    var248 = -1;
                }
                if (field525 != 0 && var248 != -1) {
                    class184.method2099(Statics.field2258, var248, 0, field525, false);
                    field527 = true;
                }
                field326 = -1;
                return true;
            }
            if (field326 == 178) {
                int var249 = field336.method2429();
                class174 var250 = class174.method2958(var249);
                for (int var251 = 0; var251 < var250.field2890.length; var251++) {
                    var250.field2890[var251] = -1;
                    var250.field2890[var251] = 0;
                }
                method791(var250);
                field326 = -1;
                return true;
            }
            if (field326 == 74) {
                int var252 = field336.method2527();
                int var253 = field336.method2387();
                if (var252 < -70000) {
                    var253 += 32768;
                }
                class174 var254;
                if (var252 >= 0) {
                    var254 = class174.method2958(var252);
                } else {
                    var254 = null;
                }
                if (var254 != null) {
                    for (int var255 = 0; var255 < var254.field2890.length; var255++) {
                        var254.field2890[var255] = 0;
                        var254.field2751[var255] = 0;
                    }
                }
                class16 var256 = (class16) class16.field230.method3555((long) var253);
                if (var256 != null) {
                    for (int var257 = 0; var257 < var256.field222.length; var257++) {
                        var256.field222[var257] = -1;
                        var256.field224[var257] = 0;
                    }
                }
                int var258 = field336.method2387();
                for (int var259 = 0; var259 < var258; var259++) {
                    int var260 = field336.method2526();
                    int var261 = field336.method2410();
                    if (var261 == 255) {
                        var261 = field336.method2429();
                    }
                    if (var254 != null && var259 < var254.field2890.length) {
                        var254.field2890[var259] = var260;
                        var254.field2751[var259] = var261;
                    }
                    class16.method670(var253, var259, var260 - 1, var261);
                }
                if (var254 != null) {
                    method791(var254);
                }
                method2674();
                field476[++field477 - 1 & 0x1F] = var253 & 0x7FFF;
                field326 = -1;
                return true;
            }
            if (field326 == 8) {
                int var262 = field336.method2527();
                int var263 = field336.method2527();
                int var264 = field336.method2387();
                if (var264 == 65535) {
                    var264 = -1;
                }
                int var265 = field336.method2419();
                if (var265 == 65535) {
                    var265 = -1;
                }
                for (int var266 = var264; var266 <= var265; var266++) {
                    long var267 = ((long) var262 << 32) + (long) var266;
                    class209 var269 = field490.method3555(var267);
                    if (var269 != null) {
                        var269.method3679();
                    }
                    field490.method3559(new class202(var263), var267);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 47) {
                int var270 = field336.method2419();
                byte var271 = field336.method2369();
                class177.field2904[var270] = var271;
                if (class177.field2906[var270] != var271) {
                    class177.field2906[var270] = var271;
                }
                method608(var270);
                field409[++field291 - 1 & 0x1F] = var270;
                field326 = -1;
                return true;
            }
            if (field326 == 241) {
                int var272 = field336.method2385();
                int var273 = field336.method2385();
                int var274 = field336.method2385();
                int var275 = field336.method2385();
                field526[var272] = true;
                field539[var272] = var273;
                field540[var272] = var274;
                field541[var272] = var275;
                field542[var272] = 0;
                field326 = -1;
                return true;
            }
            if (field326 == 126) {
                String var276 = field336.method2499();
                Object[] var277 = new Object[var276.length() + 1];
                for (int var278 = var276.length() - 1; var278 >= 0; var278--) {
                    if (var276.charAt(var278) == 's') {
                        var277[var278 + 1] = field336.method2499();
                    } else {
                        var277[var278 + 1] = Integer.valueOf(field336.method2527());
                    }
                }
                var277[0] = Integer.valueOf(field336.method2527());
                class1 var279 = new class1();
                var279.field1 = var277;
                class37.method722(var279, 200000);
                field326 = -1;
                return true;
            }
            if (field326 == 135) {
                field458 = field336.method2385();
                if (field458 == 1) {
                    field312 = field336.method2387();
                }
                if (field458 >= 2 && field458 <= 6) {
                    if (field458 == 2) {
                        field317 = 64;
                        field318 = 64;
                    }
                    if (field458 == 3) {
                        field317 = 0;
                        field318 = 64;
                    }
                    if (field458 == 4) {
                        field317 = 128;
                        field318 = 64;
                    }
                    if (field458 == 5) {
                        field317 = 64;
                        field318 = 0;
                    }
                    if (field458 == 6) {
                        field317 = 64;
                        field318 = 128;
                    }
                    field458 = 2;
                    field314 = field336.method2387();
                    field315 = field336.method2387();
                    field441 = field336.method2385();
                }
                if (field458 == 10) {
                    field361 = field336.method2387();
                }
                field326 = -1;
                return true;
            }
            if (field326 == 99) {
                int var280 = field336.method2561();
                Statics.field3000 = Statics.field137.method2744(var280);
                field326 = -1;
                return true;
            }
            if (field326 == 44) {
                Statics.field1772 = field336.method2412();
                Statics.field189 = field336.method2410();
                while (field336.field1999 < field420) {
                    field326 = field336.method2385();
                    Statics.method9();
                }
                field326 = -1;
                return true;
            }
            if (field326 == 162) {
                int var281 = field336.method2527();
                boolean var282 = field336.method2410() == 1;
                class174 var283 = class174.method2958(var281);
                if (var283.field2775 != var282) {
                    var283.field2775 = var282;
                    method791(var283);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 166) {
                int var284 = field336.method2387();
                int var285 = field336.method2428();
                int var286 = field336.method2427();
                class174 var287 = class174.method2958(var286);
                var287.field2811 = (var285 << 16) + var284;
                field326 = -1;
                return true;
            }
            if (field326 == 95) {
                int var288 = field336.method2527();
                int var289 = field336.method2526();
                class177.field2904[var289] = var288;
                if (class177.field2906[var289] != var288) {
                    class177.field2906[var289] = var288;
                }
                method608(var289);
                field409[++field291 - 1 & 0x1F] = var289;
                field326 = -1;
                return true;
            }
            if (field326 == 221) {
                int var290 = field336.method2398();
                boolean var291 = field336.method2385() == 1;
                String var292 = "";
                boolean var293 = false;
                if (var291) {
                    var292 = field336.method2499();
                    if (method44(var292)) {
                        var293 = true;
                    }
                }
                String var294 = field336.method2499();
                if (!var293) {
                    class12.method1120(var290, var292, var294);
                }
                field326 = -1;
                return true;
            }
            if (field326 == 200) {
                String var295 = field336.method2499();
                long var296 = field336.method2391();
                long var298 = (long) field336.method2387();
                long var300 = (long) field336.method2389();
                class153 var302 = (class153) class110.method170(class153.method132(), field336.method2385());
                long var303 = (var298 << 32) + var300;
                boolean var305 = false;
                for (int var306 = 0; var306 < 100; var306++) {
                    if (field509[var306] == var303) {
                        var305 = true;
                        break;
                    }
                }
                if (var302.field2263 && method44(var295)) {
                    var305 = true;
                }
                if (!var305 && field410 == 0) {
                    field509[field510] = var303;
                    field510 = (field510 + 1) % 100;
                    class123 var307 = field336;
                    String var308 = class223.method3267(var307, 32767);
                    String var309 = class224.method3802(class164.method178(var308));
                    if (var302.field2261 == -1) {
                        class12.method2626(9, var295, var309, class163.method867(var296));
                    } else {
                        int var310 = var302.field2261;
                        String var311 = "<img=" + var310 + ">";
                        class12.method2626(9, var311 + var295, var309, class163.method867(var296));
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 10) {
                int var312 = field336.method2387();
                int var313 = field336.method2385();
                int var314 = field336.method2387();
                method1994(var312, var313, var314);
                field326 = -1;
                return true;
            }
            if (field326 == 31) {
                method2674();
                field453 = field336.method2385();
                field528 = field564;
                field326 = -1;
                return true;
            }
            if (field326 == 92) {
                int var315 = field336.method2527();
                int var316 = field336.method2387();
                int var317 = field336.method2412();
                class4 var318 = (class4) field449.method3555((long) var315);
                if (var318 != null) {
                    method621(var318, var318.field65 != var316);
                }
                Statics.method4(var315, var316, var317);
                field326 = -1;
                return true;
            }
            if (field326 == 71) {
                field506 = field336.method2385();
                field507 = field336.method2385();
                field326 = -1;
                return true;
            }
            if (field326 == 140) {
                field537 = true;
                Statics.field2092 = field336.method2385();
                Statics.field1051 = field336.method2385();
                Statics.field2129 = field336.method2387();
                Statics.field2290 = field336.method2385();
                Statics.field1559 = field336.method2385();
                if (Statics.field1559 >= 100) {
                    int var319 = Statics.field2092 * 128 + 64;
                    int var320 = Statics.field1051 * 128 + 64;
                    int var321 = method1545(var319, var320, Statics.field213) - Statics.field2129;
                    int var322 = var319 - Statics.field3161;
                    int var323 = var321 - Statics.field28;
                    int var324 = var320 - Statics.field666;
                    int var325 = (int) Math.sqrt((double) (var322 * var322 + var324 * var324));
                    Statics.field2083 = (int) (Math.atan2((double) var323, (double) var325) * 325.949D) & 0x7FF;
                    Statics.field1019 = (int) (Math.atan2((double) var322, (double) var324) * -325.949D) & 0x7FF;
                    if (Statics.field2083 < 128) {
                        Statics.field2083 = 128;
                    }
                    if (Statics.field2083 > 383) {
                        Statics.field2083 = 383;
                    }
                }
                field326 = -1;
                return true;
            }
            if (field326 == 189) {
                int var326 = field336.method2527();
                int var327 = field336.method2387();
                if (var326 < -70000) {
                    var327 += 32768;
                }
                class174 var328;
                if (var326 >= 0) {
                    var328 = class174.method2958(var326);
                } else {
                    var328 = null;
                }
                while (field336.field1999 < field420) {
                    int var329 = field336.method2398();
                    int var330 = field336.method2387();
                    int var331 = 0;
                    if (var330 != 0) {
                        var331 = field336.method2385();
                        if (var331 == 255) {
                            var331 = field336.method2527();
                        }
                    }
                    if (var328 != null && var329 >= 0 && var329 < var328.field2890.length) {
                        var328.field2890[var329] = var330;
                        var328.field2751[var329] = var331;
                    }
                    class16.method670(var327, var329, var330 - 1, var331);
                }
                if (var328 != null) {
                    method791(var328);
                }
                method2674();
                field476[++field477 - 1 & 0x1F] = var327 & 0x7FFF;
                field326 = -1;
                return true;
            }
            if (field326 == 30) {
                int var332 = field336.method2385();
                String var333 = field336.method2499();
                int var334 = field336.method2410();
                if (var332 >= 1 && var332 <= 8) {
                    if (var333.equalsIgnoreCase("null")) {
                        var333 = null;
                    }
                    field417[var332 - 1] = var333;
                    field377[var332 - 1] = var334 == 0;
                }
                field326 = -1;
                return true;
            }
            class149.method957("" + field326 + class2.field20 + field484 + class2.field20 + field418 + class2.field20 + field420, (Throwable) null);
            method72();
        } catch (IOException var341) {
            if (field344 > 0) {
                method72();
            } else {
                method153(40);
                Statics.field159 = Statics.field2743;
                Statics.field2743 = null;
            }
        } catch (Exception var342) {
            String var337 = "" + field326 + class2.field20 + field484 + class2.field20 + field418 + class2.field20 + field420 + class2.field20 + (Statics.field2735 + Statics.field226.field876[0]) + class2.field20 + (Statics.field577 + Statics.field226.field877[0]) + class2.field20;
            for (int var338 = 0; var338 < field420 && var338 < 50; var338++) {
                var337 = var337 + field336.field2001[var338] + class2.field20;
            }
            class149.method957(var337, var342);
            method72();
        }
        return true;
    }

    @ObfuscatedName("c.by(IIIIIIIIIB)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field422.method3585(); var10 != null; var10 = (class17) field422.method3590()) {
            if (var10.field242 == arg0 && var10.field234 == arg1 && var10.field232 == arg2 && var10.field243 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field242 = arg0;
            var9.field243 = arg3;
            var9.field234 = arg1;
            var9.field232 = arg2;
            method619(var9);
            field422.method3610(var9);
        }
        var9.field239 = arg4;
        var9.field241 = arg5;
        var9.field238 = arg6;
        var9.field233 = arg7;
        var9.field240 = arg8;
    }

    @ObfuscatedName("ec.bk(B)V")
    public static final void method2946() {
        for (class17 var0 = (class17) field422.method3585(); var0 != null; var0 = (class17) field422.method3590()) {
            if (var0.field240 == -1) {
                var0.field233 = 0;
                method619(var0);
            } else {
                var0.method3679();
            }
        }
    }

    @ObfuscatedName("a.bm(Le;I)V")
    public static final void method619(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field243 == 0) {
            var1 = Statics.field2057.method1856(arg0.field242, arg0.field234, arg0.field232);
        }
        if (arg0.field243 == 1) {
            var1 = Statics.field2057.method1845(arg0.field242, arg0.field234, arg0.field232);
        }
        if (arg0.field243 == 2) {
            var1 = Statics.field2057.method1966(arg0.field242, arg0.field234, arg0.field232);
        }
        if (arg0.field243 == 3) {
            var1 = Statics.field2057.method1834(arg0.field242, arg0.field234, arg0.field232);
        }
        if (var1 != 0) {
            int var5 = Statics.field2057.method1949(arg0.field242, arg0.field234, arg0.field232, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field236 = var2;
        arg0.field245 = var3;
        arg0.field237 = var4;
    }

    @ObfuscatedName("az.be(I)V")
    public static final void method761() {
        for (class17 var0 = (class17) field422.method3585(); var0 != null; var0 = (class17) field422.method3590()) {
            if (var0.field240 > 0) {
                var0.field240--;
            }
            if (var0.field240 == 0) {
                if (var0.field236 >= 0) {
                    int var1 = var0.field236;
                    int var2 = var0.field245;
                    class41 var3 = class41.method2950(var1);
                    if (var2 == 11) {
                        var2 = 10;
                    }
                    if (var2 >= 5 && var2 <= 8) {
                        var2 = 4;
                    }
                    boolean var4 = var3.method847(var2);
                    if (!var4) {
                        continue;
                    }
                }
                method1992(var0.field242, var0.field243, var0.field234, var0.field232, var0.field236, var0.field237, var0.field245);
                var0.method3679();
            } else {
                if (var0.field233 > 0) {
                    var0.field233--;
                }
                if (var0.field233 == 0 && var0.field234 >= 1 && var0.field232 >= 1 && var0.field234 <= 102 && var0.field232 <= 102) {
                    if (var0.field239 >= 0) {
                        int var5 = var0.field239;
                        int var6 = var0.field241;
                        class41 var7 = class41.method2950(var5);
                        if (var6 == 11) {
                            var6 = 10;
                        }
                        if (var6 >= 5 && var6 <= 8) {
                            var6 = 4;
                        }
                        boolean var8 = var7.method847(var6);
                        if (!var8) {
                            continue;
                        }
                    }
                    method1992(var0.field242, var0.field243, var0.field234, var0.field232, var0.field239, var0.field238, var0.field241);
                    var0.field233 = -1;
                    if (var0.field239 == var0.field236 && var0.field236 == -1) {
                        var0.method3679();
                    } else if (var0.field239 == var0.field236 && var0.field238 == var0.field237 && var0.field245 == var0.field241) {
                        var0.method3679();
                    }
                }
            }
        }
    }

    @ObfuscatedName("cg.bg(IIIIIIIS)V")
    public static final void method1992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field297 && Statics.field213 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field2057.method1856(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field2057.method1845(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field2057.method1966(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field2057.method1834(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field2057.method1949(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field2057.method1847(arg0, arg2, arg3);
                class41 var15 = class41.method2950(var12);
                if (var15.field954 != 0) {
                    field351[arg0].method2282(arg2, arg3, var13, var14, var15.field955);
                }
            }
            if (arg1 == 1) {
                Statics.field2057.method1848(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field2057.method1849(arg0, arg2, arg3);
                class41 var16 = class41.method2950(var12);
                if (var16.field946 + arg2 > 103 || var16.field946 + arg3 > 103 || var16.field938 + arg2 > 103 || var16.field938 + arg3 > 103) {
                    return;
                }
                if (var16.field954 != 0) {
                    field351[arg0].method2291(arg2, arg3, var16.field946, var16.field938, var14, var16.field955);
                }
            }
            if (arg1 == 3) {
                Statics.field2057.method1833(arg0, arg2, arg3);
                class41 var17 = class41.method2950(var12);
                if (var17.field954 == 1) {
                    field351[arg0].method2275(arg2, arg3);
                }
            }
        }
        if (arg4 < 0) {
            return;
        }
        int var18 = arg0;
        if (arg0 < 3 && (class6.field83[1][arg2][arg3] & 0x2) == 2) {
            var18 = arg0 + 1;
        }
        class6.method1009(arg0, var18, arg2, arg3, arg4, arg5, arg6, Statics.field2057, field351[arg0]);
    }

    @ObfuscatedName("fy.bw(IIB)V")
    public static final void method2979(int arg0, int arg1) {
        class200 var2 = field573[Statics.field213][arg0][arg1];
        if (var2 == null) {
            Statics.field2057.method1851(Statics.field213, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3585(); var6 != null; var6 = (class29) var2.method3590()) {
            class52 var7 = class52.method2827(var6.field683);
            long var8 = (long) var7.field1135;
            if (var7.field1152 == 1) {
                var8 = (long) (var6.field682 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field2057.method1851(Statics.field213, arg0, arg1);
            return;
        }
        var2.method3584(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3585(); var12 != null; var12 = (class29) var2.method3590()) {
            if (var5.field683 != var12.field683) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field683 != var12.field683 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field2057.method1837(Statics.field213, arg0, arg1, method1545(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field213), var5, var13, var10, var11);
    }

    @ObfuscatedName("ei.bl(ZI)V")
    public static final void method2756(boolean arg0) {
        field325 = 0;
        field332 = 0;
        field336.method2606();
        int var1 = field336.method2607(8);
        if (var1 < field495) {
            for (int var2 = var1; var2 < field495; var2++) {
                field415[++field325 - 1] = field331[var2];
            }
        }
        if (var1 > field495) {
            throw new RuntimeException("");
        }
        field495 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field331[var3];
            class35 var5 = field329[var4];
            int var6 = field336.method2607(1);
            if (var6 == 0) {
                field331[++field495 - 1] = var4;
                var5.field868 = field302;
            } else {
                int var7 = field336.method2607(2);
                if (var7 == 0) {
                    field331[++field495 - 1] = var4;
                    var5.field868 = field302;
                    field289[++field332 - 1] = var4;
                } else if (var7 == 1) {
                    field331[++field495 - 1] = var4;
                    var5.field868 = field302;
                    int var8 = field336.method2607(3);
                    var5.method737(var8, (byte) 1);
                    int var9 = field336.method2607(1);
                    if (var9 == 1) {
                        field289[++field332 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field331[++field495 - 1] = var4;
                    var5.field868 = field302;
                    int var10 = field336.method2607(3);
                    var5.method737(var10, (byte) 2);
                    int var11 = field336.method2607(3);
                    var5.method737(var11, (byte) 2);
                    int var12 = field336.method2607(1);
                    if (var12 == 1) {
                        field289[++field332 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field415[++field325 - 1] = var4;
                }
            }
        }
        while (field336.method2610(field420) >= 27) {
            int var13 = field336.method2607(15);
            if (var13 == 32767) {
                break;
            }
            boolean var33 = false;
            if (field329[var13] == null) {
                field329[var13] = new class35();
                var33 = true;
            }
            class35 var34 = field329[var13];
            field331[++field495 - 1] = var13;
            var34.field868 = field302;
            int var35;
            if (arg0) {
                var35 = field336.method2607(8);
                if (var35 > 127) {
                    var35 -= 256;
                }
            } else {
                var35 = field336.method2607(5);
                if (var35 > 15) {
                    var35 -= 32;
                }
            }
            int var36 = field419[field336.method2607(3)];
            if (var33) {
                var34.field872 = var34.field884 = var36;
            }
            int var37;
            if (arg0) {
                var37 = field336.method2607(8);
                if (var37 > 127) {
                    var37 -= 256;
                }
            } else {
                var37 = field336.method2607(5);
                if (var37 > 15) {
                    var37 -= 32;
                }
            }
            var34.field783 = class40.method3193(field336.method2607(14));
            int var38 = field336.method2607(1);
            int var39 = field336.method2607(1);
            if (var39 == 1) {
                field289[++field332 - 1] = var13;
            }
            var34.field826 = var34.field783.field908;
            var34.field874 = var34.field783.field923;
            if (var34.field874 == 0) {
                var34.field884 = 0;
            }
            var34.field830 = var34.field783.field914;
            var34.field831 = var34.field783.field907;
            var34.field832 = var34.field783.field928;
            var34.field833 = var34.field783.field909;
            var34.field827 = var34.field783.field903;
            var34.field828 = var34.field783.field904;
            var34.field846 = var34.field783.field930;
            var34.method736(Statics.field226.field876[0] + var37, Statics.field226.field877[0] + var35, var38 == 1);
        }
        field336.method2622();
        for (int var14 = 0; var14 < field332; var14++) {
            int var15 = field289[var14];
            class35 var16 = field329[var15];
            int var17 = field336.method2385();
            if ((var17 & 0x10) != 0) {
                var16.field783 = class40.method3193(field336.method2526());
                var16.field826 = var16.field783.field908;
                var16.field874 = var16.field783.field923;
                var16.field830 = var16.field783.field914;
                var16.field831 = var16.field783.field907;
                var16.field832 = var16.field783.field928;
                var16.field833 = var16.field783.field909;
                var16.field827 = var16.field783.field903;
                var16.field828 = var16.field783.field904;
                var16.field846 = var16.field783.field930;
            }
            if ((var17 & 0x4) != 0) {
                var16.field847 = field336.method2419();
                if (var16.field847 == 65535) {
                    var16.field847 = -1;
                }
            }
            if ((var17 & 0x40) != 0) {
                var16.field858 = field336.method2387();
                int var18 = field336.method2527();
                var16.field843 = var18 >> 16;
                var16.field861 = (var18 & 0xFFFF) + field302;
                var16.field822 = 0;
                var16.field860 = 0;
                if (var16.field861 > field302) {
                    var16.field822 = -1;
                }
                if (var16.field858 == 65535) {
                    var16.field858 = -1;
                }
            }
            if ((var17 & 0x20) != 0) {
                int var19 = field336.method2428();
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var20 = field336.method2410();
                if (var16.field823 == var19 && var19 != -1) {
                    int var21 = class43.method745(var19).field1016;
                    if (var21 == 1) {
                        var16.field854 = 0;
                        var16.field855 = 0;
                        var16.field856 = var20;
                        var16.field857 = 0;
                    }
                    if (var21 == 2) {
                        var16.field857 = 0;
                    }
                } else if (var19 == -1 || var16.field823 == -1 || class43.method745(var19).field1010 >= class43.method745(var16.field823).field1010) {
                    var16.field823 = var19;
                    var16.field854 = 0;
                    var16.field855 = 0;
                    var16.field856 = var20;
                    var16.field857 = 0;
                    var16.field880 = var16.field875;
                }
            }
            if ((var17 & 0x80) != 0) {
                int var22 = field336.method2410();
                int var23 = field336.method2411();
                var16.method779(var22, var23, field302);
                var16.field844 = field302 + 300;
                var16.field862 = field336.method2419();
                var16.field835 = field336.method2428();
            }
            if ((var17 & 0x1) != 0) {
                int var24 = field336.method2411();
                int var25 = field336.method2411();
                var16.method779(var24, var25, field302);
                var16.field844 = field302 + 300;
                var16.field862 = field336.method2428();
                var16.field835 = field336.method2526();
            }
            if ((var17 & 0x2) != 0) {
                var16.field825 = field336.method2499();
                var16.field883 = 100;
            }
            if ((var17 & 0x8) != 0) {
                int var26 = field336.method2526();
                int var27 = field336.method2419();
                int var28 = var16.field838 - (var26 - Statics.field2735 - Statics.field2735) * 64;
                int var29 = var16.field881 - (var27 - Statics.field577 - Statics.field577) * 64;
                if (var28 != 0 || var29 != 0) {
                    var16.field849 = (int) (Math.atan2((double) var28, (double) var29) * 325.949D) & 0x7FF;
                }
            }
        }
        for (int var30 = 0; var30 < field325; var30++) {
            int var31 = field415[var30];
            if (field302 != field329[var31].field868) {
                field329[var31].field783 = null;
                field329[var31] = null;
            }
        }
        if (field420 != field336.field1999) {
            throw new RuntimeException(field336.field1999 + class2.field20 + field420);
        }
        for (int var32 = 0; var32 < field495; var32++) {
            if (field329[field331[var32]] == null) {
                throw new RuntimeException(var32 + class2.field20 + field495);
            }
        }
    }

    @ObfuscatedName("as.bt(Lx;IIBB)V")
    public static final void method733(class3 arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0.field876[0];
        int var5 = arg0.field877[0];
        int var6 = arg0.method17();
        if (var4 < var6 || var4 >= 104 - var6 || var5 < var6 || var5 >= 104 - var6 || arg1 < var6 || arg1 >= 104 - var6 || arg2 < var6 || arg2 >= 104 - var6) {
            return;
        }
        int var7 = class107.method1271(var4, var5, arg0.method17(), method687(arg1, arg2), field351[arg0.field36], true, field322, field570);
        if (var7 >= 1) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg0.method31(field322[var8], field570[var8], arg3);
            }
        }
    }

    @ObfuscatedName("ao.bv(III)Ldq;")
    public static class108 method687(int arg0, int arg1) {
        field568.field1887 = arg0;
        field568.field1882 = arg1;
        field568.field1886 = 1;
        field568.field1884 = 1;
        return field568;
    }

    @ObfuscatedName("p.bb(I)V")
    public static final void method171() {
        int var0 = Statics.field882;
        int var1 = Statics.field285;
        int var2 = Statics.field932;
        int var3 = Statics.field775;
        int var4 = 6116423;
        class80.method1728(var0, var1, var2, var3, var4);
        class80.method1728(var0 + 1, var1 + 1, var2 - 2, 16, 0);
        class80.method1734(var0 + 1, var1 + 18, var2 - 2, var3 - 19, 0);
        Statics.field759.method3799(class158.field2458, var0 + 3, var1 + 14, var4, -1);
        int var5 = class141.field2147;
        int var6 = class141.field2152;
        for (int var7 = 0; var7 < field430; var7++) {
            int var8 = (field430 - 1 - var7) * 15 + var1 + 31;
            int var9 = 16777215;
            if (var5 > var0 && var5 < var0 + var2 && var6 > var8 - 13 && var6 < var8 + 3) {
                var9 = 16776960;
            }
            class225 var10 = Statics.field759;
            String var11;
            if (field436[var7].length() > 0) {
                var11 = field460[var7] + class158.field2465 + field436[var7];
            } else {
                var11 = field460[var7];
            }
            var10.method3799(var11, var0 + 3, var8, var9, 0);
        }
        int var12 = Statics.field882;
        int var13 = Statics.field285;
        int var14 = Statics.field932;
        int var15 = Statics.field775;
        for (int var16 = 0; var16 < field491; var16++) {
            if (field498[var16] + field496[var16] > var12 && field496[var16] < var12 + var14 && field499[var16] + field497[var16] > var13 && field497[var16] < var13 + var15) {
                field494[var16] = true;
            }
        }
    }

    @ObfuscatedName("ag.bz(IIIIB)V")
    public static final void method665(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field491; var4++) {
            if (field498[var4] + field496[var4] > arg0 && field496[var4] < arg0 + arg2 && field499[var4] + field497[var4] > arg1 && field497[var4] < arg1 + arg3) {
                field517[var4] = true;
            }
        }
    }

    @ObfuscatedName("bq.bd(I)V")
    public static final void method1240() {
        boolean var0 = false;
        while (!var0) {
            var0 = true;
            for (int var1 = 0; var1 < field430 - 1; var1++) {
                if (field330[var1] < 1000 && field330[var1 + 1] > 1000) {
                    String var2 = field436[var1];
                    field436[var1] = field436[var1 + 1];
                    field436[var1 + 1] = var2;
                    String var3 = field460[var1];
                    field460[var1] = field460[var1 + 1];
                    field460[var1 + 1] = var3;
                    int var4 = field330[var1];
                    field330[var1] = field330[var1 + 1];
                    field330[var1 + 1] = var4;
                    int var5 = field435[var1];
                    field435[var1] = field435[var1 + 1];
                    field435[var1 + 1] = var5;
                    int var6 = field432[var1];
                    field432[var1] = field432[var1 + 1];
                    field432[var1 + 1] = var6;
                    int var7 = field434[var1];
                    field434[var1] = field434[var1 + 1];
                    field434[var1 + 1] = var7;
                    var0 = false;
                }
            }
        }
        if (Statics.field2676 != null || field429 != null) {
            return;
        }
        int var20;
        int var21;
        label217: {
            int var8 = class141.field2157;
            if (field311) {
                if (var8 != 1 && (Statics.field2225 || var8 != 4)) {
                    int var9 = class141.field2147;
                    int var10 = class141.field2152;
                    if (var9 < Statics.field882 - 10 || var9 > Statics.field932 + Statics.field882 + 10 || var10 < Statics.field285 - 10 || var10 > Statics.field775 + Statics.field285 + 10) {
                        field311 = false;
                        method665(Statics.field882, Statics.field285, Statics.field932, Statics.field775);
                    }
                }
                if (var8 == 1 || !Statics.field2225 && var8 == 4) {
                    int var11 = Statics.field882;
                    int var12 = Statics.field285;
                    int var13 = Statics.field932;
                    int var14 = class141.field2162;
                    int var15 = class141.field2159;
                    int var16 = -1;
                    for (int var17 = 0; var17 < field430; var17++) {
                        int var18 = (field430 - 1 - var17) * 15 + var12 + 31;
                        if (var14 > var11 && var14 < var11 + var13 && var15 > var18 - 13 && var15 < var18 + 3) {
                            var16 = var17;
                        }
                    }
                    if (var16 != -1) {
                        method154(var16);
                    }
                    field311 = false;
                    method665(Statics.field882, Statics.field285, Statics.field932, Statics.field775);
                }
            } else {
                if ((var8 == 1 || !Statics.field2225 && var8 == 4) && field430 > 0) {
                    int var19 = field330[field430 - 1];
                    if (var19 == 39 || var19 == 40 || var19 == 41 || var19 == 42 || var19 == 43 || var19 == 33 || var19 == 34 || var19 == 35 || var19 == 36 || var19 == 37 || var19 == 38 || var19 == 1005) {
                        var20 = field435[field430 - 1];
                        var21 = field432[field430 - 1];
                        class174 var22 = class174.method2958(var21);
                        if (class179.method2(method198(var22))) {
                            break label217;
                        }
                        int var23 = method198(var22);
                        boolean var24 = (var23 >> 29 & 0x1) != 0;
                        if (var24) {
                            break label217;
                        }
                    }
                }
                if ((var8 == 1 || !Statics.field2225 && var8 == 4) && (field475 == 1 && field430 > 2 || method769(field430 - 1))) {
                    var8 = 2;
                }
                if ((var8 == 1 || !Statics.field2225 && var8 == 4) && field430 > 0) {
                    method154(field430 - 1);
                }
                if (var8 == 2 && field430 > 0) {
                    method2940(class141.field2162, class141.field2159);
                }
            }
            return;
        }
        if (Statics.field2676 != null && !field408 && field475 != 1 && !method769(field430 - 1) && field430 > 0) {
            int var25 = field505;
            int var26 = field406;
            method169(Statics.field204, var25, var26);
            Statics.field204 = null;
        }
        field408 = false;
        field472 = 0;
        if (Statics.field2676 != null) {
            method791(Statics.field2676);
        }
        Statics.field2676 = class174.method2958(var21);
        field404 = var20;
        field505 = class141.field2162;
        field406 = class141.field2159;
        if (field430 > 0) {
            int var27 = field430 - 1;
            Statics.field204 = new class31();
            Statics.field204.field713 = field435[var27];
            Statics.field204.field705 = field432[var27];
            Statics.field204.field706 = field330[var27];
            Statics.field204.field704 = field434[var27];
            Statics.field204.field708 = field460[var27];
        }
        method791(Statics.field2676);
    }

    @ObfuscatedName("en.bj(IIB)V")
    public static final void method2940(int arg0, int arg1) {
        int var2 = Statics.field759.method3776(class158.field2458);
        for (int var3 = 0; var3 < field430; var3++) {
            class225 var4 = Statics.field759;
            String var5;
            if (field436[var3].length() > 0) {
                var5 = field460[var3] + class158.field2465 + field436[var3];
            } else {
                var5 = field460[var3];
            }
            int var6 = var4.method3776(var5);
            if (var6 > var2) {
                var2 = var6;
            }
        }
        var2 += 8;
        int var7 = field430 * 15 + 22;
        int var8 = arg0 - var2 / 2;
        if (var2 + var8 > Statics.field709) {
            var8 = Statics.field709 - var2;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        if (var7 + arg1 > Statics.field2275) {
            var9 = Statics.field2275 - var7;
        }
        if (var9 < 0) {
            var9 = 0;
        }
        field311 = true;
        Statics.field882 = var8;
        Statics.field285 = var9;
        Statics.field932 = var2;
        Statics.field775 = field430 * 15 + 22;
    }

    @ObfuscatedName("ai.bh(IB)Z")
    public static final boolean method769(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field330[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("k.bs(II)V")
    public static final void method154(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field435[arg0];
        int var2 = field432[arg0];
        int var3 = field330[arg0];
        int var4 = field434[arg0];
        String var5 = field460[arg0];
        String var6 = field436[arg0];
        method739(var1, var2, var3, var4, var5, var6, class141.field2162, class141.field2159);
    }

    @ObfuscatedName("p.br(Laj;III)V")
    public static final void method169(class31 arg0, int arg1, int arg2) {
        method739(arg0.field713, arg0.field705, arg0.field706, arg0.field704, arg0.field708, arg0.field708, arg1, arg2);
    }

    @ObfuscatedName("av.bu(IIIILjava/lang/String;Ljava/lang/String;IIS)V")
    public static final void method739(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 43) {
            field334.method2604(204);
            field334.method2417(arg3);
            field334.method2416(arg0);
            field334.method2426(arg1);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 22) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(71);
            field334.method2416(Statics.field577 + arg1);
            field334.method2485(class138.field2115[82] ? 1 : 0);
            field334.method2371(arg3);
            field334.method2416(Statics.field2735 + arg0);
        }
        if (arg2 == 17) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(54);
            field334.method2416(Statics.field577 + arg1);
            field334.method2426(Statics.field254);
            field334.method2417(Statics.field2735 + arg0);
            field334.method2380(class138.field2115[82] ? 1 : 0);
            field334.method2416(field444);
            field334.method2417(arg3);
        }
        if (arg2 == 40) {
            field334.method2604(77);
            field334.method2416(arg0);
            field334.method2425(arg1);
            field334.method2415(arg3);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 13) {
            class35 var8 = field329[arg3];
            if (var8 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(59);
                field334.method2380(class138.field2115[82] ? 1 : 0);
                field334.method2416(arg3);
            }
        }
        if (arg2 == 50) {
            class3 var9 = field303[arg3];
            if (var9 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(8);
                field334.method2417(arg3);
                field334.method2409(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 8) {
            class35 var10 = field329[arg3];
            if (var10 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(119);
                field334.method2370(Statics.field254);
                field334.method2416(field444);
                field334.method2415(arg3);
                field334.method2409(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 32) {
            field334.method2604(137);
            field334.method2415(field444);
            field334.method2416(arg3);
            field334.method2416(arg0);
            field334.method2370(Statics.field254);
            field334.method2370(arg1);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 51) {
            class3 var11 = field303[arg3];
            if (var11 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(158);
                field334.method2415(arg3);
                field334.method2380(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 16) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(28);
            field334.method2371(Statics.field1762);
            field334.method2380(class138.field2115[82] ? 1 : 0);
            field334.method2371(Statics.field577 + arg1);
            field334.method2417(Statics.field2735 + arg0);
            field334.method2371(Statics.field1017);
            field334.method2417(arg3);
            field334.method2370(Statics.field1957);
        }
        if (arg2 == 35) {
            field334.method2604(80);
            field334.method2424(arg1);
            field334.method2415(arg3);
            field334.method2417(arg0);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 20) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(244);
            field334.method2417(Statics.field577 + arg1);
            field334.method2415(Statics.field2735 + arg0);
            field334.method2380(class138.field2115[82] ? 1 : 0);
            field334.method2416(arg3);
        }
        if (arg2 == 46) {
            class3 var12 = field303[arg3];
            if (var12 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(188);
                field334.method2409(class138.field2115[82] ? 1 : 0);
                field334.method2416(arg3);
            }
        }
        if (arg2 == 19) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(229);
            field334.method2371(Statics.field2735 + arg0);
            field334.method2416(arg3);
            field334.method2485(class138.field2115[82] ? 1 : 0);
            field334.method2415(Statics.field577 + arg1);
        }
        if (arg2 == 4) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(108);
            field334.method2415(Statics.field577 + arg1);
            field334.method2415(arg3 >> 14 & 0x7FFF);
            field334.method2417(Statics.field2735 + arg0);
            field334.method2485(class138.field2115[82] ? 1 : 0);
        }
        if (arg2 == 9) {
            class35 var13 = field329[arg3];
            if (var13 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(181);
                field334.method2485(class138.field2115[82] ? 1 : 0);
                field334.method2416(arg3);
            }
        }
        if (arg2 == 30 && field313 == null) {
            method671(arg1, arg0);
            field313 = class174.method3194(arg1, arg0);
            method791(field313);
        }
        if (arg2 == 58) {
            class174 var14 = class174.method3194(arg1, arg0);
            if (var14 != null) {
                field334.method2604(84);
                field334.method2417(field444);
                field334.method2417(var14.field2765);
                field334.method2424(Statics.field254);
                field334.method2415(field471);
                field334.method2417(arg0);
                field334.method2425(arg1);
            }
        }
        if (arg2 == 7) {
            class35 var15 = field329[arg3];
            if (var15 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(179);
                field334.method2425(Statics.field1957);
                field334.method2415(Statics.field1762);
                field334.method2408(class138.field2115[82] ? 1 : 0);
                field334.method2415(arg3);
                field334.method2415(Statics.field1017);
            }
        }
        if (arg2 == 37) {
            field334.method2604(27);
            field334.method2424(arg1);
            field334.method2415(arg3);
            field334.method2415(arg0);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 25) {
            class174 var16 = class174.method3194(arg1, arg0);
            if (var16 != null) {
                method158();
                int var19 = method198(var16);
                int var20 = var19 >> 11 & 0x3F;
                method167(arg1, arg0, var20, var16.field2765);
                field354 = 0;
                int var21 = method198(var16);
                int var22 = var21 >> 11 & 0x3F;
                String var23;
                if (var22 == 0) {
                    var23 = null;
                } else if (var16.field2796 == null || var16.field2796.trim().length() == 0) {
                    var23 = null;
                } else {
                    var23 = var16.field2796;
                }
                field446 = var23;
                if (field446 == null) {
                    field446 = "Null";
                }
                if (var16.field2861) {
                    field447 = var16.field2834 + class2.method3026(16777215);
                } else {
                    field447 = class2.method3026(65280) + var16.field2871 + class2.method3026(16777215);
                }
            }
            return;
        }
        if (arg2 == 14) {
            class3 var24 = field303[arg3];
            if (var24 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(142);
                field334.method2416(Statics.field1017);
                field334.method2370(Statics.field1957);
                field334.method2417(Statics.field1762);
                field334.method2417(arg3);
                field334.method2380(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 23) {
            Statics.field2057.method1984(Statics.field213, arg0, arg1);
        }
        if (arg2 == 1004) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field334.method2604(133);
            field334.method2415(arg3);
        }
        if (arg2 == 47) {
            class3 var25 = field303[arg3];
            if (var25 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(221);
                field334.method2380(class138.field2115[82] ? 1 : 0);
                field334.method2417(arg3);
            }
        }
        if (arg2 == 10) {
            class35 var26 = field329[arg3];
            if (var26 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(226);
                field334.method2415(arg3);
                field334.method2485(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 49) {
            class3 var27 = field303[arg3];
            if (var27 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(91);
                field334.method2417(arg3);
                field334.method2408(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 11) {
            class35 var28 = field329[arg3];
            if (var28 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(155);
                field334.method2408(class138.field2115[82] ? 1 : 0);
                field334.method2371(arg3);
            }
        }
        if (arg2 == 21) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(140);
            field334.method2417(Statics.field577 + arg1);
            field334.method2415(arg3);
            field334.method2416(Statics.field2735 + arg0);
            field334.method2485(class138.field2115[82] ? 1 : 0);
        }
        if (arg2 == 48) {
            class3 var29 = field303[arg3];
            if (var29 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(233);
                field334.method2416(arg3);
                field334.method2380(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 31) {
            field334.method2604(196);
            field334.method2426(arg1);
            field334.method2425(Statics.field1957);
            field334.method2371(Statics.field1762);
            field334.method2371(arg3);
            field334.method2417(Statics.field1017);
            field334.method2416(arg0);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var30 = class174.method3194(arg1, arg0);
            if (var30 != null) {
                method2098(arg3, arg1, arg0, var30.field2765, arg5);
            }
        }
        if (arg2 == 28) {
            field334.method2604(141);
            field334.method2370(arg1);
            class174 var31 = class174.method2958(arg1);
            if (var31.field2867 != null && var31.field2867[0][0] == 5) {
                int var32 = var31.field2867[0][1];
                class177.field2906[var32] = 1 - class177.field2906[var32];
                method608(var32);
            }
        }
        if (arg2 == 38) {
            method158();
            class174 var33 = class174.method2958(arg1);
            field354 = 1;
            Statics.field1017 = arg0;
            Statics.field1957 = arg1;
            Statics.field1762 = arg3;
            method791(var33);
            field442 = class2.method3026(16748608) + class52.method2827(arg3).field1129 + class2.method3026(16777215);
            if (field442 == null) {
                field442 = "null";
            }
            return;
        }
        if (arg2 == 3) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(52);
            field334.method2371(Statics.field2735 + arg0);
            field334.method2371(arg3 >> 14 & 0x7FFF);
            field334.method2380(class138.field2115[82] ? 1 : 0);
            field334.method2371(Statics.field577 + arg1);
        }
        if (arg2 == 41) {
            field334.method2604(139);
            field334.method2416(arg0);
            field334.method2371(arg3);
            field334.method2425(arg1);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 15) {
            class3 var34 = field303[arg3];
            if (var34 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(248);
                field334.method2371(arg3);
                field334.method2380(class138.field2115[82] ? 1 : 0);
                field334.method2371(field444);
                field334.method2370(Statics.field254);
            }
        }
        if (arg2 == 36) {
            field334.method2604(157);
            field334.method2426(arg1);
            field334.method2417(arg3);
            field334.method2416(arg0);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 1005) {
            class174 var35 = class174.method2958(arg1);
            if (var35 == null || var35.field2751[arg0] < 100000) {
                field334.method2604(133);
                field334.method2415(arg3);
            } else {
                class12.method1120(27, "", var35.field2751[arg0] + " x " + class52.method2827(arg3).field1129);
            }
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 1002) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field334.method2604(11);
            field334.method2415(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 12) {
            class35 var36 = field329[arg3];
            if (var36 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(163);
                field334.method2416(arg3);
                field334.method2485(class138.field2115[82] ? 1 : 0);
            }
        }
        if (arg2 == 2) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(33);
            field334.method2426(Statics.field254);
            field334.method2417(arg3 >> 14 & 0x7FFF);
            field334.method2416(Statics.field577 + arg1);
            field334.method2371(Statics.field2735 + arg0);
            field334.method2409(class138.field2115[82] ? 1 : 0);
            field334.method2415(field444);
        }
        if (arg2 == 5) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(186);
            field334.method2415(arg3 >> 14 & 0x7FFF);
            field334.method2408(class138.field2115[82] ? 1 : 0);
            field334.method2417(Statics.field2735 + arg0);
            field334.method2371(Statics.field577 + arg1);
        }
        if (arg2 == 24) {
            class174 var37 = class174.method2958(arg1);
            boolean var38 = true;
            if (var37.field2759 > 0) {
                var38 = method147(var37);
            }
            if (var38) {
                field334.method2604(141);
                field334.method2370(arg1);
            }
        }
        if (arg2 == 34) {
            field334.method2604(224);
            field334.method2426(arg1);
            field334.method2417(arg0);
            field334.method2417(arg3);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 1001) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(85);
            field334.method2408(class138.field2115[82] ? 1 : 0);
            field334.method2371(Statics.field577 + arg1);
            field334.method2416(Statics.field2735 + arg0);
            field334.method2417(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 29) {
            field334.method2604(141);
            field334.method2370(arg1);
            class174 var39 = class174.method2958(arg1);
            if (var39.field2867 != null && var39.field2867[0][0] == 5) {
                int var40 = var39.field2867[0][1];
                if (class177.field2906[var40] != var39.field2869[0]) {
                    class177.field2906[var40] = var39.field2869[0];
                    method608(var40);
                }
            }
        }
        if (arg2 == 18) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(209);
            field334.method2416(Statics.field577 + arg1);
            field334.method2415(Statics.field2735 + arg0);
            field334.method2416(arg3);
            field334.method2408(class138.field2115[82] ? 1 : 0);
        }
        if (arg2 == 39) {
            field334.method2604(230);
            field334.method2425(arg1);
            field334.method2416(arg0);
            field334.method2415(arg3);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 6) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(37);
            field334.method2417(Statics.field2735 + arg0);
            field334.method2409(class138.field2115[82] ? 1 : 0);
            field334.method2417(arg3 >> 14 & 0x7FFF);
            field334.method2415(Statics.field577 + arg1);
        }
        if (arg2 == 26) {
            method2105();
        }
        if (arg2 == 1003) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            class35 var41 = field329[arg3];
            if (var41 != null) {
                class40 var42 = var41.field783;
                if (var42.field911 != null) {
                    var42 = var42.method786();
                }
                if (var42 != null) {
                    field334.method2604(249);
                    field334.method2417(var42.field900);
                }
            }
        }
        if (arg2 == 42) {
            field334.method2604(112);
            field334.method2417(arg0);
            field334.method2415(arg3);
            field334.method2426(arg1);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 33) {
            field334.method2604(125);
            field334.method2416(arg3);
            field334.method2370(arg1);
            field334.method2415(arg0);
            field402 = 0;
            Statics.field1226 = class174.method2958(arg1);
            field403 = arg0;
        }
        if (arg2 == 1) {
            field347 = arg6;
            field399 = arg7;
            field395 = 2;
            field512 = 0;
            field483 = arg0;
            field523 = arg1;
            field334.method2604(250);
            field334.method2371(Statics.field577 + arg1);
            field334.method2416(Statics.field1017);
            field334.method2416(Statics.field1762);
            field334.method2416(arg3 >> 14 & 0x7FFF);
            field334.method2415(Statics.field2735 + arg0);
            field334.method2425(Statics.field1957);
            field334.method2408(class138.field2115[82] ? 1 : 0);
        }
        if (arg2 == 44) {
            class3 var43 = field303[arg3];
            if (var43 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(241);
                field334.method2380(class138.field2115[82] ? 1 : 0);
                field334.method2417(arg3);
            }
        }
        if (arg2 == 45) {
            class3 var44 = field303[arg3];
            if (var44 != null) {
                field347 = arg6;
                field399 = arg7;
                field395 = 2;
                field512 = 0;
                field483 = arg0;
                field523 = arg1;
                field334.method2604(143);
                field334.method2416(arg3);
                field334.method2409(class138.field2115[82] ? 1 : 0);
            }
        }
        if (field354 != 0) {
            field354 = 0;
            method791(class174.method2958(Statics.field1957));
        }
        if (field443) {
            method158();
        }
        if (Statics.field1226 != null && field402 == 0) {
            method791(Statics.field1226);
        }
    }

    @ObfuscatedName("ei.bi(ILjava/lang/String;I)V")
    public static void method2749(int arg0, String arg1) {
        int var2 = class33.field754;
        int[] var3 = class33.field762;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field303[var3[var5]];
            if (var6 != null && Statics.field226 != var6 && var6.field61 != null && var6.field61.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field334.method2604(241);
                    field334.method2380(0);
                    field334.method2417(var3[var5]);
                } else if (arg0 == 4) {
                    field334.method2604(221);
                    field334.method2380(0);
                    field334.method2417(var3[var5]);
                } else if (arg0 == 6) {
                    field334.method2604(91);
                    field334.method2417(var3[var5]);
                    field334.method2408(0);
                } else if (arg0 == 7) {
                    field334.method2604(8);
                    field334.method2417(var3[var5]);
                    field334.method2409(0);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method1120(4, "", class158.field2519 + arg1);
        }
    }

    @ObfuscatedName("q.bn(IIIIB)V")
    public static void method167(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class174.method3194(arg0, arg1);
        if (var4 != null && var4.field2846 != null) {
            class1 var5 = new class1();
            var5.field2 = var4;
            var5.field1 = var4.field2846;
            class37.method722(var5, 200000);
        }
        field471 = arg3;
        field443 = true;
        Statics.field254 = arg0;
        field444 = arg1;
        Statics.field1466 = arg2;
        method791(var4);
    }

    @ObfuscatedName("o.cr(I)V")
    public static void method158() {
        if (!field443) {
            return;
        }
        class174 var0 = class174.method3194(Statics.field254, field444);
        if (var0 != null && var0.field2847 != null) {
            class1 var1 = new class1();
            var1.field2 = var0;
            var1.field1 = var0.field2847;
            class37.method722(var1, 200000);
        }
        field443 = false;
        method791(var0);
    }

    @ObfuscatedName("ag.cl(III)V")
    public static void method671(int arg0, int arg1) {
        field334.method2604(89);
        field334.method2426(arg0);
        field334.method2371(arg1);
    }

    @ObfuscatedName("cd.ci(IIIILjava/lang/String;I)V")
    public static void method2098(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class174 var5 = class174.method3194(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2860 != null) {
            class1 var6 = new class1();
            var6.field2 = var5;
            var6.field3 = arg0;
            var6.field10 = arg4;
            var6.field1 = var5.field2860;
            class37.method722(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2759 > 0) {
            var7 = method147(var5);
        }
        if (!var7 || !class179.method3136(method198(var5), arg0 - 1)) {
            return;
        }
        if (arg0 == 1) {
            field334.method2604(121);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 2) {
            field334.method2604(5);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 3) {
            field334.method2604(175);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 4) {
            field334.method2604(23);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 5) {
            field334.method2604(42);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 6) {
            field334.method2604(202);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 7) {
            field334.method2604(69);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 8) {
            field334.method2604(174);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 9) {
            field334.method2604(210);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
        if (arg0 == 10) {
            field334.method2604(192);
            field334.method2370(arg1);
            field334.method2371(arg2);
            field334.method2371(arg3);
        }
    }

    @ObfuscatedName("ed.cz(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method2960(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field311 || field430 >= 500) {
            return;
        }
        field460[field430] = arg0;
        field436[field430] = arg1;
        field330[field430] = arg2;
        field434[field430] = arg3;
        field435[field430] = arg4;
        field432[field430] = arg5;
        field430++;
    }

    @ObfuscatedName("gs.cj(B)V")
    public static void method3515() {
        for (int var0 = 0; var0 < field430; var0++) {
            int var1 = field330[var0];
            boolean var2 = var1 == 57 || var1 == 58 || var1 == 1007 || var1 == 25 || var1 == 30;
            if (var2) {
                if (var0 < field430 - 1) {
                    for (int var3 = var0; var3 < field430 - 1; var3++) {
                        field460[var3] = field460[var3 + 1];
                        field436[var3] = field436[var3 + 1];
                        field330[var3] = field330[var3 + 1];
                        field434[var3] = field434[var3 + 1];
                        field435[var3] = field435[var3 + 1];
                        field432[var3] = field432[var3 + 1];
                    }
                }
                field430--;
            }
        }
    }

    @ObfuscatedName("r.ch(IIIII)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3) {
        if (field354 == 0 && !field443) {
            method2960(class158.field2408, "", 23, 0, arg0 - arg2, arg1 - arg3);
        }
        int var4 = -1;
        int var5 = -1;
        for (int var6 = 0; var6 < class106.field1862; var6++) {
            int var7 = class106.field1863[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 7 & 0x7F;
            int var10 = var7 >> 29 & 0x3;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                var5 = var7;
                if (var10 == 2 && Statics.field2057.method1949(Statics.field213, var8, var9, var7) >= 0) {
                    class41 var12 = class41.method2950(var11);
                    if (var12.field948 != null) {
                        var12 = var12.method823();
                    }
                    if (var12 == null) {
                        continue;
                    }
                    if (field354 == 1) {
                        method2960(class158.field2538, field442 + " " + class2.field24 + " " + class2.method3026(65535) + var12.field963, 1, var7, var8, var9);
                    } else if (!field443) {
                        String[] var13 = var12.field964;
                        if (field459) {
                            var13 = method200(var13);
                        }
                        if (var13 != null) {
                            for (int var14 = 4; var14 >= 0; var14--) {
                                if (var13[var14] != null) {
                                    short var15 = 0;
                                    if (var14 == 0) {
                                        var15 = 3;
                                    }
                                    if (var14 == 1) {
                                        var15 = 4;
                                    }
                                    if (var14 == 2) {
                                        var15 = 5;
                                    }
                                    if (var14 == 3) {
                                        var15 = 6;
                                    }
                                    if (var14 == 4) {
                                        var15 = 1001;
                                    }
                                    method2960(var13[var14], class2.method3026(65535) + var12.field963, var15, var7, var8, var9);
                                }
                            }
                        }
                        method2960(class158.field2405, class2.method3026(65535) + var12.field963, 1002, var12.field944 << 14, var8, var9);
                    } else if ((Statics.field1466 & 0x4) == 4) {
                        method2960(field446, field447 + " " + class2.field24 + " " + class2.method3026(65535) + var12.field963, 2, var7, var8, var9);
                    }
                }
                if (var10 == 1) {
                    class35 var16 = field329[var11];
                    if (var16 == null) {
                        continue;
                    }
                    if (var16.field783.field908 == 1 && (var16.field838 & 0x7F) == 64 && (var16.field881 & 0x7F) == 64) {
                        for (int var17 = 0; var17 < field495; var17++) {
                            class35 var18 = field329[field331[var17]];
                            if (var18 != null && var16 != var18 && var18.field783.field908 == 1 && var16.field838 == var18.field838 && var16.field881 == var18.field881) {
                                method1993(var18.field783, field331[var17], var8, var9);
                            }
                        }
                        int var19 = class33.field754;
                        int[] var20 = class33.field762;
                        for (int var21 = 0; var21 < var19; var21++) {
                            class3 var22 = field303[var20[var21]];
                            if (var22 != null && var16.field838 == var22.field838 && var16.field881 == var22.field881) {
                                method2263(var22, var20[var21], var8, var9);
                            }
                        }
                    }
                    method1993(var16.field783, var11, var8, var9);
                }
                if (var10 == 0) {
                    class3 var23 = field303[var11];
                    if (var23 == null) {
                        continue;
                    }
                    if ((var23.field838 & 0x7F) == 64 && (var23.field881 & 0x7F) == 64) {
                        for (int var24 = 0; var24 < field495; var24++) {
                            class35 var25 = field329[field331[var24]];
                            if (var25 != null && var25.field783.field908 == 1 && var23.field838 == var25.field838 && var23.field881 == var25.field881) {
                                method1993(var25.field783, field331[var24], var8, var9);
                            }
                        }
                        int var26 = class33.field754;
                        int[] var27 = class33.field762;
                        for (int var28 = 0; var28 < var26; var28++) {
                            class3 var29 = field303[var27[var28]];
                            if (var29 != null && var23 != var29 && var23.field838 == var29.field838 && var23.field881 == var29.field881) {
                                method2263(var29, var27[var28], var8, var9);
                            }
                        }
                    }
                    if (field465 == var11) {
                        var4 = var7;
                    } else {
                        method2263(var23, var11, var8, var9);
                    }
                }
                if (var10 == 3) {
                    class200 var30 = field573[Statics.field213][var8][var9];
                    if (var30 != null) {
                        for (class29 var31 = (class29) var30.method3589(); var31 != null; var31 = (class29) var30.method3591()) {
                            class52 var32 = class52.method2827(var31.field683);
                            if (field354 == 1) {
                                method2960(class158.field2538, field442 + " " + class2.field24 + " " + class2.method3026(16748608) + var32.field1129, 16, var31.field683, var8, var9);
                            } else if (!field443) {
                                String[] var33 = var32.field1137;
                                if (field459) {
                                    var33 = method200(var33);
                                }
                                for (int var34 = 4; var34 >= 0; var34--) {
                                    if (var33 != null && var33[var34] != null) {
                                        byte var35 = 0;
                                        if (var34 == 0) {
                                            var35 = 18;
                                        }
                                        if (var34 == 1) {
                                            var35 = 19;
                                        }
                                        if (var34 == 2) {
                                            var35 = 20;
                                        }
                                        if (var34 == 3) {
                                            var35 = 21;
                                        }
                                        if (var34 == 4) {
                                            var35 = 22;
                                        }
                                        method2960(var33[var34], class2.method3026(16748608) + var32.field1129, var35, var31.field683, var8, var9);
                                    } else if (var34 == 2) {
                                        method2960(class158.field2308, class2.method3026(16748608) + var32.field1129, 20, var31.field683, var8, var9);
                                    }
                                }
                                method2960(class158.field2405, class2.method3026(16748608) + var32.field1129, 1004, var31.field683, var8, var9);
                            } else if ((Statics.field1466 & 0x1) == 1) {
                                method2960(field446, field447 + " " + class2.field24 + " " + class2.method3026(16748608) + var32.field1129, 17, var31.field683, var8, var9);
                            }
                        }
                    }
                }
            }
        }
        if (var4 != -1) {
            int var36 = var4 & 0x7F;
            int var37 = var4 >> 7 & 0x7F;
            class3 var38 = field303[field465];
            method2263(var38, field465, var36, var37);
        }
    }

    @ObfuscatedName("cg.cx(Lah;IIII)V")
    public static final void method1993(class40 arg0, int arg1, int arg2, int arg3) {
        if (field430 >= 400) {
            return;
        }
        if (arg0.field911 != null) {
            arg0 = arg0.method786();
        }
        if (arg0 == null || !arg0.field927 || arg0.field929 && field333 != arg1) {
            return;
        }
        String var4 = arg0.field906;
        if (arg0.field931 != 0) {
            var4 = var4 + method164(arg0.field931, Statics.field226.field41) + " " + class2.field34 + class158.field2461 + arg0.field931 + class2.field23;
        }
        if (field354 == 1) {
            method2960(class158.field2538, field442 + " " + class2.field24 + " " + class2.method3026(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field443) {
            String[] var5 = arg0.field895;
            if (field459) {
                var5 = method200(var5);
            }
            if (var5 != null) {
                for (int var6 = 4; var6 >= 0; var6--) {
                    if (var5[var6] != null && !var5[var6].equalsIgnoreCase(class158.field2457)) {
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
                        method2960(var5[var6], class2.method3026(16776960) + var4, var7, arg1, arg2, arg3);
                    }
                }
            }
            if (var5 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var5[var8] != null && var5[var8].equalsIgnoreCase(class158.field2457)) {
                        short var9 = 0;
                        if (field320 != class21.field576) {
                            if (field320 == class21.field575 || field320 == class21.field574 && arg0.field931 > Statics.field226.field41) {
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
                            method2960(var5[var8], class2.method3026(16776960) + var4, var10, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method2960(class158.field2405, class2.method3026(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field1466 & 0x2) == 2) {
            method2960(field446, field447 + " " + class2.field24 + " " + class2.method3026(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("dq.cm(Lx;IIIB)V")
    public static final void method2263(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field226 == arg0 || field430 >= 400) {
            return;
        }
        String var4;
        if (arg0.field42 == 0) {
            var4 = arg0.field40[0] + arg0.field61 + arg0.field40[1] + method164(arg0.field41, Statics.field226.field41) + " " + class2.field34 + class158.field2461 + arg0.field41 + class2.field23 + arg0.field40[2];
        } else {
            var4 = arg0.field40[0] + arg0.field61 + arg0.field40[1] + " " + class2.field34 + class158.field2462 + arg0.field42 + class2.field23 + arg0.field40[2];
        }
        if (field354 == 1) {
            method2960(class158.field2538, field442 + " " + class2.field24 + " " + class2.method3026(16777215) + var4, 14, arg1, arg2, arg3);
        } else if (!field443) {
            for (int var5 = 7; var5 >= 0; var5--) {
                if (field417[var5] != null) {
                    short var6 = 0;
                    if (field417[var5].equalsIgnoreCase(class158.field2457)) {
                        if (field319 == class21.field576) {
                            continue;
                        }
                        if (field319 == class21.field575 || field319 == class21.field574 && arg0.field41 > Statics.field226.field41) {
                            var6 = 2000;
                        }
                        if (Statics.field226.field58 != 0 && arg0.field58 != 0) {
                            if (Statics.field226.field58 == arg0.field58) {
                                var6 = 2000;
                            } else {
                                var6 = 0;
                            }
                        }
                    } else if (field377[var5]) {
                        var6 = 2000;
                    }
                    boolean var7 = false;
                    int var8 = field416[var5] + var6;
                    method2960(field417[var5], class2.method3026(16777215) + var4, var8, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field1466 & 0x8) == 8) {
            method2960(field446, field447 + " " + class2.field24 + " " + class2.method3026(16777215) + var4, 15, arg1, arg2, arg3);
        }
        for (int var9 = 0; var9 < field430; var9++) {
            if (field330[var9] == 23) {
                field436[var9] = class2.method3026(16777215) + var4;
                break;
            }
        }
    }

    @ObfuscatedName("q.co(III)Ljava/lang/String;")
    public static final String method164(int arg0, int arg1) {
        int var2 = arg1 - arg0;
        if (var2 < -9) {
            return class2.method3026(16711680);
        } else if (var2 < -6) {
            return class2.method3026(16723968);
        } else if (var2 < -3) {
            return class2.method3026(16740352);
        } else if (var2 < 0) {
            return class2.method3026(16756736);
        } else if (var2 > 9) {
            return class2.method3026(65280);
        } else if (var2 > 6) {
            return class2.method3026(4259584);
        } else if (var2 > 3) {
            return class2.method3026(8453888);
        } else if (var2 > 0) {
            return class2.method3026(12648192);
        } else {
            return class2.method3026(16776960);
        }
    }

    @ObfuscatedName("cx.cg(IIIIIIIII)V")
    public static final void method1824(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method2723(arg0)) {
            Statics.field2891 = null;
            method993(Statics.field2771[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2891 != null) {
                method993(Statics.field2891, -1412584499, arg1, arg2, arg3, arg4, Statics.field595, Statics.field35, arg7);
                Statics.field2891 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field517[var8] = true;
            }
        } else {
            field517[arg7] = true;
        }
    }

    @ObfuscatedName("ae.cw([Lfw;IIIIIIIII)V")
    public static final void method993(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1722(arg2, arg3, arg4, arg5);
        class92.method2006();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2774 == arg1 || arg1 == -1412584499 && field429 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field496[field491] = var10.field2874 + arg6;
                    field497[field491] = var10.field2808 + arg7;
                    field498[field491] = var10.field2770;
                    field499[field491] = var10.field2889;
                    var11 = ++field491 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2886 = var11;
                var10.field2887 = field302;
                if (!var10.field2861 || !method104(var10)) {
                    if (var10.field2759 > 0) {
                        int var12 = var10.field2759;
                        if (var12 == 324) {
                            if (field304 == -1) {
                                field304 = var10.field2790;
                                field401 = var10.field2791;
                            }
                            if (field562.field2918) {
                                var10.field2790 = field304;
                            } else {
                                var10.field2790 = field401;
                            }
                        } else if (var12 == 325) {
                            if (field304 == -1) {
                                field304 = var10.field2790;
                                field401 = var10.field2791;
                            }
                            if (field562.field2918) {
                                var10.field2790 = field401;
                            } else {
                                var10.field2790 = field304;
                            }
                        } else if (var12 == 327) {
                            var10.field2806 = 150;
                            var10.field2807 = (int) (Math.sin((double) field302 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2798 = 5;
                            var10.field2769 = 0;
                        } else if (var12 == 328) {
                            var10.field2806 = 150;
                            var10.field2807 = (int) (Math.sin((double) field302 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2798 = 5;
                            var10.field2769 = 1;
                        }
                    }
                    int var13 = var10.field2874 + arg6;
                    int var14 = var10.field2808 + arg7;
                    int var15 = var10.field2786;
                    if (field429 == var10) {
                        if (arg1 != -1412584499 && !var10.field2833) {
                            Statics.field2891 = arg0;
                            Statics.field595 = arg6;
                            Statics.field35 = arg7;
                            continue;
                        }
                        if (field370 && field466) {
                            int var16 = class141.field2147;
                            int var17 = class141.field2152;
                            int var18 = var16 - field309;
                            int var19 = var17 - field546;
                            if (var18 < field467) {
                                var18 = field467;
                            }
                            if (var10.field2770 + var18 > field467 + field299.field2770) {
                                var18 = field467 + field299.field2770 - var10.field2770;
                            }
                            if (var19 < field468) {
                                var19 = field468;
                            }
                            if (var10.field2889 + var19 > field468 + field299.field2889) {
                                var19 = field468 + field299.field2889 - var10.field2889;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2833) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2799 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2799 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2770 + var13;
                        int var27 = var10.field2889 + var14;
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
                        int var30 = var10.field2770 + var13;
                        int var31 = var10.field2889 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2861 || var20 < var22 && var21 < var23) {
                        if (var10.field2759 != 0) {
                            if (var10.field2759 == 1336) {
                                if (field356) {
                                    var14 += 15;
                                    Statics.field815.method3838("Fps:" + field2195, var10.field2770 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field297) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field297) {
                                        var34 = 16711680;
                                    }
                                    Statics.field815.method3838("Mem:" + var33 + "k", var10.field2770 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2759 == 1337) {
                                field569 = var13;
                                field462 = var14;
                                int var37 = var10.field2770;
                                int var38 = var10.field2889;
                                field553++;
                                method3057(class34.field782);
                                boolean var39 = false;
                                if (field465 >= 0) {
                                    int var40 = class33.field754;
                                    int[] var41 = class33.field762;
                                    for (int var42 = 0; var42 < var40; var42++) {
                                        if (field465 == var41[var42]) {
                                            var39 = true;
                                            break;
                                        }
                                    }
                                }
                                if (var39) {
                                    method3057(class34.field773);
                                }
                                method1020(true);
                                method3057(var39 ? class34.field777 : class34.field774);
                                method1020(false);
                                method51();
                                method187();
                                method2967(var13, var14, var37, var38, true);
                                int var43 = field464;
                                int var44 = field552;
                                int var45 = field433;
                                int var46 = field554;
                                class80.method1722(var43, var44, var43 + var45, var44 + var46);
                                class92.method2006();
                                if (!field537) {
                                    int var47 = field374;
                                    if (field557 / 256 > var47) {
                                        var47 = field557 / 256;
                                    }
                                    if (field526[4] && field540[4] + 128 > var47) {
                                        var47 = field540[4] + 128;
                                    }
                                    int var48 = field375 + field359 & 0x7FF;
                                    method129(Statics.field102, method1545(Statics.field226.field838, Statics.field226.field881, Statics.field213) - field380, Statics.field162, var47, var48, var47 * 3 + 600);
                                }
                                int var61;
                                if (field537) {
                                    int var62;
                                    if (Statics.field581.field141) {
                                        var62 = Statics.field213;
                                    } else {
                                        int var63 = method1545(Statics.field3161, Statics.field666, Statics.field213);
                                        if (var63 - Statics.field28 >= 800 || (class6.field83[Statics.field213][Statics.field3161 >> 7][Statics.field666 >> 7] & 0x4) == 0) {
                                            var62 = 3;
                                        } else {
                                            var62 = Statics.field213;
                                        }
                                    }
                                    var61 = var62;
                                } else {
                                    int var49;
                                    if (Statics.field581.field141) {
                                        var49 = Statics.field213;
                                    } else {
                                        label1224: {
                                            int var50 = 3;
                                            if (Statics.field2083 < 310) {
                                                int var51 = Statics.field3161 >> 7;
                                                int var52 = Statics.field666 >> 7;
                                                int var53 = Statics.field226.field838 >> 7;
                                                int var54 = Statics.field226.field881 >> 7;
                                                if (var51 < 0 || var52 < 0 || var51 >= 104 || var52 >= 104) {
                                                    var49 = Statics.field213;
                                                    break label1224;
                                                }
                                                if ((class6.field83[Statics.field213][var51][var52] & 0x4) != 0) {
                                                    var50 = Statics.field213;
                                                }
                                                int var55;
                                                if (var53 > var51) {
                                                    var55 = var53 - var51;
                                                } else {
                                                    var55 = var51 - var53;
                                                }
                                                int var56;
                                                if (var54 > var52) {
                                                    var56 = var54 - var52;
                                                } else {
                                                    var56 = var52 - var54;
                                                }
                                                if (var55 > var56) {
                                                    int var57 = var56 * 65536 / var55;
                                                    int var58 = 32768;
                                                    while (var51 != var53) {
                                                        if (var51 < var53) {
                                                            var51++;
                                                        } else if (var51 > var53) {
                                                            var51--;
                                                        }
                                                        if ((class6.field83[Statics.field213][var51][var52] & 0x4) != 0) {
                                                            var50 = Statics.field213;
                                                        }
                                                        var58 += var57;
                                                        if (var58 >= 65536) {
                                                            var58 -= 65536;
                                                            if (var52 < var54) {
                                                                var52++;
                                                            } else if (var52 > var54) {
                                                                var52--;
                                                            }
                                                            if ((class6.field83[Statics.field213][var51][var52] & 0x4) != 0) {
                                                                var50 = Statics.field213;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    int var59 = var55 * 65536 / var56;
                                                    int var60 = 32768;
                                                    while (var52 != var54) {
                                                        if (var52 < var54) {
                                                            var52++;
                                                        } else if (var52 > var54) {
                                                            var52--;
                                                        }
                                                        if ((class6.field83[Statics.field213][var51][var52] & 0x4) != 0) {
                                                            var50 = Statics.field213;
                                                        }
                                                        var60 += var59;
                                                        if (var60 >= 65536) {
                                                            var60 -= 65536;
                                                            if (var51 < var53) {
                                                                var51++;
                                                            } else if (var51 > var53) {
                                                                var51--;
                                                            }
                                                            if ((class6.field83[Statics.field213][var51][var52] & 0x4) != 0) {
                                                                var50 = Statics.field213;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (Statics.field226.field838 >= 0 && Statics.field226.field881 >= 0 && Statics.field226.field838 < 13312 && Statics.field226.field881 < 13312) {
                                                if ((class6.field83[Statics.field213][Statics.field226.field838 >> 7][Statics.field226.field881 >> 7] & 0x4) != 0) {
                                                    var50 = Statics.field213;
                                                }
                                                var49 = var50;
                                            } else {
                                                var49 = Statics.field213;
                                            }
                                        }
                                    }
                                    var61 = var49;
                                }
                                int var64 = Statics.field3161;
                                int var65 = Statics.field28;
                                int var66 = Statics.field666;
                                int var67 = Statics.field2083;
                                int var68 = Statics.field1019;
                                for (int var69 = 0; var69 < 5; var69++) {
                                    if (field526[var69]) {
                                        int var70 = (int) (Math.random() * (double) (field539[var69] * 2 + 1) - (double) field539[var69] + Math.sin((double) field541[var69] / 100.0D * (double) field542[var69]) * (double) field540[var69]);
                                        if (var69 == 0) {
                                            Statics.field3161 += var70;
                                        }
                                        if (var69 == 1) {
                                            Statics.field28 += var70;
                                        }
                                        if (var69 == 2) {
                                            Statics.field666 += var70;
                                        }
                                        if (var69 == 3) {
                                            Statics.field1019 = Statics.field1019 + var70 & 0x7FF;
                                        }
                                        if (var69 == 4) {
                                            Statics.field2083 += var70;
                                            if (Statics.field2083 < 128) {
                                                Statics.field2083 = 128;
                                            }
                                            if (Statics.field2083 > 383) {
                                                Statics.field2083 = 383;
                                            }
                                        }
                                    }
                                }
                                int var71 = class141.field2147;
                                int var72 = class141.field2152;
                                if (class141.field2157 != 0) {
                                    var71 = class141.field2162;
                                    var72 = class141.field2159;
                                }
                                if (var71 >= var43 && var71 < var43 + var45 && var72 >= var44 && var72 < var44 + var46) {
                                    class106.field1859 = true;
                                    class106.field1862 = 0;
                                    class106.field1854 = var71 - var43;
                                    class106.field1861 = var72 - var44;
                                } else {
                                    class106.field1859 = false;
                                    class106.field1862 = 0;
                                }
                                method111();
                                class80.method1728(var43, var44, var45, var46, 0);
                                method111();
                                int var73 = class92.field1584;
                                class92.field1584 = field549;
                                Statics.field2057.method1916(Statics.field3161, Statics.field28, Statics.field666, Statics.field2083, Statics.field1019, var61);
                                class92.field1584 = var73;
                                method111();
                                Statics.field2057.method1844();
                                field384 = 0;
                                boolean var74 = false;
                                int var75 = -1;
                                int var76 = class33.field754;
                                int[] var77 = class33.field762;
                                for (int var78 = 0; var78 < field495 + var76; var78++) {
                                    class38 var79;
                                    if (var78 < var76) {
                                        var79 = field303[var77[var78]];
                                        if (field465 == var77[var78]) {
                                            var74 = true;
                                            var75 = var78;
                                            continue;
                                        }
                                    } else {
                                        var79 = field329[field331[var78 - var76]];
                                    }
                                    method990(var79, var78, var43, var44, var45, var46);
                                }
                                if (var74) {
                                    method990(field303[field465], var75, var43, var44, var45, var46);
                                }
                                for (int var80 = 0; var80 < field384; var80++) {
                                    int var81 = field386[var80];
                                    int var82 = field529[var80];
                                    int var83 = field389[var80];
                                    int var84 = field388[var80];
                                    boolean var85 = true;
                                    while (var85) {
                                        var85 = false;
                                        for (int var86 = 0; var86 < var80; var86++) {
                                            if (var82 + 2 > field529[var86] - field388[var86] && var82 - var84 < field529[var86] + 2 && var81 - var83 < field389[var86] + field386[var86] && var81 + var83 > field386[var86] - field389[var86] && field529[var86] - field388[var86] < var82) {
                                                var82 = field529[var86] - field388[var86];
                                                var85 = true;
                                            }
                                        }
                                    }
                                    field396 = field386[var80];
                                    field397 = field529[var80] = var82;
                                    String var87 = field335[var80];
                                    if (field450 == 0) {
                                        int var88 = 16776960;
                                        if (field390[var80] < 6) {
                                            var88 = field349[field390[var80]];
                                        }
                                        if (field390[var80] == 6) {
                                            var88 = field553 % 20 < 10 ? 16711680 : 16776960;
                                        }
                                        if (field390[var80] == 7) {
                                            var88 = field553 % 20 < 10 ? 255 : 65535;
                                        }
                                        if (field390[var80] == 8) {
                                            var88 = field553 % 20 < 10 ? 45056 : 8454016;
                                        }
                                        if (field390[var80] == 9) {
                                            int var89 = 150 - field488[var80];
                                            if (var89 < 50) {
                                                var88 = var89 * 1280 + 16711680;
                                            } else if (var89 < 100) {
                                                var88 = 16776960 - (var89 - 50) * 327680;
                                            } else if (var89 < 150) {
                                                var88 = (var89 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (field390[var80] == 10) {
                                            int var90 = 150 - field488[var80];
                                            if (var90 < 50) {
                                                var88 = var90 * 5 + 16711680;
                                            } else if (var90 < 100) {
                                                var88 = 16711935 - (var90 - 50) * 327680;
                                            } else if (var90 < 150) {
                                                var88 = (var90 - 100) * 327680 + 255 - (var90 - 100) * 5;
                                            }
                                        }
                                        if (field390[var80] == 11) {
                                            int var91 = 150 - field488[var80];
                                            if (var91 < 50) {
                                                var88 = 16777215 - var91 * 327685;
                                            } else if (var91 < 100) {
                                                var88 = (var91 - 50) * 327685 + 65280;
                                            } else if (var91 < 150) {
                                                var88 = 16777215 - (var91 - 100) * 327680;
                                            }
                                        }
                                        if (field391[var80] == 0) {
                                            Statics.field759.method3806(var87, field396 + var43, field397 + var44, var88, 0);
                                        }
                                        if (field391[var80] == 1) {
                                            Statics.field759.method3785(var87, field396 + var43, field397 + var44, var88, 0, field553);
                                        }
                                        if (field391[var80] == 2) {
                                            Statics.field759.method3786(var87, field396 + var43, field397 + var44, var88, 0, field553);
                                        }
                                        if (field391[var80] == 3) {
                                            Statics.field759.method3805(var87, field396 + var43, field397 + var44, var88, 0, field553, 150 - field488[var80]);
                                        }
                                        if (field391[var80] == 4) {
                                            int var92 = (150 - field488[var80]) * (Statics.field759.method3776(var87) + 100) / 150;
                                            class80.method1723(field396 + var43 - 50, var44, field396 + var43 + 50, var44 + var46);
                                            Statics.field759.method3799(var87, field396 + var43 + 50 - var92, field397 + var44, var88, 0);
                                            class80.method1722(var43, var44, var43 + var45, var44 + var46);
                                        }
                                        if (field391[var80] == 5) {
                                            int var93 = 150 - field488[var80];
                                            int var94 = 0;
                                            if (var93 < 25) {
                                                var94 = var93 - 25;
                                            } else if (var93 > 125) {
                                                var94 = var93 - 125;
                                            }
                                            class80.method1723(var43, field397 + var44 - Statics.field759.field3189 - 1, var43 + var45, field397 + var44 + 5);
                                            Statics.field759.method3806(var87, field396 + var43, field397 + var44 + var94, var88, 0);
                                            class80.method1722(var43, var44, var43 + var45, var44 + var46);
                                        }
                                    } else {
                                        Statics.field759.method3806(var87, field396 + var43, field397 + var44, 16776960, 0);
                                    }
                                }
                                method3033(var43, var44);
                                ((class96) Statics.field1595).method2086(field367);
                                method669(var43, var44, var45, var46);
                                Statics.field3161 = var64;
                                Statics.field28 = var65;
                                Statics.field666 = var66;
                                Statics.field2083 = var67;
                                Statics.field1019 = var68;
                                if (field301) {
                                    byte var95 = 0;
                                    int var96 = class172.field2731 + class172.field2715 + var95;
                                    if (var96 == 0) {
                                        field301 = false;
                                    }
                                }
                                if (field301) {
                                    class80.method1728(var43, var44, var45, var46, 0);
                                    method732(class158.field2317, false);
                                }
                                field517[var10.field2886] = true;
                                class80.method1722(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2759 == 1338) {
                                method919(var10, var13, var14, var11);
                                class80.method1722(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2759 == 1339) {
                                method2302(var10, var13, var14, var11);
                                class80.method1722(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2799 == 0) {
                            if (!var10.field2861 && method104(var10) && Statics.field1235 != var10) {
                                continue;
                            }
                            if (!var10.field2861) {
                                if (var10.field2777 > var10.field2779 - var10.field2889) {
                                    var10.field2777 = var10.field2779 - var10.field2889;
                                }
                                if (var10.field2777 < 0) {
                                    var10.field2777 = 0;
                                }
                            }
                            method993(arg0, var10.field2870, var20, var21, var22, var23, var13 - var10.field2879, var14 - var10.field2777, var11);
                            if (var10.field2768 != null) {
                                method993(var10.field2768, var10.field2870, var20, var21, var22, var23, var13 - var10.field2879, var14 - var10.field2777, var11);
                            }
                            class4 var98 = (class4) field449.method3555((long) var10.field2870);
                            if (var98 != null) {
                                method1824(var98.field65, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1722(arg2, arg3, arg4, arg5);
                            class92.method2006();
                        }
                        if (field502 || field428[var11] || field337 > 1) {
                            if (var10.field2799 == 0 && !var10.field2861 && var10.field2779 > var10.field2889) {
                                method1(var10.field2770 + var13, var14, var10.field2777, var10.field2889, var10.field2779);
                            }
                            if (var10.field2799 != 1) {
                                if (var10.field2799 == 2) {
                                    int var99 = 0;
                                    for (int var100 = 0; var100 < var10.field2864; var100++) {
                                        for (int var101 = 0; var101 < var10.field2826; var101++) {
                                            int var102 = (var10.field2821 + 32) * var101 + var13;
                                            int var103 = (var10.field2822 + 32) * var100 + var14;
                                            if (var99 < 20) {
                                                var102 += var10.field2823[var99];
                                                var103 += var10.field2824[var99];
                                            }
                                            if (var10.field2890[var99] > 0) {
                                                boolean var104 = false;
                                                boolean var105 = false;
                                                int var106 = var10.field2890[var99] - 1;
                                                if (var102 + 32 > arg2 && var102 < arg4 && var103 + 32 > arg3 && var103 < arg5 || Statics.field2676 == var10 && field404 == var99) {
                                                    class79 var107;
                                                    if (field354 == 1 && Statics.field1017 == var99 && Statics.field1957 == var10.field2870) {
                                                        var107 = class52.method2780(var106, var10.field2751[var99], 2, 0, 2, false);
                                                    } else {
                                                        var107 = class52.method2780(var106, var10.field2751[var99], 1, 3153952, 2, false);
                                                    }
                                                    if (var107 == null) {
                                                        method791(var10);
                                                    } else if (Statics.field2676 == var10 && field404 == var99) {
                                                        int var108 = class141.field2147 - field505;
                                                        int var109 = class141.field2152 - field406;
                                                        if (var108 < 5 && var108 > -5) {
                                                            var108 = 0;
                                                        }
                                                        if (var109 < 5 && var109 > -5) {
                                                            var109 = 0;
                                                        }
                                                        if (field472 < 5) {
                                                            var108 = 0;
                                                            var109 = 0;
                                                        }
                                                        var107.method1690(var102 + var108, var103 + var109, 128);
                                                        if (arg1 != -1) {
                                                            class174 var110 = arg0[arg1 & 0xFFFF];
                                                            if (var103 + var109 < class80.field1423 && var110.field2777 > 0) {
                                                                int var111 = field367 * (class80.field1423 - var103 - var109) / 3;
                                                                if (var111 > field367 * 10) {
                                                                    var111 = field367 * 10;
                                                                }
                                                                if (var111 > var110.field2777) {
                                                                    var111 = var110.field2777;
                                                                }
                                                                var110.field2777 -= var111;
                                                                field406 += var111;
                                                                method791(var110);
                                                            }
                                                            if (var103 + var109 + 32 > class80.field1424 && var110.field2777 < var110.field2779 - var110.field2889) {
                                                                int var112 = field367 * (var103 + var109 + 32 - class80.field1424) / 3;
                                                                if (var112 > field367 * 10) {
                                                                    var112 = field367 * 10;
                                                                }
                                                                if (var112 > var110.field2779 - var110.field2889 - var110.field2777) {
                                                                    var112 = var110.field2779 - var110.field2889 - var110.field2777;
                                                                }
                                                                var110.field2777 += var112;
                                                                field406 -= var112;
                                                                method791(var110);
                                                            }
                                                        }
                                                    } else if (Statics.field1226 == var10 && field403 == var99) {
                                                        var107.method1690(var102, var103, 128);
                                                    } else {
                                                        var107.method1637(var102, var103);
                                                    }
                                                }
                                            } else if (var10.field2825 != null && var99 < 20) {
                                                class79 var113 = var10.method3203(var99);
                                                if (var113 != null) {
                                                    var113.method1637(var102, var103);
                                                } else if (class174.field2753) {
                                                    method791(var10);
                                                }
                                            }
                                            var99++;
                                        }
                                    }
                                } else if (var10.field2799 == 3) {
                                    int var114;
                                    if (method192(var10)) {
                                        var114 = var10.field2781;
                                        if (Statics.field1235 == var10 && var10.field2783 != 0) {
                                            var114 = var10.field2783;
                                        }
                                    } else {
                                        var114 = var10.field2780;
                                        if (Statics.field1235 == var10 && var10.field2782 != 0) {
                                            var114 = var10.field2782;
                                        }
                                    }
                                    if (var10.field2843) {
                                        switch(var10.field2785.field1441) {
                                            case 1:
                                                class80.method1719(var13, var14, var10.field2770, var10.field2889, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1730(var13, var14, var10.field2770, var10.field2889, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1746(var13, var14, var10.field2770, var10.field2889, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1757(var13, var14, var10.field2770, var10.field2889, var10.field2780, var10.field2781, 256 - (var10.field2786 & 0xFF), 256 - (var10.field2840 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1728(var13, var14, var10.field2770, var10.field2889, var114);
                                                } else {
                                                    class80.method1727(var13, var14, var10.field2770, var10.field2889, var114, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1734(var13, var14, var10.field2770, var10.field2889, var114);
                                    } else {
                                        class80.method1735(var13, var14, var10.field2770, var10.field2889, var114, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2799 == 4) {
                                    class225 var115 = var10.method3202();
                                    if (var115 != null) {
                                        String var116 = var10.field2815;
                                        int var117;
                                        if (method192(var10)) {
                                            var117 = var10.field2781;
                                            if (Statics.field1235 == var10 && var10.field2783 != 0) {
                                                var117 = var10.field2783;
                                            }
                                            if (var10.field2816.length() > 0) {
                                                var116 = var10.field2816;
                                            }
                                        } else {
                                            var117 = var10.field2780;
                                            if (Statics.field1235 == var10 && var10.field2782 != 0) {
                                                var117 = var10.field2782;
                                            }
                                        }
                                        if (var10.field2861 && var10.field2765 != -1) {
                                            class52 var118 = class52.method2827(var10.field2765);
                                            var116 = var118.field1129;
                                            if (var116 == null) {
                                                var116 = "null";
                                            }
                                            if ((var118.field1152 == 1 || var10.field2795 != 1) && var10.field2795 != -1) {
                                                var116 = class2.method3026(16748608) + var116 + class2.field19 + " " + 'x' + method2100(var10.field2795);
                                            }
                                        }
                                        if (field313 == var10) {
                                            class158 var10000 = (class158) null;
                                            var116 = class158.field2463;
                                            var117 = var10.field2780;
                                        }
                                        if (!var10.field2861) {
                                            var116 = method3056(var116, var10);
                                        }
                                        var115.method3784(var116, var13, var14, var10.field2770, var10.field2889, var117, var10.field2820 ? 0 : -1, var10.field2818, var10.field2819, var10.field2817);
                                    } else if (class174.field2753) {
                                        method791(var10);
                                    }
                                } else if (var10.field2799 == 5) {
                                    if (var10.field2861) {
                                        class79 var120;
                                        if (var10.field2765 == -1) {
                                            var120 = var10.method3201(false);
                                        } else {
                                            var120 = class52.method2780(var10.field2765, var10.field2795, var10.field2794, var10.field2802, var10.field2813, false);
                                        }
                                        if (var120 != null) {
                                            int var121 = var120.field1413;
                                            int var122 = var120.field1416;
                                            if (var10.field2793) {
                                                class80.method1723(var13, var14, var10.field2770 + var13, var10.field2889 + var14);
                                                int var123 = (var10.field2770 + (var121 - 1)) / var121;
                                                int var124 = (var10.field2889 + (var122 - 1)) / var122;
                                                for (int var125 = 0; var125 < var123; var125++) {
                                                    for (int var126 = 0; var126 < var124; var126++) {
                                                        if (var10.field2878 != 0) {
                                                            var120.method1650(var121 / 2 + var121 * var125 + var13, var122 / 2 + var122 * var126 + var14, var10.field2878, 4096);
                                                        } else if (var15 == 0) {
                                                            var120.method1637(var121 * var125 + var13, var122 * var126 + var14);
                                                        } else {
                                                            var120.method1690(var121 * var125 + var13, var122 * var126 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1722(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var127 = var10.field2770 * 4096 / var121;
                                                if (var10.field2878 != 0) {
                                                    var120.method1650(var10.field2770 / 2 + var13, var10.field2889 / 2 + var14, var10.field2878, var127);
                                                } else if (var15 != 0) {
                                                    var120.method1645(var13, var14, var10.field2770, var10.field2889, 256 - (var15 & 0xFF));
                                                } else if (var10.field2770 == var121 && var10.field2889 == var122) {
                                                    var120.method1637(var13, var14);
                                                } else {
                                                    var120.method1655(var13, var14, var10.field2770, var10.field2889);
                                                }
                                            }
                                        } else if (class174.field2753) {
                                            method791(var10);
                                        }
                                    } else {
                                        class79 var119 = var10.method3201(method192(var10));
                                        if (var119 != null) {
                                            var119.method1637(var13, var14);
                                        } else if (class174.field2753) {
                                            method791(var10);
                                        }
                                    }
                                } else if (var10.field2799 == 6) {
                                    boolean var128 = method192(var10);
                                    int var129;
                                    if (var128) {
                                        var129 = var10.field2784;
                                    } else {
                                        var129 = var10.field2757;
                                    }
                                    class106 var130 = null;
                                    int var131 = 0;
                                    if (var10.field2765 != -1) {
                                        class52 var132 = class52.method2827(var10.field2765);
                                        if (var132 != null) {
                                            class52 var133 = var132.method1058(var10.field2795);
                                            var130 = var133.method1085(1);
                                            if (var130 == null) {
                                                method791(var10);
                                            } else {
                                                var130.method2195();
                                                var131 = var130.field1469 / 2;
                                            }
                                        }
                                    } else if (var10.field2798 == 5) {
                                        if (var10.field2769 == 0) {
                                            var130 = field562.method3283((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var130 = Statics.field226.method29();
                                        }
                                    } else if (var129 == -1) {
                                        var130 = var10.method3238((class43) null, -1, var128, Statics.field226.field37);
                                        if (var130 == null && class174.field2753) {
                                            method791(var10);
                                        }
                                    } else {
                                        class43 var134 = class43.method745(var129);
                                        var130 = var10.method3238(var134, var10.field2877, var128, Statics.field226.field37);
                                        if (var130 == null && class174.field2753) {
                                            method791(var10);
                                        }
                                    }
                                    class92.method2000(var10.field2770 / 2 + var13, var10.field2889 / 2 + var14);
                                    int var135 = var10.field2875 * class92.field1598[var10.field2806] >> 16;
                                    int var136 = var10.field2875 * class92.field1578[var10.field2806] >> 16;
                                    if (var130 != null) {
                                        if (var10.field2861) {
                                            var130.method2195();
                                            if (var10.field2812) {
                                                var130.method2206(0, var10.field2807, var10.field2747, var10.field2806, var10.field2804, var10.field2805 + var131 + var135, var10.field2805 + var136, var10.field2875);
                                            } else {
                                                var130.method2205(0, var10.field2807, var10.field2747, var10.field2806, var10.field2804, var10.field2805 + var131 + var135, var10.field2805 + var136);
                                            }
                                        } else {
                                            var130.method2205(0, var10.field2807, 0, var10.field2806, 0, var135, var136);
                                        }
                                    }
                                    class92.method2022();
                                } else {
                                    if (var10.field2799 == 7) {
                                        class225 var137 = var10.method3202();
                                        if (var137 == null) {
                                            if (class174.field2753) {
                                                method791(var10);
                                            }
                                            continue;
                                        }
                                        int var138 = 0;
                                        for (int var139 = 0; var139 < var10.field2864; var139++) {
                                            for (int var140 = 0; var140 < var10.field2826; var140++) {
                                                if (var10.field2890[var138] > 0) {
                                                    class52 var141 = class52.method2827(var10.field2890[var138] - 1);
                                                    String var142;
                                                    if (var141.field1152 != 1 && var10.field2751[var138] == 1) {
                                                        var142 = class2.method3026(16748608) + var141.field1129 + class2.field19;
                                                    } else {
                                                        var142 = class2.method3026(16748608) + var141.field1129 + class2.field19 + " " + 'x' + method2100(var10.field2751[var138]);
                                                    }
                                                    int var143 = (var10.field2821 + 115) * var140 + var13;
                                                    int var144 = (var10.field2822 + 12) * var139 + var14;
                                                    if (var10.field2818 == 0) {
                                                        var137.method3799(var142, var143, var144, var10.field2780, var10.field2820 ? 0 : -1);
                                                    } else if (var10.field2818 == 1) {
                                                        var137.method3806(var142, var10.field2770 / 2 + var143, var144, var10.field2780, var10.field2820 ? 0 : -1);
                                                    } else {
                                                        var137.method3838(var142, var10.field2770 + var143 - 1, var144, var10.field2780, var10.field2820 ? 0 : -1);
                                                    }
                                                }
                                                var138++;
                                            }
                                        }
                                    }
                                    if (var10.field2799 == 8 && Statics.field1003 == var10 && field440 == field439) {
                                        int var145 = 0;
                                        int var146 = 0;
                                        class225 var147 = Statics.field815;
                                        String var148 = var10.field2815;
                                        String var149 = method3056(var148, var10);
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
                                            int var152 = var147.method3776(var151);
                                            if (var152 > var145) {
                                                var145 = var152;
                                            }
                                            var146 += var147.field3189 + 1;
                                        }
                                        var145 += 6;
                                        var146 += 7;
                                        int var153 = var10.field2770 + var13 - 5 - var145;
                                        int var154 = var10.field2889 + var14 + 5;
                                        if (var153 < var13 + 5) {
                                            var153 = var13 + 5;
                                        }
                                        if (var145 + var153 > arg4) {
                                            var153 = arg4 - var145;
                                        }
                                        if (var146 + var154 > arg5) {
                                            var154 = arg5 - var146;
                                        }
                                        class80.method1728(var153, var154, var145, var146, 16777120);
                                        class80.method1734(var153, var154, var145, var146, 0);
                                        String var155 = var10.field2815;
                                        int var156 = var147.field3189 + var154 + 2;
                                        String var157 = method3056(var155, var10);
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
                                            var147.method3799(var159, var153 + 3, var156, 0, -1);
                                            var156 += var147.field3189 + 1;
                                        }
                                    }
                                    if (var10.field2799 == 9) {
                                        if (var10.field2788 == 1) {
                                            int var160;
                                            int var161;
                                            int var162;
                                            int var163;
                                            if (var10.field2789) {
                                                var160 = var13;
                                                var161 = var10.field2889 + var14;
                                                var162 = var10.field2770 + var13;
                                                var163 = var14;
                                            } else {
                                                var160 = var13;
                                                var161 = var14;
                                                var162 = var10.field2770 + var13;
                                                var163 = var10.field2889 + var14;
                                            }
                                            class80.method1760(var160, var161, var162, var163, var10.field2780);
                                        } else {
                                            int var164 = var10.field2770 >= 0 ? var10.field2770 : -var10.field2770;
                                            int var165 = var10.field2889 >= 0 ? var10.field2889 : -var10.field2889;
                                            int var166 = var164;
                                            if (var164 < var165) {
                                                var166 = var165;
                                            }
                                            if (var166 != 0) {
                                                int var167 = (var10.field2770 << 16) / var166;
                                                int var168 = (var10.field2889 << 16) / var166;
                                                if (var168 <= var167) {
                                                    var167 = -var167;
                                                } else {
                                                    var168 = -var168;
                                                }
                                                int var169 = var10.field2788 * var168 >> 17;
                                                int var170 = var10.field2788 * var168 + 1 >> 17;
                                                int var171 = var10.field2788 * var167 >> 17;
                                                int var172 = var10.field2788 * var167 + 1 >> 17;
                                                int var173 = var13 + var169;
                                                int var174 = var13 - var170;
                                                int var175 = var10.field2770 + var13 - var170;
                                                int var176 = var10.field2770 + var13 + var169;
                                                int var177 = var14 + var171;
                                                int var178 = var14 - var172;
                                                int var179 = var10.field2889 + var14 - var172;
                                                int var180 = var10.field2889 + var14 + var171;
                                                class92.method2040(var173, var174, var175);
                                                class92.method2008(var177, var178, var179, var173, var174, var175, var10.field2780);
                                                class92.method2040(var173, var175, var176);
                                                class92.method2008(var177, var179, var180, var173, var175, var176, var10.field2780);
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

    @ObfuscatedName("fz.ck(Ljava/lang/String;Lfw;I)Ljava/lang/String;")
    public static String method3056(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    arg0 = arg0.substring(0, var3) + method800(method2182(arg1, var2 - 1)) + arg0.substring(var3 + 2);
                }
            }
            while (true) {
                int var4 = arg0.indexOf("%dns");
                if (var4 == -1) {
                    break;
                }
                String var5 = "";
                if (Statics.field3000 != null) {
                    int var6 = Statics.field3000.field2211;
                    String var7 = (var6 >> 24 & 0xFF) + "." + (var6 >> 16 & 0xFF) + "." + (var6 >> 8 & 0xFF) + "." + (var6 & 0xFF);
                    var5 = var7;
                    if (Statics.field3000.field2217 != null) {
                        var5 = (String) Statics.field3000.field2217;
                    }
                }
                arg0 = arg0.substring(0, var4) + var5 + arg0.substring(var4 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("cd.cv(II)Ljava/lang/String;")
    public static final String method2100(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field20 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method3026(65408) + var1.substring(0, var1.length() - 8) + class158.field2362 + " " + class2.field34 + var1 + class2.field23 + class2.field19;
        } else if (var1.length() > 6) {
            return " " + class2.method3026(16777215) + var1.substring(0, var1.length() - 4) + class158.field2468 + " " + class2.field34 + var1 + class2.field23 + class2.field19;
        } else {
            return " " + class2.method3026(16776960) + var1 + class2.field19;
        }
    }

    @ObfuscatedName("ai.cc(ZI)V")
    public static final void method778(boolean arg0) {
        int var1 = field392;
        int var2 = Statics.field709;
        int var3 = Statics.field2275;
        if (class174.method2723(var1)) {
            method3402(Statics.field2771[var1], -1, var2, var3, arg0);
        }
    }

    @ObfuscatedName("ad.cf(Lfw;I)V")
    public static void method997(class174 arg0) {
        class174 var1 = arg0.field2774 == -1 ? null : class174.method2958(arg0.field2774);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field709;
            var3 = Statics.field2275;
        } else {
            var2 = var1.field2770;
            var3 = var1.field2889;
        }
        method43(arg0, var2, var3, false);
        method2103(arg0, var2, var3);
    }

    @ObfuscatedName("bu.cb([Lfw;Lfw;ZI)V")
    public static void method1584(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2778 == 0 ? arg1.field2770 : arg1.field2778;
        int var4 = arg1.field2779 == 0 ? arg1.field2889 : arg1.field2779;
        method3402(arg0, arg1.field2870, var3, var4, arg2);
        if (arg1.field2768 != null) {
            method3402(arg1.field2768, arg1.field2870, var3, var4, arg2);
        }
        class4 var5 = (class4) field449.method3555((long) arg1.field2870);
        if (var5 != null) {
            int var6 = var5.field65;
            if (class174.method2723(var6)) {
                method3402(Statics.field2771[var6], -1, var3, var4, arg2);
            }
        }
        if (arg1.field2759 == 1337) {
        }
    }

    @ObfuscatedName("gf.cs([Lfw;IIIZI)V")
    public static void method3402(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2774 == arg1) {
                method43(var6, arg2, arg3, arg4);
                method2103(var6, arg2, arg3);
                if (var6.field2879 > var6.field2778 - var6.field2770) {
                    var6.field2879 = var6.field2778 - var6.field2770;
                }
                if (var6.field2879 < 0) {
                    var6.field2879 = 0;
                }
                if (var6.field2777 > var6.field2779 - var6.field2889) {
                    var6.field2777 = var6.field2779 - var6.field2889;
                }
                if (var6.field2777 < 0) {
                    var6.field2777 = 0;
                }
                if (var6.field2799 == 0) {
                    method1584(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("x.cp(Lfw;IIZI)V")
    public static void method43(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2770;
        int var5 = arg0.field2889;
        if (arg0.field2762 == 0) {
            arg0.field2770 = arg0.field2826;
        } else if (arg0.field2762 == 1) {
            arg0.field2770 = arg1 - arg0.field2826;
        } else if (arg0.field2762 == 2) {
            arg0.field2770 = arg0.field2826 * arg1 >> 14;
        }
        if (arg0.field2763 == 0) {
            arg0.field2889 = arg0.field2864;
        } else if (arg0.field2763 == 1) {
            arg0.field2889 = arg2 - arg0.field2864;
        } else if (arg0.field2763 == 2) {
            arg0.field2889 = arg0.field2864 * arg2 >> 14;
        }
        if (arg0.field2762 == 4) {
            arg0.field2770 = arg0.field2889 * arg0.field2776 / arg0.field2772;
        }
        if (arg0.field2763 == 4) {
            arg0.field2889 = arg0.field2772 * arg0.field2770 / arg0.field2776;
        }
        if (field535 && arg0.field2799 == 0) {
            if (arg0.field2889 < 5 && arg0.field2770 < 5) {
                arg0.field2889 = 5;
                arg0.field2770 = 5;
            } else {
                if (arg0.field2889 <= 0) {
                    arg0.field2889 = 5;
                }
                if (arg0.field2770 <= 0) {
                    arg0.field2770 = 5;
                }
            }
        }
        if (arg0.field2759 == 1337) {
            field463 = arg0;
        }
        if (arg3 && arg0.field2857 != null && (arg0.field2770 != var4 || arg0.field2889 != var5)) {
            class1 var6 = new class1();
            var6.field2 = arg0;
            var6.field1 = arg0.field2857;
            field487.method3610(var6);
        }
    }

    @ObfuscatedName("cy.cd(Lfw;IIB)V")
    public static void method2103(class174 arg0, int arg1, int arg2) {
        if (arg0.field2760 == 0) {
            arg0.field2874 = arg0.field2764;
        } else if (arg0.field2760 == 1) {
            arg0.field2874 = (arg1 - arg0.field2770) / 2 + arg0.field2764;
        } else if (arg0.field2760 == 2) {
            arg0.field2874 = arg1 - arg0.field2770 - arg0.field2764;
        } else if (arg0.field2760 == 3) {
            arg0.field2874 = arg0.field2764 * arg1 >> 14;
        } else if (arg0.field2760 == 4) {
            arg0.field2874 = (arg0.field2764 * arg1 >> 14) + (arg1 - arg0.field2770) / 2;
        } else {
            arg0.field2874 = arg1 - arg0.field2770 - (arg0.field2764 * arg1 >> 14);
        }
        if (arg0.field2859 == 0) {
            arg0.field2808 = arg0.field2754;
        } else if (arg0.field2859 == 1) {
            arg0.field2808 = (arg2 - arg0.field2889) / 2 + arg0.field2754;
        } else if (arg0.field2859 == 2) {
            arg0.field2808 = arg2 - arg0.field2889 - arg0.field2754;
        } else if (arg0.field2859 == 3) {
            arg0.field2808 = arg0.field2754 * arg2 >> 14;
        } else if (arg0.field2859 == 4) {
            arg0.field2808 = (arg0.field2754 * arg2 >> 14) + (arg2 - arg0.field2889) / 2;
        } else {
            arg0.field2808 = arg2 - arg0.field2889 - (arg0.field2754 * arg2 >> 14);
        }
        if (!field535 || arg0.field2799 != 0) {
            return;
        }
        if (arg0.field2874 < 0) {
            arg0.field2874 = 0;
        } else if (arg0.field2874 + arg0.field2770 > arg1) {
            arg0.field2874 = arg1 - arg0.field2770;
        }
        if (arg0.field2808 < 0) {
            arg0.field2808 = 0;
        } else if (arg0.field2889 + arg0.field2808 > arg2) {
            arg0.field2808 = arg2 - arg0.field2889;
        }
    }

    @ObfuscatedName("ec.cq(Lfw;IIIIIII)V")
    public static final void method2947(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field538) {
            field373 = 32;
        } else {
            field373 = 0;
        }
        field538 = false;
        if (class141.field2145 == 1 || !Statics.field2225 && class141.field2145 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2777 -= 4;
                method791(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2777 += 4;
                method791(arg0);
            } else if (arg5 >= arg1 - field373 && arg5 < field373 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2777 = (arg4 - arg3) * var8 / var9;
                method791(arg0);
                field538 = true;
            }
        }
        if (field486 == 0) {
            return;
        }
        int var10 = arg0.field2770;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2777 += field486 * 45;
            method791(arg0);
        }
    }

    @ObfuscatedName("f.cy(IIIIII)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
        Statics.field2598[0].method1790(arg0, arg1);
        Statics.field2598[1].method1790(arg0, arg1 + arg3 - 16);
        class80.method1728(arg0, arg1 + 16, 16, arg3 - 32, field368);
        int var5 = (arg3 - 32) * arg3 / arg4;
        if (var5 < 8) {
            var5 = 8;
        }
        int var6 = (arg3 - 32 - var5) * arg2 / (arg4 - arg3);
        class80.method1728(arg0, arg1 + 16 + var6, 16, var5, field369);
        class80.method1767(arg0, arg1 + 16 + var6, var5, field371);
        class80.method1767(arg0 + 1, arg1 + 16 + var6, var5, field371);
        class80.method1750(arg0, arg1 + 16 + var6, 16, field371);
        class80.method1750(arg0, arg1 + 17 + var6, 16, field371);
        class80.method1767(arg0 + 15, arg1 + 16 + var6, var5, field365);
        class80.method1767(arg0 + 14, arg1 + 17 + var6, var5 - 1, field365);
        class80.method1750(arg0, arg1 + 15 + var6 + var5, 16, field365);
        class80.method1750(arg0 + 1, arg1 + 14 + var6 + var5, 15, field365);
    }

    @ObfuscatedName("ah.cn(IB)Ljava/lang/String;")
    public static final String method800(int arg0) {
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }

    @ObfuscatedName("t.ct(Lfw;I)Z")
    public static final boolean method192(class174 arg0) {
        if (arg0.field2868 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2868.length; var1++) {
            int var2 = method2182(arg0, var1);
            int var3 = arg0.field2869[var1];
            if (arg0.field2868[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2868[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2868[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("cu.cu(Lfw;II)I")
    public static final int method2182(class174 arg0, int arg1) {
        if (arg0.field2867 == null || arg1 >= arg0.field2867.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2867[arg1];
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
                    class174 var11 = class174.method2958(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method2827(var12).field1147 || field411)) {
                        for (int var13 = 0; var13 < var11.field2890.length; var13++) {
                            if (var12 + 1 == var11.field2890[var13]) {
                                var7 += var11.field2751[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2906[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2288[field426[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2906[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field226.field41;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2286[var14]) {
                            var7 += field426[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method2958(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method2827(var18).field1147 || field411)) {
                        for (int var19 = 0; var19 < var17.field2890.length; var19++) {
                            if (var18 + 1 == var17.field2890[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field453;
                }
                if (var6 == 12) {
                    var7 = field454;
                }
                if (var6 == 13) {
                    int var20 = class177.field2906[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method2677(var22);
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
                    var7 = (Statics.field226.field838 >> 7) + Statics.field2735;
                }
                if (var6 == 19) {
                    var7 = (Statics.field226.field881 >> 7) + Statics.field577;
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

    @ObfuscatedName("ak.ca(Lfw;IIS)V")
    public static final void method975(class174 arg0, int arg1, int arg2) {
        if (arg0.field2758 == 1) {
            method2960(arg0.field2872, "", 24, 0, 0, arg0.field2870);
        }
        if (arg0.field2758 == 2 && !field443) {
            int var3 = method198(arg0);
            int var4 = var3 >> 11 & 0x3F;
            String var5;
            if (var4 == 0) {
                var5 = null;
            } else if (arg0.field2796 == null || arg0.field2796.trim().length() == 0) {
                var5 = null;
            } else {
                var5 = arg0.field2796;
            }
            if (var5 != null) {
                method2960(var5, class2.method3026(65280) + arg0.field2871, 25, 0, -1, arg0.field2870);
            }
        }
        if (arg0.field2758 == 3) {
            method2960(class158.field2464, "", 26, 0, 0, arg0.field2870);
        }
        if (arg0.field2758 == 4) {
            method2960(arg0.field2872, "", 28, 0, 0, arg0.field2870);
        }
        if (arg0.field2758 == 5) {
            method2960(arg0.field2872, "", 29, 0, 0, arg0.field2870);
        }
        if (arg0.field2758 == 6 && field313 == null) {
            method2960(arg0.field2872, "", 30, 0, -1, arg0.field2870);
        }
        if (arg0.field2799 == 2) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field2889; var8++) {
                for (int var9 = 0; var9 < arg0.field2770; var9++) {
                    int var10 = (arg0.field2821 + 32) * var9;
                    int var11 = (arg0.field2822 + 32) * var8;
                    if (var7 < 20) {
                        var10 += arg0.field2823[var7];
                        var11 += arg0.field2824[var7];
                    }
                    if (arg1 >= var10 && arg2 >= var11 && arg1 < var10 + 32 && arg2 < var11 + 32) {
                        field407 = var7;
                        Statics.field1166 = arg0;
                        if (arg0.field2890[var7] > 0) {
                            class52 var12 = class52.method2827(arg0.field2890[var7] - 1);
                            if (field354 == 1 && class179.method2644(method198(arg0))) {
                                if (Statics.field1957 != arg0.field2870 || Statics.field1017 != var7) {
                                    method2960(class158.field2538, field442 + " " + class2.field24 + " " + class2.method3026(16748608) + var12.field1129, 31, var12.field1168, var7, arg0.field2870);
                                }
                            } else if (!field443 || !class179.method2644(method198(arg0))) {
                                String[] var13 = var12.field1150;
                                if (field459) {
                                    var13 = method200(var13);
                                }
                                if (class179.method2644(method198(arg0))) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 36;
                                            } else {
                                                var15 = 37;
                                            }
                                            method2960(var13[var14], class2.method3026(16748608) + var12.field1129, var15, var12.field1168, var7, arg0.field2870);
                                        } else if (var14 == 4) {
                                            method2960(class158.field2393, class2.method3026(16748608) + var12.field1129, 37, var12.field1168, var7, arg0.field2870);
                                        }
                                    }
                                }
                                if (class179.method2303(method198(arg0))) {
                                    method2960(class158.field2538, class2.method3026(16748608) + var12.field1129, 38, var12.field1168, var7, arg0.field2870);
                                }
                                if (class179.method2644(method198(arg0)) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 33;
                                            }
                                            if (var16 == 1) {
                                                var17 = 34;
                                            }
                                            if (var16 == 2) {
                                                var17 = 35;
                                            }
                                            method2960(var13[var16], class2.method3026(16748608) + var12.field1129, var17, var12.field1168, var7, arg0.field2870);
                                        }
                                    }
                                }
                                String[] var18 = arg0.field2797;
                                if (field459) {
                                    var18 = method200(var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 39;
                                            }
                                            if (var19 == 1) {
                                                var20 = 40;
                                            }
                                            if (var19 == 2) {
                                                var20 = 41;
                                            }
                                            if (var19 == 3) {
                                                var20 = 42;
                                            }
                                            if (var19 == 4) {
                                                var20 = 43;
                                            }
                                            method2960(var18[var19], class2.method3026(16748608) + var12.field1129, var20, var12.field1168, var7, arg0.field2870);
                                        }
                                    }
                                }
                                method2960(class158.field2405, class2.method3026(16748608) + var12.field1129, 1005, var12.field1168, var7, arg0.field2870);
                            } else if ((Statics.field1466 & 0x10) == 16) {
                                method2960(field446, field447 + " " + class2.field24 + " " + class2.method3026(16748608) + var12.field1129, 32, var12.field1168, var7, arg0.field2870);
                            }
                        }
                    }
                    var7++;
                }
            }
        }
        if (!arg0.field2861) {
            return;
        }
        if (!field443) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = method1826(arg0, var21);
                if (var22 != null) {
                    method2960(var22, arg0.field2834, 1007, var21 + 1, arg0.field2756, arg0.field2870);
                }
            }
            int var23 = method198(arg0);
            int var24 = var23 >> 11 & 0x3F;
            String var25;
            if (var24 == 0) {
                var25 = null;
            } else if (arg0.field2796 == null || arg0.field2796.trim().length() == 0) {
                var25 = null;
            } else {
                var25 = arg0.field2796;
            }
            if (var25 != null) {
                method2960(var25, arg0.field2834, 25, 0, arg0.field2756, arg0.field2870);
            }
            for (int var27 = 4; var27 >= 0; var27--) {
                String var28 = method1826(arg0, var27);
                if (var28 != null) {
                    method2960(var28, arg0.field2834, 57, var27 + 1, arg0.field2756, arg0.field2870);
                }
            }
            if (Statics.method2668(method198(arg0))) {
                method2960(class158.field2313, "", 30, 0, arg0.field2756, arg0.field2870);
            }
        } else if (class179.method1607(method198(arg0)) && (Statics.field1466 & 0x20) == 32) {
            method2960(field446, field447 + " " + class2.field24 + " " + arg0.field2834, 58, 0, arg0.field2756, arg0.field2870);
        }
    }

    @ObfuscatedName("az.ce(IIIIIIII)V")
    public static final void method762(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class174.method2723(arg0)) {
            method2964(Statics.field2771[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6);
        }
    }

    @ObfuscatedName("fe.dh([Lfw;IIIIIIII)V")
    public static final void method2964(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2861 || var9.field2799 == 0 || var9.field2835 || method198(var9) != 0 || field299 == var9 || var9.field2759 == 1338) && var9.field2774 == arg1 && (!var9.field2861 || !method104(var9))) {
                int var10 = var9.field2874 + arg6;
                int var11 = var9.field2808 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2799 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2799 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2770 + var10;
                    int var19 = var9.field2889 + var11;
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
                    int var22 = var9.field2770 + var10;
                    int var23 = var9.field2889 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field429 == var9) {
                    field469 = true;
                    field470 = var10;
                    field296 = var11;
                }
                if (!var9.field2861 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2147;
                    int var25 = class141.field2152;
                    if (class141.field2157 != 0) {
                        var24 = class141.field2162;
                        var25 = class141.field2159;
                    }
                    if (var9.field2759 == 1337) {
                        if (!field301 && !field311 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method136(var24, var25, var12, var13);
                        }
                    } else if (var9.field2759 == 1338) {
                        method992(var9, var10, var11);
                    } else {
                        if (!field311 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method975(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2799 == 0) {
                            if (!var9.field2861 && method104(var9) && Statics.field1235 != var9) {
                                continue;
                            }
                            method2964(arg0, var9.field2870, var12, var13, var14, var15, var10 - var9.field2879, var11 - var9.field2777);
                            if (var9.field2768 != null) {
                                method2964(var9.field2768, var9.field2870, var12, var13, var14, var15, var10 - var9.field2879, var11 - var9.field2777);
                            }
                            class4 var26 = (class4) field449.method3555((long) var9.field2870);
                            if (var26 != null) {
                                if (var26.field63 == 0 && class141.field2147 >= var12 && class141.field2152 >= var13 && class141.field2147 < var14 && class141.field2152 < var15 && !field311 && !field535) {
                                    for (class1 var27 = (class1) field487.method3585(); var27 != null; var27 = (class1) field487.method3590()) {
                                        if (var27.field7) {
                                            var27.method3679();
                                            var27.field2.field2880 = false;
                                        }
                                    }
                                    if (Statics.field1368 == 0) {
                                        field429 = null;
                                        field299 = null;
                                    }
                                    if (!field311) {
                                        field460[0] = class158.field2544;
                                        field436[0] = "";
                                        field330[0] = 1006;
                                        field430 = 1;
                                    }
                                }
                                method762(var26.field65, var12, var13, var14, var15, var10, var11);
                            }
                        }
                        if (var9.field2861) {
                            if (var9.field2888) {
                                if (class141.field2147 >= var12 && class141.field2152 >= var13 && class141.field2147 < var14 && class141.field2152 < var15) {
                                    for (class1 var28 = (class1) field487.method3585(); var28 != null; var28 = (class1) field487.method3590()) {
                                        if (var28.field7) {
                                            var28.method3679();
                                            var28.field2.field2880 = false;
                                        }
                                    }
                                    if (Statics.field1368 == 0) {
                                        field429 = null;
                                        field299 = null;
                                    }
                                    if (!field311) {
                                        field460[0] = class158.field2544;
                                        field436[0] = "";
                                        field330[0] = 1006;
                                        field430 = 1;
                                    }
                                }
                            } else if (var9.field2850 && class141.field2147 >= var12 && class141.field2152 >= var13 && class141.field2147 < var14 && class141.field2152 < var15) {
                                for (class1 var29 = (class1) field487.method3585(); var29 != null; var29 = (class1) field487.method3590()) {
                                    if (var29.field7 && var29.field2.field2856 == var29.field1) {
                                        var29.method3679();
                                    }
                                }
                            }
                            boolean var30;
                            if (class141.field2147 >= var12 && class141.field2152 >= var13 && class141.field2147 < var14 && class141.field2152 < var15) {
                                var30 = true;
                            } else {
                                var30 = false;
                            }
                            boolean var31 = false;
                            if ((class141.field2145 == 1 || !Statics.field2225 && class141.field2145 == 4) && var30) {
                                var31 = true;
                            }
                            boolean var32 = false;
                            if ((class141.field2157 == 1 || !Statics.field2225 && class141.field2157 == 4) && class141.field2162 >= var12 && class141.field2159 >= var13 && class141.field2162 < var14 && class141.field2159 < var15) {
                                var32 = true;
                            }
                            if (var32) {
                                Statics.method195(var9, class141.field2162 - var10, class141.field2159 - var11);
                            }
                            if (field429 != null && field429 != var9 && var30 && class179.method2719(method198(var9))) {
                                field400 = var9;
                            }
                            if (field299 == var9) {
                                field466 = true;
                                field467 = var10;
                                field468 = var11;
                            }
                            if (var9.field2835) {
                                if (var30 && field486 != 0 && var9.field2856 != null) {
                                    class1 var33 = new class1();
                                    var33.field7 = true;
                                    var33.field2 = var9;
                                    var33.field5 = field486;
                                    var33.field1 = var9.field2856;
                                    field487.method3610(var33);
                                }
                                if (field429 != null || Statics.field2676 != null || field311) {
                                    var32 = false;
                                    var31 = false;
                                    var30 = false;
                                }
                                if (!var9.field2881 && var32) {
                                    var9.field2881 = true;
                                    if (var9.field2837 != null) {
                                        class1 var34 = new class1();
                                        var34.field7 = true;
                                        var34.field2 = var9;
                                        var34.field4 = class141.field2162 - var10;
                                        var34.field5 = class141.field2159 - var11;
                                        var34.field1 = var9.field2837;
                                        field487.method3610(var34);
                                    }
                                }
                                if (var9.field2881 && var31 && var9.field2873 != null) {
                                    class1 var35 = new class1();
                                    var35.field7 = true;
                                    var35.field2 = var9;
                                    var35.field4 = class141.field2147 - var10;
                                    var35.field5 = class141.field2152 - var11;
                                    var35.field1 = var9.field2873;
                                    field487.method3610(var35);
                                }
                                if (var9.field2881 && !var31) {
                                    var9.field2881 = false;
                                    if (var9.field2773 != null) {
                                        class1 var36 = new class1();
                                        var36.field7 = true;
                                        var36.field2 = var9;
                                        var36.field4 = class141.field2147 - var10;
                                        var36.field5 = class141.field2152 - var11;
                                        var36.field1 = var9.field2773;
                                        field489.method3610(var36);
                                    }
                                }
                                if (var31 && var9.field2882 != null) {
                                    class1 var37 = new class1();
                                    var37.field7 = true;
                                    var37.field2 = var9;
                                    var37.field4 = class141.field2147 - var10;
                                    var37.field5 = class141.field2152 - var11;
                                    var37.field1 = var9.field2882;
                                    field487.method3610(var37);
                                }
                                if (!var9.field2880 && var30) {
                                    var9.field2880 = true;
                                    if (var9.field2841 != null) {
                                        class1 var38 = new class1();
                                        var38.field7 = true;
                                        var38.field2 = var9;
                                        var38.field4 = class141.field2147 - var10;
                                        var38.field5 = class141.field2152 - var11;
                                        var38.field1 = var9.field2841;
                                        field487.method3610(var38);
                                    }
                                }
                                if (var9.field2880 && var30 && var9.field2766 != null) {
                                    class1 var39 = new class1();
                                    var39.field7 = true;
                                    var39.field2 = var9;
                                    var39.field4 = class141.field2147 - var10;
                                    var39.field5 = class141.field2152 - var11;
                                    var39.field1 = var9.field2766;
                                    field487.method3610(var39);
                                }
                                if (var9.field2880 && !var30) {
                                    var9.field2880 = false;
                                    if (var9.field2876 != null) {
                                        class1 var40 = new class1();
                                        var40.field7 = true;
                                        var40.field2 = var9;
                                        var40.field4 = class141.field2147 - var10;
                                        var40.field5 = class141.field2152 - var11;
                                        var40.field1 = var9.field2876;
                                        field489.method3610(var40);
                                    }
                                }
                                if (var9.field2854 != null) {
                                    class1 var41 = new class1();
                                    var41.field2 = var9;
                                    var41.field1 = var9.field2854;
                                    field394.method3610(var41);
                                }
                                if (var9.field2848 != null && field291 > var9.field2787) {
                                    if (var9.field2849 == null || field291 - var9.field2787 > 32) {
                                        class1 var46 = new class1();
                                        var46.field2 = var9;
                                        var46.field1 = var9.field2848;
                                        field487.method3610(var46);
                                    } else {
                                        label495: for (int var42 = var9.field2787; var42 < field291; var42++) {
                                            int var43 = field409[var42 & 0x1F];
                                            for (int var44 = 0; var44 < var9.field2849.length; var44++) {
                                                if (var9.field2849[var44] == var43) {
                                                    class1 var45 = new class1();
                                                    var45.field2 = var9;
                                                    var45.field1 = var9.field2848;
                                                    field487.method3610(var45);
                                                    break label495;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2787 = field291;
                                }
                                if (var9.field2866 != null && field477 > var9.field2884) {
                                    if (var9.field2851 == null || field477 - var9.field2884 > 32) {
                                        class1 var51 = new class1();
                                        var51.field2 = var9;
                                        var51.field1 = var9.field2866;
                                        field487.method3610(var51);
                                    } else {
                                        label471: for (int var47 = var9.field2884; var47 < field477; var47++) {
                                            int var48 = field476[var47 & 0x1F];
                                            for (int var49 = 0; var49 < var9.field2851.length; var49++) {
                                                if (var9.field2851[var49] == var48) {
                                                    class1 var50 = new class1();
                                                    var50.field2 = var9;
                                                    var50.field1 = var9.field2866;
                                                    field487.method3610(var50);
                                                    break label471;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2884 = field477;
                                }
                                if (var9.field2852 != null && field479 > var9.field2885) {
                                    if (var9.field2853 == null || field479 - var9.field2885 > 32) {
                                        class1 var56 = new class1();
                                        var56.field2 = var9;
                                        var56.field1 = var9.field2852;
                                        field487.method3610(var56);
                                    } else {
                                        label447: for (int var52 = var9.field2885; var52 < field479; var52++) {
                                            int var53 = field478[var52 & 0x1F];
                                            for (int var54 = 0; var54 < var9.field2853.length; var54++) {
                                                if (var9.field2853[var54] == var53) {
                                                    class1 var55 = new class1();
                                                    var55.field2 = var9;
                                                    var55.field1 = var9.field2852;
                                                    field487.method3610(var55);
                                                    break label447;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2885 = field479;
                                }
                                if (field482 > var9.field2809 && var9.field2767 != null) {
                                    class1 var57 = new class1();
                                    var57.field2 = var9;
                                    var57.field1 = var9.field2767;
                                    field487.method3610(var57);
                                }
                                if (field481 > var9.field2809 && var9.field2746 != null) {
                                    class1 var58 = new class1();
                                    var58.field2 = var9;
                                    var58.field1 = var9.field2746;
                                    field487.method3610(var58);
                                }
                                if (field543 > var9.field2809 && var9.field2839 != null) {
                                    class1 var59 = new class1();
                                    var59.field2 = var9;
                                    var59.field1 = var9.field2839;
                                    field487.method3610(var59);
                                }
                                if (field563 > var9.field2809 && var9.field2865 != null) {
                                    class1 var60 = new class1();
                                    var60.field2 = var9;
                                    var60.field1 = var9.field2865;
                                    field487.method3610(var60);
                                }
                                if (field536 > var9.field2809 && var9.field2792 != null) {
                                    class1 var61 = new class1();
                                    var61.field2 = var9;
                                    var61.field1 = var9.field2792;
                                    field487.method3610(var61);
                                }
                                if (field528 > var9.field2809 && var9.field2752 != null) {
                                    class1 var62 = new class1();
                                    var62.field2 = var9;
                                    var62.field1 = var9.field2752;
                                    field487.method3610(var62);
                                }
                                var9.field2809 = field564;
                                if (var9.field2858 != null) {
                                    for (int var63 = 0; var63 < field511; var63++) {
                                        class1 var64 = new class1();
                                        var64.field2 = var9;
                                        var64.field8 = field513[var63];
                                        var64.field9 = field431[var63];
                                        var64.field1 = var9.field2858;
                                        field487.method3610(var64);
                                    }
                                }
                            }
                        }
                        if (!var9.field2861 && field429 == null && Statics.field2676 == null && !field311) {
                            if ((var9.field2828 >= 0 || var9.field2782 != 0) && class141.field2147 >= var12 && class141.field2152 >= var13 && class141.field2147 < var14 && class141.field2152 < var15) {
                                if (var9.field2828 >= 0) {
                                    Statics.field1235 = arg0[var9.field2828];
                                } else {
                                    Statics.field1235 = var9;
                                }
                            }
                            if (var9.field2799 == 8 && class141.field2147 >= var12 && class141.field2152 >= var13 && class141.field2147 < var14 && class141.field2152 < var15) {
                                Statics.field1003 = var9;
                            }
                            if (var9.field2779 > var9.field2889) {
                                method2947(var9, var9.field2770 + var10, var11, var9.field2889, var9.field2779, class141.field2147, class141.field2152);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("av.dr(III)V")
    public static final void method744(int arg0, int arg1) {
        if (class174.method2723(arg0)) {
            method725(Statics.field2771[arg0], arg1);
        }
    }

    @ObfuscatedName("al.dw([Lfw;II)V")
    public static final void method725(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2799 == 0) {
                    if (var3.field2768 != null) {
                        method725(var3.field2768, arg1);
                    }
                    class4 var4 = (class4) field449.method3555((long) var3.field2870);
                    if (var4 != null) {
                        method744(var4.field65, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2829 != null) {
                    class1 var5 = new class1();
                    var5.field2 = var3;
                    var5.field1 = var3.field2829;
                    class37.method722(var5, 200000);
                }
                if (arg1 == 1 && var3.field2863 != null) {
                    if (var3.field2756 >= 0) {
                        class174 var6 = class174.method2958(var3.field2870);
                        if (var6 == null || var6.field2768 == null || var3.field2756 >= var6.field2768.length || var6.field2768[var3.field2756] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field2 = var3;
                    var7.field1 = var3.field2863;
                    class37.method722(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("ah.da(Lfw;B)V")
    public static void method791(class174 arg0) {
        if (field492 == arg0.field2887) {
            field517[arg0.field2886] = true;
        }
    }

    @ObfuscatedName("es.dy(I)V")
    public static void method2674() {
        for (class4 var0 = (class4) field449.method3558(); var0 != null; var0 = (class4) field449.method3556()) {
            int var1 = var0.field65;
            if (class174.method2723(var1)) {
                boolean var2 = true;
                class174[] var3 = Statics.field2771[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2861;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3116;
                    class174 var6 = class174.method2958(var5);
                    if (var6 != null) {
                        method791(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("w.dg([Ljava/lang/String;I)[Ljava/lang/String;")
    public static final String[] method200(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("q.ds(IS)V")
    public static final void method161(int arg0) {
        if (!class174.method2723(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2771[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2877 = 0;
                var3.field2744 = 0;
            }
        }
    }

    @ObfuscatedName("z.do(II)V")
    public static final void method626(int arg0) {
        if (class174.method2723(arg0)) {
            method2107(Statics.field2771[arg0], -1);
        }
    }

    @ObfuscatedName("cn.dl([Lfw;II)V")
    public static final void method2107(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2774 == arg1 && (!var3.field2861 || !method104(var3))) {
                if (var3.field2799 == 0) {
                    if (!var3.field2861 && method104(var3) && Statics.field1235 != var3) {
                        continue;
                    }
                    method2107(arg0, var3.field2870);
                    if (var3.field2768 != null) {
                        method2107(var3.field2768, var3.field2870);
                    }
                    class4 var4 = (class4) field449.method3555((long) var3.field2870);
                    if (var4 != null) {
                        method626(var4.field65);
                    }
                }
                if (var3.field2799 == 6) {
                    if (var3.field2757 != -1 || var3.field2784 != -1) {
                        boolean var5 = method192(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2784;
                        } else {
                            var6 = var3.field2757;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method745(var6);
                            var3.field2744 += field367;
                            while (var3.field2744 > var7.field1005[var3.field2877]) {
                                var3.field2744 -= var7.field1005[var3.field2877];
                                var3.field2877++;
                                if (var3.field2877 >= var7.field1000.length) {
                                    var3.field2877 -= var7.field1015;
                                    if (var3.field2877 < 0 || var3.field2877 >= var7.field1000.length) {
                                        var3.field2877 = 0;
                                    }
                                }
                                method791(var3);
                            }
                        }
                    }
                    if (var3.field2811 != 0 && !var3.field2861) {
                        int var8 = var3.field2811 >> 16;
                        int var9 = var3.field2811 << 16 >> 16;
                        int var10 = field367 * var8;
                        int var11 = field367 * var9;
                        var3.field2806 = var3.field2806 + var10 & 0x7FF;
                        var3.field2807 = var3.field2807 + var11 & 0x7FF;
                        method791(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("c.dp(IB)V")
    public static final void method608(int arg0) {
        method2674();
        for (class24 var1 = (class24) class24.field609.method3585(); var1 != null; var1 = (class24) class24.field609.method3590()) {
            if (var1.field618 != null) {
                var1.method617();
            }
        }
        int var2 = class53.method2969(arg0).field1170;
        if (var2 == 0) {
            return;
        }
        int var3 = class177.field2906[arg0];
        if (var2 == 1) {
            if (var3 == 1) {
                class92.method2037(0.9D);
                ((class96) Statics.field1595).method2087(0.9D);
            }
            if (var3 == 2) {
                class92.method2037(0.8D);
                ((class96) Statics.field1595).method2087(0.8D);
            }
            if (var3 == 3) {
                class92.method2037(0.7D);
                ((class96) Statics.field1595).method2087(0.7D);
            }
            if (var3 == 4) {
                class92.method2037(0.6D);
                ((class96) Statics.field1595).method2087(0.6D);
            }
            class52.method776();
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
            if (field525 != var4) {
                if (field525 == 0 && field316 != -1) {
                    class184.method2099(Statics.field262, field316, 0, var4, false);
                    field527 = false;
                } else if (var4 == 0) {
                    class184.method780();
                    field527 = false;
                } else if (class184.field2954 == 0) {
                    Statics.field2956.method3405(var4);
                } else {
                    Statics.field2957 = var4;
                }
                field525 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                field493 = 127;
            }
            if (var3 == 1) {
                field493 = 96;
            }
            if (var3 == 2) {
                field493 = 64;
            }
            if (var3 == 3) {
                field493 = 32;
            }
            if (var3 == 4) {
                field493 = 0;
            }
        }
        if (var2 == 5) {
            field475 = var3;
        }
        if (var2 == 6) {
            field450 = var3;
        }
        if (var2 == 9) {
            field451 = var3;
        }
        if (var2 == 10) {
            if (var3 == 0) {
                field350 = 127;
            }
            if (var3 == 1) {
                field350 = 96;
            }
            if (var3 == 2) {
                field350 = 64;
            }
            if (var3 == 3) {
                field350 = 32;
            }
            if (var3 == 4) {
                field350 = 0;
            }
        }
        if (var2 == 17) {
            field333 = var3 & 0xFFFF;
        }
        if (var2 == 18) {
            field319 = (class21) class110.method170(class21.method1035(), var3);
            if (field319 == null) {
                field319 = class21.field574;
            }
        }
        if (var2 == 19) {
            if (var3 == -1) {
                field465 = -1;
            } else {
                field465 = var3 & 0x7FF;
            }
        }
        if (var2 == 22) {
            field320 = (class21) class110.method170(class21.method1035(), var3);
            if (field320 == null) {
                field320 = class21.field574;
            }
        }
    }

    @ObfuscatedName("cy.dd(B)V")
    public static final void method2105() {
        field334.method2604(12);
        for (class4 var0 = (class4) field449.method3558(); var0 != null; var0 = (class4) field449.method3556()) {
            if (var0.field63 == 0 || var0.field63 == 3) {
                method621(var0, true);
            }
        }
        if (field313 != null) {
            method791(field313);
            field313 = null;
        }
    }

    @ObfuscatedName("a.di(Lb;ZI)V")
    public static final void method621(class4 arg0, boolean arg1) {
        int var2 = arg0.field65;
        int var3 = (int) arg0.field3116;
        arg0.method3679();
        if (arg1 && var2 != -1 && Statics.field2745[var2]) {
            Statics.field2803.method3072(var2);
            if (Statics.field2771[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2771[var2].length; var5++) {
                    if (Statics.field2771[var2][var5] != null) {
                        if (Statics.field2771[var2][var5].field2799 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2771[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2771[var2] = null;
                }
                Statics.field2745[var2] = false;
            }
        }
        for (class202 var6 = (class202) field490.method3558(); var6 != null; var6 = (class202) field490.method3556()) {
            if ((long) var2 == (var6.field3116 >> 48 & 0xFFFFL)) {
                var6.method3679();
            }
        }
        class174 var7 = class174.method2958(var3);
        if (var7 != null) {
            method791(var7);
        }
        method3515();
        if (field392 != -1) {
            method744(field392, 1);
        }
    }

    @ObfuscatedName("k.dn(Lfw;B)Z")
    public static final boolean method147(class174 arg0) {
        int var1 = arg0.field2759;
        if (var1 == 205) {
            field344 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field562.method3290(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field562.method3279(var4, var5 == 1);
        }
        if (var1 == 324) {
            field562.method3280(false);
        }
        if (var1 == 325) {
            field562.method3280(true);
        }
        if (var1 == 326) {
            field334.method2604(58);
            field562.method3281(field334);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("ay.dj(Lfw;IIII)V")
    public static final void method919(class174 arg0, int arg1, int arg2, int arg3) {
        method111();
        class176 var4 = arg0.method3223(false);
        if (var4 == null) {
            return;
        }
        class80.method1722(arg1, arg2, var4.field2901 + arg1, var4.field2902 + arg2);
        if (field524 == 2 || field524 == 5) {
            class80.method1741(arg1, arg2, 0, var4.field2899, var4.field2900);
        } else {
            int var5 = field501 + field375 & 0x7FF;
            int var6 = Statics.field226.field838 / 32 + 48;
            int var7 = 464 - Statics.field226.field881 / 32;
            Statics.field2912.method1648(arg1, arg2, var4.field2901, var4.field2902, var6, var7, var5, field364 + 256, var4.field2899, var4.field2900);
            for (int var8 = 0; var8 < field518; var8++) {
                int var9 = field519[var8] * 4 + 2 - Statics.field226.field838 / 32;
                int var10 = field520[var8] * 4 + 2 - Statics.field226.field881 / 32;
                method2974(arg1, arg2, var9, var10, field521[var8], var4);
            }
            for (int var11 = 0; var11 < 104; var11++) {
                for (int var12 = 0; var12 < 104; var12++) {
                    class200 var13 = field573[Statics.field213][var11][var12];
                    if (var13 != null) {
                        int var14 = var11 * 4 + 2 - Statics.field226.field838 / 32;
                        int var15 = var12 * 4 + 2 - Statics.field226.field881 / 32;
                        method2974(arg1, arg2, var14, var15, Statics.field1960[0], var4);
                    }
                }
            }
            for (int var16 = 0; var16 < field495; var16++) {
                class35 var17 = field329[field331[var16]];
                if (var17 != null && var17.method22()) {
                    class40 var18 = var17.field783;
                    if (var18 != null && var18.field911 != null) {
                        var18 = var18.method786();
                    }
                    if (var18 != null && var18.field898 && var18.field927) {
                        int var19 = var17.field838 / 32 - Statics.field226.field838 / 32;
                        int var20 = var17.field881 / 32 - Statics.field226.field881 / 32;
                        method2974(arg1, arg2, var19, var20, Statics.field1960[1], var4);
                    }
                }
            }
            int var21 = class33.field754;
            int[] var22 = class33.field762;
            for (int var23 = 0; var23 < var21; var23++) {
                class3 var24 = field303[var22[var23]];
                if (var24 != null && var24.method22() && !var24.field47 && Statics.field226 != var24) {
                    int var25 = var24.field838 / 32 - Statics.field226.field838 / 32;
                    int var26 = var24.field881 / 32 - Statics.field226.field881 / 32;
                    boolean var27 = false;
                    if (method1995(var24.field61, true)) {
                        var27 = true;
                    }
                    boolean var28 = false;
                    for (int var29 = 0; var29 < Statics.field1637; var29++) {
                        if (var24.field61.equals(Statics.field793[var29].field630)) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (Statics.field226.field58 != 0 && var24.field58 != 0 && Statics.field226.field58 == var24.field58) {
                        var30 = true;
                    }
                    if (var27) {
                        method2974(arg1, arg2, var25, var26, Statics.field1960[3], var4);
                    } else if (var30) {
                        method2974(arg1, arg2, var25, var26, Statics.field1960[4], var4);
                    } else if (var28) {
                        method2974(arg1, arg2, var25, var26, Statics.field1960[5], var4);
                    } else {
                        method2974(arg1, arg2, var25, var26, Statics.field1960[2], var4);
                    }
                }
            }
            if (field458 != 0 && field302 % 20 < 10) {
                if (field458 == 1 && field312 >= 0 && field312 < field329.length) {
                    class35 var31 = field329[field312];
                    if (var31 != null) {
                        int var32 = var31.field838 / 32 - Statics.field226.field838 / 32;
                        int var33 = var31.field881 / 32 - Statics.field226.field881 / 32;
                        method955(arg1, arg2, var32, var33, Statics.field105[1], var4);
                    }
                }
                if (field458 == 2) {
                    int var34 = field314 * 4 - Statics.field2735 * 4 + 2 - Statics.field226.field838 / 32;
                    int var35 = field315 * 4 - Statics.field577 * 4 + 2 - Statics.field226.field881 / 32;
                    method955(arg1, arg2, var34, var35, Statics.field105[1], var4);
                }
                if (field458 == 10 && field361 >= 0 && field361 < field303.length) {
                    class3 var36 = field303[field361];
                    if (var36 != null) {
                        int var37 = var36.field838 / 32 - Statics.field226.field838 / 32;
                        int var38 = var36.field881 / 32 - Statics.field226.field881 / 32;
                        method955(arg1, arg2, var37, var38, Statics.field105[1], var4);
                    }
                }
            }
            if (field483 != 0) {
                int var39 = field483 * 4 + 2 - Statics.field226.field838 / 32;
                int var40 = field523 * 4 + 2 - Statics.field226.field881 / 32;
                method2974(arg1, arg2, var39, var40, Statics.field105[0], var4);
            }
            if (!Statics.field226.field47) {
                class80.method1728(var4.field2901 / 2 + arg1 - 1, var4.field2902 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        }
        field494[arg3] = true;
    }

    @ObfuscatedName("da.de(Lfw;IIII)V")
    public static final void method2302(class174 arg0, int arg1, int arg2, int arg3) {
        class176 var4 = arg0.method3223(false);
        if (var4 == null) {
            return;
        }
        if (field524 < 3) {
            Statics.field166.method1648(arg1, arg2, var4.field2901, var4.field2902, 25, 25, field375, 256, var4.field2899, var4.field2900);
        } else {
            class80.method1741(arg1, arg2, 0, var4.field2899, var4.field2900);
        }
    }

    @ObfuscatedName("aw.dm(IIIILcr;Lfc;I)V")
    public static final void method955(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2974(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field501 + field375 & 0x7FF;
        int var8 = class92.field1598[var7];
        int var9 = class92.field1578[var7];
        int var10 = var8 * 256 / (field364 + 256);
        int var11 = var9 * 256 / (field364 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field3052.method1713(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("fy.dk(IIIILcr;Lfc;I)V")
    public static final void method2974(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field501 + field375 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1598[var6];
        int var9 = class92.field1578[var6];
        int var10 = var8 * 256 / (field364 + 256);
        int var11 = var9 * 256 / (field364 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1624(arg5.field2901 / 2 + var12 - arg4.field1413 / 2, arg5.field2902 / 2 - var13 - arg4.field1416 / 2, arg0, arg1, arg5.field2901, arg5.field2902, arg5.field2899, arg5.field2900);
        } else {
            arg4.method1637(arg5.field2901 / 2 + arg0 + var12 - arg4.field1413 / 2, arg5.field2902 / 2 + arg1 - var13 - arg4.field1416 / 2);
        }
    }

    @ObfuscatedName("cv.dz(Ljava/lang/String;ZI)Z")
    public static boolean method1995(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class165.method2795(arg0, Statics.field295);
        for (int var3 = 0; var3 < field556; var3++) {
            if (var2.equalsIgnoreCase(class165.method2795(field558[var3].field255, Statics.field295)) && (!arg1 || field558[var3].field250 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class165.method2795(Statics.field226.field61, Statics.field295))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("x.dx(Ljava/lang/String;B)Z")
    public static boolean method44(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method2795(arg0, Statics.field295);
        for (int var2 = 0; var2 < field560; var2++) {
            class8 var3 = field561[var2];
            if (var1.equalsIgnoreCase(class165.method2795(var3.field135, Statics.field295))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method2795(var3.field138, Statics.field295))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("fz.df(Ljava/lang/String;B)V")
    public static final void method3051(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field556 < 200 || field413 == 1) || field556 >= 400) {
            class12.method1120(30, "", class158.field2471);
            return;
        }
        String var1 = class165.method2795(arg0, Statics.field295);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field556; var2++) {
            class18 var3 = field558[var2];
            String var4 = class165.method2795(var3.field255, Statics.field295);
            if (var4 != null && var4.equals(var1)) {
                class12.method1120(30, "", arg0 + class158.field2455);
                return;
            }
            if (var3.field249 != null) {
                String var5 = class165.method2795(var3.field249, Statics.field295);
                if (var5 != null && var5.equals(var1)) {
                    class12.method1120(30, "", arg0 + class158.field2455);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field560; var6++) {
            class8 var7 = field561[var6];
            String var8 = class165.method2795(var7.field135, Statics.field295);
            if (var8 != null && var8.equals(var1)) {
                class12.method1120(30, "", class158.field2403 + arg0 + class158.field2328);
                return;
            }
            if (var7.field138 != null) {
                String var9 = class165.method2795(var7.field138, Statics.field295);
                if (var9 != null && var9.equals(var1)) {
                    class12.method1120(30, "", class158.field2403 + arg0 + class158.field2328);
                    return;
                }
            }
        }
        if (class165.method2795(Statics.field226.field61, Statics.field295).equals(var1)) {
            class12.method1120(30, "", class158.field2503);
        } else {
            field334.method2604(251);
            field334.method2485(class120.method622(arg0));
            field334.method2376(arg0);
        }
    }

    @ObfuscatedName("br.db(Ljava/lang/String;ZI)V")
    public static final void method1544(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field560 < 100 || field413 == 1) || field560 >= 400) {
            class12.method1120(31, "", class158.field2473);
            return;
        }
        String var2 = class165.method2795(arg0, Statics.field295);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field560; var3++) {
            class8 var4 = field561[var3];
            String var5 = class165.method2795(var4.field135, Statics.field295);
            if (var5 != null && var5.equals(var2)) {
                class12.method1120(31, "", arg0 + class158.field2474);
                return;
            }
            if (var4.field138 != null) {
                String var6 = class165.method2795(var4.field138, Statics.field295);
                if (var6 != null && var6.equals(var2)) {
                    class12.method1120(31, "", arg0 + class158.field2474);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field556; var7++) {
            class18 var8 = field558[var7];
            String var9 = class165.method2795(var8.field255, Statics.field295);
            if (var9 != null && var9.equals(var2)) {
                class12.method1120(31, "", class158.field2560 + arg0 + class158.field2480);
                return;
            }
            if (var8.field249 != null) {
                String var10 = class165.method2795(var8.field249, Statics.field295);
                if (var10 != null && var10.equals(var2)) {
                    class12.method1120(31, "", class158.field2560 + arg0 + class158.field2480);
                    return;
                }
            }
        }
        if (class165.method2795(Statics.field226.field61, Statics.field295).equals(var2)) {
            class12.method1120(31, "", class158.field2476);
        } else {
            field334.method2604(48);
            field334.method2485(class120.method622(arg0));
            field334.method2376(arg0);
        }
    }

    @ObfuscatedName("ai.dv(Ljava/lang/String;II)V")
    public static final void method766(String arg0, int arg1) {
        field334.method2604(205);
        field334.method2485(class120.method622(arg0) + 1);
        field334.method2376(arg0);
        field334.method2380(arg1);
    }

    @ObfuscatedName("cn.dt(Ljava/lang/String;S)V")
    public static final void method2106(String arg0) {
        if (Statics.field793 != null) {
            field334.method2604(212);
            field334.method2485(class120.method622(arg0));
            field334.method2376(arg0);
        }
    }

    @ObfuscatedName("ee.es(Ljava/lang/String;B)V")
    public static final void method2953(String arg0) {
        if (!arg0.equals("")) {
            field334.method2604(114);
            field334.method2485(class120.method622(arg0));
            field334.method2376(arg0);
        }
    }

    @ObfuscatedName("am.ea(I)V")
    public static final void method752() {
        field334.method2604(114);
        field334.method2485(0);
    }

    @ObfuscatedName("w.eg(Lfw;I)I")
    public static int method198(class174 arg0) {
        class202 var1 = (class202) field490.method3555(((long) arg0.field2870 << 32) + (long) arg0.field2756);
        return var1 == null ? arg0.field2827 : var1.field3103;
    }

    @ObfuscatedName("bi.ej(Lfw;B)Lfw;")
    public static class174 method1590(class174 arg0) {
        int var1 = method198(arg0);
        int var2 = var1 >> 17 & 0x7;
        int var3 = var2;
        if (var2 == 0) {
            return null;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            arg0 = class174.method2958(arg0.field2774);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("n.ef(Lfw;I)Z")
    public static boolean method104(class174 arg0) {
        if (field535) {
            if (method198(arg0) != 0) {
                return false;
            }
            if (arg0.field2799 == 0) {
                return false;
            }
        }
        return arg0.field2775;
    }

    @ObfuscatedName("cm.eh(Lfw;IB)Ljava/lang/String;")
    public static String method1826(class174 arg0, int arg1) {
        if (!class179.method3136(method198(arg0), arg1) && arg0.field2860 == null) {
            return null;
        } else if (arg0.field2855 == null || arg0.field2855.length <= arg1 || arg0.field2855[arg1] == null || arg0.field2855[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2855[arg1];
        }
    }

    @ObfuscatedName("cx.ei(Ljava/lang/String;ZS)Ljava/lang/String;")
    public static String method1822(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field294 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field294 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field294 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field294 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field294 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field414 != null) {
            var3 = "/p=" + Statics.field414;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field298 + "/a=" + Statics.field221 + var3 + "/";
    }

    @ObfuscatedName("k.ek(Ljava/lang/String;I)V")
    public static void method144(String arg0) {
        Statics.field414 = arg0;
        try {
            String var1 = Statics.field531.getParameter(class191.field3066.field3070);
            String var2 = Statics.field531.getParameter(class191.field3068.field3070);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class112.method3511(class116.method2672() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class133.method2690(Statics.field531, "document.cookie=\"" + var4 + "\"");
        } catch (Throwable var6) {
        }
    }

    @ObfuscatedName("bh.et(Ljava/lang/String;ZI)V")
    public static void method1522(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field74; var5++) {
            class52 var6 = class52.method2827(var5);
            if ((!arg1 || var6.field1161) && var6.field1154 == -1 && var6.field1129.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field626 = -1;
                    Statics.field1875 = null;
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
        Statics.field1875 = var3;
        Statics.field2648 = 0;
        Statics.field626 = var4;
        String[] var9 = new String[Statics.field626];
        for (int var10 = 0; var10 < Statics.field626; var10++) {
            var9[var10] = class52.method2827(var3[var10]).field1129;
        }
        class125.method185(var9, Statics.field1875);
    }
}

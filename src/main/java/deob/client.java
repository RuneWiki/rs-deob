package deob;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.Socket;
import java.util.Iterator;
import netscape.javascript.JSObject;

public final class client extends class145 {

    @ObfuscatedName("client.w")
    public static class109[] field362 = new class109[4];

    @ObfuscatedName("client.c")
    public static boolean field296 = true;

    @ObfuscatedName("client.k")
    public static int field297 = 1;

    @ObfuscatedName("client.r")
    public static int field432 = 0;

    @ObfuscatedName("client.q")
    public static int field353 = 0;

    @ObfuscatedName("client.z")
    public static boolean field302 = false;

    @ObfuscatedName("client.i")
    public static boolean field303 = false;

    @ObfuscatedName("client.t")
    public static int field373 = 0;

    @ObfuscatedName("client.h")
    public static int field555 = 0;

    @ObfuscatedName("client.s")
    public static boolean field508 = true;

    @ObfuscatedName("client.f")
    public static int field307 = 0;

    @ObfuscatedName("client.b")
    public static long field305 = 1L;

    @ObfuscatedName("client.o")
    public static int field309 = -1;

    @ObfuscatedName("client.v")
    public static int field310 = -1;

    @ObfuscatedName("client.ad")
    public static int field311 = -1;

    @ObfuscatedName("client.ar")
    public static boolean field301 = true;

    @ObfuscatedName("client.ah")
    public static boolean field313 = false;

    @ObfuscatedName("client.ay")
    public static int field314 = 0;

    @ObfuscatedName("client.af")
    public static int field315 = 0;

    @ObfuscatedName("client.al")
    public static int field316 = 0;

    @ObfuscatedName("client.ai")
    public static int field317 = 0;

    @ObfuscatedName("client.an")
    public static int field392 = 0;

    @ObfuscatedName("client.az")
    public static int field319 = 0;

    @ObfuscatedName("client.ac")
    public static int field320 = 0;

    @ObfuscatedName("client.ao")
    public static int field321 = 0;

    @ObfuscatedName("client.ax")
    public static int field322 = 0;

    @ObfuscatedName("client.ae")
    public static class21 field323 = class21.field586;

    @ObfuscatedName("client.au")
    public static class21 field509 = class21.field586;

    @ObfuscatedName("client.aj")
    public static int field325 = 0;

    @ObfuscatedName("client.ap")
    public static int field326 = 0;

    @ObfuscatedName("client.ak")
    public static int field327 = 0;

    @ObfuscatedName("client.bz")
    public static int field328 = 0;

    @ObfuscatedName("client.bn")
    public static int field329 = 0;

    @ObfuscatedName("client.bt")
    public static int field330 = 0;

    @ObfuscatedName("client.be")
    public static int field393 = 0;

    @ObfuscatedName("client.bx")
    public static int field332 = 0;

    @ObfuscatedName("client.cu")
    public static class35[] field547 = new class35[32768];

    @ObfuscatedName("client.cg")
    public static int field344 = 0;

    @ObfuscatedName("client.cv")
    public static int[] field336 = new int[32768];

    @ObfuscatedName("client.ce")
    public static int field337 = 0;

    @ObfuscatedName("client.cr")
    public static int[] field338 = new int[250];

    @ObfuscatedName("client.cs")
    public static class123 field339 = new class123(5000);

    @ObfuscatedName("client.cn")
    public static class123 field340 = new class123(5000);

    @ObfuscatedName("client.cj")
    public static class123 field442 = new class123(15000);

    @ObfuscatedName("client.cy")
    public static int field342 = 0;

    @ObfuscatedName("client.cm")
    public static int field395 = 0;

    @ObfuscatedName("client.cb")
    public static int field372 = 0;

    @ObfuscatedName("client.ci")
    public static int field417 = 0;

    @ObfuscatedName("client.ch")
    public static int field472 = 0;

    @ObfuscatedName("client.co")
    public static int field577 = 0;

    @ObfuscatedName("client.cq")
    public static int field437 = 0;

    @ObfuscatedName("client.cc")
    public static int field402 = 0;

    @ObfuscatedName("client.ck")
    public static boolean field350 = false;

    @ObfuscatedName("client.de")
    public static int field351 = 0;

    @ObfuscatedName("client.dm")
    public static int field522 = 1;

    @ObfuscatedName("client.dj")
    public static int field334 = 0;

    @ObfuscatedName("client.dn")
    public static int field354 = 1;

    @ObfuscatedName("client.df")
    public static int field347 = 0;

    @ObfuscatedName("client.dv")
    public static boolean field357 = false;

    @ObfuscatedName("client.ds")
    public static int[][][] field530 = new int[4][13][13];

    @ObfuscatedName("client.dl")
    public static final int[] field359 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @ObfuscatedName("client.dd")
    public static int field360 = 0;

    @ObfuscatedName("client.du")
    public static int field361 = 2;

    @ObfuscatedName("client.dq")
    public static int field569 = 0;

    @ObfuscatedName("client.da")
    public static int field363 = 2;

    @ObfuscatedName("client.dt")
    public static int field364 = 0;

    @ObfuscatedName("client.eh")
    public static int field365 = 1;

    @ObfuscatedName("client.ee")
    public static int field385 = 0;

    @ObfuscatedName("client.ep")
    public static int field444 = 0;

    @ObfuscatedName("client.ei")
    public static int field368 = 2;

    @ObfuscatedName("client.ec")
    public static int field369 = 0;

    @ObfuscatedName("client.eb")
    public static int field370 = 1;

    @ObfuscatedName("client.ek")
    public static int field371 = 0;

    @ObfuscatedName("client.er")
    public static int field428 = 0;

    @ObfuscatedName("client.ed")
    public static int field550 = 2301979;

    @ObfuscatedName("client.ew")
    public static int field374 = 5063219;

    @ObfuscatedName("client.eg")
    public static int field375 = 3353893;

    @ObfuscatedName("client.ev")
    public static int field376 = 7759444;

    @ObfuscatedName("client.el")
    public static boolean field377 = false;

    @ObfuscatedName("client.fm")
    public static int field469 = 0;

    @ObfuscatedName("client.fe")
    public static int field565 = 128;

    @ObfuscatedName("client.fs")
    public static int field380 = 0;

    @ObfuscatedName("client.fn")
    public static int field358 = 0;

    @ObfuscatedName("client.fo")
    public static int field382 = 0;

    @ObfuscatedName("client.fy")
    public static int field383 = 0;

    @ObfuscatedName("client.ft")
    public static int field384 = 0;

    @ObfuscatedName("client.fb")
    public static int field557 = 50;

    @ObfuscatedName("client.fg")
    public static int field356 = 0;

    @ObfuscatedName("client.fw")
    public static boolean field349 = false;

    @ObfuscatedName("client.fa")
    public static int field388 = 0;

    @ObfuscatedName("client.fp")
    public static int field389 = 0;

    @ObfuscatedName("client.fz")
    public static int field390 = 50;

    @ObfuscatedName("client.fh")
    public static int[] field391 = new int[field390];

    @ObfuscatedName("client.fj")
    public static int[] field534 = new int[field390];

    @ObfuscatedName("client.fr")
    public static int[] field567 = new int[field390];

    @ObfuscatedName("client.fq")
    public static int[] field420 = new int[field390];

    @ObfuscatedName("client.fu")
    public static int[] field460 = new int[field390];

    @ObfuscatedName("client.fv")
    public static int[] field503 = new int[field390];

    @ObfuscatedName("client.gy")
    public static int[] field397 = new int[field390];

    @ObfuscatedName("client.gg")
    public static String[] field489 = new String[field390];

    @ObfuscatedName("client.gr")
    public static int[][] field399 = new int[104][104];

    @ObfuscatedName("client.go")
    public static int field400 = 0;

    @ObfuscatedName("client.gq")
    public static int field401 = -1;

    @ObfuscatedName("client.gc")
    public static int field294 = -1;

    @ObfuscatedName("client.gx")
    public static int field403 = 0;

    @ObfuscatedName("client.gj")
    public static int field404 = 0;

    @ObfuscatedName("client.gd")
    public static int field405 = 0;

    @ObfuscatedName("client.gu")
    public static int field468 = 0;

    @ObfuscatedName("client.ga")
    public static int field407 = 0;

    @ObfuscatedName("client.gk")
    public static int field408 = 0;

    @ObfuscatedName("client.gw")
    public static int field409 = 0;

    @ObfuscatedName("client.gz")
    public static int field415 = 0;

    @ObfuscatedName("client.gl")
    public static int field378 = 0;

    @ObfuscatedName("client.gm")
    public static int field412 = 0;

    @ObfuscatedName("client.gv")
    public static boolean field413 = false;

    @ObfuscatedName("client.gt")
    public static int field414 = 0;

    @ObfuscatedName("client.gn")
    public static int field367 = 0;

    @ObfuscatedName("client.gb")
    public static class3[] field551 = new class3[2048];

    @ObfuscatedName("client.gh")
    public static int field458 = -1;

    @ObfuscatedName("client.ha")
    public static int field418 = 0;

    @ObfuscatedName("client.hj")
    public static int field419 = 0;

    @ObfuscatedName("client.hh")
    public static int[] field381 = new int[1000];

    @ObfuscatedName("client.ho")
    public static final int[] field421 = new int[] { 44, 45, 46, 47, 48, 49, 50, 51 };

    @ObfuscatedName("client.hd")
    public static String[] field318 = new String[8];

    @ObfuscatedName("client.hi")
    public static boolean[] field423 = new boolean[8];

    @ObfuscatedName("client.hp")
    public static int[] field424 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @ObfuscatedName("client.hc")
    public static int field425 = -1;

    @ObfuscatedName("client.hm")
    public static class200[][][] field426 = new class200[4][104][104];

    @ObfuscatedName("client.hg")
    public static class200 field427 = new class200();

    @ObfuscatedName("client.hx")
    public static class200 field450 = new class200();

    @ObfuscatedName("client.hz")
    public static class200 field429 = new class200();

    @ObfuscatedName("client.hl")
    public static int[] field430 = new int[25];

    @ObfuscatedName("client.hy")
    public static int[] field431 = new int[25];

    @ObfuscatedName("client.hr")
    public static int[] field480 = new int[25];

    @ObfuscatedName("client.hk")
    public static int field433 = 0;

    @ObfuscatedName("client.ht")
    public static boolean field434 = false;

    @ObfuscatedName("client.hb")
    public static int field435 = 0;

    @ObfuscatedName("client.hv")
    public static int[] field436 = new int[500];

    @ObfuscatedName("client.ii")
    public static int[] field526 = new int[500];

    @ObfuscatedName("client.iu")
    public static int[] field438 = new int[500];

    @ObfuscatedName("client.ik")
    public static int[] field501 = new int[500];

    @ObfuscatedName("client.ij")
    public static String[] field440 = new String[500];

    @ObfuscatedName("client.im")
    public static String[] field441 = new String[500];

    @ObfuscatedName("client.ih")
    public static int field341 = -1;

    @ObfuscatedName("client.il")
    public static int field443 = -1;

    @ObfuscatedName("client.id")
    public static int field411 = 0;

    @ObfuscatedName("client.if")
    public static int field445 = 50;

    @ObfuscatedName("client.io")
    public static int field449 = 0;

    @ObfuscatedName("client.it")
    public static String field379 = null;

    @ObfuscatedName("client.ie")
    public static boolean field448 = false;

    @ObfuscatedName("client.ig")
    public static int field387 = -1;

    @ObfuscatedName("client.ix")
    public static int field394 = -1;

    @ObfuscatedName("client.ic")
    public static String field298 = null;

    @ObfuscatedName("client.is")
    public static String field535 = null;

    @ObfuscatedName("client.iq")
    public static int field453 = -1;

    @ObfuscatedName("client.iz")
    public static class197 field454 = new class197(8);

    @ObfuscatedName("client.jh")
    public static int field455 = 0;

    @ObfuscatedName("client.jy")
    public static int field456 = 0;

    @ObfuscatedName("client.je")
    public static class174 field527 = null;

    @ObfuscatedName("client.jx")
    public static int field492 = 0;

    @ObfuscatedName("client.jp")
    public static int field459 = 0;

    @ObfuscatedName("client.jf")
    public static int field346 = 0;

    @ObfuscatedName("client.jm")
    public static int field461 = -1;

    @ObfuscatedName("client.ja")
    public static boolean field462 = false;

    @ObfuscatedName("client.jg")
    public static boolean field463 = false;

    @ObfuscatedName("client.jd")
    public static boolean field464 = false;

    @ObfuscatedName("client.jb")
    public static class174 field471 = null;

    @ObfuscatedName("client.jo")
    public static class174 field466 = null;

    @ObfuscatedName("client.jl")
    public static class174 field410 = null;

    @ObfuscatedName("client.jt")
    public static int field465 = 0;

    @ObfuscatedName("client.ju")
    public static int field486 = 0;

    @ObfuscatedName("client.jc")
    public static class174 field470 = null;

    @ObfuscatedName("client.js")
    public static boolean field499 = false;

    @ObfuscatedName("client.jq")
    public static int field451 = -1;

    @ObfuscatedName("client.jz")
    public static int field473 = -1;

    @ObfuscatedName("client.jw")
    public static boolean field474 = false;

    @ObfuscatedName("client.jk")
    public static int field475 = -1;

    @ObfuscatedName("client.ji")
    public static int field476 = -1;

    @ObfuscatedName("client.jj")
    public static boolean field477 = false;

    @ObfuscatedName("client.km")
    public static int field478 = 1;

    @ObfuscatedName("client.ko")
    public static int[] field490 = new int[32];

    @ObfuscatedName("client.kr")
    public static int field481 = 0;

    @ObfuscatedName("client.ks")
    public static int[] field482 = new int[32];

    @ObfuscatedName("client.ke")
    public static int field483 = 0;

    @ObfuscatedName("client.kw")
    public static int[] field484 = new int[32];

    @ObfuscatedName("client.kn")
    public static int field485 = 0;

    @ObfuscatedName("client.ka")
    public static int field304 = 0;

    @ObfuscatedName("client.kc")
    public static int field487 = 0;

    @ObfuscatedName("client.kv")
    public static int field488 = 0;

    @ObfuscatedName("client.kx")
    public static int field406 = 0;

    @ObfuscatedName("client.ki")
    public static int field366 = 0;

    @ObfuscatedName("client.kq")
    public static int field343 = 0;

    @ObfuscatedName("client.ky")
    public static int field572 = 0;

    @ObfuscatedName("client.ku")
    public static class200 field493 = new class200();

    @ObfuscatedName("client.kt")
    public static class200 field494 = new class200();

    @ObfuscatedName("client.kf")
    public static class200 field495 = new class200();

    @ObfuscatedName("client.kk")
    public static class197 field496 = new class197(512);

    @ObfuscatedName("client.kj")
    public static int field497 = 0;

    @ObfuscatedName("client.kg")
    public static int field452 = -2;

    @ObfuscatedName("client.lh")
    public static boolean[] field324 = new boolean[100];

    @ObfuscatedName("client.ld")
    public static boolean[] field521 = new boolean[100];

    @ObfuscatedName("client.lt")
    public static boolean[] field355 = new boolean[100];

    @ObfuscatedName("client.lc")
    public static int[] field312 = new int[100];

    @ObfuscatedName("client.lx")
    public static int[] field498 = new int[100];

    @ObfuscatedName("client.lf")
    public static int[] field504 = new int[100];

    @ObfuscatedName("client.la")
    public static int[] field505 = new int[100];

    @ObfuscatedName("client.lo")
    public static int field506 = 0;

    @ObfuscatedName("client.lm")
    public static long field507 = 0L;

    @ObfuscatedName("client.lk")
    public static boolean field345 = true;

    @ObfuscatedName("client.ls")
    public static int field439 = 1;

    @ObfuscatedName("client.lq")
    public static int field510 = 1;

    @ObfuscatedName("client.lr")
    public static int[] field511 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @ObfuscatedName("client.lv")
    public static int field512 = 0;

    @ObfuscatedName("client.lz")
    public static int field446 = 0;

    @ObfuscatedName("client.lj")
    public static String field331 = "";

    @ObfuscatedName("client.lu")
    public static long[] field500 = new long[100];

    @ObfuscatedName("client.lg")
    public static int field516 = 0;

    @ObfuscatedName("client.lp")
    public static int field518 = 0;

    @ObfuscatedName("client.mq")
    public static int[] field519 = new int[128];

    @ObfuscatedName("client.mb")
    public static int[] field520 = new int[128];

    @ObfuscatedName("client.mi")
    public static long field352 = -1L;

    @ObfuscatedName("client.mf")
    public static String field513 = null;

    @ObfuscatedName("client.mj")
    public static String field523 = null;

    @ObfuscatedName("client.mo")
    public static int field524 = -1;

    @ObfuscatedName("client.mr")
    public static int field525 = 0;

    @ObfuscatedName("client.mx")
    public static int[] field308 = new int[1000];

    @ObfuscatedName("client.mt")
    public static int[] field566 = new int[1000];

    @ObfuscatedName("client.mw")
    public static class79[] field528 = new class79[1000];

    @ObfuscatedName("client.mk")
    public static int field529 = 0;

    @ObfuscatedName("client.md")
    public static int field348 = 0;

    @ObfuscatedName("client.ma")
    public static int field531 = 0;

    @ObfuscatedName("client.mu")
    public static int field532 = 255;

    @ObfuscatedName("client.mh")
    public static int field533 = -1;

    @ObfuscatedName("client.ml")
    public static boolean field300 = false;

    @ObfuscatedName("client.nn")
    public static int field467 = 127;

    @ObfuscatedName("client.nq")
    public static int field515 = 127;

    @ObfuscatedName("client.nv")
    public static int field537 = 0;

    @ObfuscatedName("client.ni")
    public static int[] field538 = new int[50];

    @ObfuscatedName("client.ns")
    public static int[] field335 = new int[50];

    @ObfuscatedName("client.nf")
    public static int[] field540 = new int[50];

    @ObfuscatedName("client.nw")
    public static int[] field541 = new int[50];

    @ObfuscatedName("client.nz")
    public static class59[] field542 = new class59[50];

    @ObfuscatedName("client.na")
    public static boolean field543 = false;

    @ObfuscatedName("client.og")
    public static boolean[] field544 = new boolean[5];

    @ObfuscatedName("client.od")
    public static int[] field545 = new int[5];

    @ObfuscatedName("client.oy")
    public static int[] field560 = new int[5];

    @ObfuscatedName("client.ov")
    public static int[] field539 = new int[5];

    @ObfuscatedName("client.of")
    public static int[] field548 = new int[5];

    @ObfuscatedName("client.oz")
    public static short field549 = 256;

    @ObfuscatedName("client.or")
    public static short field536 = 205;

    @ObfuscatedName("client.ou")
    public static short field422 = 256;

    @ObfuscatedName("client.op")
    public static short field546 = 320;

    @ObfuscatedName("client.om")
    public static short field553 = 1;

    @ObfuscatedName("client.oh")
    public static short field554 = 32767;

    @ObfuscatedName("client.oq")
    public static short field386 = 1;

    @ObfuscatedName("client.ol")
    public static short field556 = 32767;

    @ObfuscatedName("client.oc")
    public static int field306 = 0;

    @ObfuscatedName("client.os")
    public static int field558 = 0;

    @ObfuscatedName("client.ox")
    public static int field559 = 0;

    @ObfuscatedName("client.ok")
    public static int field457 = 0;

    @ObfuscatedName("client.oa")
    public static int field561 = 0;

    @ObfuscatedName("client.oj")
    public static int field562 = 0;

    @ObfuscatedName("client.on")
    public static int field563 = 0;

    @ObfuscatedName("client.ow")
    public static class18[] field564 = new class18[400];

    @ObfuscatedName("client.oe")
    public static class196 field502 = new class196();

    @ObfuscatedName("client.oo")
    public static int field398 = 0;

    @ObfuscatedName("client.oi")
    public static class8[] field396 = new class8[400];

    @ObfuscatedName("client.pj")
    public static class180 field568 = new class180();

    @ObfuscatedName("client.pq")
    public static int field447 = -1;

    @ObfuscatedName("client.pn")
    public static int field570 = -1;

    @ObfuscatedName("client.pd")
    public static class221[] field571 = new class221[8];

    @ObfuscatedName("client.pw")
    public static long field491 = -1L;

    @ObfuscatedName("client.pa")
    public static long field573 = -1L;

    @ObfuscatedName("client.pm")
    public static final class11 field574 = new class11();

    @ObfuscatedName("client.pv")
    public static int[] field575 = new int[50];

    @ObfuscatedName("client.pk")
    public static int[] field576 = new int[50];

    @ObfuscatedName("client.w(I)V")
    public final void method256() {
    }

    public final void init() {
        if (!this.method2947()) {
            return;
        }
        class191[] var1 = class191.method134();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class191 var3 = var1[var2];
            String var4 = this.getParameter(var3.field3076);
            if (var4 != null) {
                switch(Integer.parseInt(var3.field3076)) {
                    case 1:
                        Statics.field221 = var4;
                        break;
                    case 2:
                        field432 = Integer.parseInt(var4);
                        break;
                    case 3:
                        if (var4.equalsIgnoreCase(class2.field32)) {
                        }
                    case 4:
                    case 5:
                    case 10:
                    default:
                        break;
                    case 6:
                        int var5 = Integer.parseInt(var4);
                        class154[] var6 = class154.method52();
                        int var7 = 0;
                        class154 var9;
                        while (true) {
                            if (var7 >= var6.length) {
                                var9 = null;
                                break;
                            }
                            class154 var8 = var6[var7];
                            if (var8.field2275 == var5) {
                                var9 = var8;
                                break;
                            }
                            var7++;
                        }
                        Statics.field299 = var9;
                        break;
                    case 7:
                        Statics.field612 = Integer.parseInt(var4);
                        break;
                    case 8:
                        Statics.field2051 = Integer.parseInt(var4);
                        break;
                    case 9:
                        Statics.field22 = (class155) class110.method2766(class155.method626(), Integer.parseInt(var4));
                        if (Statics.field22 == class155.field2287) {
                            Statics.field552 = class213.field3145;
                        } else {
                            Statics.field552 = class213.field3148;
                        }
                        break;
                    case 11:
                        Statics.field777 = var4;
                        break;
                    case 12:
                        if (var4.equalsIgnoreCase(class2.field32)) {
                            field302 = true;
                        } else {
                            field302 = false;
                        }
                        break;
                    case 13:
                        field297 = Integer.parseInt(var4);
                        break;
                    case 14:
                        field373 = Integer.parseInt(var4);
                        break;
                    case 15:
                        field353 = Integer.parseInt(var4);
                }
            }
        }
        class87.field1527 = false;
        field303 = false;
        Statics.field192 = this.getCodeBase().getHost();
        String var10 = Statics.field299.field2279;
        byte var11 = 0;
        try {
            Statics.field2233 = 16;
            Statics.field1362 = var11;
            try {
                Statics.field3136 = System.getProperty("os.name");
            } catch (Exception var63) {
                Statics.field3136 = "Unknown";
            }
            Statics.field774 = Statics.field3136.toLowerCase();
            try {
                Statics.field627 = System.getProperty("user.home");
                if (Statics.field627 != null) {
                    Statics.field627 = Statics.field627 + "/";
                }
            } catch (Exception var62) {
            }
            try {
                if (Statics.field774.startsWith("win")) {
                    if (Statics.field627 == null) {
                        Statics.field627 = System.getenv("USERPROFILE");
                    }
                } else if (Statics.field627 == null) {
                    Statics.field627 = System.getenv("HOME");
                }
                if (Statics.field627 != null) {
                    Statics.field627 = Statics.field627 + "/";
                }
            } catch (Exception var61) {
            }
            if (Statics.field627 == null) {
                Statics.field627 = "~/";
            }
            Statics.field589 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", Statics.field627, "/tmp/", "" };
            Statics.field2174 = new String[] { ".jagex_cache_" + Statics.field1362, ".file_store_" + Statics.field1362 };
            int var15 = 0;
            label301: while (var15 < 4) {
                String var16 = var15 == 0 ? "" : "" + var15;
                Statics.field2231 = new File(Statics.field627, "jagex_cl_oldschool_" + var10 + var16 + ".dat");
                String var17 = null;
                String var18 = null;
                boolean var19 = false;
                if (Statics.field2231.exists()) {
                    try {
                        class228 var20 = new class228(Statics.field2231, "rw", 10000L);
                        class120 var21 = new class120((int) var20.method3935());
                        while (var21.field1993 < var21.field1994.length) {
                            int var22 = var20.method3937(var21.field1994, var21.field1993, var21.field1994.length - var21.field1993);
                            if (var22 == -1) {
                                throw new IOException();
                            }
                            var21.field1993 += var22;
                        }
                        var21.field1993 = 0;
                        int var23 = var21.method2462();
                        if (var23 < 1 || var23 > 3) {
                            throw new IOException("" + var23);
                        }
                        int var24 = 0;
                        if (var23 > 1) {
                            var24 = var21.method2462();
                        }
                        if (var23 <= 2) {
                            var17 = var21.method2471();
                            if (var24 == 1) {
                                var18 = var21.method2471();
                            }
                        } else {
                            var17 = var21.method2472();
                            if (var24 == 1) {
                                var18 = var21.method2472();
                            }
                        }
                        var20.method3934();
                    } catch (IOException var66) {
                        var66.printStackTrace();
                    }
                    if (var17 != null) {
                        File var26 = new File(var17);
                        if (!var26.exists()) {
                            var17 = null;
                        }
                    }
                    if (var17 != null) {
                        File var27 = new File(var17, "test.dat");
                        if (!class150.method2032(var27, true)) {
                            var17 = null;
                        }
                    }
                }
                if (var17 == null && var15 == 0) {
                    label275: for (int var28 = 0; var28 < Statics.field2174.length; var28++) {
                        for (int var29 = 0; var29 < Statics.field589.length; var29++) {
                            File var30 = new File(Statics.field589[var29] + Statics.field2174[var28] + File.separatorChar + "oldschool" + File.separatorChar);
                            if (var30.exists() && class150.method2032(new File(var30, "test.dat"), true)) {
                                var17 = var30.toString();
                                var19 = true;
                                break label275;
                            }
                        }
                    }
                }
                if (var17 == null) {
                    var17 = Statics.field627 + File.separatorChar + "jagexcache" + var16 + File.separatorChar + "oldschool" + File.separatorChar + var10 + File.separatorChar;
                    var19 = true;
                }
                if (var18 != null) {
                    File var31 = new File(var18);
                    File var32 = new File(var17);
                    try {
                        File[] var33 = var31.listFiles();
                        File[] var34 = var33;
                        for (int var35 = 0; var35 < var34.length; var35++) {
                            File var36 = var34[var35];
                            File var37 = new File(var32, var36.getName());
                            boolean var38 = var36.renameTo(var37);
                            if (!var38) {
                                throw new IOException();
                            }
                        }
                    } catch (Exception var65) {
                        var65.printStackTrace();
                    }
                    var19 = true;
                }
                if (var19) {
                    File var40 = new File(var17);
                    Object var41 = null;
                    try {
                        class228 var42 = new class228(Statics.field2231, "rw", 10000L);
                        class120 var43 = new class120(500);
                        var43.method2452(3);
                        var43.method2452(var41 == null ? 0 : 1);
                        var43.method2642(var40.getPath());
                        if (var41 != null) {
                            var43.method2642(((File) var41).getPath());
                        }
                        var42.method3933(var43.field1994, 0, var43.field1993);
                        var42.method3934();
                    } catch (IOException var60) {
                        var60.printStackTrace();
                    }
                }
                File var45 = new File(var17);
                Statics.field2234 = var45;
                if (!Statics.field2234.exists()) {
                    Statics.field2234.mkdirs();
                }
                File[] var46 = Statics.field2234.listFiles();
                if (var46 != null) {
                    File[] var47 = var46;
                    for (int var48 = 0; var48 < var47.length; var48++) {
                        File var49 = var47[var48];
                        if (!class150.method2032(var49, false)) {
                            var15++;
                            continue label301;
                        }
                    }
                }
                break;
            }
            File var50 = Statics.field2234;
            Statics.field2091 = var50;
            if (!Statics.field2091.exists()) {
                throw new RuntimeException("");
            }
            class136.field2082 = true;
            try {
                File var51 = new File(Statics.field627, "random.dat");
                if (var51.exists()) {
                    class150.field2235 = new class229(new class228(var51, "rw", 25L), 24, 0);
                } else {
                    label224: for (int var52 = 0; var52 < Statics.field2174.length; var52++) {
                        for (int var53 = 0; var53 < Statics.field589.length; var53++) {
                            File var54 = new File(Statics.field589[var53] + Statics.field2174[var52] + File.separatorChar + "random.dat");
                            if (var54.exists()) {
                                class150.field2235 = new class229(new class228(var54, "rw", 25L), 24, 0);
                                break label224;
                            }
                        }
                    }
                }
                if (class150.field2235 == null) {
                    RandomAccessFile var55 = new RandomAccessFile(var51, "rw");
                    int var56 = var55.read();
                    var55.seek(0L);
                    var55.write(var56);
                    var55.seek(0L);
                    var55.close();
                    class150.field2235 = new class229(new class228(var51, "rw", 25L), 24, 0);
                }
            } catch (IOException var64) {
            }
            class150.field2236 = new class229(new class228(class136.method2037("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
            class150.field2237 = new class229(new class228(class136.method2037("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
            Statics.field1559 = new class229[Statics.field2233];
            for (int var58 = 0; var58 < Statics.field2233; var58++) {
                Statics.field1559[var58] = new class229(new class228(class136.method2037("main_file_cache.idx" + var58), "rw", 1048576L), 6000, 0);
            }
        } catch (Exception var67) {
            class149.method650((String) null, var67);
        }
        Statics.field295 = this;
        this.method3014(765, 503, 112);
    }

    @ObfuscatedName("client.c(I)V")
    public final void method288() {
        Statics.field681 = field353 == 0 ? 43594 : field297 + 40000;
        Statics.field333 = field353 == 0 ? 443 : field297 + 50000;
        Statics.field1001 = Statics.field681;
        Statics.field265 = class175.field2894;
        Statics.field2926 = class175.field2895;
        Statics.field3019 = class175.field2899;
        Statics.field2923 = class175.field2897;
        class138.method2392();
        Canvas var1 = Statics.field2586;
        var1.setFocusTraversalKeysEnabled(false);
        var1.addKeyListener(class138.field2118);
        var1.addFocusListener(class138.field2118);
        Canvas var2 = Statics.field2586;
        var2.addMouseListener(class141.field2146);
        var2.addMouseMotionListener(class141.field2146);
        var2.addFocusListener(class141.field2146);
        class146 var3;
        try {
            var3 = new class146();
        } catch (Throwable var17) {
            var3 = null;
        }
        Statics.field61 = var3;
        if (Statics.field61 != null) {
            Statics.field61.method2791(Statics.field2586);
        }
        Statics.field2073 = new class135(255, class150.field2236, class150.field2237, 500000);
        class228 var5 = null;
        class9 var6 = new class9();
        try {
            var5 = class150.method186("", Statics.field22.field2281, false);
            byte[] var7 = new byte[(int) var5.method3935()];
            int var9;
            for (int var8 = 0; var8 < var7.length; var8 += var9) {
                var9 = var5.method3937(var7, var8, var7.length - var8);
                if (var9 == -1) {
                    throw new IOException();
                }
            }
            var6 = new class9(new class120(var7));
        } catch (Exception var18) {
        }
        try {
            if (var5 != null) {
                var5.method3934();
            }
        } catch (Exception var16) {
        }
        Statics.field2079 = var6;
        Statics.field794 = this.getToolkit().getSystemClipboard();
        String var14 = Statics.field629;
        class139.field2138 = this;
        class139.field2136 = var14;
        if (field353 != 0) {
            field313 = true;
        }
        int var15 = Statics.field2079.field146;
        field507 = 0L;
        if (var15 >= 2) {
            field345 = true;
        } else {
            field345 = false;
        }
        method158();
        if (field555 >= 25) {
            method792();
        }
        field2198 = true;
    }

    @ObfuscatedName("client.y(I)V")
    public final void method259() {
        field307++;
        this.method262();
        class171.method655();
        class184.method815();
        method913();
        class138 var1 = class138.field2118;
        synchronized (class138.field2118) {
            class138.field2128++;
            class138.field2125 = class138.field2127;
            class138.field2124 = 0;
            if (class138.field2120 >= 0) {
                while (class138.field2131 != class138.field2120) {
                    int var3 = class138.field2122[class138.field2131];
                    class138.field2131 = class138.field2131 + 1 & 0x7F;
                    if (var3 < 0) {
                        class138.field2116[~var3] = false;
                    } else {
                        if (!class138.field2116[var3] && class138.field2124 < class138.field2123.length - 1) {
                            class138.field2123[++class138.field2124 - 1] = var3;
                        }
                        class138.field2116[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class138.field2116[var2] = false;
                }
                class138.field2120 = class138.field2131;
            }
            class138.field2127 = class138.field2126;
        }
        class141 var5 = class141.field2146;
        synchronized (class141.field2146) {
            class141.field2148 = class141.field2149;
            class141.field2152 = class141.field2163;
            class141.field2162 = class141.field2150;
            class141.field2158 = class141.field2154;
            class141.field2161 = class141.field2155;
            class141.field2160 = class141.field2156;
            class141.field2159 = class141.field2157;
            class141.field2154 = 0;
        }
        if (Statics.field61 != null) {
            int var7 = Statics.field61.method2794();
            field572 = var7;
        }
        if (field555 == 0) {
            method190();
            Statics.field1092.method2803();
            for (int var8 = 0; var8 < 32; var8++) {
                field2197[var8] = 0L;
            }
            for (int var9 = 0; var9 < 32; var9++) {
                field2195[var9] = 0L;
            }
            Statics.field1098 = 0;
        } else if (field555 == 5) {
            class32.method925(this);
            method190();
            Statics.field1092.method2803();
            for (int var10 = 0; var10 < 32; var10++) {
                field2197[var10] = 0L;
            }
            for (int var11 = 0; var11 < 32; var11++) {
                field2195[var11] = 0L;
            }
            Statics.field1098 = 0;
        } else if (field555 == 10 || field555 == 11) {
            class32.method925(this);
        } else if (field555 == 20) {
            class32.method925(this);
            method162();
        } else if (field555 == 25) {
            method808();
        }
        if (field555 == 30) {
            Statics.method3124();
        } else if (field555 == 40 || field555 == 45) {
            method162();
        }
    }

    @ObfuscatedName("client.k(I)V")
    public final void method260() {
        boolean var1;
        label261: {
            try {
                if (class184.field2968 == 2) {
                    if (Statics.field2972 == null) {
                        Statics.field2972 = class181.method3365(Statics.field1966, Statics.field2964, Statics.field2969);
                        if (Statics.field2972 == null) {
                            var1 = false;
                            break label261;
                        }
                    }
                    if (Statics.field2224 == null) {
                        Statics.field2224 = new class60(Statics.field2971, Statics.field2965);
                    }
                    if (Statics.field2974.method3486(Statics.field2972, Statics.field2970, Statics.field2224, 22050)) {
                        Statics.field2974.method3487();
                        Statics.field2974.method3456(Statics.field2967);
                        Statics.field2974.method3460(Statics.field2972, Statics.field1569);
                        class184.field2968 = 0;
                        Statics.field2972 = null;
                        Statics.field2224 = null;
                        Statics.field1966 = null;
                        var1 = true;
                        break label261;
                    }
                }
            } catch (Exception var35) {
                var35.printStackTrace();
                Statics.field2974.method3461();
                class184.field2968 = 0;
                Statics.field2972 = null;
                Statics.field2224 = null;
                Statics.field1966 = null;
            }
            var1 = false;
        }
        if (var1 && field300 && Statics.field1628 != null) {
            Statics.field1628.method1269();
        }
        if (field555 == 10 || field555 == 20 || field555 == 30) {
            if (field507 != 0L && class116.method2781() > field507) {
                int var4 = method669();
                field507 = 0L;
                if (var4 >= 2) {
                    field345 = true;
                } else {
                    field345 = false;
                }
                method158();
                if (field555 >= 25) {
                    method792();
                }
                field2198 = true;
            } else if (field2201) {
                Canvas var5 = Statics.field2586;
                var5.removeKeyListener(class138.field2118);
                var5.removeFocusListener(class138.field2118);
                class138.field2120 = -1;
                class141.method2229(Statics.field2586);
                if (Statics.field61 != null) {
                    Statics.field61.method2797(Statics.field2586);
                }
                Statics.field295.method2950();
                Statics.field2586.setBackground(Color.black);
                Canvas var6 = Statics.field2586;
                var6.setFocusTraversalKeysEnabled(false);
                var6.addKeyListener(class138.field2118);
                var6.addFocusListener(class138.field2118);
                Statics.method123(Statics.field2586);
                if (Statics.field61 != null) {
                    Statics.field61.method2791(Statics.field2586);
                }
                if (field453 != -1) {
                    method1063(false);
                }
                field2200 = true;
            }
        }
        Dimension var7 = this.method2955();
        if (Statics.field2072 != var7.width || Statics.field156 != var7.height || field2200) {
            method158();
            field507 = class116.method2781() + 500L;
            field2200 = false;
        }
        boolean var8 = false;
        if (field2198) {
            field2198 = false;
            var8 = true;
            for (int var9 = 0; var9 < 100; var9++) {
                field324[var9] = true;
            }
        }
        if (var8) {
            Statics.method2121();
        }
        if (field555 == 0) {
            class145.method2778(class32.field747, class32.field745, (Color) null, var8);
        } else if (field555 == 5) {
            class32.method1575(Statics.field782, Statics.field2221, Statics.field2085, var8);
        } else if (field555 == 10 || field555 == 11) {
            class32.method1575(Statics.field782, Statics.field2221, Statics.field2085, var8);
        } else if (field555 == 20) {
            class32.method1575(Statics.field782, Statics.field2221, Statics.field2085, var8);
        } else if (field555 == 25) {
            if (field347 == 1) {
                if (field351 > field522) {
                    field522 = field351;
                }
                int var10 = (field522 * 50 - field351 * 50) / field522;
                method677(class158.field2311 + class2.field24 + class2.field23 + var10 + "%" + class2.field18, false);
            } else if (field347 == 2) {
                if (field334 > field354) {
                    field354 = field334;
                }
                int var11 = (field354 * 50 - field334 * 50) / field354 + 50;
                method677(class158.field2311 + class2.field24 + class2.field23 + var11 + "%" + class2.field18, false);
            } else {
                method677(class158.field2311, false);
            }
        } else if (field555 == 30) {
            if (field453 != -1) {
                int var12 = field453;
                if (class174.method159(var12)) {
                    method3037(Statics.field2887[var12], -1);
                }
            }
            for (int var13 = 0; var13 < field497; var13++) {
                if (field324[var13]) {
                    field521[var13] = true;
                }
                field355[var13] = field324[var13];
                field324[var13] = false;
            }
            field452 = field307;
            field341 = -1;
            field443 = -1;
            Statics.field2151 = null;
            if (field453 != -1) {
                field497 = 0;
                method115(field453, 0, 0, Statics.field877, Statics.field1672, 0, 0, -1);
            }
            class80.method1776();
            if (field434) {
                int var14 = Statics.field60;
                int var15 = Statics.field1356;
                int var16 = Statics.field997;
                int var17 = Statics.field70;
                int var18 = 6116423;
                class80.method1817(var14, var15, var16, var17, var18);
                class80.method1817(var14 + 1, var15 + 1, var16 - 2, 16, 0);
                class80.method1829(var14 + 1, var15 + 18, var16 - 2, var17 - 19, 0);
                Statics.field782.method3855(class158.field2452, var14 + 3, var15 + 14, var18, -1);
                int var19 = class141.field2152;
                int var20 = class141.field2162;
                for (int var21 = 0; var21 < field435; var21++) {
                    int var22 = (field435 - 1 - var21) * 15 + var15 + 31;
                    int var23 = 16777215;
                    if (var19 > var14 && var19 < var14 + var16 && var20 > var22 - 13 && var20 < var22 + 3) {
                        var23 = 16776960;
                    }
                    class225 var24 = Statics.field782;
                    String var25;
                    if (field441[var21].length() > 0) {
                        var25 = field440[var21] + class158.field2459 + field441[var21];
                    } else {
                        var25 = field440[var21];
                    }
                    var24.method3855(var25, var14 + 3, var22, var23, 0);
                }
                method3041(Statics.field60, Statics.field1356, Statics.field997, Statics.field70);
            } else if (field341 != -1) {
                Statics.method733(field341, field443);
            }
            if (field506 == 3) {
                for (int var26 = 0; var26 < field497; var26++) {
                    if (field355[var26]) {
                        class80.method1799(field312[var26], field498[var26], field504[var26], field505[var26], 16711935, 128);
                    } else if (field521[var26]) {
                        class80.method1799(field312[var26], field498[var26], field504[var26], field505[var26], 16711680, 128);
                    }
                }
            }
            class24.method880(Statics.field1003, Statics.field94.field845, Statics.field94.field820, field428);
            field428 = 0;
        } else if (field555 == 40) {
            method677(class158.field2312 + class2.field24 + class158.field2441, false);
        } else if (field555 == 45) {
            method677(class158.field2457, false);
        }
        if (field555 == 30 && field506 == 0 && !var8) {
            try {
                Graphics var27 = Statics.field2586.getGraphics();
                for (int var28 = 0; var28 < field497; var28++) {
                    if (field521[var28]) {
                        Statics.field696.method1607(var27, field312[var28], field498[var28], field504[var28], field505[var28]);
                        field521[var28] = false;
                    }
                }
            } catch (Exception var34) {
                Statics.field2586.repaint();
            }
        } else if (field555 > 0) {
            try {
                Graphics var30 = Statics.field2586.getGraphics();
                Statics.field696.method1604(var30, 0, 0);
                for (int var31 = 0; var31 < field497; var31++) {
                    field521[var31] = false;
                }
            } catch (Exception var33) {
                Statics.field2586.repaint();
            }
        }
    }

    @ObfuscatedName("client.r(I)V")
    public final void method261() {
        if (Statics.field2724.method234()) {
            Statics.field2724.method237();
        }
        if (Statics.field2009 != null) {
            Statics.field2009.field214 = false;
        }
        Statics.field2009 = null;
        if (Statics.field2048 != null) {
            Statics.field2048.method2926();
            Statics.field2048 = null;
        }
        if (class138.field2118 != null) {
            class138 var1 = class138.field2118;
            synchronized (class138.field2118) {
                class138.field2118 = null;
            }
        }
        class141.method1151();
        Statics.field61 = null;
        if (Statics.field1628 != null) {
            Statics.field1628.method1264();
        }
        if (Statics.field578 != null) {
            Statics.field578.method1264();
        }
        if (Statics.field2718 != null) {
            Statics.field2718.method2926();
        }
        class171.method2774();
        class150.method2243();
    }

    @ObfuscatedName("c.p(II)V")
    public static void method50(int arg0) {
        if (field555 == arg0) {
            return;
        }
        if (field555 == 0) {
            class145.method2941();
        }
        if (arg0 == 20 || arg0 == 40 || arg0 == 45) {
            field329 = 0;
            field330 = 0;
            field393 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && Statics.field2736 != null) {
            Statics.field2736.method2926();
            Statics.field2736 = null;
        }
        if (field555 == 25) {
            field347 = 0;
            field351 = 0;
            field522 = 1;
            field334 = 0;
            field354 = 1;
        }
        if (arg0 == 5 || arg0 == 10) {
            Statics.method3051(Statics.field2586, Statics.field1090, Statics.field1769, true, 0);
        } else if (arg0 == 20) {
            Statics.method3051(Statics.field2586, Statics.field1090, Statics.field1769, true, field555 == 11 ? 4 : 0);
        } else if (arg0 == 11) {
            Statics.method3051(Statics.field2586, Statics.field1090, Statics.field1769, false, 4);
        } else {
            class32.method3140();
        }
        field555 = arg0;
    }

    @ObfuscatedName("client.q(I)V")
    public void method262() {
        if (field555 != 1000) {
            boolean var1 = class172.method2144();
            if (!var1) {
                this.method263();
            }
        }
    }

    @ObfuscatedName("client.m(B)V")
    public void method263() {
        if (class172.field2735 >= 4) {
            this.method2953("js5crc");
            field555 = 1000;
            return;
        }
        if (class172.field2734 >= 4) {
            if (field555 <= 5) {
                this.method2953("js5io");
                field555 = 1000;
                return;
            }
            field327 = 3000;
            class172.field2734 = 3;
        }
        if (--field327 + 1 > 0) {
            return;
        }
        try {
            if (field326 == 0) {
                Statics.field2040 = Statics.field1875.method2830(Statics.field192, Statics.field1001);
                field326++;
            }
            if (field326 == 1) {
                if (Statics.field2040.field2211 == 2) {
                    this.method264(-1);
                    return;
                }
                if (Statics.field2040.field2211 == 1) {
                    field326++;
                }
            }
            if (field326 == 2) {
                Statics.field2055 = new class144((Socket) Statics.field2040.field2212, Statics.field1875);
                class120 var1 = new class120(5);
                var1.method2452(15);
                var1.method2635(112);
                Statics.field2055.method2931(var1.field1994, 0, 5);
                field326++;
                Statics.field1093 = class116.method2781();
            }
            if (field326 == 3) {
                if (field555 <= 5 || Statics.field2055.method2929() > 0) {
                    int var2 = Statics.field2055.method2928();
                    if (var2 != 0) {
                        this.method264(var2);
                        return;
                    }
                    field326++;
                } else if (class116.method2781() - Statics.field1093 > 30000L) {
                    this.method264(-2);
                    return;
                }
            }
            if (field326 == 4) {
                class172.method1871(Statics.field2055, field555 > 20);
                Statics.field2040 = null;
                Statics.field2055 = null;
                field326 = 0;
                field328 = 0;
            }
        } catch (IOException var4) {
            this.method264(-3);
        }
    }

    @ObfuscatedName("client.e(IB)V")
    public void method264(int arg0) {
        Statics.field2040 = null;
        Statics.field2055 = null;
        field326 = 0;
        if (Statics.field681 == Statics.field1001) {
            Statics.field1001 = Statics.field333;
        } else {
            Statics.field1001 = Statics.field681;
        }
        field328++;
        if (field328 >= 2 && arg0 == 7 || arg0 == 9) {
            if (field555 <= 5) {
                this.method2953("js5connect_full");
                field555 = 1000;
            } else {
                field327 = 3000;
            }
        } else if (field328 >= 2 && arg0 == 6) {
            this.method2953("js5connect_outofdate");
            field555 = 1000;
        } else if (field328 >= 4) {
            if (field555 <= 5) {
                this.method2953("js5connect");
                field555 = 1000;
            } else {
                field327 = 3000;
            }
        }
    }

    @ObfuscatedName("i.x(I)V")
    public static void method190() {
        if (field325 == 0) {
            Statics.field718 = new class87(4, 104, 104, class6.field95);
            for (int var0 = 0; var0 < 4; var0++) {
                field362[var0] = new class109(104, 104);
            }
            Statics.field1611 = new class79(512, 512);
            class32.field745 = class158.field2363;
            class32.field747 = 5;
            field325 = 20;
        } else if (field325 == 20) {
            int[] var1 = new int[9];
            for (int var2 = 0; var2 < 9; var2++) {
                int var3 = var2 * 32 + 128 + 15;
                int var4 = var3 * 3 + 600;
                int var5 = class92.field1594[var3];
                var1[var2] = var4 * var5 >> 16;
            }
            class87.method1914(var1, 500, 800, 512, 334);
            class32.field745 = class158.field2331;
            class32.field747 = 10;
            field325 = 30;
        } else if (field325 == 30) {
            Statics.field1058 = method2336(0, false, true, true);
            Statics.field1683 = method2336(1, false, true, true);
            Statics.field710 = method2336(2, true, false, true);
            Statics.field2944 = method2336(3, false, true, true);
            Statics.field1968 = method2336(4, false, true, true);
            Statics.field157 = method2336(5, true, true, true);
            Statics.field885 = method2336(6, true, true, false);
            Statics.field280 = method2336(7, false, true, true);
            Statics.field1769 = method2336(8, false, true, true);
            Statics.field2083 = method2336(9, false, true, true);
            Statics.field1090 = method2336(10, false, true, true);
            Statics.field815 = method2336(11, false, true, true);
            Statics.field3138 = method2336(12, false, true, true);
            Statics.field220 = method2336(13, true, false, true);
            Statics.field592 = method2336(14, false, true, false);
            Statics.field2912 = method2336(15, false, true, true);
            class32.field745 = class158.field2316;
            class32.field747 = 20;
            field325 = 40;
        } else if (field325 == 40) {
            byte var6 = 0;
            int var7 = var6 + Statics.field1058.method3224() * 4 / 100;
            int var8 = var7 + Statics.field1683.method3224() * 4 / 100;
            int var9 = var8 + Statics.field710.method3224() * 2 / 100;
            int var10 = var9 + Statics.field2944.method3224() * 2 / 100;
            int var11 = var10 + Statics.field1968.method3224() * 6 / 100;
            int var12 = var11 + Statics.field157.method3224() * 4 / 100;
            int var13 = var12 + Statics.field885.method3224() * 2 / 100;
            int var14 = var13 + Statics.field280.method3224() * 60 / 100;
            int var15 = var14 + Statics.field1769.method3224() * 2 / 100;
            int var16 = var15 + Statics.field2083.method3224() * 2 / 100;
            int var17 = var16 + Statics.field1090.method3224() * 2 / 100;
            int var18 = var17 + Statics.field815.method3224() * 2 / 100;
            int var19 = var18 + Statics.field3138.method3224() * 2 / 100;
            int var20 = var19 + Statics.field220.method3224() * 2 / 100;
            int var21 = var20 + Statics.field592.method3224() * 2 / 100;
            int var22 = var21 + Statics.field2912.method3224() * 2 / 100;
            if (var22 == 100) {
                class32.field745 = class158.field2318;
                class32.field747 = 30;
                field325 = 45;
            } else {
                if (var22 != 0) {
                    class32.field745 = class158.field2317 + var22 + "%";
                }
                class32.field747 = 30;
            }
        } else if (field325 == 45) {
            boolean var23 = !field303;
            Statics.field974 = 22050;
            Statics.field1634 = var23;
            Statics.field3218 = 2;
            class185 var24 = new class185();
            var24.method3463(9, 128);
            Statics.field1628 = class57.method777(Statics.field1875, Statics.field2586, 0, 22050);
            Statics.field1628.method1254(var24);
            class169 var25 = Statics.field2912;
            class169 var26 = Statics.field592;
            class169 var27 = Statics.field1968;
            Statics.field2970 = var25;
            Statics.field2965 = var26;
            Statics.field2971 = var27;
            Statics.field2974 = var24;
            Statics.field578 = class57.method777(Statics.field1875, Statics.field2586, 1, 2048);
            Statics.field179 = new class56();
            Statics.field578.method1254(Statics.field179);
            Statics.field1440 = new class75(22050, Statics.field974);
            class32.field745 = class158.field2319;
            class32.field747 = 35;
            field325 = 50;
        } else if (field325 == 50) {
            int var28 = 0;
            if (Statics.field2221 == null) {
                Statics.field2221 = class77.method210(Statics.field1769, Statics.field220, "p11_full", "");
            } else {
                var28++;
            }
            if (Statics.field2085 == null) {
                Statics.field2085 = class77.method210(Statics.field1769, Statics.field220, "p12_full", "");
            } else {
                var28++;
            }
            if (Statics.field782 == null) {
                Statics.field782 = class77.method210(Statics.field1769, Statics.field220, "b12_full", "");
            } else {
                var28++;
            }
            if (var28 < 3) {
                class32.field745 = class158.field2320 + var28 * 100 / 3 + "%";
                class32.field747 = 40;
            } else {
                Statics.field580 = new class161(true);
                class32.field745 = class158.field2321;
                class32.field747 = 40;
                field325 = 60;
            }
        } else if (field325 == 60) {
            class169 var29 = Statics.field1090;
            class169 var30 = Statics.field1769;
            int var31 = 0;
            if (var29.method3165("title.jpg", "")) {
                var31++;
            }
            if (var30.method3165("logo", "")) {
                var31++;
            }
            if (var30.method3165("logo_deadman_mode", "")) {
                var31++;
            }
            if (var30.method3165("titlebox", "")) {
                var31++;
            }
            if (var30.method3165("titlebutton", "")) {
                var31++;
            }
            if (var30.method3165("runes", "")) {
                var31++;
            }
            if (var30.method3165("title_mute", "")) {
                var31++;
            }
            if (var30.method3166("options_radio_buttons,0")) {
                var31++;
            }
            if (var30.method3166("options_radio_buttons,2")) {
                var31++;
            }
            var30.method3165("sl_back", "");
            var30.method3165("sl_flags", "");
            var30.method3165("sl_arrows", "");
            var30.method3165("sl_stars", "");
            var30.method3165("sl_button", "");
            byte var34 = 9;
            if (var31 < var34) {
                class32.field745 = class158.field2400 + var31 * 100 / var34 + "%";
                class32.field747 = 50;
            } else {
                class32.field745 = class158.field2395;
                class32.field747 = 50;
                method50(5);
                field325 = 70;
            }
        } else if (field325 == 70) {
            if (Statics.field710.method3151()) {
                class47.method444(Statics.field710);
                class169 var36 = Statics.field710;
                Statics.field2640 = var36;
                class169 var37 = Statics.field710;
                class169 var38 = Statics.field280;
                Statics.field1040 = var37;
                Statics.field1038 = var38;
                Statics.field1039 = Statics.field1040.method3157(3);
                class41.method3246(Statics.field710, Statics.field280, field303);
                class169 var39 = Statics.field710;
                class169 var40 = Statics.field280;
                Statics.field893 = var39;
                Statics.field895 = var40;
                class169 var41 = Statics.field710;
                class169 var42 = Statics.field280;
                boolean var43 = field302;
                class225 var44 = Statics.field2221;
                Statics.field2053 = var41;
                Statics.field2654 = var42;
                Statics.field1118 = var43;
                Statics.field1119 = Statics.field2053.method3157(10);
                Statics.field1160 = var44;
                class169 var45 = Statics.field710;
                class169 var46 = Statics.field1058;
                class169 var47 = Statics.field1683;
                Statics.field2032 = var45;
                Statics.field1009 = var46;
                Statics.field1963 = var47;
                class44.method1029(Statics.field710, Statics.field280);
                class48.method252(Statics.field710);
                class169 var48 = Statics.field710;
                Statics.field1174 = var48;
                Statics.field1170 = Statics.field1174.method3157(16);
                Statics.method973(Statics.field2944, Statics.field280, Statics.field1769, Statics.field220);
                class51.method191(Statics.field710);
                class169 var49 = Statics.field710;
                Statics.field1089 = var49;
                class169 var50 = Statics.field710;
                Statics.field1057 = var50;
                class50.method670(Statics.field710);
                Statics.field2724 = new class20();
                class32.field745 = class158.field2566;
                class32.field747 = 60;
                field325 = 80;
            } else {
                class32.field745 = class158.field2515 + Statics.field710.method3231() + "%";
                class32.field747 = 60;
            }
        } else if (field325 == 80) {
            int var51 = 0;
            if (Statics.field1540 == null) {
                class169 var52 = Statics.field1769;
                int var53 = var52.method3162("compass");
                int var54 = var52.method3163(var53, "");
                class79 var55 = class77.method3038(var52, var53, var54);
                Statics.field1540 = var55;
            } else {
                var51++;
            }
            if (Statics.field269 == null) {
                class169 var56 = Statics.field1769;
                int var57 = var56.method3162("mapedge");
                int var58 = var56.method3163(var57, "");
                class79 var59 = class77.method3038(var56, var57, var58);
                Statics.field269 = var59;
            } else {
                var51++;
            }
            if (Statics.field2656 == null) {
                Statics.field2656 = class77.method1869(Statics.field1769, "mapscene", "");
            } else {
                var51++;
            }
            if (Statics.field2015 == null) {
                Statics.field2015 = class77.method222(Statics.field1769, "mapfunction", "");
            } else {
                var51++;
            }
            if (Statics.field76 == null) {
                Statics.field76 = class77.method222(Statics.field1769, "hitmarks", "");
            } else {
                var51++;
            }
            if (Statics.field14 == null) {
                Statics.field14 = class77.method222(Statics.field1769, "headicons_pk", "");
            } else {
                var51++;
            }
            if (Statics.field2896 == null) {
                Statics.field2896 = class77.method222(Statics.field1769, "headicons_prayer", "");
            } else {
                var51++;
            }
            if (Statics.field2045 == null) {
                Statics.field2045 = class77.method222(Statics.field1769, "headicons_hint", "");
            } else {
                var51++;
            }
            if (Statics.field1872 == null) {
                Statics.field1872 = class77.method222(Statics.field1769, "mapmarker", "");
            } else {
                var51++;
            }
            if (Statics.field2135 == null) {
                Statics.field2135 = class77.method222(Statics.field1769, "cross", "");
            } else {
                var51++;
            }
            if (Statics.field2143 == null) {
                Statics.field2143 = class77.method222(Statics.field1769, "mapdots", "");
            } else {
                var51++;
            }
            if (Statics.field2641 == null) {
                Statics.field2641 = class77.method1869(Statics.field1769, "scrollbar", "");
            } else {
                var51++;
            }
            if (Statics.field1685 == null) {
                Statics.field1685 = class77.method1869(Statics.field1769, "mod_icons", "");
            } else {
                var51++;
            }
            if (var51 < 13) {
                class32.field745 = class158.field2326 + var51 * 100 / 13 + "%";
                class32.field747 = 70;
            } else {
                Statics.field3194 = Statics.field1685;
                Statics.field269.method1678();
                int var60 = (int) (Math.random() * 21.0D) - 10;
                int var61 = (int) (Math.random() * 21.0D) - 10;
                int var62 = (int) (Math.random() * 21.0D) - 10;
                int var63 = (int) (Math.random() * 41.0D) - 20;
                for (int var64 = 0; var64 < Statics.field2015.length; var64++) {
                    Statics.field2015[var64].method1693(var60 + var63, var61 + var63, var62 + var63);
                }
                Statics.field2656[0].method1849(var60 + var63, var61 + var63, var62 + var63);
                class32.field745 = class158.field2419;
                class32.field747 = 70;
                field325 = 90;
            }
        } else if (field325 == 90) {
            if (Statics.field2083.method3151()) {
                class96 var65 = new class96(Statics.field2083, Statics.field1769, 20, 0.8D, field303 ? 64 : 128);
                class92.method2044(var65);
                class92.method2045(0.8D);
                class32.field745 = class158.field2513;
                class32.field747 = 90;
                field325 = 110;
            } else {
                class32.field745 = class158.field2328 + Statics.field2083.method3231() + "%";
                class32.field747 = 90;
            }
        } else if (field325 == 110) {
            Statics.field2009 = new class14();
            Statics.field1875.method2831(Statics.field2009, 10);
            class32.field745 = class158.field2330;
            class32.field747 = 94;
            field325 = 120;
        } else if (field325 == 120) {
            if (Statics.field1090.method3165("huffman", "")) {
                class114 var66 = new class114(Statics.field1090.method3176("huffman", ""));
                Statics.field2056 = var66;
                class32.field745 = class158.field2345;
                class32.field747 = 96;
                field325 = 130;
            } else {
                class32.field745 = class158.field2506 + "%";
                class32.field747 = 96;
            }
        } else if (field325 == 130) {
            if (!Statics.field2944.method3151()) {
                class32.field745 = class158.field2333 + Statics.field2944.method3231() * 4 / 5 + "%";
                class32.field747 = 100;
            } else if (!Statics.field3138.method3151()) {
                class32.field745 = class158.field2333 + (80 + Statics.field3138.method3231() / 6) + "%";
                class32.field747 = 100;
            } else if (Statics.field220.method3151()) {
                class32.field745 = class158.field2334;
                class32.field747 = 100;
                field325 = 140;
            } else {
                class32.field745 = class158.field2333 + (96 + Statics.field220.method3231() / 20) + "%";
                class32.field747 = 100;
            }
        } else if (field325 == 140) {
            method50(10);
        }
    }

    @ObfuscatedName("dc.z(IZZZI)Lfb;")
    public static class169 method2336(int arg0, boolean arg1, boolean arg2, boolean arg3) {
        class135 var4 = null;
        if (class150.field2236 != null) {
            var4 = new class135(arg0, class150.field2236, Statics.field1559[arg0], 1000000);
        }
        return new class169(var4, Statics.field2073, arg0, arg1, arg2, arg3);
    }

    @ObfuscatedName("m.i(I)V")
    public static final void method162() {
        try {
            if (field329 == 0) {
                if (Statics.field2048 != null) {
                    Statics.field2048.method2926();
                    Statics.field2048 = null;
                }
                Statics.field2087 = null;
                field350 = false;
                field330 = 0;
                field329 = 1;
            }
            if (field329 == 1) {
                if (Statics.field2087 == null) {
                    Statics.field2087 = Statics.field1875.method2830(Statics.field192, Statics.field1001);
                }
                if (Statics.field2087.field2211 == 2) {
                    throw new IOException();
                }
                if (Statics.field2087.field2211 == 1) {
                    Statics.field2048 = new class144((Socket) Statics.field2087.field2212, Statics.field1875);
                    Statics.field2087 = null;
                    field329 = 2;
                }
            }
            if (field329 == 2) {
                field339.field1993 = 0;
                field339.method2452(14);
                Statics.field2048.method2931(field339.field1994, 0, 1);
                field442.field1993 = 0;
                field329 = 3;
            }
            if (field329 == 3) {
                if (Statics.field1628 != null) {
                    Statics.field1628.method1266();
                }
                if (Statics.field578 != null) {
                    Statics.field578.method1266();
                }
                int var0 = Statics.field2048.method2928();
                if (Statics.field1628 != null) {
                    Statics.field1628.method1266();
                }
                if (Statics.field578 != null) {
                    Statics.field578.method1266();
                }
                if (var0 != 0) {
                    method639(var0);
                    return;
                }
                field442.field1993 = 0;
                field329 = 5;
            }
            if (field329 == 5) {
                int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D) };
                field339.field1993 = 0;
                field339.method2452(1);
                field339.method2452(class32.field740.method628());
                field339.method2635(var1[0]);
                field339.method2635(var1[1]);
                field339.method2635(var1[2]);
                field339.method2635(var1[3]);
                switch(class32.field740.field2594) {
                    case 0:
                    case 1:
                        field339.method2524(Statics.field2288);
                        field339.field1993 += 5;
                        break;
                    case 2:
                        field339.method2635((Integer) Statics.field2079.field151.get(class164.method2390(class32.field750)));
                        field339.field1993 += 4;
                        break;
                    case 3:
                        field339.field1993 += 8;
                }
                field339.method2543(class32.field741);
                field339.method2482(class5.field81, class5.field75);
                field340.field1993 = 0;
                if (field555 == 40) {
                    field340.method2452(18);
                } else {
                    field340.method2452(16);
                }
                field340.method2448(0);
                int var2 = field340.field1993;
                field340.method2635(112);
                field340.method2456(field339.field1994, 0, field339.field1993);
                int var3 = field340.field1993;
                field340.method2543(class32.field750);
                field340.method2452((field345 ? 1 : 0) << 1 | (field303 ? 1 : 0));
                field340.method2448(Statics.field877);
                field340.method2448(Statics.field1672);
                class123 var4 = field340;
                byte[] var5 = new byte[24];
                try {
                    class150.field2235.method3954(0L);
                    class150.field2235.method3956(var5);
                    int var6;
                    for (var6 = 0; var6 < 24 && var5[var6] == 0; var6++) {
                    }
                    if (var6 >= 24) {
                        throw new IOException();
                    }
                } catch (Exception var31) {
                    for (int var8 = 0; var8 < 24; var8++) {
                        var5[var8] = -1;
                    }
                }
                var4.method2456(var5, 0, 24);
                field340.method2543(Statics.field221);
                field340.method2635(Statics.field612);
                class120 var9 = new class120(Statics.field580.method3068());
                Statics.field580.method3057(var9);
                field340.method2456(var9.field1994, 0, var9.field1994.length);
                field340.method2452(Statics.field2051);
                field340.method2635(Statics.field1058.field2673);
                field340.method2635(Statics.field1683.field2673);
                field340.method2635(Statics.field710.field2673);
                field340.method2635(Statics.field2944.field2673);
                field340.method2635(Statics.field1968.field2673);
                field340.method2635(Statics.field157.field2673);
                field340.method2635(Statics.field885.field2673);
                field340.method2635(Statics.field280.field2673);
                field340.method2635(Statics.field1769.field2673);
                field340.method2635(Statics.field2083.field2673);
                field340.method2635(Statics.field1090.field2673);
                field340.method2635(Statics.field815.field2673);
                field340.method2635(Statics.field3138.field2673);
                field340.method2635(Statics.field220.field2673);
                field340.method2635(Statics.field592.field2673);
                field340.method2635(Statics.field2912.field2673);
                field340.method2451(var1, var3, field340.field1993);
                field340.method2660(field340.field1993 - var2);
                Statics.field2048.method2931(field340.field1994, 0, field340.field1993);
                field339.method2727(var1);
                for (int var10 = 0; var10 < 4; var10++) {
                    var1[var10] += 50;
                }
                field442.method2727(var1);
                field329 = 6;
            }
            if (field329 == 6 && Statics.field2048.method2929() > 0) {
                int var11 = Statics.field2048.method2928();
                if (var11 == 21 && field555 == 20) {
                    field329 = 7;
                } else if (var11 == 2) {
                    field329 = 9;
                } else if (var11 == 15 && field555 == 40) {
                    field342 = -1;
                    field329 = 13;
                } else if (var11 == 23 && field393 < 1) {
                    field393++;
                    field329 = 0;
                } else if (var11 == 29) {
                    field329 = 11;
                } else {
                    method639(var11);
                    return;
                }
            }
            if (field329 == 7 && Statics.field2048.method2929() > 0) {
                field332 = (Statics.field2048.method2928() + 3) * 60;
                field329 = 8;
            }
            if (field329 == 8) {
                field330 = 0;
                class32.method856(class158.field2338, class158.field2339, field332 / 60 + class158.field2340);
                if (--field332 <= 0) {
                    field329 = 0;
                }
            } else {
                if (field329 == 9 && Statics.field2048.method2929() >= 13) {
                    boolean var12 = Statics.field2048.method2928() == 1;
                    Statics.field2048.method2930(field442.field1994, 0, 4);
                    field442.field1993 = 0;
                    boolean var13 = false;
                    if (var12) {
                        int var14 = field442.method2714() << 24;
                        int var15 = var14 | field442.method2714() << 16;
                        int var16 = var15 | field442.method2714() << 8;
                        int var17 = var16 | field442.method2714();
                        int var18 = class164.method2390(class32.field750);
                        if (Statics.field2079.field151.size() >= 10 && !Statics.field2079.field151.containsKey(var18)) {
                            Iterator var19 = Statics.field2079.field151.entrySet().iterator();
                            var19.next();
                            var19.remove();
                        }
                        Statics.field2079.field151.put(var18, var17);
                        class9.method3770();
                    }
                    field346 = Statics.field2048.method2928();
                    field462 = Statics.field2048.method2928() == 1;
                    field458 = Statics.field2048.method2928();
                    field458 <<= 0x8;
                    field458 += Statics.field2048.method2928();
                    field418 = Statics.field2048.method2928();
                    Statics.field2048.method2930(field442.field1994, 0, 1);
                    field442.field1993 = 0;
                    field395 = field442.method2714();
                    Statics.field2048.method2930(field442.field1994, 0, 2);
                    field442.field1993 = 0;
                    field342 = field442.method2464();
                    if (field418 == 1) {
                        try {
                            client var20 = Statics.field295;
                            JSObject.getWindow(var20).call("zap", (Object[]) null);
                        } catch (Throwable var30) {
                        }
                    } else {
                        try {
                            client var22 = Statics.field295;
                            JSObject.getWindow(var22).call("unzap", (Object[]) null);
                        } catch (Throwable var29) {
                        }
                    }
                    field329 = 10;
                }
                if (field329 != 10) {
                    if (field329 == 11 && Statics.field2048.method2929() >= 2) {
                        field442.field1993 = 0;
                        Statics.field2048.method2930(field442.field1994, 0, 2);
                        field442.field1993 = 0;
                        Statics.field1982 = field442.method2464();
                        field329 = 12;
                    }
                    if (field329 == 12 && Statics.field2048.method2929() >= Statics.field1982) {
                        field442.field1993 = 0;
                        Statics.field2048.method2930(field442.field1994, 0, Statics.field1982);
                        field442.field1993 = 0;
                        String var24 = field442.method2470();
                        String var25 = field442.method2470();
                        String var26 = field442.method2470();
                        class32.method856(var24, var25, var26);
                        method50(10);
                    }
                    if (field329 == 13) {
                        if (field342 == -1) {
                            if (Statics.field2048.method2929() < 2) {
                                return;
                            }
                            Statics.field2048.method2930(field442.field1994, 0, 2);
                            field442.field1993 = 0;
                            field342 = field442.method2464();
                        }
                        if (Statics.field2048.method2929() >= field342) {
                            Statics.field2048.method2930(field442.field1994, 0, field342);
                            field442.field1993 = 0;
                            int var27 = field342;
                            method188();
                            class33.method3304(field442);
                            if (field442.field1993 != var27) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        field330++;
                        if (field330 > 2000) {
                            if (field393 < 1) {
                                if (Statics.field681 == Statics.field1001) {
                                    Statics.field1001 = Statics.field333;
                                } else {
                                    Statics.field1001 = Statics.field681;
                                }
                                field393++;
                                field329 = 0;
                            } else {
                                method639(-3);
                            }
                        }
                    }
                } else if (Statics.field2048.method2929() >= field342) {
                    field442.field1993 = 0;
                    Statics.field2048.method2930(field442.field1994, 0, field342);
                    method763();
                    class33.method3304(field442);
                    Statics.field711 = -1;
                    method160(false);
                    field395 = -1;
                }
            }
        } catch (IOException var32) {
            if (field393 < 1) {
                if (Statics.field681 == Statics.field1001) {
                    Statics.field1001 = Statics.field333;
                } else {
                    Statics.field1001 = Statics.field681;
                }
                field393++;
                field329 = 0;
            } else {
                method639(-2);
            }
        }
    }

    @ObfuscatedName("al.t(B)V")
    public static void method763() {
        field305 = 1L;
        field311 = -1;
        Statics.field2009.field209 = 0;
        Statics.field2011 = true;
        field301 = true;
        field352 = -1L;
        class212.field3139 = new class203();
        field339.field1993 = 0;
        field442.field1993 = 0;
        field395 = -1;
        field472 = -1;
        field577 = -1;
        field437 = -1;
        field372 = 0;
        field314 = 0;
        field402 = 0;
        field315 = 0;
        field435 = 0;
        field434 = false;
        class141.method2138(0);
        class12.field184.clear();
        class12.field182.method3630();
        class12.field183.method3680();
        class12.field186 = 0;
        field449 = 0;
        field448 = false;
        field537 = 0;
        field360 = (int) (Math.random() * 100.0D) - 50;
        field569 = (int) (Math.random() * 110.0D) - 55;
        field364 = (int) (Math.random() * 80.0D) - 40;
        field444 = (int) (Math.random() * 120.0D) - 60;
        field369 = (int) (Math.random() * 30.0D) - 20;
        field380 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
        field531 = 0;
        field524 = -1;
        field529 = 0;
        field348 = 0;
        field323 = class21.field586;
        field509 = class21.field586;
        field344 = 0;
        class33.field772 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            class33.field762[var0] = null;
            class33.field773[var0] = 1;
        }
        for (int var1 = 0; var1 < 2048; var1++) {
            field551[var1] = null;
        }
        for (int var2 = 0; var2 < 32768; var2++) {
            field547[var2] = null;
        }
        field425 = -1;
        field450.method3637();
        field429.method3637();
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    field426[var3][var4][var5] = null;
                }
            }
        }
        field427 = new class200();
        field563 = 0;
        field562 = 0;
        field398 = 0;
        for (int var6 = 0; var6 < Statics.field1170; var6++) {
            class53 var7 = class53.method987(var6);
            if (var7 != null) {
                class177.field2907[var6] = 0;
                class177.field2906[var6] = 0;
            }
        }
        Statics.field2724.method247();
        field461 = -1;
        if (field453 != -1) {
            int var8 = field453;
            if (var8 != -1 && Statics.field2643[var8]) {
                Statics.field2803.method3201(var8);
                if (Statics.field2887[var8] != null) {
                    boolean var9 = true;
                    for (int var10 = 0; var10 < Statics.field2887[var8].length; var10++) {
                        if (Statics.field2887[var8][var10] != null) {
                            if (Statics.field2887[var8][var10].field2825 == 2) {
                                var9 = false;
                            } else {
                                Statics.field2887[var8][var10] = null;
                            }
                        }
                    }
                    if (var9) {
                        Statics.field2887[var8] = null;
                    }
                    Statics.field2643[var8] = false;
                }
            }
        }
        for (class4 var11 = (class4) field454.method3610(); var11 != null; var11 = (class4) field454.method3606()) {
            method766(var11, true);
        }
        field453 = -1;
        field454 = new class197(8);
        field527 = null;
        field434 = false;
        field435 = 0;
        field568.method3343((int[]) null, new int[] { 0, 0, 0, 0, 0 }, false, -1);
        for (int var12 = 0; var12 < 8; var12++) {
            field318[var12] = null;
            field423[var12] = false;
        }
        class16.method3454();
        field508 = true;
        for (int var13 = 0; var13 < 100; var13++) {
            field324[var13] = true;
        }
        method792();
        field513 = null;
        Statics.field2144 = 0;
        Statics.field1227 = null;
        for (int var14 = 0; var14 < 8; var14++) {
            field571[var14] = new class221();
        }
        Statics.field657 = null;
    }

    @ObfuscatedName("z.n(I)V")
    public static void method188() {
        field339.field1993 = 0;
        field442.field1993 = 0;
        field395 = -1;
        field472 = -1;
        field577 = -1;
        field437 = -1;
        field342 = 0;
        field372 = 0;
        field314 = 0;
        field435 = 0;
        field434 = false;
        field531 = 0;
        field529 = 0;
        for (int var0 = 0; var0 < 2048; var0++) {
            field551[var0] = null;
        }
        Statics.field94 = null;
        for (int var1 = 0; var1 < field547.length; var1++) {
            class35 var2 = field547[var1];
            if (var2 != null) {
                var2.field843 = -1;
                var2.field844 = false;
            }
        }
        class16.method3454();
        method50(30);
        for (int var3 = 0; var3 < 100; var3++) {
            field324[var3] = true;
        }
        method792();
    }

    @ObfuscatedName("f.u(II)V")
    public static void method639(int arg0) {
        if (arg0 == -3) {
            class32.method856(class158.field2341, class158.field2342, class158.field2343);
        } else if (arg0 == -2) {
            class32.method856(class158.field2344, class158.field2408, class158.field2346);
        } else if (arg0 == -1) {
            class32.method856(class158.field2347, class158.field2462, class158.field2349);
        } else if (arg0 == 3) {
            class32.field727 = 3;
        } else if (arg0 == 4) {
            class32.method856(class158.field2525, class158.field2424, class158.field2510);
        } else if (arg0 == 5) {
            class32.method856(class158.field2464, class158.field2354, class158.field2438);
        } else if (arg0 == 6) {
            class32.method856(class158.field2356, class158.field2357, class158.field2358);
        } else if (arg0 == 7) {
            class32.method856(class158.field2359, class158.field2360, class158.field2361);
        } else if (arg0 == 8) {
            class32.method856(class158.field2539, class158.field2313, class158.field2364);
        } else if (arg0 == 9) {
            class32.method856(class158.field2393, class158.field2366, class158.field2545);
        } else if (arg0 == 10) {
            class32.method856(class158.field2368, class158.field2369, class158.field2370);
        } else if (arg0 == 11) {
            class32.method856(class158.field2371, class158.field2372, class158.field2373);
        } else if (arg0 == 12) {
            class32.method856(class158.field2374, class158.field2375, class158.field2376);
        } else if (arg0 == 13) {
            class32.method856(class158.field2377, class158.field2378, class158.field2379);
        } else if (arg0 == 14) {
            class32.method856(class158.field2380, class158.field2381, class158.field2382);
        } else if (arg0 == 16) {
            class32.method856(class158.field2383, class158.field2384, class158.field2402);
        } else if (arg0 == 17) {
            class32.method856(class158.field2386, class158.field2387, class158.field2388);
        } else if (arg0 == 18) {
            class32.method856(class158.field2389, class158.field2390, class158.field2406);
        } else if (arg0 == 19) {
            class32.method856(class158.field2396, class158.field2454, class158.field2394);
        } else if (arg0 == 20) {
            class32.method856(class158.field2301, class158.field2556, class158.field2439);
        } else if (arg0 == 22) {
            class32.method856(class158.field2398, class158.field2391, class158.field2468);
        } else if (arg0 == 23) {
            class32.method856(class158.field2401, class158.field2332, class158.field2446);
        } else if (arg0 == 24) {
            class32.method856(class158.field2404, class158.field2405, class158.field2350);
        } else if (arg0 == 25) {
            class32.method856(class158.field2458, class158.field2477, class158.field2409);
        } else if (arg0 == 26) {
            class32.method856(class158.field2410, class158.field2411, class158.field2412);
        } else if (arg0 == 27) {
            class32.method856(class158.field2507, class158.field2414, class158.field2310);
        } else if (arg0 == 31) {
            class32.method856(class158.field2422, class158.field2499, class158.field2481);
        } else if (arg0 == 32) {
            class32.method856(class158.field2425, class158.field2426, class158.field2427);
        } else if (arg0 == 37) {
            class32.method856(class158.field2428, class158.field2418, class158.field2430);
        } else if (arg0 == 38) {
            class32.method856(class158.field2385, class158.field2432, class158.field2433);
        } else if (arg0 == 55) {
            class32.method856(class158.field2337, class158.field2435, class158.field2436);
        } else if (arg0 == 56) {
            class32.method856(class158.field2437, class158.field2397, class158.field2532);
            method50(11);
            return;
        } else if (arg0 == 57) {
            class32.method856(class158.field2327, class158.field2576, class158.field2453);
            method50(11);
            return;
        } else {
            class32.method856(class158.field2443, class158.field2444, class158.field2445);
        }
        method50(10);
    }

    @ObfuscatedName("p.g(I)V")
    public static final void method140() {
        if (Statics.field2048 != null) {
            Statics.field2048.method2926();
            Statics.field2048 = null;
        }
        method49();
        Statics.field718.method1913();
        for (int var0 = 0; var0 < 4; var0++) {
            field362[var0].method2340();
        }
        System.gc();
        class184.method3241(2);
        field533 = -1;
        field300 = false;
        for (class24 var1 = (class24) class24.field628.method3665(); var1 != null; var1 = (class24) class24.field628.method3641()) {
            if (var1.field616 != null) {
                Statics.field179.method1213(var1.field616);
                var1.field616 = null;
            }
            if (var1.field624 != null) {
                Statics.field179.method1213(var1.field624);
                var1.field624 = null;
            }
        }
        class24.field628.method3637();
        method50(10);
    }

    @ObfuscatedName("c.j(I)V")
    public static final void method49() {
        class47.method185();
        class42.field979.method3582();
        class45.method668();
        class41.method139();
        class40.field913.method3582();
        class40.field890.method3582();
        class52.method54();
        class43.field991.method3582();
        class43.field992.method3582();
        class44.method819();
        class48.field1074.method3582();
        class53.method196();
        class180.field2932.method3582();
        class174.field2753.method3582();
        class174.field2765.method3582();
        class174.field2755.method3582();
        class174.field2873.method3582();
        ((class96) Statics.field1576).method2127();
        class23.field608.method3582();
        Statics.field1058.method3193();
        Statics.field1683.method3193();
        Statics.field2944.method3193();
        Statics.field1968.method3193();
        Statics.field157.method3193();
        Statics.field885.method3193();
        Statics.field280.method3193();
        Statics.field1769.method3193();
        Statics.field2083.method3193();
        Statics.field1090.method3193();
        Statics.field815.method3193();
        Statics.field3138.method3193();
    }

    @ObfuscatedName("gu.h(I)V")
    public static final void method3573() {
        if (field402 > 0) {
            method140();
        } else {
            method50(40);
            Statics.field2736 = Statics.field2048;
            Statics.field2048 = null;
        }
    }

    @ObfuscatedName("au.f(B)V")
    public static final void method913() {
        if (Statics.field578 != null) {
            Statics.field578.method1255();
        }
        if (Statics.field1628 != null) {
            Statics.field1628.method1255();
        }
    }

    @ObfuscatedName("d.b(Lam;IIII)V")
    public static void method47(class43 arg0, int arg1, int arg2, int arg3) {
        if (field537 >= 50 || field515 == 0 || arg0.field993 == null || arg1 >= arg0.field993.length) {
            return;
        }
        int var4 = arg0.field993[arg1];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 >> 8;
        int var6 = var4 >> 4 & 0x7;
        int var7 = var4 & 0xF;
        field538[field537] = var5;
        field335[field537] = var6;
        field540[field537] = 0;
        field542[field537] = null;
        int var8 = (arg2 - 64) / 128;
        int var9 = (arg3 - 64) / 128;
        field541[field537] = (var8 << 16) + (var9 << 8) + var7;
        field537++;
    }

    @ObfuscatedName("dg.l(IIII)V")
    public static void method2328(int arg0, int arg1, int arg2) {
        if (field467 == 0 || arg1 == 0 || field537 >= 50) {
            return;
        }
        field538[field537] = arg0;
        field335[field537] = arg1;
        field540[field537] = arg2;
        field542[field537] = null;
        field541[field537] = 0;
        field537++;
    }

    @ObfuscatedName("fb.o(B)V")
    public static final void method3238() {
        if (Statics.field1003 != field524) {
            field524 = Statics.field1003;
            method214(Statics.field1003);
        }
    }

    @ObfuscatedName("eu.v(Lfa;III)V")
    public static final void method3035(class174 arg0, int arg1, int arg2) {
        if (field531 != 0 && field531 != 3 || class141.field2158 != 1 && Statics.field144 || class141.field2158 != 4) {
            return;
        }
        class176 var3 = arg0.method3266(true);
        if (var3 == null) {
            return;
        }
        int var4 = class141.field2161 - arg1;
        int var5 = class141.field2160 - arg2;
        if (!var3.method3303(var4, var5)) {
            return;
        }
        int var6 = var4 - var3.field2902 / 2;
        int var7 = var5 - var3.field2901 / 2;
        int var8 = field444 + field380 & 0x7FF;
        int var9 = class92.field1594[var8];
        int var10 = class92.field1595[var8];
        int var11 = (field369 + 256) * var9 >> 8;
        int var12 = (field369 + 256) * var10 >> 8;
        int var13 = var6 * var12 + var7 * var11 >> 11;
        int var14 = var7 * var12 - var6 * var11 >> 11;
        int var15 = Statics.field94.field845 + var13 >> 7;
        int var16 = Statics.field94.field820 - var14 >> 7;
        field339.method2722(225);
        field339.method2452(18);
        field339.method2452(class138.field2116[82] ? (class138.field2116[81] ? 2 : 1) : 0);
        field339.method2594(Statics.field2205 + var15);
        field339.method2594(Statics.field68 + var16);
        field339.method2452(var6);
        field339.method2452(var7);
        field339.method2448(field380);
        field339.method2452(57);
        field339.method2452(field444);
        field339.method2452(field369);
        field339.method2452(89);
        field339.method2448(Statics.field94.field845);
        field339.method2448(Statics.field94.field820);
        field339.method2452(63);
        field529 = var15;
        field348 = var16;
    }

    @ObfuscatedName("cq.ad(I)V")
    public static final void method2139() {
        int[] var0 = class33.field763;
        for (int var1 = 0; var1 < class33.field772; var1++) {
            class3 var2 = field551[var0[var1]];
            if (var2 != null && var2.field857 > 0) {
                var2.field857--;
                if (var2.field857 == 0) {
                    var2.field831 = null;
                }
            }
        }
        for (int var3 = 0; var3 < field344; var3++) {
            int var4 = field336[var3];
            class35 var5 = field547[var4];
            if (var5 != null && var5.field857 > 0) {
                var5.field857--;
                if (var5.field857 == 0) {
                    var5.field831 = null;
                }
            }
        }
    }

    @ObfuscatedName("ft.ar(Ljava/lang/String;B)V")
    public static final void method3221(String arg0) {
        if (arg0.equalsIgnoreCase("toggleroof")) {
            Statics.field2079.field148 = !Statics.field2079.field148;
            class9.method3770();
            if (Statics.field2079.field148) {
                class12.method2783(99, "", "Roofs are now all hidden");
            } else {
                class12.method2783(99, "", "Roofs will only be removed selectively");
            }
        }
        if (arg0.equalsIgnoreCase("displayfps")) {
            field313 = !field313;
        }
        if (field346 >= 2) {
            if (arg0.equalsIgnoreCase("fpson")) {
                field313 = true;
            }
            if (arg0.equalsIgnoreCase("fpsoff")) {
                field313 = false;
            }
            if (arg0.equalsIgnoreCase("gc")) {
                System.gc();
            }
            if (arg0.equalsIgnoreCase("clientdrop")) {
                method3573();
            }
            if (arg0.equalsIgnoreCase("errortest") && field353 == 2) {
                throw new RuntimeException();
            }
        }
        field339.method2722(252);
        field339.method2452(arg0.length() + 1);
        field339.method2543(arg0);
    }

    @ObfuscatedName("dq.ah(I)V")
    public static final void method2782() {
        int var0 = Statics.field62 * 128 + 64;
        int var1 = Statics.field194 * 128 + 64;
        int var2 = method799(var0, var1, Statics.field1003) - Statics.field693;
        if (Statics.field674 < var0) {
            Statics.field674 += Statics.field694 * (var0 - Statics.field674) / 1000 + Statics.field1876;
            if (Statics.field674 > var0) {
                Statics.field674 = var0;
            }
        }
        if (Statics.field674 > var0) {
            Statics.field674 -= Statics.field694 * (Statics.field674 - var0) / 1000 + Statics.field1876;
            if (Statics.field674 < var0) {
                Statics.field674 = var0;
            }
        }
        if (Statics.field1071 < var2) {
            Statics.field1071 += Statics.field694 * (var2 - Statics.field1071) / 1000 + Statics.field1876;
            if (Statics.field1071 > var2) {
                Statics.field1071 = var2;
            }
        }
        if (Statics.field1071 > var2) {
            Statics.field1071 -= Statics.field694 * (Statics.field1071 - var2) / 1000 + Statics.field1876;
            if (Statics.field1071 < var2) {
                Statics.field1071 = var2;
            }
        }
        if (Statics.field2130 < var1) {
            Statics.field2130 += Statics.field694 * (var1 - Statics.field2130) / 1000 + Statics.field1876;
            if (Statics.field2130 > var1) {
                Statics.field2130 = var1;
            }
        }
        if (Statics.field2130 > var1) {
            Statics.field2130 -= Statics.field694 * (Statics.field2130 - var1) / 1000 + Statics.field1876;
            if (Statics.field2130 < var1) {
                Statics.field2130 = var1;
            }
        }
        int var3 = Statics.field237 * 128 + 64;
        int var4 = Statics.field2904 * 128 + 64;
        int var5 = method799(var3, var4, Statics.field1003) - Statics.field267;
        int var6 = var3 - Statics.field674;
        int var7 = var5 - Statics.field1071;
        int var8 = var4 - Statics.field2130;
        int var9 = (int) Math.sqrt((double) (var6 * var6 + var8 * var8));
        int var10 = (int) (Math.atan2((double) var7, (double) var9) * 325.949D) & 0x7FF;
        int var11 = (int) (Math.atan2((double) var6, (double) var8) * -325.949D) & 0x7FF;
        if (var10 < 128) {
            var10 = 128;
        }
        if (var10 > 383) {
            var10 = 383;
        }
        if (Statics.field1228 < var10) {
            Statics.field1228 += Statics.field2666 * (var10 - Statics.field1228) / 1000 + Statics.field228;
            if (Statics.field1228 > var10) {
                Statics.field1228 = var10;
            }
        }
        if (Statics.field1228 > var10) {
            Statics.field1228 -= Statics.field2666 * (Statics.field1228 - var10) / 1000 + Statics.field228;
            if (Statics.field1228 < var10) {
                Statics.field1228 = var10;
            }
        }
        int var12 = var11 - Statics.field1959;
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            Statics.field1959 += Statics.field2666 * var12 / 1000 + Statics.field228;
            Statics.field1959 &= 0x7FF;
        }
        if (var12 < 0) {
            Statics.field1959 -= Statics.field2666 * -var12 / 1000 + Statics.field228;
            Statics.field1959 &= 0x7FF;
        }
        int var13 = var11 - Statics.field1959;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 < 0 && var12 > 0 || var13 > 0 && var12 < 0) {
            Statics.field1959 = var11;
        }
    }

    @ObfuscatedName("ao.ay(I)V")
    public static final void method816() {
        int var0 = class33.field772;
        int[] var1 = class33.field763;
        for (int var2 = 0; var2 < var0; var2++) {
            class3 var3 = field551[var1[var2]];
            if (var3 != null) {
                method910(var3, 1);
            }
        }
    }

    @ObfuscatedName("n.af(I)V")
    public static final void method205() {
        for (int var0 = 0; var0 < field344; var0++) {
            int var1 = field336[var0];
            class35 var2 = field547[var1];
            if (var2 != null) {
                method910(var2, var2.field785.field888);
            }
        }
    }

    @ObfuscatedName("ae.al(Lax;II)V")
    public static final void method910(class38 arg0, int arg1) {
        if (arg0.field863 > field307) {
            method2371(arg0);
        } else if (arg0.field867 >= field307) {
            if (field307 == arg0.field867 || arg0.field849 == -1 || arg0.field852 != 0 || arg0.field873 + 1 > class43.method2137(arg0.field849).field996[arg0.field850]) {
                int var2 = arg0.field867 - arg0.field863;
                int var3 = field307 - arg0.field863;
                int var4 = arg0.field859 * 128 + arg0.field842 * 64;
                int var5 = arg0.field861 * 128 + arg0.field842 * 64;
                int var6 = arg0.field860 * 128 + arg0.field842 * 64;
                int var7 = arg0.field842 * 64 + arg0.field834 * 128;
                arg0.field845 = ((var2 - var3) * var4 + var3 * var6) / var2;
                arg0.field820 = ((var2 - var3) * var5 + var3 * var7) / var2;
            }
            arg0.field875 = 0;
            arg0.field854 = arg0.field865;
            arg0.field864 = arg0.field854;
        } else {
            arg0.field846 = arg0.field823;
            if (arg0.field822 == 0) {
                arg0.field875 = 0;
            } else {
                label225: {
                    if (arg0.field849 != -1 && arg0.field852 == 0) {
                        class43 var8 = class43.method2137(arg0.field849);
                        if (arg0.field876 > 0 && var8.field1004 == 0) {
                            arg0.field875++;
                            break label225;
                        }
                        if (arg0.field876 <= 0 && var8.field1005 == 0) {
                            arg0.field875++;
                            break label225;
                        }
                    }
                    int var9 = arg0.field845;
                    int var10 = arg0.field820;
                    int var11 = arg0.field872[arg0.field822 - 1] * 128 + arg0.field842 * 64;
                    int var12 = arg0.field836[arg0.field822 - 1] * 128 + arg0.field842 * 64;
                    if (var9 < var11) {
                        if (var10 < var12) {
                            arg0.field854 = 1280;
                        } else if (var10 > var12) {
                            arg0.field854 = 1792;
                        } else {
                            arg0.field854 = 1536;
                        }
                    } else if (var9 > var11) {
                        if (var10 < var12) {
                            arg0.field854 = 768;
                        } else if (var10 > var12) {
                            arg0.field854 = 256;
                        } else {
                            arg0.field854 = 512;
                        }
                    } else if (var10 < var12) {
                        arg0.field854 = 1024;
                    } else if (var10 > var12) {
                        arg0.field854 = 0;
                    }
                    byte var13 = arg0.field827[arg0.field822 - 1];
                    if (var11 - var9 <= 256 && var11 - var9 >= -256 && var12 - var10 <= 256 && var12 - var10 >= -256) {
                        int var14 = arg0.field854 - arg0.field864 & 0x7FF;
                        if (var14 > 1024) {
                            var14 -= 2048;
                        }
                        int var15 = arg0.field840;
                        if (var14 >= -256 && var14 <= 256) {
                            var15 = arg0.field826;
                        } else if (var14 >= 256 && var14 < 768) {
                            var15 = arg0.field829;
                        } else if (var14 >= -768 && var14 <= -256) {
                            var15 = arg0.field837;
                        }
                        if (var15 == -1) {
                            var15 = arg0.field826;
                        }
                        arg0.field846 = var15;
                        int var16 = 4;
                        boolean var17 = true;
                        if (arg0 instanceof class35) {
                            var17 = ((class35) arg0).field785.field921;
                        }
                        if (var17) {
                            if (arg0.field864 != arg0.field854 && arg0.field843 == -1 && arg0.field870 != 0) {
                                var16 = 2;
                            }
                            if (arg0.field822 > 2) {
                                var16 = 6;
                            }
                            if (arg0.field822 > 3) {
                                var16 = 8;
                            }
                            if (arg0.field875 > 0 && arg0.field822 > 1) {
                                var16 = 8;
                                arg0.field875--;
                            }
                        } else {
                            if (arg0.field822 > 1) {
                                var16 = 6;
                            }
                            if (arg0.field822 > 2) {
                                var16 = 8;
                            }
                            if (arg0.field875 > 0 && arg0.field822 > 1) {
                                var16 = 8;
                                arg0.field875--;
                            }
                        }
                        if (var13 == 2) {
                            var16 <<= 0x1;
                        }
                        if (var16 >= 8 && arg0.field846 == arg0.field826 && arg0.field830 != -1) {
                            arg0.field846 = arg0.field830;
                        }
                        if (var9 != var11 || var10 != var12) {
                            if (var9 < var11) {
                                arg0.field845 += var16;
                                if (arg0.field845 > var11) {
                                    arg0.field845 = var11;
                                }
                            } else if (var9 > var11) {
                                arg0.field845 -= var16;
                                if (arg0.field845 < var11) {
                                    arg0.field845 = var11;
                                }
                            }
                            if (var10 < var12) {
                                arg0.field820 += var16;
                                if (arg0.field820 > var12) {
                                    arg0.field820 = var12;
                                }
                            } else if (var10 > var12) {
                                arg0.field820 -= var16;
                                if (arg0.field820 < var12) {
                                    arg0.field820 = var12;
                                }
                            }
                        }
                        if (arg0.field845 == var11 && arg0.field820 == var12) {
                            arg0.field822--;
                            if (arg0.field876 > 0) {
                                arg0.field876--;
                            }
                        }
                    } else {
                        arg0.field845 = var11;
                        arg0.field820 = var12;
                        arg0.field822--;
                        if (arg0.field876 > 0) {
                            arg0.field876--;
                        }
                    }
                }
            }
        }
        if (arg0.field845 < 128 || arg0.field820 < 128 || arg0.field845 >= 13184 || arg0.field820 >= 13184) {
            arg0.field849 = -1;
            arg0.field866 = -1;
            arg0.field863 = 0;
            arg0.field867 = 0;
            arg0.field845 = arg0.field872[0] * 128 + arg0.field842 * 64;
            arg0.field820 = arg0.field836[0] * 128 + arg0.field842 * 64;
            arg0.method818();
        }
        if (Statics.field94 == arg0 && (arg0.field845 < 1536 || arg0.field820 < 1536 || arg0.field845 >= 11776 || arg0.field820 >= 11776)) {
            arg0.field849 = -1;
            arg0.field866 = -1;
            arg0.field863 = 0;
            arg0.field867 = 0;
            arg0.field845 = arg0.field872[0] * 128 + arg0.field842 * 64;
            arg0.field820 = arg0.field836[0] * 128 + arg0.field842 * 64;
            arg0.method818();
        }
        method201(arg0);
        method3248(arg0);
    }

    @ObfuscatedName("de.ai(Lax;I)V")
    public static final void method2371(class38 arg0) {
        int var1 = arg0.field863 - field307;
        int var2 = arg0.field859 * 128 + arg0.field842 * 64;
        int var3 = arg0.field861 * 128 + arg0.field842 * 64;
        arg0.field845 += (var2 - arg0.field845) / var1;
        arg0.field820 += (var3 - arg0.field820) / var1;
        arg0.field875 = 0;
        arg0.field854 = arg0.field865;
    }

    @ObfuscatedName("n.an(Lax;I)V")
    public static final void method201(class38 arg0) {
        if (arg0.field870 == 0) {
            return;
        }
        if (arg0.field843 != -1) {
            class38 var1 = null;
            if (arg0.field843 < 32768) {
                var1 = field547[arg0.field843];
            } else if (arg0.field843 >= 32768) {
                var1 = field551[arg0.field843 - 32768];
            }
            if (var1 != null) {
                int var2 = arg0.field845 - var1.field845;
                int var3 = arg0.field820 - var1.field820;
                if (var2 != 0 || var3 != 0) {
                    arg0.field854 = (int) (Math.atan2((double) var2, (double) var3) * 325.949D) & 0x7FF;
                }
            } else if (arg0.field844) {
                arg0.field843 = -1;
                arg0.field844 = false;
            }
        }
        if (arg0.field828 != -1 && (arg0.field822 == 0 || arg0.field875 > 0)) {
            arg0.field854 = arg0.field828;
            arg0.field828 = -1;
        }
        int var4 = arg0.field854 - arg0.field864 & 0x7FF;
        if (var4 == 0 && arg0.field844) {
            arg0.field843 = -1;
            arg0.field844 = false;
        }
        if (var4 == 0) {
            arg0.field869 = 0;
            return;
        }
        arg0.field869++;
        if (var4 > 1024) {
            arg0.field864 -= arg0.field870;
            boolean var5 = true;
            if (var4 < arg0.field870 || var4 > 2048 - arg0.field870) {
                arg0.field864 = arg0.field854;
                var5 = false;
            }
            if (arg0.field846 == arg0.field823 && (arg0.field869 > 25 || var5)) {
                if (arg0.field879 == -1) {
                    arg0.field846 = arg0.field826;
                } else {
                    arg0.field846 = arg0.field879;
                }
            }
        } else {
            arg0.field864 += arg0.field870;
            boolean var6 = true;
            if (var4 < arg0.field870 || var4 > 2048 - arg0.field870) {
                arg0.field864 = arg0.field854;
                var6 = false;
            }
            if (arg0.field846 == arg0.field823 && (arg0.field869 > 25 || var6)) {
                if (arg0.field825 == -1) {
                    arg0.field846 = arg0.field826;
                } else {
                    arg0.field846 = arg0.field825;
                }
            }
        }
        arg0.field864 &= 0x7FF;
    }

    @ObfuscatedName("fg.az(Lax;I)V")
    public static final void method3248(class38 arg0) {
        arg0.field821 = false;
        if (arg0.field846 != -1) {
            class43 var1 = class43.method2137(arg0.field846);
            if (var1 == null || var1.field990 == null) {
                arg0.field846 = -1;
            } else {
                arg0.field848++;
                if (arg0.field847 < var1.field990.length && arg0.field848 > var1.field996[arg0.field847]) {
                    arg0.field848 = 1;
                    arg0.field847++;
                    method47(var1, arg0.field847, arg0.field845, arg0.field820);
                }
                if (arg0.field847 >= var1.field990.length) {
                    arg0.field848 = 0;
                    arg0.field847 = 0;
                    method47(var1, arg0.field847, arg0.field845, arg0.field820);
                }
            }
        }
        if (arg0.field866 != -1 && field307 >= arg0.field851) {
            if (arg0.field855 < 0) {
                arg0.field855 = 0;
            }
            int var2 = class44.method688(arg0.field866).field1022;
            if (var2 == -1) {
                arg0.field866 = -1;
            } else {
                class43 var3 = class43.method2137(var2);
                if (var3 == null || var3.field990 == null) {
                    arg0.field866 = -1;
                } else {
                    arg0.field856++;
                    if (arg0.field855 < var3.field990.length && arg0.field856 > var3.field996[arg0.field855]) {
                        arg0.field856 = 1;
                        arg0.field855++;
                        method47(var3, arg0.field855, arg0.field845, arg0.field820);
                    }
                    if (arg0.field855 >= var3.field990.length && (arg0.field855 < 0 || arg0.field855 >= var3.field990.length)) {
                        arg0.field866 = -1;
                    }
                }
            }
        }
        if (arg0.field849 != -1 && arg0.field852 <= 1) {
            class43 var4 = class43.method2137(arg0.field849);
            if (var4.field1004 == 1 && arg0.field876 > 0 && arg0.field863 <= field307 && arg0.field867 < field307) {
                arg0.field852 = 1;
                return;
            }
        }
        if (arg0.field849 != -1 && arg0.field852 == 0) {
            class43 var5 = class43.method2137(arg0.field849);
            if (var5 == null || var5.field990 == null) {
                arg0.field849 = -1;
            } else {
                arg0.field873++;
                if (arg0.field850 < var5.field990.length && arg0.field873 > var5.field996[arg0.field850]) {
                    arg0.field873 = 1;
                    arg0.field850++;
                    method47(var5, arg0.field850, arg0.field845, arg0.field820);
                }
                if (arg0.field850 >= var5.field990.length) {
                    arg0.field850 -= var5.field999;
                    arg0.field853++;
                    if (arg0.field853 >= var5.field1012) {
                        arg0.field849 = -1;
                    } else if (arg0.field850 >= 0 && arg0.field850 < var5.field990.length) {
                        method47(var5, arg0.field850, arg0.field845, arg0.field820);
                    } else {
                        arg0.field849 = -1;
                    }
                }
                arg0.field821 = var5.field1013;
            }
        }
        if (arg0.field852 > 0) {
            arg0.field852--;
        }
    }

    @ObfuscatedName("gr.ac(Ld;IIB)V")
    public static void method3489(class3 arg0, int arg1, int arg2) {
        if (arg0.field849 == arg1 && arg1 != -1) {
            int var3 = class43.method2137(arg1).field1006;
            if (var3 == 1) {
                arg0.field850 = 0;
                arg0.field873 = 0;
                arg0.field852 = arg2;
                arg0.field853 = 0;
            }
            if (var3 == 2) {
                arg0.field853 = 0;
            }
        } else if (arg1 == -1 || arg0.field849 == -1 || class43.method2137(arg1).field1000 >= class43.method2137(arg0.field849).field1000) {
            arg0.field849 = arg1;
            arg0.field850 = 0;
            arg0.field873 = 0;
            arg0.field852 = arg2;
            arg0.field853 = 0;
            arg0.field876 = arg0.field822;
        }
    }

    @ObfuscatedName("o.ao(B)I")
    public static int method669() {
        return field345 ? 2 : 1;
    }

    @ObfuscatedName("az.ax(B)V")
    public static void method792() {
        field339.method2722(74);
        field339.method2452(method669());
        field339.method2448(Statics.field877);
        field339.method2448(Statics.field1672);
    }

    @ObfuscatedName("m.at(I)V")
    public static void method158() {
        client var0 = Statics.field295;
        synchronized (Statics.field295) {
            Container var1 = Statics.field295.method2954();
            if (var1 != null) {
                Statics.field2072 = Math.max(var1.getSize().width, Statics.field3077);
                Statics.field156 = Math.max(var1.getSize().height, Statics.field720);
                if (Statics.field761 == var1) {
                    Insets var2 = Statics.field761.getInsets();
                    Statics.field2072 -= var2.right + var2.left;
                    Statics.field156 -= var2.top + var2.bottom;
                }
                if (Statics.field2072 <= 0) {
                    Statics.field2072 = 1;
                }
                if (Statics.field156 <= 0) {
                    Statics.field156 = 1;
                }
                if (method669() == 1) {
                    Statics.field877 = field439 * 765;
                    Statics.field1672 = field510 * 503;
                } else {
                    Statics.field877 = Math.min(Statics.field2072, 7680);
                    Statics.field1672 = Math.min(Statics.field156, 2160);
                }
                field2193 = (Statics.field2072 - Statics.field877) / 2;
                field2192 = 0;
                Statics.field2586.setSize(Statics.field877, Statics.field1672);
                Statics.field696 = class78.method1076(Statics.field877, Statics.field1672, Statics.field2586);
                if (Statics.field761 == var1) {
                    Insets var3 = Statics.field761.getInsets();
                    Statics.field2586.setLocation(field2193 + var3.left, field2192 + var3.top);
                } else {
                    Statics.field2586.setLocation(field2193, field2192);
                }
                int var4 = Statics.field877;
                int var5 = Statics.field1672;
                if (Statics.field2072 < var4) {
                    int var6 = Statics.field2072;
                }
                if (Statics.field156 < var5) {
                    int var7 = Statics.field156;
                }
                if (Statics.field2079 != null) {
                    try {
                        client var8 = Statics.field295;
                        Object[] var9 = new Object[] { method669() };
                        JSObject.getWindow(var8).call("resize", var9);
                    } catch (Throwable var12) {
                    }
                }
                if (field453 != -1) {
                    method1063(true);
                }
                Statics.method2121();
            }
        }
    }

    @ObfuscatedName("v.ae(Ljava/lang/String;ZI)V")
    public static final void method677(String arg0, boolean arg1) {
        byte var2 = 4;
        int var3 = var2 + 6;
        int var4 = var2 + 6;
        int var5 = Statics.field2085.method3852(arg0, 250);
        int var6 = Statics.field2085.method3853(arg0, 250) * 13;
        class80.method1817(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 0);
        class80.method1829(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
        Statics.field2085.method3858(arg0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
        method745(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2);
        if (!arg1) {
            method3041(var3, var4, var5, var6);
            return;
        }
        try {
            Graphics var7 = Statics.field2586.getGraphics();
            Statics.field696.method1604(var7, 0, 0);
        } catch (Exception var9) {
            Statics.field2586.repaint();
        }
    }

    @ObfuscatedName("u.au(IIIIB)V")
    public static final void method207(int arg0, int arg1, int arg2, int arg3) {
        field400++;
        method2035(class34.field784);
        boolean var4 = false;
        if (field425 >= 0) {
            int var5 = class33.field772;
            int[] var6 = class33.field763;
            for (int var7 = 0; var7 < var5; var7++) {
                if (field425 == var6[var7]) {
                    var4 = true;
                    break;
                }
            }
        }
        if (var4) {
            method2035(class34.field778);
        }
        method3044(true);
        method2035(var4 ? class34.field780 : class34.field779);
        method3044(false);
        method2146();
        method729();
        method163(arg0, arg1, arg2, arg3, true);
        int var8 = field306;
        int var9 = field558;
        int var10 = field559;
        int var11 = field457;
        class80.method1777(var8, var9, var8 + var10, var9 + var11);
        class92.method2040();
        if (!field543) {
            int var12 = field565;
            if (field388 / 256 > var12) {
                var12 = field388 / 256;
            }
            if (field544[4] && field560[4] + 128 > var12) {
                var12 = field560[4] + 128;
            }
            int var13 = field380 + field364 & 0x7FF;
            method2234(Statics.field2223, method799(Statics.field94.field845, Statics.field94.field820, Statics.field1003) - field557, Statics.field1070, var12, var13, var12 * 3 + 600);
        }
        int var14;
        if (field543) {
            int var15;
            if (Statics.field2079.field148) {
                var15 = Statics.field1003;
            } else {
                int var16 = method799(Statics.field674, Statics.field2130, Statics.field1003);
                if (var16 - Statics.field1071 >= 800 || (class6.field83[Statics.field1003][Statics.field674 >> 7][Statics.field2130 >> 7] & 0x4) == 0) {
                    var15 = 3;
                } else {
                    var15 = Statics.field1003;
                }
            }
            var14 = var15;
        } else {
            var14 = method1318();
        }
        int var17 = Statics.field674;
        int var18 = Statics.field1071;
        int var19 = Statics.field2130;
        int var20 = Statics.field1228;
        int var21 = Statics.field1959;
        for (int var22 = 0; var22 < 5; var22++) {
            if (field544[var22]) {
                int var23 = (int) (Math.random() * (double) (field545[var22] * 2 + 1) - (double) field545[var22] + Math.sin((double) field539[var22] / 100.0D * (double) field548[var22]) * (double) field560[var22]);
                if (var22 == 0) {
                    Statics.field674 += var23;
                }
                if (var22 == 1) {
                    Statics.field1071 += var23;
                }
                if (var22 == 2) {
                    Statics.field2130 += var23;
                }
                if (var22 == 3) {
                    Statics.field1959 = Statics.field1959 + var23 & 0x7FF;
                }
                if (var22 == 4) {
                    Statics.field1228 += var23;
                    if (Statics.field1228 < 128) {
                        Statics.field1228 = 128;
                    }
                    if (Statics.field1228 > 383) {
                        Statics.field1228 = 383;
                    }
                }
            }
        }
        int var24 = class141.field2152;
        int var25 = class141.field2162;
        if (class141.field2158 != 0) {
            var24 = class141.field2161;
            var25 = class141.field2160;
        }
        if (var24 >= var8 && var24 < var8 + var10 && var25 >= var9 && var25 < var9 + var11) {
            class106.field1849 = true;
            class106.field1852 = 0;
            class106.field1795 = var24 - var8;
            class106.field1851 = var25 - var9;
        } else {
            class106.field1849 = false;
            class106.field1852 = 0;
        }
        method913();
        class80.method1817(var8, var9, var10, var11, 0);
        method913();
        int var26 = class92.field1580;
        class92.field1580 = field561;
        Statics.field718.method1878(Statics.field674, Statics.field1071, Statics.field2130, Statics.field1228, Statics.field1959, var14);
        class92.field1580 = var26;
        method913();
        Statics.field718.method1969();
        method2120(var8, var9, var10, var11);
        method2242(var8, var9);
        ((class96) Statics.field1576).method2128(field428);
        method253(var8, var9, var10, var11);
        Statics.field674 = var17;
        Statics.field1071 = var18;
        Statics.field2130 = var19;
        Statics.field1228 = var20;
        Statics.field1959 = var21;
        if (field508) {
            byte var27 = 0;
            int var28 = class172.field2728 + class172.field2720 + var27;
            if (var28 == 0) {
                field508 = false;
            }
        }
        if (field508) {
            class80.method1817(var8, var9, var10, var11, 0);
            method677(class158.field2311, false);
        }
    }

    @ObfuscatedName("e.am(IIIIZI)V")
    public static final void method163(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
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
        int var6 = (field536 - field549) * var5 / 100 + field549;
        int var7 = arg3 * var6 * 512 / (arg2 * 334);
        if (var7 < field386) {
            short var8 = field386;
            var6 = arg2 * var8 * 334 / (arg3 * 512);
            if (var6 > field554) {
                var6 = field554;
                int var9 = arg3 * var6 * 512 / (var8 * 334);
                int var10 = (arg2 - var9) / 2;
                if (arg4) {
                    class80.method1776();
                    class80.method1817(arg0, arg1, var10, arg3, -16777216);
                    class80.method1817(arg0 + arg2 - var10, arg1, var10, arg3, -16777216);
                }
                arg0 += var10;
                arg2 -= var10 * 2;
            }
        } else if (var7 > field556) {
            short var11 = field556;
            var6 = arg2 * var11 * 334 / (arg3 * 512);
            if (var6 < field553) {
                var6 = field553;
                int var12 = arg2 * var11 * 334 / (var6 * 512);
                int var13 = (arg3 - var12) / 2;
                if (arg4) {
                    class80.method1776();
                    class80.method1817(arg0, arg1, arg2, var13, -16777216);
                    class80.method1817(arg0, arg1 + arg3 - var13, arg2, var13, -16777216);
                }
                arg1 += var13;
                arg3 -= var13 * 2;
            }
        }
        int var14 = (field546 - field422) * var5 / 100 + field422;
        field561 = arg3 * var6 * var14 / 85504 << 1;
        if (field559 != arg2 || field457 != arg3) {
            int[] var15 = new int[9];
            for (int var16 = 0; var16 < 9; var16++) {
                int var17 = var16 * 32 + 128 + 15;
                int var18 = var17 * 3 + 600;
                int var19 = class92.field1594[var17];
                var15[var16] = var18 * var19 >> 16;
            }
            class87.method1914(var15, 500, 800, arg2, arg3);
        }
        field306 = arg0;
        field558 = arg1;
        field559 = arg2;
        field457 = arg3;
    }

    @ObfuscatedName("cy.aj(Lan;B)V")
    public static final void method2035(class34 arg0) {
        if (Statics.field94.field845 >> 7 == field529 && Statics.field94.field820 >> 7 == field348) {
            field529 = 0;
        }
        int var1 = class33.field772;
        int[] var2 = class33.field763;
        int var3 = var1;
        if (class34.field784 == arg0 || class34.field778 == arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class3 var5;
            int var6;
            if (class34.field784 == arg0) {
                var5 = Statics.field94;
                var6 = Statics.field94.field50 << 14;
            } else if (class34.field778 == arg0) {
                var5 = field551[field425];
                var6 = field425 << 14;
            } else {
                var5 = field551[var2[var4]];
                var6 = var2[var4] << 14;
                if (class34.field780 == arg0 && field425 == var2[var4]) {
                    continue;
                }
            }
            if (var5 != null && var5.method29() && !var5.field52) {
                var5.field38 = false;
                if ((field303 && var1 > 50 || var1 > 200) && class34.field784 != arg0 && var5.field846 == var5.field823) {
                    var5.field38 = true;
                }
                int var7 = var5.field845 >> 7;
                int var8 = var5.field820 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field47 == null || field307 < var5.field36 || field307 >= var5.field43) {
                        if ((var5.field845 & 0x7F) == 64 && (var5.field820 & 0x7F) == 64) {
                            if (field400 == field399[var7][var8]) {
                                continue;
                            }
                            field399[var7][var8] = field400;
                        }
                        var5.field41 = method799(var5.field845, var5.field820, Statics.field1003);
                        Statics.field718.method1890(Statics.field1003, var5.field845, var5.field820, var5.field41, 60, var5, var5.field864, var6, var5.field821);
                    } else {
                        var5.field38 = false;
                        var5.field41 = method799(var5.field845, var5.field820, Statics.field1003);
                        Statics.field718.method1891(Statics.field1003, var5.field845, var5.field820, var5.field41, 60, var5, var5.field864, var6, var5.field48, var5.field49, var5.field53, var5.field54);
                    }
                }
            }
        }
    }

    @ObfuscatedName("ev.aq(ZI)V")
    public static final void method3044(boolean arg0) {
        for (int var1 = 0; var1 < field344; var1++) {
            class35 var2 = field547[field336[var1]];
            int var3 = (field336[var1] << 14) + 536870912;
            if (var2 != null && var2.method29() && var2.field785.field889 == arg0 && var2.field785.method841()) {
                int var4 = var2.field845 >> 7;
                int var5 = var2.field820 >> 7;
                if (var4 >= 0 && var4 < 104 && var5 >= 0 && var5 < 104) {
                    if (var2.field842 == 1 && (var2.field845 & 0x7F) == 64 && (var2.field820 & 0x7F) == 64) {
                        if (field400 == field399[var4][var5]) {
                            continue;
                        }
                        field399[var4][var5] = field400;
                    }
                    if (!var2.field785.field899) {
                        var3 -= Integer.MIN_VALUE;
                    }
                    Statics.field718.method1890(Statics.field1003, var2.field845, var2.field820, method799(var2.field845 + (var2.field842 * 64 - 64), var2.field820 + (var2.field842 * 64 - 64), Statics.field1003), var2.field842 * 64 - 64 + 60, var2, var2.field864, var3, var2.field821);
                }
            }
        }
    }

    @ObfuscatedName("cf.ag(B)V")
    public static final void method2146() {
        for (class7 var0 = (class7) field450.method3665(); var0 != null; var0 = (class7) field450.method3641()) {
            if (Statics.field1003 != var0.field130 || field307 > var0.field133) {
                var0.method3737();
            } else if (field307 >= var0.field110) {
                if (var0.field104 > 0) {
                    class35 var1 = field547[var0.field104 - 1];
                    if (var1 != null && var1.field845 >= 0 && var1.field845 < 13312 && var1.field820 >= 0 && var1.field820 < 13312) {
                        var0.method132(var1.field845, var1.field820, method799(var1.field845, var1.field820, var0.field130) - var0.field118, field307);
                    }
                }
                if (var0.field104 < 0) {
                    int var2 = -var0.field104 - 1;
                    class3 var3;
                    if (field458 == var2) {
                        var3 = Statics.field94;
                    } else {
                        var3 = field551[var2];
                    }
                    if (var3 != null && var3.field845 >= 0 && var3.field845 < 13312 && var3.field820 >= 0 && var3.field820 < 13312) {
                        var0.method132(var3.field845, var3.field820, method799(var3.field845, var3.field820, var0.field130) - var0.field118, field307);
                    }
                }
                var0.method127(field428);
                Statics.field718.method1890(Statics.field1003, (int) var0.field105, (int) var0.field117, (int) var0.field116, 60, var0, var0.field124, -1, false);
            }
        }
    }

    @ObfuscatedName("ay.ap(B)V")
    public static final void method729() {
        for (class30 var0 = (class30) field429.method3665(); var0 != null; var0 = (class30) field429.method3641()) {
            if (Statics.field1003 != var0.field698 || var0.field707) {
                var0.method3737();
            } else if (field307 >= var0.field699) {
                var0.method728(field428);
                if (var0.field707) {
                    var0.method3737();
                } else {
                    Statics.field718.method1890(var0.field698, var0.field705, var0.field702, var0.field701, 60, var0, 0, -1, false);
                }
            }
        }
    }

    @ObfuscatedName("by.ak(B)I")
    public static final int method1318() {
        if (Statics.field2079.field148) {
            return Statics.field1003;
        }
        int var0 = 3;
        if (Statics.field1228 < 310) {
            int var1 = Statics.field674 >> 7;
            int var2 = Statics.field2130 >> 7;
            int var3 = Statics.field94.field845 >> 7;
            int var4 = Statics.field94.field820 >> 7;
            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
                return Statics.field1003;
            }
            if ((class6.field83[Statics.field1003][var1][var2] & 0x4) != 0) {
                var0 = Statics.field1003;
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
                    if ((class6.field83[Statics.field1003][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1003;
                    }
                    var8 += var7;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var2 < var4) {
                            var2++;
                        } else if (var2 > var4) {
                            var2--;
                        }
                        if ((class6.field83[Statics.field1003][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1003;
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
                    if ((class6.field83[Statics.field1003][var1][var2] & 0x4) != 0) {
                        var0 = Statics.field1003;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var1 < var3) {
                            var1++;
                        } else if (var1 > var3) {
                            var1--;
                        }
                        if ((class6.field83[Statics.field1003][var1][var2] & 0x4) != 0) {
                            var0 = Statics.field1003;
                        }
                    }
                }
            }
        }
        if (Statics.field94.field845 >= 0 && Statics.field94.field820 >= 0 && Statics.field94.field845 < 13312 && Statics.field94.field820 < 13312) {
            if ((class6.field83[Statics.field1003][Statics.field94.field845 >> 7][Statics.field94.field820 >> 7] & 0x4) != 0) {
                var0 = Statics.field1003;
            }
            return var0;
        } else {
            return Statics.field1003;
        }
    }

    @ObfuscatedName("di.as(IIS)V")
    public static final void method2242(int arg0, int arg1) {
        if (field315 == 2) {
            method138((field392 - Statics.field2205 << 7) + field321, (field319 - Statics.field68 << 7) + field322, field320 * 2);
            if (field401 > -1 && field307 % 20 < 10) {
                Statics.field2045[0].method1686(field401 + arg0 - 12, field294 + arg1 - 28);
            }
        }
    }

    @ObfuscatedName("cq.aa(Lax;IIIIIB)V")
    public static final void method2133(class38 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null || !arg0.method29()) {
            return;
        }
        if (arg0 instanceof class35) {
            class40 var6 = ((class35) arg0).field785;
            if (var6.field917 != null) {
                var6 = var6.method840();
            }
            if (var6 == null) {
                return;
            }
        }
        int var7 = class33.field772;
        int[] var8 = class33.field763;
        if (arg1 < var7) {
            int var9 = 30;
            class3 var10 = (class3) arg0;
            if (var10.field52) {
                return;
            }
            if (var10.field42 != -1 || var10.field51 != -1) {
                method2775(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    if (var10.field42 != -1) {
                        Statics.field14[var10.field42].method1686(field401 + arg2 - 12, field294 + arg3 - var9);
                        var9 += 25;
                    }
                    if (var10.field51 != -1) {
                        Statics.field2896[var10.field51].method1686(field401 + arg2 - 12, field294 + arg3 - var9);
                        var9 += 25;
                    }
                }
            }
            if (arg1 >= 0 && field315 == 10 && field317 == var8[arg1]) {
                method2775(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    Statics.field2045[1].method1686(field401 + arg2 - 12, field294 + arg3 - var9);
                }
            }
        } else {
            class40 var11 = ((class35) arg0).field785;
            if (var11.field917 != null) {
                var11 = var11.method840();
            }
            if (var11.field915 >= 0 && var11.field915 < Statics.field2896.length) {
                method2775(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    Statics.field2896[var11.field915].method1686(field401 + arg2 - 12, field294 + arg3 - 30);
                }
            }
            if (field315 == 1 && field316 == field336[arg1 - var7] && field307 % 20 < 10) {
                method2775(arg0, arg0.field868 + 15);
                if (field401 > -1) {
                    Statics.field2045[0].method1686(field401 + arg2 - 12, field294 + arg3 - 28);
                }
            }
        }
        if (arg0.field831 != null && (arg1 >= var7 || !arg0.field833 && (field512 == 4 || !arg0.field862 && (field512 == 0 || field512 == 3 || field512 == 1 && method926(((class3) arg0).field59, false))))) {
            method2775(arg0, arg0.field868);
            if (field401 > -1 && field389 < field390) {
                field420[field389] = Statics.field782.method3850(arg0.field831) / 2;
                field567[field389] = Statics.field782.field3191;
                field391[field389] = field401;
                field534[field389] = field294;
                field460[field389] = arg0.field835;
                field503[field389] = arg0.field874;
                field397[field389] = arg0.field857;
                field489[field389] = arg0.field831;
                field389++;
            }
        }
        if (arg0.field871 > field307) {
            method2775(arg0, arg0.field868 + 15);
            if (field401 > -1) {
                int var12;
                if (arg1 < var7) {
                    var12 = 30;
                } else {
                    class40 var13 = ((class35) arg0).field785;
                    var12 = var13.field923;
                }
                int var14 = arg0.field841 * var12 / arg0.field832;
                if (var14 > var12) {
                    var14 = var12;
                } else if (var14 == 0 && arg0.field841 > 0) {
                    var14 = 1;
                }
                class80.method1817(field401 + arg2 - var12 / 2, field294 + arg3 - 3, var14, 5, 65280);
                class80.method1817(field401 + arg2 - var12 / 2 + var14, field294 + arg3 - 3, var12 - var14, 5, 16711680);
            }
        }
        for (int var15 = 0; var15 < 4; var15++) {
            if (arg0.field839[var15] > field307) {
                method2775(arg0, arg0.field868 / 2);
                if (field401 > -1) {
                    if (var15 == 1) {
                        field294 -= 20;
                    }
                    if (var15 == 2) {
                        field401 -= 15;
                        field294 -= 10;
                    }
                    if (var15 == 3) {
                        field401 += 15;
                        field294 -= 10;
                    }
                    Statics.field76[arg0.field838[var15]].method1686(field401 + arg2 - 12, field294 + arg3 - 12);
                    Statics.field2221.method3857(Integer.toString(arg0.field819[var15]), field401 + arg2 - 1, field294 + arg3 + 3, 16777215, 0);
                }
            }
        }
    }

    @ObfuscatedName("ci.av(IIIIS)V")
    public static final void method2120(int arg0, int arg1, int arg2, int arg3) {
        field389 = 0;
        boolean var4 = false;
        int var5 = -1;
        int var6 = class33.field772;
        int[] var7 = class33.field763;
        for (int var8 = 0; var8 < field344 + var6; var8++) {
            class38 var9;
            if (var8 < var6) {
                var9 = field551[var7[var8]];
                if (field425 == var7[var8]) {
                    var4 = true;
                    var5 = var8;
                    continue;
                }
            } else {
                var9 = field547[field336[var8 - var6]];
            }
            method2133(var9, var8, arg0, arg1, arg2, arg3);
        }
        if (var4) {
            method2133(field551[field425], var5, arg0, arg1, arg2, arg3);
        }
        for (int var10 = 0; var10 < field389; var10++) {
            int var11 = field391[var10];
            int var12 = field534[var10];
            int var13 = field420[var10];
            int var14 = field567[var10];
            boolean var15 = true;
            while (var15) {
                var15 = false;
                for (int var16 = 0; var16 < var10; var16++) {
                    if (var12 + 2 > field534[var16] - field567[var16] && var12 - var14 < field534[var16] + 2 && var11 - var13 < field420[var16] + field391[var16] && var11 + var13 > field391[var16] - field420[var16] && field534[var16] - field567[var16] < var12) {
                        var12 = field534[var16] - field567[var16];
                        var15 = true;
                    }
                }
            }
            field401 = field391[var10];
            field294 = field534[var10] = var12;
            String var17 = field489[var10];
            if (field455 == 0) {
                int var18 = 16776960;
                if (field460[var10] < 6) {
                    var18 = field511[field460[var10]];
                }
                if (field460[var10] == 6) {
                    var18 = field400 % 20 < 10 ? 16711680 : 16776960;
                }
                if (field460[var10] == 7) {
                    var18 = field400 % 20 < 10 ? 255 : 65535;
                }
                if (field460[var10] == 8) {
                    var18 = field400 % 20 < 10 ? 45056 : 8454016;
                }
                if (field460[var10] == 9) {
                    int var19 = 150 - field397[var10];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16776960 - (var19 - 50) * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (field460[var10] == 10) {
                    int var20 = 150 - field397[var10];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - (var20 - 50) * 327680;
                    } else if (var20 < 150) {
                        var18 = (var20 - 100) * 327680 + 255 - (var20 - 100) * 5;
                    }
                }
                if (field460[var10] == 11) {
                    int var21 = 150 - field397[var10];
                    if (var21 < 50) {
                        var18 = 16777215 - var21 * 327685;
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                if (field503[var10] == 0) {
                    Statics.field782.method3857(var17, field401 + arg0, field294 + arg1, var18, 0);
                }
                if (field503[var10] == 1) {
                    Statics.field782.method3859(var17, field401 + arg0, field294 + arg1, var18, 0, field400);
                }
                if (field503[var10] == 2) {
                    Statics.field782.method3860(var17, field401 + arg0, field294 + arg1, var18, 0, field400);
                }
                if (field503[var10] == 3) {
                    Statics.field782.method3861(var17, field401 + arg0, field294 + arg1, var18, 0, field400, 150 - field397[var10]);
                }
                if (field503[var10] == 4) {
                    int var22 = (150 - field397[var10]) * (Statics.field782.method3850(var17) + 100) / 150;
                    class80.method1833(field401 + arg0 - 50, arg1, field401 + arg0 + 50, arg1 + arg3);
                    Statics.field782.method3855(var17, field401 + arg0 + 50 - var22, field294 + arg1, var18, 0);
                    class80.method1777(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
                if (field503[var10] == 5) {
                    int var23 = 150 - field397[var10];
                    int var24 = 0;
                    if (var23 < 25) {
                        var24 = var23 - 25;
                    } else if (var23 > 125) {
                        var24 = var23 - 125;
                    }
                    class80.method1833(arg0, field294 + arg1 - Statics.field782.field3191 - 1, arg0 + arg2, field294 + arg1 + 5);
                    Statics.field782.method3857(var17, field401 + arg0, field294 + arg1 + var24, var18, 0);
                    class80.method1777(arg0, arg1, arg0 + arg2, arg1 + arg3);
                }
            } else {
                Statics.field782.method3857(var17, field401 + arg0, field294 + arg1, 16776960, 0);
            }
        }
    }

    @ObfuscatedName("h.aw(IIIII)V")
    public static final void method253(int arg0, int arg1, int arg2, int arg3) {
        if (field468 == 1) {
            Statics.field2135[field405 / 100].method1686(field403 - 8, field404 - 8);
        }
        if (field468 == 2) {
            Statics.field2135[field405 / 100 + 4].method1686(field403 - 8, field404 - 8);
        }
        field367 = 0;
        int var4 = (Statics.field94.field845 >> 7) + Statics.field2205;
        int var5 = (Statics.field94.field820 >> 7) + Statics.field68;
        if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
            field367 = 1;
        }
        if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
            field367 = 1;
        }
        if (field367 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
            field367 = 0;
        }
    }

    @ObfuscatedName("du.bb(Lax;II)V")
    public static final void method2775(class38 arg0, int arg1) {
        method138(arg0.field845, arg0.field820, arg1);
    }

    @ObfuscatedName("p.bh(IIIB)V")
    public static final void method138(int arg0, int arg1, int arg2) {
        if (arg0 < 128 || arg1 < 128 || arg0 > 13056 || arg1 > 13056) {
            field401 = -1;
            field294 = -1;
            return;
        }
        int var3 = method799(arg0, arg1, Statics.field1003) - arg2;
        int var4 = arg0 - Statics.field674;
        int var5 = var3 - Statics.field1071;
        int var6 = arg1 - Statics.field2130;
        int var7 = class92.field1594[Statics.field1228];
        int var8 = class92.field1595[Statics.field1228];
        int var9 = class92.field1594[Statics.field1959];
        int var10 = class92.field1595[Statics.field1959];
        int var11 = var4 * var10 + var6 * var9 >> 16;
        int var12 = var6 * var10 - var4 * var9 >> 16;
        int var14 = var5 * var8 - var7 * var12 >> 16;
        int var15 = var5 * var7 + var8 * var12 >> 16;
        if (var15 >= 50) {
            field401 = field561 * var11 / var15 + field559 / 2;
            field294 = field561 * var14 / var15 + field457 / 2;
        } else {
            field401 = -1;
            field294 = -1;
        }
    }

    @ObfuscatedName("az.bg(IIII)I")
    public static final int method799(int arg0, int arg1, int arg2) {
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
        int var8 = (128 - var6) * class6.field95[var5][var3][var4] + class6.field95[var5][var3 + 1][var4] * var6 >> 7;
        int var9 = (128 - var6) * class6.field95[var5][var3][var4 + 1] + class6.field95[var5][var3 + 1][var4 + 1] * var6 >> 7;
        return (128 - var7) * var8 + var7 * var9 >> 7;
    }

    @ObfuscatedName("cl.bm(IIIIIII)V")
    public static final void method2234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 2048 - arg3 & 0x7FF;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        if (var6 != 0) {
            int var11 = class92.field1594[var6];
            int var12 = class92.field1595[var6];
            int var13 = var9 * var12 - arg5 * var11 >> 16;
            var10 = var9 * var11 + arg5 * var12 >> 16;
            var9 = var13;
        }
        if (var7 != 0) {
            int var14 = class92.field1594[var7];
            int var15 = class92.field1595[var7];
            int var16 = var8 * var15 + var10 * var14 >> 16;
            var10 = var10 * var15 - var8 * var14 >> 16;
            var8 = var16;
        }
        Statics.field674 = arg0 - var8;
        Statics.field1071 = arg1 - var9;
        Statics.field2130 = arg2 - var10;
        Statics.field1228 = arg3;
        Statics.field1959 = arg4;
    }

    @ObfuscatedName("m.bl(ZI)V")
    public static final void method160(boolean arg0) {
        field357 = arg0;
        if (!field357) {
            int var1 = field442.method2497();
            int var2 = field442.method2446();
            int var3 = field442.method2464();
            Statics.field1860 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    Statics.field1860[var4][var5] = field442.method2467();
                }
            }
            Statics.field204 = new int[var3];
            Statics.field1360 = new int[var3];
            Statics.field1930 = new int[var3];
            Statics.field169 = new byte[var3][];
            Statics.field137 = new byte[var3][];
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
                        Statics.field204[var7] = var10;
                        Statics.field1360[var7] = Statics.field157.method3162("m" + var8 + "_" + var9);
                        Statics.field1930[var7] = Statics.field157.method3162("l" + var8 + "_" + var9);
                        var7++;
                    }
                }
            }
            method727(var1, var2);
            return;
        }
        int var11 = field442.method2497();
        int var12 = field442.method2446();
        int var13 = field442.method2464();
        field442.method2715();
        for (int var14 = 0; var14 < 4; var14++) {
            for (int var15 = 0; var15 < 13; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    int var17 = field442.method2712(1);
                    if (var17 == 1) {
                        field530[var14][var15][var16] = field442.method2712(26);
                    } else {
                        field530[var14][var15][var16] = -1;
                    }
                }
            }
        }
        field442.method2717();
        Statics.field1860 = new int[var13][4];
        for (int var18 = 0; var18 < var13; var18++) {
            for (int var19 = 0; var19 < 4; var19++) {
                Statics.field1860[var18][var19] = field442.method2467();
            }
        }
        Statics.field204 = new int[var13];
        Statics.field1360 = new int[var13];
        Statics.field1930 = new int[var13];
        Statics.field169 = new byte[var13][];
        Statics.field137 = new byte[var13][];
        int var20 = 0;
        for (int var21 = 0; var21 < 4; var21++) {
            for (int var22 = 0; var22 < 13; var22++) {
                for (int var23 = 0; var23 < 13; var23++) {
                    int var24 = field530[var21][var22][var23];
                    if (var24 != -1) {
                        int var25 = var24 >> 14 & 0x3FF;
                        int var26 = var24 >> 3 & 0x7FF;
                        int var27 = (var25 / 8 << 8) + var26 / 8;
                        for (int var28 = 0; var28 < var20; var28++) {
                            if (Statics.field204[var28] == var27) {
                                var27 = -1;
                                break;
                            }
                        }
                        if (var27 != -1) {
                            Statics.field204[var20] = var27;
                            int var29 = var27 >> 8 & 0xFF;
                            int var30 = var27 & 0xFF;
                            Statics.field1360[var20] = Statics.field157.method3162("m" + var29 + "_" + var30);
                            Statics.field1930[var20] = Statics.field157.method3162("l" + var29 + "_" + var30);
                            var20++;
                        }
                    }
                }
            }
        }
        method727(var11, var12);
    }

    @ObfuscatedName("ah.bk(III)V")
    public static final void method727(int arg0, int arg1) {
        if (Statics.field711 == arg0 && Statics.field695 == arg1) {
            return;
        }
        Statics.field711 = arg0;
        Statics.field695 = arg1;
        method50(25);
        method677(class158.field2311, true);
        int var2 = Statics.field2205;
        int var3 = Statics.field68;
        Statics.field2205 = (arg0 - 6) * 8;
        Statics.field68 = (arg1 - 6) * 8;
        int var4 = Statics.field2205 - var2;
        int var5 = Statics.field68 - var3;
        int var6 = Statics.field2205;
        int var7 = Statics.field68;
        for (int var8 = 0; var8 < 32768; var8++) {
            class35 var9 = field547[var8];
            if (var9 != null) {
                for (int var10 = 0; var10 < 10; var10++) {
                    var9.field872[var10] -= var4;
                    var9.field836[var10] -= var5;
                }
                var9.field845 -= var4 * 128;
                var9.field820 -= var5 * 128;
            }
        }
        for (int var11 = 0; var11 < 2048; var11++) {
            class3 var12 = field551[var11];
            if (var12 != null) {
                for (int var13 = 0; var13 < 10; var13++) {
                    var12.field872[var13] -= var4;
                    var12.field836[var13] -= var5;
                }
                var12.field845 -= var4 * 128;
                var12.field820 -= var5 * 128;
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
                        field426[var24][var20][var21] = field426[var24][var22][var23];
                    } else {
                        field426[var24][var20][var21] = null;
                    }
                }
            }
        }
        for (class17 var25 = (class17) field427.method3665(); var25 != null; var25 = (class17) field427.method3641()) {
            var25.field239 -= var4;
            var25.field244 -= var5;
            if (var25.field239 < 0 || var25.field244 < 0 || var25.field239 >= 104 || var25.field244 >= 104) {
                var25.method3737();
            }
        }
        if (field529 != 0) {
            field529 -= var4;
            field348 -= var5;
        }
        field537 = 0;
        field543 = false;
        field524 = -1;
        field429.method3637();
        field450.method3637();
        for (int var26 = 0; var26 < 4; var26++) {
            field362[var26].method2340();
        }
    }

    @ObfuscatedName("by.bi(ZB)V")
    public static final void method1317(boolean arg0) {
        method913();
        field417++;
        if (field417 < 50 && !arg0) {
            return;
        }
        field417 = 0;
        if (field350 || Statics.field2048 == null) {
            return;
        }
        field339.method2722(226);
        try {
            Statics.field2048.method2931(field339.field1994, 0, field339.field1993);
            field339.field1993 = 0;
        } catch (IOException var2) {
            field350 = true;
        }
    }

    @ObfuscatedName("ac.by(B)V")
    public static final void method808() {
        method1317(false);
        field351 = 0;
        boolean var0 = true;
        for (int var1 = 0; var1 < Statics.field169.length; var1++) {
            if (Statics.field1360[var1] != -1 && Statics.field169[var1] == null) {
                Statics.field169[var1] = Statics.field157.method3188(Statics.field1360[var1], 0);
                if (Statics.field169[var1] == null) {
                    var0 = false;
                    field351++;
                }
            }
            if (Statics.field1930[var1] != -1 && Statics.field137[var1] == null) {
                Statics.field137[var1] = Statics.field157.method3148(Statics.field1930[var1], 0, Statics.field1860[var1]);
                if (Statics.field137[var1] == null) {
                    var0 = false;
                    field351++;
                }
            }
        }
        if (!var0) {
            field347 = 1;
            return;
        }
        field334 = 0;
        boolean var2 = true;
        for (int var3 = 0; var3 < Statics.field169.length; var3++) {
            byte[] var4 = Statics.field137[var3];
            if (var4 != null) {
                int var5 = (Statics.field204[var3] >> 8) * 64 - Statics.field2205;
                int var6 = (Statics.field204[var3] & 0xFF) * 64 - Statics.field68;
                if (field357) {
                    var5 = 10;
                    var6 = 10;
                }
                var2 &= class6.method2393(var4, var5, var6);
            }
        }
        if (!var2) {
            field347 = 2;
            return;
        }
        if (field347 != 0) {
            method677(class158.field2311 + class2.field24 + class2.field23 + 100 + "%" + class2.field18, true);
        }
        method913();
        method49();
        method913();
        Statics.field718.method1913();
        method913();
        System.gc();
        for (int var7 = 0; var7 < 4; var7++) {
            field362[var7].method2340();
        }
        for (int var8 = 0; var8 < 4; var8++) {
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var10 = 0; var10 < 104; var10++) {
                    class6.field83[var8][var9][var10] = 0;
                }
            }
        }
        method913();
        class6.method3309();
        int var11 = Statics.field169.length;
        for (class24 var12 = (class24) class24.field628.method3665(); var12 != null; var12 = (class24) class24.field628.method3641()) {
            if (var12.field616 != null) {
                Statics.field179.method1213(var12.field616);
                var12.field616 = null;
            }
            if (var12.field624 != null) {
                Statics.field179.method1213(var12.field624);
                var12.field624 = null;
            }
        }
        class24.field628.method3637();
        method1317(true);
        if (!field357) {
            for (int var13 = 0; var13 < var11; var13++) {
                int var14 = (Statics.field204[var13] >> 8) * 64 - Statics.field2205;
                int var15 = (Statics.field204[var13] & 0xFF) * 64 - Statics.field68;
                byte[] var16 = Statics.field169[var13];
                if (var16 != null) {
                    method913();
                    class6.method124(var16, var14, var15, Statics.field711 * 8 - 48, Statics.field695 * 8 - 48, field362);
                }
            }
            for (int var17 = 0; var17 < var11; var17++) {
                int var18 = (Statics.field204[var17] >> 8) * 64 - Statics.field2205;
                int var19 = (Statics.field204[var17] & 0xFF) * 64 - Statics.field68;
                byte[] var20 = Statics.field169[var17];
                if (var20 == null && Statics.field695 < 800) {
                    method913();
                    class6.method14(var18, var19, 64, 64);
                }
            }
            method1317(true);
            for (int var21 = 0; var21 < var11; var21++) {
                byte[] var22 = Statics.field137[var21];
                if (var22 != null) {
                    int var23 = (Statics.field204[var21] >> 8) * 64 - Statics.field2205;
                    int var24 = (Statics.field204[var21] & 0xFF) * 64 - Statics.field68;
                    method913();
                    class87 var25 = Statics.field718;
                    class109[] var26 = field362;
                    class120 var27 = new class120(var22);
                    int var28 = -1;
                    while (true) {
                        int var29 = var27.method2661();
                        if (var29 == 0) {
                            break;
                        }
                        var28 += var29;
                        int var30 = 0;
                        while (true) {
                            int var31 = var27.method2661();
                            if (var31 == 0) {
                                break;
                            }
                            var30 += var31 - 1;
                            int var32 = var30 & 0x3F;
                            int var33 = var30 >> 6 & 0x3F;
                            int var34 = var30 >> 12;
                            int var35 = var27.method2462();
                            int var36 = var35 >> 2;
                            int var37 = var35 & 0x3;
                            int var38 = var23 + var33;
                            int var39 = var24 + var32;
                            if (var38 > 0 && var39 > 0 && var38 < 103 && var39 < 103) {
                                int var40 = var34;
                                if ((class6.field83[1][var38][var39] & 0x2) == 2) {
                                    var40 = var34 - 1;
                                }
                                class109 var41 = null;
                                if (var40 >= 0) {
                                    var41 = var26[var40];
                                }
                                class6.method1061(var34, var38, var39, var28, var37, var36, var25, var41);
                            }
                        }
                    }
                }
            }
        }
        if (field357) {
            for (int var42 = 0; var42 < 4; var42++) {
                method913();
                for (int var43 = 0; var43 < 13; var43++) {
                    for (int var44 = 0; var44 < 13; var44++) {
                        boolean var45 = false;
                        int var46 = field530[var42][var43][var44];
                        if (var46 != -1) {
                            int var47 = var46 >> 24 & 0x3;
                            int var48 = var46 >> 1 & 0x3;
                            int var49 = var46 >> 14 & 0x3FF;
                            int var50 = var46 >> 3 & 0x7FF;
                            int var51 = (var49 / 8 << 8) + var50 / 8;
                            for (int var52 = 0; var52 < Statics.field204.length; var52++) {
                                if (Statics.field204[var52] == var51 && Statics.field169[var52] != null) {
                                    class6.method2964(Statics.field169[var52], var42, var43 * 8, var44 * 8, var47, (var49 & 0x7) * 8, (var50 & 0x7) * 8, var48, field362);
                                    var45 = true;
                                    break;
                                }
                            }
                        }
                        if (!var45) {
                            class6.method2031(var42, var43 * 8, var44 * 8);
                        }
                    }
                }
            }
            for (int var53 = 0; var53 < 13; var53++) {
                for (int var54 = 0; var54 < 13; var54++) {
                    int var55 = field530[0][var53][var54];
                    if (var55 == -1) {
                        class6.method14(var53 * 8, var54 * 8, 8, 8);
                    }
                }
            }
            method1317(true);
            for (int var56 = 0; var56 < 4; var56++) {
                method913();
                for (int var57 = 0; var57 < 13; var57++) {
                    label322: for (int var58 = 0; var58 < 13; var58++) {
                        int var59 = field530[var56][var57][var58];
                        if (var59 != -1) {
                            int var60 = var59 >> 24 & 0x3;
                            int var61 = var59 >> 1 & 0x3;
                            int var62 = var59 >> 14 & 0x3FF;
                            int var63 = var59 >> 3 & 0x7FF;
                            int var64 = (var62 / 8 << 8) + var63 / 8;
                            for (int var65 = 0; var65 < Statics.field204.length; var65++) {
                                if (Statics.field204[var65] == var64 && Statics.field137[var65] != null) {
                                    byte[] var66 = Statics.field137[var65];
                                    int var67 = var57 * 8;
                                    int var68 = var58 * 8;
                                    int var69 = (var62 & 0x7) * 8;
                                    int var70 = (var63 & 0x7) * 8;
                                    class87 var71 = Statics.field718;
                                    class109[] var72 = field362;
                                    class120 var73 = new class120(var66);
                                    int var74 = -1;
                                    while (true) {
                                        int var75 = var73.method2661();
                                        if (var75 == 0) {
                                            continue label322;
                                        }
                                        var74 += var75;
                                        int var76 = 0;
                                        while (true) {
                                            int var77 = var73.method2661();
                                            if (var77 == 0) {
                                                break;
                                            }
                                            var76 += var77 - 1;
                                            int var78 = var76 & 0x3F;
                                            int var79 = var76 >> 6 & 0x3F;
                                            int var80 = var76 >> 12;
                                            int var81 = var73.method2462();
                                            int var82 = var81 >> 2;
                                            int var83 = var81 & 0x3;
                                            if (var60 == var80 && var79 >= var69 && var79 < var69 + 8 && var78 >= var70 && var78 < var70 + 8) {
                                                class41 var84 = class41.method2809(var74);
                                                int var85 = var67 + class178.method118(var79 & 0x7, var78 & 0x7, var61, var84.field939, var84.field940, var83);
                                                int var86 = var68 + class178.method211(var79 & 0x7, var78 & 0x7, var61, var84.field939, var84.field940, var83);
                                                if (var85 > 0 && var86 > 0 && var85 < 103 && var86 < 103) {
                                                    int var87 = var56;
                                                    if ((class6.field83[1][var85][var86] & 0x2) == 2) {
                                                        var87 = var56 - 1;
                                                    }
                                                    class109 var88 = null;
                                                    if (var87 >= 0) {
                                                        var88 = var72[var87];
                                                    }
                                                    class6.method1061(var56, var85, var86, var74, var61 + var83 & 0x3, var82, var71, var88);
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
        method1317(true);
        method49();
        method913();
        class6.method802(Statics.field718, field362);
        method1317(true);
        int var89 = class6.field88;
        if (var89 > Statics.field1003) {
            var89 = Statics.field1003;
        }
        if (var89 < Statics.field1003 - 1) {
            int var90 = Statics.field1003 - 1;
        }
        if (field303) {
            Statics.field718.method1880(class6.field88);
        } else {
            Statics.field718.method1880(0);
        }
        for (int var91 = 0; var91 < 104; var91++) {
            for (int var92 = 0; var92 < 104; var92++) {
                method2789(var91, var92);
            }
        }
        method913();
        for (class17 var93 = (class17) field427.method3665(); var93 != null; var93 = (class17) field427.method3641()) {
            if (var93.field248 == -1) {
                var93.field240 = 0;
                method2333(var93);
            } else {
                var93.method3737();
            }
        }
        class41.field927.method3582();
        if (Statics.field761 != null) {
            field339.method2722(119);
            field339.method2635(1057001181);
        }
        if (!field357) {
            int var94 = (Statics.field711 - 6) / 8;
            int var95 = (Statics.field711 + 6) / 8;
            int var96 = (Statics.field695 - 6) / 8;
            int var97 = (Statics.field695 + 6) / 8;
            for (int var98 = var94 - 1; var98 <= var95 + 1; var98++) {
                for (int var99 = var96 - 1; var99 <= var97 + 1; var99++) {
                    if (var98 < var94 || var98 > var95 || var99 < var96 || var99 > var97) {
                        Statics.field157.method3169("m" + var98 + "_" + var99);
                        Statics.field157.method3169("l" + var98 + "_" + var99);
                    }
                }
            }
        }
        method50(30);
        method913();
        Statics.field1054 = (byte[][][]) null;
        Statics.field85 = (byte[][][]) null;
        Statics.field86 = (byte[][][]) null;
        Statics.field1464 = (byte[][][]) null;
        Statics.field78 = (int[][][]) null;
        Statics.field986 = (byte[][][]) null;
        Statics.field3127 = (int[][]) null;
        Statics.field87 = null;
        Statics.field2078 = null;
        Statics.field2171 = null;
        Statics.field96 = null;
        Statics.field2036 = null;
        field339.method2722(254);
        Statics.field1092.method2803();
        for (int var100 = 0; var100 < 32; var100++) {
            field2197[var100] = 0L;
        }
        for (int var101 = 0; var101 < 32; var101++) {
            field2195[var101] = 0L;
        }
        Statics.field1098 = 0;
    }

    @ObfuscatedName("g.bc(II)V")
    public static final void method214(int arg0) {
        int[] var1 = Statics.field1611.field1412;
        int var2 = var1.length;
        for (int var3 = 0; var3 < var2; var3++) {
            var1[var3] = 0;
        }
        for (int var4 = 1; var4 < 103; var4++) {
            int var5 = (103 - var4) * 2048 + 24628;
            for (int var6 = 1; var6 < 103; var6++) {
                if ((class6.field83[arg0][var6][var4] & 0x18) == 0) {
                    Statics.field718.method1970(var1, var5, 512, arg0, var6, var4);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var6][var4] & 0x8) != 0) {
                    Statics.field718.method1970(var1, var5, 512, arg0 + 1, var6, var4);
                }
                var5 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        Statics.field1611.method1737();
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var10 = 1; var10 < 103; var10++) {
                if ((class6.field83[arg0][var10][var9] & 0x18) == 0) {
                    method3048(arg0, var10, var9, var7, var8);
                }
                if (arg0 < 3 && (class6.field83[arg0 + 1][var10][var9] & 0x8) != 0) {
                    method3048(arg0 + 1, var10, var9, var7, var8);
                }
            }
        }
        field525 = 0;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                int var13 = Statics.field718.method1908(Statics.field1003, var11, var12);
                if (var13 != 0) {
                    int var14 = var13 >> 14 & 0x7FFF;
                    int var15 = class41.method2809(var14).field952;
                    if (var15 >= 0) {
                        int var16 = var11;
                        int var17 = var12;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var18 = field362[Statics.field1003].field1897;
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
                        field528[field525] = Statics.field2015[var15];
                        field308[field525] = var16;
                        field566[field525] = var17;
                        field525++;
                    }
                }
            }
        }
        Statics.field696.method1670();
    }

    @ObfuscatedName("ev.bu(IIIIII)V")
    public static final void method3048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = Statics.field718.method1905(arg0, arg1, arg2);
        if (var5 != 0) {
            int var6 = Statics.field718.method1909(arg0, arg1, arg2, var5);
            int var7 = var6 >> 6 & 0x3;
            int var8 = var6 & 0x1F;
            int var9 = arg3;
            if (var5 > 0) {
                var9 = arg4;
            }
            int[] var10 = Statics.field1611.field1412;
            int var11 = (103 - arg2) * 2048 + arg1 * 4 + 24624;
            int var12 = var5 >> 14 & 0x7FFF;
            class41 var13 = class41.method2809(var12);
            if (var13.field953 == -1) {
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
                class81 var14 = Statics.field2656[var13.field953];
                if (var14 != null) {
                    int var15 = (var13.field939 * 4 - var14.field1420) / 2;
                    int var16 = (var13.field940 * 4 - var14.field1421) / 2;
                    var14.method1850(arg1 * 4 + 48 + var15, (104 - arg2 - var13.field940) * 4 + 48 + var16);
                }
            }
        }
        int var17 = Statics.field718.method1907(arg0, arg1, arg2);
        if (var17 != 0) {
            int var18 = Statics.field718.method1909(arg0, arg1, arg2, var17);
            int var19 = var18 >> 6 & 0x3;
            int var20 = var18 & 0x1F;
            int var21 = var17 >> 14 & 0x7FFF;
            class41 var22 = class41.method2809(var21);
            if (var22.field953 != -1) {
                class81 var23 = Statics.field2656[var22.field953];
                if (var23 != null) {
                    int var24 = (var22.field939 * 4 - var23.field1420) / 2;
                    int var25 = (var22.field940 * 4 - var23.field1421) / 2;
                    var23.method1850(arg1 * 4 + 48 + var24, (104 - arg2 - var22.field940) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int var26 = 15658734;
                if (var17 > 0) {
                    var26 = 15597568;
                }
                int[] var27 = Statics.field1611.field1412;
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
        int var29 = Statics.field718.method1908(arg0, arg1, arg2);
        if (var29 == 0) {
            return;
        }
        int var30 = var29 >> 14 & 0x7FFF;
        class41 var31 = class41.method2809(var30);
        if (var31.field953 == -1) {
            return;
        }
        class81 var32 = Statics.field2656[var31.field953];
        if (var32 != null) {
            int var33 = (var31.field939 * 4 - var32.field1420) / 2;
            int var34 = (var31.field940 * 4 - var32.field1421) / 2;
            var32.method1850(arg1 * 4 + 48 + var33, (104 - arg2 - var31.field940) * 4 + 48 + var34);
        }
    }

    @ObfuscatedName("dz.ba(I)V")
    public static final void method2750() {
        if (field395 == 252) {
            int var0 = field442.method2462();
            int var1 = (var0 >> 4 & 0x7) + Statics.field1539;
            int var2 = (var0 & 0x7) + Statics.field786;
            int var3 = field442.method2464();
            int var4 = field442.method2462();
            int var5 = field442.method2464();
            if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                int var6 = var1 * 128 + 64;
                int var7 = var2 * 128 + 64;
                class30 var8 = new class30(var3, Statics.field1003, var6, var7, method799(var6, var7, Statics.field1003) - var4, var5, field307);
                field429.method3639(var8);
            }
        } else if (field395 == 136) {
            int var9 = field442.method2462();
            int var10 = (var9 >> 4 & 0x7) + Statics.field1539;
            int var11 = (var9 & 0x7) + Statics.field786;
            int var12 = field442.method2488();
            int var13 = var12 >> 2;
            int var14 = var12 & 0x3;
            int var15 = field359[var13];
            if (var10 >= 0 && var11 >= 0 && var10 < 104 && var11 < 104) {
                method2(Statics.field1003, var10, var11, var15, -1, var13, var14, 0, -1);
            }
        } else if (field395 == 74) {
            int var16 = field442.method2489();
            int var17 = (var16 >> 4 & 0x7) + Statics.field1539;
            int var18 = (var16 & 0x7) + Statics.field786;
            int var19 = field442.method2446();
            if (var17 >= 0 && var18 >= 0 && var17 < 104 && var18 < 104) {
                class200 var20 = field426[Statics.field1003][var17][var18];
                if (var20 != null) {
                    for (class29 var21 = (class29) var20.method3665(); var21 != null; var21 = (class29) var20.method3641()) {
                        if ((var19 & 0x7FFF) == var21.field692) {
                            var21.method3737();
                            break;
                        }
                    }
                    if (var20.method3665() == null) {
                        field426[Statics.field1003][var17][var18] = null;
                    }
                    method2789(var17, var18);
                }
            }
        } else if (field395 == 73) {
            int var22 = field442.method2462();
            int var23 = (var22 >> 4 & 0x7) + Statics.field1539;
            int var24 = (var22 & 0x7) + Statics.field786;
            int var25 = field442.method2464();
            int var26 = field442.method2464();
            int var27 = field442.method2464();
            if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                class200 var28 = field426[Statics.field1003][var23][var24];
                if (var28 != null) {
                    for (class29 var29 = (class29) var28.method3665(); var29 != null; var29 = (class29) var28.method3641()) {
                        if ((var25 & 0x7FFF) == var29.field692 && var29.field690 == var26) {
                            var29.field690 = var27;
                            break;
                        }
                    }
                    method2789(var23, var24);
                }
            }
        } else {
            if (field395 == 65) {
                byte var30 = field442.method2492();
                byte var31 = field442.method2548();
                byte var32 = field442.method2640();
                int var33 = field442.method2446();
                int var34 = field442.method2490();
                int var35 = (var34 >> 4 & 0x7) + Statics.field1539;
                int var36 = (var34 & 0x7) + Statics.field786;
                int var37 = field442.method2480();
                byte var38 = field442.method2548();
                int var39 = field442.method2489();
                int var40 = var39 >> 2;
                int var41 = var39 & 0x3;
                int var42 = field359[var40];
                int var43 = field442.method2446();
                int var44 = field442.method2497();
                class3 var45;
                if (field458 == var33) {
                    var45 = Statics.field94;
                } else {
                    var45 = field551[var33];
                }
                if (var45 != null) {
                    class41 var46 = class41.method2809(var37);
                    int var47;
                    int var48;
                    if (var41 == 1 || var41 == 3) {
                        var47 = var46.field940;
                        var48 = var46.field939;
                    } else {
                        var47 = var46.field939;
                        var48 = var46.field940;
                    }
                    int var49 = (var47 >> 1) + var35;
                    int var50 = (var47 + 1 >> 1) + var35;
                    int var51 = (var48 >> 1) + var36;
                    int var52 = (var48 + 1 >> 1) + var36;
                    int[][] var53 = class6.field95[Statics.field1003];
                    int var54 = var53[var49][var51] + var53[var50][var51] + var53[var49][var52] + var53[var50][var52] >> 2;
                    int var55 = (var35 << 7) + (var47 << 6);
                    int var56 = (var36 << 7) + (var48 << 6);
                    class106 var57 = var46.method874(var40, var41, var53, var55, var54, var56);
                    if (var57 != null) {
                        method2(Statics.field1003, var35, var36, var42, -1, 0, 0, var43 + 1, var44 + 1);
                        var45.field36 = field307 + var43;
                        var45.field43 = field307 + var44;
                        var45.field47 = var57;
                        var45.field63 = var35 * 128 + var47 * 64;
                        var45.field46 = var36 * 128 + var48 * 64;
                        var45.field45 = var54;
                        if (var31 > var32) {
                            byte var58 = var31;
                            var31 = var32;
                            var32 = var58;
                        }
                        if (var38 > var30) {
                            byte var59 = var38;
                            var38 = var30;
                            var30 = var59;
                        }
                        var45.field48 = var31 + var35;
                        var45.field53 = var32 + var35;
                        var45.field49 = var36 + var38;
                        var45.field54 = var30 + var36;
                    }
                }
            }
            if (field395 == 202) {
                int var60 = field442.method2462();
                int var61 = (var60 >> 4 & 0x7) + Statics.field1539;
                int var62 = (var60 & 0x7) + Statics.field786;
                int var63 = field442.method2464();
                int var64 = field442.method2462();
                int var65 = var64 >> 4 & 0xF;
                int var66 = var64 & 0x7;
                int var67 = field442.method2462();
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    int var68 = var65 + 1;
                    if (Statics.field94.field872[0] >= var61 - var68 && Statics.field94.field872[0] <= var61 + var68 && Statics.field94.field836[0] >= var62 - var68 && Statics.field94.field836[0] <= var62 + var68 && field515 != 0 && var66 > 0 && field537 < 50) {
                        field538[field537] = var63;
                        field335[field537] = var66;
                        field540[field537] = var67;
                        field542[field537] = null;
                        field541[field537] = (var61 << 16) + (var62 << 8) + var65;
                        field537++;
                    }
                }
            }
            if (field395 == 214) {
                int var69 = field442.method2462();
                int var70 = (var69 >> 4 & 0x7) + Statics.field1539;
                int var71 = (var69 & 0x7) + Statics.field786;
                int var72 = var70 + field442.method2548();
                int var73 = var71 + field442.method2548();
                int var74 = field442.method2513();
                int var75 = field442.method2464();
                int var76 = field442.method2462() * 4;
                int var77 = field442.method2462() * 4;
                int var78 = field442.method2464();
                int var79 = field442.method2464();
                int var80 = field442.method2462();
                int var81 = field442.method2462();
                if (var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var72 >= 0 && var73 >= 0 && var72 < 104 && var73 < 104 && var75 != 65535) {
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    int var84 = var72 * 128 + 64;
                    int var85 = var73 * 128 + 64;
                    class7 var86 = new class7(var75, Statics.field1003, var82, var83, method799(var82, var83, Statics.field1003) - var76, field307 + var78, field307 + var79, var80, var81, var74, var77);
                    var86.method132(var84, var85, method799(var84, var85, Statics.field1003) - var77, field307 + var78);
                    field450.method3639(var86);
                }
            } else if (field395 == 81) {
                int var87 = field442.method2489();
                int var88 = (var87 >> 4 & 0x7) + Statics.field1539;
                int var89 = (var87 & 0x7) + Statics.field786;
                int var90 = field442.method2497();
                int var91 = field442.method2497();
                if (var88 >= 0 && var89 >= 0 && var88 < 104 && var89 < 104) {
                    class29 var92 = new class29();
                    var92.field692 = var91;
                    var92.field690 = var90;
                    if (field426[Statics.field1003][var88][var89] == null) {
                        field426[Statics.field1003][var88][var89] = new class200();
                    }
                    field426[Statics.field1003][var88][var89].method3639(var92);
                    method2789(var88, var89);
                }
            } else if (field395 == 228) {
                int var93 = field442.method2488();
                int var94 = (var93 >> 4 & 0x7) + Statics.field1539;
                int var95 = (var93 & 0x7) + Statics.field786;
                int var96 = field442.method2462();
                int var97 = var96 >> 2;
                int var98 = var96 & 0x3;
                int var99 = field359[var97];
                int var100 = field442.method2497();
                if (var94 >= 0 && var95 >= 0 && var94 < 103 && var95 < 103) {
                    if (var99 == 0) {
                        class88 var101 = Statics.field718.method1901(Statics.field1003, var94, var95);
                        if (var101 != null) {
                            int var102 = var101.field1535 >> 14 & 0x7FFF;
                            if (var97 == 2) {
                                var101.field1531 = new class13(var102, 2, var98 + 4, Statics.field1003, var94, var95, var100, false, var101.field1531);
                                var101.field1529 = new class13(var102, 2, var98 + 1 & 0x3, Statics.field1003, var94, var95, var100, false, var101.field1529);
                            } else {
                                var101.field1531 = new class13(var102, var97, var98, Statics.field1003, var94, var95, var100, false, var101.field1531);
                            }
                        }
                    }
                    if (var99 == 1) {
                        class95 var103 = Statics.field718.method1935(Statics.field1003, var94, var95);
                        if (var103 != null) {
                            int var104 = var103.field1616 >> 14 & 0x7FFF;
                            if (var97 == 4 || var97 == 5) {
                                var103.field1614 = new class13(var104, 4, var98, Statics.field1003, var94, var95, var100, false, var103.field1614);
                            } else if (var97 == 6) {
                                var103.field1614 = new class13(var104, 4, var98 + 4, Statics.field1003, var94, var95, var100, false, var103.field1614);
                            } else if (var97 == 7) {
                                var103.field1614 = new class13(var104, 4, (var98 + 2 & 0x3) + 4, Statics.field1003, var94, var95, var100, false, var103.field1614);
                            } else if (var97 == 8) {
                                var103.field1614 = new class13(var104, 4, var98 + 4, Statics.field1003, var94, var95, var100, false, var103.field1614);
                                var103.field1615 = new class13(var104, 4, (var98 + 2 & 0x3) + 4, Statics.field1003, var94, var95, var100, false, var103.field1615);
                            }
                        }
                    }
                    if (var99 == 2) {
                        class99 var105 = Statics.field718.method1903(Statics.field1003, var94, var95);
                        if (var97 == 11) {
                            var97 = 10;
                        }
                        if (var105 != null) {
                            var105.field1674 = new class13(var105.field1669 >> 14 & 0x7FFF, var97, var98, Statics.field1003, var94, var95, var100, false, var105.field1674);
                        }
                    }
                    if (var99 == 3) {
                        class94 var106 = Statics.field718.method1904(Statics.field1003, var94, var95);
                        if (var106 != null) {
                            var106.field1599 = new class13(var106.field1600 >> 14 & 0x7FFF, 22, var98, Statics.field1003, var94, var95, var100, false, var106.field1599);
                        }
                    }
                }
            } else if (field395 == 185) {
                int var107 = field442.method2446();
                int var108 = field442.method2489();
                int var109 = var108 >> 2;
                int var110 = var108 & 0x3;
                int var111 = field359[var109];
                int var112 = field442.method2462();
                int var113 = (var112 >> 4 & 0x7) + Statics.field1539;
                int var114 = (var112 & 0x7) + Statics.field786;
                if (var113 >= 0 && var114 >= 0 && var113 < 104 && var114 < 104) {
                    method2(Statics.field1003, var113, var114, var111, var107, var109, var110, 0, -1);
                }
            }
        }
    }

    @ObfuscatedName("a.bd(IIIIIIIIII)V")
    public static final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class17 var9 = null;
        for (class17 var10 = (class17) field427.method3665(); var10 != null; var10 = (class17) field427.method3641()) {
            if (var10.field243 == arg0 && var10.field239 == arg1 && var10.field244 == arg2 && var10.field238 == arg3) {
                var9 = var10;
                break;
            }
        }
        if (var9 == null) {
            var9 = new class17();
            var9.field243 = arg0;
            var9.field238 = arg3;
            var9.field239 = arg1;
            var9.field244 = arg2;
            method2333(var9);
            field427.method3639(var9);
        }
        var9.field242 = arg4;
        var9.field251 = arg5;
        var9.field245 = arg6;
        var9.field240 = arg7;
        var9.field248 = arg8;
    }

    @ObfuscatedName("dg.bp(Lu;I)V")
    public static final void method2333(class17 arg0) {
        int var1 = 0;
        int var2 = -1;
        int var3 = 0;
        int var4 = 0;
        if (arg0.field238 == 0) {
            var1 = Statics.field718.method1905(arg0.field243, arg0.field239, arg0.field244);
        }
        if (arg0.field238 == 1) {
            var1 = Statics.field718.method1906(arg0.field243, arg0.field239, arg0.field244);
        }
        if (arg0.field238 == 2) {
            var1 = Statics.field718.method1907(arg0.field243, arg0.field239, arg0.field244);
        }
        if (arg0.field238 == 3) {
            var1 = Statics.field718.method1908(arg0.field243, arg0.field239, arg0.field244);
        }
        if (var1 != 0) {
            int var5 = Statics.field718.method1909(arg0.field243, arg0.field239, arg0.field244, var1);
            var2 = var1 >> 14 & 0x7FFF;
            var3 = var5 & 0x1F;
            var4 = var5 >> 6 & 0x3;
        }
        arg0.field241 = var2;
        arg0.field250 = var3;
        arg0.field246 = var4;
    }

    @ObfuscatedName("ab.bz(IIIIIIII)V")
    public static final void method865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2 < 1 || arg3 < 1 || arg2 > 102 || arg3 > 102) {
            return;
        }
        if (field303 && Statics.field1003 != arg0) {
            return;
        }
        int var7 = 0;
        boolean var8 = true;
        boolean var9 = false;
        boolean var10 = false;
        if (arg1 == 0) {
            var7 = Statics.field718.method1905(arg0, arg2, arg3);
        }
        if (arg1 == 1) {
            var7 = Statics.field718.method1906(arg0, arg2, arg3);
        }
        if (arg1 == 2) {
            var7 = Statics.field718.method1907(arg0, arg2, arg3);
        }
        if (arg1 == 3) {
            var7 = Statics.field718.method1908(arg0, arg2, arg3);
        }
        if (var7 != 0) {
            int var11 = Statics.field718.method1909(arg0, arg2, arg3, var7);
            int var12 = var7 >> 14 & 0x7FFF;
            int var13 = var11 & 0x1F;
            int var14 = var11 >> 6 & 0x3;
            if (arg1 == 0) {
                Statics.field718.method1896(arg0, arg2, arg3);
                class41 var15 = class41.method2809(var12);
                if (var15.field941 != 0) {
                    field362[arg0].method2339(arg2, arg3, var13, var14, var15.field942);
                }
            }
            if (arg1 == 1) {
                Statics.field718.method1931(arg0, arg2, arg3);
            }
            if (arg1 == 2) {
                Statics.field718.method1898(arg0, arg2, arg3);
                class41 var16 = class41.method2809(var12);
                if (var16.field939 + arg2 > 103 || var16.field939 + arg3 > 103 || var16.field940 + arg2 > 103 || var16.field940 + arg3 > 103) {
                    return;
                }
                if (var16.field941 != 0) {
                    field362[arg0].method2347(arg2, arg3, var16.field939, var16.field940, var14, var16.field942);
                }
            }
            if (arg1 == 3) {
                Statics.field718.method1899(arg0, arg2, arg3);
                class41 var17 = class41.method2809(var12);
                if (var17.field941 == 1) {
                    field362[arg0].method2349(arg2, arg3);
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
        class87 var19 = Statics.field718;
        class109 var20 = field362[arg0];
        class41 var21 = class41.method2809(arg4);
        int var22;
        int var23;
        if (arg5 == 1 || arg5 == 3) {
            var22 = var21.field940;
            var23 = var21.field939;
        } else {
            var22 = var21.field939;
            var23 = var21.field940;
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
        int[][] var28 = class6.field95[var18];
        int var29 = var28[var24][var26] + var28[var25][var26] + var28[var24][var27] + var28[var25][var27] >> 2;
        int var30 = (arg2 << 7) + (var22 << 6);
        int var31 = (arg3 << 7) + (var23 << 6);
        int var32 = (arg4 << 14) + (arg3 << 7) + arg2 + 1073741824;
        if (var21.field943 == 0) {
            var32 -= Integer.MIN_VALUE;
        }
        int var33 = (arg5 << 6) + arg6;
        if (var21.field964 == 1) {
            var33 += 256;
        }
        if (arg6 == 22) {
            class86 var34;
            if (var21.field960 == -1 && var21.field926 == null) {
                var34 = var21.method874(22, arg5, var28, var30, var29, var31);
            } else {
                var34 = new class13(arg4, 22, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1885(arg0, arg2, arg3, var29, var34, var32, var33);
            if (var21.field941 == 1) {
                var20.method2344(arg2, arg3);
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class86 var57;
            if (var21.field960 == -1 && var21.field926 == null) {
                var57 = var21.method874(10, arg5, var28, var30, var29, var31);
            } else {
                var57 = new class13(arg4, 10, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            if (var57 != null) {
                var19.method1926(arg0, arg2, arg3, var29, var22, var23, var57, arg6 == 11 ? 256 : 0, var32, var33);
            }
            if (var21.field941 != 0) {
                var20.method2342(arg2, arg3, var22, var23, var21.field942);
            }
        } else if (arg6 >= 12) {
            class86 var35;
            if (var21.field960 == -1 && var21.field926 == null) {
                var35 = var21.method874(arg6, arg5, var28, var30, var29, var31);
            } else {
                var35 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1926(arg0, arg2, arg3, var29, 1, 1, var35, 0, var32, var33);
            if (var21.field941 != 0) {
                var20.method2342(arg2, arg3, var22, var23, var21.field942);
            }
        } else if (arg6 == 0) {
            class86 var36;
            if (var21.field960 == -1 && var21.field926 == null) {
                var36 = var21.method874(0, arg5, var28, var30, var29, var31);
            } else {
                var36 = new class13(arg4, 0, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var36, (class86) null, class6.field89[arg5], 0, var32, var33);
            if (var21.field941 != 0) {
                var20.method2341(arg2, arg3, arg6, arg5, var21.field942);
            }
        } else if (arg6 == 1) {
            class86 var37;
            if (var21.field960 == -1 && var21.field926 == null) {
                var37 = var21.method874(1, arg5, var28, var30, var29, var31);
            } else {
                var37 = new class13(arg4, 1, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var37, (class86) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field941 != 0) {
                var20.method2341(arg2, arg3, arg6, arg5, var21.field942);
            }
        } else if (arg6 == 2) {
            int var38 = arg5 + 1 & 0x3;
            class86 var39;
            class86 var40;
            if (var21.field960 == -1 && var21.field926 == null) {
                var39 = var21.method874(2, arg5 + 4, var28, var30, var29, var31);
                var40 = var21.method874(2, var38, var28, var30, var29, var31);
            } else {
                var39 = new class13(arg4, 2, arg5 + 4, var18, arg2, arg3, var21.field960, true, (class86) null);
                var40 = new class13(arg4, 2, var38, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var39, var40, class6.field89[arg5], class6.field89[var38], var32, var33);
            if (var21.field941 != 0) {
                var20.method2341(arg2, arg3, arg6, arg5, var21.field942);
            }
        } else if (arg6 == 3) {
            class86 var41;
            if (var21.field960 == -1 && var21.field926 == null) {
                var41 = var21.method874(3, arg5, var28, var30, var29, var31);
            } else {
                var41 = new class13(arg4, 3, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1887(arg0, arg2, arg3, var29, var41, (class86) null, class6.field90[arg5], 0, var32, var33);
            if (var21.field941 != 0) {
                var20.method2341(arg2, arg3, arg6, arg5, var21.field942);
            }
        } else if (arg6 == 9) {
            class86 var42;
            if (var21.field960 == -1 && var21.field926 == null) {
                var42 = var21.method874(arg6, arg5, var28, var30, var29, var31);
            } else {
                var42 = new class13(arg4, arg6, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1926(arg0, arg2, arg3, var29, 1, 1, var42, 0, var32, var33);
            if (var21.field941 != 0) {
                var20.method2342(arg2, arg3, var22, var23, var21.field942);
            }
        } else if (arg6 == 4) {
            class86 var43;
            if (var21.field960 == -1 && var21.field926 == null) {
                var43 = var21.method874(4, arg5, var28, var30, var29, var31);
            } else {
                var43 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var43, (class86) null, class6.field89[arg5], 0, 0, 0, var32, var33);
        } else if (arg6 == 5) {
            int var44 = 16;
            int var45 = var19.method1905(arg0, arg2, arg3);
            if (var45 != 0) {
                var44 = class41.method2809(var45 >> 14 & 0x7FFF).field948;
            }
            class86 var46;
            if (var21.field960 == -1 && var21.field926 == null) {
                var46 = var21.method874(4, arg5, var28, var30, var29, var31);
            } else {
                var46 = new class13(arg4, 4, arg5, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var46, (class86) null, class6.field89[arg5], 0, class6.field91[arg5] * var44, class6.field92[arg5] * var44, var32, var33);
        } else if (arg6 == 6) {
            int var47 = 8;
            int var48 = var19.method1905(arg0, arg2, arg3);
            if (var48 != 0) {
                var47 = class41.method2809(var48 >> 14 & 0x7FFF).field948 / 2;
            }
            class86 var49;
            if (var21.field960 == -1 && var21.field926 == null) {
                var49 = var21.method874(4, arg5 + 4, var28, var30, var29, var31);
            } else {
                var49 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var49, (class86) null, 256, arg5, class6.field93[arg5] * var47, class6.field84[arg5] * var47, var32, var33);
        } else if (arg6 == 7) {
            int var50 = arg5 + 2 & 0x3;
            class86 var51;
            if (var21.field960 == -1 && var21.field926 == null) {
                var51 = var21.method874(4, var50 + 4, var28, var30, var29, var31);
            } else {
                var51 = new class13(arg4, 4, var50 + 4, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var51, (class86) null, 256, var50, 0, 0, var32, var33);
        } else if (arg6 == 8) {
            int var52 = 8;
            int var53 = var19.method1905(arg0, arg2, arg3);
            if (var53 != 0) {
                var52 = class41.method2809(var53 >> 14 & 0x7FFF).field948 / 2;
            }
            int var54 = arg5 + 2 & 0x3;
            class86 var55;
            class86 var56;
            if (var21.field960 == -1 && var21.field926 == null) {
                var55 = var21.method874(4, arg5 + 4, var28, var30, var29, var31);
                var56 = var21.method874(4, var54 + 4, var28, var30, var29, var31);
            } else {
                var55 = new class13(arg4, 4, arg5 + 4, var18, arg2, arg3, var21.field960, true, (class86) null);
                var56 = new class13(arg4, 4, var54 + 4, var18, arg2, arg3, var21.field960, true, (class86) null);
            }
            var19.method1888(arg0, arg2, arg3, var29, var55, var56, 256, arg5, class6.field93[arg5] * var52, class6.field84[arg5] * var52, var32, var33);
        }
    }

    @ObfuscatedName("eh.bn(III)V")
    public static final void method2789(int arg0, int arg1) {
        class200 var2 = field426[Statics.field1003][arg0][arg1];
        if (var2 == null) {
            Statics.field718.method1968(Statics.field1003, arg0, arg1);
            return;
        }
        long var3 = -99999999L;
        class29 var5 = null;
        for (class29 var6 = (class29) var2.method3665(); var6 != null; var6 = (class29) var2.method3641()) {
            class52 var7 = class52.method176(var6.field692);
            long var8 = (long) var7.field1151;
            if (var7.field1137 == 1) {
                var8 = (long) (var6.field690 + 1) * var8;
            }
            if (var8 > var3) {
                var3 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            Statics.field718.method1968(Statics.field1003, arg0, arg1);
            return;
        }
        var2.method3640(var5);
        class29 var10 = null;
        class29 var11 = null;
        for (class29 var12 = (class29) var2.method3665(); var12 != null; var12 = (class29) var2.method3641()) {
            if (var5.field692 != var12.field692) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field692 != var12.field692 && var11 == null) {
                    var11 = var12;
                }
            }
        }
        int var13 = (arg1 << 7) + arg0 + 1610612736;
        Statics.field718.method1886(Statics.field1003, arg0, arg1, method799(arg0 * 128 + 64, arg1 * 128 + 64, Statics.field1003), var5, var13, var10, var11);
    }

    @ObfuscatedName("fn.bt(ZB)V")
    public static final void method3123(boolean arg0) {
        field419 = 0;
        field337 = 0;
        field442.method2715();
        int var1 = field442.method2712(8);
        if (var1 < field344) {
            for (int var2 = var1; var2 < field344; var2++) {
                field381[++field419 - 1] = field336[var2];
            }
        }
        if (var1 > field344) {
            throw new RuntimeException("");
        }
        field344 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = field336[var3];
            class35 var5 = field547[var4];
            int var6 = field442.method2712(1);
            if (var6 == 0) {
                field336[++field344 - 1] = var4;
                var5.field824 = field307;
            } else {
                int var7 = field442.method2712(2);
                if (var7 == 0) {
                    field336[++field344 - 1] = var4;
                    var5.field824 = field307;
                    field338[++field337 - 1] = var4;
                } else if (var7 == 1) {
                    field336[++field344 - 1] = var4;
                    var5.field824 = field307;
                    int var8 = field442.method2712(3);
                    var5.method790(var8, (byte) 1);
                    int var9 = field442.method2712(1);
                    if (var9 == 1) {
                        field338[++field337 - 1] = var4;
                    }
                } else if (var7 == 2) {
                    field336[++field344 - 1] = var4;
                    var5.field824 = field307;
                    int var10 = field442.method2712(3);
                    var5.method790(var10, (byte) 2);
                    int var11 = field442.method2712(3);
                    var5.method790(var11, (byte) 2);
                    int var12 = field442.method2712(1);
                    if (var12 == 1) {
                        field338[++field337 - 1] = var4;
                    }
                } else if (var7 == 3) {
                    field381[++field419 - 1] = var4;
                }
            }
        }
        method137(arg0);
        for (int var13 = 0; var13 < field337; var13++) {
            int var14 = field338[var13];
            class35 var15 = field547[var14];
            int var16 = field442.method2462();
            if ((var16 & 0x80) != 0) {
                int var17 = field442.method2464();
                int var18 = field442.method2497();
                int var19 = var15.field845 - (var17 - Statics.field2205 - Statics.field2205) * 64;
                int var20 = var15.field820 - (var18 - Statics.field68 - Statics.field68) * 64;
                if (var19 != 0 || var20 != 0) {
                    var15.field828 = (int) (Math.atan2((double) var19, (double) var20) * 325.949D) & 0x7FF;
                }
            }
            if ((var16 & 0x1) != 0) {
                var15.field785 = class40.method726(field442.method2464());
                var15.field842 = var15.field785.field888;
                var15.field870 = var15.field785.field916;
                var15.field826 = var15.field785.field905;
                var15.field840 = var15.field785.field912;
                var15.field837 = var15.field785.field901;
                var15.field829 = var15.field785.field902;
                var15.field823 = var15.field785.field896;
                var15.field879 = var15.field785.field914;
                var15.field825 = var15.field785.field898;
            }
            if ((var16 & 0x10) != 0) {
                var15.field843 = field442.method2480();
                if (var15.field843 == 65535) {
                    var15.field843 = -1;
                }
            }
            if ((var16 & 0x2) != 0) {
                int var21 = field442.method2462();
                int var22 = field442.method2489();
                var15.method817(var21, var22, field307);
                var15.field871 = field307 + 300;
                var15.field841 = field442.method2446();
                var15.field832 = field442.method2446();
            }
            if ((var16 & 0x8) != 0) {
                int var23 = field442.method2464();
                if (var23 == 65535) {
                    var23 = -1;
                }
                int var24 = field442.method2488();
                if (var15.field849 == var23 && var23 != -1) {
                    int var25 = class43.method2137(var23).field1006;
                    if (var25 == 1) {
                        var15.field850 = 0;
                        var15.field873 = 0;
                        var15.field852 = var24;
                        var15.field853 = 0;
                    }
                    if (var25 == 2) {
                        var15.field853 = 0;
                    }
                } else if (var23 == -1 || var15.field849 == -1 || class43.method2137(var23).field1000 >= class43.method2137(var15.field849).field1000) {
                    var15.field849 = var23;
                    var15.field850 = 0;
                    var15.field873 = 0;
                    var15.field852 = var24;
                    var15.field853 = 0;
                    var15.field876 = var15.field822;
                }
            }
            if ((var16 & 0x40) != 0) {
                var15.field831 = field442.method2470();
                var15.field857 = 100;
            }
            if ((var16 & 0x4) != 0) {
                var15.field866 = field442.method2480();
                int var26 = field442.method2595();
                var15.field858 = var26 >> 16;
                var15.field851 = (var26 & 0xFFFF) + field307;
                var15.field855 = 0;
                var15.field856 = 0;
                if (var15.field851 > field307) {
                    var15.field855 = -1;
                }
                if (var15.field866 == 65535) {
                    var15.field866 = -1;
                }
            }
            if ((var16 & 0x20) != 0) {
                int var27 = field442.method2488();
                int var28 = field442.method2488();
                var15.method817(var27, var28, field307);
                var15.field871 = field307 + 300;
                var15.field841 = field442.method2446();
                var15.field832 = field442.method2497();
            }
        }
        for (int var29 = 0; var29 < field419; var29++) {
            int var30 = field381[var29];
            if (field307 != field547[var30].field824) {
                field547[var30].field785 = null;
                field547[var30] = null;
            }
        }
        if (field342 != field442.field1993) {
            throw new RuntimeException(field442.field1993 + class2.field19 + field342);
        }
        for (int var31 = 0; var31 < field344; var31++) {
            if (field547[field336[var31]] == null) {
                throw new RuntimeException(var31 + class2.field19 + field344);
            }
        }
    }

    @ObfuscatedName("p.be(ZB)V")
    public static final void method137(boolean arg0) {
        while (true) {
            if (field442.method2741(field342) >= 27) {
                int var1 = field442.method2712(15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (field547[var1] == null) {
                        field547[var1] = new class35();
                        var2 = true;
                    }
                    class35 var3 = field547[var1];
                    field336[++field344 - 1] = var1;
                    var3.field824 = field307;
                    int var4 = field424[field442.method2712(3)];
                    if (var2) {
                        var3.field854 = var3.field864 = var4;
                    }
                    var3.field785 = class40.method726(field442.method2712(14));
                    int var5;
                    if (arg0) {
                        var5 = field442.method2712(8);
                        if (var5 > 127) {
                            var5 -= 256;
                        }
                    } else {
                        var5 = field442.method2712(5);
                        if (var5 > 15) {
                            var5 -= 32;
                        }
                    }
                    int var6 = field442.method2712(1);
                    if (var6 == 1) {
                        field338[++field337 - 1] = var1;
                    }
                    int var7 = field442.method2712(1);
                    int var8;
                    if (arg0) {
                        var8 = field442.method2712(8);
                        if (var8 > 127) {
                            var8 -= 256;
                        }
                    } else {
                        var8 = field442.method2712(5);
                        if (var8 > 15) {
                            var8 -= 32;
                        }
                    }
                    var3.field842 = var3.field785.field888;
                    var3.field870 = var3.field785.field916;
                    if (var3.field870 == 0) {
                        var3.field864 = 0;
                    }
                    var3.field826 = var3.field785.field905;
                    var3.field840 = var3.field785.field912;
                    var3.field837 = var3.field785.field901;
                    var3.field829 = var3.field785.field902;
                    var3.field823 = var3.field785.field896;
                    var3.field879 = var3.field785.field914;
                    var3.field825 = var3.field785.field898;
                    var3.method794(Statics.field94.field872[0] + var8, Statics.field94.field836[0] + var5, var7 == 1);
                    continue;
                }
            }
            field442.method2717();
            return;
        }
    }

    @ObfuscatedName("al.bq(IIIII)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field497; var4++) {
            if (field504[var4] + field312[var4] > arg0 && field312[var4] < arg0 + arg2 && field505[var4] + field498[var4] > arg1 && field498[var4] < arg1 + arg3) {
                field324[var4] = true;
            }
        }
    }

    @ObfuscatedName("eg.bj(IIIIB)V")
    public static final void method3041(int arg0, int arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < field497; var4++) {
            if (field504[var4] + field312[var4] > arg0 && field312[var4] < arg0 + arg2 && field505[var4] + field498[var4] > arg1 && field498[var4] < arg1 + arg3) {
                field521[var4] = true;
            }
        }
    }

    @ObfuscatedName("g.bw(IB)Z")
    public static final boolean method215(int arg0) {
        if (arg0 < 0) {
            return false;
        }
        int var1 = field438[arg0];
        if (var1 >= 2000) {
            var1 -= 2000;
        }
        return var1 == 1007;
    }

    @ObfuscatedName("gq.bo(II)V")
    public static final void method3556(int arg0) {
        if (arg0 < 0) {
            return;
        }
        int var1 = field436[arg0];
        int var2 = field526[arg0];
        int var3 = field438[arg0];
        int var4 = field501[arg0];
        String var5 = field440[arg0];
        String var6 = field441[arg0];
        method57(var1, var2, var3, var4, var5, var6, class141.field2161, class141.field2160);
    }

    @ObfuscatedName("cz.bv(Laf;III)V")
    public static final void method1877(class31 arg0, int arg1, int arg2) {
        method57(arg0.field713, arg0.field712, arg0.field722, arg0.field721, arg0.field715, arg0.field715, arg1, arg2);
    }

    @ObfuscatedName("y.br(IIIILjava/lang/String;Ljava/lang/String;III)V")
    public static final void method57(int arg0, int arg1, int arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        if (arg2 >= 2000) {
            arg2 -= 2000;
        }
        if (arg2 == 11) {
            class35 var8 = field547[arg3];
            if (var8 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(120);
                field339.method2448(arg3);
                field339.method2487(class138.field2116[82] ? 1 : 0);
            }
        }
        if (arg2 == 19) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(4);
            field339.method2494(Statics.field68 + arg1);
            field339.method2448(arg3);
            field339.method2452(class138.field2116[82] ? 1 : 0);
            field339.method2448(Statics.field2205 + arg0);
        }
        if (arg2 == 50) {
            class3 var9 = field551[arg3];
            if (var9 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(0);
                field339.method2487(class138.field2116[82] ? 1 : 0);
                field339.method2594(arg3);
            }
        }
        if (arg2 == 34) {
            field339.method2722(38);
            field339.method2483(arg0);
            field339.method2635(arg1);
            field339.method2448(arg3);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 47) {
            class3 var10 = field551[arg3];
            if (var10 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(174);
                field339.method2487(class138.field2116[82] ? 1 : 0);
                field339.method2448(arg3);
            }
        }
        if (arg2 == 1005) {
            class174 var11 = class174.method636(arg1);
            if (var11 == null || var11.field2878[arg0] < 100000) {
                field339.method2722(144);
                field339.method2494(arg3);
            } else {
                class12.method2783(27, "", var11.field2878[arg0] + " x " + class52.method176(arg3).field1126);
            }
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 3) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(253);
            field339.method2452(class138.field2116[82] ? 1 : 0);
            field339.method2448(arg3 >> 14 & 0x7FFF);
            field339.method2594(Statics.field2205 + arg0);
            field339.method2483(Statics.field68 + arg1);
        }
        if (arg2 == 20) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(156);
            field339.method2452(class138.field2116[82] ? 1 : 0);
            field339.method2483(Statics.field2205 + arg0);
            field339.method2483(arg3);
            field339.method2594(Statics.field68 + arg1);
        }
        if (arg2 == 35) {
            field339.method2722(2);
            field339.method2504(arg1);
            field339.method2483(arg3);
            field339.method2494(arg0);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 38) {
            method167();
            class174 var12 = class174.method636(arg1);
            field449 = 1;
            Statics.field188 = arg0;
            Statics.field932 = arg1;
            Statics.field3213 = arg3;
            method652(var12);
            field379 = class2.method2886(16748608) + class52.method176(arg3).field1126 + class2.method2886(16777215);
            if (field379 == null) {
                field379 = "null";
            }
            return;
        }
        if (arg2 == 45) {
            class3 var13 = field551[arg3];
            if (var13 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(211);
                field339.method2592(class138.field2116[82] ? 1 : 0);
                field339.method2483(arg3);
            }
        }
        if (arg2 == 44) {
            class3 var14 = field551[arg3];
            if (var14 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(72);
                field339.method2594(arg3);
                field339.method2592(class138.field2116[82] ? 1 : 0);
            }
        }
        if (arg2 == 6) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(67);
            field339.method2592(class138.field2116[82] ? 1 : 0);
            field339.method2448(arg3 >> 14 & 0x7FFF);
            field339.method2494(Statics.field68 + arg1);
            field339.method2594(Statics.field2205 + arg0);
        }
        if (arg2 == 14) {
            class3 var15 = field551[arg3];
            if (var15 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(255);
                field339.method2594(Statics.field188);
                field339.method2483(Statics.field3213);
                field339.method2483(arg3);
                field339.method2486(class138.field2116[82] ? 1 : 0);
                field339.method2635(Statics.field932);
            }
        }
        if (arg2 == 51) {
            class3 var16 = field551[arg3];
            if (var16 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(179);
                field339.method2494(arg3);
                field339.method2487(class138.field2116[82] ? 1 : 0);
            }
        }
        if (arg2 == 41) {
            field339.method2722(107);
            field339.method2502(arg1);
            field339.method2494(arg0);
            field339.method2594(arg3);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 40) {
            field339.method2722(230);
            field339.method2448(arg3);
            field339.method2502(arg1);
            field339.method2483(arg0);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 1001) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(102);
            field339.method2594(arg3 >> 14 & 0x7FFF);
            field339.method2594(Statics.field68 + arg1);
            field339.method2494(Statics.field2205 + arg0);
            field339.method2592(class138.field2116[82] ? 1 : 0);
        }
        if (arg2 == 23) {
            Statics.field718.method1916(Statics.field1003, arg0, arg1);
        }
        if (arg2 == 4) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(216);
            field339.method2452(class138.field2116[82] ? 1 : 0);
            field339.method2483(Statics.field68 + arg1);
            field339.method2483(arg3 >> 14 & 0x7FFF);
            field339.method2494(Statics.field2205 + arg0);
        }
        if (arg2 == 17) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(184);
            field339.method2448(Statics.field68 + arg1);
            field339.method2494(arg3);
            field339.method2448(Statics.field2205 + arg0);
            field339.method2594(field387);
            field339.method2592(class138.field2116[82] ? 1 : 0);
            field339.method2504(Statics.field170);
        }
        if (arg2 == 32) {
            field339.method2722(20);
            field339.method2494(arg3);
            field339.method2483(field387);
            field339.method2635(arg1);
            field339.method2594(arg0);
            field339.method2502(Statics.field170);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 1) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(60);
            field339.method2635(Statics.field932);
            field339.method2494(Statics.field68 + arg1);
            field339.method2483(Statics.field3213);
            field339.method2483(arg3 >> 14 & 0x7FFF);
            field339.method2487(class138.field2116[82] ? 1 : 0);
            field339.method2483(Statics.field188);
            field339.method2494(Statics.field2205 + arg0);
        }
        if (arg2 == 33) {
            field339.method2722(141);
            field339.method2483(arg0);
            field339.method2494(arg3);
            field339.method2502(arg1);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 49) {
            class3 var17 = field551[arg3];
            if (var17 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(31);
                field339.method2483(arg3);
                field339.method2452(class138.field2116[82] ? 1 : 0);
            }
        }
        if (arg2 == 29) {
            field339.method2722(92);
            field339.method2635(arg1);
            class174 var18 = class174.method636(arg1);
            if (var18.field2871 != null && var18.field2871[0][0] == 5) {
                int var19 = var18.field2871[0][1];
                if (class177.field2906[var19] != var18.field2771[0]) {
                    class177.field2906[var19] = var18.field2771[0];
                    method3(var19);
                }
            }
        }
        if (arg2 == 39) {
            field339.method2722(191);
            field339.method2594(arg3);
            field339.method2502(arg1);
            field339.method2483(arg0);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 25) {
            class174 var20 = class174.method3749(arg1, arg0);
            if (var20 != null) {
                method167();
                method2140(arg1, arg0, class179.method2141(method765(var20)), var20.field2879);
                field449 = 0;
                field298 = method2134(var20);
                if (field298 == null) {
                    field298 = "Null";
                }
                if (var20.field2758) {
                    field535 = var20.field2832 + class2.method2886(16777215);
                } else {
                    field535 = class2.method2886(65280) + var20.field2875 + class2.method2886(16777215);
                }
            }
            return;
        }
        if (arg2 == 31) {
            field339.method2722(23);
            field339.method2502(Statics.field932);
            field339.method2448(Statics.field188);
            field339.method2448(arg3);
            field339.method2448(Statics.field3213);
            field339.method2448(arg0);
            field339.method2502(arg1);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 10) {
            class35 var21 = field547[arg3];
            if (var21 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(96);
                field339.method2452(class138.field2116[82] ? 1 : 0);
                field339.method2494(arg3);
            }
        }
        if (arg2 == 15) {
            class3 var22 = field551[arg3];
            if (var22 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(202);
                field339.method2483(arg3);
                field339.method2504(Statics.field170);
                field339.method2448(field387);
                field339.method2487(class138.field2116[82] ? 1 : 0);
            }
        }
        if (arg2 == 5) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(180);
            field339.method2594(arg3 >> 14 & 0x7FFF);
            field339.method2452(class138.field2116[82] ? 1 : 0);
            field339.method2483(Statics.field2205 + arg0);
            field339.method2494(Statics.field68 + arg1);
        }
        if (arg2 == 24) {
            class174 var23 = class174.method636(arg1);
            boolean var24 = true;
            if (var23.field2763 > 0) {
                var24 = method3049(var23);
            }
            if (var24) {
                field339.method2722(92);
                field339.method2635(arg1);
            }
        }
        if (arg2 == 7) {
            class35 var25 = field547[arg3];
            if (var25 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(69);
                field339.method2483(Statics.field3213);
                field339.method2487(class138.field2116[82] ? 1 : 0);
                field339.method2448(arg3);
                field339.method2635(Statics.field932);
                field339.method2483(Statics.field188);
            }
        }
        if (arg2 == 28) {
            field339.method2722(92);
            field339.method2635(arg1);
            class174 var26 = class174.method636(arg1);
            if (var26.field2871 != null && var26.field2871[0][0] == 5) {
                int var27 = var26.field2871[0][1];
                class177.field2906[var27] = 1 - class177.field2906[var27];
                method3(var27);
            }
        }
        if (arg2 == 21) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(118);
            field339.method2594(arg3);
            field339.method2448(Statics.field68 + arg1);
            field339.method2494(Statics.field2205 + arg0);
            field339.method2487(class138.field2116[82] ? 1 : 0);
        }
        if (arg2 == 42) {
            field339.method2722(164);
            field339.method2594(arg0);
            field339.method2483(arg3);
            field339.method2635(arg1);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 2) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(10);
            field339.method2494(Statics.field2205 + arg0);
            field339.method2592(class138.field2116[82] ? 1 : 0);
            field339.method2483(arg3 >> 14 & 0x7FFF);
            field339.method2448(field387);
            field339.method2455(Statics.field170);
            field339.method2448(Statics.field68 + arg1);
        }
        if (arg2 == 16) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(159);
            field339.method2448(Statics.field68 + arg1);
            field339.method2494(Statics.field3213);
            field339.method2483(arg3);
            field339.method2452(class138.field2116[82] ? 1 : 0);
            field339.method2494(Statics.field188);
            field339.method2494(Statics.field2205 + arg0);
            field339.method2504(Statics.field932);
        }
        if (arg2 == 13) {
            class35 var28 = field547[arg3];
            if (var28 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(33);
                field339.method2594(arg3);
                field339.method2487(class138.field2116[82] ? 1 : 0);
            }
        }
        if (arg2 == 36) {
            field339.method2722(134);
            field339.method2594(arg3);
            field339.method2502(arg1);
            field339.method2594(arg0);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 26) {
            method2882();
        }
        if (arg2 == 57 || arg2 == 1007) {
            class174 var29 = class174.method3749(arg1, arg0);
            if (var29 != null) {
                method2404(arg3, arg1, arg0, var29.field2879, arg5);
            }
        }
        if (arg2 == 1004) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field339.method2722(144);
            field339.method2494(arg3);
        }
        if (arg2 == 46) {
            class3 var30 = field551[arg3];
            if (var30 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(95);
                field339.method2452(class138.field2116[82] ? 1 : 0);
                field339.method2483(arg3);
            }
        }
        if (arg2 == 8) {
            class35 var31 = field547[arg3];
            if (var31 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(40);
                field339.method2635(Statics.field170);
                field339.method2594(field387);
                field339.method2592(class138.field2116[82] ? 1 : 0);
                field339.method2483(arg3);
            }
        }
        if (arg2 == 18) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(163);
            field339.method2448(Statics.field68 + arg1);
            field339.method2594(Statics.field2205 + arg0);
            field339.method2487(class138.field2116[82] ? 1 : 0);
            field339.method2483(arg3);
        }
        if (arg2 == 12) {
            class35 var32 = field547[arg3];
            if (var32 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(245);
                field339.method2592(class138.field2116[82] ? 1 : 0);
                field339.method2594(arg3);
            }
        }
        if (arg2 == 9) {
            class35 var33 = field547[arg3];
            if (var33 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(241);
                field339.method2452(class138.field2116[82] ? 1 : 0);
                field339.method2594(arg3);
            }
        }
        if (arg2 == 1003) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            class35 var34 = field547[arg3];
            if (var34 != null) {
                class40 var35 = var34.field785;
                if (var35.field917 != null) {
                    var35 = var35.method840();
                }
                if (var35 != null) {
                    field339.method2722(238);
                    field339.method2594(var35.field891);
                }
            }
        }
        if (arg2 == 1002) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field339.method2722(29);
            field339.method2594(arg3 >> 14 & 0x7FFF);
        }
        if (arg2 == 58) {
            class174 var36 = class174.method3749(arg1, arg0);
            if (var36 != null) {
                field339.method2722(209);
                field339.method2594(field387);
                field339.method2483(arg0);
                field339.method2455(arg1);
                field339.method2448(var36.field2879);
                field339.method2504(Statics.field170);
                field339.method2494(field394);
            }
        }
        if (arg2 == 30 && field527 == null) {
            method3812(arg1, arg0);
            field527 = class174.method3749(arg1, arg0);
            method652(field527);
        }
        if (arg2 == 22) {
            field403 = arg6;
            field404 = arg7;
            field468 = 2;
            field405 = 0;
            field529 = arg0;
            field348 = arg1;
            field339.method2722(240);
            field339.method2486(class138.field2116[82] ? 1 : 0);
            field339.method2483(Statics.field68 + arg1);
            field339.method2494(arg3);
            field339.method2483(Statics.field2205 + arg0);
        }
        if (arg2 == 37) {
            field339.method2722(80);
            field339.method2494(arg3);
            field339.method2594(arg0);
            field339.method2504(arg1);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 43) {
            field339.method2722(170);
            field339.method2594(arg3);
            field339.method2504(arg1);
            field339.method2594(arg0);
            field407 = 0;
            Statics.field2062 = class174.method636(arg1);
            field408 = arg0;
        }
        if (arg2 == 48) {
            class3 var37 = field551[arg3];
            if (var37 != null) {
                field403 = arg6;
                field404 = arg7;
                field468 = 2;
                field405 = 0;
                field529 = arg0;
                field348 = arg1;
                field339.method2722(37);
                field339.method2494(arg3);
                field339.method2487(class138.field2116[82] ? 1 : 0);
            }
        }
        if (field449 != 0) {
            field449 = 0;
            method652(class174.method636(Statics.field932));
        }
        if (field448) {
            method167();
        }
        if (Statics.field2062 != null && field407 == 0) {
            method652(Statics.field2062);
        }
    }

    @ObfuscatedName("d.cd(ILjava/lang/String;B)V")
    public static void method16(int arg0, String arg1) {
        int var2 = class33.field772;
        int[] var3 = class33.field763;
        boolean var4 = false;
        for (int var5 = 0; var5 < var2; var5++) {
            class3 var6 = field551[var3[var5]];
            if (var6 != null && Statics.field94 != var6 && var6.field59 != null && var6.field59.equalsIgnoreCase(arg1)) {
                if (arg0 == 1) {
                    field339.method2722(72);
                    field339.method2594(var3[var5]);
                    field339.method2592(0);
                } else if (arg0 == 4) {
                    field339.method2722(174);
                    field339.method2487(0);
                    field339.method2448(var3[var5]);
                } else if (arg0 == 6) {
                    field339.method2722(31);
                    field339.method2483(var3[var5]);
                    field339.method2452(0);
                } else if (arg0 == 7) {
                    field339.method2722(0);
                    field339.method2487(0);
                    field339.method2594(var3[var5]);
                }
                var4 = true;
                break;
            }
        }
        if (!var4) {
            class12.method2783(4, "", class158.field2423 + arg1);
        }
    }

    @ObfuscatedName("ck.cu(IIIII)V")
    public static void method2140(int arg0, int arg1, int arg2, int arg3) {
        class174 var4 = class174.method3749(arg0, arg1);
        if (var4 != null && var4.field2865 != null) {
            class1 var5 = new class1();
            var5.field3 = var4;
            var5.field5 = var4.field2865;
            class37.method3232(var5, 200000);
        }
        field394 = arg3;
        field448 = true;
        Statics.field170 = arg0;
        field387 = arg1;
        Statics.field2637 = arg2;
        method652(var4);
    }

    @ObfuscatedName("e.cg(B)V")
    public static void method167() {
        if (!field448) {
            return;
        }
        class174 var0 = class174.method3749(Statics.field170, field387);
        if (var0 != null && var0.field2851 != null) {
            class1 var1 = new class1();
            var1.field3 = var0;
            var1.field5 = var0.field2851;
            class37.method3232(var1, 200000);
        }
        field448 = false;
        method652(var0);
    }

    @ObfuscatedName("hg.cv(III)V")
    public static void method3812(int arg0, int arg1) {
        field339.method2722(65);
        field339.method2504(arg0);
        field339.method2483(arg1);
    }

    @ObfuscatedName("do.ce(IIIILjava/lang/String;B)V")
    public static void method2404(int arg0, int arg1, int arg2, int arg3, String arg4) {
        class174 var5 = class174.method3749(arg1, arg2);
        if (var5 == null) {
            return;
        }
        if (var5.field2807 != null) {
            class1 var6 = new class1();
            var6.field3 = var5;
            var6.field6 = arg0;
            var6.field10 = arg4;
            var6.field5 = var5.field2807;
            class37.method3232(var6, 200000);
        }
        boolean var7 = true;
        if (var5.field2763 > 0) {
            var7 = method3049(var5);
        }
        if (!var7) {
            return;
        }
        int var8 = method765(var5);
        int var9 = arg0 - 1;
        boolean var10 = (var8 >> var9 + 1 & 0x1) != 0;
        if (!var10) {
            return;
        }
        if (arg0 == 1) {
            field339.method2722(194);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 2) {
            field339.method2722(42);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 3) {
            field339.method2722(181);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 4) {
            field339.method2722(129);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 5) {
            field339.method2722(22);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 6) {
            field339.method2722(49);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 7) {
            field339.method2722(207);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 8) {
            field339.method2722(73);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 9) {
            field339.method2722(99);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
        if (arg0 == 10) {
            field339.method2722(128);
            field339.method2635(arg1);
            field339.method2448(arg2);
            field339.method2448(arg3);
        }
    }

    @ObfuscatedName("l.cr(Ljava/lang/String;Ljava/lang/String;IIIII)V")
    public static final void method666(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (field434 || field435 >= 500) {
            return;
        }
        field440[field435] = arg0;
        field441[field435] = arg1;
        field438[field435] = arg2;
        field501[field435] = arg3;
        field436[field435] = arg4;
        field526[field435] = arg5;
        field435++;
    }

    @ObfuscatedName("k.ct(I)V")
    public static void method81() {
        for (int var0 = 0; var0 < field435; var0++) {
            if (method801(field438[var0])) {
                if (var0 < field435 - 1) {
                    for (int var1 = var0; var1 < field435 - 1; var1++) {
                        field440[var1] = field440[var1 + 1];
                        field441[var1] = field441[var1 + 1];
                        field438[var1] = field438[var1 + 1];
                        field501[var1] = field501[var1 + 1];
                        field436[var1] = field436[var1 + 1];
                        field526[var1] = field526[var1 + 1];
                    }
                }
                field435--;
            }
        }
    }

    @ObfuscatedName("az.cz(II)Z")
    public static boolean method801(int arg0) {
        return arg0 == 57 || arg0 == 58 || arg0 == 1007 || arg0 == 25 || arg0 == 30;
    }

    @ObfuscatedName("du.cp(Lab;IIII)V")
    public static final void method2770(class40 arg0, int arg1, int arg2, int arg3) {
        if (field435 >= 400) {
            return;
        }
        if (arg0.field917 != null) {
            arg0 = arg0.method840();
        }
        if (arg0 == null || !arg0.field899 || arg0.field922 && field461 != arg1) {
            return;
        }
        String var4 = arg0.field918;
        if (arg0.field906 != 0) {
            int var6 = arg0.field906;
            int var7 = Statics.field94.field39;
            int var8 = var7 - var6;
            String var9;
            if (var8 < -9) {
                var9 = class2.method2886(16711680);
            } else if (var8 < -6) {
                var9 = class2.method2886(16723968);
            } else if (var8 < -3) {
                var9 = class2.method2886(16740352);
            } else if (var8 < 0) {
                var9 = class2.method2886(16756736);
            } else if (var8 > 9) {
                var9 = class2.method2886(65280);
            } else if (var8 > 6) {
                var9 = class2.method2886(4259584);
            } else if (var8 > 3) {
                var9 = class2.method2886(8453888);
            } else if (var8 > 0) {
                var9 = class2.method2886(12648192);
            } else {
                var9 = class2.method2886(16776960);
            }
            var4 = var4 + var9 + " " + class2.field23 + class158.field2455 + arg0.field906 + class2.field18;
        }
        if (field449 == 1) {
            method666(class158.field2449, field379 + " " + class2.field25 + " " + class2.method2886(16776960) + var4, 7, arg1, arg2, arg3);
        } else if (!field448) {
            String[] var10 = arg0.field907;
            if (field464) {
                var10 = method2034(var10);
            }
            if (var10 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var10[var11] != null && !var10[var11].equalsIgnoreCase(class158.field2362)) {
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
                        method666(var10[var11], class2.method2886(16776960) + var4, var12, arg1, arg2, arg3);
                    }
                }
            }
            if (var10 != null) {
                for (int var13 = 4; var13 >= 0; var13--) {
                    if (var10[var13] != null && var10[var13].equalsIgnoreCase(class158.field2362)) {
                        short var14 = 0;
                        if (field509 != class21.field586) {
                            if (field509 == class21.field581 || field509 == class21.field588 && arg0.field906 > Statics.field94.field39) {
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
                            method666(var10[var13], class2.method2886(16776960) + var4, var15, arg1, arg2, arg3);
                        }
                    }
                }
            }
            method666(class158.field2450, class2.method2886(16776960) + var4, 1003, arg1, arg2, arg3);
        } else if ((Statics.field2637 & 0x2) == 2) {
            method666(field298, field535 + " " + class2.field25 + " " + class2.method2886(16776960) + var4, 8, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("gx.cs(Ld;IIII)V")
    public static final void method3567(class3 arg0, int arg1, int arg2, int arg3) {
        if (Statics.field94 == arg0 || field435 >= 400) {
            return;
        }
        String var9;
        if (arg0.field40 == 0) {
            String var4 = arg0.field56[0] + arg0.field59 + arg0.field56[1];
            int var5 = arg0.field39;
            int var6 = Statics.field94.field39;
            int var7 = var6 - var5;
            String var8;
            if (var7 < -9) {
                var8 = class2.method2886(16711680);
            } else if (var7 < -6) {
                var8 = class2.method2886(16723968);
            } else if (var7 < -3) {
                var8 = class2.method2886(16740352);
            } else if (var7 < 0) {
                var8 = class2.method2886(16756736);
            } else if (var7 > 9) {
                var8 = class2.method2886(65280);
            } else if (var7 > 6) {
                var8 = class2.method2886(4259584);
            } else if (var7 > 3) {
                var8 = class2.method2886(8453888);
            } else if (var7 > 0) {
                var8 = class2.method2886(12648192);
            } else {
                var8 = class2.method2886(16776960);
            }
            var9 = var4 + var8 + " " + class2.field23 + class158.field2455 + arg0.field39 + class2.field18 + arg0.field56[2];
        } else {
            var9 = arg0.field56[0] + arg0.field59 + arg0.field56[1] + " " + class2.field23 + class158.field2549 + arg0.field40 + class2.field18 + arg0.field56[2];
        }
        if (field449 == 1) {
            method666(class158.field2449, field379 + " " + class2.field25 + " " + class2.method2886(16777215) + var9, 14, arg1, arg2, arg3);
        } else if (!field448) {
            for (int var10 = 7; var10 >= 0; var10--) {
                if (field318[var10] != null) {
                    short var11 = 0;
                    if (field318[var10].equalsIgnoreCase(class158.field2362)) {
                        if (field323 == class21.field586) {
                            continue;
                        }
                        if (field323 == class21.field581 || field323 == class21.field588 && arg0.field39 > Statics.field94.field39) {
                            var11 = 2000;
                        }
                        if (Statics.field94.field64 != 0 && arg0.field64 != 0) {
                            if (Statics.field94.field64 == arg0.field64) {
                                var11 = 2000;
                            } else {
                                var11 = 0;
                            }
                        }
                    } else if (field423[var10]) {
                        var11 = 2000;
                    }
                    boolean var12 = false;
                    int var13 = field421[var10] + var11;
                    method666(field318[var10], class2.method2886(16777215) + var9, var13, arg1, arg2, arg3);
                }
            }
        } else if ((Statics.field2637 & 0x8) == 8) {
            method666(field298, field535 + " " + class2.field25 + " " + class2.method2886(16777215) + var9, 15, arg1, arg2, arg3);
        }
        for (int var14 = 0; var14 < field435; var14++) {
            if (field438[var14] == 23) {
                field441[var14] = class2.method2886(16777215) + var9;
                break;
            }
        }
    }

    @ObfuscatedName("k.cn(IIIIIIIIB)V")
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class174.method159(arg0)) {
            Statics.field2290 = null;
            method2334(Statics.field2887[arg0], -1, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            if (Statics.field2290 != null) {
                method2334(Statics.field2290, -1412584499, arg1, arg2, arg3, arg4, Statics.field1783, Statics.field2905, arg7);
                Statics.field2290 = null;
            }
        } else if (arg7 == -1) {
            for (int var8 = 0; var8 < 100; var8++) {
                field324[var8] = true;
            }
        } else {
            field324[arg7] = true;
        }
    }

    @ObfuscatedName("dc.cj([Lfa;IIIIIIIII)V")
    public static final void method2334(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class80.method1777(arg2, arg3, arg4, arg5);
        class92.method2040();
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class174 var10 = arg0[var9];
            if (var10 != null && (var10.field2778 == arg1 || arg1 == -1412584499 && field466 == var10)) {
                int var11;
                if (arg8 == -1) {
                    field312[field497] = var10.field2849 + arg6;
                    field498[field497] = var10.field2773 + arg7;
                    field504[field497] = var10.field2774;
                    field505[field497] = var10.field2775;
                    var11 = ++field497 - 1;
                } else {
                    var11 = arg8;
                }
                var10.field2890 = var11;
                var10.field2891 = field307;
                if (!var10.field2758 || !method3804(var10)) {
                    if (var10.field2763 > 0) {
                        int var12 = var10.field2763;
                        if (var12 == 324) {
                            if (field447 == -1) {
                                field447 = var10.field2794;
                                field570 = var10.field2795;
                            }
                            if (field568.field2925) {
                                var10.field2794 = field447;
                            } else {
                                var10.field2794 = field570;
                            }
                        } else if (var12 == 325) {
                            if (field447 == -1) {
                                field447 = var10.field2794;
                                field570 = var10.field2795;
                            }
                            if (field568.field2925) {
                                var10.field2794 = field570;
                            } else {
                                var10.field2794 = field447;
                            }
                        } else if (var12 == 327) {
                            var10.field2801 = 150;
                            var10.field2811 = (int) (Math.sin((double) field307 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2802 = 5;
                            var10.field2870 = 0;
                        } else if (var12 == 328) {
                            var10.field2801 = 150;
                            var10.field2811 = (int) (Math.sin((double) field307 / 40.0D) * 256.0D) & 0x7FF;
                            var10.field2802 = 5;
                            var10.field2870 = 1;
                        }
                    }
                    int var13 = var10.field2849 + arg6;
                    int var14 = var10.field2773 + arg7;
                    int var15 = var10.field2808;
                    if (field466 == var10) {
                        if (arg1 != -1412584499 && !var10.field2837) {
                            Statics.field2290 = arg0;
                            Statics.field1783 = arg6;
                            Statics.field2905 = arg7;
                            continue;
                        }
                        if (field477 && field499) {
                            int var16 = class141.field2152;
                            int var17 = class141.field2162;
                            int var18 = var16 - field465;
                            int var19 = var17 - field486;
                            if (var18 < field451) {
                                var18 = field451;
                            }
                            if (var10.field2774 + var18 > field451 + field410.field2774) {
                                var18 = field451 + field410.field2774 - var10.field2774;
                            }
                            if (var19 < field473) {
                                var19 = field473;
                            }
                            if (var10.field2775 + var19 > field473 + field410.field2775) {
                                var19 = field473 + field410.field2775 - var10.field2775;
                            }
                            var13 = var18;
                            var14 = var19;
                        }
                        if (!var10.field2837) {
                            var15 = 128;
                        }
                    }
                    int var20;
                    int var21;
                    int var22;
                    int var23;
                    if (var10.field2825 == 2) {
                        var20 = arg2;
                        var21 = arg3;
                        var22 = arg4;
                        var23 = arg5;
                    } else if (var10.field2825 == 9) {
                        int var24 = var13;
                        int var25 = var14;
                        int var26 = var10.field2774 + var13;
                        int var27 = var10.field2775 + var14;
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
                        int var30 = var10.field2774 + var13;
                        int var31 = var10.field2775 + var14;
                        var20 = var13 > arg2 ? var13 : arg2;
                        var21 = var14 > arg3 ? var14 : arg3;
                        var22 = var30 < arg4 ? var30 : arg4;
                        var23 = var31 < arg5 ? var31 : arg5;
                    }
                    if (!var10.field2758 || var20 < var22 && var21 < var23) {
                        if (var10.field2763 != 0) {
                            if (var10.field2763 == 1336) {
                                if (field313) {
                                    var14 += 15;
                                    Statics.field2085.method3856("Fps:" + field2186, var10.field2774 + var13, var14, 16776960, -1);
                                    var14 += 15;
                                    Runtime var32 = Runtime.getRuntime();
                                    int var33 = (int) ((var32.totalMemory() - var32.freeMemory()) / 1024L);
                                    int var34 = 16776960;
                                    if (var33 > 32768 && field303) {
                                        var34 = 16711680;
                                    }
                                    if (var33 > 65536 && !field303) {
                                        var34 = 16711680;
                                    }
                                    Statics.field2085.method3856("Mem:" + var33 + "k", var10.field2774 + var13, var14, var34, -1);
                                    var14 += 15;
                                }
                                continue;
                            }
                            if (var10.field2763 == 1337) {
                                field341 = var13;
                                field443 = var14;
                                method207(var13, var14, var10.field2774, var10.field2775);
                                field324[var10.field2890] = true;
                                class80.method1777(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2763 == 1338) {
                                method913();
                                class176 var35 = var10.method3266(false);
                                if (var35 != null) {
                                    class80.method1777(var13, var14, var35.field2902 + var13, var35.field2901 + var14);
                                    if (field531 == 2 || field531 == 5) {
                                        class80.method1796(var13, var14, 0, var35.field2903, var35.field2900);
                                    } else {
                                        int var36 = field444 + field380 & 0x7FF;
                                        int var37 = Statics.field94.field845 / 32 + 48;
                                        int var38 = 464 - Statics.field94.field820 / 32;
                                        Statics.field1611.method1697(var13, var14, var35.field2902, var35.field2901, var37, var38, var36, field369 + 256, var35.field2903, var35.field2900);
                                        for (int var39 = 0; var39 < field525; var39++) {
                                            int var40 = field308[var39] * 4 + 2 - Statics.field94.field845 / 32;
                                            int var41 = field566[var39] * 4 + 2 - Statics.field94.field820 / 32;
                                            method2126(var13, var14, var40, var41, field528[var39], var35);
                                        }
                                        int var42 = 0;
                                        while (true) {
                                            if (var42 >= 104) {
                                                for (int var47 = 0; var47 < field344; var47++) {
                                                    class35 var48 = field547[field336[var47]];
                                                    if (var48 != null && var48.method29()) {
                                                        class40 var49 = var48.field785;
                                                        if (var49 != null && var49.field917 != null) {
                                                            var49 = var49.method840();
                                                        }
                                                        if (var49 != null && var49.field908 && var49.field899) {
                                                            int var50 = var48.field845 / 32 - Statics.field94.field845 / 32;
                                                            int var51 = var48.field820 / 32 - Statics.field94.field820 / 32;
                                                            method2126(var13, var14, var50, var51, Statics.field2143[1], var35);
                                                        }
                                                    }
                                                }
                                                int var52 = class33.field772;
                                                int[] var53 = class33.field763;
                                                for (int var54 = 0; var54 < var52; var54++) {
                                                    class3 var55 = field551[var53[var54]];
                                                    if (var55 != null && var55.method29() && !var55.field52 && Statics.field94 != var55) {
                                                        int var56 = var55.field845 / 32 - Statics.field94.field845 / 32;
                                                        int var57 = var55.field820 / 32 - Statics.field94.field820 / 32;
                                                        boolean var58 = false;
                                                        if (method926(var55.field59, true)) {
                                                            var58 = true;
                                                        }
                                                        boolean var59 = false;
                                                        for (int var60 = 0; var60 < Statics.field2144; var60++) {
                                                            if (var55.field59.equals(Statics.field1227[var60].field638)) {
                                                                var59 = true;
                                                                break;
                                                            }
                                                        }
                                                        boolean var61 = false;
                                                        if (Statics.field94.field64 != 0 && var55.field64 != 0 && Statics.field94.field64 == var55.field64) {
                                                            var61 = true;
                                                        }
                                                        if (var58) {
                                                            method2126(var13, var14, var56, var57, Statics.field2143[3], var35);
                                                        } else if (var61) {
                                                            method2126(var13, var14, var56, var57, Statics.field2143[4], var35);
                                                        } else if (var59) {
                                                            method2126(var13, var14, var56, var57, Statics.field2143[5], var35);
                                                        } else {
                                                            method2126(var13, var14, var56, var57, Statics.field2143[2], var35);
                                                        }
                                                    }
                                                }
                                                if (field315 != 0 && field307 % 20 < 10) {
                                                    if (field315 == 1 && field316 >= 0 && field316 < field547.length) {
                                                        class35 var62 = field547[field316];
                                                        if (var62 != null) {
                                                            int var63 = var62.field845 / 32 - Statics.field94.field845 / 32;
                                                            int var64 = var62.field820 / 32 - Statics.field94.field820 / 32;
                                                            method3746(var13, var14, var63, var64, Statics.field1872[1], var35);
                                                        }
                                                    }
                                                    if (field315 == 2) {
                                                        int var65 = field392 * 4 - Statics.field2205 * 4 + 2 - Statics.field94.field845 / 32;
                                                        int var66 = field319 * 4 - Statics.field68 * 4 + 2 - Statics.field94.field820 / 32;
                                                        method3746(var13, var14, var65, var66, Statics.field1872[1], var35);
                                                    }
                                                    if (field315 == 10 && field317 >= 0 && field317 < field551.length) {
                                                        class3 var67 = field551[field317];
                                                        if (var67 != null) {
                                                            int var68 = var67.field845 / 32 - Statics.field94.field845 / 32;
                                                            int var69 = var67.field820 / 32 - Statics.field94.field820 / 32;
                                                            method3746(var13, var14, var68, var69, Statics.field1872[1], var35);
                                                        }
                                                    }
                                                }
                                                if (field529 != 0) {
                                                    int var70 = field529 * 4 + 2 - Statics.field94.field845 / 32;
                                                    int var71 = field348 * 4 + 2 - Statics.field94.field820 / 32;
                                                    method2126(var13, var14, var70, var71, Statics.field1872[0], var35);
                                                }
                                                if (!Statics.field94.field52) {
                                                    class80.method1817(var35.field2902 / 2 + var13 - 1, var35.field2901 / 2 + var14 - 1, 3, 3, 16777215);
                                                }
                                                break;
                                            }
                                            for (int var43 = 0; var43 < 104; var43++) {
                                                class200 var44 = field426[Statics.field1003][var42][var43];
                                                if (var44 != null) {
                                                    int var45 = var42 * 4 + 2 - Statics.field94.field845 / 32;
                                                    int var46 = var43 * 4 + 2 - Statics.field94.field820 / 32;
                                                    method2126(var13, var14, var45, var46, Statics.field2143[0], var35);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                    field521[var11] = true;
                                }
                                class80.method1777(arg2, arg3, arg4, arg5);
                                continue;
                            }
                            if (var10.field2763 == 1339) {
                                method2038(var10, var13, var14, var11);
                                class80.method1777(arg2, arg3, arg4, arg5);
                                continue;
                            }
                        }
                        if (var10.field2825 == 0) {
                            if (!var10.field2758 && method3804(var10) && Statics.field1033 != var10) {
                                continue;
                            }
                            if (!var10.field2758) {
                                if (var10.field2781 > var10.field2766 - var10.field2775) {
                                    var10.field2781 = var10.field2766 - var10.field2775;
                                }
                                if (var10.field2781 < 0) {
                                    var10.field2781 = 0;
                                }
                            }
                            method2334(arg0, var10.field2843, var20, var21, var22, var23, var13 - var10.field2880, var14 - var10.field2781, var11);
                            if (var10.field2868 != null) {
                                method2334(var10.field2868, var10.field2843, var20, var21, var22, var23, var13 - var10.field2880, var14 - var10.field2781, var11);
                            }
                            class4 var72 = (class4) field454.method3607((long) var10.field2843);
                            if (var72 != null) {
                                method115(var72.field71, var20, var21, var22, var23, var13, var14, var11);
                            }
                            class80.method1777(arg2, arg3, arg4, arg5);
                            class92.method2040();
                        }
                        if (field345 || field355[var11] || field506 > 1) {
                            if (var10.field2825 == 0 && !var10.field2758 && var10.field2766 > var10.field2775) {
                                int var73 = var10.field2774 + var13;
                                int var74 = var10.field2781;
                                int var75 = var10.field2775;
                                int var76 = var10.field2766;
                                Statics.field2641[0].method1850(var73, var14);
                                Statics.field2641[1].method1850(var73, var14 + var75 - 16);
                                class80.method1817(var73, var14 + 16, 16, var75 - 32, field550);
                                int var77 = (var75 - 32) * var75 / var76;
                                if (var77 < 8) {
                                    var77 = 8;
                                }
                                int var78 = (var75 - 32 - var77) * var74 / (var76 - var75);
                                class80.method1817(var73, var14 + 16 + var78, 16, var77, field374);
                                class80.method1793(var73, var14 + 16 + var78, var77, field376);
                                class80.method1793(var73 + 1, var14 + 16 + var78, var77, field376);
                                class80.method1791(var73, var14 + 16 + var78, 16, field376);
                                class80.method1791(var73, var14 + 17 + var78, 16, field376);
                                class80.method1793(var73 + 15, var14 + 16 + var78, var77, field375);
                                class80.method1793(var73 + 14, var14 + 17 + var78, var77 - 1, field375);
                                class80.method1791(var73, var14 + 15 + var78 + var77, 16, field375);
                                class80.method1791(var73 + 1, var14 + 14 + var78 + var77, 15, field375);
                            }
                            if (var10.field2825 != 1) {
                                if (var10.field2825 == 2) {
                                    int var79 = 0;
                                    for (int var80 = 0; var80 < var10.field2810; var80++) {
                                        for (int var81 = 0; var81 < var10.field2828; var81++) {
                                            int var82 = (var10.field2759 + 32) * var81 + var13;
                                            int var83 = (var10.field2826 + 32) * var80 + var14;
                                            if (var79 < 20) {
                                                var82 += var10.field2827[var79];
                                                var83 += var10.field2751[var79];
                                            }
                                            if (var10.field2877[var79] > 0) {
                                                boolean var84 = false;
                                                boolean var85 = false;
                                                int var86 = var10.field2877[var79] - 1;
                                                if (var82 + 32 > arg2 && var82 < arg4 && var83 + 32 > arg3 && var83 < arg5 || Statics.field66 == var10 && field409 == var79) {
                                                    class79 var87;
                                                    if (field449 == 1 && Statics.field188 == var79 && Statics.field932 == var10.field2843) {
                                                        var87 = class52.method1087(var86, var10.field2878[var79], 2, 0, 2, false);
                                                    } else {
                                                        var87 = class52.method1087(var86, var10.field2878[var79], 1, 3153952, 2, false);
                                                    }
                                                    if (var87 == null) {
                                                        method652(var10);
                                                    } else if (Statics.field66 == var10 && field409 == var79) {
                                                        int var88 = class141.field2152 - field415;
                                                        int var89 = class141.field2162 - field378;
                                                        if (var88 < 5 && var88 > -5) {
                                                            var88 = 0;
                                                        }
                                                        if (var89 < 5 && var89 > -5) {
                                                            var89 = 0;
                                                        }
                                                        if (field414 < 5) {
                                                            var88 = 0;
                                                            var89 = 0;
                                                        }
                                                        var87.method1744(var82 + var88, var83 + var89, 128);
                                                        if (arg1 != -1) {
                                                            class174 var90 = arg0[arg1 & 0xFFFF];
                                                            if (var83 + var89 < class80.field1416 && var90.field2781 > 0) {
                                                                int var91 = field428 * (class80.field1416 - var83 - var89) / 3;
                                                                if (var91 > field428 * 10) {
                                                                    var91 = field428 * 10;
                                                                }
                                                                if (var91 > var90.field2781) {
                                                                    var91 = var90.field2781;
                                                                }
                                                                var90.field2781 -= var91;
                                                                field378 += var91;
                                                                method652(var90);
                                                            }
                                                            if (var83 + var89 + 32 > class80.field1417 && var90.field2781 < var90.field2766 - var90.field2775) {
                                                                int var92 = field428 * (var83 + var89 + 32 - class80.field1417) / 3;
                                                                if (var92 > field428 * 10) {
                                                                    var92 = field428 * 10;
                                                                }
                                                                if (var92 > var90.field2766 - var90.field2775 - var90.field2781) {
                                                                    var92 = var90.field2766 - var90.field2775 - var90.field2781;
                                                                }
                                                                var90.field2781 += var92;
                                                                field378 -= var92;
                                                                method652(var90);
                                                            }
                                                        }
                                                    } else if (Statics.field2062 == var10 && field408 == var79) {
                                                        var87.method1744(var82, var83, 128);
                                                    } else {
                                                        var87.method1686(var82, var83);
                                                    }
                                                }
                                            } else if (var10.field2829 != null && var79 < 20) {
                                                class79 var93 = var10.method3259(var79);
                                                if (var93 != null) {
                                                    var93.method1686(var82, var83);
                                                } else if (class174.field2791) {
                                                    method652(var10);
                                                }
                                            }
                                            var79++;
                                        }
                                    }
                                } else if (var10.field2825 == 3) {
                                    int var94;
                                    if (method3043(var10)) {
                                        var94 = var10.field2785;
                                        if (Statics.field1033 == var10 && var10.field2823 != 0) {
                                            var94 = var10.field2823;
                                        }
                                    } else {
                                        var94 = var10.field2784;
                                        if (Statics.field1033 == var10 && var10.field2786 != 0) {
                                            var94 = var10.field2786;
                                        }
                                    }
                                    if (var10.field2788) {
                                        switch(var10.field2846.field1432) {
                                            case 1:
                                                class80.method1784(var13, var14, var10.field2774, var10.field2775, var10.field2784, var10.field2785, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            case 2:
                                                class80.method1846(var13, var14, var10.field2774, var10.field2775, var10.field2784, var10.field2785, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            case 3:
                                                class80.method1786(var13, var14, var10.field2774, var10.field2775, var10.field2784, var10.field2785, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            case 4:
                                                class80.method1787(var13, var14, var10.field2774, var10.field2775, var10.field2784, var10.field2785, 256 - (var10.field2808 & 0xFF), 256 - (var10.field2834 & 0xFF));
                                                break;
                                            default:
                                                if (var15 == 0) {
                                                    class80.method1817(var13, var14, var10.field2774, var10.field2775, var94);
                                                } else {
                                                    class80.method1799(var13, var14, var10.field2774, var10.field2775, var94, 256 - (var15 & 0xFF));
                                                }
                                        }
                                    } else if (var15 == 0) {
                                        class80.method1829(var13, var14, var10.field2774, var10.field2775, var94);
                                    } else {
                                        class80.method1790(var13, var14, var10.field2774, var10.field2775, var94, 256 - (var15 & 0xFF));
                                    }
                                } else if (var10.field2825 == 4) {
                                    class225 var95 = var10.method3264();
                                    if (var95 != null) {
                                        String var96 = var10.field2770;
                                        int var97;
                                        if (method3043(var10)) {
                                            var97 = var10.field2785;
                                            if (Statics.field1033 == var10 && var10.field2823 != 0) {
                                                var97 = var10.field2823;
                                            }
                                            if (var10.field2820.length() > 0) {
                                                var96 = var10.field2820;
                                            }
                                        } else {
                                            var97 = var10.field2784;
                                            if (Statics.field1033 == var10 && var10.field2786 != 0) {
                                                var97 = var10.field2786;
                                            }
                                        }
                                        if (var10.field2758 && var10.field2879 != -1) {
                                            class52 var98 = class52.method176(var10.field2879);
                                            var96 = var98.field1126;
                                            if (var96 == null) {
                                                var96 = "null";
                                            }
                                            if ((var98.field1137 == 1 || var10.field2767 != 1) && var10.field2767 != -1) {
                                                var96 = class2.method2886(16748608) + var96 + class2.field26 + " " + 'x' + method3050(var10.field2767);
                                            }
                                        }
                                        if (field527 == var10) {
                                            class158 var10000 = (class158) null;
                                            var96 = class158.field2457;
                                            var97 = var10.field2784;
                                        }
                                        if (!var10.field2758) {
                                            var96 = method720(var96, var10);
                                        }
                                        var95.method3858(var96, var13, var14, var10.field2774, var10.field2775, var97, var10.field2824 ? 0 : -1, var10.field2822, var10.field2783, var10.field2815);
                                    } else if (class174.field2791) {
                                        method652(var10);
                                    }
                                } else if (var10.field2825 == 5) {
                                    if (var10.field2758) {
                                        class79 var100;
                                        if (var10.field2879 == -1) {
                                            var100 = var10.method3263(false);
                                        } else {
                                            var100 = class52.method1087(var10.field2879, var10.field2767, var10.field2821, var10.field2799, var10.field2817, false);
                                        }
                                        if (var100 != null) {
                                            int var101 = var100.field1406;
                                            int var102 = var100.field1408;
                                            if (var10.field2797) {
                                                class80.method1833(var13, var14, var10.field2774 + var13, var10.field2775 + var14);
                                                int var103 = (var10.field2774 + (var101 - 1)) / var101;
                                                int var104 = (var10.field2775 + (var102 - 1)) / var102;
                                                for (int var105 = 0; var105 < var103; var105++) {
                                                    for (int var106 = 0; var106 < var104; var106++) {
                                                        if (var10.field2796 != 0) {
                                                            var100.method1699(var101 / 2 + var101 * var105 + var13, var102 / 2 + var102 * var106 + var14, var10.field2796, 4096);
                                                        } else if (var15 == 0) {
                                                            var100.method1686(var101 * var105 + var13, var102 * var106 + var14);
                                                        } else {
                                                            var100.method1744(var101 * var105 + var13, var102 * var106 + var14, 256 - (var15 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class80.method1777(arg2, arg3, arg4, arg5);
                                            } else {
                                                int var107 = var10.field2774 * 4096 / var101;
                                                if (var10.field2796 != 0) {
                                                    var100.method1699(var10.field2774 / 2 + var13, var10.field2775 / 2 + var14, var10.field2796, var107);
                                                } else if (var15 != 0) {
                                                    var100.method1694(var13, var14, var10.field2774, var10.field2775, 256 - (var15 & 0xFF));
                                                } else if (var10.field2774 == var101 && var10.field2775 == var102) {
                                                    var100.method1686(var13, var14);
                                                } else {
                                                    var100.method1747(var13, var14, var10.field2774, var10.field2775);
                                                }
                                            }
                                        } else if (class174.field2791) {
                                            method652(var10);
                                        }
                                    } else {
                                        class79 var99 = var10.method3263(method3043(var10));
                                        if (var99 != null) {
                                            var99.method1686(var13, var14);
                                        } else if (class174.field2791) {
                                            method652(var10);
                                        }
                                    }
                                } else if (var10.field2825 == 6) {
                                    boolean var108 = method3043(var10);
                                    int var109;
                                    if (var108) {
                                        var109 = var10.field2835;
                                    } else {
                                        var109 = var10.field2806;
                                    }
                                    class106 var110 = null;
                                    int var111 = 0;
                                    if (var10.field2879 != -1) {
                                        class52 var112 = class52.method176(var10.field2879);
                                        if (var112 != null) {
                                            class52 var113 = var112.method1152(var10.field2767);
                                            var110 = var113.method1110(1);
                                            if (var110 == null) {
                                                method652(var10);
                                            } else {
                                                var110.method2274();
                                                var111 = var110.field1466 / 2;
                                            }
                                        }
                                    } else if (var10.field2802 == 5) {
                                        if (var10.field2870 == 0) {
                                            var110 = field568.method3344((class43) null, -1, (class43) null, -1);
                                        } else {
                                            var110 = Statics.field94.method32();
                                        }
                                    } else if (var109 == -1) {
                                        var110 = var10.method3290((class43) null, -1, var108, Statics.field94.field34);
                                        if (var110 == null && class174.field2791) {
                                            method652(var10);
                                        }
                                    } else {
                                        class43 var114 = class43.method2137(var109);
                                        var110 = var10.method3290(var114, var10.field2772, var108, Statics.field94.field34);
                                        if (var110 == null && class174.field2791) {
                                            method652(var10);
                                        }
                                    }
                                    class92.method2043(var10.field2774 / 2 + var13, var10.field2775 / 2 + var14);
                                    int var115 = var10.field2813 * class92.field1594[var10.field2801] >> 16;
                                    int var116 = var10.field2813 * class92.field1595[var10.field2801] >> 16;
                                    if (var110 != null) {
                                        if (var10.field2758) {
                                            var110.method2274();
                                            if (var10.field2816) {
                                                var110.method2315(0, var10.field2811, var10.field2812, var10.field2801, var10.field2761, var10.field2809 + var111 + var115, var10.field2809 + var116, var10.field2813);
                                            } else {
                                                var110.method2276(0, var10.field2811, var10.field2812, var10.field2801, var10.field2761, var10.field2809 + var111 + var115, var10.field2809 + var116);
                                            }
                                        } else {
                                            var110.method2276(0, var10.field2811, 0, var10.field2801, 0, var115, var116);
                                        }
                                    }
                                    class92.method2042();
                                } else {
                                    if (var10.field2825 == 7) {
                                        class225 var117 = var10.method3264();
                                        if (var117 == null) {
                                            if (class174.field2791) {
                                                method652(var10);
                                            }
                                            continue;
                                        }
                                        int var118 = 0;
                                        for (int var119 = 0; var119 < var10.field2810; var119++) {
                                            for (int var120 = 0; var120 < var10.field2828; var120++) {
                                                if (var10.field2877[var118] > 0) {
                                                    class52 var121 = class52.method176(var10.field2877[var118] - 1);
                                                    String var122;
                                                    if (var121.field1137 != 1 && var10.field2878[var118] == 1) {
                                                        var122 = class2.method2886(16748608) + var121.field1126 + class2.field26;
                                                    } else {
                                                        var122 = class2.method2886(16748608) + var121.field1126 + class2.field26 + " " + 'x' + method3050(var10.field2878[var118]);
                                                    }
                                                    int var123 = (var10.field2759 + 115) * var120 + var13;
                                                    int var124 = (var10.field2826 + 12) * var119 + var14;
                                                    if (var10.field2822 == 0) {
                                                        var117.method3855(var122, var123, var124, var10.field2784, var10.field2824 ? 0 : -1);
                                                    } else if (var10.field2822 == 1) {
                                                        var117.method3857(var122, var10.field2774 / 2 + var123, var124, var10.field2784, var10.field2824 ? 0 : -1);
                                                    } else {
                                                        var117.method3856(var122, var10.field2774 + var123 - 1, var124, var10.field2784, var10.field2824 ? 0 : -1);
                                                    }
                                                }
                                                var118++;
                                            }
                                        }
                                    }
                                    if (var10.field2825 == 8 && Statics.field1202 == var10 && field445 == field411) {
                                        int var125 = 0;
                                        int var126 = 0;
                                        class225 var127 = Statics.field2085;
                                        String var128 = var10.field2770;
                                        String var129 = method720(var128, var10);
                                        while (var129.length() > 0) {
                                            int var130 = var129.indexOf(class2.field24);
                                            String var131;
                                            if (var130 == -1) {
                                                var131 = var129;
                                                var129 = "";
                                            } else {
                                                var131 = var129.substring(0, var130);
                                                var129 = var129.substring(var130 + 4);
                                            }
                                            int var132 = var127.method3850(var131);
                                            if (var132 > var125) {
                                                var125 = var132;
                                            }
                                            var126 += var127.field3191 + 1;
                                        }
                                        var125 += 6;
                                        var126 += 7;
                                        int var133 = var10.field2774 + var13 - 5 - var125;
                                        int var134 = var10.field2775 + var14 + 5;
                                        if (var133 < var13 + 5) {
                                            var133 = var13 + 5;
                                        }
                                        if (var125 + var133 > arg4) {
                                            var133 = arg4 - var125;
                                        }
                                        if (var126 + var134 > arg5) {
                                            var134 = arg5 - var126;
                                        }
                                        class80.method1817(var133, var134, var125, var126, 16777120);
                                        class80.method1829(var133, var134, var125, var126, 0);
                                        String var135 = var10.field2770;
                                        int var136 = var127.field3191 + var134 + 2;
                                        String var137 = method720(var135, var10);
                                        while (var137.length() > 0) {
                                            int var138 = var137.indexOf(class2.field24);
                                            String var139;
                                            if (var138 == -1) {
                                                var139 = var137;
                                                var137 = "";
                                            } else {
                                                var139 = var137.substring(0, var138);
                                                var137 = var137.substring(var138 + 4);
                                            }
                                            var127.method3855(var139, var133 + 3, var136, 0, -1);
                                            var136 += var127.field3191 + 1;
                                        }
                                    }
                                    if (var10.field2825 == 9) {
                                        if (var10.field2792 == 1) {
                                            int var140;
                                            int var141;
                                            int var142;
                                            int var143;
                                            if (var10.field2793) {
                                                var140 = var13;
                                                var141 = var10.field2775 + var14;
                                                var142 = var10.field2774 + var13;
                                                var143 = var14;
                                            } else {
                                                var140 = var13;
                                                var141 = var14;
                                                var142 = var10.field2774 + var13;
                                                var143 = var10.field2775 + var14;
                                            }
                                            class80.method1795(var140, var141, var142, var143, var10.field2784);
                                        } else {
                                            int var144 = var10.field2774 >= 0 ? var10.field2774 : -var10.field2774;
                                            int var145 = var10.field2775 >= 0 ? var10.field2775 : -var10.field2775;
                                            int var146 = var144;
                                            if (var144 < var145) {
                                                var146 = var145;
                                            }
                                            if (var146 != 0) {
                                                int var147 = (var10.field2774 << 16) / var146;
                                                int var148 = (var10.field2775 << 16) / var146;
                                                if (var148 <= var147) {
                                                    var147 = -var147;
                                                } else {
                                                    var148 = -var148;
                                                }
                                                int var149 = var10.field2792 * var148 >> 17;
                                                int var150 = var10.field2792 * var148 + 1 >> 17;
                                                int var151 = var10.field2792 * var147 >> 17;
                                                int var152 = var10.field2792 * var147 + 1 >> 17;
                                                int var153 = var13 + var149;
                                                int var154 = var13 - var150;
                                                int var155 = var10.field2774 + var13 - var150;
                                                int var156 = var10.field2774 + var13 + var149;
                                                int var157 = var14 + var151;
                                                int var158 = var14 - var152;
                                                int var159 = var10.field2775 + var14 - var152;
                                                int var160 = var10.field2775 + var14 + var151;
                                                class92.method2048(var153, var154, var155);
                                                class92.method2051(var157, var158, var159, var153, var154, var155, var10.field2784);
                                                class92.method2048(var153, var155, var156);
                                                class92.method2051(var157, var159, var160, var153, var155, var156, var10.field2784);
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

    @ObfuscatedName("ar.cy(Ljava/lang/String;Lfa;I)Ljava/lang/String;")
    public static String method720(String arg0, class174 arg1) {
        if (arg0.indexOf("%") != -1) {
            for (int var2 = 1; var2 <= 5; var2++) {
                while (true) {
                    int var3 = arg0.indexOf("%" + var2);
                    if (var3 == -1) {
                        break;
                    }
                    String var4 = arg0.substring(0, var3);
                    int var5 = method2405(arg1, var2 - 1);
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
                if (Statics.field261 != null) {
                    int var9 = Statics.field261.field2213;
                    String var10 = (var9 >> 24 & 0xFF) + "." + (var9 >> 16 & 0xFF) + "." + (var9 >> 8 & 0xFF) + "." + (var9 & 0xFF);
                    var8 = var10;
                    if (Statics.field261.field2212 != null) {
                        var8 = (String) Statics.field261.field2212;
                    }
                }
                arg0 = arg0.substring(0, var7) + var8 + arg0.substring(var7 + 4);
            }
        }
        return arg0;
    }

    @ObfuscatedName("el.cm(IB)Ljava/lang/String;")
    public static final String method3050(int arg0) {
        String var1 = Integer.toString(arg0);
        for (int var2 = var1.length() - 3; var2 > 0; var2 -= 3) {
            var1 = var1.substring(0, var2) + class2.field19 + var1.substring(var2);
        }
        if (var1.length() > 9) {
            return " " + class2.method2886(65408) + var1.substring(0, var1.length() - 8) + class158.field2460 + " " + class2.field23 + var1 + class2.field18 + class2.field26;
        } else if (var1.length() > 6) {
            return " " + class2.method2886(16777215) + var1.substring(0, var1.length() - 4) + class158.field2561 + " " + class2.field23 + var1 + class2.field18 + class2.field26;
        } else {
            return " " + class2.method2886(16776960) + var1 + class2.field26;
        }
    }

    @ObfuscatedName("ak.cb(ZI)V")
    public static final void method1063(boolean arg0) {
        method7(field453, Statics.field877, Statics.field1672, arg0);
    }

    @ObfuscatedName("cq.ci(Lfa;I)V")
    public static void method2136(class174 arg0) {
        class174 var1 = arg0.field2778 == -1 ? null : class174.method636(arg0.field2778);
        int var2;
        int var3;
        if (var1 == null) {
            var2 = Statics.field877;
            var3 = Statics.field1672;
        } else {
            var2 = var1.field2774;
            var3 = var1.field2775;
        }
        method2391(arg0, var2, var3, false);
        method208(arg0, var2, var3);
    }

    @ObfuscatedName("t.ch([Lfa;Lfa;ZI)V")
    public static void method197(class174[] arg0, class174 arg1, boolean arg2) {
        int var3 = arg1.field2854 == 0 ? arg1.field2774 : arg1.field2854;
        int var4 = arg1.field2766 == 0 ? arg1.field2775 : arg1.field2766;
        method807(arg0, arg1.field2843, var3, var4, arg2);
        if (arg1.field2868 != null) {
            method807(arg1.field2868, arg1.field2843, var3, var4, arg2);
        }
        class4 var5 = (class4) field454.method3607((long) arg1.field2843);
        if (var5 != null) {
            method7(var5.field71, var3, var4, arg2);
        }
        if (arg1.field2763 == 1337) {
        }
    }

    @ObfuscatedName("a.co(IIIZI)V")
    public static final void method7(int arg0, int arg1, int arg2, boolean arg3) {
        if (class174.method159(arg0)) {
            method807(Statics.field2887[arg0], -1, arg1, arg2, arg3);
        }
    }

    @ObfuscatedName("ac.cq([Lfa;IIIZI)V")
    public static void method807(class174[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        for (int var5 = 0; var5 < arg0.length; var5++) {
            class174 var6 = arg0[var5];
            if (var6 != null && var6.field2778 == arg1) {
                method2391(var6, arg2, arg3, arg4);
                method208(var6, arg2, arg3);
                if (var6.field2880 > var6.field2854 - var6.field2774) {
                    var6.field2880 = var6.field2854 - var6.field2774;
                }
                if (var6.field2880 < 0) {
                    var6.field2880 = 0;
                }
                if (var6.field2781 > var6.field2766 - var6.field2775) {
                    var6.field2781 = var6.field2766 - var6.field2775;
                }
                if (var6.field2781 < 0) {
                    var6.field2781 = 0;
                }
                if (var6.field2825 == 0) {
                    method197(arg0, var6, arg4);
                }
            }
        }
    }

    @ObfuscatedName("dh.cc(Lfa;IIZI)V")
    public static void method2391(class174 arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg0.field2774;
        int var5 = arg0.field2775;
        if (arg0.field2882 == 0) {
            arg0.field2774 = arg0.field2828;
        } else if (arg0.field2882 == 1) {
            arg0.field2774 = arg1 - arg0.field2828;
        } else if (arg0.field2882 == 2) {
            arg0.field2774 = arg0.field2828 * arg1 >> 14;
        }
        if (arg0.field2881 == 0) {
            arg0.field2775 = arg0.field2810;
        } else if (arg0.field2881 == 1) {
            arg0.field2775 = arg2 - arg0.field2810;
        } else if (arg0.field2881 == 2) {
            arg0.field2775 = arg0.field2810 * arg2 >> 14;
        }
        if (arg0.field2882 == 4) {
            arg0.field2774 = arg0.field2776 * arg0.field2775 / arg0.field2777;
        }
        if (arg0.field2881 == 4) {
            arg0.field2775 = arg0.field2777 * arg0.field2774 / arg0.field2776;
        }
        if (field463 && arg0.field2825 == 0) {
            if (arg0.field2775 < 5 && arg0.field2774 < 5) {
                arg0.field2775 = 5;
                arg0.field2774 = 5;
            } else {
                if (arg0.field2775 <= 0) {
                    arg0.field2775 = 5;
                }
                if (arg0.field2774 <= 0) {
                    arg0.field2774 = 5;
                }
            }
        }
        if (arg0.field2763 == 1337) {
            field471 = arg0;
        }
        if (arg3 && arg0.field2798 != null && (arg0.field2774 != var4 || arg0.field2775 != var5)) {
            class1 var6 = new class1();
            var6.field3 = arg0;
            var6.field5 = arg0.field2798;
            field493.method3639(var6);
        }
    }

    @ObfuscatedName("u.ck(Lfa;III)V")
    public static void method208(class174 arg0, int arg1, int arg2) {
        if (arg0.field2764 == 0) {
            arg0.field2849 = arg0.field2754;
        } else if (arg0.field2764 == 1) {
            arg0.field2849 = (arg1 - arg0.field2774) / 2 + arg0.field2754;
        } else if (arg0.field2764 == 2) {
            arg0.field2849 = arg1 - arg0.field2774 - arg0.field2754;
        } else if (arg0.field2764 == 3) {
            arg0.field2849 = arg0.field2754 * arg1 >> 14;
        } else if (arg0.field2764 == 4) {
            arg0.field2849 = (arg0.field2754 * arg1 >> 14) + (arg1 - arg0.field2774) / 2;
        } else {
            arg0.field2849 = arg1 - arg0.field2774 - (arg0.field2754 * arg1 >> 14);
        }
        if (arg0.field2850 == 0) {
            arg0.field2773 = arg0.field2769;
        } else if (arg0.field2850 == 1) {
            arg0.field2773 = (arg2 - arg0.field2775) / 2 + arg0.field2769;
        } else if (arg0.field2850 == 2) {
            arg0.field2773 = arg2 - arg0.field2775 - arg0.field2769;
        } else if (arg0.field2850 == 3) {
            arg0.field2773 = arg0.field2769 * arg2 >> 14;
        } else if (arg0.field2850 == 4) {
            arg0.field2773 = (arg0.field2769 * arg2 >> 14) + (arg2 - arg0.field2775) / 2;
        } else {
            arg0.field2773 = arg2 - arg0.field2775 - (arg0.field2769 * arg2 >> 14);
        }
        if (!field463 || arg0.field2825 != 0) {
            return;
        }
        if (arg0.field2849 < 0) {
            arg0.field2849 = 0;
        } else if (arg0.field2849 + arg0.field2774 > arg1) {
            arg0.field2849 = arg1 - arg0.field2774;
        }
        if (arg0.field2773 < 0) {
            arg0.field2773 = 0;
        } else if (arg0.field2775 + arg0.field2773 > arg2) {
            arg0.field2773 = arg2 - arg0.field2775;
        }
    }

    @ObfuscatedName("l.cf(Lfa;IIIIIII)V")
    public static final void method664(class174 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (field377) {
            field469 = 32;
        } else {
            field469 = 0;
        }
        field377 = false;
        if (class141.field2148 == 1 || !Statics.field144 && class141.field2148 == 4) {
            if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 && arg6 < arg2 + 16) {
                arg0.field2781 -= 4;
                method652(arg0);
            } else if (arg5 >= arg1 && arg5 < arg1 + 16 && arg6 >= arg2 + arg3 - 16 && arg6 < arg2 + arg3) {
                arg0.field2781 += 4;
                method652(arg0);
            } else if (arg5 >= arg1 - field469 && arg5 < field469 + arg1 + 16 && arg6 >= arg2 + 16 && arg6 < arg2 + arg3 - 16) {
                int var7 = (arg3 - 32) * arg3 / arg4;
                if (var7 < 8) {
                    var7 = 8;
                }
                int var8 = arg6 - arg2 - 16 - var7 / 2;
                int var9 = arg3 - 32 - var7;
                arg0.field2781 = (arg4 - arg3) * var8 / var9;
                method652(arg0);
                field377 = true;
            }
        }
        if (field572 == 0) {
            return;
        }
        int var10 = arg0.field2774;
        if (arg5 >= arg1 - var10 && arg6 >= arg2 && arg5 < arg1 + 16 && arg6 <= arg2 + arg3) {
            arg0.field2781 += field572 * 45;
            method652(arg0);
        }
    }

    @ObfuscatedName("ev.cx(Lfa;I)Z")
    public static final boolean method3043(class174 arg0) {
        if (arg0.field2872 == null) {
            return false;
        }
        for (int var1 = 0; var1 < arg0.field2872.length; var1++) {
            int var2 = method2405(arg0, var1);
            int var3 = arg0.field2771[var1];
            if (arg0.field2872[var1] == 2) {
                if (var2 >= var3) {
                    return false;
                }
            } else if (arg0.field2872[var1] == 3) {
                if (var2 <= var3) {
                    return false;
                }
            } else if (arg0.field2872[var1] == 4) {
                if (var2 == var3) {
                    return false;
                }
            } else if (var2 != var3) {
                return false;
            }
        }
        return true;
    }

    @ObfuscatedName("do.cw(Lfa;II)I")
    public static final int method2405(class174 arg0, int arg1) {
        if (arg0.field2871 == null || arg1 >= arg0.field2871.length) {
            return -2;
        }
        try {
            int[] var2 = arg0.field2871[arg1];
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
                    var7 = field430[var2[var4++]];
                }
                if (var6 == 2) {
                    var7 = field431[var2[var4++]];
                }
                if (var6 == 3) {
                    var7 = field480[var2[var4++]];
                }
                if (var6 == 4) {
                    int var9 = var2[var4++] << 16;
                    int var10 = var9 + var2[var4++];
                    class174 var11 = class174.method636(var10);
                    int var12 = var2[var4++];
                    if (var12 != -1 && (!class52.method176(var12).field1139 || field302)) {
                        for (int var13 = 0; var13 < var11.field2877.length; var13++) {
                            if (var12 + 1 == var11.field2877[var13]) {
                                var7 += var11.field2878[var13];
                            }
                        }
                    }
                }
                if (var6 == 5) {
                    var7 = class177.field2906[var2[var4++]];
                }
                if (var6 == 6) {
                    var7 = class156.field2291[field431[var2[var4++]] - 1];
                }
                if (var6 == 7) {
                    var7 = class177.field2906[var2[var4++]] * 100 / 46875;
                }
                if (var6 == 8) {
                    var7 = Statics.field94.field39;
                }
                if (var6 == 9) {
                    for (int var14 = 0; var14 < 25; var14++) {
                        if (class156.field2292[var14]) {
                            var7 += field431[var14];
                        }
                    }
                }
                if (var6 == 10) {
                    int var15 = var2[var4++] << 16;
                    int var16 = var15 + var2[var4++];
                    class174 var17 = class174.method636(var16);
                    int var18 = var2[var4++];
                    if (var18 != -1 && (!class52.method176(var18).field1139 || field302)) {
                        for (int var19 = 0; var19 < var17.field2877.length; var19++) {
                            if (var18 + 1 == var17.field2877[var19]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var6 == 11) {
                    var7 = field492;
                }
                if (var6 == 12) {
                    var7 = field459;
                }
                if (var6 == 13) {
                    int var20 = class177.field2906[var2[var4++]];
                    int var21 = var2[var4++];
                    var7 = (var20 & 0x1 << var21) == 0 ? 0 : 1;
                }
                if (var6 == 14) {
                    int var22 = var2[var4++];
                    var7 = class177.method2119(var22);
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
                    var7 = (Statics.field94.field845 >> 7) + Statics.field2205;
                }
                if (var6 == 19) {
                    var7 = (Statics.field94.field820 >> 7) + Statics.field68;
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

    @ObfuscatedName("di.ca(Lfa;III)V")
    public static final void method2244(class174 arg0, int arg1, int arg2) {
        if (arg0.field2762 == 1) {
            method666(arg0.field2876, "", 24, 0, 0, arg0.field2843);
        }
        if (arg0.field2762 == 2 && !field448) {
            String var3 = method2134(arg0);
            if (var3 != null) {
                method666(var3, class2.method2886(65280) + arg0.field2875, 25, 0, -1, arg0.field2843);
            }
        }
        if (arg0.field2762 == 3) {
            method666(class158.field2497, "", 26, 0, 0, arg0.field2843);
        }
        if (arg0.field2762 == 4) {
            method666(arg0.field2876, "", 28, 0, 0, arg0.field2843);
        }
        if (arg0.field2762 == 5) {
            method666(arg0.field2876, "", 29, 0, 0, arg0.field2843);
        }
        if (arg0.field2762 == 6 && field527 == null) {
            method666(arg0.field2876, "", 30, 0, -1, arg0.field2843);
        }
        if (arg0.field2825 == 2) {
            int var4 = 0;
            for (int var5 = 0; var5 < arg0.field2775; var5++) {
                for (int var6 = 0; var6 < arg0.field2774; var6++) {
                    int var7 = (arg0.field2759 + 32) * var6;
                    int var8 = (arg0.field2826 + 32) * var5;
                    if (var4 < 20) {
                        var7 += arg0.field2827[var4];
                        var8 += arg0.field2751[var4];
                    }
                    if (arg1 >= var7 && arg2 >= var8 && arg1 < var7 + 32 && arg2 < var8 + 32) {
                        field412 = var4;
                        Statics.field2151 = arg0;
                        if (arg0.field2877[var4] > 0) {
                            label282: {
                                class52 var9 = class52.method176(arg0.field2877[var4] - 1);
                                if (field449 == 1) {
                                    int var10 = method765(arg0);
                                    boolean var11 = (var10 >> 30 & 0x1) != 0;
                                    if (var11) {
                                        if (Statics.field932 != arg0.field2843 || Statics.field188 != var4) {
                                            method666(class158.field2449, field379 + " " + class2.field25 + " " + class2.method2886(16748608) + var9.field1126, 31, var9.field1124, var4, arg0.field2843);
                                        }
                                        break label282;
                                    }
                                }
                                if (field448) {
                                    int var12 = method765(arg0);
                                    boolean var13 = (var12 >> 30 & 0x1) != 0;
                                    if (var13) {
                                        if ((Statics.field2637 & 0x10) == 16) {
                                            method666(field298, field535 + " " + class2.field25 + " " + class2.method2886(16748608) + var9.field1126, 32, var9.field1124, var4, arg0.field2843);
                                        }
                                        break label282;
                                    }
                                }
                                String[] var14 = var9.field1141;
                                if (field464) {
                                    var14 = method2034(var14);
                                }
                                int var15 = method765(arg0);
                                boolean var16 = (var15 >> 30 & 0x1) != 0;
                                if (var16) {
                                    for (int var17 = 4; var17 >= 3; var17--) {
                                        if (var14 != null && var14[var17] != null) {
                                            byte var18;
                                            if (var17 == 3) {
                                                var18 = 36;
                                            } else {
                                                var18 = 37;
                                            }
                                            method666(var14[var17], class2.method2886(16748608) + var9.field1126, var18, var9.field1124, var4, arg0.field2843);
                                        } else if (var17 == 4) {
                                            method666(class158.field2303, class2.method2886(16748608) + var9.field1126, 37, var9.field1124, var4, arg0.field2843);
                                        }
                                    }
                                }
                                class179 var10000 = (class179) null;
                                if (class179.method2710(method765(arg0))) {
                                    method666(class158.field2449, class2.method2886(16748608) + var9.field1126, 38, var9.field1124, var4, arg0.field2843);
                                }
                                int var19 = method765(arg0);
                                boolean var20 = (var19 >> 30 & 0x1) != 0;
                                if (var20 && var14 != null) {
                                    for (int var21 = 2; var21 >= 0; var21--) {
                                        if (var14[var21] != null) {
                                            byte var22 = 0;
                                            if (var21 == 0) {
                                                var22 = 33;
                                            }
                                            if (var21 == 1) {
                                                var22 = 34;
                                            }
                                            if (var21 == 2) {
                                                var22 = 35;
                                            }
                                            method666(var14[var21], class2.method2886(16748608) + var9.field1126, var22, var9.field1124, var4, arg0.field2843);
                                        }
                                    }
                                }
                                String[] var23 = arg0.field2830;
                                if (field464) {
                                    var23 = method2034(var23);
                                }
                                if (var23 != null) {
                                    for (int var24 = 4; var24 >= 0; var24--) {
                                        if (var23[var24] != null) {
                                            byte var25 = 0;
                                            if (var24 == 0) {
                                                var25 = 39;
                                            }
                                            if (var24 == 1) {
                                                var25 = 40;
                                            }
                                            if (var24 == 2) {
                                                var25 = 41;
                                            }
                                            if (var24 == 3) {
                                                var25 = 42;
                                            }
                                            if (var24 == 4) {
                                                var25 = 43;
                                            }
                                            method666(var23[var24], class2.method2886(16748608) + var9.field1126, var25, var9.field1124, var4, arg0.field2843);
                                        }
                                    }
                                }
                                method666(class158.field2450, class2.method2886(16748608) + var9.field1126, 1005, var9.field1124, var4, arg0.field2843);
                            }
                        }
                    }
                    var4++;
                }
            }
        }
        if (!arg0.field2758) {
            return;
        }
        if (!field448) {
            for (int var26 = 9; var26 >= 5; var26--) {
                String var27 = method793(arg0, var26);
                if (var27 != null) {
                    method666(var27, arg0.field2832, 1007, var26 + 1, arg0.field2760, arg0.field2843);
                }
            }
            String var28 = method2134(arg0);
            if (var28 != null) {
                method666(var28, arg0.field2832, 25, 0, arg0.field2760, arg0.field2843);
            }
            for (int var29 = 4; var29 >= 0; var29--) {
                String var30 = method793(arg0, var29);
                if (var30 != null) {
                    method666(var30, arg0.field2832, 57, var29 + 1, arg0.field2760, arg0.field2843);
                }
            }
            int var31 = method765(arg0);
            boolean var32 = (var31 & 0x1) != 0;
            if (var32) {
                method666(class158.field2355, "", 30, 0, arg0.field2760, arg0.field2843);
            }
        } else if (class179.method2335(method765(arg0)) && (Statics.field2637 & 0x20) == 32) {
            method666(field298, field535 + " " + class2.field25 + " " + arg0.field2832, 58, 0, arg0.field2760, arg0.field2843);
        }
    }

    @ObfuscatedName("ci.cl([Lfa;IIIIIIIB)V")
    public static final void method2122(class174[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class174 var9 = arg0[var8];
            if (var9 != null && (!var9.field2758 || var9.field2825 == 0 || var9.field2839 || method765(var9) != 0 || field410 == var9 || var9.field2763 == 1338) && var9.field2778 == arg1 && (!var9.field2758 || !method3804(var9))) {
                int var10 = var9.field2849 + arg6;
                int var11 = var9.field2773 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field2825 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else if (var9.field2825 == 9) {
                    int var16 = var10;
                    int var17 = var11;
                    int var18 = var9.field2774 + var10;
                    int var19 = var9.field2775 + var11;
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
                    int var22 = var9.field2774 + var10;
                    int var23 = var9.field2775 + var11;
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var22 < arg4 ? var22 : arg4;
                    var15 = var23 < arg5 ? var23 : arg5;
                }
                if (field466 == var9) {
                    field474 = true;
                    field475 = var10;
                    field476 = var11;
                }
                if (!var9.field2758 || var12 < var14 && var13 < var15) {
                    int var24 = class141.field2152;
                    int var25 = class141.field2162;
                    if (class141.field2158 != 0) {
                        var24 = class141.field2161;
                        var25 = class141.field2160;
                    }
                    if (var9.field2763 == 1337) {
                        if (!field508 && !field434 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            if (field449 == 0 && !field448) {
                                method666(class158.field2563, "", 23, 0, var24 - var12, var25 - var13);
                            }
                            int var26 = -1;
                            int var27 = -1;
                            for (int var28 = 0; var28 < class106.field1852; var28++) {
                                int var29 = class106.field1853[var28];
                                int var30 = var29 & 0x7F;
                                int var31 = var29 >> 7 & 0x7F;
                                int var32 = var29 >> 29 & 0x3;
                                int var33 = var29 >> 14 & 0x7FFF;
                                if (var27 != var29) {
                                    var27 = var29;
                                    if (var32 == 2 && Statics.field718.method1909(Statics.field1003, var30, var31, var29) >= 0) {
                                        class41 var34 = class41.method2809(var33);
                                        if (var34.field926 != null) {
                                            var34 = var34.method872();
                                        }
                                        if (var34 == null) {
                                            continue;
                                        }
                                        if (field449 == 1) {
                                            method666(class158.field2449, field379 + " " + class2.field25 + " " + class2.method2886(65535) + var34.field934, 1, var29, var30, var31);
                                        } else if (!field448) {
                                            String[] var35 = var34.field951;
                                            if (field464) {
                                                var35 = method2034(var35);
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
                                                        method666(var35[var36], class2.method2886(65535) + var34.field934, var37, var29, var30, var31);
                                                    }
                                                }
                                            }
                                            method666(class158.field2450, class2.method2886(65535) + var34.field934, 1002, var34.field931 << 14, var30, var31);
                                        } else if ((Statics.field2637 & 0x4) == 4) {
                                            method666(field298, field535 + " " + class2.field25 + " " + class2.method2886(65535) + var34.field934, 2, var29, var30, var31);
                                        }
                                    }
                                    if (var32 == 1) {
                                        class35 var38 = field547[var33];
                                        if (var38 == null) {
                                            continue;
                                        }
                                        if (var38.field785.field888 == 1 && (var38.field845 & 0x7F) == 64 && (var38.field820 & 0x7F) == 64) {
                                            for (int var39 = 0; var39 < field344; var39++) {
                                                class35 var40 = field547[field336[var39]];
                                                if (var40 != null && var38 != var40 && var40.field785.field888 == 1 && var38.field845 == var40.field845 && var38.field820 == var40.field820) {
                                                    method2770(var40.field785, field336[var39], var30, var31);
                                                }
                                            }
                                            int var41 = class33.field772;
                                            int[] var42 = class33.field763;
                                            for (int var43 = 0; var43 < var41; var43++) {
                                                class3 var44 = field551[var42[var43]];
                                                if (var44 != null && var38.field845 == var44.field845 && var38.field820 == var44.field820) {
                                                    method3567(var44, var42[var43], var30, var31);
                                                }
                                            }
                                        }
                                        method2770(var38.field785, var33, var30, var31);
                                    }
                                    if (var32 == 0) {
                                        class3 var45 = field551[var33];
                                        if (var45 == null) {
                                            continue;
                                        }
                                        if ((var45.field845 & 0x7F) == 64 && (var45.field820 & 0x7F) == 64) {
                                            for (int var46 = 0; var46 < field344; var46++) {
                                                class35 var47 = field547[field336[var46]];
                                                if (var47 != null && var47.field785.field888 == 1 && var45.field845 == var47.field845 && var45.field820 == var47.field820) {
                                                    method2770(var47.field785, field336[var46], var30, var31);
                                                }
                                            }
                                            int var48 = class33.field772;
                                            int[] var49 = class33.field763;
                                            for (int var50 = 0; var50 < var48; var50++) {
                                                class3 var51 = field551[var49[var50]];
                                                if (var51 != null && var45 != var51 && var45.field845 == var51.field845 && var45.field820 == var51.field820) {
                                                    method3567(var51, var49[var50], var30, var31);
                                                }
                                            }
                                        }
                                        if (field425 == var33) {
                                            var26 = var29;
                                        } else {
                                            method3567(var45, var33, var30, var31);
                                        }
                                    }
                                    if (var32 == 3) {
                                        class200 var52 = field426[Statics.field1003][var30][var31];
                                        if (var52 != null) {
                                            for (class29 var53 = (class29) var52.method3645(); var53 != null; var53 = (class29) var52.method3658()) {
                                                class52 var54 = class52.method176(var53.field692);
                                                if (field449 == 1) {
                                                    method666(class158.field2449, field379 + " " + class2.field25 + " " + class2.method2886(16748608) + var54.field1126, 16, var53.field692, var30, var31);
                                                } else if (!field448) {
                                                    String[] var55 = var54.field1140;
                                                    if (field464) {
                                                        var55 = method2034(var55);
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
                                                            method666(var55[var56], class2.method2886(16748608) + var54.field1126, var57, var53.field692, var30, var31);
                                                        } else if (var56 == 2) {
                                                            method666(class158.field2509, class2.method2886(16748608) + var54.field1126, 20, var53.field692, var30, var31);
                                                        }
                                                    }
                                                    method666(class158.field2450, class2.method2886(16748608) + var54.field1126, 1004, var53.field692, var30, var31);
                                                } else if ((Statics.field2637 & 0x1) == 1) {
                                                    method666(field298, field535 + " " + class2.field25 + " " + class2.method2886(16748608) + var54.field1126, 17, var53.field692, var30, var31);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var26 != -1) {
                                int var58 = var26 & 0x7F;
                                int var59 = var26 >> 7 & 0x7F;
                                class3 var60 = field551[field425];
                                method3567(var60, field425, var58, var59);
                            }
                        }
                    } else if (var9.field2763 == 1338) {
                        method3035(var9, var10, var11);
                    } else {
                        if (!field434 && var24 >= var12 && var25 >= var13 && var24 < var14 && var25 < var15) {
                            method2244(var9, var24 - var10, var25 - var11);
                        }
                        if (var9.field2825 == 0) {
                            if (!var9.field2758 && method3804(var9) && Statics.field1033 != var9) {
                                continue;
                            }
                            method2122(arg0, var9.field2843, var12, var13, var14, var15, var10 - var9.field2880, var11 - var9.field2781);
                            if (var9.field2868 != null) {
                                method2122(var9.field2868, var9.field2843, var12, var13, var14, var15, var10 - var9.field2880, var11 - var9.field2781);
                            }
                            class4 var61 = (class4) field454.method3607((long) var9.field2843);
                            if (var61 != null) {
                                if (var61.field73 == 0 && class141.field2152 >= var12 && class141.field2162 >= var13 && class141.field2152 < var14 && class141.field2162 < var15 && !field434 && !field463) {
                                    for (class1 var62 = (class1) field493.method3665(); var62 != null; var62 = (class1) field493.method3641()) {
                                        if (var62.field9) {
                                            var62.method3737();
                                            var62.field3.field2884 = false;
                                        }
                                    }
                                    if (Statics.field185 == 0) {
                                        field466 = null;
                                        field410 = null;
                                    }
                                    if (!field434) {
                                        field440[0] = class158.field2538;
                                        field441[0] = "";
                                        field438[0] = 1006;
                                        field435 = 1;
                                    }
                                }
                                int var63 = var61.field71;
                                if (class174.method159(var63)) {
                                    method2122(Statics.field2887[var63], -1, var12, var13, var14, var15, var10, var11);
                                }
                            }
                        }
                        if (var9.field2758) {
                            if (var9.field2892) {
                                if (class141.field2152 >= var12 && class141.field2162 >= var13 && class141.field2152 < var14 && class141.field2162 < var15) {
                                    for (class1 var64 = (class1) field493.method3665(); var64 != null; var64 = (class1) field493.method3641()) {
                                        if (var64.field9) {
                                            var64.method3737();
                                            var64.field3.field2884 = false;
                                        }
                                    }
                                    if (Statics.field185 == 0) {
                                        field466 = null;
                                        field410 = null;
                                    }
                                    if (!field434) {
                                        field440[0] = class158.field2538;
                                        field441[0] = "";
                                        field438[0] = 1006;
                                        field435 = 1;
                                    }
                                }
                            } else if (var9.field2893 && class141.field2152 >= var12 && class141.field2162 >= var13 && class141.field2152 < var14 && class141.field2162 < var15) {
                                for (class1 var65 = (class1) field493.method3665(); var65 != null; var65 = (class1) field493.method3641()) {
                                    if (var65.field9 && var65.field3.field2860 == var65.field5) {
                                        var65.method3737();
                                    }
                                }
                            }
                            boolean var66;
                            if (class141.field2152 >= var12 && class141.field2162 >= var13 && class141.field2152 < var14 && class141.field2162 < var15) {
                                var66 = true;
                            } else {
                                var66 = false;
                            }
                            boolean var67 = false;
                            if ((class141.field2148 == 1 || !Statics.field144 && class141.field2148 == 4) && var66) {
                                var67 = true;
                            }
                            boolean var68 = false;
                            if ((class141.field2158 == 1 || !Statics.field144 && class141.field2158 == 4) && class141.field2161 >= var12 && class141.field2160 >= var13 && class141.field2161 < var14 && class141.field2160 < var15) {
                                var68 = true;
                            }
                            if (var68) {
                                method1089(var9, class141.field2161 - var10, class141.field2160 - var11);
                            }
                            if (field466 != null && field466 != var9 && var66 && class179.method812(method765(var9))) {
                                field470 = var9;
                            }
                            if (field410 == var9) {
                                field499 = true;
                                field451 = var10;
                                field473 = var11;
                            }
                            if (var9.field2839) {
                                if (var66 && field572 != 0 && var9.field2860 != null) {
                                    class1 var69 = new class1();
                                    var69.field9 = true;
                                    var69.field3 = var9;
                                    var69.field17 = field572;
                                    var69.field5 = var9.field2860;
                                    field493.method3639(var69);
                                }
                                if (field466 != null || Statics.field66 != null || field434) {
                                    var68 = false;
                                    var67 = false;
                                    var66 = false;
                                }
                                if (!var9.field2885 && var68) {
                                    var9.field2885 = true;
                                    if (var9.field2841 != null) {
                                        class1 var70 = new class1();
                                        var70.field9 = true;
                                        var70.field3 = var9;
                                        var70.field4 = class141.field2161 - var10;
                                        var70.field17 = class141.field2160 - var11;
                                        var70.field5 = var9.field2841;
                                        field493.method3639(var70);
                                    }
                                }
                                if (var9.field2885 && var67 && var9.field2800 != null) {
                                    class1 var71 = new class1();
                                    var71.field9 = true;
                                    var71.field3 = var9;
                                    var71.field4 = class141.field2152 - var10;
                                    var71.field17 = class141.field2162 - var11;
                                    var71.field5 = var9.field2800;
                                    field493.method3639(var71);
                                }
                                if (var9.field2885 && !var67) {
                                    var9.field2885 = false;
                                    if (var9.field2750 != null) {
                                        class1 var72 = new class1();
                                        var72.field9 = true;
                                        var72.field3 = var9;
                                        var72.field4 = class141.field2152 - var10;
                                        var72.field17 = class141.field2162 - var11;
                                        var72.field5 = var9.field2750;
                                        field495.method3639(var72);
                                    }
                                }
                                if (var67 && var9.field2844 != null) {
                                    class1 var73 = new class1();
                                    var73.field9 = true;
                                    var73.field3 = var9;
                                    var73.field4 = class141.field2152 - var10;
                                    var73.field17 = class141.field2162 - var11;
                                    var73.field5 = var9.field2844;
                                    field493.method3639(var73);
                                }
                                if (!var9.field2884 && var66) {
                                    var9.field2884 = true;
                                    if (var9.field2845 != null) {
                                        class1 var74 = new class1();
                                        var74.field9 = true;
                                        var74.field3 = var9;
                                        var74.field4 = class141.field2152 - var10;
                                        var74.field17 = class141.field2162 - var11;
                                        var74.field5 = var9.field2845;
                                        field493.method3639(var74);
                                    }
                                }
                                if (var9.field2884 && var66 && var9.field2790 != null) {
                                    class1 var75 = new class1();
                                    var75.field9 = true;
                                    var75.field3 = var9;
                                    var75.field4 = class141.field2152 - var10;
                                    var75.field17 = class141.field2162 - var11;
                                    var75.field5 = var9.field2790;
                                    field493.method3639(var75);
                                }
                                if (var9.field2884 && !var66) {
                                    var9.field2884 = false;
                                    if (var9.field2847 != null) {
                                        class1 var76 = new class1();
                                        var76.field9 = true;
                                        var76.field3 = var9;
                                        var76.field4 = class141.field2152 - var10;
                                        var76.field17 = class141.field2162 - var11;
                                        var76.field5 = var9.field2847;
                                        field495.method3639(var76);
                                    }
                                }
                                if (var9.field2858 != null) {
                                    class1 var77 = new class1();
                                    var77.field3 = var9;
                                    var77.field5 = var9.field2858;
                                    field494.method3639(var77);
                                }
                                if (var9.field2852 != null && field481 > var9.field2782) {
                                    if (var9.field2853 == null || field481 - var9.field2782 > 32) {
                                        class1 var82 = new class1();
                                        var82.field3 = var9;
                                        var82.field5 = var9.field2852;
                                        field493.method3639(var82);
                                    } else {
                                        label766: for (int var78 = var9.field2782; var78 < field481; var78++) {
                                            int var79 = field490[var78 & 0x1F];
                                            for (int var80 = 0; var80 < var9.field2853.length; var80++) {
                                                if (var9.field2853[var80] == var79) {
                                                    class1 var81 = new class1();
                                                    var81.field3 = var9;
                                                    var81.field5 = var9.field2852;
                                                    field493.method3639(var81);
                                                    break label766;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2782 = field481;
                                }
                                if (var9.field2768 != null && field483 > var9.field2888) {
                                    if (var9.field2855 == null || field483 - var9.field2888 > 32) {
                                        class1 var87 = new class1();
                                        var87.field3 = var9;
                                        var87.field5 = var9.field2768;
                                        field493.method3639(var87);
                                    } else {
                                        label742: for (int var83 = var9.field2888; var83 < field483; var83++) {
                                            int var84 = field482[var83 & 0x1F];
                                            for (int var85 = 0; var85 < var9.field2855.length; var85++) {
                                                if (var9.field2855[var85] == var84) {
                                                    class1 var86 = new class1();
                                                    var86.field3 = var9;
                                                    var86.field5 = var9.field2768;
                                                    field493.method3639(var86);
                                                    break label742;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2888 = field483;
                                }
                                if (var9.field2856 != null && field485 > var9.field2889) {
                                    if (var9.field2883 == null || field485 - var9.field2889 > 32) {
                                        class1 var92 = new class1();
                                        var92.field3 = var9;
                                        var92.field5 = var9.field2856;
                                        field493.method3639(var92);
                                    } else {
                                        label718: for (int var88 = var9.field2889; var88 < field485; var88++) {
                                            int var89 = field484[var88 & 0x1F];
                                            for (int var90 = 0; var90 < var9.field2883.length; var90++) {
                                                if (var9.field2883[var90] == var89) {
                                                    class1 var91 = new class1();
                                                    var91.field3 = var9;
                                                    var91.field5 = var9.field2856;
                                                    field493.method3639(var91);
                                                    break label718;
                                                }
                                            }
                                        }
                                    }
                                    var9.field2889 = field485;
                                }
                                if (field304 > var9.field2886 && var9.field2861 != null) {
                                    class1 var93 = new class1();
                                    var93.field3 = var9;
                                    var93.field5 = var9.field2861;
                                    field493.method3639(var93);
                                }
                                if (field487 > var9.field2886 && var9.field2863 != null) {
                                    class1 var94 = new class1();
                                    var94.field3 = var9;
                                    var94.field5 = var9.field2863;
                                    field493.method3639(var94);
                                }
                                if (field488 > var9.field2886 && var9.field2864 != null) {
                                    class1 var95 = new class1();
                                    var95.field3 = var9;
                                    var95.field5 = var9.field2864;
                                    field493.method3639(var95);
                                }
                                if (field406 > var9.field2886 && var9.field2869 != null) {
                                    class1 var96 = new class1();
                                    var96.field3 = var9;
                                    var96.field5 = var9.field2869;
                                    field493.method3639(var96);
                                }
                                if (field366 > var9.field2886 && var9.field2859 != null) {
                                    class1 var97 = new class1();
                                    var97.field3 = var9;
                                    var97.field5 = var9.field2859;
                                    field493.method3639(var97);
                                }
                                if (field343 > var9.field2886 && var9.field2787 != null) {
                                    class1 var98 = new class1();
                                    var98.field3 = var9;
                                    var98.field5 = var9.field2787;
                                    field493.method3639(var98);
                                }
                                var9.field2886 = field478;
                                if (var9.field2862 != null) {
                                    for (int var99 = 0; var99 < field518; var99++) {
                                        class1 var100 = new class1();
                                        var100.field3 = var9;
                                        var100.field15 = field520[var99];
                                        var100.field2 = field519[var99];
                                        var100.field5 = var9.field2862;
                                        field493.method3639(var100);
                                    }
                                }
                            }
                        }
                        if (!var9.field2758 && field466 == null && Statics.field66 == null && !field434) {
                            if ((var9.field2874 >= 0 || var9.field2786 != 0) && class141.field2152 >= var12 && class141.field2162 >= var13 && class141.field2152 < var14 && class141.field2162 < var15) {
                                if (var9.field2874 >= 0) {
                                    Statics.field1033 = arg0[var9.field2874];
                                } else {
                                    Statics.field1033 = var9;
                                }
                            }
                            if (var9.field2825 == 8 && class141.field2152 >= var12 && class141.field2162 >= var13 && class141.field2152 < var14 && class141.field2162 < var15) {
                                Statics.field1202 = var9;
                            }
                            if (var9.field2766 > var9.field2775) {
                                method664(var9, var9.field2774 + var10, var11, var9.field2775, var9.field2766, class141.field2152, class141.field2162);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("db.di(IIB)V")
    public static final void method2753(int arg0, int arg1) {
        if (class174.method159(arg0)) {
            method2239(Statics.field2887[arg0], arg1);
        }
    }

    @ObfuscatedName("cl.dr([Lfa;II)V")
    public static final void method2239(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null) {
                if (var3.field2825 == 0) {
                    if (var3.field2868 != null) {
                        method2239(var3.field2868, arg1);
                    }
                    class4 var4 = (class4) field454.method3607((long) var3.field2843);
                    if (var4 != null) {
                        method2753(var4.field71, arg1);
                    }
                }
                if (arg1 == 0 && var3.field2866 != null) {
                    class1 var5 = new class1();
                    var5.field3 = var3;
                    var5.field5 = var3.field2866;
                    class37.method3232(var5, 200000);
                }
                if (arg1 == 1 && var3.field2867 != null) {
                    if (var3.field2760 >= 0) {
                        class174 var6 = class174.method636(var3.field2843);
                        if (var6 == null || var6.field2868 == null || var3.field2760 >= var6.field2868.length || var6.field2868[var3.field2760] != var3) {
                            continue;
                        }
                    }
                    class1 var7 = new class1();
                    var7.field3 = var3;
                    var7.field5 = var3.field2867;
                    class37.method3232(var7, 200000);
                }
            }
        }
    }

    @ObfuscatedName("aa.dg(Lfa;III)V")
    public static final void method1089(class174 arg0, int arg1, int arg2) {
        if (field466 != null || field434 || arg0 == null) {
            return;
        }
        class174 var3 = method53(arg0);
        if (var3 == null) {
            var3 = arg0.field2789;
        }
        if (var3 == null) {
            return;
        }
        field466 = arg0;
        class174 var5 = method53(arg0);
        if (var5 == null) {
            var5 = arg0.field2789;
        }
        field410 = var5;
        field465 = arg1;
        field486 = arg2;
        Statics.field185 = 0;
        field477 = false;
        if (field435 > 0) {
            method209(field435 - 1);
        }
        return;
    }

    @ObfuscatedName("ei.dc(I)V")
    public static final void method2814() {
        method652(field466);
        Statics.field185++;
        if (field474 && field499) {
            int var0 = class141.field2152;
            int var1 = class141.field2162;
            int var2 = var0 - field465;
            int var3 = var1 - field486;
            if (var2 < field451) {
                var2 = field451;
            }
            if (field466.field2774 + var2 > field451 + field410.field2774) {
                var2 = field451 + field410.field2774 - field466.field2774;
            }
            if (var3 < field473) {
                var3 = field473;
            }
            if (field466.field2775 + var3 > field473 + field410.field2775) {
                var3 = field473 + field410.field2775 - field466.field2775;
            }
            int var4 = var2 - field475;
            int var5 = var3 - field476;
            int var6 = field466.field2757;
            if (Statics.field185 > field466.field2836 && (var4 > var6 || var4 < -var6 || var5 > var6 || var5 < -var6)) {
                field477 = true;
            }
            int var7 = field410.field2880 + (var2 - field451);
            int var8 = field410.field2781 + (var3 - field473);
            if (field466.field2848 != null && field477) {
                class1 var9 = new class1();
                var9.field3 = field466;
                var9.field4 = var7;
                var9.field17 = var8;
                var9.field5 = field466.field2848;
                class37.method3232(var9, 200000);
            }
            if (class141.field2148 == 0) {
                if (field477) {
                    if (field466.field2838 != null) {
                        class1 var10 = new class1();
                        var10.field3 = field466;
                        var10.field4 = var7;
                        var10.field17 = var8;
                        var10.field7 = field470;
                        var10.field5 = field466.field2838;
                        class37.method3232(var10, 200000);
                    }
                    if (field470 != null && method53(field466) != null) {
                        field339.method2722(53);
                        field339.method2494(field466.field2879);
                        field339.method2448(field470.field2760);
                        field339.method2502(field470.field2843);
                        field339.method2502(field466.field2843);
                        field339.method2594(field470.field2879);
                        field339.method2494(field466.field2760);
                    }
                } else if ((field433 == 1 || method215(field435 - 1)) && field435 > 2) {
                    Statics.method169(field475 + field465, field486 + field476);
                } else if (field435 > 0) {
                    method114(field475 + field465, field486 + field476);
                }
                field466 = null;
            }
        } else if (Statics.field185 > 1) {
            field466 = null;
        }
    }

    @ObfuscatedName("u.de(IB)V")
    public static void method209(int arg0) {
        Statics.field2973 = new class31();
        Statics.field2973.field713 = field436[arg0];
        Statics.field2973.field712 = field526[arg0];
        Statics.field2973.field722 = field438[arg0];
        Statics.field2973.field721 = field501[arg0];
        Statics.field2973.field715 = field440[arg0];
    }

    @ObfuscatedName("k.dm(III)V")
    public static void method114(int arg0, int arg1) {
        method1877(Statics.field2973, arg0, arg1);
        Statics.field2973 = null;
    }

    @ObfuscatedName("l.dj(Lfa;I)V")
    public static void method652(class174 arg0) {
        if (field452 == arg0.field2891) {
            field324[arg0.field2890] = true;
        }
    }

    @ObfuscatedName("ab.dn(B)V")
    public static void method849() {
        for (class4 var0 = (class4) field454.method3610(); var0 != null; var0 = (class4) field454.method3606()) {
            int var1 = var0.field71;
            if (class174.method159(var1)) {
                boolean var2 = true;
                class174[] var3 = Statics.field2887[var1];
                for (int var4 = 0; var4 < var3.length; var4++) {
                    if (var3[var4] != null) {
                        var2 = var3[var4].field2758;
                        break;
                    }
                }
                if (!var2) {
                    int var5 = (int) var0.field3126;
                    class174 var6 = class174.method636(var5);
                    if (var6 != null) {
                        method652(var6);
                    }
                }
            }
        }
    }

    @ObfuscatedName("cj.df([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method2034(String[] arg0) {
        String[] var1 = new String[5];
        for (int var2 = 0; var2 < 5; var2++) {
            var1[var2] = var2 + ": ";
            if (arg0 != null && arg0[var2] != null) {
                var1[var2] = var1[var2] + arg0[var2];
            }
        }
        return var1;
    }

    @ObfuscatedName("ak.dh(IB)V")
    public static final void method1057(int arg0) {
        if (!class174.method159(arg0)) {
            return;
        }
        class174[] var1 = Statics.field2887[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class174 var3 = var1[var2];
            if (var3 != null) {
                var3.field2772 = 0;
                var3.field2857 = 0;
            }
        }
    }

    @ObfuscatedName("ew.dk(II)V")
    public static final void method3039(int arg0) {
        if (class174.method159(arg0)) {
            method3037(Statics.field2887[arg0], -1);
        }
    }

    @ObfuscatedName("ew.dp([Lfa;II)V")
    public static final void method3037(class174[] arg0, int arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class174 var3 = arg0[var2];
            if (var3 != null && var3.field2778 == arg1 && (!var3.field2758 || !method3804(var3))) {
                if (var3.field2825 == 0) {
                    if (!var3.field2758 && method3804(var3) && Statics.field1033 != var3) {
                        continue;
                    }
                    method3037(arg0, var3.field2843);
                    if (var3.field2868 != null) {
                        method3037(var3.field2868, var3.field2843);
                    }
                    class4 var4 = (class4) field454.method3607((long) var3.field2843);
                    if (var4 != null) {
                        method3039(var4.field71);
                    }
                }
                if (var3.field2825 == 6) {
                    if (var3.field2806 != -1 || var3.field2835 != -1) {
                        boolean var5 = method3043(var3);
                        int var6;
                        if (var5) {
                            var6 = var3.field2835;
                        } else {
                            var6 = var3.field2806;
                        }
                        if (var6 != -1) {
                            class43 var7 = class43.method2137(var6);
                            var3.field2857 += field428;
                            while (var3.field2857 > var7.field996[var3.field2772]) {
                                var3.field2857 -= var7.field996[var3.field2772];
                                var3.field2772++;
                                if (var3.field2772 >= var7.field990.length) {
                                    var3.field2772 -= var7.field999;
                                    if (var3.field2772 < 0 || var3.field2772 >= var7.field990.length) {
                                        var3.field2772 = 0;
                                    }
                                }
                                method652(var3);
                            }
                        }
                    }
                    if (var3.field2780 != 0 && !var3.field2758) {
                        int var8 = var3.field2780 >> 16;
                        int var9 = var3.field2780 << 16 >> 16;
                        int var10 = field428 * var8;
                        int var11 = field428 * var9;
                        var3.field2801 = var3.field2801 + var10 & 0x7FF;
                        var3.field2811 = var3.field2811 + var11 & 0x7FF;
                        method652(var3);
                    }
                }
            }
        }
    }

    @ObfuscatedName("a.do(IB)V")
    public static final void method3(int arg0) {
        method849();
        class24.method6();
        int var1 = class53.method987(arg0).field1172;
        if (var1 == 0) {
            return;
        }
        int var2 = class177.field2906[arg0];
        if (var1 == 1) {
            if (var2 == 1) {
                class92.method2045(0.9D);
                ((class96) Statics.field1576).method2129(0.9D);
            }
            if (var2 == 2) {
                class92.method2045(0.8D);
                ((class96) Statics.field1576).method2129(0.8D);
            }
            if (var2 == 3) {
                class92.method2045(0.7D);
                ((class96) Statics.field1576).method2129(0.7D);
            }
            if (var2 == 4) {
                class92.method2045(0.6D);
                ((class96) Statics.field1576).method2129(0.6D);
            }
            class52.field1147.method3582();
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
            if (field532 != var3) {
                if (field532 == 0 && field533 != -1) {
                    class184.method2976(Statics.field885, field533, 0, var3, false);
                    field300 = false;
                } else if (var3 == 0) {
                    class184.method161();
                    field300 = false;
                } else {
                    class184.method1601(var3);
                }
                field532 = var3;
            }
        }
        if (var1 == 4) {
            if (var2 == 0) {
                field467 = 127;
            }
            if (var2 == 1) {
                field467 = 96;
            }
            if (var2 == 2) {
                field467 = 64;
            }
            if (var2 == 3) {
                field467 = 32;
            }
            if (var2 == 4) {
                field467 = 0;
            }
        }
        if (var1 == 5) {
            field433 = var2;
        }
        if (var1 == 6) {
            field455 = var2;
        }
        if (var1 == 9) {
            field456 = var2;
        }
        if (var1 == 10) {
            if (var2 == 0) {
                field515 = 127;
            }
            if (var2 == 1) {
                field515 = 96;
            }
            if (var2 == 2) {
                field515 = 64;
            }
            if (var2 == 3) {
                field515 = 32;
            }
            if (var2 == 4) {
                field515 = 0;
            }
        }
        if (var1 == 17) {
            field461 = var2 & 0xFFFF;
        }
        if (var1 == 18) {
            field323 = (class21) class110.method2766(class21.method822(), var2);
            if (field323 == null) {
                field323 = class21.field588;
            }
        }
        if (var1 == 19) {
            if (var2 == -1) {
                field425 = -1;
            } else {
                field425 = var2 & 0x7FF;
            }
        }
        if (var1 == 22) {
            field509 = (class21) class110.method2766(class21.method822(), var2);
            if (field509 == null) {
                field509 = class21.field588;
            }
        }
    }

    @ObfuscatedName("ez.dw(I)V")
    public static final void method2882() {
        field339.method2722(157);
        for (class4 var0 = (class4) field454.method3610(); var0 != null; var0 = (class4) field454.method3606()) {
            if (var0.field73 == 0 || var0.field73 == 3) {
                method766(var0, true);
            }
        }
        if (field527 != null) {
            method652(field527);
            field527 = null;
        }
    }

    @ObfuscatedName("er.dy(IIIB)Lc;")
    public static final class4 method2879(int arg0, int arg1, int arg2) {
        class4 var3 = new class4();
        var3.field71 = arg1;
        var3.field73 = arg2;
        field454.method3614(var3, (long) arg0);
        method1057(arg1);
        class174 var4 = class174.method636(arg0);
        method652(var4);
        if (field527 != null) {
            method652(field527);
            field527 = null;
        }
        method81();
        method197(Statics.field2887[arg0 >> 16], var4, false);
        class37.method3810(arg1);
        if (field453 != -1) {
            method2753(field453, 1);
        }
        return var3;
    }

    @ObfuscatedName("al.dx(Lc;ZI)V")
    public static final void method766(class4 arg0, boolean arg1) {
        int var2 = arg0.field71;
        int var3 = (int) arg0.field3126;
        arg0.method3737();
        if (arg1 && var2 != -1 && Statics.field2643[var2]) {
            Statics.field2803.method3201(var2);
            if (Statics.field2887[var2] != null) {
                boolean var4 = true;
                for (int var5 = 0; var5 < Statics.field2887[var2].length; var5++) {
                    if (Statics.field2887[var2][var5] != null) {
                        if (Statics.field2887[var2][var5].field2825 == 2) {
                            var4 = false;
                        } else {
                            Statics.field2887[var2][var5] = null;
                        }
                    }
                }
                if (var4) {
                    Statics.field2887[var2] = null;
                }
                Statics.field2643[var2] = false;
            }
        }
        method3568(var2);
        class174 var6 = class174.method636(var3);
        if (var6 != null) {
            method652(var6);
        }
        method81();
        if (field453 != -1) {
            method2753(field453, 1);
        }
    }

    @ObfuscatedName("el.dv(Lfa;B)Z")
    public static final boolean method3049(class174 arg0) {
        int var1 = arg0.field2763;
        if (var1 == 205) {
            field402 = 250;
            return true;
        }
        if (var1 >= 300 && var1 <= 313) {
            int var2 = (var1 - 300) / 2;
            int var3 = var1 & 0x1;
            field568.method3363(var2, var3 == 1);
        }
        if (var1 >= 314 && var1 <= 323) {
            int var4 = (var1 - 314) / 2;
            int var5 = var1 & 0x1;
            field568.method3340(var4, var5 == 1);
        }
        if (var1 == 324) {
            field568.method3348(false);
        }
        if (var1 == 325) {
            field568.method3348(true);
        }
        if (var1 == 326) {
            field339.method2722(35);
            field568.method3342(field339);
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("cy.ds(Lfa;IIII)V")
    public static final void method2038(class174 arg0, int arg1, int arg2, int arg3) {
        class176 var4 = arg0.method3266(false);
        if (var4 == null) {
            return;
        }
        if (field531 < 3) {
            Statics.field1540.method1697(arg1, arg2, var4.field2902, var4.field2901, 25, 25, field380, 256, var4.field2903, var4.field2900);
        } else {
            class80.method1796(arg1, arg2, 0, var4.field2903, var4.field2900);
        }
    }

    @ObfuscatedName("hw.dl(IIIILcd;Lfz;I)V")
    public static final void method3746(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        int var6 = arg2 * arg2 + arg3 * arg3;
        if (var6 <= 4225 || var6 >= 90000) {
            method2126(arg0, arg1, arg2, arg3, arg4, arg5);
            return;
        }
        int var7 = field444 + field380 & 0x7FF;
        int var8 = class92.field1594[var7];
        int var9 = class92.field1595[var7];
        int var10 = var8 * 256 / (field369 + 256);
        int var11 = var9 * 256 / (field369 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        double var14 = Math.atan2((double) var12, (double) var13);
        int var16 = (int) (Math.sin(var14) * 63.0D);
        int var17 = (int) (Math.cos(var14) * 57.0D);
        Statics.field269.method1698(arg0 + 94 + var16 + 4 - 10, arg1 + 83 - var17 - 20, 20, 20, 15, 15, var14, 256);
    }

    @ObfuscatedName("co.dz(IIIILcd;Lfz;B)V")
    public static final void method2126(int arg0, int arg1, int arg2, int arg3, class79 arg4, class176 arg5) {
        if (arg4 == null) {
            return;
        }
        int var6 = field444 + field380 & 0x7FF;
        int var7 = arg2 * arg2 + arg3 * arg3;
        if (var7 > 6400) {
            return;
        }
        int var8 = class92.field1594[var6];
        int var9 = class92.field1595[var6];
        int var10 = var8 * 256 / (field369 + 256);
        int var11 = var9 * 256 / (field369 + 256);
        int var12 = arg2 * var11 + arg3 * var10 >> 16;
        int var13 = arg3 * var11 - arg2 * var10 >> 16;
        if (var7 > 2500) {
            arg4.method1696(arg5.field2902 / 2 + var12 - arg4.field1406 / 2, arg5.field2901 / 2 - var13 - arg4.field1408 / 2, arg0, arg1, arg5.field2902, arg5.field2901, arg5.field2903, arg5.field2900);
        } else {
            arg4.method1686(arg5.field2902 / 2 + arg0 + var12 - arg4.field1406 / 2, arg5.field2901 / 2 + arg1 - var13 - arg4.field1408 / 2);
        }
    }

    @ObfuscatedName("au.db(Ljava/lang/String;ZI)Z")
    public static boolean method926(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        }
        String var2 = class165.method667(arg0, Statics.field552);
        for (int var3 = 0; var3 < field562; var3++) {
            if (var2.equalsIgnoreCase(class165.method667(field564[var3].field262, Statics.field552)) && (!arg1 || field564[var3].field257 != 0)) {
                return true;
            }
        }
        if (var2.equalsIgnoreCase(class165.method667(Statics.field94.field59, Statics.field552))) {
            return true;
        } else {
            return false;
        }
    }

    @ObfuscatedName("an.dd(Ljava/lang/String;I)Z")
    public static boolean method789(String arg0) {
        if (arg0 == null) {
            return false;
        }
        String var1 = class165.method667(arg0, Statics.field552);
        for (int var2 = 0; var2 < field398; var2++) {
            class8 var3 = field396[var2];
            if (var1.equalsIgnoreCase(class165.method667(var3.field141, Statics.field552))) {
                return true;
            }
            if (var1.equalsIgnoreCase(class165.method667(var3.field138, Statics.field552))) {
                return true;
            }
        }
        return false;
    }

    @ObfuscatedName("t.du(Ljava/lang/String;I)V")
    public static final void method195(String arg0) {
        if (arg0 == null) {
            return;
        }
        if (!(field562 < 200 || field418 == 1) || field562 >= 400) {
            class12.method2783(30, "", class158.field2465);
            return;
        }
        String var1 = class165.method667(arg0, Statics.field552);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field562; var2++) {
            class18 var3 = field564[var2];
            String var4 = class165.method667(var3.field262, Statics.field552);
            if (var4 != null && var4.equals(var1)) {
                class12.method2783(30, "", arg0 + class158.field2466);
                return;
            }
            if (var3.field263 != null) {
                String var5 = class165.method667(var3.field263, Statics.field552);
                if (var5 != null && var5.equals(var1)) {
                    class12.method2783(30, "", arg0 + class158.field2466);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < field398; var6++) {
            class8 var7 = field396[var6];
            String var8 = class165.method667(var7.field141, Statics.field552);
            if (var8 != null && var8.equals(var1)) {
                class12.method2783(30, "", class158.field2471 + arg0 + class158.field2315);
                return;
            }
            if (var7.field138 != null) {
                String var9 = class165.method667(var7.field138, Statics.field552);
                if (var9 != null && var9.equals(var1)) {
                    class12.method2783(30, "", class158.field2471 + arg0 + class158.field2315);
                    return;
                }
            }
        }
        if (class165.method667(Statics.field94.field59, Statics.field552).equals(var1)) {
            class12.method2783(30, "", class158.field2469);
        } else {
            field339.method2722(41);
            field339.method2452(class120.method2241(arg0));
            field339.method2543(arg0);
        }
    }

    @ObfuscatedName("dc.dq(Ljava/lang/String;ZI)V")
    public static final void method2338(String arg0, boolean arg1) {
        if (arg0 == null) {
            return;
        }
        if (!(field398 < 100 || field418 == 1) || field398 >= 400) {
            class12.method2783(31, "", class158.field2484);
            return;
        }
        String var2 = class165.method667(arg0, Statics.field552);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < field398; var3++) {
            class8 var4 = field396[var3];
            String var5 = class165.method667(var4.field141, Statics.field552);
            if (var5 != null && var5.equals(var2)) {
                class12.method2783(31, "", arg0 + class158.field2524);
                return;
            }
            if (var4.field138 != null) {
                String var6 = class165.method667(var4.field138, Statics.field552);
                if (var6 != null && var6.equals(var2)) {
                    class12.method2783(31, "", arg0 + class158.field2524);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < field562; var7++) {
            class18 var8 = field564[var7];
            String var9 = class165.method667(var8.field262, Statics.field552);
            if (var9 != null && var9.equals(var2)) {
                class12.method2783(31, "", class158.field2473 + arg0 + class158.field2474);
                return;
            }
            if (var8.field263 != null) {
                String var10 = class165.method667(var8.field263, Statics.field552);
                if (var10 != null && var10.equals(var2)) {
                    class12.method2783(31, "", class158.field2473 + arg0 + class158.field2474);
                    return;
                }
            }
        }
        if (class165.method667(Statics.field94.field59, Statics.field552).equals(var2)) {
            class12.method2783(31, "", class158.field2470);
        } else {
            field339.method2722(158);
            field339.method2452(class120.method2241(arg0));
            field339.method2543(arg0);
        }
    }

    @ObfuscatedName("m.da(Ljava/lang/String;B)V")
    public static final void method157(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method667(arg0, Statics.field552);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field562; var2++) {
            class18 var3 = field564[var2];
            String var4 = var3.field262;
            String var5 = class165.method667(var4, Statics.field552);
            if (class130.method3054(arg0, var1, var4, var5)) {
                field562--;
                for (int var6 = var2; var6 < field562; var6++) {
                    field564[var6] = field564[var6 + 1];
                }
                field487 = field478;
                field339.method2722(59);
                field339.method2452(class120.method2241(arg0));
                field339.method2543(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("cl.dt(Ljava/lang/String;I)V")
    public static final void method2232(String arg0) {
        if (arg0 == null) {
            return;
        }
        String var1 = class165.method667(arg0, Statics.field552);
        if (var1 == null) {
            return;
        }
        for (int var2 = 0; var2 < field398; var2++) {
            class8 var3 = field396[var2];
            String var4 = var3.field141;
            String var5 = class165.method667(var4, Statics.field552);
            if (class130.method3054(arg0, var1, var4, var5)) {
                field398--;
                for (int var6 = var2; var6 < field398; var6++) {
                    field396[var6] = field396[var6 + 1];
                }
                field487 = field478;
                field339.method2722(28);
                field339.method2452(class120.method2241(arg0));
                field339.method2543(arg0);
                break;
            }
        }
    }

    @ObfuscatedName("at.eh(Ljava/lang/String;II)V")
    public static final void method831(String arg0, int arg1) {
        field339.method2722(114);
        field339.method2452(class120.method2241(arg0) + 1);
        field339.method2543(arg0);
        field339.method2487(arg1);
    }

    @ObfuscatedName("r.ee(Ljava/lang/String;I)V")
    public static final void method133(String arg0) {
        if (Statics.field1227 != null) {
            field339.method2722(185);
            field339.method2452(class120.method2241(arg0));
            field339.method2543(arg0);
        }
    }

    @ObfuscatedName("b.ep(Ljava/lang/String;B)V")
    public static final void method651(String arg0) {
        if (!arg0.equals("")) {
            field339.method2722(83);
            field339.method2452(class120.method2241(arg0));
            field339.method2543(arg0);
        }
    }

    @ObfuscatedName("gx.ei(II)V")
    public static void method3568(int arg0) {
        for (class202 var1 = (class202) field496.method3610(); var1 != null; var1 = (class202) field496.method3606()) {
            if ((var1.field3126 >> 48 & 0xFFFFL) == (long) arg0) {
                var1.method3737();
            }
        }
    }

    @ObfuscatedName("al.ec(Lfa;I)I")
    public static int method765(class174 arg0) {
        class202 var1 = (class202) field496.method3607(((long) arg0.field2843 << 32) + (long) arg0.field2760);
        return var1 == null ? arg0.field2831 : var1.field3111;
    }

    @ObfuscatedName("y.eb(Lfa;I)Lfa;")
    public static class174 method53(class174 arg0) {
        int var1 = class179.method2832(method765(arg0));
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class174.method636(arg0.field2778);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @ObfuscatedName("hg.ek(Lfa;I)Z")
    public static boolean method3804(class174 arg0) {
        if (field463) {
            if (method765(arg0) != 0) {
                return false;
            }
            if (arg0.field2825 == 0) {
                return false;
            }
        }
        return arg0.field2779;
    }

    @ObfuscatedName("az.er(Lfa;II)Ljava/lang/String;")
    public static String method793(class174 arg0, int arg1) {
        int var2 = method765(arg0);
        boolean var3 = (var2 >> arg1 + 1 & 0x1) != 0;
        if (!var3 && arg0.field2807 == null) {
            return null;
        } else if (arg0.field2833 == null || arg0.field2833.length <= arg1 || arg0.field2833[arg1] == null || arg0.field2833[arg1].trim().length() == 0) {
            return null;
        } else {
            return arg0.field2833[arg1];
        }
    }

    @ObfuscatedName("cq.ez(Lfa;B)Ljava/lang/String;")
    public static String method2134(class174 arg0) {
        if (class179.method2141(method765(arg0)) == 0) {
            return null;
        } else if (arg0.field2819 == null || arg0.field2819.trim().length() == 0) {
            return null;
        } else {
            return arg0.field2819;
        }
    }

    @ObfuscatedName("g.eo(Ljava/lang/String;ZI)Ljava/lang/String;")
    public static String method213(String arg0, boolean arg1) {
        String var2 = arg1 ? "https://" : "http://";
        if (field353 == 1) {
            arg0 = arg0 + "-wtrc";
        } else if (field353 == 2) {
            arg0 = arg0 + "-wtqa";
        } else if (field353 == 3) {
            arg0 = arg0 + "-wtwip";
        } else if (field353 == 5) {
            arg0 = arg0 + "-wti";
        } else if (field353 == 4) {
            arg0 = "local";
        }
        String var3 = "";
        if (Statics.field221 != null) {
            var3 = "/p=" + Statics.field221;
        }
        String var4 = "runescape.com";
        return var2 + arg0 + "." + var4 + "/l=" + field373 + "/a=" + Statics.field612 + var3 + "/";
    }

    @ObfuscatedName("h.ea(Ljava/lang/String;I)V")
    public static void method254(String arg0) {
        Statics.field221 = arg0;
        try {
            String var1 = Statics.field295.getParameter(class191.field3061.field3076);
            String var2 = Statics.field295.getParameter(class191.field3070.field3076);
            String var3 = var1 + "settings=" + arg0 + "; version=1; path=/; domain=" + var2;
            String var4;
            if (arg0.length() == 0) {
                var4 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var4 = var3 + "; Expires=" + class112.method2406(class116.method2781() + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            client var5 = Statics.field295;
            String var6 = "document.cookie=\"" + var4 + "\"";
            JSObject.getWindow(var5).eval(var6);
        } catch (Throwable var8) {
        }
    }

    @ObfuscatedName("ay.ex(Ljava/lang/String;ZI)V")
    public static void method734(String arg0, boolean arg1) {
        String var2 = arg0.toLowerCase();
        short[] var3 = new short[16];
        int var4 = 0;
        for (int var5 = 0; var5 < Statics.field1119; var5++) {
            class52 var6 = class52.method176(var5);
            if ((!arg1 || var6.field1167) && var6.field1157 == -1 && var6.field1126.toLowerCase().indexOf(var2) != -1) {
                if (var4 >= 250) {
                    Statics.field211 = -1;
                    Statics.field717 = null;
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
        Statics.field717 = var3;
        Statics.field1035 = 0;
        Statics.field211 = var4;
        String[] var9 = new String[Statics.field211];
        for (int var10 = 0; var10 < Statics.field211; var10++) {
            var9[var10] = class52.method176(var3[var10]).field1126;
        }
        class125.method2135(var9, Statics.field717);
    }
}
